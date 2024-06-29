import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public class class505 extends class293 {

    @OriginalMember(owner = "client!hn", name = "B", descriptor = "I")
    private int field7446;

    @OriginalMember(owner = "client!hn", name = "w", descriptor = "I")
    private int field7441;

    @OriginalMember(owner = "client!hn", name = "o", descriptor = "Z")
    private boolean field7433;

    @OriginalMember(owner = "client!hn", name = "r", descriptor = "I")
    private int field7436;

    @OriginalMember(owner = "client!hn", name = "u", descriptor = "I")
    private int field7439;

    @OriginalMember(owner = "client!hn", name = "v", descriptor = "I")
    private int field7440;

    @OriginalMember(owner = "client!hn", name = "z", descriptor = "I")
    private int field7444;

    @OriginalMember(owner = "client!hn", name = "p", descriptor = "I")
    private int field7434;

    @OriginalMember(owner = "client!hn", name = "q", descriptor = "I")
    private int field7435;

    @OriginalMember(owner = "client!hn", name = "s", descriptor = "I")
    private int field7437;

    @OriginalMember(owner = "client!hn", name = "t", descriptor = "I")
    private int field7438;

    @OriginalMember(owner = "client!hn", name = "x", descriptor = "I")
    private int field7442;

    @OriginalMember(owner = "client!hn", name = "y", descriptor = "I")
    private int field7443;

    @OriginalMember(owner = "client!hn", name = "A", descriptor = "I")
    private int field7445;

    @OriginalMember(owner = "client!hn", name = "C", descriptor = "I")
    private int field7447;

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(II)I", line = 7)
    private static final int method2978(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(I[B[IIIIIIIIIILhn;)I", line = 12)
    private static final int method2979(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class505 arg12) {
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
        arg12.field7435 += (var19 - arg4) * arg12.field7445;
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
        arg12.field7443 = var15 >> 2;
        arg12.field7437 = var16 >> 2;
        arg12.field7444 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!hn", name = "d", descriptor = "(I)V", line = 67)
    public final synchronized void method2980(int arg0) {
        int var2 = ((class452) super.field4046).field6656.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field7444 = arg0;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "([B[IIIIIIILhn;)I", line = 77)
    private static final int method2981(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class505 arg8) {
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
        arg8.field7444 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!hn", name = "e", descriptor = "()I", line = 102)
    public final synchronized int method2982() {
        return this.field7436 < 0 ? -this.field7436 : this.field7436;
    }

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "(II)V", line = 105)
    public final synchronized void method2983(int arg0, int arg1) {
        this.method3007(arg0, arg1, this.method3013());
    }

    @OriginalMember(owner = "client!hn", name = "f", descriptor = "()Z", line = 109)
    private final boolean method2984() {
        int var1 = this.field7439;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method2991(var1, this.field7440);
            var2 = method2978(var1, this.field7440);
        }
        if (this.field7435 == var1 && this.field7443 == var3 && this.field7437 == var2) {
            if (this.field7439 == Integer.MIN_VALUE) {
                this.field7439 = 0;
                this.field7435 = this.field7443 = this.field7437 = 0;
                this.method1565(0);
                return true;
            } else {
                this.method2995();
                return false;
            }
        } else {
            if (this.field7435 < var1) {
                this.field7445 = 1;
                this.field7447 = var1 - this.field7435;
            } else if (this.field7435 > var1) {
                this.field7445 = -1;
                this.field7447 = this.field7435 - var1;
            } else {
                this.field7445 = 0;
            }
            if (this.field7443 < var3) {
                this.field7438 = 1;
                if (this.field7447 == 0 || this.field7447 > var3 - this.field7443) {
                    this.field7447 = var3 - this.field7443;
                }
            } else if (this.field7443 > var3) {
                this.field7438 = -1;
                if (this.field7447 == 0 || this.field7447 > this.field7443 - var3) {
                    this.field7447 = this.field7443 - var3;
                }
            } else {
                this.field7438 = 0;
            }
            if (this.field7437 < var2) {
                this.field7434 = 1;
                if (this.field7447 == 0 || this.field7447 > var2 - this.field7437) {
                    this.field7447 = var2 - this.field7437;
                }
            } else if (this.field7437 > var2) {
                this.field7434 = -1;
                if (this.field7447 == 0 || this.field7447 > this.field7437 - var2) {
                    this.field7447 = this.field7437 - var2;
                }
            } else {
                this.field7434 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "(II)V", line = 194)
    private final synchronized void method2985(int arg0, int arg1) {
        this.field7439 = arg0;
        this.field7440 = arg1;
        this.field7447 = 0;
        this.method2995();
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "([IIIII)I", line = 200)
    private final int method2986(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field7447 <= 0) {
                if (this.field7436 == 256 && (this.field7444 & 255) == 0) {
                    if (class295.field4060) {
                        return method2992(0, ((class452) super.field4046).field6656, arg0, this.field7444, arg1, this.field7443, this.field7437, 0, arg3, arg2, this);
                    }
                    return method2981(((class452) super.field4046).field6656, arg0, this.field7444, arg1, this.field7435, 0, arg3, arg2, this);
                }
                if (class295.field4060) {
                    return method3005(0, 0, ((class452) super.field4046).field6656, arg0, this.field7444, arg1, this.field7443, this.field7437, 0, arg3, arg2, this, this.field7436, arg4);
                }
                return method3012(0, 0, ((class452) super.field4046).field6656, arg0, this.field7444, arg1, this.field7435, 0, arg3, arg2, this, this.field7436, arg4);
            }
            int var6 = this.field7447 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field7447 += arg1;
            if (this.field7436 == 256 && (this.field7444 & 255) == 0) {
                if (class295.field4060) {
                    arg1 = method3006(0, ((class452) super.field4046).field6656, arg0, this.field7444, arg1, this.field7443, this.field7437, this.field7438, this.field7434, 0, var6, arg2, this);
                } else {
                    arg1 = method3009(((class452) super.field4046).field6656, arg0, this.field7444, arg1, this.field7435, this.field7445, 0, var6, arg2, this);
                }
            } else if (class295.field4060) {
                arg1 = method3003(0, 0, ((class452) super.field4046).field6656, arg0, this.field7444, arg1, this.field7443, this.field7437, this.field7438, this.field7434, 0, var6, arg2, this, this.field7436, arg4);
            } else {
                arg1 = method2987(0, 0, ((class452) super.field4046).field6656, arg0, this.field7444, arg1, this.field7435, this.field7445, 0, var6, arg2, this, this.field7436, arg4);
            }
            this.field7447 -= arg1;
            if (this.field7447 != 0) {
                return arg1;
            }
        } while (!this.method2984());
        return arg3;
    }

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "(I)V", line = 256)
    public final synchronized void method546(int arg0) {
        if (this.field7447 > 0) {
            if (arg0 >= this.field7447) {
                if (this.field7439 == Integer.MIN_VALUE) {
                    this.field7439 = 0;
                    this.field7435 = this.field7443 = this.field7437 = 0;
                    this.method1565(0);
                    arg0 = this.field7447;
                }
                this.field7447 = 0;
                this.method2995();
            } else {
                this.field7435 += this.field7445 * arg0;
                this.field7443 += this.field7438 * arg0;
                this.field7437 += this.field7434 * arg0;
                this.field7447 -= arg0;
            }
        }
        class452 var2 = (class452) super.field4046;
        int var3 = this.field7446 << 8;
        int var4 = this.field7441 << 8;
        int var5 = var2.field6656.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field7442 = 0;
        }
        if (this.field7444 < 0) {
            if (this.field7436 <= 0) {
                this.method3001();
                this.method1565(0);
                return;
            }
            this.field7444 = 0;
        }
        if (this.field7444 >= var5) {
            if (this.field7436 >= 0) {
                this.method3001();
                this.method1565(0);
                return;
            }
            this.field7444 = var5 - 1;
        }
        this.field7444 += this.field7436 * arg0;
        if (this.field7442 < 0) {
            if (!this.field7433) {
                if (this.field7436 < 0) {
                    if (this.field7444 < var3) {
                        this.field7444 = var4 - 1 - (var4 - 1 - this.field7444) % var6;
                    }
                } else if (this.field7444 >= var4) {
                    this.field7444 = (this.field7444 - var3) % var6 + var3;
                }
            } else {
                if (this.field7436 < 0) {
                    if (this.field7444 >= var3) {
                        return;
                    }
                    this.field7444 = var3 + var3 - 1 - this.field7444;
                    this.field7436 = -this.field7436;
                }
                while (this.field7444 >= var4) {
                    this.field7444 = var4 + var4 - 1 - this.field7444;
                    this.field7436 = -this.field7436;
                    if (this.field7444 >= var3) {
                        return;
                    }
                    this.field7444 = var3 + var3 - 1 - this.field7444;
                    this.field7436 = -this.field7436;
                }
            }
        } else {
            if (this.field7442 > 0) {
                if (this.field7433) {
                    label125: {
                        if (this.field7436 < 0) {
                            if (this.field7444 >= var3) {
                                return;
                            }
                            this.field7444 = var3 + var3 - 1 - this.field7444;
                            this.field7436 = -this.field7436;
                            if (--this.field7442 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field7444 < var4) {
                                return;
                            }
                            this.field7444 = var4 + var4 - 1 - this.field7444;
                            this.field7436 = -this.field7436;
                            if (--this.field7442 == 0) {
                                break;
                            }
                            if (this.field7444 >= var3) {
                                return;
                            }
                            this.field7444 = var3 + var3 - 1 - this.field7444;
                            this.field7436 = -this.field7436;
                        } while (--this.field7442 != 0);
                    }
                } else if (this.field7436 < 0) {
                    if (this.field7444 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field7444) / var6;
                    if (var7 < this.field7442) {
                        this.field7444 += var6 * var7;
                        this.field7442 -= var7;
                        return;
                    }
                    this.field7444 += this.field7442 * var6;
                    this.field7442 = 0;
                } else {
                    if (this.field7444 < var4) {
                        return;
                    }
                    int var8 = (this.field7444 - var3) / var6;
                    if (var8 < this.field7442) {
                        this.field7444 -= var6 * var8;
                        this.field7442 -= var8;
                        return;
                    }
                    this.field7444 -= this.field7442 * var6;
                    this.field7442 = 0;
                }
            }
            if (this.field7436 < 0) {
                if (this.field7444 < 0) {
                    this.field7444 = -1;
                    this.method3001();
                    this.method1565(0);
                    return;
                }
            } else if (this.field7444 >= var5) {
                this.field7444 = var5;
                this.method3001();
                this.method1565(0);
            }
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(II[B[IIIIIIIILhn;II)I", line = 474)
    private static final int method2987(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class505 arg11, int arg12, int arg13) {
        arg11.field7443 -= arg11.field7438 * arg5;
        arg11.field7437 -= arg11.field7434 * arg5;
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
        arg11.field7443 += arg11.field7438 * arg5;
        arg11.field7437 += arg11.field7434 * arg5;
        arg11.field7435 = arg6;
        arg11.field7444 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(Z)V", line = 507)
    public final synchronized void method2988(boolean arg0) {
        this.field7436 = (this.field7436 >>> 31) + (this.field7436 ^ this.field7436 >> 31);
        if (arg0) {
            this.field7436 = -this.field7436;
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "([B[IIIIIIIILhn;)I", line = 513)
    private static final int method2989(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class505 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field7443 += (var14 - arg3) * arg9.field7438;
        arg9.field7437 += (var14 - arg3) * arg9.field7434;
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
        arg9.field7435 = var12 >> 2;
        arg9.field7444 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!hn", name = "e", descriptor = "(I)V", line = 547)
    public final synchronized void method2990(int arg0) {
        this.method2985(arg0 << 6, this.method3013());
    }

    @OriginalMember(owner = "client!hn", name = "d", descriptor = "(II)I", line = 550)
    private static final int method2991(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "()Lad;", line = 553)
    public final class293 method550() {
        return null;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(I[B[IIIIIIIILhn;)I", line = 559)
    private static final int method2992(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class505 arg10) {
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
        arg10.field7444 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(II[B[IIIIIIIIIILhn;II)I", line = 597)
    private static final int method2993(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class505 arg13, int arg14, int arg15) {
        arg13.field7435 -= arg13.field7445 * arg5;
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
        arg13.field7435 += arg13.field7445 * var22;
        arg13.field7443 = arg6;
        arg13.field7437 = arg7;
        arg13.field7444 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "(II[B[IIIIIIIILhn;II)I", line = 638)
    private static final int method2994(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class505 arg11, int arg12, int arg13) {
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
        arg11.field7444 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!hn", name = "g", descriptor = "()V", line = 670)
    private final void method2995() {
        this.field7435 = this.field7439;
        this.field7443 = method2991(this.field7439, this.field7440);
        this.field7437 = method2978(this.field7439, this.field7440);
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(II[B[IIIIIIILhn;II)I", line = 677)
    private static final int method2996(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class505 arg10, int arg11, int arg12) {
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
        arg10.field7444 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "(I[B[IIIIIIIILhn;)I", line = 704)
    private static final int method2997(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class505 arg10) {
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
        arg10.field7444 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(Lck;II)Lhn;", line = 742)
    public static final class505 method2998(class452 arg0, int arg1, int arg2) {
        return arg0.field6656 != null && arg0.field6656.length != 0 ? new class505(arg0, (int) ((long) arg0.field6655 * 256L * (long) arg1 / (long) (class188.field2724 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "([III)V", line = 749)
    public final synchronized void method523(int[] arg0, int arg1, int arg2) {
        if (this.field7439 == 0 && this.field7447 == 0) {
            this.method546(arg2);
        } else {
            class452 var4 = (class452) super.field4046;
            int var5 = this.field7446 << 8;
            int var6 = this.field7441 << 8;
            int var7 = var4.field6656.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field7442 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field7444 < 0) {
                if (this.field7436 <= 0) {
                    this.method3001();
                    this.method1565(0);
                    return;
                }
                this.field7444 = 0;
            }
            if (this.field7444 >= var7) {
                if (this.field7436 >= 0) {
                    this.method3001();
                    this.method1565(0);
                    return;
                }
                this.field7444 = var7 - 1;
            }
            if (this.field7442 < 0) {
                if (this.field7433) {
                    if (this.field7436 < 0) {
                        var9 = this.method3002(arg0, arg1, var5, var10, var4.field6656[this.field7446]);
                        if (this.field7444 >= var5) {
                            return;
                        }
                        this.field7444 = var5 + var5 - 1 - this.field7444;
                        this.field7436 = -this.field7436;
                    }
                    while (true) {
                        int var11 = this.method2986(arg0, var9, var6, var10, var4.field6656[this.field7441 - 1]);
                        if (this.field7444 < var6) {
                            return;
                        }
                        this.field7444 = var6 + var6 - 1 - this.field7444;
                        this.field7436 = -this.field7436;
                        var9 = this.method3002(arg0, var11, var5, var10, var4.field6656[this.field7446]);
                        if (this.field7444 >= var5) {
                            return;
                        }
                        this.field7444 = var5 + var5 - 1 - this.field7444;
                        this.field7436 = -this.field7436;
                    }
                } else if (this.field7436 < 0) {
                    while (true) {
                        var9 = this.method3002(arg0, var9, var5, var10, var4.field6656[this.field7441 - 1]);
                        if (this.field7444 >= var5) {
                            return;
                        }
                        this.field7444 = var6 - 1 - (var6 - 1 - this.field7444) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method2986(arg0, var9, var6, var10, var4.field6656[this.field7446]);
                        if (this.field7444 < var6) {
                            return;
                        }
                        this.field7444 = (this.field7444 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field7442 > 0) {
                    if (this.field7433) {
                        label130: {
                            if (this.field7436 < 0) {
                                var9 = this.method3002(arg0, arg1, var5, var10, var4.field6656[this.field7446]);
                                if (this.field7444 >= var5) {
                                    return;
                                }
                                this.field7444 = var5 + var5 - 1 - this.field7444;
                                this.field7436 = -this.field7436;
                                if (--this.field7442 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method2986(arg0, var9, var6, var10, var4.field6656[this.field7441 - 1]);
                                if (this.field7444 < var6) {
                                    return;
                                }
                                this.field7444 = var6 + var6 - 1 - this.field7444;
                                this.field7436 = -this.field7436;
                                if (--this.field7442 == 0) {
                                    break;
                                }
                                var9 = this.method3002(arg0, var9, var5, var10, var4.field6656[this.field7446]);
                                if (this.field7444 >= var5) {
                                    return;
                                }
                                this.field7444 = var5 + var5 - 1 - this.field7444;
                                this.field7436 = -this.field7436;
                            } while (--this.field7442 != 0);
                        }
                    } else if (this.field7436 < 0) {
                        while (true) {
                            var9 = this.method3002(arg0, var9, var5, var10, var4.field6656[this.field7441 - 1]);
                            if (this.field7444 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field7444) / var8;
                            if (var12 >= this.field7442) {
                                this.field7444 += this.field7442 * var8;
                                this.field7442 = 0;
                                break;
                            }
                            this.field7444 += var8 * var12;
                            this.field7442 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method2986(arg0, var9, var6, var10, var4.field6656[this.field7446]);
                            if (this.field7444 < var6) {
                                return;
                            }
                            int var13 = (this.field7444 - var5) / var8;
                            if (var13 >= this.field7442) {
                                this.field7444 -= this.field7442 * var8;
                                this.field7442 = 0;
                                break;
                            }
                            this.field7444 -= var8 * var13;
                            this.field7442 -= var13;
                        }
                    }
                }
                if (this.field7436 < 0) {
                    this.method3002(arg0, var9, 0, var10, 0);
                    if (this.field7444 < 0) {
                        this.field7444 = -1;
                        this.method3001();
                        this.method1565(0);
                        return;
                    }
                } else {
                    this.method2986(arg0, var9, var7, var10, 0);
                    if (this.field7444 >= var7) {
                        this.field7444 = var7;
                        this.method3001();
                        this.method1565(0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "()I", line = 985)
    public final int method1734() {
        int var1 = this.field7435 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field7442 == 0) {
            var2 -= this.field7444 * var2 / (((class452) super.field4046).field6656.length << 8);
        } else if (this.field7442 >= 0) {
            var2 -= this.field7446 * var2 / ((class452) super.field4046).field6656.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!hn", name = "f", descriptor = "(I)V", line = 999)
    public final synchronized void method2999(int arg0) {
        if (this.field7436 < 0) {
            this.field7436 = -arg0;
        } else {
            this.field7436 = arg0;
        }
    }

    @OriginalMember(owner = "client!hn", name = "g", descriptor = "(I)V", line = 1006)
    private final synchronized void method3000(int arg0) {
        this.method2985(arg0, this.method3013());
    }

    @OriginalMember(owner = "client!hn", name = "h", descriptor = "()V", line = 1012)
    private final void method3001() {
        if (this.field7447 != 0) {
            if (this.field7439 == Integer.MIN_VALUE) {
                this.field7439 = 0;
            }
            this.field7447 = 0;
            this.method2995();
        }
    }

    @OriginalMember(owner = "client!hn", name = "d", descriptor = "()Lad;", line = 1023)
    public final class293 method521() {
        return null;
    }

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "([IIIII)I", line = 1026)
    private final int method3002(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field7447 <= 0) {
                if (this.field7436 == -256 && (this.field7444 & 255) == 0) {
                    if (class295.field4060) {
                        return method2997(0, ((class452) super.field4046).field6656, arg0, this.field7444, arg1, this.field7443, this.field7437, 0, arg3, arg2, this);
                    }
                    return method3004(((class452) super.field4046).field6656, arg0, this.field7444, arg1, this.field7435, 0, arg3, arg2, this);
                }
                if (class295.field4060) {
                    return method2994(0, 0, ((class452) super.field4046).field6656, arg0, this.field7444, arg1, this.field7443, this.field7437, 0, arg3, arg2, this, this.field7436, arg4);
                }
                return method2996(0, 0, ((class452) super.field4046).field6656, arg0, this.field7444, arg1, this.field7435, 0, arg3, arg2, this, this.field7436, arg4);
            }
            int var6 = this.field7447 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field7447 += arg1;
            if (this.field7436 == -256 && (this.field7444 & 255) == 0) {
                if (class295.field4060) {
                    arg1 = method2979(0, ((class452) super.field4046).field6656, arg0, this.field7444, arg1, this.field7443, this.field7437, this.field7438, this.field7434, 0, var6, arg2, this);
                } else {
                    arg1 = method2989(((class452) super.field4046).field6656, arg0, this.field7444, arg1, this.field7435, this.field7445, 0, var6, arg2, this);
                }
            } else if (class295.field4060) {
                arg1 = method2993(0, 0, ((class452) super.field4046).field6656, arg0, this.field7444, arg1, this.field7443, this.field7437, this.field7438, this.field7434, 0, var6, arg2, this, this.field7436, arg4);
            } else {
                arg1 = method3017(0, 0, ((class452) super.field4046).field6656, arg0, this.field7444, arg1, this.field7435, this.field7445, 0, var6, arg2, this, this.field7436, arg4);
            }
            this.field7447 -= arg1;
            if (this.field7447 != 0) {
                return arg1;
            }
        } while (!this.method2984());
        return arg3;
    }

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "(II[B[IIIIIIIIIILhn;II)I", line = 1082)
    private static final int method3003(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class505 arg13, int arg14, int arg15) {
        arg13.field7435 -= arg13.field7445 * arg5;
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
        arg13.field7435 += arg13.field7445 * var22;
        arg13.field7443 = arg6;
        arg13.field7437 = arg7;
        arg13.field7444 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "([B[IIIIIIILhn;)I", line = 1125)
    private static final int method3004(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class505 arg8) {
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
        arg8.field7444 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "()I", line = 1150)
    public final int method538() {
        return this.field7439 == 0 && this.field7447 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "(II[B[IIIIIIIILhn;II)I", line = 1156)
    private static final int method3005(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class505 arg11, int arg12, int arg13) {
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
        arg11.field7444 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "(I[B[IIIIIIIIIILhn;)I", line = 1189)
    private static final int method3006(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class505 arg12) {
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
        arg12.field7435 += (var19 - arg4) * arg12.field7445;
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
        arg12.field7443 = var15 >> 2;
        arg12.field7437 = var16 >> 2;
        arg12.field7444 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(III)V", line = 1247)
    public final synchronized void method3007(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method2985(arg1, arg2);
        } else {
            int var4 = method2991(arg1, arg2);
            int var5 = method2978(arg1, arg2);
            if (this.field7443 == var4 && this.field7437 == var5) {
                this.field7447 = 0;
            } else {
                int var6 = arg1 - this.field7435;
                if (this.field7435 - arg1 > var6) {
                    var6 = this.field7435 - arg1;
                }
                if (var4 - this.field7443 > var6) {
                    var6 = var4 - this.field7443;
                }
                if (this.field7443 - var4 > var6) {
                    var6 = this.field7443 - var4;
                }
                if (var5 - this.field7437 > var6) {
                    var6 = var5 - this.field7437;
                }
                if (this.field7437 - var5 > var6) {
                    var6 = this.field7437 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field7447 = arg0;
                this.field7439 = arg1;
                this.field7440 = arg2;
                this.field7445 = (arg1 - this.field7435) / arg0;
                this.field7438 = (var4 - this.field7443) / arg0;
                this.field7434 = (var5 - this.field7437) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!hn", name = "i", descriptor = "()I", line = 1296)
    public final synchronized int method3008() {
        return this.field7439 == Integer.MIN_VALUE ? 0 : this.field7439;
    }

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "([B[IIIIIIIILhn;)I", line = 1299)
    private static final int method3009(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class505 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field7443 += (var14 - arg3) * arg9.field7438;
        arg9.field7437 += (var14 - arg3) * arg9.field7434;
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
        arg9.field7435 = var12 >> 2;
        arg9.field7444 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!hn", name = "h", descriptor = "(I)V", line = 1333)
    public final synchronized void method3010(int arg0) {
        this.field7442 = arg0;
    }

    @OriginalMember(owner = "client!hn", name = "i", descriptor = "(I)V", line = 1337)
    public final synchronized void method3011(int arg0) {
        if (arg0 == 0) {
            this.method3000(0);
            this.method1565(0);
        } else if (this.field7443 == 0 && this.field7437 == 0) {
            this.field7447 = 0;
            this.field7439 = 0;
            this.field7435 = 0;
            this.method1565(0);
        } else {
            int var2 = -this.field7435;
            if (this.field7435 > var2) {
                var2 = this.field7435;
            }
            if (-this.field7443 > var2) {
                var2 = -this.field7443;
            }
            if (this.field7443 > var2) {
                var2 = this.field7443;
            }
            if (-this.field7437 > var2) {
                var2 = -this.field7437;
            }
            if (this.field7437 > var2) {
                var2 = this.field7437;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field7447 = arg0;
            this.field7439 = Integer.MIN_VALUE;
            this.field7445 = -this.field7435 / arg0;
            this.field7438 = -this.field7443 / arg0;
            this.field7434 = -this.field7437 / arg0;
        }
    }

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "(II[B[IIIIIIILhn;II)I", line = 1383)
    private static final int method3012(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class505 arg10, int arg11, int arg12) {
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
        arg10.field7444 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!hn", name = "j", descriptor = "()I", line = 1410)
    public final synchronized int method3013() {
        return this.field7440 < 0 ? -1 : this.field7440;
    }

    @OriginalMember(owner = "client!hn", name = "k", descriptor = "()Z", line = 1413)
    public final boolean method3014() {
        return this.field7444 < 0 || this.field7444 >= ((class452) super.field4046).field6656.length << 8;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(Lck;III)Lhn;", line = 1417)
    public static final class505 method3015(class452 arg0, int arg1, int arg2, int arg3) {
        return arg0.field6656 != null && arg0.field6656.length != 0 ? new class505(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!hn", name = "l", descriptor = "()Z", line = 1423)
    public final boolean method3016() {
        return this.field7447 != 0;
    }

    @OriginalMember(owner = "client!hn", name = "<init>", descriptor = "(Lck;II)V", line = 1425)
    private class505(class452 arg0, int arg1, int arg2) {
        super.field4046 = arg0;
        this.field7446 = arg0.field6654;
        this.field7441 = arg0.field6658;
        this.field7433 = arg0.field6657;
        this.field7436 = arg1;
        this.field7439 = arg2;
        this.field7440 = 8192;
        this.field7444 = 0;
        this.method2995();
    }

    @OriginalMember(owner = "client!hn", name = "<init>", descriptor = "(Lck;III)V", line = 1436)
    private class505(class452 arg0, int arg1, int arg2, int arg3) {
        super.field4046 = arg0;
        this.field7446 = arg0.field6654;
        this.field7441 = arg0.field6658;
        this.field7433 = arg0.field6657;
        this.field7436 = arg1;
        this.field7439 = arg2;
        this.field7440 = arg3;
        this.field7444 = 0;
        this.method2995();
    }

    @OriginalMember(owner = "client!hn", name = "d", descriptor = "(II[B[IIIIIIIILhn;II)I", line = 1448)
    private static final int method3017(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class505 arg11, int arg12, int arg13) {
        arg11.field7443 -= arg11.field7438 * arg5;
        arg11.field7437 -= arg11.field7434 * arg5;
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
        arg11.field7443 += arg11.field7438 * arg5;
        arg11.field7437 += arg11.field7434 * arg5;
        arg11.field7435 = arg6;
        arg11.field7444 = arg4;
        return arg5;
    }
}
