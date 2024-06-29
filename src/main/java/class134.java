import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class134 extends class31 {

    @OriginalMember(owner = "client!tj", name = "D", descriptor = "[B")
    public byte[] field2243;

    @OriginalMember(owner = "client!tj", name = "I", descriptor = "Ls;")
    public static class186 field2248 = new class186(24, -1);

    @OriginalMember(owner = "client!tj", name = "O", descriptor = "Lbj;")
    public static class162 field2253 = new class162(45, 4);

    @OriginalMember(owner = "client!tj", name = "A", descriptor = "I")
    public int field2242;

    @OriginalMember(owner = "client!tj", name = "E", descriptor = "I")
    public int field2244;

    @OriginalMember(owner = "client!tj", name = "F", descriptor = "I")
    public static int field2245;

    @OriginalMember(owner = "client!tj", name = "G", descriptor = "I")
    public static int field2246;

    @OriginalMember(owner = "client!tj", name = "H", descriptor = "I")
    public static int field2247;

    @OriginalMember(owner = "client!tj", name = "J", descriptor = "I")
    public static int field2249;

    @OriginalMember(owner = "client!tj", name = "K", descriptor = "I")
    public static int field2250;

    @OriginalMember(owner = "client!tj", name = "L", descriptor = "I")
    public int field2251;

    @OriginalMember(owner = "client!tj", name = "M", descriptor = "I")
    public int field2252;

    @OriginalMember(owner = "client!tj", name = "P", descriptor = "Lbc;")
    public static class248 field2254;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIIII)V")
    public final void method1020(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field2242 = arg2;
        field2247++;
        this.field2252 = arg0 - arg1;
        this.field2251 = arg3 - arg2;
        if (arg4 != 4) {
            field2248 = null;
        }
        this.field2244 = arg1;
    }

    @OriginalMember(owner = "client!tj", name = "e", descriptor = "(B)V")
    public static void method1021(byte arg0) {
        field2254 = null;
        if (arg0 != -50) {
            field2254 = null;
        }
        field2248 = null;
        field2253 = null;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IBIIIII)V")
    public final void method1022(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2250++;
        int var8 = 0;
        if (arg0 != arg2) {
            var8 = (arg3 - arg5 << 16) / (arg2 - arg0);
        }
        int var9 = 0;
        if (arg2 != arg6) {
            var9 = (arg4 - arg3 << 16) / (arg6 - arg2);
        }
        if (arg1 != 11) {
            return;
        }
        int var10 = 0;
        if (arg0 != arg6) {
            var10 = (arg5 - arg4 << 16) / (arg0 - arg6);
        }
        if (arg0 <= arg2 && arg0 <= arg6) {
            if (arg2 < arg6) {
                int var11;
                int var12 = var11 = arg5 << 16;
                if (arg0 < 0) {
                    var11 -= arg0 * var8;
                    var12 -= arg0 * var10;
                    arg0 = 0;
                }
                int var13 = arg3 << 16;
                if (arg2 < 0) {
                    var13 -= arg2 * var9;
                    arg2 = 0;
                }
                if (arg0 != arg2 && var8 > var10 || arg0 == arg2 && var10 > var9) {
                    int var14 = arg6 - arg2;
                    int var15 = arg2 - arg0;
                    int var16 = this.field2251 * arg0;
                    while (true) {
                        var15--;
                        if (var15 < 0) {
                            while (true) {
                                var14--;
                                if (var14 < 0) {
                                    return;
                                }
                                class210.method1431(0, this.field2243, var12 >> 16, -95, var13 >> 16, var16);
                                var12 += var10;
                                var16 += this.field2251;
                                var13 += var9;
                            }
                        }
                        class210.method1431(0, this.field2243, var12 >> 16, -124, var11 >> 16, var16);
                        var16 += this.field2251;
                        var12 += var10;
                        var11 += var8;
                    }
                } else {
                    int var17 = arg6 - arg2;
                    int var18 = arg2 - arg0;
                    int var19 = this.field2251 * arg0;
                    while (true) {
                        var18--;
                        if (var18 < 0) {
                            while (true) {
                                var17--;
                                if (var17 < 0) {
                                    return;
                                }
                                class210.method1431(0, this.field2243, var13 >> 16, -96, var12 >> 16, var19);
                                var13 += var9;
                                var19 += this.field2251;
                                var12 += var10;
                            }
                        }
                        class210.method1431(0, this.field2243, var11 >> 16, -114, var12 >> 16, var19);
                        var12 += var10;
                        var11 += var8;
                        var19 += this.field2251;
                    }
                }
            } else {
                int var20;
                int var21 = var20 = arg5 << 16;
                if (arg0 < 0) {
                    var20 -= arg0 * var8;
                    var21 -= arg0 * var10;
                    arg0 = 0;
                }
                int var22 = arg4 << 16;
                if (arg6 < 0) {
                    var22 -= arg6 * var9;
                    arg6 = 0;
                }
                if (arg0 != arg6 && var10 < var8 || arg0 == arg6 && var8 < var9) {
                    int var23 = arg2 - arg6;
                    int var24 = arg6 - arg0;
                    int var25 = this.field2251 * arg0;
                    while (true) {
                        var24--;
                        if (var24 < 0) {
                            while (true) {
                                var23--;
                                if (var23 < 0) {
                                    return;
                                }
                                class210.method1431(0, this.field2243, var22 >> 16, -126, var20 >> 16, var25);
                                var22 += var9;
                                var20 += var8;
                                var25 += this.field2251;
                            }
                        }
                        class210.method1431(0, this.field2243, var21 >> 16, -90, var20 >> 16, var25);
                        var25 += this.field2251;
                        var20 += var8;
                        var21 += var10;
                    }
                } else {
                    int var26 = arg2 - arg6;
                    int var27 = arg6 - arg0;
                    int var28 = this.field2251 * arg0;
                    while (true) {
                        var27--;
                        if (var27 < 0) {
                            while (true) {
                                var26--;
                                if (var26 < 0) {
                                    return;
                                }
                                class210.method1431(0, this.field2243, var20 >> 16, -82, var22 >> 16, var28);
                                var28 += this.field2251;
                                var22 += var9;
                                var20 += var8;
                            }
                        }
                        class210.method1431(0, this.field2243, var20 >> 16, arg1 ^ 0xFFFFFF95, var21 >> 16, var28);
                        var28 += this.field2251;
                        var20 += var8;
                        var21 += var10;
                    }
                }
            }
        } else if (arg2 <= arg6) {
            if (arg0 <= arg6) {
                int var29;
                int var30 = var29 = arg3 << 16;
                if (arg2 < 0) {
                    var29 -= arg2 * var9;
                    var30 -= arg2 * var8;
                    arg2 = 0;
                }
                int var31 = arg5 << 16;
                if (arg0 < 0) {
                    var31 -= arg0 * var10;
                    arg0 = 0;
                }
                if (var8 < var9) {
                    int var32 = arg6 - arg0;
                    int var33 = arg0 - arg2;
                    int var34 = this.field2251 * arg2;
                    while (true) {
                        var33--;
                        if (var33 < 0) {
                            while (true) {
                                var32--;
                                if (var32 < 0) {
                                    return;
                                }
                                class210.method1431(0, this.field2243, var31 >> 16, -85, var29 >> 16, var34);
                                var31 += var10;
                                var29 += var9;
                                var34 += this.field2251;
                            }
                        }
                        class210.method1431(0, this.field2243, var30 >> 16, -121, var29 >> 16, var34);
                        var30 += var8;
                        var34 += this.field2251;
                        var29 += var9;
                    }
                } else {
                    int var35 = arg6 - arg0;
                    int var36 = arg0 - arg2;
                    int var37 = this.field2251 * arg2;
                    while (true) {
                        var36--;
                        if (var36 < 0) {
                            while (true) {
                                var35--;
                                if (var35 < 0) {
                                    return;
                                }
                                class210.method1431(0, this.field2243, var29 >> 16, -103, var31 >> 16, var37);
                                var29 += var9;
                                var31 += var10;
                                var37 += this.field2251;
                            }
                        }
                        class210.method1431(0, this.field2243, var29 >> 16, -113, var30 >> 16, var37);
                        var37 += this.field2251;
                        var29 += var9;
                        var30 += var8;
                    }
                }
            } else {
                int var38;
                int var39 = var38 = arg3 << 16;
                if (arg2 < 0) {
                    var39 -= arg2 * var8;
                    var38 -= arg2 * var9;
                    arg2 = 0;
                }
                int var40 = arg4 << 16;
                if (arg6 < 0) {
                    var40 -= arg6 * var10;
                    arg6 = 0;
                }
                if (arg2 != arg6 && var8 < var9 || arg2 == arg6 && var8 > var10) {
                    int var41 = arg0 - arg6;
                    int var42 = arg6 - arg2;
                    int var43 = this.field2251 * arg2;
                    while (true) {
                        var42--;
                        if (var42 < 0) {
                            while (true) {
                                var41--;
                                if (var41 < 0) {
                                    return;
                                }
                                class210.method1431(0, this.field2243, var39 >> 16, arg1 ^ 0xFFFFFF88, var40 >> 16, var43);
                                var40 += var10;
                                var43 += this.field2251;
                                var39 += var8;
                            }
                        }
                        class210.method1431(0, this.field2243, var39 >> 16, -89, var38 >> 16, var43);
                        var39 += var8;
                        var43 += this.field2251;
                        var38 += var9;
                    }
                } else {
                    int var44 = arg0 - arg6;
                    int var45 = arg6 - arg2;
                    int var46 = this.field2251 * arg2;
                    while (true) {
                        var45--;
                        if (var45 < 0) {
                            while (true) {
                                var44--;
                                if (var44 < 0) {
                                    return;
                                }
                                class210.method1431(0, this.field2243, var40 >> 16, -97, var39 >> 16, var46);
                                var39 += var8;
                                var46 += this.field2251;
                                var40 += var10;
                            }
                        }
                        class210.method1431(0, this.field2243, var38 >> 16, -98, var39 >> 16, var46);
                        var39 += var8;
                        var38 += var9;
                        var46 += this.field2251;
                    }
                }
            }
        } else if (arg2 <= arg0) {
            int var47;
            int var48 = var47 = arg4 << 16;
            if (arg6 < 0) {
                var48 -= arg6 * var9;
                var47 -= arg6 * var10;
                arg6 = 0;
            }
            int var49 = arg3 << 16;
            if (arg2 < 0) {
                var49 -= arg2 * var8;
                arg2 = 0;
            }
            if (var9 < var10) {
                int var50 = arg0 - arg2;
                int var51 = arg2 - arg6;
                int var52 = this.field2251 * arg6;
                while (true) {
                    var51--;
                    if (var51 < 0) {
                        while (true) {
                            var50--;
                            if (var50 < 0) {
                                return;
                            }
                            class210.method1431(0, this.field2243, var49 >> 16, -95, var47 >> 16, var52);
                            var52 += this.field2251;
                            var47 += var10;
                            var49 += var8;
                        }
                    }
                    class210.method1431(0, this.field2243, var48 >> 16, -93, var47 >> 16, var52);
                    var47 += var10;
                    var48 += var9;
                    var52 += this.field2251;
                }
            } else {
                int var53 = arg0 - arg2;
                int var54 = arg2 - arg6;
                int var55 = this.field2251 * arg6;
                while (true) {
                    var54--;
                    if (var54 < 0) {
                        while (true) {
                            var53--;
                            if (var53 < 0) {
                                return;
                            }
                            class210.method1431(0, this.field2243, var47 >> 16, -115, var49 >> 16, var55);
                            var49 += var8;
                            var47 += var10;
                            var55 += this.field2251;
                        }
                    }
                    class210.method1431(0, this.field2243, var47 >> 16, -92, var48 >> 16, var55);
                    var48 += var9;
                    var47 += var10;
                    var55 += this.field2251;
                }
            }
        } else {
            int var56;
            int var57 = var56 = arg4 << 16;
            int var58 = arg5 << 16;
            if (arg6 < 0) {
                var57 -= arg6 * var9;
                var56 -= arg6 * var10;
                arg6 = 0;
            }
            if (arg0 < 0) {
                var58 -= arg0 * var8;
                arg0 = 0;
            }
            if (var10 > var9) {
                int var59 = arg2 - arg0;
                int var60 = arg0 - arg6;
                int var61 = this.field2251 * arg6;
                while (true) {
                    var60--;
                    if (var60 < 0) {
                        while (true) {
                            var59--;
                            if (var59 < 0) {
                                return;
                            }
                            class210.method1431(0, this.field2243, var57 >> 16, -91, var58 >> 16, var61);
                            var58 += var8;
                            var57 += var9;
                            var61 += this.field2251;
                        }
                    }
                    class210.method1431(0, this.field2243, var57 >> 16, -86, var56 >> 16, var61);
                    var56 += var10;
                    var61 += this.field2251;
                    var57 += var9;
                }
            } else {
                int var62 = arg2 - arg0;
                int var63 = arg0 - arg6;
                int var64 = this.field2251 * arg6;
                while (true) {
                    var63--;
                    if (var63 < 0) {
                        while (true) {
                            var62--;
                            if (var62 < 0) {
                                return;
                            }
                            class210.method1431(0, this.field2243, var58 >> 16, -85, var57 >> 16, var64);
                            var64 += this.field2251;
                            var58 += var8;
                            var57 += var9;
                        }
                    }
                    class210.method1431(0, this.field2243, var56 >> 16, arg1 ^ 0xFFFFFFAC, var57 >> 16, var64);
                    var56 += var10;
                    var64 += this.field2251;
                    var57 += var9;
                }
            }
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIZ)Z")
    public final boolean method1023(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            this.method1022(-43, (byte) 34, 51, 86, -31, -7, -8);
        }
        field2246++;
        return (arg0 * arg1) <= this.field2243.length;
    }

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(II)V")
    public static final void method1024(int arg0, int arg1) {
        class234 var2 = class518.field7511[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class234 var4 = class518.field7511[var3][arg0][arg1] = class518.field7511[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field3623--;
                for (class440 var5 = var4.field3607; var5 != null; var5 = var5.field6528) {
                    class402 var6 = var5.field6530;
                    if (var6.field6082 == arg0 && var6.field6077 == arg1) {
                        var6.field6084--;
                    }
                }
            }
        }
        if (class518.field7511[0][arg0][arg1] == null) {
            class518.field7511[0][arg0][arg1] = new class234(0, arg0, arg1);
            class518.field7511[0][arg0][arg1].field3600 = 1;
        }
        class518.field7511[0][arg0][arg1].field3621 = var2;
        class518.field7511[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "(I)V")
    public final void method1025(int arg0) {
        field2249++;
        int var2 = -1;
        if (arg0 != 0) {
            this.method1025(127);
        }
        int var3 = this.field2243.length - 8;
        while (var2 < var3) {
            var2++;
            this.field2243[var2] = 0;
            var2++;
            this.field2243[var2] = 0;
            var2++;
            this.field2243[var2] = 0;
            var2++;
            this.field2243[var2] = 0;
            var2++;
            this.field2243[var2] = 0;
            var2++;
            this.field2243[var2] = 0;
            var2++;
            this.field2243[var2] = 0;
            var2++;
            this.field2243[var2] = 0;
        }
        while (this.field2243.length - 1 > var2) {
            var2++;
            this.field2243[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!tj", name = "<init>", descriptor = "(Lda;II)V")
    public class134(class44 arg0, int arg1, int arg2) {
        this.field2243 = new byte[arg1 * arg2];
    }
}
