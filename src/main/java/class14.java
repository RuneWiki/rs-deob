import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class14 extends class23 {

    @OriginalMember(owner = "client!fk", name = "u", descriptor = "I")
    private int field216;

    @OriginalMember(owner = "client!fk", name = "B", descriptor = "I")
    private int field223;

    @OriginalMember(owner = "client!fk", name = "z", descriptor = "Z")
    private boolean field221;

    @OriginalMember(owner = "client!fk", name = "w", descriptor = "I")
    private int field218;

    @OriginalMember(owner = "client!fk", name = "A", descriptor = "I")
    private int field222;

    @OriginalMember(owner = "client!fk", name = "C", descriptor = "I")
    private int field224;

    @OriginalMember(owner = "client!fk", name = "D", descriptor = "I")
    private int field225;

    @OriginalMember(owner = "client!fk", name = "v", descriptor = "I")
    private int field217;

    @OriginalMember(owner = "client!fk", name = "x", descriptor = "I")
    private int field219;

    @OriginalMember(owner = "client!fk", name = "y", descriptor = "I")
    private int field220;

    @OriginalMember(owner = "client!fk", name = "E", descriptor = "I")
    private int field226;

    @OriginalMember(owner = "client!fk", name = "F", descriptor = "I")
    private int field227;

    @OriginalMember(owner = "client!fk", name = "G", descriptor = "I")
    private int field228;

    @OriginalMember(owner = "client!fk", name = "H", descriptor = "I")
    private int field229;

    @OriginalMember(owner = "client!fk", name = "I", descriptor = "I")
    private int field230;

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "(I)V")
    public final synchronized void method114(int arg0) {
        int var2 = ((class285) super.field322).field4512.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field225 = arg0;
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(II)V")
    public final synchronized void method115(int arg0, int arg1) {
        this.method142(arg0, arg1, this.method139());
    }

    @OriginalMember(owner = "client!fk", name = "e", descriptor = "(I)V")
    public final synchronized void method116(int arg0) {
        if (arg0 == 0) {
            this.method124(0);
            this.method1123(0);
        } else if (this.field230 == 0 && this.field219 == 0) {
            this.field229 = 0;
            this.field222 = 0;
            this.field220 = 0;
            this.method1123(0);
        } else {
            int var2 = -this.field220;
            if (this.field220 > var2) {
                var2 = this.field220;
            }
            if (-this.field230 > var2) {
                var2 = -this.field230;
            }
            if (this.field230 > var2) {
                var2 = this.field230;
            }
            if (-this.field219 > var2) {
                var2 = -this.field219;
            }
            if (this.field219 > var2) {
                var2 = this.field219;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field229 = arg0;
            this.field222 = Integer.MIN_VALUE;
            this.field217 = -this.field220 / arg0;
            this.field227 = -this.field230 / arg0;
            this.field228 = -this.field219 / arg0;
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lah;II)Lfk;")
    public static final class14 method117(class285 arg0, int arg1, int arg2) {
        return arg0.field4512 != null && arg0.field4512.length != 0 ? new class14(arg0, (int) ((long) arg0.field4510 * 256L * (long) arg1 / (long) (class186.field2873 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "([B[IIIIIIILfk;)I")
    private static final int method118(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class14 arg8) {
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
        arg8.field225 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!fk", name = "e", descriptor = "()Z")
    private final boolean method119() {
        int var1 = this.field222;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method135(var1, this.field224);
            var2 = method151(var1, this.field224);
        }
        if (this.field220 == var1 && this.field230 == var3 && this.field219 == var2) {
            if (this.field222 == Integer.MIN_VALUE) {
                this.field222 = 0;
                this.field220 = this.field230 = this.field219 = 0;
                this.method1123(0);
                return true;
            } else {
                this.method130();
                return false;
            }
        } else {
            if (this.field220 < var1) {
                this.field217 = 1;
                this.field229 = var1 - this.field220;
            } else if (this.field220 > var1) {
                this.field217 = -1;
                this.field229 = this.field220 - var1;
            } else {
                this.field217 = 0;
            }
            if (this.field230 < var3) {
                this.field227 = 1;
                if (this.field229 == 0 || this.field229 > var3 - this.field230) {
                    this.field229 = var3 - this.field230;
                }
            } else if (this.field230 > var3) {
                this.field227 = -1;
                if (this.field229 == 0 || this.field229 > this.field230 - var3) {
                    this.field229 = this.field230 - var3;
                }
            } else {
                this.field227 = 0;
            }
            if (this.field219 < var2) {
                this.field228 = 1;
                if (this.field229 == 0 || this.field229 > var2 - this.field219) {
                    this.field229 = var2 - this.field219;
                }
            } else if (this.field219 > var2) {
                this.field228 = -1;
                if (this.field229 == 0 || this.field229 > this.field219 - var2) {
                    this.field229 = this.field219 - var2;
                }
            } else {
                this.field228 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(II[B[IIIIIIIILfk;II)I")
    private static final int method120(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class14 arg11, int arg12, int arg13) {
        arg11.field230 -= arg11.field227 * arg5;
        arg11.field219 -= arg11.field228 * arg5;
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
        arg11.field230 += arg11.field227 * arg5;
        arg11.field219 += arg11.field228 * arg5;
        arg11.field220 = arg6;
        arg11.field225 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "(II)V")
    private final synchronized void method121(int arg0, int arg1) {
        this.field222 = arg0;
        this.field224 = arg1;
        this.field229 = 0;
        this.method130();
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "([B[IIIIIIILfk;)I")
    private static final int method122(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class14 arg8) {
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
        arg8.field225 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!fk", name = "f", descriptor = "()V")
    private final void method123() {
        if (this.field229 != 0) {
            if (this.field222 == Integer.MIN_VALUE) {
                this.field222 = 0;
            }
            this.field229 = 0;
            this.method130();
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "()I")
    public final int method22() {
        return this.field222 == 0 && this.field229 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!fk", name = "f", descriptor = "(I)V")
    private final synchronized void method124(int arg0) {
        this.method121(arg0, this.method139());
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(I[B[IIIIIIIIIILfk;)I")
    private static final int method125(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class14 arg12) {
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
        arg12.field220 += (var19 - arg4) * arg12.field217;
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
        arg12.field230 = var15 >> 2;
        arg12.field219 = var16 >> 2;
        arg12.field225 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(II[B[IIIIIIIILfk;II)I")
    private static final int method126(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class14 arg11, int arg12, int arg13) {
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
        arg11.field225 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(I[B[IIIIIIIILfk;)I")
    private static final int method127(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class14 arg10) {
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
        arg10.field225 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "([B[IIIIIIIILfk;)I")
    private static final int method128(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class14 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field230 += (var14 - arg3) * arg9.field227;
        arg9.field219 += (var14 - arg3) * arg9.field228;
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
        arg9.field220 = var12 >> 2;
        arg9.field225 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(II[B[IIIIIIILfk;II)I")
    private static final int method129(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class14 arg10, int arg11, int arg12) {
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
        arg10.field225 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!fk", name = "g", descriptor = "()V")
    private final void method130() {
        this.field220 = this.field222;
        this.field230 = method135(this.field222, this.field224);
        this.field219 = method151(this.field222, this.field224);
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Z)V")
    public final synchronized void method131(boolean arg0) {
        this.field218 = (this.field218 >>> 31) + (this.field218 ^ this.field218 >> 31);
        if (arg0) {
            this.field218 = -this.field218;
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(II[B[IIIIIIIIIILfk;II)I")
    private static final int method132(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class14 arg13, int arg14, int arg15) {
        arg13.field220 -= arg13.field217 * arg5;
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
        arg13.field220 += arg13.field217 * var22;
        arg13.field230 = arg6;
        arg13.field219 = arg7;
        arg13.field225 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!fk", name = "h", descriptor = "()Z")
    public final boolean method133() {
        return this.field225 < 0 || this.field225 >= ((class285) super.field322).field4512.length << 8;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "([IIIII)I")
    private final int method134(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field229 <= 0) {
                if (this.field218 == -256 && (this.field225 & 255) == 0) {
                    if (class7.field160) {
                        return method127(0, ((class285) super.field322).field4512, arg0, this.field225, arg1, this.field230, this.field219, 0, arg3, arg2, this);
                    }
                    return method118(((class285) super.field322).field4512, arg0, this.field225, arg1, this.field220, 0, arg3, arg2, this);
                }
                if (class7.field160) {
                    return method150(0, 0, ((class285) super.field322).field4512, arg0, this.field225, arg1, this.field230, this.field219, 0, arg3, arg2, this, this.field218, arg4);
                }
                return method129(0, 0, ((class285) super.field322).field4512, arg0, this.field225, arg1, this.field220, 0, arg3, arg2, this, this.field218, arg4);
            }
            int var6 = this.field229 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field229 += arg1;
            if (this.field218 == -256 && (this.field225 & 255) == 0) {
                if (class7.field160) {
                    arg1 = method148(0, ((class285) super.field322).field4512, arg0, this.field225, arg1, this.field230, this.field219, this.field227, this.field228, 0, var6, arg2, this);
                } else {
                    arg1 = method128(((class285) super.field322).field4512, arg0, this.field225, arg1, this.field220, this.field217, 0, var6, arg2, this);
                }
            } else if (class7.field160) {
                arg1 = method132(0, 0, ((class285) super.field322).field4512, arg0, this.field225, arg1, this.field230, this.field219, this.field227, this.field228, 0, var6, arg2, this, this.field218, arg4);
            } else {
                arg1 = method154(0, 0, ((class285) super.field322).field4512, arg0, this.field225, arg1, this.field220, this.field217, 0, var6, arg2, this, this.field218, arg4);
            }
            this.field229 -= arg1;
            if (this.field229 != 0) {
                return arg1;
            }
        } while (!this.method119());
        return arg3;
    }

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "(II)I")
    private static final int method135(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "()Lwd;")
    public final class23 method33() {
        return null;
    }

    @OriginalMember(owner = "client!fk", name = "i", descriptor = "()I")
    public final synchronized int method136() {
        return this.field218 < 0 ? -this.field218 : this.field218;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "([III)V")
    public final synchronized void method26(int[] arg0, int arg1, int arg2) {
        if (this.field222 == 0 && this.field229 == 0) {
            this.method32(arg2);
        } else {
            class285 var4 = (class285) super.field322;
            int var5 = this.field216 << 8;
            int var6 = this.field223 << 8;
            int var7 = var4.field4512.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field226 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field225 < 0) {
                if (this.field218 <= 0) {
                    this.method123();
                    this.method1123(0);
                    return;
                }
                this.field225 = 0;
            }
            if (this.field225 >= var7) {
                if (this.field218 >= 0) {
                    this.method123();
                    this.method1123(0);
                    return;
                }
                this.field225 = var7 - 1;
            }
            if (this.field226 < 0) {
                if (this.field221) {
                    if (this.field218 < 0) {
                        var9 = this.method134(arg0, arg1, var5, var10, var4.field4512[this.field216]);
                        if (this.field225 >= var5) {
                            return;
                        }
                        this.field225 = var5 + var5 - 1 - this.field225;
                        this.field218 = -this.field218;
                    }
                    while (true) {
                        int var11 = this.method143(arg0, var9, var6, var10, var4.field4512[this.field223 - 1]);
                        if (this.field225 < var6) {
                            return;
                        }
                        this.field225 = var6 + var6 - 1 - this.field225;
                        this.field218 = -this.field218;
                        var9 = this.method134(arg0, var11, var5, var10, var4.field4512[this.field216]);
                        if (this.field225 >= var5) {
                            return;
                        }
                        this.field225 = var5 + var5 - 1 - this.field225;
                        this.field218 = -this.field218;
                    }
                } else if (this.field218 < 0) {
                    while (true) {
                        var9 = this.method134(arg0, var9, var5, var10, var4.field4512[this.field223 - 1]);
                        if (this.field225 >= var5) {
                            return;
                        }
                        this.field225 = var6 - 1 - (var6 - 1 - this.field225) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method143(arg0, var9, var6, var10, var4.field4512[this.field216]);
                        if (this.field225 < var6) {
                            return;
                        }
                        this.field225 = (this.field225 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field226 > 0) {
                    if (this.field221) {
                        label130: {
                            if (this.field218 < 0) {
                                var9 = this.method134(arg0, arg1, var5, var10, var4.field4512[this.field216]);
                                if (this.field225 >= var5) {
                                    return;
                                }
                                this.field225 = var5 + var5 - 1 - this.field225;
                                this.field218 = -this.field218;
                                if (--this.field226 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method143(arg0, var9, var6, var10, var4.field4512[this.field223 - 1]);
                                if (this.field225 < var6) {
                                    return;
                                }
                                this.field225 = var6 + var6 - 1 - this.field225;
                                this.field218 = -this.field218;
                                if (--this.field226 == 0) {
                                    break;
                                }
                                var9 = this.method134(arg0, var9, var5, var10, var4.field4512[this.field216]);
                                if (this.field225 >= var5) {
                                    return;
                                }
                                this.field225 = var5 + var5 - 1 - this.field225;
                                this.field218 = -this.field218;
                            } while (--this.field226 != 0);
                        }
                    } else if (this.field218 < 0) {
                        while (true) {
                            var9 = this.method134(arg0, var9, var5, var10, var4.field4512[this.field223 - 1]);
                            if (this.field225 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field225) / var8;
                            if (var12 >= this.field226) {
                                this.field225 += this.field226 * var8;
                                this.field226 = 0;
                                break;
                            }
                            this.field225 += var8 * var12;
                            this.field226 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method143(arg0, var9, var6, var10, var4.field4512[this.field216]);
                            if (this.field225 < var6) {
                                return;
                            }
                            int var13 = (this.field225 - var5) / var8;
                            if (var13 >= this.field226) {
                                this.field225 -= this.field226 * var8;
                                this.field226 = 0;
                                break;
                            }
                            this.field225 -= var8 * var13;
                            this.field226 -= var13;
                        }
                    }
                }
                if (this.field218 < 0) {
                    this.method134(arg0, var9, 0, var10, 0);
                    if (this.field225 < 0) {
                        this.field225 = -1;
                        this.method123();
                        this.method1123(0);
                        return;
                    }
                } else {
                    this.method143(arg0, var9, var7, var10, 0);
                    if (this.field225 >= var7) {
                        this.field225 = var7;
                        this.method123();
                        this.method1123(0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(II[B[IIIIIIILfk;II)I")
    private static final int method137(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class14 arg10, int arg11, int arg12) {
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
        arg10.field225 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!fk", name = "g", descriptor = "(I)V")
    public final synchronized void method138(int arg0) {
        this.method121(arg0 << 6, this.method139());
    }

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "(I)V")
    public final synchronized void method32(int arg0) {
        if (this.field229 > 0) {
            if (arg0 >= this.field229) {
                if (this.field222 == Integer.MIN_VALUE) {
                    this.field222 = 0;
                    this.field220 = this.field230 = this.field219 = 0;
                    this.method1123(0);
                    arg0 = this.field229;
                }
                this.field229 = 0;
                this.method130();
            } else {
                this.field220 += this.field217 * arg0;
                this.field230 += this.field227 * arg0;
                this.field219 += this.field228 * arg0;
                this.field229 -= arg0;
            }
        }
        class285 var2 = (class285) super.field322;
        int var3 = this.field216 << 8;
        int var4 = this.field223 << 8;
        int var5 = var2.field4512.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field226 = 0;
        }
        if (this.field225 < 0) {
            if (this.field218 <= 0) {
                this.method123();
                this.method1123(0);
                return;
            }
            this.field225 = 0;
        }
        if (this.field225 >= var5) {
            if (this.field218 >= 0) {
                this.method123();
                this.method1123(0);
                return;
            }
            this.field225 = var5 - 1;
        }
        this.field225 += this.field218 * arg0;
        if (this.field226 < 0) {
            if (!this.field221) {
                if (this.field218 < 0) {
                    if (this.field225 < var3) {
                        this.field225 = var4 - 1 - (var4 - 1 - this.field225) % var6;
                    }
                } else if (this.field225 >= var4) {
                    this.field225 = (this.field225 - var3) % var6 + var3;
                }
            } else {
                if (this.field218 < 0) {
                    if (this.field225 >= var3) {
                        return;
                    }
                    this.field225 = var3 + var3 - 1 - this.field225;
                    this.field218 = -this.field218;
                }
                while (this.field225 >= var4) {
                    this.field225 = var4 + var4 - 1 - this.field225;
                    this.field218 = -this.field218;
                    if (this.field225 >= var3) {
                        return;
                    }
                    this.field225 = var3 + var3 - 1 - this.field225;
                    this.field218 = -this.field218;
                }
            }
        } else {
            if (this.field226 > 0) {
                if (this.field221) {
                    label125: {
                        if (this.field218 < 0) {
                            if (this.field225 >= var3) {
                                return;
                            }
                            this.field225 = var3 + var3 - 1 - this.field225;
                            this.field218 = -this.field218;
                            if (--this.field226 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field225 < var4) {
                                return;
                            }
                            this.field225 = var4 + var4 - 1 - this.field225;
                            this.field218 = -this.field218;
                            if (--this.field226 == 0) {
                                break;
                            }
                            if (this.field225 >= var3) {
                                return;
                            }
                            this.field225 = var3 + var3 - 1 - this.field225;
                            this.field218 = -this.field218;
                        } while (--this.field226 != 0);
                    }
                } else if (this.field218 < 0) {
                    if (this.field225 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field225) / var6;
                    if (var7 < this.field226) {
                        this.field225 += var6 * var7;
                        this.field226 -= var7;
                        return;
                    }
                    this.field225 += this.field226 * var6;
                    this.field226 = 0;
                } else {
                    if (this.field225 < var4) {
                        return;
                    }
                    int var8 = (this.field225 - var3) / var6;
                    if (var8 < this.field226) {
                        this.field225 -= var6 * var8;
                        this.field226 -= var8;
                        return;
                    }
                    this.field225 -= this.field226 * var6;
                    this.field226 = 0;
                }
            }
            if (this.field218 < 0) {
                if (this.field225 < 0) {
                    this.field225 = -1;
                    this.method123();
                    this.method1123(0);
                    return;
                }
            } else if (this.field225 >= var5) {
                this.field225 = var5;
                this.method123();
                this.method1123(0);
            }
        }
    }

    @OriginalMember(owner = "client!fk", name = "j", descriptor = "()I")
    public final synchronized int method139() {
        return this.field224 < 0 ? -1 : this.field224;
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(I[B[IIIIIIIILfk;)I")
    private static final int method140(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class14 arg10) {
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
        arg10.field225 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!fk", name = "k", descriptor = "()I")
    public final synchronized int method141() {
        return this.field222 == Integer.MIN_VALUE ? 0 : this.field222;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(III)V")
    public final synchronized void method142(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method121(arg1, arg2);
        } else {
            int var4 = method135(arg1, arg2);
            int var5 = method151(arg1, arg2);
            if (this.field230 == var4 && this.field219 == var5) {
                this.field229 = 0;
            } else {
                int var6 = arg1 - this.field220;
                if (this.field220 - arg1 > var6) {
                    var6 = this.field220 - arg1;
                }
                if (var4 - this.field230 > var6) {
                    var6 = var4 - this.field230;
                }
                if (this.field230 - var4 > var6) {
                    var6 = this.field230 - var4;
                }
                if (var5 - this.field219 > var6) {
                    var6 = var5 - this.field219;
                }
                if (this.field219 - var5 > var6) {
                    var6 = this.field219 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field229 = arg0;
                this.field222 = arg1;
                this.field224 = arg2;
                this.field217 = (arg1 - this.field220) / arg0;
                this.field227 = (var4 - this.field230) / arg0;
                this.field228 = (var5 - this.field219) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "([IIIII)I")
    private final int method143(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field229 <= 0) {
                if (this.field218 == 256 && (this.field225 & 255) == 0) {
                    if (class7.field160) {
                        return method140(0, ((class285) super.field322).field4512, arg0, this.field225, arg1, this.field230, this.field219, 0, arg3, arg2, this);
                    }
                    return method122(((class285) super.field322).field4512, arg0, this.field225, arg1, this.field220, 0, arg3, arg2, this);
                }
                if (class7.field160) {
                    return method126(0, 0, ((class285) super.field322).field4512, arg0, this.field225, arg1, this.field230, this.field219, 0, arg3, arg2, this, this.field218, arg4);
                }
                return method137(0, 0, ((class285) super.field322).field4512, arg0, this.field225, arg1, this.field220, 0, arg3, arg2, this, this.field218, arg4);
            }
            int var6 = this.field229 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field229 += arg1;
            if (this.field218 == 256 && (this.field225 & 255) == 0) {
                if (class7.field160) {
                    arg1 = method125(0, ((class285) super.field322).field4512, arg0, this.field225, arg1, this.field230, this.field219, this.field227, this.field228, 0, var6, arg2, this);
                } else {
                    arg1 = method145(((class285) super.field322).field4512, arg0, this.field225, arg1, this.field220, this.field217, 0, var6, arg2, this);
                }
            } else if (class7.field160) {
                arg1 = method146(0, 0, ((class285) super.field322).field4512, arg0, this.field225, arg1, this.field230, this.field219, this.field227, this.field228, 0, var6, arg2, this, this.field218, arg4);
            } else {
                arg1 = method120(0, 0, ((class285) super.field322).field4512, arg0, this.field225, arg1, this.field220, this.field217, 0, var6, arg2, this, this.field218, arg4);
            }
            this.field229 -= arg1;
            if (this.field229 != 0) {
                return arg1;
            }
        } while (!this.method119());
        return arg3;
    }

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "()Lwd;")
    public final class23 method45() {
        return null;
    }

    @OriginalMember(owner = "client!fk", name = "h", descriptor = "(I)V")
    public final synchronized void method144(int arg0) {
        if (this.field218 < 0) {
            this.field218 = -arg0;
        } else {
            this.field218 = arg0;
        }
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "([B[IIIIIIIILfk;)I")
    private static final int method145(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class14 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field230 += (var14 - arg3) * arg9.field227;
        arg9.field219 += (var14 - arg3) * arg9.field228;
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
        arg9.field220 = var12 >> 2;
        arg9.field225 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(II[B[IIIIIIIIIILfk;II)I")
    private static final int method146(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class14 arg13, int arg14, int arg15) {
        arg13.field220 -= arg13.field217 * arg5;
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
        arg13.field220 += arg13.field217 * var22;
        arg13.field230 = arg6;
        arg13.field219 = arg7;
        arg13.field225 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lah;III)Lfk;")
    public static final class14 method147(class285 arg0, int arg1, int arg2, int arg3) {
        return arg0.field4512 != null && arg0.field4512.length != 0 ? new class14(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(I[B[IIIIIIIIIILfk;)I")
    private static final int method148(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class14 arg12) {
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
        arg12.field220 += (var19 - arg4) * arg12.field217;
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
        arg12.field230 = var15 >> 2;
        arg12.field219 = var16 >> 2;
        arg12.field225 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!fk", name = "l", descriptor = "()Z")
    public final boolean method149() {
        return this.field229 != 0;
    }

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "(II[B[IIIIIIIILfk;II)I")
    private static final int method150(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class14 arg11, int arg12, int arg13) {
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
        arg11.field225 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!fk", name = "e", descriptor = "(II)I")
    private static final int method151(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!fk", name = "i", descriptor = "(I)V")
    public final synchronized void method152(int arg0) {
        this.field226 = arg0;
    }

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "()I")
    public final int method153() {
        int var1 = this.field220 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field226 == 0) {
            var2 -= this.field225 * var2 / (((class285) super.field322).field4512.length << 8);
        } else if (this.field226 >= 0) {
            var2 -= this.field216 * var2 / ((class285) super.field322).field4512.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "(II[B[IIIIIIIILfk;II)I")
    private static final int method154(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class14 arg11, int arg12, int arg13) {
        arg11.field230 -= arg11.field227 * arg5;
        arg11.field219 -= arg11.field228 * arg5;
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
        arg11.field230 += arg11.field227 * arg5;
        arg11.field219 += arg11.field228 * arg5;
        arg11.field220 = arg6;
        arg11.field225 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(Lah;II)V")
    private class14(class285 arg0, int arg1, int arg2) {
        super.field322 = arg0;
        this.field216 = arg0.field4511;
        this.field223 = arg0.field4513;
        this.field221 = arg0.field4514;
        this.field218 = arg1;
        this.field222 = arg2;
        this.field224 = 8192;
        this.field225 = 0;
        this.method130();
    }

    @OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(Lah;III)V")
    private class14(class285 arg0, int arg1, int arg2, int arg3) {
        super.field322 = arg0;
        this.field216 = arg0.field4511;
        this.field223 = arg0.field4513;
        this.field221 = arg0.field4514;
        this.field218 = arg1;
        this.field222 = arg2;
        this.field224 = arg3;
        this.field225 = 0;
        this.method130();
    }
}
