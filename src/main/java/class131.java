import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eu")
public class class131 extends class202 {

    @OriginalMember(owner = "client!eu", name = "Q", descriptor = "I")
    private int field1777 = 6;

    @OriginalMember(owner = "client!eu", name = "I", descriptor = "Lss;")
    public static class213 field1769 = new class213("flash3:", "blinken3:", "clignotant3:", "brilho3:");

    @OriginalMember(owner = "client!eu", name = "S", descriptor = "I")
    public static int field1779 = -1;

    @OriginalMember(owner = "client!eu", name = "T", descriptor = "I")
    public static int field1780 = 0;

    @OriginalMember(owner = "client!eu", name = "U", descriptor = "F")
    public static float field1781 = 0.0F;

    @OriginalMember(owner = "client!eu", name = "J", descriptor = "I")
    public static int field1770;

    @OriginalMember(owner = "client!eu", name = "K", descriptor = "I")
    public static int field1771;

    @OriginalMember(owner = "client!eu", name = "L", descriptor = "I")
    public static int field1772;

    @OriginalMember(owner = "client!eu", name = "M", descriptor = "I")
    public static int field1773;

    @OriginalMember(owner = "client!eu", name = "N", descriptor = "I")
    public static int field1774;

    @OriginalMember(owner = "client!eu", name = "O", descriptor = "I")
    public static int field1775;

    @OriginalMember(owner = "client!eu", name = "P", descriptor = "I")
    public static int field1776;

