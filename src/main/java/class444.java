import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public class class444 extends class88 {

    @OriginalMember(owner = "client!lo", name = "C", descriptor = "[B")
    public byte[] field6480;

    @OriginalMember(owner = "client!lo", name = "G", descriptor = "Liu;")
    public static class517 field6484 = new class517(4, 6);

    @OriginalMember(owner = "client!lo", name = "B", descriptor = "I")
    public static int field6479;

    @OriginalMember(owner = "client!lo", name = "D", descriptor = "I")
    public static int field6481;

    @OriginalMember(owner = "client!lo", name = "E", descriptor = "I")
    public static int field6482;

    @OriginalMember(owner = "client!lo", name = "F", descriptor = "I")
    public static int field6483;

    @OriginalMember(owner = "client!lo", name = "H", descriptor = "I")
    public int field6485;

    @OriginalMember(owner = "client!lo", name = "I", descriptor = "I")
    public static int field6486;

    @OriginalMember(owner = "client!lo", name = "J", descriptor = "I")
    public int field6487;

    @OriginalMember(owner = "client!lo", name = "K", descriptor = "I")
    public static int field6488;

    @OriginalMember(owner = "client!lo", name = "L", descriptor = "I")
    public static int field6489;

    @OriginalMember(owner = "client!lo", name = "M", descriptor = "I")
    public int field6490;

    @OriginalMember(owner = "client!lo", name = "O", descriptor = "I")
    public int field6491;

    @OriginalMember(owner = "client!lo", name = "c", descriptor = "(I)V")
    public final void method2620(int arg0) {
        field6482++;
        int var2 = -1;
        int var3 = this.field6480.length - 8;
        while (var3 > var2) {
            var2++;
            this.field6480[var2] = 0;
            var2++;
            this.field6480[var2] = 0;
            var2++;
            this.field6480[var2] = 0;
            var2++;
            this.field6480[var2] = 0;
            var2++;
            this.field6480[var2] = 0;
            var2++;
            this.field6480[var2] = 0;
            var2++;
            this.field6480[var2] = 0;
            var2++;
            this.field6480[var2] = 0;
        }
        while (var2 < this.field6480.length - 1) {
            var2++;
            this.field6480[var2] = 0;
        }
        if (arg0 != 2002041936) {
            this.method2620(-28);
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(III)V")
    public static final void method2621(int arg0, int arg1, int arg2) {
        field6489++;
        class21 var3 = class601.method3413(arg1, 14, (byte) 113);
        var3.method230(18340);
        if (arg0 >= 81) {
            var3.field308 = arg2;
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(IIIIIII)V")
    public final void method2622(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field6483++;
        int var8 = 0;
        if (arg0 != arg2) {
            var8 = (arg4 - arg5 << 16) / (arg2 - arg0);
        }
        int var9 = arg6;
        if (arg2 != arg3) {
            var9 = (arg1 - arg4 << 16) / (arg3 - arg2);
        }
        int var10 = 0;
        if (arg0 != arg3) {
            var10 = (arg5 - arg1 << 16) / (arg0 - arg3);
        }
        if (arg0 <= arg2 && arg0 <= arg3) {
            if (arg3 > arg2) {
                int var11;
                int var12 = var11 = arg5 << 16;
                int var13 = arg4 << 16;
                if (arg0 < 0) {
                    var12 -= arg0 * var10;
                    var11 -= arg0 * var8;
                    arg0 = 0;
                }
                if (arg2 < 0) {
                    var13 -= arg2 * var9;
                    arg2 = 0;
                }
                if ((arg0 == arg2 || var8 <= var10) && (arg0 != arg2 || var9 >= var10)) {
                    int var17 = arg3 - arg2;
                    int var18 = arg2 - arg0;
                    int var19 = this.field6491 * arg0;
                    while (true) {
                        var18--;
                        if (var18 < 0) {
                            while (true) {
                                var17--;
                                if (var17 < 0) {
                                    return;
                                }
                                class61.method487(-75, this.field6480, var13 >> 16, var12 >> 16, var19, 0);
                                var12 += var10;
                                var19 += this.field6491;
                                var13 += var9;
                            }
                        }
                        class61.method487(arg6 ^ 0xFFFFFFC9, this.field6480, var11 >> 16, var12 >> 16, var19, 0);
                        var11 += var8;
                        var19 += this.field6491;
                        var12 += var10;
                    }
                } else {
                    int var14 = arg3 - arg2;
                    int var15 = arg2 - arg0;
                    int var16 = this.field6491 * arg0;
                    while (true) {
                        var15--;
                        if (var15 < 0) {
                            while (true) {
                                var14--;
                                if (var14 < 0) {
                                    return;
                                }
                                class61.method487(-127, this.field6480, var12 >> 16, var13 >> 16, var16, 0);
                                var16 += this.field6491;
                                var12 += var10;
                                var13 += var9;
                            }
                        }
                        class61.method487(-98, this.field6480, var12 >> 16, var11 >> 16, var16, 0);
                        var12 += var10;
                        var11 += var8;
                        var16 += this.field6491;
                    }
                }
            } else {
                int var20;
                int var21 = var20 = arg5 << 16;
                if (arg0 < 0) {
                    var21 -= arg0 * var10;
                    var20 -= arg0 * var8;
                    arg0 = 0;
                }
                int var22 = arg1 << 16;
                if (arg3 < 0) {
                    var22 -= arg3 * var9;
                    arg3 = 0;
                }
                if (arg0 != arg3 && var8 > var10 || arg0 == arg3 && var8 < var9) {
                    int var23 = arg2 - arg3;
                    int var24 = arg3 - arg0;
                    int var25 = this.field6491 * arg0;
                    while (true) {
                        var24--;
                        if (var24 < 0) {
                            while (true) {
                                var23--;
                                if (var23 < 0) {
                                    return;
                                }
                                class61.method487(arg6 ^ 0xFFFFFFA2, this.field6480, var22 >> 16, var20 >> 16, var25, 0);
                                var20 += var8;
                                var25 += this.field6491;
                                var22 += var9;
                            }
                        }
                        class61.method487(-97, this.field6480, var21 >> 16, var20 >> 16, var25, 0);
                        var21 += var10;
                        var25 += this.field6491;
                        var20 += var8;
                    }
                } else {
                    int var26 = arg2 - arg3;
                    int var27 = arg3 - arg0;
                    int var28 = this.field6491 * arg0;
                    while (true) {
                        var27--;
                        if (var27 < 0) {
                            while (true) {
                                var26--;
                                if (var26 < 0) {
                                    return;
                                }
                                class61.method487(-59, this.field6480, var20 >> 16, var22 >> 16, var28, 0);
                                var28 += this.field6491;
                                var22 += var9;
                                var20 += var8;
                            }
                        }
                        class61.method487(-62, this.field6480, var20 >> 16, var21 >> 16, var28, 0);
                        var28 += this.field6491;
                        var21 += var10;
                        var20 += var8;
                    }
                }
            }
        } else if (arg2 <= arg3) {
            if (arg3 < arg0) {
                int var29;
                int var30 = var29 = arg4 << 16;
                int var31 = arg1 << 16;
                if (arg2 < 0) {
                    var29 -= arg2 * var9;
                    var30 -= arg2 * var8;
                    arg2 = 0;
                }
                if (arg3 < 0) {
                    var31 -= arg3 * var10;
                    arg3 = 0;
                }
                if (arg2 != arg3 && var8 < var9 || arg2 == arg3 && var8 > var10) {
                    int var32 = arg0 - arg3;
                    int var33 = arg3 - arg2;
                    int var34 = this.field6491 * arg2;
                    while (true) {
                        var33--;
                        if (var33 < 0) {
                            while (true) {
                                var32--;
                                if (var32 < 0) {
                                    return;
                                }
                                class61.method487(-122, this.field6480, var30 >> 16, var31 >> 16, var34, 0);
                                var31 += var10;
                                var30 += var8;
                                var34 += this.field6491;
                            }
                        }
                        class61.method487(-75, this.field6480, var30 >> 16, var29 >> 16, var34, 0);
                        var29 += var9;
                        var34 += this.field6491;
                        var30 += var8;
                    }
                } else {
                    int var35 = arg0 - arg3;
                    int var36 = arg3 - arg2;
                    int var37 = this.field6491 * arg2;
                    while (true) {
                        var36--;
                        if (var36 < 0) {
                            while (true) {
                                var35--;
                                if (var35 < 0) {
                                    return;
                                }
                                class61.method487(arg6 - 71, this.field6480, var31 >> 16, var30 >> 16, var37, 0);
                                var31 += var10;
                                var37 += this.field6491;
                                var30 += var8;
                            }
                        }
                        class61.method487(-42, this.field6480, var29 >> 16, var30 >> 16, var37, 0);
                        var37 += this.field6491;
                        var30 += var8;
                        var29 += var9;
                    }
                }
            } else {
                int var38;
                int var39 = var38 = arg4 << 16;
                int var40 = arg5 << 16;
                if (arg2 < 0) {
                    var38 -= arg2 * var9;
                    var39 -= arg2 * var8;
                    arg2 = 0;
                }
                if (arg0 < 0) {
                    var40 -= arg0 * var10;
                    arg0 = 0;
                }
                if (var9 <= var8) {
                    int var41 = arg3 - arg0;
                    int var42 = arg0 - arg2;
                    int var43 = this.field6491 * arg2;
                    while (true) {
                        var42--;
                        if (var42 < 0) {
                            while (true) {
                                var41--;
                                if (var41 < 0) {
                                    return;
                                }
                                class61.method487(-119, this.field6480, var38 >> 16, var40 >> 16, var43, 0);
                                var38 += var9;
                                var43 += this.field6491;
                                var40 += var10;
                            }
                        }
                        class61.method487(-81, this.field6480, var38 >> 16, var39 >> 16, var43, 0);
                        var39 += var8;
                        var38 += var9;
                        var43 += this.field6491;
                    }
                } else {
                    int var44 = arg3 - arg0;
                    int var45 = arg0 - arg2;
                    int var46 = this.field6491 * arg2;
                    while (true) {
                        var45--;
                        if (var45 < 0) {
                            while (true) {
                                var44--;
                                if (var44 < 0) {
                                    return;
                                }
                                class61.method487(-70, this.field6480, var40 >> 16, var38 >> 16, var46, 0);
                                var40 += var10;
                                var46 += this.field6491;
                                var38 += var9;
                            }
                        }
                        class61.method487(arg6 ^ 0xFFFFFF9F, this.field6480, var39 >> 16, var38 >> 16, var46, 0);
                        var38 += var9;
                        var39 += var8;
                        var46 += this.field6491;
                    }
                }
            }
        } else if (arg0 >= arg2) {
            int var47;
            int var48 = var47 = arg1 << 16;
            if (arg3 < 0) {
                var48 -= arg3 * var9;
                var47 -= arg3 * var10;
                arg3 = 0;
            }
            int var49 = arg4 << 16;
            if (arg2 < 0) {
                var49 -= arg2 * var8;
                arg2 = 0;
            }
            if (var10 <= var9) {
                int var50 = arg0 - arg2;
                int var51 = arg2 - arg3;
                int var52 = this.field6491 * arg3;
                while (true) {
                    var51--;
                    if (var51 < 0) {
                        while (true) {
                            var50--;
                            if (var50 < 0) {
                                return;
                            }
                            class61.method487(-93, this.field6480, var47 >> 16, var49 >> 16, var52, 0);
                            var47 += var10;
                            var49 += var8;
                            var52 += this.field6491;
                        }
                    }
                    class61.method487(-105, this.field6480, var47 >> 16, var48 >> 16, var52, 0);
                    var47 += var10;
                    var48 += var9;
                    var52 += this.field6491;
                }
            } else {
                int var53 = arg0 - arg2;
                int var54 = arg2 - arg3;
                int var55 = this.field6491 * arg3;
                while (true) {
                    var54--;
                    if (var54 < 0) {
                        while (true) {
                            var53--;
                            if (var53 < 0) {
                                return;
                            }
                            class61.method487(-44, this.field6480, var49 >> 16, var47 >> 16, var55, 0);
                            var55 += this.field6491;
                            var49 += var8;
                            var47 += var10;
                        }
                    }
                    class61.method487(-103, this.field6480, var48 >> 16, var47 >> 16, var55, 0);
                    var47 += var10;
                    var55 += this.field6491;
                    var48 += var9;
                }
            }
        } else {
            int var56;
            int var57 = var56 = arg1 << 16;
            int var58 = arg5 << 16;
            if (arg3 < 0) {
                var56 -= arg3 * var10;
                var57 -= arg3 * var9;
                arg3 = 0;
            }
            if (arg0 < 0) {
                var58 -= arg0 * var8;
                arg0 = 0;
            }
            if (var9 < var10) {
                int var59 = arg2 - arg0;
                int var60 = arg0 - arg3;
                int var61 = this.field6491 * arg3;
                while (true) {
                    var60--;
                    if (var60 < 0) {
                        while (true) {
                            var59--;
                            if (var59 < 0) {
                                return;
                            }
                            class61.method487(-83, this.field6480, var57 >> 16, var58 >> 16, var61, 0);
                            var61 += this.field6491;
                            var57 += var9;
                            var58 += var8;
                        }
                    }
                    class61.method487(arg6 ^ 0xFFFFFFB2, this.field6480, var57 >> 16, var56 >> 16, var61, 0);
                    var56 += var10;
                    var61 += this.field6491;
                    var57 += var9;
                }
            } else {
                int var62 = arg2 - arg0;
                int var63 = arg0 - arg3;
                int var64 = this.field6491 * arg3;
                while (true) {
                    var63--;
                    if (var63 < 0) {
                        while (true) {
                            var62--;
                            if (var62 < 0) {
                                return;
                            }
                            class61.method487(-107, this.field6480, var58 >> 16, var57 >> 16, var64, 0);
                            var64 += this.field6491;
                            var57 += var9;
                            var58 += var8;
                        }
                    }
                    class61.method487(-104, this.field6480, var56 >> 16, var57 >> 16, var64, 0);
                    var56 += var10;
                    var64 += this.field6491;
                    var57 += var9;
                }
            }
        }
    }

    @OriginalMember(owner = "client!lo", name = "b", descriptor = "(III)Z")
    public final boolean method2623(int arg0, int arg1, int arg2) {
        field6488++;
        if (arg0 != -1985202301) {
            this.method2626(-24, 13, 14, 6, 78);
        }
        return arg1 * arg2 <= this.field6480.length;
    }

    @OriginalMember(owner = "client!lo", name = "c", descriptor = "(Z)V")
    public static void method2624(boolean arg0) {
        if (!arg0) {
            field6484 = null;
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(ZI)V")
    public static final void method2625(boolean arg0, int arg1) {
        if (arg0) {
            method2624(false);
        }
        field6486++;
        if (class68.field1287 == arg1) {
            return;
        }
        class146.field2247 = class66.field990 = class301.field4348[arg1];
        class17.method200(0);
        class97.field1698 = new int[class146.field2247][class66.field990];
        class82.field1462 = new int[4][class146.field2247 >> 3][class66.field990 >> 3];
        class393.field5893 = new int[class146.field2247][class66.field990];
        for (int var2 = 0; var2 < 4; var2++) {
            class268.field3916[var2] = class380.method2305((byte) 117, class146.field2247, class66.field990);
        }
        class338.field4854 = new byte[4][class146.field2247][class66.field990];
        class262.method1672(class146.field2247, 4, class66.field990, true);
        class232.method1519(class146.field2247 >> 3, 94, class66.field990 >> 3, class159.field2378);
        class68.field1287 = arg1;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(IIIII)V")
    public final void method2626(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field6490 = arg0;
        this.field6487 = arg3 - arg0;
        this.field6491 = arg4 - arg1;
        if (arg2 != 0) {
            this.field6490 = -18;
        }
        this.field6485 = arg1;
        field6481++;
    }

    @OriginalMember(owner = "client!lo", name = "<init>", descriptor = "(Lnd;II)V")
    public class444(class632 arg0, int arg1, int arg2) {
        this.field6480 = new byte[arg1 * arg2];
    }
}
