import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public class class173 extends class321 {

    @OriginalMember(owner = "client!en", name = "E", descriptor = "I")
    private int field2381;

    @OriginalMember(owner = "client!en", name = "B", descriptor = "I")
    private int field2378;

    @OriginalMember(owner = "client!en", name = "u", descriptor = "Z")
    private boolean field2372;

    @OriginalMember(owner = "client!en", name = "G", descriptor = "I")
    private int field2383;

    @OriginalMember(owner = "client!en", name = "F", descriptor = "I")
    private int field2382;

    @OriginalMember(owner = "client!en", name = "C", descriptor = "I")
    private int field2379;

    @OriginalMember(owner = "client!en", name = "v", descriptor = "I")
    private int field2373;

    @OriginalMember(owner = "client!en", name = "t", descriptor = "I")
    private int field2371;

    @OriginalMember(owner = "client!en", name = "w", descriptor = "I")
    private int field2374;

    @OriginalMember(owner = "client!en", name = "x", descriptor = "I")
    private int field2375;

    @OriginalMember(owner = "client!en", name = "y", descriptor = "I")
    private int field2376;

    @OriginalMember(owner = "client!en", name = "z", descriptor = "I")
    private int field2377;

    @OriginalMember(owner = "client!en", name = "D", descriptor = "I")
    private int field2380;

    @OriginalMember(owner = "client!en", name = "H", descriptor = "I")
    private int field2384;

    @OriginalMember(owner = "client!en", name = "I", descriptor = "I")
    private int field2385;

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(II[B[IIIIIIIILen;II)I", line = 4)
    private static final int method1150(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class173 arg11, int arg12, int arg13) {
        arg11.field2371 -= arg11.field2380 * arg5;
        arg11.field2384 -= arg11.field2385 * arg5;
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
        arg11.field2371 += arg11.field2380 * arg5;
        arg11.field2384 += arg11.field2385 * arg5;
        arg11.field2377 = arg6;
        arg11.field2373 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(II[B[IIIIIIILen;II)I", line = 37)
    private static final int method1151(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class173 arg10, int arg11, int arg12) {
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
        arg10.field2373 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(Lvo;II)Len;", line = 63)
    public static final class173 method1152(class27 arg0, int arg1, int arg2) {
        return arg0.field334 != null && arg0.field334.length != 0 ? new class173(arg0, (int) ((long) arg0.field335 * 256L * (long) arg1 / (long) (class313.field4484 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!en", name = "e", descriptor = "()I", line = 71)
    public final synchronized int method1153() {
        return this.field2379 < 0 ? -1 : this.field2379;
    }

    @OriginalMember(owner = "client!en", name = "f", descriptor = "()Z", line = 75)
    private final boolean method1154() {
        int var1 = this.field2382;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1188(var1, this.field2379);
            var2 = method1187(var1, this.field2379);
        }
        if (this.field2377 == var1 && this.field2371 == var3 && this.field2384 == var2) {
            if (this.field2382 == Integer.MIN_VALUE) {
                this.field2382 = 0;
                this.field2377 = this.field2371 = this.field2384 = 0;
                this.method2594((byte) -22);
                return true;
            } else {
                this.method1176();
                return false;
            }
        } else {
            if (this.field2377 < var1) {
                this.field2376 = 1;
                this.field2375 = var1 - this.field2377;
            } else if (this.field2377 > var1) {
                this.field2376 = -1;
                this.field2375 = this.field2377 - var1;
            } else {
                this.field2376 = 0;
            }
            if (this.field2371 < var3) {
                this.field2380 = 1;
                if (this.field2375 == 0 || this.field2375 > var3 - this.field2371) {
                    this.field2375 = var3 - this.field2371;
                }
            } else if (this.field2371 > var3) {
                this.field2380 = -1;
                if (this.field2375 == 0 || this.field2375 > this.field2371 - var3) {
                    this.field2375 = this.field2371 - var3;
                }
            } else {
                this.field2380 = 0;
            }
            if (this.field2384 < var2) {
                this.field2385 = 1;
                if (this.field2375 == 0 || this.field2375 > var2 - this.field2384) {
                    this.field2375 = var2 - this.field2384;
                }
            } else if (this.field2384 > var2) {
                this.field2385 = -1;
                if (this.field2375 == 0 || this.field2375 > this.field2384 - var2) {
                    this.field2375 = this.field2384 - var2;
                }
            } else {
                this.field2385 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "([IIIII)I", line = 164)
    private final int method1155(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field2375 <= 0) {
                if (this.field2383 == -256 && (this.field2373 & 255) == 0) {
                    if (class217.field3062) {
                        return method1166(0, ((class27) super.field4572).field334, arg0, this.field2373, arg1, this.field2371, this.field2384, 0, arg3, arg2, this);
                    }
                    return method1169(((class27) super.field4572).field334, arg0, this.field2373, arg1, this.field2377, 0, arg3, arg2, this);
                }
                if (class217.field3062) {
                    return method1181(0, 0, ((class27) super.field4572).field334, arg0, this.field2373, arg1, this.field2371, this.field2384, 0, arg3, arg2, this, this.field2383, arg4);
                }
                return method1179(0, 0, ((class27) super.field4572).field334, arg0, this.field2373, arg1, this.field2377, 0, arg3, arg2, this, this.field2383, arg4);
            }
            int var6 = this.field2375 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field2375 += arg1;
            if (this.field2383 == -256 && (this.field2373 & 255) == 0) {
                if (class217.field3062) {
                    arg1 = method1172(0, ((class27) super.field4572).field334, arg0, this.field2373, arg1, this.field2371, this.field2384, this.field2380, this.field2385, 0, var6, arg2, this);
                } else {
                    arg1 = method1189(((class27) super.field4572).field334, arg0, this.field2373, arg1, this.field2377, this.field2376, 0, var6, arg2, this);
                }
            } else if (class217.field3062) {
                arg1 = method1178(0, 0, ((class27) super.field4572).field334, arg0, this.field2373, arg1, this.field2371, this.field2384, this.field2380, this.field2385, 0, var6, arg2, this, this.field2383, arg4);
            } else {
                arg1 = method1150(0, 0, ((class27) super.field4572).field334, arg0, this.field2373, arg1, this.field2377, this.field2376, 0, var6, arg2, this, this.field2383, arg4);
            }
            this.field2375 -= arg1;
            if (this.field2375 != 0) {
                return arg1;
            }
        } while (!this.method1154());
        return arg3;
    }

    @OriginalMember(owner = "client!en", name = "c", descriptor = "(I)V", line = 221)
    public final synchronized void method1156(int arg0) {
        int var2 = ((class27) super.field4572).field334.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field2373 = arg0;
    }

    @OriginalMember(owner = "client!en", name = "g", descriptor = "()Z", line = 232)
    public final boolean method1157() {
        return this.field2375 != 0;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(I[B[IIIIIIIILen;)I", line = 235)
    private static final int method1158(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class173 arg10) {
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
        arg10.field2373 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!en", name = "d", descriptor = "(I)V", line = 273)
    private final synchronized void method1159(int arg0) {
        this.method1162(arg0, this.method1153());
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "([B[IIIIIIIILen;)I", line = 278)
    private static final int method1160(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class173 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field2371 += (var14 - arg3) * arg9.field2380;
        arg9.field2384 += (var14 - arg3) * arg9.field2385;
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
        arg9.field2377 = var12 >> 2;
        arg9.field2373 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!en", name = "b", descriptor = "(Z)V", line = 313)
    public final synchronized void method1161(boolean arg0) {
        this.field2383 = (this.field2383 >>> 31) + (this.field2383 ^ this.field2383 >> 31);
        if (arg0) {
            this.field2383 = -this.field2383;
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(II)V", line = 321)
    private final synchronized void method1162(int arg0, int arg1) {
        this.field2382 = arg0;
        this.field2379 = arg1;
        this.field2375 = 0;
        this.method1176();
    }

    @OriginalMember(owner = "client!en", name = "h", descriptor = "()V", line = 327)
    private final void method1163() {
        if (this.field2375 != 0) {
            if (this.field2382 == Integer.MIN_VALUE) {
                this.field2382 = 0;
            }
            this.field2375 = 0;
            this.method1176();
        }
    }

    @OriginalMember(owner = "client!en", name = "i", descriptor = "()Z", line = 338)
    public final boolean method1164() {
        return this.field2373 < 0 || this.field2373 >= ((class27) super.field4572).field334.length << 8;
    }

    @OriginalMember(owner = "client!en", name = "b", descriptor = "(II)V", line = 341)
    public final synchronized void method1165(int arg0, int arg1) {
        this.method1180(arg0, arg1, this.method1153());
    }

    @OriginalMember(owner = "client!en", name = "b", descriptor = "(I[B[IIIIIIIILen;)I", line = 344)
    private static final int method1166(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class173 arg10) {
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
        arg10.field2373 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!en", name = "e", descriptor = "(I)V", line = 382)
    public final synchronized void method1167(int arg0) {
        if (arg0 == 0) {
            this.method1159(0);
            this.method2594((byte) -22);
        } else if (this.field2371 == 0 && this.field2384 == 0) {
            this.field2375 = 0;
            this.field2382 = 0;
            this.field2377 = 0;
            this.method2594((byte) -22);
        } else {
            int var2 = -this.field2377;
            if (this.field2377 > var2) {
                var2 = this.field2377;
            }
            if (-this.field2371 > var2) {
                var2 = -this.field2371;
            }
            if (this.field2371 > var2) {
                var2 = this.field2371;
            }
            if (-this.field2384 > var2) {
                var2 = -this.field2384;
            }
            if (this.field2384 > var2) {
                var2 = this.field2384;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field2375 = arg0;
            this.field2382 = Integer.MIN_VALUE;
            this.field2376 = -this.field2377 / arg0;
            this.field2380 = -this.field2371 / arg0;
            this.field2385 = -this.field2384 / arg0;
        }
    }

    @OriginalMember(owner = "client!en", name = "f", descriptor = "(I)V", line = 427)
    public final synchronized void method1168(int arg0) {
        if (this.field2383 < 0) {
            this.field2383 = -arg0;
        } else {
            this.field2383 = arg0;
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "([B[IIIIIIILen;)I", line = 435)
    private static final int method1169(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class173 arg8) {
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
        arg8.field2373 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!en", name = "d", descriptor = "()I", line = 461)
    public final int method1170() {
        int var1 = this.field2377 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field2374 == 0) {
            var2 -= this.field2373 * var2 / (((class27) super.field4572).field334.length << 8);
        } else if (this.field2374 >= 0) {
            var2 -= this.field2381 * var2 / ((class27) super.field4572).field334.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!en", name = "b", descriptor = "(II[B[IIIIIIIILen;II)I", line = 473)
    private static final int method1171(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class173 arg11, int arg12, int arg13) {
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
        arg11.field2373 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(I[B[IIIIIIIIIILen;)I", line = 508)
    private static final int method1172(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class173 arg12) {
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
        arg12.field2377 += (var19 - arg4) * arg12.field2376;
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
        arg12.field2371 = var15 >> 2;
        arg12.field2384 = var16 >> 2;
        arg12.field2373 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "()I", line = 562)
    public final int method1079() {
        return this.field2382 == 0 && this.field2375 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!en", name = "g", descriptor = "(I)V", line = 568)
    public final synchronized void method1173(int arg0) {
        this.field2374 = arg0;
    }

    @OriginalMember(owner = "client!en", name = "b", descriptor = "()Lj;", line = 571)
    public final class321 method1078() {
        return null;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(II[B[IIIIIIIIIILen;II)I", line = 576)
    private static final int method1174(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class173 arg13, int arg14, int arg15) {
        arg13.field2377 -= arg13.field2376 * arg5;
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
        arg13.field2377 += arg13.field2376 * var22;
        arg13.field2371 = arg6;
        arg13.field2384 = arg7;
        arg13.field2373 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!en", name = "h", descriptor = "(I)V", line = 619)
    public final synchronized void method1175(int arg0) {
        this.method1162(arg0 << 6, this.method1153());
    }

    @OriginalMember(owner = "client!en", name = "j", descriptor = "()V", line = 622)
    private final void method1176() {
        this.field2377 = this.field2382;
        this.field2371 = method1188(this.field2382, this.field2379);
        this.field2384 = method1187(this.field2382, this.field2379);
    }

    @OriginalMember(owner = "client!en", name = "b", descriptor = "(I)V", line = 627)
    public final synchronized void method1056(int arg0) {
        if (this.field2375 > 0) {
            if (arg0 >= this.field2375) {
                if (this.field2382 == Integer.MIN_VALUE) {
                    this.field2382 = 0;
                    this.field2377 = this.field2371 = this.field2384 = 0;
                    this.method2594((byte) -22);
                    arg0 = this.field2375;
                }
                this.field2375 = 0;
                this.method1176();
            } else {
                this.field2377 += this.field2376 * arg0;
                this.field2371 += this.field2380 * arg0;
                this.field2384 += this.field2385 * arg0;
                this.field2375 -= arg0;
            }
        }
        class27 var2 = (class27) super.field4572;
        int var3 = this.field2381 << 8;
        int var4 = this.field2378 << 8;
        int var5 = var2.field334.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field2374 = 0;
        }
        if (this.field2373 < 0) {
            if (this.field2383 <= 0) {
                this.method1163();
                this.method2594((byte) -22);
                return;
            }
            this.field2373 = 0;
        }
        if (this.field2373 >= var5) {
            if (this.field2383 >= 0) {
                this.method1163();
                this.method2594((byte) -22);
                return;
            }
            this.field2373 = var5 - 1;
        }
        this.field2373 += this.field2383 * arg0;
        if (this.field2374 < 0) {
            if (!this.field2372) {
                if (this.field2383 < 0) {
                    if (this.field2373 < var3) {
                        this.field2373 = var4 - 1 - (var4 - 1 - this.field2373) % var6;
                    }
                } else if (this.field2373 >= var4) {
                    this.field2373 = (this.field2373 - var3) % var6 + var3;
                }
            } else {
                if (this.field2383 < 0) {
                    if (this.field2373 >= var3) {
                        return;
                    }
                    this.field2373 = var3 + var3 - 1 - this.field2373;
                    this.field2383 = -this.field2383;
                }
                while (this.field2373 >= var4) {
                    this.field2373 = var4 + var4 - 1 - this.field2373;
                    this.field2383 = -this.field2383;
                    if (this.field2373 >= var3) {
                        return;
                    }
                    this.field2373 = var3 + var3 - 1 - this.field2373;
                    this.field2383 = -this.field2383;
                }
            }
        } else {
            if (this.field2374 > 0) {
                if (this.field2372) {
                    label125: {
                        if (this.field2383 < 0) {
                            if (this.field2373 >= var3) {
                                return;
                            }
                            this.field2373 = var3 + var3 - 1 - this.field2373;
                            this.field2383 = -this.field2383;
                            if (--this.field2374 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field2373 < var4) {
                                return;
                            }
                            this.field2373 = var4 + var4 - 1 - this.field2373;
                            this.field2383 = -this.field2383;
                            if (--this.field2374 == 0) {
                                break;
                            }
                            if (this.field2373 >= var3) {
                                return;
                            }
                            this.field2373 = var3 + var3 - 1 - this.field2373;
                            this.field2383 = -this.field2383;
                        } while (--this.field2374 != 0);
                    }
                } else if (this.field2383 < 0) {
                    if (this.field2373 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field2373) / var6;
                    if (var7 < this.field2374) {
                        this.field2373 += var6 * var7;
                        this.field2374 -= var7;
                        return;
                    }
                    this.field2373 += this.field2374 * var6;
                    this.field2374 = 0;
                } else {
                    if (this.field2373 < var4) {
                        return;
                    }
                    int var8 = (this.field2373 - var3) / var6;
                    if (var8 < this.field2374) {
                        this.field2373 -= var6 * var8;
                        this.field2374 -= var8;
                        return;
                    }
                    this.field2373 -= this.field2374 * var6;
                    this.field2374 = 0;
                }
            }
            if (this.field2383 < 0) {
                if (this.field2373 < 0) {
                    this.field2373 = -1;
                    this.method1163();
                    this.method2594((byte) -22);
                    return;
                }
            } else if (this.field2373 >= var5) {
                this.field2373 = var5;
                this.method1163();
                this.method2594((byte) -22);
            }
        }
    }

    @OriginalMember(owner = "client!en", name = "b", descriptor = "([B[IIIIIIILen;)I", line = 847)
    private static final int method1177(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class173 arg8) {
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
        arg8.field2373 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!en", name = "b", descriptor = "(II[B[IIIIIIIIIILen;II)I", line = 872)
    private static final int method1178(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class173 arg13, int arg14, int arg15) {
        arg13.field2377 -= arg13.field2376 * arg5;
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
        arg13.field2377 += arg13.field2376 * var22;
        arg13.field2371 = arg6;
        arg13.field2384 = arg7;
        arg13.field2373 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!en", name = "b", descriptor = "(II[B[IIIIIIILen;II)I", line = 913)
    private static final int method1179(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class173 arg10, int arg11, int arg12) {
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
        arg10.field2373 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(III)V", line = 942)
    public final synchronized void method1180(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1162(arg1, arg2);
        } else {
            int var4 = method1188(arg1, arg2);
            int var5 = method1187(arg1, arg2);
            if (this.field2371 == var4 && this.field2384 == var5) {
                this.field2375 = 0;
            } else {
                int var6 = arg1 - this.field2377;
                if (this.field2377 - arg1 > var6) {
                    var6 = this.field2377 - arg1;
                }
                if (var4 - this.field2371 > var6) {
                    var6 = var4 - this.field2371;
                }
                if (this.field2371 - var4 > var6) {
                    var6 = this.field2371 - var4;
                }
                if (var5 - this.field2384 > var6) {
                    var6 = var5 - this.field2384;
                }
                if (this.field2384 - var5 > var6) {
                    var6 = this.field2384 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field2375 = arg0;
                this.field2382 = arg1;
                this.field2379 = arg2;
                this.field2376 = (arg1 - this.field2377) / arg0;
                this.field2380 = (var4 - this.field2371) / arg0;
                this.field2385 = (var5 - this.field2384) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!en", name = "c", descriptor = "(II[B[IIIIIIIILen;II)I", line = 989)
    private static final int method1181(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class173 arg11, int arg12, int arg13) {
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
        arg11.field2373 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(Lvo;III)Len;", line = 1024)
    public static final class173 method1182(class27 arg0, int arg1, int arg2, int arg3) {
        return arg0.field334 != null && arg0.field334.length != 0 ? new class173(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!en", name = "c", descriptor = "()Lj;", line = 1032)
    public final class321 method1060() {
        return null;
    }

    @OriginalMember(owner = "client!en", name = "k", descriptor = "()I", line = 1035)
    public final synchronized int method1183() {
        return this.field2383 < 0 ? -this.field2383 : this.field2383;
    }

    @OriginalMember(owner = "client!en", name = "d", descriptor = "(II[B[IIIIIIIILen;II)I", line = 1038)
    private static final int method1184(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class173 arg11, int arg12, int arg13) {
        arg11.field2371 -= arg11.field2380 * arg5;
        arg11.field2384 -= arg11.field2385 * arg5;
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
        arg11.field2371 += arg11.field2380 * arg5;
        arg11.field2384 += arg11.field2385 * arg5;
        arg11.field2377 = arg6;
        arg11.field2373 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!en", name = "l", descriptor = "()I", line = 1071)
    public final synchronized int method1185() {
        return this.field2382 == Integer.MIN_VALUE ? 0 : this.field2382;
    }

    @OriginalMember(owner = "client!en", name = "<init>", descriptor = "(Lvo;II)V", line = 1074)
    private class173(class27 arg0, int arg1, int arg2) {
        super.field4572 = arg0;
        this.field2381 = arg0.field333;
        this.field2378 = arg0.field337;
        this.field2372 = arg0.field336;
        this.field2383 = arg1;
        this.field2382 = arg2;
        this.field2379 = 8192;
        this.field2373 = 0;
        this.method1176();
    }

    @OriginalMember(owner = "client!en", name = "<init>", descriptor = "(Lvo;III)V", line = 1085)
    private class173(class27 arg0, int arg1, int arg2, int arg3) {
        super.field4572 = arg0;
        this.field2381 = arg0.field333;
        this.field2378 = arg0.field337;
        this.field2372 = arg0.field336;
        this.field2383 = arg1;
        this.field2382 = arg2;
        this.field2379 = arg3;
        this.field2373 = 0;
        this.method1176();
    }

    @OriginalMember(owner = "client!en", name = "b", descriptor = "(I[B[IIIIIIIIIILen;)I", line = 1097)
    private static final int method1186(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class173 arg12) {
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
        arg12.field2377 += (var19 - arg4) * arg12.field2376;
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
        arg12.field2371 = var15 >> 2;
        arg12.field2384 = var16 >> 2;
        arg12.field2373 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!en", name = "b", descriptor = "([III)V", line = 1150)
    public final synchronized void method1076(int[] arg0, int arg1, int arg2) {
        if (this.field2382 == 0 && this.field2375 == 0) {
            this.method1056(arg2);
        } else {
            class27 var4 = (class27) super.field4572;
            int var5 = this.field2381 << 8;
            int var6 = this.field2378 << 8;
            int var7 = var4.field334.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field2374 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field2373 < 0) {
                if (this.field2383 <= 0) {
                    this.method1163();
                    this.method2594((byte) -22);
                    return;
                }
                this.field2373 = 0;
            }
            if (this.field2373 >= var7) {
                if (this.field2383 >= 0) {
                    this.method1163();
                    this.method2594((byte) -22);
                    return;
                }
                this.field2373 = var7 - 1;
            }
            if (this.field2374 < 0) {
                if (this.field2372) {
                    if (this.field2383 < 0) {
                        var9 = this.method1155(arg0, arg1, var5, var10, var4.field334[this.field2381]);
                        if (this.field2373 >= var5) {
                            return;
                        }
                        this.field2373 = var5 + var5 - 1 - this.field2373;
                        this.field2383 = -this.field2383;
                    }
                    while (true) {
                        int var11 = this.method1190(arg0, var9, var6, var10, var4.field334[this.field2378 - 1]);
                        if (this.field2373 < var6) {
                            return;
                        }
                        this.field2373 = var6 + var6 - 1 - this.field2373;
                        this.field2383 = -this.field2383;
                        var9 = this.method1155(arg0, var11, var5, var10, var4.field334[this.field2381]);
                        if (this.field2373 >= var5) {
                            return;
                        }
                        this.field2373 = var5 + var5 - 1 - this.field2373;
                        this.field2383 = -this.field2383;
                    }
                } else if (this.field2383 < 0) {
                    while (true) {
                        var9 = this.method1155(arg0, var9, var5, var10, var4.field334[this.field2378 - 1]);
                        if (this.field2373 >= var5) {
                            return;
                        }
                        this.field2373 = var6 - 1 - (var6 - 1 - this.field2373) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method1190(arg0, var9, var6, var10, var4.field334[this.field2381]);
                        if (this.field2373 < var6) {
                            return;
                        }
                        this.field2373 = (this.field2373 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field2374 > 0) {
                    if (this.field2372) {
                        label130: {
                            if (this.field2383 < 0) {
                                var9 = this.method1155(arg0, arg1, var5, var10, var4.field334[this.field2381]);
                                if (this.field2373 >= var5) {
                                    return;
                                }
                                this.field2373 = var5 + var5 - 1 - this.field2373;
                                this.field2383 = -this.field2383;
                                if (--this.field2374 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method1190(arg0, var9, var6, var10, var4.field334[this.field2378 - 1]);
                                if (this.field2373 < var6) {
                                    return;
                                }
                                this.field2373 = var6 + var6 - 1 - this.field2373;
                                this.field2383 = -this.field2383;
                                if (--this.field2374 == 0) {
                                    break;
                                }
                                var9 = this.method1155(arg0, var9, var5, var10, var4.field334[this.field2381]);
                                if (this.field2373 >= var5) {
                                    return;
                                }
                                this.field2373 = var5 + var5 - 1 - this.field2373;
                                this.field2383 = -this.field2383;
                            } while (--this.field2374 != 0);
                        }
                    } else if (this.field2383 < 0) {
                        while (true) {
                            var9 = this.method1155(arg0, var9, var5, var10, var4.field334[this.field2378 - 1]);
                            if (this.field2373 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field2373) / var8;
                            if (var12 >= this.field2374) {
                                this.field2373 += this.field2374 * var8;
                                this.field2374 = 0;
                                break;
                            }
                            this.field2373 += var8 * var12;
                            this.field2374 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method1190(arg0, var9, var6, var10, var4.field334[this.field2381]);
                            if (this.field2373 < var6) {
                                return;
                            }
                            int var13 = (this.field2373 - var5) / var8;
                            if (var13 >= this.field2374) {
                                this.field2373 -= this.field2374 * var8;
                                this.field2374 = 0;
                                break;
                            }
                            this.field2373 -= var8 * var13;
                            this.field2374 -= var13;
                        }
                    }
                }
                if (this.field2383 < 0) {
                    this.method1155(arg0, var9, 0, var10, 0);
                    if (this.field2373 < 0) {
                        this.field2373 = -1;
                        this.method1163();
                        this.method2594((byte) -22);
                        return;
                    }
                } else {
                    this.method1190(arg0, var9, var7, var10, 0);
                    if (this.field2373 >= var7) {
                        this.field2373 = var7;
                        this.method1163();
                        this.method2594((byte) -22);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!en", name = "c", descriptor = "(II)I", line = 1386)
    private static final int method1187(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!en", name = "d", descriptor = "(II)I", line = 1389)
    private static final int method1188(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!en", name = "b", descriptor = "([B[IIIIIIIILen;)I", line = 1392)
    private static final int method1189(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class173 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field2371 += (var14 - arg3) * arg9.field2380;
        arg9.field2384 += (var14 - arg3) * arg9.field2385;
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
        arg9.field2377 = var12 >> 2;
        arg9.field2373 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!en", name = "b", descriptor = "([IIIII)I", line = 1426)
    private final int method1190(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field2375 <= 0) {
                if (this.field2383 == 256 && (this.field2373 & 255) == 0) {
                    if (class217.field3062) {
                        return method1158(0, ((class27) super.field4572).field334, arg0, this.field2373, arg1, this.field2371, this.field2384, 0, arg3, arg2, this);
                    }
                    return method1177(((class27) super.field4572).field334, arg0, this.field2373, arg1, this.field2377, 0, arg3, arg2, this);
                }
                if (class217.field3062) {
                    return method1171(0, 0, ((class27) super.field4572).field334, arg0, this.field2373, arg1, this.field2371, this.field2384, 0, arg3, arg2, this, this.field2383, arg4);
                }
                return method1151(0, 0, ((class27) super.field4572).field334, arg0, this.field2373, arg1, this.field2377, 0, arg3, arg2, this, this.field2383, arg4);
            }
            int var6 = this.field2375 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field2375 += arg1;
            if (this.field2383 == 256 && (this.field2373 & 255) == 0) {
                if (class217.field3062) {
                    arg1 = method1186(0, ((class27) super.field4572).field334, arg0, this.field2373, arg1, this.field2371, this.field2384, this.field2380, this.field2385, 0, var6, arg2, this);
                } else {
                    arg1 = method1160(((class27) super.field4572).field334, arg0, this.field2373, arg1, this.field2377, this.field2376, 0, var6, arg2, this);
                }
            } else if (class217.field3062) {
                arg1 = method1174(0, 0, ((class27) super.field4572).field334, arg0, this.field2373, arg1, this.field2371, this.field2384, this.field2380, this.field2385, 0, var6, arg2, this, this.field2383, arg4);
            } else {
                arg1 = method1184(0, 0, ((class27) super.field4572).field334, arg0, this.field2373, arg1, this.field2377, this.field2376, 0, var6, arg2, this, this.field2383, arg4);
            }
            this.field2375 -= arg1;
            if (this.field2375 != 0) {
                return arg1;
            }
        } while (!this.method1154());
        return arg3;
    }
}