    @OriginalMember(owner = "client!eu", name = "R", descriptor = "I")
    public static int field1778;

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(IZ)[I")
    public final int[] method41(int arg0, boolean arg1) {
        ++field1776;
        int[] var3 = super.field3064.method2452((byte) 27, arg0);
        if (!arg1) {
            field1779 = -33;
        }
        if (super.field3064.field5837) {
            int[] var4 = this.method1376(1046794076, 0, arg0);
            int[] var5 = this.method1376(1046794076, 1, arg0);
            int var6 = this.field1777;
            if (~var6 != -2) {
                if (var6 != 2) {
                    if (~var6 != -4) {
                        if (var6 != 4) {
                            if (~var6 != -6) {
                                if (~var6 != -7) {
                                    if (var6 != 7) {
                                        if (var6 != 8) {
                                            if (~var6 != -10) {
                                                if (var6 != 10) {
                                                    if (~var6 != -12) {
                                                        if (var6 == 12) {
                                                            for (int var7 = 0; ~class276.field4375 < ~var7; ++var7) {
                                                                int var8 = var5[var7];
                                                                int var9 = var4[var7];
                                                                var3[var7] = var8 + var9 + -(var8 * var9 >> 11);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var10 = 0; class276.field4375 > var10; ++var10) {
                                                            int var11 = var5[var10];
                                                            int var12 = var4[var10];
                                                            var3[var10] = var12 > var11 ? var12 - var11 : -var12 + var11;
                                                        }
                                                    }
                                                } else {
                                                    for (int var13 = 0; ~class276.field4375 < ~var13; ++var13) {
                                                        int var14 = var5[var13];
                                                        int var15 = var4[var13];
                                                        var3[var13] = ~var14 > ~var15 ? var15 : var14;
                                                    }
                                                }
                                            } else {
                                                for (int var16 = 0; class276.field4375 > var16; ++var16) {
                                                    int var17 = var4[var16];
                                                    int var18 = var5[var16];
                                                    var3[var16] = ~var17 <= ~var18 ? var18 : var17;
                                                }
                                            }
                                        } else {
                                            for (int var19 = 0; class276.field4375 > var19; ++var19) {
                                                int var20 = var4[var19];
                                                var3[var19] = ~var20 == -1 ? 0 : -((4096 - var5[var19] << 12) / var20) + 4096;
                                            }
                                        }
                                    } else {
                                        for (int var21 = 0; class276.field4375 > var21; ++var21) {
                                            int var22 = var4[var21];
                                            var3[var21] = var22 == 4096 ? 4096 : (var5[var21] << 12) / (-var22 + 4096);
                                        }
                                    }
                                } else {
                                    for (int var23 = 0; ~class276.field4375 < ~var23; ++var23) {
                                        int var24 = var5[var23];
                                        var3[var23] = var24 < 2048 ? var4[var23] * var24 >> 11 : 4096 - ((4096 - var4[var23]) * (-var24 + 4096) >> 11);
                                    }
                                }
                            } else {
                                for (int var25 = 0; class276.field4375 > var25; ++var25) {
                                    var3[var25] = -((4096 - var4[var25]) * (4096 - var5[var25]) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var26 = 0; ~class276.field4375 < ~var26; ++var26) {
                                int var27 = var5[var26];
                                var3[var26] = var27 != 0 ? (var4[var26] << 12) / var27 : 4096;
                            }
                        }
                    } else {
                        for (int var28 = 0; var28 < class276.field4375; ++var28) {
                            var3[var28] = var4[var28] * var5[var28] >> 12;
                        }
                    }
                } else {
                    for (int var29 = 0; ~var29 > ~class276.field4375; ++var29) {
                        var3[var29] = var4[var29] - var5[var29];
                    }
                }
            } else {
                for (int var30 = 0; class276.field4375 > var30; ++var30) {
                    var3[var30] = var4[var30] + var5[var30];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!eu", name = "d", descriptor = "(Z)V")
    public static void method812(boolean arg0) {
        if (!arg0) {
            field1769 = null;
        }
    }

    @OriginalMember(owner = "client!eu", name = "c", descriptor = "(II)V")
    public static final void method813(int arg0, int arg1) {
        ++field1772;
        class456 var2 = class233.method1654(arg1, 8, arg0 ^ -11138);
        var2.method2862(arg0 ^ arg0);
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(Lhw;BI)V")
    public final void method40(class208 arg0, byte arg1, int arg2) {
        if (arg2 != 0) {
            if (arg2 == 1) {
                super.field3071 = arg0.method1445(-125) == 1;
            }
        } else {
            this.field1777 = arg0.method1445(-109);
        }
        ++field1771;
        int var5 = 36 % ((-46 - arg1) / 50);
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "([BB)Laa;")
    public static final class57 method814(byte[] arg0, byte arg1) {
        ++field1775;
        class57 var2 = new class57();
        class208 var3 = new class208(arg0);
        var3.field3162 = var3.field3193.length + -2;
        int var4 = var3.method1455(-3387);
        int var5 = -var4 - 12 + var3.field3193.length + -2;
        var3.field3162 = var5;
        int var6 = var3.method1436((byte) 100);
        if (arg1 != 74) {
            field1769 = null;
        }
        var2.field916 = var3.method1455(-3387);
        var2.field924 = var3.method1455(-3387);
        var2.field915 = var3.method1455(-3387);
        var2.field912 = var3.method1455(-3387);
        int var7 = var3.method1445(arg1 + -192);
        if (var7 > 0) {
            var2.field911 = new class177[var7];
            for (int var8 = 0; ~var7 < ~var8; ++var8) {
                int var9 = var3.method1455(-3387);
                class177 var10 = new class177(class123.method774(121, var9));
                var2.field911[var8] = var10;
                while (var9-- > 0) {
                    int var11 = var3.method1436((byte) 119);
                    int var12 = var3.method1436((byte) 115);
                    var10.method1127(new class330(var12), (byte) 52, (long) var11);
                }
            }
        }
        var3.field3162 = 0;
        var2.field922 = var3.method1428(0);
        var2.field918 = new int[var6];
        var2.field919 = new int[var6];
        var2.field917 = new String[var6];
        int var13 = 0;
        while (var3.field3162 < var5) {
            int var14 = var3.method1455(-3387);
            if (~var14 != -4) {
                if (~var14 > -101 && ~var14 != -22 && var14 != 38 && var14 != 39) {
                    var2.field918[var13] = var3.method1436((byte) 127);
                } else {
                    var2.field918[var13] = var3.method1445(83);
                }
            } else {
                var2.field917[var13] = var3.method1448(class229.method1643(arg1, 65461)).intern();
            }
            var2.field919[var13++] = var14;
        }
        return var2;
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(II)[[I")
    public final int[][] method44(int arg0, int arg1) {
        ++field1774;
        if (arg0 != -1) {
            this.method40((class208) null, (byte) 71, 51);
        }
        int[][] var3 = super.field3081.method1050(arg1, -128);
        if (super.field3081.field2432) {
            int[][] var4 = this.method1382(0, arg1, 58);
            int[][] var5 = this.method1382(1, arg1, arg0 + 119);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            int[] var12 = var5[0];
            int[] var13 = var5[1];
            int[] var14 = var5[2];
            int var15 = this.field1777;
            if (~var15 != -2) {
                if (~var15 != -3) {
                    if (var15 != 3) {
                        if (var15 != 4) {
                            if (var15 != 5) {
                                if (var15 != 6) {
                                    if (var15 != 7) {
                                        if (var15 != 8) {
                                            if (var15 != 9) {
                                                if (var15 != 10) {
                                                    if (~var15 != -12) {
                                                        if (~var15 == -13) {
                                                            for (int var16 = 0; class276.field4375 > var16; ++var16) {
                                                                int var17 = var11[var16];
                                                                int var18 = var9[var16];
                                                                int var19 = var12[var16];
                                                                int var20 = var10[var16];
                                                                int var21 = var13[var16];
                                                                int var22 = var14[var16];
                                                                var6[var16] = -(var18 * var19 >> 11) + var19 + var18;
                                                                var7[var16] = -(var20 * var21 >> 11) + var20 - -var21;
                                                                var8[var16] = -(var17 * var22 >> 11) + var17 + var22;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var23 = 0; ~class276.field4375 < ~var23; ++var23) {
                                                            int var24 = var14[var23];
                                                            int var25 = var12[var23];
                                                            int var26 = var13[var23];
                                                            int var27 = var9[var23];
                                                            int var28 = var10[var23];
                                                            int var29 = var11[var23];
                                                            var6[var23] = var25 >= var27 ? -var27 + var25 : -var25 + var27;
                                                            var7[var23] = ~var28 >= ~var26 ? -var28 + var26 : -var26 + var28;
                                                            var8[var23] = var29 <= var24 ? -var29 + var24 : -var24 + var29;
                                                        }
                                                    }
                                                } else {
                                                    for (int var30 = 0; ~class276.field4375 < ~var30; ++var30) {
                                                        int var31 = var11[var30];
                                                        int var32 = var12[var30];
                                                        int var33 = var9[var30];
                                                        int var34 = var14[var30];
                                                        int var35 = var13[var30];
                                                        int var36 = var10[var30];
                                                        var6[var30] = ~var33 >= ~var32 ? var32 : var33;
                                                        var7[var30] = ~var36 >= ~var35 ? var35 : var36;
                                                        var8[var30] = ~var31 >= ~var34 ? var34 : var31;
                                                    }
                                                }
                                            } else {
                                                for (int var37 = 0; ~var37 > ~class276.field4375; ++var37) {
                                                    int var38 = var12[var37];
                                                    int var39 = var9[var37];
                                                    int var40 = var13[var37];
                                                    int var41 = var14[var37];
                                                    int var42 = var11[var37];
                                                    int var43 = var10[var37];
                                                    var6[var37] = var39 < var38 ? var39 : var38;
                                                    var7[var37] = var43 < var40 ? var43 : var40;
                                                    var8[var37] = var42 >= var41 ? var41 : var42;
                                                }
                                            }
                                        } else {
                                            for (int var44 = 0; ~var44 > ~class276.field4375; ++var44) {
                                                int var45 = var10[var44];
                                                int var46 = var11[var44];
                                                int var47 = var9[var44];
                                                var6[var44] = var47 == 0 ? 0 : -((-var12[var44] + 4096 << 12) / var47) + 4096;
                                                var7[var44] = var45 != 0 ? -((-var13[var44] + 4096 << 12) / var45) + 4096 : 0;
                                                var8[var44] = ~var46 == -1 ? 0 : -((-var14[var44] + 4096 << 12) / var46) + 4096;
                                            }
                                        }
                                    } else {
                                        for (int var48 = 0; var48 < class276.field4375; ++var48) {
                                            int var49 = var10[var48];
                                            int var50 = var9[var48];
                                            int var51 = var11[var48];
                                            var6[var48] = ~var50 != -4097 ? (var12[var48] << 12) / (-var50 + 4096) : 4096;
                                            var7[var48] = ~var49 != -4097 ? (var13[var48] << 12) / (-var49 + 4096) : 4096;
                                            var8[var48] = ~var51 != -4097 ? (var14[var48] << 12) / (-var51 + 4096) : 4096;
                                        }
                                    }
                                } else {
                                    for (int var52 = 0; class276.field4375 > var52; ++var52) {
                                        int var53 = var14[var52];
                                        int var54 = var12[var52];
                                        int var55 = var13[var52];
                                        var6[var52] = ~var54 <= -2049 ? 4096 - ((-var9[var52] + 4096) * (-var54 + 4096) >> 11) : var9[var52] * var54 >> 11;
                                        var7[var52] = var55 < 2048 ? var10[var52] * var55 >> 11 : -((-var10[var52] + 4096) * (-var55 + 4096) >> 11) + 4096;
                                        var8[var52] = var53 >= 2048 ? 4096 - ((4096 - var53) * (-var11[var52] + 4096) >> 11) : var11[var52] * var53 >> 11;
                                    }
                                }
                            } else {
                                for (int var56 = 0; ~class276.field4375 < ~var56; ++var56) {
                                    var6[var56] = -((4096 - var9[var56]) * (4096 - var12[var56]) >> 12) + 4096;
                                    var7[var56] = 4096 - ((-var10[var56] + 4096) * (-var13[var56] + 4096) >> 12);
                                    var8[var56] = -((-var11[var56] + 4096) * (-var14[var56] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var57 = 0; var57 < class276.field4375; ++var57) {
                                int var58 = var12[var57];
                                int var59 = var14[var57];
                                int var60 = var13[var57];
                                var6[var57] = var58 == 0 ? 4096 : (var9[var57] << 12) / var58;
                                var7[var57] = var60 != 0 ? (var10[var57] << 12) / var60 : 4096;
                                var8[var57] = var59 == 0 ? 4096 : (var11[var57] << 12) / var59;
                            }
                        }
                    } else {
                        for (int var61 = 0; ~class276.field4375 < ~var61; ++var61) {
                            var6[var61] = var9[var61] * var12[var61] >> 12;
                            var7[var61] = var10[var61] * var13[var61] >> 12;
                            var8[var61] = var11[var61] * var14[var61] >> 12;
                        }
                    }
                } else {
                    for (int var62 = 0; class276.field4375 > var62; ++var62) {
                        var6[var62] = var9[var62] - var12[var62];
                        var7[var62] = var10[var62] + -var13[var62];
                        var8[var62] = var11[var62] - var14[var62];
                    }
                }
            } else {
                for (int var63 = 0; ~var63 > ~class276.field4375; ++var63) {
                    var6[var63] = var9[var63] + var12[var63];
                    var7[var63] = var10[var63] + var13[var63];
                    var8[var63] = var11[var63] + var14[var63];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!eu", name = "b", descriptor = "(B)V")
    public static final void method815(byte arg0) {
        ++field1778;
        class486.field7371 = 0;
        class357.field5540 = new class17[50];
        if (arg0 <= 0) {
            method813(-92, 114);
        }
    }

    @OriginalMember(owner = "client!eu", name = "<init>", descriptor = "()V")
    public class131() {
        super(2, false);
    }

    @OriginalMember(owner = "client!eu", name = "g", descriptor = "(I)V")
    public static final void method816(int arg0) {
        if (!class486.method2983((byte) 38, class148.field1994) && !class225.method1624(true, class148.field1994)) {
            int var1 = class358.field5565.field894[0] >> 3;
            int var2 = class358.field5565.field899[0] >> 3;
            if (var1 >= 0 && ~(class135.field1839 >> 3) < ~var1 && var2 >= 0 && class197.field3038 >> 3 > var2) {
                class13.method77(var2, arg0 + 1827880835, 5000, var1);
            } else {
                class13.method77(class197.field3038 >> 4, 1827898632, 0, class135.field1839 >> 4);
            }
        } else {
            class13.method77(class98.field1404 >> 10, 1827898632, 5000, class163.field2367 >> 10);
        }
        ++field1770;
        if (arg0 == 17797) {
            class418.method2669((byte) 107);
            class148.method901(96);
            class315.method2105((byte) -81);
            class490.method3008(-119);
        }
    }
}
