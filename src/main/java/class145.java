import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class145 extends class38 {

    @OriginalMember(owner = "client!di", name = "J", descriptor = "I")
    private int field2415;

    @OriginalMember(owner = "client!di", name = "I", descriptor = "I")
    private int field2414;

    @OriginalMember(owner = "client!di", name = "C", descriptor = "Z")
    private boolean field2408;

    @OriginalMember(owner = "client!di", name = "M", descriptor = "I")
    private int field2418;

    @OriginalMember(owner = "client!di", name = "O", descriptor = "I")
    private int field2420;

    @OriginalMember(owner = "client!di", name = "K", descriptor = "I")
    private int field2416;

    @OriginalMember(owner = "client!di", name = "G", descriptor = "I")
    private int field2412;

    @OriginalMember(owner = "client!di", name = "A", descriptor = "I")
    private int field2406;

    @OriginalMember(owner = "client!di", name = "B", descriptor = "I")
    private int field2407;

    @OriginalMember(owner = "client!di", name = "D", descriptor = "I")
    private int field2409;

    @OriginalMember(owner = "client!di", name = "E", descriptor = "I")
    private int field2410;

    @OriginalMember(owner = "client!di", name = "F", descriptor = "I")
    private int field2411;

    @OriginalMember(owner = "client!di", name = "H", descriptor = "I")
    private int field2413;

    @OriginalMember(owner = "client!di", name = "L", descriptor = "I")
    private int field2417;

    @OriginalMember(owner = "client!di", name = "N", descriptor = "I")
    private int field2419;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(II[B[IIIIIIIIIILdi;II)I", line = 3)
    private static final int method1061(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class145 arg13, int arg14, int arg15) {
        arg13.field2411 -= arg13.field2413 * arg5;
        int var16;
        if (arg14 == 0 || (var16 = (arg12 + arg14 + 256 - arg4) / arg14 + arg5) > arg11) {
            var16 = arg11;
        }
        int var17 = arg5 << 1;
        int var18 = var16 << 1;
        int var10001;
        while (var17 < var18) {
            int var19 = arg4 >> 8;
            byte var20 = arg2[var19 - 1];
            int var21 = (var20 << 8) + (arg4 & 0xFF) * (arg2[var19] - var20);
            var10001 = var17++;
            arg3[var10001] += arg6 * var21 >> 6;
            arg6 += arg8;
            int var27 = var17++;
            arg3[var27] += arg7 * var21 >> 6;
            arg7 += arg9;
            arg4 += arg14;
        }
        int var22;
        if (arg14 == 0 || (var22 = (var17 >> 1) + (arg12 + arg14 - arg4) / arg14) > arg11) {
            var22 = arg11;
        }
        int var23 = var22 << 1;
        int var24 = arg15;
        while (var17 < var23) {
            int var25 = (var24 << 8) + (arg4 & 0xFF) * (arg2[arg4 >> 8] - var24);
            var10001 = var17++;
            arg3[var10001] += arg6 * var25 >> 6;
            arg6 += arg8;
            var10001 = var17++;
            arg3[var10001] += arg7 * var25 >> 6;
            arg7 += arg9;
            arg4 += arg14;
        }
        int var26 = var17 >> 1;
        arg13.field2411 += arg13.field2413 * var26;
        arg13.field2419 = arg6;
        arg13.field2409 = arg7;
        arg13.field2412 = arg4;
        return var26;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "([IIIII)I", line = 44)
    private final int method1062(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field2407 > 0) {
                int var6 = this.field2407 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field2407 += arg1;
                if (this.field2418 == -256 && (this.field2412 & 0xFF) == 0) {
                    if (class292.field4890) {
                        arg1 = method1099(0, ((class64) this.field701).field1199, arg0, this.field2412, arg1, this.field2419, this.field2409, this.field2406, this.field2417, 0, var6, arg2, this);
                    } else {
                        arg1 = method1093(((class64) this.field701).field1199, arg0, this.field2412, arg1, this.field2411, this.field2413, 0, var6, arg2, this);
                    }
                } else if (class292.field4890) {
                    arg1 = method1061(0, 0, ((class64) this.field701).field1199, arg0, this.field2412, arg1, this.field2419, this.field2409, this.field2406, this.field2417, 0, var6, arg2, this, this.field2418, arg4);
                } else {
                    arg1 = method1064(0, 0, ((class64) this.field701).field1199, arg0, this.field2412, arg1, this.field2411, this.field2413, 0, var6, arg2, this, this.field2418, arg4);
                }
                this.field2407 -= arg1;
                if (this.field2407 != 0) {
                    return arg1;
                }
                if (!this.method1070()) {
                    continue;
                }
                return arg3;
            }
            if (this.field2418 == -256 && (this.field2412 & 0xFF) == 0) {
                if (class292.field4890) {
                    return method1080(0, ((class64) this.field701).field1199, arg0, this.field2412, arg1, this.field2419, this.field2409, 0, arg3, arg2, this);
                }
                return method1087(((class64) this.field701).field1199, arg0, this.field2412, arg1, this.field2411, 0, arg3, arg2, this);
            }
            if (class292.field4890) {
                return method1072(0, 0, ((class64) this.field701).field1199, arg0, this.field2412, arg1, this.field2419, this.field2409, 0, arg3, arg2, this, this.field2418, arg4);
            }
            return method1100(0, 0, ((class64) this.field701).field1199, arg0, this.field2412, arg1, this.field2411, 0, arg3, arg2, this, this.field2418, arg4);
        }
    }

    @OriginalMember(owner = "client!di", name = "e", descriptor = "(I)V", line = 100)
    public final synchronized void method1063(int arg0) {
        if (this.field2418 < 0) {
            this.field2418 = -arg0;
        } else {
            this.field2418 = arg0;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(II[B[IIIIIIIILdi;II)I", line = 107)
    private static final int method1064(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class145 arg11, int arg12, int arg13) {
        arg11.field2419 -= arg11.field2406 * arg5;
        arg11.field2409 -= arg11.field2417 * arg5;
        int var14;
        if (arg12 == 0 || (var14 = (arg10 + arg12 + 256 - arg4) / arg12 + arg5) > arg9) {
            var14 = arg9;
        }
        int var10001;
        while (arg5 < var14) {
            int var15 = arg4 >> 8;
            byte var16 = arg2[var15 - 1];
            var10001 = arg5++;
            arg3[var10001] += ((var16 << 8) + (arg4 & 0xFF) * (arg2[var15] - var16)) * arg6 >> 6;
            arg6 += arg7;
            arg4 += arg12;
        }
        int var17;
        if (arg12 == 0 || (var17 = (arg10 + arg12 - arg4) / arg12 + arg5) > arg9) {
            var17 = arg9;
        }
        int var18 = arg13;
        int var19 = arg12;
        while (arg5 < var17) {
            var10001 = arg5++;
            arg3[var10001] += ((var18 << 8) + (arg4 & 0xFF) * (arg2[arg4 >> 8] - var18)) * arg6 >> 6;
            arg6 += arg7;
            arg4 += var19;
        }
        arg11.field2419 += arg11.field2406 * arg5;
        arg11.field2409 += arg11.field2417 * arg5;
        arg11.field2411 = arg6;
        arg11.field2412 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(II)V", line = 141)
    public final synchronized void method1065(int arg0, int arg1) {
        this.method1083(arg0, arg1, this.method1073());
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "(II)I", line = 144)
    private static final int method1066(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!di", name = "f", descriptor = "(I)V", line = 151)
    public final synchronized void method1067(int arg0) {
        int var2 = ((class64) this.field701).field1199.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field2412 = arg0;
    }

    @OriginalMember(owner = "client!di", name = "e", descriptor = "()V", line = 161)
    private final void method1068() {
        this.field2411 = this.field2420;
        this.field2419 = method1066(this.field2420, this.field2416);
        this.field2409 = method1077(this.field2420, this.field2416);
    }

    @OriginalMember(owner = "client!di", name = "c", descriptor = "()Lcg;", line = 166)
    public final class38 method320() {
        return null;
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "()I", line = 170)
    public final int method318() {
        int var1 = this.field2411 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field2410 == 0) {
            var2 -= this.field2412 * var2 / (((class64) this.field701).field1199.length << 8);
        } else if (this.field2410 >= 0) {
            var2 -= this.field2415 * var2 / ((class64) this.field701).field1199.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Lcd;II)Ldi;", line = 182)
    public static final class145 method1069(class64 arg0, int arg1, int arg2) {
        return arg0.field1199 == null || arg0.field1199.length == 0 ? null : new class145(arg0, (int) ((long) arg0.field1201 * 256L * (long) arg1 / (long) (class25.field448 * 100)), arg2 << 6);
    }

    @OriginalMember(owner = "client!di", name = "f", descriptor = "()Z", line = 190)
    private final boolean method1070() {
        int var1 = this.field2420;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1066(var1, this.field2416);
            var2 = method1077(var1, this.field2416);
        }
        if (this.field2411 != var1 || this.field2419 != var3 || this.field2409 != var2) {
            if (this.field2411 < var1) {
                this.field2413 = 1;
                this.field2407 = var1 - this.field2411;
            } else if (this.field2411 > var1) {
                this.field2413 = -1;
                this.field2407 = this.field2411 - var1;
            } else {
                this.field2413 = 0;
            }
            if (this.field2419 < var3) {
                this.field2406 = 1;
                if (this.field2407 == 0 || this.field2407 > var3 - this.field2419) {
                    this.field2407 = var3 - this.field2419;
                }
            } else if (this.field2419 > var3) {
                this.field2406 = -1;
                if (this.field2407 == 0 || this.field2407 > this.field2419 - var3) {
                    this.field2407 = this.field2419 - var3;
                }
            } else {
                this.field2406 = 0;
            }
            if (this.field2409 < var2) {
                this.field2417 = 1;
                if (this.field2407 == 0 || this.field2407 > var2 - this.field2409) {
                    this.field2407 = var2 - this.field2409;
                }
            } else if (this.field2409 > var2) {
                this.field2417 = -1;
                if (this.field2407 == 0 || this.field2407 > this.field2409 - var2) {
                    this.field2407 = this.field2409 - var2;
                }
            } else {
                this.field2417 = 0;
            }
            return false;
        } else if (this.field2420 == Integer.MIN_VALUE) {
            this.field2420 = 0;
            this.field2411 = this.field2419 = this.field2409 = 0;
            this.method2095(0);
            return true;
        } else {
            this.method1068();
            return false;
        }
    }

    @OriginalMember(owner = "client!di", name = "g", descriptor = "()Z", line = 275)
    public final boolean method1071() {
        return this.field2412 < 0 || this.field2412 >= ((class64) this.field701).field1199.length << 8;
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "(II[B[IIIIIIIILdi;II)I", line = 281)
    private static final int method1072(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class145 arg11, int arg12, int arg13) {
        int var14;
        if (arg12 == 0 || (var14 = (arg10 + arg12 + 256 - arg4) / arg12 + arg5) > arg9) {
            var14 = arg9;
        }
        int var15 = arg5 << 1;
        int var16 = var14 << 1;
        int var10001;
        while (var15 < var16) {
            int var17 = arg4 >> 8;
            byte var18 = arg2[var17 - 1];
            int var19 = (var18 << 8) + (arg4 & 0xFF) * (arg2[var17] - var18);
            var10001 = var15++;
            arg3[var10001] += arg6 * var19 >> 6;
            int var24 = var15++;
            arg3[var24] += arg7 * var19 >> 6;
            arg4 += arg12;
        }
        int var20;
        if (arg12 == 0 || (var20 = (var15 >> 1) + (arg10 + arg12 - arg4) / arg12) > arg9) {
            var20 = arg9;
        }
        int var21 = var20 << 1;
        int var22 = arg13;
        while (var15 < var21) {
            int var23 = (var22 << 8) + (arg4 & 0xFF) * (arg2[arg4 >> 8] - var22);
            var10001 = var15++;
            arg3[var10001] += arg6 * var23 >> 6;
            var10001 = var15++;
            arg3[var10001] += arg7 * var23 >> 6;
            arg4 += arg12;
        }
        arg11.field2412 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!di", name = "h", descriptor = "()I", line = 314)
    public final synchronized int method1073() {
        return this.field2416 < 0 ? -1 : this.field2416;
    }

    @OriginalMember(owner = "client!di", name = "c", descriptor = "(II[B[IIIIIIIILdi;II)I", line = 317)
    private static final int method1074(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class145 arg11, int arg12, int arg13) {
        arg11.field2419 -= arg11.field2406 * arg5;
        arg11.field2409 -= arg11.field2417 * arg5;
        int var14;
        if (arg12 == 0 || (var14 = (arg10 + arg12 - arg4 - 257) / arg12 + arg5) > arg9) {
            var14 = arg9;
        }
        int var10001;
        while (arg5 < var14) {
            int var15 = arg4 >> 8;
            byte var16 = arg2[var15];
            var10001 = arg5++;
            arg3[var10001] += ((var16 << 8) + (arg4 & 0xFF) * (arg2[var15 + 1] - var16)) * arg6 >> 6;
            arg6 += arg7;
            arg4 += arg12;
        }
        int var17;
        if (arg12 == 0 || (var17 = (arg10 + arg12 - arg4 - 1) / arg12 + arg5) > arg9) {
            var17 = arg9;
        }
        int var18 = arg13;
        while (arg5 < var17) {
            byte var19 = arg2[arg4 >> 8];
            var10001 = arg5++;
            arg3[var10001] += ((var19 << 8) + (arg4 & 0xFF) * (var18 - var19)) * arg6 >> 6;
            arg6 += arg7;
            arg4 += arg12;
        }
        arg11.field2419 += arg11.field2406 * arg5;
        arg11.field2409 += arg11.field2417 * arg5;
        arg11.field2411 = arg6;
        arg11.field2412 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "([B[IIIIIIIILdi;)I", line = 350)
    private static final int method1075(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class145 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field2419 += (var14 - arg3) * arg9.field2406;
        arg9.field2409 += (var14 - arg3) * arg9.field2417;
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
        arg9.field2411 = var12 >> 2;
        arg9.field2412 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!di", name = "i", descriptor = "()V", line = 387)
    private final void method1076() {
        if (this.field2407 == 0) {
            return;
        }
        if (this.field2420 == Integer.MIN_VALUE) {
            this.field2420 = 0;
        }
        this.field2407 = 0;
        this.method1068();
    }

    @OriginalMember(owner = "client!di", name = "c", descriptor = "(II)I", line = 399)
    private static final int method1077(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!di", name = "d", descriptor = "()I", line = 403)
    public final int method321() {
        return this.field2420 == 0 && this.field2407 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!di", name = "j", descriptor = "()I", line = 412)
    public final synchronized int method1078() {
        return this.field2418 < 0 ? -this.field2418 : this.field2418;
    }

    @OriginalMember(owner = "client!di", name = "d", descriptor = "(II)V", line = 415)
    private final synchronized void method1079(int arg0, int arg1) {
        this.field2420 = arg0;
        this.field2416 = arg1;
        this.field2407 = 0;
        this.method1068();
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(I[B[IIIIIIIILdi;)I", line = 421)
    private static final int method1080(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class145 arg10) {
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
            byte var18 = arg1[var11--];
            int var24 = var16++;
            arg2[var24] += var13 * var18;
            int var25 = var16++;
            arg2[var25] += var14 * var18;
            byte var19 = arg1[var11--];
            int var27 = var16++;
            arg2[var27] += var13 * var19;
            int var28 = var16++;
            arg2[var28] += var14 * var19;
            byte var20 = arg1[var11--];
            int var30 = var16++;
            arg2[var30] += var13 * var20;
            int var31 = var16++;
            arg2[var31] += var14 * var20;
            byte var21 = arg1[var11--];
            int var33 = var16++;
            arg2[var33] += var13 * var21;
            int var34 = var16++;
            arg2[var34] += var14 * var21;
        }
        var17 = var23 + 6;
        while (var16 < var17) {
            byte var22 = arg1[var11--];
            int var10001 = var16++;
            arg2[var10001] += var13 * var22;
            int var35 = var16++;
            arg2[var35] += var14 * var22;
        }
        arg10.field2412 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "(I[B[IIIIIIIILdi;)I", line = 459)
    private static final int method1081(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class145 arg10) {
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
            byte var18 = arg1[var11++];
            int var24 = var16++;
            arg2[var24] += var13 * var18;
            int var25 = var16++;
            arg2[var25] += var14 * var18;
            byte var19 = arg1[var11++];
            int var27 = var16++;
            arg2[var27] += var13 * var19;
            int var28 = var16++;
            arg2[var28] += var14 * var19;
            byte var20 = arg1[var11++];
            int var30 = var16++;
            arg2[var30] += var13 * var20;
            int var31 = var16++;
            arg2[var31] += var14 * var20;
            byte var21 = arg1[var11++];
            int var33 = var16++;
            arg2[var33] += var13 * var21;
            int var34 = var16++;
            arg2[var34] += var14 * var21;
        }
        var17 = var23 + 6;
        while (var16 < var17) {
            byte var22 = arg1[var11++];
            int var10001 = var16++;
            arg2[var10001] += var13 * var22;
            int var35 = var16++;
            arg2[var35] += var14 * var22;
        }
        arg10.field2412 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(I[B[IIIIIIIIIILdi;)I", line = 498)
    private static final int method1082(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class145 arg12) {
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
        arg12.field2411 += (var19 - arg4) * arg12.field2413;
        int var20 = arg4 << 1;
        int var21 = var19 << 1;
        int var44 = var21 - 6;
        while (var20 < var44) {
            byte var22 = arg1[var13++];
            int var33 = var20++;
            arg2[var33] += var15 * var22;
            int var23 = var15 + var17;
            int var34 = var20++;
            arg2[var34] += var16 * var22;
            int var24 = var16 + var18;
            byte var25 = arg1[var13++];
            int var36 = var20++;
            arg2[var36] += var23 * var25;
            int var26 = var17 + var23;
            int var37 = var20++;
            arg2[var37] += var24 * var25;
            int var27 = var18 + var24;
            byte var28 = arg1[var13++];
            int var39 = var20++;
            arg2[var39] += var26 * var28;
            int var29 = var17 + var26;
            int var40 = var20++;
            arg2[var40] += var27 * var28;
            int var30 = var18 + var27;
            byte var31 = arg1[var13++];
            int var42 = var20++;
            arg2[var42] += var29 * var31;
            var15 = var17 + var29;
            int var43 = var20++;
            arg2[var43] += var30 * var31;
            var16 = var18 + var30;
        }
        var21 = var44 + 6;
        while (var20 < var21) {
            byte var32 = arg1[var13++];
            int var10001 = var20++;
            arg2[var10001] += var15 * var32;
            var15 += var17;
            int var45 = var20++;
            arg2[var45] += var16 * var32;
            var16 += var18;
        }
        arg12.field2419 = var15 >> 2;
        arg12.field2409 = var16 >> 2;
        arg12.field2412 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(III)V", line = 551)
    public final synchronized void method1083(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1079(arg1, arg2);
            return;
        }
        int var4 = method1066(arg1, arg2);
        int var5 = method1077(arg1, arg2);
        if (this.field2419 == var4 && this.field2409 == var5) {
            this.field2407 = 0;
            return;
        }
        int var6 = arg1 - this.field2411;
        if (this.field2411 - arg1 > var6) {
            var6 = this.field2411 - arg1;
        }
        if (var4 - this.field2419 > var6) {
            var6 = var4 - this.field2419;
        }
        if (this.field2419 - var4 > var6) {
            var6 = this.field2419 - var4;
        }
        if (var5 - this.field2409 > var6) {
            var6 = var5 - this.field2409;
        }
        if (this.field2409 - var5 > var6) {
            var6 = this.field2409 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field2407 = arg0;
        this.field2420 = arg1;
        this.field2416 = arg2;
        this.field2413 = (arg1 - this.field2411) / arg0;
        this.field2406 = (var4 - this.field2419) / arg0;
        this.field2417 = (var5 - this.field2409) / arg0;
    }

    @OriginalMember(owner = "client!di", name = "k", descriptor = "()Z", line = 597)
    public final boolean method1084() {
        return this.field2407 != 0;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Lcd;III)Ldi;", line = 600)
    public static final class145 method1085(class64 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1199 == null || arg0.field1199.length == 0 ? null : new class145(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "([IIIII)I", line = 606)
    private final int method1086(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field2407 > 0) {
                int var6 = this.field2407 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field2407 += arg1;
                if (this.field2418 == 256 && (this.field2412 & 0xFF) == 0) {
                    if (class292.field4890) {
                        arg1 = method1082(0, ((class64) this.field701).field1199, arg0, this.field2412, arg1, this.field2419, this.field2409, this.field2406, this.field2417, 0, var6, arg2, this);
                    } else {
                        arg1 = method1075(((class64) this.field701).field1199, arg0, this.field2412, arg1, this.field2411, this.field2413, 0, var6, arg2, this);
                    }
                } else if (class292.field4890) {
                    arg1 = method1098(0, 0, ((class64) this.field701).field1199, arg0, this.field2412, arg1, this.field2419, this.field2409, this.field2406, this.field2417, 0, var6, arg2, this, this.field2418, arg4);
                } else {
                    arg1 = method1074(0, 0, ((class64) this.field701).field1199, arg0, this.field2412, arg1, this.field2411, this.field2413, 0, var6, arg2, this, this.field2418, arg4);
                }
                this.field2407 -= arg1;
                if (this.field2407 != 0) {
                    return arg1;
                }
                if (!this.method1070()) {
                    continue;
                }
                return arg3;
            }
            if (this.field2418 == 256 && (this.field2412 & 0xFF) == 0) {
                if (class292.field4890) {
                    return method1081(0, ((class64) this.field701).field1199, arg0, this.field2412, arg1, this.field2419, this.field2409, 0, arg3, arg2, this);
                }
                return method1096(((class64) this.field701).field1199, arg0, this.field2412, arg1, this.field2411, 0, arg3, arg2, this);
            }
            if (class292.field4890) {
                return method1097(0, 0, ((class64) this.field701).field1199, arg0, this.field2412, arg1, this.field2419, this.field2409, 0, arg3, arg2, this, this.field2418, arg4);
            }
            return method1088(0, 0, ((class64) this.field701).field1199, arg0, this.field2412, arg1, this.field2411, 0, arg3, arg2, this, this.field2418, arg4);
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "([B[IIIIIIILdi;)I", line = 661)
    private static final int method1087(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class145 arg8) {
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
        arg8.field2412 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "()Lcg;", line = 687)
    public final class38 method317() {
        return null;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(II[B[IIIIIIILdi;II)I", line = 690)
    private static final int method1088(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class145 arg10, int arg11, int arg12) {
        int var13;
        if (arg11 == 0 || (var13 = (arg9 + arg11 - arg4 - 257) / arg11 + arg5) > arg8) {
            var13 = arg8;
        }
        int var10001;
        while (arg5 < var13) {
            int var14 = arg4 >> 8;
            byte var15 = arg2[var14];
            var10001 = arg5++;
            arg3[var10001] += ((var15 << 8) + (arg4 & 0xFF) * (arg2[var14 + 1] - var15)) * arg6 >> 6;
            arg4 += arg11;
        }
        int var16;
        if (arg11 == 0 || (var16 = (arg9 + arg11 - arg4 - 1) / arg11 + arg5) > arg8) {
            var16 = arg8;
        }
        int var17 = arg12;
        while (arg5 < var16) {
            byte var18 = arg2[arg4 >> 8];
            var10001 = arg5++;
            arg3[var10001] += ((var18 << 8) + (arg4 & 0xFF) * (var17 - var18)) * arg6 >> 6;
            arg4 += arg11;
        }
        arg10.field2412 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!di", name = "l", descriptor = "()I", line = 716)
    public final synchronized int method1089() {
        return this.field2420 == Integer.MIN_VALUE ? 0 : this.field2420;
    }

    @OriginalMember(owner = "client!di", name = "g", descriptor = "(I)V", line = 719)
    public final synchronized void method1090(int arg0) {
        this.field2410 = arg0;
    }

    @OriginalMember(owner = "client!di", name = "h", descriptor = "(I)V", line = 722)
    public final synchronized void method1091(int arg0) {
        if (arg0 == 0) {
            this.method1095(0);
            this.method2095(0);
        } else if (this.field2419 == 0 && this.field2409 == 0) {
            this.field2407 = 0;
            this.field2420 = 0;
            this.field2411 = 0;
            this.method2095(0);
        } else {
            int var2 = -this.field2411;
            if (this.field2411 > var2) {
                var2 = this.field2411;
            }
            if (-this.field2419 > var2) {
                var2 = -this.field2419;
            }
            if (this.field2419 > var2) {
                var2 = this.field2419;
            }
            if (-this.field2409 > var2) {
                var2 = -this.field2409;
            }
            if (this.field2409 > var2) {
                var2 = this.field2409;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field2407 = arg0;
            this.field2420 = Integer.MIN_VALUE;
            this.field2413 = -this.field2411 / arg0;
            this.field2406 = -this.field2419 / arg0;
            this.field2417 = -this.field2409 / arg0;
        }
    }

    @OriginalMember(owner = "client!di", name = "i", descriptor = "(I)V", line = 768)
    public final synchronized void method1092(int arg0) {
        this.method1079(arg0 << 6, this.method1073());
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "([B[IIIIIIIILdi;)I", line = 776)
    private static final int method1093(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class145 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field2419 += (var14 - arg3) * arg9.field2406;
        arg9.field2409 += (var14 - arg3) * arg9.field2417;
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
        arg9.field2411 = var12 >> 2;
        arg9.field2412 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Z)V", line = 810)
    public final synchronized void method1094(boolean arg0) {
        this.field2418 = (this.field2418 >>> 31) + (this.field2418 ^ this.field2418 >> 31);
        if (arg0) {
            this.field2418 = -this.field2418;
        }
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "([III)V", line = 816)
    public final synchronized void method319(int[] arg0, int arg1, int arg2) {
        if (this.field2420 == 0 && this.field2407 == 0) {
            this.method316(arg2);
            return;
        }
        class64 var4 = (class64) this.field701;
        int var5 = this.field2415 << 8;
        int var6 = this.field2414 << 8;
        int var7 = var4.field1199.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field2410 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field2412 < 0) {
            if (this.field2418 <= 0) {
                this.method1076();
                this.method2095(0);
                return;
            }
            this.field2412 = 0;
        }
        if (this.field2412 >= var7) {
            if (this.field2418 >= 0) {
                this.method1076();
                this.method2095(0);
                return;
            }
            this.field2412 = var7 - 1;
        }
        if (this.field2410 >= 0) {
            if (this.field2410 > 0) {
                if (this.field2408) {
                    label131: {
                        if (this.field2418 < 0) {
                            var9 = this.method1062(arg0, arg1, var5, var10, var4.field1199[this.field2415]);
                            if (this.field2412 >= var5) {
                                return;
                            }
                            this.field2412 = var5 + var5 - this.field2412 - 1;
                            this.field2418 = -this.field2418;
                            if (--this.field2410 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method1086(arg0, var9, var6, var10, var4.field1199[this.field2414 - 1]);
                            if (this.field2412 < var6) {
                                return;
                            }
                            this.field2412 = var6 + var6 - this.field2412 - 1;
                            this.field2418 = -this.field2418;
                            if (--this.field2410 == 0) {
                                break;
                            }
                            var9 = this.method1062(arg0, var9, var5, var10, var4.field1199[this.field2415]);
                            if (this.field2412 >= var5) {
                                return;
                            }
                            this.field2412 = var5 + var5 - this.field2412 - 1;
                            this.field2418 = -this.field2418;
                        } while (--this.field2410 != 0);
                    }
                } else if (this.field2418 < 0) {
                    while (true) {
                        var9 = this.method1062(arg0, var9, var5, var10, var4.field1199[this.field2414 - 1]);
                        if (this.field2412 >= var5) {
                            return;
                        }
                        int var12 = (var6 - this.field2412 - 1) / var8;
                        if (var12 >= this.field2410) {
                            this.field2412 += this.field2410 * var8;
                            this.field2410 = 0;
                            break;
                        }
                        this.field2412 += var8 * var12;
                        this.field2410 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method1086(arg0, var9, var6, var10, var4.field1199[this.field2415]);
                        if (this.field2412 < var6) {
                            return;
                        }
                        int var13 = (this.field2412 - var5) / var8;
                        if (var13 >= this.field2410) {
                            this.field2412 -= this.field2410 * var8;
                            this.field2410 = 0;
                            break;
                        }
                        this.field2412 -= var8 * var13;
                        this.field2410 -= var13;
                    }
                }
            }
            if (this.field2418 < 0) {
                this.method1062(arg0, var9, 0, var10, 0);
                if (this.field2412 < 0) {
                    this.field2412 = -1;
                    this.method1076();
                    this.method2095(0);
                }
            } else {
                this.method1086(arg0, var9, var7, var10, 0);
                if (this.field2412 >= var7) {
                    this.field2412 = var7;
                    this.method1076();
                    this.method2095(0);
                }
            }
        } else if (this.field2408) {
            if (this.field2418 < 0) {
                var9 = this.method1062(arg0, arg1, var5, var10, var4.field1199[this.field2415]);
                if (this.field2412 >= var5) {
                    return;
                }
                this.field2412 = var5 + var5 - this.field2412 - 1;
                this.field2418 = -this.field2418;
            }
            while (true) {
                int var11 = this.method1086(arg0, var9, var6, var10, var4.field1199[this.field2414 - 1]);
                if (this.field2412 < var6) {
                    return;
                }
                this.field2412 = var6 + var6 - this.field2412 - 1;
                this.field2418 = -this.field2418;
                var9 = this.method1062(arg0, var11, var5, var10, var4.field1199[this.field2415]);
                if (this.field2412 >= var5) {
                    return;
                }
                this.field2412 = var5 + var5 - this.field2412 - 1;
                this.field2418 = -this.field2418;
            }
        } else if (this.field2418 < 0) {
            while (true) {
                var9 = this.method1062(arg0, var9, var5, var10, var4.field1199[this.field2414 - 1]);
                if (this.field2412 >= var5) {
                    return;
                }
                this.field2412 = var6 - (var6 - 1 - this.field2412) % var8 - 1;
            }
        } else {
            while (true) {
                var9 = this.method1086(arg0, var9, var6, var10, var4.field1199[this.field2415]);
                if (this.field2412 < var6) {
                    return;
                }
                this.field2412 = (this.field2412 - var5) % var8 + var5;
            }
        }
    }

    @OriginalMember(owner = "client!di", name = "j", descriptor = "(I)V", line = 1051)
    private final synchronized void method1095(int arg0) {
        this.method1079(arg0, this.method1073());
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "([B[IIIIIIILdi;)I", line = 1055)
    private static final int method1096(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class145 arg8) {
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
        arg8.field2412 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!di", name = "d", descriptor = "(II[B[IIIIIIIILdi;II)I", line = 1081)
    private static final int method1097(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class145 arg11, int arg12, int arg13) {
        int var14;
        if (arg12 == 0 || (var14 = (arg10 + arg12 - arg4 - 257) / arg12 + arg5) > arg9) {
            var14 = arg9;
        }
        int var15 = arg5 << 1;
        int var16 = var14 << 1;
        int var10001;
        while (var15 < var16) {
            int var17 = arg4 >> 8;
            byte var18 = arg2[var17];
            int var19 = (var18 << 8) + (arg4 & 0xFF) * (arg2[var17 + 1] - var18);
            var10001 = var15++;
            arg3[var10001] += arg6 * var19 >> 6;
            int var25 = var15++;
            arg3[var25] += arg7 * var19 >> 6;
            arg4 += arg12;
        }
        int var20;
        if (arg12 == 0 || (var20 = (var15 >> 1) + (arg10 + arg12 - arg4 - 1) / arg12) > arg9) {
            var20 = arg9;
        }
        int var21 = var20 << 1;
        int var22 = arg13;
        while (var15 < var21) {
            byte var23 = arg2[arg4 >> 8];
            int var24 = (var23 << 8) + (arg4 & 0xFF) * (var22 - var23);
            var10001 = var15++;
            arg3[var10001] += arg6 * var24 >> 6;
            var10001 = var15++;
            arg3[var10001] += arg7 * var24 >> 6;
            arg4 += arg12;
        }
        arg11.field2412 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "(II[B[IIIIIIIIIILdi;II)I", line = 1114)
    private static final int method1098(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class145 arg13, int arg14, int arg15) {
        arg13.field2411 -= arg13.field2413 * arg5;
        int var16;
        if (arg14 == 0 || (var16 = (arg12 + arg14 - arg4 - 257) / arg14 + arg5) > arg11) {
            var16 = arg11;
        }
        int var17 = arg5 << 1;
        int var18 = var16 << 1;
        int var10001;
        while (var17 < var18) {
            int var19 = arg4 >> 8;
            byte var20 = arg2[var19];
            int var21 = (var20 << 8) + (arg4 & 0xFF) * (arg2[var19 + 1] - var20);
            var10001 = var17++;
            arg3[var10001] += arg6 * var21 >> 6;
            arg6 += arg8;
            int var28 = var17++;
            arg3[var28] += arg7 * var21 >> 6;
            arg7 += arg9;
            arg4 += arg14;
        }
        int var22;
        if (arg14 == 0 || (var22 = (var17 >> 1) + (arg12 + arg14 - arg4 - 1) / arg14) > arg11) {
            var22 = arg11;
        }
        int var23 = var22 << 1;
        int var24 = arg15;
        while (var17 < var23) {
            byte var25 = arg2[arg4 >> 8];
            int var26 = (var25 << 8) + (arg4 & 0xFF) * (var24 - var25);
            var10001 = var17++;
            arg3[var10001] += arg6 * var26 >> 6;
            arg6 += arg8;
            var10001 = var17++;
            arg3[var10001] += arg7 * var26 >> 6;
            arg7 += arg9;
            arg4 += arg14;
        }
        int var27 = var17 >> 1;
        arg13.field2411 += arg13.field2413 * var27;
        arg13.field2419 = arg6;
        arg13.field2409 = arg7;
        arg13.field2412 = arg4;
        return var27;
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "(I[B[IIIIIIIIIILdi;)I", line = 1159)
    private static final int method1099(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class145 arg12) {
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
        arg12.field2411 += (var19 - arg4) * arg12.field2413;
        int var20 = arg4 << 1;
        int var21 = var19 << 1;
        int var44 = var21 - 6;
        while (var20 < var44) {
            byte var22 = arg1[var13--];
            int var33 = var20++;
            arg2[var33] += var15 * var22;
            int var23 = var15 + var17;
            int var34 = var20++;
            arg2[var34] += var16 * var22;
            int var24 = var16 + var18;
            byte var25 = arg1[var13--];
            int var36 = var20++;
            arg2[var36] += var23 * var25;
            int var26 = var17 + var23;
            int var37 = var20++;
            arg2[var37] += var24 * var25;
            int var27 = var18 + var24;
            byte var28 = arg1[var13--];
            int var39 = var20++;
            arg2[var39] += var26 * var28;
            int var29 = var17 + var26;
            int var40 = var20++;
            arg2[var40] += var27 * var28;
            int var30 = var18 + var27;
            byte var31 = arg1[var13--];
            int var42 = var20++;
            arg2[var42] += var29 * var31;
            var15 = var17 + var29;
            int var43 = var20++;
            arg2[var43] += var30 * var31;
            var16 = var18 + var30;
        }
        var21 = var44 + 6;
        while (var20 < var21) {
            byte var32 = arg1[var13--];
            int var10001 = var20++;
            arg2[var10001] += var15 * var32;
            var15 += var17;
            int var45 = var20++;
            arg2[var45] += var16 * var32;
            var16 += var18;
        }
        arg12.field2419 = var15 >> 2;
        arg12.field2409 = var16 >> 2;
        arg12.field2412 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!di", name = "d", descriptor = "(I)V", line = 1212)
    public final synchronized void method316(int arg0) {
        if (this.field2407 > 0) {
            if (arg0 >= this.field2407) {
                if (this.field2420 == Integer.MIN_VALUE) {
                    this.field2420 = 0;
                    this.field2411 = this.field2419 = this.field2409 = 0;
                    this.method2095(0);
                    arg0 = this.field2407;
                }
                this.field2407 = 0;
                this.method1068();
            } else {
                this.field2411 += this.field2413 * arg0;
                this.field2419 += this.field2406 * arg0;
                this.field2409 += this.field2417 * arg0;
                this.field2407 -= arg0;
            }
        }
        class64 var2 = (class64) this.field701;
        int var3 = this.field2415 << 8;
        int var4 = this.field2414 << 8;
        int var5 = var2.field1199.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field2410 = 0;
        }
        if (this.field2412 < 0) {
            if (this.field2418 <= 0) {
                this.method1076();
                this.method2095(0);
                return;
            }
            this.field2412 = 0;
        }
        if (this.field2412 >= var5) {
            if (this.field2418 >= 0) {
                this.method1076();
                this.method2095(0);
                return;
            }
            this.field2412 = var5 - 1;
        }
        this.field2412 += this.field2418 * arg0;
        if (this.field2410 >= 0) {
            if (this.field2410 > 0) {
                if (this.field2408) {
                    label121: {
                        if (this.field2418 < 0) {
                            if (this.field2412 >= var3) {
                                return;
                            }
                            this.field2412 = var3 + var3 - this.field2412 - 1;
                            this.field2418 = -this.field2418;
                            if (--this.field2410 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field2412 < var4) {
                                return;
                            }
                            this.field2412 = var4 + var4 - this.field2412 - 1;
                            this.field2418 = -this.field2418;
                            if (--this.field2410 == 0) {
                                break;
                            }
                            if (this.field2412 >= var3) {
                                return;
                            }
                            this.field2412 = var3 + var3 - this.field2412 - 1;
                            this.field2418 = -this.field2418;
                        } while (--this.field2410 != 0);
                    }
                } else {
                    label153: {
                        if (this.field2418 < 0) {
                            if (this.field2412 >= var3) {
                                return;
                            }
                            int var7 = (var4 - this.field2412 - 1) / var6;
                            if (var7 >= this.field2410) {
                                this.field2412 += this.field2410 * var6;
                                this.field2410 = 0;
                                break label153;
                            }
                            this.field2412 += var6 * var7;
                            this.field2410 -= var7;
                        } else if (this.field2412 >= var4) {
                            int var8 = (this.field2412 - var3) / var6;
                            if (var8 >= this.field2410) {
                                this.field2412 -= this.field2410 * var6;
                                this.field2410 = 0;
                                break label153;
                            }
                            this.field2412 -= var6 * var8;
                            this.field2410 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field2418 < 0) {
                if (this.field2412 < 0) {
                    this.field2412 = -1;
                    this.method1076();
                    this.method2095(0);
                }
            } else if (this.field2412 >= var5) {
                this.field2412 = var5;
                this.method1076();
                this.method2095(0);
            }
        } else if (this.field2408) {
            if (this.field2418 < 0) {
                if (this.field2412 >= var3) {
                    return;
                }
                this.field2412 = var3 + var3 - this.field2412 - 1;
                this.field2418 = -this.field2418;
            }
            while (this.field2412 >= var4) {
                this.field2412 = var4 + var4 - this.field2412 - 1;
                this.field2418 = -this.field2418;
                if (this.field2412 >= var3) {
                    return;
                }
                this.field2412 = var3 + var3 - this.field2412 - 1;
                this.field2418 = -this.field2418;
            }
        } else if (this.field2418 < 0) {
            if (this.field2412 >= var3) {
                return;
            }
            this.field2412 = var4 - (var4 - 1 - this.field2412) % var6 - 1;
        } else if (this.field2412 >= var4) {
            this.field2412 = (this.field2412 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @OriginalMember(owner = "client!di", name = "<init>", descriptor = "(Lcd;II)V", line = 1432)
    private class145(class64 arg0, int arg1, int arg2) {
        this.field701 = arg0;
        this.field2415 = arg0.field1200;
        this.field2414 = arg0.field1202;
        this.field2408 = arg0.field1198;
        this.field2418 = arg1;
        this.field2420 = arg2;
        this.field2416 = 8192;
        this.field2412 = 0;
        this.method1068();
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "(II[B[IIIIIIILdi;II)I", line = 1444)
    private static final int method1100(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class145 arg10, int arg11, int arg12) {
        int var13;
        if (arg11 == 0 || (var13 = (arg9 + arg11 + 256 - arg4) / arg11 + arg5) > arg8) {
            var13 = arg8;
        }
        int var10001;
        while (arg5 < var13) {
            int var14 = arg4 >> 8;
            byte var15 = arg2[var14 - 1];
            var10001 = arg5++;
            arg3[var10001] += ((var15 << 8) + (arg4 & 0xFF) * (arg2[var14] - var15)) * arg6 >> 6;
            arg4 += arg11;
        }
        int var16;
        if (arg11 == 0 || (var16 = (arg9 + arg11 - arg4) / arg11 + arg5) > arg8) {
            var16 = arg8;
        }
        int var17 = arg12;
        int var18 = arg11;
        while (arg5 < var16) {
            var10001 = arg5++;
            arg3[var10001] += ((var17 << 8) + (arg4 & 0xFF) * (arg2[arg4 >> 8] - var17)) * arg6 >> 6;
            arg4 += var18;
        }
        arg10.field2412 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!di", name = "<init>", descriptor = "(Lcd;III)V", line = 1469)
    private class145(class64 arg0, int arg1, int arg2, int arg3) {
        this.field701 = arg0;
        this.field2415 = arg0.field1200;
        this.field2414 = arg0.field1202;
        this.field2408 = arg0.field1198;
        this.field2418 = arg1;
        this.field2420 = arg2;
        this.field2416 = arg3;
        this.field2412 = 0;
        this.method1068();
    }
}
