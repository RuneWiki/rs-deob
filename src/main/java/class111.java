import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jfa")
public class class111 extends class642 {

    @OriginalMember(owner = "client!jfa", name = "G", descriptor = "I")
    private int field1641 = 6;

    @OriginalMember(owner = "client!jfa", name = "C", descriptor = "Z")
    public static boolean field1637 = false;

    @OriginalMember(owner = "client!jfa", name = "J", descriptor = "Ldc;")
    public static class302 field1644 = new class302();

    @OriginalMember(owner = "client!jfa", name = "B", descriptor = "I")
    public static int field1636;

    @OriginalMember(owner = "client!jfa", name = "D", descriptor = "I")
    public static int field1638;

    @OriginalMember(owner = "client!jfa", name = "E", descriptor = "I")
    public static int field1639;

    @OriginalMember(owner = "client!jfa", name = "F", descriptor = "I")
    public static int field1640;

    @OriginalMember(owner = "client!jfa", name = "H", descriptor = "I")
    public static int field1642;

    @OriginalMember(owner = "client!jfa", name = "I", descriptor = "I")
    public static int field1643;

    @OriginalMember(owner = "client!jfa", name = "K", descriptor = "I")
    public static int field1645;

    @OriginalMember(owner = "client!jfa", name = "b", descriptor = "(II)[I", line = 3)
    public final int[] method3(int arg0, int arg1) {
        if (arg1 != -9) {
            field1644 = null;
        }
        ++field1640;
        int[] var3 = super.field9216.method1185(arg0, arg1 ^ 122);
        if (super.field9216.field2418) {
            int[] var4 = this.method3658((byte) 57, arg0, 0);
            int[] var5 = this.method3658((byte) 94, arg0, 1);
            int var6 = this.field1641;
            if (~var6 != -2) {
                if (var6 != 2) {
                    if (~var6 != -4) {
                        if (~var6 != -5) {
                            if (var6 != 5) {
                                if (var6 != 6) {
                                    if (~var6 != -8) {
                                        if (~var6 != -9) {
                                            if (~var6 != -10) {
                                                if (var6 != 10) {
                                                    if (var6 != 11) {
                                                        if (~var6 == -13) {
                                                            for (int var7 = 0; ~var7 > ~class338.field4909; ++var7) {
                                                                int var8 = var5[var7];
                                                                int var9 = var4[var7];
                                                                var3[var7] = -(var8 * var9 >> 11) + var8 + var9;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var10 = 0; var10 < class338.field4909; ++var10) {
                                                            int var11 = var4[var10];
                                                            int var12 = var5[var10];
                                                            var3[var10] = var11 > var12 ? -var12 + var11 : -var11 + var12;
                                                        }
                                                    }
                                                } else {
                                                    for (int var13 = 0; ~class338.field4909 < ~var13; ++var13) {
                                                        int var14 = var5[var13];
                                                        int var15 = var4[var13];
                                                        var3[var13] = var15 > var14 ? var15 : var14;
                                                    }
                                                }
                                            } else {
                                                for (int var16 = 0; ~var16 > ~class338.field4909; ++var16) {
                                                    int var17 = var4[var16];
                                                    int var18 = var5[var16];
                                                    var3[var16] = var17 < var18 ? var17 : var18;
                                                }
                                            }
                                        } else {
                                            for (int var19 = 0; ~var19 > ~class338.field4909; ++var19) {
                                                int var20 = var4[var19];
                                                var3[var19] = ~var20 != -1 ? -((-var5[var19] + 4096 << 12) / var20) + 4096 : 0;
                                            }
                                        }
                                    } else {
                                        for (int var21 = 0; ~class338.field4909 < ~var21; ++var21) {
                                            int var22 = var4[var21];
                                            var3[var21] = var22 != 4096 ? (var5[var21] << 12) / (4096 - var22) : 4096;
                                        }
                                    }
                                } else {
                                    for (int var23 = 0; class338.field4909 > var23; ++var23) {
                                        int var24 = var5[var23];
                                        var3[var23] = var24 >= 2048 ? -((-var4[var23] + 4096) * (-var24 + 4096) >> 11) + 4096 : var4[var23] * var24 >> 11;
                                    }
                                }
                            } else {
                                for (int var25 = 0; ~class338.field4909 < ~var25; ++var25) {
                                    var3[var25] = 4096 - ((4096 - var5[var25]) * (-var4[var25] + 4096) >> 12);
                                }
                            }
                        } else {
                            for (int var26 = 0; class338.field4909 > var26; ++var26) {
                                int var27 = var5[var26];
                                var3[var26] = var27 == 0 ? 4096 : (var4[var26] << 12) / var27;
                            }
                        }
                    } else {
                        for (int var28 = 0; ~var28 > ~class338.field4909; ++var28) {
                            var3[var28] = var4[var28] * var5[var28] >> 12;
                        }
                    }
                } else {
                    for (int var29 = 0; class338.field4909 > var29; ++var29) {
                        var3[var29] = var4[var29] + -var5[var29];
                    }
                }
            } else {
                for (int var30 = 0; ~var30 > ~class338.field4909; ++var30) {
                    var3[var30] = var4[var30] + var5[var30];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(Z)V", line = 256)
    public static void method839(boolean arg0) {
        field1644 = null;
        if (!arg0) {
            method840(-113, 53);
        }
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(ILgk;B)V", line = 269)
    public final void method1(int arg0, class540 arg1, byte arg2) {
        ++field1645;
        if (arg2 <= 29) {
            this.method3(114, 7);
        }
        if (~arg0 != -1) {
            if (~arg0 == -2) {
                super.field9207 = ~arg1.method3115(29871) == -2;
            }
        } else {
            this.field1641 = arg1.method3115(29871);
        }
    }

    @OriginalMember(owner = "client!jfa", name = "<init>", descriptor = "()V", line = 304)
    public class111() {
        super(2, false);
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(II)[[I", line = 308)
    public final int[][] method138(int arg0, int arg1) {
        ++field1642;
        int[][] var3 = super.field9211.method1068(0, arg1);
        if (arg0 != 21402) {
            method839(true);
        }
        if (super.field9211.field2131) {
            int[][] var4 = this.method3657(arg1, true, 0);
            int[][] var5 = this.method3657(arg1, true, 1);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            int[] var12 = var5[0];
            int[] var13 = var5[1];
            int[] var14 = var5[2];
            int var15 = this.field1641;
            if (var15 != 1) {
                if (~var15 != -3) {
                    if (var15 != 3) {
                        if (var15 != 4) {
                            if (~var15 != -6) {
                                if (~var15 != -7) {
                                    if (~var15 != -8) {
                                        if (~var15 != -9) {
                                            if (~var15 != -10) {
                                                if (var15 != 10) {
                                                    if (~var15 != -12) {
                                                        if (~var15 == -13) {
                                                            for (int var16 = 0; ~class338.field4909 < ~var16; ++var16) {
                                                                int var17 = var11[var16];
                                                                int var18 = var12[var16];
                                                                int var19 = var14[var16];
                                                                int var20 = var10[var16];
                                                                int var21 = var13[var16];
                                                                int var22 = var9[var16];
                                                                var6[var16] = var22 - -var18 - (var18 * var22 >> 11);
                                                                var7[var16] = -(var20 * var21 >> 11) + var20 + var21;
                                                                var8[var16] = var17 + var19 + -(var17 * var19 >> 11);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var23 = 0; class338.field4909 > var23; ++var23) {
                                                            int var24 = var10[var23];
                                                            int var25 = var9[var23];
                                                            int var26 = var12[var23];
                                                            int var27 = var14[var23];
                                                            int var28 = var13[var23];
                                                            int var29 = var11[var23];
                                                            var6[var23] = var26 < var25 ? -var26 + var25 : -var25 + var26;
                                                            var7[var23] = ~var28 > ~var24 ? -var28 + var24 : var28 - var24;
                                                            var8[var23] = ~var27 <= ~var29 ? -var29 + var27 : -var27 + var29;
                                                        }
                                                    }
                                                } else {
                                                    for (int var30 = 0; var30 < class338.field4909; ++var30) {
                                                        int var31 = var10[var30];
                                                        int var32 = var13[var30];
                                                        int var33 = var12[var30];
                                                        int var34 = var14[var30];
                                                        int var35 = var11[var30];
                                                        int var36 = var9[var30];
                                                        var6[var30] = var33 < var36 ? var36 : var33;
                                                        var7[var30] = ~var31 >= ~var32 ? var32 : var31;
                                                        var8[var30] = ~var35 < ~var34 ? var35 : var34;
                                                    }
                                                }
                                            } else {
                                                for (int var37 = 0; var37 < class338.field4909; ++var37) {
                                                    int var38 = var10[var37];
                                                    int var39 = var14[var37];
                                                    int var40 = var13[var37];
                                                    int var41 = var11[var37];
                                                    int var42 = var12[var37];
                                                    int var43 = var9[var37];
                                                    var6[var37] = var43 >= var42 ? var42 : var43;
                                                    var7[var37] = ~var40 >= ~var38 ? var40 : var38;
                                                    var8[var37] = var39 <= var41 ? var39 : var41;
                                                }
                                            }
                                        } else {
                                            for (int var44 = 0; ~class338.field4909 < ~var44; ++var44) {
                                                int var45 = var9[var44];
                                                int var46 = var10[var44];
                                                int var47 = var11[var44];
                                                var6[var44] = var45 != 0 ? -((-var12[var44] + 4096 << 12) / var45) + 4096 : 0;
                                                var7[var44] = var46 != 0 ? 4096 - (-var13[var44] + 4096 << 12) / var46 : 0;
                                                var8[var44] = var47 != 0 ? -((-var14[var44] + 4096 << 12) / var47) + 4096 : 0;
                                            }
                                        }
                                    } else {
                                        for (int var48 = 0; var48 < class338.field4909; ++var48) {
                                            int var49 = var11[var48];
                                            int var50 = var9[var48];
                                            int var51 = var10[var48];
                                            var6[var48] = ~var50 != -4097 ? (var12[var48] << 12) / (-var50 + 4096) : 4096;
                                            var7[var48] = ~var51 != -4097 ? (var13[var48] << 12) / (-var51 + 4096) : 4096;
                                            var8[var48] = var49 != 4096 ? (var14[var48] << 12) / (-var49 + 4096) : 4096;
                                        }
                                    }
                                } else {
                                    for (int var52 = 0; var52 < class338.field4909; ++var52) {
                                        int var53 = var13[var52];
                                        int var54 = var14[var52];
                                        int var55 = var12[var52];
                                        var6[var52] = ~var55 > -2049 ? var9[var52] * var55 >> 11 : -((-var9[var52] + 4096) * (-var55 + 4096) >> 11) + 4096;
                                        var7[var52] = ~var53 <= -2049 ? 4096 - ((4096 - var10[var52]) * (-var53 + 4096) >> 11) : var10[var52] * var53 >> 11;
                                        var8[var52] = ~var54 <= -2049 ? -((4096 - var11[var52]) * (-var54 + 4096) >> 11) + 4096 : var11[var52] * var54 >> 11;
                                    }
                                }
                            } else {
                                for (int var56 = 0; var56 < class338.field4909; ++var56) {
                                    var6[var56] = -((-var9[var56] + 4096) * (-var12[var56] + 4096) >> 12) + 4096;
                                    var7[var56] = -((4096 - var13[var56]) * (-var10[var56] + 4096) >> 12) + 4096;
                                    var8[var56] = -((4096 - var14[var56]) * (-var11[var56] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var57 = 0; var57 < class338.field4909; ++var57) {
                                int var58 = var12[var57];
                                int var59 = var14[var57];
                                int var60 = var13[var57];
                                var6[var57] = var58 == 0 ? 4096 : (var9[var57] << 12) / var58;
                                var7[var57] = ~var60 != -1 ? (var10[var57] << 12) / var60 : 4096;
                                var8[var57] = var59 == 0 ? 4096 : (var11[var57] << 12) / var59;
                            }
                        }
                    } else {
                        for (int var61 = 0; var61 < class338.field4909; ++var61) {
                            var6[var61] = var9[var61] * var12[var61] >> 12;
                            var7[var61] = var10[var61] * var13[var61] >> 12;
                            var8[var61] = var11[var61] * var14[var61] >> 12;
                        }
                    }
                } else {
                    for (int var62 = 0; ~class338.field4909 < ~var62; ++var62) {
                        var6[var62] = var9[var62] - var12[var62];
                        var7[var62] = var10[var62] + -var13[var62];
                        var8[var62] = var11[var62] - var14[var62];
                    }
                }
            } else {
                for (int var63 = 0; class338.field4909 > var63; ++var63) {
                    var6[var63] = var9[var63] + var12[var63];
                    var7[var63] = var10[var63] + var13[var63];
                    var8[var63] = var11[var63] - -var14[var63];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jfa", name = "c", descriptor = "(II)V", line = 626)
    public static final void method840(int arg0, int arg1) {
        class425.field6217 = -1;
        ++field1643;
        if (~arg0 == -38) {
            class55.field842 = 3.0F;
        } else if (~arg0 != -51) {
            if (arg0 != 75) {
                if (~arg0 != -101) {
                    if (~arg0 == -201) {
                        class55.field842 = 16.0F;
                    }
                } else {
                    class55.field842 = 8.0F;
                }
            } else {
                class55.field842 = 6.0F;
            }
        } else {
            class55.field842 = 4.0F;
        }
        if (arg1 >= -8) {
            field1638 = -106;
        }
        class425.field6217 = -1;
    }
}
