import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class237 extends class260 {

    @OriginalMember(owner = "client!o", name = "N", descriptor = "I")
    private int field4134 = 6;

    @OriginalMember(owner = "client!o", name = "L", descriptor = "Loh;")
    public static class263 field4132 = class253.method1681(-128, " weitere Optionen");

    @OriginalMember(owner = "client!o", name = "P", descriptor = "[I")
    public static int[] field4136 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!o", name = "R", descriptor = "Loh;")
    public static class263 field4138 = class253.method1681(-122, "M");

    @OriginalMember(owner = "client!o", name = "T", descriptor = "J")
    public static long field4140 = 0L;

    @OriginalMember(owner = "client!o", name = "M", descriptor = "I")
    public static int field4133;

    @OriginalMember(owner = "client!o", name = "O", descriptor = "I")
    public static int field4135;

    @OriginalMember(owner = "client!o", name = "Q", descriptor = "I")
    public static int field4137;

    @OriginalMember(owner = "client!o", name = "S", descriptor = "I")
    public static int field4139;

    @OriginalMember(owner = "client!o", name = "U", descriptor = "I")
    public static int field4141;

    @OriginalMember(owner = "client!o", name = "V", descriptor = "I")
    public static int field4142;

    @OriginalMember(owner = "client!o", name = "d", descriptor = "(B)V")
    public static void method1584(byte arg0) {
        if (arg0 <= -57) {
            field4132 = null;
            field4138 = null;
            field4136 = null;
        }
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(II)[I")
    public final int[] method17(int arg0, int arg1) {
        if (arg1 != 255) {
            field4136 = null;
        }
        ++field4139;
        int[] var3 = super.field4511.method304(arg0, false);
        if (super.field4511.field1029) {
            int[] var4 = this.method1711(arg0, 0, false);
            int[] var5 = this.method1711(arg0, 1, false);
            int var6 = this.field4134;
            if (~var6 != -2) {
                if (var6 != 2) {
                    if (~var6 != -4) {
                        if (~var6 != -5) {
                            if (~var6 != -6) {
                                if (~var6 != -7) {
                                    if (var6 != 7) {
                                        if (var6 != 8) {
                                            if (~var6 != -10) {
                                                if (~var6 != -11) {
                                                    if (~var6 != -12) {
                                                        if (var6 == 12) {
                                                            for (int var7 = 0; class49.field1052 > var7; ++var7) {
                                                                int var8 = var5[var7];
                                                                int var9 = var4[var7];
                                                                var3[var7] = var8 + var9 + -(var8 * var9 >> 11);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var10 = 0; ~var10 > ~class49.field1052; ++var10) {
                                                            int var11 = var5[var10];
                                                            int var12 = var4[var10];
                                                            var3[var10] = ~var11 <= ~var12 ? -var12 + var11 : -var11 + var12;
                                                        }
                                                    }
                                                } else {
                                                    for (int var13 = 0; ~var13 > ~class49.field1052; ++var13) {
                                                        int var14 = var4[var13];
                                                        int var15 = var5[var13];
                                                        var3[var13] = ~var14 < ~var15 ? var14 : var15;
                                                    }
                                                }
                                            } else {
                                                for (int var16 = 0; class49.field1052 > var16; ++var16) {
                                                    int var17 = var5[var16];
                                                    int var18 = var4[var16];
                                                    var3[var16] = ~var18 > ~var17 ? var18 : var17;
                                                }
                                            }
                                        } else {
                                            for (int var19 = 0; var19 < class49.field1052; ++var19) {
                                                int var20 = var4[var19];
                                                var3[var19] = ~var20 == -1 ? 0 : -((4096 - var5[var19] << 12) / var20) + 4096;
                                            }
                                        }
                                    } else {
                                        for (int var21 = 0; class49.field1052 > var21; ++var21) {
                                            int var22 = var4[var21];
                                            var3[var21] = var22 != 4096 ? (var5[var21] << 12) / (4096 - var22) : 4096;
                                        }
                                    }
                                } else {
                                    for (int var23 = 0; ~class49.field1052 < ~var23; ++var23) {
                                        int var24 = var5[var23];
                                        var3[var23] = var24 < 2048 ? var4[var23] * var24 >> 11 : 4096 - ((-var4[var23] + 4096) * (-var24 + 4096) >> 11);
                                    }
                                }
                            } else {
                                for (int var25 = 0; var25 < class49.field1052; ++var25) {
                                    var3[var25] = -((4096 - var5[var25]) * (-var4[var25] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var26 = 0; ~var26 > ~class49.field1052; ++var26) {
                                int var27 = var5[var26];
                                var3[var26] = var27 != 0 ? (var4[var26] << 12) / var27 : 4096;
                            }
                        }
                    } else {
                        for (int var28 = 0; var28 < class49.field1052; ++var28) {
                            var3[var28] = var4[var28] * var5[var28] >> 12;
                        }
                    }
                } else {
                    for (int var29 = 0; ~var29 > ~class49.field1052; ++var29) {
                        var3[var29] = var4[var29] - var5[var29];
                    }
                }
            } else {
                for (int var30 = 0; var30 < class49.field1052; ++var30) {
                    var3[var30] = var4[var30] + var5[var30];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Lpc;Z)Loh;")
    public static final class263 method1585(class21 arg0, boolean arg1) {
        ++field4137;
        if (class238.method1592(-479449948, client.method1005(arg0)) == 0) {
            return null;
        } else if (arg0.field548 != null && arg0.field548.method1786((byte) -95).method1740(-126) != 0) {
            return arg1 ? null : arg0.field548;
        } else {
            return class121.field2246 ? class238.field4160 : null;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(ZILue;III)V")
    public static final void method1586(boolean arg0, int arg1, class86 arg2, int arg3, int arg4, int arg5) {
        class119.field2219 = arg1;
        class81.field1611 = arg0;
        class139.field2561 = arg3;
        class71.field1431 = arg2;
        class177.field3242 = 1;
        ++field4141;
        int var6 = 61 % ((-15 - arg5) / 49);
        class84.field1667 = arg4;
        class181.field3294 = 10000;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IZLpc;)Loh;")
    public static final class263 method1587(int arg0, boolean arg1, class21 arg2) {
        ++field4142;
        if (!class106.method713(client.method1005(arg2), arg0, -11267) && arg2.field492 == null) {
            return null;
        } else if (arg1) {
            return null;
        } else if (arg2.field485 != null && ~arg2.field485.length < ~arg0 && arg2.field485[arg0] != null && arg2.field485[arg0].method1786((byte) -31).method1740(-128) != 0) {
            return arg2.field485[arg0];
        } else {
            return class121.field2246 ? class124.method797(-48, new class263[] { class260.field4499, class136.method891(-83, arg0) }) : null;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IILsi;)V")
    public final void method86(int arg0, int arg1, class194 arg2) {
        ++field4133;
        if (arg0 != 0) {
            if (~arg0 == -2) {
                super.field4505 = ~arg2.method1301(-8317) == -2;
            }
        } else {
            this.field4134 = arg2.method1301(-8317);
        }
        if (arg1 != 5701) {
            this.field4134 = 26;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(II)[[I")
    public final int[][] method174(int arg0, int arg1) {
        if (arg1 != 5) {
            return null;
        } else {
            ++field4135;
            int[][] var3 = super.field4509.method1667(arg0, 0);
            if (super.field4509.field4346) {
                int[][] var4 = this.method1712((byte) -29, 0, arg0);
                int[][] var5 = this.method1712((byte) -56, 1, arg0);
                int[] var6 = var3[0];
                int[] var7 = var3[2];
                int[] var8 = var3[1];
                int[] var9 = var4[1];
                int[] var10 = var5[0];
                int[] var11 = var4[2];
                int[] var12 = var5[1];
                int[] var13 = var5[2];
                int[] var14 = var4[0];
                int var15 = this.field4134;
                if (~var15 != -2) {
                    if (~var15 != -3) {
                        if (var15 != 3) {
                            if (~var15 != -5) {
                                if (var15 != 5) {
                                    if (var15 != 6) {
                                        if (~var15 != -8) {
                                            if (~var15 != -9) {
                                                if (~var15 != -10) {
                                                    if (~var15 != -11) {
                                                        if (~var15 != -12) {
                                                            if (var15 == 12) {
                                                                for (int var16 = 0; var16 < class49.field1052; ++var16) {
                                                                    int var17 = var10[var16];
                                                                    int var18 = var12[var16];
                                                                    int var19 = var9[var16];
                                                                    int var20 = var11[var16];
                                                                    int var21 = var14[var16];
                                                                    int var22 = var13[var16];
                                                                    var6[var16] = -(var17 * var21 >> 11) + var21 + var17;
                                                                    var8[var16] = var19 - -var18 - (var18 * var19 >> 11);
                                                                    var7[var16] = var20 + var22 + -(var20 * var22 >> 11);
                                                                }
                                                            }
                                                        } else {
                                                            for (int var23 = 0; ~var23 > ~class49.field1052; ++var23) {
                                                                int var24 = var13[var23];
                                                                int var25 = var14[var23];
                                                                int var26 = var10[var23];
                                                                int var27 = var12[var23];
                                                                int var28 = var11[var23];
                                                                int var29 = var9[var23];
                                                                var6[var23] = ~var25 >= ~var26 ? -var25 + var26 : var25 - var26;
                                                                var8[var23] = var29 > var27 ? -var27 + var29 : -var29 + var27;
                                                                var7[var23] = ~var28 >= ~var24 ? -var28 + var24 : var28 - var24;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var30 = 0; ~var30 > ~class49.field1052; ++var30) {
                                                            int var31 = var10[var30];
                                                            int var32 = var12[var30];
                                                            int var33 = var13[var30];
                                                            int var34 = var14[var30];
                                                            int var35 = var9[var30];
                                                            int var36 = var11[var30];
                                                            var6[var30] = ~var34 < ~var31 ? var34 : var31;
                                                            var8[var30] = var32 < var35 ? var35 : var32;
                                                            var7[var30] = var33 < var36 ? var36 : var33;
                                                        }
                                                    }
                                                } else {
                                                    for (int var37 = 0; ~var37 > ~class49.field1052; ++var37) {
                                                        int var38 = var13[var37];
                                                        int var39 = var9[var37];
                                                        int var40 = var11[var37];
                                                        int var41 = var10[var37];
                                                        int var42 = var12[var37];
                                                        int var43 = var14[var37];
                                                        var6[var37] = var43 < var41 ? var43 : var41;
                                                        var8[var37] = var39 < var42 ? var39 : var42;
                                                        var7[var37] = var38 <= var40 ? var38 : var40;
                                                    }
                                                }
                                            } else {
                                                for (int var44 = 0; class49.field1052 > var44; ++var44) {
                                                    int var45 = var11[var44];
                                                    int var46 = var14[var44];
                                                    int var47 = var9[var44];
                                                    var6[var44] = var46 == 0 ? 0 : -((-var10[var44] + 4096 << 12) / var46) + 4096;
                                                    var8[var44] = ~var47 != -1 ? -((-var12[var44] + 4096 << 12) / var47) + 4096 : 0;
                                                    var7[var44] = ~var45 != -1 ? -((4096 - var13[var44] << 12) / var45) + 4096 : 0;
                                                }
                                            }
                                        } else {
                                            for (int var48 = 0; ~var48 > ~class49.field1052; ++var48) {
                                                int var49 = var9[var48];
                                                int var50 = var11[var48];
                                                int var51 = var14[var48];
                                                var6[var48] = var51 == 4096 ? 4096 : (var10[var48] << 12) / (4096 - var51);
                                                var8[var48] = ~var49 != -4097 ? (var12[var48] << 12) / (-var49 + 4096) : 4096;
                                                var7[var48] = var50 == 4096 ? 4096 : (var13[var48] << 12) / (-var50 + 4096);
                                            }
                                        }
                                    } else {
                                        for (int var52 = 0; ~class49.field1052 < ~var52; ++var52) {
                                            int var53 = var13[var52];
                                            int var54 = var10[var52];
                                            int var55 = var12[var52];
                                            var6[var52] = var54 < 2048 ? var14[var52] * var54 >> 11 : -((-var14[var52] + 4096) * (-var54 + 4096) >> 11) + 4096;
                                            var8[var52] = ~var55 <= -2049 ? -((4096 - var9[var52]) * (-var55 + 4096) >> 11) + 4096 : var9[var52] * var55 >> 11;
                                            var7[var52] = ~var53 > -2049 ? var11[var52] * var53 >> 11 : 4096 - ((-var11[var52] + 4096) * (-var53 + 4096) >> 11);
                                        }
                                    }
                                } else {
                                    for (int var56 = 0; var56 < class49.field1052; ++var56) {
                                        var6[var56] = -((4096 - var14[var56]) * (-var10[var56] + 4096) >> 12) + 4096;
                                        var8[var56] = -((-var9[var56] + 4096) * (-var12[var56] + 4096) >> 12) + 4096;
                                        var7[var56] = -((-var11[var56] + 4096) * (-var13[var56] + 4096) >> 12) + 4096;
                                    }
                                }
                            } else {
                                for (int var57 = 0; class49.field1052 > var57; ++var57) {
                                    int var58 = var12[var57];
                                    int var59 = var13[var57];
                                    int var60 = var10[var57];
                                    var6[var57] = ~var60 == -1 ? 4096 : (var14[var57] << 12) / var60;
                                    var8[var57] = var58 == 0 ? 4096 : (var9[var57] << 12) / var58;
                                    var7[var57] = var59 != 0 ? (var11[var57] << 12) / var59 : 4096;
                                }
                            }
                        } else {
                            for (int var61 = 0; ~class49.field1052 < ~var61; ++var61) {
                                var6[var61] = var10[var61] * var14[var61] >> 12;
                                var8[var61] = var9[var61] * var12[var61] >> 12;
                                var7[var61] = var11[var61] * var13[var61] >> 12;
                            }
                        }
                    } else {
                        for (int var62 = 0; var62 < class49.field1052; ++var62) {
                            var6[var62] = var14[var62] - var10[var62];
                            var8[var62] = var9[var62] + -var12[var62];
                            var7[var62] = var11[var62] - var13[var62];
                        }
                    }
                } else {
                    for (int var63 = 0; class49.field1052 > var63; ++var63) {
                        var6[var63] = var10[var63] + var14[var63];
                        var8[var63] = var9[var63] + var12[var63];
                        var7[var63] = var11[var63] + var13[var63];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "()V")
    public class237() {
        super(2, false);
    }
}
