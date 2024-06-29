import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class35 extends class634 {

    @OriginalMember(owner = "client!ud", name = "L", descriptor = "I")
    private int field379 = 6;

    @OriginalMember(owner = "client!ud", name = "I", descriptor = "[I")
    public static int[] field376 = new int[2048];

    @OriginalMember(owner = "client!ud", name = "M", descriptor = "Lpia;")
    public static class94 field380 = new class94(76, 6);

    @OriginalMember(owner = "client!ud", name = "N", descriptor = "Lpia;")
    public static class94 field381 = new class94(71, -1);

    @OriginalMember(owner = "client!ud", name = "F", descriptor = "I")
    public static int field373;

    @OriginalMember(owner = "client!ud", name = "G", descriptor = "I")
    public static int field374;

    @OriginalMember(owner = "client!ud", name = "H", descriptor = "I")
    public static int field375;

    @OriginalMember(owner = "client!ud", name = "J", descriptor = "I")
    public static int field377;

    @OriginalMember(owner = "client!ud", name = "K", descriptor = "I")
    public static int field378;

    @OriginalMember(owner = "client!ud", name = "O", descriptor = "Lwea;")
    public static class156 field382;

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(BI)[I")
    public final int[] method13(byte arg0, int arg1) {
        ++field375;
        if (arg0 > -55) {
            field380 = null;
        }
        int[] var3 = super.field9114.method1858(100, arg1);
        if (super.field9114.field3897) {
            int[] var4 = this.method3641(arg1, 20604, 0);
            int[] var5 = this.method3641(arg1, 20604, 1);
            int var6 = this.field379;
            if (~var6 != -2) {
                if (~var6 != -3) {
                    if (~var6 != -4) {
                        if (var6 != 4) {
                            if (~var6 != -6) {
                                if (~var6 != -7) {
                                    if (~var6 != -8) {
                                        if (var6 != 8) {
                                            if (~var6 != -10) {
                                                if (var6 != 10) {
                                                    if (var6 != 11) {
                                                        if (var6 == 12) {
                                                            for (int var7 = 0; class635.field9139 > var7; ++var7) {
                                                                int var8 = var5[var7];
                                                                int var9 = var4[var7];
                                                                var3[var7] = -(var8 * var9 >> 11) + var9 + var8;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var10 = 0; ~class635.field9139 < ~var10; ++var10) {
                                                            int var11 = var5[var10];
                                                            int var12 = var4[var10];
                                                            var3[var10] = ~var11 > ~var12 ? -var11 + var12 : -var12 + var11;
                                                        }
                                                    }
                                                } else {
                                                    for (int var13 = 0; class635.field9139 > var13; ++var13) {
                                                        int var14 = var4[var13];
                                                        int var15 = var5[var13];
                                                        var3[var13] = ~var14 < ~var15 ? var14 : var15;
                                                    }
                                                }
                                            } else {
                                                for (int var16 = 0; ~var16 > ~class635.field9139; ++var16) {
                                                    int var17 = var5[var16];
                                                    int var18 = var4[var16];
                                                    var3[var16] = ~var18 <= ~var17 ? var17 : var18;
                                                }
                                            }
                                        } else {
                                            for (int var19 = 0; class635.field9139 > var19; ++var19) {
                                                int var20 = var4[var19];
                                                var3[var19] = var20 != 0 ? -((-var5[var19] + 4096 << 12) / var20) + 4096 : 0;
                                            }
                                        }
                                    } else {
                                        for (int var21 = 0; ~var21 > ~class635.field9139; ++var21) {
                                            int var22 = var4[var21];
                                            var3[var21] = var22 == 4096 ? 4096 : (var5[var21] << 12) / (-var22 + 4096);
                                        }
                                    }
                                } else {
                                    for (int var23 = 0; ~var23 > ~class635.field9139; ++var23) {
                                        int var24 = var5[var23];
                                        var3[var23] = ~var24 > -2049 ? var4[var23] * var24 >> 11 : 4096 - ((-var4[var23] + 4096) * (-var24 + 4096) >> 11);
                                    }
                                }
                            } else {
                                for (int var25 = 0; var25 < class635.field9139; ++var25) {
                                    var3[var25] = 4096 - ((-var4[var25] + 4096) * (-var5[var25] + 4096) >> 12);
                                }
                            }
                        } else {
                            for (int var26 = 0; class635.field9139 > var26; ++var26) {
                                int var27 = var5[var26];
                                var3[var26] = ~var27 != -1 ? (var4[var26] << 12) / var27 : 4096;
                            }
                        }
                    } else {
                        for (int var28 = 0; ~class635.field9139 < ~var28; ++var28) {
                            var3[var28] = var4[var28] * var5[var28] >> 12;
                        }
                    }
                } else {
                    for (int var29 = 0; ~class635.field9139 < ~var29; ++var29) {
                        var3[var29] = var4[var29] + -var5[var29];
                    }
                }
            } else {
                for (int var30 = 0; class635.field9139 > var30; ++var30) {
                    var3[var30] = var4[var30] - -var5[var30];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lig;B)Laca;")
    public static final class724 method160(class244 arg0, byte arg1) {
        if (arg1 != 15) {
            method163((class361) null, false, (byte[][][]) null, 8, (byte) 62);
        }
        ++field378;
        class120 var2 = class486.method2935(arg0, 1);
        int var3 = arg0.method1438(127);
        int var4 = arg0.method1438(98);
        return new class724(var2.field1253, var2.field1245, var2.field1244, var2.field1247, var2.field1249, var2.field1250, var2.field1255, var2.field1258, var2.field1252, var3, var4);
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZZLjava/lang/String;I)Z")
    public static final boolean method161(boolean arg0, boolean arg1, String arg2, int arg3) {
        ++field374;
        if (~arg3 <= -3 && arg3 <= 36) {
            boolean var4 = false;
            boolean var5 = false;
            int var6 = 0;
            if (!arg1) {
                return true;
            } else {
                int var7 = arg2.length();
                for (int var8 = 0; var7 > var8; ++var8) {
                    char var9 = arg2.charAt(var8);
                    if (~var8 == -1) {
                        if (var9 == '-') {
                            var4 = true;
                            continue;
                        }
                        if (var9 == '+' && arg0) {
                            continue;
                        }
                    }
                    int var11;
                    if (var9 >= '0' && ~var9 >= -58) {
                        var11 = var9 - '0';
                    } else if (var9 >= 'A' && ~var9 >= -91) {
                        var11 = var9 - '7';
                    } else {
                        if (var9 < 'a' || ~var9 < -123) {
                            return false;
                        }
                        var11 = var9 - 'W';
                    }
                    if (var11 >= arg3) {
                        return false;
                    }
                    if (var4) {
                        var11 = -var11;
                    }
                    int var10 = arg3 * var6 + var11;
                    if (~(var10 / arg3) != ~var6) {
                        return false;
                    }
                    var6 = var10;
                    var5 = true;
                }
                return var5;
            }
        } else {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(ILig;Z)V")
    public final void method3(int arg0, class244 arg1, boolean arg2) {
        ++field377;
        if (~arg0 != -1) {
            if (~arg0 == -2) {
                super.field9121 = ~arg1.method1423(-80) == -2;
            }
        } else {
            this.field379 = arg1.method1423(-50);
        }
        if (arg2) {
            field382 = null;
        }
    }

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "(I)V")
    public static void method162(int arg0) {
        field380 = null;
        field381 = null;
        field382 = null;
        if (arg0 == 12) {
            field376 = null;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lrr;Z[[[BIB)Z")
    public static final boolean method163(class361 arg0, boolean arg1, byte[][][] arg2, int arg3, byte arg4) {
        if (!class292.field3592) {
            return false;
        } else {
            int var5 = arg0.field4635 >> class748.field10430;
            int var6 = var5;
            int var7 = arg0.field4629 >> class748.field10430;
            int var8 = var7;
            if (arg0 instanceof class340) {
                var6 = ((class340) arg0).field4390;
                var8 = ((class340) arg0).field4402;
                var5 = ((class340) arg0).field4395;
                var7 = ((class340) arg0).field4387;
            }
            for (int var9 = var5; var9 <= var6; ++var9) {
                for (int var10 = var7; var10 <= var8; ++var10) {
                    if (arg0.field4633 < class723.field10134 && var9 >= class224.field2576 && var9 < class97.field1021 && var10 >= class304.field3795 && var10 < class277.field3394) {
                        if ((arg2 == null || arg0.field4628 < arg3 || arg2[arg0.field4628][var9][var10] != arg4) && arg0.method1154(-1) && !arg0.method1152(-4)) {
                            return false;
                        }
                        if (!arg1 && var9 >= class440.field6387 - 16 && var9 <= class440.field6387 + 16 && var10 >= class444.field6433 - 16 && var10 <= class444.field6433 + 16) {
                            if (class625.field8980) {
                                class727.field10181[class701.field9892++].method3375(4438, arg0);
                                class701.field9892 %= class577.field8147;
                            } else {
                                arg0.method990(class563.field8026, 81);
                            }
                        }
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(BI)[[I")
    public final int[][] method7(byte arg0, int arg1) {
        ++field373;
        int[][] var3 = super.field9126.method132(0, arg1);
        if (super.field9126.field295) {
            int[][] var4 = this.method3642(0, arg1, true);
            int[][] var5 = this.method3642(1, arg1, true);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            int[] var12 = var5[0];
            int[] var13 = var5[1];
            int[] var14 = var5[2];
            int var15 = this.field379;
            if (var15 != 1) {
                if (var15 != 2) {
                    if (~var15 != -4) {
                        if (~var15 != -5) {
                            if (~var15 != -6) {
                                if (var15 != 6) {
                                    if (~var15 != -8) {
                                        if (~var15 != -9) {
                                            if (~var15 != -10) {
                                                if (~var15 != -11) {
                                                    if (~var15 != -12) {
                                                        if (var15 == 12) {
                                                            for (int var16 = 0; ~var16 > ~class635.field9139; ++var16) {
                                                                int var17 = var9[var16];
                                                                int var18 = var11[var16];
                                                                int var19 = var13[var16];
                                                                int var20 = var14[var16];
                                                                int var21 = var12[var16];
                                                                int var22 = var10[var16];
                                                                var6[var16] = -(var17 * var21 >> 11) + var17 - -var21;
                                                                var7[var16] = var19 + var22 + -(var19 * var22 >> 11);
                                                                var8[var16] = var18 + var20 + -(var18 * var20 >> 11);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var23 = 0; class635.field9139 > var23; ++var23) {
                                                            int var24 = var9[var23];
                                                            int var25 = var10[var23];
                                                            int var26 = var13[var23];
                                                            int var27 = var12[var23];
                                                            int var28 = var11[var23];
                                                            int var29 = var14[var23];
                                                            var6[var23] = ~var27 <= ~var24 ? var27 - var24 : -var27 + var24;
                                                            var7[var23] = ~var25 < ~var26 ? var25 - var26 : -var25 + var26;
                                                            var8[var23] = ~var29 <= ~var28 ? var29 - var28 : -var29 + var28;
                                                        }
                                                    }
                                                } else {
                                                    for (int var30 = 0; class635.field9139 > var30; ++var30) {
                                                        int var31 = var14[var30];
                                                        int var32 = var13[var30];
                                                        int var33 = var11[var30];
                                                        int var34 = var10[var30];
                                                        int var35 = var9[var30];
                                                        int var36 = var12[var30];
                                                        var6[var30] = ~var35 >= ~var36 ? var36 : var35;
                                                        var7[var30] = var32 < var34 ? var34 : var32;
                                                        var8[var30] = var33 > var31 ? var33 : var31;
                                                    }
                                                }
                                            } else {
                                                for (int var37 = 0; ~var37 > ~class635.field9139; ++var37) {
                                                    int var38 = var11[var37];
                                                    int var39 = var13[var37];
                                                    int var40 = var9[var37];
                                                    int var41 = var10[var37];
                                                    int var42 = var14[var37];
                                                    int var43 = var12[var37];
                                                    var6[var37] = var40 < var43 ? var40 : var43;
                                                    var7[var37] = var39 > var41 ? var41 : var39;
                                                    var8[var37] = ~var38 > ~var42 ? var38 : var42;
                                                }
                                            }
                                        } else {
                                            for (int var44 = 0; var44 < class635.field9139; ++var44) {
                                                int var45 = var9[var44];
                                                int var46 = var10[var44];
                                                int var47 = var11[var44];
                                                var6[var44] = var45 == 0 ? 0 : -((4096 - var12[var44] << 12) / var45) + 4096;
                                                var7[var44] = ~var46 != -1 ? 4096 - (-var13[var44] + 4096 << 12) / var46 : 0;
                                                var8[var44] = var47 != 0 ? -((-var14[var44] + 4096 << 12) / var47) + 4096 : 0;
                                            }
                                        }
                                    } else {
                                        for (int var48 = 0; ~class635.field9139 < ~var48; ++var48) {
                                            int var49 = var10[var48];
                                            int var50 = var11[var48];
                                            int var51 = var9[var48];
                                            var6[var48] = var51 == 4096 ? 4096 : (var12[var48] << 12) / (4096 - var51);
                                            var7[var48] = var49 == 4096 ? 4096 : (var13[var48] << 12) / (-var49 + 4096);
                                            var8[var48] = var50 != 4096 ? (var14[var48] << 12) / (-var50 + 4096) : 4096;
                                        }
                                    }
                                } else {
                                    for (int var52 = 0; ~var52 > ~class635.field9139; ++var52) {
                                        int var53 = var14[var52];
                                        int var54 = var13[var52];
                                        int var55 = var12[var52];
                                        var6[var52] = ~var55 > -2049 ? var9[var52] * var55 >> 11 : -((4096 - var9[var52]) * (-var55 + 4096) >> 11) + 4096;
                                        var7[var52] = var54 >= 2048 ? 4096 - ((4096 - var10[var52]) * (-var54 + 4096) >> 11) : var10[var52] * var54 >> 11;
                                        var8[var52] = var53 < 2048 ? var11[var52] * var53 >> 11 : -((-var11[var52] + 4096) * (-var53 + 4096) >> 11) + 4096;
                                    }
                                }
                            } else {
                                for (int var56 = 0; class635.field9139 > var56; ++var56) {
                                    var6[var56] = 4096 - ((-var9[var56] + 4096) * (-var12[var56] + 4096) >> 12);
                                    var7[var56] = 4096 - ((-var10[var56] + 4096) * (-var13[var56] + 4096) >> 12);
                                    var8[var56] = -((-var11[var56] + 4096) * (-var14[var56] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var57 = 0; var57 < class635.field9139; ++var57) {
                                int var58 = var13[var57];
                                int var59 = var12[var57];
                                int var60 = var14[var57];
                                var6[var57] = var59 != 0 ? (var9[var57] << 12) / var59 : 4096;
                                var7[var57] = ~var58 != -1 ? (var10[var57] << 12) / var58 : 4096;
                                var8[var57] = var60 == 0 ? 4096 : (var11[var57] << 12) / var60;
                            }
                        }
                    } else {
                        for (int var61 = 0; ~class635.field9139 < ~var61; ++var61) {
                            var6[var61] = var9[var61] * var12[var61] >> 12;
                            var7[var61] = var10[var61] * var13[var61] >> 12;
                            var8[var61] = var11[var61] * var14[var61] >> 12;
                        }
                    }
                } else {
                    for (int var62 = 0; class635.field9139 > var62; ++var62) {
                        var6[var62] = var9[var62] + -var12[var62];
                        var7[var62] = var10[var62] + -var13[var62];
                        var8[var62] = var11[var62] + -var14[var62];
                    }
                }
            } else {
                for (int var63 = 0; ~class635.field9139 < ~var63; ++var63) {
                    var6[var63] = var9[var63] + var12[var63];
                    var7[var63] = var10[var63] + var13[var63];
                    var8[var63] = var11[var63] - -var14[var63];
                }
            }
        }
        int var64 = 35 % ((-56 - arg0) / 53);
        return var3;
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "()V")
    public class35() {
        super(2, false);
    }
}
