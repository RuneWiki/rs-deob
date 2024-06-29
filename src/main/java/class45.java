import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gs")
public class class45 extends class613 {

    @OriginalMember(owner = "client!gs", name = "y", descriptor = "I")
    private int field660;

    @OriginalMember(owner = "client!gs", name = "u", descriptor = "I")
    private int field656;

    @OriginalMember(owner = "client!gs", name = "x", descriptor = "Z")
    private boolean field659;

    @OriginalMember(owner = "client!gs", name = "z", descriptor = "I")
    private int field661;

    @OriginalMember(owner = "client!gs", name = "o", descriptor = "I")
    private int field650;

    @OriginalMember(owner = "client!gs", name = "t", descriptor = "I")
    private int field655;

    @OriginalMember(owner = "client!gs", name = "v", descriptor = "I")
    private int field657;

    @OriginalMember(owner = "client!gs", name = "n", descriptor = "I")
    private int field649;

    @OriginalMember(owner = "client!gs", name = "p", descriptor = "I")
    private int field651;

    @OriginalMember(owner = "client!gs", name = "q", descriptor = "I")
    private int field652;

    @OriginalMember(owner = "client!gs", name = "r", descriptor = "I")
    private int field653;

    @OriginalMember(owner = "client!gs", name = "s", descriptor = "I")
    private int field654;

    @OriginalMember(owner = "client!gs", name = "w", descriptor = "I")
    private int field658;

    @OriginalMember(owner = "client!gs", name = "A", descriptor = "I")
    private int field662;

