import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class208 extends class115 {

    @OriginalMember(owner = "client!qh", name = "X", descriptor = "I")
    private int field3615 = 6;

    @OriginalMember(owner = "client!qh", name = "Q", descriptor = "[I")
    public static int[] field3608 = new int[2];

    @OriginalMember(owner = "client!qh", name = "U", descriptor = "Z")
    public static boolean field3612 = false;

    @OriginalMember(owner = "client!qh", name = "Z", descriptor = "Z")
    public static boolean field3617 = false;

    @OriginalMember(owner = "client!qh", name = "R", descriptor = "I")
    public static int field3609;

    @OriginalMember(owner = "client!qh", name = "S", descriptor = "I")
    public static int field3610;

    @OriginalMember(owner = "client!qh", name = "T", descriptor = "I")
    public static int field3611;

    @OriginalMember(owner = "client!qh", name = "V", descriptor = "I")
    public static int field3613;

    @OriginalMember(owner = "client!qh", name = "ab", descriptor = "I")
    public static int field3618;

    @OriginalMember(owner = "client!qh", name = "bb", descriptor = "I")
    public static int field3619;

    @OriginalMember(owner = "client!qh", name = "cb", descriptor = "I")
    public static int field3620;

    @OriginalMember(owner = "client!qh", name = "db", descriptor = "I")
    public static int field3621;

    @OriginalMember(owner = "client!qh", name = "Y", descriptor = "Lrd;")
    public static class207 field3616;

    @OriginalMember(owner = "client!qh", name = "W", descriptor = "[I")
    public static int[] field3614;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(B[BIZII[Ltb;IIII)V")
    public static final void method1347(byte arg0, byte[] arg1, int arg2, boolean arg3, int arg4, int arg5, class52[] arg6, int arg7, int arg8, int arg9, int arg10) {
        ++field3621;
        if (arg0 == 77) {
            class112 var11 = new class112(arg1);
            int var12 = -1;
            while (true) {
                int var13 = var11.method742((byte) -99);
                if (~var13 == -1) {
                    return;
                }
                var12 += var13;
                int var14 = 0;
                while (true) {
                    int var15 = var11.method747((byte) -125);
                    if (var15 == 0) {
                        break;
                    }
                    var14 += var15 + -1;
                    int var16 = 63 & var14;
                    int var17 = (4054 & var14) >> 6;
                    int var18 = var14 >> 12;
                    int var19 = var11.method758(true);
                    int var20 = var19 >> 2;
                    int var21 = 3 & var19;
                    if (~arg8 == ~var18 && ~var17 <= ~arg5 && var17 < arg5 - -8 && var16 >= arg9 && ~(arg9 - -8) < ~var16) {
                        class70 var22 = class190.method1232(var12, arg0 + 13013);
                        int var23 = arg2 - -class53.method379(var22.field1048, var21, 7 & var17, arg4, var16 & 7, (byte) -88, var22.field1059);
                        int var24 = class234.method1511(var22.field1048, 7 & var17, 21067, 7 & var16, arg4, var21, var22.field1059) + arg10;
                        if (var23 > 0 && var24 > 0 && ~var23 > -104 && ~var24 > -104) {
                            class52 var25 = null;
                            if (!arg3) {
                                int var26 = arg7;
                                if ((class205.field3561[1][var23][var24] & 2) == 2) {
                                    var26 = arg7 - 1;
                                }
                                if (~var26 <= -1) {
                                    var25 = arg6[var26];
                                }
                            }
                            class159.method1042(var24, !arg3, (byte) -50, var23, arg3, arg7, var12, arg4 + var21 & 3, var25, arg7, var20);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "(B)V")
    public static void method1348(byte arg0) {
        int var1 = 8 / ((arg0 - 57) / 34);
        field3616 = null;
        field3614 = null;
        field3608 = null;
    }

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "(II)Llj;")
    public static final class127 method1349(int arg0, int arg1) {
        class127 var2 = (class127) class241.field4128.method1499(0, (long) arg1);
        ++field3613;
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class196.field3403.method1712(arg1, 16, -1);
            class127 var4 = new class127();
            if (var3 != null) {
                var4.method863((byte) 65, new class112(var3));
            }
            if (arg0 >= -100) {
                return null;
            } else {
                class241.field4128.method1502((byte) -18, var4, (long) arg1);
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(II[Lmj;)V")
    public static final void method1350(int arg0, int arg1, class129[] arg2) {
        ++field3618;
        int var3 = 0;
        if (arg0 == -1) {
            while (arg2.length > var3) {
                class129 var4 = arg2[var3];
                if (var4 != null && ~var4.field2276 == ~arg1 && (!var4.field2258 || !client.method264(var4))) {
                    label99: {
                        if (var4.field2230 == 0) {
                            if (!var4.field2258 && client.method264(var4) && class129.field2217 != var4) {
                                break label99;
                            }
                            method1350(-1, var4.field2222, arg2);
                            if (var4.field2263 != null) {
                                method1350(-1, var4.field2222, var4.field2263);
                            }
                            class114 var5 = (class114) class176.field3079.method1527((long) var4.field2222, (byte) -96);
                            if (var5 != null) {
                                class229.method1476(false, var5.field1853);
                            }
                        }
                        if (~var4.field2230 == -7) {
                            if (var4.field2239 != -1 || var4.field2126 != -1) {
                                boolean var6 = class106.method700(var4, (byte) -76);
                                int var7;
                                if (var6) {
                                    var7 = var4.field2126;
                                } else {
                                    var7 = var4.field2239;
                                }
                                if (~var7 != 0) {
                                    class237 var8 = class213.method1370(-1, var7);
                                    if (var8 != null) {
                                        var4.field2172 += class146.field2539;
                                        while (var8.field4069[var4.field2229] < var4.field2172) {
                                            var4.field2172 -= var8.field4069[var4.field2229];
                                            ++var4.field2229;
                                            if (var8.field4065.length <= var4.field2229) {
                                                var4.field2229 -= var8.field4060;
                                                if (var4.field2229 < 0 || ~var8.field4065.length >= ~var4.field2229) {
                                                    var4.field2229 = 0;
                                                }
                                            }
                                            class65.method443(var4, arg0 + 1);
                                        }
                                    }
                                }
                            }
                            if (var4.field2181 != 0 && !var4.field2258) {
                                int var9 = var4.field2181 >> 16;
                                int var10 = class146.field2539 * var9;
                                int var11 = var4.field2181 << 16 >> 16;
                                int var12 = class146.field2539 * var11;
                                var4.field2186 = var4.field2186 + var12 & 2047;
                                var4.field2124 = var4.field2124 - -var10 & 2047;
                                class65.method443(var4, 0);
                            }
                        }
                    }
                }
                ++var3;
            }
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IB)[I")
    public final int[] method5(int arg0, byte arg1) {
        if (arg1 <= 37) {
            method1348((byte) -24);
        }
        ++field3610;
        int[] var3 = super.field1872.method182((byte) -121, arg0);
        if (super.field1872.field341) {
            int[] var4 = this.method792(0, 0, arg0);
            int[] var5 = this.method792(0, 1, arg0);
            int var6 = this.field3615;
            if (~var6 != -2) {
                if (var6 != 2) {
                    if (~var6 != -4) {
                        if (~var6 != -5) {
                            if (var6 != 5) {
                                if (var6 != 6) {
                                    if (var6 != 7) {
                                        if (var6 != 8) {
                                            if (var6 != 9) {
                                                if (var6 != 10) {
                                                    if (~var6 != -12) {
                                                        if (var6 == 12) {
                                                            for (int var7 = 0; class130.field2297 > var7; ++var7) {
                                                                int var8 = var4[var7];
                                                                int var9 = var5[var7];
                                                                var3[var7] = var8 + var9 + -(var8 * var9 >> 11);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var10 = 0; class130.field2297 > var10; ++var10) {
                                                            int var11 = var4[var10];
                                                            int var12 = var5[var10];
                                                            var3[var10] = ~var11 < ~var12 ? -var12 + var11 : var12 - var11;
                                                        }
                                                    }
                                                } else {
                                                    for (int var13 = 0; ~class130.field2297 < ~var13; ++var13) {
                                                        int var14 = var4[var13];
                                                        int var15 = var5[var13];
                                                        var3[var13] = var14 > var15 ? var14 : var15;
                                                    }
                                                }
                                            } else {
                                                for (int var16 = 0; ~var16 > ~class130.field2297; ++var16) {
                                                    int var17 = var5[var16];
                                                    int var18 = var4[var16];
                                                    var3[var16] = var17 > var18 ? var18 : var17;
                                                }
                                            }
                                        } else {
                                            for (int var19 = 0; ~class130.field2297 < ~var19; ++var19) {
                                                int var20 = var4[var19];
                                                var3[var19] = var20 == 0 ? 0 : 4096 - (-var5[var19] + 4096 << 12) / var20;
                                            }
                                        }
                                    } else {
                                        for (int var21 = 0; class130.field2297 > var21; ++var21) {
                                            int var22 = var4[var21];
                                            var3[var21] = ~var22 == -4097 ? 4096 : (var5[var21] << 12) / (-var22 + 4096);
                                        }
                                    }
                                } else {
                                    for (int var23 = 0; ~var23 > ~class130.field2297; ++var23) {
                                        int var24 = var5[var23];
                                        var3[var23] = ~var24 > -2049 ? var4[var23] * var24 >> 11 : -((-var4[var23] + 4096) * (-var24 + 4096) >> 11) + 4096;
                                    }
                                }
                            } else {
                                for (int var25 = 0; ~class130.field2297 < ~var25; ++var25) {
                                    var3[var25] = -((-var4[var25] + 4096) * (-var5[var25] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var26 = 0; ~class130.field2297 < ~var26; ++var26) {
                                int var27 = var5[var26];
                                var3[var26] = var27 != 0 ? (var4[var26] << 12) / var27 : 4096;
                            }
                        }
                    } else {
                        for (int var28 = 0; var28 < class130.field2297; ++var28) {
                            var3[var28] = var4[var28] * var5[var28] >> 12;
                        }
                    }
                } else {
                    for (int var29 = 0; ~class130.field2297 < ~var29; ++var29) {
                        var3[var29] = var4[var29] + -var5[var29];
                    }
                }
            } else {
                for (int var30 = 0; ~class130.field2297 < ~var30; ++var30) {
                    var3[var30] = var4[var30] + var5[var30];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIILoe;)Lfe;")
    public static final class15 method1351(int arg0, int arg1, int arg2, class256 arg3) {
        if (arg2 < 26) {
            method1352(-76, -26, 108, -87, -49);
        }
        ++field3620;
        return !class9.method34(arg1, arg3, (byte) -16, arg0) ? null : class174.method1156(0);
    }

    @OriginalMember(owner = "client!qh", name = "<init>", descriptor = "()V")
    public class208() {
        super(2, false);
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIIII)V")
    public static final void method1352(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 != -622332702) {
            method1347((byte) -98, (byte[]) null, 53, false, -38, -102, (class52[]) null, 27, 21, -10, 102);
        }
        ++field3619;
        for (int var5 = 0; var5 < class149.field2586; ++var5) {
            if (~(class133.field2335[var5] - -class169.field2952[var5]) < ~arg0 && class133.field2335[var5] < arg0 + arg3 && ~(class157.field2717[var5] + class124.field2049[var5]) < ~arg2 && arg2 + arg4 > class157.field2717[var5]) {
                class194.field3372[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(BLnh;I)V")
    public final void method3(byte arg0, class112 arg1, int arg2) {
        ++field3609;
        if (arg0 == 107) {
            if (arg2 != 0) {
                if (~arg2 == -2) {
                    super.field1879 = arg1.method758(true) == 1;
                }
            } else {
                this.field3615 = arg1.method758(true);
            }
        }
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(II)[[I")
    public final int[][] method1(int arg0, int arg1) {
        if (arg1 <= 11) {
            method1349(-17, -110);
        }
        ++field3611;
        int[][] var3 = super.field1882.method1242(arg0, 125);
        if (super.field1882.field3344) {
            int[][] var4 = this.method789(0, (byte) -124, arg0);
            int[][] var5 = this.method789(1, (byte) -124, arg0);
            int[] var6 = var3[1];
            int[] var7 = var3[0];
            int[] var8 = var3[2];
            int[] var9 = var4[1];
            int[] var10 = var4[0];
            int[] var11 = var5[1];
            int[] var12 = var4[2];
            int[] var13 = var5[0];
            int[] var14 = var5[2];
            int var15 = this.field3615;
            if (~var15 != -2) {
                if (~var15 != -3) {
                    if (~var15 != -4) {
                        if (var15 != 4) {
                            if (~var15 != -6) {
                                if (~var15 != -7) {
                                    if (var15 != 7) {
                                        if (~var15 != -9) {
                                            if (var15 != 9) {
                                                if (var15 != 10) {
                                                    if (~var15 != -12) {
                                                        if (~var15 == -13) {
                                                            for (int var16 = 0; class130.field2297 > var16; ++var16) {
                                                                int var17 = var14[var16];
                                                                int var18 = var9[var16];
                                                                int var19 = var10[var16];
                                                                int var20 = var11[var16];
                                                                int var21 = var13[var16];
                                                                int var22 = var12[var16];
                                                                var7[var16] = var19 + var21 + -(var19 * var21 >> 11);
                                                                var6[var16] = var18 - (-var20 - -(var18 * var20 >> 11));
                                                                var8[var16] = var17 - (var17 * var22 >> 11) + var22;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var23 = 0; var23 < class130.field2297; ++var23) {
                                                            int var24 = var14[var23];
                                                            int var25 = var9[var23];
                                                            int var26 = var10[var23];
                                                            int var27 = var11[var23];
                                                            int var28 = var12[var23];
                                                            int var29 = var13[var23];
                                                            var7[var23] = ~var26 >= ~var29 ? -var26 + var29 : -var29 + var26;
                                                            var6[var23] = var25 > var27 ? -var27 + var25 : -var25 + var27;
                                                            var8[var23] = ~var28 < ~var24 ? var28 - var24 : -var28 + var24;
                                                        }
                                                    }
                                                } else {
                                                    for (int var30 = 0; class130.field2297 > var30; ++var30) {
                                                        int var31 = var12[var30];
                                                        int var32 = var10[var30];
                                                        int var33 = var14[var30];
                                                        int var34 = var11[var30];
                                                        int var35 = var9[var30];
                                                        int var36 = var13[var30];
                                                        var7[var30] = var32 > var36 ? var32 : var36;
                                                        var6[var30] = ~var35 < ~var34 ? var35 : var34;
                                                        var8[var30] = var33 < var31 ? var31 : var33;
                                                    }
                                                }
                                            } else {
                                                for (int var37 = 0; ~var37 > ~class130.field2297; ++var37) {
                                                    int var38 = var12[var37];
                                                    int var39 = var11[var37];
                                                    int var40 = var9[var37];
                                                    int var41 = var13[var37];
                                                    int var42 = var14[var37];
                                                    int var43 = var10[var37];
                                                    var7[var37] = ~var43 > ~var41 ? var43 : var41;
                                                    var6[var37] = var39 <= var40 ? var39 : var40;
                                                    var8[var37] = var42 <= var38 ? var42 : var38;
                                                }
                                            }
                                        } else {
                                            for (int var44 = 0; ~class130.field2297 < ~var44; ++var44) {
                                                int var45 = var9[var44];
                                                int var46 = var12[var44];
                                                int var47 = var10[var44];
                                                var7[var44] = ~var47 == -1 ? 0 : -((4096 - var13[var44] << 12) / var47) + 4096;
                                                var6[var44] = ~var45 != -1 ? 4096 - (-var11[var44] + 4096 << 12) / var45 : 0;
                                                var8[var44] = var46 != 0 ? 4096 - (4096 - var14[var44] << 12) / var46 : 0;
                                            }
                                        }
                                    } else {
                                        for (int var48 = 0; class130.field2297 > var48; ++var48) {
                                            int var49 = var12[var48];
                                            int var50 = var10[var48];
                                            int var51 = var9[var48];
                                            var7[var48] = ~var50 == -4097 ? 4096 : (var13[var48] << 12) / (-var50 + 4096);
                                            var6[var48] = ~var51 == -4097 ? 4096 : (var11[var48] << 12) / (4096 - var51);
                                            var8[var48] = var49 == 4096 ? 4096 : (var14[var48] << 12) / (-var49 + 4096);
                                        }
                                    }
                                } else {
                                    for (int var52 = 0; var52 < class130.field2297; ++var52) {
                                        int var53 = var11[var52];
                                        int var54 = var13[var52];
                                        int var55 = var14[var52];
                                        var7[var52] = ~var54 <= -2049 ? 4096 - ((4096 - var10[var52]) * (-var54 + 4096) >> 11) : var10[var52] * var54 >> 11;
                                        var6[var52] = ~var53 <= -2049 ? -((-var9[var52] + 4096) * (-var53 + 4096) >> 11) + 4096 : var9[var52] * var53 >> 11;
                                        var8[var52] = var55 < 2048 ? var12[var52] * var55 >> 11 : -((-var12[var52] + 4096) * (-var55 + 4096) >> 11) + 4096;
                                    }
                                }
                            } else {
                                for (int var56 = 0; ~var56 > ~class130.field2297; ++var56) {
                                    var7[var56] = -((4096 - var10[var56]) * (-var13[var56] + 4096) >> 12) + 4096;
                                    var6[var56] = -((-var9[var56] + 4096) * (-var11[var56] + 4096) >> 12) + 4096;
                                    var8[var56] = 4096 - ((-var12[var56] + 4096) * (-var14[var56] + 4096) >> 12);
                                }
                            }
                        } else {
                            for (int var57 = 0; ~var57 > ~class130.field2297; ++var57) {
                                int var58 = var13[var57];
                                int var59 = var11[var57];
                                int var60 = var14[var57];
                                var7[var57] = var58 != 0 ? (var10[var57] << 12) / var58 : 4096;
                                var6[var57] = ~var59 != -1 ? (var9[var57] << 12) / var59 : 4096;
                                var8[var57] = var60 == 0 ? 4096 : (var12[var57] << 12) / var60;
                            }
                        }
                    } else {
                        for (int var61 = 0; var61 < class130.field2297; ++var61) {
                            var7[var61] = var10[var61] * var13[var61] >> 12;
                            var6[var61] = var9[var61] * var11[var61] >> 12;
                            var8[var61] = var12[var61] * var14[var61] >> 12;
                        }
                    }
                } else {
                    for (int var62 = 0; ~var62 > ~class130.field2297; ++var62) {
                        var7[var62] = var10[var62] + -var13[var62];
                        var6[var62] = var9[var62] + -var11[var62];
                        var8[var62] = var12[var62] + -var14[var62];
                    }
                }
            } else {
                for (int var63 = 0; var63 < class130.field2297; ++var63) {
                    var7[var63] = var10[var63] - -var13[var63];
                    var6[var63] = var9[var63] + var11[var63];
                    var8[var63] = var12[var63] + var14[var63];
                }
            }
        }
        return var3;
    }
}
