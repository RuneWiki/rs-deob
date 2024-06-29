import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uu")
public class class266 extends class279 {

    @OriginalMember(owner = "client!uu", name = "D", descriptor = "[B")
    public byte[] field3365;

    @OriginalMember(owner = "client!uu", name = "w", descriptor = "[Lc;")
    public static class175[] field3358 = new class175[50];

    @OriginalMember(owner = "client!uu", name = "H", descriptor = "I")
    public static int field3369 = 0;

    @OriginalMember(owner = "client!uu", name = "x", descriptor = "I")
    public static int field3359;

    @OriginalMember(owner = "client!uu", name = "y", descriptor = "I")
    public static int field3360;

    @OriginalMember(owner = "client!uu", name = "z", descriptor = "I")
    public static int field3361;

    @OriginalMember(owner = "client!uu", name = "A", descriptor = "I")
    public int field3362;

    @OriginalMember(owner = "client!uu", name = "B", descriptor = "I")
    public int field3363;

    @OriginalMember(owner = "client!uu", name = "E", descriptor = "I")
    public int field3366;

    @OriginalMember(owner = "client!uu", name = "F", descriptor = "I")
    public static int field3367;

    @OriginalMember(owner = "client!uu", name = "G", descriptor = "I")
    public static int field3368;

    @OriginalMember(owner = "client!uu", name = "I", descriptor = "I")
    public static int field3370;

    @OriginalMember(owner = "client!uu", name = "J", descriptor = "I")
    public int field3371;

    @OriginalMember(owner = "client!uu", name = "C", descriptor = "Lfea;")
    public static class131 field3364;

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(IIIIB)V")
    public final void method1580(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        this.field3371 = arg1;
        this.field3366 = arg3;
        field3367++;
        if (arg4 < 115) {
            field3361 = -52;
        }
        this.field3362 = arg2 - arg1;
        this.field3363 = arg0 - arg3;
    }

