import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jja")
public class class469 extends class601 {

    @OriginalMember(owner = "client!jja", name = "G", descriptor = "I")
    private int field6104 = 6;

    @OriginalMember(owner = "client!jja", name = "L", descriptor = "[[I")
    public static int[][] field6109 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

    @OriginalMember(owner = "client!jja", name = "M", descriptor = "Z")
    public static boolean field6110 = false;

    @OriginalMember(owner = "client!jja", name = "K", descriptor = "Liea;")
    public static class12 field6108 = new class12();

    @OriginalMember(owner = "client!jja", name = "F", descriptor = "I")
    public static int field6103;

    @OriginalMember(owner = "client!jja", name = "H", descriptor = "I")
    public static int field6105;

    @OriginalMember(owner = "client!jja", name = "I", descriptor = "I")
    public static int field6106;

    @OriginalMember(owner = "client!jja", name = "N", descriptor = "I")
    public static int field6111;

    @OriginalMember(owner = "client!jja", name = "O", descriptor = "I")
    public static int field6112;

    @OriginalMember(owner = "client!jja", name = "J", descriptor = "J")
    public static long field6107;

    @OriginalMember(owner = "client!jja", name = "a", descriptor = "(Lmc;II)V", line = 3)
    public final void method259(class234 arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            if (~arg1 == -2) {
                super.field7646 = arg0.method1509(true) == 1;
            }
        } else {
            this.field6104 = arg0.method1509(true);
        }
        int var5 = -49 / ((arg2 - 40) / 52);
        ++field6112;
    }

    @OriginalMember(owner = "client!jja", name = "f", descriptor = "(I)V", line = 39)
    public static void method2651(int arg0) {
        if (arg0 == 4096) {
            field6108 = null;
            field6109 = null;
        }
    }

    @OriginalMember(owner = "client!jja", name = "b", descriptor = "(II)[[I", line = 50)
    public final int[][] method638(int arg0, int arg1) {
        ++field6103;
        int[][] var3 = super.field7647.method3510((byte) -51, arg1);
        if (arg0 != 2017) {
            field6107 = 45L;
        }
        if (super.field7647.field8306) {
            int[][] var4 = this.method3247((byte) -126, 0, arg1);
            int[][] var5 = this.method3247((byte) -105, 1, arg1);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            int[] var12 = var5[0];
            int[] var13 = var5[1];
            int[] var14 = var5[2];
            int var15 = this.field6104;
            if (var15 != 1) {
                if (~var15 != -3) {
                    if (~var15 != -4) {
                        if (~var15 != -5) {
                            if (~var15 != -6) {
                                if (var15 != 6) {
                                    if (~var15 != -8) {
                                        if (~var15 != -9) {
                                            if (var15 != 9) {
                                                if (var15 != 10) {
                                                    if (var15 != 11) {
                                                        if (var15 == 12) {
                                                            for (int var16 = 0; var16 < class418.field5518; ++var16) {
                                                                int var17 = var10[var16];
                                                                int var18 = var11[var16];
                                                                int var19 = var13[var16];
                                                                int var20 = var14[var16];
                                                                int var21 = var9[var16];
                                                                int var22 = var12[var16];
                                                                var6[var16] = var21 - (var21 * var22 >> 11) + var22;
                                                                var7[var16] = var17 - -var19 - (var17 * var19 >> 11);
                                                                var8[var16] = -(var18 * var20 >> 11) + var20 + var18;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var23 = 0; class418.field5518 > var23; ++var23) {
                                                            int var24 = var11[var23];
                                                            int var25 = var12[var23];
                                                            int var26 = var10[var23];
                                                            int var27 = var14[var23];
                                                            int var28 = var13[var23];
                                                            int var29 = var9[var23];
                                                            var6[var23] = var25 < var29 ? -var25 + var29 : var25 - var29;
                                                            var7[var23] = var28 < var26 ? -var28 + var26 : var28 - var26;
                                                            var8[var23] = ~var24 < ~var27 ? -var27 + var24 : var27 - var24;
                                                        }
                                                    }
                                                } else {
                                                    for (int var30 = 0; ~var30 > ~class418.field5518; ++var30) {
                                                        int var31 = var13[var30];
                                                        int var32 = var14[var30];
                                                        int var33 = var10[var30];
                                                        int var34 = var12[var30];
                                                        int var35 = var11[var30];
                                                        int var36 = var9[var30];
                                                        var6[var30] = ~var34 <= ~var36 ? var34 : var36;
                                                        var7[var30] = ~var31 > ~var33 ? var33 : var31;
                                                        var8[var30] = var35 > var32 ? var35 : var32;
                                                    }
                                                }
                                            } else {
                                                for (int var37 = 0; ~var37 > ~class418.field5518; ++var37) {
                                                    int var38 = var14[var37];
                                                    int var39 = var12[var37];
                                                    int var40 = var11[var37];
                                                    int var41 = var10[var37];
                                                    int var42 = var13[var37];
                                                    int var43 = var9[var37];
                                                    var6[var37] = ~var39 >= ~var43 ? var39 : var43;
                                                    var7[var37] = var42 > var41 ? var41 : var42;
                                                    var8[var37] = ~var38 < ~var40 ? var40 : var38;
                                                }
                                            }
                                        } else {
                                            for (int var44 = 0; ~class418.field5518 < ~var44; ++var44) {
                                                int var45 = var11[var44];
                                                int var46 = var9[var44];
                                                int var47 = var10[var44];
                                                var6[var44] = var46 != 0 ? -((4096 - var12[var44] << 12) / var46) + 4096 : 0;
                                                var7[var44] = ~var47 != -1 ? -((-var13[var44] + 4096 << 12) / var47) + 4096 : 0;
                                                var8[var44] = ~var45 != -1 ? -((-var14[var44] + 4096 << 12) / var45) + 4096 : 0;
                                            }
                                        }
                                    } else {
                                        for (int var48 = 0; ~var48 > ~class418.field5518; ++var48) {
                                            int var49 = var11[var48];
                                            int var50 = var10[var48];
                                            int var51 = var9[var48];
                                            var6[var48] = var51 == 4096 ? 4096 : (var12[var48] << 12) / (-var51 + 4096);
                                            var7[var48] = ~var50 == -4097 ? 4096 : (var13[var48] << 12) / (4096 - var50);
                                            var8[var48] = ~var49 == -4097 ? 4096 : (var14[var48] << 12) / (-var49 + 4096);
                                        }
                                    }
                                } else {
                                    for (int var52 = 0; ~class418.field5518 < ~var52; ++var52) {
                                        int var53 = var14[var52];
                                        int var54 = var12[var52];
                                        int var55 = var13[var52];
                                        var6[var52] = ~var54 <= -2049 ? 4096 - ((-var9[var52] + 4096) * (-var54 + 4096) >> 11) : var9[var52] * var54 >> 11;
                                        var7[var52] = ~var55 > -2049 ? var10[var52] * var55 >> 11 : 4096 - ((4096 - var10[var52]) * (4096 - var55) >> 11);
                                        var8[var52] = var53 >= 2048 ? -((-var11[var52] + 4096) * (-var53 + 4096) >> 11) + 4096 : var11[var52] * var53 >> 11;
                                    }
                                }
                            } else {
                                for (int var56 = 0; ~class418.field5518 < ~var56; ++var56) {
                                    var6[var56] = -((4096 - var12[var56]) * (-var9[var56] + 4096) >> 12) + 4096;
                                    var7[var56] = 4096 - ((-var10[var56] + 4096) * (-var13[var56] + 4096) >> 12);
                                    var8[var56] = 4096 - ((4096 - var14[var56]) * (-var11[var56] + 4096) >> 12);
                                }
                            }
                        } else {
                            for (int var57 = 0; var57 < class418.field5518; ++var57) {
                                int var58 = var12[var57];
                                int var59 = var13[var57];
                                int var60 = var14[var57];
                                var6[var57] = var58 != 0 ? (var9[var57] << 12) / var58 : 4096;
                                var7[var57] = var59 == 0 ? 4096 : (var10[var57] << 12) / var59;
                                var8[var57] = ~var60 != -1 ? (var11[var57] << 12) / var60 : 4096;
                            }
                        }
                    } else {
                        for (int var61 = 0; ~class418.field5518 < ~var61; ++var61) {
                            var6[var61] = var9[var61] * var12[var61] >> 12;
                            var7[var61] = var10[var61] * var13[var61] >> 12;
                            var8[var61] = var11[var61] * var14[var61] >> 12;
                        }
                    }
                } else {
                    for (int var62 = 0; ~var62 > ~class418.field5518; ++var62) {
                        var6[var62] = var9[var62] + -var12[var62];
                        var7[var62] = var10[var62] + -var13[var62];
                        var8[var62] = var11[var62] + -var14[var62];
                    }
                }
            } else {
                for (int var63 = 0; ~class418.field5518 < ~var63; ++var63) {
                    var6[var63] = var9[var63] + var12[var63];
                    var7[var63] = var10[var63] + var13[var63];
                    var8[var63] = var11[var63] + var14[var63];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jja", name = "a", descriptor = "(IB)[I", line = 369)
    public final int[] method261(int arg0, byte arg1) {
        if (arg1 >= -76) {
            this.field6104 = 50;
        }
        ++field6111;
        int[] var3 = super.field7643.method2054(arg0, 9986);
        if (super.field7643.field4364) {
            int[] var4 = this.method3243(arg0, 27123, 0);
            int[] var5 = this.method3243(arg0, 27123, 1);
            int var6 = this.field6104;
            if (~var6 != -2) {
                if (var6 != 2) {
                    if (var6 != 3) {
                        if (~var6 != -5) {
                            if (var6 != 5) {
                                if (~var6 != -7) {
                                    if (~var6 != -8) {
                                        if (~var6 != -9) {
                                            if (var6 != 9) {
                                                if (~var6 != -11) {
                                                    if (~var6 != -12) {
                                                        if (var6 == 12) {
                                                            for (int var7 = 0; var7 < class418.field5518; ++var7) {
                                                                int var8 = var4[var7];
                                                                int var9 = var5[var7];
                                                                var3[var7] = -(var8 * var9 >> 11) + var8 - -var9;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var10 = 0; class418.field5518 > var10; ++var10) {
                                                            int var11 = var4[var10];
                                                            int var12 = var5[var10];
                                                            var3[var10] = var11 > var12 ? var11 - var12 : -var11 + var12;
                                                        }
                                                    }
                                                } else {
                                                    for (int var13 = 0; ~class418.field5518 < ~var13; ++var13) {
                                                        int var14 = var4[var13];
                                                        int var15 = var5[var13];
                                                        var3[var13] = var15 < var14 ? var14 : var15;
                                                    }
                                                }
                                            } else {
                                                for (int var16 = 0; var16 < class418.field5518; ++var16) {
                                                    int var17 = var5[var16];
                                                    int var18 = var4[var16];
                                                    var3[var16] = ~var17 >= ~var18 ? var17 : var18;
                                                }
                                            }
                                        } else {
                                            for (int var19 = 0; class418.field5518 > var19; ++var19) {
                                                int var20 = var4[var19];
                                                var3[var19] = ~var20 != -1 ? -((-var5[var19] + 4096 << 12) / var20) + 4096 : 0;
                                            }
                                        }
                                    } else {
                                        for (int var21 = 0; var21 < class418.field5518; ++var21) {
                                            int var22 = var4[var21];
                                            var3[var21] = ~var22 != -4097 ? (var5[var21] << 12) / (4096 - var22) : 4096;
                                        }
                                    }
                                } else {
                                    for (int var23 = 0; ~class418.field5518 < ~var23; ++var23) {
                                        int var24 = var5[var23];
                                        var3[var23] = ~var24 > -2049 ? var4[var23] * var24 >> 11 : 4096 - ((4096 - var24) * (-var4[var23] + 4096) >> 11);
                                    }
                                }
                            } else {
                                for (int var25 = 0; ~class418.field5518 < ~var25; ++var25) {
                                    var3[var25] = -((4096 - var5[var25]) * (-var4[var25] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var26 = 0; ~class418.field5518 < ~var26; ++var26) {
                                int var27 = var5[var26];
                                var3[var26] = var27 == 0 ? 4096 : (var4[var26] << 12) / var27;
                            }
                        }
                    } else {
                        for (int var28 = 0; var28 < class418.field5518; ++var28) {
                            var3[var28] = var4[var28] * var5[var28] >> 12;
                        }
                    }
                } else {
                    for (int var29 = 0; class418.field5518 > var29; ++var29) {
                        var3[var29] = var4[var29] + -var5[var29];
                    }
                }
            } else {
                for (int var30 = 0; var30 < class418.field5518; ++var30) {
                    var3[var30] = var4[var30] - -var5[var30];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jja", name = "g", descriptor = "(I)V", line = 618)
    public static final void method2652(int arg0) {
        ++field6106;
        class127.field1672.method2919(arg0 ^ arg0);
    }

    @OriginalMember(owner = "client!jja", name = "c", descriptor = "(III)Z", line = 630)
    public static final boolean method2653(int arg0, int arg1, int arg2) {
        if (arg1 > -81) {
            field6109 = null;
        }
        ++field6105;
        return (arg2 & 32768) != 0;
    }

    @OriginalMember(owner = "client!jja", name = "<init>", descriptor = "()V", line = 646)
    public class469() {
        super(2, false);
    }
}
