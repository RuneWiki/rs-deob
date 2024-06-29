import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tq")
public class class398 extends class334 {

    @OriginalMember(owner = "client!tq", name = "F", descriptor = "I")
    private int field5485 = 6;

    @OriginalMember(owner = "client!tq", name = "K", descriptor = "D")
    public static double field5490;

    @OriginalMember(owner = "client!tq", name = "E", descriptor = "I")
    public static int field5484;

    @OriginalMember(owner = "client!tq", name = "G", descriptor = "I")
    public static int field5486;

    @OriginalMember(owner = "client!tq", name = "H", descriptor = "I")
    public static int field5487;

    @OriginalMember(owner = "client!tq", name = "I", descriptor = "I")
    public static int field5488;

    @OriginalMember(owner = "client!tq", name = "J", descriptor = "I")
    public static int field5489;

    @OriginalMember(owner = "client!tq", name = "L", descriptor = "Z")
    public static boolean field5491;

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(Ld;Ljava/awt/Canvas;BI)Lha;", line = 3)
    public static final class475 method2367(class103 arg0, Canvas arg1, byte arg2, int arg3) {
        ++field5484;
        if (arg2 != -72) {
            field5491 = false;
        }
        return new class573(arg1, arg0, arg3);
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(IIIJZIILgga;)V", line = 14)
    public static final void method2368(int arg0, int arg1, int arg2, long arg3, boolean arg4, int arg5, int arg6, class513 arg7) {
        class348.field4945 = arg7;
        class308.field4390 = arg3;
        class419.field5804 = 10000;
        class582.field8375 = arg2;
        ++field5488;
        class144.field2337 = arg5;
        class430.field5951 = arg4;
        class406.field5591 = arg0;
        class229.field3357 = arg1;
        class542.field7503 = null;
        class522.field7314 = arg6;
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(ZI)[[I", line = 33)
    public final int[][] method283(boolean arg0, int arg1) {
        ++field5486;
        if (!arg0) {
            return null;
        } else {
            int[][] var3 = super.field4734.method275(26422, arg1);
            if (super.field4734.field425) {
                int[][] var4 = this.method2053(1, 0, arg1);
                int[][] var5 = this.method2053(1, 1, arg1);
                int[] var6 = var3[0];
                int[] var7 = var3[1];
                int[] var8 = var3[2];
                int[] var9 = var4[0];
                int[] var10 = var4[1];
                int[] var11 = var4[2];
                int[] var12 = var5[0];
                int[] var13 = var5[1];
                int[] var14 = var5[2];
                int var15 = this.field5485;
                if (var15 != 1) {
                    if (~var15 != -3) {
                        if (var15 != 3) {
                            if (var15 != 4) {
                                if (~var15 != -6) {
                                    if (~var15 != -7) {
                                        if (~var15 != -8) {
                                            if (~var15 != -9) {
                                                if (var15 != 9) {
                                                    if (var15 != 10) {
                                                        if (~var15 != -12) {
                                                            if (~var15 == -13) {
                                                                for (int var16 = 0; ~var16 > ~class439.field6099; ++var16) {
                                                                    int var17 = var12[var16];
                                                                    int var18 = var9[var16];
                                                                    int var19 = var10[var16];
                                                                    int var20 = var13[var16];
                                                                    int var21 = var11[var16];
                                                                    int var22 = var14[var16];
                                                                    var6[var16] = var18 - -var17 + -(var17 * var18 >> 11);
                                                                    var7[var16] = var19 + var20 + -(var19 * var20 >> 11);
                                                                    var8[var16] = var21 - (-var22 - -(var21 * var22 >> 11));
                                                                }
                                                            }
                                                        } else {
                                                            for (int var23 = 0; ~class439.field6099 < ~var23; ++var23) {
                                                                int var24 = var9[var23];
                                                                int var25 = var13[var23];
                                                                int var26 = var12[var23];
                                                                int var27 = var11[var23];
                                                                int var28 = var10[var23];
                                                                int var29 = var14[var23];
                                                                var6[var23] = var24 > var26 ? -var26 + var24 : -var24 + var26;
                                                                var7[var23] = var25 >= var28 ? -var28 + var25 : var28 - var25;
                                                                var8[var23] = ~var29 > ~var27 ? var27 - var29 : var29 - var27;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var30 = 0; class439.field6099 > var30; ++var30) {
                                                            int var31 = var13[var30];
                                                            int var32 = var11[var30];
                                                            int var33 = var14[var30];
                                                            int var34 = var12[var30];
                                                            int var35 = var9[var30];
                                                            int var36 = var10[var30];
                                                            var6[var30] = var35 > var34 ? var35 : var34;
                                                            var7[var30] = ~var36 < ~var31 ? var36 : var31;
                                                            var8[var30] = var32 > var33 ? var32 : var33;
                                                        }
                                                    }
                                                } else {
                                                    for (int var37 = 0; ~var37 > ~class439.field6099; ++var37) {
                                                        int var38 = var13[var37];
                                                        int var39 = var14[var37];
                                                        int var40 = var9[var37];
                                                        int var41 = var12[var37];
                                                        int var42 = var11[var37];
                                                        int var43 = var10[var37];
                                                        var6[var37] = var41 > var40 ? var40 : var41;
                                                        var7[var37] = ~var38 >= ~var43 ? var38 : var43;
                                                        var8[var37] = ~var39 >= ~var42 ? var39 : var42;
                                                    }
                                                }
                                            } else {
                                                for (int var44 = 0; var44 < class439.field6099; ++var44) {
                                                    int var45 = var9[var44];
                                                    int var46 = var10[var44];
                                                    int var47 = var11[var44];
                                                    var6[var44] = ~var45 == -1 ? 0 : 4096 - (4096 - var12[var44] << 12) / var45;
                                                    var7[var44] = var46 != 0 ? 4096 - (4096 - var13[var44] << 12) / var46 : 0;
                                                    var8[var44] = var47 == 0 ? 0 : -((4096 - var14[var44] << 12) / var47) + 4096;
                                                }
                                            }
                                        } else {
                                            for (int var48 = 0; ~var48 > ~class439.field6099; ++var48) {
                                                int var49 = var10[var48];
                                                int var50 = var9[var48];
                                                int var51 = var11[var48];
                                                var6[var48] = var50 == 4096 ? 4096 : (var12[var48] << 12) / (-var50 + 4096);
                                                var7[var48] = ~var49 != -4097 ? (var13[var48] << 12) / (-var49 + 4096) : 4096;
                                                var8[var48] = ~var51 == -4097 ? 4096 : (var14[var48] << 12) / (-var51 + 4096);
                                            }
                                        }
                                    } else {
                                        for (int var52 = 0; ~class439.field6099 < ~var52; ++var52) {
                                            int var53 = var14[var52];
                                            int var54 = var13[var52];
                                            int var55 = var12[var52];
                                            var6[var52] = ~var55 <= -2049 ? 4096 - ((4096 - var9[var52]) * (-var55 + 4096) >> 11) : var9[var52] * var55 >> 11;
                                            var7[var52] = var54 < 2048 ? var10[var52] * var54 >> 11 : -((-var10[var52] + 4096) * (-var54 + 4096) >> 11) + 4096;
                                            var8[var52] = ~var53 <= -2049 ? -((-var11[var52] + 4096) * (-var53 + 4096) >> 11) + 4096 : var11[var52] * var53 >> 11;
                                        }
                                    }
                                } else {
                                    for (int var56 = 0; var56 < class439.field6099; ++var56) {
                                        var6[var56] = 4096 - ((-var9[var56] + 4096) * (-var12[var56] + 4096) >> 12);
                                        var7[var56] = -((4096 - var13[var56]) * (-var10[var56] + 4096) >> 12) + 4096;
                                        var8[var56] = -((4096 - var11[var56]) * (-var14[var56] + 4096) >> 12) + 4096;
                                    }
                                }
                            } else {
                                for (int var57 = 0; var57 < class439.field6099; ++var57) {
                                    int var58 = var14[var57];
                                    int var59 = var13[var57];
                                    int var60 = var12[var57];
                                    var6[var57] = ~var60 == -1 ? 4096 : (var9[var57] << 12) / var60;
                                    var7[var57] = var59 == 0 ? 4096 : (var10[var57] << 12) / var59;
                                    var8[var57] = ~var58 != -1 ? (var11[var57] << 12) / var58 : 4096;
                                }
                            }
                        } else {
                            for (int var61 = 0; class439.field6099 > var61; ++var61) {
                                var6[var61] = var9[var61] * var12[var61] >> 12;
                                var7[var61] = var10[var61] * var13[var61] >> 12;
                                var8[var61] = var11[var61] * var14[var61] >> 12;
                            }
                        }
                    } else {
                        for (int var62 = 0; ~class439.field6099 < ~var62; ++var62) {
                            var6[var62] = var9[var62] - var12[var62];
                            var7[var62] = var10[var62] + -var13[var62];
                            var8[var62] = var11[var62] - var14[var62];
                        }
                    }
                } else {
                    for (int var63 = 0; ~var63 > ~class439.field6099; ++var63) {
                        var6[var63] = var9[var63] + var12[var63];
                        var7[var63] = var10[var63] + var13[var63];
                        var8[var63] = var11[var63] - -var14[var63];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!tq", name = "<init>", descriptor = "()V", line = 350)
    public class398() {
        super(2, false);
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(II)[I", line = 354)
    public final int[] method28(int arg0, int arg1) {
        ++field5489;
        int[] var3 = super.field4743.method1027((byte) -69, arg0);
        if (arg1 != -22563988) {
            method2368(-11, -51, -94, -48L, true, 14, 60, (class513) null);
        }
        if (super.field4743.field1993) {
            int[] var4 = this.method2052(0, arg1 ^ -22563988, arg0);
            int[] var5 = this.method2052(1, arg1 + 22563988, arg0);
            int var6 = this.field5485;
            if (~var6 != -2) {
                if (~var6 != -3) {
                    if (~var6 != -4) {
                        if (~var6 != -5) {
                            if (var6 != 5) {
                                if (~var6 != -7) {
                                    if (~var6 != -8) {
                                        if (~var6 != -9) {
                                            if (~var6 != -10) {
                                                if (~var6 != -11) {
                                                    if (var6 != 11) {
                                                        if (~var6 == -13) {
                                                            for (int var7 = 0; ~var7 > ~class439.field6099; ++var7) {
                                                                int var8 = var4[var7];
                                                                int var9 = var5[var7];
                                                                var3[var7] = var8 + var9 + -(var8 * var9 >> 11);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var10 = 0; class439.field6099 > var10; ++var10) {
                                                            int var11 = var5[var10];
                                                            int var12 = var4[var10];
                                                            var3[var10] = var11 < var12 ? -var11 + var12 : -var12 + var11;
                                                        }
                                                    }
                                                } else {
                                                    for (int var13 = 0; ~class439.field6099 < ~var13; ++var13) {
                                                        int var14 = var4[var13];
                                                        int var15 = var5[var13];
                                                        var3[var13] = var15 >= var14 ? var15 : var14;
                                                    }
                                                }
                                            } else {
                                                for (int var16 = 0; var16 < class439.field6099; ++var16) {
                                                    int var17 = var4[var16];
                                                    int var18 = var5[var16];
                                                    var3[var16] = ~var17 <= ~var18 ? var18 : var17;
                                                }
                                            }
                                        } else {
                                            for (int var19 = 0; ~var19 > ~class439.field6099; ++var19) {
                                                int var20 = var4[var19];
                                                var3[var19] = var20 != 0 ? 4096 - (-var5[var19] + 4096 << 12) / var20 : 0;
                                            }
                                        }
                                    } else {
                                        for (int var21 = 0; ~var21 > ~class439.field6099; ++var21) {
                                            int var22 = var4[var21];
                                            var3[var21] = var22 != 4096 ? (var5[var21] << 12) / (-var22 + 4096) : 4096;
                                        }
                                    }
                                } else {
                                    for (int var23 = 0; var23 < class439.field6099; ++var23) {
                                        int var24 = var5[var23];
                                        var3[var23] = var24 >= 2048 ? -((-var4[var23] + 4096) * (-var24 + 4096) >> 11) + 4096 : var4[var23] * var24 >> 11;
                                    }
                                }
                            } else {
                                for (int var25 = 0; var25 < class439.field6099; ++var25) {
                                    var3[var25] = -((-var4[var25] + 4096) * (-var5[var25] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var26 = 0; ~class439.field6099 < ~var26; ++var26) {
                                int var27 = var5[var26];
                                var3[var26] = var27 == 0 ? 4096 : (var4[var26] << 12) / var27;
                            }
                        }
                    } else {
                        for (int var28 = 0; ~class439.field6099 < ~var28; ++var28) {
                            var3[var28] = var4[var28] * var5[var28] >> 12;
                        }
                    }
                } else {
                    for (int var29 = 0; var29 < class439.field6099; ++var29) {
                        var3[var29] = var4[var29] - var5[var29];
                    }
                }
            } else {
                for (int var30 = 0; class439.field6099 > var30; ++var30) {
                    var3[var30] = var4[var30] + var5[var30];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(IZLol;)V", line = 607)
    public final void method29(int arg0, boolean arg1, class431 arg2) {
        ++field5487;
        if (!arg1) {
            if (~arg0 != -1) {
                if (~arg0 == -2) {
                    super.field4747 = ~arg2.method2557(14929) == -2;
                }
            } else {
                this.field5485 = arg2.method2557(14929);
            }
        }
    }
}
