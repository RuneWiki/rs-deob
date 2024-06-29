import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gea")
public class class65 extends class113 {

    @OriginalMember(owner = "client!gea", name = "F", descriptor = "[B")
    public byte[] field715;

    @OriginalMember(owner = "client!gea", name = "M", descriptor = "[I")
    public static int[] field722 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!gea", name = "L", descriptor = "Lqha;")
    public static class396 field721 = new class396("LIVE", 0);

    @OriginalMember(owner = "client!gea", name = "O", descriptor = "I")
    public static int field724 = 0;

    @OriginalMember(owner = "client!gea", name = "C", descriptor = "I")
    public int field712;

    @OriginalMember(owner = "client!gea", name = "D", descriptor = "I")
    public int field713;

    @OriginalMember(owner = "client!gea", name = "E", descriptor = "I")
    public static int field714;

    @OriginalMember(owner = "client!gea", name = "G", descriptor = "I")
    public static int field716;

    @OriginalMember(owner = "client!gea", name = "H", descriptor = "I")
    public static int field717;

    @OriginalMember(owner = "client!gea", name = "I", descriptor = "I")
    public static int field718;

    @OriginalMember(owner = "client!gea", name = "J", descriptor = "I")
    public int field719;

    @OriginalMember(owner = "client!gea", name = "K", descriptor = "I")
    public int field720;

    @OriginalMember(owner = "client!gea", name = "N", descriptor = "I")
    public static int field723;

