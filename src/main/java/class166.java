import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class166 extends class69 {

    @OriginalMember(owner = "client!ca", name = "F", descriptor = "[B")
    public byte[] field2300;

    @OriginalMember(owner = "client!ca", name = "C", descriptor = "I")
    public int field2298;

    @OriginalMember(owner = "client!ca", name = "D", descriptor = "I")
    public int field2299;

    @OriginalMember(owner = "client!ca", name = "G", descriptor = "I")
    public int field2301;

    @OriginalMember(owner = "client!ca", name = "H", descriptor = "I")
    public int field2302;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIBI[BI)V")
    private static final void method1110(int arg0, int arg1, byte arg2, int arg3, byte[] arg4, int arg5) {
        if (arg0 <= arg3) {
            return;
        }
        int var6 = arg3 + arg5;
        int var7 = arg0 - arg3 >> 2;
        while (true) {
            var7--;
            if (var7 < 0) {
                int var8 = arg0 - arg3 & 0x3;
                if (arg2 != 1) {
                    return;
                }
                while (true) {
                    var8--;
                    if (var8 < 0) {
                        return;
                    }
                    arg4[var6++] = 1;
                }
            }
            arg4[var6++] = 1;
            arg4[var6++] = 1;
            arg4[var6++] = 1;
            arg4[var6++] = 1;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Z)V")
    public final void method1111(boolean arg0) {
        int var2 = -1;
        int var3 = this.field2300.length - 8;
        while (var3 > var2) {
            var2++;
            this.field2300[var2] = 0;
            var2++;
            this.field2300[var2] = 0;
            var2++;
            this.field2300[var2] = 0;
            var2++;
            this.field2300[var2] = 0;
            var2++;
            this.field2300[var2] = 0;
            var2++;
            this.field2300[var2] = 0;
            var2++;
            this.field2300[var2] = 0;
            var2++;
            this.field2300[var2] = 0;
        }
        if (arg0) {
            this.field2299 = -98;
        }
        while ((this.field2300.length - 1) > var2) {
            var2++;
            this.field2300[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(III)Z")
    public final boolean method1112(int arg0, int arg1, int arg2) {
        if (arg0 != 0) {
            this.field2298 = 28;
        }
        return (arg1 * arg2) <= this.field2300.length;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIIII)V")
    public final void method1113(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field2299 = arg0;
        this.field2302 = arg1 - arg2;
        if (arg4 != 0) {
            this.field2301 = 103;
        }
        this.field2298 = arg2;
        this.field2301 = arg3 - arg0;
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(Ltb;II)V")
    public class166(class227 arg0, int arg1, int arg2) {
        this.field2300 = new byte[arg1 * arg2];
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIIIIIB)V")
    public final void method1114(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        int var8 = 0;
        if (arg1 != arg3) {
            var8 = (arg5 - arg4 << 16) / (arg3 - arg1);
        }
        int var9 = 0;
        if (arg2 != arg3) {
            var9 = (arg0 - arg5 << 16) / (arg2 - arg3);
        }
        if (arg6 != -72) {
            return;
        }
        int var10 = 0;
        if (arg1 != arg2) {
            var10 = (arg4 - arg0 << 16) / (arg1 - arg2);
        }
        if (arg3 >= arg1 && arg2 >= arg1) {
            if (arg2 > arg3) {
                int var11;
                int var12 = var11 = arg4 << 16;
                if (arg1 < 0) {
                    var11 -= arg1 * var8;
                    var12 -= arg1 * var10;
                    arg1 = 0;
                }
                int var13 = arg5 << 16;
                if (arg3 < 0) {
                    var13 -= arg3 * var9;
                    arg3 = 0;
                }
                if (arg1 != arg3 && var10 < var8 || arg1 == arg3 && var9 < var10) {
                    int var14 = arg2 - arg3;
                    int var15 = arg3 - arg1;
                    int var16 = this.field2301 * arg1;
                    while (true) {
                        var15--;
                        if (var15 < 0) {
                            while (true) {
                                var14--;
                                if (var14 < 0) {
                                    return;
                                }
                                method1110(var13 >> 16, 0, (byte) 1, var12 >> 16, this.field2300, var16);
                                var13 += var9;
                                var16 += this.field2301;
                                var12 += var10;
                            }
                        }
                        method1110(var11 >> 16, 0, (byte) 1, var12 >> 16, this.field2300, var16);
                        var11 += var8;
                        var12 += var10;
                        var16 += this.field2301;
                    }
                } else {
                    int var17 = arg2 - arg3;
                    int var18 = arg3 - arg1;
                    int var19 = this.field2301 * arg1;
                    while (true) {
                        var18--;
                        if (var18 < 0) {
                            while (true) {
                                var17--;
                                if (var17 < 0) {
                                    return;
                                }
                                method1110(var12 >> 16, 0, (byte) 1, var13 >> 16, this.field2300, var19);
                                var19 += this.field2301;
                                var12 += var10;
                                var13 += var9;
                            }
                        }
                        method1110(var12 >> 16, 0, (byte) 1, var11 >> 16, this.field2300, var19);
                        var12 += var10;
                        var11 += var8;
                        var19 += this.field2301;
                    }
                }
            } else {
                int var20;
                int var21 = var20 = arg4 << 16;
                int var22 = arg0 << 16;
                if (arg1 < 0) {
                    var20 -= arg1 * var8;
                    var21 -= arg1 * var10;
                    arg1 = 0;
                }
                if (arg2 < 0) {
                    var22 -= arg2 * var9;
                    arg2 = 0;
                }
                if ((arg1 == arg2 || var10 >= var8) && (arg1 != arg2 || var8 >= var9)) {
                    int var26 = arg3 - arg2;
                    int var27 = arg2 - arg1;
                    int var28 = this.field2301 * arg1;
                    while (true) {
                        var27--;
                        if (var27 < 0) {
                            while (true) {
                                var26--;
                                if (var26 < 0) {
                                    return;
                                }
                                method1110(var22 >> 16, 0, (byte) 1, var20 >> 16, this.field2300, var28);
                                var20 += var8;
                                var28 += this.field2301;
                                var22 += var9;
                            }
                        }
                        method1110(var21 >> 16, 0, (byte) 1, var20 >> 16, this.field2300, var28);
                        var28 += this.field2301;
                        var20 += var8;
                        var21 += var10;
                    }
                } else {
                    int var23 = arg3 - arg2;
                    int var24 = arg2 - arg1;
                    int var25 = this.field2301 * arg1;
                    while (true) {
                        var24--;
                        if (var24 < 0) {
                            while (true) {
                                var23--;
                                if (var23 < 0) {
                                    return;
                                }
                                method1110(var20 >> 16, 0, (byte) 1, var22 >> 16, this.field2300, var25);
                                var20 += var8;
                                var22 += var9;
                                var25 += this.field2301;
                            }
                        }
                        method1110(var20 >> 16, 0, (byte) 1, var21 >> 16, this.field2300, var25);
                        var20 += var8;
                        var21 += var10;
                        var25 += this.field2301;
                    }
                }
            }
        } else if (arg3 > arg2) {
            if (arg1 >= arg3) {
                int var29;
                int var30 = var29 = arg0 << 16;
                if (arg2 < 0) {
                    var30 -= arg2 * var9;
                    var29 -= arg2 * var10;
                    arg2 = 0;
                }
                int var31 = arg5 << 16;
                if (arg3 < 0) {
                    var31 -= arg3 * var8;
                    arg3 = 0;
                }
                if (var9 < var10) {
                    int var32 = arg1 - arg3;
                    int var33 = arg3 - arg2;
                    int var34 = this.field2301 * arg2;
                    while (true) {
                        var33--;
                        if (var33 < 0) {
                            while (true) {
                                var32--;
                                if (var32 < 0) {
                                    return;
                                }
                                method1110(var29 >> 16, 0, (byte) 1, var31 >> 16, this.field2300, var34);
                                var29 += var10;
                                var34 += this.field2301;
                                var31 += var8;
                            }
                        }
                        method1110(var29 >> 16, 0, (byte) 1, var30 >> 16, this.field2300, var34);
                        var30 += var9;
                        var29 += var10;
                        var34 += this.field2301;
                    }
                } else {
                    int var35 = arg1 - arg3;
                    int var36 = arg3 - arg2;
                    int var37 = this.field2301 * arg2;
                    while (true) {
                        var36--;
                        if (var36 < 0) {
                            while (true) {
                                var35--;
                                if (var35 < 0) {
                                    return;
                                }
                                method1110(var31 >> 16, 0, (byte) 1, var29 >> 16, this.field2300, var37);
                                var31 += var8;
                                var37 += this.field2301;
                                var29 += var10;
                            }
                        }
                        method1110(var30 >> 16, 0, (byte) 1, var29 >> 16, this.field2300, var37);
                        var30 += var9;
                        var37 += this.field2301;
                        var29 += var10;
                    }
                }
            } else {
                int var38;
                int var39 = var38 = arg0 << 16;
                if (arg2 < 0) {
                    var39 -= arg2 * var9;
                    var38 -= arg2 * var10;
                    arg2 = 0;
                }
                int var40 = arg4 << 16;
                if (arg1 < 0) {
                    var40 -= arg1 * var8;
                    arg1 = 0;
                }
                if (var9 >= var10) {
                    int var41 = arg3 - arg1;
                    int var42 = arg1 - arg2;
                    int var43 = this.field2301 * arg2;
                    while (true) {
                        var42--;
                        if (var42 < 0) {
                            while (true) {
                                var41--;
                                if (var41 < 0) {
                                    return;
                                }
                                method1110(var39 >> 16, 0, (byte) 1, var40 >> 16, this.field2300, var43);
                                var43 += this.field2301;
                                var40 += var8;
                                var39 += var9;
                            }
                        }
                        method1110(var39 >> 16, 0, (byte) 1, var38 >> 16, this.field2300, var43);
                        var38 += var10;
                        var43 += this.field2301;
                        var39 += var9;
                    }
                } else {
                    int var44 = arg3 - arg1;
                    int var45 = arg1 - arg2;
                    int var46 = this.field2301 * arg2;
                    while (true) {
                        var45--;
                        if (var45 < 0) {
                            while (true) {
                                var44--;
                                if (var44 < 0) {
                                    return;
                                }
                                method1110(var40 >> 16, 0, (byte) 1, var39 >> 16, this.field2300, var46);
                                var46 += this.field2301;
                                var40 += var8;
                                var39 += var9;
                            }
                        }
                        method1110(var38 >> 16, 0, (byte) 1, var39 >> 16, this.field2300, var46);
                        var38 += var10;
                        var39 += var9;
                        var46 += this.field2301;
                    }
                }
            }
        } else if (arg2 >= arg1) {
            int var47;
            int var48 = var47 = arg5 << 16;
            if (arg3 < 0) {
                var47 -= arg3 * var9;
                var48 -= arg3 * var8;
                arg3 = 0;
            }
            int var49 = arg4 << 16;
            if (arg1 < 0) {
                var49 -= arg1 * var10;
                arg1 = 0;
            }
            if (var9 > var8) {
                int var50 = arg2 - arg1;
                int var51 = arg1 - arg3;
                int var52 = this.field2301 * arg3;
                while (true) {
                    var51--;
                    if (var51 < 0) {
                        while (true) {
                            var50--;
                            if (var50 < 0) {
                                return;
                            }
                            method1110(var47 >> 16, 0, (byte) 1, var49 >> 16, this.field2300, var52);
                            var52 += this.field2301;
                            var47 += var9;
                            var49 += var10;
                        }
                    }
                    method1110(var47 >> 16, 0, (byte) 1, var48 >> 16, this.field2300, var52);
                    var47 += var9;
                    var52 += this.field2301;
                    var48 += var8;
                }
            } else {
                int var53 = arg2 - arg1;
                int var54 = arg1 - arg3;
                int var55 = this.field2301 * arg3;
                while (true) {
                    var54--;
                    if (var54 < 0) {
                        while (true) {
                            var53--;
                            if (var53 < 0) {
                                return;
                            }
                            method1110(var49 >> 16, 0, (byte) 1, var47 >> 16, this.field2300, var55);
                            var47 += var9;
                            var55 += this.field2301;
                            var49 += var10;
                        }
                    }
                    method1110(var48 >> 16, 0, (byte) 1, var47 >> 16, this.field2300, var55);
                    var47 += var9;
                    var55 += this.field2301;
                    var48 += var8;
                }
            }
        } else {
            int var56;
            int var57 = var56 = arg5 << 16;
            if (arg3 < 0) {
                var57 -= arg3 * var8;
                var56 -= arg3 * var9;
                arg3 = 0;
            }
            int var58 = arg0 << 16;
            if (arg2 < 0) {
                var58 -= arg2 * var10;
                arg2 = 0;
            }
            if ((arg2 == arg3 || var8 >= var9) && (arg2 != arg3 || var8 <= var10)) {
                int var62 = arg1 - arg2;
                int var63 = arg2 - arg3;
                int var64 = this.field2301 * arg3;
                while (true) {
                    var63--;
                    if (var63 < 0) {
                        while (true) {
                            var62--;
                            if (var62 < 0) {
                                return;
                            }
                            method1110(var57 >> 16, 0, (byte) 1, var58 >> 16, this.field2300, var64);
                            var57 += var8;
                            var58 += var10;
                            var64 += this.field2301;
                        }
                    }
                    method1110(var57 >> 16, 0, (byte) 1, var56 >> 16, this.field2300, var64);
                    var56 += var9;
                    var57 += var8;
                    var64 += this.field2301;
                }
            } else {
                int var59 = arg1 - arg2;
                int var60 = arg2 - arg3;
                int var61 = this.field2301 * arg3;
                while (true) {
                    var60--;
                    if (var60 < 0) {
                        while (true) {
                            var59--;
                            if (var59 < 0) {
                                return;
                            }
                            method1110(var58 >> 16, 0, (byte) 1, var57 >> 16, this.field2300, var61);
                            var57 += var8;
                            var58 += var10;
                            var61 += this.field2301;
                        }
                    }
                    method1110(var56 >> 16, 0, (byte) 1, var57 >> 16, this.field2300, var61);
                    var57 += var8;
                    var61 += this.field2301;
                    var56 += var9;
                }
            }
        }
    }
}
