import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class443 extends class54 {

    @OriginalMember(owner = "client!gk", name = "x", descriptor = "[B")
    public byte[] field6373;

    @OriginalMember(owner = "client!gk", name = "A", descriptor = "Lio;")
    public static class406 field6376 = class288.method1918(-1);

    @OriginalMember(owner = "client!gk", name = "E", descriptor = "[I")
    public static int[] field6380 = new int[4096];

    @OriginalMember(owner = "client!gk", name = "v", descriptor = "I")
    public static int field6371;

    @OriginalMember(owner = "client!gk", name = "w", descriptor = "I")
    public static int field6372;

    @OriginalMember(owner = "client!gk", name = "y", descriptor = "I")
    public int field6374;

    @OriginalMember(owner = "client!gk", name = "z", descriptor = "I")
    public int field6375;

    @OriginalMember(owner = "client!gk", name = "B", descriptor = "I")
    public static int field6377;

    @OriginalMember(owner = "client!gk", name = "C", descriptor = "I")
    public static int field6378;

    @OriginalMember(owner = "client!gk", name = "D", descriptor = "I")
    public int field6379;

    @OriginalMember(owner = "client!gk", name = "F", descriptor = "I")
    public int field6381;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIIIZ)V")
    public final void method2665(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field6381 = arg0;
        if (arg4) {
            this.field6379 = arg1 - arg0;
            this.field6375 = arg2;
            field6378++;
            this.field6374 = arg3 - arg2;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(I)V")
    public static void method2666(int arg0) {
        field6376 = null;
        field6380 = null;
        if (arg0 != 1958569904) {
            method2666(-55);
        }
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(BII)Z")
    public final boolean method2667(byte arg0, int arg1, int arg2) {
        field6371++;
        if (arg0 != 16) {
            method2666(27);
        }
        return arg1 * arg2 <= this.field6373.length;
    }

    @OriginalMember(owner = "client!gk", name = "g", descriptor = "(I)V")
    public final void method2668(int arg0) {
        field6377++;
        int var2 = -1;
        if (arg0 >= -46) {
            method2666(85);
        }
        int var3 = this.field6373.length - 8;
        while (var2 < var3) {
            var2++;
            this.field6373[var2] = 0;
            var2++;
            this.field6373[var2] = 0;
            var2++;
            this.field6373[var2] = 0;
            var2++;
            this.field6373[var2] = 0;
            var2++;
            this.field6373[var2] = 0;
            var2++;
            this.field6373[var2] = 0;
            var2++;
            this.field6373[var2] = 0;
            var2++;
            this.field6373[var2] = 0;
        }
        while (var2 < this.field6373.length - 1) {
            var2++;
            this.field6373[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIIZIII)V")
    public final void method2669(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        if (arg3) {
            this.method2668(0);
        }
        field6372++;
        int var8 = 0;
        if (arg2 != arg5) {
            var8 = (arg1 - arg0 << 16) / (arg5 - arg2);
        }
        int var9 = 0;
        if (arg4 != arg5) {
            var9 = (arg6 - arg1 << 16) / (arg4 - arg5);
        }
        int var10 = 0;
        if (arg2 != arg4) {
            var10 = (arg0 - arg6 << 16) / (arg2 - arg4);
        }
        if (arg5 >= arg2 && arg2 <= arg4) {
            if (arg4 > arg5) {
                int var11;
                int var12 = var11 = arg0 << 16;
                int var13 = arg1 << 16;
                if (arg2 < 0) {
                    var12 -= arg2 * var10;
                    var11 -= arg2 * var8;
                    arg2 = 0;
                }
                if (arg5 < 0) {
                    var13 -= arg5 * var9;
                    arg5 = 0;
                }
                if ((arg2 == arg5 || var8 <= var10) && (arg2 != arg5 || var9 >= var10)) {
                    int var17 = arg4 - arg5;
                    int var18 = arg5 - arg2;
                    int var19 = this.field6374 * arg2;
                    while (true) {
                        var18--;
                        if (var18 < 0) {
                            while (true) {
                                var17--;
                                if (var17 < 0) {
                                    return;
                                }
                                class255.method1697(this.field6373, var13 >> 16, -32709, var19, 0, var12 >> 16);
                                var12 += var10;
                                var19 += this.field6374;
                                var13 += var9;
                            }
                        }
                        class255.method1697(this.field6373, var11 >> 16, -32709, var19, 0, var12 >> 16);
                        var19 += this.field6374;
                        var12 += var10;
                        var11 += var8;
                    }
                } else {
                    int var14 = arg4 - arg5;
                    int var15 = arg5 - arg2;
                    int var16 = this.field6374 * arg2;
                    while (true) {
                        var15--;
                        if (var15 < 0) {
                            while (true) {
                                var14--;
                                if (var14 < 0) {
                                    return;
                                }
                                class255.method1697(this.field6373, var12 >> 16, -32709, var16, 0, var13 >> 16);
                                var13 += var9;
                                var12 += var10;
                                var16 += this.field6374;
                            }
                        }
                        class255.method1697(this.field6373, var12 >> 16, -32709, var16, 0, var11 >> 16);
                        var12 += var10;
                        var11 += var8;
                        var16 += this.field6374;
                    }
                }
            } else {
                int var20;
                int var21 = var20 = arg0 << 16;
                if (arg2 < 0) {
                    var20 -= arg2 * var8;
                    var21 -= arg2 * var10;
                    arg2 = 0;
                }
                int var22 = arg6 << 16;
                if (arg4 < 0) {
                    var22 -= arg4 * var9;
                    arg4 = 0;
                }
                if (arg2 != arg4 && var8 > var10 || arg2 == arg4 && var8 < var9) {
                    int var23 = arg5 - arg4;
                    int var24 = arg4 - arg2;
                    int var25 = this.field6374 * arg2;
                    while (true) {
                        var24--;
                        if (var24 < 0) {
                            while (true) {
                                var23--;
                                if (var23 < 0) {
                                    return;
                                }
                                class255.method1697(this.field6373, var22 >> 16, -32709, var25, 0, var20 >> 16);
                                var22 += var9;
                                var20 += var8;
                                var25 += this.field6374;
                            }
                        }
                        class255.method1697(this.field6373, var21 >> 16, -32709, var25, 0, var20 >> 16);
                        var21 += var10;
                        var25 += this.field6374;
                        var20 += var8;
                    }
                } else {
                    int var26 = arg5 - arg4;
                    int var27 = arg4 - arg2;
                    int var28 = this.field6374 * arg2;
                    while (true) {
                        var27--;
                        if (var27 < 0) {
                            while (true) {
                                var26--;
                                if (var26 < 0) {
                                    return;
                                }
                                class255.method1697(this.field6373, var20 >> 16, -32709, var28, 0, var22 >> 16);
                                var20 += var8;
                                var22 += var9;
                                var28 += this.field6374;
                            }
                        }
                        class255.method1697(this.field6373, var20 >> 16, -32709, var28, 0, var21 >> 16);
                        var21 += var10;
                        var20 += var8;
                        var28 += this.field6374;
                    }
                }
            }
        } else if (arg5 > arg4) {
            if (arg5 > arg2) {
                int var29;
                int var30 = var29 = arg6 << 16;
                if (arg4 < 0) {
                    var29 -= arg4 * var10;
                    var30 -= arg4 * var9;
                    arg4 = 0;
                }
                int var31 = arg0 << 16;
                if (arg2 < 0) {
                    var31 -= arg2 * var8;
                    arg2 = 0;
                }
                if (var9 < var10) {
                    int var32 = arg5 - arg2;
                    int var33 = arg2 - arg4;
                    int var34 = this.field6374 * arg4;
                    while (true) {
                        var33--;
                        if (var33 < 0) {
                            while (true) {
                                var32--;
                                if (var32 < 0) {
                                    return;
                                }
                                class255.method1697(this.field6373, var30 >> 16, -32709, var34, 0, var31 >> 16);
                                var30 += var9;
                                var34 += this.field6374;
                                var31 += var8;
                            }
                        }
                        class255.method1697(this.field6373, var30 >> 16, -32709, var34, 0, var29 >> 16);
                        var34 += this.field6374;
                        var30 += var9;
                        var29 += var10;
                    }
                } else {
                    int var35 = arg5 - arg2;
                    int var36 = arg2 - arg4;
                    int var37 = this.field6374 * arg4;
                    while (true) {
                        var36--;
                        if (var36 < 0) {
                            while (true) {
                                var35--;
                                if (var35 < 0) {
                                    return;
                                }
                                class255.method1697(this.field6373, var31 >> 16, -32709, var37, 0, var30 >> 16);
                                var31 += var8;
                                var37 += this.field6374;
                                var30 += var9;
                            }
                        }
                        class255.method1697(this.field6373, var29 >> 16, -32709, var37, 0, var30 >> 16);
                        var37 += this.field6374;
                        var29 += var10;
                        var30 += var9;
                    }
                }
            } else {
                int var38;
                int var39 = var38 = arg6 << 16;
                int var40 = arg1 << 16;
                if (arg4 < 0) {
                    var38 -= arg4 * var10;
                    var39 -= arg4 * var9;
                    arg4 = 0;
                }
                if (arg5 < 0) {
                    var40 -= arg5 * var8;
                    arg5 = 0;
                }
                if (var9 >= var10) {
                    int var41 = arg2 - arg5;
                    int var42 = arg5 - arg4;
                    int var43 = this.field6374 * arg4;
                    while (true) {
                        var42--;
                        if (var42 < 0) {
                            while (true) {
                                var41--;
                                if (var41 < 0) {
                                    return;
                                }
                                class255.method1697(this.field6373, var38 >> 16, -32709, var43, 0, var40 >> 16);
                                var38 += var10;
                                var40 += var8;
                                var43 += this.field6374;
                            }
                        }
                        class255.method1697(this.field6373, var38 >> 16, -32709, var43, 0, var39 >> 16);
                        var43 += this.field6374;
                        var38 += var10;
                        var39 += var9;
                    }
                } else {
                    int var44 = arg2 - arg5;
                    int var45 = arg5 - arg4;
                    int var46 = this.field6374 * arg4;
                    while (true) {
                        var45--;
                        if (var45 < 0) {
                            while (true) {
                                var44--;
                                if (var44 < 0) {
                                    return;
                                }
                                class255.method1697(this.field6373, var40 >> 16, -32709, var46, 0, var38 >> 16);
                                var40 += var8;
                                var46 += this.field6374;
                                var38 += var10;
                            }
                        }
                        class255.method1697(this.field6373, var39 >> 16, -32709, var46, 0, var38 >> 16);
                        var39 += var9;
                        var38 += var10;
                        var46 += this.field6374;
                    }
                }
            }
        } else if (arg2 <= arg4) {
            int var47;
            int var48 = var47 = arg1 << 16;
            if (arg5 < 0) {
                var47 -= arg5 * var9;
                var48 -= arg5 * var8;
                arg5 = 0;
            }
            int var49 = arg0 << 16;
            if (arg2 < 0) {
                var49 -= arg2 * var10;
                arg2 = 0;
            }
            if (var8 < var9) {
                int var50 = arg4 - arg2;
                int var51 = arg2 - arg5;
                int var52 = this.field6374 * arg5;
                while (true) {
                    var51--;
                    if (var51 < 0) {
                        while (true) {
                            var50--;
                            if (var50 < 0) {
                                return;
                            }
                            class255.method1697(this.field6373, var49 >> 16, -32709, var52, 0, var47 >> 16);
                            var47 += var9;
                            var52 += this.field6374;
                            var49 += var10;
                        }
                    }
                    class255.method1697(this.field6373, var48 >> 16, -32709, var52, 0, var47 >> 16);
                    var47 += var9;
                    var52 += this.field6374;
                    var48 += var8;
                }
            } else {
                int var53 = arg4 - arg2;
                int var54 = arg2 - arg5;
                int var55 = this.field6374 * arg5;
                while (true) {
                    var54--;
                    if (var54 < 0) {
                        while (true) {
                            var53--;
                            if (var53 < 0) {
                                return;
                            }
                            class255.method1697(this.field6373, var47 >> 16, -32709, var55, 0, var49 >> 16);
                            var55 += this.field6374;
                            var47 += var9;
                            var49 += var10;
                        }
                    }
                    class255.method1697(this.field6373, var47 >> 16, -32709, var55, 0, var48 >> 16);
                    var55 += this.field6374;
                    var48 += var8;
                    var47 += var9;
                }
            }
        } else {
            int var56;
            int var57 = var56 = arg1 << 16;
            int var58 = arg6 << 16;
            if (arg5 < 0) {
                var57 -= arg5 * var8;
                var56 -= arg5 * var9;
                arg5 = 0;
            }
            if (arg4 < 0) {
                var58 -= arg4 * var10;
                arg4 = 0;
            }
            if (arg4 != arg5 && var8 < var9 || arg4 == arg5 && var10 < var8) {
                int var59 = arg2 - arg4;
                int var60 = arg4 - arg5;
                int var61 = this.field6374 * arg5;
                while (true) {
                    var60--;
                    if (var60 < 0) {
                        while (true) {
                            var59--;
                            if (var59 < 0) {
                                return;
                            }
                            class255.method1697(this.field6373, var57 >> 16, -32709, var61, 0, var58 >> 16);
                            var57 += var8;
                            var58 += var10;
                            var61 += this.field6374;
                        }
                    }
                    class255.method1697(this.field6373, var57 >> 16, -32709, var61, 0, var56 >> 16);
                    var57 += var8;
                    var56 += var9;
                    var61 += this.field6374;
                }
            } else {
                int var62 = arg2 - arg4;
                int var63 = arg4 - arg5;
                int var64 = this.field6374 * arg5;
                while (true) {
                    var63--;
                    if (var63 < 0) {
                        while (true) {
                            var62--;
                            if (var62 < 0) {
                                return;
                            }
                            class255.method1697(this.field6373, var58 >> 16, -32709, var64, 0, var57 >> 16);
                            var64 += this.field6374;
                            var57 += var8;
                            var58 += var10;
                        }
                    }
                    class255.method1697(this.field6373, var56 >> 16, -32709, var64, 0, var57 >> 16);
                    var57 += var8;
                    var56 += var9;
                    var64 += this.field6374;
                }
            }
        }
    }

    @OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(Lcf;II)V")
    public class443(class562 arg0, int arg1, int arg2) {
        this.field6373 = new byte[arg1 * arg2];
    }
}
