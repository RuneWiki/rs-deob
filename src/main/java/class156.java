import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class156 extends class154 {

    @OriginalMember(owner = "client!we", name = "gb", descriptor = "I")
    private int field2611 = 6;

    @OriginalMember(owner = "client!we", name = "eb", descriptor = "Leg;")
    public static class37 field2609 = class174.method1167("logo", -126);

    @OriginalMember(owner = "client!we", name = "X", descriptor = "I")
    public static int field2602 = 127;

    @OriginalMember(owner = "client!we", name = "Y", descriptor = "I")
    public static int field2603;

    @OriginalMember(owner = "client!we", name = "Z", descriptor = "I")
    public static int field2604;

    @OriginalMember(owner = "client!we", name = "ab", descriptor = "I")
    public static int field2605;

    @OriginalMember(owner = "client!we", name = "bb", descriptor = "I")
    public static int field2606;

    @OriginalMember(owner = "client!we", name = "cb", descriptor = "I")
    public static int field2607;

    @OriginalMember(owner = "client!we", name = "db", descriptor = "I")
    public static int field2608;

    @OriginalMember(owner = "client!we", name = "fb", descriptor = "I")
    public static int field2610;

    @OriginalMember(owner = "client!we", name = "hb", descriptor = "I")
    public static int field2612;

    @OriginalMember(owner = "client!we", name = "ib", descriptor = "I")
    public static int field2613;

    @OriginalMember(owner = "client!we", name = "jb", descriptor = "I")
    public static int field2614;

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "()V")
    public class156() {
        super(2, false);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(B[Leg;)Leg;")
    public static final class37 method1061(byte arg0, class37[] arg1) {
        ++field2603;
        int var2 = 40 % ((-8 - arg0) / 38);
        if (~arg1.length > -3) {
            throw new IllegalArgumentException();
        } else {
            return class144.method1006(arg1.length, 0, arg1, (byte) -6);
        }
    }

    @OriginalMember(owner = "client!we", name = "f", descriptor = "(I)V")
    public static void method1062(int arg0) {
        if (arg0 == -463833396) {
            field2609 = null;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Lva;II)V")
    public final void method142(class187 arg0, int arg1, int arg2) {
        ++field2608;
        if (arg2 != 0) {
            if (arg2 == 1) {
                super.field2579 = arg0.method1268(255) == 1;
            }
        } else {
            this.field2611 = arg0.method1268(255);
        }
        if (arg1 != -14015) {
            field2602 = -48;
        }
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(II)[I")
    public final int[] method143(int arg0, int arg1) {
        ++field2604;
        int[] var3 = super.field2574.method206(arg0, 10232);
        if (arg1 != 1075962732) {
            this.method193((byte) 62, 126);
        }
        if (super.field2574.field536) {
            int[] var4 = this.method1052(0, arg0, (byte) -40);
            int[] var5 = this.method1052(1, arg0, (byte) -105);
            int var6 = this.field2611;
            if (var6 != 1) {
                if (~var6 != -3) {
                    if (var6 != 3) {
                        if (~var6 != -5) {
                            if (var6 != 5) {
                                if (var6 != 6) {
                                    if (var6 != 7) {
                                        if (var6 != 8) {
                                            if (var6 != 9) {
                                                if (var6 != 10) {
                                                    if (~var6 != -12) {
                                                        if (~var6 == -13) {
                                                            for (int var7 = 0; var7 < class227.field3898; ++var7) {
                                                                int var8 = var4[var7];
                                                                int var9 = var5[var7];
                                                                var3[var7] = -(var8 * var9 >> 11) + var8 + var9;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var10 = 0; var10 < class227.field3898; ++var10) {
                                                            int var11 = var4[var10];
                                                            int var12 = var5[var10];
                                                            var3[var10] = var11 > var12 ? -var12 + var11 : -var11 + var12;
                                                        }
                                                    }
                                                } else {
                                                    for (int var13 = 0; class227.field3898 > var13; ++var13) {
                                                        int var14 = var5[var13];
                                                        int var15 = var4[var13];
                                                        var3[var13] = var14 >= var15 ? var14 : var15;
                                                    }
                                                }
                                            } else {
                                                for (int var16 = 0; var16 < class227.field3898; ++var16) {
                                                    int var17 = var5[var16];
                                                    int var18 = var4[var16];
                                                    var3[var16] = var18 < var17 ? var18 : var17;
                                                }
                                            }
                                        } else {
                                            for (int var19 = 0; ~class227.field3898 < ~var19; ++var19) {
                                                int var20 = var4[var19];
                                                var3[var19] = var20 == 0 ? 0 : -((4096 - var5[var19] << 12) / var20) + 4096;
                                            }
                                        }
                                    } else {
                                        for (int var21 = 0; var21 < class227.field3898; ++var21) {
                                            int var22 = var4[var21];
                                            var3[var21] = var22 != 4096 ? (var5[var21] << 12) / (4096 - var22) : 4096;
                                        }
                                    }
                                } else {
                                    for (int var23 = 0; ~var23 > ~class227.field3898; ++var23) {
                                        int var24 = var5[var23];
                                        var3[var23] = var24 >= 2048 ? -((-var4[var23] + 4096) * (-var24 + 4096) >> 11) + 4096 : var4[var23] * var24 >> 11;
                                    }
                                }
                            } else {
                                for (int var25 = 0; ~class227.field3898 < ~var25; ++var25) {
                                    var3[var25] = 4096 - ((4096 - var5[var25]) * (-var4[var25] + 4096) >> 12);
                                }
                            }
                        } else {
                            for (int var26 = 0; var26 < class227.field3898; ++var26) {
                                int var27 = var5[var26];
                                var3[var26] = var27 != 0 ? (var4[var26] << 12) / var27 : 4096;
                            }
                        }
                    } else {
                        for (int var28 = 0; class227.field3898 > var28; ++var28) {
                            var3[var28] = var4[var28] * var5[var28] >> 12;
                        }
                    }
                } else {
                    for (int var29 = 0; ~class227.field3898 < ~var29; ++var29) {
                        var3[var29] = var4[var29] + -var5[var29];
                    }
                }
            } else {
                for (int var30 = 0; ~var30 > ~class227.field3898; ++var30) {
                    var3[var30] = var4[var30] + var5[var30];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(BI)[[I")
    public final int[][] method193(byte arg0, int arg1) {
        ++field2612;
        if (arg0 != 115) {
            this.field2611 = -21;
        }
        int[][] var3 = super.field2585.method1532(arg1, -117);
        if (super.field2585.field3761) {
            int[][] var4 = this.method1054(arg0 + -115, 0, arg1);
            int[][] var5 = this.method1054(0, 1, arg1);
            int[] var6 = var3[2];
            int[] var7 = var4[0];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            int[] var12 = var5[1];
            int[] var13 = var5[0];
            int[] var14 = var5[2];
            int var15 = this.field2611;
            if (var15 != 1) {
                if (var15 != 2) {
                    if (~var15 != -4) {
                        if (var15 != 4) {
                            if (~var15 != -6) {
                                if (~var15 != -7) {
                                    if (~var15 != -8) {
                                        if (var15 != 8) {
                                            if (var15 != 9) {
                                                if (var15 != 10) {
                                                    if (var15 != 11) {
                                                        if (var15 == 12) {
                                                            for (int var16 = 0; ~class227.field3898 < ~var16; ++var16) {
                                                                int var17 = var11[var16];
                                                                int var18 = var10[var16];
                                                                int var19 = var7[var16];
                                                                int var20 = var14[var16];
                                                                int var21 = var13[var16];
                                                                int var22 = var12[var16];
                                                                var8[var16] = var19 + var21 - (var19 * var21 >> 11);
                                                                var9[var16] = var18 + var22 + -(var18 * var22 >> 11);
                                                                var6[var16] = var17 + var20 + -(var17 * var20 >> 11);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var23 = 0; ~class227.field3898 < ~var23; ++var23) {
                                                            int var24 = var13[var23];
                                                            int var25 = var12[var23];
                                                            int var26 = var10[var23];
                                                            int var27 = var7[var23];
                                                            int var28 = var14[var23];
                                                            int var29 = var11[var23];
                                                            var8[var23] = var27 > var24 ? -var24 + var27 : -var27 + var24;
                                                            var9[var23] = ~var26 >= ~var25 ? -var26 + var25 : -var25 + var26;
                                                            var6[var23] = var28 >= var29 ? -var29 + var28 : -var28 + var29;
                                                        }
                                                    }
                                                } else {
                                                    for (int var30 = 0; class227.field3898 > var30; ++var30) {
                                                        int var31 = var7[var30];
                                                        int var32 = var13[var30];
                                                        int var33 = var10[var30];
                                                        int var34 = var12[var30];
                                                        int var35 = var11[var30];
                                                        int var36 = var14[var30];
                                                        var8[var30] = var32 >= var31 ? var32 : var31;
                                                        var9[var30] = ~var34 > ~var33 ? var33 : var34;
                                                        var6[var30] = ~var36 > ~var35 ? var35 : var36;
                                                    }
                                                }
                                            } else {
                                                for (int var37 = 0; class227.field3898 > var37; ++var37) {
                                                    int var38 = var11[var37];
                                                    int var39 = var13[var37];
                                                    int var40 = var7[var37];
                                                    int var41 = var12[var37];
                                                    int var42 = var14[var37];
                                                    int var43 = var10[var37];
                                                    var8[var37] = var39 > var40 ? var40 : var39;
                                                    var9[var37] = ~var41 >= ~var43 ? var41 : var43;
                                                    var6[var37] = ~var38 > ~var42 ? var38 : var42;
                                                }
                                            }
                                        } else {
                                            for (int var44 = 0; var44 < class227.field3898; ++var44) {
                                                int var45 = var10[var44];
                                                int var46 = var7[var44];
                                                int var47 = var11[var44];
                                                var8[var44] = ~var46 != -1 ? -((4096 - var13[var44] << 12) / var46) + 4096 : 0;
                                                var9[var44] = ~var45 == -1 ? 0 : -((-var12[var44] + 4096 << 12) / var45) + 4096;
                                                var6[var44] = ~var47 != -1 ? 4096 - (-var14[var44] + 4096 << 12) / var47 : 0;
                                            }
                                        }
                                    } else {
                                        for (int var48 = 0; ~class227.field3898 < ~var48; ++var48) {
                                            int var49 = var10[var48];
                                            int var50 = var7[var48];
                                            int var51 = var11[var48];
                                            var8[var48] = var50 == 4096 ? 4096 : (var13[var48] << 12) / (-var50 + 4096);
                                            var9[var48] = var49 != 4096 ? (var12[var48] << 12) / (-var49 + 4096) : 4096;
                                            var6[var48] = var51 == 4096 ? 4096 : (var14[var48] << 12) / (-var51 + 4096);
                                        }
                                    }
                                } else {
                                    for (int var52 = 0; ~var52 > ~class227.field3898; ++var52) {
                                        int var53 = var14[var52];
                                        int var54 = var12[var52];
                                        int var55 = var13[var52];
                                        var8[var52] = var55 >= 2048 ? -((-var7[var52] + 4096) * (-var55 + 4096) >> 11) + 4096 : var7[var52] * var55 >> 11;
                                        var9[var52] = var54 < 2048 ? var10[var52] * var54 >> 11 : -((4096 - var54) * (-var10[var52] + 4096) >> 11) + 4096;
                                        var6[var52] = var53 >= 2048 ? -((-var11[var52] + 4096) * (-var53 + 4096) >> 11) + 4096 : var11[var52] * var53 >> 11;
                                    }
                                }
                            } else {
                                for (int var56 = 0; ~var56 > ~class227.field3898; ++var56) {
                                    var8[var56] = -((-var7[var56] + 4096) * (-var13[var56] + 4096) >> 12) + 4096;
                                    var9[var56] = -((-var10[var56] + 4096) * (-var12[var56] + 4096) >> 12) + 4096;
                                    var6[var56] = -((-var11[var56] + 4096) * (-var14[var56] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var57 = 0; class227.field3898 > var57; ++var57) {
                                int var58 = var14[var57];
                                int var59 = var13[var57];
                                int var60 = var12[var57];
                                var8[var57] = var59 == 0 ? 4096 : (var7[var57] << 12) / var59;
                                var9[var57] = ~var60 != -1 ? (var10[var57] << 12) / var60 : 4096;
                                var6[var57] = var58 != 0 ? (var11[var57] << 12) / var58 : 4096;
                            }
                        }
                    } else {
                        for (int var61 = 0; var61 < class227.field3898; ++var61) {
                            var8[var61] = var7[var61] * var13[var61] >> 12;
                            var9[var61] = var10[var61] * var12[var61] >> 12;
                            var6[var61] = var11[var61] * var14[var61] >> 12;
                        }
                    }
                } else {
                    for (int var62 = 0; class227.field3898 > var62; ++var62) {
                        var8[var62] = var7[var62] + -var13[var62];
                        var9[var62] = var10[var62] + -var12[var62];
                        var6[var62] = var11[var62] + -var14[var62];
                    }
                }
            } else {
                for (int var63 = 0; class227.field3898 > var63; ++var63) {
                    var8[var63] = var7[var63] - -var13[var63];
                    var9[var63] = var10[var63] + var12[var63];
                    var6[var63] = var11[var63] + var14[var63];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!we", name = "c", descriptor = "(II)V")
    public static final void method1063(int arg0, int arg1) {
        ++field2614;
        class73.field1151.method1402((byte) -95, arg0);
        if (arg1 != -23917) {
            method1061((byte) 33, (class37[]) null);
        }
    }

    @OriginalMember(owner = "client!we", name = "c", descriptor = "(III)Lwa;")
    public static final class239 method1064(int arg0, int arg1, int arg2) {
        class111 var3 = class286.field5048[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class239 var4 = var3.field1876;
            var3.field1876 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!we", name = "g", descriptor = "(I)V")
    public static final void method1065(int arg0) {
        while (true) {
            if (class213.field3680.method1701((byte) -96, class182.field3044) >= 11) {
                int var1 = class213.field3680.method1705((byte) 116, 11);
                if (var1 != 2047) {
                    boolean var2 = false;
                    if (class98.field1526[var1] == null) {
                        class98.field1526[var1] = new class188();
                        if (class201.field3429[var1] != null) {
                            class98.field1526[var1].method1303(false, class201.field3429[var1]);
                        }
                        var2 = true;
                    }
                    class285.field5020[class138.field2360++] = var1;
                    class188 var3 = class98.field1526[var1];
                    var3.field1759 = class72.field1146;
                    int var4 = class213.field3680.method1705((byte) 121, 1);
                    if (~var4 == -2) {
                        class203.field3463[class255.field4524++] = var1;
                    }
                    int var5 = class213.field3680.method1705((byte) 117, 5);
                    int var6 = class213.field3680.method1705((byte) 98, 5);
                    if (~var5 < -16) {
                        var5 -= 32;
                    }
                    int var7 = class213.field3680.method1705((byte) 113, 1);
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    int var8 = class60.field983[class213.field3680.method1705((byte) 110, 3)];
                    if (var2) {
                        var3.field1816 = var3.field1798 = var8;
                    }
                    var3.method1301(class82.field1285.field1780[0] + var6, class82.field1285.field1812[0] - -var5, var7 == 1, 4484);
                    continue;
                }
            }
            int var9 = -99 % ((arg0 - 84) / 34);
            class213.field3680.method1706((byte) 0);
            ++field2610;
            return;
        }
    }

    @OriginalMember(owner = "client!we", name = "d", descriptor = "(II)Lpe;")
    public static final class237 method1066(int arg0, int arg1) {
        ++field2613;
        if (arg0 >= -65) {
            return null;
        } else {
            int var2 = arg1 >> 16;
            int var3 = 65535 & arg1;
            if (class232.field4000[var2] == null || class232.field4000[var2][var3] == null) {
                boolean var4 = class262.method1772(0, var2);
                if (!var4) {
                    return null;
                }
            }
            return class232.field4000[var2][var3];
        }
    }

    @OriginalMember(owner = "client!we", name = "e", descriptor = "(II)V")
    public static final void method1067(int arg0, int arg1) {
        ++field2606;
        class195 var2;
        if (class233.field4019 == null) {
            var2 = new class195(512, 512);
        } else {
            var2 = (class195) class233.field4019;
        }
        int[] var3 = var2.field3331;
        int var4 = var3.length;
        for (int var5 = 0; ~var5 > ~var4; ++var5) {
            var3[var5] = 1;
        }
        int var6 = 1;
        if (arg1 == 12929) {
            while (~var6 > -104) {
                int var24 = (-var6 + 103) * 4 * 512 + 24628;
                for (int var25 = 1; ~var25 > -104; ++var25) {
                    if (~(class241.field4312[arg0][var25][var6] & 24) == -1) {
                        class196.method1363(var3, var24, 512, arg0, var25, var6);
                    }
                    if (arg0 < 3 && ~(class241.field4312[arg0 + 1][var25][var6] & 8) != -1) {
                        class196.method1363(var3, var24, 512, arg0 + 1, var25, var6);
                    }
                    var24 += 4;
                }
                ++var6;
            }
            var2.method1358();
            int var7 = (238 + ((int) (Math.random() * 20.0D) - 10) << 8) + (-10 + (int) (Math.random() * 20.0D) + 238 << 16) + -10 + (int) (20.0D * Math.random()) + 238;
            int var8 = (int) (20.0D * Math.random()) + 238 - 10 << 16;
            for (int var9 = 1; var9 < 103; ++var9) {
                for (int var23 = 1; ~var23 > -104; ++var23) {
                    if ((class241.field4312[arg0][var23][var9] & 24) == 0) {
                        class69.method477(arg0, var7, var9, -51, var23, var8);
                    }
                    if (arg0 < 3 && (class241.field4312[arg0 + 1][var23][var9] & 8) != 0) {
                        class69.method477(arg0 - -1, var7, var9, -76, var23, var8);
                    }
                }
            }
            class259.field4585 = 0;
            for (int var10 = 0; ~var10 > -105; ++var10) {
                for (int var11 = 0; var11 < 104; ++var11) {
                    long var12 = class89.method589(class237.field4140, var10, var11);
                    if (~var12 != -1L) {
                        class133 var14 = class178.method1186((int) (var12 >>> 32) & Integer.MAX_VALUE, 0);
                        int var15 = var14.field2235;
                        if (var14.field2303 != null) {
                            for (int var16 = 0; ~var14.field2303.length < ~var16; ++var16) {
                                if (var14.field2303[var16] != -1) {
                                    class133 var17 = class178.method1186(var14.field2303[var16], 0);
                                    if (var17.field2235 >= 0) {
                                        var15 = var17.field2235;
                                        break;
                                    }
                                }
                            }
                        }
                        if (var15 >= 0) {
                            int var18 = var11;
                            int var19 = var10;
                            if (~var15 != -23 && var15 != 29 && ~var15 != -35 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                                int[][] var20 = class215.field3719[class237.field4140].field2738;
                                for (int var21 = 0; ~var21 > -11; ++var21) {
                                    int var22 = (int) (Math.random() * 4.0D);
                                    if (~var22 == -1 && var19 > 0 && ~var19 < ~(var10 + -3) && (var20[var19 + -1][var18] & 19661064) == 0) {
                                        --var19;
                                    }
                                    if (var22 == 1 && var19 < 103 && var10 + 3 > var19 && ~(19661184 & var20[var19 - -1][var18]) == -1) {
                                        ++var19;
                                    }
                                    if (~var22 == -3 && ~var18 < -1 && ~var18 < ~(var11 + -3) && (19661058 & var20[var19][var18 + -1]) == 0) {
                                        --var18;
                                    }
                                    if (~var22 == -4 && var18 < 103 && ~var18 > ~(var11 + 3) && ~(19661088 & var20[var19][var18 + 1]) == -1) {
                                        ++var18;
                                    }
                                }
                            }
                            class63.field1036[class259.field4585] = var14.field2304;
                            class236.field4062[class259.field4585] = var19;
                            class117.field1994[class259.field4585] = var18;
                            ++class259.field4585;
                        }
                    }
                }
            }
            class233.field4019 = var2;
            class276.field4897.method1368(-118);
        }
    }
}
