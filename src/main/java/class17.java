import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mda")
public class class17 extends class88 {

    @OriginalMember(owner = "client!mda", name = "w", descriptor = "[B")
    public byte[] field175;

    @OriginalMember(owner = "client!mda", name = "E", descriptor = "F")
    public static float field183 = 1.0F;

    @OriginalMember(owner = "client!mda", name = "u", descriptor = "Llg;")
    public static class32 field173 = new class32();

    @OriginalMember(owner = "client!mda", name = "F", descriptor = "Ljs;")
    public static class251 field184 = new class251(14, 1);

    @OriginalMember(owner = "client!mda", name = "G", descriptor = "Ljs;")
    public static class251 field185 = new class251(15, 4);

    @OriginalMember(owner = "client!mda", name = "H", descriptor = "Ljs;")
    public static class251 field186 = new class251(16, -2);

    @OriginalMember(owner = "client!mda", name = "I", descriptor = "Ljs;")
    public static class251 field187 = new class251(17, 0);

    @OriginalMember(owner = "client!mda", name = "J", descriptor = "Ljs;")
    public static class251 field188 = new class251(18, -2);

    @OriginalMember(owner = "client!mda", name = "K", descriptor = "Ljs;")
    public static class251 field189 = new class251(19, -2);

    @OriginalMember(owner = "client!mda", name = "L", descriptor = "Ljs;")
    public static class251 field190 = new class251(20, 6);

    @OriginalMember(owner = "client!mda", name = "M", descriptor = "Ljs;")
    public static class251 field191 = new class251(21, 9);

    @OriginalMember(owner = "client!mda", name = "N", descriptor = "Ljs;")
    public static class251 field192 = new class251(22, -2);

    @OriginalMember(owner = "client!mda", name = "O", descriptor = "Ljs;")
    public static class251 field193 = new class251(23, 4);

    @OriginalMember(owner = "client!mda", name = "P", descriptor = "Ljs;")
    public static class251 field194 = new class251(24, -1);

    @OriginalMember(owner = "client!mda", name = "Q", descriptor = "Ljs;")
    public static class251 field195 = new class251(25, -2);

    @OriginalMember(owner = "client!mda", name = "R", descriptor = "Ljs;")
    public static class251 field196 = new class251(26, 0);

    @OriginalMember(owner = "client!mda", name = "S", descriptor = "Ljs;")
    public static class251 field197 = new class251(27, 0);

    @OriginalMember(owner = "client!mda", name = "T", descriptor = "[Ljs;")
    private static class251[] field198 = new class251[32];

    @OriginalMember(owner = "client!mda", name = "s", descriptor = "I")
    public static int field171;

    @OriginalMember(owner = "client!mda", name = "t", descriptor = "I")
    public static int field172;

    @OriginalMember(owner = "client!mda", name = "v", descriptor = "I")
    public static int field174;

    @OriginalMember(owner = "client!mda", name = "x", descriptor = "I")
    public static int field176;

    @OriginalMember(owner = "client!mda", name = "y", descriptor = "I")
    public static int field177;

    @OriginalMember(owner = "client!mda", name = "z", descriptor = "I")
    public int field178;

    @OriginalMember(owner = "client!mda", name = "A", descriptor = "I")
    public int field179;

    @OriginalMember(owner = "client!mda", name = "B", descriptor = "I")
    public int field180;

    @OriginalMember(owner = "client!mda", name = "C", descriptor = "I")
    public static int field181;

