import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class440 extends class87 {

    @OriginalMember(owner = "client!uj", name = "B", descriptor = "[B")
    public byte[] field6225;

    @OriginalMember(owner = "client!uj", name = "x", descriptor = "I")
    public int field6222;

    @OriginalMember(owner = "client!uj", name = "y", descriptor = "I")
    public int field6223;

    @OriginalMember(owner = "client!uj", name = "z", descriptor = "I")
    public int field6224;

    @OriginalMember(owner = "client!uj", name = "C", descriptor = "I")
    public int field6226;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(BIIII[B)V", line = 4)
    private static final void method2559(byte arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        if (arg1 <= arg2) {
            return;
        }
        int var6 = arg1 - arg2 >> 2;
        int var7 = arg2 + arg3;
        while (true) {
            var6--;
            if (var6 < 0) {
                if (arg0 != -98) {
                    method2559((byte) 127, -114, -12, -94, 30, (byte[]) null);
                }
                int var8 = arg1 - arg2 & 0x3;
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

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Z)V", line = 34)
    public final void method2560(boolean arg0) {
        if (arg0) {
            this.method2561(124, -103, (byte) -65, 64, -103, -62, -110);
        }
        int var2 = -1;
        int var3 = this.field6225.length - 8;
        while (var2 < var3) {
            var2++;
            this.field6225[var2] = 0;
            var2++;
            this.field6225[var2] = 0;
            var2++;
            this.field6225[var2] = 0;
            var2++;
            this.field6225[var2] = 0;
            var2++;
            this.field6225[var2] = 0;
            var2++;
            this.field6225[var2] = 0;
            var2++;
            this.field6225[var2] = 0;
            var2++;
            this.field6225[var2] = 0;
        }
        while (var2 < (this.field6225.length - 1)) {
            var2++;
            this.field6225[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIBIIII)V", line = 63)
    public final void method2561(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 != 70) {
            this.field6225 = (byte[]) null;
        }
        int var8 = 0;
        if (arg0 != arg4) {
            var8 = (arg3 - arg6 << 16) / (arg4 - arg0);
        }
        int var9 = 0;
        if (arg1 != arg4) {
            var9 = (arg5 - arg3 << 16) / (arg1 - arg4);
        }
        int var10 = 0;
        if (arg0 != arg1) {
            var10 = (arg6 - arg5 << 16) / (arg0 - arg1);
        }
        if (arg4 >= arg0 && arg0 <= arg1) {
            if (arg4 >= arg1) {
                int var11;
                int var12 = var11 = arg6 << 16;
                if (arg0 < 0) {
                    var12 -= arg0 * var10;
                    var11 -= arg0 * var8;
                    arg0 = 0;
                }
                int var13 = arg5 << 16;
                if (arg1 < 0) {
                    var13 -= arg1 * var9;
                    arg1 = 0;
                }
                if (arg0 != arg1 && var10 < var8 || arg0 == arg1 && var9 > var8) {
                    int var14 = arg4 - arg1;
                    int var15 = arg1 - arg0;
                    int var16 = this.field6222 * arg0;
                    while (true) {
                        var15--;
                        if (var15 < 0) {
                            while (true) {
                                var14--;
                                if (var14 < 0) {
                                    return;
                                }
                                method2559((byte) -98, var11 >> 16, var13 >> 16, var16, 0, this.field6225);
                                var11 += var8;
                                var13 += var9;
                                var16 += this.field6222;
                            }
                        }
                        method2559((byte) -98, var11 >> 16, var12 >> 16, var16, 0, this.field6225);
                        var12 += var10;
                        var16 += this.field6222;
                        var11 += var8;
                    }
                } else {
                    int var17 = arg4 - arg1;
                    int var18 = arg1 - arg0;
                    int var19 = this.field6222 * arg0;
                    while (true) {
                        var18--;
                        if (var18 < 0) {
                            while (true) {
                                var17--;
                                if (var17 < 0) {
                                    return;
                                }
                                method2559((byte) -98, var13 >> 16, var11 >> 16, var19, 0, this.field6225);
                                var11 += var8;
                                var19 += this.field6222;
                                var13 += var9;
                            }
                        }
                        method2559((byte) -98, var12 >> 16, var11 >> 16, var19, 0, this.field6225);
                        var11 += var8;
                        var12 += var10;
                        var19 += this.field6222;
                    }
                }
            } else {
                int var20;
                int var21 = var20 = arg6 << 16;
                int var22 = arg3 << 16;
                if (arg0 < 0) {
                    var21 -= arg0 * var10;
                    var20 -= arg0 * var8;
                    arg0 = 0;
                }
                if (arg4 < 0) {
                    var22 -= arg4 * var9;
                    arg4 = 0;
                }
                if ((arg0 == arg4 || var10 >= var8) && (arg0 != arg4 || var9 >= var10)) {
                    int var26 = arg1 - arg4;
                    int var27 = arg4 - arg0;
                    int var28 = this.field6222 * arg0;
                    while (true) {
                        var27--;
                        if (var27 < 0) {
                            while (true) {
                                var26--;
                                if (var26 < 0) {
                                    return;
                                }
                                method2559((byte) -98, var21 >> 16, var22 >> 16, var28, 0, this.field6225);
                                var28 += this.field6222;
                                var22 += var9;
                                var21 += var10;
                            }
                        }
                        method2559((byte) -98, var21 >> 16, var20 >> 16, var28, 0, this.field6225);
                        var21 += var10;
                        var28 += this.field6222;
                        var20 += var8;
                    }
                } else {
                    int var23 = arg1 - arg4;
                    int var24 = arg4 - arg0;
                    int var25 = this.field6222 * arg0;
                    while (true) {
                        var24--;
                        if (var24 < 0) {
                            while (true) {
                                var23--;
                                if (var23 < 0) {
                                    return;
                                }
                                method2559((byte) -98, var22 >> 16, var21 >> 16, var25, 0, this.field6225);
                                var21 += var10;
                                var22 += var9;
                                var25 += this.field6222;
                            }
                        }
                        method2559((byte) -98, var20 >> 16, var21 >> 16, var25, 0, this.field6225);
                        var21 += var10;
                        var20 += var8;
                        var25 += this.field6222;
                    }
                }
            }
        } else if (arg1 >= arg4) {
            if (arg1 < arg0) {
                int var29;
                int var30 = var29 = arg3 << 16;
                if (arg4 < 0) {
                    var30 -= arg4 * var8;
                    var29 -= arg4 * var9;
                    arg4 = 0;
                }
                int var31 = arg5 << 16;
                if (arg1 < 0) {
                    var31 -= arg1 * var10;
                    arg1 = 0;
                }
                if (arg1 != arg4 && var9 > var8 || arg1 == arg4 && var10 < var8) {
                    int var32 = arg0 - arg1;
                    int var33 = arg1 - arg4;
                    int var34 = this.field6222 * arg4;
                    while (true) {
                        var33--;
                        if (var33 < 0) {
                            while (true) {
                                var32--;
                                if (var32 < 0) {
                                    return;
                                }
                                method2559((byte) -98, var31 >> 16, var30 >> 16, var34, 0, this.field6225);
                                var31 += var10;
                                var30 += var8;
                                var34 += this.field6222;
                            }
                        }
                        method2559((byte) -98, var29 >> 16, var30 >> 16, var34, 0, this.field6225);
                        var29 += var9;
                        var30 += var8;
                        var34 += this.field6222;
                    }
                } else {
                    int var35 = arg0 - arg1;
                    int var36 = arg1 - arg4;
                    int var37 = this.field6222 * arg4;
                    while (true) {
                        var36--;
                        if (var36 < 0) {
                            while (true) {
                                var35--;
                                if (var35 < 0) {
                                    return;
                                }
                                method2559((byte) -98, var30 >> 16, var31 >> 16, var37, 0, this.field6225);
                                var31 += var10;
                                var30 += var8;
                                var37 += this.field6222;
                            }
                        }
                        method2559((byte) -98, var30 >> 16, var29 >> 16, var37, 0, this.field6225);
                        var30 += var8;
                        var29 += var9;
                        var37 += this.field6222;
                    }
                }
            } else {
                int var38;
                int var39 = var38 = arg3 << 16;
                int var40 = arg6 << 16;
                if (arg4 < 0) {
                    var38 -= arg4 * var9;
                    var39 -= arg4 * var8;
                    arg4 = 0;
                }
                if (arg0 < 0) {
                    var40 -= arg0 * var10;
                    arg0 = 0;
                }
                if (var8 >= var9) {
                    int var41 = arg1 - arg0;
                    int var42 = arg0 - arg4;
                    int var43 = this.field6222 * arg4;
                    while (true) {
                        var42--;
                        if (var42 < 0) {
                            while (true) {
                                var41--;
                                if (var41 < 0) {
                                    return;
                                }
                                method2559((byte) -98, var40 >> 16, var38 >> 16, var43, 0, this.field6225);
                                var40 += var10;
                                var43 += this.field6222;
                                var38 += var9;
                            }
                        }
                        method2559((byte) -98, var39 >> 16, var38 >> 16, var43, 0, this.field6225);
                        var43 += this.field6222;
                        var38 += var9;
                        var39 += var8;
                    }
                } else {
                    int var44 = arg1 - arg0;
                    int var45 = arg0 - arg4;
                    int var46 = this.field6222 * arg4;
                    while (true) {
                        var45--;
                        if (var45 < 0) {
                            while (true) {
                                var44--;
                                if (var44 < 0) {
                                    return;
                                }
                                method2559((byte) -98, var38 >> 16, var40 >> 16, var46, 0, this.field6225);
                                var40 += var10;
                                var46 += this.field6222;
                                var38 += var9;
                            }
                        }
                        method2559((byte) -98, var38 >> 16, var39 >> 16, var46, 0, this.field6225);
                        var46 += this.field6222;
                        var39 += var8;
                        var38 += var9;
                    }
                }
            }
        } else if (arg4 > arg0) {
            int var47;
            int var48 = var47 = arg5 << 16;
            if (arg1 < 0) {
                var47 -= arg1 * var10;
                var48 -= arg1 * var9;
                arg1 = 0;
            }
            int var49 = arg6 << 16;
            if (arg0 < 0) {
                var49 -= arg0 * var8;
                arg0 = 0;
            }
            if (var10 > var9) {
                int var50 = arg4 - arg0;
                int var51 = arg0 - arg1;
                int var52 = this.field6222 * arg1;
                while (true) {
                    var51--;
                    if (var51 < 0) {
                        while (true) {
                            var50--;
                            if (var50 < 0) {
                                return;
                            }
                            method2559((byte) -98, var49 >> 16, var48 >> 16, var52, 0, this.field6225);
                            var48 += var9;
                            var49 += var8;
                            var52 += this.field6222;
                        }
                    }
                    method2559((byte) -98, var47 >> 16, var48 >> 16, var52, 0, this.field6225);
                    var47 += var10;
                    var52 += this.field6222;
                    var48 += var9;
                }
            } else {
                int var53 = arg4 - arg0;
                int var54 = arg0 - arg1;
                int var55 = this.field6222 * arg1;
                while (true) {
                    var54--;
                    if (var54 < 0) {
                        while (true) {
                            var53--;
                            if (var53 < 0) {
                                return;
                            }
                            method2559((byte) -98, var48 >> 16, var49 >> 16, var55, 0, this.field6225);
                            var55 += this.field6222;
                            var49 += var8;
                            var48 += var9;
                        }
                    }
                    method2559((byte) -98, var48 >> 16, var47 >> 16, var55, 0, this.field6225);
                    var47 += var10;
                    var48 += var9;
                    var55 += this.field6222;
                }
            }
        } else {
            int var56;
            int var57 = var56 = arg5 << 16;
            int var58 = arg3 << 16;
            if (arg1 < 0) {
                var57 -= arg1 * var9;
                var56 -= arg1 * var10;
                arg1 = 0;
            }
            if (arg4 < 0) {
                var58 -= arg4 * var8;
                arg4 = 0;
            }
            if (var9 < var10) {
                int var59 = arg0 - arg4;
                int var60 = arg4 - arg1;
                int var61 = this.field6222 * arg1;
                while (true) {
                    var60--;
                    if (var60 < 0) {
                        while (true) {
                            var59--;
                            if (var59 < 0) {
                                return;
                            }
                            method2559((byte) -98, var56 >> 16, var58 >> 16, var61, 0, this.field6225);
                            var61 += this.field6222;
                            var58 += var8;
                            var56 += var10;
                        }
                    }
                    method2559((byte) -98, var56 >> 16, var57 >> 16, var61, 0, this.field6225);
                    var61 += this.field6222;
                    var56 += var10;
                    var57 += var9;
                }
            } else {
                int var62 = arg0 - arg4;
                int var63 = arg4 - arg1;
                int var64 = this.field6222 * arg1;
                while (true) {
                    var63--;
                    if (var63 < 0) {
                        while (true) {
                            var62--;
                            if (var62 < 0) {
                                return;
                            }
                            method2559((byte) -98, var58 >> 16, var56 >> 16, var64, 0, this.field6225);
                            var56 += var10;
                            var58 += var8;
                            var64 += this.field6222;
                        }
                    }
                    method2559((byte) -98, var57 >> 16, var56 >> 16, var64, 0, this.field6225);
                    var56 += var10;
                    var64 += this.field6222;
                    var57 += var9;
                }
            }
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(III)Z", line = 499)
    public final boolean method2562(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            this.method2563(-18, -29, 20, (byte) -75, -18);
        }
        return (arg0 * arg2) <= this.field6225.length;
    }

    @OriginalMember(owner = "client!uj", name = "<init>", descriptor = "(Lnm;II)V", line = 514)
    public class440(class254 arg0, int arg1, int arg2) {
        this.field6225 = new byte[arg1 * arg2];
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIIBI)V", line = 529)
    public final void method2563(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        this.field6222 = arg0 - arg4;
        this.field6224 = arg4;
        this.field6226 = arg1 - arg2;
        this.field6223 = arg2;
        if (arg3 > -89) {
            method2559((byte) 88, -13, -2, -17, -40, (byte[]) null);
        }
    }
}
