import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ct")
public class class154 extends class98 {

    @OriginalMember(owner = "client!ct", name = "x", descriptor = "I")
    private int field2289;

    @OriginalMember(owner = "client!ct", name = "A", descriptor = "I")
    private int field2292;

    @OriginalMember(owner = "client!ct", name = "v", descriptor = "Z")
    private boolean field2287;

    @OriginalMember(owner = "client!ct", name = "y", descriptor = "I")
    private int field2290;

    @OriginalMember(owner = "client!ct", name = "u", descriptor = "I")
    private int field2286;

    @OriginalMember(owner = "client!ct", name = "p", descriptor = "I")
    private int field2281;

    @OriginalMember(owner = "client!ct", name = "r", descriptor = "I")
    private int field2283;

    @OriginalMember(owner = "client!ct", name = "m", descriptor = "I")
    private int field2278;

    @OriginalMember(owner = "client!ct", name = "n", descriptor = "I")
    private int field2279;

    @OriginalMember(owner = "client!ct", name = "o", descriptor = "I")
    private int field2280;

    @OriginalMember(owner = "client!ct", name = "q", descriptor = "I")
    private int field2282;

    @OriginalMember(owner = "client!ct", name = "s", descriptor = "I")
    private int field2284;

    @OriginalMember(owner = "client!ct", name = "t", descriptor = "I")
    private int field2285;

    @OriginalMember(owner = "client!ct", name = "w", descriptor = "I")
    private int field2288;

    @OriginalMember(owner = "client!ct", name = "z", descriptor = "I")
    private int field2291;

    @OriginalMember(owner = "client!ct", name = "e", descriptor = "()I", line = 6)
    public final synchronized int method1181() {
        return this.field2281 < 0 ? -1 : this.field2281;
    }

