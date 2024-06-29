import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public class class210 extends class238 {

    @OriginalMember(owner = "client!om", name = "E", descriptor = "[B")
    public byte[] field2832;

    @OriginalMember(owner = "client!om", name = "C", descriptor = "I")
    public int field2830;

    @OriginalMember(owner = "client!om", name = "D", descriptor = "I")
    public int field2831;

    @OriginalMember(owner = "client!om", name = "F", descriptor = "I")
    public int field2833;

    @OriginalMember(owner = "client!om", name = "G", descriptor = "I")
    public int field2834;

    @OriginalMember(owner = "client!om", name = "c", descriptor = "(IIIII)V")
    public final void method1330(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field2831 = arg3;
        this.field2833 = arg2;
        this.field2834 = arg4 - arg2;
        if (arg1 < -22) {
            this.field2830 = arg0 - arg3;
        }
    }

    @OriginalMember(owner = "client!om", name = "f", descriptor = "(B)V")
    public final void method1331(byte arg0) {
        int var2 = -1;
        int var3 = this.field2832.length - 8;
        while (var2 < var3) {
            var2++;
            this.field2832[var2] = 0;
            var2++;
            this.field2832[var2] = 0;
            var2++;
            this.field2832[var2] = 0;
            var2++;
            this.field2832[var2] = 0;
            var2++;
            this.field2832[var2] = 0;
            var2++;
            this.field2832[var2] = 0;
            var2++;
            this.field2832[var2] = 0;
            var2++;
            this.field2832[var2] = 0;
        }
        while (var2 < (this.field2832.length - 1)) {
            var2++;
            this.field2832[var2] = 0;
        }
        if (arg0 > -126) {
            this.field2834 = -48;
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IIII[BI)V")
    private static final void method1332(int arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5) {
        if (arg5 >= arg2) {
            return;
        }
        int var6 = arg0 + arg5;
        int var7 = arg2 - arg5 >> 2;
        while (true) {
            var7--;
            if (var7 < 0) {
                int var8 = arg2 - arg5 & 0x3;
                while (true) {
                    var8--;
                    if (var8 < 0) {
                        if (arg3 == 19772) {
                            return;
                        } else {
                            return;
                        }
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

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(III)Z")
    public final boolean method1333(int arg0, int arg1, int arg2) {
        if (arg2 <= 83) {
            this.field2830 = -92;
        }
        return this.field2832.length >= arg0 * arg1;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IZIIIII)V")
    public final void method1334(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = 0;
        if (arg4 != arg5) {
            var8 = (arg0 - arg6 << 16) / (arg4 - arg5);
        }
        int var9 = 0;
        if (arg3 != arg4) {
            var9 = (arg2 - arg0 << 16) / (arg3 - arg4);
        }
        int var10 = 0;
        if (arg3 != arg5) {
            var10 = (arg6 - arg2 << 16) / (arg5 - arg3);
        }
        if (!arg1) {
            this.method1330(-92, -50, 46, -111, -51);
        }
        if (arg4 >= arg5 && arg5 <= arg3) {
            if (arg4 >= arg3) {
                int var11;
                int var12 = var11 = arg6 << 16;
                if (arg5 < 0) {
                    var12 -= arg5 * var10;
                    var11 -= arg5 * var8;
                    arg5 = 0;
                }
                int var13 = arg2 << 16;
                if (arg3 < 0) {
                    var13 -= arg3 * var9;
                    arg3 = 0;
                }
                if (arg3 != arg5 && var8 > var10 || arg3 == arg5 && var8 < var9) {
                    int var14 = arg4 - arg3;
                    int var15 = arg3 - arg5;
                    int var16 = this.field2830 * arg5;
                    while (true) {
                        var15--;
                        if (var15 < 0) {
                            while (true) {
                                var14--;
                                if (var14 < 0) {
                                    return;
                                }
                                method1332(var16, 0, var11 >> 16, 19772, this.field2832, var13 >> 16);
                                var16 += this.field2830;
                                var13 += var9;
                                var11 += var8;
                            }
                        }
                        method1332(var16, 0, var11 >> 16, 19772, this.field2832, var12 >> 16);
                        var11 += var8;
                        var12 += var10;
                        var16 += this.field2830;
                    }
                } else {
                    int var17 = arg4 - arg3;
                    int var18 = arg3 - arg5;
                    int var19 = this.field2830 * arg5;
                    while (true) {
                        var18--;
                        if (var18 < 0) {
                            while (true) {
                                var17--;
                                if (var17 < 0) {
                                    return;
                                }
                                method1332(var19, 0, var13 >> 16, 19772, this.field2832, var11 >> 16);
                                var11 += var8;
                                var13 += var9;
                                var19 += this.field2830;
                            }
                        }
                        method1332(var19, 0, var12 >> 16, 19772, this.field2832, var11 >> 16);
                        var12 += var10;
                        var19 += this.field2830;
                        var11 += var8;
                    }
                }
            } else {
                int var20;
                int var21 = var20 = arg6 << 16;
                int var22 = arg0 << 16;
                if (arg5 < 0) {
                    var20 -= arg5 * var8;
                    var21 -= arg5 * var10;
                    arg5 = 0;
                }
                if (arg4 < 0) {
                    var22 -= arg4 * var9;
                    arg4 = 0;
                }
                if ((arg4 == arg5 || var10 >= var8) && (arg4 != arg5 || var9 >= var10)) {
                    int var26 = arg3 - arg4;
                    int var27 = arg4 - arg5;
                    int var28 = this.field2830 * arg5;
                    while (true) {
                        var27--;
                        if (var27 < 0) {
                            while (true) {
                                var26--;
                                if (var26 < 0) {
                                    return;
                                }
                                method1332(var28, 0, var21 >> 16, 19772, this.field2832, var22 >> 16);
                                var21 += var10;
                                var22 += var9;
                                var28 += this.field2830;
                            }
                        }
                        method1332(var28, 0, var21 >> 16, 19772, this.field2832, var20 >> 16);
                        var20 += var8;
                        var21 += var10;
                        var28 += this.field2830;
                    }
                } else {
                    int var23 = arg3 - arg4;
                    int var24 = arg4 - arg5;
                    int var25 = this.field2830 * arg5;
                    while (true) {
                        var24--;
                        if (var24 < 0) {
                            while (true) {
                                var23--;
                                if (var23 < 0) {
                                    return;
                                }
                                method1332(var25, 0, var22 >> 16, 19772, this.field2832, var21 >> 16);
                                var25 += this.field2830;
                                var21 += var10;
                                var22 += var9;
                            }
                        }
                        method1332(var25, 0, var20 >> 16, 19772, this.field2832, var21 >> 16);
                        var25 += this.field2830;
                        var21 += var10;
                        var20 += var8;
                    }
                }
            }
        } else if (arg4 > arg3) {
            if (arg4 > arg5) {
                int var29;
                int var30 = var29 = arg2 << 16;
                int var31 = arg6 << 16;
                if (arg3 < 0) {
                    var30 -= arg3 * var9;
                    var29 -= arg3 * var10;
                    arg3 = 0;
                }
                if (arg5 < 0) {
                    var31 -= arg5 * var8;
                    arg5 = 0;
                }
                if (var10 <= var9) {
                    int var32 = arg4 - arg5;
                    int var33 = arg5 - arg3;
                    int var34 = this.field2830 * arg3;
                    while (true) {
                        var33--;
                        if (var33 < 0) {
                            while (true) {
                                var32--;
                                if (var32 < 0) {
                                    return;
                                }
                                method1332(var34, 0, var30 >> 16, 19772, this.field2832, var31 >> 16);
                                var31 += var8;
                                var34 += this.field2830;
                                var30 += var9;
                            }
                        }
                        method1332(var34, 0, var30 >> 16, 19772, this.field2832, var29 >> 16);
                        var30 += var9;
                        var34 += this.field2830;
                        var29 += var10;
                    }
                } else {
                    int var35 = arg4 - arg5;
                    int var36 = arg5 - arg3;
                    int var37 = this.field2830 * arg3;
                    while (true) {
                        var36--;
                        if (var36 < 0) {
                            while (true) {
                                var35--;
                                if (var35 < 0) {
                                    return;
                                }
                                method1332(var37, 0, var31 >> 16, 19772, this.field2832, var30 >> 16);
                                var31 += var8;
                                var37 += this.field2830;
                                var30 += var9;
                            }
                        }
                        method1332(var37, 0, var29 >> 16, 19772, this.field2832, var30 >> 16);
                        var37 += this.field2830;
                        var29 += var10;
                        var30 += var9;
                    }
                }
            } else {
                int var38;
                int var39 = var38 = arg2 << 16;
                int var40 = arg0 << 16;
                if (arg3 < 0) {
                    var38 -= arg3 * var10;
                    var39 -= arg3 * var9;
                    arg3 = 0;
                }
                if (arg4 < 0) {
                    var40 -= arg4 * var8;
                    arg4 = 0;
                }
                if (var9 < var10) {
                    int var41 = arg5 - arg4;
                    int var42 = arg4 - arg3;
                    int var43 = this.field2830 * arg3;
                    while (true) {
                        var42--;
                        if (var42 < 0) {
                            while (true) {
                                var41--;
                                if (var41 < 0) {
                                    return;
                                }
                                method1332(var43, 0, var38 >> 16, 19772, this.field2832, var40 >> 16);
                                var43 += this.field2830;
                                var38 += var10;
                                var40 += var8;
                            }
                        }
                        method1332(var43, 0, var38 >> 16, 19772, this.field2832, var39 >> 16);
                        var43 += this.field2830;
                        var39 += var9;
                        var38 += var10;
                    }
                } else {
                    int var44 = arg5 - arg4;
                    int var45 = arg4 - arg3;
                    int var46 = this.field2830 * arg3;
                    while (true) {
                        var45--;
                        if (var45 < 0) {
                            while (true) {
                                var44--;
                                if (var44 < 0) {
                                    return;
                                }
                                method1332(var46, 0, var40 >> 16, 19772, this.field2832, var38 >> 16);
                                var46 += this.field2830;
                                var40 += var8;
                                var38 += var10;
                            }
                        }
                        method1332(var46, 0, var39 >> 16, 19772, this.field2832, var38 >> 16);
                        var38 += var10;
                        var46 += this.field2830;
                        var39 += var9;
                    }
                }
            }
        } else if (arg5 > arg3) {
            int var47;
            int var48 = var47 = arg0 << 16;
            int var49 = arg2 << 16;
            if (arg4 < 0) {
                var47 -= arg4 * var9;
                var48 -= arg4 * var8;
                arg4 = 0;
            }
            if (arg3 < 0) {
                var49 -= arg3 * var10;
                arg3 = 0;
            }
            if ((arg3 == arg4 || var8 >= var9) && (arg3 != arg4 || var8 <= var10)) {
                int var53 = arg5 - arg3;
                int var54 = arg3 - arg4;
                int var55 = this.field2830 * arg4;
                while (true) {
                    var54--;
                    if (var54 < 0) {
                        while (true) {
                            var53--;
                            if (var53 < 0) {
                                return;
                            }
                            method1332(var55, 0, var48 >> 16, 19772, this.field2832, var49 >> 16);
                            var55 += this.field2830;
                            var48 += var8;
                            var49 += var10;
                        }
                    }
                    method1332(var55, 0, var48 >> 16, 19772, this.field2832, var47 >> 16);
                    var55 += this.field2830;
                    var48 += var8;
                    var47 += var9;
                }
            } else {
                int var50 = arg5 - arg3;
                int var51 = arg3 - arg4;
                int var52 = this.field2830 * arg4;
                while (true) {
                    var51--;
                    if (var51 < 0) {
                        while (true) {
                            var50--;
                            if (var50 < 0) {
                                return;
                            }
                            method1332(var52, 0, var49 >> 16, 19772, this.field2832, var48 >> 16);
                            var48 += var8;
                            var52 += this.field2830;
                            var49 += var10;
                        }
                    }
                    method1332(var52, 0, var47 >> 16, 19772, this.field2832, var48 >> 16);
                    var47 += var9;
                    var52 += this.field2830;
                    var48 += var8;
                }
            }
        } else {
            int var56;
            int var57 = var56 = arg0 << 16;
            if (arg4 < 0) {
                var56 -= arg4 * var9;
                var57 -= arg4 * var8;
                arg4 = 0;
            }
            int var58 = arg6 << 16;
            if (arg5 < 0) {
                var58 -= arg5 * var10;
                arg5 = 0;
            }
            if (var9 <= var8) {
                int var59 = arg3 - arg5;
                int var60 = arg5 - arg4;
                int var61 = this.field2830 * arg4;
                while (true) {
                    var60--;
                    if (var60 < 0) {
                        while (true) {
                            var59--;
                            if (var59 < 0) {
                                return;
                            }
                            method1332(var61, 0, var58 >> 16, 19772, this.field2832, var56 >> 16);
                            var56 += var9;
                            var58 += var10;
                            var61 += this.field2830;
                        }
                    }
                    method1332(var61, 0, var57 >> 16, 19772, this.field2832, var56 >> 16);
                    var57 += var8;
                    var61 += this.field2830;
                    var56 += var9;
                }
            } else {
                int var62 = arg3 - arg5;
                int var63 = arg5 - arg4;
                int var64 = this.field2830 * arg4;
                while (true) {
                    var63--;
                    if (var63 < 0) {
                        while (true) {
                            var62--;
                            if (var62 < 0) {
                                return;
                            }
                            method1332(var64, 0, var56 >> 16, 19772, this.field2832, var58 >> 16);
                            var64 += this.field2830;
                            var58 += var10;
                            var56 += var9;
                        }
                    }
                    method1332(var64, 0, var56 >> 16, 19772, this.field2832, var57 >> 16);
                    var64 += this.field2830;
                    var57 += var8;
                    var56 += var9;
                }
            }
        }
    }

    @OriginalMember(owner = "client!om", name = "<init>", descriptor = "(Lpo;II)V")
    public class210(class332 arg0, int arg1, int arg2) {
        this.field2832 = new byte[arg1 * arg2];
    }
}
