import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uu")
public class class495 extends class425 {

    @OriginalMember(owner = "client!uu", name = "D", descriptor = "[B")
    public byte[] field7012;

    @OriginalMember(owner = "client!uu", name = "C", descriptor = "S")
    public static short field7011 = 205;

    @OriginalMember(owner = "client!uu", name = "B", descriptor = "Lau;")
    public static class692 field7010 = new class692(5);

    @OriginalMember(owner = "client!uu", name = "z", descriptor = "I")
    public int field7008;

    @OriginalMember(owner = "client!uu", name = "A", descriptor = "I")
    public int field7009;

    @OriginalMember(owner = "client!uu", name = "F", descriptor = "I")
    public int field7013;

    @OriginalMember(owner = "client!uu", name = "G", descriptor = "I")
    public static int field7014;

    @OriginalMember(owner = "client!uu", name = "H", descriptor = "I")
    public int field7015;

    @OriginalMember(owner = "client!uu", name = "I", descriptor = "I")
    public static int field7016;

    @OriginalMember(owner = "client!uu", name = "J", descriptor = "I")
    public static int field7017;

    @OriginalMember(owner = "client!uu", name = "K", descriptor = "I")
    public static int field7018;

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(IIIIZ)V", line = 7)
    public final void method2826(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field7009 = arg2;
        this.field7015 = arg3 - arg2;
        this.field7013 = arg0;
        if (arg4) {
            field7010 = null;
        }
        this.field7008 = arg1 - arg0;
        field7018++;
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(B)V", line = 25)
    public static void method2827(byte arg0) {
        field7010 = null;
        if (arg0 >= -59) {
            field7011 = -3;
        }
    }

    @OriginalMember(owner = "client!uu", name = "g", descriptor = "(I)V", line = 39)
    public final void method2828(int arg0) {
        field7014++;
        int var2 = -1;
        int var3 = this.field7012.length - 8;
        int var4 = 125 % ((32 - arg0) / 41);
        while (var2 < var3) {
            var2++;
            this.field7012[var2] = 0;
            var2++;
            this.field7012[var2] = 0;
            var2++;
            this.field7012[var2] = 0;
            var2++;
            this.field7012[var2] = 0;
            var2++;
            this.field7012[var2] = 0;
            var2++;
            this.field7012[var2] = 0;
            var2++;
            this.field7012[var2] = 0;
            var2++;
            this.field7012[var2] = 0;
        }
        while (var2 < this.field7012.length - 1) {
            var2++;
            this.field7012[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!uu", name = "b", descriptor = "(III)Z", line = 69)
    public final boolean method2829(int arg0, int arg1, int arg2) {
        field7017++;
        int var4 = -50 % ((52 - arg1) / 32);
        return this.field7012.length >= arg0 * arg2;
    }

    @OriginalMember(owner = "client!uu", name = "<init>", descriptor = "(Luca;II)V", line = 86)
    public class495(class287 arg0, int arg1, int arg2) {
        this.field7012 = new byte[arg1 * arg2];
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(ZIIIIII)V", line = 101)
    public final void method2830(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0) {
            return;
        }
        field7016++;
        int var8 = 0;
        if (arg2 != arg3) {
            var8 = (arg1 - arg5 << 16) / (arg3 - arg2);
        }
        int var9 = 0;
        if (arg3 != arg4) {
            var9 = (arg6 - arg1 << 16) / (arg4 - arg3);
        }
        int var10 = 0;
        if (arg2 != arg4) {
            var10 = (arg5 - arg6 << 16) / (arg2 - arg4);
        }
        if (arg3 >= arg2 && arg4 >= arg2) {
            if (arg3 < arg4) {
                int var11;
                int var12 = var11 = arg5 << 16;
                if (arg2 < 0) {
                    var11 -= arg2 * var8;
                    var12 -= arg2 * var10;
                    arg2 = 0;
                }
                int var13 = arg1 << 16;
                if (arg3 < 0) {
                    var13 -= arg3 * var9;
                    arg3 = 0;
                }
                if (arg2 != arg3 && var8 > var10 || arg2 == arg3 && var9 < var10) {
                    int var14 = arg4 - arg3;
                    int var15 = arg3 - arg2;
                    int var16 = this.field7008 * arg2;
                    while (true) {
                        var15--;
                        if (var15 < 0) {
                            while (true) {
                                var14--;
                                if (var14 < 0) {
                                    return;
                                }
                                class458.method2677(var13 >> 16, (byte) 124, var16, var12 >> 16, 0, this.field7012);
                                var12 += var10;
                                var16 += this.field7008;
                                var13 += var9;
                            }
                        }
                        class458.method2677(var11 >> 16, (byte) 119, var16, var12 >> 16, 0, this.field7012);
                        var12 += var10;
                        var11 += var8;
                        var16 += this.field7008;
                    }
                } else {
                    int var17 = arg4 - arg3;
                    int var18 = arg3 - arg2;
                    int var19 = this.field7008 * arg2;
                    while (true) {
                        var18--;
                        if (var18 < 0) {
                            while (true) {
                                var17--;
                                if (var17 < 0) {
                                    return;
                                }
                                class458.method2677(var12 >> 16, (byte) 127, var19, var13 >> 16, 0, this.field7012);
                                var12 += var10;
                                var13 += var9;
                                var19 += this.field7008;
                            }
                        }
                        class458.method2677(var12 >> 16, (byte) 125, var19, var11 >> 16, 0, this.field7012);
                        var19 += this.field7008;
                        var12 += var10;
                        var11 += var8;
                    }
                }
            } else {
                int var20;
                int var21 = var20 = arg5 << 16;
                if (arg2 < 0) {
                    var21 -= arg2 * var10;
                    var20 -= arg2 * var8;
                    arg2 = 0;
                }
                int var22 = arg6 << 16;
                if (arg4 < 0) {
                    var22 -= arg4 * var9;
                    arg4 = 0;
                }
                if (arg2 != arg4 && var10 < var8 || arg2 == arg4 && var8 < var9) {
                    int var23 = arg3 - arg4;
                    int var24 = arg4 - arg2;
                    int var25 = this.field7008 * arg2;
                    while (true) {
                        var24--;
                        if (var24 < 0) {
                            while (true) {
                                var23--;
                                if (var23 < 0) {
                                    return;
                                }
                                class458.method2677(var20 >> 16, (byte) 127, var25, var22 >> 16, 0, this.field7012);
                                var25 += this.field7008;
                                var20 += var8;
                                var22 += var9;
                            }
                        }
                        class458.method2677(var20 >> 16, (byte) 122, var25, var21 >> 16, 0, this.field7012);
                        var20 += var8;
                        var21 += var10;
                        var25 += this.field7008;
                    }
                } else {
                    int var26 = arg3 - arg4;
                    int var27 = arg4 - arg2;
                    int var28 = this.field7008 * arg2;
                    while (true) {
                        var27--;
                        if (var27 < 0) {
                            while (true) {
                                var26--;
                                if (var26 < 0) {
                                    return;
                                }
                                class458.method2677(var22 >> 16, (byte) 121, var28, var20 >> 16, 0, this.field7012);
                                var28 += this.field7008;
                                var20 += var8;
                                var22 += var9;
                            }
                        }
                        class458.method2677(var21 >> 16, (byte) 121, var28, var20 >> 16, 0, this.field7012);
                        var20 += var8;
                        var21 += var10;
                        var28 += this.field7008;
                    }
                }
            }
        } else if (arg4 >= arg3) {
            if (arg2 > arg4) {
                int var29;
                int var30 = var29 = arg1 << 16;
                if (arg3 < 0) {
                    var29 -= arg3 * var9;
                    var30 -= arg3 * var8;
                    arg3 = 0;
                }
                int var31 = arg6 << 16;
                if (arg4 < 0) {
                    var31 -= arg4 * var10;
                    arg4 = 0;
                }
                if ((arg3 == arg4 || var9 <= var8) && (arg3 != arg4 || var10 >= var8)) {
                    int var35 = arg2 - arg4;
                    int var36 = arg4 - arg3;
                    int var37 = this.field7008 * arg3;
                    while (true) {
                        var36--;
                        if (var36 < 0) {
                            while (true) {
                                var35--;
                                if (var35 < 0) {
                                    return;
                                }
                                class458.method2677(var30 >> 16, (byte) 122, var37, var31 >> 16, 0, this.field7012);
                                var37 += this.field7008;
                                var31 += var10;
                                var30 += var8;
                            }
                        }
                        class458.method2677(var30 >> 16, (byte) 124, var37, var29 >> 16, 0, this.field7012);
                        var30 += var8;
                        var29 += var9;
                        var37 += this.field7008;
                    }
                } else {
                    int var32 = arg2 - arg4;
                    int var33 = arg4 - arg3;
                    int var34 = this.field7008 * arg3;
                    while (true) {
                        var33--;
                        if (var33 < 0) {
                            while (true) {
                                var32--;
                                if (var32 < 0) {
                                    return;
                                }
                                class458.method2677(var31 >> 16, (byte) 124, var34, var30 >> 16, 0, this.field7012);
                                var31 += var10;
                                var34 += this.field7008;
                                var30 += var8;
                            }
                        }
                        class458.method2677(var29 >> 16, (byte) 125, var34, var30 >> 16, 0, this.field7012);
                        var29 += var9;
                        var30 += var8;
                        var34 += this.field7008;
                    }
                }
            } else {
                int var38;
                int var39 = var38 = arg1 << 16;
                int var40 = arg5 << 16;
                if (arg3 < 0) {
                    var39 -= arg3 * var8;
                    var38 -= arg3 * var9;
                    arg3 = 0;
                }
                if (arg2 < 0) {
                    var40 -= arg2 * var10;
                    arg2 = 0;
                }
                if (var8 < var9) {
                    int var41 = arg4 - arg2;
                    int var42 = arg2 - arg3;
                    int var43 = this.field7008 * arg3;
                    while (true) {
                        var42--;
                        if (var42 < 0) {
                            while (true) {
                                var41--;
                                if (var41 < 0) {
                                    return;
                                }
                                class458.method2677(var38 >> 16, (byte) 125, var43, var40 >> 16, 0, this.field7012);
                                var38 += var9;
                                var40 += var10;
                                var43 += this.field7008;
                            }
                        }
                        class458.method2677(var38 >> 16, (byte) 125, var43, var39 >> 16, 0, this.field7012);
                        var43 += this.field7008;
                        var39 += var8;
                        var38 += var9;
                    }
                } else {
                    int var44 = arg4 - arg2;
                    int var45 = arg2 - arg3;
                    int var46 = this.field7008 * arg3;
                    while (true) {
                        var45--;
                        if (var45 < 0) {
                            while (true) {
                                var44--;
                                if (var44 < 0) {
                                    return;
                                }
                                class458.method2677(var40 >> 16, (byte) 120, var46, var38 >> 16, 0, this.field7012);
                                var38 += var9;
                                var40 += var10;
                                var46 += this.field7008;
                            }
                        }
                        class458.method2677(var39 >> 16, (byte) 119, var46, var38 >> 16, 0, this.field7012);
                        var46 += this.field7008;
                        var38 += var9;
                        var39 += var8;
                    }
                }
            }
        } else if (arg3 > arg2) {
            int var47;
            int var48 = var47 = arg6 << 16;
            if (arg4 < 0) {
                var48 -= arg4 * var9;
                var47 -= arg4 * var10;
                arg4 = 0;
            }
            int var49 = arg5 << 16;
            if (arg2 < 0) {
                var49 -= arg2 * var8;
                arg2 = 0;
            }
            if (var10 <= var9) {
                int var50 = arg3 - arg2;
                int var51 = arg2 - arg4;
                int var52 = this.field7008 * arg4;
                while (true) {
                    var51--;
                    if (var51 < 0) {
                        while (true) {
                            var50--;
                            if (var50 < 0) {
                                return;
                            }
                            class458.method2677(var48 >> 16, (byte) 120, var52, var49 >> 16, 0, this.field7012);
                            var52 += this.field7008;
                            var49 += var8;
                            var48 += var9;
                        }
                    }
                    class458.method2677(var48 >> 16, (byte) 123, var52, var47 >> 16, 0, this.field7012);
                    var47 += var10;
                    var48 += var9;
                    var52 += this.field7008;
                }
            } else {
                int var53 = arg3 - arg2;
                int var54 = arg2 - arg4;
                int var55 = this.field7008 * arg4;
                while (true) {
                    var54--;
                    if (var54 < 0) {
                        while (true) {
                            var53--;
                            if (var53 < 0) {
                                return;
                            }
                            class458.method2677(var49 >> 16, (byte) 119, var55, var48 >> 16, 0, this.field7012);
                            var49 += var8;
                            var55 += this.field7008;
                            var48 += var9;
                        }
                    }
                    class458.method2677(var47 >> 16, (byte) 120, var55, var48 >> 16, 0, this.field7012);
                    var55 += this.field7008;
                    var47 += var10;
                    var48 += var9;
                }
            }
        } else {
            int var56;
            int var57 = var56 = arg6 << 16;
            if (arg4 < 0) {
                var56 -= arg4 * var10;
                var57 -= arg4 * var9;
                arg4 = 0;
            }
            int var58 = arg1 << 16;
            if (arg3 < 0) {
                var58 -= arg3 * var8;
                arg3 = 0;
            }
            if (var9 >= var10) {
                int var59 = arg2 - arg3;
                int var60 = arg3 - arg4;
                int var61 = this.field7008 * arg4;
                while (true) {
                    var60--;
                    if (var60 < 0) {
                        while (true) {
                            var59--;
                            if (var59 < 0) {
                                return;
                            }
                            class458.method2677(var58 >> 16, (byte) 123, var61, var56 >> 16, 0, this.field7012);
                            var58 += var8;
                            var61 += this.field7008;
                            var56 += var10;
                        }
                    }
                    class458.method2677(var57 >> 16, (byte) 120, var61, var56 >> 16, 0, this.field7012);
                    var56 += var10;
                    var61 += this.field7008;
                    var57 += var9;
                }
            } else {
                int var62 = arg2 - arg3;
                int var63 = arg3 - arg4;
                int var64 = this.field7008 * arg4;
                while (true) {
                    var63--;
                    if (var63 < 0) {
                        while (true) {
                            var62--;
                            if (var62 < 0) {
                                return;
                            }
                            class458.method2677(var56 >> 16, (byte) 124, var64, var58 >> 16, 0, this.field7012);
                            var58 += var8;
                            var64 += this.field7008;
                            var56 += var10;
                        }
                    }
                    class458.method2677(var56 >> 16, (byte) 121, var64, var57 >> 16, 0, this.field7012);
                    var57 += var9;
                    var56 += var10;
                    var64 += this.field7008;
                }
            }
        }
    }
}
