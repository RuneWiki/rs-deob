import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dea")
public class class336 extends class330 {

    @OriginalMember(owner = "client!dea", name = "D", descriptor = "I")
    private int field4778 = 6;

    @OriginalMember(owner = "client!dea", name = "C", descriptor = "I")
    public static int field4777;

    @OriginalMember(owner = "client!dea", name = "E", descriptor = "I")
    public static int field4779;

    @OriginalMember(owner = "client!dea", name = "G", descriptor = "I")
    public static int field4781;

    @OriginalMember(owner = "client!dea", name = "H", descriptor = "I")
    public static int field4782;

    @OriginalMember(owner = "client!dea", name = "I", descriptor = "I")
    public static int field4783;

    @OriginalMember(owner = "client!dea", name = "F", descriptor = "Lae;")
    public static class283 field4780;

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(ILae;)V", line = 6)
    public static final void method2126(int arg0, class283 arg1) {
        ++field4783;
        field4780 = arg1;
        if (arg0 != 27271) {
            field4780 = null;
        }
    }

    @OriginalMember(owner = "client!dea", name = "b", descriptor = "(IIB)Z", line = 18)
    public static final boolean method2127(int arg0, int arg1, byte arg2) {
        ++field4777;
        if (arg2 > -87) {
            field4780 = null;
        }
        return (50560 & arg1) != 0;
    }

