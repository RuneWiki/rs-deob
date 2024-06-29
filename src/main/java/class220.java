import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!is")
public class class220 extends class308 {

    @OriginalMember(owner = "client!is", name = "B", descriptor = "[B")
    public byte[] field3060;

    @OriginalMember(owner = "client!is", name = "x", descriptor = "I")
    public int field3056;

    @OriginalMember(owner = "client!is", name = "y", descriptor = "I")
    public int field3057;

    @OriginalMember(owner = "client!is", name = "z", descriptor = "I")
    public int field3058;

    @OriginalMember(owner = "client!is", name = "A", descriptor = "I")
    public int field3059;

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(IIIIIII)V", line = 5)
    public final void method1440(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = 0;
        if (arg2 != arg5) {
            var8 = (arg4 - arg1 << 16) / (arg2 - arg5);
        }
        int var9 = -33 / ((57 - arg3) / 56);
        int var10 = 0;
        if (arg2 != arg6) {
            var10 = (arg0 - arg4 << 16) / (arg6 - arg2);
        }
        int var11 = 0;
        if (arg5 != arg6) {
            var11 = (arg1 - arg0 << 16) / (arg5 - arg6);
        }
        if (arg2 >= arg5 && arg5 <= arg6) {
            if (arg6 <= arg2) {
                int var12;
                int var13 = var12 = arg1 << 16;
                if (arg5 < 0) {
                    var13 -= arg5 * var11;
                    var12 -= arg5 * var8;
                    arg5 = 0;
                }
                int var14 = arg0 << 16;
                if (arg6 < 0) {
                    var14 -= arg6 * var10;
                    arg6 = 0;
                }
                if (arg5 != arg6 && var11 < var8 || arg5 == arg6 && var8 < var10) {
                    int var15 = arg2 - arg6;
                    int var16 = arg6 - arg5;
                    int var17 = this.field3057 * arg5;
                    while (true) {
                        var16--;
                        if (var16 < 0) {
                            while (true) {
                                var15--;
                                if (var15 < 0) {
                                    return;
                                }
                                method1441(0, (byte) 79, this.field3060, var12 >> 16, var14 >> 16, var17);
                                var14 += var10;
                                var17 += this.field3057;
                                var12 += var8;
                            }
                        }
                        method1441(0, (byte) 74, this.field3060, var12 >> 16, var13 >> 16, var17);
                        var13 += var11;
                        var12 += var8;
                        var17 += this.field3057;
                    }
                } else {
                    int var18 = arg2 - arg6;
                    int var19 = arg6 - arg5;
                    int var20 = this.field3057 * arg5;
                    while (true) {
                        var19--;
                        if (var19 < 0) {
                            while (true) {
                                var18--;
                                if (var18 < 0) {
                                    return;
                                }
                                method1441(0, (byte) 105, this.field3060, var14 >> 16, var12 >> 16, var20);
                                var12 += var8;
                                var14 += var10;
                                var20 += this.field3057;
                            }
                        }
                        method1441(0, (byte) 68, this.field3060, var13 >> 16, var12 >> 16, var20);
                        var20 += this.field3057;
                        var13 += var11;
                        var12 += var8;
                    }
                }
            } else {
                int var21;
                int var22 = var21 = arg1 << 16;
                int var23 = arg4 << 16;
                if (arg5 < 0) {
                    var21 -= arg5 * var8;
                    var22 -= arg5 * var11;
                    arg5 = 0;
                }
                if (arg2 < 0) {
                    var23 -= arg2 * var10;
                    arg2 = 0;
                }
                if (arg2 != arg5 && var8 > var11 || arg2 == arg5 && var10 < var11) {
                    int var24 = arg6 - arg2;
                    int var25 = arg2 - arg5;
                    int var26 = this.field3057 * arg5;
                    while (true) {
                        var25--;
                        if (var25 < 0) {
                            while (true) {
                                var24--;
                                if (var24 < 0) {
                                    return;
                                }
                                method1441(0, (byte) 34, this.field3060, var23 >> 16, var22 >> 16, var26);
                                var23 += var10;
                                var26 += this.field3057;
                                var22 += var11;
                            }
                        }
                        method1441(0, (byte) 43, this.field3060, var21 >> 16, var22 >> 16, var26);
                        var21 += var8;
                        var26 += this.field3057;
                        var22 += var11;
                    }
                } else {
                    int var27 = arg6 - arg2;
                    int var28 = arg2 - arg5;
                    int var29 = this.field3057 * arg5;
                    while (true) {
                        var28--;
                        if (var28 < 0) {
                            while (true) {
                                var27--;
                                if (var27 < 0) {
                                    return;
                                }
                                method1441(0, (byte) 102, this.field3060, var22 >> 16, var23 >> 16, var29);
                                var22 += var11;
                                var29 += this.field3057;
                                var23 += var10;
                            }
                        }
                        method1441(0, (byte) 29, this.field3060, var22 >> 16, var21 >> 16, var29);
                        var21 += var8;
                        var22 += var11;
                        var29 += this.field3057;
                    }
                }
            }
        } else if (arg6 < arg2) {
            if (arg5 < arg2) {
                int var30;
                int var31 = var30 = arg0 << 16;
                int var32 = arg1 << 16;
                if (arg6 < 0) {
                    var31 -= arg6 * var10;
                    var30 -= arg6 * var11;
                    arg6 = 0;
                }
                if (arg5 < 0) {
                    var32 -= arg5 * var8;
                    arg5 = 0;
                }
                if (var10 >= var11) {
                    int var33 = arg2 - arg5;
                    int var34 = arg5 - arg6;
                    int var35 = this.field3057 * arg6;
                    while (true) {
                        var34--;
                        if (var34 < 0) {
                            while (true) {
                                var33--;
                                if (var33 < 0) {
                                    return;
                                }
                                method1441(0, (byte) 93, this.field3060, var31 >> 16, var32 >> 16, var35);
                                var32 += var8;
                                var31 += var10;
                                var35 += this.field3057;
                            }
                        }
                        method1441(0, (byte) 65, this.field3060, var31 >> 16, var30 >> 16, var35);
                        var35 += this.field3057;
                        var30 += var11;
                        var31 += var10;
                    }
                } else {
                    int var36 = arg2 - arg5;
                    int var37 = arg5 - arg6;
                    int var38 = this.field3057 * arg6;
                    while (true) {
                        var37--;
                        if (var37 < 0) {
                            while (true) {
                                var36--;
                                if (var36 < 0) {
                                    return;
                                }
                                method1441(0, (byte) 41, this.field3060, var32 >> 16, var31 >> 16, var38);
                                var38 += this.field3057;
                                var32 += var8;
                                var31 += var10;
                            }
                        }
                        method1441(0, (byte) 116, this.field3060, var30 >> 16, var31 >> 16, var38);
                        var30 += var11;
                        var38 += this.field3057;
                        var31 += var10;
                    }
                }
            } else {
                int var39;
                int var40 = var39 = arg0 << 16;
                int var41 = arg4 << 16;
                if (arg6 < 0) {
                    var40 -= arg6 * var10;
                    var39 -= arg6 * var11;
                    arg6 = 0;
                }
                if (arg2 < 0) {
                    var41 -= arg2 * var8;
                    arg2 = 0;
                }
                if (var11 > var10) {
                    int var42 = arg5 - arg2;
                    int var43 = arg2 - arg6;
                    int var44 = this.field3057 * arg6;
                    while (true) {
                        var43--;
                        if (var43 < 0) {
                            while (true) {
                                var42--;
                                if (var42 < 0) {
                                    return;
                                }
                                method1441(0, (byte) 121, this.field3060, var39 >> 16, var41 >> 16, var44);
                                var44 += this.field3057;
                                var41 += var8;
                                var39 += var11;
                            }
                        }
                        method1441(0, (byte) 118, this.field3060, var39 >> 16, var40 >> 16, var44);
                        var40 += var10;
                        var44 += this.field3057;
                        var39 += var11;
                    }
                } else {
                    int var45 = arg5 - arg2;
                    int var46 = arg2 - arg6;
                    int var47 = this.field3057 * arg6;
                    while (true) {
                        var46--;
                        if (var46 < 0) {
                            while (true) {
                                var45--;
                                if (var45 < 0) {
                                    return;
                                }
                                method1441(0, (byte) 65, this.field3060, var41 >> 16, var39 >> 16, var47);
                                var47 += this.field3057;
                                var41 += var8;
                                var39 += var11;
                            }
                        }
                        method1441(0, (byte) 126, this.field3060, var40 >> 16, var39 >> 16, var47);
                        var47 += this.field3057;
                        var40 += var10;
                        var39 += var11;
                    }
                }
            }
        } else if (arg6 >= arg5) {
            int var48;
            int var49 = var48 = arg4 << 16;
            if (arg2 < 0) {
                var48 -= arg2 * var10;
                var49 -= arg2 * var8;
                arg2 = 0;
            }
            int var50 = arg1 << 16;
            if (arg5 < 0) {
                var50 -= arg5 * var11;
                arg5 = 0;
            }
            if (var10 > var8) {
                int var51 = arg6 - arg5;
                int var52 = arg5 - arg2;
                int var53 = this.field3057 * arg2;
                while (true) {
                    var52--;
                    if (var52 < 0) {
                        while (true) {
                            var51--;
                            if (var51 < 0) {
                                return;
                            }
                            method1441(0, (byte) 51, this.field3060, var48 >> 16, var50 >> 16, var53);
                            var48 += var10;
                            var50 += var11;
                            var53 += this.field3057;
                        }
                    }
                    method1441(0, (byte) 79, this.field3060, var48 >> 16, var49 >> 16, var53);
                    var48 += var10;
                    var49 += var8;
                    var53 += this.field3057;
                }
            } else {
                int var54 = arg6 - arg5;
                int var55 = arg5 - arg2;
                int var56 = this.field3057 * arg2;
                while (true) {
                    var55--;
                    if (var55 < 0) {
                        while (true) {
                            var54--;
                            if (var54 < 0) {
                                return;
                            }
                            method1441(0, (byte) 122, this.field3060, var50 >> 16, var48 >> 16, var56);
                            var50 += var11;
                            var48 += var10;
                            var56 += this.field3057;
                        }
                    }
                    method1441(0, (byte) 94, this.field3060, var49 >> 16, var48 >> 16, var56);
                    var49 += var8;
                    var48 += var10;
                    var56 += this.field3057;
                }
            }
        } else {
            int var57;
            int var58 = var57 = arg4 << 16;
            if (arg2 < 0) {
                var57 -= arg2 * var10;
                var58 -= arg2 * var8;
                arg2 = 0;
            }
            int var59 = arg0 << 16;
            if (arg6 < 0) {
                var59 -= arg6 * var11;
                arg6 = 0;
            }
            if (arg2 != arg6 && var10 > var8 || arg2 == arg6 && var11 < var8) {
                int var60 = arg5 - arg6;
                int var61 = arg6 - arg2;
                int var62 = this.field3057 * arg2;
                while (true) {
                    var61--;
                    if (var61 < 0) {
                        while (true) {
                            var60--;
                            if (var60 < 0) {
                                return;
                            }
                            method1441(0, (byte) 68, this.field3060, var59 >> 16, var58 >> 16, var62);
                            var62 += this.field3057;
                            var58 += var8;
                            var59 += var11;
                        }
                    }
                    method1441(0, (byte) 79, this.field3060, var57 >> 16, var58 >> 16, var62);
                    var62 += this.field3057;
                    var57 += var10;
                    var58 += var8;
                }
            } else {
                int var63 = arg5 - arg6;
                int var64 = arg6 - arg2;
                int var65 = this.field3057 * arg2;
                while (true) {
                    var64--;
                    if (var64 < 0) {
                        while (true) {
                            var63--;
                            if (var63 < 0) {
                                return;
                            }
                            method1441(0, (byte) 20, this.field3060, var58 >> 16, var59 >> 16, var65);
                            var58 += var8;
                            var65 += this.field3057;
                            var59 += var11;
                        }
                    }
                    method1441(0, (byte) 111, this.field3060, var58 >> 16, var57 >> 16, var65);
                    var57 += var10;
                    var58 += var8;
                    var65 += this.field3057;
                }
            }
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(IB[BIII)V", line = 438)
    private static final void method1441(int arg0, byte arg1, byte[] arg2, int arg3, int arg4, int arg5) {
        if (arg4 >= arg3) {
            return;
        }
        int var6 = arg3 - arg4 >> 2;
        int var7 = arg4 + arg5;
        while (true) {
            var6--;
            if (var6 < 0) {
                int var8 = arg3 - arg4 & 0x3;
                if (arg1 < 16) {
                    method1441(0, (byte) -105, (byte[]) null, -126, -61, -49);
                }
                while (true) {
                    var8--;
                    if (var8 < 0) {
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

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(IIIII)V", line = 469)
    public final void method1442(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field3056 = arg3;
        if (arg1 == -1) {
            this.field3058 = arg4;
            this.field3059 = arg2 - arg3;
            this.field3057 = arg0 - arg4;
        }
    }

    @OriginalMember(owner = "client!is", name = "d", descriptor = "(B)V", line = 492)
    public final void method1443(byte arg0) {
        int var2 = -1;
        int var3 = this.field3060.length - 8;
        while (var2 < var3) {
            var2++;
            this.field3060[var2] = 0;
            var2++;
            this.field3060[var2] = 0;
            var2++;
            this.field3060[var2] = 0;
            var2++;
            this.field3060[var2] = 0;
            var2++;
            this.field3060[var2] = 0;
            var2++;
            this.field3060[var2] = 0;
            var2++;
            this.field3060[var2] = 0;
            var2++;
            this.field3060[var2] = 0;
        }
        while (this.field3060.length - 1 > var2) {
            var2++;
            this.field3060[var2] = 0;
        }
        if (arg0 <= 83) {
            this.field3060 = (byte[]) null;
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(III)Z", line = 521)
    public final boolean method1444(int arg0, int arg1, int arg2) {
        if (arg1 != 1906328304) {
            this.method1444(77, 76, 66);
        }
        return arg0 * arg2 <= this.field3060.length;
    }

    @OriginalMember(owner = "client!is", name = "<init>", descriptor = "(Lse;II)V", line = 529)
    public class220(class282 arg0, int arg1, int arg2) {
        this.field3060 = new byte[arg1 * arg2];
    }
}
