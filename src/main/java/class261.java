import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class261 extends class196 {

    @OriginalMember(owner = "client!jh", name = "Y", descriptor = "I")
    private int field4555 = 6;

    @OriginalMember(owner = "client!jh", name = "U", descriptor = "I")
    public static int field4551 = 127;

    @OriginalMember(owner = "client!jh", name = "X", descriptor = "I")
    public static int field4554 = 0;

    @OriginalMember(owner = "client!jh", name = "ab", descriptor = "Lqh;")
    public static class189 field4557 = new class189(50);

    @OriginalMember(owner = "client!jh", name = "eb", descriptor = "Lqh;")
    public static class189 field4561 = new class189(32);

    @OriginalMember(owner = "client!jh", name = "fb", descriptor = "Ldf;")
    public static class51 field4562 = null;

    @OriginalMember(owner = "client!jh", name = "gb", descriptor = "Ldf;")
    public static class51 field4563 = class46.method233("sl_back", 100);

    @OriginalMember(owner = "client!jh", name = "Q", descriptor = "I")
    public static int field4547;

    @OriginalMember(owner = "client!jh", name = "R", descriptor = "I")
    public static int field4548;

    @OriginalMember(owner = "client!jh", name = "S", descriptor = "I")
    public static int field4549;

    @OriginalMember(owner = "client!jh", name = "T", descriptor = "I")
    public static int field4550;

    @OriginalMember(owner = "client!jh", name = "V", descriptor = "I")
    public static int field4552;

    @OriginalMember(owner = "client!jh", name = "W", descriptor = "I")
    public static int field4553;

    @OriginalMember(owner = "client!jh", name = "Z", descriptor = "I")
    public static int field4556;

    @OriginalMember(owner = "client!jh", name = "bb", descriptor = "I")
    public static int field4558;

    @OriginalMember(owner = "client!jh", name = "cb", descriptor = "I")
    public static int field4559;

    @OriginalMember(owner = "client!jh", name = "db", descriptor = "I")
    public static int field4560;

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "(BI)V")
    public static final void method1771(byte arg0, int arg1) {
        ++field4549;
        if (class92.field1522 == null) {
            class92.field1522 = new byte[4][104][104];
        }
        int var2 = 0;
        if (arg1 == -28327) {
            while (var2 < 4) {
                for (int var3 = 0; var3 < 104; ++var3) {
                    for (int var4 = 0; ~var4 > -105; ++var4) {
                        class92.field1522[var2][var3][var4] = arg0;
                    }
                }
                ++var2;
            }
        }
    }

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "(II)[I")
    public final int[] method45(int arg0, int arg1) {
        if (arg1 != 10565) {
            return null;
        } else {
            ++field4550;
            int[] var3 = super.field3274.method1476(true, arg0);
            if (super.field3274.field3741) {
                int[] var4 = this.method1390(arg0, 0, -121);
                int[] var5 = this.method1390(arg0, 1, arg1 + -10656);
                int var6 = this.field4555;
                if (var6 != 1) {
                    if (var6 != 2) {
                        if (var6 != 3) {
                            if (var6 != 4) {
                                if (~var6 != -6) {
                                    if (var6 != 6) {
                                        if (var6 != 7) {
                                            if (~var6 != -9) {
                                                if (~var6 != -10) {
                                                    if (var6 != 10) {
                                                        if (var6 != 11) {
                                                            if (~var6 == -13) {
                                                                for (int var7 = 0; ~var7 > ~class49.field767; ++var7) {
                                                                    int var8 = var5[var7];
                                                                    int var9 = var4[var7];
                                                                    var3[var7] = var9 - -var8 + -(var8 * var9 >> 11);
                                                                }
                                                            }
                                                        } else {
                                                            for (int var10 = 0; class49.field767 > var10; ++var10) {
                                                                int var11 = var4[var10];
                                                                int var12 = var5[var10];
                                                                var3[var10] = ~var12 <= ~var11 ? -var11 + var12 : var11 - var12;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var13 = 0; class49.field767 > var13; ++var13) {
                                                            int var14 = var4[var13];
                                                            int var15 = var5[var13];
                                                            var3[var13] = var14 > var15 ? var14 : var15;
                                                        }
                                                    }
                                                } else {
                                                    for (int var16 = 0; ~class49.field767 < ~var16; ++var16) {
                                                        int var17 = var5[var16];
                                                        int var18 = var4[var16];
                                                        var3[var16] = ~var17 >= ~var18 ? var17 : var18;
                                                    }
                                                }
                                            } else {
                                                for (int var19 = 0; ~class49.field767 < ~var19; ++var19) {
                                                    int var20 = var4[var19];
                                                    var3[var19] = var20 != 0 ? -((-var5[var19] + 4096 << 12) / var20) + 4096 : 0;
                                                }
                                            }
                                        } else {
                                            for (int var21 = 0; ~class49.field767 < ~var21; ++var21) {
                                                int var22 = var4[var21];
                                                var3[var21] = ~var22 != -4097 ? (var5[var21] << 12) / (-var22 + 4096) : 4096;
                                            }
                                        }
                                    } else {
                                        for (int var23 = 0; class49.field767 > var23; ++var23) {
                                            int var24 = var5[var23];
                                            var3[var23] = var24 >= 2048 ? -((4096 - var4[var23]) * (-var24 + 4096) >> 11) + 4096 : var4[var23] * var24 >> 11;
                                        }
                                    }
                                } else {
                                    for (int var25 = 0; ~var25 > ~class49.field767; ++var25) {
                                        var3[var25] = -((-var4[var25] + 4096) * (-var5[var25] + 4096) >> 12) + 4096;
                                    }
                                }
                            } else {
                                for (int var26 = 0; var26 < class49.field767; ++var26) {
                                    int var27 = var5[var26];
                                    var3[var26] = var27 == 0 ? 4096 : (var4[var26] << 12) / var27;
                                }
                            }
                        } else {
                            for (int var28 = 0; var28 < class49.field767; ++var28) {
                                var3[var28] = var4[var28] * var5[var28] >> 12;
                            }
                        }
                    } else {
                        for (int var29 = 0; ~var29 > ~class49.field767; ++var29) {
                            var3[var29] = var4[var29] + -var5[var29];
                        }
                    }
                } else {
                    for (int var30 = 0; ~class49.field767 < ~var30; ++var30) {
                        var3[var30] = var4[var30] + var5[var30];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(ILlb;B)V")
    public final void method44(int arg0, class121 arg1, byte arg2) {
        if (arg2 != 82) {
            field4557 = null;
        }
        ++field4548;
        if (~arg0 != -1) {
            if (arg0 == 1) {
                super.field3291 = arg1.method897(arg2 ^ 63) == 1;
            }
        } else {
            this.field4555 = arg1.method897(arg2 + 39);
        }
    }

    @OriginalMember(owner = "client!jh", name = "f", descriptor = "(I)V")
    public static final void method1772(int arg0) {
        ++field4552;
        class160.method1137((byte) 51);
        if (arg0 >= 80) {
            System.gc();
            class100.method734(true, 25);
        }
    }

    @OriginalMember(owner = "client!jh", name = "g", descriptor = "(I)V")
    public static void method1773(int arg0) {
        field4563 = null;
        field4557 = null;
        field4562 = null;
        field4561 = null;
        if (arg0 != 4096) {
            method1775(123, -88, 53);
        }
    }

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "(III)V")
    public static final void method1774(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class52.field895; ++var3) {
            for (int var4 = 0; var4 < class48.field758; ++var4) {
                for (int var5 = 0; var5 < class192.field3229; ++var5) {
                    class97 var6 = class27.field395[var3][var4][var5];
                    if (var6 != null) {
                        class241 var7 = var6.field1627;
                        if (var7 != null && var7.field4183.method259()) {
                            class80.method592(var7.field4183, var3, var4, var5, 1, 1);
                            if (var7.field4187 != null && var7.field4187.method259()) {
                                class80.method592(var7.field4187, var3, var4, var5, 1, 1);
                                var7.field4183.method261(var7.field4187, 0, 0, 0, false);
                                var7.field4187 = var7.field4187.method260(arg0, arg1, arg2);
                            }
                            var7.field4183 = var7.field4183.method260(arg0, arg1, arg2);
                        }
                        for (int var8 = 0; var8 < var6.field1620; ++var8) {
                            class33 var10 = var6.field1632[var8];
                            if (var10 != null && var10.field488.method259()) {
                                class80.method592(var10.field488, var3, var4, var5, var10.field495 - var10.field492 + 1, var10.field478 - var10.field491 + 1);
                                var10.field488 = var10.field488.method260(arg0, arg1, arg2);
                            }
                        }
                        class162 var9 = var6.field1614;
                        if (var9 != null && var9.field2655.method259()) {
                            class24.method129(var9.field2655, var3, var4, var5);
                            var9.field2655 = var9.field2655.method260(arg0, arg1, arg2);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(BI)[[I")
    public final int[][] method46(byte arg0, int arg1) {
        int[][] var3 = super.field3285.method1548(arg1, (byte) -78);
        ++field4547;
        if (arg0 != 11) {
            method1774(-76, -64, -72);
        }
        if (super.field3285.field3963) {
            int[][] var4 = this.method1387(arg0 ^ 127, 0, arg1);
            int[][] var5 = this.method1387(35, 1, arg1);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            int[] var9 = var4[1];
            int[] var10 = var4[0];
            int[] var11 = var4[2];
            int[] var12 = var5[0];
            int[] var13 = var5[1];
            int[] var14 = var5[2];
            int var15 = this.field4555;
            if (var15 != 1) {
                if (var15 != 2) {
                    if (~var15 != -4) {
                        if (~var15 != -5) {
                            if (~var15 != -6) {
                                if (var15 != 6) {
                                    if (~var15 != -8) {
                                        if (var15 != 8) {
                                            if (var15 != 9) {
                                                if (var15 != 10) {
                                                    if (var15 != 11) {
                                                        if (~var15 == -13) {
                                                            for (int var16 = 0; var16 < class49.field767; ++var16) {
                                                                int var17 = var9[var16];
                                                                int var18 = var12[var16];
                                                                int var19 = var14[var16];
                                                                int var20 = var13[var16];
                                                                int var21 = var11[var16];
                                                                int var22 = var10[var16];
                                                                var6[var16] = var22 - -var18 + -(var18 * var22 >> 11);
                                                                var7[var16] = var17 + var20 + -(var17 * var20 >> 11);
                                                                var8[var16] = -(var19 * var21 >> 11) + var19 + var21;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var23 = 0; ~class49.field767 < ~var23; ++var23) {
                                                            int var24 = var14[var23];
                                                            int var25 = var13[var23];
                                                            int var26 = var9[var23];
                                                            int var27 = var10[var23];
                                                            int var28 = var12[var23];
                                                            int var29 = var11[var23];
                                                            var6[var23] = ~var27 >= ~var28 ? var28 - var27 : -var28 + var27;
                                                            var7[var23] = ~var26 >= ~var25 ? -var26 + var25 : -var25 + var26;
                                                            var8[var23] = ~var24 <= ~var29 ? -var29 + var24 : var29 - var24;
                                                        }
                                                    }
                                                } else {
                                                    for (int var30 = 0; class49.field767 > var30; ++var30) {
                                                        int var31 = var12[var30];
                                                        int var32 = var14[var30];
                                                        int var33 = var11[var30];
                                                        int var34 = var13[var30];
                                                        int var35 = var10[var30];
                                                        int var36 = var9[var30];
                                                        var6[var30] = var31 >= var35 ? var31 : var35;
                                                        var7[var30] = ~var34 <= ~var36 ? var34 : var36;
                                                        var8[var30] = var32 < var33 ? var33 : var32;
                                                    }
                                                }
                                            } else {
                                                for (int var37 = 0; class49.field767 > var37; ++var37) {
                                                    int var38 = var12[var37];
                                                    int var39 = var9[var37];
                                                    int var40 = var11[var37];
                                                    int var41 = var14[var37];
                                                    int var42 = var13[var37];
                                                    int var43 = var10[var37];
                                                    var6[var37] = var38 > var43 ? var43 : var38;
                                                    var7[var37] = ~var42 >= ~var39 ? var42 : var39;
                                                    var8[var37] = var40 >= var41 ? var41 : var40;
                                                }
                                            }
                                        } else {
                                            for (int var44 = 0; ~class49.field767 < ~var44; ++var44) {
                                                int var45 = var9[var44];
                                                int var46 = var11[var44];
                                                int var47 = var10[var44];
                                                var6[var44] = ~var47 != -1 ? -((4096 - var12[var44] << 12) / var47) + 4096 : 0;
                                                var7[var44] = var45 != 0 ? 4096 - (4096 - var13[var44] << 12) / var45 : 0;
                                                var8[var44] = var46 != 0 ? -((-var14[var44] + 4096 << 12) / var46) + 4096 : 0;
                                            }
                                        }
                                    } else {
                                        for (int var48 = 0; ~var48 > ~class49.field767; ++var48) {
                                            int var49 = var9[var48];
                                            int var50 = var10[var48];
                                            int var51 = var11[var48];
                                            var6[var48] = var50 != 4096 ? (var12[var48] << 12) / (-var50 + 4096) : 4096;
                                            var7[var48] = var49 == 4096 ? 4096 : (var13[var48] << 12) / (-var49 + 4096);
                                            var8[var48] = ~var51 == -4097 ? 4096 : (var14[var48] << 12) / (4096 - var51);
                                        }
                                    }
                                } else {
                                    for (int var52 = 0; class49.field767 > var52; ++var52) {
                                        int var53 = var13[var52];
                                        int var54 = var12[var52];
                                        int var55 = var14[var52];
                                        var6[var52] = ~var54 <= -2049 ? -((-var10[var52] + 4096) * (-var54 + 4096) >> 11) + 4096 : var10[var52] * var54 >> 11;
                                        var7[var52] = ~var53 <= -2049 ? 4096 - ((4096 - var53) * (-var9[var52] + 4096) >> 11) : var9[var52] * var53 >> 11;
                                        var8[var52] = ~var55 <= -2049 ? 4096 - ((-var11[var52] + 4096) * (-var55 + 4096) >> 11) : var11[var52] * var55 >> 11;
                                    }
                                }
                            } else {
                                for (int var56 = 0; ~var56 > ~class49.field767; ++var56) {
                                    var6[var56] = -((4096 - var10[var56]) * (-var12[var56] + 4096) >> 12) + 4096;
                                    var7[var56] = -((-var9[var56] + 4096) * (-var13[var56] + 4096) >> 12) + 4096;
                                    var8[var56] = -((-var11[var56] + 4096) * (-var14[var56] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var57 = 0; ~class49.field767 < ~var57; ++var57) {
                                int var58 = var12[var57];
                                int var59 = var14[var57];
                                int var60 = var13[var57];
                                var6[var57] = ~var58 == -1 ? 4096 : (var10[var57] << 12) / var58;
                                var7[var57] = var60 != 0 ? (var9[var57] << 12) / var60 : 4096;
                                var8[var57] = var59 == 0 ? 4096 : (var11[var57] << 12) / var59;
                            }
                        }
                    } else {
                        for (int var61 = 0; ~class49.field767 < ~var61; ++var61) {
                            var6[var61] = var10[var61] * var12[var61] >> 12;
                            var7[var61] = var9[var61] * var13[var61] >> 12;
                            var8[var61] = var11[var61] * var14[var61] >> 12;
                        }
                    }
                } else {
                    for (int var62 = 0; ~var62 > ~class49.field767; ++var62) {
                        var6[var62] = var10[var62] + -var12[var62];
                        var7[var62] = var9[var62] + -var13[var62];
                        var8[var62] = var11[var62] + -var14[var62];
                    }
                }
            } else {
                for (int var63 = 0; ~class49.field767 < ~var63; ++var63) {
                    var6[var63] = var10[var63] + var12[var63];
                    var7[var63] = var9[var63] + var13[var63];
                    var8[var63] = var11[var63] - -var14[var63];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jh", name = "<init>", descriptor = "()V")
    public class261() {
        super(2, false);
    }

    @OriginalMember(owner = "client!jh", name = "e", descriptor = "(III)V")
    public static final void method1775(int arg0, int arg1, int arg2) {
        if (arg2 != -11828) {
            field4551 = -72;
        }
        class30.field439[arg1] = arg0;
        ++field4553;
        class84 var3 = (class84) class189.field3158.method1453((long) arg1, arg2 ^ -11827);
        if (var3 != null) {
            var3.field1413 = class7.method31((byte) -88) + 500L;
        } else {
            class84 var4 = new class84(class7.method31((byte) -88) - -500L);
            class189.field3158.method1447(66, (long) arg1, var4);
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(ILjg;)V")
    public static final void method1776(int arg0, class158 arg1) {
        ++field4556;
        for (int var2 = 0; ~var2 > ~class207.field3455.length; ++var2) {
            class207.field3455[var2] = 0;
        }
        if (arg0 < 93) {
            field4554 = -61;
        }
        short var3 = 256;
        for (int var4 = 0; ~var4 > -5001; ++var4) {
            int var16 = (int) (128.0D * Math.random() * (double) var3);
            class207.field3455[var16] = (int) (284.0D * Math.random());
        }
        for (int var5 = 0; var5 < 20; ++var5) {
            for (int var12 = 1; var12 < var3 + -1; ++var12) {
                for (int var14 = 1; ~var14 > -128; ++var14) {
                    int var15 = (var12 << 7) + var14;
                    class143.field2393[var15] = (class207.field3455[var15 - -128] + class207.field3455[var15 + -128] + class207.field3455[var15 - 1] + class207.field3455[var15 + 1]) / 4;
                }
            }
            int[] var13 = class207.field3455;
            class207.field3455 = class143.field2393;
            class143.field2393 = var13;
        }
        if (arg1 != null) {
            int var6 = 0;
            for (int var7 = 0; ~arg1.field2577 < ~var7; ++var7) {
                for (int var8 = 0; ~var8 > ~arg1.field2583; ++var8) {
                    if (~arg1.field2603[var6++] != -1) {
                        int var9 = arg1.field2574 + 16 + var8;
                        int var10 = arg1.field2585 + 16 + var7;
                        int var11 = (var10 << 7) + var9;
                        class207.field3455[var11] = 0;
                    }
                }
            }
        }
    }
}
