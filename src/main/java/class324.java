import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class324 extends class173 {

    @OriginalMember(owner = "client!ia", name = "H", descriptor = "[B")
    public byte[] field4462;

    @OriginalMember(owner = "client!ia", name = "D", descriptor = "I")
    public int field4458;

    @OriginalMember(owner = "client!ia", name = "E", descriptor = "I")
    public int field4459;

    @OriginalMember(owner = "client!ia", name = "F", descriptor = "I")
    public int field4460;

    @OriginalMember(owner = "client!ia", name = "G", descriptor = "I")
    public int field4461;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(BIII[BI)V", line = 5)
    private static final void method1948(byte arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5) {
        if (arg2 >= arg1) {
            return;
        }
        int var6 = arg1 - arg2 >> 2;
        int var7 = arg2 + arg3;
        if (arg0 > -99) {
            return;
        }
        while (true) {
            var6--;
            if (var6 < 0) {
                int var8 = arg1 - arg2 & 0x3;
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

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(III)Z", line = 38)
    public final boolean method1949(int arg0, int arg1, int arg2) {
        if (arg0 != -26403) {
            this.field4462 = (byte[]) null;
        }
        return this.field4462.length >= (arg1 * arg2);
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIIB)V", line = 51)
    public final void method1950(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        this.field4458 = arg2 - arg1;
        this.field4459 = arg0 - arg3;
        if (arg4 != 86) {
            this.field4458 = 23;
        }
        this.field4461 = arg3;
        this.field4460 = arg1;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIIIII)V", line = 70)
    public final void method1951(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = 0;
        if (arg3 != 3482) {
            this.method1951(73, -30, -28, -14, -39, 93, -128);
        }
        if (arg5 != arg6) {
            var8 = (arg2 - arg1 << 16) / (arg5 - arg6);
        }
        int var9 = 0;
        if (arg4 != arg5) {
            var9 = (arg0 - arg2 << 16) / (arg4 - arg5);
        }
        int var10 = 0;
        if (arg4 != arg6) {
            var10 = (arg1 - arg0 << 16) / (arg6 - arg4);
        }
        if (arg5 >= arg6 && arg6 <= arg4) {
            if (arg5 < arg4) {
                int var11;
                int var12 = var11 = arg1 << 16;
                if (arg6 < 0) {
                    var12 -= arg6 * var10;
                    var11 -= arg6 * var8;
                    arg6 = 0;
                }
                int var13 = arg2 << 16;
                if (arg5 < 0) {
                    var13 -= arg5 * var9;
                    arg5 = 0;
                }
                if (arg5 != arg6 && var10 < var8 || arg5 == arg6 && var10 > var9) {
                    int var14 = arg4 - arg5;
                    int var15 = arg5 - arg6;
                    int var16 = this.field4459 * arg6;
                    while (true) {
                        var15--;
                        if (var15 < 0) {
                            while (true) {
                                var14--;
                                if (var14 < 0) {
                                    return;
                                }
                                method1948((byte) -116, var13 >> 16, var12 >> 16, var16, this.field4462, 0);
                                var13 += var9;
                                var12 += var10;
                                var16 += this.field4459;
                            }
                        }
                        method1948((byte) -110, var11 >> 16, var12 >> 16, var16, this.field4462, 0);
                        var12 += var10;
                        var16 += this.field4459;
                        var11 += var8;
                    }
                } else {
                    int var17 = arg4 - arg5;
                    int var18 = arg5 - arg6;
                    int var19 = this.field4459 * arg6;
                    while (true) {
                        var18--;
                        if (var18 < 0) {
                            while (true) {
                                var17--;
                                if (var17 < 0) {
                                    return;
                                }
                                method1948((byte) -111, var12 >> 16, var13 >> 16, var19, this.field4462, 0);
                                var12 += var10;
                                var19 += this.field4459;
                                var13 += var9;
                            }
                        }
                        method1948((byte) -106, var12 >> 16, var11 >> 16, var19, this.field4462, 0);
                        var11 += var8;
                        var19 += this.field4459;
                        var12 += var10;
                    }
                }
            } else {
                int var20;
                int var21 = var20 = arg1 << 16;
                if (arg6 < 0) {
                    var20 -= arg6 * var8;
                    var21 -= arg6 * var10;
                    arg6 = 0;
                }
                int var22 = arg0 << 16;
                if (arg4 < 0) {
                    var22 -= arg4 * var9;
                    arg4 = 0;
                }
                if ((arg4 == arg6 || var10 >= var8) && (arg4 != arg6 || var8 >= var9)) {
                    int var26 = arg5 - arg4;
                    int var27 = arg4 - arg6;
                    int var28 = this.field4459 * arg6;
                    while (true) {
                        var27--;
                        if (var27 < 0) {
                            while (true) {
                                var26--;
                                if (var26 < 0) {
                                    return;
                                }
                                method1948((byte) -109, var22 >> 16, var20 >> 16, var28, this.field4462, 0);
                                var22 += var9;
                                var20 += var8;
                                var28 += this.field4459;
                            }
                        }
                        method1948((byte) -128, var21 >> 16, var20 >> 16, var28, this.field4462, 0);
                        var28 += this.field4459;
                        var20 += var8;
                        var21 += var10;
                    }
                } else {
                    int var23 = arg5 - arg4;
                    int var24 = arg4 - arg6;
                    int var25 = this.field4459 * arg6;
                    while (true) {
                        var24--;
                        if (var24 < 0) {
                            while (true) {
                                var23--;
                                if (var23 < 0) {
                                    return;
                                }
                                method1948((byte) -115, var20 >> 16, var22 >> 16, var25, this.field4462, 0);
                                var20 += var8;
                                var25 += this.field4459;
                                var22 += var9;
                            }
                        }
                        method1948((byte) -115, var20 >> 16, var21 >> 16, var25, this.field4462, 0);
                        var25 += this.field4459;
                        var21 += var10;
                        var20 += var8;
                    }
                }
            }
        } else if (arg5 > arg4) {
            if (arg5 > arg6) {
                int var29;
                int var30 = var29 = arg0 << 16;
                if (arg4 < 0) {
                    var29 -= arg4 * var10;
                    var30 -= arg4 * var9;
                    arg4 = 0;
                }
                int var31 = arg1 << 16;
                if (arg6 < 0) {
                    var31 -= arg6 * var8;
                    arg6 = 0;
                }
                if (var9 < var10) {
                    int var32 = arg5 - arg6;
                    int var33 = arg6 - arg4;
                    int var34 = this.field4459 * arg4;
                    while (true) {
                        var33--;
                        if (var33 < 0) {
                            while (true) {
                                var32--;
                                if (var32 < 0) {
                                    return;
                                }
                                method1948((byte) -108, var31 >> 16, var30 >> 16, var34, this.field4462, 0);
                                var34 += this.field4459;
                                var30 += var9;
                                var31 += var8;
                            }
                        }
                        method1948((byte) -103, var29 >> 16, var30 >> 16, var34, this.field4462, 0);
                        var34 += this.field4459;
                        var30 += var9;
                        var29 += var10;
                    }
                } else {
                    int var35 = arg5 - arg6;
                    int var36 = arg6 - arg4;
                    int var37 = this.field4459 * arg4;
                    while (true) {
                        var36--;
                        if (var36 < 0) {
                            while (true) {
                                var35--;
                                if (var35 < 0) {
                                    return;
                                }
                                method1948((byte) -126, var30 >> 16, var31 >> 16, var37, this.field4462, 0);
                                var31 += var8;
                                var30 += var9;
                                var37 += this.field4459;
                            }
                        }
                        method1948((byte) -105, var30 >> 16, var29 >> 16, var37, this.field4462, 0);
                        var30 += var9;
                        var29 += var10;
                        var37 += this.field4459;
                    }
                }
            } else {
                int var38;
                int var39 = var38 = arg0 << 16;
                if (arg4 < 0) {
                    var38 -= arg4 * var10;
                    var39 -= arg4 * var9;
                    arg4 = 0;
                }
                int var40 = arg2 << 16;
                if (arg5 < 0) {
                    var40 -= arg5 * var8;
                    arg5 = 0;
                }
                if (var10 > var9) {
                    int var41 = arg6 - arg5;
                    int var42 = arg5 - arg4;
                    int var43 = this.field4459 * arg4;
                    while (true) {
                        var42--;
                        if (var42 < 0) {
                            while (true) {
                                var41--;
                                if (var41 < 0) {
                                    return;
                                }
                                method1948((byte) -119, var38 >> 16, var40 >> 16, var43, this.field4462, 0);
                                var38 += var10;
                                var40 += var8;
                                var43 += this.field4459;
                            }
                        }
                        method1948((byte) -113, var38 >> 16, var39 >> 16, var43, this.field4462, 0);
                        var38 += var10;
                        var43 += this.field4459;
                        var39 += var9;
                    }
                } else {
                    int var44 = arg6 - arg5;
                    int var45 = arg5 - arg4;
                    int var46 = this.field4459 * arg4;
                    while (true) {
                        var45--;
                        if (var45 < 0) {
                            while (true) {
                                var44--;
                                if (var44 < 0) {
                                    return;
                                }
                                method1948((byte) -127, var40 >> 16, var38 >> 16, var46, this.field4462, 0);
                                var38 += var10;
                                var40 += var8;
                                var46 += this.field4459;
                            }
                        }
                        method1948((byte) -125, var39 >> 16, var38 >> 16, var46, this.field4462, 0);
                        var38 += var10;
                        var46 += this.field4459;
                        var39 += var9;
                    }
                }
            }
        } else if (arg6 > arg4) {
            int var47;
            int var48 = var47 = arg2 << 16;
            if (arg5 < 0) {
                var47 -= arg5 * var9;
                var48 -= arg5 * var8;
                arg5 = 0;
            }
            int var49 = arg0 << 16;
            if (arg4 < 0) {
                var49 -= arg4 * var10;
                arg4 = 0;
            }
            if ((arg4 == arg5 || var9 <= var8) && (arg4 != arg5 || var10 >= var8)) {
                int var53 = arg6 - arg4;
                int var54 = arg4 - arg5;
                int var55 = this.field4459 * arg5;
                while (true) {
                    var54--;
                    if (var54 < 0) {
                        while (true) {
                            var53--;
                            if (var53 < 0) {
                                return;
                            }
                            method1948((byte) -105, var48 >> 16, var49 >> 16, var55, this.field4462, 0);
                            var49 += var10;
                            var55 += this.field4459;
                            var48 += var8;
                        }
                    }
                    method1948((byte) -103, var48 >> 16, var47 >> 16, var55, this.field4462, 0);
                    var55 += this.field4459;
                    var48 += var8;
                    var47 += var9;
                }
            } else {
                int var50 = arg6 - arg4;
                int var51 = arg4 - arg5;
                int var52 = this.field4459 * arg5;
                while (true) {
                    var51--;
                    if (var51 < 0) {
                        while (true) {
                            var50--;
                            if (var50 < 0) {
                                return;
                            }
                            method1948((byte) -123, var49 >> 16, var48 >> 16, var52, this.field4462, 0);
                            var48 += var8;
                            var52 += this.field4459;
                            var49 += var10;
                        }
                    }
                    method1948((byte) -106, var47 >> 16, var48 >> 16, var52, this.field4462, 0);
                    var47 += var9;
                    var48 += var8;
                    var52 += this.field4459;
                }
            }
        } else {
            int var56;
            int var57 = var56 = arg2 << 16;
            if (arg5 < 0) {
                var57 -= arg5 * var8;
                var56 -= arg5 * var9;
                arg5 = 0;
            }
            int var58 = arg1 << 16;
            if (arg6 < 0) {
                var58 -= arg6 * var10;
                arg6 = 0;
            }
            if (var8 < var9) {
                int var59 = arg4 - arg6;
                int var60 = arg6 - arg5;
                int var61 = this.field4459 * arg5;
                while (true) {
                    var60--;
                    if (var60 < 0) {
                        while (true) {
                            var59--;
                            if (var59 < 0) {
                                return;
                            }
                            method1948((byte) -105, var56 >> 16, var58 >> 16, var61, this.field4462, 0);
                            var61 += this.field4459;
                            var56 += var9;
                            var58 += var10;
                        }
                    }
                    method1948((byte) -110, var56 >> 16, var57 >> 16, var61, this.field4462, 0);
                    var57 += var8;
                    var61 += this.field4459;
                    var56 += var9;
                }
            } else {
                int var62 = arg4 - arg6;
                int var63 = arg6 - arg5;
                int var64 = this.field4459 * arg5;
                while (true) {
                    var63--;
                    if (var63 < 0) {
                        while (true) {
                            var62--;
                            if (var62 < 0) {
                                return;
                            }
                            method1948((byte) -108, var58 >> 16, var56 >> 16, var64, this.field4462, 0);
                            var56 += var9;
                            var58 += var10;
                            var64 += this.field4459;
                        }
                    }
                    method1948((byte) -123, var57 >> 16, var56 >> 16, var64, this.field4462, 0);
                    var64 += this.field4459;
                    var57 += var8;
                    var56 += var9;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "(I)V", line = 507)
    public final void method1952(int arg0) {
        int var2 = -1;
        int var3 = this.field4462.length - 8;
        while (var2 < var3) {
            var2++;
            this.field4462[var2] = 0;
            var2++;
            this.field4462[var2] = 0;
            var2++;
            this.field4462[var2] = 0;
            var2++;
            this.field4462[var2] = 0;
            var2++;
            this.field4462[var2] = 0;
            var2++;
            this.field4462[var2] = 0;
            var2++;
            this.field4462[var2] = 0;
            var2++;
            this.field4462[var2] = 0;
        }
        while ((this.field4462.length - 1) > var2) {
            var2++;
            this.field4462[var2] = 0;
        }
        if (arg0 < 22) {
            this.method1952(61);
        }
    }

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(Lqi;II)V", line = 532)
    public class324(class458 arg0, int arg1, int arg2) {
        this.field4462 = new byte[arg1 * arg2];
    }
}
