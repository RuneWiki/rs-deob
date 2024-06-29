import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class165 implements class296 {

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "Z")
    public static boolean field2559 = false;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "I")
    public static int field2558 = 0;

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "I")
    public static int field2560;

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "I")
    public static int field2561;

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "I")
    public static int field2562;

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "I")
    public static int field2563;

    @OriginalMember(owner = "client!ac", name = "g", descriptor = "I")
    public static int field2564;

    @OriginalMember(owner = "client!ac", name = "h", descriptor = "I")
    public static int field2565;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(ZI)Z", line = 5)
    public static final boolean method1209(boolean arg0, int arg1) {
        if (arg0) {
            return true;
        } else {
            field2562++;
            return (arg1 & -arg1) == arg1;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIZII)V", line = 20)
    public static final void method1210(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field2564++;
        class269.field4191.field1667 = 0;
        class269.field4191.method772((byte) -93, 20);
        class269.field4191.method772((byte) -60, arg0);
        class269.field4191.method772((byte) -121, arg4);
        class269.field4191.method728(arg1, 1234856744);
        class269.field4191.method728(arg3, 1234856744);
        class316.field4932 = 1;
        class231.field3671 = -3;
        class279.field4313 = 0;
        class70.field1113 = 0;
        if (arg2) {
            method1212(-21);
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "([IIIJ)Ljava/lang/String;", line = 40)
    public final String method1211(int[] arg0, int arg1, int arg2, long arg3) {
        field2565++;
        if (arg1 == 0) {
            class268 var6 = class84.method604(arg0[0], (byte) 106);
            return var6.method1923((int) arg3, 4);
        } else if (arg1 == 1 || arg1 == 10) {
            class179 var7 = class208.method1521(-1361, (int) arg3);
            return var7.field2825;
        } else if (arg2 == 1139) {
            return arg1 == 6 || arg1 == 7 || arg1 == 11 ? class84.method604(arg0[0], (byte) 68).method1923((int) arg3, 4) : null;
        } else {
            return (String) null;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)V", line = 77)
    public static final void method1212(int arg0) {
        if (arg0 != -673854809) {
            method1210(-50, -56, false, 79, 45);
        }
        class181.field2897.method1832((byte) 110);
        class215.field3431.method1832((byte) 23);
        field2563++;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIIZ[Lsj;I[B)V", line = 90)
    public static final void method1213(int arg0, int arg1, int arg2, int arg3, boolean arg4, class56[] arg5, int arg6, byte[] arg7) {
        field2561++;
        if (!arg4) {
            for (int var8 = 0; var8 < 4; var8++) {
                for (int var9 = 0; var9 < 64; var9++) {
                    for (int var10 = 0; var10 < 64; var10++) {
                        if ((arg2 + var9) > 0 && (arg2 + var9) < 103 && (arg1 + var10) > 0 && arg1 + var10 < 103) {
                            arg5[var8].field879[arg2 + var9][arg1 + var10] = class280.method2001(arg5[var8].field879[arg2 + var9][arg1 + var10], -16777217);
                        }
                    }
                }
            }
        }
        byte var11;
        if (arg4) {
            var11 = 1;
        } else {
            var11 = 4;
        }
        class101 var12 = new class101(arg7);
        if (arg6 != -105) {
            return;
        }
        for (int var13 = 0; var13 < var11; var13++) {
            for (int var14 = 0; var14 < 64; var14++) {
                for (int var15 = 0; var15 < 64; var15++) {
                    class292.method2043(arg3, arg4, arg2 + var14, var12, 0, var13, arg0, arg1 + var15, (byte) 115);
                }
            }
        }
        boolean var16 = false;
        while (var12.field1667 < var12.field1661.length) {
            int var17 = var12.method741(arg6 ^ 0xFFFFFF81);
            if (var17 != 129) {
                var12.field1667--;
                break;
            }
            var16 = true;
            for (int var18 = 0; var18 < 4; var18++) {
                byte var19 = var12.method727((byte) 127);
                if (var19 == 0) {
                    int var29 = arg2;
                    if (arg2 < 0) {
                        var29 = 0;
                    } else if (arg2 >= 104) {
                        var29 = 104;
                    }
                    int var30 = arg1;
                    if (arg1 < 0) {
                        var30 = 0;
                    } else if (arg1 >= 104) {
                        var30 = 104;
                    }
                    int var31 = arg2 + 64;
                    int var32 = arg1 + 64;
                    if (var32 < 0) {
                        var32 = 0;
                    } else if (var32 >= 104) {
                        var32 = 104;
                    }
                    if (var31 < 0) {
                        var31 = 0;
                    } else if (var31 >= 104) {
                        var31 = 104;
                    }
                    while (var29 < var31) {
                        while (var30 < var32) {
                            class75.field1152[var18][var29][var30] = 0;
                            var30++;
                        }
                        var29++;
                    }
                } else if (var19 == 1) {
                    for (int var24 = 0; var24 < 64; var24 += 4) {
                        for (int var25 = 0; var25 < 64; var25 += 4) {
                            byte var26 = var12.method727((byte) 115);
                            for (int var27 = arg2 + var24; var27 < (var24 + arg2 + 4); var27++) {
                                for (int var28 = arg1 + var25; var28 < (var25 - (-arg1 - 4)); var28++) {
                                    if (var27 >= 0 && var27 < 104 && var28 >= 0 && var28 < 104) {
                                        class75.field1152[var18][var27][var28] = var26;
                                    }
                                }
                            }
                        }
                    }
                } else if (var19 == 2 && var18 > 0) {
                    int var20 = arg2;
                    if (arg2 < 0) {
                        var20 = 0;
                    } else if (arg2 >= 104) {
                        var20 = 104;
                    }
                    int var21 = arg2 + 64;
                    if (var21 < 0) {
                        var21 = 0;
                    } else if (var21 >= 104) {
                        var21 = 104;
                    }
                    int var22 = arg1;
                    if (arg1 < 0) {
                        var22 = 0;
                    } else if (arg1 >= 104) {
                        var22 = 104;
                    }
                    int var23 = arg1 + 64;
                    if (var23 < 0) {
                        var23 = 0;
                    } else if (var23 >= 104) {
                        var23 = 104;
                    }
                    while (var21 > var20) {
                        while (var22 < var23) {
                            class75.field1152[var18][var20][var22] = class75.field1152[var18 - 1][var20][var22];
                            var22++;
                        }
                        var20++;
                    }
                }
            }
        }
        if (class265.field4126 && !arg4) {
            class124 var33 = null;
            while (true) {
                while (var12.field1661.length > var12.field1667) {
                    int var34 = var12.method741(48);
                    if (var34 == 0) {
                        var33 = new class124(var12);
                    } else if (var34 == 1) {
                        int var35 = var12.method741(8);
                        if (var35 > 0) {
                            for (int var36 = 0; var36 < var35; var36++) {
                                class306 var37 = new class306(var12);
                                if (var37.field4809 == 31) {
                                    class111 var38 = class77.method568(var12.method731(false), arg6 - 29656);
                                    var37.method2117(arg6 ^ 0xFFFFFFE3, var38.field1841, var38.field1838, var38.field1845, var38.field1844);
                                }
                                var37.field4816 += arg2 << 7;
                                var37.field4792 += arg1 << 7;
                                int var39 = var37.field4816 >> 7;
                                int var40 = var37.field4792 >> 7;
                                if (var39 >= 0 && var40 >= 0 && var39 < 104 && var40 < 104) {
                                    var37.field4799 = (class250.field3857[1][var39][var40] & 0x2) != 0;
                                    var37.field4810 = class29.field475[var37.field4819][var39][var40] - var37.field4810;
                                    class38.method312(var37);
                                }
                            }
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                }
                if (var33 == null) {
                    var33 = new class124();
                }
                for (int var41 = 0; var41 < 8; var41++) {
                    for (int var42 = 0; var42 < 8; var42++) {
                        int var43 = (arg2 >> 3) + var41;
                        int var44 = (arg1 >> 3) + var42;
                        if (var43 >= 0 && var43 < 13 && var44 >= 0 && var44 < 13) {
                            class259.field4026[var43][var44] = var33;
                        }
                    }
                }
                break;
            }
        }
        if (var16) {
            return;
        }
        for (int var45 = 0; var45 < 4; var45++) {
            for (int var46 = 0; var46 < 16; var46++) {
                for (int var47 = 0; var47 < 16; var47++) {
                    int var48 = (arg2 >> 2) + var46;
                    int var49 = (arg1 >> 2) + var47;
                    if (var48 >= 0 && var48 < 26 && var49 >= 0 && var49 < 26) {
                        class75.field1152[var45][var48][var49] = 0;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(BLja;)V", line = 483)
    public static final void method1214(byte arg0, class64 arg1) {
        if (arg0 >= -51) {
            field2559 = true;
        }
        field2560++;
        class178.field2788 = arg1;
    }
}
