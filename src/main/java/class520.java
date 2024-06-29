import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hv")
public class class520 extends class184 {

    @OriginalMember(owner = "client!hv", name = "M", descriptor = "[B")
    public byte[] field6934;

    @OriginalMember(owner = "client!hv", name = "F", descriptor = "[[I")
    public static int[][] field6928 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!hv", name = "H", descriptor = "I")
    public static int field6930 = 0;

    @OriginalMember(owner = "client!hv", name = "P", descriptor = "[I")
    public static int[] field6937 = new int[2];

    @OriginalMember(owner = "client!hv", name = "S", descriptor = "[I")
    public static int[] field6940 = new int[25];

    @OriginalMember(owner = "client!hv", name = "A", descriptor = "I")
    public int field6925;

    @OriginalMember(owner = "client!hv", name = "D", descriptor = "I")
    public static int field6926;

    @OriginalMember(owner = "client!hv", name = "E", descriptor = "I")
    public static int field6927;

    @OriginalMember(owner = "client!hv", name = "J", descriptor = "I")
    public int field6931;

    @OriginalMember(owner = "client!hv", name = "K", descriptor = "I")
    public static int field6932;

    @OriginalMember(owner = "client!hv", name = "L", descriptor = "I")
    public static int field6933;

    @OriginalMember(owner = "client!hv", name = "N", descriptor = "I")
    public static int field6935;

    @OriginalMember(owner = "client!hv", name = "O", descriptor = "I")
    public static int field6936;

    @OriginalMember(owner = "client!hv", name = "Q", descriptor = "I")
    public static int field6938;

    @OriginalMember(owner = "client!hv", name = "R", descriptor = "I")
    public int field6939;

    @OriginalMember(owner = "client!hv", name = "T", descriptor = "I")
    public int field6941;

    @OriginalMember(owner = "client!hv", name = "U", descriptor = "I")
    public static int field6942;

    @OriginalMember(owner = "client!hv", name = "G", descriptor = "Lte;")
    public static class614 field6929;

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(III)Z")
    public final boolean method2883(int arg0, int arg1, int arg2) {
        if (arg1 >= -117) {
            this.field6941 = 43;
        }
        field6926++;
        return this.field6934.length >= arg0 * arg2;
    }

