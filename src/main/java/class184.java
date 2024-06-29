import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class184 extends class192 {

    @OriginalMember(owner = "client!gg", name = "C", descriptor = "[B")
    public byte[] field2781;

    @OriginalMember(owner = "client!gg", name = "v", descriptor = "[I")
    public static int[] field2774 = new int[3];

    @OriginalMember(owner = "client!gg", name = "w", descriptor = "I")
    public int field2775;

    @OriginalMember(owner = "client!gg", name = "x", descriptor = "I")
    public static int field2776;

    @OriginalMember(owner = "client!gg", name = "y", descriptor = "I")
    public static int field2777;

    @OriginalMember(owner = "client!gg", name = "z", descriptor = "I")
    public int field2778;

    @OriginalMember(owner = "client!gg", name = "A", descriptor = "I")
    public int field2779;

    @OriginalMember(owner = "client!gg", name = "B", descriptor = "I")
    public int field2780;

    @OriginalMember(owner = "client!gg", name = "D", descriptor = "I")
    public static int field2782;

    @OriginalMember(owner = "client!gg", name = "E", descriptor = "I")
    public static int field2783;

    @OriginalMember(owner = "client!gg", name = "F", descriptor = "I")
    public static int field2784;

    @OriginalMember(owner = "client!gg", name = "H", descriptor = "I")
    public static int field2785;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(B)V")
    public final void method1369(byte arg0) {
        field2785++;
        if (arg0 < 27) {
            this.field2781 = null;
        }
        int var2 = -1;
        int var3 = this.field2781.length - 8;
        while (var3 > var2) {
            var2++;
            this.field2781[var2] = 0;
            var2++;
            this.field2781[var2] = 0;
            var2++;
            this.field2781[var2] = 0;
            var2++;
            this.field2781[var2] = 0;
            var2++;
            this.field2781[var2] = 0;
            var2++;
            this.field2781[var2] = 0;
            var2++;
            this.field2781[var2] = 0;
            var2++;
            this.field2781[var2] = 0;
        }
        while (var2 < (this.field2781.length - 1)) {
            var2++;
            this.field2781[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IZ)I")
    public static final int method1370(int arg0, boolean arg1) {
        field2783++;
        return arg1 ? arg0 & 0xFF : 31;
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(I)V")
    public static void method1371(int arg0) {
        field2774 = null;
        int var1 = 116 % ((9 - arg0) / 54);
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIIII)V")
    public final void method1372(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field2778 = arg1 - arg0;
        this.field2779 = arg0;
        field2776++;
        this.field2780 = arg4;
        int var6 = 96 % ((-arg2 - 27) / 62);
        this.field2775 = arg3 - arg4;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(BII)Z")
    public final boolean method1373(byte arg0, int arg1, int arg2) {
        if (arg0 < 54) {
            method1371(-122);
        }
        field2777++;
        return this.field2781.length >= (arg1 * arg2);
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIIIIII)V")
    public final void method1374(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2784++;
        int var8 = 0;
        if (arg3 != arg4) {
            var8 = (arg2 - arg6 << 16) / (arg3 - arg4);
        }
        int var9 = 0;
        if (arg1 <= 45) {
            return;
        }
        if (arg0 != arg3) {
            var9 = (arg5 - arg2 << 16) / (arg0 - arg3);
        }
        int var10 = 0;
        if (arg0 != arg4) {
            var10 = (arg6 - arg5 << 16) / (arg4 - arg0);
        }
        if (arg3 >= arg4 && arg4 <= arg0) {
            if (arg3 >= arg0) {
                int var11;
                int var12 = var11 = arg6 << 16;
                if (arg4 < 0) {
                    var11 -= arg4 * var8;
                    var12 -= arg4 * var10;
                    arg4 = 0;
                }
                int var13 = arg5 << 16;
                if (arg0 < 0) {
                    var13 -= arg0 * var9;
                    arg0 = 0;
                }
                if ((arg0 == arg4 || var8 <= var10) && (arg0 != arg4 || var8 >= var9)) {
                    int var17 = arg3 - arg0;
                    int var18 = arg0 - arg4;
                    int var19 = this.field2775 * arg4;
                    while (true) {
                        var18--;
                        if (var18 < 0) {
                            while (true) {
                                var17--;
                                if (var17 < 0) {
                                    return;
                                }
                                class379.method2341(this.field2781, var19, var11 >> 16, -43, 0, var13 >> 16);
                                var13 += var9;
                                var19 += this.field2775;
                                var11 += var8;
                            }
                        }
                        class379.method2341(this.field2781, var19, var11 >> 16, -41, 0, var12 >> 16);
                        var19 += this.field2775;
                        var12 += var10;
                        var11 += var8;
                    }
                } else {
                    int var14 = arg3 - arg0;
                    int var15 = arg0 - arg4;
                    int var16 = this.field2775 * arg4;
                    while (true) {
                        var15--;
                        if (var15 < 0) {
                            while (true) {
                                var14--;
                                if (var14 < 0) {
                                    return;
                                }
                                class379.method2341(this.field2781, var16, var13 >> 16, 101, 0, var11 >> 16);
                                var16 += this.field2775;
                                var11 += var8;
                                var13 += var9;
                            }
                        }
                        class379.method2341(this.field2781, var16, var12 >> 16, 106, 0, var11 >> 16);
                        var16 += this.field2775;
                        var12 += var10;
                        var11 += var8;
                    }
                }
            } else {
                int var20;
                int var21 = var20 = arg6 << 16;
                int var22 = arg2 << 16;
                if (arg4 < 0) {
                    var20 -= arg4 * var8;
                    var21 -= arg4 * var10;
                    arg4 = 0;
                }
                if (arg3 < 0) {
                    var22 -= arg3 * var9;
                    arg3 = 0;
                }
                if (arg3 != arg4 && var8 > var10 || arg3 == arg4 && var10 > var9) {
                    int var23 = arg0 - arg3;
                    int var24 = arg3 - arg4;
                    int var25 = this.field2775 * arg4;
                    while (true) {
                        var24--;
                        if (var24 < 0) {
                            while (true) {
                                var23--;
                                if (var23 < 0) {
                                    return;
                                }
                                class379.method2341(this.field2781, var25, var21 >> 16, 113, 0, var22 >> 16);
                                var25 += this.field2775;
                                var21 += var10;
                                var22 += var9;
                            }
                        }
                        class379.method2341(this.field2781, var25, var21 >> 16, -42, 0, var20 >> 16);
                        var25 += this.field2775;
                        var21 += var10;
                        var20 += var8;
                    }
                } else {
                    int var26 = arg0 - arg3;
                    int var27 = arg3 - arg4;
                    int var28 = this.field2775 * arg4;
                    while (true) {
                        var27--;
                        if (var27 < 0) {
                            while (true) {
                                var26--;
                                if (var26 < 0) {
                                    return;
                                }
                                class379.method2341(this.field2781, var28, var22 >> 16, 119, 0, var21 >> 16);
                                var28 += this.field2775;
                                var22 += var9;
                                var21 += var10;
                            }
                        }
                        class379.method2341(this.field2781, var28, var20 >> 16, 92, 0, var21 >> 16);
                        var21 += var10;
                        var28 += this.field2775;
                        var20 += var8;
                    }
                }
            }
        } else if (arg0 >= arg3) {
            if (arg0 >= arg4) {
                int var29;
                int var30 = var29 = arg2 << 16;
                if (arg3 < 0) {
                    var29 -= arg3 * var9;
                    var30 -= arg3 * var8;
                    arg3 = 0;
                }
                int var31 = arg6 << 16;
                if (arg4 < 0) {
                    var31 -= arg4 * var10;
                    arg4 = 0;
                }
                if (var8 < var9) {
                    int var32 = arg0 - arg4;
                    int var33 = arg4 - arg3;
                    int var34 = this.field2775 * arg3;
                    while (true) {
                        var33--;
                        if (var33 < 0) {
                            while (true) {
                                var32--;
                                if (var32 < 0) {
                                    return;
                                }
                                class379.method2341(this.field2781, var34, var31 >> 16, -72, 0, var29 >> 16);
                                var31 += var10;
                                var34 += this.field2775;
                                var29 += var9;
                            }
                        }
                        class379.method2341(this.field2781, var34, var30 >> 16, -42, 0, var29 >> 16);
                        var34 += this.field2775;
                        var30 += var8;
                        var29 += var9;
                    }
                } else {
                    int var35 = arg0 - arg4;
                    int var36 = arg4 - arg3;
                    int var37 = this.field2775 * arg3;
                    while (true) {
                        var36--;
                        if (var36 < 0) {
                            while (true) {
                                var35--;
                                if (var35 < 0) {
                                    return;
                                }
                                class379.method2341(this.field2781, var37, var29 >> 16, -117, 0, var31 >> 16);
                                var29 += var9;
                                var31 += var10;
                                var37 += this.field2775;
                            }
                        }
                        class379.method2341(this.field2781, var37, var29 >> 16, -73, 0, var30 >> 16);
                        var37 += this.field2775;
                        var30 += var8;
                        var29 += var9;
                    }
                }
            } else {
                int var38;
                int var39 = var38 = arg2 << 16;
                if (arg3 < 0) {
                    var39 -= arg3 * var8;
                    var38 -= arg3 * var9;
                    arg3 = 0;
                }
                int var40 = arg5 << 16;
                if (arg0 < 0) {
                    var40 -= arg0 * var10;
                    arg0 = 0;
                }
                if (arg0 != arg3 && var8 < var9 || arg0 == arg3 && var10 < var8) {
                    int var41 = arg4 - arg0;
                    int var42 = arg0 - arg3;
                    int var43 = this.field2775 * arg3;
                    while (true) {
                        var42--;
                        if (var42 < 0) {
                            while (true) {
                                var41--;
                                if (var41 < 0) {
                                    return;
                                }
                                class379.method2341(this.field2781, var43, var39 >> 16, 98, 0, var40 >> 16);
                                var40 += var10;
                                var39 += var8;
                                var43 += this.field2775;
                            }
                        }
                        class379.method2341(this.field2781, var43, var39 >> 16, 126, 0, var38 >> 16);
                        var38 += var9;
                        var39 += var8;
                        var43 += this.field2775;
                    }
                } else {
                    int var44 = arg4 - arg0;
                    int var45 = arg0 - arg3;
                    int var46 = this.field2775 * arg3;
                    while (true) {
                        var45--;
                        if (var45 < 0) {
                            while (true) {
                                var44--;
                                if (var44 < 0) {
                                    return;
                                }
                                class379.method2341(this.field2781, var46, var40 >> 16, -62, 0, var39 >> 16);
                                var40 += var10;
                                var46 += this.field2775;
                                var39 += var8;
                            }
                        }
                        class379.method2341(this.field2781, var46, var38 >> 16, 125, 0, var39 >> 16);
                        var46 += this.field2775;
                        var39 += var8;
                        var38 += var9;
                    }
                }
            }
        } else if (arg3 <= arg4) {
            int var47;
            int var48 = var47 = arg5 << 16;
            if (arg0 < 0) {
                var48 -= arg0 * var9;
                var47 -= arg0 * var10;
                arg0 = 0;
            }
            int var49 = arg2 << 16;
            if (arg3 < 0) {
                var49 -= arg3 * var8;
                arg3 = 0;
            }
            if (var10 <= var9) {
                int var50 = arg4 - arg3;
                int var51 = arg3 - arg0;
                int var52 = this.field2775 * arg0;
                while (true) {
                    var51--;
                    if (var51 < 0) {
                        while (true) {
                            var50--;
                            if (var50 < 0) {
                                return;
                            }
                            class379.method2341(this.field2781, var52, var47 >> 16, 109, 0, var49 >> 16);
                            var49 += var8;
                            var52 += this.field2775;
                            var47 += var10;
                        }
                    }
                    class379.method2341(this.field2781, var52, var47 >> 16, 98, 0, var48 >> 16);
                    var48 += var9;
                    var52 += this.field2775;
                    var47 += var10;
                }
            } else {
                int var53 = arg4 - arg3;
                int var54 = arg3 - arg0;
                int var55 = this.field2775 * arg0;
                while (true) {
                    var54--;
                    if (var54 < 0) {
                        while (true) {
                            var53--;
                            if (var53 < 0) {
                                return;
                            }
                            class379.method2341(this.field2781, var55, var49 >> 16, -106, 0, var47 >> 16);
                            var49 += var8;
                            var47 += var10;
                            var55 += this.field2775;
                        }
                    }
                    class379.method2341(this.field2781, var55, var48 >> 16, -72, 0, var47 >> 16);
                    var47 += var10;
                    var55 += this.field2775;
                    var48 += var9;
                }
            }
        } else {
            int var56;
            int var57 = var56 = arg5 << 16;
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
            if (var10 <= var9) {
                int var59 = arg3 - arg4;
                int var60 = arg4 - arg0;
                int var61 = this.field2775 * arg0;
                while (true) {
                    var60--;
                    if (var60 < 0) {
                        while (true) {
                            var59--;
                            if (var59 < 0) {
                                return;
                            }
                            class379.method2341(this.field2781, var61, var58 >> 16, 90, 0, var57 >> 16);
                            var57 += var9;
                            var58 += var8;
                            var61 += this.field2775;
                        }
                    }
                    class379.method2341(this.field2781, var61, var56 >> 16, 106, 0, var57 >> 16);
                    var61 += this.field2775;
                    var57 += var9;
                    var56 += var10;
                }
            } else {
                int var62 = arg3 - arg4;
                int var63 = arg4 - arg0;
                int var64 = this.field2775 * arg0;
                while (true) {
                    var63--;
                    if (var63 < 0) {
                        while (true) {
                            var62--;
                            if (var62 < 0) {
                                return;
                            }
                            class379.method2341(this.field2781, var64, var57 >> 16, 108, 0, var58 >> 16);
                            var64 += this.field2775;
                            var58 += var8;
                            var57 += var9;
                        }
                    }
                    class379.method2341(this.field2781, var64, var57 >> 16, 118, 0, var56 >> 16);
                    var64 += this.field2775;
                    var56 += var10;
                    var57 += var9;
                }
            }
        }
    }

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(Lwk;II)V")
    public class184(class151 arg0, int arg1, int arg2) {
        this.field2781 = new byte[arg1 * arg2];
    }
}
