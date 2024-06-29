import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public abstract class class160 extends class166 {

    @OriginalMember(owner = "client!oj", name = "E", descriptor = "[Loj;")
    public class160[] field2489;

    @OriginalMember(owner = "client!oj", name = "J", descriptor = "Z")
    public boolean field2494;

    @OriginalMember(owner = "client!oj", name = "v", descriptor = "I")
    public static int field2480 = 0;

    @OriginalMember(owner = "client!oj", name = "s", descriptor = "I")
    public static int field2477 = -1;

    @OriginalMember(owner = "client!oj", name = "A", descriptor = "I")
    public static int field2485 = 0;

    @OriginalMember(owner = "client!oj", name = "M", descriptor = "Ljava/lang/String;")
    public static String field2497 = "Prepared sound engine";

    @OriginalMember(owner = "client!oj", name = "q", descriptor = "I")
    public static int field2475;

    @OriginalMember(owner = "client!oj", name = "t", descriptor = "I")
    public static int field2478;

    @OriginalMember(owner = "client!oj", name = "u", descriptor = "I")
    public static int field2479;

    @OriginalMember(owner = "client!oj", name = "x", descriptor = "I")
    public static int field2482;

    @OriginalMember(owner = "client!oj", name = "y", descriptor = "I")
    public static int field2483;

    @OriginalMember(owner = "client!oj", name = "z", descriptor = "I")
    public static int field2484;

    @OriginalMember(owner = "client!oj", name = "B", descriptor = "I")
    public static int field2486;

    @OriginalMember(owner = "client!oj", name = "C", descriptor = "I")
    public static int field2487;

    @OriginalMember(owner = "client!oj", name = "F", descriptor = "I")
    public static int field2490;

    @OriginalMember(owner = "client!oj", name = "G", descriptor = "I")
    public static int field2491;

    @OriginalMember(owner = "client!oj", name = "H", descriptor = "I")
    public int field2492;

    @OriginalMember(owner = "client!oj", name = "I", descriptor = "I")
    public static int field2493;

    @OriginalMember(owner = "client!oj", name = "K", descriptor = "I")
    public static int field2495;

    @OriginalMember(owner = "client!oj", name = "L", descriptor = "I")
    public static int field2496;

    @OriginalMember(owner = "client!oj", name = "N", descriptor = "I")
    public static int field2498;

    @OriginalMember(owner = "client!oj", name = "P", descriptor = "I")
    public static int field2500;

    @OriginalMember(owner = "client!oj", name = "Q", descriptor = "I")
    public static int field2501;

    @OriginalMember(owner = "client!oj", name = "r", descriptor = "Lu;")
    public class121 field2476;

    @OriginalMember(owner = "client!oj", name = "O", descriptor = "Lac;")
    public static class137 field2499;

    @OriginalMember(owner = "client!oj", name = "w", descriptor = "Lhc;")
    public static class235 field2481;

    @OriginalMember(owner = "client!oj", name = "D", descriptor = "Lvd;")
    public class4 field2488;

    @OriginalMember(owner = "client!oj", name = "R", descriptor = "[[[B")
    public static byte[][][] field2502;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(III)V")
    public static final void method1076(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class217.field3352; var3++) {
            for (int var4 = 0; var4 < class142.field2166; var4++) {
                for (int var5 = 0; var5 < class280.field4424; var5++) {
                    class6 var6 = class269.field4298[var3][var4][var5];
                    if (var6 != null) {
                        class7 var7 = var6.field147;
                        if (var7 != null && var7.field149.method315()) {
                            class110.method784(var7.field149, var3, var4, var5, 1, 1);
                            if (var7.field156 != null && var7.field156.method315()) {
                                class110.method784(var7.field156, var3, var4, var5, 1, 1);
                                var7.field149.method319(var7.field156, 0, 0, 0, false);
                                var7.field156 = var7.field156.method320(arg0, arg1, arg2);
                            }
                            var7.field149 = var7.field149.method320(arg0, arg1, arg2);
                        }
                        for (int var8 = 0; var8 < var6.field125; var8++) {
                            class293 var10 = var6.field134[var8];
                            if (var10 != null && var10.field4619.method315()) {
                                class110.method784(var10.field4619, var3, var4, var5, var10.field4623 + 1 - var10.field4616, var10.field4615 - var10.field4612 + 1);
                                var10.field4619 = var10.field4619.method320(arg0, arg1, arg2);
                            }
                        }
                        class140 var9 = var6.field144;
                        if (var9 != null && var9.field2137.method315()) {
                            class161.method1095(var9.field2137, var3, var4, var5);
                            var9.field2137 = var9.field2137.method320(arg0, arg1, arg2);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lai;II)V")
    public void method2(class88 arg0, int arg1, int arg2) {
        field2490++;
        if (arg1 <= 11) {
            this.field2488 = null;
        }
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(II)Z")
    public static final boolean method1077(int arg0, int arg1) {
        field2482++;
        if (class43.field621 == arg0) {
            return false;
        }
        class33.field500 = new int[4][13][13];
        class245.field3985 = new int[104][104];
        for (int var2 = 0; var2 < 4; var2++) {
            class176.field2765[var2] = new class47(104, 104);
        }
        class30.field441 = new byte[4][104][104];
        class181.field2827 = new byte[4][104][104];
        if (arg1 != -1) {
            field2480 = 14;
        }
        class222.field3411 = new class180[4][104][104];
        class43.field621 = arg0;
        return true;
    }

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "(B)V")
    public static void method1078(byte arg0) {
        field2481 = null;
        field2497 = null;
        field2502 = null;
        field2499 = null;
        if (arg0 != 105) {
            method1077(-58, 40);
        }
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(III)[[I")
    public final int[][] method1079(int arg0, int arg1, int arg2) {
        if (arg1 <= 85) {
            return null;
        }
        field2479++;
        if (this.field2489[arg2].field2494) {
            int[] var4 = this.field2489[arg2].method1(arg0, (byte) 57);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field2489[arg2].method3(arg0, true);
        }
    }

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "(II)Z")
    public static final boolean method1080(int arg0, int arg1) {
        byte var2 = 0;
        field2486++;
        byte var3 = 0;
        if (class97.field1625 == null) {
            if (class214.field3334 == null) {
                class97.field1625 = new class276(512, 512);
            } else {
                class97.field1625 = (class276) class214.field3334;
            }
            int[] var4 = class97.field1625.field4393;
            int var5 = var4.length;
            for (int var6 = 0; var6 < var5; var6++) {
                var4[var6] = 1;
            }
            for (int var7 = var3 + 1; var7 < 104 - var3 - 1; var7++) {
                int var21 = ((var3 + 103 - var7) * 512 * 4) + 24628;
                for (int var22 = var2 + 1; var22 < (104 - var2 - 1); var22++) {
                    if ((class181.field2827[arg0][var22][var7] & 0x18) == 0) {
                        class137.method933(var4, var21, 512, arg0, var22, var7);
                    }
                    if (arg0 < 3 && (class181.field2827[arg0 + 1][var22][var7] & 0x8) != 0) {
                        class137.method933(var4, var21, 512, arg0 + 1, var22, var7);
                    }
                    var21 += 4;
                }
            }
            class238.field3870 = 0;
            for (int var8 = 0; var8 < 104; var8++) {
                for (int var9 = 0; var9 < 104; var9++) {
                    long var10 = class243.method1680(class240.field3892, var8 + var2, var3 + var9);
                    if (var10 != 0L) {
                        class193 var12 = class69.method501(0, Integer.MAX_VALUE & (int) (var10 >>> 32));
                        int var13 = var12.field3040;
                        if (var12.field2997 != null) {
                            for (int var14 = 0; var14 < var12.field2997.length; var14++) {
                                if (var12.field2997[var14] != -1) {
                                    class193 var15 = class69.method501(0, var12.field2997[var14]);
                                    if (var15.field3040 >= 0) {
                                        var13 = var15.field3040;
                                        break;
                                    }
                                }
                            }
                        }
                        if (var13 >= 0) {
                            int var16 = var2 + var8;
                            int var17 = var9 + var3;
                            if (var13 != 22 && var13 != 29 && var13 != 34 && var13 != 36 && var13 != 46 && var13 != 47 && var13 != 48) {
                                int[][] var18 = class176.field2765[class240.field3892].field673;
                                for (int var19 = 0; var19 < 10; var19++) {
                                    int var20 = (int) (Math.random() * 4.0D);
                                    if (var20 == 0 && var16 > 0 && (var8 - 3) < var16 && (var18[var16 - 1][var17] & 0x2C0108) == 0) {
                                        var16--;
                                    }
                                    if (var20 == 1 && var16 < 103 && (var8 + 3) > var16 && (var18[var16 + 1][var17] & 0x2C0180) == 0) {
                                        var16++;
                                    }
                                    if (var20 == 2 && var17 > 0 && var9 - 3 < var17 && (var18[var16][var17 - 1] & 0x2C0102) == 0) {
                                        var17--;
                                    }
                                    if (var20 == 3 && var17 < 103 && var17 < var9 + 3 && (var18[var16][var17 + 1] & 0x2C0120) == 0) {
                                        var17++;
                                    }
                                }
                            }
                            class115.field1881[class238.field3870] = var12.field3024;
                            class102.field1712[class238.field3870] = var16 - var2;
                            class194.field3075[class238.field3870] = var17 - var3;
                            class238.field3870++;
                        }
                    }
                }
            }
        }
        int var23 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 228 << 16) + (-10 + 238 + (int) (Math.random() * 20.0D) << 8) + 228;
        class97.field1625.method1863();
        int var24 = (int) (Math.random() * 20.0D) + 228 << 16;
        for (int var25 = 1; var25 < 103; var25++) {
            for (int var26 = 1; var26 < 103; var26++) {
                if ((class181.field2827[arg0][var2 + var26][var3 + var25] & 0x18) == 0 && !class291.method1950(arg0, var26, var2, var24, -27084, var3, var23, var25)) {
                    class249.field4023.method176((byte) 64);
                    return false;
                }
                if (arg0 < 3 && (class181.field2827[arg0 + 1][var2 + var26][var3 + var25] & 0x8) != 0 && !class291.method1950(arg0 + 1, var26, var2, var24, -27084, var3, var23, var25)) {
                    class249.field4023.method176((byte) 64);
                    return false;
                }
            }
        }
        class214.field3334 = class97.field1625;
        class249.field4023.method176((byte) 64);
        if (arg1 != 4154) {
            field2477 = -9;
        }
        class97.field1625 = null;
        return true;
    }

    @OriginalMember(owner = "client!oj", name = "e", descriptor = "(B)V")
    public static final void method1081(byte arg0) {
        field2478++;
        if (class66.field1105 == 176) {
            int var1 = class236.field3814.method633(119);
            int var2 = var1 >> 2;
            int var3 = var1 & 0x3;
            int var4 = class51.field745[var2];
            int var5 = class236.field3814.method653(false);
            int var6 = ((var5 & 0x7C) >> 4) + class181.field2830;
            int var7 = (var5 & 0x7) + class147.field2333;
            if (var6 >= 0 && var7 >= 0 && var6 < 104 && var7 < 104) {
                class43.method317(class240.field3892, var6, -1, var3, -1, -1, var2, var7, 0, var4);
            }
        } else if (class66.field1105 == 88) {
            int var8 = class236.field3814.method633(83);
            int var9 = (var8 >> 4 & 0x7) + class181.field2830;
            int var10 = class147.field2333 + (var8 & 0x7);
            int var11 = class236.field3814.method645(11596);
            int var12 = class236.field3814.method633(48);
            if (var11 == 65535) {
                var11 = -1;
            }
            int var13 = (var12 & 0xFA) >> 4;
            int var14 = var12 & 0x7;
            int var15 = class236.field3814.method633(104);
            int var16 = class236.field3814.method633(60);
            if (var9 >= 0 && var10 >= 0 && var9 < 104 && var10 < 104) {
                int var17 = var13 + 1;
                if (var9 - var17 <= class283.field4473.field2268[0] && class283.field4473.field2268[0] <= (var9 + var17) && class283.field4473.field2271[0] >= var10 - var17 && class283.field4473.field2271[0] <= var10 + var17 && class86.field1445 != 0 && var14 > 0 && class112.field1841 < 50 && var11 != -1) {
                    class122.field1956[class112.field1841] = var11;
                    class131.field2060[class112.field1841] = var14;
                    class165.field2591[class112.field1841] = var15;
                    class250.field4031[class112.field1841] = null;
                    class121.field1944[class112.field1841] = (var10 << 8) + ((var9 << 16) + var13);
                    class296.field4682[class112.field1841] = var16;
                    class112.field1841++;
                }
            }
        } else if (class66.field1105 == 239) {
            int var18 = class236.field3814.method653(false);
            int var19 = var18 & 0x3;
            int var20 = var18 >> 2;
            int var21 = class51.field745[var20];
            int var22 = class236.field3814.method682(-23595);
            int var23 = class181.field2830 + (var22 >> 4 & 0x7);
            int var24 = (var22 & 0x7) + class147.field2333;
            int var25 = class236.field3814.method679((byte) -127);
            if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104) {
                class43.method317(class240.field3892, var23, -1, var19, -1, var25, var20, var24, 0, var21);
            }
        } else if (class66.field1105 == 250) {
            int var26 = class236.field3814.method645(11596);
            int var27 = class236.field3814.method633(71);
            int var28 = class147.field2333 + (var27 & 0x7);
            int var29 = ((var27 & 0x79) >> 4) + class181.field2830;
            if (var29 >= 0 && var28 >= 0 && var29 < 104 && var28 < 104) {
                class180 var30 = class222.field3411[class240.field3892][var29][var28];
                if (var30 != null) {
                    for (class258 var31 = (class258) var30.method1221(124); var31 != null; var31 = (class258) var30.method1227(-10626)) {
                        if ((var26 & 0x7FFF) == var31.field4119.field1746) {
                            var31.method1123(0);
                            break;
                        }
                    }
                    if (var30.method1221(125) == null) {
                        class222.field3411[class240.field3892][var29][var28] = null;
                    }
                    class113.method803(var28, var29, 103);
                }
            }
        } else if (class66.field1105 == 52) {
            int var32 = class236.field3814.method633(91);
            int var33 = class181.field2830 + (var32 >> 4 & 0x7);
            int var34 = class147.field2333 + (var32 & 0x7);
            int var35 = class236.field3814.method645(11596);
            int var36 = class236.field3814.method645(11596);
            int var37 = class236.field3814.method645(11596);
            if (var33 >= 0 && var34 >= 0 && var33 < 104 && var34 < 104) {
                class180 var38 = class222.field3411[class240.field3892][var33][var34];
                if (var38 != null) {
                    for (class258 var39 = (class258) var38.method1221(119); var39 != null; var39 = (class258) var38.method1227(-10626)) {
                        class105 var40 = var39.field4119;
                        if ((var35 & 0x7FFF) == var40.field1746 && var40.field1741 == var36) {
                            var40.field1741 = var37;
                            break;
                        }
                    }
                    class113.method803(var34, var33, 108);
                }
            }
        } else {
            if (class66.field1105 == 20) {
                int var41 = class236.field3814.method682(-23595);
                int var42 = var41 >> 2;
                int var43 = var41 & 0x3;
                byte var44 = class236.field3814.method646(17366);
                byte var45 = class236.field3814.method630(255);
                byte var46 = class236.field3814.method636(128);
                byte var47 = class236.field3814.method646(17366);
                int var48 = class236.field3814.method633(82);
                int var49 = ((var48 & 0x7C) >> 4) + class181.field2830;
                int var50 = (var48 & 0x7) + class147.field2333;
                int var51 = class236.field3814.method668((byte) 127);
                int var52 = class236.field3814.method645(11596);
                int var53 = class236.field3814.method677((byte) -100);
                int var54 = class236.field3814.method670(-2);
                class49.method361(var51, var53, var47, var54, var44, var45, var46, var50, var52, var49, var42, var43, -98);
            }
            if (class66.field1105 == 215) {
                int var55 = class236.field3814.method677((byte) -100);
                int var56 = class236.field3814.method633(126);
                int var57 = class147.field2333 + (var56 & 0x7);
                int var58 = ((var56 & 0x75) >> 4) + class181.field2830;
                int var59 = class236.field3814.method679((byte) 107);
                int var60 = class236.field3814.method677((byte) -100);
                if (var58 >= 0 && var57 >= 0 && var58 < 104 && var57 < 104 && class116.field1897 != var55) {
                    class105 var61 = new class105();
                    var61.field1746 = var60;
                    var61.field1741 = var59;
                    if (class222.field3411[class240.field3892][var58][var57] == null) {
                        class222.field3411[class240.field3892][var58][var57] = new class180();
                    }
                    class222.field3411[class240.field3892][var58][var57].method1219(false, new class258(var61));
                    class113.method803(var57, var58, 104);
                }
            } else if (class66.field1105 == 92) {
                int var62 = class236.field3814.method633(114);
                int var63 = (var62 & 0xF) + class147.field2333 * 2;
                int var64 = (var62 >> 4 & 0xF) + class181.field2830 * 2;
                int var65 = var64 + class236.field3814.method656(-252);
                int var66 = class236.field3814.method656(-252) + var63;
                int var67 = class236.field3814.method649(-2);
                int var68 = class236.field3814.method649(-2);
                int var69 = class236.field3814.method645(11596);
                int var70 = class236.field3814.method656(-252);
                int var71 = class236.field3814.method633(64) * 4;
                int var72 = class236.field3814.method645(11596);
                int var73 = class236.field3814.method645(11596);
                int var74 = class236.field3814.method633(71);
                int var75 = class236.field3814.method633(93);
                if (var74 == 255) {
                    var74 = -1;
                }
                if (var64 >= 0 && var63 >= 0 && var64 < 208 && var63 < 208 && var65 >= 0 && var66 >= 0 && var65 < 208 && var66 < 208 && var69 != 65535) {
                    int var76 = var66 * 64;
                    int var77 = var65 * 64;
                    int var78 = var63 * 64;
                    int var79 = var64 * 64;
                    if (var67 != 0) {
                        int var82;
                        class144 var83;
                        if (var67 < 0) {
                            int var80 = -var67 - 1;
                            int var81 = var80 & 0x7FF;
                            var82 = var80 >> 11 & 0xF;
                            if (class116.field1897 == var81) {
                                var83 = class283.field4473;
                            } else {
                                var83 = class210.field3267[var81];
                            }
                        } else {
                            int var84 = var67 - 1;
                            int var85 = var84 & 0x7FF;
                            var83 = class255.field4082[var85];
                            var82 = (var84 & 0x7A99) >> 11;
                        }
                        if (var83 != null) {
                            class283 var86 = var83.method972((byte) -71);
                            if (var86.field4474 != null && var86.field4474[var82] != null) {
                                int var87 = var86.field4474[var82][0];
                                var70 -= var86.field4474[var82][1];
                                int var88 = class195.field3091[var83.field2275];
                                int var89 = class195.field3089[var83.field2275];
                                int var90 = var86.field4474[var82][2];
                                int var91 = var87 * var89 + var88 * var90 >> 16;
                                int var92 = var89 * var90 - (var87 * var88) >> 16;
                                var78 += var92;
                                var79 += var91;
                            }
                        }
                    }
                    class52 var94 = new class52(var69, class240.field3892, var79, var78, class34.method269(class240.field3892, var78, var79, 103) - var70, class192.field2978 + var72, class192.field2978 + var73, var74, var75, var68, var71);
                    var94.method387(var72 + class192.field2978, var77, var76, class34.method269(class240.field3892, var76, var77, 103) - var71, 58);
                    class240.field3899.method1219(false, new class61(var94));
                }
            } else if (class66.field1105 == 121) {
                int var95 = class236.field3814.method633(117);
                int var96 = (var95 & 0xF) + class147.field2333 * 2;
                int var97 = (var95 >> 4 & 0xF) + class181.field2830 * 2;
                int var98 = var97 + class236.field3814.method656(-252);
                int var99 = var96 + class236.field3814.method656(-252);
                int var100 = class236.field3814.method649(-2);
                int var101 = class236.field3814.method645(11596);
                int var102 = class236.field3814.method633(83) * 4;
                int var103 = class236.field3814.method633(95) * 4;
                int var104 = class236.field3814.method645(11596);
                int var105 = class236.field3814.method645(11596);
                int var106 = class236.field3814.method633(64);
                if (var106 == 255) {
                    var106 = -1;
                }
                int var107 = class236.field3814.method633(50);
                if (var97 >= 0 && var96 >= 0 && var97 < 208 && var96 < 208 && var98 >= 0 && var99 >= 0 && var98 < 208 && var99 < 208 && var101 != 65535) {
                    int var108 = var98 * 64;
                    int var109 = var97 * 64;
                    int var110 = var99 * 64;
                    int var111 = var96 * 64;
                    class52 var112 = new class52(var101, class240.field3892, var109, var111, class34.method269(class240.field3892, var111, var109, 103) - var102, var104 - -class192.field2978, class192.field2978 + var105, var106, var107, var100, var103);
                    var112.method387(class192.field2978 + var104, var108, var110, class34.method269(class240.field3892, var110, var108, 103) - var103, 65);
                    class240.field3899.method1219(false, new class61(var112));
                }
            } else if (class66.field1105 == 104) {
                int var113 = class236.field3814.method633(111);
                int var114 = class181.field2830 + (var113 >> 4 & 0x7);
                int var115 = (var113 & 0x7) + class147.field2333;
                int var116 = class236.field3814.method656(-252) + var114;
                int var117 = var115 + class236.field3814.method656(-252);
                int var118 = class236.field3814.method649(-2);
                int var119 = class236.field3814.method645(11596);
                int var120 = class236.field3814.method633(89) * 4;
                int var121 = class236.field3814.method633(111) * 4;
                int var122 = class236.field3814.method645(11596);
                int var123 = class236.field3814.method645(11596);
                int var124 = class236.field3814.method633(105);
                int var125 = class236.field3814.method633(90);
                if (var124 == 255) {
                    var124 = -1;
                }
                if (var114 >= 0 && var115 >= 0 && var114 < 104 && var115 < 104 && var116 >= 0 && var117 >= 0 && var116 < 104 && var117 < 104 && var119 != 65535) {
                    int var126 = var114 * 128 + 64;
                    int var127 = var115 * 128 + 64;
                    int var128 = var117 * 128 + 64;
                    int var129 = var116 * 128 + 64;
                    class52 var130 = new class52(var119, class240.field3892, var126, var127, class34.method269(class240.field3892, var127, var126, 103) - var120, var122 - -class192.field2978, var123 + class192.field2978, var124, var125, var118, var121);
                    var130.method387(class192.field2978 + var122, var129, var128, class34.method269(class240.field3892, var128, var129, 103) - var121, 108);
                    class240.field3899.method1219(false, new class61(var130));
                }
            } else if (class66.field1105 == 227) {
                int var131 = class236.field3814.method633(109);
                int var132 = ((var131 & 0x7C) >> 4) + class181.field2830;
                int var133 = (var131 & 0x7) + class147.field2333;
                int var134 = class236.field3814.method645(11596);
                int var135 = class236.field3814.method633(94);
                int var136 = class236.field3814.method645(11596);
                if (var132 >= 0 && var133 >= 0 && var132 < 104 && var133 < 104) {
                    int var137 = var132 * 128 + 64;
                    int var138 = var133 * 128 + 64;
                    class214 var139 = new class214(var134, class240.field3892, var137, var138, class34.method269(class240.field3892, var138, var137, 103) - var135, var136, class192.field2978);
                    class104.field1734.method1219(false, new class183(var139));
                }
            } else {
                int var140 = -22 / ((-arg0 - 68) / 54);
                if (class66.field1105 == 177) {
                    int var141 = class236.field3814.method670(-2);
                    int var142 = class236.field3814.method627(39);
                    int var143 = (var142 & 0x7) + class147.field2333;
                    int var144 = ((var142 & 0x74) >> 4) + class181.field2830;
                    int var145 = class236.field3814.method677((byte) -100);
                    if (var144 >= 0 && var143 >= 0 && var144 < 104 && var143 < 104) {
                        class105 var146 = new class105();
                        var146.field1741 = var141;
                        var146.field1746 = var145;
                        if (class222.field3411[class240.field3892][var144][var143] == null) {
                            class222.field3411[class240.field3892][var144][var143] = new class180();
                        }
                        class222.field3411[class240.field3892][var144][var143].method1219(false, new class258(var146));
                        class113.method803(var143, var144, 110);
                    }
                } else if (class66.field1105 == 214) {
                    int var147 = class236.field3814.method670(-2);
                    if (var147 == 65535) {
                        var147 = -1;
                    }
                    int var148 = class236.field3814.method653(false);
                    int var149 = var148 >> 2;
                    int var150 = class51.field745[var149];
                    int var151 = var148 & 0x3;
                    int var152 = class236.field3814.method653(false);
                    int var153 = (var152 >> 4 & 0x7) + class181.field2830;
                    int var154 = (var152 & 0x7) + class147.field2333;
                    class150.method1016(true, var151, class240.field3892, var150, var147, var153, var149, var154);
                } else if (class66.field1105 == 96) {
                    int var155 = class236.field3814.method645(11596);
                    int var156 = class236.field3814.method633(92);
                    class69.method501(0, var155).method1305((byte) -51, var156);
                }
            }
        }
    }

    @OriginalMember(owner = "client!oj", name = "f", descriptor = "(B)V")
    public static final void method1082(byte arg0) {
        field2496++;
        if (arg0 >= 39) {
            class291.field4590 = new class39(32);
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIIII)V")
    public static final void method1083(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 != -1) {
            return;
        }
        class53 var5 = (class53) class291.field4590.method285((long) arg2, 13821);
        if (var5 == null) {
            var5 = new class53();
            class291.field4590.method281(1, (long) arg2, var5);
        }
        field2493++;
        if (arg0 >= var5.field800.length) {
            int[] var6 = new int[arg0 + 1];
            int[] var7 = new int[arg0 + 1];
            for (int var8 = 0; var8 < var5.field800.length; var8++) {
                var6[var8] = var5.field800[var8];
                var7[var8] = var5.field813[var8];
            }
            for (int var9 = var5.field800.length; var9 < arg0; var9++) {
                var6[var9] = -1;
                var7[var9] = 0;
            }
            var5.field800 = var6;
            var5.field813 = var7;
        }
        var5.field800[arg0] = arg1;
        var5.field813[arg0] = arg3;
    }

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "(III)Lqh;")
    public static final class206 method1084(int arg0, int arg1, int arg2) {
        class6 var3 = class269.field4298[arg0][arg1][arg2];
        return var3 == null ? null : var3.field123;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IZ)[[I")
    public int[][] method3(int arg0, boolean arg1) {
        if (!arg1) {
            method1078((byte) -82);
        }
        field2483++;
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIB)[I")
    public final int[] method1085(int arg0, int arg1, byte arg2) {
        field2498++;
        if (arg2 <= 27) {
            return null;
        } else if (this.field2489[arg0].field2494) {
            return this.field2489[arg0].method1(arg1, (byte) 57);
        } else {
            return this.field2489[arg0].method3(arg1, true)[0];
        }
    }

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "(I)V")
    public void method1086(int arg0) {
        if (this.field2494) {
            this.field2488.method19((byte) 93);
            this.field2488 = null;
        } else {
            this.field2476.method840((byte) 40);
            this.field2476 = null;
        }
        int var2 = 32 % ((arg0 + 1) / 35);
        field2500++;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IB)[I")
    public int[] method1(int arg0, byte arg1) {
        field2475++;
        if (arg1 != 57) {
            field2485 = -122;
        }
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!oj", name = "g", descriptor = "(B)I")
    public int method1087(byte arg0) {
        field2491++;
        if (arg0 != 89) {
            method1077(42, 7);
        }
        return -1;
    }

    @OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(IZ)V")
    public class160(int arg0, boolean arg1) {
        this.field2489 = new class160[arg0];
        this.field2494 = arg1;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(ZII)V")
    public final void method1088(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            return;
        }
        int var4 = this.field2492 == 255 ? arg2 : this.field2492;
        field2487++;
        if (this.field2494) {
            this.field2488 = new class4(var4, arg2, arg1);
        } else {
            this.field2476 = new class121(var4, arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "([II)[I")
    public static final int[] method1089(int[] arg0, int arg1) {
        field2501++;
        if (arg0 == null) {
            return null;
        } else {
            int[] var2 = new int[arg0.length];
            class175.method1185(arg0, arg1, var2, 0, arg0.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!oj", name = "h", descriptor = "(B)V")
    public void method210(byte arg0) {
        if (arg0 >= -124) {
            this.field2494 = false;
        }
        field2484++;
    }

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "(I)I")
    public int method1090(int arg0) {
        field2495++;
        if (arg0 != -1) {
            method1080(117, -12);
        }
        return -1;
    }
}
