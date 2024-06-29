import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class97 extends class3 {

    @OriginalMember(owner = "client!pe", name = "D", descriptor = "I")
    private int field2306;

    @OriginalMember(owner = "client!pe", name = "E", descriptor = "I")
    private int field2307;

    @OriginalMember(owner = "client!pe", name = "B", descriptor = "Z")
    private boolean field2304;

    @OriginalMember(owner = "client!pe", name = "F", descriptor = "I")
    private int field2308;

    @OriginalMember(owner = "client!pe", name = "O", descriptor = "I")
    private int field2317;

    @OriginalMember(owner = "client!pe", name = "N", descriptor = "I")
    private int field2316;

    @OriginalMember(owner = "client!pe", name = "J", descriptor = "I")
    private int field2312;

    @OriginalMember(owner = "client!pe", name = "C", descriptor = "I")
    private int field2305;

    @OriginalMember(owner = "client!pe", name = "G", descriptor = "I")
    private int field2309;

    @OriginalMember(owner = "client!pe", name = "H", descriptor = "I")
    private int field2310;

    @OriginalMember(owner = "client!pe", name = "I", descriptor = "I")
    private int field2311;

    @OriginalMember(owner = "client!pe", name = "K", descriptor = "I")
    private int field2313;

    @OriginalMember(owner = "client!pe", name = "L", descriptor = "I")
    private int field2314;

    @OriginalMember(owner = "client!pe", name = "M", descriptor = "I")
    private int field2315;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I[B[IIIIIIIIIIILpe;)I", line = 3)
    private static final int method803(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class97 arg13) {
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
        arg13.field2317 = var16 >> 8;
        arg13.field2316 = var17 >> 8;
        arg13.field2312 = var14 << 8;
        return var21 >> 1;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(II[B[IIIIIIIIILpe;II)I", line = 55)
    private static final int method804(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class97 arg12, int arg13, int arg14) {
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
        arg12.field2317 = arg6;
        arg12.field2312 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I[B[IIIIIIIILpe;)I", line = 85)
    private static final int method805(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class97 arg10) {
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
        arg10.field2312 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "()I", line = 123)
    private final int method806() {
        return this.field2316 < 0 ? this.field2317 : (int) ((double) this.field2317 * Math.sqrt((double) (256 - this.field2316) * 0.0078125D) + 0.5D);
    }

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "()I", line = 126)
    private final int method807() {
        return this.field2316 < 0 ? -this.field2317 : (int) ((double) this.field2317 * Math.sqrt((double) this.field2316 * 0.0078125D) + 0.5D);
    }

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "(I)V", line = 133)
    public final synchronized void method15(int arg0) {
        if (!this.method828()) {
            if (this.field2311 > 0) {
                if (arg0 >= this.field2311) {
                    if (this.field2305 == Integer.MIN_VALUE) {
                        this.field2317 = 0;
                        this.method498(126);
                        arg0 = this.field2311;
                    } else {
                        this.field2317 = this.field2305;
                    }
                    this.field2316 = this.field2310;
                    this.field2311 = 0;
                } else {
                    this.field2317 += this.field2313 * arg0;
                    if (class126.field3090) {
                        this.field2316 += this.field2309 * arg0;
                    }
                    this.field2311 -= arg0;
                }
            }
            this.field2312 += this.field2308 * arg0;
            class55 var2 = (class55) super.field28;
            int var3 = this.field2306 << 8;
            int var4 = this.field2307 << 8;
            int var5 = var2.field1210.length << 8;
            int var6 = var4 - var3;
            if (var6 <= 0) {
                this.field2315 = 0;
            }
            if (this.field2315 < 0) {
                if (!this.field2304) {
                    if (this.field2308 < 0) {
                        if (this.field2312 < var3) {
                            this.field2312 = var4 - 1 - (var4 - 1 - this.field2312) % var6;
                        }
                    } else if (this.field2312 >= var4) {
                        this.field2312 = (this.field2312 - var3) % var6 + var3;
                    }
                } else {
                    if (this.field2308 < 0) {
                        if (this.field2312 >= var3) {
                            return;
                        }
                        this.field2312 = var3 + var3 - 1 - this.field2312;
                        this.field2308 = -this.field2308;
                    }
                    while (this.field2312 >= var4) {
                        this.field2312 = var4 + var4 - 1 - this.field2312;
                        this.field2308 = -this.field2308;
                        if (this.field2312 >= var3) {
                            return;
                        }
                        this.field2312 = var3 + var3 - 1 - this.field2312;
                        this.field2308 = -this.field2308;
                    }
                }
            } else {
                if (this.field2315 > 0) {
                    if (this.field2304) {
                        label120: {
                            if (this.field2308 < 0) {
                                if (this.field2312 >= var3) {
                                    return;
                                }
                                this.field2312 = var3 + var3 - 1 - this.field2312;
                                this.field2308 = -this.field2308;
                                if (--this.field2315 == 0) {
                                    break label120;
                                }
                            }
                            do {
                                if (this.field2312 < var4) {
                                    return;
                                }
                                this.field2312 = var4 + var4 - 1 - this.field2312;
                                this.field2308 = -this.field2308;
                                if (--this.field2315 == 0) {
                                    break;
                                }
                                if (this.field2312 >= var3) {
                                    return;
                                }
                                this.field2312 = var3 + var3 - 1 - this.field2312;
                                this.field2308 = -this.field2308;
                            } while (--this.field2315 != 0);
                        }
                    } else if (this.field2308 < 0) {
                        if (this.field2312 >= var3) {
                            return;
                        }
                        int var7 = (var4 - 1 - this.field2312) / var6;
                        if (var7 < this.field2315) {
                            this.field2312 += var6 * var7;
                            this.field2315 -= var7;
                            return;
                        }
                        this.field2312 += this.field2315 * var6;
                        this.field2315 = 0;
                    } else {
                        if (this.field2312 < var4) {
                            return;
                        }
                        int var8 = (this.field2312 - var3) / var6;
                        if (var8 < this.field2315) {
                            this.field2312 -= var6 * var8;
                            this.field2315 -= var8;
                            return;
                        }
                        this.field2312 -= this.field2315 * var6;
                        this.field2315 = 0;
                    }
                }
                if (this.field2308 < 0) {
                    if (this.field2312 < 0) {
                        this.field2312 = 0;
                        this.method498(111);
                        return;
                    }
                } else if (this.field2312 >= var5) {
                    this.field2312 = var5 - 1;
                    this.method498(110);
                }
            }
        }
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(I[B[IIIIIIIIIIILpe;)I", line = 329)
    private static final int method808(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class97 arg13) {
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
        arg13.field2317 = var16 >> 8;
        arg13.field2316 = var17 >> 8;
        arg13.field2312 = var14 << 8;
        return var21 >> 1;
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(II[B[IIIIIIIIILpe;II)I", line = 383)
    private static final int method809(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class97 arg12, int arg13, int arg14) {
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
        arg12.field2317 = arg6;
        arg12.field2312 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(II)V", line = 413)
    private final synchronized void method810(int arg0, int arg1) {
        this.field2317 = arg0;
        this.field2316 = arg1;
        this.field2311 = 0;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "([B[IIIIIIILpe;)I", line = 421)
    private static final int method811(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class97 arg8) {
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
        arg8.field2312 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "([IIIII)I", line = 446)
    private final int method812(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        if (this.field2311 > 0) {
            int var6 = this.field2311 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field2311 += arg1;
            if (this.field2308 == -256 && (this.field2312 & 255) == 0) {
                if (class126.field3090) {
                    arg1 = method808(0, ((class55) super.field28).field1210, arg0, this.field2312, arg1, this.field2317, this.field2316, this.field2314, this.field2313, this.field2309, 0, var6, arg2, this);
                } else {
                    arg1 = method819(((class55) super.field28).field1210, arg0, this.field2312, arg1, this.field2317, this.field2314, this.field2313, 0, var6, arg2, this);
                }
            } else if (class126.field3090) {
                arg1 = method813(0, 0, ((class55) super.field28).field1210, arg0, this.field2312, arg1, this.field2317, this.field2316, this.field2314, this.field2313, this.field2309, 0, var6, arg2, this, this.field2308, arg4);
            } else {
                arg1 = method804(0, 0, ((class55) super.field28).field1210, arg0, this.field2312, arg1, this.field2317, this.field2314, this.field2313, 0, var6, arg2, this, this.field2308, arg4);
            }
            this.field2311 -= arg1;
            if (this.field2311 != 0) {
                return arg1;
            }
            this.field2316 = this.field2310;
            if (this.field2305 == Integer.MIN_VALUE) {
                this.field2317 = 0;
                this.method498(109);
                return arg3;
            }
            this.field2317 = this.field2305;
        }
        if (this.field2308 == -256 && (this.field2312 & 255) == 0) {
            return class126.field3090 ? method805(0, ((class55) super.field28).field1210, arg0, this.field2312, arg1, this.method806(), this.method807(), 0, arg3, arg2, this) : method811(((class55) super.field28).field1210, arg0, this.field2312, arg1, this.field2317, 0, arg3, arg2, this);
        } else {
            return class126.field3090 ? method827(0, 0, ((class55) super.field28).field1210, arg0, this.field2312, arg1, this.method806(), this.method807(), 0, arg3, arg2, this, this.field2308, arg4) : method826(0, 0, ((class55) super.field28).field1210, arg0, this.field2312, arg1, this.field2317, 0, arg3, arg2, this, this.field2308, arg4);
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "()I", line = 511)
    public final int method14() {
        int var1 = this.field2317 * 3;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field2315 == 0) {
            var2 -= this.field2312 * var2 / (((class55) super.field28).field1210.length << 8);
        } else if (this.field2315 >= 0) {
            var2 -= this.field2306 * var2 / ((class55) super.field28).field1210.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(II[B[IIIIIIIIIIILpe;II)I", line = 525)
    private static final int method813(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, class97 arg14, int arg15, int arg16) {
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
        arg14.field2317 = arg6;
        arg14.field2316 = arg7;
        arg14.field2312 = arg4;
        return var18 >> 1;
    }

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "()Z", line = 564)
    public final boolean method814() {
        return this.method499(119);
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "([IIIII)I", line = 567)
    private final int method815(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        if (this.field2311 > 0) {
            int var6 = this.field2311 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field2311 += arg1;
            if (this.field2308 == 256 && (this.field2312 & 255) == 0) {
                if (class126.field3090) {
                    arg1 = method803(0, ((class55) super.field28).field1210, arg0, this.field2312, arg1, this.field2317, this.field2316, this.field2314, this.field2313, this.field2309, 0, var6, arg2, this);
                } else {
                    arg1 = method818(((class55) super.field28).field1210, arg0, this.field2312, arg1, this.field2317, this.field2314, this.field2313, 0, var6, arg2, this);
                }
            } else if (class126.field3090) {
                arg1 = method829(0, 0, ((class55) super.field28).field1210, arg0, this.field2312, arg1, this.field2317, this.field2316, this.field2314, this.field2313, this.field2309, 0, var6, arg2, this, this.field2308, arg4);
            } else {
                arg1 = method809(0, 0, ((class55) super.field28).field1210, arg0, this.field2312, arg1, this.field2317, this.field2314, this.field2313, 0, var6, arg2, this, this.field2308, arg4);
            }
            this.field2311 -= arg1;
            if (this.field2311 != 0) {
                return arg1;
            }
            this.field2316 = this.field2310;
            if (this.field2305 == Integer.MIN_VALUE) {
                this.field2317 = 0;
                this.method498(113);
                return arg3;
            }
            this.field2317 = this.field2305;
        }
        if (this.field2308 == 256 && (this.field2312 & 255) == 0) {
            return class126.field3090 ? method817(0, ((class55) super.field28).field1210, arg0, this.field2312, arg1, this.method806(), this.method807(), 0, arg3, arg2, this) : method822(((class55) super.field28).field1210, arg0, this.field2312, arg1, this.field2317, 0, arg3, arg2, this);
        } else {
            return class126.field3090 ? method816(0, 0, ((class55) super.field28).field1210, arg0, this.field2312, arg1, this.method806(), this.method807(), 0, arg3, arg2, this, this.field2308, arg4) : method823(0, 0, ((class55) super.field28).field1210, arg0, this.field2312, arg1, this.field2317, 0, arg3, arg2, this, this.field2308, arg4);
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(II[B[IIIIIIIILpe;II)I", line = 628)
    private static final int method816(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class97 arg11, int arg12, int arg13) {
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
        arg11.field2312 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(I[B[IIIIIIIILpe;)I", line = 662)
    private static final int method817(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class97 arg10) {
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
        arg10.field2312 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "([B[IIIIIIIIILpe;)I", line = 700)
    private static final int method818(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class97 arg10) {
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
        arg10.field2317 = var13 >> 8;
        arg10.field2312 = var11 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "([B[IIIIIIIIILpe;)I", line = 732)
    private static final int method819(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class97 arg10) {
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
        arg10.field2317 = var13 >> 8;
        arg10.field2312 = var11 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "(I)V", line = 764)
    public final synchronized void method820(int arg0) {
        this.method810(arg0, this.method824());
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lie;II)Lpe;", line = 770)
    public static final class97 method821(class55 arg0, int arg1, int arg2) {
        return arg0.field1210 != null && arg0.field1210.length != 0 ? new class97(arg0, (int) ((long) arg0.field1207 * 256L * (long) arg1 / (long) (class24.field603 * 100)), arg2) : null;
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "([B[IIIIIIILpe;)I", line = 776)
    private static final int method822(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class97 arg8) {
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
        arg8.field2312 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(II[B[IIIIIIILpe;II)I", line = 801)
    private static final int method823(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class97 arg10, int arg11, int arg12) {
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
        arg10.field2312 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "([III)I", line = 828)
    public final synchronized int method13(int[] arg0, int arg1, int arg2) {
        if (this.method828()) {
            return 0;
        } else if (this.field2317 != 0 || this.field2311 != 0 && this.field2305 != 0 && this.field2305 != Integer.MIN_VALUE) {
            class55 var4 = (class55) super.field28;
            int var5 = this.field2306 << 8;
            int var6 = this.field2307 << 8;
            int var7 = var4.field1210.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field2315 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field2315 < 0) {
                if (this.field2304) {
                    if (this.field2308 < 0) {
                        var9 = this.method812(arg0, arg1, var5, var10, var4.field1210[this.field2306]);
                        if (this.field2312 >= var5) {
                            return 1;
                        }
                        this.field2312 = var5 + var5 - 1 - this.field2312;
                        this.field2308 = -this.field2308;
                    }
                    while (true) {
                        int var11 = this.method815(arg0, var9, var6, var10, var4.field1210[this.field2307 - 1]);
                        if (this.field2312 < var6) {
                            return 1;
                        }
                        this.field2312 = var6 + var6 - 1 - this.field2312;
                        this.field2308 = -this.field2308;
                        var9 = this.method812(arg0, var11, var5, var10, var4.field1210[this.field2306]);
                        if (this.field2312 >= var5) {
                            return 1;
                        }
                        this.field2312 = var5 + var5 - 1 - this.field2312;
                        this.field2308 = -this.field2308;
                    }
                } else if (this.field2308 < 0) {
                    while (true) {
                        var9 = this.method812(arg0, var9, var5, var10, var4.field1210[this.field2307 - 1]);
                        if (this.field2312 >= var5) {
                            return 1;
                        }
                        this.field2312 = var6 - 1 - (var6 - 1 - this.field2312) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method815(arg0, var9, var6, var10, var4.field1210[this.field2306]);
                        if (this.field2312 < var6) {
                            return 1;
                        }
                        this.field2312 = (this.field2312 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field2315 > 0) {
                    if (this.field2304) {
                        label121: {
                            if (this.field2308 < 0) {
                                var9 = this.method812(arg0, arg1, var5, var10, var4.field1210[this.field2306]);
                                if (this.field2312 >= var5) {
                                    return 1;
                                }
                                this.field2312 = var5 + var5 - 1 - this.field2312;
                                this.field2308 = -this.field2308;
                                if (--this.field2315 == 0) {
                                    break label121;
                                }
                            }
                            do {
                                var9 = this.method815(arg0, var9, var6, var10, var4.field1210[this.field2307 - 1]);
                                if (this.field2312 < var6) {
                                    return 1;
                                }
                                this.field2312 = var6 + var6 - 1 - this.field2312;
                                this.field2308 = -this.field2308;
                                if (--this.field2315 == 0) {
                                    break;
                                }
                                var9 = this.method812(arg0, var9, var5, var10, var4.field1210[this.field2306]);
                                if (this.field2312 >= var5) {
                                    return 1;
                                }
                                this.field2312 = var5 + var5 - 1 - this.field2312;
                                this.field2308 = -this.field2308;
                            } while (--this.field2315 != 0);
                        }
                    } else if (this.field2308 < 0) {
                        while (true) {
                            var9 = this.method812(arg0, var9, var5, var10, var4.field1210[this.field2307 - 1]);
                            if (this.field2312 >= var5) {
                                return 1;
                            }
                            int var12 = (var6 - 1 - this.field2312) / var8;
                            if (var12 >= this.field2315) {
                                this.field2312 += this.field2315 * var8;
                                this.field2315 = 0;
                                break;
                            }
                            this.field2312 += var8 * var12;
                            this.field2315 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method815(arg0, var9, var6, var10, var4.field1210[this.field2306]);
                            if (this.field2312 < var6) {
                                return 1;
                            }
                            int var13 = (this.field2312 - var5) / var8;
                            if (var13 >= this.field2315) {
                                this.field2312 -= this.field2315 * var8;
                                this.field2315 = 0;
                                break;
                            }
                            this.field2312 -= var8 * var13;
                            this.field2315 -= var13;
                        }
                    }
                }
                if (this.field2308 < 0) {
                    this.method812(arg0, var9, 0, var10, 0);
                    if (this.field2312 < 0) {
                        this.field2312 = 0;
                        this.method498(108);
                    }
                } else {
                    this.method815(arg0, var9, var7, var10, 0);
                    if (this.field2312 >= var7) {
                        this.field2312 = var7 - 1;
                        this.method498(127);
                    }
                }
                return 1;
            }
        } else {
            this.method15(arg2);
            return 0;
        }
    }

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "()I", line = 1041)
    private final synchronized int method824() {
        return this.field2311 > 0 ? this.field2310 : this.field2316;
    }

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "(I)V", line = 1048)
    public final synchronized void method825(int arg0) {
        this.field2315 = arg0;
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(II[B[IIIIIIILpe;II)I", line = 1051)
    private static final int method826(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class97 arg10, int arg11, int arg12) {
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
        arg10.field2312 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(II[B[IIIIIIIILpe;II)I", line = 1079)
    private static final int method827(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class97 arg11, int arg12, int arg13) {
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
        arg11.field2312 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "()Z", line = 1115)
    private final boolean method828() {
        if (this.field2311 != 0 && class126.field3090 != (this.field2309 != Integer.MIN_VALUE)) {
            this.field2317 = this.field2305 == Integer.MIN_VALUE ? 0 : this.field2305;
            this.field2316 = this.field2310;
            this.field2311 = 0;
            if (this.field2305 == Integer.MIN_VALUE) {
                this.method498(120);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(II[B[IIIIIIIIIIILpe;II)I", line = 1134)
    private static final int method829(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, class97 arg14, int arg15, int arg16) {
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
        arg14.field2317 = arg6;
        arg14.field2316 = arg7;
        arg14.field2312 = arg4;
        return var18 >> 1;
    }

    @OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(Lie;II)V", line = 1172)
    private class97(class55 arg0, int arg1, int arg2) {
        super.field28 = arg0;
        this.field2306 = arg0.field1209;
        this.field2307 = arg0.field1208;
        this.field2304 = arg0.field1211;
        this.field2308 = arg1;
        this.field2317 = arg2;
        this.field2316 = 128;
        this.field2312 = 0;
    }
}
