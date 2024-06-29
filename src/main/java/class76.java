import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public class class76 extends class377 {

    @OriginalMember(owner = "client!co", name = "z", descriptor = "[B")
    public byte[] field1267;

    @OriginalMember(owner = "client!co", name = "D", descriptor = "[B")
    public static byte[] field1271 = new byte[16384];

    @OriginalMember(owner = "client!co", name = "G", descriptor = "[I")
    public static int[] field1274 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!co", name = "x", descriptor = "I")
    public int field1265;

    @OriginalMember(owner = "client!co", name = "y", descriptor = "I")
    public int field1266;

    @OriginalMember(owner = "client!co", name = "A", descriptor = "I")
    public int field1268;

    @OriginalMember(owner = "client!co", name = "B", descriptor = "I")
    public int field1269;

    @OriginalMember(owner = "client!co", name = "E", descriptor = "I")
    public static int field1272;

    @OriginalMember(owner = "client!co", name = "F", descriptor = "I")
    public static int field1273;

    @OriginalMember(owner = "client!co", name = "H", descriptor = "I")
    public static int field1275;

    @OriginalMember(owner = "client!co", name = "I", descriptor = "I")
    public static int field1276;

    @OriginalMember(owner = "client!co", name = "J", descriptor = "I")
    public static int field1277;

    @OriginalMember(owner = "client!co", name = "C", descriptor = "Lbu;")
    public static class17 field1270;

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(IIIII)V", line = 3)
    public final void method605(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 != 0) {
            return;
        }
        this.field1269 = arg2;
        this.field1266 = arg0;
        this.field1268 = arg3 - arg0;
        field1275++;
        this.field1265 = arg4 - arg2;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(III)Z", line = 22)
    public final boolean method606(int arg0, int arg1, int arg2) {
        field1273++;
        if (arg1 == 0) {
            return this.field1267.length >= arg0 * arg2;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(B)V", line = 45)
    public static void method607(byte arg0) {
        field1274 = null;
        field1271 = null;
        field1270 = null;
        if (arg0 != 14) {
            method607((byte) 122);
        }
    }

    @OriginalMember(owner = "client!co", name = "d", descriptor = "(B)V", line = 58)
    public final void method608(byte arg0) {
        field1276++;
        int var2 = 49 % ((-arg0 - 14) / 53);
        int var3 = -1;
        int var4 = this.field1267.length - 8;
        while (var3 < var4) {
            var3++;
            this.field1267[var3] = 0;
            var3++;
            this.field1267[var3] = 0;
            var3++;
            this.field1267[var3] = 0;
            var3++;
            this.field1267[var3] = 0;
            var3++;
            this.field1267[var3] = 0;
            var3++;
            this.field1267[var3] = 0;
            var3++;
            this.field1267[var3] = 0;
            var3++;
            this.field1267[var3] = 0;
        }
        while ((this.field1267.length - 1) > var3) {
            var3++;
            this.field1267[var3] = 0;
        }
    }

    @OriginalMember(owner = "client!co", name = "<init>", descriptor = "(Lvj;II)V", line = 94)
    public class76(class303 arg0, int arg1, int arg2) {
        this.field1267 = new byte[arg1 * arg2];
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(IIIIIBI)V", line = 106)
    public final void method609(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        if (arg5 != 31) {
            field1274 = null;
        }
        field1272++;
        int var8 = 0;
        if (arg1 != arg3) {
            var8 = (arg4 - arg6 << 16) / (arg1 - arg3);
        }
        int var9 = 0;
        if (arg0 != arg1) {
            var9 = (arg2 - arg4 << 16) / (arg0 - arg1);
        }
        int var10 = 0;
        if (arg0 != arg3) {
            var10 = (arg6 - arg2 << 16) / (arg3 - arg0);
        }
        if (arg1 >= arg3 && arg3 <= arg0) {
            if (arg0 > arg1) {
                int var11;
                int var12 = var11 = arg6 << 16;
                if (arg3 < 0) {
                    var12 -= arg3 * var10;
                    var11 -= arg3 * var8;
                    arg3 = 0;
                }
                int var13 = arg4 << 16;
                if (arg1 < 0) {
                    var13 -= arg1 * var9;
                    arg1 = 0;
                }
                if (arg1 != arg3 && var8 > var10 || arg1 == arg3 && var10 > var9) {
                    int var14 = arg0 - arg1;
                    int var15 = arg1 - arg3;
                    int var16 = this.field1268 * arg3;
                    while (true) {
                        var15--;
                        if (var15 < 0) {
                            while (true) {
                                var14--;
                                if (var14 < 0) {
                                    return;
                                }
                                class392.method2425((byte) 86, var12 >> 16, this.field1267, 0, var16, var13 >> 16);
                                var13 += var9;
                                var16 += this.field1268;
                                var12 += var10;
                            }
                        }
                        class392.method2425((byte) 86, var12 >> 16, this.field1267, 0, var16, var11 >> 16);
                        var16 += this.field1268;
                        var11 += var8;
                        var12 += var10;
                    }
                } else {
                    int var17 = arg0 - arg1;
                    int var18 = arg1 - arg3;
                    int var19 = this.field1268 * arg3;
                    while (true) {
                        var18--;
                        if (var18 < 0) {
                            while (true) {
                                var17--;
                                if (var17 < 0) {
                                    return;
                                }
                                class392.method2425((byte) 86, var13 >> 16, this.field1267, 0, var19, var12 >> 16);
                                var19 += this.field1268;
                                var12 += var10;
                                var13 += var9;
                            }
                        }
                        class392.method2425((byte) 86, var11 >> 16, this.field1267, 0, var19, var12 >> 16);
                        var12 += var10;
                        var19 += this.field1268;
                        var11 += var8;
                    }
                }
            } else {
                int var20;
                int var21 = var20 = arg6 << 16;
                if (arg3 < 0) {
                    var21 -= arg3 * var10;
                    var20 -= arg3 * var8;
                    arg3 = 0;
                }
                int var22 = arg2 << 16;
                if (arg0 < 0) {
                    var22 -= arg0 * var9;
                    arg0 = 0;
                }
                if (arg0 != arg3 && var10 < var8 || arg0 == arg3 && var9 > var8) {
                    int var23 = arg1 - arg0;
                    int var24 = arg0 - arg3;
                    int var25 = this.field1268 * arg3;
                    while (true) {
                        var24--;
                        if (var24 < 0) {
                            while (true) {
                                var23--;
                                if (var23 < 0) {
                                    return;
                                }
                                class392.method2425((byte) 86, var22 >> 16, this.field1267, 0, var25, var20 >> 16);
                                var20 += var8;
                                var25 += this.field1268;
                                var22 += var9;
                            }
                        }
                        class392.method2425((byte) 86, var21 >> 16, this.field1267, 0, var25, var20 >> 16);
                        var20 += var8;
                        var25 += this.field1268;
                        var21 += var10;
                    }
                } else {
                    int var26 = arg1 - arg0;
                    int var27 = arg0 - arg3;
                    int var28 = this.field1268 * arg3;
                    while (true) {
                        var27--;
                        if (var27 < 0) {
                            while (true) {
                                var26--;
                                if (var26 < 0) {
                                    return;
                                }
                                class392.method2425((byte) 86, var20 >> 16, this.field1267, 0, var28, var22 >> 16);
                                var22 += var9;
                                var20 += var8;
                                var28 += this.field1268;
                            }
                        }
                        class392.method2425((byte) 86, var20 >> 16, this.field1267, 0, var28, var21 >> 16);
                        var28 += this.field1268;
                        var21 += var10;
                        var20 += var8;
                    }
                }
            }
        } else if (arg0 >= arg1) {
            if (arg3 <= arg0) {
                int var29;
                int var30 = var29 = arg4 << 16;
                int var31 = arg6 << 16;
                if (arg1 < 0) {
                    var30 -= arg1 * var8;
                    var29 -= arg1 * var9;
                    arg1 = 0;
                }
                if (arg3 < 0) {
                    var31 -= arg3 * var10;
                    arg3 = 0;
                }
                if (var8 >= var9) {
                    int var32 = arg0 - arg3;
                    int var33 = arg3 - arg1;
                    int var34 = this.field1268 * arg1;
                    while (true) {
                        var33--;
                        if (var33 < 0) {
                            while (true) {
                                var32--;
                                if (var32 < 0) {
                                    return;
                                }
                                class392.method2425((byte) 86, var29 >> 16, this.field1267, 0, var34, var31 >> 16);
                                var34 += this.field1268;
                                var29 += var9;
                                var31 += var10;
                            }
                        }
                        class392.method2425((byte) 86, var29 >> 16, this.field1267, 0, var34, var30 >> 16);
                        var30 += var8;
                        var29 += var9;
                        var34 += this.field1268;
                    }
                } else {
                    int var35 = arg0 - arg3;
                    int var36 = arg3 - arg1;
                    int var37 = this.field1268 * arg1;
                    while (true) {
                        var36--;
                        if (var36 < 0) {
                            while (true) {
                                var35--;
                                if (var35 < 0) {
                                    return;
                                }
                                class392.method2425((byte) 86, var31 >> 16, this.field1267, 0, var37, var29 >> 16);
                                var37 += this.field1268;
                                var29 += var9;
                                var31 += var10;
                            }
                        }
                        class392.method2425((byte) 86, var30 >> 16, this.field1267, 0, var37, var29 >> 16);
                        var30 += var8;
                        var37 += this.field1268;
                        var29 += var9;
                    }
                }
            } else {
                int var38;
                int var39 = var38 = arg4 << 16;
                if (arg1 < 0) {
                    var39 -= arg1 * var8;
                    var38 -= arg1 * var9;
                    arg1 = 0;
                }
                int var40 = arg2 << 16;
                if (arg0 < 0) {
                    var40 -= arg0 * var10;
                    arg0 = 0;
                }
                if (arg0 != arg1 && var9 > var8 || arg0 == arg1 && var8 > var10) {
                    int var41 = arg3 - arg0;
                    int var42 = arg0 - arg1;
                    int var43 = this.field1268 * arg1;
                    while (true) {
                        var42--;
                        if (var42 < 0) {
                            while (true) {
                                var41--;
                                if (var41 < 0) {
                                    return;
                                }
                                class392.method2425((byte) 86, var39 >> 16, this.field1267, 0, var43, var40 >> 16);
                                var39 += var8;
                                var40 += var10;
                                var43 += this.field1268;
                            }
                        }
                        class392.method2425((byte) 86, var39 >> 16, this.field1267, 0, var43, var38 >> 16);
                        var39 += var8;
                        var38 += var9;
                        var43 += this.field1268;
                    }
                } else {
                    int var44 = arg3 - arg0;
                    int var45 = arg0 - arg1;
                    int var46 = this.field1268 * arg1;
                    while (true) {
                        var45--;
                        if (var45 < 0) {
                            while (true) {
                                var44--;
                                if (var44 < 0) {
                                    return;
                                }
                                class392.method2425((byte) 86, var40 >> 16, this.field1267, 0, var46, var39 >> 16);
                                var39 += var8;
                                var46 += this.field1268;
                                var40 += var10;
                            }
                        }
                        class392.method2425((byte) 86, var38 >> 16, this.field1267, 0, var46, var39 >> 16);
                        var38 += var9;
                        var39 += var8;
                        var46 += this.field1268;
                    }
                }
            }
        } else if (arg1 > arg3) {
            int var47;
            int var48 = var47 = arg2 << 16;
            if (arg0 < 0) {
                var48 -= arg0 * var9;
                var47 -= arg0 * var10;
                arg0 = 0;
            }
            int var49 = arg6 << 16;
            if (arg3 < 0) {
                var49 -= arg3 * var8;
                arg3 = 0;
            }
            if (var9 < var10) {
                int var50 = arg1 - arg3;
                int var51 = arg3 - arg0;
                int var52 = this.field1268 * arg0;
                while (true) {
                    var51--;
                    if (var51 < 0) {
                        while (true) {
                            var50--;
                            if (var50 < 0) {
                                return;
                            }
                            class392.method2425((byte) 86, var48 >> 16, this.field1267, 0, var52, var49 >> 16);
                            var48 += var9;
                            var52 += this.field1268;
                            var49 += var8;
                        }
                    }
                    class392.method2425((byte) 86, var48 >> 16, this.field1267, 0, var52, var47 >> 16);
                    var52 += this.field1268;
                    var47 += var10;
                    var48 += var9;
                }
            } else {
                int var53 = arg1 - arg3;
                int var54 = arg3 - arg0;
                int var55 = this.field1268 * arg0;
                while (true) {
                    var54--;
                    if (var54 < 0) {
                        while (true) {
                            var53--;
                            if (var53 < 0) {
                                return;
                            }
                            class392.method2425((byte) 86, var49 >> 16, this.field1267, 0, var55, var48 >> 16);
                            var48 += var9;
                            var49 += var8;
                            var55 += this.field1268;
                        }
                    }
                    class392.method2425((byte) 86, var47 >> 16, this.field1267, 0, var55, var48 >> 16);
                    var55 += this.field1268;
                    var47 += var10;
                    var48 += var9;
                }
            }
        } else {
            int var56;
            int var57 = var56 = arg2 << 16;
            if (arg0 < 0) {
                var56 -= arg0 * var10;
                var57 -= arg0 * var9;
                arg0 = 0;
            }
            int var58 = arg4 << 16;
            if (arg1 < 0) {
                var58 -= arg1 * var8;
                arg1 = 0;
            }
            if (var9 >= var10) {
                int var59 = arg3 - arg1;
                int var60 = arg1 - arg0;
                int var61 = this.field1268 * arg0;
                while (true) {
                    var60--;
                    if (var60 < 0) {
                        while (true) {
                            var59--;
                            if (var59 < 0) {
                                return;
                            }
                            class392.method2425((byte) 86, var56 >> 16, this.field1267, 0, var61, var58 >> 16);
                            var56 += var10;
                            var61 += this.field1268;
                            var58 += var8;
                        }
                    }
                    class392.method2425((byte) 86, var56 >> 16, this.field1267, 0, var61, var57 >> 16);
                    var57 += var9;
                    var61 += this.field1268;
                    var56 += var10;
                }
            } else {
                int var62 = arg3 - arg1;
                int var63 = arg1 - arg0;
                int var64 = this.field1268 * arg0;
                while (true) {
                    var63--;
                    if (var63 < 0) {
                        while (true) {
                            var62--;
                            if (var62 < 0) {
                                return;
                            }
                            class392.method2425((byte) 86, var58 >> 16, this.field1267, 0, var64, var56 >> 16);
                            var58 += var8;
                            var64 += this.field1268;
                            var56 += var10;
                        }
                    }
                    class392.method2425((byte) 86, var57 >> 16, this.field1267, 0, var64, var56 >> 16);
                    var56 += var10;
                    var57 += var9;
                    var64 += this.field1268;
                }
            }
        }
    }
}
