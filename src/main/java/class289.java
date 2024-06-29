import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uu")
public class class289 extends class185 {

    @OriginalMember(owner = "client!uu", name = "C", descriptor = "[B")
    public byte[] field3791;

    @OriginalMember(owner = "client!uu", name = "z", descriptor = "I")
    public static int field3788 = -1;

    @OriginalMember(owner = "client!uu", name = "A", descriptor = "I")
    public static int field3789 = 0;

    @OriginalMember(owner = "client!uu", name = "t", descriptor = "I")
    public static int field3782;

    @OriginalMember(owner = "client!uu", name = "u", descriptor = "I")
    public static int field3783;

    @OriginalMember(owner = "client!uu", name = "v", descriptor = "I")
    public static int field3784;

    @OriginalMember(owner = "client!uu", name = "w", descriptor = "I")
    public int field3785;

    @OriginalMember(owner = "client!uu", name = "x", descriptor = "I")
    public static int field3786;

    @OriginalMember(owner = "client!uu", name = "y", descriptor = "I")
    public int field3787;

    @OriginalMember(owner = "client!uu", name = "B", descriptor = "I")
    public int field3790;

    @OriginalMember(owner = "client!uu", name = "D", descriptor = "I")
    public int field3792;

    @OriginalMember(owner = "client!uu", name = "E", descriptor = "I")
    public static int field3793;

