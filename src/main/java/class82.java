import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class82 extends class12 {

    @OriginalMember(owner = "client!eh", name = "v", descriptor = "I")
    private int field1358;

    @OriginalMember(owner = "client!eh", name = "w", descriptor = "I")
    private int field1359;

    @OriginalMember(owner = "client!eh", name = "H", descriptor = "Z")
    private boolean field1369;

    @OriginalMember(owner = "client!eh", name = "C", descriptor = "I")
    private int field1365;

    @OriginalMember(owner = "client!eh", name = "F", descriptor = "I")
    private int field1368;

    @OriginalMember(owner = "client!eh", name = "E", descriptor = "I")
    private int field1367;

    @OriginalMember(owner = "client!eh", name = "x", descriptor = "I")
    private int field1360;

    @OriginalMember(owner = "client!eh", name = "s", descriptor = "I")
    private int field1355;

    @OriginalMember(owner = "client!eh", name = "t", descriptor = "I")
    private int field1356;

    @OriginalMember(owner = "client!eh", name = "u", descriptor = "I")
    private int field1357;

    @OriginalMember(owner = "client!eh", name = "y", descriptor = "I")
    private int field1361;

    @OriginalMember(owner = "client!eh", name = "z", descriptor = "I")
    private int field1362;

    @OriginalMember(owner = "client!eh", name = "A", descriptor = "I")
    private int field1363;

    @OriginalMember(owner = "client!eh", name = "B", descriptor = "I")
    private int field1364;

    @OriginalMember(owner = "client!eh", name = "D", descriptor = "I")
    private int field1366;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(II[B[IIIIIIIILeh;II)I")
    private static final int method638(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class82 arg11, int arg12, int arg13) {
        arg11.field1364 -= arg11.field1357 * arg5;
        arg11.field1355 -= arg11.field1363 * arg5;
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
        arg11.field1364 += arg11.field1357 * arg5;
        arg11.field1355 += arg11.field1363 * arg5;
        arg11.field1356 = arg6;
        arg11.field1360 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(II)V")
    public final synchronized void method639(int arg0, int arg1) {
        this.method659(arg0, arg1, this.method645());
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "([B[IIIIIIIILeh;)I")
    private static final int method640(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class82 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1364 += (var14 - arg3) * arg9.field1357;
        arg9.field1355 += (var14 - arg3) * arg9.field1363;
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
        arg9.field1356 = var12 >> 2;
        arg9.field1360 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!eh", name = "e", descriptor = "()V")
    private final void method641() {
        if (this.field1362 != 0) {
            if (this.field1368 == Integer.MIN_VALUE) {
                this.field1368 = 0;
            }
            this.field1362 = 0;
            this.method676();
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "([B[IIIIIIILeh;)I")
    private static final int method642(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class82 arg8) {
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
        arg8.field1360 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "([IIIII)I")
    private final int method643(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field1362 <= 0) {
                if (this.field1365 == 256 && (this.field1360 & 255) == 0) {
                    if (class230.field3589) {
                        return method669(0, ((class192) super.field217).field3044, arg0, this.field1360, arg1, this.field1364, this.field1355, 0, arg3, arg2, this);
                    }
                    return method642(((class192) super.field217).field3044, arg0, this.field1360, arg1, this.field1356, 0, arg3, arg2, this);
                }
                if (class230.field3589) {
                    return method648(0, 0, ((class192) super.field217).field3044, arg0, this.field1360, arg1, this.field1364, this.field1355, 0, arg3, arg2, this, this.field1365, arg4);
                }
                return method655(0, 0, ((class192) super.field217).field3044, arg0, this.field1360, arg1, this.field1356, 0, arg3, arg2, this, this.field1365, arg4);
            }
            int var6 = this.field1362 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field1362 += arg1;
            if (this.field1365 == 256 && (this.field1360 & 255) == 0) {
                if (class230.field3589) {
                    arg1 = method666(0, ((class192) super.field217).field3044, arg0, this.field1360, arg1, this.field1364, this.field1355, this.field1357, this.field1363, 0, var6, arg2, this);
                } else {
                    arg1 = method640(((class192) super.field217).field3044, arg0, this.field1360, arg1, this.field1356, this.field1366, 0, var6, arg2, this);
                }
            } else if (class230.field3589) {
                arg1 = method657(0, 0, ((class192) super.field217).field3044, arg0, this.field1360, arg1, this.field1364, this.field1355, this.field1357, this.field1363, 0, var6, arg2, this, this.field1365, arg4);
            } else {
                arg1 = method647(0, 0, ((class192) super.field217).field3044, arg0, this.field1360, arg1, this.field1356, this.field1366, 0, var6, arg2, this, this.field1365, arg4);
            }
            this.field1362 -= arg1;
            if (this.field1362 != 0) {
                return arg1;
            }
        } while (!this.method673());
        return arg3;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "()Lfg;")
    public final class12 method123() {
        return null;
    }

    @OriginalMember(owner = "client!eh", name = "f", descriptor = "()I")
    public final synchronized int method644() {
        return this.field1365 < 0 ? -this.field1365 : this.field1365;
    }

    @OriginalMember(owner = "client!eh", name = "g", descriptor = "()I")
    public final synchronized int method645() {
        return this.field1367 < 0 ? -1 : this.field1367;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(II[B[IIIIIIILeh;II)I")
    private static final int method646(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class82 arg10, int arg11, int arg12) {
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
        arg10.field1360 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(II[B[IIIIIIIILeh;II)I")
    private static final int method647(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class82 arg11, int arg12, int arg13) {
        arg11.field1364 -= arg11.field1357 * arg5;
        arg11.field1355 -= arg11.field1363 * arg5;
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
        arg11.field1364 += arg11.field1357 * arg5;
        arg11.field1355 += arg11.field1363 * arg5;
        arg11.field1356 = arg6;
        arg11.field1360 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "(II[B[IIIIIIIILeh;II)I")
    private static final int method648(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class82 arg11, int arg12, int arg13) {
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
        arg11.field1360 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!eh", name = "h", descriptor = "()Z")
    public final boolean method649() {
        return this.field1362 != 0;
    }

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "()I")
    public final int method129() {
        int var1 = this.field1356 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1361 == 0) {
            var2 -= this.field1360 * var2 / (((class192) super.field217).field3044.length << 8);
        } else if (this.field1361 >= 0) {
            var2 -= this.field1358 * var2 / ((class192) super.field217).field3044.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "(I)V")
    public final synchronized void method650(int arg0) {
        this.method665(arg0 << 6, this.method645());
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "()Lfg;")
    public final class12 method125() {
        return null;
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "([B[IIIIIIIILeh;)I")
    private static final int method651(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class82 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1364 += (var14 - arg3) * arg9.field1357;
        arg9.field1355 += (var14 - arg3) * arg9.field1363;
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
        arg9.field1356 = var12 >> 2;
        arg9.field1360 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(Z)V")
    public final synchronized void method652(boolean arg0) {
        this.field1365 = (this.field1365 >>> 31) + (this.field1365 ^ this.field1365 >> 31);
        if (arg0) {
            this.field1365 = -this.field1365;
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(I[B[IIIIIIIIIILeh;)I")
    private static final int method653(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class82 arg12) {
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
        arg12.field1356 += (var19 - arg4) * arg12.field1366;
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
        arg12.field1364 = var15 >> 2;
        arg12.field1355 = var16 >> 2;
        arg12.field1360 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "([IIIII)I")
    private final int method654(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field1362 <= 0) {
                if (this.field1365 == -256 && (this.field1360 & 255) == 0) {
                    if (class230.field3589) {
                        return method668(0, ((class192) super.field217).field3044, arg0, this.field1360, arg1, this.field1364, this.field1355, 0, arg3, arg2, this);
                    }
                    return method664(((class192) super.field217).field3044, arg0, this.field1360, arg1, this.field1356, 0, arg3, arg2, this);
                }
                if (class230.field3589) {
                    return method674(0, 0, ((class192) super.field217).field3044, arg0, this.field1360, arg1, this.field1364, this.field1355, 0, arg3, arg2, this, this.field1365, arg4);
                }
                return method646(0, 0, ((class192) super.field217).field3044, arg0, this.field1360, arg1, this.field1356, 0, arg3, arg2, this, this.field1365, arg4);
            }
            int var6 = this.field1362 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field1362 += arg1;
            if (this.field1365 == -256 && (this.field1360 & 255) == 0) {
                if (class230.field3589) {
                    arg1 = method653(0, ((class192) super.field217).field3044, arg0, this.field1360, arg1, this.field1364, this.field1355, this.field1357, this.field1363, 0, var6, arg2, this);
                } else {
                    arg1 = method651(((class192) super.field217).field3044, arg0, this.field1360, arg1, this.field1356, this.field1366, 0, var6, arg2, this);
                }
            } else if (class230.field3589) {
                arg1 = method662(0, 0, ((class192) super.field217).field3044, arg0, this.field1360, arg1, this.field1364, this.field1355, this.field1357, this.field1363, 0, var6, arg2, this, this.field1365, arg4);
            } else {
                arg1 = method638(0, 0, ((class192) super.field217).field3044, arg0, this.field1360, arg1, this.field1356, this.field1366, 0, var6, arg2, this, this.field1365, arg4);
            }
            this.field1362 -= arg1;
            if (this.field1362 != 0) {
                return arg1;
            }
        } while (!this.method673());
        return arg3;
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(II[B[IIIIIIILeh;II)I")
    private static final int method655(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class82 arg10, int arg11, int arg12) {
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
        arg10.field1360 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lul;III)Leh;")
    public static final class82 method656(class192 arg0, int arg1, int arg2, int arg3) {
        return arg0.field3044 != null && arg0.field3044.length != 0 ? new class82(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(II[B[IIIIIIIIIILeh;II)I")
    private static final int method657(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class82 arg13, int arg14, int arg15) {
        arg13.field1356 -= arg13.field1366 * arg5;
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
        arg13.field1356 += arg13.field1366 * var22;
        arg13.field1364 = arg6;
        arg13.field1355 = arg7;
        arg13.field1360 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "()I")
    public final int method127() {
        return this.field1368 == 0 && this.field1362 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(II)I")
    private static final int method658(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(III)V")
    public final synchronized void method659(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method665(arg1, arg2);
        } else {
            int var4 = method675(arg1, arg2);
            int var5 = method658(arg1, arg2);
            if (this.field1364 == var4 && this.field1355 == var5) {
                this.field1362 = 0;
            } else {
                int var6 = arg1 - this.field1356;
                if (this.field1356 - arg1 > var6) {
                    var6 = this.field1356 - arg1;
                }
                if (var4 - this.field1364 > var6) {
                    var6 = var4 - this.field1364;
                }
                if (this.field1364 - var4 > var6) {
                    var6 = this.field1364 - var4;
                }
                if (var5 - this.field1355 > var6) {
                    var6 = var5 - this.field1355;
                }
                if (this.field1355 - var5 > var6) {
                    var6 = this.field1355 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field1362 = arg0;
                this.field1368 = arg1;
                this.field1367 = arg2;
                this.field1366 = (arg1 - this.field1356) / arg0;
                this.field1357 = (var4 - this.field1364) / arg0;
                this.field1363 = (var5 - this.field1355) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!eh", name = "e", descriptor = "(I)V")
    private final synchronized void method660(int arg0) {
        this.method665(arg0, this.method645());
    }

    @OriginalMember(owner = "client!eh", name = "f", descriptor = "(I)V")
    public final synchronized void method661(int arg0) {
        if (arg0 == 0) {
            this.method660(0);
            this.method693(-117);
        } else if (this.field1364 == 0 && this.field1355 == 0) {
            this.field1362 = 0;
            this.field1368 = 0;
            this.field1356 = 0;
            this.method693(82);
        } else {
            int var2 = -this.field1356;
            if (this.field1356 > var2) {
                var2 = this.field1356;
            }
            if (-this.field1364 > var2) {
                var2 = -this.field1364;
            }
            if (this.field1364 > var2) {
                var2 = this.field1364;
            }
            if (-this.field1355 > var2) {
                var2 = -this.field1355;
            }
            if (this.field1355 > var2) {
                var2 = this.field1355;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1362 = arg0;
            this.field1368 = Integer.MIN_VALUE;
            this.field1366 = -this.field1356 / arg0;
            this.field1357 = -this.field1364 / arg0;
            this.field1363 = -this.field1355 / arg0;
        }
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(II[B[IIIIIIIIIILeh;II)I")
    private static final int method662(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class82 arg13, int arg14, int arg15) {
        arg13.field1356 -= arg13.field1366 * arg5;
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
        arg13.field1356 += arg13.field1366 * var22;
        arg13.field1364 = arg6;
        arg13.field1355 = arg7;
        arg13.field1360 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "(I)V")
    public final synchronized void method124(int arg0) {
        if (this.field1362 > 0) {
            if (arg0 >= this.field1362) {
                if (this.field1368 == Integer.MIN_VALUE) {
                    this.field1368 = 0;
                    this.field1356 = this.field1364 = this.field1355 = 0;
                    this.method693(111);
                    arg0 = this.field1362;
                }
                this.field1362 = 0;
                this.method676();
            } else {
                this.field1356 += this.field1366 * arg0;
                this.field1364 += this.field1357 * arg0;
                this.field1355 += this.field1363 * arg0;
                this.field1362 -= arg0;
            }
        }
        class192 var2 = (class192) super.field217;
        int var3 = this.field1358 << 8;
        int var4 = this.field1359 << 8;
        int var5 = var2.field3044.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1361 = 0;
        }
        if (this.field1360 < 0) {
            if (this.field1365 <= 0) {
                this.method641();
                this.method693(-98);
                return;
            }
            this.field1360 = 0;
        }
        if (this.field1360 >= var5) {
            if (this.field1365 >= 0) {
                this.method641();
                this.method693(73);
                return;
            }
            this.field1360 = var5 - 1;
        }
        this.field1360 += this.field1365 * arg0;
        if (this.field1361 < 0) {
            if (!this.field1369) {
                if (this.field1365 < 0) {
                    if (this.field1360 < var3) {
                        this.field1360 = var4 - 1 - (var4 - 1 - this.field1360) % var6;
                    }
                } else if (this.field1360 >= var4) {
                    this.field1360 = (this.field1360 - var3) % var6 + var3;
                }
            } else {
                if (this.field1365 < 0) {
                    if (this.field1360 >= var3) {
                        return;
                    }
                    this.field1360 = var3 + var3 - 1 - this.field1360;
                    this.field1365 = -this.field1365;
                }
                while (this.field1360 >= var4) {
                    this.field1360 = var4 + var4 - 1 - this.field1360;
                    this.field1365 = -this.field1365;
                    if (this.field1360 >= var3) {
                        return;
                    }
                    this.field1360 = var3 + var3 - 1 - this.field1360;
                    this.field1365 = -this.field1365;
                }
            }
        } else {
            if (this.field1361 > 0) {
                if (this.field1369) {
                    label125: {
                        if (this.field1365 < 0) {
                            if (this.field1360 >= var3) {
                                return;
                            }
                            this.field1360 = var3 + var3 - 1 - this.field1360;
                            this.field1365 = -this.field1365;
                            if (--this.field1361 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field1360 < var4) {
                                return;
                            }
                            this.field1360 = var4 + var4 - 1 - this.field1360;
                            this.field1365 = -this.field1365;
                            if (--this.field1361 == 0) {
                                break;
                            }
                            if (this.field1360 >= var3) {
                                return;
                            }
                            this.field1360 = var3 + var3 - 1 - this.field1360;
                            this.field1365 = -this.field1365;
                        } while (--this.field1361 != 0);
                    }
                } else if (this.field1365 < 0) {
                    if (this.field1360 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field1360) / var6;
                    if (var7 < this.field1361) {
                        this.field1360 += var6 * var7;
                        this.field1361 -= var7;
                        return;
                    }
                    this.field1360 += this.field1361 * var6;
                    this.field1361 = 0;
                } else {
                    if (this.field1360 < var4) {
                        return;
                    }
                    int var8 = (this.field1360 - var3) / var6;
                    if (var8 < this.field1361) {
                        this.field1360 -= var6 * var8;
                        this.field1361 -= var8;
                        return;
                    }
                    this.field1360 -= this.field1361 * var6;
                    this.field1361 = 0;
                }
            }
            if (this.field1365 < 0) {
                if (this.field1360 < 0) {
                    this.field1360 = -1;
                    this.method641();
                    this.method693(-74);
                    return;
                }
            } else if (this.field1360 >= var5) {
                this.field1360 = var5;
                this.method641();
                this.method693(-78);
            }
        }
    }

    @OriginalMember(owner = "client!eh", name = "i", descriptor = "()I")
    public final synchronized int method663() {
        return this.field1368 == Integer.MIN_VALUE ? 0 : this.field1368;
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "([B[IIIIIIILeh;)I")
    private static final int method664(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class82 arg8) {
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
        arg8.field1360 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "([III)V")
    public final synchronized void method126(int[] arg0, int arg1, int arg2) {
        if (this.field1368 == 0 && this.field1362 == 0) {
            this.method124(arg2);
        } else {
            class192 var4 = (class192) super.field217;
            int var5 = this.field1358 << 8;
            int var6 = this.field1359 << 8;
            int var7 = var4.field3044.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field1361 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field1360 < 0) {
                if (this.field1365 <= 0) {
                    this.method641();
                    this.method693(80);
                    return;
                }
                this.field1360 = 0;
            }
            if (this.field1360 >= var7) {
                if (this.field1365 >= 0) {
                    this.method641();
                    this.method693(-78);
                    return;
                }
                this.field1360 = var7 - 1;
            }
            if (this.field1361 < 0) {
                if (this.field1369) {
                    if (this.field1365 < 0) {
                        var9 = this.method654(arg0, arg1, var5, var10, var4.field3044[this.field1358]);
                        if (this.field1360 >= var5) {
                            return;
                        }
                        this.field1360 = var5 + var5 - 1 - this.field1360;
                        this.field1365 = -this.field1365;
                    }
                    while (true) {
                        int var11 = this.method643(arg0, var9, var6, var10, var4.field3044[this.field1359 - 1]);
                        if (this.field1360 < var6) {
                            return;
                        }
                        this.field1360 = var6 + var6 - 1 - this.field1360;
                        this.field1365 = -this.field1365;
                        var9 = this.method654(arg0, var11, var5, var10, var4.field3044[this.field1358]);
                        if (this.field1360 >= var5) {
                            return;
                        }
                        this.field1360 = var5 + var5 - 1 - this.field1360;
                        this.field1365 = -this.field1365;
                    }
                } else if (this.field1365 < 0) {
                    while (true) {
                        var9 = this.method654(arg0, var9, var5, var10, var4.field3044[this.field1359 - 1]);
                        if (this.field1360 >= var5) {
                            return;
                        }
                        this.field1360 = var6 - 1 - (var6 - 1 - this.field1360) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method643(arg0, var9, var6, var10, var4.field3044[this.field1358]);
                        if (this.field1360 < var6) {
                            return;
                        }
                        this.field1360 = (this.field1360 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field1361 > 0) {
                    if (this.field1369) {
                        label130: {
                            if (this.field1365 < 0) {
                                var9 = this.method654(arg0, arg1, var5, var10, var4.field3044[this.field1358]);
                                if (this.field1360 >= var5) {
                                    return;
                                }
                                this.field1360 = var5 + var5 - 1 - this.field1360;
                                this.field1365 = -this.field1365;
                                if (--this.field1361 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method643(arg0, var9, var6, var10, var4.field3044[this.field1359 - 1]);
                                if (this.field1360 < var6) {
                                    return;
                                }
                                this.field1360 = var6 + var6 - 1 - this.field1360;
                                this.field1365 = -this.field1365;
                                if (--this.field1361 == 0) {
                                    break;
                                }
                                var9 = this.method654(arg0, var9, var5, var10, var4.field3044[this.field1358]);
                                if (this.field1360 >= var5) {
                                    return;
                                }
                                this.field1360 = var5 + var5 - 1 - this.field1360;
                                this.field1365 = -this.field1365;
                            } while (--this.field1361 != 0);
                        }
                    } else if (this.field1365 < 0) {
                        while (true) {
                            var9 = this.method654(arg0, var9, var5, var10, var4.field3044[this.field1359 - 1]);
                            if (this.field1360 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field1360) / var8;
                            if (var12 >= this.field1361) {
                                this.field1360 += this.field1361 * var8;
                                this.field1361 = 0;
                                break;
                            }
                            this.field1360 += var8 * var12;
                            this.field1361 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method643(arg0, var9, var6, var10, var4.field3044[this.field1358]);
                            if (this.field1360 < var6) {
                                return;
                            }
                            int var13 = (this.field1360 - var5) / var8;
                            if (var13 >= this.field1361) {
                                this.field1360 -= this.field1361 * var8;
                                this.field1361 = 0;
                                break;
                            }
                            this.field1360 -= var8 * var13;
                            this.field1361 -= var13;
                        }
                    }
                }
                if (this.field1365 < 0) {
                    this.method654(arg0, var9, 0, var10, 0);
                    if (this.field1360 < 0) {
                        this.field1360 = -1;
                        this.method641();
                        this.method693(80);
                        return;
                    }
                } else {
                    this.method643(arg0, var9, var7, var10, 0);
                    if (this.field1360 >= var7) {
                        this.field1360 = var7;
                        this.method641();
                        this.method693(-104);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "(II)V")
    private final synchronized void method665(int arg0, int arg1) {
        this.field1368 = arg0;
        this.field1367 = arg1;
        this.field1362 = 0;
        this.method676();
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(I[B[IIIIIIIIIILeh;)I")
    private static final int method666(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class82 arg12) {
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
        arg12.field1356 += (var19 - arg4) * arg12.field1366;
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
        arg12.field1364 = var15 >> 2;
        arg12.field1355 = var16 >> 2;
        arg12.field1360 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!eh", name = "g", descriptor = "(I)V")
    public final synchronized void method667(int arg0) {
        this.field1361 = arg0;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(I[B[IIIIIIIILeh;)I")
    private static final int method668(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class82 arg10) {
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
        arg10.field1360 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(I[B[IIIIIIIILeh;)I")
    private static final int method669(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class82 arg10) {
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
        arg10.field1360 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!eh", name = "j", descriptor = "()Z")
    public final boolean method670() {
        return this.field1360 < 0 || this.field1360 >= ((class192) super.field217).field3044.length << 8;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lul;II)Leh;")
    public static final class82 method671(class192 arg0, int arg1, int arg2) {
        return arg0.field3044 != null && arg0.field3044.length != 0 ? new class82(arg0, (int) ((long) arg0.field3047 * 256L * (long) arg1 / (long) (class234.field3622 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!eh", name = "h", descriptor = "(I)V")
    public final synchronized void method672(int arg0) {
        if (this.field1365 < 0) {
            this.field1365 = -arg0;
        } else {
            this.field1365 = arg0;
        }
    }

    @OriginalMember(owner = "client!eh", name = "k", descriptor = "()Z")
    private final boolean method673() {
        int var1 = this.field1368;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method675(var1, this.field1367);
            var2 = method658(var1, this.field1367);
        }
        if (this.field1356 == var1 && this.field1364 == var3 && this.field1355 == var2) {
            if (this.field1368 == Integer.MIN_VALUE) {
                this.field1368 = 0;
                this.field1356 = this.field1364 = this.field1355 = 0;
                this.method693(81);
                return true;
            } else {
                this.method676();
                return false;
            }
        } else {
            if (this.field1356 < var1) {
                this.field1366 = 1;
                this.field1362 = var1 - this.field1356;
            } else if (this.field1356 > var1) {
                this.field1366 = -1;
                this.field1362 = this.field1356 - var1;
            } else {
                this.field1366 = 0;
            }
            if (this.field1364 < var3) {
                this.field1357 = 1;
                if (this.field1362 == 0 || this.field1362 > var3 - this.field1364) {
                    this.field1362 = var3 - this.field1364;
                }
            } else if (this.field1364 > var3) {
                this.field1357 = -1;
                if (this.field1362 == 0 || this.field1362 > this.field1364 - var3) {
                    this.field1362 = this.field1364 - var3;
                }
            } else {
                this.field1357 = 0;
            }
            if (this.field1355 < var2) {
                this.field1363 = 1;
                if (this.field1362 == 0 || this.field1362 > var2 - this.field1355) {
                    this.field1362 = var2 - this.field1355;
                }
            } else if (this.field1355 > var2) {
                this.field1363 = -1;
                if (this.field1362 == 0 || this.field1362 > this.field1355 - var2) {
                    this.field1362 = this.field1355 - var2;
                }
            } else {
                this.field1363 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "(II[B[IIIIIIIILeh;II)I")
    private static final int method674(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class82 arg11, int arg12, int arg13) {
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
        arg11.field1360 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "(II)I")
    private static final int method675(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!eh", name = "l", descriptor = "()V")
    private final void method676() {
        this.field1356 = this.field1368;
        this.field1364 = method675(this.field1368, this.field1367);
        this.field1355 = method658(this.field1368, this.field1367);
    }

    @OriginalMember(owner = "client!eh", name = "i", descriptor = "(I)V")
    public final synchronized void method677(int arg0) {
        int var2 = ((class192) super.field217).field3044.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1360 = arg0;
    }

    @OriginalMember(owner = "client!eh", name = "<init>", descriptor = "(Lul;II)V")
    private class82(class192 arg0, int arg1, int arg2) {
        super.field217 = arg0;
        this.field1358 = arg0.field3045;
        this.field1359 = arg0.field3046;
        this.field1369 = arg0.field3048;
        this.field1365 = arg1;
        this.field1368 = arg2;
        this.field1367 = 8192;
        this.field1360 = 0;
        this.method676();
    }

    @OriginalMember(owner = "client!eh", name = "<init>", descriptor = "(Lul;III)V")
    private class82(class192 arg0, int arg1, int arg2, int arg3) {
        super.field217 = arg0;
        this.field1358 = arg0.field3045;
        this.field1359 = arg0.field3046;
        this.field1369 = arg0.field3048;
        this.field1365 = arg1;
        this.field1368 = arg2;
        this.field1367 = arg3;
        this.field1360 = 0;
        this.method676();
    }
}
