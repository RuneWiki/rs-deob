import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rr")
public class class332 extends class54 {

    @OriginalMember(owner = "client!rr", name = "M", descriptor = "[B")
    public byte[] field4419;

    @OriginalMember(owner = "client!rr", name = "K", descriptor = "Lwo;")
    public static class690 field4417 = new class690(63, 8);

    @OriginalMember(owner = "client!rr", name = "Q", descriptor = "[I")
    public static int[] field4423 = new int[2];

    @OriginalMember(owner = "client!rr", name = "B", descriptor = "I")
    public int field4409;

    @OriginalMember(owner = "client!rr", name = "C", descriptor = "I")
    public static int field4410;

    @OriginalMember(owner = "client!rr", name = "D", descriptor = "I")
    public int field4411;

    @OriginalMember(owner = "client!rr", name = "E", descriptor = "I")
    public static int field4412;

    @OriginalMember(owner = "client!rr", name = "F", descriptor = "I")
    public static int field4413;

    @OriginalMember(owner = "client!rr", name = "G", descriptor = "I")
    public int field4414;

    @OriginalMember(owner = "client!rr", name = "H", descriptor = "I")
    public static int field4415;

    @OriginalMember(owner = "client!rr", name = "J", descriptor = "I")
    public static int field4416;

    @OriginalMember(owner = "client!rr", name = "N", descriptor = "I")
    public static int field4420;

    @OriginalMember(owner = "client!rr", name = "O", descriptor = "I")
    public int field4421;

    @OriginalMember(owner = "client!rr", name = "P", descriptor = "I")
    public static int field4422;

