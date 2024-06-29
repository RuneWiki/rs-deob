import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public class class493 extends class458 {

    @OriginalMember(owner = "client!gn", name = "v", descriptor = "I")
    private int field7293;

    @OriginalMember(owner = "client!gn", name = "s", descriptor = "I")
    private int field7290;

    @OriginalMember(owner = "client!gn", name = "r", descriptor = "Z")
    private boolean field7289;

    @OriginalMember(owner = "client!gn", name = "y", descriptor = "I")
    private int field7296;

    @OriginalMember(owner = "client!gn", name = "p", descriptor = "I")
    private int field7287;

    @OriginalMember(owner = "client!gn", name = "D", descriptor = "I")
    private int field7301;

    @OriginalMember(owner = "client!gn", name = "C", descriptor = "I")
    private int field7300;

    @OriginalMember(owner = "client!gn", name = "q", descriptor = "I")
    private int field7288;

    @OriginalMember(owner = "client!gn", name = "t", descriptor = "I")
    private int field7291;

    @OriginalMember(owner = "client!gn", name = "u", descriptor = "I")
    private int field7292;

    @OriginalMember(owner = "client!gn", name = "w", descriptor = "I")
    private int field7294;

    @OriginalMember(owner = "client!gn", name = "x", descriptor = "I")
    private int field7295;

    @OriginalMember(owner = "client!gn", name = "z", descriptor = "I")
    private int field7297;

    @OriginalMember(owner = "client!gn", name = "A", descriptor = "I")
    private int field7298;

    @OriginalMember(owner = "client!gn", name = "B", descriptor = "I")
    private int field7299;

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(Lbq;II)Lgn;", line = 4)
    public static final class493 method2933(class189 arg0, int arg1, int arg2) {
        return arg0.field2825 != null && arg0.field2825.length != 0 ? new class493(arg0, (int) ((long) arg0.field2828 * 256L * (long) arg1 / (long) (class256.field3725 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "()I", line = 13)
    public final int method2729() {
        int var1 = this.field7294 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field7298 == 0) {
            var2 -= this.field7300 * var2 / (((class189) super.field6862).field2825.length << 8);
        } else if (this.field7298 >= 0) {
            var2 -= this.field7293 * var2 / ((class189) super.field6862).field2825.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(I[B[IIIIIIIIIILgn;)I", line = 27)
    private static final int method2934(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class493 arg12) {
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
        arg12.field7294 += (var19 - arg4) * arg12.field7297;
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
        arg12.field7299 = var15 >> 2;
        arg12.field7288 = var16 >> 2;
        arg12.field7300 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!gn", name = "c", descriptor = "(I)V", line = 81)
    public final synchronized void method2041(int arg0) {
        if (this.field7295 > 0) {
            if (arg0 >= this.field7295) {
                if (this.field7287 == Integer.MIN_VALUE) {
                    this.field7287 = 0;
                    this.field7294 = this.field7299 = this.field7288 = 0;
                    this.method2090(-1);
                    arg0 = this.field7295;
                }
                this.field7295 = 0;
                this.method2965();
            } else {
                this.field7294 += this.field7297 * arg0;
                this.field7299 += this.field7292 * arg0;
                this.field7288 += this.field7291 * arg0;
                this.field7295 -= arg0;
            }
        }
        class189 var2 = (class189) super.field6862;
        int var3 = this.field7293 << 8;
        int var4 = this.field7290 << 8;
        int var5 = var2.field2825.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field7298 = 0;
        }
        if (this.field7300 < 0) {
            if (this.field7296 <= 0) {
                this.method2936();
                this.method2090(-1);
                return;
            }
            this.field7300 = 0;
        }
        if (this.field7300 >= var5) {
            if (this.field7296 >= 0) {
                this.method2936();
                this.method2090(-1);
                return;
            }
            this.field7300 = var5 - 1;
        }
        this.field7300 += this.field7296 * arg0;
        if (this.field7298 < 0) {
            if (!this.field7289) {
                if (this.field7296 < 0) {
                    if (this.field7300 < var3) {
                        this.field7300 = var4 - 1 - (var4 - 1 - this.field7300) % var6;
                    }
                } else if (this.field7300 >= var4) {
                    this.field7300 = (this.field7300 - var3) % var6 + var3;
                }
            } else {
                if (this.field7296 < 0) {
                    if (this.field7300 >= var3) {
                        return;
                    }
                    this.field7300 = var3 + var3 - 1 - this.field7300;
                    this.field7296 = -this.field7296;
                }
                while (this.field7300 >= var4) {
                    this.field7300 = var4 + var4 - 1 - this.field7300;
                    this.field7296 = -this.field7296;
                    if (this.field7300 >= var3) {
                        return;
                    }
                    this.field7300 = var3 + var3 - 1 - this.field7300;
                    this.field7296 = -this.field7296;
                }
            }
        } else {
            if (this.field7298 > 0) {
                if (this.field7289) {
                    label125: {
                        if (this.field7296 < 0) {
                            if (this.field7300 >= var3) {
                                return;
                            }
                            this.field7300 = var3 + var3 - 1 - this.field7300;
                            this.field7296 = -this.field7296;
                            if (--this.field7298 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field7300 < var4) {
                                return;
                            }
                            this.field7300 = var4 + var4 - 1 - this.field7300;
                            this.field7296 = -this.field7296;
                            if (--this.field7298 == 0) {
                                break;
                            }
                            if (this.field7300 >= var3) {
                                return;
                            }
                            this.field7300 = var3 + var3 - 1 - this.field7300;
                            this.field7296 = -this.field7296;
                        } while (--this.field7298 != 0);
                    }
                } else if (this.field7296 < 0) {
                    if (this.field7300 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field7300) / var6;
                    if (var7 < this.field7298) {
                        this.field7300 += var6 * var7;
                        this.field7298 -= var7;
                        return;
                    }
                    this.field7300 += this.field7298 * var6;
                    this.field7298 = 0;
                } else {
                    if (this.field7300 < var4) {
                        return;
                    }
                    int var8 = (this.field7300 - var3) / var6;
                    if (var8 < this.field7298) {
                        this.field7300 -= var6 * var8;
                        this.field7298 -= var8;
                        return;
                    }
                    this.field7300 -= this.field7298 * var6;
                    this.field7298 = 0;
                }
            }
            if (this.field7296 < 0) {
                if (this.field7300 < 0) {
                    this.field7300 = -1;
                    this.method2936();
                    this.method2090(-1);
                    return;
                }
            } else if (this.field7300 >= var5) {
                this.field7300 = var5;
                this.method2936();
                this.method2090(-1);
            }
        }
    }

    @OriginalMember(owner = "client!gn", name = "d", descriptor = "()Lbl;", line = 299)
    public final class458 method2033() {
        return null;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(I[B[IIIIIIIILgn;)I", line = 303)
    private static final int method2935(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class493 arg10) {
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
        arg10.field7300 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!gn", name = "e", descriptor = "()V", line = 341)
    private final void method2936() {
        if (this.field7295 != 0) {
            if (this.field7287 == Integer.MIN_VALUE) {
                this.field7287 = 0;
            }
            this.field7295 = 0;
            this.method2965();
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(II[B[IIIIIIIILgn;II)I", line = 352)
    private static final int method2937(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class493 arg11, int arg12, int arg13) {
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
        arg11.field7300 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!gn", name = "f", descriptor = "()Z", line = 385)
    private final boolean method2938() {
        int var1 = this.field7287;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method2964(var1, this.field7301);
            var2 = method2958(var1, this.field7301);
        }
        if (this.field7294 == var1 && this.field7299 == var3 && this.field7288 == var2) {
            if (this.field7287 == Integer.MIN_VALUE) {
                this.field7287 = 0;
                this.field7294 = this.field7299 = this.field7288 = 0;
                this.method2090(-1);
                return true;
            } else {
                this.method2965();
                return false;
            }
        } else {
            if (this.field7294 < var1) {
                this.field7297 = 1;
                this.field7295 = var1 - this.field7294;
            } else if (this.field7294 > var1) {
                this.field7297 = -1;
                this.field7295 = this.field7294 - var1;
            } else {
                this.field7297 = 0;
            }
            if (this.field7299 < var3) {
                this.field7292 = 1;
                if (this.field7295 == 0 || this.field7295 > var3 - this.field7299) {
                    this.field7295 = var3 - this.field7299;
                }
            } else if (this.field7299 > var3) {
                this.field7292 = -1;
                if (this.field7295 == 0 || this.field7295 > this.field7299 - var3) {
                    this.field7295 = this.field7299 - var3;
                }
            } else {
                this.field7292 = 0;
            }
            if (this.field7288 < var2) {
                this.field7291 = 1;
                if (this.field7295 == 0 || this.field7295 > var2 - this.field7288) {
                    this.field7295 = var2 - this.field7288;
                }
            } else if (this.field7288 > var2) {
                this.field7291 = -1;
                if (this.field7295 == 0 || this.field7295 > this.field7288 - var2) {
                    this.field7295 = this.field7288 - var2;
                }
            } else {
                this.field7291 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "(I[B[IIIIIIIILgn;)I", line = 472)
    private static final int method2939(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class493 arg10) {
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
        arg10.field7300 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(Z)V", line = 510)
    public final synchronized void method2940(boolean arg0) {
        this.field7296 = (this.field7296 >>> 31) + (this.field7296 ^ this.field7296 >> 31);
        if (arg0) {
            this.field7296 = -this.field7296;
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "([B[IIIIIIIILgn;)I", line = 516)
    private static final int method2941(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class493 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field7299 += (var14 - arg3) * arg9.field7292;
        arg9.field7288 += (var14 - arg3) * arg9.field7291;
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
        arg9.field7294 = var12 >> 2;
        arg9.field7300 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(II[B[IIIIIIILgn;II)I", line = 550)
    private static final int method2942(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class493 arg10, int arg11, int arg12) {
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
        arg10.field7300 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!gn", name = "g", descriptor = "()I", line = 577)
    public final synchronized int method2943() {
        return this.field7301 < 0 ? -1 : this.field7301;
    }

    @OriginalMember(owner = "client!gn", name = "h", descriptor = "()I", line = 581)
    public final synchronized int method2944() {
        return this.field7296 < 0 ? -this.field7296 : this.field7296;
    }

    @OriginalMember(owner = "client!gn", name = "d", descriptor = "(I)V", line = 585)
    public final synchronized void method2945(int arg0) {
        int var2 = ((class189) super.field6862).field2825.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field7300 = arg0;
    }

    @OriginalMember(owner = "client!gn", name = "e", descriptor = "(I)V", line = 595)
    public final synchronized void method2946(int arg0) {
        this.method2949(arg0 << 6, this.method2943());
    }

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "([B[IIIIIIIILgn;)I", line = 598)
    private static final int method2947(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class493 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field7299 += (var14 - arg3) * arg9.field7292;
        arg9.field7288 += (var14 - arg3) * arg9.field7291;
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
        arg9.field7294 = var12 >> 2;
        arg9.field7300 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!gn", name = "c", descriptor = "()I", line = 632)
    public final int method2034() {
        return this.field7287 == 0 && this.field7295 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!gn", name = "f", descriptor = "(I)V", line = 638)
    public final synchronized void method2948(int arg0) {
        this.field7298 = arg0;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(II)V", line = 641)
    private final synchronized void method2949(int arg0, int arg1) {
        this.field7287 = arg0;
        this.field7301 = arg1;
        this.field7295 = 0;
        this.method2965();
    }

    @OriginalMember(owner = "client!gn", name = "i", descriptor = "()I", line = 649)
    public final synchronized int method2950() {
        return this.field7287 == Integer.MIN_VALUE ? 0 : this.field7287;
    }

    @OriginalMember(owner = "client!gn", name = "g", descriptor = "(I)V", line = 653)
    private final synchronized void method2951(int arg0) {
        this.method2949(arg0, this.method2943());
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(Lbq;III)Lgn;", line = 658)
    public static final class493 method2952(class189 arg0, int arg1, int arg2, int arg3) {
        return arg0.field2825 != null && arg0.field2825.length != 0 ? new class493(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "(II[B[IIIIIIIILgn;II)I", line = 664)
    private static final int method2953(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class493 arg11, int arg12, int arg13) {
        arg11.field7299 -= arg11.field7292 * arg5;
        arg11.field7288 -= arg11.field7291 * arg5;
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
        arg11.field7299 += arg11.field7292 * arg5;
        arg11.field7288 += arg11.field7291 * arg5;
        arg11.field7294 = arg6;
        arg11.field7300 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "([B[IIIIIIILgn;)I", line = 698)
    private static final int method2954(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class493 arg8) {
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
        arg8.field7300 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "([IIIII)I", line = 725)
    private final int method2955(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field7295 <= 0) {
                if (this.field7296 == 256 && (this.field7300 & 255) == 0) {
                    if (class320.field4899) {
                        return method2935(0, ((class189) super.field6862).field2825, arg0, this.field7300, arg1, this.field7299, this.field7288, 0, arg3, arg2, this);
                    }
                    return method2954(((class189) super.field6862).field2825, arg0, this.field7300, arg1, this.field7294, 0, arg3, arg2, this);
                }
                if (class320.field4899) {
                    return method2971(0, 0, ((class189) super.field6862).field2825, arg0, this.field7300, arg1, this.field7299, this.field7288, 0, arg3, arg2, this, this.field7296, arg4);
                }
                return method2942(0, 0, ((class189) super.field6862).field2825, arg0, this.field7300, arg1, this.field7294, 0, arg3, arg2, this, this.field7296, arg4);
            }
            int var6 = this.field7295 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field7295 += arg1;
            if (this.field7296 == 256 && (this.field7300 & 255) == 0) {
                if (class320.field4899) {
                    arg1 = method2934(0, ((class189) super.field6862).field2825, arg0, this.field7300, arg1, this.field7299, this.field7288, this.field7292, this.field7291, 0, var6, arg2, this);
                } else {
                    arg1 = method2947(((class189) super.field6862).field2825, arg0, this.field7300, arg1, this.field7294, this.field7297, 0, var6, arg2, this);
                }
            } else if (class320.field4899) {
                arg1 = method2956(0, 0, ((class189) super.field6862).field2825, arg0, this.field7300, arg1, this.field7299, this.field7288, this.field7292, this.field7291, 0, var6, arg2, this, this.field7296, arg4);
            } else {
                arg1 = method2953(0, 0, ((class189) super.field6862).field2825, arg0, this.field7300, arg1, this.field7294, this.field7297, 0, var6, arg2, this, this.field7296, arg4);
            }
            this.field7295 -= arg1;
            if (this.field7295 != 0) {
                return arg1;
            }
        } while (!this.method2938());
        return arg3;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(II[B[IIIIIIIIIILgn;II)I", line = 780)
    private static final int method2956(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class493 arg13, int arg14, int arg15) {
        arg13.field7294 -= arg13.field7297 * arg5;
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
        arg13.field7294 += arg13.field7297 * var22;
        arg13.field7299 = arg6;
        arg13.field7288 = arg7;
        arg13.field7300 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(III)V", line = 822)
    public final synchronized void method2957(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method2949(arg1, arg2);
        } else {
            int var4 = method2964(arg1, arg2);
            int var5 = method2958(arg1, arg2);
            if (this.field7299 == var4 && this.field7288 == var5) {
                this.field7295 = 0;
            } else {
                int var6 = arg1 - this.field7294;
                if (this.field7294 - arg1 > var6) {
                    var6 = this.field7294 - arg1;
                }
                if (var4 - this.field7299 > var6) {
                    var6 = var4 - this.field7299;
                }
                if (this.field7299 - var4 > var6) {
                    var6 = this.field7299 - var4;
                }
                if (var5 - this.field7288 > var6) {
                    var6 = var5 - this.field7288;
                }
                if (this.field7288 - var5 > var6) {
                    var6 = this.field7288 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field7295 = arg0;
                this.field7287 = arg1;
                this.field7301 = arg2;
                this.field7297 = (arg1 - this.field7294) / arg0;
                this.field7292 = (var4 - this.field7299) / arg0;
                this.field7291 = (var5 - this.field7288) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "()Lbl;", line = 868)
    public final class458 method2044() {
        return null;
    }

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "(II)I", line = 873)
    private static final int method2958(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "([B[IIIIIIILgn;)I", line = 877)
    private static final int method2959(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class493 arg8) {
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
        arg8.field7300 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!gn", name = "c", descriptor = "(II)V", line = 902)
    public final synchronized void method2960(int arg0, int arg1) {
        this.method2957(arg0, arg1, this.method2943());
    }

    @OriginalMember(owner = "client!gn", name = "j", descriptor = "()Z", line = 905)
    public final boolean method2961() {
        return this.field7295 != 0;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "([III)V", line = 908)
    public final synchronized void method2037(int[] arg0, int arg1, int arg2) {
        if (this.field7287 == 0 && this.field7295 == 0) {
            this.method2041(arg2);
        } else {
            class189 var4 = (class189) super.field6862;
            int var5 = this.field7293 << 8;
            int var6 = this.field7290 << 8;
            int var7 = var4.field2825.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field7298 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field7300 < 0) {
                if (this.field7296 <= 0) {
                    this.method2936();
                    this.method2090(-1);
                    return;
                }
                this.field7300 = 0;
            }
            if (this.field7300 >= var7) {
                if (this.field7296 >= 0) {
                    this.method2936();
                    this.method2090(-1);
                    return;
                }
                this.field7300 = var7 - 1;
            }
            if (this.field7298 < 0) {
                if (this.field7289) {
                    if (this.field7296 < 0) {
                        var9 = this.method2963(arg0, arg1, var5, var10, var4.field2825[this.field7293]);
                        if (this.field7300 >= var5) {
                            return;
                        }
                        this.field7300 = var5 + var5 - 1 - this.field7300;
                        this.field7296 = -this.field7296;
                    }
                    while (true) {
                        int var11 = this.method2955(arg0, var9, var6, var10, var4.field2825[this.field7290 - 1]);
                        if (this.field7300 < var6) {
                            return;
                        }
                        this.field7300 = var6 + var6 - 1 - this.field7300;
                        this.field7296 = -this.field7296;
                        var9 = this.method2963(arg0, var11, var5, var10, var4.field2825[this.field7293]);
                        if (this.field7300 >= var5) {
                            return;
                        }
                        this.field7300 = var5 + var5 - 1 - this.field7300;
                        this.field7296 = -this.field7296;
                    }
                } else if (this.field7296 < 0) {
                    while (true) {
                        var9 = this.method2963(arg0, var9, var5, var10, var4.field2825[this.field7290 - 1]);
                        if (this.field7300 >= var5) {
                            return;
                        }
                        this.field7300 = var6 - 1 - (var6 - 1 - this.field7300) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method2955(arg0, var9, var6, var10, var4.field2825[this.field7293]);
                        if (this.field7300 < var6) {
                            return;
                        }
                        this.field7300 = (this.field7300 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field7298 > 0) {
                    if (this.field7289) {
                        label130: {
                            if (this.field7296 < 0) {
                                var9 = this.method2963(arg0, arg1, var5, var10, var4.field2825[this.field7293]);
                                if (this.field7300 >= var5) {
                                    return;
                                }
                                this.field7300 = var5 + var5 - 1 - this.field7300;
                                this.field7296 = -this.field7296;
                                if (--this.field7298 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method2955(arg0, var9, var6, var10, var4.field2825[this.field7290 - 1]);
                                if (this.field7300 < var6) {
                                    return;
                                }
                                this.field7300 = var6 + var6 - 1 - this.field7300;
                                this.field7296 = -this.field7296;
                                if (--this.field7298 == 0) {
                                    break;
                                }
                                var9 = this.method2963(arg0, var9, var5, var10, var4.field2825[this.field7293]);
                                if (this.field7300 >= var5) {
                                    return;
                                }
                                this.field7300 = var5 + var5 - 1 - this.field7300;
                                this.field7296 = -this.field7296;
                            } while (--this.field7298 != 0);
                        }
                    } else if (this.field7296 < 0) {
                        while (true) {
                            var9 = this.method2963(arg0, var9, var5, var10, var4.field2825[this.field7290 - 1]);
                            if (this.field7300 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field7300) / var8;
                            if (var12 >= this.field7298) {
                                this.field7300 += this.field7298 * var8;
                                this.field7298 = 0;
                                break;
                            }
                            this.field7300 += var8 * var12;
                            this.field7298 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method2955(arg0, var9, var6, var10, var4.field2825[this.field7293]);
                            if (this.field7300 < var6) {
                                return;
                            }
                            int var13 = (this.field7300 - var5) / var8;
                            if (var13 >= this.field7298) {
                                this.field7300 -= this.field7298 * var8;
                                this.field7298 = 0;
                                break;
                            }
                            this.field7300 -= var8 * var13;
                            this.field7298 -= var13;
                        }
                    }
                }
                if (this.field7296 < 0) {
                    this.method2963(arg0, var9, 0, var10, 0);
                    if (this.field7300 < 0) {
                        this.field7300 = -1;
                        this.method2936();
                        this.method2090(-1);
                        return;
                    }
                } else {
                    this.method2955(arg0, var9, var7, var10, 0);
                    if (this.field7300 >= var7) {
                        this.field7300 = var7;
                        this.method2936();
                        this.method2090(-1);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gn", name = "h", descriptor = "(I)V", line = 1146)
    public final synchronized void method2962(int arg0) {
        if (this.field7296 < 0) {
            this.field7296 = -arg0;
        } else {
            this.field7296 = arg0;
        }
    }

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "([IIIII)I", line = 1156)
    private final int method2963(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field7295 <= 0) {
                if (this.field7296 == -256 && (this.field7300 & 255) == 0) {
                    if (class320.field4899) {
                        return method2939(0, ((class189) super.field6862).field2825, arg0, this.field7300, arg1, this.field7299, this.field7288, 0, arg3, arg2, this);
                    }
                    return method2959(((class189) super.field6862).field2825, arg0, this.field7300, arg1, this.field7294, 0, arg3, arg2, this);
                }
                if (class320.field4899) {
                    return method2937(0, 0, ((class189) super.field6862).field2825, arg0, this.field7300, arg1, this.field7299, this.field7288, 0, arg3, arg2, this, this.field7296, arg4);
                }
                return method2968(0, 0, ((class189) super.field6862).field2825, arg0, this.field7300, arg1, this.field7294, 0, arg3, arg2, this, this.field7296, arg4);
            }
            int var6 = this.field7295 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field7295 += arg1;
            if (this.field7296 == -256 && (this.field7300 & 255) == 0) {
                if (class320.field4899) {
                    arg1 = method2972(0, ((class189) super.field6862).field2825, arg0, this.field7300, arg1, this.field7299, this.field7288, this.field7292, this.field7291, 0, var6, arg2, this);
                } else {
                    arg1 = method2941(((class189) super.field6862).field2825, arg0, this.field7300, arg1, this.field7294, this.field7297, 0, var6, arg2, this);
                }
            } else if (class320.field4899) {
                arg1 = method2966(0, 0, ((class189) super.field6862).field2825, arg0, this.field7300, arg1, this.field7299, this.field7288, this.field7292, this.field7291, 0, var6, arg2, this, this.field7296, arg4);
            } else {
                arg1 = method2970(0, 0, ((class189) super.field6862).field2825, arg0, this.field7300, arg1, this.field7294, this.field7297, 0, var6, arg2, this, this.field7296, arg4);
            }
            this.field7295 -= arg1;
            if (this.field7295 != 0) {
                return arg1;
            }
        } while (!this.method2938());
        return arg3;
    }

    @OriginalMember(owner = "client!gn", name = "d", descriptor = "(II)I", line = 1211)
    private static final int method2964(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!gn", name = "k", descriptor = "()V", line = 1215)
    private final void method2965() {
        this.field7294 = this.field7287;
        this.field7299 = method2964(this.field7287, this.field7301);
        this.field7288 = method2958(this.field7287, this.field7301);
    }

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "(II[B[IIIIIIIIIILgn;II)I", line = 1220)
    private static final int method2966(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class493 arg13, int arg14, int arg15) {
        arg13.field7294 -= arg13.field7297 * arg5;
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
        arg13.field7294 += arg13.field7297 * var22;
        arg13.field7299 = arg6;
        arg13.field7288 = arg7;
        arg13.field7300 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!gn", name = "l", descriptor = "()Z", line = 1263)
    public final boolean method2967() {
        return this.field7300 < 0 || this.field7300 >= ((class189) super.field6862).field2825.length << 8;
    }

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "(II[B[IIIIIIILgn;II)I", line = 1266)
    private static final int method2968(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class493 arg10, int arg11, int arg12) {
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
        arg10.field7300 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!gn", name = "i", descriptor = "(I)V", line = 1292)
    public final synchronized void method2969(int arg0) {
        if (arg0 == 0) {
            this.method2951(0);
            this.method2090(-1);
        } else if (this.field7299 == 0 && this.field7288 == 0) {
            this.field7295 = 0;
            this.field7287 = 0;
            this.field7294 = 0;
            this.method2090(-1);
        } else {
            int var2 = -this.field7294;
            if (this.field7294 > var2) {
                var2 = this.field7294;
            }
            if (-this.field7299 > var2) {
                var2 = -this.field7299;
            }
            if (this.field7299 > var2) {
                var2 = this.field7299;
            }
            if (-this.field7288 > var2) {
                var2 = -this.field7288;
            }
            if (this.field7288 > var2) {
                var2 = this.field7288;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field7295 = arg0;
            this.field7287 = Integer.MIN_VALUE;
            this.field7297 = -this.field7294 / arg0;
            this.field7292 = -this.field7299 / arg0;
            this.field7291 = -this.field7288 / arg0;
        }
    }

    @OriginalMember(owner = "client!gn", name = "c", descriptor = "(II[B[IIIIIIIILgn;II)I", line = 1337)
    private static final int method2970(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class493 arg11, int arg12, int arg13) {
        arg11.field7299 -= arg11.field7292 * arg5;
        arg11.field7288 -= arg11.field7291 * arg5;
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
        arg11.field7299 += arg11.field7292 * arg5;
        arg11.field7288 += arg11.field7291 * arg5;
        arg11.field7294 = arg6;
        arg11.field7300 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!gn", name = "d", descriptor = "(II[B[IIIIIIIILgn;II)I", line = 1371)
    private static final int method2971(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class493 arg11, int arg12, int arg13) {
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
        arg11.field7300 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(Lbq;II)V", line = 1405)
    private class493(class189 arg0, int arg1, int arg2) {
        super.field6862 = arg0;
        this.field7293 = arg0.field2826;
        this.field7290 = arg0.field2824;
        this.field7289 = arg0.field2827;
        this.field7296 = arg1;
        this.field7287 = arg2;
        this.field7301 = 8192;
        this.field7300 = 0;
        this.method2965();
    }

    @OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(Lbq;III)V", line = 1416)
    private class493(class189 arg0, int arg1, int arg2, int arg3) {
        super.field6862 = arg0;
        this.field7293 = arg0.field2826;
        this.field7290 = arg0.field2824;
        this.field7289 = arg0.field2827;
        this.field7296 = arg1;
        this.field7287 = arg2;
        this.field7301 = arg3;
        this.field7300 = 0;
        this.method2965();
    }

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "(I[B[IIIIIIIIIILgn;)I", line = 1428)
    private static final int method2972(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class493 arg12) {
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
        arg12.field7294 += (var19 - arg4) * arg12.field7297;
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
        arg12.field7299 = var15 >> 2;
        arg12.field7288 = var16 >> 2;
        arg12.field7300 = var13 << 8;
        return var20 >> 1;
    }
}
