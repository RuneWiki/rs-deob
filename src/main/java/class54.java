import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ts")
public class class54 extends class335 {

    @OriginalMember(owner = "client!ts", name = "F", descriptor = "I")
    private int field702 = 2048;

    @OriginalMember(owner = "client!ts", name = "D", descriptor = "I")
    private int field700 = 3072;

    @OriginalMember(owner = "client!ts", name = "J", descriptor = "I")
    private int field706 = 1024;

    @OriginalMember(owner = "client!ts", name = "B", descriptor = "Leba;")
    public static class550 field698 = new class550(8, 1);

    @OriginalMember(owner = "client!ts", name = "I", descriptor = "I")
    public static int field705 = 0;

    @OriginalMember(owner = "client!ts", name = "C", descriptor = "I")
    public static int field699;

    @OriginalMember(owner = "client!ts", name = "E", descriptor = "I")
    public static int field701;

    @OriginalMember(owner = "client!ts", name = "G", descriptor = "I")
    public static int field703;

    @OriginalMember(owner = "client!ts", name = "K", descriptor = "I")
    public static int field707;

    @OriginalMember(owner = "client!ts", name = "L", descriptor = "I")
    public static int field708;

    @OriginalMember(owner = "client!ts", name = "M", descriptor = "I")
    public static int field709;

