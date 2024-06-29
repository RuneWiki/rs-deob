import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class178 extends class229 {

    @OriginalMember(owner = "client!fi", name = "W", descriptor = "[B")
    public byte[] field2541;

    @OriginalMember(owner = "client!fi", name = "L", descriptor = "Lvr;")
    public static class306 field2531 = new class306();

    @OriginalMember(owner = "client!fi", name = "T", descriptor = "I")
    public static int field2538 = 0;

    @OriginalMember(owner = "client!fi", name = "Q", descriptor = "Ljava/lang/Boolean;")
    public static Boolean field2535 = Boolean.FALSE;

    @OriginalMember(owner = "client!fi", name = "G", descriptor = "I")
    public static int field2527;

    @OriginalMember(owner = "client!fi", name = "H", descriptor = "I")
    public static int field2528;

    @OriginalMember(owner = "client!fi", name = "J", descriptor = "I")
    public static int field2529;

    @OriginalMember(owner = "client!fi", name = "K", descriptor = "I")
    public int field2530;

    @OriginalMember(owner = "client!fi", name = "N", descriptor = "I")
    public int field2532;

    @OriginalMember(owner = "client!fi", name = "O", descriptor = "I")
    public static int field2533;

    @OriginalMember(owner = "client!fi", name = "P", descriptor = "I")
    public int field2534;

    @OriginalMember(owner = "client!fi", name = "R", descriptor = "I")
    public static int field2536;

    @OriginalMember(owner = "client!fi", name = "U", descriptor = "I")
    public int field2539;

    @OriginalMember(owner = "client!fi", name = "V", descriptor = "I")
    public static int field2540;

    @OriginalMember(owner = "client!fi", name = "S", descriptor = "Lvr;")
    public static class306 field2537;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIIII)V", line = 3)
    public final void method1279(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field2534 = arg2 - arg1;
        this.field2530 = arg3;
        this.field2532 = arg1;
        field2529++;
        if (arg0 != -1038867248) {
            this.field2532 = -116;
        }
        this.field2539 = arg4 - arg3;
    }

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "(I)V", line = 22)
    public final void method1280(int arg0) {
        field2536++;
        int var2 = -1;
        if (arg0 < 43) {
            this.method1279(-65, -59, -107, 2, 97);
        }
        int var3 = this.field2541.length - 8;
        while (var2 < var3) {
            var2++;
            this.field2541[var2] = 0;
            var2++;
            this.field2541[var2] = 0;
            var2++;
            this.field2541[var2] = 0;
            var2++;
            this.field2541[var2] = 0;
            var2++;
            this.field2541[var2] = 0;
            var2++;
            this.field2541[var2] = 0;
            var2++;
            this.field2541[var2] = 0;
            var2++;
            this.field2541[var2] = 0;
        }
        while (var2 < this.field2541.length - 1) {
            var2++;
            this.field2541[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "(I)V", line = 54)
    public static void method1281(int arg0) {
        field2537 = null;
        if (arg0 != 1242430288) {
            method1281(-31);
        }
        field2531 = null;
        field2535 = null;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 66)
    public static final void method1282(String arg0, int arg1) {
        field2533++;
        System.out.println("Bad " + arg0 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
        System.exit(arg1);
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIB)Z", line = 79)
    public final boolean method1283(int arg0, int arg1, byte arg2) {
        if (arg2 <= 93) {
            this.method1279(-128, -107, -125, -61, 21);
        }
        field2528++;
        return this.field2541.length >= arg0 * arg1;
    }

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(Lbv;II)V", line = 109)
    public class178(class282 arg0, int arg1, int arg2) {
        this.field2541 = new byte[arg1 * arg2];
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(IIIIIII)V", line = 119)
    public final void method1284(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2527++;
        int var8 = 0;
        if (arg2 != arg3) {
            var8 = (arg4 - arg5 << 16) / (arg3 - arg2);
        }
        if (arg1 != -1204862768) {
            return;
        }
        int var9 = 0;
        if (arg3 != arg6) {
            var9 = (arg0 - arg4 << 16) / (arg6 - arg3);
        }
        int var10 = 0;
        if (arg2 != arg6) {
            var10 = (arg5 - arg0 << 16) / (arg2 - arg6);
        }
        if (arg3 >= arg2 && arg6 >= arg2) {
            if (arg3 >= arg6) {
                int var11;
                int var12 = var11 = arg5 << 16;
                if (arg2 < 0) {
                    var11 -= arg2 * var8;
                    var12 -= arg2 * var10;
                    arg2 = 0;
                }
                int var13 = arg0 << 16;
                if (arg6 < 0) {
                    var13 -= arg6 * var9;
                    arg6 = 0;
                }
                if ((arg2 == arg6 || var8 <= var10) && (arg2 != arg6 || var9 <= var8)) {
                    int var17 = arg3 - arg6;
                    int var18 = arg6 - arg2;
                    int var19 = this.field2539 * arg2;
                    while (true) {
                        var18--;
                        if (var18 < 0) {
                            while (true) {
                                var17--;
                                if (var17 < 0) {
                                    return;
                                }
                                class395.method2426(0, var19, var11 >> 16, (byte) -34, this.field2541, var13 >> 16);
                                var13 += var9;
                                var19 += this.field2539;
                                var11 += var8;
                            }
                        }
                        class395.method2426(0, var19, var11 >> 16, (byte) -37, this.field2541, var12 >> 16);
                        var12 += var10;
                        var19 += this.field2539;
                        var11 += var8;
                    }
                } else {
                    int var14 = arg3 - arg6;
                    int var15 = arg6 - arg2;
                    int var16 = this.field2539 * arg2;
                    while (true) {
                        var15--;
                        if (var15 < 0) {
                            while (true) {
                                var14--;
                                if (var14 < 0) {
                                    return;
                                }
                                class395.method2426(0, var16, var13 >> 16, (byte) -23, this.field2541, var11 >> 16);
                                var11 += var8;
                                var13 += var9;
                                var16 += this.field2539;
                            }
                        }
                        class395.method2426(0, var16, var12 >> 16, (byte) -117, this.field2541, var11 >> 16);
                        var12 += var10;
                        var16 += this.field2539;
                        var11 += var8;
                    }
                }
            } else {
                int var20;
                int var21 = var20 = arg5 << 16;
                int var22 = arg4 << 16;
                if (arg2 < 0) {
                    var21 -= arg2 * var10;
                    var20 -= arg2 * var8;
                    arg2 = 0;
                }
                if (arg3 < 0) {
                    var22 -= arg3 * var9;
                    arg3 = 0;
                }
                if (arg2 != arg3 && var10 < var8 || arg2 == arg3 && var9 < var10) {
                    int var23 = arg6 - arg3;
                    int var24 = arg3 - arg2;
                    int var25 = this.field2539 * arg2;
                    while (true) {
                        var24--;
                        if (var24 < 0) {
                            while (true) {
                                var23--;
                                if (var23 < 0) {
                                    return;
                                }
                                class395.method2426(0, var25, var21 >> 16, (byte) -25, this.field2541, var22 >> 16);
                                var25 += this.field2539;
                                var21 += var10;
                                var22 += var9;
                            }
                        }
                        class395.method2426(0, var25, var21 >> 16, (byte) -89, this.field2541, var20 >> 16);
                        var20 += var8;
                        var21 += var10;
                        var25 += this.field2539;
                    }
                } else {
                    int var26 = arg6 - arg3;
                    int var27 = arg3 - arg2;
                    int var28 = this.field2539 * arg2;
                    while (true) {
                        var27--;
                        if (var27 < 0) {
                            while (true) {
                                var26--;
                                if (var26 < 0) {
                                    return;
                                }
                                class395.method2426(0, var28, var22 >> 16, (byte) -95, this.field2541, var21 >> 16);
                                var28 += this.field2539;
                                var22 += var9;
                                var21 += var10;
                            }
                        }
                        class395.method2426(0, var28, var20 >> 16, (byte) -11, this.field2541, var21 >> 16);
                        var28 += this.field2539;
                        var21 += var10;
                        var20 += var8;
                    }
                }
            }
        } else if (arg3 <= arg6) {
            if (arg2 > arg6) {
                int var29;
                int var30 = var29 = arg4 << 16;
                if (arg3 < 0) {
                    var29 -= arg3 * var9;
                    var30 -= arg3 * var8;
                    arg3 = 0;
                }
                int var31 = arg0 << 16;
                if (arg6 < 0) {
                    var31 -= arg6 * var10;
                    arg6 = 0;
                }
                if (arg3 != arg6 && var8 < var9 || arg3 == arg6 && var8 > var10) {
                    int var32 = arg2 - arg6;
                    int var33 = arg6 - arg3;
                    int var34 = this.field2539 * arg3;
                    while (true) {
                        var33--;
                        if (var33 < 0) {
                            while (true) {
                                var32--;
                                if (var32 < 0) {
                                    return;
                                }
                                class395.method2426(0, var34, var30 >> 16, (byte) -4, this.field2541, var31 >> 16);
                                var30 += var8;
                                var34 += this.field2539;
                                var31 += var10;
                            }
                        }
                        class395.method2426(0, var34, var30 >> 16, (byte) -9, this.field2541, var29 >> 16);
                        var30 += var8;
                        var34 += this.field2539;
                        var29 += var9;
                    }
                } else {
                    int var35 = arg2 - arg6;
                    int var36 = arg6 - arg3;
                    int var37 = this.field2539 * arg3;
                    while (true) {
                        var36--;
                        if (var36 < 0) {
                            while (true) {
                                var35--;
                                if (var35 < 0) {
                                    return;
                                }
                                class395.method2426(0, var37, var31 >> 16, (byte) -89, this.field2541, var30 >> 16);
                                var31 += var10;
                                var37 += this.field2539;
                                var30 += var8;
                            }
                        }
                        class395.method2426(0, var37, var29 >> 16, (byte) -126, this.field2541, var30 >> 16);
                        var29 += var9;
                        var37 += this.field2539;
                        var30 += var8;
                    }
                }
            } else {
                int var38;
                int var39 = var38 = arg4 << 16;
                if (arg3 < 0) {
                    var39 -= arg3 * var8;
                    var38 -= arg3 * var9;
                    arg3 = 0;
                }
                int var40 = arg5 << 16;
                if (arg2 < 0) {
                    var40 -= arg2 * var10;
                    arg2 = 0;
                }
                if (var9 > var8) {
                    int var41 = arg6 - arg2;
                    int var42 = arg2 - arg3;
                    int var43 = this.field2539 * arg3;
                    while (true) {
                        var42--;
                        if (var42 < 0) {
                            while (true) {
                                var41--;
                                if (var41 < 0) {
                                    return;
                                }
                                class395.method2426(0, var43, var40 >> 16, (byte) -22, this.field2541, var38 >> 16);
                                var38 += var9;
                                var40 += var10;
                                var43 += this.field2539;
                            }
                        }
                        class395.method2426(0, var43, var39 >> 16, (byte) -3, this.field2541, var38 >> 16);
                        var39 += var8;
                        var43 += this.field2539;
                        var38 += var9;
                    }
                } else {
                    int var44 = arg6 - arg2;
                    int var45 = arg2 - arg3;
                    int var46 = this.field2539 * arg3;
                    while (true) {
                        var45--;
                        if (var45 < 0) {
                            while (true) {
                                var44--;
                                if (var44 < 0) {
                                    return;
                                }
                                class395.method2426(0, var46, var38 >> 16, (byte) -99, this.field2541, var40 >> 16);
                                var40 += var10;
                                var46 += this.field2539;
                                var38 += var9;
                            }
                        }
                        class395.method2426(0, var46, var38 >> 16, (byte) -5, this.field2541, var39 >> 16);
                        var39 += var8;
                        var38 += var9;
                        var46 += this.field2539;
                    }
                }
            }
        } else if (arg2 >= arg3) {
            int var47;
            int var48 = var47 = arg0 << 16;
            int var49 = arg4 << 16;
            if (arg6 < 0) {
                var48 -= arg6 * var9;
                var47 -= arg6 * var10;
                arg6 = 0;
            }
            if (arg3 < 0) {
                var49 -= arg3 * var8;
                arg3 = 0;
            }
            if (var10 <= var9) {
                int var50 = arg2 - arg3;
                int var51 = arg3 - arg6;
                int var52 = this.field2539 * arg6;
                while (true) {
                    var51--;
                    if (var51 < 0) {
                        while (true) {
                            var50--;
                            if (var50 < 0) {
                                return;
                            }
                            class395.method2426(0, var52, var47 >> 16, (byte) -44, this.field2541, var49 >> 16);
                            var47 += var10;
                            var52 += this.field2539;
                            var49 += var8;
                        }
                    }
                    class395.method2426(0, var52, var47 >> 16, (byte) -61, this.field2541, var48 >> 16);
                    var52 += this.field2539;
                    var48 += var9;
                    var47 += var10;
                }
            } else {
                int var53 = arg2 - arg3;
                int var54 = arg3 - arg6;
                int var55 = this.field2539 * arg6;
                while (true) {
                    var54--;
                    if (var54 < 0) {
                        while (true) {
                            var53--;
                            if (var53 < 0) {
                                return;
                            }
                            class395.method2426(0, var55, var49 >> 16, (byte) -8, this.field2541, var47 >> 16);
                            var49 += var8;
                            var55 += this.field2539;
                            var47 += var10;
                        }
                    }
                    class395.method2426(0, var55, var48 >> 16, (byte) -128, this.field2541, var47 >> 16);
                    var55 += this.field2539;
                    var48 += var9;
                    var47 += var10;
                }
            }
        } else {
            int var56;
            int var57 = var56 = arg0 << 16;
            if (arg6 < 0) {
                var56 -= arg6 * var10;
                var57 -= arg6 * var9;
                arg6 = 0;
            }
            int var58 = arg5 << 16;
            if (arg2 < 0) {
                var58 -= arg2 * var8;
                arg2 = 0;
            }
            if (var10 <= var9) {
                int var59 = arg3 - arg2;
                int var60 = arg2 - arg6;
                int var61 = this.field2539 * arg6;
                while (true) {
                    var60--;
                    if (var60 < 0) {
                        while (true) {
                            var59--;
                            if (var59 < 0) {
                                return;
                            }
                            class395.method2426(0, var61, var58 >> 16, (byte) -28, this.field2541, var57 >> 16);
                            var61 += this.field2539;
                            var57 += var9;
                            var58 += var8;
                        }
                    }
                    class395.method2426(0, var61, var56 >> 16, (byte) -39, this.field2541, var57 >> 16);
                    var61 += this.field2539;
                    var56 += var10;
                    var57 += var9;
                }
            } else {
                int var62 = arg3 - arg2;
                int var63 = arg2 - arg6;
                int var64 = this.field2539 * arg6;
                while (true) {
                    var63--;
                    if (var63 < 0) {
                        while (true) {
                            var62--;
                            if (var62 < 0) {
                                return;
                            }
                            class395.method2426(0, var64, var57 >> 16, (byte) -86, this.field2541, var58 >> 16);
                            var58 += var8;
                            var57 += var9;
                            var64 += this.field2539;
                        }
                    }
                    class395.method2426(0, var64, var57 >> 16, (byte) -105, this.field2541, var56 >> 16);
                    var57 += var9;
                    var64 += this.field2539;
                    var56 += var10;
                }
            }
        }
    }
}
