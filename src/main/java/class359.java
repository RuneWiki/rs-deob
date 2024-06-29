import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class359 extends class53 {

    @OriginalMember(owner = "client!rc", name = "s", descriptor = "I")
    private int field5682;

    @OriginalMember(owner = "client!rc", name = "r", descriptor = "I")
    private int field5681;

    @OriginalMember(owner = "client!rc", name = "C", descriptor = "Z")
    private boolean field5691;

    @OriginalMember(owner = "client!rc", name = "x", descriptor = "I")
    private int field5687;

    @OriginalMember(owner = "client!rc", name = "y", descriptor = "I")
    private int field5688;

    @OriginalMember(owner = "client!rc", name = "B", descriptor = "I")
    private int field5690;

    @OriginalMember(owner = "client!rc", name = "D", descriptor = "I")
    private int field5692;

    @OriginalMember(owner = "client!rc", name = "o", descriptor = "I")
    private int field5678;

    @OriginalMember(owner = "client!rc", name = "p", descriptor = "I")
    private int field5679;

    @OriginalMember(owner = "client!rc", name = "q", descriptor = "I")
    private int field5680;

    @OriginalMember(owner = "client!rc", name = "t", descriptor = "I")
    private int field5683;

    @OriginalMember(owner = "client!rc", name = "u", descriptor = "I")
    private int field5684;

    @OriginalMember(owner = "client!rc", name = "v", descriptor = "I")
    private int field5685;

    @OriginalMember(owner = "client!rc", name = "w", descriptor = "I")
    private int field5686;

    @OriginalMember(owner = "client!rc", name = "z", descriptor = "I")
    private int field5689;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "([B[IIIIIIIILrc;)I", line = 4)
    private static final int method2478(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class359 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field5685 += (var14 - arg3) * arg9.field5680;
        arg9.field5689 += (var14 - arg3) * arg9.field5683;
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
        arg9.field5684 = var12 >> 2;
        arg9.field5692 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "([IIIII)I", line = 42)
    private final int method2479(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field5686 > 0) {
                int var6 = this.field5686 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field5686 += arg1;
                if (this.field5687 == 256 && (this.field5692 & 0xFF) == 0) {
                    if (class349.field5573) {
                        arg1 = method2516(0, ((class37) this.field614).field425, arg0, this.field5692, arg1, this.field5685, this.field5689, this.field5680, this.field5683, 0, var6, arg2, this);
                    } else {
                        arg1 = method2478(((class37) this.field614).field425, arg0, this.field5692, arg1, this.field5684, this.field5679, 0, var6, arg2, this);
                    }
                } else if (class349.field5573) {
                    arg1 = method2512(0, 0, ((class37) this.field614).field425, arg0, this.field5692, arg1, this.field5685, this.field5689, this.field5680, this.field5683, 0, var6, arg2, this, this.field5687, arg4);
                } else {
                    arg1 = method2480(0, 0, ((class37) this.field614).field425, arg0, this.field5692, arg1, this.field5684, this.field5679, 0, var6, arg2, this, this.field5687, arg4);
                }
                this.field5686 -= arg1;
                if (this.field5686 != 0) {
                    return arg1;
                }
                if (!this.method2508()) {
                    continue;
                }
                return arg3;
            }
            if (this.field5687 == 256 && (this.field5692 & 0xFF) == 0) {
                if (class349.field5573) {
                    return method2499(0, ((class37) this.field614).field425, arg0, this.field5692, arg1, this.field5685, this.field5689, 0, arg3, arg2, this);
                }
                return method2494(((class37) this.field614).field425, arg0, this.field5692, arg1, this.field5684, 0, arg3, arg2, this);
            }
            if (class349.field5573) {
                return method2511(0, 0, ((class37) this.field614).field425, arg0, this.field5692, arg1, this.field5685, this.field5689, 0, arg3, arg2, this, this.field5687, arg4);
            }
            return method2498(0, 0, ((class37) this.field614).field425, arg0, this.field5692, arg1, this.field5684, 0, arg3, arg2, this, this.field5687, arg4);
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(II[B[IIIIIIIILrc;II)I", line = 100)
    private static final int method2480(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class359 arg11, int arg12, int arg13) {
        arg11.field5685 -= arg11.field5680 * arg5;
        arg11.field5689 -= arg11.field5683 * arg5;
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
        arg11.field5685 += arg11.field5680 * arg5;
        arg11.field5689 += arg11.field5683 * arg5;
        arg11.field5684 = arg6;
        arg11.field5692 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I[B[IIIIIIIILrc;)I", line = 135)
    private static final int method2481(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class359 arg10) {
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
        arg10.field5692 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "(I)V", line = 174)
    public final synchronized void method2482(int arg0) {
        int var2 = ((class37) this.field614).field425.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field5692 = arg0;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Z)V", line = 185)
    public final synchronized void method2483(boolean arg0) {
        this.field5687 = (this.field5687 >>> 31) + (this.field5687 ^ this.field5687 >> 31);
        if (arg0) {
            this.field5687 = -this.field5687;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(II)V", line = 192)
    private final synchronized void method2484(int arg0, int arg1) {
        this.field5688 = arg0;
        this.field5690 = arg1;
        this.field5686 = 0;
        this.method2503();
    }

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "()I", line = 198)
    public final synchronized int method2485() {
        return this.field5690 < 0 ? -1 : this.field5690;
    }

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "()I", line = 201)
    public final synchronized int method2486() {
        return this.field5687 < 0 ? -this.field5687 : this.field5687;
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(II)I", line = 204)
    private static final int method2487(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(III)V", line = 208)
    public final synchronized void method2488(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method2484(arg1, arg2);
            return;
        }
        int var4 = method2515(arg1, arg2);
        int var5 = method2487(arg1, arg2);
        if (this.field5685 == var4 && this.field5689 == var5) {
            this.field5686 = 0;
            return;
        }
        int var6 = arg1 - this.field5684;
        if (this.field5684 - arg1 > var6) {
            var6 = this.field5684 - arg1;
        }
        if (var4 - this.field5685 > var6) {
            var6 = var4 - this.field5685;
        }
        if (this.field5685 - var4 > var6) {
            var6 = this.field5685 - var4;
        }
        if (var5 - this.field5689 > var6) {
            var6 = var5 - this.field5689;
        }
        if (this.field5689 - var5 > var6) {
            var6 = this.field5689 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field5686 = arg0;
        this.field5688 = arg1;
        this.field5690 = arg2;
        this.field5679 = (arg1 - this.field5684) / arg0;
        this.field5680 = (var4 - this.field5685) / arg0;
        this.field5683 = (var5 - this.field5689) / arg0;
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(II[B[IIIIIIIILrc;II)I", line = 254)
    private static final int method2489(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class359 arg11, int arg12, int arg13) {
        arg11.field5685 -= arg11.field5680 * arg5;
        arg11.field5689 -= arg11.field5683 * arg5;
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
        arg11.field5685 += arg11.field5680 * arg5;
        arg11.field5689 += arg11.field5683 * arg5;
        arg11.field5684 = arg6;
        arg11.field5692 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "(II)V", line = 288)
    public final synchronized void method2490(int arg0, int arg1) {
        this.method2488(arg0, arg1, this.method2485());
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I[B[IIIIIIIIIILrc;)I", line = 291)
    private static final int method2491(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class359 arg12) {
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
        arg12.field5684 += (var19 - arg4) * arg12.field5679;
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
        arg12.field5685 = var15 >> 2;
        arg12.field5689 = var16 >> 2;
        arg12.field5692 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "()I", line = 345)
    public final int method320() {
        int var1 = this.field5684 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field5678 == 0) {
            var2 -= this.field5692 * var2 / (((class37) this.field614).field425.length << 8);
        } else if (this.field5678 >= 0) {
            var2 -= this.field5682 * var2 / ((class37) this.field614).field425.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "(I)V", line = 357)
    public final synchronized void method2492(int arg0) {
        if (this.field5687 < 0) {
            this.field5687 = -arg0;
        } else {
            this.field5687 = arg0;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(II[B[IIIIIIIIIILrc;II)I", line = 365)
    private static final int method2493(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class359 arg13, int arg14, int arg15) {
        arg13.field5684 -= arg13.field5679 * arg5;
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
        arg13.field5684 += arg13.field5679 * var26;
        arg13.field5685 = arg6;
        arg13.field5689 = arg7;
        arg13.field5692 = arg4;
        return var26;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "([B[IIIIIIILrc;)I", line = 407)
    private static final int method2494(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class359 arg8) {
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
        arg8.field5692 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "()V", line = 433)
    private final void method2495() {
        if (this.field5686 == 0) {
            return;
        }
        if (this.field5688 == Integer.MIN_VALUE) {
            this.field5688 = 0;
        }
        this.field5686 = 0;
        this.method2503();
    }

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "(II[B[IIIIIIIILrc;II)I", line = 444)
    private static final int method2496(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class359 arg11, int arg12, int arg13) {
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
        arg11.field5692 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "([B[IIIIIIILrc;)I", line = 477)
    private static final int method2497(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class359 arg8) {
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
        arg8.field5692 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(II[B[IIIIIIILrc;II)I", line = 502)
    private static final int method2498(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class359 arg10, int arg11, int arg12) {
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
        arg10.field5692 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(I[B[IIIIIIIILrc;)I", line = 529)
    private static final int method2499(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class359 arg10) {
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
        arg10.field5692 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "([III)V", line = 567)
    public final synchronized void method323(int[] arg0, int arg1, int arg2) {
        if (this.field5688 == 0 && this.field5686 == 0) {
            this.method318(arg2);
            return;
        }
        class37 var4 = (class37) this.field614;
        int var5 = this.field5682 << 8;
        int var6 = this.field5681 << 8;
        int var7 = var4.field425.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field5678 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field5692 < 0) {
            if (this.field5687 <= 0) {
                this.method2495();
                this.method1290(-17);
                return;
            }
            this.field5692 = 0;
        }
        if (this.field5692 >= var7) {
            if (this.field5687 >= 0) {
                this.method2495();
                this.method1290(5);
                return;
            }
            this.field5692 = var7 - 1;
        }
        if (this.field5678 >= 0) {
            if (this.field5678 > 0) {
                if (this.field5691) {
                    label131: {
                        if (this.field5687 < 0) {
                            var9 = this.method2509(arg0, arg1, var5, var10, var4.field425[this.field5682]);
                            if (this.field5692 >= var5) {
                                return;
                            }
                            this.field5692 = var5 + var5 - this.field5692 - 1;
                            this.field5687 = -this.field5687;
                            if (--this.field5678 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method2479(arg0, var9, var6, var10, var4.field425[this.field5681 - 1]);
                            if (this.field5692 < var6) {
                                return;
                            }
                            this.field5692 = var6 + var6 - this.field5692 - 1;
                            this.field5687 = -this.field5687;
                            if (--this.field5678 == 0) {
                                break;
                            }
                            var9 = this.method2509(arg0, var9, var5, var10, var4.field425[this.field5682]);
                            if (this.field5692 >= var5) {
                                return;
                            }
                            this.field5692 = var5 + var5 - this.field5692 - 1;
                            this.field5687 = -this.field5687;
                        } while (--this.field5678 != 0);
                    }
                } else if (this.field5687 < 0) {
                    while (true) {
                        var9 = this.method2509(arg0, var9, var5, var10, var4.field425[this.field5681 - 1]);
                        if (this.field5692 >= var5) {
                            return;
                        }
                        int var12 = (var6 - this.field5692 - 1) / var8;
                        if (var12 >= this.field5678) {
                            this.field5692 += this.field5678 * var8;
                            this.field5678 = 0;
                            break;
                        }
                        this.field5692 += var8 * var12;
                        this.field5678 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method2479(arg0, var9, var6, var10, var4.field425[this.field5682]);
                        if (this.field5692 < var6) {
                            return;
                        }
                        int var13 = (this.field5692 - var5) / var8;
                        if (var13 >= this.field5678) {
                            this.field5692 -= this.field5678 * var8;
                            this.field5678 = 0;
                            break;
                        }
                        this.field5692 -= var8 * var13;
                        this.field5678 -= var13;
                    }
                }
            }
            if (this.field5687 < 0) {
                this.method2509(arg0, var9, 0, var10, 0);
                if (this.field5692 < 0) {
                    this.field5692 = -1;
                    this.method2495();
                    this.method1290(93);
                }
            } else {
                this.method2479(arg0, var9, var7, var10, 0);
                if (this.field5692 >= var7) {
                    this.field5692 = var7;
                    this.method2495();
                    this.method1290(-30);
                }
            }
        } else if (this.field5691) {
            if (this.field5687 < 0) {
                var9 = this.method2509(arg0, arg1, var5, var10, var4.field425[this.field5682]);
                if (this.field5692 >= var5) {
                    return;
                }
                this.field5692 = var5 + var5 - this.field5692 - 1;
                this.field5687 = -this.field5687;
            }
            while (true) {
                int var11 = this.method2479(arg0, var9, var6, var10, var4.field425[this.field5681 - 1]);
                if (this.field5692 < var6) {
                    return;
                }
                this.field5692 = var6 + var6 - this.field5692 - 1;
                this.field5687 = -this.field5687;
                var9 = this.method2509(arg0, var11, var5, var10, var4.field425[this.field5682]);
                if (this.field5692 >= var5) {
                    return;
                }
                this.field5692 = var5 + var5 - this.field5692 - 1;
                this.field5687 = -this.field5687;
            }
        } else if (this.field5687 < 0) {
            while (true) {
                var9 = this.method2509(arg0, var9, var5, var10, var4.field425[this.field5681 - 1]);
                if (this.field5692 >= var5) {
                    return;
                }
                this.field5692 = var6 - (var6 - 1 - this.field5692) % var8 - 1;
            }
        } else {
            while (true) {
                var9 = this.method2479(arg0, var9, var6, var10, var4.field425[this.field5682]);
                if (this.field5692 < var6) {
                    return;
                }
                this.field5692 = (this.field5692 - var5) % var8 + var5;
            }
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "()Lqd;", line = 804)
    public final class53 method317() {
        return null;
    }

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "()I", line = 810)
    public final int method322() {
        return this.field5688 == 0 && this.field5686 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "(I)V", line = 818)
    public final synchronized void method2500(int arg0) {
        this.field5678 = arg0;
    }

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "(I)V", line = 821)
    public final synchronized void method2501(int arg0) {
        if (arg0 == 0) {
            this.method2514(0);
            this.method1290(112);
        } else if (this.field5685 == 0 && this.field5689 == 0) {
            this.field5686 = 0;
            this.field5688 = 0;
            this.field5684 = 0;
            this.method1290(111);
        } else {
            int var2 = -this.field5684;
            if (this.field5684 > var2) {
                var2 = this.field5684;
            }
            if (-this.field5685 > var2) {
                var2 = -this.field5685;
            }
            if (this.field5685 > var2) {
                var2 = this.field5685;
            }
            if (-this.field5689 > var2) {
                var2 = -this.field5689;
            }
            if (this.field5689 > var2) {
                var2 = this.field5689;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field5686 = arg0;
            this.field5688 = Integer.MIN_VALUE;
            this.field5679 = -this.field5684 / arg0;
            this.field5680 = -this.field5685 / arg0;
            this.field5683 = -this.field5689 / arg0;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lfn;III)Lrc;", line = 866)
    public static final class359 method2502(class37 arg0, int arg1, int arg2, int arg3) {
        return arg0.field425 == null || arg0.field425.length == 0 ? null : new class359(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!rc", name = "h", descriptor = "()V", line = 873)
    private final void method2503() {
        this.field5684 = this.field5688;
        this.field5685 = method2515(this.field5688, this.field5690);
        this.field5689 = method2487(this.field5688, this.field5690);
    }

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "()Lqd;", line = 878)
    public final class53 method321() {
        return null;
    }

    @OriginalMember(owner = "client!rc", name = "i", descriptor = "()Z", line = 881)
    public final boolean method2504() {
        return this.field5692 < 0 || this.field5692 >= ((class37) this.field614).field425.length << 8;
    }

    @OriginalMember(owner = "client!rc", name = "j", descriptor = "()I", line = 884)
    public final synchronized int method2505() {
        return this.field5688 == Integer.MIN_VALUE ? 0 : this.field5688;
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "([B[IIIIIIIILrc;)I", line = 888)
    private static final int method2506(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class359 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field5685 += (var14 - arg3) * arg9.field5680;
        arg9.field5689 += (var14 - arg3) * arg9.field5683;
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
        arg9.field5684 = var12 >> 2;
        arg9.field5692 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lfn;II)Lrc;", line = 924)
    public static final class359 method2507(class37 arg0, int arg1, int arg2) {
        return arg0.field425 == null || arg0.field425.length == 0 ? null : new class359(arg0, (int) ((long) arg0.field423 * 256L * (long) arg1 / (long) (class361.field5710 * 100)), arg2 << 6);
    }

    @OriginalMember(owner = "client!rc", name = "k", descriptor = "()Z", line = 931)
    private final boolean method2508() {
        int var1 = this.field5688;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method2515(var1, this.field5690);
            var2 = method2487(var1, this.field5690);
        }
        if (this.field5684 != var1 || this.field5685 != var3 || this.field5689 != var2) {
            if (this.field5684 < var1) {
                this.field5679 = 1;
                this.field5686 = var1 - this.field5684;
            } else if (this.field5684 > var1) {
                this.field5679 = -1;
                this.field5686 = this.field5684 - var1;
            } else {
                this.field5679 = 0;
            }
            if (this.field5685 < var3) {
                this.field5680 = 1;
                if (this.field5686 == 0 || this.field5686 > var3 - this.field5685) {
                    this.field5686 = var3 - this.field5685;
                }
            } else if (this.field5685 > var3) {
                this.field5680 = -1;
                if (this.field5686 == 0 || this.field5686 > this.field5685 - var3) {
                    this.field5686 = this.field5685 - var3;
                }
            } else {
                this.field5680 = 0;
            }
            if (this.field5689 < var2) {
                this.field5683 = 1;
                if (this.field5686 == 0 || this.field5686 > var2 - this.field5689) {
                    this.field5686 = var2 - this.field5689;
                }
            } else if (this.field5689 > var2) {
                this.field5683 = -1;
                if (this.field5686 == 0 || this.field5686 > this.field5689 - var2) {
                    this.field5686 = this.field5689 - var2;
                }
            } else {
                this.field5683 = 0;
            }
            return false;
        } else if (this.field5688 == Integer.MIN_VALUE) {
            this.field5688 = 0;
            this.field5684 = this.field5685 = this.field5689 = 0;
            this.method1290(108);
            return true;
        } else {
            this.method2503();
            return false;
        }
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "([IIIII)I", line = 1016)
    private final int method2509(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field5686 > 0) {
                int var6 = this.field5686 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field5686 += arg1;
                if (this.field5687 == -256 && (this.field5692 & 0xFF) == 0) {
                    if (class349.field5573) {
                        arg1 = method2491(0, ((class37) this.field614).field425, arg0, this.field5692, arg1, this.field5685, this.field5689, this.field5680, this.field5683, 0, var6, arg2, this);
                    } else {
                        arg1 = method2506(((class37) this.field614).field425, arg0, this.field5692, arg1, this.field5684, this.field5679, 0, var6, arg2, this);
                    }
                } else if (class349.field5573) {
                    arg1 = method2493(0, 0, ((class37) this.field614).field425, arg0, this.field5692, arg1, this.field5685, this.field5689, this.field5680, this.field5683, 0, var6, arg2, this, this.field5687, arg4);
                } else {
                    arg1 = method2489(0, 0, ((class37) this.field614).field425, arg0, this.field5692, arg1, this.field5684, this.field5679, 0, var6, arg2, this, this.field5687, arg4);
                }
                this.field5686 -= arg1;
                if (this.field5686 != 0) {
                    return arg1;
                }
                if (!this.method2508()) {
                    continue;
                }
                return arg3;
            }
            if (this.field5687 == -256 && (this.field5692 & 0xFF) == 0) {
                if (class349.field5573) {
                    return method2481(0, ((class37) this.field614).field425, arg0, this.field5692, arg1, this.field5685, this.field5689, 0, arg3, arg2, this);
                }
                return method2497(((class37) this.field614).field425, arg0, this.field5692, arg1, this.field5684, 0, arg3, arg2, this);
            }
            if (class349.field5573) {
                return method2496(0, 0, ((class37) this.field614).field425, arg0, this.field5692, arg1, this.field5685, this.field5689, 0, arg3, arg2, this, this.field5687, arg4);
            }
            return method2510(0, 0, ((class37) this.field614).field425, arg0, this.field5692, arg1, this.field5684, 0, arg3, arg2, this, this.field5687, arg4);
        }
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(II[B[IIIIIIILrc;II)I", line = 1072)
    private static final int method2510(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class359 arg10, int arg11, int arg12) {
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
        arg10.field5692 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "(II[B[IIIIIIIILrc;II)I", line = 1098)
    private static final int method2511(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class359 arg11, int arg12, int arg13) {
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
        arg11.field5692 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(II[B[IIIIIIIIIILrc;II)I", line = 1131)
    private static final int method2512(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class359 arg13, int arg14, int arg15) {
        arg13.field5684 -= arg13.field5679 * arg5;
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
        arg13.field5684 += arg13.field5679 * var27;
        arg13.field5685 = arg6;
        arg13.field5689 = arg7;
        arg13.field5692 = arg4;
        return var27;
    }

    @OriginalMember(owner = "client!rc", name = "l", descriptor = "()Z", line = 1173)
    public final boolean method2513() {
        return this.field5686 != 0;
    }

    @OriginalMember(owner = "client!rc", name = "h", descriptor = "(I)V", line = 1178)
    private final synchronized void method2514(int arg0) {
        this.method2484(arg0, this.method2485());
    }

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "(II)I", line = 1181)
    private static final int method2515(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(I[B[IIIIIIIIIILrc;)I", line = 1184)
    private static final int method2516(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class359 arg12) {
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
        arg12.field5684 += (var19 - arg4) * arg12.field5679;
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
        arg12.field5685 = var15 >> 2;
        arg12.field5689 = var16 >> 2;
        arg12.field5692 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!rc", name = "i", descriptor = "(I)V", line = 1238)
    public final synchronized void method2517(int arg0) {
        this.method2484(arg0 << 6, this.method2485());
    }

    @OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(Lfn;II)V", line = 1240)
    private class359(class37 arg0, int arg1, int arg2) {
        this.field614 = arg0;
        this.field5682 = arg0.field426;
        this.field5681 = arg0.field424;
        this.field5691 = arg0.field427;
        this.field5687 = arg1;
        this.field5688 = arg2;
        this.field5690 = 8192;
        this.field5692 = 0;
        this.method2503();
    }

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "(I)V", line = 1252)
    public final synchronized void method318(int arg0) {
        if (this.field5686 > 0) {
            if (arg0 >= this.field5686) {
                if (this.field5688 == Integer.MIN_VALUE) {
                    this.field5688 = 0;
                    this.field5684 = this.field5685 = this.field5689 = 0;
                    this.method1290(-45);
                    arg0 = this.field5686;
                }
                this.field5686 = 0;
                this.method2503();
            } else {
                this.field5684 += this.field5679 * arg0;
                this.field5685 += this.field5680 * arg0;
                this.field5689 += this.field5683 * arg0;
                this.field5686 -= arg0;
            }
        }
        class37 var2 = (class37) this.field614;
        int var3 = this.field5682 << 8;
        int var4 = this.field5681 << 8;
        int var5 = var2.field425.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field5678 = 0;
        }
        if (this.field5692 < 0) {
            if (this.field5687 <= 0) {
                this.method2495();
                this.method1290(1);
                return;
            }
            this.field5692 = 0;
        }
        if (this.field5692 >= var5) {
            if (this.field5687 >= 0) {
                this.method2495();
                this.method1290(-27);
                return;
            }
            this.field5692 = var5 - 1;
        }
        this.field5692 += this.field5687 * arg0;
        if (this.field5678 >= 0) {
            if (this.field5678 > 0) {
                if (this.field5691) {
                    label121: {
                        if (this.field5687 < 0) {
                            if (this.field5692 >= var3) {
                                return;
                            }
                            this.field5692 = var3 + var3 - this.field5692 - 1;
                            this.field5687 = -this.field5687;
                            if (--this.field5678 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field5692 < var4) {
                                return;
                            }
                            this.field5692 = var4 + var4 - this.field5692 - 1;
                            this.field5687 = -this.field5687;
                            if (--this.field5678 == 0) {
                                break;
                            }
                            if (this.field5692 >= var3) {
                                return;
                            }
                            this.field5692 = var3 + var3 - this.field5692 - 1;
                            this.field5687 = -this.field5687;
                        } while (--this.field5678 != 0);
                    }
                } else {
                    label153: {
                        if (this.field5687 < 0) {
                            if (this.field5692 >= var3) {
                                return;
                            }
                            int var7 = (var4 - this.field5692 - 1) / var6;
                            if (var7 >= this.field5678) {
                                this.field5692 += this.field5678 * var6;
                                this.field5678 = 0;
                                break label153;
                            }
                            this.field5692 += var6 * var7;
                            this.field5678 -= var7;
                        } else if (this.field5692 >= var4) {
                            int var8 = (this.field5692 - var3) / var6;
                            if (var8 >= this.field5678) {
                                this.field5692 -= this.field5678 * var6;
                                this.field5678 = 0;
                                break label153;
                            }
                            this.field5692 -= var6 * var8;
                            this.field5678 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field5687 < 0) {
                if (this.field5692 < 0) {
                    this.field5692 = -1;
                    this.method2495();
                    this.method1290(98);
                }
            } else if (this.field5692 >= var5) {
                this.field5692 = var5;
                this.method2495();
                this.method1290(-34);
            }
        } else if (this.field5691) {
            if (this.field5687 < 0) {
                if (this.field5692 >= var3) {
                    return;
                }
                this.field5692 = var3 + var3 - this.field5692 - 1;
                this.field5687 = -this.field5687;
            }
            while (this.field5692 >= var4) {
                this.field5692 = var4 + var4 - this.field5692 - 1;
                this.field5687 = -this.field5687;
                if (this.field5692 >= var3) {
                    return;
                }
                this.field5692 = var3 + var3 - this.field5692 - 1;
                this.field5687 = -this.field5687;
            }
        } else if (this.field5687 < 0) {
            if (this.field5692 >= var3) {
                return;
            }
            this.field5692 = var4 - (var4 - 1 - this.field5692) % var6 - 1;
        } else if (this.field5692 >= var4) {
            this.field5692 = (this.field5692 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(Lfn;III)V", line = 1469)
    private class359(class37 arg0, int arg1, int arg2, int arg3) {
        this.field614 = arg0;
        this.field5682 = arg0.field426;
        this.field5681 = arg0.field424;
        this.field5691 = arg0.field427;
        this.field5687 = arg1;
        this.field5688 = arg2;
        this.field5690 = arg3;
        this.field5692 = 0;
        this.method2503();
    }
}
