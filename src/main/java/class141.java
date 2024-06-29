import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class141 extends class178 {

    @OriginalMember(owner = "client!kl", name = "L", descriptor = "I")
    private int field2108;

    @OriginalMember(owner = "client!kl", name = "B", descriptor = "I")
    private int field2099;

    @OriginalMember(owner = "client!kl", name = "J", descriptor = "Z")
    private boolean field2106;

    @OriginalMember(owner = "client!kl", name = "H", descriptor = "I")
    private int field2104;

    @OriginalMember(owner = "client!kl", name = "y", descriptor = "I")
    private int field2096;

    @OriginalMember(owner = "client!kl", name = "F", descriptor = "I")
    private int field2102;

    @OriginalMember(owner = "client!kl", name = "w", descriptor = "I")
    private int field2094;

    @OriginalMember(owner = "client!kl", name = "x", descriptor = "I")
    private int field2095;

    @OriginalMember(owner = "client!kl", name = "z", descriptor = "I")
    private int field2097;

    @OriginalMember(owner = "client!kl", name = "A", descriptor = "I")
    private int field2098;

    @OriginalMember(owner = "client!kl", name = "C", descriptor = "I")
    private int field2100;

    @OriginalMember(owner = "client!kl", name = "E", descriptor = "I")
    private int field2101;

    @OriginalMember(owner = "client!kl", name = "G", descriptor = "I")
    private int field2103;

    @OriginalMember(owner = "client!kl", name = "I", descriptor = "I")
    private int field2105;

    @OriginalMember(owner = "client!kl", name = "K", descriptor = "I")
    private int field2107;

    @OriginalMember(owner = "client!kl", name = "e", descriptor = "()I", line = 5)
    public final synchronized int method940() {
        return this.field2096 == Integer.MIN_VALUE ? 0 : this.field2096;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(II[B[IIIIIIIIIILkl;II)I", line = 8)
    private static final int method941(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class141 arg13, int arg14, int arg15) {
        arg13.field2095 -= arg13.field2103 * arg5;
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
        arg13.field2095 += arg13.field2103 * var27;
        arg13.field2107 = arg6;
        arg13.field2105 = arg7;
        arg13.field2094 = arg4;
        return var27;
    }

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "(I)V", line = 50)
    public final synchronized void method942(int arg0) {
        if (arg0 == 0) {
            this.method950(0);
            this.method465((byte) -122);
        } else if (this.field2107 == 0 && this.field2105 == 0) {
            this.field2101 = 0;
            this.field2096 = 0;
            this.field2095 = 0;
            this.method465((byte) -122);
        } else {
            int var2 = -this.field2095;
            if (this.field2095 > var2) {
                var2 = this.field2095;
            }
            if (-this.field2107 > var2) {
                var2 = -this.field2107;
            }
            if (this.field2107 > var2) {
                var2 = this.field2107;
            }
            if (-this.field2105 > var2) {
                var2 = -this.field2105;
            }
            if (this.field2105 > var2) {
                var2 = this.field2105;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field2101 = arg0;
            this.field2096 = Integer.MIN_VALUE;
            this.field2103 = -this.field2095 / arg0;
            this.field2100 = -this.field2107 / arg0;
            this.field2097 = -this.field2105 / arg0;
        }
    }

    @OriginalMember(owner = "client!kl", name = "d", descriptor = "(I)V", line = 95)
    public final synchronized void method943(int arg0) {
        this.method945(arg0 << 6, this.method961());
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Lqj;II)Lkl;", line = 99)
    public static final class141 method944(class267 arg0, int arg1, int arg2) {
        return arg0.field4205 == null || arg0.field4205.length == 0 ? null : new class141(arg0, (int) ((long) arg0.field4202 * 256L * (long) arg1 / (long) (class264.field4185 * 100)), arg2 << 6);
    }

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "(II)V", line = 106)
    private final synchronized void method945(int arg0, int arg1) {
        this.field2096 = arg0;
        this.field2102 = arg1;
        this.field2101 = 0;
        this.method946();
    }

    @OriginalMember(owner = "client!kl", name = "f", descriptor = "()V", line = 112)
    private final void method946() {
        this.field2095 = this.field2096;
        this.field2107 = method957(this.field2096, this.field2102);
        this.field2105 = method972(this.field2096, this.field2102);
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(II[B[IIIIIIIILkl;II)I", line = 117)
    private static final int method947(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class141 arg11, int arg12, int arg13) {
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
        arg11.field2094 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(I[B[IIIIIIIILkl;)I", line = 150)
    private static final int method948(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class141 arg10) {
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
        arg10.field2094 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "(II[B[IIIIIIIILkl;II)I", line = 190)
    private static final int method949(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class141 arg11, int arg12, int arg13) {
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
        arg11.field2094 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!kl", name = "e", descriptor = "(I)V", line = 222)
    private final synchronized void method950(int arg0) {
        this.method945(arg0, this.method961());
    }

    @OriginalMember(owner = "client!kl", name = "g", descriptor = "()Z", line = 225)
    public final boolean method951() {
        return this.field2094 < 0 || this.field2094 >= ((class267) this.field2885).field4205.length << 8;
    }

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "(II[B[IIIIIIIILkl;II)I", line = 229)
    private static final int method952(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class141 arg11, int arg12, int arg13) {
        arg11.field2107 -= arg11.field2100 * arg5;
        arg11.field2105 -= arg11.field2097 * arg5;
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
        arg11.field2107 += arg11.field2100 * arg5;
        arg11.field2105 += arg11.field2097 * arg5;
        arg11.field2095 = arg6;
        arg11.field2094 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!kl", name = "h", descriptor = "()Z", line = 263)
    private final boolean method953() {
        int var1 = this.field2096;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method957(var1, this.field2102);
            var2 = method972(var1, this.field2102);
        }
        if (this.field2095 != var1 || this.field2107 != var3 || this.field2105 != var2) {
            if (this.field2095 < var1) {
                this.field2103 = 1;
                this.field2101 = var1 - this.field2095;
            } else if (this.field2095 > var1) {
                this.field2103 = -1;
                this.field2101 = this.field2095 - var1;
            } else {
                this.field2103 = 0;
            }
            if (this.field2107 < var3) {
                this.field2100 = 1;
                if (this.field2101 == 0 || this.field2101 > var3 - this.field2107) {
                    this.field2101 = var3 - this.field2107;
                }
            } else if (this.field2107 > var3) {
                this.field2100 = -1;
                if (this.field2101 == 0 || this.field2101 > this.field2107 - var3) {
                    this.field2101 = this.field2107 - var3;
                }
            } else {
                this.field2100 = 0;
            }
            if (this.field2105 < var2) {
                this.field2097 = 1;
                if (this.field2101 == 0 || this.field2101 > var2 - this.field2105) {
                    this.field2101 = var2 - this.field2105;
                }
            } else if (this.field2105 > var2) {
                this.field2097 = -1;
                if (this.field2101 == 0 || this.field2101 > this.field2105 - var2) {
                    this.field2101 = this.field2105 - var2;
                }
            } else {
                this.field2097 = 0;
            }
            return false;
        } else if (this.field2096 == Integer.MIN_VALUE) {
            this.field2096 = 0;
            this.field2095 = this.field2107 = this.field2105 = 0;
            this.method465((byte) -122);
            return true;
        } else {
            this.method946();
            return false;
        }
    }

    @OriginalMember(owner = "client!kl", name = "i", descriptor = "()I", line = 348)
    public final synchronized int method954() {
        return this.field2104 < 0 ? -this.field2104 : this.field2104;
    }

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "(I[B[IIIIIIIILkl;)I", line = 351)
    private static final int method955(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class141 arg10) {
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
        arg10.field2094 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "()I", line = 390)
    public final int method282() {
        return this.field2096 == 0 && this.field2101 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Lqj;III)Lkl;", line = 397)
    public static final class141 method956(class267 arg0, int arg1, int arg2, int arg3) {
        return arg0.field4205 == null || arg0.field4205.length == 0 ? null : new class141(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "(II)I", line = 403)
    private static final int method957(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "()Lba;", line = 408)
    public final class178 method287() {
        return null;
    }

    @OriginalMember(owner = "client!kl", name = "f", descriptor = "(I)V", line = 413)
    public final synchronized void method958(int arg0) {
        if (this.field2104 < 0) {
            this.field2104 = -arg0;
        } else {
            this.field2104 = arg0;
        }
    }

    @OriginalMember(owner = "client!kl", name = "j", descriptor = "()V", line = 422)
    private final void method959() {
        if (this.field2101 == 0) {
            return;
        }
        if (this.field2096 == Integer.MIN_VALUE) {
            this.field2096 = 0;
        }
        this.field2101 = 0;
        this.method946();
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(II[B[IIIIIIILkl;II)I", line = 436)
    private static final int method960(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class141 arg10, int arg11, int arg12) {
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
        arg10.field2094 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!kl", name = "k", descriptor = "()I", line = 462)
    public final synchronized int method961() {
        return this.field2102 < 0 ? -1 : this.field2102;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(I[B[IIIIIIIIIILkl;)I", line = 465)
    private static final int method962(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class141 arg12) {
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
        arg12.field2095 += (var19 - arg4) * arg12.field2103;
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
        arg12.field2107 = var15 >> 2;
        arg12.field2105 = var16 >> 2;
        arg12.field2094 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Z)V", line = 520)
    public final synchronized void method963(boolean arg0) {
        this.field2104 = (this.field2104 >>> 31) + (this.field2104 ^ this.field2104 >> 31);
        if (arg0) {
            this.field2104 = -this.field2104;
        }
    }

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "(I)V", line = 527)
    public final synchronized void method288(int arg0) {
        if (this.field2101 > 0) {
            if (arg0 >= this.field2101) {
                if (this.field2096 == Integer.MIN_VALUE) {
                    this.field2096 = 0;
                    this.field2095 = this.field2107 = this.field2105 = 0;
                    this.method465((byte) -122);
                    arg0 = this.field2101;
                }
                this.field2101 = 0;
                this.method946();
            } else {
                this.field2095 += this.field2103 * arg0;
                this.field2107 += this.field2100 * arg0;
                this.field2105 += this.field2097 * arg0;
                this.field2101 -= arg0;
            }
        }
        class267 var2 = (class267) this.field2885;
        int var3 = this.field2108 << 8;
        int var4 = this.field2099 << 8;
        int var5 = var2.field4205.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field2098 = 0;
        }
        if (this.field2094 < 0) {
            if (this.field2104 <= 0) {
                this.method959();
                this.method465((byte) -122);
                return;
            }
            this.field2094 = 0;
        }
        if (this.field2094 >= var5) {
            if (this.field2104 >= 0) {
                this.method959();
                this.method465((byte) -122);
                return;
            }
            this.field2094 = var5 - 1;
        }
        this.field2094 += this.field2104 * arg0;
        if (this.field2098 >= 0) {
            if (this.field2098 > 0) {
                if (this.field2106) {
                    label121: {
                        if (this.field2104 < 0) {
                            if (this.field2094 >= var3) {
                                return;
                            }
                            this.field2094 = var3 + var3 - this.field2094 - 1;
                            this.field2104 = -this.field2104;
                            if (--this.field2098 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field2094 < var4) {
                                return;
                            }
                            this.field2094 = var4 + var4 - this.field2094 - 1;
                            this.field2104 = -this.field2104;
                            if (--this.field2098 == 0) {
                                break;
                            }
                            if (this.field2094 >= var3) {
                                return;
                            }
                            this.field2094 = var3 + var3 - this.field2094 - 1;
                            this.field2104 = -this.field2104;
                        } while (--this.field2098 != 0);
                    }
                } else {
                    label153: {
                        if (this.field2104 < 0) {
                            if (this.field2094 >= var3) {
                                return;
                            }
                            int var7 = (var4 - this.field2094 - 1) / var6;
                            if (var7 >= this.field2098) {
                                this.field2094 += this.field2098 * var6;
                                this.field2098 = 0;
                                break label153;
                            }
                            this.field2094 += var6 * var7;
                            this.field2098 -= var7;
                        } else if (this.field2094 >= var4) {
                            int var8 = (this.field2094 - var3) / var6;
                            if (var8 >= this.field2098) {
                                this.field2094 -= this.field2098 * var6;
                                this.field2098 = 0;
                                break label153;
                            }
                            this.field2094 -= var6 * var8;
                            this.field2098 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field2104 < 0) {
                if (this.field2094 < 0) {
                    this.field2094 = -1;
                    this.method959();
                    this.method465((byte) -122);
                }
            } else if (this.field2094 >= var5) {
                this.field2094 = var5;
                this.method959();
                this.method465((byte) -122);
            }
        } else if (this.field2106) {
            if (this.field2104 < 0) {
                if (this.field2094 >= var3) {
                    return;
                }
                this.field2094 = var3 + var3 - this.field2094 - 1;
                this.field2104 = -this.field2104;
            }
            while (this.field2094 >= var4) {
                this.field2094 = var4 + var4 - this.field2094 - 1;
                this.field2104 = -this.field2104;
                if (this.field2094 >= var3) {
                    return;
                }
                this.field2094 = var3 + var3 - this.field2094 - 1;
                this.field2104 = -this.field2104;
            }
        } else if (this.field2104 < 0) {
            if (this.field2094 >= var3) {
                return;
            }
            this.field2094 = var4 - (var4 - 1 - this.field2094) % var6 - 1;
        } else if (this.field2094 >= var4) {
            this.field2094 = (this.field2094 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "([IIIII)I", line = 746)
    private final int method964(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field2101 > 0) {
                int var6 = this.field2101 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field2101 += arg1;
                if (this.field2104 == -256 && (this.field2094 & 0xFF) == 0) {
                    if (class98.field1499) {
                        arg1 = method962(0, ((class267) this.field2885).field4205, arg0, this.field2094, arg1, this.field2107, this.field2105, this.field2100, this.field2097, 0, var6, arg2, this);
                    } else {
                        arg1 = method973(((class267) this.field2885).field4205, arg0, this.field2094, arg1, this.field2095, this.field2103, 0, var6, arg2, this);
                    }
                } else if (class98.field1499) {
                    arg1 = method966(0, 0, ((class267) this.field2885).field4205, arg0, this.field2094, arg1, this.field2107, this.field2105, this.field2100, this.field2097, 0, var6, arg2, this, this.field2104, arg4);
                } else {
                    arg1 = method952(0, 0, ((class267) this.field2885).field4205, arg0, this.field2094, arg1, this.field2095, this.field2103, 0, var6, arg2, this, this.field2104, arg4);
                }
                this.field2101 -= arg1;
                if (this.field2101 != 0) {
                    return arg1;
                }
                if (!this.method953()) {
                    continue;
                }
                return arg3;
            }
            if (this.field2104 == -256 && (this.field2094 & 0xFF) == 0) {
                if (class98.field1499) {
                    return method948(0, ((class267) this.field2885).field4205, arg0, this.field2094, arg1, this.field2107, this.field2105, 0, arg3, arg2, this);
                }
                return method977(((class267) this.field2885).field4205, arg0, this.field2094, arg1, this.field2095, 0, arg3, arg2, this);
            }
            if (class98.field1499) {
                return method949(0, 0, ((class267) this.field2885).field4205, arg0, this.field2094, arg1, this.field2107, this.field2105, 0, arg3, arg2, this, this.field2104, arg4);
            }
            return method960(0, 0, ((class267) this.field2885).field4205, arg0, this.field2094, arg1, this.field2095, 0, arg3, arg2, this, this.field2104, arg4);
        }
    }

    @OriginalMember(owner = "client!kl", name = "d", descriptor = "(II[B[IIIIIIIILkl;II)I", line = 801)
    private static final int method965(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class141 arg11, int arg12, int arg13) {
        arg11.field2107 -= arg11.field2100 * arg5;
        arg11.field2105 -= arg11.field2097 * arg5;
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
        arg11.field2107 += arg11.field2100 * arg5;
        arg11.field2105 += arg11.field2097 * arg5;
        arg11.field2095 = arg6;
        arg11.field2094 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "(II[B[IIIIIIIIIILkl;II)I", line = 834)
    private static final int method966(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class141 arg13, int arg14, int arg15) {
        arg13.field2095 -= arg13.field2103 * arg5;
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
        arg13.field2095 += arg13.field2103 * var26;
        arg13.field2107 = arg6;
        arg13.field2105 = arg7;
        arg13.field2094 = arg4;
        return var26;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "()I", line = 877)
    public final int method967() {
        int var1 = this.field2095 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field2098 == 0) {
            var2 -= this.field2094 * var2 / (((class267) this.field2885).field4205.length << 8);
        } else if (this.field2098 >= 0) {
            var2 -= this.field2108 * var2 / ((class267) this.field2885).field4205.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "([B[IIIIIIIILkl;)I", line = 889)
    private static final int method968(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class141 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field2107 += (var14 - arg3) * arg9.field2100;
        arg9.field2105 += (var14 - arg3) * arg9.field2097;
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
        arg9.field2095 = var12 >> 2;
        arg9.field2094 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(III)V", line = 923)
    public final synchronized void method969(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method945(arg1, arg2);
            return;
        }
        int var4 = method957(arg1, arg2);
        int var5 = method972(arg1, arg2);
        if (this.field2107 == var4 && this.field2105 == var5) {
            this.field2101 = 0;
            return;
        }
        int var6 = arg1 - this.field2095;
        if (this.field2095 - arg1 > var6) {
            var6 = this.field2095 - arg1;
        }
        if (var4 - this.field2107 > var6) {
            var6 = var4 - this.field2107;
        }
        if (this.field2107 - var4 > var6) {
            var6 = this.field2107 - var4;
        }
        if (var5 - this.field2105 > var6) {
            var6 = var5 - this.field2105;
        }
        if (this.field2105 - var5 > var6) {
            var6 = this.field2105 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field2101 = arg0;
        this.field2096 = arg1;
        this.field2102 = arg2;
        this.field2103 = (arg1 - this.field2095) / arg0;
        this.field2100 = (var4 - this.field2107) / arg0;
        this.field2097 = (var5 - this.field2105) / arg0;
    }

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "(I[B[IIIIIIIIIILkl;)I", line = 969)
    private static final int method970(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class141 arg12) {
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
        arg12.field2095 += (var19 - arg4) * arg12.field2103;
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
        arg12.field2107 = var15 >> 2;
        arg12.field2105 = var16 >> 2;
        arg12.field2094 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "(II[B[IIIIIIILkl;II)I", line = 1023)
    private static final int method971(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class141 arg10, int arg11, int arg12) {
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
        arg10.field2094 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!kl", name = "d", descriptor = "(II)I", line = 1050)
    private static final int method972(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "([B[IIIIIIIILkl;)I", line = 1053)
    private static final int method973(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class141 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field2107 += (var14 - arg3) * arg9.field2100;
        arg9.field2105 += (var14 - arg3) * arg9.field2097;
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
        arg9.field2095 = var12 >> 2;
        arg9.field2094 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!kl", name = "d", descriptor = "()Lba;", line = 1087)
    public final class178 method281() {
        return null;
    }

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "([IIIII)I", line = 1093)
    private final int method974(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field2101 > 0) {
                int var6 = this.field2101 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field2101 += arg1;
                if (this.field2104 == 256 && (this.field2094 & 0xFF) == 0) {
                    if (class98.field1499) {
                        arg1 = method970(0, ((class267) this.field2885).field4205, arg0, this.field2094, arg1, this.field2107, this.field2105, this.field2100, this.field2097, 0, var6, arg2, this);
                    } else {
                        arg1 = method968(((class267) this.field2885).field4205, arg0, this.field2094, arg1, this.field2095, this.field2103, 0, var6, arg2, this);
                    }
                } else if (class98.field1499) {
                    arg1 = method941(0, 0, ((class267) this.field2885).field4205, arg0, this.field2094, arg1, this.field2107, this.field2105, this.field2100, this.field2097, 0, var6, arg2, this, this.field2104, arg4);
                } else {
                    arg1 = method965(0, 0, ((class267) this.field2885).field4205, arg0, this.field2094, arg1, this.field2095, this.field2103, 0, var6, arg2, this, this.field2104, arg4);
                }
                this.field2101 -= arg1;
                if (this.field2101 != 0) {
                    return arg1;
                }
                if (!this.method953()) {
                    continue;
                }
                return arg3;
            }
            if (this.field2104 == 256 && (this.field2094 & 0xFF) == 0) {
                if (class98.field1499) {
                    return method955(0, ((class267) this.field2885).field4205, arg0, this.field2094, arg1, this.field2107, this.field2105, 0, arg3, arg2, this);
                }
                return method980(((class267) this.field2885).field4205, arg0, this.field2094, arg1, this.field2095, 0, arg3, arg2, this);
            }
            if (class98.field1499) {
                return method947(0, 0, ((class267) this.field2885).field4205, arg0, this.field2094, arg1, this.field2107, this.field2105, 0, arg3, arg2, this, this.field2104, arg4);
            }
            return method971(0, 0, ((class267) this.field2885).field4205, arg0, this.field2094, arg1, this.field2095, 0, arg3, arg2, this, this.field2104, arg4);
        }
    }

    @OriginalMember(owner = "client!kl", name = "l", descriptor = "()Z", line = 1149)
    public final boolean method975() {
        return this.field2101 != 0;
    }

    @OriginalMember(owner = "client!kl", name = "g", descriptor = "(I)V", line = 1153)
    public final synchronized void method976(int arg0) {
        int var2 = ((class267) this.field2885).field4205.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field2094 = arg0;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "([III)V", line = 1163)
    public final synchronized void method284(int[] arg0, int arg1, int arg2) {
        if (this.field2096 == 0 && this.field2101 == 0) {
            this.method288(arg2);
            return;
        }
        class267 var4 = (class267) this.field2885;
        int var5 = this.field2108 << 8;
        int var6 = this.field2099 << 8;
        int var7 = var4.field4205.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field2098 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field2094 < 0) {
            if (this.field2104 <= 0) {
                this.method959();
                this.method465((byte) -122);
                return;
            }
            this.field2094 = 0;
        }
        if (this.field2094 >= var7) {
            if (this.field2104 >= 0) {
                this.method959();
                this.method465((byte) -122);
                return;
            }
            this.field2094 = var7 - 1;
        }
        if (this.field2098 >= 0) {
            if (this.field2098 > 0) {
                if (this.field2106) {
                    label131: {
                        if (this.field2104 < 0) {
                            var9 = this.method964(arg0, arg1, var5, var10, var4.field4205[this.field2108]);
                            if (this.field2094 >= var5) {
                                return;
                            }
                            this.field2094 = var5 + var5 - this.field2094 - 1;
                            this.field2104 = -this.field2104;
                            if (--this.field2098 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method974(arg0, var9, var6, var10, var4.field4205[this.field2099 - 1]);
                            if (this.field2094 < var6) {
                                return;
                            }
                            this.field2094 = var6 + var6 - this.field2094 - 1;
                            this.field2104 = -this.field2104;
                            if (--this.field2098 == 0) {
                                break;
                            }
                            var9 = this.method964(arg0, var9, var5, var10, var4.field4205[this.field2108]);
                            if (this.field2094 >= var5) {
                                return;
                            }
                            this.field2094 = var5 + var5 - this.field2094 - 1;
                            this.field2104 = -this.field2104;
                        } while (--this.field2098 != 0);
                    }
                } else if (this.field2104 < 0) {
                    while (true) {
                        var9 = this.method964(arg0, var9, var5, var10, var4.field4205[this.field2099 - 1]);
                        if (this.field2094 >= var5) {
                            return;
                        }
                        int var12 = (var6 - this.field2094 - 1) / var8;
                        if (var12 >= this.field2098) {
                            this.field2094 += this.field2098 * var8;
                            this.field2098 = 0;
                            break;
                        }
                        this.field2094 += var8 * var12;
                        this.field2098 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method974(arg0, var9, var6, var10, var4.field4205[this.field2108]);
                        if (this.field2094 < var6) {
                            return;
                        }
                        int var13 = (this.field2094 - var5) / var8;
                        if (var13 >= this.field2098) {
                            this.field2094 -= this.field2098 * var8;
                            this.field2098 = 0;
                            break;
                        }
                        this.field2094 -= var8 * var13;
                        this.field2098 -= var13;
                    }
                }
            }
            if (this.field2104 < 0) {
                this.method964(arg0, var9, 0, var10, 0);
                if (this.field2094 < 0) {
                    this.field2094 = -1;
                    this.method959();
                    this.method465((byte) -122);
                }
            } else {
                this.method974(arg0, var9, var7, var10, 0);
                if (this.field2094 >= var7) {
                    this.field2094 = var7;
                    this.method959();
                    this.method465((byte) -122);
                }
            }
        } else if (this.field2106) {
            if (this.field2104 < 0) {
                var9 = this.method964(arg0, arg1, var5, var10, var4.field4205[this.field2108]);
                if (this.field2094 >= var5) {
                    return;
                }
                this.field2094 = var5 + var5 - this.field2094 - 1;
                this.field2104 = -this.field2104;
            }
            while (true) {
                int var11 = this.method974(arg0, var9, var6, var10, var4.field4205[this.field2099 - 1]);
                if (this.field2094 < var6) {
                    return;
                }
                this.field2094 = var6 + var6 - this.field2094 - 1;
                this.field2104 = -this.field2104;
                var9 = this.method964(arg0, var11, var5, var10, var4.field4205[this.field2108]);
                if (this.field2094 >= var5) {
                    return;
                }
                this.field2094 = var5 + var5 - this.field2094 - 1;
                this.field2104 = -this.field2104;
            }
        } else if (this.field2104 < 0) {
            while (true) {
                var9 = this.method964(arg0, var9, var5, var10, var4.field4205[this.field2099 - 1]);
                if (this.field2094 >= var5) {
                    return;
                }
                this.field2094 = var6 - (var6 - 1 - this.field2094) % var8 - 1;
            }
        } else {
            while (true) {
                var9 = this.method974(arg0, var9, var6, var10, var4.field4205[this.field2108]);
                if (this.field2094 < var6) {
                    return;
                }
                this.field2094 = (this.field2094 - var5) % var8 + var5;
            }
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "([B[IIIIIIILkl;)I", line = 1398)
    private static final int method977(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class141 arg8) {
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
        arg8.field2094 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!kl", name = "e", descriptor = "(II)V", line = 1424)
    public final synchronized void method978(int arg0, int arg1) {
        this.method969(arg0, arg1, this.method961());
    }

    @OriginalMember(owner = "client!kl", name = "h", descriptor = "(I)V", line = 1427)
    public final synchronized void method979(int arg0) {
        this.field2098 = arg0;
    }

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "([B[IIIIIIILkl;)I", line = 1431)
    private static final int method980(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class141 arg8) {
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
        arg8.field2094 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!kl", name = "<init>", descriptor = "(Lqj;II)V", line = 1458)
    private class141(class267 arg0, int arg1, int arg2) {
        this.field2885 = arg0;
        this.field2108 = arg0.field4204;
        this.field2099 = arg0.field4203;
        this.field2106 = arg0.field4201;
        this.field2104 = arg1;
        this.field2096 = arg2;
        this.field2102 = 8192;
        this.field2094 = 0;
        this.method946();
    }

    @OriginalMember(owner = "client!kl", name = "<init>", descriptor = "(Lqj;III)V", line = 1469)
    private class141(class267 arg0, int arg1, int arg2, int arg3) {
        this.field2885 = arg0;
        this.field2108 = arg0.field4204;
        this.field2099 = arg0.field4203;
        this.field2106 = arg0.field4201;
        this.field2104 = arg1;
        this.field2096 = arg2;
        this.field2102 = arg3;
        this.field2094 = 0;
        this.method946();
    }
}
