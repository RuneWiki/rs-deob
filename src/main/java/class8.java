import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kw")
public class class8 extends class108 {

    @OriginalMember(owner = "client!kw", name = "D", descriptor = "[B")
    public byte[] field81;

    @OriginalMember(owner = "client!kw", name = "J", descriptor = "Lfq;")
    public static class141 field87 = new class141(8, 0, 4, 1);

    @OriginalMember(owner = "client!kw", name = "K", descriptor = "Lqia;")
    public static class547 field88 = new class547();

    @OriginalMember(owner = "client!kw", name = "M", descriptor = "I")
    public static int field90 = 0;

    @OriginalMember(owner = "client!kw", name = "A", descriptor = "I")
    public int field78;

    @OriginalMember(owner = "client!kw", name = "B", descriptor = "I")
    public int field79;

    @OriginalMember(owner = "client!kw", name = "C", descriptor = "I")
    public static int field80;

    @OriginalMember(owner = "client!kw", name = "E", descriptor = "I")
    public static int field82;

    @OriginalMember(owner = "client!kw", name = "F", descriptor = "I")
    public static int field83;

    @OriginalMember(owner = "client!kw", name = "G", descriptor = "I")
    public int field84;

    @OriginalMember(owner = "client!kw", name = "H", descriptor = "I")
    public static int field85;

    @OriginalMember(owner = "client!kw", name = "I", descriptor = "I")
    public int field86;

