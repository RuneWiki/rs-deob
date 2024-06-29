import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ffa")
public class class170 extends class54 {

    @OriginalMember(owner = "client!ffa", name = "F", descriptor = "[B")
    public byte[] field2834;

    @OriginalMember(owner = "client!ffa", name = "B", descriptor = "I")
    public static int field2831 = 1;

    @OriginalMember(owner = "client!ffa", name = "v", descriptor = "I")
    public int field2825;

    @OriginalMember(owner = "client!ffa", name = "w", descriptor = "I")
    public static int field2826;

    @OriginalMember(owner = "client!ffa", name = "x", descriptor = "I")
    public static int field2827;

    @OriginalMember(owner = "client!ffa", name = "y", descriptor = "I")
    public int field2828;

    @OriginalMember(owner = "client!ffa", name = "z", descriptor = "I")
    public static int field2829;

    @OriginalMember(owner = "client!ffa", name = "A", descriptor = "I")
    public int field2830;

    @OriginalMember(owner = "client!ffa", name = "C", descriptor = "I")
    public static int field2832;

    @OriginalMember(owner = "client!ffa", name = "E", descriptor = "I")
    public static int field2833;

    @OriginalMember(owner = "client!ffa", name = "H", descriptor = "I")
    public int field2835;

    @OriginalMember(owner = "client!ffa", name = "I", descriptor = "I")
    public static int field2836;

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(IIIIIII)V")
    public final void method1284(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2829++;
        int var8 = 0;
        if (arg0 != arg2) {
            var8 = (arg6 - arg1 << 16) / (arg0 - arg2);
        }
        int var9 = arg5;
        if (arg0 != arg3) {
            var9 = (arg4 - arg6 << 16) / (arg3 - arg0);
        }
        int var10 = 0;
        if (arg2 != arg3) {
            var10 = (arg1 - arg4 << 16) / (arg2 - arg3);
        }
        if (arg2 <= arg0 && arg2 <= arg3) {
            if (arg3 > arg0) {
                int var11;
                int var12 = var11 = arg1 << 16;
                if (arg2 < 0) {
                    var11 -= arg2 * var8;
                    var12 -= arg2 * var10;
                    arg2 = 0;
                }
                int var13 = arg6 << 16;
                if (arg0 < 0) {
                    var13 -= arg0 * var9;
                    arg0 = 0;
                }
                if ((arg0 == arg2 || var8 <= var10) && (arg0 != arg2 || var9 >= var10)) {
                    int var17 = arg3 - arg0;
                    int var18 = arg0 - arg2;
                    int var19 = this.field2835 * arg2;
                    while (true) {
                        var18--;
                        if (var18 < 0) {
                            while (true) {
                                var17--;
                                if (var17 < 0) {
                                    return;
                                }
                                class231.method1565(0, var19, this.field2834, 0, var12 >> 16, var13 >> 16);
                                var13 += var9;
                                var19 += this.field2835;
                                var12 += var10;
                            }
                        }
                        class231.method1565(arg5, var19, this.field2834, 0, var12 >> 16, var11 >> 16);
                        var19 += this.field2835;
                        var11 += var8;
                        var12 += var10;
                    }
                } else {
                    int var14 = arg3 - arg0;
                    int var15 = arg0 - arg2;
                    int var16 = this.field2835 * arg2;
                    while (true) {
                        var15--;
                        if (var15 < 0) {
                            while (true) {
                                var14--;
                                if (var14 < 0) {
                                    return;
                                }
                                class231.method1565(0, var16, this.field2834, 0, var13 >> 16, var12 >> 16);
                                var12 += var10;
                                var13 += var9;
                                var16 += this.field2835;
                            }
                        }
                        class231.method1565(arg5, var16, this.field2834, 0, var11 >> 16, var12 >> 16);
                        var12 += var10;
                        var16 += this.field2835;
                        var11 += var8;
                    }
                }
            } else {
                int var20;
                int var21 = var20 = arg1 << 16;
                int var22 = arg4 << 16;
                if (arg2 < 0) {
                    var21 -= arg2 * var10;
                    var20 -= arg2 * var8;
                    arg2 = 0;
                }
                if (arg3 < 0) {
                    var22 -= arg3 * var9;
                    arg3 = 0;
                }
                if ((arg2 == arg3 || var10 >= var8) && (arg2 != arg3 || var8 >= var9)) {
                    int var26 = arg0 - arg3;
                    int var27 = arg3 - arg2;
                    int var28 = this.field2835 * arg2;
                    while (true) {
                        var27--;
                        if (var27 < 0) {
                            while (true) {
                                var26--;
                                if (var26 < 0) {
                                    return;
                                }
                                class231.method1565(0, var28, this.field2834, 0, var22 >> 16, var20 >> 16);
                                var28 += this.field2835;
                                var20 += var8;
                                var22 += var9;
                            }
                        }
                        class231.method1565(0, var28, this.field2834, 0, var21 >> 16, var20 >> 16);
                        var28 += this.field2835;
                        var20 += var8;
                        var21 += var10;
                    }
                } else {
                    int var23 = arg0 - arg3;
                    int var24 = arg3 - arg2;
                    int var25 = this.field2835 * arg2;
                    while (true) {
                        var24--;
                        if (var24 < 0) {
                            while (true) {
                                var23--;
                                if (var23 < 0) {
                                    return;
                                }
                                class231.method1565(0, var25, this.field2834, 0, var20 >> 16, var22 >> 16);
                                var20 += var8;
                                var25 += this.field2835;
                                var22 += var9;
                            }
                        }
                        class231.method1565(0, var25, this.field2834, 0, var20 >> 16, var21 >> 16);
                        var20 += var8;
                        var25 += this.field2835;
                        var21 += var10;
                    }
                }
            }
        } else if (arg0 > arg3) {
            if (arg2 < arg0) {
                int var29;
                int var30 = var29 = arg4 << 16;
                int var31 = arg1 << 16;
                if (arg3 < 0) {
                    var30 -= arg3 * var9;
                    var29 -= arg3 * var10;
                    arg3 = 0;
                }
                if (arg2 < 0) {
                    var31 -= arg2 * var8;
                    arg2 = 0;
                }
                if (var10 > var9) {
                    int var32 = arg0 - arg2;
                    int var33 = arg2 - arg3;
                    int var34 = this.field2835 * arg3;
                    while (true) {
                        var33--;
                        if (var33 < 0) {
                            while (true) {
                                var32--;
                                if (var32 < 0) {
                                    return;
                                }
                                class231.method1565(0, var34, this.field2834, 0, var31 >> 16, var30 >> 16);
                                var31 += var8;
                                var30 += var9;
                                var34 += this.field2835;
                            }
                        }
                        class231.method1565(0, var34, this.field2834, 0, var29 >> 16, var30 >> 16);
                        var34 += this.field2835;
                        var30 += var9;
                        var29 += var10;
                    }
                } else {
                    int var35 = arg0 - arg2;
                    int var36 = arg2 - arg3;
                    int var37 = this.field2835 * arg3;
                    while (true) {
                        var36--;
                        if (var36 < 0) {
                            while (true) {
                                var35--;
                                if (var35 < 0) {
                                    return;
                                }
                                class231.method1565(arg5, var37, this.field2834, 0, var30 >> 16, var31 >> 16);
                                var37 += this.field2835;
                                var30 += var9;
                                var31 += var8;
                            }
                        }
                        class231.method1565(0, var37, this.field2834, 0, var30 >> 16, var29 >> 16);
                        var29 += var10;
                        var30 += var9;
                        var37 += this.field2835;
                    }
                }
            } else {
                int var38;
                int var39 = var38 = arg4 << 16;
                if (arg3 < 0) {
                    var38 -= arg3 * var10;
                    var39 -= arg3 * var9;
                    arg3 = 0;
                }
                int var40 = arg6 << 16;
                if (arg0 < 0) {
                    var40 -= arg0 * var8;
                    arg0 = 0;
                }
                if (var10 > var9) {
                    int var41 = arg2 - arg0;
                    int var42 = arg0 - arg3;
                    int var43 = this.field2835 * arg3;
                    while (true) {
                        var42--;
                        if (var42 < 0) {
                            while (true) {
                                var41--;
                                if (var41 < 0) {
                                    return;
                                }
                                class231.method1565(0, var43, this.field2834, 0, var38 >> 16, var40 >> 16);
                                var43 += this.field2835;
                                var38 += var10;
                                var40 += var8;
                            }
                        }
                        class231.method1565(0, var43, this.field2834, 0, var38 >> 16, var39 >> 16);
                        var43 += this.field2835;
                        var39 += var9;
                        var38 += var10;
                    }
                } else {
                    int var44 = arg2 - arg0;
                    int var45 = arg0 - arg3;
                    int var46 = this.field2835 * arg3;
                    while (true) {
                        var45--;
                        if (var45 < 0) {
                            while (true) {
                                var44--;
                                if (var44 < 0) {
                                    return;
                                }
                                class231.method1565(0, var46, this.field2834, 0, var40 >> 16, var38 >> 16);
                                var38 += var10;
                                var46 += this.field2835;
                                var40 += var8;
                            }
                        }
                        class231.method1565(0, var46, this.field2834, 0, var39 >> 16, var38 >> 16);
                        var46 += this.field2835;
                        var39 += var9;
                        var38 += var10;
                    }
                }
            }
        } else if (arg3 < arg2) {
            int var47;
            int var48 = var47 = arg6 << 16;
            int var49 = arg4 << 16;
            if (arg0 < 0) {
                var48 -= arg0 * var8;
                var47 -= arg0 * var9;
                arg0 = 0;
            }
            if (arg3 < 0) {
                var49 -= arg3 * var10;
                arg3 = 0;
            }
            if ((arg0 == arg3 || var9 <= var8) && (arg0 != arg3 || var10 >= var8)) {
                int var53 = arg2 - arg3;
                int var54 = arg3 - arg0;
                int var55 = this.field2835 * arg0;
                while (true) {
                    var54--;
                    if (var54 < 0) {
                        while (true) {
                            var53--;
                            if (var53 < 0) {
                                return;
                            }
                            class231.method1565(0, var55, this.field2834, 0, var48 >> 16, var49 >> 16);
                            var49 += var10;
                            var55 += this.field2835;
                            var48 += var8;
                        }
                    }
                    class231.method1565(0, var55, this.field2834, 0, var48 >> 16, var47 >> 16);
                    var55 += this.field2835;
                    var47 += var9;
                    var48 += var8;
                }
            } else {
                int var50 = arg2 - arg3;
                int var51 = arg3 - arg0;
                int var52 = this.field2835 * arg0;
                while (true) {
                    var51--;
                    if (var51 < 0) {
                        while (true) {
                            var50--;
                            if (var50 < 0) {
                                return;
                            }
                            class231.method1565(0, var52, this.field2834, 0, var49 >> 16, var48 >> 16);
                            var49 += var10;
                            var48 += var8;
                            var52 += this.field2835;
                        }
                    }
                    class231.method1565(0, var52, this.field2834, 0, var47 >> 16, var48 >> 16);
                    var52 += this.field2835;
                    var48 += var8;
                    var47 += var9;
                }
            }
        } else {
            int var56;
            int var57 = var56 = arg6 << 16;
            if (arg0 < 0) {
                var57 -= arg0 * var8;
                var56 -= arg0 * var9;
                arg0 = 0;
            }
            int var58 = arg1 << 16;
            if (arg2 < 0) {
                var58 -= arg2 * var10;
                arg2 = 0;
            }
            if (var9 > var8) {
                int var59 = arg3 - arg2;
                int var60 = arg2 - arg0;
                int var61 = this.field2835 * arg0;
                while (true) {
                    var60--;
                    if (var60 < 0) {
                        while (true) {
                            var59--;
                            if (var59 < 0) {
                                return;
                            }
                            class231.method1565(0, var61, this.field2834, 0, var56 >> 16, var58 >> 16);
                            var58 += var10;
                            var56 += var9;
                            var61 += this.field2835;
                        }
                    }
                    class231.method1565(0, var61, this.field2834, 0, var56 >> 16, var57 >> 16);
                    var61 += this.field2835;
                    var56 += var9;
                    var57 += var8;
                }
            } else {
                int var62 = arg3 - arg2;
                int var63 = arg2 - arg0;
                int var64 = this.field2835 * arg0;
                while (true) {
                    var63--;
                    if (var63 < 0) {
                        while (true) {
                            var62--;
                            if (var62 < 0) {
                                return;
                            }
                            class231.method1565(0, var64, this.field2834, 0, var58 >> 16, var56 >> 16);
                            var64 += this.field2835;
                            var56 += var9;
                            var58 += var10;
                        }
                    }
                    class231.method1565(0, var64, this.field2834, 0, var57 >> 16, var56 >> 16);
                    var64 += this.field2835;
                    var57 += var8;
                    var56 += var9;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(III)Z")
    public final boolean method1285(int arg0, int arg1, int arg2) {
        field2826++;
        int var4 = 8 % ((arg2 + 45) / 61);
        return arg0 * arg1 <= this.field2834.length;
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(IIIII)V")
    public final void method1286(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field2825 = arg3;
        this.field2830 = arg2 - arg0;
        if (arg1 != 64) {
            field2831 = -121;
        }
        this.field2828 = arg0;
        field2836++;
        this.field2835 = arg4 - arg3;
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(I[[BLdw;)V")
    public static final void method1287(int arg0, byte[][] arg1, class669 arg2) {
        if (arg0 != -23170) {
            field2831 = -46;
        }
        field2833++;
        int var3 = class408.field5904.length;
        for (int var4 = 0; var4 < var3; var4++) {
            byte[] var5 = arg1[var4];
            if (var5 != null) {
                int var6 = (class335.field5019[var4] >> 8) * 64 - class33.field967;
                int var7 = (class335.field5019[var4] & 0xFF) * 64 - class323.field4749;
                class418.method2539(false);
                arg2.method3785(var5, var6, var7, class223.field3352, class623.field9017, arg0 ^ 0x5AC1);
            }
        }
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "([BB)V")
    public static final void method1288(byte[] arg0, byte arg1) {
        field2832++;
        class61 var2 = new class61(arg0);
        if (arg1 >= -53) {
            return;
        }
        while (true) {
            int var3 = var2.method732(-559537960);
            if (var3 == 0) {
                return;
            }
            if (var3 == 2) {
                class438.field6314 = var2.method723((byte) -25);
            }
        }
    }

    @OriginalMember(owner = "client!ffa", name = "<init>", descriptor = "(Lus;II)V")
    public class170(class1 arg0, int arg1, int arg2) {
        this.field2834 = new byte[arg1 * arg2];
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(I)V")
    public final void method1289(int arg0) {
        field2827++;
        if (arg0 < 46) {
            this.field2830 = 124;
        }
        int var2 = -1;
        int var3 = this.field2834.length - 8;
        while (var3 > var2) {
            var2++;
            this.field2834[var2] = 0;
            var2++;
            this.field2834[var2] = 0;
            var2++;
            this.field2834[var2] = 0;
            var2++;
            this.field2834[var2] = 0;
            var2++;
            this.field2834[var2] = 0;
            var2++;
            this.field2834[var2] = 0;
            var2++;
            this.field2834[var2] = 0;
            var2++;
            this.field2834[var2] = 0;
        }
        while (var2 < (this.field2834.length - 1)) {
            var2++;
            this.field2834[var2] = 0;
        }
    }
}
