import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class7 extends class79 {

    @OriginalMember(owner = "client!il", name = "E", descriptor = "I")
    private int field207;

    @OriginalMember(owner = "client!il", name = "y", descriptor = "I")
    private int field201;

    @OriginalMember(owner = "client!il", name = "r", descriptor = "Z")
    private boolean field194;

    @OriginalMember(owner = "client!il", name = "A", descriptor = "I")
    private int field203;

    @OriginalMember(owner = "client!il", name = "u", descriptor = "I")
    private int field197;

    @OriginalMember(owner = "client!il", name = "z", descriptor = "I")
    private int field202;

    @OriginalMember(owner = "client!il", name = "t", descriptor = "I")
    private int field196;

    @OriginalMember(owner = "client!il", name = "s", descriptor = "I")
    private int field195;

    @OriginalMember(owner = "client!il", name = "v", descriptor = "I")
    private int field198;

    @OriginalMember(owner = "client!il", name = "w", descriptor = "I")
    private int field199;

    @OriginalMember(owner = "client!il", name = "x", descriptor = "I")
    private int field200;

    @OriginalMember(owner = "client!il", name = "B", descriptor = "I")
    private int field204;

    @OriginalMember(owner = "client!il", name = "C", descriptor = "I")
    private int field205;

    @OriginalMember(owner = "client!il", name = "D", descriptor = "I")
    private int field206;

    @OriginalMember(owner = "client!il", name = "F", descriptor = "I")
    private int field208;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(II[B[IIIIIIIIIILil;II)I")
    private static final int method56(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class7 arg13, int arg14, int arg15) {
        arg13.field208 -= arg13.field200 * arg5;
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
        arg13.field208 += arg13.field200 * var22;
        arg13.field206 = arg6;
        arg13.field198 = arg7;
        arg13.field196 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!il", name = "e", descriptor = "()Z")
    public final boolean method57() {
        return this.field196 < 0 || this.field196 >= ((class404) super.field1180).field5566.length << 8;
    }

    @OriginalMember(owner = "client!il", name = "f", descriptor = "()V")
    private final void method58() {
        this.field208 = this.field197;
        this.field206 = method101(this.field197, this.field202);
        this.field198 = method97(this.field197, this.field202);
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(II[B[IIIIIIIILil;II)I")
    private static final int method59(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class7 arg11, int arg12, int arg13) {
        arg11.field206 -= arg11.field204 * arg5;
        arg11.field198 -= arg11.field205 * arg5;
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
        arg11.field206 += arg11.field204 * arg5;
        arg11.field198 += arg11.field205 * arg5;
        arg11.field208 = arg6;
        arg11.field196 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "([B[IIIIIIILil;)I")
    private static final int method60(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class7 arg8) {
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
        arg8.field196 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "([B[IIIIIIILil;)I")
    private static final int method61(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class7 arg8) {
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
        arg8.field196 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(II[B[IIIIIIILil;II)I")
    private static final int method62(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class7 arg10, int arg11, int arg12) {
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
        arg10.field196 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!il", name = "c", descriptor = "()I")
    public final int method63() {
        int var1 = this.field208 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field195 == 0) {
            var2 -= this.field196 * var2 / (((class404) super.field1180).field5566.length << 8);
        } else if (this.field195 >= 0) {
            var2 -= this.field207 * var2 / ((class404) super.field1180).field5566.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(II)V")
    public final synchronized void method64(int arg0, int arg1) {
        this.method87(arg0, arg1, this.method65());
    }

    @OriginalMember(owner = "client!il", name = "g", descriptor = "()I")
    public final synchronized int method65() {
        return this.field202 < 0 ? -1 : this.field202;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Luo;III)Lil;")
    public static final class7 method66(class404 arg0, int arg1, int arg2, int arg3) {
        return arg0.field5566 != null && arg0.field5566.length != 0 ? new class7(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "([IIIII)I")
    private final int method67(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field199 <= 0) {
                if (this.field203 == -256 && (this.field196 & 255) == 0) {
                    if (class202.field2798) {
                        return method73(0, ((class404) super.field1180).field5566, arg0, this.field196, arg1, this.field206, this.field198, 0, arg3, arg2, this);
                    }
                    return method61(((class404) super.field1180).field5566, arg0, this.field196, arg1, this.field208, 0, arg3, arg2, this);
                }
                if (class202.field2798) {
                    return method86(0, 0, ((class404) super.field1180).field5566, arg0, this.field196, arg1, this.field206, this.field198, 0, arg3, arg2, this, this.field203, arg4);
                }
                return method62(0, 0, ((class404) super.field1180).field5566, arg0, this.field196, arg1, this.field208, 0, arg3, arg2, this, this.field203, arg4);
            }
            int var6 = this.field199 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field199 += arg1;
            if (this.field203 == -256 && (this.field196 & 255) == 0) {
                if (class202.field2798) {
                    arg1 = method100(0, ((class404) super.field1180).field5566, arg0, this.field196, arg1, this.field206, this.field198, this.field204, this.field205, 0, var6, arg2, this);
                } else {
                    arg1 = method90(((class404) super.field1180).field5566, arg0, this.field196, arg1, this.field208, this.field200, 0, var6, arg2, this);
                }
            } else if (class202.field2798) {
                arg1 = method56(0, 0, ((class404) super.field1180).field5566, arg0, this.field196, arg1, this.field206, this.field198, this.field204, this.field205, 0, var6, arg2, this, this.field203, arg4);
            } else {
                arg1 = method59(0, 0, ((class404) super.field1180).field5566, arg0, this.field196, arg1, this.field208, this.field200, 0, var6, arg2, this, this.field203, arg4);
            }
            this.field199 -= arg1;
            if (this.field199 != 0) {
                return arg1;
            }
        } while (!this.method96());
        return arg3;
    }

    @OriginalMember(owner = "client!il", name = "h", descriptor = "()Z")
    public final boolean method68() {
        return this.field199 != 0;
    }

    @OriginalMember(owner = "client!il", name = "i", descriptor = "()V")
    private final void method69() {
        if (this.field199 != 0) {
            if (this.field197 == Integer.MIN_VALUE) {
                this.field197 = 0;
            }
            this.field199 = 0;
            this.method58();
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "([B[IIIIIIIILil;)I")
    private static final int method70(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class7 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field206 += (var14 - arg3) * arg9.field204;
        arg9.field198 += (var14 - arg3) * arg9.field205;
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
        arg9.field208 = var12 >> 2;
        arg9.field196 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(I)V")
    public final synchronized void method71(int arg0) {
        if (this.field199 > 0) {
            if (arg0 >= this.field199) {
                if (this.field197 == Integer.MIN_VALUE) {
                    this.field197 = 0;
                    this.field208 = this.field206 = this.field198 = 0;
                    this.method300(false);
                    arg0 = this.field199;
                }
                this.field199 = 0;
                this.method58();
            } else {
                this.field208 += this.field200 * arg0;
                this.field206 += this.field204 * arg0;
                this.field198 += this.field205 * arg0;
                this.field199 -= arg0;
            }
        }
        class404 var2 = (class404) super.field1180;
        int var3 = this.field207 << 8;
        int var4 = this.field201 << 8;
        int var5 = var2.field5566.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field195 = 0;
        }
        if (this.field196 < 0) {
            if (this.field203 <= 0) {
                this.method69();
                this.method300(false);
                return;
            }
            this.field196 = 0;
        }
        if (this.field196 >= var5) {
            if (this.field203 >= 0) {
                this.method69();
                this.method300(false);
                return;
            }
            this.field196 = var5 - 1;
        }
        this.field196 += this.field203 * arg0;
        if (this.field195 < 0) {
            if (!this.field194) {
                if (this.field203 < 0) {
                    if (this.field196 < var3) {
                        this.field196 = var4 - 1 - (var4 - 1 - this.field196) % var6;
                    }
                } else if (this.field196 >= var4) {
                    this.field196 = (this.field196 - var3) % var6 + var3;
                }
            } else {
                if (this.field203 < 0) {
                    if (this.field196 >= var3) {
                        return;
                    }
                    this.field196 = var3 + var3 - 1 - this.field196;
                    this.field203 = -this.field203;
                }
                while (this.field196 >= var4) {
                    this.field196 = var4 + var4 - 1 - this.field196;
                    this.field203 = -this.field203;
                    if (this.field196 >= var3) {
                        return;
                    }
                    this.field196 = var3 + var3 - 1 - this.field196;
                    this.field203 = -this.field203;
                }
            }
        } else {
            if (this.field195 > 0) {
                if (this.field194) {
                    label125: {
                        if (this.field203 < 0) {
                            if (this.field196 >= var3) {
                                return;
                            }
                            this.field196 = var3 + var3 - 1 - this.field196;
                            this.field203 = -this.field203;
                            if (--this.field195 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field196 < var4) {
                                return;
                            }
                            this.field196 = var4 + var4 - 1 - this.field196;
                            this.field203 = -this.field203;
                            if (--this.field195 == 0) {
                                break;
                            }
                            if (this.field196 >= var3) {
                                return;
                            }
                            this.field196 = var3 + var3 - 1 - this.field196;
                            this.field203 = -this.field203;
                        } while (--this.field195 != 0);
                    }
                } else if (this.field203 < 0) {
                    if (this.field196 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field196) / var6;
                    if (var7 < this.field195) {
                        this.field196 += var6 * var7;
                        this.field195 -= var7;
                        return;
                    }
                    this.field196 += this.field195 * var6;
                    this.field195 = 0;
                } else {
                    if (this.field196 < var4) {
                        return;
                    }
                    int var8 = (this.field196 - var3) / var6;
                    if (var8 < this.field195) {
                        this.field196 -= var6 * var8;
                        this.field195 -= var8;
                        return;
                    }
                    this.field196 -= this.field195 * var6;
                    this.field195 = 0;
                }
            }
            if (this.field203 < 0) {
                if (this.field196 < 0) {
                    this.field196 = -1;
                    this.method69();
                    this.method300(false);
                    return;
                }
            } else if (this.field196 >= var5) {
                this.field196 = var5;
                this.method69();
                this.method300(false);
            }
        }
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(II[B[IIIIIIIILil;II)I")
    private static final int method72(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class7 arg11, int arg12, int arg13) {
        arg11.field206 -= arg11.field204 * arg5;
        arg11.field198 -= arg11.field205 * arg5;
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
        arg11.field206 += arg11.field204 * arg5;
        arg11.field198 += arg11.field205 * arg5;
        arg11.field208 = arg6;
        arg11.field196 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(I[B[IIIIIIIILil;)I")
    private static final int method73(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class7 arg10) {
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
        arg10.field196 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!il", name = "d", descriptor = "(I)V")
    public final synchronized void method74(int arg0) {
        if (arg0 == 0) {
            this.method91(0);
            this.method300(false);
        } else if (this.field206 == 0 && this.field198 == 0) {
            this.field199 = 0;
            this.field197 = 0;
            this.field208 = 0;
            this.method300(false);
        } else {
            int var2 = -this.field208;
            if (this.field208 > var2) {
                var2 = this.field208;
            }
            if (-this.field206 > var2) {
                var2 = -this.field206;
            }
            if (this.field206 > var2) {
                var2 = this.field206;
            }
            if (-this.field198 > var2) {
                var2 = -this.field198;
            }
            if (this.field198 > var2) {
                var2 = this.field198;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field199 = arg0;
            this.field197 = Integer.MIN_VALUE;
            this.field200 = -this.field208 / arg0;
            this.field204 = -this.field206 / arg0;
            this.field205 = -this.field198 / arg0;
        }
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "([IIIII)I")
    private final int method75(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field199 <= 0) {
                if (this.field203 == 256 && (this.field196 & 255) == 0) {
                    if (class202.field2798) {
                        return method77(0, ((class404) super.field1180).field5566, arg0, this.field196, arg1, this.field206, this.field198, 0, arg3, arg2, this);
                    }
                    return method60(((class404) super.field1180).field5566, arg0, this.field196, arg1, this.field208, 0, arg3, arg2, this);
                }
                if (class202.field2798) {
                    return method76(0, 0, ((class404) super.field1180).field5566, arg0, this.field196, arg1, this.field206, this.field198, 0, arg3, arg2, this, this.field203, arg4);
                }
                return method84(0, 0, ((class404) super.field1180).field5566, arg0, this.field196, arg1, this.field208, 0, arg3, arg2, this, this.field203, arg4);
            }
            int var6 = this.field199 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field199 += arg1;
            if (this.field203 == 256 && (this.field196 & 255) == 0) {
                if (class202.field2798) {
                    arg1 = method95(0, ((class404) super.field1180).field5566, arg0, this.field196, arg1, this.field206, this.field198, this.field204, this.field205, 0, var6, arg2, this);
                } else {
                    arg1 = method70(((class404) super.field1180).field5566, arg0, this.field196, arg1, this.field208, this.field200, 0, var6, arg2, this);
                }
            } else if (class202.field2798) {
                arg1 = method88(0, 0, ((class404) super.field1180).field5566, arg0, this.field196, arg1, this.field206, this.field198, this.field204, this.field205, 0, var6, arg2, this, this.field203, arg4);
            } else {
                arg1 = method72(0, 0, ((class404) super.field1180).field5566, arg0, this.field196, arg1, this.field208, this.field200, 0, var6, arg2, this, this.field203, arg4);
            }
            this.field199 -= arg1;
            if (this.field199 != 0) {
                return arg1;
            }
        } while (!this.method96());
        return arg3;
    }

    @OriginalMember(owner = "client!il", name = "c", descriptor = "(II[B[IIIIIIIILil;II)I")
    private static final int method76(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class7 arg11, int arg12, int arg13) {
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
        arg11.field196 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(I[B[IIIIIIIILil;)I")
    private static final int method77(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class7 arg10) {
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
        arg10.field196 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!il", name = "e", descriptor = "(I)V")
    public final synchronized void method78(int arg0) {
        int var2 = ((class404) super.field1180).field5566.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field196 = arg0;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Luo;II)Lil;")
    public static final class7 method79(class404 arg0, int arg1, int arg2) {
        return arg0.field5566 != null && arg0.field5566.length != 0 ? new class7(arg0, (int) ((long) arg0.field5568 * 256L * (long) arg1 / (long) (class296.field3877 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "([III)V")
    public final synchronized void method80(int[] arg0, int arg1, int arg2) {
        if (this.field197 == 0 && this.field199 == 0) {
            this.method71(arg2);
        } else {
            class404 var4 = (class404) super.field1180;
            int var5 = this.field207 << 8;
            int var6 = this.field201 << 8;
            int var7 = var4.field5566.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field195 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field196 < 0) {
                if (this.field203 <= 0) {
                    this.method69();
                    this.method300(false);
                    return;
                }
                this.field196 = 0;
            }
            if (this.field196 >= var7) {
                if (this.field203 >= 0) {
                    this.method69();
                    this.method300(false);
                    return;
                }
                this.field196 = var7 - 1;
            }
            if (this.field195 < 0) {
                if (this.field194) {
                    if (this.field203 < 0) {
                        var9 = this.method67(arg0, arg1, var5, var10, var4.field5566[this.field207]);
                        if (this.field196 >= var5) {
                            return;
                        }
                        this.field196 = var5 + var5 - 1 - this.field196;
                        this.field203 = -this.field203;
                    }
                    while (true) {
                        int var11 = this.method75(arg0, var9, var6, var10, var4.field5566[this.field201 - 1]);
                        if (this.field196 < var6) {
                            return;
                        }
                        this.field196 = var6 + var6 - 1 - this.field196;
                        this.field203 = -this.field203;
                        var9 = this.method67(arg0, var11, var5, var10, var4.field5566[this.field207]);
                        if (this.field196 >= var5) {
                            return;
                        }
                        this.field196 = var5 + var5 - 1 - this.field196;
                        this.field203 = -this.field203;
                    }
                } else if (this.field203 < 0) {
                    while (true) {
                        var9 = this.method67(arg0, var9, var5, var10, var4.field5566[this.field201 - 1]);
                        if (this.field196 >= var5) {
                            return;
                        }
                        this.field196 = var6 - 1 - (var6 - 1 - this.field196) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method75(arg0, var9, var6, var10, var4.field5566[this.field207]);
                        if (this.field196 < var6) {
                            return;
                        }
                        this.field196 = (this.field196 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field195 > 0) {
                    if (this.field194) {
                        label130: {
                            if (this.field203 < 0) {
                                var9 = this.method67(arg0, arg1, var5, var10, var4.field5566[this.field207]);
                                if (this.field196 >= var5) {
                                    return;
                                }
                                this.field196 = var5 + var5 - 1 - this.field196;
                                this.field203 = -this.field203;
                                if (--this.field195 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method75(arg0, var9, var6, var10, var4.field5566[this.field201 - 1]);
                                if (this.field196 < var6) {
                                    return;
                                }
                                this.field196 = var6 + var6 - 1 - this.field196;
                                this.field203 = -this.field203;
                                if (--this.field195 == 0) {
                                    break;
                                }
                                var9 = this.method67(arg0, var9, var5, var10, var4.field5566[this.field207]);
                                if (this.field196 >= var5) {
                                    return;
                                }
                                this.field196 = var5 + var5 - 1 - this.field196;
                                this.field203 = -this.field203;
                            } while (--this.field195 != 0);
                        }
                    } else if (this.field203 < 0) {
                        while (true) {
                            var9 = this.method67(arg0, var9, var5, var10, var4.field5566[this.field201 - 1]);
                            if (this.field196 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field196) / var8;
                            if (var12 >= this.field195) {
                                this.field196 += this.field195 * var8;
                                this.field195 = 0;
                                break;
                            }
                            this.field196 += var8 * var12;
                            this.field195 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method75(arg0, var9, var6, var10, var4.field5566[this.field207]);
                            if (this.field196 < var6) {
                                return;
                            }
                            int var13 = (this.field196 - var5) / var8;
                            if (var13 >= this.field195) {
                                this.field196 -= this.field195 * var8;
                                this.field195 = 0;
                                break;
                            }
                            this.field196 -= var8 * var13;
                            this.field195 -= var13;
                        }
                    }
                }
                if (this.field203 < 0) {
                    this.method67(arg0, var9, 0, var10, 0);
                    if (this.field196 < 0) {
                        this.field196 = -1;
                        this.method69();
                        this.method300(false);
                        return;
                    }
                } else {
                    this.method75(arg0, var9, var7, var10, 0);
                    if (this.field196 >= var7) {
                        this.field196 = var7;
                        this.method69();
                        this.method300(false);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(II)V")
    private final synchronized void method81(int arg0, int arg1) {
        this.field197 = arg0;
        this.field202 = arg1;
        this.field199 = 0;
        this.method58();
    }

    @OriginalMember(owner = "client!il", name = "j", descriptor = "()I")
    public final synchronized int method82() {
        return this.field203 < 0 ? -this.field203 : this.field203;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "()I")
    public final int method83() {
        return this.field197 == 0 && this.field199 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(II[B[IIIIIIILil;II)I")
    private static final int method84(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class7 arg10, int arg11, int arg12) {
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
        arg10.field196 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!il", name = "f", descriptor = "(I)V")
    public final synchronized void method85(int arg0) {
        this.field195 = arg0;
    }

    @OriginalMember(owner = "client!il", name = "d", descriptor = "(II[B[IIIIIIIILil;II)I")
    private static final int method86(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class7 arg11, int arg12, int arg13) {
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
        arg11.field196 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(III)V")
    public final synchronized void method87(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method81(arg1, arg2);
        } else {
            int var4 = method101(arg1, arg2);
            int var5 = method97(arg1, arg2);
            if (this.field206 == var4 && this.field198 == var5) {
                this.field199 = 0;
            } else {
                int var6 = arg1 - this.field208;
                if (this.field208 - arg1 > var6) {
                    var6 = this.field208 - arg1;
                }
                if (var4 - this.field206 > var6) {
                    var6 = var4 - this.field206;
                }
                if (this.field206 - var4 > var6) {
                    var6 = this.field206 - var4;
                }
                if (var5 - this.field198 > var6) {
                    var6 = var5 - this.field198;
                }
                if (this.field198 - var5 > var6) {
                    var6 = this.field198 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field199 = arg0;
                this.field197 = arg1;
                this.field202 = arg2;
                this.field200 = (arg1 - this.field208) / arg0;
                this.field204 = (var4 - this.field206) / arg0;
                this.field205 = (var5 - this.field198) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(II[B[IIIIIIIIIILil;II)I")
    private static final int method88(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class7 arg13, int arg14, int arg15) {
        arg13.field208 -= arg13.field200 * arg5;
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
        arg13.field208 += arg13.field200 * var22;
        arg13.field206 = arg6;
        arg13.field198 = arg7;
        arg13.field196 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "()Lgm;")
    public final class79 method89() {
        return null;
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "([B[IIIIIIIILil;)I")
    private static final int method90(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class7 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field206 += (var14 - arg3) * arg9.field204;
        arg9.field198 += (var14 - arg3) * arg9.field205;
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
        arg9.field208 = var12 >> 2;
        arg9.field196 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!il", name = "g", descriptor = "(I)V")
    private final synchronized void method91(int arg0) {
        this.method81(arg0, this.method65());
    }

    @OriginalMember(owner = "client!il", name = "d", descriptor = "()Lgm;")
    public final class79 method92() {
        return null;
    }

    @OriginalMember(owner = "client!il", name = "k", descriptor = "()I")
    public final synchronized int method93() {
        return this.field197 == Integer.MIN_VALUE ? 0 : this.field197;
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(Z)V")
    public final synchronized void method94(boolean arg0) {
        this.field203 = (this.field203 >>> 31) + (this.field203 ^ this.field203 >> 31);
        if (arg0) {
            this.field203 = -this.field203;
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(I[B[IIIIIIIIIILil;)I")
    private static final int method95(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class7 arg12) {
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
        arg12.field208 += (var19 - arg4) * arg12.field200;
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
        arg12.field206 = var15 >> 2;
        arg12.field198 = var16 >> 2;
        arg12.field196 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!il", name = "l", descriptor = "()Z")
    private final boolean method96() {
        int var1 = this.field197;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method101(var1, this.field202);
            var2 = method97(var1, this.field202);
        }
        if (this.field208 == var1 && this.field206 == var3 && this.field198 == var2) {
            if (this.field197 == Integer.MIN_VALUE) {
                this.field197 = 0;
                this.field208 = this.field206 = this.field198 = 0;
                this.method300(false);
                return true;
            } else {
                this.method58();
                return false;
            }
        } else {
            if (this.field208 < var1) {
                this.field200 = 1;
                this.field199 = var1 - this.field208;
            } else if (this.field208 > var1) {
                this.field200 = -1;
                this.field199 = this.field208 - var1;
            } else {
                this.field200 = 0;
            }
            if (this.field206 < var3) {
                this.field204 = 1;
                if (this.field199 == 0 || this.field199 > var3 - this.field206) {
                    this.field199 = var3 - this.field206;
                }
            } else if (this.field206 > var3) {
                this.field204 = -1;
                if (this.field199 == 0 || this.field199 > this.field206 - var3) {
                    this.field199 = this.field206 - var3;
                }
            } else {
                this.field204 = 0;
            }
            if (this.field198 < var2) {
                this.field205 = 1;
                if (this.field199 == 0 || this.field199 > var2 - this.field198) {
                    this.field199 = var2 - this.field198;
                }
            } else if (this.field198 > var2) {
                this.field205 = -1;
                if (this.field199 == 0 || this.field199 > this.field198 - var2) {
                    this.field199 = this.field198 - var2;
                }
            } else {
                this.field205 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!il", name = "c", descriptor = "(II)I")
    private static final int method97(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!il", name = "h", descriptor = "(I)V")
    public final synchronized void method98(int arg0) {
        this.method81(arg0 << 6, this.method65());
    }

    @OriginalMember(owner = "client!il", name = "i", descriptor = "(I)V")
    public final synchronized void method99(int arg0) {
        if (this.field203 < 0) {
            this.field203 = -arg0;
        } else {
            this.field203 = arg0;
        }
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(I[B[IIIIIIIIIILil;)I")
    private static final int method100(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class7 arg12) {
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
        arg12.field208 += (var19 - arg4) * arg12.field200;
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
        arg12.field206 = var15 >> 2;
        arg12.field198 = var16 >> 2;
        arg12.field196 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!il", name = "<init>", descriptor = "(Luo;II)V")
    private class7(class404 arg0, int arg1, int arg2) {
        super.field1180 = arg0;
        this.field207 = arg0.field5565;
        this.field201 = arg0.field5567;
        this.field194 = arg0.field5564;
        this.field203 = arg1;
        this.field197 = arg2;
        this.field202 = 8192;
        this.field196 = 0;
        this.method58();
    }

    @OriginalMember(owner = "client!il", name = "<init>", descriptor = "(Luo;III)V")
    private class7(class404 arg0, int arg1, int arg2, int arg3) {
        super.field1180 = arg0;
        this.field207 = arg0.field5565;
        this.field201 = arg0.field5567;
        this.field194 = arg0.field5564;
        this.field203 = arg1;
        this.field197 = arg2;
        this.field202 = arg3;
        this.field196 = 0;
        this.method58();
    }

    @OriginalMember(owner = "client!il", name = "d", descriptor = "(II)I")
    private static final int method101(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }
}
