import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class167 extends class418 {

    @OriginalMember(owner = "client!ed", name = "n", descriptor = "I")
    public int field2256 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!ed", name = "o", descriptor = "I")
    public int field2257 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!ed", name = "k", descriptor = "I")
    public int field2253 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!ed", name = "q", descriptor = "I")
    public int field2259 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!ed", name = "w", descriptor = "I")
    public int field2265 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!ed", name = "A", descriptor = "I")
    public int field2269 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!ed", name = "u", descriptor = "I")
    public int field2263 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!ed", name = "y", descriptor = "I")
    public int field2267 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!ed", name = "r", descriptor = "Lbd;")
    public class27 field2260;

    @OriginalMember(owner = "client!ed", name = "x", descriptor = "Z")
    public static boolean field2266 = false;

    @OriginalMember(owner = "client!ed", name = "B", descriptor = "Lbo;")
    public static class453 field2270 = new class453(512);

    @OriginalMember(owner = "client!ed", name = "C", descriptor = "Z")
    public static boolean field2271 = true;

    @OriginalMember(owner = "client!ed", name = "l", descriptor = "I")
    public static int field2254;

    @OriginalMember(owner = "client!ed", name = "m", descriptor = "I")
    public static int field2255;

    @OriginalMember(owner = "client!ed", name = "p", descriptor = "I")
    public static int field2258;

    @OriginalMember(owner = "client!ed", name = "s", descriptor = "I")
    public static int field2261;

    @OriginalMember(owner = "client!ed", name = "t", descriptor = "I")
    public static int field2262;

    @OriginalMember(owner = "client!ed", name = "v", descriptor = "I")
    public static int field2264;

    @OriginalMember(owner = "client!ed", name = "z", descriptor = "I")
    public static int field2268;

    @OriginalMember(owner = "client!ed", name = "D", descriptor = "Lir;")
    public static class185 field2272;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIBIIIII)V")
    public static final void method1120(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2262++;
        int var8 = arg0 - 334;
        if (arg2 != -112) {
            field2270 = null;
        }
        if (var8 < 0) {
            var8 = 0;
        } else if (var8 > 100) {
            var8 = 100;
        }
        int var9 = (class246.field3465 - class369.field5451) * var8 / 100 + class369.field5451;
        int var10 = arg6 * var9 >> 8;
        int var11 = 16384 - arg1 & 0x3FFF;
        int var12 = 16384 - arg5 & 0x3FFF;
        int var13 = 0;
        int var14 = 0;
        int var15 = var10;
        if (var11 != 0) {
            var14 = class240.field3364[var11] * -var10 >> 15;
            var15 = class240.field3365[var11] * var10 >> 15;
        }
        if (var12 != 0) {
            var13 = class240.field3364[var12] * var15 >> 15;
            var15 = class240.field3365[var12] * var15 >> 15;
        }
        class7.field88 = arg5;
        class279.field4099 = arg4 - var15;
        class326.field4829 = arg7 - var13;
        class47.field716 = arg1;
        class289.field4331 = arg3 - var14;
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(I)Z")
    public static final boolean method1121(int arg0) throws IOException {
        field2254++;
        if (class290.field4380 == null) {
            return false;
        }
        int var1 = class290.field4380.method2359(true);
        if (var1 == 0) {
            return false;
        }
        if (class8.field112 == -1) {
            class290.field4380.method2366(class27.field471.field5042, 0, 0, 1);
            class27.field471.field5049 = 0;
            class8.field112 = class27.field471.method1837(255);
            var1--;
            class20.field342 = class158.field1994[class8.field112];
        }
        if (class20.field342 == -1) {
            if (var1 <= 0) {
                return false;
            }
            class290.field4380.method2366(class27.field471.field5042, 0, 0, 1);
            var1--;
            class20.field342 = class27.field471.field5042[0] & 0xFF;
        }
        if (class20.field342 == -2) {
            if (var1 <= 1) {
                return false;
            }
            class290.field4380.method2366(class27.field471.field5042, 0, 0, 2);
            class27.field471.field5049 = 0;
            class20.field342 = class27.field471.method2239(arg0 - 1076227960);
            var1 -= 2;
        }
        if (class20.field342 > var1) {
            return false;
        }
        class27.field471.field5049 = arg0;
        class290.field4380.method2366(class27.field471.field5042, 0, 0, class20.field342);
        class195.field2702 = 0;
        class402.field5870 = class86.field1199;
        class86.field1199 = class400.field5861;
        class400.field5861 = class8.field112;
        if (class8.field112 == 93) {
            int var2 = class27.field471.method2213((byte) -47);
            int var3 = class27.field471.method2228(-128);
            int var4 = class27.field471.method2239(-1076227960);
            int var5 = class27.field471.method2230(arg0 ^ 0x739DC288);
            if ((var2 >> 30) != 0) {
                int var30 = (var2 & 0x3DDDDE11) >> 28;
                int var31 = (var2 >> 14 & 0x3FFF) - class236.field3292;
                int var32 = (var2 & 0x3FFF) - class90.field1223;
                if (var31 >= 0 && var32 >= 0 && class351.field5217 > var31 && class143.field1815 > var32) {
                    int var33 = var31 * 128 + 64;
                    int var34 = var32 * 128 + 64;
                    class258 var35 = new class258(var4, 0, class231.field3179, var30, var33, class248.method1621(var33, var34, -13853, var30) - var3, var34, var31, var31, var32, var32);
                    class176.field2383.method1560(arg0 - 124, new class110(var35));
                }
            } else if ((var2 >> 29) != 0) {
                int var18 = var2 & 0xFFFF;
                class163 var19 = class388.field5670[var18];
                if (var19 != null) {
                    if (var4 == 65535) {
                        var4 = -1;
                    }
                    boolean var20 = true;
                    if (var4 != -1 && var19.field2142 != -1) {
                        if (var19.field2142 == var4) {
                            class235 var25 = class263.method1762(var4, false);
                            if (var25.field3263 && var25.field3271 != -1) {
                                class233 var26 = class73.method597(var25.field3271, -1);
                                int var27 = var26.field3239;
                                if (var27 == 0 || var27 == 2) {
                                    var20 = false;
                                } else if (var27 == 1) {
                                    var20 = true;
                                }
                            }
                        } else {
                            class235 var21 = class263.method1762(var4, false);
                            class235 var22 = class263.method1762(var19.field2142, false);
                            if (var21.field3271 != -1 && var22.field3271 != -1) {
                                class233 var23 = class73.method597(var21.field3271, -1);
                                class233 var24 = class73.method597(var22.field3271, -1);
                                if (var23.field3250 < var24.field3250) {
                                    var20 = false;
                                }
                            }
                        }
                    }
                    if (var20) {
                        var19.field2165 = 1;
                        var19.field2117 = 0;
                        var19.field2160 = class231.field3179 + var5;
                        var19.field2135 = var3;
                        var19.field2142 = var4;
                        var19.field2113 = 0;
                        if (var19.field2160 > class231.field3179) {
                            var19.field2113 = -1;
                        }
                        if (var19.field2142 != -1 && class231.field3179 == var19.field2160) {
                            int var28 = class263.method1762(var19.field2142, false).field3271;
                            if (var28 != -1) {
                                class233 var29 = class73.method597(var28, -1);
                                if (var29 != null && var29.field3242 != null) {
                                    class379.method2476(0, false, false, var19.field5930, var29, var19.field5921);
                                }
                            }
                        }
                    }
                }
            } else if (var2 >> 28 != 0) {
                int var6 = var2 & 0xFFFF;
                class317 var7;
                if (class400.field5853 == var6) {
                    var7 = class383.field5609;
                } else {
                    var7 = class176.field2382[var6];
                }
                if (var7 != null) {
                    if (var4 == 65535) {
                        var4 = -1;
                    }
                    boolean var8 = true;
                    if (var4 != -1 && var7.field2142 != -1) {
                        if (var7.field2142 == var4) {
                            class235 var9 = class263.method1762(var4, false);
                            if (var9.field3263 && var9.field3271 != -1) {
                                class233 var10 = class73.method597(var9.field3271, arg0 - 1);
                                int var11 = var10.field3239;
                                if (var11 == 0 || var11 == 2) {
                                    var8 = false;
                                } else if (var11 == 1) {
                                    var8 = true;
                                }
                            }
                        } else {
                            class235 var12 = class263.method1762(var4, false);
                            class235 var13 = class263.method1762(var7.field2142, false);
                            if (var12.field3271 != -1 && var13.field3271 != -1) {
                                class233 var14 = class73.method597(var12.field3271, -1);
                                class233 var15 = class73.method597(var13.field3271, -1);
                                if (var14.field3250 < var15.field3250) {
                                    var8 = false;
                                }
                            }
                        }
                    }
                    if (var8) {
                        var7.field2160 = class231.field3179 + var5;
                        var7.field2142 = var4;
                        var7.field2135 = var3;
                        var7.field2113 = 0;
                        var7.field2165 = 1;
                        var7.field2117 = 0;
                        if (class231.field3179 < var7.field2160) {
                            var7.field2113 = -1;
                        }
                        if (var7.field2142 == 65535) {
                            var7.field2142 = -1;
                        }
                        if (var7.field2142 != -1 && class231.field3179 == var7.field2160) {
                            int var16 = class263.method1762(var7.field2142, false).field3271;
                            if (var16 != -1) {
                                class233 var17 = class73.method597(var16, ~arg0);
                                if (var17 != null && var17.field3242 != null) {
                                    class379.method2476(0, false, class383.field5609 == var7, var7.field5930, var17, var7.field5921);
                                }
                            }
                        }
                    }
                }
            }
            class8.field112 = -1;
            return true;
        } else if (class8.field112 == 80) {
            class389.method2515(class63.field948, class27.field471, class20.field342, true);
            class8.field112 = -1;
            return true;
        } else if (class8.field112 == 148) {
            int var36 = class27.field471.method2239(-1076227960);
            if (class73.method596(65535, var36)) {
                class24.method214((byte) 97);
            }
            class8.field112 = -1;
            return true;
        } else if (class8.field112 == 101) {
            int var37 = class27.field471.method2223(-1);
            int var38 = class27.field471.method2232(-16);
            int var39 = class27.field471.method2233((byte) 104);
            String var40 = "";
            String var41 = var40;
            if ((var39 & 0x1) != 0) {
                var40 = class27.field471.method2261((byte) 91);
                if ((var39 & 0x2) == 0) {
                    var41 = var40;
                } else {
                    var41 = class27.field471.method2261((byte) 116);
                }
            }
            String var42 = class27.field471.method2261((byte) 105);
            if (var37 == 99) {
                class17.method129(var42, (byte) -5);
            } else if (var41.equals("") || !class322.method2123(var41, (byte) -93)) {
                class20.method181(var38, var37, var42, var40, 9231, var41);
            } else {
                class8.field112 = -1;
                return true;
            }
            class8.field112 = -1;
            return true;
        } else if (class8.field112 == 46) {
            class342.field5118 = class394.field5732;
            if (class20.field342 == 0) {
                class57.field859 = null;
                class8.field112 = -1;
                class402.field5873 = 0;
                class43.field637 = null;
                class8.field114 = null;
                return true;
            }
            class57.field859 = class27.field471.method2261((byte) 88);
            boolean var43 = class27.field471.method2233((byte) 104) == 1;
            if (var43) {
                class27.field471.method2261((byte) 95);
            }
            long var44 = class27.field471.method2231(50);
            class8.field114 = class237.method1544(var44, 11764);
            class357.field5293 = class27.field471.method2211(255);
            int var46 = class27.field471.method2233((byte) 104);
            if (var46 == 255) {
                class8.field112 = -1;
                return true;
            }
            class402.field5873 = var46;
            class69[] var47 = new class69[100];
            for (int var48 = 0; var48 < class402.field5873; var48++) {
                var47[var48] = new class69();
                var47[var48].field1007 = class27.field471.method2261((byte) 70);
                boolean var54 = class27.field471.method2233((byte) 104) == 1;
                if (var54) {
                    var47[var48].field996 = class27.field471.method2261((byte) 98);
                } else {
                    var47[var48].field996 = var47[var48].field1007;
                }
                var47[var48].field1010 = class27.field471.method2239(-1076227960);
                var47[var48].field998 = class27.field471.method2211(arg0 ^ 0xFF);
                var47[var48].field1001 = class27.field471.method2261((byte) 119);
                if (var47[var48].field996.equals(class383.field5609.field4650)) {
                    class297.field4478 = var47[var48].field998;
                }
            }
            boolean var49 = false;
            int var50 = class402.field5873;
            while (var50 > 0) {
                boolean var51 = true;
                var50--;
                for (int var52 = 0; var52 < var50; var52++) {
                    if (var47[var52].field1007.compareTo(var47[var52 + 1].field1007) > 0) {
                        class69 var53 = var47[var52];
                        var47[var52] = var47[var52 + 1];
                        var51 = false;
                        var47[var52 + 1] = var53;
                    }
                }
                if (var51) {
                    break;
                }
            }
            class43.field637 = var47;
            class8.field112 = -1;
            return true;
        } else if (class8.field112 == 60) {
            int var55 = class27.field471.method2233((byte) 104);
            if (class27.field471.method2233((byte) 104) == 0) {
                class351.field5214[var55] = new class429();
            } else {
                class27.field471.field5049--;
                class351.field5214[var55] = new class429(class27.field471);
            }
            class373.field5503 = class394.field5732;
            class8.field112 = -1;
            return true;
        } else if (class8.field112 == 32) {
            int var56 = class27.field471.method2239(arg0 - 1076227960);
            if (var56 == 65535) {
                var56 = -1;
            }
            int var57 = class27.field471.method2230(1939718792);
            int var58 = class27.field471.method2256(97);
            if (class73.method596(65535, var57)) {
                class295.method2002(-1, var58, var56, arg0 + 4, 1);
            }
            class8.field112 = -1;
            return true;
        } else if (class8.field112 == 44) {
            class159.method1061((byte) -115);
            class257.field3771 = class27.field471.method2212(arg0 ^ 0xFFFFFFFE);
            class92.field1265 = class394.field5732;
            class8.field112 = -1;
            return true;
        } else if (class8.field112 == 37) {
            int var59 = class27.field471.method2265(false);
            int var60 = class27.field471.method2228(-128);
            int var61 = class27.field471.method2265(false);
            if (class73.method596(65535, var60)) {
                class237.method1541(var59, -108, 0, var61);
            }
            class8.field112 = -1;
            return true;
        } else if (class8.field112 == 182 || class8.field112 == 167 || class8.field112 == 184 || class8.field112 == 164 || class8.field112 == 233 || class8.field112 == 24 || class8.field112 == 5 || class8.field112 == 81 || class8.field112 == 122 || class8.field112 == 7 || class8.field112 == 172 || class8.field112 == 204 || class8.field112 == 227 || class8.field112 == 196 || class8.field112 == 200) {
            class104.method784((byte) -74);
            class8.field112 = -1;
            return true;
        } else if (class8.field112 == 25) {
            int var62 = class27.field471.method2232(115);
            int var63 = class27.field471.method2232(105);
            int var64 = class27.field471.method2239(arg0 ^ 0xBFDA1088);
            int var65 = class27.field471.method2230(1939718792);
            if (class73.method596(arg0 + 65535, var65)) {
                class295.method2002(var62, var63, var64, 4, 5);
            }
            class8.field112 = -1;
            return true;
        } else if (class8.field112 == 90) {
            int var66 = class27.field471.method2239(-1076227960);
            if (var66 == 65535) {
                var66 = -1;
            }
            int var67 = class27.field471.method2233((byte) 104);
            int var68 = class27.field471.method2239(arg0 - 1076227960);
            int var69 = class27.field471.method2233((byte) 104);
            class230.method1494(var69, var66, var67, true, var68);
            class8.field112 = -1;
            return true;
        } else if (class8.field112 == 92) {
            int var70 = class27.field471.method2265(false);
            int var71 = class27.field471.method2230(arg0 ^ 0x739DC288);
            if (var71 == 65535) {
                var71 = -1;
            }
            int var72 = class27.field471.method2226(~arg0);
            int var73 = class27.field471.method2232(109);
            int var74 = class27.field471.method2265(false);
            if (var74 == 65535) {
                var74 = -1;
            }
            if (class73.method596(65535, var70)) {
                for (int var75 = var74; var75 <= var71; var75++) {
                    long var76 = ((long) var73 << 32) + ((long) var75);
                    class226 var78 = (class226) field2270.method2826(false, var76);
                    class226 var79;
                    if (var78 != null) {
                        var79 = new class226(var72, var78.field3118);
                        var78.method2632(true);
                    } else if (var75 == -1) {
                        var79 = new class226(var72, class27.method224(65535, var73).field3516.field3118);
                    } else {
                        var79 = new class226(var72, -1);
                    }
                    field2270.method2815(-1, var76, var79);
                }
            }
            class8.field112 = -1;
            return true;
        } else if (class8.field112 == 178) {
            int var80 = class27.field471.method2265(false);
            int var81 = class27.field471.method2265(false);
            int var82 = class27.field471.method2228(-128);
            int var83 = class27.field471.method2213((byte) -47);
            int var84 = class27.field471.method2239(-1076227960);
            if (class73.method596(65535, var80)) {
                class265.method1776(var82, var83, var84, var81, 8);
            }
            class8.field112 = -1;
            return true;
        } else if (class8.field112 == 216) {
            int var85 = class27.field471.method2233((byte) 104);
            int var86 = class27.field471.method2233((byte) 104);
            if (var85 == 255) {
                var86 = -1;
                var85 = -1;
            }
            class421.method2650(var85, var86, (byte) 34);
            class8.field112 = -1;
            return true;
        } else if (class8.field112 == 39) {
            class163.method1101(arg0);
            class8.field112 = -1;
            return false;
        } else if (class8.field112 == 102) {
            if (class233.field3246 != -1) {
                class276.method1817((byte) -112, class233.field3246, 0);
            }
            class8.field112 = -1;
            return true;
        } else if (class8.field112 == 203) {
            int var87 = class27.field471.method2230(1939718792);
            int var88 = class27.field471.method2256(99);
            int var89 = class27.field471.method2233((byte) 104);
            if (class73.method596(65535, var87)) {
                class273.method1804(var88, var89, 125);
            }
            class8.field112 = -1;
            return true;
        } else if (class8.field112 == 150) {
            int var90 = class27.field471.method2213((byte) -47);
            int var91 = class27.field471.method2265(false);
            if (var91 == 65535) {
                var91 = -1;
            }
            int var92 = class27.field471.method2239(-1076227960);
            int var93 = class27.field471.method2228(-128);
            int var94 = class27.field471.method2239(-1076227960);
            if (var94 == 65535) {
                var94 = -1;
            }
            if (class73.method596(65535, var93)) {
                for (int var95 = var94; var95 <= var91; var95++) {
                    long var96 = ((long) var90 << 32) + ((long) var95);
                    class226 var98 = (class226) field2270.method2826(false, var96);
                    class226 var99;
                    if (var98 != null) {
                        var99 = new class226(var98.field3108, var92);
                        var98.method2632(true);
                    } else if (var95 == -1) {
                        var99 = new class226(class27.method224(65535, var90).field3516.field3108, var92);
                    } else {
                        var99 = new class226(0, var92);
                    }
                    field2270.method2815(-1, var96, var99);
                }
            }
            class8.field112 = -1;
            return true;
        } else if (class8.field112 == 198) {
            int var100 = class27.field471.method2228(-128);
            int var101 = class27.field471.method2239(-1076227960);
            byte var102 = class27.field471.method2211(arg0 + 255);
            if (class73.method596(65535, var100)) {
                class453.method2821(-103, var102, var101);
            }
            class8.field112 = -1;
            return true;
        } else if (class8.field112 == 161) {
            int var103 = class27.field471.method2256(119);
            int var104 = class27.field471.method2265(false);
            int var105 = class27.field471.method2230(1939718792);
            if (class73.method596(65535, var104)) {
                class62.method554(var105, var103, (byte) -32);
            }
            class8.field112 = -1;
            return true;
        } else if (class8.field112 == 72) {
            int var106 = class27.field471.method2256(121);
            class248 var107 = class27.method224(arg0 + 65535, var106);
            for (int var108 = 0; var108 < var107.field3651.length; var108++) {
                var107.field3651[var108] = -1;
                var107.field3651[var108] = 0;
            }
            class92.method744(arg0 + 20491, var107);
            class8.field112 = -1;
            return true;
        } else if (class8.field112 == 50) {
            String var109 = class27.field471.method2261((byte) 127);
            int var110 = class27.field471.method2239(-1076227960);
            String var111 = class208.method1367(-10186, var110).method796(class27.field471, -16981);
            class237.method1536((String) null, var111, var109, true, var110, 19, 0, var109);
            class8.field112 = -1;
            return true;
        } else if (class8.field112 == 71) {
            int var112 = class27.field471.method2239(-1076227960);
            int var113 = class27.field471.method2238(77);
            int var114 = class27.field471.method2230(1939718792);
            class163 var115 = class388.field5670[var112];
            if (var115 != null) {
                class190.method1266(var115, (byte) 127, var114, var113);
            }
            class8.field112 = -1;
            return true;
        } else if (class8.field112 == 65) {
            boolean var116 = class27.field471.method2233((byte) 104) == 1;
            String var117 = class27.field471.method2261((byte) 75);
            String var118 = class27.field471.method2261((byte) 106);
            int var119 = class27.field471.method2239(arg0 - 1076227960);
            int var120 = class27.field471.method2233((byte) 104);
            String var121 = "";
            boolean var122 = false;
            if (var119 > 0) {
                var121 = class27.field471.method2261((byte) 93);
                var122 = class27.field471.method2233((byte) 104) == 1;
            }
            for (int var123 = 0; var123 < class391.field5714; var123++) {
                if (var116) {
                    if (var118.equals(class30.field488[var123])) {
                        class30.field488[var123] = var117;
                        var117 = null;
                        class96.field1302[var123] = var118;
                        break;
                    }
                } else if (var117.equals(class30.field488[var123])) {
                    if (class362.field5368[var123] != var119) {
                        class362.field5368[var123] = var119;
                        if (var119 > 0) {
                            class20.method181(0, 5, var117 + class113.field1460, "", 9231, "");
                        }
                        if (var119 == 0) {
                            class20.method181(0, 5, var117 + class133.field1745, "", arg0 + 9231, "");
                        }
                    }
                    class96.field1302[var123] = var118;
                    class264.field3887[var123] = var121;
                    class39.field587[var123] = var120;
                    var117 = null;
                    class320.field4759[var123] = var122;
                    break;
                }
            }
            if (var117 != null && class391.field5714 < 200) {
                class30.field488[class391.field5714] = var117;
                class96.field1302[class391.field5714] = var118;
                class362.field5368[class391.field5714] = var119;
                class264.field3887[class391.field5714] = var121;
                class39.field587[class391.field5714] = var120;
                class320.field4759[class391.field5714] = var122;
                class391.field5714++;
            }
            class365.field5399 = class394.field5732;
            boolean var124 = false;
            int var125 = class391.field5714;
            while (var125 > 0) {
                boolean var126 = true;
                var125--;
                for (int var127 = 0; var127 < var125; var127++) {
                    if (class362.field5368[var127] != class13.field209 && class362.field5368[var127 + 1] == class13.field209 || class362.field5368[var127] == 0 && class362.field5368[var127 + 1] != 0) {
                        int var128 = class362.field5368[var127];
                        class362.field5368[var127] = class362.field5368[var127 + 1];
                        class362.field5368[var127 + 1] = var128;
                        String var129 = class264.field3887[var127];
                        class264.field3887[var127] = class264.field3887[var127 + 1];
                        class264.field3887[var127 + 1] = var129;
                        String var130 = class30.field488[var127];
                        class30.field488[var127] = class30.field488[var127 + 1];
                        class30.field488[var127 + 1] = var130;
                        String var131 = class96.field1302[var127];
                        class96.field1302[var127] = class96.field1302[var127 + 1];
                        class96.field1302[var127 + 1] = var131;
                        int var132 = class39.field587[var127];
                        class39.field587[var127] = class39.field587[var127 + 1];
                        class39.field587[var127 + 1] = var132;
                        boolean var133 = class320.field4759[var127];
                        class320.field4759[var127] = class320.field4759[var127 + 1];
                        class320.field4759[var127 + 1] = var133;
                        var126 = false;
                    }
                }
                if (var126) {
                    break;
                }
            }
            class8.field112 = -1;
            return true;
        } else if (class8.field112 == 230) {
            boolean var134 = class27.field471.method2233((byte) 104) == 1;
            String var135 = class27.field471.method2261((byte) 67);
            String var136 = var135;
            if (var134) {
                var136 = class27.field471.method2261((byte) 84);
            }
            long var137 = (long) class27.field471.method2239(-1076227960);
            long var139 = (long) class27.field471.method2249(32767);
            int var141 = class27.field471.method2233((byte) 104);
            long var142 = (var137 << 32) + var139;
            boolean var144 = false;
            int var145 = 0;
            while (true) {
                if (var145 >= 100) {
                    if (var141 <= 1) {
                        if (!(!class181.field2419 || class379.field5553) || class406.field5916) {
                            var144 = true;
                        } else if (class322.method2123(var136, (byte) -106)) {
                            var144 = true;
                        }
                    }
                    break;
                }
                if (class240.field3361[var145] == var142) {
                    var144 = true;
                    break;
                }
                var145++;
            }
            if (!var144 && class256.field3745 == 0) {
                class240.field3361[class17.field276] = var142;
                class17.field276 = (class17.field276 + 1) % 100;
                String var146 = class43.method304((byte) 23, class321.method2113((byte) 86, class170.method1140(arg0 + 70, class27.field471)));
                if (var141 == 2) {
                    class237.method1536((String) null, var146, "<img=1>" + var135, true, -1, 7, 0, "<img=1>" + var136);
                } else if (var141 == 1) {
                    class237.method1536((String) null, var146, "<img=0>" + var135, true, -1, 7, 0, "<img=0>" + var136);
                } else {
                    class237.method1536((String) null, var146, var135, true, -1, 3, 0, var136);
                }
            }
            class8.field112 = -1;
            return true;
        } else if (class8.field112 == 194) {
            int var147 = class27.field471.method2239(-1076227960);
            int var148 = class27.field471.method2265(false);
            int var149 = class27.field471.method2232(116);
            if (class73.method596(arg0 ^ 0xFFFF, var147)) {
                class246.method1603(var148, var149, 6);
            }
            class8.field112 = -1;
            return true;
        } else if (class8.field112 == 117) {
            int var150 = class27.field471.method2265(false);
            int var151 = class27.field471.method2226(-1);
            int var152 = class27.field471.method2239(-1076227960);
            if (var152 == 65535) {
                var152 = -1;
            }
            if (class73.method596(65535, var150)) {
                class295.method2002(-1, var151, var152, 4, 2);
            }
            class8.field112 = -1;
            return true;
        } else if (class8.field112 == 211) {
            int var153 = class27.field471.method2239(-1076227960);
            int var154 = class27.field471.method2239(-1076227960);
            int var155 = class27.field471.method2228(-128);
            int var156 = class27.field471.method2213((byte) -47);
            int var157 = class27.field471.method2265(false);
            if (class73.method596(arg0 + 65535, var157)) {
                class295.method2002(var153, var156, var155 << 16 | var154, 4, 7);
            }
            class8.field112 = -1;
            return true;
        } else if (class8.field112 == 82) {
            int var158 = class27.field471.method2233((byte) 104);
            int var159 = var158 >> 5;
            int var160 = var158 & 0x1F;
            if (var160 == 0) {
                class349.field5195[var159] = null;
                class8.field112 = -1;
                return true;
            }
            class198 var161 = new class198();
            var161.field2741 = var160;
            var161.field2732 = class27.field471.method2233((byte) 104);
            if (var161.field2732 >= 0 && var161.field2732 < class160.field2083.length) {
                if (var161.field2741 == 1 || var161.field2741 == 10) {
                    var161.field2729 = class27.field471.method2239(-1076227960);
                    class27.field471.field5049 += 5;
                } else if (var161.field2741 >= 2 && var161.field2741 <= 6) {
                    if (var161.field2741 == 2) {
                        var161.field2740 = 64;
                        var161.field2738 = 64;
                    }
                    if (var161.field2741 == 3) {
                        var161.field2740 = 64;
                        var161.field2738 = 0;
                    }
                    if (var161.field2741 == 4) {
                        var161.field2740 = 64;
                        var161.field2738 = 128;
                    }
                    if (var161.field2741 == 5) {
                        var161.field2740 = 0;
                        var161.field2738 = 64;
                    }
                    if (var161.field2741 == 6) {
                        var161.field2740 = 128;
                        var161.field2738 = 64;
                    }
                    var161.field2741 = 2;
                    var161.field2739 = class27.field471.method2239(-1076227960);
                    var161.field2734 = class27.field471.method2239(-1076227960);
                    var161.field2735 = class27.field471.method2233((byte) 104);
                    var161.field2733 = class27.field471.method2239(-1076227960);
                }
                var161.field2731 = class27.field471.method2239(-1076227960);
                if (var161.field2731 == 65535) {
                    var161.field2731 = -1;
                }
                class349.field5195[var159] = var161;
            }
            class8.field112 = -1;
            return true;
        } else if (class8.field112 == 252) {
            int var162 = class27.field471.method2262(true);
            int var163 = class27.field471.method2230(1939718792);
            if (class73.method596(65535, var163)) {
                class256.field3741 = var162;
            }
            class8.field112 = -1;
            return true;
        } else if (class8.field112 == 135) {
            String var164 = class27.field471.method2261((byte) 122);
            boolean var165 = class27.field471.method2233((byte) 104) == 1;
            String var166;
            if (var165) {
                var166 = class27.field471.method2261((byte) 101);
            } else {
                var166 = var164;
            }
            int var167 = class27.field471.method2239(-1076227960);
            byte var168 = class27.field471.method2211(255);
            boolean var169 = false;
            if (var168 == -128) {
                var169 = true;
            }
            if (var169) {
                if (class402.field5873 == 0) {
                    class8.field112 = -1;
                    return true;
                }
                boolean var175 = false;
                int var176;
                for (var176 = 0; class402.field5873 > var176 && (!class43.field637[var176].field996.equals(var166) || class43.field637[var176].field1010 != var167); var176++) {
                }
                if (var176 < class402.field5873) {
                    while (class402.field5873 - 1 > var176) {
                        class43.field637[var176] = class43.field637[var176 + 1];
                        var176++;
                    }
                    class402.field5873--;
                    class43.field637[class402.field5873] = null;
                }
            } else {
                String var170 = class27.field471.method2261((byte) 68);
                class69 var171 = new class69();
                var171.field998 = var168;
                var171.field1007 = var164;
                var171.field1001 = var170;
                var171.field1010 = var167;
                var171.field996 = var166;
                int var172;
                for (var172 = class402.field5873 - 1; var172 >= 0; var172--) {
                    int var173 = class43.field637[var172].field996.compareTo(var171.field996);
                    if (var173 == 0) {
                        class43.field637[var172].field1010 = var167;
                        class43.field637[var172].field998 = var168;
                        class43.field637[var172].field1001 = var170;
                        if (var166.equals(class383.field5609.field4650)) {
                            class297.field4478 = var168;
                        }
                        class342.field5118 = class394.field5732;
                        class8.field112 = -1;
                        return true;
                    }
                    if (var173 < 0) {
                        break;
                    }
                }
                if (class43.field637.length <= class402.field5873) {
                    class8.field112 = -1;
                    return true;
                }
                for (int var174 = class402.field5873 - 1; var174 > var172; var174--) {
                    class43.field637[var174 + 1] = class43.field637[var174];
                }
                if (class402.field5873 == 0) {
                    class43.field637 = new class69[100];
                }
                class43.field637[var172 + 1] = var171;
                class402.field5873++;
                if (var166.equals(class383.field5609.field4650)) {
                    class297.field4478 = var168;
                }
            }
            class8.field112 = -1;
            class342.field5118 = class394.field5732;
            return true;
        } else if (class8.field112 == 255) {
            for (int var177 = 0; var177 < class100.field1325.length; var177++) {
                if (class385.field5632[var177] != class100.field1325[var177]) {
                    class100.field1325[var177] = class385.field5632[var177];
                    class438.method2744(32325, var177);
                    class9.field132[class394.method2529(class303.field4547++, 31)] = var177;
                }
            }
            class8.field112 = -1;
            return true;
        } else if (class8.field112 == 68) {
            int var178 = class27.field471.method2239(-1076227960);
            int var179 = class27.field471.method2233((byte) 104);
            int var180 = class27.field471.method2233((byte) 104);
            int var181 = class27.field471.method2239(-1076227960);
            int var182 = class27.field471.method2233((byte) 104);
            int var183 = class27.field471.method2233((byte) 104);
            if (class73.method596(65535, var178)) {
                class393.method2527(var182, 105, var180, var183, var181, var179);
            }
            class8.field112 = -1;
            return true;
        } else if (class8.field112 == 189) {
            boolean var184 = class27.field471.method2233((byte) 104) == 1;
            String var185 = class27.field471.method2261((byte) 86);
            String var186 = var185;
            if (var184) {
                var186 = class27.field471.method2261((byte) 113);
            }
            long var187 = (long) class27.field471.method2239(-1076227960);
            long var189 = (long) class27.field471.method2249(arg0 + 32767);
            int var191 = class27.field471.method2233((byte) 104);
            int var192 = class27.field471.method2239(-1076227960);
            long var193 = (var187 << 32) + var189;
            boolean var195 = false;
            int var196 = 0;
            while (true) {
                if (var196 >= 100) {
                    if (var191 <= 1 && class322.method2123(var186, (byte) -126)) {
                        var195 = true;
                    }
                    break;
                }
                if (class240.field3361[var196] == var193) {
                    var195 = true;
                    break;
                }
                var196++;
            }
            if (!var195 && class256.field3745 == 0) {
                class240.field3361[class17.field276] = var193;
                class17.field276 = (class17.field276 + 1) % 100;
                String var197 = class208.method1367(-10186, var192).method796(class27.field471, -16981);
                if (var191 == 2) {
                    class237.method1536((String) null, var197, "<img=1>" + var185, true, var192, 18, 0, "<img=1>" + var186);
                } else if (var191 == 1) {
                    class237.method1536((String) null, var197, "<img=0>" + var185, true, var192, 18, 0, "<img=0>" + var186);
                } else {
                    class237.method1536((String) null, var197, var185, true, var192, 18, 0, var186);
                }
            }
            class8.field112 = -1;
            return true;
        } else if (class8.field112 == 12) {
            class233.field3230 = class27.field471.method2262(true);
            class238.field3333 = class27.field471.method2207(arg0 ^ 0xFFFFFFBD);
            class8.field112 = -1;
            return true;
        } else if (class8.field112 == 174) {
            int var198 = class27.field471.method2226(~arg0);
            int var199 = class27.field471.method2226(~arg0);
            int var200 = class27.field471.method2265(false);
            if (class73.method596(65535, var200)) {
                class28 var201 = (class28) class242.field3402.method2826(false, (long) var199);
                class28 var202 = (class28) class242.field3402.method2826(false, (long) var198);
                if (var202 != null) {
                    class93.method751(var202, var201 == null || var201.field482 != var202.field482, (byte) -62, false);
                }
                if (var201 != null) {
                    var201.method2632(true);
                    class242.field3402.method2815(-1, (long) var198, var201);
                }
                class248 var203 = class27.method224(65535, var199);
                if (var203 != null) {
                    class92.method744(20491, var203);
                }
                class248 var204 = class27.method224(65535, var198);
                if (var204 != null) {
                    class92.method744(20491, var204);
                    class185.method1215(-1, true, var204);
                }
                if (class233.field3246 != -1) {
                    class276.method1817((byte) 62, class233.field3246, 1);
                }
            }
            class8.field112 = -1;
            return true;
        } else if (class8.field112 == 154) {
            class144.method996(0);
            class8.field112 = -1;
            return true;
        } else if (class8.field112 == 76) {
            class297.field4480 = class27.field471.method2233((byte) 104);
            class8.field112 = -1;
            class365.field5399 = class394.field5732;
            return true;
        } else if (class8.field112 == 78) {
            int var205 = class27.field471.method2239(-1076227960);
            String var206 = class27.field471.method2261((byte) 82);
            Object[] var207 = new Object[var206.length() + 1];
            for (int var208 = var206.length() - 1; var208 >= 0; var208--) {
                if (var206.charAt(var208) == 's') {
                    var207[var208 + 1] = class27.field471.method2261((byte) 117);
                } else {
                    var207[var208 + 1] = Integer.valueOf(class27.field471.method2232(arg0 - 81));
                }
            }
            var207[0] = Integer.valueOf(class27.field471.method2232(122));
            if (class73.method596(65535, var205)) {
                class452 var209 = new class452();
                var209.field6570 = var207;
                class293.method1989(var209);
            }
            class8.field112 = -1;
            return true;
        } else if (class8.field112 == 126) {
            class27.field471.field5049 += 28;
            if (class27.field471.method2243(323098144)) {
                class280.method1845(class27.field471, arg0 + 5653, class27.field471.field5049 + -28);
            }
            class8.field112 = -1;
            return true;
        } else if (class8.field112 == 1) {
            int var210 = class27.field471.method2239(-1076227960);
            class256.method1655(true, var210);
            class8.field108[class394.method2529(class422.field6137++, 31)] = class394.method2529(var210, 32767);
            class8.field112 = -1;
            return true;
        } else if (class8.field112 == 219) {
            int var211 = class27.field471.method2239(-1076227960);
            int var212 = class27.field471.method2233((byte) 104);
            int var213 = class27.field471.method2233((byte) 104);
            int var214 = class27.field471.method2239(-1076227960);
            int var215 = class27.field471.method2233((byte) 104);
            int var216 = class27.field471.method2233((byte) 104);
            if (class73.method596(65535, var211)) {
                class356.method2337(var212, (byte) 120, true, var215, var216, var213, var214);
            }
            class8.field112 = -1;
            return true;
        } else if (class8.field112 == 207) {
            class184.field2479 = class27.field471.method2233((byte) 104);
            for (int var217 = 0; var217 < class184.field2479; var217++) {
                class373.field5504[var217] = class27.field471.method2261((byte) 73);
                class7.field89[var217] = class27.field471.method2261((byte) 80);
                if (class7.field89[var217].equals("")) {
                    class7.field89[var217] = class373.field5504[var217];
                }
                class335.field4962[var217] = class27.field471.method2261((byte) 123);
                class309.field4577[var217] = class27.field471.method2261((byte) 116);
                if (class309.field4577[var217].equals("")) {
                    class309.field4577[var217] = class335.field4962[var217];
                }
                class400.field5862[var217] = false;
            }
            class365.field5399 = class394.field5732;
            class8.field112 = -1;
            return true;
        } else if (class8.field112 == 112) {
            int var218 = class27.field471.method2239(-1076227960);
            int var219 = class27.field471.method2233((byte) 104);
            class211.method1378(false, var218, var219);
            class8.field112 = -1;
            return true;
        } else if (class8.field112 == 253) {
            class320.method2109((byte) -81);
            class8.field112 = -1;
            return true;
        } else if (class8.field112 == 95) {
            int var220 = class27.field471.method2213((byte) -47);
            class403.field5877 = class63.field948.method2398(true, var220);
            class8.field112 = -1;
            return true;
        } else if (class8.field112 == 228) {
            int var221 = class27.field471.method2265(false);
            String var222 = class27.field471.method2261((byte) 80);
            int var223 = class27.field471.method2228(-128);
            if (class73.method596(65535, var221)) {
                class100.method770(10421, var223, var222);
            }
            class8.field112 = -1;
            return true;
        } else if (class8.field112 == 214) {
            int var224 = class27.field471.method2265(false);
            int var225 = class27.field471.method2239(arg0 - 1076227960);
            int var226 = class27.field471.method2213((byte) -47);
            if (class73.method596(65535, var225)) {
                class453.method2821(arg0 ^ 0xFFFFFF8E, var226, var224);
            }
            class8.field112 = -1;
            return true;
        } else if (class8.field112 == 222) {
            int var227 = class27.field471.method2265(false);
            int var228 = class27.field471.method2265(false);
            int var229 = class27.field471.method2207(arg0 + 112);
            if (class73.method596(arg0 ^ 0xFFFF, var228)) {
                if (var229 == 2) {
                    class437.method2742(arg0 ^ 0x4);
                }
                class233.field3246 = var227;
                class100.method771(var227, 0);
                class453.method2813((byte) -108, false);
                class293.method1988(class233.field3246);
                for (int var230 = 0; var230 < 100; var230++) {
                    class33.field536[var230] = true;
                }
            }
            class8.field112 = -1;
            return true;
        } else if (class8.field112 == 51) {
            int var231 = class27.field471.method2238(arg0 ^ 0x5E);
            int var232 = class27.field471.method2239(arg0 ^ 0xBFDA1088);
            if (var232 == 65535) {
                var232 = -1;
            }
            class138.method968(var231, var232, (byte) 61);
            class8.field112 = -1;
            return true;
        } else if (class8.field112 == 187) {
            int var233 = class27.field471.method2228(-128);
            if (var233 == 65535) {
                var233 = -1;
            }
            int var234 = class27.field471.method2249(32767);
            int var235 = class27.field471.method2233((byte) 104);
            class211.method1380(var235, var233, -1, var234);
            class8.field112 = -1;
            return true;
        } else if (class8.field112 == 166) {
            if (class20.field342 == 0) {
                class170.field2335 = class244.field3437;
            } else {
                class170.field2335 = class27.field471.method2261((byte) 68);
            }
            class8.field112 = -1;
            return true;
        } else if (class8.field112 == 142) {
            String var236 = class27.field471.method2261((byte) 93);
            int var237 = class27.field471.method2239(arg0 - 1076227960);
            int var238 = class27.field471.method2213((byte) -47);
            if (class73.method596(arg0 ^ 0xFFFF, var237)) {
                class114.method842(1, var238, var236);
            }
            class8.field112 = -1;
            return true;
        } else if (class8.field112 == 66) {
            int var239 = class27.field471.method2239(-1076227960);
            int var240 = class27.field471.method2233((byte) 104);
            int var241 = class27.field471.method2233((byte) 104);
            int var242 = class27.field471.method2233((byte) 104);
            int var243 = class27.field471.method2233((byte) 104);
            int var244 = class27.field471.method2239(-1076227960);
            if (class73.method596(arg0 + 65535, var239)) {
                class403.field5875[var240] = true;
                class439.field6368[var240] = var241;
                class384.field5621[var240] = var242;
                class369.field5443[var240] = var243;
                class110.field1434[var240] = var244;
            }
            class8.field112 = -1;
            return true;
        } else if (class8.field112 == 41) {
            int var245 = class27.field471.method2265(false);
            int var246 = class27.field471.method2256(126);
            if (class73.method596(65535, var245)) {
                class295.method2002(0, var246, 2047, arg0 + 4, 5);
            }
            class8.field112 = -1;
            return true;
        } else if (class8.field112 == 128) {
            int var247 = class27.field471.method2228(arg0 - 128);
            int var248 = class27.field471.method2226(-1);
            if (class73.method596(arg0 ^ 0xFFFF, var247)) {
                class295.method2002(-1, var248, -1, 4, 3);
            }
            class8.field112 = -1;
            return true;
        } else if (class8.field112 == 243) {
            class107.method809(-109);
            class159.method1061((byte) -87);
            class8.field112 = -1;
            class303.field4547 += 32;
            return true;
        } else if (class8.field112 == 130) {
            int var249 = class27.field471.method2264((byte) -71);
            int var250 = class27.field471.method2256(113);
            int var251 = class27.field471.method2265(false);
            int var252 = class27.field471.method2219(arg0 ^ 0xFFFFFFB7);
            if (class73.method596(65535, var251)) {
                class377.method2463(var252, 11, var249, var250);
            }
            class8.field112 = -1;
            return true;
        } else if (class8.field112 == 105) {
            class238.field3333 = class27.field471.method2238(94);
            class233.field3230 = class27.field471.method2233((byte) 104);
            for (class171 var253 = (class171) class267.field3962.method2812(arg0 ^ 0x3D5E); var253 != null; var253 = (class171) class267.field3962.method2819((byte) 105)) {
                int var255 = (int) (var253.field6091 & 0x3FFFL);
                int var256 = (int) (var253.field6091 >> 14 & 0x3FFFL);
                int var257 = (int) (var253.field6091 >> 28 & 0x3L);
                if (class268.field3973 == var257 && class238.field3333 <= var255 && var255 < class238.field3333 + 8 && var256 >= class233.field3230 && (class233.field3230 + 8) > var256) {
                    var253.method2632(true);
                    class11.method90(class268.field3973, var255, var256, (byte) 97);
                }
            }
            for (class316 var254 = (class316) class41.field625.method1575(0); var254 != null; var254 = (class316) class41.field625.method1573((byte) -128)) {
                if (var254.field4628 >= class238.field3333 && class238.field3333 + 8 > var254.field4628 && class233.field3230 <= var254.field4630 && (class233.field3230 + 8) > var254.field4630 && class268.field3973 == var254.field4621) {
                    var254.field4619 = 0;
                }
            }
            class8.field112 = -1;
            return true;
        } else if (class8.field112 == 20) {
            int var258 = class27.field471.method2232(-96);
            int var259 = class27.field471.method2230(1939718792);
            int var260 = class27.field471.method2230(arg0 + 1939718792);
            int var261 = class27.field471.method2265(false);
            if (class73.method596(arg0 + 65535, var261)) {
                class325.method2130((var260 << 16) + var259, var258, arg0 + 14198);
            }
            class8.field112 = -1;
            return true;
        } else if (class8.field112 == 145) {
            byte var262 = class27.field471.method2209(false);
            int var263 = class27.field471.method2265(false);
            class366.method2414(var263, var262, (byte) 105);
            class8.field112 = -1;
            return true;
        } else if (class8.field112 == 217) {
            int var264 = class27.field471.method2239(-1076227960);
            if (class73.method596(65535, var264)) {
                class186.method1240((byte) 88);
            }
            class8.field112 = -1;
            return true;
        } else if (class8.field112 == 221) {
            boolean var265 = class27.field471.method2233((byte) 104) == 1;
            String var266 = class27.field471.method2261((byte) 83);
            String var267 = var266;
            if (var265) {
                var267 = class27.field471.method2261((byte) 125);
            }
            long var268 = class27.field471.method2231(54);
            long var270 = (long) class27.field471.method2239(-1076227960);
            long var272 = (long) class27.field471.method2249(arg0 ^ 0x7FFF);
            int var274 = class27.field471.method2233((byte) 104);
            long var275 = (var270 << 32) + var272;
            boolean var277 = false;
            int var278 = 0;
            while (true) {
                if (var278 >= 100) {
                    if (var274 <= 1) {
                        if (!(!class181.field2419 || class379.field5553) || class406.field5916) {
                            var277 = true;
                        } else if (class322.method2123(var267, (byte) -108)) {
                            var277 = true;
                        }
                    }
                    break;
                }
                if (class240.field3361[var278] == var275) {
                    var277 = true;
                    break;
                }
                var278++;
            }
            if (!var277 && class256.field3745 == 0) {
                class240.field3361[class17.field276] = var275;
                class17.field276 = (class17.field276 + 1) % 100;
                String var279 = class43.method304((byte) 23, class321.method2113((byte) 86, class170.method1140(-106, class27.field471)));
                if (var274 == 2 || var274 == 3) {
                    class237.method1536(class237.method1534(-663656095, var268), var279, "<img=1>" + var266, true, -1, 9, 0, "<img=1>" + var267);
                } else if (var274 == 1) {
                    class237.method1536(class237.method1534(-663656095, var268), var279, "<img=0>" + var266, true, -1, 9, 0, "<img=0>" + var267);
                } else {
                    class237.method1536(class237.method1534(-663656095, var268), var279, var266, true, -1, 9, 0, var267);
                }
            }
            class8.field112 = -1;
            return true;
        } else if (class8.field112 == 206) {
            int var280 = class27.field471.method2256(114);
            int var281 = class27.field471.method2230(1939718792);
            class211.method1378(false, var281, var280);
            class8.field112 = -1;
            return true;
        } else if (class8.field112 == 104) {
            int var282 = class27.field471.method2260(-51);
            int var283 = class27.field471.method2239(-1076227960);
            int var284 = class27.field471.method2226(-1);
            if (class73.method596(arg0 ^ 0xFFFF, var283)) {
                class410.method2591(var284, (byte) 103, var282);
            }
            class8.field112 = -1;
            return true;
        } else if (class8.field112 == 175) {
            int var285 = class27.field471.method2233((byte) 104);
            boolean var286 = (var285 & 0x1) == 1;
            String var287 = class27.field471.method2261((byte) 74);
            String var288 = class27.field471.method2261((byte) 120);
            String var289 = class27.field471.method2261((byte) 68);
            String var290 = class27.field471.method2261((byte) 89);
            if (var286) {
                for (int var291 = 0; var291 < class184.field2479; var291++) {
                    if (class7.field89[var291].equals(var290)) {
                        class373.field5504[var291] = var287;
                        if (var288.equals("")) {
                            class7.field89[var291] = var287;
                        } else {
                            class7.field89[var291] = var288;
                        }
                        class335.field4962[var291] = var289;
                        if (var290.equals("")) {
                            class309.field4577[var291] = var289;
                        } else {
                            class309.field4577[var291] = var290;
                        }
                        break;
                    }
                }
            } else {
                class373.field5504[class184.field2479] = var287;
                if (var288.equals("")) {
                    class7.field89[class184.field2479] = var287;
                } else {
                    class7.field89[class184.field2479] = var288;
                }
                class335.field4962[class184.field2479] = var289;
                if (var290.equals("")) {
                    class309.field4577[class184.field2479] = var289;
                } else {
                    class309.field4577[class184.field2479] = var290;
                }
                class400.field5862[class184.field2479] = class394.method2529(2, var285) == 2;
                class184.field2479++;
            }
            class8.field112 = -1;
            class365.field5399 = class394.field5732;
            return true;
        } else if (class8.field112 == 48) {
            int var292 = class27.field471.method2228(arg0 - 128);
            int var293 = class27.field471.method2232(arg0 + 101);
            class366.method2414(var292, var293, (byte) 28);
            class8.field112 = -1;
            return true;
        } else if (class8.field112 == 168) {
            for (int var294 = 0; var294 < class176.field2382.length; var294++) {
                if (class176.field2382[var294] != null) {
                    class176.field2382[var294].field2148 = -1;
                }
            }
            for (int var295 = 0; var295 < class388.field5670.length; var295++) {
                if (class388.field5670[var295] != null) {
                    class388.field5670[var295].field2148 = -1;
                }
            }
            class8.field112 = -1;
            return true;
        } else if (class8.field112 == 118) {
            int var296 = class27.field471.method2232(arg0 + 98);
            int var297 = class27.field471.method2239(-1076227960);
            if (var296 < -70000) {
                var297 += 32768;
            }
            class248 var298;
            if (var296 < 0) {
                var298 = null;
            } else {
                var298 = class27.method224(65535, var296);
            }
            if (var298 != null) {
                for (int var299 = 0; var299 < var298.field3651.length; var299++) {
                    var298.field3651[var299] = 0;
                    var298.field3495[var299] = 0;
                }
            }
            class309.method2042(0, var297);
            int var300 = class27.field471.method2239(-1076227960);
            for (int var301 = 0; var301 < var300; var301++) {
                int var302 = class27.field471.method2238(106);
                if (var302 == 255) {
                    var302 = class27.field471.method2256(109);
                }
                int var303 = class27.field471.method2228(-128);
                if (var298 != null && var298.field3651.length > var301) {
                    var298.field3651[var301] = var303;
                    var298.field3495[var301] = var302;
                }
                class325.method2129(var302, var297, var303 - 1, -26, var301);
            }
            if (var298 != null) {
                class92.method744(20491, var298);
            }
            class159.method1061((byte) -60);
            class8.field108[class394.method2529(31, class422.field6137++)] = class394.method2529(var297, 32767);
            class8.field112 = -1;
            return true;
        } else if (class8.field112 == 180) {
            int var304 = class27.field471.method2230(1939718792);
            String var305 = class27.field471.method2261((byte) 73);
            int var306 = class27.field471.method2239(-1076227960);
            if (class73.method596(65535, var306)) {
                class100.method770(arg0 ^ 0x28B5, var304, var305);
            }
            class8.field112 = -1;
            return true;
        } else if (class8.field112 == 47) {
            boolean var307 = class27.field471.method2233((byte) 104) == 1;
            String var308 = class27.field471.method2261((byte) 114);
            String var309 = var308;
            if (var307) {
                var309 = class27.field471.method2261((byte) 70);
            }
            long var310 = class27.field471.method2231(35);
            long var312 = (long) class27.field471.method2239(-1076227960);
            long var314 = (long) class27.field471.method2249(arg0 + 32767);
            int var316 = class27.field471.method2233((byte) 104);
            int var317 = class27.field471.method2239(arg0 ^ 0xBFDA1088);
            long var318 = (var312 << 32) + var314;
            boolean var320 = false;
            int var321 = 0;
            while (true) {
                if (var321 >= 100) {
                    if (var316 <= 1 && class322.method2123(var309, (byte) -90)) {
                        var320 = true;
                    }
                    break;
                }
                if (class240.field3361[var321] == var318) {
                    var320 = true;
                    break;
                }
                var321++;
            }
            if (!var320 && class256.field3745 == 0) {
                class240.field3361[class17.field276] = var318;
                class17.field276 = (class17.field276 + 1) % 100;
                String var322 = class208.method1367(arg0 - 10186, var317).method796(class27.field471, -16981);
                if (var316 == 2) {
                    class237.method1536(class237.method1534(-663656095, var310), var322, "<img=1>" + var308, true, var317, 20, 0, "<img=1>" + var309);
                } else if (var316 == 1) {
                    class237.method1536(class237.method1534(-663656095, var310), var322, "<img=0>" + var308, true, var317, 20, 0, "<img=0>" + var309);
                } else {
                    class237.method1536(class237.method1534(arg0 ^ 0xD8716961, var310), var322, var308, true, var317, 20, 0, var309);
                }
            }
            class8.field112 = -1;
            return true;
        } else if (class8.field112 == 205) {
            class233.field3230 = class27.field471.method2262(true);
            class238.field3333 = class27.field471.method2262(true);
            while (class20.field342 > class27.field471.field5049) {
                class8.field112 = class27.field471.method2233((byte) 104);
                class104.method784((byte) -74);
            }
            class8.field112 = -1;
            return true;
        } else if (class8.field112 == 9) {
            int var323 = class27.field471.method2226(-1);
            int var324 = var323 >> 28 & 0x3;
            int var325 = (var323 & 0xFFFFB7C) >> 14;
            int var326 = var323 & 0x3FFF;
            int var327 = class27.field471.method2238(121);
            int var328 = var327 >> 2;
            int var329 = var327 & 0x3;
            int var330 = class162.field2141[var328];
            int var331 = class27.field471.method2239(-1076227960);
            int var332 = var325 - class236.field3292;
            if (var331 == 65535) {
                var331 = -1;
            }
            int var333 = var326 - class90.field1223;
            class100.method769(var330, var324, var329, var331, var332, (byte) 45, var328, var333);
            class8.field112 = -1;
            return true;
        } else if (class8.field112 == 10) {
            class163.field2223 = class27.field471.method2233((byte) 104);
            class8.field112 = -1;
            return true;
        } else if (class8.field112 == 141) {
            int var334 = class27.field471.method2232(114);
            int var335 = class27.field471.method2239(-1076227960);
            if (var334 < -70000) {
                var335 += 32768;
            }
            class248 var336;
            if (var334 >= 0) {
                var336 = class27.method224(65535, var334);
            } else {
                var336 = null;
            }
            while (class27.field471.field5049 < class20.field342) {
                int var337 = class27.field471.method2223(-1);
                int var338 = class27.field471.method2239(-1076227960);
                int var339 = 0;
                if (var338 != 0) {
                    var339 = class27.field471.method2233((byte) 104);
                    if (var339 == 255) {
                        var339 = class27.field471.method2232(113);
                    }
                }
                if (var336 != null && var337 >= 0 && var337 < var336.field3651.length) {
                    var336.field3651[var337] = var338;
                    var336.field3495[var337] = var339;
                }
                class325.method2129(var339, var335, var338 - 1, 99, var337);
            }
            if (var336 != null) {
                class92.method744(20491, var336);
            }
            class159.method1061((byte) -49);
            class8.field108[class394.method2529(31, class422.field6137++)] = class394.method2529(32767, var335);
            class8.field112 = -1;
            return true;
        } else if (class8.field112 == 3) {
            class159.method1061((byte) -92);
            int var340 = class27.field471.method2213((byte) -47);
            int var341 = class27.field471.method2238(114);
            int var342 = class27.field471.method2262(true);
            class100.field1324[var341] = var340;
            class337.field4977[var341] = var342;
            class60.field922[var341] = 1;
            int var343 = class389.field5697[var341] - 1;
            for (int var344 = 0; var344 < var343; var344++) {
                if (var340 >= class228.field3146[var344]) {
                    class60.field922[var341] = var344 + 2;
                }
            }
            class238.field3325[class394.method2529(class57.field861++, 31)] = var341;
            class8.field112 = -1;
            return true;
        } else if (class8.field112 == 98) {
            String var345 = class27.field471.method2261((byte) 70);
            int var346 = class27.field471.method2262(true);
            int var347 = class27.field471.method2265(false);
            if (var347 == 65535) {
                var347 = -1;
            }
            int var348 = class27.field471.method2207(117);
            if (var346 >= 1 && var346 <= 8) {
                if (var345.equalsIgnoreCase("null")) {
                    var345 = null;
                }
                class184.field2473[var346 - 1] = var345;
                class170.field2305[var346 - 1] = var347;
                class116.field1507[var346 - 1] = var348 == 0;
            }
            class8.field112 = -1;
            return true;
        } else if (class8.field112 == 149) {
            class21.field383 = class27.field471.method2265(false) * 30;
            class92.field1265 = class394.field5732;
            class8.field112 = -1;
            return true;
        } else if (class8.field112 == 213) {
            int var349 = class27.field471.method2239(-1076227960);
            int var350 = class27.field471.method2232(102);
            if (class73.method596(65535, var349)) {
                class28 var351 = (class28) class242.field3402.method2826(false, (long) var350);
                if (var351 != null) {
                    class93.method751(var351, true, (byte) -96, false);
                }
                if (class415.field6015 != null) {
                    class92.method744(20491, class415.field6015);
                    class415.field6015 = null;
                }
            }
            class8.field112 = -1;
            return true;
        } else if (class8.field112 == 163) {
            int var352 = class27.field471.method2239(-1076227960);
            int var353 = class27.field471.method2239(arg0 - 1076227960);
            int var354 = class27.field471.method2239(-1076227960);
            int var355 = class27.field471.method2239(-1076227960);
            if (class73.method596(65535, var352) && class4.field71[var353] != null) {
                for (int var356 = var354; var356 < var355; var356++) {
                    int var357 = class27.field471.method2249(arg0 + 32767);
                    if (class4.field71[var353].length > var356 && class4.field71[var353][var356] != null) {
                        class4.field71[var353][var356].field3565 = var357;
                    }
                }
            }
            class8.field112 = -1;
            return true;
        } else if (class8.field112 == 57) {
            int var358 = class27.field471.method2207(-25);
            int var359 = class27.field471.method2239(arg0 - 1076227960);
            int var360 = class27.field471.method2213((byte) -47);
            int var361 = class27.field471.method2228(-128);
            if (class73.method596(arg0 + 65535, var359)) {
                class28 var362 = (class28) class242.field3402.method2826(false, (long) var360);
                if (var362 != null) {
                    class93.method751(var362, var362.field482 != var361, (byte) -70, false);
                }
                class297.method2011(false, var358, var360, (byte) -120, var361);
            }
            class8.field112 = -1;
            return true;
        } else if (class8.field112 == 86) {
            int var363 = class27.field471.method2207(-34);
            int var364 = class27.field471.method2238(126);
            int var365 = class27.field471.method2233((byte) 104);
            class268.field3973 = var363 >> 1;
            class383.field5609.method2076(var364, 40, var365, class268.field3973, (var363 & 0x1) == 1);
            class8.field112 = -1;
            return true;
        } else if (class8.field112 == 125) {
            class430.method2685(false, false);
            class8.field112 = -1;
            return true;
        } else if (class8.field112 == 115) {
            int var366 = class27.field471.method2232(-54);
            int var367 = class27.field471.method2239(arg0 - 1076227960);
            int var368 = class27.field471.method2230(arg0 + 1939718792);
            if (class73.method596(65535, var367)) {
                class106.method803(14, var368, var366);
            }
            class8.field112 = -1;
            return true;
        } else if (class8.field112 == 197) {
            class387.field5666 = class27.field471.method2233((byte) 104);
            class25.field451 = class27.field471.method2233((byte) 104);
            class421.field6115 = class27.field471.method2233((byte) 104);
            class8.field112 = -1;
            return true;
        } else if (class8.field112 == 251) {
            class159.method1061((byte) -122);
            class382.field5593 = class27.field471.method2233((byte) 104);
            class8.field112 = -1;
            class92.field1265 = class394.field5732;
            return true;
        } else if (class8.field112 == 173) {
            int var369 = class27.field471.method2256(127);
            int var370 = class27.field471.method2226(-1);
            int var371 = class27.field471.method2265(false);
            int var372 = class27.field471.method2230(1939718792);
            if (var372 == 65535) {
                var372 = -1;
            }
            if (class73.method596(65535, var371)) {
                class248 var373 = class27.method224(arg0 ^ 0xFFFF, var370);
                if (var373.field3537) {
                    class95.method761(var369, -126, var372, var370);
                    class159 var375 = class129.method915(126, var372);
                    class265.method1776(var375.field2056, var370, var375.field2011, var375.field2074, 8);
                    class347.method2296(var370, 2, var375.field2023, var375.field2013, var375.field2020);
                } else if (var372 == -1) {
                    var373.field3535 = 0;
                    class8.field112 = -1;
                    return true;
                } else {
                    class159 var374 = class129.method915(arg0 ^ 0x7F, var372);
                    var373.field3535 = 4;
                    var373.field3638 = var372;
                    var373.field3548 = var374.field2074;
                    var373.field3523 = var374.field2056 * 100 / var369;
                    var373.field3607 = var374.field2011;
                    class92.method744(20491, var373);
                }
            }
            class8.field112 = -1;
            return true;
        } else if (class8.field112 == 103) {
            class430.method2685(false, true);
            class8.field112 = -1;
            return true;
        } else if (class8.field112 == 54) {
            class158.method1050(class27.field471.method2261((byte) 80), (byte) -20);
            class8.field112 = -1;
            return true;
        } else if (class8.field112 == 120) {
            String var376 = class27.field471.method2261((byte) 121);
            String var377 = class43.method304((byte) 23, class321.method2113((byte) 86, class170.method1140(97, class27.field471)));
            class20.method181(0, 6, var377, var376, 9231, var376);
            class8.field112 = -1;
            return true;
        } else if (class8.field112 == 220) {
            if (class211.field2872 != null) {
                class246.method1611(-43, false, class195.field2700, -1, -1);
            }
            byte[] var378 = new byte[class20.field342];
            class27.field471.method1827(var378, 0, (byte) -16, class20.field342);
            String var379 = class338.method2200(true, 0, var378, class20.field342);
            class360.method2370(class397.field5796 == 1, class63.field948, var379, true, (byte) 45);
            class8.field112 = -1;
            return true;
        } else {
            class266.method1780(1, "T1 - " + class8.field112 + "," + class86.field1199 + "," + class402.field5870 + " - " + class20.field342, (Throwable) null);
            class163.method1101(0);
            return true;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(ZLtj;)V")
    public static final void method1122(boolean arg0, class298 arg1) {
        field2268++;
        int var2 = class184.field2469;
        int var3 = class341.field5066;
        int var4 = class389.field5694;
        int var5 = class145.field1858;
        int var6 = -10660793;
        arg1.method2023(var5, var2, var3, -11682, var4, var6);
        arg1.method2023(16, var2 + 1, var3 + 1, -11682, var4 - 2, -16777216);
        if (!arg0) {
            return;
        }
        arg1.method2014(var3 + 18, 0, -16777216, var2 + 1, var4 + -2, var5 - 19);
        class199.field2756.method907(class337.field4983, false, -1, var3 + 14, var6, var2 + 3);
        int var7 = class277.field4060;
        int var8 = class217.field3032;
        int var9 = 0;
        for (class138 var10 = (class138) class186.field2547.method1575(0); var10 != null; var10 = (class138) class186.field2547.method1573((byte) -128)) {
            int var11 = (class402.field5874 - var9 - 1) * 16 + var3 + 31;
            short var12 = -1;
            if (var2 < var7 && (var2 + var4) > var7 && var8 > (var11 - 13) && var8 < (var11 + 3)) {
                var12 = -256;
            }
            int[] var13 = null;
            if (class267.method1784(var10.field1777, (byte) -99)) {
                var13 = class129.method915(127, (int) var10.field1780).field2026;
            } else if (class386.method2504((byte) 112, var10.field1777)) {
                class163 var14 = class388.field5670[(int) var10.field1780];
                if (var14 != null) {
                    var13 = var14.field2206.field2596;
                }
            } else if (class246.method1608(-63, var10.field1777)) {
                if (var10.field1777 == 1011) {
                    var13 = class372.method2447((int) var10.field1780, (byte) 67).field2911;
                } else {
                    var13 = class372.method2447((int) (var10.field1780 >>> 32 & 0x7FFFFFFFL), (byte) -96).field2911;
                }
            }
            String var15 = class84.method687(var10, -1);
            if (var13 != null) {
                var15 = var15 + class368.method2426(var13, 68);
            }
            class199.field2756.method904(var2 + 3, class424.field6180, 0, 108, var12, class407.field5923, var11, var15);
            var9++;
        }
        class51.method369(class389.field5694, (byte) -108, class341.field5066, class184.field2469, class145.field1858);
    }

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "(Z)V")
    public static void method1123(boolean arg0) {
        field2270 = null;
        field2272 = null;
        if (arg0) {
            field2261 = 43;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(III)Z")
    public final boolean method1124(int arg0, int arg1, int arg2) {
        field2264++;
        if (arg2 >= this.field2257 && this.field2267 >= arg2 && this.field2259 <= arg1 && arg1 <= this.field2263) {
            return true;
        } else {
            if (arg0 != -1) {
                this.field2263 = 27;
            }
            return this.field2253 <= arg2 && this.field2269 >= arg2 && arg1 >= this.field2256 && arg1 <= this.field2265;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(B)V")
    public static final void method1125(byte arg0) {
        if (arg0 != -21) {
            field2272 = null;
        }
        for (class411 var1 = (class411) class309.field4576.method54((byte) 18); var1 != null; var1 = (class411) class309.field4576.method53((byte) 124)) {
            var1.method2606();
        }
        field2255++;
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(Lbd;)V")
    public class167(class27 arg0) {
        this.field2260 = arg0;
    }
}