    @OriginalMember(owner = "client!uu", name = "F", descriptor = "I")
    public static int field3794;

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(IIIZIII)V")
    public final void method1730(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        field3786++;
        if (arg3) {
            this.method1734(29, 81, -31, -34, 112);
        }
        int var8 = 0;
        if (arg2 != arg6) {
            var8 = (arg0 - arg5 << 16) / (arg2 - arg6);
        }
        int var9 = 0;
        if (arg2 != arg4) {
            var9 = (arg1 - arg0 << 16) / (arg4 - arg2);
        }
        int var10 = 0;
        if (arg4 != arg6) {
            var10 = (arg5 - arg1 << 16) / (arg6 - arg4);
        }
        if (arg6 <= arg2 && arg4 >= arg6) {
            if (arg4 <= arg2) {
                int var11;
                int var12 = var11 = arg5 << 16;
                if (arg6 < 0) {
                    var12 -= arg6 * var10;
                    var11 -= arg6 * var8;
                    arg6 = 0;
                }
                int var13 = arg1 << 16;
                if (arg4 < 0) {
                    var13 -= arg4 * var9;
                    arg4 = 0;
                }
                if (arg4 != arg6 && var10 < var8 || arg4 == arg6 && var9 > var8) {
                    int var14 = arg2 - arg4;
                    int var15 = arg4 - arg6;
                    int var16 = this.field3787 * arg6;
                    while (true) {
                        var15--;
                        if (var15 < 0) {
                            while (true) {
                                var14--;
                                if (var14 < 0) {
                                    return;
                                }
                                class534.method3069(var16, var13 >> 16, 0, this.field3791, var11 >> 16, 10330);
                                var11 += var8;
                                var16 += this.field3787;
                                var13 += var9;
                            }
                        }
                        class534.method3069(var16, var12 >> 16, 0, this.field3791, var11 >> 16, 10330);
                        var12 += var10;
                        var16 += this.field3787;
                        var11 += var8;
                    }
                } else {
                    int var17 = arg2 - arg4;
                    int var18 = arg4 - arg6;
                    int var19 = this.field3787 * arg6;
                    while (true) {
                        var18--;
                        if (var18 < 0) {
                            while (true) {
                                var17--;
                                if (var17 < 0) {
                                    return;
                                }
                                class534.method3069(var19, var11 >> 16, 0, this.field3791, var13 >> 16, 10330);
                                var19 += this.field3787;
                                var13 += var9;
                                var11 += var8;
                            }
                        }
                        class534.method3069(var19, var11 >> 16, 0, this.field3791, var12 >> 16, 10330);
                        var11 += var8;
                        var19 += this.field3787;
                        var12 += var10;
                    }
                }
            } else {
                int var20;
                int var21 = var20 = arg5 << 16;
                if (arg6 < 0) {
                    var20 -= arg6 * var8;
                    var21 -= arg6 * var10;
                    arg6 = 0;
                }
                int var22 = arg0 << 16;
                if (arg2 < 0) {
                    var22 -= arg2 * var9;
                    arg2 = 0;
                }
                if (arg2 != arg6 && var8 > var10 || arg2 == arg6 && var9 < var10) {
                    int var23 = arg4 - arg2;
                    int var24 = arg2 - arg6;
                    int var25 = this.field3787 * arg6;
                    while (true) {
                        var24--;
                        if (var24 < 0) {
                            while (true) {
                                var23--;
                                if (var23 < 0) {
                                    return;
                                }
                                class534.method3069(var25, var21 >> 16, 0, this.field3791, var22 >> 16, 10330);
                                var21 += var10;
                                var22 += var9;
                                var25 += this.field3787;
                            }
                        }
                        class534.method3069(var25, var21 >> 16, 0, this.field3791, var20 >> 16, 10330);
                        var20 += var8;
                        var25 += this.field3787;
                        var21 += var10;
                    }
                } else {
                    int var26 = arg4 - arg2;
                    int var27 = arg2 - arg6;
                    int var28 = this.field3787 * arg6;
                    while (true) {
                        var27--;
                        if (var27 < 0) {
                            while (true) {
                                var26--;
                                if (var26 < 0) {
                                    return;
                                }
                                class534.method3069(var28, var22 >> 16, 0, this.field3791, var21 >> 16, 10330);
                                var22 += var9;
                                var28 += this.field3787;
                                var21 += var10;
                            }
                        }
                        class534.method3069(var28, var20 >> 16, 0, this.field3791, var21 >> 16, 10330);
                        var20 += var8;
                        var28 += this.field3787;
                        var21 += var10;
                    }
                }
            }
        } else if (arg4 < arg2) {
            if (arg2 <= arg6) {
                int var29;
                int var30 = var29 = arg1 << 16;
                int var31 = arg0 << 16;
                if (arg4 < 0) {
                    var29 -= arg4 * var10;
                    var30 -= arg4 * var9;
                    arg4 = 0;
                }
                if (arg2 < 0) {
                    var31 -= arg2 * var8;
                    arg2 = 0;
                }
                if (var9 < var10) {
                    int var32 = arg6 - arg2;
                    int var33 = arg2 - arg4;
                    int var34 = this.field3787 * arg4;
                    while (true) {
                        var33--;
                        if (var33 < 0) {
                            while (true) {
                                var32--;
                                if (var32 < 0) {
                                    return;
                                }
                                class534.method3069(var34, var31 >> 16, 0, this.field3791, var29 >> 16, 10330);
                                var34 += this.field3787;
                                var31 += var8;
                                var29 += var10;
                            }
                        }
                        class534.method3069(var34, var30 >> 16, 0, this.field3791, var29 >> 16, 10330);
                        var30 += var9;
                        var29 += var10;
                        var34 += this.field3787;
                    }
                } else {
                    int var35 = arg6 - arg2;
                    int var36 = arg2 - arg4;
                    int var37 = this.field3787 * arg4;
                    while (true) {
                        var36--;
                        if (var36 < 0) {
                            while (true) {
                                var35--;
                                if (var35 < 0) {
                                    return;
                                }
                                class534.method3069(var37, var29 >> 16, 0, this.field3791, var31 >> 16, 10330);
                                var31 += var8;
                                var37 += this.field3787;
                                var29 += var10;
                            }
                        }
                        class534.method3069(var37, var29 >> 16, 0, this.field3791, var30 >> 16, 10330);
                        var37 += this.field3787;
                        var29 += var10;
                        var30 += var9;
                    }
                }
            } else {
                int var38;
                int var39 = var38 = arg1 << 16;
                if (arg4 < 0) {
                    var39 -= arg4 * var9;
                    var38 -= arg4 * var10;
                    arg4 = 0;
                }
                int var40 = arg5 << 16;
                if (arg6 < 0) {
                    var40 -= arg6 * var8;
                    arg6 = 0;
                }
                if (var10 <= var9) {
                    int var41 = arg2 - arg6;
                    int var42 = arg6 - arg4;
                    int var43 = this.field3787 * arg4;
                    while (true) {
                        var42--;
                        if (var42 < 0) {
                            while (true) {
                                var41--;
                                if (var41 < 0) {
                                    return;
                                }
                                class534.method3069(var43, var40 >> 16, 0, this.field3791, var39 >> 16, 10330);
                                var43 += this.field3787;
                                var40 += var8;
                                var39 += var9;
                            }
                        }
                        class534.method3069(var43, var38 >> 16, 0, this.field3791, var39 >> 16, 10330);
                        var38 += var10;
                        var39 += var9;
                        var43 += this.field3787;
                    }
                } else {
                    int var44 = arg2 - arg6;
                    int var45 = arg6 - arg4;
                    int var46 = this.field3787 * arg4;
                    while (true) {
                        var45--;
                        if (var45 < 0) {
                            while (true) {
                                var44--;
                                if (var44 < 0) {
                                    return;
                                }
                                class534.method3069(var46, var39 >> 16, 0, this.field3791, var40 >> 16, 10330);
                                var46 += this.field3787;
                                var40 += var8;
                                var39 += var9;
                            }
                        }
                        class534.method3069(var46, var39 >> 16, 0, this.field3791, var38 >> 16, 10330);
                        var38 += var10;
                        var46 += this.field3787;
                        var39 += var9;
                    }
                }
            }
        } else if (arg6 <= arg4) {
            int var47;
            int var48 = var47 = arg0 << 16;
            int var49 = arg5 << 16;
            if (arg2 < 0) {
                var47 -= arg2 * var9;
                var48 -= arg2 * var8;
                arg2 = 0;
            }
            if (arg6 < 0) {
                var49 -= arg6 * var10;
                arg6 = 0;
            }
            if (var9 <= var8) {
                int var50 = arg4 - arg6;
                int var51 = arg6 - arg2;
                int var52 = this.field3787 * arg2;
                while (true) {
                    var51--;
                    if (var51 < 0) {
                        while (true) {
                            var50--;
                            if (var50 < 0) {
                                return;
                            }
                            class534.method3069(var52, var47 >> 16, 0, this.field3791, var49 >> 16, 10330);
                            var47 += var9;
                            var52 += this.field3787;
                            var49 += var10;
                        }
                    }
                    class534.method3069(var52, var47 >> 16, 0, this.field3791, var48 >> 16, 10330);
                    var52 += this.field3787;
                    var47 += var9;
                    var48 += var8;
                }
            } else {
                int var53 = arg4 - arg6;
                int var54 = arg6 - arg2;
                int var55 = this.field3787 * arg2;
                while (true) {
                    var54--;
                    if (var54 < 0) {
                        while (true) {
                            var53--;
                            if (var53 < 0) {
                                return;
                            }
                            class534.method3069(var55, var49 >> 16, 0, this.field3791, var47 >> 16, 10330);
                            var47 += var9;
                            var49 += var10;
                            var55 += this.field3787;
                        }
                    }
                    class534.method3069(var55, var48 >> 16, 0, this.field3791, var47 >> 16, 10330);
                    var55 += this.field3787;
                    var47 += var9;
                    var48 += var8;
                }
            }
        } else {
            int var56;
            int var57 = var56 = arg0 << 16;
            if (arg2 < 0) {
                var57 -= arg2 * var8;
                var56 -= arg2 * var9;
                arg2 = 0;
            }
            int var58 = arg1 << 16;
            if (arg4 < 0) {
                var58 -= arg4 * var10;
                arg4 = 0;
            }
            if (arg2 != arg4 && var9 > var8 || arg2 == arg4 && var10 < var8) {
                int var59 = arg6 - arg4;
                int var60 = arg4 - arg2;
                int var61 = this.field3787 * arg2;
                while (true) {
                    var60--;
                    if (var60 < 0) {
                        while (true) {
                            var59--;
                            if (var59 < 0) {
                                return;
                            }
                            class534.method3069(var61, var57 >> 16, 0, this.field3791, var58 >> 16, 10330);
                            var61 += this.field3787;
                            var58 += var10;
                            var57 += var8;
                        }
                    }
                    class534.method3069(var61, var57 >> 16, 0, this.field3791, var56 >> 16, 10330);
                    var57 += var8;
                    var61 += this.field3787;
                    var56 += var9;
                }
            } else {
                int var62 = arg6 - arg4;
                int var63 = arg4 - arg2;
                int var64 = this.field3787 * arg2;
                while (true) {
                    var63--;
                    if (var63 < 0) {
                        while (true) {
                            var62--;
                            if (var62 < 0) {
                                return;
                            }
                            class534.method3069(var64, var58 >> 16, 0, this.field3791, var57 >> 16, 10330);
                            var58 += var10;
                            var57 += var8;
                            var64 += this.field3787;
                        }
                    }
                    class534.method3069(var64, var56 >> 16, 0, this.field3791, var57 >> 16, 10330);
                    var57 += var8;
                    var56 += var9;
                    var64 += this.field3787;
                }
            }
        }
    }

