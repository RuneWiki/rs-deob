import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class141 extends class88 {

    @OriginalMember(owner = "client!ec", name = "E", descriptor = "[B")
    public byte[] field2200;

    @OriginalMember(owner = "client!ec", name = "C", descriptor = "I")
    public static int field2198 = 0;

    @OriginalMember(owner = "client!ec", name = "N", descriptor = "[Z")
    public static boolean[] field2208 = new boolean[100];

    @OriginalMember(owner = "client!ec", name = "P", descriptor = "[I")
    public static int[] field2210;

    @OriginalMember(owner = "client!ec", name = "Q", descriptor = "I")
    public static int field2211;

    @OriginalMember(owner = "client!ec", name = "B", descriptor = "I")
    public static int field2197;

    @OriginalMember(owner = "client!ec", name = "D", descriptor = "I")
    public static int field2199;

    @OriginalMember(owner = "client!ec", name = "F", descriptor = "I")
    public int field2201;

    @OriginalMember(owner = "client!ec", name = "G", descriptor = "I")
    public int field2202;

    @OriginalMember(owner = "client!ec", name = "H", descriptor = "I")
    public int field2203;

    @OriginalMember(owner = "client!ec", name = "I", descriptor = "I")
    public static int field2204;

    @OriginalMember(owner = "client!ec", name = "J", descriptor = "I")
    public int field2205;

    @OriginalMember(owner = "client!ec", name = "K", descriptor = "I")
    public static int field2206;

    @OriginalMember(owner = "client!ec", name = "M", descriptor = "I")
    public static int field2207;

    @OriginalMember(owner = "client!ec", name = "O", descriptor = "I")
    public static int field2209;

    @OriginalMember(owner = "client!ec", name = "R", descriptor = "I")
    public static int field2212;

    @OriginalMember(owner = "client!ec", name = "S", descriptor = "I")
    public static int field2213;

    static {
        new class567("You cannot report that person for Staff Impersonation, they are Jagex Staff.", "Diese Person ist ein Jagex-Mitarbeiter!", "Cette personne est un membre du personnel de Jagex, vous ne pouvez pas la signaler pour abus d'identité.", "Você não pode denunciar essa pessoa por tentar se passar por membro da equipe Jagex, pois ela faz parte da equipe.");
        field2210 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };
        field2211 = 0;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIII)V", line = 3)
    public final void method1047(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2213++;
        if (arg2 != 0) {
            this.field2201 = -109;
        }
        this.field2203 = arg4;
        this.field2201 = arg3 - arg4;
        this.field2205 = arg0;
        this.field2202 = arg1 - arg0;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IBI)Z", line = 22)
    public final boolean method1048(int arg0, byte arg1, int arg2) {
        field2206++;
        if (arg1 != 4) {
            field2198 = 32;
        }
        return this.field2200.length >= (arg0 * arg2);
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(B)V", line = 33)
    public final void method1049(byte arg0) {
        field2197++;
        if (arg0 >= -63) {
            this.method1050(-75, 84, 25, 125, 43, -33, -15);
        }
        int var2 = -1;
        int var3 = this.field2200.length - 8;
        while (var2 < var3) {
            var2++;
            this.field2200[var2] = 0;
            var2++;
            this.field2200[var2] = 0;
            var2++;
            this.field2200[var2] = 0;
            var2++;
            this.field2200[var2] = 0;
            var2++;
            this.field2200[var2] = 0;
            var2++;
            this.field2200[var2] = 0;
            var2++;
            this.field2200[var2] = 0;
            var2++;
            this.field2200[var2] = 0;
        }
        while (this.field2200.length - 1 > var2) {
            var2++;
            this.field2200[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIIIII)V", line = 62)
    public final void method1050(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg5 != 1639) {
            return;
        }
        field2204++;
        int var8 = 0;
        if (arg2 != arg6) {
            var8 = (arg0 - arg1 << 16) / (arg2 - arg6);
        }
        int var9 = 0;
        if (arg2 != arg3) {
            var9 = (arg4 - arg0 << 16) / (arg3 - arg2);
        }
        int var10 = 0;
        if (arg3 != arg6) {
            var10 = (arg1 - arg4 << 16) / (arg6 - arg3);
        }
        if (arg6 <= arg2 && arg3 >= arg6) {
            if (arg2 >= arg3) {
                int var11;
                int var12 = var11 = arg1 << 16;
                if (arg6 < 0) {
                    var11 -= arg6 * var8;
                    var12 -= arg6 * var10;
                    arg6 = 0;
                }
                int var13 = arg4 << 16;
                if (arg3 < 0) {
                    var13 -= arg3 * var9;
                    arg3 = 0;
                }
                if (arg3 != arg6 && var8 > var10 || arg3 == arg6 && var9 > var8) {
                    int var14 = arg2 - arg3;
                    int var15 = arg3 - arg6;
                    int var16 = this.field2202 * arg6;
                    while (true) {
                        var15--;
                        if (var15 < 0) {
                            while (true) {
                                var14--;
                                if (var14 < 0) {
                                    return;
                                }
                                class434.method2587(var16, arg5 ^ 0xFFFFF9F7, var11 >> 16, var13 >> 16, 0, this.field2200);
                                var16 += this.field2202;
                                var11 += var8;
                                var13 += var9;
                            }
                        }
                        class434.method2587(var16, -126, var11 >> 16, var12 >> 16, 0, this.field2200);
                        var12 += var10;
                        var16 += this.field2202;
                        var11 += var8;
                    }
                } else {
                    int var17 = arg2 - arg3;
                    int var18 = arg3 - arg6;
                    int var19 = this.field2202 * arg6;
                    while (true) {
                        var18--;
                        if (var18 < 0) {
                            while (true) {
                                var17--;
                                if (var17 < 0) {
                                    return;
                                }
                                class434.method2587(var19, -112, var13 >> 16, var11 >> 16, 0, this.field2200);
                                var11 += var8;
                                var19 += this.field2202;
                                var13 += var9;
                            }
                        }
                        class434.method2587(var19, arg5 - 1750, var12 >> 16, var11 >> 16, 0, this.field2200);
                        var19 += this.field2202;
                        var12 += var10;
                        var11 += var8;
                    }
                }
            } else {
                int var20;
                int var21 = var20 = arg1 << 16;
                if (arg6 < 0) {
                    var20 -= arg6 * var8;
                    var21 -= arg6 * var10;
                    arg6 = 0;
                }
                int var22 = arg0 << 16;
                if (arg2 < 0) {
                    var22 -= arg2 * var9;
                    arg2 = 0;
                }
                if (arg2 != arg6 && var8 > var10 || arg2 == arg6 && var9 < var10) {
                    int var23 = arg3 - arg2;
                    int var24 = arg2 - arg6;
                    int var25 = this.field2202 * arg6;
                    while (true) {
                        var24--;
                        if (var24 < 0) {
                            while (true) {
                                var23--;
                                if (var23 < 0) {
                                    return;
                                }
                                class434.method2587(var25, arg5 ^ 0xFFFFF9F7, var22 >> 16, var21 >> 16, 0, this.field2200);
                                var25 += this.field2202;
                                var21 += var10;
                                var22 += var9;
                            }
                        }
                        class434.method2587(var25, -110, var20 >> 16, var21 >> 16, 0, this.field2200);
                        var21 += var10;
                        var25 += this.field2202;
                        var20 += var8;
                    }
                } else {
                    int var26 = arg3 - arg2;
                    int var27 = arg2 - arg6;
                    int var28 = this.field2202 * arg6;
                    while (true) {
                        var27--;
                        if (var27 < 0) {
                            while (true) {
                                var26--;
                                if (var26 < 0) {
                                    return;
                                }
                                class434.method2587(var28, -113, var21 >> 16, var22 >> 16, 0, this.field2200);
                                var22 += var9;
                                var28 += this.field2202;
                                var21 += var10;
                            }
                        }
                        class434.method2587(var28, arg5 - 1753, var21 >> 16, var20 >> 16, 0, this.field2200);
                        var20 += var8;
                        var28 += this.field2202;
                        var21 += var10;
                    }
                }
            }
        } else if (arg3 < arg2) {
            if (arg2 > arg6) {
                int var29;
                int var30 = var29 = arg4 << 16;
                int var31 = arg1 << 16;
                if (arg3 < 0) {
                    var29 -= arg3 * var10;
                    var30 -= arg3 * var9;
                    arg3 = 0;
                }
                if (arg6 < 0) {
                    var31 -= arg6 * var8;
                    arg6 = 0;
                }
                if (var10 > var9) {
                    int var32 = arg2 - arg6;
                    int var33 = arg6 - arg3;
                    int var34 = this.field2202 * arg3;
                    while (true) {
                        var33--;
                        if (var33 < 0) {
                            while (true) {
                                var32--;
                                if (var32 < 0) {
                                    return;
                                }
                                class434.method2587(var34, -110, var31 >> 16, var30 >> 16, 0, this.field2200);
                                var30 += var9;
                                var31 += var8;
                                var34 += this.field2202;
                            }
                        }
                        class434.method2587(var34, arg5 ^ 0xFFFFF9E5, var29 >> 16, var30 >> 16, 0, this.field2200);
                        var30 += var9;
                        var29 += var10;
                        var34 += this.field2202;
                    }
                } else {
                    int var35 = arg2 - arg6;
                    int var36 = arg6 - arg3;
                    int var37 = this.field2202 * arg3;
                    while (true) {
                        var36--;
                        if (var36 < 0) {
                            while (true) {
                                var35--;
                                if (var35 < 0) {
                                    return;
                                }
                                class434.method2587(var37, arg5 ^ 0xFFFFF9F6, var30 >> 16, var31 >> 16, 0, this.field2200);
                                var30 += var9;
                                var37 += this.field2202;
                                var31 += var8;
                            }
                        }
                        class434.method2587(var37, -121, var30 >> 16, var29 >> 16, 0, this.field2200);
                        var29 += var10;
                        var30 += var9;
                        var37 += this.field2202;
                    }
                }
            } else {
                int var38;
                int var39 = var38 = arg4 << 16;
                int var40 = arg0 << 16;
                if (arg3 < 0) {
                    var39 -= arg3 * var9;
                    var38 -= arg3 * var10;
                    arg3 = 0;
                }
                if (arg2 < 0) {
                    var40 -= arg2 * var8;
                    arg2 = 0;
                }
                if (var10 <= var9) {
                    int var41 = arg6 - arg2;
                    int var42 = arg2 - arg3;
                    int var43 = this.field2202 * arg3;
                    while (true) {
                        var42--;
                        if (var42 < 0) {
                            while (true) {
                                var41--;
                                if (var41 < 0) {
                                    return;
                                }
                                class434.method2587(var43, -127, var40 >> 16, var38 >> 16, 0, this.field2200);
                                var38 += var10;
                                var40 += var8;
                                var43 += this.field2202;
                            }
                        }
                        class434.method2587(var43, -126, var39 >> 16, var38 >> 16, 0, this.field2200);
                        var43 += this.field2202;
                        var38 += var10;
                        var39 += var9;
                    }
                } else {
                    int var44 = arg6 - arg2;
                    int var45 = arg2 - arg3;
                    int var46 = this.field2202 * arg3;
                    while (true) {
                        var45--;
                        if (var45 < 0) {
                            while (true) {
                                var44--;
                                if (var44 < 0) {
                                    return;
                                }
                                class434.method2587(var46, arg5 ^ 0xFFFFF9E2, var38 >> 16, var40 >> 16, 0, this.field2200);
                                var46 += this.field2202;
                                var40 += var8;
                                var38 += var10;
                            }
                        }
                        class434.method2587(var46, arg5 ^ 0xFFFFF9E4, var38 >> 16, var39 >> 16, 0, this.field2200);
                        var46 += this.field2202;
                        var39 += var9;
                        var38 += var10;
                    }
                }
            }
        } else if (arg3 < arg6) {
            int var47;
            int var48 = var47 = arg0 << 16;
            if (arg2 < 0) {
                var47 -= arg2 * var9;
                var48 -= arg2 * var8;
                arg2 = 0;
            }
            int var49 = arg4 << 16;
            if (arg3 < 0) {
                var49 -= arg3 * var10;
                arg3 = 0;
            }
            if (arg2 != arg3 && var9 > var8 || arg2 == arg3 && var8 > var10) {
                int var50 = arg6 - arg3;
                int var51 = arg3 - arg2;
                int var52 = this.field2202 * arg2;
                while (true) {
                    var51--;
                    if (var51 < 0) {
                        while (true) {
                            var50--;
                            if (var50 < 0) {
                                return;
                            }
                            class434.method2587(var52, -110, var49 >> 16, var48 >> 16, 0, this.field2200);
                            var49 += var10;
                            var48 += var8;
                            var52 += this.field2202;
                        }
                    }
                    class434.method2587(var52, -119, var47 >> 16, var48 >> 16, 0, this.field2200);
                    var47 += var9;
                    var52 += this.field2202;
                    var48 += var8;
                }
            } else {
                int var53 = arg6 - arg3;
                int var54 = arg3 - arg2;
                int var55 = this.field2202 * arg2;
                while (true) {
                    var54--;
                    if (var54 < 0) {
                        while (true) {
                            var53--;
                            if (var53 < 0) {
                                return;
                            }
                            class434.method2587(var55, -118, var48 >> 16, var49 >> 16, 0, this.field2200);
                            var49 += var10;
                            var55 += this.field2202;
                            var48 += var8;
                        }
                    }
                    class434.method2587(var55, -127, var48 >> 16, var47 >> 16, 0, this.field2200);
                    var48 += var8;
                    var55 += this.field2202;
                    var47 += var9;
                }
            }
        } else {
            int var56;
            int var57 = var56 = arg0 << 16;
            int var58 = arg1 << 16;
            if (arg2 < 0) {
                var57 -= arg2 * var8;
                var56 -= arg2 * var9;
                arg2 = 0;
            }
            if (arg6 < 0) {
                var58 -= arg6 * var10;
                arg6 = 0;
            }
            if (var8 >= var9) {
                int var59 = arg3 - arg6;
                int var60 = arg6 - arg2;
                int var61 = this.field2202 * arg2;
                while (true) {
                    var60--;
                    if (var60 < 0) {
                        while (true) {
                            var59--;
                            if (var59 < 0) {
                                return;
                            }
                            class434.method2587(var61, -125, var58 >> 16, var56 >> 16, 0, this.field2200);
                            var56 += var9;
                            var61 += this.field2202;
                            var58 += var10;
                        }
                    }
                    class434.method2587(var61, -124, var57 >> 16, var56 >> 16, 0, this.field2200);
                    var61 += this.field2202;
                    var56 += var9;
                    var57 += var8;
                }
            } else {
                int var62 = arg3 - arg6;
                int var63 = arg6 - arg2;
                int var64 = this.field2202 * arg2;
                while (true) {
                    var63--;
                    if (var63 < 0) {
                        while (true) {
                            var62--;
                            if (var62 < 0) {
                                return;
                            }
                            class434.method2587(var64, arg5 - 1754, var56 >> 16, var58 >> 16, 0, this.field2200);
                            var58 += var10;
                            var56 += var9;
                            var64 += this.field2202;
                        }
                    }
                    class434.method2587(var64, arg5 ^ 0xFFFFF9E2, var56 >> 16, var57 >> 16, 0, this.field2200);
                    var56 += var9;
                    var57 += var8;
                    var64 += this.field2202;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "(Z)V", line = 503)
    public static void method1051(boolean arg0) {
        field2210 = null;
        field2208 = null;
        if (arg0) {
            field2211 = 68;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IBIII)V", line = 518)
    public static final void method1052(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (arg1 != 65) {
            method1053(-9, -17);
        }
        field2207++;
        int var5 = 0;
        int var6 = arg3;
        int var7 = -arg3;
        int var8 = -1;
        int var9 = class34.method306(class183.field2638, arg2 + arg3, class268.field3911, (byte) 89);
        int var10 = class34.method306(class183.field2638, arg2 - arg3, class268.field3911, (byte) 97);
        class614.method3490(arg4, var10, arg1 - 192, class495.field6944[arg0], var9);
        while (var6 > var5) {
            var8 += 2;
            var7 += var8;
            if (var7 > 0) {
                var6--;
                var7 -= var6 << 1;
                int var11 = arg0 - var6;
                int var12 = arg0 + var6;
                if (var12 >= class222.field3350 && var11 <= class409.field6071) {
                    int var13 = class34.method306(class183.field2638, arg2 + var5, class268.field3911, (byte) 110);
                    int var14 = class34.method306(class183.field2638, arg2 - var5, class268.field3911, (byte) 113);
                    if (class409.field6071 >= var12) {
                        class614.method3490(arg4, var14, -93, class495.field6944[var12], var13);
                    }
                    if (class222.field3350 <= var11) {
                        class614.method3490(arg4, var14, -98, class495.field6944[var11], var13);
                    }
                }
            }
            var5++;
            int var15 = arg0 - var5;
            int var16 = arg0 + var5;
            if (class222.field3350 <= var16 && var15 <= class409.field6071) {
                int var17 = class34.method306(class183.field2638, arg2 + var6, class268.field3911, (byte) 94);
                int var18 = class34.method306(class183.field2638, arg2 - var6, class268.field3911, (byte) 84);
                if (var16 <= class409.field6071) {
                    class614.method3490(arg4, var18, -123, class495.field6944[var16], var17);
                }
                if (var15 >= class222.field3350) {
                    class614.method3490(arg4, var18, -101, class495.field6944[var15], var17);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(II)Z", line = 601)
    public static final boolean method1053(int arg0, int arg1) {
        field2199++;
        int var2 = -39 / ((64 - arg1) / 58);
        return arg0 == 1 || arg0 == 3 || arg0 == 5;
    }

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(Ljj;II)V", line = 613)
    public class141(class66 arg0, int arg1, int arg2) {
        this.field2200 = new byte[arg1 * arg2];
    }
}