    @OriginalMember(owner = "client!ct", name = "b", descriptor = "(I)V", line = 9)
    public final synchronized void method1182(int arg0) {
        if (arg0 == 0) {
            this.method1192(0);
            this.method3117((byte) -102);
        } else if (this.field2278 == 0 && this.field2285 == 0) {
            this.field2284 = 0;
            this.field2286 = 0;
            this.field2282 = 0;
            this.method3117((byte) -110);
        } else {
            int var2 = -this.field2282;
            if (this.field2282 > var2) {
                var2 = this.field2282;
            }
            if (-this.field2278 > var2) {
                var2 = -this.field2278;
            }
            if (this.field2278 > var2) {
                var2 = this.field2278;
            }
            if (-this.field2285 > var2) {
                var2 = -this.field2285;
            }
            if (this.field2285 > var2) {
                var2 = this.field2285;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field2284 = arg0;
            this.field2286 = Integer.MIN_VALUE;
            this.field2288 = -this.field2282 / arg0;
            this.field2280 = -this.field2278 / arg0;
            this.field2291 = -this.field2285 / arg0;
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(II)V", line = 55)
    public final synchronized void method1183(int arg0, int arg1) {
        this.method1208(arg0, arg1, this.method1181());
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "([IIIII)I", line = 58)
    private final int method1184(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field2284 <= 0) {
                if (this.field2290 == -256 && (this.field2283 & 255) == 0) {
                    if (class488.field6909) {
                        return method1195(0, ((class383) super.field1254).field5470, arg0, this.field2283, arg1, this.field2278, this.field2285, 0, arg3, arg2, this);
                    }
                    return method1216(((class383) super.field1254).field5470, arg0, this.field2283, arg1, this.field2282, 0, arg3, arg2, this);
                }
                if (class488.field6909) {
                    return method1207(0, 0, ((class383) super.field1254).field5470, arg0, this.field2283, arg1, this.field2278, this.field2285, 0, arg3, arg2, this, this.field2290, arg4);
                }
                return method1214(0, 0, ((class383) super.field1254).field5470, arg0, this.field2283, arg1, this.field2282, 0, arg3, arg2, this, this.field2290, arg4);
            }
            int var6 = this.field2284 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field2284 += arg1;
            if (this.field2290 == -256 && (this.field2283 & 255) == 0) {
                if (class488.field6909) {
                    arg1 = method1212(0, ((class383) super.field1254).field5470, arg0, this.field2283, arg1, this.field2278, this.field2285, this.field2280, this.field2291, 0, var6, arg2, this);
                } else {
                    arg1 = method1220(((class383) super.field1254).field5470, arg0, this.field2283, arg1, this.field2282, this.field2288, 0, var6, arg2, this);
                }
            } else if (class488.field6909) {
                arg1 = method1196(0, 0, ((class383) super.field1254).field5470, arg0, this.field2283, arg1, this.field2278, this.field2285, this.field2280, this.field2291, 0, var6, arg2, this, this.field2290, arg4);
            } else {
                arg1 = method1211(0, 0, ((class383) super.field1254).field5470, arg0, this.field2283, arg1, this.field2282, this.field2288, 0, var6, arg2, this, this.field2290, arg4);
            }
            this.field2284 -= arg1;
            if (this.field2284 != 0) {
                return arg1;
            }
        } while (!this.method1219());
        return arg3;
    }

    @OriginalMember(owner = "client!ct", name = "f", descriptor = "()Z", line = 113)
    public final boolean method1185() {
        return this.field2283 < 0 || this.field2283 >= ((class383) super.field1254).field5470.length << 8;
    }

    @OriginalMember(owner = "client!ct", name = "g", descriptor = "()V", line = 116)
    private final void method1186() {
        this.field2282 = this.field2286;
        this.field2278 = method1187(this.field2286, this.field2281);
        this.field2285 = method1198(this.field2286, this.field2281);
    }

    @OriginalMember(owner = "client!ct", name = "b", descriptor = "(II)I", line = 121)
    private static final int method1187(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!ct", name = "c", descriptor = "(I)V", line = 126)
    public final synchronized void method1188(int arg0) {
        this.method1204(arg0 << 6, this.method1181());
    }

    @OriginalMember(owner = "client!ct", name = "h", descriptor = "()I", line = 129)
    public final synchronized int method1189() {
        return this.field2290 < 0 ? -this.field2290 : this.field2290;
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(I[B[IIIIIIIIIILct;)I", line = 134)
    private static final int method1190(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class154 arg12) {
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
        arg12.field2282 += (var19 - arg4) * arg12.field2288;
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
        arg12.field2278 = var15 >> 2;
        arg12.field2285 = var16 >> 2;
        arg12.field2283 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(Lbc;III)Lct;", line = 190)
    public static final class154 method1191(class383 arg0, int arg1, int arg2, int arg3) {
        return arg0.field5470 != null && arg0.field5470.length != 0 ? new class154(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!ct", name = "g", descriptor = "(I)V", line = 200)
    private final synchronized void method1192(int arg0) {
        this.method1204(arg0, this.method1181());
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(II[B[IIIIIIIILct;II)I", line = 204)
    private static final int method1193(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class154 arg11, int arg12, int arg13) {
        arg11.field2278 -= arg11.field2280 * arg5;
        arg11.field2285 -= arg11.field2291 * arg5;
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
        arg11.field2278 += arg11.field2280 * arg5;
        arg11.field2285 += arg11.field2291 * arg5;
        arg11.field2282 = arg6;
        arg11.field2283 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "([B[IIIIIIIILct;)I", line = 237)
    private static final int method1194(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class154 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field2278 += (var14 - arg3) * arg9.field2280;
        arg9.field2285 += (var14 - arg3) * arg9.field2291;
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
        arg9.field2282 = var12 >> 2;
        arg9.field2283 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(I)V", line = 272)
    public final synchronized void method686(int arg0) {
        if (this.field2284 > 0) {
            if (arg0 >= this.field2284) {
                if (this.field2286 == Integer.MIN_VALUE) {
                    this.field2286 = 0;
                    this.field2282 = this.field2278 = this.field2285 = 0;
                    this.method3117((byte) 124);
                    arg0 = this.field2284;
                }
                this.field2284 = 0;
                this.method1186();
            } else {
                this.field2282 += this.field2288 * arg0;
                this.field2278 += this.field2280 * arg0;
                this.field2285 += this.field2291 * arg0;
                this.field2284 -= arg0;
            }
        }
        class383 var2 = (class383) super.field1254;
        int var3 = this.field2289 << 8;
        int var4 = this.field2292 << 8;
        int var5 = var2.field5470.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field2279 = 0;
        }
        if (this.field2283 < 0) {
            if (this.field2290 <= 0) {
                this.method1200();
                this.method3117((byte) -108);
                return;
            }
            this.field2283 = 0;
        }
        if (this.field2283 >= var5) {
            if (this.field2290 >= 0) {
                this.method1200();
                this.method3117((byte) 95);
                return;
            }
            this.field2283 = var5 - 1;
        }
        this.field2283 += this.field2290 * arg0;
        if (this.field2279 < 0) {
            if (!this.field2287) {
                if (this.field2290 < 0) {
                    if (this.field2283 < var3) {
                        this.field2283 = var4 - 1 - (var4 - 1 - this.field2283) % var6;
                    }
                } else if (this.field2283 >= var4) {
                    this.field2283 = (this.field2283 - var3) % var6 + var3;
                }
            } else {
                if (this.field2290 < 0) {
                    if (this.field2283 >= var3) {
                        return;
                    }
                    this.field2283 = var3 + var3 - 1 - this.field2283;
                    this.field2290 = -this.field2290;
                }
                while (this.field2283 >= var4) {
                    this.field2283 = var4 + var4 - 1 - this.field2283;
                    this.field2290 = -this.field2290;
                    if (this.field2283 >= var3) {
                        return;
                    }
                    this.field2283 = var3 + var3 - 1 - this.field2283;
                    this.field2290 = -this.field2290;
                }
            }
        } else {
            if (this.field2279 > 0) {
                if (this.field2287) {
                    label125: {
                        if (this.field2290 < 0) {
                            if (this.field2283 >= var3) {
                                return;
                            }
                            this.field2283 = var3 + var3 - 1 - this.field2283;
                            this.field2290 = -this.field2290;
                            if (--this.field2279 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field2283 < var4) {
                                return;
                            }
                            this.field2283 = var4 + var4 - 1 - this.field2283;
                            this.field2290 = -this.field2290;
                            if (--this.field2279 == 0) {
                                break;
                            }
                            if (this.field2283 >= var3) {
                                return;
                            }
                            this.field2283 = var3 + var3 - 1 - this.field2283;
                            this.field2290 = -this.field2290;
                        } while (--this.field2279 != 0);
                    }
                } else if (this.field2290 < 0) {
                    if (this.field2283 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field2283) / var6;
                    if (var7 < this.field2279) {
                        this.field2283 += var6 * var7;
                        this.field2279 -= var7;
                        return;
                    }
                    this.field2283 += this.field2279 * var6;
                    this.field2279 = 0;
                } else {
                    if (this.field2283 < var4) {
                        return;
                    }
                    int var8 = (this.field2283 - var3) / var6;
                    if (var8 < this.field2279) {
                        this.field2283 -= var6 * var8;
                        this.field2279 -= var8;
                        return;
                    }
                    this.field2283 -= this.field2279 * var6;
                    this.field2279 = 0;
                }
            }
            if (this.field2290 < 0) {
                if (this.field2283 < 0) {
                    this.field2283 = -1;
                    this.method1200();
                    this.method3117((byte) 37);
                    return;
                }
            } else if (this.field2283 >= var5) {
                this.field2283 = var5;
                this.method1200();
                this.method3117((byte) 10);
            }
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(I[B[IIIIIIIILct;)I", line = 491)
    private static final int method1195(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class154 arg10) {
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
        arg10.field2283 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(II[B[IIIIIIIIIILct;II)I", line = 529)
    private static final int method1196(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class154 arg13, int arg14, int arg15) {
        arg13.field2282 -= arg13.field2288 * arg5;
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
        arg13.field2282 += arg13.field2288 * var22;
        arg13.field2278 = arg6;
        arg13.field2285 = arg7;
        arg13.field2283 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!ct", name = "i", descriptor = "()I", line = 570)
    public final synchronized int method1197() {
        return this.field2286 == Integer.MIN_VALUE ? 0 : this.field2286;
    }

    @OriginalMember(owner = "client!ct", name = "c", descriptor = "(II)I", line = 574)
    private static final int method1198(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(Z)V", line = 577)
    public final synchronized void method1199(boolean arg0) {
        this.field2290 = (this.field2290 >>> 31) + (this.field2290 ^ this.field2290 >> 31);
        if (arg0) {
            this.field2290 = -this.field2290;
        }
    }

    @OriginalMember(owner = "client!ct", name = "j", descriptor = "()V", line = 583)
    private final void method1200() {
        if (this.field2284 != 0) {
            if (this.field2286 == Integer.MIN_VALUE) {
                this.field2286 = 0;
            }
            this.field2284 = 0;
            this.method1186();
        }
    }

    @OriginalMember(owner = "client!ct", name = "b", descriptor = "(II[B[IIIIIIIILct;II)I", line = 594)
    private static final int method1201(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class154 arg11, int arg12, int arg13) {
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
        arg11.field2283 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!ct", name = "h", descriptor = "(I)V", line = 629)
    public final synchronized void method1202(int arg0) {
        int var2 = ((class383) super.field1254).field5470.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field2283 = arg0;
    }

    @OriginalMember(owner = "client!ct", name = "i", descriptor = "(I)V", line = 640)
    public final synchronized void method1203(int arg0) {
        this.field2279 = arg0;
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "([III)V", line = 643)
    public final synchronized void method689(int[] arg0, int arg1, int arg2) {
        if (this.field2286 == 0 && this.field2284 == 0) {
            this.method686(arg2);
        } else {
            class383 var4 = (class383) super.field1254;
            int var5 = this.field2289 << 8;
            int var6 = this.field2292 << 8;
            int var7 = var4.field5470.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field2279 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field2283 < 0) {
                if (this.field2290 <= 0) {
                    this.method1200();
                    this.method3117((byte) 111);
                    return;
                }
                this.field2283 = 0;
            }
            if (this.field2283 >= var7) {
                if (this.field2290 >= 0) {
                    this.method1200();
                    this.method3117((byte) 20);
                    return;
                }
                this.field2283 = var7 - 1;
            }
            if (this.field2279 < 0) {
                if (this.field2287) {
                    if (this.field2290 < 0) {
                        var9 = this.method1184(arg0, arg1, var5, var10, var4.field5470[this.field2289]);
                        if (this.field2283 >= var5) {
                            return;
                        }
                        this.field2283 = var5 + var5 - 1 - this.field2283;
                        this.field2290 = -this.field2290;
                    }
                    while (true) {
                        int var11 = this.method1215(arg0, var9, var6, var10, var4.field5470[this.field2292 - 1]);
                        if (this.field2283 < var6) {
                            return;
                        }
                        this.field2283 = var6 + var6 - 1 - this.field2283;
                        this.field2290 = -this.field2290;
                        var9 = this.method1184(arg0, var11, var5, var10, var4.field5470[this.field2289]);
                        if (this.field2283 >= var5) {
                            return;
                        }
                        this.field2283 = var5 + var5 - 1 - this.field2283;
                        this.field2290 = -this.field2290;
                    }
                } else if (this.field2290 < 0) {
                    while (true) {
                        var9 = this.method1184(arg0, var9, var5, var10, var4.field5470[this.field2292 - 1]);
                        if (this.field2283 >= var5) {
                            return;
                        }
                        this.field2283 = var6 - 1 - (var6 - 1 - this.field2283) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method1215(arg0, var9, var6, var10, var4.field5470[this.field2289]);
                        if (this.field2283 < var6) {
                            return;
                        }
                        this.field2283 = (this.field2283 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field2279 > 0) {
                    if (this.field2287) {
                        label130: {
                            if (this.field2290 < 0) {
                                var9 = this.method1184(arg0, arg1, var5, var10, var4.field5470[this.field2289]);
                                if (this.field2283 >= var5) {
                                    return;
                                }
                                this.field2283 = var5 + var5 - 1 - this.field2283;
                                this.field2290 = -this.field2290;
                                if (--this.field2279 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method1215(arg0, var9, var6, var10, var4.field5470[this.field2292 - 1]);
                                if (this.field2283 < var6) {
                                    return;
                                }
                                this.field2283 = var6 + var6 - 1 - this.field2283;
                                this.field2290 = -this.field2290;
                                if (--this.field2279 == 0) {
                                    break;
                                }
                                var9 = this.method1184(arg0, var9, var5, var10, var4.field5470[this.field2289]);
                                if (this.field2283 >= var5) {
                                    return;
                                }
                                this.field2283 = var5 + var5 - 1 - this.field2283;
                                this.field2290 = -this.field2290;
                            } while (--this.field2279 != 0);
                        }
                    } else if (this.field2290 < 0) {
                        while (true) {
                            var9 = this.method1184(arg0, var9, var5, var10, var4.field5470[this.field2292 - 1]);
                            if (this.field2283 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field2283) / var8;
                            if (var12 >= this.field2279) {
                                this.field2283 += this.field2279 * var8;
                                this.field2279 = 0;
                                break;
                            }
                            this.field2283 += var8 * var12;
                            this.field2279 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method1215(arg0, var9, var6, var10, var4.field5470[this.field2289]);
                            if (this.field2283 < var6) {
                                return;
                            }
                            int var13 = (this.field2283 - var5) / var8;
                            if (var13 >= this.field2279) {
                                this.field2283 -= this.field2279 * var8;
                                this.field2279 = 0;
                                break;
                            }
                            this.field2283 -= var8 * var13;
                            this.field2279 -= var13;
                        }
                    }
                }
                if (this.field2290 < 0) {
                    this.method1184(arg0, var9, 0, var10, 0);
                    if (this.field2283 < 0) {
                        this.field2283 = -1;
                        this.method1200();
                        this.method3117((byte) -3);
                        return;
                    }
                } else {
                    this.method1215(arg0, var9, var7, var10, 0);
                    if (this.field2283 >= var7) {
                        this.field2283 = var7;
                        this.method1200();
                        this.method3117((byte) 3);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ct", name = "d", descriptor = "(II)V", line = 878)
    private final synchronized void method1204(int arg0, int arg1) {
        this.field2286 = arg0;
        this.field2281 = arg1;
        this.field2284 = 0;
        this.method1186();
    }

    @OriginalMember(owner = "client!ct", name = "b", descriptor = "(I[B[IIIIIIIILct;)I", line = 885)
    private static final int method1205(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class154 arg10) {
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
        arg10.field2283 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!ct", name = "j", descriptor = "(I)V", line = 923)
    public final synchronized void method1206(int arg0) {
        this.method1204(this.method1197(), arg0);
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "()Leha;", line = 927)
    public final class98 method687() {
        return null;
    }

    @OriginalMember(owner = "client!ct", name = "c", descriptor = "(II[B[IIIIIIIILct;II)I", line = 931)
    private static final int method1207(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class154 arg11, int arg12, int arg13) {
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
        arg11.field2283 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(III)V", line = 963)
    public final synchronized void method1208(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1204(arg1, arg2);
        } else {
            int var4 = method1187(arg1, arg2);
            int var5 = method1198(arg1, arg2);
            if (this.field2278 == var4 && this.field2285 == var5) {
                this.field2284 = 0;
            } else {
                int var6 = arg1 - this.field2282;
                if (this.field2282 - arg1 > var6) {
                    var6 = this.field2282 - arg1;
                }
                if (var4 - this.field2278 > var6) {
                    var6 = var4 - this.field2278;
                }
                if (this.field2278 - var4 > var6) {
                    var6 = this.field2278 - var4;
                }
                if (var5 - this.field2285 > var6) {
                    var6 = var5 - this.field2285;
                }
                if (this.field2285 - var5 > var6) {
                    var6 = this.field2285 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field2284 = arg0;
                this.field2286 = arg1;
                this.field2281 = arg2;
                this.field2288 = (arg1 - this.field2282) / arg0;
                this.field2280 = (var4 - this.field2278) / arg0;
                this.field2291 = (var5 - this.field2285) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(II[B[IIIIIIILct;II)I", line = 1011)
    private static final int method1209(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class154 arg10, int arg11, int arg12) {
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
        arg10.field2283 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ct", name = "b", descriptor = "()Leha;", line = 1037)
    public final class98 method688() {
        return null;
    }

    @OriginalMember(owner = "client!ct", name = "c", descriptor = "()I", line = 1041)
    public final int method690() {
        int var1 = this.field2282 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field2279 == 0) {
            var2 -= this.field2283 * var2 / (((class383) super.field1254).field5470.length << 8);
        } else if (this.field2279 >= 0) {
            var2 -= this.field2289 * var2 / ((class383) super.field1254).field5470.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!ct", name = "b", descriptor = "(II[B[IIIIIIIIIILct;II)I", line = 1054)
    private static final int method1210(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class154 arg13, int arg14, int arg15) {
        arg13.field2282 -= arg13.field2288 * arg5;
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
        arg13.field2282 += arg13.field2288 * var22;
        arg13.field2278 = arg6;
        arg13.field2285 = arg7;
        arg13.field2283 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!ct", name = "d", descriptor = "(II[B[IIIIIIIILct;II)I", line = 1098)
    private static final int method1211(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class154 arg11, int arg12, int arg13) {
        arg11.field2278 -= arg11.field2280 * arg5;
        arg11.field2285 -= arg11.field2291 * arg5;
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
        arg11.field2278 += arg11.field2280 * arg5;
        arg11.field2285 += arg11.field2291 * arg5;
        arg11.field2282 = arg6;
        arg11.field2283 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ct", name = "b", descriptor = "(I[B[IIIIIIIIIILct;)I", line = 1131)
    private static final int method1212(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class154 arg12) {
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
        arg12.field2282 += (var19 - arg4) * arg12.field2288;
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
        arg12.field2278 = var15 >> 2;
        arg12.field2285 = var16 >> 2;
        arg12.field2283 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!ct", name = "k", descriptor = "()Z", line = 1185)
    public final boolean method1213() {
        return this.field2284 != 0;
    }

    @OriginalMember(owner = "client!ct", name = "b", descriptor = "(II[B[IIIIIIILct;II)I", line = 1188)
    private static final int method1214(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class154 arg10, int arg11, int arg12) {
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
        arg10.field2283 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ct", name = "b", descriptor = "([IIIII)I", line = 1214)
    private final int method1215(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field2284 <= 0) {
                if (this.field2290 == 256 && (this.field2283 & 255) == 0) {
                    if (class488.field6909) {
                        return method1205(0, ((class383) super.field1254).field5470, arg0, this.field2283, arg1, this.field2278, this.field2285, 0, arg3, arg2, this);
                    }
                    return method1218(((class383) super.field1254).field5470, arg0, this.field2283, arg1, this.field2282, 0, arg3, arg2, this);
                }
                if (class488.field6909) {
                    return method1201(0, 0, ((class383) super.field1254).field5470, arg0, this.field2283, arg1, this.field2278, this.field2285, 0, arg3, arg2, this, this.field2290, arg4);
                }
                return method1209(0, 0, ((class383) super.field1254).field5470, arg0, this.field2283, arg1, this.field2282, 0, arg3, arg2, this, this.field2290, arg4);
            }
            int var6 = this.field2284 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field2284 += arg1;
            if (this.field2290 == 256 && (this.field2283 & 255) == 0) {
                if (class488.field6909) {
                    arg1 = method1190(0, ((class383) super.field1254).field5470, arg0, this.field2283, arg1, this.field2278, this.field2285, this.field2280, this.field2291, 0, var6, arg2, this);
                } else {
                    arg1 = method1194(((class383) super.field1254).field5470, arg0, this.field2283, arg1, this.field2282, this.field2288, 0, var6, arg2, this);
                }
            } else if (class488.field6909) {
                arg1 = method1210(0, 0, ((class383) super.field1254).field5470, arg0, this.field2283, arg1, this.field2278, this.field2285, this.field2280, this.field2291, 0, var6, arg2, this, this.field2290, arg4);
            } else {
                arg1 = method1193(0, 0, ((class383) super.field1254).field5470, arg0, this.field2283, arg1, this.field2282, this.field2288, 0, var6, arg2, this, this.field2290, arg4);
            }
            this.field2284 -= arg1;
            if (this.field2284 != 0) {
                return arg1;
            }
        } while (!this.method1219());
        return arg3;
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "([B[IIIIIIILct;)I", line = 1270)
    private static final int method1216(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class154 arg8) {
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
        arg8.field2283 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ct", name = "d", descriptor = "()I", line = 1295)
    public final int method691() {
        return this.field2286 == 0 && this.field2284 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!ct", name = "k", descriptor = "(I)V", line = 1303)
    public final synchronized void method1217(int arg0) {
        if (this.field2290 < 0) {
            this.field2290 = -arg0;
        } else {
            this.field2290 = arg0;
        }
    }

    @OriginalMember(owner = "client!ct", name = "b", descriptor = "([B[IIIIIIILct;)I", line = 1311)
    private static final int method1218(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class154 arg8) {
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
        arg8.field2283 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ct", name = "l", descriptor = "()Z", line = 1337)
    private final boolean method1219() {
        int var1 = this.field2286;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1187(var1, this.field2281);
            var2 = method1198(var1, this.field2281);
        }
        if (this.field2282 == var1 && this.field2278 == var3 && this.field2285 == var2) {
            if (this.field2286 == Integer.MIN_VALUE) {
                this.field2286 = 0;
                this.field2282 = this.field2278 = this.field2285 = 0;
                this.method3117((byte) -126);
                return true;
            } else {
                this.method1186();
                return false;
            }
        } else {
            if (this.field2282 < var1) {
                this.field2288 = 1;
                this.field2284 = var1 - this.field2282;
            } else if (this.field2282 > var1) {
                this.field2288 = -1;
                this.field2284 = this.field2282 - var1;
            } else {
                this.field2288 = 0;
            }
            if (this.field2278 < var3) {
                this.field2280 = 1;
                if (this.field2284 == 0 || this.field2284 > var3 - this.field2278) {
                    this.field2284 = var3 - this.field2278;
                }
            } else if (this.field2278 > var3) {
                this.field2280 = -1;
                if (this.field2284 == 0 || this.field2284 > this.field2278 - var3) {
                    this.field2284 = this.field2278 - var3;
                }
            } else {
                this.field2280 = 0;
            }
            if (this.field2285 < var2) {
                this.field2291 = 1;
                if (this.field2284 == 0 || this.field2284 > var2 - this.field2285) {
                    this.field2284 = var2 - this.field2285;
                }
            } else if (this.field2285 > var2) {
                this.field2291 = -1;
                if (this.field2284 == 0 || this.field2284 > this.field2285 - var2) {
                    this.field2284 = this.field2285 - var2;
                }
            } else {
                this.field2291 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ct", name = "<init>", descriptor = "(Lbc;III)V", line = 1422)
    private class154(class383 arg0, int arg1, int arg2, int arg3) {
        super.field1254 = arg0;
        this.field2289 = arg0.field5467;
        this.field2292 = arg0.field5466;
        this.field2287 = arg0.field5469;
        this.field2290 = arg1;
        this.field2286 = arg2;
        this.field2281 = arg3;
        this.field2283 = 0;
        this.method1186();
    }

    @OriginalMember(owner = "client!ct", name = "b", descriptor = "([B[IIIIIIIILct;)I", line = 1434)
    private static final int method1220(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class154 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field2278 += (var14 - arg3) * arg9.field2280;
        arg9.field2285 += (var14 - arg3) * arg9.field2291;
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
        arg9.field2282 = var12 >> 2;
        arg9.field2283 = var10 << 8;
        return arg3;
    }
}
