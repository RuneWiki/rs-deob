import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class138 extends class115 {

    @OriginalMember(owner = "client!g", name = "R", descriptor = "I")
    private int field2000 = 6;

    @OriginalMember(owner = "client!g", name = "O", descriptor = "Ljava/lang/String;")
    public static String field1997 = "yellow:";

    @OriginalMember(owner = "client!g", name = "Q", descriptor = "Lqd;")
    public static class37 field1999 = new class37(64);

    @OriginalMember(owner = "client!g", name = "J", descriptor = "I")
    public static int field1992;

    @OriginalMember(owner = "client!g", name = "K", descriptor = "I")
    public static int field1993;

    @OriginalMember(owner = "client!g", name = "L", descriptor = "I")
    public static int field1994;

    @OriginalMember(owner = "client!g", name = "N", descriptor = "I")
    public static int field1996;

    @OriginalMember(owner = "client!g", name = "P", descriptor = "I")
    public static int field1998;

    @OriginalMember(owner = "client!g", name = "S", descriptor = "I")
    public static int field2001;

    @OriginalMember(owner = "client!g", name = "T", descriptor = "I")
    public static int field2002;

    @OriginalMember(owner = "client!g", name = "V", descriptor = "I")
    public static int field2004;

    @OriginalMember(owner = "client!g", name = "U", descriptor = "Lve;")
    public static class233 field2003;

    @OriginalMember(owner = "client!g", name = "M", descriptor = "Lv;")
    public static class61 field1995;

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "()V")
    public class138() {
        super(2, false);
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(Z)I")
    public static final int method926(boolean arg0) {
        if (!arg0) {
            field1995 = null;
        }
        ++field1993;
        return class273.field4345;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(ZI)V")
    public static final void method927(boolean arg0, int arg1) {
        ++field2001;
        if (arg1 != 8) {
            method926(true);
        }
        byte[][] var2 = class263.field3961;
        byte var3 = 4;
        for (int var4 = 0; ~var4 > ~var3; ++var4) {
            class270.method1804(10288);
            for (int var5 = 0; var5 < 13; ++var5) {
                for (int var6 = 0; var6 < 13; ++var6) {
                    int var7 = class155.field2273[var4][var5][var6];
                    if (~var7 != 0) {
                        int var8 = (var7 & 65109122) >> 24;
                        if (!arg0 || var8 == 0) {
                            int var9 = 3 & var7 >> 1;
                            int var10 = var7 >> 3 & 2047;
                            int var11 = var7 >> 14 & 1023;
                            int var12 = (var11 / 8 << 8) + var10 / 8;
                            for (int var13 = 0; ~class23.field303.length < ~var13; ++var13) {
                                if (~class23.field303[var13] == ~var12 && var2[var13] != null) {
                                    class40.method273((byte) 109, var9, arg0, (7 & var11) * 8, var2[var13], var6 * 8, class246.field3681, var5 * 8, var4, (7 & var10) * 8, var8);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!g", name = "e", descriptor = "(I)V")
    public static void method928(int arg0) {
        field1997 = null;
        if (arg0 <= 53) {
            field1999 = null;
        }
        field1999 = null;
        field2003 = null;
        field1995 = null;
    }

    @OriginalMember(owner = "client!g", name = "e", descriptor = "(II)[I")
    public final int[] method116(int arg0, int arg1) {
        ++field1998;
        int[] var3 = super.field1705.method463(arg1, false);
        if (arg0 != 242152972) {
            field1997 = null;
        }
        if (super.field1705.field1072) {
            int[] var4 = this.method797(0, arg1, -80);
            int[] var5 = this.method797(1, arg1, -85);
            int var6 = this.field2000;
            if (~var6 != -2) {
                if (var6 != 2) {
                    if (var6 != 3) {
                        if (~var6 != -5) {
                            if (var6 != 5) {
                                if (var6 != 6) {
                                    if (var6 != 7) {
                                        if (~var6 != -9) {
                                            if (~var6 != -10) {
                                                if (~var6 != -11) {
                                                    if (~var6 != -12) {
                                                        if (~var6 == -13) {
                                                            for (int var7 = 0; var7 < class77.field1178; ++var7) {
                                                                int var8 = var5[var7];
                                                                int var9 = var4[var7];
                                                                var3[var7] = var8 + var9 + -(var8 * var9 >> 11);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var10 = 0; class77.field1178 > var10; ++var10) {
                                                            int var11 = var4[var10];
                                                            int var12 = var5[var10];
                                                            var3[var10] = var11 <= var12 ? var12 - var11 : var11 - var12;
                                                        }
                                                    }
                                                } else {
                                                    for (int var13 = 0; ~class77.field1178 < ~var13; ++var13) {
                                                        int var14 = var5[var13];
                                                        int var15 = var4[var13];
                                                        var3[var13] = ~var14 > ~var15 ? var15 : var14;
                                                    }
                                                }
                                            } else {
                                                for (int var16 = 0; var16 < class77.field1178; ++var16) {
                                                    int var17 = var4[var16];
                                                    int var18 = var5[var16];
                                                    var3[var16] = var17 >= var18 ? var18 : var17;
                                                }
                                            }
                                        } else {
                                            for (int var19 = 0; class77.field1178 > var19; ++var19) {
                                                int var20 = var4[var19];
                                                var3[var19] = var20 == 0 ? 0 : -((-var5[var19] + 4096 << 12) / var20) + 4096;
                                            }
                                        }
                                    } else {
                                        for (int var21 = 0; ~class77.field1178 < ~var21; ++var21) {
                                            int var22 = var4[var21];
                                            var3[var21] = var22 == 4096 ? 4096 : (var5[var21] << 12) / (-var22 + 4096);
                                        }
                                    }
                                } else {
                                    for (int var23 = 0; ~var23 > ~class77.field1178; ++var23) {
                                        int var24 = var5[var23];
                                        var3[var23] = ~var24 > -2049 ? var4[var23] * var24 >> 11 : -((4096 - var24) * (-var4[var23] + 4096) >> 11) + 4096;
                                    }
                                }
                            } else {
                                for (int var25 = 0; class77.field1178 > var25; ++var25) {
                                    var3[var25] = -((4096 - var4[var25]) * (-var5[var25] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var26 = 0; class77.field1178 > var26; ++var26) {
                                int var27 = var5[var26];
                                var3[var26] = ~var27 == -1 ? 4096 : (var4[var26] << 12) / var27;
                            }
                        }
                    } else {
                        for (int var28 = 0; ~class77.field1178 < ~var28; ++var28) {
                            var3[var28] = var4[var28] * var5[var28] >> 12;
                        }
                    }
                } else {
                    for (int var29 = 0; var29 < class77.field1178; ++var29) {
                        var3[var29] = var4[var29] + -var5[var29];
                    }
                }
            } else {
                for (int var30 = 0; var30 < class77.field1178; ++var30) {
                    var3[var30] = var4[var30] - -var5[var30];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!g", name = "c", descriptor = "(II)[[I")
    public final int[][] method235(int arg0, int arg1) {
        ++field1992;
        if (arg0 > -33) {
            return null;
        } else {
            int[][] var3 = super.field1716.method6(arg1, (byte) -86);
            if (super.field1716.field23) {
                int[][] var4 = this.method798(0, 0, arg1);
                int[][] var5 = this.method798(0, 1, arg1);
                int[] var6 = var3[2];
                int[] var7 = var4[0];
                int[] var8 = var4[1];
                int[] var9 = var3[1];
                int[] var10 = var5[0];
                int[] var11 = var3[0];
                int[] var12 = var4[2];
                int[] var13 = var5[1];
                int[] var14 = var5[2];
                int var15 = this.field2000;
                if (~var15 != -2) {
                    if (~var15 != -3) {
                        if (~var15 != -4) {
                            if (~var15 != -5) {
                                if (var15 != 5) {
                                    if (var15 != 6) {
                                        if (~var15 != -8) {
                                            if (var15 != 8) {
                                                if (var15 != 9) {
                                                    if (var15 != 10) {
                                                        if (var15 != 11) {
                                                            if (var15 == 12) {
                                                                for (int var16 = 0; var16 < class77.field1178; ++var16) {
                                                                    int var17 = var7[var16];
                                                                    int var18 = var12[var16];
                                                                    int var19 = var8[var16];
                                                                    int var20 = var14[var16];
                                                                    int var21 = var10[var16];
                                                                    int var22 = var13[var16];
                                                                    var11[var16] = var17 + var21 + -(var17 * var21 >> 11);
                                                                    var9[var16] = -(var19 * var22 >> 11) + var22 + var19;
                                                                    var6[var16] = var18 - -var20 + -(var18 * var20 >> 11);
                                                                }
                                                            }
                                                        } else {
                                                            for (int var23 = 0; ~var23 > ~class77.field1178; ++var23) {
                                                                int var24 = var14[var23];
                                                                int var25 = var10[var23];
                                                                int var26 = var13[var23];
                                                                int var27 = var8[var23];
                                                                int var28 = var7[var23];
                                                                int var29 = var12[var23];
                                                                var11[var23] = var28 > var25 ? -var25 + var28 : -var28 + var25;
                                                                var9[var23] = var27 <= var26 ? -var27 + var26 : -var26 + var27;
                                                                var6[var23] = ~var29 < ~var24 ? var29 - var24 : -var29 + var24;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var30 = 0; var30 < class77.field1178; ++var30) {
                                                            int var31 = var7[var30];
                                                            int var32 = var14[var30];
                                                            int var33 = var12[var30];
                                                            int var34 = var10[var30];
                                                            int var35 = var13[var30];
                                                            int var36 = var8[var30];
                                                            var11[var30] = var34 < var31 ? var31 : var34;
                                                            var9[var30] = var36 > var35 ? var36 : var35;
                                                            var6[var30] = var32 >= var33 ? var32 : var33;
                                                        }
                                                    }
                                                } else {
                                                    for (int var37 = 0; ~var37 > ~class77.field1178; ++var37) {
                                                        int var38 = var10[var37];
                                                        int var39 = var7[var37];
                                                        int var40 = var8[var37];
                                                        int var41 = var12[var37];
                                                        int var42 = var14[var37];
                                                        int var43 = var13[var37];
                                                        var11[var37] = ~var38 >= ~var39 ? var38 : var39;
                                                        var9[var37] = ~var40 <= ~var43 ? var43 : var40;
                                                        var6[var37] = var42 > var41 ? var41 : var42;
                                                    }
                                                }
                                            } else {
                                                for (int var44 = 0; var44 < class77.field1178; ++var44) {
                                                    int var45 = var7[var44];
                                                    int var46 = var8[var44];
                                                    int var47 = var12[var44];
                                                    var11[var44] = ~var45 == -1 ? 0 : -((-var10[var44] + 4096 << 12) / var45) + 4096;
                                                    var9[var44] = ~var46 != -1 ? 4096 - (4096 - var13[var44] << 12) / var46 : 0;
                                                    var6[var44] = var47 == 0 ? 0 : -((-var14[var44] + 4096 << 12) / var47) + 4096;
                                                }
                                            }
                                        } else {
                                            for (int var48 = 0; class77.field1178 > var48; ++var48) {
                                                int var49 = var8[var48];
                                                int var50 = var12[var48];
                                                int var51 = var7[var48];
                                                var11[var48] = var51 != 4096 ? (var10[var48] << 12) / (-var51 + 4096) : 4096;
                                                var9[var48] = var49 != 4096 ? (var13[var48] << 12) / (-var49 + 4096) : 4096;
                                                var6[var48] = ~var50 != -4097 ? (var14[var48] << 12) / (-var50 + 4096) : 4096;
                                            }
                                        }
                                    } else {
                                        for (int var52 = 0; var52 < class77.field1178; ++var52) {
                                            int var53 = var13[var52];
                                            int var54 = var10[var52];
                                            int var55 = var14[var52];
                                            var11[var52] = var54 >= 2048 ? -((4096 - var54) * (-var7[var52] + 4096) >> 11) + 4096 : var7[var52] * var54 >> 11;
                                            var9[var52] = var53 >= 2048 ? 4096 - ((4096 - var53) * (-var8[var52] + 4096) >> 11) : var8[var52] * var53 >> 11;
                                            var6[var52] = var55 >= 2048 ? -((-var12[var52] + 4096) * (-var55 + 4096) >> 11) + 4096 : var12[var52] * var55 >> 11;
                                        }
                                    }
                                } else {
                                    for (int var56 = 0; class77.field1178 > var56; ++var56) {
                                        var11[var56] = -((4096 - var7[var56]) * (-var10[var56] + 4096) >> 12) + 4096;
                                        var9[var56] = -((4096 - var8[var56]) * (4096 - var13[var56]) >> 12) + 4096;
                                        var6[var56] = 4096 - ((4096 - var14[var56]) * (-var12[var56] + 4096) >> 12);
                                    }
                                }
                            } else {
                                for (int var57 = 0; var57 < class77.field1178; ++var57) {
                                    int var58 = var14[var57];
                                    int var59 = var13[var57];
                                    int var60 = var10[var57];
                                    var11[var57] = var60 == 0 ? 4096 : (var7[var57] << 12) / var60;
                                    var9[var57] = ~var59 != -1 ? (var8[var57] << 12) / var59 : 4096;
                                    var6[var57] = var58 == 0 ? 4096 : (var12[var57] << 12) / var58;
                                }
                            }
                        } else {
                            for (int var61 = 0; var61 < class77.field1178; ++var61) {
                                var11[var61] = var7[var61] * var10[var61] >> 12;
                                var9[var61] = var8[var61] * var13[var61] >> 12;
                                var6[var61] = var12[var61] * var14[var61] >> 12;
                            }
                        }
                    } else {
                        for (int var62 = 0; class77.field1178 > var62; ++var62) {
                            var11[var62] = var7[var62] + -var10[var62];
                            var9[var62] = var8[var62] + -var13[var62];
                            var6[var62] = var12[var62] + -var14[var62];
                        }
                    }
                } else {
                    for (int var63 = 0; var63 < class77.field1178; ++var63) {
                        var11[var63] = var7[var63] - -var10[var63];
                        var9[var63] = var8[var63] + var13[var63];
                        var6[var63] = var12[var63] - -var14[var63];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(ILkl;I)V")
    public final void method168(int arg0, class114 arg1, int arg2) {
        ++field1996;
        if (~arg2 != -1) {
            if (~arg2 == -2) {
                super.field1713 = arg1.method760(false) == 1;
            }
        } else {
            this.field2000 = arg1.method760(false);
        }
        if (arg0 != -1) {
            field2002 = 122;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIIII)V")
    public static final void method929(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class142.field2056[0].method812(arg1, arg3);
        ++field1994;
        class142.field2056[1].method812(arg1, arg2 + arg3 + -16);
        int var6 = (arg2 + -32) * arg2 / arg5;
        if (arg0 <= 105) {
            method929(28, 57, 50, 90, -128, -3);
        }
        if (var6 < 8) {
            var6 = 8;
        }
        int var7 = (arg2 - 32 + -var6) * arg4 / (-arg2 + arg5);
        class144.method955(arg1, arg3 + 16, 16, arg2 + -32, class90.field1377);
        class144.method955(arg1, arg3 - -16 + var7, 16, var6, class47.field658);
        class144.method948(arg1, arg3 - -16 + var7, var6, class58.field892);
        class144.method948(arg1 + 1, 16 - -var7 + arg3, var6, class58.field892);
        class144.method968(arg1, arg3 + var7 + 16, 16, class58.field892);
        class144.method968(arg1, var7 + 17 + arg3, 16, class58.field892);
        class144.method948(arg1 + 15, arg3 - (-16 - var7), var6, class235.field3551);
        class144.method948(arg1 + 14, arg3 - -17 + var7, var6 + -1, class235.field3551);
        class144.method968(arg1, arg3 - -var7 + var6 + 15, 16, class235.field3551);
        class144.method968(arg1 + 1, arg3 + var6 - -14 - -var7, 15, class235.field3551);
    }
}
