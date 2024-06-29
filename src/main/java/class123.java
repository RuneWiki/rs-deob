import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class123 extends class170 {

    @OriginalMember(owner = "client!gf", name = "W", descriptor = "I")
    private int field2121 = 2048;

    @OriginalMember(owner = "client!gf", name = "fb", descriptor = "I")
    private int field2130 = 10;

    @OriginalMember(owner = "client!gf", name = "Y", descriptor = "I")
    private int field2123 = 0;

    @OriginalMember(owner = "client!gf", name = "bb", descriptor = "Lqk;")
    public static class207 field2126 = class24.method212(255, "Interfaces charg-Bes");

    @OriginalMember(owner = "client!gf", name = "ab", descriptor = "I")
    public static int field2125 = 255;

    @OriginalMember(owner = "client!gf", name = "gb", descriptor = "I")
    public static int field2131 = 0;

    @OriginalMember(owner = "client!gf", name = "eb", descriptor = "Lqk;")
    public static class207 field2129 = class24.method212(255, " )2> <col=ff9040>");

    @OriginalMember(owner = "client!gf", name = "jb", descriptor = "I")
    public static int field2134 = 0;

    @OriginalMember(owner = "client!gf", name = "ib", descriptor = "I")
    public static int field2133 = 0;

    @OriginalMember(owner = "client!gf", name = "nb", descriptor = "Lqk;")
    public static class207 field2138 = class24.method212(255, "M");

    @OriginalMember(owner = "client!gf", name = "mb", descriptor = "[I")
    public static int[] field2137 = new int[14];

    @OriginalMember(owner = "client!gf", name = "Z", descriptor = "I")
    public static int field2124;

    @OriginalMember(owner = "client!gf", name = "cb", descriptor = "I")
    public static int field2127;

    @OriginalMember(owner = "client!gf", name = "db", descriptor = "I")
    public static int field2128;

    @OriginalMember(owner = "client!gf", name = "hb", descriptor = "I")
    public static int field2132;

    @OriginalMember(owner = "client!gf", name = "lb", descriptor = "I")
    public static int field2136;

    @OriginalMember(owner = "client!gf", name = "X", descriptor = "[I")
    private int[] field2122;

    @OriginalMember(owner = "client!gf", name = "kb", descriptor = "[I")
    private int[] field2135;

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "(B)V")
    private final void method864(byte arg0) {
        ++field2124;
        this.field2122 = new int[this.field2130 - -1];
        int var2 = 0;
        this.field2135 = new int[this.field2130 + 1];
        int var3 = 4096 / this.field2130;
        int var4 = this.field2121 * var3 >> 12;
        int var5 = -76 % ((40 - arg0) / 51);
        for (int var6 = 0; ~var6 > ~this.field2130; ++var6) {
            this.field2135[var6] = var2;
            this.field2122[var6] = var2 + var4;
            var2 += var3;
        }
        this.field2135[this.field2130] = 4096;
        this.field2122[this.field2130] = 4096 - -this.field2122[0];
    }

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "(B)V")
    public static void method865(byte arg0) {
        field2129 = null;
        field2137 = null;
        field2138 = null;
        field2126 = null;
        if (arg0 != 115) {
            field2137 = null;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lv;II)V")
    public final void method29(class149 arg0, int arg1, int arg2) {
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (arg2 == 2) {
                    this.field2123 = arg0.method1045((byte) 77);
                }
            } else {
                this.field2121 = arg0.method1050(arg1 ^ 1272009053);
            }
        } else {
            this.field2130 = arg0.method1045((byte) 105);
        }
        ++field2136;
        if (arg1 != 5877) {
            field2126 = null;
        }
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(BI)[I")
    public final int[] method31(byte arg0, int arg1) {
        if (arg0 != -30) {
            return null;
        } else {
            ++field2132;
            int[] var3 = super.field3001.method1538(94, arg1);
            if (super.field3001.field3835) {
                int var4 = class282.field4964[arg1];
                if (~this.field2123 != -1) {
                    for (int var5 = 0; var5 < class88.field1595; ++var5) {
                        short var6 = 0;
                        int var7 = 0;
                        int var8 = class68.field1211[var5];
                        int var9 = this.field2123;
                        if (var9 != 1) {
                            if (~var9 != -3) {
                                if (var9 == 3) {
                                    var7 = (-var4 + var8 >> 1) + 2048;
                                }
                            } else {
                                var7 = 2048 - -(var4 + var8 + -4096 >> 1);
                            }
                        } else {
                            var7 = var8;
                        }
                        for (int var10 = 0; var10 < this.field2130; ++var10) {
                            if (var7 >= this.field2135[var10] && this.field2135[var10 + 1] > var7) {
                                if (~this.field2122[var10] < ~var7) {
                                    var6 = 4096;
                                }
                                break;
                            }
                        }
                        var3[var5] = var6;
                    }
                } else {
                    short var11 = 0;
                    for (int var12 = 0; var12 < this.field2130; ++var12) {
                        if (~this.field2135[var12] >= ~var4 && ~var4 > ~this.field2135[var12 - -1]) {
                            if (var4 < this.field2122[var12]) {
                                var11 = 4096;
                            }
                            break;
                        }
                    }
                    class274.method1862(var3, 0, class88.field1595, var11);
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIIIIII)V")
    public static final void method866(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg5 != 10) {
            method866(15, -42, 44, -58, -66, 46, -71);
        }
        ++field2128;
        class154.field2674 = 0;
        for (int var7 = -1; class31.field629 + class138.field2390 > var7; ++var7) {
            class286 var23;
            if (var7 == -1) {
                var23 = class202.field3565;
            } else if (~var7 <= ~class31.field629) {
                var23 = class79.field1449[class117.field2036[-class31.field629 + var7]];
            } else {
                var23 = class169.field2953[class10.field149[var7]];
            }
            if (var23 != null && var23.method90((byte) -99)) {
                if (var23 instanceof class256) {
                    class72 var24 = ((class256) var23).field4581;
                    if (var24.field1293 != null) {
                        var24 = var24.method517(-27);
                    }
                    if (var24 == null) {
                        continue;
                    }
                }
                if (~class31.field629 >= ~var7) {
                    class72 var25 = ((class256) var23).field4581;
                    if (var25.field1293 != null) {
                        var25 = var25.method517(arg5 ^ -111);
                    }
                    if (var25.field1309 >= 0 && ~var25.field1309 > ~class236.field4356.length) {
                        int var26;
                        if (~var25.field1307 != 0) {
                            var26 = var25.field1307 + 15;
                        } else {
                            var26 = var23.method1942((byte) -82) - -15;
                        }
                        class60.method450(arg2 >> 1, var26, arg0, -3125, arg6 >> 1, var23, arg3);
                        if (class125.field2179 > -1) {
                            class236.field4356[var25.field1309].method381(class125.field2179 - 12 + arg1, arg4 + -30 + class234.field4334);
                        }
                    }
                    class156[] var27 = class170.field3025;
                    for (int var28 = 0; ~var27.length < ~var28; ++var28) {
                        class156 var29 = var27[var28];
                        if (var29 != null && ~var29.field2749 == -2 && class117.field2036[-class31.field629 + var7] == var29.field2740 && class160.field2844 % 20 < 10) {
                            int var30;
                            if (~var25.field1307 == 0) {
                                var30 = 15 + var23.method1942((byte) -66);
                            } else {
                                var30 = var25.field1307 + 15;
                            }
                            class60.method450(arg2 >> 1, var30, arg0, -3125, arg6 >> 1, var23, arg3);
                            if (~class125.field2179 < 0) {
                                class67.field1191[var29.field2750].method381(arg1 + -12 + class125.field2179, arg4 - (-class234.field4334 - -28));
                            }
                        }
                    }
                } else {
                    int var31 = 30;
                    class14 var32 = (class14) var23;
                    if (~var32.field199 != 0 || var32.field216 != -1) {
                        class60.method450(arg2 >> 1, 15 + var23.method1942((byte) -121), arg0, -3125, arg6 >> 1, var23, arg3);
                        if (~class125.field2179 < 0) {
                            if (var32.field199 != -1) {
                                class134.field2319[var32.field199].method381(class125.field2179 + -12 + arg1, class234.field4334 + arg4 + -var31);
                                var31 += 25;
                            }
                            if (var32.field216 != -1) {
                                class236.field4356[var32.field216].method381(arg1 + -12 - -class125.field2179, -var31 + arg4 + class234.field4334);
                                var31 += 25;
                            }
                        }
                    }
                    if (~var7 <= -1) {
                        int var33 = 0;
                        class156[] var34 = class170.field3025;
                        while (var33 < var34.length) {
                            class156 var35 = var34[var33];
                            if (var35 != null && var35.field2749 == 10 && ~class10.field149[var7] == ~var35.field2740) {
                                class60.method450(arg2 >> 1, var23.method1942((byte) -83) + 15, arg0, -3125, arg6 >> 1, var23, arg3);
                                if (class125.field2179 > -1) {
                                    class67.field1191[var35.field2750].method381(class125.field2179 + -12 + arg1, -var31 + class234.field4334 + arg4);
                                }
                            }
                            ++var33;
                        }
                    }
                }
                if (var23.field5019 != null && (~var7 <= ~class31.field629 || class82.field1507 == 0 || class82.field1507 == 3 || ~class82.field1507 == -2 && class3.method20(-122, ((class14) var23).field209))) {
                    class60.method450(arg2 >> 1, var23.method1942((byte) -72), arg0, -3125, arg6 >> 1, var23, arg3);
                    if (~class125.field2179 < 0 && class47.field928 > class154.field2674) {
                        class47.field933[class154.field2674] = class284.field4996.method1608(var23.field5019) / 2;
                        class47.field937[class154.field2674] = class284.field4996.field4124;
                        class47.field941[class154.field2674] = class125.field2179;
                        class47.field930[class154.field2674] = class234.field4334;
                        class47.field924[class154.field2674] = var23.field5033;
                        class47.field932[class154.field2674] = var23.field5043;
                        class47.field935[class154.field2674] = var23.field5025;
                        class47.field927[class154.field2674] = var23.field5019;
                        ++class154.field2674;
                    }
                }
                if (~class160.field2844 > ~var23.field5056) {
                    class100 var36 = class110.field1924[0];
                    class100 var37 = class110.field1924[1];
                    int var41;
                    if (var23 instanceof class256) {
                        class256 var38 = (class256) var23;
                        class100[] var39 = (class100[]) class101.field1815.method1387((long) var38.field4581.field1299, 121);
                        if (var39 == null) {
                            var39 = class174.method1250(var38.field4581.field1299, 0, class101.field1832, -18546);
                            if (var39 != null) {
                                class101.field1815.method1385((long) var38.field4581.field1299, var39, (byte) -116);
                            }
                        }
                        class72 var40 = var38.field4581;
                        if (var39 != null && ~var39.length == -3) {
                            var36 = var39[0];
                            var37 = var39[1];
                        }
                        if (var40.field1307 == -1) {
                            var41 = var23.method1942((byte) -99);
                        } else {
                            var41 = var40.field1307;
                        }
                    } else {
                        var41 = var23.method1942((byte) -68);
                    }
                    class60.method450(arg2 >> 1, var41 + 10 - -var36.field1811, arg0, arg5 ^ -3135, arg6 >> 1, var23, arg3);
                    if (class125.field2179 > -1) {
                        int var42 = class234.field4334 + arg4 + -3;
                        int var43 = class125.field2179 + arg1 + -(var36.field1802 >> 1);
                        var36.method381(var43, var42);
                        int var44 = var36.field1811;
                        int var45 = var23.field5060 * var36.field1802 / 255;
                        class23.method157(var43, var42, var43 - -var45, var42 + var44);
                        var37.method381(var43, var42);
                        class23.method164(arg1, arg4, arg1 + arg2, arg4 + arg6);
                    }
                }
                for (int var46 = 0; ~var46 > -5; ++var46) {
                    if (~var23.field5049[var46] < ~class160.field2844) {
                        int var47;
                        if (!(var23 instanceof class256)) {
                            var47 = var23.method1942((byte) -100) / 2;
                        } else {
                            class256 var48 = (class256) var23;
                            class72 var49 = var48.field4581;
                            if (var49.field1307 != -1) {
                                var47 = var49.field1307 / 2;
                            } else {
                                var47 = var23.method1942((byte) -127) / 2;
                            }
                        }
                        class60.method450(arg2 >> 1, var47, arg0, -3125, arg6 >> 1, var23, arg3);
                        if (~class125.field2179 < 0) {
                            if (~var46 == -2) {
                                class234.field4334 -= 20;
                            }
                            if (~var46 == -3) {
                                class125.field2179 -= 15;
                                class234.field4334 -= 10;
                            }
                            if (~var46 == -4) {
                                class234.field4334 -= 10;
                                class125.field2179 += 15;
                            }
                            class188.field3323[var23.field5063[var46]].method381(class125.field2179 + -12 + arg1, arg4 + -12 - -class234.field4334);
                            class167.field2940.method1600(class262.method1815(var23.field5029[var46], (byte) -121), class125.field2179 + arg1 - 1, class234.field4334 + arg4 - -3, 16777215, 0);
                        }
                    }
                }
            }
        }
        for (int var8 = 0; ~class154.field2674 < ~var8; ++var8) {
            int var9 = class47.field930[var8];
            int var10 = class47.field941[var8];
            int var11 = class47.field933[var8];
            int var12 = class47.field937[var8];
            boolean var13 = true;
            while (var13) {
                var13 = false;
                for (int var22 = 0; ~var22 > ~var8; ++var22) {
                    if (~(class47.field930[var22] + -class47.field937[var22]) > ~(var9 + 2) && ~(class47.field930[var22] + 2) < ~(var9 - var12) && ~(class47.field941[var22] + class47.field933[var22]) < ~(var10 - var11) && class47.field941[var22] - class47.field933[var22] < var10 + var11 && class47.field930[var22] + -class47.field937[var22] < var9) {
                        var13 = true;
                        var9 = class47.field930[var22] + -class47.field937[var22];
                    }
                }
            }
            class125.field2179 = class47.field941[var8];
            class234.field4334 = class47.field930[var8] = var9;
            class207 var14 = class47.field927[var8];
            if (~class265.field4695 == -1) {
                int var15 = 16776960;
                if (class47.field924[var8] < 6) {
                    var15 = class105.field1861[class47.field924[var8]];
                }
                if (class47.field924[var8] == 6) {
                    var15 = class89.field1609 % 20 < 10 ? 16711680 : 16776960;
                }
                if (~class47.field924[var8] == -8) {
                    var15 = class89.field1609 % 20 < 10 ? 255 : 65535;
                }
                if (~class47.field924[var8] == -9) {
                    var15 = ~(class89.field1609 % 20) <= -11 ? 8454016 : 45056;
                }
                if (~class47.field924[var8] == -10) {
                    int var16 = -class47.field935[var8] + 150;
                    if (var16 >= 50) {
                        if (~var16 <= -101) {
                            if (~var16 > -151) {
                                var15 = (var16 + -100) * 5 + 65280;
                            }
                        } else {
                            var15 = -(var16 * 327680) - -33160960;
                        }
                    } else {
                        var15 = var16 * 1280 + 16711680;
                    }
                }
                if (~class47.field924[var8] == -11) {
                    int var17 = 150 - class47.field935[var8];
                    if (var17 >= 50) {
                        if (~var17 <= -101) {
                            if (~var17 > -151) {
                                var15 = var17 * 327680 + (-(var17 * 5) + -32768000 - -500) + 255;
                            }
                        } else {
                            var15 = -((var17 - 50) * 327680) + 16711935;
                        }
                    } else {
                        var15 = var17 * 5 + 16711680;
                    }
                }
                if (class47.field924[var8] == 11) {
                    int var18 = -class47.field935[var8] + 150;
                    if (var18 >= 50) {
                        if (var18 >= 100) {
                            if (var18 < 150) {
                                var15 = 16777215 - (var18 * 327680 + -32768000);
                            }
                        } else {
                            var15 = 65280 - (-(var18 * 327685) + 16384250);
                        }
                    } else {
                        var15 = -(var18 * 327685) + 16777215;
                    }
                }
                if (class47.field932[var8] == 0) {
                    class284.field4996.method1600(var14, class125.field2179 + arg1, class234.field4334 + arg4, var15, 0);
                }
                if (class47.field932[var8] == 1) {
                    class284.field4996.method1596(var14, class125.field2179 + arg1, class234.field4334 + arg4, var15, 0, class89.field1609);
                }
                if (class47.field932[var8] == 2) {
                    class284.field4996.method1604(var14, class125.field2179 + arg1, arg4 - -class234.field4334, var15, 0, class89.field1609);
                }
                if (class47.field932[var8] == 3) {
                    class284.field4996.method1592(var14, class125.field2179 + arg1, arg4 - -class234.field4334, var15, 0, class89.field1609, -class47.field935[var8] + 150);
                }
                if (class47.field932[var8] == 4) {
                    int var19 = (150 - class47.field935[var8]) * (100 + class284.field4996.method1608(var14)) / 150;
                    class23.method157(arg1 - 50 + class125.field2179, arg4, class125.field2179 + arg1 + 50, arg4 + arg6);
                    class284.field4996.method1613(var14, class125.field2179 + arg1 - -50 - var19, class234.field4334 + arg4, var15, 0);
                    class23.method164(arg1, arg4, arg1 + arg2, arg4 + arg6);
                }
                if (~class47.field932[var8] == -6) {
                    int var20 = 0;
                    int var21 = -class47.field935[var8] + 150;
                    if (~var21 > -26) {
                        var20 = var21 - 25;
                    } else if (var21 > 125) {
                        var20 = var21 + -125;
                    }
                    class23.method157(arg1, class234.field4334 + arg4 - class284.field4996.field4124 + -1, arg1 + arg2, class234.field4334 + arg4 + 5);
                    class284.field4996.method1600(var14, class125.field2179 + arg1, arg4 - (-class234.field4334 - var20), var15, 0);
                    class23.method164(arg1, arg4, arg1 + arg2, arg4 + arg6);
                }
            } else {
                class284.field4996.method1600(var14, class125.field2179 + arg1, class234.field4334 + arg4, 16776960, 0);
            }
        }
    }

    @OriginalMember(owner = "client!gf", name = "<init>", descriptor = "()V")
    public class123() {
        super(0, true);
    }

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "(I)V")
    public final void method50(int arg0) {
        if (arg0 >= 14) {
            ++field2127;
            this.method864((byte) -115);
        }
    }
}
