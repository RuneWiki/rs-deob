import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class248 extends class82 {

    @OriginalMember(owner = "client!lm", name = "u", descriptor = "I")
    private int field3713;

    @OriginalMember(owner = "client!lm", name = "p", descriptor = "I")
    private int field3708;

    @OriginalMember(owner = "client!lm", name = "o", descriptor = "Z")
    private boolean field3707;

    @OriginalMember(owner = "client!lm", name = "B", descriptor = "I")
    private int field3720;

    @OriginalMember(owner = "client!lm", name = "z", descriptor = "I")
    private int field3718;

    @OriginalMember(owner = "client!lm", name = "r", descriptor = "I")
    private int field3710;

    @OriginalMember(owner = "client!lm", name = "A", descriptor = "I")
    private int field3719;

    @OriginalMember(owner = "client!lm", name = "q", descriptor = "I")
    private int field3709;

    @OriginalMember(owner = "client!lm", name = "s", descriptor = "I")
    private int field3711;

    @OriginalMember(owner = "client!lm", name = "t", descriptor = "I")
    private int field3712;

    @OriginalMember(owner = "client!lm", name = "v", descriptor = "I")
    private int field3714;

    @OriginalMember(owner = "client!lm", name = "w", descriptor = "I")
    private int field3715;

    @OriginalMember(owner = "client!lm", name = "x", descriptor = "I")
    private int field3716;

    @OriginalMember(owner = "client!lm", name = "y", descriptor = "I")
    private int field3717;

    @OriginalMember(owner = "client!lm", name = "C", descriptor = "I")
    private int field3721;

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "([B[IIIIIIIILlm;)I", line = 3)
    private static final int method1666(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class248 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field3716 += (var14 - arg3) * arg9.field3709;
        arg9.field3712 += (var14 - arg3) * arg9.field3721;
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
        arg9.field3711 = var12 >> 2;
        arg9.field3719 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(II[B[IIIIIIIIIILlm;II)I", line = 42)
    private static final int method1667(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class248 arg13, int arg14, int arg15) {
        arg13.field3711 -= arg13.field3714 * arg5;
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
        arg13.field3711 += arg13.field3714 * var22;
        arg13.field3716 = arg6;
        arg13.field3712 = arg7;
        arg13.field3719 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "()Lms;", line = 83)
    public final class82 method720() {
        return null;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(I)V", line = 87)
    public final synchronized void method721(int arg0) {
        if (this.field3715 > 0) {
            if (arg0 >= this.field3715) {
                if (this.field3718 == Integer.MIN_VALUE) {
                    this.field3718 = 0;
                    this.field3711 = this.field3716 = this.field3712 = 0;
                    this.method947((byte) 105);
                    arg0 = this.field3715;
                }
                this.field3715 = 0;
                this.method1705();
            } else {
                this.field3711 += this.field3714 * arg0;
                this.field3716 += this.field3709 * arg0;
                this.field3712 += this.field3721 * arg0;
                this.field3715 -= arg0;
            }
        }
        class79 var2 = (class79) super.field1336;
        int var3 = this.field3713 << 8;
        int var4 = this.field3708 << 8;
        int var5 = var2.field1305.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field3717 = 0;
        }
        if (this.field3719 < 0) {
            if (this.field3720 <= 0) {
                this.method1700();
                this.method947((byte) 117);
                return;
            }
            this.field3719 = 0;
        }
        if (this.field3719 >= var5) {
            if (this.field3720 >= 0) {
                this.method1700();
                this.method947((byte) 97);
                return;
            }
            this.field3719 = var5 - 1;
        }
        this.field3719 += this.field3720 * arg0;
        if (this.field3717 < 0) {
            if (!this.field3707) {
                if (this.field3720 < 0) {
                    if (this.field3719 < var3) {
                        this.field3719 = var4 - 1 - (var4 - 1 - this.field3719) % var6;
                    }
                } else if (this.field3719 >= var4) {
                    this.field3719 = (this.field3719 - var3) % var6 + var3;
                }
            } else {
                if (this.field3720 < 0) {
                    if (this.field3719 >= var3) {
                        return;
                    }
                    this.field3719 = var3 + var3 - 1 - this.field3719;
                    this.field3720 = -this.field3720;
                }
                while (this.field3719 >= var4) {
                    this.field3719 = var4 + var4 - 1 - this.field3719;
                    this.field3720 = -this.field3720;
                    if (this.field3719 >= var3) {
                        return;
                    }
                    this.field3719 = var3 + var3 - 1 - this.field3719;
                    this.field3720 = -this.field3720;
                }
            }
        } else {
            if (this.field3717 > 0) {
                if (this.field3707) {
                    label125: {
                        if (this.field3720 < 0) {
                            if (this.field3719 >= var3) {
                                return;
                            }
                            this.field3719 = var3 + var3 - 1 - this.field3719;
                            this.field3720 = -this.field3720;
                            if (--this.field3717 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field3719 < var4) {
                                return;
                            }
                            this.field3719 = var4 + var4 - 1 - this.field3719;
                            this.field3720 = -this.field3720;
                            if (--this.field3717 == 0) {
                                break;
                            }
                            if (this.field3719 >= var3) {
                                return;
                            }
                            this.field3719 = var3 + var3 - 1 - this.field3719;
                            this.field3720 = -this.field3720;
                        } while (--this.field3717 != 0);
                    }
                } else if (this.field3720 < 0) {
                    if (this.field3719 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field3719) / var6;
                    if (var7 < this.field3717) {
                        this.field3719 += var6 * var7;
                        this.field3717 -= var7;
                        return;
                    }
                    this.field3719 += this.field3717 * var6;
                    this.field3717 = 0;
                } else {
                    if (this.field3719 < var4) {
                        return;
                    }
                    int var8 = (this.field3719 - var3) / var6;
                    if (var8 < this.field3717) {
                        this.field3719 -= var6 * var8;
                        this.field3717 -= var8;
                        return;
                    }
                    this.field3719 -= this.field3717 * var6;
                    this.field3717 = 0;
                }
            }
            if (this.field3720 < 0) {
                if (this.field3719 < 0) {
                    this.field3719 = -1;
                    this.method1700();
                    this.method947((byte) 103);
                    return;
                }
            } else if (this.field3719 >= var5) {
                this.field3719 = var5;
                this.method1700();
                this.method947((byte) 121);
            }
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(II[B[IIIIIIIILlm;II)I", line = 305)
    private static final int method1668(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class248 arg11, int arg12, int arg13) {
        arg11.field3716 -= arg11.field3709 * arg5;
        arg11.field3712 -= arg11.field3721 * arg5;
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
        arg11.field3716 += arg11.field3709 * arg5;
        arg11.field3712 += arg11.field3721 * arg5;
        arg11.field3711 = arg6;
        arg11.field3719 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(I)V", line = 339)
    public final synchronized void method1669(int arg0) {
        if (arg0 == 0) {
            this.method1674(0);
            this.method947((byte) 124);
        } else if (this.field3716 == 0 && this.field3712 == 0) {
            this.field3715 = 0;
            this.field3718 = 0;
            this.field3711 = 0;
            this.method947((byte) 98);
        } else {
            int var2 = -this.field3711;
            if (this.field3711 > var2) {
                var2 = this.field3711;
            }
            if (-this.field3716 > var2) {
                var2 = -this.field3716;
            }
            if (this.field3716 > var2) {
                var2 = this.field3716;
            }
            if (-this.field3712 > var2) {
                var2 = -this.field3712;
            }
            if (this.field3712 > var2) {
                var2 = this.field3712;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field3715 = arg0;
            this.field3718 = Integer.MIN_VALUE;
            this.field3714 = -this.field3711 / arg0;
            this.field3709 = -this.field3716 / arg0;
            this.field3721 = -this.field3712 / arg0;
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "()Lms;", line = 384)
    public final class82 method719() {
        return null;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(II)I", line = 387)
    private static final int method1670(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(II[B[IIIIIIILlm;II)I", line = 390)
    private static final int method1671(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class248 arg10, int arg11, int arg12) {
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
        arg10.field3719 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(Lrm;II)Llm;", line = 416)
    public static final class248 method1672(class79 arg0, int arg1, int arg2) {
        return arg0.field1305 != null && arg0.field1305.length != 0 ? new class248(arg0, (int) ((long) arg0.field1304 * 256L * (long) arg1 / (long) (class193.field2961 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "([B[IIIIIIILlm;)I", line = 422)
    private static final int method1673(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class248 arg8) {
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
        arg8.field3719 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!lm", name = "f", descriptor = "(I)V", line = 450)
    private final synchronized void method1674(int arg0) {
        this.method1682(arg0, this.method1687());
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(II[B[IIIIIIIILlm;II)I", line = 454)
    private static final int method1675(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class248 arg11, int arg12, int arg13) {
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
        arg11.field3719 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(I[B[IIIIIIIIIILlm;)I", line = 489)
    private static final int method1676(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class248 arg12) {
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
        arg12.field3711 += (var19 - arg4) * arg12.field3714;
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
        arg12.field3716 = var15 >> 2;
        arg12.field3712 = var16 >> 2;
        arg12.field3719 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!lm", name = "e", descriptor = "()Z", line = 542)
    public final boolean method1677() {
        return this.field3715 != 0;
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(II[B[IIIIIIIIIILlm;II)I", line = 547)
    private static final int method1678(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class248 arg13, int arg14, int arg15) {
        arg13.field3711 -= arg13.field3714 * arg5;
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
        arg13.field3711 += arg13.field3714 * var22;
        arg13.field3716 = arg6;
        arg13.field3712 = arg7;
        arg13.field3719 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "(II[B[IIIIIIIILlm;II)I", line = 592)
    private static final int method1679(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class248 arg11, int arg12, int arg13) {
        arg11.field3716 -= arg11.field3709 * arg5;
        arg11.field3712 -= arg11.field3721 * arg5;
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
        arg11.field3716 += arg11.field3709 * arg5;
        arg11.field3712 += arg11.field3721 * arg5;
        arg11.field3711 = arg6;
        arg11.field3719 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!lm", name = "g", descriptor = "(I)V", line = 625)
    public final synchronized void method1680(int arg0) {
        this.method1682(arg0 << 6, this.method1687());
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "([IIIII)I", line = 628)
    private final int method1681(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field3715 <= 0) {
                if (this.field3720 == 256 && (this.field3719 & 255) == 0) {
                    if (class162.field2453) {
                        return method1701(0, ((class79) super.field1336).field1305, arg0, this.field3719, arg1, this.field3716, this.field3712, 0, arg3, arg2, this);
                    }
                    return method1673(((class79) super.field1336).field1305, arg0, this.field3719, arg1, this.field3711, 0, arg3, arg2, this);
                }
                if (class162.field2453) {
                    return method1675(0, 0, ((class79) super.field1336).field1305, arg0, this.field3719, arg1, this.field3716, this.field3712, 0, arg3, arg2, this, this.field3720, arg4);
                }
                return method1671(0, 0, ((class79) super.field1336).field1305, arg0, this.field3719, arg1, this.field3711, 0, arg3, arg2, this, this.field3720, arg4);
            }
            int var6 = this.field3715 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field3715 += arg1;
            if (this.field3720 == 256 && (this.field3719 & 255) == 0) {
                if (class162.field2453) {
                    arg1 = method1676(0, ((class79) super.field1336).field1305, arg0, this.field3719, arg1, this.field3716, this.field3712, this.field3709, this.field3721, 0, var6, arg2, this);
                } else {
                    arg1 = method1666(((class79) super.field1336).field1305, arg0, this.field3719, arg1, this.field3711, this.field3714, 0, var6, arg2, this);
                }
            } else if (class162.field2453) {
                arg1 = method1678(0, 0, ((class79) super.field1336).field1305, arg0, this.field3719, arg1, this.field3716, this.field3712, this.field3709, this.field3721, 0, var6, arg2, this, this.field3720, arg4);
            } else {
                arg1 = method1679(0, 0, ((class79) super.field1336).field1305, arg0, this.field3719, arg1, this.field3711, this.field3714, 0, var6, arg2, this, this.field3720, arg4);
            }
            this.field3715 -= arg1;
            if (this.field3715 != 0) {
                return arg1;
            }
        } while (!this.method1703());
        return arg3;
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(II)V", line = 683)
    private final synchronized void method1682(int arg0, int arg1) {
        this.field3718 = arg0;
        this.field3710 = arg1;
        this.field3715 = 0;
        this.method1705();
    }

    @OriginalMember(owner = "client!lm", name = "f", descriptor = "()I", line = 689)
    public final synchronized int method1683() {
        return this.field3720 < 0 ? -this.field3720 : this.field3720;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(Z)V", line = 692)
    public final synchronized void method1684(boolean arg0) {
        this.field3720 = (this.field3720 >>> 31) + (this.field3720 ^ this.field3720 >> 31);
        if (arg0) {
            this.field3720 = -this.field3720;
        }
    }

    @OriginalMember(owner = "client!lm", name = "g", descriptor = "()Z", line = 698)
    public final boolean method1685() {
        return this.field3719 < 0 || this.field3719 >= ((class79) super.field1336).field1305.length << 8;
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(I[B[IIIIIIIIIILlm;)I", line = 701)
    private static final int method1686(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class248 arg12) {
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
        arg12.field3711 += (var19 - arg4) * arg12.field3714;
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
        arg12.field3716 = var15 >> 2;
        arg12.field3712 = var16 >> 2;
        arg12.field3719 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!lm", name = "h", descriptor = "()I", line = 754)
    public final synchronized int method1687() {
        return this.field3710 < 0 ? -1 : this.field3710;
    }

    @OriginalMember(owner = "client!lm", name = "i", descriptor = "()I", line = 760)
    public final synchronized int method1688() {
        return this.field3718 == Integer.MIN_VALUE ? 0 : this.field3718;
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "([B[IIIIIIIILlm;)I", line = 764)
    private static final int method1689(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class248 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field3716 += (var14 - arg3) * arg9.field3709;
        arg9.field3712 += (var14 - arg3) * arg9.field3721;
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
        arg9.field3711 = var12 >> 2;
        arg9.field3719 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!lm", name = "d", descriptor = "(II[B[IIIIIIIILlm;II)I", line = 799)
    private static final int method1690(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class248 arg11, int arg12, int arg13) {
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
        arg11.field3719 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(III)V", line = 833)
    public final synchronized void method1691(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1682(arg1, arg2);
        } else {
            int var4 = method1699(arg1, arg2);
            int var5 = method1670(arg1, arg2);
            if (this.field3716 == var4 && this.field3712 == var5) {
                this.field3715 = 0;
            } else {
                int var6 = arg1 - this.field3711;
                if (this.field3711 - arg1 > var6) {
                    var6 = this.field3711 - arg1;
                }
                if (var4 - this.field3716 > var6) {
                    var6 = var4 - this.field3716;
                }
                if (this.field3716 - var4 > var6) {
                    var6 = this.field3716 - var4;
                }
                if (var5 - this.field3712 > var6) {
                    var6 = var5 - this.field3712;
                }
                if (this.field3712 - var5 > var6) {
                    var6 = this.field3712 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field3715 = arg0;
                this.field3718 = arg1;
                this.field3710 = arg2;
                this.field3714 = (arg1 - this.field3711) / arg0;
                this.field3709 = (var4 - this.field3716) / arg0;
                this.field3721 = (var5 - this.field3712) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "([B[IIIIIIILlm;)I", line = 879)
    private static final int method1692(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class248 arg8) {
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
        arg8.field3719 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(I[B[IIIIIIIILlm;)I", line = 904)
    private static final int method1693(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class248 arg10) {
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
        arg10.field3719 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!lm", name = "h", descriptor = "(I)V", line = 942)
    public final synchronized void method1694(int arg0) {
        if (this.field3720 < 0) {
            this.field3720 = -arg0;
        } else {
            this.field3720 = arg0;
        }
    }

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "(II)V", line = 949)
    public final synchronized void method1695(int arg0, int arg1) {
        this.method1691(arg0, arg1, this.method1687());
    }

    @OriginalMember(owner = "client!lm", name = "d", descriptor = "()I", line = 953)
    public final int method724() {
        int var1 = this.field3711 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field3717 == 0) {
            var2 -= this.field3719 * var2 / (((class79) super.field1336).field1305.length << 8);
        } else if (this.field3717 >= 0) {
            var2 -= this.field3713 * var2 / ((class79) super.field1336).field1305.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(II[B[IIIIIIILlm;II)I", line = 965)
    private static final int method1696(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class248 arg10, int arg11, int arg12) {
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
        arg10.field3719 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!lm", name = "i", descriptor = "(I)V", line = 992)
    public final synchronized void method1697(int arg0) {
        this.field3717 = arg0;
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "([IIIII)I", line = 996)
    private final int method1698(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field3715 <= 0) {
                if (this.field3720 == -256 && (this.field3719 & 255) == 0) {
                    if (class162.field2453) {
                        return method1693(0, ((class79) super.field1336).field1305, arg0, this.field3719, arg1, this.field3716, this.field3712, 0, arg3, arg2, this);
                    }
                    return method1692(((class79) super.field1336).field1305, arg0, this.field3719, arg1, this.field3711, 0, arg3, arg2, this);
                }
                if (class162.field2453) {
                    return method1690(0, 0, ((class79) super.field1336).field1305, arg0, this.field3719, arg1, this.field3716, this.field3712, 0, arg3, arg2, this, this.field3720, arg4);
                }
                return method1696(0, 0, ((class79) super.field1336).field1305, arg0, this.field3719, arg1, this.field3711, 0, arg3, arg2, this, this.field3720, arg4);
            }
            int var6 = this.field3715 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field3715 += arg1;
            if (this.field3720 == -256 && (this.field3719 & 255) == 0) {
                if (class162.field2453) {
                    arg1 = method1686(0, ((class79) super.field1336).field1305, arg0, this.field3719, arg1, this.field3716, this.field3712, this.field3709, this.field3721, 0, var6, arg2, this);
                } else {
                    arg1 = method1689(((class79) super.field1336).field1305, arg0, this.field3719, arg1, this.field3711, this.field3714, 0, var6, arg2, this);
                }
            } else if (class162.field2453) {
                arg1 = method1667(0, 0, ((class79) super.field1336).field1305, arg0, this.field3719, arg1, this.field3716, this.field3712, this.field3709, this.field3721, 0, var6, arg2, this, this.field3720, arg4);
            } else {
                arg1 = method1668(0, 0, ((class79) super.field1336).field1305, arg0, this.field3719, arg1, this.field3711, this.field3714, 0, var6, arg2, this, this.field3720, arg4);
            }
            this.field3715 -= arg1;
            if (this.field3715 != 0) {
                return arg1;
            }
        } while (!this.method1703());
        return arg3;
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "([III)V", line = 1051)
    public final synchronized void method725(int[] arg0, int arg1, int arg2) {
        if (this.field3718 == 0 && this.field3715 == 0) {
            this.method721(arg2);
        } else {
            class79 var4 = (class79) super.field1336;
            int var5 = this.field3713 << 8;
            int var6 = this.field3708 << 8;
            int var7 = var4.field1305.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field3717 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field3719 < 0) {
                if (this.field3720 <= 0) {
                    this.method1700();
                    this.method947((byte) 112);
                    return;
                }
                this.field3719 = 0;
            }
            if (this.field3719 >= var7) {
                if (this.field3720 >= 0) {
                    this.method1700();
                    this.method947((byte) 94);
                    return;
                }
                this.field3719 = var7 - 1;
            }
            if (this.field3717 < 0) {
                if (this.field3707) {
                    if (this.field3720 < 0) {
                        var9 = this.method1698(arg0, arg1, var5, var10, var4.field1305[this.field3713]);
                        if (this.field3719 >= var5) {
                            return;
                        }
                        this.field3719 = var5 + var5 - 1 - this.field3719;
                        this.field3720 = -this.field3720;
                    }
                    while (true) {
                        int var11 = this.method1681(arg0, var9, var6, var10, var4.field1305[this.field3708 - 1]);
                        if (this.field3719 < var6) {
                            return;
                        }
                        this.field3719 = var6 + var6 - 1 - this.field3719;
                        this.field3720 = -this.field3720;
                        var9 = this.method1698(arg0, var11, var5, var10, var4.field1305[this.field3713]);
                        if (this.field3719 >= var5) {
                            return;
                        }
                        this.field3719 = var5 + var5 - 1 - this.field3719;
                        this.field3720 = -this.field3720;
                    }
                } else if (this.field3720 < 0) {
                    while (true) {
                        var9 = this.method1698(arg0, var9, var5, var10, var4.field1305[this.field3708 - 1]);
                        if (this.field3719 >= var5) {
                            return;
                        }
                        this.field3719 = var6 - 1 - (var6 - 1 - this.field3719) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method1681(arg0, var9, var6, var10, var4.field1305[this.field3713]);
                        if (this.field3719 < var6) {
                            return;
                        }
                        this.field3719 = (this.field3719 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field3717 > 0) {
                    if (this.field3707) {
                        label130: {
                            if (this.field3720 < 0) {
                                var9 = this.method1698(arg0, arg1, var5, var10, var4.field1305[this.field3713]);
                                if (this.field3719 >= var5) {
                                    return;
                                }
                                this.field3719 = var5 + var5 - 1 - this.field3719;
                                this.field3720 = -this.field3720;
                                if (--this.field3717 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method1681(arg0, var9, var6, var10, var4.field1305[this.field3708 - 1]);
                                if (this.field3719 < var6) {
                                    return;
                                }
                                this.field3719 = var6 + var6 - 1 - this.field3719;
                                this.field3720 = -this.field3720;
                                if (--this.field3717 == 0) {
                                    break;
                                }
                                var9 = this.method1698(arg0, var9, var5, var10, var4.field1305[this.field3713]);
                                if (this.field3719 >= var5) {
                                    return;
                                }
                                this.field3719 = var5 + var5 - 1 - this.field3719;
                                this.field3720 = -this.field3720;
                            } while (--this.field3717 != 0);
                        }
                    } else if (this.field3720 < 0) {
                        while (true) {
                            var9 = this.method1698(arg0, var9, var5, var10, var4.field1305[this.field3708 - 1]);
                            if (this.field3719 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field3719) / var8;
                            if (var12 >= this.field3717) {
                                this.field3719 += this.field3717 * var8;
                                this.field3717 = 0;
                                break;
                            }
                            this.field3719 += var8 * var12;
                            this.field3717 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method1681(arg0, var9, var6, var10, var4.field1305[this.field3713]);
                            if (this.field3719 < var6) {
                                return;
                            }
                            int var13 = (this.field3719 - var5) / var8;
                            if (var13 >= this.field3717) {
                                this.field3719 -= this.field3717 * var8;
                                this.field3717 = 0;
                                break;
                            }
                            this.field3719 -= var8 * var13;
                            this.field3717 -= var13;
                        }
                    }
                }
                if (this.field3720 < 0) {
                    this.method1698(arg0, var9, 0, var10, 0);
                    if (this.field3719 < 0) {
                        this.field3719 = -1;
                        this.method1700();
                        this.method947((byte) 100);
                        return;
                    }
                } else {
                    this.method1681(arg0, var9, var7, var10, 0);
                    if (this.field3719 >= var7) {
                        this.field3719 = var7;
                        this.method1700();
                        this.method947((byte) 116);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lm", name = "d", descriptor = "(II)I", line = 1286)
    private static final int method1699(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!lm", name = "j", descriptor = "()V", line = 1291)
    private final void method1700() {
        if (this.field3715 != 0) {
            if (this.field3718 == Integer.MIN_VALUE) {
                this.field3718 = 0;
            }
            this.field3715 = 0;
            this.method1705();
        }
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(I[B[IIIIIIIILlm;)I", line = 1304)
    private static final int method1701(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class248 arg10) {
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
        arg10.field3719 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!lm", name = "j", descriptor = "(I)V", line = 1344)
    public final synchronized void method1702(int arg0) {
        int var2 = ((class79) super.field1336).field1305.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field3719 = arg0;
    }

    @OriginalMember(owner = "client!lm", name = "k", descriptor = "()Z", line = 1355)
    private final boolean method1703() {
        int var1 = this.field3718;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1699(var1, this.field3710);
            var2 = method1670(var1, this.field3710);
        }
        if (this.field3711 == var1 && this.field3716 == var3 && this.field3712 == var2) {
            if (this.field3718 == Integer.MIN_VALUE) {
                this.field3718 = 0;
                this.field3711 = this.field3716 = this.field3712 = 0;
                this.method947((byte) 120);
                return true;
            } else {
                this.method1705();
                return false;
            }
        } else {
            if (this.field3711 < var1) {
                this.field3714 = 1;
                this.field3715 = var1 - this.field3711;
            } else if (this.field3711 > var1) {
                this.field3714 = -1;
                this.field3715 = this.field3711 - var1;
            } else {
                this.field3714 = 0;
            }
            if (this.field3716 < var3) {
                this.field3709 = 1;
                if (this.field3715 == 0 || this.field3715 > var3 - this.field3716) {
                    this.field3715 = var3 - this.field3716;
                }
            } else if (this.field3716 > var3) {
                this.field3709 = -1;
                if (this.field3715 == 0 || this.field3715 > this.field3716 - var3) {
                    this.field3715 = this.field3716 - var3;
                }
            } else {
                this.field3709 = 0;
            }
            if (this.field3712 < var2) {
                this.field3721 = 1;
                if (this.field3715 == 0 || this.field3715 > var2 - this.field3712) {
                    this.field3715 = var2 - this.field3712;
                }
            } else if (this.field3712 > var2) {
                this.field3721 = -1;
                if (this.field3715 == 0 || this.field3715 > this.field3712 - var2) {
                    this.field3715 = this.field3712 - var2;
                }
            } else {
                this.field3721 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(Lrm;III)Llm;", line = 1440)
    public static final class248 method1704(class79 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1305 != null && arg0.field1305.length != 0 ? new class248(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(Lrm;II)V", line = 1446)
    private class248(class79 arg0, int arg1, int arg2) {
        super.field1336 = arg0;
        this.field3713 = arg0.field1303;
        this.field3708 = arg0.field1302;
        this.field3707 = arg0.field1301;
        this.field3720 = arg1;
        this.field3718 = arg2;
        this.field3710 = 8192;
        this.field3719 = 0;
        this.method1705();
    }

    @OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(Lrm;III)V", line = 1457)
    private class248(class79 arg0, int arg1, int arg2, int arg3) {
        super.field1336 = arg0;
        this.field3713 = arg0.field1303;
        this.field3708 = arg0.field1302;
        this.field3707 = arg0.field1301;
        this.field3720 = arg1;
        this.field3718 = arg2;
        this.field3710 = arg3;
        this.field3719 = 0;
        this.method1705();
    }

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "()I", line = 1470)
    public final int method722() {
        return this.field3718 == 0 && this.field3715 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!lm", name = "l", descriptor = "()V", line = 1476)
    private final void method1705() {
        this.field3711 = this.field3718;
        this.field3716 = method1699(this.field3718, this.field3710);
        this.field3712 = method1670(this.field3718, this.field3710);
    }
}
