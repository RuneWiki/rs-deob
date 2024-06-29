import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class684 extends class706 {

    @OriginalMember(owner = "client!tj", name = "G", descriptor = "[B")
    public byte[] field9678;

    @OriginalMember(owner = "client!tj", name = "z", descriptor = "Lcb;")
    public static class631 field9671 = new class631(77, 2);

    @OriginalMember(owner = "client!tj", name = "A", descriptor = "I")
    public static int field9672;

    @OriginalMember(owner = "client!tj", name = "B", descriptor = "I")
    public int field9673;

    @OriginalMember(owner = "client!tj", name = "C", descriptor = "I")
    public int field9674;

    @OriginalMember(owner = "client!tj", name = "D", descriptor = "I")
    public static int field9675;

    @OriginalMember(owner = "client!tj", name = "E", descriptor = "I")
    public static int field9676;

    @OriginalMember(owner = "client!tj", name = "F", descriptor = "I")
    public int field9677;

    @OriginalMember(owner = "client!tj", name = "H", descriptor = "I")
    public static int field9679;

    @OriginalMember(owner = "client!tj", name = "J", descriptor = "I")
    public int field9680;

    @OriginalMember(owner = "client!tj", name = "K", descriptor = "I")
    public static int field9681;

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(I)V")
    public final void method3814(int arg0) {
        field9681++;
        if (arg0 < 31) {
            this.field9673 = 49;
        }
        int var2 = -1;
        int var3 = this.field9678.length - 8;
        while (var2 < var3) {
            var2++;
            this.field9678[var2] = 0;
            var2++;
            this.field9678[var2] = 0;
            var2++;
            this.field9678[var2] = 0;
            var2++;
            this.field9678[var2] = 0;
            var2++;
            this.field9678[var2] = 0;
            var2++;
            this.field9678[var2] = 0;
            var2++;
            this.field9678[var2] = 0;
            var2++;
            this.field9678[var2] = 0;
        }
        while (var2 < this.field9678.length - 1) {
            var2++;
            this.field9678[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "(I)V")
    public static void method3815(int arg0) {
        if (arg0 == 1488794224) {
            field9671 = null;
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIIII)V")
    public final void method3816(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 != 1598) {
            this.method3818(58, 4, 106, -10, -65, 97, 74);
        }
        this.field9677 = arg3;
        field9676++;
        this.field9674 = arg0 - arg1;
        this.field9680 = arg2 - arg3;
        this.field9673 = arg1;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Lbfa;B)I")
    public static final int method3817(class573 arg0, byte arg1) {
        field9675++;
        int var2 = arg0.field8118;
        if (arg1 > -96) {
            field9671 = null;
        }
        class228 var3 = arg0.method885(-83);
        if (arg0.field1679 == -1 || arg0.field1598) {
            var2 = arg0.field8117;
        } else if (arg0.field1679 == var3.field3660 || arg0.field1679 == var3.field3653 || arg0.field1679 == var3.field3670 || arg0.field1679 == var3.field3662) {
            var2 = arg0.field8144;
        } else if (arg0.field1679 == var3.field3661 || arg0.field1679 == var3.field3656 || arg0.field1679 == var3.field3689 || arg0.field1679 == var3.field3699) {
            var2 = arg0.field8115;
        }
        return var2;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIIIIII)V")
    public final void method3818(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = -106 % ((-arg1 - 1) / 58);
        field9672++;
        int var9 = 0;
        if (arg2 != arg4) {
            var9 = (arg5 - arg6 << 16) / (arg4 - arg2);
        }
        int var10 = 0;
        if (arg3 != arg4) {
            var10 = (arg0 - arg5 << 16) / (arg3 - arg4);
        }
        int var11 = 0;
        if (arg2 != arg3) {
            var11 = (arg6 - arg0 << 16) / (arg2 - arg3);
        }
        if (arg4 >= arg2 && arg3 >= arg2) {
            if (arg3 > arg4) {
                int var12;
                int var13 = var12 = arg6 << 16;
                int var14 = arg5 << 16;
                if (arg2 < 0) {
                    var13 -= arg2 * var11;
                    var12 -= arg2 * var9;
                    arg2 = 0;
                }
                if (arg4 < 0) {
                    var14 -= arg4 * var10;
                    arg4 = 0;
                }
                if ((arg2 == arg4 || var11 >= var9) && (arg2 != arg4 || var11 <= var10)) {
                    int var18 = arg3 - arg4;
                    int var19 = arg4 - arg2;
                    int var20 = this.field9674 * arg2;
                    while (true) {
                        var19--;
                        if (var19 < 0) {
                            while (true) {
                                var18--;
                                if (var18 < 0) {
                                    return;
                                }
                                class30.method157(var14 >> 16, 0, 28626, var13 >> 16, var20, this.field9678);
                                var14 += var10;
                                var13 += var11;
                                var20 += this.field9674;
                            }
                        }
                        class30.method157(var12 >> 16, 0, 28626, var13 >> 16, var20, this.field9678);
                        var20 += this.field9674;
                        var13 += var11;
                        var12 += var9;
                    }
                } else {
                    int var15 = arg3 - arg4;
                    int var16 = arg4 - arg2;
                    int var17 = this.field9674 * arg2;
                    while (true) {
                        var16--;
                        if (var16 < 0) {
                            while (true) {
                                var15--;
                                if (var15 < 0) {
                                    return;
                                }
                                class30.method157(var13 >> 16, 0, 28626, var14 >> 16, var17, this.field9678);
                                var13 += var11;
                                var14 += var10;
                                var17 += this.field9674;
                            }
                        }
                        class30.method157(var13 >> 16, 0, 28626, var12 >> 16, var17, this.field9678);
                        var12 += var9;
                        var13 += var11;
                        var17 += this.field9674;
                    }
                }
            } else {
                int var21;
                int var22 = var21 = arg6 << 16;
                int var23 = arg0 << 16;
                if (arg2 < 0) {
                    var22 -= arg2 * var11;
                    var21 -= arg2 * var9;
                    arg2 = 0;
                }
                if (arg3 < 0) {
                    var23 -= arg3 * var10;
                    arg3 = 0;
                }
                if (arg2 != arg3 && var9 > var11 || arg2 == arg3 && var10 > var9) {
                    int var24 = arg4 - arg3;
                    int var25 = arg3 - arg2;
                    int var26 = this.field9674 * arg2;
                    while (true) {
                        var25--;
                        if (var25 < 0) {
                            while (true) {
                                var24--;
                                if (var24 < 0) {
                                    return;
                                }
                                class30.method157(var23 >> 16, 0, 28626, var21 >> 16, var26, this.field9678);
                                var26 += this.field9674;
                                var21 += var9;
                                var23 += var10;
                            }
                        }
                        class30.method157(var22 >> 16, 0, 28626, var21 >> 16, var26, this.field9678);
                        var26 += this.field9674;
                        var21 += var9;
                        var22 += var11;
                    }
                } else {
                    int var27 = arg4 - arg3;
                    int var28 = arg3 - arg2;
                    int var29 = this.field9674 * arg2;
                    while (true) {
                        var28--;
                        if (var28 < 0) {
                            while (true) {
                                var27--;
                                if (var27 < 0) {
                                    return;
                                }
                                class30.method157(var21 >> 16, 0, 28626, var23 >> 16, var29, this.field9678);
                                var29 += this.field9674;
                                var23 += var10;
                                var21 += var9;
                            }
                        }
                        class30.method157(var21 >> 16, 0, 28626, var22 >> 16, var29, this.field9678);
                        var21 += var9;
                        var29 += this.field9674;
                        var22 += var11;
                    }
                }
            }
        } else if (arg4 <= arg3) {
            if (arg2 > arg3) {
                int var30;
                int var31 = var30 = arg5 << 16;
                int var32 = arg0 << 16;
                if (arg4 < 0) {
                    var31 -= arg4 * var9;
                    var30 -= arg4 * var10;
                    arg4 = 0;
                }
                if (arg3 < 0) {
                    var32 -= arg3 * var11;
                    arg3 = 0;
                }
                if (arg3 != arg4 && var9 < var10 || arg3 == arg4 && var9 > var11) {
                    int var33 = arg2 - arg3;
                    int var34 = arg3 - arg4;
                    int var35 = this.field9674 * arg4;
                    while (true) {
                        var34--;
                        if (var34 < 0) {
                            while (true) {
                                var33--;
                                if (var33 < 0) {
                                    return;
                                }
                                class30.method157(var31 >> 16, 0, 28626, var32 >> 16, var35, this.field9678);
                                var31 += var9;
                                var32 += var11;
                                var35 += this.field9674;
                            }
                        }
                        class30.method157(var31 >> 16, 0, 28626, var30 >> 16, var35, this.field9678);
                        var35 += this.field9674;
                        var31 += var9;
                        var30 += var10;
                    }
                } else {
                    int var36 = arg2 - arg3;
                    int var37 = arg3 - arg4;
                    int var38 = this.field9674 * arg4;
                    while (true) {
                        var37--;
                        if (var37 < 0) {
                            while (true) {
                                var36--;
                                if (var36 < 0) {
                                    return;
                                }
                                class30.method157(var32 >> 16, 0, 28626, var31 >> 16, var38, this.field9678);
                                var38 += this.field9674;
                                var32 += var11;
                                var31 += var9;
                            }
                        }
                        class30.method157(var30 >> 16, 0, 28626, var31 >> 16, var38, this.field9678);
                        var31 += var9;
                        var38 += this.field9674;
                        var30 += var10;
                    }
                }
            } else {
                int var39;
                int var40 = var39 = arg5 << 16;
                int var41 = arg6 << 16;
                if (arg4 < 0) {
                    var40 -= arg4 * var9;
                    var39 -= arg4 * var10;
                    arg4 = 0;
                }
                if (arg2 < 0) {
                    var41 -= arg2 * var11;
                    arg2 = 0;
                }
                if (var10 > var9) {
                    int var42 = arg3 - arg2;
                    int var43 = arg2 - arg4;
                    int var44 = this.field9674 * arg4;
                    while (true) {
                        var43--;
                        if (var43 < 0) {
                            while (true) {
                                var42--;
                                if (var42 < 0) {
                                    return;
                                }
                                class30.method157(var41 >> 16, 0, 28626, var39 >> 16, var44, this.field9678);
                                var44 += this.field9674;
                                var39 += var10;
                                var41 += var11;
                            }
                        }
                        class30.method157(var40 >> 16, 0, 28626, var39 >> 16, var44, this.field9678);
                        var39 += var10;
                        var44 += this.field9674;
                        var40 += var9;
                    }
                } else {
                    int var45 = arg3 - arg2;
                    int var46 = arg2 - arg4;
                    int var47 = this.field9674 * arg4;
                    while (true) {
                        var46--;
                        if (var46 < 0) {
                            while (true) {
                                var45--;
                                if (var45 < 0) {
                                    return;
                                }
                                class30.method157(var39 >> 16, 0, 28626, var41 >> 16, var47, this.field9678);
                                var39 += var10;
                                var41 += var11;
                                var47 += this.field9674;
                            }
                        }
                        class30.method157(var39 >> 16, 0, 28626, var40 >> 16, var47, this.field9678);
                        var47 += this.field9674;
                        var39 += var10;
                        var40 += var9;
                    }
                }
            }
        } else if (arg4 <= arg2) {
            int var48;
            int var49 = var48 = arg0 << 16;
            if (arg3 < 0) {
                var49 -= arg3 * var10;
                var48 -= arg3 * var11;
                arg3 = 0;
            }
            int var50 = arg5 << 16;
            if (arg4 < 0) {
                var50 -= arg4 * var9;
                arg4 = 0;
            }
            if (var11 > var10) {
                int var51 = arg2 - arg4;
                int var52 = arg4 - arg3;
                int var53 = this.field9674 * arg3;
                while (true) {
                    var52--;
                    if (var52 < 0) {
                        while (true) {
                            var51--;
                            if (var51 < 0) {
                                return;
                            }
                            class30.method157(var50 >> 16, 0, 28626, var48 >> 16, var53, this.field9678);
                            var50 += var9;
                            var53 += this.field9674;
                            var48 += var11;
                        }
                    }
                    class30.method157(var49 >> 16, 0, 28626, var48 >> 16, var53, this.field9678);
                    var48 += var11;
                    var49 += var10;
                    var53 += this.field9674;
                }
            } else {
                int var54 = arg2 - arg4;
                int var55 = arg4 - arg3;
                int var56 = this.field9674 * arg3;
                while (true) {
                    var55--;
                    if (var55 < 0) {
                        while (true) {
                            var54--;
                            if (var54 < 0) {
                                return;
                            }
                            class30.method157(var48 >> 16, 0, 28626, var50 >> 16, var56, this.field9678);
                            var56 += this.field9674;
                            var50 += var9;
                            var48 += var11;
                        }
                    }
                    class30.method157(var48 >> 16, 0, 28626, var49 >> 16, var56, this.field9678);
                    var48 += var11;
                    var56 += this.field9674;
                    var49 += var10;
                }
            }
        } else {
            int var57;
            int var58 = var57 = arg0 << 16;
            int var59 = arg6 << 16;
            if (arg3 < 0) {
                var58 -= arg3 * var10;
                var57 -= arg3 * var11;
                arg3 = 0;
            }
            if (arg2 < 0) {
                var59 -= arg2 * var9;
                arg2 = 0;
            }
            if (var10 < var11) {
                int var60 = arg4 - arg2;
                int var61 = arg2 - arg3;
                int var62 = this.field9674 * arg3;
                while (true) {
                    var61--;
                    if (var61 < 0) {
                        while (true) {
                            var60--;
                            if (var60 < 0) {
                                return;
                            }
                            class30.method157(var58 >> 16, 0, 28626, var59 >> 16, var62, this.field9678);
                            var59 += var9;
                            var58 += var10;
                            var62 += this.field9674;
                        }
                    }
                    class30.method157(var58 >> 16, 0, 28626, var57 >> 16, var62, this.field9678);
                    var58 += var10;
                    var62 += this.field9674;
                    var57 += var11;
                }
            } else {
                int var63 = arg4 - arg2;
                int var64 = arg2 - arg3;
                int var65 = this.field9674 * arg3;
                while (true) {
                    var64--;
                    if (var64 < 0) {
                        while (true) {
                            var63--;
                            if (var63 < 0) {
                                return;
                            }
                            class30.method157(var59 >> 16, 0, 28626, var58 >> 16, var65, this.field9678);
                            var65 += this.field9674;
                            var58 += var10;
                            var59 += var9;
                        }
                    }
                    class30.method157(var57 >> 16, 0, 28626, var58 >> 16, var65, this.field9678);
                    var57 += var11;
                    var65 += this.field9674;
                    var58 += var10;
                }
            }
        }
    }

    @OriginalMember(owner = "client!tj", name = "<init>", descriptor = "(Lpj;II)V")
    public class684(class38 arg0, int arg1, int arg2) {
        this.field9678 = new byte[arg1 * arg2];
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(III)Z")
    public final boolean method3819(int arg0, int arg1, int arg2) {
        field9679++;
        if (arg1 == 0) {
            return this.field9678.length >= (arg0 * arg2);
        } else {
            return false;
        }
    }
}
