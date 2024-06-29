import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class100 extends class119 {

    @OriginalMember(owner = "client!ok", name = "A", descriptor = "[B")
    public byte[] field1351;

    @OriginalMember(owner = "client!ok", name = "x", descriptor = "Lae;")
    public static class40 field1348 = new class40();

    @OriginalMember(owner = "client!ok", name = "w", descriptor = "I")
    public int field1347;

    @OriginalMember(owner = "client!ok", name = "y", descriptor = "I")
    public int field1349;

    @OriginalMember(owner = "client!ok", name = "z", descriptor = "I")
    public static int field1350;

    @OriginalMember(owner = "client!ok", name = "B", descriptor = "I")
    public int field1352;

    @OriginalMember(owner = "client!ok", name = "D", descriptor = "I")
    public static int field1354;

    @OriginalMember(owner = "client!ok", name = "E", descriptor = "I")
    public static int field1355;

    @OriginalMember(owner = "client!ok", name = "F", descriptor = "I")
    public static int field1356;

    @OriginalMember(owner = "client!ok", name = "G", descriptor = "I")
    public static int field1357;

    @OriginalMember(owner = "client!ok", name = "I", descriptor = "I")
    public static int field1359;

    @OriginalMember(owner = "client!ok", name = "J", descriptor = "I")
    public int field1360;

    @OriginalMember(owner = "client!ok", name = "C", descriptor = "Z")
    public static boolean field1353;

    @OriginalMember(owner = "client!ok", name = "H", descriptor = "[I")
    public static int[] field1358;

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(B)V")
    public static void method568(byte arg0) {
        field1348 = null;
        int var1 = 67 / ((arg0 + 51) / 58);
        field1358 = null;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIIII)V")
    public final void method569(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1350++;
        if (arg2 == 1831282672) {
            this.field1347 = arg4 - arg3;
            this.field1360 = arg0 - arg1;
            this.field1352 = arg1;
            this.field1349 = arg3;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(III)Z")
    public final boolean method570(int arg0, int arg1, int arg2) {
        field1359++;
        if (arg1 > -5) {
            return true;
        } else {
            return this.field1351.length >= arg0 * arg2;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lpl;Lpl;II)V")
    public static final void method571(class612 arg0, class612 arg1, int arg2, int arg3) {
        class563.field7827 = arg1;
        int var4 = -16 / ((arg3 + 37) / 41);
        class663.field9374 = arg0;
        field1354++;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIIIIII)V")
    public final void method572(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1356++;
        int var8 = 0;
        if (arg2 != arg6) {
            var8 = (arg5 - arg4 << 16) / (arg6 - arg2);
        }
        if (arg1 != -3417) {
            field1357 = 65;
        }
        int var9 = 0;
        if (arg3 != arg6) {
            var9 = (arg0 - arg5 << 16) / (arg3 - arg6);
        }
        int var10 = 0;
        if (arg2 != arg3) {
            var10 = (arg4 - arg0 << 16) / (arg2 - arg3);
        }
        if (arg2 <= arg6 && arg2 <= arg3) {
            if (arg6 >= arg3) {
                int var11;
                int var12 = var11 = arg4 << 16;
                int var13 = arg0 << 16;
                if (arg2 < 0) {
                    var11 -= arg2 * var8;
                    var12 -= arg2 * var10;
                    arg2 = 0;
                }
                if (arg3 < 0) {
                    var13 -= arg3 * var9;
                    arg3 = 0;
                }
                if ((arg2 == arg3 || var8 <= var10) && (arg2 != arg3 || var8 >= var9)) {
                    int var17 = arg6 - arg3;
                    int var18 = arg3 - arg2;
                    int var19 = this.field1347 * arg2;
                    while (true) {
                        var18--;
                        if (var18 < 0) {
                            while (true) {
                                var17--;
                                if (var17 < 0) {
                                    return;
                                }
                                class242.method1444(var13 >> 16, 0, var19, true, var11 >> 16, this.field1351);
                                var11 += var8;
                                var19 += this.field1347;
                                var13 += var9;
                            }
                        }
                        class242.method1444(var12 >> 16, 0, var19, true, var11 >> 16, this.field1351);
                        var11 += var8;
                        var19 += this.field1347;
                        var12 += var10;
                    }
                } else {
                    int var14 = arg6 - arg3;
                    int var15 = arg3 - arg2;
                    int var16 = this.field1347 * arg2;
                    while (true) {
                        var15--;
                        if (var15 < 0) {
                            while (true) {
                                var14--;
                                if (var14 < 0) {
                                    return;
                                }
                                class242.method1444(var11 >> 16, 0, var16, true, var13 >> 16, this.field1351);
                                var11 += var8;
                                var13 += var9;
                                var16 += this.field1347;
                            }
                        }
                        class242.method1444(var11 >> 16, 0, var16, true, var12 >> 16, this.field1351);
                        var16 += this.field1347;
                        var11 += var8;
                        var12 += var10;
                    }
                }
            } else {
                int var20;
                int var21 = var20 = arg4 << 16;
                if (arg2 < 0) {
                    var20 -= arg2 * var8;
                    var21 -= arg2 * var10;
                    arg2 = 0;
                }
                int var22 = arg5 << 16;
                if (arg6 < 0) {
                    var22 -= arg6 * var9;
                    arg6 = 0;
                }
                if (arg2 != arg6 && var10 < var8 || arg2 == arg6 && var9 < var10) {
                    int var23 = arg3 - arg6;
                    int var24 = arg6 - arg2;
                    int var25 = this.field1347 * arg2;
                    while (true) {
                        var24--;
                        if (var24 < 0) {
                            while (true) {
                                var23--;
                                if (var23 < 0) {
                                    return;
                                }
                                class242.method1444(var22 >> 16, 0, var25, true, var21 >> 16, this.field1351);
                                var22 += var9;
                                var25 += this.field1347;
                                var21 += var10;
                            }
                        }
                        class242.method1444(var20 >> 16, 0, var25, true, var21 >> 16, this.field1351);
                        var21 += var10;
                        var25 += this.field1347;
                        var20 += var8;
                    }
                } else {
                    int var26 = arg3 - arg6;
                    int var27 = arg6 - arg2;
                    int var28 = this.field1347 * arg2;
                    while (true) {
                        var27--;
                        if (var27 < 0) {
                            while (true) {
                                var26--;
                                if (var26 < 0) {
                                    return;
                                }
                                class242.method1444(var21 >> 16, 0, var28, true, var22 >> 16, this.field1351);
                                var21 += var10;
                                var28 += this.field1347;
                                var22 += var9;
                            }
                        }
                        class242.method1444(var21 >> 16, 0, var28, true, var20 >> 16, this.field1351);
                        var21 += var10;
                        var20 += var8;
                        var28 += this.field1347;
                    }
                }
            }
        } else if (arg6 <= arg3) {
            if (arg3 < arg2) {
                int var29;
                int var30 = var29 = arg5 << 16;
                int var31 = arg0 << 16;
                if (arg6 < 0) {
                    var29 -= arg6 * var9;
                    var30 -= arg6 * var8;
                    arg6 = 0;
                }
                if (arg3 < 0) {
                    var31 -= arg3 * var10;
                    arg3 = 0;
                }
                if (arg3 != arg6 && var9 > var8 || arg3 == arg6 && var10 < var8) {
                    int var32 = arg2 - arg3;
                    int var33 = arg3 - arg6;
                    int var34 = this.field1347 * arg6;
                    while (true) {
                        var33--;
                        if (var33 < 0) {
                            while (true) {
                                var32--;
                                if (var32 < 0) {
                                    return;
                                }
                                class242.method1444(var31 >> 16, 0, var34, true, var30 >> 16, this.field1351);
                                var34 += this.field1347;
                                var30 += var8;
                                var31 += var10;
                            }
                        }
                        class242.method1444(var29 >> 16, 0, var34, true, var30 >> 16, this.field1351);
                        var34 += this.field1347;
                        var30 += var8;
                        var29 += var9;
                    }
                } else {
                    int var35 = arg2 - arg3;
                    int var36 = arg3 - arg6;
                    int var37 = this.field1347 * arg6;
                    while (true) {
                        var36--;
                        if (var36 < 0) {
                            while (true) {
                                var35--;
                                if (var35 < 0) {
                                    return;
                                }
                                class242.method1444(var30 >> 16, 0, var37, true, var31 >> 16, this.field1351);
                                var31 += var10;
                                var37 += this.field1347;
                                var30 += var8;
                            }
                        }
                        class242.method1444(var30 >> 16, 0, var37, true, var29 >> 16, this.field1351);
                        var30 += var8;
                        var37 += this.field1347;
                        var29 += var9;
                    }
                }
            } else {
                int var38;
                int var39 = var38 = arg5 << 16;
                if (arg6 < 0) {
                    var39 -= arg6 * var8;
                    var38 -= arg6 * var9;
                    arg6 = 0;
                }
                int var40 = arg4 << 16;
                if (arg2 < 0) {
                    var40 -= arg2 * var10;
                    arg2 = 0;
                }
                if (var8 >= var9) {
                    int var41 = arg3 - arg2;
                    int var42 = arg2 - arg6;
                    int var43 = this.field1347 * arg6;
                    while (true) {
                        var42--;
                        if (var42 < 0) {
                            while (true) {
                                var41--;
                                if (var41 < 0) {
                                    return;
                                }
                                class242.method1444(var40 >> 16, 0, var43, true, var38 >> 16, this.field1351);
                                var43 += this.field1347;
                                var40 += var10;
                                var38 += var9;
                            }
                        }
                        class242.method1444(var39 >> 16, 0, var43, true, var38 >> 16, this.field1351);
                        var38 += var9;
                        var43 += this.field1347;
                        var39 += var8;
                    }
                } else {
                    int var44 = arg3 - arg2;
                    int var45 = arg2 - arg6;
                    int var46 = this.field1347 * arg6;
                    while (true) {
                        var45--;
                        if (var45 < 0) {
                            while (true) {
                                var44--;
                                if (var44 < 0) {
                                    return;
                                }
                                class242.method1444(var38 >> 16, 0, var46, true, var40 >> 16, this.field1351);
                                var40 += var10;
                                var46 += this.field1347;
                                var38 += var9;
                            }
                        }
                        class242.method1444(var38 >> 16, 0, var46, true, var39 >> 16, this.field1351);
                        var39 += var8;
                        var38 += var9;
                        var46 += this.field1347;
                    }
                }
            }
        } else if (arg2 >= arg6) {
            int var47;
            int var48 = var47 = arg0 << 16;
            int var49 = arg5 << 16;
            if (arg3 < 0) {
                var48 -= arg3 * var9;
                var47 -= arg3 * var10;
                arg3 = 0;
            }
            if (arg6 < 0) {
                var49 -= arg6 * var8;
                arg6 = 0;
            }
            if (var9 < var10) {
                int var50 = arg2 - arg6;
                int var51 = arg6 - arg3;
                int var52 = this.field1347 * arg3;
                while (true) {
                    var51--;
                    if (var51 < 0) {
                        while (true) {
                            var50--;
                            if (var50 < 0) {
                                return;
                            }
                            class242.method1444(var47 >> 16, 0, var52, true, var49 >> 16, this.field1351);
                            var49 += var8;
                            var52 += this.field1347;
                            var47 += var10;
                        }
                    }
                    class242.method1444(var47 >> 16, 0, var52, true, var48 >> 16, this.field1351);
                    var48 += var9;
                    var47 += var10;
                    var52 += this.field1347;
                }
            } else {
                int var53 = arg2 - arg6;
                int var54 = arg6 - arg3;
                int var55 = this.field1347 * arg3;
                while (true) {
                    var54--;
                    if (var54 < 0) {
                        while (true) {
                            var53--;
                            if (var53 < 0) {
                                return;
                            }
                            class242.method1444(var49 >> 16, 0, var55, true, var47 >> 16, this.field1351);
                            var55 += this.field1347;
                            var49 += var8;
                            var47 += var10;
                        }
                    }
                    class242.method1444(var48 >> 16, 0, var55, true, var47 >> 16, this.field1351);
                    var48 += var9;
                    var55 += this.field1347;
                    var47 += var10;
                }
            }
        } else {
            int var56;
            int var57 = var56 = arg0 << 16;
            int var58 = arg4 << 16;
            if (arg3 < 0) {
                var56 -= arg3 * var10;
                var57 -= arg3 * var9;
                arg3 = 0;
            }
            if (arg2 < 0) {
                var58 -= arg2 * var8;
                arg2 = 0;
            }
            if (var9 < var10) {
                int var59 = arg6 - arg2;
                int var60 = arg2 - arg3;
                int var61 = this.field1347 * arg3;
                while (true) {
                    var60--;
                    if (var60 < 0) {
                        while (true) {
                            var59--;
                            if (var59 < 0) {
                                return;
                            }
                            class242.method1444(var58 >> 16, 0, var61, true, var57 >> 16, this.field1351);
                            var57 += var9;
                            var61 += this.field1347;
                            var58 += var8;
                        }
                    }
                    class242.method1444(var56 >> 16, 0, var61, true, var57 >> 16, this.field1351);
                    var57 += var9;
                    var56 += var10;
                    var61 += this.field1347;
                }
            } else {
                int var62 = arg6 - arg2;
                int var63 = arg2 - arg3;
                int var64 = this.field1347 * arg3;
                while (true) {
                    var63--;
                    if (var63 < 0) {
                        while (true) {
                            var62--;
                            if (var62 < 0) {
                                return;
                            }
                            class242.method1444(var57 >> 16, 0, var64, true, var58 >> 16, this.field1351);
                            var58 += var8;
                            var57 += var9;
                            var64 += this.field1347;
                        }
                    }
                    class242.method1444(var57 >> 16, 0, var64, true, var56 >> 16, this.field1351);
                    var64 += this.field1347;
                    var56 += var10;
                    var57 += var9;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ok", name = "i", descriptor = "(I)V")
    public final void method573(int arg0) {
        field1355++;
        int var2 = -1;
        if (arg0 <= 23) {
            method568((byte) -43);
        }
        int var3 = this.field1351.length - 8;
        while (var3 > var2) {
            var2++;
            this.field1351[var2] = 0;
            var2++;
            this.field1351[var2] = 0;
            var2++;
            this.field1351[var2] = 0;
            var2++;
            this.field1351[var2] = 0;
            var2++;
            this.field1351[var2] = 0;
            var2++;
            this.field1351[var2] = 0;
            var2++;
            this.field1351[var2] = 0;
            var2++;
            this.field1351[var2] = 0;
        }
        while ((this.field1351.length - 1) > var2) {
            var2++;
            this.field1351[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!ok", name = "<init>", descriptor = "(Len;II)V")
    public class100(class478 arg0, int arg1, int arg2) {
        this.field1351 = new byte[arg1 * arg2];
    }
}
