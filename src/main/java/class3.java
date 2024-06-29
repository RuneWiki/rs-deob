import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class3 extends class272 {

    @OriginalMember(owner = "client!pd", name = "Q", descriptor = "I")
    private int field68 = 6;

    @OriginalMember(owner = "client!pd", name = "N", descriptor = "Lli;")
    public static class185 field65 = class245.method1649("null", -22);

    @OriginalMember(owner = "client!pd", name = "W", descriptor = "J")
    public static long field74 = 0L;

    @OriginalMember(owner = "client!pd", name = "V", descriptor = "Lli;")
    private static class185 field73 = class245.method1649("slide:", -29);

    @OriginalMember(owner = "client!pd", name = "P", descriptor = "Lli;")
    public static class185 field67 = field73;

    @OriginalMember(owner = "client!pd", name = "X", descriptor = "Lli;")
    private static class185 field75 = class245.method1649("scroll:", 125);

    @OriginalMember(owner = "client!pd", name = "L", descriptor = "Lli;")
    public static class185 field63 = field73;

    @OriginalMember(owner = "client!pd", name = "J", descriptor = "Lli;")
    public static class185 field61 = field75;

    @OriginalMember(owner = "client!pd", name = "O", descriptor = "Lli;")
    public static class185 field66 = field75;

    @OriginalMember(owner = "client!pd", name = "I", descriptor = "I")
    public static int field60;

    @OriginalMember(owner = "client!pd", name = "K", descriptor = "I")
    public static int field62;

    @OriginalMember(owner = "client!pd", name = "M", descriptor = "I")
    public static int field64;

    @OriginalMember(owner = "client!pd", name = "R", descriptor = "I")
    public static int field69;

    @OriginalMember(owner = "client!pd", name = "S", descriptor = "I")
    public static int field70;

    @OriginalMember(owner = "client!pd", name = "T", descriptor = "I")
    public static int field71;

    @OriginalMember(owner = "client!pd", name = "U", descriptor = "I")
    public static int field72;

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "()V")
    public class3() {
        super(2, false);
    }

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "(I)V")
    public static void method31(int arg0) {
        field65 = null;
        field63 = null;
        field67 = null;
        field75 = null;
        if (arg0 == 13255) {
            field66 = null;
            field61 = null;
            field73 = null;
        }
    }

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "(IB)[[I")
    public final int[][] method32(int arg0, byte arg1) {
        ++field71;
        int var3 = 120 / ((-60 - arg1) / 45);
        int[][] var4 = super.field4818.method1514(-2, arg0);
        if (super.field4818.field3954) {
            int[][] var5 = this.method1860(arg0, 3, 0);
            int[][] var6 = this.method1860(arg0, 3, 1);
            int[] var7 = var4[2];
            int[] var8 = var4[0];
            int[] var9 = var4[1];
            int[] var10 = var5[0];
            int[] var11 = var5[1];
            int[] var12 = var5[2];
            int[] var13 = var6[1];
            int[] var14 = var6[0];
            int[] var15 = var6[2];
            int var16 = this.field68;
            if (~var16 != -2) {
                if (~var16 != -3) {
                    if (var16 != 3) {
                        if (var16 != 4) {
                            if (var16 != 5) {
                                if (~var16 != -7) {
                                    if (var16 != 7) {
                                        if (~var16 != -9) {
                                            if (~var16 != -10) {
                                                if (var16 != 10) {
                                                    if (var16 != 11) {
                                                        if (~var16 == -13) {
                                                            for (int var17 = 0; var17 < class246.field4385; ++var17) {
                                                                int var18 = var10[var17];
                                                                int var19 = var11[var17];
                                                                int var20 = var13[var17];
                                                                int var21 = var14[var17];
                                                                int var22 = var15[var17];
                                                                int var23 = var12[var17];
                                                                var8[var17] = -(var18 * var21 >> 11) + var18 + var21;
                                                                var9[var17] = var19 - -var20 + -(var19 * var20 >> 11);
                                                                var7[var17] = var22 + var23 + -(var22 * var23 >> 11);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var24 = 0; class246.field4385 > var24; ++var24) {
                                                            int var25 = var14[var24];
                                                            int var26 = var11[var24];
                                                            int var27 = var13[var24];
                                                            int var28 = var10[var24];
                                                            int var29 = var12[var24];
                                                            int var30 = var15[var24];
                                                            var8[var24] = ~var28 < ~var25 ? -var25 + var28 : -var28 + var25;
                                                            var9[var24] = ~var26 < ~var27 ? -var27 + var26 : -var26 + var27;
                                                            var7[var24] = var29 <= var30 ? -var29 + var30 : -var30 + var29;
                                                        }
                                                    }
                                                } else {
                                                    for (int var31 = 0; ~class246.field4385 < ~var31; ++var31) {
                                                        int var32 = var11[var31];
                                                        int var33 = var10[var31];
                                                        int var34 = var15[var31];
                                                        int var35 = var14[var31];
                                                        int var36 = var12[var31];
                                                        int var37 = var13[var31];
                                                        var8[var31] = ~var33 < ~var35 ? var33 : var35;
                                                        var9[var31] = ~var32 < ~var37 ? var32 : var37;
                                                        var7[var31] = ~var34 <= ~var36 ? var34 : var36;
                                                    }
                                                }
                                            } else {
                                                for (int var38 = 0; class246.field4385 > var38; ++var38) {
                                                    int var39 = var11[var38];
                                                    int var40 = var15[var38];
                                                    int var41 = var14[var38];
                                                    int var42 = var13[var38];
                                                    int var43 = var12[var38];
                                                    int var44 = var10[var38];
                                                    var8[var38] = ~var44 <= ~var41 ? var41 : var44;
                                                    var9[var38] = var39 >= var42 ? var42 : var39;
                                                    var7[var38] = ~var40 >= ~var43 ? var40 : var43;
                                                }
                                            }
                                        } else {
                                            for (int var45 = 0; class246.field4385 > var45; ++var45) {
                                                int var46 = var10[var45];
                                                int var47 = var11[var45];
                                                int var48 = var12[var45];
                                                var8[var45] = var46 != 0 ? -((4096 - var14[var45] << 12) / var46) + 4096 : 0;
                                                var9[var45] = var47 == 0 ? 0 : 4096 - (-var13[var45] + 4096 << 12) / var47;
                                                var7[var45] = var48 != 0 ? -((4096 - var15[var45] << 12) / var48) + 4096 : 0;
                                            }
                                        }
                                    } else {
                                        for (int var49 = 0; var49 < class246.field4385; ++var49) {
                                            int var50 = var12[var49];
                                            int var51 = var10[var49];
                                            int var52 = var11[var49];
                                            var8[var49] = var51 != 4096 ? (var14[var49] << 12) / (4096 - var51) : 4096;
                                            var9[var49] = ~var52 == -4097 ? 4096 : (var13[var49] << 12) / (4096 - var52);
                                            var7[var49] = var50 != 4096 ? (var15[var49] << 12) / (-var50 + 4096) : 4096;
                                        }
                                    }
                                } else {
                                    for (int var53 = 0; var53 < class246.field4385; ++var53) {
                                        int var54 = var15[var53];
                                        int var55 = var13[var53];
                                        int var56 = var14[var53];
                                        var8[var53] = var56 < 2048 ? var10[var53] * var56 >> 11 : 4096 - ((-var10[var53] + 4096) * (-var56 + 4096) >> 11);
                                        var9[var53] = var55 >= 2048 ? -((-var11[var53] + 4096) * (-var55 + 4096) >> 11) + 4096 : var11[var53] * var55 >> 11;
                                        var7[var53] = ~var54 > -2049 ? var12[var53] * var54 >> 11 : -((-var12[var53] + 4096) * (-var54 + 4096) >> 11) + 4096;
                                    }
                                }
                            } else {
                                for (int var57 = 0; class246.field4385 > var57; ++var57) {
                                    var8[var57] = -((4096 - var14[var57]) * (-var10[var57] + 4096) >> 12) + 4096;
                                    var9[var57] = -((-var11[var57] + 4096) * (-var13[var57] + 4096) >> 12) + 4096;
                                    var7[var57] = -((-var12[var57] + 4096) * (-var15[var57] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var58 = 0; ~class246.field4385 < ~var58; ++var58) {
                                int var59 = var14[var58];
                                int var60 = var13[var58];
                                int var61 = var15[var58];
                                var8[var58] = ~var59 != -1 ? (var10[var58] << 12) / var59 : 4096;
                                var9[var58] = var60 != 0 ? (var11[var58] << 12) / var60 : 4096;
                                var7[var58] = var61 == 0 ? 4096 : (var12[var58] << 12) / var61;
                            }
                        }
                    } else {
                        for (int var62 = 0; var62 < class246.field4385; ++var62) {
                            var8[var62] = var10[var62] * var14[var62] >> 12;
                            var9[var62] = var11[var62] * var13[var62] >> 12;
                            var7[var62] = var12[var62] * var15[var62] >> 12;
                        }
                    }
                } else {
                    for (int var63 = 0; ~class246.field4385 < ~var63; ++var63) {
                        var8[var63] = var10[var63] + -var14[var63];
                        var9[var63] = var11[var63] + -var13[var63];
                        var7[var63] = var12[var63] + -var15[var63];
                    }
                }
            } else {
                for (int var64 = 0; ~class246.field4385 < ~var64; ++var64) {
                    var8[var64] = var10[var64] + var14[var64];
                    var9[var64] = var11[var64] + var13[var64];
                    var7[var64] = var12[var64] + var15[var64];
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;B)V")
    public static final void method33(String arg0, Throwable arg1, byte arg2) {
        ++field72;
        try {
            String var3 = "";
            if (arg1 != null) {
                var3 = class212.method1484(4, arg1);
            }
            if (arg0 != null) {
                if (arg1 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg0;
            }
            class137.method982(119, var3);
            String var4 = var3.replace(':', '.');
            String var5 = var4.replace('@', '_');
            String var6 = var5.replace('&', '_');
            String var7 = var6.replace('#', '_');
            if (class111.field2014.field3022 != null) {
                if (arg2 >= 114) {
                    class29 var8 = class111.field2014.method1157(0, new URL(class111.field2014.field3022.getCodeBase(), "clienterror.ws?c=" + class113.field2037 + "&u=" + class130.field2326 + "&v1=" + class160.field3031 + "&v2=" + class160.field3019 + "&e=" + var7));
                    while (~var8.field487 == -1) {
                        class212.method1488(1L, -107);
                    }
                    if (var8.field487 == 1) {
                        DataInputStream var9 = (DataInputStream) var8.field486;
                        var9.read();
                        var9.close();
                    }
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Ljd;BI)V")
    public final void method34(class118 arg0, byte arg1, int arg2) {
        if (~arg2 != -1) {
            if (~arg2 == -2) {
                super.field4832 = ~arg0.method867(false) == -2;
            }
        } else {
            this.field68 = arg0.method867(false);
        }
        int var5 = 84 % ((-21 - arg1) / 55);
        ++field64;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(II)[I")
    public final int[] method35(int arg0, int arg1) {
        if (arg1 != 4421) {
            this.method35(-9, 19);
        }
        int[] var3 = super.field4819.method1632(0, arg0);
        ++field62;
        if (super.field4819.field4294) {
            int[] var4 = this.method1866(arg0, 0, arg1 ^ 4364);
            int[] var5 = this.method1866(arg0, 1, 101);
            int var6 = this.field68;
            if (~var6 != -2) {
                if (~var6 != -3) {
                    if (~var6 != -4) {
                        if (var6 != 4) {
                            if (var6 != 5) {
                                if (~var6 != -7) {
                                    if (~var6 != -8) {
                                        if (var6 != 8) {
                                            if (~var6 != -10) {
                                                if (~var6 != -11) {
                                                    if (var6 != 11) {
                                                        if (var6 == 12) {
                                                            for (int var7 = 0; class246.field4385 > var7; ++var7) {
                                                                int var8 = var5[var7];
                                                                int var9 = var4[var7];
                                                                var3[var7] = -(var8 * var9 >> 11) + var8 + var9;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var10 = 0; class246.field4385 > var10; ++var10) {
                                                            int var11 = var4[var10];
                                                            int var12 = var5[var10];
                                                            var3[var10] = ~var11 >= ~var12 ? -var11 + var12 : var11 - var12;
                                                        }
                                                    }
                                                } else {
                                                    for (int var13 = 0; class246.field4385 > var13; ++var13) {
                                                        int var14 = var5[var13];
                                                        int var15 = var4[var13];
                                                        var3[var13] = var14 >= var15 ? var14 : var15;
                                                    }
                                                }
                                            } else {
                                                for (int var16 = 0; class246.field4385 > var16; ++var16) {
                                                    int var17 = var4[var16];
                                                    int var18 = var5[var16];
                                                    var3[var16] = ~var18 < ~var17 ? var17 : var18;
                                                }
                                            }
                                        } else {
                                            for (int var19 = 0; ~var19 > ~class246.field4385; ++var19) {
                                                int var20 = var4[var19];
                                                var3[var19] = ~var20 == -1 ? 0 : 4096 - (4096 - var5[var19] << 12) / var20;
                                            }
                                        }
                                    } else {
                                        for (int var21 = 0; ~class246.field4385 < ~var21; ++var21) {
                                            int var22 = var4[var21];
                                            var3[var21] = var22 != 4096 ? (var5[var21] << 12) / (4096 - var22) : 4096;
                                        }
                                    }
                                } else {
                                    for (int var23 = 0; ~var23 > ~class246.field4385; ++var23) {
                                        int var24 = var5[var23];
                                        var3[var23] = var24 >= 2048 ? 4096 - ((-var4[var23] + 4096) * (-var24 + 4096) >> 11) : var4[var23] * var24 >> 11;
                                    }
                                }
                            } else {
                                for (int var25 = 0; ~class246.field4385 < ~var25; ++var25) {
                                    var3[var25] = -((4096 - var4[var25]) * (4096 - var5[var25]) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var26 = 0; ~class246.field4385 < ~var26; ++var26) {
                                int var27 = var5[var26];
                                var3[var26] = ~var27 != -1 ? (var4[var26] << 12) / var27 : 4096;
                            }
                        }
                    } else {
                        for (int var28 = 0; var28 < class246.field4385; ++var28) {
                            var3[var28] = var4[var28] * var5[var28] >> 12;
                        }
                    }
                } else {
                    for (int var29 = 0; ~var29 > ~class246.field4385; ++var29) {
                        var3[var29] = var4[var29] + -var5[var29];
                    }
                }
            } else {
                for (int var30 = 0; var30 < class246.field4385; ++var30) {
                    var3[var30] = var4[var30] - -var5[var30];
                }
            }
        }
        return var3;
    }
}
