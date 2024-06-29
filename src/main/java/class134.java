import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class134 extends class227 {

    @OriginalMember(owner = "client!tj", name = "P", descriptor = "I")
    private int field1766 = 6;

    @OriginalMember(owner = "client!tj", name = "K", descriptor = "Z")
    public static boolean field1761 = false;

    @OriginalMember(owner = "client!tj", name = "J", descriptor = "I")
    public static int field1760 = 0;

    @OriginalMember(owner = "client!tj", name = "N", descriptor = "Lao;")
    public static class191 field1764 = new class191(12, 0);

    @OriginalMember(owner = "client!tj", name = "G", descriptor = "I")
    public static int field1757;

    @OriginalMember(owner = "client!tj", name = "H", descriptor = "I")
    public static int field1758;

    @OriginalMember(owner = "client!tj", name = "I", descriptor = "I")
    public static int field1759;

    @OriginalMember(owner = "client!tj", name = "L", descriptor = "I")
    public static int field1762;

    @OriginalMember(owner = "client!tj", name = "M", descriptor = "I")
    public static int field1763;

    @OriginalMember(owner = "client!tj", name = "O", descriptor = "I")
    public static int field1765;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(II)[I")
    public final int[] method62(int arg0, int arg1) {
        ++field1757;
        int[] var3 = super.field3068.method1970(arg1, (byte) 69);
        if (arg0 != 15811) {
            method807((byte) -81, 32, -93, -18, -64, 63);
        }
        if (super.field3068.field4480) {
            int[] var4 = this.method1459(arg1, arg0 + -15689, 0);
            int[] var5 = this.method1459(arg1, arg0 ^ 15789, 1);
            int var6 = this.field1766;
            if (~var6 != -2) {
                if (var6 != 2) {
                    if (~var6 != -4) {
                        if (var6 != 4) {
                            if (~var6 != -6) {
                                if (~var6 != -7) {
                                    if (~var6 != -8) {
                                        if (~var6 != -9) {
                                            if (var6 != 9) {
                                                if (var6 != 10) {
                                                    if (~var6 != -12) {
                                                        if (~var6 == -13) {
                                                            for (int var7 = 0; var7 < class446.field6486; ++var7) {
                                                                int var8 = var4[var7];
                                                                int var9 = var5[var7];
                                                                var3[var7] = -(var8 * var9 >> 11) + var8 + var9;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var10 = 0; ~var10 > ~class446.field6486; ++var10) {
                                                            int var11 = var5[var10];
                                                            int var12 = var4[var10];
                                                            var3[var10] = var11 < var12 ? var12 - var11 : var11 - var12;
                                                        }
                                                    }
                                                } else {
                                                    for (int var13 = 0; var13 < class446.field6486; ++var13) {
                                                        int var14 = var4[var13];
                                                        int var15 = var5[var13];
                                                        var3[var13] = ~var14 < ~var15 ? var14 : var15;
                                                    }
                                                }
                                            } else {
                                                for (int var16 = 0; class446.field6486 > var16; ++var16) {
                                                    int var17 = var4[var16];
                                                    int var18 = var5[var16];
                                                    var3[var16] = ~var17 > ~var18 ? var17 : var18;
                                                }
                                            }
                                        } else {
                                            for (int var19 = 0; class446.field6486 > var19; ++var19) {
                                                int var20 = var4[var19];
                                                var3[var19] = ~var20 != -1 ? -((4096 - var5[var19] << 12) / var20) + 4096 : 0;
                                            }
                                        }
                                    } else {
                                        for (int var21 = 0; var21 < class446.field6486; ++var21) {
                                            int var22 = var4[var21];
                                            var3[var21] = var22 != 4096 ? (var5[var21] << 12) / (4096 - var22) : 4096;
                                        }
                                    }
                                } else {
                                    for (int var23 = 0; ~class446.field6486 < ~var23; ++var23) {
                                        int var24 = var5[var23];
                                        var3[var23] = var24 < 2048 ? var4[var23] * var24 >> 11 : -((-var4[var23] + 4096) * (-var24 + 4096) >> 11) + 4096;
                                    }
                                }
                            } else {
                                for (int var25 = 0; ~class446.field6486 < ~var25; ++var25) {
                                    var3[var25] = 4096 - ((4096 - var4[var25]) * (-var5[var25] + 4096) >> 12);
                                }
                            }
                        } else {
                            for (int var26 = 0; ~class446.field6486 < ~var26; ++var26) {
                                int var27 = var5[var26];
                                var3[var26] = var27 != 0 ? (var4[var26] << 12) / var27 : 4096;
                            }
                        }
                    } else {
                        for (int var28 = 0; ~var28 > ~class446.field6486; ++var28) {
                            var3[var28] = var4[var28] * var5[var28] >> 12;
                        }
                    }
                } else {
                    for (int var29 = 0; class446.field6486 > var29; ++var29) {
                        var3[var29] = var4[var29] + -var5[var29];
                    }
                }
            } else {
                for (int var30 = 0; class446.field6486 > var30; ++var30) {
                    var3[var30] = var4[var30] + var5[var30];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(BIIIII)V")
    public static final void method807(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field1758;
        for (int var6 = arg2; var6 <= arg1; ++var6) {
            class476.method2907(arg5, 40, arg4, class5.field54[var6], arg3);
        }
        if (arg0 >= -64) {
            method810(-57);
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Lza;Lvt;I)I")
    public static final int method808(class287 arg0, class200 arg1, int arg2) {
        if (arg2 < 15) {
            return -81;
        } else {
            ++field1763;
            if (~arg1.field2676 != 0) {
                return arg1.field2676;
            } else {
                if (~arg1.field2672 != 0) {
                    class433 var3 = arg0.field3772.method94(arg0.method1144() ? arg1.field2672 : arg1.field2681, (byte) -72);
                    if (!var3.field6305) {
                        return var3.field6309;
                    }
                }
                return arg1.field2671;
            }
        }
    }

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "(III)Z")
    public static final boolean method809(int arg0, int arg1, int arg2) {
        if (arg2 > -71) {
            return true;
        } else {
            ++field1765;
            return class335.method1954(arg0, arg1, 98) | ~(458752 & arg0) != -1 || class317.method1891(arg0, (byte) 68, arg1);
        }
    }

    @OriginalMember(owner = "client!tj", name = "<init>", descriptor = "()V")
    public class134() {
        super(2, false);
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method112(int arg0, boolean arg1) {
        ++field1759;
        int[][] var3 = super.field3059.method28((byte) -125, arg0);
        if (!arg1) {
            method808((class287) null, (class200) null, 4);
        }
        if (super.field3059.field57) {
            int[][] var4 = this.method1460(arg0, 0, 0);
            int[][] var5 = this.method1460(arg0, 1, 0);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            int[] var12 = var5[0];
            int[] var13 = var5[1];
            int[] var14 = var5[2];
            int var15 = this.field1766;
            if (var15 != 1) {
                if (var15 != 2) {
                    if (var15 != 3) {
                        if (~var15 != -5) {
                            if (var15 != 5) {
                                if (~var15 != -7) {
                                    if (~var15 != -8) {
                                        if (var15 != 8) {
                                            if (~var15 != -10) {
                                                if (~var15 != -11) {
                                                    if (var15 != 11) {
                                                        if (var15 == 12) {
                                                            for (int var16 = 0; var16 < class446.field6486; ++var16) {
                                                                int var17 = var9[var16];
                                                                int var18 = var12[var16];
                                                                int var19 = var10[var16];
                                                                int var20 = var11[var16];
                                                                int var21 = var13[var16];
                                                                int var22 = var14[var16];
                                                                var6[var16] = var17 + var18 + -(var17 * var18 >> 11);
                                                                var7[var16] = -(var19 * var21 >> 11) + var19 + var21;
                                                                var8[var16] = -(var20 * var22 >> 11) + var20 - -var22;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var23 = 0; ~class446.field6486 < ~var23; ++var23) {
                                                            int var24 = var9[var23];
                                                            int var25 = var14[var23];
                                                            int var26 = var13[var23];
                                                            int var27 = var12[var23];
                                                            int var28 = var10[var23];
                                                            int var29 = var11[var23];
                                                            var6[var23] = var27 >= var24 ? -var24 + var27 : -var27 + var24;
                                                            var7[var23] = var26 < var28 ? -var26 + var28 : var26 - var28;
                                                            var8[var23] = var29 <= var25 ? var25 - var29 : -var25 + var29;
                                                        }
                                                    }
                                                } else {
                                                    for (int var30 = 0; ~class446.field6486 < ~var30; ++var30) {
                                                        int var31 = var9[var30];
                                                        int var32 = var12[var30];
                                                        int var33 = var10[var30];
                                                        int var34 = var11[var30];
                                                        int var35 = var14[var30];
                                                        int var36 = var13[var30];
                                                        var6[var30] = ~var32 <= ~var31 ? var32 : var31;
                                                        var7[var30] = ~var36 > ~var33 ? var33 : var36;
                                                        var8[var30] = var35 < var34 ? var34 : var35;
                                                    }
                                                }
                                            } else {
                                                for (int var37 = 0; class446.field6486 > var37; ++var37) {
                                                    int var38 = var12[var37];
                                                    int var39 = var11[var37];
                                                    int var40 = var14[var37];
                                                    int var41 = var9[var37];
                                                    int var42 = var10[var37];
                                                    int var43 = var13[var37];
                                                    var6[var37] = ~var38 < ~var41 ? var41 : var38;
                                                    var7[var37] = var42 >= var43 ? var43 : var42;
                                                    var8[var37] = ~var39 <= ~var40 ? var40 : var39;
                                                }
                                            }
                                        } else {
                                            for (int var44 = 0; var44 < class446.field6486; ++var44) {
                                                int var45 = var9[var44];
                                                int var46 = var11[var44];
                                                int var47 = var10[var44];
                                                var6[var44] = ~var45 == -1 ? 0 : 4096 - (4096 - var12[var44] << 12) / var45;
                                                var7[var44] = ~var47 != -1 ? -((-var13[var44] + 4096 << 12) / var47) + 4096 : 0;
                                                var8[var44] = ~var46 == -1 ? 0 : 4096 - (4096 - var14[var44] << 12) / var46;
                                            }
                                        }
                                    } else {
                                        for (int var48 = 0; ~var48 > ~class446.field6486; ++var48) {
                                            int var49 = var10[var48];
                                            int var50 = var9[var48];
                                            int var51 = var11[var48];
                                            var6[var48] = ~var50 != -4097 ? (var12[var48] << 12) / (4096 - var50) : 4096;
                                            var7[var48] = ~var49 == -4097 ? 4096 : (var13[var48] << 12) / (-var49 + 4096);
                                            var8[var48] = ~var51 != -4097 ? (var14[var48] << 12) / (-var51 + 4096) : 4096;
                                        }
                                    }
                                } else {
                                    for (int var52 = 0; class446.field6486 > var52; ++var52) {
                                        int var53 = var12[var52];
                                        int var54 = var13[var52];
                                        int var55 = var14[var52];
                                        var6[var52] = var53 < 2048 ? var9[var52] * var53 >> 11 : -((-var9[var52] + 4096) * (-var53 + 4096) >> 11) + 4096;
                                        var7[var52] = ~var54 > -2049 ? var10[var52] * var54 >> 11 : -((4096 - var54) * (-var10[var52] + 4096) >> 11) + 4096;
                                        var8[var52] = ~var55 <= -2049 ? -((-var11[var52] + 4096) * (-var55 + 4096) >> 11) + 4096 : var11[var52] * var55 >> 11;
                                    }
                                }
                            } else {
                                for (int var56 = 0; ~class446.field6486 < ~var56; ++var56) {
                                    var6[var56] = 4096 - ((4096 - var12[var56]) * (-var9[var56] + 4096) >> 12);
                                    var7[var56] = -((-var10[var56] + 4096) * (-var13[var56] + 4096) >> 12) + 4096;
                                    var8[var56] = -((-var11[var56] + 4096) * (-var14[var56] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var57 = 0; ~class446.field6486 < ~var57; ++var57) {
                                int var58 = var14[var57];
                                int var59 = var13[var57];
                                int var60 = var12[var57];
                                var6[var57] = var60 == 0 ? 4096 : (var9[var57] << 12) / var60;
                                var7[var57] = ~var59 == -1 ? 4096 : (var10[var57] << 12) / var59;
                                var8[var57] = var58 != 0 ? (var11[var57] << 12) / var58 : 4096;
                            }
                        }
                    } else {
                        for (int var61 = 0; var61 < class446.field6486; ++var61) {
                            var6[var61] = var9[var61] * var12[var61] >> 12;
                            var7[var61] = var10[var61] * var13[var61] >> 12;
                            var8[var61] = var11[var61] * var14[var61] >> 12;
                        }
                    }
                } else {
                    for (int var62 = 0; ~var62 > ~class446.field6486; ++var62) {
                        var6[var62] = var9[var62] + -var12[var62];
                        var7[var62] = var10[var62] + -var13[var62];
                        var8[var62] = var11[var62] + -var14[var62];
                    }
                }
            } else {
                for (int var63 = 0; ~var63 > ~class446.field6486; ++var63) {
                    var6[var63] = var9[var63] + var12[var63];
                    var7[var63] = var10[var63] + var13[var63];
                    var8[var63] = var11[var63] + var14[var63];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Lug;II)V")
    public final void method61(class396 arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            if (arg2 == 1) {
                super.field3066 = ~arg0.method2388((byte) -110) == -2;
            }
        } else {
            this.field1766 = arg0.method2388((byte) -113);
        }
        if (arg1 != 487215116) {
            this.method62(-46, -59);
        }
        ++field1762;
    }

    @OriginalMember(owner = "client!tj", name = "j", descriptor = "(I)V")
    public static void method810(int arg0) {
        if (arg0 != -4097) {
            field1761 = false;
        }
        field1764 = null;
    }
}
