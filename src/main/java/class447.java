import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class447 extends class119 {

    @OriginalMember(owner = "client!rl", name = "s", descriptor = "I")
    private int field6265;

    @OriginalMember(owner = "client!rl", name = "j", descriptor = "I")
    private int field6256;

    @OriginalMember(owner = "client!rl", name = "o", descriptor = "I")
    private int field6261;

    @OriginalMember(owner = "client!rl", name = "q", descriptor = "I")
    private int field6263;

    @OriginalMember(owner = "client!rl", name = "l", descriptor = "Lih;")
    public static class108 field6258 = new class108(64);

    @OriginalMember(owner = "client!rl", name = "p", descriptor = "F")
    public static float field6262;

    @OriginalMember(owner = "client!rl", name = "i", descriptor = "I")
    public static int field6255;

    @OriginalMember(owner = "client!rl", name = "k", descriptor = "I")
    public static int field6257;

    @OriginalMember(owner = "client!rl", name = "m", descriptor = "I")
    public static int field6259;

    @OriginalMember(owner = "client!rl", name = "n", descriptor = "I")
    public static int field6260;

    @OriginalMember(owner = "client!rl", name = "r", descriptor = "I")
    public static int field6264;

    @OriginalMember(owner = "client!rl", name = "t", descriptor = "I")
    public static int field6266;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(III)V")
    public final void method793(int arg0, int arg1, int arg2) {
        ++field6257;
        int var4 = this.field6256 * arg2 >> 12;
        int var5 = this.field6261 * arg2 >> 12;
        int var6 = this.field6265 * arg1 >> 12;
        if (arg0 != -1) {
            this.method793(12, -83, -61);
        }
        int var7 = this.field6263 * arg1 >> 12;
        class218.method1324(var4, (byte) 36, var6, super.field1376, var7, var5);
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(BII)V")
    public final void method795(byte arg0, int arg1, int arg2) {
        ++field6264;
        if (arg0 != -33) {
            method2777(12, -87, -108);
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIIIIB)V")
    public static final void method2775(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        ++field6266;
        int var6 = 0;
        int var7 = arg1;
        int var8 = arg0 * arg0;
        int var9 = arg1 * arg1;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg1 << 1;
        int var13 = (-var12 + 1) * var8 + var10;
        int var14 = -((var12 - 1) * var11) + var9;
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg1 << 1) + -3) * var11;
        int var19 = (var6 - -1) * var16;
        if (~arg4 <= ~class53.field624 && arg4 <= class118.field1356) {
            int var20 = class65.method376(class295.field3937, class427.field5844, arg0 + arg3, (byte) 82);
            int var21 = class65.method376(class295.field3937, class427.field5844, arg3 - arg0, (byte) -108);
            class384.method2394(arg2, 109, class228.field2877[arg4], var20, var21);
        }
        if (arg5 == -24) {
            int var22 = (arg1 + -1) * var15;
            while (var7 > 0) {
                if (~var13 > -1) {
                    while (~var13 > -1) {
                        var14 += var19;
                        var13 += var17;
                        var17 += var16;
                        ++var6;
                        var19 += var16;
                    }
                }
                if (var14 < 0) {
                    var13 += var17;
                    var14 += var19;
                    var17 += var16;
                    var19 += var16;
                    ++var6;
                }
                var14 += -var18;
                var13 += -var22;
                var22 -= var15;
                var18 -= var15;
                --var7;
                int var23 = -var7 + arg4;
                int var24 = arg4 + var7;
                if (class53.field624 <= var24 && ~var23 >= ~class118.field1356) {
                    int var25 = class65.method376(class295.field3937, class427.field5844, arg3 + var6, (byte) -99);
                    int var26 = class65.method376(class295.field3937, class427.field5844, -var6 + arg3, (byte) -40);
                    if (var23 >= class53.field624) {
                        class384.method2394(arg2, 117, class228.field2877[var23], var25, var26);
                    }
                    if (var24 <= class118.field1356) {
                        class384.method2394(arg2, arg5 + 151, class228.field2877[var24], var25, var26);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(Lbg;B)V")
    public static final void method2776(class242 arg0, byte arg1) {
        ++field6259;
        if (~(arg0.field3188.length + -arg0.field3211) <= -2) {
            int var2 = arg0.method1563(-128);
            if (~var2 <= -1 && var2 <= 15) {
                byte var3;
                if (~var2 != -16) {
                    if (var2 == 14) {
                        var3 = 36;
                    } else if (var2 != 13) {
                        if (var2 == 12) {
                            var3 = 34;
                        } else if (var2 != 11) {
                            if (~var2 == -11) {
                                var3 = 32;
                            } else if (var2 == 9) {
                                var3 = 31;
                            } else if (~var2 == -9) {
                                var3 = 30;
                            } else if (var2 == 7) {
                                var3 = 29;
                            } else if (var2 != 6) {
                                if (~var2 == -6) {
                                    var3 = 28;
                                } else if (var2 != 4) {
                                    if (var2 == 3) {
                                        var3 = 23;
                                    } else if (~var2 != -3) {
                                        if (~var2 == -2) {
                                            var3 = 23;
                                        } else {
                                            var3 = 19;
                                        }
                                    } else {
                                        var3 = 22;
                                    }
                                } else {
                                    var3 = 24;
                                }
                            } else {
                                var3 = 28;
                            }
                        } else {
                            var3 = 33;
                        }
                    } else {
                        var3 = 35;
                    }
                } else {
                    var3 = 37;
                }
                if (~var3 >= ~(arg0.field3188.length - arg0.field3211)) {
                    class2.field18 = arg0.method1563(-128);
                    if (~class2.field18 > -2) {
                        class2.field18 = 1;
                    } else if (class2.field18 > 4) {
                        class2.field18 = 4;
                    }
                    class181.method1134(~arg0.method1563(-128) == -2, (byte) -128);
                    class147.field1727 = arg0.method1563(-128) == 1;
                    class167.field1948 = arg0.method1563(-128) == 1;
                    class341.field4646 = ~arg0.method1563(-128) == -2;
                    class403.field5601 = arg0.method1563(-128) != 1 ? 0 : 1;
                    class40.field482 = arg0.method1563(-128) == 1;
                    class275.field3557 = ~arg0.method1563(-128) == -2;
                    class194.field2296 = ~arg0.method1563(-128) == -2;
                    class333.field4548 = arg0.method1563(-128);
                    if (class333.field4548 > 2) {
                        class333.field4548 = 2;
                    }
                    if (~var2 > -3) {
                        class252.field3298 = arg0.method1563(-128) == 1;
                        arg0.method1563(-128);
                    } else {
                        class252.field3298 = ~arg0.method1563(-128) == -2;
                    }
                    class183.field2125 = arg0.method1563(-128) == 1;
                    int var4 = 75 / ((-13 - arg1) / 38);
                    class20.field211 = ~arg0.method1563(-128) == -2;
                    class192.field2254 = arg0.method1563(-128);
                    if (class192.field2254 > 2) {
                        class192.field2254 = 2;
                    }
                    class414.field5684 = class192.field2254;
                    class373.field5049 = ~arg0.method1563(-128) == -2;
                    class96.field1136 = arg0.method1563(-128);
                    if (class96.field1136 > 127) {
                        class96.field1136 = 127;
                    }
                    class162.field1895 = arg0.method1563(-128);
                    class330.field4500 = arg0.method1563(-128);
                    if (~class330.field4500 < -128) {
                        class330.field4500 = 127;
                    }
                    if (var2 >= 1) {
                        class428.field5851 = arg0.method1587((byte) -102);
                        class244.field3249 = arg0.method1587((byte) -102);
                    }
                    if (var2 >= 3 && var2 < 6) {
                        arg0.method1563(-128);
                    }
                    if (var2 >= 4) {
                        int var5 = arg0.method1563(-128);
                        if (var5 < 0 || ~var5 < -3) {
                            var5 = 0;
                        }
                        if (~class105.field1254 > -97) {
                            var5 = 0;
                        }
                        class198.method1224((byte) -112, var5);
                    }
                    if (var2 >= 5) {
                        class201.field2374 = arg0.method1576((byte) 122);
                    }
                    int var6 = 0;
                    if (~var2 <= -7) {
                        class444.field6135 = var6 = arg0.method1563(-128);
                    }
                    if (class444.field6135 != 1 && class444.field6135 != 2) {
                        class444.field6135 = 2;
                    }
                    if (var2 >= 7) {
                        class11.field132 = ~arg0.method1563(-128) == -2;
                    }
                    if (~var2 <= -9) {
                        class244.field3246 = ~arg0.method1563(-128) == -2;
                    }
                    if (var2 >= 9) {
                        class276.field3580 = arg0.method1563(-128);
                    }
                    if (class276.field3580 < 0 || ~class276.field3580 < ~class150.method969(class105.field1254, 108)) {
                        class276.field3580 = 0;
                    }
                    if (var2 >= 10) {
                        class265.field3408 = ~arg0.method1563(-128) != -1;
                    }
                    if (var2 >= 11) {
                        class168.field1968 = arg0.method1563(-128) != 0;
                    }
                    if (~var2 <= -13) {
                        class403.field5601 = arg0.method1563(-128);
                    }
                    if (~class403.field5601 > -1 || class403.field5601 > 2) {
                        class403.field5601 = 1;
                    }
                    if (~var2 <= -14) {
                        class362.field4906 = ~arg0.method1563(-128) == -2;
                    }
                    if (var2 < 14) {
                        if (~var6 != -1) {
                            class121.field1382 = 1;
                        } else {
                            class121.field1382 = 2;
                        }
                    } else {
                        class121.field1382 = arg0.method1563(-128);
                    }
                    if (~class121.field1382 > -1 || class121.field1382 > 3) {
                        class121.field1382 = 2;
                    }
                    if (~var2 <= -16) {
                        class355.field4825 = arg0.method1563(-128);
                        if (class355.field4825 < 0 || ~class355.field4825 < -5) {
                            class355.field4825 = class427.field5845 == 1 ? 2 : 4;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IBI)V")
    public final void method796(int arg0, byte arg1, int arg2) {
        ++field6255;
        if (arg1 != -74) {
            field6258 = null;
        }
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(III)I")
    public static final int method2777(int arg0, int arg1, int arg2) {
        ++field6260;
        if (~arg1 != -5 && arg1 != 5) {
            return arg2 != 5 ? 14 : 256;
        } else {
            return class381.field5202[3 & arg0];
        }
    }

    @OriginalMember(owner = "client!rl", name = "<init>", descriptor = "(IIIIII)V")
    public class447(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field6265 = arg1;
        this.field6256 = arg0;
        this.field6261 = arg2;
        this.field6263 = arg3;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(B)V")
    public static void method2778(byte arg0) {
        field6258 = null;
        if (arg0 != 94) {
            field6262 = 0.3238907F;
        }
    }
}
