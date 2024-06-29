import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class111 extends class196 {

    @OriginalMember(owner = "client!hk", name = "G", descriptor = "[B")
    public byte[] field1397;

    @OriginalMember(owner = "client!hk", name = "D", descriptor = "Lhj;")
    public static class596 field1394 = new class596(82, -1);

    @OriginalMember(owner = "client!hk", name = "F", descriptor = "[Z")
    public static boolean[] field1396 = new boolean[200];

    @OriginalMember(owner = "client!hk", name = "K", descriptor = "Lhj;")
    public static class596 field1401 = new class596(17, 6);

    @OriginalMember(owner = "client!hk", name = "L", descriptor = "[[I")
    public static int[][] field1402 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

    @OriginalMember(owner = "client!hk", name = "N", descriptor = "Ltu;")
    public static class369 field1404 = new class369(1);

    @OriginalMember(owner = "client!hk", name = "A", descriptor = "I")
    public int field1391;

    @OriginalMember(owner = "client!hk", name = "B", descriptor = "I")
    public int field1392;

    @OriginalMember(owner = "client!hk", name = "C", descriptor = "I")
    public static int field1393;

    @OriginalMember(owner = "client!hk", name = "E", descriptor = "I")
    public static int field1395;

    @OriginalMember(owner = "client!hk", name = "H", descriptor = "I")
    public int field1398;

    @OriginalMember(owner = "client!hk", name = "I", descriptor = "I")
    public int field1399;

    @OriginalMember(owner = "client!hk", name = "J", descriptor = "I")
    public static int field1400;

    @OriginalMember(owner = "client!hk", name = "M", descriptor = "I")
    public static int field1403;

    @OriginalMember(owner = "client!hk", name = "O", descriptor = "I")
    public static int field1405;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIIIIBI)V", line = 6)
    public final void method887(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        int var8 = -32 % ((arg5 - 45) / 42);
        field1403++;
        int var9 = 0;
        if (arg2 != arg6) {
            var9 = (arg0 - arg3 << 16) / (arg6 - arg2);
        }
        int var10 = 0;
        if (arg4 != arg6) {
            var10 = (arg1 - arg0 << 16) / (arg4 - arg6);
        }
        int var11 = 0;
        if (arg2 != arg4) {
            var11 = (arg3 - arg1 << 16) / (arg2 - arg4);
        }
        if (arg2 <= arg6 && arg2 <= arg4) {
            if (arg6 < arg4) {
                int var12;
                int var13 = var12 = arg3 << 16;
                if (arg2 < 0) {
                    var13 -= arg2 * var11;
                    var12 -= arg2 * var9;
                    arg2 = 0;
                }
                int var14 = arg0 << 16;
                if (arg6 < 0) {
                    var14 -= arg6 * var10;
                    arg6 = 0;
                }
                if ((arg2 == arg6 || var11 >= var9) && (arg2 != arg6 || var11 <= var10)) {
                    int var18 = arg4 - arg6;
                    int var19 = arg6 - arg2;
                    int var20 = this.field1399 * arg2;
                    while (true) {
                        var19--;
                        if (var19 < 0) {
                            while (true) {
                                var18--;
                                if (var18 < 0) {
                                    return;
                                }
                                class297.method1735(0, this.field1397, var20, var13 >> 16, (byte) 42, var14 >> 16);
                                var20 += this.field1399;
                                var14 += var10;
                                var13 += var11;
                            }
                        }
                        class297.method1735(0, this.field1397, var20, var13 >> 16, (byte) 42, var12 >> 16);
                        var20 += this.field1399;
                        var13 += var11;
                        var12 += var9;
                    }
                } else {
                    int var15 = arg4 - arg6;
                    int var16 = arg6 - arg2;
                    int var17 = this.field1399 * arg2;
                    while (true) {
                        var16--;
                        if (var16 < 0) {
                            while (true) {
                                var15--;
                                if (var15 < 0) {
                                    return;
                                }
                                class297.method1735(0, this.field1397, var17, var14 >> 16, (byte) 42, var13 >> 16);
                                var17 += this.field1399;
                                var13 += var11;
                                var14 += var10;
                            }
                        }
                        class297.method1735(0, this.field1397, var17, var12 >> 16, (byte) 42, var13 >> 16);
                        var13 += var11;
                        var12 += var9;
                        var17 += this.field1399;
                    }
                }
            } else {
                int var21;
                int var22 = var21 = arg3 << 16;
                int var23 = arg1 << 16;
                if (arg2 < 0) {
                    var21 -= arg2 * var9;
                    var22 -= arg2 * var11;
                    arg2 = 0;
                }
                if (arg4 < 0) {
                    var23 -= arg4 * var10;
                    arg4 = 0;
                }
                if (arg2 != arg4 && var11 < var9 || arg2 == arg4 && var10 > var9) {
                    int var24 = arg6 - arg4;
                    int var25 = arg4 - arg2;
                    int var26 = this.field1399 * arg2;
                    while (true) {
                        var25--;
                        if (var25 < 0) {
                            while (true) {
                                var24--;
                                if (var24 < 0) {
                                    return;
                                }
                                class297.method1735(0, this.field1397, var26, var21 >> 16, (byte) 42, var23 >> 16);
                                var21 += var9;
                                var23 += var10;
                                var26 += this.field1399;
                            }
                        }
                        class297.method1735(0, this.field1397, var26, var21 >> 16, (byte) 42, var22 >> 16);
                        var21 += var9;
                        var26 += this.field1399;
                        var22 += var11;
                    }
                } else {
                    int var27 = arg6 - arg4;
                    int var28 = arg4 - arg2;
                    int var29 = this.field1399 * arg2;
                    while (true) {
                        var28--;
                        if (var28 < 0) {
                            while (true) {
                                var27--;
                                if (var27 < 0) {
                                    return;
                                }
                                class297.method1735(0, this.field1397, var29, var23 >> 16, (byte) 42, var21 >> 16);
                                var23 += var10;
                                var21 += var9;
                                var29 += this.field1399;
                            }
                        }
                        class297.method1735(0, this.field1397, var29, var22 >> 16, (byte) 42, var21 >> 16);
                        var21 += var9;
                        var22 += var11;
                        var29 += this.field1399;
                    }
                }
            }
        } else if (arg4 < arg6) {
            if (arg6 <= arg2) {
                int var30;
                int var31 = var30 = arg1 << 16;
                if (arg4 < 0) {
                    var31 -= arg4 * var10;
                    var30 -= arg4 * var11;
                    arg4 = 0;
                }
                int var32 = arg0 << 16;
                if (arg6 < 0) {
                    var32 -= arg6 * var9;
                    arg6 = 0;
                }
                if (var10 >= var11) {
                    int var33 = arg2 - arg6;
                    int var34 = arg6 - arg4;
                    int var35 = this.field1399 * arg4;
                    while (true) {
                        var34--;
                        if (var34 < 0) {
                            while (true) {
                                var33--;
                                if (var33 < 0) {
                                    return;
                                }
                                class297.method1735(0, this.field1397, var35, var32 >> 16, (byte) 42, var30 >> 16);
                                var35 += this.field1399;
                                var30 += var11;
                                var32 += var9;
                            }
                        }
                        class297.method1735(0, this.field1397, var35, var31 >> 16, (byte) 42, var30 >> 16);
                        var31 += var10;
                        var30 += var11;
                        var35 += this.field1399;
                    }
                } else {
                    int var36 = arg2 - arg6;
                    int var37 = arg6 - arg4;
                    int var38 = this.field1399 * arg4;
                    while (true) {
                        var37--;
                        if (var37 < 0) {
                            while (true) {
                                var36--;
                                if (var36 < 0) {
                                    return;
                                }
                                class297.method1735(0, this.field1397, var38, var30 >> 16, (byte) 42, var32 >> 16);
                                var30 += var11;
                                var38 += this.field1399;
                                var32 += var9;
                            }
                        }
                        class297.method1735(0, this.field1397, var38, var30 >> 16, (byte) 42, var31 >> 16);
                        var38 += this.field1399;
                        var31 += var10;
                        var30 += var11;
                    }
                }
            } else {
                int var39;
                int var40 = var39 = arg1 << 16;
                int var41 = arg3 << 16;
                if (arg4 < 0) {
                    var39 -= arg4 * var11;
                    var40 -= arg4 * var10;
                    arg4 = 0;
                }
                if (arg2 < 0) {
                    var41 -= arg2 * var9;
                    arg2 = 0;
                }
                if (var10 >= var11) {
                    int var42 = arg6 - arg2;
                    int var43 = arg2 - arg4;
                    int var44 = this.field1399 * arg4;
                    while (true) {
                        var43--;
                        if (var43 < 0) {
                            while (true) {
                                var42--;
                                if (var42 < 0) {
                                    return;
                                }
                                class297.method1735(0, this.field1397, var44, var40 >> 16, (byte) 42, var41 >> 16);
                                var40 += var10;
                                var44 += this.field1399;
                                var41 += var9;
                            }
                        }
                        class297.method1735(0, this.field1397, var44, var40 >> 16, (byte) 42, var39 >> 16);
                        var39 += var11;
                        var44 += this.field1399;
                        var40 += var10;
                    }
                } else {
                    int var45 = arg6 - arg2;
                    int var46 = arg2 - arg4;
                    int var47 = this.field1399 * arg4;
                    while (true) {
                        var46--;
                        if (var46 < 0) {
                            while (true) {
                                var45--;
                                if (var45 < 0) {
                                    return;
                                }
                                class297.method1735(0, this.field1397, var47, var41 >> 16, (byte) 42, var40 >> 16);
                                var47 += this.field1399;
                                var40 += var10;
                                var41 += var9;
                            }
                        }
                        class297.method1735(0, this.field1397, var47, var39 >> 16, (byte) 42, var40 >> 16);
                        var40 += var10;
                        var39 += var11;
                        var47 += this.field1399;
                    }
                }
            }
        } else if (arg4 < arg2) {
            int var48;
            int var49 = var48 = arg0 << 16;
            int var50 = arg1 << 16;
            if (arg6 < 0) {
                var48 -= arg6 * var10;
                var49 -= arg6 * var9;
                arg6 = 0;
            }
            if (arg4 < 0) {
                var50 -= arg4 * var11;
                arg4 = 0;
            }
            if (arg4 != arg6 && var10 > var9 || arg4 == arg6 && var11 < var9) {
                int var51 = arg2 - arg4;
                int var52 = arg4 - arg6;
                int var53 = this.field1399 * arg6;
                while (true) {
                    var52--;
                    if (var52 < 0) {
                        while (true) {
                            var51--;
                            if (var51 < 0) {
                                return;
                            }
                            class297.method1735(0, this.field1397, var53, var50 >> 16, (byte) 42, var49 >> 16);
                            var53 += this.field1399;
                            var50 += var11;
                            var49 += var9;
                        }
                    }
                    class297.method1735(0, this.field1397, var53, var48 >> 16, (byte) 42, var49 >> 16);
                    var49 += var9;
                    var53 += this.field1399;
                    var48 += var10;
                }
            } else {
                int var54 = arg2 - arg4;
                int var55 = arg4 - arg6;
                int var56 = this.field1399 * arg6;
                while (true) {
                    var55--;
                    if (var55 < 0) {
                        while (true) {
                            var54--;
                            if (var54 < 0) {
                                return;
                            }
                            class297.method1735(0, this.field1397, var56, var49 >> 16, (byte) 42, var50 >> 16);
                            var49 += var9;
                            var50 += var11;
                            var56 += this.field1399;
                        }
                    }
                    class297.method1735(0, this.field1397, var56, var49 >> 16, (byte) 42, var48 >> 16);
                    var48 += var10;
                    var49 += var9;
                    var56 += this.field1399;
                }
            }
        } else {
            int var57;
            int var58 = var57 = arg0 << 16;
            int var59 = arg3 << 16;
            if (arg6 < 0) {
                var58 -= arg6 * var9;
                var57 -= arg6 * var10;
                arg6 = 0;
            }
            if (arg2 < 0) {
                var59 -= arg2 * var11;
                arg2 = 0;
            }
            if (var10 > var9) {
                int var60 = arg4 - arg2;
                int var61 = arg2 - arg6;
                int var62 = this.field1399 * arg6;
                while (true) {
                    var61--;
                    if (var61 < 0) {
                        while (true) {
                            var60--;
                            if (var60 < 0) {
                                return;
                            }
                            class297.method1735(0, this.field1397, var62, var57 >> 16, (byte) 42, var59 >> 16);
                            var57 += var10;
                            var62 += this.field1399;
                            var59 += var11;
                        }
                    }
                    class297.method1735(0, this.field1397, var62, var57 >> 16, (byte) 42, var58 >> 16);
                    var57 += var10;
                    var62 += this.field1399;
                    var58 += var9;
                }
            } else {
                int var63 = arg4 - arg2;
                int var64 = arg2 - arg6;
                int var65 = this.field1399 * arg6;
                while (true) {
                    var64--;
                    if (var64 < 0) {
                        while (true) {
                            var63--;
                            if (var63 < 0) {
                                return;
                            }
                            class297.method1735(0, this.field1397, var65, var59 >> 16, (byte) 42, var57 >> 16);
                            var57 += var10;
                            var59 += var11;
                            var65 += this.field1399;
                        }
                    }
                    class297.method1735(0, this.field1397, var65, var58 >> 16, (byte) 42, var57 >> 16);
                    var65 += this.field1399;
                    var58 += var9;
                    var57 += var10;
                }
            }
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIIBI)V", line = 447)
    public final void method888(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (arg3 != -73) {
            this.method889(14, 29, -125);
        }
        this.field1391 = arg0;
        field1395++;
        this.field1398 = arg4;
        this.field1392 = arg1 - arg4;
        this.field1399 = arg2 - arg0;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(III)Z", line = 479)
    public final boolean method889(int arg0, int arg1, int arg2) {
        if (arg0 == -22539) {
            field1393++;
            return this.field1397.length >= arg1 * arg2;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "(I)V", line = 491)
    public final void method890(int arg0) {
        field1400++;
        int var2 = arg0;
        int var3 = this.field1397.length - 8;
        while (var3 > var2) {
            var2++;
            this.field1397[var2] = 0;
            var2++;
            this.field1397[var2] = 0;
            var2++;
            this.field1397[var2] = 0;
            var2++;
            this.field1397[var2] = 0;
            var2++;
            this.field1397[var2] = 0;
            var2++;
            this.field1397[var2] = 0;
            var2++;
            this.field1397[var2] = 0;
            var2++;
            this.field1397[var2] = 0;
        }
        while (var2 < this.field1397.length - 1) {
            var2++;
            this.field1397[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!hk", name = "g", descriptor = "(I)V", line = 523)
    public static void method891(int arg0) {
        field1404 = null;
        field1396 = null;
        field1401 = null;
        field1402 = null;
        field1394 = null;
        if (arg0 != -1) {
            method891(-51);
        }
    }

    @OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(Lwg;II)V", line = 546)
    public class111(class449 arg0, int arg1, int arg2) {
        this.field1397 = new byte[arg1 * arg2];
    }
}
