import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class253 extends class325 {

    @OriginalMember(owner = "client!bj", name = "N", descriptor = "[B")
    public byte[] field3428;

    @OriginalMember(owner = "client!bj", name = "D", descriptor = "I")
    public int field3424;

    @OriginalMember(owner = "client!bj", name = "F", descriptor = "I")
    public int field3425;

    @OriginalMember(owner = "client!bj", name = "L", descriptor = "I")
    public int field3426;

    @OriginalMember(owner = "client!bj", name = "M", descriptor = "I")
    public int field3427;

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(III)Z", line = 4)
    public final boolean method1632(int arg0, int arg1, int arg2) {
        if (arg2 > -19) {
            this.method1632(-52, 104, 98);
        }
        return this.field3428.length >= (arg0 * arg1);
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IIIIIZI)V", line = 17)
    public final void method1633(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        int var8 = 0;
        if (arg3 != arg6) {
            var8 = (arg2 - arg1 << 16) / (arg6 - arg3);
        }
        if (!arg5) {
            this.method1634(-107, 124, -84, 95, 53);
        }
        int var9 = 0;
        if (arg4 != arg6) {
            var9 = (arg0 - arg2 << 16) / (arg4 - arg6);
        }
        int var10 = 0;
        if (arg3 != arg4) {
            var10 = (arg1 - arg0 << 16) / (arg3 - arg4);
        }
        if (arg3 <= arg6 && arg4 >= arg3) {
            if (arg6 >= arg4) {
                int var11;
                int var12 = var11 = arg1 << 16;
                int var13 = arg0 << 16;
                if (arg3 < 0) {
                    var11 -= arg3 * var8;
                    var12 -= arg3 * var10;
                    arg3 = 0;
                }
                if (arg4 < 0) {
                    var13 -= arg4 * var9;
                    arg4 = 0;
                }
                if (arg3 != arg4 && var10 < var8 || arg3 == arg4 && var9 > var8) {
                    int var14 = arg6 - arg4;
                    int var15 = arg4 - arg3;
                    int var16 = this.field3426 * arg3;
                    while (true) {
                        var15--;
                        if (var15 < 0) {
                            while (true) {
                                var14--;
                                if (var14 < 0) {
                                    return;
                                }
                                method1635(this.field3428, (byte) 45, 0, var13 >> 16, var11 >> 16, var16);
                                var11 += var8;
                                var13 += var9;
                                var16 += this.field3426;
                            }
                        }
                        method1635(this.field3428, (byte) -114, 0, var12 >> 16, var11 >> 16, var16);
                        var11 += var8;
                        var12 += var10;
                        var16 += this.field3426;
                    }
                } else {
                    int var17 = arg6 - arg4;
                    int var18 = arg4 - arg3;
                    int var19 = this.field3426 * arg3;
                    while (true) {
                        var18--;
                        if (var18 < 0) {
                            while (true) {
                                var17--;
                                if (var17 < 0) {
                                    return;
                                }
                                method1635(this.field3428, (byte) -126, 0, var11 >> 16, var13 >> 16, var19);
                                var11 += var8;
                                var19 += this.field3426;
                                var13 += var9;
                            }
                        }
                        method1635(this.field3428, (byte) 126, 0, var11 >> 16, var12 >> 16, var19);
                        var19 += this.field3426;
                        var12 += var10;
                        var11 += var8;
                    }
                }
            } else {
                int var20;
                int var21 = var20 = arg1 << 16;
                if (arg3 < 0) {
                    var20 -= arg3 * var8;
                    var21 -= arg3 * var10;
                    arg3 = 0;
                }
                int var22 = arg2 << 16;
                if (arg6 < 0) {
                    var22 -= arg6 * var9;
                    arg6 = 0;
                }
                if ((arg3 == arg6 || var8 <= var10) && (arg3 != arg6 || var9 >= var10)) {
                    int var26 = arg4 - arg6;
                    int var27 = arg6 - arg3;
                    int var28 = this.field3426 * arg3;
                    while (true) {
                        var27--;
                        if (var27 < 0) {
                            while (true) {
                                var26--;
                                if (var26 < 0) {
                                    return;
                                }
                                method1635(this.field3428, (byte) -128, 0, var22 >> 16, var21 >> 16, var28);
                                var28 += this.field3426;
                                var21 += var10;
                                var22 += var9;
                            }
                        }
                        method1635(this.field3428, (byte) 65, 0, var20 >> 16, var21 >> 16, var28);
                        var21 += var10;
                        var28 += this.field3426;
                        var20 += var8;
                    }
                } else {
                    int var23 = arg4 - arg6;
                    int var24 = arg6 - arg3;
                    int var25 = this.field3426 * arg3;
                    while (true) {
                        var24--;
                        if (var24 < 0) {
                            while (true) {
                                var23--;
                                if (var23 < 0) {
                                    return;
                                }
                                method1635(this.field3428, (byte) 106, 0, var21 >> 16, var22 >> 16, var25);
                                var25 += this.field3426;
                                var22 += var9;
                                var21 += var10;
                            }
                        }
                        method1635(this.field3428, (byte) -117, 0, var21 >> 16, var20 >> 16, var25);
                        var21 += var10;
                        var20 += var8;
                        var25 += this.field3426;
                    }
                }
            }
        } else if (arg6 > arg4) {
            if (arg3 < arg6) {
                int var29;
                int var30 = var29 = arg0 << 16;
                if (arg4 < 0) {
                    var29 -= arg4 * var10;
                    var30 -= arg4 * var9;
                    arg4 = 0;
                }
                int var31 = arg1 << 16;
                if (arg3 < 0) {
                    var31 -= arg3 * var8;
                    arg3 = 0;
                }
                if (var10 > var9) {
                    int var32 = arg6 - arg3;
                    int var33 = arg3 - arg4;
                    int var34 = this.field3426 * arg4;
                    while (true) {
                        var33--;
                        if (var33 < 0) {
                            while (true) {
                                var32--;
                                if (var32 < 0) {
                                    return;
                                }
                                method1635(this.field3428, (byte) -122, 0, var30 >> 16, var31 >> 16, var34);
                                var31 += var8;
                                var34 += this.field3426;
                                var30 += var9;
                            }
                        }
                        method1635(this.field3428, (byte) -113, 0, var30 >> 16, var29 >> 16, var34);
                        var34 += this.field3426;
                        var29 += var10;
                        var30 += var9;
                    }
                } else {
                    int var35 = arg6 - arg3;
                    int var36 = arg3 - arg4;
                    int var37 = this.field3426 * arg4;
                    while (true) {
                        var36--;
                        if (var36 < 0) {
                            while (true) {
                                var35--;
                                if (var35 < 0) {
                                    return;
                                }
                                method1635(this.field3428, (byte) -114, 0, var31 >> 16, var30 >> 16, var37);
                                var31 += var8;
                                var30 += var9;
                                var37 += this.field3426;
                            }
                        }
                        method1635(this.field3428, (byte) 79, 0, var29 >> 16, var30 >> 16, var37);
                        var37 += this.field3426;
                        var29 += var10;
                        var30 += var9;
                    }
                }
            } else {
                int var38;
                int var39 = var38 = arg0 << 16;
                int var40 = arg2 << 16;
                if (arg4 < 0) {
                    var38 -= arg4 * var10;
                    var39 -= arg4 * var9;
                    arg4 = 0;
                }
                if (arg6 < 0) {
                    var40 -= arg6 * var8;
                    arg6 = 0;
                }
                if (var10 > var9) {
                    int var41 = arg3 - arg6;
                    int var42 = arg6 - arg4;
                    int var43 = this.field3426 * arg4;
                    while (true) {
                        var42--;
                        if (var42 < 0) {
                            while (true) {
                                var41--;
                                if (var41 < 0) {
                                    return;
                                }
                                method1635(this.field3428, (byte) -116, 0, var40 >> 16, var38 >> 16, var43);
                                var38 += var10;
                                var43 += this.field3426;
                                var40 += var8;
                            }
                        }
                        method1635(this.field3428, (byte) 103, 0, var39 >> 16, var38 >> 16, var43);
                        var38 += var10;
                        var39 += var9;
                        var43 += this.field3426;
                    }
                } else {
                    int var44 = arg3 - arg6;
                    int var45 = arg6 - arg4;
                    int var46 = this.field3426 * arg4;
                    while (true) {
                        var45--;
                        if (var45 < 0) {
                            while (true) {
                                var44--;
                                if (var44 < 0) {
                                    return;
                                }
                                method1635(this.field3428, (byte) 125, 0, var38 >> 16, var40 >> 16, var46);
                                var40 += var8;
                                var46 += this.field3426;
                                var38 += var10;
                            }
                        }
                        method1635(this.field3428, (byte) -112, 0, var38 >> 16, var39 >> 16, var46);
                        var46 += this.field3426;
                        var38 += var10;
                        var39 += var9;
                    }
                }
            }
        } else if (arg4 < arg3) {
            int var47;
            int var48 = var47 = arg2 << 16;
            int var49 = arg0 << 16;
            if (arg6 < 0) {
                var47 -= arg6 * var9;
                var48 -= arg6 * var8;
                arg6 = 0;
            }
            if (arg4 < 0) {
                var49 -= arg4 * var10;
                arg4 = 0;
            }
            if ((arg4 == arg6 || var8 >= var9) && (arg4 != arg6 || var10 >= var8)) {
                int var53 = arg3 - arg4;
                int var54 = arg4 - arg6;
                int var55 = this.field3426 * arg6;
                while (true) {
                    var54--;
                    if (var54 < 0) {
                        while (true) {
                            var53--;
                            if (var53 < 0) {
                                return;
                            }
                            method1635(this.field3428, (byte) 91, 0, var49 >> 16, var48 >> 16, var55);
                            var48 += var8;
                            var49 += var10;
                            var55 += this.field3426;
                        }
                    }
                    method1635(this.field3428, (byte) -123, 0, var47 >> 16, var48 >> 16, var55);
                    var55 += this.field3426;
                    var48 += var8;
                    var47 += var9;
                }
            } else {
                int var50 = arg3 - arg4;
                int var51 = arg4 - arg6;
                int var52 = this.field3426 * arg6;
                while (true) {
                    var51--;
                    if (var51 < 0) {
                        while (true) {
                            var50--;
                            if (var50 < 0) {
                                return;
                            }
                            method1635(this.field3428, (byte) 117, 0, var48 >> 16, var49 >> 16, var52);
                            var49 += var10;
                            var52 += this.field3426;
                            var48 += var8;
                        }
                    }
                    method1635(this.field3428, (byte) -116, 0, var48 >> 16, var47 >> 16, var52);
                    var48 += var8;
                    var47 += var9;
                    var52 += this.field3426;
                }
            }
        } else {
            int var56;
            int var57 = var56 = arg2 << 16;
            int var58 = arg1 << 16;
            if (arg6 < 0) {
                var56 -= arg6 * var9;
                var57 -= arg6 * var8;
                arg6 = 0;
            }
            if (arg3 < 0) {
                var58 -= arg3 * var10;
                arg3 = 0;
            }
            if (var8 < var9) {
                int var59 = arg4 - arg3;
                int var60 = arg3 - arg6;
                int var61 = this.field3426 * arg6;
                while (true) {
                    var60--;
                    if (var60 < 0) {
                        while (true) {
                            var59--;
                            if (var59 < 0) {
                                return;
                            }
                            method1635(this.field3428, (byte) -118, 0, var58 >> 16, var56 >> 16, var61);
                            var56 += var9;
                            var58 += var10;
                            var61 += this.field3426;
                        }
                    }
                    method1635(this.field3428, (byte) 92, 0, var57 >> 16, var56 >> 16, var61);
                    var57 += var8;
                    var61 += this.field3426;
                    var56 += var9;
                }
            } else {
                int var62 = arg4 - arg3;
                int var63 = arg3 - arg6;
                int var64 = this.field3426 * arg6;
                while (true) {
                    var63--;
                    if (var63 < 0) {
                        while (true) {
                            var62--;
                            if (var62 < 0) {
                                return;
                            }
                            method1635(this.field3428, (byte) -126, 0, var56 >> 16, var58 >> 16, var64);
                            var58 += var10;
                            var64 += this.field3426;
                            var56 += var9;
                        }
                    }
                    method1635(this.field3428, (byte) 53, 0, var56 >> 16, var57 >> 16, var64);
                    var56 += var9;
                    var64 += this.field3426;
                    var57 += var8;
                }
            }
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IIIII)V", line = 453)
    public final void method1634(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field3427 = arg2;
        this.field3424 = arg0;
        this.field3426 = arg1 - arg2;
        this.field3425 = arg4 - arg0;
        if (arg3 != 0) {
            method1635((byte[]) null, (byte) -98, -121, 108, 25, 44);
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "([BBIIII)V", line = 469)
    private static final void method1635(byte[] arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg3 >= arg4) {
            return;
        }
        int var6 = arg3 + arg5;
        int var7 = 73 / ((arg1 + 52) / 59);
        int var8 = arg4 - arg3 >> 2;
        while (true) {
            var8--;
            if (var8 < 0) {
                int var9 = arg4 - arg3 & 0x3;
                while (true) {
                    var9--;
                    if (var9 < 0) {
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

    @OriginalMember(owner = "client!bj", name = "f", descriptor = "(I)V", line = 503)
    public final void method1636(int arg0) {
        int var2 = -10 % ((arg0 + 35) / 61);
        int var3 = -1;
        int var4 = this.field3428.length - 8;
        while (var3 < var4) {
            var3++;
            this.field3428[var3] = 0;
            var3++;
            this.field3428[var3] = 0;
            var3++;
            this.field3428[var3] = 0;
            var3++;
            this.field3428[var3] = 0;
            var3++;
            this.field3428[var3] = 0;
            var3++;
            this.field3428[var3] = 0;
            var3++;
            this.field3428[var3] = 0;
            var3++;
            this.field3428[var3] = 0;
        }
        while (var3 < this.field3428.length - 1) {
            var3++;
            this.field3428[var3] = 0;
        }
    }

    @OriginalMember(owner = "client!bj", name = "<init>", descriptor = "(Lhd;II)V", line = 528)
    public class253(class17 arg0, int arg1, int arg2) {
        this.field3428 = new byte[arg1 * arg2];
    }
}
