import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class186 extends class189 {

    @OriginalMember(owner = "client!uf", name = "tb", descriptor = "I")
    private int field3762 = -1;

    @OriginalMember(owner = "client!uf", name = "gb", descriptor = "Lgg;")
    public static class63 field3749 = class116.method911(43, "<img=0>");

    @OriginalMember(owner = "client!uf", name = "ob", descriptor = "[I")
    public static int[] field3757 = new int[] { 6, 0, 6, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 7, 0, 0, 0, 0, 0, 0, 0, 4, 0, 4, -2, 7, 0, 0, 0, 0, 0, 0, 0, 0, 15, 0, 0, 0, 3, 0, -2, 2, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 4, 0, 0, 6, 24, 0, 0, 0, 0, 11, 0, 2, 6, 10, 2, 3, -2, -1, -1, 0, 0, 4, 0, 2, 3, -2, 4, 0, -2, 0, 0, 0, 0, 5, 6, 2, 0, 6, 0, 6, 1, 0, 20, 14, 0, 0, 6, 0, 0, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 6, 5, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 8, 0, 0, 0, 0, 0, 0, -1, 0, 6, 0, -2, 0, 10, -2, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 1, -2, 0, 0, 0, 8, 0, 0, 12, 0, 0, 0, 0, 0, 7, 11, 0, 5, -2, 0, 0, 0, 0, 0, 5, 6, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, 0, 0 };

    @OriginalMember(owner = "client!uf", name = "ib", descriptor = "I")
    public static int field3751 = -1;

    @OriginalMember(owner = "client!uf", name = "hb", descriptor = "I")
    public static int field3750;

    @OriginalMember(owner = "client!uf", name = "jb", descriptor = "I")
    public static int field3752;

    @OriginalMember(owner = "client!uf", name = "kb", descriptor = "I")
    public static int field3753;

    @OriginalMember(owner = "client!uf", name = "nb", descriptor = "I")
    public static int field3756;

    @OriginalMember(owner = "client!uf", name = "pb", descriptor = "I")
    public static int field3758;

    @OriginalMember(owner = "client!uf", name = "qb", descriptor = "I")
    private int field3759;

    @OriginalMember(owner = "client!uf", name = "rb", descriptor = "I")
    public static int field3760;

    @OriginalMember(owner = "client!uf", name = "sb", descriptor = "I")
    public static int field3761;

    @OriginalMember(owner = "client!uf", name = "ub", descriptor = "I")
    public static int field3763;

    @OriginalMember(owner = "client!uf", name = "vb", descriptor = "I")
    private int field3764;

    @OriginalMember(owner = "client!uf", name = "wb", descriptor = "I")
    public static int field3765;

    @OriginalMember(owner = "client!uf", name = "xb", descriptor = "I")
    public static int field3766;

    @OriginalMember(owner = "client!uf", name = "mb", descriptor = "[I")
    private int[] field3755;

    @OriginalMember(owner = "client!uf", name = "lb", descriptor = "[Lrc;")
    public static class156[] field3754;

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(BI)I")
    public static final int method1221(byte arg0, int arg1) {
        if (arg0 > -78) {
            method1226(true);
        }
        ++field3756;
        return arg1 >> 11 & 63;
    }

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "(B)Z")
    private final boolean method1222(byte arg0) {
        ++field3766;
        if (this.field3755 != null) {
            return true;
        } else if (this.field3762 >= 0) {
            int var2 = class29.field676.method1253(this.field3762, (byte) -120) ? 64 : 128;
            this.field3755 = class29.field676.method1255(this.field3762, (byte) -83);
            this.field3759 = var2;
            this.field3764 = var2;
            return this.field3755 != null;
        } else {
            if (arg0 != -98) {
                method1226(true);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "(B)V")
    public static final void method1223(byte arg0) {
        ++field3752;
        int var1 = class29.field675.method665(class134.field2912);
        for (int var2 = 0; class166.field3404 > var2; ++var2) {
            int var7 = class29.field675.method665(class151.method1059(var2, -686459346));
            if (var7 > var1) {
                var1 = var7;
            }
        }
        var1 += 8;
        int var3 = -80 / ((64 - arg0) / 60);
        class188.field3796 = true;
        class175.field3606 = class166.field3404 * 15 + 22;
        class109.field2451 = var1;
        int var4 = class166.field3404 * 15 + 21;
        int var5 = -(var1 / 2) + class110.field2480;
        int var6 = class143.field3074;
        if (~(var5 - -var1) < -766) {
            var5 = -var1 + 765;
        }
        if (var4 + var6 > 503) {
            var6 = 503 - var4;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        class39.field926 = var5;
        class151.field3177 = var6;
    }

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "(B)I")
    public final int method1224(byte arg0) {
        if (arg0 != 124) {
            method1225(77, (class54[]) null, -91, 40, 27, 49, -42, 124, 104, 108);
        }
        ++field3753;
        return this.field3762;
    }

    @OriginalMember(owner = "client!uf", name = "<init>", descriptor = "()V")
    public class186() {
        super(0, false);
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(II)[[I")
    public final int[][] method83(int arg0, int arg1) {
        ++field3758;
        if (arg1 <= 34) {
            this.method83(-107, 116);
        }
        int[][] var3 = super.field3808.method237(-1, arg0);
        if (super.field3808.field561 && this.method1222((byte) -98)) {
            int var4 = (class12.field287 != this.field3759 ? this.field3759 * arg0 / class12.field287 : arg0) * this.field3764;
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            if (~class54.field1430 == ~this.field3764) {
                for (int var8 = 0; ~class54.field1430 < ~var8; ++var8) {
                    int var9 = this.field3755[var4++];
                    var7[var8] = class110.method881(255, var9) << 4;
                    var6[var8] = class110.method881(65280, var9) >> 4;
                    var5[var8] = class110.method881(4080, var9 >> 12);
                }
            } else {
                for (int var10 = 0; ~var10 > ~class54.field1430; ++var10) {
                    int var11 = this.field3764 * var10 / class54.field1430;
                    int var12 = this.field3755[var4 - -var11];
                    var7[var10] = class110.method881(var12 << 4, 4080);
                    var6[var10] = class110.method881(var12 >> 4, 4080);
                    var5[var10] = class110.method881(4080, var12 >> 12);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(I[Lff;IIIIIIII)V")
    public static final void method1225(int arg0, class54[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg4 == 765) {
            class178.method1187(arg6, arg3, arg0, arg7);
            class25.method243();
            for (int var10 = 0; arg1.length > var10; ++var10) {
                class54 var11 = arg1[var10];
                if (var11 != null && (~var11.field1353 == ~arg2 || ~arg2 == 1412584498 && class198.field3963 == var11)) {
                    int var12;
                    if (arg8 == -1) {
                        class27.field606[class202.field4005] = var11.field1333 - -arg5;
                        class110.field2481[class202.field4005] = var11.field1304 + arg9;
                        class97.field2307[class202.field4005] = var11.field1302;
                        class98.field2322[class202.field4005] = var11.field1435;
                        var12 = class202.field4005++;
                    } else {
                        var12 = arg8;
                    }
                    var11.field1389 = var12;
                    var11.field1327 = class173.field3571;
                    if (!var11.field1336 || !class183.method1208((byte) 101, var11)) {
                        if (~var11.field1367 < -1) {
                            class93.method816(var11, (byte) 26);
                        }
                        int var13 = var11.field1333 + arg5;
                        int var14 = var11.field1304 - -arg9;
                        int var15 = var11.field1328;
                        if (class198.field3963 == var11) {
                            if (~arg2 != 1412584498 && !var11.field1380) {
                                class116.field2606 = arg5;
                                class180.field3661 = arg9;
                                class150.field3162 = arg1;
                                continue;
                            }
                            if (class104.field2398 && class142.field3051) {
                                int var16 = class188.field3794;
                                int var17 = var16 - class46.field1094;
                                int var18 = class100.field2365;
                                if (~var17 > ~class28.field648) {
                                    var17 = class28.field648;
                                }
                                int var19 = var18 - class34.field811;
                                if (~(var11.field1435 + var17) < ~(class28.field648 + class174.field3584.field1435)) {
                                    var17 = class174.field3584.field1435 - var11.field1435 + class28.field648;
                                }
                                var14 = var17;
                                if (var19 < class103.field2380) {
                                    var19 = class103.field2380;
                                }
                                if (~(class103.field2380 - -class174.field3584.field1302) > ~(var11.field1302 + var19)) {
                                    var19 = class103.field2380 + class174.field3584.field1302 - var11.field1302;
                                }
                                var13 = var19;
                            }
                            if (!var11.field1380) {
                                var15 = 128;
                            }
                        }
                        int var25;
                        int var26;
                        int var28;
                        int var29;
                        if (var11.field1432 != 2) {
                            if (var11.field1432 == 9) {
                                int var20 = var14;
                                int var21 = var13;
                                int var22 = var11.field1302 + var13;
                                int var23 = var11.field1435 + var14;
                                if (~var22 > ~var13) {
                                    var21 = var22;
                                    var22 = var13;
                                }
                                var25 = arg6 < var21 ? var21 : arg6;
                                ++var22;
                                var26 = var22 < arg0 ? var22 : arg0;
                                if (var14 > var23) {
                                    var20 = var23;
                                    var23 = var14;
                                }
                                ++var23;
                                var28 = arg7 <= var23 ? arg7 : var23;
                                var29 = ~var20 >= ~arg3 ? arg3 : var20;
                            } else {
                                var25 = var13 <= arg6 ? arg6 : var13;
                                var29 = var14 <= arg3 ? arg3 : var14;
                                int var30 = var11.field1302 + var13;
                                var26 = ~arg0 >= ~var30 ? arg0 : var30;
                                int var31 = var11.field1435 + var14;
                                var28 = ~var31 > ~arg7 ? var31 : arg7;
                            }
                        } else {
                            var29 = arg3;
                            var28 = arg7;
                            var25 = arg6;
                            var26 = arg0;
                        }
                        if (!var11.field1336 || ~var25 > ~var26 && ~var28 < ~var29) {
                            if (~var11.field1367 != -1) {
                                if (~var11.field1367 == -1338) {
                                    class167.field3464 = var13;
                                    class43.field1044 = var14;
                                    class125.method947(var14, var11.field1435, var11.field1302, 600, var13);
                                    class178.method1187(arg6, arg3, arg0, arg7);
                                    continue;
                                }
                                if (~var11.field1367 == -1339) {
                                    if (var11.method531(94)) {
                                        class158.method1091(var11, var13, var14, var12, 126);
                                        class178.method1187(arg6, arg3, arg0, arg7);
                                    }
                                    continue;
                                }
                                if (~var11.field1367 == -1340) {
                                    if (var11.method531(86)) {
                                        class167.method1130(73, var11, var12, var13, var14);
                                        class178.method1187(arg6, arg3, arg0, arg7);
                                    }
                                    continue;
                                }
                            }
                            int var32 = class100.field2365;
                            int var33 = class188.field3794;
                            if (!class188.field3796 && var32 >= var25 && var33 >= var29 && var26 > var32 && ~var33 > ~var28) {
                                class69.method633(-var13 + var32, var11, -var14 + var33, (byte) 18);
                            }
                            if (var11.field1432 == 0) {
                                if (!var11.field1336 && class183.method1208((byte) 119, var11) && class11.field257 != var11) {
                                    continue;
                                }
                                if (!var11.field1336) {
                                    if (~var11.field1405 < ~(-var11.field1435 + var11.field1369)) {
                                        var11.field1405 = -var11.field1435 + var11.field1369;
                                    }
                                    if (var11.field1405 < 0) {
                                        var11.field1405 = 0;
                                    }
                                }
                                method1225(var26, arg1, var11.field1323, var29, 765, -var11.field1390 + var13, var25, var28, var12, -var11.field1405 + var14);
                                if (var11.field1368 != null) {
                                    method1225(var26, var11.field1368, var11.field1323, var29, 765, -var11.field1390 + var13, var25, var28, var12, -var11.field1405 + var14);
                                }
                                class132 var34 = (class132) class133.field2885.method694(-23979, (long) var11.field1323);
                                if (var34 != null) {
                                    if (~var34.field2875 == -1 && var25 <= class100.field2365 && ~class188.field3794 <= ~var29 && var26 > class100.field2365 && class188.field3794 < var28 && !class188.field3796 && !class29.field673) {
                                        class166.field3404 = 1;
                                        class106.field2414[0] = class103.field2374;
                                        class84.field2003[0] = class151.field3175;
                                        class196.field3924[0] = 1004;
                                    }
                                    class180.method1199(var28, var29, var26, var12, 0, var25, var13, var14, var34.field2865);
                                }
                                class178.method1187(arg6, arg3, arg0, arg7);
                                class25.method243();
                            }
                            if (class11.field254[var12] || class12.field279 > 1) {
                                if (var11.field1432 == 0 && !var11.field1336 && ~var11.field1369 < ~var11.field1435) {
                                    class138.method1002(-116, var11.field1405, var14, var11.field1369, var11.field1435, var13 - -var11.field1302);
                                }
                                if (var11.field1432 != 1) {
                                    if (var11.field1432 == 2) {
                                        int var35 = 0;
                                        for (int var36 = 0; ~var11.field1435 < ~var36; ++var36) {
                                            for (int var37 = 0; var37 < var11.field1302; ++var37) {
                                                int var38 = (var11.field1325 + 32) * var37 + var13;
                                                int var39 = (var11.field1329 + 32) * var36 + var14;
                                                if (var35 < 20) {
                                                    var38 += var11.field1343[var35];
                                                    var39 += var11.field1423[var35];
                                                }
                                                if (~var11.field1324[var35] >= -1) {
                                                    if (var11.field1360 != null && ~var35 > -21) {
                                                        class200 var51 = var11.method529(var35, 0);
                                                        if (var51 != null) {
                                                            var51.method1320(var38, var39);
                                                        } else if (class62.field1578) {
                                                            class113.method901(0, var11);
                                                        }
                                                    }
                                                } else {
                                                    boolean var40 = false;
                                                    boolean var41 = false;
                                                    int var42 = var11.field1324[var35] + -1;
                                                    if (arg6 < var38 + 32 && ~var38 > ~arg0 && var39 + 32 > arg3 && ~arg7 < ~var39 || class89.field2094 == var11 && class165.field3385 == var35) {
                                                        class200 var43;
                                                        if (class184.field3729 == 1 && ~class90.field2114 == ~var35 && class123.field2710 == var11.field1323) {
                                                            var43 = class79.method712(2, false, (byte) 79, var42, var11.field1315[var35], 0);
                                                        } else {
                                                            var43 = class79.method712(1, false, (byte) 62, var42, var11.field1315[var35], 3153952);
                                                        }
                                                        if (var43 != null) {
                                                            if (class89.field2094 == var11 && class165.field3385 == var35) {
                                                                int var44 = -class88.field2064 + class188.field3794;
                                                                if (~var44 > -6 && ~var44 < 4) {
                                                                    var44 = 0;
                                                                }
                                                                int var45 = -class182.field3682 + class100.field2365;
                                                                if (~var45 > -6 && ~var45 < 4) {
                                                                    var45 = 0;
                                                                }
                                                                if (~class71.field1798 > -6) {
                                                                    var45 = 0;
                                                                    var44 = 0;
                                                                }
                                                                var43.method1328(var38 - -var45, var39 + var44, 128);
                                                                if (~arg2 != 0) {
                                                                    class54 var46 = arg1[65535 & arg2];
                                                                    int var47 = class178.field3646;
                                                                    int var48 = class178.field3648;
                                                                    if (var48 > var39 + var44 && ~var46.field1405 < -1) {
                                                                        int var49 = (-var39 + var48 + -var44) * class131.field2852 / 3;
                                                                        if (~(class131.field2852 * 10) > ~var49) {
                                                                            var49 = class131.field2852 * 10;
                                                                        }
                                                                        if (var49 > var46.field1405) {
                                                                            var49 = var46.field1405;
                                                                        }
                                                                        var46.field1405 -= var49;
                                                                        class88.field2064 += var49;
                                                                        class113.method901(0, var46);
                                                                    }
                                                                    if (~(var39 + var44 + 32) < ~var47 && ~var46.field1405 > ~(-var46.field1435 + var46.field1369)) {
                                                                        int var50 = (var39 - -32 + var44 + -var47) * class131.field2852 / 3;
                                                                        if (class131.field2852 * 10 < var50) {
                                                                            var50 = class131.field2852 * 10;
                                                                        }
                                                                        if (var50 > -var46.field1435 + var46.field1369 - var46.field1405) {
                                                                            var50 = var46.field1369 - var46.field1435 - var46.field1405;
                                                                        }
                                                                        class88.field2064 -= var50;
                                                                        var46.field1405 += var50;
                                                                        class113.method901(arg4 + -765, var46);
                                                                    }
                                                                }
                                                            } else if (class162.field3332 == var11 && class103.field2384 == var35) {
                                                                var43.method1328(var38, var39, 128);
                                                            } else {
                                                                var43.method1320(var38, var39);
                                                            }
                                                        } else {
                                                            class113.method901(arg4 ^ 765, var11);
                                                        }
                                                    }
                                                }
                                                ++var35;
                                            }
                                        }
                                    } else if (~var11.field1432 == -4) {
                                        int var52;
                                        if (!class96.method831(var11, 5)) {
                                            var52 = var11.field1358;
                                            if (class11.field257 == var11 && ~var11.field1365 != -1) {
                                                var52 = var11.field1365;
                                            }
                                        } else {
                                            var52 = var11.field1384;
                                            if (class11.field257 == var11 && var11.field1414 != 0) {
                                                var52 = var11.field1414;
                                            }
                                        }
                                        if (var15 != 0) {
                                            if (!var11.field1314) {
                                                class178.method1185(var13, var14, var11.field1302, var11.field1435, var52, -(var15 & 255) + 256);
                                            } else {
                                                class178.method1193(var13, var14, var11.field1302, var11.field1435, var52, -(255 & var15) + 256);
                                            }
                                        } else if (var11.field1314) {
                                            class178.method1191(var13, var14, var11.field1302, var11.field1435, var52);
                                        } else {
                                            class178.method1186(var13, var14, var11.field1302, var11.field1435, var52);
                                        }
                                    } else if (var11.field1432 == 4) {
                                        class179 var53 = var11.method530((byte) -86);
                                        if (var53 == null) {
                                            if (class62.field1578) {
                                                class113.method901(arg4 + -765, var11);
                                            }
                                        } else {
                                            class63 var54 = var11.field1342;
                                            int var55;
                                            if (class96.method831(var11, 5)) {
                                                var55 = var11.field1384;
                                                if (class11.field257 == var11 && ~var11.field1414 != -1) {
                                                    var55 = var11.field1414;
                                                }
                                                if (var11.field1344.method582(-57) > 0) {
                                                    var54 = var11.field1344;
                                                }
                                            } else {
                                                var55 = var11.field1358;
                                                if (class11.field257 == var11 && ~var11.field1365 != -1) {
                                                    var55 = var11.field1365;
                                                }
                                            }
                                            if (var11.field1336 && var11.field1407 != -1) {
                                                class93 var56 = class59.method554(var11.field1407, 13319);
                                                var54 = var56.field2202;
                                                if (var54 == null) {
                                                    var54 = class111.field2509;
                                                }
                                                if ((~var56.field2242 == -2 || var11.field1317 != 1) && ~var11.field1317 != 0) {
                                                    var54 = class89.method772((byte) 40, new class63[] { class103.field2379, var54, class59.field1514, class180.method1198((byte) -120, var11.field1317) });
                                                }
                                            }
                                            if (class198.field3967 == var11) {
                                                var54 = class12.field284;
                                                var55 = var11.field1358;
                                            }
                                            if (!var11.field1336) {
                                                var54 = class133.method972(75, var54, var11);
                                            }
                                            var53.method648(var54, var13, var14, var11.field1302, var11.field1435, var55, var11.field1319 ? 0 : -1, var11.field1420, var11.field1422, var11.field1442);
                                        }
                                    } else if (var11.field1432 == 5) {
                                        if (!var11.field1336) {
                                            class200 var57 = var11.method526((byte) 10, class96.method831(var11, 5));
                                            if (var57 != null) {
                                                var57.method1320(var13, var14);
                                            } else if (class62.field1578) {
                                                class113.method901(0, var11);
                                            }
                                        } else {
                                            class200 var58;
                                            if (~var11.field1407 != 0) {
                                                var58 = class79.method712(var11.field1406, false, (byte) 49, var11.field1407, var11.field1317, var11.field1382);
                                            } else {
                                                var58 = var11.method526((byte) 10, false);
                                            }
                                            if (var58 == null) {
                                                if (class62.field1578) {
                                                    class113.method901(0, var11);
                                                }
                                            } else {
                                                int var59 = var58.field3991;
                                                int var60 = var58.field3989;
                                                if (!var11.field1419) {
                                                    int var61 = var11.field1302 * 4096 / var59;
                                                    if (var11.field1370 != 0) {
                                                        var58.method1307(var13 - -(var11.field1302 / 2), var14 - -(var11.field1435 / 2), var11.field1370, var61);
                                                    } else if (var15 == 0) {
                                                        if (~var11.field1302 == ~var59 && var11.field1435 == var60) {
                                                            var58.method1320(var13, var14);
                                                        } else {
                                                            var58.method1324(var13, var14, var11.field1302, var11.field1435);
                                                        }
                                                    } else {
                                                        var58.method1309(var13, var14, var11.field1302, var11.field1435, -(255 & var15) + 256);
                                                    }
                                                } else {
                                                    class178.method1181(var13, var14, var13 - -var11.field1302, var11.field1435 + var14);
                                                    int var62 = (var60 + -1 + var11.field1435) / var60;
                                                    int var63 = (var11.field1302 - (-var59 + 1)) / var59;
                                                    for (int var64 = 0; var64 < var63; ++var64) {
                                                        for (int var65 = 0; ~var62 < ~var65; ++var65) {
                                                            if (var11.field1370 != 0) {
                                                                var58.method1307(var59 / 2 + var59 * var64 + var13, var60 * var65 + (var14 - -(var60 / 2)), var11.field1370, 4096);
                                                            } else if (var15 != 0) {
                                                                var58.method1328(var13 - -(var59 * var64), var60 * var65 + var14, -(var15 & 255) + 256);
                                                            } else {
                                                                var58.method1320(var59 * var64 + var13, var60 * var65 + var14);
                                                            }
                                                        }
                                                    }
                                                    class178.method1187(arg6, arg3, arg0, arg7);
                                                }
                                            }
                                        }
                                    } else if (var11.field1432 == 6) {
                                        boolean var66 = class96.method831(var11, 5);
                                        int var67 = 0;
                                        class36 var68 = null;
                                        int var69;
                                        if (var66) {
                                            var69 = var11.field1416;
                                        } else {
                                            var69 = var11.field1361;
                                        }
                                        if (var11.field1407 == -1) {
                                            if (var11.field1404 == 5) {
                                                if (var11.field1443 == -1) {
                                                    var68 = class29.field693.method184((class9) null, -1, (class9) null, 9420, -1);
                                                } else {
                                                    int var70 = var11.field1443 & 2047;
                                                    if (class50.field1216 == var70) {
                                                        var70 = 2047;
                                                    }
                                                    class62 var71 = class33.field806[var70];
                                                    class9 var72 = ~var69 != 0 ? class49.method480(1000, var69) : null;
                                                    if (var71 != null && (int) var71.field1552.method590(-98) << 11 == (var11.field1443 & -2048)) {
                                                        var68 = var71.field1559.method184((class9) null, var11.field1307, var72, arg4 ^ 9777, 0);
                                                    }
                                                }
                                            } else if (~var69 == 0) {
                                                var68 = var11.method537(class3.field72.field1559, var66, false, (class9) null, -1);
                                                if (var68 == null && class62.field1578) {
                                                    class113.method901(0, var11);
                                                }
                                            } else {
                                                class9 var73 = class49.method480(1000, var69);
                                                var68 = var11.method537(class3.field72.field1559, var66, false, var73, var11.field1307);
                                                if (var68 == null && class62.field1578) {
                                                    class113.method901(0, var11);
                                                }
                                            }
                                        } else {
                                            class93 var74 = class59.method554(var11.field1407, arg4 ^ 14074);
                                            if (var74 != null) {
                                                class93 var75 = var74.method808((byte) -108, var11.field1317);
                                                var68 = var75.method804(0, (class9) null, (byte) -46, 1);
                                                if (var68 != null) {
                                                    var68.method331();
                                                    var67 = -var68.field728 / 2;
                                                } else {
                                                    class113.method901(0, var11);
                                                }
                                            }
                                        }
                                        if (var68 != null) {
                                            class25.method245(var13 - (-(var11.field1302 / 2) - var11.field1439), var11.field1435 / 2 + var11.field1393 + var14);
                                            int var76 = class25.field571[var11.field1418] * var11.field1320 >> 16;
                                            int var77 = class25.field576[var11.field1418] * var11.field1320 >> 16;
                                            if (!var11.field1336) {
                                                var68.method326(0, var11.field1421, 0, var11.field1418, 0, var76, var77);
                                            } else if (var11.field1363) {
                                                var68.method342(0, var11.field1421, var11.field1321, var11.field1418, var11.field1431, var67 + var76 + var11.field1415, var11.field1415 + var77, var11.field1320);
                                            } else {
                                                var68.method326(0, var11.field1421, var11.field1321, var11.field1418, var11.field1431, var67 + var76 + var11.field1415, var77 - -var11.field1415);
                                            }
                                            class25.method239();
                                        }
                                    } else {
                                        if (~var11.field1432 == -8) {
                                            class179 var78 = var11.method530((byte) -86);
                                            if (var78 == null) {
                                                if (class62.field1578) {
                                                    class113.method901(0, var11);
                                                }
                                                continue;
                                            }
                                            int var79 = 0;
                                            for (int var80 = 0; var80 < var11.field1435; ++var80) {
                                                for (int var81 = 0; var11.field1302 > var81; ++var81) {
                                                    if (~var11.field1324[var79] < -1) {
                                                        class93 var82 = class59.method554(var11.field1324[var79] + -1, 13319);
                                                        class63 var83;
                                                        if (var82.field2242 != 1 && ~var11.field1315[var79] == -2) {
                                                            var83 = class89.method772((byte) 52, new class63[] { class103.field2379, var82.field2202, class17.field413 });
                                                        } else {
                                                            var83 = class89.method772((byte) 66, new class63[] { class103.field2379, var82.field2202, class59.field1514, class180.method1198((byte) -19, var11.field1315[var79]) });
                                                        }
                                                        int var84 = (var11.field1325 + 115) * var81 + var13;
                                                        int var85 = (12 - -var11.field1329) * var80 + var14;
                                                        if (~var11.field1420 == -1) {
                                                            var78.method644(var83, var84, var85, var11.field1358, !var11.field1319 ? -1 : 0);
                                                        } else if (var11.field1420 == 1) {
                                                            var78.method647(var83, var11.field1302 / 2 + var84, var85, var11.field1358, !var11.field1319 ? -1 : 0);
                                                        } else {
                                                            var78.method662(var83, var11.field1302 + -1 + var84, var85, var11.field1358, !var11.field1319 ? -1 : 0);
                                                        }
                                                    }
                                                    ++var79;
                                                }
                                            }
                                        }
                                        if (~var11.field1432 == -9 && class114.field2557 == var11 && class41.field954 == class165.field3387) {
                                            int var86 = 0;
                                            int var87 = 0;
                                            class179 var88 = class62.field1560;
                                            class63 var89 = var11.field1342;
                                            class63 var90 = class133.method972(7, var89, var11);
                                            while (~var90.method582(-103) < -1) {
                                                int var98 = var90.method585(arg4 ^ 677, class147.field3102);
                                                class63 var99;
                                                if (var98 == -1) {
                                                    var99 = var90;
                                                    var90 = class151.field3175;
                                                } else {
                                                    var99 = var90.method596(0, var98, arg4 + -893);
                                                    var90 = var90.method592(false, var98 - -4);
                                                }
                                                int var100 = var88.method665(var99);
                                                var87 += var88.field1767 + 1;
                                                if (~var100 < ~var86) {
                                                    var86 = var100;
                                                }
                                            }
                                            int var91 = var11.field1435 + var14 + 5;
                                            var86 += 6;
                                            int var92 = var13 - -var11.field1302 + -5 + -var86;
                                            var87 += 7;
                                            if (var92 < var13 + 5) {
                                                var92 = var13 - -5;
                                            }
                                            if (~(var92 - -var86) < ~arg0) {
                                                var92 = -var86 + arg0;
                                            }
                                            if (arg7 < var87 + var91) {
                                                var91 = -var87 + arg7;
                                            }
                                            class178.method1191(var92, var91, var86, var87, 16777120);
                                            class178.method1186(var92, var91, var86, var87, 0);
                                            class63 var93 = var11.field1342;
                                            int var94 = var91 - (-var88.field1767 + -2);
                                            class63 var95 = class133.method972(arg4 + -655, var93, var11);
                                            while (var95.method582(-108) > 0) {
                                                int var96 = var95.method585(119, class147.field3102);
                                                class63 var97;
                                                if (var96 != -1) {
                                                    var97 = var95.method596(0, var96, arg4 + -850);
                                                    var95 = var95.method592(false, var96 + 4);
                                                } else {
                                                    var97 = var95;
                                                    var95 = class151.field3175;
                                                }
                                                var88.method644(var97, var92 - -3, var94, 0, -1);
                                                var94 += var88.field1767 + 1;
                                            }
                                        }
                                        if (var11.field1432 == 9) {
                                            if (var11.field1301 == 1) {
                                                class178.method1183(var13, var14, var11.field1302 + var13, var14 - -var11.field1435, var11.field1358);
                                            } else {
                                                int var101 = ~var11.field1302 > -1 ? -var11.field1302 : var11.field1302;
                                                int var102 = var11.field1435 >= 0 ? var11.field1435 : -var11.field1435;
                                                int var103 = var101;
                                                if (var101 < var102) {
                                                    var103 = var102;
                                                }
                                                if (var103 != 0) {
                                                    int var104 = (var11.field1302 << 16) / var103;
                                                    int var105 = (var11.field1435 << 16) / var103;
                                                    if (var104 >= var105) {
                                                        var104 = -var104;
                                                    } else {
                                                        var105 = -var105;
                                                    }
                                                    int var106 = var11.field1301 * var105 + 1 >> 17;
                                                    int var107 = var11.field1301 * var104 - -1 >> 17;
                                                    int var108 = -arg3 + var14;
                                                    int var109 = var13 - arg6;
                                                    int var110 = var11.field1301 * var105 >> 17;
                                                    int var111 = var11.field1301 * var104 >> 17;
                                                    int var112 = var109 + var110;
                                                    int var113 = -var106 + var109;
                                                    int var114 = var11.field1302 + var109 - var106;
                                                    int var115 = var11.field1302 + var109 + var110;
                                                    int var116 = var108 + var111;
                                                    int var117 = var108 - var107;
                                                    int var118 = var108 - -var11.field1435 + var111;
                                                    int var119 = -var107 + var108 + var11.field1435;
                                                    class25.method244(var112, var113, var114);
                                                    class25.method253(var116, var117, var119, var112, var113, var114, var11.field1358);
                                                    class25.method244(var112, var114, var115);
                                                    class25.method253(var116, var119, var118, var112, var114, var115, var11.field1358);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            ++field3765;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IBLab;)V")
    public final void method77(int arg0, byte arg1, class3 arg2) {
        ++field3760;
        if (arg0 == 0) {
            this.field3762 = arg2.method46((byte) 65);
        }
        if (arg1 <= 32) {
            field3757 = null;
        }
    }

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "(Z)V")
    public static void method1226(boolean arg0) {
        field3749 = null;
        field3757 = null;
        if (arg0) {
            field3754 = null;
        }
    }
}
