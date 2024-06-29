import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wga")
public class class750 extends class183 {

    @OriginalMember(owner = "client!wga", name = "M", descriptor = "[B")
    public byte[] field10489;

    @OriginalMember(owner = "client!wga", name = "L", descriptor = "Z")
    public static boolean field10488 = false;

    @OriginalMember(owner = "client!wga", name = "H", descriptor = "Lqe;")
    public static class469 field10484 = new class469(18, 2);

    @OriginalMember(owner = "client!wga", name = "G", descriptor = "I")
    public static int field10483;

    @OriginalMember(owner = "client!wga", name = "I", descriptor = "I")
    public static int field10485;

    @OriginalMember(owner = "client!wga", name = "J", descriptor = "I")
    public static int field10486;

    @OriginalMember(owner = "client!wga", name = "K", descriptor = "I")
    public int field10487;

    @OriginalMember(owner = "client!wga", name = "N", descriptor = "I")
    public static int field10490;

    @OriginalMember(owner = "client!wga", name = "P", descriptor = "I")
    public static int field10492;

    @OriginalMember(owner = "client!wga", name = "Q", descriptor = "I")
    public int field10493;

    @OriginalMember(owner = "client!wga", name = "R", descriptor = "I")
    public int field10494;

    @OriginalMember(owner = "client!wga", name = "S", descriptor = "I")
    public int field10495;

    @OriginalMember(owner = "client!wga", name = "O", descriptor = "Lpga;")
    public static class536 field10491;

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(III)Z", line = 3)
    public final boolean method4183(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            method4184(52, -65, 55, 62, (byte) 119, true, -32);
        }
        field10485++;
        return this.field10489.length >= (arg0 * arg1);
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(IIIIBZI)V", line = 24)
    public static final void method4184(int arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5, int arg6) {
        class240.field3489 = arg2;
        class601.field8509 = arg0;
        class345.field4991 = arg3;
        class71.field1008 = arg6;
        field10492++;
        class396.field5946 = arg1;
        if (arg4 != -116) {
            return;
        }
        if (arg5 && class345.field4991 >= 100) {
            class364.field5254 = class396.field5946 * 512 + 256;
            class460.field6783 = class601.field8509 * 512 + 256;
            class259.field3700 = class384.method2468(true, class364.field5254, class341.field4946, class460.field6783) - class240.field3489;
        }
        class264.field3784 = 2;
        class67.field967 = -1;
        class656.field9191 = -1;
    }

