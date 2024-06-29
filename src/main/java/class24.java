import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class24 extends class298 {

    @OriginalMember(owner = "client!we", name = "m", descriptor = "I")
    private int field355;

    @OriginalMember(owner = "client!we", name = "p", descriptor = "I")
    private int field358;

    @OriginalMember(owner = "client!we", name = "o", descriptor = "Z")
    private boolean field357;

    @OriginalMember(owner = "client!we", name = "A", descriptor = "I")
    private int field369;

    @OriginalMember(owner = "client!we", name = "n", descriptor = "I")
    private int field356;

    @OriginalMember(owner = "client!we", name = "x", descriptor = "I")
    private int field366;

    @OriginalMember(owner = "client!we", name = "t", descriptor = "I")
    private int field362;

    @OriginalMember(owner = "client!we", name = "q", descriptor = "I")
    private int field359;

    @OriginalMember(owner = "client!we", name = "r", descriptor = "I")
    private int field360;

    @OriginalMember(owner = "client!we", name = "s", descriptor = "I")
    private int field361;

    @OriginalMember(owner = "client!we", name = "u", descriptor = "I")
    private int field363;

    @OriginalMember(owner = "client!we", name = "v", descriptor = "I")
    private int field364;

    @OriginalMember(owner = "client!we", name = "w", descriptor = "I")
    private int field365;

    @OriginalMember(owner = "client!we", name = "y", descriptor = "I")
    private int field367;

    @OriginalMember(owner = "client!we", name = "z", descriptor = "I")
    private int field368;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(II[B[IIIIIIIILwe;II)I")
    private static final int method165(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class24 arg11, int arg12, int arg13) {
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
        arg11.field362 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!we", name = "e", descriptor = "()Z")
    public final boolean method166() {
        return this.field362 < 0 || this.field362 >= ((class201) super.field4403).field2936.length << 8;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Lhk;III)Lwe;")
    public static final class24 method167(class201 arg0, int arg1, int arg2, int arg3) {
        return arg0.field2936 != null && arg0.field2936.length != 0 ? new class24(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(II[B[IIIIIIIILwe;II)I")
    private static final int method168(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class24 arg11, int arg12, int arg13) {
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
        arg11.field362 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!we", name = "f", descriptor = "()I")
    public final synchronized int method169() {
        return this.field366 < 0 ? -1 : this.field366;
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(II)V")
    public final synchronized void method170(int arg0, int arg1) {
        this.method188(arg0, arg1, this.method169());
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(II[B[IIIIIIILwe;II)I")
    private static final int method171(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class24 arg10, int arg11, int arg12) {
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
        arg10.field362 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(II[B[IIIIIIIIIILwe;II)I")
    private static final int method172(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class24 arg13, int arg14, int arg15) {
        arg13.field360 -= arg13.field368 * arg5;
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
        arg13.field360 += arg13.field368 * var22;
        arg13.field361 = arg6;
        arg13.field367 = arg7;
        arg13.field362 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!we", name = "c", descriptor = "(I)V")
    public final synchronized void method173(int arg0) {
        if (this.field364 > 0) {
            if (arg0 >= this.field364) {
                if (this.field356 == Integer.MIN_VALUE) {
                    this.field356 = 0;
                    this.field360 = this.field361 = this.field367 = 0;
                    this.method251(35);
                    arg0 = this.field364;
                }
                this.field364 = 0;
                this.method204();
            } else {
                this.field360 += this.field368 * arg0;
                this.field361 += this.field359 * arg0;
                this.field367 += this.field363 * arg0;
                this.field364 -= arg0;
            }
        }
        class201 var2 = (class201) super.field4403;
        int var3 = this.field355 << 8;
        int var4 = this.field358 << 8;
        int var5 = var2.field2936.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field365 = 0;
        }
        if (this.field362 < 0) {
            if (this.field369 <= 0) {
                this.method201();
                this.method251(102);
                return;
            }
            this.field362 = 0;
        }
        if (this.field362 >= var5) {
            if (this.field369 >= 0) {
                this.method201();
                this.method251(46);
                return;
            }
            this.field362 = var5 - 1;
        }
        this.field362 += this.field369 * arg0;
        if (this.field365 < 0) {
            if (!this.field357) {
                if (this.field369 < 0) {
                    if (this.field362 < var3) {
                        this.field362 = var4 - 1 - (var4 - 1 - this.field362) % var6;
                    }
                } else if (this.field362 >= var4) {
                    this.field362 = (this.field362 - var3) % var6 + var3;
                }
            } else {
                if (this.field369 < 0) {
                    if (this.field362 >= var3) {
                        return;
                    }
                    this.field362 = var3 + var3 - 1 - this.field362;
                    this.field369 = -this.field369;
                }
                while (this.field362 >= var4) {
                    this.field362 = var4 + var4 - 1 - this.field362;
                    this.field369 = -this.field369;
                    if (this.field362 >= var3) {
                        return;
                    }
                    this.field362 = var3 + var3 - 1 - this.field362;
                    this.field369 = -this.field369;
                }
            }
        } else {
            if (this.field365 > 0) {
                if (this.field357) {
                    label125: {
                        if (this.field369 < 0) {
                            if (this.field362 >= var3) {
                                return;
                            }
                            this.field362 = var3 + var3 - 1 - this.field362;
                            this.field369 = -this.field369;
                            if (--this.field365 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field362 < var4) {
                                return;
                            }
                            this.field362 = var4 + var4 - 1 - this.field362;
                            this.field369 = -this.field369;
                            if (--this.field365 == 0) {
                                break;
                            }
                            if (this.field362 >= var3) {
                                return;
                            }
                            this.field362 = var3 + var3 - 1 - this.field362;
                            this.field369 = -this.field369;
                        } while (--this.field365 != 0);
                    }
                } else if (this.field369 < 0) {
                    if (this.field362 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field362) / var6;
                    if (var7 < this.field365) {
                        this.field362 += var6 * var7;
                        this.field365 -= var7;
                        return;
                    }
                    this.field362 += this.field365 * var6;
                    this.field365 = 0;
                } else {
                    if (this.field362 < var4) {
                        return;
                    }
                    int var8 = (this.field362 - var3) / var6;
                    if (var8 < this.field365) {
                        this.field362 -= var6 * var8;
                        this.field365 -= var8;
                        return;
                    }
                    this.field362 -= this.field365 * var6;
                    this.field365 = 0;
                }
            }
            if (this.field369 < 0) {
                if (this.field362 < 0) {
                    this.field362 = -1;
                    this.method201();
                    this.method251(44);
                    return;
                }
            } else if (this.field362 >= var5) {
                this.field362 = var5;
                this.method201();
                this.method251(70);
            }
        }
    }

    @OriginalMember(owner = "client!we", name = "c", descriptor = "(II)I")
    private static final int method174(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(II[B[IIIIIIILwe;II)I")
    private static final int method175(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class24 arg10, int arg11, int arg12) {
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
        arg10.field362 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(I[B[IIIIIIIIIILwe;)I")
    private static final int method176(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class24 arg12) {
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
        arg12.field360 += (var19 - arg4) * arg12.field368;
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
        arg12.field361 = var15 >> 2;
        arg12.field367 = var16 >> 2;
        arg12.field362 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!we", name = "d", descriptor = "(I)V")
    public final synchronized void method177(int arg0) {
        this.method193(arg0 << 6, this.method169());
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(I[B[IIIIIIIIIILwe;)I")
    private static final int method178(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class24 arg12) {
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
        arg12.field360 += (var19 - arg4) * arg12.field368;
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
        arg12.field361 = var15 >> 2;
        arg12.field367 = var16 >> 2;
        arg12.field362 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!we", name = "g", descriptor = "()Z")
    public final boolean method179() {
        return this.field364 != 0;
    }

    @OriginalMember(owner = "client!we", name = "d", descriptor = "()I")
    public final int method180() {
        int var1 = this.field360 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field365 == 0) {
            var2 -= this.field362 * var2 / (((class201) super.field4403).field2936.length << 8);
        } else if (this.field365 >= 0) {
            var2 -= this.field355 * var2 / ((class201) super.field4403).field2936.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!we", name = "h", descriptor = "()I")
    public final synchronized int method181() {
        return this.field356 == Integer.MIN_VALUE ? 0 : this.field356;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "([IIIII)I")
    private final int method182(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field364 <= 0) {
                if (this.field369 == 256 && (this.field362 & 255) == 0) {
                    if (class122.field1929) {
                        return method209(0, ((class201) super.field4403).field2936, arg0, this.field362, arg1, this.field361, this.field367, 0, arg3, arg2, this);
                    }
                    return method189(((class201) super.field4403).field2936, arg0, this.field362, arg1, this.field360, 0, arg3, arg2, this);
                }
                if (class122.field1929) {
                    return method168(0, 0, ((class201) super.field4403).field2936, arg0, this.field362, arg1, this.field361, this.field367, 0, arg3, arg2, this, this.field369, arg4);
                }
                return method175(0, 0, ((class201) super.field4403).field2936, arg0, this.field362, arg1, this.field360, 0, arg3, arg2, this, this.field369, arg4);
            }
            int var6 = this.field364 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field364 += arg1;
            if (this.field369 == 256 && (this.field362 & 255) == 0) {
                if (class122.field1929) {
                    arg1 = method176(0, ((class201) super.field4403).field2936, arg0, this.field362, arg1, this.field361, this.field367, this.field359, this.field363, 0, var6, arg2, this);
                } else {
                    arg1 = method192(((class201) super.field4403).field2936, arg0, this.field362, arg1, this.field360, this.field368, 0, var6, arg2, this);
                }
            } else if (class122.field1929) {
                arg1 = method172(0, 0, ((class201) super.field4403).field2936, arg0, this.field362, arg1, this.field361, this.field367, this.field359, this.field363, 0, var6, arg2, this, this.field369, arg4);
            } else {
                arg1 = method190(0, 0, ((class201) super.field4403).field2936, arg0, this.field362, arg1, this.field360, this.field368, 0, var6, arg2, this, this.field369, arg4);
            }
            this.field364 -= arg1;
            if (this.field364 != 0) {
                return arg1;
            }
        } while (!this.method197());
        return arg3;
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "()Lwm;")
    public final class298 method183() {
        return null;
    }

    @OriginalMember(owner = "client!we", name = "e", descriptor = "(I)V")
    public final synchronized void method184(int arg0) {
        this.field365 = arg0;
    }

    @OriginalMember(owner = "client!we", name = "c", descriptor = "()I")
    public final int method185() {
        return this.field356 == 0 && this.field364 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!we", name = "c", descriptor = "(II[B[IIIIIIIILwe;II)I")
    private static final int method186(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class24 arg11, int arg12, int arg13) {
        arg11.field361 -= arg11.field359 * arg5;
        arg11.field367 -= arg11.field363 * arg5;
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
        arg11.field361 += arg11.field359 * arg5;
        arg11.field367 += arg11.field363 * arg5;
        arg11.field360 = arg6;
        arg11.field362 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "([III)V")
    public final synchronized void method187(int[] arg0, int arg1, int arg2) {
        if (this.field356 == 0 && this.field364 == 0) {
            this.method173(arg2);
        } else {
            class201 var4 = (class201) super.field4403;
            int var5 = this.field355 << 8;
            int var6 = this.field358 << 8;
            int var7 = var4.field2936.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field365 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field362 < 0) {
                if (this.field369 <= 0) {
                    this.method201();
                    this.method251(11);
                    return;
                }
                this.field362 = 0;
            }
            if (this.field362 >= var7) {
                if (this.field369 >= 0) {
                    this.method201();
                    this.method251(61);
                    return;
                }
                this.field362 = var7 - 1;
            }
            if (this.field365 < 0) {
                if (this.field357) {
                    if (this.field369 < 0) {
                        var9 = this.method199(arg0, arg1, var5, var10, var4.field2936[this.field355]);
                        if (this.field362 >= var5) {
                            return;
                        }
                        this.field362 = var5 + var5 - 1 - this.field362;
                        this.field369 = -this.field369;
                    }
                    while (true) {
                        int var11 = this.method182(arg0, var9, var6, var10, var4.field2936[this.field358 - 1]);
                        if (this.field362 < var6) {
                            return;
                        }
                        this.field362 = var6 + var6 - 1 - this.field362;
                        this.field369 = -this.field369;
                        var9 = this.method199(arg0, var11, var5, var10, var4.field2936[this.field355]);
                        if (this.field362 >= var5) {
                            return;
                        }
                        this.field362 = var5 + var5 - 1 - this.field362;
                        this.field369 = -this.field369;
                    }
                } else if (this.field369 < 0) {
                    while (true) {
                        var9 = this.method199(arg0, var9, var5, var10, var4.field2936[this.field358 - 1]);
                        if (this.field362 >= var5) {
                            return;
                        }
                        this.field362 = var6 - 1 - (var6 - 1 - this.field362) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method182(arg0, var9, var6, var10, var4.field2936[this.field355]);
                        if (this.field362 < var6) {
                            return;
                        }
                        this.field362 = (this.field362 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field365 > 0) {
                    if (this.field357) {
                        label130: {
                            if (this.field369 < 0) {
                                var9 = this.method199(arg0, arg1, var5, var10, var4.field2936[this.field355]);
                                if (this.field362 >= var5) {
                                    return;
                                }
                                this.field362 = var5 + var5 - 1 - this.field362;
                                this.field369 = -this.field369;
                                if (--this.field365 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method182(arg0, var9, var6, var10, var4.field2936[this.field358 - 1]);
                                if (this.field362 < var6) {
                                    return;
                                }
                                this.field362 = var6 + var6 - 1 - this.field362;
                                this.field369 = -this.field369;
                                if (--this.field365 == 0) {
                                    break;
                                }
                                var9 = this.method199(arg0, var9, var5, var10, var4.field2936[this.field355]);
                                if (this.field362 >= var5) {
                                    return;
                                }
                                this.field362 = var5 + var5 - 1 - this.field362;
                                this.field369 = -this.field369;
                            } while (--this.field365 != 0);
                        }
                    } else if (this.field369 < 0) {
                        while (true) {
                            var9 = this.method199(arg0, var9, var5, var10, var4.field2936[this.field358 - 1]);
                            if (this.field362 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field362) / var8;
                            if (var12 >= this.field365) {
                                this.field362 += this.field365 * var8;
                                this.field365 = 0;
                                break;
                            }
                            this.field362 += var8 * var12;
                            this.field365 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method182(arg0, var9, var6, var10, var4.field2936[this.field355]);
                            if (this.field362 < var6) {
                                return;
                            }
                            int var13 = (this.field362 - var5) / var8;
                            if (var13 >= this.field365) {
                                this.field362 -= this.field365 * var8;
                                this.field365 = 0;
                                break;
                            }
                            this.field362 -= var8 * var13;
                            this.field365 -= var13;
                        }
                    }
                }
                if (this.field369 < 0) {
                    this.method199(arg0, var9, 0, var10, 0);
                    if (this.field362 < 0) {
                        this.field362 = -1;
                        this.method201();
                        this.method251(30);
                        return;
                    }
                } else {
                    this.method182(arg0, var9, var7, var10, 0);
                    if (this.field362 >= var7) {
                        this.field362 = var7;
                        this.method201();
                        this.method251(24);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(III)V")
    public final synchronized void method188(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method193(arg1, arg2);
        } else {
            int var4 = method205(arg1, arg2);
            int var5 = method174(arg1, arg2);
            if (this.field361 == var4 && this.field367 == var5) {
                this.field364 = 0;
            } else {
                int var6 = arg1 - this.field360;
                if (this.field360 - arg1 > var6) {
                    var6 = this.field360 - arg1;
                }
                if (var4 - this.field361 > var6) {
                    var6 = var4 - this.field361;
                }
                if (this.field361 - var4 > var6) {
                    var6 = this.field361 - var4;
                }
                if (var5 - this.field367 > var6) {
                    var6 = var5 - this.field367;
                }
                if (this.field367 - var5 > var6) {
                    var6 = this.field367 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field364 = arg0;
                this.field356 = arg1;
                this.field366 = arg2;
                this.field368 = (arg1 - this.field360) / arg0;
                this.field359 = (var4 - this.field361) / arg0;
                this.field363 = (var5 - this.field367) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "([B[IIIIIIILwe;)I")
    private static final int method189(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class24 arg8) {
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
        arg8.field362 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!we", name = "d", descriptor = "(II[B[IIIIIIIILwe;II)I")
    private static final int method190(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class24 arg11, int arg12, int arg13) {
        arg11.field361 -= arg11.field359 * arg5;
        arg11.field367 -= arg11.field363 * arg5;
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
        arg11.field361 += arg11.field359 * arg5;
        arg11.field367 += arg11.field363 * arg5;
        arg11.field360 = arg6;
        arg11.field362 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!we", name = "i", descriptor = "()I")
    public final synchronized int method191() {
        return this.field369 < 0 ? -this.field369 : this.field369;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "([B[IIIIIIIILwe;)I")
    private static final int method192(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class24 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field361 += (var14 - arg3) * arg9.field359;
        arg9.field367 += (var14 - arg3) * arg9.field363;
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
        arg9.field360 = var12 >> 2;
        arg9.field362 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!we", name = "d", descriptor = "(II)V")
    private final synchronized void method193(int arg0, int arg1) {
        this.field356 = arg0;
        this.field366 = arg1;
        this.field364 = 0;
        this.method204();
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Z)V")
    public final synchronized void method194(boolean arg0) {
        this.field369 = (this.field369 >>> 31) + (this.field369 ^ this.field369 >> 31);
        if (arg0) {
            this.field369 = -this.field369;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(I[B[IIIIIIIILwe;)I")
    private static final int method195(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class24 arg10) {
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
        arg10.field362 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!we", name = "f", descriptor = "(I)V")
    public final synchronized void method196(int arg0) {
        if (this.field369 < 0) {
            this.field369 = -arg0;
        } else {
            this.field369 = arg0;
        }
    }

    @OriginalMember(owner = "client!we", name = "j", descriptor = "()Z")
    private final boolean method197() {
        int var1 = this.field356;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method205(var1, this.field366);
            var2 = method174(var1, this.field366);
        }
        if (this.field360 == var1 && this.field361 == var3 && this.field367 == var2) {
            if (this.field356 == Integer.MIN_VALUE) {
                this.field356 = 0;
                this.field360 = this.field361 = this.field367 = 0;
                this.method251(125);
                return true;
            } else {
                this.method204();
                return false;
            }
        } else {
            if (this.field360 < var1) {
                this.field368 = 1;
                this.field364 = var1 - this.field360;
            } else if (this.field360 > var1) {
                this.field368 = -1;
                this.field364 = this.field360 - var1;
            } else {
                this.field368 = 0;
            }
            if (this.field361 < var3) {
                this.field359 = 1;
                if (this.field364 == 0 || this.field364 > var3 - this.field361) {
                    this.field364 = var3 - this.field361;
                }
            } else if (this.field361 > var3) {
                this.field359 = -1;
                if (this.field364 == 0 || this.field364 > this.field361 - var3) {
                    this.field364 = this.field361 - var3;
                }
            } else {
                this.field359 = 0;
            }
            if (this.field367 < var2) {
                this.field363 = 1;
                if (this.field364 == 0 || this.field364 > var2 - this.field367) {
                    this.field364 = var2 - this.field367;
                }
            } else if (this.field367 > var2) {
                this.field363 = -1;
                if (this.field364 == 0 || this.field364 > this.field367 - var2) {
                    this.field364 = this.field367 - var2;
                }
            } else {
                this.field363 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(II[B[IIIIIIIIIILwe;II)I")
    private static final int method198(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class24 arg13, int arg14, int arg15) {
        arg13.field360 -= arg13.field368 * arg5;
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
        arg13.field360 += arg13.field368 * var22;
        arg13.field361 = arg6;
        arg13.field367 = arg7;
        arg13.field362 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "([IIIII)I")
    private final int method199(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field364 <= 0) {
                if (this.field369 == -256 && (this.field362 & 255) == 0) {
                    if (class122.field1929) {
                        return method195(0, ((class201) super.field4403).field2936, arg0, this.field362, arg1, this.field361, this.field367, 0, arg3, arg2, this);
                    }
                    return method200(((class201) super.field4403).field2936, arg0, this.field362, arg1, this.field360, 0, arg3, arg2, this);
                }
                if (class122.field1929) {
                    return method165(0, 0, ((class201) super.field4403).field2936, arg0, this.field362, arg1, this.field361, this.field367, 0, arg3, arg2, this, this.field369, arg4);
                }
                return method171(0, 0, ((class201) super.field4403).field2936, arg0, this.field362, arg1, this.field360, 0, arg3, arg2, this, this.field369, arg4);
            }
            int var6 = this.field364 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field364 += arg1;
            if (this.field369 == -256 && (this.field362 & 255) == 0) {
                if (class122.field1929) {
                    arg1 = method178(0, ((class201) super.field4403).field2936, arg0, this.field362, arg1, this.field361, this.field367, this.field359, this.field363, 0, var6, arg2, this);
                } else {
                    arg1 = method203(((class201) super.field4403).field2936, arg0, this.field362, arg1, this.field360, this.field368, 0, var6, arg2, this);
                }
            } else if (class122.field1929) {
                arg1 = method198(0, 0, ((class201) super.field4403).field2936, arg0, this.field362, arg1, this.field361, this.field367, this.field359, this.field363, 0, var6, arg2, this, this.field369, arg4);
            } else {
                arg1 = method186(0, 0, ((class201) super.field4403).field2936, arg0, this.field362, arg1, this.field360, this.field368, 0, var6, arg2, this, this.field369, arg4);
            }
            this.field364 -= arg1;
            if (this.field364 != 0) {
                return arg1;
            }
        } while (!this.method197());
        return arg3;
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "([B[IIIIIIILwe;)I")
    private static final int method200(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class24 arg8) {
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
        arg8.field362 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!we", name = "k", descriptor = "()V")
    private final void method201() {
        if (this.field364 != 0) {
            if (this.field356 == Integer.MIN_VALUE) {
                this.field356 = 0;
            }
            this.field364 = 0;
            this.method204();
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Lhk;II)Lwe;")
    public static final class24 method202(class201 arg0, int arg1, int arg2) {
        return arg0.field2936 != null && arg0.field2936.length != 0 ? new class24(arg0, (int) ((long) arg0.field2939 * 256L * (long) arg1 / (long) (class326.field4692 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "([B[IIIIIIIILwe;)I")
    private static final int method203(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class24 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field361 += (var14 - arg3) * arg9.field359;
        arg9.field367 += (var14 - arg3) * arg9.field363;
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
        arg9.field360 = var12 >> 2;
        arg9.field362 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!we", name = "l", descriptor = "()V")
    private final void method204() {
        this.field360 = this.field356;
        this.field361 = method205(this.field356, this.field366);
        this.field367 = method174(this.field356, this.field366);
    }

    @OriginalMember(owner = "client!we", name = "e", descriptor = "(II)I")
    private static final int method205(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "()Lwm;")
    public final class298 method206() {
        return null;
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "(Lhk;II)V")
    private class24(class201 arg0, int arg1, int arg2) {
        super.field4403 = arg0;
        this.field355 = arg0.field2935;
        this.field358 = arg0.field2938;
        this.field357 = arg0.field2937;
        this.field369 = arg1;
        this.field356 = arg2;
        this.field366 = 8192;
        this.field362 = 0;
        this.method204();
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "(Lhk;III)V")
    private class24(class201 arg0, int arg1, int arg2, int arg3) {
        super.field4403 = arg0;
        this.field355 = arg0.field2935;
        this.field358 = arg0.field2938;
        this.field357 = arg0.field2937;
        this.field369 = arg1;
        this.field356 = arg2;
        this.field366 = arg3;
        this.field362 = 0;
        this.method204();
    }

    @OriginalMember(owner = "client!we", name = "g", descriptor = "(I)V")
    public final synchronized void method207(int arg0) {
        if (arg0 == 0) {
            this.method210(0);
            this.method251(34);
        } else if (this.field361 == 0 && this.field367 == 0) {
            this.field364 = 0;
            this.field356 = 0;
            this.field360 = 0;
            this.method251(46);
        } else {
            int var2 = -this.field360;
            if (this.field360 > var2) {
                var2 = this.field360;
            }
            if (-this.field361 > var2) {
                var2 = -this.field361;
            }
            if (this.field361 > var2) {
                var2 = this.field361;
            }
            if (-this.field367 > var2) {
                var2 = -this.field367;
            }
            if (this.field367 > var2) {
                var2 = this.field367;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field364 = arg0;
            this.field356 = Integer.MIN_VALUE;
            this.field368 = -this.field360 / arg0;
            this.field359 = -this.field361 / arg0;
            this.field363 = -this.field367 / arg0;
        }
    }

    @OriginalMember(owner = "client!we", name = "h", descriptor = "(I)V")
    public final synchronized void method208(int arg0) {
        int var2 = ((class201) super.field4403).field2936.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field362 = arg0;
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(I[B[IIIIIIIILwe;)I")
    private static final int method209(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class24 arg10) {
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
        arg10.field362 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!we", name = "i", descriptor = "(I)V")
    private final synchronized void method210(int arg0) {
        this.method193(arg0, this.method169());
    }
}
