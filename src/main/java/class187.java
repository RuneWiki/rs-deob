import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class187 extends class117 {

    @OriginalMember(owner = "client!bd", name = "z", descriptor = "[B")
    public byte[] field2598;

    @OriginalMember(owner = "client!bd", name = "C", descriptor = "Z")
    public static boolean field2601 = false;

    @OriginalMember(owner = "client!bd", name = "E", descriptor = "Lhl;")
    public static class320 field2603 = new class320(0, 0);

    @OriginalMember(owner = "client!bd", name = "I", descriptor = "[I")
    public static int[] field2607 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!bd", name = "x", descriptor = "I")
    public int field2596;

    @OriginalMember(owner = "client!bd", name = "y", descriptor = "I")
    public static int field2597;

    @OriginalMember(owner = "client!bd", name = "A", descriptor = "I")
    public static int field2599;

    @OriginalMember(owner = "client!bd", name = "B", descriptor = "I")
    public static int field2600;

    @OriginalMember(owner = "client!bd", name = "D", descriptor = "I")
    public int field2602;

    @OriginalMember(owner = "client!bd", name = "F", descriptor = "I")
    public static int field2604;

    @OriginalMember(owner = "client!bd", name = "G", descriptor = "I")
    public int field2605;

    @OriginalMember(owner = "client!bd", name = "J", descriptor = "I")
    public int field2608;

    @OriginalMember(owner = "client!bd", name = "K", descriptor = "I")
    public static int field2609;

    @OriginalMember(owner = "client!bd", name = "H", descriptor = "[Ljava/lang/String;")
    public static String[] field2606;

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "(I)V")
    public static void method1235(int arg0) {
        field2606 = null;
        field2607 = null;
        if (arg0 <= -29) {
            field2603 = null;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(III)V")
    public static final void method1236(int arg0, int arg1, int arg2) {
        field2604++;
        class256 var3 = class592.method3279((byte) -31, arg0, arg1);
        var3.method1549(-32042);
        var3.field3358 = arg2;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IBIII)V")
    public final void method1237(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (arg1 >= -95) {
            this.field2596 = -31;
        }
        field2609++;
        this.field2602 = arg0;
        this.field2608 = arg2 - arg3;
        this.field2596 = arg4 - arg0;
        this.field2605 = arg3;
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(ZII)Z")
    public final boolean method1238(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            this.field2605 = -25;
        }
        field2599++;
        return (arg1 * arg2) <= this.field2598.length;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIIIIBI)V")
    public final void method1239(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        field2597++;
        int var8 = 0;
        if (arg0 != arg1) {
            var8 = (arg2 - arg3 << 16) / (arg0 - arg1);
        }
        if (arg5 >= -98) {
            this.field2598 = null;
        }
        int var9 = 0;
        if (arg0 != arg4) {
            var9 = (arg6 - arg2 << 16) / (arg4 - arg0);
        }
        int var10 = 0;
        if (arg1 != arg4) {
            var10 = (arg3 - arg6 << 16) / (arg1 - arg4);
        }
        if (arg1 <= arg0 && arg4 >= arg1) {
            if (arg4 <= arg0) {
                int var11;
                int var12 = var11 = arg3 << 16;
                if (arg1 < 0) {
                    var12 -= arg1 * var10;
                    var11 -= arg1 * var8;
                    arg1 = 0;
                }
                int var13 = arg6 << 16;
                if (arg4 < 0) {
                    var13 -= arg4 * var9;
                    arg4 = 0;
                }
                if ((arg1 == arg4 || var8 <= var10) && (arg1 != arg4 || var8 >= var9)) {
                    int var17 = arg0 - arg4;
                    int var18 = arg4 - arg1;
                    int var19 = this.field2608 * arg1;
                    while (true) {
                        var18--;
                        if (var18 < 0) {
                            while (true) {
                                var17--;
                                if (var17 < 0) {
                                    return;
                                }
                                class589.method3257(var11 >> 16, 0, var13 >> 16, this.field2598, 15609, var19);
                                var11 += var8;
                                var19 += this.field2608;
                                var13 += var9;
                            }
                        }
                        class589.method3257(var11 >> 16, 0, var12 >> 16, this.field2598, 15609, var19);
                        var11 += var8;
                        var12 += var10;
                        var19 += this.field2608;
                    }
                } else {
                    int var14 = arg0 - arg4;
                    int var15 = arg4 - arg1;
                    int var16 = this.field2608 * arg1;
                    while (true) {
                        var15--;
                        if (var15 < 0) {
                            while (true) {
                                var14--;
                                if (var14 < 0) {
                                    return;
                                }
                                class589.method3257(var13 >> 16, 0, var11 >> 16, this.field2598, 15609, var16);
                                var13 += var9;
                                var11 += var8;
                                var16 += this.field2608;
                            }
                        }
                        class589.method3257(var12 >> 16, 0, var11 >> 16, this.field2598, 15609, var16);
                        var16 += this.field2608;
                        var11 += var8;
                        var12 += var10;
                    }
                }
            } else {
                int var20;
                int var21 = var20 = arg3 << 16;
                if (arg1 < 0) {
                    var20 -= arg1 * var8;
                    var21 -= arg1 * var10;
                    arg1 = 0;
                }
                int var22 = arg2 << 16;
                if (arg0 < 0) {
                    var22 -= arg0 * var9;
                    arg0 = 0;
                }
                if (arg0 != arg1 && var10 < var8 || arg0 == arg1 && var10 > var9) {
                    int var23 = arg4 - arg0;
                    int var24 = arg0 - arg1;
                    int var25 = this.field2608 * arg1;
                    while (true) {
                        var24--;
                        if (var24 < 0) {
                            while (true) {
                                var23--;
                                if (var23 < 0) {
                                    return;
                                }
                                class589.method3257(var21 >> 16, 0, var22 >> 16, this.field2598, 15609, var25);
                                var21 += var10;
                                var25 += this.field2608;
                                var22 += var9;
                            }
                        }
                        class589.method3257(var21 >> 16, 0, var20 >> 16, this.field2598, 15609, var25);
                        var25 += this.field2608;
                        var21 += var10;
                        var20 += var8;
                    }
                } else {
                    int var26 = arg4 - arg0;
                    int var27 = arg0 - arg1;
                    int var28 = this.field2608 * arg1;
                    while (true) {
                        var27--;
                        if (var27 < 0) {
                            while (true) {
                                var26--;
                                if (var26 < 0) {
                                    return;
                                }
                                class589.method3257(var22 >> 16, 0, var21 >> 16, this.field2598, 15609, var28);
                                var28 += this.field2608;
                                var22 += var9;
                                var21 += var10;
                            }
                        }
                        class589.method3257(var20 >> 16, 0, var21 >> 16, this.field2598, 15609, var28);
                        var20 += var8;
                        var28 += this.field2608;
                        var21 += var10;
                    }
                }
            }
        } else if (arg0 <= arg4) {
            if (arg1 > arg4) {
                int var29;
                int var30 = var29 = arg2 << 16;
                int var31 = arg6 << 16;
                if (arg0 < 0) {
                    var29 -= arg0 * var9;
                    var30 -= arg0 * var8;
                    arg0 = 0;
                }
                if (arg4 < 0) {
                    var31 -= arg4 * var10;
                    arg4 = 0;
                }
                if (arg0 != arg4 && var8 < var9 || arg0 == arg4 && var8 > var10) {
                    int var32 = arg1 - arg4;
                    int var33 = arg4 - arg0;
                    int var34 = this.field2608 * arg0;
                    while (true) {
                        var33--;
                        if (var33 < 0) {
                            while (true) {
                                var32--;
                                if (var32 < 0) {
                                    return;
                                }
                                class589.method3257(var30 >> 16, 0, var31 >> 16, this.field2598, 15609, var34);
                                var34 += this.field2608;
                                var31 += var10;
                                var30 += var8;
                            }
                        }
                        class589.method3257(var30 >> 16, 0, var29 >> 16, this.field2598, 15609, var34);
                        var30 += var8;
                        var29 += var9;
                        var34 += this.field2608;
                    }
                } else {
                    int var35 = arg1 - arg4;
                    int var36 = arg4 - arg0;
                    int var37 = this.field2608 * arg0;
                    while (true) {
                        var36--;
                        if (var36 < 0) {
                            while (true) {
                                var35--;
                                if (var35 < 0) {
                                    return;
                                }
                                class589.method3257(var31 >> 16, 0, var30 >> 16, this.field2598, 15609, var37);
                                var31 += var10;
                                var37 += this.field2608;
                                var30 += var8;
                            }
                        }
                        class589.method3257(var29 >> 16, 0, var30 >> 16, this.field2598, 15609, var37);
                        var29 += var9;
                        var37 += this.field2608;
                        var30 += var8;
                    }
                }
            } else {
                int var38;
                int var39 = var38 = arg2 << 16;
                int var40 = arg3 << 16;
                if (arg0 < 0) {
                    var38 -= arg0 * var9;
                    var39 -= arg0 * var8;
                    arg0 = 0;
                }
                if (arg1 < 0) {
                    var40 -= arg1 * var10;
                    arg1 = 0;
                }
                if (var9 <= var8) {
                    int var41 = arg4 - arg1;
                    int var42 = arg1 - arg0;
                    int var43 = this.field2608 * arg0;
                    while (true) {
                        var42--;
                        if (var42 < 0) {
                            while (true) {
                                var41--;
                                if (var41 < 0) {
                                    return;
                                }
                                class589.method3257(var38 >> 16, 0, var40 >> 16, this.field2598, 15609, var43);
                                var38 += var9;
                                var43 += this.field2608;
                                var40 += var10;
                            }
                        }
                        class589.method3257(var38 >> 16, 0, var39 >> 16, this.field2598, 15609, var43);
                        var39 += var8;
                        var38 += var9;
                        var43 += this.field2608;
                    }
                } else {
                    int var44 = arg4 - arg1;
                    int var45 = arg1 - arg0;
                    int var46 = this.field2608 * arg0;
                    while (true) {
                        var45--;
                        if (var45 < 0) {
                            while (true) {
                                var44--;
                                if (var44 < 0) {
                                    return;
                                }
                                class589.method3257(var40 >> 16, 0, var38 >> 16, this.field2598, 15609, var46);
                                var38 += var9;
                                var46 += this.field2608;
                                var40 += var10;
                            }
                        }
                        class589.method3257(var39 >> 16, 0, var38 >> 16, this.field2598, 15609, var46);
                        var39 += var8;
                        var38 += var9;
                        var46 += this.field2608;
                    }
                }
            }
        } else if (arg0 > arg1) {
            int var47;
            int var48 = var47 = arg6 << 16;
            if (arg4 < 0) {
                var48 -= arg4 * var9;
                var47 -= arg4 * var10;
                arg4 = 0;
            }
            int var49 = arg3 << 16;
            if (arg1 < 0) {
                var49 -= arg1 * var8;
                arg1 = 0;
            }
            if (var10 > var9) {
                int var50 = arg0 - arg1;
                int var51 = arg1 - arg4;
                int var52 = this.field2608 * arg4;
                while (true) {
                    var51--;
                    if (var51 < 0) {
                        while (true) {
                            var50--;
                            if (var50 < 0) {
                                return;
                            }
                            class589.method3257(var48 >> 16, 0, var49 >> 16, this.field2598, 15609, var52);
                            var49 += var8;
                            var52 += this.field2608;
                            var48 += var9;
                        }
                    }
                    class589.method3257(var48 >> 16, 0, var47 >> 16, this.field2598, 15609, var52);
                    var47 += var10;
                    var48 += var9;
                    var52 += this.field2608;
                }
            } else {
                int var53 = arg0 - arg1;
                int var54 = arg1 - arg4;
                int var55 = this.field2608 * arg4;
                while (true) {
                    var54--;
                    if (var54 < 0) {
                        while (true) {
                            var53--;
                            if (var53 < 0) {
                                return;
                            }
                            class589.method3257(var49 >> 16, 0, var48 >> 16, this.field2598, 15609, var55);
                            var48 += var9;
                            var49 += var8;
                            var55 += this.field2608;
                        }
                    }
                    class589.method3257(var47 >> 16, 0, var48 >> 16, this.field2598, 15609, var55);
                    var47 += var10;
                    var55 += this.field2608;
                    var48 += var9;
                }
            }
        } else {
            int var56;
            int var57 = var56 = arg6 << 16;
            if (arg4 < 0) {
                var57 -= arg4 * var9;
                var56 -= arg4 * var10;
                arg4 = 0;
            }
            int var58 = arg2 << 16;
            if (arg0 < 0) {
                var58 -= arg0 * var8;
                arg0 = 0;
            }
            if (var9 >= var10) {
                int var59 = arg1 - arg0;
                int var60 = arg0 - arg4;
                int var61 = this.field2608 * arg4;
                while (true) {
                    var60--;
                    if (var60 < 0) {
                        while (true) {
                            var59--;
                            if (var59 < 0) {
                                return;
                            }
                            class589.method3257(var56 >> 16, 0, var58 >> 16, this.field2598, 15609, var61);
                            var56 += var10;
                            var58 += var8;
                            var61 += this.field2608;
                        }
                    }
                    class589.method3257(var56 >> 16, 0, var57 >> 16, this.field2598, 15609, var61);
                    var56 += var10;
                    var57 += var9;
                    var61 += this.field2608;
                }
            } else {
                int var62 = arg1 - arg0;
                int var63 = arg0 - arg4;
                int var64 = this.field2608 * arg4;
                while (true) {
                    var63--;
                    if (var63 < 0) {
                        while (true) {
                            var62--;
                            if (var62 < 0) {
                                return;
                            }
                            class589.method3257(var58 >> 16, 0, var56 >> 16, this.field2598, 15609, var64);
                            var58 += var8;
                            var56 += var10;
                            var64 += this.field2608;
                        }
                    }
                    class589.method3257(var57 >> 16, 0, var56 >> 16, this.field2598, 15609, var64);
                    var56 += var10;
                    var64 += this.field2608;
                    var57 += var9;
                }
            }
        }
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(B)V")
    public final void method1240(byte arg0) {
        field2600++;
        if (arg0 >= -26) {
            this.field2608 = 97;
        }
        int var2 = -1;
        int var3 = this.field2598.length - 8;
        while (var2 < var3) {
            var2++;
            this.field2598[var2] = 0;
            var2++;
            this.field2598[var2] = 0;
            var2++;
            this.field2598[var2] = 0;
            var2++;
            this.field2598[var2] = 0;
            var2++;
            this.field2598[var2] = 0;
            var2++;
            this.field2598[var2] = 0;
            var2++;
            this.field2598[var2] = 0;
            var2++;
            this.field2598[var2] = 0;
        }
        while (var2 < this.field2598.length - 1) {
            var2++;
            this.field2598[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(Lag;II)V")
    public class187(class469 arg0, int arg1, int arg2) {
        this.field2598 = new byte[arg1 * arg2];
    }
}
