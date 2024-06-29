import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class15 extends class84 {

    @OriginalMember(owner = "client!ub", name = "H", descriptor = "[B")
    public byte[] field202;

    @OriginalMember(owner = "client!ub", name = "F", descriptor = "I")
    public int field200;

    @OriginalMember(owner = "client!ub", name = "G", descriptor = "I")
    public int field201;

    @OriginalMember(owner = "client!ub", name = "I", descriptor = "I")
    public int field203;

    @OriginalMember(owner = "client!ub", name = "J", descriptor = "I")
    public int field204;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(III)Z", line = 6)
    public final boolean method127(int arg0, int arg1, int arg2) {
        if (arg1 > -119) {
            this.field204 = 47;
        }
        return this.field202.length >= (arg0 * arg2);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIIII[B)V", line = 18)
    private static final void method128(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        if (arg0 >= arg3) {
            return;
        }
        int var6 = arg0 + arg4;
        int var7 = arg3 - arg0 >> 2;
        if (arg2 <= 68) {
            return;
        }
        while (true) {
            var7--;
            if (var7 < 0) {
                int var8 = arg3 - arg0 & 0x3;
                while (true) {
                    var8--;
                    if (var8 < 0) {
                        return;
                    }
                    arg5[var6++] = 1;
                }
            }
            arg5[var6++] = 1;
            arg5[var6++] = 1;
            arg5[var6++] = 1;
            arg5[var6++] = 1;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIIII)V", line = 47)
    public final void method129(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field200 = arg2 - arg4;
        if (arg0 != -247965552) {
            this.field201 = 76;
        }
        this.field203 = arg3;
        this.field204 = arg4;
        this.field201 = arg1 - arg3;
    }

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "(B)V", line = 70)
    public final void method130(byte arg0) {
        int var2 = -1;
        int var3 = this.field202.length - 8;
        if (arg0 < 4) {
            this.method129(-93, -126, -82, -62, -57);
        }
        while (var2 < var3) {
            var2++;
            this.field202[var2] = 0;
            var2++;
            this.field202[var2] = 0;
            var2++;
            this.field202[var2] = 0;
            var2++;
            this.field202[var2] = 0;
            var2++;
            this.field202[var2] = 0;
            var2++;
            this.field202[var2] = 0;
            var2++;
            this.field202[var2] = 0;
            var2++;
            this.field202[var2] = 0;
        }
        while (var2 < (this.field202.length - 1)) {
            var2++;
            this.field202[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIIIIII)V", line = 98)
    public final void method131(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = arg5;
        if (arg0 != arg6) {
            var8 = (arg2 - arg1 << 16) / (arg0 - arg6);
        }
        int var9 = 0;
        if (arg0 != arg4) {
            var9 = (arg3 - arg2 << 16) / (arg4 - arg0);
        }
        int var10 = 0;
        if (arg4 != arg6) {
            var10 = (arg1 - arg3 << 16) / (arg6 - arg4);
        }
        if (arg6 <= arg0 && arg4 >= arg6) {
            if (arg0 < arg4) {
                int var11;
                int var12 = var11 = arg1 << 16;
                if (arg6 < 0) {
                    var12 -= arg6 * var10;
                    var11 -= arg6 * var8;
                    arg6 = 0;
                }
                int var13 = arg2 << 16;
                if (arg0 < 0) {
                    var13 -= arg0 * var9;
                    arg0 = 0;
                }
                if (arg0 != arg6 && var10 < var8 || arg0 == arg6 && var9 < var10) {
                    int var14 = arg4 - arg0;
                    int var15 = arg0 - arg6;
                    int var16 = this.field200 * arg6;
                    while (true) {
                        var15--;
                        if (var15 < 0) {
                            while (true) {
                                var14--;
                                if (var14 < 0) {
                                    return;
                                }
                                method128(var12 >> 16, 0, arg5 + 94, var13 >> 16, var16, this.field202);
                                var16 += this.field200;
                                var13 += var9;
                                var12 += var10;
                            }
                        }
                        method128(var12 >> 16, 0, 73, var11 >> 16, var16, this.field202);
                        var11 += var8;
                        var12 += var10;
                        var16 += this.field200;
                    }
                } else {
                    int var17 = arg4 - arg0;
                    int var18 = arg0 - arg6;
                    int var19 = this.field200 * arg6;
                    while (true) {
                        var18--;
                        if (var18 < 0) {
                            while (true) {
                                var17--;
                                if (var17 < 0) {
                                    return;
                                }
                                method128(var13 >> 16, 0, arg5 + 106, var12 >> 16, var19, this.field202);
                                var19 += this.field200;
                                var13 += var9;
                                var12 += var10;
                            }
                        }
                        method128(var11 >> 16, 0, 107, var12 >> 16, var19, this.field202);
                        var19 += this.field200;
                        var12 += var10;
                        var11 += var8;
                    }
                }
            } else {
                int var20;
                int var21 = var20 = arg1 << 16;
                if (arg6 < 0) {
                    var21 -= arg6 * var10;
                    var20 -= arg6 * var8;
                    arg6 = 0;
                }
                int var22 = arg3 << 16;
                if (arg4 < 0) {
                    var22 -= arg4 * var9;
                    arg4 = 0;
                }
                if (arg4 != arg6 && var10 < var8 || arg4 == arg6 && var9 > var8) {
                    int var23 = arg0 - arg4;
                    int var24 = arg4 - arg6;
                    int var25 = this.field200 * arg6;
                    while (true) {
                        var24--;
                        if (var24 < 0) {
                            while (true) {
                                var23--;
                                if (var23 < 0) {
                                    return;
                                }
                                method128(var22 >> 16, 0, 92, var20 >> 16, var25, this.field202);
                                var25 += this.field200;
                                var22 += var9;
                                var20 += var8;
                            }
                        }
                        method128(var21 >> 16, 0, 120, var20 >> 16, var25, this.field202);
                        var25 += this.field200;
                        var21 += var10;
                        var20 += var8;
                    }
                } else {
                    int var26 = arg0 - arg4;
                    int var27 = arg4 - arg6;
                    int var28 = this.field200 * arg6;
                    while (true) {
                        var27--;
                        if (var27 < 0) {
                            while (true) {
                                var26--;
                                if (var26 < 0) {
                                    return;
                                }
                                method128(var20 >> 16, 0, 85, var22 >> 16, var28, this.field202);
                                var20 += var8;
                                var22 += var9;
                                var28 += this.field200;
                            }
                        }
                        method128(var20 >> 16, 0, 116, var21 >> 16, var28, this.field202);
                        var28 += this.field200;
                        var21 += var10;
                        var20 += var8;
                    }
                }
            }
        } else if (arg0 <= arg4) {
            if (arg6 > arg4) {
                int var29;
                int var30 = var29 = arg2 << 16;
                if (arg0 < 0) {
                    var30 -= arg0 * var8;
                    var29 -= arg0 * var9;
                    arg0 = 0;
                }
                int var31 = arg3 << 16;
                if (arg4 < 0) {
                    var31 -= arg4 * var10;
                    arg4 = 0;
                }
                if (arg0 != arg4 && var9 > var8 || arg0 == arg4 && var8 > var10) {
                    int var32 = arg6 - arg4;
                    int var33 = arg4 - arg0;
                    int var34 = this.field200 * arg0;
                    while (true) {
                        var33--;
                        if (var33 < 0) {
                            while (true) {
                                var32--;
                                if (var32 < 0) {
                                    return;
                                }
                                method128(var30 >> 16, 0, 113, var31 >> 16, var34, this.field202);
                                var31 += var10;
                                var30 += var8;
                                var34 += this.field200;
                            }
                        }
                        method128(var30 >> 16, 0, 82, var29 >> 16, var34, this.field202);
                        var34 += this.field200;
                        var29 += var9;
                        var30 += var8;
                    }
                } else {
                    int var35 = arg6 - arg4;
                    int var36 = arg4 - arg0;
                    int var37 = this.field200 * arg0;
                    while (true) {
                        var36--;
                        if (var36 < 0) {
                            while (true) {
                                var35--;
                                if (var35 < 0) {
                                    return;
                                }
                                method128(var31 >> 16, 0, arg5 + 123, var30 >> 16, var37, this.field202);
                                var37 += this.field200;
                                var30 += var8;
                                var31 += var10;
                            }
                        }
                        method128(var29 >> 16, 0, 90, var30 >> 16, var37, this.field202);
                        var29 += var9;
                        var30 += var8;
                        var37 += this.field200;
                    }
                }
            } else {
                int var38;
                int var39 = var38 = arg2 << 16;
                int var40 = arg1 << 16;
                if (arg0 < 0) {
                    var39 -= arg0 * var8;
                    var38 -= arg0 * var9;
                    arg0 = 0;
                }
                if (arg6 < 0) {
                    var40 -= arg6 * var10;
                    arg6 = 0;
                }
                if (var8 >= var9) {
                    int var41 = arg4 - arg6;
                    int var42 = arg6 - arg0;
                    int var43 = this.field200 * arg0;
                    while (true) {
                        var42--;
                        if (var42 < 0) {
                            while (true) {
                                var41--;
                                if (var41 < 0) {
                                    return;
                                }
                                method128(var38 >> 16, 0, 76, var40 >> 16, var43, this.field202);
                                var38 += var9;
                                var40 += var10;
                                var43 += this.field200;
                            }
                        }
                        method128(var38 >> 16, 0, 121, var39 >> 16, var43, this.field202);
                        var38 += var9;
                        var39 += var8;
                        var43 += this.field200;
                    }
                } else {
                    int var44 = arg4 - arg6;
                    int var45 = arg6 - arg0;
                    int var46 = this.field200 * arg0;
                    while (true) {
                        var45--;
                        if (var45 < 0) {
                            while (true) {
                                var44--;
                                if (var44 < 0) {
                                    return;
                                }
                                method128(var40 >> 16, 0, arg5 ^ 0x7F, var38 >> 16, var46, this.field202);
                                var38 += var9;
                                var40 += var10;
                                var46 += this.field200;
                            }
                        }
                        method128(var39 >> 16, 0, 121, var38 >> 16, var46, this.field202);
                        var39 += var8;
                        var38 += var9;
                        var46 += this.field200;
                    }
                }
            }
        } else if (arg6 < arg0) {
            int var47;
            int var48 = var47 = arg3 << 16;
            int var49 = arg1 << 16;
            if (arg4 < 0) {
                var48 -= arg4 * var9;
                var47 -= arg4 * var10;
                arg4 = 0;
            }
            if (arg6 < 0) {
                var49 -= arg6 * var8;
                arg6 = 0;
            }
            if (var9 < var10) {
                int var50 = arg0 - arg6;
                int var51 = arg6 - arg4;
                int var52 = this.field200 * arg4;
                while (true) {
                    var51--;
                    if (var51 < 0) {
                        while (true) {
                            var50--;
                            if (var50 < 0) {
                                return;
                            }
                            method128(var48 >> 16, 0, 123, var49 >> 16, var52, this.field202);
                            var52 += this.field200;
                            var49 += var8;
                            var48 += var9;
                        }
                    }
                    method128(var48 >> 16, 0, arg5 ^ 0x74, var47 >> 16, var52, this.field202);
                    var52 += this.field200;
                    var48 += var9;
                    var47 += var10;
                }
            } else {
                int var53 = arg0 - arg6;
                int var54 = arg6 - arg4;
                int var55 = this.field200 * arg4;
                while (true) {
                    var54--;
                    if (var54 < 0) {
                        while (true) {
                            var53--;
                            if (var53 < 0) {
                                return;
                            }
                            method128(var49 >> 16, 0, 108, var48 >> 16, var55, this.field202);
                            var49 += var8;
                            var55 += this.field200;
                            var48 += var9;
                        }
                    }
                    method128(var47 >> 16, 0, 115, var48 >> 16, var55, this.field202);
                    var55 += this.field200;
                    var47 += var10;
                    var48 += var9;
                }
            }
        } else {
            int var56;
            int var57 = var56 = arg3 << 16;
            int var58 = arg2 << 16;
            if (arg4 < 0) {
                var57 -= arg4 * var9;
                var56 -= arg4 * var10;
                arg4 = 0;
            }
            if (arg0 < 0) {
                var58 -= arg0 * var8;
                arg0 = 0;
            }
            if (var9 < var10) {
                int var59 = arg6 - arg0;
                int var60 = arg0 - arg4;
                int var61 = this.field200 * arg4;
                while (true) {
                    var60--;
                    if (var60 < 0) {
                        while (true) {
                            var59--;
                            if (var59 < 0) {
                                return;
                            }
                            method128(var58 >> 16, 0, 86, var56 >> 16, var61, this.field202);
                            var61 += this.field200;
                            var56 += var10;
                            var58 += var8;
                        }
                    }
                    method128(var57 >> 16, 0, 85, var56 >> 16, var61, this.field202);
                    var61 += this.field200;
                    var57 += var9;
                    var56 += var10;
                }
            } else {
                int var62 = arg6 - arg0;
                int var63 = arg0 - arg4;
                int var64 = this.field200 * arg4;
                while (true) {
                    var63--;
                    if (var63 < 0) {
                        while (true) {
                            var62--;
                            if (var62 < 0) {
                                return;
                            }
                            method128(var56 >> 16, 0, arg5 ^ 0x72, var58 >> 16, var64, this.field202);
                            var58 += var8;
                            var56 += var10;
                            var64 += this.field200;
                        }
                    }
                    method128(var56 >> 16, 0, 120, var57 >> 16, var64, this.field202);
                    var64 += this.field200;
                    var57 += var9;
                    var56 += var10;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(Lsq;II)V", line = 529)
    public class15(class96 arg0, int arg1, int arg2) {
        this.field202 = new byte[arg1 * arg2];
    }
}
