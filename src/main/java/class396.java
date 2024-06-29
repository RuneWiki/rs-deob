import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mt")
public class class396 extends class182 {

    @OriginalMember(owner = "client!mt", name = "K", descriptor = "[B")
    public byte[] field5431;

    @OriginalMember(owner = "client!mt", name = "E", descriptor = "Z")
    public static boolean field5425 = true;

    @OriginalMember(owner = "client!mt", name = "J", descriptor = "Z")
    public static boolean field5430 = false;

    @OriginalMember(owner = "client!mt", name = "D", descriptor = "I")
    public static int field5424 = 0;

    @OriginalMember(owner = "client!mt", name = "z", descriptor = "I")
    public static int field5421;

    @OriginalMember(owner = "client!mt", name = "A", descriptor = "I")
    public static int field5422;

    @OriginalMember(owner = "client!mt", name = "C", descriptor = "I")
    public int field5423;

    @OriginalMember(owner = "client!mt", name = "F", descriptor = "I")
    public int field5426;

    @OriginalMember(owner = "client!mt", name = "G", descriptor = "I")
    public static int field5427;

    @OriginalMember(owner = "client!mt", name = "H", descriptor = "I")
    public int field5428;

    @OriginalMember(owner = "client!mt", name = "L", descriptor = "I")
    public static int field5432;

    @OriginalMember(owner = "client!mt", name = "M", descriptor = "I")
    public int field5433;

    @OriginalMember(owner = "client!mt", name = "N", descriptor = "I")
    public static int field5434;

    @OriginalMember(owner = "client!mt", name = "I", descriptor = "Loh;")
    public static class404 field5429;

