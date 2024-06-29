import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class385 extends class294 {

    @OriginalMember(owner = "client!lc", name = "B", descriptor = "[B")
    public byte[] field5616;

    @OriginalMember(owner = "client!lc", name = "C", descriptor = "I")
    public int field5617;

    @OriginalMember(owner = "client!lc", name = "D", descriptor = "I")
    public int field5618;

    @OriginalMember(owner = "client!lc", name = "F", descriptor = "I")
    public int field5619;

    @OriginalMember(owner = "client!lc", name = "G", descriptor = "I")
    public int field5620;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIII)V", line = 5)
    public final void method2516(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 > 110) {
            this.field5619 = arg3;
            this.field5617 = arg2 - arg0;
            this.field5620 = arg1 - arg3;
            this.field5618 = arg0;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "([BIIIII)V", line = 24)
    private static final void method2517(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 <= arg4) {
            return;
        }
        int var6 = arg4 + arg5;
        int var7 = arg1 - arg4 >> 2;
        if (arg2 > -55) {
            return;
        }
        while (true) {
            var7--;
            if (var7 < 0) {
                int var8 = arg1 - arg4 & 0x3;
                while (true) {
                    var8--;
                    if (var8 < 0) {
                        return;
                    }
                    arg0[var6++] = 1;
                }
            }
            arg0[var6++] = 1;
            arg0[var6++] = 1;
            arg0[var6++] = 1;
            arg0[var6++] = 1;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIIIII)V", line = 55)
    public final void method2518(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = 43 / ((arg0 + 36) / 33);
        int var9 = 0;
        if (arg4 != arg6) {
            var9 = (arg2 - arg1 << 16) / (arg4 - arg6);
        }
        int var10 = 0;
        if (arg4 != arg5) {
            var10 = (arg3 - arg2 << 16) / (arg5 - arg4);
        }
        int var11 = 0;
        if (arg5 != arg6) {
            var11 = (arg1 - arg3 << 16) / (arg6 - arg5);
        }
        if (arg6 <= arg4 && arg5 >= arg6) {
            if (arg5 <= arg4) {
                int var12;
                int var13 = var12 = arg1 << 16;
                int var14 = arg3 << 16;
                if (arg6 < 0) {
                    var12 -= arg6 * var9;
                    var13 -= arg6 * var11;
                    arg6 = 0;
                }
                if (arg5 < 0) {
                    var14 -= arg5 * var10;
                    arg5 = 0;
                }
                if (arg5 != arg6 && var9 > var11 || arg5 == arg6 && var10 > var9) {
                    int var15 = arg4 - arg5;
                    int var16 = arg5 - arg6;
                    int var17 = this.field5617 * arg6;
                    while (true) {
                        var16--;
                        if (var16 < 0) {
                            while (true) {
                                var15--;
                                if (var15 < 0) {
                                    return;
                                }
                                method2517(this.field5616, var12 >> 16, -77, 0, var14 >> 16, var17);
                                var14 += var10;
                                var12 += var9;
                                var17 += this.field5617;
                            }
                        }
                        method2517(this.field5616, var12 >> 16, -67, 0, var13 >> 16, var17);
                        var17 += this.field5617;
                        var12 += var9;
                        var13 += var11;
                    }
                } else {
                    int var18 = arg4 - arg5;
                    int var19 = arg5 - arg6;
                    int var20 = this.field5617 * arg6;
                    while (true) {
                        var19--;
                        if (var19 < 0) {
                            while (true) {
                                var18--;
                                if (var18 < 0) {
                                    return;
                                }
                                method2517(this.field5616, var14 >> 16, -70, 0, var12 >> 16, var20);
                                var12 += var9;
                                var20 += this.field5617;
                                var14 += var10;
                            }
                        }
                        method2517(this.field5616, var13 >> 16, -99, 0, var12 >> 16, var20);
                        var20 += this.field5617;
                        var12 += var9;
                        var13 += var11;
                    }
                }
            } else {
                int var21;
                int var22 = var21 = arg1 << 16;
                if (arg6 < 0) {
                    var22 -= arg6 * var11;
                    var21 -= arg6 * var9;
                    arg6 = 0;
                }
                int var23 = arg2 << 16;
                if (arg4 < 0) {
                    var23 -= arg4 * var10;
                    arg4 = 0;
                }
                if (arg4 != arg6 && var9 > var11 || arg4 == arg6 && var10 < var11) {
                    int var24 = arg5 - arg4;
                    int var25 = arg4 - arg6;
                    int var26 = this.field5617 * arg6;
                    while (true) {
                        var25--;
                        if (var25 < 0) {
                            while (true) {
                                var24--;
                                if (var24 < 0) {
                                    return;
                                }
                                method2517(this.field5616, var23 >> 16, -128, 0, var22 >> 16, var26);
                                var22 += var11;
                                var23 += var10;
                                var26 += this.field5617;
                            }
                        }
                        method2517(this.field5616, var21 >> 16, -120, 0, var22 >> 16, var26);
                        var22 += var11;
                        var21 += var9;
                        var26 += this.field5617;
                    }
                } else {
                    int var27 = arg5 - arg4;
                    int var28 = arg4 - arg6;
                    int var29 = this.field5617 * arg6;
                    while (true) {
                        var28--;
                        if (var28 < 0) {
                            while (true) {
                                var27--;
                                if (var27 < 0) {
                                    return;
                                }
                                method2517(this.field5616, var22 >> 16, -90, 0, var23 >> 16, var29);
                                var22 += var11;
                                var29 += this.field5617;
                                var23 += var10;
                            }
                        }
                        method2517(this.field5616, var22 >> 16, -92, 0, var21 >> 16, var29);
                        var22 += var11;
                        var21 += var9;
                        var29 += this.field5617;
                    }
                }
            }
        } else if (arg4 > arg5) {
            if (arg6 < arg4) {
                int var30;
                int var31 = var30 = arg3 << 16;
                int var32 = arg1 << 16;
                if (arg5 < 0) {
                    var31 -= arg5 * var10;
                    var30 -= arg5 * var11;
                    arg5 = 0;
                }
                if (arg6 < 0) {
                    var32 -= arg6 * var9;
                    arg6 = 0;
                }
                if (var10 < var11) {
                    int var33 = arg4 - arg6;
                    int var34 = arg6 - arg5;
                    int var35 = this.field5617 * arg5;
                    while (true) {
                        var34--;
                        if (var34 < 0) {
                            while (true) {
                                var33--;
                                if (var33 < 0) {
                                    return;
                                }
                                method2517(this.field5616, var32 >> 16, -75, 0, var31 >> 16, var35);
                                var35 += this.field5617;
                                var31 += var10;
                                var32 += var9;
                            }
                        }
                        method2517(this.field5616, var30 >> 16, -80, 0, var31 >> 16, var35);
                        var31 += var10;
                        var30 += var11;
                        var35 += this.field5617;
                    }
                } else {
                    int var36 = arg4 - arg6;
                    int var37 = arg6 - arg5;
                    int var38 = this.field5617 * arg5;
                    while (true) {
                        var37--;
                        if (var37 < 0) {
                            while (true) {
                                var36--;
                                if (var36 < 0) {
                                    return;
                                }
                                method2517(this.field5616, var31 >> 16, -123, 0, var32 >> 16, var38);
                                var38 += this.field5617;
                                var31 += var10;
                                var32 += var9;
                            }
                        }
                        method2517(this.field5616, var31 >> 16, -120, 0, var30 >> 16, var38);
                        var30 += var11;
                        var31 += var10;
                        var38 += this.field5617;
                    }
                }
            } else {
                int var39;
                int var40 = var39 = arg3 << 16;
                if (arg5 < 0) {
                    var40 -= arg5 * var10;
                    var39 -= arg5 * var11;
                    arg5 = 0;
                }
                int var41 = arg2 << 16;
                if (arg4 < 0) {
                    var41 -= arg4 * var9;
                    arg4 = 0;
                }
                if (var11 <= var10) {
                    int var42 = arg6 - arg4;
                    int var43 = arg4 - arg5;
                    int var44 = this.field5617 * arg5;
                    while (true) {
                        var43--;
                        if (var43 < 0) {
                            while (true) {
                                var42--;
                                if (var42 < 0) {
                                    return;
                                }
                                method2517(this.field5616, var41 >> 16, -128, 0, var39 >> 16, var44);
                                var44 += this.field5617;
                                var39 += var11;
                                var41 += var9;
                            }
                        }
                        method2517(this.field5616, var40 >> 16, -78, 0, var39 >> 16, var44);
                        var44 += this.field5617;
                        var39 += var11;
                        var40 += var10;
                    }
                } else {
                    int var45 = arg6 - arg4;
                    int var46 = arg4 - arg5;
                    int var47 = this.field5617 * arg5;
                    while (true) {
                        var46--;
                        if (var46 < 0) {
                            while (true) {
                                var45--;
                                if (var45 < 0) {
                                    return;
                                }
                                method2517(this.field5616, var39 >> 16, -56, 0, var41 >> 16, var47);
                                var39 += var11;
                                var47 += this.field5617;
                                var41 += var9;
                            }
                        }
                        method2517(this.field5616, var39 >> 16, -99, 0, var40 >> 16, var47);
                        var39 += var11;
                        var47 += this.field5617;
                        var40 += var10;
                    }
                }
            }
        } else if (arg6 <= arg5) {
            int var48;
            int var49 = var48 = arg2 << 16;
            if (arg4 < 0) {
                var48 -= arg4 * var10;
                var49 -= arg4 * var9;
                arg4 = 0;
            }
            int var50 = arg1 << 16;
            if (arg6 < 0) {
                var50 -= arg6 * var11;
                arg6 = 0;
            }
            if (var9 < var10) {
                int var51 = arg5 - arg6;
                int var52 = arg6 - arg4;
                int var53 = this.field5617 * arg4;
                while (true) {
                    var52--;
                    if (var52 < 0) {
                        while (true) {
                            var51--;
                            if (var51 < 0) {
                                return;
                            }
                            method2517(this.field5616, var48 >> 16, -65, 0, var50 >> 16, var53);
                            var53 += this.field5617;
                            var50 += var11;
                            var48 += var10;
                        }
                    }
                    method2517(this.field5616, var48 >> 16, -102, 0, var49 >> 16, var53);
                    var48 += var10;
                    var53 += this.field5617;
                    var49 += var9;
                }
            } else {
                int var54 = arg5 - arg6;
                int var55 = arg6 - arg4;
                int var56 = this.field5617 * arg4;
                while (true) {
                    var55--;
                    if (var55 < 0) {
                        while (true) {
                            var54--;
                            if (var54 < 0) {
                                return;
                            }
                            method2517(this.field5616, var50 >> 16, -56, 0, var48 >> 16, var56);
                            var56 += this.field5617;
                            var48 += var10;
                            var50 += var11;
                        }
                    }
                    method2517(this.field5616, var49 >> 16, -124, 0, var48 >> 16, var56);
                    var49 += var9;
                    var48 += var10;
                    var56 += this.field5617;
                }
            }
        } else {
            int var57;
            int var58 = var57 = arg2 << 16;
            int var59 = arg3 << 16;
            if (arg4 < 0) {
                var57 -= arg4 * var10;
                var58 -= arg4 * var9;
                arg4 = 0;
            }
            if (arg5 < 0) {
                var59 -= arg5 * var11;
                arg5 = 0;
            }
            if (arg4 != arg5 && var9 < var10 || arg4 == arg5 && var11 < var9) {
                int var60 = arg6 - arg5;
                int var61 = arg5 - arg4;
                int var62 = this.field5617 * arg4;
                while (true) {
                    var61--;
                    if (var61 < 0) {
                        while (true) {
                            var60--;
                            if (var60 < 0) {
                                return;
                            }
                            method2517(this.field5616, var59 >> 16, -89, 0, var58 >> 16, var62);
                            var62 += this.field5617;
                            var58 += var9;
                            var59 += var11;
                        }
                    }
                    method2517(this.field5616, var57 >> 16, -70, 0, var58 >> 16, var62);
                    var62 += this.field5617;
                    var57 += var10;
                    var58 += var9;
                }
            } else {
                int var63 = arg6 - arg5;
                int var64 = arg5 - arg4;
                int var65 = this.field5617 * arg4;
                while (true) {
                    var64--;
                    if (var64 < 0) {
                        while (true) {
                            var63--;
                            if (var63 < 0) {
                                return;
                            }
                            method2517(this.field5616, var58 >> 16, -81, 0, var59 >> 16, var65);
                            var58 += var9;
                            var59 += var11;
                            var65 += this.field5617;
                        }
                    }
                    method2517(this.field5616, var58 >> 16, -65, 0, var57 >> 16, var65);
                    var57 += var10;
                    var65 += this.field5617;
                    var58 += var9;
                }
            }
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(III)Z", line = 493)
    public final boolean method2519(int arg0, int arg1, int arg2) {
        int var4 = 60 % ((arg1 + 87) / 33);
        return (arg0 * arg2) <= this.field5616.length;
    }

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "(I)V", line = 503)
    public final void method2520(int arg0) {
        int var2 = -1;
        int var3 = this.field5616.length - 8;
        if (arg0 != -27335) {
            return;
        }
        while (var3 > var2) {
            var2++;
            this.field5616[var2] = 0;
            var2++;
            this.field5616[var2] = 0;
            var2++;
            this.field5616[var2] = 0;
            var2++;
            this.field5616[var2] = 0;
            var2++;
            this.field5616[var2] = 0;
            var2++;
            this.field5616[var2] = 0;
            var2++;
            this.field5616[var2] = 0;
            var2++;
            this.field5616[var2] = 0;
        }
        while ((this.field5616.length - 1) > var2) {
            var2++;
            this.field5616[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(Lhj;II)V", line = 529)
    public class385(class338 arg0, int arg1, int arg2) {
        this.field5616 = new byte[arg1 * arg2];
    }
}
