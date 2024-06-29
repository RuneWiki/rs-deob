import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rea")
public class class190 extends class266 {

    @OriginalMember(owner = "client!rea", name = "p", descriptor = "[I")
    public static int[] field2807 = new int[8];

    @OriginalMember(owner = "client!rea", name = "l", descriptor = "Lpw;")
    public static class649 field2803 = new class649();

    @OriginalMember(owner = "client!rea", name = "t", descriptor = "[S")
    public static short[] field2811 = new short[256];

    @OriginalMember(owner = "client!rea", name = "k", descriptor = "I")
    public static int field2802;

    @OriginalMember(owner = "client!rea", name = "m", descriptor = "I")
    public static int field2804;

    @OriginalMember(owner = "client!rea", name = "n", descriptor = "I")
    public static int field2805;

    @OriginalMember(owner = "client!rea", name = "o", descriptor = "I")
    public static int field2806;

    @OriginalMember(owner = "client!rea", name = "q", descriptor = "I")
    public static int field2808;

    @OriginalMember(owner = "client!rea", name = "r", descriptor = "I")
    public static int field2809;

    @OriginalMember(owner = "client!rea", name = "s", descriptor = "I")
    public static int field2810;

    @OriginalMember(owner = "client!rea", name = "u", descriptor = "I")
    public static int field2812;

    @OriginalMember(owner = "client!rea", name = "g", descriptor = "(I)V", line = 9)
    public static void method1260(int arg0) {
        field2807 = null;
        if (arg0 != -1361) {
            method1261((byte) 2, 1.1193223F, -0.46955472F, 0.7563288F);
        }
        field2811 = null;
        field2803 = null;
    }