    @OriginalMember(owner = "client!uu", name = "c", descriptor = "(B)V")
    public final void method1581(byte arg0) {
        field3359++;
        int var2 = -66 / ((arg0 + 37) / 35);
        int var3 = -1;
        int var4 = this.field3365.length - 8;
        while (var3 < var4) {
            var3++;
            this.field3365[var3] = 0;
            var3++;
            this.field3365[var3] = 0;
            var3++;
            this.field3365[var3] = 0;
            var3++;
            this.field3365[var3] = 0;
            var3++;
            this.field3365[var3] = 0;
            var3++;
            this.field3365[var3] = 0;
            var3++;
            this.field3365[var3] = 0;
            var3++;
            this.field3365[var3] = 0;
        }
        while (this.field3365.length - 1 > var3) {
            var3++;
            this.field3365[var3] = 0;
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(IIIIIII)V")
    public final void method1582(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3360++;
        if (arg0 != 943665136) {
            return;
        }
        int var8 = 0;
        if (arg1 != arg5) {
            var8 = (arg3 - arg4 << 16) / (arg1 - arg5);
        }
        int var9 = 0;
        if (arg1 != arg6) {
            var9 = (arg2 - arg3 << 16) / (arg6 - arg1);
        }
        int var10 = 0;
        if (arg5 != arg6) {
            var10 = (arg4 - arg2 << 16) / (arg5 - arg6);
        }
        if (arg5 <= arg1 && arg5 <= arg6) {
            if (arg1 >= arg6) {
                int var11;
                int var12 = var11 = arg4 << 16;
                if (arg5 < 0) {
                    var11 -= arg5 * var8;
                    var12 -= arg5 * var10;
                    arg5 = 0;
                }
                int var13 = arg2 << 16;
                if (arg6 < 0) {
                    var13 -= arg6 * var9;
                    arg6 = 0;
                }
                if (arg5 != arg6 && var10 < var8 || arg5 == arg6 && var9 > var8) {
                    int var14 = arg1 - arg6;
                    int var15 = arg6 - arg5;
                    int var16 = this.field3362 * arg5;
                    while (true) {
                        var15--;
                        if (var15 < 0) {
                            while (true) {
                                var14--;
                                if (var14 < 0) {
                                    return;
                                }
                                class3.method10(this.field3365, var16, 0, 127, var13 >> 16, var11 >> 16);
                                var13 += var9;
                                var11 += var8;
                                var16 += this.field3362;
                            }
                        }
                        class3.method10(this.field3365, var16, 0, 112, var12 >> 16, var11 >> 16);
                        var12 += var10;
                        var11 += var8;
                        var16 += this.field3362;
                    }
                } else {
                    int var17 = arg1 - arg6;
                    int var18 = arg6 - arg5;
                    int var19 = this.field3362 * arg5;
                    while (true) {
                        var18--;
                        if (var18 < 0) {
                            while (true) {
                                var17--;
                                if (var17 < 0) {
                                    return;
                                }
                                class3.method10(this.field3365, var19, 0, arg0 - 943665251, var11 >> 16, var13 >> 16);
                                var11 += var8;
                                var13 += var9;
                                var19 += this.field3362;
                            }
                        }
                        class3.method10(this.field3365, var19, 0, arg0 - 943665231, var11 >> 16, var12 >> 16);
                        var11 += var8;
                        var12 += var10;
                        var19 += this.field3362;
                    }
                }
            } else {
                int var20;
                int var21 = var20 = arg4 << 16;
                if (arg5 < 0) {
                    var21 -= arg5 * var10;
                    var20 -= arg5 * var8;
                    arg5 = 0;
                }
                int var22 = arg3 << 16;
                if (arg1 < 0) {
                    var22 -= arg1 * var9;
                    arg1 = 0;
                }
                if (arg1 != arg5 && var10 < var8 || arg1 == arg5 && var10 > var9) {
                    int var23 = arg6 - arg1;
                    int var24 = arg1 - arg5;
                    int var25 = this.field3362 * arg5;
                    while (true) {
                        var24--;
                        if (var24 < 0) {
                            while (true) {
                                var23--;
                                if (var23 < 0) {
                                    return;
                                }
                                class3.method10(this.field3365, var25, 0, -49, var21 >> 16, var22 >> 16);
                                var21 += var10;
                                var22 += var9;
                                var25 += this.field3362;
                            }
                        }
                        class3.method10(this.field3365, var25, 0, -113, var21 >> 16, var20 >> 16);
                        var20 += var8;
                        var25 += this.field3362;
                        var21 += var10;
                    }
                } else {
                    int var26 = arg6 - arg1;
                    int var27 = arg1 - arg5;
                    int var28 = this.field3362 * arg5;
                    while (true) {
                        var27--;
                        if (var27 < 0) {
                            while (true) {
                                var26--;
                                if (var26 < 0) {
                                    return;
                                }
                                class3.method10(this.field3365, var28, 0, 117, var22 >> 16, var21 >> 16);
                                var28 += this.field3362;
                                var21 += var10;
                                var22 += var9;
                            }
                        }
                        class3.method10(this.field3365, var28, 0, -16, var20 >> 16, var21 >> 16);
                        var28 += this.field3362;
                        var21 += var10;
                        var20 += var8;
                    }
                }
            }
        } else if (arg1 <= arg6) {
            if (arg6 < arg5) {
                int var29;
                int var30 = var29 = arg3 << 16;
                if (arg1 < 0) {
                    var29 -= arg1 * var9;
                    var30 -= arg1 * var8;
                    arg1 = 0;
                }
                int var31 = arg2 << 16;
                if (arg6 < 0) {
                    var31 -= arg6 * var10;
                    arg6 = 0;
                }
                if ((arg1 == arg6 || var9 <= var8) && (arg1 != arg6 || var8 <= var10)) {
                    int var35 = arg5 - arg6;
                    int var36 = arg6 - arg1;
                    int var37 = this.field3362 * arg1;
                    while (true) {
                        var36--;
                        if (var36 < 0) {
                            while (true) {
                                var35--;
                                if (var35 < 0) {
                                    return;
                                }
                                class3.method10(this.field3365, var37, 0, 118, var31 >> 16, var30 >> 16);
                                var37 += this.field3362;
                                var30 += var8;
                                var31 += var10;
                            }
                        }
                        class3.method10(this.field3365, var37, 0, -119, var29 >> 16, var30 >> 16);
                        var30 += var8;
                        var29 += var9;
                        var37 += this.field3362;
                    }
                } else {
                    int var32 = arg5 - arg6;
                    int var33 = arg6 - arg1;
                    int var34 = this.field3362 * arg1;
                    while (true) {
                        var33--;
                        if (var33 < 0) {
                            while (true) {
                                var32--;
                                if (var32 < 0) {
                                    return;
                                }
                                class3.method10(this.field3365, var34, 0, 120, var30 >> 16, var31 >> 16);
                                var31 += var10;
                                var34 += this.field3362;
                                var30 += var8;
                            }
                        }
                        class3.method10(this.field3365, var34, 0, -40, var30 >> 16, var29 >> 16);
                        var34 += this.field3362;
                        var30 += var8;
                        var29 += var9;
                    }
                }
            } else {
                int var38;
                int var39 = var38 = arg3 << 16;
                if (arg1 < 0) {
                    var38 -= arg1 * var9;
                    var39 -= arg1 * var8;
                    arg1 = 0;
                }
                int var40 = arg4 << 16;
                if (arg5 < 0) {
                    var40 -= arg5 * var10;
                    arg5 = 0;
                }
                if (var8 >= var9) {
                    int var41 = arg6 - arg5;
                    int var42 = arg5 - arg1;
                    int var43 = this.field3362 * arg1;
                    while (true) {
                        var42--;
                        if (var42 < 0) {
                            while (true) {
                                var41--;
                                if (var41 < 0) {
                                    return;
                                }
                                class3.method10(this.field3365, var43, 0, -51, var38 >> 16, var40 >> 16);
                                var38 += var9;
                                var43 += this.field3362;
                                var40 += var10;
                            }
                        }
                        class3.method10(this.field3365, var43, 0, arg0 ^ 0x383F2F81, var38 >> 16, var39 >> 16);
                        var39 += var8;
                        var38 += var9;
                        var43 += this.field3362;
                    }
                } else {
                    int var44 = arg6 - arg5;
                    int var45 = arg5 - arg1;
                    int var46 = this.field3362 * arg1;
                    while (true) {
                        var45--;
                        if (var45 < 0) {
                            while (true) {
                                var44--;
                                if (var44 < 0) {
                                    return;
                                }
                                class3.method10(this.field3365, var46, 0, 119, var40 >> 16, var38 >> 16);
                                var40 += var10;
                                var38 += var9;
                                var46 += this.field3362;
                            }
                        }
                        class3.method10(this.field3365, var46, 0, 121, var39 >> 16, var38 >> 16);
                        var46 += this.field3362;
                        var39 += var8;
                        var38 += var9;
                    }
                }
            }
        } else if (arg1 <= arg5) {
            int var47;
            int var48 = var47 = arg2 << 16;
            int var49 = arg3 << 16;
            if (arg6 < 0) {
                var47 -= arg6 * var10;
                var48 -= arg6 * var9;
                arg6 = 0;
            }
            if (arg1 < 0) {
                var49 -= arg1 * var8;
                arg1 = 0;
            }
            if (var9 >= var10) {
                int var50 = arg5 - arg1;
                int var51 = arg1 - arg6;
                int var52 = this.field3362 * arg6;
                while (true) {
                    var51--;
                    if (var51 < 0) {
                        while (true) {
                            var50--;
                            if (var50 < 0) {
                                return;
                            }
                            class3.method10(this.field3365, var52, 0, arg0 ^ 0xC7C0D026, var47 >> 16, var49 >> 16);
                            var47 += var10;
                            var49 += var8;
                            var52 += this.field3362;
                        }
                    }
                    class3.method10(this.field3365, var52, 0, -35, var47 >> 16, var48 >> 16);
                    var48 += var9;
                    var52 += this.field3362;
                    var47 += var10;
                }
            } else {
                int var53 = arg5 - arg1;
                int var54 = arg1 - arg6;
                int var55 = this.field3362 * arg6;
                while (true) {
                    var54--;
                    if (var54 < 0) {
                        while (true) {
                            var53--;
                            if (var53 < 0) {
                                return;
                            }
                            class3.method10(this.field3365, var55, 0, -98, var49 >> 16, var47 >> 16);
                            var49 += var8;
                            var55 += this.field3362;
                            var47 += var10;
                        }
                    }
                    class3.method10(this.field3365, var55, 0, 117, var48 >> 16, var47 >> 16);
                    var48 += var9;
                    var47 += var10;
                    var55 += this.field3362;
                }
            }
        } else {
            int var56;
            int var57 = var56 = arg2 << 16;
            if (arg6 < 0) {
                var57 -= arg6 * var9;
                var56 -= arg6 * var10;
                arg6 = 0;
            }
            int var58 = arg4 << 16;
            if (arg5 < 0) {
                var58 -= arg5 * var8;
                arg5 = 0;
            }
            if (var9 >= var10) {
                int var59 = arg1 - arg5;
                int var60 = arg5 - arg6;
                int var61 = this.field3362 * arg6;
                while (true) {
                    var60--;
                    if (var60 < 0) {
                        while (true) {
                            var59--;
                            if (var59 < 0) {
                                return;
                            }
                            class3.method10(this.field3365, var61, 0, 119, var58 >> 16, var57 >> 16);
                            var58 += var8;
                            var61 += this.field3362;
                            var57 += var9;
                        }
                    }
                    class3.method10(this.field3365, var61, 0, -26, var56 >> 16, var57 >> 16);
                    var61 += this.field3362;
                    var57 += var9;
                    var56 += var10;
                }
            } else {
                int var62 = arg1 - arg5;
                int var63 = arg5 - arg6;
                int var64 = this.field3362 * arg6;
                while (true) {
                    var63--;
                    if (var63 < 0) {
                        while (true) {
                            var62--;
                            if (var62 < 0) {
                                return;
                            }
                            class3.method10(this.field3365, var64, 0, arg0 ^ 0x383F2F84, var57 >> 16, var58 >> 16);
                            var57 += var9;
                            var64 += this.field3362;
                            var58 += var8;
                        }
                    }
                    class3.method10(this.field3365, var64, 0, 109, var57 >> 16, var56 >> 16);
                    var64 += this.field3362;
                    var57 += var9;
                    var56 += var10;
                }
            }
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(III)Z")
    public final boolean method1583(int arg0, int arg1, int arg2) {
        field3368++;
        if (arg2 != 866628848) {
            method1585(80, (byte) -48);
        }
        return this.field3365.length >= arg0 * arg1;
    }

    @OriginalMember(owner = "client!uu", name = "d", descriptor = "(I)V")
    public static void method1584(int arg0) {
        field3364 = null;
        field3358 = null;
        int var1 = -1 / ((-arg0 - 41) / 60);
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(IB)V")
    public static final void method1585(int arg0, byte arg1) {
        if (arg1 <= 53) {
            method1585(68, (byte) 121);
        }
        field3370++;
        class243 var2 = class546.method2926(arg0, 4, true);
        var2.method1455(true);
    }

    @OriginalMember(owner = "client!uu", name = "<init>", descriptor = "(Ljaa;II)V")
    public class266(class576 arg0, int arg1, int arg2) {
        this.field3365 = new byte[arg1 * arg2];
    }
}
