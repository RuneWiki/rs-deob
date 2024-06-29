import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class292 extends class377 {

    @OriginalMember(owner = "client!wg", name = "G", descriptor = "[B")
    public byte[] field3828;

    @OriginalMember(owner = "client!wg", name = "J", descriptor = "[I")
    public static int[] field3831 = new int[16];

    @OriginalMember(owner = "client!wg", name = "L", descriptor = "[Ljava/awt/Color;")
    public static Color[] field3833 = new Color[] { new Color(9179409), new Color(16777215) };

    @OriginalMember(owner = "client!wg", name = "S", descriptor = "Lcu;")
    public static class145 field3839 = new class145(15, -1);

    @OriginalMember(owner = "client!wg", name = "E", descriptor = "I")
    public static int field3826;

    @OriginalMember(owner = "client!wg", name = "F", descriptor = "I")
    public int field3827;

    @OriginalMember(owner = "client!wg", name = "H", descriptor = "I")
    public int field3829;

    @OriginalMember(owner = "client!wg", name = "I", descriptor = "I")
    public static int field3830;

    @OriginalMember(owner = "client!wg", name = "K", descriptor = "I")
    public static int field3832;

    @OriginalMember(owner = "client!wg", name = "M", descriptor = "I")
    public static int field3834;

    @OriginalMember(owner = "client!wg", name = "N", descriptor = "I")
    public int field3835;

    @OriginalMember(owner = "client!wg", name = "O", descriptor = "I")
    public static int field3836;

    @OriginalMember(owner = "client!wg", name = "Q", descriptor = "I")
    public static int field3837;

    @OriginalMember(owner = "client!wg", name = "R", descriptor = "I")
    public int field3838;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIIB)V")
    public final void method1712(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (arg4 <= 89) {
            this.field3835 = 114;
        }
        this.field3838 = arg3;
        field3834++;
        this.field3827 = arg2 - arg3;
        this.field3829 = arg0;
        this.field3835 = arg1 - arg0;
    }

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "(B)V")
    public static void method1713(byte arg0) {
        int var1 = 98 / ((arg0 + 32) / 42);
        field3839 = null;
        field3831 = null;
        field3833 = null;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIIIII)V")
    public final void method1714(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3837++;
        int var8 = 0;
        if (arg0 != arg2) {
            var8 = (arg6 - arg3 << 16) / (arg0 - arg2);
        }
        int var9 = 0;
        if (arg4 != 181458608) {
            method1716(-81, 66, -15, -35, -20, -126, 60, 23, 52);
        }
        if (arg0 != arg5) {
            var9 = (arg1 - arg6 << 16) / (arg5 - arg0);
        }
        int var10 = 0;
        if (arg2 != arg5) {
            var10 = (arg3 - arg1 << 16) / (arg2 - arg5);
        }
        if (arg2 <= arg0 && arg5 >= arg2) {
            if (arg0 < arg5) {
                int var11;
                int var12 = var11 = arg3 << 16;
                int var13 = arg6 << 16;
                if (arg2 < 0) {
                    var12 -= arg2 * var10;
                    var11 -= arg2 * var8;
                    arg2 = 0;
                }
                if (arg0 < 0) {
                    var13 -= arg0 * var9;
                    arg0 = 0;
                }
                if (arg0 != arg2 && var8 > var10 || arg0 == arg2 && var9 < var10) {
                    int var14 = arg5 - arg0;
                    int var15 = arg0 - arg2;
                    int var16 = this.field3835 * arg2;
                    while (true) {
                        var15--;
                        if (var15 < 0) {
                            while (true) {
                                var14--;
                                if (var14 < 0) {
                                    return;
                                }
                                class454.method2586(this.field3828, var13 >> 16, var12 >> 16, 0, var16, -4907);
                                var13 += var9;
                                var12 += var10;
                                var16 += this.field3835;
                            }
                        }
                        class454.method2586(this.field3828, var11 >> 16, var12 >> 16, 0, var16, arg4 ^ 0xF52F3A65);
                        var12 += var10;
                        var11 += var8;
                        var16 += this.field3835;
                    }
                } else {
                    int var17 = arg5 - arg0;
                    int var18 = arg0 - arg2;
                    int var19 = this.field3835 * arg2;
                    while (true) {
                        var18--;
                        if (var18 < 0) {
                            while (true) {
                                var17--;
                                if (var17 < 0) {
                                    return;
                                }
                                class454.method2586(this.field3828, var12 >> 16, var13 >> 16, 0, var19, -4907);
                                var13 += var9;
                                var19 += this.field3835;
                                var12 += var10;
                            }
                        }
                        class454.method2586(this.field3828, var12 >> 16, var11 >> 16, 0, var19, -4907);
                        var19 += this.field3835;
                        var12 += var10;
                        var11 += var8;
                    }
                }
            } else {
                int var20;
                int var21 = var20 = arg3 << 16;
                int var22 = arg1 << 16;
                if (arg2 < 0) {
                    var20 -= arg2 * var8;
                    var21 -= arg2 * var10;
                    arg2 = 0;
                }
                if (arg5 < 0) {
                    var22 -= arg5 * var9;
                    arg5 = 0;
                }
                if (arg2 != arg5 && var10 < var8 || arg2 == arg5 && var8 < var9) {
                    int var23 = arg0 - arg5;
                    int var24 = arg5 - arg2;
                    int var25 = this.field3835 * arg2;
                    while (true) {
                        var24--;
                        if (var24 < 0) {
                            while (true) {
                                var23--;
                                if (var23 < 0) {
                                    return;
                                }
                                class454.method2586(this.field3828, var20 >> 16, var22 >> 16, 0, var25, -4907);
                                var20 += var8;
                                var22 += var9;
                                var25 += this.field3835;
                            }
                        }
                        class454.method2586(this.field3828, var20 >> 16, var21 >> 16, 0, var25, arg4 - 181463515);
                        var20 += var8;
                        var25 += this.field3835;
                        var21 += var10;
                    }
                } else {
                    int var26 = arg0 - arg5;
                    int var27 = arg5 - arg2;
                    int var28 = this.field3835 * arg2;
                    while (true) {
                        var27--;
                        if (var27 < 0) {
                            while (true) {
                                var26--;
                                if (var26 < 0) {
                                    return;
                                }
                                class454.method2586(this.field3828, var22 >> 16, var20 >> 16, 0, var28, -4907);
                                var28 += this.field3835;
                                var22 += var9;
                                var20 += var8;
                            }
                        }
                        class454.method2586(this.field3828, var21 >> 16, var20 >> 16, 0, var28, -4907);
                        var21 += var10;
                        var20 += var8;
                        var28 += this.field3835;
                    }
                }
            }
        } else if (arg5 >= arg0) {
            if (arg5 < arg2) {
                int var29;
                int var30 = var29 = arg6 << 16;
                if (arg0 < 0) {
                    var30 -= arg0 * var8;
                    var29 -= arg0 * var9;
                    arg0 = 0;
                }
                int var31 = arg1 << 16;
                if (arg5 < 0) {
                    var31 -= arg5 * var10;
                    arg5 = 0;
                }
                if ((arg0 == arg5 || var9 <= var8) && (arg0 != arg5 || var8 <= var10)) {
                    int var35 = arg2 - arg5;
                    int var36 = arg5 - arg0;
                    int var37 = this.field3835 * arg0;
                    while (true) {
                        var36--;
                        if (var36 < 0) {
                            while (true) {
                                var35--;
                                if (var35 < 0) {
                                    return;
                                }
                                class454.method2586(this.field3828, var30 >> 16, var31 >> 16, 0, var37, -4907);
                                var37 += this.field3835;
                                var30 += var8;
                                var31 += var10;
                            }
                        }
                        class454.method2586(this.field3828, var30 >> 16, var29 >> 16, 0, var37, -4907);
                        var30 += var8;
                        var29 += var9;
                        var37 += this.field3835;
                    }
                } else {
                    int var32 = arg2 - arg5;
                    int var33 = arg5 - arg0;
                    int var34 = this.field3835 * arg0;
                    while (true) {
                        var33--;
                        if (var33 < 0) {
                            while (true) {
                                var32--;
                                if (var32 < 0) {
                                    return;
                                }
                                class454.method2586(this.field3828, var31 >> 16, var30 >> 16, 0, var34, -4907);
                                var30 += var8;
                                var31 += var10;
                                var34 += this.field3835;
                            }
                        }
                        class454.method2586(this.field3828, var29 >> 16, var30 >> 16, 0, var34, arg4 - 181463515);
                        var30 += var8;
                        var34 += this.field3835;
                        var29 += var9;
                    }
                }
            } else {
                int var38;
                int var39 = var38 = arg6 << 16;
                if (arg0 < 0) {
                    var38 -= arg0 * var9;
                    var39 -= arg0 * var8;
                    arg0 = 0;
                }
                int var40 = arg3 << 16;
                if (arg2 < 0) {
                    var40 -= arg2 * var10;
                    arg2 = 0;
                }
                if (var9 > var8) {
                    int var41 = arg5 - arg2;
                    int var42 = arg2 - arg0;
                    int var43 = this.field3835 * arg0;
                    while (true) {
                        var42--;
                        if (var42 < 0) {
                            while (true) {
                                var41--;
                                if (var41 < 0) {
                                    return;
                                }
                                class454.method2586(this.field3828, var38 >> 16, var40 >> 16, 0, var43, -4907);
                                var40 += var10;
                                var38 += var9;
                                var43 += this.field3835;
                            }
                        }
                        class454.method2586(this.field3828, var38 >> 16, var39 >> 16, 0, var43, -4907);
                        var38 += var9;
                        var39 += var8;
                        var43 += this.field3835;
                    }
                } else {
                    int var44 = arg5 - arg2;
                    int var45 = arg2 - arg0;
                    int var46 = this.field3835 * arg0;
                    while (true) {
                        var45--;
                        if (var45 < 0) {
                            while (true) {
                                var44--;
                                if (var44 < 0) {
                                    return;
                                }
                                class454.method2586(this.field3828, var40 >> 16, var38 >> 16, 0, var46, -4907);
                                var38 += var9;
                                var46 += this.field3835;
                                var40 += var10;
                            }
                        }
                        class454.method2586(this.field3828, var39 >> 16, var38 >> 16, 0, var46, -4907);
                        var39 += var8;
                        var38 += var9;
                        var46 += this.field3835;
                    }
                }
            }
        } else if (arg0 <= arg2) {
            int var47;
            int var48 = var47 = arg1 << 16;
            if (arg5 < 0) {
                var47 -= arg5 * var10;
                var48 -= arg5 * var9;
                arg5 = 0;
            }
            int var49 = arg6 << 16;
            if (arg0 < 0) {
                var49 -= arg0 * var8;
                arg0 = 0;
            }
            if (var9 >= var10) {
                int var50 = arg2 - arg0;
                int var51 = arg0 - arg5;
                int var52 = this.field3835 * arg5;
                while (true) {
                    var51--;
                    if (var51 < 0) {
                        while (true) {
                            var50--;
                            if (var50 < 0) {
                                return;
                            }
                            class454.method2586(this.field3828, var49 >> 16, var47 >> 16, 0, var52, -4907);
                            var52 += this.field3835;
                            var49 += var8;
                            var47 += var10;
                        }
                    }
                    class454.method2586(this.field3828, var48 >> 16, var47 >> 16, 0, var52, -4907);
                    var47 += var10;
                    var48 += var9;
                    var52 += this.field3835;
                }
            } else {
                int var53 = arg2 - arg0;
                int var54 = arg0 - arg5;
                int var55 = this.field3835 * arg5;
                while (true) {
                    var54--;
                    if (var54 < 0) {
                        while (true) {
                            var53--;
                            if (var53 < 0) {
                                return;
                            }
                            class454.method2586(this.field3828, var47 >> 16, var49 >> 16, 0, var55, -4907);
                            var49 += var8;
                            var47 += var10;
                            var55 += this.field3835;
                        }
                    }
                    class454.method2586(this.field3828, var47 >> 16, var48 >> 16, 0, var55, arg4 - 181463515);
                    var55 += this.field3835;
                    var48 += var9;
                    var47 += var10;
                }
            }
        } else {
            int var56;
            int var57 = var56 = arg1 << 16;
            if (arg5 < 0) {
                var56 -= arg5 * var10;
                var57 -= arg5 * var9;
                arg5 = 0;
            }
            int var58 = arg3 << 16;
            if (arg2 < 0) {
                var58 -= arg2 * var8;
                arg2 = 0;
            }
            if (var10 > var9) {
                int var59 = arg0 - arg2;
                int var60 = arg2 - arg5;
                int var61 = this.field3835 * arg5;
                while (true) {
                    var60--;
                    if (var60 < 0) {
                        while (true) {
                            var59--;
                            if (var59 < 0) {
                                return;
                            }
                            class454.method2586(this.field3828, var58 >> 16, var57 >> 16, 0, var61, -4907);
                            var57 += var9;
                            var58 += var8;
                            var61 += this.field3835;
                        }
                    }
                    class454.method2586(this.field3828, var56 >> 16, var57 >> 16, 0, var61, -4907);
                    var56 += var10;
                    var61 += this.field3835;
                    var57 += var9;
                }
            } else {
                int var62 = arg0 - arg2;
                int var63 = arg2 - arg5;
                int var64 = this.field3835 * arg5;
                while (true) {
                    var63--;
                    if (var63 < 0) {
                        while (true) {
                            var62--;
                            if (var62 < 0) {
                                return;
                            }
                            class454.method2586(this.field3828, var57 >> 16, var58 >> 16, 0, var64, -4907);
                            var57 += var9;
                            var64 += this.field3835;
                            var58 += var8;
                        }
                    }
                    class454.method2586(this.field3828, var57 >> 16, var56 >> 16, 0, var64, -4907);
                    var57 += var9;
                    var56 += var10;
                    var64 += this.field3835;
                }
            }
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(III)Z")
    public final boolean method1715(int arg0, int arg1, int arg2) {
        if (arg0 >= -95) {
            this.method1714(-99, 10, 101, 103, 70, 119, 6);
        }
        field3836++;
        return this.field3828.length >= (arg1 * arg2);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method1716(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field3832++;
        if (class28.method230(arg5, 109)) {
            if (class462.field6402[arg5] == null) {
                class490.method2825(arg2, arg4, arg8, 4403, -1, arg6, arg0, arg7, arg1, class238.field3185[arg5]);
            } else {
                class490.method2825(arg2, arg4, arg8, 4403, -1, arg6, arg0, arg7, arg1, class462.field6402[arg5]);
            }
            if (arg3 >= -39) {
                field3833 = null;
            }
        } else if (arg1 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class204.field2824[var9] = true;
            }
        } else {
            class204.field2824[arg1] = true;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)V")
    public final void method1717(int arg0) {
        field3830++;
        int var2 = -1;
        int var3 = 3 / ((26 - arg0) / 32);
        int var4 = this.field3828.length - 8;
        while (var4 > var2) {
            var2++;
            this.field3828[var2] = 0;
            var2++;
            this.field3828[var2] = 0;
            var2++;
            this.field3828[var2] = 0;
            var2++;
            this.field3828[var2] = 0;
            var2++;
            this.field3828[var2] = 0;
            var2++;
            this.field3828[var2] = 0;
            var2++;
            this.field3828[var2] = 0;
            var2++;
            this.field3828[var2] = 0;
        }
        while (var2 < this.field3828.length - 1) {
            var2++;
            this.field3828[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(Lbo;II)V")
    public class292(class511 arg0, int arg1, int arg2) {
        this.field3828 = new byte[arg1 * arg2];
    }

    static {
        new class304("Your clan channel has now been enabled!", "Dein Chatraum ist jetzt eingeschaltet.", "Votre canal de clan est activé !", "Seu canal de clã já está ativado!");
    }
}
