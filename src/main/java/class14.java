import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class14 extends class418 {

    @OriginalMember(owner = "client!ab", name = "u", descriptor = "I")
    private int field222;

    @OriginalMember(owner = "client!ab", name = "m", descriptor = "I")
    public int field214;

    @OriginalMember(owner = "client!ab", name = "s", descriptor = "I")
    public int field220;

    @OriginalMember(owner = "client!ab", name = "w", descriptor = "I")
    public int field224;

    @OriginalMember(owner = "client!ab", name = "x", descriptor = "I")
    public int field225;

    @OriginalMember(owner = "client!ab", name = "v", descriptor = "I")
    private int field223;

    @OriginalMember(owner = "client!ab", name = "z", descriptor = "I")
    private int field227;

    @OriginalMember(owner = "client!ab", name = "C", descriptor = "I")
    private int field230;

    @OriginalMember(owner = "client!ab", name = "k", descriptor = "I")
    private int field212;

    @OriginalMember(owner = "client!ab", name = "n", descriptor = "Z")
    public static boolean field215 = false;

    @OriginalMember(owner = "client!ab", name = "y", descriptor = "I")
    public static int field226 = 0;

    @OriginalMember(owner = "client!ab", name = "l", descriptor = "I")
    public static int field213;

    @OriginalMember(owner = "client!ab", name = "o", descriptor = "I")
    public static int field216;

    @OriginalMember(owner = "client!ab", name = "p", descriptor = "I")
    public static int field217;

    @OriginalMember(owner = "client!ab", name = "q", descriptor = "I")
    public static int field218;

    @OriginalMember(owner = "client!ab", name = "r", descriptor = "I")
    public static int field219;

    @OriginalMember(owner = "client!ab", name = "t", descriptor = "I")
    public static int field221;

    @OriginalMember(owner = "client!ab", name = "B", descriptor = "I")
    public static int field229;

    @OriginalMember(owner = "client!ab", name = "A", descriptor = "Lir;")
    public static class185 field228;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(III)Z")
    public final boolean method98(int arg0, int arg1, int arg2) {
        field229++;
        if (arg0 == -613) {
            return arg2 >= this.field230 && this.field212 >= arg2 && arg1 >= this.field222 && this.field223 >= arg1;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIII)Z")
    public final boolean method99(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 != 1) {
            this.field222 = -122;
        }
        field216++;
        return this.field227 == arg2 && this.field230 <= arg3 && this.field212 >= arg3 && arg1 >= this.field222 && this.field223 >= arg1;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(II[II)V")
    public final void method100(int arg0, int arg1, int[] arg2, int arg3) {
        int var5 = 45 % ((-arg1 - 54) / 60);
        arg2[0] = 0;
        field219++;
        arg2[1] = this.field214 + arg3 - this.field230;
        arg2[2] = this.field220 - (this.field222 - arg0);
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(I)V")
    public static final void method101(int arg0) {
        class438.field6358 = null;
        if (arg0 != 4) {
            method102(109, 43);
        }
        class450.field6459 = null;
        field221++;
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(II)I")
    public static final int method102(int arg0, int arg1) {
        return class50.field777 == null ? 0 : class50.field777[arg0][arg1] & 0xFFFFFF;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IBI)Z")
    public final boolean method103(int arg0, byte arg1, int arg2) {
        field213++;
        if (arg1 > -106) {
            this.method99(66, 24, -25, 113);
        }
        return this.field214 <= arg0 && arg0 <= this.field224 && this.field220 <= arg2 && this.field225 >= arg2;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(III[I)V")
    public final void method104(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = this.field227;
        arg3[1] = this.field230 + arg1 - this.field214;
        arg3[arg0] = this.field222 + arg2 - this.field220;
        field218++;
    }

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "(Z)V")
    public static void method105(boolean arg0) {
        if (!arg0) {
            field228 = null;
        }
    }

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(IIIIIIIII)V")
    public class14(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field222 = arg2;
        this.field214 = arg5;
        this.field220 = arg6;
        this.field224 = arg7;
        this.field225 = arg8;
        this.field223 = arg4;
        this.field227 = arg0;
        this.field230 = arg1;
        this.field212 = arg3;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Ltj;B)V")
    public static final void method106(class298 arg0, byte arg1) {
        field217++;
        if (class277.field4060 < 0 || class217.field3032 < 0 || class321.field4768 == 0 || class389.field5696 == 0) {
            return;
        }
        arg0.method477(class295.field4456, class209.field2844, class321.field4768, class389.field5696);
        arg0.method462(class27.field468, class384.field5624, class321.field4768, class389.field5696);
        class118 var2 = arg0.method429();
        var2.method276(class78.field1091, class266.field3956, class212.field2969, class77.field1072, class166.field2252, class20.field351);
        if (arg1 > -86) {
            return;
        }
        arg0.method478(var2);
        if (class117.field1526 == 0 && class142.field1804 != null) {
            int var3 = -1;
            int var4 = -1;
            int var5 = arg0.method451();
            int var6 = (class277.field4060 - class295.field4456) * var5 / class321.field4768;
            int var7 = (class217.field3032 - class209.field2844) * var5 / class389.field5696;
            int var8 = arg0.method457();
            int var9 = (class277.field4060 - class295.field4456) * var8 / class321.field4768;
            int var10 = (class217.field3032 - class209.field2844) * var8 / class389.field5696;
            int[] var11 = new int[] { var6, var7, var5 };
            var2.method267(var11);
            int[] var12 = new int[] { var9, var10, var8 };
            var2.method267(var12);
            float var13 = 0.0F;
            int var14 = var12[0] - var11[0];
            int var15 = var12[1] - var11[1];
            int var16 = var12[2] - var11[2];
            while (var13 < 1.0F) {
                int var17 = (int) ((float) var14 * var13 + (float) var11[0]);
                int var18 = var17 >> 7;
                int var19 = (int) ((float) var16 * var13 + (float) var11[2]);
                int var20 = var19 >> 7;
                if (var18 > 0 && var20 > 0 && class351.field5217 > var18 && var20 < class143.field1815) {
                    int var21 = class268.field3973;
                    if (var21 < 3 && (class406.field5912[1][var18][var20] & 0x2) != 0) {
                        var21++;
                    }
                    if ((float) class142.field1804[var21].method725(var17, var19) < (float) var15 * var13 + (float) var11[1]) {
                        var3 = (class383.field5609.method1091((byte) -93) - 1) * 64 + var17 >> 7;
                        var4 = var19 + ((class383.field5609.method1091((byte) -96) - 1) * 64) >> 7;
                        break;
                    }
                }
                var13 = (float) ((double) var13 + 0.01D);
            }
            if (var3 != -1 && var4 != -1) {
                if (class263.field3862 && (class45.field682 & 0x40) != 0) {
                    class248 var22 = class416.method2626(211655864, class274.field4024, class112.field1450);
                    if (var22 == null) {
                        class303.method2036((byte) -22);
                    } else {
                        class24.method213(var4, class298.field4505, " ->", class388.field5685, (byte) 104, 0L, var3, 9);
                    }
                } else {
                    if (class396.field5783 == 1) {
                        class24.method213(var4, class109.field1423, "", -1, (byte) 102, 0L, var3, 14);
                    }
                    class24.method213(var4, class170.field2335, "", -1, (byte) 111, 0L, var3, 25);
                    class124.field1608++;
                }
            }
        }
        class8 var23 = class308.field4573;
        for (class372 var24 = (class372) var23.method54((byte) 18); var24 != null; var24 = (class372) var23.method53((byte) 124)) {
            if (var24.method2444(class277.field4060, true, arg0, class217.field3032) && class268.field3973 == var24.field5494) {
                if (var24.field5490 instanceof class317) {
                    class317 var25 = (class317) var24.field5490;
                    int var26 = var25.method1091((byte) -87);
                    if ((var26 & 0x1) == 0 && (var25.field5921 & 0x7F) == 0 && (var25.field5930 & 0x7F) == 0 || (var26 & 0x1) == 1 && (var25.field5921 & 0x7F) == 64 && (var25.field5930 & 0x7F) == 64) {
                        int var27 = var25.field5921 - ((var25.method1091((byte) 97) - 1) * 64);
                        int var28 = var25.field5930 + 64 - var25.method1091((byte) -93) * 64;
                        for (int var29 = 0; var29 < class93.field1274; var29++) {
                            class163 var34 = class388.field5670[class62.field943[var29]];
                            if (var34 != null && class231.field3179 != var34.field2146 && var34.field2140) {
                                int var35 = var34.field5921 - (var34.field2206.field2590 - 1) * 64;
                                int var36 = 64 - (var34.field2206.field2590 * 64 - var34.field5930);
                                if (var35 >= var27 && var34.field2206.field2590 <= var25.method1091((byte) 46) - (var35 - var27 >> 7) && var36 >= var28 && var34.field2206.field2590 <= var25.method1091((byte) -84) - (var36 - var28 >> 7)) {
                                    class330.method2165(var34, -1379);
                                    var34.field2146 = class231.field3179;
                                }
                            }
                        }
                        for (int var30 = 0; var30 < class402.field5869; var30++) {
                            class317 var31 = class176.field2382[class117.field1528[var30]];
                            if (var31 != null && class231.field3179 != var31.field2146 && var25 != var31 && var31.field2140) {
                                int var32 = var31.field5921 - (var31.method1091((byte) 74) * 64 - 64);
                                int var33 = var31.field5930 + 64 - var31.method1091((byte) 111) * 64;
                                if (var32 >= var27 && var31.method1091((byte) 74) <= var25.method1091((byte) -128) - (var32 - var27 >> 7) && var33 >= var28 && var31.method1091((byte) -123) <= var25.method1091((byte) 103) - (var33 - var28 >> 7)) {
                                    class184.method1194(true, var31);
                                    var31.field2146 = class231.field3179;
                                }
                            }
                        }
                    }
                    if (class231.field3179 == var25.field2146) {
                        continue;
                    }
                    class184.method1194(true, var25);
                    var25.field2146 = class231.field3179;
                }
                if (var24.field5490 instanceof class163) {
                    class163 var37 = (class163) var24.field5490;
                    if (var37.field2206 != null) {
                        if ((var37.field2206.field2590 & 0x1) == 0 && (var37.field5921 & 0x7F) == 0 && (var37.field5930 & 0x7F) == 0 || (var37.field2206.field2590 & 0x1) == 1 && (var37.field5921 & 0x7F) == 64 && (var37.field5930 & 0x7F) == 64) {
                            int var38 = var37.field5921 + 64 - (var37.field2206.field2590 * 64);
                            int var39 = var37.field5930 + 64 - (var37.field2206.field2590 * 64);
                            for (int var40 = 0; var40 < class93.field1274; var40++) {
                                class163 var45 = class388.field5670[class62.field943[var40]];
                                if (var45 != null && class231.field3179 != var45.field2146 && var37 != var45 && var45.field2140) {
                                    int var46 = var45.field5921 + 64 - (var45.field2206.field2590 * 64);
                                    int var47 = var45.field5930 - ((var45.field2206.field2590 - 1) * 64);
                                    if (var38 <= var46 && var45.field2206.field2590 <= (var37.field2206.field2590 - (var46 - var38 >> 7)) && var39 <= var47 && var37.field2206.field2590 - (var47 - var39 >> 7) >= var45.field2206.field2590) {
                                        class330.method2165(var45, -1379);
                                        var45.field2146 = class231.field3179;
                                    }
                                }
                            }
                            for (int var41 = 0; var41 < class402.field5869; var41++) {
                                class317 var42 = class176.field2382[class117.field1528[var41]];
                                if (var42 != null && class231.field3179 != var42.field2146 && var42.field2140) {
                                    int var43 = var42.field5921 - ((var42.method1091((byte) 50) - 1) * 64);
                                    int var44 = var42.field5930 - ((var42.method1091((byte) -107) - 1) * 64);
                                    if (var38 <= var43 && var42.method1091((byte) -88) <= (var37.field2206.field2590 - (var43 - var38 >> 7)) && var39 <= var44 && var42.method1091((byte) -105) <= (var37.field2206.field2590 - (var44 - var39 >> 7))) {
                                        class184.method1194(true, var42);
                                        var42.field2146 = class231.field3179;
                                    }
                                }
                            }
                        }
                        if (class231.field3179 == var37.field2146) {
                            continue;
                        }
                        class330.method2165(var37, -1379);
                        var37.field2146 = class231.field3179;
                    }
                }
                if (var24.field5490 instanceof class278) {
                    class171 var48 = (class171) class267.field3962.method2826(false, (long) (var24.field5488 | var24.field5494 << 28 | var24.field5493 << 14));
                    if (var48 != null) {
                        for (class223 var49 = (class223) var48.field2345.method1564(-25594); var49 != null; var49 = (class223) var48.field2345.method1562(0)) {
                            class159 var50 = class129.method915(127, var49.field3072);
                            if (class117.field1526 == 1) {
                                class352.field5225++;
                                class24.method213(var24.field5493, class429.field6239, class369.field5455 + " -> <col=ff9040>" + var50.field2068, class407.field5935, (byte) 115, (long) var49.field3072, var24.field5488, 46);
                            } else if (class263.field3862) {
                                class154 var55 = class144.field1847 == -1 ? null : class410.method2595(-22867, class144.field1847);
                                if ((class45.field682 & 0x1) != 0 && (var55 == null || var50.method1058(0, class144.field1847, var55.field1960) != var55.field1960)) {
                                    class131.field1713++;
                                    class24.method213(var24.field5493, class298.field4505, class396.field5787 + " -> <col=ff9040>" + var50.field2068, class388.field5685, (byte) 98, (long) var49.field3072, var24.field5488, 17);
                                }
                            } else {
                                String[] var51 = var50.field2046;
                                for (int var52 = 4; var52 >= 0; var52--) {
                                    if (var51 != null && var51[var52] != null) {
                                        byte var53 = 0;
                                        if (var52 == 0) {
                                            var53 = 7;
                                        }
                                        int var54 = class357.field5289;
                                        if (var52 == 1) {
                                            var53 = 10;
                                        }
                                        if (var52 == 2) {
                                            var53 = 39;
                                        }
                                        if (var52 == 3) {
                                            var53 = 19;
                                        }
                                        if (var52 == 4) {
                                            var53 = 18;
                                        }
                                        if (var50.field2039 == var52) {
                                            var54 = var50.field2052;
                                        }
                                        if (var50.field2048 == var52) {
                                            var54 = var50.field2024;
                                        }
                                        class24.method213(var24.field5493, var51[var52], "<col=ff9040>" + var50.field2068, var54, (byte) 105, (long) var49.field3072, var24.field5488, var53);
                                        class281.field4132++;
                                    }
                                }
                                class24.method213(var24.field5493, class337.field4982, "<col=ff9040>" + var50.field2068, class387.field5664, (byte) 106, (long) var49.field3072, var24.field5488, 1005);
                                class354.field5245++;
                            }
                        }
                    }
                }
                if (var24.field5490 instanceof class56) {
                    class56 var56 = (class56) var24.field5490;
                    class212 var57 = class372.method2447(var56.method116(24186), (byte) -89);
                    if (var57.field2944 != null) {
                        var57 = var57.method1387((byte) -53);
                    }
                    if (var57 != null) {
                        if (class117.field1526 == 1) {
                            class159.field2042++;
                            class24.method213(var24.field5493, class429.field6239, class369.field5455 + " -> <col=00ffff>" + var57.field2960, class407.field5935, (byte) 100, class140.method979(var24.field5488, var56, 25632, var24.field5493), var24.field5488, 32);
                        } else if (class263.field3862) {
                            class154 var58 = class144.field1847 == -1 ? null : class410.method2595(-22867, class144.field1847);
                            if ((class45.field682 & 0x4) != 0 && (var58 == null || var57.method1395(var58.field1960, class144.field1847, 7025) != var58.field1960)) {
                                class345.field5142++;
                                class24.method213(var24.field5493, class298.field4505, class396.field5787 + " -> <col=00ffff>" + var57.field2960, class388.field5685, (byte) 109, class140.method979(var24.field5488, var56, 25632, var24.field5493), var24.field5488, 28);
                            }
                        } else {
                            String[] var59 = var57.field2923;
                            if (var59 != null) {
                                for (int var60 = 4; var60 >= 0; var60--) {
                                    if (var59[var60] != null) {
                                        short var61 = 0;
                                        int var62 = class357.field5289;
                                        if (var60 == 0) {
                                            var61 = 29;
                                        }
                                        if (var60 == 1) {
                                            var61 = 40;
                                        }
                                        if (var60 == 2) {
                                            var61 = 38;
                                        }
                                        if (var60 == 3) {
                                            var61 = 44;
                                        }
                                        if (var57.field2950 == var60) {
                                            var62 = var57.field2963;
                                        }
                                        if (var60 == 4) {
                                            var61 = 1003;
                                        }
                                        if (var57.field2904 == var60) {
                                            var62 = var57.field2922;
                                        }
                                        class24.method213(var24.field5493, var59[var60], "<col=00ffff>" + var57.field2960, var62, (byte) 97, class140.method979(var24.field5488, var56, 25632, var24.field5493), var24.field5488, var61);
                                        class322.field4799++;
                                    }
                                }
                            }
                            class24.method213(var24.field5493, class337.field4982, "<col=00ffff>" + var57.field2960, class387.field5664, (byte) 108, (long) var57.field2942, var24.field5488, 1011);
                            class346.field5172++;
                        }
                    }
                }
            }
        }
    }
}
