import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class214 extends class307 {

    @OriginalMember(owner = "client!ac", name = "D", descriptor = "[B")
    public byte[] field2889;

    @OriginalMember(owner = "client!ac", name = "F", descriptor = "I")
    public int field2890;

    @OriginalMember(owner = "client!ac", name = "G", descriptor = "I")
    public int field2891;

    @OriginalMember(owner = "client!ac", name = "H", descriptor = "I")
    public int field2892;

    @OriginalMember(owner = "client!ac", name = "I", descriptor = "I")
    public int field2893;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Z)V")
    public final void method1157(boolean arg0) {
        int var2 = -1;
        int var3 = this.field2889.length - 8;
        while (var3 > var2) {
            var2++;
            this.field2889[var2] = 0;
            var2++;
            this.field2889[var2] = 0;
            var2++;
            this.field2889[var2] = 0;
            var2++;
            this.field2889[var2] = 0;
            var2++;
            this.field2889[var2] = 0;
            var2++;
            this.field2889[var2] = 0;
            var2++;
            this.field2889[var2] = 0;
            var2++;
            this.field2889[var2] = 0;
        }
        if (arg0) {
            this.field2891 = -2;
        }
        while (this.field2889.length - 1 > var2) {
            var2++;
            this.field2889[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIII)V")
    public final void method1158(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field2892 = arg1 - arg0;
        this.field2893 = arg4 - arg2;
        if (arg3 > -37) {
            this.method1157(true);
        }
        this.field2891 = arg0;
        this.field2890 = arg2;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIZ)Z")
    public final boolean method1159(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            this.field2893 = 105;
        }
        return this.field2889.length >= arg0 * arg1;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(I[BIZII)V")
    private static final void method1160(int arg0, byte[] arg1, int arg2, boolean arg3, int arg4, int arg5) {
        if (arg4 >= arg0) {
            return;
        }
        int var6 = arg4 + arg5;
        int var7 = arg0 - arg4 >> 2;
        while (true) {
            var7--;
            if (var7 < 0) {
                int var8 = arg0 - arg4 & 0x3;
                while (true) {
                    var8--;
                    if (var8 < 0) {
                        if (arg3) {
                            method1160(-76, (byte[]) null, -128, false, 34, -13);
                        }
                        return;
                    }
                    arg1[var6++] = 1;
                }
            }
            arg1[var6++] = 1;
            arg1[var6++] = 1;
            arg1[var6++] = 1;
            arg1[var6++] = 1;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIIIII)V")
    public final void method1161(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = 0;
        if (arg0 != arg5) {
            var8 = (arg3 - arg2 << 16) / (arg5 - arg0);
        }
        int var9 = arg4;
        if (arg1 != arg5) {
            var9 = (arg6 - arg3 << 16) / (arg1 - arg5);
        }
        int var10 = 0;
        if (arg0 != arg1) {
            var10 = (arg2 - arg6 << 16) / (arg0 - arg1);
        }
        if (arg5 >= arg0 && arg1 >= arg0) {
            if (arg1 <= arg5) {
                int var11;
                int var12 = var11 = arg2 << 16;
                if (arg0 < 0) {
                    var12 -= arg0 * var10;
                    var11 -= arg0 * var8;
                    arg0 = 0;
                }
                int var13 = arg6 << 16;
                if (arg1 < 0) {
                    var13 -= arg1 * var9;
                    arg1 = 0;
                }
                if (arg0 != arg1 && var8 > var10 || arg0 == arg1 && var9 > var8) {
                    int var14 = arg5 - arg1;
                    int var15 = arg1 - arg0;
                    int var16 = this.field2893 * arg0;
                    while (true) {
                        var15--;
                        if (var15 < 0) {
                            while (true) {
                                var14--;
                                if (var14 < 0) {
                                    return;
                                }
                                method1160(var11 >> 16, this.field2889, 0, false, var13 >> 16, var16);
                                var11 += var8;
                                var13 += var9;
                                var16 += this.field2893;
                            }
                        }
                        method1160(var11 >> 16, this.field2889, 0, false, var12 >> 16, var16);
                        var11 += var8;
                        var12 += var10;
                        var16 += this.field2893;
                    }
                } else {
                    int var17 = arg5 - arg1;
                    int var18 = arg1 - arg0;
                    int var19 = this.field2893 * arg0;
                    while (true) {
                        var18--;
                        if (var18 < 0) {
                            while (true) {
                                var17--;
                                if (var17 < 0) {
                                    return;
                                }
                                method1160(var13 >> 16, this.field2889, 0, false, var11 >> 16, var19);
                                var13 += var9;
                                var19 += this.field2893;
                                var11 += var8;
                            }
                        }
                        method1160(var12 >> 16, this.field2889, 0, false, var11 >> 16, var19);
                        var12 += var10;
                        var11 += var8;
                        var19 += this.field2893;
                    }
                }
            } else {
                int var20;
                int var21 = var20 = arg2 << 16;
                if (arg0 < 0) {
                    var21 -= arg0 * var10;
                    var20 -= arg0 * var8;
                    arg0 = 0;
                }
                int var22 = arg3 << 16;
                if (arg5 < 0) {
                    var22 -= arg5 * var9;
                    arg5 = 0;
                }
                if (arg0 != arg5 && var10 < var8 || arg0 == arg5 && var9 < var10) {
                    int var23 = arg1 - arg5;
                    int var24 = arg5 - arg0;
                    int var25 = this.field2893 * arg0;
                    while (true) {
                        var24--;
                        if (var24 < 0) {
                            while (true) {
                                var23--;
                                if (var23 < 0) {
                                    return;
                                }
                                method1160(var22 >> 16, this.field2889, 0, false, var21 >> 16, var25);
                                var22 += var9;
                                var21 += var10;
                                var25 += this.field2893;
                            }
                        }
                        method1160(var20 >> 16, this.field2889, 0, false, var21 >> 16, var25);
                        var20 += var8;
                        var25 += this.field2893;
                        var21 += var10;
                    }
                } else {
                    int var26 = arg1 - arg5;
                    int var27 = arg5 - arg0;
                    int var28 = this.field2893 * arg0;
                    while (true) {
                        var27--;
                        if (var27 < 0) {
                            while (true) {
                                var26--;
                                if (var26 < 0) {
                                    return;
                                }
                                method1160(var21 >> 16, this.field2889, 0, false, var22 >> 16, var28);
                                var21 += var10;
                                var28 += this.field2893;
                                var22 += var9;
                            }
                        }
                        method1160(var21 >> 16, this.field2889, 0, false, var20 >> 16, var28);
                        var21 += var10;
                        var28 += this.field2893;
                        var20 += var8;
                    }
                }
            }
        } else if (arg5 > arg1) {
            if (arg5 <= arg0) {
                int var29;
                int var30 = var29 = arg6 << 16;
                int var31 = arg3 << 16;
                if (arg1 < 0) {
                    var29 -= arg1 * var10;
                    var30 -= arg1 * var9;
                    arg1 = 0;
                }
                if (arg5 < 0) {
                    var31 -= arg5 * var8;
                    arg5 = 0;
                }
                if (var9 >= var10) {
                    int var32 = arg0 - arg5;
                    int var33 = arg5 - arg1;
                    int var34 = this.field2893 * arg1;
                    while (true) {
                        var33--;
                        if (var33 < 0) {
                            while (true) {
                                var32--;
                                if (var32 < 0) {
                                    return;
                                }
                                method1160(var31 >> 16, this.field2889, 0, false, var29 >> 16, var34);
                                var29 += var10;
                                var31 += var8;
                                var34 += this.field2893;
                            }
                        }
                        method1160(var30 >> 16, this.field2889, 0, false, var29 >> 16, var34);
                        var34 += this.field2893;
                        var30 += var9;
                        var29 += var10;
                    }
                } else {
                    int var35 = arg0 - arg5;
                    int var36 = arg5 - arg1;
                    int var37 = this.field2893 * arg1;
                    while (true) {
                        var36--;
                        if (var36 < 0) {
                            while (true) {
                                var35--;
                                if (var35 < 0) {
                                    return;
                                }
                                method1160(var29 >> 16, this.field2889, 0, false, var31 >> 16, var37);
                                var37 += this.field2893;
                                var29 += var10;
                                var31 += var8;
                            }
                        }
                        method1160(var29 >> 16, this.field2889, 0, false, var30 >> 16, var37);
                        var29 += var10;
                        var30 += var9;
                        var37 += this.field2893;
                    }
                }
            } else {
                int var38;
                int var39 = var38 = arg6 << 16;
                if (arg1 < 0) {
                    var38 -= arg1 * var10;
                    var39 -= arg1 * var9;
                    arg1 = 0;
                }
                int var40 = arg2 << 16;
                if (arg0 < 0) {
                    var40 -= arg0 * var8;
                    arg0 = 0;
                }
                if (var10 <= var9) {
                    int var41 = arg5 - arg0;
                    int var42 = arg0 - arg1;
                    int var43 = this.field2893 * arg1;
                    while (true) {
                        var42--;
                        if (var42 < 0) {
                            while (true) {
                                var41--;
                                if (var41 < 0) {
                                    return;
                                }
                                method1160(var39 >> 16, this.field2889, 0, false, var40 >> 16, var43);
                                var40 += var8;
                                var39 += var9;
                                var43 += this.field2893;
                            }
                        }
                        method1160(var39 >> 16, this.field2889, 0, false, var38 >> 16, var43);
                        var38 += var10;
                        var39 += var9;
                        var43 += this.field2893;
                    }
                } else {
                    int var44 = arg5 - arg0;
                    int var45 = arg0 - arg1;
                    int var46 = this.field2893 * arg1;
                    while (true) {
                        var45--;
                        if (var45 < 0) {
                            while (true) {
                                var44--;
                                if (var44 < 0) {
                                    return;
                                }
                                method1160(var40 >> 16, this.field2889, 0, false, var39 >> 16, var46);
                                var39 += var9;
                                var46 += this.field2893;
                                var40 += var8;
                            }
                        }
                        method1160(var38 >> 16, this.field2889, 0, false, var39 >> 16, var46);
                        var38 += var10;
                        var39 += var9;
                        var46 += this.field2893;
                    }
                }
            }
        } else if (arg0 > arg1) {
            int var47;
            int var48 = var47 = arg3 << 16;
            if (arg5 < 0) {
                var47 -= arg5 * var9;
                var48 -= arg5 * var8;
                arg5 = 0;
            }
            int var49 = arg6 << 16;
            if (arg1 < 0) {
                var49 -= arg1 * var10;
                arg1 = 0;
            }
            if ((arg1 == arg5 || var8 >= var9) && (arg1 != arg5 || var8 <= var10)) {
                int var53 = arg0 - arg1;
                int var54 = arg1 - arg5;
                int var55 = this.field2893 * arg5;
                while (true) {
                    var54--;
                    if (var54 < 0) {
                        while (true) {
                            var53--;
                            if (var53 < 0) {
                                return;
                            }
                            method1160(var48 >> 16, this.field2889, 0, false, var49 >> 16, var55);
                            var55 += this.field2893;
                            var48 += var8;
                            var49 += var10;
                        }
                    }
                    method1160(var48 >> 16, this.field2889, 0, false, var47 >> 16, var55);
                    var48 += var8;
                    var47 += var9;
                    var55 += this.field2893;
                }
            } else {
                int var50 = arg0 - arg1;
                int var51 = arg1 - arg5;
                int var52 = this.field2893 * arg5;
                while (true) {
                    var51--;
                    if (var51 < 0) {
                        while (true) {
                            var50--;
                            if (var50 < 0) {
                                return;
                            }
                            method1160(var49 >> 16, this.field2889, 0, false, var48 >> 16, var52);
                            var49 += var10;
                            var48 += var8;
                            var52 += this.field2893;
                        }
                    }
                    method1160(var47 >> 16, this.field2889, 0, false, var48 >> 16, var52);
                    var48 += var8;
                    var52 += this.field2893;
                    var47 += var9;
                }
            }
        } else {
            int var56;
            int var57 = var56 = arg3 << 16;
            if (arg5 < 0) {
                var57 -= arg5 * var8;
                var56 -= arg5 * var9;
                arg5 = 0;
            }
            int var58 = arg2 << 16;
            if (arg0 < 0) {
                var58 -= arg0 * var10;
                arg0 = 0;
            }
            if (var9 <= var8) {
                int var59 = arg1 - arg0;
                int var60 = arg0 - arg5;
                int var61 = this.field2893 * arg5;
                while (true) {
                    var60--;
                    if (var60 < 0) {
                        while (true) {
                            var59--;
                            if (var59 < 0) {
                                return;
                            }
                            method1160(var58 >> 16, this.field2889, 0, false, var56 >> 16, var61);
                            var56 += var9;
                            var58 += var10;
                            var61 += this.field2893;
                        }
                    }
                    method1160(var57 >> 16, this.field2889, 0, false, var56 >> 16, var61);
                    var56 += var9;
                    var57 += var8;
                    var61 += this.field2893;
                }
            } else {
                int var62 = arg1 - arg0;
                int var63 = arg0 - arg5;
                int var64 = this.field2893 * arg5;
                while (true) {
                    var63--;
                    if (var63 < 0) {
                        while (true) {
                            var62--;
                            if (var62 < 0) {
                                return;
                            }
                            method1160(var56 >> 16, this.field2889, 0, false, var58 >> 16, var64);
                            var56 += var9;
                            var64 += this.field2893;
                            var58 += var10;
                        }
                    }
                    method1160(var56 >> 16, this.field2889, 0, false, var57 >> 16, var64);
                    var56 += var9;
                    var57 += var8;
                    var64 += this.field2893;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(Lql;II)V")
    public class214(class346 arg0, int arg1, int arg2) {
        this.field2889 = new byte[arg1 * arg2];
    }
}
