import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class136 extends class34 {

    @OriginalMember(owner = "client!mh", name = "z", descriptor = "I")
    private int field2461;

    @OriginalMember(owner = "client!mh", name = "x", descriptor = "I")
    private int field2459;

    @OriginalMember(owner = "client!mh", name = "w", descriptor = "Z")
    private boolean field2458;

    @OriginalMember(owner = "client!mh", name = "v", descriptor = "I")
    private int field2457;

    @OriginalMember(owner = "client!mh", name = "E", descriptor = "I")
    private int field2466;

    @OriginalMember(owner = "client!mh", name = "A", descriptor = "I")
    private int field2462;

    @OriginalMember(owner = "client!mh", name = "I", descriptor = "I")
    private int field2470;

    @OriginalMember(owner = "client!mh", name = "u", descriptor = "I")
    private int field2456;

    @OriginalMember(owner = "client!mh", name = "y", descriptor = "I")
    private int field2460;

    @OriginalMember(owner = "client!mh", name = "B", descriptor = "I")
    private int field2463;

    @OriginalMember(owner = "client!mh", name = "C", descriptor = "I")
    private int field2464;

    @OriginalMember(owner = "client!mh", name = "D", descriptor = "I")
    private int field2465;

    @OriginalMember(owner = "client!mh", name = "F", descriptor = "I")
    private int field2467;

    @OriginalMember(owner = "client!mh", name = "G", descriptor = "I")
    private int field2468;

    @OriginalMember(owner = "client!mh", name = "H", descriptor = "I")
    private int field2469;

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "(I)V")
    public final synchronized void method828(int arg0) {
        this.field2460 = arg0;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(II[B[IIIIIIIILmh;II)I")
    private static final int method829(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class136 arg11, int arg12, int arg13) {
        arg11.field2468 -= arg11.field2464 * arg5;
        arg11.field2469 -= arg11.field2467 * arg5;
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
        arg11.field2468 += arg11.field2464 * arg5;
        arg11.field2469 += arg11.field2467 * arg5;
        arg11.field2465 = arg6;
        arg11.field2470 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "()I")
    public final synchronized int method830() {
        return this.field2466 == Integer.MIN_VALUE ? 0 : this.field2466;
    }

    @OriginalMember(owner = "client!mh", name = "f", descriptor = "()I")
    public final synchronized int method831() {
        return this.field2462 < 0 ? -1 : this.field2462;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "([B[IIIIIIILmh;)I")
    private static final int method832(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class136 arg8) {
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
        arg8.field2470 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "([B[IIIIIIIILmh;)I")
    private static final int method833(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class136 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field2468 += (var14 - arg3) * arg9.field2464;
        arg9.field2469 += (var14 - arg3) * arg9.field2467;
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
        arg9.field2465 = var12 >> 2;
        arg9.field2470 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(I)V")
    public final synchronized void method255(int arg0) {
        if (this.field2463 > 0) {
            if (arg0 >= this.field2463) {
                if (this.field2466 == Integer.MIN_VALUE) {
                    this.field2466 = 0;
                    this.field2465 = this.field2468 = this.field2469 = 0;
                    this.method636(87);
                    arg0 = this.field2463;
                }
                this.field2463 = 0;
                this.method849();
            } else {
                this.field2465 += this.field2456 * arg0;
                this.field2468 += this.field2464 * arg0;
                this.field2469 += this.field2467 * arg0;
                this.field2463 -= arg0;
            }
        }
        class135 var2 = (class135) super.field705;
        int var3 = this.field2461 << 8;
        int var4 = this.field2459 << 8;
        int var5 = var2.field2454.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field2460 = 0;
        }
        if (this.field2470 < 0) {
            if (this.field2457 <= 0) {
                this.method834();
                this.method636(93);
                return;
            }
            this.field2470 = 0;
        }
        if (this.field2470 >= var5) {
            if (this.field2457 >= 0) {
                this.method834();
                this.method636(123);
                return;
            }
            this.field2470 = var5 - 1;
        }
        this.field2470 += this.field2457 * arg0;
        if (this.field2460 < 0) {
            if (!this.field2458) {
                if (this.field2457 < 0) {
                    if (this.field2470 < var3) {
                        this.field2470 = var4 - 1 - (var4 - 1 - this.field2470) % var6;
                    }
                } else if (this.field2470 >= var4) {
                    this.field2470 = (this.field2470 - var3) % var6 + var3;
                }
            } else {
                if (this.field2457 < 0) {
                    if (this.field2470 >= var3) {
                        return;
                    }
                    this.field2470 = var3 + var3 - 1 - this.field2470;
                    this.field2457 = -this.field2457;
                }
                while (this.field2470 >= var4) {
                    this.field2470 = var4 + var4 - 1 - this.field2470;
                    this.field2457 = -this.field2457;
                    if (this.field2470 >= var3) {
                        return;
                    }
                    this.field2470 = var3 + var3 - 1 - this.field2470;
                    this.field2457 = -this.field2457;
                }
            }
        } else {
            if (this.field2460 > 0) {
                if (this.field2458) {
                    label125: {
                        if (this.field2457 < 0) {
                            if (this.field2470 >= var3) {
                                return;
                            }
                            this.field2470 = var3 + var3 - 1 - this.field2470;
                            this.field2457 = -this.field2457;
                            if (--this.field2460 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field2470 < var4) {
                                return;
                            }
                            this.field2470 = var4 + var4 - 1 - this.field2470;
                            this.field2457 = -this.field2457;
                            if (--this.field2460 == 0) {
                                break;
                            }
                            if (this.field2470 >= var3) {
                                return;
                            }
                            this.field2470 = var3 + var3 - 1 - this.field2470;
                            this.field2457 = -this.field2457;
                        } while (--this.field2460 != 0);
                    }
                } else if (this.field2457 < 0) {
                    if (this.field2470 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field2470) / var6;
                    if (var7 < this.field2460) {
                        this.field2470 += var6 * var7;
                        this.field2460 -= var7;
                        return;
                    }
                    this.field2470 += this.field2460 * var6;
                    this.field2460 = 0;
                } else {
                    if (this.field2470 < var4) {
                        return;
                    }
                    int var8 = (this.field2470 - var3) / var6;
                    if (var8 < this.field2460) {
                        this.field2470 -= var6 * var8;
                        this.field2460 -= var8;
                        return;
                    }
                    this.field2470 -= this.field2460 * var6;
                    this.field2460 = 0;
                }
            }
            if (this.field2457 < 0) {
                if (this.field2470 < 0) {
                    this.field2470 = -1;
                    this.method834();
                    this.method636(119);
                    return;
                }
            } else if (this.field2470 >= var5) {
                this.field2470 = var5;
                this.method834();
                this.method636(63);
            }
        }
    }

    @OriginalMember(owner = "client!mh", name = "g", descriptor = "()V")
    private final void method834() {
        if (this.field2463 != 0) {
            if (this.field2466 == Integer.MIN_VALUE) {
                this.field2466 = 0;
            }
            this.field2463 = 0;
            this.method849();
        }
    }

    @OriginalMember(owner = "client!mh", name = "h", descriptor = "()Z")
    public final boolean method835() {
        return this.field2463 != 0;
    }

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "(I)V")
    public final synchronized void method836(int arg0) {
        this.method854(arg0 << 6, this.method831());
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(I[B[IIIIIIIILmh;)I")
    private static final int method837(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class136 arg10) {
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
        arg10.field2470 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "([IIIII)I")
    private final int method838(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field2463 <= 0) {
                if (this.field2457 == 256 && (this.field2470 & 255) == 0) {
                    if (class149.field2668) {
                        return method840(0, ((class135) super.field705).field2454, arg0, this.field2470, arg1, this.field2468, this.field2469, 0, arg3, arg2, this);
                    }
                    return method832(((class135) super.field705).field2454, arg0, this.field2470, arg1, this.field2465, 0, arg3, arg2, this);
                }
                if (class149.field2668) {
                    return method856(0, 0, ((class135) super.field705).field2454, arg0, this.field2470, arg1, this.field2468, this.field2469, 0, arg3, arg2, this, this.field2457, arg4);
                }
                return method866(0, 0, ((class135) super.field705).field2454, arg0, this.field2470, arg1, this.field2465, 0, arg3, arg2, this, this.field2457, arg4);
            }
            int var6 = this.field2463 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field2463 += arg1;
            if (this.field2457 == 256 && (this.field2470 & 255) == 0) {
                if (class149.field2668) {
                    arg1 = method865(0, ((class135) super.field705).field2454, arg0, this.field2470, arg1, this.field2468, this.field2469, this.field2464, this.field2467, 0, var6, arg2, this);
                } else {
                    arg1 = method833(((class135) super.field705).field2454, arg0, this.field2470, arg1, this.field2465, this.field2456, 0, var6, arg2, this);
                }
            } else if (class149.field2668) {
                arg1 = method851(0, 0, ((class135) super.field705).field2454, arg0, this.field2470, arg1, this.field2468, this.field2469, this.field2464, this.field2467, 0, var6, arg2, this, this.field2457, arg4);
            } else {
                arg1 = method829(0, 0, ((class135) super.field705).field2454, arg0, this.field2470, arg1, this.field2465, this.field2456, 0, var6, arg2, this, this.field2457, arg4);
            }
            this.field2463 -= arg1;
            if (this.field2463 != 0) {
                return arg1;
            }
        } while (!this.method867());
        return arg3;
    }

    @OriginalMember(owner = "client!mh", name = "i", descriptor = "()Z")
    public final boolean method839() {
        return this.field2470 < 0 || this.field2470 >= ((class135) super.field705).field2454.length << 8;
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(I[B[IIIIIIIILmh;)I")
    private static final int method840(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class136 arg10) {
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
        arg10.field2470 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(III)V")
    public final synchronized void method841(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method854(arg1, arg2);
        } else {
            int var4 = method862(arg1, arg2);
            int var5 = method844(arg1, arg2);
            if (this.field2468 == var4 && this.field2469 == var5) {
                this.field2463 = 0;
            } else {
                int var6 = arg1 - this.field2465;
                if (this.field2465 - arg1 > var6) {
                    var6 = this.field2465 - arg1;
                }
                if (var4 - this.field2468 > var6) {
                    var6 = var4 - this.field2468;
                }
                if (this.field2468 - var4 > var6) {
                    var6 = this.field2468 - var4;
                }
                if (var5 - this.field2469 > var6) {
                    var6 = var5 - this.field2469;
                }
                if (this.field2469 - var5 > var6) {
                    var6 = this.field2469 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field2463 = arg0;
                this.field2466 = arg1;
                this.field2462 = arg2;
                this.field2456 = (arg1 - this.field2465) / arg0;
                this.field2464 = (var4 - this.field2468) / arg0;
                this.field2467 = (var5 - this.field2469) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(II[B[IIIIIIILmh;II)I")
    private static final int method842(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class136 arg10, int arg11, int arg12) {
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
        arg10.field2470 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "(I)V")
    private final synchronized void method843(int arg0) {
        this.method854(arg0, this.method831());
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(II)I")
    private static final int method844(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(II[B[IIIIIIIIIILmh;II)I")
    private static final int method845(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class136 arg13, int arg14, int arg15) {
        arg13.field2465 -= arg13.field2456 * arg5;
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
        arg13.field2465 += arg13.field2456 * var22;
        arg13.field2468 = arg6;
        arg13.field2469 = arg7;
        arg13.field2470 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "(II)V")
    public final synchronized void method846(int arg0, int arg1) {
        this.method841(arg0, arg1, this.method831());
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "()Ld;")
    public final class34 method250() {
        return null;
    }

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "()I")
    public final int method256() {
        return this.field2466 == 0 && this.field2463 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "()Ld;")
    public final class34 method251() {
        return null;
    }

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "()I")
    public final int method254() {
        int var1 = this.field2465 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field2460 == 0) {
            var2 -= this.field2470 * var2 / (((class135) super.field705).field2454.length << 8);
        } else if (this.field2460 >= 0) {
            var2 -= this.field2461 * var2 / ((class135) super.field705).field2454.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lmg;II)Lmh;")
    public static final class136 method847(class135 arg0, int arg1, int arg2) {
        return arg0.field2454 != null && arg0.field2454.length != 0 ? new class136(arg0, (int) ((long) arg0.field2452 * 256L * (long) arg1 / (long) (class204.field3624 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lmg;III)Lmh;")
    public static final class136 method848(class135 arg0, int arg1, int arg2, int arg3) {
        return arg0.field2454 != null && arg0.field2454.length != 0 ? new class136(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!mh", name = "j", descriptor = "()V")
    private final void method849() {
        this.field2465 = this.field2466;
        this.field2468 = method862(this.field2466, this.field2462);
        this.field2469 = method844(this.field2466, this.field2462);
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(II[B[IIIIIIIILmh;II)I")
    private static final int method850(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class136 arg11, int arg12, int arg13) {
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
        arg11.field2470 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(II[B[IIIIIIIIIILmh;II)I")
    private static final int method851(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class136 arg13, int arg14, int arg15) {
        arg13.field2465 -= arg13.field2456 * arg5;
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
        arg13.field2465 += arg13.field2456 * var22;
        arg13.field2468 = arg6;
        arg13.field2469 = arg7;
        arg13.field2470 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "([III)V")
    public final synchronized void method253(int[] arg0, int arg1, int arg2) {
        if (this.field2466 == 0 && this.field2463 == 0) {
            this.method255(arg2);
        } else {
            class135 var4 = (class135) super.field705;
            int var5 = this.field2461 << 8;
            int var6 = this.field2459 << 8;
            int var7 = var4.field2454.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field2460 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field2470 < 0) {
                if (this.field2457 <= 0) {
                    this.method834();
                    this.method636(104);
                    return;
                }
                this.field2470 = 0;
            }
            if (this.field2470 >= var7) {
                if (this.field2457 >= 0) {
                    this.method834();
                    this.method636(111);
                    return;
                }
                this.field2470 = var7 - 1;
            }
            if (this.field2460 < 0) {
                if (this.field2458) {
                    if (this.field2457 < 0) {
                        var9 = this.method860(arg0, arg1, var5, var10, var4.field2454[this.field2461]);
                        if (this.field2470 >= var5) {
                            return;
                        }
                        this.field2470 = var5 + var5 - 1 - this.field2470;
                        this.field2457 = -this.field2457;
                    }
                    while (true) {
                        int var11 = this.method838(arg0, var9, var6, var10, var4.field2454[this.field2459 - 1]);
                        if (this.field2470 < var6) {
                            return;
                        }
                        this.field2470 = var6 + var6 - 1 - this.field2470;
                        this.field2457 = -this.field2457;
                        var9 = this.method860(arg0, var11, var5, var10, var4.field2454[this.field2461]);
                        if (this.field2470 >= var5) {
                            return;
                        }
                        this.field2470 = var5 + var5 - 1 - this.field2470;
                        this.field2457 = -this.field2457;
                    }
                } else if (this.field2457 < 0) {
                    while (true) {
                        var9 = this.method860(arg0, var9, var5, var10, var4.field2454[this.field2459 - 1]);
                        if (this.field2470 >= var5) {
                            return;
                        }
                        this.field2470 = var6 - 1 - (var6 - 1 - this.field2470) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method838(arg0, var9, var6, var10, var4.field2454[this.field2461]);
                        if (this.field2470 < var6) {
                            return;
                        }
                        this.field2470 = (this.field2470 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field2460 > 0) {
                    if (this.field2458) {
                        label130: {
                            if (this.field2457 < 0) {
                                var9 = this.method860(arg0, arg1, var5, var10, var4.field2454[this.field2461]);
                                if (this.field2470 >= var5) {
                                    return;
                                }
                                this.field2470 = var5 + var5 - 1 - this.field2470;
                                this.field2457 = -this.field2457;
                                if (--this.field2460 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method838(arg0, var9, var6, var10, var4.field2454[this.field2459 - 1]);
                                if (this.field2470 < var6) {
                                    return;
                                }
                                this.field2470 = var6 + var6 - 1 - this.field2470;
                                this.field2457 = -this.field2457;
                                if (--this.field2460 == 0) {
                                    break;
                                }
                                var9 = this.method860(arg0, var9, var5, var10, var4.field2454[this.field2461]);
                                if (this.field2470 >= var5) {
                                    return;
                                }
                                this.field2470 = var5 + var5 - 1 - this.field2470;
                                this.field2457 = -this.field2457;
                            } while (--this.field2460 != 0);
                        }
                    } else if (this.field2457 < 0) {
                        while (true) {
                            var9 = this.method860(arg0, var9, var5, var10, var4.field2454[this.field2459 - 1]);
                            if (this.field2470 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field2470) / var8;
                            if (var12 >= this.field2460) {
                                this.field2470 += this.field2460 * var8;
                                this.field2460 = 0;
                                break;
                            }
                            this.field2470 += var8 * var12;
                            this.field2460 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method838(arg0, var9, var6, var10, var4.field2454[this.field2461]);
                            if (this.field2470 < var6) {
                                return;
                            }
                            int var13 = (this.field2470 - var5) / var8;
                            if (var13 >= this.field2460) {
                                this.field2470 -= this.field2460 * var8;
                                this.field2460 = 0;
                                break;
                            }
                            this.field2470 -= var8 * var13;
                            this.field2460 -= var13;
                        }
                    }
                }
                if (this.field2457 < 0) {
                    this.method860(arg0, var9, 0, var10, 0);
                    if (this.field2470 < 0) {
                        this.field2470 = -1;
                        this.method834();
                        this.method636(118);
                        return;
                    }
                } else {
                    this.method838(arg0, var9, var7, var10, 0);
                    if (this.field2470 >= var7) {
                        this.field2470 = var7;
                        this.method834();
                        this.method636(73);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(I[B[IIIIIIIIIILmh;)I")
    private static final int method852(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class136 arg12) {
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
        arg12.field2465 += (var19 - arg4) * arg12.field2456;
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
        arg12.field2468 = var15 >> 2;
        arg12.field2469 = var16 >> 2;
        arg12.field2470 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!mh", name = "f", descriptor = "(I)V")
    public final synchronized void method853(int arg0) {
        int var2 = ((class135) super.field705).field2454.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field2470 = arg0;
    }

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "(II)V")
    private final synchronized void method854(int arg0, int arg1) {
        this.field2466 = arg0;
        this.field2462 = arg1;
        this.field2463 = 0;
        this.method849();
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "([B[IIIIIIILmh;)I")
    private static final int method855(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class136 arg8) {
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
        arg8.field2470 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "(II[B[IIIIIIIILmh;II)I")
    private static final int method856(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class136 arg11, int arg12, int arg13) {
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
        arg11.field2470 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "([B[IIIIIIIILmh;)I")
    private static final int method857(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class136 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field2468 += (var14 - arg3) * arg9.field2464;
        arg9.field2469 += (var14 - arg3) * arg9.field2467;
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
        arg9.field2465 = var12 >> 2;
        arg9.field2470 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!mh", name = "g", descriptor = "(I)V")
    public final synchronized void method858(int arg0) {
        if (this.field2457 < 0) {
            this.field2457 = -arg0;
        } else {
            this.field2457 = arg0;
        }
    }

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "(II[B[IIIIIIIILmh;II)I")
    private static final int method859(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class136 arg11, int arg12, int arg13) {
        arg11.field2468 -= arg11.field2464 * arg5;
        arg11.field2469 -= arg11.field2467 * arg5;
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
        arg11.field2468 += arg11.field2464 * arg5;
        arg11.field2469 += arg11.field2467 * arg5;
        arg11.field2465 = arg6;
        arg11.field2470 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "([IIIII)I")
    private final int method860(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field2463 <= 0) {
                if (this.field2457 == -256 && (this.field2470 & 255) == 0) {
                    if (class149.field2668) {
                        return method837(0, ((class135) super.field705).field2454, arg0, this.field2470, arg1, this.field2468, this.field2469, 0, arg3, arg2, this);
                    }
                    return method855(((class135) super.field705).field2454, arg0, this.field2470, arg1, this.field2465, 0, arg3, arg2, this);
                }
                if (class149.field2668) {
                    return method850(0, 0, ((class135) super.field705).field2454, arg0, this.field2470, arg1, this.field2468, this.field2469, 0, arg3, arg2, this, this.field2457, arg4);
                }
                return method842(0, 0, ((class135) super.field705).field2454, arg0, this.field2470, arg1, this.field2465, 0, arg3, arg2, this, this.field2457, arg4);
            }
            int var6 = this.field2463 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field2463 += arg1;
            if (this.field2457 == -256 && (this.field2470 & 255) == 0) {
                if (class149.field2668) {
                    arg1 = method852(0, ((class135) super.field705).field2454, arg0, this.field2470, arg1, this.field2468, this.field2469, this.field2464, this.field2467, 0, var6, arg2, this);
                } else {
                    arg1 = method857(((class135) super.field705).field2454, arg0, this.field2470, arg1, this.field2465, this.field2456, 0, var6, arg2, this);
                }
            } else if (class149.field2668) {
                arg1 = method845(0, 0, ((class135) super.field705).field2454, arg0, this.field2470, arg1, this.field2468, this.field2469, this.field2464, this.field2467, 0, var6, arg2, this, this.field2457, arg4);
            } else {
                arg1 = method859(0, 0, ((class135) super.field705).field2454, arg0, this.field2470, arg1, this.field2465, this.field2456, 0, var6, arg2, this, this.field2457, arg4);
            }
            this.field2463 -= arg1;
            if (this.field2463 != 0) {
                return arg1;
            }
        } while (!this.method867());
        return arg3;
    }

    @OriginalMember(owner = "client!mh", name = "h", descriptor = "(I)V")
    public final synchronized void method861(int arg0) {
        if (arg0 == 0) {
            this.method843(0);
            this.method636(112);
        } else if (this.field2468 == 0 && this.field2469 == 0) {
            this.field2463 = 0;
            this.field2466 = 0;
            this.field2465 = 0;
            this.method636(79);
        } else {
            int var2 = -this.field2465;
            if (this.field2465 > var2) {
                var2 = this.field2465;
            }
            if (-this.field2468 > var2) {
                var2 = -this.field2468;
            }
            if (this.field2468 > var2) {
                var2 = this.field2468;
            }
            if (-this.field2469 > var2) {
                var2 = -this.field2469;
            }
            if (this.field2469 > var2) {
                var2 = this.field2469;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field2463 = arg0;
            this.field2466 = Integer.MIN_VALUE;
            this.field2456 = -this.field2465 / arg0;
            this.field2464 = -this.field2468 / arg0;
            this.field2467 = -this.field2469 / arg0;
        }
    }

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "(II)I")
    private static final int method862(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!mh", name = "k", descriptor = "()I")
    public final synchronized int method863() {
        return this.field2457 < 0 ? -this.field2457 : this.field2457;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Z)V")
    public final synchronized void method864(boolean arg0) {
        this.field2457 = (this.field2457 >>> 31) + (this.field2457 ^ this.field2457 >> 31);
        if (arg0) {
            this.field2457 = -this.field2457;
        }
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(I[B[IIIIIIIIIILmh;)I")
    private static final int method865(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class136 arg12) {
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
        arg12.field2465 += (var19 - arg4) * arg12.field2456;
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
        arg12.field2468 = var15 >> 2;
        arg12.field2469 = var16 >> 2;
        arg12.field2470 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(II[B[IIIIIIILmh;II)I")
    private static final int method866(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class136 arg10, int arg11, int arg12) {
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
        arg10.field2470 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!mh", name = "<init>", descriptor = "(Lmg;II)V")
    private class136(class135 arg0, int arg1, int arg2) {
        super.field705 = arg0;
        this.field2461 = arg0.field2453;
        this.field2459 = arg0.field2455;
        this.field2458 = arg0.field2451;
        this.field2457 = arg1;
        this.field2466 = arg2;
        this.field2462 = 8192;
        this.field2470 = 0;
        this.method849();
    }

    @OriginalMember(owner = "client!mh", name = "l", descriptor = "()Z")
    private final boolean method867() {
        int var1 = this.field2466;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method862(var1, this.field2462);
            var2 = method844(var1, this.field2462);
        }
        if (this.field2465 == var1 && this.field2468 == var3 && this.field2469 == var2) {
            if (this.field2466 == Integer.MIN_VALUE) {
                this.field2466 = 0;
                this.field2465 = this.field2468 = this.field2469 = 0;
                this.method636(103);
                return true;
            } else {
                this.method849();
                return false;
            }
        } else {
            if (this.field2465 < var1) {
                this.field2456 = 1;
                this.field2463 = var1 - this.field2465;
            } else if (this.field2465 > var1) {
                this.field2456 = -1;
                this.field2463 = this.field2465 - var1;
            } else {
                this.field2456 = 0;
            }
            if (this.field2468 < var3) {
                this.field2464 = 1;
                if (this.field2463 == 0 || this.field2463 > var3 - this.field2468) {
                    this.field2463 = var3 - this.field2468;
                }
            } else if (this.field2468 > var3) {
                this.field2464 = -1;
                if (this.field2463 == 0 || this.field2463 > this.field2468 - var3) {
                    this.field2463 = this.field2468 - var3;
                }
            } else {
                this.field2464 = 0;
            }
            if (this.field2469 < var2) {
                this.field2467 = 1;
                if (this.field2463 == 0 || this.field2463 > var2 - this.field2469) {
                    this.field2463 = var2 - this.field2469;
                }
            } else if (this.field2469 > var2) {
                this.field2467 = -1;
                if (this.field2463 == 0 || this.field2463 > this.field2469 - var2) {
                    this.field2463 = this.field2469 - var2;
                }
            } else {
                this.field2467 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!mh", name = "<init>", descriptor = "(Lmg;III)V")
    private class136(class135 arg0, int arg1, int arg2, int arg3) {
        super.field705 = arg0;
        this.field2461 = arg0.field2453;
        this.field2459 = arg0.field2455;
        this.field2458 = arg0.field2451;
        this.field2457 = arg1;
        this.field2466 = arg2;
        this.field2462 = arg3;
        this.field2470 = 0;
        this.method849();
    }
}
