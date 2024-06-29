import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gr")
public class class274 extends class242 {

    @OriginalMember(owner = "client!gr", name = "F", descriptor = "[B")
    public byte[] field3981;

    @OriginalMember(owner = "client!gr", name = "C", descriptor = "I")
    public int field3978;

    @OriginalMember(owner = "client!gr", name = "D", descriptor = "I")
    public int field3979;

    @OriginalMember(owner = "client!gr", name = "E", descriptor = "I")
    public int field3980;

    @OriginalMember(owner = "client!gr", name = "G", descriptor = "I")
    public int field3982;

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(IZI)Z")
    public final boolean method1677(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            return (arg0 * arg2) <= this.field3981.length;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(IIIII)V")
    public final void method1678(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field3980 = arg2 - arg1;
        this.field3982 = arg0;
        this.field3978 = arg1;
        this.field3979 = arg3 - arg0;
        if (arg4 != -32688) {
            this.field3978 = -73;
        }
    }

    @OriginalMember(owner = "client!gr", name = "e", descriptor = "(B)V")
    public final void method1679(byte arg0) {
        int var2 = -1;
        if (arg0 != 59) {
            this.method1680(44, -85, -108, -58, 105, 33, 20);
        }
        int var3 = this.field3981.length - 8;
        while (var3 > var2) {
            var2++;
            this.field3981[var2] = 0;
            var2++;
            this.field3981[var2] = 0;
            var2++;
            this.field3981[var2] = 0;
            var2++;
            this.field3981[var2] = 0;
            var2++;
            this.field3981[var2] = 0;
            var2++;
            this.field3981[var2] = 0;
            var2++;
            this.field3981[var2] = 0;
            var2++;
            this.field3981[var2] = 0;
        }
        while (this.field3981.length - 1 > var2) {
            var2++;
            this.field3981[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(IIIIIII)V")
    public final void method1680(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg3 != 2631) {
            this.field3979 = -93;
        }
        int var8 = 0;
        if (arg5 != arg6) {
            var8 = (arg2 - arg0 << 16) / (arg6 - arg5);
        }
        int var9 = 0;
        if (arg4 != arg6) {
            var9 = (arg1 - arg2 << 16) / (arg4 - arg6);
        }
        int var10 = 0;
        if (arg4 != arg5) {
            var10 = (arg0 - arg1 << 16) / (arg5 - arg4);
        }
        if (arg5 <= arg6 && arg4 >= arg5) {
            if (arg4 <= arg6) {
                int var11;
                int var12 = var11 = arg0 << 16;
                if (arg5 < 0) {
                    var11 -= arg5 * var8;
                    var12 -= arg5 * var10;
                    arg5 = 0;
                }
                int var13 = arg1 << 16;
                if (arg4 < 0) {
                    var13 -= arg4 * var9;
                    arg4 = 0;
                }
                if (arg4 != arg5 && var8 > var10 || arg4 == arg5 && var9 > var8) {
                    int var14 = arg6 - arg4;
                    int var15 = arg4 - arg5;
                    int var16 = this.field3980 * arg5;
                    while (true) {
                        var15--;
                        if (var15 < 0) {
                            while (true) {
                                var14--;
                                if (var14 < 0) {
                                    return;
                                }
                                method1681(this.field3981, 0, var13 >> 16, var11 >> 16, arg3 ^ 0xA2D, var16);
                                var16 += this.field3980;
                                var11 += var8;
                                var13 += var9;
                            }
                        }
                        method1681(this.field3981, 0, var12 >> 16, var11 >> 16, 72, var16);
                        var11 += var8;
                        var12 += var10;
                        var16 += this.field3980;
                    }
                } else {
                    int var17 = arg6 - arg4;
                    int var18 = arg4 - arg5;
                    int var19 = this.field3980 * arg5;
                    while (true) {
                        var18--;
                        if (var18 < 0) {
                            while (true) {
                                var17--;
                                if (var17 < 0) {
                                    return;
                                }
                                method1681(this.field3981, 0, var11 >> 16, var13 >> 16, -80, var19);
                                var19 += this.field3980;
                                var11 += var8;
                                var13 += var9;
                            }
                        }
                        method1681(this.field3981, 0, var11 >> 16, var12 >> 16, 120, var19);
                        var11 += var8;
                        var12 += var10;
                        var19 += this.field3980;
                    }
                }
            } else {
                int var20;
                int var21 = var20 = arg0 << 16;
                int var22 = arg2 << 16;
                if (arg5 < 0) {
                    var20 -= arg5 * var8;
                    var21 -= arg5 * var10;
                    arg5 = 0;
                }
                if (arg6 < 0) {
                    var22 -= arg6 * var9;
                    arg6 = 0;
                }
                if ((arg5 == arg6 || var8 <= var10) && (arg5 != arg6 || var10 <= var9)) {
                    int var26 = arg4 - arg6;
                    int var27 = arg6 - arg5;
                    int var28 = this.field3980 * arg5;
                    while (true) {
                        var27--;
                        if (var27 < 0) {
                            while (true) {
                                var26--;
                                if (var26 < 0) {
                                    return;
                                }
                                method1681(this.field3981, 0, var22 >> 16, var21 >> 16, 93, var28);
                                var28 += this.field3980;
                                var21 += var10;
                                var22 += var9;
                            }
                        }
                        method1681(this.field3981, 0, var20 >> 16, var21 >> 16, arg3 ^ 0xFFFFF5D3, var28);
                        var20 += var8;
                        var21 += var10;
                        var28 += this.field3980;
                    }
                } else {
                    int var23 = arg4 - arg6;
                    int var24 = arg6 - arg5;
                    int var25 = this.field3980 * arg5;
                    while (true) {
                        var24--;
                        if (var24 < 0) {
                            while (true) {
                                var23--;
                                if (var23 < 0) {
                                    return;
                                }
                                method1681(this.field3981, 0, var21 >> 16, var22 >> 16, arg3 - 2566, var25);
                                var25 += this.field3980;
                                var22 += var9;
                                var21 += var10;
                            }
                        }
                        method1681(this.field3981, 0, var21 >> 16, var20 >> 16, 43, var25);
                        var20 += var8;
                        var25 += this.field3980;
                        var21 += var10;
                    }
                }
            }
        } else if (arg4 >= arg6) {
            if (arg4 < arg5) {
                int var29;
                int var30 = var29 = arg2 << 16;
                if (arg6 < 0) {
                    var29 -= arg6 * var9;
                    var30 -= arg6 * var8;
                    arg6 = 0;
                }
                int var31 = arg1 << 16;
                if (arg4 < 0) {
                    var31 -= arg4 * var10;
                    arg4 = 0;
                }
                if (arg4 != arg6 && var8 < var9 || arg4 == arg6 && var10 < var8) {
                    int var32 = arg5 - arg4;
                    int var33 = arg4 - arg6;
                    int var34 = this.field3980 * arg6;
                    while (true) {
                        var33--;
                        if (var33 < 0) {
                            while (true) {
                                var32--;
                                if (var32 < 0) {
                                    return;
                                }
                                method1681(this.field3981, 0, var30 >> 16, var31 >> 16, arg3 - 2569, var34);
                                var31 += var10;
                                var34 += this.field3980;
                                var30 += var8;
                            }
                        }
                        method1681(this.field3981, 0, var30 >> 16, var29 >> 16, -62, var34);
                        var30 += var8;
                        var34 += this.field3980;
                        var29 += var9;
                    }
                } else {
                    int var35 = arg5 - arg4;
                    int var36 = arg4 - arg6;
                    int var37 = this.field3980 * arg6;
                    while (true) {
                        var36--;
                        if (var36 < 0) {
                            while (true) {
                                var35--;
                                if (var35 < 0) {
                                    return;
                                }
                                method1681(this.field3981, 0, var31 >> 16, var30 >> 16, 92, var37);
                                var31 += var10;
                                var37 += this.field3980;
                                var30 += var8;
                            }
                        }
                        method1681(this.field3981, 0, var29 >> 16, var30 >> 16, 101, var37);
                        var29 += var9;
                        var37 += this.field3980;
                        var30 += var8;
                    }
                }
            } else {
                int var38;
                int var39 = var38 = arg2 << 16;
                if (arg6 < 0) {
                    var39 -= arg6 * var8;
                    var38 -= arg6 * var9;
                    arg6 = 0;
                }
                int var40 = arg0 << 16;
                if (arg5 < 0) {
                    var40 -= arg5 * var10;
                    arg5 = 0;
                }
                if (var9 > var8) {
                    int var41 = arg4 - arg5;
                    int var42 = arg5 - arg6;
                    int var43 = this.field3980 * arg6;
                    while (true) {
                        var42--;
                        if (var42 < 0) {
                            while (true) {
                                var41--;
                                if (var41 < 0) {
                                    return;
                                }
                                method1681(this.field3981, 0, var40 >> 16, var38 >> 16, 122, var43);
                                var43 += this.field3980;
                                var38 += var9;
                                var40 += var10;
                            }
                        }
                        method1681(this.field3981, 0, var39 >> 16, var38 >> 16, 118, var43);
                        var43 += this.field3980;
                        var38 += var9;
                        var39 += var8;
                    }
                } else {
                    int var44 = arg4 - arg5;
                    int var45 = arg5 - arg6;
                    int var46 = this.field3980 * arg6;
                    while (true) {
                        var45--;
                        if (var45 < 0) {
                            while (true) {
                                var44--;
                                if (var44 < 0) {
                                    return;
                                }
                                method1681(this.field3981, 0, var38 >> 16, var40 >> 16, -65, var46);
                                var46 += this.field3980;
                                var40 += var10;
                                var38 += var9;
                            }
                        }
                        method1681(this.field3981, 0, var38 >> 16, var39 >> 16, 74, var46);
                        var38 += var9;
                        var46 += this.field3980;
                        var39 += var8;
                    }
                }
            }
        } else if (arg5 >= arg6) {
            int var47;
            int var48 = var47 = arg1 << 16;
            if (arg4 < 0) {
                var47 -= arg4 * var10;
                var48 -= arg4 * var9;
                arg4 = 0;
            }
            int var49 = arg2 << 16;
            if (arg6 < 0) {
                var49 -= arg6 * var8;
                arg6 = 0;
            }
            if (var10 > var9) {
                int var50 = arg5 - arg6;
                int var51 = arg6 - arg4;
                int var52 = this.field3980 * arg4;
                while (true) {
                    var51--;
                    if (var51 < 0) {
                        while (true) {
                            var50--;
                            if (var50 < 0) {
                                return;
                            }
                            method1681(this.field3981, 0, var49 >> 16, var47 >> 16, -71, var52);
                            var49 += var8;
                            var47 += var10;
                            var52 += this.field3980;
                        }
                    }
                    method1681(this.field3981, 0, var48 >> 16, var47 >> 16, 74, var52);
                    var52 += this.field3980;
                    var48 += var9;
                    var47 += var10;
                }
            } else {
                int var53 = arg5 - arg6;
                int var54 = arg6 - arg4;
                int var55 = this.field3980 * arg4;
                while (true) {
                    var54--;
                    if (var54 < 0) {
                        while (true) {
                            var53--;
                            if (var53 < 0) {
                                return;
                            }
                            method1681(this.field3981, 0, var47 >> 16, var49 >> 16, arg3 - 2746, var55);
                            var49 += var8;
                            var47 += var10;
                            var55 += this.field3980;
                        }
                    }
                    method1681(this.field3981, 0, var47 >> 16, var48 >> 16, arg3 - 2696, var55);
                    var47 += var10;
                    var48 += var9;
                    var55 += this.field3980;
                }
            }
        } else {
            int var56;
            int var57 = var56 = arg1 << 16;
            if (arg4 < 0) {
                var57 -= arg4 * var9;
                var56 -= arg4 * var10;
                arg4 = 0;
            }
            int var58 = arg0 << 16;
            if (arg5 < 0) {
                var58 -= arg5 * var8;
                arg5 = 0;
            }
            if (var10 > var9) {
                int var59 = arg6 - arg5;
                int var60 = arg5 - arg4;
                int var61 = this.field3980 * arg4;
                while (true) {
                    var60--;
                    if (var60 < 0) {
                        while (true) {
                            var59--;
                            if (var59 < 0) {
                                return;
                            }
                            method1681(this.field3981, 0, var57 >> 16, var58 >> 16, 89, var61);
                            var58 += var8;
                            var57 += var9;
                            var61 += this.field3980;
                        }
                    }
                    method1681(this.field3981, 0, var57 >> 16, var56 >> 16, 105, var61);
                    var61 += this.field3980;
                    var57 += var9;
                    var56 += var10;
                }
            } else {
                int var62 = arg6 - arg5;
                int var63 = arg5 - arg4;
                int var64 = this.field3980 * arg4;
                while (true) {
                    var63--;
                    if (var63 < 0) {
                        while (true) {
                            var62--;
                            if (var62 < 0) {
                                return;
                            }
                            method1681(this.field3981, 0, var58 >> 16, var57 >> 16, 117, var64);
                            var58 += var8;
                            var64 += this.field3980;
                            var57 += var9;
                        }
                    }
                    method1681(this.field3981, 0, var56 >> 16, var57 >> 16, -69, var64);
                    var56 += var10;
                    var64 += this.field3980;
                    var57 += var9;
                }
            }
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "([BIIIII)V")
    private static final void method1681(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg3 <= arg2) {
            return;
        }
        int var6 = arg3 - arg2 >> 2;
        int var7 = arg2 + arg5;
        int var8 = 53 % ((-arg4) / 36);
        while (true) {
            var6--;
            if (var6 < 0) {
                int var9 = arg3 - arg2 & 0x3;
                while (true) {
                    var9--;
                    if (var9 < 0) {
                        return;
                    }
                    arg0[var7++] = 1;
                }
            }
            arg0[var7++] = 1;
            arg0[var7++] = 1;
            arg0[var7++] = 1;
            arg0[var7++] = 1;
        }
    }

    @OriginalMember(owner = "client!gr", name = "<init>", descriptor = "(Lmi;II)V")
    public class274(class315 arg0, int arg1, int arg2) {
        this.field3981 = new byte[arg1 * arg2];
    }
}