    @OriginalMember(owner = "client!kw", name = "L", descriptor = "I")
    public static int field89;

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(IBI)Z", line = 5)
    public final boolean method34(int arg0, byte arg1, int arg2) {
        int var4 = 109 / ((arg1 + 43) / 41);
        field85++;
        return arg0 * arg2 <= this.field81.length;
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(IIIII)V", line = 24)
    public final void method35(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field79 = arg2;
        this.field78 = arg3;
        if (arg0 != 0) {
            method36(-22);
        }
        this.field84 = arg1 - arg2;
        field83++;
        this.field86 = arg4 - arg3;
    }

    @OriginalMember(owner = "client!kw", name = "b", descriptor = "(I)V", line = 46)
    public static void method36(int arg0) {
        field88 = null;
        field87 = null;
        if (arg0 != 186874064) {
            field89 = 89;
        }
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(IIIIIII)V", line = 57)
    public final void method37(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field82++;
        int var8 = 0;
        if (arg0 != arg1) {
            var8 = (arg2 - arg3 << 16) / (arg0 - arg1);
        }
        if (arg4 > -25) {
            this.field84 = -76;
        }
        int var9 = 0;
        if (arg0 != arg6) {
            var9 = (arg5 - arg2 << 16) / (arg6 - arg0);
        }
        int var10 = 0;
        if (arg1 != arg6) {
            var10 = (arg3 - arg5 << 16) / (arg1 - arg6);
        }
        if (arg1 <= arg0 && arg1 <= arg6) {
            if (arg6 <= arg0) {
                int var11;
                int var12 = var11 = arg3 << 16;
                int var13 = arg5 << 16;
                if (arg1 < 0) {
                    var12 -= arg1 * var10;
                    var11 -= arg1 * var8;
                    arg1 = 0;
                }
                if (arg6 < 0) {
                    var13 -= arg6 * var9;
                    arg6 = 0;
                }
                if (arg1 != arg6 && var10 < var8 || arg1 == arg6 && var8 < var9) {
                    int var14 = arg0 - arg6;
                    int var15 = arg6 - arg1;
                    int var16 = this.field86 * arg1;
                    while (true) {
                        var15--;
                        if (var15 < 0) {
                            while (true) {
                                var14--;
                                if (var14 < 0) {
                                    return;
                                }
                                class300.method1773(this.field81, var11 >> 16, var13 >> 16, (byte) 1, 0, var16);
                                var13 += var9;
                                var16 += this.field86;
                                var11 += var8;
                            }
                        }
                        class300.method1773(this.field81, var11 >> 16, var12 >> 16, (byte) 1, 0, var16);
                        var16 += this.field86;
                        var11 += var8;
                        var12 += var10;
                    }
                } else {
                    int var17 = arg0 - arg6;
                    int var18 = arg6 - arg1;
                    int var19 = this.field86 * arg1;
                    while (true) {
                        var18--;
                        if (var18 < 0) {
                            while (true) {
                                var17--;
                                if (var17 < 0) {
                                    return;
                                }
                                class300.method1773(this.field81, var13 >> 16, var11 >> 16, (byte) 1, 0, var19);
                                var19 += this.field86;
                                var13 += var9;
                                var11 += var8;
                            }
                        }
                        class300.method1773(this.field81, var12 >> 16, var11 >> 16, (byte) 1, 0, var19);
                        var12 += var10;
                        var11 += var8;
                        var19 += this.field86;
                    }
                }
            } else {
                int var20;
                int var21 = var20 = arg3 << 16;
                int var22 = arg2 << 16;
                if (arg1 < 0) {
                    var21 -= arg1 * var10;
                    var20 -= arg1 * var8;
                    arg1 = 0;
                }
                if (arg0 < 0) {
                    var22 -= arg0 * var9;
                    arg0 = 0;
                }
                if (arg0 != arg1 && var10 < var8 || arg0 == arg1 && var10 > var9) {
                    int var23 = arg6 - arg0;
                    int var24 = arg0 - arg1;
                    int var25 = this.field86 * arg1;
                    while (true) {
                        var24--;
                        if (var24 < 0) {
                            while (true) {
                                var23--;
                                if (var23 < 0) {
                                    return;
                                }
                                class300.method1773(this.field81, var22 >> 16, var21 >> 16, (byte) 1, 0, var25);
                                var21 += var10;
                                var25 += this.field86;
                                var22 += var9;
                            }
                        }
                        class300.method1773(this.field81, var20 >> 16, var21 >> 16, (byte) 1, 0, var25);
                        var21 += var10;
                        var25 += this.field86;
                        var20 += var8;
                    }
                } else {
                    int var26 = arg6 - arg0;
                    int var27 = arg0 - arg1;
                    int var28 = this.field86 * arg1;
                    while (true) {
                        var27--;
                        if (var27 < 0) {
                            while (true) {
                                var26--;
                                if (var26 < 0) {
                                    return;
                                }
                                class300.method1773(this.field81, var21 >> 16, var22 >> 16, (byte) 1, 0, var28);
                                var21 += var10;
                                var28 += this.field86;
                                var22 += var9;
                            }
                        }
                        class300.method1773(this.field81, var21 >> 16, var20 >> 16, (byte) 1, 0, var28);
                        var20 += var8;
                        var28 += this.field86;
                        var21 += var10;
                    }
                }
            }
        } else if (arg0 <= arg6) {
            if (arg1 <= arg6) {
                int var29;
                int var30 = var29 = arg2 << 16;
                if (arg0 < 0) {
                    var29 -= arg0 * var9;
                    var30 -= arg0 * var8;
                    arg0 = 0;
                }
                int var31 = arg3 << 16;
                if (arg1 < 0) {
                    var31 -= arg1 * var10;
                    arg1 = 0;
                }
                if (var9 > var8) {
                    int var32 = arg6 - arg1;
                    int var33 = arg1 - arg0;
                    int var34 = this.field86 * arg0;
                    while (true) {
                        var33--;
                        if (var33 < 0) {
                            while (true) {
                                var32--;
                                if (var32 < 0) {
                                    return;
                                }
                                class300.method1773(this.field81, var29 >> 16, var31 >> 16, (byte) 1, 0, var34);
                                var34 += this.field86;
                                var31 += var10;
                                var29 += var9;
                            }
                        }
                        class300.method1773(this.field81, var29 >> 16, var30 >> 16, (byte) 1, 0, var34);
                        var29 += var9;
                        var30 += var8;
                        var34 += this.field86;
                    }
                } else {
                    int var35 = arg6 - arg1;
                    int var36 = arg1 - arg0;
                    int var37 = this.field86 * arg0;
                    while (true) {
                        var36--;
                        if (var36 < 0) {
                            while (true) {
                                var35--;
                                if (var35 < 0) {
                                    return;
                                }
                                class300.method1773(this.field81, var31 >> 16, var29 >> 16, (byte) 1, 0, var37);
                                var29 += var9;
                                var37 += this.field86;
                                var31 += var10;
                            }
                        }
                        class300.method1773(this.field81, var30 >> 16, var29 >> 16, (byte) 1, 0, var37);
                        var29 += var9;
                        var30 += var8;
                        var37 += this.field86;
                    }
                }
            } else {
                int var38;
                int var39 = var38 = arg2 << 16;
                if (arg0 < 0) {
                    var39 -= arg0 * var8;
                    var38 -= arg0 * var9;
                    arg0 = 0;
                }
                int var40 = arg5 << 16;
                if (arg6 < 0) {
                    var40 -= arg6 * var10;
                    arg6 = 0;
                }
                if (arg0 != arg6 && var9 > var8 || arg0 == arg6 && var10 < var8) {
                    int var41 = arg1 - arg6;
                    int var42 = arg6 - arg0;
                    int var43 = this.field86 * arg0;
                    while (true) {
                        var42--;
                        if (var42 < 0) {
                            while (true) {
                                var41--;
                                if (var41 < 0) {
                                    return;
                                }
                                class300.method1773(this.field81, var40 >> 16, var39 >> 16, (byte) 1, 0, var43);
                                var43 += this.field86;
                                var40 += var10;
                                var39 += var8;
                            }
                        }
                        class300.method1773(this.field81, var38 >> 16, var39 >> 16, (byte) 1, 0, var43);
                        var38 += var9;
                        var39 += var8;
                        var43 += this.field86;
                    }
                } else {
                    int var44 = arg1 - arg6;
                    int var45 = arg6 - arg0;
                    int var46 = this.field86 * arg0;
                    while (true) {
                        var45--;
                        if (var45 < 0) {
                            while (true) {
                                var44--;
                                if (var44 < 0) {
                                    return;
                                }
                                class300.method1773(this.field81, var39 >> 16, var40 >> 16, (byte) 1, 0, var46);
                                var39 += var8;
                                var46 += this.field86;
                                var40 += var10;
                            }
                        }
                        class300.method1773(this.field81, var39 >> 16, var38 >> 16, (byte) 1, 0, var46);
                        var38 += var9;
                        var46 += this.field86;
                        var39 += var8;
                    }
                }
            }
        } else if (arg0 > arg1) {
            int var47;
            int var48 = var47 = arg5 << 16;
            if (arg6 < 0) {
                var47 -= arg6 * var10;
                var48 -= arg6 * var9;
                arg6 = 0;
            }
            int var49 = arg3 << 16;
            if (arg1 < 0) {
                var49 -= arg1 * var8;
                arg1 = 0;
            }
            if (var10 <= var9) {
                int var50 = arg0 - arg1;
                int var51 = arg1 - arg6;
                int var52 = this.field86 * arg6;
                while (true) {
                    var51--;
                    if (var51 < 0) {
                        while (true) {
                            var50--;
                            if (var50 < 0) {
                                return;
                            }
                            class300.method1773(this.field81, var48 >> 16, var49 >> 16, (byte) 1, 0, var52);
                            var52 += this.field86;
                            var48 += var9;
                            var49 += var8;
                        }
                    }
                    class300.method1773(this.field81, var48 >> 16, var47 >> 16, (byte) 1, 0, var52);
                    var47 += var10;
                    var48 += var9;
                    var52 += this.field86;
                }
            } else {
                int var53 = arg0 - arg1;
                int var54 = arg1 - arg6;
                int var55 = this.field86 * arg6;
                while (true) {
                    var54--;
                    if (var54 < 0) {
                        while (true) {
                            var53--;
                            if (var53 < 0) {
                                return;
                            }
                            class300.method1773(this.field81, var49 >> 16, var48 >> 16, (byte) 1, 0, var55);
                            var55 += this.field86;
                            var48 += var9;
                            var49 += var8;
                        }
                    }
                    class300.method1773(this.field81, var47 >> 16, var48 >> 16, (byte) 1, 0, var55);
                    var48 += var9;
                    var47 += var10;
                    var55 += this.field86;
                }
            }
        } else {
            int var56;
            int var57 = var56 = arg5 << 16;
            if (arg6 < 0) {
                var57 -= arg6 * var9;
                var56 -= arg6 * var10;
                arg6 = 0;
            }
            int var58 = arg2 << 16;
            if (arg0 < 0) {
                var58 -= arg0 * var8;
                arg0 = 0;
            }
            if (var10 <= var9) {
                int var59 = arg1 - arg0;
                int var60 = arg0 - arg6;
                int var61 = this.field86 * arg6;
                while (true) {
                    var60--;
                    if (var60 < 0) {
                        while (true) {
                            var59--;
                            if (var59 < 0) {
                                return;
                            }
                            class300.method1773(this.field81, var58 >> 16, var56 >> 16, (byte) 1, 0, var61);
                            var58 += var8;
                            var56 += var10;
                            var61 += this.field86;
                        }
                    }
                    class300.method1773(this.field81, var57 >> 16, var56 >> 16, (byte) 1, 0, var61);
                    var57 += var9;
                    var56 += var10;
                    var61 += this.field86;
                }
            } else {
                int var62 = arg1 - arg0;
                int var63 = arg0 - arg6;
                int var64 = this.field86 * arg6;
                while (true) {
                    var63--;
                    if (var63 < 0) {
                        while (true) {
                            var62--;
                            if (var62 < 0) {
                                return;
                            }
                            class300.method1773(this.field81, var56 >> 16, var58 >> 16, (byte) 1, 0, var64);
                            var56 += var10;
                            var58 += var8;
                            var64 += this.field86;
                        }
                    }
                    class300.method1773(this.field81, var56 >> 16, var57 >> 16, (byte) 1, 0, var64);
                    var64 += this.field86;
                    var57 += var9;
                    var56 += var10;
                }
            }
        }
    }

    @OriginalMember(owner = "client!kw", name = "f", descriptor = "(B)V", line = 496)
    public final void method38(byte arg0) {
        field80++;
        int var2 = -1;
        int var3 = this.field81.length - 8;
        while (var3 > var2) {
            var2++;
            this.field81[var2] = 0;
            var2++;
            this.field81[var2] = 0;
            var2++;
            this.field81[var2] = 0;
            var2++;
            this.field81[var2] = 0;
            var2++;
            this.field81[var2] = 0;
            var2++;
            this.field81[var2] = 0;
            var2++;
            this.field81[var2] = 0;
            var2++;
            this.field81[var2] = 0;
        }
        if (arg0 != 52) {
            this.field81 = null;
        }
        while (var2 < (this.field81.length - 1)) {
            var2++;
            this.field81[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!kw", name = "<init>", descriptor = "(Leq;II)V", line = 525)
    public class8(class357 arg0, int arg1, int arg2) {
        this.field81 = new byte[arg1 * arg2];
    }
}
