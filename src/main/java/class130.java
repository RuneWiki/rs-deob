import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class130 extends class457 {

    @OriginalMember(owner = "client!jj", name = "o", descriptor = "I")
    private int field2261 = 0;

    @OriginalMember(owner = "client!jj", name = "p", descriptor = "I")
    public static int field2262 = -1;

    @OriginalMember(owner = "client!jj", name = "q", descriptor = "I")
    public static int field2263 = 0;

    @OriginalMember(owner = "client!jj", name = "m", descriptor = "I")
    public static int field2259;

    @OriginalMember(owner = "client!jj", name = "n", descriptor = "I")
    public static int field2260;

    @OriginalMember(owner = "client!jj", name = "r", descriptor = "I")
    public static int field2264;

    @OriginalMember(owner = "client!jj", name = "s", descriptor = "I")
    public static int field2265;

    @OriginalMember(owner = "client!jj", name = "t", descriptor = "I")
    public static int field2266;

    @OriginalMember(owner = "client!jj", name = "u", descriptor = "I")
    public static int field2267;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(III)I")
    public static final int method1099(int arg0, int arg1, int arg2) {
        ++field2260;
        if (~arg1 != -2 && arg1 != 3) {
            if (arg2 != 2) {
                method1103((byte) 24);
            }
            return class367.field4986[3 & arg0];
        } else {
            return class10.field176[arg0 & 3];
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIIILjo;ZIIIII)Z")
    public static final boolean method1100(int arg0, int arg1, int arg2, int arg3, class355 arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        ++field2265;
        int var11 = arg0;
        int var12 = arg7;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = arg0 - var13;
        int var16 = -var14 + arg7;
        class567.field8018[var13][var14] = 99;
        class388.field5339[var13][var14] = 0;
        byte var17 = 0;
        class428.field5844[var17] = arg0;
        int var18 = 0;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class513.field7012[var10001] = arg7;
        int[][] var19 = arg4.field4830;
        if (!arg5) {
            method1101(39, 36, 7, -17, 77, (class17) null, (class514) null, -40, (class66) null);
        }
        while (~var26 != ~var18) {
            var11 = class428.field5844[var18];
            var12 = class513.field7012[var18];
            int var20 = var12 - var16;
            int var21 = -arg4.field4841 + var12;
            int var22 = -var15 + var11;
            var18 = 4095 & var18 + 1;
            int var23 = -arg4.field4843 + var11;
            if (arg8 != -4) {
                if (~arg8 != 2) {
                    if (arg8 != -2) {
                        if (arg8 != -1) {
                            if (arg8 != 0 && arg8 != 1 && arg8 != 2 && ~arg8 != -4 && arg8 != 9) {
                                if (arg4.method2193(var11, arg8, 1, arg10, arg2, var12, -1, arg3)) {
                                    class471.field6398 = var12;
                                    class640.field8803 = var11;
                                    return true;
                                }
                            } else if (arg4.method2186(arg8, 1, 5282, var12, arg3, arg10, arg2, var11)) {
                                class640.field8803 = var11;
                                class471.field6398 = var12;
                                return true;
                            }
                        } else if (arg4.method2190(var12, arg9, arg3, arg6, arg1, arg10, 1, false, var11)) {
                            class471.field6398 = var12;
                            class640.field8803 = var11;
                            return true;
                        }
                    } else if (arg4.method2195(arg10, var12, 1, var11, arg1, 8, arg6, arg3, 1, arg9)) {
                        class471.field6398 = var12;
                        class640.field8803 = var11;
                        return true;
                    }
                } else if (class28.method183(arg9, arg10, arg3, var11, 1, var12, -1803607479, arg6, 1)) {
                    class640.field8803 = var11;
                    class471.field6398 = var12;
                    return true;
                }
            } else if (arg10 == var11 && ~arg3 == ~var12) {
                class471.field6398 = var12;
                class640.field8803 = var11;
                return true;
            }
            int var25 = class388.field5339[var22][var20] + 1;
            if (var22 > 0 && class567.field8018[var22 - 1][var20] == 0 && ~(1109655552 & var19[var23 + -1][var21]) == -1) {
                class428.field5844[var26] = var11 - 1;
                class513.field7012[var26] = var12;
                var26 = var26 + 1 & 4095;
                class567.field8018[var22 + -1][var20] = 2;
                class388.field5339[var22 + -1][var20] = var25;
            }
            if (var22 < 127 && ~class567.field8018[var22 + 1][var20] == -1 && ~(var19[var23 - -1][var21] & 1612972032) == -1) {
                class428.field5844[var26] = var11 + 1;
                class513.field7012[var26] = var12;
                class567.field8018[var22 - -1][var20] = 8;
                var26 = 4095 & var26 + 1;
                class388.field5339[var22 + 1][var20] = var25;
            }
            if (~var20 < -1 && ~class567.field8018[var22][var20 + -1] == -1 && ~(1084489728 & var19[var23][var21 - 1]) == -1) {
                class428.field5844[var26] = var11;
                class513.field7012[var26] = var12 - 1;
                var26 = var26 + 1 & 4095;
                class567.field8018[var22][var20 - 1] = 1;
                class388.field5339[var22][var20 + -1] = var25;
            }
            if (~var20 > -128 && class567.field8018[var22][var20 + 1] == 0 && ~(1210318848 & var19[var23][var21 + 1]) == -1) {
                class428.field5844[var26] = var11;
                class513.field7012[var26] = var12 + 1;
                var26 = var26 + 1 & 4095;
                class567.field8018[var22][var20 + 1] = 4;
                class388.field5339[var22][var20 + 1] = var25;
            }
            if (var22 > 0 && ~var20 < -1 && ~class567.field8018[var22 + -1][var20 + -1] == -1 && ~(var19[var23 - 1][var21 - 1] & 1134821376) == -1 && (1109655552 & var19[var23 + -1][var21]) == 0 && (var19[var23][var21 + -1] & 1084489728) == 0) {
                class428.field5844[var26] = var11 + -1;
                class513.field7012[var26] = var12 + -1;
                class567.field8018[var22 - 1][var20 - 1] = 3;
                var26 = var26 - -1 & 4095;
                class388.field5339[var22 + -1][var20 + -1] = var25;
            }
            if (~var22 > -128 && var20 > 0 && class567.field8018[var22 + 1][var20 + -1] == 0 && (1625554944 & var19[var23 - -1][var21 + -1]) == 0 && (var19[var23 + 1][var21] & 1612972032) == 0 && (1084489728 & var19[var23][var21 - 1]) == 0) {
                class428.field5844[var26] = var11 + 1;
                class513.field7012[var26] = var12 + -1;
                class567.field8018[var22 + 1][var20 + -1] = 9;
                var26 = 4095 & var26 - -1;
                class388.field5339[var22 - -1][var20 - 1] = var25;
            }
            if (var22 > 0 && ~var20 > -128 && ~class567.field8018[var22 + -1][var20 + 1] == -1 && (1310982144 & var19[var23 + -1][var21 - -1]) == 0 && ~(var19[var23 + -1][var21] & 1109655552) == -1 && (var19[var23][var21 + 1] & 1210318848) == 0) {
                class428.field5844[var26] = var11 + -1;
                class513.field7012[var26] = var12 + 1;
                var26 = 4095 & var26 + 1;
                class567.field8018[var22 + -1][var20 - -1] = 6;
                class388.field5339[var22 + -1][var20 + 1] = var25;
            }
            if (var22 < 127 && ~var20 > -128 && ~class567.field8018[var22 + 1][var20 + 1] == -1 && (var19[var23 + 1][var21 + 1] & 2015625216) == 0 && (1612972032 & var19[var23 + 1][var21]) == 0 && (var19[var23][var21 + 1] & 1210318848) == 0) {
                class428.field5844[var26] = var11 - -1;
                class513.field7012[var26] = var12 + 1;
                class567.field8018[var22 + 1][var20 + 1] = 12;
                var26 = var26 + 1 & 4095;
                class388.field5339[var22 + 1][var20 + 1] = var25;
            }
        }
        class640.field8803 = var11;
        class471.field6398 = var12;
        return false;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIIIILkh;Laa;ILha;)V")
    public static final void method1101(int arg0, int arg1, int arg2, int arg3, int arg4, class17 arg5, class514 arg6, int arg7, class66 arg8) {
        ++field2259;
        if (arg4 == 2) {
            class393 var9 = class430.field5863.method4031(36, arg3);
            if (var9 != null && var9.field5414 && var9.method2382(arg4 + 2258, class694.field9613)) {
                if (var9.field5391 != null) {
                    int[] var10 = new int[var9.field5391.length];
                    for (int var11 = 0; var11 < var10.length / 2; ++var11) {
                        int var28;
                        if (class536.field7291 != 4) {
                            var28 = (int) class53.field763 + class408.field5599 & 16383;
                        } else {
                            var28 = (int) class53.field763 & 16383;
                        }
                        int var29 = class191.field2937[var28];
                        int var30 = class191.field2936[var28];
                        if (~class536.field7291 != -5) {
                            var30 = var30 * 256 / (class301.field4140 + 256);
                            var29 = var29 * 256 / (class301.field4140 + 256);
                        }
                        var10[var11 * 2] = ((arg0 - -(var9.field5391[var11 * 2] * 4)) * var30 + (var9.field5391[var11 * 2 + 1] * 4 + arg2) * var29 >> 14) + arg5.field347 / 2 + arg1;
                        var10[var11 * 2 + 1] = arg5.field330 / 2 + arg7 + -((var9.field5391[var11 * 2 - -1] * 4 + arg2) * var30 + -((var9.field5391[var11 * 2] * 4 + arg0) * var29) >> 14);
                    }
                    class705.method3939(arg8, var10, var9.field5415, arg5.field292, arg5.field310);
                    if (var9.field5421 <= 0) {
                        for (int var12 = 0; ~var12 > ~(var10.length / 2 + -1); ++var12) {
                            arg8.method491(var10[var12 * 2], var10[var12 * 2 + 1], var10[var12 * 2 + 2], var10[var12 * 2 + 1 - -2], var9.field5404[255 & var9.field5402[var12]], 1, arg6, arg1, arg7);
                        }
                        arg8.method491(var10[var10.length + -2], var10[var10.length + -1], var10[0], var10[1], var9.field5404[255 & var9.field5402[var9.field5402.length + -1]], 1, arg6, arg1, arg7);
                    } else {
                        for (int var13 = 0; var13 < var10.length / 2 + -1; ++var13) {
                            int var21 = var10[var13 * 2];
                            int var22 = var10[var13 * 2 + 1];
                            int var23 = var10[(var13 + 1) * 2];
                            int var24 = var10[var13 * 2 - -1 + 2];
                            if (~var23 > ~var21) {
                                int var25 = var21;
                                var21 = var23;
                                int var26 = var22;
                                var22 = var24;
                                var23 = var25;
                                var24 = var26;
                            } else if (var21 == var23 && var22 > var24) {
                                int var27 = var22;
                                var22 = var24;
                                var24 = var27;
                            }
                            arg8.method554(var21, var22, var23, var24, var9.field5404[255 & var9.field5402[var13]], 1, arg6, arg1, arg7, var9.field5421, var9.field5434, var9.field5399);
                        }
                        int var14 = var10[var10.length + -2];
                        int var15 = var10[var10.length + -1];
                        int var16 = var10[0];
                        int var17 = var10[1];
                        if (~var14 >= ~var16) {
                            if (~var14 == ~var16 && ~var15 < ~var17) {
                                int var18 = var15;
                                var15 = var17;
                                var17 = var18;
                            }
                        } else {
                            int var19 = var14;
                            var14 = var16;
                            int var20 = var15;
                            var16 = var19;
                            var15 = var17;
                            var17 = var20;
                        }
                        arg8.method554(var14, var15, var16, var17, var9.field5404[255 & var9.field5402[var9.field5402.length - 1]], 1, arg6, arg1, arg7, var9.field5421, var9.field5434, var9.field5399);
                    }
                }
                class604 var31 = null;
                if (~var9.field5401 != 0) {
                    var31 = var9.method2386(arg8, false, true);
                    if (var31 != null) {
                        class536.method3036(arg2, arg1, var31, arg6, (byte) 70, arg7, arg0, arg5);
                    }
                }
                if (var9.field5395 != null) {
                    int var32 = 0;
                    if (var31 != null) {
                        var32 = var31.method214();
                    }
                    class67 var33 = class555.field7842;
                    class145 var34 = class440.field5967;
                    if (var9.field5408 == 1) {
                        var33 = class359.field4908;
                        var34 = class16.field239;
                    }
                    if (var9.field5408 == 2) {
                        var33 = class557.field7861;
                        var34 = class333.field4511;
                    }
                    class365.method2227(arg5, arg1, var9.field5395, var33, arg6, var32, (byte) -93, arg0, var9.field5396, var34, arg2, arg7);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(ZI)V")
    public final void method1102(boolean arg0, int arg1) {
        ++field2264;
        if (arg1 != 1164) {
            method1099(56, -74, -15);
        }
        int var3 = super.field6217.field4570.method3006(0, class374.field5075, super.field6224.method224()) + super.field6217.field4573;
        int var4 = super.field6217.field4572.method2837(2113, class412.field5635, super.field6224.method218()) - -super.field6217.field4571;
        super.field6224.method3431((float) (super.field6224.method224() / 2 + var3), (float) (var4 - -(super.field6224.method218() / 2)), 4096, this.field2261);
        this.field2261 += ((class478) super.field6217).field6460;
    }

    @OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(Lgj;Lla;)V")
    public class130(class662 arg0, class478 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "(B)V")
    public static final void method1103(byte arg0) {
        ++field2266;
        if (!class626.field8724) {
            class58.field809 += (-class58.field809 + 24.0F) / 2.0F;
            class626.field8724 = true;
            if (arg0 < -38) {
                class429.field5846 = true;
            }
        }
    }
}
