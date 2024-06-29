import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class478 extends class377 {

    @OriginalMember(owner = "client!qf", name = "W", descriptor = "[B")
    public byte[] field7028;

    @OriginalMember(owner = "client!qf", name = "Q", descriptor = "Lng;")
    public static class226 field7022 = new class226(50);

    @OriginalMember(owner = "client!qf", name = "U", descriptor = "Lgo;")
    public static class441 field7026 = new class441(10, 2, 2, 0);

    @OriginalMember(owner = "client!qf", name = "J", descriptor = "I")
    public int field7015;

    @OriginalMember(owner = "client!qf", name = "K", descriptor = "I")
    public static int field7016;

    @OriginalMember(owner = "client!qf", name = "L", descriptor = "I")
    public int field7017;

    @OriginalMember(owner = "client!qf", name = "M", descriptor = "I")
    public static int field7018;

    @OriginalMember(owner = "client!qf", name = "N", descriptor = "I")
    public static int field7019;

    @OriginalMember(owner = "client!qf", name = "O", descriptor = "I")
    public int field7020;

    @OriginalMember(owner = "client!qf", name = "P", descriptor = "I")
    public static int field7021;

    @OriginalMember(owner = "client!qf", name = "R", descriptor = "I")
    public static int field7023;

    @OriginalMember(owner = "client!qf", name = "S", descriptor = "I")
    public static int field7024;

    @OriginalMember(owner = "client!qf", name = "T", descriptor = "I")
    public static int field7025;

    @OriginalMember(owner = "client!qf", name = "V", descriptor = "I")
    public static int field7027;

    @OriginalMember(owner = "client!qf", name = "X", descriptor = "I")
    public int field7029;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IBIIIII)V")
    public final void method2846(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field7018++;
        int var8 = 0;
        if (arg2 != arg4) {
            var8 = (arg6 - arg3 << 16) / (arg2 - arg4);
        }
        int var9 = 0;
        int var10 = -55 / ((arg1 - 39) / 48);
        if (arg2 != arg5) {
            var9 = (arg0 - arg6 << 16) / (arg5 - arg2);
        }
        int var11 = 0;
        if (arg4 != arg5) {
            var11 = (arg3 - arg0 << 16) / (arg4 - arg5);
        }
        if (arg4 <= arg2 && arg5 >= arg4) {
            if (arg2 < arg5) {
                int var12;
                int var13 = var12 = arg3 << 16;
                if (arg4 < 0) {
                    var12 -= arg4 * var8;
                    var13 -= arg4 * var11;
                    arg4 = 0;
                }
                int var14 = arg6 << 16;
                if (arg2 < 0) {
                    var14 -= arg2 * var9;
                    arg2 = 0;
                }
                if (arg2 != arg4 && var8 > var11 || arg2 == arg4 && var9 < var11) {
                    int var15 = arg5 - arg2;
                    int var16 = arg2 - arg4;
                    int var17 = this.field7020 * arg4;
                    while (true) {
                        var16--;
                        if (var16 < 0) {
                            while (true) {
                                var15--;
                                if (var15 < 0) {
                                    return;
                                }
                                class471.method2823(this.field7028, (byte) -108, var13 >> 16, 0, var17, var14 >> 16);
                                var14 += var9;
                                var13 += var11;
                                var17 += this.field7020;
                            }
                        }
                        class471.method2823(this.field7028, (byte) -115, var13 >> 16, 0, var17, var12 >> 16);
                        var12 += var8;
                        var13 += var11;
                        var17 += this.field7020;
                    }
                } else {
                    int var18 = arg5 - arg2;
                    int var19 = arg2 - arg4;
                    int var20 = this.field7020 * arg4;
                    while (true) {
                        var19--;
                        if (var19 < 0) {
                            while (true) {
                                var18--;
                                if (var18 < 0) {
                                    return;
                                }
                                class471.method2823(this.field7028, (byte) -66, var14 >> 16, 0, var20, var13 >> 16);
                                var13 += var11;
                                var14 += var9;
                                var20 += this.field7020;
                            }
                        }
                        class471.method2823(this.field7028, (byte) -76, var12 >> 16, 0, var20, var13 >> 16);
                        var20 += this.field7020;
                        var13 += var11;
                        var12 += var8;
                    }
                }
            } else {
                int var21;
                int var22 = var21 = arg3 << 16;
                if (arg4 < 0) {
                    var22 -= arg4 * var11;
                    var21 -= arg4 * var8;
                    arg4 = 0;
                }
                int var23 = arg0 << 16;
                if (arg5 < 0) {
                    var23 -= arg5 * var9;
                    arg5 = 0;
                }
                if (arg4 != arg5 && var11 < var8 || arg4 == arg5 && var8 < var9) {
                    int var24 = arg2 - arg5;
                    int var25 = arg5 - arg4;
                    int var26 = this.field7020 * arg4;
                    while (true) {
                        var25--;
                        if (var25 < 0) {
                            while (true) {
                                var24--;
                                if (var24 < 0) {
                                    return;
                                }
                                class471.method2823(this.field7028, (byte) -125, var23 >> 16, 0, var26, var21 >> 16);
                                var26 += this.field7020;
                                var23 += var9;
                                var21 += var8;
                            }
                        }
                        class471.method2823(this.field7028, (byte) -103, var22 >> 16, 0, var26, var21 >> 16);
                        var26 += this.field7020;
                        var21 += var8;
                        var22 += var11;
                    }
                } else {
                    int var27 = arg2 - arg5;
                    int var28 = arg5 - arg4;
                    int var29 = this.field7020 * arg4;
                    while (true) {
                        var28--;
                        if (var28 < 0) {
                            while (true) {
                                var27--;
                                if (var27 < 0) {
                                    return;
                                }
                                class471.method2823(this.field7028, (byte) -70, var21 >> 16, 0, var29, var23 >> 16);
                                var21 += var8;
                                var23 += var9;
                                var29 += this.field7020;
                            }
                        }
                        class471.method2823(this.field7028, (byte) -92, var21 >> 16, 0, var29, var22 >> 16);
                        var21 += var8;
                        var29 += this.field7020;
                        var22 += var11;
                    }
                }
            }
        } else if (arg2 <= arg5) {
            if (arg4 > arg5) {
                int var30;
                int var31 = var30 = arg6 << 16;
                if (arg2 < 0) {
                    var30 -= arg2 * var9;
                    var31 -= arg2 * var8;
                    arg2 = 0;
                }
                int var32 = arg0 << 16;
                if (arg5 < 0) {
                    var32 -= arg5 * var11;
                    arg5 = 0;
                }
                if ((arg2 == arg5 || var8 >= var9) && (arg2 != arg5 || var11 >= var8)) {
                    int var36 = arg4 - arg5;
                    int var37 = arg5 - arg2;
                    int var38 = this.field7020 * arg2;
                    while (true) {
                        var37--;
                        if (var37 < 0) {
                            while (true) {
                                var36--;
                                if (var36 < 0) {
                                    return;
                                }
                                class471.method2823(this.field7028, (byte) -76, var32 >> 16, 0, var38, var31 >> 16);
                                var32 += var11;
                                var31 += var8;
                                var38 += this.field7020;
                            }
                        }
                        class471.method2823(this.field7028, (byte) -104, var30 >> 16, 0, var38, var31 >> 16);
                        var31 += var8;
                        var38 += this.field7020;
                        var30 += var9;
                    }
                } else {
                    int var33 = arg4 - arg5;
                    int var34 = arg5 - arg2;
                    int var35 = this.field7020 * arg2;
                    while (true) {
                        var34--;
                        if (var34 < 0) {
                            while (true) {
                                var33--;
                                if (var33 < 0) {
                                    return;
                                }
                                class471.method2823(this.field7028, (byte) -123, var31 >> 16, 0, var35, var32 >> 16);
                                var35 += this.field7020;
                                var32 += var11;
                                var31 += var8;
                            }
                        }
                        class471.method2823(this.field7028, (byte) -74, var31 >> 16, 0, var35, var30 >> 16);
                        var30 += var9;
                        var35 += this.field7020;
                        var31 += var8;
                    }
                }
            } else {
                int var39;
                int var40 = var39 = arg6 << 16;
                if (arg2 < 0) {
                    var40 -= arg2 * var8;
                    var39 -= arg2 * var9;
                    arg2 = 0;
                }
                int var41 = arg3 << 16;
                if (arg4 < 0) {
                    var41 -= arg4 * var11;
                    arg4 = 0;
                }
                if (var9 > var8) {
                    int var42 = arg5 - arg4;
                    int var43 = arg4 - arg2;
                    int var44 = this.field7020 * arg2;
                    while (true) {
                        var43--;
                        if (var43 < 0) {
                            while (true) {
                                var42--;
                                if (var42 < 0) {
                                    return;
                                }
                                class471.method2823(this.field7028, (byte) -94, var41 >> 16, 0, var44, var39 >> 16);
                                var44 += this.field7020;
                                var41 += var11;
                                var39 += var9;
                            }
                        }
                        class471.method2823(this.field7028, (byte) -122, var40 >> 16, 0, var44, var39 >> 16);
                        var44 += this.field7020;
                        var40 += var8;
                        var39 += var9;
                    }
                } else {
                    int var45 = arg5 - arg4;
                    int var46 = arg4 - arg2;
                    int var47 = this.field7020 * arg2;
                    while (true) {
                        var46--;
                        if (var46 < 0) {
                            while (true) {
                                var45--;
                                if (var45 < 0) {
                                    return;
                                }
                                class471.method2823(this.field7028, (byte) -128, var39 >> 16, 0, var47, var41 >> 16);
                                var39 += var9;
                                var47 += this.field7020;
                                var41 += var11;
                            }
                        }
                        class471.method2823(this.field7028, (byte) -79, var39 >> 16, 0, var47, var40 >> 16);
                        var39 += var9;
                        var47 += this.field7020;
                        var40 += var8;
                    }
                }
            }
        } else if (arg2 <= arg4) {
            int var48;
            int var49 = var48 = arg0 << 16;
            if (arg5 < 0) {
                var49 -= arg5 * var9;
                var48 -= arg5 * var11;
                arg5 = 0;
            }
            int var50 = arg6 << 16;
            if (arg2 < 0) {
                var50 -= arg2 * var8;
                arg2 = 0;
            }
            if (var11 <= var9) {
                int var51 = arg4 - arg2;
                int var52 = arg2 - arg5;
                int var53 = this.field7020 * arg5;
                while (true) {
                    var52--;
                    if (var52 < 0) {
                        while (true) {
                            var51--;
                            if (var51 < 0) {
                                return;
                            }
                            class471.method2823(this.field7028, (byte) -95, var48 >> 16, 0, var53, var50 >> 16);
                            var50 += var8;
                            var53 += this.field7020;
                            var48 += var11;
                        }
                    }
                    class471.method2823(this.field7028, (byte) -75, var48 >> 16, 0, var53, var49 >> 16);
                    var48 += var11;
                    var53 += this.field7020;
                    var49 += var9;
                }
            } else {
                int var54 = arg4 - arg2;
                int var55 = arg2 - arg5;
                int var56 = this.field7020 * arg5;
                while (true) {
                    var55--;
                    if (var55 < 0) {
                        while (true) {
                            var54--;
                            if (var54 < 0) {
                                return;
                            }
                            class471.method2823(this.field7028, (byte) -92, var50 >> 16, 0, var56, var48 >> 16);
                            var50 += var8;
                            var48 += var11;
                            var56 += this.field7020;
                        }
                    }
                    class471.method2823(this.field7028, (byte) -71, var49 >> 16, 0, var56, var48 >> 16);
                    var48 += var11;
                    var49 += var9;
                    var56 += this.field7020;
                }
            }
        } else {
            int var57;
            int var58 = var57 = arg0 << 16;
            if (arg5 < 0) {
                var57 -= arg5 * var11;
                var58 -= arg5 * var9;
                arg5 = 0;
            }
            int var59 = arg3 << 16;
            if (arg4 < 0) {
                var59 -= arg4 * var8;
                arg4 = 0;
            }
            if (var9 >= var11) {
                int var60 = arg2 - arg4;
                int var61 = arg4 - arg5;
                int var62 = this.field7020 * arg5;
                while (true) {
                    var61--;
                    if (var61 < 0) {
                        while (true) {
                            var60--;
                            if (var60 < 0) {
                                return;
                            }
                            class471.method2823(this.field7028, (byte) -105, var59 >> 16, 0, var62, var58 >> 16);
                            var62 += this.field7020;
                            var59 += var8;
                            var58 += var9;
                        }
                    }
                    class471.method2823(this.field7028, (byte) -117, var57 >> 16, 0, var62, var58 >> 16);
                    var58 += var9;
                    var57 += var11;
                    var62 += this.field7020;
                }
            } else {
                int var63 = arg2 - arg4;
                int var64 = arg4 - arg5;
                int var65 = this.field7020 * arg5;
                while (true) {
                    var64--;
                    if (var64 < 0) {
                        while (true) {
                            var63--;
                            if (var63 < 0) {
                                return;
                            }
                            class471.method2823(this.field7028, (byte) -69, var58 >> 16, 0, var65, var59 >> 16);
                            var65 += this.field7020;
                            var58 += var9;
                            var59 += var8;
                        }
                    }
                    class471.method2823(this.field7028, (byte) -127, var58 >> 16, 0, var65, var57 >> 16);
                    var58 += var9;
                    var65 += this.field7020;
                    var57 += var11;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "(B)V")
    public final void method2847(byte arg0) {
        field7016++;
        int var2 = -1;
        int var3 = this.field7028.length - 8;
        while (var3 > var2) {
            var2++;
            this.field7028[var2] = 0;
            var2++;
            this.field7028[var2] = 0;
            var2++;
            this.field7028[var2] = 0;
            var2++;
            this.field7028[var2] = 0;
            var2++;
            this.field7028[var2] = 0;
            var2++;
            this.field7028[var2] = 0;
            var2++;
            this.field7028[var2] = 0;
            var2++;
            this.field7028[var2] = 0;
        }
        if (arg0 >= -15) {
            field7026 = null;
        }
        while (var2 < (this.field7028.length - 1)) {
            var2++;
            this.field7028[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IBIIIIIIII)V")
    public static final void method2848(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg1 != 83) {
            return;
        }
        field7025++;
        if (arg0 == arg7 && arg5 == arg6 && arg4 == arg8 && arg2 == arg9) {
            class459.method2746(arg6, arg8, arg3, arg0, arg2, arg1 ^ 0x55);
            return;
        }
        int var10 = arg0;
        int var11 = arg6;
        int var12 = arg0 * 3;
        int var13 = arg6 * 3;
        int var14 = arg7 * 3;
        int var15 = arg5 * 3;
        int var16 = arg4 * 3;
        int var17 = arg9 * 3;
        int var18 = var14 + arg8 - arg0 - var16;
        int var19 = arg2 + var15 - arg6 - var17;
        int var20 = var12 + var16 - var14 - var14;
        int var21 = var17 - var15 - (-var13 + var15);
        int var22 = var14 - var12;
        int var23 = var15 - var13;
        for (int var24 = 128; var24 <= 4096; var24 += 128) {
            int var25 = var24 * var24 >> 12;
            int var26 = var24 * var25 >> 12;
            int var27 = var18 * var26;
            int var28 = var19 * var26;
            int var29 = var20 * var25;
            int var30 = var21 * var25;
            int var31 = var22 * var24;
            int var32 = var23 * var24;
            int var33 = (var27 + var29 + var31 >> 12) + arg0;
            int var34 = (var30 + var32 + var28 >> 12) + arg6;
            class459.method2746(var11, var33, arg3, var10, var34, 6);
            var11 = var34;
            var10 = var33;
        }
    }

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "(I)V")
    public static void method2849(int arg0) {
        field7026 = null;
        if (arg0 != -30864) {
            field7022 = null;
        }
        field7022 = null;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lvg;ZZ)V")
    public static final void method2850(class38 arg0, boolean arg1, boolean arg2) {
        field7019++;
        int var3 = arg0.field546 == 0 ? arg0.field553 : arg0.field546;
        if (!arg2) {
            method2848(-10, (byte) 104, -47, -89, 4, 77, -12, -99, 66, 48);
        }
        int var4 = arg0.field475 == 0 ? arg0.field472 : arg0.field475;
        class43.method263(var4, arg0.field467, var3, -1, class185.field2754[arg0.field467 >> 16], arg1);
        if (arg0.field452 != null) {
            class43.method263(var4, arg0.field467, var3, -1, arg0.field452, arg1);
        }
        class92 var5 = (class92) class431.field6450.method2605(false, (long) arg0.field467);
        if (var5 != null) {
            class485.method2877(arg1, (byte) 102, var3, var5.field1378, var4);
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IZI)Z")
    public final boolean method2851(int arg0, boolean arg1, int arg2) {
        field7023++;
        if (arg1) {
            return arg0 * arg2 <= this.field7028.length;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIII)V")
    public final void method2852(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field7024++;
        this.field7015 = arg3 - arg0;
        if (arg1 != -11470) {
            method2850(null, false, false);
        }
        this.field7017 = arg2;
        this.field7029 = arg0;
        this.field7020 = arg4 - arg2;
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(Lod;II)V")
    public class478(class349 arg0, int arg1, int arg2) {
        this.field7028 = new byte[arg1 * arg2];
    }
}
