import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class57 extends class206 {

    @OriginalMember(owner = "client!g", name = "z", descriptor = "I")
    private int field915;

    @OriginalMember(owner = "client!g", name = "C", descriptor = "I")
    private int field918;

    @OriginalMember(owner = "client!g", name = "O", descriptor = "Z")
    private boolean field929;

    @OriginalMember(owner = "client!g", name = "D", descriptor = "I")
    private int field919;

    @OriginalMember(owner = "client!g", name = "N", descriptor = "I")
    private int field928;

    @OriginalMember(owner = "client!g", name = "A", descriptor = "I")
    private int field916;

    @OriginalMember(owner = "client!g", name = "J", descriptor = "I")
    private int field924;

    @OriginalMember(owner = "client!g", name = "B", descriptor = "I")
    private int field917;

    @OriginalMember(owner = "client!g", name = "E", descriptor = "I")
    private int field920;

    @OriginalMember(owner = "client!g", name = "F", descriptor = "I")
    private int field921;

    @OriginalMember(owner = "client!g", name = "H", descriptor = "I")
    private int field922;

    @OriginalMember(owner = "client!g", name = "I", descriptor = "I")
    private int field923;

    @OriginalMember(owner = "client!g", name = "K", descriptor = "I")
    private int field925;

    @OriginalMember(owner = "client!g", name = "L", descriptor = "I")
    private int field926;

    @OriginalMember(owner = "client!g", name = "M", descriptor = "I")
    private int field927;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(I[B[IIIIIIIILg;)I")
    private static final int method367(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class57 arg10) {
        int var11 = arg3 >> 8;
        int var12 = arg9 >> 8;
        int var13 = arg5 << 2;
        int var14 = arg6 << 2;
        int var15;
        if ((var15 = arg4 + var12 - var11) > arg8) {
            var15 = arg8;
        }
        int var16 = arg4 << 1;
        int var17 = var15 << 1;
        int var23 = var17 - 6;
        while (var16 < var23) {
            byte var19 = arg1[var11++];
            int var24 = var16++;
            arg2[var24] += var13 * var19;
            int var25 = var16++;
            arg2[var25] += var14 * var19;
            byte var20 = arg1[var11++];
            int var27 = var16++;
            arg2[var27] += var13 * var20;
            int var28 = var16++;
            arg2[var28] += var14 * var20;
            byte var21 = arg1[var11++];
            int var30 = var16++;
            arg2[var30] += var13 * var21;
            int var31 = var16++;
            arg2[var31] += var14 * var21;
            byte var22 = arg1[var11++];
            int var33 = var16++;
            arg2[var33] += var13 * var22;
            int var34 = var16++;
            arg2[var34] += var14 * var22;
        }
        var17 = var23 + 6;
        while (var16 < var17) {
            byte var18 = arg1[var11++];
            int var10001 = var16++;
            arg2[var10001] += var13 * var18;
            int var35 = var16++;
            arg2[var35] += var14 * var18;
        }
        arg10.field924 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(II[B[IIIIIIIIIILg;II)I")
    private static final int method368(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class57 arg13, int arg14, int arg15) {
        arg13.field922 -= arg13.field921 * arg5;
        int var16;
        if (arg14 == 0 || (var16 = (arg12 + 256 - arg4 + arg14) / arg14 + arg5) > arg11) {
            var16 = arg11;
        }
        int var17 = arg5 << 1;
        int var18 = var16 << 1;
        int var10001;
        while (var17 < var18) {
            int var24 = arg4 >> 8;
            byte var25 = arg2[var24 - 1];
            int var26 = (var25 << 8) + (arg4 & 255) * (arg2[var24] - var25);
            var10001 = var17++;
            arg3[var10001] += arg6 * var26 >> 6;
            arg6 += arg8;
            int var27 = var17++;
            arg3[var27] += arg7 * var26 >> 6;
            arg7 += arg9;
            arg4 += arg14;
        }
        int var19;
        if (arg14 == 0 || (var19 = (var17 >> 1) + (arg12 - arg4 + arg14) / arg14) > arg11) {
            var19 = arg11;
        }
        int var20 = var19 << 1;
        int var21 = arg15;
        while (var17 < var20) {
            int var23 = (var21 << 8) + (arg4 & 255) * (arg2[arg4 >> 8] - var21);
            var10001 = var17++;
            arg3[var10001] += arg6 * var23 >> 6;
            arg6 += arg8;
            var10001 = var17++;
            arg3[var10001] += arg7 * var23 >> 6;
            arg7 += arg9;
            arg4 += arg14;
        }
        int var22 = var17 >> 1;
        arg13.field922 += arg13.field921 * var22;
        arg13.field923 = arg6;
        arg13.field925 = arg7;
        arg13.field924 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!g", name = "e", descriptor = "()I")
    public final synchronized int method369() {
        return this.field919 < 0 ? -this.field919 : this.field919;
    }

    @OriginalMember(owner = "client!g", name = "d", descriptor = "(I)V")
    public final synchronized void method370(int arg0) {
        this.method387(arg0 << 6, this.method384());
    }

    @OriginalMember(owner = "client!g", name = "f", descriptor = "()V")
    private final void method371() {
        this.field922 = this.field928;
        this.field923 = method393(this.field928, this.field916);
        this.field925 = method400(this.field928, this.field916);
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(I[B[IIIIIIIIIILg;)I")
    private static final int method372(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class57 arg12) {
        int var13 = arg3 >> 8;
        int var14 = arg11 >> 8;
        int var15 = arg5 << 2;
        int var16 = arg6 << 2;
        int var17 = arg7 << 2;
        int var18 = arg8 << 2;
        int var19;
        if ((var19 = arg4 + var13 - (var14 - 1)) > arg10) {
            var19 = arg10;
        }
        arg12.field922 += (var19 - arg4) * arg12.field921;
        int var20 = arg4 << 1;
        int var21 = var19 << 1;
        int var44 = var21 - 6;
        while (var20 < var44) {
            byte var23 = arg1[var13--];
            int var33 = var20++;
            arg2[var33] += var15 * var23;
            int var24 = var15 + var17;
            int var34 = var20++;
            arg2[var34] += var16 * var23;
            int var25 = var16 + var18;
            byte var26 = arg1[var13--];
            int var36 = var20++;
            arg2[var36] += var24 * var26;
            int var27 = var17 + var24;
            int var37 = var20++;
            arg2[var37] += var25 * var26;
            int var28 = var18 + var25;
            byte var29 = arg1[var13--];
            int var39 = var20++;
            arg2[var39] += var27 * var29;
            int var30 = var17 + var27;
            int var40 = var20++;
            arg2[var40] += var28 * var29;
            int var31 = var18 + var28;
            byte var32 = arg1[var13--];
            int var42 = var20++;
            arg2[var42] += var30 * var32;
            var15 = var17 + var30;
            int var43 = var20++;
            arg2[var43] += var31 * var32;
            var16 = var18 + var31;
        }
        var21 = var44 + 6;
        while (var20 < var21) {
            byte var22 = arg1[var13--];
            int var10001 = var20++;
            arg2[var10001] += var15 * var22;
            var15 += var17;
            int var45 = var20++;
            arg2[var45] += var16 * var22;
            var16 += var18;
        }
        arg12.field923 = var15 >> 2;
        arg12.field925 = var16 >> 2;
        arg12.field924 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!g", name = "g", descriptor = "()I")
    public final synchronized int method373() {
        return this.field928 == Integer.MIN_VALUE ? 0 : this.field928;
    }

    @OriginalMember(owner = "client!g", name = "h", descriptor = "()Z")
    public final boolean method374() {
        return this.field927 != 0;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(II[B[IIIIIIIILg;II)I")
    private static final int method375(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class57 arg11, int arg12, int arg13) {
        int var14;
        if (arg12 == 0 || (var14 = (arg10 + 256 - arg4 + arg12) / arg12 + arg5) > arg9) {
            var14 = arg9;
        }
        int var15 = arg5 << 1;
        int var16 = var14 << 1;
        int var10001;
        while (var15 < var16) {
            int var21 = arg4 >> 8;
            byte var22 = arg2[var21 - 1];
            int var23 = (var22 << 8) + (arg4 & 255) * (arg2[var21] - var22);
            var10001 = var15++;
            arg3[var10001] += arg6 * var23 >> 6;
            int var24 = var15++;
            arg3[var24] += arg7 * var23 >> 6;
            arg4 += arg12;
        }
        int var17;
        if (arg12 == 0 || (var17 = (var15 >> 1) + (arg10 - arg4 + arg12) / arg12) > arg9) {
            var17 = arg9;
        }
        int var18 = var17 << 1;
        int var19 = arg13;
        while (var15 < var18) {
            int var20 = (var19 << 8) + (arg4 & 255) * (arg2[arg4 >> 8] - var19);
            var10001 = var15++;
            arg3[var10001] += arg6 * var20 >> 6;
            var10001 = var15++;
            arg3[var10001] += arg7 * var20 >> 6;
            arg4 += arg12;
        }
        arg11.field924 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(I[B[IIIIIIIIIILg;)I")
    private static final int method376(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class57 arg12) {
        int var13 = arg3 >> 8;
        int var14 = arg11 >> 8;
        int var15 = arg5 << 2;
        int var16 = arg6 << 2;
        int var17 = arg7 << 2;
        int var18 = arg8 << 2;
        int var19;
        if ((var19 = arg4 + var14 - var13) > arg10) {
            var19 = arg10;
        }
        arg12.field922 += (var19 - arg4) * arg12.field921;
        int var20 = arg4 << 1;
        int var21 = var19 << 1;
        int var44 = var21 - 6;
        while (var20 < var44) {
            byte var23 = arg1[var13++];
            int var33 = var20++;
            arg2[var33] += var15 * var23;
            int var24 = var15 + var17;
            int var34 = var20++;
            arg2[var34] += var16 * var23;
            int var25 = var16 + var18;
            byte var26 = arg1[var13++];
            int var36 = var20++;
            arg2[var36] += var24 * var26;
            int var27 = var17 + var24;
            int var37 = var20++;
            arg2[var37] += var25 * var26;
            int var28 = var18 + var25;
            byte var29 = arg1[var13++];
            int var39 = var20++;
            arg2[var39] += var27 * var29;
            int var30 = var17 + var27;
            int var40 = var20++;
            arg2[var40] += var28 * var29;
            int var31 = var18 + var28;
            byte var32 = arg1[var13++];
            int var42 = var20++;
            arg2[var42] += var30 * var32;
            var15 = var17 + var30;
            int var43 = var20++;
            arg2[var43] += var31 * var32;
            var16 = var18 + var31;
        }
        var21 = var44 + 6;
        while (var20 < var21) {
            byte var22 = arg1[var13++];
            int var10001 = var20++;
            arg2[var10001] += var15 * var22;
            var15 += var17;
            int var45 = var20++;
            arg2[var45] += var16 * var22;
            var16 += var18;
        }
        arg12.field923 = var15 >> 2;
        arg12.field925 = var16 >> 2;
        arg12.field924 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!g", name = "i", descriptor = "()Z")
    public final boolean method377() {
        return this.field924 < 0 || this.field924 >= ((class142) super.field3495).field2426.length << 8;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "([IIIII)I")
    private final int method378(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field927 <= 0) {
                if (this.field919 == -256 && (this.field924 & 255) == 0) {
                    if (class225.field3868) {
                        return method380(0, ((class142) super.field3495).field2426, arg0, this.field924, arg1, this.field923, this.field925, 0, arg3, arg2, this);
                    }
                    return method404(((class142) super.field3495).field2426, arg0, this.field924, arg1, this.field922, 0, arg3, arg2, this);
                }
                if (class225.field3868) {
                    return method375(0, 0, ((class142) super.field3495).field2426, arg0, this.field924, arg1, this.field923, this.field925, 0, arg3, arg2, this, this.field919, arg4);
                }
                return method390(0, 0, ((class142) super.field3495).field2426, arg0, this.field924, arg1, this.field922, 0, arg3, arg2, this, this.field919, arg4);
            }
            int var6 = this.field927 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field927 += arg1;
            if (this.field919 == -256 && (this.field924 & 255) == 0) {
                if (class225.field3868) {
                    arg1 = method372(0, ((class142) super.field3495).field2426, arg0, this.field924, arg1, this.field923, this.field925, this.field920, this.field917, 0, var6, arg2, this);
                } else {
                    arg1 = method382(((class142) super.field3495).field2426, arg0, this.field924, arg1, this.field922, this.field921, 0, var6, arg2, this);
                }
            } else if (class225.field3868) {
                arg1 = method368(0, 0, ((class142) super.field3495).field2426, arg0, this.field924, arg1, this.field923, this.field925, this.field920, this.field917, 0, var6, arg2, this, this.field919, arg4);
            } else {
                arg1 = method403(0, 0, ((class142) super.field3495).field2426, arg0, this.field924, arg1, this.field922, this.field921, 0, var6, arg2, this, this.field919, arg4);
            }
            this.field927 -= arg1;
            if (this.field927 != 0) {
                return arg1;
            }
        } while (!this.method389());
        return arg3;
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(II[B[IIIIIIIILg;II)I")
    private static final int method379(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class57 arg11, int arg12, int arg13) {
        arg11.field923 -= arg11.field920 * arg5;
        arg11.field925 -= arg11.field917 * arg5;
        int var14;
        if (arg12 == 0 || (var14 = (arg10 - arg4 + arg12 - 257) / arg12 + arg5) > arg9) {
            var14 = arg9;
        }
        int var10001;
        while (arg5 < var14) {
            int var18 = arg4 >> 8;
            byte var19 = arg2[var18];
            var10001 = arg5++;
            arg3[var10001] += ((var19 << 8) + (arg4 & 255) * (arg2[var18 + 1] - var19)) * arg6 >> 6;
            arg6 += arg7;
            arg4 += arg12;
        }
        int var15;
        if (arg12 == 0 || (var15 = (arg10 - arg4 + arg12 - 1) / arg12 + arg5) > arg9) {
            var15 = arg9;
        }
        int var16 = arg13;
        while (arg5 < var15) {
            byte var17 = arg2[arg4 >> 8];
            var10001 = arg5++;
            arg3[var10001] += ((var17 << 8) + (arg4 & 255) * (var16 - var17)) * arg6 >> 6;
            arg6 += arg7;
            arg4 += arg12;
        }
        arg11.field923 += arg11.field920 * arg5;
        arg11.field925 += arg11.field917 * arg5;
        arg11.field922 = arg6;
        arg11.field924 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(I[B[IIIIIIIILg;)I")
    private static final int method380(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class57 arg10) {
        int var11 = arg3 >> 8;
        int var12 = arg9 >> 8;
        int var13 = arg5 << 2;
        int var14 = arg6 << 2;
        int var15;
        if ((var15 = arg4 + var11 - (var12 - 1)) > arg8) {
            var15 = arg8;
        }
        int var16 = arg4 << 1;
        int var17 = var15 << 1;
        int var23 = var17 - 6;
        while (var16 < var23) {
            byte var19 = arg1[var11--];
            int var24 = var16++;
            arg2[var24] += var13 * var19;
            int var25 = var16++;
            arg2[var25] += var14 * var19;
            byte var20 = arg1[var11--];
            int var27 = var16++;
            arg2[var27] += var13 * var20;
            int var28 = var16++;
            arg2[var28] += var14 * var20;
            byte var21 = arg1[var11--];
            int var30 = var16++;
            arg2[var30] += var13 * var21;
            int var31 = var16++;
            arg2[var31] += var14 * var21;
            byte var22 = arg1[var11--];
            int var33 = var16++;
            arg2[var33] += var13 * var22;
            int var34 = var16++;
            arg2[var34] += var14 * var22;
        }
        var17 = var23 + 6;
        while (var16 < var17) {
            byte var18 = arg1[var11--];
            int var10001 = var16++;
            arg2[var10001] += var13 * var18;
            int var35 = var16++;
            arg2[var35] += var14 * var18;
        }
        arg10.field924 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!g", name = "e", descriptor = "(I)V")
    public final synchronized void method381(int arg0) {
        if (arg0 == 0) {
            this.method405(0);
            this.method441(16773377);
        } else if (this.field923 == 0 && this.field925 == 0) {
            this.field927 = 0;
            this.field928 = 0;
            this.field922 = 0;
            this.method441(16773377);
        } else {
            int var2 = -this.field922;
            if (this.field922 > var2) {
                var2 = this.field922;
            }
            if (-this.field923 > var2) {
                var2 = -this.field923;
            }
            if (this.field923 > var2) {
                var2 = this.field923;
            }
            if (-this.field925 > var2) {
                var2 = -this.field925;
            }
            if (this.field925 > var2) {
                var2 = this.field925;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field927 = arg0;
            this.field928 = Integer.MIN_VALUE;
            this.field921 = -this.field922 / arg0;
            this.field920 = -this.field923 / arg0;
            this.field917 = -this.field925 / arg0;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "([B[IIIIIIIILg;)I")
    private static final int method382(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class57 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field923 += (var14 - arg3) * arg9.field920;
        arg9.field925 += (var14 - arg3) * arg9.field917;
        var14 -= 3;
        int var10001;
        while (arg3 < var14) {
            var10001 = arg3++;
            arg1[var10001] += arg0[var10--] * var12;
            int var15 = var12 + var13;
            int var18 = arg3++;
            arg1[var18] += arg0[var10--] * var15;
            int var16 = var13 + var15;
            int var19 = arg3++;
            arg1[var19] += arg0[var10--] * var16;
            int var17 = var13 + var16;
            int var20 = arg3++;
            arg1[var20] += arg0[var10--] * var17;
            var12 = var13 + var17;
        }
        var14 += 3;
        while (arg3 < var14) {
            var10001 = arg3++;
            arg1[var10001] += arg0[var10--] * var12;
            var12 += var13;
        }
        arg9.field922 = var12 >> 2;
        arg9.field924 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!g", name = "f", descriptor = "(I)V")
    public final synchronized void method383(int arg0) {
        int var2 = ((class142) super.field3495).field2426.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field924 = arg0;
    }

    @OriginalMember(owner = "client!g", name = "j", descriptor = "()I")
    public final synchronized int method384() {
        return this.field916 < 0 ? -1 : this.field916;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Lbk;III)Lg;")
    public static final class57 method385(class142 arg0, int arg1, int arg2, int arg3) {
        return arg0.field2426 != null && arg0.field2426.length != 0 ? new class57(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!g", name = "k", descriptor = "()V")
    private final void method386() {
        if (this.field927 != 0) {
            if (this.field928 == Integer.MIN_VALUE) {
                this.field928 = 0;
            }
            this.field927 = 0;
            this.method371();
        }
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(II)V")
    private final synchronized void method387(int arg0, int arg1) {
        this.field928 = arg0;
        this.field916 = arg1;
        this.field927 = 0;
        this.method371();
    }

    @OriginalMember(owner = "client!g", name = "c", descriptor = "(II)V")
    public final synchronized void method388(int arg0, int arg1) {
        this.method392(arg0, arg1, this.method384());
    }

    @OriginalMember(owner = "client!g", name = "l", descriptor = "()Z")
    private final boolean method389() {
        int var1 = this.field928;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method393(var1, this.field916);
            var2 = method400(var1, this.field916);
        }
        if (this.field922 == var1 && this.field923 == var3 && this.field925 == var2) {
            if (this.field928 == Integer.MIN_VALUE) {
                this.field928 = 0;
                this.field922 = this.field923 = this.field925 = 0;
                this.method441(16773377);
                return true;
            } else {
                this.method371();
                return false;
            }
        } else {
            if (this.field922 < var1) {
                this.field921 = 1;
                this.field927 = var1 - this.field922;
            } else if (this.field922 > var1) {
                this.field921 = -1;
                this.field927 = this.field922 - var1;
            } else {
                this.field921 = 0;
            }
            if (this.field923 < var3) {
                this.field920 = 1;
                if (this.field927 == 0 || this.field927 > var3 - this.field923) {
                    this.field927 = var3 - this.field923;
                }
            } else if (this.field923 > var3) {
                this.field920 = -1;
                if (this.field927 == 0 || this.field927 > this.field923 - var3) {
                    this.field927 = this.field923 - var3;
                }
            } else {
                this.field920 = 0;
            }
            if (this.field925 < var2) {
                this.field917 = 1;
                if (this.field927 == 0 || this.field927 > var2 - this.field925) {
                    this.field927 = var2 - this.field925;
                }
            } else if (this.field925 > var2) {
                this.field917 = -1;
                if (this.field927 == 0 || this.field927 > this.field925 - var2) {
                    this.field927 = this.field925 - var2;
                }
            } else {
                this.field917 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(II[B[IIIIIIILg;II)I")
    private static final int method390(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class57 arg10, int arg11, int arg12) {
        int var13;
        if (arg11 == 0 || (var13 = (arg9 + 256 - arg4 + arg11) / arg11 + arg5) > arg8) {
            var13 = arg8;
        }
        int var10001;
        while (arg5 < var13) {
            int var17 = arg4 >> 8;
            byte var18 = arg2[var17 - 1];
            var10001 = arg5++;
            arg3[var10001] += ((var18 << 8) + (arg4 & 255) * (arg2[var17] - var18)) * arg6 >> 6;
            arg4 += arg11;
        }
        int var14;
        if (arg11 == 0 || (var14 = (arg9 - arg4 + arg11) / arg11 + arg5) > arg8) {
            var14 = arg8;
        }
        int var15 = arg12;
        int var16 = arg11;
        while (arg5 < var14) {
            var10001 = arg5++;
            arg3[var10001] += ((var15 << 8) + (arg4 & 255) * (arg2[arg4 >> 8] - var15)) * arg6 >> 6;
            arg4 += var16;
        }
        arg10.field924 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "([III)V")
    public final synchronized void method391(int[] arg0, int arg1, int arg2) {
        if (this.field928 == 0 && this.field927 == 0) {
            this.method394(arg2);
        } else {
            class142 var4 = (class142) super.field3495;
            int var5 = this.field915 << 8;
            int var6 = this.field918 << 8;
            int var7 = var4.field2426.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field926 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field924 < 0) {
                if (this.field919 <= 0) {
                    this.method386();
                    this.method441(16773377);
                    return;
                }
                this.field924 = 0;
            }
            if (this.field924 >= var7) {
                if (this.field919 >= 0) {
                    this.method386();
                    this.method441(16773377);
                    return;
                }
                this.field924 = var7 - 1;
            }
            if (this.field926 < 0) {
                if (this.field929) {
                    if (this.field919 < 0) {
                        var9 = this.method378(arg0, arg1, var5, var10, var4.field2426[this.field915]);
                        if (this.field924 >= var5) {
                            return;
                        }
                        this.field924 = var5 + var5 - 1 - this.field924;
                        this.field919 = -this.field919;
                    }
                    while (true) {
                        int var11 = this.method397(arg0, var9, var6, var10, var4.field2426[this.field918 - 1]);
                        if (this.field924 < var6) {
                            return;
                        }
                        this.field924 = var6 + var6 - 1 - this.field924;
                        this.field919 = -this.field919;
                        var9 = this.method378(arg0, var11, var5, var10, var4.field2426[this.field915]);
                        if (this.field924 >= var5) {
                            return;
                        }
                        this.field924 = var5 + var5 - 1 - this.field924;
                        this.field919 = -this.field919;
                    }
                } else if (this.field919 < 0) {
                    while (true) {
                        var9 = this.method378(arg0, var9, var5, var10, var4.field2426[this.field918 - 1]);
                        if (this.field924 >= var5) {
                            return;
                        }
                        this.field924 = var6 - 1 - (var6 - 1 - this.field924) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method397(arg0, var9, var6, var10, var4.field2426[this.field915]);
                        if (this.field924 < var6) {
                            return;
                        }
                        this.field924 = (this.field924 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field926 > 0) {
                    if (this.field929) {
                        label130: {
                            if (this.field919 < 0) {
                                var9 = this.method378(arg0, arg1, var5, var10, var4.field2426[this.field915]);
                                if (this.field924 >= var5) {
                                    return;
                                }
                                this.field924 = var5 + var5 - 1 - this.field924;
                                this.field919 = -this.field919;
                                if (--this.field926 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method397(arg0, var9, var6, var10, var4.field2426[this.field918 - 1]);
                                if (this.field924 < var6) {
                                    return;
                                }
                                this.field924 = var6 + var6 - 1 - this.field924;
                                this.field919 = -this.field919;
                                if (--this.field926 == 0) {
                                    break;
                                }
                                var9 = this.method378(arg0, var9, var5, var10, var4.field2426[this.field915]);
                                if (this.field924 >= var5) {
                                    return;
                                }
                                this.field924 = var5 + var5 - 1 - this.field924;
                                this.field919 = -this.field919;
                            } while (--this.field926 != 0);
                        }
                    } else if (this.field919 < 0) {
                        while (true) {
                            var9 = this.method378(arg0, var9, var5, var10, var4.field2426[this.field918 - 1]);
                            if (this.field924 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field924) / var8;
                            if (var12 >= this.field926) {
                                this.field924 += this.field926 * var8;
                                this.field926 = 0;
                                break;
                            }
                            this.field924 += var8 * var12;
                            this.field926 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method397(arg0, var9, var6, var10, var4.field2426[this.field915]);
                            if (this.field924 < var6) {
                                return;
                            }
                            int var13 = (this.field924 - var5) / var8;
                            if (var13 >= this.field926) {
                                this.field924 -= this.field926 * var8;
                                this.field926 = 0;
                                break;
                            }
                            this.field924 -= var8 * var13;
                            this.field926 -= var13;
                        }
                    }
                }
                if (this.field919 < 0) {
                    this.method378(arg0, var9, 0, var10, 0);
                    if (this.field924 < 0) {
                        this.field924 = -1;
                        this.method386();
                        this.method441(16773377);
                        return;
                    }
                } else {
                    this.method397(arg0, var9, var7, var10, 0);
                    if (this.field924 >= var7) {
                        this.field924 = var7;
                        this.method386();
                        this.method441(16773377);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(III)V")
    public final synchronized void method392(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method387(arg1, arg2);
        } else {
            int var4 = method393(arg1, arg2);
            int var5 = method400(arg1, arg2);
            if (this.field923 == var4 && this.field925 == var5) {
                this.field927 = 0;
            } else {
                int var6 = arg1 - this.field922;
                if (this.field922 - arg1 > var6) {
                    var6 = this.field922 - arg1;
                }
                if (var4 - this.field923 > var6) {
                    var6 = var4 - this.field923;
                }
                if (this.field923 - var4 > var6) {
                    var6 = this.field923 - var4;
                }
                if (var5 - this.field925 > var6) {
                    var6 = var5 - this.field925;
                }
                if (this.field925 - var5 > var6) {
                    var6 = this.field925 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field927 = arg0;
                this.field928 = arg1;
                this.field916 = arg2;
                this.field921 = (arg1 - this.field922) / arg0;
                this.field920 = (var4 - this.field923) / arg0;
                this.field917 = (var5 - this.field925) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!g", name = "d", descriptor = "(II)I")
    private static final int method393(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!g", name = "c", descriptor = "(I)V")
    public final synchronized void method394(int arg0) {
        if (this.field927 > 0) {
            if (arg0 >= this.field927) {
                if (this.field928 == Integer.MIN_VALUE) {
                    this.field928 = 0;
                    this.field922 = this.field923 = this.field925 = 0;
                    this.method441(16773377);
                    arg0 = this.field927;
                }
                this.field927 = 0;
                this.method371();
            } else {
                this.field922 += this.field921 * arg0;
                this.field923 += this.field920 * arg0;
                this.field925 += this.field917 * arg0;
                this.field927 -= arg0;
            }
        }
        class142 var2 = (class142) super.field3495;
        int var3 = this.field915 << 8;
        int var4 = this.field918 << 8;
        int var5 = var2.field2426.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field926 = 0;
        }
        if (this.field924 < 0) {
            if (this.field919 <= 0) {
                this.method386();
                this.method441(16773377);
                return;
            }
            this.field924 = 0;
        }
        if (this.field924 >= var5) {
            if (this.field919 >= 0) {
                this.method386();
                this.method441(16773377);
                return;
            }
            this.field924 = var5 - 1;
        }
        this.field924 += this.field919 * arg0;
        if (this.field926 < 0) {
            if (!this.field929) {
                if (this.field919 < 0) {
                    if (this.field924 < var3) {
                        this.field924 = var4 - 1 - (var4 - 1 - this.field924) % var6;
                    }
                } else if (this.field924 >= var4) {
                    this.field924 = (this.field924 - var3) % var6 + var3;
                }
            } else {
                if (this.field919 < 0) {
                    if (this.field924 >= var3) {
                        return;
                    }
                    this.field924 = var3 + var3 - 1 - this.field924;
                    this.field919 = -this.field919;
                }
                while (this.field924 >= var4) {
                    this.field924 = var4 + var4 - 1 - this.field924;
                    this.field919 = -this.field919;
                    if (this.field924 >= var3) {
                        return;
                    }
                    this.field924 = var3 + var3 - 1 - this.field924;
                    this.field919 = -this.field919;
                }
            }
        } else {
            if (this.field926 > 0) {
                if (this.field929) {
                    label125: {
                        if (this.field919 < 0) {
                            if (this.field924 >= var3) {
                                return;
                            }
                            this.field924 = var3 + var3 - 1 - this.field924;
                            this.field919 = -this.field919;
                            if (--this.field926 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field924 < var4) {
                                return;
                            }
                            this.field924 = var4 + var4 - 1 - this.field924;
                            this.field919 = -this.field919;
                            if (--this.field926 == 0) {
                                break;
                            }
                            if (this.field924 >= var3) {
                                return;
                            }
                            this.field924 = var3 + var3 - 1 - this.field924;
                            this.field919 = -this.field919;
                        } while (--this.field926 != 0);
                    }
                } else if (this.field919 < 0) {
                    if (this.field924 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field924) / var6;
                    if (var7 < this.field926) {
                        this.field924 += var6 * var7;
                        this.field926 -= var7;
                        return;
                    }
                    this.field924 += this.field926 * var6;
                    this.field926 = 0;
                } else {
                    if (this.field924 < var4) {
                        return;
                    }
                    int var8 = (this.field924 - var3) / var6;
                    if (var8 < this.field926) {
                        this.field924 -= var6 * var8;
                        this.field926 -= var8;
                        return;
                    }
                    this.field924 -= this.field926 * var6;
                    this.field926 = 0;
                }
            }
            if (this.field919 < 0) {
                if (this.field924 < 0) {
                    this.field924 = -1;
                    this.method386();
                    this.method441(16773377);
                    return;
                }
            } else if (this.field924 >= var5) {
                this.field924 = var5;
                this.method386();
                this.method441(16773377);
            }
        }
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "()Lj;")
    public final class206 method395() {
        return null;
    }

    @OriginalMember(owner = "client!g", name = "c", descriptor = "()I")
    public final int method396() {
        return this.field928 == 0 && this.field927 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "([IIIII)I")
    private final int method397(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field927 <= 0) {
                if (this.field919 == 256 && (this.field924 & 255) == 0) {
                    if (class225.field3868) {
                        return method367(0, ((class142) super.field3495).field2426, arg0, this.field924, arg1, this.field923, this.field925, 0, arg3, arg2, this);
                    }
                    return method408(((class142) super.field3495).field2426, arg0, this.field924, arg1, this.field922, 0, arg3, arg2, this);
                }
                if (class225.field3868) {
                    return method398(0, 0, ((class142) super.field3495).field2426, arg0, this.field924, arg1, this.field923, this.field925, 0, arg3, arg2, this, this.field919, arg4);
                }
                return method409(0, 0, ((class142) super.field3495).field2426, arg0, this.field924, arg1, this.field922, 0, arg3, arg2, this, this.field919, arg4);
            }
            int var6 = this.field927 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field927 += arg1;
            if (this.field919 == 256 && (this.field924 & 255) == 0) {
                if (class225.field3868) {
                    arg1 = method376(0, ((class142) super.field3495).field2426, arg0, this.field924, arg1, this.field923, this.field925, this.field920, this.field917, 0, var6, arg2, this);
                } else {
                    arg1 = method412(((class142) super.field3495).field2426, arg0, this.field924, arg1, this.field922, this.field921, 0, var6, arg2, this);
                }
            } else if (class225.field3868) {
                arg1 = method401(0, 0, ((class142) super.field3495).field2426, arg0, this.field924, arg1, this.field923, this.field925, this.field920, this.field917, 0, var6, arg2, this, this.field919, arg4);
            } else {
                arg1 = method379(0, 0, ((class142) super.field3495).field2426, arg0, this.field924, arg1, this.field922, this.field921, 0, var6, arg2, this, this.field919, arg4);
            }
            this.field927 -= arg1;
            if (this.field927 != 0) {
                return arg1;
            }
        } while (!this.method389());
        return arg3;
    }

    @OriginalMember(owner = "client!g", name = "c", descriptor = "(II[B[IIIIIIIILg;II)I")
    private static final int method398(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class57 arg11, int arg12, int arg13) {
        int var14;
        if (arg12 == 0 || (var14 = (arg10 - arg4 + arg12 - 257) / arg12 + arg5) > arg9) {
            var14 = arg9;
        }
        int var15 = arg5 << 1;
        int var16 = var14 << 1;
        int var10001;
        while (var15 < var16) {
            int var22 = arg4 >> 8;
            byte var23 = arg2[var22];
            int var24 = (var23 << 8) + (arg4 & 255) * (arg2[var22 + 1] - var23);
            var10001 = var15++;
            arg3[var10001] += arg6 * var24 >> 6;
            int var25 = var15++;
            arg3[var25] += arg7 * var24 >> 6;
            arg4 += arg12;
        }
        int var17;
        if (arg12 == 0 || (var17 = (var15 >> 1) + (arg10 - arg4 + arg12 - 1) / arg12) > arg9) {
            var17 = arg9;
        }
        int var18 = var17 << 1;
        int var19 = arg13;
        while (var15 < var18) {
            byte var20 = arg2[arg4 >> 8];
            int var21 = (var20 << 8) + (arg4 & 255) * (var19 - var20);
            var10001 = var15++;
            arg3[var10001] += arg6 * var21 >> 6;
            var10001 = var15++;
            arg3[var10001] += arg7 * var21 >> 6;
            arg4 += arg12;
        }
        arg11.field924 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!g", name = "d", descriptor = "()I")
    public final int method399() {
        int var1 = this.field922 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field926 == 0) {
            var2 -= this.field924 * var2 / (((class142) super.field3495).field2426.length << 8);
        } else if (this.field926 >= 0) {
            var2 -= this.field915 * var2 / ((class142) super.field3495).field2426.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!g", name = "e", descriptor = "(II)I")
    private static final int method400(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(II[B[IIIIIIIIIILg;II)I")
    private static final int method401(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class57 arg13, int arg14, int arg15) {
        arg13.field922 -= arg13.field921 * arg5;
        int var16;
        if (arg14 == 0 || (var16 = (arg12 - arg4 + arg14 - 257) / arg14 + arg5) > arg11) {
            var16 = arg11;
        }
        int var17 = arg5 << 1;
        int var18 = var16 << 1;
        int var10001;
        while (var17 < var18) {
            int var25 = arg4 >> 8;
            byte var26 = arg2[var25];
            int var27 = (var26 << 8) + (arg4 & 255) * (arg2[var25 + 1] - var26);
            var10001 = var17++;
            arg3[var10001] += arg6 * var27 >> 6;
            arg6 += arg8;
            int var28 = var17++;
            arg3[var28] += arg7 * var27 >> 6;
            arg7 += arg9;
            arg4 += arg14;
        }
        int var19;
        if (arg14 == 0 || (var19 = (var17 >> 1) + (arg12 - arg4 + arg14 - 1) / arg14) > arg11) {
            var19 = arg11;
        }
        int var20 = var19 << 1;
        int var21 = arg15;
        while (var17 < var20) {
            byte var23 = arg2[arg4 >> 8];
            int var24 = (var23 << 8) + (arg4 & 255) * (var21 - var23);
            var10001 = var17++;
            arg3[var10001] += arg6 * var24 >> 6;
            arg6 += arg8;
            var10001 = var17++;
            arg3[var10001] += arg7 * var24 >> 6;
            arg7 += arg9;
            arg4 += arg14;
        }
        int var22 = var17 >> 1;
        arg13.field922 += arg13.field921 * var22;
        arg13.field923 = arg6;
        arg13.field925 = arg7;
        arg13.field924 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Lbk;II)Lg;")
    public static final class57 method402(class142 arg0, int arg1, int arg2) {
        return arg0.field2426 != null && arg0.field2426.length != 0 ? new class57(arg0, (int) ((long) arg0.field2425 * 256L * (long) arg1 / (long) (class215.field3720 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!g", name = "d", descriptor = "(II[B[IIIIIIIILg;II)I")
    private static final int method403(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class57 arg11, int arg12, int arg13) {
        arg11.field923 -= arg11.field920 * arg5;
        arg11.field925 -= arg11.field917 * arg5;
        int var14;
        if (arg12 == 0 || (var14 = (arg10 + 256 - arg4 + arg12) / arg12 + arg5) > arg9) {
            var14 = arg9;
        }
        int var10001;
        while (arg5 < var14) {
            int var18 = arg4 >> 8;
            byte var19 = arg2[var18 - 1];
            var10001 = arg5++;
            arg3[var10001] += ((var19 << 8) + (arg4 & 255) * (arg2[var18] - var19)) * arg6 >> 6;
            arg6 += arg7;
            arg4 += arg12;
        }
        int var15;
        if (arg12 == 0 || (var15 = (arg10 - arg4 + arg12) / arg12 + arg5) > arg9) {
            var15 = arg9;
        }
        int var16 = arg13;
        int var17 = arg12;
        while (arg5 < var15) {
            var10001 = arg5++;
            arg3[var10001] += ((var16 << 8) + (arg4 & 255) * (arg2[arg4 >> 8] - var16)) * arg6 >> 6;
            arg6 += arg7;
            arg4 += var17;
        }
        arg11.field923 += arg11.field920 * arg5;
        arg11.field925 += arg11.field917 * arg5;
        arg11.field922 = arg6;
        arg11.field924 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "([B[IIIIIIILg;)I")
    private static final int method404(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class57 arg8) {
        int var9 = arg2 >> 8;
        int var10 = arg7 >> 8;
        int var11 = arg4 << 2;
        int var12;
        if ((var12 = arg3 + var9 - (var10 - 1)) > arg6) {
            var12 = arg6;
        }
        var12 -= 3;
        int var10001;
        while (arg3 < var12) {
            var10001 = arg3++;
            arg1[var10001] += arg0[var9--] * var11;
            int var13 = arg3++;
            arg1[var13] += arg0[var9--] * var11;
            int var14 = arg3++;
            arg1[var14] += arg0[var9--] * var11;
            int var15 = arg3++;
            arg1[var15] += arg0[var9--] * var11;
        }
        var12 += 3;
        while (arg3 < var12) {
            var10001 = arg3++;
            arg1[var10001] += arg0[var9--] * var11;
        }
        arg8.field924 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!g", name = "g", descriptor = "(I)V")
    private final synchronized void method405(int arg0) {
        this.method387(arg0, this.method384());
    }

    @OriginalMember(owner = "client!g", name = "h", descriptor = "(I)V")
    public final synchronized void method406(int arg0) {
        this.field926 = arg0;
    }

    @OriginalMember(owner = "client!g", name = "i", descriptor = "(I)V")
    public final synchronized void method407(int arg0) {
        if (this.field919 < 0) {
            this.field919 = -arg0;
        } else {
            this.field919 = arg0;
        }
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "([B[IIIIIIILg;)I")
    private static final int method408(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class57 arg8) {
        int var9 = arg2 >> 8;
        int var10 = arg7 >> 8;
        int var11 = arg4 << 2;
        int var12;
        if ((var12 = arg3 + var10 - var9) > arg6) {
            var12 = arg6;
        }
        var12 -= 3;
        int var10001;
        while (arg3 < var12) {
            var10001 = arg3++;
            arg1[var10001] += arg0[var9++] * var11;
            int var13 = arg3++;
            arg1[var13] += arg0[var9++] * var11;
            int var14 = arg3++;
            arg1[var14] += arg0[var9++] * var11;
            int var15 = arg3++;
            arg1[var15] += arg0[var9++] * var11;
        }
        var12 += 3;
        while (arg3 < var12) {
            var10001 = arg3++;
            arg1[var10001] += arg0[var9++] * var11;
        }
        arg8.field924 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(II[B[IIIIIIILg;II)I")
    private static final int method409(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class57 arg10, int arg11, int arg12) {
        int var13;
        if (arg11 == 0 || (var13 = (arg9 - arg4 + arg11 - 257) / arg11 + arg5) > arg8) {
            var13 = arg8;
        }
        int var10001;
        while (arg5 < var13) {
            int var17 = arg4 >> 8;
            byte var18 = arg2[var17];
            var10001 = arg5++;
            arg3[var10001] += ((var18 << 8) + (arg4 & 255) * (arg2[var17 + 1] - var18)) * arg6 >> 6;
            arg4 += arg11;
        }
        int var14;
        if (arg11 == 0 || (var14 = (arg9 - arg4 + arg11 - 1) / arg11 + arg5) > arg8) {
            var14 = arg8;
        }
        int var15 = arg12;
        while (arg5 < var14) {
            byte var16 = arg2[arg4 >> 8];
            var10001 = arg5++;
            arg3[var10001] += ((var16 << 8) + (arg4 & 255) * (var15 - var16)) * arg6 >> 6;
            arg4 += arg11;
        }
        arg10.field924 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Z)V")
    public final synchronized void method410(boolean arg0) {
        this.field919 = (this.field919 >>> 31) + (this.field919 ^ this.field919 >> 31);
        if (arg0) {
            this.field919 = -this.field919;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "()Lj;")
    public final class206 method411() {
        return null;
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "([B[IIIIIIIILg;)I")
    private static final int method412(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class57 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field923 += (var14 - arg3) * arg9.field920;
        arg9.field925 += (var14 - arg3) * arg9.field917;
        var14 -= 3;
        int var10001;
        while (arg3 < var14) {
            var10001 = arg3++;
            arg1[var10001] += arg0[var10++] * var12;
            int var15 = var12 + var13;
            int var18 = arg3++;
            arg1[var18] += arg0[var10++] * var15;
            int var16 = var13 + var15;
            int var19 = arg3++;
            arg1[var19] += arg0[var10++] * var16;
            int var17 = var13 + var16;
            int var20 = arg3++;
            arg1[var20] += arg0[var10++] * var17;
            var12 = var13 + var17;
        }
        var14 += 3;
        while (arg3 < var14) {
            var10001 = arg3++;
            arg1[var10001] += arg0[var10++] * var12;
            var12 += var13;
        }
        arg9.field922 = var12 >> 2;
        arg9.field924 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "(Lbk;II)V")
    private class57(class142 arg0, int arg1, int arg2) {
        super.field3495 = arg0;
        this.field915 = arg0.field2424;
        this.field918 = arg0.field2427;
        this.field929 = arg0.field2428;
        this.field919 = arg1;
        this.field928 = arg2;
        this.field916 = 8192;
        this.field924 = 0;
        this.method371();
    }

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "(Lbk;III)V")
    private class57(class142 arg0, int arg1, int arg2, int arg3) {
        super.field3495 = arg0;
        this.field915 = arg0.field2424;
        this.field918 = arg0.field2427;
        this.field929 = arg0.field2428;
        this.field919 = arg1;
        this.field928 = arg2;
        this.field916 = arg3;
        this.field924 = 0;
        this.method371();
    }
}
