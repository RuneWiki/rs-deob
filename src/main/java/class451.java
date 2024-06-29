import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class451 extends class183 {

    @OriginalMember(owner = "client!lc", name = "M", descriptor = "[B")
    public byte[] field6418;

    @OriginalMember(owner = "client!lc", name = "D", descriptor = "I")
    public int field6415;

    @OriginalMember(owner = "client!lc", name = "J", descriptor = "I")
    public int field6416;

    @OriginalMember(owner = "client!lc", name = "L", descriptor = "I")
    public int field6417;

    @OriginalMember(owner = "client!lc", name = "N", descriptor = "I")
    public int field6419;

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "(B)V", line = 12)
    public final void method2724(byte arg0) {
        int var2 = -1;
        if (arg0 != -42) {
            return;
        }
        int var3 = this.field6418.length - 8;
        while (var3 > var2) {
            var2++;
            this.field6418[var2] = 0;
            var2++;
            this.field6418[var2] = 0;
            var2++;
            this.field6418[var2] = 0;
            var2++;
            this.field6418[var2] = 0;
            var2++;
            this.field6418[var2] = 0;
            var2++;
            this.field6418[var2] = 0;
            var2++;
            this.field6418[var2] = 0;
            var2++;
            this.field6418[var2] = 0;
        }
        while (var2 < (this.field6418.length - 1)) {
            var2++;
            this.field6418[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(III)Z", line = 39)
    public final boolean method2725(int arg0, int arg1, int arg2) {
        if (arg0 != -1053994096) {
            this.method2727(-107, -31, 108, (byte) 2, 2, -67, -35);
        }
        return this.field6418.length >= (arg1 * arg2);
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIII[BI)V", line = 50)
    private static final void method2726(int arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5) {
        if (arg0 >= arg2) {
            return;
        }
        int var6 = arg0 + arg1;
        int var7 = arg2 - arg0 >> 2;
        while (true) {
            var7--;
            if (var7 < 0) {
                if (arg3 != -16901) {
                    return;
                }
                int var8 = arg2 - arg0 & 0x3;
                while (true) {
                    var8--;
                    if (var8 < 0) {
                        return;
                    }
                    arg4[var6++] = 1;
                }
            }
            arg4[var6++] = 1;
            arg4[var6++] = 1;
            arg4[var6++] = 1;
            arg4[var6++] = 1;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIBIII)V", line = 82)
    public final void method2727(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        int var8 = 0;
        if (arg3 != -32) {
            return;
        }
        if (arg1 != arg2) {
            var8 = (arg5 - arg4 << 16) / (arg1 - arg2);
        }
        int var9 = 0;
        if (arg1 != arg6) {
            var9 = (arg0 - arg5 << 16) / (arg6 - arg1);
        }
        int var10 = 0;
        if (arg2 != arg6) {
            var10 = (arg4 - arg0 << 16) / (arg2 - arg6);
        }
        if (arg1 >= arg2 && arg6 >= arg2) {
            if (arg6 > arg1) {
                int var11;
                int var12 = var11 = arg4 << 16;
                if (arg2 < 0) {
                    var11 -= arg2 * var8;
                    var12 -= arg2 * var10;
                    arg2 = 0;
                }
                int var13 = arg5 << 16;
                if (arg1 < 0) {
                    var13 -= arg1 * var9;
                    arg1 = 0;
                }
                if (arg1 != arg2 && var10 < var8 || arg1 == arg2 && var10 > var9) {
                    int var14 = arg6 - arg1;
                    int var15 = arg1 - arg2;
                    int var16 = this.field6417 * arg2;
                    while (true) {
                        var15--;
                        if (var15 < 0) {
                            while (true) {
                                var14--;
                                if (var14 < 0) {
                                    return;
                                }
                                method2726(var12 >> 16, var16, var13 >> 16, -16901, this.field6418, 0);
                                var13 += var9;
                                var16 += this.field6417;
                                var12 += var10;
                            }
                        }
                        method2726(var12 >> 16, var16, var11 >> 16, -16901, this.field6418, 0);
                        var11 += var8;
                        var16 += this.field6417;
                        var12 += var10;
                    }
                } else {
                    int var17 = arg6 - arg1;
                    int var18 = arg1 - arg2;
                    int var19 = this.field6417 * arg2;
                    while (true) {
                        var18--;
                        if (var18 < 0) {
                            while (true) {
                                var17--;
                                if (var17 < 0) {
                                    return;
                                }
                                method2726(var13 >> 16, var19, var12 >> 16, arg3 ^ 0x421B, this.field6418, 0);
                                var12 += var10;
                                var13 += var9;
                                var19 += this.field6417;
                            }
                        }
                        method2726(var11 >> 16, var19, var12 >> 16, -16901, this.field6418, 0);
                        var11 += var8;
                        var19 += this.field6417;
                        var12 += var10;
                    }
                }
            } else {
                int var20;
                int var21 = var20 = arg4 << 16;
                int var22 = arg0 << 16;
                if (arg2 < 0) {
                    var21 -= arg2 * var10;
                    var20 -= arg2 * var8;
                    arg2 = 0;
                }
                if (arg6 < 0) {
                    var22 -= arg6 * var9;
                    arg6 = 0;
                }
                if ((arg2 == arg6 || var10 >= var8) && (arg2 != arg6 || var8 >= var9)) {
                    int var26 = arg1 - arg6;
                    int var27 = arg6 - arg2;
                    int var28 = this.field6417 * arg2;
                    while (true) {
                        var27--;
                        if (var27 < 0) {
                            while (true) {
                                var26--;
                                if (var26 < 0) {
                                    return;
                                }
                                method2726(var20 >> 16, var28, var22 >> 16, -16901, this.field6418, 0);
                                var20 += var8;
                                var22 += var9;
                                var28 += this.field6417;
                            }
                        }
                        method2726(var20 >> 16, var28, var21 >> 16, -16901, this.field6418, 0);
                        var20 += var8;
                        var28 += this.field6417;
                        var21 += var10;
                    }
                } else {
                    int var23 = arg1 - arg6;
                    int var24 = arg6 - arg2;
                    int var25 = this.field6417 * arg2;
                    while (true) {
                        var24--;
                        if (var24 < 0) {
                            while (true) {
                                var23--;
                                if (var23 < 0) {
                                    return;
                                }
                                method2726(var22 >> 16, var25, var20 >> 16, -16901, this.field6418, 0);
                                var22 += var9;
                                var25 += this.field6417;
                                var20 += var8;
                            }
                        }
                        method2726(var21 >> 16, var25, var20 >> 16, -16901, this.field6418, 0);
                        var20 += var8;
                        var25 += this.field6417;
                        var21 += var10;
                    }
                }
            }
        } else if (arg1 <= arg6) {
            if (arg6 < arg2) {
                int var29;
                int var30 = var29 = arg5 << 16;
                int var31 = arg0 << 16;
                if (arg1 < 0) {
                    var29 -= arg1 * var9;
                    var30 -= arg1 * var8;
                    arg1 = 0;
                }
                if (arg6 < 0) {
                    var31 -= arg6 * var10;
                    arg6 = 0;
                }
                if (arg1 != arg6 && var9 > var8 || arg1 == arg6 && var8 > var10) {
                    int var32 = arg2 - arg6;
                    int var33 = arg6 - arg1;
                    int var34 = this.field6417 * arg1;
                    while (true) {
                        var33--;
                        if (var33 < 0) {
                            while (true) {
                                var32--;
                                if (var32 < 0) {
                                    return;
                                }
                                method2726(var30 >> 16, var34, var31 >> 16, -16901, this.field6418, 0);
                                var30 += var8;
                                var34 += this.field6417;
                                var31 += var10;
                            }
                        }
                        method2726(var30 >> 16, var34, var29 >> 16, -16901, this.field6418, 0);
                        var30 += var8;
                        var34 += this.field6417;
                        var29 += var9;
                    }
                } else {
                    int var35 = arg2 - arg6;
                    int var36 = arg6 - arg1;
                    int var37 = this.field6417 * arg1;
                    while (true) {
                        var36--;
                        if (var36 < 0) {
                            while (true) {
                                var35--;
                                if (var35 < 0) {
                                    return;
                                }
                                method2726(var31 >> 16, var37, var30 >> 16, -16901, this.field6418, 0);
                                var37 += this.field6417;
                                var31 += var10;
                                var30 += var8;
                            }
                        }
                        method2726(var29 >> 16, var37, var30 >> 16, -16901, this.field6418, 0);
                        var29 += var9;
                        var30 += var8;
                        var37 += this.field6417;
                    }
                }
            } else {
                int var38;
                int var39 = var38 = arg5 << 16;
                if (arg1 < 0) {
                    var38 -= arg1 * var9;
                    var39 -= arg1 * var8;
                    arg1 = 0;
                }
                int var40 = arg4 << 16;
                if (arg2 < 0) {
                    var40 -= arg2 * var10;
                    arg2 = 0;
                }
                if (var8 >= var9) {
                    int var41 = arg6 - arg2;
                    int var42 = arg2 - arg1;
                    int var43 = this.field6417 * arg1;
                    while (true) {
                        var42--;
                        if (var42 < 0) {
                            while (true) {
                                var41--;
                                if (var41 < 0) {
                                    return;
                                }
                                method2726(var38 >> 16, var43, var40 >> 16, arg3 - 16869, this.field6418, 0);
                                var38 += var9;
                                var43 += this.field6417;
                                var40 += var10;
                            }
                        }
                        method2726(var38 >> 16, var43, var39 >> 16, arg3 - 16869, this.field6418, 0);
                        var38 += var9;
                        var43 += this.field6417;
                        var39 += var8;
                    }
                } else {
                    int var44 = arg6 - arg2;
                    int var45 = arg2 - arg1;
                    int var46 = this.field6417 * arg1;
                    while (true) {
                        var45--;
                        if (var45 < 0) {
                            while (true) {
                                var44--;
                                if (var44 < 0) {
                                    return;
                                }
                                method2726(var40 >> 16, var46, var38 >> 16, -16901, this.field6418, 0);
                                var46 += this.field6417;
                                var38 += var9;
                                var40 += var10;
                            }
                        }
                        method2726(var39 >> 16, var46, var38 >> 16, arg3 ^ 0x421B, this.field6418, 0);
                        var46 += this.field6417;
                        var38 += var9;
                        var39 += var8;
                    }
                }
            }
        } else if (arg1 <= arg2) {
            int var47;
            int var48 = var47 = arg0 << 16;
            int var49 = arg5 << 16;
            if (arg6 < 0) {
                var48 -= arg6 * var9;
                var47 -= arg6 * var10;
                arg6 = 0;
            }
            if (arg1 < 0) {
                var49 -= arg1 * var8;
                arg1 = 0;
            }
            if (var10 > var9) {
                int var50 = arg2 - arg1;
                int var51 = arg1 - arg6;
                int var52 = this.field6417 * arg6;
                while (true) {
                    var51--;
                    if (var51 < 0) {
                        while (true) {
                            var50--;
                            if (var50 < 0) {
                                return;
                            }
                            method2726(var49 >> 16, var52, var47 >> 16, -16901, this.field6418, 0);
                            var47 += var10;
                            var49 += var8;
                            var52 += this.field6417;
                        }
                    }
                    method2726(var48 >> 16, var52, var47 >> 16, -16901, this.field6418, 0);
                    var48 += var9;
                    var52 += this.field6417;
                    var47 += var10;
                }
            } else {
                int var53 = arg2 - arg1;
                int var54 = arg1 - arg6;
                int var55 = this.field6417 * arg6;
                while (true) {
                    var54--;
                    if (var54 < 0) {
                        while (true) {
                            var53--;
                            if (var53 < 0) {
                                return;
                            }
                            method2726(var47 >> 16, var55, var49 >> 16, arg3 - 16869, this.field6418, 0);
                            var55 += this.field6417;
                            var49 += var8;
                            var47 += var10;
                        }
                    }
                    method2726(var47 >> 16, var55, var48 >> 16, arg3 - 16869, this.field6418, 0);
                    var55 += this.field6417;
                    var48 += var9;
                    var47 += var10;
                }
            }
        } else {
            int var56;
            int var57 = var56 = arg0 << 16;
            int var58 = arg4 << 16;
            if (arg6 < 0) {
                var57 -= arg6 * var9;
                var56 -= arg6 * var10;
                arg6 = 0;
            }
            if (arg2 < 0) {
                var58 -= arg2 * var8;
                arg2 = 0;
            }
            if (var9 < var10) {
                int var59 = arg1 - arg2;
                int var60 = arg2 - arg6;
                int var61 = this.field6417 * arg6;
                while (true) {
                    var60--;
                    if (var60 < 0) {
                        while (true) {
                            var59--;
                            if (var59 < 0) {
                                return;
                            }
                            method2726(var57 >> 16, var61, var58 >> 16, -16901, this.field6418, 0);
                            var61 += this.field6417;
                            var57 += var9;
                            var58 += var8;
                        }
                    }
                    method2726(var57 >> 16, var61, var56 >> 16, -16901, this.field6418, 0);
                    var57 += var9;
                    var61 += this.field6417;
                    var56 += var10;
                }
            } else {
                int var62 = arg1 - arg2;
                int var63 = arg2 - arg6;
                int var64 = this.field6417 * arg6;
                while (true) {
                    var63--;
                    if (var63 < 0) {
                        while (true) {
                            var62--;
                            if (var62 < 0) {
                                return;
                            }
                            method2726(var58 >> 16, var64, var57 >> 16, -16901, this.field6418, 0);
                            var57 += var9;
                            var58 += var8;
                            var64 += this.field6417;
                        }
                    }
                    method2726(var56 >> 16, var64, var57 >> 16, -16901, this.field6418, 0);
                    var64 += this.field6417;
                    var57 += var9;
                    var56 += var10;
                }
            }
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIIB)V", line = 519)
    public final void method2728(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        int var6 = 47 / ((59 - arg4) / 63);
        this.field6416 = arg0 - arg1;
        this.field6415 = arg1;
        this.field6417 = arg3 - arg2;
        this.field6419 = arg2;
    }

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(Lfu;II)V", line = 531)
    public class451(class42 arg0, int arg1, int arg2) {
        this.field6418 = new byte[arg1 * arg2];
    }
}
