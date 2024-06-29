import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nfa")
public class class709 extends class196 {

    @OriginalMember(owner = "client!nfa", name = "N", descriptor = "[B")
    public byte[] field9958;

    @OriginalMember(owner = "client!nfa", name = "D", descriptor = "[I")
    public static int[] field9950 = new int[1];

    @OriginalMember(owner = "client!nfa", name = "A", descriptor = "I")
    public static int field9947 = 0;

    @OriginalMember(owner = "client!nfa", name = "C", descriptor = "I")
    public static int field9949;

    @OriginalMember(owner = "client!nfa", name = "E", descriptor = "I")
    public static int field9951;

    @OriginalMember(owner = "client!nfa", name = "F", descriptor = "I")
    public int field9952;

    @OriginalMember(owner = "client!nfa", name = "I", descriptor = "I")
    public static int field9954;

    @OriginalMember(owner = "client!nfa", name = "K", descriptor = "I")
    public static int field9955;

    @OriginalMember(owner = "client!nfa", name = "M", descriptor = "I")
    public int field9957;

    @OriginalMember(owner = "client!nfa", name = "O", descriptor = "I")
    public int field9959;

    @OriginalMember(owner = "client!nfa", name = "P", descriptor = "I")
    public int field9960;

    @OriginalMember(owner = "client!nfa", name = "L", descriptor = "Lbt;")
    public static class48 field9956;

    @OriginalMember(owner = "client!nfa", name = "G", descriptor = "Lpga;")
    public static class561 field9953;

    @OriginalMember(owner = "client!nfa", name = "B", descriptor = "[I")
    public static int[] field9948;

