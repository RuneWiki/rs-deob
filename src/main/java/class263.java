import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class263 extends class413 {

    @OriginalMember(owner = "client!td", name = "g", descriptor = "I")
    public static int field3744;

    @OriginalMember(owner = "client!td", name = "i", descriptor = "I")
    public static int field3746;

    @OriginalMember(owner = "client!td", name = "j", descriptor = "I")
    public static int field3747;

    @OriginalMember(owner = "client!td", name = "k", descriptor = "I")
    public static int field3748;

    @OriginalMember(owner = "client!td", name = "h", descriptor = "Ltd;")
    public class263 field3745;

    @OriginalMember(owner = "client!td", name = "l", descriptor = "Ltd;")
    public class263 field3749;

    @OriginalMember(owner = "client!td", name = "m", descriptor = "Lsj;")
    public static class266 field3750;

    @OriginalMember(owner = "client!td", name = "n", descriptor = "Ltq;")
    public static class376 field3751;

    @OriginalMember(owner = "client!td", name = "o", descriptor = "Z")
    public static boolean field3752;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIILbo;B)V")
    public static final void method1751(int arg0, int arg1, int arg2, int arg3, class435 arg4, byte arg5) {
        field3748++;
        if (arg4.field6249 == -1 && arg4.field6248 == null) {
            return;
        }
        int var6 = 0;
        if (arg3 > arg4.field6247) {
            var6 += arg3 - arg4.field6247;
        } else if (arg4.field6246 > arg3) {
            var6 += arg4.field6246 - arg3;
        }
        int var7 = class355.field4999 * arg4.field6243 >> 8;
        if (arg1 > arg4.field6269) {
            var6 += arg1 - arg4.field6269;
        } else if (arg4.field6255 > arg1) {
            var6 += arg4.field6255 - arg1;
        }
        if (arg4.field6245 == 0 || arg4.field6245 < var6 - 64 || class355.field4999 == 0 || arg4.field6257 != arg2) {
            if (arg4.field6263 != null) {
                class399.field5694.method1137(arg4.field6263);
                arg4.field6263 = null;
            }
            if (arg4.field6254 != null) {
                class399.field5694.method1137(arg4.field6254);
                arg4.field6254 = null;
            }
            return;
        }
        var6 -= 64;
        if (var6 < 0) {
            var6 = 0;
        }
        int var8 = (arg4.field6245 - var6) * var7 / arg4.field6245;
        if (arg5 != -85) {
            return;
        }
        if (arg4.field6263 != null) {
            arg4.field6263.method1175(var8);
        } else if (arg4.field6249 >= 0) {
            class172 var9 = class172.method1146(field3751, arg4.field6249, 0);
            if (var9 != null) {
                class27 var10 = var9.method1148().method186(class233.field3279);
                class173 var11 = class173.method1152(var10, 100, var8);
                var11.method1173(-1);
                class399.field5694.method1139(var11);
                arg4.field6263 = var11;
            }
        }
        if (arg4.field6254 != null) {
            arg4.field6254.method1175(var8);
            if (arg4.field6254.method2598((byte) 35)) {
                return;
            }
            arg4.field6254 = null;
        } else if (arg4.field6248 != null && (arg4.field6260 -= arg0) <= 0) {
            int var12 = (int) (Math.random() * (double) arg4.field6248.length);
            class172 var13 = class172.method1146(field3751, arg4.field6248[var12], 0);
            if (var13 != null) {
                class27 var14 = var13.method1148().method186(class233.field3279);
                class173 var15 = class173.method1152(var14, 100, var8);
                var15.method1173(0);
                class399.field5694.method1139(var15);
                arg4.field6260 = arg4.field6259 + (int) (Math.random() * (double) (arg4.field6262 - arg4.field6259));
                arg4.field6254 = var15;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(B)Z")
    public static final boolean method1752(byte arg0) throws IOException {
        field3747++;
        if (class146.field1798 == null) {
            return false;
        }
        int var1 = class146.field1798.method1340(0);
        if (var1 == 0) {
            return false;
        }
        if (class188.field2717 == -1) {
            class146.field1798.method1336((byte) 125, class359.field5120.field3364, 0, 1);
            class359.field5120.field3320 = 0;
            class188.field2717 = class359.field5120.method2142((byte) 89);
            class55.field658 = class332.field4700[class188.field2717];
            var1--;
        }
        if (class55.field658 == -1) {
            if (var1 <= 0) {
                return false;
            }
            class146.field1798.method1336((byte) 125, class359.field5120.field3364, 0, 1);
            class55.field658 = class359.field5120.field3364[0] & 0xFF;
            var1--;
        }
        if (class55.field658 == -2) {
            if (var1 <= 1) {
                return false;
            }
            class146.field1798.method1336((byte) 125, class359.field5120.field3364, 0, 2);
            class359.field5120.field3320 = 0;
            var1 -= 2;
            class55.field658 = class359.field5120.method1617((byte) 48);
        }
        if (class55.field658 > var1) {
            return false;
        }
        class359.field5120.field3320 = 0;
        class146.field1798.method1336((byte) 125, class359.field5120.field3364, 0, class55.field658);
        class199.field2838 = class68.field771;
        class233.field3286 = 0;
        if (arg0 > -59) {
            return false;
        }
        class68.field771 = class215.field3047;
        class215.field3047 = class188.field2717;
        if (class188.field2717 == 11) {
            int var2 = class359.field5120.method1585(123);
            if (var2 == 65535) {
                var2 = -1;
            }
            int var3 = class359.field5120.method1569(-1);
            int var4 = (var3 & 0x3129211B) >> 28;
            int var5 = (var3 & 0xFFFE807) >> 14;
            int var6 = var3 & 0x3FFF;
            int var7 = class359.field5120.method1575((byte) 119);
            int var8 = var7 >> 2;
            int var9 = var7 & 0x3;
            int var10 = var5 - class114.field1403;
            int var11 = class356.field5018[var8];
            int var12 = var6 - class41.field496;
            class374.method2386(var9, var2, var10, var12, var11, var4, -22646, var8);
            class188.field2717 = -1;
            return true;
        } else if (class188.field2717 == 104) {
            int var13 = class359.field5120.method1574(-93);
            if (class359.field5120.method1574(-30) == 0) {
                class369.field5210[var13] = new class118();
            } else {
                class359.field5120.field3320--;
                class369.field5210[var13] = new class118(class359.field5120);
            }
            class162.field2217 = class146.field1792;
            class188.field2717 = -1;
            return true;
        } else if (class188.field2717 == 103) {
            if (class248.field3548 != -1) {
                class94.method524(0, 0, class248.field3548);
            }
            class188.field2717 = -1;
            return true;
        } else if (class188.field2717 == 83 || class188.field2717 == 126 || class188.field2717 == 31 || class188.field2717 == 181 || class188.field2717 == 15 || class188.field2717 == 13 || class188.field2717 == 143 || class188.field2717 == 199 || class188.field2717 == 155 || class188.field2717 == 203 || class188.field2717 == 81 || class188.field2717 == 246 || class188.field2717 == 102 || class188.field2717 == 82 || class188.field2717 == 38) {
            class225.method1506(true);
            class188.field2717 = -1;
            return true;
        } else if (class188.field2717 == 180) {
            int var14 = class359.field5120.method1580((byte) -103);
            int var15 = class359.field5120.method1574(-42);
            int var16 = class359.field5120.method1617((byte) 48);
            int var17 = class359.field5120.method1590(false);
            if (class219.method1469(var16, -10993)) {
                class167 var18 = (class167) class22.field280.method1888((long) var14, (byte) -30);
                if (var18 != null) {
                    class286.method1869(var18, var18.field2332 != var17, false, (byte) 96);
                }
                class32.method202(-336, var15, false, var17, var14);
            }
            class188.field2717 = -1;
            return true;
        } else if (class188.field2717 == 101) {
            if (class55.field658 == 0) {
                class408.field5878 = class332.field4698.method2331(25, class271.field3836);
            } else {
                class408.field5878 = class359.field5120.method1562(false);
            }
            class188.field2717 = -1;
            return true;
        } else if (class188.field2717 == 53) {
            int var19 = class359.field5120.method1590(false);
            int var20 = class359.field5120.method1597(3641);
            class102.method572((byte) -80, var19, var20);
            class188.field2717 = -1;
            return true;
        } else if (class188.field2717 == 220) {
            class414.method2639(11813);
            class188.field2717 = -1;
            return true;
        } else if (class188.field2717 == 206) {
            for (int var21 = 0; var21 < class4.field61.length; var21++) {
                if (class4.field61[var21] != class151.field1865[var21]) {
                    class4.field61[var21] = class151.field1865[var21];
                    class121.method773(var21, (byte) 93);
                    class230.field3254[class33.method210(31, class132.field1607++)] = var21;
                }
            }
            class188.field2717 = -1;
            return true;
        } else if (class188.field2717 == 217) {
            int var22 = class359.field5120.method1585(-9);
            if (var22 == 65535) {
                var22 = -1;
            }
            int var23 = class359.field5120.method1574(-4);
            class181.method1219((byte) -52, var22, var23);
            class188.field2717 = -1;
            return true;
        } else if (class188.field2717 == 163) {
            int var24 = class359.field5120.method1567(65280);
            int var25 = class359.field5120.method1616(false);
            int var26 = class359.field5120.method1590(false);
            if (var26 == 65535) {
                var26 = -1;
            }
            class394.method2519(var24, var26, true, var25);
            class188.field2717 = -1;
            return true;
        } else if (class188.field2717 == 100) {
            int var27 = class359.field5120.method1602(true);
            int var28 = class359.field5120.method1617((byte) 48);
            int var29 = class359.field5120.method1590(false);
            int var30 = class359.field5120.method1566(-3451);
            if (var27 >> 30 != 0) {
                int var31 = var27 >> 28 & 0x3;
                int var32 = (var27 >> 14 & 0x3FFF) - class114.field1403;
                int var33 = (var27 & 0x3FFF) - class41.field496;
                if (var32 >= 0 && var33 >= 0 && var32 < class176.field2403 && var33 < class383.field5395) {
                    int var34 = var32 * 128 + 64;
                    int var35 = var33 * 128 + 64;
                    class8 var36 = new class8(var29, 0, class189.field2726, var31, var34, class114.method709(var31, var34, 0, var35) - var30, var35, var32, var32, var33, var33);
                    class79.field928.method509((byte) 100, new class267(var36));
                }
            } else if (var27 >> 29 != 0) {
                int var37 = var27 & 0xFFFF;
                class77 var38 = class167.field2335[var37];
                if (var38 != null) {
                    if (var29 == 65535) {
                        var29 = -1;
                    }
                    boolean var39 = true;
                    if (var29 != -1 && var38.field5611 != -1) {
                        if (var38.field5611 == var29) {
                            class97 var40 = class434.method2721(var29, 4096);
                            if (var40.field1158 && var40.field1166 != -1) {
                                class412 var41 = class189.method1288(-8192, var40.field1166);
                                int var42 = var41.field5910;
                                if (var42 == 0 || var42 == 2) {
                                    var39 = false;
                                } else if (var42 == 1) {
                                    var39 = true;
                                }
                            }
                        } else {
                            class97 var43 = class434.method2721(var29, 4096);
                            class97 var44 = class434.method2721(var38.field5611, 4096);
                            if (var43.field1166 != -1 && var44.field1166 != -1) {
                                class412 var45 = class189.method1288(-8192, var43.field1166);
                                class412 var46 = class189.method1288(-8192, var44.field1166);
                                if (var45.field5931 < var46.field5931) {
                                    var39 = false;
                                }
                            }
                        }
                    }
                    if (var39) {
                        var38.field5593 = 1;
                        var38.field5606 = 0;
                        var38.field5611 = var29;
                        var38.field5649 = 0;
                        var38.field5650 = class189.field2726 + var28;
                        var38.field5605 = var30;
                        if (var38.field5650 > class189.field2726) {
                            var38.field5649 = -1;
                        }
                        if (var38.field5611 != -1 && class189.field2726 == var38.field5650) {
                            int var47 = class434.method2721(var38.field5611, 4096).field1166;
                            if (var47 != -1) {
                                class412 var48 = class189.method1288(-8192, var47);
                                if (var48 != null && var48.field5925 != null) {
                                    class148.method896(false, var48, (byte) 126, var38.field3284, 0, var38.field3269);
                                }
                            }
                        }
                    }
                }
            } else if (var27 >> 28 != 0) {
                int var49 = var27 & 0xFFFF;
                class40 var50;
                if (class414.field5948 == var49) {
                    var50 = class384.field5422;
                } else {
                    var50 = class26.field314[var49];
                }
                if (var50 != null) {
                    if (var29 == 65535) {
                        var29 = -1;
                    }
                    boolean var51 = true;
                    if (var29 != -1 && var50.field5611 != -1) {
                        if (var50.field5611 == var29) {
                            class97 var56 = class434.method2721(var29, 4096);
                            if (var56.field1158 && var56.field1166 != -1) {
                                class412 var57 = class189.method1288(-8192, var56.field1166);
                                int var58 = var57.field5910;
                                if (var58 == 0 || var58 == 2) {
                                    var51 = false;
                                } else if (var58 == 1) {
                                    var51 = true;
                                }
                            }
                        } else {
                            class97 var52 = class434.method2721(var29, 4096);
                            class97 var53 = class434.method2721(var50.field5611, 4096);
                            if (var52.field1166 != -1 && var53.field1166 != -1) {
                                class412 var54 = class189.method1288(-8192, var52.field1166);
                                class412 var55 = class189.method1288(-8192, var53.field1166);
                                if (var54.field5931 < var55.field5931) {
                                    var51 = false;
                                }
                            }
                        }
                    }
                    if (var51) {
                        var50.field5649 = 0;
                        var50.field5593 = 1;
                        var50.field5650 = class189.field2726 + var28;
                        var50.field5606 = 0;
                        var50.field5611 = var29;
                        var50.field5605 = var30;
                        if (var50.field5611 == 65535) {
                            var50.field5611 = -1;
                        }
                        if (var50.field5650 > class189.field2726) {
                            var50.field5649 = -1;
                        }
                        if (var50.field5611 != -1 && class189.field2726 == var50.field5650) {
                            int var59 = class434.method2721(var50.field5611, 4096).field1166;
                            if (var59 != -1) {
                                class412 var60 = class189.method1288(-8192, var59);
                                if (var60 != null && var60.field5925 != null) {
                                    class148.method896(class384.field5422 == var50, var60, (byte) 107, var50.field3284, 0, var50.field3269);
                                }
                            }
                        }
                    }
                }
            }
            class188.field2717 = -1;
            return true;
        } else if (class188.field2717 == 215) {
            int var61 = class359.field5120.method1617((byte) 48);
            int var62 = class359.field5120.method1567(65280);
            int var63 = class359.field5120.method1566(-3451);
            class77 var64 = class167.field2335[var61];
            if (var64 != null) {
                class94.method523((byte) -27, var62, var64, var63);
            }
            class188.field2717 = -1;
            return true;
        } else if (class188.field2717 == 112) {
            int var65 = class359.field5120.method1574(-106);
            int var66 = class359.field5120.method1617((byte) 48);
            int var67 = class359.field5120.method1617((byte) 48);
            if (class219.method1469(var67, -10993)) {
                if (var65 == 2) {
                    class73.method411((byte) -120);
                }
                class248.field3548 = var66;
                class89.method495(var66, 116);
                class340.method2185(false, false);
                class201.method1331(class248.field3548);
                for (int var68 = 0; var68 < 100; var68++) {
                    class394.field5556[var68] = true;
                }
            }
            class188.field2717 = -1;
            return true;
        } else if (class188.field2717 == 149) {
            int var69 = class359.field5120.method1580((byte) -98);
            int var70 = class359.field5120.method1566(-3451);
            int var71 = class359.field5120.method1590(false);
            if (class219.method1469(var70, -10993)) {
                class355.method2268(-88, var71, var69);
            }
            class188.field2717 = -1;
            return true;
        } else if (class188.field2717 == 33) {
            int var72 = class359.field5120.method1585(125);
            int var73 = class359.field5120.method1585(108);
            int var74 = class359.field5120.method1590(false);
            int var75 = class359.field5120.method1590(false);
            int var76 = class359.field5120.method1602(true);
            if (class219.method1469(var74, -10993)) {
                class379.method2442(-110, var73, var72, var75, var76);
            }
            class188.field2717 = -1;
            return true;
        } else if (class188.field2717 == 99) {
            int var77 = class359.field5120.method1590(false);
            int var78 = class359.field5120.method1569(-1);
            int var79 = class359.field5120.method1585(-106);
            if (var79 == 65535) {
                var79 = -1;
            }
            if (class219.method1469(var77, -10993)) {
                class305.method2008(2, -1, var79, var78, 4);
            }
            class188.field2717 = -1;
            return true;
        } else if (class188.field2717 == 164) {
            int var80 = class359.field5120.method1590(false);
            int var81 = class359.field5120.method1617((byte) 48);
            if (var81 == 65535) {
                var81 = -1;
            }
            int var82 = class359.field5120.method1602(true);
            if (class219.method1469(var80, -10993)) {
                class45.method264(var81, var82, -22243);
            }
            class188.field2717 = -1;
            return true;
        } else if (class188.field2717 == 131) {
            byte var83 = class359.field5120.method1573(0);
            int var84 = class359.field5120.method1590(false);
            class102.method572((byte) -92, var84, var83);
            class188.field2717 = -1;
            return true;
        } else if (class188.field2717 == 46) {
            int var85 = class359.field5120.method1602(true);
            int var86 = class359.field5120.method1574(-84);
            int var87 = class359.field5120.method1556((byte) -14);
            class327.field4647[var86] = var85;
            class362.field5169[var86] = var87;
            class170.field2353[var86] = 1;
            int var88 = class219.field3091[var86] - 1;
            for (int var89 = 0; var89 < var88; var89++) {
                if (class249.field3552[var89] <= var85) {
                    class170.field2353[var86] = var89 + 2;
                }
            }
            class384.field5420[class33.method210(31, class19.field234++)] = var86;
            class188.field2717 = -1;
            return true;
        } else if (class188.field2717 == 69) {
            if (class255.field3680 != null) {
                class432.method2714(class249.field3558, (byte) 100, false, -1, -1);
            }
            byte[] var90 = new byte[class55.field658];
            class359.field5120.method2144(class55.field658, var90, (byte) -108, 0);
            String var91 = class180.method1218(15597, class55.field658, 0, var90);
            class149.method900(class26.field329 == 1, (byte) 108, class14.field185, true, var91);
            class188.field2717 = -1;
            return true;
        } else if (class188.field2717 == 24) {
            int var92 = class359.field5120.method1575((byte) 97);
            int var93 = class359.field5120.method1590(false);
            boolean var94 = (var92 & 0x1) == 1;
            class159.method1016(var94, false, var93);
            class146.field1795[class33.method210(class291.field4072++, 31)] = var93;
            class188.field2717 = -1;
            return true;
        } else if (class188.field2717 == 26) {
            class328.field4656 = class359.field5120.method1617((byte) 48) * 30;
            class188.field2717 = -1;
            class412.field5928 = class146.field1792;
            return true;
        } else if (class188.field2717 == 156) {
            class214.method1437(-47644573);
            class188.field2717 = -1;
            class132.field1607 += 32;
            return true;
        } else if (class188.field2717 == 196) {
            int var95 = class359.field5120.method1597(3641);
            int var96 = class359.field5120.method1617((byte) 48);
            int var97 = class359.field5120.method1617((byte) 48);
            int var98 = class359.field5120.method1585(-88);
            int var99 = class359.field5120.method1590(false);
            if (class219.method1469(var99, -10993)) {
                class305.method2008(7, var98, var97 << 16 | var96, var95, 4);
            }
            class188.field2717 = -1;
            return true;
        } else if (class188.field2717 == 8) {
            int var100 = class359.field5120.method1580((byte) -88);
            int var101 = class359.field5120.method1590(false);
            class218.method1463(95, var101, var100);
            class188.field2717 = -1;
            return true;
        } else if (class188.field2717 == 209) {
            class71.method407(0);
            class188.field2717 = -1;
            return false;
        } else if (class188.field2717 == 226) {
            int var102 = class359.field5120.method1594(-27);
            int var103 = class359.field5120.method1597(3641);
            int var104 = class359.field5120.method1574(-30);
            String var105 = "";
            String var106 = var105;
            if ((var104 & 0x1) != 0) {
                var105 = class359.field5120.method1562(false);
                if ((var104 & 0x2) == 0) {
                    var106 = var105;
                } else {
                    var106 = class359.field5120.method1562(false);
                }
            }
            String var107 = class359.field5120.method1562(false);
            if (var102 == 99) {
                class397.method2538(-121, var107);
            } else if (var106.equals("") || !class45.method267(var106, (byte) -98)) {
                class325.method2112(var107, var103, var102, var105, -27259, var106);
            } else {
                class188.field2717 = -1;
                return true;
            }
            class188.field2717 = -1;
            return true;
        } else if (class188.field2717 == 141) {
            int var108 = class359.field5120.method1580((byte) -64);
            class132.field1602 = class14.field185.method1260(8859, var108);
            class188.field2717 = -1;
            return true;
        } else if (class188.field2717 == 35) {
            String var109 = class359.field5120.method1562(false);
            int var110 = class359.field5120.method1585(115);
            int var111 = class359.field5120.method1617((byte) 48);
            if (class219.method1469(var111, -10993)) {
                class129.method796(true, var110, var109);
            }
            class188.field2717 = -1;
            return true;
        } else if (class188.field2717 == 225) {
            for (int var112 = 0; var112 < class26.field314.length; var112++) {
                if (class26.field314[var112] != null) {
                    class26.field314[var112].field5612 = -1;
                }
            }
            for (int var113 = 0; var113 < class167.field2335.length; var113++) {
                if (class167.field2335[var113] != null) {
                    class167.field2335[var113].field5612 = -1;
                }
            }
            class188.field2717 = -1;
            return true;
        } else if (class188.field2717 == 61) {
            class322.field4586 = class359.field5120.method1567(65280);
            class73.field878 = class359.field5120.method1556((byte) 108);
            while (class55.field658 > class359.field5120.field3320) {
                class188.field2717 = class359.field5120.method1574(-95);
                class225.method1506(true);
            }
            class188.field2717 = -1;
            return true;
        } else if (class188.field2717 == 77) {
            class170.field2352 = class359.field5120.method1574(-56);
            class412.field5928 = class146.field1792;
            class188.field2717 = -1;
            return true;
        } else if (class188.field2717 == 49) {
            boolean var114 = class359.field5120.method1574(-52) == 1;
            String var115 = class359.field5120.method1562(false);
            String var116 = var115;
            if (var114) {
                var116 = class359.field5120.method1562(false);
            }
            long var117 = class359.field5120.method1600(-1);
            long var119 = (long) class359.field5120.method1617((byte) 48);
            long var121 = (long) class359.field5120.method1616(false);
            int var123 = class359.field5120.method1574(-87);
            long var124 = (var119 << 32) + var121;
            boolean var126 = false;
            int var127 = 0;
            while (true) {
                if (var127 >= 100) {
                    if (var123 <= 1) {
                        if (!(!class452.field6472 || class331.field4681) || class400.field5721) {
                            var126 = true;
                        } else if (class45.method267(var116, (byte) -53)) {
                            var126 = true;
                        }
                    }
                    break;
                }
                if (class369.field5211[var127] == var124) {
                    var126 = true;
                    break;
                }
                var127++;
            }
            if (!var126 && class215.field3043 == 0) {
                class369.field5211[class399.field5696] = var124;
                class399.field5696 = (class399.field5696 + 1) % 100;
                String var128 = class151.method917(class389.method2490(true, class95.method527(-126, class359.field5120)), 123);
                if (var123 == 2 || var123 == 3) {
                    class123.method780(-1, "<img=1>" + var116, "<img=1>" + var115, 0, 85, var128, 9, class425.method2677(true, var117));
                } else if (var123 == 1) {
                    class123.method780(-1, "<img=0>" + var116, "<img=0>" + var115, 0, 83, var128, 9, class425.method2677(true, var117));
                } else {
                    class123.method780(-1, var116, var115, 0, 119, var128, 9, class425.method2677(true, var117));
                }
            }
            class188.field2717 = -1;
            return true;
        } else if (class188.field2717 == 36) {
            int var129 = class359.field5120.method1617((byte) 48);
            if (var129 == 65535) {
                var129 = -1;
            }
            int var130 = class359.field5120.method1574(-116);
            int var131 = class359.field5120.method1617((byte) 48);
            int var132 = class359.field5120.method1574(-78);
            class122.method776(var129, (byte) 88, var132, var130, var131);
            class188.field2717 = -1;
            return true;
        } else if (class188.field2717 == 89) {
            int var133 = class359.field5120.method1617((byte) 48);
            int var134 = class359.field5120.method1585(-35);
            int var135 = class359.field5120.method1597(3641);
            if (class219.method1469(var134, -10993)) {
                class152.method922(var135, var133, 1);
            }
            class188.field2717 = -1;
            return true;
        } else if (class188.field2717 == 59) {
            class97.field1170 = class359.field5120.method1574(-99);
            for (int var136 = 0; var136 < class97.field1170; var136++) {
                class138.field1724[var136] = class359.field5120.method1562(false);
                class99.field1213[var136] = class359.field5120.method1562(false);
                if (class99.field1213[var136].equals("")) {
                    class99.field1213[var136] = class138.field1724[var136];
                }
                class56.field680[var136] = class359.field5120.method1562(false);
                class409.field5895[var136] = class359.field5120.method1562(false);
                if (class409.field5895[var136].equals("")) {
                    class409.field5895[var136] = class56.field680[var136];
                }
                class288.field4044[var136] = false;
            }
            class188.field2717 = -1;
            class56.field676 = class146.field1792;
            return true;
        } else if (class188.field2717 == 157) {
            int var137 = class359.field5120.method1617((byte) 48);
            int var138 = class359.field5120.method1574(-16);
            boolean var139 = (var138 & 0x1) == 1;
            class374.method2383(var139, var137, -5626);
            int var140 = class359.field5120.method1617((byte) 48);
            for (int var141 = 0; var141 < var140; var141++) {
                int var142 = class359.field5120.method1617((byte) 48);
                int var143 = class359.field5120.method1567(65280);
                if (var143 == 255) {
                    var143 = class359.field5120.method1602(true);
                }
                class56.method321(var137, var139, var142 - 1, var143, 126, var141);
            }
            class146.field1795[class33.method210(class291.field4072++, 31)] = var137;
            class188.field2717 = -1;
            return true;
        } else if (class188.field2717 == 229) {
            int var144 = class359.field5120.method1567(65280);
            int var145 = class359.field5120.method1590(false);
            class218.method1463(101, var145, var144);
            class188.field2717 = -1;
            return true;
        } else if (class188.field2717 == 193) {
            String var146 = class359.field5120.method1562(false);
            int var147 = class359.field5120.method1617((byte) 48);
            String var148 = class193.method1308(85, var147).method1993(class359.field5120, 112);
            class123.method780(var147, var146, var146, 0, 119, var148, 19, (String) null);
            class188.field2717 = -1;
            return true;
        } else if (class188.field2717 == 210) {
            int var149 = class359.field5120.method1617((byte) 48);
            int var150 = class359.field5120.method1617((byte) 48);
            int var151 = class359.field5120.method1617((byte) 48);
            int var152 = class359.field5120.method1617((byte) 48);
            if (class219.method1469(var149, -10993) && class98.field1194[var150] != null) {
                for (int var153 = var151; var153 < var152; var153++) {
                    int var154 = class359.field5120.method1616(false);
                    if (class98.field1194[var150].length > var153 && class98.field1194[var150][var153] != null) {
                        class98.field1194[var150][var153].field2574 = var154;
                    }
                }
            }
            class188.field2717 = -1;
            return true;
        } else if (class188.field2717 == 2) {
            int var155 = class359.field5120.method1597(3641);
            int var156 = class359.field5120.method1566(-3451);
            int var157 = class359.field5120.method1566(-3451);
            if (class219.method1469(var156, -10993)) {
                class332.method2151(var155, 119, var157);
            }
            class188.field2717 = -1;
            return true;
        } else if (class188.field2717 == 216) {
            int var158 = class359.field5120.method1617((byte) 48);
            int var159 = class359.field5120.method1567(65280);
            int var160 = class359.field5120.method1597(3641);
            if (class219.method1469(var158, -10993)) {
                class240.method1646(7, var159, var160);
            }
            class188.field2717 = -1;
            return true;
        } else if (class188.field2717 == 40) {
            int var161 = class359.field5120.method1566(-3451);
            int var162 = class359.field5120.method1585(-48);
            byte var163 = class359.field5120.method1573(0);
            if (class219.method1469(var161, -10993)) {
                class152.method922(var163, var162, 1);
            }
            class188.field2717 = -1;
            return true;
        } else if (class188.field2717 == 5) {
            int var164 = class359.field5120.method1602(true);
            int var165 = class359.field5120.method1585(120);
            int var166 = class359.field5120.method1590(false);
            int var167 = class359.field5120.method1590(false);
            if (class219.method1469(var167, -10993)) {
                class210.method1385((var165 << 16) + var166, var164, 13);
            }
            class188.field2717 = -1;
            return true;
        } else if (class188.field2717 == 165) {
            class322.field4586 = class359.field5120.method1567(65280);
            class73.field878 = class359.field5120.method1567(65280);
            for (class282 var168 = (class282) class330.field4663.method1884(0); var168 != null; var168 = (class282) class330.field4663.method1890(-1)) {
                int var170 = (int) (var168.field5855 & 0x3FFFL);
                int var171 = (int) (var168.field5855 >> 14 & 0x3FFFL);
                int var172 = (int) (var168.field5855 >> 28 & 0x3L);
                if (class129.field1570 == var172 && var170 >= class322.field4586 && class322.field4586 + 8 > var170 && class73.field878 <= var171 && (class73.field878 + 8) > var171) {
                    var168.method2594((byte) -22);
                    class254.method1717(var170, var171, class129.field1570, 1);
                }
            }
            for (class248 var169 = (class248) class151.field1872.method506((byte) -128); var169 != null; var169 = (class248) class151.field1872.method514(true)) {
                if (var169.field3540 >= class322.field4586 && class322.field4586 + 8 > var169.field3540 && class73.field878 <= var169.field3545 && class73.field878 + 8 > var169.field3545 && class129.field1570 == var169.field3537) {
                    var169.field3543 = 0;
                }
            }
            class188.field2717 = -1;
            return true;
        } else if (class188.field2717 == 110) {
            int var173 = class359.field5120.method1617((byte) 48);
            String var174 = class359.field5120.method1562(false);
            Object[] var175 = new Object[var174.length() + 1];
            for (int var176 = var174.length() - 1; var176 >= 0; var176--) {
                if (var174.charAt(var176) == 's') {
                    var175[var176 + 1] = class359.field5120.method1562(false);
                } else {
                    var175[var176 + 1] = Integer.valueOf(class359.field5120.method1597(3641));
                }
            }
            var175[0] = Integer.valueOf(class359.field5120.method1597(3641));
            if (class219.method1469(var173, -10993)) {
                class272 var177 = new class272();
                var177.field3848 = var175;
                class201.method1332(var177);
            }
            class188.field2717 = -1;
            return true;
        } else if (class188.field2717 == 130) {
            int var178 = class359.field5120.method1617((byte) 48);
            if (class219.method1469(var178, -10993)) {
                class59.method349((byte) 127);
            }
            class188.field2717 = -1;
            return true;
        } else if (class188.field2717 == 58) {
            int var179 = class359.field5120.method1617((byte) 48);
            int var180 = class359.field5120.method1574(-4);
            boolean var181 = (var180 & 0x1) == 1;
            while (class359.field5120.field3320 < class55.field658) {
                int var182 = class359.field5120.method1594(-26);
                int var183 = class359.field5120.method1617((byte) 48);
                int var184 = 0;
                if (var183 != 0) {
                    var184 = class359.field5120.method1574(-87);
                    if (var184 == 255) {
                        var184 = class359.field5120.method1597(3641);
                    }
                }
                class56.method321(var179, var181, var183 - 1, var184, 123, var182);
            }
            class146.field1795[class33.method210(class291.field4072++, 31)] = var179;
            class188.field2717 = -1;
            return true;
        } else if (class188.field2717 == 219) {
            class359.field5120.field3320 += 28;
            if (class359.field5120.method1592(false)) {
                class214.method1439(class359.field5120.field3320 - 28, 34, class359.field5120);
            }
            class188.field2717 = -1;
            return true;
        } else if (class188.field2717 == 214) {
            String var185 = class359.field5120.method1562(false);
            int var186 = class359.field5120.method1569(-1);
            int var187 = class359.field5120.method1566(-3451);
            if (class219.method1469(var187, -10993)) {
                class82.method458(4, var185, var186);
            }
            class188.field2717 = -1;
            return true;
        } else if (class188.field2717 == 161) {
            int var188 = class359.field5120.method1574(-73);
            int var189 = class359.field5120.method1574(-21);
            if (var188 == 255) {
                var188 = -1;
                var189 = -1;
            }
            class46.method270(84, var188, var189);
            class188.field2717 = -1;
            return true;
        } else if (class188.field2717 == 178) {
            class365.method2338(0);
            class188.field2717 = -1;
            return true;
        } else if (class188.field2717 == 92) {
            int var190 = class359.field5120.method1590(false);
            if (var190 == 65535) {
                var190 = -1;
            }
            int var191 = class359.field5120.method1585(105);
            int var192 = class359.field5120.method1585(110);
            if (var192 == 65535) {
                var192 = -1;
            }
            int var193 = class359.field5120.method1602(true);
            int var194 = class359.field5120.method1585(104);
            if (class219.method1469(var191, -10993)) {
                for (int var195 = var192; var195 <= var190; var195++) {
                    long var196 = ((long) var193 << 32) + (long) var195;
                    class281 var198 = (class281) class322.field4588.method1888(var196, (byte) -30);
                    class281 var199;
                    if (var198 != null) {
                        var199 = new class281(var198.field3981, var194);
                        var198.method2594((byte) -22);
                    } else if (var195 == -1) {
                        var199 = new class281(class282.method1863(var193, -25835).field2637.field3981, var194);
                    } else {
                        var199 = new class281(0, var194);
                    }
                    class322.field4588.method1886(var199, var196, 1);
                }
            }
            class188.field2717 = -1;
            return true;
        } else if (class188.field2717 == 172) {
            int var200 = class359.field5120.method1566(-3451);
            String var201 = class359.field5120.method1562(false);
            int var202 = class359.field5120.method1590(false);
            if (class219.method1469(var200, -10993)) {
                class129.method796(true, var202, var201);
            }
            class188.field2717 = -1;
            return true;
        } else if (class188.field2717 == 85) {
            String var203 = class359.field5120.method1562(false);
            boolean var204 = class359.field5120.method1574(-17) == 1;
            String var205;
            if (var204) {
                var205 = class359.field5120.method1562(false);
            } else {
                var205 = var203;
            }
            int var206 = class359.field5120.method1617((byte) 48);
            byte var207 = class359.field5120.method1589(false);
            boolean var208 = false;
            if (var207 == -128) {
                var208 = true;
            }
            if (var208) {
                if (class118.field1445 == 0) {
                    class188.field2717 = -1;
                    return true;
                }
                boolean var214 = false;
                int var215;
                for (var215 = 0; class118.field1445 > var215 && (!class65.field748[var215].field201.equals(var205) || class65.field748[var215].field198 != var206); var215++) {
                }
                if (class118.field1445 > var215) {
                    while (var215 < (class118.field1445 - 1)) {
                        class65.field748[var215] = class65.field748[var215 + 1];
                        var215++;
                    }
                    class118.field1445--;
                    class65.field748[class118.field1445] = null;
                }
            } else {
                String var209 = class359.field5120.method1562(false);
                class17 var210 = new class17();
                var210.field201 = var205;
                var210.field202 = var203;
                var210.field205 = class255.method1720((byte) 74, var210.field201);
                var210.field199 = var207;
                var210.field204 = var209;
                var210.field198 = var206;
                int var211;
                for (var211 = class118.field1445 - 1; var211 >= 0; var211--) {
                    int var212 = class65.field748[var211].field205.compareTo(var210.field205);
                    if (var212 == 0) {
                        class65.field748[var211].field198 = var206;
                        class65.field748[var211].field199 = var207;
                        class65.field748[var211].field204 = var209;
                        if (var205.equals(class384.field5422.field487)) {
                            class358.field5088 = var207;
                        }
                        class188.field2717 = -1;
                        class305.field4285 = class146.field1792;
                        return true;
                    }
                    if (var212 < 0) {
                        break;
                    }
                }
                if (class118.field1445 >= class65.field748.length) {
                    class188.field2717 = -1;
                    return true;
                }
                for (int var213 = class118.field1445 - 1; var213 > var211; var213--) {
                    class65.field748[var213 + 1] = class65.field748[var213];
                }
                if (class118.field1445 == 0) {
                    class65.field748 = new class17[100];
                }
                class65.field748[var211 + 1] = var210;
                class118.field1445++;
                if (var205.equals(class384.field5422.field487)) {
                    class358.field5088 = var207;
                }
            }
            class188.field2717 = -1;
            class305.field4285 = class146.field1792;
            return true;
        } else if (class188.field2717 == 67) {
            int var216 = class359.field5120.method1617((byte) 48);
            int var217 = class359.field5120.method1597(3641);
            if (class219.method1469(var216, -10993)) {
                class167 var218 = (class167) class22.field280.method1888((long) var217, (byte) -30);
                if (var218 != null) {
                    class286.method1869(var218, true, false, (byte) 120);
                }
                if (class59.field709 != null) {
                    class186.method1277(class59.field709, (byte) -110);
                    class59.field709 = null;
                }
            }
            class188.field2717 = -1;
            return true;
        } else if (class188.field2717 == 169) {
            class305.field4285 = class146.field1792;
            if (class55.field658 == 0) {
                class188.field2717 = -1;
                class65.field748 = null;
                class144.field1783 = null;
                class118.field1445 = 0;
                class230.field3258 = null;
                return true;
            }
            class144.field1783 = class359.field5120.method1562(false);
            boolean var219 = class359.field5120.method1574(-122) == 1;
            if (var219) {
                class359.field5120.method1562(false);
            }
            long var220 = class359.field5120.method1600(-1);
            class230.field3258 = class25.method178(var220, (byte) 127);
            class328.field4658 = class359.field5120.method1589(false);
            int var222 = class359.field5120.method1574(-78);
            if (var222 == 255) {
                class188.field2717 = -1;
                return true;
            }
            class118.field1445 = var222;
            class17[] var223 = new class17[100];
            for (int var224 = 0; var224 < class118.field1445; var224++) {
                var223[var224] = new class17();
                var223[var224].field202 = class359.field5120.method1562(false);
                boolean var230 = class359.field5120.method1574(-54) == 1;
                if (var230) {
                    var223[var224].field201 = class359.field5120.method1562(false);
                } else {
                    var223[var224].field201 = var223[var224].field202;
                }
                var223[var224].field205 = class255.method1720((byte) 74, var223[var224].field201);
                var223[var224].field198 = class359.field5120.method1617((byte) 48);
                var223[var224].field199 = class359.field5120.method1589(false);
                var223[var224].field204 = class359.field5120.method1562(false);
                if (var223[var224].field201.equals(class384.field5422.field487)) {
                    class358.field5088 = var223[var224].field199;
                }
            }
            boolean var225 = false;
            int var226 = class118.field1445;
            while (var226 > 0) {
                var226--;
                boolean var227 = true;
                for (int var228 = 0; var228 < var226; var228++) {
                    if (var223[var228].field205.compareTo(var223[var228 + 1].field205) > 0) {
                        class17 var229 = var223[var228];
                        var223[var228] = var223[var228 + 1];
                        var227 = false;
                        var223[var228 + 1] = var229;
                    }
                }
                if (var227) {
                    break;
                }
            }
            class65.field748 = var223;
            class188.field2717 = -1;
            return true;
        } else if (class188.field2717 == 191) {
            class134.field1619 = class359.field5120.method1574(-14);
            class177.field2405 = class359.field5120.method1574(-107);
            class121.field1484 = class359.field5120.method1574(-65);
            class188.field2717 = -1;
            return true;
        } else if (class188.field2717 == 136) {
            class39.field447 = class359.field5120.method1574(-42);
            class188.field2717 = -1;
            return true;
        } else if (class188.field2717 == 134) {
            class119.method750(class359.field5120.method1562(false), (byte) -103);
            class188.field2717 = -1;
            return true;
        } else if (class188.field2717 == 4) {
            int var231 = class359.field5120.method1569(-1);
            int var232 = class359.field5120.method1617((byte) 48);
            if (class219.method1469(var232, -10993)) {
                class305.method2008(5, 0, 2047, var231, 4);
            }
            class188.field2717 = -1;
            return true;
        } else if (class188.field2717 == 84) {
            int var233 = class359.field5120.method1590(false);
            int var234 = class359.field5120.method1597(3641);
            int var235 = class359.field5120.method1617((byte) 48);
            if (var235 == 65535) {
                var235 = -1;
            }
            if (class219.method1469(var233, -10993)) {
                class305.method2008(1, -1, var235, var234, 4);
            }
            class188.field2717 = -1;
            return true;
        } else if (class188.field2717 == 207) {
            boolean var236 = class359.field5120.method1574(-59) == 1;
            String var237 = class359.field5120.method1562(false);
            String var238 = class359.field5120.method1562(false);
            int var239 = class359.field5120.method1617((byte) 48);
            int var240 = class359.field5120.method1574(-113);
            String var241 = "";
            boolean var242 = false;
            if (var239 > 0) {
                var241 = class359.field5120.method1562(false);
                var242 = class359.field5120.method1574(-83) == 1;
            }
            for (int var243 = 0; var243 < class247.field3533; var243++) {
                if (var236) {
                    if (var238.equals(class334.field4733[var243])) {
                        class334.field4733[var243] = var237;
                        class300.field4216[var243] = var238;
                        var237 = null;
                        break;
                    }
                } else if (var237.equals(class334.field4733[var243])) {
                    if (class109.field1344[var243] != var239) {
                        class109.field1344[var243] = var239;
                        if (var239 > 0) {
                            class325.method2112(var237 + class94.field1133.method2331(25, class271.field3836), 0, 5, "", -27259, "");
                        }
                        if (var239 == 0) {
                            class325.method2112(var237 + class371.field5234.method2331(25, class271.field3836), 0, 5, "", -27259, "");
                        }
                    }
                    class300.field4216[var243] = var238;
                    class403.field5769[var243] = var241;
                    class48.field575[var243] = var240;
                    var237 = null;
                    class370.field5220[var243] = var242;
                    break;
                }
            }
            if (var237 != null && class247.field3533 < 200) {
                class334.field4733[class247.field3533] = var237;
                class300.field4216[class247.field3533] = var238;
                class109.field1344[class247.field3533] = var239;
                class403.field5769[class247.field3533] = var241;
                class48.field575[class247.field3533] = var240;
                class370.field5220[class247.field3533] = var242;
                class247.field3533++;
            }
            class56.field676 = class146.field1792;
            boolean var244 = false;
            int var245 = class247.field3533;
            while (var245 > 0) {
                boolean var246 = true;
                var245--;
                for (int var247 = 0; var247 < var245; var247++) {
                    if (class109.field1344[var247] != class397.field5685 && class109.field1344[var247 + 1] == class397.field5685 || class109.field1344[var247] == 0 && class109.field1344[var247 + 1] != 0) {
                        int var248 = class109.field1344[var247];
                        class109.field1344[var247] = class109.field1344[var247 + 1];
                        class109.field1344[var247 + 1] = var248;
                        String var249 = class403.field5769[var247];
                        class403.field5769[var247] = class403.field5769[var247 + 1];
                        class403.field5769[var247 + 1] = var249;
                        String var250 = class334.field4733[var247];
                        class334.field4733[var247] = class334.field4733[var247 + 1];
                        class334.field4733[var247 + 1] = var250;
                        String var251 = class300.field4216[var247];
                        class300.field4216[var247] = class300.field4216[var247 + 1];
                        class300.field4216[var247 + 1] = var251;
                        int var252 = class48.field575[var247];
                        class48.field575[var247] = class48.field575[var247 + 1];
                        class48.field575[var247 + 1] = var252;
                        boolean var253 = class370.field5220[var247];
                        class370.field5220[var247] = class370.field5220[var247 + 1];
                        var246 = false;
                        class370.field5220[var247 + 1] = var253;
                    }
                }
                if (var246) {
                    break;
                }
            }
            class188.field2717 = -1;
            return true;
        } else if (class188.field2717 == 62) {
            int var254 = class359.field5120.method1574(-88);
            boolean var255 = (var254 & 0x1) == 1;
            String var256 = class359.field5120.method1562(false);
            String var257 = class359.field5120.method1562(false);
            if (var257.equals("")) {
                var257 = var256;
            }
            String var258 = class359.field5120.method1562(false);
            String var259 = class359.field5120.method1562(false);
            if (var259.equals("")) {
                var259 = var258;
            }
            if (var255) {
                for (int var260 = 0; var260 < class97.field1170; var260++) {
                    if (class99.field1213[var260].equals(var259)) {
                        class138.field1724[var260] = var256;
                        class99.field1213[var260] = var257;
                        class56.field680[var260] = var258;
                        class409.field5895[var260] = var259;
                        break;
                    }
                }
            } else {
                class138.field1724[class97.field1170] = var256;
                class99.field1213[class97.field1170] = var257;
                class56.field680[class97.field1170] = var258;
                class409.field5895[class97.field1170] = var259;
                class288.field4044[class97.field1170] = class33.method210(2, var254) == 2;
                class97.field1170++;
            }
            class56.field676 = class146.field1792;
            class188.field2717 = -1;
            return true;
        } else if (class188.field2717 == 152) {
            int var261 = class359.field5120.method1574(-104);
            int var262 = var261 >> 5;
            int var263 = var261 & 0x1F;
            if (var263 == 0) {
                class360.field5138[var262] = null;
                class188.field2717 = -1;
                return true;
            }
            class219 var264 = new class219();
            var264.field3092 = var263;
            var264.field3081 = class359.field5120.method1574(-53);
            if (var264.field3081 >= 0 && class46.field550.length > var264.field3081) {
                if (var264.field3092 == 1 || var264.field3092 == 10) {
                    var264.field3085 = class359.field5120.method1617((byte) 48);
                    class359.field5120.field3320 += 5;
                } else if (var264.field3092 >= 2 && var264.field3092 <= 6) {
                    if (var264.field3092 == 2) {
                        var264.field3082 = 64;
                        var264.field3079 = 64;
                    }
                    if (var264.field3092 == 3) {
                        var264.field3079 = 0;
                        var264.field3082 = 64;
                    }
                    if (var264.field3092 == 4) {
                        var264.field3082 = 64;
                        var264.field3079 = 128;
                    }
                    if (var264.field3092 == 5) {
                        var264.field3079 = 64;
                        var264.field3082 = 0;
                    }
                    if (var264.field3092 == 6) {
                        var264.field3082 = 128;
                        var264.field3079 = 64;
                    }
                    var264.field3092 = 2;
                    var264.field3088 = class359.field5120.method1617((byte) 48);
                    var264.field3094 = class359.field5120.method1617((byte) 48);
                    var264.field3087 = class359.field5120.method1574(-128);
                    var264.field3086 = class359.field5120.method1617((byte) 48);
                }
                var264.field3090 = class359.field5120.method1617((byte) 48);
                if (var264.field3090 == 65535) {
                    var264.field3090 = -1;
                }
                class360.field5138[var262] = var264;
            }
            class188.field2717 = -1;
            return true;
        } else if (class188.field2717 == 202) {
            boolean var265 = class359.field5120.method1574(-77) == 1;
            String var266 = class359.field5120.method1562(false);
            String var267 = var266;
            if (var265) {
                var267 = class359.field5120.method1562(false);
            }
            long var268 = (long) class359.field5120.method1617((byte) 48);
            long var270 = (long) class359.field5120.method1616(false);
            int var272 = class359.field5120.method1574(-24);
            long var273 = (var268 << 32) + var270;
            boolean var275 = false;
            int var276 = 0;
            while (true) {
                if (var276 >= 100) {
                    if (var272 <= 1) {
                        if (!(!class452.field6472 || class331.field4681) || class400.field5721) {
                            var275 = true;
                        } else if (class45.method267(var267, (byte) -60)) {
                            var275 = true;
                        }
                    }
                    break;
                }
                if (class369.field5211[var276] == var273) {
                    var275 = true;
                    break;
                }
                var276++;
            }
            if (!var275 && class215.field3043 == 0) {
                class369.field5211[class399.field5696] = var273;
                class399.field5696 = (class399.field5696 + 1) % 100;
                String var277 = class151.method917(class389.method2490(true, class95.method527(-116, class359.field5120)), 119);
                if (var272 == 2) {
                    class123.method780(-1, "<img=1>" + var267, "<img=1>" + var266, 0, 116, var277, 7, (String) null);
                } else if (var272 == 1) {
                    class123.method780(-1, "<img=0>" + var267, "<img=0>" + var266, 0, 94, var277, 7, (String) null);
                } else {
                    class123.method780(-1, var267, var266, 0, 92, var277, 3, (String) null);
                }
            }
            class188.field2717 = -1;
            return true;
        } else if (class188.field2717 == 12) {
            int var278 = class359.field5120.method1590(false);
            int var279 = class359.field5120.method1556((byte) -28);
            if (class219.method1469(var278, -10993)) {
                class200.field2851 = var279;
            }
            class188.field2717 = -1;
            return true;
        } else if (class188.field2717 == 249) {
            class28.field351 = class359.field5120.method1574(-22);
            class56.field676 = class146.field1792;
            class188.field2717 = -1;
            return true;
        } else if (class188.field2717 == 168) {
            int var280 = class359.field5120.method1617((byte) 48);
            if (class219.method1469(var280, -10993)) {
                class302.method1989((byte) -90);
            }
            class188.field2717 = -1;
            return true;
        } else if (class188.field2717 == 117) {
            boolean var281 = class359.field5120.method1574(-74) == 1;
            String var282 = class359.field5120.method1562(false);
            String var283 = var282;
            if (var281) {
                var283 = class359.field5120.method1562(false);
            }
            long var284 = class359.field5120.method1600(-1);
            long var286 = (long) class359.field5120.method1617((byte) 48);
            long var288 = (long) class359.field5120.method1616(false);
            int var290 = class359.field5120.method1574(-128);
            int var291 = class359.field5120.method1617((byte) 48);
            long var292 = (var286 << 32) + var288;
            boolean var294 = false;
            int var295 = 0;
            while (true) {
                if (var295 >= 100) {
                    if (var290 <= 1 && class45.method267(var283, (byte) -77)) {
                        var294 = true;
                    }
                    break;
                }
                if (class369.field5211[var295] == var292) {
                    var294 = true;
                    break;
                }
                var295++;
            }
            if (!var294 && class215.field3043 == 0) {
                class369.field5211[class399.field5696] = var292;
                class399.field5696 = (class399.field5696 + 1) % 100;
                String var296 = class193.method1308(126, var291).method1993(class359.field5120, 118);
                if (var290 == 2) {
                    class123.method780(var291, "<img=1>" + var283, "<img=1>" + var282, 0, 127, var296, 20, class425.method2677(true, var284));
                } else if (var290 == 1) {
                    class123.method780(var291, "<img=0>" + var283, "<img=0>" + var282, 0, 90, var296, 20, class425.method2677(true, var284));
                } else {
                    class123.method780(var291, var283, var282, 0, 95, var296, 20, class425.method2677(true, var284));
                }
            }
            class188.field2717 = -1;
            return true;
        } else if (class188.field2717 == 194) {
            class433.method2716(3, false);
            class188.field2717 = -1;
            return true;
        } else if (class188.field2717 == 48) {
            int var297 = class359.field5120.method1566(-3451);
            int var298 = class359.field5120.method1569(-1);
            int var299 = class359.field5120.method1566(-3451);
            if (class219.method1469(var299, -10993)) {
                class397.method2535(var297, 6, var298);
            }
            class188.field2717 = -1;
            return true;
        } else if (class188.field2717 == 183) {
            int var300 = class359.field5120.method1617((byte) 48);
            int var301 = class359.field5120.method1574(-26);
            int var302 = class359.field5120.method1574(-70);
            int var303 = class359.field5120.method1617((byte) 48);
            int var304 = class359.field5120.method1574(-8);
            int var305 = class359.field5120.method1574(-73);
            if (class219.method1469(var300, -10993)) {
                class370.method2354(var302, false, var304, var303, var305, var301);
            }
            class188.field2717 = -1;
            return true;
        } else if (class188.field2717 == 30) {
            int var306 = class359.field5120.method1580((byte) -119);
            int var307 = class359.field5120.method1597(3641);
            int var308 = class359.field5120.method1590(false);
            int var309 = class359.field5120.method1590(false);
            if (class219.method1469(var308, -10993)) {
                class305.method2008(5, var306, var309, var307, 4);
            }
            class188.field2717 = -1;
            return true;
        } else if (class188.field2717 == 42) {
            int var310 = class359.field5120.method1566(-3451);
            int var311 = class359.field5120.method1617((byte) 48);
            int var312 = class359.field5120.method1617((byte) 48);
            if (class219.method1469(var311, -10993)) {
                class191.method1295(0, var312, 30176, var310);
            }
            class188.field2717 = -1;
            return true;
        } else if (class188.field2717 == 253) {
            int var313 = class359.field5120.method1586((byte) 112);
            int var314 = class359.field5120.method1569(-1);
            int var315 = class359.field5120.method1585(122);
            if (class219.method1469(var315, -10993)) {
                class14.method104(5, var314, var313);
            }
            class188.field2717 = -1;
            return true;
        } else if (class188.field2717 == 140) {
            class433.method2716(3, true);
            class188.field2717 = -1;
            return true;
        } else if (class188.field2717 == 197) {
            class143.field1753 = class359.field5120.method1613(66);
            class188.field2717 = -1;
            class412.field5928 = class146.field1792;
            return true;
        } else if (class188.field2717 == 107) {
            int var316 = class359.field5120.method1617((byte) 48);
            int var317 = class359.field5120.method1574(-61);
            int var318 = class359.field5120.method1574(-44);
            int var319 = class359.field5120.method1574(-86);
            int var320 = class359.field5120.method1574(-22);
            int var321 = class359.field5120.method1617((byte) 48);
            if (class219.method1469(var316, -10993)) {
                class442.field6335[var317] = true;
                class95.field1137[var317] = var318;
                class249.field3555[var317] = var319;
                class318.field4516[var317] = var320;
                class365.field5185[var317] = var321;
            }
            class188.field2717 = -1;
            return true;
        } else if (class188.field2717 == 78) {
            class73.field878 = class359.field5120.method1575((byte) 110);
            class322.field4586 = class359.field5120.method1574(-47);
            class188.field2717 = -1;
            return true;
        } else if (class188.field2717 == 113) {
            int var322 = class359.field5120.method1602(true);
            int var323 = class359.field5120.method1569(-1);
            int var324 = class359.field5120.method1585(-103);
            if (class219.method1469(var324, -10993)) {
                class167 var325 = (class167) class22.field280.method1888((long) var322, (byte) -30);
                class167 var326 = (class167) class22.field280.method1888((long) var323, (byte) -30);
                if (var326 != null) {
                    class286.method1869(var326, var325 == null || var325.field2332 != var326.field2332, false, (byte) 79);
                }
                if (var325 != null) {
                    var325.method2594((byte) -22);
                    class22.field280.method1886(var325, (long) var323, 1);
                }
                class184 var327 = class282.method1863(var322, -25835);
                if (var327 != null) {
                    class186.method1277(var327, (byte) -68);
                }
                class184 var328 = class282.method1863(var323, -25835);
                if (var328 != null) {
                    class186.method1277(var328, (byte) 108);
                    class384.method2466(true, var328, (byte) -87);
                }
                if (class248.field3548 != -1) {
                    class94.method524(1, 0, class248.field3548);
                }
            }
            class188.field2717 = -1;
            return true;
        } else if (class188.field2717 == 23) {
            int var329 = class359.field5120.method1566(-3451);
            if (var329 == 65535) {
                var329 = -1;
            }
            int var330 = class359.field5120.method1580((byte) -101);
            int var331 = class359.field5120.method1590(false);
            int var332 = class359.field5120.method1597(3641);
            int var333 = class359.field5120.method1617((byte) 48);
            if (var333 == 65535) {
                var333 = -1;
            }
            if (class219.method1469(var331, -10993)) {
                for (int var334 = var329; var334 <= var333; var334++) {
                    long var335 = ((long) var330 << 32) + (long) var334;
                    class281 var337 = (class281) class322.field4588.method1888(var335, (byte) -30);
                    class281 var338;
                    if (var337 != null) {
                        var338 = new class281(var332, var337.field3976);
                        var337.method2594((byte) -22);
                    } else if (var334 == -1) {
                        var338 = new class281(var332, class282.method1863(var330, -25835).field2637.field3976);
                    } else {
                        var338 = new class281(var332, -1);
                    }
                    class322.field4588.method1886(var338, var335, 1);
                }
            }
            class188.field2717 = -1;
            return true;
        } else if (class188.field2717 == 55) {
            int var339 = class359.field5120.method1575((byte) 125);
            String var340 = class359.field5120.method1562(false);
            int var341 = class359.field5120.method1574(-127);
            int var342 = class359.field5120.method1590(false);
            if (var342 == 65535) {
                var342 = -1;
            }
            if (var341 >= 1 && var341 <= 8) {
                if (var340.equalsIgnoreCase("null")) {
                    var340 = null;
                }
                class46.field548[var341 - 1] = var340;
                class222.field3122[var341 - 1] = var342;
                class341.field4823[var341 - 1] = var339 == 0;
            }
            class188.field2717 = -1;
            return true;
        } else if (class188.field2717 == 198) {
            boolean var343 = class359.field5120.method1574(-111) == 1;
            String var344 = class359.field5120.method1562(false);
            String var345 = var344;
            if (var343) {
                var345 = class359.field5120.method1562(false);
            }
            long var346 = (long) class359.field5120.method1617((byte) 48);
            long var348 = (long) class359.field5120.method1616(false);
            int var350 = class359.field5120.method1574(-31);
            int var351 = class359.field5120.method1617((byte) 48);
            long var352 = (var346 << 32) + var348;
            boolean var354 = false;
            int var355 = 0;
            while (true) {
                if (var355 >= 100) {
                    if (var350 <= 1 && class45.method267(var345, (byte) -98)) {
                        var354 = true;
                    }
                    break;
                }
                if (class369.field5211[var355] == var352) {
                    var354 = true;
                    break;
                }
                var355++;
            }
            if (!var354 && class215.field3043 == 0) {
                class369.field5211[class399.field5696] = var352;
                class399.field5696 = (class399.field5696 + 1) % 100;
                String var356 = class193.method1308(70, var351).method1993(class359.field5120, 120);
                if (var350 == 2) {
                    class123.method780(var351, "<img=1>" + var345, "<img=1>" + var344, 0, 103, var356, 18, (String) null);
                } else if (var350 == 1) {
                    class123.method780(var351, "<img=0>" + var345, "<img=0>" + var344, 0, 79, var356, 18, (String) null);
                } else {
                    class123.method780(var351, var345, var344, 0, 106, var356, 18, (String) null);
                }
            }
            class188.field2717 = -1;
            return true;
        } else if (class188.field2717 == 73) {
            String var357 = class359.field5120.method1562(false);
            String var358 = class151.method917(class389.method2490(true, class95.method527(-99, class359.field5120)), 123);
            class325.method2112(var358, 0, 6, var357, -27259, var357);
            class188.field2717 = -1;
            return true;
        } else if (class188.field2717 == 151) {
            int var359 = class359.field5120.method1597(3641);
            int var360 = class359.field5120.method1566(-3451);
            int var361 = class359.field5120.method1597(3641);
            int var362 = class359.field5120.method1617((byte) 48);
            if (var362 == 65535) {
                var362 = -1;
            }
            if (class219.method1469(var360, -10993)) {
                class75.method418(var361, false, var359, var362);
                class163 var363 = class50.method288(0, var362);
                class379.method2442(-124, var363.field2289, var363.field2252, var363.field2251, var359);
                class154.method932(var359, var363.field2286, 28845, var363.field2232, var363.field2281);
            }
            class188.field2717 = -1;
            return true;
        } else if (class188.field2717 == 147) {
            int var364 = class359.field5120.method1590(false);
            int var365 = class359.field5120.method1580((byte) -85);
            int var366 = class359.field5120.method1613(97);
            int var367 = class359.field5120.method1613(99);
            if (class219.method1469(var364, -10993)) {
                class162.method1058(var365, 11, var366, var367);
            }
            class188.field2717 = -1;
            return true;
        } else if (class188.field2717 == 144) {
            int var368 = class359.field5120.method1617((byte) 48);
            int var369 = class359.field5120.method1574(-68);
            int var370 = class359.field5120.method1574(-126);
            int var371 = class359.field5120.method1617((byte) 48);
            int var372 = class359.field5120.method1574(-40);
            int var373 = class359.field5120.method1574(-50);
            if (class219.method1469(var368, -10993)) {
                class291.method1929(var371, var373, var370, var372, var369, 100, true);
            }
            class188.field2717 = -1;
            return true;
        } else if (class188.field2717 == 248) {
            class356.method2273(1431655765, class14.field185, class55.field658, class359.field5120);
            class188.field2717 = -1;
            return true;
        } else if (class188.field2717 == 137) {
            int var374 = class359.field5120.method1567(65280);
            int var375 = class359.field5120.method1556((byte) 118);
            int var376 = class359.field5120.method1556((byte) 103);
            class129.field1570 = var376 >> 1;
            class384.field5422.method247(class129.field1570, var375, (var376 & 0x1) == 1, var374, 112);
            class188.field2717 = -1;
            return true;
        } else if (class188.field2717 == 233) {
            int var377 = class359.field5120.method1569(-1);
            int var378 = class359.field5120.method1617((byte) 48);
            if (class219.method1469(var378, -10993)) {
                class305.method2008(3, -1, -1, var377, 4);
            }
            class188.field2717 = -1;
            return true;
        } else {
            class422.method2663("T1 - " + class188.field2717 + "," + class68.field771 + "," + class199.field2838 + " - " + class55.field658, (Throwable) null, -104);
            class71.method407(0);
            return true;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Z)V")
    public final void method1753(boolean arg0) {
        field3746++;
        if (this.field3749 == null) {
            return;
        }
        this.field3749.field3745 = this.field3745;
        this.field3745.field3749 = this.field3749;
        this.field3745 = null;
        this.field3749 = null;
        if (arg0) {
            this.field3749 = null;
        }
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(I)V")
    public static void method1754(int arg0) {
        if (arg0 != -1) {
            method1754(94);
        }
        field3750 = null;
        field3751 = null;
    }

    @OriginalMember(owner = "client!td", name = "c", descriptor = "(I)V")
    public static final void method1755(int arg0) {
        class72.field867.method1618(0);
        if (arg0 != -26847) {
            field3750 = null;
        }
        field3744++;
        class392.field5521.method1618(0);
    }

    static {
        new class362("Login to a members' server to use this object.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Connectez-vous à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
    }
}
