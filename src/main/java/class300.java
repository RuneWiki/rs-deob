import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class300 extends class54 {

    @OriginalMember(owner = "client!wb", name = "M", descriptor = "[B")
    public byte[] field4090;

    @OriginalMember(owner = "client!wb", name = "I", descriptor = "[B")
    public static byte[] field4086 = new byte[] { 31, -117, 8, 0, 0, 0, 0, 0, 0, 0, -5, 127, -29, -1, 109, 6, 103, 6, 14, 54, 54, 118, 54, 86, 14, 118, 118, 118, 78, 78, 14, 46, 30, 17, 94, 30, 110, 110, 30, 73, 33, 97, 126, 17, 89, 41, 121, 57, 89, 41, 25, 25, 5, 21, 61, 117, 5, 37, 29, 101, 25, 25, 13, 115, 77, 29, 3, 67, 19, 19, 19, 121, 117, 75, 91, 11, 35, 27, 61, 99, 19, 35, -112, 33, -116, -100, -100, -100, 60, -36, 60, 18, -68, -68, 18, 70, -118, 50, -118, 70, 36, -125, -1, 7, 24, 68, 56, 24, 24, 25, 24, 89, 24, -107, 24, -104, 4, 25, -103, 5, 25, 89, -108, 24, -2, 31, 97, -112, 103, 96, 96, 100, 101, 4, 3, 6, 40, 96, 100, 98, 102, 97, 101, 99, -25, -32, -28, -30, 6, 42, -40, 42, -64, -64, -60, -56, -52, -52, -60, -62, -52, -54, -54, -62, 2, -108, -83, 5, -54, 51, -80, 8, -78, 10, 41, 26, 58, -78, 9, 7, 38, -78, 43, 21, -118, 24, 53, 78, 92, -56, -95, -20, -76, -15, -96, 104, -48, -59, 15, 42, -58, 73, 69, 77, -100, 92, 98, -30, 18, -110, 82, -86, 106, -22, 26, -102, 90, 38, -90, 102, -26, 22, -106, 86, -50, 46, -82, 110, -18, 30, -98, 94, -63, 33, -95, 97, -31, 17, -111, 81, -55, 41, -87, 105, -23, 25, -103, 89, -59, 37, -91, 101, -27, 21, -107, 85, -51, 45, -83, 109, -19, 29, -99, 93, -109, 38, 79, -103, 58, 109, -6, -116, -103, -77, 22, 45, 94, -78, 116, -39, -14, 21, 43, 87, 109, -38, -68, 101, -21, -74, -19, 59, 118, -18, 58, 116, -8, -56, -47, 99, -57, 79, -100, 60, 117, -23, -14, -107, -85, -41, -82, -33, -72, 121, -21, -31, -93, -57, 79, -98, 62, 123, -2, -30, -27, -85, -113, -97, 62, 127, -7, -6, -19, -5, -113, -97, -65, 64, -2, 98, 100, 96, 102, -124, 1, -84, -2, 18, 4, -6, -117, -119, -123, -123, -103, -123, 29, -28, 47, 70, -90, 114, -112, 2, 65, 22, 86, 69, 67, 54, 33, -57, 64, -10, -60, 66, 97, 37, -93, 70, 14, 17, -89, -119, 11, 55, 30, -28, 84, 54, 14, -6, 32, -102, 84, 116, -111, 75, 76, -59, -28, -95, -22, 71, -112, -41, -64, 62, 35, -50, 99, 77, 100, -7, 12, -18, 49, -124, -65, 110, 49, -16, -79, 48, 2, -29, 15, -24, 78, 6, 6, 123, -122, -97, -1, -70, 52, 22, -16, -49, 127, -79, -88, -21, -1, 77, 0, 38, 27, -28, 10, 110, 2, 0, 0 };

    @OriginalMember(owner = "client!wb", name = "L", descriptor = "Lkr;")
    public static class693 field4089 = new class693();

    @OriginalMember(owner = "client!wb", name = "D", descriptor = "I")
    public static int field4081;

    @OriginalMember(owner = "client!wb", name = "E", descriptor = "I")
    public static int field4082;

    @OriginalMember(owner = "client!wb", name = "F", descriptor = "I")
    public int field4083;

    @OriginalMember(owner = "client!wb", name = "G", descriptor = "I")
    public int field4084;

    @OriginalMember(owner = "client!wb", name = "H", descriptor = "I")
    public int field4085;

    @OriginalMember(owner = "client!wb", name = "J", descriptor = "I")
    public int field4087;

    @OriginalMember(owner = "client!wb", name = "K", descriptor = "I")
    public static int field4088;

    @OriginalMember(owner = "client!wb", name = "O", descriptor = "I")
    public static int field4091;

    @OriginalMember(owner = "client!wb", name = "P", descriptor = "I")
    public static int field4092;

    @OriginalMember(owner = "client!wb", name = "R", descriptor = "I")
    public static int field4093;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIII)V")
    public final void method1813(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field4087 = arg4;
        if (arg2 < 111) {
            method1815(null, (byte) 5);
        }
        this.field4083 = arg0;
        this.field4084 = arg3 - arg0;
        this.field4085 = arg1 - arg4;
        field4082++;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(BII)Z")
    public final boolean method1814(byte arg0, int arg1, int arg2) {
        if (arg0 != -72) {
            this.method1816(106, 15, 65, (byte) -95, 46, 94, 25);
        }
        field4091++;
        return (arg1 * arg2) <= this.field4090.length;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lac;B)Lsda;")
    public static final class234 method1815(class501 arg0, byte arg1) {
        if (arg1 != -49) {
            method1817(-77, true);
        }
        field4081++;
        return new class234(arg0.method2875(false), arg0.method2875(false), arg0.method2875(false), arg0.method2875(false), arg0.method2819((byte) 72), arg0.method2819((byte) 72), arg0.method2874((byte) -75));
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIBIII)V")
    public final void method1816(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        field4092++;
        int var8 = 0;
        if (arg1 != arg5) {
            var8 = (arg2 - arg6 << 16) / (arg1 - arg5);
        }
        int var9 = 0;
        if (arg0 != arg1) {
            var9 = (arg4 - arg2 << 16) / (arg0 - arg1);
        }
        int var10 = 0;
        if (arg0 != arg5) {
            var10 = (arg6 - arg4 << 16) / (arg5 - arg0);
        }
        if (arg3 != 38) {
            this.method1819(-42);
        }
        if (arg1 >= arg5 && arg0 >= arg5) {
            if (arg1 < arg0) {
                int var11;
                int var12 = var11 = arg6 << 16;
                if (arg5 < 0) {
                    var12 -= arg5 * var10;
                    var11 -= arg5 * var8;
                    arg5 = 0;
                }
                int var13 = arg2 << 16;
                if (arg1 < 0) {
                    var13 -= arg1 * var9;
                    arg1 = 0;
                }
                if ((arg1 == arg5 || var8 <= var10) && (arg1 != arg5 || var9 >= var10)) {
                    int var17 = arg0 - arg1;
                    int var18 = arg1 - arg5;
                    int var19 = this.field4085 * arg5;
                    while (true) {
                        var18--;
                        if (var18 < 0) {
                            while (true) {
                                var17--;
                                if (var17 < 0) {
                                    return;
                                }
                                class4.method10(var12 >> 16, 0, false, var13 >> 16, var19, this.field4090);
                                var13 += var9;
                                var12 += var10;
                                var19 += this.field4085;
                            }
                        }
                        class4.method10(var12 >> 16, 0, false, var11 >> 16, var19, this.field4090);
                        var12 += var10;
                        var19 += this.field4085;
                        var11 += var8;
                    }
                } else {
                    int var14 = arg0 - arg1;
                    int var15 = arg1 - arg5;
                    int var16 = this.field4085 * arg5;
                    while (true) {
                        var15--;
                        if (var15 < 0) {
                            while (true) {
                                var14--;
                                if (var14 < 0) {
                                    return;
                                }
                                class4.method10(var13 >> 16, 0, false, var12 >> 16, var16, this.field4090);
                                var16 += this.field4085;
                                var12 += var10;
                                var13 += var9;
                            }
                        }
                        class4.method10(var11 >> 16, 0, false, var12 >> 16, var16, this.field4090);
                        var12 += var10;
                        var16 += this.field4085;
                        var11 += var8;
                    }
                }
            } else {
                int var20;
                int var21 = var20 = arg6 << 16;
                int var22 = arg4 << 16;
                if (arg5 < 0) {
                    var21 -= arg5 * var10;
                    var20 -= arg5 * var8;
                    arg5 = 0;
                }
                if (arg0 < 0) {
                    var22 -= arg0 * var9;
                    arg0 = 0;
                }
                if (arg0 != arg5 && var10 < var8 || arg0 == arg5 && var9 > var8) {
                    int var23 = arg1 - arg0;
                    int var24 = arg0 - arg5;
                    int var25 = this.field4085 * arg5;
                    while (true) {
                        var24--;
                        if (var24 < 0) {
                            while (true) {
                                var23--;
                                if (var23 < 0) {
                                    return;
                                }
                                class4.method10(var20 >> 16, 0, false, var22 >> 16, var25, this.field4090);
                                var20 += var8;
                                var25 += this.field4085;
                                var22 += var9;
                            }
                        }
                        class4.method10(var20 >> 16, 0, false, var21 >> 16, var25, this.field4090);
                        var21 += var10;
                        var20 += var8;
                        var25 += this.field4085;
                    }
                } else {
                    int var26 = arg1 - arg0;
                    int var27 = arg0 - arg5;
                    int var28 = this.field4085 * arg5;
                    while (true) {
                        var27--;
                        if (var27 < 0) {
                            while (true) {
                                var26--;
                                if (var26 < 0) {
                                    return;
                                }
                                class4.method10(var22 >> 16, 0, false, var20 >> 16, var28, this.field4090);
                                var28 += this.field4085;
                                var22 += var9;
                                var20 += var8;
                            }
                        }
                        class4.method10(var21 >> 16, 0, false, var20 >> 16, var28, this.field4090);
                        var28 += this.field4085;
                        var20 += var8;
                        var21 += var10;
                    }
                }
            }
        } else if (arg0 >= arg1) {
            if (arg0 < arg5) {
                int var29;
                int var30 = var29 = arg2 << 16;
                int var31 = arg4 << 16;
                if (arg1 < 0) {
                    var30 -= arg1 * var8;
                    var29 -= arg1 * var9;
                    arg1 = 0;
                }
                if (arg0 < 0) {
                    var31 -= arg0 * var10;
                    arg0 = 0;
                }
                if (arg0 != arg1 && var8 < var9 || arg0 == arg1 && var8 > var10) {
                    int var32 = arg5 - arg0;
                    int var33 = arg0 - arg1;
                    int var34 = this.field4085 * arg1;
                    while (true) {
                        var33--;
                        if (var33 < 0) {
                            while (true) {
                                var32--;
                                if (var32 < 0) {
                                    return;
                                }
                                class4.method10(var31 >> 16, 0, false, var30 >> 16, var34, this.field4090);
                                var34 += this.field4085;
                                var31 += var10;
                                var30 += var8;
                            }
                        }
                        class4.method10(var29 >> 16, 0, false, var30 >> 16, var34, this.field4090);
                        var34 += this.field4085;
                        var29 += var9;
                        var30 += var8;
                    }
                } else {
                    int var35 = arg5 - arg0;
                    int var36 = arg0 - arg1;
                    int var37 = this.field4085 * arg1;
                    while (true) {
                        var36--;
                        if (var36 < 0) {
                            while (true) {
                                var35--;
                                if (var35 < 0) {
                                    return;
                                }
                                class4.method10(var30 >> 16, 0, false, var31 >> 16, var37, this.field4090);
                                var37 += this.field4085;
                                var30 += var8;
                                var31 += var10;
                            }
                        }
                        class4.method10(var30 >> 16, 0, false, var29 >> 16, var37, this.field4090);
                        var37 += this.field4085;
                        var29 += var9;
                        var30 += var8;
                    }
                }
            } else {
                int var38;
                int var39 = var38 = arg2 << 16;
                int var40 = arg6 << 16;
                if (arg1 < 0) {
                    var38 -= arg1 * var9;
                    var39 -= arg1 * var8;
                    arg1 = 0;
                }
                if (arg5 < 0) {
                    var40 -= arg5 * var10;
                    arg5 = 0;
                }
                if (var9 <= var8) {
                    int var41 = arg0 - arg5;
                    int var42 = arg5 - arg1;
                    int var43 = this.field4085 * arg1;
                    while (true) {
                        var42--;
                        if (var42 < 0) {
                            while (true) {
                                var41--;
                                if (var41 < 0) {
                                    return;
                                }
                                class4.method10(var40 >> 16, 0, false, var38 >> 16, var43, this.field4090);
                                var43 += this.field4085;
                                var38 += var9;
                                var40 += var10;
                            }
                        }
                        class4.method10(var39 >> 16, 0, false, var38 >> 16, var43, this.field4090);
                        var43 += this.field4085;
                        var38 += var9;
                        var39 += var8;
                    }
                } else {
                    int var44 = arg0 - arg5;
                    int var45 = arg5 - arg1;
                    int var46 = this.field4085 * arg1;
                    while (true) {
                        var45--;
                        if (var45 < 0) {
                            while (true) {
                                var44--;
                                if (var44 < 0) {
                                    return;
                                }
                                class4.method10(var38 >> 16, 0, false, var40 >> 16, var46, this.field4090);
                                var46 += this.field4085;
                                var38 += var9;
                                var40 += var10;
                            }
                        }
                        class4.method10(var38 >> 16, 0, false, var39 >> 16, var46, this.field4090);
                        var46 += this.field4085;
                        var38 += var9;
                        var39 += var8;
                    }
                }
            }
        } else if (arg5 < arg1) {
            int var47;
            int var48 = var47 = arg4 << 16;
            int var49 = arg6 << 16;
            if (arg0 < 0) {
                var48 -= arg0 * var9;
                var47 -= arg0 * var10;
                arg0 = 0;
            }
            if (arg5 < 0) {
                var49 -= arg5 * var8;
                arg5 = 0;
            }
            if (var9 >= var10) {
                int var50 = arg1 - arg5;
                int var51 = arg5 - arg0;
                int var52 = this.field4085 * arg0;
                while (true) {
                    var51--;
                    if (var51 < 0) {
                        while (true) {
                            var50--;
                            if (var50 < 0) {
                                return;
                            }
                            class4.method10(var48 >> 16, 0, false, var49 >> 16, var52, this.field4090);
                            var52 += this.field4085;
                            var48 += var9;
                            var49 += var8;
                        }
                    }
                    class4.method10(var48 >> 16, 0, false, var47 >> 16, var52, this.field4090);
                    var48 += var9;
                    var47 += var10;
                    var52 += this.field4085;
                }
            } else {
                int var53 = arg1 - arg5;
                int var54 = arg5 - arg0;
                int var55 = this.field4085 * arg0;
                while (true) {
                    var54--;
                    if (var54 < 0) {
                        while (true) {
                            var53--;
                            if (var53 < 0) {
                                return;
                            }
                            class4.method10(var49 >> 16, 0, false, var48 >> 16, var55, this.field4090);
                            var49 += var8;
                            var55 += this.field4085;
                            var48 += var9;
                        }
                    }
                    class4.method10(var47 >> 16, 0, false, var48 >> 16, var55, this.field4090);
                    var47 += var10;
                    var55 += this.field4085;
                    var48 += var9;
                }
            }
        } else {
            int var56;
            int var57 = var56 = arg4 << 16;
            if (arg0 < 0) {
                var56 -= arg0 * var10;
                var57 -= arg0 * var9;
                arg0 = 0;
            }
            int var58 = arg2 << 16;
            if (arg1 < 0) {
                var58 -= arg1 * var8;
                arg1 = 0;
            }
            if (var10 <= var9) {
                int var59 = arg5 - arg1;
                int var60 = arg1 - arg0;
                int var61 = this.field4085 * arg0;
                while (true) {
                    var60--;
                    if (var60 < 0) {
                        while (true) {
                            var59--;
                            if (var59 < 0) {
                                return;
                            }
                            class4.method10(var58 >> 16, 0, false, var56 >> 16, var61, this.field4090);
                            var61 += this.field4085;
                            var58 += var8;
                            var56 += var10;
                        }
                    }
                    class4.method10(var57 >> 16, 0, false, var56 >> 16, var61, this.field4090);
                    var61 += this.field4085;
                    var57 += var9;
                    var56 += var10;
                }
            } else {
                int var62 = arg5 - arg1;
                int var63 = arg1 - arg0;
                int var64 = this.field4085 * arg0;
                while (true) {
                    var63--;
                    if (var63 < 0) {
                        while (true) {
                            var62--;
                            if (var62 < 0) {
                                return;
                            }
                            class4.method10(var56 >> 16, 0, false, var58 >> 16, var64, this.field4090);
                            var56 += var10;
                            var58 += var8;
                            var64 += this.field4085;
                        }
                    }
                    class4.method10(var56 >> 16, 0, false, var57 >> 16, var64, this.field4090);
                    var56 += var10;
                    var57 += var9;
                    var64 += this.field4085;
                }
            }
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IZ)Z")
    public static final boolean method1817(int arg0, boolean arg1) {
        field4088++;
        if (!arg1) {
            method1815(null, (byte) 33);
        }
        return arg0 == 0 || arg0 == 2;
    }

    @OriginalMember(owner = "client!wb", name = "h", descriptor = "(I)V")
    public static void method1818(int arg0) {
        field4086 = null;
        if (arg0 == 464883728) {
            field4089 = null;
        }
    }

    @OriginalMember(owner = "client!wb", name = "i", descriptor = "(I)V")
    public final void method1819(int arg0) {
        field4093++;
        int var2 = -1;
        int var3 = -59 / ((-arg0 - 18) / 35);
        int var4 = this.field4090.length - 8;
        while (var2 < var4) {
            var2++;
            this.field4090[var2] = 0;
            var2++;
            this.field4090[var2] = 0;
            var2++;
            this.field4090[var2] = 0;
            var2++;
            this.field4090[var2] = 0;
            var2++;
            this.field4090[var2] = 0;
            var2++;
            this.field4090[var2] = 0;
            var2++;
            this.field4090[var2] = 0;
            var2++;
            this.field4090[var2] = 0;
        }
        while (this.field4090.length - 1 > var2) {
            var2++;
            this.field4090[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(Lnv;II)V")
    public class300(class382 arg0, int arg1, int arg2) {
        this.field4090 = new byte[arg1 * arg2];
    }
}
