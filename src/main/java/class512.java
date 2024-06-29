import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class512 extends class113 {

    @OriginalMember(owner = "client!n", name = "E", descriptor = "I")
    public static int field7136;

    @OriginalMember(owner = "client!n", name = "F", descriptor = "I")
    public static int field7137;

    @OriginalMember(owner = "client!n", name = "H", descriptor = "I")
    public static int field7139;

    @OriginalMember(owner = "client!n", name = "G", descriptor = "Lfn;")
    public static class286 field7138;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IIIII)V", line = 3)
    public final void method666(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != 2) {
            field7138 = null;
        }
        ++field7136;
        int var6 = super.field1438.method523();
        int var7 = ((class677) super.field873).field9631 * class386.method2211(-69) / 10 % var6;
        super.field1438.method2992(-var6 + var7 + arg1, arg3, arg2 + var6 + -var7, arg4);
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IZI)Z", line = 18)
    public static final boolean method2899(int arg0, boolean arg1, int arg2) {
        ++field7139;
        if (!arg1) {
            field7138 = null;
        }
        return class615.method3401(arg2, arg0, -28443) || class229.method1421(arg2, arg0, -1);
    }

    @OriginalMember(owner = "client!n", name = "<init>", descriptor = "(Lga;Lga;Lwl;)V", line = 29)
    public class512(class332 arg0, class332 arg1, class677 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!n", name = "d", descriptor = "(I)V", line = 32)
    public static void method2900(int arg0) {
        if (arg0 >= -21) {
            field7138 = null;
        }
        field7138 = null;
    }

    @OriginalMember(owner = "client!n", name = "e", descriptor = "(I)Z", line = 50)
    public static final boolean method2901(int arg0) throws IOException {
        ++field7137;
        if (arg0 >= -50) {
            return false;
        } else if (class163.field2346 == null) {
            return false;
        } else {
            if (class213.field2817 == null) {
                if (class524.field7281) {
                    if (!class163.field2346.method1163(125, 1)) {
                        return false;
                    }
                    class163.field2346.method1160((byte) -112, class289.field3807.field2199, 0, 1);
                    ++class73.field867;
                    class220.field2872 = 0;
                    class524.field7281 = false;
                }
                class289.field3807.field2219 = 0;
                if (class289.field3807.method3009(1)) {
                    if (!class163.field2346.method1163(-22, 1)) {
                        return false;
                    }
                    class163.field2346.method1160((byte) -48, class289.field3807.field2199, 1, 1);
                    ++class73.field867;
                    class220.field2872 = 0;
                }
                class524.field7281 = true;
                class550[] var1 = class75.method416((byte) -99);
                int var2 = class289.field3807.method3012((byte) -82);
                if (~var2 > -1 || var2 >= var1.length) {
                    throw new IOException("invo:" + var2 + " ip:" + class289.field3807.field2219);
                }
                class213.field2817 = var1[var2];
                class151.field2070 = class213.field2817.field7518;
            }
            if (class151.field2070 == -1) {
                if (!class163.field2346.method1163(-128, 1)) {
                    return false;
                }
                class163.field2346.method1160((byte) -72, class289.field3807.field2199, 0, 1);
                ++class73.field867;
                class151.field2070 = class289.field3807.field2199[0] & 255;
                class220.field2872 = 0;
            }
            if (~class151.field2070 == 1) {
                if (!class163.field2346.method1163(-126, 2)) {
                    return false;
                }
                class163.field2346.method1160((byte) -55, class289.field3807.field2199, 0, 2);
                class289.field3807.field2219 = 0;
                class151.field2070 = class289.field3807.method963(-125);
                class220.field2872 = 0;
                class73.field867 += 2;
            }
            if (class151.field2070 > 0) {
                if (!class163.field2346.method1163(75, class151.field2070)) {
                    return false;
                }
                class289.field3807.field2219 = 0;
                class163.field2346.method1160((byte) -107, class289.field3807.field2199, 0, class151.field2070);
                class73.field867 += class151.field2070;
                class220.field2872 = 0;
            }
            class630.field8724 = class315.field4223;
            class315.field4223 = class97.field1175;
            class97.field1175 = class213.field2817;
            if (class213.field2817 == class119.field1520) {
                class699.field9860 = class289.field3807.method947(-5360);
                class227.field2946 = class289.field3807.method930(255) == 1;
                class213.field2817 = null;
                return true;
            } else if (class323.field4358 == class213.field2817) {
                int var3 = class289.field3807.method945((byte) -124);
                int var4 = class289.field3807.method919(-43);
                if (var4 == 255) {
                    var4 = -1;
                    var3 = -1;
                }
                class262.method1573(8562, var3, var4);
                class213.field2817 = null;
                return true;
            } else if (class213.field2817 == class156.field2189) {
                boolean var5 = class289.field3807.method930(255) == 1;
                byte[] var6 = new byte[class151.field2070 + -1];
                class289.field3807.method962(var6, -120, class151.field2070 + -1, 0);
                class494.method2818(15409, var5, var6);
                class213.field2817 = null;
                return true;
            } else if (class660.field9411 == class213.field2817) {
                int var7 = class289.field3807.method963(-119);
                int var8 = class289.field3807.method961(-4349);
                String var9 = class289.field3807.method925(127);
                if (class516.method2930(var7, (byte) -106)) {
                    class103.method571(var8, (byte) -63, var9);
                }
                class213.field2817 = null;
                return true;
            } else if (class560.field7648 == class213.field2817) {
                int var10 = class289.field3807.method930(255);
                boolean var11 = ~(1 & var10) == -2;
                String var12 = class289.field3807.method925(60);
                String var13 = class289.field3807.method925(74);
                if (var13.equals("")) {
                    var13 = var12;
                }
                String var14 = class289.field3807.method925(105);
                String var15 = class289.field3807.method925(45);
                if (var15.equals("")) {
                    var15 = var14;
                }
                if (var11) {
                    for (int var16 = 0; var16 < class52.field662; ++var16) {
                        if (class420.field5517[var16].equals(var15)) {
                            class204.field2746[var16] = var12;
                            class420.field5517[var16] = var13;
                            class104.field1242[var16] = var14;
                            class152.field2089[var16] = var15;
                            break;
                        }
                    }
                } else {
                    class204.field2746[class52.field662] = var12;
                    class420.field5517[class52.field662] = var13;
                    class104.field1242[class52.field662] = var14;
                    class152.field2089[class52.field662] = var15;
                    class85.field1029[class52.field662] = ~class15.method97(2, var10) == -3;
                    ++class52.field662;
                }
                class213.field2817 = null;
                class303.field4026 = class155.field2183;
                return true;
            } else if (class569.field7748 == class213.field2817) {
                int var17 = class289.field3807.method963(-124);
                if (class516.method2930(var17, (byte) -106)) {
                    class259.method1565(0);
                }
                class213.field2817 = null;
                return true;
            } else if (class54.field698 == class213.field2817) {
                class429.field5775 = class289.field3807.method930(255);
                class213.field2817 = null;
                class99.field1198 = class155.field2183;
                return true;
            } else if (class95.field1146 == class213.field2817) {
                int var18 = class289.field3807.method908(false);
                int var19 = class289.field3807.method961(-4349);
                int var20 = class289.field3807.method926(-1475225768);
                if (class516.method2930(var19, (byte) -106)) {
                    class137 var21 = (class137) class152.field2079.method3057(1, (long) var18);
                    class137 var22 = (class137) class152.field2079.method3057(1, (long) var20);
                    if (var22 != null) {
                        class3.method17(-1718294864, var22, var21 == null || ~var21.field1870 != ~var22.field1870, false);
                    }
                    if (var21 != null) {
                        var21.method242(true);
                        class152.field2079.method3061(127, (long) var20, var21);
                    }
                    class423 var23 = class592.method3271(var18, (byte) -89);
                    if (var23 != null) {
                        class552.method3091(var23, 12618);
                    }
                    class423 var24 = class592.method3271(var20, (byte) -77);
                    if (var24 != null) {
                        class552.method3091(var24, 12618);
                        class583.method3218(var24, (byte) -90, true);
                    }
                    if (class164.field2349 != -1) {
                        class367.method2131(class164.field2349, 1, -1156546040);
                    }
                }
                class213.field2817 = null;
                return true;
            } else if (class401.field5318 == class213.field2817) {
                byte var25 = class289.field3807.method969(3);
                int var26 = class289.field3807.method961(-4349);
                class564.field7696.method86(var26, var25, (byte) -86);
                class213.field2817 = null;
                return true;
            } else if (class94.field1141 == class213.field2817) {
                int var27 = class289.field3807.method963(-119);
                int var28 = class289.field3807.method908(false);
                if (class516.method2930(var27, (byte) -106)) {
                    class137 var29 = (class137) class152.field2079.method3057(1, (long) var28);
                    if (var29 != null) {
                        class3.method17(-1718294864, var29, true, false);
                    }
                    if (class495.field6823 != null) {
                        class552.method3091(class495.field6823, 12618);
                        class495.field6823 = null;
                    }
                }
                class213.field2817 = null;
                return true;
            } else if (class319.field4270 == class213.field2817) {
                int var30 = class289.field3807.method963(-126);
                int var31 = class289.field3807.method930(255);
                int var32 = class289.field3807.method930(255);
                int var33 = class289.field3807.method963(-118) << 2;
                int var34 = class289.field3807.method930(255);
                int var35 = class289.field3807.method930(255);
                if (class516.method2930(var30, (byte) -106)) {
                    class643.method3581(var34, 3072, var31, var33, var35, var32);
                }
                class213.field2817 = null;
                return true;
            } else if (class325.field4380 == class213.field2817) {
                int var36 = class289.field3807.method961(-4349);
                if (~var36 == -65536) {
                    var36 = -1;
                }
                int var37 = class289.field3807.method954(2);
                int var38 = class289.field3807.method908(false);
                if (class516.method2930(var37, (byte) -106)) {
                    class695.method3924((byte) 91, 1, -1, var38, var36);
                }
                class213.field2817 = null;
                return true;
            } else if (class649.field8970 == class213.field2817) {
                int var39 = class289.field3807.method945((byte) -116);
                int var40 = class289.field3807.method961(-4349);
                if (class516.method2930(var40, (byte) -106)) {
                    class324.field4366 = var39;
                }
                class213.field2817 = null;
                return true;
            } else if (class239.field3164 == class213.field2817) {
                byte var41 = class289.field3807.method969(3);
                int var42 = class289.field3807.method931(97);
                int var43 = class289.field3807.method954(2);
                if (class516.method2930(var43, (byte) -106)) {
                    class490.method2806(var42, 1347, var41);
                }
                class213.field2817 = null;
                return true;
            } else if (class320.field4271 == class213.field2817) {
                boolean var44 = class289.field3807.method930(255) == 1;
                String var45 = class289.field3807.method925(120);
                String var46 = var45;
                if (var44) {
                    var46 = class289.field3807.method925(104);
                }
                long var47 = class289.field3807.method953(true);
                long var49 = (long) class289.field3807.method963(-119);
                long var51 = (long) class289.field3807.method933((byte) 1);
                int var53 = class289.field3807.method930(255);
                int var54 = class289.field3807.method963(-123);
                long var55 = (var49 << 32) + var51;
                boolean var57 = false;
                int var58 = 0;
                while (true) {
                    if (~var58 <= -101) {
                        if (var53 <= 1 && class451.method2537(var46, 0)) {
                            var57 = true;
                        }
                        break;
                    }
                    if (~class646.field8932[var58] == ~var55) {
                        var57 = true;
                        break;
                    }
                    ++var58;
                }
                if (!var57 && class448.field5935 == 0) {
                    class646.field8932[class623.field8637] = var55;
                    class623.field8637 = (class623.field8637 + 1) % 100;
                    String var59 = class32.field447.method2162((byte) 102, var54).method1810(-99, class289.field3807);
                    if (var53 != 2) {
                        if (~var53 != -2) {
                            class686.method3884(var45, (byte) 91, class216.method1371(var47, (byte) 123), 20, var45, var59, 0, var46, var54);
                        } else {
                            class686.method3884("<img=0>" + var45, (byte) 119, class216.method1371(var47, (byte) -74), 20, var45, var59, 0, "<img=0>" + var46, var54);
                        }
                    } else {
                        class686.method3884("<img=1>" + var45, (byte) 119, class216.method1371(var47, (byte) 115), 20, var45, var59, 0, "<img=1>" + var46, var54);
                    }
                }
                class213.field2817 = null;
                return true;
            } else if (class676.field9607 == class213.field2817) {
                String var60 = class289.field3807.method925(72);
                boolean var61 = class289.field3807.method930(255) == 1;
                String var62;
                if (var61) {
                    var62 = class289.field3807.method925(33);
                } else {
                    var62 = var60;
                }
                int var63 = class289.field3807.method963(-127);
                byte var64 = class289.field3807.method969(3);
                boolean var65 = false;
                if (~var64 == 127) {
                    var65 = true;
                }
                if (!var65) {
                    String var66 = class289.field3807.method925(81);
                    class346 var67 = new class346();
                    var67.field4617 = var60;
                    var67.field4620 = var62;
                    var67.field4624 = class55.method328(var67.field4620, (byte) -64);
                    var67.field4616 = var64;
                    var67.field4627 = var63;
                    var67.field4626 = var66;
                    int var68;
                    for (var68 = class354.field4728 + -1; var68 >= 0; --var68) {
                        int var69 = class267.field3491[var68].field4624.compareTo(var67.field4624);
                        if (var69 == 0) {
                            class267.field3491[var68].field4627 = var63;
                            class267.field3491[var68].field4616 = var64;
                            class267.field3491[var68].field4626 = var66;
                            if (var62.equals(class408.field5369.field7791)) {
                                class571.field7770 = var64;
                            }
                            class509.field7020 = class155.field2183;
                            class213.field2817 = null;
                            return true;
                        }
                        if (var69 < 0) {
                            break;
                        }
                    }
                    if (~class267.field3491.length >= ~class354.field4728) {
                        class213.field2817 = null;
                        return true;
                    }
                    for (int var70 = class354.field4728 + -1; var68 < var70; --var70) {
                        class267.field3491[var70 - -1] = class267.field3491[var70];
                    }
                    if (class354.field4728 == 0) {
                        class267.field3491 = new class346[100];
                    }
                    class267.field3491[var68 + 1] = var67;
                    ++class354.field4728;
                    if (var62.equals(class408.field5369.field7791)) {
                        class571.field7770 = var64;
                    }
                } else {
                    if (~class354.field4728 == -1) {
                        class213.field2817 = null;
                        return true;
                    }
                    boolean var71 = false;
                    int var72;
                    for (var72 = 0; ~var72 > ~class354.field4728 && (!class267.field3491[var72].field4620.equals(var62) || class267.field3491[var72].field4627 != var63); ++var72) {
                    }
                    if (~var72 > ~class354.field4728) {
                        while (var72 < class354.field4728 + -1) {
                            class267.field3491[var72] = class267.field3491[var72 + 1];
                            ++var72;
                        }
                        --class354.field4728;
                        class267.field3491[class354.field4728] = null;
                    }
                }
                class213.field2817 = null;
                class509.field7020 = class155.field2183;
                return true;
            } else if (class448.field5929 == class213.field2817) {
                int var73 = class289.field3807.method954(2);
                int var74 = class289.field3807.method931(99);
                int var75 = class289.field3807.method972(42);
                int var76 = class289.field3807.method908(false);
                if (class516.method2930(var74, (byte) -106)) {
                    class695.method3924((byte) -122, 5, var76, var75, var73);
                }
                class213.field2817 = null;
                return true;
            } else if (class90.field1098 == class213.field2817) {
                int var77 = class289.field3807.method964(61);
                int var78 = class289.field3807.method908(false);
                int var79 = class289.field3807.method930(255);
                String var80 = "";
                String var81 = var80;
                if (~(var79 & 1) != -1) {
                    var80 = class289.field3807.method925(124);
                    if ((2 & var79) == 0) {
                        var81 = var80;
                    } else {
                        var81 = class289.field3807.method925(73);
                    }
                }
                String var82 = class289.field3807.method925(68);
                if (var77 != 99) {
                    if (!var81.equals("") && class451.method2537(var81, 0)) {
                        class213.field2817 = null;
                        return true;
                    }
                    class116.method681(var80, var81, var80, 79, var78, var82, var77);
                } else {
                    class592.method3278((byte) -59, var82);
                }
                class213.field2817 = null;
                return true;
            } else if (class213.field2817 == class110.field1303) {
                class510.method2898(class425.field5728, (byte) 103);
                class213.field2817 = null;
                return true;
            } else if (class329.field4415 == class213.field2817) {
                class510.method2898(class164.field2350, (byte) 103);
                class213.field2817 = null;
                return true;
            } else if (class213.field2817 == class138.field1876) {
                int var83 = class289.field3807.method963(-128);
                int var84 = class289.field3807.method931(30);
                int var85 = class289.field3807.method935(-66);
                int var86 = class289.field3807.method931(42);
                int var87 = class289.field3807.method930(255);
                boolean var88 = ~(128 & var87) != -1;
                if (var85 >> 30 == 0) {
                    if (~(var85 >> 29) != -1) {
                        int var89 = 65535 & var85;
                        class407 var90 = (class407) class296.field3921.method3057(1, (long) var89);
                        if (var90 != null) {
                            if (~var86 == -65536) {
                                var86 = -1;
                            }
                            class351 var91 = var90.field5354;
                            boolean var92 = true;
                            int var93 = var88 ? var91.field3064 : var91.field3022;
                            if (~var86 != 0 && ~var93 != 0) {
                                if (var86 != var93) {
                                    class521 var94 = class24.field291.method2940(var86, 17);
                                    class521 var95 = class24.field291.method2940(var93, 17);
                                    if (~var94.field7228 != 0 && var95.field7228 != -1) {
                                        class186 var96 = class423.field5620.method1707(var94.field7228, -112);
                                        class186 var97 = class423.field5620.method1707(var95.field7228, 124);
                                        if (~var96.field2572 > ~var97.field2572) {
                                            var92 = false;
                                        }
                                    }
                                } else {
                                    class521 var98 = class24.field291.method2940(var86, 17);
                                    if (var98.field7219 && var98.field7228 != -1) {
                                        class186 var99 = class423.field5620.method1707(var98.field7228, -81);
                                        int var100 = var99.field2584;
                                        if (~var100 != -1 && var100 != 2) {
                                            if (var100 == 1) {
                                                var92 = true;
                                            }
                                        } else {
                                            var92 = false;
                                        }
                                    }
                                }
                            }
                            if (var92) {
                                if (var88) {
                                    var91.field2992 = var84;
                                    var91.field3059 = 0;
                                    var91.field3038 = var87 & 7;
                                    var91.field3063 = 0;
                                    var91.field3006 = class327.field4404 + var83;
                                    var91.field3064 = var86;
                                    var91.field2996 = 1;
                                    if (var91.field3006 > class327.field4404) {
                                        var91.field3063 = -1;
                                    }
                                    if (var91.field3064 != -1 && class327.field4404 == var91.field3006) {
                                        int var101 = class24.field291.method2940(var91.field3064, 17).field7228;
                                        if (var101 != -1) {
                                            class186 var102 = class423.field5620.method1707(var101, -109);
                                            if (var102 != null && var102.field2570 != null) {
                                                class615.method3398(0, var91.field398, var102, -1773, var91.field397, var91.field385, false);
                                            }
                                        }
                                    }
                                } else {
                                    var91.field3000 = 0;
                                    var91.field3040 = 0;
                                    var91.field3022 = var86;
                                    var91.field3054 = var84;
                                    var91.field3001 = 1;
                                    var91.field2999 = 7 & var87;
                                    var91.field3049 = class327.field4404 + var83;
                                    if (~class327.field4404 > ~var91.field3049) {
                                        var91.field3000 = -1;
                                    }
                                    if (var91.field3022 != -1 && ~class327.field4404 == ~var91.field3049) {
                                        int var103 = class24.field291.method2940(var91.field3022, 17).field7228;
                                        if (~var103 != 0) {
                                            class186 var104 = class423.field5620.method1707(var103, -75);
                                            if (var104 != null && var104.field2570 != null) {
                                                class615.method3398(0, var91.field398, var104, -1773, var91.field397, var91.field385, false);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else if (~(var85 >> 28) != -1) {
                        int var105 = var85 & 65535;
                        class573 var106;
                        if (class423.field5702 == var105) {
                            var106 = class408.field5369;
                        } else {
                            var106 = class513.field7145[var105];
                        }
                        if (var106 != null) {
                            if (~var86 == -65536) {
                                var86 = -1;
                            }
                            boolean var107 = true;
                            int var108 = !var88 ? var106.field3022 : var106.field3064;
                            if (~var86 != 0 && var108 != -1) {
                                if (var86 == var108) {
                                    class521 var109 = class24.field291.method2940(var86, 17);
                                    if (var109.field7219 && ~var109.field7228 != 0) {
                                        class186 var110 = class423.field5620.method1707(var109.field7228, -115);
                                        int var111 = var110.field2584;
                                        if (~var111 != -1 && ~var111 != -3) {
                                            if (~var111 == -2) {
                                                var107 = true;
                                            }
                                        } else {
                                            var107 = false;
                                        }
                                    }
                                } else {
                                    class521 var112 = class24.field291.method2940(var86, 17);
                                    class521 var113 = class24.field291.method2940(var108, 17);
                                    if (var112.field7228 != -1 && ~var113.field7228 != 0) {
                                        class186 var114 = class423.field5620.method1707(var112.field7228, -110);
                                        class186 var115 = class423.field5620.method1707(var113.field7228, -114);
                                        if (var115.field2572 > var114.field2572) {
                                            var107 = false;
                                        }
                                    }
                                }
                            }
                            if (var107) {
                                if (!var88) {
                                    var106.field3001 = 1;
                                    var106.field3049 = class327.field4404 - -var83;
                                    var106.field3054 = var84;
                                    var106.field3000 = 0;
                                    var106.field3022 = var86;
                                    var106.field2999 = var87 & 7;
                                    var106.field3040 = 0;
                                    if (var106.field3022 == 65535) {
                                        var106.field3022 = -1;
                                    }
                                    if (~class327.field4404 > ~var106.field3049) {
                                        var106.field3000 = -1;
                                    }
                                    if (var106.field3022 != -1 && ~class327.field4404 == ~var106.field3049) {
                                        int var116 = class24.field291.method2940(var106.field3022, 17).field7228;
                                        if (~var116 != 0) {
                                            class186 var117 = class423.field5620.method1707(var116, -106);
                                            if (var117 != null && var117.field2570 != null) {
                                                class615.method3398(0, var106.field398, var117, -1773, var106.field397, var106.field385, class408.field5369 == var106);
                                            }
                                        }
                                    }
                                } else {
                                    var106.field3064 = var86;
                                    var106.field3063 = 0;
                                    var106.field2996 = 1;
                                    var106.field2992 = var84;
                                    var106.field3038 = var87 & 7;
                                    var106.field3006 = class327.field4404 + var83;
                                    var106.field3059 = 0;
                                    if (var106.field3064 == 65535) {
                                        var106.field3064 = -1;
                                    }
                                    if (~var106.field3006 < ~class327.field4404) {
                                        var106.field3063 = -1;
                                    }
                                    if (var106.field3064 != -1 && ~class327.field4404 == ~var106.field3006) {
                                        int var118 = class24.field291.method2940(var106.field3064, 17).field7228;
                                        if (var118 != -1) {
                                            class186 var119 = class423.field5620.method1707(var118, 53);
                                            if (var119 != null && var119.field2570 != null) {
                                                class615.method3398(0, var106.field398, var119, -1773, var106.field397, var106.field385, class408.field5369 == var106);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    int var120 = var85 >> 28 & 3;
                    int var121 = (var85 >> 14 & 16383) + -class125.field1745;
                    int var122 = (16383 & var85) + -class4.field23;
                    if (var121 >= 0 && ~var122 <= -1 && var121 < class703.field9886 && ~class431.field5789 < ~var122) {
                        int var123 = var121 * 512 + 256;
                        int var124 = var122 * 512 + 256;
                        int var125 = var120;
                        if (var120 < 3 && class8.method44(var122, var121, 15090)) {
                            var125 = var120 + 1;
                        }
                        class523 var126 = new class523(var86, 0, class327.field4404, var120, var125, var123, -var84 + class180.method1211(var120, true, var123, var124), var124, var121, var121, var122, var122, 7 & var87);
                        class519.field7193.method2507(new class314(var126), (byte) -124);
                    }
                }
                class213.field2817 = null;
                return true;
            } else if (class588.field8115 == class213.field2817) {
                class510.method2898(class377.field4998, (byte) 103);
                class213.field2817 = null;
                return true;
            } else if (class677.field9633 == class213.field2817) {
                int var127 = class289.field3807.method954(2);
                int var128 = class289.field3807.method926(-1475225768);
                class564.field7696.method94(0, var128, var127);
                class213.field2817 = null;
                return true;
            } else if (class565.field7706 == class213.field2817) {
                boolean var129 = class289.field3807.method930(255) == 1;
                String var130 = class289.field3807.method925(93);
                String var131 = var130;
                if (var129) {
                    var131 = class289.field3807.method925(105);
                }
                long var132 = class289.field3807.method953(true);
                long var134 = (long) class289.field3807.method963(-122);
                long var136 = (long) class289.field3807.method933((byte) 1);
                int var138 = class289.field3807.method930(255);
                long var139 = (var134 << 32) - -var136;
                boolean var141 = false;
                int var142 = 0;
                while (true) {
                    if (var142 >= 100) {
                        if (var138 <= 1) {
                            if ((!class227.field2946 || class187.field2601) && !class26.field344) {
                                if (class451.method2537(var131, 0)) {
                                    var141 = true;
                                }
                            } else {
                                var141 = true;
                            }
                        }
                        break;
                    }
                    if (class646.field8932[var142] == var139) {
                        var141 = true;
                        break;
                    }
                    ++var142;
                }
                if (!var141 && class448.field5935 == 0) {
                    class646.field8932[class623.field8637] = var139;
                    class623.field8637 = (class623.field8637 - -1) % 100;
                    String var143 = class663.method3784((byte) 104, class110.method599((byte) -88, class289.field3807));
                    if (~var138 != -3 && ~var138 != -4) {
                        if (var138 != 1) {
                            class686.method3884(var130, (byte) 103, class216.method1371(var132, (byte) 54), 9, var130, var143, 0, var131, -1);
                        } else {
                            class686.method3884("<img=0>" + var130, (byte) 111, class216.method1371(var132, (byte) -117), 9, var130, var143, 0, "<img=0>" + var131, -1);
                        }
                    } else {
                        class686.method3884("<img=1>" + var130, (byte) 127, class216.method1371(var132, (byte) -97), 9, var130, var143, 0, "<img=1>" + var131, -1);
                    }
                }
                class213.field2817 = null;
                return true;
            } else if (class323.field4361 == class213.field2817) {
                int var144 = class289.field3807.method963(-128);
                int var145 = class289.field3807.method908(false);
                class564.field7696.method86(var144, var145, (byte) 120);
                class213.field2817 = null;
                return true;
            } else if (class649.field8966 == class213.field2817) {
                class510.method2898(class57.field729, (byte) 103);
                class213.field2817 = null;
                return true;
            } else if (class462.field6064 == class213.field2817) {
                class502.method2850(class289.field3807, class151.field2070, class312.field4206, -1);
                class213.field2817 = null;
                return true;
            } else if (class63.field800 == class213.field2817) {
                int var146 = class289.field3807.method963(-126);
                int var147 = class289.field3807.method972(119);
                int var148 = class289.field3807.method961(-4349);
                if (var148 == 65535) {
                    var148 = -1;
                }
                if (class516.method2930(var146, (byte) -106)) {
                    class695.method3924((byte) -19, 2, -1, var147, var148);
                }
                class213.field2817 = null;
                return true;
            } else if (class213.field2817 == class150.field2050) {
                class510.method2898(class83.field992, (byte) 103);
                class213.field2817 = null;
                return true;
            } else if (class404.field5343 == class213.field2817) {
                int var149 = class289.field3807.method931(54);
                int var150 = class289.field3807.method972(39);
                int var151 = class289.field3807.method954(2);
                if (class516.method2930(var151, (byte) -106)) {
                    class490.method2806(var149, 1347, var150);
                }
                class213.field2817 = null;
                return true;
            } else if (class213.field2817 == class172.field2444) {
                int var152 = class289.field3807.method963(-126);
                int var153 = class289.field3807.method930(255);
                boolean var154 = ~(var153 & 1) == -2;
                class645.method3590(var152, 0, var154);
                int var155 = class289.field3807.method963(-127);
                for (int var156 = 0; ~var155 < ~var156; ++var156) {
                    int var157 = class289.field3807.method961(-4349);
                    int var158 = class289.field3807.method919(88);
                    if (~var158 == -256) {
                        var158 = class289.field3807.method972(108);
                    }
                    class316.method1847(var158, 120, var152, var154, var157 - 1, var156);
                }
                class399.field5289[class15.method97(class466.field6128++, 31)] = var152;
                class213.field2817 = null;
                return true;
            } else if (class213.field2817 == class196.field2681) {
                int var159 = class289.field3807.method954(2);
                if (~var159 == -65536) {
                    var159 = -1;
                }
                int var160 = class289.field3807.method930(255);
                int var161 = class289.field3807.method945((byte) -116);
                class85.method462(var160, 15629, var159, var161);
                class213.field2817 = null;
                return true;
            } else if (class595.field8208 == class213.field2817) {
                int var162 = class289.field3807.method920((byte) 114);
                int var163 = class289.field3807.method919(-5);
                int var164 = class289.field3807.method961(-4349);
                if (var164 == 65535) {
                    var164 = -1;
                }
                class57.method334(0, var164, var162, var163);
                class213.field2817 = null;
                return true;
            } else if (class701.field9868 == class213.field2817) {
                class141.field1916 = class289.field3807.method930(255);
                class338.field4555 = class289.field3807.method945((byte) -115);
                class213.field2817 = null;
                return true;
            } else if (class27.field394 == class213.field2817) {
                int var165 = class289.field3807.method963(-120);
                if (var165 == 65535) {
                    var165 = -1;
                }
                int var166 = class289.field3807.method930(255);
                int var167 = class289.field3807.method963(-122);
                int var168 = class289.field3807.method930(255);
                class609.method3379(var165, var167, var166, var168, -123, false);
                class213.field2817 = null;
                return true;
            } else if (class698.field9855 == class213.field2817) {
                int var169 = class289.field3807.method930(255);
                int var170 = var169 >> 5;
                int var171 = var169 & 31;
                if (var171 == 0) {
                    class121.field1575[var170] = null;
                    class213.field2817 = null;
                    return true;
                } else {
                    class669 var172 = new class669();
                    var172.field9508 = var171;
                    var172.field9510 = class289.field3807.method930(255);
                    if (~var172.field9510 <= -1 && class623.field8633.length > var172.field9510) {
                        if (~var172.field9508 != -2 && var172.field9508 != 10) {
                            if (~var172.field9508 <= -3 && var172.field9508 <= 6) {
                                if (var172.field9508 == 2) {
                                    var172.field9511 = 256;
                                    var172.field9504 = 256;
                                }
                                if (~var172.field9508 == -4) {
                                    var172.field9504 = 0;
                                    var172.field9511 = 256;
                                }
                                if (var172.field9508 == 4) {
                                    var172.field9504 = 512;
                                    var172.field9511 = 256;
                                }
                                if (~var172.field9508 == -6) {
                                    var172.field9504 = 256;
                                    var172.field9511 = 0;
                                }
                                if (var172.field9508 == 6) {
                                    var172.field9504 = 256;
                                    var172.field9511 = 512;
                                }
                                var172.field9508 = 2;
                                var172.field9506 = class289.field3807.method930(255);
                                var172.field9504 += class289.field3807.method963(-127) + -class125.field1745 << 9;
                                var172.field9511 += class289.field3807.method963(-124) + -class4.field23 << 9;
                                var172.field9517 = class289.field3807.method930(255) << 2;
                                var172.field9507 = class289.field3807.method963(-124);
                            }
                        } else {
                            var172.field9513 = class289.field3807.method963(-119);
                            class289.field3807.field2219 += 6;
                        }
                        var172.field9512 = class289.field3807.method963(-124);
                        if (var172.field9512 == 65535) {
                            var172.field9512 = -1;
                        }
                        class121.field1575[var170] = var172;
                    }
                    class213.field2817 = null;
                    return true;
                }
            } else if (class338.field4553 == class213.field2817) {
                int var173 = class289.field3807.method935(-54);
                int var174 = class289.field3807.method931(105);
                if (class516.method2930(var174, (byte) -106)) {
                    if (~var173 != 0) {
                        int var175 = 16383 & var173 >> 14;
                        int var176 = var175 - class125.field1745;
                        int var177 = var173 & 16383;
                        int var178 = var177 - class4.field23;
                        if (~var176 > -1) {
                            var176 = 0;
                        } else if (~class703.field9886 >= ~var176) {
                            var176 = class703.field9886;
                        }
                        class342.field4585 = (var176 << 9) + 256;
                        if (var178 < 0) {
                            var178 = 0;
                        } else if (var178 >= class431.field5789) {
                            var178 = class431.field5789;
                        }
                        class83.field1004 = (var178 << 9) + 256;
                    } else {
                        class83.field1004 = -1;
                        class342.field4585 = -1;
                    }
                }
                class213.field2817 = null;
                return true;
            } else if (class213.field2817 == class129.field1781) {
                int var179 = class289.field3807.method961(-4349);
                int var180 = class289.field3807.method909(16);
                int var181 = class289.field3807.method954(2);
                if (class516.method2930(var179, (byte) -106)) {
                    if (var180 == 2) {
                        class385.method2207(false);
                    }
                    class164.field2349 = var181;
                    class545.method3049(var181, -20934);
                    class166.method1012(34, false);
                    class656.method3741(class164.field2349);
                    for (int var182 = 0; var182 < 100; ++var182) {
                        class325.field4383[var182] = true;
                    }
                }
                class213.field2817 = null;
                return true;
            } else if (class666.field9475 == class213.field2817) {
                boolean var183 = ~class289.field3807.method930(255) == -2;
                String var184 = class289.field3807.method925(81);
                String var185 = var184;
                if (var183) {
                    var185 = class289.field3807.method925(81);
                }
                long var186 = (long) class289.field3807.method963(-127);
                long var188 = (long) class289.field3807.method933((byte) 1);
                int var190 = class289.field3807.method930(255);
                long var191 = (var186 << 32) + var188;
                boolean var193 = false;
                int var194 = 0;
                while (true) {
                    if (~var194 <= -101) {
                        if (var190 <= 1) {
                            if ((!class227.field2946 || class187.field2601) && !class26.field344) {
                                if (class451.method2537(var185, 0)) {
                                    var193 = true;
                                }
                            } else {
                                var193 = true;
                            }
                        }
                        break;
                    }
                    if (class646.field8932[var194] == var191) {
                        var193 = true;
                        break;
                    }
                    ++var194;
                }
                if (!var193 && ~class448.field5935 == -1) {
                    class646.field8932[class623.field8637] = var191;
                    class623.field8637 = (class623.field8637 + 1) % 100;
                    String var195 = class663.method3784((byte) 104, class110.method599((byte) -88, class289.field3807));
                    if (var190 != 2) {
                        if (var190 != 1) {
                            class686.method3884(var184, (byte) 111, (String) null, 3, var184, var195, 0, var185, -1);
                        } else {
                            class686.method3884("<img=0>" + var184, (byte) 94, (String) null, 7, var184, var195, 0, "<img=0>" + var185, -1);
                        }
                    } else {
                        class686.method3884("<img=1>" + var184, (byte) 115, (String) null, 7, var184, var195, 0, "<img=1>" + var185, -1);
                    }
                }
                class213.field2817 = null;
                return true;
            } else if (class665.field9463 == class213.field2817) {
                int var196 = class289.field3807.method919(-38);
                int var197 = class289.field3807.method935(-126);
                int var198 = class289.field3807.method909(16);
                class153.field2167[var198] = var197;
                class692.field9756[var198] = var196;
                class592.field8160[var198] = 1;
                int var199 = class195.field2680[var198] + -1;
                for (int var200 = 0; var200 < var199; ++var200) {
                    if (var197 >= class490.field6783[var200]) {
                        class592.field8160[var198] = var200 + 2;
                    }
                }
                class703.field9879[class15.method97(class614.field8510++, 31)] = var198;
                class213.field2817 = null;
                return true;
            } else if (class316.field4233 == class213.field2817) {
                int var201 = class289.field3807.method908(false);
                int var202 = class289.field3807.method930(255);
                int var203 = class289.field3807.method954(2);
                int var204 = class289.field3807.method961(-4349);
                if (class516.method2930(var204, (byte) -106)) {
                    class137 var205 = (class137) class152.field2079.method3057(1, (long) var201);
                    if (var205 != null) {
                        class3.method17(-1718294864, var205, var205.field1870 != var203, false);
                    }
                    class188.method1243(false, var202, var201, 106, var203);
                }
                class213.field2817 = null;
                return true;
            } else if (class314.field4213 == class213.field2817) {
                boolean var206 = class289.field3807.method930(255) == 1;
                String var207 = class289.field3807.method925(80);
                String var208 = var207;
                if (var206) {
                    var208 = class289.field3807.method925(52);
                }
                long var209 = (long) class289.field3807.method963(-121);
                long var211 = (long) class289.field3807.method933((byte) 1);
                int var213 = class289.field3807.method930(255);
                int var214 = class289.field3807.method963(-120);
                long var215 = (var209 << 32) + var211;
                boolean var217 = false;
                int var218 = 0;
                while (true) {
                    if (~var218 <= -101) {
                        if (var213 <= 1 && class451.method2537(var208, 0)) {
                            var217 = true;
                        }
                        break;
                    }
                    if (class646.field8932[var218] == var215) {
                        var217 = true;
                        break;
                    }
                    ++var218;
                }
                if (!var217 && class448.field5935 == 0) {
                    class646.field8932[class623.field8637] = var215;
                    class623.field8637 = (class623.field8637 - -1) % 100;
                    String var219 = class32.field447.method2162((byte) 102, var214).method1810(-108, class289.field3807);
                    if (var213 == 2) {
                        class686.method3884("<img=1>" + var207, (byte) 111, (String) null, 18, var207, var219, 0, "<img=1>" + var208, var214);
                    } else if (var213 == 1) {
                        class686.method3884("<img=0>" + var207, (byte) 102, (String) null, 18, var207, var219, 0, "<img=0>" + var208, var214);
                    } else {
                        class686.method3884(var207, (byte) 97, (String) null, 18, var207, var219, 0, var208, var214);
                    }
                }
                class213.field2817 = null;
                return true;
            } else if (class581.field7932 == class213.field2817) {
                String var220 = class289.field3807.method925(44);
                int var221 = class289.field3807.method963(-123);
                String var222 = class32.field447.method2162((byte) 102, var221).method1810(-89, class289.field3807);
                class686.method3884(var220, (byte) 105, (String) null, 19, var220, var222, 0, var220, var221);
                class213.field2817 = null;
                return true;
            } else if (class95.field1149 == class213.field2817) {
                int var223 = class289.field3807.method963(-121);
                class573 var224;
                if (class423.field5702 == var223) {
                    var224 = class408.field5369;
                } else {
                    var224 = class513.field7145[var223];
                }
                if (var224 == null) {
                    class213.field2817 = null;
                    return true;
                } else {
                    int var225 = class289.field3807.method963(-128);
                    int var226 = class289.field3807.method930(255);
                    boolean var227 = ~(32768 & var225) != -1;
                    if (var224.field7791 != null && var224.field7810 != null) {
                        boolean var228 = false;
                        if (var226 <= 1) {
                            if (var227 || (!class227.field2946 || class187.field2601) && !class26.field344) {
                                if (class451.method2537(var224.field7791, 0)) {
                                    var228 = true;
                                }
                            } else {
                                var228 = true;
                            }
                        }
                        if (!var228 && class448.field5935 == 0) {
                            int var229 = -1;
                            String var231;
                            if (var227) {
                                var225 &= 32767;
                                class52 var230 = class635.method3518(59, class289.field3807);
                                var229 = var230.field663;
                                var231 = var230.field664.method1810(-85, class289.field3807);
                            } else {
                                var231 = class663.method3784((byte) 104, class110.method599((byte) -88, class289.field3807));
                            }
                            var224.field3062 = var231.trim();
                            var224.field3077 = 150;
                            var224.field3072 = var225 & 255;
                            var224.field3019 = var225 >> 8;
                            int var232;
                            if (var226 != 1 && var226 != 2) {
                                var232 = var227 ? 17 : 2;
                            } else {
                                var232 = var227 ? 17 : 1;
                            }
                            if (~var226 == -3) {
                                class686.method3884("<img=1>" + var224.method3173(true, (byte) 0), (byte) 111, (String) null, var232, var224.field7811, var231, 0, "<img=1>" + var224.method3171(false, (byte) -109), var229);
                            } else if (~var226 != -2) {
                                class686.method3884(var224.method3173(true, (byte) 0), (byte) 111, (String) null, var232, var224.field7811, var231, 0, var224.method3171(false, (byte) -66), var229);
                            } else {
                                class686.method3884("<img=0>" + var224.method3173(true, (byte) 0), (byte) 102, (String) null, var232, var224.field7811, var231, 0, "<img=0>" + var224.method3171(false, (byte) -49), var229);
                            }
                        }
                    }
                    class213.field2817 = null;
                    return true;
                }
            } else if (class595.field8204 == class213.field2817) {
                class510.method2898(class204.field2737, (byte) 103);
                class213.field2817 = null;
                return true;
            } else if (class213.field2817 == class184.field2560) {
                class421.field5527 = class144.method824(class289.field3807.method930(255), 99);
                class213.field2817 = null;
                return true;
            } else if (class550.field7511 == class213.field2817) {
                int var233 = class289.field3807.method963(-124);
                int var234 = class289.field3807.method909(16);
                class564.field7696.method94(0, var234, var233);
                class213.field2817 = null;
                return true;
            } else if (class66.field815 == class213.field2817) {
                String var235 = class289.field3807.method925(70);
                int var236 = class289.field3807.method961(-4349);
                int var237 = class289.field3807.method961(-4349);
                if (class516.method2930(var237, (byte) -106)) {
                    class103.method571(var236, (byte) 125, var235);
                }
                class213.field2817 = null;
                return true;
            } else if (class468.field6144 == class213.field2817) {
                class77.field914 = class289.field3807.method969(3) << 3;
                class366.field4828 = class289.field3807.method919(-54);
                class114.field1463 = class289.field3807.method924(26) << 3;
                for (class543 var238 = (class543) class290.field3835.method3053((byte) 96); var238 != null; var238 = (class543) class290.field3835.method3056(18113)) {
                    int var240 = (int) (3L & var238.field545 >> 28);
                    int var241 = (int) (var238.field545 & 16383L);
                    int var242 = -class125.field1745 + var241;
                    int var243 = (int) (16383L & var238.field545 >> 14);
                    int var244 = -class4.field23 + var243;
                    if (class366.field4828 == var240 && var242 >= class77.field914 && class77.field914 - -8 > var242 && ~class114.field1463 >= ~var244 && var244 < class114.field1463 + 8) {
                        var238.method242(true);
                        if (var242 >= 0 && var244 >= 0 && class703.field9886 > var242 && var244 < class431.field5789) {
                            class215.method1369(-1257869271, var242, var244, class366.field4828);
                        }
                    }
                }
                for (class464 var239 = (class464) class467.field6131.method2506(68); var239 != null; var239 = (class464) class467.field6131.method2505(-127)) {
                    if (class77.field914 <= var239.field6082 && var239.field6082 < class77.field914 - -8 && ~class114.field1463 >= ~var239.field6080 && ~var239.field6080 > ~(class114.field1463 + 8) && class366.field4828 == var239.field6074) {
                        var239.field6083 = 0;
                    }
                }
                class213.field2817 = null;
                return true;
            } else if (class446.field5913 == class213.field2817) {
                if (~class164.field2349 != 0) {
                    class367.method2131(class164.field2349, 0, -1156546040);
                }
                class213.field2817 = null;
                return true;
            } else if (class457.field6004 == class213.field2817) {
                boolean var245 = class289.field3807.method930(255) == 1;
                String var246 = class289.field3807.method925(87);
                String var247 = var246;
                if (var245) {
                    var247 = class289.field3807.method925(62);
                }
                int var248 = class289.field3807.method930(255);
                boolean var249 = false;
                if (var248 <= 1) {
                    if ((!class227.field2946 || class187.field2601) && !class26.field344) {
                        if (~var248 >= -2 && class451.method2537(var247, 0)) {
                            var249 = true;
                        }
                    } else {
                        var249 = true;
                    }
                }
                if (!var249 && ~class448.field5935 == -1) {
                    String var250 = class663.method3784((byte) 104, class110.method599((byte) -88, class289.field3807));
                    if (var248 != 2) {
                        if (~var248 != -2) {
                            class686.method3884(var246, (byte) 92, (String) null, 24, var246, var250, 0, var247, -1);
                        } else {
                            class686.method3884("<img=0>" + var246, (byte) 99, (String) null, 24, var246, var250, 0, "<img=0>" + var247, -1);
                        }
                    } else {
                        class686.method3884("<img=1>" + var246, (byte) 119, (String) null, 24, var246, var250, 0, "<img=1>" + var247, -1);
                    }
                }
                class213.field2817 = null;
                return true;
            } else if (class391.field5232 == class213.field2817) {
                int var251 = class289.field3807.method954(2);
                int var252 = class289.field3807.method926(-1475225768);
                if (class516.method2930(var251, (byte) -106)) {
                    class695.method3924((byte) 19, 3, -1, var252, -1);
                }
                class213.field2817 = null;
                return true;
            } else if (class358.field4768 == class213.field2817) {
                class510.method2898(class111.field1414, (byte) 103);
                class213.field2817 = null;
                return true;
            } else if (class389.field5209 == class213.field2817) {
                class510.method2898(class704.field9939, (byte) 103);
                class213.field2817 = null;
                return true;
            } else if (class213.field2817 == class210.field2801) {
                int var253 = class289.field3807.method963(-125);
                int var254 = class289.field3807.method930(255);
                boolean var255 = ~(var254 & 1) == -2;
                while (class151.field2070 > class289.field3807.field2219) {
                    int var256 = class289.field3807.method964(99);
                    int var257 = class289.field3807.method963(-126);
                    int var258 = 0;
                    if (var257 != 0) {
                        var258 = class289.field3807.method930(255);
                        if (~var258 == -256) {
                            var258 = class289.field3807.method908(false);
                        }
                    }
                    class316.method1847(var258, -75, var253, var255, var257 + -1, var256);
                }
                class399.field5289[class15.method97(31, class466.field6128++)] = var253;
                class213.field2817 = null;
                return true;
            } else if (class43.field532 == class213.field2817) {
                int var259 = class289.field3807.method963(-121);
                int var260 = class289.field3807.method963(-127);
                int var261 = class289.field3807.method963(-121);
                int var262 = class289.field3807.method963(-125);
                if (class516.method2930(var259, (byte) -106) && class124.field1729[var260] != null) {
                    for (int var263 = var261; var262 > var263; ++var263) {
                        int var264 = class289.field3807.method933((byte) 1);
                        if (~class124.field1729[var260].length < ~var263 && class124.field1729[var260][var263] != null) {
                            class124.field1729[var260][var263].field5674 = var264;
                        }
                    }
                }
                class213.field2817 = null;
                return true;
            } else if (class429.field5773 == class213.field2817) {
                class657.field9361 = class289.field3807.method930(255);
                class213.field2817 = null;
                return true;
            } else if (class89.field1080 == class213.field2817) {
                int var265 = class289.field3807.method930(255);
                int var266 = class289.field3807.method931(116);
                boolean var267 = ~(1 & var265) == -2;
                class566.method3136(var266, var267, 70);
                class399.field5289[class15.method97(class466.field6128++, 31)] = var266;
                class213.field2817 = null;
                return true;
            } else if (class394.field5259 == class213.field2817) {
                int var268 = class289.field3807.method961(-4349);
                int var269 = class289.field3807.method935(-73);
                int var270 = class289.field3807.method930(255);
                if (class516.method2930(var268, (byte) -106)) {
                    class191.method1258((byte) 113, var269, var270);
                }
                class213.field2817 = null;
                return true;
            } else if (class213.field2817 == class172.field2442) {
                int var271 = class289.field3807.method909(16);
                int var272 = var271 >> 2;
                int var273 = var271 & 3;
                int var274 = class364.field4807[var272];
                int var275 = class289.field3807.method931(56);
                if (var275 == 65535) {
                    var275 = -1;
                }
                int var276 = class289.field3807.method935(-42);
                int var277 = (942181459 & var276) >> 28;
                int var278 = var276 >> 14 & 16383;
                int var279 = var278 - class125.field1745;
                int var280 = 16383 & var276;
                int var281 = var280 - class4.field23;
                class208.method1320(150, var281, var272, var275, var273, var274, var279, var277);
                class213.field2817 = null;
                return true;
            } else if (class43.field531 == class213.field2817) {
                int var282 = class289.field3807.method909(16);
                int[] var283 = new int[4];
                for (int var284 = 0; var284 < 4; ++var284) {
                    var283[var284] = class289.field3807.method963(-122);
                }
                int var285 = class289.field3807.method963(-124);
                class407 var286 = (class407) class296.field3921.method3057(1, (long) var285);
                if (var286 != null) {
                    class131.method768(var286.field5354, var282, -1, var283);
                }
                class213.field2817 = null;
                return true;
            } else if (class83.field1007 == class213.field2817) {
                class548.method3071(false, 0);
                class213.field2817 = null;
                return true;
            } else if (class56.field727 == class213.field2817) {
                class213.field2817 = null;
                return false;
            } else if (class377.field4988 == class213.field2817) {
                class669.method3801((byte) 122, false);
                class213.field2817 = null;
                return false;
            } else if (class615.field8521 == class213.field2817) {
                class32.field453 = class289.field3807.method928(2016790224);
                class213.field2817 = null;
                class99.field1198 = class155.field2183;
                return true;
            } else if (class276.field3669 == class213.field2817) {
                int var287 = class289.field3807.method972(65);
                int var288 = class289.field3807.method954(2);
                if (var288 == 65535) {
                    var288 = -1;
                }
                int var289 = class289.field3807.method926(-1475225768);
                int var290 = class289.field3807.method954(2);
                int var291 = class289.field3807.method954(2);
                if (var291 == 65535) {
                    var291 = -1;
                }
                if (class516.method2930(var290, (byte) -106)) {
                    for (int var292 = var291; ~var288 <= ~var292; ++var292) {
                        long var293 = ((long) var287 << 32) + (long) var292;
                        class5 var295 = (class5) class608.field8455.method3057(1, var293);
                        class5 var296;
                        if (var295 != null) {
                            var296 = new class5(var289, var295.field52);
                            var295.method242(true);
                        } else if (~var292 == 0) {
                            var296 = new class5(var289, class592.method3271(var287, (byte) -90).field5696.field52);
                        } else {
                            var296 = new class5(var289, -1);
                        }
                        class608.field8455.method3061(124, var293, var296);
                    }
                }
                class213.field2817 = null;
                return true;
            } else if (class572.field7772 == class213.field2817) {
                class289.field3807.field2219 += 28;
                if (class289.field3807.method941(4)) {
                    class10.method55(class289.field3807.field2219 + -28, false, class289.field3807);
                }
                class213.field2817 = null;
                return true;
            } else if (class445.field5898 == class213.field2817) {
                int var297 = class289.field3807.method908(false);
                class582.field7965 = class312.field4206.method2226(var297, true);
                class213.field2817 = null;
                return true;
            } else if (class338.field4552 == class213.field2817) {
                int var298 = class289.field3807.method954(2);
                int var299 = class289.field3807.method926(-1475225768);
                if (class516.method2930(var298, (byte) -106)) {
                    class695.method3924((byte) -123, 5, 0, var299, class423.field5702);
                }
                class213.field2817 = null;
                return true;
            } else if (class460.field6021 == class213.field2817) {
                int var300 = class289.field3807.method963(-118);
                if (~var300 == -65536) {
                    var300 = -1;
                }
                int var301 = class289.field3807.method930(255);
                int var302 = class289.field3807.method963(-124);
                int var303 = class289.field3807.method930(255);
                class609.method3379(var300, var302, var301, var303, -76, true);
                class213.field2817 = null;
                return true;
            } else if (class347.field4628 == class213.field2817) {
                int var304 = class289.field3807.method945((byte) -109);
                int var305 = class289.field3807.method930(255);
                int var306 = class289.field3807.method931(40);
                if (~var306 == -65536) {
                    var306 = -1;
                }
                String var307 = class289.field3807.method925(125);
                if (~var305 <= -2 && ~var305 >= -9) {
                    if (var307.equalsIgnoreCase("null")) {
                        var307 = null;
                    }
                    class18.field229[var305 + -1] = var307;
                    class557.field7599[var305 + -1] = var306;
                    class31.field431[var305 + -1] = ~var304 == -1;
                }
                class213.field2817 = null;
                return true;
            } else if (class213.field2817 == class104.field1237) {
                int var308 = class289.field3807.method963(-128);
                if (~var308 == -65536) {
                    var308 = -1;
                }
                int var309 = class289.field3807.method930(255);
                int var310 = class289.field3807.method963(-128);
                int var311 = class289.field3807.method930(255);
                class493.method2816(var309, var308, 3, var311, var310);
                class213.field2817 = null;
                return true;
            } else if (class51.field644 == class213.field2817) {
                int var312 = class289.field3807.method954(2);
                int var313 = class289.field3807.method961(-4349);
                if (~var313 == -65536) {
                    var313 = -1;
                }
                int var314 = class289.field3807.method963(-122);
                int var315 = class289.field3807.method954(2);
                if (var315 == 65535) {
                    var315 = -1;
                }
                int var316 = class289.field3807.method926(-1475225768);
                if (class516.method2930(var314, (byte) -106)) {
                    for (int var317 = var313; var315 >= var317; ++var317) {
                        long var318 = ((long) var316 << 32) + (long) var317;
                        class5 var320 = (class5) class608.field8455.method3057(1, var318);
                        class5 var321;
                        if (var320 != null) {
                            var321 = new class5(var320.field48, var312);
                            var320.method242(true);
                        } else if (~var317 != 0) {
                            var321 = new class5(0, var312);
                        } else {
                            var321 = new class5(class592.method3271(var316, (byte) -82).field5696.field48, var312);
                        }
                        class608.field8455.method3061(124, var318, var321);
                    }
                }
                class213.field2817 = null;
                return true;
            } else if (class342.field4580 == class213.field2817) {
                int var322 = class289.field3807.method963(-124);
                int var323 = class289.field3807.method954(2);
                if (var323 == 65535) {
                    var323 = -1;
                }
                int var324 = class289.field3807.method972(41);
                if (class516.method2930(var322, (byte) -106)) {
                    class377.method2159(var324, var323, false);
                }
                class213.field2817 = null;
                return true;
            } else if (class701.field9867 == class213.field2817) {
                class669.method3803(class289.field3807.method925(52), -101);
                class213.field2817 = null;
                return true;
            } else if (class59.field748 == class213.field2817) {
                class337.method1975(class289.field3807, (byte) 87, class151.field2070);
                class213.field2817 = null;
                return true;
            } else if (class540.field7402 == class213.field2817) {
                int var325 = class289.field3807.method963(-125);
                if (class516.method2930(var325, (byte) -106)) {
                    class649.method3602((byte) -116);
                }
                class213.field2817 = null;
                return true;
            } else if (class463.field6070 == class213.field2817) {
                int var326 = class289.field3807.method961(-4349);
                int var327 = class289.field3807.method931(76);
                int var328 = class289.field3807.method935(-85);
                if (class516.method2930(var326, (byte) -106)) {
                    class353.method2087(var328, -19472, var327);
                }
                class213.field2817 = null;
                return true;
            } else if (class249.field3241 == class213.field2817) {
                class510.method2898(class228.field2959, (byte) 103);
                class213.field2817 = null;
                return true;
            } else if (class450.field5942 == class213.field2817) {
                String var329 = class289.field3807.method925(53);
                String var330 = class663.method3784((byte) 104, class110.method599((byte) -88, class289.field3807));
                class116.method681(var329, var329, var329, 104, 0, var330, 6);
                class213.field2817 = null;
                return true;
            } else if (class460.field6024 == class213.field2817) {
                for (int var331 = 0; class513.field7145.length > var331; ++var331) {
                    if (class513.field7145[var331] != null) {
                        class513.field7145[var331].field2989 = null;
                        class513.field7145[var331].field3048 = -1;
                    }
                }
                for (int var332 = 0; var332 < class468.field6163; ++var332) {
                    class591.field8148[var332].field5354.field2989 = null;
                    class591.field8148[var332].field5354.field3048 = -1;
                }
                class213.field2817 = null;
                return true;
            } else if (class594.field8194 == class213.field2817) {
                int var333 = class289.field3807.method931(47);
                int var334 = class289.field3807.method972(19);
                int var335 = class289.field3807.method961(-4349);
                if (class516.method2930(var333, (byte) -106)) {
                    class404.method2307(var335, 6, var334);
                }
                class213.field2817 = null;
                return true;
            } else if (class213.field2817 == class110.field1294) {
                int var336 = class289.field3807.method931(126);
                int var337 = class289.field3807.method961(-4349);
                int var338 = class289.field3807.method954(2);
                int var339 = class289.field3807.method931(82);
                int var340 = class289.field3807.method935(-43);
                if (class516.method2930(var337, (byte) -106)) {
                    class418.method2368(var340, var336, var339, 34336, var338);
                }
                class213.field2817 = null;
                return true;
            } else if (class213.field2817 == class134.field1851) {
                int var341 = class289.field3807.method931(124);
                int var342 = class289.field3807.method931(94);
                int var343 = class289.field3807.method963(-119);
                if (class516.method2930(var343, (byte) -106)) {
                    class543.method3044((byte) -72, 0, var342, var341);
                }
                class213.field2817 = null;
                return true;
            } else if (class6.field57 == class213.field2817) {
                class482.method2776((byte) -54);
                class213.field2817 = null;
                return true;
            } else if (class361.field4788 == class213.field2817) {
                int var344 = class289.field3807.method961(-4349);
                int var345 = class289.field3807.method931(92);
                int var346 = class289.field3807.method954(2);
                int var347 = class289.field3807.method963(-126);
                int var348 = class289.field3807.method908(false);
                if (class516.method2930(var347, (byte) -106)) {
                    class695.method3924((byte) -124, 7, var345, var348, var344 | var346 << 16);
                }
                class213.field2817 = null;
                return true;
            } else if (class686.field9699 == class213.field2817) {
                class510.method2898(class197.field2688, (byte) 103);
                class213.field2817 = null;
                return true;
            } else if (class466.field6121 == class213.field2817) {
                int var349 = class289.field3807.method954(2);
                int var350 = class289.field3807.method961(-4349);
                int var351 = class289.field3807.method908(false);
                int var352 = class289.field3807.method954(2);
                if (class516.method2930(var352, (byte) -106)) {
                    class187.method1236(13, var351, (var349 << 16) + var350);
                }
                class213.field2817 = null;
                return true;
            } else if (class3.field14 == class213.field2817) {
                while (class151.field2070 > class289.field3807.field2219) {
                    boolean var363 = ~class289.field3807.method930(255) == -2;
                    String var364 = class289.field3807.method925(50);
                    String var365 = class289.field3807.method925(53);
                    int var366 = class289.field3807.method963(-118);
                    int var367 = class289.field3807.method930(255);
                    String var368 = "";
                    boolean var369 = false;
                    if (var366 > 0) {
                        var368 = class289.field3807.method925(110);
                        var369 = ~class289.field3807.method930(255) == -2;
                    }
                    for (int var370 = 0; class427.field5757 > var370; ++var370) {
                        if (!var363) {
                            if (var364.equals(class82.field948[var370])) {
                                if (~class358.field4767[var370] != ~var366) {
                                    boolean var371 = true;
                                    for (class43 var372 = (class43) class562.field7686.method1298((byte) 40); var372 != null; var372 = (class43) class562.field7686.method1305((byte) -124)) {
                                        if (var372.field527.equals(var364)) {
                                            if (~var366 != -1 && ~var372.field528 == -1) {
                                                var372.method3499(12151);
                                                var371 = false;
                                            } else if (~var366 == -1 && ~var372.field528 != -1) {
                                                var372.method3499(12151);
                                                var371 = false;
                                            }
                                        }
                                    }
                                    if (var371) {
                                        class562.field7686.method1300(new class43(var364, var366), -1);
                                    }
                                    class358.field4767[var370] = var366;
                                }
                                class292.field3854[var370] = var365;
                                class143.field1936[var370] = var368;
                                class126.field1762[var370] = var367;
                                var364 = null;
                                class199.field2701[var370] = var369;
                                break;
                            }
                        } else if (var365.equals(class82.field948[var370])) {
                            class82.field948[var370] = var364;
                            var364 = null;
                            class292.field3854[var370] = var365;
                            break;
                        }
                    }
                    if (var364 != null && ~class427.field5757 > -201) {
                        class82.field948[class427.field5757] = var364;
                        class292.field3854[class427.field5757] = var365;
                        class358.field4767[class427.field5757] = var366;
                        class143.field1936[class427.field5757] = var368;
                        class126.field1762[class427.field5757] = var367;
                        class199.field2701[class427.field5757] = var369;
                        ++class427.field5757;
                    }
                }
                class303.field4026 = class155.field2183;
                class94.field1142 = 2;
                boolean var353 = false;
                int var354 = class427.field5757;
                while (~var354 < -1) {
                    --var354;
                    boolean var355 = true;
                    for (int var356 = 0; var356 < var354; ++var356) {
                        if (class358.field4767[var356] != class540.field7409.field3769 && class358.field4767[var356 + 1] == class540.field7409.field3769 || class358.field4767[var356] == 0 && ~class358.field4767[var356 + 1] != -1) {
                            int var357 = class358.field4767[var356];
                            class358.field4767[var356] = class358.field4767[var356 + 1];
                            class358.field4767[var356 + 1] = var357;
                            String var358 = class143.field1936[var356];
                            class143.field1936[var356] = class143.field1936[var356 + 1];
                            class143.field1936[var356 - -1] = var358;
                            String var359 = class82.field948[var356];
                            class82.field948[var356] = class82.field948[var356 + 1];
                            class82.field948[var356 - -1] = var359;
                            String var360 = class292.field3854[var356];
                            class292.field3854[var356] = class292.field3854[var356 + 1];
                            class292.field3854[var356 - -1] = var360;
                            int var361 = class126.field1762[var356];
                            class126.field1762[var356] = class126.field1762[var356 + 1];
                            class126.field1762[var356 - -1] = var361;
                            boolean var362 = class199.field2701[var356];
                            class199.field2701[var356] = class199.field2701[var356 + 1];
                            class199.field2701[var356 - -1] = var362;
                            var355 = false;
                        }
                    }
                    if (var355) {
                        break;
                    }
                }
                class213.field2817 = null;
                return true;
            } else if (class213.field2817 == class116.field1486) {
                int var373 = class289.field3807.method963(-127);
                String var374 = class289.field3807.method925(126);
                Object[] var375 = new Object[var374.length() - -1];
                for (int var376 = var374.length() - 1; ~var376 <= -1; --var376) {
                    if (var374.charAt(var376) == 's') {
                        var375[var376 + 1] = class289.field3807.method925(37);
                    } else {
                        var375[var376 + 1] = new Integer(class289.field3807.method908(false));
                    }
                }
                var375[0] = new Integer(class289.field3807.method908(false));
                if (class516.method2930(var373, (byte) -106)) {
                    class274 var377 = new class274();
                    var377.field3639 = var375;
                    class656.method3743(var377);
                }
                class213.field2817 = null;
                return true;
            } else if (class653.field9301 == class213.field2817) {
                boolean var378 = class289.field3807.method930(255) == 1;
                String var379 = class289.field3807.method925(105);
                String var380 = var379;
                if (var378) {
                    var380 = class289.field3807.method925(105);
                }
                int var381 = class289.field3807.method930(255);
                int var382 = class289.field3807.method963(-119);
                boolean var383 = false;
                if (~var381 >= -2 && class451.method2537(var380, 0)) {
                    var383 = true;
                }
                if (!var383 && ~class448.field5935 == -1) {
                    String var384 = class32.field447.method2162((byte) 102, var382).method1810(-73, class289.field3807);
                    if (var381 == 2) {
                        class686.method3884("<img=1>" + var379, (byte) 92, (String) null, 25, var379, var384, 0, "<img=1>" + var380, var382);
                    } else if (~var381 == -2) {
                        class686.method3884("<img=0>" + var379, (byte) 106, (String) null, 25, var379, var384, 0, "<img=0>" + var380, var382);
                    } else {
                        class686.method3884(var379, (byte) 105, (String) null, 25, var379, var384, 0, var380, var382);
                    }
                }
                class213.field2817 = null;
                return true;
            } else if (class689.field9742 == class213.field2817) {
                class510.method2898(class408.field5367, (byte) 103);
                class213.field2817 = null;
                return true;
            } else if (class213.field2817 == class165.field2357) {
                class52.field662 = class289.field3807.method930(255);
                for (int var385 = 0; ~var385 > ~class52.field662; ++var385) {
                    class204.field2746[var385] = class289.field3807.method925(127);
                    class420.field5517[var385] = class289.field3807.method925(96);
                    if (class420.field5517[var385].equals("")) {
                        class420.field5517[var385] = class204.field2746[var385];
                    }
                    class104.field1242[var385] = class289.field3807.method925(112);
                    class152.field2089[var385] = class289.field3807.method925(45);
                    if (class152.field2089[var385].equals("")) {
                        class152.field2089[var385] = class104.field1242[var385];
                    }
                    class85.field1029[var385] = false;
                }
                class213.field2817 = null;
                class303.field4026 = class155.field2183;
                return true;
            } else if (class291.field3846 == class213.field2817) {
                class510.method2898(class118.field1502, (byte) 103);
                class213.field2817 = null;
                return true;
            } else if (class513.field7143 == class213.field2817) {
                int var386 = class289.field3807.method926(-1475225768);
                int var387 = class289.field3807.method967(-88);
                int var388 = class289.field3807.method931(78);
                int var389 = class289.field3807.method967(-103);
                if (class516.method2930(var388, (byte) -106)) {
                    class500.method2847((byte) 84, var389, var386, var387);
                }
                class213.field2817 = null;
                return true;
            } else if (class43.field526 == class213.field2817) {
                class510.method2898(class348.field4638, (byte) 103);
                class213.field2817 = null;
                return true;
            } else if (class213.field2817 == class189.field2622) {
                int var390 = class289.field3807.method930(255);
                if (~class289.field3807.method930(255) == -1) {
                    class171.field2433[var390] = new class174();
                } else {
                    --class289.field3807.field2219;
                    class171.field2433[var390] = new class174(class289.field3807);
                }
                class213.field2817 = null;
                class1.field1 = class155.field2183;
                return true;
            } else if (class524.field7270 == class213.field2817) {
                class509.field7020 = class155.field2183;
                if (class151.field2070 == 0) {
                    class226.field2935 = null;
                    class213.field2817 = null;
                    class267.field3491 = null;
                    class144.field1945 = null;
                    class354.field4728 = 0;
                    return true;
                } else {
                    class144.field1945 = class289.field3807.method925(101);
                    boolean var391 = class289.field3807.method930(255) == 1;
                    if (var391) {
                        class289.field3807.method925(37);
                    }
                    long var392 = class289.field3807.method953(true);
                    class226.field2935 = class339.method1979(0, var392);
                    class565.field7708 = class289.field3807.method969(3);
                    int var394 = class289.field3807.method930(255);
                    if (~var394 == -256) {
                        class213.field2817 = null;
                        return true;
                    } else {
                        class354.field4728 = var394;
                        class346[] var395 = new class346[100];
                        for (int var396 = 0; ~var396 > ~class354.field4728; ++var396) {
                            var395[var396] = new class346();
                            var395[var396].field4617 = class289.field3807.method925(80);
                            boolean var402 = ~class289.field3807.method930(255) == -2;
                            if (var402) {
                                var395[var396].field4620 = class289.field3807.method925(31);
                            } else {
                                var395[var396].field4620 = var395[var396].field4617;
                            }
                            var395[var396].field4624 = class55.method328(var395[var396].field4620, (byte) -64);
                            var395[var396].field4627 = class289.field3807.method963(-124);
                            var395[var396].field4616 = class289.field3807.method969(3);
                            var395[var396].field4626 = class289.field3807.method925(31);
                            if (var395[var396].field4620.equals(class408.field5369.field7791)) {
                                class571.field7770 = var395[var396].field4616;
                            }
                        }
                        boolean var397 = false;
                        int var398 = class354.field4728;
                        while (var398 > 0) {
                            boolean var399 = true;
                            --var398;
                            for (int var400 = 0; ~var400 > ~var398; ++var400) {
                                if (var395[var400].field4624.compareTo(var395[var400 + 1].field4624) > 0) {
                                    class346 var401 = var395[var400];
                                    var395[var400] = var395[var400 + 1];
                                    var395[var400 - -1] = var401;
                                    var399 = false;
                                }
                            }
                            if (var399) {
                                break;
                            }
                        }
                        class267.field3491 = var395;
                        class213.field2817 = null;
                        return true;
                    }
                }
            } else if (class642.field8855 == class213.field2817) {
                int var403 = class289.field3807.method935(-83);
                String var404 = class289.field3807.method925(52);
                int var405 = class289.field3807.method954(2);
                if (class516.method2930(var405, (byte) -106)) {
                    class98.method557(var404, 15, var403);
                }
                class213.field2817 = null;
                return true;
            } else if (class41.field519 != class213.field2817) {
                if (class619.field8596 == class213.field2817) {
                    class418.method2367((byte) -119);
                    class213.field2817 = null;
                    return false;
                } else if (class235.field3118 == class213.field2817) {
                    class669.method3801((byte) 120, class188.field2614);
                    class213.field2817 = null;
                    return false;
                } else if (class340.field4571 == class213.field2817) {
                    int var407 = class289.field3807.method963(-123);
                    int var408 = class289.field3807.method930(255);
                    int var409 = class289.field3807.method930(255);
                    int var410 = class289.field3807.method930(255);
                    int var411 = class289.field3807.method930(255);
                    int var412 = class289.field3807.method963(-119);
                    if (class516.method2930(var407, (byte) -106)) {
                        class149.field2028[var408] = true;
                        class227.field2948[var408] = var409;
                        class122.field1589[var408] = var410;
                        class315.field4226[var408] = var411;
                        class12.field158[var408] = var412;
                    }
                    class213.field2817 = null;
                    return true;
                } else if (class5.field55 == class213.field2817) {
                    class564.field7696.method89(-128);
                    class307.field4113 += 32;
                    class213.field2817 = null;
                    return true;
                } else if (class78.field916 == class213.field2817) {
                    class510.method2898(class41.field518, (byte) 103);
                    class213.field2817 = null;
                    return true;
                } else if (class535.field7351 == class213.field2817) {
                    class548.method3071(true, 0);
                    class213.field2817 = null;
                    return true;
                } else if (class213.field2817 == class141.field1912) {
                    int var413 = class289.field3807.method963(-124);
                    int var414 = class289.field3807.method930(255);
                    int var415 = class289.field3807.method930(255);
                    int var416 = class289.field3807.method963(-124) << 2;
                    int var417 = class289.field3807.method930(255);
                    int var418 = class289.field3807.method930(255);
                    if (class516.method2930(var413, (byte) -106)) {
                        class550.method3080((byte) 127, var417, var416, var414, var418, true, var415);
                    }
                    class213.field2817 = null;
                    return true;
                } else if (class498.field6845 == class213.field2817) {
                    class94.field1142 = 1;
                    class213.field2817 = null;
                    class303.field4026 = class155.field2183;
                    return true;
                } else if (class279.field3687 == class213.field2817) {
                    int var419 = class289.field3807.method928(2016790224);
                    int var420 = class289.field3807.method961(-4349);
                    int var421 = class289.field3807.method972(46);
                    if (class516.method2930(var420, (byte) -106)) {
                        class505.method2876(-14680, var419, var421);
                    }
                    class213.field2817 = null;
                    return true;
                } else if (class213.field2817 == class115.field1478) {
                    if (class367.method2128(65280, class576.field7861)) {
                        class422.field5543 = (int) (2.5F * (float) class289.field3807.method963(-128));
                    } else {
                        class422.field5543 = 30 * class289.field3807.method963(-125);
                    }
                    class213.field2817 = null;
                    class99.field1198 = class155.field2183;
                    return true;
                } else if (class335.field4522 == class213.field2817) {
                    class586.method3246(false);
                    class213.field2817 = null;
                    return false;
                } else if (class230.field2979 == class213.field2817) {
                    int var422 = class289.field3807.method963(-126);
                    int var423 = class289.field3807.method908(false);
                    int var424 = class289.field3807.method961(-4349);
                    if (class516.method2930(var424, (byte) -106)) {
                        class155.method903(3761, var422, var423);
                    }
                    class213.field2817 = null;
                    return true;
                } else if (class213.field2817 == class140.field1909) {
                    class366.field4828 = class289.field3807.method919(12);
                    class77.field914 = class289.field3807.method911(86) << 3;
                    class114.field1463 = class289.field3807.method969(3) << 3;
                    class213.field2817 = null;
                    return true;
                } else if (class616.field8525 == class213.field2817) {
                    class466.field6119 = class151.field2070 > 2 ? class289.field3807.method925(33) : class371.field4905.method2141(class422.field5539, true);
                    class50.field581 = ~class151.field2070 < -1 ? class289.field3807.method963(-124) : -1;
                    if (class50.field581 == 65535) {
                        class50.field581 = -1;
                    }
                    class213.field2817 = null;
                    return true;
                } else if (class360.field4777 == class213.field2817) {
                    int var425 = class289.field3807.method963(-121);
                    if (var425 == 65535) {
                        var425 = -1;
                    }
                    int var426 = class289.field3807.method908(false);
                    int var427 = class289.field3807.method931(78);
                    int var428 = class289.field3807.method908(false);
                    if (class516.method2930(var427, (byte) -106)) {
                        class55.method325(var426, 9, var428, var425);
                        class584 var429 = class87.field1058.method1394(-64, var425);
                        class418.method2368(var428, var429.field8044, var429.field7997, 34336, var429.field8002);
                        class3.method15(var429.field8076, var429.field8055, (byte) 86, var429.field8012, var428);
                    }
                    class213.field2817 = null;
                    return true;
                } else if (class407.field5358 == class213.field2817) {
                    if (class529.field7314 != null) {
                        class152.method892(class602.field8408.field4313, false, -1, -1, 3);
                    }
                    byte[] var430 = new byte[class151.field2070];
                    class289.field3807.method3014(0, -257629242, class151.field2070, var430);
                    String var431 = class651.method3648(var430, class151.field2070, 0, (byte) -18);
                    class309.method1824(true, class312.field4206, var431, (byte) -84, ~class618.field8566 == -2);
                    class213.field2817 = null;
                    return true;
                } else if (class27.field395 == class213.field2817) {
                    class510.method2898(class321.field4284, (byte) 103);
                    class213.field2817 = null;
                    return true;
                } else {
                    class91.method499("T1 - " + (class213.field2817 == null ? -1 : class213.field2817.method3079(93)) + "," + (class315.field4223 != null ? class315.field4223.method3079(112) : -1) + "," + (class630.field8724 != null ? class630.field8724.method3079(53) : -1) + " - " + class151.field2070, (Throwable) null, (byte) 120);
                    class669.method3801((byte) 120, false);
                    return true;
                }
            } else {
                class114.field1463 = class289.field3807.method924(117) << 3;
                class366.field4828 = class289.field3807.method930(255);
                class77.field914 = class289.field3807.method924(108) << 3;
                while (~class289.field3807.field2219 > ~class151.field2070) {
                    class259 var406 = class466.method2596(false)[class289.field3807.method930(255)];
                    class510.method2898(var406, (byte) 103);
                }
                class213.field2817 = null;
                return true;
            }
        }
    }
}
