import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class591 extends class306 {

    @OriginalMember(owner = "client!ia", name = "x", descriptor = "I")
    private int field8387;

    @OriginalMember(owner = "client!ia", name = "w", descriptor = "I")
    private int field8386;

    @OriginalMember(owner = "client!ia", name = "B", descriptor = "Z")
    private boolean field8391;

    @OriginalMember(owner = "client!ia", name = "r", descriptor = "I")
    private int field8381;

    @OriginalMember(owner = "client!ia", name = "E", descriptor = "I")
    private int field8394;

    @OriginalMember(owner = "client!ia", name = "u", descriptor = "I")
    private int field8384;

    @OriginalMember(owner = "client!ia", name = "v", descriptor = "I")
    private int field8385;

    @OriginalMember(owner = "client!ia", name = "q", descriptor = "I")
    private int field8380;

    @OriginalMember(owner = "client!ia", name = "s", descriptor = "I")
    private int field8382;

    @OriginalMember(owner = "client!ia", name = "t", descriptor = "I")
    private int field8383;

    @OriginalMember(owner = "client!ia", name = "y", descriptor = "I")
    private int field8388;

    @OriginalMember(owner = "client!ia", name = "z", descriptor = "I")
    private int field8389;

    @OriginalMember(owner = "client!ia", name = "A", descriptor = "I")
    private int field8390;

    @OriginalMember(owner = "client!ia", name = "C", descriptor = "I")
    private int field8392;

    @OriginalMember(owner = "client!ia", name = "D", descriptor = "I")
    private int field8393;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(I[B[IIIIIIIILia;)I", line = 6)
    private static final int method3419(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class591 arg10) {
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
        arg10.field8385 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(II[B[IIIIIIILia;II)I", line = 44)
    private static final int method3420(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class591 arg10, int arg11, int arg12) {
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
        arg10.field8385 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "([IIIII)I", line = 70)
    private final int method3421(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field8383 <= 0) {
                if (this.field8381 == -256 && (this.field8385 & 255) == 0) {
                    if (class266.field3798) {
                        return method3419(0, ((class125) super.field4328).field1678, arg0, this.field8385, arg1, this.field8393, this.field8392, 0, arg3, arg2, this);
                    }
                    return method3450(((class125) super.field4328).field1678, arg0, this.field8385, arg1, this.field8382, 0, arg3, arg2, this);
                }
                if (class266.field3798) {
                    return method3451(0, 0, ((class125) super.field4328).field1678, arg0, this.field8385, arg1, this.field8393, this.field8392, 0, arg3, arg2, this, this.field8381, arg4);
                }
                return method3420(0, 0, ((class125) super.field4328).field1678, arg0, this.field8385, arg1, this.field8382, 0, arg3, arg2, this, this.field8381, arg4);
            }
            int var6 = this.field8383 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field8383 += arg1;
            if (this.field8381 == -256 && (this.field8385 & 255) == 0) {
                if (class266.field3798) {
                    arg1 = method3430(0, ((class125) super.field4328).field1678, arg0, this.field8385, arg1, this.field8393, this.field8392, this.field8388, this.field8380, 0, var6, arg2, this);
                } else {
                    arg1 = method3437(((class125) super.field4328).field1678, arg0, this.field8385, arg1, this.field8382, this.field8389, 0, var6, arg2, this);
                }
            } else if (class266.field3798) {
                arg1 = method3440(0, 0, ((class125) super.field4328).field1678, arg0, this.field8385, arg1, this.field8393, this.field8392, this.field8388, this.field8380, 0, var6, arg2, this, this.field8381, arg4);
            } else {
                arg1 = method3441(0, 0, ((class125) super.field4328).field1678, arg0, this.field8385, arg1, this.field8382, this.field8389, 0, var6, arg2, this, this.field8381, arg4);
            }
            this.field8383 -= arg1;
            if (this.field8383 != 0) {
                return arg1;
            }
        } while (!this.method3425());
        return arg3;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(II[B[IIIIIIIIIILia;II)I", line = 126)
    private static final int method3422(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class591 arg13, int arg14, int arg15) {
        arg13.field8382 -= arg13.field8389 * arg5;
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
        arg13.field8382 += arg13.field8389 * var22;
        arg13.field8393 = arg6;
        arg13.field8392 = arg7;
        arg13.field8385 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "()V", line = 168)
    private final void method3423() {
        this.field8382 = this.field8394;
        this.field8393 = method3438(this.field8394, this.field8384);
        this.field8392 = method3442(this.field8394, this.field8384);
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(I[B[IIIIIIIILia;)I", line = 175)
    private static final int method3424(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class591 arg10) {
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
        arg10.field8385 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "()I", line = 213)
    public final int method1497() {
        return this.field8394 == 0 && this.field8383 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "()Z", line = 220)
    private final boolean method3425() {
        int var1 = this.field8394;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method3438(var1, this.field8384);
            var2 = method3442(var1, this.field8384);
        }
        if (this.field8382 == var1 && this.field8393 == var3 && this.field8392 == var2) {
            if (this.field8394 == Integer.MIN_VALUE) {
                this.field8394 = 0;
                this.field8382 = this.field8393 = this.field8392 = 0;
                this.method1304((byte) 7);
                return true;
            } else {
                this.method3423();
                return false;
            }
        } else {
            if (this.field8382 < var1) {
                this.field8389 = 1;
                this.field8383 = var1 - this.field8382;
            } else if (this.field8382 > var1) {
                this.field8389 = -1;
                this.field8383 = this.field8382 - var1;
            } else {
                this.field8389 = 0;
            }
            if (this.field8393 < var3) {
                this.field8388 = 1;
                if (this.field8383 == 0 || this.field8383 > var3 - this.field8393) {
                    this.field8383 = var3 - this.field8393;
                }
            } else if (this.field8393 > var3) {
                this.field8388 = -1;
                if (this.field8383 == 0 || this.field8383 > this.field8393 - var3) {
                    this.field8383 = this.field8393 - var3;
                }
            } else {
                this.field8388 = 0;
            }
            if (this.field8392 < var2) {
                this.field8380 = 1;
                if (this.field8383 == 0 || this.field8383 > var2 - this.field8392) {
                    this.field8383 = var2 - this.field8392;
                }
            } else if (this.field8392 > var2) {
                this.field8380 = -1;
                if (this.field8383 == 0 || this.field8383 > this.field8392 - var2) {
                    this.field8383 = this.field8392 - var2;
                }
            } else {
                this.field8380 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "([B[IIIIIIIILia;)I", line = 305)
    private static final int method3426(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class591 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field8393 += (var14 - arg3) * arg9.field8388;
        arg9.field8392 += (var14 - arg3) * arg9.field8380;
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
        arg9.field8382 = var12 >> 2;
        arg9.field8385 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(II[B[IIIIIIIILia;II)I", line = 339)
    private static final int method3427(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class591 arg11, int arg12, int arg13) {
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
        arg11.field8385 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(I)V", line = 373)
    public final synchronized void method3428(int arg0) {
        int var2 = ((class125) super.field4328).field1678.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field8385 = arg0;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Z)V", line = 385)
    public final synchronized void method3429(boolean arg0) {
        this.field8381 = (this.field8381 >>> 31) + (this.field8381 ^ this.field8381 >> 31);
        if (arg0) {
            this.field8381 = -this.field8381;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(I[B[IIIIIIIIIILia;)I", line = 391)
    private static final int method3430(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class591 arg12) {
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
        arg12.field8382 += (var19 - arg4) * arg12.field8389;
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
        arg12.field8393 = var15 >> 2;
        arg12.field8392 = var16 >> 2;
        arg12.field8385 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "(I)V", line = 444)
    private final synchronized void method3431(int arg0) {
        this.method3454(arg0, this.method3432());
    }

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "()I", line = 447)
    public final synchronized int method3432() {
        return this.field8384 < 0 ? -1 : this.field8384;
    }

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "(I)V", line = 451)
    public final synchronized void method3433(int arg0) {
        this.field8390 = arg0;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(II)V", line = 455)
    public final synchronized void method3434(int arg0, int arg1) {
        this.method3436(arg0, arg1, this.method3432());
    }

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "(I)V", line = 458)
    public final synchronized void method3435(int arg0) {
        this.method3454(this.method3443(), arg0);
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(III)V", line = 461)
    public final synchronized void method3436(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method3454(arg1, arg2);
        } else {
            int var4 = method3438(arg1, arg2);
            int var5 = method3442(arg1, arg2);
            if (this.field8393 == var4 && this.field8392 == var5) {
                this.field8383 = 0;
            } else {
                int var6 = arg1 - this.field8382;
                if (this.field8382 - arg1 > var6) {
                    var6 = this.field8382 - arg1;
                }
                if (var4 - this.field8393 > var6) {
                    var6 = var4 - this.field8393;
                }
                if (this.field8393 - var4 > var6) {
                    var6 = this.field8393 - var4;
                }
                if (var5 - this.field8392 > var6) {
                    var6 = var5 - this.field8392;
                }
                if (this.field8392 - var5 > var6) {
                    var6 = this.field8392 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field8383 = arg0;
                this.field8394 = arg1;
                this.field8384 = arg2;
                this.field8389 = (arg1 - this.field8382) / arg0;
                this.field8388 = (var4 - this.field8393) / arg0;
                this.field8380 = (var5 - this.field8392) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "([B[IIIIIIIILia;)I", line = 511)
    private static final int method3437(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class591 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field8393 += (var14 - arg3) * arg9.field8388;
        arg9.field8392 += (var14 - arg3) * arg9.field8380;
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
        arg9.field8382 = var12 >> 2;
        arg9.field8385 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)V", line = 547)
    public final synchronized void method1482(int arg0) {
        if (this.field8383 > 0) {
            if (arg0 >= this.field8383) {
                if (this.field8394 == Integer.MIN_VALUE) {
                    this.field8394 = 0;
                    this.field8382 = this.field8393 = this.field8392 = 0;
                    this.method1304((byte) 7);
                    arg0 = this.field8383;
                }
                this.field8383 = 0;
                this.method3423();
            } else {
                this.field8382 += this.field8389 * arg0;
                this.field8393 += this.field8388 * arg0;
                this.field8392 += this.field8380 * arg0;
                this.field8383 -= arg0;
            }
        }
        class125 var2 = (class125) super.field4328;
        int var3 = this.field8387 << 8;
        int var4 = this.field8386 << 8;
        int var5 = var2.field1678.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field8390 = 0;
        }
        if (this.field8385 < 0) {
            if (this.field8381 <= 0) {
                this.method3453();
                this.method1304((byte) 7);
                return;
            }
            this.field8385 = 0;
        }
        if (this.field8385 >= var5) {
            if (this.field8381 >= 0) {
                this.method3453();
                this.method1304((byte) 7);
                return;
            }
            this.field8385 = var5 - 1;
        }
        this.field8385 += this.field8381 * arg0;
        if (this.field8390 < 0) {
            if (!this.field8391) {
                if (this.field8381 < 0) {
                    if (this.field8385 < var3) {
                        this.field8385 = var4 - 1 - (var4 - 1 - this.field8385) % var6;
                    }
                } else if (this.field8385 >= var4) {
                    this.field8385 = (this.field8385 - var3) % var6 + var3;
                }
            } else {
                if (this.field8381 < 0) {
                    if (this.field8385 >= var3) {
                        return;
                    }
                    this.field8385 = var3 + var3 - 1 - this.field8385;
                    this.field8381 = -this.field8381;
                }
                while (this.field8385 >= var4) {
                    this.field8385 = var4 + var4 - 1 - this.field8385;
                    this.field8381 = -this.field8381;
                    if (this.field8385 >= var3) {
                        return;
                    }
                    this.field8385 = var3 + var3 - 1 - this.field8385;
                    this.field8381 = -this.field8381;
                }
            }
        } else {
            if (this.field8390 > 0) {
                if (this.field8391) {
                    label125: {
                        if (this.field8381 < 0) {
                            if (this.field8385 >= var3) {
                                return;
                            }
                            this.field8385 = var3 + var3 - 1 - this.field8385;
                            this.field8381 = -this.field8381;
                            if (--this.field8390 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field8385 < var4) {
                                return;
                            }
                            this.field8385 = var4 + var4 - 1 - this.field8385;
                            this.field8381 = -this.field8381;
                            if (--this.field8390 == 0) {
                                break;
                            }
                            if (this.field8385 >= var3) {
                                return;
                            }
                            this.field8385 = var3 + var3 - 1 - this.field8385;
                            this.field8381 = -this.field8381;
                        } while (--this.field8390 != 0);
                    }
                } else if (this.field8381 < 0) {
                    if (this.field8385 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field8385) / var6;
                    if (var7 < this.field8390) {
                        this.field8385 += var6 * var7;
                        this.field8390 -= var7;
                        return;
                    }
                    this.field8385 += this.field8390 * var6;
                    this.field8390 = 0;
                } else {
                    if (this.field8385 < var4) {
                        return;
                    }
                    int var8 = (this.field8385 - var3) / var6;
                    if (var8 < this.field8390) {
                        this.field8385 -= var6 * var8;
                        this.field8390 -= var8;
                        return;
                    }
                    this.field8385 -= this.field8390 * var6;
                    this.field8390 = 0;
                }
            }
            if (this.field8381 < 0) {
                if (this.field8385 < 0) {
                    this.field8385 = -1;
                    this.method3453();
                    this.method1304((byte) 7);
                    return;
                }
            } else if (this.field8385 >= var5) {
                this.field8385 = var5;
                this.method3453();
                this.method1304((byte) 7);
            }
        }
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "()I", line = 766)
    public final int method1933() {
        int var1 = this.field8382 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field8390 == 0) {
            var2 -= this.field8385 * var2 / (((class125) super.field4328).field1678.length << 8);
        } else if (this.field8390 >= 0) {
            var2 -= this.field8387 * var2 / ((class125) super.field4328).field1678.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(II)I", line = 779)
    private static final int method3438(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(I[B[IIIIIIIIIILia;)I", line = 783)
    private static final int method3439(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class591 arg12) {
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
        arg12.field8382 += (var19 - arg4) * arg12.field8389;
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
        arg12.field8393 = var15 >> 2;
        arg12.field8392 = var16 >> 2;
        arg12.field8385 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "()Lca;", line = 836)
    public final class306 method1485() {
        return null;
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(II[B[IIIIIIIIIILia;II)I", line = 842)
    private static final int method3440(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class591 arg13, int arg14, int arg15) {
        arg13.field8382 -= arg13.field8389 * arg5;
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
        arg13.field8382 += arg13.field8389 * var22;
        arg13.field8393 = arg6;
        arg13.field8392 = arg7;
        arg13.field8385 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(II[B[IIIIIIIILia;II)I", line = 884)
    private static final int method3441(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class591 arg11, int arg12, int arg13) {
        arg11.field8393 -= arg11.field8388 * arg5;
        arg11.field8392 -= arg11.field8380 * arg5;
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
        arg11.field8393 += arg11.field8388 * arg5;
        arg11.field8392 += arg11.field8380 * arg5;
        arg11.field8382 = arg6;
        arg11.field8385 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "(II)I", line = 918)
    private static final int method3442(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!ia", name = "h", descriptor = "()I", line = 923)
    public final synchronized int method3443() {
        return this.field8394 == Integer.MIN_VALUE ? 0 : this.field8394;
    }

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "(II[B[IIIIIIIILia;II)I", line = 926)
    private static final int method3444(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class591 arg11, int arg12, int arg13) {
        arg11.field8393 -= arg11.field8388 * arg5;
        arg11.field8392 -= arg11.field8380 * arg5;
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
        arg11.field8393 += arg11.field8388 * arg5;
        arg11.field8392 += arg11.field8380 * arg5;
        arg11.field8382 = arg6;
        arg11.field8385 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "([III)V", line = 961)
    public final synchronized void method1491(int[] arg0, int arg1, int arg2) {
        if (this.field8394 == 0 && this.field8383 == 0) {
            this.method1482(arg2);
        } else {
            class125 var4 = (class125) super.field4328;
            int var5 = this.field8387 << 8;
            int var6 = this.field8386 << 8;
            int var7 = var4.field1678.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field8390 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field8385 < 0) {
                if (this.field8381 <= 0) {
                    this.method3453();
                    this.method1304((byte) 7);
                    return;
                }
                this.field8385 = 0;
            }
            if (this.field8385 >= var7) {
                if (this.field8381 >= 0) {
                    this.method3453();
                    this.method1304((byte) 7);
                    return;
                }
                this.field8385 = var7 - 1;
            }
            if (this.field8390 < 0) {
                if (this.field8391) {
                    if (this.field8381 < 0) {
                        var9 = this.method3421(arg0, arg1, var5, var10, var4.field1678[this.field8387]);
                        if (this.field8385 >= var5) {
                            return;
                        }
                        this.field8385 = var5 + var5 - 1 - this.field8385;
                        this.field8381 = -this.field8381;
                    }
                    while (true) {
                        int var11 = this.method3449(arg0, var9, var6, var10, var4.field1678[this.field8386 - 1]);
                        if (this.field8385 < var6) {
                            return;
                        }
                        this.field8385 = var6 + var6 - 1 - this.field8385;
                        this.field8381 = -this.field8381;
                        var9 = this.method3421(arg0, var11, var5, var10, var4.field1678[this.field8387]);
                        if (this.field8385 >= var5) {
                            return;
                        }
                        this.field8385 = var5 + var5 - 1 - this.field8385;
                        this.field8381 = -this.field8381;
                    }
                } else if (this.field8381 < 0) {
                    while (true) {
                        var9 = this.method3421(arg0, var9, var5, var10, var4.field1678[this.field8386 - 1]);
                        if (this.field8385 >= var5) {
                            return;
                        }
                        this.field8385 = var6 - 1 - (var6 - 1 - this.field8385) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method3449(arg0, var9, var6, var10, var4.field1678[this.field8387]);
                        if (this.field8385 < var6) {
                            return;
                        }
                        this.field8385 = (this.field8385 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field8390 > 0) {
                    if (this.field8391) {
                        label130: {
                            if (this.field8381 < 0) {
                                var9 = this.method3421(arg0, arg1, var5, var10, var4.field1678[this.field8387]);
                                if (this.field8385 >= var5) {
                                    return;
                                }
                                this.field8385 = var5 + var5 - 1 - this.field8385;
                                this.field8381 = -this.field8381;
                                if (--this.field8390 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method3449(arg0, var9, var6, var10, var4.field1678[this.field8386 - 1]);
                                if (this.field8385 < var6) {
                                    return;
                                }
                                this.field8385 = var6 + var6 - 1 - this.field8385;
                                this.field8381 = -this.field8381;
                                if (--this.field8390 == 0) {
                                    break;
                                }
                                var9 = this.method3421(arg0, var9, var5, var10, var4.field1678[this.field8387]);
                                if (this.field8385 >= var5) {
                                    return;
                                }
                                this.field8385 = var5 + var5 - 1 - this.field8385;
                                this.field8381 = -this.field8381;
                            } while (--this.field8390 != 0);
                        }
                    } else if (this.field8381 < 0) {
                        while (true) {
                            var9 = this.method3421(arg0, var9, var5, var10, var4.field1678[this.field8386 - 1]);
                            if (this.field8385 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field8385) / var8;
                            if (var12 >= this.field8390) {
                                this.field8385 += this.field8390 * var8;
                                this.field8390 = 0;
                                break;
                            }
                            this.field8385 += var8 * var12;
                            this.field8390 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method3449(arg0, var9, var6, var10, var4.field1678[this.field8387]);
                            if (this.field8385 < var6) {
                                return;
                            }
                            int var13 = (this.field8385 - var5) / var8;
                            if (var13 >= this.field8390) {
                                this.field8385 -= this.field8390 * var8;
                                this.field8390 = 0;
                                break;
                            }
                            this.field8385 -= var8 * var13;
                            this.field8390 -= var13;
                        }
                    }
                }
                if (this.field8381 < 0) {
                    this.method3421(arg0, var9, 0, var10, 0);
                    if (this.field8385 < 0) {
                        this.field8385 = -1;
                        this.method3453();
                        this.method1304((byte) 7);
                        return;
                    }
                } else {
                    this.method3449(arg0, var9, var7, var10, 0);
                    if (this.field8385 >= var7) {
                        this.field8385 = var7;
                        this.method3453();
                        this.method1304((byte) 7);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ia", name = "i", descriptor = "()Z", line = 1196)
    public final boolean method3445() {
        return this.field8383 != 0;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "([B[IIIIIIILia;)I", line = 1199)
    private static final int method3446(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class591 arg8) {
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
        arg8.field8385 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(II[B[IIIIIIILia;II)I", line = 1224)
    private static final int method3447(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class591 arg10, int arg11, int arg12) {
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
        arg10.field8385 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "(I)V", line = 1250)
    public final synchronized void method3448(int arg0) {
        this.method3454(arg0 << 6, this.method3432());
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "([IIIII)I", line = 1253)
    private final int method3449(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field8383 <= 0) {
                if (this.field8381 == 256 && (this.field8385 & 255) == 0) {
                    if (class266.field3798) {
                        return method3424(0, ((class125) super.field4328).field1678, arg0, this.field8385, arg1, this.field8393, this.field8392, 0, arg3, arg2, this);
                    }
                    return method3446(((class125) super.field4328).field1678, arg0, this.field8385, arg1, this.field8382, 0, arg3, arg2, this);
                }
                if (class266.field3798) {
                    return method3427(0, 0, ((class125) super.field4328).field1678, arg0, this.field8385, arg1, this.field8393, this.field8392, 0, arg3, arg2, this, this.field8381, arg4);
                }
                return method3447(0, 0, ((class125) super.field4328).field1678, arg0, this.field8385, arg1, this.field8382, 0, arg3, arg2, this, this.field8381, arg4);
            }
            int var6 = this.field8383 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field8383 += arg1;
            if (this.field8381 == 256 && (this.field8385 & 255) == 0) {
                if (class266.field3798) {
                    arg1 = method3439(0, ((class125) super.field4328).field1678, arg0, this.field8385, arg1, this.field8393, this.field8392, this.field8388, this.field8380, 0, var6, arg2, this);
                } else {
                    arg1 = method3426(((class125) super.field4328).field1678, arg0, this.field8385, arg1, this.field8382, this.field8389, 0, var6, arg2, this);
                }
            } else if (class266.field3798) {
                arg1 = method3422(0, 0, ((class125) super.field4328).field1678, arg0, this.field8385, arg1, this.field8393, this.field8392, this.field8388, this.field8380, 0, var6, arg2, this, this.field8381, arg4);
            } else {
                arg1 = method3444(0, 0, ((class125) super.field4328).field1678, arg0, this.field8385, arg1, this.field8382, this.field8389, 0, var6, arg2, this, this.field8381, arg4);
            }
            this.field8383 -= arg1;
            if (this.field8383 != 0) {
                return arg1;
            }
        } while (!this.method3425());
        return arg3;
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "([B[IIIIIIILia;)I", line = 1308)
    private static final int method3450(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class591 arg8) {
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
        arg8.field8385 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "(II[B[IIIIIIIILia;II)I", line = 1333)
    private static final int method3451(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class591 arg11, int arg12, int arg13) {
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
        arg11.field8385 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!ia", name = "h", descriptor = "(I)V", line = 1365)
    public final synchronized void method3452(int arg0) {
        if (arg0 == 0) {
            this.method3431(0);
            this.method1304((byte) 7);
        } else if (this.field8393 == 0 && this.field8392 == 0) {
            this.field8383 = 0;
            this.field8394 = 0;
            this.field8382 = 0;
            this.method1304((byte) 7);
        } else {
            int var2 = -this.field8382;
            if (this.field8382 > var2) {
                var2 = this.field8382;
            }
            if (-this.field8393 > var2) {
                var2 = -this.field8393;
            }
            if (this.field8393 > var2) {
                var2 = this.field8393;
            }
            if (-this.field8392 > var2) {
                var2 = -this.field8392;
            }
            if (this.field8392 > var2) {
                var2 = this.field8392;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field8383 = arg0;
            this.field8394 = Integer.MIN_VALUE;
            this.field8389 = -this.field8382 / arg0;
            this.field8388 = -this.field8393 / arg0;
            this.field8380 = -this.field8392 / arg0;
        }
    }

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "()Lca;", line = 1412)
    public final class306 method1488() {
        return null;
    }

    @OriginalMember(owner = "client!ia", name = "j", descriptor = "()V", line = 1417)
    private final void method3453() {
        if (this.field8383 != 0) {
            if (this.field8394 == Integer.MIN_VALUE) {
                this.field8394 = 0;
            }
            this.field8383 = 0;
            this.method3423();
        }
    }

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "(II)V", line = 1428)
    private final synchronized void method3454(int arg0, int arg1) {
        this.field8394 = arg0;
        this.field8384 = arg1;
        this.field8383 = 0;
        this.method3423();
    }

    @OriginalMember(owner = "client!ia", name = "i", descriptor = "(I)V", line = 1436)
    public final synchronized void method3455(int arg0) {
        if (this.field8381 < 0) {
            this.field8381 = -arg0;
        } else {
            this.field8381 = arg0;
        }
    }

    @OriginalMember(owner = "client!ia", name = "k", descriptor = "()Z", line = 1443)
    public final boolean method3456() {
        return this.field8385 < 0 || this.field8385 >= ((class125) super.field4328).field1678.length << 8;
    }

    @OriginalMember(owner = "client!ia", name = "l", descriptor = "()I", line = 1447)
    public final synchronized int method3457() {
        return this.field8381 < 0 ? -this.field8381 : this.field8381;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lut;III)Lia;", line = 1451)
    public static final class591 method3458(class125 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1678 != null && arg0.field1678.length != 0 ? new class591(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(Lut;III)V", line = 1456)
    private class591(class125 arg0, int arg1, int arg2, int arg3) {
        super.field4328 = arg0;
        this.field8387 = arg0.field1677;
        this.field8386 = arg0.field1676;
        this.field8391 = arg0.field1675;
        this.field8381 = arg1;
        this.field8394 = arg2;
        this.field8384 = arg3;
        this.field8385 = 0;
        this.method3423();
    }
}
