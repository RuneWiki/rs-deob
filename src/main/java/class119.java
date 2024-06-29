import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class119 extends class276 {

    @OriginalMember(owner = "client!md", name = "Q", descriptor = "I")
    private int field2109 = 1;

    @OriginalMember(owner = "client!md", name = "W", descriptor = "I")
    private int field2115 = 1;

    @OriginalMember(owner = "client!md", name = "T", descriptor = "I")
    public static int field2112 = 1;

    @OriginalMember(owner = "client!md", name = "Y", descriptor = "Z")
    public static boolean field2117 = false;

    @OriginalMember(owner = "client!md", name = "P", descriptor = "I")
    public static int field2108 = -1;

    @OriginalMember(owner = "client!md", name = "M", descriptor = "I")
    public static int field2105;

    @OriginalMember(owner = "client!md", name = "O", descriptor = "I")
    public static int field2107;

    @OriginalMember(owner = "client!md", name = "R", descriptor = "I")
    public static int field2110;

    @OriginalMember(owner = "client!md", name = "S", descriptor = "I")
    public static int field2111;

    @OriginalMember(owner = "client!md", name = "V", descriptor = "I")
    public static int field2114;

    @OriginalMember(owner = "client!md", name = "X", descriptor = "I")
    public static int field2116;

    @OriginalMember(owner = "client!md", name = "N", descriptor = "Lvh;")
    public static class108 field2106;

    @OriginalMember(owner = "client!md", name = "U", descriptor = "Lda;")
    public static class197 field2113;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IB)Lqk;")
    public static final class2 method816(int arg0, byte arg1) {
        ++field2111;
        class2 var2 = (class2) class69.field1135.method3(32, (long) arg0);
        if (var2 != null) {
            return var2;
        } else {
            if (arg1 < 68) {
                method819(-19, 59, (byte) -75);
            }
            byte[] var3 = class187.field3023.method746(arg0, (byte) -128, 11);
            class2 var4 = new class2();
            if (var3 != null) {
                var4.method13(-105, new class101(var3));
            }
            class69.field1135.method4(0, var4, (long) arg0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(II)[[I")
    public final int[][] method300(int arg0, int arg1) {
        if (arg1 != -1) {
            this.method300(-43, 113);
        }
        ++field2116;
        int[][] var3 = super.field4418.method835((byte) 104, arg0);
        if (super.field4418.field2164) {
            int var4 = this.field2115 + 1 - -this.field2115;
            int var5 = 65536 / var4;
            int var6 = this.field2109 + this.field2109 + 1;
            int[][][] var7 = new int[var4][][];
            int var8 = 65536 / var6;
            for (int var9 = -this.field2115 + arg0; var9 <= this.field2115 + arg0; ++var9) {
                int[][] var19 = this.method1810((byte) -21, class125.field2189 & var9, 0);
                int[][] var20 = new int[3][class53.field929];
                int var21 = 0;
                int var22 = 0;
                int var23 = 0;
                int[] var24 = var19[0];
                int[] var25 = var19[1];
                int[] var26 = var19[2];
                for (int var27 = -this.field2109; ~var27 >= ~this.field2109; ++var27) {
                    int var37 = class35.field504 & var27;
                    var22 += var24[var37];
                    var23 += var26[var37];
                    var21 += var25[var37];
                }
                int[] var28 = var20[0];
                int[] var29 = var20[1];
                int[] var30 = var20[2];
                int var31 = 0;
                while (var31 < class53.field929) {
                    var28[var31] = var8 * var22 >> 16;
                    var29[var31] = var8 * var21 >> 16;
                    var30[var31] = var8 * var23 >> 16;
                    int var32 = var31 - this.field2109 & class35.field504;
                    ++var31;
                    int var33 = var23 - var26[var32];
                    int var34 = var22 - var24[var32];
                    int var35 = var21 - var25[var32];
                    int var36 = class35.field504 & this.field2109 + var31;
                    var22 = var24[var36] + var34;
                    var23 = var26[var36] + var33;
                    var21 = var25[var36] + var35;
                }
                var7[this.field2115 + var9 + -arg0] = var20;
            }
            int[] var10 = var3[1];
            int[] var11 = var3[0];
            int[] var12 = var3[2];
            for (int var13 = 0; class53.field929 > var13; ++var13) {
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                for (int var17 = 0; ~var4 < ~var17; ++var17) {
                    int[][] var18 = var7[var17];
                    var16 += var18[2][var13];
                    var15 += var18[1][var13];
                    var14 += var18[0][var13];
                }
                var11[var13] = var5 * var14 >> 16;
                var10[var13] = var5 * var15 >> 16;
                var12[var13] = var5 * var16 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(BIIIIII)V")
    public static final void method817(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field2105;
        class167.field2745 = 0;
        for (int var7 = -1; class187.field3037 + class157.field2624 > var7; ++var7) {
            class81 var23;
            if (~var7 != 0) {
                if (~var7 > ~class157.field2624) {
                    var23 = class105.field1874[class280.field4458[var7]];
                } else {
                    var23 = class42.field625[class292.field4668[var7 - class157.field2624]];
                }
            } else {
                var23 = class273.field4378;
            }
            if (var23 != null && var23.method536(125)) {
                if (var23 instanceof class141) {
                    class208 var24 = ((class141) var23).field2421;
                    if (var24.field3521 != null) {
                        var24 = var24.method1402((byte) -118);
                    }
                    if (var24 == null) {
                        continue;
                    }
                }
                if (class157.field2624 <= var7) {
                    class208 var25 = ((class141) var23).field2421;
                    if (var25.field3521 != null) {
                        var25 = var25.method1402((byte) -123);
                    }
                    if (~var25.field3494 <= -1 && ~var25.field3494 > ~class145.field2479.length) {
                        int var26;
                        if (var25.field3530 == -1) {
                            var26 = var23.method527(21783) + 15;
                        } else {
                            var26 = var25.field3530 + 15;
                        }
                        class62.method397(var26, var23, (byte) -109, arg6 >> 1, arg4 >> 1, arg1, arg5);
                        if (class85.field1536 > -1) {
                            class145.field2479[var25.field3494].method447(class85.field1536 + arg2 - 12, class111.field1999 + arg3 - 30);
                        }
                    }
                    int var27 = 0;
                    class280[] var28 = class26.field398;
                    while (var28.length > var27) {
                        class280 var29 = var28[var27];
                        if (var29 != null && ~var29.field4460 == -2 && ~class292.field4668[-class157.field2624 + var7] == ~var29.field4454 && ~(class266.field4301 % 20) > -11) {
                            int var30;
                            if (~var25.field3530 != 0) {
                                var30 = var25.field3530 + 15;
                            } else {
                                var30 = var23.method527(21783) + 15;
                            }
                            class62.method397(var30, var23, (byte) 121, arg6 >> 1, arg4 >> 1, arg1, arg5);
                            if (~class85.field1536 < 0) {
                                class194.field3133[var29.field4450].method447(class85.field1536 + arg2 - 12, arg3 - (-class111.field1999 - -28));
                            }
                        }
                        ++var27;
                    }
                } else {
                    int var31 = 30;
                    class288 var32 = (class288) var23;
                    if (var32.field4590 != -1 || ~var32.field4584 != 0) {
                        class62.method397(15 + var23.method527(21783), var23, (byte) -99, arg6 >> 1, arg4 >> 1, arg1, arg5);
                        if (~class85.field1536 < 0) {
                            if (var32.field4590 != -1) {
                                class189.field3054[var32.field4590].method447(class85.field1536 + arg2 - 12, arg3 - (-class111.field1999 + var31));
                                var31 += 25;
                            }
                            if (var32.field4584 != -1) {
                                class145.field2479[var32.field4584].method447(class85.field1536 + arg2 + -12, -var31 + arg3 - -class111.field1999);
                                var31 += 25;
                            }
                        }
                    }
                    if (var7 >= 0) {
                        class280[] var33 = class26.field398;
                        for (int var34 = 0; var33.length > var34; ++var34) {
                            class280 var35 = var33[var34];
                            if (var35 != null && ~var35.field4460 == -11 && class280.field4458[var7] == var35.field4454) {
                                class62.method397(15 + var23.method527(21783), var23, (byte) -97, arg6 >> 1, arg4 >> 1, arg1, arg5);
                                if (class85.field1536 > -1) {
                                    class194.field3133[var35.field4450].method447(arg2 + -12 + class85.field1536, arg3 - (-class111.field1999 + var31));
                                }
                            }
                        }
                    }
                }
                if (var23.field1462 != null && (var7 >= class157.field2624 || class243.field3979 == 0 || class243.field3979 == 3 || class243.field3979 == 1 && class270.method1773(((class288) var23).field4601, (byte) -48))) {
                    class62.method397(var23.method527(21783), var23, (byte) 102, arg6 >> 1, arg4 >> 1, arg1, arg5);
                    if (~class85.field1536 < 0 && ~class167.field2745 > ~class118.field2087) {
                        class118.field2084[class167.field2745] = class290.field4636.method1622(var23.field1462) / 2;
                        class118.field2095[class167.field2745] = class290.field4636.field4001;
                        class118.field2092[class167.field2745] = class85.field1536;
                        class118.field2097[class167.field2745] = class111.field1999;
                        class118.field2081[class167.field2745] = var23.field1434;
                        class118.field2080[class167.field2745] = var23.field1476;
                        class118.field2096[class167.field2745] = var23.field1425;
                        class118.field2085[class167.field2745] = var23.field1462;
                        ++class167.field2745;
                    }
                }
                if (~class266.field4301 > ~var23.field1483) {
                    class74 var36 = class52.field919[1];
                    class74 var37 = class52.field919[0];
                    int var41;
                    if (var23 instanceof class141) {
                        class141 var38 = (class141) var23;
                        class74[] var39 = (class74[]) class151.field2525.method57((long) var38.field2421.field3487, -82);
                        if (var39 == null) {
                            var39 = class145.method1006(class33.field471, -3, 0, var38.field2421.field3487);
                            if (var39 != null) {
                                class151.field2525.method62(0, var39, (long) var38.field2421.field3487);
                            }
                        }
                        if (var39 != null && var39.length == 2) {
                            var36 = var39[1];
                            var37 = var39[0];
                        }
                        class208 var40 = var38.field2421;
                        if (var40.field3530 != -1) {
                            var41 = var40.field3530;
                        } else {
                            var41 = var23.method527(21783);
                        }
                    } else {
                        var41 = var23.method527(21783);
                    }
                    class62.method397(var37.field1229 + var41 + 10, var23, (byte) 111, arg6 >> 1, arg4 >> 1, arg1, arg5);
                    if (class85.field1536 > -1) {
                        int var42 = class85.field1536 + arg2 - (var37.field1218 >> 1);
                        int var43 = class111.field1999 + arg3 + -3;
                        var37.method447(var42, var43);
                        int var44 = var37.field1229;
                        int var45 = var23.field1453 * var37.field1218 / 255;
                        class283.method1850(var42, var43, var42 - -var45, var43 + var44);
                        var36.method447(var42, var43);
                        class283.method1858(arg2, arg3, arg2 + arg6, arg3 + arg4);
                    }
                }
                for (int var46 = 0; var46 < 4; ++var46) {
                    if (~var23.field1408[var46] < ~class266.field4301) {
                        int var47;
                        if (!(var23 instanceof class141)) {
                            var47 = var23.method527(21783) / 2;
                        } else {
                            class141 var48 = (class141) var23;
                            class208 var49 = var48.field2421;
                            if (var49.field3530 == -1) {
                                var47 = var23.method527(21783) / 2;
                            } else {
                                var47 = var49.field3530 / 2;
                            }
                        }
                        class62.method397(var47, var23, (byte) -92, arg6 >> 1, arg4 >> 1, arg1, arg5);
                        if (class85.field1536 > -1) {
                            if (var46 == 1) {
                                class111.field1999 -= 20;
                            }
                            if (var46 == 2) {
                                class111.field1999 -= 10;
                                class85.field1536 -= 15;
                            }
                            if (~var46 == -4) {
                                class85.field1536 += 15;
                                class111.field1999 -= 10;
                            }
                            class98.field1691[var23.field1392[var46]].method447(arg2 + -12 + class85.field1536, class111.field1999 + arg3 + -12);
                            class267.field4318.method1623(Integer.toString(var23.field1437[var46]), class85.field1536 + -1 + arg2, class111.field1999 + arg3 + 3, 16777215, 0);
                        }
                    }
                }
            }
        }
        if (arg0 >= -43) {
            method816(-101, (byte) 113);
        }
        for (int var8 = 0; class167.field2745 > var8; ++var8) {
            int var9 = class118.field2097[var8];
            int var10 = class118.field2084[var8];
            boolean var11 = true;
            int var12 = class118.field2092[var8];
            int var13 = class118.field2095[var8];
            while (var11) {
                var11 = false;
                for (int var22 = 0; var22 < var8; ++var22) {
                    if (~(var9 - -2) < ~(class118.field2097[var22] + -class118.field2095[var22]) && -var13 + var9 < class118.field2097[var22] - -2 && ~(class118.field2092[var22] + class118.field2084[var22]) < ~(-var10 + var12) && ~(class118.field2092[var22] + -class118.field2084[var22]) > ~(var10 + var12) && var9 > class118.field2097[var22] + -class118.field2095[var22]) {
                        var9 = class118.field2097[var22] + -class118.field2095[var22];
                        var11 = true;
                    }
                }
            }
            class85.field1536 = class118.field2092[var8];
            class111.field1999 = class118.field2097[var8] = var9;
            String var14 = class118.field2085[var8];
            if (class241.field3971 == 0) {
                int var15 = 16776960;
                if (~class118.field2081[var8] > -7) {
                    var15 = class33.field469[class118.field2081[var8]];
                }
                if (~class118.field2081[var8] == -7) {
                    var15 = class71.field1166 % 20 >= 10 ? 16776960 : 16711680;
                }
                if (~class118.field2081[var8] == -8) {
                    var15 = ~(class71.field1166 % 20) > -11 ? 255 : 65535;
                }
                if (class118.field2081[var8] == 8) {
                    var15 = class71.field1166 % 20 < 10 ? 45056 : 8454016;
                }
                if (~class118.field2081[var8] == -10) {
                    int var16 = -class118.field2096[var8] + 150;
                    if (~var16 <= -51) {
                        if (~var16 > -101) {
                            var15 = -(var16 * 327680) + 33160960;
                        } else if (~var16 > -151) {
                            var15 = var16 * 5 - 500 + 65280;
                        }
                    } else {
                        var15 = var16 * 1280 + 16711680;
                    }
                }
                if (~class118.field2081[var8] == -11) {
                    int var17 = -class118.field2096[var8] + 150;
                    if (var17 >= 50) {
                        if (~var17 > -101) {
                            var15 = -(var17 * 327680) + 33095935;
                        } else if (var17 < 150) {
                            var15 = -32768000 - (var17 - 100) * 5 + var17 * 327680 + 255;
                        }
                    } else {
                        var15 = 16711680 - -(var17 * 5);
                    }
                }
                if (class118.field2081[var8] == 11) {
                    int var18 = -class118.field2096[var8] + 150;
                    if (~var18 <= -51) {
                        if (~var18 <= -101) {
                            if (~var18 > -151) {
                                var15 = 32768000 - (var18 * 327680 - 16777215);
                            }
                        } else {
                            var15 = (var18 - 50) * 327685 + 65280;
                        }
                    } else {
                        var15 = -(var18 * 327685) + 16777215;
                    }
                }
                if (class118.field2080[var8] == 0) {
                    class290.field4636.method1623(var14, class85.field1536 + arg2, class111.field1999 + arg3, var15, 0);
                }
                if (~class118.field2080[var8] == -2) {
                    class290.field4636.method1612(var14, class85.field1536 + arg2, class111.field1999 + arg3, var15, 0, class71.field1166);
                }
                if (~class118.field2080[var8] == -3) {
                    class290.field4636.method1635(var14, arg2 - -class85.field1536, class111.field1999 + arg3, var15, 0, class71.field1166);
                }
                if (class118.field2080[var8] == 3) {
                    class290.field4636.method1621(var14, class85.field1536 + arg2, class111.field1999 + arg3, var15, 0, class71.field1166, -class118.field2096[var8] + 150);
                }
                if (~class118.field2080[var8] == -5) {
                    int var19 = (-class118.field2096[var8] + 150) * (100 + class290.field4636.method1622(var14)) / 150;
                    class283.method1850(arg2 + -50 + class85.field1536, arg3, class85.field1536 + arg2 - -50, arg3 + arg4);
                    class290.field4636.method1626(var14, arg2 + 50 + -var19 + class85.field1536, arg3 - -class111.field1999, var15, 0);
                    class283.method1858(arg2, arg3, arg2 + arg6, arg3 - -arg4);
                }
                if (class118.field2080[var8] == 5) {
                    int var20 = -class118.field2096[var8] + 150;
                    class283.method1850(arg2, -class290.field4636.field4001 + -1 + arg3 + class111.field1999, arg2 + arg6, arg3 + 5 - -class111.field1999);
                    int var21 = 0;
                    if (var20 < 25) {
                        var21 = var20 - 25;
                    } else if (var20 > 125) {
                        var21 = var20 - 125;
                    }
                    class290.field4636.method1623(var14, arg2 - -class85.field1536, class111.field1999 + var21 + arg3, var15, 0);
                    class283.method1858(arg2, arg3, arg2 + arg6, arg3 + arg4);
                }
            } else {
                class290.field4636.method1623(var14, class85.field1536 + arg2, class111.field1999 + arg3, 16776960, 0);
            }
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(II)[I")
    public final int[] method23(int arg0, int arg1) {
        ++field2114;
        int[] var3 = super.field4425.method992(17118, arg1);
        if (arg0 <= 39) {
            field2112 = 87;
        }
        if (super.field4425.field2448) {
            int var4 = this.field2115 - -1 + this.field2115;
            int var5 = 65536 / var4;
            int var6 = this.field2109 + this.field2109 + 1;
            int var7 = 65536 / var6;
            int[][] var8 = new int[var4][];
            for (int var9 = -this.field2115 + arg1; ~var9 >= ~(this.field2115 + arg1); ++var9) {
                int[] var13 = this.method1805(false, 0, var9 & class125.field2189);
                int[] var14 = new int[class53.field929];
                int var15 = 0;
                for (int var16 = -this.field2109; ~var16 >= ~this.field2109; ++var16) {
                    var15 += var13[var16 & class35.field504];
                }
                int var17 = 0;
                while (var17 < class53.field929) {
                    var14[var17] = var7 * var15 >> 16;
                    int var18 = var15 - var13[-this.field2109 + var17 & class35.field504];
                    ++var17;
                    var15 = var13[class35.field504 & this.field2109 + var17] + var18;
                }
                var8[-arg1 + this.field2115 + var9] = var14;
            }
            for (int var10 = 0; class53.field929 > var10; ++var10) {
                int var11 = 0;
                for (int var12 = 0; ~var4 < ~var12; ++var12) {
                    var11 += var8[var12][var10];
                }
                var3[var10] = var5 * var11 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "()V")
    public class119() {
        super(1, false);
    }

    @OriginalMember(owner = "client!md", name = "g", descriptor = "(I)V")
    public static void method818(int arg0) {
        field2106 = null;
        field2113 = null;
        if (arg0 != 23207) {
            field2117 = true;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(ILeh;B)V")
    public final void method21(int arg0, class101 arg1, byte arg2) {
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 == -3) {
                    super.field4408 = arg1.method669((byte) 36) == 1;
                }
            } else {
                this.field2115 = arg1.method669((byte) 36);
            }
        } else {
            this.field2109 = arg1.method669((byte) 36);
        }
        if (arg2 != -1) {
            this.field2115 = -64;
        }
        ++field2107;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IIB)Z")
    public static final boolean method819(int arg0, int arg1, byte arg2) {
        ++field2110;
        if (arg2 >= -115) {
            method816(-16, (byte) -1);
        }
        if (arg0 == 11) {
            arg0 = 10;
        }
        if (~arg0 <= -6 && arg0 <= 8) {
            arg0 = 4;
        }
        class206 var3 = class10.method64(64, arg1);
        return var3.method1369(arg0, 124);
    }
}
