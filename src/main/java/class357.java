import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public class class357 extends class54 {

    @OriginalMember(owner = "client!tm", name = "G", descriptor = "[B")
    public byte[] field4762;

    @OriginalMember(owner = "client!tm", name = "B", descriptor = "I")
    public static int field4757;

    @OriginalMember(owner = "client!tm", name = "C", descriptor = "I")
    public static int field4758;

    @OriginalMember(owner = "client!tm", name = "D", descriptor = "I")
    public static int field4759;

    @OriginalMember(owner = "client!tm", name = "E", descriptor = "I")
    public int field4760;

    @OriginalMember(owner = "client!tm", name = "F", descriptor = "I")
    public static int field4761;

    @OriginalMember(owner = "client!tm", name = "I", descriptor = "I")
    public static int field4764;

    @OriginalMember(owner = "client!tm", name = "J", descriptor = "I")
    public static int field4765;

    @OriginalMember(owner = "client!tm", name = "K", descriptor = "I")
    public int field4766;

    @OriginalMember(owner = "client!tm", name = "L", descriptor = "I")
    public static int field4767;

    @OriginalMember(owner = "client!tm", name = "M", descriptor = "I")
    public int field4768;

    @OriginalMember(owner = "client!tm", name = "N", descriptor = "I")
    public int field4769;

    @OriginalMember(owner = "client!tm", name = "H", descriptor = "Ljn;")
    public static class668 field4763;

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(IIIIIBI)V", line = 4)
    public final void method2010(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        field4759++;
        int var8 = 61 / ((-arg5 - 60) / 43);
        int var9 = 0;
        if (arg1 != arg4) {
            var9 = (arg0 - arg3 << 16) / (arg4 - arg1);
        }
        int var10 = 0;
        if (arg4 != arg6) {
            var10 = (arg2 - arg0 << 16) / (arg6 - arg4);
        }
        int var11 = 0;
        if (arg1 != arg6) {
            var11 = (arg3 - arg2 << 16) / (arg1 - arg6);
        }
        if (arg1 <= arg4 && arg6 >= arg1) {
            if (arg4 >= arg6) {
                int var12;
                int var13 = var12 = arg3 << 16;
                int var14 = arg2 << 16;
                if (arg1 < 0) {
                    var13 -= arg1 * var11;
                    var12 -= arg1 * var9;
                    arg1 = 0;
                }
                if (arg6 < 0) {
                    var14 -= arg6 * var10;
                    arg6 = 0;
                }
                if ((arg1 == arg6 || var11 >= var9) && (arg1 != arg6 || var9 >= var10)) {
                    int var18 = arg4 - arg6;
                    int var19 = arg6 - arg1;
                    int var20 = this.field4769 * arg1;
                    while (true) {
                        var19--;
                        if (var19 < 0) {
                            while (true) {
                                var18--;
                                if (var18 < 0) {
                                    return;
                                }
                                class601.method3467(var20, (byte) 77, this.field4762, 0, var14 >> 16, var12 >> 16);
                                var14 += var10;
                                var12 += var9;
                                var20 += this.field4769;
                            }
                        }
                        class601.method3467(var20, (byte) 77, this.field4762, 0, var13 >> 16, var12 >> 16);
                        var13 += var11;
                        var20 += this.field4769;
                        var12 += var9;
                    }
                } else {
                    int var15 = arg4 - arg6;
                    int var16 = arg6 - arg1;
                    int var17 = this.field4769 * arg1;
                    while (true) {
                        var16--;
                        if (var16 < 0) {
                            while (true) {
                                var15--;
                                if (var15 < 0) {
                                    return;
                                }
                                class601.method3467(var17, (byte) 77, this.field4762, 0, var12 >> 16, var14 >> 16);
                                var14 += var10;
                                var17 += this.field4769;
                                var12 += var9;
                            }
                        }
                        class601.method3467(var17, (byte) 77, this.field4762, 0, var12 >> 16, var13 >> 16);
                        var13 += var11;
                        var12 += var9;
                        var17 += this.field4769;
                    }
                }
            } else {
                int var21;
                int var22 = var21 = arg3 << 16;
                int var23 = arg0 << 16;
                if (arg1 < 0) {
                    var22 -= arg1 * var11;
                    var21 -= arg1 * var9;
                    arg1 = 0;
                }
                if (arg4 < 0) {
                    var23 -= arg4 * var10;
                    arg4 = 0;
                }
                if (arg1 != arg4 && var11 < var9 || arg1 == arg4 && var10 < var11) {
                    int var24 = arg6 - arg4;
                    int var25 = arg4 - arg1;
                    int var26 = this.field4769 * arg1;
                    while (true) {
                        var25--;
                        if (var25 < 0) {
                            while (true) {
                                var24--;
                                if (var24 < 0) {
                                    return;
                                }
                                class601.method3467(var26, (byte) 77, this.field4762, 0, var23 >> 16, var22 >> 16);
                                var22 += var11;
                                var26 += this.field4769;
                                var23 += var10;
                            }
                        }
                        class601.method3467(var26, (byte) 77, this.field4762, 0, var21 >> 16, var22 >> 16);
                        var22 += var11;
                        var26 += this.field4769;
                        var21 += var9;
                    }
                } else {
                    int var27 = arg6 - arg4;
                    int var28 = arg4 - arg1;
                    int var29 = this.field4769 * arg1;
                    while (true) {
                        var28--;
                        if (var28 < 0) {
                            while (true) {
                                var27--;
                                if (var27 < 0) {
                                    return;
                                }
                                class601.method3467(var29, (byte) 77, this.field4762, 0, var22 >> 16, var23 >> 16);
                                var29 += this.field4769;
                                var23 += var10;
                                var22 += var11;
                            }
                        }
                        class601.method3467(var29, (byte) 77, this.field4762, 0, var22 >> 16, var21 >> 16);
                        var21 += var9;
                        var29 += this.field4769;
                        var22 += var11;
                    }
                }
            }
        } else if (arg6 < arg4) {
            if (arg1 >= arg4) {
                int var30;
                int var31 = var30 = arg2 << 16;
                if (arg6 < 0) {
                    var30 -= arg6 * var11;
                    var31 -= arg6 * var10;
                    arg6 = 0;
                }
                int var32 = arg0 << 16;
                if (arg4 < 0) {
                    var32 -= arg4 * var9;
                    arg4 = 0;
                }
                if (var10 >= var11) {
                    int var33 = arg1 - arg4;
                    int var34 = arg4 - arg6;
                    int var35 = this.field4769 * arg6;
                    while (true) {
                        var34--;
                        if (var34 < 0) {
                            while (true) {
                                var33--;
                                if (var33 < 0) {
                                    return;
                                }
                                class601.method3467(var35, (byte) 77, this.field4762, 0, var32 >> 16, var30 >> 16);
                                var35 += this.field4769;
                                var30 += var11;
                                var32 += var9;
                            }
                        }
                        class601.method3467(var35, (byte) 77, this.field4762, 0, var31 >> 16, var30 >> 16);
                        var31 += var10;
                        var35 += this.field4769;
                        var30 += var11;
                    }
                } else {
                    int var36 = arg1 - arg4;
                    int var37 = arg4 - arg6;
                    int var38 = this.field4769 * arg6;
                    while (true) {
                        var37--;
                        if (var37 < 0) {
                            while (true) {
                                var36--;
                                if (var36 < 0) {
                                    return;
                                }
                                class601.method3467(var38, (byte) 77, this.field4762, 0, var30 >> 16, var32 >> 16);
                                var38 += this.field4769;
                                var32 += var9;
                                var30 += var11;
                            }
                        }
                        class601.method3467(var38, (byte) 77, this.field4762, 0, var30 >> 16, var31 >> 16);
                        var30 += var11;
                        var38 += this.field4769;
                        var31 += var10;
                    }
                }
            } else {
                int var39;
                int var40 = var39 = arg2 << 16;
                int var41 = arg3 << 16;
                if (arg6 < 0) {
                    var39 -= arg6 * var11;
                    var40 -= arg6 * var10;
                    arg6 = 0;
                }
                if (arg1 < 0) {
                    var41 -= arg1 * var9;
                    arg1 = 0;
                }
                if (var10 >= var11) {
                    int var42 = arg4 - arg1;
                    int var43 = arg1 - arg6;
                    int var44 = this.field4769 * arg6;
                    while (true) {
                        var43--;
                        if (var43 < 0) {
                            while (true) {
                                var42--;
                                if (var42 < 0) {
                                    return;
                                }
                                class601.method3467(var44, (byte) 77, this.field4762, 0, var40 >> 16, var41 >> 16);
                                var44 += this.field4769;
                                var41 += var9;
                                var40 += var10;
                            }
                        }
                        class601.method3467(var44, (byte) 77, this.field4762, 0, var40 >> 16, var39 >> 16);
                        var39 += var11;
                        var44 += this.field4769;
                        var40 += var10;
                    }
                } else {
                    int var45 = arg4 - arg1;
                    int var46 = arg1 - arg6;
                    int var47 = this.field4769 * arg6;
                    while (true) {
                        var46--;
                        if (var46 < 0) {
                            while (true) {
                                var45--;
                                if (var45 < 0) {
                                    return;
                                }
                                class601.method3467(var47, (byte) 77, this.field4762, 0, var41 >> 16, var40 >> 16);
                                var40 += var10;
                                var41 += var9;
                                var47 += this.field4769;
                            }
                        }
                        class601.method3467(var47, (byte) 77, this.field4762, 0, var39 >> 16, var40 >> 16);
                        var40 += var10;
                        var39 += var11;
                        var47 += this.field4769;
                    }
                }
            }
        } else if (arg6 >= arg1) {
            int var48;
            int var49 = var48 = arg0 << 16;
            int var50 = arg3 << 16;
            if (arg4 < 0) {
                var48 -= arg4 * var10;
                var49 -= arg4 * var9;
                arg4 = 0;
            }
            if (arg1 < 0) {
                var50 -= arg1 * var11;
                arg1 = 0;
            }
            if (var10 <= var9) {
                int var51 = arg6 - arg1;
                int var52 = arg1 - arg4;
                int var53 = this.field4769 * arg4;
                while (true) {
                    var52--;
                    if (var52 < 0) {
                        while (true) {
                            var51--;
                            if (var51 < 0) {
                                return;
                            }
                            class601.method3467(var53, (byte) 77, this.field4762, 0, var50 >> 16, var48 >> 16);
                            var53 += this.field4769;
                            var50 += var11;
                            var48 += var10;
                        }
                    }
                    class601.method3467(var53, (byte) 77, this.field4762, 0, var49 >> 16, var48 >> 16);
                    var53 += this.field4769;
                    var49 += var9;
                    var48 += var10;
                }
            } else {
                int var54 = arg6 - arg1;
                int var55 = arg1 - arg4;
                int var56 = this.field4769 * arg4;
                while (true) {
                    var55--;
                    if (var55 < 0) {
                        while (true) {
                            var54--;
                            if (var54 < 0) {
                                return;
                            }
                            class601.method3467(var56, (byte) 77, this.field4762, 0, var48 >> 16, var50 >> 16);
                            var48 += var10;
                            var56 += this.field4769;
                            var50 += var11;
                        }
                    }
                    class601.method3467(var56, (byte) 77, this.field4762, 0, var48 >> 16, var49 >> 16);
                    var48 += var10;
                    var56 += this.field4769;
                    var49 += var9;
                }
            }
        } else {
            int var57;
            int var58 = var57 = arg0 << 16;
            int var59 = arg2 << 16;
            if (arg4 < 0) {
                var58 -= arg4 * var9;
                var57 -= arg4 * var10;
                arg4 = 0;
            }
            if (arg6 < 0) {
                var59 -= arg6 * var11;
                arg6 = 0;
            }
            if ((arg4 == arg6 || var9 >= var10) && (arg4 != arg6 || var11 >= var9)) {
                int var63 = arg1 - arg6;
                int var64 = arg6 - arg4;
                int var65 = this.field4769 * arg4;
                while (true) {
                    var64--;
                    if (var64 < 0) {
                        while (true) {
                            var63--;
                            if (var63 < 0) {
                                return;
                            }
                            class601.method3467(var65, (byte) 77, this.field4762, 0, var58 >> 16, var59 >> 16);
                            var59 += var11;
                            var58 += var9;
                            var65 += this.field4769;
                        }
                    }
                    class601.method3467(var65, (byte) 77, this.field4762, 0, var58 >> 16, var57 >> 16);
                    var58 += var9;
                    var65 += this.field4769;
                    var57 += var10;
                }
            } else {
                int var60 = arg1 - arg6;
                int var61 = arg6 - arg4;
                int var62 = this.field4769 * arg4;
                while (true) {
                    var61--;
                    if (var61 < 0) {
                        while (true) {
                            var60--;
                            if (var60 < 0) {
                                return;
                            }
                            class601.method3467(var62, (byte) 77, this.field4762, 0, var59 >> 16, var58 >> 16);
                            var58 += var9;
                            var62 += this.field4769;
                            var59 += var11;
                        }
                    }
                    class601.method3467(var62, (byte) 77, this.field4762, 0, var57 >> 16, var58 >> 16);
                    var58 += var9;
                    var57 += var10;
                    var62 += this.field4769;
                }
            }
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(IIZ)Z", line = 443)
    public final boolean method2011(int arg0, int arg1, boolean arg2) {
        field4765++;
        if (!arg2) {
            this.field4760 = -24;
        }
        return arg0 * arg1 <= this.field4762.length;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(ZZB)V", line = 456)
    public static final void method2012(boolean arg0, boolean arg1, byte arg2) {
        if (arg0) {
            class58.field904++;
            class513.method3048(-14174);
        }
        field4758++;
        int var3 = -99 / ((arg2 + 64) / 41);
        if (arg1) {
            class315.field4167++;
            class584.method3392(1333);
        }
    }

    @OriginalMember(owner = "client!tm", name = "g", descriptor = "(I)V", line = 489)
    public final void method2013(int arg0) {
        field4761++;
        int var2 = -1;
        if (arg0 != 0) {
            this.field4760 = 59;
        }
        int var3 = this.field4762.length - 8;
        while (var3 > var2) {
            var2++;
            this.field4762[var2] = 0;
            var2++;
            this.field4762[var2] = 0;
            var2++;
            this.field4762[var2] = 0;
            var2++;
            this.field4762[var2] = 0;
            var2++;
            this.field4762[var2] = 0;
            var2++;
            this.field4762[var2] = 0;
            var2++;
            this.field4762[var2] = 0;
            var2++;
            this.field4762[var2] = 0;
        }
        while ((this.field4762.length - 1) > var2) {
            var2++;
            this.field4762[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!tm", name = "h", descriptor = "(I)V", line = 518)
    public static void method2014(int arg0) {
        field4763 = null;
        if (arg0 != 0) {
            field4764 = 98;
        }
    }

    @OriginalMember(owner = "client!tm", name = "<init>", descriptor = "(Lkga;II)V", line = 529)
    public class357(class506 arg0, int arg1, int arg2) {
        this.field4762 = new byte[arg1 * arg2];
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(IIIII)V", line = 539)
    public final void method2015(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4757++;
        if (arg0 > 72) {
            this.field4760 = arg1;
            this.field4766 = arg3;
            this.field4769 = arg4 - arg1;
            this.field4768 = arg2 - arg3;
        }
    }
}
