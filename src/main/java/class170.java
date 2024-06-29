import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class170 {

    @OriginalMember(owner = "client!mc", name = "h", descriptor = "Lh;")
    public class206 field2862 = new class206();

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "Lwa;")
    public static class75 field2858 = class66.method560(" <col=ffff00>", false);

    @OriginalMember(owner = "client!mc", name = "m", descriptor = "I")
    public static int field2867 = 0;

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "I")
    public static int field2860 = 0;

    @OriginalMember(owner = "client!mc", name = "j", descriptor = "I")
    public static int field2864 = 0;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "I")
    public static int field2855;

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "I")
    public static int field2857;

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "I")
    public static int field2859;

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "I")
    public static int field2861;

    @OriginalMember(owner = "client!mc", name = "i", descriptor = "I")
    public static int field2863;

    @OriginalMember(owner = "client!mc", name = "k", descriptor = "I")
    public static int field2865;

    @OriginalMember(owner = "client!mc", name = "l", descriptor = "I")
    public static int field2866;

    @OriginalMember(owner = "client!mc", name = "n", descriptor = "I")
    public static int field2868;

    @OriginalMember(owner = "client!mc", name = "o", descriptor = "I")
    public static int field2869;

    @OriginalMember(owner = "client!mc", name = "p", descriptor = "I")
    public static int field2870;

    @OriginalMember(owner = "client!mc", name = "q", descriptor = "I")
    public static int field2871;

    @OriginalMember(owner = "client!mc", name = "r", descriptor = "I")
    public static int field2872;

    @OriginalMember(owner = "client!mc", name = "s", descriptor = "Lh;")
    private class206 field2873;

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "[[Lcg;")
    public static class38[][] field2856;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Z)Lh;", line = 17)
    public final class206 method1250(boolean arg0) {
        class206 var2 = this.field2862.field3483;
        field2855++;
        if (this.field2862 == var2) {
            this.field2873 = null;
            return null;
        } else {
            this.field2873 = var2.field3483;
            return arg0 ? var2 : (class206) null;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lh;I)V", line = 55)
    public final void method1251(class206 arg0, int arg1) {
        if (arg0.field3490 != null) {
            arg0.method1527(54);
        }
        field2869++;
        arg0.field3490 = this.field2862.field3490;
        arg0.field3483 = this.field2862;
        arg0.field3490.field3483 = arg0;
        if (arg1 > -115) {
            field2864 = 109;
        }
        arg0.field3483.field3490 = arg0;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIIILpj;Lpj;IIJ)V", line = 74)
    public static final void method1252(int arg0, int arg1, int arg2, int arg3, class171 arg4, class171 arg5, int arg6, int arg7, long arg8) {
        if (arg4 == null && arg5 == null) {
            return;
        }
        class167 var10 = new class167();
        var10.field2814 = arg8;
        var10.field2823 = arg1 * 128 + 64;
        var10.field2822 = arg2 * 128 + 64;
        var10.field2819 = arg3;
        var10.field2815 = arg4;
        var10.field2809 = arg5;
        var10.field2818 = arg6;
        var10.field2821 = arg7;
        for (int var11 = arg0; var11 >= 0; var11--) {
            if (class271.field4681[var11][arg1][arg2] == null) {
                class271.field4681[var11][arg1][arg2] = new class242(var11, arg1, arg2);
            }
        }
        class271.field4681[arg0][arg1][arg2].field4098 = var10;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IBIII)V", line = 102)
    public static final void method1253(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (arg4 >= class153.field2635 && class288.field4956 >= arg4) {
            int var5 = class14.method74(class294.field5041, arg2, -1178441849, class90.field1495);
            int var6 = class14.method74(class294.field5041, arg0, -1178441849, class90.field1495);
            class305.method2097(var6, arg4, var5, 1984052364, arg3);
        }
        field2868++;
        if (arg1 < 40) {
            field2867 = -124;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)Lh;", line = 120)
    public final class206 method1254(int arg0) {
        field2870++;
        class206 var2 = this.field2862.field3490;
        if (arg0 != 16) {
            return (class206) null;
        } else if (this.field2862 == var2) {
            this.field2873 = null;
            return null;
        } else {
            this.field2873 = var2.field3490;
            return var2;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Ltk;IIIIIIIZ)V", line = 142)
    public static final void method1255(class236 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        int var9;
        int var10 = var9 = (arg6 << 7) - class199.field3347;
        int var11;
        int var12 = var11 = (arg7 << 7) - class207.field3509;
        int var13;
        int var14 = var13 = var10 + 128;
        int var15;
        int var16 = var15 = var12 + 128;
        int var17 = class53.field879[arg1][arg6][arg7] - class300.field5129;
        int var18 = class53.field879[arg1][arg6 + 1][arg7] - class300.field5129;
        int var19 = class53.field879[arg1][arg6 + 1][arg7 + 1] - class300.field5129;
        int var20 = class53.field879[arg1][arg6][arg7 + 1] - class300.field5129;
        int var21 = arg4 * var12 + arg5 * var10 >> 16;
        int var22 = arg5 * var12 - arg4 * var10 >> 16;
        int var24 = arg3 * var17 - arg2 * var22 >> 16;
        int var25 = arg2 * var17 + arg3 * var22 >> 16;
        if (var25 < 50) {
            return;
        }
        int var27 = arg4 * var11 + arg5 * var14 >> 16;
        int var28 = arg5 * var11 - arg4 * var14 >> 16;
        int var30 = arg3 * var18 - arg2 * var28 >> 16;
        int var31 = arg2 * var18 + arg3 * var28 >> 16;
        if (var31 < 50) {
            return;
        }
        int var33 = arg4 * var16 + arg5 * var13 >> 16;
        int var34 = arg5 * var16 - arg4 * var13 >> 16;
        int var36 = arg3 * var19 - arg2 * var34 >> 16;
        int var37 = arg2 * var19 + arg3 * var34 >> 16;
        if (var37 < 50) {
            return;
        }
        int var39 = arg4 * var15 + arg5 * var9 >> 16;
        int var40 = arg5 * var15 - arg4 * var9 >> 16;
        int var42 = arg3 * var20 - arg2 * var40 >> 16;
        int var43 = arg2 * var20 + arg3 * var40 >> 16;
        if (var43 < 50) {
            return;
        }
        int var45 = (var21 << 9) / var25 + class21.field283;
        int var46 = (var24 << 9) / var25 + class21.field278;
        int var47 = (var27 << 9) / var31 + class21.field283;
        int var48 = (var30 << 9) / var31 + class21.field278;
        int var49 = (var33 << 9) / var37 + class21.field283;
        int var50 = (var36 << 9) / var37 + class21.field278;
        int var51 = (var39 << 9) / var43 + class21.field283;
        int var52 = (var42 << 9) / var43 + class21.field278;
        class21.field291 = 0;
        if ((var48 - var52) * (var49 - var51) - (var47 - var51) * (var50 - var52) > 0 && class259.field4337 && class221.method1622(class250.field4205 + class21.field283, class21.field278 + class116.field1965, var50, var52, var48, var49, var51, var47)) {
            class232.field3930 = arg6;
            class195.field3283 = arg7;
        }
        if ((var45 - var47) * (var52 - var48) - (var46 - var48) * (var51 - var47) > 0 && class259.field4337 && class221.method1622(class250.field4205 + class21.field283, class21.field278 + class116.field1965, var46, var48, var52, var45, var47, var51)) {
            class232.field3930 = arg6;
            class195.field3283 = arg7;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(B)Lh;", line = 250)
    public final class206 method1256(byte arg0) {
        field2866++;
        class206 var2 = this.field2873;
        if (this.field2862 == var2) {
            this.field2873 = null;
            return null;
        } else if (arg0 > -121) {
            return (class206) null;
        } else {
            this.field2873 = var2.field3483;
            return var2;
        }
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(I)Lh;", line = 271)
    public final class206 method1257(int arg0) {
        field2861++;
        if (arg0 != 1) {
            return (class206) null;
        }
        class206 var2 = this.field2873;
        if (this.field2862 == var2) {
            this.field2873 = null;
            return null;
        } else {
            this.field2873 = var2.field3490;
            return var2;
        }
    }

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "(I)Lh;", line = 294)
    public final class206 method1258(int arg0) {
        field2863++;
        if (arg0 != 50) {
            field2867 = -42;
        }
        class206 var2 = this.field2862.field3483;
        if (this.field2862 == var2) {
            return null;
        } else {
            var2.method1527(80);
            return var2;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIIIIII)V", line = 312)
    public static final void method1259(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2859++;
        if (arg3 != 1083924257) {
            field2867 = -2;
        }
        class13.method67(0, arg6);
        int var7 = arg6 - arg1;
        int var8 = arg6;
        int var9 = 0;
        if (var7 < 0) {
            var7 = 0;
        }
        int var10 = -arg6;
        int var11 = var7;
        int var12 = -var7;
        if (class90.field1495 <= arg0 && arg0 <= class294.field5041) {
            int[] var13 = class63.field1096[arg0];
            int var14 = class14.method74(class288.field4956, arg4 - arg6, -1178441849, class153.field2635);
            int var15 = class14.method74(class288.field4956, arg4 + arg6, -1178441849, class153.field2635);
            int var16 = class14.method74(class288.field4956, arg4 - var7, -1178441849, class153.field2635);
            int var17 = class14.method74(class288.field4956, arg4 + var7, -1178441849, class153.field2635);
            class150.method1151(arg3 - 1083924250, var13, var14, arg2, var16);
            class150.method1151(7, var13, var16, arg5, var17);
            class150.method1151(arg3 - 1083924250, var13, var17, arg2, var15);
        }
        int var18 = -1;
        int var19 = -1;
        while (var8 > var9) {
            var19 += 2;
            var18 += 2;
            var12 += var19;
            var10 += var18;
            if (var12 >= 0 && var11 >= 1) {
                var11--;
                class113.field1918[var11] = var9;
                var12 -= var11 << 1;
            }
            var9++;
            if (var10 >= 0) {
                var8--;
                int var20 = arg0 - var8;
                var10 -= var8 << 1;
                int var21 = arg0 + var8;
                if (var21 >= class90.field1495 && var20 <= class294.field5041) {
                    if (var7 > var8) {
                        int var22 = class113.field1918[var8];
                        int var23 = class14.method74(class288.field4956, arg4 + var9, arg3 ^ 0xF95938A6, class153.field2635);
                        int var24 = class14.method74(class288.field4956, arg4 - var9, -1178441849, class153.field2635);
                        int var25 = class14.method74(class288.field4956, arg4 + var22, -1178441849, class153.field2635);
                        int var26 = class14.method74(class288.field4956, arg4 - var22, -1178441849, class153.field2635);
                        if (var21 <= class294.field5041) {
                            int[] var27 = class63.field1096[var21];
                            class150.method1151(7, var27, var24, arg2, var26);
                            class150.method1151(7, var27, var26, arg5, var25);
                            class150.method1151(7, var27, var25, arg2, var23);
                        }
                        if (var20 >= class90.field1495) {
                            int[] var28 = class63.field1096[var20];
                            class150.method1151(7, var28, var24, arg2, var26);
                            class150.method1151(7, var28, var26, arg5, var25);
                            class150.method1151(arg3 - 1083924250, var28, var25, arg2, var23);
                        }
                    } else {
                        int var29 = class14.method74(class288.field4956, arg4 + var9, -1178441849, class153.field2635);
                        int var30 = class14.method74(class288.field4956, arg4 - var9, -1178441849, class153.field2635);
                        if (class294.field5041 >= var21) {
                            class150.method1151(7, class63.field1096[var21], var30, arg2, var29);
                        }
                        if (var20 >= class90.field1495) {
                            class150.method1151(7, class63.field1096[var20], var30, arg2, var29);
                        }
                    }
                }
            }
            int var31 = arg0 - var9;
            int var32 = arg0 + var9;
            if (var32 >= class90.field1495 && var31 <= class294.field5041) {
                int var33 = arg4 + var8;
                int var34 = arg4 - var8;
                if (class153.field2635 <= var33 && var34 <= class288.field4956) {
                    int var35 = class14.method74(class288.field4956, var33, -1178441849, class153.field2635);
                    int var36 = class14.method74(class288.field4956, var34, arg3 + 2032601190, class153.field2635);
                    if (var9 < var7) {
                        int var37 = var11 >= var9 ? var11 : class113.field1918[var9];
                        int var38 = class14.method74(class288.field4956, arg4 + var37, -1178441849, class153.field2635);
                        int var39 = class14.method74(class288.field4956, arg4 - var37, -1178441849, class153.field2635);
                        if (class294.field5041 >= var32) {
                            int[] var40 = class63.field1096[var32];
                            class150.method1151(7, var40, var36, arg2, var39);
                            class150.method1151(7, var40, var39, arg5, var38);
                            class150.method1151(arg3 ^ 0x409B5F26, var40, var38, arg2, var35);
                        }
                        if (var31 >= class90.field1495) {
                            int[] var41 = class63.field1096[var31];
                            class150.method1151(7, var41, var36, arg2, var39);
                            class150.method1151(7, var41, var39, arg5, var38);
                            class150.method1151(7, var41, var38, arg2, var35);
                        }
                    } else {
                        if (class294.field5041 >= var32) {
                            class150.method1151(7, class63.field1096[var32], var36, arg2, var35);
                        }
                        if (class90.field1495 <= var31) {
                            class150.method1151(7, class63.field1096[var31], var36, arg2, var35);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lh;Z)V", line = 499)
    public final void method1260(class206 arg0, boolean arg1) {
        if (arg0.field3490 != null) {
            arg0.method1527(84);
        }
        arg0.field3490 = this.field2862;
        field2872++;
        arg0.field3483 = this.field2862.field3483;
        if (!arg1) {
            arg0.field3490.field3483 = arg0;
            arg0.field3483.field3490 = arg0;
        }
    }

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "(I)V", line = 519)
    public final void method1261(int arg0) {
        while (true) {
            class206 var2 = this.field2862.field3483;
            if (this.field2862 == var2) {
                field2871++;
                this.field2873 = null;
                if (arg0 != 2) {
                    field2864 = -113;
                }
                return;
            }
            var2.method1527(-115);
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(ILcb;II)[Lcm;", line = 554)
    public static final class181[] method1262(int arg0, class267 arg1, int arg2, int arg3) {
        field2865++;
        if (arg2 != -27907) {
            field2858 = (class75) null;
        }
        return class281.method1994(arg3, (byte) -7, arg0, arg1) ? class61.method537(9907) : null;
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "()V", line = 575)
    public class170() {
        this.field2862.field3490 = this.field2862;
        this.field2862.field3483 = this.field2862;
    }

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "(I)V", line = 585)
    public static void method1263(int arg0) {
        field2858 = null;
        field2856 = (class38[][]) null;
        if (arg0 != 0) {
            field2864 = -76;
        }
    }
}
