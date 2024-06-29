import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ss")
public class class429 extends class181 {

    @OriginalMember(owner = "client!ss", name = "R", descriptor = "[B")
    public byte[] field6007;

    @OriginalMember(owner = "client!ss", name = "Q", descriptor = "[Ljava/lang/String;")
    public static String[] field6006 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!ss", name = "F", descriptor = "I")
    public static int field5996;

    @OriginalMember(owner = "client!ss", name = "G", descriptor = "I")
    public static int field5997;

    @OriginalMember(owner = "client!ss", name = "I", descriptor = "I")
    public static int field5998;

    @OriginalMember(owner = "client!ss", name = "J", descriptor = "I")
    public int field5999;

    @OriginalMember(owner = "client!ss", name = "K", descriptor = "I")
    public static int field6000;

    @OriginalMember(owner = "client!ss", name = "L", descriptor = "I")
    public int field6001;

    @OriginalMember(owner = "client!ss", name = "N", descriptor = "I")
    public static int field6003;

    @OriginalMember(owner = "client!ss", name = "O", descriptor = "I")
    public int field6004;

    @OriginalMember(owner = "client!ss", name = "P", descriptor = "I")
    public int field6005;

    @OriginalMember(owner = "client!ss", name = "S", descriptor = "I")
    public static int field6008;

    @OriginalMember(owner = "client!ss", name = "M", descriptor = "Ljava/lang/Object;")
    public static Object field6002;

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(III)Z")
    public final boolean method2603(int arg0, int arg1, int arg2) {
        if (arg0 != 924832720) {
            method2605(true);
        }
        field5996++;
        return (arg1 * arg2) <= this.field6007.length;
    }