    @OriginalMember(owner = "client!mda", name = "D", descriptor = "I")
    public int field182;

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(IIIII)V")
    public final void method76(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field180 = arg0;
        this.field182 = arg2 - arg4;
        this.field178 = arg4;
        this.field179 = arg3 - arg0;
        field174++;
        if (arg1 != -21) {
            field190 = null;
        }
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(II)Z")
    public static final boolean method77(int arg0, int arg1) {
        field177++;
        if (arg1 == 20 || arg1 == 9 || arg1 == 16 || arg1 == 21 || arg1 == 6) {
            return true;
        } else if (arg0 == -30195) {
            return arg1 == 8 || arg1 == 1006;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mda", name = "c", descriptor = "(I)V")
    public static void method78(int arg0) {
        field173 = null;
        field192 = null;
        field196 = null;
        field198 = null;
        field186 = null;
        field194 = null;
        field188 = null;
        if (arg0 != 0) {
            return;
        }
        field190 = null;
        field191 = null;
        field189 = null;
        field197 = null;
        field193 = null;
        field184 = null;
        field187 = null;
        field185 = null;
        field195 = null;
    }

    @OriginalMember(owner = "client!mda", name = "g", descriptor = "(I)V")
    public final void method79(int arg0) {
        field172++;
        int var2 = -1;
        if (arg0 != -17895) {
            return;
        }
        int var3 = this.field175.length - 8;
        while (var3 > var2) {
            var2++;
            this.field175[var2] = 0;
            var2++;
            this.field175[var2] = 0;
            var2++;
            this.field175[var2] = 0;
            var2++;
            this.field175[var2] = 0;
            var2++;
            this.field175[var2] = 0;
            var2++;
            this.field175[var2] = 0;
            var2++;
            this.field175[var2] = 0;
            var2++;
            this.field175[var2] = 0;
        }
        while (var2 < (this.field175.length - 1)) {
            var2++;
            this.field175[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(IIIIIII)V")
    public final void method80(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field171++;
        int var8 = 0;
        if (arg1 != arg6) {
            var8 = (arg4 - arg3 << 16) / (arg1 - arg6);
        }
        int var9 = 0;
        if (arg1 != arg2) {
            var9 = (arg0 - arg4 << 16) / (arg2 - arg1);
        }
        int var10 = 0;
        if (arg5 != 27089) {
            return;
        }
        if (arg2 != arg6) {
            var10 = (arg3 - arg0 << 16) / (arg6 - arg2);
        }
        if (arg1 >= arg6 && arg2 >= arg6) {
            if (arg2 <= arg1) {
                int var11;
                int var12 = var11 = arg3 << 16;
                int var13 = arg0 << 16;
                if (arg6 < 0) {
                    var11 -= arg6 * var8;
                    var12 -= arg6 * var10;
                    arg6 = 0;
                }
                if (arg2 < 0) {
                    var13 -= arg2 * var9;
                    arg2 = 0;
                }
                if (arg2 != arg6 && var10 < var8 || arg2 == arg6 && var8 < var9) {
                    int var14 = arg1 - arg2;
                    int var15 = arg2 - arg6;
                    int var16 = this.field182 * arg6;
                    while (true) {
                        var15--;
                        if (var15 < 0) {
                            while (true) {
                                var14--;
                                if (var14 < 0) {
                                    return;
                                }
                                class86.method486(var13 >> 16, var16, 0, this.field175, var11 >> 16, 0);
                                var11 += var8;
                                var16 += this.field182;
                                var13 += var9;
                            }
                        }
                        class86.method486(var12 >> 16, var16, 0, this.field175, var11 >> 16, 0);
                        var16 += this.field182;
                        var12 += var10;
                        var11 += var8;
                    }
                } else {
                    int var17 = arg1 - arg2;
                    int var18 = arg2 - arg6;
                    int var19 = this.field182 * arg6;
                    while (true) {
                        var18--;
                        if (var18 < 0) {
                            while (true) {
                                var17--;
                                if (var17 < 0) {
                                    return;
                                }
                                class86.method486(var11 >> 16, var19, 0, this.field175, var13 >> 16, 0);
                                var13 += var9;
                                var19 += this.field182;
                                var11 += var8;
                            }
                        }
                        class86.method486(var11 >> 16, var19, 0, this.field175, var12 >> 16, 0);
                        var11 += var8;
                        var19 += this.field182;
                        var12 += var10;
                    }
                }
            } else {
                int var20;
                int var21 = var20 = arg3 << 16;
                int var22 = arg4 << 16;
                if (arg6 < 0) {
                    var21 -= arg6 * var10;
                    var20 -= arg6 * var8;
                    arg6 = 0;
                }
                if (arg1 < 0) {
                    var22 -= arg1 * var9;
                    arg1 = 0;
                }
                if (arg1 != arg6 && var8 > var10 || arg1 == arg6 && var9 < var10) {
                    int var23 = arg2 - arg1;
                    int var24 = arg1 - arg6;
                    int var25 = this.field182 * arg6;
                    while (true) {
                        var24--;
                        if (var24 < 0) {
                            while (true) {
                                var23--;
                                if (var23 < 0) {
                                    return;
                                }
                                class86.method486(var21 >> 16, var25, 0, this.field175, var22 >> 16, 0);
                                var25 += this.field182;
                                var21 += var10;
                                var22 += var9;
                            }
                        }
                        class86.method486(var21 >> 16, var25, arg5 ^ 0x69D1, this.field175, var20 >> 16, 0);
                        var21 += var10;
                        var25 += this.field182;
                        var20 += var8;
                    }
                } else {
                    int var26 = arg2 - arg1;
                    int var27 = arg1 - arg6;
                    int var28 = this.field182 * arg6;
                    while (true) {
                        var27--;
                        if (var27 < 0) {
                            while (true) {
                                var26--;
                                if (var26 < 0) {
                                    return;
                                }
                                class86.method486(var22 >> 16, var28, 0, this.field175, var21 >> 16, 0);
                                var28 += this.field182;
                                var21 += var10;
                                var22 += var9;
                            }
                        }
                        class86.method486(var20 >> 16, var28, arg5 ^ 0x69D1, this.field175, var21 >> 16, 0);
                        var28 += this.field182;
                        var20 += var8;
                        var21 += var10;
                    }
                }
            }
        } else if (arg2 < arg1) {
            if (arg1 <= arg6) {
                int var29;
                int var30 = var29 = arg0 << 16;
                if (arg2 < 0) {
                    var29 -= arg2 * var10;
                    var30 -= arg2 * var9;
                    arg2 = 0;
                }
                int var31 = arg4 << 16;
                if (arg1 < 0) {
                    var31 -= arg1 * var8;
                    arg1 = 0;
                }
                if (var10 > var9) {
                    int var32 = arg6 - arg1;
                    int var33 = arg1 - arg2;
                    int var34 = this.field182 * arg2;
                    while (true) {
                        var33--;
                        if (var33 < 0) {
                            while (true) {
                                var32--;
                                if (var32 < 0) {
                                    return;
                                }
                                class86.method486(var31 >> 16, var34, 0, this.field175, var29 >> 16, 0);
                                var29 += var10;
                                var31 += var8;
                                var34 += this.field182;
                            }
                        }
                        class86.method486(var30 >> 16, var34, 0, this.field175, var29 >> 16, 0);
                        var34 += this.field182;
                        var29 += var10;
                        var30 += var9;
                    }
                } else {
                    int var35 = arg6 - arg1;
                    int var36 = arg1 - arg2;
                    int var37 = this.field182 * arg2;
                    while (true) {
                        var36--;
                        if (var36 < 0) {
                            while (true) {
                                var35--;
                                if (var35 < 0) {
                                    return;
                                }
                                class86.method486(var29 >> 16, var37, 0, this.field175, var31 >> 16, 0);
                                var29 += var10;
                                var37 += this.field182;
                                var31 += var8;
                            }
                        }
                        class86.method486(var29 >> 16, var37, 0, this.field175, var30 >> 16, 0);
                        var30 += var9;
                        var37 += this.field182;
                        var29 += var10;
                    }
                }
            } else {
                int var38;
                int var39 = var38 = arg0 << 16;
                int var40 = arg3 << 16;
                if (arg2 < 0) {
                    var38 -= arg2 * var10;
                    var39 -= arg2 * var9;
                    arg2 = 0;
                }
                if (arg6 < 0) {
                    var40 -= arg6 * var8;
                    arg6 = 0;
                }
                if (var9 >= var10) {
                    int var41 = arg1 - arg6;
                    int var42 = arg6 - arg2;
                    int var43 = this.field182 * arg2;
                    while (true) {
                        var42--;
                        if (var42 < 0) {
                            while (true) {
                                var41--;
                                if (var41 < 0) {
                                    return;
                                }
                                class86.method486(var40 >> 16, var43, arg5 ^ 0x69D1, this.field175, var39 >> 16, 0);
                                var43 += this.field182;
                                var39 += var9;
                                var40 += var8;
                            }
                        }
                        class86.method486(var38 >> 16, var43, 0, this.field175, var39 >> 16, 0);
                        var38 += var10;
                        var39 += var9;
                        var43 += this.field182;
                    }
                } else {
                    int var44 = arg1 - arg6;
                    int var45 = arg6 - arg2;
                    int var46 = this.field182 * arg2;
                    while (true) {
                        var45--;
                        if (var45 < 0) {
                            while (true) {
                                var44--;
                                if (var44 < 0) {
                                    return;
                                }
                                class86.method486(var39 >> 16, var46, 0, this.field175, var40 >> 16, 0);
                                var39 += var9;
                                var40 += var8;
                                var46 += this.field182;
                            }
                        }
                        class86.method486(var39 >> 16, var46, 0, this.field175, var38 >> 16, 0);
                        var38 += var10;
                        var46 += this.field182;
                        var39 += var9;
                    }
                }
            }
        } else if (arg6 <= arg2) {
            int var47;
            int var48 = var47 = arg4 << 16;
            int var49 = arg3 << 16;
            if (arg1 < 0) {
                var48 -= arg1 * var8;
                var47 -= arg1 * var9;
                arg1 = 0;
            }
            if (arg6 < 0) {
                var49 -= arg6 * var10;
                arg6 = 0;
            }
            if (var8 >= var9) {
                int var50 = arg2 - arg6;
                int var51 = arg6 - arg1;
                int var52 = this.field182 * arg1;
                while (true) {
                    var51--;
                    if (var51 < 0) {
                        while (true) {
                            var50--;
                            if (var50 < 0) {
                                return;
                            }
                            class86.method486(var47 >> 16, var52, 0, this.field175, var49 >> 16, 0);
                            var49 += var10;
                            var52 += this.field182;
                            var47 += var9;
                        }
                    }
                    class86.method486(var47 >> 16, var52, 0, this.field175, var48 >> 16, 0);
                    var48 += var8;
                    var52 += this.field182;
                    var47 += var9;
                }
            } else {
                int var53 = arg2 - arg6;
                int var54 = arg6 - arg1;
                int var55 = this.field182 * arg1;
                while (true) {
                    var54--;
                    if (var54 < 0) {
                        while (true) {
                            var53--;
                            if (var53 < 0) {
                                return;
                            }
                            class86.method486(var49 >> 16, var55, 0, this.field175, var47 >> 16, 0);
                            var55 += this.field182;
                            var49 += var10;
                            var47 += var9;
                        }
                    }
                    class86.method486(var48 >> 16, var55, 0, this.field175, var47 >> 16, 0);
                    var48 += var8;
                    var55 += this.field182;
                    var47 += var9;
                }
            }
        } else {
            int var56;
            int var57 = var56 = arg4 << 16;
            int var58 = arg0 << 16;
            if (arg1 < 0) {
                var56 -= arg1 * var9;
                var57 -= arg1 * var8;
                arg1 = 0;
            }
            if (arg2 < 0) {
                var58 -= arg2 * var10;
                arg2 = 0;
            }
            if (arg1 != arg2 && var9 > var8 || arg1 == arg2 && var10 < var8) {
                int var59 = arg6 - arg2;
                int var60 = arg2 - arg1;
                int var61 = this.field182 * arg1;
                while (true) {
                    var60--;
                    if (var60 < 0) {
                        while (true) {
                            var59--;
                            if (var59 < 0) {
                                return;
                            }
                            class86.method486(var57 >> 16, var61, arg5 ^ 0x69D1, this.field175, var58 >> 16, 0);
                            var61 += this.field182;
                            var58 += var10;
                            var57 += var8;
                        }
                    }
                    class86.method486(var57 >> 16, var61, arg5 ^ 0x69D1, this.field175, var56 >> 16, 0);
                    var61 += this.field182;
                    var56 += var9;
                    var57 += var8;
                }
            } else {
                int var62 = arg6 - arg2;
                int var63 = arg2 - arg1;
                int var64 = this.field182 * arg1;
                while (true) {
                    var63--;
                    if (var63 < 0) {
                        while (true) {
                            var62--;
                            if (var62 < 0) {
                                return;
                            }
                            class86.method486(var58 >> 16, var64, 0, this.field175, var57 >> 16, 0);
                            var57 += var8;
                            var58 += var10;
                            var64 += this.field182;
                        }
                    }
                    class86.method486(var56 >> 16, var64, 0, this.field175, var57 >> 16, 0);
                    var56 += var9;
                    var57 += var8;
                    var64 += this.field182;
                }
            }
        }
    }

    @OriginalMember(owner = "client!mda", name = "b", descriptor = "(II)V")
    public static final void method81(int arg0, int arg1) {
        field181++;
        class318.field4398.method320(arg0, -306674912);
        if (arg1 != 0) {
            method81(73, 116);
        }
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(BII)Z")
    public final boolean method82(byte arg0, int arg1, int arg2) {
        field176++;
        if (arg0 != -24) {
            field183 = -0.24558988F;
        }
        return (arg1 * arg2) <= this.field175.length;
    }

    @OriginalMember(owner = "client!mda", name = "<init>", descriptor = "(Luq;II)V")
    public class17(class313 arg0, int arg1, int arg2) {
        this.field175 = new byte[arg1 * arg2];
    }

    static {
        class251[] var0 = class199.method1271((byte) 79);
        for (int var1 = 0; var1 < var0.length; var1++) {
            field198[var0[var1].field3141] = var0[var1];
        }
    }
}
