import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class447 extends class125 {

    @OriginalMember(owner = "client!kl", name = "G", descriptor = "[B")
    public byte[] field6348;

    @OriginalMember(owner = "client!kl", name = "C", descriptor = "I")
    public int field6344;

    @OriginalMember(owner = "client!kl", name = "D", descriptor = "I")
    public int field6345;

    @OriginalMember(owner = "client!kl", name = "E", descriptor = "I")
    public int field6346;

    @OriginalMember(owner = "client!kl", name = "F", descriptor = "I")
    public int field6347;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIB)Z", line = 5)
    public final boolean method2622(int arg0, int arg1, byte arg2) {
        int var4 = 29 / ((63 - arg2) / 59);
        return arg0 * arg1 <= this.field6348.length;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIIIZ[B)V", line = 17)
    private static final void method2623(int arg0, int arg1, int arg2, int arg3, boolean arg4, byte[] arg5) {
        if (arg0 >= arg3) {
            return;
        }
        int var6 = arg3 - arg0 >> 2;
        int var7 = arg0 + arg1;
        if (arg4) {
            return;
        }
        while (true) {
            var6--;
            if (var6 < 0) {
                int var8 = arg3 - arg0 & 0x3;
                while (true) {
                    var8--;
                    if (var8 < 0) {
                        return;
                    }
                    arg5[var7++] = 1;
                }
            }
            arg5[var7++] = 1;
            arg5[var7++] = 1;
            arg5[var7++] = 1;
            arg5[var7++] = 1;
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIIII)V", line = 49)
    public final void method2624(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 == -21461) {
            this.field6345 = arg3 - arg2;
            this.field6344 = arg4 - arg1;
            this.field6346 = arg1;
            this.field6347 = arg2;
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIIIIII)V", line = 69)
    public final void method2625(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = 0;
        if (arg2 != arg4) {
            var8 = (arg3 - arg1 << 16) / (arg4 - arg2);
        }
        int var9 = 0;
        if (arg0 != arg4) {
            var9 = (arg6 - arg3 << 16) / (arg0 - arg4);
        }
        if (arg5 >= -18) {
            this.field6348 = (byte[]) null;
        }
        int var10 = 0;
        if (arg0 != arg2) {
            var10 = (arg1 - arg6 << 16) / (arg2 - arg0);
        }
        if (arg2 <= arg4 && arg0 >= arg2) {
            if (arg4 >= arg0) {
                int var11;
                int var12 = var11 = arg1 << 16;
                if (arg2 < 0) {
                    var11 -= arg2 * var8;
                    var12 -= arg2 * var10;
                    arg2 = 0;
                }
                int var13 = arg6 << 16;
                if (arg0 < 0) {
                    var13 -= arg0 * var9;
                    arg0 = 0;
                }
                if (arg0 != arg2 && var8 > var10 || arg0 == arg2 && var9 > var8) {
                    int var14 = arg4 - arg0;
                    int var15 = arg0 - arg2;
                    int var16 = this.field6344 * arg2;
                    while (true) {
                        var15--;
                        if (var15 < 0) {
                            while (true) {
                                var14--;
                                if (var14 < 0) {
                                    return;
                                }
                                method2623(var13 >> 16, var16, 0, var11 >> 16, false, this.field6348);
                                var13 += var9;
                                var16 += this.field6344;
                                var11 += var8;
                            }
                        }
                        method2623(var12 >> 16, var16, 0, var11 >> 16, false, this.field6348);
                        var11 += var8;
                        var12 += var10;
                        var16 += this.field6344;
                    }
                } else {
                    int var17 = arg4 - arg0;
                    int var18 = arg0 - arg2;
                    int var19 = this.field6344 * arg2;
                    while (true) {
                        var18--;
                        if (var18 < 0) {
                            while (true) {
                                var17--;
                                if (var17 < 0) {
                                    return;
                                }
                                method2623(var11 >> 16, var19, 0, var13 >> 16, false, this.field6348);
                                var19 += this.field6344;
                                var13 += var9;
                                var11 += var8;
                            }
                        }
                        method2623(var11 >> 16, var19, 0, var12 >> 16, false, this.field6348);
                        var19 += this.field6344;
                        var11 += var8;
                        var12 += var10;
                    }
                }
            } else {
                int var20;
                int var21 = var20 = arg1 << 16;
                if (arg2 < 0) {
                    var20 -= arg2 * var8;
                    var21 -= arg2 * var10;
                    arg2 = 0;
                }
                int var22 = arg3 << 16;
                if (arg4 < 0) {
                    var22 -= arg4 * var9;
                    arg4 = 0;
                }
                if ((arg2 == arg4 || var10 >= var8) && (arg2 != arg4 || var10 <= var9)) {
                    int var26 = arg0 - arg4;
                    int var27 = arg4 - arg2;
                    int var28 = this.field6344 * arg2;
                    while (true) {
                        var27--;
                        if (var27 < 0) {
                            while (true) {
                                var26--;
                                if (var26 < 0) {
                                    return;
                                }
                                method2623(var22 >> 16, var28, 0, var21 >> 16, false, this.field6348);
                                var22 += var9;
                                var28 += this.field6344;
                                var21 += var10;
                            }
                        }
                        method2623(var20 >> 16, var28, 0, var21 >> 16, false, this.field6348);
                        var28 += this.field6344;
                        var21 += var10;
                        var20 += var8;
                    }
                } else {
                    int var23 = arg0 - arg4;
                    int var24 = arg4 - arg2;
                    int var25 = this.field6344 * arg2;
                    while (true) {
                        var24--;
                        if (var24 < 0) {
                            while (true) {
                                var23--;
                                if (var23 < 0) {
                                    return;
                                }
                                method2623(var21 >> 16, var25, 0, var22 >> 16, false, this.field6348);
                                var21 += var10;
                                var25 += this.field6344;
                                var22 += var9;
                            }
                        }
                        method2623(var21 >> 16, var25, 0, var20 >> 16, false, this.field6348);
                        var21 += var10;
                        var25 += this.field6344;
                        var20 += var8;
                    }
                }
            }
        } else if (arg4 <= arg0) {
            if (arg0 < arg2) {
                int var29;
                int var30 = var29 = arg3 << 16;
                if (arg4 < 0) {
                    var29 -= arg4 * var9;
                    var30 -= arg4 * var8;
                    arg4 = 0;
                }
                int var31 = arg6 << 16;
                if (arg0 < 0) {
                    var31 -= arg0 * var10;
                    arg0 = 0;
                }
                if (arg0 != arg4 && var9 > var8 || arg0 == arg4 && var10 < var8) {
                    int var32 = arg2 - arg0;
                    int var33 = arg0 - arg4;
                    int var34 = this.field6344 * arg4;
                    while (true) {
                        var33--;
                        if (var33 < 0) {
                            while (true) {
                                var32--;
                                if (var32 < 0) {
                                    return;
                                }
                                method2623(var30 >> 16, var34, 0, var31 >> 16, false, this.field6348);
                                var31 += var10;
                                var34 += this.field6344;
                                var30 += var8;
                            }
                        }
                        method2623(var30 >> 16, var34, 0, var29 >> 16, false, this.field6348);
                        var29 += var9;
                        var30 += var8;
                        var34 += this.field6344;
                    }
                } else {
                    int var35 = arg2 - arg0;
                    int var36 = arg0 - arg4;
                    int var37 = this.field6344 * arg4;
                    while (true) {
                        var36--;
                        if (var36 < 0) {
                            while (true) {
                                var35--;
                                if (var35 < 0) {
                                    return;
                                }
                                method2623(var31 >> 16, var37, 0, var30 >> 16, false, this.field6348);
                                var31 += var10;
                                var30 += var8;
                                var37 += this.field6344;
                            }
                        }
                        method2623(var29 >> 16, var37, 0, var30 >> 16, false, this.field6348);
                        var37 += this.field6344;
                        var30 += var8;
                        var29 += var9;
                    }
                }
            } else {
                int var38;
                int var39 = var38 = arg3 << 16;
                if (arg4 < 0) {
                    var39 -= arg4 * var8;
                    var38 -= arg4 * var9;
                    arg4 = 0;
                }
                int var40 = arg1 << 16;
                if (arg2 < 0) {
                    var40 -= arg2 * var10;
                    arg2 = 0;
                }
                if (var9 <= var8) {
                    int var41 = arg0 - arg2;
                    int var42 = arg2 - arg4;
                    int var43 = this.field6344 * arg4;
                    while (true) {
                        var42--;
                        if (var42 < 0) {
                            while (true) {
                                var41--;
                                if (var41 < 0) {
                                    return;
                                }
                                method2623(var38 >> 16, var43, 0, var40 >> 16, false, this.field6348);
                                var40 += var10;
                                var38 += var9;
                                var43 += this.field6344;
                            }
                        }
                        method2623(var38 >> 16, var43, 0, var39 >> 16, false, this.field6348);
                        var38 += var9;
                        var39 += var8;
                        var43 += this.field6344;
                    }
                } else {
                    int var44 = arg0 - arg2;
                    int var45 = arg2 - arg4;
                    int var46 = this.field6344 * arg4;
                    while (true) {
                        var45--;
                        if (var45 < 0) {
                            while (true) {
                                var44--;
                                if (var44 < 0) {
                                    return;
                                }
                                method2623(var40 >> 16, var46, 0, var38 >> 16, false, this.field6348);
                                var40 += var10;
                                var46 += this.field6344;
                                var38 += var9;
                            }
                        }
                        method2623(var39 >> 16, var46, 0, var38 >> 16, false, this.field6348);
                        var46 += this.field6344;
                        var38 += var9;
                        var39 += var8;
                    }
                }
            }
        } else if (arg4 <= arg2) {
            int var47;
            int var48 = var47 = arg6 << 16;
            if (arg0 < 0) {
                var47 -= arg0 * var10;
                var48 -= arg0 * var9;
                arg0 = 0;
            }
            int var49 = arg3 << 16;
            if (arg4 < 0) {
                var49 -= arg4 * var8;
                arg4 = 0;
            }
            if (var10 > var9) {
                int var50 = arg2 - arg4;
                int var51 = arg4 - arg0;
                int var52 = this.field6344 * arg0;
                while (true) {
                    var51--;
                    if (var51 < 0) {
                        while (true) {
                            var50--;
                            if (var50 < 0) {
                                return;
                            }
                            method2623(var49 >> 16, var52, 0, var47 >> 16, false, this.field6348);
                            var52 += this.field6344;
                            var49 += var8;
                            var47 += var10;
                        }
                    }
                    method2623(var48 >> 16, var52, 0, var47 >> 16, false, this.field6348);
                    var48 += var9;
                    var52 += this.field6344;
                    var47 += var10;
                }
            } else {
                int var53 = arg2 - arg4;
                int var54 = arg4 - arg0;
                int var55 = this.field6344 * arg0;
                while (true) {
                    var54--;
                    if (var54 < 0) {
                        while (true) {
                            var53--;
                            if (var53 < 0) {
                                return;
                            }
                            method2623(var47 >> 16, var55, 0, var49 >> 16, false, this.field6348);
                            var47 += var10;
                            var55 += this.field6344;
                            var49 += var8;
                        }
                    }
                    method2623(var47 >> 16, var55, 0, var48 >> 16, false, this.field6348);
                    var48 += var9;
                    var55 += this.field6344;
                    var47 += var10;
                }
            }
        } else {
            int var56;
            int var57 = var56 = arg6 << 16;
            if (arg0 < 0) {
                var56 -= arg0 * var10;
                var57 -= arg0 * var9;
                arg0 = 0;
            }
            int var58 = arg1 << 16;
            if (arg2 < 0) {
                var58 -= arg2 * var8;
                arg2 = 0;
            }
            if (var10 > var9) {
                int var59 = arg4 - arg2;
                int var60 = arg2 - arg0;
                int var61 = this.field6344 * arg0;
                while (true) {
                    var60--;
                    if (var60 < 0) {
                        while (true) {
                            var59--;
                            if (var59 < 0) {
                                return;
                            }
                            method2623(var57 >> 16, var61, 0, var58 >> 16, false, this.field6348);
                            var58 += var8;
                            var57 += var9;
                            var61 += this.field6344;
                        }
                    }
                    method2623(var57 >> 16, var61, 0, var56 >> 16, false, this.field6348);
                    var56 += var10;
                    var61 += this.field6344;
                    var57 += var9;
                }
            } else {
                int var62 = arg4 - arg2;
                int var63 = arg2 - arg0;
                int var64 = this.field6344 * arg0;
                while (true) {
                    var63--;
                    if (var63 < 0) {
                        while (true) {
                            var62--;
                            if (var62 < 0) {
                                return;
                            }
                            method2623(var58 >> 16, var64, 0, var57 >> 16, false, this.field6348);
                            var58 += var8;
                            var64 += this.field6344;
                            var57 += var9;
                        }
                    }
                    method2623(var56 >> 16, var64, 0, var57 >> 16, false, this.field6348);
                    var64 += this.field6344;
                    var57 += var9;
                    var56 += var10;
                }
            }
        }
    }

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "(I)V", line = 506)
    public final void method2626(int arg0) {
        if (arg0 != 860546512) {
            method2623(-63, -20, -50, 100, false, (byte[]) null);
        }
        int var2 = -1;
        int var3 = this.field6348.length - 8;
        while (var3 > var2) {
            var2++;
            this.field6348[var2] = 0;
            var2++;
            this.field6348[var2] = 0;
            var2++;
            this.field6348[var2] = 0;
            var2++;
            this.field6348[var2] = 0;
            var2++;
            this.field6348[var2] = 0;
            var2++;
            this.field6348[var2] = 0;
            var2++;
            this.field6348[var2] = 0;
            var2++;
            this.field6348[var2] = 0;
        }
        while ((this.field6348.length - 1) > var2) {
            var2++;
            this.field6348[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!kl", name = "<init>", descriptor = "(Lic;II)V", line = 532)
    public class447(class246 arg0, int arg1, int arg2) {
        this.field6348 = new byte[arg1 * arg2];
    }
}
