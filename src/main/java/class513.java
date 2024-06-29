import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class513 {

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "I")
    public static int field7521;

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "I")
    public static int field7523;

    @OriginalMember(owner = "client!ii", name = "f", descriptor = "I")
    public static int field7524;

    @OriginalMember(owner = "client!ii", name = "g", descriptor = "I")
    public static int field7525;

    @OriginalMember(owner = "client!ii", name = "h", descriptor = "I")
    public static int field7526;

    @OriginalMember(owner = "client!ii", name = "i", descriptor = "I")
    public static int field7527;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "J")
    public long field7519;

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "Lii;")
    public class513 field7520;

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "Lii;")
    public class513 field7522;

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(IIII)V", line = 3)
    public static final void method3043(int arg0, int arg1, int arg2, int arg3) {
        field7521++;
        class618 var4 = class562.field8128[arg3][arg1];
        class31.method399(arg0, var4 == null ? class214.field2719 : var4, arg2);
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(B)Z", line = 13)
    public static final boolean method3044(byte arg0) throws IOException {
        field7523++;
        if (class489.field6835 == null) {
            return false;
        }
        if (class523.field7670 == null) {
            if (class198.field2403) {
                if (!class489.field6835.method1856(-1, 1)) {
                    return false;
                }
                class489.field6835.method1851(class29.field617.field5205, 1, (byte) -3, 0);
                class234.field3127 = 0;
                class198.field2403 = false;
                class263.field3626++;
            }
            class29.field617.field5195 = 0;
            if (class29.field617.method23(-129)) {
                if (!class489.field6835.method1856(-1, 1)) {
                    return false;
                }
                class489.field6835.method1851(class29.field617.field5205, 1, (byte) -3, 1);
                class234.field3127 = 0;
                class263.field3626++;
            }
            class198.field2403 = true;
            class690[] var1 = class6.method36(0);
            int var2 = class29.field617.method27(255);
            if (var2 < 0 || var1.length <= var2) {
                throw new IOException("invo:" + var2 + " ip:" + class29.field617.field5195);
            }
            class523.field7670 = var1[var2];
            class283.field3848 = class523.field7670.field9839;
        }
        if (class283.field3848 == -1) {
            if (!class489.field6835.method1856(-1, 1)) {
                return false;
            }
            class489.field6835.method1851(class29.field617.field5205, 1, (byte) -3, 0);
            class283.field3848 = class29.field617.field5205[0] & 0xFF;
            class234.field3127 = 0;
            class263.field3626++;
        }
        if (class283.field3848 == -2) {
            if (!class489.field6835.method1856(arg0 ^ 0xFFFFFF89, 2)) {
                return false;
            }
            class489.field6835.method1851(class29.field617.field5205, 2, (byte) -3, 0);
            class29.field617.field5195 = 0;
            class283.field3848 = class29.field617.method2260(-47);
            class263.field3626 += 2;
            class234.field3127 = 0;
        }
        if (class283.field3848 > 0) {
            if (!class489.field6835.method1856(arg0 - 119, class283.field3848)) {
                return false;
            }
            class29.field617.field5195 = 0;
            class489.field6835.method1851(class29.field617.field5205, class283.field3848, (byte) -3, 0);
            class234.field3127 = 0;
            class263.field3626 += class283.field3848;
        }
        class268.field3674 = class681.field9744;
        class681.field9744 = class470.field6572;
        class470.field6572 = class523.field7670;
        if (class523.field7670 == class123.field1586) {
            byte var3 = class29.field617.method2276(arg0 ^ 0xF6);
            int var4 = class29.field617.method2274((byte) 69);
            class410.field5804.method3190(-1, var3, var4);
            class523.field7670 = null;
            return true;
        } else if (class523.field7670 == class498.field6964) {
            int var5 = class29.field617.method2260(-30);
            int var6 = class29.field617.method2255(255);
            if (class436.method2610(var5, -86)) {
                class21 var7 = (class21) class113.field1442.method3678((long) var6, -124);
                if (var7 != null) {
                    class658.method3727(false, 7070, true, var7);
                }
                if (client.field3750 != null) {
                    class314.method1836(client.field3750, false);
                    client.field3750 = null;
                }
            }
            class523.field7670 = null;
            return true;
        } else if (class523.field7670 == class310.field4094) {
            class62.method605((byte) 85);
            class523.field7670 = null;
            return true;
        } else if (class594.field8582 == class523.field7670) {
            boolean var8 = class29.field617.method2229(255) == 1;
            String var9 = class29.field617.method2244((byte) -117);
            String var10 = var9;
            if (var8) {
                var10 = class29.field617.method2244((byte) -111);
            }
            long var11 = (long) class29.field617.method2260(-24);
            long var13 = (long) class29.field617.method2258(arg0 - 121);
            int var15 = class29.field617.method2229(255);
            long var16 = (var11 << 32) + var13;
            boolean var18 = false;
            int var19 = 0;
            while (true) {
                if (var19 >= 100) {
                    if (var15 <= 1) {
                        if (!(!class256.field3481 || class341.field4503) || class689.field9822) {
                            var18 = true;
                        } else if (class573.method3360(-109, var10)) {
                            var18 = true;
                        }
                    }
                    break;
                }
                if (class421.field5993[var19] == var16) {
                    var18 = true;
                    break;
                }
                var19++;
            }
            if (!var18 && class346.field4548 == 0) {
                class421.field5993[class172.field2098] = var16;
                class172.field2098 = (class172.field2098 + 1) % 100;
                String var20 = class42.method462(class264.method1604(arg0 - 1, class29.field617), arg0 ^ 0x77);
                if (var15 == 2) {
                    class568.method3328("<img=1>" + var9, 0, null, "<img=1>" + var10, 122, 7, -1, var20, var9);
                } else if (var15 == 1) {
                    class568.method3328("<img=0>" + var9, 0, null, "<img=0>" + var10, arg0 - 52, 7, -1, var20, var9);
                } else {
                    class568.method3328(var9, 0, null, var10, 105, 3, -1, var20, var9);
                }
            }
            class523.field7670 = null;
            return true;
        } else if (class523.field7670 == class127.field1618) {
            int var21 = class29.field617.method2279((byte) -121);
            int var22 = class29.field617.method2280((byte) 100);
            int var23 = class29.field617.method2274((byte) 93);
            if (class436.method2610(var21, 63)) {
                class656.method3710(var22, (byte) -120, var23);
            }
            class523.field7670 = null;
            return true;
        } else if (class523.field7670 == class412.field5852) {
            boolean var24 = class29.field617.method2229(255) == 1;
            String var25 = class29.field617.method2244((byte) -57);
            String var26 = var25;
            if (var24) {
                var26 = class29.field617.method2244((byte) -69);
            }
            long var27 = class29.field617.method2227(-26276);
            long var29 = (long) class29.field617.method2260(-88);
            long var31 = (long) class29.field617.method2258(-3);
            int var33 = class29.field617.method2229(arg0 + 137);
            int var34 = class29.field617.method2260(-101);
            long var35 = (var29 << 32) + var31;
            boolean var37 = false;
            int var38 = 0;
            while (true) {
                if (var38 >= 100) {
                    if (var33 <= 1 && class573.method3360(-64, var26)) {
                        var37 = true;
                    }
                    break;
                }
                if (class421.field5993[var38] == var35) {
                    var37 = true;
                    break;
                }
                var38++;
            }
            if (!var37 && class346.field4548 == 0) {
                class421.field5993[class172.field2098] = var35;
                class172.field2098 = (class172.field2098 + 1) % 100;
                String var39 = class188.field2292.method1869(var34, arg0 ^ 0xFFFFFFF3).method2455(class29.field617, arg0 ^ 0xFFFFFF89);
                if (var33 == 2) {
                    class568.method3328("<img=1>" + var25, 0, class189.method1167(-5252, var27), "<img=1>" + var26, 17, 20, var34, var39, var25);
                } else if (var33 == 1) {
                    class568.method3328("<img=0>" + var25, 0, class189.method1167(arg0 ^ 0xFFFFEB0A, var27), "<img=0>" + var26, arg0 - 75, 20, var34, var39, var25);
                } else {
                    class568.method3328(var25, 0, class189.method1167(-5252, var27), var26, -123, 20, var34, var39, var25);
                }
            }
            class523.field7670 = null;
            return true;
        } else if (class591.field8565 == class523.field7670) {
            int var40 = class29.field617.method2262(true);
            int var41 = class29.field617.method2247(24565);
            if (var41 == 65535) {
                var41 = -1;
            }
            int var42 = class29.field617.method2271(-105);
            class231.method1398(var40, var42, (byte) 126, var41);
            class523.field7670 = null;
            return true;
        } else if (class523.field7670 == class298.field4018) {
            int var43 = class29.field617.method2274((byte) 92);
            if (var43 == 65535) {
                var43 = -1;
            }
            int var44 = class29.field617.method2240((byte) 111);
            int var45 = class29.field617.method2258(arg0 - 121);
            class34.method411(var45, var44, (byte) -62, var43);
            class523.field7670 = null;
            return true;
        } else if (class523.field7670 == class498.field6967) {
            int var46 = class29.field617.method2260(-33);
            int var47 = class29.field617.method2229(arg0 + 137);
            int var48 = class29.field617.method2229(255);
            int var49 = class29.field617.method2229(255);
            int var50 = class29.field617.method2229(255);
            int var51 = class29.field617.method2260(arg0 - 155);
            if (class436.method2610(var46, arg0 ^ 0x1)) {
                class25.field587[var47] = true;
                class666.field9425[var47] = var48;
                class236.field3183[var47] = var49;
                class368.field4959[var47] = var50;
                class397.field5621[var47] = var51;
            }
            class523.field7670 = null;
            return true;
        } else if (class523.field7670 == class514.field7534) {
            class421.method2546((byte) -110, class350.field4677);
            class523.field7670 = null;
            return true;
        } else if (class553.field8030 == class523.field7670) {
            int var52 = class29.field617.method2229(arg0 + 137);
            int var53 = class29.field617.method2229(255);
            int var54 = class29.field617.method2251(-800775208);
            class232.field3112[var52] = var54;
            class354.field4730[var52] = var53;
            class422.field6001[var52] = 1;
            int var55 = class656.field9315[var52] - 1;
            for (int var56 = 0; var56 < var55; var56++) {
                if (var54 >= class298.field4016[var56]) {
                    class422.field6001[var52] = var56 + 2;
                }
            }
            class359.field4787[class435.method2605(31, class356.field4754++)] = var52;
            class523.field7670 = null;
            return true;
        } else if (class523.field7670 == class216.field2766) {
            int var57 = class29.field617.method2274((byte) -86);
            int var58 = class29.field617.method2271(-127);
            int var59 = class29.field617.method2274((byte) -128);
            int var60 = class29.field617.method2280((byte) 37);
            if (class436.method2610(var59, 63)) {
                class21 var61 = (class21) class113.field1442.method3678((long) var60, -121);
                if (var61 != null) {
                    class658.method3727(false, 7070, var61.field540 != var57, var61);
                }
                class473.method2781(false, var58, var60, var57, -57);
            }
            class523.field7670 = null;
            return true;
        } else if (class91.field1276 == class523.field7670) {
            class322.method1873(class29.field617, class283.field3848, -36, class517.field7570);
            class523.field7670 = null;
            return true;
        } else if (class661.field9383 == class523.field7670) {
            class421.method2546((byte) -81, class262.field3605);
            class523.field7670 = null;
            return true;
        } else if (class523.field7670 == class21.field544) {
            class421.method2546((byte) 103, class6.field58);
            class523.field7670 = null;
            return true;
        } else if (class523.field7670 == class426.field6120) {
            int var62 = class29.field617.method2247(24565);
            int var63 = class29.field617.method2251(-800775208);
            int var64 = class29.field617.method2247(24565);
            if (class436.method2610(var64, arg0 ^ 0x1E)) {
                class649.method3662(var62, arg0 + 5, var63);
            }
            class523.field7670 = null;
            return true;
        } else if (class643.field9181 == class523.field7670) {
            int var65 = class29.field617.method2251(arg0 ^ 0xD04523AE);
            String var66 = class29.field617.method2244((byte) -54);
            int var67 = class29.field617.method2247(24565);
            if (class436.method2610(var67, -59)) {
                class680.method3857(-17728, var66, var65);
            }
            class523.field7670 = null;
            return true;
        } else if (class523.field7670 == class27.field606) {
            for (int var68 = 0; var68 < class184.field2252.length; var68++) {
                if (class184.field2252[var68] != null) {
                    class184.field2252[var68].field2655 = null;
                    class184.field2252[var68].field2637 = -1;
                }
            }
            for (int var69 = 0; var69 < class59.field928; var69++) {
                class671.field9657[var69].field9097.field2655 = null;
                class671.field9657[var69].field9097.field2637 = -1;
            }
            class523.field7670 = null;
            return true;
        } else if (class554.field8036 == class523.field7670) {
            int var70 = class29.field617.method2247(24565);
            int var71 = class29.field617.method2279((byte) -124);
            int var72 = class29.field617.method2255(arg0 ^ 0x89);
            int var73 = class29.field617.method2247(24565);
            int var74 = class29.field617.method2279((byte) -122);
            if (class436.method2610(var70, -104)) {
                class523.method3098(var74, var72, var71, (byte) -62, var73);
            }
            class523.field7670 = null;
            return true;
        } else if (class523.field7670 == class14.field233) {
            class421.method2546((byte) 125, class246.field3380);
            class523.field7670 = null;
            return true;
        } else if (class523.field7670 == class312.field4117) {
            class421.method2546((byte) -27, class529.field7729);
            class523.field7670 = null;
            return true;
        } else if (class523.field7670 == class359.field4780) {
            class421.method2546((byte) 101, class506.field7215);
            class523.field7670 = null;
            return true;
        } else if (class566.field8282 == class523.field7670) {
            class421.method2546((byte) -111, class620.field8886);
            class523.field7670 = null;
            return true;
        } else if (class523.field7670 == class311.field4104) {
            int var75 = class29.field617.method2279((byte) -128);
            int var76 = class29.field617.method2223(-93);
            class410.field5804.method3185(var76, arg0 - 12882, var75);
            class523.field7670 = null;
            return true;
        } else if (class523.field7670 == class377.field5072) {
            int var77 = class29.field617.method2274((byte) 84);
            int var78 = class29.field617.method2255(255);
            int var79 = class29.field617.method2260(-106);
            int var80 = class29.field617.method2247(24565);
            if (class436.method2610(var80, arg0 - 211)) {
                class587.method3404(13, (var77 << 16) + var79, var78);
            }
            class523.field7670 = null;
            return true;
        } else if (class568.field8297 == class523.field7670) {
            int var81 = class29.field617.method2260(-56);
            int var82 = class29.field617.method2223(arg0 + 4);
            class410.field5804.method3190(-1, var82, var81);
            class523.field7670 = null;
            return true;
        } else if (class523.field7670 == class159.field1936) {
            class309.field4086 = class29.field617.method2277((byte) -52) << 3;
            class327.field4366 = class29.field617.method2249((byte) -70) << 3;
            class493.field6893 = class29.field617.method2262(true);
            class523.field7670 = null;
            return true;
        } else if (class523.field7670 == class422.field6009) {
            int var83 = class29.field617.method2266((byte) 110);
            int var84 = class29.field617.method2255(255);
            int var85 = class29.field617.method2229(255);
            String var86 = "";
            String var87 = var86;
            if ((var85 & 0x1) != 0) {
                var86 = class29.field617.method2244((byte) -81);
                if ((var85 & 0x2) == 0) {
                    var87 = var86;
                } else {
                    var87 = class29.field617.method2244((byte) -42);
                }
            }
            String var88 = class29.field617.method2244((byte) -120);
            if (var83 == 99) {
                class79.method660((byte) 79, var88);
            } else if (var87.equals("") || !class573.method3360(arg0 - 160, var87)) {
                class301.method1786(var86, var88, var86, var87, -1, var83, var84);
            } else {
                class523.field7670 = null;
                return true;
            }
            class523.field7670 = null;
            return true;
        } else if (class523.field7670 == class404.field5706) {
            class33.field667 = class29.field617.method2270((byte) 71);
            class345.field4534 = class59.field926;
            class523.field7670 = null;
            return true;
        } else if (class677.field9715 == class523.field7670) {
            int var89 = class29.field617.method2229(arg0 ^ 0x89);
            if (class29.field617.method2229(255) == 0) {
                class159.field1942[var89] = new class432();
            } else {
                class29.field617.field5195--;
                class159.field1942[var89] = new class432(class29.field617);
            }
            class523.field7670 = null;
            class568.field8308 = class59.field926;
            return true;
        } else if (class523.field7670 == class330.field4397) {
            int var90 = class29.field617.method2229(255);
            int var91 = class29.field617.method2279((byte) -124);
            int var92 = class29.field617.method2251(-800775208);
            int var93 = class29.field617.method2247(24565);
            int var94 = class29.field617.method2274((byte) 125);
            boolean var95 = (var90 & 0x80) != 0;
            if ((var92 >> 30) != 0) {
                int var96 = (var92 & 0x3728C569) >> 28;
                int var97 = ((var92 & 0xFFFFA9B) >> 14) - class36.field689;
                int var98 = (var92 & 0x3FFF) - class88.field1239;
                if (var97 >= 0 && var98 >= 0 && var97 < class473.field6604 && var98 < class205.field2465) {
                    int var99 = var97 * 512 + 256;
                    int var100 = var98 * 512 + 256;
                    int var101 = var96;
                    if (var96 < 3 && class626.method3602(var97, var98, (byte) 12)) {
                        var101 = var96 + 1;
                    }
                    class120 var102 = new class120(var93, 0, class543.field7882, var96, var101, var99, class589.method3416(var99, -13, var96, var100) - var94, var100, var97, var97, var98, var98, var90 & 0x7);
                    class376.field5049.method1129(new class520(var102), 262144);
                }
            } else if ((var92 >> 29) != 0) {
                int var118 = var92 & 0xFFFF;
                class633 var119 = (class633) class522.field7662.method3678((long) var118, arg0 - 239);
                if (var119 != null) {
                    class557 var120 = var119.field9097;
                    if (var93 == 65535) {
                        var93 = -1;
                    }
                    boolean var121 = true;
                    int var122 = var95 ? var120.field2629 : var120.field2626;
                    if (var93 != -1 && var122 != -1) {
                        if (var93 == var122) {
                            class596 var127 = class276.field3774.method136(var93, false);
                            if (var127.field8600 && var127.field8614 != -1) {
                                class282 var128 = class195.field2367.method3273(var127.field8614, arg0 - 118);
                                int var129 = var128.field3828;
                                if (var129 == 0 || var129 == 2) {
                                    var121 = false;
                                } else if (var129 == 1) {
                                    var121 = true;
                                }
                            }
                        } else {
                            class596 var123 = class276.field3774.method136(var93, false);
                            class596 var124 = class276.field3774.method136(var122, false);
                            if (var123.field8614 != -1 && var124.field8614 != -1) {
                                class282 var125 = class195.field2367.method3273(var123.field8614, 0);
                                class282 var126 = class195.field2367.method3273(var124.field8614, 0);
                                if (var125.field3823 < var126.field3823) {
                                    var121 = false;
                                }
                            }
                        }
                    }
                    if (var121) {
                        if (var95) {
                            var120.field2648 = 1;
                            var120.field2609 = var94;
                            var120.field2605 = 0;
                            var120.field2593 = class543.field7882 + var91;
                            var120.field2629 = var93;
                            var120.field2661 = 0;
                            var120.field2668 = var90 & 0x7;
                            if (var120.field2593 > class543.field7882) {
                                var120.field2605 = -1;
                            }
                            if (var120.field2629 != -1 && class543.field7882 == var120.field2593) {
                                int var130 = class276.field3774.method136(var120.field2629, false).field8614;
                                if (var130 != -1) {
                                    class282 var131 = class195.field2367.method3273(var130, 0);
                                    if (var131 != null && var131.field3827 != null && !var120.field2597) {
                                        class563.method3294((byte) 86, var131, var120, 0);
                                    }
                                }
                            }
                        } else {
                            var120.field2644 = 0;
                            var120.field2626 = var93;
                            var120.field2667 = var90 & 0x7;
                            var120.field2619 = 0;
                            var120.field2618 = 1;
                            var120.field2599 = var94;
                            var120.field2657 = class543.field7882 + var91;
                            if (var120.field2657 > class543.field7882) {
                                var120.field2644 = -1;
                            }
                            if (var120.field2626 != -1 && class543.field7882 == var120.field2657) {
                                int var132 = class276.field3774.method136(var120.field2626, false).field8614;
                                if (var132 != -1) {
                                    class282 var133 = class195.field2367.method3273(var132, 0);
                                    if (var133 != null && var133.field3827 != null && !var120.field2597) {
                                        class563.method3294((byte) 35, var133, var120, 0);
                                    }
                                }
                            }
                        }
                    }
                }
            } else if (var92 >> 28 != 0) {
                int var103 = var92 & 0xFFFF;
                class613 var104;
                if (class63.field1016 == var103) {
                    var104 = class206.field2472;
                } else {
                    var104 = class184.field2252[var103];
                }
                if (var104 != null) {
                    if (var93 == 65535) {
                        var93 = -1;
                    }
                    boolean var105 = true;
                    int var106 = var95 ? var104.field2629 : var104.field2626;
                    if (var93 != -1 && var106 != -1) {
                        if (var93 == var106) {
                            class596 var111 = class276.field3774.method136(var93, false);
                            if (var111.field8600 && var111.field8614 != -1) {
                                class282 var112 = class195.field2367.method3273(var111.field8614, 0);
                                int var113 = var112.field3828;
                                if (var113 == 0 || var113 == 2) {
                                    var105 = false;
                                } else if (var113 == 1) {
                                    var105 = true;
                                }
                            }
                        } else {
                            class596 var107 = class276.field3774.method136(var93, false);
                            class596 var108 = class276.field3774.method136(var106, false);
                            if (var107.field8614 != -1 && var108.field8614 != -1) {
                                class282 var109 = class195.field2367.method3273(var107.field8614, 0);
                                class282 var110 = class195.field2367.method3273(var108.field8614, 0);
                                if (var110.field3823 > var109.field3823) {
                                    var105 = false;
                                }
                            }
                        }
                    }
                    if (var105) {
                        if (var95) {
                            var104.field2648 = 1;
                            var104.field2609 = var94;
                            var104.field2629 = var93;
                            var104.field2593 = class543.field7882 + var91;
                            var104.field2605 = 0;
                            var104.field2661 = 0;
                            var104.field2668 = var90 & 0x7;
                            if (var104.field2629 == 65535) {
                                var104.field2629 = -1;
                            }
                            if (var104.field2593 > class543.field7882) {
                                var104.field2605 = -1;
                            }
                            if (var104.field2629 != -1 && class543.field7882 == var104.field2593) {
                                int var114 = class276.field3774.method136(var104.field2629, false).field8614;
                                if (var114 != -1) {
                                    class282 var115 = class195.field2367.method3273(var114, 0);
                                    if (var115 != null && var115.field3827 != null && !var104.field2597) {
                                        class563.method3294((byte) -106, var115, var104, 0);
                                    }
                                }
                            }
                        } else {
                            var104.field2618 = 1;
                            var104.field2599 = var94;
                            var104.field2626 = var93;
                            var104.field2657 = class543.field7882 + var91;
                            var104.field2644 = 0;
                            var104.field2667 = var90 & 0x7;
                            var104.field2619 = 0;
                            if (class543.field7882 < var104.field2657) {
                                var104.field2644 = -1;
                            }
                            if (var104.field2626 == 65535) {
                                var104.field2626 = -1;
                            }
                            if (var104.field2626 != -1 && class543.field7882 == var104.field2657) {
                                int var116 = class276.field3774.method136(var104.field2626, false).field8614;
                                if (var116 != -1) {
                                    class282 var117 = class195.field2367.method3273(var116, 0);
                                    if (var117 != null && var117.field3827 != null && !var104.field2597) {
                                        class563.method3294((byte) 62, var117, var104, 0);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            class523.field7670 = null;
            return true;
        } else if (class523.field7670 == class286.field3873) {
            class168.method1061((byte) 107, class189.field2305);
            class523.field7670 = null;
            return false;
        } else if (class673.field9664 == class523.field7670) {
            int var134 = class29.field617.method2260(-112);
            int var135 = class29.field617.method2229(255);
            boolean var136 = (var135 & 0x1) == 1;
            while (class29.field617.field5195 < class283.field3848) {
                int var137 = class29.field617.method2266((byte) 110);
                int var138 = class29.field617.method2260(-59);
                int var139 = 0;
                if (var138 != 0) {
                    var139 = class29.field617.method2229(255);
                    if (var139 == 255) {
                        var139 = class29.field617.method2255(255);
                    }
                }
                class465.method2730(var139, var137, (byte) 90, var136, var134, var138 - 1);
            }
            class594.field8585[class435.method2605(31, class36.field692++)] = var134;
            class523.field7670 = null;
            return true;
        } else if (class523.field7670 == class100.field1339) {
            boolean var140 = class29.field617.method2229(255) == 1;
            String var141 = class29.field617.method2244((byte) -77);
            String var142 = var141;
            if (var140) {
                var142 = class29.field617.method2244((byte) -45);
            }
            int var143 = class29.field617.method2229(255);
            boolean var144 = false;
            if (var143 <= 1) {
                if (!(!class256.field3481 || class341.field4503) || class689.field9822) {
                    var144 = true;
                } else if (var143 <= 1 && class573.method3360(arg0 ^ 0xFFFFFFC2, var142)) {
                    var144 = true;
                }
            }
            if (!var144 && class346.field4548 == 0) {
                String var145 = class42.method462(class264.method1604(71, class29.field617), 1);
                if (var143 == 2) {
                    class568.method3328("<img=1>" + var141, 0, null, "<img=1>" + var142, arg0 ^ 0xFFFFFFE6, 24, -1, var145, var141);
                } else if (var143 == 1) {
                    class568.method3328("<img=0>" + var141, 0, null, "<img=0>" + var142, 32, 24, -1, var145, var141);
                } else {
                    class568.method3328(var141, 0, null, var142, arg0 - 72, 24, -1, var145, var141);
                }
            }
            class523.field7670 = null;
            return true;
        } else if (class523.field7670 == class108.field1409) {
            int var146 = class29.field617.method2260(-54);
            int var147 = class29.field617.method2229(255);
            int var148 = class29.field617.method2229(arg0 + 137);
            int var149 = class29.field617.method2260(-65) << 2;
            int var150 = class29.field617.method2229(255);
            int var151 = class29.field617.method2229(255);
            if (class436.method2610(var146, arg0 ^ 0x3)) {
                class409.method2470(var148, var149, true, var151, var147, false, var150);
            }
            class523.field7670 = null;
            return true;
        } else if (class549.field7965 == class523.field7670) {
            int var152 = class29.field617.method2255(255);
            int var153 = class29.field617.method2274((byte) 59);
            if (class436.method2610(var153, -53)) {
                class401.method2422(var152, 3, -1, -1, 4);
            }
            class523.field7670 = null;
            return true;
        } else if (class523.field7670 == class472.field6577) {
            class523.field7670 = null;
            return false;
        } else if (class523.field7670 == class116.field1509) {
            int var154 = class29.field617.method2274((byte) -71);
            int var155 = class29.field617.method2274((byte) -70);
            String var156 = class29.field617.method2244((byte) -38);
            if (class436.method2610(var155, arg0 ^ 0x29)) {
                class687.method3887(var156, (byte) 118, var154);
            }
            class523.field7670 = null;
            return true;
        } else if (class655.field9303 == class523.field7670) {
            class149.field1826 = class29.field617.method2262(true);
            class219.field2833 = class29.field617.method2271(-117);
            class523.field7670 = null;
            return true;
        } else if (class523.field7670 == class300.field4036) {
            class29.field617.field5195 += 28;
            if (class29.field617.method2231(arg0 ^ 0x76)) {
                class400.method2417(-679, class29.field617, class29.field617.field5195 - 28);
            }
            class523.field7670 = null;
            return true;
        } else if (class523.field7670 == class487.field6811) {
            String var157 = class29.field617.method2244((byte) -75);
            int var158 = class29.field617.method2274((byte) -117);
            if (var158 == 65535) {
                var158 = -1;
            }
            int var159 = class29.field617.method2229(255);
            int var160 = class29.field617.method2271(-119);
            if (var160 >= 1 && var160 <= 8) {
                if (var157.equalsIgnoreCase("null")) {
                    var157 = null;
                }
                class664.field9403[var160 - 1] = var157;
                class440.field6292[var160 - 1] = var158;
                class544.field7889[var160 - 1] = var159 == 0;
            }
            class523.field7670 = null;
            return true;
        } else if (class73.field1103 == class523.field7670) {
            int var161 = class29.field617.method2251(arg0 ^ 0xD04523AE);
            int var162 = class29.field617.method2251(arg0 ^ 0xD04523AE);
            int var163 = class29.field617.method2260(-128);
            int var164 = class29.field617.method2247(24565);
            if (var164 == 65535) {
                var164 = -1;
            }
            if (class436.method2610(var163, arg0 - 243)) {
                class76.method648(var161, var164, var162, 9);
                class238 var165 = class65.field1021.method178(false, var164);
                class523.method3098(var165.field3215, var161, var165.field3250, (byte) -62, var165.field3234);
                class286.method1706(var165.field3271, var165.field3196, 10, var161, var165.field3264);
            }
            class523.field7670 = null;
            return true;
        } else if (class523.field7670 == class30.field627) {
            int var166 = class29.field617.method2260(-56);
            int var167 = class29.field617.method2229(255);
            int var168 = class29.field617.method2229(arg0 ^ 0x89);
            int var169 = class29.field617.method2260(-107) << 2;
            int var170 = class29.field617.method2229(255);
            int var171 = class29.field617.method2229(255);
            if (class436.method2610(var166, 45)) {
                class408.method2467(var167, var171, var170, arg0 ^ 0x61DE, var169, var168);
            }
            class523.field7670 = null;
            return true;
        } else if (class523.field7670 == class208.field2537) {
            int var172 = class29.field617.method2274((byte) -108);
            boolean var173 = class29.field617.method2240((byte) 110) == 1;
            if (class436.method2610(var172, 67)) {
                class664.field9394 = var173;
            }
            class523.field7670 = null;
            return true;
        } else if (class523.field7670 == class469.field6554) {
            class280.field3802 = class165.method1041(-20310, class29.field617.method2229(255));
            class523.field7670 = null;
            return true;
        } else if (class553.field8034 == class523.field7670) {
            int var174 = class29.field617.method2260(-78);
            if (class436.method2610(var174, arg0 - 38)) {
                class473.method2783(false);
            }
            class523.field7670 = null;
            return true;
        } else if (class523.field7670 == class233.field3113) {
            class421.method2546((byte) 114, class139.field1756);
            class523.field7670 = null;
            return true;
        } else if (class607.field8724 == class523.field7670) {
            boolean var175 = class29.field617.method2229(arg0 ^ 0x89) == 1;
            byte[] var176 = new byte[class283.field3848 - 1];
            class29.field617.method2250(arg0 - 119, class283.field3848 + -1, var176, 0);
            class561.method3277(var176, var175, arg0 ^ 0xFFFFFF97);
            class523.field7670 = null;
            return true;
        } else if (class523.field7670 == class143.field1783) {
            while (class283.field3848 > class29.field617.field5195) {
                boolean var187 = class29.field617.method2229(arg0 + 137) == 1;
                String var188 = class29.field617.method2244((byte) -91);
                String var189 = class29.field617.method2244((byte) -128);
                int var190 = class29.field617.method2260(-67);
                int var191 = class29.field617.method2229(255);
                String var192 = "";
                boolean var193 = false;
                if (var190 > 0) {
                    var192 = class29.field617.method2244((byte) -47);
                    var193 = class29.field617.method2229(arg0 ^ 0x89) == 1;
                }
                for (int var194 = 0; var194 < class700.field9897; var194++) {
                    if (var187) {
                        if (var189.equals(class529.field7730[var194])) {
                            class529.field7730[var194] = var188;
                            class173.field2125[var194] = var189;
                            var188 = null;
                            break;
                        }
                    } else if (var188.equals(class529.field7730[var194])) {
                        if (class318.field4208[var194] != var190) {
                            boolean var195 = true;
                            for (class484 var196 = (class484) class1.field4.method2070((byte) -125); var196 != null; var196 = (class484) class1.field4.method2068(-2001)) {
                                if (var196.field6786.equals(var188)) {
                                    if (var190 != 0 && var196.field6782 == 0) {
                                        var196.method2564((byte) 2);
                                        var195 = false;
                                    } else if (var190 == 0 && var196.field6782 != 0) {
                                        var196.method2564((byte) 2);
                                        var195 = false;
                                    }
                                }
                            }
                            if (var195) {
                                class1.field4.method2071((byte) 107, new class484(var188, var190));
                            }
                            class318.field4208[var194] = var190;
                        }
                        class173.field2125[var194] = var189;
                        class310.field4102[var194] = var192;
                        class290.field3941[var194] = var191;
                        class574.field8410[var194] = var193;
                        var188 = null;
                        break;
                    }
                }
                if (var188 != null && class700.field9897 < 200) {
                    class529.field7730[class700.field9897] = var188;
                    class173.field2125[class700.field9897] = var189;
                    class318.field4208[class700.field9897] = var190;
                    class310.field4102[class700.field9897] = var192;
                    class290.field3941[class700.field9897] = var191;
                    class574.field8410[class700.field9897] = var193;
                    class700.field9897++;
                }
            }
            class698.field9879 = class59.field926;
            class417.field5915 = 2;
            boolean var177 = false;
            int var178 = class700.field9897;
            while (var178 > 0) {
                var178--;
                boolean var179 = true;
                for (int var180 = 0; var180 < var178; var180++) {
                    if (class318.field4208[var180] != class281.field3813.field4476 && class318.field4208[var180 + 1] == class281.field3813.field4476 || class318.field4208[var180] == 0 && class318.field4208[var180 + 1] != 0) {
                        int var181 = class318.field4208[var180];
                        class318.field4208[var180] = class318.field4208[var180 + 1];
                        class318.field4208[var180 + 1] = var181;
                        String var182 = class310.field4102[var180];
                        class310.field4102[var180] = class310.field4102[var180 + 1];
                        class310.field4102[var180 + 1] = var182;
                        String var183 = class529.field7730[var180];
                        class529.field7730[var180] = class529.field7730[var180 + 1];
                        class529.field7730[var180 + 1] = var183;
                        String var184 = class173.field2125[var180];
                        class173.field2125[var180] = class173.field2125[var180 + 1];
                        class173.field2125[var180 + 1] = var184;
                        int var185 = class290.field3941[var180];
                        class290.field3941[var180] = class290.field3941[var180 + 1];
                        class290.field3941[var180 + 1] = var185;
                        boolean var186 = class574.field8410[var180];
                        class574.field8410[var180] = class574.field8410[var180 + 1];
                        class574.field8410[var180 + 1] = var186;
                        var179 = false;
                    }
                }
                if (var179) {
                    break;
                }
            }
            class523.field7670 = null;
            return true;
        } else if (class523.field7670 == class238.field3273) {
            int[] var197 = new int[4];
            for (int var198 = 0; var198 < 4; var198++) {
                var197[var198] = class29.field617.method2247(24565);
            }
            int var199 = class29.field617.method2271(-108);
            int var200 = class29.field617.method2279((byte) -120);
            class633 var201 = (class633) class522.field7662.method3678((long) var200, -124);
            if (var201 != null) {
                class262.method1595((byte) 124, var197, var199, var201.field9097);
            }
            class523.field7670 = null;
            return true;
        } else if (class523.field7670 == class318.field4203) {
            int var202 = class29.field617.method2255(255);
            int var203 = class29.field617.method2247(24565);
            int var204 = class29.field617.method2271(-104);
            if (class436.method2610(var203, 60)) {
                class497.method2895(var202, arg0 - 62, var204);
            }
            class523.field7670 = null;
            return true;
        } else if (class68.field1050 == class523.field7670) {
            boolean var205 = class29.field617.method2229(255) == 1;
            String var206 = class29.field617.method2244((byte) -47);
            String var207 = var206;
            if (var205) {
                var207 = class29.field617.method2244((byte) -78);
            }
            long var208 = class29.field617.method2227(-26276);
            long var210 = (long) class29.field617.method2260(-125);
            long var212 = (long) class29.field617.method2258(-3);
            int var214 = class29.field617.method2229(255);
            long var215 = (var210 << 32) + var212;
            boolean var217 = false;
            int var218 = 0;
            while (true) {
                if (var218 >= 100) {
                    if (var214 <= 1) {
                        if (!(!class256.field3481 || class341.field4503) || class689.field9822) {
                            var217 = true;
                        } else if (class573.method3360(-110, var207)) {
                            var217 = true;
                        }
                    }
                    break;
                }
                if (class421.field5993[var218] == var215) {
                    var217 = true;
                    break;
                }
                var218++;
            }
            if (!var217 && class346.field4548 == 0) {
                class421.field5993[class172.field2098] = var215;
                class172.field2098 = (class172.field2098 + 1) % 100;
                String var219 = class42.method462(class264.method1604(127, class29.field617), 1);
                if (var214 == 2 || var214 == 3) {
                    class568.method3328("<img=1>" + var206, 0, class189.method1167(arg0 ^ 0xFFFFEB0A, var208), "<img=1>" + var207, arg0 - 232, 9, -1, var219, var206);
                } else if (var214 == 1) {
                    class568.method3328("<img=0>" + var206, 0, class189.method1167(-5252, var208), "<img=0>" + var207, -85, 9, -1, var219, var206);
                } else {
                    class568.method3328(var206, 0, class189.method1167(arg0 ^ 0xFFFFEB0A, var208), var207, -120, 9, -1, var219, var206);
                }
            }
            class523.field7670 = null;
            return true;
        } else if (class523.field7670 == class216.field2801) {
            String var220 = class29.field617.method2244((byte) -50);
            boolean var221 = class29.field617.method2229(255) == 1;
            String var222;
            if (var221) {
                var222 = class29.field617.method2244((byte) -64);
            } else {
                var222 = var220;
            }
            int var223 = class29.field617.method2260(arg0 ^ 0xFFFFFFB0);
            byte var224 = class29.field617.method2249((byte) -70);
            boolean var225 = false;
            if (var224 == -128) {
                var225 = true;
            }
            if (var225) {
                if (class246.field3378 == 0) {
                    class523.field7670 = null;
                    return true;
                }
                boolean var231 = false;
                int var232;
                for (var232 = 0; var232 < class246.field3378 && (!class642.field9171[var232].field1065.equals(var222) || class642.field9171[var232].field1070 != var223); var232++) {
                }
                if (class246.field3378 > var232) {
                    while (var232 < class246.field3378 - 1) {
                        class642.field9171[var232] = class642.field9171[var232 + 1];
                        var232++;
                    }
                    class246.field3378--;
                    class642.field9171[class246.field3378] = null;
                }
            } else {
                String var226 = class29.field617.method2244((byte) -68);
                class70 var227 = new class70();
                var227.field1065 = var222;
                var227.field1072 = var220;
                var227.field1075 = class399.method2414(var227.field1065, false);
                var227.field1070 = var223;
                var227.field1073 = var224;
                var227.field1074 = var226;
                int var228;
                for (var228 = class246.field3378 - 1; var228 >= 0; var228--) {
                    int var229 = class642.field9171[var228].field1075.compareTo(var227.field1075);
                    if (var229 == 0) {
                        class642.field9171[var228].field1070 = var223;
                        class642.field9171[var228].field1073 = var224;
                        class642.field9171[var228].field1074 = var226;
                        if (var222.equals(class206.field2472.field8801)) {
                            class222.field2888 = var224;
                        }
                        class523.field7670 = null;
                        class531.field7755 = class59.field926;
                        return true;
                    }
                    if (var229 < 0) {
                        break;
                    }
                }
                if (class642.field9171.length <= class246.field3378) {
                    class523.field7670 = null;
                    return true;
                }
                for (int var230 = class246.field3378 - 1; var230 > var228; var230--) {
                    class642.field9171[var230 + 1] = class642.field9171[var230];
                }
                if (class246.field3378 == 0) {
                    class642.field9171 = new class70[100];
                }
                class642.field9171[var228 + 1] = var227;
                class246.field3378++;
                if (var222.equals(class206.field2472.field8801)) {
                    class222.field2888 = var224;
                }
            }
            class531.field7755 = class59.field926;
            class523.field7670 = null;
            return true;
        } else if (class89.field1251 == class523.field7670) {
            class698.field9879 = class59.field926;
            class417.field5915 = 1;
            class523.field7670 = null;
            return true;
        } else if (class525.field7697 == class523.field7670) {
            int var233 = class29.field617.method2247(24565);
            int var234 = class29.field617.method2223(arg0 ^ 0xFFFFFFE3);
            int var235 = class29.field617.method2223(-101);
            if (class436.method2610(var233, -74)) {
                class21 var236 = (class21) class113.field1442.method3678((long) var235, -122);
                class21 var237 = (class21) class113.field1442.method3678((long) var234, arg0 ^ 0xFFFFFFF6);
                if (var237 != null) {
                    class658.method3727(false, arg0 ^ 0x1BE8, var236 == null || var236.field540 != var237.field540, var237);
                }
                if (var236 != null) {
                    var236.method3045(true);
                    class113.field1442.method3670((long) var234, var236, (byte) 127);
                }
                class17 var238 = class400.method2420((byte) -96, var235);
                if (var238 != null) {
                    class314.method1836(var238, false);
                }
                class17 var239 = class400.method2420((byte) -103, var234);
                if (var239 != null) {
                    class314.method1836(var239, false);
                    class431.method2592(true, var239, -1);
                }
                if (class127.field1619 != -1) {
                    class534.method3137(1, class127.field1619, arg0 - 116);
                }
            }
            class523.field7670 = null;
            return true;
        } else if (class523.field7670 == class49.field823) {
            int var240 = class29.field617.method2280((byte) 127);
            int var241 = class29.field617.method2274((byte) 91);
            int var242 = class29.field617.method2247(arg0 ^ 0x5F83);
            if (var242 == 65535) {
                var242 = -1;
            }
            if (class436.method2610(var241, arg0 ^ 0x3D)) {
                class401.method2422(var240, 2, var242, -1, 4);
            }
            class523.field7670 = null;
            return true;
        } else if (class7.field72 == class523.field7670) {
            class421.method2546((byte) -113, class267.field3668);
            class523.field7670 = null;
            return true;
        } else if (class702.field9919 == class523.field7670) {
            int var243 = class29.field617.method2260(-54);
            String var244 = class29.field617.method2244((byte) -86);
            int var245 = class29.field617.method2247(arg0 ^ 0x5F83);
            if (class436.method2610(var245, arg0 - 59)) {
                class687.method3887(var244, (byte) 121, var243);
            }
            class523.field7670 = null;
            return true;
        } else if (class523.field7670 == class344.field4527) {
            class544.method3187(-5732, class29.field617, class283.field3848);
            class523.field7670 = null;
            return true;
        } else if (class603.field8697 == class523.field7670) {
            class531.field7755 = class59.field926;
            if (class283.field3848 == 0) {
                class496.field6913 = null;
                class642.field9171 = null;
                class523.field7670 = null;
                class234.field3125 = null;
                class246.field3378 = 0;
                return true;
            }
            class234.field3125 = class29.field617.method2244((byte) -125);
            boolean var246 = class29.field617.method2229(255) == 1;
            if (var246) {
                class29.field617.method2244((byte) -40);
            }
            long var247 = class29.field617.method2227(-26276);
            class496.field6913 = class437.method2613((byte) -126, var247);
            class96.field1305 = class29.field617.method2249((byte) -70);
            int var249 = class29.field617.method2229(255);
            if (var249 == 255) {
                class523.field7670 = null;
                return true;
            }
            class246.field3378 = var249;
            class70[] var250 = new class70[100];
            for (int var251 = 0; var251 < class246.field3378; var251++) {
                var250[var251] = new class70();
                var250[var251].field1072 = class29.field617.method2244((byte) -69);
                boolean var257 = class29.field617.method2229(255) == 1;
                if (var257) {
                    var250[var251].field1065 = class29.field617.method2244((byte) -115);
                } else {
                    var250[var251].field1065 = var250[var251].field1072;
                }
                var250[var251].field1075 = class399.method2414(var250[var251].field1065, false);
                var250[var251].field1070 = class29.field617.method2260(arg0 ^ 0xFFFFFFB2);
                var250[var251].field1073 = class29.field617.method2249((byte) -70);
                var250[var251].field1074 = class29.field617.method2244((byte) -119);
                if (var250[var251].field1065.equals(class206.field2472.field8801)) {
                    class222.field2888 = var250[var251].field1073;
                }
            }
            boolean var252 = false;
            int var253 = class246.field3378;
            while (var253 > 0) {
                var253--;
                boolean var254 = true;
                for (int var255 = 0; var255 < var253; var255++) {
                    if (var250[var255].field1075.compareTo(var250[var255 + 1].field1075) > 0) {
                        class70 var256 = var250[var255];
                        var250[var255] = var250[var255 + 1];
                        var250[var255 + 1] = var256;
                        var254 = false;
                    }
                }
                if (var254) {
                    break;
                }
            }
            class642.field9171 = var250;
            class523.field7670 = null;
            return true;
        } else if (class523.field7670 == class20.field526) {
            int var258 = class29.field617.method2274((byte) -118);
            int var259 = class29.field617.method2229(255);
            if (class436.method2610(var258, arg0 - 220)) {
                class324.field4336 = var259;
            }
            class523.field7670 = null;
            return true;
        } else if (class523.field7670 == class400.field5641) {
            class512.field7510 = class29.field617.method2229(arg0 + 137);
            class523.field7670 = null;
            class345.field4534 = class59.field926;
            return true;
        } else if (class523.field7670 == class396.field5593) {
            int var260 = class29.field617.method2260(-45);
            if (var260 == 65535) {
                var260 = -1;
            }
            int var261 = class29.field617.method2229(255);
            int var262 = class29.field617.method2260(-89);
            int var263 = class29.field617.method2229(255);
            class188.method1164(var263, var262, var260, -1, true, 256, var261);
            class523.field7670 = null;
            return true;
        } else if (class84.field1192 == class523.field7670) {
            class351.method1995(class29.field617.method2244((byte) -97), true);
            class523.field7670 = null;
            return true;
        } else if (class523.field7670 == class279.field3800) {
            int var264 = class29.field617.method2279((byte) -128);
            int var265 = class29.field617.method2251(-800775208);
            int var266 = class29.field617.method2247(24565);
            int var267 = class29.field617.method2255(255);
            if (class436.method2610(var264, arg0 ^ 0xFFFFFFEE)) {
                class401.method2422(var267, 5, var266, var265, 4);
            }
            class523.field7670 = null;
            return true;
        } else if (class523.field7670 == class285.field3859) {
            class410.field5804.method3191(false);
            class631.field9083 += 32;
            class523.field7670 = null;
            return true;
        } else if (class523.field7670 == class219.field2838) {
            class152.method979((byte) -114);
            class523.field7670 = null;
            return false;
        } else if (class523.field7670 == class23.field565) {
            byte var268 = class29.field617.method2249((byte) -70);
            int var269 = class29.field617.method2279((byte) -128);
            int var270 = class29.field617.method2229(255);
            if (class436.method2610(var269, arg0 ^ 0x1B)) {
                class497.method2896(var270, 615032972, var268);
            }
            class523.field7670 = null;
            return true;
        } else if (class523.field7670 == class475.field6650) {
            if (class617.field8851 != null) {
                class14.method153(-1, class221.field2851.field4148, false, -1, (byte) 109);
            }
            byte[] var271 = new byte[class283.field3848];
            class29.field617.method34(1024, 0, var271, class283.field3848);
            String var272 = class149.method965((byte) -107, class283.field3848, 0, var271);
            class266.method1610((byte) -118, true, var272, class375.field5039 == 1, class517.field7570);
            class523.field7670 = null;
            return true;
        } else if (class68.field1038 == class523.field7670) {
            if (class657.method3723(class114.field1485, -10)) {
                class242.field3323 = (int) ((float) class29.field617.method2260(-115) * 2.5F);
            } else {
                class242.field3323 = class29.field617.method2260(-94) * 30;
            }
            class523.field7670 = null;
            class345.field4534 = class59.field926;
            return true;
        } else if (class523.field7670 == class332.field4417) {
            int var273 = class29.field617.method2279((byte) -124);
            int var274 = class29.field617.method2234(-1);
            int var275 = class29.field617.method2251(-800775208);
            if (class436.method2610(var273, -95)) {
                class466.method2733(var274, (byte) -122, var275);
            }
            class523.field7670 = null;
            return true;
        } else if (class523.field7670 == class433.field6214) {
            class421.method2546((byte) -112, class389.field5192);
            class523.field7670 = null;
            return true;
        } else if (class523.field7670 == class437.field6251) {
            int var276 = class29.field617.method2271(-121);
            int var277 = class29.field617.method2279((byte) -123);
            int var278 = class29.field617.method2279((byte) -125);
            if (class436.method2610(var278, -86)) {
                if (var276 == 2) {
                    class516.method3057((byte) -92);
                }
                class127.field1619 = var277;
                class71.method633(var277, arg0 - 3);
                class161.method1019((byte) -97, false);
                class545.method3198(class127.field1619);
                for (int var279 = 0; var279 < 100; var279++) {
                    class89.field1253[var279] = true;
                }
            }
            class523.field7670 = null;
            return true;
        } else if (class69.field1058 == class523.field7670) {
            class421.method2546((byte) 100, class634.field9099);
            class523.field7670 = null;
            return true;
        } else if (class523.field7670 == class224.field2908) {
            class230.field3000 = class29.field617.method2229(255);
            for (int var280 = 0; var280 < class230.field3000; var280++) {
                class100.field1340[var280] = class29.field617.method2244((byte) -72);
                class208.field2541[var280] = class29.field617.method2244((byte) -63);
                if (class208.field2541[var280].equals("")) {
                    class208.field2541[var280] = class100.field1340[var280];
                }
                class405.field5735[var280] = class29.field617.method2244((byte) -83);
                class568.field8315[var280] = class29.field617.method2244((byte) -71);
                if (class568.field8315[var280].equals("")) {
                    class568.field8315[var280] = class405.field5735[var280];
                }
                class570.field8337[var280] = false;
            }
            class523.field7670 = null;
            class698.field9879 = class59.field926;
            return true;
        } else if (class523.field7670 == class256.field3479) {
            class301.field4043 = class29.field617.method2229(arg0 ^ 0x89);
            class523.field7670 = null;
            return true;
        } else if (class523.field7670 == class113.field1460) {
            int var281 = class29.field617.method2260(arg0 - 231);
            if (var281 == 65535) {
                var281 = -1;
            }
            int var282 = class29.field617.method2251(-800775208);
            int var283 = var282 >> 28 & 0x3;
            int var284 = var282 >> 14 & 0x3FFF;
            int var285 = var282 & 0x3FFF;
            int var286 = class29.field617.method2240((byte) 127);
            int var287 = var286 >> 2;
            int var288 = var286 & 0x3;
            int var289 = var285 - class88.field1239;
            int var290 = var284 - class36.field689;
            int var291 = class289.field3918[var287];
            class327.method1904(var288, var290, var289, var281, var283, var291, var287, -9);
            class523.field7670 = null;
            return true;
        } else if (class523.field7670 == class288.field3886) {
            class421.method2546((byte) 117, class215.field2733);
            class523.field7670 = null;
            return true;
        } else if (class563.field8142 == class523.field7670) {
            boolean var292 = class29.field617.method2229(255) == 1;
            String var293 = class29.field617.method2244((byte) -128);
            String var294 = var293;
            if (var292) {
                var294 = class29.field617.method2244((byte) -40);
            }
            int var295 = class29.field617.method2229(255);
            int var296 = class29.field617.method2260(-83);
            boolean var297 = false;
            if (var295 <= 1 && class573.method3360(-91, var294)) {
                var297 = true;
            }
            if (!var297 && class346.field4548 == 0) {
                String var298 = class188.field2292.method1869(var296, -116).method2455(class29.field617, arg0 - 119);
                if (var295 == 2) {
                    class568.method3328("<img=1>" + var293, 0, null, "<img=1>" + var294, -98, 25, var296, var298, var293);
                } else if (var295 == 1) {
                    class568.method3328("<img=0>" + var293, 0, null, "<img=0>" + var294, arg0 ^ 0xFFFFFFD0, 25, var296, var298, var293);
                } else {
                    class568.method3328(var293, 0, null, var294, 98, 25, var296, var298, var293);
                }
            }
            class523.field7670 = null;
            return true;
        } else if (class523.field7670 == class101.field1354) {
            class421.method2546((byte) 118, class468.field6538);
            class523.field7670 = null;
            return true;
        } else if (class523.field7670 == class465.field6485) {
            int var299 = class29.field617.method2260(-74);
            if (var299 == 65535) {
                var299 = -1;
            }
            int var300 = class29.field617.method2229(255);
            int var301 = class29.field617.method2260(-90);
            int var302 = class29.field617.method2229(255);
            int var303 = class29.field617.method2260(arg0 ^ 0xFFFFFF91);
            class188.method1164(var302, var301, var299, -1, false, var303, var300);
            class523.field7670 = null;
            return true;
        } else if (class523.field7670 == class329.field4383) {
            int var304 = class29.field617.method2251(-800775208);
            int var305 = class29.field617.method2255(255);
            int var306 = class29.field617.method2279((byte) -124);
            if (var306 == 65535) {
                var306 = -1;
            }
            int var307 = class29.field617.method2247(arg0 + 24447);
            int var308 = class29.field617.method2279((byte) -127);
            if (var308 == 65535) {
                var308 = -1;
            }
            if (class436.method2610(var307, -123)) {
                for (int var309 = var306; var309 <= var308; var309++) {
                    long var310 = ((long) var304 << 32) + (long) var309;
                    class158 var312 = (class158) class512.field7516.method3678(var310, arg0 - 244);
                    class158 var313;
                    if (var312 != null) {
                        var313 = new class158(var305, var312.field1923);
                        var312.method3045(true);
                    } else if (var309 == -1) {
                        var313 = new class158(var305, class400.method2420((byte) -103, var304).field349.field1923);
                    } else {
                        var313 = new class158(var305, -1);
                    }
                    class512.field7516.method3670(var310, var313, (byte) 127);
                }
            }
            class523.field7670 = null;
            return true;
        } else if (class523.field7670 == class116.field1500) {
            int var314 = class29.field617.method2274((byte) 109);
            int var315 = class29.field617.method2223(-105);
            if (class436.method2610(var314, -83)) {
                class401.method2422(var315, 5, class63.field1016, 0, 4);
            }
            class523.field7670 = null;
            return true;
        } else if (class523.field7670 == class373.field5024) {
            int var316 = class29.field617.method2229(arg0 + 137);
            boolean var317 = (var316 & 0x1) == 1;
            String var318 = class29.field617.method2244((byte) -116);
            String var319 = class29.field617.method2244((byte) -68);
            if (var319.equals("")) {
                var319 = var318;
            }
            String var320 = class29.field617.method2244((byte) -40);
            String var321 = class29.field617.method2244((byte) -40);
            if (var321.equals("")) {
                var321 = var320;
            }
            if (var317) {
                for (int var322 = 0; var322 < class230.field3000; var322++) {
                    if (class208.field2541[var322].equals(var321)) {
                        class100.field1340[var322] = var318;
                        class208.field2541[var322] = var319;
                        class405.field5735[var322] = var320;
                        class568.field8315[var322] = var321;
                        break;
                    }
                }
            } else {
                class100.field1340[class230.field3000] = var318;
                class208.field2541[class230.field3000] = var319;
                class405.field5735[class230.field3000] = var320;
                class568.field8315[class230.field3000] = var321;
                class570.field8337[class230.field3000] = class435.method2605(var316, 2) == 2;
                class230.field3000++;
            }
            class698.field9879 = class59.field926;
            class523.field7670 = null;
            return true;
        } else if (class697.field9870 == class523.field7670) {
            int var323 = class29.field617.method2247(24565);
            int var324 = class29.field617.method2247(24565);
            int var325 = class29.field617.method2260(-115);
            if (class436.method2610(var325, 123)) {
                class603.method3478(var324, true, var323, 0);
            }
            class523.field7670 = null;
            return true;
        } else if (class580.field8463 == class523.field7670) {
            int var326 = class29.field617.method2260(-107);
            int var327 = class29.field617.method2229(255);
            boolean var328 = (var327 & 0x1) == 1;
            class559.method3274(var326, var328, 2);
            int var329 = class29.field617.method2260(-117);
            for (int var330 = 0; var330 < var329; var330++) {
                int var331 = class29.field617.method2229(255);
                if (var331 == 255) {
                    var331 = class29.field617.method2255(255);
                }
                int var332 = class29.field617.method2279((byte) -122);
                class465.method2730(var331, var330, (byte) 90, var328, var326, var332 - 1);
            }
            class594.field8585[class435.method2605(class36.field692++, 31)] = var326;
            class523.field7670 = null;
            return true;
        } else if (class523.field7670 == class112.field1439) {
            int var333 = class29.field617.method2260(-75);
            class613 var334;
            if (class63.field1016 == var333) {
                var334 = class206.field2472;
            } else {
                var334 = class184.field2252[var333];
            }
            if (var334 == null) {
                class523.field7670 = null;
                return true;
            }
            int var335 = class29.field617.method2260(arg0 ^ 0xFFFFFFE1);
            int var336 = class29.field617.method2229(arg0 ^ 0x89);
            boolean var337 = (var335 & 0x8000) != 0;
            if (var334.field8801 != null && var334.field8824 != null) {
                boolean var338 = false;
                if (var336 <= 1) {
                    if (!var337 && !(!class256.field3481 || class341.field4503) || class689.field9822) {
                        var338 = true;
                    } else if (class573.method3360(arg0 - 190, var334.field8801)) {
                        var338 = true;
                    }
                }
                if (!var338 && class346.field4548 == 0) {
                    int var339 = -1;
                    String var340;
                    if (var337) {
                        var335 &= 0x7FFF;
                        class189 var341 = class437.method2615(class29.field617, (byte) -96);
                        var339 = var341.field2311;
                        var340 = var341.field2302.method2455(class29.field617, -1);
                    } else {
                        var340 = class42.method462(class264.method1604(arg0 ^ 0x3C, class29.field617), 1);
                    }
                    var334.field2639 = var340.trim();
                    var334.field2576 = var335 >> 8;
                    var334.field2621 = 150;
                    var334.field2658 = var335 & 0xFF;
                    int var342;
                    if (var336 == 1 || var336 == 2) {
                        var342 = var337 ? 17 : 1;
                    } else {
                        var342 = var337 ? 17 : 2;
                    }
                    if (var336 == 2) {
                        class568.method3328("<img=1>" + var334.method3521(true, (byte) -101), 0, null, "<img=1>" + var334.method3511(-1, false), 43, var342, var339, var340, var334.field8786);
                    } else if (var336 == 1) {
                        class568.method3328("<img=0>" + var334.method3521(true, (byte) -99), 0, null, "<img=0>" + var334.method3511(arg0 ^ 0xFFFFFF89, false), -99, var342, var339, var340, var334.field8786);
                    } else {
                        class568.method3328(var334.method3521(true, (byte) -125), 0, null, var334.method3511(-1, false), -114, var342, var339, var340, var334.field8786);
                    }
                }
            }
            class523.field7670 = null;
            return true;
        } else if (class523.field7670 == class238.field3241) {
            int var343 = class29.field617.method2279((byte) -123);
            int var344 = class29.field617.method2280((byte) 33);
            int var345 = class29.field617.method2260(-71);
            if (class436.method2610(var343, -65)) {
                class548.method3212(false, var344, var345);
            }
            class523.field7670 = null;
            return true;
        } else if (class78.field1140 == class523.field7670) {
            int var346 = class29.field617.method2278((byte) 17);
            int var347 = class29.field617.method2260(arg0 ^ 0xFFFFFF91);
            int var348 = class29.field617.method2251(-800775208);
            int var349 = class29.field617.method2234(-1);
            if (class436.method2610(var347, -58)) {
                class73.method643(var346, var348, var349, 17705);
            }
            class523.field7670 = null;
            return true;
        } else if (class523.field7670 == class356.field4749) {
            class54.method568(62);
            class523.field7670 = null;
            return true;
        } else if (class523.field7670 == class356.field4755) {
            int var350 = class29.field617.method2260(-114);
            if (class436.method2610(var350, arg0 - 190)) {
                class578.method3378((byte) 107);
            }
            class523.field7670 = null;
            return true;
        } else if (class84.field1200 == class523.field7670) {
            int var351 = class29.field617.method2260(-47);
            String var352 = class29.field617.method2244((byte) -79);
            Object[] var353 = new Object[var352.length() + 1];
            for (int var354 = var352.length() - 1; var354 >= 0; var354--) {
                if (var352.charAt(var354) == 's') {
                    var353[var354 + 1] = class29.field617.method2244((byte) -87);
                } else {
                    var353[var354 + 1] = Integer.valueOf(class29.field617.method2255(255));
                }
            }
            var353[0] = Integer.valueOf(class29.field617.method2255(255));
            if (class436.method2610(var351, 89)) {
                class143 var355 = new class143();
                var355.field1786 = var353;
                class545.method3204(var355);
            }
            class523.field7670 = null;
            return true;
        } else if (class523.field7670 == class12.field194) {
            class168.method1061((byte) 90, false);
            class523.field7670 = null;
            return false;
        } else if (class523.field7670 == class164.field2008) {
            int var356 = class29.field617.method2260(-101);
            if (var356 == 65535) {
                var356 = -1;
            }
            int var357 = class29.field617.method2229(255);
            int var358 = class29.field617.method2260(arg0 - 145);
            int var359 = class29.field617.method2229(255);
            int var360 = class29.field617.method2260(-85);
            class6.method38((byte) 100, var356, var359, var360, var358, var357);
            class523.field7670 = null;
            return true;
        } else if (class527.field7713 == class523.field7670) {
            int var361 = class29.field617.method2247(24565);
            int var362 = class29.field617.method2251(-800775208);
            int var363 = class29.field617.method2260(-33);
            if (var363 == 65535) {
                var363 = -1;
            }
            if (class436.method2610(var361, -112)) {
                class617.method3530(var362, -2, var363);
            }
            class523.field7670 = null;
            return true;
        } else if (class523.field7670 == class219.field2839) {
            int var364 = class29.field617.method2229(255);
            int var365 = class29.field617.method2247(24565);
            class410.field5804.method3185(var364, -12764, var365);
            class523.field7670 = null;
            return true;
        } else if (class523.field7670 == class412.field5849) {
            String var366 = class29.field617.method2244((byte) -75);
            String var367 = class42.method462(class264.method1604(76, class29.field617), 1);
            class301.method1786(var366, var367, var366, var366, -1, 6, 0);
            class523.field7670 = null;
            return true;
        } else if (class523.field7670 == class522.field7658) {
            byte var368 = class29.field617.method2225((byte) 112);
            int var369 = class29.field617.method2279((byte) -125);
            int var370 = class29.field617.method2260(-91);
            if (class436.method2610(var370, 113)) {
                class548.method3212(false, var368, var369);
            }
            class523.field7670 = null;
            return true;
        } else if (class523.field7670 == class299.field4025) {
            int var371 = class29.field617.method2247(24565);
            int var372 = class29.field617.method2274((byte) 118);
            int var373 = class29.field617.method2251(-800775208);
            int var374 = class29.field617.method2279((byte) -122);
            int var375 = class29.field617.method2247(24565);
            if (class436.method2610(var372, -110)) {
                class401.method2422(var373, 7, var371 | var374 << 16, var375, 4);
            }
            class523.field7670 = null;
            return true;
        } else if (class523.field7670 == class336.field4466) {
            int var376 = class29.field617.method2260(-81);
            int var377 = class29.field617.method2251(-800775208);
            if (class436.method2610(var376, 95)) {
                if (var377 == -1) {
                    class221.field2860 = -1;
                    class51.field842 = -1;
                } else {
                    int var378 = (var377 & 0xFFFC810) >> 14;
                    int var379 = var377 & 0x3FFF;
                    int var380 = var378 - class36.field689;
                    if (var380 < 0) {
                        var380 = 0;
                    } else if (class473.field6604 <= var380) {
                        var380 = class473.field6604;
                    }
                    int var381 = var379 - class88.field1239;
                    if (var381 < 0) {
                        var381 = 0;
                    } else if (var381 >= class205.field2465) {
                        var381 = class205.field2465;
                    }
                    class51.field842 = (var380 << 9) + 256;
                    class221.field2860 = (var381 << 9) + 256;
                }
            }
            class523.field7670 = null;
            return true;
        } else if (class676.field9692 == class523.field7670) {
            class421.method2546((byte) -80, class173.field2130);
            class523.field7670 = null;
            return true;
        } else if (class569.field8325 == class523.field7670) {
            class327.field4366 = class29.field617.method2277((byte) -52) << 3;
            class493.field6893 = class29.field617.method2240((byte) 121);
            class309.field4086 = class29.field617.method2276(128) << 3;
            while (class283.field3848 > class29.field617.field5195) {
                class82 var382 = class9.method52((byte) -110)[class29.field617.method2229(255)];
                class421.method2546((byte) -50, var382);
            }
            class523.field7670 = null;
            return true;
        } else if (class523.field7670 == class276.field3780) {
            String var383 = class29.field617.method2244((byte) -69);
            int var384 = class29.field617.method2260(-113);
            String var385 = class188.field2292.method1869(var384, arg0 ^ 0xFFFFFFEE).method2455(class29.field617, -1);
            class568.method3328(var383, 0, null, var383, -114, 19, var384, var385, var383);
            class523.field7670 = null;
            return true;
        } else if (class523.field7670 == class344.field4526) {
            class62.field1000 = class283.field3848 > 2 ? class29.field617.method2244((byte) -90) : class424.field6064.method2561(class370.field4980, 0);
            class521.field7632 = class283.field3848 > 0 ? class29.field617.method2260(-72) : -1;
            class523.field7670 = null;
            if (class521.field7632 == 65535) {
                class521.field7632 = -1;
            }
            return true;
        } else if (class523.field7670 == class362.field4810) {
            int var386 = class29.field617.method2262(true);
            int var387 = class29.field617.method2240((byte) 119);
            if (var386 == 255) {
                var387 = -1;
                var386 = -1;
            }
            class585.method3397(var386, var387, arg0 + 9);
            class523.field7670 = null;
            return true;
        } else if (class56.field893 == class523.field7670) {
            int var388 = class29.field617.method2260(-84);
            int var389 = class29.field617.method2260(-67);
            int var390 = class29.field617.method2260(-27);
            int var391 = class29.field617.method2260(-62);
            if (class436.method2610(var388, arg0 ^ 0xFFFFFFDC) && class516.field7555[var389] != null) {
                for (int var392 = var390; var392 < var391; var392++) {
                    int var393 = class29.field617.method2258(-3);
                    if (class516.field7555[var389].length > var392 && class516.field7555[var389][var392] != null) {
                        class516.field7555[var389][var392].field455 = var393;
                    }
                }
            }
            class523.field7670 = null;
            return true;
        } else if (class641.field9157 == class523.field7670) {
            class327.field4366 = class29.field617.method2277((byte) -52) << 3;
            class309.field4086 = class29.field617.method2249((byte) -70) << 3;
            class493.field6893 = class29.field617.method2229(255);
            for (class507 var394 = (class507) class475.field6655.method3669((byte) 28); var394 != null; var394 = (class507) class475.field6655.method3676((byte) -12)) {
                int var396 = (int) (var394.field7519 >> 28 & 0x3L);
                int var397 = (int) (var394.field7519 & 0x3FFFL);
                int var398 = var397 - class36.field689;
                int var399 = (int) (var394.field7519 >> 14 & 0x3FFFL);
                int var400 = var399 - class88.field1239;
                if (class493.field6893 == var396 && class309.field4086 <= var398 && class309.field4086 + 8 > var398 && var400 >= class327.field4366 && class327.field4366 + 8 > var400) {
                    var394.method3045(true);
                    if (var398 >= 0 && var400 >= 0 && var398 < class473.field6604 && class205.field2465 > var400) {
                        class506.method2936(var398, var400, class493.field6893, (byte) -96);
                    }
                }
            }
            for (class32 var395 = (class32) class440.field6267.method1132((byte) -128); var395 != null; var395 = (class32) class440.field6267.method1134(8446)) {
                if (class309.field4086 <= var395.field647 && var395.field647 < class309.field4086 + 8 && var395.field661 >= class327.field4366 && class327.field4366 + 8 > var395.field661 && class493.field6893 == var395.field648) {
                    var395.field657 = 0;
                }
            }
            class523.field7670 = null;
            return true;
        } else if (class523.field7670 == class429.field6159) {
            int var401 = class29.field617.method2247(24565);
            if (var401 == 65535) {
                var401 = -1;
            }
            int var402 = class29.field617.method2247(24565);
            int var403 = class29.field617.method2247(24565);
            int var404 = class29.field617.method2279((byte) -123);
            if (var404 == 65535) {
                var404 = -1;
            }
            int var405 = class29.field617.method2251(-800775208);
            if (class436.method2610(var403, arg0 - 224)) {
                for (int var406 = var404; var406 <= var401; var406++) {
                    long var407 = ((long) var405 << 32) + (long) var406;
                    class158 var409 = (class158) class512.field7516.method3678(var407, -125);
                    class158 var410;
                    if (var409 != null) {
                        var410 = new class158(var409.field1929, var402);
                        var409.method3045(true);
                    } else if (var406 == -1) {
                        var410 = new class158(class400.method2420((byte) -107, var405).field349.field1929, var402);
                    } else {
                        var410 = new class158(0, var402);
                    }
                    class512.field7516.method3670(var407, var410, (byte) 127);
                }
            }
            class523.field7670 = null;
            return true;
        } else if (class523.field7670 == class479.field6719) {
            int var411 = class29.field617.method2229(255);
            int var412 = class29.field617.method2279((byte) -120);
            boolean var413 = (var411 & 0x1) == 1;
            class686.method3884(var413, var412, -20316);
            class594.field8585[class435.method2605(31, class36.field692++)] = var412;
            class523.field7670 = null;
            return true;
        } else if (class523.field7670 == class209.field2547) {
            boolean var414 = class29.field617.method2229(255) == 1;
            String var415 = class29.field617.method2244((byte) -52);
            String var416 = var415;
            if (var414) {
                var416 = class29.field617.method2244((byte) -55);
            }
            long var417 = (long) class29.field617.method2260(-97);
            long var419 = (long) class29.field617.method2258(-3);
            int var421 = class29.field617.method2229(arg0 + 137);
            int var422 = class29.field617.method2260(-89);
            long var423 = (var417 << 32) + var419;
            boolean var425 = false;
            int var426 = 0;
            while (true) {
                if (var426 >= 100) {
                    if (var421 <= 1 && class573.method3360(-94, var416)) {
                        var425 = true;
                    }
                    break;
                }
                if (class421.field5993[var426] == var423) {
                    var425 = true;
                    break;
                }
                var426++;
            }
            if (!var425 && class346.field4548 == 0) {
                class421.field5993[class172.field2098] = var423;
                class172.field2098 = (class172.field2098 + 1) % 100;
                String var427 = class188.field2292.method1869(var422, -128).method2455(class29.field617, -1);
                if (var421 == 2) {
                    class568.method3328("<img=1>" + var415, 0, null, "<img=1>" + var416, arg0 ^ 0x64, 18, var422, var427, var415);
                } else if (var421 == 1) {
                    class568.method3328("<img=0>" + var415, 0, null, "<img=0>" + var416, 55, 18, var422, var427, var415);
                } else {
                    class568.method3328(var415, 0, null, var416, 79, 18, var422, var427, var415);
                }
            }
            class523.field7670 = null;
            return true;
        } else if (class523.field7670 == class273.field3722) {
            int var428 = class29.field617.method2229(255);
            int var429 = var428 >> 5;
            int var430 = var428 & 0x1F;
            if (var430 == 0) {
                class631.field9068[var429] = null;
                class523.field7670 = null;
                return true;
            }
            class341 var431 = new class341();
            var431.field4508 = var430;
            var431.field4510 = class29.field617.method2229(255);
            if (var431.field4510 >= 0 && class524.field7696.length > var431.field4510) {
                if (var431.field4508 == 1 || var431.field4508 == 10) {
                    var431.field4513 = class29.field617.method2260(-68);
                    class29.field617.field5195 += 6;
                } else if (var431.field4508 >= 2 && var431.field4508 <= 6) {
                    if (var431.field4508 == 2) {
                        var431.field4504 = 256;
                        var431.field4506 = 256;
                    }
                    if (var431.field4508 == 3) {
                        var431.field4506 = 256;
                        var431.field4504 = 0;
                    }
                    if (var431.field4508 == 4) {
                        var431.field4504 = 512;
                        var431.field4506 = 256;
                    }
                    if (var431.field4508 == 5) {
                        var431.field4506 = 0;
                        var431.field4504 = 256;
                    }
                    if (var431.field4508 == 6) {
                        var431.field4506 = 512;
                        var431.field4504 = 256;
                    }
                    var431.field4508 = 2;
                    var431.field4512 = class29.field617.method2229(arg0 + 137);
                    var431.field4504 += class29.field617.method2260(arg0 ^ 0xFFFFFFCC) - class36.field689 << 9;
                    var431.field4506 += class29.field617.method2260(-45) - class88.field1239 << 9;
                    var431.field4507 = class29.field617.method2229(255) << 2;
                    var431.field4509 = class29.field617.method2260(-107);
                }
                var431.field4511 = class29.field617.method2260(-53);
                if (var431.field4511 == 65535) {
                    var431.field4511 = -1;
                }
                class631.field9068[var429] = var431;
            }
            class523.field7670 = null;
            return true;
        } else if (class523.field7670 == class469.field6557) {
            int var432 = class29.field617.method2279((byte) -125);
            if (var432 == 65535) {
                var432 = -1;
            }
            int var433 = class29.field617.method2274((byte) -74);
            int var434 = class29.field617.method2223(-125);
            if (class436.method2610(var433, arg0 ^ 0xE)) {
                class401.method2422(var434, 1, var432, -1, arg0 - 114);
            }
            class523.field7670 = null;
            return true;
        } else if (arg0 != 118) {
            return true;
        } else if (class90.field1261 == class523.field7670) {
            class395.field5585 = class29.field617.method2219((byte) 67);
            class256.field3481 = class29.field617.method2229(255) == 1;
            class523.field7670 = null;
            return true;
        } else if (class523.field7670 == class421.field5962) {
            if (class127.field1619 != -1) {
                class534.method3137(0, class127.field1619, 2);
            }
            class523.field7670 = null;
            return true;
        } else if (class65.field1020 == class523.field7670) {
            class421.method2546((byte) 121, class28.field614);
            class523.field7670 = null;
            return true;
        } else if (class523.field7670 == class380.field5091) {
            int var435 = class29.field617.method2255(255);
            class430.field6163 = class517.field7570.method1513((byte) -57, var435);
            class523.field7670 = null;
            return true;
        } else if (class523.field7670 == class406.field5751) {
            int var436 = class29.field617.method2274((byte) 98);
            int var437 = class29.field617.method2274((byte) 49);
            int var438 = class29.field617.method2251(-800775208);
            if (class436.method2610(var437, 123)) {
                class537.method3156(arg0 ^ 0xFFFF9C86, var436, var438);
            }
            class523.field7670 = null;
            return true;
        } else if (class523.field7670 == class447.field6332) {
            class133.method892((byte) -116);
            class523.field7670 = null;
            return false;
        } else {
            class544.method3184(23383, "T1 - " + (class523.field7670 == null ? -1 : class523.field7670.method3903(true)) + "," + (class681.field9744 == null ? -1 : class681.field9744.method3903(true)) + "," + (class268.field3674 == null ? -1 : class268.field3674.method3903(true)) + " - " + class283.field3848, null);
            class168.method1061((byte) 89, false);
            return true;
        }
    }

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "(Z)V", line = 3364)
    public final void method3045(boolean arg0) {
        field7527++;
        if (!arg0) {
            this.field7522 = null;
        }
        if (this.field7522 != null) {
            this.field7522.field7520 = this.field7520;
            this.field7520.field7522 = this.field7522;
            this.field7520 = null;
            this.field7522 = null;
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(III)Z", line = 3387)
    public static final boolean method3046(int arg0, int arg1, int arg2) {
        if (arg1 == 2) {
            field7525++;
            return (arg2 & 0x800) != 0 && (arg0 & 0x37) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "(I)Z", line = 3400)
    public final boolean method3047(int arg0) {
        field7526++;
        if (this.field7522 == null) {
            return false;
        } else if (arg0 == 32) {
            return true;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "(I)V", line = 3415)
    public static final void method3048(int arg0) {
        field7524++;
        if (class119.field1524 != null) {
            return;
        }
        class119.field1524 = new int[65536];
        double var1 = Math.random() * 0.03D + 0.7D - 0.015D;
        int var3 = 0;
        if (arg0 != -14174) {
            method3048(125);
        }
        for (int var4 = 0; var4 < 512; var4++) {
            float var5 = ((float) (var4 >> 3) / 64.0F + 0.0078125F) * 360.0F;
            float var6 = (float) (var4 & 0x7) / 8.0F + 0.0625F;
            for (int var7 = 0; var7 < 128; var7++) {
                float var8 = (float) var7 / 128.0F;
                float var9 = 0.0F;
                float var10 = 0.0F;
                float var11 = 0.0F;
                float var12 = var5 / 60.0F;
                int var13 = (int) var12;
                int var14 = var13 % 6;
                float var15 = (float) (-var13) + var12;
                float var16 = (1.0F - var6) * var8;
                float var17 = (1.0F - (var6 * var15)) * var8;
                float var18 = (1.0F - (1.0F - var15) * var6) * var8;
                if (var14 == 0) {
                    var11 = var16;
                    var10 = var18;
                    var9 = var8;
                } else if (var14 == 1) {
                    var10 = var8;
                    var11 = var16;
                    var9 = var17;
                } else if (var14 == 2) {
                    var10 = var8;
                    var9 = var16;
                    var11 = var18;
                } else if (var14 == 3) {
                    var11 = var8;
                    var9 = var16;
                    var10 = var17;
                } else if (var14 == 4) {
                    var9 = var18;
                    var10 = var16;
                    var11 = var8;
                } else if (var14 == 5) {
                    var9 = var8;
                    var11 = var17;
                    var10 = var16;
                }
                float var19 = (float) Math.pow((double) var9, var1);
                float var20 = (float) Math.pow((double) var10, var1);
                float var21 = (float) Math.pow((double) var11, var1);
                int var22 = (int) (var19 * 256.0F);
                int var23 = (int) (var20 * 256.0F);
                int var24 = (int) (var21 * 256.0F);
                int var25 = -(-(var22 << 16) - ((var23 << 8) + var24)) - 16777216;
                class119.field1524[var3++] = var25;
            }
        }
    }
}