    @OriginalMember(owner = "client!mt", name = "b", descriptor = "(Z)V", line = 4)
    public static void method2425(boolean arg0) {
        field5429 = null;
        if (arg0) {
            method2426(-97, 66, -96, -108, true, 88, false);
        }
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(IIIIZIZ)V", line = 16)
    public static final void method2426(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, boolean arg6) {
        if (arg0 < 67) {
            return;
        }
        if (arg1 < arg5) {
            int var7 = (arg1 + arg5) / 2;
            int var8 = arg1;
            class526 var9 = class476.field6778[var7];
            class476.field6778[var7] = class476.field6778[arg5];
            class476.field6778[arg5] = var9;
            for (int var10 = arg1; var10 < arg5; var10++) {
                if (class542.method3187(class476.field6778[var10], arg6, 21343, arg2, arg4, var9, arg3) <= 0) {
                    class526 var11 = class476.field6778[var10];
                    class476.field6778[var10] = class476.field6778[var8];
                    class476.field6778[var8++] = var11;
                }
            }
            class476.field6778[arg5] = class476.field6778[var8];
            class476.field6778[var8] = var9;
            method2426(110, arg1, arg2, arg3, arg4, var8 - 1, arg6);
            method2426(78, var8 + 1, arg2, arg3, arg4, arg5, arg6);
        }
        field5421++;
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(III)Z", line = 66)
    public final boolean method2427(int arg0, int arg1, int arg2) {
        field5427++;
        if (arg2 != 20584) {
            this.method2430(true);
        }
        return arg0 * arg1 <= this.field5431.length;
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(IBIII)V", line = 77)
    public final void method2428(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        this.field5428 = arg3 - arg2;
        this.field5423 = arg4;
        this.field5433 = arg0 - arg4;
        if (arg1 != -20) {
            this.method2427(67, -14, 76);
        }
        this.field5426 = arg2;
        field5434++;
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(IIIIIII)V", line = 111)
    public final void method2429(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field5422++;
        int var8 = 0;
        if (arg3 != arg6) {
            var8 = (arg4 - arg5 << 16) / (arg6 - arg3);
        }
        int var9 = arg1;
        if (arg2 != arg6) {
            var9 = (arg0 - arg4 << 16) / (arg2 - arg6);
        }
        int var10 = 0;
        if (arg2 != arg3) {
            var10 = (arg5 - arg0 << 16) / (arg3 - arg2);
        }
        if (arg6 >= arg3 && arg2 >= arg3) {
            if (arg2 <= arg6) {
                int var11;
                int var12 = var11 = arg5 << 16;
                int var13 = arg0 << 16;
                if (arg3 < 0) {
                    var11 -= arg3 * var8;
                    var12 -= arg3 * var10;
                    arg3 = 0;
                }
                if (arg2 < 0) {
                    var13 -= arg2 * var9;
                    arg2 = 0;
                }
                if ((arg2 == arg3 || var8 <= var10) && (arg2 != arg3 || var8 >= var9)) {
                    int var17 = arg6 - arg2;
                    int var18 = arg2 - arg3;
                    int var19 = this.field5433 * arg3;
                    while (true) {
                        var18--;
                        if (var18 < 0) {
                            while (true) {
                                var17--;
                                if (var17 < 0) {
                                    return;
                                }
                                class292.method1739(0, var19, this.field5431, var11 >> 16, var13 >> 16, (byte) 91);
                                var13 += var9;
                                var19 += this.field5433;
                                var11 += var8;
                            }
                        }
                        class292.method1739(0, var19, this.field5431, var11 >> 16, var12 >> 16, (byte) 91);
                        var19 += this.field5433;
                        var11 += var8;
                        var12 += var10;
                    }
                } else {
                    int var14 = arg6 - arg2;
                    int var15 = arg2 - arg3;
                    int var16 = this.field5433 * arg3;
                    while (true) {
                        var15--;
                        if (var15 < 0) {
                            while (true) {
                                var14--;
                                if (var14 < 0) {
                                    return;
                                }
                                class292.method1739(0, var16, this.field5431, var13 >> 16, var11 >> 16, (byte) 91);
                                var13 += var9;
                                var11 += var8;
                                var16 += this.field5433;
                            }
                        }
                        class292.method1739(0, var16, this.field5431, var12 >> 16, var11 >> 16, (byte) 91);
                        var12 += var10;
                        var11 += var8;
                        var16 += this.field5433;
                    }
                }
            } else {
                int var20;
                int var21 = var20 = arg5 << 16;
                if (arg3 < 0) {
                    var20 -= arg3 * var8;
                    var21 -= arg3 * var10;
                    arg3 = 0;
                }
                int var22 = arg4 << 16;
                if (arg6 < 0) {
                    var22 -= arg6 * var9;
                    arg6 = 0;
                }
                if (arg3 != arg6 && var10 < var8 || arg3 == arg6 && var9 < var10) {
                    int var23 = arg2 - arg6;
                    int var24 = arg6 - arg3;
                    int var25 = this.field5433 * arg3;
                    while (true) {
                        var24--;
                        if (var24 < 0) {
                            while (true) {
                                var23--;
                                if (var23 < 0) {
                                    return;
                                }
                                class292.method1739(0, var25, this.field5431, var21 >> 16, var22 >> 16, (byte) 91);
                                var22 += var9;
                                var25 += this.field5433;
                                var21 += var10;
                            }
                        }
                        class292.method1739(0, var25, this.field5431, var21 >> 16, var20 >> 16, (byte) 91);
                        var21 += var10;
                        var25 += this.field5433;
                        var20 += var8;
                    }
                } else {
                    int var26 = arg2 - arg6;
                    int var27 = arg6 - arg3;
                    int var28 = this.field5433 * arg3;
                    while (true) {
                        var27--;
                        if (var27 < 0) {
                            while (true) {
                                var26--;
                                if (var26 < 0) {
                                    return;
                                }
                                class292.method1739(0, var28, this.field5431, var22 >> 16, var21 >> 16, (byte) 91);
                                var22 += var9;
                                var28 += this.field5433;
                                var21 += var10;
                            }
                        }
                        class292.method1739(0, var28, this.field5431, var20 >> 16, var21 >> 16, (byte) 91);
                        var21 += var10;
                        var20 += var8;
                        var28 += this.field5433;
                    }
                }
            }
        } else if (arg2 >= arg6) {
            if (arg2 >= arg3) {
                int var29;
                int var30 = var29 = arg4 << 16;
                int var31 = arg5 << 16;
                if (arg6 < 0) {
                    var30 -= arg6 * var8;
                    var29 -= arg6 * var9;
                    arg6 = 0;
                }
                if (arg3 < 0) {
                    var31 -= arg3 * var10;
                    arg3 = 0;
                }
                if (var9 <= var8) {
                    int var32 = arg2 - arg3;
                    int var33 = arg3 - arg6;
                    int var34 = this.field5433 * arg6;
                    while (true) {
                        var33--;
                        if (var33 < 0) {
                            while (true) {
                                var32--;
                                if (var32 < 0) {
                                    return;
                                }
                                class292.method1739(0, var34, this.field5431, var29 >> 16, var31 >> 16, (byte) 91);
                                var29 += var9;
                                var34 += this.field5433;
                                var31 += var10;
                            }
                        }
                        class292.method1739(0, var34, this.field5431, var29 >> 16, var30 >> 16, (byte) 91);
                        var29 += var9;
                        var30 += var8;
                        var34 += this.field5433;
                    }
                } else {
                    int var35 = arg2 - arg3;
                    int var36 = arg3 - arg6;
                    int var37 = this.field5433 * arg6;
                    while (true) {
                        var36--;
                        if (var36 < 0) {
                            while (true) {
                                var35--;
                                if (var35 < 0) {
                                    return;
                                }
                                class292.method1739(0, var37, this.field5431, var31 >> 16, var29 >> 16, (byte) 91);
                                var29 += var9;
                                var31 += var10;
                                var37 += this.field5433;
                            }
                        }
                        class292.method1739(0, var37, this.field5431, var30 >> 16, var29 >> 16, (byte) 91);
                        var30 += var8;
                        var37 += this.field5433;
                        var29 += var9;
                    }
                }
            } else {
                int var38;
                int var39 = var38 = arg4 << 16;
                if (arg6 < 0) {
                    var38 -= arg6 * var9;
                    var39 -= arg6 * var8;
                    arg6 = 0;
                }
                int var40 = arg0 << 16;
                if (arg2 < 0) {
                    var40 -= arg2 * var10;
                    arg2 = 0;
                }
                if (arg2 != arg6 && var9 > var8 || arg2 == arg6 && var10 < var8) {
                    int var41 = arg3 - arg2;
                    int var42 = arg2 - arg6;
                    int var43 = this.field5433 * arg6;
                    while (true) {
                        var42--;
                        if (var42 < 0) {
                            while (true) {
                                var41--;
                                if (var41 < 0) {
                                    return;
                                }
                                class292.method1739(0, var43, this.field5431, var39 >> 16, var40 >> 16, (byte) 91);
                                var40 += var10;
                                var39 += var8;
                                var43 += this.field5433;
                            }
                        }
                        class292.method1739(0, var43, this.field5431, var39 >> 16, var38 >> 16, (byte) 91);
                        var38 += var9;
                        var43 += this.field5433;
                        var39 += var8;
                    }
                } else {
                    int var44 = arg3 - arg2;
                    int var45 = arg2 - arg6;
                    int var46 = this.field5433 * arg6;
                    while (true) {
                        var45--;
                        if (var45 < 0) {
                            while (true) {
                                var44--;
                                if (var44 < 0) {
                                    return;
                                }
                                class292.method1739(0, var46, this.field5431, var40 >> 16, var39 >> 16, (byte) 91);
                                var40 += var10;
                                var46 += this.field5433;
                                var39 += var8;
                            }
                        }
                        class292.method1739(0, var46, this.field5431, var38 >> 16, var39 >> 16, (byte) 91);
                        var39 += var8;
                        var38 += var9;
                        var46 += this.field5433;
                    }
                }
            }
        } else if (arg6 > arg3) {
            int var47;
            int var48 = var47 = arg0 << 16;
            if (arg2 < 0) {
                var47 -= arg2 * var10;
                var48 -= arg2 * var9;
                arg2 = 0;
            }
            int var49 = arg5 << 16;
            if (arg3 < 0) {
                var49 -= arg3 * var8;
                arg3 = 0;
            }
            if (var10 > var9) {
                int var50 = arg6 - arg3;
                int var51 = arg3 - arg2;
                int var52 = this.field5433 * arg2;
                while (true) {
                    var51--;
                    if (var51 < 0) {
                        while (true) {
                            var50--;
                            if (var50 < 0) {
                                return;
                            }
                            class292.method1739(0, var52, this.field5431, var48 >> 16, var49 >> 16, (byte) 91);
                            var52 += this.field5433;
                            var48 += var9;
                            var49 += var8;
                        }
                    }
                    class292.method1739(0, var52, this.field5431, var48 >> 16, var47 >> 16, (byte) 91);
                    var47 += var10;
                    var48 += var9;
                    var52 += this.field5433;
                }
            } else {
                int var53 = arg6 - arg3;
                int var54 = arg3 - arg2;
                int var55 = this.field5433 * arg2;
                while (true) {
                    var54--;
                    if (var54 < 0) {
                        while (true) {
                            var53--;
                            if (var53 < 0) {
                                return;
                            }
                            class292.method1739(0, var55, this.field5431, var49 >> 16, var48 >> 16, (byte) 91);
                            var48 += var9;
                            var55 += this.field5433;
                            var49 += var8;
                        }
                    }
                    class292.method1739(0, var55, this.field5431, var47 >> 16, var48 >> 16, (byte) 91);
                    var55 += this.field5433;
                    var48 += var9;
                    var47 += var10;
                }
            }
        } else {
            int var56;
            int var57 = var56 = arg0 << 16;
            int var58 = arg4 << 16;
            if (arg2 < 0) {
                var57 -= arg2 * var9;
                var56 -= arg2 * var10;
                arg2 = 0;
            }
            if (arg6 < 0) {
                var58 -= arg6 * var8;
                arg6 = 0;
            }
            if (var9 < var10) {
                int var59 = arg3 - arg6;
                int var60 = arg6 - arg2;
                int var61 = this.field5433 * arg2;
                while (true) {
                    var60--;
                    if (var60 < 0) {
                        while (true) {
                            var59--;
                            if (var59 < 0) {
                                return;
                            }
                            class292.method1739(0, var61, this.field5431, var58 >> 16, var56 >> 16, (byte) 91);
                            var61 += this.field5433;
                            var58 += var8;
                            var56 += var10;
                        }
                    }
                    class292.method1739(0, var61, this.field5431, var57 >> 16, var56 >> 16, (byte) 91);
                    var61 += this.field5433;
                    var56 += var10;
                    var57 += var9;
                }
            } else {
                int var62 = arg3 - arg6;
                int var63 = arg6 - arg2;
                int var64 = this.field5433 * arg2;
                while (true) {
                    var63--;
                    if (var63 < 0) {
                        while (true) {
                            var62--;
                            if (var62 < 0) {
                                return;
                            }
                            class292.method1739(0, var64, this.field5431, var56 >> 16, var58 >> 16, (byte) 91);
                            var64 += this.field5433;
                            var56 += var10;
                            var58 += var8;
                        }
                    }
                    class292.method1739(0, var64, this.field5431, var56 >> 16, var57 >> 16, (byte) 91);
                    var56 += var10;
                    var64 += this.field5433;
                    var57 += var9;
                }
            }
        }
    }

    @OriginalMember(owner = "client!mt", name = "c", descriptor = "(Z)V", line = 549)
    public final void method2430(boolean arg0) {
        field5432++;
        if (arg0) {
            this.field5423 = 28;
        }
        int var2 = -1;
        int var3 = this.field5431.length - 8;
        while (var3 > var2) {
            var2++;
            this.field5431[var2] = 0;
            var2++;
            this.field5431[var2] = 0;
            var2++;
            this.field5431[var2] = 0;
            var2++;
            this.field5431[var2] = 0;
            var2++;
            this.field5431[var2] = 0;
            var2++;
            this.field5431[var2] = 0;
            var2++;
            this.field5431[var2] = 0;
            var2++;
            this.field5431[var2] = 0;
        }
        while ((this.field5431.length - 1) > var2) {
            var2++;
            this.field5431[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!mt", name = "<init>", descriptor = "(Lnv;II)V", line = 578)
    public class396(class417 arg0, int arg1, int arg2) {
        this.field5431 = new byte[arg1 * arg2];
    }
}
