import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public class class74 extends class416 {

    @OriginalMember(owner = "client!um", name = "K", descriptor = "[B")
    public byte[] field903;

    @OriginalMember(owner = "client!um", name = "B", descriptor = "I")
    public int field899;

    @OriginalMember(owner = "client!um", name = "F", descriptor = "I")
    public int field900;

    @OriginalMember(owner = "client!um", name = "H", descriptor = "I")
    public int field901;

    @OriginalMember(owner = "client!um", name = "J", descriptor = "I")
    public int field902;

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IIIII)V")
    public final void method436(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field899 = arg3;
        this.field900 = arg1 - arg4;
        if (arg2 == 1114916304) {
            this.field902 = arg0 - arg3;
            this.field901 = arg4;
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(II[BIII)V")
    private static final void method437(int arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5) {
        int var6 = -114 / ((69 - arg3) / 48);
        if (arg4 >= arg1) {
            return;
        }
        int var7 = arg4 + arg5;
        int var8 = arg1 - arg4 >> 2;
        while (true) {
            var8--;
            if (var8 < 0) {
                int var9 = arg1 - arg4 & 0x3;
                while (true) {
                    var9--;
                    if (var9 < 0) {
                        return;
                    }
                    arg2[var7++] = 1;
                }
            }
            arg2[var7++] = 1;
            arg2[var7++] = 1;
            arg2[var7++] = 1;
            arg2[var7++] = 1;
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IIIIIIZ)V")
    public final void method438(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (!arg6) {
            return;
        }
        int var8 = 0;
        if (arg1 != arg5) {
            var8 = (arg2 - arg3 << 16) / (arg1 - arg5);
        }
        int var9 = 0;
        if (arg0 != arg1) {
            var9 = (arg4 - arg2 << 16) / (arg0 - arg1);
        }
        int var10 = 0;
        if (arg0 != arg5) {
            var10 = (arg3 - arg4 << 16) / (arg5 - arg0);
        }
        if (arg5 <= arg1 && arg0 >= arg5) {
            if (arg1 < arg0) {
                int var11;
                int var12 = var11 = arg3 << 16;
                if (arg5 < 0) {
                    var12 -= arg5 * var10;
                    var11 -= arg5 * var8;
                    arg5 = 0;
                }
                int var13 = arg2 << 16;
                if (arg1 < 0) {
                    var13 -= arg1 * var9;
                    arg1 = 0;
                }
                if (arg1 != arg5 && var10 < var8 || arg1 == arg5 && var9 < var10) {
                    int var14 = arg0 - arg1;
                    int var15 = arg1 - arg5;
                    int var16 = this.field900 * arg5;
                    while (true) {
                        var15--;
                        if (var15 < 0) {
                            while (true) {
                                var14--;
                                if (var14 < 0) {
                                    return;
                                }
                                method437(0, var13 >> 16, this.field903, -54, var12 >> 16, var16);
                                var13 += var9;
                                var16 += this.field900;
                                var12 += var10;
                            }
                        }
                        method437(0, var11 >> 16, this.field903, -105, var12 >> 16, var16);
                        var11 += var8;
                        var12 += var10;
                        var16 += this.field900;
                    }
                } else {
                    int var17 = arg0 - arg1;
                    int var18 = arg1 - arg5;
                    int var19 = this.field900 * arg5;
                    while (true) {
                        var18--;
                        if (var18 < 0) {
                            while (true) {
                                var17--;
                                if (var17 < 0) {
                                    return;
                                }
                                method437(0, var12 >> 16, this.field903, -7, var13 >> 16, var19);
                                var19 += this.field900;
                                var12 += var10;
                                var13 += var9;
                            }
                        }
                        method437(0, var12 >> 16, this.field903, 127, var11 >> 16, var19);
                        var19 += this.field900;
                        var12 += var10;
                        var11 += var8;
                    }
                }
            } else {
                int var20;
                int var21 = var20 = arg3 << 16;
                int var22 = arg4 << 16;
                if (arg5 < 0) {
                    var20 -= arg5 * var8;
                    var21 -= arg5 * var10;
                    arg5 = 0;
                }
                if (arg0 < 0) {
                    var22 -= arg0 * var9;
                    arg0 = 0;
                }
                if (arg0 != arg5 && var10 < var8 || arg0 == arg5 && var9 > var8) {
                    int var23 = arg1 - arg0;
                    int var24 = arg0 - arg5;
                    int var25 = this.field900 * arg5;
                    while (true) {
                        var24--;
                        if (var24 < 0) {
                            while (true) {
                                var23--;
                                if (var23 < 0) {
                                    return;
                                }
                                method437(0, var20 >> 16, this.field903, 118, var22 >> 16, var25);
                                var25 += this.field900;
                                var22 += var9;
                                var20 += var8;
                            }
                        }
                        method437(0, var20 >> 16, this.field903, -96, var21 >> 16, var25);
                        var21 += var10;
                        var20 += var8;
                        var25 += this.field900;
                    }
                } else {
                    int var26 = arg1 - arg0;
                    int var27 = arg0 - arg5;
                    int var28 = this.field900 * arg5;
                    while (true) {
                        var27--;
                        if (var27 < 0) {
                            while (true) {
                                var26--;
                                if (var26 < 0) {
                                    return;
                                }
                                method437(0, var22 >> 16, this.field903, 117, var20 >> 16, var28);
                                var22 += var9;
                                var28 += this.field900;
                                var20 += var8;
                            }
                        }
                        method437(0, var21 >> 16, this.field903, -62, var20 >> 16, var28);
                        var20 += var8;
                        var21 += var10;
                        var28 += this.field900;
                    }
                }
            }
        } else if (arg1 <= arg0) {
            if (arg0 >= arg5) {
                int var29;
                int var30 = var29 = arg2 << 16;
                if (arg1 < 0) {
                    var29 -= arg1 * var9;
                    var30 -= arg1 * var8;
                    arg1 = 0;
                }
                int var31 = arg3 << 16;
                if (arg5 < 0) {
                    var31 -= arg5 * var10;
                    arg5 = 0;
                }
                if (var8 >= var9) {
                    int var32 = arg0 - arg5;
                    int var33 = arg5 - arg1;
                    int var34 = this.field900 * arg1;
                    while (true) {
                        var33--;
                        if (var33 < 0) {
                            while (true) {
                                var32--;
                                if (var32 < 0) {
                                    return;
                                }
                                method437(0, var31 >> 16, this.field903, -83, var29 >> 16, var34);
                                var34 += this.field900;
                                var29 += var9;
                                var31 += var10;
                            }
                        }
                        method437(0, var30 >> 16, this.field903, -126, var29 >> 16, var34);
                        var30 += var8;
                        var29 += var9;
                        var34 += this.field900;
                    }
                } else {
                    int var35 = arg0 - arg5;
                    int var36 = arg5 - arg1;
                    int var37 = this.field900 * arg1;
                    while (true) {
                        var36--;
                        if (var36 < 0) {
                            while (true) {
                                var35--;
                                if (var35 < 0) {
                                    return;
                                }
                                method437(0, var29 >> 16, this.field903, -15, var31 >> 16, var37);
                                var37 += this.field900;
                                var29 += var9;
                                var31 += var10;
                            }
                        }
                        method437(0, var29 >> 16, this.field903, -18, var30 >> 16, var37);
                        var37 += this.field900;
                        var30 += var8;
                        var29 += var9;
                    }
                }
            } else {
                int var38;
                int var39 = var38 = arg2 << 16;
                if (arg1 < 0) {
                    var39 -= arg1 * var8;
                    var38 -= arg1 * var9;
                    arg1 = 0;
                }
                int var40 = arg4 << 16;
                if (arg0 < 0) {
                    var40 -= arg0 * var10;
                    arg0 = 0;
                }
                if ((arg0 == arg1 || var9 <= var8) && (arg0 != arg1 || var10 >= var8)) {
                    int var44 = arg5 - arg0;
                    int var45 = arg0 - arg1;
                    int var46 = this.field900 * arg1;
                    while (true) {
                        var45--;
                        if (var45 < 0) {
                            while (true) {
                                var44--;
                                if (var44 < 0) {
                                    return;
                                }
                                method437(0, var39 >> 16, this.field903, 117, var40 >> 16, var46);
                                var39 += var8;
                                var40 += var10;
                                var46 += this.field900;
                            }
                        }
                        method437(0, var39 >> 16, this.field903, 11, var38 >> 16, var46);
                        var38 += var9;
                        var39 += var8;
                        var46 += this.field900;
                    }
                } else {
                    int var41 = arg5 - arg0;
                    int var42 = arg0 - arg1;
                    int var43 = this.field900 * arg1;
                    while (true) {
                        var42--;
                        if (var42 < 0) {
                            while (true) {
                                var41--;
                                if (var41 < 0) {
                                    return;
                                }
                                method437(0, var40 >> 16, this.field903, 122, var39 >> 16, var43);
                                var43 += this.field900;
                                var40 += var10;
                                var39 += var8;
                            }
                        }
                        method437(0, var38 >> 16, this.field903, -102, var39 >> 16, var43);
                        var43 += this.field900;
                        var38 += var9;
                        var39 += var8;
                    }
                }
            }
        } else if (arg1 <= arg5) {
            int var47;
            int var48 = var47 = arg4 << 16;
            if (arg0 < 0) {
                var48 -= arg0 * var9;
                var47 -= arg0 * var10;
                arg0 = 0;
            }
            int var49 = arg2 << 16;
            if (arg1 < 0) {
                var49 -= arg1 * var8;
                arg1 = 0;
            }
            if (var9 < var10) {
                int var50 = arg5 - arg1;
                int var51 = arg1 - arg0;
                int var52 = this.field900 * arg0;
                while (true) {
                    var51--;
                    if (var51 < 0) {
                        while (true) {
                            var50--;
                            if (var50 < 0) {
                                return;
                            }
                            method437(0, var47 >> 16, this.field903, -97, var49 >> 16, var52);
                            var49 += var8;
                            var47 += var10;
                            var52 += this.field900;
                        }
                    }
                    method437(0, var47 >> 16, this.field903, -13, var48 >> 16, var52);
                    var47 += var10;
                    var48 += var9;
                    var52 += this.field900;
                }
            } else {
                int var53 = arg5 - arg1;
                int var54 = arg1 - arg0;
                int var55 = this.field900 * arg0;
                while (true) {
                    var54--;
                    if (var54 < 0) {
                        while (true) {
                            var53--;
                            if (var53 < 0) {
                                return;
                            }
                            method437(0, var49 >> 16, this.field903, 126, var47 >> 16, var55);
                            var47 += var10;
                            var55 += this.field900;
                            var49 += var8;
                        }
                    }
                    method437(0, var48 >> 16, this.field903, 125, var47 >> 16, var55);
                    var55 += this.field900;
                    var47 += var10;
                    var48 += var9;
                }
            }
        } else {
            int var56;
            int var57 = var56 = arg4 << 16;
            if (arg0 < 0) {
                var56 -= arg0 * var10;
                var57 -= arg0 * var9;
                arg0 = 0;
            }
            int var58 = arg3 << 16;
            if (arg5 < 0) {
                var58 -= arg5 * var8;
                arg5 = 0;
            }
            if (var10 > var9) {
                int var59 = arg1 - arg5;
                int var60 = arg5 - arg0;
                int var61 = this.field900 * arg0;
                while (true) {
                    var60--;
                    if (var60 < 0) {
                        while (true) {
                            var59--;
                            if (var59 < 0) {
                                return;
                            }
                            method437(0, var58 >> 16, this.field903, 126, var57 >> 16, var61);
                            var58 += var8;
                            var61 += this.field900;
                            var57 += var9;
                        }
                    }
                    method437(0, var56 >> 16, this.field903, 118, var57 >> 16, var61);
                    var56 += var10;
                    var57 += var9;
                    var61 += this.field900;
                }
            } else {
                int var62 = arg1 - arg5;
                int var63 = arg5 - arg0;
                int var64 = this.field900 * arg0;
                while (true) {
                    var63--;
                    if (var63 < 0) {
                        while (true) {
                            var62--;
                            if (var62 < 0) {
                                return;
                            }
                            method437(0, var57 >> 16, this.field903, 126, var58 >> 16, var64);
                            var64 += this.field900;
                            var58 += var8;
                            var57 += var9;
                        }
                    }
                    method437(0, var57 >> 16, this.field903, 122, var56 >> 16, var64);
                    var56 += var10;
                    var57 += var9;
                    var64 += this.field900;
                }
            }
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IIB)Z")
    public final boolean method439(int arg0, int arg1, byte arg2) {
        if (arg2 > -52) {
            this.field901 = 50;
        }
        return arg0 * arg1 <= this.field903.length;
    }

    @OriginalMember(owner = "client!um", name = "<init>", descriptor = "(Lh;II)V")
    public class74(class327 arg0, int arg1, int arg2) {
        this.field903 = new byte[arg1 * arg2];
    }

    @OriginalMember(owner = "client!um", name = "d", descriptor = "(I)V")
    public final void method440(int arg0) {
        int var2 = arg0;
        int var3 = this.field903.length - 8;
        while (var3 > var2) {
            var2++;
            this.field903[var2] = 0;
            var2++;
            this.field903[var2] = 0;
            var2++;
            this.field903[var2] = 0;
            var2++;
            this.field903[var2] = 0;
            var2++;
            this.field903[var2] = 0;
            var2++;
            this.field903[var2] = 0;
            var2++;
            this.field903[var2] = 0;
            var2++;
            this.field903[var2] = 0;
        }
        while (var2 < (this.field903.length - 1)) {
            var2++;
            this.field903[var2] = 0;
        }
    }
}
