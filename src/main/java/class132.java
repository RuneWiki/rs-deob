import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gr")
public class class132 extends class98 {

    @OriginalMember(owner = "client!gr", name = "I", descriptor = "[B")
    public byte[] field1859;

    @OriginalMember(owner = "client!gr", name = "E", descriptor = "I")
    public int field1855;

    @OriginalMember(owner = "client!gr", name = "F", descriptor = "I")
    public int field1856;

    @OriginalMember(owner = "client!gr", name = "G", descriptor = "I")
    public int field1857;

    @OriginalMember(owner = "client!gr", name = "H", descriptor = "I")
    public int field1858;

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(IIBII)V", line = 6)
    public final void method830(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (arg2 >= -77) {
            this.field1856 = 111;
        }
        this.field1856 = arg0;
        this.field1855 = arg3;
        this.field1858 = arg1 - arg0;
        this.field1857 = arg4 - arg3;
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(IIIIIII)V", line = 29)
    public final void method831(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = 0;
        if (arg0 != arg6) {
            var8 = (arg5 - arg3 << 16) / (arg0 - arg6);
        }
        int var9 = 0;
        if (arg0 != arg2) {
            var9 = (arg1 - arg5 << 16) / (arg2 - arg0);
        }
        if (arg4 != -10722) {
            return;
        }
        int var10 = 0;
        if (arg2 != arg6) {
            var10 = (arg3 - arg1 << 16) / (arg6 - arg2);
        }
        if (arg0 >= arg6 && arg6 <= arg2) {
            if (arg0 < arg2) {
                int var11;
                int var12 = var11 = arg3 << 16;
                int var13 = arg5 << 16;
                if (arg6 < 0) {
                    var11 -= arg6 * var8;
                    var12 -= arg6 * var10;
                    arg6 = 0;
                }
                if (arg0 < 0) {
                    var13 -= arg0 * var9;
                    arg0 = 0;
                }
                if (arg0 != arg6 && var10 < var8 || arg0 == arg6 && var10 > var9) {
                    int var14 = arg2 - arg0;
                    int var15 = arg0 - arg6;
                    int var16 = this.field1857 * arg6;
                    while (true) {
                        var15--;
                        if (var15 < 0) {
                            while (true) {
                                var14--;
                                if (var14 < 0) {
                                    return;
                                }
                                method833(0, false, var16, var12 >> 16, this.field1859, var13 >> 16);
                                var13 += var9;
                                var16 += this.field1857;
                                var12 += var10;
                            }
                        }
                        method833(0, false, var16, var12 >> 16, this.field1859, var11 >> 16);
                        var12 += var10;
                        var16 += this.field1857;
                        var11 += var8;
                    }
                } else {
                    int var17 = arg2 - arg0;
                    int var18 = arg0 - arg6;
                    int var19 = this.field1857 * arg6;
                    while (true) {
                        var18--;
                        if (var18 < 0) {
                            while (true) {
                                var17--;
                                if (var17 < 0) {
                                    return;
                                }
                                method833(0, false, var19, var13 >> 16, this.field1859, var12 >> 16);
                                var12 += var10;
                                var19 += this.field1857;
                                var13 += var9;
                            }
                        }
                        method833(0, false, var19, var11 >> 16, this.field1859, var12 >> 16);
                        var19 += this.field1857;
                        var11 += var8;
                        var12 += var10;
                    }
                }
            } else {
                int var20;
                int var21 = var20 = arg3 << 16;
                int var22 = arg1 << 16;
                if (arg6 < 0) {
                    var21 -= arg6 * var10;
                    var20 -= arg6 * var8;
                    arg6 = 0;
                }
                if (arg2 < 0) {
                    var22 -= arg2 * var9;
                    arg2 = 0;
                }
                if ((arg2 == arg6 || var8 <= var10) && (arg2 != arg6 || var8 >= var9)) {
                    int var26 = arg0 - arg2;
                    int var27 = arg2 - arg6;
                    int var28 = this.field1857 * arg6;
                    while (true) {
                        var27--;
                        if (var27 < 0) {
                            while (true) {
                                var26--;
                                if (var26 < 0) {
                                    return;
                                }
                                method833(0, false, var28, var20 >> 16, this.field1859, var22 >> 16);
                                var28 += this.field1857;
                                var20 += var8;
                                var22 += var9;
                            }
                        }
                        method833(0, false, var28, var20 >> 16, this.field1859, var21 >> 16);
                        var28 += this.field1857;
                        var21 += var10;
                        var20 += var8;
                    }
                } else {
                    int var23 = arg0 - arg2;
                    int var24 = arg2 - arg6;
                    int var25 = this.field1857 * arg6;
                    while (true) {
                        var24--;
                        if (var24 < 0) {
                            while (true) {
                                var23--;
                                if (var23 < 0) {
                                    return;
                                }
                                method833(0, false, var25, var22 >> 16, this.field1859, var20 >> 16);
                                var25 += this.field1857;
                                var22 += var9;
                                var20 += var8;
                            }
                        }
                        method833(0, false, var25, var21 >> 16, this.field1859, var20 >> 16);
                        var25 += this.field1857;
                        var20 += var8;
                        var21 += var10;
                    }
                }
            }
        } else if (arg2 < arg0) {
            if (arg0 <= arg6) {
                int var29;
                int var30 = var29 = arg1 << 16;
                if (arg2 < 0) {
                    var29 -= arg2 * var10;
                    var30 -= arg2 * var9;
                    arg2 = 0;
                }
                int var31 = arg5 << 16;
                if (arg0 < 0) {
                    var31 -= arg0 * var8;
                    arg0 = 0;
                }
                if (var10 > var9) {
                    int var32 = arg6 - arg0;
                    int var33 = arg0 - arg2;
                    int var34 = this.field1857 * arg2;
                    while (true) {
                        var33--;
                        if (var33 < 0) {
                            while (true) {
                                var32--;
                                if (var32 < 0) {
                                    return;
                                }
                                method833(0, false, var34, var31 >> 16, this.field1859, var29 >> 16);
                                var31 += var8;
                                var29 += var10;
                                var34 += this.field1857;
                            }
                        }
                        method833(0, false, var34, var30 >> 16, this.field1859, var29 >> 16);
                        var29 += var10;
                        var30 += var9;
                        var34 += this.field1857;
                    }
                } else {
                    int var35 = arg6 - arg0;
                    int var36 = arg0 - arg2;
                    int var37 = this.field1857 * arg2;
                    while (true) {
                        var36--;
                        if (var36 < 0) {
                            while (true) {
                                var35--;
                                if (var35 < 0) {
                                    return;
                                }
                                method833(0, false, var37, var29 >> 16, this.field1859, var31 >> 16);
                                var31 += var8;
                                var29 += var10;
                                var37 += this.field1857;
                            }
                        }
                        method833(0, false, var37, var29 >> 16, this.field1859, var30 >> 16);
                        var37 += this.field1857;
                        var29 += var10;
                        var30 += var9;
                    }
                }
            } else {
                int var38;
                int var39 = var38 = arg1 << 16;
                if (arg2 < 0) {
                    var38 -= arg2 * var10;
                    var39 -= arg2 * var9;
                    arg2 = 0;
                }
                int var40 = arg3 << 16;
                if (arg6 < 0) {
                    var40 -= arg6 * var8;
                    arg6 = 0;
                }
                if (var9 >= var10) {
                    int var41 = arg0 - arg6;
                    int var42 = arg6 - arg2;
                    int var43 = this.field1857 * arg2;
                    while (true) {
                        var42--;
                        if (var42 < 0) {
                            while (true) {
                                var41--;
                                if (var41 < 0) {
                                    return;
                                }
                                method833(0, false, var43, var40 >> 16, this.field1859, var39 >> 16);
                                var40 += var8;
                                var39 += var9;
                                var43 += this.field1857;
                            }
                        }
                        method833(0, false, var43, var38 >> 16, this.field1859, var39 >> 16);
                        var38 += var10;
                        var39 += var9;
                        var43 += this.field1857;
                    }
                } else {
                    int var44 = arg0 - arg6;
                    int var45 = arg6 - arg2;
                    int var46 = this.field1857 * arg2;
                    while (true) {
                        var45--;
                        if (var45 < 0) {
                            while (true) {
                                var44--;
                                if (var44 < 0) {
                                    return;
                                }
                                method833(0, false, var46, var39 >> 16, this.field1859, var40 >> 16);
                                var46 += this.field1857;
                                var39 += var9;
                                var40 += var8;
                            }
                        }
                        method833(0, false, var46, var39 >> 16, this.field1859, var38 >> 16);
                        var39 += var9;
                        var38 += var10;
                        var46 += this.field1857;
                    }
                }
            }
        } else if (arg2 < arg6) {
            int var47;
            int var48 = var47 = arg5 << 16;
            if (arg0 < 0) {
                var47 -= arg0 * var9;
                var48 -= arg0 * var8;
                arg0 = 0;
            }
            int var49 = arg1 << 16;
            if (arg2 < 0) {
                var49 -= arg2 * var10;
                arg2 = 0;
            }
            if ((arg0 == arg2 || var9 <= var8) && (arg0 != arg2 || var10 >= var8)) {
                int var53 = arg6 - arg2;
                int var54 = arg2 - arg0;
                int var55 = this.field1857 * arg0;
                while (true) {
                    var54--;
                    if (var54 < 0) {
                        while (true) {
                            var53--;
                            if (var53 < 0) {
                                return;
                            }
                            method833(0, false, var55, var49 >> 16, this.field1859, var48 >> 16);
                            var48 += var8;
                            var49 += var10;
                            var55 += this.field1857;
                        }
                    }
                    method833(0, false, var55, var47 >> 16, this.field1859, var48 >> 16);
                    var47 += var9;
                    var48 += var8;
                    var55 += this.field1857;
                }
            } else {
                int var50 = arg6 - arg2;
                int var51 = arg2 - arg0;
                int var52 = this.field1857 * arg0;
                while (true) {
                    var51--;
                    if (var51 < 0) {
                        while (true) {
                            var50--;
                            if (var50 < 0) {
                                return;
                            }
                            method833(0, false, var52, var48 >> 16, this.field1859, var49 >> 16);
                            var48 += var8;
                            var49 += var10;
                            var52 += this.field1857;
                        }
                    }
                    method833(0, false, var52, var48 >> 16, this.field1859, var47 >> 16);
                    var52 += this.field1857;
                    var48 += var8;
                    var47 += var9;
                }
            }
        } else {
            int var56;
            int var57 = var56 = arg5 << 16;
            if (arg0 < 0) {
                var56 -= arg0 * var9;
                var57 -= arg0 * var8;
                arg0 = 0;
            }
            int var58 = arg3 << 16;
            if (arg6 < 0) {
                var58 -= arg6 * var10;
                arg6 = 0;
            }
            if (var8 < var9) {
                int var59 = arg2 - arg6;
                int var60 = arg6 - arg0;
                int var61 = this.field1857 * arg0;
                while (true) {
                    var60--;
                    if (var60 < 0) {
                        while (true) {
                            var59--;
                            if (var59 < 0) {
                                return;
                            }
                            method833(0, false, var61, var58 >> 16, this.field1859, var56 >> 16);
                            var56 += var9;
                            var58 += var10;
                            var61 += this.field1857;
                        }
                    }
                    method833(0, false, var61, var57 >> 16, this.field1859, var56 >> 16);
                    var57 += var8;
                    var56 += var9;
                    var61 += this.field1857;
                }
            } else {
                int var62 = arg2 - arg6;
                int var63 = arg6 - arg0;
                int var64 = this.field1857 * arg0;
                while (true) {
                    var63--;
                    if (var63 < 0) {
                        while (true) {
                            var62--;
                            if (var62 < 0) {
                                return;
                            }
                            method833(0, false, var64, var56 >> 16, this.field1859, var58 >> 16);
                            var64 += this.field1857;
                            var56 += var9;
                            var58 += var10;
                        }
                    }
                    method833(0, false, var64, var56 >> 16, this.field1859, var57 >> 16);
                    var64 += this.field1857;
                    var57 += var8;
                    var56 += var9;
                }
            }
        }
    }

    @OriginalMember(owner = "client!gr", name = "c", descriptor = "(Z)V", line = 464)
    public final void method832(boolean arg0) {
        if (arg0) {
            this.field1858 = 34;
        }
        int var2 = -1;
        int var3 = this.field1859.length - 8;
        while (var3 > var2) {
            var2++;
            this.field1859[var2] = 0;
            var2++;
            this.field1859[var2] = 0;
            var2++;
            this.field1859[var2] = 0;
            var2++;
            this.field1859[var2] = 0;
            var2++;
            this.field1859[var2] = 0;
            var2++;
            this.field1859[var2] = 0;
            var2++;
            this.field1859[var2] = 0;
            var2++;
            this.field1859[var2] = 0;
        }
        while (var2 < (this.field1859.length - 1)) {
            var2++;
            this.field1859[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(IZII[BI)V", line = 492)
    private static final void method833(int arg0, boolean arg1, int arg2, int arg3, byte[] arg4, int arg5) {
        if (arg5 <= arg3 || arg1) {
            return;
        }
        int var6 = arg5 - arg3 >> 2;
        int var7 = arg2 + arg3;
        while (true) {
            var6--;
            if (var6 < 0) {
                int var8 = arg5 - arg3 & 0x3;
                while (true) {
                    var8--;
                    if (var8 < 0) {
                        return;
                    }
                    arg4[var7++] = 1;
                }
            }
            arg4[var7++] = 1;
            arg4[var7++] = 1;
            arg4[var7++] = 1;
            arg4[var7++] = 1;
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(IBI)Z", line = 521)
    public final boolean method834(int arg0, byte arg1, int arg2) {
        if (arg1 < 118) {
            this.method830(-1, 98, (byte) -102, -93, -62);
        }
        return this.field1859.length >= (arg0 * arg2);
    }

    @OriginalMember(owner = "client!gr", name = "<init>", descriptor = "(Lnf;II)V", line = 529)
    public class132(class256 arg0, int arg1, int arg2) {
        this.field1859 = new byte[arg1 * arg2];
    }
}
