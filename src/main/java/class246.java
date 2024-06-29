import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class246 extends class200 {

    @OriginalMember(owner = "client!o", name = "ab", descriptor = "I")
    private int field4329 = 6;

    @OriginalMember(owner = "client!o", name = "O", descriptor = "Z")
    public static boolean field4317 = false;

    @OriginalMember(owner = "client!o", name = "X", descriptor = "Lid;")
    public static class149 field4326 = class60.method382("Fertigkeit: ", (byte) 104);

    @OriginalMember(owner = "client!o", name = "Y", descriptor = "I")
    public static int field4327 = 0;

    @OriginalMember(owner = "client!o", name = "N", descriptor = "I")
    public static int field4316;

    @OriginalMember(owner = "client!o", name = "Q", descriptor = "I")
    public static int field4319;

    @OriginalMember(owner = "client!o", name = "S", descriptor = "I")
    public static int field4321;

    @OriginalMember(owner = "client!o", name = "T", descriptor = "I")
    public static int field4322;

    @OriginalMember(owner = "client!o", name = "U", descriptor = "I")
    public static int field4323;

    @OriginalMember(owner = "client!o", name = "V", descriptor = "I")
    public static int field4324;

    @OriginalMember(owner = "client!o", name = "W", descriptor = "I")
    public static int field4325;

    @OriginalMember(owner = "client!o", name = "Z", descriptor = "I")
    public static int field4328;

    @OriginalMember(owner = "client!o", name = "P", descriptor = "Lcj;")
    public static class117 field4318;

    @OriginalMember(owner = "client!o", name = "R", descriptor = "Lvc;")
    public static class190 field4320;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Lgd;ZI)V")
    public final void method31(class74 arg0, boolean arg1, int arg2) {
        ++field4323;
        if (arg2 != 0) {
            if (~arg2 == -2) {
                super.field3641 = arg0.method489((byte) -7) == 1;
            }
        } else {
            this.field4329 = arg0.method489((byte) -123);
        }
        if (!arg1) {
            field4326 = null;
        }
    }

    @OriginalMember(owner = "client!o", name = "e", descriptor = "(I)V")
    public static void method1711(int arg0) {
        field4326 = null;
        if (arg0 > -112) {
            field4321 = 79;
        }
        field4320 = null;
        field4318 = null;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IJ)V")
    public static final void method1712(int arg0, long arg1) {
        ++field4322;
        if (~arg1 != -1L) {
            if ((class49.field892 < 100 || class185.field3334) && ~class49.field892 > -201) {
                class149 var3 = class258.method1780((byte) -72, arg1).method1022(0);
                for (int var4 = 0; class49.field892 > var4; ++var4) {
                    if (~class87.field1589[var4] == ~arg1) {
                        class264.method1841(true, class237.method1603(new class149[] { var3, class87.field1586 }, -112), class171.field3158, 0);
                        return;
                    }
                }
                if (arg0 > 97) {
                    for (int var5 = 0; class16.field229 > var5; ++var5) {
                        if (class139.field2545[var5] == arg1) {
                            class264.method1841(true, class237.method1603(new class149[] { class244.field4299, var3, class247.field4339 }, -101), class171.field3158, 0);
                            return;
                        }
                    }
                    if (var3.method1041((byte) -103, class77.field1449.field2243)) {
                        class264.method1841(true, class77.field1451, class171.field3158, 0);
                    } else {
                        ++class258.field4513;
                        class217.field3822[class49.field892] = var3;
                        class87.field1589[class49.field892] = arg1;
                        class64.field1139[class49.field892] = 0;
                        class213.field3771[class49.field892] = class171.field3158;
                        class94.field1656[class49.field892] = 0;
                        class116.field1984[class49.field892] = false;
                        ++class49.field892;
                        class38.field562 = class90.field1606;
                        class208.field3720.method162(2, 120);
                        class208.field3720.method496(2, arg1);
                    }
                }
            } else {
                class264.method1841(true, class231.field4071, class171.field3158, 0);
            }
        }
    }

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "()V")
    public class246() {
        super(2, false);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method24(boolean arg0, int arg1) {
        ++field4316;
        int[][] var3 = super.field3632.method965(arg1, 65);
        if (super.field3632.field2550) {
            int[][] var4 = this.method1366(arg1, false, 0);
            int[][] var5 = this.method1366(arg1, !arg0, 1);
            int[] var6 = var3[1];
            int[] var7 = var3[0];
            int[] var8 = var4[0];
            int[] var9 = var4[1];
            int[] var10 = var3[2];
            int[] var11 = var4[2];
            int[] var12 = var5[1];
            int[] var13 = var5[0];
            int[] var14 = var5[2];
            int var15 = this.field4329;
            if (var15 != 1) {
                if (~var15 != -3) {
                    if (var15 != 3) {
                        if (var15 != 4) {
                            if (~var15 != -6) {
                                if (var15 != 6) {
                                    if (var15 != 7) {
                                        if (var15 != 8) {
                                            if (var15 != 9) {
                                                if (var15 != 10) {
                                                    if (var15 != 11) {
                                                        if (var15 == 12) {
                                                            for (int var16 = 0; var16 < class137.field2515; ++var16) {
                                                                int var17 = var12[var16];
                                                                int var18 = var9[var16];
                                                                int var19 = var14[var16];
                                                                int var20 = var13[var16];
                                                                int var21 = var8[var16];
                                                                int var22 = var11[var16];
                                                                var7[var16] = var20 - (var20 * var21 >> 11) + var21;
                                                                var6[var16] = var18 - -var17 + -(var17 * var18 >> 11);
                                                                var10[var16] = var19 + var22 + -(var19 * var22 >> 11);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var23 = 0; ~class137.field2515 < ~var23; ++var23) {
                                                            int var24 = var12[var23];
                                                            int var25 = var8[var23];
                                                            int var26 = var11[var23];
                                                            int var27 = var14[var23];
                                                            int var28 = var13[var23];
                                                            int var29 = var9[var23];
                                                            var7[var23] = ~var28 <= ~var25 ? -var25 + var28 : -var28 + var25;
                                                            var6[var23] = ~var29 < ~var24 ? -var24 + var29 : var24 - var29;
                                                            var10[var23] = ~var26 < ~var27 ? -var27 + var26 : -var26 + var27;
                                                        }
                                                    }
                                                } else {
                                                    for (int var30 = 0; class137.field2515 > var30; ++var30) {
                                                        int var31 = var13[var30];
                                                        int var32 = var14[var30];
                                                        int var33 = var12[var30];
                                                        int var34 = var8[var30];
                                                        int var35 = var11[var30];
                                                        int var36 = var9[var30];
                                                        var7[var30] = var34 > var31 ? var34 : var31;
                                                        var6[var30] = var36 <= var33 ? var33 : var36;
                                                        var10[var30] = ~var35 < ~var32 ? var35 : var32;
                                                    }
                                                }
                                            } else {
                                                for (int var37 = 0; var37 < class137.field2515; ++var37) {
                                                    int var38 = var13[var37];
                                                    int var39 = var8[var37];
                                                    int var40 = var12[var37];
                                                    int var41 = var9[var37];
                                                    int var42 = var11[var37];
                                                    int var43 = var14[var37];
                                                    var7[var37] = ~var39 <= ~var38 ? var38 : var39;
                                                    var6[var37] = ~var41 <= ~var40 ? var40 : var41;
                                                    var10[var37] = var42 < var43 ? var42 : var43;
                                                }
                                            }
                                        } else {
                                            for (int var44 = 0; ~class137.field2515 < ~var44; ++var44) {
                                                int var45 = var9[var44];
                                                int var46 = var8[var44];
                                                int var47 = var11[var44];
                                                var7[var44] = ~var46 != -1 ? -((-var13[var44] + 4096 << 12) / var46) + 4096 : 0;
                                                var6[var44] = var45 != 0 ? -((-var12[var44] + 4096 << 12) / var45) + 4096 : 0;
                                                var10[var44] = ~var47 != -1 ? 4096 - (-var14[var44] + 4096 << 12) / var47 : 0;
                                            }
                                        }
                                    } else {
                                        for (int var48 = 0; class137.field2515 > var48; ++var48) {
                                            int var49 = var11[var48];
                                            int var50 = var8[var48];
                                            int var51 = var9[var48];
                                            var7[var48] = ~var50 != -4097 ? (var13[var48] << 12) / (-var50 + 4096) : 4096;
                                            var6[var48] = ~var51 != -4097 ? (var12[var48] << 12) / (-var51 + 4096) : 4096;
                                            var10[var48] = ~var49 == -4097 ? 4096 : (var14[var48] << 12) / (-var49 + 4096);
                                        }
                                    }
                                } else {
                                    for (int var52 = 0; var52 < class137.field2515; ++var52) {
                                        int var53 = var14[var52];
                                        int var54 = var12[var52];
                                        int var55 = var13[var52];
                                        var7[var52] = ~var55 > -2049 ? var8[var52] * var55 >> 11 : 4096 - ((-var8[var52] + 4096) * (-var55 + 4096) >> 11);
                                        var6[var52] = ~var54 <= -2049 ? 4096 - ((-var9[var52] + 4096) * (-var54 + 4096) >> 11) : var9[var52] * var54 >> 11;
                                        var10[var52] = ~var53 > -2049 ? var11[var52] * var53 >> 11 : -((4096 - var53) * (-var11[var52] + 4096) >> 11) + 4096;
                                    }
                                }
                            } else {
                                for (int var56 = 0; ~class137.field2515 < ~var56; ++var56) {
                                    var7[var56] = -((4096 - var13[var56]) * (-var8[var56] + 4096) >> 12) + 4096;
                                    var6[var56] = -((-var9[var56] + 4096) * (-var12[var56] + 4096) >> 12) + 4096;
                                    var10[var56] = -((-var11[var56] + 4096) * (-var14[var56] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var57 = 0; var57 < class137.field2515; ++var57) {
                                int var58 = var14[var57];
                                int var59 = var12[var57];
                                int var60 = var13[var57];
                                var7[var57] = var60 != 0 ? (var8[var57] << 12) / var60 : 4096;
                                var6[var57] = ~var59 != -1 ? (var9[var57] << 12) / var59 : 4096;
                                var10[var57] = ~var58 != -1 ? (var11[var57] << 12) / var58 : 4096;
                            }
                        }
                    } else {
                        for (int var61 = 0; ~class137.field2515 < ~var61; ++var61) {
                            var7[var61] = var8[var61] * var13[var61] >> 12;
                            var6[var61] = var9[var61] * var12[var61] >> 12;
                            var10[var61] = var11[var61] * var14[var61] >> 12;
                        }
                    }
                } else {
                    for (int var62 = 0; class137.field2515 > var62; ++var62) {
                        var7[var62] = var8[var62] - var13[var62];
                        var6[var62] = var9[var62] - var12[var62];
                        var10[var62] = var11[var62] + -var14[var62];
                    }
                }
            } else {
                for (int var63 = 0; var63 < class137.field2515; ++var63) {
                    var7[var63] = var8[var63] + var13[var63];
                    var6[var63] = var9[var63] + var12[var63];
                    var10[var63] = var11[var63] + var14[var63];
                }
            }
        }
        if (!arg0) {
            method1713(82, (short) -122);
        }
        return var3;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IS)Z")
    public static final boolean method1713(int arg0, short arg1) {
        ++field4328;
        if (arg1 != 30 && arg1 != 18 && arg1 != 44 && arg1 != 26 && arg1 != 23 && ~arg1 != -13 && ~arg1 != -40 && arg1 != 15) {
            if (arg0 != 29050) {
                return false;
            } else if (~arg1 != -60 && ~arg1 != -23 && ~arg1 != -1006 && ~arg1 != -1002) {
                if (~arg1 != -43 && arg1 != 50 && arg1 != 37 && ~arg1 != -2 && ~arg1 != -3) {
                    return arg1 == 46 || ~arg1 == -7 || ~arg1 == -4 || ~arg1 == -14 || arg1 == 10 || ~arg1 == -39;
                } else {
                    return true;
                }
            } else {
                return true;
            }
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IB)[I")
    public final int[] method26(int arg0, byte arg1) {
        ++field4324;
        int[] var3 = super.field3638.method1879(arg0, true);
        if (super.field3638.field4887) {
            int[] var4 = this.method1368(0, arg0, false);
            int[] var5 = this.method1368(1, arg0, false);
            int var6 = this.field4329;
            if (var6 != 1) {
                if (var6 != 2) {
                    if (var6 != 3) {
                        if (var6 != 4) {
                            if (~var6 != -6) {
                                if (~var6 != -7) {
                                    if (~var6 != -8) {
                                        if (~var6 != -9) {
                                            if (var6 != 9) {
                                                if (~var6 != -11) {
                                                    if (~var6 != -12) {
                                                        if (~var6 == -13) {
                                                            for (int var7 = 0; class137.field2515 > var7; ++var7) {
                                                                int var8 = var4[var7];
                                                                int var9 = var5[var7];
                                                                var3[var7] = -(var8 * var9 >> 11) + var8 + var9;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var10 = 0; ~class137.field2515 < ~var10; ++var10) {
                                                            int var11 = var4[var10];
                                                            int var12 = var5[var10];
                                                            var3[var10] = var12 < var11 ? var11 - var12 : var12 - var11;
                                                        }
                                                    }
                                                } else {
                                                    for (int var13 = 0; ~var13 > ~class137.field2515; ++var13) {
                                                        int var14 = var4[var13];
                                                        int var15 = var5[var13];
                                                        var3[var13] = ~var14 < ~var15 ? var14 : var15;
                                                    }
                                                }
                                            } else {
                                                for (int var16 = 0; ~var16 > ~class137.field2515; ++var16) {
                                                    int var17 = var4[var16];
                                                    int var18 = var5[var16];
                                                    var3[var16] = var18 > var17 ? var17 : var18;
                                                }
                                            }
                                        } else {
                                            for (int var19 = 0; class137.field2515 > var19; ++var19) {
                                                int var20 = var4[var19];
                                                var3[var19] = ~var20 != -1 ? -((4096 - var5[var19] << 12) / var20) + 4096 : 0;
                                            }
                                        }
                                    } else {
                                        for (int var21 = 0; class137.field2515 > var21; ++var21) {
                                            int var22 = var4[var21];
                                            var3[var21] = var22 != 4096 ? (var5[var21] << 12) / (-var22 + 4096) : 4096;
                                        }
                                    }
                                } else {
                                    for (int var23 = 0; ~var23 > ~class137.field2515; ++var23) {
                                        int var24 = var5[var23];
                                        var3[var23] = ~var24 > -2049 ? var4[var23] * var24 >> 11 : 4096 - ((-var4[var23] + 4096) * (-var24 + 4096) >> 11);
                                    }
                                }
                            } else {
                                for (int var25 = 0; ~class137.field2515 < ~var25; ++var25) {
                                    var3[var25] = 4096 - ((4096 - var4[var25]) * (-var5[var25] + 4096) >> 12);
                                }
                            }
                        } else {
                            for (int var26 = 0; ~var26 > ~class137.field2515; ++var26) {
                                int var27 = var5[var26];
                                var3[var26] = var27 == 0 ? 4096 : (var4[var26] << 12) / var27;
                            }
                        }
                    } else {
                        for (int var28 = 0; ~var28 > ~class137.field2515; ++var28) {
                            var3[var28] = var4[var28] * var5[var28] >> 12;
                        }
                    }
                } else {
                    for (int var29 = 0; ~class137.field2515 < ~var29; ++var29) {
                        var3[var29] = var4[var29] + -var5[var29];
                    }
                }
            } else {
                for (int var30 = 0; ~var30 > ~class137.field2515; ++var30) {
                    var3[var30] = var4[var30] - -var5[var30];
                }
            }
        }
        if (arg1 != 55) {
            this.method26(51, (byte) 61);
        }
        return var3;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIBIIII)V")
    public static final void method1714(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field4325;
        if (arg5 >= 1 && ~arg7 <= -2 && arg5 <= 102 && arg7 <= 102) {
            if (!class123.method869(true) && (2 & class69.field1215[0][arg5][arg7]) == 0) {
                int var8 = arg1;
                if ((8 & class69.field1215[arg1][arg5][arg7]) != 0) {
                    var8 = 0;
                }
                if (~class223.field3932 != ~var8) {
                    return;
                }
            }
            int var9 = arg1;
            if (arg1 < 3 && ~(2 & class69.field1215[1][arg5][arg7]) == -3) {
                var9 = arg1 + 1;
            }
            class68.method421(class228.field3989[arg1], arg5, (byte) 36, var9, arg1, arg7, arg4);
            if (~arg2 <= -1) {
                boolean var10 = class211.field3761;
                class211.field3761 = true;
                class85.method634(false, arg1, arg2, var9, arg6, arg0, arg5, arg7, false, class228.field3989[arg1], 2);
                class211.field3761 = var10;
            }
        }
        if (arg3 > -21) {
            method1713(26, (short) -41);
        }
    }
}
