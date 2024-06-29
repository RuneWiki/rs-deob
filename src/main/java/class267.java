import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class267 extends class93 {

    @OriginalMember(owner = "client!ek", name = "L", descriptor = "[B")
    public byte[] field3923;

    @OriginalMember(owner = "client!ek", name = "K", descriptor = "I")
    public int field3922;

    @OriginalMember(owner = "client!ek", name = "M", descriptor = "I")
    public int field3924;

    @OriginalMember(owner = "client!ek", name = "O", descriptor = "I")
    public int field3925;

    @OriginalMember(owner = "client!ek", name = "P", descriptor = "I")
    public int field3926;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(BIIII)V", line = 4)
    public final void method1725(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field3924 = arg3;
        this.field3926 = arg4 - arg3;
        this.field3922 = arg1 - arg2;
        int var6 = 47 / ((arg0 - 21) / 59);
        this.field3925 = arg2;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IZI)Z", line = 21)
    public final boolean method1726(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            return arg0 * arg2 <= this.field3923.length;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "([BIIIBI)V", line = 32)
    private static final void method1727(byte[] arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        if (arg2 >= arg3) {
            return;
        }
        int var6 = arg1 + arg2;
        int var7 = arg3 - arg2 >> 2;
        while (true) {
            var7--;
            if (var7 < 0) {
                int var8 = arg3 - arg2 & 0x3;
                while (true) {
                    var8--;
                    if (var8 < 0) {
                        int var9 = -101 % ((42 - arg4) / 36);
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

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "(I)V", line = 59)
    public final void method1728(int arg0) {
        if (arg0 <= 75) {
            this.method1729(-54, -57, -47, -42, -113, 84, 17);
        }
        int var2 = -1;
        int var3 = this.field3923.length - 8;
        while (var3 > var2) {
            var2++;
            this.field3923[var2] = 0;
            var2++;
            this.field3923[var2] = 0;
            var2++;
            this.field3923[var2] = 0;
            var2++;
            this.field3923[var2] = 0;
            var2++;
            this.field3923[var2] = 0;
            var2++;
            this.field3923[var2] = 0;
            var2++;
            this.field3923[var2] = 0;
            var2++;
            this.field3923[var2] = 0;
        }
        while (this.field3923.length - 1 > var2) {
            var2++;
            this.field3923[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIIIIII)V", line = 94)
    public final void method1729(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = 0;
        if (arg2 != arg3) {
            var8 = (arg6 - arg1 << 16) / (arg3 - arg2);
        }
        if (arg4 > -104) {
            return;
        }
        int var9 = 0;
        if (arg3 != arg5) {
            var9 = (arg0 - arg6 << 16) / (arg5 - arg3);
        }
        int var10 = 0;
        if (arg2 != arg5) {
            var10 = (arg1 - arg0 << 16) / (arg2 - arg5);
        }
        if (arg3 >= arg2 && arg5 >= arg2) {
            if (arg5 <= arg3) {
                int var11;
                int var12 = var11 = arg1 << 16;
                if (arg2 < 0) {
                    var12 -= arg2 * var10;
                    var11 -= arg2 * var8;
                    arg2 = 0;
                }
                int var13 = arg0 << 16;
                if (arg5 < 0) {
                    var13 -= arg5 * var9;
                    arg5 = 0;
                }
                if (arg2 != arg5 && var10 < var8 || arg2 == arg5 && var8 < var9) {
                    int var14 = arg3 - arg5;
                    int var15 = arg5 - arg2;
                    int var16 = this.field3926 * arg2;
                    while (true) {
                        var15--;
                        if (var15 < 0) {
                            while (true) {
                                var14--;
                                if (var14 < 0) {
                                    return;
                                }
                                method1727(this.field3923, var16, var13 >> 16, var11 >> 16, (byte) -84, 0);
                                var11 += var8;
                                var13 += var9;
                                var16 += this.field3926;
                            }
                        }
                        method1727(this.field3923, var16, var12 >> 16, var11 >> 16, (byte) 114, 0);
                        var16 += this.field3926;
                        var11 += var8;
                        var12 += var10;
                    }
                } else {
                    int var17 = arg3 - arg5;
                    int var18 = arg5 - arg2;
                    int var19 = this.field3926 * arg2;
                    while (true) {
                        var18--;
                        if (var18 < 0) {
                            while (true) {
                                var17--;
                                if (var17 < 0) {
                                    return;
                                }
                                method1727(this.field3923, var19, var11 >> 16, var13 >> 16, (byte) -10, 0);
                                var13 += var9;
                                var11 += var8;
                                var19 += this.field3926;
                            }
                        }
                        method1727(this.field3923, var19, var11 >> 16, var12 >> 16, (byte) 126, 0);
                        var12 += var10;
                        var19 += this.field3926;
                        var11 += var8;
                    }
                }
            } else {
                int var20;
                int var21 = var20 = arg1 << 16;
                int var22 = arg6 << 16;
                if (arg2 < 0) {
                    var21 -= arg2 * var10;
                    var20 -= arg2 * var8;
                    arg2 = 0;
                }
                if (arg3 < 0) {
                    var22 -= arg3 * var9;
                    arg3 = 0;
                }
                if (arg2 != arg3 && var10 < var8 || arg2 == arg3 && var10 > var9) {
                    int var23 = arg5 - arg3;
                    int var24 = arg3 - arg2;
                    int var25 = this.field3926 * arg2;
                    while (true) {
                        var24--;
                        if (var24 < 0) {
                            while (true) {
                                var23--;
                                if (var23 < 0) {
                                    return;
                                }
                                method1727(this.field3923, var25, var21 >> 16, var22 >> 16, (byte) -98, 0);
                                var25 += this.field3926;
                                var22 += var9;
                                var21 += var10;
                            }
                        }
                        method1727(this.field3923, var25, var21 >> 16, var20 >> 16, (byte) 89, 0);
                        var20 += var8;
                        var21 += var10;
                        var25 += this.field3926;
                    }
                } else {
                    int var26 = arg5 - arg3;
                    int var27 = arg3 - arg2;
                    int var28 = this.field3926 * arg2;
                    while (true) {
                        var27--;
                        if (var27 < 0) {
                            while (true) {
                                var26--;
                                if (var26 < 0) {
                                    return;
                                }
                                method1727(this.field3923, var28, var22 >> 16, var21 >> 16, (byte) 115, 0);
                                var21 += var10;
                                var22 += var9;
                                var28 += this.field3926;
                            }
                        }
                        method1727(this.field3923, var28, var20 >> 16, var21 >> 16, (byte) -74, 0);
                        var20 += var8;
                        var21 += var10;
                        var28 += this.field3926;
                    }
                }
            }
        } else if (arg3 <= arg5) {
            if (arg5 < arg2) {
                int var29;
                int var30 = var29 = arg6 << 16;
                int var31 = arg0 << 16;
                if (arg3 < 0) {
                    var29 -= arg3 * var9;
                    var30 -= arg3 * var8;
                    arg3 = 0;
                }
                if (arg5 < 0) {
                    var31 -= arg5 * var10;
                    arg5 = 0;
                }
                if (arg3 != arg5 && var9 > var8 || arg3 == arg5 && var10 < var8) {
                    int var32 = arg2 - arg5;
                    int var33 = arg5 - arg3;
                    int var34 = this.field3926 * arg3;
                    while (true) {
                        var33--;
                        if (var33 < 0) {
                            while (true) {
                                var32--;
                                if (var32 < 0) {
                                    return;
                                }
                                method1727(this.field3923, var34, var30 >> 16, var31 >> 16, (byte) -41, 0);
                                var34 += this.field3926;
                                var31 += var10;
                                var30 += var8;
                            }
                        }
                        method1727(this.field3923, var34, var30 >> 16, var29 >> 16, (byte) 114, 0);
                        var34 += this.field3926;
                        var29 += var9;
                        var30 += var8;
                    }
                } else {
                    int var35 = arg2 - arg5;
                    int var36 = arg5 - arg3;
                    int var37 = this.field3926 * arg3;
                    while (true) {
                        var36--;
                        if (var36 < 0) {
                            while (true) {
                                var35--;
                                if (var35 < 0) {
                                    return;
                                }
                                method1727(this.field3923, var37, var31 >> 16, var30 >> 16, (byte) -19, 0);
                                var31 += var10;
                                var37 += this.field3926;
                                var30 += var8;
                            }
                        }
                        method1727(this.field3923, var37, var29 >> 16, var30 >> 16, (byte) -18, 0);
                        var30 += var8;
                        var29 += var9;
                        var37 += this.field3926;
                    }
                }
            } else {
                int var38;
                int var39 = var38 = arg6 << 16;
                if (arg3 < 0) {
                    var39 -= arg3 * var8;
                    var38 -= arg3 * var9;
                    arg3 = 0;
                }
                int var40 = arg1 << 16;
                if (arg2 < 0) {
                    var40 -= arg2 * var10;
                    arg2 = 0;
                }
                if (var8 < var9) {
                    int var41 = arg5 - arg2;
                    int var42 = arg2 - arg3;
                    int var43 = this.field3926 * arg3;
                    while (true) {
                        var42--;
                        if (var42 < 0) {
                            while (true) {
                                var41--;
                                if (var41 < 0) {
                                    return;
                                }
                                method1727(this.field3923, var43, var40 >> 16, var38 >> 16, (byte) 81, 0);
                                var38 += var9;
                                var40 += var10;
                                var43 += this.field3926;
                            }
                        }
                        method1727(this.field3923, var43, var39 >> 16, var38 >> 16, (byte) 113, 0);
                        var43 += this.field3926;
                        var38 += var9;
                        var39 += var8;
                    }
                } else {
                    int var44 = arg5 - arg2;
                    int var45 = arg2 - arg3;
                    int var46 = this.field3926 * arg3;
                    while (true) {
                        var45--;
                        if (var45 < 0) {
                            while (true) {
                                var44--;
                                if (var44 < 0) {
                                    return;
                                }
                                method1727(this.field3923, var46, var38 >> 16, var40 >> 16, (byte) 119, 0);
                                var46 += this.field3926;
                                var40 += var10;
                                var38 += var9;
                            }
                        }
                        method1727(this.field3923, var46, var38 >> 16, var39 >> 16, (byte) -112, 0);
                        var39 += var8;
                        var46 += this.field3926;
                        var38 += var9;
                    }
                }
            }
        } else if (arg2 >= arg3) {
            int var47;
            int var48 = var47 = arg0 << 16;
            int var49 = arg6 << 16;
            if (arg5 < 0) {
                var48 -= arg5 * var9;
                var47 -= arg5 * var10;
                arg5 = 0;
            }
            if (arg3 < 0) {
                var49 -= arg3 * var8;
                arg3 = 0;
            }
            if (var9 < var10) {
                int var50 = arg2 - arg3;
                int var51 = arg3 - arg5;
                int var52 = this.field3926 * arg5;
                while (true) {
                    var51--;
                    if (var51 < 0) {
                        while (true) {
                            var50--;
                            if (var50 < 0) {
                                return;
                            }
                            method1727(this.field3923, var52, var49 >> 16, var47 >> 16, (byte) -41, 0);
                            var52 += this.field3926;
                            var47 += var10;
                            var49 += var8;
                        }
                    }
                    method1727(this.field3923, var52, var48 >> 16, var47 >> 16, (byte) -113, 0);
                    var52 += this.field3926;
                    var47 += var10;
                    var48 += var9;
                }
            } else {
                int var53 = arg2 - arg3;
                int var54 = arg3 - arg5;
                int var55 = this.field3926 * arg5;
                while (true) {
                    var54--;
                    if (var54 < 0) {
                        while (true) {
                            var53--;
                            if (var53 < 0) {
                                return;
                            }
                            method1727(this.field3923, var55, var47 >> 16, var49 >> 16, (byte) 118, 0);
                            var47 += var10;
                            var55 += this.field3926;
                            var49 += var8;
                        }
                    }
                    method1727(this.field3923, var55, var47 >> 16, var48 >> 16, (byte) 110, 0);
                    var55 += this.field3926;
                    var47 += var10;
                    var48 += var9;
                }
            }
        } else {
            int var56;
            int var57 = var56 = arg0 << 16;
            if (arg5 < 0) {
                var56 -= arg5 * var10;
                var57 -= arg5 * var9;
                arg5 = 0;
            }
            int var58 = arg1 << 16;
            if (arg2 < 0) {
                var58 -= arg2 * var8;
                arg2 = 0;
            }
            if (var10 > var9) {
                int var59 = arg3 - arg2;
                int var60 = arg2 - arg5;
                int var61 = this.field3926 * arg5;
                while (true) {
                    var60--;
                    if (var60 < 0) {
                        while (true) {
                            var59--;
                            if (var59 < 0) {
                                return;
                            }
                            method1727(this.field3923, var61, var57 >> 16, var58 >> 16, (byte) -6, 0);
                            var61 += this.field3926;
                            var57 += var9;
                            var58 += var8;
                        }
                    }
                    method1727(this.field3923, var61, var57 >> 16, var56 >> 16, (byte) -30, 0);
                    var61 += this.field3926;
                    var56 += var10;
                    var57 += var9;
                }
            } else {
                int var62 = arg3 - arg2;
                int var63 = arg2 - arg5;
                int var64 = this.field3926 * arg5;
                while (true) {
                    var63--;
                    if (var63 < 0) {
                        while (true) {
                            var62--;
                            if (var62 < 0) {
                                return;
                            }
                            method1727(this.field3923, var64, var58 >> 16, var57 >> 16, (byte) 79, 0);
                            var64 += this.field3926;
                            var57 += var9;
                            var58 += var8;
                        }
                    }
                    method1727(this.field3923, var64, var56 >> 16, var57 >> 16, (byte) 92, 0);
                    var57 += var9;
                    var64 += this.field3926;
                    var56 += var10;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ek", name = "<init>", descriptor = "(Lih;II)V", line = 528)
    public class267(class330 arg0, int arg1, int arg2) {
        this.field3923 = new byte[arg1 * arg2];
    }
}
