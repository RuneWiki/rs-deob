import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hs")
public class class330 extends class184 {

    @OriginalMember(owner = "client!hs", name = "E", descriptor = "[B")
    public byte[] field4705;

    @OriginalMember(owner = "client!hs", name = "N", descriptor = "[I")
    public static int[] field4714 = new int[13];

    @OriginalMember(owner = "client!hs", name = "M", descriptor = "Lvm;")
    public static class687 field4713 = new class687();

    @OriginalMember(owner = "client!hs", name = "A", descriptor = "I")
    public int field4703;

    @OriginalMember(owner = "client!hs", name = "D", descriptor = "I")
    public static int field4704;

    @OriginalMember(owner = "client!hs", name = "F", descriptor = "I")
    public int field4706;

    @OriginalMember(owner = "client!hs", name = "G", descriptor = "I")
    public static int field4707;

    @OriginalMember(owner = "client!hs", name = "H", descriptor = "I")
    public int field4708;

    @OriginalMember(owner = "client!hs", name = "I", descriptor = "I")
    public int field4709;

    @OriginalMember(owner = "client!hs", name = "J", descriptor = "I")
    public static int field4710;

    @OriginalMember(owner = "client!hs", name = "K", descriptor = "I")
    public static int field4711;

    @OriginalMember(owner = "client!hs", name = "L", descriptor = "I")
    public static int field4712;

