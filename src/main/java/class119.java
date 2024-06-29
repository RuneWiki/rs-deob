import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class119 extends class102 {

    @OriginalMember(owner = "client!l", name = "S", descriptor = "I")
    private int field2241 = 6;

    @OriginalMember(owner = "client!l", name = "M", descriptor = "I")
    public static int field2235;

    @OriginalMember(owner = "client!l", name = "N", descriptor = "I")
    public static int field2236;

    @OriginalMember(owner = "client!l", name = "O", descriptor = "I")
    public static int field2237;

    @OriginalMember(owner = "client!l", name = "Q", descriptor = "I")
    public static int field2239;

    @OriginalMember(owner = "client!l", name = "R", descriptor = "I")
    public static int field2240;

    @OriginalMember(owner = "client!l", name = "P", descriptor = "[I")
    public static int[] field2238;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(II)[[I")
    public final int[][] method14(int arg0, int arg1) {
        int[][] var3 = super.field1950.method598((byte) -105, arg0);
        if (arg1 != 64) {
            field2238 = null;
        }
        ++field2240;
        if (super.field1950.field1724) {
            int[][] var4 = this.method677(83, arg0, 0);
            int[][] var5 = this.method677(124, arg0, 1);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            int[] var12 = var5[0];
            int[] var13 = var5[1];
            int[] var14 = var5[2];
            int var15 = this.field2241;
            if (var15 != 1) {
                if (~var15 != -3) {
                    if (~var15 != -4) {
                        if (~var15 != -5) {
                            if (var15 != 5) {
                                if (var15 != 6) {
                                    if (var15 != 7) {
                                        if (var15 != 8) {
                                            if (~var15 != -10) {
                                                if (~var15 != -11) {
                                                    if (~var15 != -12) {
                                                        if (var15 == 12) {
                                                            for (int var16 = 0; var16 < class155.field2796; ++var16) {
                                                                int var17 = var9[var16];
                                                                int var18 = var14[var16];
                                                                int var19 = var11[var16];
                                                                int var20 = var13[var16];
                                                                int var21 = var12[var16];
                                                                int var22 = var10[var16];
                                                                var6[var16] = var17 + var21 + -(var17 * var21 >> 11);
                                                                var7[var16] = var20 - (var20 * var22 >> 11) + var22;
                                                                var8[var16] = var19 - (var18 * var19 >> 11) + var18;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var23 = 0; ~class155.field2796 < ~var23; ++var23) {
                                                            int var24 = var13[var23];
                                                            int var25 = var10[var23];
                                                            int var26 = var14[var23];
                                                            int var27 = var9[var23];
                                                            int var28 = var11[var23];
                                                            int var29 = var12[var23];
                                                            var6[var23] = ~var29 > ~var27 ? -var29 + var27 : var29 - var27;
                                                            var7[var23] = var25 <= var24 ? var24 - var25 : -var24 + var25;
                                                            var8[var23] = ~var26 <= ~var28 ? -var28 + var26 : -var26 + var28;
                                                        }
                                                    }
                                                } else {
                                                    for (int var30 = 0; ~class155.field2796 < ~var30; ++var30) {
                                                        int var31 = var9[var30];
                                                        int var32 = var10[var30];
                                                        int var33 = var11[var30];
                                                        int var34 = var12[var30];
                                                        int var35 = var14[var30];
                                                        int var36 = var13[var30];
                                                        var6[var30] = ~var31 >= ~var34 ? var34 : var31;
                                                        var7[var30] = ~var32 >= ~var36 ? var36 : var32;
                                                        var8[var30] = ~var35 <= ~var33 ? var35 : var33;
                                                    }
                                                }
                                            } else {
                                                for (int var37 = 0; class155.field2796 > var37; ++var37) {
                                                    int var38 = var11[var37];
                                                    int var39 = var13[var37];
                                                    int var40 = var12[var37];
                                                    int var41 = var10[var37];
                                                    int var42 = var14[var37];
                                                    int var43 = var9[var37];
                                                    var6[var37] = var43 < var40 ? var43 : var40;
                                                    var7[var37] = var39 <= var41 ? var39 : var41;
                                                    var8[var37] = ~var42 >= ~var38 ? var42 : var38;
                                                }
                                            }
                                        } else {
                                            for (int var44 = 0; ~class155.field2796 < ~var44; ++var44) {
                                                int var45 = var10[var44];
                                                int var46 = var9[var44];
                                                int var47 = var11[var44];
                                                var6[var44] = ~var46 == -1 ? 0 : -((-var12[var44] + 4096 << 12) / var46) + 4096;
                                                var7[var44] = var45 != 0 ? -((-var13[var44] + 4096 << 12) / var45) + 4096 : 0;
                                                var8[var44] = var47 == 0 ? 0 : -((-var14[var44] + 4096 << 12) / var47) + 4096;
                                            }
                                        }
                                    } else {
                                        for (int var48 = 0; class155.field2796 > var48; ++var48) {
                                            int var49 = var9[var48];
                                            int var50 = var10[var48];
                                            int var51 = var11[var48];
                                            var6[var48] = ~var49 == -4097 ? 4096 : (var12[var48] << 12) / (-var49 + 4096);
                                            var7[var48] = ~var50 != -4097 ? (var13[var48] << 12) / (4096 - var50) : 4096;
                                            var8[var48] = var51 != 4096 ? (var14[var48] << 12) / (-var51 + 4096) : 4096;
                                        }
                                    }
                                } else {
                                    for (int var52 = 0; ~class155.field2796 < ~var52; ++var52) {
                                        int var53 = var13[var52];
                                        int var54 = var14[var52];
                                        int var55 = var12[var52];
                                        var6[var52] = var55 < 2048 ? var9[var52] * var55 >> 11 : 4096 - ((4096 - var55) * (-var9[var52] + 4096) >> 11);
                                        var7[var52] = var53 >= 2048 ? -((4096 - var53) * (-var10[var52] + 4096) >> 11) + 4096 : var10[var52] * var53 >> 11;
                                        var8[var52] = var54 < 2048 ? var11[var52] * var54 >> 11 : -((-var11[var52] + 4096) * (-var54 + 4096) >> 11) + 4096;
                                    }
                                }
                            } else {
                                for (int var56 = 0; class155.field2796 > var56; ++var56) {
                                    var6[var56] = -((4096 - var9[var56]) * (-var12[var56] + 4096) >> 12) + 4096;
                                    var7[var56] = -((4096 - var10[var56]) * (-var13[var56] + 4096) >> 12) + 4096;
                                    var8[var56] = -((4096 - var11[var56]) * (-var14[var56] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var57 = 0; class155.field2796 > var57; ++var57) {
                                int var58 = var13[var57];
                                int var59 = var14[var57];
                                int var60 = var12[var57];
                                var6[var57] = ~var60 == -1 ? 4096 : (var9[var57] << 12) / var60;
                                var7[var57] = var58 != 0 ? (var10[var57] << 12) / var58 : 4096;
                                var8[var57] = var59 != 0 ? (var11[var57] << 12) / var59 : 4096;
                            }
                        }
                    } else {
                        for (int var61 = 0; ~var61 > ~class155.field2796; ++var61) {
                            var6[var61] = var9[var61] * var12[var61] >> 12;
                            var7[var61] = var10[var61] * var13[var61] >> 12;
                            var8[var61] = var11[var61] * var14[var61] >> 12;
                        }
                    }
                } else {
                    for (int var62 = 0; ~var62 > ~class155.field2796; ++var62) {
                        var6[var62] = var9[var62] - var12[var62];
                        var7[var62] = var10[var62] - var13[var62];
                        var8[var62] = var11[var62] + -var14[var62];
                    }
                }
            } else {
                for (int var63 = 0; ~var63 > ~class155.field2796; ++var63) {
                    var6[var63] = var9[var63] + var12[var63];
                    var7[var63] = var10[var63] + var13[var63];
                    var8[var63] = var11[var63] + var14[var63];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!l", name = "c", descriptor = "(III)V")
    public static final void method765(int arg0, int arg1, int arg2) {
        class218.field4042 = true;
        class135.field2493 = arg0;
        class193.field3599 = arg1;
        class240.field4413 = arg2;
        class151.field2729 = -1;
        class227.field4206 = -1;
    }

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "()V")
    public class119() {
        super(2, false);
    }

    @OriginalMember(owner = "client!l", name = "e", descriptor = "(I)V")
    public static void method766(int arg0) {
        if (arg0 != 4096) {
            field2238 = null;
        }
        field2238 = null;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IILjava/awt/Component;La;I)Lbb;")
    public static final class14 method767(int arg0, int arg1, Component arg2, class1 arg3, int arg4) {
        ++field2235;
        if (class80.field1542 == 0) {
            throw new IllegalStateException();
        } else if (~arg1 <= -1 && arg1 < 2) {
            if (~arg4 > -257) {
                arg4 = 256;
            }
            try {
                class14 var5 = (class14) Class.forName("kj").newInstance();
                var5.field338 = new int[256 * (class121.field2268 ? 2 : 1)];
                var5.field367 = arg4;
                var5.method95(arg2);
                var5.field353 = (-1024 & arg4) + 1024;
                if (~var5.field353 < -16385) {
                    var5.field353 = 16384;
                }
                var5.method105(var5.field353);
                if (class174.field3124 > 0 && class77.field1484 == null) {
                    class77.field1484 = new class71();
                    class77.field1484.field1418 = arg3;
                    arg3.method8(0, class77.field1484, class174.field3124);
                }
                if (class77.field1484 != null) {
                    if (class77.field1484.field1417[arg1] != null) {
                        throw new IllegalArgumentException();
                    }
                    class77.field1484.field1417[arg1] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class51 var6 = new class51(arg3, arg1);
                    var6.field338 = new int[(class121.field2268 ? 2 : 1) * 256];
                    var6.field367 = arg4;
                    var6.method95(arg2);
                    var6.field353 = arg0;
                    var6.method105(var6.field353);
                    if (~class174.field3124 < -1 && class77.field1484 == null) {
                        class77.field1484 = new class71();
                        class77.field1484.field1418 = arg3;
                        arg3.method8(0, class77.field1484, class174.field3124);
                    }
                    if (class77.field1484 != null) {
                        if (class77.field1484.field1417[arg1] != null) {
                            throw new IllegalArgumentException();
                        }
                        class77.field1484.field1417[arg1] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class14();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(ZI)[I")
    public final int[] method11(boolean arg0, int arg1) {
        if (!arg0) {
            method767(21, 23, (Component) null, (class1) null, 74);
        }
        int[] var3 = super.field1960.method699((byte) -74, arg1);
        ++field2237;
        if (super.field1960.field2007) {
            int[] var4 = this.method679(arg1, 0, (byte) -109);
            int[] var5 = this.method679(arg1, 1, (byte) -109);
            int var6 = this.field2241;
            if (var6 != 1) {
                if (~var6 != -3) {
                    if (~var6 != -4) {
                        if (var6 != 4) {
                            if (var6 != 5) {
                                if (~var6 != -7) {
                                    if (var6 != 7) {
                                        if (var6 != 8) {
                                            if (var6 != 9) {
                                                if (var6 != 10) {
                                                    if (var6 != 11) {
                                                        if (~var6 == -13) {
                                                            for (int var7 = 0; var7 < class155.field2796; ++var7) {
                                                                int var8 = var5[var7];
                                                                int var9 = var4[var7];
                                                                var3[var7] = -(var8 * var9 >> 11) + var8 + var9;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var10 = 0; ~var10 > ~class155.field2796; ++var10) {
                                                            int var11 = var5[var10];
                                                            int var12 = var4[var10];
                                                            var3[var10] = var11 >= var12 ? -var12 + var11 : -var11 + var12;
                                                        }
                                                    }
                                                } else {
                                                    for (int var13 = 0; ~class155.field2796 < ~var13; ++var13) {
                                                        int var14 = var4[var13];
                                                        int var15 = var5[var13];
                                                        var3[var13] = var14 <= var15 ? var15 : var14;
                                                    }
                                                }
                                            } else {
                                                for (int var16 = 0; ~class155.field2796 < ~var16; ++var16) {
                                                    int var17 = var4[var16];
                                                    int var18 = var5[var16];
                                                    var3[var16] = ~var18 >= ~var17 ? var18 : var17;
                                                }
                                            }
                                        } else {
                                            for (int var19 = 0; ~class155.field2796 < ~var19; ++var19) {
                                                int var20 = var4[var19];
                                                var3[var19] = ~var20 != -1 ? -((4096 - var5[var19] << 12) / var20) + 4096 : 0;
                                            }
                                        }
                                    } else {
                                        for (int var21 = 0; ~var21 > ~class155.field2796; ++var21) {
                                            int var22 = var4[var21];
                                            var3[var21] = ~var22 == -4097 ? 4096 : (var5[var21] << 12) / (-var22 + 4096);
                                        }
                                    }
                                } else {
                                    for (int var23 = 0; ~var23 > ~class155.field2796; ++var23) {
                                        int var24 = var5[var23];
                                        var3[var23] = var24 >= 2048 ? 4096 - ((-var4[var23] + 4096) * (-var24 + 4096) >> 11) : var4[var23] * var24 >> 11;
                                    }
                                }
                            } else {
                                for (int var25 = 0; class155.field2796 > var25; ++var25) {
                                    var3[var25] = -((-var4[var25] + 4096) * (-var5[var25] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var26 = 0; ~var26 > ~class155.field2796; ++var26) {
                                int var27 = var5[var26];
                                var3[var26] = var27 != 0 ? (var4[var26] << 12) / var27 : 4096;
                            }
                        }
                    } else {
                        for (int var28 = 0; var28 < class155.field2796; ++var28) {
                            var3[var28] = var4[var28] * var5[var28] >> 12;
                        }
                    }
                } else {
                    for (int var29 = 0; ~var29 > ~class155.field2796; ++var29) {
                        var3[var29] = var4[var29] - var5[var29];
                    }
                }
            } else {
                for (int var30 = 0; ~class155.field2796 < ~var30; ++var30) {
                    var3[var30] = var4[var30] + var5[var30];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lra;IZ)V")
    public final void method13(class185 arg0, int arg1, boolean arg2) {
        if (~arg1 != -1) {
            if (~arg1 == -2) {
                super.field1957 = ~arg0.method1243(3) == -2;
            }
        } else {
            this.field2241 = arg0.method1243(3);
        }
        ++field2239;
        if (arg2) {
            method766(-1);
        }
    }

    @OriginalMember(owner = "client!l", name = "f", descriptor = "(I)I")
    public static final int method768(int arg0) {
        ++field2236;
        int var1 = class202.method1341(112, class22.field538, class49.field1038, class198.field3700);
        if (~(var1 - class225.field4177) > -801 && ~(class9.field265[class49.field1038][class22.field538 >> 7][class198.field3700 >> 7] & 4) != -1) {
            return class49.field1038;
        } else {
            if (arg0 != 12) {
                field2238 = null;
            }
            return 3;
        }
    }
}
