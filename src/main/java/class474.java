import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oaa")
public class class474 extends class736 {

    @OriginalMember(owner = "client!oaa", name = "w", descriptor = "[B")
    public byte[] field6163;

    @OriginalMember(owner = "client!oaa", name = "v", descriptor = "Lwu;")
    public static class582 field6162 = new class582("", 15);

    @OriginalMember(owner = "client!oaa", name = "t", descriptor = "I")
    public static int field6160;

    @OriginalMember(owner = "client!oaa", name = "u", descriptor = "I")
    public static int field6161;

    @OriginalMember(owner = "client!oaa", name = "x", descriptor = "I")
    public int field6164;

    @OriginalMember(owner = "client!oaa", name = "y", descriptor = "I")
    public int field6165;

    @OriginalMember(owner = "client!oaa", name = "z", descriptor = "I")
    public static int field6166;

    @OriginalMember(owner = "client!oaa", name = "A", descriptor = "I")
    public static int field6167;

    @OriginalMember(owner = "client!oaa", name = "B", descriptor = "I")
    public static int field6168;

    @OriginalMember(owner = "client!oaa", name = "C", descriptor = "I")
    public static int field6169;

    @OriginalMember(owner = "client!oaa", name = "D", descriptor = "I")
    public int field6170;

    @OriginalMember(owner = "client!oaa", name = "E", descriptor = "I")
    public int field6171;

    @OriginalMember(owner = "client!oaa", name = "F", descriptor = "I")
    public static int field6172;

