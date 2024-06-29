import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class269 extends class144 {

    @OriginalMember(owner = "client!pf", name = "O", descriptor = "I")
    private int field3933 = 6;

    @OriginalMember(owner = "client!pf", name = "I", descriptor = "Ljava/lang/String;")
    public static String field3927 = "flash1:";

    @OriginalMember(owner = "client!pf", name = "M", descriptor = "[Ljava/lang/String;")
    public static String[] field3931 = new String[] { "en", "de", "fr", "pt" };

    @OriginalMember(owner = "client!pf", name = "R", descriptor = "Z")
    public static boolean field3936 = true;

    @OriginalMember(owner = "client!pf", name = "J", descriptor = "I")
    public static int field3928;

    @OriginalMember(owner = "client!pf", name = "K", descriptor = "I")
    public static int field3929;

    @OriginalMember(owner = "client!pf", name = "L", descriptor = "I")
    public static int field3930;

    @OriginalMember(owner = "client!pf", name = "N", descriptor = "I")
    public static int field3932;

    @OriginalMember(owner = "client!pf", name = "P", descriptor = "I")
    public static int field3934;

    @OriginalMember(owner = "client!pf", name = "Q", descriptor = "I")
    public static int field3935;

    @OriginalMember(owner = "client!pf", name = "S", descriptor = "I")
    public static int field3937;

    @OriginalMember(owner = "client!pf", name = "T", descriptor = "I")
    public static int field3938;

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(II)[I")
    public final int[] method12(int arg0, int arg1) {
        ++field3935;
        if (arg1 != 255) {
            method1726(50);
        }
        int[] var3 = super.field2069.method425(true, arg0);
        if (super.field2069.field820) {
            int[] var4 = this.method934(arg1 + -19132, 0, arg0);
            int[] var5 = this.method934(-18877, 1, arg0);
            int var6 = this.field3933;
            if (~var6 != -2) {
                if (var6 != 2) {
                    if (var6 != 3) {
                        if (~var6 != -5) {
                            if (~var6 != -6) {
                                if (var6 != 6) {
                                    if (~var6 != -8) {
                                        if (~var6 != -9) {
                                            if (~var6 != -10) {
                                                if (~var6 != -11) {
                                                    if (~var6 != -12) {
                                                        if (var6 == 12) {
                                                            for (int var7 = 0; ~class104.field1411 < ~var7; ++var7) {
                                                                int var8 = var4[var7];
                                                                int var9 = var5[var7];
                                                                var3[var7] = var8 + var9 + -(var8 * var9 >> 11);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var10 = 0; var10 < class104.field1411; ++var10) {
                                                            int var11 = var4[var10];
                                                            int var12 = var5[var10];
                                                            var3[var10] = ~var11 >= ~var12 ? -var11 + var12 : var11 - var12;
                                                        }
                                                    }
                                                } else {
                                                    for (int var13 = 0; class104.field1411 > var13; ++var13) {
                                                        int var14 = var4[var13];
                                                        int var15 = var5[var13];
                                                        var3[var13] = ~var15 > ~var14 ? var14 : var15;
                                                    }
                                                }
                                            } else {
                                                for (int var16 = 0; ~var16 > ~class104.field1411; ++var16) {
                                                    int var17 = var5[var16];
                                                    int var18 = var4[var16];
                                                    var3[var16] = ~var18 <= ~var17 ? var17 : var18;
                                                }
                                            }
                                        } else {
                                            for (int var19 = 0; ~class104.field1411 < ~var19; ++var19) {
                                                int var20 = var4[var19];
                                                var3[var19] = ~var20 == -1 ? 0 : 4096 - (-var5[var19] + 4096 << 12) / var20;
                                            }
                                        }
                                    } else {
                                        for (int var21 = 0; ~class104.field1411 < ~var21; ++var21) {
                                            int var22 = var4[var21];
                                            var3[var21] = var22 != 4096 ? (var5[var21] << 12) / (4096 - var22) : 4096;
                                        }
                                    }
                                } else {
                                    for (int var23 = 0; class104.field1411 > var23; ++var23) {
                                        int var24 = var5[var23];
                                        var3[var23] = var24 < 2048 ? var4[var23] * var24 >> 11 : -((-var4[var23] + 4096) * (-var24 + 4096) >> 11) + 4096;
                                    }
                                }
                            } else {
                                for (int var25 = 0; ~class104.field1411 < ~var25; ++var25) {
                                    var3[var25] = 4096 - ((-var4[var25] + 4096) * (-var5[var25] + 4096) >> 12);
                                }
                            }
                        } else {
                            for (int var26 = 0; class104.field1411 > var26; ++var26) {
                                int var27 = var5[var26];
                                var3[var26] = ~var27 == -1 ? 4096 : (var4[var26] << 12) / var27;
                            }
                        }
                    } else {
                        for (int var28 = 0; var28 < class104.field1411; ++var28) {
                            var3[var28] = var4[var28] * var5[var28] >> 12;
                        }
                    }
                } else {
                    for (int var29 = 0; ~var29 > ~class104.field1411; ++var29) {
                        var3[var29] = var4[var29] + -var5[var29];
                    }
                }
            } else {
                for (int var30 = 0; ~var30 > ~class104.field1411; ++var30) {
                    var3[var30] = var4[var30] + var5[var30];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIIIIIBI)V")
    public static final void method1721(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7) {
        if (arg5 >= 0 && arg7 >= 0 && ~arg5 > -104 && arg7 < 103) {
            if (arg2 == 0) {
                class118 var8 = class72.method449(arg0, arg5, arg7);
                if (var8 != null) {
                    int var9 = (int) (var8.field1662 >>> 32) & Integer.MAX_VALUE;
                    if (~arg4 != -3) {
                        var8.field1672 = new class122(var9, arg4, arg1, arg0, arg5, arg7, arg3, false, var8.field1672);
                    } else {
                        var8.field1672 = new class122(var9, 2, 4 - -arg1, arg0, arg5, arg7, arg3, false, var8.field1672);
                        var8.field1659 = new class122(var9, 2, arg1 + 1 & 3, arg0, arg5, arg7, arg3, false, var8.field1659);
                    }
                }
            }
            if (arg2 == 1) {
                class163 var10 = class26.method158(arg0, arg5, arg7);
                if (var10 != null) {
                    int var11 = Integer.MAX_VALUE & (int) (var10.field2347 >>> 32);
                    if (~arg4 != -5 && ~arg4 != -6) {
                        if (arg4 == 6) {
                            var10.field2335 = new class122(var11, 4, arg1 + 4, arg0, arg5, arg7, arg3, false, var10.field2335);
                        } else if (arg4 != 7) {
                            if (~arg4 == -9) {
                                var10.field2335 = new class122(var11, 4, arg1 + 4, arg0, arg5, arg7, arg3, false, var10.field2335);
                                var10.field2334 = new class122(var11, 4, (3 & arg1 + 2) + 4, arg0, arg5, arg7, arg3, false, var10.field2334);
                            }
                        } else {
                            var10.field2335 = new class122(var11, 4, (3 & arg1 + 2) + 4, arg0, arg5, arg7, arg3, false, var10.field2335);
                        }
                    } else {
                        var10.field2335 = new class122(var11, 4, arg1, arg0, arg5, arg7, arg3, false, var10.field2335);
                    }
                }
            }
            if (arg2 == 2) {
                if (arg4 == 11) {
                    arg4 = 10;
                }
                class243 var12 = class292.method1954(arg0, arg5, arg7);
                if (var12 != null) {
                    var12.field3526 = new class122(Integer.MAX_VALUE & (int) (var12.field3539 >>> 32), arg4, arg1, arg0, arg5, arg7, arg3, false, var12.field3526);
                }
            }
            if (arg2 == 3) {
                class50 var13 = class70.method423(arg0, arg5, arg7);
                if (var13 != null) {
                    var13.field568 = new class122(Integer.MAX_VALUE & (int) (var13.field575 >>> 32), 22, arg1, arg0, arg5, arg7, arg3, false, var13.field568);
                }
            }
        }
        if (arg6 <= 2) {
            method1721(-123, -32, 9, 89, -74, 55, (byte) 17, -111);
        }
        ++field3937;
    }

    @OriginalMember(owner = "client!pf", name = "f", descriptor = "(B)V")
    public static void method1722(byte arg0) {
        if (arg0 != 97) {
            method1722((byte) 87);
        }
        field3931 = null;
        field3927 = null;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lbc;Lbc;Lbc;I)V")
    public static final void method1723(class282 arg0, class282 arg1, class282 arg2, int arg3) {
        if (arg3 != 0) {
            field3931 = null;
        }
        class29.field345 = arg2;
        class203.field2886 = arg1;
        class273.field4064 = arg0;
        ++field3938;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIBZ)Ljava/lang/String;")
    public static final String method1724(int arg0, int arg1, byte arg2, boolean arg3) {
        ++field3929;
        if (arg0 >= 2 && ~arg0 >= -37) {
            if (arg3 && arg1 >= 0) {
                int var4 = 2;
                int var5 = arg1 / arg0;
                if (arg2 >= -117) {
                    field3931 = null;
                }
                while (~var5 != -1) {
                    var5 /= arg0;
                    ++var4;
                }
                char[] var6 = new char[var4];
                var6[0] = '+';
                for (int var7 = var4 + -1; ~var7 < -1; --var7) {
                    int var8 = arg1;
                    arg1 /= arg0;
                    int var9 = var8 - arg0 * arg1;
                    if (var9 >= 10) {
                        var6[var7] = (char) (var9 + 87);
                    } else {
                        var6[var7] = (char) (var9 + 48);
                    }
                }
                return new String(var6);
            } else {
                return Integer.toString(arg1, arg0);
            }
        } else {
            throw new IllegalArgumentException("Invalid radix:" + arg0);
        }
    }

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "()V")
    public class269() {
        super(2, false);
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIIIIIII)Z")
    public static final boolean method1725(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
            return false;
        } else {
            int var8 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
            int var9 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
            int var10 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
            return var8 * var10 > 0 && var9 * var10 > 0;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(ILqi;I)V")
    public final void method9(int arg0, class216 arg1, int arg2) {
        ++field3932;
        if (~arg0 != -1) {
            if (~arg0 == -2) {
                super.field2059 = ~arg1.method1407(104) == -2;
            }
        } else {
            this.field3933 = arg1.method1407(114);
        }
        if (arg2 != 20630) {
            method1726(-68);
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(BI)[[I")
    public final int[][] method8(byte arg0, int arg1) {
        if (arg0 != 5) {
            method1723((class282) null, (class282) null, (class282) null, -83);
        }
        ++field3934;
        int[][] var3 = super.field2053.method1542(arg0 ^ 98, arg1);
        if (super.field2053.field3408) {
            int[][] var4 = this.method927(arg1, true, 0);
            int[][] var5 = this.method927(arg1, true, 1);
            int[] var6 = var3[1];
            int[] var7 = var3[0];
            int[] var8 = var4[0];
            int[] var9 = var3[2];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            int[] var12 = var5[0];
            int[] var13 = var5[1];
            int[] var14 = var5[2];
            int var15 = this.field3933;
            if (var15 != 1) {
                if (~var15 != -3) {
                    if (~var15 != -4) {
                        if (var15 != 4) {
                            if (var15 != 5) {
                                if (var15 != 6) {
                                    if (~var15 != -8) {
                                        if (~var15 != -9) {
                                            if (var15 != 9) {
                                                if (~var15 != -11) {
                                                    if (~var15 != -12) {
                                                        if (~var15 == -13) {
                                                            for (int var16 = 0; var16 < class104.field1411; ++var16) {
                                                                int var17 = var11[var16];
                                                                int var18 = var8[var16];
                                                                int var19 = var14[var16];
                                                                int var20 = var13[var16];
                                                                int var21 = var10[var16];
                                                                int var22 = var12[var16];
                                                                var7[var16] = var18 - -var22 + -(var18 * var22 >> 11);
                                                                var6[var16] = -(var20 * var21 >> 11) + var21 - -var20;
                                                                var9[var16] = -(var17 * var19 >> 11) + var19 + var17;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var23 = 0; ~var23 > ~class104.field1411; ++var23) {
                                                            int var24 = var12[var23];
                                                            int var25 = var13[var23];
                                                            int var26 = var8[var23];
                                                            int var27 = var14[var23];
                                                            int var28 = var10[var23];
                                                            int var29 = var11[var23];
                                                            var7[var23] = var24 >= var26 ? -var26 + var24 : var26 - var24;
                                                            var6[var23] = var25 >= var28 ? -var28 + var25 : -var25 + var28;
                                                            var9[var23] = ~var29 < ~var27 ? var29 - var27 : -var29 + var27;
                                                        }
                                                    }
                                                } else {
                                                    for (int var30 = 0; ~var30 > ~class104.field1411; ++var30) {
                                                        int var31 = var11[var30];
                                                        int var32 = var14[var30];
                                                        int var33 = var12[var30];
                                                        int var34 = var8[var30];
                                                        int var35 = var10[var30];
                                                        int var36 = var13[var30];
                                                        var7[var30] = ~var33 > ~var34 ? var34 : var33;
                                                        var6[var30] = ~var35 < ~var36 ? var35 : var36;
                                                        var9[var30] = ~var31 < ~var32 ? var31 : var32;
                                                    }
                                                }
                                            } else {
                                                for (int var37 = 0; class104.field1411 > var37; ++var37) {
                                                    int var38 = var11[var37];
                                                    int var39 = var8[var37];
                                                    int var40 = var14[var37];
                                                    int var41 = var13[var37];
                                                    int var42 = var10[var37];
                                                    int var43 = var12[var37];
                                                    var7[var37] = var43 <= var39 ? var43 : var39;
                                                    var6[var37] = var41 > var42 ? var42 : var41;
                                                    var9[var37] = var40 <= var38 ? var40 : var38;
                                                }
                                            }
                                        } else {
                                            for (int var44 = 0; var44 < class104.field1411; ++var44) {
                                                int var45 = var10[var44];
                                                int var46 = var8[var44];
                                                int var47 = var11[var44];
                                                var7[var44] = var46 == 0 ? 0 : -((-var12[var44] + 4096 << 12) / var46) + 4096;
                                                var6[var44] = ~var45 != -1 ? -((-var13[var44] + 4096 << 12) / var45) + 4096 : 0;
                                                var9[var44] = ~var47 != -1 ? -((-var14[var44] + 4096 << 12) / var47) + 4096 : 0;
                                            }
                                        }
                                    } else {
                                        for (int var48 = 0; class104.field1411 > var48; ++var48) {
                                            int var49 = var10[var48];
                                            int var50 = var8[var48];
                                            int var51 = var11[var48];
                                            var7[var48] = ~var50 != -4097 ? (var12[var48] << 12) / (-var50 + 4096) : 4096;
                                            var6[var48] = ~var49 != -4097 ? (var13[var48] << 12) / (4096 - var49) : 4096;
                                            var9[var48] = var51 == 4096 ? 4096 : (var14[var48] << 12) / (-var51 + 4096);
                                        }
                                    }
                                } else {
                                    for (int var52 = 0; class104.field1411 > var52; ++var52) {
                                        int var53 = var12[var52];
                                        int var54 = var14[var52];
                                        int var55 = var13[var52];
                                        var7[var52] = ~var53 <= -2049 ? -((4096 - var53) * (-var8[var52] + 4096) >> 11) + 4096 : var8[var52] * var53 >> 11;
                                        var6[var52] = var55 >= 2048 ? -((-var10[var52] + 4096) * (-var55 + 4096) >> 11) + 4096 : var10[var52] * var55 >> 11;
                                        var9[var52] = ~var54 > -2049 ? var11[var52] * var54 >> 11 : 4096 - ((-var11[var52] + 4096) * (-var54 + 4096) >> 11);
                                    }
                                }
                            } else {
                                for (int var56 = 0; class104.field1411 > var56; ++var56) {
                                    var7[var56] = -((-var8[var56] + 4096) * (-var12[var56] + 4096) >> 12) + 4096;
                                    var6[var56] = -((-var10[var56] + 4096) * (-var13[var56] + 4096) >> 12) + 4096;
                                    var9[var56] = -((4096 - var11[var56]) * (4096 - var14[var56]) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var57 = 0; ~var57 > ~class104.field1411; ++var57) {
                                int var58 = var12[var57];
                                int var59 = var14[var57];
                                int var60 = var13[var57];
                                var7[var57] = ~var58 != -1 ? (var8[var57] << 12) / var58 : 4096;
                                var6[var57] = var60 == 0 ? 4096 : (var10[var57] << 12) / var60;
                                var9[var57] = var59 == 0 ? 4096 : (var11[var57] << 12) / var59;
                            }
                        }
                    } else {
                        for (int var61 = 0; ~class104.field1411 < ~var61; ++var61) {
                            var7[var61] = var8[var61] * var12[var61] >> 12;
                            var6[var61] = var10[var61] * var13[var61] >> 12;
                            var9[var61] = var11[var61] * var14[var61] >> 12;
                        }
                    }
                } else {
                    for (int var62 = 0; ~class104.field1411 < ~var62; ++var62) {
                        var7[var62] = var8[var62] + -var12[var62];
                        var6[var62] = var10[var62] + -var13[var62];
                        var9[var62] = var11[var62] + -var14[var62];
                    }
                }
            } else {
                for (int var63 = 0; var63 < class104.field1411; ++var63) {
                    var7[var63] = var8[var63] - -var12[var63];
                    var6[var63] = var10[var63] + var13[var63];
                    var9[var63] = var11[var63] - -var14[var63];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pf", name = "g", descriptor = "(I)V")
    public static final void method1726(int arg0) {
        class73.field875.method67((byte) 95);
        if (arg0 <= 112) {
            field3936 = true;
        }
        class1.field21.method67((byte) -124);
        ++field3928;
    }
}
