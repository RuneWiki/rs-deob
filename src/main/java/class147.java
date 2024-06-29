import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class147 extends class152 {

    @OriginalMember(owner = "client!kg", name = "Q", descriptor = "[B")
    public byte[] field1803;

    @OriginalMember(owner = "client!kg", name = "I", descriptor = "I")
    public int field1800;

    @OriginalMember(owner = "client!kg", name = "K", descriptor = "I")
    public int field1801;

    @OriginalMember(owner = "client!kg", name = "O", descriptor = "I")
    public int field1802;

    @OriginalMember(owner = "client!kg", name = "U", descriptor = "I")
    public int field1804;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIB)Z")
    public final boolean method889(int arg0, int arg1, byte arg2) {
        int var4 = -115 % ((arg2 - 50) / 52);
        return this.field1803.length >= (arg0 * arg1);
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIIII)V")
    public final void method890(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field1802 = arg4;
        this.field1801 = arg0;
        this.field1800 = arg3 - arg4;
        if (arg1 != -1615387824) {
            this.field1800 = 38;
        }
        this.field1804 = arg2 - arg0;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIIBIII)V")
    public final void method891(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        int var8 = 0;
        if (arg3 != 82) {
            this.field1804 = 81;
        }
        if (arg0 != arg2) {
            var8 = (arg6 - arg1 << 16) / (arg2 - arg0);
        }
        int var9 = 0;
        if (arg2 != arg4) {
            var9 = (arg5 - arg6 << 16) / (arg4 - arg2);
        }
        int var10 = 0;
        if (arg0 != arg4) {
            var10 = (arg1 - arg5 << 16) / (arg0 - arg4);
        }
        if (arg0 <= arg2 && arg4 >= arg0) {
            if (arg4 <= arg2) {
                int var11;
                int var12 = var11 = arg1 << 16;
                int var13 = arg5 << 16;
                if (arg0 < 0) {
                    var12 -= arg0 * var10;
                    var11 -= arg0 * var8;
                    arg0 = 0;
                }
                if (arg4 < 0) {
                    var13 -= arg4 * var9;
                    arg4 = 0;
                }
                if (arg0 != arg4 && var8 > var10 || arg0 == arg4 && var8 < var9) {
                    int var14 = arg2 - arg4;
                    int var15 = arg4 - arg0;
                    int var16 = this.field1800 * arg0;
                    while (true) {
                        var15--;
                        if (var15 < 0) {
                            while (true) {
                                var14--;
                                if (var14 < 0) {
                                    return;
                                }
                                method893(111, var16, this.field1803, var11 >> 16, 0, var13 >> 16);
                                var16 += this.field1800;
                                var11 += var8;
                                var13 += var9;
                            }
                        }
                        method893(arg3 + 12, var16, this.field1803, var11 >> 16, 0, var12 >> 16);
                        var16 += this.field1800;
                        var11 += var8;
                        var12 += var10;
                    }
                } else {
                    int var17 = arg2 - arg4;
                    int var18 = arg4 - arg0;
                    int var19 = this.field1800 * arg0;
                    while (true) {
                        var18--;
                        if (var18 < 0) {
                            while (true) {
                                var17--;
                                if (var17 < 0) {
                                    return;
                                }
                                method893(-104, var19, this.field1803, var13 >> 16, 0, var11 >> 16);
                                var19 += this.field1800;
                                var11 += var8;
                                var13 += var9;
                            }
                        }
                        method893(65, var19, this.field1803, var12 >> 16, 0, var11 >> 16);
                        var11 += var8;
                        var19 += this.field1800;
                        var12 += var10;
                    }
                }
            } else {
                int var20;
                int var21 = var20 = arg1 << 16;
                if (arg0 < 0) {
                    var20 -= arg0 * var8;
                    var21 -= arg0 * var10;
                    arg0 = 0;
                }
                int var22 = arg6 << 16;
                if (arg2 < 0) {
                    var22 -= arg2 * var9;
                    arg2 = 0;
                }
                if ((arg0 == arg2 || var8 <= var10) && (arg0 != arg2 || var10 <= var9)) {
                    int var26 = arg4 - arg2;
                    int var27 = arg2 - arg0;
                    int var28 = this.field1800 * arg0;
                    while (true) {
                        var27--;
                        if (var27 < 0) {
                            while (true) {
                                var26--;
                                if (var26 < 0) {
                                    return;
                                }
                                method893(-111, var28, this.field1803, var21 >> 16, 0, var22 >> 16);
                                var22 += var9;
                                var28 += this.field1800;
                                var21 += var10;
                            }
                        }
                        method893(arg3 + 25, var28, this.field1803, var21 >> 16, 0, var20 >> 16);
                        var20 += var8;
                        var21 += var10;
                        var28 += this.field1800;
                    }
                } else {
                    int var23 = arg4 - arg2;
                    int var24 = arg2 - arg0;
                    int var25 = this.field1800 * arg0;
                    while (true) {
                        var24--;
                        if (var24 < 0) {
                            while (true) {
                                var23--;
                                if (var23 < 0) {
                                    return;
                                }
                                method893(-91, var25, this.field1803, var22 >> 16, 0, var21 >> 16);
                                var22 += var9;
                                var21 += var10;
                                var25 += this.field1800;
                            }
                        }
                        method893(arg3 ^ 0x3A, var25, this.field1803, var20 >> 16, 0, var21 >> 16);
                        var25 += this.field1800;
                        var20 += var8;
                        var21 += var10;
                    }
                }
            }
        } else if (arg2 <= arg4) {
            if (arg4 < arg0) {
                int var29;
                int var30 = var29 = arg6 << 16;
                if (arg2 < 0) {
                    var29 -= arg2 * var9;
                    var30 -= arg2 * var8;
                    arg2 = 0;
                }
                int var31 = arg5 << 16;
                if (arg4 < 0) {
                    var31 -= arg4 * var10;
                    arg4 = 0;
                }
                if (arg2 != arg4 && var8 < var9 || arg2 == arg4 && var10 < var8) {
                    int var32 = arg0 - arg4;
                    int var33 = arg4 - arg2;
                    int var34 = this.field1800 * arg2;
                    while (true) {
                        var33--;
                        if (var33 < 0) {
                            while (true) {
                                var32--;
                                if (var32 < 0) {
                                    return;
                                }
                                method893(81, var34, this.field1803, var31 >> 16, 0, var30 >> 16);
                                var30 += var8;
                                var31 += var10;
                                var34 += this.field1800;
                            }
                        }
                        method893(92, var34, this.field1803, var29 >> 16, 0, var30 >> 16);
                        var34 += this.field1800;
                        var30 += var8;
                        var29 += var9;
                    }
                } else {
                    int var35 = arg0 - arg4;
                    int var36 = arg4 - arg2;
                    int var37 = this.field1800 * arg2;
                    while (true) {
                        var36--;
                        if (var36 < 0) {
                            while (true) {
                                var35--;
                                if (var35 < 0) {
                                    return;
                                }
                                method893(-87, var37, this.field1803, var30 >> 16, 0, var31 >> 16);
                                var30 += var8;
                                var37 += this.field1800;
                                var31 += var10;
                            }
                        }
                        method893(120, var37, this.field1803, var30 >> 16, 0, var29 >> 16);
                        var29 += var9;
                        var30 += var8;
                        var37 += this.field1800;
                    }
                }
            } else {
                int var38;
                int var39 = var38 = arg6 << 16;
                int var40 = arg1 << 16;
                if (arg2 < 0) {
                    var39 -= arg2 * var8;
                    var38 -= arg2 * var9;
                    arg2 = 0;
                }
                if (arg0 < 0) {
                    var40 -= arg0 * var10;
                    arg0 = 0;
                }
                if (var9 <= var8) {
                    int var41 = arg4 - arg0;
                    int var42 = arg0 - arg2;
                    int var43 = this.field1800 * arg2;
                    while (true) {
                        var42--;
                        if (var42 < 0) {
                            while (true) {
                                var41--;
                                if (var41 < 0) {
                                    return;
                                }
                                method893(69, var43, this.field1803, var40 >> 16, 0, var38 >> 16);
                                var38 += var9;
                                var40 += var10;
                                var43 += this.field1800;
                            }
                        }
                        method893(-112, var43, this.field1803, var39 >> 16, 0, var38 >> 16);
                        var43 += this.field1800;
                        var39 += var8;
                        var38 += var9;
                    }
                } else {
                    int var44 = arg4 - arg0;
                    int var45 = arg0 - arg2;
                    int var46 = this.field1800 * arg2;
                    while (true) {
                        var45--;
                        if (var45 < 0) {
                            while (true) {
                                var44--;
                                if (var44 < 0) {
                                    return;
                                }
                                method893(28, var46, this.field1803, var38 >> 16, 0, var40 >> 16);
                                var38 += var9;
                                var46 += this.field1800;
                                var40 += var10;
                            }
                        }
                        method893(arg3 - 6, var46, this.field1803, var38 >> 16, 0, var39 >> 16);
                        var46 += this.field1800;
                        var38 += var9;
                        var39 += var8;
                    }
                }
            }
        } else if (arg0 < arg2) {
            int var47;
            int var48 = var47 = arg5 << 16;
            int var49 = arg1 << 16;
            if (arg4 < 0) {
                var48 -= arg4 * var9;
                var47 -= arg4 * var10;
                arg4 = 0;
            }
            if (arg0 < 0) {
                var49 -= arg0 * var8;
                arg0 = 0;
            }
            if (var10 > var9) {
                int var50 = arg2 - arg0;
                int var51 = arg0 - arg4;
                int var52 = this.field1800 * arg4;
                while (true) {
                    var51--;
                    if (var51 < 0) {
                        while (true) {
                            var50--;
                            if (var50 < 0) {
                                return;
                            }
                            method893(64, var52, this.field1803, var49 >> 16, 0, var48 >> 16);
                            var49 += var8;
                            var52 += this.field1800;
                            var48 += var9;
                        }
                    }
                    method893(121, var52, this.field1803, var47 >> 16, 0, var48 >> 16);
                    var47 += var10;
                    var48 += var9;
                    var52 += this.field1800;
                }
            } else {
                int var53 = arg2 - arg0;
                int var54 = arg0 - arg4;
                int var55 = this.field1800 * arg4;
                while (true) {
                    var54--;
                    if (var54 < 0) {
                        while (true) {
                            var53--;
                            if (var53 < 0) {
                                return;
                            }
                            method893(-103, var55, this.field1803, var48 >> 16, 0, var49 >> 16);
                            var48 += var9;
                            var49 += var8;
                            var55 += this.field1800;
                        }
                    }
                    method893(104, var55, this.field1803, var48 >> 16, 0, var47 >> 16);
                    var47 += var10;
                    var48 += var9;
                    var55 += this.field1800;
                }
            }
        } else {
            int var56;
            int var57 = var56 = arg5 << 16;
            int var58 = arg6 << 16;
            if (arg4 < 0) {
                var56 -= arg4 * var10;
                var57 -= arg4 * var9;
                arg4 = 0;
            }
            if (arg2 < 0) {
                var58 -= arg2 * var8;
                arg2 = 0;
            }
            if (var9 >= var10) {
                int var59 = arg0 - arg2;
                int var60 = arg2 - arg4;
                int var61 = this.field1800 * arg4;
                while (true) {
                    var60--;
                    if (var60 < 0) {
                        while (true) {
                            var59--;
                            if (var59 < 0) {
                                return;
                            }
                            method893(-85, var61, this.field1803, var58 >> 16, 0, var56 >> 16);
                            var61 += this.field1800;
                            var58 += var8;
                            var56 += var10;
                        }
                    }
                    method893(arg3 - 187, var61, this.field1803, var57 >> 16, 0, var56 >> 16);
                    var56 += var10;
                    var61 += this.field1800;
                    var57 += var9;
                }
            } else {
                int var62 = arg0 - arg2;
                int var63 = arg2 - arg4;
                int var64 = this.field1800 * arg4;
                while (true) {
                    var63--;
                    if (var63 < 0) {
                        while (true) {
                            var62--;
                            if (var62 < 0) {
                                return;
                            }
                            method893(80, var64, this.field1803, var56 >> 16, 0, var58 >> 16);
                            var56 += var10;
                            var64 += this.field1800;
                            var58 += var8;
                        }
                    }
                    method893(114, var64, this.field1803, var56 >> 16, 0, var57 >> 16);
                    var56 += var10;
                    var64 += this.field1800;
                    var57 += var9;
                }
            }
        }
    }

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "(I)V")
    public final void method892(int arg0) {
        if (arg0 != -7838) {
            return;
        }
        int var2 = -1;
        int var3 = this.field1803.length - 8;
        while (var2 < var3) {
            var2++;
            this.field1803[var2] = 0;
            var2++;
            this.field1803[var2] = 0;
            var2++;
            this.field1803[var2] = 0;
            var2++;
            this.field1803[var2] = 0;
            var2++;
            this.field1803[var2] = 0;
            var2++;
            this.field1803[var2] = 0;
            var2++;
            this.field1803[var2] = 0;
            var2++;
            this.field1803[var2] = 0;
        }
        while (var2 < (this.field1803.length - 1)) {
            var2++;
            this.field1803[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(Lao;II)V")
    public class147(class157 arg0, int arg1, int arg2) {
        this.field1803 = new byte[arg1 * arg2];
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(II[BIII)V")
    private static final void method893(int arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5) {
        int var6 = 101 % ((-arg0 - 25) / 52);
        if (arg3 <= arg5) {
            return;
        }
        int var7 = arg1 + arg5;
        int var8 = arg3 - arg5 >> 2;
        while (true) {
            var8--;
            if (var8 < 0) {
                int var9 = arg3 - arg5 & 0x3;
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
}
