import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iaa")
public class class469 extends class88 {

    @OriginalMember(owner = "client!iaa", name = "z", descriptor = "[B")
    public byte[] field7111;

    @OriginalMember(owner = "client!iaa", name = "I", descriptor = "Lqu;")
    public static class364 field7120 = new class364(57, 4);

    @OriginalMember(owner = "client!iaa", name = "J", descriptor = "Lqu;")
    public static class364 field7121 = new class364(20, 6);

    @OriginalMember(owner = "client!iaa", name = "K", descriptor = "[[B")
    public static byte[][] field7122 = new byte[1000][];

    @OriginalMember(owner = "client!iaa", name = "x", descriptor = "I")
    public int field7109;

    @OriginalMember(owner = "client!iaa", name = "y", descriptor = "I")
    public static int field7110;

    @OriginalMember(owner = "client!iaa", name = "A", descriptor = "I")
    public static int field7112;

    @OriginalMember(owner = "client!iaa", name = "B", descriptor = "I")
    public static int field7113;

    @OriginalMember(owner = "client!iaa", name = "C", descriptor = "I")
    public int field7114;

    @OriginalMember(owner = "client!iaa", name = "D", descriptor = "I")
    public static int field7115;

    @OriginalMember(owner = "client!iaa", name = "E", descriptor = "I")
    public static int field7116;

    @OriginalMember(owner = "client!iaa", name = "F", descriptor = "I")
    public int field7117;

    @OriginalMember(owner = "client!iaa", name = "G", descriptor = "I")
    public int field7118;

    @OriginalMember(owner = "client!iaa", name = "H", descriptor = "I")
    public static int field7119;

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(ZZ)V", line = 3)
    public static final void method2853(boolean arg0, boolean arg1) {
        field7119++;
        for (class434 var2 = (class434) class566.field8403.method2496((byte) 59); var2 != null; var2 = (class434) class566.field8403.method2494(127)) {
            if (var2.field6356 != null) {
                class105.field1321.method2085(var2.field6356);
                var2.field6356 = null;
            }
            if (var2.field6348 != null) {
                class105.field1321.method2085(var2.field6348);
                var2.field6348 = null;
            }
            var2.method2997(1);
        }
        if (arg0) {
            field7121 = null;
        }
        if (!arg1) {
            return;
        }
        for (class434 var3 = (class434) class255.field3733.method2496((byte) -126); var3 != null; var3 = (class434) class255.field3733.method2494(49)) {
            if (var3.field6356 != null) {
                class105.field1321.method2085(var3.field6356);
                var3.field6356 = null;
            }
            var3.method2997(1);
        }
        for (class434 var4 = (class434) class426.field6077.method1331(-1925); var4 != null; var4 = (class434) class426.field6077.method1340((byte) -102)) {
            if (var4.field6356 != null) {
                class105.field1321.method2085(var4.field6356);
                var4.field6356 = null;
            }
            var4.method2997(1);
        }
    }

