import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class380 extends class793 implements class525 {

    @OriginalMember(owner = "client!vh", name = "q", descriptor = "I")
    private int field4818;

    @OriginalMember(owner = "client!vh", name = "t", descriptor = "S")
    public static short field4821 = 320;

    @OriginalMember(owner = "client!vh", name = "l", descriptor = "I")
    public static int field4813;

    @OriginalMember(owner = "client!vh", name = "m", descriptor = "I")
    public static int field4814;

    @OriginalMember(owner = "client!vh", name = "n", descriptor = "I")
    public static int field4815;

    @OriginalMember(owner = "client!vh", name = "o", descriptor = "I")
    public static int field4816;

    @OriginalMember(owner = "client!vh", name = "p", descriptor = "I")
    public static int field4817;

    @OriginalMember(owner = "client!vh", name = "r", descriptor = "I")
    public static int field4819;

    @OriginalMember(owner = "client!vh", name = "s", descriptor = "I")
    public static int field4820;

    @OriginalMember(owner = "client!vh", name = "u", descriptor = "I")
    public static int field4822;

    @OriginalMember(owner = "client!vh", name = "v", descriptor = "I")
    public static int field4823;

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(I)I", line = 8)
    public final int method1321(int arg0) {
        int var2 = -90 / ((arg0 - 69) / 36);
        ++field4820;
        return super.field10894;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(BI)V", line = 18)
    public static final void method2222(byte arg0, int arg1) {
        int var2 = 28 % ((arg1 - -52) / 43);
        ++field4813;
        if (class267.field3162 == null) {
            class267.field3162 = new byte[4][class596.field8090][class107.field1350];
        }
        for (int var3 = 0; var3 < 4; ++var3) {
            for (int var4 = 0; class596.field8090 > var4; ++var4) {
                for (int var5 = 0; ~class107.field1350 < ~var5; ++var5) {
                    class267.field3162[var3][var4][var5] = arg0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(III[B)V", line = 54)
    public final void method1319(int arg0, int arg1, int arg2, byte[] arg3) {
        ++field4816;
        this.method4370(arg3, arg0, arg2 + 56286);
        if (arg2 == -21246) {
            this.field4818 = arg1;
        }
    }

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "(B)V", line = 66)
    public final void method465(byte arg0) {
        if (arg0 != 62) {
            this.method1319(75, 2, -108, (byte[]) null);
        }
        super.field10898.method3896(this, -204);
        ++field4822;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(BLer;[[B)V", line = 77)
    public static final void method2223(byte arg0, class117 arg1, byte[][] arg2) {
        ++field4819;
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        for (int var4 = 0; ~var4 > ~arg1.field3317; ++var4) {
            class580.method3339((byte) -58);
            for (int var9 = 0; ~var9 > ~(class596.field8090 >> 3); ++var9) {
                for (int var10 = 0; ~var10 > ~(class107.field1350 >> 3); ++var10) {
                    int var11 = class439.field5868[var4][var9][var10];
                    if (var11 != -1) {
                        int var12 = (var11 & 64625460) >> 24;
                        if (!arg1.field3316 || ~var12 == -1) {
                            int var13 = 3 & var11 >> 1;
                            int var14 = 1023 & var11 >> 14;
                            int var15 = 2047 & var11 >> 3;
                            int var16 = (var14 / 8 << 8) - -(var15 / 8);
                            for (int var17 = 0; class471.field6569.length > var17; ++var17) {
                                if (class471.field6569[var17] == var16 && arg2[var17] != null) {
                                    class403 var18 = new class403(arg2[var17]);
                                    arg1.method1646(var12, var14, var15, var10 * 8, var9 * 8, var13, var4, class633.field8649, (byte) -123, var18);
                                    arg1.method920(class363.field4526, var12, var9 * 8, var15, var4, (byte) 50, ~var3[0] == 0 ? var3 : null, var10 * 8, var13, var18, var14);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        for (int var5 = 0; ~var5 > ~arg1.field3317; ++var5) {
            class580.method3339((byte) -58);
            for (int var6 = 0; ~(class596.field8090 >> 3) < ~var6; ++var6) {
                for (int var7 = 0; var7 < class107.field1350 >> 3; ++var7) {
                    int var8 = class439.field5868[var5][var6][var7];
                    if (~var8 == 0) {
                        arg1.method1652(var6 * 8, var5, 8, 8, var7 * 8, (byte) 117);
                    }
                }
            }
        }
        if (~var3[0] != 0) {
            class454.field6403 = class153.field1907.method1237(var3[3], 5, var3[2], var3[1], var3[0], class305.field3675);
            class691.field9401 = var3[4];
        }
        if (arg0 != 2) {
            field4821 = -1;
        }
    }

    @OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(Lpc;I[BIZ)V", line = 194)
    public class380(class700 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34963, arg2, arg3, arg4);
        this.field4818 = arg1;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(B)I", line = 202)
    public final int method1317(byte arg0) {
        ++field4817;
        int var2 = 61 % ((arg0 - 26) / 55);
        return this.field4818;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(BIIIIILwj;IIIII)Z", line = 215)
    public static final boolean method2224(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class415 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        ++field4823;
        int var12 = arg4;
        int var13 = arg10;
        byte var14 = 64;
        byte var15 = 64;
        int var16 = -var14 + arg4;
        int var17 = -var15 + arg10;
        class578.field7880[var14][var15] = 99;
        class68.field931[var14][var15] = 0;
        byte var18 = 0;
        int var19 = 0;
        class186.field2252[var18] = arg4;
        int var35 = var18 + 1;
        class496.field6942[var18] = arg10;
        if (arg0 != 7) {
            method2224((byte) 64, 7, 32, 1, -1, -107, (class415) null, -68, 83, -39, -91, 50);
        }
        int[][] var20 = arg6.field5428;
        while (true) {
            label286: while (true) {
                int var21;
                int var22;
                int var23;
                int var24;
                int var26;
                do {
                    do {
                        do {
                            label263: do {
                                if (~var35 == ~var19) {
                                    class324.field4020 = var12;
                                    class394.field5108 = var13;
                                    return false;
                                }
                                var13 = class496.field6942[var19];
                                var12 = class186.field2252[var19];
                                var21 = -var17 + var13;
                                var22 = var12 - var16;
                                var19 = 4095 & var19 - -1;
                                var23 = -arg6.field5435 + var12;
                                var24 = -arg6.field5415 + var13;
                                if (arg7 != -4) {
                                    if (arg7 != -3) {
                                        if (~arg7 != 1) {
                                            if (~arg7 != 0) {
                                                if (~arg7 != -1 && arg7 != 1 && arg7 != 2 && arg7 != 3 && arg7 != 9) {
                                                    if (arg6.method2474(-128, arg11, var13, arg8, arg7, arg9, var12, arg3)) {
                                                        class324.field4020 = var12;
                                                        class394.field5108 = var13;
                                                        return true;
                                                    }
                                                } else if (arg6.method2479(-1, arg8, arg7, var13, arg11, var12, arg9, arg3)) {
                                                    class394.field5108 = var13;
                                                    class324.field4020 = var12;
                                                    return true;
                                                }
                                            } else if (arg6.method2478(arg2, arg3, (byte) 37, arg8, arg11, var12, arg1, var13, arg5)) {
                                                class324.field4020 = var12;
                                                class394.field5108 = var13;
                                                return true;
                                            }
                                        } else if (arg6.method2482(95, arg2, arg1, arg3, arg3, var13, arg8, var12, arg5, arg11)) {
                                            class394.field5108 = var13;
                                            class324.field4020 = var12;
                                            return true;
                                        }
                                    } else if (class631.method3566(var13, arg3, arg2, arg11, arg3, arg1, arg8, (byte) -79, var12)) {
                                        class324.field4020 = var12;
                                        class394.field5108 = var13;
                                        return true;
                                    }
                                } else if (arg11 == var12 && arg8 == var13) {
                                    class394.field5108 = var13;
                                    class324.field4020 = var12;
                                    return true;
                                }
                                var26 = class68.field931[var22][var21] - -1;
                                if (var22 > 0 && ~class578.field7880[var22 + -1][var21] == -1 && (var20[var23 + -1][var24] & 1134821376) == 0 && (1310982144 & var20[var23 - 1][var24 - (-arg3 - -1)]) == 0) {
                                    int var27 = 1;
                                    while (true) {
                                        if (~var27 <= ~(arg3 + -1)) {
                                            class186.field2252[var35] = var12 + -1;
                                            class496.field6942[var35] = var13;
                                            var35 = 4095 & var35 + 1;
                                            class578.field7880[var22 - 1][var21] = 2;
                                            class68.field931[var22 + -1][var21] = var26;
                                            break;
                                        }
                                        if (~(var20[var23 + -1][var24 + var27] & 1336147968) != -1) {
                                            break;
                                        }
                                        ++var27;
                                    }
                                }
                                if (var22 < -arg3 + 128 && class578.field7880[var22 + 1][var21] == 0 && ~(1625554944 & var20[var23 - -arg3][var24]) == -1 && ~(2015625216 & var20[arg3 + var23][arg3 + -1 + var24]) == -1) {
                                    int var28 = 1;
                                    while (true) {
                                        if (~(arg3 + -1) >= ~var28) {
                                            class186.field2252[var35] = var12 - -1;
                                            class496.field6942[var35] = var13;
                                            class578.field7880[var22 + 1][var21] = 8;
                                            var35 = var35 - -1 & 4095;
                                            class68.field931[var22 + 1][var21] = var26;
                                            break;
                                        }
                                        if (~(var20[var23 - -arg3][var24 + var28] & 2028208128) != -1) {
                                            break;
                                        }
                                        ++var28;
                                    }
                                }
                                if (var21 > 0 && ~class578.field7880[var22][var21 - 1] == -1 && ~(var20[var23][var24 - 1] & 1134821376) == -1 && (var20[arg3 + var23 + -1][var24 - 1] & 1625554944) == 0) {
                                    int var29 = 1;
                                    while (true) {
                                        if (~(arg3 + -1) >= ~var29) {
                                            class186.field2252[var35] = var12;
                                            class496.field6942[var35] = var13 + -1;
                                            class578.field7880[var22][var21 + -1] = 1;
                                            var35 = var35 - -1 & 4095;
                                            class68.field931[var22][var21 + -1] = var26;
                                            break;
                                        }
                                        if ((1675886592 & var20[var23 + var29][var24 + -1]) != 0) {
                                            break;
                                        }
                                        ++var29;
                                    }
                                }
                                if (var21 < -arg3 + 128 && ~class578.field7880[var22][var21 - -1] == -1 && (var20[var23][arg3 + var24] & 1310982144) == 0 && ~(var20[var23 + -1 + arg3][arg3 + var24] & 2015625216) == -1) {
                                    int var30 = 1;
                                    while (true) {
                                        if (arg3 + -1 <= var30) {
                                            class186.field2252[var35] = var12;
                                            class496.field6942[var35] = var13 + 1;
                                            var35 = 4095 & var35 + 1;
                                            class578.field7880[var22][var21 + 1] = 4;
                                            class68.field931[var22][var21 + 1] = var26;
                                            break;
                                        }
                                        if (~(2116288512 & var20[var23 + var30][arg3 + var24]) != -1) {
                                            break;
                                        }
                                        ++var30;
                                    }
                                }
                                if (var22 > 0 && var21 > 0 && class578.field7880[var22 + -1][var21 + -1] == 0 && (var20[var23 + -1][var24 - 1] & 1134821376) == 0) {
                                    int var31 = 1;
                                    while (true) {
                                        if (~var31 <= ~arg3) {
                                            class186.field2252[var35] = var12 + -1;
                                            class496.field6942[var35] = var13 + -1;
                                            class578.field7880[var22 - 1][var21 - 1] = 3;
                                            var35 = var35 + 1 & 4095;
                                            class68.field931[var22 + -1][var21 + -1] = var26;
                                            break;
                                        }
                                        if (~(1336147968 & var20[var23 + -1][var24 - 1 - -var31]) != -1 || (var20[var23 + -1 - -var31][var24 + -1] & 1675886592) != 0) {
                                            break;
                                        }
                                        ++var31;
                                    }
                                }
                                if (~(-arg3 + 128) < ~var22 && ~var21 < -1 && class578.field7880[var22 - -1][var21 + -1] == 0 && ~(1625554944 & var20[arg3 + var23][var24 + -1]) == -1) {
                                    int var32 = 1;
                                    while (true) {
                                        if (var32 >= arg3) {
                                            class186.field2252[var35] = var12 + 1;
                                            class496.field6942[var35] = var13 + -1;
                                            class578.field7880[var22 + 1][var21 + -1] = 9;
                                            var35 = var35 + 1 & 4095;
                                            class68.field931[var22 + 1][var21 + -1] = var26;
                                            break;
                                        }
                                        if (~(var20[arg3 + var23][var32 + -1 + var24] & 2028208128) != -1 || ~(1675886592 & var20[var23 + var32][var24 + -1]) != -1) {
                                            break;
                                        }
                                        ++var32;
                                    }
                                }
                                if (var22 > 0 && ~var21 > ~(128 - arg3) && ~class578.field7880[var22 + -1][var21 + 1] == -1 && (1310982144 & var20[var23 + -1][arg3 + var24]) == 0) {
                                    for (int var33 = 1; ~arg3 < ~var33; ++var33) {
                                        if (~(var20[var23 - 1][var24 - -var33] & 1336147968) != -1 || ~(var20[var23 + -1 + var33][arg3 + var24] & 2116288512) != -1) {
                                            continue label263;
                                        }
                                    }
                                    class186.field2252[var35] = var12 + -1;
                                    class496.field6942[var35] = var13 + 1;
                                    var35 = 4095 & var35 + 1;
                                    class578.field7880[var22 + -1][var21 + 1] = 6;
                                    class68.field931[var22 + -1][var21 - -1] = var26;
                                }
                            } while (~(-arg3 + 128) >= ~var22);
                        } while (var21 >= 128 - arg3);
                    } while (class578.field7880[var22 + 1][var21 + 1] != 0);
                } while ((2015625216 & var20[var23 - -arg3][arg3 + var24]) != 0);
                for (int var34 = 1; ~arg3 < ~var34; ++var34) {
                    if (~(2116288512 & var20[var23 - -var34][arg3 + var24]) != -1 || ~(2028208128 & var20[var23 - -arg3][var24 - -var34]) != -1) {
                        continue label286;
                    }
                }
                class186.field2252[var35] = var12 + 1;
                class496.field6942[var35] = var13 + 1;
                var35 = 4095 & var35 - -1;
                class578.field7880[var22 + 1][var21 + 1] = 12;
                class68.field931[var22 + 1][var21 + 1] = var26;
            }
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIIILpc;)Lqt;", line = 645)
    public static final class664 method2225(int arg0, int arg1, int arg2, int arg3, class700 arg4) {
        ++field4814;
        if (arg0 > -15) {
            return null;
        } else if (!arg4.field9846 && (!class152.method1091(arg3, -30) || !class152.method1091(arg1, -113))) {
            return !arg4.field9842 ? new class664(arg4, arg2, arg3, arg1, class783.method4337(arg3, (byte) 65), class783.method4337(arg1, (byte) 110)) : new class664(arg4, 34037, arg2, arg3, arg1);
        } else {
            return new class664(arg4, 3553, arg2, arg3, arg1);
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)J", line = 666)
    public final long method1323(int arg0) {
        if (arg0 != -7206) {
            field4821 = 47;
        }
        ++field4815;
        return 0L;
    }
}
