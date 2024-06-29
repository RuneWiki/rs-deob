import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class34 extends class483 {

    @OriginalMember(owner = "client!be", name = "A", descriptor = "[B")
    public byte[] field261;

    @OriginalMember(owner = "client!be", name = "K", descriptor = "[I")
    public static int[] field271;

    @OriginalMember(owner = "client!be", name = "L", descriptor = "F")
    public static float field272;

    @OriginalMember(owner = "client!be", name = "z", descriptor = "I")
    public int field260;

    @OriginalMember(owner = "client!be", name = "B", descriptor = "I")
    public static int field262;

    @OriginalMember(owner = "client!be", name = "C", descriptor = "I")
    public int field263;

    @OriginalMember(owner = "client!be", name = "D", descriptor = "I")
    public int field264;

    @OriginalMember(owner = "client!be", name = "E", descriptor = "I")
    public static int field265;

    @OriginalMember(owner = "client!be", name = "F", descriptor = "I")
    public static int field266;

    @OriginalMember(owner = "client!be", name = "G", descriptor = "I")
    public static int field267;

    @OriginalMember(owner = "client!be", name = "H", descriptor = "I")
    public int field268;

    @OriginalMember(owner = "client!be", name = "J", descriptor = "I")
    public static int field270;

    @OriginalMember(owner = "client!be", name = "M", descriptor = "I")
    public static int field273;

    @OriginalMember(owner = "client!be", name = "I", descriptor = "Ljj;")
    public static class99 field269;

    static {
        new class180("Adventurer", "Abenteurer", "Aventurier", "Aventureiro");
        field271 = new int[3];
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IIB)Z", line = 10)
    public final boolean method192(int arg0, int arg1, byte arg2) {
        field265++;
        if (arg2 >= -89) {
            this.method192(-13, -44, (byte) 3);
        }
        return (arg0 * arg1) <= this.field261.length;
    }

    @OriginalMember(owner = "client!be", name = "e", descriptor = "(B)V", line = 24)
    public static void method193(byte arg0) {
        if (arg0 != 51) {
            field269 = null;
        }
        field269 = null;
        field271 = null;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IIIIB)V", line = 37)
    public final void method194(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        this.field263 = arg1 - arg0;
        this.field264 = arg0;
        this.field260 = arg3 - arg2;
        int var6 = -79 / ((arg4 + 52) / 36);
        this.field268 = arg2;
        field266++;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IIIIIII)V", line = 54)
    public final void method195(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg5 != 410484688) {
            field272 = 0.09563005F;
        }
        field262++;
        int var8 = 0;
        if (arg0 != arg4) {
            var8 = (arg1 - arg6 << 16) / (arg4 - arg0);
        }
        int var9 = 0;
        if (arg2 != arg4) {
            var9 = (arg3 - arg1 << 16) / (arg2 - arg4);
        }
        int var10 = 0;
        if (arg0 != arg2) {
            var10 = (arg6 - arg3 << 16) / (arg0 - arg2);
        }
        if (arg0 <= arg4 && arg0 <= arg2) {
            if (arg4 < arg2) {
                int var11;
                int var12 = var11 = arg6 << 16;
                if (arg0 < 0) {
                    var12 -= arg0 * var10;
                    var11 -= arg0 * var8;
                    arg0 = 0;
                }
                int var13 = arg1 << 16;
                if (arg4 < 0) {
                    var13 -= arg4 * var9;
                    arg4 = 0;
                }
                if ((arg0 == arg4 || var8 <= var10) && (arg0 != arg4 || var9 >= var10)) {
                    int var17 = arg2 - arg4;
                    int var18 = arg4 - arg0;
                    int var19 = this.field263 * arg0;
                    while (true) {
                        var18--;
                        if (var18 < 0) {
                            while (true) {
                                var17--;
                                if (var17 < 0) {
                                    return;
                                }
                                class516.method2957(var13 >> 16, var19, -85, 0, var12 >> 16, this.field261);
                                var12 += var10;
                                var19 += this.field263;
                                var13 += var9;
                            }
                        }
                        class516.method2957(var11 >> 16, var19, -119, 0, var12 >> 16, this.field261);
                        var19 += this.field263;
                        var12 += var10;
                        var11 += var8;
                    }
                } else {
                    int var14 = arg2 - arg4;
                    int var15 = arg4 - arg0;
                    int var16 = this.field263 * arg0;
                    while (true) {
                        var15--;
                        if (var15 < 0) {
                            while (true) {
                                var14--;
                                if (var14 < 0) {
                                    return;
                                }
                                class516.method2957(var12 >> 16, var16, -90, 0, var13 >> 16, this.field261);
                                var12 += var10;
                                var16 += this.field263;
                                var13 += var9;
                            }
                        }
                        class516.method2957(var12 >> 16, var16, -107, 0, var11 >> 16, this.field261);
                        var11 += var8;
                        var12 += var10;
                        var16 += this.field263;
                    }
                }
            } else {
                int var20;
                int var21 = var20 = arg6 << 16;
                int var22 = arg3 << 16;
                if (arg0 < 0) {
                    var21 -= arg0 * var10;
                    var20 -= arg0 * var8;
                    arg0 = 0;
                }
                if (arg2 < 0) {
                    var22 -= arg2 * var9;
                    arg2 = 0;
                }
                if (arg0 != arg2 && var8 > var10 || arg0 == arg2 && var9 > var8) {
                    int var23 = arg4 - arg2;
                    int var24 = arg2 - arg0;
                    int var25 = this.field263 * arg0;
                    while (true) {
                        var24--;
                        if (var24 < 0) {
                            while (true) {
                                var23--;
                                if (var23 < 0) {
                                    return;
                                }
                                class516.method2957(var22 >> 16, var25, -85, 0, var20 >> 16, this.field261);
                                var20 += var8;
                                var25 += this.field263;
                                var22 += var9;
                            }
                        }
                        class516.method2957(var21 >> 16, var25, -122, 0, var20 >> 16, this.field261);
                        var21 += var10;
                        var25 += this.field263;
                        var20 += var8;
                    }
                } else {
                    int var26 = arg4 - arg2;
                    int var27 = arg2 - arg0;
                    int var28 = this.field263 * arg0;
                    while (true) {
                        var27--;
                        if (var27 < 0) {
                            while (true) {
                                var26--;
                                if (var26 < 0) {
                                    return;
                                }
                                class516.method2957(var20 >> 16, var28, arg5 ^ 0xE788807E, 0, var22 >> 16, this.field261);
                                var22 += var9;
                                var20 += var8;
                                var28 += this.field263;
                            }
                        }
                        class516.method2957(var20 >> 16, var28, arg5 ^ 0xE7888074, 0, var21 >> 16, this.field261);
                        var20 += var8;
                        var28 += this.field263;
                        var21 += var10;
                    }
                }
            }
        } else if (arg2 >= arg4) {
            if (arg2 >= arg0) {
                int var29;
                int var30 = var29 = arg1 << 16;
                int var31 = arg6 << 16;
                if (arg4 < 0) {
                    var29 -= arg4 * var9;
                    var30 -= arg4 * var8;
                    arg4 = 0;
                }
                if (arg0 < 0) {
                    var31 -= arg0 * var10;
                    arg0 = 0;
                }
                if (var9 > var8) {
                    int var32 = arg2 - arg0;
                    int var33 = arg0 - arg4;
                    int var34 = this.field263 * arg4;
                    while (true) {
                        var33--;
                        if (var33 < 0) {
                            while (true) {
                                var32--;
                                if (var32 < 0) {
                                    return;
                                }
                                class516.method2957(var31 >> 16, var34, -91, 0, var29 >> 16, this.field261);
                                var29 += var9;
                                var34 += this.field263;
                                var31 += var10;
                            }
                        }
                        class516.method2957(var30 >> 16, var34, -111, 0, var29 >> 16, this.field261);
                        var29 += var9;
                        var30 += var8;
                        var34 += this.field263;
                    }
                } else {
                    int var35 = arg2 - arg0;
                    int var36 = arg0 - arg4;
                    int var37 = this.field263 * arg4;
                    while (true) {
                        var36--;
                        if (var36 < 0) {
                            while (true) {
                                var35--;
                                if (var35 < 0) {
                                    return;
                                }
                                class516.method2957(var29 >> 16, var37, -90, 0, var31 >> 16, this.field261);
                                var37 += this.field263;
                                var29 += var9;
                                var31 += var10;
                            }
                        }
                        class516.method2957(var29 >> 16, var37, -120, 0, var30 >> 16, this.field261);
                        var29 += var9;
                        var30 += var8;
                        var37 += this.field263;
                    }
                }
            } else {
                int var38;
                int var39 = var38 = arg1 << 16;
                int var40 = arg3 << 16;
                if (arg4 < 0) {
                    var38 -= arg4 * var9;
                    var39 -= arg4 * var8;
                    arg4 = 0;
                }
                if (arg2 < 0) {
                    var40 -= arg2 * var10;
                    arg2 = 0;
                }
                if (arg2 != arg4 && var8 < var9 || arg2 == arg4 && var8 > var10) {
                    int var41 = arg0 - arg2;
                    int var42 = arg2 - arg4;
                    int var43 = this.field263 * arg4;
                    while (true) {
                        var42--;
                        if (var42 < 0) {
                            while (true) {
                                var41--;
                                if (var41 < 0) {
                                    return;
                                }
                                class516.method2957(var39 >> 16, var43, arg5 - 410484792, 0, var40 >> 16, this.field261);
                                var40 += var10;
                                var43 += this.field263;
                                var39 += var8;
                            }
                        }
                        class516.method2957(var39 >> 16, var43, arg5 - 410484808, 0, var38 >> 16, this.field261);
                        var43 += this.field263;
                        var38 += var9;
                        var39 += var8;
                    }
                } else {
                    int var44 = arg0 - arg2;
                    int var45 = arg2 - arg4;
                    int var46 = this.field263 * arg4;
                    while (true) {
                        var45--;
                        if (var45 < 0) {
                            while (true) {
                                var44--;
                                if (var44 < 0) {
                                    return;
                                }
                                class516.method2957(var40 >> 16, var46, arg5 - 410484784, 0, var39 >> 16, this.field261);
                                var40 += var10;
                                var46 += this.field263;
                                var39 += var8;
                            }
                        }
                        class516.method2957(var38 >> 16, var46, -77, 0, var39 >> 16, this.field261);
                        var46 += this.field263;
                        var39 += var8;
                        var38 += var9;
                    }
                }
            }
        } else if (arg4 <= arg0) {
            int var47;
            int var48 = var47 = arg3 << 16;
            int var49 = arg1 << 16;
            if (arg2 < 0) {
                var47 -= arg2 * var10;
                var48 -= arg2 * var9;
                arg2 = 0;
            }
            if (arg4 < 0) {
                var49 -= arg4 * var8;
                arg4 = 0;
            }
            if (var9 < var10) {
                int var50 = arg0 - arg4;
                int var51 = arg4 - arg2;
                int var52 = this.field263 * arg2;
                while (true) {
                    var51--;
                    if (var51 < 0) {
                        while (true) {
                            var50--;
                            if (var50 < 0) {
                                return;
                            }
                            class516.method2957(var49 >> 16, var52, arg5 ^ 0xE788806B, 0, var47 >> 16, this.field261);
                            var49 += var8;
                            var52 += this.field263;
                            var47 += var10;
                        }
                    }
                    class516.method2957(var48 >> 16, var52, -114, 0, var47 >> 16, this.field261);
                    var52 += this.field263;
                    var47 += var10;
                    var48 += var9;
                }
            } else {
                int var53 = arg0 - arg4;
                int var54 = arg4 - arg2;
                int var55 = this.field263 * arg2;
                while (true) {
                    var54--;
                    if (var54 < 0) {
                        while (true) {
                            var53--;
                            if (var53 < 0) {
                                return;
                            }
                            class516.method2957(var47 >> 16, var55, -118, 0, var49 >> 16, this.field261);
                            var49 += var8;
                            var55 += this.field263;
                            var47 += var10;
                        }
                    }
                    class516.method2957(var47 >> 16, var55, -76, 0, var48 >> 16, this.field261);
                    var48 += var9;
                    var55 += this.field263;
                    var47 += var10;
                }
            }
        } else {
            int var56;
            int var57 = var56 = arg3 << 16;
            if (arg2 < 0) {
                var57 -= arg2 * var9;
                var56 -= arg2 * var10;
                arg2 = 0;
            }
            int var58 = arg6 << 16;
            if (arg0 < 0) {
                var58 -= arg0 * var8;
                arg0 = 0;
            }
            if (var9 >= var10) {
                int var59 = arg4 - arg0;
                int var60 = arg0 - arg2;
                int var61 = this.field263 * arg2;
                while (true) {
                    var60--;
                    if (var60 < 0) {
                        while (true) {
                            var59--;
                            if (var59 < 0) {
                                return;
                            }
                            class516.method2957(var58 >> 16, var61, -120, 0, var57 >> 16, this.field261);
                            var57 += var9;
                            var58 += var8;
                            var61 += this.field263;
                        }
                    }
                    class516.method2957(var56 >> 16, var61, -88, 0, var57 >> 16, this.field261);
                    var61 += this.field263;
                    var56 += var10;
                    var57 += var9;
                }
            } else {
                int var62 = arg4 - arg0;
                int var63 = arg0 - arg2;
                int var64 = this.field263 * arg2;
                while (true) {
                    var63--;
                    if (var63 < 0) {
                        while (true) {
                            var62--;
                            if (var62 < 0) {
                                return;
                            }
                            class516.method2957(var57 >> 16, var64, arg5 ^ 0xE788805A, 0, var58 >> 16, this.field261);
                            var64 += this.field263;
                            var57 += var9;
                            var58 += var8;
                        }
                    }
                    class516.method2957(var57 >> 16, var64, -74, 0, var56 >> 16, this.field261);
                    var57 += var9;
                    var64 += this.field263;
                    var56 += var10;
                }
            }
        }
    }

    @OriginalMember(owner = "client!be", name = "c", descriptor = "(I)V", line = 499)
    public final void method196(int arg0) {
        if (arg0 != -3071) {
            this.method194(-94, -118, 94, 83, (byte) 46);
        }
        field270++;
        int var2 = -1;
        int var3 = this.field261.length - 8;
        while (var3 > var2) {
            var2++;
            this.field261[var2] = 0;
            var2++;
            this.field261[var2] = 0;
            var2++;
            this.field261[var2] = 0;
            var2++;
            this.field261[var2] = 0;
            var2++;
            this.field261[var2] = 0;
            var2++;
            this.field261[var2] = 0;
            var2++;
            this.field261[var2] = 0;
            var2++;
            this.field261[var2] = 0;
        }
        while (var2 < (this.field261.length - 1)) {
            var2++;
            this.field261[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!be", name = "f", descriptor = "(I)V", line = 534)
    public static final void method197(int arg0) {
        class646.field9399 = null;
        if (arg0 == 11161) {
            field267++;
            class279.field3666 = false;
            class562.method3279((byte) -110);
        }
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "(Lbda;II)V", line = 550)
    public class34(class428 arg0, int arg1, int arg2) {
        this.field261 = new byte[arg1 * arg2];
    }
}
