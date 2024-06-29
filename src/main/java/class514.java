import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vs")
public class class514 extends class252 {

    @OriginalMember(owner = "client!vs", name = "x", descriptor = "[B")
    public byte[] field7499;

    @OriginalMember(owner = "client!vs", name = "q", descriptor = "Lea;")
    public static class474 field7492 = new class474("Cancel", "Abbrechen", "Annuler", "Cancelar");

    @OriginalMember(owner = "client!vs", name = "D", descriptor = "I")
    public static int field7505 = 0;

    @OriginalMember(owner = "client!vs", name = "p", descriptor = "I")
    public int field7491;

    @OriginalMember(owner = "client!vs", name = "r", descriptor = "I")
    public static int field7493;

    @OriginalMember(owner = "client!vs", name = "s", descriptor = "I")
    public static int field7494;

    @OriginalMember(owner = "client!vs", name = "t", descriptor = "I")
    public static int field7495;

    @OriginalMember(owner = "client!vs", name = "v", descriptor = "I")
    public int field7497;

    @OriginalMember(owner = "client!vs", name = "w", descriptor = "I")
    public static int field7498;

    @OriginalMember(owner = "client!vs", name = "y", descriptor = "I")
    public static int field7500;

    @OriginalMember(owner = "client!vs", name = "z", descriptor = "I")
    public static int field7501;

    @OriginalMember(owner = "client!vs", name = "A", descriptor = "I")
    public int field7502;

    @OriginalMember(owner = "client!vs", name = "B", descriptor = "I")
    public static int field7503;

    @OriginalMember(owner = "client!vs", name = "C", descriptor = "I")
    public int field7504;

