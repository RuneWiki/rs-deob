import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class601 extends class184 {

    @OriginalMember(owner = "client!gl", name = "I", descriptor = "[B")
    public byte[] field8372;

    @OriginalMember(owner = "client!gl", name = "F", descriptor = "Llga;")
    public static class712 field8369 = new class712(77, -1);

    @OriginalMember(owner = "client!gl", name = "M", descriptor = "Lcm;")
    public static class729 field8374 = new class729();

    @OriginalMember(owner = "client!gl", name = "w", descriptor = "I")
    public static int field8361;

    @OriginalMember(owner = "client!gl", name = "x", descriptor = "I")
    public int field8362;

    @OriginalMember(owner = "client!gl", name = "y", descriptor = "I")
    public int field8363;

    @OriginalMember(owner = "client!gl", name = "z", descriptor = "I")
    public static int field8364;

    @OriginalMember(owner = "client!gl", name = "A", descriptor = "I")
    public static int field8365;

    @OriginalMember(owner = "client!gl", name = "B", descriptor = "I")
    public static int field8366;

    @OriginalMember(owner = "client!gl", name = "C", descriptor = "I")
    public static int field8367;

    @OriginalMember(owner = "client!gl", name = "D", descriptor = "I")
    public int field8368;

    @OriginalMember(owner = "client!gl", name = "G", descriptor = "I")
    public static int field8370;

    @OriginalMember(owner = "client!gl", name = "H", descriptor = "I")
    public int field8371;

    @OriginalMember(owner = "client!gl", name = "K", descriptor = "I")
    public static int field8373;

    @OriginalMember(owner = "client!gl", name = "O", descriptor = "I")
    public static int field8375;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Z)V")
    public static void method3325(boolean arg0) {
        field8374 = null;
        field8369 = null;
        if (!arg0) {
            method3331(89, (byte) -40, 85);
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Ljava/lang/String;B)I")
    public static final int method3326(String arg0, byte arg1) {
        field8370++;
        if (arg1 <= 58) {
            field8374 = null;
        }
        return arg0.length() + 1;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIIII)V")
    public final void method3327(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field8363 = arg4 - arg3;
        field8364++;
        this.field8371 = arg0 - arg1;
        this.field8362 = arg1;
        if (arg2 == 0) {
            this.field8368 = arg3;
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(III)Z")
    public final boolean method3328(int arg0, int arg1, int arg2) {
        field8361++;
        if (arg2 != 22657) {
            this.method3330(-99);
        }
        return this.field8372.length >= (arg0 * arg1);
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIIIIBI)V")
    public final void method3329(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        if (arg5 != -69) {
            return;
        }
        field8375++;
        int var8 = 0;
        if (arg0 != arg6) {
            var8 = (arg2 - arg1 << 16) / (arg6 - arg0);
        }
        int var9 = 0;
        if (arg4 != arg6) {
            var9 = (arg3 - arg2 << 16) / (arg4 - arg6);
        }
        int var10 = 0;
        if (arg0 != arg4) {
            var10 = (arg1 - arg3 << 16) / (arg0 - arg4);
        }
        if (arg6 >= arg0 && arg0 <= arg4) {
            if (arg4 <= arg6) {
                int var11;
                int var12 = var11 = arg1 << 16;
                int var13 = arg3 << 16;
                if (arg0 < 0) {
                    var11 -= arg0 * var8;
                    var12 -= arg0 * var10;
                    arg0 = 0;
                }
                if (arg4 < 0) {
                    var13 -= arg4 * var9;
                    arg4 = 0;
                }
                if (arg0 != arg4 && var10 < var8 || arg0 == arg4 && var9 > var8) {
                    int var14 = arg6 - arg4;
                    int var15 = arg4 - arg0;
                    int var16 = this.field8363 * arg0;
                    while (true) {
                        var15--;
                        if (var15 < 0) {
                            while (true) {
                                var14--;
                                if (var14 < 0) {
                                    return;
                                }
                                class295.method1765((byte) 1, var16, var13 >> 16, var11 >> 16, 0, this.field8372);
                                var16 += this.field8363;
                                var11 += var8;
                                var13 += var9;
                            }
                        }
                        class295.method1765((byte) 1, var16, var12 >> 16, var11 >> 16, 0, this.field8372);
                        var12 += var10;
                        var11 += var8;
                        var16 += this.field8363;
                    }
                } else {
                    int var17 = arg6 - arg4;
                    int var18 = arg4 - arg0;
                    int var19 = this.field8363 * arg0;
                    while (true) {
                        var18--;
                        if (var18 < 0) {
                            while (true) {
                                var17--;
                                if (var17 < 0) {
                                    return;
                                }
                                class295.method1765((byte) 1, var19, var11 >> 16, var13 >> 16, 0, this.field8372);
                                var19 += this.field8363;
                                var11 += var8;
                                var13 += var9;
                            }
                        }
                        class295.method1765((byte) 1, var19, var11 >> 16, var12 >> 16, 0, this.field8372);
                        var12 += var10;
                        var19 += this.field8363;
                        var11 += var8;
                    }
                }
            } else {
                int var20;
                int var21 = var20 = arg1 << 16;
                if (arg0 < 0) {
                    var20 -= arg0 * var8;
                    var21 -= arg0 * var10;
                    arg0 = 0;
                }
                int var22 = arg2 << 16;
                if (arg6 < 0) {
                    var22 -= arg6 * var9;
                    arg6 = 0;
                }
                if (arg0 != arg6 && var10 < var8 || arg0 == arg6 && var10 > var9) {
                    int var23 = arg4 - arg6;
                    int var24 = arg6 - arg0;
                    int var25 = this.field8363 * arg0;
                    while (true) {
                        var24--;
                        if (var24 < 0) {
                            while (true) {
                                var23--;
                                if (var23 < 0) {
                                    return;
                                }
                                class295.method1765((byte) 1, var25, var21 >> 16, var22 >> 16, 0, this.field8372);
                                var22 += var9;
                                var25 += this.field8363;
                                var21 += var10;
                            }
                        }
                        class295.method1765((byte) 1, var25, var21 >> 16, var20 >> 16, 0, this.field8372);
                        var20 += var8;
                        var25 += this.field8363;
                        var21 += var10;
                    }
                } else {
                    int var26 = arg4 - arg6;
                    int var27 = arg6 - arg0;
                    int var28 = this.field8363 * arg0;
                    while (true) {
                        var27--;
                        if (var27 < 0) {
                            while (true) {
                                var26--;
                                if (var26 < 0) {
                                    return;
                                }
                                class295.method1765((byte) 1, var28, var22 >> 16, var21 >> 16, 0, this.field8372);
                                var28 += this.field8363;
                                var22 += var9;
                                var21 += var10;
                            }
                        }
                        class295.method1765((byte) 1, var28, var20 >> 16, var21 >> 16, 0, this.field8372);
                        var28 += this.field8363;
                        var21 += var10;
                        var20 += var8;
                    }
                }
            }
        } else if (arg4 >= arg6) {
            if (arg0 <= arg4) {
                int var29;
                int var30 = var29 = arg2 << 16;
                int var31 = arg1 << 16;
                if (arg6 < 0) {
                    var29 -= arg6 * var9;
                    var30 -= arg6 * var8;
                    arg6 = 0;
                }
                if (arg0 < 0) {
                    var31 -= arg0 * var10;
                    arg0 = 0;
                }
                if (var8 < var9) {
                    int var32 = arg4 - arg0;
                    int var33 = arg0 - arg6;
                    int var34 = this.field8363 * arg6;
                    while (true) {
                        var33--;
                        if (var33 < 0) {
                            while (true) {
                                var32--;
                                if (var32 < 0) {
                                    return;
                                }
                                class295.method1765((byte) 1, var34, var31 >> 16, var29 >> 16, 0, this.field8372);
                                var34 += this.field8363;
                                var31 += var10;
                                var29 += var9;
                            }
                        }
                        class295.method1765((byte) 1, var34, var30 >> 16, var29 >> 16, 0, this.field8372);
                        var34 += this.field8363;
                        var29 += var9;
                        var30 += var8;
                    }
                } else {
                    int var35 = arg4 - arg0;
                    int var36 = arg0 - arg6;
                    int var37 = this.field8363 * arg6;
                    while (true) {
                        var36--;
                        if (var36 < 0) {
                            while (true) {
                                var35--;
                                if (var35 < 0) {
                                    return;
                                }
                                class295.method1765((byte) 1, var37, var29 >> 16, var31 >> 16, 0, this.field8372);
                                var37 += this.field8363;
                                var31 += var10;
                                var29 += var9;
                            }
                        }
                        class295.method1765((byte) 1, var37, var29 >> 16, var30 >> 16, 0, this.field8372);
                        var29 += var9;
                        var37 += this.field8363;
                        var30 += var8;
                    }
                }
            } else {
                int var38;
                int var39 = var38 = arg2 << 16;
                int var40 = arg3 << 16;
                if (arg6 < 0) {
                    var38 -= arg6 * var9;
                    var39 -= arg6 * var8;
                    arg6 = 0;
                }
                if (arg4 < 0) {
                    var40 -= arg4 * var10;
                    arg4 = 0;
                }
                if (arg4 != arg6 && var8 < var9 || arg4 == arg6 && var10 < var8) {
                    int var41 = arg0 - arg4;
                    int var42 = arg4 - arg6;
                    int var43 = this.field8363 * arg6;
                    while (true) {
                        var42--;
                        if (var42 < 0) {
                            while (true) {
                                var41--;
                                if (var41 < 0) {
                                    return;
                                }
                                class295.method1765((byte) 1, var43, var39 >> 16, var40 >> 16, 0, this.field8372);
                                var39 += var8;
                                var40 += var10;
                                var43 += this.field8363;
                            }
                        }
                        class295.method1765((byte) 1, var43, var39 >> 16, var38 >> 16, 0, this.field8372);
                        var38 += var9;
                        var43 += this.field8363;
                        var39 += var8;
                    }
                } else {
                    int var44 = arg0 - arg4;
                    int var45 = arg4 - arg6;
                    int var46 = this.field8363 * arg6;
                    while (true) {
                        var45--;
                        if (var45 < 0) {
                            while (true) {
                                var44--;
                                if (var44 < 0) {
                                    return;
                                }
                                class295.method1765((byte) 1, var46, var40 >> 16, var39 >> 16, 0, this.field8372);
                                var39 += var8;
                                var46 += this.field8363;
                                var40 += var10;
                            }
                        }
                        class295.method1765((byte) 1, var46, var38 >> 16, var39 >> 16, 0, this.field8372);
                        var39 += var8;
                        var46 += this.field8363;
                        var38 += var9;
                    }
                }
            }
        } else if (arg0 >= arg6) {
            int var47;
            int var48 = var47 = arg3 << 16;
            int var49 = arg2 << 16;
            if (arg4 < 0) {
                var48 -= arg4 * var9;
                var47 -= arg4 * var10;
                arg4 = 0;
            }
            if (arg6 < 0) {
                var49 -= arg6 * var8;
                arg6 = 0;
            }
            if (var9 >= var10) {
                int var50 = arg0 - arg6;
                int var51 = arg6 - arg4;
                int var52 = this.field8363 * arg4;
                while (true) {
                    var51--;
                    if (var51 < 0) {
                        while (true) {
                            var50--;
                            if (var50 < 0) {
                                return;
                            }
                            class295.method1765((byte) 1, var52, var47 >> 16, var49 >> 16, 0, this.field8372);
                            var52 += this.field8363;
                            var49 += var8;
                            var47 += var10;
                        }
                    }
                    class295.method1765((byte) 1, var52, var47 >> 16, var48 >> 16, 0, this.field8372);
                    var52 += this.field8363;
                    var48 += var9;
                    var47 += var10;
                }
            } else {
                int var53 = arg0 - arg6;
                int var54 = arg6 - arg4;
                int var55 = this.field8363 * arg4;
                while (true) {
                    var54--;
                    if (var54 < 0) {
                        while (true) {
                            var53--;
                            if (var53 < 0) {
                                return;
                            }
                            class295.method1765((byte) 1, var55, var49 >> 16, var47 >> 16, 0, this.field8372);
                            var47 += var10;
                            var49 += var8;
                            var55 += this.field8363;
                        }
                    }
                    class295.method1765((byte) 1, var55, var48 >> 16, var47 >> 16, 0, this.field8372);
                    var47 += var10;
                    var48 += var9;
                    var55 += this.field8363;
                }
            }
        } else {
            int var56;
            int var57 = var56 = arg3 << 16;
            int var58 = arg1 << 16;
            if (arg4 < 0) {
                var57 -= arg4 * var9;
                var56 -= arg4 * var10;
                arg4 = 0;
            }
            if (arg0 < 0) {
                var58 -= arg0 * var8;
                arg0 = 0;
            }
            if (var10 <= var9) {
                int var59 = arg6 - arg0;
                int var60 = arg0 - arg4;
                int var61 = this.field8363 * arg4;
                while (true) {
                    var60--;
                    if (var60 < 0) {
                        while (true) {
                            var59--;
                            if (var59 < 0) {
                                return;
                            }
                            class295.method1765((byte) 1, var61, var58 >> 16, var57 >> 16, 0, this.field8372);
                            var61 += this.field8363;
                            var57 += var9;
                            var58 += var8;
                        }
                    }
                    class295.method1765((byte) 1, var61, var56 >> 16, var57 >> 16, 0, this.field8372);
                    var61 += this.field8363;
                    var56 += var10;
                    var57 += var9;
                }
            } else {
                int var62 = arg6 - arg0;
                int var63 = arg0 - arg4;
                int var64 = this.field8363 * arg4;
                while (true) {
                    var63--;
                    if (var63 < 0) {
                        while (true) {
                            var62--;
                            if (var62 < 0) {
                                return;
                            }
                            class295.method1765((byte) 1, var64, var57 >> 16, var58 >> 16, 0, this.field8372);
                            var64 += this.field8363;
                            var57 += var9;
                            var58 += var8;
                        }
                    }
                    class295.method1765((byte) 1, var64, var57 >> 16, var56 >> 16, 0, this.field8372);
                    var57 += var9;
                    var56 += var10;
                    var64 += this.field8363;
                }
            }
        }
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(I)V")
    public final void method3330(int arg0) {
        field8367++;
        if (arg0 <= 68) {
            this.field8363 = -106;
        }
        int var2 = -1;
        int var3 = this.field8372.length - 8;
        while (var2 < var3) {
            var2++;
            this.field8372[var2] = 0;
            var2++;
            this.field8372[var2] = 0;
            var2++;
            this.field8372[var2] = 0;
            var2++;
            this.field8372[var2] = 0;
            var2++;
            this.field8372[var2] = 0;
            var2++;
            this.field8372[var2] = 0;
            var2++;
            this.field8372[var2] = 0;
            var2++;
            this.field8372[var2] = 0;
        }
        while (this.field8372.length - 1 > var2) {
            var2++;
            this.field8372[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IBI)Z")
    public static final boolean method3331(int arg0, byte arg1, int arg2) {
        field8366++;
        return arg1 > -120 ? true : class257.method1545(arg0, (byte) 114, arg2) & class438.method2478(24578, arg0, arg2);
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "([Lgg;II)V")
    public static final void method3332(class176[] arg0, int arg1, int arg2) {
        if (arg1 >= arg2) {
            return;
        }
        int var3 = (arg1 + arg2) / 2;
        int var4 = arg1;
        class176 var5 = arg0[var3];
        arg0[var3] = arg0[arg2];
        arg0[arg2] = var5;
        int var6 = var5.field2169;
        for (int var7 = arg1; var7 < arg2; var7++) {
            if (arg0[var7].field2169 > (var7 & 0x1) + var6) {
                class176 var8 = arg0[var7];
                arg0[var7] = arg0[var4];
                arg0[var4++] = var8;
            }
        }
        arg0[arg2] = arg0[var4];
        arg0[var4] = var5;
        method3332(arg0, arg1, var4 - 1);
        method3332(arg0, var4 + 1, arg2);
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(I[BIIIII[BI)V")
    public static final void method3333(int arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte[] arg7, int arg8) {
        if (arg3 != 1230470320) {
            method3333(-3, null, -82, 89, -120, 72, 31, null, -70);
        }
        field8365++;
        int var9 = -(arg5 >> 2);
        int var10 = -(arg5 & 0x3);
        for (int var11 = -arg2; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg8++;
                arg1[var10001] += arg7[arg0++];
                int var14 = arg8++;
                arg1[var14] += arg7[arg0++];
                int var15 = arg8++;
                arg1[var15] += arg7[arg0++];
                int var16 = arg8++;
                arg1[var16] += arg7[arg0++];
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg8++;
                arg1[var10001] += arg7[arg0++];
            }
            arg0 += arg6;
            arg8 += arg4;
        }
    }

    @OriginalMember(owner = "client!gl", name = "<init>", descriptor = "(Luv;II)V")
    public class601(class367 arg0, int arg1, int arg2) {
        this.field8372 = new byte[arg1 * arg2];
    }
}