    @OriginalMember(owner = "client!rea", name = "d", descriptor = "(I)Z", line = 21)
    public final boolean method154(int arg0) {
        ++field2808;
        if (arg0 <= 101) {
            field2811 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(Z)V", line = 32)
    public final void method155(boolean arg0) {
        ++field2809;
        if (arg0) {
            this.method148(-26, true);
        }
    }

    @OriginalMember(owner = "client!rea", name = "<init>", descriptor = "(Lgj;)V", line = 42)
    public class190(class580 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(Lek;IB)V", line = 46)
    public final void method150(class467 arg0, int arg1, byte arg2) {
        super.field3785.method3232(false, arg0);
        if (arg2 > -56) {
            field2807 = null;
        }
        ++field2810;
        super.field3785.method3229(arg1, 12);
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(BFFF)I", line = 58)
    public static final int method1261(byte arg0, float arg1, float arg2, float arg3) {
        ++field2802;
        if (arg0 < 94) {
            field2811 = null;
        }
        float var4 = !(arg1 < 0.0F) ? arg1 : -arg1;
        float var5 = arg2 < 0.0F ? -arg2 : arg2;
        float var6 = !(arg3 < 0.0F) ? arg3 : -arg3;
        if (var5 > var4 && var5 > var6) {
            return !(arg2 > 0.0F) ? 1 : 0;
        } else if (var4 < var6 && var5 < var6) {
            return arg3 > 0.0F ? 2 : 3;
        } else {
            return arg1 > 0.0F ? 4 : 5;
        }
    }

    @OriginalMember(owner = "client!rea", name = "b", descriptor = "(IZ)V", line = 101)
    public final void method144(int arg0, boolean arg1) {
        ++field2805;
        if (arg0 != 1) {
            field2811 = null;
        }
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(Loa;ILfaa;II)V", line = 121)
    public static final void method1262(class638 arg0, int arg1, class140 arg2, int arg3, int arg4) {
        ++field2812;
        class212 var5 = arg2.method999((byte) -62, arg0);
        if (var5 != null) {
            if (arg3 == 5) {
                arg0.method442(arg1, arg4, arg2.field2121 + arg1, arg4 - -arg2.field2082);
                if (class124.field1722 != 2 && ~class124.field1722 != -6 && class609.field8472 != null) {
                    int var6;
                    int var7;
                    int var8;
                    int var9;
                    if (class670.field9445 == 4) {
                        var6 = (int) (-class646.field9167) & 16383;
                        var7 = 4096;
                        var8 = class264.field3734;
                        var9 = class30.field363;
                    } else {
                        var6 = 16383 & (int) (-class646.field9167) + class156.field2356;
                        var8 = class253.field3576.field509;
                        var9 = class253.field3576.field514;
                        var7 = -(class455.field6362 * 16) + 4096;
                    }
                    int var10 = var8 / 128 + 48 + -((class86.field1185 + -104) * 2);
                    int var11 = class526.field7212 * 4 + 48 - var9 / 128 - class526.field7212 * 2 - -208;
                    class609.field8472.method2658((float) arg2.field2121 / 2.0F + (float) arg1, (float) arg2.field2082 / 2.0F + (float) arg4, (float) var10, (float) var11, var7, var6 << 2, var5, arg1, arg4);
                    for (class108 var12 = (class108) class104.field1399.method1270((byte) -25); var12 != null; var12 = (class108) class104.field1399.method1282(0)) {
                        int var58 = var12.field1479;
                        int var59 = ((268423576 & class663.field9360.field3140[var58]) >> 14) - class511.field6989;
                        int var60 = (16383 & class663.field9360.field3140[var58]) - class124.field1726;
                        int var61 = var59 * 4 - -2 + -(var8 / 128);
                        int var62 = var60 * 4 + 2 + -(var9 / 128);
                        class192.method1275(var5, class663.field9360.field3135[var58], arg0, arg4, var62, arg2, arg1, arg3 + 16401, var61);
                    }
                    for (int var13 = 0; class693.field9732 > var13; ++var13) {
                        int var55 = class676.field9547[var13] * 4 - (var8 / 128 + -2);
                        int var56 = class123.field1692[var13] * 4 + 2 + -(var9 / 128);
                        class620 var57 = class164.field2499.method2013(class381.field5359[var13], false);
                        if (var57.field8623 != null) {
                            var57 = var57.method3450(arg3 ^ -123, class195.field2888);
                            if (var57 == null || ~var57.field8618 == 0) {
                                continue;
                            }
                        }
                        class192.method1275(var5, var57.field8618, arg0, arg4, var56, arg2, arg1, 16406, var55);
                    }
                    for (class435 var14 = (class435) class179.field2656.method2066(false); var14 != null; var14 = (class435) class179.field2656.method2062(-19704)) {
                        int var50 = (int) (3L & var14.field7311 >> 28);
                        if (~class131.field1794 == ~var50) {
                            int var51 = (int) (16383L & var14.field7311) - class511.field6989;
                            int var52 = -class124.field1726 + (int) (var14.field7311 >> 14 & 16383L);
                            int var53 = var51 * 4 + 2 - var8 / 128;
                            int var54 = var52 * 4 - -2 + -(var9 / 128);
                            class317.method1941(arg1, class486.field6754[0], var53, var5, var54, arg2, arg3 ^ 3268, arg4);
                        }
                    }
                    for (int var15 = 0; class602.field8365 > var15; ++var15) {
                        class178 var45 = (class178) class323.field4762.method2061(-17305, (long) class594.field8262[var15]);
                        if (var45 != null) {
                            class225 var46 = var45.field2634;
                            if (var46.method1437(5757) && ~class253.field3576.field520 == ~var46.field520) {
                                class161 var47 = var46.field3245;
                                if (var47 != null && var47.field2409 != null) {
                                    var47 = var47.method1114(class195.field2888, 0);
                                }
                                if (var47 != null && var47.field2451 && var47.field2433) {
                                    int var48 = var46.field509 / 128 + -(var8 / 128);
                                    int var49 = var46.field514 / 128 + -(var9 / 128);
                                    if (~var47.field2411 != 0) {
                                        class192.method1275(var5, var47.field2411, arg0, arg4, var49, arg2, arg1, arg3 + 16401, var48);
                                    } else {
                                        class317.method1941(arg1, class486.field6754[1], var48, var5, var49, arg2, arg3 ^ 3268, arg4);
                                    }
                                }
                            }
                        }
                    }
                    int var16 = class64.field851;
                    int[] var17 = class53.field759;
                    for (int var18 = 0; var16 > var18; ++var18) {
                        class286 var37 = class495.field6821[var17[var18]];
                        if (var37 != null && var37.method1726(5757) && class253.field3576 != var37 && class253.field3576.field520 == var37.field520) {
                            int var38 = var37.field509 / 128 + -(var8 / 128);
                            int var39 = var37.field514 / 128 + -(var9 / 128);
                            boolean var40 = false;
                            for (int var41 = 0; var41 < class372.field5293; ++var41) {
                                if (var37.field3975.equals(class129.field1779[var41]) && class575.field7734[var41] != 0) {
                                    var40 = true;
                                    break;
                                }
                            }
                            boolean var42 = false;
                            for (int var43 = 0; ~class473.field6605 < ~var43; ++var43) {
                                if (var37.field3975.equals(class623.field8674[var43].field5991)) {
                                    var42 = true;
                                    break;
                                }
                            }
                            boolean var44 = false;
                            if (~class253.field3576.field3988 != -1 && var37.field3988 != 0 && class253.field3576.field3988 == var37.field3988) {
                                var44 = true;
                            }
                            if (var37.field3983) {
                                class317.method1941(arg1, class486.field6754[6], var38, var5, var39, arg2, 3265, arg4);
                            } else if (var40) {
                                class317.method1941(arg1, class486.field6754[3], var38, var5, var39, arg2, 3265, arg4);
                            } else if (!var42) {
                                if (var44) {
                                    class317.method1941(arg1, class486.field6754[4], var38, var5, var39, arg2, arg3 + 3260, arg4);
                                } else {
                                    class317.method1941(arg1, class486.field6754[2], var38, var5, var39, arg2, 3265, arg4);
                                }
                            } else {
                                class317.method1941(arg1, class486.field6754[5], var38, var5, var39, arg2, 3265, arg4);
                            }
                        }
                    }
                    class375[] var19 = class652.field9219;
                    for (int var20 = 0; ~var19.length < ~var20; ++var20) {
                        class375 var23 = var19[var20];
                        if (var23 != null && ~var23.field5317 != -1 && class239.field3440 % 20 < 10) {
                            if (var23.field5317 == 1) {
                                class178 var24 = (class178) class323.field4762.method2061(arg3 + -17310, (long) var23.field5314);
                                if (var24 != null) {
                                    class225 var25 = var24.field2634;
                                    int var26 = var25.field509 / 128 + -(var8 / 128);
                                    int var27 = var25.field514 / 128 - var9 / 128;
                                    class406.method2315(arg1, var27, var5, (byte) 66, var26, arg2, var23.field5316, 360000L, arg4);
                                }
                            }
                            if (~var23.field5317 == -3) {
                                int var28 = var23.field5322 / 128 - var8 / 128;
                                int var29 = var23.field5310 / 128 + -(var9 / 128);
                                long var30 = (long) (var23.field5321 << 7);
                                long var32 = var30 * var30;
                                class406.method2315(arg1, var29, var5, (byte) 66, var28, arg2, var23.field5316, var32, arg4);
                            }
                            if (~var23.field5317 == -11 && ~var23.field5314 <= -1 && var23.field5314 < class495.field6821.length) {
                                class286 var34 = class495.field6821[var23.field5314];
                                if (var34 != null) {
                                    int var35 = var34.field509 / 128 - var8 / 128;
                                    int var36 = var34.field514 / 128 + -(var9 / 128);
                                    class406.method2315(arg1, var36, var5, (byte) 66, var35, arg2, var23.field5316, 360000L, arg4);
                                }
                            }
                        }
                    }
                    if (class670.field9445 != 4) {
                        if (class247.field3508 != 0) {
                            int var21 = -(var8 / 128) + class247.field3508 * 4 + 2 + 2 * (-1 + class253.field3576.method1722((byte) -119));
                            int var22 = class178.field2636 * 4 + 2 + (-(var9 / 128) - (2 + -(2 * class253.field3576.method1722((byte) -125))));
                            class317.method1941(arg1, class121.field1675[!class414.field5857 ? 0 : 1], var21, var5, var22, arg2, 3265, arg4);
                        }
                        arg0.method3558((byte) 107, arg4 - -(arg2.field2082 / 2) - 1, -1, 3, 3, arg1 - -(arg2.field2121 / 2) + -1);
                        return;
                    }
                } else {
                    arg0.method425(-16777216, var5, arg1, arg4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(IZ)V", line = 430)
    public final void method148(int arg0, boolean arg1) {
        ++field2804;
        if (arg0 != 0) {
            field2803 = null;
        }
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(III)V", line = 445)
    public final void method156(int arg0, int arg1, int arg2) {
        ++field2806;
        if (arg2 != 0) {
            this.method154(5);
        }
    }
}