    @OriginalMember(owner = "client!hs", name = "O", descriptor = "I")
    public static int field4715;

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(IIIIIII)V", line = 5)
    public final void method1991(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4707++;
        int var8 = 0;
        if (arg1 != arg6) {
            var8 = (arg0 - arg3 << 16) / (arg6 - arg1);
        }
        int var9 = 0;
        if (arg4 != arg6) {
            var9 = (arg5 - arg0 << 16) / (arg4 - arg6);
        }
        int var10 = 0;
        if (arg2 != -2745) {
            this.field4708 = -50;
        }
        if (arg1 != arg4) {
            var10 = (arg3 - arg5 << 16) / (arg1 - arg4);
        }
        if (arg1 <= arg6 && arg4 >= arg1) {
            if (arg6 >= arg4) {
                int var11;
                int var12 = var11 = arg3 << 16;
                if (arg1 < 0) {
                    var12 -= arg1 * var10;
                    var11 -= arg1 * var8;
                    arg1 = 0;
                }
                int var13 = arg5 << 16;
                if (arg4 < 0) {
                    var13 -= arg4 * var9;
                    arg4 = 0;
                }
                if (arg1 != arg4 && var8 > var10 || arg1 == arg4 && var9 > var8) {
                    int var14 = arg6 - arg4;
                    int var15 = arg4 - arg1;
                    int var16 = this.field4708 * arg1;
                    while (true) {
                        var15--;
                        if (var15 < 0) {
                            while (true) {
                                var14--;
                                if (var14 < 0) {
                                    return;
                                }
                                class722.method4060(this.field4705, var13 >> 16, var16, 0, 14286, var11 >> 16);
                                var16 += this.field4708;
                                var11 += var8;
                                var13 += var9;
                            }
                        }
                        class722.method4060(this.field4705, var12 >> 16, var16, 0, 14286, var11 >> 16);
                        var12 += var10;
                        var16 += this.field4708;
                        var11 += var8;
                    }
                } else {
                    int var17 = arg6 - arg4;
                    int var18 = arg4 - arg1;
                    int var19 = this.field4708 * arg1;
                    while (true) {
                        var18--;
                        if (var18 < 0) {
                            while (true) {
                                var17--;
                                if (var17 < 0) {
                                    return;
                                }
                                class722.method4060(this.field4705, var11 >> 16, var19, 0, arg2 ^ 0xFFFFC289, var13 >> 16);
                                var13 += var9;
                                var11 += var8;
                                var19 += this.field4708;
                            }
                        }
                        class722.method4060(this.field4705, var11 >> 16, var19, 0, 14286, var12 >> 16);
                        var11 += var8;
                        var12 += var10;
                        var19 += this.field4708;
                    }
                }
            } else {
                int var20;
                int var21 = var20 = arg3 << 16;
                if (arg1 < 0) {
                    var20 -= arg1 * var8;
                    var21 -= arg1 * var10;
                    arg1 = 0;
                }
                int var22 = arg0 << 16;
                if (arg6 < 0) {
                    var22 -= arg6 * var9;
                    arg6 = 0;
                }
                if (arg1 != arg6 && var10 < var8 || arg1 == arg6 && var10 > var9) {
                    int var23 = arg4 - arg6;
                    int var24 = arg6 - arg1;
                    int var25 = this.field4708 * arg1;
                    while (true) {
                        var24--;
                        if (var24 < 0) {
                            while (true) {
                                var23--;
                                if (var23 < 0) {
                                    return;
                                }
                                class722.method4060(this.field4705, var21 >> 16, var25, 0, 14286, var22 >> 16);
                                var21 += var10;
                                var25 += this.field4708;
                                var22 += var9;
                            }
                        }
                        class722.method4060(this.field4705, var21 >> 16, var25, 0, 14286, var20 >> 16);
                        var20 += var8;
                        var21 += var10;
                        var25 += this.field4708;
                    }
                } else {
                    int var26 = arg4 - arg6;
                    int var27 = arg6 - arg1;
                    int var28 = this.field4708 * arg1;
                    while (true) {
                        var27--;
                        if (var27 < 0) {
                            while (true) {
                                var26--;
                                if (var26 < 0) {
                                    return;
                                }
                                class722.method4060(this.field4705, var22 >> 16, var28, 0, 14286, var21 >> 16);
                                var28 += this.field4708;
                                var22 += var9;
                                var21 += var10;
                            }
                        }
                        class722.method4060(this.field4705, var20 >> 16, var28, 0, 14286, var21 >> 16);
                        var21 += var10;
                        var20 += var8;
                        var28 += this.field4708;
                    }
                }
            }
        } else if (arg6 > arg4) {
            if (arg1 >= arg6) {
                int var29;
                int var30 = var29 = arg5 << 16;
                int var31 = arg0 << 16;
                if (arg4 < 0) {
                    var30 -= arg4 * var9;
                    var29 -= arg4 * var10;
                    arg4 = 0;
                }
                if (arg6 < 0) {
                    var31 -= arg6 * var8;
                    arg6 = 0;
                }
                if (var9 >= var10) {
                    int var32 = arg1 - arg6;
                    int var33 = arg6 - arg4;
                    int var34 = this.field4708 * arg4;
                    while (true) {
                        var33--;
                        if (var33 < 0) {
                            while (true) {
                                var32--;
                                if (var32 < 0) {
                                    return;
                                }
                                class722.method4060(this.field4705, var29 >> 16, var34, 0, 14286, var31 >> 16);
                                var34 += this.field4708;
                                var29 += var10;
                                var31 += var8;
                            }
                        }
                        class722.method4060(this.field4705, var29 >> 16, var34, 0, 14286, var30 >> 16);
                        var29 += var10;
                        var34 += this.field4708;
                        var30 += var9;
                    }
                } else {
                    int var35 = arg1 - arg6;
                    int var36 = arg6 - arg4;
                    int var37 = this.field4708 * arg4;
                    while (true) {
                        var36--;
                        if (var36 < 0) {
                            while (true) {
                                var35--;
                                if (var35 < 0) {
                                    return;
                                }
                                class722.method4060(this.field4705, var31 >> 16, var37, 0, arg2 ^ 0xFFFFC289, var29 >> 16);
                                var37 += this.field4708;
                                var31 += var8;
                                var29 += var10;
                            }
                        }
                        class722.method4060(this.field4705, var30 >> 16, var37, 0, arg2 + 17031, var29 >> 16);
                        var30 += var9;
                        var29 += var10;
                        var37 += this.field4708;
                    }
                }
            } else {
                int var38;
                int var39 = var38 = arg5 << 16;
                if (arg4 < 0) {
                    var39 -= arg4 * var9;
                    var38 -= arg4 * var10;
                    arg4 = 0;
                }
                int var40 = arg3 << 16;
                if (arg1 < 0) {
                    var40 -= arg1 * var8;
                    arg1 = 0;
                }
                if (var10 <= var9) {
                    int var41 = arg6 - arg1;
                    int var42 = arg1 - arg4;
                    int var43 = this.field4708 * arg4;
                    while (true) {
                        var42--;
                        if (var42 < 0) {
                            while (true) {
                                var41--;
                                if (var41 < 0) {
                                    return;
                                }
                                class722.method4060(this.field4705, var40 >> 16, var43, 0, 14286, var39 >> 16);
                                var39 += var9;
                                var43 += this.field4708;
                                var40 += var8;
                            }
                        }
                        class722.method4060(this.field4705, var38 >> 16, var43, 0, 14286, var39 >> 16);
                        var43 += this.field4708;
                        var38 += var10;
                        var39 += var9;
                    }
                } else {
                    int var44 = arg6 - arg1;
                    int var45 = arg1 - arg4;
                    int var46 = this.field4708 * arg4;
                    while (true) {
                        var45--;
                        if (var45 < 0) {
                            while (true) {
                                var44--;
                                if (var44 < 0) {
                                    return;
                                }
                                class722.method4060(this.field4705, var39 >> 16, var46, 0, 14286, var40 >> 16);
                                var39 += var9;
                                var46 += this.field4708;
                                var40 += var8;
                            }
                        }
                        class722.method4060(this.field4705, var39 >> 16, var46, 0, 14286, var38 >> 16);
                        var46 += this.field4708;
                        var38 += var10;
                        var39 += var9;
                    }
                }
            }
        } else if (arg1 <= arg4) {
            int var47;
            int var48 = var47 = arg0 << 16;
            int var49 = arg3 << 16;
            if (arg6 < 0) {
                var47 -= arg6 * var9;
                var48 -= arg6 * var8;
                arg6 = 0;
            }
            if (arg1 < 0) {
                var49 -= arg1 * var10;
                arg1 = 0;
            }
            if (var8 < var9) {
                int var50 = arg4 - arg1;
                int var51 = arg1 - arg6;
                int var52 = this.field4708 * arg6;
                while (true) {
                    var51--;
                    if (var51 < 0) {
                        while (true) {
                            var50--;
                            if (var50 < 0) {
                                return;
                            }
                            class722.method4060(this.field4705, var49 >> 16, var52, 0, 14286, var47 >> 16);
                            var49 += var10;
                            var47 += var9;
                            var52 += this.field4708;
                        }
                    }
                    class722.method4060(this.field4705, var48 >> 16, var52, 0, 14286, var47 >> 16);
                    var52 += this.field4708;
                    var47 += var9;
                    var48 += var8;
                }
            } else {
                int var53 = arg4 - arg1;
                int var54 = arg1 - arg6;
                int var55 = this.field4708 * arg6;
                while (true) {
                    var54--;
                    if (var54 < 0) {
                        while (true) {
                            var53--;
                            if (var53 < 0) {
                                return;
                            }
                            class722.method4060(this.field4705, var47 >> 16, var55, 0, arg2 ^ 0xFFFFC289, var49 >> 16);
                            var47 += var9;
                            var55 += this.field4708;
                            var49 += var10;
                        }
                    }
                    class722.method4060(this.field4705, var47 >> 16, var55, 0, 14286, var48 >> 16);
                    var47 += var9;
                    var55 += this.field4708;
                    var48 += var8;
                }
            }
        } else {
            int var56;
            int var57 = var56 = arg0 << 16;
            if (arg6 < 0) {
                var57 -= arg6 * var8;
                var56 -= arg6 * var9;
                arg6 = 0;
            }
            int var58 = arg5 << 16;
            if (arg4 < 0) {
                var58 -= arg4 * var10;
                arg4 = 0;
            }
            if (arg4 != arg6 && var8 < var9 || arg4 == arg6 && var10 < var8) {
                int var59 = arg1 - arg4;
                int var60 = arg4 - arg6;
                int var61 = this.field4708 * arg6;
                while (true) {
                    var60--;
                    if (var60 < 0) {
                        while (true) {
                            var59--;
                            if (var59 < 0) {
                                return;
                            }
                            class722.method4060(this.field4705, var57 >> 16, var61, 0, 14286, var58 >> 16);
                            var57 += var8;
                            var58 += var10;
                            var61 += this.field4708;
                        }
                    }
                    class722.method4060(this.field4705, var57 >> 16, var61, 0, 14286, var56 >> 16);
                    var57 += var8;
                    var56 += var9;
                    var61 += this.field4708;
                }
            } else {
                int var62 = arg1 - arg4;
                int var63 = arg4 - arg6;
                int var64 = this.field4708 * arg6;
                while (true) {
                    var63--;
                    if (var63 < 0) {
                        while (true) {
                            var62--;
                            if (var62 < 0) {
                                return;
                            }
                            class722.method4060(this.field4705, var58 >> 16, var64, 0, 14286, var57 >> 16);
                            var57 += var8;
                            var58 += var10;
                            var64 += this.field4708;
                        }
                    }
                    class722.method4060(this.field4705, var56 >> 16, var64, 0, 14286, var57 >> 16);
                    var64 += this.field4708;
                    var56 += var9;
                    var57 += var8;
                }
            }
        }
    }

