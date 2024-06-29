import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pca")
public class class670 extends class279 {

    @OriginalMember(owner = "client!pca", name = "y", descriptor = "[B")
    public byte[] field9100;

    @OriginalMember(owner = "client!pca", name = "I", descriptor = "[I")
    public static int[] field9109 = new int[14];

    @OriginalMember(owner = "client!pca", name = "w", descriptor = "I")
    public static int field9098;

    @OriginalMember(owner = "client!pca", name = "x", descriptor = "I")
    public int field9099;

    @OriginalMember(owner = "client!pca", name = "z", descriptor = "I")
    public int field9101;

    @OriginalMember(owner = "client!pca", name = "A", descriptor = "I")
    public int field9102;

    @OriginalMember(owner = "client!pca", name = "B", descriptor = "I")
    public static int field9103;

    @OriginalMember(owner = "client!pca", name = "C", descriptor = "I")
    public static int field9104;

    @OriginalMember(owner = "client!pca", name = "D", descriptor = "I")
    public static int field9105;

    @OriginalMember(owner = "client!pca", name = "F", descriptor = "I")
    public static int field9106;

    @OriginalMember(owner = "client!pca", name = "H", descriptor = "I")
    public int field9108;

    @OriginalMember(owner = "client!pca", name = "G", descriptor = "Lkaa;")
    public static class44 field9107;

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(IIIIIZI)V", line = 8)
    public final void method3717(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        field9103++;
        int var8 = 0;
        if (arg5) {
            return;
        }
        if (arg1 != arg3) {
            var8 = (arg6 - arg4 << 16) / (arg1 - arg3);
        }
        int var9 = 0;
        if (arg1 != arg2) {
            var9 = (arg0 - arg6 << 16) / (arg2 - arg1);
        }
        int var10 = 0;
        if (arg2 != arg3) {
            var10 = (arg4 - arg0 << 16) / (arg3 - arg2);
        }
        if (arg1 >= arg3 && arg2 >= arg3) {
            if (arg1 >= arg2) {
                int var11;
                int var12 = var11 = arg4 << 16;
                if (arg3 < 0) {
                    var12 -= arg3 * var10;
                    var11 -= arg3 * var8;
                    arg3 = 0;
                }
                int var13 = arg0 << 16;
                if (arg2 < 0) {
                    var13 -= arg2 * var9;
                    arg2 = 0;
                }
                if (arg2 != arg3 && var8 > var10 || arg2 == arg3 && var9 > var8) {
                    int var14 = arg1 - arg2;
                    int var15 = arg2 - arg3;
                    int var16 = this.field9099 * arg3;
                    while (true) {
                        var15--;
                        if (var15 < 0) {
                            while (true) {
                                var14--;
                                if (var14 < 0) {
                                    return;
                                }
                                class195.method1144(0, var13 >> 16, var11 >> 16, var16, 1917, this.field9100);
                                var16 += this.field9099;
                                var11 += var8;
                                var13 += var9;
                            }
                        }
                        class195.method1144(0, var12 >> 16, var11 >> 16, var16, 1917, this.field9100);
                        var12 += var10;
                        var11 += var8;
                        var16 += this.field9099;
                    }
                } else {
                    int var17 = arg1 - arg2;
                    int var18 = arg2 - arg3;
                    int var19 = this.field9099 * arg3;
                    while (true) {
                        var18--;
                        if (var18 < 0) {
                            while (true) {
                                var17--;
                                if (var17 < 0) {
                                    return;
                                }
                                class195.method1144(0, var11 >> 16, var13 >> 16, var19, 1917, this.field9100);
                                var13 += var9;
                                var11 += var8;
                                var19 += this.field9099;
                            }
                        }
                        class195.method1144(0, var11 >> 16, var12 >> 16, var19, 1917, this.field9100);
                        var12 += var10;
                        var11 += var8;
                        var19 += this.field9099;
                    }
                }
            } else {
                int var20;
                int var21 = var20 = arg4 << 16;
                if (arg3 < 0) {
                    var21 -= arg3 * var10;
                    var20 -= arg3 * var8;
                    arg3 = 0;
                }
                int var22 = arg6 << 16;
                if (arg1 < 0) {
                    var22 -= arg1 * var9;
                    arg1 = 0;
                }
                if (arg1 != arg3 && var8 > var10 || arg1 == arg3 && var9 < var10) {
                    int var23 = arg2 - arg1;
                    int var24 = arg1 - arg3;
                    int var25 = this.field9099 * arg3;
                    while (true) {
                        var24--;
                        if (var24 < 0) {
                            while (true) {
                                var23--;
                                if (var23 < 0) {
                                    return;
                                }
                                class195.method1144(0, var21 >> 16, var22 >> 16, var25, 1917, this.field9100);
                                var21 += var10;
                                var22 += var9;
                                var25 += this.field9099;
                            }
                        }
                        class195.method1144(0, var21 >> 16, var20 >> 16, var25, 1917, this.field9100);
                        var25 += this.field9099;
                        var21 += var10;
                        var20 += var8;
                    }
                } else {
                    int var26 = arg2 - arg1;
                    int var27 = arg1 - arg3;
                    int var28 = this.field9099 * arg3;
                    while (true) {
                        var27--;
                        if (var27 < 0) {
                            while (true) {
                                var26--;
                                if (var26 < 0) {
                                    return;
                                }
                                class195.method1144(0, var22 >> 16, var21 >> 16, var28, 1917, this.field9100);
                                var21 += var10;
                                var28 += this.field9099;
                                var22 += var9;
                            }
                        }
                        class195.method1144(0, var20 >> 16, var21 >> 16, var28, 1917, this.field9100);
                        var21 += var10;
                        var28 += this.field9099;
                        var20 += var8;
                    }
                }
            }
        } else if (arg2 >= arg1) {
            if (arg3 <= arg2) {
                int var29;
                int var30 = var29 = arg6 << 16;
                if (arg1 < 0) {
                    var30 -= arg1 * var8;
                    var29 -= arg1 * var9;
                    arg1 = 0;
                }
                int var31 = arg4 << 16;
                if (arg3 < 0) {
                    var31 -= arg3 * var10;
                    arg3 = 0;
                }
                if (var9 > var8) {
                    int var32 = arg2 - arg3;
                    int var33 = arg3 - arg1;
                    int var34 = this.field9099 * arg1;
                    while (true) {
                        var33--;
                        if (var33 < 0) {
                            while (true) {
                                var32--;
                                if (var32 < 0) {
                                    return;
                                }
                                class195.method1144(0, var31 >> 16, var29 >> 16, var34, 1917, this.field9100);
                                var31 += var10;
                                var29 += var9;
                                var34 += this.field9099;
                            }
                        }
                        class195.method1144(0, var30 >> 16, var29 >> 16, var34, 1917, this.field9100);
                        var30 += var8;
                        var34 += this.field9099;
                        var29 += var9;
                    }
                } else {
                    int var35 = arg2 - arg3;
                    int var36 = arg3 - arg1;
                    int var37 = this.field9099 * arg1;
                    while (true) {
                        var36--;
                        if (var36 < 0) {
                            while (true) {
                                var35--;
                                if (var35 < 0) {
                                    return;
                                }
                                class195.method1144(0, var29 >> 16, var31 >> 16, var37, 1917, this.field9100);
                                var31 += var10;
                                var37 += this.field9099;
                                var29 += var9;
                            }
                        }
                        class195.method1144(0, var29 >> 16, var30 >> 16, var37, 1917, this.field9100);
                        var37 += this.field9099;
                        var29 += var9;
                        var30 += var8;
                    }
                }
            } else {
                int var38;
                int var39 = var38 = arg6 << 16;
                if (arg1 < 0) {
                    var38 -= arg1 * var9;
                    var39 -= arg1 * var8;
                    arg1 = 0;
                }
                int var40 = arg0 << 16;
                if (arg2 < 0) {
                    var40 -= arg2 * var10;
                    arg2 = 0;
                }
                if (arg1 != arg2 && var9 > var8 || arg1 == arg2 && var10 < var8) {
                    int var41 = arg3 - arg2;
                    int var42 = arg2 - arg1;
                    int var43 = this.field9099 * arg1;
                    while (true) {
                        var42--;
                        if (var42 < 0) {
                            while (true) {
                                var41--;
                                if (var41 < 0) {
                                    return;
                                }
                                class195.method1144(0, var39 >> 16, var40 >> 16, var43, 1917, this.field9100);
                                var39 += var8;
                                var40 += var10;
                                var43 += this.field9099;
                            }
                        }
                        class195.method1144(0, var39 >> 16, var38 >> 16, var43, 1917, this.field9100);
                        var39 += var8;
                        var38 += var9;
                        var43 += this.field9099;
                    }
                } else {
                    int var44 = arg3 - arg2;
                    int var45 = arg2 - arg1;
                    int var46 = this.field9099 * arg1;
                    while (true) {
                        var45--;
                        if (var45 < 0) {
                            while (true) {
                                var44--;
                                if (var44 < 0) {
                                    return;
                                }
                                class195.method1144(0, var40 >> 16, var39 >> 16, var46, 1917, this.field9100);
                                var39 += var8;
                                var46 += this.field9099;
                                var40 += var10;
                            }
                        }
                        class195.method1144(0, var38 >> 16, var39 >> 16, var46, 1917, this.field9100);
                        var46 += this.field9099;
                        var38 += var9;
                        var39 += var8;
                    }
                }
            }
        } else if (arg3 >= arg1) {
            int var47;
            int var48 = var47 = arg0 << 16;
            int var49 = arg6 << 16;
            if (arg2 < 0) {
                var48 -= arg2 * var9;
                var47 -= arg2 * var10;
                arg2 = 0;
            }
            if (arg1 < 0) {
                var49 -= arg1 * var8;
                arg1 = 0;
            }
            if (var9 < var10) {
                int var50 = arg3 - arg1;
                int var51 = arg1 - arg2;
                int var52 = this.field9099 * arg2;
                while (true) {
                    var51--;
                    if (var51 < 0) {
                        while (true) {
                            var50--;
                            if (var50 < 0) {
                                return;
                            }
                            class195.method1144(0, var49 >> 16, var47 >> 16, var52, 1917, this.field9100);
                            var49 += var8;
                            var52 += this.field9099;
                            var47 += var10;
                        }
                    }
                    class195.method1144(0, var48 >> 16, var47 >> 16, var52, 1917, this.field9100);
                    var47 += var10;
                    var48 += var9;
                    var52 += this.field9099;
                }
            } else {
                int var53 = arg3 - arg1;
                int var54 = arg1 - arg2;
                int var55 = this.field9099 * arg2;
                while (true) {
                    var54--;
                    if (var54 < 0) {
                        while (true) {
                            var53--;
                            if (var53 < 0) {
                                return;
                            }
                            class195.method1144(0, var47 >> 16, var49 >> 16, var55, 1917, this.field9100);
                            var55 += this.field9099;
                            var47 += var10;
                            var49 += var8;
                        }
                    }
                    class195.method1144(0, var47 >> 16, var48 >> 16, var55, 1917, this.field9100);
                    var47 += var10;
                    var55 += this.field9099;
                    var48 += var9;
                }
            }
        } else {
            int var56;
            int var57 = var56 = arg0 << 16;
            if (arg2 < 0) {
                var56 -= arg2 * var10;
                var57 -= arg2 * var9;
                arg2 = 0;
            }
            int var58 = arg4 << 16;
            if (arg3 < 0) {
                var58 -= arg3 * var8;
                arg3 = 0;
            }
            if (var9 < var10) {
                int var59 = arg1 - arg3;
                int var60 = arg3 - arg2;
                int var61 = this.field9099 * arg2;
                while (true) {
                    var60--;
                    if (var60 < 0) {
                        while (true) {
                            var59--;
                            if (var59 < 0) {
                                return;
                            }
                            class195.method1144(0, var57 >> 16, var58 >> 16, var61, 1917, this.field9100);
                            var57 += var9;
                            var58 += var8;
                            var61 += this.field9099;
                        }
                    }
                    class195.method1144(0, var57 >> 16, var56 >> 16, var61, 1917, this.field9100);
                    var57 += var9;
                    var56 += var10;
                    var61 += this.field9099;
                }
            } else {
                int var62 = arg1 - arg3;
                int var63 = arg3 - arg2;
                int var64 = this.field9099 * arg2;
                while (true) {
                    var63--;
                    if (var63 < 0) {
                        while (true) {
                            var62--;
                            if (var62 < 0) {
                                return;
                            }
                            class195.method1144(0, var58 >> 16, var57 >> 16, var64, 1917, this.field9100);
                            var64 += this.field9099;
                            var57 += var9;
                            var58 += var8;
                        }
                    }
                    class195.method1144(0, var56 >> 16, var57 >> 16, var64, 1917, this.field9100);
                    var64 += this.field9099;
                    var56 += var10;
                    var57 += var9;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(III)Z", line = 451)
    public final boolean method3718(int arg0, int arg1, int arg2) {
        int var4 = -42 / ((15 - arg2) / 44);
        field9098++;
        return (arg0 * arg1) <= this.field9100.length;
    }

    @OriginalMember(owner = "client!pca", name = "b", descriptor = "(IIIII)V", line = 467)
    public final void method3719(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field9101 = arg0;
        field9104++;
        if (arg3 < -2) {
            this.field9099 = arg2 - arg4;
            this.field9108 = arg4;
            this.field9102 = arg1 - arg0;
        }
    }

    @OriginalMember(owner = "client!pca", name = "c", descriptor = "(B)V", line = 487)
    public static final void method3720(byte arg0) {
        class650.field8783.method1224(false);
        if (arg0 != 16) {
            field9107 = null;
        }
        field9106++;
    }

    @OriginalMember(owner = "client!pca", name = "d", descriptor = "(I)V", line = 498)
    public final void method3721(int arg0) {
        field9105++;
        int var2 = arg0;
        int var3 = this.field9100.length - 8;
        while (var3 > var2) {
            var2++;
            this.field9100[var2] = 0;
            var2++;
            this.field9100[var2] = 0;
            var2++;
            this.field9100[var2] = 0;
            var2++;
            this.field9100[var2] = 0;
            var2++;
            this.field9100[var2] = 0;
            var2++;
            this.field9100[var2] = 0;
            var2++;
            this.field9100[var2] = 0;
            var2++;
            this.field9100[var2] = 0;
        }
        while ((this.field9100.length - 1) > var2) {
            var2++;
            this.field9100[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!pca", name = "<init>", descriptor = "(Lkea;II)V", line = 527)
    public class670(class223 arg0, int arg1, int arg2) {
        this.field9100 = new byte[arg1 * arg2];
    }

    @OriginalMember(owner = "client!pca", name = "e", descriptor = "(B)V", line = 537)
    public static void method3722(byte arg0) {
        if (arg0 != -99) {
            field9109 = null;
        }
        field9109 = null;
        field9107 = null;
    }
}
