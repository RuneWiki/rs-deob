import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class703 extends class736 {

    @OriginalMember(owner = "client!ig", name = "v", descriptor = "[B")
    public byte[] field9296;

    @OriginalMember(owner = "client!ig", name = "t", descriptor = "[I")
    public static int[] field9294 = new int[32];

    @OriginalMember(owner = "client!ig", name = "x", descriptor = "Z")
    public static boolean field9298 = true;

    @OriginalMember(owner = "client!ig", name = "w", descriptor = "I")
    public static int field9297 = 0;

    @OriginalMember(owner = "client!ig", name = "u", descriptor = "I")
    public static int field9295;

    @OriginalMember(owner = "client!ig", name = "y", descriptor = "I")
    public int field9299;

    @OriginalMember(owner = "client!ig", name = "z", descriptor = "I")
    public static int field9300;

    @OriginalMember(owner = "client!ig", name = "A", descriptor = "I")
    public static int field9301;

    @OriginalMember(owner = "client!ig", name = "B", descriptor = "I")
    public static int field9302;

    @OriginalMember(owner = "client!ig", name = "C", descriptor = "I")
    public static int field9303;

    @OriginalMember(owner = "client!ig", name = "D", descriptor = "I")
    public static int field9304;

    @OriginalMember(owner = "client!ig", name = "E", descriptor = "I")
    public int field9305;

    @OriginalMember(owner = "client!ig", name = "F", descriptor = "I")
    public int field9306;

    @OriginalMember(owner = "client!ig", name = "G", descriptor = "I")
    public int field9307;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(B)V", line = 7)
    public final void method3805(byte arg0) {
        if (arg0 != 0) {
            this.method3811(-50, 64, true);
        }
        field9300++;
        int var2 = -1;
        int var3 = this.field9296.length - 8;
        while (var2 < var3) {
            var2++;
            this.field9296[var2] = 0;
            var2++;
            this.field9296[var2] = 0;
            var2++;
            this.field9296[var2] = 0;
            var2++;
            this.field9296[var2] = 0;
            var2++;
            this.field9296[var2] = 0;
            var2++;
            this.field9296[var2] = 0;
            var2++;
            this.field9296[var2] = 0;
            var2++;
            this.field9296[var2] = 0;
        }
        while (var2 < (this.field9296.length - 1)) {
            var2++;
            this.field9296[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)V", line = 43)
    public static final void method3806(int arg0) {
        field9301++;
        if (arg0 != -29889) {
            method3806(71);
        }
        for (class720 var1 = (class720) class479.field6198.method2610((byte) -99); var1 != null; var1 = (class720) class479.field6198.method2620(0)) {
            class595.method3210(var1.field9459, true);
        }
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(I)V", line = 64)
    public static void method3807(int arg0) {
        int var1 = -58 / ((15 - arg0) / 51);
        field9294 = null;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIIII)V", line = 73)
    public final void method3808(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field9307 = arg2;
        this.field9306 = arg0 - arg4;
        if (arg3 != -1) {
            method3807(47);
        }
        this.field9305 = arg4;
        this.field9299 = arg1 - arg2;
        field9304++;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIIIIII)V", line = 91)
    public final void method3809(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field9302++;
        int var8 = 0;
        if (arg0 != arg3) {
            var8 = (arg5 - arg6 << 16) / (arg0 - arg3);
        }
        int var9 = 0;
        if (arg0 != arg4) {
            var9 = (arg2 - arg5 << 16) / (arg4 - arg0);
        }
        int var10 = arg1;
        if (arg3 != arg4) {
            var10 = (arg6 - arg2 << 16) / (arg3 - arg4);
        }
        if (arg0 >= arg3 && arg3 <= arg4) {
            if (arg4 <= arg0) {
                int var11;
                int var12 = var11 = arg6 << 16;
                if (arg3 < 0) {
                    var12 -= arg3 * var10;
                    var11 -= arg3 * var8;
                    arg3 = 0;
                }
                int var13 = arg2 << 16;
                if (arg4 < 0) {
                    var13 -= arg4 * var9;
                    arg4 = 0;
                }
                if ((arg3 == arg4 || var8 <= var10) && (arg3 != arg4 || var8 >= var9)) {
                    int var17 = arg0 - arg4;
                    int var18 = arg4 - arg3;
                    int var19 = this.field9306 * arg3;
                    while (true) {
                        var18--;
                        if (var18 < 0) {
                            while (true) {
                                var17--;
                                if (var17 < 0) {
                                    return;
                                }
                                class225.method1453(var19, var13 >> 16, (byte) 122, 0, var11 >> 16, this.field9296);
                                var19 += this.field9306;
                                var13 += var9;
                                var11 += var8;
                            }
                        }
                        class225.method1453(var19, var12 >> 16, (byte) 80, 0, var11 >> 16, this.field9296);
                        var19 += this.field9306;
                        var12 += var10;
                        var11 += var8;
                    }
                } else {
                    int var14 = arg0 - arg4;
                    int var15 = arg4 - arg3;
                    int var16 = this.field9306 * arg3;
                    while (true) {
                        var15--;
                        if (var15 < 0) {
                            while (true) {
                                var14--;
                                if (var14 < 0) {
                                    return;
                                }
                                class225.method1453(var16, var11 >> 16, (byte) 77, 0, var13 >> 16, this.field9296);
                                var11 += var8;
                                var16 += this.field9306;
                                var13 += var9;
                            }
                        }
                        class225.method1453(var16, var11 >> 16, (byte) 102, 0, var12 >> 16, this.field9296);
                        var12 += var10;
                        var16 += this.field9306;
                        var11 += var8;
                    }
                }
            } else {
                int var20;
                int var21 = var20 = arg6 << 16;
                if (arg3 < 0) {
                    var21 -= arg3 * var10;
                    var20 -= arg3 * var8;
                    arg3 = 0;
                }
                int var22 = arg5 << 16;
                if (arg0 < 0) {
                    var22 -= arg0 * var9;
                    arg0 = 0;
                }
                if (arg0 != arg3 && var10 < var8 || arg0 == arg3 && var9 < var10) {
                    int var23 = arg4 - arg0;
                    int var24 = arg0 - arg3;
                    int var25 = this.field9306 * arg3;
                    while (true) {
                        var24--;
                        if (var24 < 0) {
                            while (true) {
                                var23--;
                                if (var23 < 0) {
                                    return;
                                }
                                class225.method1453(var25, var22 >> 16, (byte) 110, 0, var21 >> 16, this.field9296);
                                var25 += this.field9306;
                                var22 += var9;
                                var21 += var10;
                            }
                        }
                        class225.method1453(var25, var20 >> 16, (byte) 125, 0, var21 >> 16, this.field9296);
                        var20 += var8;
                        var25 += this.field9306;
                        var21 += var10;
                    }
                } else {
                    int var26 = arg4 - arg0;
                    int var27 = arg0 - arg3;
                    int var28 = this.field9306 * arg3;
                    while (true) {
                        var27--;
                        if (var27 < 0) {
                            while (true) {
                                var26--;
                                if (var26 < 0) {
                                    return;
                                }
                                class225.method1453(var28, var21 >> 16, (byte) 127, 0, var22 >> 16, this.field9296);
                                var21 += var10;
                                var22 += var9;
                                var28 += this.field9306;
                            }
                        }
                        class225.method1453(var28, var21 >> 16, (byte) 120, 0, var20 >> 16, this.field9296);
                        var21 += var10;
                        var28 += this.field9306;
                        var20 += var8;
                    }
                }
            }
        } else if (arg4 >= arg0) {
            if (arg4 < arg3) {
                int var29;
                int var30 = var29 = arg5 << 16;
                if (arg0 < 0) {
                    var29 -= arg0 * var9;
                    var30 -= arg0 * var8;
                    arg0 = 0;
                }
                int var31 = arg2 << 16;
                if (arg4 < 0) {
                    var31 -= arg4 * var10;
                    arg4 = 0;
                }
                if (arg0 != arg4 && var9 > var8 || arg0 == arg4 && var10 < var8) {
                    int var32 = arg3 - arg4;
                    int var33 = arg4 - arg0;
                    int var34 = this.field9306 * arg0;
                    while (true) {
                        var33--;
                        if (var33 < 0) {
                            while (true) {
                                var32--;
                                if (var32 < 0) {
                                    return;
                                }
                                class225.method1453(var34, var31 >> 16, (byte) 124, 0, var30 >> 16, this.field9296);
                                var34 += this.field9306;
                                var30 += var8;
                                var31 += var10;
                            }
                        }
                        class225.method1453(var34, var29 >> 16, (byte) 121, 0, var30 >> 16, this.field9296);
                        var30 += var8;
                        var29 += var9;
                        var34 += this.field9306;
                    }
                } else {
                    int var35 = arg3 - arg4;
                    int var36 = arg4 - arg0;
                    int var37 = this.field9306 * arg0;
                    while (true) {
                        var36--;
                        if (var36 < 0) {
                            while (true) {
                                var35--;
                                if (var35 < 0) {
                                    return;
                                }
                                class225.method1453(var37, var30 >> 16, (byte) 117, 0, var31 >> 16, this.field9296);
                                var30 += var8;
                                var37 += this.field9306;
                                var31 += var10;
                            }
                        }
                        class225.method1453(var37, var30 >> 16, (byte) 117, 0, var29 >> 16, this.field9296);
                        var37 += this.field9306;
                        var29 += var9;
                        var30 += var8;
                    }
                }
            } else {
                int var38;
                int var39 = var38 = arg5 << 16;
                int var40 = arg6 << 16;
                if (arg0 < 0) {
                    var38 -= arg0 * var9;
                    var39 -= arg0 * var8;
                    arg0 = 0;
                }
                if (arg3 < 0) {
                    var40 -= arg3 * var10;
                    arg3 = 0;
                }
                if (var8 >= var9) {
                    int var41 = arg4 - arg3;
                    int var42 = arg3 - arg0;
                    int var43 = this.field9306 * arg0;
                    while (true) {
                        var42--;
                        if (var42 < 0) {
                            while (true) {
                                var41--;
                                if (var41 < 0) {
                                    return;
                                }
                                class225.method1453(var43, var40 >> 16, (byte) 84, 0, var38 >> 16, this.field9296);
                                var38 += var9;
                                var40 += var10;
                                var43 += this.field9306;
                            }
                        }
                        class225.method1453(var43, var39 >> 16, (byte) 79, 0, var38 >> 16, this.field9296);
                        var39 += var8;
                        var38 += var9;
                        var43 += this.field9306;
                    }
                } else {
                    int var44 = arg4 - arg3;
                    int var45 = arg3 - arg0;
                    int var46 = this.field9306 * arg0;
                    while (true) {
                        var45--;
                        if (var45 < 0) {
                            while (true) {
                                var44--;
                                if (var44 < 0) {
                                    return;
                                }
                                class225.method1453(var46, var38 >> 16, (byte) 68, 0, var40 >> 16, this.field9296);
                                var46 += this.field9306;
                                var38 += var9;
                                var40 += var10;
                            }
                        }
                        class225.method1453(var46, var38 >> 16, (byte) 82, 0, var39 >> 16, this.field9296);
                        var39 += var8;
                        var38 += var9;
                        var46 += this.field9306;
                    }
                }
            }
        } else if (arg3 >= arg0) {
            int var47;
            int var48 = var47 = arg2 << 16;
            int var49 = arg5 << 16;
            if (arg4 < 0) {
                var47 -= arg4 * var10;
                var48 -= arg4 * var9;
                arg4 = 0;
            }
            if (arg0 < 0) {
                var49 -= arg0 * var8;
                arg0 = 0;
            }
            if (var10 <= var9) {
                int var50 = arg3 - arg0;
                int var51 = arg0 - arg4;
                int var52 = this.field9306 * arg4;
                while (true) {
                    var51--;
                    if (var51 < 0) {
                        while (true) {
                            var50--;
                            if (var50 < 0) {
                                return;
                            }
                            class225.method1453(var52, var49 >> 16, (byte) 66, 0, var47 >> 16, this.field9296);
                            var52 += this.field9306;
                            var49 += var8;
                            var47 += var10;
                        }
                    }
                    class225.method1453(var52, var48 >> 16, (byte) 104, 0, var47 >> 16, this.field9296);
                    var48 += var9;
                    var52 += this.field9306;
                    var47 += var10;
                }
            } else {
                int var53 = arg3 - arg0;
                int var54 = arg0 - arg4;
                int var55 = this.field9306 * arg4;
                while (true) {
                    var54--;
                    if (var54 < 0) {
                        while (true) {
                            var53--;
                            if (var53 < 0) {
                                return;
                            }
                            class225.method1453(var55, var47 >> 16, (byte) 115, 0, var49 >> 16, this.field9296);
                            var49 += var8;
                            var47 += var10;
                            var55 += this.field9306;
                        }
                    }
                    class225.method1453(var55, var47 >> 16, (byte) 100, 0, var48 >> 16, this.field9296);
                    var47 += var10;
                    var48 += var9;
                    var55 += this.field9306;
                }
            }
        } else {
            int var56;
            int var57 = var56 = arg2 << 16;
            if (arg4 < 0) {
                var56 -= arg4 * var10;
                var57 -= arg4 * var9;
                arg4 = 0;
            }
            int var58 = arg6 << 16;
            if (arg3 < 0) {
                var58 -= arg3 * var8;
                arg3 = 0;
            }
            if (var10 <= var9) {
                int var59 = arg0 - arg3;
                int var60 = arg3 - arg4;
                int var61 = this.field9306 * arg4;
                while (true) {
                    var60--;
                    if (var60 < 0) {
                        while (true) {
                            var59--;
                            if (var59 < 0) {
                                return;
                            }
                            class225.method1453(var61, var57 >> 16, (byte) 70, 0, var58 >> 16, this.field9296);
                            var61 += this.field9306;
                            var57 += var9;
                            var58 += var8;
                        }
                    }
                    class225.method1453(var61, var57 >> 16, (byte) 103, 0, var56 >> 16, this.field9296);
                    var57 += var9;
                    var56 += var10;
                    var61 += this.field9306;
                }
            } else {
                int var62 = arg0 - arg3;
                int var63 = arg3 - arg4;
                int var64 = this.field9306 * arg4;
                while (true) {
                    var63--;
                    if (var63 < 0) {
                        while (true) {
                            var62--;
                            if (var62 < 0) {
                                return;
                            }
                            class225.method1453(var64, var58 >> 16, (byte) 112, 0, var57 >> 16, this.field9296);
                            var58 += var8;
                            var57 += var9;
                            var64 += this.field9306;
                        }
                    }
                    class225.method1453(var64, var56 >> 16, (byte) 78, 0, var57 >> 16, this.field9296);
                    var56 += var10;
                    var57 += var9;
                    var64 += this.field9306;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "(I)[Lk;", line = 530)
    public static final class66[] method3810(int arg0) {
        field9295++;
        int var1 = -111 % ((57 - arg0) / 41);
        return new class66[] { class290.field3701, class549.field6880, class561.field7132, class620.field7843, class169.field2235, class254.field3449, class520.field6611 };
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIZ)Z", line = 541)
    public final boolean method3811(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            this.field9306 = -81;
        }
        field9303++;
        return this.field9296.length >= (arg0 * arg1);
    }

    @OriginalMember(owner = "client!ig", name = "<init>", descriptor = "(Lgd;II)V", line = 556)
    public class703(class696 arg0, int arg1, int arg2) {
        this.field9296 = new byte[arg1 * arg2];
    }
}
