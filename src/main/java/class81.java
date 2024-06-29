import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class81 extends class141 {

    @OriginalMember(owner = "client!mi", name = "ac", descriptor = "Z")
    public boolean field1543 = false;

    @OriginalMember(owner = "client!mi", name = "Xb", descriptor = "I")
    public int field1540 = -1;

    @OriginalMember(owner = "client!mi", name = "bc", descriptor = "S")
    private short field1544 = 0;

    @OriginalMember(owner = "client!mi", name = "Pb", descriptor = "I")
    private int field1532 = 0;

    @OriginalMember(owner = "client!mi", name = "Nb", descriptor = "I")
    public int field1530 = 0;

    @OriginalMember(owner = "client!mi", name = "Ub", descriptor = "I")
    public int field1537 = 0;

    @OriginalMember(owner = "client!mi", name = "dc", descriptor = "I")
    public int field1546 = -1;

    @OriginalMember(owner = "client!mi", name = "Qb", descriptor = "S")
    private short field1533 = 0;

    @OriginalMember(owner = "client!mi", name = "kc", descriptor = "I")
    public int field1553 = -1;

    @OriginalMember(owner = "client!mi", name = "nc", descriptor = "I")
    public int field1556 = -1;

    @OriginalMember(owner = "client!mi", name = "fc", descriptor = "I")
    public int field1548 = 0;

    @OriginalMember(owner = "client!mi", name = "hc", descriptor = "I")
    public int field1550 = 0;

    @OriginalMember(owner = "client!mi", name = "ic", descriptor = "I")
    public int field1551 = -1;

    @OriginalMember(owner = "client!mi", name = "Wb", descriptor = "I")
    public int field1539 = 0;

    @OriginalMember(owner = "client!mi", name = "Ob", descriptor = "I")
    public int field1531 = -1;

    @OriginalMember(owner = "client!mi", name = "qc", descriptor = "I")
    public int field1559 = 0;

    @OriginalMember(owner = "client!mi", name = "ec", descriptor = "I")
    public int field1547 = 0;

    @OriginalMember(owner = "client!mi", name = "Mb", descriptor = "I")
    public int field1529;

    @OriginalMember(owner = "client!mi", name = "Sb", descriptor = "I")
    public static int field1535;

    @OriginalMember(owner = "client!mi", name = "Tb", descriptor = "I")
    public static int field1536;

    @OriginalMember(owner = "client!mi", name = "Vb", descriptor = "I")
    public static int field1538;

    @OriginalMember(owner = "client!mi", name = "Yb", descriptor = "I")
    public static int field1541;

    @OriginalMember(owner = "client!mi", name = "Zb", descriptor = "I")
    public static int field1542;

    @OriginalMember(owner = "client!mi", name = "cc", descriptor = "I")
    public int field1545;

    @OriginalMember(owner = "client!mi", name = "gc", descriptor = "I")
    public int field1549;

    @OriginalMember(owner = "client!mi", name = "jc", descriptor = "I")
    public static int field1552;

    @OriginalMember(owner = "client!mi", name = "lc", descriptor = "I")
    public static int field1554;

    @OriginalMember(owner = "client!mi", name = "mc", descriptor = "I")
    public int field1555;

    @OriginalMember(owner = "client!mi", name = "oc", descriptor = "I")
    public static int field1557;

    @OriginalMember(owner = "client!mi", name = "pc", descriptor = "I")
    public static int field1558;

    @OriginalMember(owner = "client!mi", name = "rc", descriptor = "I")
    public static int field1560;

    @OriginalMember(owner = "client!mi", name = "sc", descriptor = "I")
    public static int field1561;

    @OriginalMember(owner = "client!mi", name = "tc", descriptor = "I")
    public static int field1562;

    @OriginalMember(owner = "client!mi", name = "uc", descriptor = "I")
    public static int field1563;

    @OriginalMember(owner = "client!mi", name = "vc", descriptor = "I")
    public int field1564;

    @OriginalMember(owner = "client!mi", name = "wc", descriptor = "I")
    public int field1565;

    @OriginalMember(owner = "client!mi", name = "xc", descriptor = "I")
    public int field1566;

    @OriginalMember(owner = "client!mi", name = "yc", descriptor = "I")
    public static int field1567;

    @OriginalMember(owner = "client!mi", name = "zc", descriptor = "I")
    public static int field1568;

    @OriginalMember(owner = "client!mi", name = "Bc", descriptor = "I")
    public static int field1570;

    @OriginalMember(owner = "client!mi", name = "Rb", descriptor = "Lpi;")
    public static class181 field1534;

    @OriginalMember(owner = "client!mi", name = "Ac", descriptor = "Lme;")
    public class36 field1569;

    @OriginalMember(owner = "client!mi", name = "Lb", descriptor = "Lha;")
    public class46 field1528;

    @OriginalMember(owner = "client!mi", name = "Kb", descriptor = "Lia;")
    public class76 field1527;

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "(I)Lha;")
    public final class46 method636(int arg0) {
        class46 var2 = this.field1528;
        if (class233.field4055 != null) {
            var2 = class109.method855(0, new class46[] { class233.field4055[this.field1532], var2 });
        }
        if (arg0 != -1537) {
            this.method642(66);
        }
        if (class122.field2269 != null) {
            var2 = class109.method855(0, new class46[] { var2, class122.field2269[this.field1532] });
        }
        ++field1562;
        return var2;
    }

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "(I)V")
    public static final void method637(int arg0) {
        ++field1560;
        if (~class258.method1737(arg0 ^ 3) == -3) {
            byte var1 = (byte) (255 & class252.field4443 + -4);
            int var2 = class252.field4443 % 104;
            for (int var3 = 0; var3 < 4; ++var3) {
                for (int var16 = 0; var16 < 104; ++var16) {
                    class60.field1001[var3][var2][var16] = var1;
                }
            }
            if (~class135.field2450 != -4) {
                for (int var4 = arg0; ~var4 > -3; ++var4) {
                    class98.field1825[var4] = -1000000;
                    class84.field1606[var4] = 1000000;
                    class89.field1691[var4] = 0;
                    class102.field1860[var4] = 1000000;
                    class15.field228[var4] = 0;
                }
                if (~class154.field2735 == -2) {
                    if (~(class111.field2081[class135.field2450][class277.field4824.field2585 >> 7][class277.field4824.field2546 >> 7] & 4) != -1) {
                        class216.method1515((byte) -39, false, class277.field4824.field2585 >> 7, class111.field2080, class277.field4824.field2546 >> 7, 0);
                    }
                    if (~class57.field958 > -311) {
                        int var5 = class161.field2849 >> 7;
                        int var6 = class134.field2425 >> 7;
                        int var7 = class277.field4824.field2585 >> 7;
                        int var8 = class277.field4824.field2546 >> 7;
                        int var9;
                        if (var7 > var5) {
                            var9 = var7 - var5;
                        } else {
                            var9 = -var7 + var5;
                        }
                        int var10;
                        if (var6 >= var8) {
                            var10 = var6 - var8;
                        } else {
                            var10 = var8 - var6;
                        }
                        if (var9 <= var10) {
                            int var11 = var9 * 65536 / var10;
                            int var12 = 32768;
                            while (var6 != var8) {
                                if (var6 >= var8) {
                                    if (~var6 < ~var8) {
                                        --var6;
                                    }
                                } else {
                                    ++var6;
                                }
                                if ((4 & class111.field2081[class135.field2450][var5][var6]) != 0) {
                                    class216.method1515((byte) -39, false, var5, class111.field2080, var6, 1);
                                    return;
                                }
                                var12 += var11;
                                if (var12 >= 65536) {
                                    var12 -= 65536;
                                    if (~var5 > ~var7) {
                                        ++var5;
                                    } else if (var7 < var5) {
                                        --var5;
                                    }
                                    if ((4 & class111.field2081[class135.field2450][var5][var6]) != 0) {
                                        class216.method1515((byte) -39, false, var5, class111.field2080, var6, 1);
                                        return;
                                    }
                                }
                            }
                            return;
                        }
                        int var13 = var10 * 65536 / var9;
                        int var14 = 32768;
                        while (var5 != var7) {
                            if (var7 <= var5) {
                                if (var5 > var7) {
                                    --var5;
                                }
                            } else {
                                ++var5;
                            }
                            if (~(4 & class111.field2081[class135.field2450][var5][var6]) != -1) {
                                class216.method1515((byte) -39, false, var5, class111.field2080, var6, 1);
                                return;
                            }
                            var14 += var13;
                            if (var14 >= 65536) {
                                var14 -= 65536;
                                if (~var8 < ~var6) {
                                    ++var6;
                                } else if (~var6 < ~var8) {
                                    --var6;
                                }
                                if (~(4 & class111.field2081[class135.field2450][var5][var6]) != -1) {
                                    class216.method1515((byte) -39, false, var5, class111.field2080, var6, 1);
                                    return;
                                }
                            }
                        }
                        return;
                    }
                } else {
                    int var15 = class206.method1461(class134.field2425, class135.field2450, class161.field2849, 4);
                    if (var15 - class26.field513 >= 800 || (class111.field2081[class135.field2450][class161.field2849 >> 7][class134.field2425 >> 7] & 4) == 0) {
                        return;
                    }
                    class216.method1515((byte) -39, false, class161.field2849 >> 7, class111.field2080, class134.field2425 >> 7, 1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method185(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        ++field1568;
        if (this.field1527 != null) {
            class170 var11 = ~super.field2575 != 0 && ~super.field2533 == -1 ? class119.method951(0, super.field2575) : null;
            class170 var12 = ~super.field2537 == 0 || this.field1543 || ~super.field2553 == ~super.field2537 && var11 != null ? null : class119.method951(0, super.field2537);
            class36 var13 = this.field1527.method610(false, super.field2579, super.field2584, var11, var12);
            if (var13 != null) {
                super.field2525 = var13.method183();
                if (class250.field4416 && (this.field1527.field1415 == -1 || class156.method1152(this.field1527.field1415, (byte) -114).field1483)) {
                    class36 var14 = class198.method1413((byte) -111, 1, var13, 240, super.field2585, var12 != null ? var12 : var11, 0, super.field2572, super.field2546, super.field2520, arg0, 0, 160, var12 != null ? super.field2584 : super.field2579);
                    var14.method185(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L);
                }
                if (class277.field4824 == this) {
                    for (int var15 = class84.field1611.length + -1; ~var15 <= -1; --var15) {
                        class222 var16 = class84.field1611[var15];
                        if (var16 != null && var16.field3908 != -1) {
                            if (~var16.field3899 == -2 && ~var16.field3904 <= -1 && class2.field29.length > var16.field3904) {
                                class26 var17 = class2.field29[var16.field3904];
                                if (var17 != null) {
                                    int var18 = var17.field2585 / 32 + -(class277.field4824.field2585 / 32);
                                    int var19 = var17.field2546 / 32 - class277.field4824.field2546 / 32;
                                    this.method640(arg4, -102, arg3, arg7, var19, arg6, arg2, arg1, arg5, var13, var16.field3908, var18, arg0);
                                }
                            }
                            if (~var16.field3899 == -3) {
                                int var20 = (-class29.field567 + var16.field3913) * 4 - -2 - class277.field4824.field2585 / 32;
                                int var21 = (-class77.field1432 + var16.field3898) * 4 - class277.field4824.field2546 / 32 + 2;
                                this.method640(arg4, -114, arg3, arg7, var21, arg6, arg2, arg1, arg5, var13, var16.field3908, var20, arg0);
                            }
                            if (~var16.field3899 == -11 && ~var16.field3904 <= -1 && ~class1.field6.length < ~var16.field3904) {
                                class81 var22 = class1.field6[var16.field3904];
                                if (var22 != null) {
                                    int var23 = var22.field2585 / 32 + -(class277.field4824.field2585 / 32);
                                    int var24 = var22.field2546 / 32 + -(class277.field4824.field2546 / 32);
                                    this.method640(arg4, 103, arg3, arg7, var24, arg6, arg2, arg1, arg5, var13, var16.field3908, var23, arg0);
                                }
                            }
                        }
                    }
                }
                int var25 = 0;
                int var26 = 0;
                int var27 = 0;
                if (this.field1533 != 0 && this.field1544 != 0) {
                    int var28 = class62.field1049[arg0];
                    int var29 = class62.field1042[arg0];
                    short var30 = this.field1544;
                    short var31 = this.field1533;
                    int var32 = -var30 / 2;
                    int var33 = -var31 / 2;
                    int var34 = var28 * var32 + -(var29 * var33) >> 16;
                    int var35 = var28 * var33 + var29 * var32 >> 16;
                    int var36 = class206.method1461(super.field2546 + var34, class135.field2450, super.field2585 + var35, 4);
                    int var37 = var31 / 2;
                    int var38 = -var30 / 2;
                    int var39 = var28 * var38 - var29 * var37 >> 16;
                    int var40 = -var31 / 2;
                    int var41 = var30 / 2;
                    int var42 = var28 * var37 + var29 * var38 >> 16;
                    int var43 = var28 * var41 + -(var29 * var40) >> 16;
                    int var44 = var31 / 2;
                    int var45 = class206.method1461(super.field2546 + var39, class135.field2450, super.field2585 + var42, 4);
                    int var46 = var30 / 2;
                    int var47 = var28 * var40 + var29 * var41 >> 16;
                    int var48 = class206.method1461(super.field2546 + var43, class135.field2450, super.field2585 + var47, 4);
                    int var49 = var29 * var46 - -(var28 * var44) >> 16;
                    int var50 = var28 * var46 - var29 * var44 >> 16;
                    int var51 = ~var36 > ~var45 ? var36 : var45;
                    int var52 = class206.method1461(super.field2546 + var50, class135.field2450, super.field2585 + var49, 4);
                    int var53 = var36 - -var52;
                    if (~var53 < ~(var45 + var48)) {
                        var53 = var45 - -var48;
                    }
                    int var54 = var45 >= var52 ? var52 : var45;
                    int var55 = ~var36 <= ~var48 ? var48 : var36;
                    int var56 = ~var48 > ~var52 ? var48 : var52;
                    var25 = 2047 & (int) (325.95D * Math.atan2((double) (-var56 + var51), (double) var30));
                    if (var25 != 0) {
                        var13.method242(var25);
                    }
                    var26 = (int) (Math.atan2((double) (-var54 + var55), (double) var31) * 325.95D) & 2047;
                    if (var26 != 0) {
                        var13.method229(var26);
                    }
                    var27 = (var53 >> 1) + -super.field2572;
                    if (var27 != 0) {
                        var13.method241(0, var27, 0);
                    }
                }
                class36 var57 = null;
                if (!this.field1543 && super.field2543 != -1 && super.field2544 != -1) {
                    class272 var58 = class138.method1054(-22225, super.field2543);
                    var57 = var58.method1831((byte) 127, super.field2544);
                    if (var57 != null) {
                        var57.method241(0, -super.field2581, 0);
                        if (var58.field4759) {
                            if (~var25 != -1) {
                                var57.method242(var25);
                            }
                            if (~var26 != -1) {
                                var57.method229(var26);
                            }
                            if (var27 != 0) {
                                var57.method241(0, var27, 0);
                            }
                        }
                    }
                }
                class36 var59 = null;
                if (!this.field1543 && this.field1569 != null) {
                    if (~this.field1559 >= ~class157.field2803) {
                        this.field1569 = null;
                    }
                    if (~class157.field2803 <= ~this.field1539 && ~class157.field2803 > ~this.field1559) {
                        var59 = this.field1569;
                        var59.method241(this.field1565 - super.field2585, -super.field2572 + this.field1564, -super.field2546 + this.field1566);
                        if (~super.field2526 != -513) {
                            if (~super.field2526 == -1025) {
                                var59.method233();
                            } else if (~super.field2526 == -1537) {
                                var59.method237();
                            }
                        } else {
                            var59.method227();
                        }
                    }
                }
                if (var57 != null) {
                    var13 = ((class192) var13).method1385(var57);
                }
                if (var59 != null) {
                    var13 = ((class192) var13).method1385(var59);
                }
                var13.field646 = true;
                var13.method185(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
                if (var59 != null) {
                    if (super.field2526 != 512) {
                        if (~super.field2526 == -1025) {
                            var59.method233();
                        } else if (~super.field2526 == -1537) {
                            var59.method227();
                        }
                    } else {
                        var59.method237();
                    }
                    var59.method241(super.field2585 - this.field1565, -this.field1564 + super.field2572, super.field2546 - this.field1566);
                }
            }
        }
    }

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "(B)V")
    public static void method638(byte arg0) {
        if (arg0 > -74) {
            field1538 = 40;
        }
        field1534 = null;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIIZIII)V")
    public static final void method639(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        ++field1557;
        if (class38.field669 != arg4 || class97.field1801 != arg1 || ~class243.field4321 != ~arg6 && !class180.method1291(arg2 ^ 2047)) {
            class38.field669 = arg4;
            class243.field4321 = arg6;
            class97.field1801 = arg1;
            if (class180.method1291(arg2 ^ 2047)) {
                class243.field4321 = 0;
            }
            if (arg3) {
                class83.method661(28, arg2);
            } else {
                class83.method661(25, arg2);
            }
            class131.method1014((byte) 122, true, class181.field3256);
            int var7 = class29.field567;
            class29.field567 = (arg4 + -6) * 8;
            int var8 = class77.field1432;
            class77.field1432 = (arg1 + -6) * 8;
            class255.field4467 = class170.method1212(class38.field669 * 8, class97.field1801 * 8, 15110);
            int var9 = class29.field567 - var7;
            int var10 = -var8 + class77.field1432;
            class227.field3974 = null;
            int var11 = class29.field567;
            int var12 = class77.field1432;
            if (!arg3) {
                for (int var13 = 0; ~var13 > -32769; ++var13) {
                    class26 var14 = class2.field29[var13];
                    if (var14 != null) {
                        for (int var15 = 0; var15 < 10; ++var15) {
                            var14.field2523[var15] -= var9;
                            var14.field2517[var15] -= var10;
                        }
                        var14.field2585 -= var9 * 128;
                        var14.field2546 -= var10 * 128;
                    }
                }
            } else {
                class51.field888 = 0;
                for (int var16 = 0; var16 < 32768; ++var16) {
                    class26 var32 = class2.field29[var16];
                    if (var32 != null) {
                        var32.field2546 -= var10 * 128;
                        var32.field2585 -= var9 * 128;
                        if (var32.field2585 >= 0 && ~var32.field2585 >= -13185 && var32.field2546 >= 0 && var32.field2546 <= 13184) {
                            for (int var33 = 0; ~var33 > -11; ++var33) {
                                var32.field2523[var33] -= var9;
                                var32.field2517[var33] -= var10;
                            }
                            class33.field612[class51.field888++] = var16;
                        } else {
                            class2.field29[var16].field511 = null;
                            class2.field29[var16] = null;
                        }
                    }
                }
            }
            for (int var17 = 0; var17 < 2048; ++var17) {
                class81 var30 = class1.field6[var17];
                if (var30 != null) {
                    for (int var31 = 0; ~var31 > -11; ++var31) {
                        var30.field2523[var31] -= var9;
                        var30.field2517[var31] -= var10;
                    }
                    var30.field2585 -= var9 * 128;
                    var30.field2546 -= var10 * 128;
                }
            }
            class135.field2450 = arg6;
            class277.field4824.method643(false, arg5, 27512, arg0);
            byte var18 = 0;
            byte var19 = 104;
            byte var20 = 1;
            if (~var9 > -1) {
                var18 = 103;
                var20 = -1;
                var19 = -1;
            }
            byte var21 = 104;
            byte var22 = 1;
            int var23 = arg2;
            if (var10 < 0) {
                var21 = -1;
                var22 = -1;
                var23 = 103;
            }
            for (int var24 = var18; ~var19 != ~var24; var24 += var20) {
                for (int var26 = var23; ~var21 != ~var26; var26 += var22) {
                    int var27 = var9 + var24;
                    int var28 = var10 + var26;
                    for (int var29 = 0; ~var29 > -5; ++var29) {
                        if (var27 >= 0 && ~var28 <= -1 && ~var27 > -105 && var28 < 104) {
                            class103.field1874[var29][var24][var26] = class103.field1874[var29][var27][var28];
                        } else {
                            class103.field1874[var29][var24][var26] = null;
                        }
                    }
                }
            }
            for (class65 var25 = (class65) class174.field3143.method264(-82); var25 != null; var25 = (class65) class174.field3143.method269((byte) 7)) {
                var25.field1094 -= var9;
                var25.field1096 -= var10;
                if (var25.field1094 < 0 || var25.field1096 < 0 || var25.field1094 >= 104 || var25.field1096 >= 104) {
                    var25.method501(0);
                }
            }
            if (~class48.field832 != -1) {
                class48.field832 -= var9;
                class124.field2288 -= var10;
            }
            if (!arg3) {
                class154.field2735 = 1;
            } else {
                class12.field198 -= var10;
                class149.field2670 -= var10;
                class143.field2605 -= var9;
                class15.field224 -= var9;
            }
            class225.field3938 = -1;
            class273.field4775 = 0;
            class40.field696.method266(5);
            class15.field222.method266(arg2 ^ 5);
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIIIIIIIILme;III)V")
    private final void method640(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class36 arg9, int arg10, int arg11, int arg12) {
        ++field1542;
        int var14 = arg4 * arg4 + arg11 * arg11;
        int var15 = -127 / ((-29 - arg1) / 54);
        if (var14 >= 16 && var14 <= 360000) {
            int var16 = 2047 & (int) (325.949D * Math.atan2((double) arg11, (double) arg4));
            class36 var17 = class217.method1517(super.field2546, (byte) -113, super.field2572, super.field2585, arg9, arg10, var16);
            if (var17 != null) {
                var17.method185(0, arg7, arg6, arg2, arg0, arg8, arg5, arg3, -1L);
            }
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Z)Lkg;")
    public static final class21 method641(boolean arg0) {
        ++field1541;
        int var1 = class219.field3858[0] * class118.field2209[0];
        byte[] var2 = class273.field4765[0];
        class21 var6;
        if (class238.field4231[0]) {
            byte[] var3 = class87.field1650[0];
            int[] var4 = new int[var1];
            for (int var5 = 0; var1 > var5; ++var5) {
                var4[var5] = class235.method1595(class107.field1980[class50.method369(255, var2[var5])], class50.method369(-16777216, var3[var5] << 24));
            }
            var6 = new class72(class222.field3911, class3.field45, class56.field939[0], class215.field3816[0], class219.field3858[0], class118.field2209[0], var4);
        } else {
            int[] var7 = new int[var1];
            for (int var8 = 0; var8 < var1; ++var8) {
                var7[var8] = class107.field1980[class50.method369(var2[var8], 255)];
            }
            var6 = new class21(class222.field3911, class3.field45, class56.field939[0], class215.field3816[0], class219.field3858[0], class118.field2209[0], var7);
        }
        if (arg0) {
            return null;
        } else {
            class242.method1661(29720);
            return var6;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)I")
    public final int method642(int arg0) {
        ++field1535;
        if (this.field1527 != null && this.field1527.field1415 != -1) {
            return class156.method1152(this.field1527.field1415, (byte) -116).field1440;
        } else {
            if (arg0 <= 22) {
                this.method185(-84, 52, -97, -116, -76, -61, -100, -32, -63L);
            }
            return super.method642(35);
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(ZIII)V")
    public final void method643(boolean arg0, int arg1, int arg2, int arg3) {
        super.method1069(arg1, this.method642(arg2 ^ 27430), arg2 + -27512, arg3, arg0);
        ++field1536;
        if (arg2 != 27512) {
            this.method185(102, 113, -88, -92, 82, 83, 86, -12, 104L);
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(BZ)V")
    public static final void method644(byte arg0, boolean arg1) {
        ++field1567;
        if (arg0 < 1) {
            field1538 = -105;
        }
        class50.method368(class114.field2157, -1, arg1, class163.field2895, class50.field876);
    }

    @OriginalMember(owner = "client!mi", name = "f", descriptor = "(I)Lrk;")
    public static final class179 method645(int arg0) {
        ++field1563;
        class179 var1 = new class179(class222.field3911, class3.field45, class56.field939[0], class215.field3816[0], class219.field3858[arg0], class118.field2209[0], class273.field4765[0], class107.field1980);
        class242.method1661(29720);
        return var1;
    }

    @OriginalMember(owner = "client!mi", name = "g", descriptor = "(I)Lmb;")
    public static final class119 method646(int arg0) {
        class45.field751 = 0;
        ++field1552;
        if (arg0 <= 13) {
            field1534 = null;
        }
        return class111.method910((byte) 95);
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(I)Z")
    public final boolean method190(int arg0) {
        ++field1570;
        if (arg0 != 0) {
            method637(-98);
        }
        return this.field1527 != null;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "()I")
    public final int method183() {
        ++field1554;
        return super.field2525;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lwe;I)V")
    public final void method647(class75 arg0, int arg1) {
        ++field1558;
        arg0.field1380 = 0;
        int var3 = arg0.method558(1);
        boolean var4 = (4 & var3) != 0;
        if (~(var3 & 2) != -3) {
            this.field1544 = 0;
            this.field1533 = 0;
        } else {
            this.field1533 = (short) (arg0.method558(1) << 2);
            this.field1544 = (short) (arg0.method558(1) << 2);
        }
        int var5 = var3 & 1;
        int var6 = super.method642(arg1 ^ 13057);
        this.method1068(true, (7 & var3 >> 3) + 1);
        int var7 = -1;
        int[] var8 = new int[12];
        this.field1532 = 3 & var3 >> 6;
        super.field2585 += 64 * (this.method642(62) - var6);
        super.field2546 += 64 * (this.method642(arg1 + -13030) + -var6);
        this.field1531 = arg0.method569((byte) -110);
        this.field1556 = arg0.method569((byte) -110);
        this.field1537 = 0;
        for (int var9 = 0; ~var9 > -13; ++var9) {
            int var10 = arg0.method558(1);
            if (~var10 == -1) {
                var8[var9] = 0;
            } else {
                int var11 = arg0.method558(arg1 ^ 13121);
                int var12 = (var10 << 8) + var11;
                if (~var9 == -1 && ~var12 == -65536) {
                    var7 = arg0.method545((byte) 119);
                    break;
                }
                if (~var12 <= -32769) {
                    int var23 = class151.field2691[var12 - 32768];
                    var8[var9] = class235.method1595(1073741824, var23);
                    int var24 = class80.method633(var23, 0).field1221;
                    if (~var24 != -1) {
                        this.field1537 = var24;
                    }
                } else {
                    var8[var9] = class235.method1595(var12 - 256, Integer.MIN_VALUE);
                }
            }
        }
        int[] var13 = new int[5];
        for (int var14 = 0; var14 < 5; ++var14) {
            int var22 = arg0.method558(arg1 + -13119);
            if (~var22 > -1 || ~class8.field122[var14].length >= ~var22) {
                var22 = 0;
            }
            var13[var14] = var22;
        }
        super.field2553 = arg0.method545((byte) 40);
        if (~super.field2553 == -65536) {
            super.field2553 = -1;
        }
        super.field2531 = arg0.method545((byte) 50);
        if (~super.field2531 == -65536) {
            super.field2531 = -1;
        }
        super.field2559 = super.field2531;
        super.field2561 = arg0.method545((byte) 101);
        if (~super.field2561 == -65536) {
            super.field2561 = -1;
        }
        super.field2541 = arg0.method545((byte) 98);
        if (~super.field2541 == -65536) {
            super.field2541 = -1;
        }
        super.field2550 = arg0.method545((byte) 124);
        if (~super.field2550 == -65536) {
            super.field2550 = -1;
        }
        super.field2529 = arg0.method545((byte) 81);
        if (~super.field2529 == -65536) {
            super.field2529 = -1;
        }
        super.field2540 = arg0.method545((byte) -99);
        if (super.field2540 == 65535) {
            super.field2540 = -1;
        }
        long var15 = arg0.method550(true);
        if (arg1 == 13120) {
            this.field1528 = class277.method1862((byte) -64, var15).method306(true);
            this.field1550 = arg0.method558(arg1 + -13119);
            if (!var4) {
                this.field1548 = 0;
                this.field1530 = arg0.method558(arg1 + -13119);
                this.field1540 = arg0.method558(arg1 + -13119);
                if (~this.field1540 == -256) {
                    this.field1540 = -1;
                }
            } else {
                this.field1548 = arg0.method545((byte) -104);
                this.field1530 = this.field1550;
                this.field1540 = -1;
            }
            int var17 = this.field1547;
            this.field1547 = arg0.method558(1);
            if (this.field1547 != 0) {
                int var18 = this.field1553;
                int var19 = this.field1546;
                int var20 = this.field1551;
                this.field1546 = arg0.method545((byte) -81);
                this.field1553 = arg0.method545((byte) -97);
                this.field1551 = arg0.method545((byte) 122);
                if (this.field1547 != var17 || ~this.field1546 != ~var19 || ~this.field1553 != ~var18 || this.field1551 != var20) {
                    class76.method596(this, -93);
                }
            } else {
                class185.method1335(this, (byte) -125);
            }
            if (this.field1527 == null) {
                this.field1527 = new class76();
            }
            int var21 = this.field1527.field1415;
            this.field1527.method605(var5 == 1, var7, var8, var13, arg1 + -13115);
            if (~var7 != ~var21) {
                super.field2585 = super.field2523[0] * 128 + 64 * this.method642(24);
                super.field2546 = super.field2517[0] * 128 - -(this.method642(76) * 64);
            }
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(II)Z")
    public static final boolean method648(int arg0, int arg1) {
        class109.field2060 = true;
        ++field1561;
        if (arg1 >= -123) {
            method639(117, 117, 94, true, 78, -120, 94);
        }
        class265.field4607 = 65535 & arg0 - -1;
        return true;
    }
}