    @OriginalMember(owner = "client!hs", name = "d", descriptor = "(Z)V", line = 447)
    public final void method1992(boolean arg0) {
        field4704++;
        if (!arg0) {
            field4713 = null;
        }
        int var2 = -1;
        int var3 = this.field4705.length - 8;
        while (var3 > var2) {
            var2++;
            this.field4705[var2] = 0;
            var2++;
            this.field4705[var2] = 0;
            var2++;
            this.field4705[var2] = 0;
            var2++;
            this.field4705[var2] = 0;
            var2++;
            this.field4705[var2] = 0;
            var2++;
            this.field4705[var2] = 0;
            var2++;
            this.field4705[var2] = 0;
            var2++;
            this.field4705[var2] = 0;
        }
        while ((this.field4705.length - 1) > var2) {
            var2++;
            this.field4705[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(IIIII)V", line = 476)
    public final void method1993(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field4709 = arg1;
        field4711++;
        if (arg2 > -109) {
            this.method1993(44, 68, -83, -40, 26);
        }
        this.field4706 = arg4;
        this.field4708 = arg0 - arg1;
        this.field4703 = arg3 - arg4;
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(III)Z", line = 498)
    public final boolean method1994(int arg0, int arg1, int arg2) {
        field4710++;
        if (arg1 != -1) {
            method1995(-35);
        }
        return arg0 * arg2 <= this.field4705.length;
    }

    @OriginalMember(owner = "client!hs", name = "b", descriptor = "(I)V", line = 511)
    public static void method1995(int arg0) {
        if (arg0 == -1) {
            field4714 = null;
            field4713 = null;
        }
    }

    @OriginalMember(owner = "client!hs", name = "b", descriptor = "(IIIIIII)I", line = 529)
    public static final int method1996(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg1 & 0x3;
        if ((arg2 & 0x1) == 1) {
            int var8 = arg0;
            arg0 = arg4;
            arg4 = var8;
        }
        field4715++;
        if (var7 == 0) {
            return arg3;
        } else if (~var7 == arg5) {
            return 1 + 7 - (arg0 + arg6);
        } else if (var7 == 2) {
            return -arg4 - (-(7 - arg3) - 1);
        } else {
            return arg6;
        }
    }

    @OriginalMember(owner = "client!hs", name = "<init>", descriptor = "(Lrda;II)V", line = 563)
    public class330(class663 arg0, int arg1, int arg2) {
        this.field4705 = new byte[arg1 * arg2];
    }
}
