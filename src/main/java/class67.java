import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class67 extends class21 {

    @OriginalMember(owner = "client!hh", name = "K", descriptor = "[B")
    public byte[] field902;

    @OriginalMember(owner = "client!hh", name = "F", descriptor = "I")
    public int field899;

    @OriginalMember(owner = "client!hh", name = "I", descriptor = "I")
    public int field900;

    @OriginalMember(owner = "client!hh", name = "J", descriptor = "I")
    public int field901;

    @OriginalMember(owner = "client!hh", name = "L", descriptor = "I")
    public int field903;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IZIII)V", line = 4)
    public final void method418(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        this.field900 = arg4;
        this.field903 = arg0;
        this.field901 = arg2 - arg0;
        if (!arg1) {
            this.field903 = 15;
        }
        this.field899 = arg3 - arg4;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIIII[B)V", line = 25)
    private static final void method419(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        if (arg2 >= arg4) {
            return;
        }
        int var6 = arg4 - arg2 >> 2;
        int var7 = arg2 + arg3;
        if (arg0 != -23108) {
            return;
        }
        while (true) {
            var6--;
            if (var6 < 0) {
                int var8 = arg4 - arg2 & 0x3;
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

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(ZIIIIII)V", line = 56)
    public final void method420(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = 0;
        if (arg2 != arg6) {
            var8 = (arg4 - arg5 << 16) / (arg6 - arg2);
        }
        int var9 = 0;
        if (arg1 != arg6) {
            var9 = (arg3 - arg4 << 16) / (arg1 - arg6);
        }
        int var10 = 0;
        if (!arg0) {
            this.field902 = (byte[]) null;
        }
        if (arg1 != arg2) {
            var10 = (arg5 - arg3 << 16) / (arg2 - arg1);
        }
        if (arg6 >= arg2 && arg2 <= arg1) {
            if (arg1 > arg6) {
                int var11;
                int var12 = var11 = arg5 << 16;
                if (arg2 < 0) {
                    var12 -= arg2 * var10;
                    var11 -= arg2 * var8;
                    arg2 = 0;
                }
                int var13 = arg4 << 16;
                if (arg6 < 0) {
                    var13 -= arg6 * var9;
                    arg6 = 0;
                }
                if (arg2 != arg6 && var10 < var8 || arg2 == arg6 && var10 > var9) {
                    int var14 = arg1 - arg6;
                    int var15 = arg6 - arg2;
                    int var16 = this.field899 * arg2;
                    while (true) {
                        var15--;
                        if (var15 < 0) {
                            while (true) {
                                var14--;
                                if (var14 < 0) {
                                    return;
                                }
                                method419(-23108, 0, var12 >> 16, var16, var13 >> 16, this.field902);
                                var13 += var9;
                                var16 += this.field899;
                                var12 += var10;
                            }
                        }
                        method419(-23108, 0, var12 >> 16, var16, var11 >> 16, this.field902);
                        var12 += var10;
                        var16 += this.field899;
                        var11 += var8;
                    }
                } else {
                    int var17 = arg1 - arg6;
                    int var18 = arg6 - arg2;
                    int var19 = this.field899 * arg2;
                    while (true) {
                        var18--;
                        if (var18 < 0) {
                            while (true) {
                                var17--;
                                if (var17 < 0) {
                                    return;
                                }
                                method419(-23108, 0, var13 >> 16, var19, var12 >> 16, this.field902);
                                var12 += var10;
                                var19 += this.field899;
                                var13 += var9;
                            }
                        }
                        method419(-23108, 0, var11 >> 16, var19, var12 >> 16, this.field902);
                        var19 += this.field899;
                        var12 += var10;
                        var11 += var8;
                    }
                }
            } else {
                int var20;
                int var21 = var20 = arg5 << 16;
                int var22 = arg3 << 16;
                if (arg2 < 0) {
                    var20 -= arg2 * var8;
                    var21 -= arg2 * var10;
                    arg2 = 0;
                }
                if (arg1 < 0) {
                    var22 -= arg1 * var9;
                    arg1 = 0;
                }
                if ((arg1 == arg2 || var10 >= var8) && (arg1 != arg2 || var9 <= var8)) {
                    int var26 = arg6 - arg1;
                    int var27 = arg1 - arg2;
                    int var28 = this.field899 * arg2;
                    while (true) {
                        var27--;
                        if (var27 < 0) {
                            while (true) {
                                var26--;
                                if (var26 < 0) {
                                    return;
                                }
                                method419(-23108, 0, var20 >> 16, var28, var22 >> 16, this.field902);
                                var28 += this.field899;
                                var20 += var8;
                                var22 += var9;
                            }
                        }
                        method419(-23108, 0, var20 >> 16, var28, var21 >> 16, this.field902);
                        var20 += var8;
                        var21 += var10;
                        var28 += this.field899;
                    }
                } else {
                    int var23 = arg6 - arg1;
                    int var24 = arg1 - arg2;
                    int var25 = this.field899 * arg2;
                    while (true) {
                        var24--;
                        if (var24 < 0) {
                            while (true) {
                                var23--;
                                if (var23 < 0) {
                                    return;
                                }
                                method419(-23108, 0, var22 >> 16, var25, var20 >> 16, this.field902);
                                var22 += var9;
                                var20 += var8;
                                var25 += this.field899;
                            }
                        }
                        method419(-23108, 0, var21 >> 16, var25, var20 >> 16, this.field902);
                        var21 += var10;
                        var20 += var8;
                        var25 += this.field899;
                    }
                }
            }
        } else if (arg6 > arg1) {
            if (arg6 <= arg2) {
                int var29;
                int var30 = var29 = arg3 << 16;
                if (arg1 < 0) {
                    var30 -= arg1 * var9;
                    var29 -= arg1 * var10;
                    arg1 = 0;
                }
                int var31 = arg4 << 16;
                if (arg6 < 0) {
                    var31 -= arg6 * var8;
                    arg6 = 0;
                }
                if (var10 <= var9) {
                    int var32 = arg2 - arg6;
                    int var33 = arg6 - arg1;
                    int var34 = this.field899 * arg1;
                    while (true) {
                        var33--;
                        if (var33 < 0) {
                            while (true) {
                                var32--;
                                if (var32 < 0) {
                                    return;
                                }
                                method419(-23108, 0, var29 >> 16, var34, var31 >> 16, this.field902);
                                var34 += this.field899;
                                var29 += var10;
                                var31 += var8;
                            }
                        }
                        method419(-23108, 0, var29 >> 16, var34, var30 >> 16, this.field902);
                        var30 += var9;
                        var29 += var10;
                        var34 += this.field899;
                    }
                } else {
                    int var35 = arg2 - arg6;
                    int var36 = arg6 - arg1;
                    int var37 = this.field899 * arg1;
                    while (true) {
                        var36--;
                        if (var36 < 0) {
                            while (true) {
                                var35--;
                                if (var35 < 0) {
                                    return;
                                }
                                method419(-23108, 0, var31 >> 16, var37, var29 >> 16, this.field902);
                                var31 += var8;
                                var37 += this.field899;
                                var29 += var10;
                            }
                        }
                        method419(-23108, 0, var30 >> 16, var37, var29 >> 16, this.field902);
                        var29 += var10;
                        var30 += var9;
                        var37 += this.field899;
                    }
                }
            } else {
                int var38;
                int var39 = var38 = arg3 << 16;
                int var40 = arg5 << 16;
                if (arg1 < 0) {
                    var38 -= arg1 * var10;
                    var39 -= arg1 * var9;
                    arg1 = 0;
                }
                if (arg2 < 0) {
                    var40 -= arg2 * var8;
                    arg2 = 0;
                }
                if (var10 <= var9) {
                    int var41 = arg6 - arg2;
                    int var42 = arg2 - arg1;
                    int var43 = this.field899 * arg1;
                    while (true) {
                        var42--;
                        if (var42 < 0) {
                            while (true) {
                                var41--;
                                if (var41 < 0) {
                                    return;
                                }
                                method419(-23108, 0, var40 >> 16, var43, var39 >> 16, this.field902);
                                var43 += this.field899;
                                var39 += var9;
                                var40 += var8;
                            }
                        }
                        method419(-23108, 0, var38 >> 16, var43, var39 >> 16, this.field902);
                        var43 += this.field899;
                        var39 += var9;
                        var38 += var10;
                    }
                } else {
                    int var44 = arg6 - arg2;
                    int var45 = arg2 - arg1;
                    int var46 = this.field899 * arg1;
                    while (true) {
                        var45--;
                        if (var45 < 0) {
                            while (true) {
                                var44--;
                                if (var44 < 0) {
                                    return;
                                }
                                method419(-23108, 0, var39 >> 16, var46, var40 >> 16, this.field902);
                                var40 += var8;
                                var46 += this.field899;
                                var39 += var9;
                            }
                        }
                        method419(-23108, 0, var39 >> 16, var46, var38 >> 16, this.field902);
                        var46 += this.field899;
                        var38 += var10;
                        var39 += var9;
                    }
                }
            }
        } else if (arg2 > arg1) {
            int var47;
            int var48 = var47 = arg4 << 16;
            int var49 = arg3 << 16;
            if (arg6 < 0) {
                var48 -= arg6 * var8;
                var47 -= arg6 * var9;
                arg6 = 0;
            }
            if (arg1 < 0) {
                var49 -= arg1 * var10;
                arg1 = 0;
            }
            if ((arg1 == arg6 || var9 <= var8) && (arg1 != arg6 || var8 <= var10)) {
                int var53 = arg2 - arg1;
                int var54 = arg1 - arg6;
                int var55 = this.field899 * arg6;
                while (true) {
                    var54--;
                    if (var54 < 0) {
                        while (true) {
                            var53--;
                            if (var53 < 0) {
                                return;
                            }
                            method419(-23108, 0, var49 >> 16, var55, var48 >> 16, this.field902);
                            var55 += this.field899;
                            var49 += var10;
                            var48 += var8;
                        }
                    }
                    method419(-23108, 0, var47 >> 16, var55, var48 >> 16, this.field902);
                    var47 += var9;
                    var48 += var8;
                    var55 += this.field899;
                }
            } else {
                int var50 = arg2 - arg1;
                int var51 = arg1 - arg6;
                int var52 = this.field899 * arg6;
                while (true) {
                    var51--;
                    if (var51 < 0) {
                        while (true) {
                            var50--;
                            if (var50 < 0) {
                                return;
                            }
                            method419(-23108, 0, var48 >> 16, var52, var49 >> 16, this.field902);
                            var49 += var10;
                            var52 += this.field899;
                            var48 += var8;
                        }
                    }
                    method419(-23108, 0, var48 >> 16, var52, var47 >> 16, this.field902);
                    var52 += this.field899;
                    var48 += var8;
                    var47 += var9;
                }
            }
        } else {
            int var56;
            int var57 = var56 = arg4 << 16;
            if (arg6 < 0) {
                var56 -= arg6 * var9;
                var57 -= arg6 * var8;
                arg6 = 0;
            }
            int var58 = arg5 << 16;
            if (arg2 < 0) {
                var58 -= arg2 * var10;
                arg2 = 0;
            }
            if (var9 > var8) {
                int var59 = arg1 - arg2;
                int var60 = arg2 - arg6;
                int var61 = this.field899 * arg6;
                while (true) {
                    var60--;
                    if (var60 < 0) {
                        while (true) {
                            var59--;
                            if (var59 < 0) {
                                return;
                            }
                            method419(-23108, 0, var58 >> 16, var61, var56 >> 16, this.field902);
                            var61 += this.field899;
                            var58 += var10;
                            var56 += var9;
                        }
                    }
                    method419(-23108, 0, var57 >> 16, var61, var56 >> 16, this.field902);
                    var57 += var8;
                    var56 += var9;
                    var61 += this.field899;
                }
            } else {
                int var62 = arg1 - arg2;
                int var63 = arg2 - arg6;
                int var64 = this.field899 * arg6;
                while (true) {
                    var63--;
                    if (var63 < 0) {
                        while (true) {
                            var62--;
                            if (var62 < 0) {
                                return;
                            }
                            method419(-23108, 0, var56 >> 16, var64, var58 >> 16, this.field902);
                            var56 += var9;
                            var58 += var10;
                            var64 += this.field899;
                        }
                    }
                    method419(-23108, 0, var56 >> 16, var64, var57 >> 16, this.field902);
                    var64 += this.field899;
                    var56 += var9;
                    var57 += var8;
                }
            }
        }
    }

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "(B)V", line = 494)
    public final void method421(byte arg0) {
        int var2 = -1;
        int var3 = this.field902.length - 8;
        if (arg0 >= -83) {
            this.method422(-93, 94, -82);
        }
        while (var2 < var3) {
            var2++;
            this.field902[var2] = 0;
            var2++;
            this.field902[var2] = 0;
            var2++;
            this.field902[var2] = 0;
            var2++;
            this.field902[var2] = 0;
            var2++;
            this.field902[var2] = 0;
            var2++;
            this.field902[var2] = 0;
            var2++;
            this.field902[var2] = 0;
            var2++;
            this.field902[var2] = 0;
        }
        while (var2 < (this.field902.length - 1)) {
            var2++;
            this.field902[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(III)Z", line = 522)
    public final boolean method422(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            this.method421((byte) -111);
        }
        return (arg0 * arg1) <= this.field902.length;
    }

    @OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(Lig;II)V", line = 531)
    public class67(class132 arg0, int arg1, int arg2) {
        this.field902 = new byte[arg1 * arg2];
    }
}
