import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nr")
public class class110 extends class305 {

    @OriginalMember(owner = "client!nr", name = "G", descriptor = "I")
    public static int field1648 = 0;

    @OriginalMember(owner = "client!nr", name = "P", descriptor = "I")
    public static int field1657 = 0;

    @OriginalMember(owner = "client!nr", name = "D", descriptor = "I")
    private int field1645;

    @OriginalMember(owner = "client!nr", name = "E", descriptor = "I")
    public static int field1646;

    @OriginalMember(owner = "client!nr", name = "F", descriptor = "I")
    private int field1647;

    @OriginalMember(owner = "client!nr", name = "H", descriptor = "I")
    public static int field1649;

    @OriginalMember(owner = "client!nr", name = "I", descriptor = "I")
    public static int field1650;

    @OriginalMember(owner = "client!nr", name = "J", descriptor = "I")
    public static int field1651;

    @OriginalMember(owner = "client!nr", name = "K", descriptor = "I")
    private int field1652;

    @OriginalMember(owner = "client!nr", name = "L", descriptor = "I")
    public static int field1653;

    @OriginalMember(owner = "client!nr", name = "M", descriptor = "I")
    public static int field1654;

    @OriginalMember(owner = "client!nr", name = "N", descriptor = "I")
    public static int field1655;

