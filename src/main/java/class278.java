import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class278 extends class223 {

    @OriginalMember(owner = "client!sa", name = "T", descriptor = "I")
    private int field4418 = 6;

    @OriginalMember(owner = "client!sa", name = "L", descriptor = "I")
    public static int field4410 = 100;

    @OriginalMember(owner = "client!sa", name = "M", descriptor = "I")
    public static int field4411 = 0;

    @OriginalMember(owner = "client!sa", name = "J", descriptor = "S")
    public static short field4408 = 32767;

    @OriginalMember(owner = "client!sa", name = "P", descriptor = "[Ljava/lang/String;")
    public static String[] field4414 = null;

    @OriginalMember(owner = "client!sa", name = "Q", descriptor = "[Ljava/lang/String;")
    public static String[] field4415 = new String[100];

    @OriginalMember(owner = "client!sa", name = "K", descriptor = "I")
    public static int field4409;

    @OriginalMember(owner = "client!sa", name = "N", descriptor = "I")
    public static int field4412;

    @OriginalMember(owner = "client!sa", name = "O", descriptor = "I")
    public static int field4413;

    @OriginalMember(owner = "client!sa", name = "S", descriptor = "I")
    public static int field4417;

    @OriginalMember(owner = "client!sa", name = "U", descriptor = "I")
    public static int field4419;

    @OriginalMember(owner = "client!sa", name = "R", descriptor = "Lel;")
    public static class213 field4416;

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "()V")
    public class278() {
        super(2, false);
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(BI)[I")
    public final int[] method40(byte arg0, int arg1) {
        ++field4412;
        int[] var3 = super.field3588.method1611(0, arg1);
        if (arg0 <= 14) {
            method1892(97);
        }
        if (super.field3588.field3722) {
            int[] var4 = this.method1533(0, arg1, -114);
            int[] var5 = this.method1533(1, arg1, -73);
            int var6 = this.field4418;
            if (~var6 != -2) {
                if (~var6 != -3) {
                    if (~var6 != -4) {
                        if (~var6 != -5) {
                            if (var6 != 5) {
                                if (var6 != 6) {
                                    if (~var6 != -8) {
                                        if (var6 != 8) {
                                            if (~var6 != -10) {
                                                if (var6 != 10) {
                                                    if (~var6 != -12) {
                                                        if (var6 == 12) {
                                                            for (int var7 = 0; class250.field4008 > var7; ++var7) {
                                                                int var8 = var5[var7];
                                                                int var9 = var4[var7];
                                                                var3[var7] = var9 - (var8 * var9 >> 11) + var8;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var10 = 0; ~class250.field4008 < ~var10; ++var10) {
                                                            int var11 = var5[var10];
                                                            int var12 = var4[var10];
                                                            var3[var10] = ~var11 > ~var12 ? var12 - var11 : var11 - var12;
                                                        }
                                                    }
                                                } else {
                                                    for (int var13 = 0; var13 < class250.field4008; ++var13) {
                                                        int var14 = var5[var13];
                                                        int var15 = var4[var13];
                                                        var3[var13] = var15 > var14 ? var15 : var14;
                                                    }
                                                }
                                            } else {
                                                for (int var16 = 0; var16 < class250.field4008; ++var16) {
                                                    int var17 = var5[var16];
                                                    int var18 = var4[var16];
                                                    var3[var16] = var17 <= var18 ? var17 : var18;
                                                }
                                            }
                                        } else {
                                            for (int var19 = 0; var19 < class250.field4008; ++var19) {
                                                int var20 = var4[var19];
                                                var3[var19] = var20 != 0 ? -((-var5[var19] + 4096 << 12) / var20) + 4096 : 0;
                                            }
                                        }
                                    } else {
                                        for (int var21 = 0; ~var21 > ~class250.field4008; ++var21) {
                                            int var22 = var4[var21];
                                            var3[var21] = ~var22 == -4097 ? 4096 : (var5[var21] << 12) / (-var22 + 4096);
                                        }
                                    }
                                } else {
                                    for (int var23 = 0; ~class250.field4008 < ~var23; ++var23) {
                                        int var24 = var5[var23];
                                        var3[var23] = var24 >= 2048 ? -((-var4[var23] + 4096) * (-var24 + 4096) >> 11) + 4096 : var4[var23] * var24 >> 11;
                                    }
                                }
                            } else {
                                for (int var25 = 0; ~var25 > ~class250.field4008; ++var25) {
                                    var3[var25] = -((4096 - var5[var25]) * (-var4[var25] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var26 = 0; ~var26 > ~class250.field4008; ++var26) {
                                int var27 = var5[var26];
                                var3[var26] = ~var27 != -1 ? (var4[var26] << 12) / var27 : 4096;
                            }
                        }
                    } else {
                        for (int var28 = 0; var28 < class250.field4008; ++var28) {
                            var3[var28] = var4[var28] * var5[var28] >> 12;
                        }
                    }
                } else {
                    for (int var29 = 0; ~class250.field4008 < ~var29; ++var29) {
                        var3[var29] = var4[var29] + -var5[var29];
                    }
                }
            } else {
                for (int var30 = 0; ~var30 > ~class250.field4008; ++var30) {
                    var3[var30] = var4[var30] + var5[var30];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "(I)V")
    public static void method1892(int arg0) {
        if (arg0 == -1938190068) {
            field4414 = null;
            field4416 = null;
            field4415 = null;
        }
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(BI)V")
    public static final void method1893(byte arg0, int arg1) {
        ++field4419;
        int var2 = 0 / ((23 - arg0) / 45);
        int var3 = class259.field4112;
        if (arg1 == 0) {
            var3 = 1;
        }
        int var10002;
        for (int var4 = 0; ~var3 < ~var4; ++var4) {
            class136 var21;
            if (~arg1 != -1) {
                var21 = class233.field3682[class26.field455[var4]];
            } else {
                var21 = class263.field4168;
            }
            if (var21 != null && var21.method1006(-1)) {
                int var22 = var21.method1013(0);
                if (~arg1 == -1 || arg1 == var22) {
                    if (var22 == 1) {
                        if (~(127 & var21.field4725) == -65 && (var21.field4709 & 127) == 64) {
                            int var23 = var21.field4725 >> 7;
                            int var24 = var21.field4709 >> 7;
                            if (var23 >= 0 && var23 < 104 && var24 >= 0 && var24 < 104) {
                                var10002 = class184.field2909[var23][var24]++;
                            }
                        }
                    } else if ((~(1 & var22) != -1 || (127 & var21.field4725) == 0 && ~(var21.field4709 & 127) == -1) && (~(var22 & 1) != -2 || (127 & var21.field4725) == 64 && (var21.field4709 & 127) == 64)) {
                        int var25 = var21.field4725 - var22 * 64 >> 7;
                        int var26 = var21.field4709 - var22 * 64 >> 7;
                        int var27 = var25 + var21.method1013(0);
                        if (~var27 < -105) {
                            var27 = 104;
                        }
                        if (~var25 > -1) {
                            var25 = 0;
                        }
                        int var28 = var26 - -var21.method1013(0);
                        if (var26 < 0) {
                            var26 = 0;
                        }
                        if (var28 > 104) {
                            var28 = 104;
                        }
                        for (int var29 = var25; var29 < var27; ++var29) {
                            for (int var30 = var26; var30 < var28; ++var30) {
                                var10002 = class184.field2909[var29][var30]++;
                            }
                        }
                    }
                }
            }
        }
        label213: for (int var5 = 0; ~var5 > ~var3; ++var5) {
            class136 var6;
            long var7;
            if (~arg1 != -1) {
                var6 = class233.field3682[class26.field455[var5]];
                var7 = (long) class26.field455[var5] << 32;
            } else {
                var7 = 8791798054912L;
                var6 = class263.field4168;
            }
            if (var6 != null && var6.method1006(-1)) {
                int var9 = var6.method1013(0);
                if (arg1 == 0 || ~arg1 == ~var9) {
                    var6.field4687 = true;
                    var6.field2042 = false;
                    if ((class140.field2089 && class259.field4112 > 200 || class259.field4112 > 50) && arg1 != 0 && ~var6.field4736 == ~var6.method1982((byte) 119).field3872) {
                        var6.field2042 = true;
                    }
                    if (~var9 != -2) {
                        if (~(var9 & 1) == -1 && (var6.field4725 & 127) == 0 && (127 & var6.field4709) == 0 || ~(1 & var9) == -2 && (var6.field4725 & 127) == 64 && ~(127 & var6.field4709) == -1) {
                            boolean var10 = true;
                            int var11 = var6.field4725 - var9 * 64 >> 7;
                            int var12 = var6.field4709 - var9 * 64 >> 7;
                            int var13 = var9 + var12;
                            int var14 = var9 + var11;
                            if (~var11 > -1) {
                                var11 = 0;
                            }
                            if (~var12 > -1) {
                                var12 = 0;
                            }
                            if (var14 > 104) {
                                var14 = 104;
                            }
                            if (var13 > 104) {
                                var13 = 104;
                            }
                            for (int var15 = var11; var14 > var15; ++var15) {
                                for (int var18 = var12; var13 > var18; ++var18) {
                                    if (~class184.field2909[var15][var18] >= -2) {
                                        var10 = false;
                                        break;
                                    }
                                }
                            }
                            if (var10) {
                                int var16 = var11;
                                while (true) {
                                    if (var14 <= var16) {
                                        continue label213;
                                    }
                                    for (int var17 = var12; var13 > var17; ++var17) {
                                        var10002 = class184.field2909[var16][var17]--;
                                    }
                                    ++var16;
                                }
                            }
                        }
                    } else if (~(127 & var6.field4725) == -65 && ~(var6.field4709 & 127) == -65) {
                        int var19 = var6.field4725 >> 7;
                        int var20 = var6.field4709 >> 7;
                        if (~var19 > -1 || var19 >= 104 || var20 < 0 || ~var20 <= -105) {
                            continue;
                        }
                        if (class184.field2909[var19][var20] > 1) {
                            var10002 = class184.field2909[var19][var20]--;
                            continue;
                        }
                    }
                    if (var6.field4704 != null && var6.field4731 <= class41.field686 && ~class41.field686 > ~var6.field4664) {
                        var6.field2042 = false;
                        var6.field4687 = false;
                        var6.field4767 = class254.method1721(-580808345, class130.field1941, var6.field4709, var6.field4725);
                        class74.method582(class130.field1941, var6.field4725, var6.field4709, var6.field4767, var6, var6.field4719, var7, var6.field4770, var6.field4678, var6.field4726, var6.field4721);
                    } else {
                        var6.field4687 = false;
                        var6.field4767 = class254.method1721(-580808345, class130.field1941, var6.field4709, var6.field4725);
                        class147.method1071(class130.field1941, var6.field4725, var6.field4709, var6.field4767, (var9 + -1) * 64 + 60, var6, var6.field4719, var7, var6.field4769);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lha;IB)V")
    public final void method37(class31 arg0, int arg1, byte arg2) {
        ++field4409;
        if (arg1 != 0) {
            if (~arg1 == -2) {
                super.field3583 = ~arg0.method265(-96) == -2;
            }
        } else {
            this.field4418 = arg0.method265(-114);
        }
        if (arg2 != 102) {
            this.method135(1, 103);
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(II)[[I")
    public final int[][] method135(int arg0, int arg1) {
        ++field4417;
        if (arg0 < 0) {
            field4414 = null;
        }
        int[][] var3 = super.field3572.method1818(arg1, false);
        if (super.field3572.field4257) {
            int[][] var4 = this.method1534(false, 0, arg1);
            int[][] var5 = this.method1534(false, 1, arg1);
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            int[] var8 = var3[0];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var5[0];
            int[] var12 = var5[2];
            int[] var13 = var5[1];
            int[] var14 = var4[2];
            int var15 = this.field4418;
            if (~var15 != -2) {
                if (var15 != 2) {
                    if (var15 != 3) {
                        if (var15 != 4) {
                            if (~var15 != -6) {
                                if (var15 != 6) {
                                    if (~var15 != -8) {
                                        if (var15 != 8) {
                                            if (var15 != 9) {
                                                if (var15 != 10) {
                                                    if (var15 != 11) {
                                                        if (var15 == 12) {
                                                            for (int var16 = 0; class250.field4008 > var16; ++var16) {
                                                                int var17 = var12[var16];
                                                                int var18 = var10[var16];
                                                                int var19 = var11[var16];
                                                                int var20 = var14[var16];
                                                                int var21 = var13[var16];
                                                                int var22 = var9[var16];
                                                                var8[var16] = var19 + var22 + -(var19 * var22 >> 11);
                                                                var6[var16] = var18 - -var21 + -(var18 * var21 >> 11);
                                                                var7[var16] = var17 + var20 + -(var17 * var20 >> 11);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var23 = 0; ~class250.field4008 < ~var23; ++var23) {
                                                            int var24 = var13[var23];
                                                            int var25 = var12[var23];
                                                            int var26 = var11[var23];
                                                            int var27 = var14[var23];
                                                            int var28 = var9[var23];
                                                            int var29 = var10[var23];
                                                            var8[var23] = var28 <= var26 ? var26 - var28 : -var26 + var28;
                                                            var6[var23] = ~var29 < ~var24 ? -var24 + var29 : -var29 + var24;
                                                            var7[var23] = ~var25 <= ~var27 ? var25 - var27 : var27 - var25;
                                                        }
                                                    }
                                                } else {
                                                    for (int var30 = 0; var30 < class250.field4008; ++var30) {
                                                        int var31 = var12[var30];
                                                        int var32 = var13[var30];
                                                        int var33 = var11[var30];
                                                        int var34 = var14[var30];
                                                        int var35 = var10[var30];
                                                        int var36 = var9[var30];
                                                        var8[var30] = ~var36 >= ~var33 ? var33 : var36;
                                                        var6[var30] = var35 <= var32 ? var32 : var35;
                                                        var7[var30] = var34 <= var31 ? var31 : var34;
                                                    }
                                                }
                                            } else {
                                                for (int var37 = 0; ~class250.field4008 < ~var37; ++var37) {
                                                    int var38 = var12[var37];
                                                    int var39 = var10[var37];
                                                    int var40 = var13[var37];
                                                    int var41 = var9[var37];
                                                    int var42 = var14[var37];
                                                    int var43 = var11[var37];
                                                    var8[var37] = ~var41 <= ~var43 ? var43 : var41;
                                                    var6[var37] = ~var39 <= ~var40 ? var40 : var39;
                                                    var7[var37] = var42 >= var38 ? var38 : var42;
                                                }
                                            }
                                        } else {
                                            for (int var44 = 0; ~var44 > ~class250.field4008; ++var44) {
                                                int var45 = var14[var44];
                                                int var46 = var10[var44];
                                                int var47 = var9[var44];
                                                var8[var44] = var47 == 0 ? 0 : -((4096 - var11[var44] << 12) / var47) + 4096;
                                                var6[var44] = ~var46 != -1 ? -((-var13[var44] + 4096 << 12) / var46) + 4096 : 0;
                                                var7[var44] = ~var45 == -1 ? 0 : -((-var12[var44] + 4096 << 12) / var45) + 4096;
                                            }
                                        }
                                    } else {
                                        for (int var48 = 0; ~class250.field4008 < ~var48; ++var48) {
                                            int var49 = var14[var48];
                                            int var50 = var9[var48];
                                            int var51 = var10[var48];
                                            var8[var48] = var50 != 4096 ? (var11[var48] << 12) / (-var50 + 4096) : 4096;
                                            var6[var48] = var51 != 4096 ? (var13[var48] << 12) / (-var51 + 4096) : 4096;
                                            var7[var48] = ~var49 == -4097 ? 4096 : (var12[var48] << 12) / (4096 - var49);
                                        }
                                    }
                                } else {
                                    for (int var52 = 0; ~class250.field4008 < ~var52; ++var52) {
                                        int var53 = var13[var52];
                                        int var54 = var12[var52];
                                        int var55 = var11[var52];
                                        var8[var52] = var55 >= 2048 ? -((4096 - var9[var52]) * (-var55 + 4096) >> 11) + 4096 : var9[var52] * var55 >> 11;
                                        var6[var52] = var53 >= 2048 ? -((-var10[var52] + 4096) * (-var53 + 4096) >> 11) + 4096 : var10[var52] * var53 >> 11;
                                        var7[var52] = ~var54 <= -2049 ? -((4096 - var54) * (-var14[var52] + 4096) >> 11) + 4096 : var14[var52] * var54 >> 11;
                                    }
                                }
                            } else {
                                for (int var56 = 0; var56 < class250.field4008; ++var56) {
                                    var8[var56] = -((4096 - var9[var56]) * (-var11[var56] + 4096) >> 12) + 4096;
                                    var6[var56] = -((4096 - var10[var56]) * (4096 - var13[var56]) >> 12) + 4096;
                                    var7[var56] = -((-var12[var56] + 4096) * (-var14[var56] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var57 = 0; var57 < class250.field4008; ++var57) {
                                int var58 = var12[var57];
                                int var59 = var13[var57];
                                int var60 = var11[var57];
                                var8[var57] = var60 != 0 ? (var9[var57] << 12) / var60 : 4096;
                                var6[var57] = ~var59 == -1 ? 4096 : (var10[var57] << 12) / var59;
                                var7[var57] = ~var58 != -1 ? (var14[var57] << 12) / var58 : 4096;
                            }
                        }
                    } else {
                        for (int var61 = 0; ~class250.field4008 < ~var61; ++var61) {
                            var8[var61] = var9[var61] * var11[var61] >> 12;
                            var6[var61] = var10[var61] * var13[var61] >> 12;
                            var7[var61] = var12[var61] * var14[var61] >> 12;
                        }
                    }
                } else {
                    for (int var62 = 0; var62 < class250.field4008; ++var62) {
                        var8[var62] = var9[var62] + -var11[var62];
                        var6[var62] = var10[var62] + -var13[var62];
                        var7[var62] = var14[var62] + -var12[var62];
                    }
                }
            } else {
                for (int var63 = 0; class250.field4008 > var63; ++var63) {
                    var8[var63] = var9[var63] - -var11[var63];
                    var6[var63] = var10[var63] + var13[var63];
                    var7[var63] = var12[var63] + var14[var63];
                }
            }
        }
        return var3;
    }
}