    @OriginalMember(owner = "client!oaa", name = "G", descriptor = "J")
    public static long field6173;

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(B)V", line = 3)
    public final void method2670(byte arg0) {
        int var2 = -27 % ((-arg0 - 49) / 37);
        field6169++;
        int var3 = -1;
        int var4 = this.field6163.length - 8;
        while (var4 > var3) {
            var3++;
            this.field6163[var3] = 0;
            var3++;
            this.field6163[var3] = 0;
            var3++;
            this.field6163[var3] = 0;
            var3++;
            this.field6163[var3] = 0;
            var3++;
            this.field6163[var3] = 0;
            var3++;
            this.field6163[var3] = 0;
            var3++;
            this.field6163[var3] = 0;
            var3++;
            this.field6163[var3] = 0;
        }
        while ((this.field6163.length - 1) > var3) {
            var3++;
            this.field6163[var3] = 0;
        }
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(IIIII)V", line = 31)
    public final void method2671(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field6171 = arg0;
        field6160++;
        this.field6170 = arg4 - arg0;
        this.field6164 = arg1;
        if (arg3 < 23) {
            this.method2674(93, false, 25);
        }
        this.field6165 = arg2 - arg1;
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(I)I", line = 50)
    public static final int method2672(int arg0) {
        if (arg0 <= 19) {
            field6172 = 0;
        }
        field6167++;
        return class596.field7567 == 1 ? class669.field8694 : class134.field1779;
    }

    @OriginalMember(owner = "client!oaa", name = "e", descriptor = "(B)V", line = 71)
    public static void method2673(byte arg0) {
        if (arg0 != -11) {
            field6172 = 111;
        }
        field6162 = null;
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(IZI)Z", line = 82)
    public final boolean method2674(int arg0, boolean arg1, int arg2) {
        field6168++;
        if (arg1) {
            return true;
        } else {
            return (arg0 * arg2) <= this.field6163.length;
        }
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(IIIIIII)V", line = 94)
    public final void method2675(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field6166++;
        int var8 = 0;
        if (arg0 != arg4) {
            var8 = (arg6 - arg1 << 16) / (arg4 - arg0);
        }
        int var9 = 0;
        if (arg2 != arg4) {
            var9 = (arg5 - arg6 << 16) / (arg2 - arg4);
        }
        int var10 = 0;
        if (arg3 != -27312) {
            field6172 = -114;
        }
        if (arg0 != arg2) {
            var10 = (arg1 - arg5 << 16) / (arg0 - arg2);
        }
        if (arg4 >= arg0 && arg0 <= arg2) {
            if (arg4 < arg2) {
                int var11;
                int var12 = var11 = arg1 << 16;
                if (arg0 < 0) {
                    var12 -= arg0 * var10;
                    var11 -= arg0 * var8;
                    arg0 = 0;
                }
                int var13 = arg6 << 16;
                if (arg4 < 0) {
                    var13 -= arg4 * var9;
                    arg4 = 0;
                }
                if (arg0 != arg4 && var10 < var8 || arg0 == arg4 && var9 < var10) {
                    int var14 = arg2 - arg4;
                    int var15 = arg4 - arg0;
                    int var16 = this.field6170 * arg0;
                    while (true) {
                        var15--;
                        if (var15 < 0) {
                            while (true) {
                                var14--;
                                if (var14 < 0) {
                                    return;
                                }
                                class80.method505(102, var13 >> 16, var16, 0, this.field6163, var12 >> 16);
                                var12 += var10;
                                var13 += var9;
                                var16 += this.field6170;
                            }
                        }
                        class80.method505(-2, var11 >> 16, var16, 0, this.field6163, var12 >> 16);
                        var12 += var10;
                        var11 += var8;
                        var16 += this.field6170;
                    }
                } else {
                    int var17 = arg2 - arg4;
                    int var18 = arg4 - arg0;
                    int var19 = this.field6170 * arg0;
                    while (true) {
                        var18--;
                        if (var18 < 0) {
                            while (true) {
                                var17--;
                                if (var17 < 0) {
                                    return;
                                }
                                class80.method505(-3, var12 >> 16, var19, 0, this.field6163, var13 >> 16);
                                var12 += var10;
                                var19 += this.field6170;
                                var13 += var9;
                            }
                        }
                        class80.method505(-57, var12 >> 16, var19, 0, this.field6163, var11 >> 16);
                        var12 += var10;
                        var19 += this.field6170;
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
                int var22 = arg5 << 16;
                if (arg2 < 0) {
                    var22 -= arg2 * var9;
                    arg2 = 0;
                }
                if (arg0 != arg2 && var8 > var10 || arg0 == arg2 && var9 > var8) {
                    int var23 = arg4 - arg2;
                    int var24 = arg2 - arg0;
                    int var25 = this.field6170 * arg0;
                    while (true) {
                        var24--;
                        if (var24 < 0) {
                            while (true) {
                                var23--;
                                if (var23 < 0) {
                                    return;
                                }
                                class80.method505(-65, var20 >> 16, var25, 0, this.field6163, var22 >> 16);
                                var22 += var9;
                                var20 += var8;
                                var25 += this.field6170;
                            }
                        }
                        class80.method505(-69, var20 >> 16, var25, 0, this.field6163, var21 >> 16);
                        var25 += this.field6170;
                        var20 += var8;
                        var21 += var10;
                    }
                } else {
                    int var26 = arg4 - arg2;
                    int var27 = arg2 - arg0;
                    int var28 = this.field6170 * arg0;
                    while (true) {
                        var27--;
                        if (var27 < 0) {
                            while (true) {
                                var26--;
                                if (var26 < 0) {
                                    return;
                                }
                                class80.method505(13, var22 >> 16, var28, 0, this.field6163, var20 >> 16);
                                var28 += this.field6170;
                                var20 += var8;
                                var22 += var9;
                            }
                        }
                        class80.method505(arg3 ^ 0xFFFF9530, var21 >> 16, var28, 0, this.field6163, var20 >> 16);
                        var20 += var8;
                        var21 += var10;
                        var28 += this.field6170;
                    }
                }
            }
        } else if (arg2 >= arg4) {
            if (arg0 <= arg2) {
                int var29;
                int var30 = var29 = arg6 << 16;
                int var31 = arg1 << 16;
                if (arg4 < 0) {
                    var29 -= arg4 * var9;
                    var30 -= arg4 * var8;
                    arg4 = 0;
                }
                if (arg0 < 0) {
                    var31 -= arg0 * var10;
                    arg0 = 0;
                }
                if (var9 <= var8) {
                    int var32 = arg2 - arg0;
                    int var33 = arg0 - arg4;
                    int var34 = this.field6170 * arg4;
                    while (true) {
                        var33--;
                        if (var33 < 0) {
                            while (true) {
                                var32--;
                                if (var32 < 0) {
                                    return;
                                }
                                class80.method505(81, var31 >> 16, var34, 0, this.field6163, var29 >> 16);
                                var31 += var10;
                                var34 += this.field6170;
                                var29 += var9;
                            }
                        }
                        class80.method505(arg3 ^ 0x6A90, var30 >> 16, var34, 0, this.field6163, var29 >> 16);
                        var29 += var9;
                        var34 += this.field6170;
                        var30 += var8;
                    }
                } else {
                    int var35 = arg2 - arg0;
                    int var36 = arg0 - arg4;
                    int var37 = this.field6170 * arg4;
                    while (true) {
                        var36--;
                        if (var36 < 0) {
                            while (true) {
                                var35--;
                                if (var35 < 0) {
                                    return;
                                }
                                class80.method505(89, var29 >> 16, var37, 0, this.field6163, var31 >> 16);
                                var29 += var9;
                                var37 += this.field6170;
                                var31 += var10;
                            }
                        }
                        class80.method505(118, var29 >> 16, var37, 0, this.field6163, var30 >> 16);
                        var29 += var9;
                        var30 += var8;
                        var37 += this.field6170;
                    }
                }
            } else {
                int var38;
                int var39 = var38 = arg6 << 16;
                int var40 = arg5 << 16;
                if (arg4 < 0) {
                    var39 -= arg4 * var8;
                    var38 -= arg4 * var9;
                    arg4 = 0;
                }
                if (arg2 < 0) {
                    var40 -= arg2 * var10;
                    arg2 = 0;
                }
                if (arg2 != arg4 && var8 < var9 || arg2 == arg4 && var10 < var8) {
                    int var41 = arg0 - arg2;
                    int var42 = arg2 - arg4;
                    int var43 = this.field6170 * arg4;
                    while (true) {
                        var42--;
                        if (var42 < 0) {
                            while (true) {
                                var41--;
                                if (var41 < 0) {
                                    return;
                                }
                                class80.method505(arg3 ^ 0x6A9F, var40 >> 16, var43, 0, this.field6163, var39 >> 16);
                                var39 += var8;
                                var43 += this.field6170;
                                var40 += var10;
                            }
                        }
                        class80.method505(-71, var38 >> 16, var43, 0, this.field6163, var39 >> 16);
                        var39 += var8;
                        var38 += var9;
                        var43 += this.field6170;
                    }
                } else {
                    int var44 = arg0 - arg2;
                    int var45 = arg2 - arg4;
                    int var46 = this.field6170 * arg4;
                    while (true) {
                        var45--;
                        if (var45 < 0) {
                            while (true) {
                                var44--;
                                if (var44 < 0) {
                                    return;
                                }
                                class80.method505(-48, var39 >> 16, var46, 0, this.field6163, var40 >> 16);
                                var39 += var8;
                                var46 += this.field6170;
                                var40 += var10;
                            }
                        }
                        class80.method505(arg3 ^ 0x6AE2, var39 >> 16, var46, 0, this.field6163, var38 >> 16);
                        var38 += var9;
                        var39 += var8;
                        var46 += this.field6170;
                    }
                }
            }
        } else if (arg4 <= arg0) {
            int var47;
            int var48 = var47 = arg5 << 16;
            int var49 = arg6 << 16;
            if (arg2 < 0) {
                var47 -= arg2 * var10;
                var48 -= arg2 * var9;
                arg2 = 0;
            }
            if (arg4 < 0) {
                var49 -= arg4 * var8;
                arg4 = 0;
            }
            if (var9 >= var10) {
                int var50 = arg0 - arg4;
                int var51 = arg4 - arg2;
                int var52 = this.field6170 * arg2;
                while (true) {
                    var51--;
                    if (var51 < 0) {
                        while (true) {
                            var50--;
                            if (var50 < 0) {
                                return;
                            }
                            class80.method505(89, var49 >> 16, var52, 0, this.field6163, var47 >> 16);
                            var47 += var10;
                            var52 += this.field6170;
                            var49 += var8;
                        }
                    }
                    class80.method505(-58, var48 >> 16, var52, 0, this.field6163, var47 >> 16);
                    var52 += this.field6170;
                    var48 += var9;
                    var47 += var10;
                }
            } else {
                int var53 = arg0 - arg4;
                int var54 = arg4 - arg2;
                int var55 = this.field6170 * arg2;
                while (true) {
                    var54--;
                    if (var54 < 0) {
                        while (true) {
                            var53--;
                            if (var53 < 0) {
                                return;
                            }
                            class80.method505(arg3 + 27300, var47 >> 16, var55, 0, this.field6163, var49 >> 16);
                            var47 += var10;
                            var55 += this.field6170;
                            var49 += var8;
                        }
                    }
                    class80.method505(arg3 ^ 0xFFFF9502, var47 >> 16, var55, 0, this.field6163, var48 >> 16);
                    var47 += var10;
                    var55 += this.field6170;
                    var48 += var9;
                }
            }
        } else {
            int var56;
            int var57 = var56 = arg5 << 16;
            int var58 = arg1 << 16;
            if (arg2 < 0) {
                var56 -= arg2 * var10;
                var57 -= arg2 * var9;
                arg2 = 0;
            }
            if (arg0 < 0) {
                var58 -= arg0 * var8;
                arg0 = 0;
            }
            if (var10 > var9) {
                int var59 = arg4 - arg0;
                int var60 = arg0 - arg2;
                int var61 = this.field6170 * arg2;
                while (true) {
                    var60--;
                    if (var60 < 0) {
                        while (true) {
                            var59--;
                            if (var59 < 0) {
                                return;
                            }
                            class80.method505(11, var58 >> 16, var61, 0, this.field6163, var57 >> 16);
                            var58 += var8;
                            var57 += var9;
                            var61 += this.field6170;
                        }
                    }
                    class80.method505(92, var56 >> 16, var61, 0, this.field6163, var57 >> 16);
                    var61 += this.field6170;
                    var57 += var9;
                    var56 += var10;
                }
            } else {
                int var62 = arg4 - arg0;
                int var63 = arg0 - arg2;
                int var64 = this.field6170 * arg2;
                while (true) {
                    var63--;
                    if (var63 < 0) {
                        while (true) {
                            var62--;
                            if (var62 < 0) {
                                return;
                            }
                            class80.method505(-105, var57 >> 16, var64, 0, this.field6163, var58 >> 16);
                            var64 += this.field6170;
                            var57 += var9;
                            var58 += var8;
                        }
                    }
                    class80.method505(-75, var57 >> 16, var64, 0, this.field6163, var56 >> 16);
                    var57 += var9;
                    var64 += this.field6170;
                    var56 += var10;
                }
            }
        }
    }

    @OriginalMember(owner = "client!oaa", name = "<init>", descriptor = "(Lck;II)V", line = 542)
    public class474(class733 arg0, int arg1, int arg2) {
        this.field6163 = new byte[arg1 * arg2];
    }
}
