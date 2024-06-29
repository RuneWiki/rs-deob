import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class28 extends class184 {

    @OriginalMember(owner = "client!uc", name = "M", descriptor = "[B")
    public byte[] field751;

    @OriginalMember(owner = "client!uc", name = "J", descriptor = "I")
    public static int field748 = 0;

    @OriginalMember(owner = "client!uc", name = "S", descriptor = "Luh;")
    public static class168 field757 = new class168();

    @OriginalMember(owner = "client!uc", name = "G", descriptor = "I")
    public static int field746;

    @OriginalMember(owner = "client!uc", name = "H", descriptor = "I")
    public int field747;

    @OriginalMember(owner = "client!uc", name = "K", descriptor = "I")
    public int field749;

    @OriginalMember(owner = "client!uc", name = "L", descriptor = "I")
    public static int field750;

    @OriginalMember(owner = "client!uc", name = "N", descriptor = "I")
    public int field752;

    @OriginalMember(owner = "client!uc", name = "P", descriptor = "I")
    public int field754;

    @OriginalMember(owner = "client!uc", name = "Q", descriptor = "I")
    public static int field755;

    @OriginalMember(owner = "client!uc", name = "R", descriptor = "I")
    public static int field756;

    @OriginalMember(owner = "client!uc", name = "O", descriptor = "Ltu;")
    public static class350 field753;

    @OriginalMember(owner = "client!uc", name = "F", descriptor = "Lin;")
    public static class91 field745;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIIII)V", line = 5)
    public final void method393(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field749 = arg2;
        this.field754 = arg4;
        field746++;
        this.field752 = arg0 - arg2;
        if (arg3 == 25053) {
            this.field747 = arg1 - arg4;
        }
    }

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "(B)V", line = 23)
    public final void method394(byte arg0) {
        field750++;
        int var2 = -1;
        int var3 = this.field751.length - 8;
        while (var2 < var3) {
            var2++;
            this.field751[var2] = 0;
            var2++;
            this.field751[var2] = 0;
            var2++;
            this.field751[var2] = 0;
            var2++;
            this.field751[var2] = 0;
            var2++;
            this.field751[var2] = 0;
            var2++;
            this.field751[var2] = 0;
            var2++;
            this.field751[var2] = 0;
            var2++;
            this.field751[var2] = 0;
        }
        if (arg0 == 0) {
            while ((this.field751.length - 1) > var2) {
                var2++;
                this.field751[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIIIIII)V", line = 53)
    public final void method395(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field756++;
        int var8 = 0;
        if (arg2 != arg6) {
            var8 = (arg4 - arg1 << 16) / (arg6 - arg2);
        }
        int var9 = 71 % ((-arg3 - 38) / 52);
        int var10 = 0;
        if (arg5 != arg6) {
            var10 = (arg0 - arg4 << 16) / (arg5 - arg6);
        }
        int var11 = 0;
        if (arg2 != arg5) {
            var11 = (arg1 - arg0 << 16) / (arg2 - arg5);
        }
        if (arg6 >= arg2 && arg2 <= arg5) {
            if (arg6 < arg5) {
                int var12;
                int var13 = var12 = arg1 << 16;
                if (arg2 < 0) {
                    var13 -= arg2 * var11;
                    var12 -= arg2 * var8;
                    arg2 = 0;
                }
                int var14 = arg4 << 16;
                if (arg6 < 0) {
                    var14 -= arg6 * var10;
                    arg6 = 0;
                }
                if ((arg2 == arg6 || var11 >= var8) && (arg2 != arg6 || var11 <= var10)) {
                    int var18 = arg5 - arg6;
                    int var19 = arg6 - arg2;
                    int var20 = this.field747 * arg2;
                    while (true) {
                        var19--;
                        if (var19 < 0) {
                            while (true) {
                                var18--;
                                if (var18 < 0) {
                                    return;
                                }
                                class169.method1278(var14 >> 16, var20, -104, 0, this.field751, var13 >> 16);
                                var13 += var11;
                                var20 += this.field747;
                                var14 += var10;
                            }
                        }
                        class169.method1278(var12 >> 16, var20, -36, 0, this.field751, var13 >> 16);
                        var12 += var8;
                        var20 += this.field747;
                        var13 += var11;
                    }
                } else {
                    int var15 = arg5 - arg6;
                    int var16 = arg6 - arg2;
                    int var17 = this.field747 * arg2;
                    while (true) {
                        var16--;
                        if (var16 < 0) {
                            while (true) {
                                var15--;
                                if (var15 < 0) {
                                    return;
                                }
                                class169.method1278(var13 >> 16, var17, -120, 0, this.field751, var14 >> 16);
                                var14 += var10;
                                var17 += this.field747;
                                var13 += var11;
                            }
                        }
                        class169.method1278(var13 >> 16, var17, -111, 0, this.field751, var12 >> 16);
                        var17 += this.field747;
                        var13 += var11;
                        var12 += var8;
                    }
                }
            } else {
                int var21;
                int var22 = var21 = arg1 << 16;
                if (arg2 < 0) {
                    var21 -= arg2 * var8;
                    var22 -= arg2 * var11;
                    arg2 = 0;
                }
                int var23 = arg0 << 16;
                if (arg5 < 0) {
                    var23 -= arg5 * var10;
                    arg5 = 0;
                }
                if (arg2 != arg5 && var8 > var11 || arg2 == arg5 && var10 > var8) {
                    int var24 = arg6 - arg5;
                    int var25 = arg5 - arg2;
                    int var26 = this.field747 * arg2;
                    while (true) {
                        var25--;
                        if (var25 < 0) {
                            while (true) {
                                var24--;
                                if (var24 < 0) {
                                    return;
                                }
                                class169.method1278(var23 >> 16, var26, -92, 0, this.field751, var21 >> 16);
                                var23 += var10;
                                var21 += var8;
                                var26 += this.field747;
                            }
                        }
                        class169.method1278(var22 >> 16, var26, -102, 0, this.field751, var21 >> 16);
                        var26 += this.field747;
                        var22 += var11;
                        var21 += var8;
                    }
                } else {
                    int var27 = arg6 - arg5;
                    int var28 = arg5 - arg2;
                    int var29 = this.field747 * arg2;
                    while (true) {
                        var28--;
                        if (var28 < 0) {
                            while (true) {
                                var27--;
                                if (var27 < 0) {
                                    return;
                                }
                                class169.method1278(var21 >> 16, var29, -62, 0, this.field751, var23 >> 16);
                                var29 += this.field747;
                                var21 += var8;
                                var23 += var10;
                            }
                        }
                        class169.method1278(var21 >> 16, var29, -75, 0, this.field751, var22 >> 16);
                        var22 += var11;
                        var29 += this.field747;
                        var21 += var8;
                    }
                }
            }
        } else if (arg6 > arg5) {
            if (arg6 <= arg2) {
                int var30;
                int var31 = var30 = arg0 << 16;
                int var32 = arg4 << 16;
                if (arg5 < 0) {
                    var30 -= arg5 * var11;
                    var31 -= arg5 * var10;
                    arg5 = 0;
                }
                if (arg6 < 0) {
                    var32 -= arg6 * var8;
                    arg6 = 0;
                }
                if (var10 >= var11) {
                    int var33 = arg2 - arg6;
                    int var34 = arg6 - arg5;
                    int var35 = this.field747 * arg5;
                    while (true) {
                        var34--;
                        if (var34 < 0) {
                            while (true) {
                                var33--;
                                if (var33 < 0) {
                                    return;
                                }
                                class169.method1278(var30 >> 16, var35, -101, 0, this.field751, var32 >> 16);
                                var32 += var8;
                                var30 += var11;
                                var35 += this.field747;
                            }
                        }
                        class169.method1278(var30 >> 16, var35, -68, 0, this.field751, var31 >> 16);
                        var31 += var10;
                        var35 += this.field747;
                        var30 += var11;
                    }
                } else {
                    int var36 = arg2 - arg6;
                    int var37 = arg6 - arg5;
                    int var38 = this.field747 * arg5;
                    while (true) {
                        var37--;
                        if (var37 < 0) {
                            while (true) {
                                var36--;
                                if (var36 < 0) {
                                    return;
                                }
                                class169.method1278(var32 >> 16, var38, -122, 0, this.field751, var30 >> 16);
                                var30 += var11;
                                var32 += var8;
                                var38 += this.field747;
                            }
                        }
                        class169.method1278(var31 >> 16, var38, -99, 0, this.field751, var30 >> 16);
                        var30 += var11;
                        var31 += var10;
                        var38 += this.field747;
                    }
                }
            } else {
                int var39;
                int var40 = var39 = arg0 << 16;
                int var41 = arg1 << 16;
                if (arg5 < 0) {
                    var40 -= arg5 * var10;
                    var39 -= arg5 * var11;
                    arg5 = 0;
                }
                if (arg2 < 0) {
                    var41 -= arg2 * var8;
                    arg2 = 0;
                }
                if (var11 > var10) {
                    int var42 = arg6 - arg2;
                    int var43 = arg2 - arg5;
                    int var44 = this.field747 * arg5;
                    while (true) {
                        var43--;
                        if (var43 < 0) {
                            while (true) {
                                var42--;
                                if (var42 < 0) {
                                    return;
                                }
                                class169.method1278(var40 >> 16, var44, -48, 0, this.field751, var41 >> 16);
                                var40 += var10;
                                var41 += var8;
                                var44 += this.field747;
                            }
                        }
                        class169.method1278(var40 >> 16, var44, -36, 0, this.field751, var39 >> 16);
                        var44 += this.field747;
                        var39 += var11;
                        var40 += var10;
                    }
                } else {
                    int var45 = arg6 - arg2;
                    int var46 = arg2 - arg5;
                    int var47 = this.field747 * arg5;
                    while (true) {
                        var46--;
                        if (var46 < 0) {
                            while (true) {
                                var45--;
                                if (var45 < 0) {
                                    return;
                                }
                                class169.method1278(var41 >> 16, var47, -104, 0, this.field751, var40 >> 16);
                                var47 += this.field747;
                                var40 += var10;
                                var41 += var8;
                            }
                        }
                        class169.method1278(var39 >> 16, var47, -83, 0, this.field751, var40 >> 16);
                        var39 += var11;
                        var40 += var10;
                        var47 += this.field747;
                    }
                }
            }
        } else if (arg5 >= arg2) {
            int var48;
            int var49 = var48 = arg4 << 16;
            if (arg6 < 0) {
                var49 -= arg6 * var8;
                var48 -= arg6 * var10;
                arg6 = 0;
            }
            int var50 = arg1 << 16;
            if (arg2 < 0) {
                var50 -= arg2 * var11;
                arg2 = 0;
            }
            if (var8 < var10) {
                int var51 = arg5 - arg2;
                int var52 = arg2 - arg6;
                int var53 = this.field747 * arg6;
                while (true) {
                    var52--;
                    if (var52 < 0) {
                        while (true) {
                            var51--;
                            if (var51 < 0) {
                                return;
                            }
                            class169.method1278(var50 >> 16, var53, -66, 0, this.field751, var48 >> 16);
                            var50 += var11;
                            var48 += var10;
                            var53 += this.field747;
                        }
                    }
                    class169.method1278(var49 >> 16, var53, -62, 0, this.field751, var48 >> 16);
                    var49 += var8;
                    var48 += var10;
                    var53 += this.field747;
                }
            } else {
                int var54 = arg5 - arg2;
                int var55 = arg2 - arg6;
                int var56 = this.field747 * arg6;
                while (true) {
                    var55--;
                    if (var55 < 0) {
                        while (true) {
                            var54--;
                            if (var54 < 0) {
                                return;
                            }
                            class169.method1278(var48 >> 16, var56, -108, 0, this.field751, var50 >> 16);
                            var48 += var10;
                            var50 += var11;
                            var56 += this.field747;
                        }
                    }
                    class169.method1278(var48 >> 16, var56, -67, 0, this.field751, var49 >> 16);
                    var48 += var10;
                    var49 += var8;
                    var56 += this.field747;
                }
            }
        } else {
            int var57;
            int var58 = var57 = arg4 << 16;
            if (arg6 < 0) {
                var58 -= arg6 * var8;
                var57 -= arg6 * var10;
                arg6 = 0;
            }
            int var59 = arg0 << 16;
            if (arg5 < 0) {
                var59 -= arg5 * var11;
                arg5 = 0;
            }
            if (arg5 != arg6 && var10 > var8 || arg5 == arg6 && var8 > var11) {
                int var60 = arg2 - arg5;
                int var61 = arg5 - arg6;
                int var62 = this.field747 * arg6;
                while (true) {
                    var61--;
                    if (var61 < 0) {
                        while (true) {
                            var60--;
                            if (var60 < 0) {
                                return;
                            }
                            class169.method1278(var58 >> 16, var62, -125, 0, this.field751, var59 >> 16);
                            var58 += var8;
                            var59 += var11;
                            var62 += this.field747;
                        }
                    }
                    class169.method1278(var58 >> 16, var62, -113, 0, this.field751, var57 >> 16);
                    var62 += this.field747;
                    var58 += var8;
                    var57 += var10;
                }
            } else {
                int var63 = arg2 - arg5;
                int var64 = arg5 - arg6;
                int var65 = this.field747 * arg6;
                while (true) {
                    var64--;
                    if (var64 < 0) {
                        while (true) {
                            var63--;
                            if (var63 < 0) {
                                return;
                            }
                            class169.method1278(var59 >> 16, var65, -92, 0, this.field751, var58 >> 16);
                            var65 += this.field747;
                            var59 += var11;
                            var58 += var8;
                        }
                    }
                    class169.method1278(var57 >> 16, var65, -85, 0, this.field751, var58 >> 16);
                    var58 += var8;
                    var65 += this.field747;
                    var57 += var10;
                }
            }
        }
    }

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "(I)V", line = 500)
    public static void method396(int arg0) {
        field745 = null;
        field753 = null;
        field757 = null;
        if (arg0 != -1) {
            method396(109);
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(BII)Z", line = 522)
    public final boolean method397(byte arg0, int arg1, int arg2) {
        int var4 = 65 % ((arg0 - 45) / 39);
        field755++;
        return arg1 * arg2 <= this.field751.length;
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(Lqo;II)V", line = 533)
    public class28(class22 arg0, int arg1, int arg2) {
        this.field751 = new byte[arg1 * arg2];
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(III)Lqfa;", line = 545)
    public static final class100 method398(int arg0, int arg1, int arg2) {
        class384 var3 = class649.field8928[arg0][arg1][arg2];
        return var3 == null ? null : var3.field5577;
    }
}
