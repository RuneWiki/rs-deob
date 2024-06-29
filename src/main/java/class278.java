import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class278 extends class127 {

    @OriginalMember(owner = "client!ga", name = "A", descriptor = "I")
    public int field4078 = -1;

    @OriginalMember(owner = "client!ga", name = "E", descriptor = "I")
    public int field4082 = -1;

    @OriginalMember(owner = "client!ga", name = "C", descriptor = "[Ljava/lang/String;")
    public static String[] field4080 = new String[100];

    @OriginalMember(owner = "client!ga", name = "w", descriptor = "Luc;")
    public static class51 field4074 = new class51(8);

    @OriginalMember(owner = "client!ga", name = "G", descriptor = "Ljava/lang/String;")
    public static String field4084 = " more options";

    @OriginalMember(owner = "client!ga", name = "H", descriptor = "I")
    public static int field4085 = 0;

    @OriginalMember(owner = "client!ga", name = "t", descriptor = "I")
    public int field4071;

    @OriginalMember(owner = "client!ga", name = "u", descriptor = "I")
    public static int field4072;

    @OriginalMember(owner = "client!ga", name = "v", descriptor = "I")
    public static int field4073;

    @OriginalMember(owner = "client!ga", name = "x", descriptor = "I")
    public static int field4075;

    @OriginalMember(owner = "client!ga", name = "y", descriptor = "I")
    public int field4076;

    @OriginalMember(owner = "client!ga", name = "z", descriptor = "I")
    public static int field4077;

    @OriginalMember(owner = "client!ga", name = "B", descriptor = "I")
    public int field4079;

    @OriginalMember(owner = "client!ga", name = "D", descriptor = "I")
    public int field4081;

    @OriginalMember(owner = "client!ga", name = "F", descriptor = "I")
    public static int field4083;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(ILtj;II)Z")
    public final boolean method120(int arg0, class298 arg1, int arg2, int arg3) {
        ++field4077;
        class118 var5 = arg1.method519();
        var5.method274(super.field1654, super.field1650, super.field1659);
        class257 var6 = class129.method915(126, this.field4081).method1070(-97, arg1, -1, 0, this.field4071, (class436) null, (class233) null, arg3, 65536);
        if (var6 != null && var6.method1698(arg2, arg0, var5, true)) {
            return true;
        } else {
            if (this.field4078 != -1) {
                class257 var7 = class129.method915(arg3 + 127, this.field4078).method1070(arg3 ^ -96, arg1, -1, 0, this.field4076, (class436) null, (class233) null, 0, 65536);
                if (var7 != null && var7.method1698(arg2, arg0, var5, true)) {
                    return true;
                }
            }
            if (this.field4082 != -1) {
                class257 var8 = class129.method915(126, this.field4082).method1070(-126, arg1, -1, 0, this.field4079, (class436) null, (class233) null, 0, 65536);
                if (var8 != null && var8.method1698(arg2, arg0, var5, true)) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IILao;IIIIIIIII)Z")
    public static final boolean method1825(int arg0, int arg1, class280 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        ++field4073;
        int var12 = arg8;
        int var13 = arg0;
        if (arg1 != 128) {
            method1826(-4);
        }
        byte var14 = 64;
        byte var15 = 64;
        int var16 = arg8 - var14;
        int var17 = -var15 + arg0;
        class189.field2643[var14][var15] = 99;
        class87.field1204[var14][var15] = 0;
        byte var18 = 0;
        class87.field1205[var18] = arg8;
        int var19 = 0;
        int var35 = var18 + 1;
        class132.field1726[var18] = arg0;
        int[][] var20 = arg2.field4115;
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
                                    class57.field862 = var12;
                                    class355.field5262 = var13;
                                    return false;
                                }
                                var12 = class87.field1205[var19];
                                var13 = class132.field1726[var19];
                                var21 = var12 - var16;
                                var19 = var19 - -1 & 4095;
                                var22 = var13 - var17;
                                var23 = -arg2.field4110 + var12;
                                var24 = -arg2.field4106 + var13;
                                if (arg9 != -4) {
                                    if (~arg9 != 2) {
                                        if (arg9 != -2) {
                                            if (arg9 != -1) {
                                                if (~arg9 != -1 && arg9 != 1 && ~arg9 != -3 && ~arg9 != -4 && ~arg9 != -10) {
                                                    if (arg2.method1846(arg3, var13, arg11, var12, -91, arg9, arg5, arg4)) {
                                                        class57.field862 = var12;
                                                        class355.field5262 = var13;
                                                        return true;
                                                    }
                                                } else if (arg2.method1852(arg5, var12, var13, arg4, arg11, arg9, arg3, 1)) {
                                                    class355.field5262 = var13;
                                                    class57.field862 = var12;
                                                    return true;
                                                }
                                            } else if (arg2.method1841(arg11, arg6, var13, var12, arg7, arg3, -1, arg10, arg5)) {
                                                class57.field862 = var12;
                                                class355.field5262 = var13;
                                                return true;
                                            }
                                        } else if (arg2.method1853(arg7, var12, 32768, arg10, arg11, var13, arg6, arg3, arg11, arg5)) {
                                            class355.field5262 = var13;
                                            class57.field862 = var12;
                                            return true;
                                        }
                                    } else if (class122.method877(arg1 + -127, arg7, arg11, arg5, var12, arg11, arg3, arg6, var13)) {
                                        class355.field5262 = var13;
                                        class57.field862 = var12;
                                        return true;
                                    }
                                } else if (arg3 == var12 && arg5 == var13) {
                                    class355.field5262 = var13;
                                    class57.field862 = var12;
                                    return true;
                                }
                                var26 = class87.field1204[var21][var22] + 1;
                                if (var21 > 0 && ~class189.field2643[var21 + -1][var22] == -1 && ~(var20[var23 + -1][var24] & 1134821376) == -1 && ~(var20[var23 - 1][var24 + -1 + arg11] & 1310982144) == -1) {
                                    int var27 = 1;
                                    while (true) {
                                        if (~(arg11 + -1) >= ~var27) {
                                            class87.field1205[var35] = var12 + -1;
                                            class132.field1726[var35] = var13;
                                            class189.field2643[var21 + -1][var22] = 2;
                                            var35 = var35 + 1 & 4095;
                                            class87.field1204[var21 + -1][var22] = var26;
                                            break;
                                        }
                                        if ((1336147968 & var20[var23 - 1][var24 + var27]) != 0) {
                                            break;
                                        }
                                        ++var27;
                                    }
                                }
                                if (~(128 - arg11) < ~var21 && ~class189.field2643[var21 + 1][var22] == -1 && ~(1625554944 & var20[var23 - -arg11][var24]) == -1 && ~(2015625216 & var20[var23 - -arg11][arg11 + var24 - 1]) == -1) {
                                    int var28 = 1;
                                    while (true) {
                                        if (~(arg11 + -1) >= ~var28) {
                                            class87.field1205[var35] = var12 + 1;
                                            class132.field1726[var35] = var13;
                                            class189.field2643[var21 + 1][var22] = 8;
                                            var35 = 4095 & var35 + 1;
                                            class87.field1204[var21 + 1][var22] = var26;
                                            break;
                                        }
                                        if (~(2028208128 & var20[var23 - -arg11][var24 + var28]) != -1) {
                                            break;
                                        }
                                        ++var28;
                                    }
                                }
                                if (~var22 < -1 && class189.field2643[var21][var22 + -1] == 0 && ~(1134821376 & var20[var23][var24 + -1]) == -1 && ~(1625554944 & var20[var23 + -1 - -arg11][var24 - 1]) == -1) {
                                    int var29 = 1;
                                    while (true) {
                                        if (~var29 <= ~(arg11 + -1)) {
                                            class87.field1205[var35] = var12;
                                            class132.field1726[var35] = var13 + -1;
                                            class189.field2643[var21][var22 + -1] = 1;
                                            var35 = var35 + 1 & 4095;
                                            class87.field1204[var21][var22 + -1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var29][var24 - 1] & 1675886592) != 0) {
                                            break;
                                        }
                                        ++var29;
                                    }
                                }
                                if (~(128 - arg11) < ~var22 && class189.field2643[var21][var22 + 1] == 0 && (1310982144 & var20[var23][arg11 + var24]) == 0 && (2015625216 & var20[var23 + -1 + arg11][arg11 + var24]) == 0) {
                                    int var30 = 1;
                                    while (true) {
                                        if (~(arg11 + -1) >= ~var30) {
                                            class87.field1205[var35] = var12;
                                            class132.field1726[var35] = var13 + 1;
                                            class189.field2643[var21][var22 + 1] = 4;
                                            var35 = var35 + 1 & 4095;
                                            class87.field1204[var21][var22 + 1] = var26;
                                            break;
                                        }
                                        if (~(2116288512 & var20[var23 - -var30][var24 - -arg11]) != -1) {
                                            break;
                                        }
                                        ++var30;
                                    }
                                }
                                if (~var21 < -1 && var22 > 0 && class189.field2643[var21 + -1][var22 + -1] == 0 && ~(1134821376 & var20[var23 - 1][var24 + -1]) == -1) {
                                    int var31 = 1;
                                    while (true) {
                                        if (arg11 <= var31) {
                                            class87.field1205[var35] = var12 + -1;
                                            class132.field1726[var35] = var13 + -1;
                                            var35 = 4095 & var35 + 1;
                                            class189.field2643[var21 + -1][var22 + -1] = 3;
                                            class87.field1204[var21 + -1][var22 + -1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var24 - 1 + var31] & 1336147968) != 0 || ~(var20[var23 - 1 + var31][var24 + -1] & 1675886592) != -1) {
                                            break;
                                        }
                                        ++var31;
                                    }
                                }
                                if (var21 < -arg11 + 128 && ~var22 < -1 && class189.field2643[var21 - -1][var22 - 1] == 0 && ~(var20[var23 - -arg11][var24 + -1] & 1625554944) == -1) {
                                    int var32 = 1;
                                    while (true) {
                                        if (arg11 <= var32) {
                                            class87.field1205[var35] = var12 + 1;
                                            class132.field1726[var35] = var13 + -1;
                                            class189.field2643[var21 + 1][var22 + -1] = 9;
                                            var35 = var35 - -1 & 4095;
                                            class87.field1204[var21 + 1][var22 + -1] = var26;
                                            break;
                                        }
                                        if ((var20[arg11 + var23][var24 + -1 + var32] & 2028208128) != 0 || (var20[var23 - -var32][var24 + -1] & 1675886592) != 0) {
                                            break;
                                        }
                                        ++var32;
                                    }
                                }
                                if (var21 > 0 && ~(-arg11 + 128) < ~var22 && ~class189.field2643[var21 + -1][var22 + 1] == -1 && (var20[var23 - 1][arg11 + var24] & 1310982144) == 0) {
                                    for (int var33 = 1; var33 < arg11; ++var33) {
                                        if (~(1336147968 & var20[var23 - 1][var24 + var33]) != -1 || (2116288512 & var20[var33 + -1 + var23][arg11 + var24]) != 0) {
                                            continue label263;
                                        }
                                    }
                                    class87.field1205[var35] = var12 + -1;
                                    class132.field1726[var35] = var13 + 1;
                                    var35 = var35 + 1 & 4095;
                                    class189.field2643[var21 + -1][var22 + 1] = 6;
                                    class87.field1204[var21 - 1][var22 + 1] = var26;
                                }
                            } while (~(-arg11 + 128) >= ~var21);
                        } while (var22 >= -arg11 + 128);
                    } while (~class189.field2643[var21 + 1][var22 + 1] != -1);
                } while (~(var20[arg11 + var23][arg11 + var24] & 2015625216) != -1);
                for (int var34 = 1; ~var34 > ~arg11; ++var34) {
                    if (~(var20[var23 + var34][arg11 + var24] & 2116288512) != -1 || (2028208128 & var20[arg11 + var23][var24 + var34]) != 0) {
                        continue label286;
                    }
                }
                class87.field1205[var35] = var12 + 1;
                class132.field1726[var35] = var13 + 1;
                class189.field2643[var21 + 1][var22 - -1] = 12;
                var35 = 4095 & var35 + 1;
                class87.field1204[var21 + 1][var22 + 1] = var26;
            }
        }
    }

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "(I)V")
    public static void method1826(int arg0) {
        if (arg0 >= -110) {
            field4084 = null;
        }
        field4084 = null;
        field4074 = null;
        field4080 = null;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Ltj;I)Lri;")
    public final class372 method118(class298 arg0, int arg1) {
        ++field4075;
        if (arg1 != 18630) {
            this.field4079 = -26;
        }
        class118 var3 = arg0.method519();
        var3.method274(super.field1654, super.field1650, super.field1659);
        class372 var4 = class384.method2492(3, (byte) 78);
        if (~this.field4082 != 0) {
            class257 var5 = class129.method915(126, this.field4082).method1070(-88, arg0, -1, 0, this.field4079, (class436) null, (class233) null, 0, 1024);
            if (var5 != null) {
                var5.method1661(var3, var4.field5481[2], 0);
            }
        }
        if (~this.field4078 != 0) {
            class257 var6 = class129.method915(127, this.field4078).method1070(-103, arg0, -1, 0, this.field4076, (class436) null, (class233) null, 0, 1024);
            if (var6 != null) {
                var6.method1661(var3, var4.field5481[1], 0);
            }
        }
        class257 var7 = class129.method915(127, this.field4081).method1070(arg1 + -18752, arg0, -1, 0, this.field4071, (class436) null, (class233) null, 0, 1024);
        if (var7 != null) {
            var7.method1661(var3, var4.field5481[0], 0);
        }
        return var4;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(BLtj;)V")
    public final void method126(byte arg0, class298 arg1) {
        ++field4072;
        if (arg0 != 50) {
            this.field4078 = -62;
        }
    }
}
