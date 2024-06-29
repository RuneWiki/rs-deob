import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class270 extends class210 {

    @OriginalMember(owner = "client!j", name = "E", descriptor = "[B")
    public byte[] field3691;

    @OriginalMember(owner = "client!j", name = "C", descriptor = "I")
    public int field3689;

    @OriginalMember(owner = "client!j", name = "D", descriptor = "I")
    public int field3690;

    @OriginalMember(owner = "client!j", name = "F", descriptor = "I")
    public int field3692;

    @OriginalMember(owner = "client!j", name = "G", descriptor = "I")
    public int field3693;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIII[B)V", line = 9)
    private static final void method1714(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        if (arg4 != 75166128 || arg1 >= arg3) {
            return;
        }
        int var6 = arg3 - arg1 >> 2;
        int var7 = arg1 + arg2;
        while (true) {
            var6--;
            if (var6 < 0) {
                int var8 = arg3 - arg1 & 0x3;
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

    @OriginalMember(owner = "client!j", name = "c", descriptor = "(B)V", line = 40)
    public final void method1715(byte arg0) {
        int var2 = 114 % ((arg0 + 65) / 56);
        int var3 = -1;
        int var4 = this.field3691.length - 8;
        while (var4 > var3) {
            var3++;
            this.field3691[var3] = 0;
            var3++;
            this.field3691[var3] = 0;
            var3++;
            this.field3691[var3] = 0;
            var3++;
            this.field3691[var3] = 0;
            var3++;
            this.field3691[var3] = 0;
            var3++;
            this.field3691[var3] = 0;
            var3++;
            this.field3691[var3] = 0;
            var3++;
            this.field3691[var3] = 0;
        }
        while (this.field3691.length - 1 > var3) {
            var3++;
            this.field3691[var3] = 0;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IZIIIII)V", line = 67)
    public final void method1716(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = 0;
        if (arg2 != arg5) {
            var8 = (arg3 - arg0 << 16) / (arg5 - arg2);
        }
        int var9 = 0;
        if (arg5 != arg6) {
            var9 = (arg4 - arg3 << 16) / (arg6 - arg5);
        }
        if (!arg1) {
            this.method1717(-9, -20, -3);
        }
        int var10 = 0;
        if (arg2 != arg6) {
            var10 = (arg0 - arg4 << 16) / (arg2 - arg6);
        }
        if (arg2 <= arg5 && arg2 <= arg6) {
            if (arg6 > arg5) {
                int var11;
                int var12 = var11 = arg0 << 16;
                int var13 = arg3 << 16;
                if (arg2 < 0) {
                    var12 -= arg2 * var10;
                    var11 -= arg2 * var8;
                    arg2 = 0;
                }
                if (arg5 < 0) {
                    var13 -= arg5 * var9;
                    arg5 = 0;
                }
                if (arg2 != arg5 && var10 < var8 || arg2 == arg5 && var10 > var9) {
                    int var14 = arg6 - arg5;
                    int var15 = arg5 - arg2;
                    int var16 = this.field3690 * arg2;
                    while (true) {
                        var15--;
                        if (var15 < 0) {
                            while (true) {
                                var14--;
                                if (var14 < 0) {
                                    return;
                                }
                                method1714(0, var12 >> 16, var16, var13 >> 16, 75166128, this.field3691);
                                var12 += var10;
                                var13 += var9;
                                var16 += this.field3690;
                            }
                        }
                        method1714(0, var12 >> 16, var16, var11 >> 16, 75166128, this.field3691);
                        var12 += var10;
                        var11 += var8;
                        var16 += this.field3690;
                    }
                } else {
                    int var17 = arg6 - arg5;
                    int var18 = arg5 - arg2;
                    int var19 = this.field3690 * arg2;
                    while (true) {
                        var18--;
                        if (var18 < 0) {
                            while (true) {
                                var17--;
                                if (var17 < 0) {
                                    return;
                                }
                                method1714(0, var13 >> 16, var19, var12 >> 16, 75166128, this.field3691);
                                var19 += this.field3690;
                                var12 += var10;
                                var13 += var9;
                            }
                        }
                        method1714(0, var11 >> 16, var19, var12 >> 16, 75166128, this.field3691);
                        var19 += this.field3690;
                        var12 += var10;
                        var11 += var8;
                    }
                }
            } else {
                int var20;
                int var21 = var20 = arg0 << 16;
                if (arg2 < 0) {
                    var21 -= arg2 * var10;
                    var20 -= arg2 * var8;
                    arg2 = 0;
                }
                int var22 = arg4 << 16;
                if (arg6 < 0) {
                    var22 -= arg6 * var9;
                    arg6 = 0;
                }
                if ((arg2 == arg6 || var8 <= var10) && (arg2 != arg6 || var8 >= var9)) {
                    int var26 = arg5 - arg6;
                    int var27 = arg6 - arg2;
                    int var28 = this.field3690 * arg2;
                    while (true) {
                        var27--;
                        if (var27 < 0) {
                            while (true) {
                                var26--;
                                if (var26 < 0) {
                                    return;
                                }
                                method1714(0, var20 >> 16, var28, var22 >> 16, 75166128, this.field3691);
                                var22 += var9;
                                var28 += this.field3690;
                                var20 += var8;
                            }
                        }
                        method1714(0, var20 >> 16, var28, var21 >> 16, 75166128, this.field3691);
                        var21 += var10;
                        var20 += var8;
                        var28 += this.field3690;
                    }
                } else {
                    int var23 = arg5 - arg6;
                    int var24 = arg6 - arg2;
                    int var25 = this.field3690 * arg2;
                    while (true) {
                        var24--;
                        if (var24 < 0) {
                            while (true) {
                                var23--;
                                if (var23 < 0) {
                                    return;
                                }
                                method1714(0, var22 >> 16, var25, var20 >> 16, 75166128, this.field3691);
                                var25 += this.field3690;
                                var20 += var8;
                                var22 += var9;
                            }
                        }
                        method1714(0, var21 >> 16, var25, var20 >> 16, 75166128, this.field3691);
                        var25 += this.field3690;
                        var20 += var8;
                        var21 += var10;
                    }
                }
            }
        } else if (arg5 > arg6) {
            if (arg2 >= arg5) {
                int var29;
                int var30 = var29 = arg4 << 16;
                if (arg6 < 0) {
                    var29 -= arg6 * var10;
                    var30 -= arg6 * var9;
                    arg6 = 0;
                }
                int var31 = arg3 << 16;
                if (arg5 < 0) {
                    var31 -= arg5 * var8;
                    arg5 = 0;
                }
                if (var10 <= var9) {
                    int var32 = arg2 - arg5;
                    int var33 = arg5 - arg6;
                    int var34 = this.field3690 * arg6;
                    while (true) {
                        var33--;
                        if (var33 < 0) {
                            while (true) {
                                var32--;
                                if (var32 < 0) {
                                    return;
                                }
                                method1714(0, var29 >> 16, var34, var31 >> 16, 75166128, this.field3691);
                                var29 += var10;
                                var31 += var8;
                                var34 += this.field3690;
                            }
                        }
                        method1714(0, var29 >> 16, var34, var30 >> 16, 75166128, this.field3691);
                        var29 += var10;
                        var34 += this.field3690;
                        var30 += var9;
                    }
                } else {
                    int var35 = arg2 - arg5;
                    int var36 = arg5 - arg6;
                    int var37 = this.field3690 * arg6;
                    while (true) {
                        var36--;
                        if (var36 < 0) {
                            while (true) {
                                var35--;
                                if (var35 < 0) {
                                    return;
                                }
                                method1714(0, var31 >> 16, var37, var29 >> 16, 75166128, this.field3691);
                                var29 += var10;
                                var31 += var8;
                                var37 += this.field3690;
                            }
                        }
                        method1714(0, var30 >> 16, var37, var29 >> 16, 75166128, this.field3691);
                        var37 += this.field3690;
                        var30 += var9;
                        var29 += var10;
                    }
                }
            } else {
                int var38;
                int var39 = var38 = arg4 << 16;
                if (arg6 < 0) {
                    var39 -= arg6 * var9;
                    var38 -= arg6 * var10;
                    arg6 = 0;
                }
                int var40 = arg0 << 16;
                if (arg2 < 0) {
                    var40 -= arg2 * var8;
                    arg2 = 0;
                }
                if (var9 < var10) {
                    int var41 = arg5 - arg2;
                    int var42 = arg2 - arg6;
                    int var43 = this.field3690 * arg6;
                    while (true) {
                        var42--;
                        if (var42 < 0) {
                            while (true) {
                                var41--;
                                if (var41 < 0) {
                                    return;
                                }
                                method1714(0, var39 >> 16, var43, var40 >> 16, 75166128, this.field3691);
                                var39 += var9;
                                var43 += this.field3690;
                                var40 += var8;
                            }
                        }
                        method1714(0, var39 >> 16, var43, var38 >> 16, 75166128, this.field3691);
                        var38 += var10;
                        var39 += var9;
                        var43 += this.field3690;
                    }
                } else {
                    int var44 = arg5 - arg2;
                    int var45 = arg2 - arg6;
                    int var46 = this.field3690 * arg6;
                    while (true) {
                        var45--;
                        if (var45 < 0) {
                            while (true) {
                                var44--;
                                if (var44 < 0) {
                                    return;
                                }
                                method1714(0, var40 >> 16, var46, var39 >> 16, 75166128, this.field3691);
                                var46 += this.field3690;
                                var40 += var8;
                                var39 += var9;
                            }
                        }
                        method1714(0, var38 >> 16, var46, var39 >> 16, 75166128, this.field3691);
                        var46 += this.field3690;
                        var39 += var9;
                        var38 += var10;
                    }
                }
            }
        } else if (arg6 >= arg2) {
            int var47;
            int var48 = var47 = arg3 << 16;
            if (arg5 < 0) {
                var48 -= arg5 * var8;
                var47 -= arg5 * var9;
                arg5 = 0;
            }
            int var49 = arg0 << 16;
            if (arg2 < 0) {
                var49 -= arg2 * var10;
                arg2 = 0;
            }
            if (var8 >= var9) {
                int var50 = arg6 - arg2;
                int var51 = arg2 - arg5;
                int var52 = this.field3690 * arg5;
                while (true) {
                    var51--;
                    if (var51 < 0) {
                        while (true) {
                            var50--;
                            if (var50 < 0) {
                                return;
                            }
                            method1714(0, var47 >> 16, var52, var49 >> 16, 75166128, this.field3691);
                            var47 += var9;
                            var49 += var10;
                            var52 += this.field3690;
                        }
                    }
                    method1714(0, var47 >> 16, var52, var48 >> 16, 75166128, this.field3691);
                    var47 += var9;
                    var48 += var8;
                    var52 += this.field3690;
                }
            } else {
                int var53 = arg6 - arg2;
                int var54 = arg2 - arg5;
                int var55 = this.field3690 * arg5;
                while (true) {
                    var54--;
                    if (var54 < 0) {
                        while (true) {
                            var53--;
                            if (var53 < 0) {
                                return;
                            }
                            method1714(0, var49 >> 16, var55, var47 >> 16, 75166128, this.field3691);
                            var47 += var9;
                            var55 += this.field3690;
                            var49 += var10;
                        }
                    }
                    method1714(0, var48 >> 16, var55, var47 >> 16, 75166128, this.field3691);
                    var55 += this.field3690;
                    var48 += var8;
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
            int var58 = arg4 << 16;
            if (arg6 < 0) {
                var58 -= arg6 * var10;
                arg6 = 0;
            }
            if (arg5 != arg6 && var8 < var9 || arg5 == arg6 && var8 > var10) {
                int var59 = arg2 - arg6;
                int var60 = arg6 - arg5;
                int var61 = this.field3690 * arg5;
                while (true) {
                    var60--;
                    if (var60 < 0) {
                        while (true) {
                            var59--;
                            if (var59 < 0) {
                                return;
                            }
                            method1714(0, var57 >> 16, var61, var58 >> 16, 75166128, this.field3691);
                            var57 += var8;
                            var61 += this.field3690;
                            var58 += var10;
                        }
                    }
                    method1714(0, var57 >> 16, var61, var56 >> 16, 75166128, this.field3691);
                    var56 += var9;
                    var61 += this.field3690;
                    var57 += var8;
                }
            } else {
                int var62 = arg2 - arg6;
                int var63 = arg6 - arg5;
                int var64 = this.field3690 * arg5;
                while (true) {
                    var63--;
                    if (var63 < 0) {
                        while (true) {
                            var62--;
                            if (var62 < 0) {
                                return;
                            }
                            method1714(0, var58 >> 16, var64, var57 >> 16, 75166128, this.field3691);
                            var58 += var10;
                            var57 += var8;
                            var64 += this.field3690;
                        }
                    }
                    method1714(0, var56 >> 16, var64, var57 >> 16, 75166128, this.field3691);
                    var56 += var9;
                    var57 += var8;
                    var64 += this.field3690;
                }
            }
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(III)Z", line = 504)
    public final boolean method1717(int arg0, int arg1, int arg2) {
        int var4 = 91 % ((2 - arg2) / 54);
        return this.field3691.length >= (arg0 * arg1);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIBII)V", line = 513)
    public final void method1718(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        this.field3690 = arg1 - arg4;
        this.field3693 = arg0 - arg3;
        if (arg2 == -69) {
            this.field3692 = arg4;
            this.field3689 = arg3;
        }
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Lmm;II)V", line = 530)
    public class270(class357 arg0, int arg1, int arg2) {
        this.field3691 = new byte[arg1 * arg2];
    }
}
