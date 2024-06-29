import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class441 extends class451 {

    @OriginalMember(owner = "client!uh", name = "D", descriptor = "[B")
    public byte[] field6070;

    @OriginalMember(owner = "client!uh", name = "C", descriptor = "Lcb;")
    public static class318 field6069 = new class318(94, 17);

    @OriginalMember(owner = "client!uh", name = "z", descriptor = "I")
    public static int field6066;

    @OriginalMember(owner = "client!uh", name = "A", descriptor = "I")
    public static int field6067;

    @OriginalMember(owner = "client!uh", name = "B", descriptor = "I")
    public int field6068;

    @OriginalMember(owner = "client!uh", name = "E", descriptor = "I")
    public int field6071;

    @OriginalMember(owner = "client!uh", name = "F", descriptor = "I")
    public static int field6072;

    @OriginalMember(owner = "client!uh", name = "G", descriptor = "I")
    public int field6073;

    @OriginalMember(owner = "client!uh", name = "H", descriptor = "I")
    public static int field6074;

    @OriginalMember(owner = "client!uh", name = "I", descriptor = "I")
    public static int field6075;

    @OriginalMember(owner = "client!uh", name = "J", descriptor = "I")
    public int field6076;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIIII)V")
    public final void method2527(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field6068 = arg0;
        field6075++;
        if (arg2 <= 68) {
            this.method2532(-71, -68, -51);
        }
        this.field6073 = arg1 - arg3;
        this.field6071 = arg4 - arg0;
        this.field6076 = arg3;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Z)V")
    public static void method2528(boolean arg0) {
        if (arg0) {
            method2529(null, null, null, null, 37);
        }
        field6069 = null;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lud;[I[I[II)V")
    public static final void method2529(class519 arg0, int[] arg1, int[] arg2, int[] arg3, int arg4) {
        field6074++;
        for (int var5 = 0; var5 < arg1.length; var5++) {
            int var6 = arg1[var5];
            int var7 = arg3[var5];
            int var8 = arg2[var5];
            for (int var9 = 0; var7 != 0 && arg0.field440.length > var9; var9++) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg0.field440[var9] = null;
                    } else {
                        class463 var10 = class77.field971.method776(var6, (byte) 89);
                        int var11 = var10.field6314;
                        class589 var12 = arg0.field440[var9];
                        if (var12 != null) {
                            if (var12.field8091 == var6) {
                                if (var11 == 0) {
                                    var12 = arg0.field440[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field8083 = 0;
                                    var12.field8089 = 0;
                                    var12.field8092 = var8;
                                    var12.field8088 = 1;
                                    var12.field8090 = 0;
                                    class311.method1870(0, arg0.field3917, (byte) 1, class596.field8164 == arg0, arg0.field3929, var10, arg0.field3925);
                                } else if (var11 == 2) {
                                    var12.field8090 = 0;
                                }
                            } else if (var10.field6334 >= class77.field971.method776(var12.field8091, (byte) -107).field6334) {
                                var12 = arg0.field440[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class589 var13 = arg0.field440[var9] = new class589();
                            var13.field8090 = 0;
                            var13.field8083 = 0;
                            var13.field8089 = 0;
                            var13.field8092 = var8;
                            var13.field8091 = var6;
                            var13.field8088 = 1;
                            class311.method1870(0, arg0.field3917, (byte) 1, class596.field8164 == arg0, arg0.field3929, var10, arg0.field3925);
                        }
                    }
                }
                var7 >>>= 0x1;
            }
        }
        if (arg4 >= -28) {
            field6069 = null;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIIIIII)V")
    public final void method2530(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field6066++;
        int var8 = 0;
        if (arg2 != arg6) {
            var8 = (arg5 - arg0 << 16) / (arg6 - arg2);
        }
        if (arg3 != -18765) {
            return;
        }
        int var9 = 0;
        if (arg4 != arg6) {
            var9 = (arg1 - arg5 << 16) / (arg4 - arg6);
        }
        int var10 = 0;
        if (arg2 != arg4) {
            var10 = (arg0 - arg1 << 16) / (arg2 - arg4);
        }
        if (arg2 <= arg6 && arg4 >= arg2) {
            if (arg4 <= arg6) {
                int var11;
                int var12 = var11 = arg0 << 16;
                int var13 = arg1 << 16;
                if (arg2 < 0) {
                    var11 -= arg2 * var8;
                    var12 -= arg2 * var10;
                    arg2 = 0;
                }
                if (arg4 < 0) {
                    var13 -= arg4 * var9;
                    arg4 = 0;
                }
                if (arg2 != arg4 && var10 < var8 || arg2 == arg4 && var8 < var9) {
                    int var14 = arg6 - arg4;
                    int var15 = arg4 - arg2;
                    int var16 = this.field6073 * arg2;
                    while (true) {
                        var15--;
                        if (var15 < 0) {
                            while (true) {
                                var14--;
                                if (var14 < 0) {
                                    return;
                                }
                                class66.method393(this.field6070, (byte) -82, 0, var16, var11 >> 16, var13 >> 16);
                                var11 += var8;
                                var13 += var9;
                                var16 += this.field6073;
                            }
                        }
                        class66.method393(this.field6070, (byte) -109, 0, var16, var11 >> 16, var12 >> 16);
                        var11 += var8;
                        var16 += this.field6073;
                        var12 += var10;
                    }
                } else {
                    int var17 = arg6 - arg4;
                    int var18 = arg4 - arg2;
                    int var19 = this.field6073 * arg2;
                    while (true) {
                        var18--;
                        if (var18 < 0) {
                            while (true) {
                                var17--;
                                if (var17 < 0) {
                                    return;
                                }
                                class66.method393(this.field6070, (byte) -124, 0, var19, var13 >> 16, var11 >> 16);
                                var19 += this.field6073;
                                var13 += var9;
                                var11 += var8;
                            }
                        }
                        class66.method393(this.field6070, (byte) -44, 0, var19, var12 >> 16, var11 >> 16);
                        var19 += this.field6073;
                        var11 += var8;
                        var12 += var10;
                    }
                }
            } else {
                int var20;
                int var21 = var20 = arg0 << 16;
                if (arg2 < 0) {
                    var21 -= arg2 * var10;
                    var20 -= arg2 * var8;
                    arg2 = 0;
                }
                int var22 = arg5 << 16;
                if (arg6 < 0) {
                    var22 -= arg6 * var9;
                    arg6 = 0;
                }
                if (arg2 != arg6 && var8 > var10 || arg2 == arg6 && var9 < var10) {
                    int var23 = arg4 - arg6;
                    int var24 = arg6 - arg2;
                    int var25 = this.field6073 * arg2;
                    while (true) {
                        var24--;
                        if (var24 < 0) {
                            while (true) {
                                var23--;
                                if (var23 < 0) {
                                    return;
                                }
                                class66.method393(this.field6070, (byte) -87, 0, var25, var22 >> 16, var21 >> 16);
                                var25 += this.field6073;
                                var22 += var9;
                                var21 += var10;
                            }
                        }
                        class66.method393(this.field6070, (byte) -124, 0, var25, var20 >> 16, var21 >> 16);
                        var21 += var10;
                        var25 += this.field6073;
                        var20 += var8;
                    }
                } else {
                    int var26 = arg4 - arg6;
                    int var27 = arg6 - arg2;
                    int var28 = this.field6073 * arg2;
                    while (true) {
                        var27--;
                        if (var27 < 0) {
                            while (true) {
                                var26--;
                                if (var26 < 0) {
                                    return;
                                }
                                class66.method393(this.field6070, (byte) -85, 0, var28, var21 >> 16, var22 >> 16);
                                var28 += this.field6073;
                                var22 += var9;
                                var21 += var10;
                            }
                        }
                        class66.method393(this.field6070, (byte) -122, 0, var28, var21 >> 16, var20 >> 16);
                        var21 += var10;
                        var28 += this.field6073;
                        var20 += var8;
                    }
                }
            }
        } else if (arg4 >= arg6) {
            if (arg2 <= arg4) {
                int var29;
                int var30 = var29 = arg5 << 16;
                int var31 = arg0 << 16;
                if (arg6 < 0) {
                    var29 -= arg6 * var9;
                    var30 -= arg6 * var8;
                    arg6 = 0;
                }
                if (arg2 < 0) {
                    var31 -= arg2 * var10;
                    arg2 = 0;
                }
                if (var8 >= var9) {
                    int var32 = arg4 - arg2;
                    int var33 = arg2 - arg6;
                    int var34 = this.field6073 * arg6;
                    while (true) {
                        var33--;
                        if (var33 < 0) {
                            while (true) {
                                var32--;
                                if (var32 < 0) {
                                    return;
                                }
                                class66.method393(this.field6070, (byte) -103, 0, var34, var31 >> 16, var29 >> 16);
                                var29 += var9;
                                var34 += this.field6073;
                                var31 += var10;
                            }
                        }
                        class66.method393(this.field6070, (byte) -110, 0, var34, var30 >> 16, var29 >> 16);
                        var34 += this.field6073;
                        var29 += var9;
                        var30 += var8;
                    }
                } else {
                    int var35 = arg4 - arg2;
                    int var36 = arg2 - arg6;
                    int var37 = this.field6073 * arg6;
                    while (true) {
                        var36--;
                        if (var36 < 0) {
                            while (true) {
                                var35--;
                                if (var35 < 0) {
                                    return;
                                }
                                class66.method393(this.field6070, (byte) -118, 0, var37, var29 >> 16, var31 >> 16);
                                var31 += var10;
                                var29 += var9;
                                var37 += this.field6073;
                            }
                        }
                        class66.method393(this.field6070, (byte) -62, 0, var37, var29 >> 16, var30 >> 16);
                        var29 += var9;
                        var30 += var8;
                        var37 += this.field6073;
                    }
                }
            } else {
                int var38;
                int var39 = var38 = arg5 << 16;
                if (arg6 < 0) {
                    var38 -= arg6 * var9;
                    var39 -= arg6 * var8;
                    arg6 = 0;
                }
                int var40 = arg1 << 16;
                if (arg4 < 0) {
                    var40 -= arg4 * var10;
                    arg4 = 0;
                }
                if (arg4 != arg6 && var9 > var8 || arg4 == arg6 && var8 > var10) {
                    int var41 = arg2 - arg4;
                    int var42 = arg4 - arg6;
                    int var43 = this.field6073 * arg6;
                    while (true) {
                        var42--;
                        if (var42 < 0) {
                            while (true) {
                                var41--;
                                if (var41 < 0) {
                                    return;
                                }
                                class66.method393(this.field6070, (byte) -55, 0, var43, var40 >> 16, var39 >> 16);
                                var43 += this.field6073;
                                var40 += var10;
                                var39 += var8;
                            }
                        }
                        class66.method393(this.field6070, (byte) -32, 0, var43, var38 >> 16, var39 >> 16);
                        var43 += this.field6073;
                        var39 += var8;
                        var38 += var9;
                    }
                } else {
                    int var44 = arg2 - arg4;
                    int var45 = arg4 - arg6;
                    int var46 = this.field6073 * arg6;
                    while (true) {
                        var45--;
                        if (var45 < 0) {
                            while (true) {
                                var44--;
                                if (var44 < 0) {
                                    return;
                                }
                                class66.method393(this.field6070, (byte) -111, 0, var46, var39 >> 16, var40 >> 16);
                                var39 += var8;
                                var46 += this.field6073;
                                var40 += var10;
                            }
                        }
                        class66.method393(this.field6070, (byte) -71, 0, var46, var39 >> 16, var38 >> 16);
                        var38 += var9;
                        var39 += var8;
                        var46 += this.field6073;
                    }
                }
            }
        } else if (arg6 <= arg2) {
            int var47;
            int var48 = var47 = arg1 << 16;
            if (arg4 < 0) {
                var48 -= arg4 * var9;
                var47 -= arg4 * var10;
                arg4 = 0;
            }
            int var49 = arg5 << 16;
            if (arg6 < 0) {
                var49 -= arg6 * var8;
                arg6 = 0;
            }
            if (var10 > var9) {
                int var50 = arg2 - arg6;
                int var51 = arg6 - arg4;
                int var52 = this.field6073 * arg4;
                while (true) {
                    var51--;
                    if (var51 < 0) {
                        while (true) {
                            var50--;
                            if (var50 < 0) {
                                return;
                            }
                            class66.method393(this.field6070, (byte) -112, 0, var52, var47 >> 16, var49 >> 16);
                            var52 += this.field6073;
                            var49 += var8;
                            var47 += var10;
                        }
                    }
                    class66.method393(this.field6070, (byte) -33, 0, var52, var47 >> 16, var48 >> 16);
                    var48 += var9;
                    var47 += var10;
                    var52 += this.field6073;
                }
            } else {
                int var53 = arg2 - arg6;
                int var54 = arg6 - arg4;
                int var55 = this.field6073 * arg4;
                while (true) {
                    var54--;
                    if (var54 < 0) {
                        while (true) {
                            var53--;
                            if (var53 < 0) {
                                return;
                            }
                            class66.method393(this.field6070, (byte) -117, 0, var55, var49 >> 16, var47 >> 16);
                            var55 += this.field6073;
                            var49 += var8;
                            var47 += var10;
                        }
                    }
                    class66.method393(this.field6070, (byte) -78, 0, var55, var48 >> 16, var47 >> 16);
                    var47 += var10;
                    var55 += this.field6073;
                    var48 += var9;
                }
            }
        } else {
            int var56;
            int var57 = var56 = arg1 << 16;
            int var58 = arg0 << 16;
            if (arg4 < 0) {
                var56 -= arg4 * var10;
                var57 -= arg4 * var9;
                arg4 = 0;
            }
            if (arg2 < 0) {
                var58 -= arg2 * var8;
                arg2 = 0;
            }
            if (var10 > var9) {
                int var59 = arg6 - arg2;
                int var60 = arg2 - arg4;
                int var61 = this.field6073 * arg4;
                while (true) {
                    var60--;
                    if (var60 < 0) {
                        while (true) {
                            var59--;
                            if (var59 < 0) {
                                return;
                            }
                            class66.method393(this.field6070, (byte) -90, 0, var61, var58 >> 16, var57 >> 16);
                            var61 += this.field6073;
                            var57 += var9;
                            var58 += var8;
                        }
                    }
                    class66.method393(this.field6070, (byte) -69, 0, var61, var56 >> 16, var57 >> 16);
                    var57 += var9;
                    var56 += var10;
                    var61 += this.field6073;
                }
            } else {
                int var62 = arg6 - arg2;
                int var63 = arg2 - arg4;
                int var64 = this.field6073 * arg4;
                while (true) {
                    var63--;
                    if (var63 < 0) {
                        while (true) {
                            var62--;
                            if (var62 < 0) {
                                return;
                            }
                            class66.method393(this.field6070, (byte) -126, 0, var64, var57 >> 16, var58 >> 16);
                            var64 += this.field6073;
                            var58 += var8;
                            var57 += var9;
                        }
                    }
                    class66.method393(this.field6070, (byte) -50, 0, var64, var57 >> 16, var56 >> 16);
                    var57 += var9;
                    var56 += var10;
                    var64 += this.field6073;
                }
            }
        }
    }

    @OriginalMember(owner = "client!uh", name = "g", descriptor = "(I)V")
    public final void method2531(int arg0) {
        field6067++;
        if (arg0 != -830803984) {
            this.field6073 = 76;
        }
        int var2 = -1;
        int var3 = this.field6070.length - 8;
        while (var2 < var3) {
            var2++;
            this.field6070[var2] = 0;
            var2++;
            this.field6070[var2] = 0;
            var2++;
            this.field6070[var2] = 0;
            var2++;
            this.field6070[var2] = 0;
            var2++;
            this.field6070[var2] = 0;
            var2++;
            this.field6070[var2] = 0;
            var2++;
            this.field6070[var2] = 0;
            var2++;
            this.field6070[var2] = 0;
        }
        while ((this.field6070.length - 1) > var2) {
            var2++;
            this.field6070[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(III)Z")
    public final boolean method2532(int arg0, int arg1, int arg2) {
        if (arg1 <= 96) {
            return false;
        } else {
            field6072++;
            return this.field6070.length >= (arg0 * arg2);
        }
    }

    @OriginalMember(owner = "client!uh", name = "<init>", descriptor = "(Lpea;II)V")
    public class441(class641 arg0, int arg1, int arg2) {
        this.field6070 = new byte[arg1 * arg2];
    }
}
