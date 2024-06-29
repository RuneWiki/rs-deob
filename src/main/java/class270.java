import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class270 extends class223 {

    @OriginalMember(owner = "client!jk", name = "N", descriptor = "I")
    private int field4274 = 1;

    @OriginalMember(owner = "client!jk", name = "J", descriptor = "I")
    private int field4270 = 0;

    @OriginalMember(owner = "client!jk", name = "M", descriptor = "I")
    private int field4273 = 0;

    @OriginalMember(owner = "client!jk", name = "V", descriptor = "Ljava/lang/String;")
    public static String field4281 = "slide:";

    @OriginalMember(owner = "client!jk", name = "Z", descriptor = "[J")
    public static long[] field4285 = new long[32];

    @OriginalMember(owner = "client!jk", name = "K", descriptor = "I")
    public static int field4271;

    @OriginalMember(owner = "client!jk", name = "L", descriptor = "I")
    public static int field4272;

    @OriginalMember(owner = "client!jk", name = "O", descriptor = "I")
    public static int field4275;

    @OriginalMember(owner = "client!jk", name = "P", descriptor = "I")
    public static int field4276;

    @OriginalMember(owner = "client!jk", name = "R", descriptor = "I")
    public static int field4277;

    @OriginalMember(owner = "client!jk", name = "S", descriptor = "I")
    public static int field4278;

    @OriginalMember(owner = "client!jk", name = "T", descriptor = "I")
    public static int field4279;

    @OriginalMember(owner = "client!jk", name = "U", descriptor = "I")
    public static int field4280;

    @OriginalMember(owner = "client!jk", name = "W", descriptor = "I")
    public static int field4282;

    @OriginalMember(owner = "client!jk", name = "X", descriptor = "I")
    public static int field4283;

    @OriginalMember(owner = "client!jk", name = "Y", descriptor = "I")
    public static int field4284;

    @OriginalMember(owner = "client!jk", name = "ab", descriptor = "I")
    public static int field4286;

    @OriginalMember(owner = "client!jk", name = "bb", descriptor = "I")
    public static int field4287;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(Ljava/lang/String;B)I")
    public static final int method1825(String arg0, byte arg1) {
        ++field4272;
        if (arg0 == null) {
            return -1;
        } else {
            for (int var2 = 0; var2 < class181.field2843; ++var2) {
                if (arg0.equalsIgnoreCase(class64.field1015[var2])) {
                    return var2;
                }
            }
            if (arg1 != -6) {
                method1825((String) null, (byte) 77);
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "(I)V")
    public final void method43(int arg0) {
        if (arg0 == 500) {
            class298.method2000((byte) -115);
            ++field4279;
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIILcc;)V")
    public static final void method1826(int arg0, int arg1, int arg2, class222 arg3) {
        if (~arg3.field3393 == -2) {
            class41.method365((short) 19, -1, (byte) -89, 0L, "", arg3.field3459, arg3.field3554, 0);
            ++class180.field2827;
        }
        ++field4278;
        if (~arg3.field3393 == -3 && !class162.field2438) {
            String var4 = class296.method1984(-1, arg3);
            if (var4 != null) {
                class41.method365((short) 13, -1, (byte) -89, 0L, "<col=00ff00>" + arg3.field3558, var4, arg3.field3554, -1);
                ++class286.field4496;
            }
        }
        if (~arg3.field3393 == -4) {
            ++class36.field620;
            class41.method365((short) 7, -1, (byte) -89, 0L, "", class142.field2123, arg3.field3554, 0);
        }
        if (arg0 == 31737) {
            if (arg3.field3393 == 4) {
                ++class272.field4347;
                class41.method365((short) 17, -1, (byte) -89, 0L, "", arg3.field3459, arg3.field3554, 0);
            }
            if (~arg3.field3393 == -6) {
                ++class284.field4475;
                class41.method365((short) 46, -1, (byte) -89, 0L, "", arg3.field3459, arg3.field3554, 0);
            }
            if (arg3.field3393 == 6 && class260.field4115 == null) {
                class41.method365((short) 10, -1, (byte) -89, 0L, "", arg3.field3459, arg3.field3554, -1);
                ++class268.field4251;
            }
            if (arg3.field3552 == 2) {
                int var5 = 0;
                for (int var6 = 0; arg3.field3479 > var6; ++var6) {
                    for (int var7 = 0; ~var7 > ~arg3.field3487; ++var7) {
                        int var8 = (arg3.field3547 + 32) * var7;
                        int var9 = (arg3.field3410 + 32) * var6;
                        if (~var5 > -21) {
                            var9 += arg3.field3555[var5];
                            var8 += arg3.field3431[var5];
                        }
                        if (var8 <= arg1 && ~var9 >= ~arg2 && ~(var8 + 32) < ~arg1 && arg2 < var9 - -32) {
                            class137.field2068 = var5;
                            class215.field3291 = arg3;
                            if (~arg3.field3407[var5] < -1) {
                                class28 var10 = client.method1159(arg3);
                                class179 var11 = class123.method929(22497, arg3.field3407[var5] - 1);
                                if (class173.field2658 == 1 && var10.method225(0)) {
                                    if (~class268.field4249 != ~arg3.field3554 || class116.field1779 != var5) {
                                        class41.method365((short) 35, -1, (byte) -89, (long) var11.field2796, class202.field3120 + " -> <col=ff9040>" + var11.field2778, class196.field3067, arg3.field3554, var5);
                                        ++class101.field1579;
                                    }
                                } else if (class162.field2438 && var10.method225(0)) {
                                    class238 var12 = ~class149.field2213 == 0 ? null : class55.method463(0, class149.field2213);
                                    if ((class28.field486 & 16) != 0 && (var12 == null || var11.method1277(var12.field3753, class149.field2213, 102) != var12.field3753)) {
                                        ++class133.field1992;
                                        class41.method365((short) 8, class203.field3131, (byte) -89, (long) var11.field2796, class202.field3119 + " -> <col=ff9040>" + var11.field2778, class201.field3104, arg3.field3554, var5);
                                    }
                                } else {
                                    String[] var13 = var11.field2783;
                                    if (class221.field3382) {
                                        var13 = class200.method1414(-86, var13);
                                    }
                                    if (var10.method225(0)) {
                                        for (int var14 = 4; var14 >= 3; --var14) {
                                            if (var13 != null && var13[var14] != null) {
                                                ++class166.field2511;
                                                byte var15;
                                                if (~var14 != -4) {
                                                    var15 = 3;
                                                } else {
                                                    var15 = 22;
                                                }
                                                class41.method365(var15, -1, (byte) -89, (long) var11.field2796, "<col=ff9040>" + var11.field2778, var13[var14], arg3.field3554, var5);
                                            }
                                        }
                                    }
                                    ++class110.field1692;
                                    if (var10.method231((byte) 126)) {
                                        ++class261.field4127;
                                        class41.method365((short) 58, class265.field4194, (byte) -89, (long) var11.field2796, "<col=ff9040>" + var11.field2778, class196.field3067, arg3.field3554, var5);
                                    }
                                    if (var10.method225(arg0 + -31737) && var13 != null) {
                                        for (int var16 = 2; ~var16 <= -1; --var16) {
                                            if (var13[var16] != null) {
                                                ++class88.field1385;
                                                byte var17 = 0;
                                                if (var16 == 0) {
                                                    var17 = 20;
                                                }
                                                if (~var16 == -2) {
                                                    var17 = 37;
                                                }
                                                if (~var16 == -3) {
                                                    var17 = 15;
                                                }
                                                class41.method365(var17, -1, (byte) -89, (long) var11.field2796, "<col=ff9040>" + var11.field2778, var13[var16], arg3.field3554, var5);
                                            }
                                        }
                                    }
                                    String[] var18 = arg3.field3422;
                                    if (class221.field3382) {
                                        var18 = class200.method1414(-59, var18);
                                    }
                                    if (var18 != null) {
                                        for (int var19 = 4; var19 >= 0; --var19) {
                                            if (var18[var19] != null) {
                                                byte var20 = 0;
                                                ++class301.field4834;
                                                if (~var19 == -1) {
                                                    var20 = 39;
                                                }
                                                if (var19 == 1) {
                                                    var20 = 26;
                                                }
                                                if (~var19 == -3) {
                                                    var20 = 47;
                                                }
                                                if (var19 == 3) {
                                                    var20 = 48;
                                                }
                                                if (var19 == 4) {
                                                    var20 = 6;
                                                }
                                                class41.method365(var20, -1, (byte) -89, (long) var11.field2796, "<col=ff9040>" + var11.field2778, var18[var19], arg3.field3554, var5);
                                            }
                                        }
                                    }
                                    class41.method365((short) 1001, class37.field631, (byte) -89, (long) var11.field2796, "<col=ff9040>" + var11.field2778, class264.field4179, arg3.field3554, var5);
                                }
                            }
                        }
                        ++var5;
                    }
                }
            }
            if (arg3.field3441) {
                if (!class162.field2438) {
                    for (int var21 = 9; var21 >= 5; --var21) {
                        String var25 = class246.method1669(var21, arg3, -120);
                        if (var25 != null) {
                            ++class285.field4491;
                            class41.method365((short) 1003, class264.method1772(32226, arg3, var21), (byte) -89, (long) (var21 + 1), arg3.field3537, var25, arg3.field3554, arg3.field3411);
                        }
                    }
                    String var22 = class296.method1984(-1, arg3);
                    if (var22 != null) {
                        ++class286.field4496;
                        class41.method365((short) 13, -1, (byte) -89, 0L, arg3.field3537, var22, arg3.field3554, arg3.field3411);
                    }
                    for (int var23 = 4; var23 >= 0; --var23) {
                        String var24 = class246.method1669(var23, arg3, -112);
                        if (var24 != null) {
                            ++class285.field4491;
                            class41.method365((short) 49, class264.method1772(32226, arg3, var23), (byte) -89, (long) (var23 + 1), arg3.field3537, var24, arg3.field3554, arg3.field3411);
                        }
                    }
                    if (client.method1159(arg3).method240(-82)) {
                        if (arg3.field3496 != null) {
                            class41.method365((short) 10, -1, (byte) -89, 0L, "", arg3.field3496, arg3.field3554, arg3.field3411);
                        } else {
                            class41.method365((short) 10, -1, (byte) -89, 0L, "", class39.field670, arg3.field3554, arg3.field3411);
                        }
                        ++class268.field4251;
                        return;
                    }
                    return;
                }
                if (client.method1159(arg3).method230(31141) && ~(32 & class28.field486) != -1) {
                    ++class295.field4653;
                    class41.method365((short) 38, class203.field3131, (byte) -89, 0L, class202.field3119 + " -> " + arg3.field3537, class201.field3104, arg3.field3554, arg3.field3411);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(BII)I")
    public static final int method1827(byte arg0, int arg1, int arg2) {
        ++field4275;
        if (arg0 != -20) {
            return 59;
        } else if (arg1 == -1) {
            return 12345678;
        } else {
            int var3 = (arg1 & 127) * arg2 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (65408 & arg1) - -var3;
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(BI)[I")
    public final int[] method40(byte arg0, int arg1) {
        ++field4286;
        if (arg0 <= 14) {
            this.field4274 = -113;
        }
        int[] var3 = super.field3588.method1611(0, arg1);
        if (super.field3588.field3722) {
            int var4 = class307.field4925[arg1];
            int var5 = var4 + -2048 >> 1;
            for (int var6 = 0; ~class250.field4008 < ~var6; ++var6) {
                int var7 = class106.field1662[var6];
                int var8 = var7 + -2048 >> 1;
                int var11;
                if (this.field4270 != 0) {
                    int var9 = var5 * var5 + var8 * var8 >> 12;
                    int var10 = (int) (Math.sqrt((double) ((float) var9 / 4096.0F)) * 4096.0D);
                    var11 = (int) ((double) (this.field4274 * var10) * 3.141592653589793D);
                } else {
                    var11 = (var7 - var4) * this.field4274;
                }
                int var12 = var11 - (var11 & -4096);
                if (this.field4273 != 0) {
                    if (~this.field4273 == -3) {
                        var12 -= 2048;
                        if (~var12 > -1) {
                            var12 = -var12;
                        }
                        var12 = -var12 + 2048 << 1;
                    }
                } else {
                    var12 = class222.field3571[(4086 & var12) >> 4] - -4096 >> 1;
                }
                var3[var6] = var12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jk", name = "<init>", descriptor = "()V")
    public class270() {
        super(0, true);
    }

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "(B)V")
    public static void method1828(byte arg0) {
        field4285 = null;
        if (arg0 < 119) {
            field4285 = null;
        }
        field4281 = null;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIII)V")
    public static final void method1829(int arg0, int arg1, int arg2, int arg3) {
        ++field4282;
        class69 var4 = class255.method1723((byte) 32, arg2, 11);
        var4.method556((byte) -120);
        int var5 = 25 % ((arg3 - 29) / 50);
        var4.field1091 = arg0;
        var4.field1088 = arg1;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(Lha;IB)V")
    public final void method37(class31 arg0, int arg1, byte arg2) {
        if (arg2 == 102) {
            if (~arg1 != -1) {
                if (~arg1 != -2) {
                    if (arg1 == 3) {
                        this.field4274 = arg0.method265(-113);
                    }
                } else {
                    this.field4273 = arg0.method265(-90);
                }
            } else {
                this.field4270 = arg0.method265(-85);
            }
            ++field4280;
        }
    }

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "(BI)V")
    public static final void method1830(byte arg0, int arg1) {
        ++field4284;
        if (class141.field2108 == null) {
            class141.field2108 = new byte[4][104][104];
        }
        if (arg1 > -1) {
            method1825((String) null, (byte) -122);
        }
        for (int var2 = 0; ~var2 > -5; ++var2) {
            for (int var3 = 0; ~var3 > -105; ++var3) {
                for (int var4 = 0; var4 < 104; ++var4) {
                    class141.field2108[var2][var3][var4] = arg0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IB)Z")
    public static final boolean method1831(int arg0, byte arg1) {
        ++field4276;
        byte var2 = 0;
        byte var3 = 0;
        if (class24.field425 == null) {
            if (class73.field1119 == null) {
                class24.field425 = new class51(512, 512);
            } else {
                class24.field425 = (class51) class73.field1119;
            }
            int[] var4 = class24.field425.field822;
            int var5 = var4.length;
            for (int var6 = 0; ~var6 > ~var5; ++var6) {
                var4[var6] = 1;
            }
            for (int var7 = var3 + 1; ~(104 - var3 + -1) < ~var7; ++var7) {
                int var21 = 24628 - -((-var7 + var3 + 103) * 2048);
                for (int var22 = var2 - -1; ~var22 > ~(-var2 + 103); ++var22) {
                    if ((24 & client.field2390[arg0][var22][var7]) == 0) {
                        class226.method1561(var4, var21, 512, arg0, var22, var7);
                    }
                    if (~arg0 > -4 && (8 & client.field2390[arg0 + 1][var22][var7]) != 0) {
                        class226.method1561(var4, var21, 512, arg0 + 1, var22, var7);
                    }
                    var21 += 4;
                }
            }
            class274.field4373 = 0;
            for (int var8 = 0; ~var8 > -105; ++var8) {
                for (int var9 = 0; ~var9 > -105; ++var9) {
                    long var10 = class183.method1310(class130.field1941, var2 + var8, var3 + var9);
                    if (var10 != 0L) {
                        class295 var12 = class166.method1209(126, (int) (var10 >>> 32) & Integer.MAX_VALUE);
                        int var13 = var12.field4587;
                        if (var12.field4598 != null) {
                            for (int var14 = 0; var12.field4598.length > var14; ++var14) {
                                if (var12.field4598[var14] != -1) {
                                    class295 var15 = class166.method1209(127, var12.field4598[var14]);
                                    if (var15.field4587 >= 0) {
                                        var13 = var15.field4587;
                                        break;
                                    }
                                }
                            }
                        }
                        if (~var13 <= -1) {
                            int var16 = var3 + var9;
                            int var17 = var2 + var8;
                            if (var13 != 22 && ~var13 != -30 && ~var13 != -35 && var13 != 36 && ~var13 != -47 && var13 != 47 && ~var13 != -49) {
                                int[][] var18 = class80.field1236[class130.field1941].field1396;
                                for (int var19 = 0; ~var19 > -11; ++var19) {
                                    int var20 = (int) (Math.random() * 4.0D);
                                    if (~var20 == -1 && var17 > 0 && ~var17 < ~(var8 + -3) && (2883848 & var18[var17 - 1][var16]) == 0) {
                                        --var17;
                                    }
                                    if (~var20 == -2 && var17 < 103 && ~var17 > ~(var8 + 3) && (2883968 & var18[var17 + 1][var16]) == 0) {
                                        ++var17;
                                    }
                                    if (var20 == 2 && ~var16 < -1 && var16 > var9 + -3 && ~(2883842 & var18[var17][var16 + -1]) == -1) {
                                        --var16;
                                    }
                                    if (~var20 == -4 && var16 < 103 && ~var16 > ~(var9 + 3) && (2883872 & var18[var17][var16 - -1]) == 0) {
                                        ++var16;
                                    }
                                }
                            }
                            class248.field3951[class274.field4373] = var12.field4584;
                            class14.field175[class274.field4373] = -var2 + var17;
                            class33.field594[class274.field4373] = -var3 + var16;
                            ++class274.field4373;
                        }
                    }
                }
            }
        }
        if (arg1 != -39) {
            field4283 = -75;
        }
        class24.field425.method433();
        int var23 = (int) (20.0D * Math.random()) - (-228 - (238 + (int) (20.0D * Math.random()) - 10 << 8)) + ((int) (Math.random() * 20.0D) + 238 - 10 << 16);
        int var24 = 238 + (int) (20.0D * Math.random()) + -10 << 16;
        for (int var25 = 1; ~var25 > -104; ++var25) {
            for (int var26 = 1; ~var26 > -104; ++var26) {
                if (~(24 & client.field2390[arg0][var2 + var26][var3 + var25]) == -1 && !class85.method650(var24, var25, arg0, 23000, var3, var23, var26, var2)) {
                    class143.field2140.method1862(false);
                    return false;
                }
                if (arg0 < 3 && ~(client.field2390[arg0 - -1][var2 + var26][var25 - -var3] & 8) != -1 && !class85.method650(var24, var25, arg0 - -1, 23000, var3, var23, var26, var2)) {
                    class143.field2140.method1862(false);
                    return false;
                }
            }
        }
        class73.field1119 = class24.field425;
        class143.field2140.method1862(false);
        class24.field425 = null;
        return true;
    }
}
