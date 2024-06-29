import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class91 extends class80 {

    @OriginalMember(owner = "client!wf", name = "Q", descriptor = "I")
    private int field1820 = 4096;

    @OriginalMember(owner = "client!wf", name = "P", descriptor = "I")
    private int field1819 = 0;

    @OriginalMember(owner = "client!wf", name = "K", descriptor = "I")
    public static int field1814;

    @OriginalMember(owner = "client!wf", name = "L", descriptor = "I")
    public static int field1815;

    @OriginalMember(owner = "client!wf", name = "M", descriptor = "I")
    public static int field1816;

    @OriginalMember(owner = "client!wf", name = "N", descriptor = "I")
    public static int field1817;

    @OriginalMember(owner = "client!wf", name = "O", descriptor = "I")
    public static int field1818;

    @OriginalMember(owner = "client!wf", name = "R", descriptor = "I")
    public static int field1821;

    @OriginalMember(owner = "client!wf", name = "J", descriptor = "[Lts;")
    public static class376[] field1813;

    @OriginalMember(owner = "client!wf", name = "<init>", descriptor = "()V")
    public class91() {
        super(1, false);
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIIBIIIILsd;III)Z")
    public static final boolean method824(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, class63 arg8, int arg9, int arg10, int arg11) {
        ++field1814;
        int var12 = arg4;
        int var13 = arg7;
        byte var14 = 64;
        byte var15 = 64;
        int var16 = -var14 + arg4;
        int var17 = -var15 + arg7;
        if (arg3 != 85) {
            return true;
        } else {
            class416.field6275[var14][var15] = 99;
            class290.field4437[var14][var15] = 0;
            byte var18 = 0;
            class246.field3801[var18] = arg4;
            int var19 = 0;
            int var35 = var18 + 1;
            class441.field6555[var18] = arg7;
            int[][] var20 = arg8.field1283;
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
                                        class81.field1634 = var13;
                                        class129.field2204 = var12;
                                        return false;
                                    }
                                    var13 = class441.field6555[var19];
                                    var12 = class246.field3801[var19];
                                    var19 = var19 + 1 & 4095;
                                    var21 = -var16 + var12;
                                    var22 = -var17 + var13;
                                    var23 = -arg8.field1301 + var12;
                                    var24 = -arg8.field1286 + var13;
                                    if (arg2 != -4) {
                                        if (arg2 != -3) {
                                            if (arg2 != -2) {
                                                if (~arg2 != 0) {
                                                    if (arg2 != 0 && arg2 != 1 && arg2 != 2 && arg2 != 3 && ~arg2 != -10) {
                                                        if (arg8.method550(arg11, var13, arg2, arg6, arg1, var12, arg5, (byte) 109)) {
                                                            class81.field1634 = var13;
                                                            class129.field2204 = var12;
                                                            return true;
                                                        }
                                                    } else if (arg8.method557(arg6, var13, arg2, arg5, arg1, (byte) 85, var12, arg11)) {
                                                        class129.field2204 = var12;
                                                        class81.field1634 = var13;
                                                        return true;
                                                    }
                                                } else if (arg8.method565(arg10, var12, arg9, false, var13, arg11, arg0, arg6, arg1)) {
                                                    class81.field1634 = var13;
                                                    class129.field2204 = var12;
                                                    return true;
                                                }
                                            } else if (arg8.method561(arg1, arg11, arg6, arg10, arg9, arg0, var13, var12, 8388608, arg11)) {
                                                class81.field1634 = var13;
                                                class129.field2204 = var12;
                                                return true;
                                            }
                                        } else if (class202.method1391(25356, arg1, arg9, var13, var12, arg11, arg11, arg0, arg6)) {
                                            class81.field1634 = var13;
                                            class129.field2204 = var12;
                                            return true;
                                        }
                                    } else if (arg1 == var12 && ~arg6 == ~var13) {
                                        class81.field1634 = var13;
                                        class129.field2204 = var12;
                                        return true;
                                    }
                                    var26 = class290.field4437[var21][var22] + 1;
                                    if (~var21 < -1 && class416.field6275[var21 - 1][var22] == 0 && (1134821376 & var20[var23 - 1][var24]) == 0 && ~(var20[var23 + -1][var24 - 1 + arg11] & 1310982144) == -1) {
                                        int var27 = 1;
                                        while (true) {
                                            if (~(arg11 + -1) >= ~var27) {
                                                class246.field3801[var35] = var12 - 1;
                                                class441.field6555[var35] = var13;
                                                var35 = var35 + 1 & 4095;
                                                class416.field6275[var21 + -1][var22] = 2;
                                                class290.field4437[var21 + -1][var22] = var26;
                                                break;
                                            }
                                            if (~(1336147968 & var20[var23 + -1][var24 + var27]) != -1) {
                                                break;
                                            }
                                            ++var27;
                                        }
                                    }
                                    if (var21 < -arg11 + 128 && class416.field6275[var21 - -1][var22] == 0 && ~(var20[arg11 + var23][var24] & 1625554944) == -1 && ~(var20[var23 - -arg11][var24 - -arg11 + -1] & 2015625216) == -1) {
                                        int var28 = 1;
                                        while (true) {
                                            if (var28 >= arg11 + -1) {
                                                class246.field3801[var35] = var12 + 1;
                                                class441.field6555[var35] = var13;
                                                var35 = 4095 & var35 + 1;
                                                class416.field6275[var21 + 1][var22] = 8;
                                                class290.field4437[var21 + 1][var22] = var26;
                                                break;
                                            }
                                            if ((var20[var23 - -arg11][var24 + var28] & 2028208128) != 0) {
                                                break;
                                            }
                                            ++var28;
                                        }
                                    }
                                    if (~var22 < -1 && class416.field6275[var21][var22 + -1] == 0 && ~(var20[var23][var24 + -1] & 1134821376) == -1 && (var20[var23 - (-arg11 + 1)][var24 + -1] & 1625554944) == 0) {
                                        int var29 = 1;
                                        while (true) {
                                            if (arg11 + -1 <= var29) {
                                                class246.field3801[var35] = var12;
                                                class441.field6555[var35] = var13 + -1;
                                                class416.field6275[var21][var22 + -1] = 1;
                                                var35 = var35 + 1 & 4095;
                                                class290.field4437[var21][var22 - 1] = var26;
                                                break;
                                            }
                                            if (~(var20[var23 + var29][var24 + -1] & 1675886592) != -1) {
                                                break;
                                            }
                                            ++var29;
                                        }
                                    }
                                    if (~var22 > ~(-arg11 + 128) && class416.field6275[var21][var22 - -1] == 0 && (var20[var23][var24 - -arg11] & 1310982144) == 0 && ~(var20[var23 - (-arg11 - -1)][arg11 + var24] & 2015625216) == -1) {
                                        int var30 = 1;
                                        while (true) {
                                            if (~(arg11 + -1) >= ~var30) {
                                                class246.field3801[var35] = var12;
                                                class441.field6555[var35] = var13 + 1;
                                                class416.field6275[var21][var22 - -1] = 4;
                                                var35 = var35 + 1 & 4095;
                                                class290.field4437[var21][var22 + 1] = var26;
                                                break;
                                            }
                                            if ((2116288512 & var20[var23 + var30][var24 - -arg11]) != 0) {
                                                break;
                                            }
                                            ++var30;
                                        }
                                    }
                                    if (var21 > 0 && ~var22 < -1 && class416.field6275[var21 - 1][var22 - 1] == 0 && (var20[var23 + -1][var24 + -1] & 1134821376) == 0) {
                                        int var31 = 1;
                                        while (true) {
                                            if (~arg11 >= ~var31) {
                                                class246.field3801[var35] = var12 + -1;
                                                class441.field6555[var35] = var13 + -1;
                                                class416.field6275[var21 + -1][var22 + -1] = 3;
                                                var35 = var35 + 1 & 4095;
                                                class290.field4437[var21 + -1][var22 + -1] = var26;
                                                break;
                                            }
                                            if ((1336147968 & var20[var23 + -1][var24 - (1 - var31)]) != 0 || (var20[var23 + var31 + -1][var24 + -1] & 1675886592) != 0) {
                                                break;
                                            }
                                            ++var31;
                                        }
                                    }
                                    if (~(-arg11 + 128) < ~var21 && var22 > 0 && class416.field6275[var21 + 1][var22 + -1] == 0 && ~(1625554944 & var20[arg11 + var23][var24 - 1]) == -1) {
                                        int var32 = 1;
                                        while (true) {
                                            if (~arg11 >= ~var32) {
                                                class246.field3801[var35] = var12 + 1;
                                                class441.field6555[var35] = var13 - 1;
                                                class416.field6275[var21 + 1][var22 + -1] = 9;
                                                var35 = var35 + 1 & 4095;
                                                class290.field4437[var21 + 1][var22 + -1] = var26;
                                                break;
                                            }
                                            if ((var20[arg11 + var23][var32 + -1 + var24] & 2028208128) != 0 || (1675886592 & var20[var23 + var32][var24 + -1]) != 0) {
                                                break;
                                            }
                                            ++var32;
                                        }
                                    }
                                    if (~var21 < -1 && 128 - arg11 > var22 && ~class416.field6275[var21 + -1][var22 + 1] == -1 && ~(1310982144 & var20[var23 + -1][arg11 + var24]) == -1) {
                                        for (int var33 = 1; arg11 > var33; ++var33) {
                                            if ((var20[var23 + -1][var24 - -var33] & 1336147968) != 0 || ~(var20[-1 - -var33 + var23][var24 - -arg11] & 2116288512) != -1) {
                                                continue label263;
                                            }
                                        }
                                        class246.field3801[var35] = var12 + -1;
                                        class441.field6555[var35] = var13 + 1;
                                        class416.field6275[var21 - 1][var22 + 1] = 6;
                                        var35 = var35 + 1 & 4095;
                                        class290.field4437[var21 + -1][var22 + 1] = var26;
                                    }
                                } while (~var21 <= ~(-arg11 + 128));
                            } while (var22 >= -arg11 + 128);
                        } while (class416.field6275[var21 + 1][var22 + 1] != 0);
                    } while ((var20[var23 - -arg11][arg11 + var24] & 2015625216) != 0);
                    for (int var34 = 1; var34 < arg11; ++var34) {
                        if (~(2116288512 & var20[var23 + var34][arg11 + var24]) != -1 || (var20[arg11 + var23][var24 + var34] & 2028208128) != 0) {
                            continue label286;
                        }
                    }
                    class246.field3801[var35] = var12 + 1;
                    class441.field6555[var35] = var13 + 1;
                    class416.field6275[var21 - -1][var22 + 1] = 12;
                    var35 = var35 + 1 & 4095;
                    class290.field4437[var21 + 1][var22 - -1] = var26;
                }
            }
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IILnn;)V")
    public final void method26(int arg0, int arg1, class289 arg2) {
        ++field1821;
        int var4 = 102 % ((28 - arg1) / 53);
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (~arg0 == -3) {
                    super.field1591 = ~arg2.method1858(-3256) == -2;
                }
            } else {
                this.field1820 = arg2.method1841((byte) -119);
            }
        } else {
            this.field1819 = arg2.method1841((byte) 21);
        }
    }

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "(II)[[I")
    public final int[][] method29(int arg0, int arg1) {
        ++field1816;
        if (arg0 != 255) {
            field1813 = null;
        }
        int[][] var3 = super.field1589.method859(arg1, 126);
        if (super.field1589.field1884) {
            int[][] var4 = this.method713(0, -94, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class137.field2308; ++var11) {
                int var12 = var5[var11];
                int var13 = var6[var11];
                int var14 = var7[var11];
                if (var12 < this.field1819) {
                    var8[var11] = this.field1819;
                } else if (~var12 >= ~this.field1820) {
                    var8[var11] = var12;
                } else {
                    var8[var11] = this.field1820;
                }
                if (~this.field1819 < ~var13) {
                    var9[var11] = this.field1819;
                } else if (~var13 >= ~this.field1820) {
                    var9[var11] = var13;
                } else {
                    var9[var11] = this.field1820;
                }
                if (~var14 > ~this.field1819) {
                    var10[var11] = this.field1819;
                } else if (~this.field1820 > ~var14) {
                    var10[var11] = this.field1820;
                } else {
                    var10[var11] = var14;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(II)[I")
    public final int[] method25(int arg0, int arg1) {
        ++field1817;
        int[] var3 = super.field1601.method48(arg0, (byte) 0);
        if (arg1 != -16828) {
            method824(53, 98, -16, (byte) -61, 75, 82, 49, -7, (class63) null, -40, -64, -4);
        }
        if (super.field1601.field124) {
            int[] var4 = this.method710(arg0, 0, (byte) 105);
            for (int var5 = 0; ~class137.field2308 < ~var5; ++var5) {
                int var6 = var4[var5];
                if (~this.field1819 < ~var6) {
                    var3[var5] = this.field1819;
                } else if (~var6 >= ~this.field1820) {
                    var3[var5] = var6;
                } else {
                    var3[var5] = this.field1820;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "(I)V")
    public static void method825(int arg0) {
        if (arg0 >= -74) {
            method824(-110, -68, 31, (byte) 3, -106, 40, 55, 12, (class63) null, 54, 81, 1);
        }
        field1813 = null;
    }
}
