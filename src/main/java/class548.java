import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nw")
public class class548 extends class276 {

    @OriginalMember(owner = "client!nw", name = "I", descriptor = "[B")
    public byte[] field7312;

    @OriginalMember(owner = "client!nw", name = "G", descriptor = "Ldb;")
    public static class298 field7310 = new class298(16, 6);

    @OriginalMember(owner = "client!nw", name = "O", descriptor = "[I")
    public static int[] field7316 = new int[25];

    @OriginalMember(owner = "client!nw", name = "Q", descriptor = "[Lvc;")
    public static class293[] field7318 = new class293[75];

    @OriginalMember(owner = "client!nw", name = "z", descriptor = "I")
    public static int field7304;

    @OriginalMember(owner = "client!nw", name = "A", descriptor = "I")
    public int field7305;

    @OriginalMember(owner = "client!nw", name = "B", descriptor = "I")
    public int field7306;

    @OriginalMember(owner = "client!nw", name = "D", descriptor = "I")
    public static int field7307;

    @OriginalMember(owner = "client!nw", name = "E", descriptor = "I")
    public int field7308;

    @OriginalMember(owner = "client!nw", name = "F", descriptor = "I")
    public static int field7309;

    @OriginalMember(owner = "client!nw", name = "H", descriptor = "I")
    public static int field7311;

    @OriginalMember(owner = "client!nw", name = "K", descriptor = "I")
    public static int field7314;

    @OriginalMember(owner = "client!nw", name = "M", descriptor = "I")
    public static int field7315;

    @OriginalMember(owner = "client!nw", name = "P", descriptor = "I")
    public int field7317;

    @OriginalMember(owner = "client!nw", name = "R", descriptor = "I")
    public static int field7319;

    @OriginalMember(owner = "client!nw", name = "J", descriptor = "[Lxa;")
    public static class468[] field7313;

    @OriginalMember(owner = "client!nw", name = "c", descriptor = "(I)V")
    public static final void method3044(int arg0) {
        if (arg0 <= 121) {
            method3044(97);
        }
        field7314++;
        class116.field1986 = class358.method2112(35, 65535, 0.4F, 2048, 4, true, 8, 8);
    }

