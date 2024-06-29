import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class383 {

    @OriginalMember(owner = "client!mb", name = "m", descriptor = "Lmm;")
    private class50 field5755 = new class50();

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "I")
    public static int field5743;

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "I")
    public static int field5744;

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "I")
    public static int field5745;

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "I")
    public static int field5746;

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "I")
    public static int field5747;

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "I")
    public static int field5748;

    @OriginalMember(owner = "client!mb", name = "i", descriptor = "I")
    public static int field5751;

    @OriginalMember(owner = "client!mb", name = "j", descriptor = "I")
    public static int field5752;

    @OriginalMember(owner = "client!mb", name = "l", descriptor = "I")
    public static int field5754;

    @OriginalMember(owner = "client!mb", name = "h", descriptor = "Lwa;")
    public static class319 field5750;

    @OriginalMember(owner = "client!mb", name = "n", descriptor = "Lmm;")
    private class50 field5756;

    @OriginalMember(owner = "client!mb", name = "k", descriptor = "[Li;")
    public static class682[] field5753;

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "[[[S")
    public static short[][][] field5749;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(B)Lmm;")
    public final class50 method2362(byte arg0) {
        field5744++;
        if (arg0 != 115) {
            field5750 = null;
        }
        class50 var2 = this.field5755.field781;
        if (this.field5755 == var2) {
            this.field5756 = null;
            return null;
        } else {
            this.field5756 = var2.field781;
            return var2;
        }
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(B)V")
    public static void method2363(byte arg0) {
        field5753 = null;
        field5749 = null;
        if (arg0 == 85) {
            field5750 = null;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIIIIII)V")
    public static final void method2364(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field5746++;
        class622.method3583(arg2, -2);
        int var7 = 0;
        int var8 = arg2 - arg0;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg2;
        int var10 = -arg2;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        if (class323.field4704 <= arg3 && class148.field2106 >= arg3) {
            int[] var15 = class565.field8253[arg3];
            int var16 = class79.method461((byte) 107, class375.field5631, arg5 - arg2, class175.field2455);
            int var17 = class79.method461((byte) 125, class375.field5631, arg2 + arg5, class175.field2455);
            int var18 = class79.method461((byte) 61, class375.field5631, arg5 - var8, class175.field2455);
            int var19 = class79.method461((byte) 51, class375.field5631, arg5 + var8, class175.field2455);
            class41.method235(var16, var15, arg6 + 16761, var18, arg4);
            class41.method235(var18, var15, arg6 + 16761, var19, arg1);
            class41.method235(var19, var15, 0, var17, arg4);
        }
        while (var9 > var7) {
            var13 += 2;
            var14 += 2;
            var12 += var14;
            var10 += var13;
            if (var12 >= 0 && var11 >= 1) {
                var11--;
                class464.field6699[var11] = var7;
                var12 -= var11 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                int var20 = arg3 - var9;
                int var21 = arg3 + var9;
                if (var21 >= class323.field4704 && class148.field2106 >= var20) {
                    if (var8 > var9) {
                        int var22 = class464.field6699[var9];
                        int var23 = class79.method461((byte) 59, class375.field5631, arg5 + var7, class175.field2455);
                        int var24 = class79.method461((byte) 108, class375.field5631, arg5 - var7, class175.field2455);
                        int var25 = class79.method461((byte) 102, class375.field5631, arg5 + var22, class175.field2455);
                        int var26 = class79.method461((byte) 52, class375.field5631, arg5 - var22, class175.field2455);
                        if (class148.field2106 >= var21) {
                            int[] var27 = class565.field8253[var21];
                            class41.method235(var24, var27, 0, var26, arg4);
                            class41.method235(var26, var27, 0, var25, arg1);
                            class41.method235(var25, var27, 0, var23, arg4);
                        }
                        if (var20 >= class323.field4704) {
                            int[] var28 = class565.field8253[var20];
                            class41.method235(var24, var28, arg6 ^ 0xFFFFBE87, var26, arg4);
                            class41.method235(var26, var28, 0, var25, arg1);
                            class41.method235(var25, var28, 0, var23, arg4);
                        }
                    } else {
                        int var29 = class79.method461((byte) 50, class375.field5631, arg5 + var7, class175.field2455);
                        int var30 = class79.method461((byte) 97, class375.field5631, arg5 - var7, class175.field2455);
                        if (var21 <= class148.field2106) {
                            class41.method235(var30, class565.field8253[var21], 0, var29, arg4);
                        }
                        if (class323.field4704 <= var20) {
                            class41.method235(var30, class565.field8253[var20], 0, var29, arg4);
                        }
                    }
                }
            }
            int var31 = arg3 - var7;
            int var32 = arg3 + var7;
            if (var32 >= class323.field4704 && var31 <= class148.field2106) {
                int var33 = arg5 + var9;
                int var34 = arg5 - var9;
                if (class175.field2455 <= var33 && class375.field5631 >= var34) {
                    int var35 = class79.method461((byte) 95, class375.field5631, var33, class175.field2455);
                    int var36 = class79.method461((byte) 127, class375.field5631, var34, class175.field2455);
                    if (var7 >= var8) {
                        if (var32 <= class148.field2106) {
                            class41.method235(var36, class565.field8253[var32], 0, var35, arg4);
                        }
                        if (var31 >= class323.field4704) {
                            class41.method235(var36, class565.field8253[var31], 0, var35, arg4);
                        }
                    } else {
                        int var37 = var11 < var7 ? class464.field6699[var7] : var11;
                        int var38 = class79.method461((byte) 60, class375.field5631, arg5 + var37, class175.field2455);
                        int var39 = class79.method461((byte) 115, class375.field5631, arg5 - var37, class175.field2455);
                        if (var32 <= class148.field2106) {
                            int[] var40 = class565.field8253[var32];
                            class41.method235(var36, var40, 0, var39, arg4);
                            class41.method235(var39, var40, 0, var38, arg1);
                            class41.method235(var38, var40, 0, var35, arg4);
                        }
                        if (class323.field4704 <= var31) {
                            int[] var41 = class565.field8253[var31];
                            class41.method235(var36, var41, 0, var39, arg4);
                            class41.method235(var39, var41, 0, var38, arg1);
                            class41.method235(var38, var41, 0, var35, arg4);
                        }
                    }
                }
            }
        }
        if (arg6 != -16761) {
            method2363((byte) -113);
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)Z")
    public final boolean method2365(int arg0) {
        field5745++;
        if (arg0 == 32066) {
            return this.field5755.field780 == this.field5755;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Z)V")
    public final void method2366(boolean arg0) {
        field5754++;
        if (arg0) {
            this.method2371(108);
        }
        while (true) {
            class50 var2 = this.field5755.field780;
            if (this.field5755 == var2) {
                this.field5756 = null;
                return;
            }
            var2.method300((byte) 61);
        }
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(I)I")
    public final int method2367(int arg0) {
        field5751++;
        int var2 = 0;
        if (arg0 > -111) {
            this.field5756 = null;
        }
        class50 var3 = this.field5755.field780;
        while (this.field5755 != var3) {
            var3 = var3.field780;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(ILmm;)V")
    public final void method2368(int arg0, class50 arg1) {
        field5752++;
        if (arg1.field781 != null) {
            arg1.method300((byte) 61);
        }
        arg1.field780 = this.field5755;
        arg1.field781 = this.field5755.field781;
        arg1.field781.field780 = arg1;
        if (arg0 != 0) {
            field5750 = null;
        }
        arg1.field780.field781 = arg1;
    }

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "(B)Lmm;")
    public final class50 method2369(byte arg0) {
        field5743++;
        int var2 = -61 / ((76 - arg0) / 46);
        class50 var3 = this.field5756;
        if (this.field5755 == var3) {
            this.field5756 = null;
            return null;
        } else {
            this.field5756 = var3.field780;
            return var3;
        }
    }

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "(I)Lmm;")
    public final class50 method2370(int arg0) {
        field5747++;
        class50 var2 = this.field5755.field780;
        if (this.field5755 == var2) {
            this.field5756 = null;
            return null;
        } else if (arg0 == -26173) {
            this.field5756 = var2.field780;
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "(I)Lmm;")
    public final class50 method2371(int arg0) {
        field5748++;
        class50 var2 = this.field5755.field780;
        if (this.field5755 == var2) {
            return null;
        } else {
            var2.method300((byte) 61);
            int var3 = -15 / ((-arg0 - 2) / 37);
            return var2;
        }
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "()V")
    public class383() {
        this.field5755.field780 = this.field5755;
        this.field5755.field781 = this.field5755;
    }
}