    @OriginalMember(owner = "client!ts", name = "H", descriptor = "Lit;")
    public static class513 field704;

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(Lio;I)Lfda;", line = 4)
    public static final class540 method315(class157 arg0, int arg1) {
        ++field701;
        int var2 = arg0.method930(255);
        class566 var3 = class335.method1971(arg1 + 1)[arg0.method930(255)];
        class286 var4 = class190.method1252((byte) 126)[arg0.method930(arg1 ^ 254)];
        int var5 = arg0.method928(arg1 ^ 2016790225);
        int var6 = arg0.method928(2016790224);
        int var7 = arg0.method963(arg1 ^ -128);
        int var8 = arg0.method963(-118);
        int var9 = arg0.method908(false);
        int var10 = arg0.method908(false);
        int var11 = arg0.method908(false);
        boolean var12 = arg0.method930(255) == arg1;
        return new class540(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12);
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(IZ)[[I", line = 36)
    public final int[][] method1(int arg0, boolean arg1) {
        ++field703;
        int[][] var3 = super.field4527.method669(arg0, (byte) 2);
        if (arg1) {
            return null;
        } else {
            if (super.field4527.field1468) {
                int[][] var4 = this.method1968(arg0, 3, 0);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; class649.field8968 > var11; ++var11) {
                    var8[var11] = (var5[var11] * this.field702 >> 12) + this.field706;
                    var9[var11] = (var6[var11] * this.field702 >> 12) + this.field706;
                    var10[var11] = (var7[var11] * this.field702 >> 12) + this.field706;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(ILio;I)V", line = 87)
    public final void method2(int arg0, class157 arg1, int arg2) {
        if (arg2 != -66) {
            field705 = -74;
        }
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (arg0 == 2) {
                    super.field4537 = arg1.method930(255) == 1;
                }
            } else {
                this.field700 = arg1.method963(-121);
            }
        } else {
            this.field706 = arg1.method963(arg2 ^ 56);
        }
        ++field707;
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(IIIIIIIIILev;II)Z", line = 132)
    public static final boolean method316(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class593 arg9, int arg10, int arg11) {
        ++field708;
        int var12 = arg1;
        int var13 = arg4;
        byte var14 = 64;
        byte var15 = 64;
        int var16 = arg1 - var14;
        int var17 = arg4 - var15;
        class77.field913[var14][var15] = 99;
        class595.field8210[var14][var15] = 0;
        if (arg2 != 5522) {
            method316(-117, 119, -31, 63, 112, 121, -34, -27, -44, (class593) null, 126, -2);
        }
        byte var18 = 0;
        class310.field4191[var18] = arg1;
        int var19 = 0;
        int var35 = var18 + 1;
        class585.field8082[var18] = arg4;
        int[][] var20 = arg9.field8191;
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
                                    class436.field5814 = var12;
                                    class6.field61 = var13;
                                    return false;
                                }
                                var13 = class585.field8082[var19];
                                var12 = class310.field4191[var19];
                                var21 = -var17 + var13;
                                var19 = 4095 & var19 + 1;
                                var22 = -var16 + var12;
                                var23 = var12 - arg9.field8177;
                                var24 = var13 - arg9.field8184;
                                if (arg7 != -4) {
                                    if (arg7 != -3) {
                                        if (arg7 != -2) {
                                            if (~arg7 != 0) {
                                                if (arg7 != 0 && arg7 != 1 && arg7 != 2 && arg7 != 3 && ~arg7 != -10) {
                                                    if (arg9.method3287(arg6, arg11, arg8, var13, arg0, 32, arg7, var12)) {
                                                        class6.field61 = var13;
                                                        class436.field5814 = var12;
                                                        return true;
                                                    }
                                                } else if (arg9.method3294(arg0, arg8, arg11, arg7, arg6, arg2 ^ -5616, var12, var13)) {
                                                    class436.field5814 = var12;
                                                    class6.field61 = var13;
                                                    return true;
                                                }
                                            } else if (arg9.method3286(arg3, var13, var12, arg10, arg8, -102, arg11, arg6, arg5)) {
                                                class436.field5814 = var12;
                                                class6.field61 = var13;
                                                return true;
                                            }
                                        } else if (arg9.method3295(arg6, arg11, var12, arg11, arg3, arg10, arg5, (byte) -117, var13, arg8)) {
                                            class436.field5814 = var12;
                                            class6.field61 = var13;
                                            return true;
                                        }
                                    } else if (class537.method3007(arg6, 14969, var13, arg8, arg11, var12, arg5, arg11, arg3)) {
                                        class436.field5814 = var12;
                                        class6.field61 = var13;
                                        return true;
                                    }
                                } else if (~arg6 == ~var12 && arg8 == var13) {
                                    class436.field5814 = var12;
                                    class6.field61 = var13;
                                    return true;
                                }
                                var26 = class595.field8210[var22][var21] + 1;
                                if (~var22 < -1 && ~class77.field913[var22 + -1][var21] == -1 && ~(1134821376 & var20[var23 + -1][var24]) == -1 && (var20[var23 + -1][var24 - -arg11 - 1] & 1310982144) == 0) {
                                    int var27 = 1;
                                    while (true) {
                                        if (arg11 + -1 <= var27) {
                                            class310.field4191[var35] = var12 + -1;
                                            class585.field8082[var35] = var13;
                                            class77.field913[var22 + -1][var21] = 2;
                                            var35 = 4095 & var35 + 1;
                                            class595.field8210[var22 - 1][var21] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + -1][var24 + var27] & 1336147968) != 0) {
                                            break;
                                        }
                                        ++var27;
                                    }
                                }
                                if (var22 < -arg11 + 128 && class77.field913[var22 - -1][var21] == 0 && ~(1625554944 & var20[arg11 + var23][var24]) == -1 && ~(var20[arg11 + var23][arg11 + var24 + -1] & 2015625216) == -1) {
                                    int var28 = 1;
                                    while (true) {
                                        if (~(arg11 + -1) >= ~var28) {
                                            class310.field4191[var35] = var12 + 1;
                                            class585.field8082[var35] = var13;
                                            class77.field913[var22 + 1][var21] = 8;
                                            var35 = 4095 & var35 - -1;
                                            class595.field8210[var22 + 1][var21] = var26;
                                            break;
                                        }
                                        if ((2028208128 & var20[var23 - -arg11][var24 + var28]) != 0) {
                                            break;
                                        }
                                        ++var28;
                                    }
                                }
                                if (~var21 < -1 && ~class77.field913[var22][var21 + -1] == -1 && ~(1134821376 & var20[var23][var24 + -1]) == -1 && (var20[var23 - (-arg11 - -1)][var24 + -1] & 1625554944) == 0) {
                                    int var29 = 1;
                                    while (true) {
                                        if (arg11 - 1 <= var29) {
                                            class310.field4191[var35] = var12;
                                            class585.field8082[var35] = var13 + -1;
                                            class77.field913[var22][var21 + -1] = 1;
                                            var35 = var35 + 1 & 4095;
                                            class595.field8210[var22][var21 + -1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var29][var24 + -1] & 1675886592) != 0) {
                                            break;
                                        }
                                        ++var29;
                                    }
                                }
                                if (~(-arg11 + 128) < ~var21 && ~class77.field913[var22][var21 + 1] == -1 && ~(var20[var23][arg11 + var24] & 1310982144) == -1 && (2015625216 & var20[var23 + -1 + arg11][arg11 + var24]) == 0) {
                                    int var30 = 1;
                                    while (true) {
                                        if (arg11 + -1 <= var30) {
                                            class310.field4191[var35] = var12;
                                            class585.field8082[var35] = var13 + 1;
                                            class77.field913[var22][var21 - -1] = 4;
                                            var35 = 4095 & var35 + 1;
                                            class595.field8210[var22][var21 + 1] = var26;
                                            break;
                                        }
                                        if (~(var20[var23 + var30][arg11 + var24] & 2116288512) != -1) {
                                            break;
                                        }
                                        ++var30;
                                    }
                                }
                                if (var22 > 0 && ~var21 < -1 && class77.field913[var22 + -1][var21 + -1] == 0 && ~(1134821376 & var20[var23 + -1][var24 + -1]) == -1) {
                                    int var31 = 1;
                                    while (true) {
                                        if (arg11 <= var31) {
                                            class310.field4191[var35] = var12 + -1;
                                            class585.field8082[var35] = var13 + -1;
                                            var35 = 4095 & var35 - -1;
                                            class77.field913[var22 + -1][var21 + -1] = 3;
                                            class595.field8210[var22 + -1][var21 + -1] = var26;
                                            break;
                                        }
                                        if (~(var20[var23 + -1][var24 - 1 + var31] & 1336147968) != -1 || (var20[var23 - -var31 + -1][var24 + -1] & 1675886592) != 0) {
                                            break;
                                        }
                                        ++var31;
                                    }
                                }
                                if (var22 < -arg11 + 128 && var21 > 0 && ~class77.field913[var22 + 1][var21 + -1] == -1 && ~(1625554944 & var20[arg11 + var23][var24 + -1]) == -1) {
                                    int var32 = 1;
                                    while (true) {
                                        if (~arg11 >= ~var32) {
                                            class310.field4191[var35] = var12 + 1;
                                            class585.field8082[var35] = var13 + -1;
                                            var35 = 4095 & var35 + 1;
                                            class77.field913[var22 - -1][var21 + -1] = 9;
                                            class595.field8210[var22 + 1][var21 - 1] = var26;
                                            break;
                                        }
                                        if ((2028208128 & var20[var23 - -arg11][var24 + -1 - -var32]) != 0 || ~(var20[var23 + var32][var24 + -1] & 1675886592) != -1) {
                                            break;
                                        }
                                        ++var32;
                                    }
                                }
                                if (~var22 < -1 && var21 < -arg11 + 128 && class77.field913[var22 - 1][var21 + 1] == 0 && (1310982144 & var20[var23 + -1][arg11 + var24]) == 0) {
                                    for (int var33 = 1; ~var33 > ~arg11; ++var33) {
                                        if (~(var20[var23 - 1][var24 - -var33] & 1336147968) != -1 || (var20[var23 + var33 + -1][var24 - -arg11] & 2116288512) != 0) {
                                            continue label263;
                                        }
                                    }
                                    class310.field4191[var35] = var12 + -1;
                                    class585.field8082[var35] = var13 + 1;
                                    class77.field913[var22 + -1][var21 + 1] = 6;
                                    var35 = 4095 & var35 + 1;
                                    class595.field8210[var22 + -1][var21 + 1] = var26;
                                }
                            } while (~(-arg11 + 128) >= ~var22);
                        } while (~var21 <= ~(-arg11 + 128));
                    } while (class77.field913[var22 + 1][var21 + 1] != 0);
                } while (~(var20[arg11 + var23][arg11 + var24] & 2015625216) != -1);
                for (int var34 = 1; ~arg11 < ~var34; ++var34) {
                    if ((2116288512 & var20[var23 - -var34][arg11 + var24]) != 0 || (2028208128 & var20[var23 - -arg11][var24 + var34]) != 0) {
                        continue label286;
                    }
                }
                class310.field4191[var35] = var12 + 1;
                class585.field8082[var35] = var13 + 1;
                class77.field913[var22 + 1][var21 + 1] = 12;
                var35 = var35 + 1 & 4095;
                class595.field8210[var22 - -1][var21 + 1] = var26;
            }
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(B)V", line = 567)
    public final void method317(byte arg0) {
        ++field709;
        this.field702 = -this.field706 + this.field700;
        int var2 = -93 % ((arg0 - 58) / 60);
    }

    @OriginalMember(owner = "client!ts", name = "<init>", descriptor = "()V", line = 580)
    public class54() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ts", name = "b", descriptor = "(Z)V", line = 583)
    public static void method318(boolean arg0) {
        field704 = null;
        field698 = null;
        if (arg0) {
            method316(120, -13, -45, 83, 37, 10, 22, -86, -103, (class593) null, -64, 61);
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(ZI)[I", line = 605)
    public final int[] method3(boolean arg0, int arg1) {
        ++field699;
        if (!arg0) {
            this.field700 = 10;
        }
        int[] var3 = super.field4525.method2344(-2, arg1);
        if (super.field4525.field5435) {
            int[] var4 = this.method1969(0, arg1, -69);
            for (int var5 = 0; class649.field8968 > var5; ++var5) {
                var3[var5] = this.field706 - -(var4[var5] * this.field702 >> 12);
            }
        }
        return var3;
    }
}