    @OriginalMember(owner = "client!rr", name = "L", descriptor = "Ljr;")
    public static class94 field4418;

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(II)V")
    public static final void method1922(int arg0, int arg1) {
        field4415++;
        for (class513 var2 = class512.field7516.method3669((byte) 28); var2 != null; var2 = class512.field7516.method3676((byte) -12)) {
            if ((long) arg0 == (var2.field7519 >> 48 & 0xFFFFL)) {
                var2.method3045(true);
            }
        }
        if (arg1 < 14) {
            method1925(81);
        }
    }

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "(III)Z")
    public final boolean method1923(int arg0, int arg1, int arg2) {
        if (arg0 == 1617286384) {
            field4422++;
            return arg1 * arg2 <= this.field4419.length;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(IIIIIII)V")
    public final void method1924(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4420++;
        int var8 = 0;
        if (arg0 != arg4) {
            var8 = (arg2 - arg6 << 16) / (arg4 - arg0);
        }
        int var9 = 0;
        if (arg3 != arg4) {
            var9 = (arg5 - arg2 << 16) / (arg3 - arg4);
        }
        if (arg1 < 28) {
            method1922(-118, 78);
        }
        int var10 = 0;
        if (arg0 != arg3) {
            var10 = (arg6 - arg5 << 16) / (arg0 - arg3);
        }
        if (arg0 <= arg4 && arg3 >= arg0) {
            if (arg4 < arg3) {
                int var11;
                int var12 = var11 = arg6 << 16;
                int var13 = arg2 << 16;
                if (arg0 < 0) {
                    var12 -= arg0 * var10;
                    var11 -= arg0 * var8;
                    arg0 = 0;
                }
                if (arg4 < 0) {
                    var13 -= arg4 * var9;
                    arg4 = 0;
                }
                if (arg0 != arg4 && var8 > var10 || arg0 == arg4 && var9 < var10) {
                    int var14 = arg3 - arg4;
                    int var15 = arg4 - arg0;
                    int var16 = this.field4411 * arg0;
                    while (true) {
                        var15--;
                        if (var15 < 0) {
                            while (true) {
                                var14--;
                                if (var14 < 0) {
                                    return;
                                }
                                class409.method2472(this.field4419, var16, 0, var12 >> 16, var13 >> 16, true);
                                var16 += this.field4411;
                                var13 += var9;
                                var12 += var10;
                            }
                        }
                        class409.method2472(this.field4419, var16, 0, var12 >> 16, var11 >> 16, true);
                        var16 += this.field4411;
                        var11 += var8;
                        var12 += var10;
                    }
                } else {
                    int var17 = arg3 - arg4;
                    int var18 = arg4 - arg0;
                    int var19 = this.field4411 * arg0;
                    while (true) {
                        var18--;
                        if (var18 < 0) {
                            while (true) {
                                var17--;
                                if (var17 < 0) {
                                    return;
                                }
                                class409.method2472(this.field4419, var19, 0, var13 >> 16, var12 >> 16, true);
                                var12 += var10;
                                var19 += this.field4411;
                                var13 += var9;
                            }
                        }
                        class409.method2472(this.field4419, var19, 0, var11 >> 16, var12 >> 16, true);
                        var11 += var8;
                        var12 += var10;
                        var19 += this.field4411;
                    }
                }
            } else {
                int var20;
                int var21 = var20 = arg6 << 16;
                if (arg0 < 0) {
                    var20 -= arg0 * var8;
                    var21 -= arg0 * var10;
                    arg0 = 0;
                }
                int var22 = arg5 << 16;
                if (arg3 < 0) {
                    var22 -= arg3 * var9;
                    arg3 = 0;
                }
                if (arg0 != arg3 && var8 > var10 || arg0 == arg3 && var8 < var9) {
                    int var23 = arg4 - arg3;
                    int var24 = arg3 - arg0;
                    int var25 = this.field4411 * arg0;
                    while (true) {
                        var24--;
                        if (var24 < 0) {
                            while (true) {
                                var23--;
                                if (var23 < 0) {
                                    return;
                                }
                                class409.method2472(this.field4419, var25, 0, var22 >> 16, var20 >> 16, true);
                                var20 += var8;
                                var25 += this.field4411;
                                var22 += var9;
                            }
                        }
                        class409.method2472(this.field4419, var25, 0, var21 >> 16, var20 >> 16, true);
                        var21 += var10;
                        var20 += var8;
                        var25 += this.field4411;
                    }
                } else {
                    int var26 = arg4 - arg3;
                    int var27 = arg3 - arg0;
                    int var28 = this.field4411 * arg0;
                    while (true) {
                        var27--;
                        if (var27 < 0) {
                            while (true) {
                                var26--;
                                if (var26 < 0) {
                                    return;
                                }
                                class409.method2472(this.field4419, var28, 0, var20 >> 16, var22 >> 16, true);
                                var22 += var9;
                                var28 += this.field4411;
                                var20 += var8;
                            }
                        }
                        class409.method2472(this.field4419, var28, 0, var20 >> 16, var21 >> 16, true);
                        var20 += var8;
                        var28 += this.field4411;
                        var21 += var10;
                    }
                }
            }
        } else if (arg4 > arg3) {
            if (arg4 <= arg0) {
                int var29;
                int var30 = var29 = arg5 << 16;
                if (arg3 < 0) {
                    var29 -= arg3 * var10;
                    var30 -= arg3 * var9;
                    arg3 = 0;
                }
                int var31 = arg2 << 16;
                if (arg4 < 0) {
                    var31 -= arg4 * var8;
                    arg4 = 0;
                }
                if (var10 <= var9) {
                    int var32 = arg0 - arg4;
                    int var33 = arg4 - arg3;
                    int var34 = this.field4411 * arg3;
                    while (true) {
                        var33--;
                        if (var33 < 0) {
                            while (true) {
                                var32--;
                                if (var32 < 0) {
                                    return;
                                }
                                class409.method2472(this.field4419, var34, 0, var29 >> 16, var31 >> 16, true);
                                var31 += var8;
                                var34 += this.field4411;
                                var29 += var10;
                            }
                        }
                        class409.method2472(this.field4419, var34, 0, var29 >> 16, var30 >> 16, true);
                        var30 += var9;
                        var29 += var10;
                        var34 += this.field4411;
                    }
                } else {
                    int var35 = arg0 - arg4;
                    int var36 = arg4 - arg3;
                    int var37 = this.field4411 * arg3;
                    while (true) {
                        var36--;
                        if (var36 < 0) {
                            while (true) {
                                var35--;
                                if (var35 < 0) {
                                    return;
                                }
                                class409.method2472(this.field4419, var37, 0, var31 >> 16, var29 >> 16, true);
                                var37 += this.field4411;
                                var29 += var10;
                                var31 += var8;
                            }
                        }
                        class409.method2472(this.field4419, var37, 0, var30 >> 16, var29 >> 16, true);
                        var30 += var9;
                        var29 += var10;
                        var37 += this.field4411;
                    }
                }
            } else {
                int var38;
                int var39 = var38 = arg5 << 16;
                int var40 = arg6 << 16;
                if (arg3 < 0) {
                    var39 -= arg3 * var9;
                    var38 -= arg3 * var10;
                    arg3 = 0;
                }
                if (arg0 < 0) {
                    var40 -= arg0 * var8;
                    arg0 = 0;
                }
                if (var9 < var10) {
                    int var41 = arg4 - arg0;
                    int var42 = arg0 - arg3;
                    int var43 = this.field4411 * arg3;
                    while (true) {
                        var42--;
                        if (var42 < 0) {
                            while (true) {
                                var41--;
                                if (var41 < 0) {
                                    return;
                                }
                                class409.method2472(this.field4419, var43, 0, var39 >> 16, var40 >> 16, true);
                                var40 += var8;
                                var43 += this.field4411;
                                var39 += var9;
                            }
                        }
                        class409.method2472(this.field4419, var43, 0, var39 >> 16, var38 >> 16, true);
                        var38 += var10;
                        var39 += var9;
                        var43 += this.field4411;
                    }
                } else {
                    int var44 = arg4 - arg0;
                    int var45 = arg0 - arg3;
                    int var46 = this.field4411 * arg3;
                    while (true) {
                        var45--;
                        if (var45 < 0) {
                            while (true) {
                                var44--;
                                if (var44 < 0) {
                                    return;
                                }
                                class409.method2472(this.field4419, var46, 0, var40 >> 16, var39 >> 16, true);
                                var46 += this.field4411;
                                var39 += var9;
                                var40 += var8;
                            }
                        }
                        class409.method2472(this.field4419, var46, 0, var38 >> 16, var39 >> 16, true);
                        var39 += var9;
                        var38 += var10;
                        var46 += this.field4411;
                    }
                }
            }
        } else if (arg0 > arg3) {
            int var47;
            int var48 = var47 = arg2 << 16;
            int var49 = arg5 << 16;
            if (arg4 < 0) {
                var47 -= arg4 * var9;
                var48 -= arg4 * var8;
                arg4 = 0;
            }
            if (arg3 < 0) {
                var49 -= arg3 * var10;
                arg3 = 0;
            }
            if (arg3 != arg4 && var9 > var8 || arg3 == arg4 && var10 < var8) {
                int var50 = arg0 - arg3;
                int var51 = arg3 - arg4;
                int var52 = this.field4411 * arg4;
                while (true) {
                    var51--;
                    if (var51 < 0) {
                        while (true) {
                            var50--;
                            if (var50 < 0) {
                                return;
                            }
                            class409.method2472(this.field4419, var52, 0, var48 >> 16, var49 >> 16, true);
                            var48 += var8;
                            var52 += this.field4411;
                            var49 += var10;
                        }
                    }
                    class409.method2472(this.field4419, var52, 0, var48 >> 16, var47 >> 16, true);
                    var52 += this.field4411;
                    var47 += var9;
                    var48 += var8;
                }
            } else {
                int var53 = arg0 - arg3;
                int var54 = arg3 - arg4;
                int var55 = this.field4411 * arg4;
                while (true) {
                    var54--;
                    if (var54 < 0) {
                        while (true) {
                            var53--;
                            if (var53 < 0) {
                                return;
                            }
                            class409.method2472(this.field4419, var55, 0, var49 >> 16, var48 >> 16, true);
                            var48 += var8;
                            var49 += var10;
                            var55 += this.field4411;
                        }
                    }
                    class409.method2472(this.field4419, var55, 0, var47 >> 16, var48 >> 16, true);
                    var48 += var8;
                    var55 += this.field4411;
                    var47 += var9;
                }
            }
        } else {
            int var56;
            int var57 = var56 = arg2 << 16;
            int var58 = arg6 << 16;
            if (arg4 < 0) {
                var57 -= arg4 * var8;
                var56 -= arg4 * var9;
                arg4 = 0;
            }
            if (arg0 < 0) {
                var58 -= arg0 * var10;
                arg0 = 0;
            }
            if (var9 > var8) {
                int var59 = arg3 - arg0;
                int var60 = arg0 - arg4;
                int var61 = this.field4411 * arg4;
                while (true) {
                    var60--;
                    if (var60 < 0) {
                        while (true) {
                            var59--;
                            if (var59 < 0) {
                                return;
                            }
                            class409.method2472(this.field4419, var61, 0, var58 >> 16, var56 >> 16, true);
                            var58 += var10;
                            var56 += var9;
                            var61 += this.field4411;
                        }
                    }
                    class409.method2472(this.field4419, var61, 0, var57 >> 16, var56 >> 16, true);
                    var56 += var9;
                    var57 += var8;
                    var61 += this.field4411;
                }
            } else {
                int var62 = arg3 - arg0;
                int var63 = arg0 - arg4;
                int var64 = this.field4411 * arg4;
                while (true) {
                    var63--;
                    if (var63 < 0) {
                        while (true) {
                            var62--;
                            if (var62 < 0) {
                                return;
                            }
                            class409.method2472(this.field4419, var64, 0, var56 >> 16, var58 >> 16, true);
                            var58 += var10;
                            var64 += this.field4411;
                            var56 += var9;
                        }
                    }
                    class409.method2472(this.field4419, var64, 0, var56 >> 16, var57 >> 16, true);
                    var56 += var9;
                    var57 += var8;
                    var64 += this.field4411;
                }
            }
        }
    }

    @OriginalMember(owner = "client!rr", name = "g", descriptor = "(I)V")
    public static void method1925(int arg0) {
        if (arg0 == 0) {
            field4417 = null;
            field4418 = null;
            field4423 = null;
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(B)V")
    public final void method1926(byte arg0) {
        field4410++;
        int var2 = -1;
        int var3 = this.field4419.length - 8;
        if (arg0 < 125) {
            return;
        }
        while (var3 > var2) {
            var2++;
            this.field4419[var2] = 0;
            var2++;
            this.field4419[var2] = 0;
            var2++;
            this.field4419[var2] = 0;
            var2++;
            this.field4419[var2] = 0;
            var2++;
            this.field4419[var2] = 0;
            var2++;
            this.field4419[var2] = 0;
            var2++;
            this.field4419[var2] = 0;
            var2++;
            this.field4419[var2] = 0;
        }
        while (var2 < (this.field4419.length - 1)) {
            var2++;
            this.field4419[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(ZIIII)V")
    public final void method1927(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0) {
            field4416 = -67;
        }
        field4413++;
        this.field4414 = arg2;
        this.field4411 = arg1 - arg3;
        this.field4421 = arg4 - arg2;
        this.field4409 = arg3;
    }

    @OriginalMember(owner = "client!rr", name = "<init>", descriptor = "(Lifa;II)V")
    public class332(class393 arg0, int arg1, int arg2) {
        this.field4419 = new byte[arg1 * arg2];
    }
}