    @OriginalMember(owner = "client!ss", name = "h", descriptor = "(I)V")
    public final void method2604(int arg0) {
        field6008++;
        if (arg0 != -18492) {
            return;
        }
        int var2 = -1;
        int var3 = this.field6007.length - 8;
        while (var2 < var3) {
            var2++;
            this.field6007[var2] = 0;
            var2++;
            this.field6007[var2] = 0;
            var2++;
            this.field6007[var2] = 0;
            var2++;
            this.field6007[var2] = 0;
            var2++;
            this.field6007[var2] = 0;
            var2++;
            this.field6007[var2] = 0;
            var2++;
            this.field6007[var2] = 0;
            var2++;
            this.field6007[var2] = 0;
        }
        while (var2 < this.field6007.length - 1) {
            var2++;
            this.field6007[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(Z)V")
    public static void method2605(boolean arg0) {
        field6006 = null;
        if (!arg0) {
            field6000 = -32;
        }
        field6002 = null;
    }

    @OriginalMember(owner = "client!ss", name = "c", descriptor = "(B)V")
    public static final void method2606(byte arg0) {
        int var1 = 113 % ((arg0 + 23) / 58);
        for (int var2 = 0; var2 < class152.field2290; var2++) {
            int var3 = class323.field4590[var2];
            class272 var4 = (class272) class758.field10539.method4203(true, (long) var3);
            if (var4 != null) {
                class84 var5 = var4.field3885;
                class515.method3069((byte) 98, var5.field1523.field6911, var5);
            }
        }
        field6003++;
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(IIIII)V")
    public final void method2607(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5998++;
        this.field6004 = arg3;
        this.field6005 = arg2 - arg3;
        this.field6001 = arg4 - arg1;
        this.field5999 = arg1;
        if (arg0 != 0) {
            this.field6007 = null;
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(IIIIBII)V")
    public final void method2608(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        if (arg4 >= -58) {
            this.method2604(-66);
        }
        field5997++;
        int var8 = 0;
        if (arg0 != arg3) {
            var8 = (arg5 - arg6 << 16) / (arg3 - arg0);
        }
        int var9 = 0;
        if (arg1 != arg3) {
            var9 = (arg2 - arg5 << 16) / (arg1 - arg3);
        }
        int var10 = 0;
        if (arg0 != arg1) {
            var10 = (arg6 - arg2 << 16) / (arg0 - arg1);
        }
        if (arg0 <= arg3 && arg0 <= arg1) {
            if (arg1 > arg3) {
                int var11;
                int var12 = var11 = arg6 << 16;
                int var13 = arg5 << 16;
                if (arg0 < 0) {
                    var11 -= arg0 * var8;
                    var12 -= arg0 * var10;
                    arg0 = 0;
                }
                if (arg3 < 0) {
                    var13 -= arg3 * var9;
                    arg3 = 0;
                }
                if (arg0 != arg3 && var8 > var10 || arg0 == arg3 && var9 < var10) {
                    int var14 = arg1 - arg3;
                    int var15 = arg3 - arg0;
                    int var16 = this.field6005 * arg0;
                    while (true) {
                        var15--;
                        if (var15 < 0) {
                            while (true) {
                                var14--;
                                if (var14 < 0) {
                                    return;
                                }
                                class558.method3280(var12 >> 16, var16, var13 >> 16, -637946526, 0, this.field6007);
                                var13 += var9;
                                var12 += var10;
                                var16 += this.field6005;
                            }
                        }
                        class558.method3280(var12 >> 16, var16, var11 >> 16, -637946526, 0, this.field6007);
                        var16 += this.field6005;
                        var11 += var8;
                        var12 += var10;
                    }
                } else {
                    int var17 = arg1 - arg3;
                    int var18 = arg3 - arg0;
                    int var19 = this.field6005 * arg0;
                    while (true) {
                        var18--;
                        if (var18 < 0) {
                            while (true) {
                                var17--;
                                if (var17 < 0) {
                                    return;
                                }
                                class558.method3280(var13 >> 16, var19, var12 >> 16, -637946526, 0, this.field6007);
                                var19 += this.field6005;
                                var12 += var10;
                                var13 += var9;
                            }
                        }
                        class558.method3280(var11 >> 16, var19, var12 >> 16, -637946526, 0, this.field6007);
                        var12 += var10;
                        var11 += var8;
                        var19 += this.field6005;
                    }
                }
            } else {
                int var20;
                int var21 = var20 = arg6 << 16;
                int var22 = arg2 << 16;
                if (arg0 < 0) {
                    var20 -= arg0 * var8;
                    var21 -= arg0 * var10;
                    arg0 = 0;
                }
                if (arg1 < 0) {
                    var22 -= arg1 * var9;
                    arg1 = 0;
                }
                if (arg0 != arg1 && var8 > var10 || arg0 == arg1 && var8 < var9) {
                    int var23 = arg3 - arg1;
                    int var24 = arg1 - arg0;
                    int var25 = this.field6005 * arg0;
                    while (true) {
                        var24--;
                        if (var24 < 0) {
                            while (true) {
                                var23--;
                                if (var23 < 0) {
                                    return;
                                }
                                class558.method3280(var22 >> 16, var25, var20 >> 16, -637946526, 0, this.field6007);
                                var20 += var8;
                                var25 += this.field6005;
                                var22 += var9;
                            }
                        }
                        class558.method3280(var21 >> 16, var25, var20 >> 16, -637946526, 0, this.field6007);
                        var21 += var10;
                        var20 += var8;
                        var25 += this.field6005;
                    }
                } else {
                    int var26 = arg3 - arg1;
                    int var27 = arg1 - arg0;
                    int var28 = this.field6005 * arg0;
                    while (true) {
                        var27--;
                        if (var27 < 0) {
                            while (true) {
                                var26--;
                                if (var26 < 0) {
                                    return;
                                }
                                class558.method3280(var20 >> 16, var28, var22 >> 16, -637946526, 0, this.field6007);
                                var20 += var8;
                                var28 += this.field6005;
                                var22 += var9;
                            }
                        }
                        class558.method3280(var20 >> 16, var28, var21 >> 16, -637946526, 0, this.field6007);
                        var20 += var8;
                        var28 += this.field6005;
                        var21 += var10;
                    }
                }
            }
        } else if (arg3 <= arg1) {
            if (arg1 >= arg0) {
                int var29;
                int var30 = var29 = arg5 << 16;
                if (arg3 < 0) {
                    var29 -= arg3 * var9;
                    var30 -= arg3 * var8;
                    arg3 = 0;
                }
                int var31 = arg6 << 16;
                if (arg0 < 0) {
                    var31 -= arg0 * var10;
                    arg0 = 0;
                }
                if (var9 <= var8) {
                    int var32 = arg1 - arg0;
                    int var33 = arg0 - arg3;
                    int var34 = this.field6005 * arg3;
                    while (true) {
                        var33--;
                        if (var33 < 0) {
                            while (true) {
                                var32--;
                                if (var32 < 0) {
                                    return;
                                }
                                class558.method3280(var29 >> 16, var34, var31 >> 16, -637946526, 0, this.field6007);
                                var29 += var9;
                                var34 += this.field6005;
                                var31 += var10;
                            }
                        }
                        class558.method3280(var29 >> 16, var34, var30 >> 16, -637946526, 0, this.field6007);
                        var34 += this.field6005;
                        var29 += var9;
                        var30 += var8;
                    }
                } else {
                    int var35 = arg1 - arg0;
                    int var36 = arg0 - arg3;
                    int var37 = this.field6005 * arg3;
                    while (true) {
                        var36--;
                        if (var36 < 0) {
                            while (true) {
                                var35--;
                                if (var35 < 0) {
                                    return;
                                }
                                class558.method3280(var31 >> 16, var37, var29 >> 16, -637946526, 0, this.field6007);
                                var29 += var9;
                                var31 += var10;
                                var37 += this.field6005;
                            }
                        }
                        class558.method3280(var30 >> 16, var37, var29 >> 16, -637946526, 0, this.field6007);
                        var29 += var9;
                        var30 += var8;
                        var37 += this.field6005;
                    }
                }
            } else {
                int var38;
                int var39 = var38 = arg5 << 16;
                if (arg3 < 0) {
                    var39 -= arg3 * var8;
                    var38 -= arg3 * var9;
                    arg3 = 0;
                }
                int var40 = arg2 << 16;
                if (arg1 < 0) {
                    var40 -= arg1 * var10;
                    arg1 = 0;
                }
                if (arg1 != arg3 && var8 < var9 || arg1 == arg3 && var8 > var10) {
                    int var41 = arg0 - arg1;
                    int var42 = arg1 - arg3;
                    int var43 = this.field6005 * arg3;
                    while (true) {
                        var42--;
                        if (var42 < 0) {
                            while (true) {
                                var41--;
                                if (var41 < 0) {
                                    return;
                                }
                                class558.method3280(var39 >> 16, var43, var40 >> 16, -637946526, 0, this.field6007);
                                var39 += var8;
                                var43 += this.field6005;
                                var40 += var10;
                            }
                        }
                        class558.method3280(var39 >> 16, var43, var38 >> 16, -637946526, 0, this.field6007);
                        var38 += var9;
                        var43 += this.field6005;
                        var39 += var8;
                    }
                } else {
                    int var44 = arg0 - arg1;
                    int var45 = arg1 - arg3;
                    int var46 = this.field6005 * arg3;
                    while (true) {
                        var45--;
                        if (var45 < 0) {
                            while (true) {
                                var44--;
                                if (var44 < 0) {
                                    return;
                                }
                                class558.method3280(var40 >> 16, var46, var39 >> 16, -637946526, 0, this.field6007);
                                var46 += this.field6005;
                                var39 += var8;
                                var40 += var10;
                            }
                        }
                        class558.method3280(var38 >> 16, var46, var39 >> 16, -637946526, 0, this.field6007);
                        var46 += this.field6005;
                        var38 += var9;
                        var39 += var8;
                    }
                }
            }
        } else if (arg3 <= arg0) {
            int var47;
            int var48 = var47 = arg2 << 16;
            if (arg1 < 0) {
                var48 -= arg1 * var9;
                var47 -= arg1 * var10;
                arg1 = 0;
            }
            int var49 = arg5 << 16;
            if (arg3 < 0) {
                var49 -= arg3 * var8;
                arg3 = 0;
            }
            if (var9 < var10) {
                int var50 = arg0 - arg3;
                int var51 = arg3 - arg1;
                int var52 = this.field6005 * arg1;
                while (true) {
                    var51--;
                    if (var51 < 0) {
                        while (true) {
                            var50--;
                            if (var50 < 0) {
                                return;
                            }
                            class558.method3280(var49 >> 16, var52, var47 >> 16, -637946526, 0, this.field6007);
                            var52 += this.field6005;
                            var47 += var10;
                            var49 += var8;
                        }
                    }
                    class558.method3280(var48 >> 16, var52, var47 >> 16, -637946526, 0, this.field6007);
                    var47 += var10;
                    var52 += this.field6005;
                    var48 += var9;
                }
            } else {
                int var53 = arg0 - arg3;
                int var54 = arg3 - arg1;
                int var55 = this.field6005 * arg1;
                while (true) {
                    var54--;
                    if (var54 < 0) {
                        while (true) {
                            var53--;
                            if (var53 < 0) {
                                return;
                            }
                            class558.method3280(var47 >> 16, var55, var49 >> 16, -637946526, 0, this.field6007);
                            var55 += this.field6005;
                            var49 += var8;
                            var47 += var10;
                        }
                    }
                    class558.method3280(var47 >> 16, var55, var48 >> 16, -637946526, 0, this.field6007);
                    var55 += this.field6005;
                    var48 += var9;
                    var47 += var10;
                }
            }
        } else {
            int var56;
            int var57 = var56 = arg2 << 16;
            int var58 = arg6 << 16;
            if (arg1 < 0) {
                var56 -= arg1 * var10;
                var57 -= arg1 * var9;
                arg1 = 0;
            }
            if (arg0 < 0) {
                var58 -= arg0 * var8;
                arg0 = 0;
            }
            if (var9 >= var10) {
                int var59 = arg3 - arg0;
                int var60 = arg0 - arg1;
                int var61 = this.field6005 * arg1;
                while (true) {
                    var60--;
                    if (var60 < 0) {
                        while (true) {
                            var59--;
                            if (var59 < 0) {
                                return;
                            }
                            class558.method3280(var58 >> 16, var61, var57 >> 16, -637946526, 0, this.field6007);
                            var61 += this.field6005;
                            var58 += var8;
                            var57 += var9;
                        }
                    }
                    class558.method3280(var56 >> 16, var61, var57 >> 16, -637946526, 0, this.field6007);
                    var56 += var10;
                    var61 += this.field6005;
                    var57 += var9;
                }
            } else {
                int var62 = arg3 - arg0;
                int var63 = arg0 - arg1;
                int var64 = this.field6005 * arg1;
                while (true) {
                    var63--;
                    if (var63 < 0) {
                        while (true) {
                            var62--;
                            if (var62 < 0) {
                                return;
                            }
                            class558.method3280(var57 >> 16, var64, var58 >> 16, -637946526, 0, this.field6007);
                            var58 += var8;
                            var64 += this.field6005;
                            var57 += var9;
                        }
                    }
                    class558.method3280(var57 >> 16, var64, var56 >> 16, -637946526, 0, this.field6007);
                    var56 += var10;
                    var57 += var9;
                    var64 += this.field6005;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ss", name = "<init>", descriptor = "(Loea;II)V")
    public class429(class594 arg0, int arg1, int arg2) {
        this.field6007 = new byte[arg1 * arg2];
    }
}
