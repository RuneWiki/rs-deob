import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class339 extends class265 {

    @OriginalMember(owner = "client!aa", name = "I", descriptor = "[B")
    public byte[] field5050;

    @OriginalMember(owner = "client!aa", name = "K", descriptor = "[I")
    public static int[] field5052 = new int[32];

    @OriginalMember(owner = "client!aa", name = "C", descriptor = "I")
    public static int field5044;

    @OriginalMember(owner = "client!aa", name = "D", descriptor = "I")
    public int field5045;

    @OriginalMember(owner = "client!aa", name = "E", descriptor = "I")
    public static int field5046;

    @OriginalMember(owner = "client!aa", name = "F", descriptor = "I")
    public static int field5047;

    @OriginalMember(owner = "client!aa", name = "G", descriptor = "I")
    public static int field5048;

    @OriginalMember(owner = "client!aa", name = "H", descriptor = "I")
    public int field5049;

    @OriginalMember(owner = "client!aa", name = "L", descriptor = "I")
    public int field5053;

    @OriginalMember(owner = "client!aa", name = "M", descriptor = "I")
    public static int field5054;

    @OriginalMember(owner = "client!aa", name = "N", descriptor = "I")
    public static int field5055;

    @OriginalMember(owner = "client!aa", name = "O", descriptor = "I")
    public int field5056;

    @OriginalMember(owner = "client!aa", name = "P", descriptor = "I")
    public static int field5057;

    @OriginalMember(owner = "client!aa", name = "J", descriptor = "[Ljava/lang/String;")
    public static String[] field5051;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(BILig;I)J")
    public static final long method2138(byte arg0, int arg1, class164 arg2, int arg3) {
        field5054++;
        if (arg0 != 109) {
            method2140(null, null, -7);
        }
        long var4 = 4194304L;
        long var6 = 2147483648L;
        long var8 = Long.MIN_VALUE;
        class69 var10 = class510.field7458.method2973(-119, arg2.method624((byte) -128));
        long var11 = (long) (arg2.method627(23326) << 14 | arg1 | arg3 << 7 | arg2.method621(3021) << 20 | 0x40000000);
        if (var10.field922 == 0) {
            var11 |= var8;
        }
        if (var10.field953 == 1) {
            var11 |= var4;
        }
        if (var10.field897) {
            var11 |= var6;
        }
        return var11 | (long) arg2.method624((byte) -127) << 32;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)V")
    public static void method2139(int arg0) {
        if (arg0 >= -104) {
            method2140(null, null, -83);
        }
        field5052 = null;
        field5051 = null;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lsp;Lsp;I)V")
    public static final void method2140(class452 arg0, class452 arg1, int arg2) {
        field5046++;
        if (arg1.field6603 != null) {
            arg1.method2754(-152804768);
        }
        arg1.field6598 = arg0.field6598;
        arg1.field6603 = arg0;
        arg1.field6603.field6598 = arg1;
        arg1.field6598.field6603 = arg1;
        if (arg2 != -1279242032) {
            field5051 = null;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIIIZII)V")
    public final void method2141(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        field5047++;
        int var8 = 0;
        if (!arg4) {
            method2138((byte) -44, 112, null, -55);
        }
        if (arg0 != arg1) {
            var8 = (arg5 - arg6 << 16) / (arg1 - arg0);
        }
        int var9 = 0;
        if (arg1 != arg2) {
            var9 = (arg3 - arg5 << 16) / (arg2 - arg1);
        }
        int var10 = 0;
        if (arg0 != arg2) {
            var10 = (arg6 - arg3 << 16) / (arg0 - arg2);
        }
        if (arg1 >= arg0 && arg0 <= arg2) {
            if (arg2 <= arg1) {
                int var11;
                int var12 = var11 = arg6 << 16;
                if (arg0 < 0) {
                    var12 -= arg0 * var10;
                    var11 -= arg0 * var8;
                    arg0 = 0;
                }
                int var13 = arg3 << 16;
                if (arg2 < 0) {
                    var13 -= arg2 * var9;
                    arg2 = 0;
                }
                if (arg0 != arg2 && var10 < var8 || arg0 == arg2 && var9 > var8) {
                    int var14 = arg1 - arg2;
                    int var15 = arg2 - arg0;
                    int var16 = this.field5056 * arg0;
                    while (true) {
                        var15--;
                        if (var15 < 0) {
                            while (true) {
                                var14--;
                                if (var14 < 0) {
                                    return;
                                }
                                class416.method2609(arg4, 0, var16, var11 >> 16, this.field5050, var13 >> 16);
                                var13 += var9;
                                var11 += var8;
                                var16 += this.field5056;
                            }
                        }
                        class416.method2609(true, 0, var16, var11 >> 16, this.field5050, var12 >> 16);
                        var12 += var10;
                        var16 += this.field5056;
                        var11 += var8;
                    }
                } else {
                    int var17 = arg1 - arg2;
                    int var18 = arg2 - arg0;
                    int var19 = this.field5056 * arg0;
                    while (true) {
                        var18--;
                        if (var18 < 0) {
                            while (true) {
                                var17--;
                                if (var17 < 0) {
                                    return;
                                }
                                class416.method2609(true, 0, var19, var13 >> 16, this.field5050, var11 >> 16);
                                var11 += var8;
                                var19 += this.field5056;
                                var13 += var9;
                            }
                        }
                        class416.method2609(arg4, 0, var19, var12 >> 16, this.field5050, var11 >> 16);
                        var12 += var10;
                        var11 += var8;
                        var19 += this.field5056;
                    }
                }
            } else {
                int var20;
                int var21 = var20 = arg6 << 16;
                int var22 = arg5 << 16;
                if (arg0 < 0) {
                    var21 -= arg0 * var10;
                    var20 -= arg0 * var8;
                    arg0 = 0;
                }
                if (arg1 < 0) {
                    var22 -= arg1 * var9;
                    arg1 = 0;
                }
                if (arg0 != arg1 && var10 < var8 || arg0 == arg1 && var10 > var9) {
                    int var23 = arg2 - arg1;
                    int var24 = arg1 - arg0;
                    int var25 = this.field5056 * arg0;
                    while (true) {
                        var24--;
                        if (var24 < 0) {
                            while (true) {
                                var23--;
                                if (var23 < 0) {
                                    return;
                                }
                                class416.method2609(true, 0, var25, var22 >> 16, this.field5050, var21 >> 16);
                                var22 += var9;
                                var21 += var10;
                                var25 += this.field5056;
                            }
                        }
                        class416.method2609(true, 0, var25, var20 >> 16, this.field5050, var21 >> 16);
                        var21 += var10;
                        var25 += this.field5056;
                        var20 += var8;
                    }
                } else {
                    int var26 = arg2 - arg1;
                    int var27 = arg1 - arg0;
                    int var28 = this.field5056 * arg0;
                    while (true) {
                        var27--;
                        if (var27 < 0) {
                            while (true) {
                                var26--;
                                if (var26 < 0) {
                                    return;
                                }
                                class416.method2609(true, 0, var28, var21 >> 16, this.field5050, var22 >> 16);
                                var28 += this.field5056;
                                var22 += var9;
                                var21 += var10;
                            }
                        }
                        class416.method2609(true, 0, var28, var21 >> 16, this.field5050, var20 >> 16);
                        var21 += var10;
                        var20 += var8;
                        var28 += this.field5056;
                    }
                }
            }
        } else if (arg2 >= arg1) {
            if (arg0 <= arg2) {
                int var29;
                int var30 = var29 = arg5 << 16;
                int var31 = arg6 << 16;
                if (arg1 < 0) {
                    var29 -= arg1 * var9;
                    var30 -= arg1 * var8;
                    arg1 = 0;
                }
                if (arg0 < 0) {
                    var31 -= arg0 * var10;
                    arg0 = 0;
                }
                if (var9 <= var8) {
                    int var32 = arg2 - arg0;
                    int var33 = arg0 - arg1;
                    int var34 = this.field5056 * arg1;
                    while (true) {
                        var33--;
                        if (var33 < 0) {
                            while (true) {
                                var32--;
                                if (var32 < 0) {
                                    return;
                                }
                                class416.method2609(true, 0, var34, var31 >> 16, this.field5050, var29 >> 16);
                                var34 += this.field5056;
                                var29 += var9;
                                var31 += var10;
                            }
                        }
                        class416.method2609(true, 0, var34, var30 >> 16, this.field5050, var29 >> 16);
                        var29 += var9;
                        var34 += this.field5056;
                        var30 += var8;
                    }
                } else {
                    int var35 = arg2 - arg0;
                    int var36 = arg0 - arg1;
                    int var37 = this.field5056 * arg1;
                    while (true) {
                        var36--;
                        if (var36 < 0) {
                            while (true) {
                                var35--;
                                if (var35 < 0) {
                                    return;
                                }
                                class416.method2609(true, 0, var37, var29 >> 16, this.field5050, var31 >> 16);
                                var37 += this.field5056;
                                var31 += var10;
                                var29 += var9;
                            }
                        }
                        class416.method2609(true, 0, var37, var29 >> 16, this.field5050, var30 >> 16);
                        var30 += var8;
                        var37 += this.field5056;
                        var29 += var9;
                    }
                }
            } else {
                int var38;
                int var39 = var38 = arg5 << 16;
                if (arg1 < 0) {
                    var38 -= arg1 * var9;
                    var39 -= arg1 * var8;
                    arg1 = 0;
                }
                int var40 = arg3 << 16;
                if (arg2 < 0) {
                    var40 -= arg2 * var10;
                    arg2 = 0;
                }
                if (arg1 != arg2 && var8 < var9 || arg1 == arg2 && var8 > var10) {
                    int var41 = arg0 - arg2;
                    int var42 = arg2 - arg1;
                    int var43 = this.field5056 * arg1;
                    while (true) {
                        var42--;
                        if (var42 < 0) {
                            while (true) {
                                var41--;
                                if (var41 < 0) {
                                    return;
                                }
                                class416.method2609(arg4, 0, var43, var40 >> 16, this.field5050, var39 >> 16);
                                var39 += var8;
                                var40 += var10;
                                var43 += this.field5056;
                            }
                        }
                        class416.method2609(true, 0, var43, var38 >> 16, this.field5050, var39 >> 16);
                        var43 += this.field5056;
                        var38 += var9;
                        var39 += var8;
                    }
                } else {
                    int var44 = arg0 - arg2;
                    int var45 = arg2 - arg1;
                    int var46 = this.field5056 * arg1;
                    while (true) {
                        var45--;
                        if (var45 < 0) {
                            while (true) {
                                var44--;
                                if (var44 < 0) {
                                    return;
                                }
                                class416.method2609(true, 0, var46, var39 >> 16, this.field5050, var40 >> 16);
                                var46 += this.field5056;
                                var40 += var10;
                                var39 += var8;
                            }
                        }
                        class416.method2609(true, 0, var46, var39 >> 16, this.field5050, var38 >> 16);
                        var38 += var9;
                        var39 += var8;
                        var46 += this.field5056;
                    }
                }
            }
        } else if (arg0 >= arg1) {
            int var47;
            int var48 = var47 = arg3 << 16;
            if (arg2 < 0) {
                var47 -= arg2 * var10;
                var48 -= arg2 * var9;
                arg2 = 0;
            }
            int var49 = arg5 << 16;
            if (arg1 < 0) {
                var49 -= arg1 * var8;
                arg1 = 0;
            }
            if (var10 > var9) {
                int var50 = arg0 - arg1;
                int var51 = arg1 - arg2;
                int var52 = this.field5056 * arg2;
                while (true) {
                    var51--;
                    if (var51 < 0) {
                        while (true) {
                            var50--;
                            if (var50 < 0) {
                                return;
                            }
                            class416.method2609(true, 0, var52, var47 >> 16, this.field5050, var49 >> 16);
                            var49 += var8;
                            var47 += var10;
                            var52 += this.field5056;
                        }
                    }
                    class416.method2609(true, 0, var52, var47 >> 16, this.field5050, var48 >> 16);
                    var48 += var9;
                    var52 += this.field5056;
                    var47 += var10;
                }
            } else {
                int var53 = arg0 - arg1;
                int var54 = arg1 - arg2;
                int var55 = this.field5056 * arg2;
                while (true) {
                    var54--;
                    if (var54 < 0) {
                        while (true) {
                            var53--;
                            if (var53 < 0) {
                                return;
                            }
                            class416.method2609(true, 0, var55, var49 >> 16, this.field5050, var47 >> 16);
                            var47 += var10;
                            var55 += this.field5056;
                            var49 += var8;
                        }
                    }
                    class416.method2609(true, 0, var55, var48 >> 16, this.field5050, var47 >> 16);
                    var47 += var10;
                    var48 += var9;
                    var55 += this.field5056;
                }
            }
        } else {
            int var56;
            int var57 = var56 = arg3 << 16;
            int var58 = arg6 << 16;
            if (arg2 < 0) {
                var56 -= arg2 * var10;
                var57 -= arg2 * var9;
                arg2 = 0;
            }
            if (arg0 < 0) {
                var58 -= arg0 * var8;
                arg0 = 0;
            }
            if (var9 < var10) {
                int var59 = arg1 - arg0;
                int var60 = arg0 - arg2;
                int var61 = this.field5056 * arg2;
                while (true) {
                    var60--;
                    if (var60 < 0) {
                        while (true) {
                            var59--;
                            if (var59 < 0) {
                                return;
                            }
                            class416.method2609(true, 0, var61, var58 >> 16, this.field5050, var57 >> 16);
                            var61 += this.field5056;
                            var57 += var9;
                            var58 += var8;
                        }
                    }
                    class416.method2609(true, 0, var61, var56 >> 16, this.field5050, var57 >> 16);
                    var56 += var10;
                    var57 += var9;
                    var61 += this.field5056;
                }
            } else {
                int var62 = arg1 - arg0;
                int var63 = arg0 - arg2;
                int var64 = this.field5056 * arg2;
                while (true) {
                    var63--;
                    if (var63 < 0) {
                        while (true) {
                            var62--;
                            if (var62 < 0) {
                                return;
                            }
                            class416.method2609(true, 0, var64, var57 >> 16, this.field5050, var58 >> 16);
                            var64 += this.field5056;
                            var57 += var9;
                            var58 += var8;
                        }
                    }
                    class416.method2609(true, 0, var64, var57 >> 16, this.field5050, var56 >> 16);
                    var64 += this.field5056;
                    var57 += var9;
                    var56 += var10;
                }
            }
        }
    }

    @OriginalMember(owner = "client!aa", name = "j", descriptor = "(I)V")
    public final void method2142(int arg0) {
        field5048++;
        if (arg0 >= -52) {
            this.field5053 = -93;
        }
        int var2 = -1;
        int var3 = this.field5050.length - 8;
        while (var2 < var3) {
            var2++;
            this.field5050[var2] = 0;
            var2++;
            this.field5050[var2] = 0;
            var2++;
            this.field5050[var2] = 0;
            var2++;
            this.field5050[var2] = 0;
            var2++;
            this.field5050[var2] = 0;
            var2++;
            this.field5050[var2] = 0;
            var2++;
            this.field5050[var2] = 0;
            var2++;
            this.field5050[var2] = 0;
        }
        while (this.field5050.length - 1 > var2) {
            var2++;
            this.field5050[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "(III)Z")
    public final boolean method2143(int arg0, int arg1, int arg2) {
        if (arg2 != 24853) {
            this.method2141(42, 105, 11, -109, false, -26, 33);
        }
        field5044++;
        return this.field5050.length >= (arg0 * arg1);
    }

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(Lkd;II)V")
    public class339(class188 arg0, int arg1, int arg2) {
        this.field5050 = new byte[arg1 * arg2];
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIIII)V")
    public final void method2144(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field5053 = arg2 - arg4;
        field5057++;
        this.field5049 = arg0;
        if (arg1 != -1) {
            this.field5050 = null;
        }
        this.field5056 = arg3 - arg0;
        this.field5045 = arg4;
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field5052[var1] = var0 - 1;
            var0 += var0;
        }
    }
}
