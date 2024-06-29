import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public class class245 extends class283 {

    @OriginalMember(owner = "client!ln", name = "O", descriptor = "[B")
    public byte[] field3520;

    @OriginalMember(owner = "client!ln", name = "N", descriptor = "I")
    public static int field3519 = 0;

    @OriginalMember(owner = "client!ln", name = "Q", descriptor = "Lgn;")
    public static class475 field3522 = new class475(33, 7);

    @OriginalMember(owner = "client!ln", name = "U", descriptor = "I")
    public static int field3526 = -1;

    @OriginalMember(owner = "client!ln", name = "I", descriptor = "I")
    public int field3515;

    @OriginalMember(owner = "client!ln", name = "J", descriptor = "I")
    public static int field3516;

    @OriginalMember(owner = "client!ln", name = "K", descriptor = "I")
    public static int field3517;

    @OriginalMember(owner = "client!ln", name = "L", descriptor = "I")
    public int field3518;

    @OriginalMember(owner = "client!ln", name = "P", descriptor = "I")
    public static int field3521;

    @OriginalMember(owner = "client!ln", name = "R", descriptor = "I")
    public static int field3523;

    @OriginalMember(owner = "client!ln", name = "S", descriptor = "I")
    public int field3524;

    @OriginalMember(owner = "client!ln", name = "T", descriptor = "I")
    public static int field3525;

    @OriginalMember(owner = "client!ln", name = "V", descriptor = "I")
    public int field3527;

    @OriginalMember(owner = "client!ln", name = "c", descriptor = "(Z)V", line = 5)
    public static void method1528(boolean arg0) {
        if (arg0) {
            field3522 = null;
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(IIIZIII)V", line = 18)
    public final void method1529(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        if (!arg3) {
            this.method1530(-17);
        }
        field3517++;
        int var8 = 0;
        if (arg2 != arg6) {
            var8 = (arg4 - arg1 << 16) / (arg2 - arg6);
        }
        int var9 = 0;
        if (arg2 != arg5) {
            var9 = (arg0 - arg4 << 16) / (arg5 - arg2);
        }
        int var10 = 0;
        if (arg5 != arg6) {
            var10 = (arg1 - arg0 << 16) / (arg6 - arg5);
        }
        if (arg6 <= arg2 && arg6 <= arg5) {
            if (arg5 > arg2) {
                int var11;
                int var12 = var11 = arg1 << 16;
                if (arg6 < 0) {
                    var11 -= arg6 * var8;
                    var12 -= arg6 * var10;
                    arg6 = 0;
                }
                int var13 = arg4 << 16;
                if (arg2 < 0) {
                    var13 -= arg2 * var9;
                    arg2 = 0;
                }
                if (arg2 != arg6 && var8 > var10 || arg2 == arg6 && var10 > var9) {
                    int var14 = arg5 - arg2;
                    int var15 = arg2 - arg6;
                    int var16 = this.field3515 * arg6;
                    while (true) {
                        var15--;
                        if (var15 < 0) {
                            while (true) {
                                var14--;
                                if (var14 < 0) {
                                    return;
                                }
                                class498.method2990(0, -16865, this.field3520, var13 >> 16, var12 >> 16, var16);
                                var13 += var9;
                                var12 += var10;
                                var16 += this.field3515;
                            }
                        }
                        class498.method2990(0, -16865, this.field3520, var11 >> 16, var12 >> 16, var16);
                        var16 += this.field3515;
                        var11 += var8;
                        var12 += var10;
                    }
                } else {
                    int var17 = arg5 - arg2;
                    int var18 = arg2 - arg6;
                    int var19 = this.field3515 * arg6;
                    while (true) {
                        var18--;
                        if (var18 < 0) {
                            while (true) {
                                var17--;
                                if (var17 < 0) {
                                    return;
                                }
                                class498.method2990(0, -16865, this.field3520, var12 >> 16, var13 >> 16, var19);
                                var12 += var10;
                                var19 += this.field3515;
                                var13 += var9;
                            }
                        }
                        class498.method2990(0, -16865, this.field3520, var12 >> 16, var11 >> 16, var19);
                        var12 += var10;
                        var11 += var8;
                        var19 += this.field3515;
                    }
                }
            } else {
                int var20;
                int var21 = var20 = arg1 << 16;
                int var22 = arg0 << 16;
                if (arg6 < 0) {
                    var21 -= arg6 * var10;
                    var20 -= arg6 * var8;
                    arg6 = 0;
                }
                if (arg5 < 0) {
                    var22 -= arg5 * var9;
                    arg5 = 0;
                }
                if (arg5 != arg6 && var10 < var8 || arg5 == arg6 && var9 > var8) {
                    int var23 = arg2 - arg5;
                    int var24 = arg5 - arg6;
                    int var25 = this.field3515 * arg6;
                    while (true) {
                        var24--;
                        if (var24 < 0) {
                            while (true) {
                                var23--;
                                if (var23 < 0) {
                                    return;
                                }
                                class498.method2990(0, -16865, this.field3520, var20 >> 16, var22 >> 16, var25);
                                var20 += var8;
                                var22 += var9;
                                var25 += this.field3515;
                            }
                        }
                        class498.method2990(0, -16865, this.field3520, var20 >> 16, var21 >> 16, var25);
                        var20 += var8;
                        var25 += this.field3515;
                        var21 += var10;
                    }
                } else {
                    int var26 = arg2 - arg5;
                    int var27 = arg5 - arg6;
                    int var28 = this.field3515 * arg6;
                    while (true) {
                        var27--;
                        if (var27 < 0) {
                            while (true) {
                                var26--;
                                if (var26 < 0) {
                                    return;
                                }
                                class498.method2990(0, -16865, this.field3520, var22 >> 16, var20 >> 16, var28);
                                var28 += this.field3515;
                                var22 += var9;
                                var20 += var8;
                            }
                        }
                        class498.method2990(0, -16865, this.field3520, var21 >> 16, var20 >> 16, var28);
                        var20 += var8;
                        var21 += var10;
                        var28 += this.field3515;
                    }
                }
            }
        } else if (arg5 < arg2) {
            if (arg2 > arg6) {
                int var29;
                int var30 = var29 = arg0 << 16;
                int var31 = arg1 << 16;
                if (arg5 < 0) {
                    var30 -= arg5 * var9;
                    var29 -= arg5 * var10;
                    arg5 = 0;
                }
                if (arg6 < 0) {
                    var31 -= arg6 * var8;
                    arg6 = 0;
                }
                if (var10 <= var9) {
                    int var32 = arg2 - arg6;
                    int var33 = arg6 - arg5;
                    int var34 = this.field3515 * arg5;
                    while (true) {
                        var33--;
                        if (var33 < 0) {
                            while (true) {
                                var32--;
                                if (var32 < 0) {
                                    return;
                                }
                                class498.method2990(0, -16865, this.field3520, var30 >> 16, var31 >> 16, var34);
                                var34 += this.field3515;
                                var30 += var9;
                                var31 += var8;
                            }
                        }
                        class498.method2990(0, -16865, this.field3520, var30 >> 16, var29 >> 16, var34);
                        var34 += this.field3515;
                        var30 += var9;
                        var29 += var10;
                    }
                } else {
                    int var35 = arg2 - arg6;
                    int var36 = arg6 - arg5;
                    int var37 = this.field3515 * arg5;
                    while (true) {
                        var36--;
                        if (var36 < 0) {
                            while (true) {
                                var35--;
                                if (var35 < 0) {
                                    return;
                                }
                                class498.method2990(0, -16865, this.field3520, var31 >> 16, var30 >> 16, var37);
                                var37 += this.field3515;
                                var30 += var9;
                                var31 += var8;
                            }
                        }
                        class498.method2990(0, -16865, this.field3520, var29 >> 16, var30 >> 16, var37);
                        var29 += var10;
                        var30 += var9;
                        var37 += this.field3515;
                    }
                }
            } else {
                int var38;
                int var39 = var38 = arg0 << 16;
                if (arg5 < 0) {
                    var39 -= arg5 * var9;
                    var38 -= arg5 * var10;
                    arg5 = 0;
                }
                int var40 = arg4 << 16;
                if (arg2 < 0) {
                    var40 -= arg2 * var8;
                    arg2 = 0;
                }
                if (var9 < var10) {
                    int var41 = arg6 - arg2;
                    int var42 = arg2 - arg5;
                    int var43 = this.field3515 * arg5;
                    while (true) {
                        var42--;
                        if (var42 < 0) {
                            while (true) {
                                var41--;
                                if (var41 < 0) {
                                    return;
                                }
                                class498.method2990(0, -16865, this.field3520, var38 >> 16, var40 >> 16, var43);
                                var38 += var10;
                                var43 += this.field3515;
                                var40 += var8;
                            }
                        }
                        class498.method2990(0, -16865, this.field3520, var38 >> 16, var39 >> 16, var43);
                        var43 += this.field3515;
                        var38 += var10;
                        var39 += var9;
                    }
                } else {
                    int var44 = arg6 - arg2;
                    int var45 = arg2 - arg5;
                    int var46 = this.field3515 * arg5;
                    while (true) {
                        var45--;
                        if (var45 < 0) {
                            while (true) {
                                var44--;
                                if (var44 < 0) {
                                    return;
                                }
                                class498.method2990(0, -16865, this.field3520, var40 >> 16, var38 >> 16, var46);
                                var40 += var8;
                                var46 += this.field3515;
                                var38 += var10;
                            }
                        }
                        class498.method2990(0, -16865, this.field3520, var39 >> 16, var38 >> 16, var46);
                        var39 += var9;
                        var46 += this.field3515;
                        var38 += var10;
                    }
                }
            }
        } else if (arg6 > arg5) {
            int var47;
            int var48 = var47 = arg4 << 16;
            if (arg2 < 0) {
                var48 -= arg2 * var8;
                var47 -= arg2 * var9;
                arg2 = 0;
            }
            int var49 = arg0 << 16;
            if (arg5 < 0) {
                var49 -= arg5 * var10;
                arg5 = 0;
            }
            if (arg2 != arg5 && var8 < var9 || arg2 == arg5 && var10 < var8) {
                int var50 = arg6 - arg5;
                int var51 = arg5 - arg2;
                int var52 = this.field3515 * arg2;
                while (true) {
                    var51--;
                    if (var51 < 0) {
                        while (true) {
                            var50--;
                            if (var50 < 0) {
                                return;
                            }
                            class498.method2990(0, -16865, this.field3520, var49 >> 16, var48 >> 16, var52);
                            var52 += this.field3515;
                            var48 += var8;
                            var49 += var10;
                        }
                    }
                    class498.method2990(0, -16865, this.field3520, var47 >> 16, var48 >> 16, var52);
                    var52 += this.field3515;
                    var47 += var9;
                    var48 += var8;
                }
            } else {
                int var53 = arg6 - arg5;
                int var54 = arg5 - arg2;
                int var55 = this.field3515 * arg2;
                while (true) {
                    var54--;
                    if (var54 < 0) {
                        while (true) {
                            var53--;
                            if (var53 < 0) {
                                return;
                            }
                            class498.method2990(0, -16865, this.field3520, var48 >> 16, var49 >> 16, var55);
                            var55 += this.field3515;
                            var49 += var10;
                            var48 += var8;
                        }
                    }
                    class498.method2990(0, -16865, this.field3520, var48 >> 16, var47 >> 16, var55);
                    var47 += var9;
                    var55 += this.field3515;
                    var48 += var8;
                }
            }
        } else {
            int var56;
            int var57 = var56 = arg4 << 16;
            if (arg2 < 0) {
                var56 -= arg2 * var9;
                var57 -= arg2 * var8;
                arg2 = 0;
            }
            int var58 = arg1 << 16;
            if (arg6 < 0) {
                var58 -= arg6 * var10;
                arg6 = 0;
            }
            if (var9 > var8) {
                int var59 = arg5 - arg6;
                int var60 = arg6 - arg2;
                int var61 = this.field3515 * arg2;
                while (true) {
                    var60--;
                    if (var60 < 0) {
                        while (true) {
                            var59--;
                            if (var59 < 0) {
                                return;
                            }
                            class498.method2990(0, -16865, this.field3520, var56 >> 16, var58 >> 16, var61);
                            var61 += this.field3515;
                            var56 += var9;
                            var58 += var10;
                        }
                    }
                    class498.method2990(0, -16865, this.field3520, var56 >> 16, var57 >> 16, var61);
                    var57 += var8;
                    var56 += var9;
                    var61 += this.field3515;
                }
            } else {
                int var62 = arg5 - arg6;
                int var63 = arg6 - arg2;
                int var64 = this.field3515 * arg2;
                while (true) {
                    var63--;
                    if (var63 < 0) {
                        while (true) {
                            var62--;
                            if (var62 < 0) {
                                return;
                            }
                            class498.method2990(0, -16865, this.field3520, var58 >> 16, var56 >> 16, var64);
                            var58 += var10;
                            var56 += var9;
                            var64 += this.field3515;
                        }
                    }
                    class498.method2990(0, -16865, this.field3520, var57 >> 16, var56 >> 16, var64);
                    var56 += var9;
                    var57 += var8;
                    var64 += this.field3515;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ln", name = "e", descriptor = "(I)V", line = 456)
    public final void method1530(int arg0) {
        if (arg0 != 12304) {
            this.method1532(82, -55, 100);
        }
        field3525++;
        int var2 = -1;
        int var3 = this.field3520.length - 8;
        while (var3 > var2) {
            var2++;
            this.field3520[var2] = 0;
            var2++;
            this.field3520[var2] = 0;
            var2++;
            this.field3520[var2] = 0;
            var2++;
            this.field3520[var2] = 0;
            var2++;
            this.field3520[var2] = 0;
            var2++;
            this.field3520[var2] = 0;
            var2++;
            this.field3520[var2] = 0;
            var2++;
            this.field3520[var2] = 0;
        }
        while ((this.field3520.length - 1) > var2) {
            var2++;
            this.field3520[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(II)V", line = 485)
    public static final void method1531(int arg0, int arg1) {
        field3523++;
        if (class247.field3541 == arg0) {
            return;
        }
        class362.field5442 = class203.field2813 = class431.field6331[arg0];
        class54.method410((byte) 115);
        class381.field5678 = new int[class362.field5442][class203.field2813];
        class159.field2072 = new int[4][class362.field5442 >> 3][class203.field2813 >> 3];
        class90.field1237 = new int[class362.field5442][class203.field2813];
        for (int var2 = 0; var2 < 4; var2++) {
            class169.field2234[var2] = class106.method635(class362.field5442, false, class203.field2813);
        }
        class449.field6546 = new byte[4][class362.field5442][class203.field2813];
        if (arg1 > -67) {
            method1531(-19, -14);
        }
        class318.method1916(4, 26192, class203.field2813, class362.field5442);
        class258.method1609(class203.field2813 >> 3, class481.field6937, 3, class362.field5442 >> 3);
        class247.field3541 = arg0;
    }

    @OriginalMember(owner = "client!ln", name = "c", descriptor = "(III)Z", line = 520)
    public final boolean method1532(int arg0, int arg1, int arg2) {
        if (arg1 != 585123152) {
            this.method1529(-118, -71, 66, false, 14, 3, 11);
        }
        field3516++;
        return this.field3520.length >= arg0 * arg2;
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(IIIII)V", line = 533)
    public final void method1533(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3521++;
        this.field3527 = arg0 - arg1;
        this.field3518 = arg3;
        this.field3515 = arg4 - arg3;
        this.field3524 = arg1;
        if (arg2 >= -23) {
            this.method1530(-1);
        }
    }

    @OriginalMember(owner = "client!ln", name = "<init>", descriptor = "(Lrl;II)V", line = 568)
    public class245(class487 arg0, int arg1, int arg2) {
        this.field3520 = new byte[arg1 * arg2];
    }
}
