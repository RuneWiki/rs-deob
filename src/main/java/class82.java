import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ju")
public class class82 extends class136 {

    @OriginalMember(owner = "client!ju", name = "J", descriptor = "I")
    private int field1115 = 6;

    @OriginalMember(owner = "client!ju", name = "I", descriptor = "Lsl;")
    public static class318 field1114 = new class318(32, -1);

    @OriginalMember(owner = "client!ju", name = "C", descriptor = "I")
    public static int field1109;

    @OriginalMember(owner = "client!ju", name = "D", descriptor = "I")
    public static int field1110;

    @OriginalMember(owner = "client!ju", name = "E", descriptor = "I")
    public static int field1111;

    @OriginalMember(owner = "client!ju", name = "G", descriptor = "I")
    public static int field1112;

    @OriginalMember(owner = "client!ju", name = "H", descriptor = "Lcn;")
    public static class355 field1113;

    @OriginalMember(owner = "client!ju", name = "K", descriptor = "Lfs;")
    public static class387 field1116;

    @OriginalMember(owner = "client!ju", name = "f", descriptor = "(I)V", line = 3)
    public static void method738(int arg0) {
        field1116 = null;
        field1113 = null;
        field1114 = null;
        if (arg0 != 31444) {
            method738(-52);
        }
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(BI)[[I", line = 18)
    public final int[][] method272(byte arg0, int arg1) {
        ++field1111;
        if (arg0 <= 33) {
            return null;
        } else {
            int[][] var3 = super.field1952.method3127((byte) -103, arg1);
            if (super.field1952.field7770) {
                int[][] var4 = this.method1036(3, 0, arg1);
                int[][] var5 = this.method1036(3, 1, arg1);
                int[] var6 = var3[0];
                int[] var7 = var3[1];
                int[] var8 = var3[2];
                int[] var9 = var4[0];
                int[] var10 = var4[1];
                int[] var11 = var4[2];
                int[] var12 = var5[0];
                int[] var13 = var5[1];
                int[] var14 = var5[2];
                int var15 = this.field1115;
                if (var15 != 1) {
                    if (var15 != 2) {
                        if (~var15 != -4) {
                            if (var15 != 4) {
                                if (~var15 != -6) {
                                    if (var15 != 6) {
                                        if (var15 != 7) {
                                            if (~var15 != -9) {
                                                if (var15 != 9) {
                                                    if (~var15 != -11) {
                                                        if (~var15 != -12) {
                                                            if (var15 == 12) {
                                                                for (int var16 = 0; ~class467.field6889 < ~var16; ++var16) {
                                                                    int var17 = var13[var16];
                                                                    int var18 = var10[var16];
                                                                    int var19 = var9[var16];
                                                                    int var20 = var12[var16];
                                                                    int var21 = var11[var16];
                                                                    int var22 = var14[var16];
                                                                    var6[var16] = -(var19 * var20 >> 11) + var19 - -var20;
                                                                    var7[var16] = var17 + var18 - (var17 * var18 >> 11);
                                                                    var8[var16] = var21 + var22 + -(var21 * var22 >> 11);
                                                                }
                                                            }
                                                        } else {
                                                            for (int var23 = 0; ~var23 > ~class467.field6889; ++var23) {
                                                                int var24 = var14[var23];
                                                                int var25 = var9[var23];
                                                                int var26 = var12[var23];
                                                                int var27 = var13[var23];
                                                                int var28 = var11[var23];
                                                                int var29 = var10[var23];
                                                                var6[var23] = var26 < var25 ? -var26 + var25 : -var25 + var26;
                                                                var7[var23] = ~var27 > ~var29 ? -var27 + var29 : var27 - var29;
                                                                var8[var23] = var24 >= var28 ? -var28 + var24 : var28 - var24;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var30 = 0; ~class467.field6889 < ~var30; ++var30) {
                                                            int var31 = var13[var30];
                                                            int var32 = var12[var30];
                                                            int var33 = var11[var30];
                                                            int var34 = var14[var30];
                                                            int var35 = var9[var30];
                                                            int var36 = var10[var30];
                                                            var6[var30] = ~var32 > ~var35 ? var35 : var32;
                                                            var7[var30] = ~var36 < ~var31 ? var36 : var31;
                                                            var8[var30] = ~var33 >= ~var34 ? var34 : var33;
                                                        }
                                                    }
                                                } else {
                                                    for (int var37 = 0; ~var37 > ~class467.field6889; ++var37) {
                                                        int var38 = var13[var37];
                                                        int var39 = var11[var37];
                                                        int var40 = var9[var37];
                                                        int var41 = var12[var37];
                                                        int var42 = var14[var37];
                                                        int var43 = var10[var37];
                                                        var6[var37] = var40 >= var41 ? var41 : var40;
                                                        var7[var37] = var43 < var38 ? var43 : var38;
                                                        var8[var37] = var39 < var42 ? var39 : var42;
                                                    }
                                                }
                                            } else {
                                                for (int var44 = 0; class467.field6889 > var44; ++var44) {
                                                    int var45 = var9[var44];
                                                    int var46 = var10[var44];
                                                    int var47 = var11[var44];
                                                    var6[var44] = var45 != 0 ? -((-var12[var44] + 4096 << 12) / var45) + 4096 : 0;
                                                    var7[var44] = var46 == 0 ? 0 : 4096 - (4096 - var13[var44] << 12) / var46;
                                                    var8[var44] = var47 == 0 ? 0 : -((4096 - var14[var44] << 12) / var47) + 4096;
                                                }
                                            }
                                        } else {
                                            for (int var48 = 0; ~var48 > ~class467.field6889; ++var48) {
                                                int var49 = var10[var48];
                                                int var50 = var9[var48];
                                                int var51 = var11[var48];
                                                var6[var48] = ~var50 == -4097 ? 4096 : (var12[var48] << 12) / (-var50 + 4096);
                                                var7[var48] = var49 == 4096 ? 4096 : (var13[var48] << 12) / (4096 - var49);
                                                var8[var48] = var51 == 4096 ? 4096 : (var14[var48] << 12) / (4096 - var51);
                                            }
                                        }
                                    } else {
                                        for (int var52 = 0; class467.field6889 > var52; ++var52) {
                                            int var53 = var13[var52];
                                            int var54 = var12[var52];
                                            int var55 = var14[var52];
                                            var6[var52] = var54 < 2048 ? var9[var52] * var54 >> 11 : -((-var9[var52] + 4096) * (-var54 + 4096) >> 11) + 4096;
                                            var7[var52] = var53 >= 2048 ? -((-var10[var52] + 4096) * (-var53 + 4096) >> 11) + 4096 : var10[var52] * var53 >> 11;
                                            var8[var52] = var55 < 2048 ? var11[var52] * var55 >> 11 : -((4096 - var11[var52]) * (-var55 + 4096) >> 11) + 4096;
                                        }
                                    }
                                } else {
                                    for (int var56 = 0; class467.field6889 > var56; ++var56) {
                                        var6[var56] = -((-var9[var56] + 4096) * (-var12[var56] + 4096) >> 12) + 4096;
                                        var7[var56] = -((4096 - var10[var56]) * (4096 - var13[var56]) >> 12) + 4096;
                                        var8[var56] = -((-var11[var56] + 4096) * (-var14[var56] + 4096) >> 12) + 4096;
                                    }
                                }
                            } else {
                                for (int var57 = 0; var57 < class467.field6889; ++var57) {
                                    int var58 = var12[var57];
                                    int var59 = var13[var57];
                                    int var60 = var14[var57];
                                    var6[var57] = ~var58 != -1 ? (var9[var57] << 12) / var58 : 4096;
                                    var7[var57] = ~var59 != -1 ? (var10[var57] << 12) / var59 : 4096;
                                    var8[var57] = var60 != 0 ? (var11[var57] << 12) / var60 : 4096;
                                }
                            }
                        } else {
                            for (int var61 = 0; var61 < class467.field6889; ++var61) {
                                var6[var61] = var9[var61] * var12[var61] >> 12;
                                var7[var61] = var10[var61] * var13[var61] >> 12;
                                var8[var61] = var11[var61] * var14[var61] >> 12;
                            }
                        }
                    } else {
                        for (int var62 = 0; class467.field6889 > var62; ++var62) {
                            var6[var62] = var9[var62] + -var12[var62];
                            var7[var62] = var10[var62] + -var13[var62];
                            var8[var62] = var11[var62] - var14[var62];
                        }
                    }
                } else {
                    for (int var63 = 0; ~class467.field6889 < ~var63; ++var63) {
                        var6[var63] = var9[var63] - -var12[var63];
                        var7[var63] = var10[var63] + var13[var63];
                        var8[var63] = var11[var63] - -var14[var63];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(IILiv;)V", line = 333)
    public final void method268(int arg0, int arg1, class65 arg2) {
        ++field1112;
        if (arg0 != 4) {
            method738(3);
        }
        if (~arg1 != -1) {
            if (arg1 == 1) {
                super.field1966 = ~arg2.method577(255) == -2;
            }
        } else {
            this.field1115 = arg2.method577(255);
        }
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(II)[I", line = 367)
    public final int[] method82(int arg0, int arg1) {
        int var3 = -84 % ((arg0 - 67) / 50);
        ++field1109;
        int[] var4 = super.field1957.method2887((byte) -112, arg1);
        if (super.field1957.field7031) {
            int[] var5 = this.method1033(arg1, 0, 0);
            int[] var6 = this.method1033(arg1, 1, 0);
            int var7 = this.field1115;
            if (var7 != 1) {
                if (var7 != 2) {
                    if (var7 != 3) {
                        if (var7 != 4) {
                            if (var7 != 5) {
                                if (~var7 != -7) {
                                    if (~var7 != -8) {
                                        if (var7 != 8) {
                                            if (var7 != 9) {
                                                if (var7 != 10) {
                                                    if (var7 != 11) {
                                                        if (~var7 == -13) {
                                                            for (int var8 = 0; ~var8 > ~class467.field6889; ++var8) {
                                                                int var9 = var5[var8];
                                                                int var10 = var6[var8];
                                                                var4[var8] = -(var9 * var10 >> 11) + var9 - -var10;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var11 = 0; ~class467.field6889 < ~var11; ++var11) {
                                                            int var12 = var5[var11];
                                                            int var13 = var6[var11];
                                                            var4[var11] = ~var13 > ~var12 ? -var13 + var12 : -var12 + var13;
                                                        }
                                                    }
                                                } else {
                                                    for (int var14 = 0; var14 < class467.field6889; ++var14) {
                                                        int var15 = var5[var14];
                                                        int var16 = var6[var14];
                                                        var4[var14] = ~var15 >= ~var16 ? var16 : var15;
                                                    }
                                                }
                                            } else {
                                                for (int var17 = 0; var17 < class467.field6889; ++var17) {
                                                    int var18 = var6[var17];
                                                    int var19 = var5[var17];
                                                    var4[var17] = var18 <= var19 ? var18 : var19;
                                                }
                                            }
                                        } else {
                                            for (int var20 = 0; class467.field6889 > var20; ++var20) {
                                                int var21 = var5[var20];
                                                var4[var20] = ~var21 != -1 ? 4096 - (4096 - var6[var20] << 12) / var21 : 0;
                                            }
                                        }
                                    } else {
                                        for (int var22 = 0; var22 < class467.field6889; ++var22) {
                                            int var23 = var5[var22];
                                            var4[var22] = ~var23 == -4097 ? 4096 : (var6[var22] << 12) / (-var23 + 4096);
                                        }
                                    }
                                } else {
                                    for (int var24 = 0; var24 < class467.field6889; ++var24) {
                                        int var25 = var6[var24];
                                        var4[var24] = var25 >= 2048 ? -((-var5[var24] + 4096) * (-var25 + 4096) >> 11) + 4096 : var5[var24] * var25 >> 11;
                                    }
                                }
                            } else {
                                for (int var26 = 0; class467.field6889 > var26; ++var26) {
                                    var4[var26] = -((-var5[var26] + 4096) * (-var6[var26] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var27 = 0; ~class467.field6889 < ~var27; ++var27) {
                                int var28 = var6[var27];
                                var4[var27] = var28 != 0 ? (var5[var27] << 12) / var28 : 4096;
                            }
                        }
                    } else {
                        for (int var29 = 0; class467.field6889 > var29; ++var29) {
                            var4[var29] = var5[var29] * var6[var29] >> 12;
                        }
                    }
                } else {
                    for (int var30 = 0; class467.field6889 > var30; ++var30) {
                        var4[var30] = var5[var30] + -var6[var30];
                    }
                }
            } else {
                for (int var31 = 0; ~var31 > ~class467.field6889; ++var31) {
                    var4[var31] = var5[var31] + var6[var31];
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(Let;ILjava/lang/String;I)Lqt;", line = 608)
    public static final class449 method739(class419 arg0, int arg1, String arg2, int arg3) {
        ++field1110;
        if (~arg1 == -1) {
            return arg0.method2567(arg2, 14);
        } else {
            if (arg3 <= 116) {
                field1116 = null;
            }
            if (arg1 == 1) {
                try {
                    class505.method3015((byte) 17, arg0.field6180, "openjs", new Object[] { (new URL(arg0.field6180.getCodeBase(), arg2)).toString() });
                    class449 var4 = new class449();
                    var4.field6617 = 1;
                    return var4;
                } catch (Throwable var10) {
                    class449 var5 = new class449();
                    var5.field6617 = 2;
                    return var5;
                }
            } else if (~arg1 == -3) {
                try {
                    arg0.field6180.getAppletContext().showDocument(new URL(arg0.field6180.getCodeBase(), arg2), "_blank");
                    class449 var6 = new class449();
                    var6.field6617 = 1;
                    return var6;
                } catch (Exception var11) {
                    class449 var7 = new class449();
                    var7.field6617 = 2;
                    return var7;
                }
            } else if (arg1 == 3) {
                try {
                    class505.method3017(arg0.field6180, "loggedout", 90);
                } catch (Throwable var13) {
                }
                try {
                    arg0.field6180.getAppletContext().showDocument(new URL(arg0.field6180.getCodeBase(), arg2), "_top");
                    class449 var8 = new class449();
                    var8.field6617 = 1;
                    return var8;
                } catch (Exception var12) {
                    class449 var9 = new class449();
                    var9.field6617 = 2;
                    return var9;
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(Lqc;)V", line = 684)
    public static final void method740(class521 arg0) {
        if (class122.field1791 < 65535) {
            class124 var1 = arg0.field7653;
            class9.field115[class122.field1791] = arg0;
            class181.field2543[class122.field1791] = false;
            ++class122.field1791;
            int var2 = arg0.field7662;
            if (arg0.field7668) {
                var2 = 0;
            }
            int var3 = arg0.field7662;
            if (arg0.field7667) {
                var3 = class308.field4395 - 1;
            }
            for (int var4 = var2; var4 <= var3; ++var4) {
                int var5 = 0;
                int var6 = var1.method983((byte) -77) - var1.method984(79) + class47.field517 >> class527.field7754;
                if (var6 < 0) {
                    var5 -= var6;
                    var6 = 0;
                }
                int var7 = var1.method983((byte) -38) + var1.method984(80) - class47.field517 >> class527.field7754;
                if (var7 >= class497.field7388) {
                    var7 = class497.field7388 - 1;
                }
                for (int var8 = var6; var8 <= var7; ++var8) {
                    short var9 = arg0.field7648[var5++];
                    int var10 = (var1.method980(false) - var1.method984(104) + class47.field517 >> class527.field7754) + (var9 >>> 8);
                    int var11 = (var9 & 255) + var10 - 1;
                    if (var10 < 0) {
                        var10 = 0;
                    }
                    if (var11 >= class241.field3562) {
                        var11 = class241.field3562 - 1;
                    }
                    for (int var12 = var10; var12 <= var11; ++var12) {
                        long var13 = class270.field3980[var4][var12][var8];
                        if ((var13 & 65535L) == 0L) {
                            class270.field3980[var4][var12][var8] = var13 | (long) class122.field1791;
                        } else if ((var13 & 4294901760L) == 0L) {
                            class270.field3980[var4][var12][var8] = var13 | (long) class122.field1791 << 16;
                        } else if ((var13 & 281470681743360L) == 0L) {
                            class270.field3980[var4][var12][var8] = var13 | (long) class122.field1791 << 32;
                        } else if ((var13 & -281474976710656L) == 0L) {
                            class270.field3980[var4][var12][var8] = var13 | (long) class122.field1791 << 48;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ju", name = "<init>", descriptor = "()V", line = 776)
    public class82() {
        super(2, false);
    }
}