    @OriginalMember(owner = "client!gs", name = "B", descriptor = "I")
    private int field663;

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "()Llea;")
    public final class613 method317() {
        return null;
    }

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "(I)V")
    public final synchronized void method318(int arg0) {
        this.method337(arg0 << 6, this.method330());
    }

    @OriginalMember(owner = "client!gs", name = "c", descriptor = "(I)V")
    public final synchronized void method319(int arg0) {
        int var2 = ((class148) super.field8477).field2054.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field657 = arg0;
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "([B[IIIIIIILgs;)I")
    private static final int method320(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class45 arg8) {
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
        arg8.field657 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!gs", name = "e", descriptor = "(I)V")
    public final synchronized void method321(int arg0) {
        this.method337(this.method355(), arg0);
    }

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "(III)V")
    public final synchronized void method322(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method337(arg1, arg2);
        } else {
            int var4 = method361(arg1, arg2);
            int var5 = method324(arg1, arg2);
            if (this.field654 == var4 && this.field658 == var5) {
                this.field651 = 0;
            } else {
                int var6 = arg1 - this.field649;
                if (this.field649 - arg1 > var6) {
                    var6 = this.field649 - arg1;
                }
                if (var4 - this.field654 > var6) {
                    var6 = var4 - this.field654;
                }
                if (this.field654 - var4 > var6) {
                    var6 = this.field654 - var4;
                }
                if (var5 - this.field658 > var6) {
                    var6 = var5 - this.field658;
                }
                if (this.field658 - var5 > var6) {
                    var6 = this.field658 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field651 = arg0;
                this.field650 = arg1;
                this.field655 = arg2;
                this.field652 = (arg1 - this.field649) / arg0;
                this.field662 = (var4 - this.field654) / arg0;
                this.field653 = (var5 - this.field658) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(I[B[IIIIIIIIIILgs;)I")
    private static final int method323(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class45 arg12) {
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
        arg12.field649 += (var19 - arg4) * arg12.field652;
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
        arg12.field654 = var15 >> 2;
        arg12.field658 = var16 >> 2;
        arg12.field657 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(II)I")
    private static final int method324(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(II[B[IIIIIIILgs;II)I")
    private static final int method325(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class45 arg10, int arg11, int arg12) {
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
        arg10.field657 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!gs", name = "f", descriptor = "(I)V")
    public final synchronized void method326(int arg0) {
        this.field663 = arg0;
    }

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "()Llea;")
    public final class613 method327() {
        return null;
    }

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "(I[B[IIIIIIIIIILgs;)I")
    private static final int method328(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class45 arg12) {
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
        arg12.field649 += (var19 - arg4) * arg12.field652;
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
        arg12.field654 = var15 >> 2;
        arg12.field658 = var16 >> 2;
        arg12.field657 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(Lct;III)Lgs;")
    public static final class45 method329(class148 arg0, int arg1, int arg2, int arg3) {
        return arg0.field2054 != null && arg0.field2054.length != 0 ? new class45(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!gs", name = "e", descriptor = "()I")
    public final synchronized int method330() {
        return this.field655 < 0 ? -1 : this.field655;
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "([B[IIIIIIIILgs;)I")
    private static final int method331(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class45 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field654 += (var14 - arg3) * arg9.field662;
        arg9.field658 += (var14 - arg3) * arg9.field653;
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
        arg9.field649 = var12 >> 2;
        arg9.field657 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!gs", name = "f", descriptor = "()Z")
    public final boolean method332() {
        return this.field657 < 0 || this.field657 >= ((class148) super.field8477).field2054.length << 8;
    }

    @OriginalMember(owner = "client!gs", name = "g", descriptor = "()V")
    private final void method333() {
        if (this.field651 != 0) {
            if (this.field650 == Integer.MIN_VALUE) {
                this.field650 = 0;
            }
            this.field651 = 0;
            this.method353();
        }
    }

    @OriginalMember(owner = "client!gs", name = "g", descriptor = "(I)V")
    public final synchronized void method334(int arg0) {
        if (arg0 == 0) {
            this.method360(0);
            this.method1175(-2);
        } else if (this.field654 == 0 && this.field658 == 0) {
            this.field651 = 0;
            this.field650 = 0;
            this.field649 = 0;
            this.method1175(-2);
        } else {
            int var2 = -this.field649;
            if (this.field649 > var2) {
                var2 = this.field649;
            }
            if (-this.field654 > var2) {
                var2 = -this.field654;
            }
            if (this.field654 > var2) {
                var2 = this.field654;
            }
            if (-this.field658 > var2) {
                var2 = -this.field658;
            }
            if (this.field658 > var2) {
                var2 = this.field658;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field651 = arg0;
            this.field650 = Integer.MIN_VALUE;
            this.field652 = -this.field649 / arg0;
            this.field662 = -this.field654 / arg0;
            this.field653 = -this.field658 / arg0;
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(I)V")
    public final synchronized void method335(int arg0) {
        if (this.field651 > 0) {
            if (arg0 >= this.field651) {
                if (this.field650 == Integer.MIN_VALUE) {
                    this.field650 = 0;
                    this.field649 = this.field654 = this.field658 = 0;
                    this.method1175(-2);
                    arg0 = this.field651;
                }
                this.field651 = 0;
                this.method353();
            } else {
                this.field649 += this.field652 * arg0;
                this.field654 += this.field662 * arg0;
                this.field658 += this.field653 * arg0;
                this.field651 -= arg0;
            }
        }
        class148 var2 = (class148) super.field8477;
        int var3 = this.field660 << 8;
        int var4 = this.field656 << 8;
        int var5 = var2.field2054.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field663 = 0;
        }
        if (this.field657 < 0) {
            if (this.field661 <= 0) {
                this.method333();
                this.method1175(-2);
                return;
            }
            this.field657 = 0;
        }
        if (this.field657 >= var5) {
            if (this.field661 >= 0) {
                this.method333();
                this.method1175(-2);
                return;
            }
            this.field657 = var5 - 1;
        }
        this.field657 += this.field661 * arg0;
        if (this.field663 < 0) {
            if (!this.field659) {
                if (this.field661 < 0) {
                    if (this.field657 < var3) {
                        this.field657 = var4 - 1 - (var4 - 1 - this.field657) % var6;
                    }
                } else if (this.field657 >= var4) {
                    this.field657 = (this.field657 - var3) % var6 + var3;
                }
            } else {
                if (this.field661 < 0) {
                    if (this.field657 >= var3) {
                        return;
                    }
                    this.field657 = var3 + var3 - 1 - this.field657;
                    this.field661 = -this.field661;
                }
                while (this.field657 >= var4) {
                    this.field657 = var4 + var4 - 1 - this.field657;
                    this.field661 = -this.field661;
                    if (this.field657 >= var3) {
                        return;
                    }
                    this.field657 = var3 + var3 - 1 - this.field657;
                    this.field661 = -this.field661;
                }
            }
        } else {
            if (this.field663 > 0) {
                if (this.field659) {
                    label125: {
                        if (this.field661 < 0) {
                            if (this.field657 >= var3) {
                                return;
                            }
                            this.field657 = var3 + var3 - 1 - this.field657;
                            this.field661 = -this.field661;
                            if (--this.field663 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field657 < var4) {
                                return;
                            }
                            this.field657 = var4 + var4 - 1 - this.field657;
                            this.field661 = -this.field661;
                            if (--this.field663 == 0) {
                                break;
                            }
                            if (this.field657 >= var3) {
                                return;
                            }
                            this.field657 = var3 + var3 - 1 - this.field657;
                            this.field661 = -this.field661;
                        } while (--this.field663 != 0);
                    }
                } else if (this.field661 < 0) {
                    if (this.field657 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field657) / var6;
                    if (var7 < this.field663) {
                        this.field657 += var6 * var7;
                        this.field663 -= var7;
                        return;
                    }
                    this.field657 += this.field663 * var6;
                    this.field663 = 0;
                } else {
                    if (this.field657 < var4) {
                        return;
                    }
                    int var8 = (this.field657 - var3) / var6;
                    if (var8 < this.field663) {
                        this.field657 -= var6 * var8;
                        this.field663 -= var8;
                        return;
                    }
                    this.field657 -= this.field663 * var6;
                    this.field663 = 0;
                }
            }
            if (this.field661 < 0) {
                if (this.field657 < 0) {
                    this.field657 = -1;
                    this.method333();
                    this.method1175(-2);
                    return;
                }
            } else if (this.field657 >= var5) {
                this.field657 = var5;
                this.method333();
                this.method1175(-2);
            }
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(II[B[IIIIIIIILgs;II)I")
    private static final int method336(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class45 arg11, int arg12, int arg13) {
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
        arg11.field657 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "(II)V")
    private final synchronized void method337(int arg0, int arg1) {
        this.field650 = arg0;
        this.field655 = arg1;
        this.field651 = 0;
        this.method353();
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "([III)V")
    public final synchronized void method338(int[] arg0, int arg1, int arg2) {
        if (this.field650 == 0 && this.field651 == 0) {
            this.method335(arg2);
        } else {
            class148 var4 = (class148) super.field8477;
            int var5 = this.field660 << 8;
            int var6 = this.field656 << 8;
            int var7 = var4.field2054.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field663 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field657 < 0) {
                if (this.field661 <= 0) {
                    this.method333();
                    this.method1175(-2);
                    return;
                }
                this.field657 = 0;
            }
            if (this.field657 >= var7) {
                if (this.field661 >= 0) {
                    this.method333();
                    this.method1175(-2);
                    return;
                }
                this.field657 = var7 - 1;
            }
            if (this.field663 < 0) {
                if (this.field659) {
                    if (this.field661 < 0) {
                        var9 = this.method359(arg0, arg1, var5, var10, var4.field2054[this.field660]);
                        if (this.field657 >= var5) {
                            return;
                        }
                        this.field657 = var5 + var5 - 1 - this.field657;
                        this.field661 = -this.field661;
                    }
                    while (true) {
                        int var11 = this.method358(arg0, var9, var6, var10, var4.field2054[this.field656 - 1]);
                        if (this.field657 < var6) {
                            return;
                        }
                        this.field657 = var6 + var6 - 1 - this.field657;
                        this.field661 = -this.field661;
                        var9 = this.method359(arg0, var11, var5, var10, var4.field2054[this.field660]);
                        if (this.field657 >= var5) {
                            return;
                        }
                        this.field657 = var5 + var5 - 1 - this.field657;
                        this.field661 = -this.field661;
                    }
                } else if (this.field661 < 0) {
                    while (true) {
                        var9 = this.method359(arg0, var9, var5, var10, var4.field2054[this.field656 - 1]);
                        if (this.field657 >= var5) {
                            return;
                        }
                        this.field657 = var6 - 1 - (var6 - 1 - this.field657) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method358(arg0, var9, var6, var10, var4.field2054[this.field660]);
                        if (this.field657 < var6) {
                            return;
                        }
                        this.field657 = (this.field657 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field663 > 0) {
                    if (this.field659) {
                        label130: {
                            if (this.field661 < 0) {
                                var9 = this.method359(arg0, arg1, var5, var10, var4.field2054[this.field660]);
                                if (this.field657 >= var5) {
                                    return;
                                }
                                this.field657 = var5 + var5 - 1 - this.field657;
                                this.field661 = -this.field661;
                                if (--this.field663 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method358(arg0, var9, var6, var10, var4.field2054[this.field656 - 1]);
                                if (this.field657 < var6) {
                                    return;
                                }
                                this.field657 = var6 + var6 - 1 - this.field657;
                                this.field661 = -this.field661;
                                if (--this.field663 == 0) {
                                    break;
                                }
                                var9 = this.method359(arg0, var9, var5, var10, var4.field2054[this.field660]);
                                if (this.field657 >= var5) {
                                    return;
                                }
                                this.field657 = var5 + var5 - 1 - this.field657;
                                this.field661 = -this.field661;
                            } while (--this.field663 != 0);
                        }
                    } else if (this.field661 < 0) {
                        while (true) {
                            var9 = this.method359(arg0, var9, var5, var10, var4.field2054[this.field656 - 1]);
                            if (this.field657 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field657) / var8;
                            if (var12 >= this.field663) {
                                this.field657 += this.field663 * var8;
                                this.field663 = 0;
                                break;
                            }
                            this.field657 += var8 * var12;
                            this.field663 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method358(arg0, var9, var6, var10, var4.field2054[this.field660]);
                            if (this.field657 < var6) {
                                return;
                            }
                            int var13 = (this.field657 - var5) / var8;
                            if (var13 >= this.field663) {
                                this.field657 -= this.field663 * var8;
                                this.field663 = 0;
                                break;
                            }
                            this.field657 -= var8 * var13;
                            this.field663 -= var13;
                        }
                    }
                }
                if (this.field661 < 0) {
                    this.method359(arg0, var9, 0, var10, 0);
                    if (this.field657 < 0) {
                        this.field657 = -1;
                        this.method333();
                        this.method1175(-2);
                        return;
                    }
                } else {
                    this.method358(arg0, var9, var7, var10, 0);
                    if (this.field657 >= var7) {
                        this.field657 = var7;
                        this.method333();
                        this.method1175(-2);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(I[B[IIIIIIIILgs;)I")
    private static final int method339(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class45 arg10) {
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
        arg10.field657 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(Z)V")
    public final synchronized void method340(boolean arg0) {
        this.field661 = (this.field661 >>> 31) + (this.field661 ^ this.field661 >> 31);
        if (arg0) {
            this.field661 = -this.field661;
        }
    }

    @OriginalMember(owner = "client!gs", name = "c", descriptor = "(II)V")
    public final synchronized void method341(int arg0, int arg1) {
        this.method322(arg0, arg1, this.method330());
    }

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "(II[B[IIIIIIIILgs;II)I")
    private static final int method342(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class45 arg11, int arg12, int arg13) {
        arg11.field654 -= arg11.field662 * arg5;
        arg11.field658 -= arg11.field653 * arg5;
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
        arg11.field654 += arg11.field662 * arg5;
        arg11.field658 += arg11.field653 * arg5;
        arg11.field649 = arg6;
        arg11.field657 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(II[B[IIIIIIIIIILgs;II)I")
    private static final int method343(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class45 arg13, int arg14, int arg15) {
        arg13.field649 -= arg13.field652 * arg5;
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
        arg13.field649 += arg13.field652 * var22;
        arg13.field654 = arg6;
        arg13.field658 = arg7;
        arg13.field657 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "([B[IIIIIIILgs;)I")
    private static final int method344(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class45 arg8) {
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
        arg8.field657 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!gs", name = "h", descriptor = "(I)V")
    public final synchronized void method345(int arg0) {
        if (this.field661 < 0) {
            this.field661 = -arg0;
        } else {
            this.field661 = arg0;
        }
    }

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "(I[B[IIIIIIIILgs;)I")
    private static final int method346(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class45 arg10) {
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
        arg10.field657 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!gs", name = "c", descriptor = "()I")
    public final int method347() {
        int var1 = this.field649 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field663 == 0) {
            var2 -= this.field657 * var2 / (((class148) super.field8477).field2054.length << 8);
        } else if (this.field663 >= 0) {
            var2 -= this.field660 * var2 / ((class148) super.field8477).field2054.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!gs", name = "c", descriptor = "(II[B[IIIIIIIILgs;II)I")
    private static final int method348(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class45 arg11, int arg12, int arg13) {
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
        arg11.field657 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!gs", name = "d", descriptor = "()I")
    public final int method349() {
        return this.field650 == 0 && this.field651 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!gs", name = "h", descriptor = "()Z")
    private final boolean method350() {
        int var1 = this.field650;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method361(var1, this.field655);
            var2 = method324(var1, this.field655);
        }
        if (this.field649 == var1 && this.field654 == var3 && this.field658 == var2) {
            if (this.field650 == Integer.MIN_VALUE) {
                this.field650 = 0;
                this.field649 = this.field654 = this.field658 = 0;
                this.method1175(-2);
                return true;
            } else {
                this.method353();
                return false;
            }
        } else {
            if (this.field649 < var1) {
                this.field652 = 1;
                this.field651 = var1 - this.field649;
            } else if (this.field649 > var1) {
                this.field652 = -1;
                this.field651 = this.field649 - var1;
            } else {
                this.field652 = 0;
            }
            if (this.field654 < var3) {
                this.field662 = 1;
                if (this.field651 == 0 || this.field651 > var3 - this.field654) {
                    this.field651 = var3 - this.field654;
                }
            } else if (this.field654 > var3) {
                this.field662 = -1;
                if (this.field651 == 0 || this.field651 > this.field654 - var3) {
                    this.field651 = this.field654 - var3;
                }
            } else {
                this.field662 = 0;
            }
            if (this.field658 < var2) {
                this.field653 = 1;
                if (this.field651 == 0 || this.field651 > var2 - this.field658) {
                    this.field651 = var2 - this.field658;
                }
            } else if (this.field658 > var2) {
                this.field653 = -1;
                if (this.field651 == 0 || this.field651 > this.field658 - var2) {
                    this.field651 = this.field658 - var2;
                }
            } else {
                this.field653 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!gs", name = "i", descriptor = "()Z")
    public final boolean method351() {
        return this.field651 != 0;
    }

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "([B[IIIIIIIILgs;)I")
    private static final int method352(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class45 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field654 += (var14 - arg3) * arg9.field662;
        arg9.field658 += (var14 - arg3) * arg9.field653;
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
        arg9.field649 = var12 >> 2;
        arg9.field657 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!gs", name = "j", descriptor = "()V")
    private final void method353() {
        this.field649 = this.field650;
        this.field654 = method361(this.field650, this.field655);
        this.field658 = method324(this.field650, this.field655);
    }

    @OriginalMember(owner = "client!gs", name = "d", descriptor = "(II[B[IIIIIIIILgs;II)I")
    private static final int method354(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class45 arg11, int arg12, int arg13) {
        arg11.field654 -= arg11.field662 * arg5;
        arg11.field658 -= arg11.field653 * arg5;
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
        arg11.field654 += arg11.field662 * arg5;
        arg11.field658 += arg11.field653 * arg5;
        arg11.field649 = arg6;
        arg11.field657 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!gs", name = "k", descriptor = "()I")
    public final synchronized int method355() {
        return this.field650 == Integer.MIN_VALUE ? 0 : this.field650;
    }

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "(II[B[IIIIIIIIIILgs;II)I")
    private static final int method356(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class45 arg13, int arg14, int arg15) {
        arg13.field649 -= arg13.field652 * arg5;
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
        arg13.field649 += arg13.field652 * var22;
        arg13.field654 = arg6;
        arg13.field658 = arg7;
        arg13.field657 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "(II[B[IIIIIIILgs;II)I")
    private static final int method357(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class45 arg10, int arg11, int arg12) {
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
        arg10.field657 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "([IIIII)I")
    private final int method358(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field651 <= 0) {
                if (this.field661 == 256 && (this.field657 & 255) == 0) {
                    if (class360.field4662) {
                        return method339(0, ((class148) super.field8477).field2054, arg0, this.field657, arg1, this.field654, this.field658, 0, arg3, arg2, this);
                    }
                    return method320(((class148) super.field8477).field2054, arg0, this.field657, arg1, this.field649, 0, arg3, arg2, this);
                }
                if (class360.field4662) {
                    return method348(0, 0, ((class148) super.field8477).field2054, arg0, this.field657, arg1, this.field654, this.field658, 0, arg3, arg2, this, this.field661, arg4);
                }
                return method325(0, 0, ((class148) super.field8477).field2054, arg0, this.field657, arg1, this.field649, 0, arg3, arg2, this, this.field661, arg4);
            }
            int var6 = this.field651 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field651 += arg1;
            if (this.field661 == 256 && (this.field657 & 255) == 0) {
                if (class360.field4662) {
                    arg1 = method328(0, ((class148) super.field8477).field2054, arg0, this.field657, arg1, this.field654, this.field658, this.field662, this.field653, 0, var6, arg2, this);
                } else {
                    arg1 = method352(((class148) super.field8477).field2054, arg0, this.field657, arg1, this.field649, this.field652, 0, var6, arg2, this);
                }
            } else if (class360.field4662) {
                arg1 = method343(0, 0, ((class148) super.field8477).field2054, arg0, this.field657, arg1, this.field654, this.field658, this.field662, this.field653, 0, var6, arg2, this, this.field661, arg4);
            } else {
                arg1 = method342(0, 0, ((class148) super.field8477).field2054, arg0, this.field657, arg1, this.field649, this.field652, 0, var6, arg2, this, this.field661, arg4);
            }
            this.field651 -= arg1;
            if (this.field651 != 0) {
                return arg1;
            }
        } while (!this.method350());
        return arg3;
    }

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "([IIIII)I")
    private final int method359(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field651 <= 0) {
                if (this.field661 == -256 && (this.field657 & 255) == 0) {
                    if (class360.field4662) {
                        return method346(0, ((class148) super.field8477).field2054, arg0, this.field657, arg1, this.field654, this.field658, 0, arg3, arg2, this);
                    }
                    return method344(((class148) super.field8477).field2054, arg0, this.field657, arg1, this.field649, 0, arg3, arg2, this);
                }
                if (class360.field4662) {
                    return method336(0, 0, ((class148) super.field8477).field2054, arg0, this.field657, arg1, this.field654, this.field658, 0, arg3, arg2, this, this.field661, arg4);
                }
                return method357(0, 0, ((class148) super.field8477).field2054, arg0, this.field657, arg1, this.field649, 0, arg3, arg2, this, this.field661, arg4);
            }
            int var6 = this.field651 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field651 += arg1;
            if (this.field661 == -256 && (this.field657 & 255) == 0) {
                if (class360.field4662) {
                    arg1 = method323(0, ((class148) super.field8477).field2054, arg0, this.field657, arg1, this.field654, this.field658, this.field662, this.field653, 0, var6, arg2, this);
                } else {
                    arg1 = method331(((class148) super.field8477).field2054, arg0, this.field657, arg1, this.field649, this.field652, 0, var6, arg2, this);
                }
            } else if (class360.field4662) {
                arg1 = method356(0, 0, ((class148) super.field8477).field2054, arg0, this.field657, arg1, this.field654, this.field658, this.field662, this.field653, 0, var6, arg2, this, this.field661, arg4);
            } else {
                arg1 = method354(0, 0, ((class148) super.field8477).field2054, arg0, this.field657, arg1, this.field649, this.field652, 0, var6, arg2, this, this.field661, arg4);
            }
            this.field651 -= arg1;
            if (this.field651 != 0) {
                return arg1;
            }
        } while (!this.method350());
        return arg3;
    }

    @OriginalMember(owner = "client!gs", name = "i", descriptor = "(I)V")
    private final synchronized void method360(int arg0) {
        this.method337(arg0, this.method330());
    }

    @OriginalMember(owner = "client!gs", name = "<init>", descriptor = "(Lct;III)V")
    private class45(class148 arg0, int arg1, int arg2, int arg3) {
        super.field8477 = arg0;
        this.field660 = arg0.field2056;
        this.field656 = arg0.field2058;
        this.field659 = arg0.field2057;
        this.field661 = arg1;
        this.field650 = arg2;
        this.field655 = arg3;
        this.field657 = 0;
        this.method353();
    }

    @OriginalMember(owner = "client!gs", name = "d", descriptor = "(II)I")
    private static final int method361(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!gs", name = "l", descriptor = "()I")
    public final synchronized int method362() {
        return this.field661 < 0 ? -this.field661 : this.field661;
    }
}
