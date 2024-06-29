import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class49 extends class80 {

    @OriginalMember(owner = "client!wc", name = "J", descriptor = "I")
    private int field991 = 6;

    @OriginalMember(owner = "client!wc", name = "L", descriptor = "Ljava/util/Calendar;")
    public static Calendar field993;

    @OriginalMember(owner = "client!wc", name = "P", descriptor = "Z")
    public static volatile boolean field997;

    @OriginalMember(owner = "client!wc", name = "I", descriptor = "I")
    public static int field990;

    @OriginalMember(owner = "client!wc", name = "K", descriptor = "I")
    public static int field992;

    @OriginalMember(owner = "client!wc", name = "M", descriptor = "I")
    public static int field994;

    @OriginalMember(owner = "client!wc", name = "N", descriptor = "I")
    public static int field995;

    @OriginalMember(owner = "client!wc", name = "O", descriptor = "I")
    public static int field996;

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(II)[I")
    public final int[] method25(int arg0, int arg1) {
        if (arg1 != -16828) {
            method468(-126);
        }
        ++field994;
        int[] var3 = super.field1601.method48(arg0, (byte) 0);
        if (super.field1601.field124) {
            int[] var4 = this.method710(arg0, 0, (byte) 125);
            int[] var5 = this.method710(arg0, 1, (byte) 88);
            int var6 = this.field991;
            if (~var6 != -2) {
                if (var6 != 2) {
                    if (var6 != 3) {
                        if (~var6 != -5) {
                            if (~var6 != -6) {
                                if (~var6 != -7) {
                                    if (~var6 != -8) {
                                        if (var6 != 8) {
                                            if (~var6 != -10) {
                                                if (var6 != 10) {
                                                    if (var6 != 11) {
                                                        if (~var6 == -13) {
                                                            for (int var7 = 0; var7 < class137.field2308; ++var7) {
                                                                int var8 = var4[var7];
                                                                int var9 = var5[var7];
                                                                var3[var7] = -(var8 * var9 >> 11) + var8 + var9;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var10 = 0; ~var10 > ~class137.field2308; ++var10) {
                                                            int var11 = var5[var10];
                                                            int var12 = var4[var10];
                                                            var3[var10] = var12 > var11 ? -var11 + var12 : -var12 + var11;
                                                        }
                                                    }
                                                } else {
                                                    for (int var13 = 0; ~class137.field2308 < ~var13; ++var13) {
                                                        int var14 = var5[var13];
                                                        int var15 = var4[var13];
                                                        var3[var13] = ~var14 <= ~var15 ? var14 : var15;
                                                    }
                                                }
                                            } else {
                                                for (int var16 = 0; class137.field2308 > var16; ++var16) {
                                                    int var17 = var4[var16];
                                                    int var18 = var5[var16];
                                                    var3[var16] = var17 >= var18 ? var18 : var17;
                                                }
                                            }
                                        } else {
                                            for (int var19 = 0; var19 < class137.field2308; ++var19) {
                                                int var20 = var4[var19];
                                                var3[var19] = ~var20 == -1 ? 0 : -((-var5[var19] + 4096 << 12) / var20) + 4096;
                                            }
                                        }
                                    } else {
                                        for (int var21 = 0; ~class137.field2308 < ~var21; ++var21) {
                                            int var22 = var4[var21];
                                            var3[var21] = var22 != 4096 ? (var5[var21] << 12) / (-var22 + 4096) : 4096;
                                        }
                                    }
                                } else {
                                    for (int var23 = 0; ~var23 > ~class137.field2308; ++var23) {
                                        int var24 = var5[var23];
                                        var3[var23] = ~var24 > -2049 ? var4[var23] * var24 >> 11 : -((-var4[var23] + 4096) * (-var24 + 4096) >> 11) + 4096;
                                    }
                                }
                            } else {
                                for (int var25 = 0; class137.field2308 > var25; ++var25) {
                                    var3[var25] = -((-var4[var25] + 4096) * (-var5[var25] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var26 = 0; ~var26 > ~class137.field2308; ++var26) {
                                int var27 = var5[var26];
                                var3[var26] = ~var27 == -1 ? 4096 : (var4[var26] << 12) / var27;
                            }
                        }
                    } else {
                        for (int var28 = 0; var28 < class137.field2308; ++var28) {
                            var3[var28] = var4[var28] * var5[var28] >> 12;
                        }
                    }
                } else {
                    for (int var29 = 0; var29 < class137.field2308; ++var29) {
                        var3[var29] = var4[var29] + -var5[var29];
                    }
                }
            } else {
                for (int var30 = 0; var30 < class137.field2308; ++var30) {
                    var3[var30] = var4[var30] + var5[var30];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method467(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field990;
        class387.method2372(arg7, 0, arg3, arg4, arg1, arg5, true, arg6, arg2, arg8);
        if (arg0 != -5206) {
            method468(51);
        }
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "()V")
    public class49() {
        super(2, false);
    }

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "(II)[[I")
    public final int[][] method29(int arg0, int arg1) {
        ++field992;
        int[][] var3 = super.field1589.method859(arg1, 126);
        if (arg0 != 255) {
            return null;
        } else {
            if (super.field1589.field1884) {
                int[][] var4 = this.method713(0, arg0 + -325, arg1);
                int[][] var5 = this.method713(1, -53, arg1);
                int[] var6 = var3[0];
                int[] var7 = var3[1];
                int[] var8 = var3[2];
                int[] var9 = var4[0];
                int[] var10 = var4[1];
                int[] var11 = var4[2];
                int[] var12 = var5[0];
                int[] var13 = var5[1];
                int[] var14 = var5[2];
                int var15 = this.field991;
                if (~var15 != -2) {
                    if (~var15 != -3) {
                        if (var15 != 3) {
                            if (~var15 != -5) {
                                if (~var15 != -6) {
                                    if (var15 != 6) {
                                        if (~var15 != -8) {
                                            if (var15 != 8) {
                                                if (var15 != 9) {
                                                    if (var15 != 10) {
                                                        if (~var15 != -12) {
                                                            if (var15 == 12) {
                                                                for (int var16 = 0; ~var16 > ~class137.field2308; ++var16) {
                                                                    int var17 = var11[var16];
                                                                    int var18 = var9[var16];
                                                                    int var19 = var13[var16];
                                                                    int var20 = var14[var16];
                                                                    int var21 = var12[var16];
                                                                    int var22 = var10[var16];
                                                                    var6[var16] = var18 + var21 + -(var18 * var21 >> 11);
                                                                    var7[var16] = -(var19 * var22 >> 11) + var22 + var19;
                                                                    var8[var16] = var17 + var20 + -(var17 * var20 >> 11);
                                                                }
                                                            }
                                                        } else {
                                                            for (int var23 = 0; class137.field2308 > var23; ++var23) {
                                                                int var24 = var13[var23];
                                                                int var25 = var14[var23];
                                                                int var26 = var9[var23];
                                                                int var27 = var12[var23];
                                                                int var28 = var10[var23];
                                                                int var29 = var11[var23];
                                                                var6[var23] = var26 > var27 ? -var27 + var26 : -var26 + var27;
                                                                var7[var23] = ~var28 >= ~var24 ? -var28 + var24 : -var24 + var28;
                                                                var8[var23] = var29 <= var25 ? -var29 + var25 : var29 - var25;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var30 = 0; class137.field2308 > var30; ++var30) {
                                                            int var31 = var12[var30];
                                                            int var32 = var13[var30];
                                                            int var33 = var9[var30];
                                                            int var34 = var11[var30];
                                                            int var35 = var14[var30];
                                                            int var36 = var10[var30];
                                                            var6[var30] = var33 > var31 ? var33 : var31;
                                                            var7[var30] = ~var32 <= ~var36 ? var32 : var36;
                                                            var8[var30] = ~var35 <= ~var34 ? var35 : var34;
                                                        }
                                                    }
                                                } else {
                                                    for (int var37 = 0; ~class137.field2308 < ~var37; ++var37) {
                                                        int var38 = var13[var37];
                                                        int var39 = var14[var37];
                                                        int var40 = var10[var37];
                                                        int var41 = var11[var37];
                                                        int var42 = var12[var37];
                                                        int var43 = var9[var37];
                                                        var6[var37] = var42 > var43 ? var43 : var42;
                                                        var7[var37] = ~var40 > ~var38 ? var40 : var38;
                                                        var8[var37] = ~var39 >= ~var41 ? var39 : var41;
                                                    }
                                                }
                                            } else {
                                                for (int var44 = 0; class137.field2308 > var44; ++var44) {
                                                    int var45 = var9[var44];
                                                    int var46 = var11[var44];
                                                    int var47 = var10[var44];
                                                    var6[var44] = var45 == 0 ? 0 : 4096 - (4096 - var12[var44] << 12) / var45;
                                                    var7[var44] = var47 == 0 ? 0 : -((-var13[var44] + 4096 << 12) / var47) + 4096;
                                                    var8[var44] = ~var46 != -1 ? 4096 - (-var14[var44] + 4096 << 12) / var46 : 0;
                                                }
                                            }
                                        } else {
                                            for (int var48 = 0; var48 < class137.field2308; ++var48) {
                                                int var49 = var10[var48];
                                                int var50 = var9[var48];
                                                int var51 = var11[var48];
                                                var6[var48] = var50 == 4096 ? 4096 : (var12[var48] << 12) / (4096 - var50);
                                                var7[var48] = ~var49 == -4097 ? 4096 : (var13[var48] << 12) / (-var49 + 4096);
                                                var8[var48] = var51 == 4096 ? 4096 : (var14[var48] << 12) / (4096 - var51);
                                            }
                                        }
                                    } else {
                                        for (int var52 = 0; var52 < class137.field2308; ++var52) {
                                            int var53 = var12[var52];
                                            int var54 = var13[var52];
                                            int var55 = var14[var52];
                                            var6[var52] = var53 < 2048 ? var9[var52] * var53 >> 11 : 4096 - ((4096 - var9[var52]) * (4096 - var53) >> 11);
                                            var7[var52] = ~var54 > -2049 ? var10[var52] * var54 >> 11 : -((-var10[var52] + 4096) * (-var54 + 4096) >> 11) + 4096;
                                            var8[var52] = var55 >= 2048 ? -((-var11[var52] + 4096) * (-var55 + 4096) >> 11) + 4096 : var11[var52] * var55 >> 11;
                                        }
                                    }
                                } else {
                                    for (int var56 = 0; ~class137.field2308 < ~var56; ++var56) {
                                        var6[var56] = -((4096 - var9[var56]) * (-var12[var56] + 4096) >> 12) + 4096;
                                        var7[var56] = -((4096 - var13[var56]) * (-var10[var56] + 4096) >> 12) + 4096;
                                        var8[var56] = -((-var11[var56] + 4096) * (-var14[var56] + 4096) >> 12) + 4096;
                                    }
                                }
                            } else {
                                for (int var57 = 0; var57 < class137.field2308; ++var57) {
                                    int var58 = var14[var57];
                                    int var59 = var12[var57];
                                    int var60 = var13[var57];
                                    var6[var57] = var59 == 0 ? 4096 : (var9[var57] << 12) / var59;
                                    var7[var57] = var60 == 0 ? 4096 : (var10[var57] << 12) / var60;
                                    var8[var57] = var58 == 0 ? 4096 : (var11[var57] << 12) / var58;
                                }
                            }
                        } else {
                            for (int var61 = 0; class137.field2308 > var61; ++var61) {
                                var6[var61] = var9[var61] * var12[var61] >> 12;
                                var7[var61] = var10[var61] * var13[var61] >> 12;
                                var8[var61] = var11[var61] * var14[var61] >> 12;
                            }
                        }
                    } else {
                        for (int var62 = 0; class137.field2308 > var62; ++var62) {
                            var6[var62] = var9[var62] + -var12[var62];
                            var7[var62] = var10[var62] - var13[var62];
                            var8[var62] = var11[var62] + -var14[var62];
                        }
                    }
                } else {
                    for (int var63 = 0; ~var63 > ~class137.field2308; ++var63) {
                        var6[var63] = var9[var63] + var12[var63];
                        var7[var63] = var10[var63] + var13[var63];
                        var8[var63] = var11[var63] + var14[var63];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "(I)V")
    public static void method468(int arg0) {
        if (arg0 != -31177) {
            method467(29, -5, -101, 103, -37, 118, -43, 60, -78);
        }
        field993 = null;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IILnn;)V")
    public final void method26(int arg0, int arg1, class289 arg2) {
        ++field996;
        int var4 = -8 / ((arg1 - 28) / 53);
        if (~arg0 != -1) {
            if (arg0 == 1) {
                super.field1591 = arg2.method1858(-3256) == 1;
            }
        } else {
            this.field991 = arg2.method1858(-3256);
        }
    }

    static {
        new class309("For that rule you can only report players who have spoken or traded recently.", "Mit dieser Option können nur Spieler gemeldet werden,", "Cette règle n'est invocable que pour les discussions ou échanges récents.", "Para essa regra, você só pode denunciar jogadores com quem tenha falado ou negociado recentemente.");
        field993 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        field997 = false;
    }
}
