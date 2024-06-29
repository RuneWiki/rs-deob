import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class79 extends class194 {

    @OriginalMember(owner = "client!ie", name = "O", descriptor = "I")
    private int field966 = 6;

    @OriginalMember(owner = "client!ie", name = "L", descriptor = "[B")
    public static byte[] field963;

    @OriginalMember(owner = "client!ie", name = "Q", descriptor = "I")
    public static int field968;

    @OriginalMember(owner = "client!ie", name = "P", descriptor = "Lcq;")
    public static class72 field967;

    @OriginalMember(owner = "client!ie", name = "I", descriptor = "I")
    public static int field960;

    @OriginalMember(owner = "client!ie", name = "J", descriptor = "I")
    public static int field961;

    @OriginalMember(owner = "client!ie", name = "K", descriptor = "I")
    public static int field962;

    @OriginalMember(owner = "client!ie", name = "M", descriptor = "I")
    public static int field964;

    @OriginalMember(owner = "client!ie", name = "N", descriptor = "I")
    public static int field965;

    static {
        new class72("Unable to send message - system busy.", "Deine Nachricht konnte nicht verschickt werden, das System ist derzeit ausgelastet.", "Impossible d'envoyer un message - système occupé.", "Não foi possível enviar a mensagem. O sistema está ocupado.");
        int var0 = 0;
        field963 = new byte[32896];
        for (int var1 = 0; ~var1 > -257; ++var1) {
            for (int var2 = 0; var1 >= var2; ++var2) {
                field963[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + var2 * var2 + 65535) / 65535.0F))));
            }
        }
        field968 = 0;
        field967 = new class72("Started 3d Library", "3D-Softwarebibliothek gestartet.", "Librairie 3D démarrée", "Biblioteca 3D iniciada");
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(ILwo;Lwo;)V", line = 4)
    public static final void method501(int arg0, class285 arg1, class285 arg2) {
        class6.field58 = arg1;
        class449.field6281 = arg2;
        if (arg0 <= 29) {
            field963 = null;
        }
        ++field960;
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(II)[[I", line = 16)
    public final int[][] method59(int arg0, int arg1) {
        ++field964;
        int[][] var3 = super.field2283.method1667(arg1, arg0 ^ 681);
        if (arg0 != -730) {
            return null;
        } else {
            if (super.field2283.field3451) {
                int[][] var4 = this.method1200(60, arg1, 0);
                int[][] var5 = this.method1200(60, arg1, 1);
                int[] var6 = var3[0];
                int[] var7 = var3[1];
                int[] var8 = var3[2];
                int[] var9 = var4[0];
                int[] var10 = var4[1];
                int[] var11 = var4[2];
                int[] var12 = var5[0];
                int[] var13 = var5[1];
                int[] var14 = var5[2];
                int var15 = this.field966;
                if (var15 != 1) {
                    if (~var15 != -3) {
                        if (~var15 != -4) {
                            if (~var15 != -5) {
                                if (~var15 != -6) {
                                    if (var15 != 6) {
                                        if (var15 != 7) {
                                            if (var15 != 8) {
                                                if (~var15 != -10) {
                                                    if (var15 != 10) {
                                                        if (var15 != 11) {
                                                            if (var15 == 12) {
                                                                for (int var16 = 0; var16 < class138.field1579; ++var16) {
                                                                    int var17 = var14[var16];
                                                                    int var18 = var13[var16];
                                                                    int var19 = var10[var16];
                                                                    int var20 = var9[var16];
                                                                    int var21 = var12[var16];
                                                                    int var22 = var11[var16];
                                                                    var6[var16] = var20 - ((var20 * var21 >> 11) + -var21);
                                                                    var7[var16] = -(var18 * var19 >> 11) + var18 + var19;
                                                                    var8[var16] = var17 + var22 + -(var17 * var22 >> 11);
                                                                }
                                                            }
                                                        } else {
                                                            for (int var23 = 0; ~var23 > ~class138.field1579; ++var23) {
                                                                int var24 = var12[var23];
                                                                int var25 = var11[var23];
                                                                int var26 = var13[var23];
                                                                int var27 = var9[var23];
                                                                int var28 = var10[var23];
                                                                int var29 = var14[var23];
                                                                var6[var23] = ~var27 >= ~var24 ? -var27 + var24 : -var24 + var27;
                                                                var7[var23] = ~var28 < ~var26 ? -var26 + var28 : -var28 + var26;
                                                                var8[var23] = var25 > var29 ? var25 - var29 : -var25 + var29;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var30 = 0; class138.field1579 > var30; ++var30) {
                                                            int var31 = var10[var30];
                                                            int var32 = var11[var30];
                                                            int var33 = var14[var30];
                                                            int var34 = var12[var30];
                                                            int var35 = var13[var30];
                                                            int var36 = var9[var30];
                                                            var6[var30] = ~var36 < ~var34 ? var36 : var34;
                                                            var7[var30] = var31 <= var35 ? var35 : var31;
                                                            var8[var30] = var33 >= var32 ? var33 : var32;
                                                        }
                                                    }
                                                } else {
                                                    for (int var37 = 0; ~var37 > ~class138.field1579; ++var37) {
                                                        int var38 = var14[var37];
                                                        int var39 = var9[var37];
                                                        int var40 = var10[var37];
                                                        int var41 = var13[var37];
                                                        int var42 = var11[var37];
                                                        int var43 = var12[var37];
                                                        var6[var37] = var39 < var43 ? var39 : var43;
                                                        var7[var37] = ~var41 < ~var40 ? var40 : var41;
                                                        var8[var37] = var38 > var42 ? var42 : var38;
                                                    }
                                                }
                                            } else {
                                                for (int var44 = 0; ~var44 > ~class138.field1579; ++var44) {
                                                    int var45 = var10[var44];
                                                    int var46 = var9[var44];
                                                    int var47 = var11[var44];
                                                    var6[var44] = ~var46 == -1 ? 0 : -((-var12[var44] + 4096 << 12) / var46) + 4096;
                                                    var7[var44] = var45 == 0 ? 0 : -((4096 - var13[var44] << 12) / var45) + 4096;
                                                    var8[var44] = ~var47 != -1 ? 4096 - (-var14[var44] + 4096 << 12) / var47 : 0;
                                                }
                                            }
                                        } else {
                                            for (int var48 = 0; class138.field1579 > var48; ++var48) {
                                                int var49 = var10[var48];
                                                int var50 = var9[var48];
                                                int var51 = var11[var48];
                                                var6[var48] = ~var50 != -4097 ? (var12[var48] << 12) / (4096 - var50) : 4096;
                                                var7[var48] = ~var49 == -4097 ? 4096 : (var13[var48] << 12) / (4096 - var49);
                                                var8[var48] = ~var51 != -4097 ? (var14[var48] << 12) / (-var51 + 4096) : 4096;
                                            }
                                        }
                                    } else {
                                        for (int var52 = 0; var52 < class138.field1579; ++var52) {
                                            int var53 = var12[var52];
                                            int var54 = var14[var52];
                                            int var55 = var13[var52];
                                            var6[var52] = ~var53 > -2049 ? var9[var52] * var53 >> 11 : -((-var9[var52] + 4096) * (-var53 + 4096) >> 11) + 4096;
                                            var7[var52] = var55 >= 2048 ? -((4096 - var10[var52]) * (-var55 + 4096) >> 11) + 4096 : var10[var52] * var55 >> 11;
                                            var8[var52] = ~var54 <= -2049 ? -((4096 - var11[var52]) * (-var54 + 4096) >> 11) + 4096 : var11[var52] * var54 >> 11;
                                        }
                                    }
                                } else {
                                    for (int var56 = 0; var56 < class138.field1579; ++var56) {
                                        var6[var56] = 4096 - ((4096 - var9[var56]) * (-var12[var56] + 4096) >> 12);
                                        var7[var56] = -((-var10[var56] + 4096) * (-var13[var56] + 4096) >> 12) + 4096;
                                        var8[var56] = 4096 - ((4096 - var14[var56]) * (-var11[var56] + 4096) >> 12);
                                    }
                                }
                            } else {
                                for (int var57 = 0; class138.field1579 > var57; ++var57) {
                                    int var58 = var13[var57];
                                    int var59 = var12[var57];
                                    int var60 = var14[var57];
                                    var6[var57] = ~var59 == -1 ? 4096 : (var9[var57] << 12) / var59;
                                    var7[var57] = var58 != 0 ? (var10[var57] << 12) / var58 : 4096;
                                    var8[var57] = ~var60 == -1 ? 4096 : (var11[var57] << 12) / var60;
                                }
                            }
                        } else {
                            for (int var61 = 0; class138.field1579 > var61; ++var61) {
                                var6[var61] = var9[var61] * var12[var61] >> 12;
                                var7[var61] = var10[var61] * var13[var61] >> 12;
                                var8[var61] = var11[var61] * var14[var61] >> 12;
                            }
                        }
                    } else {
                        for (int var62 = 0; ~class138.field1579 < ~var62; ++var62) {
                            var6[var62] = var9[var62] + -var12[var62];
                            var7[var62] = var10[var62] + -var13[var62];
                            var8[var62] = var11[var62] - var14[var62];
                        }
                    }
                } else {
                    for (int var63 = 0; ~class138.field1579 < ~var63; ++var63) {
                        var6[var63] = var9[var63] + var12[var63];
                        var7[var63] = var10[var63] - -var13[var63];
                        var8[var63] = var11[var63] + var14[var63];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IB)V", line = 335)
    public static final void method502(int arg0, byte arg1) {
        ++field962;
        class394.field5366 = arg0;
        class157.field1832 = -1;
        class157.field1832 = -1;
        class211.method1291(131072);
        if (arg1 != 55) {
            method501(99, (class285) null, (class285) null);
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IILbg;)V", line = 351)
    public final void method54(int arg0, int arg1, class242 arg2) {
        ++field961;
        int var4 = 124 % ((52 - arg1) / 61);
        if (arg0 != 0) {
            if (arg0 == 1) {
                super.field2278 = arg2.method1563(-128) == 1;
            }
        } else {
            this.field966 = arg2.method1563(-128);
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(II)[I", line = 393)
    public final int[] method55(int arg0, int arg1) {
        ++field965;
        int[] var3 = super.field2292.method1781(arg0, false);
        int var4 = -103 % ((57 - arg1) / 46);
        if (super.field2292.field3708) {
            int[] var5 = this.method1203(0, 127, arg0);
            int[] var6 = this.method1203(1, 94, arg0);
            int var7 = this.field966;
            if (var7 != 1) {
                if (var7 != 2) {
                    if (~var7 != -4) {
                        if (~var7 != -5) {
                            if (var7 != 5) {
                                if (~var7 != -7) {
                                    if (var7 != 7) {
                                        if (var7 != 8) {
                                            if (~var7 != -10) {
                                                if (~var7 != -11) {
                                                    if (~var7 != -12) {
                                                        if (~var7 == -13) {
                                                            for (int var8 = 0; ~var8 > ~class138.field1579; ++var8) {
                                                                int var9 = var5[var8];
                                                                int var10 = var6[var8];
                                                                var3[var8] = var9 + var10 - (var9 * var10 >> 11);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var11 = 0; class138.field1579 > var11; ++var11) {
                                                            int var12 = var6[var11];
                                                            int var13 = var5[var11];
                                                            var3[var11] = var13 <= var12 ? -var13 + var12 : -var12 + var13;
                                                        }
                                                    }
                                                } else {
                                                    for (int var14 = 0; ~class138.field1579 < ~var14; ++var14) {
                                                        int var15 = var5[var14];
                                                        int var16 = var6[var14];
                                                        var3[var14] = ~var15 >= ~var16 ? var16 : var15;
                                                    }
                                                }
                                            } else {
                                                for (int var17 = 0; var17 < class138.field1579; ++var17) {
                                                    int var18 = var6[var17];
                                                    int var19 = var5[var17];
                                                    var3[var17] = var19 >= var18 ? var18 : var19;
                                                }
                                            }
                                        } else {
                                            for (int var20 = 0; var20 < class138.field1579; ++var20) {
                                                int var21 = var5[var20];
                                                var3[var20] = var21 != 0 ? -((-var6[var20] + 4096 << 12) / var21) + 4096 : 0;
                                            }
                                        }
                                    } else {
                                        for (int var22 = 0; ~class138.field1579 < ~var22; ++var22) {
                                            int var23 = var5[var22];
                                            var3[var22] = ~var23 == -4097 ? 4096 : (var6[var22] << 12) / (4096 - var23);
                                        }
                                    }
                                } else {
                                    for (int var24 = 0; ~class138.field1579 < ~var24; ++var24) {
                                        int var25 = var6[var24];
                                        var3[var24] = var25 < 2048 ? var5[var24] * var25 >> 11 : -((-var5[var24] + 4096) * (-var25 + 4096) >> 11) + 4096;
                                    }
                                }
                            } else {
                                for (int var26 = 0; ~class138.field1579 < ~var26; ++var26) {
                                    var3[var26] = -((4096 - var6[var26]) * (-var5[var26] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var27 = 0; class138.field1579 > var27; ++var27) {
                                int var28 = var6[var27];
                                var3[var27] = ~var28 == -1 ? 4096 : (var5[var27] << 12) / var28;
                            }
                        }
                    } else {
                        for (int var29 = 0; class138.field1579 > var29; ++var29) {
                            var3[var29] = var5[var29] * var6[var29] >> 12;
                        }
                    }
                } else {
                    for (int var30 = 0; ~class138.field1579 < ~var30; ++var30) {
                        var3[var30] = var5[var30] - var6[var30];
                    }
                }
            } else {
                for (int var31 = 0; ~var31 > ~class138.field1579; ++var31) {
                    var3[var31] = var5[var31] + var6[var31];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ie", name = "h", descriptor = "(I)V", line = 635)
    public static void method503(int arg0) {
        if (arg0 == 0) {
            field963 = null;
            field967 = null;
        }
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "()V", line = 646)
    public class79() {
        super(2, false);
    }
}