    @OriginalMember(owner = "client!uu", name = "b", descriptor = "(B)V")
    public final void method1731(byte arg0) {
        int var2 = -28 % ((arg0 - 41) / 53);
        field3793++;
        int var3 = -1;
        int var4 = this.field3791.length - 8;
        while (var3 < var4) {
            var3++;
            this.field3791[var3] = 0;
            var3++;
            this.field3791[var3] = 0;
            var3++;
            this.field3791[var3] = 0;
            var3++;
            this.field3791[var3] = 0;
            var3++;
            this.field3791[var3] = 0;
            var3++;
            this.field3791[var3] = 0;
            var3++;
            this.field3791[var3] = 0;
            var3++;
            this.field3791[var3] = 0;
        }
        while (var3 < (this.field3791.length - 1)) {
            var3++;
            this.field3791[var3] = 0;
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(II[BZ)[B")
    public static final byte[] method1732(int arg0, int arg1, byte[] arg2, boolean arg3) {
        field3783++;
        byte[] var4;
        if (arg1 > 0) {
            var4 = new byte[arg0];
            for (int var5 = 0; var5 < arg0; var5++) {
                var4[var5] = arg2[arg1 + var5];
            }
        } else {
            var4 = arg2;
        }
        if (arg3) {
            method1732(-11, -64, null, true);
        }
        class636 var6 = new class636();
        var6.method3563(10);
        var6.method3570((long) (arg0 * 8), var4, -29059);
        byte[] var7 = new byte[64];
        var6.method3565(true, 0, var7);
        return var7;
    }

    @OriginalMember(owner = "client!uu", name = "b", descriptor = "(III)Z")
    public final boolean method1733(int arg0, int arg1, int arg2) {
        if (arg1 != -2679) {
            this.field3791 = null;
        }
        field3794++;
        return this.field3791.length >= arg0 * arg2;
    }

    @OriginalMember(owner = "client!uu", name = "<init>", descriptor = "(Lbi;II)V")
    public class289(class483 arg0, int arg1, int arg2) {
        this.field3791 = new byte[arg1 * arg2];
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(IIIII)V")
    public final void method1734(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field3792 = arg3;
        field3782++;
        this.field3785 = arg4 - arg2;
        this.field3787 = arg1 - arg3;
        this.field3790 = arg2;
        if (arg0 != 17655) {
            this.method1734(-125, -76, -120, -41, -22);
        }
    }
}