    @OriginalMember(owner = "client!gea", name = "g", descriptor = "(I)V", line = 3)
    public final void method503(int arg0) {
        field723++;
        int var2 = -1;
        int var3 = this.field715.length - 8;
        while (var2 < var3) {
            var2++;
            this.field715[var2] = 0;
            var2++;
            this.field715[var2] = 0;
            var2++;
            this.field715[var2] = 0;
            var2++;
            this.field715[var2] = 0;
            var2++;
            this.field715[var2] = 0;
            var2++;
            this.field715[var2] = 0;
            var2++;
            this.field715[var2] = 0;
            var2++;
            this.field715[var2] = 0;
        }
        if (arg0 != -4667) {
            this.method507(-74, -92, -61, -112, -80);
        }
        while (var2 < this.field715.length - 1) {
            var2++;
            this.field715[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(BII)Z", line = 39)
    public final boolean method504(byte arg0, int arg1, int arg2) {
        if (arg0 != 24) {
            method508(28);
        }
        field717++;
        return arg1 * arg2 <= this.field715.length;
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(IIIIIII)V", line = 53)
    public final void method505(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg5 != -75201936) {
            this.method505(-30, -35, -118, 56, 126, -43, 27);
        }
        field718++;
        int var8 = 0;
        if (arg2 != arg4) {
            var8 = (arg1 - arg3 << 16) / (arg2 - arg4);
        }
        int var9 = 0;
        if (arg0 != arg2) {
            var9 = (arg6 - arg1 << 16) / (arg0 - arg2);
        }
        int var10 = 0;
        if (arg0 != arg4) {
            var10 = (arg3 - arg6 << 16) / (arg4 - arg0);
        }
        if (arg2 >= arg4 && arg0 >= arg4) {
            if (arg2 >= arg0) {
                int var11;
                int var12 = var11 = arg3 << 16;
                if (arg4 < 0) {
                    var12 -= arg4 * var10;
                    var11 -= arg4 * var8;
                    arg4 = 0;
                }
                int var13 = arg6 << 16;
                if (arg0 < 0) {
                    var13 -= arg0 * var9;
                    arg0 = 0;
                }
                if (arg0 != arg4 && var10 < var8 || arg0 == arg4 && var9 > var8) {
                    int var14 = arg2 - arg0;
                    int var15 = arg0 - arg4;
                    int var16 = this.field719 * arg4;
                    while (true) {
                        var15--;
                        if (var15 < 0) {
                            while (true) {
                                var14--;
                                if (var14 < 0) {
                                    return;
                                }
                                class526.method3131(0, var16, var13 >> 16, this.field715, var11 >> 16, false);
                                var13 += var9;
                                var16 += this.field719;
                                var11 += var8;
                            }
                        }
                        class526.method3131(0, var16, var12 >> 16, this.field715, var11 >> 16, false);
                        var11 += var8;
                        var16 += this.field719;
                        var12 += var10;
                    }
                } else {
                    int var17 = arg2 - arg0;
                    int var18 = arg0 - arg4;
                    int var19 = this.field719 * arg4;
                    while (true) {
                        var18--;
                        if (var18 < 0) {
                            while (true) {
                                var17--;
                                if (var17 < 0) {
                                    return;
                                }
                                class526.method3131(0, var19, var11 >> 16, this.field715, var13 >> 16, false);
                                var11 += var8;
                                var19 += this.field719;
                                var13 += var9;
                            }
                        }
                        class526.method3131(0, var19, var11 >> 16, this.field715, var12 >> 16, false);
                        var12 += var10;
                        var19 += this.field719;
                        var11 += var8;
                    }
                }
            } else {
                int var20;
                int var21 = var20 = arg3 << 16;
                int var22 = arg1 << 16;
                if (arg4 < 0) {
                    var21 -= arg4 * var10;
                    var20 -= arg4 * var8;
                    arg4 = 0;
                }
                if (arg2 < 0) {
                    var22 -= arg2 * var9;
                    arg2 = 0;
                }
                if (arg2 != arg4 && var10 < var8 || arg2 == arg4 && var10 > var9) {
                    int var23 = arg0 - arg2;
                    int var24 = arg2 - arg4;
                    int var25 = this.field719 * arg4;
                    while (true) {
                        var24--;
                        if (var24 < 0) {
                            while (true) {
                                var23--;
                                if (var23 < 0) {
                                    return;
                                }
                                class526.method3131(0, var25, var21 >> 16, this.field715, var22 >> 16, false);
                                var22 += var9;
                                var25 += this.field719;
                                var21 += var10;
                            }
                        }
                        class526.method3131(0, var25, var21 >> 16, this.field715, var20 >> 16, false);
                        var20 += var8;
                        var21 += var10;
                        var25 += this.field719;
                    }
                } else {
                    int var26 = arg0 - arg2;
                    int var27 = arg2 - arg4;
                    int var28 = this.field719 * arg4;
                    while (true) {
                        var27--;
                        if (var27 < 0) {
                            while (true) {
                                var26--;
                                if (var26 < 0) {
                                    return;
                                }
                                class526.method3131(0, var28, var22 >> 16, this.field715, var21 >> 16, false);
                                var21 += var10;
                                var22 += var9;
                                var28 += this.field719;
                            }
                        }
                        class526.method3131(0, var28, var20 >> 16, this.field715, var21 >> 16, false);
                        var28 += this.field719;
                        var21 += var10;
                        var20 += var8;
                    }
                }
            }
        } else if (arg2 <= arg0) {
            if (arg0 >= arg4) {
                int var29;
                int var30 = var29 = arg1 << 16;
                if (arg2 < 0) {
                    var29 -= arg2 * var9;
                    var30 -= arg2 * var8;
                    arg2 = 0;
                }
                int var31 = arg3 << 16;
                if (arg4 < 0) {
                    var31 -= arg4 * var10;
                    arg4 = 0;
                }
                if (var9 <= var8) {
                    int var32 = arg0 - arg4;
                    int var33 = arg4 - arg2;
                    int var34 = this.field719 * arg2;
                    while (true) {
                        var33--;
                        if (var33 < 0) {
                            while (true) {
                                var32--;
                                if (var32 < 0) {
                                    return;
                                }
                                class526.method3131(0, var34, var29 >> 16, this.field715, var31 >> 16, false);
                                var29 += var9;
                                var34 += this.field719;
                                var31 += var10;
                            }
                        }
                        class526.method3131(0, var34, var29 >> 16, this.field715, var30 >> 16, false);
                        var29 += var9;
                        var30 += var8;
                        var34 += this.field719;
                    }
                } else {
                    int var35 = arg0 - arg4;
                    int var36 = arg4 - arg2;
                    int var37 = this.field719 * arg2;
                    while (true) {
                        var36--;
                        if (var36 < 0) {
                            while (true) {
                                var35--;
                                if (var35 < 0) {
                                    return;
                                }
                                class526.method3131(0, var37, var31 >> 16, this.field715, var29 >> 16, false);
                                var31 += var10;
                                var37 += this.field719;
                                var29 += var9;
                            }
                        }
                        class526.method3131(0, var37, var30 >> 16, this.field715, var29 >> 16, false);
                        var37 += this.field719;
                        var29 += var9;
                        var30 += var8;
                    }
                }
            } else {
                int var38;
                int var39 = var38 = arg1 << 16;
                int var40 = arg6 << 16;
                if (arg2 < 0) {
                    var39 -= arg2 * var8;
                    var38 -= arg2 * var9;
                    arg2 = 0;
                }
                if (arg0 < 0) {
                    var40 -= arg0 * var10;
                    arg0 = 0;
                }
                if (arg0 != arg2 && var8 < var9 || arg0 == arg2 && var10 < var8) {
                    int var41 = arg4 - arg0;
                    int var42 = arg0 - arg2;
                    int var43 = this.field719 * arg2;
                    while (true) {
                        var42--;
                        if (var42 < 0) {
                            while (true) {
                                var41--;
                                if (var41 < 0) {
                                    return;
                                }
                                class526.method3131(0, var43, var39 >> 16, this.field715, var40 >> 16, false);
                                var43 += this.field719;
                                var40 += var10;
                                var39 += var8;
                            }
                        }
                        class526.method3131(0, var43, var39 >> 16, this.field715, var38 >> 16, false);
                        var43 += this.field719;
                        var39 += var8;
                        var38 += var9;
                    }
                } else {
                    int var44 = arg4 - arg0;
                    int var45 = arg0 - arg2;
                    int var46 = this.field719 * arg2;
                    while (true) {
                        var45--;
                        if (var45 < 0) {
                            while (true) {
                                var44--;
                                if (var44 < 0) {
                                    return;
                                }
                                class526.method3131(0, var46, var40 >> 16, this.field715, var39 >> 16, false);
                                var40 += var10;
                                var46 += this.field719;
                                var39 += var8;
                            }
                        }
                        class526.method3131(0, var46, var38 >> 16, this.field715, var39 >> 16, false);
                        var46 += this.field719;
                        var39 += var8;
                        var38 += var9;
                    }
                }
            }
        } else if (arg2 > arg4) {
            int var47;
            int var48 = var47 = arg6 << 16;
            int var49 = arg3 << 16;
            if (arg0 < 0) {
                var47 -= arg0 * var10;
                var48 -= arg0 * var9;
                arg0 = 0;
            }
            if (arg4 < 0) {
                var49 -= arg4 * var8;
                arg4 = 0;
            }
            if (var10 > var9) {
                int var50 = arg2 - arg4;
                int var51 = arg4 - arg0;
                int var52 = this.field719 * arg0;
                while (true) {
                    var51--;
                    if (var51 < 0) {
                        while (true) {
                            var50--;
                            if (var50 < 0) {
                                return;
                            }
                            class526.method3131(0, var52, var48 >> 16, this.field715, var49 >> 16, false);
                            var49 += var8;
                            var52 += this.field719;
                            var48 += var9;
                        }
                    }
                    class526.method3131(0, var52, var48 >> 16, this.field715, var47 >> 16, false);
                    var52 += this.field719;
                    var47 += var10;
                    var48 += var9;
                }
            } else {
                int var53 = arg2 - arg4;
                int var54 = arg4 - arg0;
                int var55 = this.field719 * arg0;
                while (true) {
                    var54--;
                    if (var54 < 0) {
                        while (true) {
                            var53--;
                            if (var53 < 0) {
                                return;
                            }
                            class526.method3131(0, var55, var49 >> 16, this.field715, var48 >> 16, false);
                            var55 += this.field719;
                            var48 += var9;
                            var49 += var8;
                        }
                    }
                    class526.method3131(0, var55, var47 >> 16, this.field715, var48 >> 16, false);
                    var48 += var9;
                    var55 += this.field719;
                    var47 += var10;
                }
            }
        } else {
            int var56;
            int var57 = var56 = arg6 << 16;
            int var58 = arg1 << 16;
            if (arg0 < 0) {
                var56 -= arg0 * var10;
                var57 -= arg0 * var9;
                arg0 = 0;
            }
            if (arg2 < 0) {
                var58 -= arg2 * var8;
                arg2 = 0;
            }
            if (var10 > var9) {
                int var59 = arg4 - arg2;
                int var60 = arg2 - arg0;
                int var61 = this.field719 * arg0;
                while (true) {
                    var60--;
                    if (var60 < 0) {
                        while (true) {
                            var59--;
                            if (var59 < 0) {
                                return;
                            }
                            class526.method3131(0, var61, var58 >> 16, this.field715, var56 >> 16, false);
                            var58 += var8;
                            var61 += this.field719;
                            var56 += var10;
                        }
                    }
                    class526.method3131(0, var61, var57 >> 16, this.field715, var56 >> 16, false);
                    var57 += var9;
                    var61 += this.field719;
                    var56 += var10;
                }
            } else {
                int var62 = arg4 - arg2;
                int var63 = arg2 - arg0;
                int var64 = this.field719 * arg0;
                while (true) {
                    var63--;
                    if (var63 < 0) {
                        while (true) {
                            var62--;
                            if (var62 < 0) {
                                return;
                            }
                            class526.method3131(0, var64, var56 >> 16, this.field715, var58 >> 16, false);
                            var56 += var10;
                            var64 += this.field719;
                            var58 += var8;
                        }
                    }
                    class526.method3131(0, var64, var56 >> 16, this.field715, var57 >> 16, false);
                    var57 += var9;
                    var64 += this.field719;
                    var56 += var10;
                }
            }
        }
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(II)Z", line = 490)
    public static final boolean method506(int arg0, int arg1) {
        if (arg1 != 30440) {
            field721 = null;
        }
        field714++;
        return (arg0 & -arg0) == arg0;
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(IIIII)V", line = 502)
    public final void method507(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field713 = arg2 - arg1;
        if (arg3 != -42716912) {
            field724 = -123;
        }
        field716++;
        this.field712 = arg4;
        this.field719 = arg0 - arg4;
        this.field720 = arg1;
    }

    @OriginalMember(owner = "client!gea", name = "h", descriptor = "(I)V", line = 522)
    public static void method508(int arg0) {
        int var1 = -113 / ((arg0 - 45) / 32);
        field722 = null;
        field721 = null;
    }

    @OriginalMember(owner = "client!gea", name = "<init>", descriptor = "(Lpq;II)V", line = 533)
    public class65(class194 arg0, int arg1, int arg2) {
        this.field715 = new byte[arg1 * arg2];
    }
}
