import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class27 extends class26 {

    @OriginalMember(owner = "client!de", name = "r", descriptor = "I")
    private int field558;

    @OriginalMember(owner = "client!de", name = "B", descriptor = "I")
    private int field568;

    @OriginalMember(owner = "client!de", name = "z", descriptor = "Z")
    private boolean field566;

    @OriginalMember(owner = "client!de", name = "t", descriptor = "I")
    private int field560;

    @OriginalMember(owner = "client!de", name = "p", descriptor = "I")
    private int field556;

    @OriginalMember(owner = "client!de", name = "u", descriptor = "I")
    private int field561;

    @OriginalMember(owner = "client!de", name = "y", descriptor = "I")
    private int field565;

    @OriginalMember(owner = "client!de", name = "q", descriptor = "I")
    private int field557;

    @OriginalMember(owner = "client!de", name = "s", descriptor = "I")
    private int field559;

    @OriginalMember(owner = "client!de", name = "v", descriptor = "I")
    private int field562;

    @OriginalMember(owner = "client!de", name = "w", descriptor = "I")
    private int field563;

    @OriginalMember(owner = "client!de", name = "x", descriptor = "I")
    private int field564;

    @OriginalMember(owner = "client!de", name = "A", descriptor = "I")
    private int field567;

    @OriginalMember(owner = "client!de", name = "C", descriptor = "I")
    private int field569;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "([B[IIIIIIIIILde;)I", line = 4)
    private static final int method199(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class27 arg10) {
        int var11 = arg2 >> 8;
        int var12 = arg9 >> 8;
        int var13 = arg4 << 8;
        int var14 = arg6 << 8;
        int var15;
        if ((var15 = arg3 + var12 - var11) > arg8) {
            var15 = arg8;
        }
        var15 -= 3;
        int var10001;
        while (arg3 < var15) {
            var10001 = arg3++;
            arg1[var10001] += arg0[var11++] * var13 >> arg5;
            int var16 = var13 + var14;
            int var19 = arg3++;
            arg1[var19] += arg0[var11++] * var16 >> arg5;
            int var17 = var14 + var16;
            int var20 = arg3++;
            arg1[var20] += arg0[var11++] * var17 >> arg5;
            int var18 = var14 + var17;
            int var21 = arg3++;
            arg1[var21] += arg0[var11++] * var18 >> arg5;
            var13 = var14 + var18;
        }
        var15 += 3;
        while (arg3 < var15) {
            var10001 = arg3++;
            arg1[var10001] += arg0[var11++] * var13 >> arg5;
            var13 += var14;
        }
        arg10.field556 = var13 >> 8;
        arg10.field565 = var11 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!de", name = "e", descriptor = "(I)V", line = 36)
    public final synchronized void method198(int arg0) {
        if (!this.method207()) {
            if (this.field559 > 0) {
                if (arg0 >= this.field559) {
                    if (this.field562 == Integer.MIN_VALUE) {
                        this.field556 = 0;
                        this.method13(89);
                        arg0 = this.field559;
                    } else {
                        this.field556 = this.field562;
                    }
                    this.field561 = this.field564;
                    this.field559 = 0;
                } else {
                    this.field556 += this.field563 * arg0;
                    if (class45.field1098) {
                        this.field561 += this.field569 * arg0;
                    }
                    this.field559 -= arg0;
                }
            }
            this.field565 += this.field560 * arg0;
            class16 var2 = (class16) super.field554;
            int var3 = this.field558 << 8;
            int var4 = this.field568 << 8;
            int var5 = var2.field340.length << 8;
            int var6 = var4 - var3;
            if (var6 <= 0) {
                this.field567 = 0;
            }
            if (this.field567 < 0) {
                if (!this.field566) {
                    if (this.field560 < 0) {
                        if (this.field565 < var3) {
                            this.field565 = var4 - 1 - (var4 - 1 - this.field565) % var6;
                        }
                    } else if (this.field565 >= var4) {
                        this.field565 = (this.field565 - var3) % var6 + var3;
                    }
                } else {
                    if (this.field560 < 0) {
                        if (this.field565 >= var3) {
                            return;
                        }
                        this.field565 = var3 + var3 - 1 - this.field565;
                        this.field560 = -this.field560;
                    }
                    while (this.field565 >= var4) {
                        this.field565 = var4 + var4 - 1 - this.field565;
                        this.field560 = -this.field560;
                        if (this.field565 >= var3) {
                            return;
                        }
                        this.field565 = var3 + var3 - 1 - this.field565;
                        this.field560 = -this.field560;
                    }
                }
            } else {
                if (this.field567 > 0) {
                    if (this.field566) {
                        label120: {
                            if (this.field560 < 0) {
                                if (this.field565 >= var3) {
                                    return;
                                }
                                this.field565 = var3 + var3 - 1 - this.field565;
                                this.field560 = -this.field560;
                                if (--this.field567 == 0) {
                                    break label120;
                                }
                            }
                            do {
                                if (this.field565 < var4) {
                                    return;
                                }
                                this.field565 = var4 + var4 - 1 - this.field565;
                                this.field560 = -this.field560;
                                if (--this.field567 == 0) {
                                    break;
                                }
                                if (this.field565 >= var3) {
                                    return;
                                }
                                this.field565 = var3 + var3 - 1 - this.field565;
                                this.field560 = -this.field560;
                            } while (--this.field567 != 0);
                        }
                    } else if (this.field560 < 0) {
                        if (this.field565 >= var3) {
                            return;
                        }
                        int var7 = (var4 - 1 - this.field565) / var6;
                        if (var7 < this.field567) {
                            this.field565 += var6 * var7;
                            this.field567 -= var7;
                            return;
                        }
                        this.field565 += this.field567 * var6;
                        this.field567 = 0;
                    } else {
                        if (this.field565 < var4) {
                            return;
                        }
                        int var8 = (this.field565 - var3) / var6;
                        if (var8 < this.field567) {
                            this.field565 -= var6 * var8;
                            this.field567 -= var8;
                            return;
                        }
                        this.field565 -= this.field567 * var6;
                        this.field567 = 0;
                    }
                }
                if (this.field560 < 0) {
                    if (this.field565 < 0) {
                        this.field565 = 0;
                        this.method13(69);
                        return;
                    }
                } else if (this.field565 >= var5) {
                    this.field565 = var5 - 1;
                    this.method13(116);
                }
            }
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "([B[IIIIIIILde;)I", line = 234)
    private static final int method200(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class27 arg8) {
        int var9 = arg2 >> 8;
        int var10 = arg7 >> 8;
        int var11 = arg4 << 8;
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
        arg8.field565 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "([B[IIIIIIIIILde;)I", line = 260)
    private static final int method201(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class27 arg10) {
        int var11 = arg2 >> 8;
        int var12 = arg9 >> 8;
        int var13 = arg4 << 8;
        int var14 = arg6 << 8;
        int var15;
        if ((var15 = arg3 + var11 - (var12 - 1)) > arg8) {
            var15 = arg8;
        }
        var15 -= 3;
        int var10001;
        while (arg3 < var15) {
            var10001 = arg3++;
            arg1[var10001] += arg0[var11--] * var13 >> arg5;
            int var16 = var13 + var14;
            int var19 = arg3++;
            arg1[var19] += arg0[var11--] * var16 >> arg5;
            int var17 = var14 + var16;
            int var20 = arg3++;
            arg1[var20] += arg0[var11--] * var17 >> arg5;
            int var18 = var14 + var17;
            int var21 = arg3++;
            arg1[var21] += arg0[var11--] * var18 >> arg5;
            var13 = var14 + var18;
        }
        var15 += 3;
        while (arg3 < var15) {
            var10001 = arg3++;
            arg1[var10001] += arg0[var11--] * var13 >> arg5;
            var13 += var14;
        }
        arg10.field556 = var13 >> 8;
        arg10.field565 = var11 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(II[B[IIIIIIIIIIILde;II)I", line = 293)
    private static final int method202(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, class27 arg14, int arg15, int arg16) {
        int var17;
        if (arg15 == 0 || (var17 = (arg13 - arg4 + arg15 - 257) / arg15 + arg5) > arg12) {
            var17 = arg12;
        }
        int var18 = arg5 << 1;
        int var19 = var17 << 1;
        int var10001;
        while (var18 < var19) {
            int var25 = arg4 >> 8;
            byte var26 = arg2[var25];
            int var27 = (var26 << 8) + (arg4 & 255) * (arg2[var25 + 1] - var26);
            var10001 = var18++;
            arg3[var10001] += arg6 * var27 >> arg8;
            arg6 += arg9;
            int var28 = var18++;
            arg3[var28] += arg7 * var27 >> arg8;
            arg7 += arg10;
            arg4 += arg15;
        }
        int var20;
        if (arg15 == 0 || (var20 = (var18 >> 1) + (arg13 - arg4 + arg15 - 1) / arg15) > arg12) {
            var20 = arg12;
        }
        int var21 = var20 << 1;
        int var22 = arg16;
        while (var18 < var21) {
            byte var23 = arg2[arg4 >> 8];
            int var24 = (var23 << 8) + (arg4 & 255) * (var22 - var23);
            var10001 = var18++;
            arg3[var10001] += arg6 * var24 >> arg8;
            arg6 += arg9;
            var10001 = var18++;
            arg3[var10001] += arg7 * var24 >> arg8;
            arg7 += arg10;
            arg4 += arg15;
        }
        arg14.field556 = arg6;
        arg14.field561 = arg7;
        arg14.field565 = arg4;
        return var18 >> 1;
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "()I", line = 335)
    private final int method203() {
        return this.field561 < 0 ? -this.field556 : (int) ((double) this.field556 * Math.sqrt((double) this.field561 * 0.0078125D) + 0.5D);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(II[B[IIIIIIIILde;II)I", line = 339)
    private static final int method204(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class27 arg11, int arg12, int arg13) {
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
            arg3[var10001] += arg6 * var24;
            int var25 = var15++;
            arg3[var25] += arg7 * var24;
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
            arg3[var10001] += arg6 * var21;
            var10001 = var15++;
            arg3[var10001] += arg7 * var21;
            arg4 += arg12;
        }
        arg11.field565 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(I[B[IIIIIIIIIIILde;)I", line = 373)
    private static final int method205(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class27 arg13) {
        int var14 = arg3 >> 8;
        int var15 = arg12 >> 8;
        int var16 = arg5 << 8;
        int var17 = arg6 << 8;
        int var18 = arg8 << 8;
        int var19 = arg9 << 8;
        int var20;
        if ((var20 = arg4 + var15 - var14) > arg11) {
            var20 = arg11;
        }
        int var21 = arg4 << 1;
        int var22 = var20 << 1;
        int var45 = var22 - 6;
        while (var21 < var45) {
            byte var24 = arg1[var14++];
            int var34 = var21++;
            arg2[var34] += var16 * var24 >> arg7;
            int var25 = var16 + var18;
            int var35 = var21++;
            arg2[var35] += var17 * var24 >> arg7;
            int var26 = var17 + var19;
            byte var27 = arg1[var14++];
            int var37 = var21++;
            arg2[var37] += var25 * var27 >> arg7;
            int var28 = var18 + var25;
            int var38 = var21++;
            arg2[var38] += var26 * var27 >> arg7;
            int var29 = var19 + var26;
            byte var30 = arg1[var14++];
            int var40 = var21++;
            arg2[var40] += var28 * var30 >> arg7;
            int var31 = var18 + var28;
            int var41 = var21++;
            arg2[var41] += var29 * var30 >> arg7;
            int var32 = var19 + var29;
            byte var33 = arg1[var14++];
            int var43 = var21++;
            arg2[var43] += var31 * var33 >> arg7;
            var16 = var18 + var31;
            int var44 = var21++;
            arg2[var44] += var32 * var33 >> arg7;
            var17 = var19 + var32;
        }
        var22 = var45 + 6;
        while (var21 < var22) {
            byte var23 = arg1[var14++];
            int var10001 = var21++;
            arg2[var10001] += var16 * var23 >> arg7;
            var16 += var18;
            int var46 = var21++;
            arg2[var46] += var17 * var23 >> arg7;
            var17 += var19;
        }
        arg13.field556 = var16 >> 8;
        arg13.field561 = var17 >> 8;
        arg13.field565 = var14 << 8;
        return var21 >> 1;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(I[B[IIIIIIIILde;)I", line = 428)
    private static final int method206(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class27 arg10) {
        int var11 = arg3 >> 8;
        int var12 = arg9 >> 8;
        int var13 = arg5 << 8;
        int var14 = arg6 << 8;
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
        arg10.field565 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!de", name = "c", descriptor = "()Z", line = 466)
    private final boolean method207() {
        if (this.field559 != 0 && class45.field1098 != (this.field569 != Integer.MIN_VALUE)) {
            this.field556 = this.field562 == Integer.MIN_VALUE ? 0 : this.field562;
            this.field561 = this.field564;
            this.field559 = 0;
            if (this.field562 == Integer.MIN_VALUE) {
                this.method13(118);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(II)V", line = 482)
    private final synchronized void method208(int arg0, int arg1) {
        this.field556 = arg0;
        this.field561 = arg1;
        this.field559 = 0;
    }

    @OriginalMember(owner = "client!de", name = "f", descriptor = "(I)V", line = 487)
    public final synchronized void method209(int arg0) {
        this.field567 = arg0;
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(II[B[IIIIIIIILde;II)I", line = 490)
    private static final int method210(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class27 arg11, int arg12, int arg13) {
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
            arg3[var10001] += arg6 * var23;
            int var24 = var15++;
            arg3[var24] += arg7 * var23;
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
            arg3[var10001] += arg6 * var20;
            var10001 = var15++;
            arg3[var10001] += arg7 * var20;
            arg4 += arg12;
        }
        arg11.field565 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "([III)I", line = 522)
    public final synchronized int method196(int[] arg0, int arg1, int arg2) {
        if (this.method207()) {
            return 0;
        } else if (this.field556 != 0 || this.field559 != 0 && this.field562 != 0 && this.field562 != Integer.MIN_VALUE) {
            class16 var4 = (class16) super.field554;
            int var5 = this.field558 << 8;
            int var6 = this.field568 << 8;
            int var7 = var4.field340.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field567 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field567 < 0) {
                if (this.field566) {
                    if (this.field560 < 0) {
                        var9 = this.method215(arg0, arg1, var5, var10, var4.field340[this.field558]);
                        if (this.field565 >= var5) {
                            return 1;
                        }
                        this.field565 = var5 + var5 - 1 - this.field565;
                        this.field560 = -this.field560;
                    }
                    while (true) {
                        int var11 = this.method225(arg0, var9, var6, var10, var4.field340[this.field568 - 1]);
                        if (this.field565 < var6) {
                            return 1;
                        }
                        this.field565 = var6 + var6 - 1 - this.field565;
                        this.field560 = -this.field560;
                        var9 = this.method215(arg0, var11, var5, var10, var4.field340[this.field558]);
                        if (this.field565 >= var5) {
                            return 1;
                        }
                        this.field565 = var5 + var5 - 1 - this.field565;
                        this.field560 = -this.field560;
                    }
                } else if (this.field560 < 0) {
                    while (true) {
                        var9 = this.method215(arg0, var9, var5, var10, var4.field340[this.field568 - 1]);
                        if (this.field565 >= var5) {
                            return 1;
                        }
                        this.field565 = var6 - 1 - (var6 - 1 - this.field565) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method225(arg0, var9, var6, var10, var4.field340[this.field558]);
                        if (this.field565 < var6) {
                            return 1;
                        }
                        this.field565 = (this.field565 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field567 > 0) {
                    if (this.field566) {
                        label121: {
                            if (this.field560 < 0) {
                                var9 = this.method215(arg0, arg1, var5, var10, var4.field340[this.field558]);
                                if (this.field565 >= var5) {
                                    return 1;
                                }
                                this.field565 = var5 + var5 - 1 - this.field565;
                                this.field560 = -this.field560;
                                if (--this.field567 == 0) {
                                    break label121;
                                }
                            }
                            do {
                                var9 = this.method225(arg0, var9, var6, var10, var4.field340[this.field568 - 1]);
                                if (this.field565 < var6) {
                                    return 1;
                                }
                                this.field565 = var6 + var6 - 1 - this.field565;
                                this.field560 = -this.field560;
                                if (--this.field567 == 0) {
                                    break;
                                }
                                var9 = this.method215(arg0, var9, var5, var10, var4.field340[this.field558]);
                                if (this.field565 >= var5) {
                                    return 1;
                                }
                                this.field565 = var5 + var5 - 1 - this.field565;
                                this.field560 = -this.field560;
                            } while (--this.field567 != 0);
                        }
                    } else if (this.field560 < 0) {
                        while (true) {
                            var9 = this.method215(arg0, var9, var5, var10, var4.field340[this.field568 - 1]);
                            if (this.field565 >= var5) {
                                return 1;
                            }
                            int var12 = (var6 - 1 - this.field565) / var8;
                            if (var12 >= this.field567) {
                                this.field565 += this.field567 * var8;
                                this.field567 = 0;
                                break;
                            }
                            this.field565 += var8 * var12;
                            this.field567 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method225(arg0, var9, var6, var10, var4.field340[this.field558]);
                            if (this.field565 < var6) {
                                return 1;
                            }
                            int var13 = (this.field565 - var5) / var8;
                            if (var13 >= this.field567) {
                                this.field565 -= this.field567 * var8;
                                this.field567 = 0;
                                break;
                            }
                            this.field565 -= var8 * var13;
                            this.field567 -= var13;
                        }
                    }
                }
                if (this.field560 < 0) {
                    this.method215(arg0, var9, 0, var10, 0);
                    if (this.field565 < 0) {
                        this.field565 = 0;
                        this.method13(90);
                    }
                } else {
                    this.method225(arg0, var9, var7, var10, 0);
                    if (this.field565 >= var7) {
                        this.field565 = var7 - 1;
                        this.method13(105);
                    }
                }
                return 1;
            }
        } else {
            this.method198(arg2);
            return 0;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Lca;II)Lde;", line = 733)
    public static final class27 method211(class16 arg0, int arg1, int arg2) {
        return arg0.field340 != null && arg0.field340.length != 0 ? new class27(arg0, (int) ((long) arg0.field337 * 256L * (long) arg1 / (long) (class4.field55 * 100)), arg2) : null;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(II[B[IIIIIIILde;II)I", line = 739)
    private static final int method212(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class27 arg10, int arg11, int arg12) {
        int var13;
        if (arg11 == 0 || (var13 = (arg9 + 256 - arg4 + arg11) / arg11 + arg5) > arg8) {
            var13 = arg8;
        }
        int var10001;
        while (arg5 < var13) {
            int var17 = arg4 >> 8;
            byte var18 = arg2[var17 - 1];
            var10001 = arg5++;
            arg3[var10001] += ((var18 << 8) + (arg4 & 255) * (arg2[var17] - var18)) * arg6;
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
            arg3[var10001] += ((var15 << 8) + (arg4 & 255) * (arg2[arg4 >> 8] - var15)) * arg6;
            arg4 += var16;
        }
        arg10.field565 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(I[B[IIIIIIIIIIILde;)I", line = 767)
    private static final int method213(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class27 arg13) {
        int var14 = arg3 >> 8;
        int var15 = arg12 >> 8;
        int var16 = arg5 << 8;
        int var17 = arg6 << 8;
        int var18 = arg8 << 8;
        int var19 = arg9 << 8;
        int var20;
        if ((var20 = arg4 + var14 - (var15 - 1)) > arg11) {
            var20 = arg11;
        }
        int var21 = arg4 << 1;
        int var22 = var20 << 1;
        int var45 = var22 - 6;
        while (var21 < var45) {
            byte var24 = arg1[var14--];
            int var34 = var21++;
            arg2[var34] += var16 * var24 >> arg7;
            int var25 = var16 + var18;
            int var35 = var21++;
            arg2[var35] += var17 * var24 >> arg7;
            int var26 = var17 + var19;
            byte var27 = arg1[var14--];
            int var37 = var21++;
            arg2[var37] += var25 * var27 >> arg7;
            int var28 = var18 + var25;
            int var38 = var21++;
            arg2[var38] += var26 * var27 >> arg7;
            int var29 = var19 + var26;
            byte var30 = arg1[var14--];
            int var40 = var21++;
            arg2[var40] += var28 * var30 >> arg7;
            int var31 = var18 + var28;
            int var41 = var21++;
            arg2[var41] += var29 * var30 >> arg7;
            int var32 = var19 + var29;
            byte var33 = arg1[var14--];
            int var43 = var21++;
            arg2[var43] += var31 * var33 >> arg7;
            var16 = var18 + var31;
            int var44 = var21++;
            arg2[var44] += var32 * var33 >> arg7;
            var17 = var19 + var32;
        }
        var22 = var45 + 6;
        while (var21 < var22) {
            byte var23 = arg1[var14--];
            int var10001 = var21++;
            arg2[var10001] += var16 * var23 >> arg7;
            var16 += var18;
            int var46 = var21++;
            arg2[var46] += var17 * var23 >> arg7;
            var17 += var19;
        }
        arg13.field556 = var16 >> 8;
        arg13.field561 = var17 >> 8;
        arg13.field565 = var14 << 8;
        return var21 >> 1;
    }

    @OriginalMember(owner = "client!de", name = "d", descriptor = "()I", line = 821)
    private final synchronized int method214() {
        return this.field559 > 0 ? this.field564 : this.field561;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "([IIIII)I", line = 828)
    private final int method215(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        if (this.field559 > 0) {
            int var6 = this.field559 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field559 += arg1;
            if (this.field560 == -256 && (this.field565 & 255) == 0) {
                if (class45.field1098) {
                    arg1 = method213(0, ((class16) super.field554).field340, arg0, this.field565, arg1, this.field556, this.field561, this.field557, this.field563, this.field569, 0, var6, arg2, this);
                } else {
                    arg1 = method201(((class16) super.field554).field340, arg0, this.field565, arg1, this.field556, this.field557, this.field563, 0, var6, arg2, this);
                }
            } else if (class45.field1098) {
                arg1 = method219(0, 0, ((class16) super.field554).field340, arg0, this.field565, arg1, this.field556, this.field561, this.field557, this.field563, this.field569, 0, var6, arg2, this, this.field560, arg4);
            } else {
                arg1 = method221(0, 0, ((class16) super.field554).field340, arg0, this.field565, arg1, this.field556, this.field557, this.field563, 0, var6, arg2, this, this.field560, arg4);
            }
            this.field559 -= arg1;
            if (this.field559 != 0) {
                return arg1;
            }
            this.field561 = this.field564;
            if (this.field562 == Integer.MIN_VALUE) {
                this.field556 = 0;
                this.method13(75);
                return arg3;
            }
            this.field556 = this.field562;
        }
        if (this.field560 == -256 && (this.field565 & 255) == 0) {
            return class45.field1098 ? method217(0, ((class16) super.field554).field340, arg0, this.field565, arg1, this.method223(), this.method203(), 0, arg3, arg2, this) : method200(((class16) super.field554).field340, arg0, this.field565, arg1, this.field556, 0, arg3, arg2, this);
        } else {
            return class45.field1098 ? method210(0, 0, ((class16) super.field554).field340, arg0, this.field565, arg1, this.method223(), this.method203(), 0, arg3, arg2, this, this.field560, arg4) : method212(0, 0, ((class16) super.field554).field340, arg0, this.field565, arg1, this.field556, 0, arg3, arg2, this, this.field560, arg4);
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(II[B[IIIIIIIIILde;II)I", line = 890)
    private static final int method216(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class27 arg12, int arg13, int arg14) {
        int var15;
        if (arg13 == 0 || (var15 = (arg11 - arg4 + arg13 - 257) / arg13 + arg5) > arg10) {
            var15 = arg10;
        }
        int var10001;
        while (arg5 < var15) {
            int var19 = arg4 >> 8;
            byte var20 = arg2[var19];
            var10001 = arg5++;
            arg3[var10001] += ((var20 << 8) + (arg4 & 255) * (arg2[var19 + 1] - var20)) * arg6 >> arg7;
            arg6 += arg8;
            arg4 += arg13;
        }
        int var16;
        if (arg13 == 0 || (var16 = (arg11 - arg4 + arg13 - 1) / arg13 + arg5) > arg10) {
            var16 = arg10;
        }
        int var17 = arg14;
        while (arg5 < var16) {
            byte var18 = arg2[arg4 >> 8];
            var10001 = arg5++;
            arg3[var10001] += ((var18 << 8) + (arg4 & 255) * (var17 - var18)) * arg6 >> arg7;
            arg6 += arg8;
            arg4 += arg13;
        }
        arg12.field556 = arg6;
        arg12.field565 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(I[B[IIIIIIIILde;)I", line = 920)
    private static final int method217(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class27 arg10) {
        int var11 = arg3 >> 8;
        int var12 = arg9 >> 8;
        int var13 = arg5 << 8;
        int var14 = arg6 << 8;
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
        arg10.field565 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!de", name = "g", descriptor = "(I)V", line = 958)
    public final synchronized void method218(int arg0) {
        this.method208(arg0, this.method214());
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "()I", line = 963)
    public final int method197() {
        int var1 = this.field556 * 3;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field567 == 0) {
            var2 -= this.field565 * var2 / (((class16) super.field554).field340.length << 8);
        } else if (this.field567 >= 0) {
            var2 -= this.field558 * var2 / ((class16) super.field554).field340.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(II[B[IIIIIIIIIIILde;II)I", line = 978)
    private static final int method219(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, class27 arg14, int arg15, int arg16) {
        int var17;
        if (arg15 == 0 || (var17 = (arg13 + 256 - arg4 + arg15) / arg15 + arg5) > arg12) {
            var17 = arg12;
        }
        int var18 = arg5 << 1;
        int var19 = var17 << 1;
        int var10001;
        while (var18 < var19) {
            int var24 = arg4 >> 8;
            byte var25 = arg2[var24 - 1];
            int var26 = (var25 << 8) + (arg4 & 255) * (arg2[var24] - var25);
            var10001 = var18++;
            arg3[var10001] += arg6 * var26 >> arg8;
            arg6 += arg9;
            int var27 = var18++;
            arg3[var27] += arg7 * var26 >> arg8;
            arg7 += arg10;
            arg4 += arg15;
        }
        int var20;
        if (arg15 == 0 || (var20 = (var18 >> 1) + (arg13 - arg4 + arg15) / arg15) > arg12) {
            var20 = arg12;
        }
        int var21 = var20 << 1;
        int var22 = arg16;
        while (var18 < var21) {
            int var23 = (var22 << 8) + (arg4 & 255) * (arg2[arg4 >> 8] - var22);
            var10001 = var18++;
            arg3[var10001] += arg6 * var23 >> arg8;
            arg6 += arg9;
            var10001 = var18++;
            arg3[var10001] += arg7 * var23 >> arg8;
            arg7 += arg10;
            arg4 += arg15;
        }
        arg14.field556 = arg6;
        arg14.field561 = arg7;
        arg14.field565 = arg4;
        return var18 >> 1;
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "([B[IIIIIIILde;)I", line = 1016)
    private static final int method220(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class27 arg8) {
        int var9 = arg2 >> 8;
        int var10 = arg7 >> 8;
        int var11 = arg4 << 8;
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
        arg8.field565 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(II[B[IIIIIIIIILde;II)I", line = 1042)
    private static final int method221(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class27 arg12, int arg13, int arg14) {
        int var15;
        if (arg13 == 0 || (var15 = (arg11 + 256 - arg4 + arg13) / arg13 + arg5) > arg10) {
            var15 = arg10;
        }
        int var10001;
        while (arg5 < var15) {
            int var19 = arg4 >> 8;
            byte var20 = arg2[var19 - 1];
            var10001 = arg5++;
            arg3[var10001] += ((var20 << 8) + (arg4 & 255) * (arg2[var19] - var20)) * arg6 >> arg7;
            arg6 += arg8;
            arg4 += arg13;
        }
        int var16;
        if (arg13 == 0 || (var16 = (arg11 - arg4 + arg13) / arg13 + arg5) > arg10) {
            var16 = arg10;
        }
        int var17 = arg14;
        int var18 = arg13;
        while (arg5 < var16) {
            var10001 = arg5++;
            arg3[var10001] += ((var17 << 8) + (arg4 & 255) * (arg2[arg4 >> 8] - var17)) * arg6 >> arg7;
            arg6 += arg8;
            arg4 += var18;
        }
        arg12.field556 = arg6;
        arg12.field565 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!de", name = "e", descriptor = "()Z", line = 1071)
    public final boolean method222() {
        return this.method10(false);
    }

    @OriginalMember(owner = "client!de", name = "<init>", descriptor = "(Lca;II)V", line = 1074)
    private class27(class16 arg0, int arg1, int arg2) {
        super.field554 = arg0;
        this.field558 = arg0.field336;
        this.field568 = arg0.field338;
        this.field566 = arg0.field339;
        this.field560 = arg1;
        this.field556 = arg2;
        this.field561 = 128;
        this.field565 = 0;
    }

    @OriginalMember(owner = "client!de", name = "f", descriptor = "()I", line = 1088)
    private final int method223() {
        return this.field561 < 0 ? this.field556 : (int) ((double) this.field556 * Math.sqrt((double) (256 - this.field561) * 0.0078125D) + 0.5D);
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(II[B[IIIIIIILde;II)I", line = 1094)
    private static final int method224(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class27 arg10, int arg11, int arg12) {
        int var13;
        if (arg11 == 0 || (var13 = (arg9 - arg4 + arg11 - 257) / arg11 + arg5) > arg8) {
            var13 = arg8;
        }
        int var10001;
        while (arg5 < var13) {
            int var17 = arg4 >> 8;
            byte var18 = arg2[var17];
            var10001 = arg5++;
            arg3[var10001] += ((var18 << 8) + (arg4 & 255) * (arg2[var17 + 1] - var18)) * arg6;
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
            arg3[var10001] += ((var16 << 8) + (arg4 & 255) * (var15 - var16)) * arg6;
            arg4 += arg11;
        }
        arg10.field565 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "([IIIII)I", line = 1122)
    private final int method225(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        if (this.field559 > 0) {
            int var6 = this.field559 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field559 += arg1;
            if (this.field560 == 256 && (this.field565 & 255) == 0) {
                if (class45.field1098) {
                    arg1 = method205(0, ((class16) super.field554).field340, arg0, this.field565, arg1, this.field556, this.field561, this.field557, this.field563, this.field569, 0, var6, arg2, this);
                } else {
                    arg1 = method199(((class16) super.field554).field340, arg0, this.field565, arg1, this.field556, this.field557, this.field563, 0, var6, arg2, this);
                }
            } else if (class45.field1098) {
                arg1 = method202(0, 0, ((class16) super.field554).field340, arg0, this.field565, arg1, this.field556, this.field561, this.field557, this.field563, this.field569, 0, var6, arg2, this, this.field560, arg4);
            } else {
                arg1 = method216(0, 0, ((class16) super.field554).field340, arg0, this.field565, arg1, this.field556, this.field557, this.field563, 0, var6, arg2, this, this.field560, arg4);
            }
            this.field559 -= arg1;
            if (this.field559 != 0) {
                return arg1;
            }
            this.field561 = this.field564;
            if (this.field562 == Integer.MIN_VALUE) {
                this.field556 = 0;
                this.method13(88);
                return arg3;
            }
            this.field556 = this.field562;
        }
        if (this.field560 == 256 && (this.field565 & 255) == 0) {
            return class45.field1098 ? method206(0, ((class16) super.field554).field340, arg0, this.field565, arg1, this.method223(), this.method203(), 0, arg3, arg2, this) : method220(((class16) super.field554).field340, arg0, this.field565, arg1, this.field556, 0, arg3, arg2, this);
        } else {
            return class45.field1098 ? method204(0, 0, ((class16) super.field554).field340, arg0, this.field565, arg1, this.method223(), this.method203(), 0, arg3, arg2, this, this.field560, arg4) : method224(0, 0, ((class16) super.field554).field340, arg0, this.field565, arg1, this.field556, 0, arg3, arg2, this, this.field560, arg4);
        }
    }
}
