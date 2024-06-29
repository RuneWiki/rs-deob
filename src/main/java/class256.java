import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class256 extends class704 {

    @OriginalMember(owner = "client!eh", name = "E", descriptor = "[B")
    public byte[] field3678;

    @OriginalMember(owner = "client!eh", name = "w", descriptor = "I")
    public static int field3671;

    @OriginalMember(owner = "client!eh", name = "x", descriptor = "I")
    public int field3672;

    @OriginalMember(owner = "client!eh", name = "y", descriptor = "I")
    public static int field3673;

    @OriginalMember(owner = "client!eh", name = "z", descriptor = "I")
    public static int field3674;

    @OriginalMember(owner = "client!eh", name = "B", descriptor = "I")
    public static int field3675;

    @OriginalMember(owner = "client!eh", name = "C", descriptor = "I")
    public int field3676;

    @OriginalMember(owner = "client!eh", name = "D", descriptor = "I")
    public int field3677;

    @OriginalMember(owner = "client!eh", name = "F", descriptor = "I")
    public static int field3679;

    @OriginalMember(owner = "client!eh", name = "G", descriptor = "I")
    public int field3680;

    @OriginalMember(owner = "client!eh", name = "H", descriptor = "I")
    public static int field3681;

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(III)Z", line = 3)
    public final boolean method1703(int arg0, int arg1, int arg2) {
        int var4 = -24 / ((arg0 - 19) / 45);
        field3671++;
        return this.field3678.length >= (arg1 * arg2);
    }

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "(Z)V", line = 18)
    public final void method1704(boolean arg0) {
        field3674++;
        int var2 = -1;
        if (arg0) {
            this.field3680 = 49;
        }
        int var3 = this.field3678.length - 8;
        while (var3 > var2) {
            var2++;
            this.field3678[var2] = 0;
            var2++;
            this.field3678[var2] = 0;
            var2++;
            this.field3678[var2] = 0;
            var2++;
            this.field3678[var2] = 0;
            var2++;
            this.field3678[var2] = 0;
            var2++;
            this.field3678[var2] = 0;
            var2++;
            this.field3678[var2] = 0;
            var2++;
            this.field3678[var2] = 0;
        }
        while ((this.field3678.length - 1) > var2) {
            var2++;
            this.field3678[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIIIIII)V", line = 50)
    public final void method1705(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg6 != -1762) {
            method1709(30, -77, -66, (byte) -68);
        }
        field3673++;
        int var8 = 0;
        if (arg2 != arg4) {
            var8 = (arg0 - arg5 << 16) / (arg2 - arg4);
        }
        int var9 = 0;
        if (arg2 != arg3) {
            var9 = (arg1 - arg0 << 16) / (arg3 - arg2);
        }
        int var10 = 0;
        if (arg3 != arg4) {
            var10 = (arg5 - arg1 << 16) / (arg4 - arg3);
        }
        if (arg2 >= arg4 && arg4 <= arg3) {
            if (arg3 > arg2) {
                int var11;
                int var12 = var11 = arg5 << 16;
                if (arg4 < 0) {
                    var12 -= arg4 * var10;
                    var11 -= arg4 * var8;
                    arg4 = 0;
                }
                int var13 = arg0 << 16;
                if (arg2 < 0) {
                    var13 -= arg2 * var9;
                    arg2 = 0;
                }
                if ((arg2 == arg4 || var10 >= var8) && (arg2 != arg4 || var9 >= var10)) {
                    int var17 = arg3 - arg2;
                    int var18 = arg2 - arg4;
                    int var19 = this.field3680 * arg4;
                    while (true) {
                        var18--;
                        if (var18 < 0) {
                            while (true) {
                                var17--;
                                if (var17 < 0) {
                                    return;
                                }
                                class503.method3073(0, this.field3678, var19, true, var12 >> 16, var13 >> 16);
                                var13 += var9;
                                var19 += this.field3680;
                                var12 += var10;
                            }
                        }
                        class503.method3073(0, this.field3678, var19, true, var12 >> 16, var11 >> 16);
                        var19 += this.field3680;
                        var11 += var8;
                        var12 += var10;
                    }
                } else {
                    int var14 = arg3 - arg2;
                    int var15 = arg2 - arg4;
                    int var16 = this.field3680 * arg4;
                    while (true) {
                        var15--;
                        if (var15 < 0) {
                            while (true) {
                                var14--;
                                if (var14 < 0) {
                                    return;
                                }
                                class503.method3073(0, this.field3678, var16, true, var13 >> 16, var12 >> 16);
                                var16 += this.field3680;
                                var13 += var9;
                                var12 += var10;
                            }
                        }
                        class503.method3073(0, this.field3678, var16, true, var11 >> 16, var12 >> 16);
                        var11 += var8;
                        var12 += var10;
                        var16 += this.field3680;
                    }
                }
            } else {
                int var20;
                int var21 = var20 = arg5 << 16;
                if (arg4 < 0) {
                    var20 -= arg4 * var8;
                    var21 -= arg4 * var10;
                    arg4 = 0;
                }
                int var22 = arg1 << 16;
                if (arg3 < 0) {
                    var22 -= arg3 * var9;
                    arg3 = 0;
                }
                if (arg3 != arg4 && var10 < var8 || arg3 == arg4 && var9 > var8) {
                    int var23 = arg2 - arg3;
                    int var24 = arg3 - arg4;
                    int var25 = this.field3680 * arg4;
                    while (true) {
                        var24--;
                        if (var24 < 0) {
                            while (true) {
                                var23--;
                                if (var23 < 0) {
                                    return;
                                }
                                class503.method3073(0, this.field3678, var25, true, var20 >> 16, var22 >> 16);
                                var20 += var8;
                                var25 += this.field3680;
                                var22 += var9;
                            }
                        }
                        class503.method3073(0, this.field3678, var25, true, var20 >> 16, var21 >> 16);
                        var20 += var8;
                        var21 += var10;
                        var25 += this.field3680;
                    }
                } else {
                    int var26 = arg2 - arg3;
                    int var27 = arg3 - arg4;
                    int var28 = this.field3680 * arg4;
                    while (true) {
                        var27--;
                        if (var27 < 0) {
                            while (true) {
                                var26--;
                                if (var26 < 0) {
                                    return;
                                }
                                class503.method3073(0, this.field3678, var28, true, var22 >> 16, var20 >> 16);
                                var20 += var8;
                                var22 += var9;
                                var28 += this.field3680;
                            }
                        }
                        class503.method3073(0, this.field3678, var28, true, var21 >> 16, var20 >> 16);
                        var21 += var10;
                        var20 += var8;
                        var28 += this.field3680;
                    }
                }
            }
        } else if (arg2 > arg3) {
            if (arg4 < arg2) {
                int var29;
                int var30 = var29 = arg1 << 16;
                int var31 = arg5 << 16;
                if (arg3 < 0) {
                    var30 -= arg3 * var9;
                    var29 -= arg3 * var10;
                    arg3 = 0;
                }
                if (arg4 < 0) {
                    var31 -= arg4 * var8;
                    arg4 = 0;
                }
                if (var10 <= var9) {
                    int var32 = arg2 - arg4;
                    int var33 = arg4 - arg3;
                    int var34 = this.field3680 * arg3;
                    while (true) {
                        var33--;
                        if (var33 < 0) {
                            while (true) {
                                var32--;
                                if (var32 < 0) {
                                    return;
                                }
                                class503.method3073(0, this.field3678, var34, true, var30 >> 16, var31 >> 16);
                                var30 += var9;
                                var31 += var8;
                                var34 += this.field3680;
                            }
                        }
                        class503.method3073(0, this.field3678, var34, true, var30 >> 16, var29 >> 16);
                        var29 += var10;
                        var30 += var9;
                        var34 += this.field3680;
                    }
                } else {
                    int var35 = arg2 - arg4;
                    int var36 = arg4 - arg3;
                    int var37 = this.field3680 * arg3;
                    while (true) {
                        var36--;
                        if (var36 < 0) {
                            while (true) {
                                var35--;
                                if (var35 < 0) {
                                    return;
                                }
                                class503.method3073(0, this.field3678, var37, true, var31 >> 16, var30 >> 16);
                                var30 += var9;
                                var37 += this.field3680;
                                var31 += var8;
                            }
                        }
                        class503.method3073(0, this.field3678, var37, true, var29 >> 16, var30 >> 16);
                        var37 += this.field3680;
                        var29 += var10;
                        var30 += var9;
                    }
                }
            } else {
                int var38;
                int var39 = var38 = arg1 << 16;
                if (arg3 < 0) {
                    var39 -= arg3 * var9;
                    var38 -= arg3 * var10;
                    arg3 = 0;
                }
                int var40 = arg0 << 16;
                if (arg2 < 0) {
                    var40 -= arg2 * var8;
                    arg2 = 0;
                }
                if (var9 < var10) {
                    int var41 = arg4 - arg2;
                    int var42 = arg2 - arg3;
                    int var43 = this.field3680 * arg3;
                    while (true) {
                        var42--;
                        if (var42 < 0) {
                            while (true) {
                                var41--;
                                if (var41 < 0) {
                                    return;
                                }
                                class503.method3073(0, this.field3678, var43, true, var38 >> 16, var40 >> 16);
                                var43 += this.field3680;
                                var40 += var8;
                                var38 += var10;
                            }
                        }
                        class503.method3073(0, this.field3678, var43, true, var38 >> 16, var39 >> 16);
                        var39 += var9;
                        var43 += this.field3680;
                        var38 += var10;
                    }
                } else {
                    int var44 = arg4 - arg2;
                    int var45 = arg2 - arg3;
                    int var46 = this.field3680 * arg3;
                    while (true) {
                        var45--;
                        if (var45 < 0) {
                            while (true) {
                                var44--;
                                if (var44 < 0) {
                                    return;
                                }
                                class503.method3073(0, this.field3678, var46, true, var40 >> 16, var38 >> 16);
                                var38 += var10;
                                var40 += var8;
                                var46 += this.field3680;
                            }
                        }
                        class503.method3073(0, this.field3678, var46, true, var39 >> 16, var38 >> 16);
                        var39 += var9;
                        var38 += var10;
                        var46 += this.field3680;
                    }
                }
            }
        } else if (arg3 >= arg4) {
            int var47;
            int var48 = var47 = arg0 << 16;
            if (arg2 < 0) {
                var47 -= arg2 * var9;
                var48 -= arg2 * var8;
                arg2 = 0;
            }
            int var49 = arg5 << 16;
            if (arg4 < 0) {
                var49 -= arg4 * var10;
                arg4 = 0;
            }
            if (var9 > var8) {
                int var50 = arg3 - arg4;
                int var51 = arg4 - arg2;
                int var52 = this.field3680 * arg2;
                while (true) {
                    var51--;
                    if (var51 < 0) {
                        while (true) {
                            var50--;
                            if (var50 < 0) {
                                return;
                            }
                            class503.method3073(0, this.field3678, var52, true, var47 >> 16, var49 >> 16);
                            var47 += var9;
                            var49 += var10;
                            var52 += this.field3680;
                        }
                    }
                    class503.method3073(0, this.field3678, var52, true, var47 >> 16, var48 >> 16);
                    var48 += var8;
                    var47 += var9;
                    var52 += this.field3680;
                }
            } else {
                int var53 = arg3 - arg4;
                int var54 = arg4 - arg2;
                int var55 = this.field3680 * arg2;
                while (true) {
                    var54--;
                    if (var54 < 0) {
                        while (true) {
                            var53--;
                            if (var53 < 0) {
                                return;
                            }
                            class503.method3073(0, this.field3678, var55, true, var49 >> 16, var47 >> 16);
                            var55 += this.field3680;
                            var49 += var10;
                            var47 += var9;
                        }
                    }
                    class503.method3073(0, this.field3678, var55, true, var48 >> 16, var47 >> 16);
                    var48 += var8;
                    var55 += this.field3680;
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
            if (arg3 < 0) {
                var58 -= arg3 * var10;
                arg3 = 0;
            }
            if (arg2 != arg3 && var9 > var8 || arg2 == arg3 && var8 > var10) {
                int var59 = arg4 - arg3;
                int var60 = arg3 - arg2;
                int var61 = this.field3680 * arg2;
                while (true) {
                    var60--;
                    if (var60 < 0) {
                        while (true) {
                            var59--;
                            if (var59 < 0) {
                                return;
                            }
                            class503.method3073(0, this.field3678, var61, true, var58 >> 16, var57 >> 16);
                            var61 += this.field3680;
                            var57 += var8;
                            var58 += var10;
                        }
                    }
                    class503.method3073(0, this.field3678, var61, true, var56 >> 16, var57 >> 16);
                    var56 += var9;
                    var57 += var8;
                    var61 += this.field3680;
                }
            } else {
                int var62 = arg4 - arg3;
                int var63 = arg3 - arg2;
                int var64 = this.field3680 * arg2;
                while (true) {
                    var63--;
                    if (var63 < 0) {
                        while (true) {
                            var62--;
                            if (var62 < 0) {
                                return;
                            }
                            class503.method3073(0, this.field3678, var64, true, var57 >> 16, var58 >> 16);
                            var57 += var8;
                            var64 += this.field3680;
                            var58 += var10;
                        }
                    }
                    class503.method3073(0, this.field3678, var64, true, var57 >> 16, var56 >> 16);
                    var64 += this.field3680;
                    var57 += var8;
                    var56 += var9;
                }
            }
        }
    }

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "(Z)Lcc;", line = 489)
    public static final class575 method1706(boolean arg0) {
        if (arg0) {
            method1706(true);
        }
        field3675++;
        try {
            return (class575) Class.forName("waa").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "(III)Lnf;", line = 513)
    public static final class19 method1707(int arg0, int arg1, int arg2) {
        class375 var3 = class565.field8185[arg0][arg1][arg2];
        return var3 == null ? null : var3.field5431;
    }

    @OriginalMember(owner = "client!eh", name = "<init>", descriptor = "(Lkw;II)V", line = 520)
    public class256(class346 arg0, int arg1, int arg2) {
        this.field3678 = new byte[arg1 * arg2];
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(BIIII)V", line = 531)
    public final void method1708(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field3672 = arg1 - arg2;
        this.field3677 = arg2;
        if (arg0 != -125) {
            method1706(true);
        }
        field3679++;
        this.field3680 = arg4 - arg3;
        this.field3676 = arg3;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIIB)Ldk;", line = 549)
    public static final class88 method1709(int arg0, int arg1, int arg2, byte arg3) {
        field3681++;
        class88 var4 = null;
        if (arg0 == 0) {
            class606.field8586++;
            var4 = class448.method2741((byte) 90, class370.field5397, class583.field8319);
        }
        if (arg0 == 1) {
            class366.field5360++;
            var4 = class448.method2741((byte) 70, class308.field4176, class583.field8319);
        }
        int var5 = 107 / ((arg3 + 53) / 57);
        var4.field1260.method2863(class41.field693 + arg2, (byte) 63);
        var4.field1260.method2864(class253.field3661.method2780(82, 124) ? 1 : 0, (byte) 99);
        var4.field1260.method2862(arg1 + class71.field1085, -1166933656);
        class126.field1745 = false;
        class455.field6488 = arg1;
        class545.field7931 = arg2;
        class499.method3034(-3561);
        return var4;
    }
}