    @OriginalMember(owner = "client!wga", name = "b", descriptor = "(Z)V", line = 50)
    public static void method4185(boolean arg0) {
        if (arg0) {
            field10484 = null;
            field10491 = null;
        }
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(I)V", line = 67)
    public final void method4186(int arg0) {
        field10483++;
        int var2 = -1;
        int var3 = this.field10489.length - 8;
        while (var3 > var2) {
            var2++;
            this.field10489[var2] = 0;
            var2++;
            this.field10489[var2] = 0;
            var2++;
            this.field10489[var2] = 0;
            var2++;
            this.field10489[var2] = 0;
            var2++;
            this.field10489[var2] = 0;
            var2++;
            this.field10489[var2] = 0;
            var2++;
            this.field10489[var2] = 0;
            var2++;
            this.field10489[var2] = 0;
        }
        if (arg0 != 30976) {
            this.method4186(-86);
        }
        while (this.field10489.length - 1 > var2) {
            var2++;
            this.field10489[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(IIIIB)V", line = 97)
    public final void method4187(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        this.field10495 = arg2;
        this.field10494 = arg1 - arg0;
        this.field10493 = arg3 - arg2;
        this.field10487 = arg0;
        field10486++;
        if (arg4 >= -71) {
            this.field10493 = 113;
        }
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(IIIZIII)V", line = 115)
    public final void method4188(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        field10490++;
        int var8 = 0;
        if (!arg3) {
            this.field10487 = -9;
        }
        if (arg2 != arg4) {
            var8 = (arg6 - arg0 << 16) / (arg2 - arg4);
        }
        int var9 = 0;
        if (arg1 != arg2) {
            var9 = (arg5 - arg6 << 16) / (arg1 - arg2);
        }
        int var10 = 0;
        if (arg1 != arg4) {
            var10 = (arg0 - arg5 << 16) / (arg4 - arg1);
        }
        if (arg4 <= arg2 && arg1 >= arg4) {
            if (arg1 > arg2) {
                int var11;
                int var12 = var11 = arg0 << 16;
                if (arg4 < 0) {
                    var12 -= arg4 * var10;
                    var11 -= arg4 * var8;
                    arg4 = 0;
                }
                int var13 = arg6 << 16;
                if (arg2 < 0) {
                    var13 -= arg2 * var9;
                    arg2 = 0;
                }
                if (arg2 != arg4 && var8 > var10 || arg2 == arg4 && var9 < var10) {
                    int var14 = arg1 - arg2;
                    int var15 = arg2 - arg4;
                    int var16 = this.field10494 * arg4;
                    while (true) {
                        var15--;
                        if (var15 < 0) {
                            while (true) {
                                var14--;
                                if (var14 < 0) {
                                    return;
                                }
                                class295.method1868(var16, 0, 100, var12 >> 16, this.field10489, var13 >> 16);
                                var12 += var10;
                                var16 += this.field10494;
                                var13 += var9;
                            }
                        }
                        class295.method1868(var16, 0, 100, var12 >> 16, this.field10489, var11 >> 16);
                        var11 += var8;
                        var12 += var10;
                        var16 += this.field10494;
                    }
                } else {
                    int var17 = arg1 - arg2;
                    int var18 = arg2 - arg4;
                    int var19 = this.field10494 * arg4;
                    while (true) {
                        var18--;
                        if (var18 < 0) {
                            while (true) {
                                var17--;
                                if (var17 < 0) {
                                    return;
                                }
                                class295.method1868(var19, 0, 100, var13 >> 16, this.field10489, var12 >> 16);
                                var19 += this.field10494;
                                var12 += var10;
                                var13 += var9;
                            }
                        }
                        class295.method1868(var19, 0, 100, var11 >> 16, this.field10489, var12 >> 16);
                        var11 += var8;
                        var12 += var10;
                        var19 += this.field10494;
                    }
                }
            } else {
                int var20;
                int var21 = var20 = arg0 << 16;
                if (arg4 < 0) {
                    var21 -= arg4 * var10;
                    var20 -= arg4 * var8;
                    arg4 = 0;
                }
                int var22 = arg5 << 16;
                if (arg1 < 0) {
                    var22 -= arg1 * var9;
                    arg1 = 0;
                }
                if (arg1 != arg4 && var8 > var10 || arg1 == arg4 && var9 > var8) {
                    int var23 = arg2 - arg1;
                    int var24 = arg1 - arg4;
                    int var25 = this.field10494 * arg4;
                    while (true) {
                        var24--;
                        if (var24 < 0) {
                            while (true) {
                                var23--;
                                if (var23 < 0) {
                                    return;
                                }
                                class295.method1868(var25, 0, 100, var22 >> 16, this.field10489, var20 >> 16);
                                var22 += var9;
                                var20 += var8;
                                var25 += this.field10494;
                            }
                        }
                        class295.method1868(var25, 0, 100, var21 >> 16, this.field10489, var20 >> 16);
                        var20 += var8;
                        var25 += this.field10494;
                        var21 += var10;
                    }
                } else {
                    int var26 = arg2 - arg1;
                    int var27 = arg1 - arg4;
                    int var28 = this.field10494 * arg4;
                    while (true) {
                        var27--;
                        if (var27 < 0) {
                            while (true) {
                                var26--;
                                if (var26 < 0) {
                                    return;
                                }
                                class295.method1868(var28, 0, 100, var20 >> 16, this.field10489, var22 >> 16);
                                var28 += this.field10494;
                                var20 += var8;
                                var22 += var9;
                            }
                        }
                        class295.method1868(var28, 0, 100, var20 >> 16, this.field10489, var21 >> 16);
                        var20 += var8;
                        var21 += var10;
                        var28 += this.field10494;
                    }
                }
            }
        } else if (arg1 >= arg2) {
            if (arg4 <= arg1) {
                int var29;
                int var30 = var29 = arg6 << 16;
                int var31 = arg0 << 16;
                if (arg2 < 0) {
                    var30 -= arg2 * var8;
                    var29 -= arg2 * var9;
                    arg2 = 0;
                }
                if (arg4 < 0) {
                    var31 -= arg4 * var10;
                    arg4 = 0;
                }
                if (var8 >= var9) {
                    int var32 = arg1 - arg4;
                    int var33 = arg4 - arg2;
                    int var34 = this.field10494 * arg2;
                    while (true) {
                        var33--;
                        if (var33 < 0) {
                            while (true) {
                                var32--;
                                if (var32 < 0) {
                                    return;
                                }
                                class295.method1868(var34, 0, 100, var29 >> 16, this.field10489, var31 >> 16);
                                var31 += var10;
                                var34 += this.field10494;
                                var29 += var9;
                            }
                        }
                        class295.method1868(var34, 0, 100, var29 >> 16, this.field10489, var30 >> 16);
                        var34 += this.field10494;
                        var30 += var8;
                        var29 += var9;
                    }
                } else {
                    int var35 = arg1 - arg4;
                    int var36 = arg4 - arg2;
                    int var37 = this.field10494 * arg2;
                    while (true) {
                        var36--;
                        if (var36 < 0) {
                            while (true) {
                                var35--;
                                if (var35 < 0) {
                                    return;
                                }
                                class295.method1868(var37, 0, 100, var31 >> 16, this.field10489, var29 >> 16);
                                var37 += this.field10494;
                                var29 += var9;
                                var31 += var10;
                            }
                        }
                        class295.method1868(var37, 0, 100, var30 >> 16, this.field10489, var29 >> 16);
                        var30 += var8;
                        var29 += var9;
                        var37 += this.field10494;
                    }
                }
            } else {
                int var38;
                int var39 = var38 = arg6 << 16;
                if (arg2 < 0) {
                    var39 -= arg2 * var8;
                    var38 -= arg2 * var9;
                    arg2 = 0;
                }
                int var40 = arg5 << 16;
                if (arg1 < 0) {
                    var40 -= arg1 * var10;
                    arg1 = 0;
                }
                if (arg1 != arg2 && var8 < var9 || arg1 == arg2 && var8 > var10) {
                    int var41 = arg4 - arg1;
                    int var42 = arg1 - arg2;
                    int var43 = this.field10494 * arg2;
                    while (true) {
                        var42--;
                        if (var42 < 0) {
                            while (true) {
                                var41--;
                                if (var41 < 0) {
                                    return;
                                }
                                class295.method1868(var43, 0, 100, var39 >> 16, this.field10489, var40 >> 16);
                                var43 += this.field10494;
                                var39 += var8;
                                var40 += var10;
                            }
                        }
                        class295.method1868(var43, 0, 100, var39 >> 16, this.field10489, var38 >> 16);
                        var38 += var9;
                        var39 += var8;
                        var43 += this.field10494;
                    }
                } else {
                    int var44 = arg4 - arg1;
                    int var45 = arg1 - arg2;
                    int var46 = this.field10494 * arg2;
                    while (true) {
                        var45--;
                        if (var45 < 0) {
                            while (true) {
                                var44--;
                                if (var44 < 0) {
                                    return;
                                }
                                class295.method1868(var46, 0, 100, var40 >> 16, this.field10489, var39 >> 16);
                                var46 += this.field10494;
                                var40 += var10;
                                var39 += var8;
                            }
                        }
                        class295.method1868(var46, 0, 100, var38 >> 16, this.field10489, var39 >> 16);
                        var39 += var8;
                        var46 += this.field10494;
                        var38 += var9;
                    }
                }
            }
        } else if (arg4 >= arg2) {
            int var47;
            int var48 = var47 = arg5 << 16;
            int var49 = arg6 << 16;
            if (arg1 < 0) {
                var48 -= arg1 * var9;
                var47 -= arg1 * var10;
                arg1 = 0;
            }
            if (arg2 < 0) {
                var49 -= arg2 * var8;
                arg2 = 0;
            }
            if (var9 >= var10) {
                int var50 = arg4 - arg2;
                int var51 = arg2 - arg1;
                int var52 = this.field10494 * arg1;
                while (true) {
                    var51--;
                    if (var51 < 0) {
                        while (true) {
                            var50--;
                            if (var50 < 0) {
                                return;
                            }
                            class295.method1868(var52, 0, 100, var47 >> 16, this.field10489, var49 >> 16);
                            var49 += var8;
                            var47 += var10;
                            var52 += this.field10494;
                        }
                    }
                    class295.method1868(var52, 0, 100, var47 >> 16, this.field10489, var48 >> 16);
                    var48 += var9;
                    var52 += this.field10494;
                    var47 += var10;
                }
            } else {
                int var53 = arg4 - arg2;
                int var54 = arg2 - arg1;
                int var55 = this.field10494 * arg1;
                while (true) {
                    var54--;
                    if (var54 < 0) {
                        while (true) {
                            var53--;
                            if (var53 < 0) {
                                return;
                            }
                            class295.method1868(var55, 0, 100, var49 >> 16, this.field10489, var47 >> 16);
                            var47 += var10;
                            var55 += this.field10494;
                            var49 += var8;
                        }
                    }
                    class295.method1868(var55, 0, 100, var48 >> 16, this.field10489, var47 >> 16);
                    var47 += var10;
                    var48 += var9;
                    var55 += this.field10494;
                }
            }
        } else {
            int var56;
            int var57 = var56 = arg5 << 16;
            int var58 = arg0 << 16;
            if (arg1 < 0) {
                var56 -= arg1 * var10;
                var57 -= arg1 * var9;
                arg1 = 0;
            }
            if (arg4 < 0) {
                var58 -= arg4 * var8;
                arg4 = 0;
            }
            if (var10 > var9) {
                int var59 = arg2 - arg4;
                int var60 = arg4 - arg1;
                int var61 = this.field10494 * arg1;
                while (true) {
                    var60--;
                    if (var60 < 0) {
                        while (true) {
                            var59--;
                            if (var59 < 0) {
                                return;
                            }
                            class295.method1868(var61, 0, 100, var57 >> 16, this.field10489, var58 >> 16);
                            var58 += var8;
                            var57 += var9;
                            var61 += this.field10494;
                        }
                    }
                    class295.method1868(var61, 0, 100, var57 >> 16, this.field10489, var56 >> 16);
                    var56 += var10;
                    var57 += var9;
                    var61 += this.field10494;
                }
            } else {
                int var62 = arg2 - arg4;
                int var63 = arg4 - arg1;
                int var64 = this.field10494 * arg1;
                while (true) {
                    var63--;
                    if (var63 < 0) {
                        while (true) {
                            var62--;
                            if (var62 < 0) {
                                return;
                            }
                            class295.method1868(var64, 0, 100, var58 >> 16, this.field10489, var57 >> 16);
                            var64 += this.field10494;
                            var58 += var8;
                            var57 += var9;
                        }
                    }
                    class295.method1868(var64, 0, 100, var56 >> 16, this.field10489, var57 >> 16);
                    var56 += var10;
                    var57 += var9;
                    var64 += this.field10494;
                }
            }
        }
    }

    @OriginalMember(owner = "client!wga", name = "<init>", descriptor = "(Lwu;II)V", line = 559)
    public class750(class373 arg0, int arg1, int arg2) {
        this.field10489 = new byte[arg1 * arg2];
    }
}
