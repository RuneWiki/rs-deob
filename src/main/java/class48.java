import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class48 extends class178 {

    @OriginalMember(owner = "client!f", name = "D", descriptor = "I")
    private int field846;

    @OriginalMember(owner = "client!f", name = "z", descriptor = "I")
    private int field842;

    @OriginalMember(owner = "client!f", name = "C", descriptor = "Z")
    private boolean field845;

    @OriginalMember(owner = "client!f", name = "x", descriptor = "I")
    private int field840;

    @OriginalMember(owner = "client!f", name = "G", descriptor = "I")
    private int field848;

    @OriginalMember(owner = "client!f", name = "A", descriptor = "I")
    private int field843;

    @OriginalMember(owner = "client!f", name = "B", descriptor = "I")
    private int field844;

    @OriginalMember(owner = "client!f", name = "t", descriptor = "I")
    private int field836;

    @OriginalMember(owner = "client!f", name = "u", descriptor = "I")
    private int field837;

    @OriginalMember(owner = "client!f", name = "v", descriptor = "I")
    private int field838;

    @OriginalMember(owner = "client!f", name = "w", descriptor = "I")
    private int field839;

    @OriginalMember(owner = "client!f", name = "y", descriptor = "I")
    private int field841;

    @OriginalMember(owner = "client!f", name = "F", descriptor = "I")
    private int field847;

    @OriginalMember(owner = "client!f", name = "H", descriptor = "I")
    private int field849;

    @OriginalMember(owner = "client!f", name = "I", descriptor = "I")
    private int field850;

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(II)I")
    private static final int method301(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!f", name = "c", descriptor = "(I)V")
    public final synchronized void method302(int arg0) {
        this.field837 = arg0;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Lqe;II)Lf;")
    public static final class48 method303(class150 arg0, int arg1, int arg2) {
        return arg0.field2877 != null && arg0.field2877.length != 0 ? new class48(arg0, (int) ((long) arg0.field2879 * 256L * (long) arg1 / (long) (class57.field1003 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!f", name = "e", descriptor = "()Z")
    public final boolean method304() {
        return this.field838 != 0;
    }

    @OriginalMember(owner = "client!f", name = "c", descriptor = "(II)V")
    private final synchronized void method305(int arg0, int arg1) {
        this.field848 = arg0;
        this.field843 = arg1;
        this.field838 = 0;
        this.method330();
    }

    @OriginalMember(owner = "client!f", name = "d", descriptor = "(II)V")
    public final synchronized void method306(int arg0, int arg1) {
        this.method337(arg0, arg1, this.method327());
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(I[B[IIIIIIIILf;)I")
    private static final int method307(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class48 arg10) {
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
        arg10.field844 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!f", name = "f", descriptor = "()Z")
    public final boolean method308() {
        return this.field844 < 0 || this.field844 >= ((class150) super.field3381).field2877.length << 8;
    }

    @OriginalMember(owner = "client!f", name = "g", descriptor = "()I")
    public final synchronized int method309() {
        return this.field840 < 0 ? -this.field840 : this.field840;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "()Ltf;")
    public final class178 method310() {
        return null;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(II[B[IIIIIIILf;II)I")
    private static final int method311(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class48 arg10, int arg11, int arg12) {
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
        arg10.field844 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "([B[IIIIIIIILf;)I")
    private static final int method312(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class48 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field847 += (var14 - arg3) * arg9.field841;
        arg9.field849 += (var14 - arg3) * arg9.field839;
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
        arg9.field850 = var12 >> 2;
        arg9.field844 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "([IIIII)I")
    private final int method313(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field838 <= 0) {
                if (this.field840 == -256 && (this.field844 & 255) == 0) {
                    if (class29.field437) {
                        return method331(0, ((class150) super.field3381).field2877, arg0, this.field844, arg1, this.field847, this.field849, 0, arg3, arg2, this);
                    }
                    return method324(((class150) super.field3381).field2877, arg0, this.field844, arg1, this.field850, 0, arg3, arg2, this);
                }
                if (class29.field437) {
                    return method315(0, 0, ((class150) super.field3381).field2877, arg0, this.field844, arg1, this.field847, this.field849, 0, arg3, arg2, this, this.field840, arg4);
                }
                return method316(0, 0, ((class150) super.field3381).field2877, arg0, this.field844, arg1, this.field850, 0, arg3, arg2, this, this.field840, arg4);
            }
            int var6 = this.field838 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field838 += arg1;
            if (this.field840 == -256 && (this.field844 & 255) == 0) {
                if (class29.field437) {
                    arg1 = method319(0, ((class150) super.field3381).field2877, arg0, this.field844, arg1, this.field847, this.field849, this.field841, this.field839, 0, var6, arg2, this);
                } else {
                    arg1 = method338(((class150) super.field3381).field2877, arg0, this.field844, arg1, this.field850, this.field836, 0, var6, arg2, this);
                }
            } else if (class29.field437) {
                arg1 = method342(0, 0, ((class150) super.field3381).field2877, arg0, this.field844, arg1, this.field847, this.field849, this.field841, this.field839, 0, var6, arg2, this, this.field840, arg4);
            } else {
                arg1 = method346(0, 0, ((class150) super.field3381).field2877, arg0, this.field844, arg1, this.field850, this.field836, 0, var6, arg2, this, this.field840, arg4);
            }
            this.field838 -= arg1;
            if (this.field838 != 0) {
                return arg1;
            }
        } while (!this.method336());
        return arg3;
    }

    @OriginalMember(owner = "client!f", name = "c", descriptor = "(Z)V")
    public final synchronized void method314(boolean arg0) {
        this.field840 = (this.field840 >>> 31) + (this.field840 ^ this.field840 >> 31);
        if (arg0) {
            this.field840 = -this.field840;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(II[B[IIIIIIIILf;II)I")
    private static final int method315(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class48 arg11, int arg12, int arg13) {
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
        arg11.field844 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(II[B[IIIIIIILf;II)I")
    private static final int method316(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class48 arg10, int arg11, int arg12) {
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
        arg10.field844 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!f", name = "h", descriptor = "()V")
    private final void method317() {
        if (this.field838 != 0) {
            if (this.field848 == Integer.MIN_VALUE) {
                this.field848 = 0;
            }
            this.field838 = 0;
            this.method330();
        }
    }

    @OriginalMember(owner = "client!f", name = "d", descriptor = "(I)V")
    public final synchronized void method318(int arg0) {
        this.method305(arg0 << 6, this.method327());
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(I[B[IIIIIIIIIILf;)I")
    private static final int method319(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class48 arg12) {
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
        arg12.field850 += (var19 - arg4) * arg12.field836;
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
        arg12.field847 = var15 >> 2;
        arg12.field849 = var16 >> 2;
        arg12.field844 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "([III)V")
    public final synchronized void method320(int[] arg0, int arg1, int arg2) {
        if (this.field848 == 0 && this.field838 == 0) {
            this.method333(arg2);
        } else {
            class150 var4 = (class150) super.field3381;
            int var5 = this.field846 << 8;
            int var6 = this.field842 << 8;
            int var7 = var4.field2877.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field837 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field844 < 0) {
                if (this.field840 <= 0) {
                    this.method317();
                    this.method848(false);
                    return;
                }
                this.field844 = 0;
            }
            if (this.field844 >= var7) {
                if (this.field840 >= 0) {
                    this.method317();
                    this.method848(false);
                    return;
                }
                this.field844 = var7 - 1;
            }
            if (this.field837 < 0) {
                if (this.field845) {
                    if (this.field840 < 0) {
                        var9 = this.method313(arg0, arg1, var5, var10, var4.field2877[this.field846]);
                        if (this.field844 >= var5) {
                            return;
                        }
                        this.field844 = var5 + var5 - 1 - this.field844;
                        this.field840 = -this.field840;
                    }
                    while (true) {
                        int var11 = this.method321(arg0, var9, var6, var10, var4.field2877[this.field842 - 1]);
                        if (this.field844 < var6) {
                            return;
                        }
                        this.field844 = var6 + var6 - 1 - this.field844;
                        this.field840 = -this.field840;
                        var9 = this.method313(arg0, var11, var5, var10, var4.field2877[this.field846]);
                        if (this.field844 >= var5) {
                            return;
                        }
                        this.field844 = var5 + var5 - 1 - this.field844;
                        this.field840 = -this.field840;
                    }
                } else if (this.field840 < 0) {
                    while (true) {
                        var9 = this.method313(arg0, var9, var5, var10, var4.field2877[this.field842 - 1]);
                        if (this.field844 >= var5) {
                            return;
                        }
                        this.field844 = var6 - 1 - (var6 - 1 - this.field844) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method321(arg0, var9, var6, var10, var4.field2877[this.field846]);
                        if (this.field844 < var6) {
                            return;
                        }
                        this.field844 = (this.field844 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field837 > 0) {
                    if (this.field845) {
                        label130: {
                            if (this.field840 < 0) {
                                var9 = this.method313(arg0, arg1, var5, var10, var4.field2877[this.field846]);
                                if (this.field844 >= var5) {
                                    return;
                                }
                                this.field844 = var5 + var5 - 1 - this.field844;
                                this.field840 = -this.field840;
                                if (--this.field837 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method321(arg0, var9, var6, var10, var4.field2877[this.field842 - 1]);
                                if (this.field844 < var6) {
                                    return;
                                }
                                this.field844 = var6 + var6 - 1 - this.field844;
                                this.field840 = -this.field840;
                                if (--this.field837 == 0) {
                                    break;
                                }
                                var9 = this.method313(arg0, var9, var5, var10, var4.field2877[this.field846]);
                                if (this.field844 >= var5) {
                                    return;
                                }
                                this.field844 = var5 + var5 - 1 - this.field844;
                                this.field840 = -this.field840;
                            } while (--this.field837 != 0);
                        }
                    } else if (this.field840 < 0) {
                        while (true) {
                            var9 = this.method313(arg0, var9, var5, var10, var4.field2877[this.field842 - 1]);
                            if (this.field844 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field844) / var8;
                            if (var12 >= this.field837) {
                                this.field844 += this.field837 * var8;
                                this.field837 = 0;
                                break;
                            }
                            this.field844 += var8 * var12;
                            this.field837 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method321(arg0, var9, var6, var10, var4.field2877[this.field846]);
                            if (this.field844 < var6) {
                                return;
                            }
                            int var13 = (this.field844 - var5) / var8;
                            if (var13 >= this.field837) {
                                this.field844 -= this.field837 * var8;
                                this.field837 = 0;
                                break;
                            }
                            this.field844 -= var8 * var13;
                            this.field837 -= var13;
                        }
                    }
                }
                if (this.field840 < 0) {
                    this.method313(arg0, var9, 0, var10, 0);
                    if (this.field844 < 0) {
                        this.field844 = -1;
                        this.method317();
                        this.method848(false);
                        return;
                    }
                } else {
                    this.method321(arg0, var9, var7, var10, 0);
                    if (this.field844 >= var7) {
                        this.field844 = var7;
                        this.method317();
                        this.method848(false);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "([IIIII)I")
    private final int method321(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field838 <= 0) {
                if (this.field840 == 256 && (this.field844 & 255) == 0) {
                    if (class29.field437) {
                        return method307(0, ((class150) super.field3381).field2877, arg0, this.field844, arg1, this.field847, this.field849, 0, arg3, arg2, this);
                    }
                    return method325(((class150) super.field3381).field2877, arg0, this.field844, arg1, this.field850, 0, arg3, arg2, this);
                }
                if (class29.field437) {
                    return method332(0, 0, ((class150) super.field3381).field2877, arg0, this.field844, arg1, this.field847, this.field849, 0, arg3, arg2, this, this.field840, arg4);
                }
                return method311(0, 0, ((class150) super.field3381).field2877, arg0, this.field844, arg1, this.field850, 0, arg3, arg2, this, this.field840, arg4);
            }
            int var6 = this.field838 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field838 += arg1;
            if (this.field840 == 256 && (this.field844 & 255) == 0) {
                if (class29.field437) {
                    arg1 = method340(0, ((class150) super.field3381).field2877, arg0, this.field844, arg1, this.field847, this.field849, this.field841, this.field839, 0, var6, arg2, this);
                } else {
                    arg1 = method312(((class150) super.field3381).field2877, arg0, this.field844, arg1, this.field850, this.field836, 0, var6, arg2, this);
                }
            } else if (class29.field437) {
                arg1 = method322(0, 0, ((class150) super.field3381).field2877, arg0, this.field844, arg1, this.field847, this.field849, this.field841, this.field839, 0, var6, arg2, this, this.field840, arg4);
            } else {
                arg1 = method335(0, 0, ((class150) super.field3381).field2877, arg0, this.field844, arg1, this.field850, this.field836, 0, var6, arg2, this, this.field840, arg4);
            }
            this.field838 -= arg1;
            if (this.field838 != 0) {
                return arg1;
            }
        } while (!this.method336());
        return arg3;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(II[B[IIIIIIIIIILf;II)I")
    private static final int method322(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class48 arg13, int arg14, int arg15) {
        arg13.field850 -= arg13.field836 * arg5;
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
        arg13.field850 += arg13.field836 * var22;
        arg13.field847 = arg6;
        arg13.field849 = arg7;
        arg13.field844 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!f", name = "e", descriptor = "(I)V")
    public final synchronized void method323(int arg0) {
        int var2 = ((class150) super.field3381).field2877.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field844 = arg0;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "([B[IIIIIIILf;)I")
    private static final int method324(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class48 arg8) {
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
        arg8.field844 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "([B[IIIIIIILf;)I")
    private static final int method325(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class48 arg8) {
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
        arg8.field844 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!f", name = "e", descriptor = "(II)I")
    private static final int method326(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!f", name = "i", descriptor = "()I")
    public final synchronized int method327() {
        return this.field843 < 0 ? -1 : this.field843;
    }

    @OriginalMember(owner = "client!f", name = "f", descriptor = "(I)V")
    private final synchronized void method328(int arg0) {
        this.method305(arg0, this.method327());
    }

    @OriginalMember(owner = "client!f", name = "g", descriptor = "(I)V")
    public final synchronized void method329(int arg0) {
        if (arg0 == 0) {
            this.method328(0);
            this.method848(false);
        } else if (this.field847 == 0 && this.field849 == 0) {
            this.field838 = 0;
            this.field848 = 0;
            this.field850 = 0;
            this.method848(false);
        } else {
            int var2 = -this.field850;
            if (this.field850 > var2) {
                var2 = this.field850;
            }
            if (-this.field847 > var2) {
                var2 = -this.field847;
            }
            if (this.field847 > var2) {
                var2 = this.field847;
            }
            if (-this.field849 > var2) {
                var2 = -this.field849;
            }
            if (this.field849 > var2) {
                var2 = this.field849;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field838 = arg0;
            this.field848 = Integer.MIN_VALUE;
            this.field836 = -this.field850 / arg0;
            this.field841 = -this.field847 / arg0;
            this.field839 = -this.field849 / arg0;
        }
    }

    @OriginalMember(owner = "client!f", name = "j", descriptor = "()V")
    private final void method330() {
        this.field850 = this.field848;
        this.field847 = method301(this.field848, this.field843);
        this.field849 = method326(this.field848, this.field843);
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(I[B[IIIIIIIILf;)I")
    private static final int method331(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class48 arg10) {
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
        arg10.field844 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(II[B[IIIIIIIILf;II)I")
    private static final int method332(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class48 arg11, int arg12, int arg13) {
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
        arg11.field844 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(I)V")
    public final synchronized void method333(int arg0) {
        if (this.field838 > 0) {
            if (arg0 >= this.field838) {
                if (this.field848 == Integer.MIN_VALUE) {
                    this.field848 = 0;
                    this.field850 = this.field847 = this.field849 = 0;
                    this.method848(false);
                    arg0 = this.field838;
                }
                this.field838 = 0;
                this.method330();
            } else {
                this.field850 += this.field836 * arg0;
                this.field847 += this.field841 * arg0;
                this.field849 += this.field839 * arg0;
                this.field838 -= arg0;
            }
        }
        class150 var2 = (class150) super.field3381;
        int var3 = this.field846 << 8;
        int var4 = this.field842 << 8;
        int var5 = var2.field2877.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field837 = 0;
        }
        if (this.field844 < 0) {
            if (this.field840 <= 0) {
                this.method317();
                this.method848(false);
                return;
            }
            this.field844 = 0;
        }
        if (this.field844 >= var5) {
            if (this.field840 >= 0) {
                this.method317();
                this.method848(false);
                return;
            }
            this.field844 = var5 - 1;
        }
        this.field844 += this.field840 * arg0;
        if (this.field837 < 0) {
            if (!this.field845) {
                if (this.field840 < 0) {
                    if (this.field844 < var3) {
                        this.field844 = var4 - 1 - (var4 - 1 - this.field844) % var6;
                    }
                } else if (this.field844 >= var4) {
                    this.field844 = (this.field844 - var3) % var6 + var3;
                }
            } else {
                if (this.field840 < 0) {
                    if (this.field844 >= var3) {
                        return;
                    }
                    this.field844 = var3 + var3 - 1 - this.field844;
                    this.field840 = -this.field840;
                }
                while (this.field844 >= var4) {
                    this.field844 = var4 + var4 - 1 - this.field844;
                    this.field840 = -this.field840;
                    if (this.field844 >= var3) {
                        return;
                    }
                    this.field844 = var3 + var3 - 1 - this.field844;
                    this.field840 = -this.field840;
                }
            }
        } else {
            if (this.field837 > 0) {
                if (this.field845) {
                    label125: {
                        if (this.field840 < 0) {
                            if (this.field844 >= var3) {
                                return;
                            }
                            this.field844 = var3 + var3 - 1 - this.field844;
                            this.field840 = -this.field840;
                            if (--this.field837 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field844 < var4) {
                                return;
                            }
                            this.field844 = var4 + var4 - 1 - this.field844;
                            this.field840 = -this.field840;
                            if (--this.field837 == 0) {
                                break;
                            }
                            if (this.field844 >= var3) {
                                return;
                            }
                            this.field844 = var3 + var3 - 1 - this.field844;
                            this.field840 = -this.field840;
                        } while (--this.field837 != 0);
                    }
                } else if (this.field840 < 0) {
                    if (this.field844 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field844) / var6;
                    if (var7 < this.field837) {
                        this.field844 += var6 * var7;
                        this.field837 -= var7;
                        return;
                    }
                    this.field844 += this.field837 * var6;
                    this.field837 = 0;
                } else {
                    if (this.field844 < var4) {
                        return;
                    }
                    int var8 = (this.field844 - var3) / var6;
                    if (var8 < this.field837) {
                        this.field844 -= var6 * var8;
                        this.field837 -= var8;
                        return;
                    }
                    this.field844 -= this.field837 * var6;
                    this.field837 = 0;
                }
            }
            if (this.field840 < 0) {
                if (this.field844 < 0) {
                    this.field844 = -1;
                    this.method317();
                    this.method848(false);
                    return;
                }
            } else if (this.field844 >= var5) {
                this.field844 = var5;
                this.method317();
                this.method848(false);
            }
        }
    }

    @OriginalMember(owner = "client!f", name = "d", descriptor = "()I")
    public final int method334() {
        return this.field848 == 0 && this.field838 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!f", name = "c", descriptor = "(II[B[IIIIIIIILf;II)I")
    private static final int method335(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class48 arg11, int arg12, int arg13) {
        arg11.field847 -= arg11.field841 * arg5;
        arg11.field849 -= arg11.field839 * arg5;
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
        arg11.field847 += arg11.field841 * arg5;
        arg11.field849 += arg11.field839 * arg5;
        arg11.field850 = arg6;
        arg11.field844 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!f", name = "k", descriptor = "()Z")
    private final boolean method336() {
        int var1 = this.field848;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method301(var1, this.field843);
            var2 = method326(var1, this.field843);
        }
        if (this.field850 == var1 && this.field847 == var3 && this.field849 == var2) {
            if (this.field848 == Integer.MIN_VALUE) {
                this.field848 = 0;
                this.field850 = this.field847 = this.field849 = 0;
                this.method848(false);
                return true;
            } else {
                this.method330();
                return false;
            }
        } else {
            if (this.field850 < var1) {
                this.field836 = 1;
                this.field838 = var1 - this.field850;
            } else if (this.field850 > var1) {
                this.field836 = -1;
                this.field838 = this.field850 - var1;
            } else {
                this.field836 = 0;
            }
            if (this.field847 < var3) {
                this.field841 = 1;
                if (this.field838 == 0 || this.field838 > var3 - this.field847) {
                    this.field838 = var3 - this.field847;
                }
            } else if (this.field847 > var3) {
                this.field841 = -1;
                if (this.field838 == 0 || this.field838 > this.field847 - var3) {
                    this.field838 = this.field847 - var3;
                }
            } else {
                this.field841 = 0;
            }
            if (this.field849 < var2) {
                this.field839 = 1;
                if (this.field838 == 0 || this.field838 > var2 - this.field849) {
                    this.field838 = var2 - this.field849;
                }
            } else if (this.field849 > var2) {
                this.field839 = -1;
                if (this.field838 == 0 || this.field838 > this.field849 - var2) {
                    this.field838 = this.field849 - var2;
                }
            } else {
                this.field839 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(III)V")
    public final synchronized void method337(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method305(arg1, arg2);
        } else {
            int var4 = method301(arg1, arg2);
            int var5 = method326(arg1, arg2);
            if (this.field847 == var4 && this.field849 == var5) {
                this.field838 = 0;
            } else {
                int var6 = arg1 - this.field850;
                if (this.field850 - arg1 > var6) {
                    var6 = this.field850 - arg1;
                }
                if (var4 - this.field847 > var6) {
                    var6 = var4 - this.field847;
                }
                if (this.field847 - var4 > var6) {
                    var6 = this.field847 - var4;
                }
                if (var5 - this.field849 > var6) {
                    var6 = var5 - this.field849;
                }
                if (this.field849 - var5 > var6) {
                    var6 = this.field849 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field838 = arg0;
                this.field848 = arg1;
                this.field843 = arg2;
                this.field836 = (arg1 - this.field850) / arg0;
                this.field841 = (var4 - this.field847) / arg0;
                this.field839 = (var5 - this.field849) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "([B[IIIIIIIILf;)I")
    private static final int method338(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class48 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field847 += (var14 - arg3) * arg9.field841;
        arg9.field849 += (var14 - arg3) * arg9.field839;
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
        arg9.field850 = var12 >> 2;
        arg9.field844 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!f", name = "c", descriptor = "()I")
    public final int method339() {
        int var1 = this.field850 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field837 == 0) {
            var2 -= this.field844 * var2 / (((class150) super.field3381).field2877.length << 8);
        } else if (this.field837 >= 0) {
            var2 -= this.field846 * var2 / ((class150) super.field3381).field2877.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(I[B[IIIIIIIIIILf;)I")
    private static final int method340(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class48 arg12) {
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
        arg12.field850 += (var19 - arg4) * arg12.field836;
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
        arg12.field847 = var15 >> 2;
        arg12.field849 = var16 >> 2;
        arg12.field844 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Lqe;III)Lf;")
    public static final class48 method341(class150 arg0, int arg1, int arg2, int arg3) {
        return arg0.field2877 != null && arg0.field2877.length != 0 ? new class48(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(II[B[IIIIIIIIIILf;II)I")
    private static final int method342(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class48 arg13, int arg14, int arg15) {
        arg13.field850 -= arg13.field836 * arg5;
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
        arg13.field850 += arg13.field836 * var22;
        arg13.field847 = arg6;
        arg13.field849 = arg7;
        arg13.field844 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!f", name = "l", descriptor = "()I")
    public final synchronized int method343() {
        return this.field848 == Integer.MIN_VALUE ? 0 : this.field848;
    }

    @OriginalMember(owner = "client!f", name = "h", descriptor = "(I)V")
    public final synchronized void method344(int arg0) {
        if (this.field840 < 0) {
            this.field840 = -arg0;
        } else {
            this.field840 = arg0;
        }
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "()Ltf;")
    public final class178 method345() {
        return null;
    }

    @OriginalMember(owner = "client!f", name = "<init>", descriptor = "(Lqe;II)V")
    private class48(class150 arg0, int arg1, int arg2) {
        super.field3381 = arg0;
        this.field846 = arg0.field2876;
        this.field842 = arg0.field2878;
        this.field845 = arg0.field2880;
        this.field840 = arg1;
        this.field848 = arg2;
        this.field843 = 8192;
        this.field844 = 0;
        this.method330();
    }

    @OriginalMember(owner = "client!f", name = "<init>", descriptor = "(Lqe;III)V")
    private class48(class150 arg0, int arg1, int arg2, int arg3) {
        super.field3381 = arg0;
        this.field846 = arg0.field2876;
        this.field842 = arg0.field2878;
        this.field845 = arg0.field2880;
        this.field840 = arg1;
        this.field848 = arg2;
        this.field843 = arg3;
        this.field844 = 0;
        this.method330();
    }

    @OriginalMember(owner = "client!f", name = "d", descriptor = "(II[B[IIIIIIIILf;II)I")
    private static final int method346(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class48 arg11, int arg12, int arg13) {
        arg11.field847 -= arg11.field841 * arg5;
        arg11.field849 -= arg11.field839 * arg5;
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
        arg11.field847 += arg11.field841 * arg5;
        arg11.field849 += arg11.field839 * arg5;
        arg11.field850 = arg6;
        arg11.field844 = arg4;
        return arg5;
    }
}
