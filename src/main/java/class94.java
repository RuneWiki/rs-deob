import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class94 extends class272 {

    @OriginalMember(owner = "client!ke", name = "J", descriptor = "I")
    public static int field1784 = 0;

    @OriginalMember(owner = "client!ke", name = "I", descriptor = "Lli;")
    public static class185 field1783 = class245.method1649("_", 127);

    @OriginalMember(owner = "client!ke", name = "T", descriptor = "I")
    public static int field1794 = 64;

    @OriginalMember(owner = "client!ke", name = "V", descriptor = "Lli;")
    public static class185 field1796 = class245.method1649("Liste des serveurs charg-Be", -29);

    @OriginalMember(owner = "client!ke", name = "K", descriptor = "I")
    private int field1785;

    @OriginalMember(owner = "client!ke", name = "L", descriptor = "I")
    public static int field1786;

    @OriginalMember(owner = "client!ke", name = "M", descriptor = "I")
    public static int field1787;

    @OriginalMember(owner = "client!ke", name = "N", descriptor = "I")
    private int field1788;

    @OriginalMember(owner = "client!ke", name = "O", descriptor = "I")
    public static int field1789;

    @OriginalMember(owner = "client!ke", name = "P", descriptor = "I")
    public static int field1790;

    @OriginalMember(owner = "client!ke", name = "Q", descriptor = "I")
    public static int field1791;

    @OriginalMember(owner = "client!ke", name = "R", descriptor = "I")
    private int field1792;

    @OriginalMember(owner = "client!ke", name = "S", descriptor = "I")
    public static int field1793;

    @OriginalMember(owner = "client!ke", name = "U", descriptor = "I")
    public static int field1795;

    @OriginalMember(owner = "client!ke", name = "W", descriptor = "[Lne;")
    public static class199[] field1797;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIBII)V")
    public static final void method608(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        class216.field3964 = arg1;
        class207.field3810 = arg3;
        class113.field2040 = arg4;
        class66.field1163 = arg0;
        if (arg2 != 43) {
            method610(89, -84, 43, -125, 2, -94, 106, 64, -95, 12, -36);
        }
        ++field1789;
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(B)V")
    public static void method609(byte arg0) {
        field1796 = null;
        field1797 = null;
        field1783 = null;
        if (arg0 >= -106) {
            method609((byte) -88);
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIIIIIIIIII)V")
    public static final void method610(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        ++field1795;
        int var11 = arg4 - arg10;
        int var12 = -arg8 + arg2;
        if (~class56.field971 < ~arg2) {
            ++var12;
        }
        if (~arg4 > ~class125.field2246) {
            ++var11;
        }
        if (arg0 != -498370640) {
            field1794 = 42;
        }
        int var10000;
        for (int var13 = 0; var12 > var13; ++var13) {
            int var44 = (var13 + 1) * arg7 + arg9 >> 16;
            int var45 = arg9 - -(arg7 * var13) >> 16;
            int var46 = -var45 + var44;
            if (~var46 < -1) {
                int var47 = arg8 + var13 >> 6;
                if (var47 >= 0 && var47 <= class232.field4176.length - 1) {
                    int var48 = arg1 + var45;
                    int var49 = arg1 + var44;
                    int[][] var50 = class232.field4176[var47];
                    byte[][] var51 = class129.field2312[var47];
                    byte[][] var52 = class199.field3662[var47];
                    byte[][] var53 = class165.field3091[var47];
                    byte[][] var54 = class272.field4825[var47];
                    byte[][] var55 = class258.field4590[var47];
                    for (int var56 = 0; ~var11 < ~var56; ++var56) {
                        int var57 = arg5 * var56 + arg3 >> 16;
                        int var58 = (var56 + 1) * arg5 + arg3 >> 16;
                        int var59 = -var57 + var58;
                        if (~var59 < -1) {
                            int var60 = arg6 + var58;
                            int var61 = arg10 + var56 >> 6;
                            int var62 = arg6 + var57;
                            int var63 = arg8 + var13 & 63;
                            int var64 = 63 & arg10 + var56;
                            int var65 = (var64 << 6) + var63;
                            int var66;
                            if (var61 >= 0 && ~(var50.length + -1) <= ~var61 && var50[var61] != null) {
                                var66 = var50[var61][var65];
                            } else {
                                if (~class65.field1124.field1671 != 0) {
                                    var66 = class65.field1124.field1671;
                                } else if (~(4 & var13 - -arg8) != ~(4 & arg10 + var56)) {
                                    var66 = 4936552;
                                } else {
                                    var66 = class40.field637[class272.field4820 + 1];
                                }
                                if (~var61 > -1 || var61 > var50.length - 1) {
                                    if (~var66 == -1) {
                                        var66 = 1;
                                    }
                                    class159.method1130(var48, var62, var46, var59, var66);
                                    continue;
                                }
                            }
                            int var67 = var53[var61] == null ? 0 : class40.field637[255 & var53[var61][var65]];
                            if (var66 == 0) {
                                var66 = 1;
                            }
                            int var68 = var51[var61] != null ? class40.field637[255 & var51[var61][var65]] : 0;
                            if (var67 == 0 && ~var68 == -1) {
                                class159.method1130(var48, var62, var46, var59, var66);
                            } else {
                                if (~var67 != -1) {
                                    byte var69 = var52[var61] != null ? var52[var61][var65] : 0;
                                    if (var67 == -1) {
                                        var67 = 1;
                                    }
                                    int var70 = var69 & 252;
                                    if (var70 != 0 && var46 > 1 && ~var59 < -2) {
                                        class237.method1612(var66, var59, var46, true, -103, class159.field3015, var48, 3 & var69, var62, var67, var70 >> 2);
                                    } else {
                                        class159.method1130(var48, var62, var46, var59, var67);
                                    }
                                }
                                if (~var68 != -1) {
                                    if (~var68 == 0) {
                                        var68 = var66;
                                    }
                                    byte var71 = var55[var61][var65];
                                    int var72 = var71 & 252;
                                    if (~var72 == -1 || ~var46 >= -2 || var59 <= 1) {
                                        class159.method1130(var48, var62, var46, var59, var68);
                                    }
                                    class237.method1612(0, var59, var46, var67 == 0, -126, class159.field3015, var48, var71 & 3, var62, var68, var72 >> 2);
                                }
                            }
                            if (var54[var61] != null) {
                                int var73 = var54[var61][var65] & 255;
                                if (~var73 != -1) {
                                    int var74;
                                    if (var46 != 1) {
                                        var74 = var49 + -1;
                                    } else {
                                        var74 = var48;
                                    }
                                    int var75;
                                    if (var59 != 1) {
                                        var75 = var60 + -1;
                                    } else {
                                        var75 = var62;
                                    }
                                    int var76 = 13421772;
                                    if (var73 >= 5 && var73 <= 8 || var73 >= 13 && var73 <= 16 || var73 >= 21 && ~var73 >= -25 || var73 == 27 || ~var73 == -29) {
                                        var73 -= 4;
                                        var76 = 13369344;
                                    }
                                    if (var73 != 1) {
                                        if (var73 != 2) {
                                            if (var73 == 3) {
                                                class159.method1128(var74, var62, var59, var76);
                                            } else if (~var73 != -5) {
                                                if (var73 == 9) {
                                                    class159.method1128(var48, var62, var59, 16777215);
                                                    class159.method1146(var48, var62, var46, var76);
                                                } else if (var73 != 10) {
                                                    if (~var73 == -12) {
                                                        class159.method1128(var74, var62, var59, 16777215);
                                                        class159.method1146(var48, var75, var46, var76);
                                                    } else if (~var73 != -13) {
                                                        if (~var73 != -18) {
                                                            if (~var73 != -19) {
                                                                if (~var73 == -20) {
                                                                    class159.method1146(var74, var75, 1, var76);
                                                                } else if (var73 == 20) {
                                                                    class159.method1146(var48, var75, 1, var76);
                                                                } else if (~var73 == -26) {
                                                                    for (int var77 = 0; ~var77 > ~var59; ++var77) {
                                                                        class159.method1146(var48 + var77, var75 - var77, 1, var76);
                                                                    }
                                                                } else if (var73 == 26) {
                                                                    for (int var78 = 0; ~var59 < ~var78; ++var78) {
                                                                        class159.method1146(var48 + var78, var62 + var78, 1, var76);
                                                                    }
                                                                }
                                                            } else {
                                                                class159.method1146(var74, var62, 1, var76);
                                                            }
                                                        } else {
                                                            class159.method1146(var48, var62, 1, var76);
                                                        }
                                                    } else {
                                                        class159.method1128(var48, var62, var59, 16777215);
                                                        class159.method1146(var48, var75, var46, var76);
                                                    }
                                                } else {
                                                    class159.method1128(var74, var62, var59, 16777215);
                                                    class159.method1146(var48, var62, var46, var76);
                                                }
                                            } else {
                                                class159.method1146(var48, var75, var46, var76);
                                            }
                                        } else {
                                            class159.method1146(var48, var62, var46, var76);
                                        }
                                    } else {
                                        class159.method1128(var48, var62, var59, var76);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    var10000 = arg1 + var44;
                    int var80 = arg1 + var45;
                    for (int var81 = 0; var11 > var81; ++var81) {
                        int var82;
                        if (~class65.field1124.field1671 != 0) {
                            var82 = class65.field1124.field1671;
                        } else if ((arg8 + var13 & 4) != (4 & arg10 + var81)) {
                            var82 = 4936552;
                        } else {
                            var82 = class40.field637[class272.field4820 + 1];
                        }
                        if (~var82 == -1) {
                            var82 = 1;
                        }
                        int var83 = (arg5 * var81 + arg3 >> 16) - -arg6;
                        int var84 = (arg3 - -((var81 + 1) * arg5) >> 16) + arg6;
                        int var85 = -var83 + var84;
                        class159.method1130(var80, var83, var46, var85, var82);
                    }
                }
            }
        }
        for (int var14 = -2; ~(var12 + 2) < ~var14; ++var14) {
            int var15 = arg9 - -(arg7 * var14) >> 16;
            int var16 = (var14 + 1) * arg7 + arg9 >> 16;
            int var17 = -var15 + var16;
            if (var17 > 0) {
                int var18 = arg1 + var15;
                var10000 = arg1 + var16;
                int var20 = arg8 + var14 >> 6;
                if (~var20 <= -1 && var20 <= class60.field1081.length + -1) {
                    short[][] var21 = class60.field1081[var20];
                    for (int var22 = -2; var22 < var11 - -2; ++var22) {
                        int var23 = arg5 * var22 + arg3 >> 16;
                        int var24 = (var22 + 1) * arg5 + arg3 >> 16;
                        int var25 = -var23 + var24;
                        if (var25 > 0) {
                            int var26 = arg6 + var23;
                            var10000 = arg6 + var24;
                            int var28 = arg10 + var22 >> 6;
                            if (var28 >= 0 && var21.length + -1 >= var28) {
                                int var29 = ((arg10 + var22 & 63) << 6) + (arg8 + var14 & 63);
                                if (var21[var28] != null) {
                                    int var30 = var21[var28][var29] & 16383;
                                    int var31 = 3 & var21[var28][var29] >> 14;
                                    if (var30 != 0) {
                                        if (var31 != 0) {
                                            if (~var31 != -2) {
                                                if (~var31 != -3) {
                                                    if (var31 == 3) {
                                                        int var32 = class266.field4717[var30 + -1].field199 * var25 / 4;
                                                        int var33 = class266.field4717[var30 - 1].field206 * var17 / 4;
                                                        if (var33 != 0 && ~var32 != -1) {
                                                            int var34 = class266.field4717[var30 + -1].field202 * var25 / 4;
                                                            class266.field4717[var30 + -1].method211(var18, var26 - var34, var33, var32);
                                                        }
                                                    }
                                                } else {
                                                    int var35 = class183.field3376[var30 + -1].field206 * var17 / 4;
                                                    int var36 = class183.field3376[var30 + -1].field199 * var25 / 4;
                                                    if (var35 != 0 && ~var36 != -1) {
                                                        int var37 = class183.field3376[var30 - 1].field202 * var25 / 4;
                                                        class183.field3376[var30 - 1].method211(var18, -var37 + var26, var35, var36);
                                                    }
                                                }
                                            } else {
                                                int var38 = class122.field2213[var30 + -1].field206 * var17 / 4;
                                                int var39 = class122.field2213[var30 + -1].field199 * var25 / 4;
                                                if (~var38 != -1 && var39 != 0) {
                                                    int var40 = class122.field2213[var30 - 1].field202 * var25 / 4;
                                                    class122.field2213[var30 + -1].method211(var18, -var40 + var26, var38, var39);
                                                }
                                            }
                                        } else {
                                            int var41 = class193.field3570[var30 - 1].field206 * var17 / 4;
                                            int var42 = class193.field3570[var30 + -1].field199 * var25 / 4;
                                            if (~var41 != -1 && var42 != 0) {
                                                int var43 = class193.field3570[var30 + -1].field202 * var25 / 4;
                                                class193.field3570[var30 + -1].method211(var18, -var43 + var26, var41, var42);
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
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "()V")
    public class94() {
        this(0);
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(I)V")
    private class94(int arg0) {
        super(0, false);
        this.method611(arg0, false);
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IZ)V")
    private final void method611(int arg0, boolean arg1) {
        ++field1793;
        if (arg1) {
            method609((byte) 65);
        }
        this.field1788 = arg0 >> 12 & 4080;
        this.field1792 = (65280 & arg0) >> 4;
        this.field1785 = 4080 & arg0 << 4;
    }

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "(IB)[[I")
    public final int[][] method32(int arg0, byte arg1) {
        ++field1790;
        int[][] var3 = super.field4818.method1514(-2, arg0);
        if (super.field4818.field3954) {
            int[] var4 = var3[2];
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            for (int var7 = 0; ~var7 > ~class246.field4385; ++var7) {
                var5[var7] = this.field1788;
                var6[var7] = this.field1792;
                var4[var7] = this.field1785;
            }
        }
        int var8 = -16 / ((arg1 - -60) / 45);
        return var3;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Ljd;BI)V")
    public final void method34(class118 arg0, byte arg1, int arg2) {
        int var4 = -7 / ((arg1 - -21) / 55);
        ++field1786;
        if (arg2 == 0) {
            this.method611(arg0.method873((byte) -107), false);
        }
    }
}
