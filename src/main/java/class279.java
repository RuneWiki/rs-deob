import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public abstract class class279 extends class167 {

    @OriginalMember(owner = "client!rh", name = "H", descriptor = "I")
    public static int field4116 = 1403;

    @OriginalMember(owner = "client!rh", name = "L", descriptor = "[Lgfa;")
    public static class782[] field4120 = new class782[4];

    @OriginalMember(owner = "client!rh", name = "F", descriptor = "I")
    public static int field4114;

    @OriginalMember(owner = "client!rh", name = "G", descriptor = "I")
    public static int field4115;

    @OriginalMember(owner = "client!rh", name = "I", descriptor = "I")
    public static int field4117;

    @OriginalMember(owner = "client!rh", name = "J", descriptor = "I")
    public static int field4118;

    @OriginalMember(owner = "client!rh", name = "K", descriptor = "I")
    public static int field4119;

    @OriginalMember(owner = "client!rh", name = "M", descriptor = "I")
    public static int field4121;

    @OriginalMember(owner = "client!rh", name = "N", descriptor = "I")
    public static int field4122;

    @OriginalMember(owner = "client!rh", name = "O", descriptor = "I")
    public static int field4123;

    @OriginalMember(owner = "client!rh", name = "P", descriptor = "I")
    public static int field4124;

    @OriginalMember(owner = "client!rh", name = "Q", descriptor = "I")
    public static int field4125;

    @OriginalMember(owner = "client!rh", name = "R", descriptor = "I")
    public static int field4126;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(II)I")
    public static final int method1803(int arg0, int arg1) {
        ++field4119;
        int var2 = ((-1431655766 & arg0) >>> 1) + (arg0 & 1431655765);
        int var3 = ((-858993458 & var2) >>> 2) + (var2 & 858993459);
        if (arg1 != 2) {
            method1806(73, true, (class65) null);
        }
        int var4 = 252645135 & var3 - -(var3 >>> 4);
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return var6 & 255;
    }

    @OriginalMember(owner = "client!rh", name = "j", descriptor = "(I)V")
    public final void method66(int arg0) {
        if (arg0 != -13514) {
            this.method43((byte) 39, (class540[]) null);
        }
        ++field4124;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!rh", name = "g", descriptor = "(I)Z")
    public final boolean method45(int arg0) {
        if (arg0 < 103) {
            return false;
        } else {
            ++field4126;
            return class79.field1122[(super.field2257 >> class26.field388) + -class331.field4776 + class174.field2337][(super.field2259 >> class26.field388) + -class76.field1102 + class174.field2337];
        }
    }

    @OriginalMember(owner = "client!rh", name = "n", descriptor = "(I)Z")
    public final boolean method59(int arg0) {
        if (arg0 != -1) {
            this.method60((class65) null, (class167) null, false, -36, 27, 114, -57);
        }
        ++field4118;
        return false;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(I[II[FI[FI[IIIIII)V")
    public static final void method1804(int arg0, int[] arg1, int arg2, float[] arg3, int arg4, float[] arg5, int arg6, int[] arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        if (arg2 >= 48) {
            ++field4121;
            int var13 = arg4 * arg9 + arg8;
            int var14 = arg0 * arg12 + arg6;
            int var15 = -arg10 + arg4;
            int var16 = arg12 - arg10;
            if (arg7 == null) {
                for (int var17 = 0; ~var17 > ~arg11; ++var17) {
                    int var18 = arg10 + var13;
                    while (var18 > var13) {
                        arg5[var14++] = arg3[var13++];
                    }
                    var14 += var16;
                    var13 += var15;
                }
            } else if (arg3 == null) {
                for (int var19 = 0; arg11 > var19; ++var19) {
                    int var20 = arg10 + var13;
                    while (~var13 > ~var20) {
                        arg1[var14++] = arg7[var13++];
                    }
                    var14 += var16;
                    var13 += var15;
                }
            } else {
                for (int var21 = 0; var21 < arg11; ++var21) {
                    int var22 = arg10 + var13;
                    while (~var22 < ~var13) {
                        arg1[var14] = arg7[var13];
                        arg5[var14++] = arg3[var13++];
                    }
                    var13 += var15;
                    var14 += var16;
                }
            }
        }
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(ILha;)Z")
    public final boolean method41(int arg0, class65 arg1) {
        if (arg0 != 101) {
            field4120 = null;
        }
        ++field4117;
        class48 var3 = class618.method3395(super.field2250, super.field2257 >> class26.field388, super.field2259 >> class26.field388);
        return var3 != null && var3.field725.field4591 ? class709.method3971(var3.field725.method24(748449288) + this.method24(748449288), super.field2259 >> class26.field388, super.field2257 >> class26.field388, super.field2250, (byte) -32) : class267.method1744(super.field2257 >> class26.field388, super.field2259 >> class26.field388, super.field2250, 19322);
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)V")
    public static void method1805(int arg0) {
        if (arg0 == -16777216) {
            field4120 = null;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IZLha;)Leia;")
    public static final class255 method1806(int arg0, boolean arg1, class65 arg2) {
        ++field4122;
        class93 var3 = class526.method3032(arg2, arg1, arg0, (byte) 10);
        return var3 == null ? null : var3.field1331;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1807(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field4125;
        int var7 = class571.field7608;
        int[] var8 = class79.field1136;
        class363.field5291 = 0;
        for (int var9 = 0; var7 - -class688.field9678 > var9; ++var9) {
            class220 var37 = null;
            class124 var38;
            if (var9 >= var7) {
                var38 = ((class174) class234.field3169.method3953((long) class382.field5588[-var7 + var9], 14)).field2336;
                var37 = ((class192) var38).field2577;
                if (var37.field2995 != null) {
                    var37 = var37.method1449(class382.field5602, -1);
                    if (var37 == null) {
                        continue;
                    }
                }
            } else {
                var38 = class599.field8149[var8[var9]];
            }
            if (~var38.field1869 <= -1 && (class320.field4604 == var38.field1831 || ~class551.field7456.field2250 == ~var38.field2250)) {
                class546.method3106(arg4 >> 1, arg2, var38.method1019((byte) -126), arg6 >> 1, var38, (byte) 119, arg5);
                if (~class744.field10277[0] <= -1) {
                    if (var38.field1797 != null && (var9 >= var7 || class515.field7046 == 0 || ~class515.field7046 == -4 || ~class515.field7046 == -2 && class256.method1709(((class73) var38).field1020, (byte) -96)) && ~class781.field10704 < ~class363.field5291) {
                        class781.field10698[class363.field5291] = class548.field7413.method1696(var38.field1797, 0) / 2;
                        class781.field10701[class363.field5291] = class744.field10277[0];
                        class781.field10710[class363.field5291] = class744.field10277[1];
                        class781.field10722[class363.field5291] = var38.field1802;
                        class781.field10711[class363.field5291] = var38.field1854;
                        class781.field10718[class363.field5291] = var38.field1875;
                        class781.field10706[class363.field5291] = var38.field1797;
                        ++class363.field5291;
                    }
                    int var39 = class744.field10277[1] + arg0;
                    int var50;
                    if (!var38.field1823 && ~var38.field1852 < ~class100.field1401) {
                        boolean var40 = true;
                        byte var41 = 1;
                        int var43;
                        if (~var7 < ~var9) {
                            class73 var42 = class599.field8149[var8[var9]];
                            var43 = var38.method1014((byte) -34).field2770;
                            if (var42.field1046) {
                                var41 = 2;
                            }
                        } else {
                            var43 = var37.field2965;
                            if (var43 == -1) {
                                var43 = var38.method1014((byte) -34).field2770;
                            }
                        }
                        class147[] var44 = class497.field6868;
                        if (var43 != -1) {
                            class147[] var45 = (class147[]) class527.field7224.method1541(-10, (long) var43);
                            if (var45 == null) {
                                class508[] var46 = class508.method2946(class643.field8927, var43, 0);
                                if (var46 != null) {
                                    var45 = new class147[var46.length];
                                    for (int var47 = 0; var46.length > var47; ++var47) {
                                        var45[var47] = class379.field5542.method477(var46[var47], true);
                                    }
                                    class527.field7224.method1544(true, var45, (long) var43);
                                }
                            }
                            if (var45 != null && var45.length >= 2) {
                                var44 = var45;
                            }
                        }
                        if (~var44.length >= ~var41) {
                            var41 = 1;
                        }
                        class147 var48 = var44[0];
                        class147 var49 = var44[var41];
                        var50 = var39 - Math.max(class548.field7413.field3810, var48.method1110());
                        int var51 = class744.field10277[0] + arg1 + -(var48.method1107() >> 1);
                        int var52 = var48.method1107() * var38.field1865 / 255;
                        int var53 = var48.method1110();
                        if (var38.field1865 > 0 && ~var52 > -3) {
                            var52 = 2;
                        }
                        var48.method1102(var51, var50);
                        class379.field5542.method556(var51, var50, var51 + var52, var50 - -var53);
                        var49.method1102(var51, var50);
                        class379.field5542.method456(arg1, arg0, arg1 + arg6, arg0 + arg4);
                        class716.method4001(var48.method1096() + var51, (byte) -102, var50 + var53, var50, var51);
                    } else {
                        var50 = var39 - Math.max(class548.field7413.field3810, class497.field6868[0].method1110());
                    }
                    var50 -= 2;
                    if (!var38.field1823) {
                        if (~var38.field1862 < ~class100.field1401) {
                            class147 var54 = class514.field7044[!var38.field1855 ? 0 : 2];
                            class147 var55 = class514.field7044[var38.field1855 ? 3 : 1];
                            boolean var56 = true;
                            int var57;
                            if (!(var38 instanceof class192)) {
                                var57 = var38.method1014((byte) -34).field2757;
                            } else {
                                var57 = var37.field2947;
                                if (var57 == -1) {
                                    var57 = var38.method1014((byte) -34).field2757;
                                }
                            }
                            if (~var57 != 0) {
                                class147[] var58 = (class147[]) class87.field1226.method1541(-10, (long) var57);
                                if (var58 == null) {
                                    class508[] var59 = class508.method2946(class643.field8927, var57, 0);
                                    if (var59 != null) {
                                        var58 = new class147[var59.length];
                                        for (int var60 = 0; var59.length > var60; ++var60) {
                                            var58[var60] = class379.field5542.method477(var59[var60], true);
                                        }
                                        class87.field1226.method1544(true, var58, (long) var57);
                                    }
                                }
                                if (var58 != null && var58.length == 4) {
                                    var54 = var58[!var38.field1855 ? 0 : 2];
                                    var55 = var58[!var38.field1855 ? 1 : 3];
                                }
                            }
                            int var61 = -class100.field1401 + var38.field1862;
                            int var64;
                            if (var38.field1849 < var61) {
                                int var62 = var61 - var38.field1849;
                                int var63 = var38.field1845 == 0 ? 0 : (-var62 + var38.field1843) / var38.field1845 * var38.field1845;
                                var64 = var63 * var54.method1107() / var38.field1843;
                            } else {
                                var64 = var54.method1107();
                            }
                            int var65 = var54.method1110();
                            var50 -= var65;
                            int var66 = class744.field10277[0] + arg1 + -(var54.method1107() >> 1);
                            var54.method1102(var66, var50);
                            class379.field5542.method556(var66, var50, var64 + var66, var50 - -var65);
                            var55.method1102(var66, var50);
                            class379.field5542.method456(arg1, arg0, arg1 - -arg6, arg0 - -arg4);
                            class716.method4001(var54.method1096() + var66, (byte) -102, var50 + var65, var50, var66);
                            var50 -= 2;
                        }
                        if (~var7 < ~var9) {
                            class73 var67 = (class73) var38;
                            if (~var67.field1033 != 0) {
                                var50 -= 25;
                                class147 var68 = class327.field4757[var67.field1033];
                                var68.method1102(class744.field10277[0] + arg1 - 12, var50);
                                class716.method4001(class744.field10277[0] + -12 + arg1 + var68.method1096(), (byte) -102, var68.method1106() + var50, var50, class744.field10277[0] + arg1 + -12);
                                var50 -= 2;
                            }
                            if (~var67.field1029 != 0) {
                                var50 -= 25;
                                class147 var69 = class397.field5832[var67.field1029];
                                var69.method1102(class744.field10277[0] + arg1 - 12, var50);
                                class716.method4001(class744.field10277[0] + -12 + arg1 + var69.method1096(), (byte) -102, var69.method1106() + var50, var50, arg1 + -12 + class744.field10277[0]);
                                var50 -= 2;
                            }
                        } else if (var37.field2939 >= 0 && ~class397.field5832.length < ~var37.field2939) {
                            var50 -= 25;
                            class147 var70 = class397.field5832[var37.field2939];
                            var70.method1102(arg1 + class744.field10277[0] + -(var70.method1107() >> 1), var50);
                            class716.method4001(class744.field10277[0] + arg1 + (-(var70.method1107() >> 1) - -var70.method1096()), (byte) -102, var50 + var70.method1106(), var50, arg1 - -class744.field10277[0] + -(var70.method1107() >> 1));
                            var50 -= 2;
                        }
                    }
                    int var10000;
                    if (!(var38 instanceof class73)) {
                        int var71 = 0;
                        class553[] var72 = class581.field7771;
                        for (int var73 = 0; ~var72.length < ~var73; ++var73) {
                            class553 var75 = var72[var73];
                            if (var75 != null && var75.field7465 == 1 && ~class382.field5588[var9 - var7] == ~var75.field7467) {
                                class147 var76 = class399.field5839[var75.field7468];
                                if (~var71 > ~var76.method1110()) {
                                    var71 = var76.method1110();
                                }
                                if (class100.field1401 % 20 < 10) {
                                    var76.method1102(class744.field10277[0] + -12 + arg1, var50 - var76.method1110());
                                    class716.method4001(-12 + arg1 + class744.field10277[0] + var76.method1096(), (byte) -102, var50 + -var76.method1110() - -var76.method1106(), -var76.method1110() + var50, class744.field10277[0] + arg1 + -12);
                                }
                            }
                        }
                        if (var71 > 0) {
                            var10000 = var50 - (var71 + 2);
                        }
                    } else if (~var9 <= -1) {
                        int var77 = 0;
                        class553[] var78 = class581.field7771;
                        for (int var79 = 0; ~var79 > ~var78.length; ++var79) {
                            class553 var81 = var78[var79];
                            if (var81 != null && ~var81.field7465 == -11 && ~var8[var9] == ~var81.field7467) {
                                class147 var82 = class399.field5839[var81.field7468];
                                if (~var77 > ~var82.method1110()) {
                                    var77 = var82.method1110();
                                }
                                var82.method1102(class744.field10277[0] + arg1 - 12, -var82.method1110() + var50);
                                class716.method4001(class744.field10277[0] + (arg1 - (12 - var82.method1096())), (byte) -102, -var82.method1110() + (var50 - -var82.method1106()), var50 + -var82.method1110(), class744.field10277[0] + -12 + arg1);
                            }
                        }
                        if (~var77 < -1) {
                            var10000 = var50 - (var77 - -2);
                        }
                    }
                    for (int var83 = 0; ~class206.field2699 < ~var83; ++var83) {
                        int var84 = var38.field1858[var83];
                        int var85 = var38.field1832[var83];
                        class441 var86 = null;
                        int var87 = 0;
                        if (var85 >= 0) {
                            if (var84 <= class100.field1401) {
                                continue;
                            }
                            var86 = class493.field6825.method4285(var38.field1832[var83], -18112);
                            var87 = var86.field6212;
                        } else if (~var84 > -1) {
                            continue;
                        }
                        int var88 = var38.field1820[var83];
                        class441 var89 = null;
                        if (~var88 <= -1) {
                            var89 = class493.field6825.method4285(var88, -18112);
                        }
                        if (class100.field1401 >= -var87 + var84) {
                            int var90 = var38.field1842[var83];
                            if (~var90 <= -1) {
                                var38.field1852 = class100.field1401 + 300;
                                var38.field1865 = var90;
                                var38.field1842[var83] = -1;
                            }
                            if (var86 == null) {
                                var38.field1858[var83] = -1;
                            } else {
                                int var91 = var38.method1019((byte) -119) / 2;
                                class546.method3106(arg4 >> 1, arg2, var91, arg6 >> 1, var38, (byte) 119, arg5);
                                if (~class744.field10277[0] < 0) {
                                    class744.field10277[0] += class309.field4457[var83];
                                    class744.field10277[1] += class793.field10900[var83];
                                    Object var92 = null;
                                    Object var93 = null;
                                    Object var94 = null;
                                    Object var95 = null;
                                    int var96 = 0;
                                    int var97 = 0;
                                    int var98 = 0;
                                    int var99 = 0;
                                    int var100 = 0;
                                    int var101 = 0;
                                    int var102 = 0;
                                    int var103 = 0;
                                    class147 var104 = null;
                                    class147 var105 = null;
                                    class147 var106 = null;
                                    class147 var107 = null;
                                    int var108 = 0;
                                    int var109 = 0;
                                    int var110 = 0;
                                    int var111 = 0;
                                    int var112 = 0;
                                    int var113 = 0;
                                    int var114 = 0;
                                    int var115 = 0;
                                    int var116 = 0;
                                    class147 var117 = var86.method2656(-21380, class379.field5542);
                                    if (var117 != null) {
                                        var96 = var117.method1107();
                                        int var118 = var117.method1110();
                                        var117.method1105(class239.field3226);
                                        if (var116 < var118) {
                                            var116 = var118;
                                        }
                                        var100 = class239.field3226[0];
                                    }
                                    class147 var119 = var86.method2653(class379.field5542, 0);
                                    if (var119 != null) {
                                        var97 = var119.method1107();
                                        int var120 = var119.method1110();
                                        var119.method1105(class239.field3226);
                                        if (~var120 < ~var116) {
                                            var116 = var120;
                                        }
                                        var101 = class239.field3226[0];
                                    }
                                    class147 var121 = var86.method2660(class379.field5542, -1);
                                    if (var121 != null) {
                                        var98 = var121.method1107();
                                        int var122 = var121.method1110();
                                        if (~var122 < ~var116) {
                                            var116 = var122;
                                        }
                                        var121.method1105(class239.field3226);
                                        var102 = class239.field3226[0];
                                    }
                                    class147 var123 = var86.method2651(class379.field5542, 0);
                                    if (var123 != null) {
                                        var99 = var123.method1107();
                                        int var124 = var123.method1110();
                                        var123.method1105(class239.field3226);
                                        if (var124 > var116) {
                                            var116 = var124;
                                        }
                                        var103 = class239.field3226[0];
                                    }
                                    if (var89 != null) {
                                        var104 = var89.method2656(-21380, class379.field5542);
                                        if (var104 != null) {
                                            var108 = var104.method1107();
                                            int var125 = var104.method1110();
                                            if (var125 > var116) {
                                                var116 = var125;
                                            }
                                            var104.method1105(class239.field3226);
                                            var112 = class239.field3226[0];
                                        }
                                        var105 = var89.method2653(class379.field5542, 0);
                                        if (var105 != null) {
                                            var109 = var105.method1107();
                                            int var126 = var105.method1110();
                                            var105.method1105(class239.field3226);
                                            if (var126 > var116) {
                                                var116 = var126;
                                            }
                                            var113 = class239.field3226[0];
                                        }
                                        var106 = var89.method2660(class379.field5542, -1);
                                        if (var106 != null) {
                                            var110 = var106.method1107();
                                            int var127 = var106.method1110();
                                            if (~var116 > ~var127) {
                                                var116 = var127;
                                            }
                                            var106.method1105(class239.field3226);
                                            var114 = class239.field3226[0];
                                        }
                                        var107 = var89.method2651(class379.field5542, 0);
                                        if (var107 != null) {
                                            var111 = var107.method1107();
                                            int var128 = var107.method1110();
                                            var107.method1105(class239.field3226);
                                            if (~var116 > ~var128) {
                                                var116 = var128;
                                            }
                                            var115 = class239.field3226[0];
                                        }
                                    }
                                    class66 var129 = class541.field7353;
                                    class66 var130 = class541.field7353;
                                    class255 var131 = class22.field336;
                                    int var132 = var86.field6210;
                                    class255 var133 = class22.field336;
                                    if (var132 >= 0) {
                                        class66 var134 = class599.method3331(class379.field5542, true, var132, 0);
                                        class255 var135 = method1806(var132, true, class379.field5542);
                                        if (var134 != null && var135 != null) {
                                            var131 = var135;
                                            var129 = var134;
                                        }
                                    }
                                    if (var89 != null) {
                                        int var136 = var89.field6210;
                                        if (~var136 <= -1) {
                                            class66 var137 = class599.method3331(class379.field5542, true, var136, 0);
                                            class255 var138 = method1806(var136, true, class379.field5542);
                                            if (var137 != null && var138 != null) {
                                                var133 = var138;
                                                var130 = var137;
                                            }
                                        }
                                    }
                                    Object var139 = null;
                                    String var140 = null;
                                    boolean var141 = false;
                                    int var142 = 0;
                                    String var143 = var86.method2652((byte) -83, var38.field1811[var83]);
                                    int var144 = var131.method1696(var143, 0);
                                    if (var89 != null) {
                                        var140 = var89.method2652((byte) 100, var38.field1788[var83]);
                                        var142 = var133.method1696(var140, 0);
                                    }
                                    int var145 = 0;
                                    int var146 = 0;
                                    if (~var97 < -1) {
                                        var145 = var144 / var97 + 1;
                                    }
                                    if (var89 != null && ~var109 < -1) {
                                        var146 = var142 / var109 + 1;
                                    }
                                    int var147 = 0;
                                    int var148 = var147;
                                    if (var96 > 0) {
                                        var147 += var96;
                                    }
                                    var147 += 2;
                                    int var149 = var147;
                                    if (var98 > 0) {
                                        var147 += var98;
                                    }
                                    int var150 = var147;
                                    int var151 = var147;
                                    int var153;
                                    if (var97 > 0) {
                                        int var152 = var97 * var145;
                                        var151 = (-var144 + var152) / 2 + var147;
                                        var153 = var147 + var152;
                                    } else {
                                        var153 = var144 + var147;
                                    }
                                    int var154 = var153;
                                    if (var99 > 0) {
                                        var153 += var99;
                                    }
                                    int var155 = 0;
                                    int var156 = 0;
                                    int var157 = 0;
                                    int var158 = 0;
                                    int var159 = 0;
                                    if (var89 != null) {
                                        var153 += 2;
                                        var155 = var153;
                                        if (var108 > 0) {
                                            var153 += var108;
                                        }
                                        var153 += 2;
                                        var156 = var153;
                                        if (~var110 < -1) {
                                            var153 += var110;
                                        }
                                        var157 = var153;
                                        var159 = var153;
                                        if (var109 > 0) {
                                            int var160 = var109 * var146;
                                            var153 += var160;
                                            var159 += (-var142 + var160) / 2;
                                        } else {
                                            var153 += var142;
                                        }
                                        var158 = var153;
                                        if (var111 > 0) {
                                            var153 += var111;
                                        }
                                    }
                                    int var161 = var38.field1858[var83] - class100.field1401;
                                    int var162 = var86.field6199 - var86.field6199 * var161 / var86.field6212;
                                    int var163 = var86.field6204 * var161 / var86.field6212 + -var86.field6204;
                                    int var164 = -(var153 >> 1) + arg1 - (-class744.field10277[0] + -var162);
                                    int var165 = arg0 - -class744.field10277[1] + var163 + -12;
                                    int var166 = var165;
                                    int var167 = var116 + var165;
                                    int var168 = var86.field6192 + var165 - -15;
                                    int var169 = -var131.field3810 + var168;
                                    if (~var165 < ~var169) {
                                        var166 = var169;
                                    }
                                    int var170 = var131.field3807 + var168;
                                    if (var167 < var170) {
                                        var167 = var170;
                                    }
                                    int var171 = 0;
                                    if (var89 != null) {
                                        var171 = var89.field6192 + var165 + 15;
                                        int var172 = -var133.field3810 + var171;
                                        if (~var172 > ~var166) {
                                            var166 = var172;
                                        }
                                        int var173 = var133.field3807 + var171;
                                        if (~var173 < ~var167) {
                                            var167 = var173;
                                        }
                                    }
                                    int var174 = 255;
                                    if (~var86.field6217 <= -1) {
                                        var174 = (var161 << 8) / (-var86.field6217 + var86.field6212);
                                    }
                                    if (~var174 <= -1 && var174 < 255) {
                                        int var175 = var174 << 24;
                                        int var176 = var175 | 16777215;
                                        if (var117 != null) {
                                            var117.method1086(var148 + var164 + -var100, var165, 0, var176, 1);
                                        }
                                        if (var121 != null) {
                                            var121.method1086(var149 + var164 - var102, var165, 0, var176, 1);
                                        }
                                        if (var119 != null) {
                                            for (int var177 = 0; var145 > var177; ++var177) {
                                                var119.method1086(var97 * var177 + -var101 + var164 + var150, var165, 0, var176, 1);
                                            }
                                        }
                                        if (var123 != null) {
                                            var123.method1086(-var103 + var154 + var164, var165, 0, var176, 1);
                                        }
                                        var129.method583((byte) 56, var168, 0, var143, var86.field6216 | var175, var151 + var164);
                                        if (var89 != null) {
                                            if (var104 != null) {
                                                var104.method1086(var164 - -var155 + -var112, var165, 0, var176, 1);
                                            }
                                            if (var106 != null) {
                                                var106.method1086(var164 - (-var156 + var114), var165, 0, var176, 1);
                                            }
                                            if (var105 != null) {
                                                for (int var178 = 0; var178 < var146; ++var178) {
                                                    var105.method1086(var157 + var164 - -(var109 * var178) + -var113, var165, 0, var176, 1);
                                                }
                                            }
                                            if (var107 != null) {
                                                var107.method1086(var164 - -var158 + -var115, var165, 0, var176, 1);
                                            }
                                            var130.method583((byte) 56, var171, 0, var140, var175 | var89.field6216, var159 + var164);
                                        }
                                    } else {
                                        if (var117 != null) {
                                            var117.method1102(-var100 + var148 + var164, var165);
                                        }
                                        if (var121 != null) {
                                            var121.method1102(var149 + var164 + -var102, var165);
                                        }
                                        if (var119 != null) {
                                            for (int var179 = 0; var145 > var179; ++var179) {
                                                var119.method1102(var97 * var179 + var150 + var164 + -var101, var165);
                                            }
                                        }
                                        if (var123 != null) {
                                            var123.method1102(var164 - -var154 - var103, var165);
                                        }
                                        var129.method583((byte) 56, var168, 0, var143, var86.field6216 | -16777216, var151 + var164);
                                        if (var89 != null) {
                                            if (var104 != null) {
                                                var104.method1102(-var112 + var155 + var164, var165);
                                            }
                                            if (var106 != null) {
                                                var106.method1102(var164 - var114 + var156, var165);
                                            }
                                            if (var105 != null) {
                                                for (int var180 = 0; var146 > var180; ++var180) {
                                                    var105.method1102(var157 + var164 - (-(var109 * var180) + var113), var165);
                                                }
                                            }
                                            if (var107 != null) {
                                                var107.method1102(var158 + var164 + -var115, var165);
                                            }
                                            var130.method583((byte) 56, var171, 0, var140, -16777216 | var89.field6216, var159 + var164);
                                        }
                                    }
                                    class716.method4001(var164 - -var153, (byte) -102, var167 + 1, var166, var164);
                                }
                            }
                        }
                    }
                }
            }
        }
        for (int var10 = 0; class40.field639 > var10; ++var10) {
            int var33 = class267.field3934[var10];
            class124 var34;
            if (var33 < 2048) {
                var34 = class599.field8149[var33];
            } else {
                var34 = ((class174) class234.field3169.method3953((long) (var33 - 2048), 14)).field2336;
            }
            int var35 = class103.field1421[var10];
            class124 var36;
            if (~var35 > -2049) {
                var36 = class599.field8149[var35];
            } else {
                var36 = ((class174) class234.field3169.method3953((long) (var35 + -2048), 14)).field2336;
            }
            class553.method3125(var34, arg0, arg1, (byte) -124, arg2, --var34.field1821, arg6, arg4, arg5, var36);
        }
        int var11 = class548.field7413.field3810 + 2 - -class548.field7413.field3807;
        if (arg3 < -51) {
            for (int var12 = 0; ~var12 > ~class363.field5291; ++var12) {
                int var13 = class781.field10701[var12];
                int var14 = class781.field10710[var12];
                int var15 = class781.field10698[var12];
                boolean var16 = true;
                while (var16) {
                    var16 = false;
                    for (int var32 = 0; ~var12 < ~var32; ++var32) {
                        if (~(var14 + 2) < ~(class781.field10710[var32] + -var11) && ~(class781.field10710[var32] + 2) < ~(-var11 + var14) && -var15 + var13 < class781.field10701[var32] + class781.field10698[var32] && var13 - -var15 > class781.field10701[var32] + -class781.field10698[var32] && class781.field10710[var32] - var11 < var14) {
                            var14 = class781.field10710[var32] - var11;
                            var16 = true;
                        }
                    }
                }
                class781.field10710[var12] = var14;
                String var17 = class781.field10706[var12];
                int var18 = class548.field7413.method1696(var17, 0);
                int var19 = arg1 - -var13;
                int var20 = -class548.field7413.field3810 + arg0 - -var14;
                int var21 = var18 + var19;
                int var22 = arg0 + var14 + class548.field7413.field3807;
                if (~class601.field8182 != -1) {
                    class251.field3716.method579(arg1 + var13, -16777216, -256, (byte) 41, var17, arg0 + var14);
                    var21 -= var18 >> 1;
                    var19 -= var18 >> 1;
                } else {
                    int var23 = 16776960;
                    if (class781.field10722[var12] < 6) {
                        var23 = class530.field7234[class781.field10722[var12]];
                    }
                    if (~class781.field10722[var12] == -7) {
                        var23 = ~(class320.field4604 % 20) > -11 ? 16711680 : 16776960;
                    }
                    if (class781.field10722[var12] == 7) {
                        var23 = ~(class320.field4604 % 20) <= -11 ? 65535 : 255;
                    }
                    if (class781.field10722[var12] == 8) {
                        var23 = class320.field4604 % 20 >= 10 ? 8454016 : 45056;
                    }
                    if (class781.field10722[var12] == 9) {
                        int var24 = -class781.field10718[var12] + 150;
                        if (var24 < 50) {
                            var23 = var24 * 1280 + 16711680;
                        } else if (var24 >= 100) {
                            if (var24 < 150) {
                                var23 = 65280 - (-(var24 * 5) + 500);
                            }
                        } else {
                            var23 = 16776960 - (var24 + -50) * 327680;
                        }
                    }
                    if (class781.field10722[var12] == 10) {
                        int var25 = 150 - class781.field10718[var12];
                        if (~var25 > -51) {
                            var23 = var25 * 5 + 16711680;
                        } else if (var25 < 100) {
                            var23 = 16384000 - (var25 * 327680 - 16711935);
                        } else if (var25 < 150) {
                            var23 = 500 - (var25 * 5 - 255) + var25 * 327680 + -32768000;
                        }
                    }
                    if (class781.field10722[var12] == 11) {
                        int var26 = -class781.field10718[var12] + 150;
                        if (~var26 <= -51) {
                            if (var26 >= 100) {
                                if (~var26 > -151) {
                                    var23 = -((var26 + -100) * 327680) + 16777215;
                                }
                            } else {
                                var23 = (var26 - 50) * 327685 + 65280;
                            }
                        } else {
                            var23 = -(var26 * 327685) + 16777215;
                        }
                    }
                    int var27 = -16777216 | var23;
                    if (~class781.field10711[var12] == -1) {
                        var19 -= var18 >> 1;
                        class251.field3716.method579(arg1 + var13, -16777216, var27, (byte) 60, var17, arg0 + var14);
                        var21 -= var18 >> 1;
                    }
                    if (class781.field10711[var12] == 1) {
                        var21 -= var18 >> 1;
                        var20 -= 5;
                        var19 -= var18 >> 1;
                        class251.field3716.method576(class320.field4604, arg0 + var14, var17, var27, -16777216, 2, arg1 + var13);
                        var22 += 5;
                    }
                    if (~class781.field10711[var12] == -3) {
                        var21 -= (var18 >> 1) - 5;
                        var22 += 5;
                        var19 -= (var18 >> 1) + 5;
                        class251.field3716.method573(arg1 - -var13, var27, -16777216, arg0 - -var14, var17, 124, class320.field4604);
                        var20 -= 5;
                    }
                    if (class781.field10711[var12] == 3) {
                        var20 -= 7;
                        var21 -= var18 >> 1;
                        var22 += 7;
                        class251.field3716.method578(arg1 - -var13, -16777216, class320.field4604, -class781.field10718[var12] + 150, (byte) -101, var27, arg0 + var14, var17);
                        var19 -= var18 >> 1;
                    }
                    if (~class781.field10711[var12] == -5) {
                        int var28 = (150 - class781.field10718[var12]) * (class548.field7413.method1696(var17, 0) + 100) / 150;
                        class379.field5542.method556(arg1 + -50 - -var13, arg0, arg1 + var13 + 50, arg0 + arg4);
                        var21 += 50 - var28;
                        class251.field3716.method583((byte) 56, arg0 + var14, -16777216, var17, var27, 50 - var28 + arg1 + var13);
                        var19 += -var28 + 50;
                        class379.field5542.method456(arg1, arg0, arg1 + arg6, arg0 + arg4);
                    }
                    if (~class781.field10711[var12] == -6) {
                        int var29 = -class781.field10718[var12] + 150;
                        int var30 = 0;
                        if (var29 >= 25) {
                            if (var29 > 125) {
                                var30 = var29 - 125;
                            }
                        } else {
                            var30 = var29 + -25;
                        }
                        int var31 = class548.field7413.field3810 + class548.field7413.field3807;
                        class379.field5542.method556(arg1, -var31 + var14 + arg0 - 1, arg1 - -arg6, arg0 - (-var14 - 5));
                        var22 += var30;
                        class251.field3716.method579(arg1 + var13, -16777216, var27, (byte) 34, var17, arg0 + var14 + var30);
                        var19 -= var18 >> 1;
                        var21 -= var18 >> 1;
                        var20 += var30;
                        class379.field5542.method456(arg1, arg0, arg1 + arg6, arg0 + arg4);
                    }
                }
                class716.method4001(var21 + 1, (byte) -102, var22 + 1, var20, var19);
            }
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IZIIIIBIF)[[I")
    public static final int[][] method1808(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, float arg8) {
        ++field4114;
        int[][] var9 = new int[arg4][arg5];
        class13 var10 = new class13();
        var10.field195 = (int) (arg8 * 4096.0F);
        var10.field200 = arg7;
        var10.field194 = arg1;
        var10.field213 = arg3;
        var10.field201 = arg0;
        if (arg6 < 62) {
            field4120 = null;
        }
        var10.method101(true);
        class160.method1172(arg5, arg4, -106);
        for (int var11 = 0; var11 < arg4; ++var11) {
            var10.method98(106, var9[var11], var11);
        }
        return var9;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lha;Lwea;ZIIII)V")
    public final void method60(class65 arg0, class167 arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field4115;
        if (arg3 <= -16) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(B[Luca;)I")
    public final int method43(byte arg0, class540[] arg1) {
        if (arg0 >= -20) {
            method1803(94, 56);
        }
        ++field4123;
        return this.method1200(super.field2259 >> class26.field388, arg1, super.field2257 >> class26.field388, (byte) 36);
    }

    @OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(IIIII)V")
    public class279(int arg0, int arg1, int arg2, int arg3, int arg4) {
        super.field2244 = (byte) arg4;
        super.field2250 = (byte) arg3;
        super.field2259 = arg2;
        super.field2257 = arg0;
        super.field2246 = arg1;
    }
}
