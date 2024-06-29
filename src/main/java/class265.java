import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oca")
public class class265 extends class183 {

    @OriginalMember(owner = "client!oca", name = "O", descriptor = "[B")
    public byte[] field3793;

    @OriginalMember(owner = "client!oca", name = "J", descriptor = "Z")
    public static boolean field3788 = false;

    @OriginalMember(owner = "client!oca", name = "P", descriptor = "I")
    public static int field3794 = 64;

    @OriginalMember(owner = "client!oca", name = "G", descriptor = "I")
    public static int field3785;

    @OriginalMember(owner = "client!oca", name = "H", descriptor = "I")
    public static int field3786;

    @OriginalMember(owner = "client!oca", name = "I", descriptor = "I")
    public int field3787;

    @OriginalMember(owner = "client!oca", name = "K", descriptor = "I")
    public static int field3789;

    @OriginalMember(owner = "client!oca", name = "L", descriptor = "I")
    public int field3790;

    @OriginalMember(owner = "client!oca", name = "M", descriptor = "I")
    public int field3791;

    @OriginalMember(owner = "client!oca", name = "N", descriptor = "I")
    public int field3792;

    @OriginalMember(owner = "client!oca", name = "Q", descriptor = "I")
    public static int field3795;

    @OriginalMember(owner = "client!oca", name = "R", descriptor = "Lvd;")
    public static class39 field3796;

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(I)V", line = 4)
    public final void method1704(int arg0) {
        if (arg0 > -108) {
            return;
        }
        field3785++;
        int var2 = -1;
        int var3 = this.field3793.length - 8;
        while (var2 < var3) {
            var2++;
            this.field3793[var2] = 0;
            var2++;
            this.field3793[var2] = 0;
            var2++;
            this.field3793[var2] = 0;
            var2++;
            this.field3793[var2] = 0;
            var2++;
            this.field3793[var2] = 0;
            var2++;
            this.field3793[var2] = 0;
            var2++;
            this.field3793[var2] = 0;
            var2++;
            this.field3793[var2] = 0;
        }
        while (this.field3793.length - 1 > var2) {
            var2++;
            this.field3793[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(IIB)Z", line = 40)
    public final boolean method1705(int arg0, int arg1, byte arg2) {
        if (arg2 != 48) {
            this.field3791 = 78;
        }
        field3795++;
        return arg0 * arg1 <= this.field3793.length;
    }

    @OriginalMember(owner = "client!oca", name = "b", descriptor = "(B)V", line = 54)
    public static void method1706(byte arg0) {
        if (arg0 < 121) {
            method1706((byte) 101);
        }
        field3796 = null;
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(IIIII)V", line = 65)
    public final void method1707(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field3787 = arg0 - arg3;
        this.field3791 = arg4;
        int var6 = 60 % ((arg1 - 32) / 48);
        this.field3792 = arg3;
        field3786++;
        this.field3790 = arg2 - arg4;
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(IIIBIII)V", line = 89)
    public final void method1708(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        field3789++;
        if (arg3 != -93) {
            field3796 = null;
        }
        int var8 = 0;
        if (arg2 != arg4) {
            var8 = (arg5 - arg6 << 16) / (arg2 - arg4);
        }
        int var9 = 0;
        if (arg0 != arg2) {
            var9 = (arg1 - arg5 << 16) / (arg0 - arg2);
        }
        int var10 = 0;
        if (arg0 != arg4) {
            var10 = (arg6 - arg1 << 16) / (arg4 - arg0);
        }
        if (arg2 >= arg4 && arg4 <= arg0) {
            if (arg2 < arg0) {
                int var11;
                int var12 = var11 = arg6 << 16;
                int var13 = arg5 << 16;
                if (arg4 < 0) {
                    var12 -= arg4 * var10;
                    var11 -= arg4 * var8;
                    arg4 = 0;
                }
                if (arg2 < 0) {
                    var13 -= arg2 * var9;
                    arg2 = 0;
                }
                if (arg2 != arg4 && var10 < var8 || arg2 == arg4 && var10 > var9) {
                    int var14 = arg0 - arg2;
                    int var15 = arg2 - arg4;
                    int var16 = this.field3787 * arg4;
                    while (true) {
                        var15--;
                        if (var15 < 0) {
                            while (true) {
                                var14--;
                                if (var14 < 0) {
                                    return;
                                }
                                class590.method3411(this.field3793, var12 >> 16, 0, var16, var13 >> 16, (byte) 51);
                                var16 += this.field3787;
                                var13 += var9;
                                var12 += var10;
                            }
                        }
                        class590.method3411(this.field3793, var12 >> 16, 0, var16, var11 >> 16, (byte) 51);
                        var12 += var10;
                        var11 += var8;
                        var16 += this.field3787;
                    }
                } else {
                    int var17 = arg0 - arg2;
                    int var18 = arg2 - arg4;
                    int var19 = this.field3787 * arg4;
                    while (true) {
                        var18--;
                        if (var18 < 0) {
                            while (true) {
                                var17--;
                                if (var17 < 0) {
                                    return;
                                }
                                class590.method3411(this.field3793, var13 >> 16, 0, var19, var12 >> 16, (byte) 51);
                                var12 += var10;
                                var13 += var9;
                                var19 += this.field3787;
                            }
                        }
                        class590.method3411(this.field3793, var11 >> 16, 0, var19, var12 >> 16, (byte) 51);
                        var11 += var8;
                        var19 += this.field3787;
                        var12 += var10;
                    }
                }
            } else {
                int var20;
                int var21 = var20 = arg6 << 16;
                if (arg4 < 0) {
                    var21 -= arg4 * var10;
                    var20 -= arg4 * var8;
                    arg4 = 0;
                }
                int var22 = arg1 << 16;
                if (arg0 < 0) {
                    var22 -= arg0 * var9;
                    arg0 = 0;
                }
                if (arg0 != arg4 && var10 < var8 || arg0 == arg4 && var8 < var9) {
                    int var23 = arg2 - arg0;
                    int var24 = arg0 - arg4;
                    int var25 = this.field3787 * arg4;
                    while (true) {
                        var24--;
                        if (var24 < 0) {
                            while (true) {
                                var23--;
                                if (var23 < 0) {
                                    return;
                                }
                                class590.method3411(this.field3793, var22 >> 16, 0, var25, var20 >> 16, (byte) 51);
                                var25 += this.field3787;
                                var20 += var8;
                                var22 += var9;
                            }
                        }
                        class590.method3411(this.field3793, var21 >> 16, 0, var25, var20 >> 16, (byte) 51);
                        var25 += this.field3787;
                        var20 += var8;
                        var21 += var10;
                    }
                } else {
                    int var26 = arg2 - arg0;
                    int var27 = arg0 - arg4;
                    int var28 = this.field3787 * arg4;
                    while (true) {
                        var27--;
                        if (var27 < 0) {
                            while (true) {
                                var26--;
                                if (var26 < 0) {
                                    return;
                                }
                                class590.method3411(this.field3793, var20 >> 16, 0, var28, var22 >> 16, (byte) 51);
                                var20 += var8;
                                var22 += var9;
                                var28 += this.field3787;
                            }
                        }
                        class590.method3411(this.field3793, var20 >> 16, 0, var28, var21 >> 16, (byte) 51);
                        var20 += var8;
                        var21 += var10;
                        var28 += this.field3787;
                    }
                }
            }
        } else if (arg0 >= arg2) {
            if (arg4 <= arg0) {
                int var29;
                int var30 = var29 = arg5 << 16;
                if (arg2 < 0) {
                    var30 -= arg2 * var8;
                    var29 -= arg2 * var9;
                    arg2 = 0;
                }
                int var31 = arg6 << 16;
                if (arg4 < 0) {
                    var31 -= arg4 * var10;
                    arg4 = 0;
                }
                if (var8 < var9) {
                    int var32 = arg0 - arg4;
                    int var33 = arg4 - arg2;
                    int var34 = this.field3787 * arg2;
                    while (true) {
                        var33--;
                        if (var33 < 0) {
                            while (true) {
                                var32--;
                                if (var32 < 0) {
                                    return;
                                }
                                class590.method3411(this.field3793, var31 >> 16, 0, var34, var29 >> 16, (byte) 51);
                                var34 += this.field3787;
                                var29 += var9;
                                var31 += var10;
                            }
                        }
                        class590.method3411(this.field3793, var30 >> 16, 0, var34, var29 >> 16, (byte) 51);
                        var34 += this.field3787;
                        var30 += var8;
                        var29 += var9;
                    }
                } else {
                    int var35 = arg0 - arg4;
                    int var36 = arg4 - arg2;
                    int var37 = this.field3787 * arg2;
                    while (true) {
                        var36--;
                        if (var36 < 0) {
                            while (true) {
                                var35--;
                                if (var35 < 0) {
                                    return;
                                }
                                class590.method3411(this.field3793, var29 >> 16, 0, var37, var31 >> 16, (byte) 51);
                                var37 += this.field3787;
                                var31 += var10;
                                var29 += var9;
                            }
                        }
                        class590.method3411(this.field3793, var29 >> 16, 0, var37, var30 >> 16, (byte) 51);
                        var30 += var8;
                        var37 += this.field3787;
                        var29 += var9;
                    }
                }
            } else {
                int var38;
                int var39 = var38 = arg5 << 16;
                int var40 = arg1 << 16;
                if (arg2 < 0) {
                    var39 -= arg2 * var8;
                    var38 -= arg2 * var9;
                    arg2 = 0;
                }
                if (arg0 < 0) {
                    var40 -= arg0 * var10;
                    arg0 = 0;
                }
                if (arg0 != arg2 && var8 < var9 || arg0 == arg2 && var8 > var10) {
                    int var41 = arg4 - arg0;
                    int var42 = arg0 - arg2;
                    int var43 = this.field3787 * arg2;
                    while (true) {
                        var42--;
                        if (var42 < 0) {
                            while (true) {
                                var41--;
                                if (var41 < 0) {
                                    return;
                                }
                                class590.method3411(this.field3793, var39 >> 16, 0, var43, var40 >> 16, (byte) 51);
                                var40 += var10;
                                var43 += this.field3787;
                                var39 += var8;
                            }
                        }
                        class590.method3411(this.field3793, var39 >> 16, 0, var43, var38 >> 16, (byte) 51);
                        var43 += this.field3787;
                        var38 += var9;
                        var39 += var8;
                    }
                } else {
                    int var44 = arg4 - arg0;
                    int var45 = arg0 - arg2;
                    int var46 = this.field3787 * arg2;
                    while (true) {
                        var45--;
                        if (var45 < 0) {
                            while (true) {
                                var44--;
                                if (var44 < 0) {
                                    return;
                                }
                                class590.method3411(this.field3793, var40 >> 16, 0, var46, var39 >> 16, (byte) 51);
                                var39 += var8;
                                var40 += var10;
                                var46 += this.field3787;
                            }
                        }
                        class590.method3411(this.field3793, var38 >> 16, 0, var46, var39 >> 16, (byte) 51);
                        var46 += this.field3787;
                        var39 += var8;
                        var38 += var9;
                    }
                }
            }
        } else if (arg4 >= arg2) {
            int var47;
            int var48 = var47 = arg1 << 16;
            if (arg0 < 0) {
                var47 -= arg0 * var10;
                var48 -= arg0 * var9;
                arg0 = 0;
            }
            int var49 = arg5 << 16;
            if (arg2 < 0) {
                var49 -= arg2 * var8;
                arg2 = 0;
            }
            if (var9 >= var10) {
                int var50 = arg4 - arg2;
                int var51 = arg2 - arg0;
                int var52 = this.field3787 * arg0;
                while (true) {
                    var51--;
                    if (var51 < 0) {
                        while (true) {
                            var50--;
                            if (var50 < 0) {
                                return;
                            }
                            class590.method3411(this.field3793, var47 >> 16, 0, var52, var49 >> 16, (byte) 51);
                            var47 += var10;
                            var49 += var8;
                            var52 += this.field3787;
                        }
                    }
                    class590.method3411(this.field3793, var47 >> 16, 0, var52, var48 >> 16, (byte) 51);
                    var52 += this.field3787;
                    var48 += var9;
                    var47 += var10;
                }
            } else {
                int var53 = arg4 - arg2;
                int var54 = arg2 - arg0;
                int var55 = this.field3787 * arg0;
                while (true) {
                    var54--;
                    if (var54 < 0) {
                        while (true) {
                            var53--;
                            if (var53 < 0) {
                                return;
                            }
                            class590.method3411(this.field3793, var49 >> 16, 0, var55, var47 >> 16, (byte) 51);
                            var47 += var10;
                            var55 += this.field3787;
                            var49 += var8;
                        }
                    }
                    class590.method3411(this.field3793, var48 >> 16, 0, var55, var47 >> 16, (byte) 51);
                    var48 += var9;
                    var55 += this.field3787;
                    var47 += var10;
                }
            }
        } else {
            int var56;
            int var57 = var56 = arg1 << 16;
            int var58 = arg6 << 16;
            if (arg0 < 0) {
                var56 -= arg0 * var10;
                var57 -= arg0 * var9;
                arg0 = 0;
            }
            if (arg4 < 0) {
                var58 -= arg4 * var8;
                arg4 = 0;
            }
            if (var9 < var10) {
                int var59 = arg2 - arg4;
                int var60 = arg4 - arg0;
                int var61 = this.field3787 * arg0;
                while (true) {
                    var60--;
                    if (var60 < 0) {
                        while (true) {
                            var59--;
                            if (var59 < 0) {
                                return;
                            }
                            class590.method3411(this.field3793, var57 >> 16, 0, var61, var58 >> 16, (byte) 51);
                            var61 += this.field3787;
                            var58 += var8;
                            var57 += var9;
                        }
                    }
                    class590.method3411(this.field3793, var57 >> 16, 0, var61, var56 >> 16, (byte) 51);
                    var61 += this.field3787;
                    var57 += var9;
                    var56 += var10;
                }
            } else {
                int var62 = arg2 - arg4;
                int var63 = arg4 - arg0;
                int var64 = this.field3787 * arg0;
                while (true) {
                    var63--;
                    if (var63 < 0) {
                        while (true) {
                            var62--;
                            if (var62 < 0) {
                                return;
                            }
                            class590.method3411(this.field3793, var58 >> 16, 0, var64, var57 >> 16, (byte) 51);
                            var57 += var9;
                            var64 += this.field3787;
                            var58 += var8;
                        }
                    }
                    class590.method3411(this.field3793, var56 >> 16, 0, var64, var57 >> 16, (byte) 51);
                    var56 += var10;
                    var64 += this.field3787;
                    var57 += var9;
                }
            }
        }
    }

    @OriginalMember(owner = "client!oca", name = "<init>", descriptor = "(Lwh;II)V", line = 533)
    public class265(class148 arg0, int arg1, int arg2) {
        this.field3793 = new byte[arg1 * arg2];
    }
}
