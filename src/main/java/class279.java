import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!un")
public class class279 extends class452 {

    @OriginalMember(owner = "client!un", name = "C", descriptor = "[B")
    public byte[] field4238;

    @OriginalMember(owner = "client!un", name = "J", descriptor = "[I")
    public static int[] field4245 = new int[8];

    @OriginalMember(owner = "client!un", name = "I", descriptor = "Luu;")
    public static class180 field4244 = null;

    @OriginalMember(owner = "client!un", name = "H", descriptor = "Z")
    public static boolean field4243 = false;

    @OriginalMember(owner = "client!un", name = "K", descriptor = "[I")
    public static int[] field4246 = new int[5];

    @OriginalMember(owner = "client!un", name = "x", descriptor = "I")
    public int field4233;

    @OriginalMember(owner = "client!un", name = "y", descriptor = "I")
    public static int field4234;

    @OriginalMember(owner = "client!un", name = "z", descriptor = "I")
    public static int field4235;

    @OriginalMember(owner = "client!un", name = "A", descriptor = "I")
    public static int field4236;

    @OriginalMember(owner = "client!un", name = "B", descriptor = "I")
    public int field4237;

    @OriginalMember(owner = "client!un", name = "D", descriptor = "I")
    public static int field4239;

    @OriginalMember(owner = "client!un", name = "E", descriptor = "I")
    public static int field4240;

    @OriginalMember(owner = "client!un", name = "F", descriptor = "I")
    public int field4241;

    @OriginalMember(owner = "client!un", name = "G", descriptor = "I")
    public int field4242;

