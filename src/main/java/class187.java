import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class187 extends class212 {

    @OriginalMember(owner = "client!rf", name = "X", descriptor = "Z")
    private boolean field3304 = true;

    @OriginalMember(owner = "client!rf", name = "gb", descriptor = "Z")
    private boolean field3313 = true;

    @OriginalMember(owner = "client!rf", name = "U", descriptor = "Lsc;")
    public static class181 field3301 = class149.method967(255, "leuchten1:");

    @OriginalMember(owner = "client!rf", name = "cb", descriptor = "Lsc;")
    public static class181 field3309 = class149.method967(255, ":duelstake:");

    @OriginalMember(owner = "client!rf", name = "V", descriptor = "I")
    public static int field3302;

    @OriginalMember(owner = "client!rf", name = "W", descriptor = "I")
    public static int field3303;

    @OriginalMember(owner = "client!rf", name = "Y", descriptor = "I")
    public static int field3305;

    @OriginalMember(owner = "client!rf", name = "Z", descriptor = "I")
    public static int field3306;

    @OriginalMember(owner = "client!rf", name = "ab", descriptor = "I")
    public static int field3307;

    @OriginalMember(owner = "client!rf", name = "bb", descriptor = "I")
    public static int field3308;

    @OriginalMember(owner = "client!rf", name = "db", descriptor = "I")
    public static int field3310;

    @OriginalMember(owner = "client!rf", name = "fb", descriptor = "I")
    public static int field3312;

    @OriginalMember(owner = "client!rf", name = "eb", descriptor = "Lo;")
    public static class175 field3311;

    @OriginalMember(owner = "client!rf", name = "hb", descriptor = "[Lsc;")
    public static class181[] field3314;

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(II)[[I")
    public final int[][] method260(int arg0, int arg1) {
        if (arg1 != 16383) {
            this.field3313 = true;
        }
        ++field3310;
        int[][] var3 = super.field3645.method1352(arg0, arg1 ^ -16276);
        if (super.field3645.field3477) {
            int[][] var4 = this.method1410(!this.field3304 ? arg0 : -arg0 + class4.field90, 0, (byte) -74);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var3[1];
            int[] var8 = var3[0];
            int[] var9 = var4[2];
            int[] var10 = var3[2];
            if (!this.field3313) {
                for (int var11 = 0; ~var11 > ~class26.field452; ++var11) {
                    var8[var11] = var5[var11];
                    var7[var11] = var6[var11];
                    var10[var11] = var9[var11];
                }
            } else {
                for (int var12 = 0; var12 < class26.field452; ++var12) {
                    var8[var12] = var5[-var12 + class186.field3300];
                    var7[var12] = var6[-var12 + class186.field3300];
                    var10[var12] = var9[-var12 + class186.field3300];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIIII)V")
    public static final void method1297(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (~arg2 >= ~arg3) {
            class171.method1133(class149.field2507[arg0], arg2, arg1, arg3, (byte) 126);
        } else {
            class171.method1133(class149.field2507[arg0], arg3, arg1, arg2, (byte) 126);
        }
        if (arg4 > -42) {
            field3309 = null;
        }
        ++field3305;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIZIIIIIIIII)Z")
    public static final boolean method1298(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        for (int var12 = 0; ~var12 > -105; ++var12) {
            for (int var31 = 0; ~var31 > -105; ++var31) {
                class256.field4485[var12][var31] = 0;
                class183.field3216[var12][var31] = 99999999;
            }
        }
        class256.field4485[arg9][arg3] = 99;
        ++field3312;
        class183.field3216[arg9][arg3] = 0;
        int var13 = arg9;
        if (arg8 != 1) {
            method1299(false);
        }
        int var14 = arg3;
        byte var15 = 0;
        class94.field1510[var15] = arg9;
        int var32 = var15 + 1;
        class26.field456[var15] = arg3;
        boolean var16 = false;
        int var17 = 0;
        int[][] var18 = class109.field1784[class38.field581].field142;
        while (~var32 != ~var17) {
            var13 = class94.field1510[var17];
            var14 = class26.field456[var17];
            var17 = var17 + 1 & 4095;
            if (~arg5 == ~var13 && arg6 == var14) {
                var16 = true;
                break;
            }
            if (arg4 != 0) {
                if ((~arg4 > -6 || arg4 == 10) && class109.field1784[class38.field581].method70(var13, false, arg10, var14, arg4 + -1, arg5, arg6, 1)) {
                    var16 = true;
                    break;
                }
                if (arg4 < 10 && class109.field1784[class38.field581].method60(arg10, var14, var13, arg6, arg5, 1, 127, arg4 + -1)) {
                    var16 = true;
                    break;
                }
            }
            if (~arg7 != -1 && arg1 != 0 && class109.field1784[class38.field581].method72(arg5, arg6, arg11, 1, -30832, arg7, arg1, var14, var13)) {
                var16 = true;
                break;
            }
            int var30 = class183.field3216[var13][var14] + 1;
            if (var13 > 0 && class256.field4485[var13 - 1][var14] == 0 && (19661064 & var18[var13 + -1][var14]) == 0) {
                class94.field1510[var32] = var13 + -1;
                class26.field456[var32] = var14;
                var32 = var32 - -1 & 4095;
                class256.field4485[var13 + -1][var14] = 2;
                class183.field3216[var13 + -1][var14] = var30;
            }
            if (var13 < 103 && class256.field4485[var13 - -1][var14] == 0 && ~(var18[var13 - -1][var14] & 19661184) == -1) {
                class94.field1510[var32] = var13 + 1;
                class26.field456[var32] = var14;
                class256.field4485[var13 + 1][var14] = 8;
                class183.field3216[var13 - -1][var14] = var30;
                var32 = 4095 & var32 + 1;
            }
            if (~var14 < -1 && class256.field4485[var13][var14 + -1] == 0 && (var18[var13][var14 + -1] & 19661058) == 0) {
                class94.field1510[var32] = var13;
                class26.field456[var32] = var14 + -1;
                class256.field4485[var13][var14 + -1] = 1;
                var32 = var32 + 1 & 4095;
                class183.field3216[var13][var14 + -1] = var30;
            }
            if (var14 < 103 && class256.field4485[var13][var14 + 1] == 0 && (var18[var13][var14 + 1] & 19661088) == 0) {
                class94.field1510[var32] = var13;
                class26.field456[var32] = var14 + 1;
                class256.field4485[var13][var14 + 1] = 4;
                var32 = 4095 & var32 + 1;
                class183.field3216[var13][var14 - -1] = var30;
            }
            if (var13 > 0 && var14 > 0 && class256.field4485[var13 - 1][var14 + -1] == 0 && ~(var18[var13 + -1][var14 + -1] & 19661070) == -1 && ~(19661064 & var18[var13 - 1][var14]) == -1 && ~(var18[var13][var14 - 1] & 19661058) == -1) {
                class94.field1510[var32] = var13 + -1;
                class26.field456[var32] = var14 + -1;
                class256.field4485[var13 + -1][var14 - 1] = 3;
                var32 = var32 + 1 & 4095;
                class183.field3216[var13 + -1][var14 + -1] = var30;
            }
            if (~var13 > -104 && ~var14 < -1 && ~class256.field4485[var13 - -1][var14 - 1] == -1 && ~(19661187 & var18[var13 + 1][var14 + -1]) == -1 && ~(var18[var13 + 1][var14] & 19661184) == -1 && (var18[var13][var14 + -1] & 19661058) == 0) {
                class94.field1510[var32] = var13 + 1;
                class26.field456[var32] = var14 + -1;
                var32 = var32 + 1 & 4095;
                class256.field4485[var13 + 1][var14 + -1] = 9;
                class183.field3216[var13 - -1][var14 - 1] = var30;
            }
            if (var13 > 0 && ~var14 > -104 && ~class256.field4485[var13 + -1][var14 + 1] == -1 && (19661112 & var18[var13 + -1][var14 + 1]) == 0 && (var18[var13 + -1][var14] & 19661064) == 0 && ~(19661088 & var18[var13][var14 + 1]) == -1) {
                class94.field1510[var32] = var13 - 1;
                class26.field456[var32] = var14 + 1;
                var32 = 4095 & var32 + 1;
                class256.field4485[var13 - 1][var14 + 1] = 6;
                class183.field3216[var13 - 1][var14 + 1] = var30;
            }
            if (var13 < 103 && ~var14 > -104 && class256.field4485[var13 + 1][var14 - -1] == 0 && ~(19661280 & var18[var13 + 1][var14 - -1]) == -1 && ~(19661184 & var18[var13 + 1][var14]) == -1 && (var18[var13][var14 + 1] & 19661088) == 0) {
                class94.field1510[var32] = var13 + 1;
                class26.field456[var32] = var14 + 1;
                var32 = 4095 & var32 + 1;
                class256.field4485[var13 + 1][var14 - -1] = 12;
                class183.field3216[var13 + 1][var14 + 1] = var30;
            }
        }
        class253.field4412 = 0;
        if (!var16) {
            if (!arg2) {
                return false;
            }
            int var19 = 1000;
            int var20 = 100;
            byte var21 = 10;
            for (int var22 = -var21 + arg5; ~var22 >= ~(arg5 + var21); ++var22) {
                for (int var23 = arg6 - var21; arg6 + var21 >= var23; ++var23) {
                    if (~var22 <= -1 && ~var23 <= -1 && var22 < 104 && ~var23 > -105 && ~class183.field3216[var22][var23] > -101) {
                        int var24 = 0;
                        if (~arg5 < ~var22) {
                            var24 = -var22 + arg5;
                        } else if (~(arg5 + arg7 + -1) > ~var22) {
                            var24 = -arg5 + 1 + var22 + -arg7;
                        }
                        int var25 = 0;
                        if (~arg6 >= ~var23) {
                            if (~(arg6 - (-arg1 + 1)) > ~var23) {
                                var25 = -arg6 - (-1 - var23) + -arg1;
                            }
                        } else {
                            var25 = arg6 - var23;
                        }
                        int var26 = var24 * var24 - -(var25 * var25);
                        if (~var26 > ~var19 || var19 == var26 && class183.field3216[var22][var23] < var20) {
                            var20 = class183.field3216[var22][var23];
                            var19 = var26;
                            var13 = var22;
                            var14 = var23;
                        }
                    }
                }
            }
            if (~var19 == -1001) {
                return false;
            }
            if (~arg9 == ~var13 && arg3 == var14) {
                return false;
            }
            class253.field4412 = 1;
        }
        byte var27 = 0;
        class94.field1510[var27] = var13;
        int var33 = var27 + 1;
        class26.field456[var27] = var14;
        int var28;
        int var29 = var28 = class256.field4485[var13][var14];
        while (~arg9 != ~var13 || arg3 != var14) {
            if (var28 != var29) {
                class94.field1510[var33] = var13;
                class26.field456[var33++] = var14;
                var28 = var29;
            }
            if ((var29 & 2) != 0) {
                ++var13;
            } else if (~(8 & var29) != -1) {
                --var13;
            }
            if (~(var29 & 1) == -1) {
                if (~(var29 & 4) != -1) {
                    --var14;
                }
            } else {
                ++var14;
            }
            var29 = class256.field4485[var13][var14];
        }
        if (~var33 < -1) {
            class203.method1360(var33, arg0, 126);
            return true;
        } else if (~arg0 == -2) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IB)[I")
    public final int[] method24(int arg0, byte arg1) {
        if (arg1 <= 25) {
            this.method24(35, (byte) 79);
        }
        ++field3303;
        int[] var3 = super.field3640.method737(true, arg0);
        if (super.field3640.field1813) {
            int[] var4 = this.method1405(!this.field3304 ? arg0 : -arg0 + class4.field90, 0, 85);
            if (!this.field3313) {
                class252.method1717(var4, 0, var3, 0, class26.field452);
            } else {
                for (int var5 = 0; class26.field452 > var5; ++var5) {
                    var3[var5] = var4[class186.field3300 - var5];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "(Z)V")
    public static void method1299(boolean arg0) {
        field3314 = null;
        field3301 = null;
        field3311 = null;
        field3309 = null;
        if (!arg0) {
            method1299(false);
        }
    }

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "()V")
    public class187() {
        super(1, false);
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lvf;Z)V")
    public static final void method1300(class230 arg0, boolean arg1) {
        ++field3306;
        if (~(arg0.field3977.length - arg0.field3933) <= -2) {
            int var2 = arg0.method1516((byte) 82);
            if (var2 >= 0 && var2 <= 3) {
                byte var3;
                if (var2 == 3) {
                    var3 = 23;
                } else if (var2 == 2) {
                    var3 = 22;
                } else if (var2 == 1) {
                    var3 = 23;
                } else {
                    var3 = 19;
                }
                if (~var3 >= ~(arg0.field3977.length + -arg0.field3933)) {
                    class209.field3590 = arg0.method1516((byte) 82);
                    if (~class209.field3590 > -2) {
                        class209.field3590 = 1;
                    } else if (~class209.field3590 < -5) {
                        class209.field3590 = 4;
                    }
                    class209.method1385(~arg0.method1516((byte) 82) == -2, (byte) 119);
                    class8.field140 = ~arg0.method1516((byte) 82) == -2;
                    class239.field4165 = arg0.method1516((byte) 82) == 1;
                    class180.field3140 = ~arg0.method1516((byte) 82) == -2;
                    class207.field3552 = arg0.method1516((byte) 82) == 1;
                    class148.field2481 = arg0.method1516((byte) 82) == 1;
                    class73.field1166 = arg0.method1516((byte) 82) == 1;
                    if (!arg1) {
                        field3311 = null;
                    }
                    class239.field4154 = arg0.method1516((byte) 82) == 1;
                    class184.field3252 = arg0.method1516((byte) 82);
                    if (class184.field3252 > 2) {
                        class184.field3252 = 2;
                    }
                    if (~var2 > -3) {
                        class254.field4445 = arg0.method1516((byte) 82) == 1;
                        arg0.method1516((byte) 82);
                    } else {
                        class254.field4445 = ~arg0.method1516((byte) 82) == -2;
                    }
                    class78.field1268 = ~arg0.method1516((byte) 82) == -2;
                    class77.field1241 = ~arg0.method1516((byte) 82) == -2;
                    class242.field4212 = arg0.method1516((byte) 82);
                    if (~class242.field4212 < -3) {
                        class242.field4212 = 2;
                    }
                    class82.field1317 = arg0.method1516((byte) 82) == 1;
                    class173.field2911 = arg0.method1516((byte) 82);
                    if (~class173.field2911 < -128) {
                        class173.field2911 = 127;
                    }
                    class94.field1502 = arg0.method1516((byte) 82);
                    class55.field849 = arg0.method1516((byte) 82);
                    if (~class55.field849 < -128) {
                        class55.field849 = 127;
                    }
                    if (~var2 <= -2) {
                        class225.field3883 = arg0.method1535(2);
                        class85.field1351 = arg0.method1535(2);
                    }
                    if (~var2 <= -4) {
                        class264.field4614 = arg0.method1516((byte) 82) == 1;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lvf;II)V")
    public final void method26(class230 arg0, int arg1, int arg2) {
        ++field3307;
        if (arg2 != -3) {
            method1300((class230) null, false);
        }
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (arg1 == 2) {
                    super.field3651 = arg0.method1516((byte) 82) == 1;
                }
            } else {
                this.field3304 = ~arg0.method1516((byte) 82) == -2;
            }
        } else {
            this.field3313 = ~arg0.method1516((byte) 82) == -2;
        }
    }
}
