import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class163 extends class81 {

    @OriginalMember(owner = "client!ek", name = "Tb", descriptor = "I")
    public static int field2949 = 0;

    @OriginalMember(owner = "client!ek", name = "Wb", descriptor = "[I")
    public static int[] field2952 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!ek", name = "Sb", descriptor = "Lcc;")
    private static class209 field2948 = class95.method669(125, "Loading world list data");

    @OriginalMember(owner = "client!ek", name = "ec", descriptor = "I")
    public static int field2960 = 0;

    @OriginalMember(owner = "client!ek", name = "fc", descriptor = "Z")
    public static boolean field2961 = true;

    @OriginalMember(owner = "client!ek", name = "Xb", descriptor = "Lcc;")
    public static class209 field2953 = field2948;

    @OriginalMember(owner = "client!ek", name = "jc", descriptor = "Lcc;")
    public static class209 field2965 = class95.method669(81, "hint_mapedge");

    @OriginalMember(owner = "client!ek", name = "cc", descriptor = "[I")
    public static int[] field2958 = new int[100];

    @OriginalMember(owner = "client!ek", name = "mc", descriptor = "I")
    public static int field2968 = 0;

    @OriginalMember(owner = "client!ek", name = "Pb", descriptor = "I")
    public static int field2945;

    @OriginalMember(owner = "client!ek", name = "Qb", descriptor = "I")
    public static int field2946;

    @OriginalMember(owner = "client!ek", name = "Rb", descriptor = "I")
    public static int field2947;

    @OriginalMember(owner = "client!ek", name = "Vb", descriptor = "I")
    public static int field2951;

    @OriginalMember(owner = "client!ek", name = "Yb", descriptor = "I")
    public static int field2954;

    @OriginalMember(owner = "client!ek", name = "ac", descriptor = "I")
    public static int field2956;

    @OriginalMember(owner = "client!ek", name = "bc", descriptor = "I")
    public static int field2957;

    @OriginalMember(owner = "client!ek", name = "dc", descriptor = "I")
    public static int field2959;

    @OriginalMember(owner = "client!ek", name = "gc", descriptor = "I")
    public static int field2962;

    @OriginalMember(owner = "client!ek", name = "ic", descriptor = "I")
    public static int field2964;

    @OriginalMember(owner = "client!ek", name = "kc", descriptor = "I")
    public static int field2966;

    @OriginalMember(owner = "client!ek", name = "lc", descriptor = "I")
    public static int field2967;

    @OriginalMember(owner = "client!ek", name = "nc", descriptor = "Ld;")
    public class237 field2969;

    @OriginalMember(owner = "client!ek", name = "Zb", descriptor = "Lsj;")
    public static class49 field2955;

    @OriginalMember(owner = "client!ek", name = "hc", descriptor = "Lsj;")
    public static class49 field2963;

    @OriginalMember(owner = "client!ek", name = "Ub", descriptor = "[Ljb;")
    public static class269[] field2950;

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(I)I")
    public static final int method1126(int arg0) {
        ++field2957;
        int var1 = 10 % ((arg0 - -2) / 37);
        return 2;
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "()I")
    public final int method216() {
        ++field2954;
        return super.field1508;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(ILd;)V")
    public final void method1127(int arg0, class237 arg1) {
        this.field2969 = arg1;
        ++field2945;
        if (super.field1555 != null) {
            super.field1555.method1564();
        }
        if (arg0 > -55) {
            this.method214(107, -52, -4, 56, -23);
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIIIIIIIJILmd;)V")
    public final void method208(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class221 arg10) {
        ++field2966;
        if (this.field2969 != null) {
            class241 var13 = ~super.field1541 != 0 && ~super.field1539 == -1 ? class245.method1706(super.field1541, (byte) 123) : null;
            class241 var14 = super.field1551 == -1 || ~super.field1551 == ~super.field1549 && var13 != null ? null : class245.method1706(super.field1551, (byte) 123);
            class189 var15 = this.field2969.method1638(super.field1521, var13, var14, -50, super.field1519);
            if (var15 != null) {
                super.field1508 = var15.method216();
                class237 var16 = this.field2969;
                if (var16.field4295 != null) {
                    var16 = var16.method1636(125);
                }
                if (class234.field4209 && var16.field4280) {
                    class189 var17 = class199.method1359(this.field2969.field4277, this.field2969.field4237, this.field2969.field4234, (byte) -44, super.field1534, var14 == null ? super.field1521 : super.field1519, arg0, this.field2969.field4271, this.field2969.field4262, super.field1503, var14 != null ? var14 : var13, super.field1571, super.field1558, var15);
                    var17.method208(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, super.field1555);
                }
                int var18 = 0;
                int var19 = 0;
                int var20 = 0;
                if (this.field2969.field4290 != 0 || ~this.field2969.field4270 != -1) {
                    int var21 = class15.field280[arg0];
                    int var22 = class15.field278[arg0];
                    short var23 = this.field2969.field4290;
                    short var24 = this.field2969.field4270;
                    int var25 = -var23 / 2;
                    int var26 = -var24 / 2;
                    int var27 = var21 * var25 + var22 * var26 >> 16;
                    int var28 = var21 * var26 + -(var22 * var25) >> 16;
                    int var29 = class94.method661(super.field1534 - -var28, 19452, class99.field1937, super.field1571 + var27);
                    int var30 = var23 / 2;
                    int var31 = var24 / 2;
                    int var32 = -var23 / 2;
                    int var33 = var21 * var31 + -(var22 * var32) >> 16;
                    int var34 = var21 * var32 + var22 * var31 >> 16;
                    int var35 = var23 / 2;
                    int var36 = -var24 / 2;
                    int var37 = var21 * var30 + var22 * var36 >> 16;
                    int var38 = var24 / 2;
                    int var39 = var21 * var38 + -(var22 * var35) >> 16;
                    int var40 = var21 * var36 + -(var22 * var30) >> 16;
                    int var41 = class94.method661(super.field1534 + var40, 19452, class99.field1937, super.field1571 - -var37);
                    int var42 = var21 * var35 + var22 * var38 >> 16;
                    int var43 = class94.method661(super.field1534 + var33, 19452, class99.field1937, super.field1571 + var34);
                    int var44 = var29 < var41 ? var29 : var41;
                    int var45 = class94.method661(super.field1534 + var39, 19452, class99.field1937, super.field1571 + var42);
                    int var46 = var45 > var43 ? var43 : var45;
                    if (var24 != 0) {
                        var18 = (int) (Math.atan2((double) (-var46 + var44), (double) var24) * 325.95D) & 2047;
                        if (~var18 != -1) {
                            var15.method428(var18);
                        }
                    }
                    int var47 = var29 + var45;
                    int var48 = var29 >= var43 ? var43 : var29;
                    if (~(var41 + var43) > ~var47) {
                        var47 = var41 + var43;
                    }
                    int var49 = ~var45 < ~var41 ? var41 : var45;
                    if (var23 != 0) {
                        var19 = (int) (325.95D * Math.atan2((double) (-var49 + var48), (double) var23)) & 2047;
                        if (var19 != 0) {
                            var15.method424(var19);
                        }
                    }
                    var20 = (var47 >> 1) - super.field1558;
                    if (var20 != 0) {
                        var15.method433(0, var20, 0);
                    }
                }
                class189 var50 = null;
                if (~super.field1517 != 0 && ~super.field1547 != 0) {
                    class226 var51 = class259.method1797(119, super.field1517);
                    var50 = var51.method1589(super.field1547, (byte) -102);
                    if (var50 != null) {
                        var50.method433(0, -super.field1572, 0);
                        if (var51.field4116) {
                            if (var18 != 0) {
                                var50.method428(var18);
                            }
                            if (~var19 != -1) {
                                var50.method424(var19);
                            }
                            if (~var20 != -1) {
                                var50.method433(0, var20, 0);
                            }
                        }
                    }
                }
                if (var50 != null) {
                    var15 = ((class55) var15).method417(var50);
                }
                this.method568(-78, var15);
                if (~this.field2969.field4277 == -2) {
                    var15.field3435 = true;
                }
                var15.method208(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, super.field1555);
            }
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIZ[BII[Lga;IIIZ)V")
    public static final void method1128(int arg0, int arg1, boolean arg2, byte[] arg3, int arg4, int arg5, class170[] arg6, int arg7, int arg8, int arg9, boolean arg10) {
        ++field2959;
        byte var11;
        if (arg2) {
            var11 = 1;
        } else {
            var11 = 4;
        }
        if (!arg2) {
            for (int var12 = 0; ~var12 > -9; ++var12) {
                for (int var13 = 0; var13 < 8; ++var13) {
                    if (arg1 + var12 > 0 && arg1 - -var12 < 103 && arg4 - -var13 > 0 && arg4 + var13 < 103) {
                        arg6[arg0].field3103[arg1 + var12][arg4 + var13] = class27.method220(arg6[arg0].field3103[arg1 + var12][arg4 + var13], -16777217);
                    }
                }
            }
        }
        class106 var14 = new class106(arg3);
        for (int var15 = 0; var15 < var11; ++var15) {
            for (int var35 = 0; ~var35 > -65; ++var35) {
                for (int var36 = 0; ~var36 > -65; ++var36) {
                    if (~arg8 == ~var15 && ~arg9 >= ~var35 && ~var35 > ~(arg9 - -8) && ~arg7 >= ~var36 && arg7 + 8 > var36) {
                        class124.method902(class145.method1013(arg5, var35 & 7, (byte) 122, var36 & 7) + arg4, 0, arg1 + class110.method794(7 & var36, arg5, 7 & var35, 2), var14, arg2, arg5, 0, arg0, (byte) -77);
                    } else {
                        class124.method902(-1, 0, -1, var14, arg2, 0, 0, 0, (byte) -123);
                    }
                }
            }
        }
        while (var14.field2085 < var14.field2108.length) {
            int var16 = var14.method774((byte) 118);
            if (~var16 != -130) {
                --var14.field2085;
                break;
            }
            for (int var22 = 0; var22 < 4; ++var22) {
                byte var23 = var14.method777(87);
                if (var23 != 0) {
                    if (~var23 == -2) {
                        for (int var24 = 0; var24 < 64; var24 += 4) {
                            for (int var25 = 0; ~var25 > -65; var25 += 4) {
                                byte var26 = var14.method777(111);
                                if (arg8 >= var22) {
                                    int var27 = var24;
                                    while (~(var24 + 4) < ~var27) {
                                        int var28 = var25;
                                        while (~var28 > ~(var25 + 4)) {
                                            if (var27 >= arg9 && ~var27 > ~(arg9 + 8) && ~arg7 >= ~var28 && ~arg7 > ~(arg7 - -8)) {
                                                int var29 = class110.method794(7 & var28, arg5, var27 & 7, 2) + arg1;
                                                int var30 = class145.method1013(arg5, var27 & 7, (byte) 124, var28 & 7) + arg4;
                                                if (var29 >= 0 && var29 < 104 && var30 >= 0 && var30 < 104) {
                                                    class110.field2222[arg0][var29][var30] = var26;
                                                }
                                            }
                                            ++var25;
                                        }
                                        ++var24;
                                    }
                                }
                            }
                        }
                    }
                } else if (~arg8 <= ~var22) {
                    int var31 = arg1;
                    if (~arg1 <= -1) {
                        if (~arg1 <= -105) {
                            var31 = 104;
                        }
                    } else {
                        var31 = 0;
                    }
                    int var32 = arg1 + 7;
                    if (var32 >= 0) {
                        if (~var32 <= -105) {
                            var32 = 104;
                        }
                    } else {
                        var32 = 0;
                    }
                    int var33 = arg4;
                    int var34 = arg4 + 7;
                    if (~var34 <= -1) {
                        if (var34 >= 104) {
                            var34 = 104;
                        }
                    } else {
                        var34 = 0;
                    }
                    if (~arg4 > -1) {
                        var33 = 0;
                    } else if (~arg4 <= -105) {
                        var33 = 104;
                    }
                    while (var32 > var31) {
                        while (~var33 > ~var34) {
                            class110.field2222[arg0][var31][var33] = 0;
                            ++var33;
                        }
                        ++var31;
                    }
                }
            }
        }
        if (!arg10) {
            int var18 = arg4 + 7;
            int var19 = arg1 + 7;
            for (int var20 = arg1; var19 > var20; ++var20) {
                for (int var21 = arg4; ~var18 < ~var21; ++var21) {
                    class110.field2222[arg0][var20][var21] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "(B)Lse;")
    public static final class204 method1129(byte arg0) {
        if (arg0 != 25) {
            method1128(117, 3, false, (byte[]) null, 12, 44, (class170[]) null, 49, 11, 14, false);
        }
        ++field2962;
        try {
            return (class204) Class.forName("nd").newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIIII)V")
    public final void method214(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field2964;
        if (this.field2969 != null) {
            if (!super.field1550) {
                class241 var6 = ~super.field1541 != 0 && super.field1539 == 0 ? class245.method1706(super.field1541, (byte) 118) : null;
                class241 var7 = super.field1551 == -1 || ~super.field1551 == ~super.field1549 && var6 != null ? null : class245.method1706(super.field1551, (byte) 118);
                class189 var8 = this.field2969.method1638(super.field1521, var6, var7, -50, super.field1519);
                if (var8 == null) {
                    return;
                }
                this.method568(-110, var8);
            }
            if (super.field1555 != null) {
                super.field1555.method1555(arg0, arg1, arg3, arg2, arg4);
            }
        }
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(Z)Z")
    public final boolean method576(boolean arg0) {
        ++field2956;
        if (this.field2969 == null) {
            return false;
        } else {
            if (arg0) {
                this.method576(false);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ek", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (super.field1555 != null) {
            super.field1555.method1559();
        }
        ++field2947;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Lcc;ZI)V")
    public static final void method1130(class209 arg0, boolean arg1, int arg2) {
        if (!arg1) {
            try {
                class23.field435.getAppletContext().showDocument(arg0.method1456(false, class23.field435.getCodeBase()), "_top");
            } catch (Exception var4) {
            }
        } else {
            try {
                class23.field435.getAppletContext().showDocument(arg0.method1456(false, class23.field435.getCodeBase()), "_blank");
            } catch (Exception var3) {
            }
        }
        if (arg2 != 0) {
            method1128(-91, 91, false, (byte[]) null, 4, 89, (class170[]) null, -62, 112, 58, true);
        }
        ++field2946;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(ILsj;)V")
    public static final void method1131(int arg0, class49 arg1) {
        ++field2967;
        if (!class59.field1182) {
            class4.method29();
            class166.field2996 = class95.method668(class110.field2220, arg0 ^ 116, arg1);
            int var2 = class50.field981;
            int var3 = var2 * 956 / 503;
            class166.field2996.method235((-var3 + class25.field442) / 2, arg0, var3, var2);
            class84.field1668 = class220.method1548(class72.field1355, true, arg1);
            class84.field1668.method1330(class25.field442 / 2 + -(class84.field1668.field4078 / 2), 18);
            class59.field1182 = true;
        }
    }

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "(I)V")
    public static void method1132(int arg0) {
        field2965 = null;
        field2953 = null;
        if (arg0 == -1691822064) {
            field2958 = null;
            field2963 = null;
            field2955 = null;
            field2952 = null;
            field2948 = null;
            field2950 = null;
        }
    }
}
