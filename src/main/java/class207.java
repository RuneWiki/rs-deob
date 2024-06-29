import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cs")
public class class207 extends class449 {

    @OriginalMember(owner = "client!cs", name = "M", descriptor = "[B")
    public byte[] field2799;

    @OriginalMember(owner = "client!cs", name = "F", descriptor = "I")
    public int field2795;

    @OriginalMember(owner = "client!cs", name = "J", descriptor = "I")
    public int field2796;

    @OriginalMember(owner = "client!cs", name = "K", descriptor = "I")
    public int field2797;

    @OriginalMember(owner = "client!cs", name = "L", descriptor = "I")
    public int field2798;

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(IZIII)V", line = 4)
    public final void method1177(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        this.field2795 = arg2;
        if (arg1) {
            this.field2798 = 29;
        }
        this.field2798 = arg4;
        this.field2796 = arg3 - arg4;
        this.field2797 = arg0 - arg2;
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(II[BIII)V", line = 21)
    private static final void method1178(int arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5) {
        if (arg3 >= arg4) {
            return;
        }
        int var6 = arg1 + arg3;
        int var7 = arg4 - arg3 >> 2;
        while (true) {
            var7--;
            if (var7 < 0) {
                int var8 = arg4 - arg3 & 0x3;
                while (true) {
                    var8--;
                    if (var8 < 0) {
                        if (arg0 == -20632) {
                            return;
                        } else {
                            return;
                        }
                    }
                    arg2[var6++] = 1;
                }
            }
            arg2[var6++] = 1;
            arg2[var6++] = 1;
            arg2[var6++] = 1;
            arg2[var6++] = 1;
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(IIIIIII)V", line = 51)
    public final void method1179(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = 0;
        if (arg2 != arg5) {
            var8 = (arg6 - arg0 << 16) / (arg2 - arg5);
        }
        int var9 = 0;
        if (arg2 != arg4) {
            var9 = (arg3 - arg6 << 16) / (arg4 - arg2);
        }
        int var10 = 0;
        if (arg4 != arg5) {
            var10 = (arg0 - arg3 << 16) / (arg5 - arg4);
        }
        if (arg1 != 1824314256) {
            this.field2795 = 46;
        }
        if (arg5 <= arg2 && arg5 <= arg4) {
            if (arg4 > arg2) {
                int var11;
                int var12 = var11 = arg0 << 16;
                if (arg5 < 0) {
                    var11 -= arg5 * var8;
                    var12 -= arg5 * var10;
                    arg5 = 0;
                }
                int var13 = arg6 << 16;
                if (arg2 < 0) {
                    var13 -= arg2 * var9;
                    arg2 = 0;
                }
                if (arg2 != arg5 && var8 > var10 || arg2 == arg5 && var10 > var9) {
                    int var14 = arg4 - arg2;
                    int var15 = arg2 - arg5;
                    int var16 = this.field2796 * arg5;
                    while (true) {
                        var15--;
                        if (var15 < 0) {
                            while (true) {
                                var14--;
                                if (var14 < 0) {
                                    return;
                                }
                                method1178(-20632, var16, this.field2799, var12 >> 16, var13 >> 16, 0);
                                var12 += var10;
                                var13 += var9;
                                var16 += this.field2796;
                            }
                        }
                        method1178(arg1 - 1824334888, var16, this.field2799, var12 >> 16, var11 >> 16, 0);
                        var16 += this.field2796;
                        var11 += var8;
                        var12 += var10;
                    }
                } else {
                    int var17 = arg4 - arg2;
                    int var18 = arg2 - arg5;
                    int var19 = this.field2796 * arg5;
                    while (true) {
                        var18--;
                        if (var18 < 0) {
                            while (true) {
                                var17--;
                                if (var17 < 0) {
                                    return;
                                }
                                method1178(-20632, var19, this.field2799, var13 >> 16, var12 >> 16, 0);
                                var13 += var9;
                                var12 += var10;
                                var19 += this.field2796;
                            }
                        }
                        method1178(-20632, var19, this.field2799, var11 >> 16, var12 >> 16, 0);
                        var19 += this.field2796;
                        var11 += var8;
                        var12 += var10;
                    }
                }
            } else {
                int var20;
                int var21 = var20 = arg0 << 16;
                if (arg5 < 0) {
                    var20 -= arg5 * var8;
                    var21 -= arg5 * var10;
                    arg5 = 0;
                }
                int var22 = arg3 << 16;
                if (arg4 < 0) {
                    var22 -= arg4 * var9;
                    arg4 = 0;
                }
                if ((arg4 == arg5 || var8 <= var10) && (arg4 != arg5 || var8 >= var9)) {
                    int var26 = arg2 - arg4;
                    int var27 = arg4 - arg5;
                    int var28 = this.field2796 * arg5;
                    while (true) {
                        var27--;
                        if (var27 < 0) {
                            while (true) {
                                var26--;
                                if (var26 < 0) {
                                    return;
                                }
                                method1178(-20632, var28, this.field2799, var20 >> 16, var22 >> 16, 0);
                                var20 += var8;
                                var22 += var9;
                                var28 += this.field2796;
                            }
                        }
                        method1178(-20632, var28, this.field2799, var20 >> 16, var21 >> 16, 0);
                        var20 += var8;
                        var28 += this.field2796;
                        var21 += var10;
                    }
                } else {
                    int var23 = arg2 - arg4;
                    int var24 = arg4 - arg5;
                    int var25 = this.field2796 * arg5;
                    while (true) {
                        var24--;
                        if (var24 < 0) {
                            while (true) {
                                var23--;
                                if (var23 < 0) {
                                    return;
                                }
                                method1178(-20632, var25, this.field2799, var22 >> 16, var20 >> 16, 0);
                                var25 += this.field2796;
                                var22 += var9;
                                var20 += var8;
                            }
                        }
                        method1178(arg1 - 1824334888, var25, this.field2799, var21 >> 16, var20 >> 16, 0);
                        var21 += var10;
                        var25 += this.field2796;
                        var20 += var8;
                    }
                }
            }
        } else if (arg2 <= arg4) {
            if (arg4 >= arg5) {
                int var29;
                int var30 = var29 = arg6 << 16;
                if (arg2 < 0) {
                    var30 -= arg2 * var8;
                    var29 -= arg2 * var9;
                    arg2 = 0;
                }
                int var31 = arg0 << 16;
                if (arg5 < 0) {
                    var31 -= arg5 * var10;
                    arg5 = 0;
                }
                if (var9 > var8) {
                    int var32 = arg4 - arg5;
                    int var33 = arg5 - arg2;
                    int var34 = this.field2796 * arg2;
                    while (true) {
                        var33--;
                        if (var33 < 0) {
                            while (true) {
                                var32--;
                                if (var32 < 0) {
                                    return;
                                }
                                method1178(arg1 ^ 0x93437CF8, var34, this.field2799, var31 >> 16, var29 >> 16, 0);
                                var34 += this.field2796;
                                var31 += var10;
                                var29 += var9;
                            }
                        }
                        method1178(arg1 - 1824334888, var34, this.field2799, var30 >> 16, var29 >> 16, 0);
                        var34 += this.field2796;
                        var30 += var8;
                        var29 += var9;
                    }
                } else {
                    int var35 = arg4 - arg5;
                    int var36 = arg5 - arg2;
                    int var37 = this.field2796 * arg2;
                    while (true) {
                        var36--;
                        if (var36 < 0) {
                            while (true) {
                                var35--;
                                if (var35 < 0) {
                                    return;
                                }
                                method1178(-20632, var37, this.field2799, var29 >> 16, var31 >> 16, 0);
                                var29 += var9;
                                var37 += this.field2796;
                                var31 += var10;
                            }
                        }
                        method1178(-20632, var37, this.field2799, var29 >> 16, var30 >> 16, 0);
                        var30 += var8;
                        var29 += var9;
                        var37 += this.field2796;
                    }
                }
            } else {
                int var38;
                int var39 = var38 = arg6 << 16;
                int var40 = arg3 << 16;
                if (arg2 < 0) {
                    var38 -= arg2 * var9;
                    var39 -= arg2 * var8;
                    arg2 = 0;
                }
                if (arg4 < 0) {
                    var40 -= arg4 * var10;
                    arg4 = 0;
                }
                if (arg2 != arg4 && var9 > var8 || arg2 == arg4 && var8 > var10) {
                    int var41 = arg5 - arg4;
                    int var42 = arg4 - arg2;
                    int var43 = this.field2796 * arg2;
                    while (true) {
                        var42--;
                        if (var42 < 0) {
                            while (true) {
                                var41--;
                                if (var41 < 0) {
                                    return;
                                }
                                method1178(-20632, var43, this.field2799, var39 >> 16, var40 >> 16, 0);
                                var39 += var8;
                                var43 += this.field2796;
                                var40 += var10;
                            }
                        }
                        method1178(-20632, var43, this.field2799, var39 >> 16, var38 >> 16, 0);
                        var39 += var8;
                        var43 += this.field2796;
                        var38 += var9;
                    }
                } else {
                    int var44 = arg5 - arg4;
                    int var45 = arg4 - arg2;
                    int var46 = this.field2796 * arg2;
                    while (true) {
                        var45--;
                        if (var45 < 0) {
                            while (true) {
                                var44--;
                                if (var44 < 0) {
                                    return;
                                }
                                method1178(-20632, var46, this.field2799, var40 >> 16, var39 >> 16, 0);
                                var40 += var10;
                                var46 += this.field2796;
                                var39 += var8;
                            }
                        }
                        method1178(-20632, var46, this.field2799, var38 >> 16, var39 >> 16, 0);
                        var38 += var9;
                        var46 += this.field2796;
                        var39 += var8;
                    }
                }
            }
        } else if (arg2 > arg5) {
            int var47;
            int var48 = var47 = arg3 << 16;
            int var49 = arg0 << 16;
            if (arg4 < 0) {
                var48 -= arg4 * var9;
                var47 -= arg4 * var10;
                arg4 = 0;
            }
            if (arg5 < 0) {
                var49 -= arg5 * var8;
                arg5 = 0;
            }
            if (var9 < var10) {
                int var50 = arg2 - arg5;
                int var51 = arg5 - arg4;
                int var52 = this.field2796 * arg4;
                while (true) {
                    var51--;
                    if (var51 < 0) {
                        while (true) {
                            var50--;
                            if (var50 < 0) {
                                return;
                            }
                            method1178(-20632, var52, this.field2799, var48 >> 16, var49 >> 16, 0);
                            var49 += var8;
                            var52 += this.field2796;
                            var48 += var9;
                        }
                    }
                    method1178(-20632, var52, this.field2799, var48 >> 16, var47 >> 16, 0);
                    var52 += this.field2796;
                    var48 += var9;
                    var47 += var10;
                }
            } else {
                int var53 = arg2 - arg5;
                int var54 = arg5 - arg4;
                int var55 = this.field2796 * arg4;
                while (true) {
                    var54--;
                    if (var54 < 0) {
                        while (true) {
                            var53--;
                            if (var53 < 0) {
                                return;
                            }
                            method1178(-20632, var55, this.field2799, var49 >> 16, var48 >> 16, 0);
                            var55 += this.field2796;
                            var48 += var9;
                            var49 += var8;
                        }
                    }
                    method1178(-20632, var55, this.field2799, var47 >> 16, var48 >> 16, 0);
                    var48 += var9;
                    var55 += this.field2796;
                    var47 += var10;
                }
            }
        } else {
            int var56;
            int var57 = var56 = arg3 << 16;
            if (arg4 < 0) {
                var56 -= arg4 * var10;
                var57 -= arg4 * var9;
                arg4 = 0;
            }
            int var58 = arg6 << 16;
            if (arg2 < 0) {
                var58 -= arg2 * var8;
                arg2 = 0;
            }
            if (var10 > var9) {
                int var59 = arg5 - arg2;
                int var60 = arg2 - arg4;
                int var61 = this.field2796 * arg4;
                while (true) {
                    var60--;
                    if (var60 < 0) {
                        while (true) {
                            var59--;
                            if (var59 < 0) {
                                return;
                            }
                            method1178(-20632, var61, this.field2799, var58 >> 16, var56 >> 16, 0);
                            var58 += var8;
                            var61 += this.field2796;
                            var56 += var10;
                        }
                    }
                    method1178(-20632, var61, this.field2799, var57 >> 16, var56 >> 16, 0);
                    var57 += var9;
                    var56 += var10;
                    var61 += this.field2796;
                }
            } else {
                int var62 = arg5 - arg2;
                int var63 = arg2 - arg4;
                int var64 = this.field2796 * arg4;
                while (true) {
                    var63--;
                    if (var63 < 0) {
                        while (true) {
                            var62--;
                            if (var62 < 0) {
                                return;
                            }
                            method1178(-20632, var64, this.field2799, var56 >> 16, var58 >> 16, 0);
                            var64 += this.field2796;
                            var56 += var10;
                            var58 += var8;
                        }
                    }
                    method1178(-20632, var64, this.field2799, var56 >> 16, var57 >> 16, 0);
                    var57 += var9;
                    var64 += this.field2796;
                    var56 += var10;
                }
            }
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(IIZ)Z", line = 487)
    public final boolean method1180(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            this.field2798 = -1;
        }
        return this.field2799.length >= (arg0 * arg1);
    }

    @OriginalMember(owner = "client!cs", name = "d", descriptor = "(B)V", line = 501)
    public final void method1181(byte arg0) {
        if (arg0 <= 10) {
            this.method1180(57, 21, true);
        }
        int var2 = -1;
        int var3 = this.field2799.length - 8;
        while (var3 > var2) {
            var2++;
            this.field2799[var2] = 0;
            var2++;
            this.field2799[var2] = 0;
            var2++;
            this.field2799[var2] = 0;
            var2++;
            this.field2799[var2] = 0;
            var2++;
            this.field2799[var2] = 0;
            var2++;
            this.field2799[var2] = 0;
            var2++;
            this.field2799[var2] = 0;
            var2++;
            this.field2799[var2] = 0;
        }
        while ((this.field2799.length - 1) > var2) {
            var2++;
            this.field2799[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(Lbf;II)V", line = 532)
    public class207(class344 arg0, int arg1, int arg2) {
        this.field2799 = new byte[arg1 * arg2];
    }
}
