import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class230 extends class84 {

    @OriginalMember(owner = "client!me", name = "M", descriptor = "I")
    private int field3703 = 6;

    @OriginalMember(owner = "client!me", name = "Q", descriptor = "I")
    public static int field3707 = 0;

    @OriginalMember(owner = "client!me", name = "V", descriptor = "I")
    public static int field3712 = 0;

    @OriginalMember(owner = "client!me", name = "P", descriptor = "Lhl;")
    public static class40 field3706 = new class40(16);

    @OriginalMember(owner = "client!me", name = "Z", descriptor = "[I")
    public static int[] field3716 = new int[4];

    @OriginalMember(owner = "client!me", name = "N", descriptor = "I")
    public static int field3704;

    @OriginalMember(owner = "client!me", name = "O", descriptor = "I")
    public static int field3705;

    @OriginalMember(owner = "client!me", name = "R", descriptor = "I")
    public static int field3708;

    @OriginalMember(owner = "client!me", name = "S", descriptor = "I")
    public static int field3709;

    @OriginalMember(owner = "client!me", name = "T", descriptor = "I")
    public static int field3710;

    @OriginalMember(owner = "client!me", name = "U", descriptor = "I")
    public static int field3711;

    @OriginalMember(owner = "client!me", name = "W", descriptor = "I")
    public static int field3713;

    @OriginalMember(owner = "client!me", name = "X", descriptor = "I")
    public static int field3714;

    @OriginalMember(owner = "client!me", name = "Y", descriptor = "Llc;")
    public static class86 field3715;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Lv;BI)V")
    public final void method31(class152 arg0, byte arg1, int arg2) {
        if (arg2 != 0) {
            if (~arg2 == -2) {
                super.field1217 = arg0.method1111(255) == 1;
            }
        } else {
            this.field3703 = arg0.method1111(255);
        }
        if (arg1 <= 87) {
            this.field3703 = 41;
        }
        ++field3710;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IB)[[I")
    public final int[][] method30(int arg0, byte arg1) {
        int[][] var3 = super.field1211.method193((byte) -128, arg0);
        if (super.field1211.field321) {
            int[][] var4 = this.method611(0, (byte) -80, arg0);
            int[][] var5 = this.method611(1, (byte) -109, arg0);
            int[] var6 = var5[0];
            int[] var7 = var4[1];
            int[] var8 = var3[0];
            int[] var9 = var3[2];
            int[] var10 = var4[0];
            int[] var11 = var3[1];
            int[] var12 = var4[2];
            int[] var13 = var5[1];
            int[] var14 = var5[2];
            int var15 = this.field3703;
            if (~var15 != -2) {
                if (var15 != 2) {
                    if (~var15 != -4) {
                        if (var15 != 4) {
                            if (~var15 != -6) {
                                if (~var15 != -7) {
                                    if (var15 != 7) {
                                        if (~var15 != -9) {
                                            if (~var15 != -10) {
                                                if (~var15 != -11) {
                                                    if (~var15 != -12) {
                                                        if (var15 == 12) {
                                                            for (int var16 = 0; ~var16 > ~class20.field221; ++var16) {
                                                                int var17 = var7[var16];
                                                                int var18 = var10[var16];
                                                                int var19 = var14[var16];
                                                                int var20 = var6[var16];
                                                                int var21 = var12[var16];
                                                                int var22 = var13[var16];
                                                                var8[var16] = var18 + var20 + -(var18 * var20 >> 11);
                                                                var11[var16] = var22 - (var17 * var22 >> 11) + var17;
                                                                var9[var16] = var19 + var21 + -(var19 * var21 >> 11);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var23 = 0; var23 < class20.field221; ++var23) {
                                                            int var24 = var6[var23];
                                                            int var25 = var12[var23];
                                                            int var26 = var10[var23];
                                                            int var27 = var14[var23];
                                                            int var28 = var13[var23];
                                                            int var29 = var7[var23];
                                                            var8[var23] = ~var26 < ~var24 ? -var24 + var26 : var24 - var26;
                                                            var11[var23] = var29 > var28 ? var29 - var28 : var28 - var29;
                                                            var9[var23] = var25 > var27 ? -var27 + var25 : var27 - var25;
                                                        }
                                                    }
                                                } else {
                                                    for (int var30 = 0; var30 < class20.field221; ++var30) {
                                                        int var31 = var10[var30];
                                                        int var32 = var6[var30];
                                                        int var33 = var7[var30];
                                                        int var34 = var13[var30];
                                                        int var35 = var12[var30];
                                                        int var36 = var14[var30];
                                                        var8[var30] = var32 >= var31 ? var32 : var31;
                                                        var11[var30] = ~var33 >= ~var34 ? var34 : var33;
                                                        var9[var30] = ~var36 > ~var35 ? var35 : var36;
                                                    }
                                                }
                                            } else {
                                                for (int var37 = 0; ~var37 > ~class20.field221; ++var37) {
                                                    int var38 = var14[var37];
                                                    int var39 = var13[var37];
                                                    int var40 = var10[var37];
                                                    int var41 = var6[var37];
                                                    int var42 = var12[var37];
                                                    int var43 = var7[var37];
                                                    var8[var37] = ~var41 >= ~var40 ? var41 : var40;
                                                    var11[var37] = ~var43 > ~var39 ? var43 : var39;
                                                    var9[var37] = ~var42 <= ~var38 ? var38 : var42;
                                                }
                                            }
                                        } else {
                                            for (int var44 = 0; var44 < class20.field221; ++var44) {
                                                int var45 = var7[var44];
                                                int var46 = var12[var44];
                                                int var47 = var10[var44];
                                                var8[var44] = ~var47 != -1 ? -((4096 - var6[var44] << 12) / var47) + 4096 : 0;
                                                var11[var44] = var45 == 0 ? 0 : -((-var13[var44] + 4096 << 12) / var45) + 4096;
                                                var9[var44] = var46 == 0 ? 0 : 4096 - (4096 - var14[var44] << 12) / var46;
                                            }
                                        }
                                    } else {
                                        for (int var48 = 0; ~class20.field221 < ~var48; ++var48) {
                                            int var49 = var10[var48];
                                            int var50 = var12[var48];
                                            int var51 = var7[var48];
                                            var8[var48] = ~var49 != -4097 ? (var6[var48] << 12) / (-var49 + 4096) : 4096;
                                            var11[var48] = var51 == 4096 ? 4096 : (var13[var48] << 12) / (-var51 + 4096);
                                            var9[var48] = ~var50 == -4097 ? 4096 : (var14[var48] << 12) / (-var50 + 4096);
                                        }
                                    }
                                } else {
                                    for (int var52 = 0; ~class20.field221 < ~var52; ++var52) {
                                        int var53 = var14[var52];
                                        int var54 = var6[var52];
                                        int var55 = var13[var52];
                                        var8[var52] = var54 < 2048 ? var10[var52] * var54 >> 11 : -((4096 - var10[var52]) * (-var54 + 4096) >> 11) + 4096;
                                        var11[var52] = ~var55 > -2049 ? var7[var52] * var55 >> 11 : 4096 - ((4096 - var55) * (-var7[var52] + 4096) >> 11);
                                        var9[var52] = ~var53 <= -2049 ? 4096 - ((-var12[var52] + 4096) * (-var53 + 4096) >> 11) : var12[var52] * var53 >> 11;
                                    }
                                }
                            } else {
                                for (int var56 = 0; ~class20.field221 < ~var56; ++var56) {
                                    var8[var56] = 4096 - ((4096 - var6[var56]) * (-var10[var56] + 4096) >> 12);
                                    var11[var56] = -((4096 - var13[var56]) * (-var7[var56] + 4096) >> 12) + 4096;
                                    var9[var56] = -((4096 - var12[var56]) * (-var14[var56] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var57 = 0; var57 < class20.field221; ++var57) {
                                int var58 = var13[var57];
                                int var59 = var6[var57];
                                int var60 = var14[var57];
                                var8[var57] = var59 == 0 ? 4096 : (var10[var57] << 12) / var59;
                                var11[var57] = ~var58 == -1 ? 4096 : (var7[var57] << 12) / var58;
                                var9[var57] = var60 != 0 ? (var12[var57] << 12) / var60 : 4096;
                            }
                        }
                    } else {
                        for (int var61 = 0; var61 < class20.field221; ++var61) {
                            var8[var61] = var6[var61] * var10[var61] >> 12;
                            var11[var61] = var7[var61] * var13[var61] >> 12;
                            var9[var61] = var12[var61] * var14[var61] >> 12;
                        }
                    }
                } else {
                    for (int var62 = 0; ~var62 > ~class20.field221; ++var62) {
                        var8[var62] = var10[var62] + -var6[var62];
                        var11[var62] = var7[var62] + -var13[var62];
                        var9[var62] = var12[var62] + -var14[var62];
                    }
                }
            } else {
                for (int var63 = 0; var63 < class20.field221; ++var63) {
                    var8[var63] = var6[var63] + var10[var63];
                    var11[var63] = var7[var63] - -var13[var63];
                    var9[var63] = var12[var63] - -var14[var63];
                }
            }
        }
        ++field3704;
        return arg1 != -18 ? null : var3;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Lqi;IIIIIII)V")
    public static final void method1637(class131 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg2 == 0) {
            int var8 = arg5 * arg5 - -(arg4 * arg4);
            ++field3709;
            if (var8 <= arg6) {
                int var9 = Math.min(arg0.field2102 / 2, arg0.field2167 / 2);
                if (~var8 < ~(var9 * var9)) {
                    int var10 = (int) class190.field3068 + class61.field855 & 2047;
                    int var11 = class47.field679[var10];
                    int var12 = var11 * 256 / (class53.field776 + 256);
                    int var13 = class47.field695[var10];
                    int var14 = var13 * 256 / (class53.field776 + 256);
                    var9 -= 10;
                    int var15 = arg4 * var12 + arg5 * var14 >> 16;
                    int var16 = arg4 * var14 - arg5 * var12 >> 16;
                    double var17 = Math.atan2((double) var15, (double) var16);
                    int var19 = (int) ((double) var9 * Math.sin(var17));
                    int var20 = (int) ((double) var9 * Math.cos(var17));
                    ((class140) class132.field2180[arg1]).method62(arg0.field2102 / 2 + var19 + arg3 + -10, arg0.field2167 / 2 + -10 + -var20 + arg7, 20, 20, 15, 15, var17, 256);
                } else {
                    class287.method1953(arg0, (byte) -57, class145.field2354[arg1], arg3, arg5, arg7, arg4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(B)V")
    public static final void method1638(byte arg0) {
        class168.method1239(5, -108);
        class49.method383((byte) 123, 5);
        if (arg0 >= -47) {
            field3706 = null;
        }
        class61.method434(5, false);
        ++field3708;
        class26.method184(false, 5);
        class185.method1374(5, 67);
        class166.method1224((byte) 50, 5);
        class192.method1425(5, 0);
        class90.method712(5, -16867);
        class132.method960(-72, 5);
        class133.method964(5, -13803);
        class33.method242(262144, 5);
        class176.method1317(true, 5);
        class106.method790(-77, 5);
        class201.method1482(5, (byte) -39);
        class67.method475(5, (byte) 124);
        class39.method301(5, (byte) 77);
        class163.method1210((byte) -87, 5);
        class86.method621(-100, 50);
        class183.method1359(26893, 5);
        class262.method1840(5, 16);
        class161.field2635.method1548(5, 0);
        class168.field2703.method1548(5, 0);
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method1639(int arg0, String arg1) {
        ++field3705;
        int var2 = 115 / ((73 - arg0) / 47);
        return class24.method177(-123, arg1, true, 10);
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(II)Llk;")
    public static final class84 method1640(int arg0, int arg1) {
        if (arg1 != 9054) {
            return null;
        } else {
            ++field3713;
            if (~arg0 != -1) {
                if (~arg0 != -2) {
                    if (arg0 != 2) {
                        if (~arg0 != -4) {
                            if (~arg0 != -5) {
                                if (~arg0 != -6) {
                                    if (arg0 != 6) {
                                        if (~arg0 != -8) {
                                            if (arg0 != 8) {
                                                if (arg0 != 9) {
                                                    if (~arg0 != -11) {
                                                        if (~arg0 != -12) {
                                                            if (~arg0 != -13) {
                                                                if (arg0 != 13) {
                                                                    if (arg0 != 14) {
                                                                        if (arg0 != 15) {
                                                                            if (arg0 != 16) {
                                                                                if (~arg0 != -18) {
                                                                                    if (arg0 != 18) {
                                                                                        if (~arg0 != -20) {
                                                                                            if (~arg0 != -21) {
                                                                                                if (~arg0 != -22) {
                                                                                                    if (arg0 != 22) {
                                                                                                        if (arg0 != 23) {
                                                                                                            if (arg0 != 24) {
                                                                                                                if (~arg0 != -26) {
                                                                                                                    if (~arg0 != -27) {
                                                                                                                        if (~arg0 != -28) {
                                                                                                                            if (~arg0 != -29) {
                                                                                                                                if (~arg0 != -30) {
                                                                                                                                    if (arg0 != 30) {
                                                                                                                                        if (arg0 != 31) {
                                                                                                                                            if (arg0 != 32) {
                                                                                                                                                if (~arg0 != -34) {
                                                                                                                                                    if (~arg0 != -35) {
                                                                                                                                                        if (~arg0 != -36) {
                                                                                                                                                            if (arg0 != 36) {
                                                                                                                                                                if (arg0 != 37) {
                                                                                                                                                                    if (arg0 != 38) {
                                                                                                                                                                        return arg0 == 39 ? new class6() : null;
                                                                                                                                                                    } else {
                                                                                                                                                                        return new class91();
                                                                                                                                                                    }
                                                                                                                                                                } else {
                                                                                                                                                                    return new class67();
                                                                                                                                                                }
                                                                                                                                                            } else {
                                                                                                                                                                return new class21();
                                                                                                                                                            }
                                                                                                                                                        } else {
                                                                                                                                                            return new class296();
                                                                                                                                                        }
                                                                                                                                                    } else {
                                                                                                                                                        return new class106();
                                                                                                                                                    }
                                                                                                                                                } else {
                                                                                                                                                    return new class136();
                                                                                                                                                }
                                                                                                                                            } else {
                                                                                                                                                return new class211();
                                                                                                                                            }
                                                                                                                                        } else {
                                                                                                                                            return new class57();
                                                                                                                                        }
                                                                                                                                    } else {
                                                                                                                                        return new class239();
                                                                                                                                    }
                                                                                                                                } else {
                                                                                                                                    return new class11();
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                return new class143();
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            return new class194();
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        return new class233();
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    return new class210();
                                                                                                                }
                                                                                                            } else {
                                                                                                                return new class112();
                                                                                                            }
                                                                                                        } else {
                                                                                                            return new class148();
                                                                                                        }
                                                                                                    } else {
                                                                                                        return new class46();
                                                                                                    }
                                                                                                } else {
                                                                                                    return new class64();
                                                                                                }
                                                                                            } else {
                                                                                                return new class293();
                                                                                            }
                                                                                        } else {
                                                                                            return new class267();
                                                                                        }
                                                                                    } else {
                                                                                        return new class94();
                                                                                    }
                                                                                } else {
                                                                                    return new class229();
                                                                                }
                                                                            } else {
                                                                                return new class97();
                                                                            }
                                                                        } else {
                                                                            return new class125();
                                                                        }
                                                                    } else {
                                                                        return new class259();
                                                                    }
                                                                } else {
                                                                    return new class226();
                                                                }
                                                            } else {
                                                                return new class217();
                                                            }
                                                        } else {
                                                            return new class291();
                                                        }
                                                    } else {
                                                        return new class290();
                                                    }
                                                } else {
                                                    return new class149();
                                                }
                                            } else {
                                                return new class225();
                                            }
                                        } else {
                                            return new class230();
                                        }
                                    } else {
                                        return new class119();
                                    }
                                } else {
                                    return new class264();
                                }
                            } else {
                                return new class228();
                            }
                        } else {
                            return new class289();
                        }
                    } else {
                        return new class162();
                    }
                } else {
                    return new class104();
                }
            } else {
                return new class268();
            }
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(BI)[I")
    public final int[] method91(byte arg0, int arg1) {
        ++field3711;
        if (arg0 >= -125) {
            method1637((class131) null, -109, -49, -34, 93, 81, -88, 56);
        }
        int[] var3 = super.field1228.method1627(-1, arg1);
        if (super.field1228.field3651) {
            int[] var4 = this.method612(0, arg1, false);
            int[] var5 = this.method612(1, arg1, false);
            int var6 = this.field3703;
            if (var6 != 1) {
                if (~var6 != -3) {
                    if (var6 != 3) {
                        if (~var6 != -5) {
                            if (~var6 != -6) {
                                if (~var6 != -7) {
                                    if (var6 != 7) {
                                        if (var6 != 8) {
                                            if (~var6 != -10) {
                                                if (~var6 != -11) {
                                                    if (var6 != 11) {
                                                        if (var6 == 12) {
                                                            for (int var7 = 0; ~class20.field221 < ~var7; ++var7) {
                                                                int var8 = var5[var7];
                                                                int var9 = var4[var7];
                                                                var3[var7] = var8 + var9 - (var8 * var9 >> 11);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var10 = 0; ~var10 > ~class20.field221; ++var10) {
                                                            int var11 = var5[var10];
                                                            int var12 = var4[var10];
                                                            var3[var10] = var11 >= var12 ? -var12 + var11 : -var11 + var12;
                                                        }
                                                    }
                                                } else {
                                                    for (int var13 = 0; ~class20.field221 < ~var13; ++var13) {
                                                        int var14 = var5[var13];
                                                        int var15 = var4[var13];
                                                        var3[var13] = var15 <= var14 ? var14 : var15;
                                                    }
                                                }
                                            } else {
                                                for (int var16 = 0; ~class20.field221 < ~var16; ++var16) {
                                                    int var17 = var4[var16];
                                                    int var18 = var5[var16];
                                                    var3[var16] = ~var17 <= ~var18 ? var18 : var17;
                                                }
                                            }
                                        } else {
                                            for (int var19 = 0; ~var19 > ~class20.field221; ++var19) {
                                                int var20 = var4[var19];
                                                var3[var19] = ~var20 != -1 ? 4096 - (4096 - var5[var19] << 12) / var20 : 0;
                                            }
                                        }
                                    } else {
                                        for (int var21 = 0; ~var21 > ~class20.field221; ++var21) {
                                            int var22 = var4[var21];
                                            var3[var21] = ~var22 == -4097 ? 4096 : (var5[var21] << 12) / (-var22 + 4096);
                                        }
                                    }
                                } else {
                                    for (int var23 = 0; ~class20.field221 < ~var23; ++var23) {
                                        int var24 = var5[var23];
                                        var3[var23] = var24 < 2048 ? var4[var23] * var24 >> 11 : 4096 - ((4096 - var4[var23]) * (4096 - var24) >> 11);
                                    }
                                }
                            } else {
                                for (int var25 = 0; var25 < class20.field221; ++var25) {
                                    var3[var25] = -((4096 - var5[var25]) * (-var4[var25] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var26 = 0; class20.field221 > var26; ++var26) {
                                int var27 = var5[var26];
                                var3[var26] = var27 != 0 ? (var4[var26] << 12) / var27 : 4096;
                            }
                        }
                    } else {
                        for (int var28 = 0; class20.field221 > var28; ++var28) {
                            var3[var28] = var4[var28] * var5[var28] >> 12;
                        }
                    }
                } else {
                    for (int var29 = 0; class20.field221 > var29; ++var29) {
                        var3[var29] = var4[var29] + -var5[var29];
                    }
                }
            } else {
                for (int var30 = 0; ~var30 > ~class20.field221; ++var30) {
                    var3[var30] = var4[var30] - -var5[var30];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "()V")
    public class230() {
        super(2, false);
    }

    @OriginalMember(owner = "client!me", name = "c", descriptor = "(Z)V")
    public static void method1641(boolean arg0) {
        field3716 = null;
        field3706 = null;
        if (!arg0) {
            method1638((byte) 24);
        }
        field3715 = null;
    }
}
