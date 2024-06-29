import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vca")
public class class283 extends class185 {

    @OriginalMember(owner = "client!vca", name = "B", descriptor = "[B")
    public byte[] field3572;

    @OriginalMember(owner = "client!vca", name = "v", descriptor = "Lvs;")
    public static class593 field3566 = new class593();

    @OriginalMember(owner = "client!vca", name = "A", descriptor = "[F")
    public static float[] field3571 = new float[2];

    @OriginalMember(owner = "client!vca", name = "t", descriptor = "I")
    public static int field3564;

    @OriginalMember(owner = "client!vca", name = "u", descriptor = "I")
    public int field3565;

    @OriginalMember(owner = "client!vca", name = "w", descriptor = "I")
    public static int field3567;

    @OriginalMember(owner = "client!vca", name = "x", descriptor = "I")
    public int field3568;

    @OriginalMember(owner = "client!vca", name = "y", descriptor = "I")
    public int field3569;

    @OriginalMember(owner = "client!vca", name = "z", descriptor = "I")
    public static int field3570;

    @OriginalMember(owner = "client!vca", name = "C", descriptor = "I")
    public static int field3573;

    @OriginalMember(owner = "client!vca", name = "D", descriptor = "I")
    public int field3574;

    @OriginalMember(owner = "client!vca", name = "E", descriptor = "I")
    public static int field3575;

    @OriginalMember(owner = "client!vca", name = "G", descriptor = "I")
    public static int field3576;

