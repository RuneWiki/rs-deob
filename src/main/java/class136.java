import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class136 extends class117 {

    @OriginalMember(owner = "client!mb", name = "K", descriptor = "I")
    private int field2147 = 6;

    @OriginalMember(owner = "client!mb", name = "O", descriptor = "I")
    public static int field2151 = 0;

    @OriginalMember(owner = "client!mb", name = "I", descriptor = "Lqd;")
    public static class173 field2145 = new class173(64);

    @OriginalMember(owner = "client!mb", name = "U", descriptor = "Ljava/lang/String;")
    public static String field2157 = "Take";

    @OriginalMember(owner = "client!mb", name = "V", descriptor = "I")
    public static int field2158 = 0;

    @OriginalMember(owner = "client!mb", name = "J", descriptor = "I")
    public static int field2146;

    @OriginalMember(owner = "client!mb", name = "M", descriptor = "I")
    public static int field2149;

    @OriginalMember(owner = "client!mb", name = "N", descriptor = "I")
    public static int field2150;

    @OriginalMember(owner = "client!mb", name = "P", descriptor = "I")
    public static int field2152;

    @OriginalMember(owner = "client!mb", name = "Q", descriptor = "I")
    public static int field2153;

    @OriginalMember(owner = "client!mb", name = "R", descriptor = "I")
    public static int field2154;

    @OriginalMember(owner = "client!mb", name = "T", descriptor = "Ldk;")
    public static class251 field2156;

    @OriginalMember(owner = "client!mb", name = "S", descriptor = "[Lim;")
    public static class179[] field2155;

    @OriginalMember(owner = "client!mb", name = "L", descriptor = "[S")
    public static short[] field2148;

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "(B)V")
    public static void method952(byte arg0) {
        field2145 = null;
        field2157 = null;
        field2156 = null;
        field2155 = null;
        int var1 = 44 / ((arg0 - -34) / 39);
        field2148 = null;
    }

    @OriginalMember(owner = "client!mb", name = "j", descriptor = "(I)I")
    public static final int method953(int arg0) {
        ++field2150;
        if ((double) class275.field4409 == 3.0D) {
            return 37;
        } else if ((double) class275.field4409 == 4.0D) {
            return 50;
        } else if ((double) class275.field4409 == 6.0D) {
            return 75;
        } else if ((double) class275.field4409 == 8.0D) {
            return 100;
        } else {
            if (arg0 != 10) {
                method955(-120, 29, 94, 39, -84, 1, true, 62, -31);
            }
            return 200;
        }
    }

    @OriginalMember(owner = "client!mb", name = "k", descriptor = "(I)V")
    public static final void method954(int arg0) {
        ++field2154;
        class81.field1329.method1257(-106);
        class71.field1202.method1257(94);
        class90.field1464.method1257(85);
        if (arg0 != 490368332) {
            method952((byte) -38);
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIIIIIZII)V")
    public static final void method955(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8) {
        ++field2146;
        if (arg6) {
            if (class67.method473(arg1, (byte) 56)) {
                class227.method1541(arg7, arg8, class34.field519[arg1], arg3, 29, -1, arg0, arg4, arg5, arg2);
            } else if (~arg3 != 0) {
                class73.field1227[arg3] = true;
            } else {
                for (int var9 = 0; ~var9 > -101; ++var9) {
                    class73.field1227[var9] = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "()V")
    public class136() {
        super(2, false);
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(II)[[I")
    public final int[][] method47(int arg0, int arg1) {
        int var3 = -19 / ((arg1 - 37) / 38);
        ++field2153;
        int[][] var4 = super.field1886.method419(arg0, (byte) -99);
        if (super.field1886.field1022) {
            int[][] var5 = this.method838(0, 0, arg0);
            int[][] var6 = this.method838(1, 0, arg0);
            int[] var7 = var4[0];
            int[] var8 = var4[1];
            int[] var9 = var5[0];
            int[] var10 = var4[2];
            int[] var11 = var5[2];
            int[] var12 = var6[0];
            int[] var13 = var6[2];
            int[] var14 = var5[1];
            int[] var15 = var6[1];
            int var16 = this.field2147;
            if (var16 != 1) {
                if (var16 != 2) {
                    if (var16 != 3) {
                        if (~var16 != -5) {
                            if (~var16 != -6) {
                                if (var16 != 6) {
                                    if (var16 != 7) {
                                        if (var16 != 8) {
                                            if (var16 != 9) {
                                                if (var16 != 10) {
                                                    if (~var16 != -12) {
                                                        if (~var16 == -13) {
                                                            for (int var17 = 0; ~var17 > ~class168.field2737; ++var17) {
                                                                int var18 = var15[var17];
                                                                int var19 = var9[var17];
                                                                int var20 = var11[var17];
                                                                int var21 = var13[var17];
                                                                int var22 = var14[var17];
                                                                int var23 = var12[var17];
                                                                var7[var17] = -(var19 * var23 >> 11) + var23 + var19;
                                                                var8[var17] = var22 - -var18 + -(var18 * var22 >> 11);
                                                                var10[var17] = -(var20 * var21 >> 11) + var21 + var20;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var24 = 0; ~var24 > ~class168.field2737; ++var24) {
                                                            int var25 = var15[var24];
                                                            int var26 = var11[var24];
                                                            int var27 = var13[var24];
                                                            int var28 = var12[var24];
                                                            int var29 = var9[var24];
                                                            int var30 = var14[var24];
                                                            var7[var24] = var29 > var28 ? -var28 + var29 : -var29 + var28;
                                                            var8[var24] = var25 < var30 ? var30 - var25 : -var30 + var25;
                                                            var10[var24] = ~var26 < ~var27 ? -var27 + var26 : -var26 + var27;
                                                        }
                                                    }
                                                } else {
                                                    for (int var31 = 0; ~var31 > ~class168.field2737; ++var31) {
                                                        int var32 = var11[var31];
                                                        int var33 = var14[var31];
                                                        int var34 = var15[var31];
                                                        int var35 = var12[var31];
                                                        int var36 = var13[var31];
                                                        int var37 = var9[var31];
                                                        var7[var31] = ~var35 <= ~var37 ? var35 : var37;
                                                        var8[var31] = ~var34 > ~var33 ? var33 : var34;
                                                        var10[var31] = ~var36 > ~var32 ? var32 : var36;
                                                    }
                                                }
                                            } else {
                                                for (int var38 = 0; ~class168.field2737 < ~var38; ++var38) {
                                                    int var39 = var9[var38];
                                                    int var40 = var11[var38];
                                                    int var41 = var12[var38];
                                                    int var42 = var13[var38];
                                                    int var43 = var14[var38];
                                                    int var44 = var15[var38];
                                                    var7[var38] = ~var41 >= ~var39 ? var41 : var39;
                                                    var8[var38] = var43 < var44 ? var43 : var44;
                                                    var10[var38] = ~var40 <= ~var42 ? var42 : var40;
                                                }
                                            }
                                        } else {
                                            for (int var45 = 0; ~var45 > ~class168.field2737; ++var45) {
                                                int var46 = var14[var45];
                                                int var47 = var9[var45];
                                                int var48 = var11[var45];
                                                var7[var45] = ~var47 == -1 ? 0 : -((4096 - var12[var45] << 12) / var47) + 4096;
                                                var8[var45] = var46 == 0 ? 0 : -((4096 - var15[var45] << 12) / var46) + 4096;
                                                var10[var45] = var48 == 0 ? 0 : -((-var13[var45] + 4096 << 12) / var48) + 4096;
                                            }
                                        }
                                    } else {
                                        for (int var49 = 0; class168.field2737 > var49; ++var49) {
                                            int var50 = var14[var49];
                                            int var51 = var11[var49];
                                            int var52 = var9[var49];
                                            var7[var49] = var52 != 4096 ? (var12[var49] << 12) / (-var52 + 4096) : 4096;
                                            var8[var49] = ~var50 == -4097 ? 4096 : (var15[var49] << 12) / (-var50 + 4096);
                                            var10[var49] = ~var51 == -4097 ? 4096 : (var13[var49] << 12) / (-var51 + 4096);
                                        }
                                    }
                                } else {
                                    for (int var53 = 0; ~var53 > ~class168.field2737; ++var53) {
                                        int var54 = var13[var53];
                                        int var55 = var12[var53];
                                        int var56 = var15[var53];
                                        var7[var53] = ~var55 > -2049 ? var9[var53] * var55 >> 11 : -((4096 - var9[var53]) * (4096 - var55) >> 11) + 4096;
                                        var8[var53] = ~var56 <= -2049 ? 4096 - ((-var14[var53] + 4096) * (-var56 + 4096) >> 11) : var14[var53] * var56 >> 11;
                                        var10[var53] = ~var54 <= -2049 ? -((-var11[var53] + 4096) * (-var54 + 4096) >> 11) + 4096 : var11[var53] * var54 >> 11;
                                    }
                                }
                            } else {
                                for (int var57 = 0; var57 < class168.field2737; ++var57) {
                                    var7[var57] = -((-var9[var57] + 4096) * (-var12[var57] + 4096) >> 12) + 4096;
                                    var8[var57] = -((-var14[var57] + 4096) * (-var15[var57] + 4096) >> 12) + 4096;
                                    var10[var57] = -((4096 - var11[var57]) * (-var13[var57] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var58 = 0; var58 < class168.field2737; ++var58) {
                                int var59 = var13[var58];
                                int var60 = var15[var58];
                                int var61 = var12[var58];
                                var7[var58] = var61 != 0 ? (var9[var58] << 12) / var61 : 4096;
                                var8[var58] = ~var60 == -1 ? 4096 : (var14[var58] << 12) / var60;
                                var10[var58] = ~var59 != -1 ? (var11[var58] << 12) / var59 : 4096;
                            }
                        }
                    } else {
                        for (int var62 = 0; ~var62 > ~class168.field2737; ++var62) {
                            var7[var62] = var9[var62] * var12[var62] >> 12;
                            var8[var62] = var14[var62] * var15[var62] >> 12;
                            var10[var62] = var11[var62] * var13[var62] >> 12;
                        }
                    }
                } else {
                    for (int var63 = 0; var63 < class168.field2737; ++var63) {
                        var7[var63] = var9[var63] + -var12[var63];
                        var8[var63] = var14[var63] + -var15[var63];
                        var10[var63] = var11[var63] + -var13[var63];
                    }
                }
            } else {
                for (int var64 = 0; ~var64 > ~class168.field2737; ++var64) {
                    var7[var64] = var9[var64] + var12[var64];
                    var8[var64] = var14[var64] - -var15[var64];
                    var10[var64] = var11[var64] - -var13[var64];
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(II)[I")
    public final int[] method46(int arg0, int arg1) {
        ++field2149;
        int[] var3 = super.field1883.method531(arg1, (byte) 102);
        if (arg0 != 2) {
            return null;
        } else {
            if (super.field1883.field1313) {
                int[] var4 = this.method837(0, 0, arg1);
                int[] var5 = this.method837(0, 1, arg1);
                int var6 = this.field2147;
                if (~var6 != -2) {
                    if (var6 != 2) {
                        if (~var6 != -4) {
                            if (var6 != 4) {
                                if (~var6 != -6) {
                                    if (~var6 != -7) {
                                        if (var6 != 7) {
                                            if (var6 != 8) {
                                                if (~var6 != -10) {
                                                    if (var6 != 10) {
                                                        if (var6 != 11) {
                                                            if (~var6 == -13) {
                                                                for (int var7 = 0; class168.field2737 > var7; ++var7) {
                                                                    int var8 = var5[var7];
                                                                    int var9 = var4[var7];
                                                                    var3[var7] = -(var8 * var9 >> 11) + var8 + var9;
                                                                }
                                                            }
                                                        } else {
                                                            for (int var10 = 0; var10 < class168.field2737; ++var10) {
                                                                int var11 = var4[var10];
                                                                int var12 = var5[var10];
                                                                var3[var10] = var12 < var11 ? var11 - var12 : var12 - var11;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var13 = 0; ~var13 > ~class168.field2737; ++var13) {
                                                            int var14 = var5[var13];
                                                            int var15 = var4[var13];
                                                            var3[var13] = ~var14 <= ~var15 ? var14 : var15;
                                                        }
                                                    }
                                                } else {
                                                    for (int var16 = 0; ~class168.field2737 < ~var16; ++var16) {
                                                        int var17 = var4[var16];
                                                        int var18 = var5[var16];
                                                        var3[var16] = ~var18 >= ~var17 ? var18 : var17;
                                                    }
                                                }
                                            } else {
                                                for (int var19 = 0; ~var19 > ~class168.field2737; ++var19) {
                                                    int var20 = var4[var19];
                                                    var3[var19] = ~var20 != -1 ? -((-var5[var19] + 4096 << 12) / var20) + 4096 : 0;
                                                }
                                            }
                                        } else {
                                            for (int var21 = 0; class168.field2737 > var21; ++var21) {
                                                int var22 = var4[var21];
                                                var3[var21] = ~var22 != -4097 ? (var5[var21] << 12) / (4096 - var22) : 4096;
                                            }
                                        }
                                    } else {
                                        for (int var23 = 0; class168.field2737 > var23; ++var23) {
                                            int var24 = var5[var23];
                                            var3[var23] = var24 < 2048 ? var4[var23] * var24 >> 11 : -((-var4[var23] + 4096) * (-var24 + 4096) >> 11) + 4096;
                                        }
                                    }
                                } else {
                                    for (int var25 = 0; class168.field2737 > var25; ++var25) {
                                        var3[var25] = 4096 - ((4096 - var4[var25]) * (-var5[var25] + 4096) >> 12);
                                    }
                                }
                            } else {
                                for (int var26 = 0; class168.field2737 > var26; ++var26) {
                                    int var27 = var5[var26];
                                    var3[var26] = ~var27 == -1 ? 4096 : (var4[var26] << 12) / var27;
                                }
                            }
                        } else {
                            for (int var28 = 0; ~class168.field2737 < ~var28; ++var28) {
                                var3[var28] = var4[var28] * var5[var28] >> 12;
                            }
                        }
                    } else {
                        for (int var29 = 0; class168.field2737 > var29; ++var29) {
                            var3[var29] = var4[var29] - var5[var29];
                        }
                    }
                } else {
                    for (int var30 = 0; var30 < class168.field2737; ++var30) {
                        var3[var30] = var4[var30] + var5[var30];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lwd;II)V")
    public final void method44(class162 arg0, int arg1, int arg2) {
        if (arg1 == 255) {
            if (arg2 != 0) {
                if (arg2 == 1) {
                    super.field1885 = ~arg0.method1133((byte) 53) == -2;
                }
            } else {
                this.field2147 = arg0.method1133((byte) 53);
            }
            ++field2152;
        }
    }
}