    @OriginalMember(owner = "client!nw", name = "b", descriptor = "(Z)V")
    public final void method3045(boolean arg0) {
        field7304++;
        int var2 = -1;
        int var3 = this.field7312.length - 8;
        while (var3 > var2) {
            var2++;
            this.field7312[var2] = 0;
            var2++;
            this.field7312[var2] = 0;
            var2++;
            this.field7312[var2] = 0;
            var2++;
            this.field7312[var2] = 0;
            var2++;
            this.field7312[var2] = 0;
            var2++;
            this.field7312[var2] = 0;
            var2++;
            this.field7312[var2] = 0;
            var2++;
            this.field7312[var2] = 0;
        }
        if (!arg0) {
            this.method3045(false);
        }
        while ((this.field7312.length - 1) > var2) {
            var2++;
            this.field7312[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(IIIII)V")
    public final void method3046(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field7305 = arg4 - arg2;
        this.field7308 = arg1 - arg0;
        this.field7317 = arg2;
        this.field7306 = arg0;
        field7309++;
        if (arg3 <= 106) {
            this.field7317 = -100;
        }
    }

    @OriginalMember(owner = "client!nw", name = "f", descriptor = "(I)V")
    public static void method3047(int arg0) {
        if (arg0 != 990411344) {
            field7318 = null;
        }
        field7310 = null;
        field7313 = null;
        field7318 = null;
        field7316 = null;
    }

    @OriginalMember(owner = "client!nw", name = "c", descriptor = "(B)[I")
    public static final int[] method3048(byte arg0) {
        if (arg0 > -40) {
            method3047(-94);
        }
        field7311++;
        return new int[] { class688.field9680, class389.field5148, class326.field4505 };
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(IZIIIII)V")
    public final void method3049(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field7319++;
        int var8 = 0;
        if (arg3 != arg4) {
            var8 = (arg0 - arg6 << 16) / (arg4 - arg3);
        }
        int var9 = 0;
        if (arg1) {
            this.field7317 = -114;
        }
        if (arg2 != arg4) {
            var9 = (arg5 - arg0 << 16) / (arg2 - arg4);
        }
        int var10 = 0;
        if (arg2 != arg3) {
            var10 = (arg6 - arg5 << 16) / (arg3 - arg2);
        }
        if (arg4 >= arg3 && arg3 <= arg2) {
            if (arg2 > arg4) {
                int var11;
                int var12 = var11 = arg6 << 16;
                if (arg3 < 0) {
                    var11 -= arg3 * var8;
                    var12 -= arg3 * var10;
                    arg3 = 0;
                }
                int var13 = arg0 << 16;
                if (arg4 < 0) {
                    var13 -= arg4 * var9;
                    arg4 = 0;
                }
                if ((arg3 == arg4 || var8 <= var10) && (arg3 != arg4 || var9 >= var10)) {
                    int var17 = arg2 - arg4;
                    int var18 = arg4 - arg3;
                    int var19 = this.field7305 * arg3;
                    while (true) {
                        var18--;
                        if (var18 < 0) {
                            while (true) {
                                var17--;
                                if (var17 < 0) {
                                    return;
                                }
                                class148.method1064(true, var13 >> 16, var19, 0, var12 >> 16, this.field7312);
                                var12 += var10;
                                var19 += this.field7305;
                                var13 += var9;
                            }
                        }
                        class148.method1064(true, var11 >> 16, var19, 0, var12 >> 16, this.field7312);
                        var12 += var10;
                        var11 += var8;
                        var19 += this.field7305;
                    }
                } else {
                    int var14 = arg2 - arg4;
                    int var15 = arg4 - arg3;
                    int var16 = this.field7305 * arg3;
                    while (true) {
                        var15--;
                        if (var15 < 0) {
                            while (true) {
                                var14--;
                                if (var14 < 0) {
                                    return;
                                }
                                class148.method1064(true, var12 >> 16, var16, 0, var13 >> 16, this.field7312);
                                var12 += var10;
                                var13 += var9;
                                var16 += this.field7305;
                            }
                        }
                        class148.method1064(true, var12 >> 16, var16, 0, var11 >> 16, this.field7312);
                        var11 += var8;
                        var12 += var10;
                        var16 += this.field7305;
                    }
                }
            } else {
                int var20;
                int var21 = var20 = arg6 << 16;
                int var22 = arg5 << 16;
                if (arg3 < 0) {
                    var21 -= arg3 * var10;
                    var20 -= arg3 * var8;
                    arg3 = 0;
                }
                if (arg2 < 0) {
                    var22 -= arg2 * var9;
                    arg2 = 0;
                }
                if (arg2 != arg3 && var8 > var10 || arg2 == arg3 && var8 < var9) {
                    int var23 = arg4 - arg2;
                    int var24 = arg2 - arg3;
                    int var25 = this.field7305 * arg3;
                    while (true) {
                        var24--;
                        if (var24 < 0) {
                            while (true) {
                                var23--;
                                if (var23 < 0) {
                                    return;
                                }
                                class148.method1064(true, var22 >> 16, var25, 0, var20 >> 16, this.field7312);
                                var25 += this.field7305;
                                var22 += var9;
                                var20 += var8;
                            }
                        }
                        class148.method1064(true, var21 >> 16, var25, 0, var20 >> 16, this.field7312);
                        var25 += this.field7305;
                        var21 += var10;
                        var20 += var8;
                    }
                } else {
                    int var26 = arg4 - arg2;
                    int var27 = arg2 - arg3;
                    int var28 = this.field7305 * arg3;
                    while (true) {
                        var27--;
                        if (var27 < 0) {
                            while (true) {
                                var26--;
                                if (var26 < 0) {
                                    return;
                                }
                                class148.method1064(true, var20 >> 16, var28, 0, var22 >> 16, this.field7312);
                                var20 += var8;
                                var22 += var9;
                                var28 += this.field7305;
                            }
                        }
                        class148.method1064(true, var20 >> 16, var28, 0, var21 >> 16, this.field7312);
                        var21 += var10;
                        var20 += var8;
                        var28 += this.field7305;
                    }
                }
            }
        } else if (arg2 >= arg4) {
            if (arg2 >= arg3) {
                int var29;
                int var30 = var29 = arg0 << 16;
                int var31 = arg6 << 16;
                if (arg4 < 0) {
                    var30 -= arg4 * var8;
                    var29 -= arg4 * var9;
                    arg4 = 0;
                }
                if (arg3 < 0) {
                    var31 -= arg3 * var10;
                    arg3 = 0;
                }
                if (var8 < var9) {
                    int var32 = arg2 - arg3;
                    int var33 = arg3 - arg4;
                    int var34 = this.field7305 * arg4;
                    while (true) {
                        var33--;
                        if (var33 < 0) {
                            while (true) {
                                var32--;
                                if (var32 < 0) {
                                    return;
                                }
                                class148.method1064(true, var31 >> 16, var34, 0, var29 >> 16, this.field7312);
                                var34 += this.field7305;
                                var29 += var9;
                                var31 += var10;
                            }
                        }
                        class148.method1064(true, var30 >> 16, var34, 0, var29 >> 16, this.field7312);
                        var34 += this.field7305;
                        var29 += var9;
                        var30 += var8;
                    }
                } else {
                    int var35 = arg2 - arg3;
                    int var36 = arg3 - arg4;
                    int var37 = this.field7305 * arg4;
                    while (true) {
                        var36--;
                        if (var36 < 0) {
                            while (true) {
                                var35--;
                                if (var35 < 0) {
                                    return;
                                }
                                class148.method1064(true, var29 >> 16, var37, 0, var31 >> 16, this.field7312);
                                var31 += var10;
                                var37 += this.field7305;
                                var29 += var9;
                            }
                        }
                        class148.method1064(true, var29 >> 16, var37, 0, var30 >> 16, this.field7312);
                        var37 += this.field7305;
                        var30 += var8;
                        var29 += var9;
                    }
                }
            } else {
                int var38;
                int var39 = var38 = arg0 << 16;
                if (arg4 < 0) {
                    var38 -= arg4 * var9;
                    var39 -= arg4 * var8;
                    arg4 = 0;
                }
                int var40 = arg5 << 16;
                if (arg2 < 0) {
                    var40 -= arg2 * var10;
                    arg2 = 0;
                }
                if (arg2 != arg4 && var9 > var8 || arg2 == arg4 && var8 > var10) {
                    int var41 = arg3 - arg2;
                    int var42 = arg2 - arg4;
                    int var43 = this.field7305 * arg4;
                    while (true) {
                        var42--;
                        if (var42 < 0) {
                            while (true) {
                                var41--;
                                if (var41 < 0) {
                                    return;
                                }
                                class148.method1064(true, var39 >> 16, var43, 0, var40 >> 16, this.field7312);
                                var39 += var8;
                                var43 += this.field7305;
                                var40 += var10;
                            }
                        }
                        class148.method1064(!arg1, var39 >> 16, var43, 0, var38 >> 16, this.field7312);
                        var43 += this.field7305;
                        var39 += var8;
                        var38 += var9;
                    }
                } else {
                    int var44 = arg3 - arg2;
                    int var45 = arg2 - arg4;
                    int var46 = this.field7305 * arg4;
                    while (true) {
                        var45--;
                        if (var45 < 0) {
                            while (true) {
                                var44--;
                                if (var44 < 0) {
                                    return;
                                }
                                class148.method1064(true, var40 >> 16, var46, 0, var39 >> 16, this.field7312);
                                var46 += this.field7305;
                                var39 += var8;
                                var40 += var10;
                            }
                        }
                        class148.method1064(!arg1, var38 >> 16, var46, 0, var39 >> 16, this.field7312);
                        var46 += this.field7305;
                        var38 += var9;
                        var39 += var8;
                    }
                }
            }
        } else if (arg4 <= arg3) {
            int var47;
            int var48 = var47 = arg5 << 16;
            if (arg2 < 0) {
                var47 -= arg2 * var10;
                var48 -= arg2 * var9;
                arg2 = 0;
            }
            int var49 = arg0 << 16;
            if (arg4 < 0) {
                var49 -= arg4 * var8;
                arg4 = 0;
            }
            if (var9 < var10) {
                int var50 = arg3 - arg4;
                int var51 = arg4 - arg2;
                int var52 = this.field7305 * arg2;
                while (true) {
                    var51--;
                    if (var51 < 0) {
                        while (true) {
                            var50--;
                            if (var50 < 0) {
                                return;
                            }
                            class148.method1064(true, var49 >> 16, var52, 0, var47 >> 16, this.field7312);
                            var49 += var8;
                            var52 += this.field7305;
                            var47 += var10;
                        }
                    }
                    class148.method1064(!arg1, var48 >> 16, var52, 0, var47 >> 16, this.field7312);
                    var47 += var10;
                    var52 += this.field7305;
                    var48 += var9;
                }
            } else {
                int var53 = arg3 - arg4;
                int var54 = arg4 - arg2;
                int var55 = this.field7305 * arg2;
                while (true) {
                    var54--;
                    if (var54 < 0) {
                        while (true) {
                            var53--;
                            if (var53 < 0) {
                                return;
                            }
                            class148.method1064(true, var47 >> 16, var55, 0, var49 >> 16, this.field7312);
                            var55 += this.field7305;
                            var49 += var8;
                            var47 += var10;
                        }
                    }
                    class148.method1064(true, var47 >> 16, var55, 0, var48 >> 16, this.field7312);
                    var55 += this.field7305;
                    var47 += var10;
                    var48 += var9;
                }
            }
        } else {
            int var56;
            int var57 = var56 = arg5 << 16;
            if (arg2 < 0) {
                var56 -= arg2 * var10;
                var57 -= arg2 * var9;
                arg2 = 0;
            }
            int var58 = arg6 << 16;
            if (arg3 < 0) {
                var58 -= arg3 * var8;
                arg3 = 0;
            }
            if (var10 > var9) {
                int var59 = arg4 - arg3;
                int var60 = arg3 - arg2;
                int var61 = this.field7305 * arg2;
                while (true) {
                    var60--;
                    if (var60 < 0) {
                        while (true) {
                            var59--;
                            if (var59 < 0) {
                                return;
                            }
                            class148.method1064(true, var57 >> 16, var61, 0, var58 >> 16, this.field7312);
                            var58 += var8;
                            var57 += var9;
                            var61 += this.field7305;
                        }
                    }
                    class148.method1064(true, var57 >> 16, var61, 0, var56 >> 16, this.field7312);
                    var57 += var9;
                    var61 += this.field7305;
                    var56 += var10;
                }
            } else {
                int var62 = arg4 - arg3;
                int var63 = arg3 - arg2;
                int var64 = this.field7305 * arg2;
                while (true) {
                    var63--;
                    if (var63 < 0) {
                        while (true) {
                            var62--;
                            if (var62 < 0) {
                                return;
                            }
                            class148.method1064(true, var58 >> 16, var64, 0, var57 >> 16, this.field7312);
                            var57 += var9;
                            var58 += var8;
                            var64 += this.field7305;
                        }
                    }
                    class148.method1064(true, var56 >> 16, var64, 0, var57 >> 16, this.field7312);
                    var56 += var10;
                    var57 += var9;
                    var64 += this.field7305;
                }
            }
        }
    }

    @OriginalMember(owner = "client!nw", name = "<init>", descriptor = "(Lno;II)V")
    public class548(class658 arg0, int arg1, int arg2) {
        this.field7312 = new byte[arg1 * arg2];
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(III)Z")
    public final boolean method3050(int arg0, int arg1, int arg2) {
        if (arg1 != -25219) {
            field7316 = null;
        }
        field7307++;
        return arg0 * arg2 <= this.field7312.length;
    }
}
