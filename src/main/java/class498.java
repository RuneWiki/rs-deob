import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class498 extends class271 {

    @OriginalMember(owner = "client!lb", name = "x", descriptor = "[B")
    public byte[] field6844;

    @OriginalMember(owner = "client!lb", name = "w", descriptor = "[I")
    public static int[] field6843 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!lb", name = "y", descriptor = "Lfc;")
    public static class235 field6845 = new class235(50, -1);

    @OriginalMember(owner = "client!lb", name = "G", descriptor = "Lmaa;")
    public static class433 field6853 = new class433("", 13);

    @OriginalMember(owner = "client!lb", name = "z", descriptor = "I")
    public static int field6846;

    @OriginalMember(owner = "client!lb", name = "A", descriptor = "I")
    public static int field6847;

    @OriginalMember(owner = "client!lb", name = "B", descriptor = "I")
    public int field6848;

    @OriginalMember(owner = "client!lb", name = "C", descriptor = "I")
    public static int field6849;

    @OriginalMember(owner = "client!lb", name = "D", descriptor = "I")
    public int field6850;

    @OriginalMember(owner = "client!lb", name = "E", descriptor = "I")
    public static int field6851;

    @OriginalMember(owner = "client!lb", name = "F", descriptor = "I")
    public static int field6852;

    @OriginalMember(owner = "client!lb", name = "H", descriptor = "I")
    public int field6854;

    @OriginalMember(owner = "client!lb", name = "I", descriptor = "I")
    public int field6855;

    @OriginalMember(owner = "client!lb", name = "J", descriptor = "I")
    public static int field6856;

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "(Z)V")
    public static void method2781(boolean arg0) {
        if (!arg0) {
            field6843 = null;
            field6853 = null;
            field6845 = null;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IBIIIII)V")
    public final void method2782(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field6846++;
        int var8 = 0;
        if (arg0 != arg2) {
            var8 = (arg5 - arg3 << 16) / (arg2 - arg0);
        }
        int var9 = -106 / ((47 - arg1) / 62);
        int var10 = 0;
        if (arg2 != arg4) {
            var10 = (arg6 - arg5 << 16) / (arg4 - arg2);
        }
        int var11 = 0;
        if (arg0 != arg4) {
            var11 = (arg3 - arg6 << 16) / (arg0 - arg4);
        }
        if (arg0 <= arg2 && arg0 <= arg4) {
            if (arg2 >= arg4) {
                int var12;
                int var13 = var12 = arg3 << 16;
                int var14 = arg6 << 16;
                if (arg0 < 0) {
                    var13 -= arg0 * var11;
                    var12 -= arg0 * var8;
                    arg0 = 0;
                }
                if (arg4 < 0) {
                    var14 -= arg4 * var10;
                    arg4 = 0;
                }
                if ((arg0 == arg4 || var8 <= var11) && (arg0 != arg4 || var10 <= var8)) {
                    int var18 = arg2 - arg4;
                    int var19 = arg4 - arg0;
                    int var20 = this.field6855 * arg0;
                    while (true) {
                        var19--;
                        if (var19 < 0) {
                            while (true) {
                                var18--;
                                if (var18 < 0) {
                                    return;
                                }
                                class144.method1014(this.field6844, var20, true, var12 >> 16, var14 >> 16, 0);
                                var20 += this.field6855;
                                var12 += var8;
                                var14 += var10;
                            }
                        }
                        class144.method1014(this.field6844, var20, true, var12 >> 16, var13 >> 16, 0);
                        var13 += var11;
                        var12 += var8;
                        var20 += this.field6855;
                    }
                } else {
                    int var15 = arg2 - arg4;
                    int var16 = arg4 - arg0;
                    int var17 = this.field6855 * arg0;
                    while (true) {
                        var16--;
                        if (var16 < 0) {
                            while (true) {
                                var15--;
                                if (var15 < 0) {
                                    return;
                                }
                                class144.method1014(this.field6844, var17, true, var14 >> 16, var12 >> 16, 0);
                                var17 += this.field6855;
                                var12 += var8;
                                var14 += var10;
                            }
                        }
                        class144.method1014(this.field6844, var17, true, var13 >> 16, var12 >> 16, 0);
                        var12 += var8;
                        var17 += this.field6855;
                        var13 += var11;
                    }
                }
            } else {
                int var21;
                int var22 = var21 = arg3 << 16;
                int var23 = arg5 << 16;
                if (arg0 < 0) {
                    var22 -= arg0 * var11;
                    var21 -= arg0 * var8;
                    arg0 = 0;
                }
                if (arg2 < 0) {
                    var23 -= arg2 * var10;
                    arg2 = 0;
                }
                if (arg0 != arg2 && var11 < var8 || arg0 == arg2 && var11 > var10) {
                    int var24 = arg4 - arg2;
                    int var25 = arg2 - arg0;
                    int var26 = this.field6855 * arg0;
                    while (true) {
                        var25--;
                        if (var25 < 0) {
                            while (true) {
                                var24--;
                                if (var24 < 0) {
                                    return;
                                }
                                class144.method1014(this.field6844, var26, true, var22 >> 16, var23 >> 16, 0);
                                var26 += this.field6855;
                                var23 += var10;
                                var22 += var11;
                            }
                        }
                        class144.method1014(this.field6844, var26, true, var22 >> 16, var21 >> 16, 0);
                        var21 += var8;
                        var26 += this.field6855;
                        var22 += var11;
                    }
                } else {
                    int var27 = arg4 - arg2;
                    int var28 = arg2 - arg0;
                    int var29 = this.field6855 * arg0;
                    while (true) {
                        var28--;
                        if (var28 < 0) {
                            while (true) {
                                var27--;
                                if (var27 < 0) {
                                    return;
                                }
                                class144.method1014(this.field6844, var29, true, var23 >> 16, var22 >> 16, 0);
                                var22 += var11;
                                var23 += var10;
                                var29 += this.field6855;
                            }
                        }
                        class144.method1014(this.field6844, var29, true, var21 >> 16, var22 >> 16, 0);
                        var21 += var8;
                        var29 += this.field6855;
                        var22 += var11;
                    }
                }
            }
        } else if (arg4 < arg2) {
            if (arg2 <= arg0) {
                int var30;
                int var31 = var30 = arg6 << 16;
                if (arg4 < 0) {
                    var31 -= arg4 * var10;
                    var30 -= arg4 * var11;
                    arg4 = 0;
                }
                int var32 = arg5 << 16;
                if (arg2 < 0) {
                    var32 -= arg2 * var8;
                    arg2 = 0;
                }
                if (var10 < var11) {
                    int var33 = arg0 - arg2;
                    int var34 = arg2 - arg4;
                    int var35 = this.field6855 * arg4;
                    while (true) {
                        var34--;
                        if (var34 < 0) {
                            while (true) {
                                var33--;
                                if (var33 < 0) {
                                    return;
                                }
                                class144.method1014(this.field6844, var35, true, var32 >> 16, var30 >> 16, 0);
                                var35 += this.field6855;
                                var30 += var11;
                                var32 += var8;
                            }
                        }
                        class144.method1014(this.field6844, var35, true, var31 >> 16, var30 >> 16, 0);
                        var31 += var10;
                        var30 += var11;
                        var35 += this.field6855;
                    }
                } else {
                    int var36 = arg0 - arg2;
                    int var37 = arg2 - arg4;
                    int var38 = this.field6855 * arg4;
                    while (true) {
                        var37--;
                        if (var37 < 0) {
                            while (true) {
                                var36--;
                                if (var36 < 0) {
                                    return;
                                }
                                class144.method1014(this.field6844, var38, true, var30 >> 16, var32 >> 16, 0);
                                var38 += this.field6855;
                                var32 += var8;
                                var30 += var11;
                            }
                        }
                        class144.method1014(this.field6844, var38, true, var30 >> 16, var31 >> 16, 0);
                        var30 += var11;
                        var38 += this.field6855;
                        var31 += var10;
                    }
                }
            } else {
                int var39;
                int var40 = var39 = arg6 << 16;
                if (arg4 < 0) {
                    var40 -= arg4 * var10;
                    var39 -= arg4 * var11;
                    arg4 = 0;
                }
                int var41 = arg3 << 16;
                if (arg0 < 0) {
                    var41 -= arg0 * var8;
                    arg0 = 0;
                }
                if (var11 > var10) {
                    int var42 = arg2 - arg0;
                    int var43 = arg0 - arg4;
                    int var44 = this.field6855 * arg4;
                    while (true) {
                        var43--;
                        if (var43 < 0) {
                            while (true) {
                                var42--;
                                if (var42 < 0) {
                                    return;
                                }
                                class144.method1014(this.field6844, var44, true, var40 >> 16, var41 >> 16, 0);
                                var41 += var8;
                                var40 += var10;
                                var44 += this.field6855;
                            }
                        }
                        class144.method1014(this.field6844, var44, true, var40 >> 16, var39 >> 16, 0);
                        var40 += var10;
                        var44 += this.field6855;
                        var39 += var11;
                    }
                } else {
                    int var45 = arg2 - arg0;
                    int var46 = arg0 - arg4;
                    int var47 = this.field6855 * arg4;
                    while (true) {
                        var46--;
                        if (var46 < 0) {
                            while (true) {
                                var45--;
                                if (var45 < 0) {
                                    return;
                                }
                                class144.method1014(this.field6844, var47, true, var41 >> 16, var40 >> 16, 0);
                                var47 += this.field6855;
                                var40 += var10;
                                var41 += var8;
                            }
                        }
                        class144.method1014(this.field6844, var47, true, var39 >> 16, var40 >> 16, 0);
                        var47 += this.field6855;
                        var39 += var11;
                        var40 += var10;
                    }
                }
            }
        } else if (arg0 > arg4) {
            int var48;
            int var49 = var48 = arg5 << 16;
            int var50 = arg6 << 16;
            if (arg2 < 0) {
                var48 -= arg2 * var10;
                var49 -= arg2 * var8;
                arg2 = 0;
            }
            if (arg4 < 0) {
                var50 -= arg4 * var11;
                arg4 = 0;
            }
            if (arg2 != arg4 && var10 > var8 || arg2 == arg4 && var8 > var11) {
                int var51 = arg0 - arg4;
                int var52 = arg4 - arg2;
                int var53 = this.field6855 * arg2;
                while (true) {
                    var52--;
                    if (var52 < 0) {
                        while (true) {
                            var51--;
                            if (var51 < 0) {
                                return;
                            }
                            class144.method1014(this.field6844, var53, true, var49 >> 16, var50 >> 16, 0);
                            var49 += var8;
                            var50 += var11;
                            var53 += this.field6855;
                        }
                    }
                    class144.method1014(this.field6844, var53, true, var49 >> 16, var48 >> 16, 0);
                    var48 += var10;
                    var49 += var8;
                    var53 += this.field6855;
                }
            } else {
                int var54 = arg0 - arg4;
                int var55 = arg4 - arg2;
                int var56 = this.field6855 * arg2;
                while (true) {
                    var55--;
                    if (var55 < 0) {
                        while (true) {
                            var54--;
                            if (var54 < 0) {
                                return;
                            }
                            class144.method1014(this.field6844, var56, true, var50 >> 16, var49 >> 16, 0);
                            var50 += var11;
                            var49 += var8;
                            var56 += this.field6855;
                        }
                    }
                    class144.method1014(this.field6844, var56, true, var48 >> 16, var49 >> 16, 0);
                    var48 += var10;
                    var49 += var8;
                    var56 += this.field6855;
                }
            }
        } else {
            int var57;
            int var58 = var57 = arg5 << 16;
            int var59 = arg3 << 16;
            if (arg2 < 0) {
                var57 -= arg2 * var10;
                var58 -= arg2 * var8;
                arg2 = 0;
            }
            if (arg0 < 0) {
                var59 -= arg0 * var11;
                arg0 = 0;
            }
            if (var10 > var8) {
                int var60 = arg4 - arg0;
                int var61 = arg0 - arg2;
                int var62 = this.field6855 * arg2;
                while (true) {
                    var61--;
                    if (var61 < 0) {
                        while (true) {
                            var60--;
                            if (var60 < 0) {
                                return;
                            }
                            class144.method1014(this.field6844, var62, true, var59 >> 16, var57 >> 16, 0);
                            var59 += var11;
                            var62 += this.field6855;
                            var57 += var10;
                        }
                    }
                    class144.method1014(this.field6844, var62, true, var58 >> 16, var57 >> 16, 0);
                    var62 += this.field6855;
                    var57 += var10;
                    var58 += var8;
                }
            } else {
                int var63 = arg4 - arg0;
                int var64 = arg0 - arg2;
                int var65 = this.field6855 * arg2;
                while (true) {
                    var64--;
                    if (var64 < 0) {
                        while (true) {
                            var63--;
                            if (var63 < 0) {
                                return;
                            }
                            class144.method1014(this.field6844, var65, true, var57 >> 16, var59 >> 16, 0);
                            var57 += var10;
                            var65 += this.field6855;
                            var59 += var11;
                        }
                    }
                    class144.method1014(this.field6844, var65, true, var57 >> 16, var58 >> 16, 0);
                    var57 += var10;
                    var58 += var8;
                    var65 += this.field6855;
                }
            }
        }
    }

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "(I)V")
    public final void method2783(int arg0) {
        field6851++;
        int var2 = -1;
        int var3 = this.field6844.length - 8;
        while (var2 < var3) {
            var2++;
            this.field6844[var2] = 0;
            var2++;
            this.field6844[var2] = 0;
            var2++;
            this.field6844[var2] = 0;
            var2++;
            this.field6844[var2] = 0;
            var2++;
            this.field6844[var2] = 0;
            var2++;
            this.field6844[var2] = 0;
            var2++;
            this.field6844[var2] = 0;
            var2++;
            this.field6844[var2] = 0;
        }
        if (arg0 != 17530) {
            this.method2784(124, -112, 3, 82, -13);
        }
        while ((this.field6844.length - 1) > var2) {
            var2++;
            this.field6844[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIII)V")
    public final void method2784(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field6848 = arg2;
        this.field6854 = arg0;
        this.field6855 = arg1 - arg2;
        this.field6850 = arg3 - arg0;
        field6856++;
        if (arg4 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIB)Z")
    public final boolean method2785(int arg0, int arg1, byte arg2) {
        field6849++;
        if (arg2 < 111) {
            this.method2784(-114, -41, 106, -47, 102);
        }
        return (arg0 * arg1) <= this.field6844.length;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)V")
    public static final void method2786(String arg0, int arg1, String arg2) {
        class86.field1181 = 1;
        field6852++;
        class208.field3075 = -1;
        class402.method2295(31644, arg2, false, arg0);
        if (arg1 <= 32) {
            method2781(false);
        }
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(Lgj;II)V")
    public class498(class580 arg0, int arg1, int arg2) {
        this.field6844 = new byte[arg1 * arg2];
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZIII)V")
    public static final void method2787(boolean arg0, int arg1, int arg2, int arg3) {
        field6847++;
        int var4 = arg1 << 3;
        int var5 = arg3 << 3;
        int var6 = arg2 << 3;
        class249.field3516 = var6;
        class646.field9167 = var5;
        if (class670.field9445 == 2) {
            class263.field3732 = var4;
            class591.field8245 = var5;
            class492.field6794 = var6;
        }
        class407.method2320(29199);
        class586.field8200 = arg0;
    }
}
