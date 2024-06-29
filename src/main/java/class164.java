import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wp")
public class class164 extends class54 {

    @OriginalMember(owner = "client!wp", name = "H", descriptor = "[B")
    public byte[] field2756;

    @OriginalMember(owner = "client!wp", name = "R", descriptor = "Lhga;")
    public static class158 field2766 = new class158(46, 5);

    @OriginalMember(owner = "client!wp", name = "G", descriptor = "I")
    public static int field2755;

    @OriginalMember(owner = "client!wp", name = "I", descriptor = "I")
    public int field2757;

    @OriginalMember(owner = "client!wp", name = "J", descriptor = "I")
    public static int field2758;

    @OriginalMember(owner = "client!wp", name = "K", descriptor = "I")
    public int field2759;

    @OriginalMember(owner = "client!wp", name = "L", descriptor = "I")
    public int field2760;

    @OriginalMember(owner = "client!wp", name = "M", descriptor = "I")
    public int field2761;

    @OriginalMember(owner = "client!wp", name = "N", descriptor = "I")
    public static int field2762;

    @OriginalMember(owner = "client!wp", name = "O", descriptor = "I")
    public static int field2763;

    @OriginalMember(owner = "client!wp", name = "P", descriptor = "I")
    public static int field2764;

    @OriginalMember(owner = "client!wp", name = "Q", descriptor = "I")
    public static int field2765;

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(ILie;)Llf;")
    public static final class217 method1327(int arg0, class6 arg1) {
        field2762++;
        if (arg0 == 8966) {
            class499 var2 = class473.method2932(arg1, (byte) -95);
            int var3 = arg1.method72(-20);
            int var4 = arg1.method72(-95);
            return new class217(var2.field7323, var2.field7322, var2.field7318, var2.field7314, var2.field7317, var2.field7316, var2.field7319, var2.field7324, var2.field7321, var3, var4);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(I)V")
    public static void method1328(int arg0) {
        field2766 = null;
        if (arg0 <= 42) {
            field2766 = null;
        }
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(BII)Z")
    public final boolean method1329(byte arg0, int arg1, int arg2) {
        if (arg0 != -123) {
            this.method1329((byte) 29, 40, 51);
        }
        field2763++;
        return (arg1 * arg2) <= this.field2756.length;
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(IIIIIBI)V")
    public final void method1330(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        field2758++;
        int var8 = 0;
        if (arg5 > -80) {
            return;
        }
        if (arg1 != arg2) {
            var8 = (arg3 - arg0 << 16) / (arg2 - arg1);
        }
        int var9 = 0;
        if (arg2 != arg6) {
            var9 = (arg4 - arg3 << 16) / (arg6 - arg2);
        }
        int var10 = 0;
        if (arg1 != arg6) {
            var10 = (arg0 - arg4 << 16) / (arg1 - arg6);
        }
        if (arg2 >= arg1 && arg6 >= arg1) {
            if (arg2 >= arg6) {
                int var11;
                int var12 = var11 = arg0 << 16;
                int var13 = arg4 << 16;
                if (arg1 < 0) {
                    var11 -= arg1 * var8;
                    var12 -= arg1 * var10;
                    arg1 = 0;
                }
                if (arg6 < 0) {
                    var13 -= arg6 * var9;
                    arg6 = 0;
                }
                if ((arg1 == arg6 || var10 >= var8) && (arg1 != arg6 || var8 >= var9)) {
                    int var17 = arg2 - arg6;
                    int var18 = arg6 - arg1;
                    int var19 = this.field2759 * arg1;
                    while (true) {
                        var18--;
                        if (var18 < 0) {
                            while (true) {
                                var17--;
                                if (var17 < 0) {
                                    return;
                                }
                                class140.method1195(0, this.field2756, var19, var13 >> 16, var11 >> 16, (byte) 52);
                                var11 += var8;
                                var19 += this.field2759;
                                var13 += var9;
                            }
                        }
                        class140.method1195(0, this.field2756, var19, var12 >> 16, var11 >> 16, (byte) 52);
                        var11 += var8;
                        var12 += var10;
                        var19 += this.field2759;
                    }
                } else {
                    int var14 = arg2 - arg6;
                    int var15 = arg6 - arg1;
                    int var16 = this.field2759 * arg1;
                    while (true) {
                        var15--;
                        if (var15 < 0) {
                            while (true) {
                                var14--;
                                if (var14 < 0) {
                                    return;
                                }
                                class140.method1195(0, this.field2756, var16, var11 >> 16, var13 >> 16, (byte) 52);
                                var11 += var8;
                                var16 += this.field2759;
                                var13 += var9;
                            }
                        }
                        class140.method1195(0, this.field2756, var16, var11 >> 16, var12 >> 16, (byte) 52);
                        var11 += var8;
                        var16 += this.field2759;
                        var12 += var10;
                    }
                }
            } else {
                int var20;
                int var21 = var20 = arg0 << 16;
                if (arg1 < 0) {
                    var21 -= arg1 * var10;
                    var20 -= arg1 * var8;
                    arg1 = 0;
                }
                int var22 = arg3 << 16;
                if (arg2 < 0) {
                    var22 -= arg2 * var9;
                    arg2 = 0;
                }
                if (arg1 != arg2 && var8 > var10 || arg1 == arg2 && var9 < var10) {
                    int var23 = arg6 - arg2;
                    int var24 = arg2 - arg1;
                    int var25 = this.field2759 * arg1;
                    while (true) {
                        var24--;
                        if (var24 < 0) {
                            while (true) {
                                var23--;
                                if (var23 < 0) {
                                    return;
                                }
                                class140.method1195(0, this.field2756, var25, var22 >> 16, var21 >> 16, (byte) 52);
                                var21 += var10;
                                var22 += var9;
                                var25 += this.field2759;
                            }
                        }
                        class140.method1195(0, this.field2756, var25, var20 >> 16, var21 >> 16, (byte) 52);
                        var20 += var8;
                        var21 += var10;
                        var25 += this.field2759;
                    }
                } else {
                    int var26 = arg6 - arg2;
                    int var27 = arg2 - arg1;
                    int var28 = this.field2759 * arg1;
                    while (true) {
                        var27--;
                        if (var27 < 0) {
                            while (true) {
                                var26--;
                                if (var26 < 0) {
                                    return;
                                }
                                class140.method1195(0, this.field2756, var28, var21 >> 16, var22 >> 16, (byte) 52);
                                var21 += var10;
                                var28 += this.field2759;
                                var22 += var9;
                            }
                        }
                        class140.method1195(0, this.field2756, var28, var21 >> 16, var20 >> 16, (byte) 52);
                        var21 += var10;
                        var20 += var8;
                        var28 += this.field2759;
                    }
                }
            }
        } else if (arg6 < arg2) {
            if (arg2 > arg1) {
                int var29;
                int var30 = var29 = arg4 << 16;
                int var31 = arg0 << 16;
                if (arg6 < 0) {
                    var30 -= arg6 * var9;
                    var29 -= arg6 * var10;
                    arg6 = 0;
                }
                if (arg1 < 0) {
                    var31 -= arg1 * var8;
                    arg1 = 0;
                }
                if (var9 < var10) {
                    int var32 = arg2 - arg1;
                    int var33 = arg1 - arg6;
                    int var34 = this.field2759 * arg6;
                    while (true) {
                        var33--;
                        if (var33 < 0) {
                            while (true) {
                                var32--;
                                if (var32 < 0) {
                                    return;
                                }
                                class140.method1195(0, this.field2756, var34, var31 >> 16, var30 >> 16, (byte) 52);
                                var34 += this.field2759;
                                var31 += var8;
                                var30 += var9;
                            }
                        }
                        class140.method1195(0, this.field2756, var34, var29 >> 16, var30 >> 16, (byte) 52);
                        var30 += var9;
                        var34 += this.field2759;
                        var29 += var10;
                    }
                } else {
                    int var35 = arg2 - arg1;
                    int var36 = arg1 - arg6;
                    int var37 = this.field2759 * arg6;
                    while (true) {
                        var36--;
                        if (var36 < 0) {
                            while (true) {
                                var35--;
                                if (var35 < 0) {
                                    return;
                                }
                                class140.method1195(0, this.field2756, var37, var30 >> 16, var31 >> 16, (byte) 52);
                                var30 += var9;
                                var31 += var8;
                                var37 += this.field2759;
                            }
                        }
                        class140.method1195(0, this.field2756, var37, var30 >> 16, var29 >> 16, (byte) 52);
                        var37 += this.field2759;
                        var29 += var10;
                        var30 += var9;
                    }
                }
            } else {
                int var38;
                int var39 = var38 = arg4 << 16;
                int var40 = arg3 << 16;
                if (arg6 < 0) {
                    var38 -= arg6 * var10;
                    var39 -= arg6 * var9;
                    arg6 = 0;
                }
                if (arg2 < 0) {
                    var40 -= arg2 * var8;
                    arg2 = 0;
                }
                if (var10 <= var9) {
                    int var41 = arg1 - arg2;
                    int var42 = arg2 - arg6;
                    int var43 = this.field2759 * arg6;
                    while (true) {
                        var42--;
                        if (var42 < 0) {
                            while (true) {
                                var41--;
                                if (var41 < 0) {
                                    return;
                                }
                                class140.method1195(0, this.field2756, var43, var40 >> 16, var38 >> 16, (byte) 52);
                                var38 += var10;
                                var43 += this.field2759;
                                var40 += var8;
                            }
                        }
                        class140.method1195(0, this.field2756, var43, var39 >> 16, var38 >> 16, (byte) 52);
                        var39 += var9;
                        var43 += this.field2759;
                        var38 += var10;
                    }
                } else {
                    int var44 = arg1 - arg2;
                    int var45 = arg2 - arg6;
                    int var46 = this.field2759 * arg6;
                    while (true) {
                        var45--;
                        if (var45 < 0) {
                            while (true) {
                                var44--;
                                if (var44 < 0) {
                                    return;
                                }
                                class140.method1195(0, this.field2756, var46, var38 >> 16, var40 >> 16, (byte) 52);
                                var40 += var8;
                                var46 += this.field2759;
                                var38 += var10;
                            }
                        }
                        class140.method1195(0, this.field2756, var46, var38 >> 16, var39 >> 16, (byte) 52);
                        var39 += var9;
                        var46 += this.field2759;
                        var38 += var10;
                    }
                }
            }
        } else if (arg1 > arg6) {
            int var47;
            int var48 = var47 = arg3 << 16;
            int var49 = arg4 << 16;
            if (arg2 < 0) {
                var48 -= arg2 * var8;
                var47 -= arg2 * var9;
                arg2 = 0;
            }
            if (arg6 < 0) {
                var49 -= arg6 * var10;
                arg6 = 0;
            }
            if (arg2 != arg6 && var9 > var8 || arg2 == arg6 && var10 < var8) {
                int var50 = arg1 - arg6;
                int var51 = arg6 - arg2;
                int var52 = this.field2759 * arg2;
                while (true) {
                    var51--;
                    if (var51 < 0) {
                        while (true) {
                            var50--;
                            if (var50 < 0) {
                                return;
                            }
                            class140.method1195(0, this.field2756, var52, var49 >> 16, var48 >> 16, (byte) 52);
                            var49 += var10;
                            var52 += this.field2759;
                            var48 += var8;
                        }
                    }
                    class140.method1195(0, this.field2756, var52, var47 >> 16, var48 >> 16, (byte) 52);
                    var52 += this.field2759;
                    var47 += var9;
                    var48 += var8;
                }
            } else {
                int var53 = arg1 - arg6;
                int var54 = arg6 - arg2;
                int var55 = this.field2759 * arg2;
                while (true) {
                    var54--;
                    if (var54 < 0) {
                        while (true) {
                            var53--;
                            if (var53 < 0) {
                                return;
                            }
                            class140.method1195(0, this.field2756, var55, var48 >> 16, var49 >> 16, (byte) 52);
                            var55 += this.field2759;
                            var49 += var10;
                            var48 += var8;
                        }
                    }
                    class140.method1195(0, this.field2756, var55, var48 >> 16, var47 >> 16, (byte) 52);
                    var47 += var9;
                    var55 += this.field2759;
                    var48 += var8;
                }
            }
        } else {
            int var56;
            int var57 = var56 = arg3 << 16;
            if (arg2 < 0) {
                var56 -= arg2 * var9;
                var57 -= arg2 * var8;
                arg2 = 0;
            }
            int var58 = arg0 << 16;
            if (arg1 < 0) {
                var58 -= arg1 * var10;
                arg1 = 0;
            }
            if (var8 < var9) {
                int var59 = arg6 - arg1;
                int var60 = arg1 - arg2;
                int var61 = this.field2759 * arg2;
                while (true) {
                    var60--;
                    if (var60 < 0) {
                        while (true) {
                            var59--;
                            if (var59 < 0) {
                                return;
                            }
                            class140.method1195(0, this.field2756, var61, var56 >> 16, var58 >> 16, (byte) 52);
                            var61 += this.field2759;
                            var56 += var9;
                            var58 += var10;
                        }
                    }
                    class140.method1195(0, this.field2756, var61, var56 >> 16, var57 >> 16, (byte) 52);
                    var61 += this.field2759;
                    var57 += var8;
                    var56 += var9;
                }
            } else {
                int var62 = arg6 - arg1;
                int var63 = arg1 - arg2;
                int var64 = this.field2759 * arg2;
                while (true) {
                    var63--;
                    if (var63 < 0) {
                        while (true) {
                            var62--;
                            if (var62 < 0) {
                                return;
                            }
                            class140.method1195(0, this.field2756, var64, var58 >> 16, var56 >> 16, (byte) 52);
                            var64 += this.field2759;
                            var56 += var9;
                            var58 += var10;
                        }
                    }
                    class140.method1195(0, this.field2756, var64, var57 >> 16, var56 >> 16, (byte) 52);
                    var64 += this.field2759;
                    var57 += var8;
                    var56 += var9;
                }
            }
        }
    }

    @OriginalMember(owner = "client!wp", name = "e", descriptor = "(B)V")
    public final void method1331(byte arg0) {
        field2764++;
        int var2 = 91 % ((-arg0 - 10) / 40);
        int var3 = -1;
        int var4 = this.field2756.length - 8;
        while (var3 < var4) {
            var3++;
            this.field2756[var3] = 0;
            var3++;
            this.field2756[var3] = 0;
            var3++;
            this.field2756[var3] = 0;
            var3++;
            this.field2756[var3] = 0;
            var3++;
            this.field2756[var3] = 0;
            var3++;
            this.field2756[var3] = 0;
            var3++;
            this.field2756[var3] = 0;
            var3++;
            this.field2756[var3] = 0;
        }
        while (var3 < this.field2756.length - 1) {
            var3++;
            this.field2756[var3] = 0;
        }
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(Z)V")
    public static final void method1332(boolean arg0) {
        if (arg0) {
            class454.field6818 = class524.field7645;
            class587.field8346 = class493.field7208;
        } else {
            class454.field6818 = class500.field7343;
            class587.field8346 = class491.field7187;
        }
        class524.field7649 = class454.field6818.length;
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(IIIII)V")
    public final void method1333(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field2757 = arg0 - arg1;
        field2765++;
        this.field2760 = arg1;
        this.field2759 = arg2 - arg4;
        this.field2761 = arg4;
        if (arg3 != -1204258192) {
            this.field2756 = null;
        }
    }

    @OriginalMember(owner = "client!wp", name = "<init>", descriptor = "(Lrr;II)V")
    public class164(class332 arg0, int arg1, int arg2) {
        this.field2756 = new byte[arg1 * arg2];
    }
}
