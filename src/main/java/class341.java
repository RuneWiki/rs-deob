import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vq")
public class class341 extends class33 {

    @OriginalMember(owner = "client!vq", name = "v", descriptor = "I")
    private int field5345;

    @OriginalMember(owner = "client!vq", name = "u", descriptor = "I")
    private int field5344;

    @OriginalMember(owner = "client!vq", name = "A", descriptor = "Z")
    private boolean field5350;

    @OriginalMember(owner = "client!vq", name = "y", descriptor = "I")
    private int field5348;

    @OriginalMember(owner = "client!vq", name = "C", descriptor = "I")
    private int field5352;

    @OriginalMember(owner = "client!vq", name = "F", descriptor = "I")
    private int field5355;

    @OriginalMember(owner = "client!vq", name = "t", descriptor = "I")
    private int field5343;

    @OriginalMember(owner = "client!vq", name = "r", descriptor = "I")
    private int field5341;

    @OriginalMember(owner = "client!vq", name = "s", descriptor = "I")
    private int field5342;

    @OriginalMember(owner = "client!vq", name = "w", descriptor = "I")
    private int field5346;

    @OriginalMember(owner = "client!vq", name = "x", descriptor = "I")
    private int field5347;

    @OriginalMember(owner = "client!vq", name = "z", descriptor = "I")
    private int field5349;

    @OriginalMember(owner = "client!vq", name = "B", descriptor = "I")
    private int field5351;

    @OriginalMember(owner = "client!vq", name = "D", descriptor = "I")
    private int field5353;

    @OriginalMember(owner = "client!vq", name = "E", descriptor = "I")
    private int field5354;

    @OriginalMember(owner = "client!vq", name = "e", descriptor = "()Z")
    public final boolean method2158() {
        return this.field5349 != 0;
    }

