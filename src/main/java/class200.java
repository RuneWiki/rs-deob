import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class200 extends class14 {

    @OriginalMember(owner = "client!le", name = "Q", descriptor = "I")
    private int field2775 = 6;

    @OriginalMember(owner = "client!le", name = "R", descriptor = "[I")
    public static int[] field2776 = new int[4096];

    @OriginalMember(owner = "client!le", name = "S", descriptor = "Lcu;")
    public static class145 field2777;

    @OriginalMember(owner = "client!le", name = "J", descriptor = "I")
    public static int field2769;

    @OriginalMember(owner = "client!le", name = "L", descriptor = "I")
    public static int field2770;

    @OriginalMember(owner = "client!le", name = "M", descriptor = "I")
    public static int field2771;

    @OriginalMember(owner = "client!le", name = "N", descriptor = "I")
    public static int field2772;

    @OriginalMember(owner = "client!le", name = "P", descriptor = "I")
    public static int field2774;

    @OriginalMember(owner = "client!le", name = "T", descriptor = "I")
    public static int field2778;

    @OriginalMember(owner = "client!le", name = "U", descriptor = "Lem;")
    public static class149 field2779;

    @OriginalMember(owner = "client!le", name = "O", descriptor = "Ljava/lang/Object;")
    public static Object field2773;

    static {
        for (int var0 = 0; ~var0 > -4097; ++var0) {
            field2776[var0] = class105.method738(var0, (byte) 74);
        }
        field2777 = new class145(7, 3);
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IB)[I", line = 3)
    public final int[] method140(int arg0, byte arg1) {
        ++field2769;
        int[] var3 = super.field270.method2263(-29596, arg0);
        if (super.field270.field5222) {
            int[] var4 = this.method145(arg0, 0, -18596);
            int[] var5 = this.method145(arg0, 1, -18596);
            int var6 = this.field2775;
            if (var6 != 1) {
                if (~var6 != -3) {
                    if (var6 != 3) {
                        if (var6 != 4) {
                            if (~var6 != -6) {
                                if (var6 != 6) {
                                    if (var6 != 7) {
                                        if (var6 != 8) {
                                            if (var6 != 9) {
                                                if (var6 != 10) {
                                                    if (~var6 != -12) {
                                                        if (var6 == 12) {
                                                            for (int var7 = 0; class115.field1637 > var7; ++var7) {
                                                                int var8 = var5[var7];
                                                                int var9 = var4[var7];
                                                                var3[var7] = -(var8 * var9 >> 11) + var8 + var9;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var10 = 0; ~class115.field1637 < ~var10; ++var10) {
                                                            int var11 = var4[var10];
                                                            int var12 = var5[var10];
                                                            var3[var10] = ~var12 > ~var11 ? var11 - var12 : -var11 + var12;
                                                        }
                                                    }
                                                } else {
                                                    for (int var13 = 0; ~var13 > ~class115.field1637; ++var13) {
                                                        int var14 = var4[var13];
                                                        int var15 = var5[var13];
                                                        var3[var13] = ~var15 > ~var14 ? var14 : var15;
                                                    }
                                                }
                                            } else {
                                                for (int var16 = 0; ~class115.field1637 < ~var16; ++var16) {
                                                    int var17 = var5[var16];
                                                    int var18 = var4[var16];
                                                    var3[var16] = var18 < var17 ? var18 : var17;
                                                }
                                            }
                                        } else {
                                            for (int var19 = 0; var19 < class115.field1637; ++var19) {
                                                int var20 = var4[var19];
                                                var3[var19] = var20 != 0 ? -((4096 - var5[var19] << 12) / var20) + 4096 : 0;
                                            }
                                        }
                                    } else {
                                        for (int var21 = 0; ~var21 > ~class115.field1637; ++var21) {
                                            int var22 = var4[var21];
                                            var3[var21] = var22 != 4096 ? (var5[var21] << 12) / (-var22 + 4096) : 4096;
                                        }
                                    }
                                } else {
                                    for (int var23 = 0; ~class115.field1637 < ~var23; ++var23) {
                                        int var24 = var5[var23];
                                        var3[var23] = var24 < 2048 ? var4[var23] * var24 >> 11 : 4096 - ((4096 - var24) * (-var4[var23] + 4096) >> 11);
                                    }
                                }
                            } else {
                                for (int var25 = 0; ~class115.field1637 < ~var25; ++var25) {
                                    var3[var25] = -((-var4[var25] + 4096) * (-var5[var25] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var26 = 0; var26 < class115.field1637; ++var26) {
                                int var27 = var5[var26];
                                var3[var26] = var27 == 0 ? 4096 : (var4[var26] << 12) / var27;
                            }
                        }
                    } else {
                        for (int var28 = 0; var28 < class115.field1637; ++var28) {
                            var3[var28] = var4[var28] * var5[var28] >> 12;
                        }
                    }
                } else {
                    for (int var29 = 0; class115.field1637 > var29; ++var29) {
                        var3[var29] = var4[var29] - var5[var29];
                    }
                }
            } else {
                for (int var30 = 0; class115.field1637 > var30; ++var30) {
                    var3[var30] = var4[var30] + var5[var30];
                }
            }
        }
        if (arg1 >= -2) {
            field2777 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(BIIII)V", line = 249)
    public static final void method1280(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field2774;
        if (~arg2 <= ~class308.field4055 && arg2 <= class71.field1077) {
            int var5 = class99.method710(arg4, (byte) -29, class300.field3971, class353.field4777);
            int var6 = class99.method710(arg1, (byte) -29, class300.field3971, class353.field4777);
            class363.method2117(arg2, -81, arg3, var6, var5);
        }
        if (arg0 < 64) {
            method1280((byte) 114, 114, 101, -55, 42);
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IBLmd;)V", line = 272)
    public final void method147(int arg0, byte arg1, class379 arg2) {
        int var4 = 53 % ((-51 - arg1) / 37);
        if (~arg0 != -1) {
            if (arg0 == 1) {
                super.field263 = arg2.method2238(255) == 1;
            }
        } else {
            this.field2775 = arg2.method2238(255);
        }
        ++field2772;
    }

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "()V", line = 307)
    public class200() {
        super(2, false);
    }

    @OriginalMember(owner = "client!le", name = "e", descriptor = "(I)V", line = 312)
    public static void method1281(int arg0) {
        field2777 = null;
        if (arg0 >= -1) {
            field2779 = null;
        }
        field2776 = null;
        field2779 = null;
        field2773 = null;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Ljava/lang/String;II)V", line = 325)
    public static final void method1282(String arg0, int arg1, int arg2) {
        ++field2770;
        int var3 = class461.field6368;
        int[] var4 = class461.field6370;
        boolean var5 = false;
        if (arg1 >= -62) {
            method1281(24);
        }
        for (int var6 = 0; ~var6 > ~var3; ++var6) {
            class515 var7 = class499.field6901[var4[var6]];
            if (var7 != null && class385.field5232 != var7 && var7.field7638 != null && var7.field7638.equalsIgnoreCase(arg0)) {
                var5 = true;
                if (~arg2 != -2) {
                    if (~arg2 == -5) {
                        class118.method822(-70, class291.field3821);
                        ++class191.field2692;
                        class193.field2708.method2209(5484, 0);
                        class193.field2708.method2246(var4[var6], (byte) -66);
                    } else if (arg2 != 5) {
                        if (~arg2 != -7) {
                            if (~arg2 == -8) {
                                class118.method822(122, class103.field1515);
                                ++class319.field4180;
                                class193.field2708.method2229((byte) 90, 0);
                                class193.field2708.method2198(var4[var6], (byte) -23);
                            }
                        } else {
                            class118.method822(-77, class253.field3352);
                            ++class29.field488;
                            class193.field2708.method2239(0, 1937490080);
                            class193.field2708.method2198(var4[var6], (byte) -23);
                        }
                    } else {
                        ++class5.field141;
                        class118.method822(-75, class331.field4359);
                        class193.field2708.method2198(var4[var6], (byte) -23);
                        class193.field2708.method2239(0, 1937490080);
                    }
                } else {
                    ++class42.field625;
                    class118.method822(82, class266.field3511);
                    class193.field2708.method2246(var4[var6], (byte) -95);
                    class193.field2708.method2239(0, 1937490080);
                }
                break;
            }
        }
        if (!var5) {
            class414.method2404(class347.field4682.method1764(class489.field6789, false) + arg0, -116);
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(II)[[I", line = 409)
    public final int[][] method141(int arg0, int arg1) {
        if (arg0 != -30909) {
            this.method140(40, (byte) -87);
        }
        ++field2771;
        int[][] var3 = super.field268.method2561(arg1, 0);
        if (super.field268.field6091) {
            int[][] var4 = this.method139(0, 2, arg1);
            int[][] var5 = this.method139(1, arg0 ^ -30911, arg1);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            int[] var12 = var5[0];
            int[] var13 = var5[1];
            int[] var14 = var5[2];
            int var15 = this.field2775;
            if (~var15 != -2) {
                if (var15 != 2) {
                    if (~var15 != -4) {
                        if (~var15 != -5) {
                            if (~var15 != -6) {
                                if (~var15 != -7) {
                                    if (~var15 != -8) {
                                        if (var15 != 8) {
                                            if (~var15 != -10) {
                                                if (var15 != 10) {
                                                    if (var15 != 11) {
                                                        if (~var15 == -13) {
                                                            for (int var16 = 0; ~var16 > ~class115.field1637; ++var16) {
                                                                int var17 = var14[var16];
                                                                int var18 = var10[var16];
                                                                int var19 = var13[var16];
                                                                int var20 = var9[var16];
                                                                int var21 = var11[var16];
                                                                int var22 = var12[var16];
                                                                var6[var16] = var20 - -var22 - (var20 * var22 >> 11);
                                                                var7[var16] = -(var18 * var19 >> 11) + var19 + var18;
                                                                var8[var16] = -(var17 * var21 >> 11) + var21 + var17;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var23 = 0; var23 < class115.field1637; ++var23) {
                                                            int var24 = var13[var23];
                                                            int var25 = var11[var23];
                                                            int var26 = var9[var23];
                                                            int var27 = var12[var23];
                                                            int var28 = var14[var23];
                                                            int var29 = var10[var23];
                                                            var6[var23] = var26 <= var27 ? -var26 + var27 : -var27 + var26;
                                                            var7[var23] = ~var29 < ~var24 ? -var24 + var29 : -var29 + var24;
                                                            var8[var23] = var25 <= var28 ? -var25 + var28 : -var28 + var25;
                                                        }
                                                    }
                                                } else {
                                                    for (int var30 = 0; var30 < class115.field1637; ++var30) {
                                                        int var31 = var11[var30];
                                                        int var32 = var9[var30];
                                                        int var33 = var10[var30];
                                                        int var34 = var14[var30];
                                                        int var35 = var13[var30];
                                                        int var36 = var12[var30];
                                                        var6[var30] = var36 >= var32 ? var36 : var32;
                                                        var7[var30] = var35 < var33 ? var33 : var35;
                                                        var8[var30] = var31 <= var34 ? var34 : var31;
                                                    }
                                                }
                                            } else {
                                                for (int var37 = 0; class115.field1637 > var37; ++var37) {
                                                    int var38 = var10[var37];
                                                    int var39 = var11[var37];
                                                    int var40 = var14[var37];
                                                    int var41 = var9[var37];
                                                    int var42 = var13[var37];
                                                    int var43 = var12[var37];
                                                    var6[var37] = var43 <= var41 ? var43 : var41;
                                                    var7[var37] = var38 >= var42 ? var42 : var38;
                                                    var8[var37] = var40 > var39 ? var39 : var40;
                                                }
                                            }
                                        } else {
                                            for (int var44 = 0; ~class115.field1637 < ~var44; ++var44) {
                                                int var45 = var9[var44];
                                                int var46 = var10[var44];
                                                int var47 = var11[var44];
                                                var6[var44] = ~var45 != -1 ? 4096 - (4096 - var12[var44] << 12) / var45 : 0;
                                                var7[var44] = var46 != 0 ? 4096 - (-var13[var44] + 4096 << 12) / var46 : 0;
                                                var8[var44] = var47 == 0 ? 0 : 4096 - (-var14[var44] + 4096 << 12) / var47;
                                            }
                                        }
                                    } else {
                                        for (int var48 = 0; var48 < class115.field1637; ++var48) {
                                            int var49 = var11[var48];
                                            int var50 = var9[var48];
                                            int var51 = var10[var48];
                                            var6[var48] = var50 == 4096 ? 4096 : (var12[var48] << 12) / (-var50 + 4096);
                                            var7[var48] = ~var51 != -4097 ? (var13[var48] << 12) / (-var51 + 4096) : 4096;
                                            var8[var48] = ~var49 != -4097 ? (var14[var48] << 12) / (-var49 + 4096) : 4096;
                                        }
                                    }
                                } else {
                                    for (int var52 = 0; class115.field1637 > var52; ++var52) {
                                        int var53 = var13[var52];
                                        int var54 = var14[var52];
                                        int var55 = var12[var52];
                                        var6[var52] = var55 < 2048 ? var9[var52] * var55 >> 11 : -((-var9[var52] + 4096) * (-var55 + 4096) >> 11) + 4096;
                                        var7[var52] = var53 >= 2048 ? -((-var10[var52] + 4096) * (-var53 + 4096) >> 11) + 4096 : var10[var52] * var53 >> 11;
                                        var8[var52] = ~var54 > -2049 ? var11[var52] * var54 >> 11 : 4096 - ((-var11[var52] + 4096) * (-var54 + 4096) >> 11);
                                    }
                                }
                            } else {
                                for (int var56 = 0; ~class115.field1637 < ~var56; ++var56) {
                                    var6[var56] = -((4096 - var9[var56]) * (-var12[var56] + 4096) >> 12) + 4096;
                                    var7[var56] = -((-var10[var56] + 4096) * (-var13[var56] + 4096) >> 12) + 4096;
                                    var8[var56] = -((-var11[var56] + 4096) * (-var14[var56] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var57 = 0; ~var57 > ~class115.field1637; ++var57) {
                                int var58 = var12[var57];
                                int var59 = var14[var57];
                                int var60 = var13[var57];
                                var6[var57] = var58 == 0 ? 4096 : (var9[var57] << 12) / var58;
                                var7[var57] = var60 == 0 ? 4096 : (var10[var57] << 12) / var60;
                                var8[var57] = ~var59 != -1 ? (var11[var57] << 12) / var59 : 4096;
                            }
                        }
                    } else {
                        for (int var61 = 0; ~var61 > ~class115.field1637; ++var61) {
                            var6[var61] = var9[var61] * var12[var61] >> 12;
                            var7[var61] = var10[var61] * var13[var61] >> 12;
                            var8[var61] = var11[var61] * var14[var61] >> 12;
                        }
                    }
                } else {
                    for (int var62 = 0; ~class115.field1637 < ~var62; ++var62) {
                        var6[var62] = var9[var62] + -var12[var62];
                        var7[var62] = var10[var62] + -var13[var62];
                        var8[var62] = var11[var62] - var14[var62];
                    }
                }
            } else {
                for (int var63 = 0; ~var63 > ~class115.field1637; ++var63) {
                    var6[var63] = var9[var63] + var12[var63];
                    var7[var63] = var10[var63] + var13[var63];
                    var8[var63] = var11[var63] + var14[var63];
                }
            }
        }
        return var3;
    }
}
