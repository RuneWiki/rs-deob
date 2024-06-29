import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class348 extends class54 {

    @OriginalMember(owner = "client!uj", name = "I", descriptor = "[B")
    public byte[] field5054;

    @OriginalMember(owner = "client!uj", name = "y", descriptor = "I")
    public int field5045;

    @OriginalMember(owner = "client!uj", name = "z", descriptor = "I")
    public static int field5046;

    @OriginalMember(owner = "client!uj", name = "A", descriptor = "I")
    public static int field5047;

    @OriginalMember(owner = "client!uj", name = "B", descriptor = "I")
    public static int field5048;

    @OriginalMember(owner = "client!uj", name = "C", descriptor = "I")
    public int field5049;

    @OriginalMember(owner = "client!uj", name = "D", descriptor = "I")
    public int field5050;

    @OriginalMember(owner = "client!uj", name = "E", descriptor = "I")
    public int field5051;

    @OriginalMember(owner = "client!uj", name = "F", descriptor = "I")
    public static int field5052;

    @OriginalMember(owner = "client!uj", name = "G", descriptor = "I")
    public static int field5053;

    @OriginalMember(owner = "client!uj", name = "J", descriptor = "I")
    public static int field5055;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIIII)V", line = 9)
    public final void method2147(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5048++;
        this.field5050 = arg3 - arg1;
        this.field5051 = arg4 - arg0;
        this.field5049 = arg0;
        this.field5045 = arg1;
        int var6 = 14 % ((arg2 + 55) / 48);
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIIIIII)V", line = 26)
    public static final void method2148(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field5055++;
        class108.method851(arg0, -14417);
        int var7 = arg5;
        int var8 = arg0 - arg3;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg0;
        int var10 = -arg0;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        int[] var15 = class651.field9125[arg1];
        int var16 = arg6 - var8;
        int var17 = arg6 + var8;
        class58.method623(arg4, var16, 23309, var15, arg6 - arg0);
        class58.method623(arg2, var17, 23309, var15, var16);
        class58.method623(arg4, arg0 + arg6, arg5 + 23309, var15, var17);
        while (var7 < var9) {
            var13 += 2;
            var14 += 2;
            var10 += var13;
            var12 += var14;
            if (var12 >= 0 && var11 >= 1) {
                class443.field6454[var11] = var7;
                var11--;
                var12 -= var11 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                if (var8 > var9) {
                    int[] var18 = class651.field9125[arg1 + var9];
                    int[] var19 = class651.field9125[arg1 - var9];
                    int var20 = class443.field6454[var9];
                    int var21 = arg6 + var7;
                    int var22 = arg6 - var7;
                    int var23 = arg6 + var20;
                    int var24 = arg6 - var20;
                    class58.method623(arg4, var24, 23309, var18, var22);
                    class58.method623(arg2, var23, arg5 + 23309, var18, var24);
                    class58.method623(arg4, var21, 23309, var18, var23);
                    class58.method623(arg4, var24, 23309, var19, var22);
                    class58.method623(arg2, var23, arg5 ^ 0x5B0D, var19, var24);
                    class58.method623(arg4, var21, 23309, var19, var23);
                } else {
                    int[] var25 = class651.field9125[arg1 + var9];
                    int[] var26 = class651.field9125[arg1 - var9];
                    int var27 = arg6 + var7;
                    int var28 = arg6 - var7;
                    class58.method623(arg4, var27, 23309, var25, var28);
                    class58.method623(arg4, var27, 23309, var26, var28);
                }
                var10 -= var9 << 1;
            }
            int[] var29 = class651.field9125[arg1 + var7];
            int[] var30 = class651.field9125[arg1 - var7];
            int var31 = arg6 + var9;
            int var32 = arg6 - var9;
            if (var8 <= var7) {
                class58.method623(arg4, var31, arg5 ^ 0x5B0D, var29, var32);
                class58.method623(arg4, var31, 23309, var30, var32);
            } else {
                int var33 = var11 < var7 ? class443.field6454[var7] : var11;
                int var34 = arg6 + var33;
                int var35 = arg6 - var33;
                class58.method623(arg4, var35, arg5 + 23309, var29, var32);
                class58.method623(arg2, var34, 23309, var29, var35);
                class58.method623(arg4, var31, 23309, var29, var34);
                class58.method623(arg4, var35, 23309, var30, var32);
                class58.method623(arg2, var34, 23309, var30, var35);
                class58.method623(arg4, var31, 23309, var30, var34);
            }
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(ILpu;)V", line = 152)
    public static final void method2149(int arg0, class522 arg1) {
        class680.field9605 = 0;
        if (arg0 != 23252) {
            return;
        }
        field5052++;
        class564.field7954 = 0;
        class448.field6482 = new class392();
        class21.field280 = new class543[1024];
        class64.field1214 = new class29[class60.field1140[class546.field7679] + 1];
        class98.field1546 = 0;
        class505.field7143 = 0;
        class548.method3101(arg1, 0);
        class505.method2900(arg1, 280013408);
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(IIIIIII)V", line = 174)
    public final void method2150(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field5046++;
        int var8 = 0;
        if (arg3 != arg6) {
            var8 = (arg4 - arg2 << 16) / (arg3 - arg6);
        }
        int var9 = 0;
        if (arg3 != arg5) {
            var9 = (arg1 - arg4 << 16) / (arg5 - arg3);
        }
        int var10 = 0;
        int var11 = -61 % ((arg0 + 71) / 50);
        if (arg5 != arg6) {
            var10 = (arg2 - arg1 << 16) / (arg6 - arg5);
        }
        if (arg6 <= arg3 && arg5 >= arg6) {
            if (arg3 >= arg5) {
                int var12;
                int var13 = var12 = arg2 << 16;
                int var14 = arg1 << 16;
                if (arg6 < 0) {
                    var12 -= arg6 * var8;
                    var13 -= arg6 * var10;
                    arg6 = 0;
                }
                if (arg5 < 0) {
                    var14 -= arg5 * var9;
                    arg5 = 0;
                }
                if ((arg5 == arg6 || var8 <= var10) && (arg5 != arg6 || var8 >= var9)) {
                    int var18 = arg3 - arg5;
                    int var19 = arg5 - arg6;
                    int var20 = this.field5050 * arg6;
                    while (true) {
                        var19--;
                        if (var19 < 0) {
                            while (true) {
                                var18--;
                                if (var18 < 0) {
                                    return;
                                }
                                class158.method1099(var20, var14 >> 16, 0, -110, var12 >> 16, this.field5054);
                                var12 += var8;
                                var14 += var9;
                                var20 += this.field5050;
                            }
                        }
                        class158.method1099(var20, var13 >> 16, 0, -112, var12 >> 16, this.field5054);
                        var13 += var10;
                        var12 += var8;
                        var20 += this.field5050;
                    }
                } else {
                    int var15 = arg3 - arg5;
                    int var16 = arg5 - arg6;
                    int var17 = this.field5050 * arg6;
                    while (true) {
                        var16--;
                        if (var16 < 0) {
                            while (true) {
                                var15--;
                                if (var15 < 0) {
                                    return;
                                }
                                class158.method1099(var17, var12 >> 16, 0, -116, var14 >> 16, this.field5054);
                                var17 += this.field5050;
                                var14 += var9;
                                var12 += var8;
                            }
                        }
                        class158.method1099(var17, var12 >> 16, 0, -128, var13 >> 16, this.field5054);
                        var12 += var8;
                        var17 += this.field5050;
                        var13 += var10;
                    }
                }
            } else {
                int var21;
                int var22 = var21 = arg2 << 16;
                int var23 = arg4 << 16;
                if (arg6 < 0) {
                    var22 -= arg6 * var10;
                    var21 -= arg6 * var8;
                    arg6 = 0;
                }
                if (arg3 < 0) {
                    var23 -= arg3 * var9;
                    arg3 = 0;
                }
                if (arg3 != arg6 && var8 > var10 || arg3 == arg6 && var9 < var10) {
                    int var24 = arg5 - arg3;
                    int var25 = arg3 - arg6;
                    int var26 = this.field5050 * arg6;
                    while (true) {
                        var25--;
                        if (var25 < 0) {
                            while (true) {
                                var24--;
                                if (var24 < 0) {
                                    return;
                                }
                                class158.method1099(var26, var23 >> 16, 0, -120, var22 >> 16, this.field5054);
                                var26 += this.field5050;
                                var22 += var10;
                                var23 += var9;
                            }
                        }
                        class158.method1099(var26, var21 >> 16, 0, -115, var22 >> 16, this.field5054);
                        var26 += this.field5050;
                        var22 += var10;
                        var21 += var8;
                    }
                } else {
                    int var27 = arg5 - arg3;
                    int var28 = arg3 - arg6;
                    int var29 = this.field5050 * arg6;
                    while (true) {
                        var28--;
                        if (var28 < 0) {
                            while (true) {
                                var27--;
                                if (var27 < 0) {
                                    return;
                                }
                                class158.method1099(var29, var22 >> 16, 0, -109, var23 >> 16, this.field5054);
                                var22 += var10;
                                var23 += var9;
                                var29 += this.field5050;
                            }
                        }
                        class158.method1099(var29, var22 >> 16, 0, -116, var21 >> 16, this.field5054);
                        var21 += var8;
                        var29 += this.field5050;
                        var22 += var10;
                    }
                }
            }
        } else if (arg3 > arg5) {
            if (arg6 >= arg3) {
                int var30;
                int var31 = var30 = arg1 << 16;
                if (arg5 < 0) {
                    var30 -= arg5 * var10;
                    var31 -= arg5 * var9;
                    arg5 = 0;
                }
                int var32 = arg4 << 16;
                if (arg3 < 0) {
                    var32 -= arg3 * var8;
                    arg3 = 0;
                }
                if (var10 <= var9) {
                    int var33 = arg6 - arg3;
                    int var34 = arg3 - arg5;
                    int var35 = this.field5050 * arg5;
                    while (true) {
                        var34--;
                        if (var34 < 0) {
                            while (true) {
                                var33--;
                                if (var33 < 0) {
                                    return;
                                }
                                class158.method1099(var35, var32 >> 16, 0, -128, var30 >> 16, this.field5054);
                                var32 += var8;
                                var30 += var10;
                                var35 += this.field5050;
                            }
                        }
                        class158.method1099(var35, var31 >> 16, 0, -126, var30 >> 16, this.field5054);
                        var31 += var9;
                        var35 += this.field5050;
                        var30 += var10;
                    }
                } else {
                    int var36 = arg6 - arg3;
                    int var37 = arg3 - arg5;
                    int var38 = this.field5050 * arg5;
                    while (true) {
                        var37--;
                        if (var37 < 0) {
                            while (true) {
                                var36--;
                                if (var36 < 0) {
                                    return;
                                }
                                class158.method1099(var38, var30 >> 16, 0, -115, var32 >> 16, this.field5054);
                                var38 += this.field5050;
                                var32 += var8;
                                var30 += var10;
                            }
                        }
                        class158.method1099(var38, var30 >> 16, 0, -127, var31 >> 16, this.field5054);
                        var30 += var10;
                        var31 += var9;
                        var38 += this.field5050;
                    }
                }
            } else {
                int var39;
                int var40 = var39 = arg1 << 16;
                int var41 = arg2 << 16;
                if (arg5 < 0) {
                    var40 -= arg5 * var9;
                    var39 -= arg5 * var10;
                    arg5 = 0;
                }
                if (arg6 < 0) {
                    var41 -= arg6 * var8;
                    arg6 = 0;
                }
                if (var10 > var9) {
                    int var42 = arg3 - arg6;
                    int var43 = arg6 - arg5;
                    int var44 = this.field5050 * arg5;
                    while (true) {
                        var43--;
                        if (var43 < 0) {
                            while (true) {
                                var42--;
                                if (var42 < 0) {
                                    return;
                                }
                                class158.method1099(var44, var41 >> 16, 0, -117, var40 >> 16, this.field5054);
                                var44 += this.field5050;
                                var40 += var9;
                                var41 += var8;
                            }
                        }
                        class158.method1099(var44, var39 >> 16, 0, -117, var40 >> 16, this.field5054);
                        var44 += this.field5050;
                        var40 += var9;
                        var39 += var10;
                    }
                } else {
                    int var45 = arg3 - arg6;
                    int var46 = arg6 - arg5;
                    int var47 = this.field5050 * arg5;
                    while (true) {
                        var46--;
                        if (var46 < 0) {
                            while (true) {
                                var45--;
                                if (var45 < 0) {
                                    return;
                                }
                                class158.method1099(var47, var40 >> 16, 0, -112, var41 >> 16, this.field5054);
                                var41 += var8;
                                var40 += var9;
                                var47 += this.field5050;
                            }
                        }
                        class158.method1099(var47, var40 >> 16, 0, -109, var39 >> 16, this.field5054);
                        var39 += var10;
                        var47 += this.field5050;
                        var40 += var9;
                    }
                }
            }
        } else if (arg5 < arg6) {
            int var48;
            int var49 = var48 = arg4 << 16;
            if (arg3 < 0) {
                var49 -= arg3 * var8;
                var48 -= arg3 * var9;
                arg3 = 0;
            }
            int var50 = arg1 << 16;
            if (arg5 < 0) {
                var50 -= arg5 * var10;
                arg5 = 0;
            }
            if (arg3 != arg5 && var8 < var9 || arg3 == arg5 && var8 > var10) {
                int var51 = arg6 - arg5;
                int var52 = arg5 - arg3;
                int var53 = this.field5050 * arg3;
                while (true) {
                    var52--;
                    if (var52 < 0) {
                        while (true) {
                            var51--;
                            if (var51 < 0) {
                                return;
                            }
                            class158.method1099(var53, var50 >> 16, 0, -117, var49 >> 16, this.field5054);
                            var53 += this.field5050;
                            var50 += var10;
                            var49 += var8;
                        }
                    }
                    class158.method1099(var53, var48 >> 16, 0, -128, var49 >> 16, this.field5054);
                    var48 += var9;
                    var53 += this.field5050;
                    var49 += var8;
                }
            } else {
                int var54 = arg6 - arg5;
                int var55 = arg5 - arg3;
                int var56 = this.field5050 * arg3;
                while (true) {
                    var55--;
                    if (var55 < 0) {
                        while (true) {
                            var54--;
                            if (var54 < 0) {
                                return;
                            }
                            class158.method1099(var56, var49 >> 16, 0, -110, var50 >> 16, this.field5054);
                            var49 += var8;
                            var56 += this.field5050;
                            var50 += var10;
                        }
                    }
                    class158.method1099(var56, var49 >> 16, 0, -123, var48 >> 16, this.field5054);
                    var48 += var9;
                    var56 += this.field5050;
                    var49 += var8;
                }
            }
        } else {
            int var57;
            int var58 = var57 = arg4 << 16;
            if (arg3 < 0) {
                var57 -= arg3 * var9;
                var58 -= arg3 * var8;
                arg3 = 0;
            }
            int var59 = arg2 << 16;
            if (arg6 < 0) {
                var59 -= arg6 * var10;
                arg6 = 0;
            }
            if (var8 >= var9) {
                int var60 = arg5 - arg6;
                int var61 = arg6 - arg3;
                int var62 = this.field5050 * arg3;
                while (true) {
                    var61--;
                    if (var61 < 0) {
                        while (true) {
                            var60--;
                            if (var60 < 0) {
                                return;
                            }
                            class158.method1099(var62, var59 >> 16, 0, -109, var57 >> 16, this.field5054);
                            var59 += var10;
                            var62 += this.field5050;
                            var57 += var9;
                        }
                    }
                    class158.method1099(var62, var58 >> 16, 0, -127, var57 >> 16, this.field5054);
                    var62 += this.field5050;
                    var58 += var8;
                    var57 += var9;
                }
            } else {
                int var63 = arg5 - arg6;
                int var64 = arg6 - arg3;
                int var65 = this.field5050 * arg3;
                while (true) {
                    var64--;
                    if (var64 < 0) {
                        while (true) {
                            var63--;
                            if (var63 < 0) {
                                return;
                            }
                            class158.method1099(var65, var57 >> 16, 0, -124, var59 >> 16, this.field5054);
                            var65 += this.field5050;
                            var59 += var10;
                            var57 += var9;
                        }
                    }
                    class158.method1099(var65, var57 >> 16, 0, -115, var58 >> 16, this.field5054);
                    var57 += var9;
                    var58 += var8;
                    var65 += this.field5050;
                }
            }
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(III)Z", line = 614)
    public final boolean method2151(int arg0, int arg1, int arg2) {
        field5053++;
        if (arg2 >= -82) {
            this.field5051 = -117;
        }
        return arg0 * arg1 <= this.field5054.length;
    }

    @OriginalMember(owner = "client!uj", name = "e", descriptor = "(B)V", line = 630)
    public final void method2152(byte arg0) {
        field5047++;
        int var2 = -1;
        int var3 = this.field5054.length - 8;
        while (var2 < var3) {
            var2++;
            this.field5054[var2] = 0;
            var2++;
            this.field5054[var2] = 0;
            var2++;
            this.field5054[var2] = 0;
            var2++;
            this.field5054[var2] = 0;
            var2++;
            this.field5054[var2] = 0;
            var2++;
            this.field5054[var2] = 0;
            var2++;
            this.field5054[var2] = 0;
            var2++;
            this.field5054[var2] = 0;
        }
        if (arg0 >= -96) {
            this.method2150(114, -18, 126, 15, -6, 38, -66);
        }
        while ((this.field5054.length - 1) > var2) {
            var2++;
            this.field5054[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!uj", name = "<init>", descriptor = "(Lhea;II)V", line = 658)
    public class348(class387 arg0, int arg1, int arg2) {
        this.field5054 = new byte[arg1 * arg2];
    }
}