    @OriginalMember(owner = "client!dea", name = "<init>", descriptor = "()V", line = 29)
    public class336() {
        super(2, false);
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(Lgga;IB)V", line = 32)
    public final void method466(class511 arg0, int arg1, byte arg2) {
        ++field4781;
        if (~arg1 != -1) {
            if (~arg1 == -2) {
                super.field4636 = ~arg0.method3013(-99) == -2;
            }
        } else {
            this.field4778 = arg0.method3013(-99);
        }
        int var5 = 17 % ((arg2 - -41) / 42);
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(IZ)[I", line = 67)
    public final int[] method464(int arg0, boolean arg1) {
        ++field4782;
        if (arg1) {
            this.field4778 = -30;
        }
        int[] var3 = super.field4630.method2475(arg0, 30011);
        if (super.field4630.field5704) {
            int[] var4 = this.method2084(0, arg0, (byte) 45);
            int[] var5 = this.method2084(1, arg0, (byte) 79);
            int var6 = this.field4778;
            if (var6 != 1) {
                if (var6 != 2) {
                    if (var6 != 3) {
                        if (~var6 != -5) {
                            if (var6 != 5) {
                                if (~var6 != -7) {
                                    if (var6 != 7) {
                                        if (var6 != 8) {
                                            if (var6 != 9) {
                                                if (var6 != 10) {
                                                    if (~var6 != -12) {
                                                        if (~var6 == -13) {
                                                            for (int var7 = 0; var7 < class80.field901; ++var7) {
                                                                int var8 = var4[var7];
                                                                int var9 = var5[var7];
                                                                var3[var7] = var9 - (var8 * var9 >> 11) + var8;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var10 = 0; class80.field901 > var10; ++var10) {
                                                            int var11 = var4[var10];
                                                            int var12 = var5[var10];
                                                            var3[var10] = ~var11 >= ~var12 ? var12 - var11 : -var12 + var11;
                                                        }
                                                    }
                                                } else {
                                                    for (int var13 = 0; ~class80.field901 < ~var13; ++var13) {
                                                        int var14 = var4[var13];
                                                        int var15 = var5[var13];
                                                        var3[var13] = ~var15 <= ~var14 ? var15 : var14;
                                                    }
                                                }
                                            } else {
                                                for (int var16 = 0; class80.field901 > var16; ++var16) {
                                                    int var17 = var4[var16];
                                                    int var18 = var5[var16];
                                                    var3[var16] = var18 > var17 ? var17 : var18;
                                                }
                                            }
                                        } else {
                                            for (int var19 = 0; ~class80.field901 < ~var19; ++var19) {
                                                int var20 = var4[var19];
                                                var3[var19] = ~var20 != -1 ? -((-var5[var19] + 4096 << 12) / var20) + 4096 : 0;
                                            }
                                        }
                                    } else {
                                        for (int var21 = 0; ~var21 > ~class80.field901; ++var21) {
                                            int var22 = var4[var21];
                                            var3[var21] = var22 != 4096 ? (var5[var21] << 12) / (4096 - var22) : 4096;
                                        }
                                    }
                                } else {
                                    for (int var23 = 0; ~class80.field901 < ~var23; ++var23) {
                                        int var24 = var5[var23];
                                        var3[var23] = var24 < 2048 ? var4[var23] * var24 >> 11 : -((-var4[var23] + 4096) * (-var24 + 4096) >> 11) + 4096;
                                    }
                                }
                            } else {
                                for (int var25 = 0; var25 < class80.field901; ++var25) {
                                    var3[var25] = -((4096 - var4[var25]) * (-var5[var25] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var26 = 0; ~var26 > ~class80.field901; ++var26) {
                                int var27 = var5[var26];
                                var3[var26] = var27 == 0 ? 4096 : (var4[var26] << 12) / var27;
                            }
                        }
                    } else {
                        for (int var28 = 0; ~var28 > ~class80.field901; ++var28) {
                            var3[var28] = var4[var28] * var5[var28] >> 12;
                        }
                    }
                } else {
                    for (int var29 = 0; var29 < class80.field901; ++var29) {
                        var3[var29] = var4[var29] + -var5[var29];
                    }
                }
            } else {
                for (int var30 = 0; class80.field901 > var30; ++var30) {
                    var3[var30] = var4[var30] + var5[var30];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dea", name = "e", descriptor = "(B)V", line = 320)
    public static void method2128(byte arg0) {
        if (arg0 >= -109) {
            field4780 = null;
        }
        field4780 = null;
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(II)[[I", line = 330)
    public final int[][] method537(int arg0, int arg1) {
        ++field4779;
        if (arg0 != 0) {
            field4780 = null;
        }
        int[][] var3 = super.field4621.method1597(arg1, true);
        if (super.field4621.field3510) {
            int[][] var4 = this.method2082(arg1, 0, 127);
            int[][] var5 = this.method2082(arg1, 1, 126);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            int[] var12 = var5[0];
            int[] var13 = var5[1];
            int[] var14 = var5[2];
            int var15 = this.field4778;
            if (var15 != 1) {
                if (var15 != 2) {
                    if (var15 != 3) {
                        if (~var15 != -5) {
                            if (var15 != 5) {
                                if (~var15 != -7) {
                                    if (var15 != 7) {
                                        if (~var15 != -9) {
                                            if (~var15 != -10) {
                                                if (~var15 != -11) {
                                                    if (var15 != 11) {
                                                        if (~var15 == -13) {
                                                            for (int var16 = 0; class80.field901 > var16; ++var16) {
                                                                int var17 = var13[var16];
                                                                int var18 = var11[var16];
                                                                int var19 = var10[var16];
                                                                int var20 = var14[var16];
                                                                int var21 = var12[var16];
                                                                int var22 = var9[var16];
                                                                var6[var16] = -(var21 * var22 >> 11) + var22 + var21;
                                                                var7[var16] = var19 - -var17 - (var17 * var19 >> 11);
                                                                var8[var16] = var18 - (var18 * var20 >> 11) + var20;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var23 = 0; class80.field901 > var23; ++var23) {
                                                            int var24 = var10[var23];
                                                            int var25 = var13[var23];
                                                            int var26 = var12[var23];
                                                            int var27 = var14[var23];
                                                            int var28 = var9[var23];
                                                            int var29 = var11[var23];
                                                            var6[var23] = var28 <= var26 ? var26 - var28 : var28 - var26;
                                                            var7[var23] = var24 <= var25 ? -var24 + var25 : var24 - var25;
                                                            var8[var23] = ~var29 >= ~var27 ? var27 - var29 : -var27 + var29;
                                                        }
                                                    }
                                                } else {
                                                    for (int var30 = 0; ~var30 > ~class80.field901; ++var30) {
                                                        int var31 = var12[var30];
                                                        int var32 = var11[var30];
                                                        int var33 = var13[var30];
                                                        int var34 = var14[var30];
                                                        int var35 = var9[var30];
                                                        int var36 = var10[var30];
                                                        var6[var30] = var31 < var35 ? var35 : var31;
                                                        var7[var30] = var33 >= var36 ? var33 : var36;
                                                        var8[var30] = ~var32 < ~var34 ? var32 : var34;
                                                    }
                                                }
                                            } else {
                                                for (int var37 = 0; class80.field901 > var37; ++var37) {
                                                    int var38 = var11[var37];
                                                    int var39 = var9[var37];
                                                    int var40 = var12[var37];
                                                    int var41 = var14[var37];
                                                    int var42 = var13[var37];
                                                    int var43 = var10[var37];
                                                    var6[var37] = ~var40 < ~var39 ? var39 : var40;
                                                    var7[var37] = ~var42 >= ~var43 ? var42 : var43;
                                                    var8[var37] = ~var41 < ~var38 ? var38 : var41;
                                                }
                                            }
                                        } else {
                                            for (int var44 = 0; class80.field901 > var44; ++var44) {
                                                int var45 = var11[var44];
                                                int var46 = var9[var44];
                                                int var47 = var10[var44];
                                                var6[var44] = var46 == 0 ? 0 : 4096 - (-var12[var44] + 4096 << 12) / var46;
                                                var7[var44] = ~var47 != -1 ? 4096 - (-var13[var44] + 4096 << 12) / var47 : 0;
                                                var8[var44] = var45 == 0 ? 0 : -((-var14[var44] + 4096 << 12) / var45) + 4096;
                                            }
                                        }
                                    } else {
                                        for (int var48 = 0; class80.field901 > var48; ++var48) {
                                            int var49 = var11[var48];
                                            int var50 = var9[var48];
                                            int var51 = var10[var48];
                                            var6[var48] = var50 == 4096 ? 4096 : (var12[var48] << 12) / (4096 - var50);
                                            var7[var48] = ~var51 != -4097 ? (var13[var48] << 12) / (-var51 + 4096) : 4096;
                                            var8[var48] = ~var49 != -4097 ? (var14[var48] << 12) / (-var49 + 4096) : 4096;
                                        }
                                    }
                                } else {
                                    for (int var52 = 0; ~var52 > ~class80.field901; ++var52) {
                                        int var53 = var13[var52];
                                        int var54 = var12[var52];
                                        int var55 = var14[var52];
                                        var6[var52] = var54 < 2048 ? var9[var52] * var54 >> 11 : -((4096 - var54) * (-var9[var52] + 4096) >> 11) + 4096;
                                        var7[var52] = var53 < 2048 ? var10[var52] * var53 >> 11 : 4096 - ((-var10[var52] + 4096) * (-var53 + 4096) >> 11);
                                        var8[var52] = var55 < 2048 ? var11[var52] * var55 >> 11 : -((-var11[var52] + 4096) * (-var55 + 4096) >> 11) + 4096;
                                    }
                                }
                            } else {
                                for (int var56 = 0; ~class80.field901 < ~var56; ++var56) {
                                    var6[var56] = -((4096 - var12[var56]) * (-var9[var56] + 4096) >> 12) + 4096;
                                    var7[var56] = -((-var10[var56] + 4096) * (-var13[var56] + 4096) >> 12) + 4096;
                                    var8[var56] = -((4096 - var14[var56]) * (-var11[var56] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var57 = 0; class80.field901 > var57; ++var57) {
                                int var58 = var13[var57];
                                int var59 = var14[var57];
                                int var60 = var12[var57];
                                var6[var57] = ~var60 != -1 ? (var9[var57] << 12) / var60 : 4096;
                                var7[var57] = ~var58 == -1 ? 4096 : (var10[var57] << 12) / var58;
                                var8[var57] = var59 == 0 ? 4096 : (var11[var57] << 12) / var59;
                            }
                        }
                    } else {
                        for (int var61 = 0; var61 < class80.field901; ++var61) {
                            var6[var61] = var9[var61] * var12[var61] >> 12;
                            var7[var61] = var10[var61] * var13[var61] >> 12;
                            var8[var61] = var11[var61] * var14[var61] >> 12;
                        }
                    }
                } else {
                    for (int var62 = 0; var62 < class80.field901; ++var62) {
                        var6[var62] = var9[var62] + -var12[var62];
                        var7[var62] = var10[var62] + -var13[var62];
                        var8[var62] = var11[var62] + -var14[var62];
                    }
                }
            } else {
                for (int var63 = 0; ~class80.field901 < ~var63; ++var63) {
                    var6[var63] = var9[var63] + var12[var63];
                    var7[var63] = var10[var63] - -var13[var63];
                    var8[var63] = var11[var63] - -var14[var63];
                }
            }
        }
        return var3;
    }
}