    @OriginalMember(owner = "client!nfa", name = "d", descriptor = "(I)V")
    public static void method4019(int arg0) {
        field9956 = null;
        if (arg0 != 1334576944) {
            field9956 = null;
        }
        field9948 = null;
        field9950 = null;
        field9953 = null;
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(IIIII)V")
    public final void method4020(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field9957 = arg0 - arg2;
        field9949++;
        this.field9960 = arg2;
        this.field9959 = arg4;
        if (arg1 <= 53) {
            this.method4022(-102);
        }
        this.field9952 = arg3 - arg4;
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(IIIIIII)V")
    public final void method4021(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field9951++;
        int var8 = 0;
        if (arg0 != arg2) {
            var8 = (arg3 - arg6 << 16) / (arg0 - arg2);
        }
        int var9 = 0;
        if (arg0 != arg5) {
            var9 = (arg1 - arg3 << 16) / (arg5 - arg0);
        }
        int var10 = 0;
        if (arg2 != arg5) {
            var10 = (arg6 - arg1 << 16) / (arg2 - arg5);
        }
        if (arg4 >= -112) {
            this.method4021(-52, -55, 68, 88, 76, 66, 109);
        }
        if (arg2 <= arg0 && arg5 >= arg2) {
            if (arg0 < arg5) {
                int var11;
                int var12 = var11 = arg6 << 16;
                if (arg2 < 0) {
                    var11 -= arg2 * var8;
                    var12 -= arg2 * var10;
                    arg2 = 0;
                }
                int var13 = arg3 << 16;
                if (arg0 < 0) {
                    var13 -= arg0 * var9;
                    arg0 = 0;
                }
                if (arg0 != arg2 && var8 > var10 || arg0 == arg2 && var9 < var10) {
                    int var14 = arg5 - arg0;
                    int var15 = arg0 - arg2;
                    int var16 = this.field9957 * arg2;
                    while (true) {
                        var15--;
                        if (var15 < 0) {
                            while (true) {
                                var14--;
                                if (var14 < 0) {
                                    return;
                                }
                                class621.method3536(var13 >> 16, 0, this.field9958, (byte) 1, var12 >> 16, var16);
                                var13 += var9;
                                var16 += this.field9957;
                                var12 += var10;
                            }
                        }
                        class621.method3536(var11 >> 16, 0, this.field9958, (byte) 1, var12 >> 16, var16);
                        var16 += this.field9957;
                        var12 += var10;
                        var11 += var8;
                    }
                } else {
                    int var17 = arg5 - arg0;
                    int var18 = arg0 - arg2;
                    int var19 = this.field9957 * arg2;
                    while (true) {
                        var18--;
                        if (var18 < 0) {
                            while (true) {
                                var17--;
                                if (var17 < 0) {
                                    return;
                                }
                                class621.method3536(var12 >> 16, 0, this.field9958, (byte) 1, var13 >> 16, var19);
                                var13 += var9;
                                var19 += this.field9957;
                                var12 += var10;
                            }
                        }
                        class621.method3536(var12 >> 16, 0, this.field9958, (byte) 1, var11 >> 16, var19);
                        var19 += this.field9957;
                        var12 += var10;
                        var11 += var8;
                    }
                }
            } else {
                int var20;
                int var21 = var20 = arg6 << 16;
                int var22 = arg1 << 16;
                if (arg2 < 0) {
                    var20 -= arg2 * var8;
                    var21 -= arg2 * var10;
                    arg2 = 0;
                }
                if (arg5 < 0) {
                    var22 -= arg5 * var9;
                    arg5 = 0;
                }
                if (arg2 != arg5 && var10 < var8 || arg2 == arg5 && var9 > var8) {
                    int var23 = arg0 - arg5;
                    int var24 = arg5 - arg2;
                    int var25 = this.field9957 * arg2;
                    while (true) {
                        var24--;
                        if (var24 < 0) {
                            while (true) {
                                var23--;
                                if (var23 < 0) {
                                    return;
                                }
                                class621.method3536(var20 >> 16, 0, this.field9958, (byte) 1, var22 >> 16, var25);
                                var22 += var9;
                                var20 += var8;
                                var25 += this.field9957;
                            }
                        }
                        class621.method3536(var20 >> 16, 0, this.field9958, (byte) 1, var21 >> 16, var25);
                        var25 += this.field9957;
                        var20 += var8;
                        var21 += var10;
                    }
                } else {
                    int var26 = arg0 - arg5;
                    int var27 = arg5 - arg2;
                    int var28 = this.field9957 * arg2;
                    while (true) {
                        var27--;
                        if (var27 < 0) {
                            while (true) {
                                var26--;
                                if (var26 < 0) {
                                    return;
                                }
                                class621.method3536(var22 >> 16, 0, this.field9958, (byte) 1, var20 >> 16, var28);
                                var20 += var8;
                                var28 += this.field9957;
                                var22 += var9;
                            }
                        }
                        class621.method3536(var21 >> 16, 0, this.field9958, (byte) 1, var20 >> 16, var28);
                        var21 += var10;
                        var28 += this.field9957;
                        var20 += var8;
                    }
                }
            }
        } else if (arg5 < arg0) {
            if (arg2 < arg0) {
                int var29;
                int var30 = var29 = arg1 << 16;
                if (arg5 < 0) {
                    var29 -= arg5 * var10;
                    var30 -= arg5 * var9;
                    arg5 = 0;
                }
                int var31 = arg6 << 16;
                if (arg2 < 0) {
                    var31 -= arg2 * var8;
                    arg2 = 0;
                }
                if (var9 < var10) {
                    int var32 = arg0 - arg2;
                    int var33 = arg2 - arg5;
                    int var34 = this.field9957 * arg5;
                    while (true) {
                        var33--;
                        if (var33 < 0) {
                            while (true) {
                                var32--;
                                if (var32 < 0) {
                                    return;
                                }
                                class621.method3536(var31 >> 16, 0, this.field9958, (byte) 1, var30 >> 16, var34);
                                var34 += this.field9957;
                                var31 += var8;
                                var30 += var9;
                            }
                        }
                        class621.method3536(var29 >> 16, 0, this.field9958, (byte) 1, var30 >> 16, var34);
                        var29 += var10;
                        var34 += this.field9957;
                        var30 += var9;
                    }
                } else {
                    int var35 = arg0 - arg2;
                    int var36 = arg2 - arg5;
                    int var37 = this.field9957 * arg5;
                    while (true) {
                        var36--;
                        if (var36 < 0) {
                            while (true) {
                                var35--;
                                if (var35 < 0) {
                                    return;
                                }
                                class621.method3536(var30 >> 16, 0, this.field9958, (byte) 1, var31 >> 16, var37);
                                var30 += var9;
                                var37 += this.field9957;
                                var31 += var8;
                            }
                        }
                        class621.method3536(var30 >> 16, 0, this.field9958, (byte) 1, var29 >> 16, var37);
                        var37 += this.field9957;
                        var29 += var10;
                        var30 += var9;
                    }
                }
            } else {
                int var38;
                int var39 = var38 = arg1 << 16;
                if (arg5 < 0) {
                    var38 -= arg5 * var10;
                    var39 -= arg5 * var9;
                    arg5 = 0;
                }
                int var40 = arg3 << 16;
                if (arg0 < 0) {
                    var40 -= arg0 * var8;
                    arg0 = 0;
                }
                if (var9 < var10) {
                    int var41 = arg2 - arg0;
                    int var42 = arg0 - arg5;
                    int var43 = this.field9957 * arg5;
                    while (true) {
                        var42--;
                        if (var42 < 0) {
                            while (true) {
                                var41--;
                                if (var41 < 0) {
                                    return;
                                }
                                class621.method3536(var38 >> 16, 0, this.field9958, (byte) 1, var40 >> 16, var43);
                                var40 += var8;
                                var38 += var10;
                                var43 += this.field9957;
                            }
                        }
                        class621.method3536(var38 >> 16, 0, this.field9958, (byte) 1, var39 >> 16, var43);
                        var38 += var10;
                        var43 += this.field9957;
                        var39 += var9;
                    }
                } else {
                    int var44 = arg2 - arg0;
                    int var45 = arg0 - arg5;
                    int var46 = this.field9957 * arg5;
                    while (true) {
                        var45--;
                        if (var45 < 0) {
                            while (true) {
                                var44--;
                                if (var44 < 0) {
                                    return;
                                }
                                class621.method3536(var40 >> 16, 0, this.field9958, (byte) 1, var38 >> 16, var46);
                                var40 += var8;
                                var46 += this.field9957;
                                var38 += var10;
                            }
                        }
                        class621.method3536(var39 >> 16, 0, this.field9958, (byte) 1, var38 >> 16, var46);
                        var46 += this.field9957;
                        var39 += var9;
                        var38 += var10;
                    }
                }
            }
        } else if (arg5 < arg2) {
            int var47;
            int var48 = var47 = arg3 << 16;
            int var49 = arg1 << 16;
            if (arg0 < 0) {
                var48 -= arg0 * var8;
                var47 -= arg0 * var9;
                arg0 = 0;
            }
            if (arg5 < 0) {
                var49 -= arg5 * var10;
                arg5 = 0;
            }
            if (arg0 != arg5 && var8 < var9 || arg0 == arg5 && var10 < var8) {
                int var50 = arg2 - arg5;
                int var51 = arg5 - arg0;
                int var52 = this.field9957 * arg0;
                while (true) {
                    var51--;
                    if (var51 < 0) {
                        while (true) {
                            var50--;
                            if (var50 < 0) {
                                return;
                            }
                            class621.method3536(var49 >> 16, 0, this.field9958, (byte) 1, var48 >> 16, var52);
                            var48 += var8;
                            var52 += this.field9957;
                            var49 += var10;
                        }
                    }
                    class621.method3536(var47 >> 16, 0, this.field9958, (byte) 1, var48 >> 16, var52);
                    var48 += var8;
                    var47 += var9;
                    var52 += this.field9957;
                }
            } else {
                int var53 = arg2 - arg5;
                int var54 = arg5 - arg0;
                int var55 = this.field9957 * arg0;
                while (true) {
                    var54--;
                    if (var54 < 0) {
                        while (true) {
                            var53--;
                            if (var53 < 0) {
                                return;
                            }
                            class621.method3536(var48 >> 16, 0, this.field9958, (byte) 1, var49 >> 16, var55);
                            var49 += var10;
                            var48 += var8;
                            var55 += this.field9957;
                        }
                    }
                    class621.method3536(var48 >> 16, 0, this.field9958, (byte) 1, var47 >> 16, var55);
                    var55 += this.field9957;
                    var48 += var8;
                    var47 += var9;
                }
            }
        } else {
            int var56;
            int var57 = var56 = arg3 << 16;
            int var58 = arg6 << 16;
            if (arg0 < 0) {
                var57 -= arg0 * var8;
                var56 -= arg0 * var9;
                arg0 = 0;
            }
            if (arg2 < 0) {
                var58 -= arg2 * var10;
                arg2 = 0;
            }
            if (var9 <= var8) {
                int var59 = arg5 - arg2;
                int var60 = arg2 - arg0;
                int var61 = this.field9957 * arg0;
                while (true) {
                    var60--;
                    if (var60 < 0) {
                        while (true) {
                            var59--;
                            if (var59 < 0) {
                                return;
                            }
                            class621.method3536(var58 >> 16, 0, this.field9958, (byte) 1, var56 >> 16, var61);
                            var61 += this.field9957;
                            var56 += var9;
                            var58 += var10;
                        }
                    }
                    class621.method3536(var57 >> 16, 0, this.field9958, (byte) 1, var56 >> 16, var61);
                    var56 += var9;
                    var61 += this.field9957;
                    var57 += var8;
                }
            } else {
                int var62 = arg5 - arg2;
                int var63 = arg2 - arg0;
                int var64 = this.field9957 * arg0;
                while (true) {
                    var63--;
                    if (var63 < 0) {
                        while (true) {
                            var62--;
                            if (var62 < 0) {
                                return;
                            }
                            class621.method3536(var56 >> 16, 0, this.field9958, (byte) 1, var58 >> 16, var64);
                            var64 += this.field9957;
                            var56 += var9;
                            var58 += var10;
                        }
                    }
                    class621.method3536(var56 >> 16, 0, this.field9958, (byte) 1, var57 >> 16, var64);
                    var64 += this.field9957;
                    var56 += var9;
                    var57 += var8;
                }
            }
        }
    }

    @OriginalMember(owner = "client!nfa", name = "g", descriptor = "(I)V")
    public final void method4022(int arg0) {
        if (arg0 > -100) {
            return;
        }
        field9954++;
        int var2 = -1;
        int var3 = this.field9958.length - 8;
        while (var2 < var3) {
            var2++;
            this.field9958[var2] = 0;
            var2++;
            this.field9958[var2] = 0;
            var2++;
            this.field9958[var2] = 0;
            var2++;
            this.field9958[var2] = 0;
            var2++;
            this.field9958[var2] = 0;
            var2++;
            this.field9958[var2] = 0;
            var2++;
            this.field9958[var2] = 0;
            var2++;
            this.field9958[var2] = 0;
        }
        while (this.field9958.length - 1 > var2) {
            var2++;
            this.field9958[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(III)Z")
    public final boolean method4023(int arg0, int arg1, int arg2) {
        field9955++;
        if (arg2 <= 95) {
            this.field9957 = -97;
        }
        return this.field9958.length >= (arg0 * arg1);
    }

    @OriginalMember(owner = "client!nfa", name = "<init>", descriptor = "(Lpc;II)V")
    public class709(class700 arg0, int arg1, int arg2) {
        this.field9958 = new byte[arg1 * arg2];
    }
}
