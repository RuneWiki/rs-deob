import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class198 extends class485 {

    @OriginalMember(owner = "client!fa", name = "w", descriptor = "[B")
    public byte[] field2914;

    @OriginalMember(owner = "client!fa", name = "B", descriptor = "[Lfd;")
    public static class451[] field2919 = new class451[4];

    @OriginalMember(owner = "client!fa", name = "G", descriptor = "F")
    public static float field2924;

    @OriginalMember(owner = "client!fa", name = "x", descriptor = "I")
    public static int field2915;

    @OriginalMember(owner = "client!fa", name = "y", descriptor = "I")
    public int field2916;

    @OriginalMember(owner = "client!fa", name = "z", descriptor = "I")
    public int field2917;

    @OriginalMember(owner = "client!fa", name = "A", descriptor = "I")
    public int field2918;

    @OriginalMember(owner = "client!fa", name = "C", descriptor = "I")
    public static int field2920;

    @OriginalMember(owner = "client!fa", name = "D", descriptor = "I")
    public static int field2921;

    @OriginalMember(owner = "client!fa", name = "E", descriptor = "I")
    public static int field2922;

    @OriginalMember(owner = "client!fa", name = "F", descriptor = "I")
    public int field2923;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIIBIII)V")
    public final void method1329(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        field2921++;
        if (arg3 > -7) {
            return;
        }
        int var8 = 0;
        if (arg1 != arg6) {
            var8 = (arg5 - arg4 << 16) / (arg1 - arg6);
        }
        int var9 = 0;
        if (arg0 != arg1) {
            var9 = (arg2 - arg5 << 16) / (arg0 - arg1);
        }
        int var10 = 0;
        if (arg0 != arg6) {
            var10 = (arg4 - arg2 << 16) / (arg6 - arg0);
        }
        if (arg6 <= arg1 && arg0 >= arg6) {
            if (arg1 < arg0) {
                int var11;
                int var12 = var11 = arg4 << 16;
                if (arg6 < 0) {
                    var12 -= arg6 * var10;
                    var11 -= arg6 * var8;
                    arg6 = 0;
                }
                int var13 = arg5 << 16;
                if (arg1 < 0) {
                    var13 -= arg1 * var9;
                    arg1 = 0;
                }
                if ((arg1 == arg6 || var8 <= var10) && (arg1 != arg6 || var10 <= var9)) {
                    int var17 = arg0 - arg1;
                    int var18 = arg1 - arg6;
                    int var19 = this.field2918 * arg6;
                    while (true) {
                        var18--;
                        if (var18 < 0) {
                            while (true) {
                                var17--;
                                if (var17 < 0) {
                                    return;
                                }
                                class130.method910(var12 >> 16, var19, var13 >> 16, 0, this.field2914, (byte) 113);
                                var19 += this.field2918;
                                var13 += var9;
                                var12 += var10;
                            }
                        }
                        class130.method910(var12 >> 16, var19, var11 >> 16, 0, this.field2914, (byte) 124);
                        var12 += var10;
                        var19 += this.field2918;
                        var11 += var8;
                    }
                } else {
                    int var14 = arg0 - arg1;
                    int var15 = arg1 - arg6;
                    int var16 = this.field2918 * arg6;
                    while (true) {
                        var15--;
                        if (var15 < 0) {
                            while (true) {
                                var14--;
                                if (var14 < 0) {
                                    return;
                                }
                                class130.method910(var13 >> 16, var16, var12 >> 16, 0, this.field2914, (byte) 123);
                                var12 += var10;
                                var13 += var9;
                                var16 += this.field2918;
                            }
                        }
                        class130.method910(var11 >> 16, var16, var12 >> 16, 0, this.field2914, (byte) 117);
                        var16 += this.field2918;
                        var11 += var8;
                        var12 += var10;
                    }
                }
            } else {
                int var20;
                int var21 = var20 = arg4 << 16;
                if (arg6 < 0) {
                    var21 -= arg6 * var10;
                    var20 -= arg6 * var8;
                    arg6 = 0;
                }
                int var22 = arg2 << 16;
                if (arg0 < 0) {
                    var22 -= arg0 * var9;
                    arg0 = 0;
                }
                if (arg0 != arg6 && var10 < var8 || arg0 == arg6 && var9 > var8) {
                    int var23 = arg1 - arg0;
                    int var24 = arg0 - arg6;
                    int var25 = this.field2918 * arg6;
                    while (true) {
                        var24--;
                        if (var24 < 0) {
                            while (true) {
                                var23--;
                                if (var23 < 0) {
                                    return;
                                }
                                class130.method910(var20 >> 16, var25, var22 >> 16, 0, this.field2914, (byte) 126);
                                var20 += var8;
                                var22 += var9;
                                var25 += this.field2918;
                            }
                        }
                        class130.method910(var20 >> 16, var25, var21 >> 16, 0, this.field2914, (byte) 119);
                        var20 += var8;
                        var21 += var10;
                        var25 += this.field2918;
                    }
                } else {
                    int var26 = arg1 - arg0;
                    int var27 = arg0 - arg6;
                    int var28 = this.field2918 * arg6;
                    while (true) {
                        var27--;
                        if (var27 < 0) {
                            while (true) {
                                var26--;
                                if (var26 < 0) {
                                    return;
                                }
                                class130.method910(var22 >> 16, var28, var20 >> 16, 0, this.field2914, (byte) 116);
                                var28 += this.field2918;
                                var20 += var8;
                                var22 += var9;
                            }
                        }
                        class130.method910(var21 >> 16, var28, var20 >> 16, 0, this.field2914, (byte) 113);
                        var21 += var10;
                        var20 += var8;
                        var28 += this.field2918;
                    }
                }
            }
        } else if (arg0 >= arg1) {
            if (arg6 <= arg0) {
                int var29;
                int var30 = var29 = arg5 << 16;
                if (arg1 < 0) {
                    var30 -= arg1 * var8;
                    var29 -= arg1 * var9;
                    arg1 = 0;
                }
                int var31 = arg4 << 16;
                if (arg6 < 0) {
                    var31 -= arg6 * var10;
                    arg6 = 0;
                }
                if (var9 <= var8) {
                    int var32 = arg0 - arg6;
                    int var33 = arg6 - arg1;
                    int var34 = this.field2918 * arg1;
                    while (true) {
                        var33--;
                        if (var33 < 0) {
                            while (true) {
                                var32--;
                                if (var32 < 0) {
                                    return;
                                }
                                class130.method910(var31 >> 16, var34, var29 >> 16, 0, this.field2914, (byte) 124);
                                var34 += this.field2918;
                                var29 += var9;
                                var31 += var10;
                            }
                        }
                        class130.method910(var30 >> 16, var34, var29 >> 16, 0, this.field2914, (byte) 127);
                        var29 += var9;
                        var30 += var8;
                        var34 += this.field2918;
                    }
                } else {
                    int var35 = arg0 - arg6;
                    int var36 = arg6 - arg1;
                    int var37 = this.field2918 * arg1;
                    while (true) {
                        var36--;
                        if (var36 < 0) {
                            while (true) {
                                var35--;
                                if (var35 < 0) {
                                    return;
                                }
                                class130.method910(var29 >> 16, var37, var31 >> 16, 0, this.field2914, (byte) 116);
                                var37 += this.field2918;
                                var31 += var10;
                                var29 += var9;
                            }
                        }
                        class130.method910(var29 >> 16, var37, var30 >> 16, 0, this.field2914, (byte) 126);
                        var30 += var8;
                        var29 += var9;
                        var37 += this.field2918;
                    }
                }
            } else {
                int var38;
                int var39 = var38 = arg5 << 16;
                int var40 = arg2 << 16;
                if (arg1 < 0) {
                    var39 -= arg1 * var8;
                    var38 -= arg1 * var9;
                    arg1 = 0;
                }
                if (arg0 < 0) {
                    var40 -= arg0 * var10;
                    arg0 = 0;
                }
                if (arg0 != arg1 && var9 > var8 || arg0 == arg1 && var10 < var8) {
                    int var41 = arg6 - arg0;
                    int var42 = arg0 - arg1;
                    int var43 = this.field2918 * arg1;
                    while (true) {
                        var42--;
                        if (var42 < 0) {
                            while (true) {
                                var41--;
                                if (var41 < 0) {
                                    return;
                                }
                                class130.method910(var40 >> 16, var43, var39 >> 16, 0, this.field2914, (byte) 113);
                                var39 += var8;
                                var43 += this.field2918;
                                var40 += var10;
                            }
                        }
                        class130.method910(var38 >> 16, var43, var39 >> 16, 0, this.field2914, (byte) 115);
                        var39 += var8;
                        var43 += this.field2918;
                        var38 += var9;
                    }
                } else {
                    int var44 = arg6 - arg0;
                    int var45 = arg0 - arg1;
                    int var46 = this.field2918 * arg1;
                    while (true) {
                        var45--;
                        if (var45 < 0) {
                            while (true) {
                                var44--;
                                if (var44 < 0) {
                                    return;
                                }
                                class130.method910(var39 >> 16, var46, var40 >> 16, 0, this.field2914, (byte) 121);
                                var39 += var8;
                                var40 += var10;
                                var46 += this.field2918;
                            }
                        }
                        class130.method910(var39 >> 16, var46, var38 >> 16, 0, this.field2914, (byte) 113);
                        var38 += var9;
                        var46 += this.field2918;
                        var39 += var8;
                    }
                }
            }
        } else if (arg6 < arg1) {
            int var47;
            int var48 = var47 = arg2 << 16;
            if (arg0 < 0) {
                var48 -= arg0 * var9;
                var47 -= arg0 * var10;
                arg0 = 0;
            }
            int var49 = arg4 << 16;
            if (arg6 < 0) {
                var49 -= arg6 * var8;
                arg6 = 0;
            }
            if (var9 < var10) {
                int var50 = arg1 - arg6;
                int var51 = arg6 - arg0;
                int var52 = this.field2918 * arg0;
                while (true) {
                    var51--;
                    if (var51 < 0) {
                        while (true) {
                            var50--;
                            if (var50 < 0) {
                                return;
                            }
                            class130.method910(var49 >> 16, var52, var48 >> 16, 0, this.field2914, (byte) 115);
                            var48 += var9;
                            var49 += var8;
                            var52 += this.field2918;
                        }
                    }
                    class130.method910(var47 >> 16, var52, var48 >> 16, 0, this.field2914, (byte) 127);
                    var52 += this.field2918;
                    var47 += var10;
                    var48 += var9;
                }
            } else {
                int var53 = arg1 - arg6;
                int var54 = arg6 - arg0;
                int var55 = this.field2918 * arg0;
                while (true) {
                    var54--;
                    if (var54 < 0) {
                        while (true) {
                            var53--;
                            if (var53 < 0) {
                                return;
                            }
                            class130.method910(var48 >> 16, var55, var49 >> 16, 0, this.field2914, (byte) 113);
                            var55 += this.field2918;
                            var49 += var8;
                            var48 += var9;
                        }
                    }
                    class130.method910(var48 >> 16, var55, var47 >> 16, 0, this.field2914, (byte) 125);
                    var55 += this.field2918;
                    var48 += var9;
                    var47 += var10;
                }
            }
        } else {
            int var56;
            int var57 = var56 = arg2 << 16;
            if (arg0 < 0) {
                var57 -= arg0 * var9;
                var56 -= arg0 * var10;
                arg0 = 0;
            }
            int var58 = arg5 << 16;
            if (arg1 < 0) {
                var58 -= arg1 * var8;
                arg1 = 0;
            }
            if (var10 <= var9) {
                int var59 = arg6 - arg1;
                int var60 = arg1 - arg0;
                int var61 = this.field2918 * arg0;
                while (true) {
                    var60--;
                    if (var60 < 0) {
                        while (true) {
                            var59--;
                            if (var59 < 0) {
                                return;
                            }
                            class130.method910(var58 >> 16, var61, var56 >> 16, 0, this.field2914, (byte) 118);
                            var56 += var10;
                            var61 += this.field2918;
                            var58 += var8;
                        }
                    }
                    class130.method910(var57 >> 16, var61, var56 >> 16, 0, this.field2914, (byte) 119);
                    var57 += var9;
                    var56 += var10;
                    var61 += this.field2918;
                }
            } else {
                int var62 = arg6 - arg1;
                int var63 = arg1 - arg0;
                int var64 = this.field2918 * arg0;
                while (true) {
                    var63--;
                    if (var63 < 0) {
                        while (true) {
                            var62--;
                            if (var62 < 0) {
                                return;
                            }
                            class130.method910(var56 >> 16, var64, var58 >> 16, 0, this.field2914, (byte) 113);
                            var56 += var10;
                            var58 += var8;
                            var64 += this.field2918;
                        }
                    }
                    class130.method910(var56 >> 16, var64, var57 >> 16, 0, this.field2914, (byte) 122);
                    var57 += var9;
                    var56 += var10;
                    var64 += this.field2918;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)V")
    public final void method1330(int arg0) {
        field2915++;
        int var2 = -1;
        int var3 = this.field2914.length + arg0;
        while (var2 < var3) {
            var2++;
            this.field2914[var2] = 0;
            var2++;
            this.field2914[var2] = 0;
            var2++;
            this.field2914[var2] = 0;
            var2++;
            this.field2914[var2] = 0;
            var2++;
            this.field2914[var2] = 0;
            var2++;
            this.field2914[var2] = 0;
            var2++;
            this.field2914[var2] = 0;
            var2++;
            this.field2914[var2] = 0;
        }
        while (var2 < this.field2914.length - 1) {
            var2++;
            this.field2914[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(Z)V")
    public static void method1331(boolean arg0) {
        field2919 = null;
        if (!arg0) {
            field2924 = -1.0863485F;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(III)Z")
    public final boolean method1332(int arg0, int arg1, int arg2) {
        if (arg1 >= -62) {
            this.method1333(78, -45, -62, 75, -127);
        }
        field2920++;
        return this.field2914.length >= arg0 * arg2;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIIII)V")
    public final void method1333(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field2916 = arg1;
        this.field2917 = arg4 - arg1;
        field2922++;
        this.field2923 = arg0;
        if (arg2 <= 58) {
            this.field2916 = 107;
        }
        this.field2918 = arg3 - arg0;
    }

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(Lte;II)V")
    public class198(class527 arg0, int arg1, int arg2) {
        this.field2914 = new byte[arg1 * arg2];
    }
}
