import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class226 extends class278 {

    @OriginalMember(owner = "client!ng", name = "I", descriptor = "I")
    private int field3176 = 6;

    @OriginalMember(owner = "client!ng", name = "L", descriptor = "Ljm;")
    public static class485 field3178;

    @OriginalMember(owner = "client!ng", name = "K", descriptor = "I")
    public static int field3177;

    @OriginalMember(owner = "client!ng", name = "M", descriptor = "I")
    public static int field3179;

    @OriginalMember(owner = "client!ng", name = "N", descriptor = "I")
    public static int field3180;

    @OriginalMember(owner = "client!ng", name = "O", descriptor = "I")
    public static int field3181;

    @OriginalMember(owner = "client!ng", name = "P", descriptor = "I")
    public static int field3182;

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(II)[I")
    public final int[] method208(int arg0, int arg1) {
        ++field3181;
        int[] var3 = super.field3750.method256(arg1, -30359);
        if (arg0 != -9) {
            field3178 = null;
        }
        if (super.field3750.field554) {
            int[] var4 = this.method1570(0, 0, arg1);
            int[] var5 = this.method1570(0, 1, arg1);
            int var6 = this.field3176;
            if (~var6 != -2) {
                if (var6 != 2) {
                    if (~var6 != -4) {
                        if (var6 != 4) {
                            if (~var6 != -6) {
                                if (~var6 != -7) {
                                    if (var6 != 7) {
                                        if (~var6 != -9) {
                                            if (~var6 != -10) {
                                                if (~var6 != -11) {
                                                    if (~var6 != -12) {
                                                        if (~var6 == -13) {
                                                            for (int var7 = 0; var7 < class507.field7456; ++var7) {
                                                                int var8 = var5[var7];
                                                                int var9 = var4[var7];
                                                                var3[var7] = var9 - ((var8 * var9 >> 11) + -var8);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var10 = 0; ~var10 > ~class507.field7456; ++var10) {
                                                            int var11 = var5[var10];
                                                            int var12 = var4[var10];
                                                            var3[var10] = ~var12 < ~var11 ? -var11 + var12 : -var12 + var11;
                                                        }
                                                    }
                                                } else {
                                                    for (int var13 = 0; class507.field7456 > var13; ++var13) {
                                                        int var14 = var5[var13];
                                                        int var15 = var4[var13];
                                                        var3[var13] = ~var14 <= ~var15 ? var14 : var15;
                                                    }
                                                }
                                            } else {
                                                for (int var16 = 0; ~class507.field7456 < ~var16; ++var16) {
                                                    int var17 = var5[var16];
                                                    int var18 = var4[var16];
                                                    var3[var16] = ~var17 >= ~var18 ? var17 : var18;
                                                }
                                            }
                                        } else {
                                            for (int var19 = 0; ~var19 > ~class507.field7456; ++var19) {
                                                int var20 = var4[var19];
                                                var3[var19] = var20 == 0 ? 0 : -((-var5[var19] + 4096 << 12) / var20) + 4096;
                                            }
                                        }
                                    } else {
                                        for (int var21 = 0; ~class507.field7456 < ~var21; ++var21) {
                                            int var22 = var4[var21];
                                            var3[var21] = ~var22 == -4097 ? 4096 : (var5[var21] << 12) / (-var22 + 4096);
                                        }
                                    }
                                } else {
                                    for (int var23 = 0; ~class507.field7456 < ~var23; ++var23) {
                                        int var24 = var5[var23];
                                        var3[var23] = ~var24 <= -2049 ? 4096 - ((-var4[var23] + 4096) * (-var24 + 4096) >> 11) : var4[var23] * var24 >> 11;
                                    }
                                }
                            } else {
                                for (int var25 = 0; ~var25 > ~class507.field7456; ++var25) {
                                    var3[var25] = -((-var4[var25] + 4096) * (-var5[var25] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var26 = 0; var26 < class507.field7456; ++var26) {
                                int var27 = var5[var26];
                                var3[var26] = ~var27 != -1 ? (var4[var26] << 12) / var27 : 4096;
                            }
                        }
                    } else {
                        for (int var28 = 0; ~var28 > ~class507.field7456; ++var28) {
                            var3[var28] = var4[var28] * var5[var28] >> 12;
                        }
                    }
                } else {
                    for (int var29 = 0; var29 < class507.field7456; ++var29) {
                        var3[var29] = var4[var29] + -var5[var29];
                    }
                }
            } else {
                for (int var30 = 0; ~var30 > ~class507.field7456; ++var30) {
                    var3[var30] = var4[var30] - -var5[var30];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ng", name = "g", descriptor = "(I)V")
    public static void method1337(int arg0) {
        if (arg0 <= 37) {
            field3182 = -102;
        }
        field3178 = null;
    }

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "()V")
    public class226() {
        super(2, false);
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Llh;II)V")
    public final void method210(class365 arg0, int arg1, int arg2) {
        ++field3180;
        if (~arg2 != -1) {
            if (~arg2 == -2) {
                super.field3754 = arg0.method2099(arg1 + 30701) == 1;
            }
        } else {
            this.field3176 = arg0.method2099(255);
        }
        if (arg1 != -30446) {
            method1337(121);
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(II)[[I")
    public final int[][] method324(int arg0, int arg1) {
        if (arg0 < 75) {
            field3179 = 48;
        }
        ++field3177;
        int[][] var3 = super.field3757.method1450(arg1, -1);
        if (super.field3757.field3420) {
            int[][] var4 = this.method1568(5426, 0, arg1);
            int[][] var5 = this.method1568(5426, 1, arg1);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            int[] var12 = var5[0];
            int[] var13 = var5[1];
            int[] var14 = var5[2];
            int var15 = this.field3176;
            if (var15 != 1) {
                if (var15 != 2) {
                    if (var15 != 3) {
                        if (~var15 != -5) {
                            if (~var15 != -6) {
                                if (var15 != 6) {
                                    if (~var15 != -8) {
                                        if (~var15 != -9) {
                                            if (~var15 != -10) {
                                                if (~var15 != -11) {
                                                    if (var15 != 11) {
                                                        if (var15 == 12) {
                                                            for (int var16 = 0; ~class507.field7456 < ~var16; ++var16) {
                                                                int var17 = var12[var16];
                                                                int var18 = var13[var16];
                                                                int var19 = var9[var16];
                                                                int var20 = var14[var16];
                                                                int var21 = var10[var16];
                                                                int var22 = var11[var16];
                                                                var6[var16] = var17 + var19 + -(var17 * var19 >> 11);
                                                                var7[var16] = var21 - ((var18 * var21 >> 11) + -var18);
                                                                var8[var16] = var22 - -var20 + -(var20 * var22 >> 11);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var23 = 0; ~var23 > ~class507.field7456; ++var23) {
                                                            int var24 = var12[var23];
                                                            int var25 = var14[var23];
                                                            int var26 = var11[var23];
                                                            int var27 = var13[var23];
                                                            int var28 = var9[var23];
                                                            int var29 = var10[var23];
                                                            var6[var23] = var28 <= var24 ? -var28 + var24 : var28 - var24;
                                                            var7[var23] = var27 >= var29 ? -var29 + var27 : -var27 + var29;
                                                            var8[var23] = var26 <= var25 ? -var26 + var25 : -var25 + var26;
                                                        }
                                                    }
                                                } else {
                                                    for (int var30 = 0; class507.field7456 > var30; ++var30) {
                                                        int var31 = var12[var30];
                                                        int var32 = var11[var30];
                                                        int var33 = var10[var30];
                                                        int var34 = var9[var30];
                                                        int var35 = var13[var30];
                                                        int var36 = var14[var30];
                                                        var6[var30] = ~var31 > ~var34 ? var34 : var31;
                                                        var7[var30] = ~var33 >= ~var35 ? var35 : var33;
                                                        var8[var30] = var36 < var32 ? var32 : var36;
                                                    }
                                                }
                                            } else {
                                                for (int var37 = 0; ~class507.field7456 < ~var37; ++var37) {
                                                    int var38 = var9[var37];
                                                    int var39 = var14[var37];
                                                    int var40 = var10[var37];
                                                    int var41 = var12[var37];
                                                    int var42 = var13[var37];
                                                    int var43 = var11[var37];
                                                    var6[var37] = ~var41 < ~var38 ? var38 : var41;
                                                    var7[var37] = ~var42 < ~var40 ? var40 : var42;
                                                    var8[var37] = ~var39 < ~var43 ? var43 : var39;
                                                }
                                            }
                                        } else {
                                            for (int var44 = 0; ~var44 > ~class507.field7456; ++var44) {
                                                int var45 = var9[var44];
                                                int var46 = var11[var44];
                                                int var47 = var10[var44];
                                                var6[var44] = var45 == 0 ? 0 : -((-var12[var44] + 4096 << 12) / var45) + 4096;
                                                var7[var44] = ~var47 == -1 ? 0 : -((-var13[var44] + 4096 << 12) / var47) + 4096;
                                                var8[var44] = var46 == 0 ? 0 : -((-var14[var44] + 4096 << 12) / var46) + 4096;
                                            }
                                        }
                                    } else {
                                        for (int var48 = 0; class507.field7456 > var48; ++var48) {
                                            int var49 = var10[var48];
                                            int var50 = var9[var48];
                                            int var51 = var11[var48];
                                            var6[var48] = var50 != 4096 ? (var12[var48] << 12) / (-var50 + 4096) : 4096;
                                            var7[var48] = var49 == 4096 ? 4096 : (var13[var48] << 12) / (-var49 + 4096);
                                            var8[var48] = var51 != 4096 ? (var14[var48] << 12) / (-var51 + 4096) : 4096;
                                        }
                                    }
                                } else {
                                    for (int var52 = 0; var52 < class507.field7456; ++var52) {
                                        int var53 = var13[var52];
                                        int var54 = var14[var52];
                                        int var55 = var12[var52];
                                        var6[var52] = var55 >= 2048 ? -((-var9[var52] + 4096) * (-var55 + 4096) >> 11) + 4096 : var9[var52] * var55 >> 11;
                                        var7[var52] = ~var53 <= -2049 ? -((4096 - var10[var52]) * (4096 - var53) >> 11) + 4096 : var10[var52] * var53 >> 11;
                                        var8[var52] = ~var54 > -2049 ? var11[var52] * var54 >> 11 : -((4096 - var11[var52]) * (-var54 + 4096) >> 11) + 4096;
                                    }
                                }
                            } else {
                                for (int var56 = 0; class507.field7456 > var56; ++var56) {
                                    var6[var56] = 4096 - ((-var9[var56] + 4096) * (-var12[var56] + 4096) >> 12);
                                    var7[var56] = 4096 - ((-var10[var56] + 4096) * (-var13[var56] + 4096) >> 12);
                                    var8[var56] = -((4096 - var14[var56]) * (-var11[var56] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var57 = 0; ~class507.field7456 < ~var57; ++var57) {
                                int var58 = var13[var57];
                                int var59 = var14[var57];
                                int var60 = var12[var57];
                                var6[var57] = ~var60 != -1 ? (var9[var57] << 12) / var60 : 4096;
                                var7[var57] = ~var58 != -1 ? (var10[var57] << 12) / var58 : 4096;
                                var8[var57] = ~var59 != -1 ? (var11[var57] << 12) / var59 : 4096;
                            }
                        }
                    } else {
                        for (int var61 = 0; ~class507.field7456 < ~var61; ++var61) {
                            var6[var61] = var9[var61] * var12[var61] >> 12;
                            var7[var61] = var10[var61] * var13[var61] >> 12;
                            var8[var61] = var11[var61] * var14[var61] >> 12;
                        }
                    }
                } else {
                    for (int var62 = 0; var62 < class507.field7456; ++var62) {
                        var6[var62] = var9[var62] - var12[var62];
                        var7[var62] = var10[var62] + -var13[var62];
                        var8[var62] = var11[var62] + -var14[var62];
                    }
                }
            } else {
                for (int var63 = 0; ~var63 > ~class507.field7456; ++var63) {
                    var6[var63] = var9[var63] - -var12[var63];
                    var7[var63] = var10[var63] - -var13[var63];
                    var8[var63] = var11[var63] - -var14[var63];
                }
            }
        }
        return var3;
    }

    static {
        new class83("You do not have permission to kick users in this channel.", "Du darfst keine Benutzer aus diesem Chatraum rauswerfen.", "Vous n'êtes pas autorisé à expulser des utilisateurs de ce canal.", "Você não tem permissão para expulsar usuários neste canal.");
        field3178 = new class485(6, 0);
    }
}