    @OriginalMember(owner = "client!iaa", name = "h", descriptor = "(I)V", line = 70)
    public final void method2854(int arg0) {
        field7113++;
        int var2 = -1;
        if (arg0 < 69) {
            return;
        }
        int var3 = this.field7111.length - 8;
        while (var3 > var2) {
            var2++;
            this.field7111[var2] = 0;
            var2++;
            this.field7111[var2] = 0;
            var2++;
            this.field7111[var2] = 0;
            var2++;
            this.field7111[var2] = 0;
            var2++;
            this.field7111[var2] = 0;
            var2++;
            this.field7111[var2] = 0;
            var2++;
            this.field7111[var2] = 0;
            var2++;
            this.field7111[var2] = 0;
        }
        while (var2 < this.field7111.length - 1) {
            var2++;
            this.field7111[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(B)V", line = 99)
    public static void method2855(byte arg0) {
        field7120 = null;
        int var1 = -59 % ((86 - arg0) / 36);
        field7122 = null;
        field7121 = null;
    }

    @OriginalMember(owner = "client!iaa", name = "c", descriptor = "(IBI)Z", line = 120)
    public final boolean method2856(int arg0, byte arg1, int arg2) {
        if (arg1 >= -33) {
            method2853(false, false);
        }
        field7110++;
        return this.field7111.length >= arg0 * arg2;
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(IBIII)V", line = 131)
    public final void method2857(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        this.field7114 = arg4 - arg3;
        this.field7109 = arg2 - arg0;
        field7112++;
        if (arg1 != 0) {
            field7120 = null;
        }
        this.field7117 = arg3;
        this.field7118 = arg0;
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(ZIIZI)Lbr;", line = 149)
    public static final class184 method2858(boolean arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field7116++;
        class184 var5 = new class184();
        var5.field2795 = arg4;
        var5.field2796 = arg1;
        class600.field8865.method1341(var5, (byte) 122, (long) arg2);
        class267.method1707((byte) -36, arg1);
        class311 var6 = class436.method2659(arg0, arg2);
        if (var6 != null) {
            class619.method3586(21, var6);
        }
        if (class135.field1798 != null) {
            class619.method3586(126, class135.field1798);
            class135.field1798 = null;
        }
        class613.method3571(126);
        if (var6 != null) {
            class613.method3570(-26662, var6, !arg3);
        }
        if (!arg3) {
            class330.method2074(arg1);
        }
        if (!arg3 && class540.field8007 != -1) {
            class35.method176(1, -76, class540.field8007);
        }
        return var5;
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(IIIIZII)V", line = 185)
    public final void method2859(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        field7115++;
        int var8 = 0;
        if (arg3 != arg6) {
            var8 = (arg1 - arg5 << 16) / (arg3 - arg6);
        }
        int var9 = 0;
        if (arg2 != arg3) {
            var9 = (arg0 - arg1 << 16) / (arg2 - arg3);
        }
        int var10 = 0;
        if (arg2 != arg6) {
            var10 = (arg5 - arg0 << 16) / (arg6 - arg2);
        }
        if (arg4) {
            return;
        }
        if (arg6 <= arg3 && arg6 <= arg2) {
            if (arg2 <= arg3) {
                int var11;
                int var12 = var11 = arg5 << 16;
                int var13 = arg0 << 16;
                if (arg6 < 0) {
                    var11 -= arg6 * var8;
                    var12 -= arg6 * var10;
                    arg6 = 0;
                }
                if (arg2 < 0) {
                    var13 -= arg2 * var9;
                    arg2 = 0;
                }
                if (arg2 != arg6 && var10 < var8 || arg2 == arg6 && var8 < var9) {
                    int var14 = arg3 - arg2;
                    int var15 = arg2 - arg6;
                    int var16 = this.field7114 * arg6;
                    while (true) {
                        var15--;
                        if (var15 < 0) {
                            while (true) {
                                var14--;
                                if (var14 < 0) {
                                    return;
                                }
                                class350.method2146((byte) -5, var11 >> 16, var16, 0, this.field7111, var13 >> 16);
                                var11 += var8;
                                var13 += var9;
                                var16 += this.field7114;
                            }
                        }
                        class350.method2146((byte) -5, var11 >> 16, var16, 0, this.field7111, var12 >> 16);
                        var12 += var10;
                        var16 += this.field7114;
                        var11 += var8;
                    }
                } else {
                    int var17 = arg3 - arg2;
                    int var18 = arg2 - arg6;
                    int var19 = this.field7114 * arg6;
                    while (true) {
                        var18--;
                        if (var18 < 0) {
                            while (true) {
                                var17--;
                                if (var17 < 0) {
                                    return;
                                }
                                class350.method2146((byte) -5, var13 >> 16, var19, 0, this.field7111, var11 >> 16);
                                var19 += this.field7114;
                                var13 += var9;
                                var11 += var8;
                            }
                        }
                        class350.method2146((byte) -5, var12 >> 16, var19, 0, this.field7111, var11 >> 16);
                        var11 += var8;
                        var12 += var10;
                        var19 += this.field7114;
                    }
                }
            } else {
                int var20;
                int var21 = var20 = arg5 << 16;
                if (arg6 < 0) {
                    var21 -= arg6 * var10;
                    var20 -= arg6 * var8;
                    arg6 = 0;
                }
                int var22 = arg1 << 16;
                if (arg3 < 0) {
                    var22 -= arg3 * var9;
                    arg3 = 0;
                }
                if (arg3 != arg6 && var10 < var8 || arg3 == arg6 && var10 > var9) {
                    int var23 = arg2 - arg3;
                    int var24 = arg3 - arg6;
                    int var25 = this.field7114 * arg6;
                    while (true) {
                        var24--;
                        if (var24 < 0) {
                            while (true) {
                                var23--;
                                if (var23 < 0) {
                                    return;
                                }
                                class350.method2146((byte) -5, var22 >> 16, var25, 0, this.field7111, var21 >> 16);
                                var21 += var10;
                                var25 += this.field7114;
                                var22 += var9;
                            }
                        }
                        class350.method2146((byte) -5, var20 >> 16, var25, 0, this.field7111, var21 >> 16);
                        var20 += var8;
                        var25 += this.field7114;
                        var21 += var10;
                    }
                } else {
                    int var26 = arg2 - arg3;
                    int var27 = arg3 - arg6;
                    int var28 = this.field7114 * arg6;
                    while (true) {
                        var27--;
                        if (var27 < 0) {
                            while (true) {
                                var26--;
                                if (var26 < 0) {
                                    return;
                                }
                                class350.method2146((byte) -5, var21 >> 16, var28, 0, this.field7111, var22 >> 16);
                                var22 += var9;
                                var21 += var10;
                                var28 += this.field7114;
                            }
                        }
                        class350.method2146((byte) -5, var21 >> 16, var28, 0, this.field7111, var20 >> 16);
                        var20 += var8;
                        var21 += var10;
                        var28 += this.field7114;
                    }
                }
            }
        } else if (arg3 > arg2) {
            if (arg6 >= arg3) {
                int var29;
                int var30 = var29 = arg0 << 16;
                if (arg2 < 0) {
                    var30 -= arg2 * var9;
                    var29 -= arg2 * var10;
                    arg2 = 0;
                }
                int var31 = arg1 << 16;
                if (arg3 < 0) {
                    var31 -= arg3 * var8;
                    arg3 = 0;
                }
                if (var9 < var10) {
                    int var32 = arg6 - arg3;
                    int var33 = arg3 - arg2;
                    int var34 = this.field7114 * arg2;
                    while (true) {
                        var33--;
                        if (var33 < 0) {
                            while (true) {
                                var32--;
                                if (var32 < 0) {
                                    return;
                                }
                                class350.method2146((byte) -5, var29 >> 16, var34, 0, this.field7111, var31 >> 16);
                                var31 += var8;
                                var29 += var10;
                                var34 += this.field7114;
                            }
                        }
                        class350.method2146((byte) -5, var29 >> 16, var34, 0, this.field7111, var30 >> 16);
                        var29 += var10;
                        var30 += var9;
                        var34 += this.field7114;
                    }
                } else {
                    int var35 = arg6 - arg3;
                    int var36 = arg3 - arg2;
                    int var37 = this.field7114 * arg2;
                    while (true) {
                        var36--;
                        if (var36 < 0) {
                            while (true) {
                                var35--;
                                if (var35 < 0) {
                                    return;
                                }
                                class350.method2146((byte) -5, var31 >> 16, var37, 0, this.field7111, var29 >> 16);
                                var37 += this.field7114;
                                var31 += var8;
                                var29 += var10;
                            }
                        }
                        class350.method2146((byte) -5, var30 >> 16, var37, 0, this.field7111, var29 >> 16);
                        var30 += var9;
                        var29 += var10;
                        var37 += this.field7114;
                    }
                }
            } else {
                int var38;
                int var39 = var38 = arg0 << 16;
                int var40 = arg5 << 16;
                if (arg2 < 0) {
                    var38 -= arg2 * var10;
                    var39 -= arg2 * var9;
                    arg2 = 0;
                }
                if (arg6 < 0) {
                    var40 -= arg6 * var8;
                    arg6 = 0;
                }
                if (var10 <= var9) {
                    int var41 = arg3 - arg6;
                    int var42 = arg6 - arg2;
                    int var43 = this.field7114 * arg2;
                    while (true) {
                        var42--;
                        if (var42 < 0) {
                            while (true) {
                                var41--;
                                if (var41 < 0) {
                                    return;
                                }
                                class350.method2146((byte) -5, var39 >> 16, var43, 0, this.field7111, var40 >> 16);
                                var39 += var9;
                                var43 += this.field7114;
                                var40 += var8;
                            }
                        }
                        class350.method2146((byte) -5, var39 >> 16, var43, 0, this.field7111, var38 >> 16);
                        var43 += this.field7114;
                        var39 += var9;
                        var38 += var10;
                    }
                } else {
                    int var44 = arg3 - arg6;
                    int var45 = arg6 - arg2;
                    int var46 = this.field7114 * arg2;
                    while (true) {
                        var45--;
                        if (var45 < 0) {
                            while (true) {
                                var44--;
                                if (var44 < 0) {
                                    return;
                                }
                                class350.method2146((byte) -5, var40 >> 16, var46, 0, this.field7111, var39 >> 16);
                                var39 += var9;
                                var40 += var8;
                                var46 += this.field7114;
                            }
                        }
                        class350.method2146((byte) -5, var38 >> 16, var46, 0, this.field7111, var39 >> 16);
                        var38 += var10;
                        var39 += var9;
                        var46 += this.field7114;
                    }
                }
            }
        } else if (arg6 > arg2) {
            int var47;
            int var48 = var47 = arg1 << 16;
            if (arg3 < 0) {
                var48 -= arg3 * var8;
                var47 -= arg3 * var9;
                arg3 = 0;
            }
            int var49 = arg0 << 16;
            if (arg2 < 0) {
                var49 -= arg2 * var10;
                arg2 = 0;
            }
            if (arg2 != arg3 && var8 < var9 || arg2 == arg3 && var8 > var10) {
                int var50 = arg6 - arg2;
                int var51 = arg2 - arg3;
                int var52 = this.field7114 * arg3;
                while (true) {
                    var51--;
                    if (var51 < 0) {
                        while (true) {
                            var50--;
                            if (var50 < 0) {
                                return;
                            }
                            class350.method2146((byte) -5, var49 >> 16, var52, 0, this.field7111, var48 >> 16);
                            var52 += this.field7114;
                            var49 += var10;
                            var48 += var8;
                        }
                    }
                    class350.method2146((byte) -5, var47 >> 16, var52, 0, this.field7111, var48 >> 16);
                    var47 += var9;
                    var52 += this.field7114;
                    var48 += var8;
                }
            } else {
                int var53 = arg6 - arg2;
                int var54 = arg2 - arg3;
                int var55 = this.field7114 * arg3;
                while (true) {
                    var54--;
                    if (var54 < 0) {
                        while (true) {
                            var53--;
                            if (var53 < 0) {
                                return;
                            }
                            class350.method2146((byte) -5, var48 >> 16, var55, 0, this.field7111, var49 >> 16);
                            var49 += var10;
                            var48 += var8;
                            var55 += this.field7114;
                        }
                    }
                    class350.method2146((byte) -5, var48 >> 16, var55, 0, this.field7111, var47 >> 16);
                    var55 += this.field7114;
                    var47 += var9;
                    var48 += var8;
                }
            }
        } else {
            int var56;
            int var57 = var56 = arg1 << 16;
            int var58 = arg5 << 16;
            if (arg3 < 0) {
                var56 -= arg3 * var9;
                var57 -= arg3 * var8;
                arg3 = 0;
            }
            if (arg6 < 0) {
                var58 -= arg6 * var10;
                arg6 = 0;
            }
            if (var9 > var8) {
                int var59 = arg2 - arg6;
                int var60 = arg6 - arg3;
                int var61 = this.field7114 * arg3;
                while (true) {
                    var60--;
                    if (var60 < 0) {
                        while (true) {
                            var59--;
                            if (var59 < 0) {
                                return;
                            }
                            class350.method2146((byte) -5, var56 >> 16, var61, 0, this.field7111, var58 >> 16);
                            var61 += this.field7114;
                            var56 += var9;
                            var58 += var10;
                        }
                    }
                    class350.method2146((byte) -5, var56 >> 16, var61, 0, this.field7111, var57 >> 16);
                    var61 += this.field7114;
                    var56 += var9;
                    var57 += var8;
                }
            } else {
                int var62 = arg2 - arg6;
                int var63 = arg6 - arg3;
                int var64 = this.field7114 * arg3;
                while (true) {
                    var63--;
                    if (var63 < 0) {
                        while (true) {
                            var62--;
                            if (var62 < 0) {
                                return;
                            }
                            class350.method2146((byte) -5, var58 >> 16, var64, 0, this.field7111, var56 >> 16);
                            var64 += this.field7114;
                            var58 += var10;
                            var56 += var9;
                        }
                    }
                    class350.method2146((byte) -5, var57 >> 16, var64, 0, this.field7111, var56 >> 16);
                    var56 += var9;
                    var64 += this.field7114;
                    var57 += var8;
                }
            }
        }
    }

    @OriginalMember(owner = "client!iaa", name = "<init>", descriptor = "(Los;II)V", line = 633)
    public class469(class468 arg0, int arg1, int arg2) {
        this.field7111 = new byte[arg1 * arg2];
    }
}
