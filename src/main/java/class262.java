import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class262 extends class195 {

    @OriginalMember(owner = "client!qa", name = "I", descriptor = "[B")
    public byte[] field3889;

    @OriginalMember(owner = "client!qa", name = "E", descriptor = "Z")
    public static boolean field3885 = false;

    @OriginalMember(owner = "client!qa", name = "Q", descriptor = "I")
    public static int field3897 = 1;

    @OriginalMember(owner = "client!qa", name = "G", descriptor = "Lfb;")
    public static class704 field3887 = new class704();

    @OriginalMember(owner = "client!qa", name = "D", descriptor = "I")
    public int field3884;

    @OriginalMember(owner = "client!qa", name = "F", descriptor = "I")
    public int field3886;

    @OriginalMember(owner = "client!qa", name = "H", descriptor = "I")
    public static int field3888;

    @OriginalMember(owner = "client!qa", name = "J", descriptor = "I")
    public static int field3890;

    @OriginalMember(owner = "client!qa", name = "L", descriptor = "I")
    public static int field3892;

    @OriginalMember(owner = "client!qa", name = "M", descriptor = "I")
    public int field3893;

    @OriginalMember(owner = "client!qa", name = "N", descriptor = "I")
    public static int field3894;

    @OriginalMember(owner = "client!qa", name = "O", descriptor = "I")
    public int field3895;

    @OriginalMember(owner = "client!qa", name = "P", descriptor = "I")
    public static int field3896;

    @OriginalMember(owner = "client!qa", name = "K", descriptor = "Laj;")
    public static class333 field3891;

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(III)Z")
    public final boolean method1729(int arg0, int arg1, int arg2) {
        if (arg0 >= -103) {
            this.field3886 = -20;
        }
        field3890++;
        return arg1 * arg2 <= this.field3889.length;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(ZIIIIII)V")
    public final void method1730(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3896++;
        int var8 = 0;
        if (arg0) {
            this.field3895 = 102;
        }
        if (arg1 != arg6) {
            var8 = (arg2 - arg5 << 16) / (arg1 - arg6);
        }
        int var9 = 0;
        if (arg1 != arg4) {
            var9 = (arg3 - arg2 << 16) / (arg4 - arg1);
        }
        int var10 = 0;
        if (arg4 != arg6) {
            var10 = (arg5 - arg3 << 16) / (arg6 - arg4);
        }
        if (arg1 >= arg6 && arg6 <= arg4) {
            if (arg1 >= arg4) {
                int var11;
                int var12 = var11 = arg5 << 16;
                int var13 = arg3 << 16;
                if (arg6 < 0) {
                    var11 -= arg6 * var8;
                    var12 -= arg6 * var10;
                    arg6 = 0;
                }
                if (arg4 < 0) {
                    var13 -= arg4 * var9;
                    arg4 = 0;
                }
                if (arg4 != arg6 && var8 > var10 || arg4 == arg6 && var8 < var9) {
                    int var14 = arg1 - arg4;
                    int var15 = arg4 - arg6;
                    int var16 = this.field3886 * arg6;
                    while (true) {
                        var15--;
                        if (var15 < 0) {
                            while (true) {
                                var14--;
                                if (var14 < 0) {
                                    return;
                                }
                                class419.method2588(79, var13 >> 16, var11 >> 16, 0, var16, this.field3889);
                                var11 += var8;
                                var16 += this.field3886;
                                var13 += var9;
                            }
                        }
                        class419.method2588(101, var12 >> 16, var11 >> 16, 0, var16, this.field3889);
                        var16 += this.field3886;
                        var12 += var10;
                        var11 += var8;
                    }
                } else {
                    int var17 = arg1 - arg4;
                    int var18 = arg4 - arg6;
                    int var19 = this.field3886 * arg6;
                    while (true) {
                        var18--;
                        if (var18 < 0) {
                            while (true) {
                                var17--;
                                if (var17 < 0) {
                                    return;
                                }
                                class419.method2588(94, var11 >> 16, var13 >> 16, 0, var19, this.field3889);
                                var11 += var8;
                                var13 += var9;
                                var19 += this.field3886;
                            }
                        }
                        class419.method2588(105, var11 >> 16, var12 >> 16, 0, var19, this.field3889);
                        var19 += this.field3886;
                        var12 += var10;
                        var11 += var8;
                    }
                }
            } else {
                int var20;
                int var21 = var20 = arg5 << 16;
                if (arg6 < 0) {
                    var21 -= arg6 * var10;
                    var20 -= arg6 * var8;
                    arg6 = 0;
                }
                int var22 = arg2 << 16;
                if (arg1 < 0) {
                    var22 -= arg1 * var9;
                    arg1 = 0;
                }
                if (arg1 != arg6 && var8 > var10 || arg1 == arg6 && var10 > var9) {
                    int var23 = arg4 - arg1;
                    int var24 = arg1 - arg6;
                    int var25 = this.field3886 * arg6;
                    while (true) {
                        var24--;
                        if (var24 < 0) {
                            while (true) {
                                var23--;
                                if (var23 < 0) {
                                    return;
                                }
                                class419.method2588(103, var21 >> 16, var22 >> 16, 0, var25, this.field3889);
                                var25 += this.field3886;
                                var21 += var10;
                                var22 += var9;
                            }
                        }
                        class419.method2588(83, var21 >> 16, var20 >> 16, 0, var25, this.field3889);
                        var21 += var10;
                        var20 += var8;
                        var25 += this.field3886;
                    }
                } else {
                    int var26 = arg4 - arg1;
                    int var27 = arg1 - arg6;
                    int var28 = this.field3886 * arg6;
                    while (true) {
                        var27--;
                        if (var27 < 0) {
                            while (true) {
                                var26--;
                                if (var26 < 0) {
                                    return;
                                }
                                class419.method2588(124, var22 >> 16, var21 >> 16, 0, var28, this.field3889);
                                var21 += var10;
                                var28 += this.field3886;
                                var22 += var9;
                            }
                        }
                        class419.method2588(104, var20 >> 16, var21 >> 16, 0, var28, this.field3889);
                        var21 += var10;
                        var20 += var8;
                        var28 += this.field3886;
                    }
                }
            }
        } else if (arg1 <= arg4) {
            if (arg6 > arg4) {
                int var29;
                int var30 = var29 = arg2 << 16;
                int var31 = arg3 << 16;
                if (arg1 < 0) {
                    var30 -= arg1 * var8;
                    var29 -= arg1 * var9;
                    arg1 = 0;
                }
                if (arg4 < 0) {
                    var31 -= arg4 * var10;
                    arg4 = 0;
                }
                if ((arg1 == arg4 || var8 >= var9) && (arg1 != arg4 || var10 >= var8)) {
                    int var35 = arg6 - arg4;
                    int var36 = arg4 - arg1;
                    int var37 = this.field3886 * arg1;
                    while (true) {
                        var36--;
                        if (var36 < 0) {
                            while (true) {
                                var35--;
                                if (var35 < 0) {
                                    return;
                                }
                                class419.method2588(103, var31 >> 16, var30 >> 16, 0, var37, this.field3889);
                                var31 += var10;
                                var30 += var8;
                                var37 += this.field3886;
                            }
                        }
                        class419.method2588(80, var29 >> 16, var30 >> 16, 0, var37, this.field3889);
                        var30 += var8;
                        var37 += this.field3886;
                        var29 += var9;
                    }
                } else {
                    int var32 = arg6 - arg4;
                    int var33 = arg4 - arg1;
                    int var34 = this.field3886 * arg1;
                    while (true) {
                        var33--;
                        if (var33 < 0) {
                            while (true) {
                                var32--;
                                if (var32 < 0) {
                                    return;
                                }
                                class419.method2588(108, var30 >> 16, var31 >> 16, 0, var34, this.field3889);
                                var31 += var10;
                                var34 += this.field3886;
                                var30 += var8;
                            }
                        }
                        class419.method2588(126, var30 >> 16, var29 >> 16, 0, var34, this.field3889);
                        var30 += var8;
                        var29 += var9;
                        var34 += this.field3886;
                    }
                }
            } else {
                int var38;
                int var39 = var38 = arg2 << 16;
                if (arg1 < 0) {
                    var38 -= arg1 * var9;
                    var39 -= arg1 * var8;
                    arg1 = 0;
                }
                int var40 = arg5 << 16;
                if (arg6 < 0) {
                    var40 -= arg6 * var10;
                    arg6 = 0;
                }
                if (var9 <= var8) {
                    int var41 = arg4 - arg6;
                    int var42 = arg6 - arg1;
                    int var43 = this.field3886 * arg1;
                    while (true) {
                        var42--;
                        if (var42 < 0) {
                            while (true) {
                                var41--;
                                if (var41 < 0) {
                                    return;
                                }
                                class419.method2588(83, var38 >> 16, var40 >> 16, 0, var43, this.field3889);
                                var43 += this.field3886;
                                var38 += var9;
                                var40 += var10;
                            }
                        }
                        class419.method2588(66, var38 >> 16, var39 >> 16, 0, var43, this.field3889);
                        var43 += this.field3886;
                        var38 += var9;
                        var39 += var8;
                    }
                } else {
                    int var44 = arg4 - arg6;
                    int var45 = arg6 - arg1;
                    int var46 = this.field3886 * arg1;
                    while (true) {
                        var45--;
                        if (var45 < 0) {
                            while (true) {
                                var44--;
                                if (var44 < 0) {
                                    return;
                                }
                                class419.method2588(102, var40 >> 16, var38 >> 16, 0, var46, this.field3889);
                                var46 += this.field3886;
                                var40 += var10;
                                var38 += var9;
                            }
                        }
                        class419.method2588(116, var39 >> 16, var38 >> 16, 0, var46, this.field3889);
                        var38 += var9;
                        var39 += var8;
                        var46 += this.field3886;
                    }
                }
            }
        } else if (arg1 <= arg6) {
            int var47;
            int var48 = var47 = arg3 << 16;
            if (arg4 < 0) {
                var47 -= arg4 * var10;
                var48 -= arg4 * var9;
                arg4 = 0;
            }
            int var49 = arg2 << 16;
            if (arg1 < 0) {
                var49 -= arg1 * var8;
                arg1 = 0;
            }
            if (var9 >= var10) {
                int var50 = arg6 - arg1;
                int var51 = arg1 - arg4;
                int var52 = this.field3886 * arg4;
                while (true) {
                    var51--;
                    if (var51 < 0) {
                        while (true) {
                            var50--;
                            if (var50 < 0) {
                                return;
                            }
                            class419.method2588(110, var47 >> 16, var49 >> 16, 0, var52, this.field3889);
                            var47 += var10;
                            var52 += this.field3886;
                            var49 += var8;
                        }
                    }
                    class419.method2588(119, var47 >> 16, var48 >> 16, 0, var52, this.field3889);
                    var52 += this.field3886;
                    var47 += var10;
                    var48 += var9;
                }
            } else {
                int var53 = arg6 - arg1;
                int var54 = arg1 - arg4;
                int var55 = this.field3886 * arg4;
                while (true) {
                    var54--;
                    if (var54 < 0) {
                        while (true) {
                            var53--;
                            if (var53 < 0) {
                                return;
                            }
                            class419.method2588(67, var49 >> 16, var47 >> 16, 0, var55, this.field3889);
                            var49 += var8;
                            var47 += var10;
                            var55 += this.field3886;
                        }
                    }
                    class419.method2588(126, var48 >> 16, var47 >> 16, 0, var55, this.field3889);
                    var47 += var10;
                    var48 += var9;
                    var55 += this.field3886;
                }
            }
        } else {
            int var56;
            int var57 = var56 = arg3 << 16;
            if (arg4 < 0) {
                var56 -= arg4 * var10;
                var57 -= arg4 * var9;
                arg4 = 0;
            }
            int var58 = arg5 << 16;
            if (arg6 < 0) {
                var58 -= arg6 * var8;
                arg6 = 0;
            }
            if (var10 > var9) {
                int var59 = arg1 - arg6;
                int var60 = arg6 - arg4;
                int var61 = this.field3886 * arg4;
                while (true) {
                    var60--;
                    if (var60 < 0) {
                        while (true) {
                            var59--;
                            if (var59 < 0) {
                                return;
                            }
                            class419.method2588(68, var57 >> 16, var58 >> 16, 0, var61, this.field3889);
                            var61 += this.field3886;
                            var58 += var8;
                            var57 += var9;
                        }
                    }
                    class419.method2588(82, var57 >> 16, var56 >> 16, 0, var61, this.field3889);
                    var57 += var9;
                    var61 += this.field3886;
                    var56 += var10;
                }
            } else {
                int var62 = arg1 - arg6;
                int var63 = arg6 - arg4;
                int var64 = this.field3886 * arg4;
                while (true) {
                    var63--;
                    if (var63 < 0) {
                        while (true) {
                            var62--;
                            if (var62 < 0) {
                                return;
                            }
                            class419.method2588(122, var58 >> 16, var57 >> 16, 0, var64, this.field3889);
                            var57 += var9;
                            var64 += this.field3886;
                            var58 += var8;
                        }
                    }
                    class419.method2588(121, var56 >> 16, var57 >> 16, 0, var64, this.field3889);
                    var57 += var9;
                    var56 += var10;
                    var64 += this.field3886;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "(I)V")
    public static void method1731(int arg0) {
        field3887 = null;
        if (arg0 < 99) {
            field3897 = 51;
        }
        field3891 = null;
    }

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "(I)V")
    public final void method1732(int arg0) {
        field3892++;
        int var2 = -1;
        int var3 = this.field3889.length - 8;
        while (var2 < var3) {
            var2++;
            this.field3889[var2] = 0;
            var2++;
            this.field3889[var2] = 0;
            var2++;
            this.field3889[var2] = 0;
            var2++;
            this.field3889[var2] = 0;
            var2++;
            this.field3889[var2] = 0;
            var2++;
            this.field3889[var2] = 0;
            var2++;
            this.field3889[var2] = 0;
            var2++;
            this.field3889[var2] = 0;
        }
        if (arg0 == 0) {
            while ((this.field3889.length - 1) > var2) {
                var2++;
                this.field3889[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(BIIII)V")
    public final void method1733(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != 57) {
            this.field3895 = 41;
        }
        this.field3893 = arg1;
        this.field3884 = arg3 - arg4;
        this.field3886 = arg2 - arg1;
        field3894++;
        this.field3895 = arg4;
    }

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(Ldia;II)V")
    public class262(class246 arg0, int arg1, int arg2) {
        this.field3889 = new byte[arg1 * arg2];
    }
}
