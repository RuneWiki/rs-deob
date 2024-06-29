import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class519 extends class192 {

    @OriginalMember(owner = "client!mi", name = "I", descriptor = "[B")
    public byte[] field7419;

    @OriginalMember(owner = "client!mi", name = "M", descriptor = "Z")
    public static boolean field7423 = false;

    @OriginalMember(owner = "client!mi", name = "H", descriptor = "Lofa;")
    public static class345 field7418 = new class345(2);

    @OriginalMember(owner = "client!mi", name = "N", descriptor = "[I")
    public static int[] field7424 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!mi", name = "P", descriptor = "I")
    public static int field7426 = 0;

    @OriginalMember(owner = "client!mi", name = "v", descriptor = "I")
    public static int field7406;

    @OriginalMember(owner = "client!mi", name = "w", descriptor = "I")
    public int field7407;

    @OriginalMember(owner = "client!mi", name = "x", descriptor = "I")
    public static int field7408;

    @OriginalMember(owner = "client!mi", name = "z", descriptor = "I")
    public int field7410;

    @OriginalMember(owner = "client!mi", name = "A", descriptor = "I")
    public static int field7411;

    @OriginalMember(owner = "client!mi", name = "B", descriptor = "I")
    public int field7412;

    @OriginalMember(owner = "client!mi", name = "C", descriptor = "I")
    public static int field7413;

    @OriginalMember(owner = "client!mi", name = "D", descriptor = "I")
    public static int field7414;

    @OriginalMember(owner = "client!mi", name = "E", descriptor = "I")
    public static int field7415;

    @OriginalMember(owner = "client!mi", name = "F", descriptor = "I")
    public static int field7416;

    @OriginalMember(owner = "client!mi", name = "G", descriptor = "I")
    public static int field7417;

    @OriginalMember(owner = "client!mi", name = "J", descriptor = "I")
    public static int field7420;

    @OriginalMember(owner = "client!mi", name = "K", descriptor = "I")
    public int field7421;

    @OriginalMember(owner = "client!mi", name = "L", descriptor = "I")
    public static int field7422;

    @OriginalMember(owner = "client!mi", name = "O", descriptor = "[J")
    public static long[] field7425;

    @OriginalMember(owner = "client!mi", name = "y", descriptor = "[Lcp;")
    public static class753[] field7409;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIIIIII)V")
    public final void method3018(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field7415++;
        int var8 = 0;
        if (arg4 != arg6) {
            var8 = (arg5 - arg0 << 16) / (arg6 - arg4);
        }
        int var9 = 0;
        if (arg2 != arg6) {
            var9 = (arg3 - arg5 << 16) / (arg2 - arg6);
        }
        int var10 = arg1;
        if (arg2 != arg4) {
            var10 = (arg0 - arg3 << 16) / (arg4 - arg2);
        }
        if (arg6 >= arg4 && arg4 <= arg2) {
            if (arg2 > arg6) {
                int var11;
                int var12 = var11 = arg0 << 16;
                if (arg4 < 0) {
                    var12 -= arg4 * var10;
                    var11 -= arg4 * var8;
                    arg4 = 0;
                }
                int var13 = arg5 << 16;
                if (arg6 < 0) {
                    var13 -= arg6 * var9;
                    arg6 = 0;
                }
                if ((arg4 == arg6 || var10 >= var8) && (arg4 != arg6 || var9 >= var10)) {
                    int var17 = arg2 - arg6;
                    int var18 = arg6 - arg4;
                    int var19 = this.field7410 * arg4;
                    while (true) {
                        var18--;
                        if (var18 < 0) {
                            while (true) {
                                var17--;
                                if (var17 < 0) {
                                    return;
                                }
                                class480.method2817(this.field7419, 0, var13 >> 16, var12 >> 16, var19, (byte) 101);
                                var19 += this.field7410;
                                var12 += var10;
                                var13 += var9;
                            }
                        }
                        class480.method2817(this.field7419, 0, var11 >> 16, var12 >> 16, var19, (byte) -122);
                        var19 += this.field7410;
                        var12 += var10;
                        var11 += var8;
                    }
                } else {
                    int var14 = arg2 - arg6;
                    int var15 = arg6 - arg4;
                    int var16 = this.field7410 * arg4;
                    while (true) {
                        var15--;
                        if (var15 < 0) {
                            while (true) {
                                var14--;
                                if (var14 < 0) {
                                    return;
                                }
                                class480.method2817(this.field7419, 0, var12 >> 16, var13 >> 16, var16, (byte) -117);
                                var16 += this.field7410;
                                var12 += var10;
                                var13 += var9;
                            }
                        }
                        class480.method2817(this.field7419, 0, var12 >> 16, var11 >> 16, var16, (byte) -50);
                        var12 += var10;
                        var11 += var8;
                        var16 += this.field7410;
                    }
                }
            } else {
                int var20;
                int var21 = var20 = arg0 << 16;
                if (arg4 < 0) {
                    var21 -= arg4 * var10;
                    var20 -= arg4 * var8;
                    arg4 = 0;
                }
                int var22 = arg3 << 16;
                if (arg2 < 0) {
                    var22 -= arg2 * var9;
                    arg2 = 0;
                }
                if (arg2 != arg4 && var10 < var8 || arg2 == arg4 && var8 < var9) {
                    int var23 = arg6 - arg2;
                    int var24 = arg2 - arg4;
                    int var25 = this.field7410 * arg4;
                    while (true) {
                        var24--;
                        if (var24 < 0) {
                            while (true) {
                                var23--;
                                if (var23 < 0) {
                                    return;
                                }
                                class480.method2817(this.field7419, 0, var22 >> 16, var20 >> 16, var25, (byte) -40);
                                var25 += this.field7410;
                                var22 += var9;
                                var20 += var8;
                            }
                        }
                        class480.method2817(this.field7419, 0, var21 >> 16, var20 >> 16, var25, (byte) 121);
                        var21 += var10;
                        var25 += this.field7410;
                        var20 += var8;
                    }
                } else {
                    int var26 = arg6 - arg2;
                    int var27 = arg2 - arg4;
                    int var28 = this.field7410 * arg4;
                    while (true) {
                        var27--;
                        if (var27 < 0) {
                            while (true) {
                                var26--;
                                if (var26 < 0) {
                                    return;
                                }
                                class480.method2817(this.field7419, 0, var20 >> 16, var22 >> 16, var28, (byte) 91);
                                var20 += var8;
                                var28 += this.field7410;
                                var22 += var9;
                            }
                        }
                        class480.method2817(this.field7419, 0, var20 >> 16, var21 >> 16, var28, (byte) 97);
                        var28 += this.field7410;
                        var21 += var10;
                        var20 += var8;
                    }
                }
            }
        } else if (arg6 > arg2) {
            if (arg6 > arg4) {
                int var29;
                int var30 = var29 = arg3 << 16;
                if (arg2 < 0) {
                    var29 -= arg2 * var10;
                    var30 -= arg2 * var9;
                    arg2 = 0;
                }
                int var31 = arg0 << 16;
                if (arg4 < 0) {
                    var31 -= arg4 * var8;
                    arg4 = 0;
                }
                if (var10 > var9) {
                    int var32 = arg6 - arg4;
                    int var33 = arg4 - arg2;
                    int var34 = this.field7410 * arg2;
                    while (true) {
                        var33--;
                        if (var33 < 0) {
                            while (true) {
                                var32--;
                                if (var32 < 0) {
                                    return;
                                }
                                class480.method2817(this.field7419, 0, var30 >> 16, var31 >> 16, var34, (byte) -47);
                                var30 += var9;
                                var34 += this.field7410;
                                var31 += var8;
                            }
                        }
                        class480.method2817(this.field7419, 0, var30 >> 16, var29 >> 16, var34, (byte) -37);
                        var34 += this.field7410;
                        var29 += var10;
                        var30 += var9;
                    }
                } else {
                    int var35 = arg6 - arg4;
                    int var36 = arg4 - arg2;
                    int var37 = this.field7410 * arg2;
                    while (true) {
                        var36--;
                        if (var36 < 0) {
                            while (true) {
                                var35--;
                                if (var35 < 0) {
                                    return;
                                }
                                class480.method2817(this.field7419, 0, var31 >> 16, var30 >> 16, var37, (byte) -116);
                                var30 += var9;
                                var37 += this.field7410;
                                var31 += var8;
                            }
                        }
                        class480.method2817(this.field7419, 0, var29 >> 16, var30 >> 16, var37, (byte) 98);
                        var29 += var10;
                        var30 += var9;
                        var37 += this.field7410;
                    }
                }
            } else {
                int var38;
                int var39 = var38 = arg3 << 16;
                if (arg2 < 0) {
                    var38 -= arg2 * var10;
                    var39 -= arg2 * var9;
                    arg2 = 0;
                }
                int var40 = arg5 << 16;
                if (arg6 < 0) {
                    var40 -= arg6 * var8;
                    arg6 = 0;
                }
                if (var9 < var10) {
                    int var41 = arg4 - arg6;
                    int var42 = arg6 - arg2;
                    int var43 = this.field7410 * arg2;
                    while (true) {
                        var42--;
                        if (var42 < 0) {
                            while (true) {
                                var41--;
                                if (var41 < 0) {
                                    return;
                                }
                                class480.method2817(this.field7419, 0, var40 >> 16, var38 >> 16, var43, (byte) 97);
                                var40 += var8;
                                var43 += this.field7410;
                                var38 += var10;
                            }
                        }
                        class480.method2817(this.field7419, 0, var39 >> 16, var38 >> 16, var43, (byte) -49);
                        var38 += var10;
                        var39 += var9;
                        var43 += this.field7410;
                    }
                } else {
                    int var44 = arg4 - arg6;
                    int var45 = arg6 - arg2;
                    int var46 = this.field7410 * arg2;
                    while (true) {
                        var45--;
                        if (var45 < 0) {
                            while (true) {
                                var44--;
                                if (var44 < 0) {
                                    return;
                                }
                                class480.method2817(this.field7419, 0, var38 >> 16, var40 >> 16, var46, (byte) -126);
                                var40 += var8;
                                var46 += this.field7410;
                                var38 += var10;
                            }
                        }
                        class480.method2817(this.field7419, 0, var38 >> 16, var39 >> 16, var46, (byte) -86);
                        var46 += this.field7410;
                        var38 += var10;
                        var39 += var9;
                    }
                }
            }
        } else if (arg2 >= arg4) {
            int var47;
            int var48 = var47 = arg5 << 16;
            if (arg6 < 0) {
                var47 -= arg6 * var9;
                var48 -= arg6 * var8;
                arg6 = 0;
            }
            int var49 = arg0 << 16;
            if (arg4 < 0) {
                var49 -= arg4 * var10;
                arg4 = 0;
            }
            if (var9 > var8) {
                int var50 = arg2 - arg4;
                int var51 = arg4 - arg6;
                int var52 = this.field7410 * arg6;
                while (true) {
                    var51--;
                    if (var51 < 0) {
                        while (true) {
                            var50--;
                            if (var50 < 0) {
                                return;
                            }
                            class480.method2817(this.field7419, 0, var49 >> 16, var47 >> 16, var52, (byte) 92);
                            var47 += var9;
                            var49 += var10;
                            var52 += this.field7410;
                        }
                    }
                    class480.method2817(this.field7419, 0, var48 >> 16, var47 >> 16, var52, (byte) 87);
                    var48 += var8;
                    var52 += this.field7410;
                    var47 += var9;
                }
            } else {
                int var53 = arg2 - arg4;
                int var54 = arg4 - arg6;
                int var55 = this.field7410 * arg6;
                while (true) {
                    var54--;
                    if (var54 < 0) {
                        while (true) {
                            var53--;
                            if (var53 < 0) {
                                return;
                            }
                            class480.method2817(this.field7419, 0, var47 >> 16, var49 >> 16, var55, (byte) 103);
                            var49 += var10;
                            var47 += var9;
                            var55 += this.field7410;
                        }
                    }
                    class480.method2817(this.field7419, 0, var47 >> 16, var48 >> 16, var55, (byte) -116);
                    var47 += var9;
                    var55 += this.field7410;
                    var48 += var8;
                }
            }
        } else {
            int var56;
            int var57 = var56 = arg5 << 16;
            if (arg6 < 0) {
                var57 -= arg6 * var8;
                var56 -= arg6 * var9;
                arg6 = 0;
            }
            int var58 = arg3 << 16;
            if (arg2 < 0) {
                var58 -= arg2 * var10;
                arg2 = 0;
            }
            if ((arg2 == arg6 || var8 >= var9) && (arg2 != arg6 || var10 >= var8)) {
                int var62 = arg4 - arg2;
                int var63 = arg2 - arg6;
                int var64 = this.field7410 * arg6;
                while (true) {
                    var63--;
                    if (var63 < 0) {
                        while (true) {
                            var62--;
                            if (var62 < 0) {
                                return;
                            }
                            class480.method2817(this.field7419, 0, var58 >> 16, var57 >> 16, var64, (byte) 88);
                            var64 += this.field7410;
                            var57 += var8;
                            var58 += var10;
                        }
                    }
                    class480.method2817(this.field7419, 0, var56 >> 16, var57 >> 16, var64, (byte) -41);
                    var57 += var8;
                    var64 += this.field7410;
                    var56 += var9;
                }
            } else {
                int var59 = arg4 - arg2;
                int var60 = arg2 - arg6;
                int var61 = this.field7410 * arg6;
                while (true) {
                    var60--;
                    if (var60 < 0) {
                        while (true) {
                            var59--;
                            if (var59 < 0) {
                                return;
                            }
                            class480.method2817(this.field7419, 0, var57 >> 16, var58 >> 16, var61, (byte) 97);
                            var61 += this.field7410;
                            var58 += var10;
                            var57 += var8;
                        }
                    }
                    class480.method2817(this.field7419, 0, var57 >> 16, var56 >> 16, var61, (byte) -99);
                    var56 += var9;
                    var57 += var8;
                    var61 += this.field7410;
                }
            }
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(II)V")
    public static final void method3019(int arg0, int arg1) {
        class265.field3746 = -1;
        class459.field6580 = arg1;
        class389.field5537 = -1;
        field7416++;
        class79.method601(true);
        if (arg0 != 0) {
            field7425 = null;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(III)Z")
    public final boolean method3020(int arg0, int arg1, int arg2) {
        field7420++;
        if (arg1 != 0) {
            this.method3018(96, 28, -85, 106, -1, -113, 60);
        }
        return arg0 * arg2 <= this.field7419.length;
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(I)V")
    public final void method3021(int arg0) {
        int var2 = 67 / ((-arg0 - 26) / 48);
        field7414++;
        int var3 = -1;
        int var4 = this.field7419.length - 8;
        while (var4 > var3) {
            var3++;
            this.field7419[var3] = 0;
            var3++;
            this.field7419[var3] = 0;
            var3++;
            this.field7419[var3] = 0;
            var3++;
            this.field7419[var3] = 0;
            var3++;
            this.field7419[var3] = 0;
            var3++;
            this.field7419[var3] = 0;
            var3++;
            this.field7419[var3] = 0;
            var3++;
            this.field7419[var3] = 0;
        }
        while (var3 < this.field7419.length - 1) {
            var3++;
            this.field7419[var3] = 0;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(FFIF)F")
    public static final float method3022(float arg0, float arg1, int arg2, float arg3) {
        if (arg2 == -11703) {
            field7422++;
            return (arg0 - arg3) * arg1 + arg3;
        } else {
            return -1.9163814F;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(ILjava/lang/String;I)I")
    public static final int method3023(int arg0, String arg1, int arg2) {
        if (arg2 == 0) {
            field7417++;
            return class350.method2209(true, arg0, arg1, arg2 - 123);
        } else {
            return -101;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(BIIII)V")
    public final void method3024(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field7411++;
        this.field7412 = arg4;
        this.field7407 = arg2 - arg4;
        this.field7421 = arg3;
        this.field7410 = arg1 - arg3;
        if (arg0 != -89) {
            this.field7419 = null;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(BI)I")
    public static final int method3025(byte arg0, int arg1) {
        if (arg0 >= -32) {
            return -41;
        } else {
            field7406++;
            return arg1 >>> 7;
        }
    }

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "(I)V")
    public static void method3026(int arg0) {
        field7424 = null;
        field7425 = null;
        field7409 = null;
        field7418 = null;
        if (arg0 != 26583) {
            method3019(90, -39);
        }
    }

    @OriginalMember(owner = "client!mi", name = "<init>", descriptor = "(Lkv;II)V")
    public class519(class280 arg0, int arg1, int arg2) {
        this.field7419 = new byte[arg1 * arg2];
    }
}
