import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class140 extends class3 {

    @OriginalMember(owner = "client!aj", name = "I", descriptor = "[I")
    public static int[] field2259 = new int[8];

    @OriginalMember(owner = "client!aj", name = "P", descriptor = "Ljava/lang/String;")
    public static String field2266 = "Unable to find ";

    @OriginalMember(owner = "client!aj", name = "G", descriptor = "I")
    public static int field2258;

    @OriginalMember(owner = "client!aj", name = "J", descriptor = "I")
    public static int field2260;

    @OriginalMember(owner = "client!aj", name = "K", descriptor = "I")
    public static int field2261;

    @OriginalMember(owner = "client!aj", name = "L", descriptor = "I")
    public static int field2262;

    @OriginalMember(owner = "client!aj", name = "M", descriptor = "I")
    public static int field2263;

    @OriginalMember(owner = "client!aj", name = "O", descriptor = "I")
    public static int field2265;

    @OriginalMember(owner = "client!aj", name = "N", descriptor = "Lpi;")
    public static class229 field2264;

    @OriginalMember(owner = "client!aj", name = "F", descriptor = "[[[I")
    public static int[][][] field2257;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIIII[[[B[I[I[I[I[IIBII)V", line = 5)
    public static final void method990(int arg0, int arg1, int arg2, int arg3, int arg4, byte[][][] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int arg11, byte arg12, int arg13, int arg14) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 >= class263.field4155 * 128) {
            arg0 = class263.field4155 * 128 - 1;
        }
        if (arg2 < 0) {
            arg2 = 0;
        } else if (arg2 >= class163.field2590 * 128) {
            arg2 = class163.field2590 * 128 - 1;
        }
        class292.field4845 = class272.field4470[arg3];
        class197.field3022 = class272.field4480[arg3];
        class160.field2555 = class272.field4470[arg4];
        class347.field5560 = class272.field4480[arg4];
        class244.field3847 = arg0;
        class65.field959 = arg1;
        class228.field3584 = arg2;
        class258.field4094 = arg0 / 128;
        class296.field4906 = arg2 / 128;
        class352.field5611 = class258.field4094 - class230.field3647;
        if (class352.field5611 < 0) {
            class352.field5611 = 0;
        }
        class214.field3303 = class296.field4906 - class230.field3647;
        if (class214.field3303 < 0) {
            class214.field3303 = 0;
        }
        class92.field1333 = class258.field4094 + class230.field3647;
        if (class92.field1333 > class263.field4155) {
            class92.field1333 = class263.field4155;
        }
        class118.field1716 = class296.field4906 + class230.field3647;
        if (class118.field1716 > class163.field2590) {
            class118.field1716 = class163.field2590;
        }
        short var15;
        if (class245.field3886) {
            var15 = 3584;
        } else {
            var15 = 3500;
        }
        for (int var16 = 0; var16 < class230.field3647 + class230.field3647 + 2; var16++) {
            for (int var17 = 0; var17 < class230.field3647 + class230.field3647 + 2; var17++) {
                int var18 = (var16 - class230.field3647 << 7) - (class244.field3847 & 0x7F);
                int var19 = (var17 - class230.field3647 << 7) - (class228.field3584 & 0x7F);
                int var20 = class258.field4094 + var16 - class230.field3647;
                int var21 = class296.field4906 + var17 - class230.field3647;
                if (var20 >= 0 && var21 >= 0 && var20 < class263.field4155 && var21 < class163.field2590) {
                    int var22;
                    if (class203.field3110 == null) {
                        var22 = class223.field3444[0][var20][var21] + 128 - class65.field959;
                    } else {
                        var22 = class203.field3110[0][var20][var21] + 128 - class65.field959;
                    }
                    int var23 = class223.field3444[3][var20][var21] - class65.field959 - 1000;
                    class121.field1815[var16][var17] = class236.method1625(var18, var23, var22, var19, var15);
                } else {
                    class121.field1815[var16][var17] = false;
                }
            }
        }
        for (int var24 = 0; var24 < class230.field3647 + class230.field3647 + 1; var24++) {
            for (int var25 = 0; var25 < class230.field3647 + class230.field3647 + 1; var25++) {
                class20.field243[var24][var25] = class121.field1815[var24][var25] || class121.field1815[var24 + 1][var25] || class121.field1815[var24][var25 + 1] || class121.field1815[var24 + 1][var25 + 1];
            }
        }
        class166.field2622 = arg6;
        class131.field1996 = arg7;
        class233.field3708 = arg8;
        class258.field4091 = arg9;
        class267.field4388 = arg10;
        class249.method1775();
        if (class275.field4546 != null) {
            class146.method1042(true);
            class287.method2022(arg0, arg1, arg2, (byte[][][]) null, 0, (byte) 0, arg13, arg14);
            if (class245.field3886) {
                class308.field5022 = false;
                class7.method53(0, 0, true);
                class234.method1619((float[]) null);
                class254.method1812();
            }
            class146.method1042(false);
        }
        class287.method2022(arg0, arg1, arg2, arg5, arg11, arg12, arg13, arg14);
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Lel;)V", line = 137)
    public static final void method991(class258 arg0) {
        for (int var1 = arg0.field4082; var1 <= arg0.field4084; var1++) {
            for (int var2 = arg0.field4081; var2 <= arg0.field4077; var2++) {
                class50 var3 = class264.field4230[arg0.field4085][var1][var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field735; var4++) {
                        if (var3.field752[var4] == arg0) {
                            var3.field735--;
                            for (int var5 = var4; var5 < var3.field735; var5++) {
                                var3.field752[var5] = var3.field752[var5 + 1];
                                var3.field753[var5] = var3.field753[var5 + 1];
                            }
                            var3.field752[var3.field735] = null;
                            break;
                        }
                    }
                    var3.field736 = 0;
                    for (int var6 = 0; var6 < var3.field735; var6++) {
                        var3.field736 |= var3.field753[var6];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(II)V", line = 197)
    public static final void method992(int arg0, int arg1) {
        field2260++;
        class234.method1620(class234.field3730, ((float) arg0 * 0.1F + 0.7F) * 1.1523438F, 0.69921875F, 0.69921875F);
        class234.method1617(-50.0F, -60.0F, -50.0F);
        if (arg1 != 1) {
            field2257 = (int[][][]) ((int[][][]) null);
        }
        class234.method1616(class234.field3724, 0, false);
        class234.method1621();
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIIIIII)V", line = 216)
    public static final void method993(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2262++;
        if (class56.field856 == 0) {
            int var7 = class296.field4918;
            int var8 = class9.field110;
            int var9 = class361.field5696;
            int var10 = class293.field4861;
            int var11 = (arg3 - arg2) * (var10 - var9) / arg1 + var9;
            int var12 = (arg4 - arg5) * (var8 - var7) / arg6 + var7;
            if (class107.field1532 && (class29.field447 & 0x40) != 0) {
                class264 var13 = class113.method741(class345.field5530, (byte) 126, class313.field5108);
                if (var13 == null) {
                    class352.method2459(-1);
                } else {
                    class322.method2309(" ->", var11, (short) 40, false, class339.field5457, class120.field1776, var12, 0L);
                }
            } else {
                class132.field2019++;
                if (class179.field2789 == 1) {
                    class322.method2309("", var11, (short) 14, false, -1, class5.field63, var12, 0L);
                }
                class322.method2309("", var11, (short) 38, false, -1, class340.field5477, var12, 0L);
            }
        }
        long var14 = -1L;
        for (int var16 = 0; var16 < class297.field4925; var16++) {
            long var17 = class41.field621[var16];
            int var19 = (int) var17 & 0x7F;
            int var20 = (int) var17 >> 29 & 0x3;
            int var21 = (int) var17 >> 7 & 0x7F;
            int var22 = (int) (var17 >>> 32) & Integer.MAX_VALUE;
            if (var14 != var17) {
                var14 = var17;
                if (var20 == 2 && class33.method273(class120.field1779, var19, var21, var17)) {
                    class126 var23 = class165.method1155((byte) 43, var22);
                    if (var23.field1949 != null) {
                        var23 = var23.method818(-104);
                    }
                    if (var23 == null) {
                        continue;
                    }
                    if (class56.field856 == 1) {
                        class322.method2309(class37.field550 + " -> <col=00ffff>" + var23.field1927, var19, (short) 23, false, class210.field3203, class182.field2834, var21, var17);
                        class105.field1519++;
                    } else if (class107.field1532) {
                        class21 var28 = class41.field628 == -1 ? null : class74.method504(class41.field628, 119);
                        if ((class29.field447 & 0x4) != 0 && (var28 == null || var23.method816(class41.field628, var28.field264, -42) != var28.field264)) {
                            class344.field5521++;
                            class322.method2309(class167.field2630 + " -> <col=00ffff>" + var23.field1927, var19, (short) 45, false, class339.field5457, class120.field1776, var21, var17);
                        }
                    } else {
                        class230.field3657++;
                        String[] var24 = var23.field1906;
                        if (class15.field203) {
                            var24 = class16.method112(0, var24);
                        }
                        if (var24 != null) {
                            for (int var25 = 4; var25 >= 0; var25--) {
                                if (var24[var25] != null) {
                                    class141.field2274++;
                                    short var26 = 0;
                                    if (var25 == 0) {
                                        var26 = 32;
                                    }
                                    if (var25 == 1) {
                                        var26 = 8;
                                    }
                                    int var27 = -1;
                                    if (var23.field1935 == var25) {
                                        var27 = var23.field1936;
                                    }
                                    if (var23.field1933 == var25) {
                                        var27 = var23.field1894;
                                    }
                                    if (var25 == 2) {
                                        var26 = 29;
                                    }
                                    if (var25 == 3) {
                                        var26 = 51;
                                    }
                                    if (var25 == 4) {
                                        var26 = 1006;
                                    }
                                    class322.method2309("<col=00ffff>" + var23.field1927, var19, var26, false, var27, var24[var25], var21, var17);
                                }
                            }
                        }
                        class322.method2309("<col=00ffff>" + var23.field1927, var19, (short) 1010, false, class266.field4387, class141.field2276, var21, (long) var23.field1924);
                    }
                }
                if (var20 == 1) {
                    class233 var29 = class329.field5377[var22];
                    if ((var29.field3702.field2220 & 0x1) == 0 && (var29.field4796 & 0x7F) == 0 && (var29.field4783 & 0x7F) == 0 || (var29.field3702.field2220 & 0x1) == 1 && (var29.field4796 & 0x7F) == 64 && (var29.field4783 & 0x7F) == 64) {
                        int var30 = var29.field4796 - ((var29.field3702.field2220 - 1) * 64);
                        int var31 = var29.field4783 + 64 - (var29.field3702.field2220 * 64);
                        for (int var32 = 0; var32 < class294.field4892; var32++) {
                            class233 var33 = class329.field5377[class243.field3843[var32]];
                            if (var33 != null && !var33.field4720 && var29 != var33 && var33.field4696) {
                                int var34 = var33.field4796 + 64 - (var33.field3702.field2220 * 64);
                                int var35 = var33.field4783 - (var33.field3702.field2220 - 1) * 64;
                                if (var34 >= var30 && var33.field3702.field2220 <= (var29.field3702.field2220 - (var34 - var30 >> 7)) && var35 >= var31 && var33.field3702.field2220 <= var29.field3702.field2220 - (var35 - var31 >> 7)) {
                                    class304.method2133(var33.field3702, -55, class243.field3843[var32], var19, var21);
                                    var33.field4720 = true;
                                }
                            }
                        }
                        for (int var36 = 0; var36 < class38.field561; var36++) {
                            class39 var37 = class130.field1984[class150.field2410[var36]];
                            if (var37 != null && !var37.field4720 && var37.field4696) {
                                int var38 = var37.field4796 + 64 - var37.method312(-127) * 64;
                                int var39 = var37.field4783 - (var37.method312(-105) - 1) * 64;
                                if (var38 >= var30 && var37.method312(39) <= var29.field3702.field2220 - (var38 - var30 >> 7) && var39 >= var31 && var37.method312(-72) <= (var29.field3702.field2220 - (var39 - var31 >> 7))) {
                                    class118.method767(var37, class150.field2410[var36], -1, var21, var19);
                                    var37.field4720 = true;
                                }
                            }
                        }
                    }
                    if (var29.field4720) {
                        continue;
                    }
                    class304.method2133(var29.field3702, -80, var22, var19, var21);
                    var29.field4720 = true;
                }
                if (var20 == 0) {
                    class39 var40 = class130.field1984[var22];
                    if ((var40.field4796 & 0x7F) == 64 && (var40.field4783 & 0x7F) == 64) {
                        int var41 = var40.field4796 - ((var40.method312(99) - 1) * 64);
                        int var42 = var40.field4783 - (var40.method312(69) - 1) * 64;
                        for (int var43 = 0; var43 < class294.field4892; var43++) {
                            class233 var44 = class329.field5377[class243.field3843[var43]];
                            if (var44 != null && !var44.field4720 && var44.field4696) {
                                int var45 = var44.field4796 - (var44.field3702.field2220 * 64 - 64);
                                int var46 = var44.field4783 - (var44.field3702.field2220 - 1) * 64;
                                if (var45 >= var41 && var44.field3702.field2220 <= (var40.method312(82) - (var45 - var41 >> 7)) && var46 >= var42 && var44.field3702.field2220 <= var40.method312(-107) - (var46 - var42 >> 7)) {
                                    class304.method2133(var44.field3702, -77, class243.field3843[var43], var19, var21);
                                    var44.field4720 = true;
                                }
                            }
                        }
                        for (int var47 = 0; var47 < class38.field561; var47++) {
                            class39 var48 = class130.field1984[class150.field2410[var47]];
                            if (var48 != null && !var48.field4720 && var40 != var48 && var48.field4696) {
                                int var49 = var48.field4796 - (var48.method312(-75) - 1) * 64;
                                int var50 = var48.field4783 - (var48.method312(110) * 64 - 64);
                                if (var41 <= var49 && var48.method312(-106) <= (var40.method312(32) - (var49 - var41 >> 7)) && var50 >= var42 && var48.method312(76) <= var40.method312(89) - (var50 - var42 >> 7)) {
                                    class118.method767(var48, class150.field2410[var47], -117, var21, var19);
                                    var48.field4720 = true;
                                }
                            }
                        }
                    }
                    if (var40.field4720) {
                        continue;
                    }
                    class118.method767(var40, var22, -127, var21, var19);
                    var40.field4720 = true;
                }
                if (var20 == 3) {
                    class150 var51 = class171.field2668[class120.field1779][var19][var21];
                    if (var51 != null) {
                        for (class192 var52 = (class192) var51.method1086(27627); var52 != null; var52 = (class192) var51.method1088(124)) {
                            int var53 = var52.field2976.field1687;
                            class109 var54 = class322.method2311(var53, -124);
                            if (class56.field856 == 1) {
                                class29.field441++;
                                class322.method2309(class37.field550 + " -> <col=ff9040>" + var54.field1596, var19, (short) 58, false, class210.field3203, class182.field2834, var21, (long) var53);
                            } else if (class107.field1532) {
                                class21 var59 = class41.field628 == -1 ? null : class74.method504(class41.field628, 80);
                                if ((class29.field447 & 0x1) != 0 && (var59 == null || var54.method719(class41.field628, (byte) 51, var59.field264) != var59.field264)) {
                                    class23.field337++;
                                    class322.method2309(class167.field2630 + " -> <col=ff9040>" + var54.field1596, var19, (short) 59, false, class339.field5457, class120.field1776, var21, (long) var53);
                                }
                            } else {
                                String[] var55 = var54.field1625;
                                if (class15.field203) {
                                    var55 = class16.method112(0, var55);
                                }
                                class21.field268++;
                                for (int var56 = 4; var56 >= 0; var56--) {
                                    if (var55 != null && var55[var56] != null) {
                                        int var57 = -1;
                                        byte var58 = 0;
                                        if (var56 == 0) {
                                            var58 = 10;
                                        }
                                        if (var54.field1620 == var56) {
                                            var57 = var54.field1592;
                                        }
                                        class219.field3367++;
                                        if (var56 == 1) {
                                            var58 = 6;
                                        }
                                        if (var54.field1589 == var56) {
                                            var57 = var54.field1600;
                                        }
                                        if (var56 == 2) {
                                            var58 = 37;
                                        }
                                        if (var56 == 3) {
                                            var58 = 43;
                                        }
                                        if (var56 == 4) {
                                            var58 = 48;
                                        }
                                        class322.method2309("<col=ff9040>" + var54.field1596, var19, var58, false, var57, var55[var56], var21, (long) var53);
                                    }
                                }
                                class322.method2309("<col=ff9040>" + var54.field1596, var19, (short) 1007, false, class266.field4387, class141.field2276, var21, (long) var53);
                            }
                        }
                    }
                }
            }
        }
        int var60 = -44 % ((arg0 + 25) / 59);
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Z)V", line = 618)
    public static void method994(boolean arg0) {
        field2259 = null;
        if (arg0) {
            field2257 = (int[][][]) null;
            field2266 = null;
            field2264 = null;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "([BII)I", line = 633)
    public static final int method995(byte[] arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            method994(false);
        }
        field2263++;
        return class263.method1851(arg1, -1, arg0, 0);
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(BLfh;)Lgk;", line = 646)
    public static final class222 method996(byte arg0, class313 arg1) {
        field2265++;
        if (arg0 < 83) {
            field2264 = (class229) null;
        }
        class222 var2 = new class222();
        var2.field3429 = arg1.method2250(-1613178296);
        var2.field3432 = class295.method2088(false, var2.field3429);
        return var2;
    }

    @OriginalMember(owner = "client!aj", name = "<init>", descriptor = "()V", line = 659)
    public class140() {
        super(0, true);
    }

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "(B)V", line = 670)
    public static final void method997(byte arg0) {
        field2258++;
        if (arg0 != 30) {
            field2259 = (int[]) null;
        }
        class41.field627.method644((byte) -126);
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(BI)[I", line = 682)
    public final int[] method25(byte arg0, int arg1) {
        if (arg0 < 57) {
            method993(-7, -112, -98, -2, 107, 88, 40);
        }
        field2261++;
        int[] var3 = this.field21.method1258(arg1, 0);
        if (this.field21.field2808) {
            class298.method2106(var3, 0, class326.field5342, class159.field2546[arg1]);
        }
        return var3;
    }
}
