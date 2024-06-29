import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class429 extends class31 {

    @OriginalMember(owner = "client!re", name = "A", descriptor = "[B")
    public byte[] field6231;

    @OriginalMember(owner = "client!re", name = "E", descriptor = "Ljc;")
    public static class305 field6235 = new class305("M", "M", "M", "M");

    @OriginalMember(owner = "client!re", name = "H", descriptor = "[I")
    public static int[] field6238 = new int[5];

    @OriginalMember(owner = "client!re", name = "J", descriptor = "I")
    public static int field6240 = 2;

    @OriginalMember(owner = "client!re", name = "L", descriptor = "Lao;")
    public static class191 field6241 = new class191(112, -2);

    @OriginalMember(owner = "client!re", name = "w", descriptor = "I")
    public int field6227;

    @OriginalMember(owner = "client!re", name = "x", descriptor = "I")
    public static int field6228;

    @OriginalMember(owner = "client!re", name = "y", descriptor = "I")
    public static int field6229;

    @OriginalMember(owner = "client!re", name = "z", descriptor = "I")
    public int field6230;

    @OriginalMember(owner = "client!re", name = "B", descriptor = "I")
    public static int field6232;

    @OriginalMember(owner = "client!re", name = "C", descriptor = "I")
    public static int field6233;

    @OriginalMember(owner = "client!re", name = "D", descriptor = "I")
    public int field6234;

    @OriginalMember(owner = "client!re", name = "F", descriptor = "I")
    public int field6236;

    @OriginalMember(owner = "client!re", name = "G", descriptor = "I")
    public static int field6237;

    @OriginalMember(owner = "client!re", name = "I", descriptor = "I")
    public static int field6239;

    @OriginalMember(owner = "client!re", name = "M", descriptor = "Lp;")
    public static class147 field6242;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(B)V")
    public static void method2635(byte arg0) {
        field6238 = null;
        field6241 = null;
        field6242 = null;
        if (arg0 != 119) {
            method2641(-11, 61, 126, true, -85, -29);
        }
        field6235 = null;
    }

    @OriginalMember(owner = "client!re", name = "d", descriptor = "(B)V")
    public final void method2636(byte arg0) {
        field6237++;
        if (arg0 != 57) {
            field6241 = null;
        }
        int var2 = -1;
        int var3 = this.field6231.length - 8;
        while (var3 > var2) {
            var2++;
            this.field6231[var2] = 0;
            var2++;
            this.field6231[var2] = 0;
            var2++;
            this.field6231[var2] = 0;
            var2++;
            this.field6231[var2] = 0;
            var2++;
            this.field6231[var2] = 0;
            var2++;
            this.field6231[var2] = 0;
            var2++;
            this.field6231[var2] = 0;
            var2++;
            this.field6231[var2] = 0;
        }
        while (this.field6231.length - 1 > var2) {
            var2++;
            this.field6231[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIII)V")
    public final void method2637(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field6232++;
        this.field6227 = arg3 - arg4;
        this.field6230 = arg0;
        this.field6236 = arg1 - arg0;
        this.field6234 = arg4;
        int var6 = 9 % ((arg2 - 59) / 38);
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIIIII)V")
    public final void method2638(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field6233++;
        int var8 = 0;
        if (arg3 != arg4) {
            var8 = (arg6 - arg2 << 16) / (arg3 - arg4);
        }
        int var9 = 0;
        if (arg1 != arg3) {
            var9 = (arg5 - arg6 << 16) / (arg1 - arg3);
        }
        int var10 = 0;
        if (arg1 != arg4) {
            var10 = (arg2 - arg5 << 16) / (arg4 - arg1);
        }
        if (arg0 != 1061320208) {
            this.method2638(-31, 1, -2, -17, 60, -124, 120);
        }
        if (arg3 >= arg4 && arg1 >= arg4) {
            if (arg3 >= arg1) {
                int var11;
                int var12 = var11 = arg2 << 16;
                if (arg4 < 0) {
                    var12 -= arg4 * var10;
                    var11 -= arg4 * var8;
                    arg4 = 0;
                }
                int var13 = arg5 << 16;
                if (arg1 < 0) {
                    var13 -= arg1 * var9;
                    arg1 = 0;
                }
                if ((arg1 == arg4 || var8 <= var10) && (arg1 != arg4 || var8 >= var9)) {
                    int var17 = arg3 - arg1;
                    int var18 = arg1 - arg4;
                    int var19 = this.field6227 * arg4;
                    while (true) {
                        var18--;
                        if (var18 < 0) {
                            while (true) {
                                var17--;
                                if (var17 < 0) {
                                    return;
                                }
                                class214.method1370(var13 >> 16, this.field6231, (byte) 9, 0, var11 >> 16, var19);
                                var19 += this.field6227;
                                var11 += var8;
                                var13 += var9;
                            }
                        }
                        class214.method1370(var12 >> 16, this.field6231, (byte) 123, 0, var11 >> 16, var19);
                        var11 += var8;
                        var19 += this.field6227;
                        var12 += var10;
                    }
                } else {
                    int var14 = arg3 - arg1;
                    int var15 = arg1 - arg4;
                    int var16 = this.field6227 * arg4;
                    while (true) {
                        var15--;
                        if (var15 < 0) {
                            while (true) {
                                var14--;
                                if (var14 < 0) {
                                    return;
                                }
                                class214.method1370(var11 >> 16, this.field6231, (byte) 100, 0, var13 >> 16, var16);
                                var11 += var8;
                                var13 += var9;
                                var16 += this.field6227;
                            }
                        }
                        class214.method1370(var11 >> 16, this.field6231, (byte) 119, 0, var12 >> 16, var16);
                        var16 += this.field6227;
                        var11 += var8;
                        var12 += var10;
                    }
                }
            } else {
                int var20;
                int var21 = var20 = arg2 << 16;
                int var22 = arg6 << 16;
                if (arg4 < 0) {
                    var21 -= arg4 * var10;
                    var20 -= arg4 * var8;
                    arg4 = 0;
                }
                if (arg3 < 0) {
                    var22 -= arg3 * var9;
                    arg3 = 0;
                }
                if (arg3 != arg4 && var8 > var10 || arg3 == arg4 && var9 < var10) {
                    int var23 = arg1 - arg3;
                    int var24 = arg3 - arg4;
                    int var25 = this.field6227 * arg4;
                    while (true) {
                        var24--;
                        if (var24 < 0) {
                            while (true) {
                                var23--;
                                if (var23 < 0) {
                                    return;
                                }
                                class214.method1370(var22 >> 16, this.field6231, (byte) 106, 0, var21 >> 16, var25);
                                var22 += var9;
                                var21 += var10;
                                var25 += this.field6227;
                            }
                        }
                        class214.method1370(var20 >> 16, this.field6231, (byte) 86, 0, var21 >> 16, var25);
                        var25 += this.field6227;
                        var21 += var10;
                        var20 += var8;
                    }
                } else {
                    int var26 = arg1 - arg3;
                    int var27 = arg3 - arg4;
                    int var28 = this.field6227 * arg4;
                    while (true) {
                        var27--;
                        if (var27 < 0) {
                            while (true) {
                                var26--;
                                if (var26 < 0) {
                                    return;
                                }
                                class214.method1370(var21 >> 16, this.field6231, (byte) 91, 0, var22 >> 16, var28);
                                var28 += this.field6227;
                                var21 += var10;
                                var22 += var9;
                            }
                        }
                        class214.method1370(var21 >> 16, this.field6231, (byte) 53, 0, var20 >> 16, var28);
                        var21 += var10;
                        var28 += this.field6227;
                        var20 += var8;
                    }
                }
            }
        } else if (arg3 > arg1) {
            if (arg4 < arg3) {
                int var29;
                int var30 = var29 = arg5 << 16;
                int var31 = arg2 << 16;
                if (arg1 < 0) {
                    var30 -= arg1 * var9;
                    var29 -= arg1 * var10;
                    arg1 = 0;
                }
                if (arg4 < 0) {
                    var31 -= arg4 * var8;
                    arg4 = 0;
                }
                if (var9 < var10) {
                    int var32 = arg3 - arg4;
                    int var33 = arg4 - arg1;
                    int var34 = this.field6227 * arg1;
                    while (true) {
                        var33--;
                        if (var33 < 0) {
                            while (true) {
                                var32--;
                                if (var32 < 0) {
                                    return;
                                }
                                class214.method1370(var31 >> 16, this.field6231, (byte) 39, 0, var30 >> 16, var34);
                                var31 += var8;
                                var30 += var9;
                                var34 += this.field6227;
                            }
                        }
                        class214.method1370(var29 >> 16, this.field6231, (byte) 33, 0, var30 >> 16, var34);
                        var30 += var9;
                        var29 += var10;
                        var34 += this.field6227;
                    }
                } else {
                    int var35 = arg3 - arg4;
                    int var36 = arg4 - arg1;
                    int var37 = this.field6227 * arg1;
                    while (true) {
                        var36--;
                        if (var36 < 0) {
                            while (true) {
                                var35--;
                                if (var35 < 0) {
                                    return;
                                }
                                class214.method1370(var30 >> 16, this.field6231, (byte) 103, 0, var31 >> 16, var37);
                                var37 += this.field6227;
                                var31 += var8;
                                var30 += var9;
                            }
                        }
                        class214.method1370(var30 >> 16, this.field6231, (byte) 99, 0, var29 >> 16, var37);
                        var37 += this.field6227;
                        var29 += var10;
                        var30 += var9;
                    }
                }
            } else {
                int var38;
                int var39 = var38 = arg5 << 16;
                int var40 = arg6 << 16;
                if (arg1 < 0) {
                    var39 -= arg1 * var9;
                    var38 -= arg1 * var10;
                    arg1 = 0;
                }
                if (arg3 < 0) {
                    var40 -= arg3 * var8;
                    arg3 = 0;
                }
                if (var9 >= var10) {
                    int var41 = arg4 - arg3;
                    int var42 = arg3 - arg1;
                    int var43 = this.field6227 * arg1;
                    while (true) {
                        var42--;
                        if (var42 < 0) {
                            while (true) {
                                var41--;
                                if (var41 < 0) {
                                    return;
                                }
                                class214.method1370(var40 >> 16, this.field6231, (byte) 96, 0, var38 >> 16, var43);
                                var40 += var8;
                                var38 += var10;
                                var43 += this.field6227;
                            }
                        }
                        class214.method1370(var39 >> 16, this.field6231, (byte) 109, 0, var38 >> 16, var43);
                        var39 += var9;
                        var43 += this.field6227;
                        var38 += var10;
                    }
                } else {
                    int var44 = arg4 - arg3;
                    int var45 = arg3 - arg1;
                    int var46 = this.field6227 * arg1;
                    while (true) {
                        var45--;
                        if (var45 < 0) {
                            while (true) {
                                var44--;
                                if (var44 < 0) {
                                    return;
                                }
                                class214.method1370(var38 >> 16, this.field6231, (byte) 113, 0, var40 >> 16, var46);
                                var38 += var10;
                                var46 += this.field6227;
                                var40 += var8;
                            }
                        }
                        class214.method1370(var38 >> 16, this.field6231, (byte) 52, 0, var39 >> 16, var46);
                        var38 += var10;
                        var39 += var9;
                        var46 += this.field6227;
                    }
                }
            }
        } else if (arg1 < arg4) {
            int var47;
            int var48 = var47 = arg6 << 16;
            int var49 = arg5 << 16;
            if (arg3 < 0) {
                var48 -= arg3 * var8;
                var47 -= arg3 * var9;
                arg3 = 0;
            }
            if (arg1 < 0) {
                var49 -= arg1 * var10;
                arg1 = 0;
            }
            if (arg1 != arg3 && var9 > var8 || arg1 == arg3 && var10 < var8) {
                int var50 = arg4 - arg1;
                int var51 = arg1 - arg3;
                int var52 = this.field6227 * arg3;
                while (true) {
                    var51--;
                    if (var51 < 0) {
                        while (true) {
                            var50--;
                            if (var50 < 0) {
                                return;
                            }
                            class214.method1370(var49 >> 16, this.field6231, (byte) 93, 0, var48 >> 16, var52);
                            var49 += var10;
                            var48 += var8;
                            var52 += this.field6227;
                        }
                    }
                    class214.method1370(var47 >> 16, this.field6231, (byte) 100, 0, var48 >> 16, var52);
                    var47 += var9;
                    var48 += var8;
                    var52 += this.field6227;
                }
            } else {
                int var53 = arg4 - arg1;
                int var54 = arg1 - arg3;
                int var55 = this.field6227 * arg3;
                while (true) {
                    var54--;
                    if (var54 < 0) {
                        while (true) {
                            var53--;
                            if (var53 < 0) {
                                return;
                            }
                            class214.method1370(var48 >> 16, this.field6231, (byte) 69, 0, var49 >> 16, var55);
                            var48 += var8;
                            var49 += var10;
                            var55 += this.field6227;
                        }
                    }
                    class214.method1370(var48 >> 16, this.field6231, (byte) 47, 0, var47 >> 16, var55);
                    var48 += var8;
                    var55 += this.field6227;
                    var47 += var9;
                }
            }
        } else {
            int var56;
            int var57 = var56 = arg6 << 16;
            if (arg3 < 0) {
                var56 -= arg3 * var9;
                var57 -= arg3 * var8;
                arg3 = 0;
            }
            int var58 = arg2 << 16;
            if (arg4 < 0) {
                var58 -= arg4 * var10;
                arg4 = 0;
            }
            if (var9 <= var8) {
                int var59 = arg1 - arg4;
                int var60 = arg4 - arg3;
                int var61 = this.field6227 * arg3;
                while (true) {
                    var60--;
                    if (var60 < 0) {
                        while (true) {
                            var59--;
                            if (var59 < 0) {
                                return;
                            }
                            class214.method1370(var58 >> 16, this.field6231, (byte) 104, 0, var56 >> 16, var61);
                            var61 += this.field6227;
                            var56 += var9;
                            var58 += var10;
                        }
                    }
                    class214.method1370(var57 >> 16, this.field6231, (byte) 99, 0, var56 >> 16, var61);
                    var57 += var8;
                    var56 += var9;
                    var61 += this.field6227;
                }
            } else {
                int var62 = arg1 - arg4;
                int var63 = arg4 - arg3;
                int var64 = this.field6227 * arg3;
                while (true) {
                    var63--;
                    if (var63 < 0) {
                        while (true) {
                            var62--;
                            if (var62 < 0) {
                                return;
                            }
                            class214.method1370(var56 >> 16, this.field6231, (byte) 98, 0, var58 >> 16, var64);
                            var58 += var10;
                            var56 += var9;
                            var64 += this.field6227;
                        }
                    }
                    class214.method1370(var56 >> 16, this.field6231, (byte) 91, 0, var57 >> 16, var64);
                    var57 += var8;
                    var56 += var9;
                    var64 += this.field6227;
                }
            }
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(JB)V")
    public static final void method2639(long arg0, byte arg1) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
        if (arg1 > -24) {
            method2641(65, -41, -14, true, -103, 38);
        }
        field6229++;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(III)Z")
    public final boolean method2640(int arg0, int arg1, int arg2) {
        field6228++;
        if (arg2 != 1633034480) {
            method2641(-108, -43, -6, false, -61, 22);
        }
        return this.field6231.length >= arg0 * arg1;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIZII)V")
    public static final void method2641(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        class316.field4230 = arg5;
        class135.field1791 = arg4;
        field6239++;
        class95.field1149 = arg2;
        class275.field3655 = arg1;
        class15.field158 = arg0;
        if (class275.field3655 >= 100) {
            int var6 = class95.field1149 * 128 + 64;
            int var7 = class15.field158 * 128 + 64;
            int var8 = class470.method2868(116, class210.field2808, var6, var7) - class135.field1791;
            int var9 = var6 - class238.field3171;
            int var10 = var8 - class267.field3572;
            int var11 = var7 - class139.field1857;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + var11 * var11));
            class65.field739 = (int) (Math.atan2((double) var10, (double) var12) * 2607.5945876176133D) & 0x3FFF;
            class9.field110 = (int) (Math.atan2((double) var9, (double) var11) * -2607.5945876176133D) & 0x3FFF;
            if (class65.field739 < 1024) {
                class65.field739 = 1024;
            }
            class230.field3104 = 0;
            if (class65.field739 > 3072) {
                class65.field739 = 3072;
            }
        }
        if (!arg3) {
            class47.field491 = 2;
        }
    }

    @OriginalMember(owner = "client!re", name = "<init>", descriptor = "(Lur;II)V")
    public class429(class377 arg0, int arg1, int arg2) {
        this.field6231 = new byte[arg1 * arg2];
    }
}