    @OriginalMember(owner = "client!vq", name = "c", descriptor = "(I)V")
    public final synchronized void method2159(int arg0) {
        if (arg0 == 0) {
            this.method2191(0);
            this.method1821((byte) 36);
        } else if (this.field5342 == 0 && this.field5354 == 0) {
            this.field5349 = 0;
            this.field5352 = 0;
            this.field5351 = 0;
            this.method1821((byte) 115);
        } else {
            int var2 = -this.field5351;
            if (this.field5351 > var2) {
                var2 = this.field5351;
            }
            if (-this.field5342 > var2) {
                var2 = -this.field5342;
            }
            if (this.field5342 > var2) {
                var2 = this.field5342;
            }
            if (-this.field5354 > var2) {
                var2 = -this.field5354;
            }
            if (this.field5354 > var2) {
                var2 = this.field5354;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field5349 = arg0;
            this.field5352 = Integer.MIN_VALUE;
            this.field5347 = -this.field5351 / arg0;
            this.field5341 = -this.field5342 / arg0;
            this.field5346 = -this.field5354 / arg0;
        }
    }

    @OriginalMember(owner = "client!vq", name = "f", descriptor = "()I")
    public final synchronized int method2160() {
        return this.field5352 == Integer.MIN_VALUE ? 0 : this.field5352;
    }

    @OriginalMember(owner = "client!vq", name = "g", descriptor = "()I")
    public final synchronized int method2161() {
        return this.field5348 < 0 ? -this.field5348 : this.field5348;
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(II[B[IIIIIIIILvq;II)I")
    private static final int method2162(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class341 arg11, int arg12, int arg13) {
        arg11.field5342 -= arg11.field5341 * arg5;
        arg11.field5354 -= arg11.field5346 * arg5;
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
        arg11.field5342 += arg11.field5341 * arg5;
        arg11.field5354 += arg11.field5346 * arg5;
        arg11.field5351 = arg6;
        arg11.field5343 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!vq", name = "c", descriptor = "()Loa;")
    public final class33 method256() {
        return null;
    }

    @OriginalMember(owner = "client!vq", name = "d", descriptor = "(I)V")
    public final synchronized void method2163(int arg0) {
        if (this.field5348 < 0) {
            this.field5348 = -arg0;
        } else {
            this.field5348 = arg0;
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(II[B[IIIIIIIIIILvq;II)I")
    private static final int method2164(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class341 arg13, int arg14, int arg15) {
        arg13.field5351 -= arg13.field5347 * arg5;
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
        arg13.field5351 += arg13.field5347 * var22;
        arg13.field5342 = arg6;
        arg13.field5354 = arg7;
        arg13.field5343 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(I)V")
    public final synchronized void method251(int arg0) {
        if (this.field5349 > 0) {
            if (arg0 >= this.field5349) {
                if (this.field5352 == Integer.MIN_VALUE) {
                    this.field5352 = 0;
                    this.field5351 = this.field5342 = this.field5354 = 0;
                    this.method1821((byte) -120);
                    arg0 = this.field5349;
                }
                this.field5349 = 0;
                this.method2187();
            } else {
                this.field5351 += this.field5347 * arg0;
                this.field5342 += this.field5341 * arg0;
                this.field5354 += this.field5346 * arg0;
                this.field5349 -= arg0;
            }
        }
        class168 var2 = (class168) super.field519;
        int var3 = this.field5345 << 8;
        int var4 = this.field5344 << 8;
        int var5 = var2.field2691.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field5353 = 0;
        }
        if (this.field5343 < 0) {
            if (this.field5348 <= 0) {
                this.method2180();
                this.method1821((byte) 127);
                return;
            }
            this.field5343 = 0;
        }
        if (this.field5343 >= var5) {
            if (this.field5348 >= 0) {
                this.method2180();
                this.method1821((byte) 80);
                return;
            }
            this.field5343 = var5 - 1;
        }
        this.field5343 += this.field5348 * arg0;
        if (this.field5353 < 0) {
            if (!this.field5350) {
                if (this.field5348 < 0) {
                    if (this.field5343 < var3) {
                        this.field5343 = var4 - 1 - (var4 - 1 - this.field5343) % var6;
                    }
                } else if (this.field5343 >= var4) {
                    this.field5343 = (this.field5343 - var3) % var6 + var3;
                }
            } else {
                if (this.field5348 < 0) {
                    if (this.field5343 >= var3) {
                        return;
                    }
                    this.field5343 = var3 + var3 - 1 - this.field5343;
                    this.field5348 = -this.field5348;
                }
                while (this.field5343 >= var4) {
                    this.field5343 = var4 + var4 - 1 - this.field5343;
                    this.field5348 = -this.field5348;
                    if (this.field5343 >= var3) {
                        return;
                    }
                    this.field5343 = var3 + var3 - 1 - this.field5343;
                    this.field5348 = -this.field5348;
                }
            }
        } else {
            if (this.field5353 > 0) {
                if (this.field5350) {
                    label125: {
                        if (this.field5348 < 0) {
                            if (this.field5343 >= var3) {
                                return;
                            }
                            this.field5343 = var3 + var3 - 1 - this.field5343;
                            this.field5348 = -this.field5348;
                            if (--this.field5353 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field5343 < var4) {
                                return;
                            }
                            this.field5343 = var4 + var4 - 1 - this.field5343;
                            this.field5348 = -this.field5348;
                            if (--this.field5353 == 0) {
                                break;
                            }
                            if (this.field5343 >= var3) {
                                return;
                            }
                            this.field5343 = var3 + var3 - 1 - this.field5343;
                            this.field5348 = -this.field5348;
                        } while (--this.field5353 != 0);
                    }
                } else if (this.field5348 < 0) {
                    if (this.field5343 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field5343) / var6;
                    if (var7 < this.field5353) {
                        this.field5343 += var6 * var7;
                        this.field5353 -= var7;
                        return;
                    }
                    this.field5343 += this.field5353 * var6;
                    this.field5353 = 0;
                } else {
                    if (this.field5343 < var4) {
                        return;
                    }
                    int var8 = (this.field5343 - var3) / var6;
                    if (var8 < this.field5353) {
                        this.field5343 -= var6 * var8;
                        this.field5353 -= var8;
                        return;
                    }
                    this.field5343 -= this.field5353 * var6;
                    this.field5353 = 0;
                }
            }
            if (this.field5348 < 0) {
                if (this.field5343 < 0) {
                    this.field5343 = -1;
                    this.method2180();
                    this.method1821((byte) 56);
                    return;
                }
            } else if (this.field5343 >= var5) {
                this.field5343 = var5;
                this.method2180();
                this.method1821((byte) -84);
            }
        }
    }

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "(II)I")
    private static final int method2165(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "([B[IIIIIIIILvq;)I")
    private static final int method2166(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class341 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field5342 += (var14 - arg3) * arg9.field5341;
        arg9.field5354 += (var14 - arg3) * arg9.field5346;
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
        arg9.field5351 = var12 >> 2;
        arg9.field5343 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(I[B[IIIIIIIILvq;)I")
    private static final int method2167(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class341 arg10) {
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
        arg10.field5343 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "()I")
    public final int method255() {
        int var1 = this.field5351 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field5353 == 0) {
            var2 -= this.field5343 * var2 / (((class168) super.field519).field2691.length << 8);
        } else if (this.field5353 >= 0) {
            var2 -= this.field5345 * var2 / ((class168) super.field519).field2691.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "(I[B[IIIIIIIILvq;)I")
    private static final int method2168(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class341 arg10) {
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
        arg10.field5343 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!vq", name = "d", descriptor = "()I")
    public final int method257() {
        return this.field5352 == 0 && this.field5349 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "(II[B[IIIIIIIILvq;II)I")
    private static final int method2169(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class341 arg11, int arg12, int arg13) {
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
        arg11.field5343 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "([B[IIIIIIILvq;)I")
    private static final int method2170(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class341 arg8) {
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
        arg8.field5343 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(II[B[IIIIIIILvq;II)I")
    private static final int method2171(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class341 arg10, int arg11, int arg12) {
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
        arg10.field5343 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "([III)V")
    public final synchronized void method252(int[] arg0, int arg1, int arg2) {
        if (this.field5352 == 0 && this.field5349 == 0) {
            this.method251(arg2);
        } else {
            class168 var4 = (class168) super.field519;
            int var5 = this.field5345 << 8;
            int var6 = this.field5344 << 8;
            int var7 = var4.field2691.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field5353 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field5343 < 0) {
                if (this.field5348 <= 0) {
                    this.method2180();
                    this.method1821((byte) -84);
                    return;
                }
                this.field5343 = 0;
            }
            if (this.field5343 >= var7) {
                if (this.field5348 >= 0) {
                    this.method2180();
                    this.method1821((byte) -75);
                    return;
                }
                this.field5343 = var7 - 1;
            }
            if (this.field5353 < 0) {
                if (this.field5350) {
                    if (this.field5348 < 0) {
                        var9 = this.method2197(arg0, arg1, var5, var10, var4.field2691[this.field5345]);
                        if (this.field5343 >= var5) {
                            return;
                        }
                        this.field5343 = var5 + var5 - 1 - this.field5343;
                        this.field5348 = -this.field5348;
                    }
                    while (true) {
                        int var11 = this.method2193(arg0, var9, var6, var10, var4.field2691[this.field5344 - 1]);
                        if (this.field5343 < var6) {
                            return;
                        }
                        this.field5343 = var6 + var6 - 1 - this.field5343;
                        this.field5348 = -this.field5348;
                        var9 = this.method2197(arg0, var11, var5, var10, var4.field2691[this.field5345]);
                        if (this.field5343 >= var5) {
                            return;
                        }
                        this.field5343 = var5 + var5 - 1 - this.field5343;
                        this.field5348 = -this.field5348;
                    }
                } else if (this.field5348 < 0) {
                    while (true) {
                        var9 = this.method2197(arg0, var9, var5, var10, var4.field2691[this.field5344 - 1]);
                        if (this.field5343 >= var5) {
                            return;
                        }
                        this.field5343 = var6 - 1 - (var6 - 1 - this.field5343) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method2193(arg0, var9, var6, var10, var4.field2691[this.field5345]);
                        if (this.field5343 < var6) {
                            return;
                        }
                        this.field5343 = (this.field5343 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field5353 > 0) {
                    if (this.field5350) {
                        label130: {
                            if (this.field5348 < 0) {
                                var9 = this.method2197(arg0, arg1, var5, var10, var4.field2691[this.field5345]);
                                if (this.field5343 >= var5) {
                                    return;
                                }
                                this.field5343 = var5 + var5 - 1 - this.field5343;
                                this.field5348 = -this.field5348;
                                if (--this.field5353 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method2193(arg0, var9, var6, var10, var4.field2691[this.field5344 - 1]);
                                if (this.field5343 < var6) {
                                    return;
                                }
                                this.field5343 = var6 + var6 - 1 - this.field5343;
                                this.field5348 = -this.field5348;
                                if (--this.field5353 == 0) {
                                    break;
                                }
                                var9 = this.method2197(arg0, var9, var5, var10, var4.field2691[this.field5345]);
                                if (this.field5343 >= var5) {
                                    return;
                                }
                                this.field5343 = var5 + var5 - 1 - this.field5343;
                                this.field5348 = -this.field5348;
                            } while (--this.field5353 != 0);
                        }
                    } else if (this.field5348 < 0) {
                        while (true) {
                            var9 = this.method2197(arg0, var9, var5, var10, var4.field2691[this.field5344 - 1]);
                            if (this.field5343 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field5343) / var8;
                            if (var12 >= this.field5353) {
                                this.field5343 += this.field5353 * var8;
                                this.field5353 = 0;
                                break;
                            }
                            this.field5343 += var8 * var12;
                            this.field5353 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method2193(arg0, var9, var6, var10, var4.field2691[this.field5345]);
                            if (this.field5343 < var6) {
                                return;
                            }
                            int var13 = (this.field5343 - var5) / var8;
                            if (var13 >= this.field5353) {
                                this.field5343 -= this.field5353 * var8;
                                this.field5353 = 0;
                                break;
                            }
                            this.field5343 -= var8 * var13;
                            this.field5353 -= var13;
                        }
                    }
                }
                if (this.field5348 < 0) {
                    this.method2197(arg0, var9, 0, var10, 0);
                    if (this.field5343 < 0) {
                        this.field5343 = -1;
                        this.method2180();
                        this.method1821((byte) 121);
                        return;
                    }
                } else {
                    this.method2193(arg0, var9, var7, var10, 0);
                    if (this.field5343 >= var7) {
                        this.field5343 = var7;
                        this.method2180();
                        this.method1821((byte) -128);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vq", name = "h", descriptor = "()Z")
    public final boolean method2172() {
        return this.field5343 < 0 || this.field5343 >= ((class168) super.field519).field2691.length << 8;
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(III)V")
    public final synchronized void method2173(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method2185(arg1, arg2);
        } else {
            int var4 = method2189(arg1, arg2);
            int var5 = method2165(arg1, arg2);
            if (this.field5342 == var4 && this.field5354 == var5) {
                this.field5349 = 0;
            } else {
                int var6 = arg1 - this.field5351;
                if (this.field5351 - arg1 > var6) {
                    var6 = this.field5351 - arg1;
                }
                if (var4 - this.field5342 > var6) {
                    var6 = var4 - this.field5342;
                }
                if (this.field5342 - var4 > var6) {
                    var6 = this.field5342 - var4;
                }
                if (var5 - this.field5354 > var6) {
                    var6 = var5 - this.field5354;
                }
                if (this.field5354 - var5 > var6) {
                    var6 = this.field5354 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field5349 = arg0;
                this.field5352 = arg1;
                this.field5355 = arg2;
                this.field5347 = (arg1 - this.field5351) / arg0;
                this.field5341 = (var4 - this.field5342) / arg0;
                this.field5346 = (var5 - this.field5354) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(Lmg;II)Lvq;")
    public static final class341 method2174(class168 arg0, int arg1, int arg2) {
        return arg0.field2691 != null && arg0.field2691.length != 0 ? new class341(arg0, (int) ((long) arg0.field2687 * 256L * (long) arg1 / (long) (class12.field141 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!vq", name = "i", descriptor = "()Z")
    private final boolean method2175() {
        int var1 = this.field5352;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method2189(var1, this.field5355);
            var2 = method2165(var1, this.field5355);
        }
        if (this.field5351 == var1 && this.field5342 == var3 && this.field5354 == var2) {
            if (this.field5352 == Integer.MIN_VALUE) {
                this.field5352 = 0;
                this.field5351 = this.field5342 = this.field5354 = 0;
                this.method1821((byte) 23);
                return true;
            } else {
                this.method2187();
                return false;
            }
        } else {
            if (this.field5351 < var1) {
                this.field5347 = 1;
                this.field5349 = var1 - this.field5351;
            } else if (this.field5351 > var1) {
                this.field5347 = -1;
                this.field5349 = this.field5351 - var1;
            } else {
                this.field5347 = 0;
            }
            if (this.field5342 < var3) {
                this.field5341 = 1;
                if (this.field5349 == 0 || this.field5349 > var3 - this.field5342) {
                    this.field5349 = var3 - this.field5342;
                }
            } else if (this.field5342 > var3) {
                this.field5341 = -1;
                if (this.field5349 == 0 || this.field5349 > this.field5342 - var3) {
                    this.field5349 = this.field5342 - var3;
                }
            } else {
                this.field5341 = 0;
            }
            if (this.field5354 < var2) {
                this.field5346 = 1;
                if (this.field5349 == 0 || this.field5349 > var2 - this.field5354) {
                    this.field5349 = var2 - this.field5354;
                }
            } else if (this.field5354 > var2) {
                this.field5346 = -1;
                if (this.field5349 == 0 || this.field5349 > this.field5354 - var2) {
                    this.field5349 = this.field5354 - var2;
                }
            } else {
                this.field5346 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!vq", name = "c", descriptor = "(II)V")
    public final synchronized void method2176(int arg0, int arg1) {
        this.method2173(arg0, arg1, this.method2195());
    }

    @OriginalMember(owner = "client!vq", name = "e", descriptor = "(I)V")
    public final synchronized void method2177(int arg0) {
        this.field5353 = arg0;
    }

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "(II[B[IIIIIIIIIILvq;II)I")
    private static final int method2178(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class341 arg13, int arg14, int arg15) {
        arg13.field5351 -= arg13.field5347 * arg5;
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
        arg13.field5351 += arg13.field5347 * var22;
        arg13.field5342 = arg6;
        arg13.field5354 = arg7;
        arg13.field5343 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "([B[IIIIIIILvq;)I")
    private static final int method2179(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class341 arg8) {
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
        arg8.field5343 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!vq", name = "j", descriptor = "()V")
    private final void method2180() {
        if (this.field5349 != 0) {
            if (this.field5352 == Integer.MIN_VALUE) {
                this.field5352 = 0;
            }
            this.field5349 = 0;
            this.method2187();
        }
    }

    @OriginalMember(owner = "client!vq", name = "f", descriptor = "(I)V")
    public final synchronized void method2181(int arg0) {
        this.method2185(arg0 << 6, this.method2195());
    }

    @OriginalMember(owner = "client!vq", name = "c", descriptor = "(II[B[IIIIIIIILvq;II)I")
    private static final int method2182(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class341 arg11, int arg12, int arg13) {
        arg11.field5342 -= arg11.field5341 * arg5;
        arg11.field5354 -= arg11.field5346 * arg5;
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
        arg11.field5342 += arg11.field5341 * arg5;
        arg11.field5354 += arg11.field5346 * arg5;
        arg11.field5351 = arg6;
        arg11.field5343 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!vq", name = "d", descriptor = "(II[B[IIIIIIIILvq;II)I")
    private static final int method2183(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class341 arg11, int arg12, int arg13) {
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
        arg11.field5343 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "([B[IIIIIIIILvq;)I")
    private static final int method2184(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class341 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field5342 += (var14 - arg3) * arg9.field5341;
        arg9.field5354 += (var14 - arg3) * arg9.field5346;
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
        arg9.field5351 = var12 >> 2;
        arg9.field5343 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!vq", name = "d", descriptor = "(II)V")
    private final synchronized void method2185(int arg0, int arg1) {
        this.field5352 = arg0;
        this.field5355 = arg1;
        this.field5349 = 0;
        this.method2187();
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "()Loa;")
    public final class33 method254() {
        return null;
    }

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "(Z)V")
    public final synchronized void method2186(boolean arg0) {
        this.field5348 = (this.field5348 >>> 31) + (this.field5348 ^ this.field5348 >> 31);
        if (arg0) {
            this.field5348 = -this.field5348;
        }
    }

    @OriginalMember(owner = "client!vq", name = "k", descriptor = "()V")
    private final void method2187() {
        this.field5351 = this.field5352;
        this.field5342 = method2189(this.field5352, this.field5355);
        this.field5354 = method2165(this.field5352, this.field5355);
    }

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "(II[B[IIIIIIILvq;II)I")
    private static final int method2188(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class341 arg10, int arg11, int arg12) {
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
        arg10.field5343 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!vq", name = "e", descriptor = "(II)I")
    private static final int method2189(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!vq", name = "g", descriptor = "(I)V")
    public final synchronized void method2190(int arg0) {
        int var2 = ((class168) super.field519).field2691.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field5343 = arg0;
    }

    @OriginalMember(owner = "client!vq", name = "h", descriptor = "(I)V")
    private final synchronized void method2191(int arg0) {
        this.method2185(arg0, this.method2195());
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(I[B[IIIIIIIIIILvq;)I")
    private static final int method2192(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class341 arg12) {
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
        arg12.field5351 += (var19 - arg4) * arg12.field5347;
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
        arg12.field5342 = var15 >> 2;
        arg12.field5354 = var16 >> 2;
        arg12.field5343 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "([IIIII)I")
    private final int method2193(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field5349 <= 0) {
                if (this.field5348 == 256 && (this.field5343 & 255) == 0) {
                    if (class175.field2777) {
                        return method2168(0, ((class168) super.field519).field2691, arg0, this.field5343, arg1, this.field5342, this.field5354, 0, arg3, arg2, this);
                    }
                    return method2179(((class168) super.field519).field2691, arg0, this.field5343, arg1, this.field5351, 0, arg3, arg2, this);
                }
                if (class175.field2777) {
                    return method2169(0, 0, ((class168) super.field519).field2691, arg0, this.field5343, arg1, this.field5342, this.field5354, 0, arg3, arg2, this, this.field5348, arg4);
                }
                return method2188(0, 0, ((class168) super.field519).field2691, arg0, this.field5343, arg1, this.field5351, 0, arg3, arg2, this, this.field5348, arg4);
            }
            int var6 = this.field5349 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field5349 += arg1;
            if (this.field5348 == 256 && (this.field5343 & 255) == 0) {
                if (class175.field2777) {
                    arg1 = method2192(0, ((class168) super.field519).field2691, arg0, this.field5343, arg1, this.field5342, this.field5354, this.field5341, this.field5346, 0, var6, arg2, this);
                } else {
                    arg1 = method2184(((class168) super.field519).field2691, arg0, this.field5343, arg1, this.field5351, this.field5347, 0, var6, arg2, this);
                }
            } else if (class175.field2777) {
                arg1 = method2178(0, 0, ((class168) super.field519).field2691, arg0, this.field5343, arg1, this.field5342, this.field5354, this.field5341, this.field5346, 0, var6, arg2, this, this.field5348, arg4);
            } else {
                arg1 = method2162(0, 0, ((class168) super.field519).field2691, arg0, this.field5343, arg1, this.field5351, this.field5347, 0, var6, arg2, this, this.field5348, arg4);
            }
            this.field5349 -= arg1;
            if (this.field5349 != 0) {
                return arg1;
            }
        } while (!this.method2175());
        return arg3;
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(Lmg;III)Lvq;")
    public static final class341 method2194(class168 arg0, int arg1, int arg2, int arg3) {
        return arg0.field2691 != null && arg0.field2691.length != 0 ? new class341(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!vq", name = "l", descriptor = "()I")
    public final synchronized int method2195() {
        return this.field5355 < 0 ? -1 : this.field5355;
    }

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "(I[B[IIIIIIIIIILvq;)I")
    private static final int method2196(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class341 arg12) {
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
        arg12.field5351 += (var19 - arg4) * arg12.field5347;
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
        arg12.field5342 = var15 >> 2;
        arg12.field5354 = var16 >> 2;
        arg12.field5343 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "([IIIII)I")
    private final int method2197(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field5349 <= 0) {
                if (this.field5348 == -256 && (this.field5343 & 255) == 0) {
                    if (class175.field2777) {
                        return method2167(0, ((class168) super.field519).field2691, arg0, this.field5343, arg1, this.field5342, this.field5354, 0, arg3, arg2, this);
                    }
                    return method2170(((class168) super.field519).field2691, arg0, this.field5343, arg1, this.field5351, 0, arg3, arg2, this);
                }
                if (class175.field2777) {
                    return method2183(0, 0, ((class168) super.field519).field2691, arg0, this.field5343, arg1, this.field5342, this.field5354, 0, arg3, arg2, this, this.field5348, arg4);
                }
                return method2171(0, 0, ((class168) super.field519).field2691, arg0, this.field5343, arg1, this.field5351, 0, arg3, arg2, this, this.field5348, arg4);
            }
            int var6 = this.field5349 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field5349 += arg1;
            if (this.field5348 == -256 && (this.field5343 & 255) == 0) {
                if (class175.field2777) {
                    arg1 = method2196(0, ((class168) super.field519).field2691, arg0, this.field5343, arg1, this.field5342, this.field5354, this.field5341, this.field5346, 0, var6, arg2, this);
                } else {
                    arg1 = method2166(((class168) super.field519).field2691, arg0, this.field5343, arg1, this.field5351, this.field5347, 0, var6, arg2, this);
                }
            } else if (class175.field2777) {
                arg1 = method2164(0, 0, ((class168) super.field519).field2691, arg0, this.field5343, arg1, this.field5342, this.field5354, this.field5341, this.field5346, 0, var6, arg2, this, this.field5348, arg4);
            } else {
                arg1 = method2182(0, 0, ((class168) super.field519).field2691, arg0, this.field5343, arg1, this.field5351, this.field5347, 0, var6, arg2, this, this.field5348, arg4);
            }
            this.field5349 -= arg1;
            if (this.field5349 != 0) {
                return arg1;
            }
        } while (!this.method2175());
        return arg3;
    }

    @OriginalMember(owner = "client!vq", name = "<init>", descriptor = "(Lmg;II)V")
    private class341(class168 arg0, int arg1, int arg2) {
        super.field519 = arg0;
        this.field5345 = arg0.field2690;
        this.field5344 = arg0.field2688;
        this.field5350 = arg0.field2689;
        this.field5348 = arg1;
        this.field5352 = arg2;
        this.field5355 = 8192;
        this.field5343 = 0;
        this.method2187();
    }

    @OriginalMember(owner = "client!vq", name = "<init>", descriptor = "(Lmg;III)V")
    private class341(class168 arg0, int arg1, int arg2, int arg3) {
        super.field519 = arg0;
        this.field5345 = arg0.field2690;
        this.field5344 = arg0.field2688;
        this.field5350 = arg0.field2689;
        this.field5348 = arg1;
        this.field5352 = arg2;
        this.field5355 = arg3;
        this.field5343 = 0;
        this.method2187();
    }
}