    @OriginalMember(owner = "client!hv", name = "b", descriptor = "(I)Lrt;")
    public static final class229 method2884(int arg0) {
        field6932++;
        if (arg0 != 16966) {
            return null;
        }
        try {
            return (class229) Class.forName("ica").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(II)V")
    public static final void method2885(int arg0, int arg1) {
        field6927++;
        class127 var2 = class760.method4231(arg0, -874792672, 11);
        int var3 = 71 % ((arg1 - 10) / 61);
        var2.method1002(-118);
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(B)V")
    public static void method2886(byte arg0) {
        field6928 = null;
        field6937 = null;
        if (arg0 > -78) {
            method2885(-108, -2);
        }
        field6929 = null;
        field6940 = null;
    }

    @OriginalMember(owner = "client!hv", name = "b", descriptor = "(III)V")
    public static final void method2887(int arg0, int arg1, int arg2) {
        field6942++;
        if (arg1 > -75) {
            field6929 = null;
        }
        class224 var3 = class131.field2147[arg2][arg0];
        if (var3 != null) {
            class111.field1703 = var3.field3177;
            class427.field5895 = var3.field3190;
            class156.field2386 = var3.field3185;
        }
        class438.method2524(107);
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(IIIIIII)V")
    public final void method2888(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field6938++;
        int var8 = 0;
        if (arg2 != 4) {
            return;
        }
        if (arg3 != arg5) {
            var8 = (arg1 - arg0 << 16) / (arg3 - arg5);
        }
        int var9 = 0;
        if (arg3 != arg4) {
            var9 = (arg6 - arg1 << 16) / (arg4 - arg3);
        }
        int var10 = 0;
        if (arg4 != arg5) {
            var10 = (arg0 - arg6 << 16) / (arg5 - arg4);
        }
        if (arg5 <= arg3 && arg4 >= arg5) {
            if (arg3 >= arg4) {
                int var11;
                int var12 = var11 = arg0 << 16;
                if (arg5 < 0) {
                    var11 -= arg5 * var8;
                    var12 -= arg5 * var10;
                    arg5 = 0;
                }
                int var13 = arg6 << 16;
                if (arg4 < 0) {
                    var13 -= arg4 * var9;
                    arg4 = 0;
                }
                if (arg4 != arg5 && var8 > var10 || arg4 == arg5 && var8 < var9) {
                    int var14 = arg3 - arg4;
                    int var15 = arg4 - arg5;
                    int var16 = this.field6931 * arg5;
                    while (true) {
                        var15--;
                        if (var15 < 0) {
                            while (true) {
                                var14--;
                                if (var14 < 0) {
                                    return;
                                }
                                class79.method628(this.field6934, var11 >> 16, var16, arg2 + 11563, var13 >> 16, 0);
                                var16 += this.field6931;
                                var11 += var8;
                                var13 += var9;
                            }
                        }
                        class79.method628(this.field6934, var11 >> 16, var16, 11567, var12 >> 16, 0);
                        var12 += var10;
                        var16 += this.field6931;
                        var11 += var8;
                    }
                } else {
                    int var17 = arg3 - arg4;
                    int var18 = arg4 - arg5;
                    int var19 = this.field6931 * arg5;
                    while (true) {
                        var18--;
                        if (var18 < 0) {
                            while (true) {
                                var17--;
                                if (var17 < 0) {
                                    return;
                                }
                                class79.method628(this.field6934, var13 >> 16, var19, 11567, var11 >> 16, 0);
                                var19 += this.field6931;
                                var13 += var9;
                                var11 += var8;
                            }
                        }
                        class79.method628(this.field6934, var12 >> 16, var19, 11567, var11 >> 16, 0);
                        var11 += var8;
                        var19 += this.field6931;
                        var12 += var10;
                    }
                }
            } else {
                int var20;
                int var21 = var20 = arg0 << 16;
                int var22 = arg1 << 16;
                if (arg5 < 0) {
                    var20 -= arg5 * var8;
                    var21 -= arg5 * var10;
                    arg5 = 0;
                }
                if (arg3 < 0) {
                    var22 -= arg3 * var9;
                    arg3 = 0;
                }
                if (arg3 != arg5 && var10 < var8 || arg3 == arg5 && var10 > var9) {
                    int var23 = arg4 - arg3;
                    int var24 = arg3 - arg5;
                    int var25 = this.field6931 * arg5;
                    while (true) {
                        var24--;
                        if (var24 < 0) {
                            while (true) {
                                var23--;
                                if (var23 < 0) {
                                    return;
                                }
                                class79.method628(this.field6934, var22 >> 16, var25, arg2 ^ 0x2D2B, var21 >> 16, 0);
                                var25 += this.field6931;
                                var22 += var9;
                                var21 += var10;
                            }
                        }
                        class79.method628(this.field6934, var20 >> 16, var25, 11567, var21 >> 16, 0);
                        var21 += var10;
                        var20 += var8;
                        var25 += this.field6931;
                    }
                } else {
                    int var26 = arg4 - arg3;
                    int var27 = arg3 - arg5;
                    int var28 = this.field6931 * arg5;
                    while (true) {
                        var27--;
                        if (var27 < 0) {
                            while (true) {
                                var26--;
                                if (var26 < 0) {
                                    return;
                                }
                                class79.method628(this.field6934, var21 >> 16, var28, arg2 + 11563, var22 >> 16, 0);
                                var21 += var10;
                                var22 += var9;
                                var28 += this.field6931;
                            }
                        }
                        class79.method628(this.field6934, var21 >> 16, var28, 11567, var20 >> 16, 0);
                        var21 += var10;
                        var20 += var8;
                        var28 += this.field6931;
                    }
                }
            }
        } else if (arg4 >= arg3) {
            if (arg5 > arg4) {
                int var29;
                int var30 = var29 = arg1 << 16;
                if (arg3 < 0) {
                    var29 -= arg3 * var9;
                    var30 -= arg3 * var8;
                    arg3 = 0;
                }
                int var31 = arg6 << 16;
                if (arg4 < 0) {
                    var31 -= arg4 * var10;
                    arg4 = 0;
                }
                if ((arg3 == arg4 || var8 >= var9) && (arg3 != arg4 || var8 <= var10)) {
                    int var35 = arg5 - arg4;
                    int var36 = arg4 - arg3;
                    int var37 = this.field6931 * arg3;
                    while (true) {
                        var36--;
                        if (var36 < 0) {
                            while (true) {
                                var35--;
                                if (var35 < 0) {
                                    return;
                                }
                                class79.method628(this.field6934, var30 >> 16, var37, 11567, var31 >> 16, 0);
                                var31 += var10;
                                var30 += var8;
                                var37 += this.field6931;
                            }
                        }
                        class79.method628(this.field6934, var30 >> 16, var37, 11567, var29 >> 16, 0);
                        var29 += var9;
                        var37 += this.field6931;
                        var30 += var8;
                    }
                } else {
                    int var32 = arg5 - arg4;
                    int var33 = arg4 - arg3;
                    int var34 = this.field6931 * arg3;
                    while (true) {
                        var33--;
                        if (var33 < 0) {
                            while (true) {
                                var32--;
                                if (var32 < 0) {
                                    return;
                                }
                                class79.method628(this.field6934, var31 >> 16, var34, 11567, var30 >> 16, 0);
                                var34 += this.field6931;
                                var30 += var8;
                                var31 += var10;
                            }
                        }
                        class79.method628(this.field6934, var29 >> 16, var34, 11567, var30 >> 16, 0);
                        var34 += this.field6931;
                        var29 += var9;
                        var30 += var8;
                    }
                }
            } else {
                int var38;
                int var39 = var38 = arg1 << 16;
                int var40 = arg0 << 16;
                if (arg3 < 0) {
                    var39 -= arg3 * var8;
                    var38 -= arg3 * var9;
                    arg3 = 0;
                }
                if (arg5 < 0) {
                    var40 -= arg5 * var10;
                    arg5 = 0;
                }
                if (var9 > var8) {
                    int var41 = arg4 - arg5;
                    int var42 = arg5 - arg3;
                    int var43 = this.field6931 * arg3;
                    while (true) {
                        var42--;
                        if (var42 < 0) {
                            while (true) {
                                var41--;
                                if (var41 < 0) {
                                    return;
                                }
                                class79.method628(this.field6934, var38 >> 16, var43, 11567, var40 >> 16, 0);
                                var43 += this.field6931;
                                var40 += var10;
                                var38 += var9;
                            }
                        }
                        class79.method628(this.field6934, var38 >> 16, var43, 11567, var39 >> 16, 0);
                        var39 += var8;
                        var38 += var9;
                        var43 += this.field6931;
                    }
                } else {
                    int var44 = arg4 - arg5;
                    int var45 = arg5 - arg3;
                    int var46 = this.field6931 * arg3;
                    while (true) {
                        var45--;
                        if (var45 < 0) {
                            while (true) {
                                var44--;
                                if (var44 < 0) {
                                    return;
                                }
                                class79.method628(this.field6934, var40 >> 16, var46, 11567, var38 >> 16, 0);
                                var40 += var10;
                                var46 += this.field6931;
                                var38 += var9;
                            }
                        }
                        class79.method628(this.field6934, var39 >> 16, var46, 11567, var38 >> 16, 0);
                        var46 += this.field6931;
                        var38 += var9;
                        var39 += var8;
                    }
                }
            }
        } else if (arg3 <= arg5) {
            int var47;
            int var48 = var47 = arg6 << 16;
            int var49 = arg1 << 16;
            if (arg4 < 0) {
                var48 -= arg4 * var9;
                var47 -= arg4 * var10;
                arg4 = 0;
            }
            if (arg3 < 0) {
                var49 -= arg3 * var8;
                arg3 = 0;
            }
            if (var10 > var9) {
                int var50 = arg5 - arg3;
                int var51 = arg3 - arg4;
                int var52 = this.field6931 * arg4;
                while (true) {
                    var51--;
                    if (var51 < 0) {
                        while (true) {
                            var50--;
                            if (var50 < 0) {
                                return;
                            }
                            class79.method628(this.field6934, var47 >> 16, var52, 11567, var49 >> 16, 0);
                            var52 += this.field6931;
                            var49 += var8;
                            var47 += var10;
                        }
                    }
                    class79.method628(this.field6934, var47 >> 16, var52, 11567, var48 >> 16, 0);
                    var52 += this.field6931;
                    var47 += var10;
                    var48 += var9;
                }
            } else {
                int var53 = arg5 - arg3;
                int var54 = arg3 - arg4;
                int var55 = this.field6931 * arg4;
                while (true) {
                    var54--;
                    if (var54 < 0) {
                        while (true) {
                            var53--;
                            if (var53 < 0) {
                                return;
                            }
                            class79.method628(this.field6934, var49 >> 16, var55, arg2 ^ 0x2D2B, var47 >> 16, 0);
                            var47 += var10;
                            var55 += this.field6931;
                            var49 += var8;
                        }
                    }
                    class79.method628(this.field6934, var48 >> 16, var55, 11567, var47 >> 16, 0);
                    var48 += var9;
                    var55 += this.field6931;
                    var47 += var10;
                }
            }
        } else {
            int var56;
            int var57 = var56 = arg6 << 16;
            if (arg4 < 0) {
                var56 -= arg4 * var10;
                var57 -= arg4 * var9;
                arg4 = 0;
            }
            int var58 = arg0 << 16;
            if (arg5 < 0) {
                var58 -= arg5 * var8;
                arg5 = 0;
            }
            if (var10 > var9) {
                int var59 = arg3 - arg5;
                int var60 = arg5 - arg4;
                int var61 = this.field6931 * arg4;
                while (true) {
                    var60--;
                    if (var60 < 0) {
                        while (true) {
                            var59--;
                            if (var59 < 0) {
                                return;
                            }
                            class79.method628(this.field6934, var58 >> 16, var61, arg2 + 11563, var57 >> 16, 0);
                            var57 += var9;
                            var58 += var8;
                            var61 += this.field6931;
                        }
                    }
                    class79.method628(this.field6934, var56 >> 16, var61, 11567, var57 >> 16, 0);
                    var57 += var9;
                    var61 += this.field6931;
                    var56 += var10;
                }
            } else {
                int var62 = arg3 - arg5;
                int var63 = arg5 - arg4;
                int var64 = this.field6931 * arg4;
                while (true) {
                    var63--;
                    if (var63 < 0) {
                        while (true) {
                            var62--;
                            if (var62 < 0) {
                                return;
                            }
                            class79.method628(this.field6934, var57 >> 16, var64, 11567, var58 >> 16, 0);
                            var64 += this.field6931;
                            var58 += var8;
                            var57 += var9;
                        }
                    }
                    class79.method628(this.field6934, var57 >> 16, var64, 11567, var56 >> 16, 0);
                    var57 += var9;
                    var56 += var10;
                    var64 += this.field6931;
                }
            }
        }
    }

    @OriginalMember(owner = "client!hv", name = "c", descriptor = "(I)V")
    public final void method2889(int arg0) {
        field6936++;
        if (arg0 <= 112) {
            return;
        }
        int var2 = -1;
        int var3 = this.field6934.length - 8;
        while (var2 < var3) {
            var2++;
            this.field6934[var2] = 0;
            var2++;
            this.field6934[var2] = 0;
            var2++;
            this.field6934[var2] = 0;
            var2++;
            this.field6934[var2] = 0;
            var2++;
            this.field6934[var2] = 0;
            var2++;
            this.field6934[var2] = 0;
            var2++;
            this.field6934[var2] = 0;
            var2++;
            this.field6934[var2] = 0;
        }
        while (this.field6934.length - 1 > var2) {
            var2++;
            this.field6934[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!hv", name = "<init>", descriptor = "(Lrv;II)V")
    public class520(class111 arg0, int arg1, int arg2) {
        this.field6934 = new byte[arg1 * arg2];
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(IIIIIIZLha;)V")
    public static final void method2890(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, class59 arg7) {
        arg7.method489(arg1, 99, arg4, arg0, arg5, arg3);
        field6933++;
        if (!arg6) {
            arg7.method489(arg1 - 2, 60, 16, arg0 + 1, arg5 + 1, arg2);
            arg7.method434(arg4 - 19, arg2, arg1 - 2, 111, arg0 + 18, arg5 + 1);
        }
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(IIIII)V")
    public final void method2891(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field6941 = arg4;
        this.field6925 = arg0 - arg1;
        field6935++;
        this.field6939 = arg1;
        if (arg2 != -18573) {
            method2890(124, -10, 85, -126, 23, 48, false, null);
        }
        this.field6931 = arg3 - arg4;
    }
}