    @OriginalMember(owner = "client!vca", name = "H", descriptor = "I")
    public static int field3577;

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(IIZ)Z")
    public final boolean method1689(int arg0, int arg1, boolean arg2) {
        field3564++;
        if (arg2) {
            this.method1690(20, 47, -53, (byte) -26, -29);
        }
        return (arg0 * arg1) <= this.field3572.length;
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(IIIBI)V")
    public final void method1690(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        this.field3574 = arg2;
        field3577++;
        this.field3569 = arg4;
        this.field3565 = arg0 - arg4;
        this.field3568 = arg1 - arg2;
        if (arg3 != -125) {
            this.field3574 = 25;
        }
    }

    @OriginalMember(owner = "client!vca", name = "c", descriptor = "(I)V")
    public static final void method1691(int arg0) throws class230 {
        field3567++;
        if (class259.field3281 == 1) {
            class565.field7943.method497(class89.field1237, class480.field6536);
        } else {
            class565.field7943.method497(0, 0);
        }
        if (arg0 > -88) {
            method1695(0, -20, null);
        }
    }

    @OriginalMember(owner = "client!vca", name = "e", descriptor = "(I)V")
    public static void method1692(int arg0) {
        field3571 = null;
        if (arg0 >= -17) {
            method1692(-16);
        }
        field3566 = null;
    }

    @OriginalMember(owner = "client!vca", name = "f", descriptor = "(I)V")
    public final void method1693(int arg0) {
        if (arg0 != 12440) {
            this.method1694(8, 62, -28, 6, -27, (byte) 51, -32);
        }
        field3570++;
        int var2 = -1;
        int var3 = this.field3572.length - 8;
        while (var3 > var2) {
            var2++;
            this.field3572[var2] = 0;
            var2++;
            this.field3572[var2] = 0;
            var2++;
            this.field3572[var2] = 0;
            var2++;
            this.field3572[var2] = 0;
            var2++;
            this.field3572[var2] = 0;
            var2++;
            this.field3572[var2] = 0;
            var2++;
            this.field3572[var2] = 0;
            var2++;
            this.field3572[var2] = 0;
        }
        while (var2 < (this.field3572.length - 1)) {
            var2++;
            this.field3572[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(IIIIIBI)V")
    public final void method1694(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        field3576++;
        int var8 = 0;
        if (arg0 != arg4) {
            var8 = (arg3 - arg2 << 16) / (arg4 - arg0);
        }
        int var9 = 0;
        int var10 = 74 / ((arg5 + 48) / 35);
        if (arg4 != arg6) {
            var9 = (arg1 - arg3 << 16) / (arg6 - arg4);
        }
        int var11 = 0;
        if (arg0 != arg6) {
            var11 = (arg2 - arg1 << 16) / (arg0 - arg6);
        }
        if (arg4 >= arg0 && arg0 <= arg6) {
            if (arg6 > arg4) {
                int var12;
                int var13 = var12 = arg2 << 16;
                if (arg0 < 0) {
                    var13 -= arg0 * var11;
                    var12 -= arg0 * var8;
                    arg0 = 0;
                }
                int var14 = arg3 << 16;
                if (arg4 < 0) {
                    var14 -= arg4 * var9;
                    arg4 = 0;
                }
                if ((arg0 == arg4 || var8 <= var11) && (arg0 != arg4 || var9 >= var11)) {
                    int var18 = arg6 - arg4;
                    int var19 = arg4 - arg0;
                    int var20 = this.field3568 * arg0;
                    while (true) {
                        var19--;
                        if (var19 < 0) {
                            while (true) {
                                var18--;
                                if (var18 < 0) {
                                    return;
                                }
                                class539.method3094(var14 >> 16, var20, 0, var13 >> 16, true, this.field3572);
                                var14 += var9;
                                var13 += var11;
                                var20 += this.field3568;
                            }
                        }
                        class539.method3094(var12 >> 16, var20, 0, var13 >> 16, true, this.field3572);
                        var12 += var8;
                        var20 += this.field3568;
                        var13 += var11;
                    }
                } else {
                    int var15 = arg6 - arg4;
                    int var16 = arg4 - arg0;
                    int var17 = this.field3568 * arg0;
                    while (true) {
                        var16--;
                        if (var16 < 0) {
                            while (true) {
                                var15--;
                                if (var15 < 0) {
                                    return;
                                }
                                class539.method3094(var13 >> 16, var17, 0, var14 >> 16, true, this.field3572);
                                var17 += this.field3568;
                                var14 += var9;
                                var13 += var11;
                            }
                        }
                        class539.method3094(var13 >> 16, var17, 0, var12 >> 16, true, this.field3572);
                        var12 += var8;
                        var17 += this.field3568;
                        var13 += var11;
                    }
                }
            } else {
                int var21;
                int var22 = var21 = arg2 << 16;
                if (arg0 < 0) {
                    var21 -= arg0 * var8;
                    var22 -= arg0 * var11;
                    arg0 = 0;
                }
                int var23 = arg1 << 16;
                if (arg6 < 0) {
                    var23 -= arg6 * var9;
                    arg6 = 0;
                }
                if (arg0 != arg6 && var11 < var8 || arg0 == arg6 && var9 > var8) {
                    int var24 = arg4 - arg6;
                    int var25 = arg6 - arg0;
                    int var26 = this.field3568 * arg0;
                    while (true) {
                        var25--;
                        if (var25 < 0) {
                            while (true) {
                                var24--;
                                if (var24 < 0) {
                                    return;
                                }
                                class539.method3094(var23 >> 16, var26, 0, var21 >> 16, true, this.field3572);
                                var21 += var8;
                                var23 += var9;
                                var26 += this.field3568;
                            }
                        }
                        class539.method3094(var22 >> 16, var26, 0, var21 >> 16, true, this.field3572);
                        var22 += var11;
                        var21 += var8;
                        var26 += this.field3568;
                    }
                } else {
                    int var27 = arg4 - arg6;
                    int var28 = arg6 - arg0;
                    int var29 = this.field3568 * arg0;
                    while (true) {
                        var28--;
                        if (var28 < 0) {
                            while (true) {
                                var27--;
                                if (var27 < 0) {
                                    return;
                                }
                                class539.method3094(var21 >> 16, var29, 0, var23 >> 16, true, this.field3572);
                                var23 += var9;
                                var21 += var8;
                                var29 += this.field3568;
                            }
                        }
                        class539.method3094(var21 >> 16, var29, 0, var22 >> 16, true, this.field3572);
                        var29 += this.field3568;
                        var21 += var8;
                        var22 += var11;
                    }
                }
            }
        } else if (arg6 >= arg4) {
            if (arg0 > arg6) {
                int var30;
                int var31 = var30 = arg3 << 16;
                int var32 = arg1 << 16;
                if (arg4 < 0) {
                    var30 -= arg4 * var9;
                    var31 -= arg4 * var8;
                    arg4 = 0;
                }
                if (arg6 < 0) {
                    var32 -= arg6 * var11;
                    arg6 = 0;
                }
                if (arg4 != arg6 && var9 > var8 || arg4 == arg6 && var8 > var11) {
                    int var33 = arg0 - arg6;
                    int var34 = arg6 - arg4;
                    int var35 = this.field3568 * arg4;
                    while (true) {
                        var34--;
                        if (var34 < 0) {
                            while (true) {
                                var33--;
                                if (var33 < 0) {
                                    return;
                                }
                                class539.method3094(var31 >> 16, var35, 0, var32 >> 16, true, this.field3572);
                                var31 += var8;
                                var35 += this.field3568;
                                var32 += var11;
                            }
                        }
                        class539.method3094(var31 >> 16, var35, 0, var30 >> 16, true, this.field3572);
                        var30 += var9;
                        var35 += this.field3568;
                        var31 += var8;
                    }
                } else {
                    int var36 = arg0 - arg6;
                    int var37 = arg6 - arg4;
                    int var38 = this.field3568 * arg4;
                    while (true) {
                        var37--;
                        if (var37 < 0) {
                            while (true) {
                                var36--;
                                if (var36 < 0) {
                                    return;
                                }
                                class539.method3094(var32 >> 16, var38, 0, var31 >> 16, true, this.field3572);
                                var38 += this.field3568;
                                var32 += var11;
                                var31 += var8;
                            }
                        }
                        class539.method3094(var30 >> 16, var38, 0, var31 >> 16, true, this.field3572);
                        var30 += var9;
                        var31 += var8;
                        var38 += this.field3568;
                    }
                }
            } else {
                int var39;
                int var40 = var39 = arg3 << 16;
                if (arg4 < 0) {
                    var40 -= arg4 * var8;
                    var39 -= arg4 * var9;
                    arg4 = 0;
                }
                int var41 = arg2 << 16;
                if (arg0 < 0) {
                    var41 -= arg0 * var11;
                    arg0 = 0;
                }
                if (var9 <= var8) {
                    int var42 = arg6 - arg0;
                    int var43 = arg0 - arg4;
                    int var44 = this.field3568 * arg4;
                    while (true) {
                        var43--;
                        if (var43 < 0) {
                            while (true) {
                                var42--;
                                if (var42 < 0) {
                                    return;
                                }
                                class539.method3094(var39 >> 16, var44, 0, var41 >> 16, true, this.field3572);
                                var44 += this.field3568;
                                var39 += var9;
                                var41 += var11;
                            }
                        }
                        class539.method3094(var39 >> 16, var44, 0, var40 >> 16, true, this.field3572);
                        var40 += var8;
                        var44 += this.field3568;
                        var39 += var9;
                    }
                } else {
                    int var45 = arg6 - arg0;
                    int var46 = arg0 - arg4;
                    int var47 = this.field3568 * arg4;
                    while (true) {
                        var46--;
                        if (var46 < 0) {
                            while (true) {
                                var45--;
                                if (var45 < 0) {
                                    return;
                                }
                                class539.method3094(var41 >> 16, var47, 0, var39 >> 16, true, this.field3572);
                                var47 += this.field3568;
                                var41 += var11;
                                var39 += var9;
                            }
                        }
                        class539.method3094(var40 >> 16, var47, 0, var39 >> 16, true, this.field3572);
                        var39 += var9;
                        var47 += this.field3568;
                        var40 += var8;
                    }
                }
            }
        } else if (arg0 < arg4) {
            int var48;
            int var49 = var48 = arg1 << 16;
            if (arg6 < 0) {
                var49 -= arg6 * var9;
                var48 -= arg6 * var11;
                arg6 = 0;
            }
            int var50 = arg2 << 16;
            if (arg0 < 0) {
                var50 -= arg0 * var8;
                arg0 = 0;
            }
            if (var11 > var9) {
                int var51 = arg4 - arg0;
                int var52 = arg0 - arg6;
                int var53 = this.field3568 * arg6;
                while (true) {
                    var52--;
                    if (var52 < 0) {
                        while (true) {
                            var51--;
                            if (var51 < 0) {
                                return;
                            }
                            class539.method3094(var49 >> 16, var53, 0, var50 >> 16, true, this.field3572);
                            var50 += var8;
                            var49 += var9;
                            var53 += this.field3568;
                        }
                    }
                    class539.method3094(var49 >> 16, var53, 0, var48 >> 16, true, this.field3572);
                    var48 += var11;
                    var49 += var9;
                    var53 += this.field3568;
                }
            } else {
                int var54 = arg4 - arg0;
                int var55 = arg0 - arg6;
                int var56 = this.field3568 * arg6;
                while (true) {
                    var55--;
                    if (var55 < 0) {
                        while (true) {
                            var54--;
                            if (var54 < 0) {
                                return;
                            }
                            class539.method3094(var50 >> 16, var56, 0, var49 >> 16, true, this.field3572);
                            var56 += this.field3568;
                            var49 += var9;
                            var50 += var8;
                        }
                    }
                    class539.method3094(var48 >> 16, var56, 0, var49 >> 16, true, this.field3572);
                    var56 += this.field3568;
                    var49 += var9;
                    var48 += var11;
                }
            }
        } else {
            int var57;
            int var58 = var57 = arg1 << 16;
            int var59 = arg3 << 16;
            if (arg6 < 0) {
                var57 -= arg6 * var11;
                var58 -= arg6 * var9;
                arg6 = 0;
            }
            if (arg4 < 0) {
                var59 -= arg4 * var8;
                arg4 = 0;
            }
            if (var11 <= var9) {
                int var60 = arg0 - arg4;
                int var61 = arg4 - arg6;
                int var62 = this.field3568 * arg6;
                while (true) {
                    var61--;
                    if (var61 < 0) {
                        while (true) {
                            var60--;
                            if (var60 < 0) {
                                return;
                            }
                            class539.method3094(var57 >> 16, var62, 0, var59 >> 16, true, this.field3572);
                            var59 += var8;
                            var62 += this.field3568;
                            var57 += var11;
                        }
                    }
                    class539.method3094(var57 >> 16, var62, 0, var58 >> 16, true, this.field3572);
                    var57 += var11;
                    var58 += var9;
                    var62 += this.field3568;
                }
            } else {
                int var63 = arg0 - arg4;
                int var64 = arg4 - arg6;
                int var65 = this.field3568 * arg6;
                while (true) {
                    var64--;
                    if (var64 < 0) {
                        while (true) {
                            var63--;
                            if (var63 < 0) {
                                return;
                            }
                            class539.method3094(var59 >> 16, var65, 0, var57 >> 16, true, this.field3572);
                            var59 += var8;
                            var65 += this.field3568;
                            var57 += var11;
                        }
                    }
                    class539.method3094(var58 >> 16, var65, 0, var57 >> 16, true, this.field3572);
                    var65 += this.field3568;
                    var57 += var11;
                    var58 += var9;
                }
            }
        }
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(IILjava/lang/String;)V")
    public static final void method1695(int arg0, int arg1, String arg2) {
        if (arg0 < -65) {
            field3575++;
            class64.method588(1699767752, arg2, 0, "", "", arg1, "");
        }
    }

    @OriginalMember(owner = "client!vca", name = "<init>", descriptor = "(Lij;II)V")
    public class283(class424 arg0, int arg1, int arg2) {
        this.field3572 = new byte[arg1 * arg2];
    }
}
