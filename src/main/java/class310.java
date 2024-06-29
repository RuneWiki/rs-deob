import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class310 extends class220 {

    @OriginalMember(owner = "client!vi", name = "P", descriptor = "Lcn;")
    public static class411 field4436 = new class411();

    @OriginalMember(owner = "client!vi", name = "S", descriptor = "I")
    public static int field4439 = 20;

    @OriginalMember(owner = "client!vi", name = "T", descriptor = "[J")
    public static long[] field4440 = new long[100];

    @OriginalMember(owner = "client!vi", name = "U", descriptor = "[I")
    public static int[] field4441 = new int[] { 0, 64, 128, 128, 128, 64, 0, 0, 32, 64, 32, 96, 64 };

    @OriginalMember(owner = "client!vi", name = "Q", descriptor = "I")
    public static int field4437;

    @OriginalMember(owner = "client!vi", name = "R", descriptor = "I")
    public static int field4438;

    @OriginalMember(owner = "client!vi", name = "V", descriptor = "Lnr;")
    public static class437 field4442;

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "()V", line = 3)
    public class310() {
        super(0, true);
    }

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "(II)[I", line = 6)
    public final int[] method43(int arg0, int arg1) {
        ++field4438;
        int[] var3 = super.field3125.method2005(arg1, (byte) -118);
        if (arg0 != -11543) {
            return null;
        } else {
            if (super.field3125.field4676) {
                class111.method769(var3, 0, class344.field5043, class58.field831[arg1]);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!vi", name = "f", descriptor = "(B)V", line = 31)
    public static void method1936(byte arg0) {
        if (arg0 != 54) {
            field4439 = 10;
        }
        field4441 = null;
        field4442 = null;
        field4436 = null;
        field4440 = null;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(ILnr;ZBII[Lbi;[BII)[I", line = 46)
    public static final int[] method1937(int arg0, class437 arg1, boolean arg2, byte arg3, int arg4, int arg5, class138[] arg6, byte[] arg7, int arg8, int arg9) {
        ++field4437;
        if (!arg2) {
            for (int var10 = 0; ~var10 > -5; ++var10) {
                class138 var11 = arg6[var10];
                for (int var12 = 0; ~var12 > -65; ++var12) {
                    for (int var13 = 0; ~var13 > -65; ++var13) {
                        int var14 = arg0 - -var12;
                        int var15 = arg9 + var13;
                        if (~var14 <= -1 && var14 < class324.field4652 && var15 >= 0 && ~var15 > ~class336.field4964) {
                            var11.method926(true, var14, var15);
                        }
                    }
                }
            }
        }
        class265 var16 = new class265(arg7);
        int var17 = arg4 - -arg0;
        int var18 = arg8 - -arg9;
        for (int var19 = 0; arg5 > var19; ++var19) {
            for (int var55 = 0; ~var55 > -65; ++var55) {
                for (int var56 = 0; var56 < 64; ++var56) {
                    class79.method498(arg2, var18 - -var56, false, arg0 + var55, 0, false, var16, var19, 0, 0, arg9 + var56, var17 + var55);
                }
            }
        }
        if (arg3 != 82) {
            return null;
        } else {
            boolean var20 = false;
            boolean var21 = false;
            while (~var16.field3915 > ~var16.field3879.length) {
                int var22 = var16.method1697(arg3 ^ 50);
                if (~var22 == -129) {
                    class176.field2310[0] = var16.method1685(arg3 + 8022);
                    class176.field2310[1] = var16.method1698(class347.method2311(arg3, 1625555026));
                    class176.field2310[2] = var16.method1698(1625554944);
                    class176.field2310[3] = var16.method1698(1625554944);
                    class176.field2310[4] = var16.method1685(8104);
                    var20 = true;
                } else {
                    if (var22 != 129) {
                        --var16.field3915;
                        break;
                    }
                    if (class193.field2750 == null) {
                        class193.field2750 = new byte[4][][];
                    }
                    for (int var40 = 0; ~var40 > -5; ++var40) {
                        byte var41 = var16.method1708((byte) 127);
                        if (~var41 == -1 && class193.field2750[var40] != null) {
                            int var42 = arg0;
                            int var43 = arg0 - -64;
                            int var44 = arg9;
                            if (arg9 < 0) {
                                var44 = 0;
                            } else if (arg9 >= class336.field4964) {
                                var44 = class336.field4964;
                            }
                            if (~var43 <= -1) {
                                if (var43 >= class324.field4652) {
                                    var43 = class324.field4652;
                                }
                            } else {
                                var43 = 0;
                            }
                            int var45 = arg9 + 64;
                            if (arg0 >= 0) {
                                if (class324.field4652 <= arg0) {
                                    var42 = class324.field4652;
                                }
                            } else {
                                var42 = 0;
                            }
                            if (var45 >= 0) {
                                if (class336.field4964 <= var45) {
                                    var45 = class336.field4964;
                                }
                            } else {
                                var45 = 0;
                            }
                            while (var43 > var42) {
                                while (~var44 > ~var45) {
                                    class193.field2750[var40][var42][var44] = 0;
                                    ++var44;
                                }
                                ++var42;
                            }
                        } else if (~var41 != -2) {
                            if (~var41 == -3) {
                                if (class193.field2750[var40] == null) {
                                    class193.field2750[var40] = new byte[class324.field4652 - -1][class336.field4964 - -1];
                                }
                                if (~var40 < -1) {
                                    int var46 = arg0;
                                    int var47 = arg0 - -64;
                                    int var48 = arg9;
                                    if (arg0 < 0) {
                                        var46 = 0;
                                    } else if (~arg0 <= ~class324.field4652) {
                                        var46 = class324.field4652;
                                    }
                                    if (~var47 > -1) {
                                        var47 = 0;
                                    } else if (class324.field4652 <= var47) {
                                        var47 = class324.field4652;
                                    }
                                    if (~arg9 <= -1) {
                                        if (~arg9 <= ~class336.field4964) {
                                            var48 = class336.field4964;
                                        }
                                    } else {
                                        var48 = 0;
                                    }
                                    int var49 = arg9 + 64;
                                    if (~var49 <= -1) {
                                        if (class336.field4964 <= var49) {
                                            var49 = class336.field4964;
                                        }
                                    } else {
                                        var49 = 0;
                                    }
                                    while (~var47 < ~var46) {
                                        while (var49 > var48) {
                                            class193.field2750[var40][var46][var48] = class193.field2750[var40 + -1][var46][var48];
                                            ++var48;
                                        }
                                        ++var46;
                                    }
                                }
                            }
                        } else {
                            if (class193.field2750[var40] == null) {
                                class193.field2750[var40] = new byte[class324.field4652 + 1][class336.field4964 - -1];
                            }
                            for (int var50 = 0; ~var50 > -65; var50 += 4) {
                                for (int var51 = 0; ~var51 > -65; var51 += 4) {
                                    byte var52 = var16.method1708((byte) 127);
                                    for (int var53 = arg0 + var50; var53 < var50 + 4 + arg0; ++var53) {
                                        for (int var54 = arg9 + var51; ~var54 > ~(var51 - -arg9 + 4); ++var54) {
                                            if (var53 >= 0 && class324.field4652 > var53 && var54 >= 0 && class336.field4964 > var54) {
                                                class193.field2750[var40][var53][var54] = var52;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    var21 = true;
                }
            }
            if (!arg2) {
                class262 var23 = null;
                while (true) {
                    while (var16.field3879.length > var16.field3915) {
                        int var28 = var16.method1697(58);
                        if (~var28 == -1) {
                            var23 = new class262(var16);
                        } else if (~var28 == -2) {
                            int var29 = var16.method1697(84);
                            if (~var29 < -1) {
                                for (int var30 = 0; ~var30 > ~var29; ++var30) {
                                    class413 var31 = new class413(var16);
                                    if (~var31.field6186 == -32) {
                                        class232 var32 = class405.method2642(var16.method1685(arg3 + 8022), 2);
                                        var31.method2678(var32.field3267, var32.field3270, -108, var32.field3281, var32.field3282);
                                    }
                                    var31.field5990 += arg9 << 7;
                                    var31.field5994 += arg0 << 7;
                                    int var33 = var31.field5994 >> 7;
                                    int var34 = var31.field5990 >> 7;
                                    if (~var33 <= -1 && ~var34 <= -1 && ~class324.field4652 < ~var33 && class336.field4964 > var34) {
                                        var31.field5984 = class128.field1703[var31.field6171][var33][var34] - var31.field5984;
                                        if (arg1.method2110() > 0) {
                                            class38.method300(var31);
                                        }
                                    }
                                }
                            }
                        } else {
                            if (~var28 != -3) {
                                throw new IllegalStateException();
                            }
                            if (var23 == null) {
                                var23 = new class262();
                            }
                            var23.method1644(8, var16);
                        }
                    }
                    if (var23 != null) {
                        for (int var24 = 0; var24 < 8; ++var24) {
                            for (int var25 = 0; ~var25 > -9; ++var25) {
                                int var26 = (arg0 >> 3) + var24;
                                int var27 = (arg9 >> 3) + var25;
                                if (var26 >= 0 && ~var26 > ~(class324.field4652 >> 3) && var27 >= 0 && ~(class336.field4964 >> 3) < ~var27) {
                                    class130.method888(var26, var27, true, var23);
                                }
                            }
                        }
                    }
                    break;
                }
            }
            if (!var21 && class193.field2750 != null) {
                for (int var35 = 0; var35 < 4; ++var35) {
                    if (class193.field2750[var35] != null) {
                        for (int var36 = 0; var36 < 16; ++var36) {
                            for (int var37 = 0; ~var37 > -17; ++var37) {
                                int var38 = (arg0 >> 2) + var36;
                                int var39 = (arg9 >> 2) - -var37;
                                if (~var38 <= -1 && ~var38 > -27 && var39 >= 0 && ~var39 > -27) {
                                    class193.field2750[var35][var38][var39] = 0;
                                }
                            }
                        }
                    }
                }
            }
            if (!var20) {
                return null;
            } else {
                return class176.field2310;
            }
        }
    }
}