    @OriginalMember(owner = "client!nr", name = "O", descriptor = "I")
    public static int field1656;

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(BILuh;IIIIIIIII)Z")
    public static final boolean method855(byte arg0, int arg1, class407 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        ++field1646;
        int var12 = arg4;
        int var13 = arg10;
        if (arg0 <= 111) {
            method856(true);
        }
        byte var14 = 64;
        byte var15 = 64;
        int var16 = -var14 + arg4;
        int var17 = -var15 + arg10;
        class454.field6755[var14][var15] = 99;
        class125.field1878[var14][var15] = 0;
        byte var18 = 0;
        int var19 = 0;
        class63.field996[var18] = arg4;
        int var35 = var18 + 1;
        class200.field3104[var18] = arg10;
        int[][] var20 = arg2.field6004;
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
                                if (var35 == var19) {
                                    class57.field880 = var12;
                                    class128.field1916 = var13;
                                    return false;
                                }
                                var13 = class200.field3104[var19];
                                var12 = class63.field996[var19];
                                var21 = var13 - var17;
                                var22 = var12 - var16;
                                var19 = var19 - -1 & 4095;
                                var23 = -arg2.field6019 + var12;
                                var24 = -arg2.field6015 + var13;
                                if (~arg6 != 3) {
                                    if (arg6 != -3) {
                                        if (~arg6 != 1) {
                                            if (~arg6 != 0) {
                                                if (arg6 != 0 && arg6 != 1 && ~arg6 != -3 && ~arg6 != -4 && ~arg6 != -10) {
                                                    if (arg2.method2562(arg6, var13, arg1, -2, arg11, arg7, arg9, var12)) {
                                                        class57.field880 = var12;
                                                        class128.field1916 = var13;
                                                        return true;
                                                    }
                                                } else if (arg2.method2572(var12, arg6, var13, arg11, arg9, arg1, arg7, (byte) 58)) {
                                                    class128.field1916 = var13;
                                                    class57.field880 = var12;
                                                    return true;
                                                }
                                            } else if (arg2.method2573(arg5, var13, arg9, 8, arg8, arg3, arg1, arg7, var12)) {
                                                class128.field1916 = var13;
                                                class57.field880 = var12;
                                                return true;
                                            }
                                        } else if (arg2.method2570(var13, arg9, arg8, arg7, arg9, var12, -6197, arg1, arg5, arg3)) {
                                            class128.field1916 = var13;
                                            class57.field880 = var12;
                                            return true;
                                        }
                                    } else if (class342.method2204(var12, (byte) 86, arg9, arg7, arg1, var13, arg3, arg8, arg9)) {
                                        class57.field880 = var12;
                                        class128.field1916 = var13;
                                        return true;
                                    }
                                } else if (~arg7 == ~var12 && arg1 == var13) {
                                    class128.field1916 = var13;
                                    class57.field880 = var12;
                                    return true;
                                }
                                var26 = class125.field1878[var22][var21] + 1;
                                if (~var22 < -1 && ~class454.field6755[var22 + -1][var21] == -1 && ~(1134821376 & var20[var23 + -1][var24]) == -1 && ~(1310982144 & var20[var23 - 1][var24 - -arg9 + -1]) == -1) {
                                    int var27 = 1;
                                    while (true) {
                                        if (var27 >= arg9 + -1) {
                                            class63.field996[var35] = var12 + -1;
                                            class200.field3104[var35] = var13;
                                            class454.field6755[var22 + -1][var21] = 2;
                                            var35 = var35 + 1 & 4095;
                                            class125.field1878[var22 + -1][var21] = var26;
                                            break;
                                        }
                                        if (~(var20[var23 + -1][var24 + var27] & 1336147968) != -1) {
                                            break;
                                        }
                                        ++var27;
                                    }
                                }
                                if (-arg9 + 128 > var22 && class454.field6755[var22 + 1][var21] == 0 && ~(1625554944 & var20[arg9 + var23][var24]) == -1 && (2015625216 & var20[arg9 + var23][arg9 + var24 + -1]) == 0) {
                                    int var28 = 1;
                                    while (true) {
                                        if (~(arg9 + -1) >= ~var28) {
                                            class63.field996[var35] = var12 + 1;
                                            class200.field3104[var35] = var13;
                                            class454.field6755[var22 - -1][var21] = 8;
                                            var35 = 4095 & var35 - -1;
                                            class125.field1878[var22 + 1][var21] = var26;
                                            break;
                                        }
                                        if (~(2028208128 & var20[arg9 + var23][var24 + var28]) != -1) {
                                            break;
                                        }
                                        ++var28;
                                    }
                                }
                                if (~var21 < -1 && ~class454.field6755[var22][var21 - 1] == -1 && ~(1134821376 & var20[var23][var24 + -1]) == -1 && ~(1625554944 & var20[var23 + -1 + arg9][var24 + -1]) == -1) {
                                    int var29 = 1;
                                    while (true) {
                                        if (arg9 + -1 <= var29) {
                                            class63.field996[var35] = var12;
                                            class200.field3104[var35] = var13 + -1;
                                            var35 = var35 - -1 & 4095;
                                            class454.field6755[var22][var21 - 1] = 1;
                                            class125.field1878[var22][var21 + -1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var29][var24 + -1] & 1675886592) != 0) {
                                            break;
                                        }
                                        ++var29;
                                    }
                                }
                                if (~var21 > ~(-arg9 + 128) && ~class454.field6755[var22][var21 + 1] == -1 && ~(var20[var23][arg9 + var24] & 1310982144) == -1 && ~(var20[var23 + -1 - -arg9][arg9 + var24] & 2015625216) == -1) {
                                    int var30 = 1;
                                    while (true) {
                                        if (var30 >= arg9 + -1) {
                                            class63.field996[var35] = var12;
                                            class200.field3104[var35] = var13 - -1;
                                            class454.field6755[var22][var21 - -1] = 4;
                                            var35 = var35 + 1 & 4095;
                                            class125.field1878[var22][var21 - -1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - -var30][arg9 + var24] & 2116288512) != 0) {
                                            break;
                                        }
                                        ++var30;
                                    }
                                }
                                if (~var22 < -1 && var21 > 0 && ~class454.field6755[var22 + -1][var21 + -1] == -1 && (1134821376 & var20[var23 - 1][var24 + -1]) == 0) {
                                    int var31 = 1;
                                    while (true) {
                                        if (var31 >= arg9) {
                                            class63.field996[var35] = var12 - 1;
                                            class200.field3104[var35] = var13 + -1;
                                            var35 = var35 - -1 & 4095;
                                            class454.field6755[var22 + -1][var21 + -1] = 3;
                                            class125.field1878[var22 + -1][var21 - 1] = var26;
                                            break;
                                        }
                                        if ((1336147968 & var20[var23 - 1][-1 - -var31 + var24]) != 0 || ~(var20[var23 + -1 - -var31][var24 + -1] & 1675886592) != -1) {
                                            break;
                                        }
                                        ++var31;
                                    }
                                }
                                if (-arg9 + 128 > var22 && var21 > 0 && ~class454.field6755[var22 + 1][var21 - 1] == -1 && (1625554944 & var20[var23 - -arg9][var24 + -1]) == 0) {
                                    int var32 = 1;
                                    while (true) {
                                        if (~arg9 >= ~var32) {
                                            class63.field996[var35] = var12 - -1;
                                            class200.field3104[var35] = var13 + -1;
                                            class454.field6755[var22 + 1][var21 + -1] = 9;
                                            var35 = 4095 & var35 - -1;
                                            class125.field1878[var22 + 1][var21 - 1] = var26;
                                            break;
                                        }
                                        if (~(var20[var23 - -arg9][var24 + -1 + var32] & 2028208128) != -1 || ~(1675886592 & var20[var23 - -var32][var24 + -1]) != -1) {
                                            break;
                                        }
                                        ++var32;
                                    }
                                }
                                if (var22 > 0 && ~(-arg9 + 128) < ~var21 && class454.field6755[var22 + -1][var21 + 1] == 0 && ~(var20[var23 + -1][arg9 + var24] & 1310982144) == -1) {
                                    for (int var33 = 1; ~var33 > ~arg9; ++var33) {
                                        if (~(var20[var23 - 1][var24 + var33] & 1336147968) != -1 || ~(var20[var33 + -1 + var23][var24 - -arg9] & 2116288512) != -1) {
                                            continue label263;
                                        }
                                    }
                                    class63.field996[var35] = var12 + -1;
                                    class200.field3104[var35] = var13 - -1;
                                    class454.field6755[var22 + -1][var21 + 1] = 6;
                                    var35 = var35 + 1 & 4095;
                                    class125.field1878[var22 + -1][var21 - -1] = var26;
                                }
                            } while (-arg9 + 128 <= var22);
                        } while (-arg9 + 128 <= var21);
                    } while (~class454.field6755[var22 + 1][var21 - -1] != -1);
                } while (~(var20[var23 - -arg9][arg9 + var24] & 2015625216) != -1);
                for (int var34 = 1; ~var34 > ~arg9; ++var34) {
                    if (~(2116288512 & var20[var23 - -var34][arg9 + var24]) != -1 || ~(var20[arg9 + var23][var24 - -var34] & 2028208128) != -1) {
                        continue label286;
                    }
                }
                class63.field996[var35] = var12 + 1;
                class200.field3104[var35] = var13 + 1;
                class454.field6755[var22 + 1][var21 + 1] = 12;
                var35 = 4095 & var35 - -1;
                class125.field1878[var22 + 1][var21 - -1] = var26;
            }
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(ILfh;B)V")
    public final void method14(int arg0, class194 arg1, byte arg2) {
        ++field1649;
        if (~arg0 == -1) {
            this.method859((byte) -103, arg1.method1339(-32768));
        }
        if (arg2 < 76) {
            this.method859((byte) -33, -82);
        }
    }

    @OriginalMember(owner = "client!nr", name = "<init>", descriptor = "()V")
    public class110() {
        this(0);
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(Z)Llb;")
    public static final class188 method856(boolean arg0) {
        if (!arg0) {
            field1657 = -1;
        }
        ++field1654;
        class188 var1 = (class188) class200.field3103.method2825(-1);
        if (var1 != null) {
            var1.method947((byte) 109);
            var1.method2859(-105);
            return var1;
        } else {
            class188 var2;
            do {
                var2 = (class188) class104.field1607.method2825(-1);
                if (var2 == null) {
                    return null;
                }
                if (~var2.method1304(8) < ~class375.method2397((byte) -75)) {
                    return null;
                }
                var2.method947((byte) 108);
                var2.method2859(-105);
            } while (~(var2.field6926 & Long.MIN_VALUE) == -1L);
            return var2;
        }
    }

    @OriginalMember(owner = "client!nr", name = "<init>", descriptor = "(I)V")
    private class110(int arg0) {
        super(0, false);
        this.method859((byte) -33, arg0);
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(ILpn;)V")
    public static final void method857(int arg0, class49 arg1) {
        class312.field4752.method2675(arg1.method326((byte) 108), -4);
        ++field1651;
        if (arg0 != 4095) {
            method858(-99, (byte) 75, -54);
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(IBI)Z")
    public static final boolean method858(int arg0, byte arg1, int arg2) {
        ++field1656;
        if (!class256.field4112) {
            return false;
        } else {
            int var3 = arg0 >> 16;
            int var4 = 65535 & arg0;
            if (class237.field3555[var3] != null && class237.field3555[var3][var4] != null) {
                class38 var5 = class237.field3555[var3][var4];
                if (arg1 > -9) {
                    method858(-54, (byte) -82, -45);
                }
                if (arg2 == -1 && ~var5.field503 == -1) {
                    for (class376 var6 = (class376) class154.field2370.method295((byte) 109); var6 != null; var6 = (class376) class154.field2370.method296(true)) {
                        if (~var6.field5546 == -26 || var6.field5546 == 1008 || var6.field5546 == 2 || var6.field5546 == 23 || ~var6.field5546 == -48) {
                            for (class38 var7 = class159.method1143(-357225936, var6.field5551); var7 != null; var7 = class184.method1284(var7, (byte) -51)) {
                                if (~var5.field580 == ~var7.field580) {
                                    return true;
                                }
                            }
                        }
                    }
                } else {
                    for (class376 var8 = (class376) class154.field2370.method295((byte) -124); var8 != null; var8 = (class376) class154.field2370.method296(true)) {
                        if (~var8.field5550 == ~arg2 && ~var5.field580 == ~var8.field5551 && (~var8.field5546 == -26 || var8.field5546 == 1008 || var8.field5546 == 2 || var8.field5546 == 23 || ~var8.field5546 == -48)) {
                            return true;
                        }
                    }
                }
                return false;
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "(BI)V")
    private final void method859(byte arg0, int arg1) {
        this.field1647 = (16711680 & arg1) >> 12;
        ++field1655;
        this.field1645 = 4080 & arg1 >> 4;
        if (arg0 >= -16) {
            this.field1647 = 56;
        }
        this.field1652 = arg1 << 4 & 4080;
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(IB)[[I")
    public final int[][] method72(int arg0, byte arg1) {
        ++field1650;
        if (arg1 > -59) {
            this.field1652 = -21;
        }
        int[][] var3 = super.field4674.method2206(-28, arg0);
        if (super.field4674.field5110) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; class91.field1471 > var7; ++var7) {
                var4[var7] = this.field1647;
                var5[var7] = this.field1645;
                var6[var7] = this.field1652;
            }
        }
        return var3;
    }
}
