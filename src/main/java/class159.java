import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public class class159 extends class78 {

    @OriginalMember(owner = "client!sm", name = "F", descriptor = "[B")
    public byte[] field2505;

    @OriginalMember(owner = "client!sm", name = "G", descriptor = "Lik;")
    public static class259 field2506 = new class259(64);

    @OriginalMember(owner = "client!sm", name = "J", descriptor = "Lea;")
    public static class204 field2509 = new class204();

    @OriginalMember(owner = "client!sm", name = "O", descriptor = "I")
    public static int field2514 = 0;

    @OriginalMember(owner = "client!sm", name = "N", descriptor = "I")
    public static int field2513 = 0;

    @OriginalMember(owner = "client!sm", name = "H", descriptor = "I")
    public static int field2507;

    @OriginalMember(owner = "client!sm", name = "I", descriptor = "I")
    public static int field2508;

    @OriginalMember(owner = "client!sm", name = "K", descriptor = "I")
    public static int field2510;

    @OriginalMember(owner = "client!sm", name = "L", descriptor = "Lja;")
    public static class64 field2511;

    @OriginalMember(owner = "client!sm", name = "M", descriptor = "Lja;")
    public static class64 field2512;

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(IIIIB)V", line = 10)
    public static final void method1189(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field2510++;
        if (arg1 - arg3 >= class319.field4965 && arg1 + arg3 <= class116.field1888 && class188.field2995 <= (arg0 - arg3) && class195.field3108 >= arg0 + arg3) {
            class73.method553(arg2, 114, arg1, arg0, arg3);
        } else {
            class252.method1781((byte) 109, arg3, arg0, arg2, arg1);
        }
        if (arg4 != -82) {
            field2511 = (class64) null;
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(B)V", line = 29)
    public static void method1190(byte arg0) {
        field2511 = null;
        field2506 = null;
        if (arg0 <= 2) {
            method1191(115, false, 3, (class56[]) null, 25, -123, 62, -17, (byte[]) null, 66, 101);
        }
        field2509 = null;
        field2512 = null;
    }

    @OriginalMember(owner = "client!sm", name = "<init>", descriptor = "([B)V", line = 40)
    public class159(byte[] arg0) {
        this.field2505 = arg0;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(IZI[Lsj;IIII[BII)V", line = 57)
    public static final void method1191(int arg0, boolean arg1, int arg2, class56[] arg3, int arg4, int arg5, int arg6, int arg7, byte[] arg8, int arg9, int arg10) {
        field2507++;
        if (!arg1) {
            for (int var11 = 0; var11 < 8; var11++) {
                for (int var12 = 0; var12 < 8; var12++) {
                    if (arg10 + var11 > 0 && (arg10 + var11) < 103 && arg2 + var12 > 0 && (arg2 + var12) < 103) {
                        arg3[arg7].field879[arg10 + var11][arg2 + var12] = class280.method2001(arg3[arg7].field879[arg10 + var11][arg2 + var12], -16777217);
                    }
                }
            }
        }
        byte var13;
        if (arg1) {
            var13 = 1;
        } else {
            var13 = 4;
        }
        class101 var14 = new class101(arg8);
        int var15 = 0;
        if (arg0 != 64) {
            return;
        }
        while (var13 > var15) {
            for (int var16 = 0; var16 < 64; var16++) {
                for (int var17 = 0; var17 < 64; var17++) {
                    if (arg9 == var15 && arg4 <= var16 && arg4 + 8 > var16 && var17 >= arg6 && arg6 + 8 > var17) {
                        class292.method2043(0, arg1, class43.method350((byte) 53, arg5, var16 & 0x7, var17 & 0x7) + arg10, var14, arg5, arg7, 0, arg2 + class196.method1431(0, var16 & 0x7, var17 & 0x7, arg5), (byte) 54);
                    } else {
                        class292.method2043(0, arg1, -1, var14, 0, 0, 0, -1, (byte) 51);
                    }
                }
            }
            var15++;
        }
        while (var14.field1661.length > var14.field1667) {
            int var18 = var14.method741(63);
            if (var18 != 129) {
                var14.field1667--;
                break;
            }
            for (int var19 = 0; var19 < 4; var19++) {
                byte var20 = var14.method727((byte) 117);
                if (var20 == 0) {
                    if (var19 <= arg9) {
                        int var28 = arg2;
                        int var29 = arg10;
                        int var30 = arg2 + 7;
                        if (arg2 < 0) {
                            var28 = 0;
                        } else if (arg2 >= 104) {
                            var28 = 104;
                        }
                        if (var30 < 0) {
                            var30 = 0;
                        } else if (var30 >= 104) {
                            var30 = 104;
                        }
                        if (arg10 < 0) {
                            var29 = 0;
                        } else if (arg10 >= 104) {
                            var29 = 104;
                        }
                        int var31 = arg10 + 7;
                        if (var31 < 0) {
                            var31 = 0;
                        } else if (var31 >= 104) {
                            var31 = 104;
                        }
                        while (var29 < var31) {
                            while (var30 > var28) {
                                class75.field1152[arg7][var29][var28] = 0;
                                var28++;
                            }
                            var29++;
                        }
                    }
                } else if (var20 == 1) {
                    for (int var21 = 0; var21 < 64; var21 += 4) {
                        for (int var22 = 0; var22 < 64; var22 += 4) {
                            byte var23 = var14.method727((byte) 125);
                            if (var19 <= arg9) {
                                for (int var24 = var21; var24 < (var21 + 4); var24++) {
                                    for (int var25 = var22; var25 < (var22 + 4); var25++) {
                                        if (var24 >= arg4 && arg4 + 8 > var24 && arg6 <= var25 && (arg6 + 8) > arg6) {
                                            int var26 = class43.method350((byte) 53, arg5, var24 & 0x7, var25 & 0x7) + arg10;
                                            int var27 = arg2 + class196.method1431(arg0 - 64, var24 & 0x7, var25 & 0x7, arg5);
                                            if (var26 >= 0 && var26 < 104 && var27 >= 0 && var27 < 104) {
                                                class75.field1152[arg7][var26][var27] = var23;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else if (var20 == 2) {
                }
            }
        }
        boolean var32 = false;
        if (class265.field4126 && !arg1) {
            class124 var33 = null;
            while (true) {
                while (var14.field1661.length > var14.field1667) {
                    int var34 = var14.method741(62);
                    if (var34 == 0) {
                        var33 = new class124(var14);
                    } else if (var34 == 1) {
                        int var35 = var14.method741(arg0 + 31);
                        if (var35 > 0) {
                            for (int var36 = 0; var36 < var35; var36++) {
                                class306 var37 = new class306(var14);
                                if (var37.field4809 == 31) {
                                    class111 var38 = class77.method568(var14.method731(false), -29761);
                                    var37.method2117(122, var38.field1841, var38.field1838, var38.field1845, var38.field1844);
                                }
                                int var39 = var37.field4816 >> 7;
                                int var40 = var37.field4792 >> 7;
                                if (var37.field4819 == arg9 && arg4 <= var39 && var39 < (arg4 + 8) && var40 >= arg6 && arg6 + 8 > var40) {
                                    int var41 = (arg10 << 7) + class68.method517(arg5, (byte) -3, var37.field4816 & 0x3FF, var37.field4792 & 0x3FF);
                                    int var42 = (arg2 << 7) + class13.method115(0, var37.field4792 & 0x3FF, arg5, var37.field4816 & 0x3FF);
                                    var37.field4792 = var42;
                                    int var43 = var37.field4792 >> 7;
                                    var37.field4816 = var41;
                                    int var44 = var37.field4816 >> 7;
                                    if (var44 >= 0 && var43 >= 0 && var44 < 104 && var43 < 104) {
                                        var37.field4799 = (class250.field3857[1][var44][var43] & 0x2) != 0;
                                        var37.field4810 = class29.field475[var37.field4819][var44][var43] - var37.field4810;
                                        class38.method312(var37);
                                    }
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
                class259.field4026[arg10 >> 3][arg2 >> 3] = var33;
                break;
            }
        }
        if (var32) {
            return;
        }
        int var45 = arg10 + 7;
        int var46 = arg2 + 7;
        for (int var47 = arg10; var47 < var45; var47++) {
            for (int var48 = arg2; var48 < var46; var48++) {
                class75.field1152[arg7][var47][var48] = 0;
            }
        }
    }
}
