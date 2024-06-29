import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class473 extends class264 {

    @OriginalMember(owner = "client!ua", name = "K", descriptor = "[B")
    public byte[] field6859;

    @OriginalMember(owner = "client!ua", name = "A", descriptor = "Ldq;")
    public static class493 field6850 = new class493(2, 5);

    @OriginalMember(owner = "client!ua", name = "y", descriptor = "I")
    public static int field6848;

    @OriginalMember(owner = "client!ua", name = "z", descriptor = "I")
    public static int field6849;

    @OriginalMember(owner = "client!ua", name = "B", descriptor = "I")
    public int field6851;

    @OriginalMember(owner = "client!ua", name = "C", descriptor = "I")
    public static int field6852;

    @OriginalMember(owner = "client!ua", name = "D", descriptor = "I")
    public int field6853;

    @OriginalMember(owner = "client!ua", name = "F", descriptor = "I")
    public int field6855;

    @OriginalMember(owner = "client!ua", name = "G", descriptor = "I")
    public static int field6856;

    @OriginalMember(owner = "client!ua", name = "H", descriptor = "I")
    public static int field6857;

    @OriginalMember(owner = "client!ua", name = "L", descriptor = "I")
    public int field6860;

    @OriginalMember(owner = "client!ua", name = "I", descriptor = "Lqn;")
    public static class47 field6858;

    @OriginalMember(owner = "client!ua", name = "E", descriptor = "[Lke;")
    public static class425[] field6854;

    @OriginalMember(owner = "client!ua", name = "x", descriptor = "[[Z")
    public static boolean[][] field6847;

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "(Z)V", line = 5)
    public static void method2848(boolean arg0) {
        field6854 = null;
        field6858 = null;
        if (!arg0) {
            field6847 = null;
            field6850 = null;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IBI)Z", line = 19)
    public final boolean method2849(int arg0, byte arg1, int arg2) {
        if (arg1 != 0) {
            field6854 = null;
        }
        field6852++;
        return arg0 * arg2 <= this.field6859.length;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIIIIII)V", line = 39)
    public final void method2850(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field6849++;
        if (arg1 != -1) {
            return;
        }
        int var8 = 0;
        if (arg3 != arg4) {
            var8 = (arg0 - arg5 << 16) / (arg4 - arg3);
        }
        int var9 = 0;
        if (arg4 != arg6) {
            var9 = (arg2 - arg0 << 16) / (arg6 - arg4);
        }
        int var10 = 0;
        if (arg3 != arg6) {
            var10 = (arg5 - arg2 << 16) / (arg3 - arg6);
        }
        if (arg4 >= arg3 && arg3 <= arg6) {
            if (arg6 > arg4) {
                int var11;
                int var12 = var11 = arg5 << 16;
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
                if (arg3 != arg4 && var10 < var8 || arg3 == arg4 && var10 > var9) {
                    int var14 = arg6 - arg4;
                    int var15 = arg4 - arg3;
                    int var16 = this.field6855 * arg3;
                    while (true) {
                        var15--;
                        if (var15 < 0) {
                            while (true) {
                                var14--;
                                if (var14 < 0) {
                                    return;
                                }
                                class327.method1909(var12 >> 16, var16, var13 >> 16, this.field6859, 0, (byte) -53);
                                var13 += var9;
                                var16 += this.field6855;
                                var12 += var10;
                            }
                        }
                        class327.method1909(var12 >> 16, var16, var11 >> 16, this.field6859, 0, (byte) -53);
                        var16 += this.field6855;
                        var11 += var8;
                        var12 += var10;
                    }
                } else {
                    int var17 = arg6 - arg4;
                    int var18 = arg4 - arg3;
                    int var19 = this.field6855 * arg3;
                    while (true) {
                        var18--;
                        if (var18 < 0) {
                            while (true) {
                                var17--;
                                if (var17 < 0) {
                                    return;
                                }
                                class327.method1909(var13 >> 16, var19, var12 >> 16, this.field6859, 0, (byte) -53);
                                var13 += var9;
                                var19 += this.field6855;
                                var12 += var10;
                            }
                        }
                        class327.method1909(var11 >> 16, var19, var12 >> 16, this.field6859, 0, (byte) -53);
                        var19 += this.field6855;
                        var12 += var10;
                        var11 += var8;
                    }
                }
            } else {
                int var20;
                int var21 = var20 = arg5 << 16;
                if (arg3 < 0) {
                    var21 -= arg3 * var10;
                    var20 -= arg3 * var8;
                    arg3 = 0;
                }
                int var22 = arg2 << 16;
                if (arg6 < 0) {
                    var22 -= arg6 * var9;
                    arg6 = 0;
                }
                if (arg3 != arg6 && var8 > var10 || arg3 == arg6 && var8 < var9) {
                    int var23 = arg4 - arg6;
                    int var24 = arg6 - arg3;
                    int var25 = this.field6855 * arg3;
                    while (true) {
                        var24--;
                        if (var24 < 0) {
                            while (true) {
                                var23--;
                                if (var23 < 0) {
                                    return;
                                }
                                class327.method1909(var22 >> 16, var25, var20 >> 16, this.field6859, 0, (byte) -53);
                                var20 += var8;
                                var22 += var9;
                                var25 += this.field6855;
                            }
                        }
                        class327.method1909(var21 >> 16, var25, var20 >> 16, this.field6859, 0, (byte) -53);
                        var21 += var10;
                        var20 += var8;
                        var25 += this.field6855;
                    }
                } else {
                    int var26 = arg4 - arg6;
                    int var27 = arg6 - arg3;
                    int var28 = this.field6855 * arg3;
                    while (true) {
                        var27--;
                        if (var27 < 0) {
                            while (true) {
                                var26--;
                                if (var26 < 0) {
                                    return;
                                }
                                class327.method1909(var20 >> 16, var28, var22 >> 16, this.field6859, 0, (byte) -53);
                                var28 += this.field6855;
                                var22 += var9;
                                var20 += var8;
                            }
                        }
                        class327.method1909(var20 >> 16, var28, var21 >> 16, this.field6859, 0, (byte) -53);
                        var28 += this.field6855;
                        var21 += var10;
                        var20 += var8;
                    }
                }
            }
        } else if (arg6 >= arg4) {
            if (arg6 >= arg3) {
                int var29;
                int var30 = var29 = arg0 << 16;
                if (arg4 < 0) {
                    var30 -= arg4 * var8;
                    var29 -= arg4 * var9;
                    arg4 = 0;
                }
                int var31 = arg5 << 16;
                if (arg3 < 0) {
                    var31 -= arg3 * var10;
                    arg3 = 0;
                }
                if (var9 > var8) {
                    int var32 = arg6 - arg3;
                    int var33 = arg3 - arg4;
                    int var34 = this.field6855 * arg4;
                    while (true) {
                        var33--;
                        if (var33 < 0) {
                            while (true) {
                                var32--;
                                if (var32 < 0) {
                                    return;
                                }
                                class327.method1909(var31 >> 16, var34, var29 >> 16, this.field6859, 0, (byte) -53);
                                var34 += this.field6855;
                                var29 += var9;
                                var31 += var10;
                            }
                        }
                        class327.method1909(var30 >> 16, var34, var29 >> 16, this.field6859, 0, (byte) -53);
                        var34 += this.field6855;
                        var29 += var9;
                        var30 += var8;
                    }
                } else {
                    int var35 = arg6 - arg3;
                    int var36 = arg3 - arg4;
                    int var37 = this.field6855 * arg4;
                    while (true) {
                        var36--;
                        if (var36 < 0) {
                            while (true) {
                                var35--;
                                if (var35 < 0) {
                                    return;
                                }
                                class327.method1909(var29 >> 16, var37, var31 >> 16, this.field6859, 0, (byte) -53);
                                var37 += this.field6855;
                                var31 += var10;
                                var29 += var9;
                            }
                        }
                        class327.method1909(var29 >> 16, var37, var30 >> 16, this.field6859, 0, (byte) -53);
                        var29 += var9;
                        var30 += var8;
                        var37 += this.field6855;
                    }
                }
            } else {
                int var38;
                int var39 = var38 = arg0 << 16;
                int var40 = arg2 << 16;
                if (arg4 < 0) {
                    var39 -= arg4 * var8;
                    var38 -= arg4 * var9;
                    arg4 = 0;
                }
                if (arg6 < 0) {
                    var40 -= arg6 * var10;
                    arg6 = 0;
                }
                if (arg4 != arg6 && var8 < var9 || arg4 == arg6 && var10 < var8) {
                    int var41 = arg3 - arg6;
                    int var42 = arg6 - arg4;
                    int var43 = this.field6855 * arg4;
                    while (true) {
                        var42--;
                        if (var42 < 0) {
                            while (true) {
                                var41--;
                                if (var41 < 0) {
                                    return;
                                }
                                class327.method1909(var39 >> 16, var43, var40 >> 16, this.field6859, 0, (byte) -53);
                                var43 += this.field6855;
                                var39 += var8;
                                var40 += var10;
                            }
                        }
                        class327.method1909(var39 >> 16, var43, var38 >> 16, this.field6859, 0, (byte) -53);
                        var39 += var8;
                        var38 += var9;
                        var43 += this.field6855;
                    }
                } else {
                    int var44 = arg3 - arg6;
                    int var45 = arg6 - arg4;
                    int var46 = this.field6855 * arg4;
                    while (true) {
                        var45--;
                        if (var45 < 0) {
                            while (true) {
                                var44--;
                                if (var44 < 0) {
                                    return;
                                }
                                class327.method1909(var40 >> 16, var46, var39 >> 16, this.field6859, 0, (byte) -53);
                                var46 += this.field6855;
                                var39 += var8;
                                var40 += var10;
                            }
                        }
                        class327.method1909(var38 >> 16, var46, var39 >> 16, this.field6859, 0, (byte) -53);
                        var38 += var9;
                        var46 += this.field6855;
                        var39 += var8;
                    }
                }
            }
        } else if (arg3 >= arg4) {
            int var47;
            int var48 = var47 = arg2 << 16;
            int var49 = arg0 << 16;
            if (arg6 < 0) {
                var47 -= arg6 * var10;
                var48 -= arg6 * var9;
                arg6 = 0;
            }
            if (arg4 < 0) {
                var49 -= arg4 * var8;
                arg4 = 0;
            }
            if (var9 < var10) {
                int var50 = arg3 - arg4;
                int var51 = arg4 - arg6;
                int var52 = this.field6855 * arg6;
                while (true) {
                    var51--;
                    if (var51 < 0) {
                        while (true) {
                            var50--;
                            if (var50 < 0) {
                                return;
                            }
                            class327.method1909(var49 >> 16, var52, var47 >> 16, this.field6859, 0, (byte) -53);
                            var49 += var8;
                            var52 += this.field6855;
                            var47 += var10;
                        }
                    }
                    class327.method1909(var48 >> 16, var52, var47 >> 16, this.field6859, 0, (byte) -53);
                    var52 += this.field6855;
                    var48 += var9;
                    var47 += var10;
                }
            } else {
                int var53 = arg3 - arg4;
                int var54 = arg4 - arg6;
                int var55 = this.field6855 * arg6;
                while (true) {
                    var54--;
                    if (var54 < 0) {
                        while (true) {
                            var53--;
                            if (var53 < 0) {
                                return;
                            }
                            class327.method1909(var47 >> 16, var55, var49 >> 16, this.field6859, 0, (byte) -53);
                            var47 += var10;
                            var49 += var8;
                            var55 += this.field6855;
                        }
                    }
                    class327.method1909(var47 >> 16, var55, var48 >> 16, this.field6859, 0, (byte) -53);
                    var48 += var9;
                    var47 += var10;
                    var55 += this.field6855;
                }
            }
        } else {
            int var56;
            int var57 = var56 = arg2 << 16;
            int var58 = arg5 << 16;
            if (arg6 < 0) {
                var57 -= arg6 * var9;
                var56 -= arg6 * var10;
                arg6 = 0;
            }
            if (arg3 < 0) {
                var58 -= arg3 * var8;
                arg3 = 0;
            }
            if (var10 > var9) {
                int var59 = arg4 - arg3;
                int var60 = arg3 - arg6;
                int var61 = this.field6855 * arg6;
                while (true) {
                    var60--;
                    if (var60 < 0) {
                        while (true) {
                            var59--;
                            if (var59 < 0) {
                                return;
                            }
                            class327.method1909(var57 >> 16, var61, var58 >> 16, this.field6859, 0, (byte) -53);
                            var61 += this.field6855;
                            var57 += var9;
                            var58 += var8;
                        }
                    }
                    class327.method1909(var57 >> 16, var61, var56 >> 16, this.field6859, 0, (byte) -53);
                    var57 += var9;
                    var61 += this.field6855;
                    var56 += var10;
                }
            } else {
                int var62 = arg4 - arg3;
                int var63 = arg3 - arg6;
                int var64 = this.field6855 * arg6;
                while (true) {
                    var63--;
                    if (var63 < 0) {
                        while (true) {
                            var62--;
                            if (var62 < 0) {
                                return;
                            }
                            class327.method1909(var58 >> 16, var64, var57 >> 16, this.field6859, 0, (byte) -53);
                            var58 += var8;
                            var64 += this.field6855;
                            var57 += var9;
                        }
                    }
                    class327.method1909(var56 >> 16, var64, var57 >> 16, this.field6859, 0, (byte) -53);
                    var56 += var10;
                    var57 += var9;
                    var64 += this.field6855;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIIII)V", line = 481)
    public final void method2851(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field6855 = arg3 - arg1;
        if (arg0 != 1171950256) {
            this.method2850(-76, 97, -115, 75, -7, -91, -69);
        }
        this.field6851 = arg2;
        this.field6853 = arg4 - arg2;
        this.field6860 = arg1;
        field6857++;
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(B)V", line = 503)
    public final void method2852(byte arg0) {
        field6856++;
        if (arg0 < 34) {
            return;
        }
        int var2 = -1;
        int var3 = this.field6859.length - 8;
        while (var3 > var2) {
            var2++;
            this.field6859[var2] = 0;
            var2++;
            this.field6859[var2] = 0;
            var2++;
            this.field6859[var2] = 0;
            var2++;
            this.field6859[var2] = 0;
            var2++;
            this.field6859[var2] = 0;
            var2++;
            this.field6859[var2] = 0;
            var2++;
            this.field6859[var2] = 0;
            var2++;
            this.field6859[var2] = 0;
        }
        while (this.field6859.length - 1 > var2) {
            var2++;
            this.field6859[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(Lug;II)V", line = 535)
    public class473(class395 arg0, int arg1, int arg2) {
        this.field6859 = new byte[arg1 * arg2];
    }
}