    @OriginalMember(owner = "client!un", name = "d", descriptor = "(B)V")
    public final void method1706(byte arg0) {
        field4234++;
        if (arg0 != 0) {
            field4246 = null;
        }
        int var2 = -1;
        int var3 = this.field4238.length - 8;
        while (var2 < var3) {
            var2++;
            this.field4238[var2] = 0;
            var2++;
            this.field4238[var2] = 0;
            var2++;
            this.field4238[var2] = 0;
            var2++;
            this.field4238[var2] = 0;
            var2++;
            this.field4238[var2] = 0;
            var2++;
            this.field4238[var2] = 0;
            var2++;
            this.field4238[var2] = 0;
            var2++;
            this.field4238[var2] = 0;
        }
        while (var2 < this.field4238.length - 1) {
            var2++;
            this.field4238[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!un", name = "g", descriptor = "(I)V")
    public static void method1707(int arg0) {
        field4245 = null;
        int var1 = -11 % ((arg0 + 68) / 46);
        field4246 = null;
        field4244 = null;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(III)Z")
    public final boolean method1708(int arg0, int arg1, int arg2) {
        field4236++;
        if (arg2 >= -109) {
            return true;
        } else {
            return (arg0 * arg1) <= this.field4238.length;
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(IIIBIII)V")
    public final void method1709(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        field4240++;
        int var8 = 0;
        if (arg4 != arg5) {
            var8 = (arg6 - arg1 << 16) / (arg4 - arg5);
        }
        if (arg3 != -1) {
            return;
        }
        int var9 = 0;
        if (arg2 != arg4) {
            var9 = (arg0 - arg6 << 16) / (arg2 - arg4);
        }
        int var10 = 0;
        if (arg2 != arg5) {
            var10 = (arg1 - arg0 << 16) / (arg5 - arg2);
        }
        if (arg4 >= arg5 && arg2 >= arg5) {
            if (arg2 <= arg4) {
                int var11;
                int var12 = var11 = arg1 << 16;
                int var13 = arg0 << 16;
                if (arg5 < 0) {
                    var11 -= arg5 * var8;
                    var12 -= arg5 * var10;
                    arg5 = 0;
                }
                if (arg2 < 0) {
                    var13 -= arg2 * var9;
                    arg2 = 0;
                }
                if (arg2 != arg5 && var8 > var10 || arg2 == arg5 && var9 > var8) {
                    int var14 = arg4 - arg2;
                    int var15 = arg2 - arg5;
                    int var16 = this.field4237 * arg5;
                    while (true) {
                        var15--;
                        if (var15 < 0) {
                            while (true) {
                                var14--;
                                if (var14 < 0) {
                                    return;
                                }
                                class147.method960(var13 >> 16, var16, 0, this.field4238, 102, var11 >> 16);
                                var11 += var8;
                                var13 += var9;
                                var16 += this.field4237;
                            }
                        }
                        class147.method960(var12 >> 16, var16, 0, this.field4238, arg3 ^ 0xFFFFFF8E, var11 >> 16);
                        var12 += var10;
                        var11 += var8;
                        var16 += this.field4237;
                    }
                } else {
                    int var17 = arg4 - arg2;
                    int var18 = arg2 - arg5;
                    int var19 = this.field4237 * arg5;
                    while (true) {
                        var18--;
                        if (var18 < 0) {
                            while (true) {
                                var17--;
                                if (var17 < 0) {
                                    return;
                                }
                                class147.method960(var11 >> 16, var19, 0, this.field4238, 99, var13 >> 16);
                                var11 += var8;
                                var19 += this.field4237;
                                var13 += var9;
                            }
                        }
                        class147.method960(var11 >> 16, var19, 0, this.field4238, arg3 + 118, var12 >> 16);
                        var11 += var8;
                        var12 += var10;
                        var19 += this.field4237;
                    }
                }
            } else {
                int var20;
                int var21 = var20 = arg1 << 16;
                int var22 = arg6 << 16;
                if (arg5 < 0) {
                    var20 -= arg5 * var8;
                    var21 -= arg5 * var10;
                    arg5 = 0;
                }
                if (arg4 < 0) {
                    var22 -= arg4 * var9;
                    arg4 = 0;
                }
                if (arg4 != arg5 && var10 < var8 || arg4 == arg5 && var10 > var9) {
                    int var23 = arg2 - arg4;
                    int var24 = arg4 - arg5;
                    int var25 = this.field4237 * arg5;
                    while (true) {
                        var24--;
                        if (var24 < 0) {
                            while (true) {
                                var23--;
                                if (var23 < 0) {
                                    return;
                                }
                                class147.method960(var21 >> 16, var25, 0, this.field4238, 99, var22 >> 16);
                                var21 += var10;
                                var22 += var9;
                                var25 += this.field4237;
                            }
                        }
                        class147.method960(var21 >> 16, var25, 0, this.field4238, arg3 + 118, var20 >> 16);
                        var25 += this.field4237;
                        var20 += var8;
                        var21 += var10;
                    }
                } else {
                    int var26 = arg2 - arg4;
                    int var27 = arg4 - arg5;
                    int var28 = this.field4237 * arg5;
                    while (true) {
                        var27--;
                        if (var27 < 0) {
                            while (true) {
                                var26--;
                                if (var26 < 0) {
                                    return;
                                }
                                class147.method960(var22 >> 16, var28, 0, this.field4238, 104, var21 >> 16);
                                var28 += this.field4237;
                                var22 += var9;
                                var21 += var10;
                            }
                        }
                        class147.method960(var20 >> 16, var28, 0, this.field4238, 118, var21 >> 16);
                        var21 += var10;
                        var20 += var8;
                        var28 += this.field4237;
                    }
                }
            }
        } else if (arg4 <= arg2) {
            if (arg2 >= arg5) {
                int var29;
                int var30 = var29 = arg6 << 16;
                if (arg4 < 0) {
                    var30 -= arg4 * var8;
                    var29 -= arg4 * var9;
                    arg4 = 0;
                }
                int var31 = arg1 << 16;
                if (arg5 < 0) {
                    var31 -= arg5 * var10;
                    arg5 = 0;
                }
                if (var9 <= var8) {
                    int var32 = arg2 - arg5;
                    int var33 = arg5 - arg4;
                    int var34 = this.field4237 * arg4;
                    while (true) {
                        var33--;
                        if (var33 < 0) {
                            while (true) {
                                var32--;
                                if (var32 < 0) {
                                    return;
                                }
                                class147.method960(var29 >> 16, var34, 0, this.field4238, 108, var31 >> 16);
                                var29 += var9;
                                var34 += this.field4237;
                                var31 += var10;
                            }
                        }
                        class147.method960(var29 >> 16, var34, 0, this.field4238, arg3 + 128, var30 >> 16);
                        var30 += var8;
                        var29 += var9;
                        var34 += this.field4237;
                    }
                } else {
                    int var35 = arg2 - arg5;
                    int var36 = arg5 - arg4;
                    int var37 = this.field4237 * arg4;
                    while (true) {
                        var36--;
                        if (var36 < 0) {
                            while (true) {
                                var35--;
                                if (var35 < 0) {
                                    return;
                                }
                                class147.method960(var31 >> 16, var37, 0, this.field4238, 122, var29 >> 16);
                                var29 += var9;
                                var37 += this.field4237;
                                var31 += var10;
                            }
                        }
                        class147.method960(var30 >> 16, var37, 0, this.field4238, 117, var29 >> 16);
                        var30 += var8;
                        var29 += var9;
                        var37 += this.field4237;
                    }
                }
            } else {
                int var38;
                int var39 = var38 = arg6 << 16;
                if (arg4 < 0) {
                    var38 -= arg4 * var9;
                    var39 -= arg4 * var8;
                    arg4 = 0;
                }
                int var40 = arg0 << 16;
                if (arg2 < 0) {
                    var40 -= arg2 * var10;
                    arg2 = 0;
                }
                if ((arg2 == arg4 || var9 <= var8) && (arg2 != arg4 || var8 <= var10)) {
                    int var44 = arg5 - arg2;
                    int var45 = arg2 - arg4;
                    int var46 = this.field4237 * arg4;
                    while (true) {
                        var45--;
                        if (var45 < 0) {
                            while (true) {
                                var44--;
                                if (var44 < 0) {
                                    return;
                                }
                                class147.method960(var40 >> 16, var46, 0, this.field4238, arg3 ^ 0xFFFFFF86, var39 >> 16);
                                var40 += var10;
                                var46 += this.field4237;
                                var39 += var8;
                            }
                        }
                        class147.method960(var38 >> 16, var46, 0, this.field4238, 114, var39 >> 16);
                        var46 += this.field4237;
                        var38 += var9;
                        var39 += var8;
                    }
                } else {
                    int var41 = arg5 - arg2;
                    int var42 = arg2 - arg4;
                    int var43 = this.field4237 * arg4;
                    while (true) {
                        var42--;
                        if (var42 < 0) {
                            while (true) {
                                var41--;
                                if (var41 < 0) {
                                    return;
                                }
                                class147.method960(var39 >> 16, var43, 0, this.field4238, 109, var40 >> 16);
                                var40 += var10;
                                var39 += var8;
                                var43 += this.field4237;
                            }
                        }
                        class147.method960(var39 >> 16, var43, 0, this.field4238, 112, var38 >> 16);
                        var43 += this.field4237;
                        var38 += var9;
                        var39 += var8;
                    }
                }
            }
        } else if (arg4 > arg5) {
            int var47;
            int var48 = var47 = arg0 << 16;
            int var49 = arg1 << 16;
            if (arg2 < 0) {
                var47 -= arg2 * var10;
                var48 -= arg2 * var9;
                arg2 = 0;
            }
            if (arg5 < 0) {
                var49 -= arg5 * var8;
                arg5 = 0;
            }
            if (var10 > var9) {
                int var50 = arg4 - arg5;
                int var51 = arg5 - arg2;
                int var52 = this.field4237 * arg2;
                while (true) {
                    var51--;
                    if (var51 < 0) {
                        while (true) {
                            var50--;
                            if (var50 < 0) {
                                return;
                            }
                            class147.method960(var48 >> 16, var52, 0, this.field4238, 118, var49 >> 16);
                            var52 += this.field4237;
                            var48 += var9;
                            var49 += var8;
                        }
                    }
                    class147.method960(var48 >> 16, var52, 0, this.field4238, 119, var47 >> 16);
                    var48 += var9;
                    var47 += var10;
                    var52 += this.field4237;
                }
            } else {
                int var53 = arg4 - arg5;
                int var54 = arg5 - arg2;
                int var55 = this.field4237 * arg2;
                while (true) {
                    var54--;
                    if (var54 < 0) {
                        while (true) {
                            var53--;
                            if (var53 < 0) {
                                return;
                            }
                            class147.method960(var49 >> 16, var55, 0, this.field4238, 123, var48 >> 16);
                            var48 += var9;
                            var55 += this.field4237;
                            var49 += var8;
                        }
                    }
                    class147.method960(var47 >> 16, var55, 0, this.field4238, 102, var48 >> 16);
                    var55 += this.field4237;
                    var47 += var10;
                    var48 += var9;
                }
            }
        } else {
            int var56;
            int var57 = var56 = arg0 << 16;
            if (arg2 < 0) {
                var57 -= arg2 * var9;
                var56 -= arg2 * var10;
                arg2 = 0;
            }
            int var58 = arg6 << 16;
            if (arg4 < 0) {
                var58 -= arg4 * var8;
                arg4 = 0;
            }
            if (var10 <= var9) {
                int var59 = arg5 - arg4;
                int var60 = arg4 - arg2;
                int var61 = this.field4237 * arg2;
                while (true) {
                    var60--;
                    if (var60 < 0) {
                        while (true) {
                            var59--;
                            if (var59 < 0) {
                                return;
                            }
                            class147.method960(var56 >> 16, var61, 0, this.field4238, arg3 ^ 0xFFFFFF99, var58 >> 16);
                            var58 += var8;
                            var61 += this.field4237;
                            var56 += var10;
                        }
                    }
                    class147.method960(var56 >> 16, var61, 0, this.field4238, 122, var57 >> 16);
                    var61 += this.field4237;
                    var56 += var10;
                    var57 += var9;
                }
            } else {
                int var62 = arg5 - arg4;
                int var63 = arg4 - arg2;
                int var64 = this.field4237 * arg2;
                while (true) {
                    var63--;
                    if (var63 < 0) {
                        while (true) {
                            var62--;
                            if (var62 < 0) {
                                return;
                            }
                            class147.method960(var58 >> 16, var64, 0, this.field4238, 126, var56 >> 16);
                            var58 += var8;
                            var56 += var10;
                            var64 += this.field4237;
                        }
                    }
                    class147.method960(var57 >> 16, var64, 0, this.field4238, arg3 + 102, var56 >> 16);
                    var56 += var10;
                    var64 += this.field4237;
                    var57 += var9;
                }
            }
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(IIIII)V")
    public final void method1710(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4235++;
        this.field4233 = arg3;
        this.field4241 = arg0 - arg3;
        if (arg4 != 0) {
            this.method1709(-88, -94, 97, (byte) -75, 106, 112, 62);
        }
        this.field4237 = arg2 - arg1;
        this.field4242 = arg1;
    }

    @OriginalMember(owner = "client!un", name = "<init>", descriptor = "(Lbl;II)V")
    public class279(class442 arg0, int arg1, int arg2) {
        this.field4238 = new byte[arg1 * arg2];
    }
}
