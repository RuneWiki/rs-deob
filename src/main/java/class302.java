import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class302 extends class485 {

    @OriginalMember(owner = "client!vh", name = "N", descriptor = "[B")
    public byte[] field4132;

    @OriginalMember(owner = "client!vh", name = "C", descriptor = "Lml;")
    public static class325 field4122 = new class325(0, 16);

    @OriginalMember(owner = "client!vh", name = "D", descriptor = "I")
    public int field4123;

    @OriginalMember(owner = "client!vh", name = "E", descriptor = "I")
    public static int field4124;

    @OriginalMember(owner = "client!vh", name = "F", descriptor = "I")
    public int field4125;

    @OriginalMember(owner = "client!vh", name = "H", descriptor = "I")
    public int field4126;

    @OriginalMember(owner = "client!vh", name = "I", descriptor = "I")
    public static int field4127;

    @OriginalMember(owner = "client!vh", name = "J", descriptor = "I")
    public static int field4128;

    @OriginalMember(owner = "client!vh", name = "K", descriptor = "I")
    public static int field4129;

    @OriginalMember(owner = "client!vh", name = "L", descriptor = "I")
    public int field4130;

    @OriginalMember(owner = "client!vh", name = "M", descriptor = "I")
    public static int field4131;

    @OriginalMember(owner = "client!vh", name = "O", descriptor = "I")
    public static int field4133;

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "(Z)V")
    public static void method1918(boolean arg0) {
        if (arg0) {
            method1918(true);
        }
        field4122 = null;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIIII)V")
    public final void method1919(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field4130 = arg3 - arg2;
        this.field4125 = arg2;
        field4133++;
        if (arg1 != -1) {
            method1921(104, -10, 95);
        }
        this.field4123 = arg4 - arg0;
        this.field4126 = arg0;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(B)V")
    public final void method1920(byte arg0) {
        field4129++;
        int var2 = -1;
        int var3 = this.field4132.length - 8;
        while (var3 > var2) {
            var2++;
            this.field4132[var2] = 0;
            var2++;
            this.field4132[var2] = 0;
            var2++;
            this.field4132[var2] = 0;
            var2++;
            this.field4132[var2] = 0;
            var2++;
            this.field4132[var2] = 0;
            var2++;
            this.field4132[var2] = 0;
            var2++;
            this.field4132[var2] = 0;
            var2++;
            this.field4132[var2] = 0;
        }
        while (var2 < (this.field4132.length - 1)) {
            var2++;
            this.field4132[var2] = 0;
        }
        if (arg0 != 73) {
            this.field4126 = -21;
        }
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(III)Z")
    public static final boolean method1921(int arg0, int arg1, int arg2) {
        if (arg1 != -448256272) {
            method1921(54, 114, -66);
        }
        field4131++;
        if (((arg0 & 0x10000) != 0 | class490.method2845(108, arg2, arg0)) || class646.method3723(arg2, arg0, arg1 + 448256229)) {
            return true;
        } else {
            return (arg2 & 0x37) == 0 && class191.method1190((byte) -25, arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIIIIII)V")
    public final void method1922(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4127++;
        int var8 = 0;
        if (arg0 != arg1) {
            var8 = (arg3 - arg4 << 16) / (arg0 - arg1);
        }
        int var9 = 0;
        if (arg0 != arg6) {
            var9 = (arg5 - arg3 << 16) / (arg6 - arg0);
        }
        int var10 = -97 % ((7 - arg2) / 63);
        int var11 = 0;
        if (arg1 != arg6) {
            var11 = (arg4 - arg5 << 16) / (arg1 - arg6);
        }
        if (arg0 >= arg1 && arg1 <= arg6) {
            if (arg6 > arg0) {
                int var12;
                int var13 = var12 = arg4 << 16;
                int var14 = arg3 << 16;
                if (arg1 < 0) {
                    var12 -= arg1 * var8;
                    var13 -= arg1 * var11;
                    arg1 = 0;
                }
                if (arg0 < 0) {
                    var14 -= arg0 * var9;
                    arg0 = 0;
                }
                if ((arg0 == arg1 || var11 >= var8) && (arg0 != arg1 || var9 >= var11)) {
                    int var18 = arg6 - arg0;
                    int var19 = arg0 - arg1;
                    int var20 = this.field4130 * arg1;
                    while (true) {
                        var19--;
                        if (var19 < 0) {
                            while (true) {
                                var18--;
                                if (var18 < 0) {
                                    return;
                                }
                                class131.method892((byte) -78, var14 >> 16, var13 >> 16, 0, this.field4132, var20);
                                var13 += var11;
                                var20 += this.field4130;
                                var14 += var9;
                            }
                        }
                        class131.method892((byte) -98, var12 >> 16, var13 >> 16, 0, this.field4132, var20);
                        var13 += var11;
                        var12 += var8;
                        var20 += this.field4130;
                    }
                } else {
                    int var15 = arg6 - arg0;
                    int var16 = arg0 - arg1;
                    int var17 = this.field4130 * arg1;
                    while (true) {
                        var16--;
                        if (var16 < 0) {
                            while (true) {
                                var15--;
                                if (var15 < 0) {
                                    return;
                                }
                                class131.method892((byte) 50, var13 >> 16, var14 >> 16, 0, this.field4132, var17);
                                var13 += var11;
                                var17 += this.field4130;
                                var14 += var9;
                            }
                        }
                        class131.method892((byte) 39, var13 >> 16, var12 >> 16, 0, this.field4132, var17);
                        var17 += this.field4130;
                        var12 += var8;
                        var13 += var11;
                    }
                }
            } else {
                int var21;
                int var22 = var21 = arg4 << 16;
                if (arg1 < 0) {
                    var22 -= arg1 * var11;
                    var21 -= arg1 * var8;
                    arg1 = 0;
                }
                int var23 = arg5 << 16;
                if (arg6 < 0) {
                    var23 -= arg6 * var9;
                    arg6 = 0;
                }
                if (arg1 != arg6 && var11 < var8 || arg1 == arg6 && var9 > var8) {
                    int var24 = arg0 - arg6;
                    int var25 = arg6 - arg1;
                    int var26 = this.field4130 * arg1;
                    while (true) {
                        var25--;
                        if (var25 < 0) {
                            while (true) {
                                var24--;
                                if (var24 < 0) {
                                    return;
                                }
                                class131.method892((byte) -125, var23 >> 16, var21 >> 16, 0, this.field4132, var26);
                                var21 += var8;
                                var23 += var9;
                                var26 += this.field4130;
                            }
                        }
                        class131.method892((byte) -109, var22 >> 16, var21 >> 16, 0, this.field4132, var26);
                        var22 += var11;
                        var26 += this.field4130;
                        var21 += var8;
                    }
                } else {
                    int var27 = arg0 - arg6;
                    int var28 = arg6 - arg1;
                    int var29 = this.field4130 * arg1;
                    while (true) {
                        var28--;
                        if (var28 < 0) {
                            while (true) {
                                var27--;
                                if (var27 < 0) {
                                    return;
                                }
                                class131.method892((byte) -100, var21 >> 16, var23 >> 16, 0, this.field4132, var29);
                                var23 += var9;
                                var21 += var8;
                                var29 += this.field4130;
                            }
                        }
                        class131.method892((byte) 118, var21 >> 16, var22 >> 16, 0, this.field4132, var29);
                        var29 += this.field4130;
                        var22 += var11;
                        var21 += var8;
                    }
                }
            }
        } else if (arg0 > arg6) {
            if (arg1 < arg0) {
                int var30;
                int var31 = var30 = arg5 << 16;
                int var32 = arg4 << 16;
                if (arg6 < 0) {
                    var30 -= arg6 * var11;
                    var31 -= arg6 * var9;
                    arg6 = 0;
                }
                if (arg1 < 0) {
                    var32 -= arg1 * var8;
                    arg1 = 0;
                }
                if (var11 > var9) {
                    int var33 = arg0 - arg1;
                    int var34 = arg1 - arg6;
                    int var35 = this.field4130 * arg6;
                    while (true) {
                        var34--;
                        if (var34 < 0) {
                            while (true) {
                                var33--;
                                if (var33 < 0) {
                                    return;
                                }
                                class131.method892((byte) 89, var31 >> 16, var32 >> 16, 0, this.field4132, var35);
                                var35 += this.field4130;
                                var32 += var8;
                                var31 += var9;
                            }
                        }
                        class131.method892((byte) 111, var31 >> 16, var30 >> 16, 0, this.field4132, var35);
                        var30 += var11;
                        var31 += var9;
                        var35 += this.field4130;
                    }
                } else {
                    int var36 = arg0 - arg1;
                    int var37 = arg1 - arg6;
                    int var38 = this.field4130 * arg6;
                    while (true) {
                        var37--;
                        if (var37 < 0) {
                            while (true) {
                                var36--;
                                if (var36 < 0) {
                                    return;
                                }
                                class131.method892((byte) -92, var32 >> 16, var31 >> 16, 0, this.field4132, var38);
                                var32 += var8;
                                var38 += this.field4130;
                                var31 += var9;
                            }
                        }
                        class131.method892((byte) 82, var30 >> 16, var31 >> 16, 0, this.field4132, var38);
                        var31 += var9;
                        var30 += var11;
                        var38 += this.field4130;
                    }
                }
            } else {
                int var39;
                int var40 = var39 = arg5 << 16;
                if (arg6 < 0) {
                    var40 -= arg6 * var9;
                    var39 -= arg6 * var11;
                    arg6 = 0;
                }
                int var41 = arg3 << 16;
                if (arg0 < 0) {
                    var41 -= arg0 * var8;
                    arg0 = 0;
                }
                if (var11 > var9) {
                    int var42 = arg1 - arg0;
                    int var43 = arg0 - arg6;
                    int var44 = this.field4130 * arg6;
                    while (true) {
                        var43--;
                        if (var43 < 0) {
                            while (true) {
                                var42--;
                                if (var42 < 0) {
                                    return;
                                }
                                class131.method892((byte) 105, var41 >> 16, var39 >> 16, 0, this.field4132, var44);
                                var39 += var11;
                                var41 += var8;
                                var44 += this.field4130;
                            }
                        }
                        class131.method892((byte) 98, var40 >> 16, var39 >> 16, 0, this.field4132, var44);
                        var39 += var11;
                        var40 += var9;
                        var44 += this.field4130;
                    }
                } else {
                    int var45 = arg1 - arg0;
                    int var46 = arg0 - arg6;
                    int var47 = this.field4130 * arg6;
                    while (true) {
                        var46--;
                        if (var46 < 0) {
                            while (true) {
                                var45--;
                                if (var45 < 0) {
                                    return;
                                }
                                class131.method892((byte) 29, var39 >> 16, var41 >> 16, 0, this.field4132, var47);
                                var47 += this.field4130;
                                var39 += var11;
                                var41 += var8;
                            }
                        }
                        class131.method892((byte) 99, var39 >> 16, var40 >> 16, 0, this.field4132, var47);
                        var40 += var9;
                        var47 += this.field4130;
                        var39 += var11;
                    }
                }
            }
        } else if (arg6 >= arg1) {
            int var48;
            int var49 = var48 = arg3 << 16;
            int var50 = arg4 << 16;
            if (arg0 < 0) {
                var49 -= arg0 * var8;
                var48 -= arg0 * var9;
                arg0 = 0;
            }
            if (arg1 < 0) {
                var50 -= arg1 * var11;
                arg1 = 0;
            }
            if (var9 > var8) {
                int var51 = arg6 - arg1;
                int var52 = arg1 - arg0;
                int var53 = this.field4130 * arg0;
                while (true) {
                    var52--;
                    if (var52 < 0) {
                        while (true) {
                            var51--;
                            if (var51 < 0) {
                                return;
                            }
                            class131.method892((byte) -91, var50 >> 16, var48 >> 16, 0, this.field4132, var53);
                            var48 += var9;
                            var50 += var11;
                            var53 += this.field4130;
                        }
                    }
                    class131.method892((byte) -94, var49 >> 16, var48 >> 16, 0, this.field4132, var53);
                    var49 += var8;
                    var48 += var9;
                    var53 += this.field4130;
                }
            } else {
                int var54 = arg6 - arg1;
                int var55 = arg1 - arg0;
                int var56 = this.field4130 * arg0;
                while (true) {
                    var55--;
                    if (var55 < 0) {
                        while (true) {
                            var54--;
                            if (var54 < 0) {
                                return;
                            }
                            class131.method892((byte) 87, var48 >> 16, var50 >> 16, 0, this.field4132, var56);
                            var48 += var9;
                            var56 += this.field4130;
                            var50 += var11;
                        }
                    }
                    class131.method892((byte) 94, var48 >> 16, var49 >> 16, 0, this.field4132, var56);
                    var48 += var9;
                    var49 += var8;
                    var56 += this.field4130;
                }
            }
        } else {
            int var57;
            int var58 = var57 = arg3 << 16;
            int var59 = arg5 << 16;
            if (arg0 < 0) {
                var58 -= arg0 * var8;
                var57 -= arg0 * var9;
                arg0 = 0;
            }
            if (arg6 < 0) {
                var59 -= arg6 * var11;
                arg6 = 0;
            }
            if (arg0 != arg6 && var9 > var8 || arg0 == arg6 && var8 > var11) {
                int var60 = arg1 - arg6;
                int var61 = arg6 - arg0;
                int var62 = this.field4130 * arg0;
                while (true) {
                    var61--;
                    if (var61 < 0) {
                        while (true) {
                            var60--;
                            if (var60 < 0) {
                                return;
                            }
                            class131.method892((byte) -111, var58 >> 16, var59 >> 16, 0, this.field4132, var62);
                            var62 += this.field4130;
                            var59 += var11;
                            var58 += var8;
                        }
                    }
                    class131.method892((byte) -117, var58 >> 16, var57 >> 16, 0, this.field4132, var62);
                    var57 += var9;
                    var58 += var8;
                    var62 += this.field4130;
                }
            } else {
                int var63 = arg1 - arg6;
                int var64 = arg6 - arg0;
                int var65 = this.field4130 * arg0;
                while (true) {
                    var64--;
                    if (var64 < 0) {
                        while (true) {
                            var63--;
                            if (var63 < 0) {
                                return;
                            }
                            class131.method892((byte) 38, var59 >> 16, var58 >> 16, 0, this.field4132, var65);
                            var65 += this.field4130;
                            var59 += var11;
                            var58 += var8;
                        }
                    }
                    class131.method892((byte) -105, var57 >> 16, var58 >> 16, 0, this.field4132, var65);
                    var58 += var8;
                    var65 += this.field4130;
                    var57 += var9;
                }
            }
        }
    }

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "(III)Z")
    public final boolean method1923(int arg0, int arg1, int arg2) {
        field4124++;
        if (arg1 > -59) {
            this.field4126 = -97;
        }
        return this.field4132.length >= arg0 * arg2;
    }

    @OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(Lgi;II)V")
    public class302(class583 arg0, int arg1, int arg2) {
        this.field4132 = new byte[arg1 * arg2];
    }
}
