import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class230 extends class23 {

    @OriginalMember(owner = "client!vc", name = "P", descriptor = "I")
    private int field4218 = 6;

    @OriginalMember(owner = "client!vc", name = "L", descriptor = "[Lkf;")
    public static class114[] field4214 = new class114[50];

    @OriginalMember(owner = "client!vc", name = "S", descriptor = "I")
    public static int field4221 = 0;

    @OriginalMember(owner = "client!vc", name = "O", descriptor = "I")
    public static int field4217 = 0;

    @OriginalMember(owner = "client!vc", name = "R", descriptor = "Lqb;")
    public static class176 field4220 = new class176(5);

    @OriginalMember(owner = "client!vc", name = "M", descriptor = "I")
    public static int field4215;

    @OriginalMember(owner = "client!vc", name = "N", descriptor = "I")
    public static int field4216;

    @OriginalMember(owner = "client!vc", name = "Q", descriptor = "I")
    public static int field4219;

    @OriginalMember(owner = "client!vc", name = "T", descriptor = "I")
    public static int field4222;

    @OriginalMember(owner = "client!vc", name = "U", descriptor = "I")
    public static int field4223;

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "(I)V")
    public static void method1490(int arg0) {
        if (arg0 != -22323) {
            method1490(-112);
        }
        field4214 = null;
        field4220 = null;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lce;II)V")
    public final void method40(class28 arg0, int arg1, int arg2) {
        if (~arg1 != -1) {
            if (~arg1 == -2) {
                super.field407 = arg0.method215(-1797813752) == 1;
            }
        } else {
            this.field4218 = arg0.method215(-1797813752);
        }
        if (arg2 == 1000) {
            ++field4219;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IBII)I")
    public static final int method1491(int arg0, byte arg1, int arg2, int arg3) {
        int var4 = arg0 & 3;
        ++field4215;
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return -arg3 + 7;
        } else if (var4 == 2) {
            return -arg2 + 7;
        } else {
            if (arg1 < 63) {
                method1492();
            }
            return arg3;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(II)[I")
    public final int[] method57(int arg0, int arg1) {
        if (arg0 != 0) {
            field4214 = null;
        }
        int[] var3 = super.field405.method1461(arg1, (byte) -108);
        ++field4222;
        if (super.field405.field4114) {
            int[] var4 = this.method162(arg1, 0, (byte) 18);
            int[] var5 = this.method162(arg1, 1, (byte) 18);
            int var6 = this.field4218;
            if (~var6 != -2) {
                if (~var6 != -3) {
                    if (~var6 != -4) {
                        if (var6 != 4) {
                            if (~var6 != -6) {
                                if (var6 != 6) {
                                    if (var6 != 7) {
                                        if (var6 != 8) {
                                            if (~var6 != -10) {
                                                if (~var6 != -11) {
                                                    if (var6 != 11) {
                                                        if (~var6 == -13) {
                                                            for (int var7 = 0; class199.field3705 > var7; ++var7) {
                                                                int var8 = var4[var7];
                                                                int var9 = var5[var7];
                                                                var3[var7] = var8 + var9 + -(var8 * var9 >> 11);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var10 = 0; ~class199.field3705 < ~var10; ++var10) {
                                                            int var11 = var5[var10];
                                                            int var12 = var4[var10];
                                                            var3[var10] = ~var11 > ~var12 ? var12 - var11 : -var12 + var11;
                                                        }
                                                    }
                                                } else {
                                                    for (int var13 = 0; var13 < class199.field3705; ++var13) {
                                                        int var14 = var4[var13];
                                                        int var15 = var5[var13];
                                                        var3[var13] = ~var14 >= ~var15 ? var15 : var14;
                                                    }
                                                }
                                            } else {
                                                for (int var16 = 0; class199.field3705 > var16; ++var16) {
                                                    int var17 = var5[var16];
                                                    int var18 = var4[var16];
                                                    var3[var16] = var17 > var18 ? var18 : var17;
                                                }
                                            }
                                        } else {
                                            for (int var19 = 0; class199.field3705 > var19; ++var19) {
                                                int var20 = var4[var19];
                                                var3[var19] = ~var20 == -1 ? 0 : -((-var5[var19] + 4096 << 12) / var20) + 4096;
                                            }
                                        }
                                    } else {
                                        for (int var21 = 0; var21 < class199.field3705; ++var21) {
                                            int var22 = var4[var21];
                                            var3[var21] = var22 != 4096 ? (var5[var21] << 12) / (-var22 + 4096) : 4096;
                                        }
                                    }
                                } else {
                                    for (int var23 = 0; ~var23 > ~class199.field3705; ++var23) {
                                        int var24 = var5[var23];
                                        var3[var23] = var24 < 2048 ? var4[var23] * var24 >> 11 : -((-var4[var23] + 4096) * (-var24 + 4096) >> 11) + 4096;
                                    }
                                }
                            } else {
                                for (int var25 = 0; ~class199.field3705 < ~var25; ++var25) {
                                    var3[var25] = 4096 - ((-var4[var25] + 4096) * (-var5[var25] + 4096) >> 12);
                                }
                            }
                        } else {
                            for (int var26 = 0; ~class199.field3705 < ~var26; ++var26) {
                                int var27 = var5[var26];
                                var3[var26] = var27 != 0 ? (var4[var26] << 12) / var27 : 4096;
                            }
                        }
                    } else {
                        for (int var28 = 0; ~class199.field3705 < ~var28; ++var28) {
                            var3[var28] = var4[var28] * var5[var28] >> 12;
                        }
                    }
                } else {
                    for (int var29 = 0; ~class199.field3705 < ~var29; ++var29) {
                        var3[var29] = var4[var29] + -var5[var29];
                    }
                }
            } else {
                for (int var30 = 0; var30 < class199.field3705; ++var30) {
                    var3[var30] = var4[var30] + var5[var30];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IB)[[I")
    public final int[][] method36(int arg0, byte arg1) {
        int[][] var3 = super.field398.method1522(arg1 + -29668, arg0);
        ++field4216;
        if (arg1 != 9) {
            this.method36(-20, (byte) -109);
        }
        if (super.field398.field4303) {
            int[][] var4 = this.method159(0, (byte) -73, arg0);
            int[][] var5 = this.method159(1, (byte) -75, arg0);
            int[] var6 = var3[0];
            int[] var7 = var3[2];
            int[] var8 = var4[0];
            int[] var9 = var5[0];
            int[] var10 = var5[1];
            int[] var11 = var3[1];
            int[] var12 = var4[2];
            int[] var13 = var5[2];
            int[] var14 = var4[1];
            int var15 = this.field4218;
            if (~var15 != -2) {
                if (var15 != 2) {
                    if (var15 != 3) {
                        if (var15 != 4) {
                            if (var15 != 5) {
                                if (~var15 != -7) {
                                    if (~var15 != -8) {
                                        if (~var15 != -9) {
                                            if (~var15 != -10) {
                                                if (~var15 != -11) {
                                                    if (var15 != 11) {
                                                        if (var15 == 12) {
                                                            for (int var16 = 0; ~var16 > ~class199.field3705; ++var16) {
                                                                int var17 = var8[var16];
                                                                int var18 = var10[var16];
                                                                int var19 = var12[var16];
                                                                int var20 = var14[var16];
                                                                int var21 = var9[var16];
                                                                int var22 = var13[var16];
                                                                var6[var16] = -(var17 * var21 >> 11) + var17 - -var21;
                                                                var11[var16] = -(var18 * var20 >> 11) + var20 + var18;
                                                                var7[var16] = var19 - (var19 * var22 >> 11) + var22;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var23 = 0; var23 < class199.field3705; ++var23) {
                                                            int var24 = var12[var23];
                                                            int var25 = var14[var23];
                                                            int var26 = var10[var23];
                                                            int var27 = var13[var23];
                                                            int var28 = var8[var23];
                                                            int var29 = var9[var23];
                                                            var6[var23] = ~var28 >= ~var29 ? -var28 + var29 : var28 - var29;
                                                            var11[var23] = ~var25 >= ~var26 ? var26 - var25 : -var26 + var25;
                                                            var7[var23] = var27 < var24 ? var24 - var27 : -var24 + var27;
                                                        }
                                                    }
                                                } else {
                                                    for (int var30 = 0; ~class199.field3705 < ~var30; ++var30) {
                                                        int var31 = var14[var30];
                                                        int var32 = var9[var30];
                                                        int var33 = var12[var30];
                                                        int var34 = var10[var30];
                                                        int var35 = var13[var30];
                                                        int var36 = var8[var30];
                                                        var6[var30] = ~var32 > ~var36 ? var36 : var32;
                                                        var11[var30] = ~var34 <= ~var31 ? var34 : var31;
                                                        var7[var30] = var35 >= var33 ? var35 : var33;
                                                    }
                                                }
                                            } else {
                                                for (int var37 = 0; class199.field3705 > var37; ++var37) {
                                                    int var38 = var12[var37];
                                                    int var39 = var10[var37];
                                                    int var40 = var14[var37];
                                                    int var41 = var13[var37];
                                                    int var42 = var8[var37];
                                                    int var43 = var9[var37];
                                                    var6[var37] = ~var42 > ~var43 ? var42 : var43;
                                                    var11[var37] = ~var40 > ~var39 ? var40 : var39;
                                                    var7[var37] = ~var41 >= ~var38 ? var41 : var38;
                                                }
                                            }
                                        } else {
                                            for (int var44 = 0; var44 < class199.field3705; ++var44) {
                                                int var45 = var8[var44];
                                                int var46 = var12[var44];
                                                int var47 = var14[var44];
                                                var6[var44] = ~var45 == -1 ? 0 : -((4096 - var9[var44] << 12) / var45) + 4096;
                                                var11[var44] = var47 != 0 ? 4096 - (-var10[var44] + 4096 << 12) / var47 : 0;
                                                var7[var44] = ~var46 != -1 ? -((-var13[var44] + 4096 << 12) / var46) + 4096 : 0;
                                            }
                                        }
                                    } else {
                                        for (int var48 = 0; var48 < class199.field3705; ++var48) {
                                            int var49 = var12[var48];
                                            int var50 = var8[var48];
                                            int var51 = var14[var48];
                                            var6[var48] = var50 != 4096 ? (var9[var48] << 12) / (-var50 + 4096) : 4096;
                                            var11[var48] = ~var51 == -4097 ? 4096 : (var10[var48] << 12) / (-var51 + 4096);
                                            var7[var48] = ~var49 != -4097 ? (var13[var48] << 12) / (4096 - var49) : 4096;
                                        }
                                    }
                                } else {
                                    for (int var52 = 0; ~var52 > ~class199.field3705; ++var52) {
                                        int var53 = var9[var52];
                                        int var54 = var13[var52];
                                        int var55 = var10[var52];
                                        var6[var52] = ~var53 > -2049 ? var8[var52] * var53 >> 11 : -((4096 - var8[var52]) * (-var53 + 4096) >> 11) + 4096;
                                        var11[var52] = ~var55 <= -2049 ? -((4096 - var55) * (-var14[var52] + 4096) >> 11) + 4096 : var14[var52] * var55 >> 11;
                                        var7[var52] = ~var54 > -2049 ? var12[var52] * var54 >> 11 : 4096 - ((-var12[var52] + 4096) * (-var54 + 4096) >> 11);
                                    }
                                }
                            } else {
                                for (int var56 = 0; ~var56 > ~class199.field3705; ++var56) {
                                    var6[var56] = -((-var8[var56] + 4096) * (-var9[var56] + 4096) >> 12) + 4096;
                                    var11[var56] = -((-var10[var56] + 4096) * (-var14[var56] + 4096) >> 12) + 4096;
                                    var7[var56] = -((4096 - var13[var56]) * (-var12[var56] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var57 = 0; ~var57 > ~class199.field3705; ++var57) {
                                int var58 = var13[var57];
                                int var59 = var10[var57];
                                int var60 = var9[var57];
                                var6[var57] = var60 == 0 ? 4096 : (var8[var57] << 12) / var60;
                                var11[var57] = var59 == 0 ? 4096 : (var14[var57] << 12) / var59;
                                var7[var57] = var58 == 0 ? 4096 : (var12[var57] << 12) / var58;
                            }
                        }
                    } else {
                        for (int var61 = 0; ~var61 > ~class199.field3705; ++var61) {
                            var6[var61] = var8[var61] * var9[var61] >> 12;
                            var11[var61] = var10[var61] * var14[var61] >> 12;
                            var7[var61] = var12[var61] * var13[var61] >> 12;
                        }
                    }
                } else {
                    for (int var62 = 0; ~class199.field3705 < ~var62; ++var62) {
                        var6[var62] = var8[var62] + -var9[var62];
                        var11[var62] = var14[var62] - var10[var62];
                        var7[var62] = var12[var62] + -var13[var62];
                    }
                }
            } else {
                for (int var63 = 0; ~var63 > ~class199.field3705; ++var63) {
                    var6[var63] = var8[var63] - -var9[var63];
                    var11[var63] = var10[var63] + var14[var63];
                    var7[var63] = var12[var63] - -var13[var63];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "()V")
    public class230() {
        super(2, false);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "()V")
    public static final void method1492() {
        for (int var0 = 0; var0 < class23.field393; ++var0) {
            class94 var1 = class243.field4455[var0];
            class217.method1437(var1);
            class243.field4455[var0] = null;
        }
        class23.field393 = 0;
    }

    @OriginalMember(owner = "client!vc", name = "h", descriptor = "(I)V")
    public static final void method1493(int arg0) {
        ++field4223;
        if (arg0 == 1) {
            if (class30.field600) {
                class136 var1 = class229.method1485(class16.field258, class152.field2883, (byte) -100);
                if (var1 != null && var1.field2522 != null) {
                    class51 var2 = new class51();
                    var2.field1042 = var1.field2522;
                    var2.field1031 = var1;
                    class210.method1397(var2, (byte) -105);
                }
                class30.field600 = false;
                class210.method1395((byte) 29, var1);
            }
        }
    }
}
