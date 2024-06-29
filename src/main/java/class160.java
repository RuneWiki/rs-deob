import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class160 {

    @OriginalMember(owner = "client!ok", name = "k", descriptor = "Lrp;")
    private class288 field2520 = new class288(64);

    @OriginalMember(owner = "client!ok", name = "p", descriptor = "Lrp;")
    public class288 field2525 = new class288(64);

    @OriginalMember(owner = "client!ok", name = "g", descriptor = "Llt;")
    private class458 field2516;

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "Llt;")
    public class458 field2514;

    @OriginalMember(owner = "client!ok", name = "n", descriptor = "Lip;")
    public static class479 field2523;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "I")
    public static int field2510;

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "I")
    public static int field2511;

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "I")
    public static int field2512;

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "I")
    public static int field2513;

    @OriginalMember(owner = "client!ok", name = "f", descriptor = "I")
    public static int field2515;

    @OriginalMember(owner = "client!ok", name = "h", descriptor = "I")
    public static int field2517;

    @OriginalMember(owner = "client!ok", name = "i", descriptor = "I")
    public static int field2518;

    @OriginalMember(owner = "client!ok", name = "j", descriptor = "I")
    public static int field2519;

    @OriginalMember(owner = "client!ok", name = "l", descriptor = "I")
    public static int field2521;

    @OriginalMember(owner = "client!ok", name = "m", descriptor = "I")
    public static int field2522;

    @OriginalMember(owner = "client!ok", name = "o", descriptor = "I")
    public static int field2524;

    static {
        new class423("Error joining clan channel - please try again later!", "Fehler beim Betreten des Chatraums - bitte versuch es später erneut.", "Erreur lors de la connexion au canal de clan - veuillez réessayer ultérieurement.", "Erro ao entrar no canal do clã. Tente de novo depois!");
        field2523 = new class479();
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lha;IZ)Ljava/lang/String;", line = 4)
    public static final String method1024(class40 arg0, int arg1, boolean arg2) {
        field2515++;
        try {
            int var3 = arg0.method236(true);
            if (arg1 < var3) {
                var3 = arg1;
            }
            byte[] var4 = new byte[var3];
            arg0.field585 += class437.field6434.method128(arg0.field585, var4, arg2, var3, 0, arg0.field536);
            return class358.method2187(var3, (byte) 63, var4, 0);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(B)Z", line = 30)
    public static final boolean method1025(byte arg0) throws IOException {
        field2512++;
        if (class163.field2534 == null) {
            return false;
        }
        int var1 = class163.field2534.method1789(27683);
        if (var1 == 0) {
            return false;
        }
        if (class374.field5459 == null) {
            if (class69.field1203) {
                var1--;
                class163.field2534.method1788(-13205, 0, class491.field7457.field536, 1);
                class51.field779++;
                class69.field1203 = false;
            }
            class491.field7457.field585 = 0;
            if (class491.field7457.method2369((byte) 58)) {
                if (var1 == 0) {
                    return false;
                }
                class163.field2534.method1788(-13205, 1, class491.field7457.field536, 1);
                var1--;
                class51.field779++;
            }
            class69.field1203 = true;
            class127[] var2 = class114.method812((byte) 61);
            int var3 = class491.field7457.method2363(-64);
            if (var3 < 0 || var2.length <= var3) {
                throw new IOException("invo:" + var3 + " ip:" + class491.field7457.field585);
            }
            class374.field5459 = var2[var3];
            class60.field1014 = class374.field5459.field2054;
        }
        if (class60.field1014 == -1) {
            if (var1 <= 0) {
                return false;
            }
            class163.field2534.method1788(-13205, 0, class491.field7457.field536, 1);
            class60.field1014 = class491.field7457.field536[0] & 0xFF;
            var1--;
            class51.field779++;
        }
        if (class60.field1014 == -2) {
            if (var1 <= 1) {
                return false;
            }
            class163.field2534.method1788(-13205, 0, class491.field7457.field536, 2);
            class491.field7457.field585 = 0;
            class60.field1014 = class491.field7457.method254((byte) -33);
            var1 -= 2;
            class51.field779 += 2;
        }
        if (var1 < class60.field1014) {
            return false;
        }
        class491.field7457.field585 = 0;
        class163.field2534.method1788(-13205, 0, class491.field7457.field536, class60.field1014);
        class51.field779 += class60.field1014;
        class54.field827 = 0;
        class461.field7090 = class257.field3918;
        class257.field3918 = class348.field5138;
        class348.field5138 = class374.field5459;
        if (class411.field5961 == class374.field5459) {
            class381.method2286(class291.field4437, false);
            class374.field5459 = null;
            return true;
        } else if (class434.field6368 == class374.field5459) {
            class57.field975 = class491.field7457.method257((byte) 98);
            class374.field5459 = null;
            return true;
        } else if (class481.field7338 == class374.field5459) {
            int var4 = class491.field7457.method243(-69);
            int var5 = class491.field7457.method270((byte) -54);
            class273.field4144.method1616(var5, var4, 111);
            class374.field5459 = null;
            return true;
        } else if (class54.field815 == class374.field5459) {
            boolean var6 = class491.field7457.method257((byte) 33) == 1;
            String var7 = class491.field7457.method239(true);
            String var8 = var7;
            if (var6) {
                var8 = class491.field7457.method239(true);
            }
            long var9 = class491.field7457.method265((byte) -88);
            long var11 = (long) class491.field7457.method254((byte) -101);
            long var13 = (long) class491.field7457.method224(-2);
            int var15 = class491.field7457.method257((byte) 94);
            long var16 = (var11 << 32) + var13;
            boolean var18 = false;
            int var19 = 0;
            while (true) {
                if (var19 >= 100) {
                    if (var15 <= 1) {
                        if (!(!class396.field5784 || class32.field419) || class75.field1352) {
                            var18 = true;
                        } else if (class237.method1423(var8, 0)) {
                            var18 = true;
                        }
                    }
                    break;
                }
                if (class223.field3443[var19] == var16) {
                    var18 = true;
                    break;
                }
                var19++;
            }
            if (!var18 && class455.field6977 == 0) {
                class223.field3443[class158.field2490] = var16;
                class158.field2490 = (class158.field2490 + 1) % 100;
                String var20 = class435.method2540(class174.method1093((byte) -109, class491.field7457), 0);
                if (var15 == 2 || var15 == 3) {
                    class96.method733(var20, (byte) -4, -1, class38.method213(0, var9), "<img=1>" + var8, 0, 9, "<img=1>" + var7);
                } else if (var15 == 1) {
                    class96.method733(var20, (byte) -4, -1, class38.method213(0, var9), "<img=0>" + var8, 0, 9, "<img=0>" + var7);
                } else {
                    class96.method733(var20, (byte) -4, -1, class38.method213(0, var9), var8, 0, 9, var7);
                }
            }
            class374.field5459 = null;
            return true;
        } else if (class83.field1415 == class374.field5459) {
            int var21 = class491.field7457.method254((byte) -70);
            int var22 = class491.field7457.method247((byte) 0);
            int var23 = class491.field7457.method275((byte) -126);
            if (class149.method970(var21, 1)) {
                class480.method2904(77, var23, var22);
            }
            class374.field5459 = null;
            return true;
        } else if (class374.field5459 == class302.field4561) {
            class47.method332((byte) -125);
            class374.field5459 = null;
            return true;
        } else if (class374.field5459 == class328.field4920) {
            class381.method2286(class33.field453, false);
            class374.field5459 = null;
            return true;
        } else if (class374.field5459 == class19.field252) {
            class14.field196 = class60.field1014 > 2 ? class491.field7457.method239(true) : class121.field2009.method2473(class406.field5898, -108);
            class97.field1744 = class60.field1014 > 0 ? class491.field7457.method254((byte) -92) : -1;
            if (class97.field1744 == 65535) {
                class97.field1744 = -1;
            }
            class374.field5459 = null;
            return true;
        } else if (class374.field5459 == class132.field2094) {
            int var24 = class491.field7457.method254((byte) -122);
            int var25 = class491.field7457.method277(true);
            int var26 = class491.field7457.method243(-74);
            class249 var27 = class195.field3085[var24];
            if (var27 != null) {
                class345.method2113(var26, 0, var27, var25);
            }
            class374.field5459 = null;
            return true;
        } else if (class374.field5459 == class247.field3799) {
            boolean var28 = class491.field7457.method257((byte) 113) == 1;
            String var29 = class491.field7457.method239(true);
            String var30 = var29;
            if (var28) {
                var30 = class491.field7457.method239(true);
            }
            int var31 = class491.field7457.method257((byte) 72);
            boolean var32 = false;
            if (var31 <= 1) {
                if (!(!class396.field5784 || class32.field419) || class75.field1352) {
                    var32 = true;
                } else if (var31 <= 1 && class237.method1423(var30, 0)) {
                    var32 = true;
                }
            }
            if (!var32 && class455.field6977 == 0) {
                String var33 = class435.method2540(class174.method1093((byte) -109, class491.field7457), 0);
                if (var31 == 2) {
                    class96.method733(var33, (byte) -4, -1, null, "<img=1>" + var30, 0, 24, "<img=1>" + var29);
                } else if (var31 == 1) {
                    class96.method733(var33, (byte) -4, -1, null, "<img=0>" + var30, 0, 24, "<img=0>" + var29);
                } else {
                    class96.method733(var33, (byte) -4, -1, null, var30, 0, 24, var29);
                }
            }
            class374.field5459 = null;
            return true;
        } else if (class374.field5459 == class153.field2442) {
            int var34 = class491.field7457.method255((byte) 96);
            int var35 = class491.field7457.method247((byte) 0);
            int var36 = class491.field7457.method272(-123);
            if (var36 == 65535) {
                var36 = -1;
            }
            if (class149.method970(var35, 1)) {
                class262.method1589(var36, var34, (byte) -39);
            }
            class374.field5459 = null;
            return true;
        } else if (class439.field6447 == class374.field5459) {
            String var37 = class491.field7457.method239(true);
            int var38 = class491.field7457.method272(125);
            int var39 = class491.field7457.method243(-80);
            if (class149.method970(var39, 1)) {
                class374.method2252(2, var37, var38);
            }
            class374.field5459 = null;
            return true;
        } else if (class374.field5459 == class234.field3556) {
            class381.method2286(class15.field219, false);
            class374.field5459 = null;
            return true;
        } else if (class374.field5459 == class13.field147) {
            int var40 = class491.field7457.method277(true);
            int var41 = var40 >> 2;
            int var42 = var40 & 0x3;
            int var43 = class369.field5422[var41];
            int var44 = class491.field7457.method255((byte) 96);
            int var45 = (var44 & 0x373D88AE) >> 28;
            int var46 = var44 >> 14 & 0x3FFF;
            int var47 = var44 & 0x3FFF;
            int var48 = class491.field7457.method254((byte) -79);
            if (var48 == 65535) {
                var48 = -1;
            }
            int var49 = var46 - class381.field5550;
            int var50 = var47 - class320.field4827;
            class323.method2013(var41, var45, 1, var42, var43, var49, var48, var50);
            class374.field5459 = null;
            return true;
        } else if (class374.field5459 == class214.field3314) {
            class381.method2286(class448.field6904, false);
            class374.field5459 = null;
            return true;
        } else if (class98.field1782 == class374.field5459) {
            int var51 = class491.field7457.method275((byte) -124);
            int var52 = class491.field7457.method243(119);
            class273.field4144.method1624((byte) -121, var52, var51);
            class374.field5459 = null;
            return true;
        } else if (class46.field668 == class374.field5459) {
            class42.method295(false, -25608);
            class374.field5459 = null;
            return true;
        } else if (class389.field5665 == class374.field5459) {
            int var53 = class491.field7457.method275((byte) -128);
            int var54 = class491.field7457.method254((byte) -44);
            int var55 = class491.field7457.method254((byte) -92);
            if (class149.method970(var54, 1)) {
                class369.method2237((byte) -67, var55, var53);
            }
            class374.field5459 = null;
            return true;
        } else if (class374.field5459 == class24.field319) {
            int var56 = class491.field7457.method247((byte) 0);
            int var57 = class491.field7457.method255((byte) 96);
            int var58 = class491.field7457.method272(-81);
            if (class149.method970(var56, 1)) {
                class24.method127(var57, var58, true);
            }
            class374.field5459 = null;
            return true;
        } else if (class374.field5459 == class326.field4904) {
            int var59 = class491.field7457.method272(27);
            int var60 = class491.field7457.method277(true);
            int var61 = class491.field7457.method272(-51);
            int var62 = class491.field7457.method238(48);
            if (class149.method970(var61, 1)) {
                class394 var63 = (class394) class245.field3741.method2409(false, (long) var62);
                if (var63 != null) {
                    class217.method1332(false, var63.field5750 != var59, var63, -10879);
                }
                class317.method1885(var62, var59, -2406, var60, false);
            }
            class374.field5459 = null;
            return true;
        } else if (class374.field5459 == class197.field3105) {
            int var64 = class491.field7457.method254((byte) -114);
            int var65 = class491.field7457.method257((byte) 37);
            int var66 = class491.field7457.method257((byte) 38);
            int var67 = class491.field7457.method254((byte) -79) << 0;
            int var68 = class491.field7457.method257((byte) 86);
            int var69 = class491.field7457.method257((byte) 100);
            if (class149.method970(var64, 1)) {
                class327.method2037(var68, var67, var69, var65, 0, var66);
            }
            class374.field5459 = null;
            return true;
        } else if (class374.field5459 == class298.field4521) {
            int var70 = class491.field7457.method275((byte) -126);
            int var71 = class491.field7457.method272(127);
            int var72 = class491.field7457.method243(-43);
            int var73 = class491.field7457.method243(8);
            int var74 = class491.field7457.method257((byte) 110);
            boolean var75 = (var74 & 0x80) != 0;
            if ((var70 >> 30) != 0) {
                int var106 = var70 >> 28 & 0x3;
                int var107 = ((var70 & 0xFFFE523) >> 14) - class381.field5550;
                int var108 = (var70 & 0x3FFF) - class320.field4827;
                if (var107 >= 0 && var108 >= 0 && class150.field2422 > var107 && var108 < class21.field272) {
                    int var109 = var107 * 128 + 64;
                    int var110 = var108 * 128 + 64;
                    int var111 = var106;
                    if (var106 < 3 && class426.method2502(var107, var108, (byte) 110)) {
                        var111 = var106 + 1;
                    }
                    class378 var112 = new class378(var73, 0, class369.field5424, var106, var111, var109, class7.method38(var109, var106, var110, (byte) -54) - var72, var110, var107, var107, var108, var108, var74);
                    class480.field7334.method4(1, new class216(var112));
                }
            } else if (var70 >> 29 != 0) {
                int var91 = var70 & 0xFFFF;
                class249 var92 = class195.field3085[var91];
                if (var92 != null) {
                    if (var73 == 65535) {
                        var73 = -1;
                    }
                    boolean var93 = true;
                    int var94 = var75 ? var92.field2170 : var92.field2172;
                    if (var73 != -1 && var94 != -1) {
                        if (var73 == var94) {
                            class29 var99 = class201.field3192.method1250(var73, -17);
                            if (var99.field382 && var99.field373 != -1) {
                                class87 var100 = class429.field6302.method106(-117, var99.field373);
                                int var101 = var100.field1503;
                                if (var101 == 0 || var101 == 2) {
                                    var93 = false;
                                } else if (var101 == 1) {
                                    var93 = true;
                                }
                            }
                        } else {
                            class29 var95 = class201.field3192.method1250(var73, 80);
                            class29 var96 = class201.field3192.method1250(var94, -44);
                            if (var95.field373 != -1 && var96.field373 != -1) {
                                class87 var97 = class429.field6302.method106(-97, var95.field373);
                                class87 var98 = class429.field6302.method106(-113, var96.field373);
                                if (var97.field1527 < var98.field1527) {
                                    var93 = false;
                                }
                            }
                        }
                    }
                    if (var93) {
                        if (var75) {
                            var92.field2170 = var73;
                            var92.field2176 = 0;
                            var92.field2169 = var72;
                            var92.field2163 = var74 & 0x7;
                            var92.field2137 = 0;
                            var92.field2165 = 1;
                            var92.field2168 = class369.field5424 + var71;
                            if (class369.field5424 < var92.field2168) {
                                var92.field2137 = -1;
                            }
                            if (var92.field2170 != -1 && class369.field5424 == var92.field2168) {
                                int var102 = class201.field3192.method1250(var92.field2170, -62).field373;
                                if (var102 != -1) {
                                    class87 var103 = class429.field6302.method106(-97, var102);
                                    if (var103 != null && var103.field1512 != null) {
                                        class70.method516(var103, var92.field3217, 0, false, var92.field3218, var92.field3222, (byte) -79);
                                    }
                                }
                            }
                        } else {
                            var92.field2218 = class369.field5424 + var71;
                            var92.field2172 = var73;
                            var92.field2207 = 1;
                            var92.field2225 = var72;
                            var92.field2180 = 0;
                            var92.field2178 = var74 & 0x7;
                            var92.field2187 = 0;
                            if (var92.field2218 > class369.field5424) {
                                var92.field2180 = -1;
                            }
                            if (var92.field2172 != -1 && class369.field5424 == var92.field2218) {
                                int var104 = class201.field3192.method1250(var92.field2172, 108).field373;
                                if (var104 != -1) {
                                    class87 var105 = class429.field6302.method106(-107, var104);
                                    if (var105 != null && var105.field1512 != null) {
                                        class70.method516(var105, var92.field3217, 0, false, var92.field3218, var92.field3222, (byte) -79);
                                    }
                                }
                            }
                        }
                    }
                }
            } else if (var70 >> 28 != 0) {
                int var76 = var70 & 0xFFFF;
                class47 var77;
                if (class507.field7667 == var76) {
                    var77 = class286.field4329;
                } else {
                    var77 = class224.field3450[var76];
                }
                if (var77 != null) {
                    if (var73 == 65535) {
                        var73 = -1;
                    }
                    boolean var78 = true;
                    int var79 = var75 ? var77.field2170 : var77.field2172;
                    if (var73 != -1 && var79 != -1) {
                        if (var73 == var79) {
                            class29 var80 = class201.field3192.method1250(var73, 75);
                            if (var80.field382 && var80.field373 != -1) {
                                class87 var81 = class429.field6302.method106(-86, var80.field373);
                                int var82 = var81.field1503;
                                if (var82 == 0 || var82 == 2) {
                                    var78 = false;
                                } else if (var82 == 1) {
                                    var78 = true;
                                }
                            }
                        } else {
                            class29 var83 = class201.field3192.method1250(var73, -30);
                            class29 var84 = class201.field3192.method1250(var79, 95);
                            if (var83.field373 != -1 && var84.field373 != -1) {
                                class87 var85 = class429.field6302.method106(-121, var83.field373);
                                class87 var86 = class429.field6302.method106(-96, var84.field373);
                                if (var86.field1527 > var85.field1527) {
                                    var78 = false;
                                }
                            }
                        }
                    }
                    if (var78) {
                        if (var75) {
                            var77.field2169 = var72;
                            var77.field2170 = var73;
                            var77.field2168 = class369.field5424 + var71;
                            var77.field2163 = var74 & 0x7;
                            var77.field2176 = 0;
                            var77.field2137 = 0;
                            var77.field2165 = 1;
                            if (var77.field2168 > class369.field5424) {
                                var77.field2137 = -1;
                            }
                            if (var77.field2170 == 65535) {
                                var77.field2170 = -1;
                            }
                            if (var77.field2170 != -1 && class369.field5424 == var77.field2168) {
                                int var87 = class201.field3192.method1250(var77.field2170, 120).field373;
                                if (var87 != -1) {
                                    class87 var88 = class429.field6302.method106(-88, var87);
                                    if (var88 != null && var88.field1512 != null) {
                                        class70.method516(var88, var77.field3217, 0, class286.field4329 == var77, var77.field3218, var77.field3222, (byte) -79);
                                    }
                                }
                            }
                        } else {
                            var77.field2187 = 0;
                            var77.field2218 = class369.field5424 + var71;
                            var77.field2180 = 0;
                            var77.field2207 = 1;
                            var77.field2178 = var74 & 0x7;
                            var77.field2225 = var72;
                            var77.field2172 = var73;
                            if (var77.field2172 == 65535) {
                                var77.field2172 = -1;
                            }
                            if (var77.field2218 > class369.field5424) {
                                var77.field2180 = -1;
                            }
                            if (var77.field2172 != -1 && class369.field5424 == var77.field2218) {
                                int var89 = class201.field3192.method1250(var77.field2172, 94).field373;
                                if (var89 != -1) {
                                    class87 var90 = class429.field6302.method106(-118, var89);
                                    if (var90 != null && var90.field1512 != null) {
                                        class70.method516(var90, var77.field3217, 0, class286.field4329 == var77, var77.field3218, var77.field3222, (byte) -79);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            class374.field5459 = null;
            return true;
        } else if (class374.field5459 == class289.field4380) {
            int var113 = class491.field7457.method270((byte) -54);
            int var114 = class491.field7457.method272(124);
            int var115 = class491.field7457.method255((byte) 96);
            int var116 = class491.field7457.method254((byte) -81);
            if (var116 == 65535) {
                var116 = -1;
            }
            if (class149.method970(var114, 1)) {
                class421.method2462(var115, var113, 9, var116);
                class182 var117 = class288.field4362.method3030((byte) 116, var116);
                class503.method3014(var117.field2871, var113, var117.field2903, 65535, var117.field2905);
                class58.method411(true, var117.field2894, var117.field2867, var117.field2827, var113);
            }
            class374.field5459 = null;
            return true;
        } else if (class436.field6418 == class374.field5459) {
            int var118 = class491.field7457.method254((byte) -61);
            int var119 = class491.field7457.method257((byte) 60);
            int var120 = class491.field7457.method257((byte) 76);
            int var121 = class491.field7457.method254((byte) -58) << 0;
            int var122 = class491.field7457.method257((byte) 80);
            int var123 = class491.field7457.method257((byte) 50);
            if (class149.method970(var118, 1)) {
                class256.method1533(var121, var120, (byte) -114, var122, true, var119, var123);
            }
            class374.field5459 = null;
            return true;
        } else if (class507.field7666 == class374.field5459) {
            class247.field3800 = class196.method1221(2, class491.field7457.method257((byte) 31));
            class374.field5459 = null;
            return true;
        } else if (class374.field5459 == class174.field2714) {
            class49.method348((byte) -86, class491.field7457.method239(true));
            class374.field5459 = null;
            return true;
        } else if (class374.field5459 == class175.field2742) {
            class284.field4304 = class491.field7457.method257((byte) 53);
            class374.field5459 = null;
            class27.field352 = class298.field4515;
            return true;
        } else if (class374.field5459 == class208.field3257) {
            int var124 = class491.field7457.method232((byte) 110);
            int var125 = class491.field7457.method272(-88);
            if (class149.method970(var125, 1)) {
                class67.field1096 = var124;
            }
            class374.field5459 = null;
            return true;
        } else {
            if (arg0 <= 64) {
                field2517 = 60;
            }
            if (class413.field5982 == class374.field5459) {
                if (class375.field5475 != -1) {
                    class141.method933(255, 0, class375.field5475);
                }
                class374.field5459 = null;
                return true;
            } else if (class476.field7267 == class374.field5459) {
                int var126 = class491.field7457.method236(true);
                int var127 = class491.field7457.method255((byte) 96);
                int var128 = class491.field7457.method257((byte) 124);
                String var129 = "";
                String var130 = var129;
                if ((var128 & 0x1) != 0) {
                    var129 = class491.field7457.method239(true);
                    if ((var128 & 0x2) == 0) {
                        var130 = var129;
                    } else {
                        var130 = class491.field7457.method239(true);
                    }
                }
                String var131 = class491.field7457.method239(true);
                if (var126 == 99) {
                    class404.method2396(var131, 10);
                } else if (var130.equals("") || !class237.method1423(var130, 0)) {
                    class150.method976(var131, var126, var130, var127, var129, (byte) -113);
                } else {
                    class374.field5459 = null;
                    return true;
                }
                class374.field5459 = null;
                return true;
            } else if (class374.field5459 == class266.field4029) {
                class222.method1351(class7.field86, class60.field1014, class491.field7457, 0);
                class374.field5459 = null;
                return true;
            } else if (class506.field7637 == class374.field5459) {
                int var132 = class491.field7457.method254((byte) -58);
                int var133 = class491.field7457.method254((byte) -52);
                int var134 = class491.field7457.method254((byte) -79);
                int var135 = class491.field7457.method254((byte) -56);
                if (class149.method970(var132, 1) && class409.field5933[var133] != null) {
                    for (int var136 = var134; var136 < var135; var136++) {
                        int var137 = class491.field7457.method224(-2);
                        if (class409.field5933[var133].length > var136 && class409.field5933[var133][var136] != null) {
                            class409.field5933[var133][var136].field6268 = var137;
                        }
                    }
                }
                class374.field5459 = null;
                return true;
            } else if (class374.field5459 == class16.field225) {
                int var138 = class491.field7457.method257((byte) 126);
                int var139 = var138 >> 5;
                int var140 = var138 & 0x1F;
                if (var140 == 0) {
                    class228.field3487[var139] = null;
                    class374.field5459 = null;
                    return true;
                }
                class97 var141 = new class97();
                var141.field1745 = var140;
                var141.field1755 = class491.field7457.method257((byte) 120);
                if (var141.field1755 >= 0 && var141.field1755 < class512.field7766.length) {
                    if (var141.field1745 == 1 || var141.field1745 == 10) {
                        var141.field1747 = class491.field7457.method254((byte) -114);
                        class491.field7457.field585 += 6;
                    } else if (var141.field1745 >= 2 && var141.field1745 <= 6) {
                        if (var141.field1745 == 2) {
                            var141.field1749 = 64;
                            var141.field1753 = 64;
                        }
                        if (var141.field1745 == 3) {
                            var141.field1753 = 0;
                            var141.field1749 = 64;
                        }
                        if (var141.field1745 == 4) {
                            var141.field1753 = 128;
                            var141.field1749 = 64;
                        }
                        if (var141.field1745 == 5) {
                            var141.field1753 = 64;
                            var141.field1749 = 0;
                        }
                        if (var141.field1745 == 6) {
                            var141.field1749 = 128;
                            var141.field1753 = 64;
                        }
                        var141.field1745 = 2;
                        var141.field1750 = class491.field7457.method257((byte) 61);
                        var141.field1753 += class491.field7457.method254((byte) -110) - class381.field5550 << 7;
                        var141.field1749 += class491.field7457.method254((byte) -52) - class320.field4827 << 7;
                        var141.field1751 = class491.field7457.method257((byte) 125);
                        var141.field1752 = class491.field7457.method254((byte) -55);
                    }
                    var141.field1746 = class491.field7457.method254((byte) -73);
                    if (var141.field1746 == 65535) {
                        var141.field1746 = -1;
                    }
                    class228.field3487[var139] = var141;
                }
                class374.field5459 = null;
                return true;
            } else if (class374.field5459 == class14.field195) {
                class381.method2286(class93.field1661, false);
                class374.field5459 = null;
                return true;
            } else if (class55.field847 == class374.field5459) {
                class381.method2286(class370.field5437, false);
                class374.field5459 = null;
                return true;
            } else if (class52.field794 == class374.field5459) {
                boolean var142 = class491.field7457.method257((byte) 103) == 1;
                String var143 = class491.field7457.method239(true);
                String var144 = var143;
                if (var142) {
                    var144 = class491.field7457.method239(true);
                }
                long var145 = (long) class491.field7457.method254((byte) -39);
                long var147 = (long) class491.field7457.method224(-2);
                int var149 = class491.field7457.method257((byte) 70);
                int var150 = class491.field7457.method254((byte) -100);
                long var151 = (var145 << 32) + var147;
                boolean var153 = false;
                int var154 = 0;
                while (true) {
                    if (var154 >= 100) {
                        if (var149 <= 1 && class237.method1423(var144, 0)) {
                            var153 = true;
                        }
                        break;
                    }
                    if (class223.field3443[var154] == var151) {
                        var153 = true;
                        break;
                    }
                    var154++;
                }
                if (!var153 && class455.field6977 == 0) {
                    class223.field3443[class158.field2490] = var151;
                    class158.field2490 = (class158.field2490 + 1) % 100;
                    String var155 = class47.field721.method1063(0, var150).method2840(class491.field7457, -1);
                    if (var149 == 2) {
                        class96.method733(var155, (byte) -4, var150, null, "<img=1>" + var144, 0, 18, "<img=1>" + var143);
                    } else if (var149 == 1) {
                        class96.method733(var155, (byte) -4, var150, null, "<img=0>" + var144, 0, 18, "<img=0>" + var143);
                    } else {
                        class96.method733(var155, (byte) -4, var150, null, var144, 0, 18, var143);
                    }
                }
                class374.field5459 = null;
                return true;
            } else if (class481.field7348 == class374.field5459) {
                int var156 = class491.field7457.method254((byte) -104);
                if (var156 == 65535) {
                    var156 = -1;
                }
                int var157 = class491.field7457.method277(true);
                int var158 = class491.field7457.method257((byte) 49);
                class228.method1374(15, var158, var156, var157);
                class374.field5459 = null;
                return true;
            } else if (class463.field7111 == class374.field5459) {
                int var159 = class491.field7457.method254((byte) -55);
                if (var159 == 65535) {
                    var159 = -1;
                }
                int var160 = class491.field7457.method257((byte) 105);
                int var161 = class491.field7457.method244(255);
                class41.method285(var161, var159, -5417, var160);
                class374.field5459 = null;
                return true;
            } else if (class374.field5459 == class19.field250) {
                int var162 = class491.field7457.method270((byte) -54);
                int var163 = class491.field7457.method254((byte) -126);
                if (var163 == 65535) {
                    var163 = -1;
                }
                int var164 = class491.field7457.method247((byte) 0);
                int var165 = class491.field7457.method243(124);
                int var166 = class491.field7457.method243(-100);
                if (var166 == 65535) {
                    var166 = -1;
                }
                if (class149.method970(var165, 1)) {
                    for (int var167 = var163; var167 <= var166; var167++) {
                        long var168 = ((long) var162 << 32) + (long) var167;
                        class54 var170 = (class54) class437.field6439.method2409(false, var168);
                        class54 var171;
                        if (var170 != null) {
                            var171 = new class54(var170.field823, var164);
                            var170.method1121(false);
                        } else if (var167 == -1) {
                            var171 = new class54(class413.method2435(160291920, var162).field6281.field823, var164);
                        } else {
                            var171 = new class54(0, var164);
                        }
                        class437.field6439.method2413(var168, -1, var171);
                    }
                }
                class374.field5459 = null;
                return true;
            } else if (class374.field5459 == class373.field5452) {
                boolean var172 = class491.field7457.method257((byte) 68) == 1;
                String var173 = class491.field7457.method239(true);
                String var174 = var173;
                if (var172) {
                    var174 = class491.field7457.method239(true);
                }
                long var175 = (long) class491.field7457.method254((byte) -88);
                long var177 = (long) class491.field7457.method224(-2);
                int var179 = class491.field7457.method257((byte) 70);
                long var180 = (var175 << 32) + var177;
                boolean var182 = false;
                int var183 = 0;
                while (true) {
                    if (var183 >= 100) {
                        if (var179 <= 1) {
                            if (!(!class396.field5784 || class32.field419) || class75.field1352) {
                                var182 = true;
                            } else if (class237.method1423(var174, 0)) {
                                var182 = true;
                            }
                        }
                        break;
                    }
                    if (class223.field3443[var183] == var180) {
                        var182 = true;
                        break;
                    }
                    var183++;
                }
                if (!var182 && class455.field6977 == 0) {
                    class223.field3443[class158.field2490] = var180;
                    class158.field2490 = (class158.field2490 + 1) % 100;
                    String var184 = class435.method2540(class174.method1093((byte) -109, class491.field7457), 0);
                    if (var179 == 2) {
                        class96.method733(var184, (byte) -4, -1, null, "<img=1>" + var174, 0, 7, "<img=1>" + var173);
                    } else if (var179 == 1) {
                        class96.method733(var184, (byte) -4, -1, null, "<img=0>" + var174, 0, 7, "<img=0>" + var173);
                    } else {
                        class96.method733(var184, (byte) -4, -1, null, var174, 0, 3, var173);
                    }
                }
                class374.field5459 = null;
                return true;
            } else if (class374.field5459 == class243.field3650) {
                int var185 = class491.field7457.method270((byte) -54);
                int var186 = class491.field7457.method255((byte) 96);
                int var187 = class491.field7457.method272(-121);
                if (class149.method970(var187, 1)) {
                    class394 var188 = (class394) class245.field3741.method2409(false, (long) var186);
                    class394 var189 = (class394) class245.field3741.method2409(false, (long) var185);
                    if (var189 != null) {
                        class217.method1332(false, var188 == null || var188.field5750 != var189.field5750, var189, -10879);
                    }
                    if (var188 != null) {
                        var188.method1121(false);
                        class245.field3741.method2413((long) var185, -1, var188);
                    }
                    class427 var190 = class413.method2435(160291920, var186);
                    if (var190 != null) {
                        class288.method1754(var190, 0);
                    }
                    class427 var191 = class413.method2435(160291920, var185);
                    if (var191 != null) {
                        class288.method1754(var191, 0);
                        class82.method590(var191, true, true);
                    }
                    if (class375.field5475 != -1) {
                        class141.method933(255, 1, class375.field5475);
                    }
                }
                class374.field5459 = null;
                return true;
            } else if (class374.field5459 == class196.field3092) {
                int var192 = class491.field7457.method270((byte) -54);
                int var193 = class491.field7457.method243(126);
                int var194 = class491.field7457.method247((byte) 0);
                if (class149.method970(var193, 1)) {
                    class476.method2863(var192, var194, -3040);
                }
                class374.field5459 = null;
                return true;
            } else if (class374.field5459 == class184.field2926) {
                byte var195 = class491.field7457.method223((byte) -80);
                int var196 = class491.field7457.method254((byte) -127);
                int var197 = class491.field7457.method254((byte) -68);
                if (class149.method970(var197, 1)) {
                    class369.method2237((byte) -84, var196, var195);
                }
                class374.field5459 = null;
                return true;
            } else if (class374.field5459 == class218.field3356) {
                int var198 = class491.field7457.method254((byte) -59);
                if (var198 == 65535) {
                    var198 = -1;
                }
                int var199 = class491.field7457.method257((byte) 39);
                int var200 = class491.field7457.method254((byte) -73);
                int var201 = class491.field7457.method257((byte) 59);
                class487.method2927((byte) -68, var198, var200, var201, var199);
                class374.field5459 = null;
                return true;
            } else if (class374.field5459 == class177.field2771) {
                int var202 = class491.field7457.method247((byte) 0);
                int var203 = class491.field7457.method243(121);
                int var204 = class491.field7457.method238(28);
                int var205 = class491.field7457.method243(-62);
                int var206 = class491.field7457.method243(-38);
                if (class149.method970(var206, 1)) {
                    class227.method1371(true, var203 | var202 << 16, var204, 7, var205);
                }
                class374.field5459 = null;
                return true;
            } else if (class401.field5840 == class374.field5459) {
                class381.method2286(class221.field3405, false);
                class374.field5459 = null;
                return true;
            } else if (class374.field5459 == class288.field4370) {
                int var207 = class491.field7457.method272(-87);
                int var208 = class491.field7457.method272(-10);
                int var209 = class491.field7457.method255((byte) 96);
                int var210 = class491.field7457.method247((byte) 0);
                if (class149.method970(var210, 1)) {
                    class234.method1403(var209, 91, (var207 << 16) + var208);
                }
                class374.field5459 = null;
                return true;
            } else if (class96.field1731 == class374.field5459) {
                int var211 = class491.field7457.method243(118);
                int var212 = class491.field7457.method275((byte) -124);
                if (class149.method970(var211, 1)) {
                    class227.method1371(true, class507.field7667, var212, 5, 0);
                }
                class374.field5459 = null;
                return true;
            } else if (class58.field985 == class374.field5459) {
                class42.method295(true, -25608);
                class374.field5459 = null;
                return true;
            } else if (class49.field747 == class374.field5459) {
                int var213 = class491.field7457.method254((byte) -40);
                if (class149.method970(var213, 1)) {
                    class231.method1388((byte) 119);
                }
                class374.field5459 = null;
                return true;
            } else if (class488.field7446 == class374.field5459) {
                int var214 = class491.field7457.method255((byte) 96);
                class226.field3462 = class7.field86.method1564(var214, false);
                class374.field5459 = null;
                return true;
            } else if (class374.field5459 == class247.field3798) {
                class448.field6905 = 1;
                class374.field5459 = null;
                class153.field2448 = class298.field4515;
                return true;
            } else if (class480.field7335 == class374.field5459) {
                class396.field5770 = class491.field7457.method249(false);
                class27.field352 = class298.field4515;
                class374.field5459 = null;
                return true;
            } else if (class374.field5459 == class128.field2061) {
                int var215 = class491.field7457.method275((byte) -123);
                int var216 = class491.field7457.method272(-114);
                String var217 = class491.field7457.method239(true);
                if (class149.method970(var216, 1)) {
                    class278.method1702(var217, var215, (byte) -119);
                }
                class374.field5459 = null;
                return true;
            } else if (class374.field5459 == class115.field1953) {
                int var218 = class491.field7457.method249(false);
                int var219 = class491.field7457.method275((byte) -126);
                int var220 = class491.field7457.method274((byte) 114);
                int var221 = class491.field7457.method243(3);
                if (class149.method970(var221, 1)) {
                    class328.method2045(var218, 68, var220, var219);
                }
                class374.field5459 = null;
                return true;
            } else if (class99.field1798 == class374.field5459) {
                class328.field4922 = class491.field7457.method223((byte) -36) << 3;
                class321.field4833 = class491.field7457.method250(true) << 3;
                class359.field5317 = class491.field7457.method232((byte) 118);
                for (class163 var222 = (class163) class252.field3845.method2415((byte) -93); var222 != null; var222 = (class163) class252.field3845.method2416((byte) -121)) {
                    int var224 = (int) (var222.field2798 & 0x3FFFL);
                    int var225 = (int) (var222.field2798 >> 14 & 0x3FFFL);
                    int var226 = (int) (var222.field2798 >> 28 & 0x3L);
                    if (class359.field5317 == var226 && var224 >= class328.field4922 && var224 < (class328.field4922 + 8) && var225 >= class321.field4833 && class321.field4833 + 8 > var225) {
                        var222.method1121(false);
                        class59.method420(var224, (byte) 40, var225, class359.field5317);
                    }
                }
                for (class76 var223 = (class76) class170.field2648.method8((byte) -98); var223 != null; var223 = (class76) class170.field2648.method17((byte) -93)) {
                    if (class328.field4922 <= var223.field1367 && (class328.field4922 + 8) > var223.field1367 && var223.field1359 >= class321.field4833 && var223.field1359 < class321.field4833 + 8 && class359.field5317 == var223.field1355) {
                        var223.field1360 = 0;
                    }
                }
                class374.field5459 = null;
                return true;
            } else if (class411.field5967 == class374.field5459) {
                class381.method2286(class341.field5091, false);
                class374.field5459 = null;
                return true;
            } else if (class374.field5459 == class246.field3755) {
                class345.method2114(0);
                class374.field5459 = null;
                return false;
            } else if (class504.field7616 == class374.field5459) {
                class381.method2286(class473.field7233, false);
                class374.field5459 = null;
                return true;
            } else if (class460.field7085 == class374.field5459) {
                class321.field4833 = class491.field7457.method223((byte) -116) << 3;
                class328.field4922 = class491.field7457.method250(true) << 3;
                class359.field5317 = class491.field7457.method232((byte) 118);
                while (class60.field1014 > class491.field7457.field585) {
                    class366 var227 = class51.method358((byte) -20)[class491.field7457.method257((byte) 23)];
                    class381.method2286(var227, false);
                }
                class374.field5459 = null;
                return true;
            } else if (class374.field5459 == class345.field5118) {
                class267.field4036 = class298.field4515;
                if (class60.field1014 == 0) {
                    class374.field5459 = null;
                    class227.field3484 = null;
                    class233.field3530 = 0;
                    class17.field236 = null;
                    class184.field2928 = null;
                    return true;
                }
                class227.field3484 = class491.field7457.method239(true);
                boolean var228 = class491.field7457.method257((byte) 34) == 1;
                if (var228) {
                    class491.field7457.method239(true);
                }
                long var229 = class491.field7457.method265((byte) 111);
                class184.field2928 = class487.method2921(var229, -125);
                class261.field3964 = class491.field7457.method262(-2);
                int var231 = class491.field7457.method257((byte) 56);
                if (var231 == 255) {
                    class374.field5459 = null;
                    return true;
                }
                class233.field3530 = var231;
                class128[] var232 = new class128[100];
                for (int var233 = 0; var233 < class233.field3530; var233++) {
                    var232[var233] = new class128();
                    var232[var233].field2058 = class491.field7457.method239(true);
                    boolean var239 = class491.field7457.method257((byte) 68) == 1;
                    if (var239) {
                        var232[var233].field2064 = class491.field7457.method239(true);
                    } else {
                        var232[var233].field2064 = var232[var233].field2058;
                    }
                    var232[var233].field2062 = class290.method1768(var232[var233].field2064, false);
                    var232[var233].field2060 = class491.field7457.method254((byte) -92);
                    var232[var233].field2059 = class491.field7457.method262(-2);
                    var232[var233].field2069 = class491.field7457.method239(true);
                    if (var232[var233].field2064.equals(class286.field4329.field685)) {
                        class271.field4103 = var232[var233].field2059;
                    }
                }
                boolean var234 = false;
                int var235 = class233.field3530;
                while (var235 > 0) {
                    boolean var236 = true;
                    var235--;
                    for (int var237 = 0; var237 < var235; var237++) {
                        if (var232[var237].field2062.compareTo(var232[var237 + 1].field2062) > 0) {
                            class128 var238 = var232[var237];
                            var232[var237] = var232[var237 + 1];
                            var232[var237 + 1] = var238;
                            var236 = false;
                        }
                    }
                    if (var236) {
                        break;
                    }
                }
                class17.field236 = var232;
                class374.field5459 = null;
                return true;
            } else if (class374.field5459 == class295.field4490) {
                class15.field211 = class491.field7457.method257((byte) 81);
                class341.field5095 = class491.field7457.method232((byte) 108);
                class374.field5459 = null;
                return true;
            } else if (class375.field5466 == class374.field5459) {
                int var240 = class491.field7457.method238(121);
                int var241 = class491.field7457.method272(124);
                int var242 = class491.field7457.method275((byte) -128);
                int var243 = class491.field7457.method243(119);
                if (class149.method970(var241, 1)) {
                    class227.method1371(true, var243, var242, 5, var240);
                }
                class374.field5459 = null;
                return true;
            } else if (class374.field5459 == class131.field2082) {
                int var244 = class491.field7457.method247((byte) 0);
                int var245 = class491.field7457.method255((byte) 96);
                int var246 = class491.field7457.method247((byte) 0);
                if (var246 == 65535) {
                    var246 = -1;
                }
                if (class149.method970(var244, 1)) {
                    class227.method1371(true, var246, var245, 2, -1);
                }
                class374.field5459 = null;
                return true;
            } else if (class374.field5459 == class184.field2919) {
                class65.field1067 = class491.field7457.method254((byte) -54) * 30;
                class27.field352 = class298.field4515;
                class374.field5459 = null;
                return true;
            } else if (class374.field5459 == class184.field2933) {
                class381.method2286(class270.field4085, false);
                class374.field5459 = null;
                return true;
            } else if (class6.field74 == class374.field5459) {
                byte var247 = class491.field7457.method262(-2);
                int var248 = class491.field7457.method247((byte) 0);
                class273.field4144.method1616(var247, var248, -123);
                class374.field5459 = null;
                return true;
            } else if (class374.field5459 == class252.field3850) {
                class273.field4144.method1625(67);
                class374.field5459 = null;
                class292.field4455 += 32;
                return true;
            } else if (class482.field7355 == class374.field5459) {
                class381.method2286(class230.field3502, false);
                class374.field5459 = null;
                return true;
            } else if (class410.field5945 == class374.field5459) {
                int var249 = class491.field7457.method232((byte) 120);
                int var250 = class491.field7457.method232((byte) 107);
                if (var250 == 255) {
                    var250 = -1;
                    var249 = -1;
                }
                class131.method875((byte) 127, var249, var250);
                class374.field5459 = null;
                return true;
            } else if (class374.field5459 == class2.field15) {
                int var251 = class491.field7457.method249(false);
                int var252 = class491.field7457.method247((byte) 0);
                int var253 = class491.field7457.method275((byte) -125);
                if (class149.method970(var252, 1)) {
                    class502.method3011(var251, (byte) -54, var253);
                }
                class374.field5459 = null;
                return true;
            } else if (class374.field5459 == class225.field3457) {
                int var254 = class491.field7457.method254((byte) -61);
                int var255 = class491.field7457.method255((byte) 96);
                if (class149.method970(var254, 1)) {
                    class394 var256 = (class394) class245.field3741.method2409(false, (long) var255);
                    if (var256 != null) {
                        class217.method1332(false, true, var256, -10879);
                    }
                    if (class198.field3118 != null) {
                        class288.method1754(class198.field3118, 0);
                        class198.field3118 = null;
                    }
                }
                class374.field5459 = null;
                return true;
            } else if (class458.field7023 == class374.field5459) {
                String var257 = class491.field7457.method239(true);
                boolean var258 = class491.field7457.method257((byte) 44) == 1;
                String var259;
                if (var258) {
                    var259 = class491.field7457.method239(true);
                } else {
                    var259 = var257;
                }
                int var260 = class491.field7457.method254((byte) -96);
                byte var261 = class491.field7457.method262(-2);
                boolean var262 = false;
                if (var261 == -128) {
                    var262 = true;
                }
                if (var262) {
                    if (class233.field3530 == 0) {
                        class374.field5459 = null;
                        return true;
                    }
                    boolean var263 = false;
                    int var264;
                    for (var264 = 0; class233.field3530 > var264 && (!class17.field236[var264].field2064.equals(var259) || class17.field236[var264].field2060 != var260); var264++) {
                    }
                    if (var264 < class233.field3530) {
                        while (var264 < class233.field3530 - 1) {
                            class17.field236[var264] = class17.field236[var264 + 1];
                            var264++;
                        }
                        class233.field3530--;
                        class17.field236[class233.field3530] = null;
                    }
                } else {
                    String var265 = class491.field7457.method239(true);
                    class128 var266 = new class128();
                    var266.field2058 = var257;
                    var266.field2064 = var259;
                    var266.field2062 = class290.method1768(var266.field2064, false);
                    var266.field2059 = var261;
                    var266.field2060 = var260;
                    var266.field2069 = var265;
                    int var267;
                    for (var267 = class233.field3530 - 1; var267 >= 0; var267--) {
                        int var268 = class17.field236[var267].field2062.compareTo(var266.field2062);
                        if (var268 == 0) {
                            class17.field236[var267].field2060 = var260;
                            class17.field236[var267].field2059 = var261;
                            class17.field236[var267].field2069 = var265;
                            if (var259.equals(class286.field4329.field685)) {
                                class271.field4103 = var261;
                            }
                            class374.field5459 = null;
                            class267.field4036 = class298.field4515;
                            return true;
                        }
                        if (var268 < 0) {
                            break;
                        }
                    }
                    if (class17.field236.length <= class233.field3530) {
                        class374.field5459 = null;
                        return true;
                    }
                    for (int var269 = class233.field3530 - 1; var269 > var267; var269--) {
                        class17.field236[var269 + 1] = class17.field236[var269];
                    }
                    if (class233.field3530 == 0) {
                        class17.field236 = new class128[100];
                    }
                    class17.field236[var267 + 1] = var266;
                    class233.field3530++;
                    if (var259.equals(class286.field4329.field685)) {
                        class271.field4103 = var261;
                    }
                }
                class267.field4036 = class298.field4515;
                class374.field5459 = null;
                return true;
            } else if (class374.field5459 == class282.field4264) {
                int var270 = class491.field7457.method254((byte) -88);
                int var271 = class491.field7457.method257((byte) 29);
                boolean var272 = (var271 & 0x1) == 1;
                class137.method923(var270, 0, var272);
                int var273 = class491.field7457.method254((byte) -67);
                for (int var274 = 0; var274 < var273; var274++) {
                    int var275 = class491.field7457.method243(119);
                    int var276 = class491.field7457.method256(true);
                    if (var276 == 255) {
                        var276 = class491.field7457.method255((byte) 96);
                    }
                    class415.method2442(6, var276, var274, var275 - 1, var270, var272);
                }
                class441.field6477[class330.method2050(class197.field3101++, 31)] = var270;
                class374.field5459 = null;
                return true;
            } else if (class374.field5459 == class34.field482) {
                class381.method2286(class484.field7389, false);
                class374.field5459 = null;
                return true;
            } else if (class415.field6010 == class374.field5459) {
                int var277 = class491.field7457.method254((byte) -38);
                if (class149.method970(var277, 1)) {
                    class119.method833(-1);
                }
                class374.field5459 = null;
                return true;
            } else if (class374.field5459 == class311.field4688) {
                int var278 = class491.field7457.method247((byte) 0);
                if (var278 == 65535) {
                    var278 = -1;
                }
                int var279 = class491.field7457.method270((byte) -54);
                int var280 = class491.field7457.method243(-34);
                int var281 = class491.field7457.method255((byte) 96);
                int var282 = class491.field7457.method243(124);
                if (var282 == 65535) {
                    var282 = -1;
                }
                if (class149.method970(var280, 1)) {
                    for (int var283 = var282; var283 <= var278; var283++) {
                        long var284 = ((long) var281 << 32) + ((long) var283);
                        class54 var286 = (class54) class437.field6439.method2409(false, var284);
                        class54 var287;
                        if (var286 != null) {
                            var287 = new class54(var279, var286.field817);
                            var286.method1121(false);
                        } else if (var283 == -1) {
                            var287 = new class54(var279, class413.method2435(160291920, var281).field6281.field817);
                        } else {
                            var287 = new class54(var279, -1);
                        }
                        class437.field6439.method2413(var284, -1, var287);
                    }
                }
                class374.field5459 = null;
                return true;
            } else if (class374.field5459 == class313.field4734) {
                int var288 = class491.field7457.method254((byte) -122);
                int var289 = class491.field7457.method257((byte) 104);
                boolean var290 = (var289 & 0x1) == 1;
                while (class60.field1014 > class491.field7457.field585) {
                    int var291 = class491.field7457.method236(true);
                    int var292 = class491.field7457.method254((byte) -104);
                    int var293 = 0;
                    if (var292 != 0) {
                        var293 = class491.field7457.method257((byte) 119);
                        if (var293 == 255) {
                            var293 = class491.field7457.method255((byte) 96);
                        }
                    }
                    class415.method2442(6, var293, var291, var292 - 1, var288, var290);
                }
                class441.field6477[class330.method2050(31, class197.field3101++)] = var288;
                class374.field5459 = null;
                return true;
            } else if (class61.field1027 == class374.field5459) {
                class170.field2651 = class491.field7457.method257((byte) 27);
                for (int var294 = 0; var294 < class170.field2651; var294++) {
                    class107.field1868[var294] = class491.field7457.method239(true);
                    class373.field5453[var294] = class491.field7457.method239(true);
                    if (class373.field5453[var294].equals("")) {
                        class373.field5453[var294] = class107.field1868[var294];
                    }
                    class178.field2791[var294] = class491.field7457.method239(true);
                    class241.field3635[var294] = class491.field7457.method239(true);
                    if (class241.field3635[var294].equals("")) {
                        class241.field3635[var294] = class178.field2791[var294];
                    }
                    class298.field4528[var294] = false;
                }
                class374.field5459 = null;
                class153.field2448 = class298.field4515;
                return true;
            } else if (class374.field5459 == class306.field4643) {
                int var295 = class491.field7457.method243(127);
                int var296 = class491.field7457.method277(true);
                class273.field4144.method1624((byte) -124, var295, var296);
                class374.field5459 = null;
                return true;
            } else if (class374.field5459 == class359.field5321) {
                if (class201.field3190 != null) {
                    class423.method2477(false, -4, class463.field7116.field2946, -1, -1);
                }
                byte[] var297 = new byte[class60.field1014];
                class491.field7457.method2366(0, var297, -127, class60.field1014);
                String var298 = class358.method2187(class60.field1014, (byte) 65, var297, 0);
                class189.method1197(class7.field86, true, class30.field395 == 1, var298, 2);
                class374.field5459 = null;
                return true;
            } else if (class374.field5459 == class339.field5061) {
                int var299 = class491.field7457.method257((byte) 64);
                if (class491.field7457.method257((byte) 33) == 0) {
                    class297.field4510[var299] = new class325();
                } else {
                    class491.field7457.field585--;
                    class297.field4510[var299] = new class325(class491.field7457);
                }
                class374.field5459 = null;
                class25.field332 = class298.field4515;
                return true;
            } else if (class482.field7365 == class374.field5459) {
                class451.method2690((byte) 74);
                class374.field5459 = null;
                return false;
            } else if (class424.field6081 == class374.field5459) {
                int var300 = class491.field7457.method270((byte) -54);
                int var301 = class491.field7457.method254((byte) -100);
                int var302 = class491.field7457.method272(27);
                int var303 = class491.field7457.method243(126);
                int var304 = class491.field7457.method247((byte) 0);
                if (class149.method970(var302, 1)) {
                    class503.method3014(var301, var300, var304, 65535, var303);
                }
                class374.field5459 = null;
                return true;
            } else if (class49.field758 == class374.field5459) {
                int var305 = class491.field7457.method238(111);
                int var306 = class491.field7457.method254((byte) -74);
                int var307 = class491.field7457.method247((byte) 0);
                if (var307 == 65535) {
                    var307 = -1;
                }
                if (class149.method970(var306, 1)) {
                    class227.method1371(true, var307, var305, 1, -1);
                }
                class374.field5459 = null;
                return true;
            } else if (class374.field5459 == class311.field4684) {
                class278.method1703(class491.field7457, class60.field1014, -14695);
                class374.field5459 = null;
                return true;
            } else if (class69.field1186 == class374.field5459) {
                String var308 = class491.field7457.method239(true);
                int var309 = class491.field7457.method254((byte) -68);
                int var310 = class491.field7457.method247((byte) 0);
                if (class149.method970(var310, 1)) {
                    class374.method2252(2, var308, var309);
                }
                class374.field5459 = null;
                return true;
            } else if (class374.field5459 == class128.field2063) {
                boolean var311 = class491.field7457.method257((byte) 74) == 1;
                String var312 = class491.field7457.method239(true);
                String var313 = var312;
                if (var311) {
                    var313 = class491.field7457.method239(true);
                }
                long var314 = class491.field7457.method265((byte) -92);
                long var316 = (long) class491.field7457.method254((byte) -75);
                long var318 = (long) class491.field7457.method224(-2);
                int var320 = class491.field7457.method257((byte) 49);
                int var321 = class491.field7457.method254((byte) -86);
                long var322 = (var316 << 32) + var318;
                boolean var324 = false;
                int var325 = 0;
                while (true) {
                    if (var325 >= 100) {
                        if (var320 <= 1 && class237.method1423(var313, 0)) {
                            var324 = true;
                        }
                        break;
                    }
                    if (class223.field3443[var325] == var322) {
                        var324 = true;
                        break;
                    }
                    var325++;
                }
                if (!var324 && class455.field6977 == 0) {
                    class223.field3443[class158.field2490] = var322;
                    class158.field2490 = (class158.field2490 + 1) % 100;
                    String var326 = class47.field721.method1063(0, var321).method2840(class491.field7457, -1);
                    if (var320 == 2) {
                        class96.method733(var326, (byte) -4, var321, class38.method213(0, var314), "<img=1>" + var313, 0, 20, "<img=1>" + var312);
                    } else if (var320 == 1) {
                        class96.method733(var326, (byte) -4, var321, class38.method213(0, var314), "<img=0>" + var313, 0, 20, "<img=0>" + var312);
                    } else {
                        class96.method733(var326, (byte) -4, var321, class38.method213(0, var314), var313, 0, 20, var312);
                    }
                }
                class374.field5459 = null;
                return true;
            } else if (class482.field7362 == class374.field5459) {
                int var327 = class491.field7457.method254((byte) -55);
                String var328 = class491.field7457.method239(true);
                Object[] var329 = new Object[var328.length() + 1];
                for (int var330 = var328.length() - 1; var330 >= 0; var330--) {
                    if (var328.charAt(var330) == 's') {
                        var329[var330 + 1] = class491.field7457.method239(true);
                    } else {
                        var329[var330 + 1] = Integer.valueOf(class491.field7457.method255((byte) 96));
                    }
                }
                var329[0] = Integer.valueOf(class491.field7457.method255((byte) 96));
                if (class149.method970(var327, 1)) {
                    class298 var331 = new class298();
                    var331.field4520 = var329;
                    class94.method704(var331);
                }
                class374.field5459 = null;
                return true;
            } else if (class374.field5459 == class317.field4768) {
                int var332 = class491.field7457.method272(127);
                int var333 = class491.field7457.method247((byte) 0);
                int var334 = class491.field7457.method243(-120);
                if (class149.method970(var333, 1)) {
                    class25.method131(0, (byte) 76, var332, var334);
                }
                class374.field5459 = null;
                return true;
            } else if (class499.field7566 == class374.field5459) {
                int var335 = class491.field7457.method238(17);
                int var336 = class491.field7457.method254((byte) -47);
                int var337 = class491.field7457.method257((byte) 109);
                if (class149.method970(var336, 1)) {
                    class506.method3023(var337, 21423, var335);
                }
                class374.field5459 = null;
                return true;
            } else if (class487.field7417 == class374.field5459) {
                class297.method1800(-5540);
                class374.field5459 = null;
                return false;
            } else if (class374.field5459 == class112.field1906) {
                class381.method2286(class502.field7594, false);
                class374.field5459 = null;
                return true;
            } else if (class87.field1515 == class374.field5459) {
                boolean var338 = class491.field7457.method257((byte) 52) == 1;
                String var339 = class491.field7457.method239(true);
                String var340 = var339;
                if (var338) {
                    var340 = class491.field7457.method239(true);
                }
                int var341 = class491.field7457.method257((byte) 116);
                int var342 = class491.field7457.method254((byte) -127);
                boolean var343 = false;
                if (var341 <= 1 && class237.method1423(var340, 0)) {
                    var343 = true;
                }
                if (!var343 && class455.field6977 == 0) {
                    String var344 = class47.field721.method1063(0, var342).method2840(class491.field7457, -1);
                    if (var341 == 2) {
                        class96.method733(var344, (byte) -4, var342, null, "<img=1>" + var340, 0, 25, "<img=1>" + var339);
                    } else if (var341 == 1) {
                        class96.method733(var344, (byte) -4, var342, null, "<img=0>" + var340, 0, 25, "<img=0>" + var339);
                    } else {
                        class96.method733(var344, (byte) -4, var342, null, var340, 0, 25, var339);
                    }
                }
                class374.field5459 = null;
                return true;
            } else if (class374.field5459 == class297.field4507) {
                int var345 = class491.field7457.method256(true);
                int var346 = class491.field7457.method254((byte) -107);
                boolean var347 = (var345 & 0x1) == 1;
                class194.method1207((byte) -108, var346, var347);
                class441.field6477[class330.method2050(31, class197.field3101++)] = var346;
                class374.field5459 = null;
                return true;
            } else if (class374.field5459 == class302.field4563) {
                while (class491.field7457.field585 < class60.field1014) {
                    boolean var358 = class491.field7457.method257((byte) 35) == 1;
                    String var359 = class491.field7457.method239(true);
                    String var360 = class491.field7457.method239(true);
                    int var361 = class491.field7457.method254((byte) -54);
                    int var362 = class491.field7457.method257((byte) 95);
                    String var363 = "";
                    boolean var364 = false;
                    if (var361 > 0) {
                        var363 = class491.field7457.method239(true);
                        var364 = class491.field7457.method257((byte) 75) == 1;
                    }
                    for (int var365 = 0; var365 < class7.field79; var365++) {
                        if (var358) {
                            if (var360.equals(class51.field767[var365])) {
                                class51.field767[var365] = var359;
                                var359 = null;
                                class472.field7212[var365] = var360;
                                break;
                            }
                        } else if (var359.equals(class51.field767[var365])) {
                            if (class366.field5375[var365] != var361) {
                                class366.field5375[var365] = var361;
                                if (var361 > 0) {
                                    class150.method976(var359 + class208.field3263.method2473(class406.field5898, -90), 5, "", 0, "", (byte) -113);
                                }
                                if (var361 == 0) {
                                    class150.method976(var359 + class460.field7084.method2473(class406.field5898, -107), 5, "", 0, "", (byte) -113);
                                }
                            }
                            class472.field7212[var365] = var360;
                            class296.field4497[var365] = var363;
                            class478.field7308[var365] = var362;
                            var359 = null;
                            class147.field2388[var365] = var364;
                            break;
                        }
                    }
                    if (var359 != null && class7.field79 < 200) {
                        class51.field767[class7.field79] = var359;
                        class472.field7212[class7.field79] = var360;
                        class366.field5375[class7.field79] = var361;
                        class296.field4497[class7.field79] = var363;
                        class478.field7308[class7.field79] = var362;
                        class147.field2388[class7.field79] = var364;
                        class7.field79++;
                    }
                }
                class448.field6905 = 2;
                class153.field2448 = class298.field4515;
                boolean var348 = false;
                int var349 = class7.field79;
                while (var349 > 0) {
                    boolean var350 = true;
                    var349--;
                    for (int var351 = 0; var351 < var349; var351++) {
                        if (class366.field5375[var351] != class167.field2593 && class366.field5375[var351 + 1] == class167.field2593 || class366.field5375[var351] == 0 && class366.field5375[var351 + 1] != 0) {
                            int var352 = class366.field5375[var351];
                            class366.field5375[var351] = class366.field5375[var351 + 1];
                            class366.field5375[var351 + 1] = var352;
                            String var353 = class296.field4497[var351];
                            class296.field4497[var351] = class296.field4497[var351 + 1];
                            class296.field4497[var351 + 1] = var353;
                            String var354 = class51.field767[var351];
                            class51.field767[var351] = class51.field767[var351 + 1];
                            class51.field767[var351 + 1] = var354;
                            String var355 = class472.field7212[var351];
                            class472.field7212[var351] = class472.field7212[var351 + 1];
                            class472.field7212[var351 + 1] = var355;
                            int var356 = class478.field7308[var351];
                            class478.field7308[var351] = class478.field7308[var351 + 1];
                            class478.field7308[var351 + 1] = var356;
                            boolean var357 = class147.field2388[var351];
                            class147.field2388[var351] = class147.field2388[var351 + 1];
                            var350 = false;
                            class147.field2388[var351 + 1] = var357;
                        }
                    }
                    if (var350) {
                        break;
                    }
                }
                class374.field5459 = null;
                return true;
            } else if (class457.field7008 == class374.field5459) {
                class381.method2286(class314.field4741, false);
                class374.field5459 = null;
                return true;
            } else if (class374.field5459 == class360.field5325) {
                int var366 = class491.field7457.method257((byte) 121);
                boolean var367 = (var366 & 0x1) == 1;
                String var368 = class491.field7457.method239(true);
                String var369 = class491.field7457.method239(true);
                if (var369.equals("")) {
                    var369 = var368;
                }
                String var370 = class491.field7457.method239(true);
                String var371 = class491.field7457.method239(true);
                if (var371.equals("")) {
                    var371 = var370;
                }
                if (var367) {
                    for (int var372 = 0; var372 < class170.field2651; var372++) {
                        if (class373.field5453[var372].equals(var371)) {
                            class107.field1868[var372] = var368;
                            class373.field5453[var372] = var369;
                            class178.field2791[var372] = var370;
                            class241.field3635[var372] = var371;
                            break;
                        }
                    }
                } else {
                    class107.field1868[class170.field2651] = var368;
                    class373.field5453[class170.field2651] = var369;
                    class178.field2791[class170.field2651] = var370;
                    class241.field3635[class170.field2651] = var371;
                    class298.field4528[class170.field2651] = class330.method2050(var366, 2) == 2;
                    class170.field2651++;
                }
                class374.field5459 = null;
                class153.field2448 = class298.field4515;
                return true;
            } else if (class63.field1046 == class374.field5459) {
                String var373 = class491.field7457.method239(true);
                int var374 = class491.field7457.method254((byte) -91);
                String var375 = class47.field721.method1063(0, var374).method2840(class491.field7457, -1);
                class96.method733(var375, (byte) -4, var374, null, var373, 0, 19, var373);
                class374.field5459 = null;
                return true;
            } else if (class374.field5459 == class353.field5184) {
                String var376 = class491.field7457.method239(true);
                int var377 = class491.field7457.method272(-21);
                if (var377 == 65535) {
                    var377 = -1;
                }
                int var378 = class491.field7457.method232((byte) 116);
                int var379 = class491.field7457.method232((byte) 105);
                if (var379 >= 1 && var379 <= 8) {
                    if (var376.equalsIgnoreCase("null")) {
                        var376 = null;
                    }
                    class139.field2286[var379 - 1] = var376;
                    class264.field3997[var379 - 1] = var377;
                    class287.field4347[var379 - 1] = var378 == 0;
                }
                class374.field5459 = null;
                return true;
            } else if (class490.field7450 == class374.field5459) {
                int var380 = class491.field7457.method275((byte) -125);
                int var381 = class491.field7457.method247((byte) 0);
                if (class149.method970(var381, 1)) {
                    class227.method1371(true, -1, var380, 3, -1);
                }
                class374.field5459 = null;
                return true;
            } else if (class374.field5459 == class324.field4856) {
                class328.field4922 = class491.field7457.method250(true) << 3;
                class359.field5317 = class491.field7457.method232((byte) 122);
                class321.field4833 = class491.field7457.method250(true) << 3;
                class374.field5459 = null;
                return true;
            } else if (class423.field6066 == class374.field5459) {
                class381.method2286(class152.field2436, false);
                class374.field5459 = null;
                return true;
            } else if (class61.field1031 == class374.field5459) {
                String var382 = class491.field7457.method239(true);
                String var383 = class435.method2540(class174.method1093((byte) -109, class491.field7457), 0);
                class150.method976(var383, 6, var382, 0, var382, (byte) -113);
                class374.field5459 = null;
                return true;
            } else if (class436.field6423 == class374.field5459) {
                for (int var384 = 0; var384 < class224.field3450.length; var384++) {
                    if (class224.field3450[var384] != null) {
                        class224.field3450[var384].field2174 = -1;
                    }
                }
                for (int var385 = 0; var385 < class195.field3085.length; var385++) {
                    if (class195.field3085[var385] != null) {
                        class195.field3085[var385].field2174 = -1;
                    }
                }
                class374.field5459 = null;
                return true;
            } else if (class374.field5459 == class115.field1950) {
                int var386 = class491.field7457.method257((byte) 33);
                int var387 = class491.field7457.method232((byte) 113);
                int var388 = class491.field7457.method238(102);
                class47.field712[var386] = var388;
                class232.field3528[var386] = var387;
                class222.field3433[var386] = 1;
                int var389 = class150.field2418[var386] - 1;
                for (int var390 = 0; var390 < var389; var390++) {
                    if (class38.field516[var390] <= var388) {
                        class222.field3433[var386] = var390 + 2;
                    }
                }
                class493.field7511[class330.method2050(31, class217.field3340++)] = var386;
                class374.field5459 = null;
                return true;
            } else if (class374.field5459 == class295.field4474) {
                int var391 = class491.field7457.method272(125);
                int var392 = class491.field7457.method232((byte) 107);
                int var393 = class491.field7457.method272(123);
                if (class149.method970(var393, 1)) {
                    if (var392 == 2) {
                        class55.method386(25);
                    }
                    class375.field5475 = var391;
                    class19.method101((byte) -21, var391);
                    class440.method2568(false, 116);
                    class94.method703(class375.field5475);
                    for (int var394 = 0; var394 < 100; var394++) {
                        class77.field1376[var394] = true;
                    }
                }
                class374.field5459 = null;
                return true;
            } else if (class374.field5459 == class278.field4229) {
                class491.field7457.field585 += 28;
                if (class491.field7457.method234(-1)) {
                    class177.method1117(class491.field7457, class491.field7457.field585 - 28, true);
                }
                class374.field5459 = null;
                return true;
            } else if (class374.field5459 == class17.field230) {
                int var395 = class491.field7457.method254((byte) -100);
                if (var395 == 65535) {
                    var395 = -1;
                }
                int var396 = class491.field7457.method257((byte) 22);
                int var397 = class491.field7457.method254((byte) -30);
                int var398 = class491.field7457.method257((byte) 72);
                class368.method2233(var395, var397, var396, false, var398);
                class374.field5459 = null;
                return true;
            } else if (class511.field7751 == class374.field5459) {
                int var399 = class491.field7457.method254((byte) -47);
                int var400 = class491.field7457.method257((byte) 82);
                int var401 = class491.field7457.method257((byte) 77);
                int var402 = class491.field7457.method257((byte) 34);
                int var403 = class491.field7457.method257((byte) 107);
                int var404 = class491.field7457.method254((byte) -122);
                if (class149.method970(var399, 1)) {
                    class169.field2628[var400] = true;
                    class39.field521[var400] = var401;
                    class307.field4646[var400] = var402;
                    class279.field4246[var400] = var403;
                    class189.field3020[var400] = var404;
                }
                class374.field5459 = null;
                return true;
            } else {
                class32.method177(null, (byte) -88, "T1 - " + (class374.field5459 == null ? -1 : class374.field5459.method865(97)) + "," + (class257.field3918 == null ? -1 : class257.field3918.method865(97)) + "," + (class461.field7090 == null ? -1 : class461.field7090.method865(97)) + " - " + class60.field1014);
                class345.method2114(0);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IB)Lhr;", line = 3116)
    public final class349 method1026(int arg0, byte arg1) {
        field2522++;
        class288 var3 = this.field2520;
        class349 var4;
        synchronized (this.field2520) {
            var4 = (class349) this.field2520.method1752(0, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field2516.method2715(arg0, 34, false);
        class349 var6 = new class349();
        var6.field5142 = this;
        if (var5 != null) {
            var6.method2125(-1, new class40(var5));
        }
        class288 var7 = this.field2520;
        synchronized (this.field2520) {
            int var8 = 111 / ((5 - arg1) / 59);
            this.field2520.method1758(1, var6, (long) arg0);
            return var6;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)V", line = 3150)
    public final void method1027(int arg0) {
        class288 var2 = this.field2520;
        synchronized (this.field2520) {
            this.field2520.method1761(-118);
        }
        field2524++;
        if (arg0 != 3) {
            field2517 = -39;
        }
        class288 var3 = this.field2525;
        synchronized (this.field2525) {
            this.field2525.method1761(-122);
        }
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(I)V", line = 3168)
    public final void method1028(int arg0) {
        class288 var2 = this.field2520;
        synchronized (this.field2520) {
            this.field2520.method1749((byte) 124);
            if (arg0 != 3) {
                this.method1028(3);
            }
        }
        field2521++;
        class288 var3 = this.field2525;
        synchronized (this.field2525) {
            this.field2525.method1749((byte) -99);
        }
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(B)V", line = 3187)
    public static final void method1029(byte arg0) {
        class384.method2299(class463.field7116.field2971, (byte) 103);
        field2513++;
        int var1 = (class381.field5550 >> 3) + (class243.field3655 >> 10);
        int var2 = (class320.field4827 >> 3) + (class290.field4403 >> 10);
        class362.field5339 = class286.field4329.field3217 = 0;
        class286.field4329.method336(8, -22509, 8);
        byte var3 = 18;
        class423.field6058 = new int[var3];
        class312.field4699 = new int[var3][4];
        class358.field5314 = new byte[var3][];
        class167.field2591 = new int[var3];
        class311.field4685 = new byte[var3][];
        class105.field1852 = new int[var3];
        class38.field512 = new int[var3];
        class216.field3335 = new byte[var3][];
        class61.field1032 = new int[var3];
        class469.field7187 = new int[var3];
        class461.field7092 = new byte[var3][];
        class251.field3838 = new byte[var3][];
        int var4 = 0;
        for (int var5 = (var1 - (class150.field2422 >> 4)) / 8; var5 <= ((var1 + (class150.field2422 >> 4)) / 8); var5++) {
            for (int var8 = (var2 - (class21.field272 >> 4)) / 8; var8 <= ((class21.field272 >> 4) + var2) / 8; var8++) {
                int var9 = (var5 << 8) + var8;
                class61.field1032[var4] = var9;
                class469.field7187[var4] = class73.field1310.method2720("m" + var5 + "_" + var8, 1);
                class105.field1852[var4] = class73.field1310.method2720("l" + var5 + "_" + var8, 1);
                class167.field2591[var4] = class73.field1310.method2720("n" + var5 + "_" + var8, 1);
                class423.field6058[var4] = class73.field1310.method2720("um" + var5 + "_" + var8, 1);
                class38.field512[var4] = class73.field1310.method2720("ul" + var5 + "_" + var8, 1);
                if (class167.field2591[var4] == -1) {
                    class469.field7187[var4] = -1;
                    class105.field1852[var4] = -1;
                    class423.field6058[var4] = -1;
                    class38.field512[var4] = -1;
                }
                var4++;
            }
        }
        int var6 = -115 / ((38 - arg0) / 42);
        for (int var7 = var4; var7 < class167.field2591.length; var7++) {
            class167.field2591[var7] = -1;
            class469.field7187[var7] = -1;
            class105.field1852[var7] = -1;
            class423.field6058[var7] = -1;
            class38.field512[var7] = -1;
        }
        class121.method842(false, var2, (byte) -121, true, var1);
    }

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "(I)V", line = 3271)
    public static void method1030(int arg0) {
        field2523 = null;
        int var1 = -92 % ((-arg0 - 5) / 63);
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(BI)V", line = 3285)
    public final void method1031(byte arg0, int arg1) {
        field2510++;
        int var3 = -32 / ((arg0 - 15) / 37);
        class288 var4 = this.field2520;
        synchronized (this.field2520) {
            this.field2520.method1760(arg1, 30398);
        }
        class288 var5 = this.field2525;
        synchronized (this.field2525) {
            this.field2525.method1760(arg1, 30398);
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(III)V", line = 3307)
    public final void method1032(int arg0, int arg1, int arg2) {
        this.field2520 = new class288(arg1);
        field2518++;
        if (arg0 != 14379) {
            method1024(null, -38, true);
        }
        this.field2525 = new class288(arg2);
    }

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "(B)V", line = 3319)
    public static final void method1033(byte arg0) {
        if (arg0 >= -47) {
            method1030(32);
        }
        field2511++;
        class240.method1439();
    }

    @OriginalMember(owner = "client!ok", name = "<init>", descriptor = "(Lcm;ILlt;Llt;)V", line = 3340)
    public class160(class491 arg0, int arg1, class458 arg2, class458 arg3) {
        this.field2516 = arg2;
        this.field2514 = arg3;
        this.field2516.method2726((byte) 113, 34);
    }
}