    @OriginalMember(owner = "client!vs", name = "u", descriptor = "[[I")
    public static int[][] field7496;

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(IIII)V", line = 4)
    public static final void method3049(int arg0, int arg1, int arg2, int arg3) {
        field7500++;
        class467 var4 = class541.method3144(arg1, (byte) -90, arg2);
        var4.method2851(true);
        var4.field6926 = arg0;
        var4.field6930 = arg3;
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(III)Z", line = 16)
    public final boolean method3050(int arg0, int arg1, int arg2) {
        field7495++;
        if (arg0 > -39) {
            this.field7497 = 126;
        }
        return this.field7499.length >= arg1 * arg2;
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(B)V", line = 30)
    public final void method3051(byte arg0) {
        field7493++;
        int var2 = -1;
        if (arg0 > -31) {
            this.method3056(-108, 119, 48, 93, 111, -124, 34);
        }
        int var3 = this.field7499.length - 8;
        while (var2 < var3) {
            var2++;
            this.field7499[var2] = 0;
            var2++;
            this.field7499[var2] = 0;
            var2++;
            this.field7499[var2] = 0;
            var2++;
            this.field7499[var2] = 0;
            var2++;
            this.field7499[var2] = 0;
            var2++;
            this.field7499[var2] = 0;
            var2++;
            this.field7499[var2] = 0;
            var2++;
            this.field7499[var2] = 0;
        }
        while (var2 < this.field7499.length - 1) {
            var2++;
            this.field7499[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!vs", name = "b", descriptor = "(B)V", line = 61)
    public static void method3052(byte arg0) {
        int var1 = -1 / ((arg0 - 4) / 61);
        field7496 = null;
        field7492 = null;
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(ILjava/awt/Frame;Ltq;)V", line = 72)
    public static final void method3053(int arg0, Frame arg1, class545 arg2) {
        while (true) {
            class175 var3 = arg2.method3174(false, arg1);
            while (var3.field2138 == 0) {
                class646.method3696(1, 10L);
            }
            if (var3.field2138 == 1) {
                field7501++;
                arg1.setVisible(false);
                arg1.dispose();
                if (arg0 >= 0) {
                    field7496 = null;
                    return;
                }
                return;
            }
            class646.method3696(1, 100L);
        }
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(FBFF)I", line = 103)
    public static final int method3054(float arg0, byte arg1, float arg2, float arg3) {
        if (arg1 >= -67) {
            method3049(95, -16, -16, 81);
        }
        field7494++;
        float var4 = arg2 < 0.0F ? -arg2 : arg2;
        float var5 = (arg0 < 0.0F) ? -arg0 : arg0;
        float var6 = arg3 < 0.0F ? -arg3 : arg3;
        if (var5 > var4 && var5 > var6) {
            return arg0 > 0.0F ? 0 : 1;
        } else if (var6 > var4 && var6 > var5) {
            return arg3 > 0.0F ? 2 : 3;
        } else if ((arg2 > 0.0F)) {
            return 4;
        } else {
            return 5;
        }
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(IIIII)V", line = 148)
    public final void method3055(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field7503++;
        this.field7504 = arg1;
        if (arg0 != -12544624) {
            method3054(-0.15933393F, (byte) -91, -0.6131143F, -0.75218284F);
        }
        this.field7491 = arg4 - arg1;
        this.field7497 = arg3 - arg2;
        this.field7502 = arg2;
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(IIIIIII)V", line = 168)
    public final void method3056(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field7498++;
        int var8 = arg5;
        if (arg1 != arg3) {
            var8 = (arg0 - arg4 << 16) / (arg3 - arg1);
        }
        int var9 = 0;
        if (arg3 != arg6) {
            var9 = (arg2 - arg0 << 16) / (arg6 - arg3);
        }
        int var10 = 0;
        if (arg1 != arg6) {
            var10 = (arg4 - arg2 << 16) / (arg1 - arg6);
        }
        if (arg1 <= arg3 && arg6 >= arg1) {
            if (arg6 > arg3) {
                int var11;
                int var12 = var11 = arg4 << 16;
                if (arg1 < 0) {
                    var11 -= arg1 * var8;
                    var12 -= arg1 * var10;
                    arg1 = 0;
                }
                int var13 = arg0 << 16;
                if (arg3 < 0) {
                    var13 -= arg3 * var9;
                    arg3 = 0;
                }
                if ((arg1 == arg3 || var10 >= var8) && (arg1 != arg3 || var10 <= var9)) {
                    int var17 = arg6 - arg3;
                    int var18 = arg3 - arg1;
                    int var19 = this.field7491 * arg1;
                    while (true) {
                        var18--;
                        if (var18 < 0) {
                            while (true) {
                                var17--;
                                if (var17 < 0) {
                                    return;
                                }
                                class178.method1018(this.field7499, var13 >> 16, 0, var19, arg5 ^ 0x7C, var12 >> 16);
                                var13 += var9;
                                var12 += var10;
                                var19 += this.field7491;
                            }
                        }
                        class178.method1018(this.field7499, var11 >> 16, 0, var19, -104, var12 >> 16);
                        var11 += var8;
                        var19 += this.field7491;
                        var12 += var10;
                    }
                } else {
                    int var14 = arg6 - arg3;
                    int var15 = arg3 - arg1;
                    int var16 = this.field7491 * arg1;
                    while (true) {
                        var15--;
                        if (var15 < 0) {
                            while (true) {
                                var14--;
                                if (var14 < 0) {
                                    return;
                                }
                                class178.method1018(this.field7499, var12 >> 16, 0, var16, arg5 - 79, var13 >> 16);
                                var16 += this.field7491;
                                var12 += var10;
                                var13 += var9;
                            }
                        }
                        class178.method1018(this.field7499, var12 >> 16, 0, var16, 62, var11 >> 16);
                        var12 += var10;
                        var16 += this.field7491;
                        var11 += var8;
                    }
                }
            } else {
                int var20;
                int var21 = var20 = arg4 << 16;
                int var22 = arg2 << 16;
                if (arg1 < 0) {
                    var21 -= arg1 * var10;
                    var20 -= arg1 * var8;
                    arg1 = 0;
                }
                if (arg6 < 0) {
                    var22 -= arg6 * var9;
                    arg6 = 0;
                }
                if (arg1 != arg6 && var10 < var8 || arg1 == arg6 && var9 > var8) {
                    int var23 = arg3 - arg6;
                    int var24 = arg6 - arg1;
                    int var25 = this.field7491 * arg1;
                    while (true) {
                        var24--;
                        if (var24 < 0) {
                            while (true) {
                                var23--;
                                if (var23 < 0) {
                                    return;
                                }
                                class178.method1018(this.field7499, var22 >> 16, 0, var25, 89, var20 >> 16);
                                var20 += var8;
                                var25 += this.field7491;
                                var22 += var9;
                            }
                        }
                        class178.method1018(this.field7499, var21 >> 16, 0, var25, 63, var20 >> 16);
                        var20 += var8;
                        var21 += var10;
                        var25 += this.field7491;
                    }
                } else {
                    int var26 = arg3 - arg6;
                    int var27 = arg6 - arg1;
                    int var28 = this.field7491 * arg1;
                    while (true) {
                        var27--;
                        if (var27 < 0) {
                            while (true) {
                                var26--;
                                if (var26 < 0) {
                                    return;
                                }
                                class178.method1018(this.field7499, var20 >> 16, 0, var28, arg5 ^ 0xFFFFFF9A, var22 >> 16);
                                var28 += this.field7491;
                                var22 += var9;
                                var20 += var8;
                            }
                        }
                        class178.method1018(this.field7499, var20 >> 16, 0, var28, -112, var21 >> 16);
                        var28 += this.field7491;
                        var20 += var8;
                        var21 += var10;
                    }
                }
            }
        } else if (arg6 < arg3) {
            if (arg1 < arg3) {
                int var29;
                int var30 = var29 = arg2 << 16;
                if (arg6 < 0) {
                    var30 -= arg6 * var9;
                    var29 -= arg6 * var10;
                    arg6 = 0;
                }
                int var31 = arg4 << 16;
                if (arg1 < 0) {
                    var31 -= arg1 * var8;
                    arg1 = 0;
                }
                if (var9 < var10) {
                    int var32 = arg3 - arg1;
                    int var33 = arg1 - arg6;
                    int var34 = this.field7491 * arg6;
                    while (true) {
                        var33--;
                        if (var33 < 0) {
                            while (true) {
                                var32--;
                                if (var32 < 0) {
                                    return;
                                }
                                class178.method1018(this.field7499, var30 >> 16, 0, var34, -110, var31 >> 16);
                                var31 += var8;
                                var30 += var9;
                                var34 += this.field7491;
                            }
                        }
                        class178.method1018(this.field7499, var30 >> 16, 0, var34, arg5 ^ 0xFFFFFFA8, var29 >> 16);
                        var29 += var10;
                        var34 += this.field7491;
                        var30 += var9;
                    }
                } else {
                    int var35 = arg3 - arg1;
                    int var36 = arg1 - arg6;
                    int var37 = this.field7491 * arg6;
                    while (true) {
                        var36--;
                        if (var36 < 0) {
                            while (true) {
                                var35--;
                                if (var35 < 0) {
                                    return;
                                }
                                class178.method1018(this.field7499, var31 >> 16, 0, var37, arg5 ^ 0x40, var30 >> 16);
                                var30 += var9;
                                var37 += this.field7491;
                                var31 += var8;
                            }
                        }
                        class178.method1018(this.field7499, var29 >> 16, 0, var37, -85, var30 >> 16);
                        var30 += var9;
                        var37 += this.field7491;
                        var29 += var10;
                    }
                }
            } else {
                int var38;
                int var39 = var38 = arg2 << 16;
                if (arg6 < 0) {
                    var38 -= arg6 * var10;
                    var39 -= arg6 * var9;
                    arg6 = 0;
                }
                int var40 = arg0 << 16;
                if (arg3 < 0) {
                    var40 -= arg3 * var8;
                    arg3 = 0;
                }
                if (var10 <= var9) {
                    int var41 = arg1 - arg3;
                    int var42 = arg3 - arg6;
                    int var43 = this.field7491 * arg6;
                    while (true) {
                        var42--;
                        if (var42 < 0) {
                            while (true) {
                                var41--;
                                if (var41 < 0) {
                                    return;
                                }
                                class178.method1018(this.field7499, var38 >> 16, 0, var43, arg5 - 99, var40 >> 16);
                                var38 += var10;
                                var43 += this.field7491;
                                var40 += var8;
                            }
                        }
                        class178.method1018(this.field7499, var38 >> 16, 0, var43, arg5 + 100, var39 >> 16);
                        var38 += var10;
                        var39 += var9;
                        var43 += this.field7491;
                    }
                } else {
                    int var44 = arg1 - arg3;
                    int var45 = arg3 - arg6;
                    int var46 = this.field7491 * arg6;
                    while (true) {
                        var45--;
                        if (var45 < 0) {
                            while (true) {
                                var44--;
                                if (var44 < 0) {
                                    return;
                                }
                                class178.method1018(this.field7499, var40 >> 16, 0, var46, 91, var38 >> 16);
                                var40 += var8;
                                var38 += var10;
                                var46 += this.field7491;
                            }
                        }
                        class178.method1018(this.field7499, var39 >> 16, 0, var46, arg5 ^ 0xFFFFFFA1, var38 >> 16);
                        var46 += this.field7491;
                        var39 += var9;
                        var38 += var10;
                    }
                }
            }
        } else if (arg1 > arg6) {
            int var47;
            int var48 = var47 = arg0 << 16;
            int var49 = arg2 << 16;
            if (arg3 < 0) {
                var48 -= arg3 * var8;
                var47 -= arg3 * var9;
                arg3 = 0;
            }
            if (arg6 < 0) {
                var49 -= arg6 * var10;
                arg6 = 0;
            }
            if (arg3 != arg6 && var8 < var9 || arg3 == arg6 && var10 < var8) {
                int var50 = arg1 - arg6;
                int var51 = arg6 - arg3;
                int var52 = this.field7491 * arg3;
                while (true) {
                    var51--;
                    if (var51 < 0) {
                        while (true) {
                            var50--;
                            if (var50 < 0) {
                                return;
                            }
                            class178.method1018(this.field7499, var48 >> 16, 0, var52, arg5 + 81, var49 >> 16);
                            var52 += this.field7491;
                            var48 += var8;
                            var49 += var10;
                        }
                    }
                    class178.method1018(this.field7499, var48 >> 16, 0, var52, -119, var47 >> 16);
                    var48 += var8;
                    var47 += var9;
                    var52 += this.field7491;
                }
            } else {
                int var53 = arg1 - arg6;
                int var54 = arg6 - arg3;
                int var55 = this.field7491 * arg3;
                while (true) {
                    var54--;
                    if (var54 < 0) {
                        while (true) {
                            var53--;
                            if (var53 < 0) {
                                return;
                            }
                            class178.method1018(this.field7499, var49 >> 16, 0, var55, arg5 - 83, var48 >> 16);
                            var48 += var8;
                            var49 += var10;
                            var55 += this.field7491;
                        }
                    }
                    class178.method1018(this.field7499, var47 >> 16, 0, var55, -75, var48 >> 16);
                    var48 += var8;
                    var55 += this.field7491;
                    var47 += var9;
                }
            }
        } else {
            int var56;
            int var57 = var56 = arg0 << 16;
            if (arg3 < 0) {
                var57 -= arg3 * var8;
                var56 -= arg3 * var9;
                arg3 = 0;
            }
            int var58 = arg4 << 16;
            if (arg1 < 0) {
                var58 -= arg1 * var10;
                arg1 = 0;
            }
            if (var8 < var9) {
                int var59 = arg6 - arg1;
                int var60 = arg1 - arg3;
                int var61 = this.field7491 * arg3;
                while (true) {
                    var60--;
                    if (var60 < 0) {
                        while (true) {
                            var59--;
                            if (var59 < 0) {
                                return;
                            }
                            class178.method1018(this.field7499, var58 >> 16, 0, var61, arg5 ^ 0x72, var56 >> 16);
                            var61 += this.field7491;
                            var56 += var9;
                            var58 += var10;
                        }
                    }
                    class178.method1018(this.field7499, var57 >> 16, 0, var61, 118, var56 >> 16);
                    var61 += this.field7491;
                    var57 += var8;
                    var56 += var9;
                }
            } else {
                int var62 = arg6 - arg1;
                int var63 = arg1 - arg3;
                int var64 = this.field7491 * arg3;
                while (true) {
                    var63--;
                    if (var63 < 0) {
                        while (true) {
                            var62--;
                            if (var62 < 0) {
                                return;
                            }
                            class178.method1018(this.field7499, var56 >> 16, 0, var64, 36, var58 >> 16);
                            var64 += this.field7491;
                            var58 += var10;
                            var56 += var9;
                        }
                    }
                    class178.method1018(this.field7499, var56 >> 16, 0, var64, -122, var57 >> 16);
                    var64 += this.field7491;
                    var56 += var9;
                    var57 += var8;
                }
            }
        }
    }

    @OriginalMember(owner = "client!vs", name = "<init>", descriptor = "(Ltu;II)V", line = 610)
    public class514(class294 arg0, int arg1, int arg2) {
        this.field7499 = new byte[arg1 * arg2];
    }
}
