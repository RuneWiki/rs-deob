import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class139 extends class363 {

    @OriginalMember(owner = "client!uk", name = "F", descriptor = "I")
    private int field2297;

    @OriginalMember(owner = "client!uk", name = "t", descriptor = "I")
    private int field2285;

    @OriginalMember(owner = "client!uk", name = "D", descriptor = "Z")
    private boolean field2295;

    @OriginalMember(owner = "client!uk", name = "z", descriptor = "I")
    private int field2291;

    @OriginalMember(owner = "client!uk", name = "w", descriptor = "I")
    private int field2288;

    @OriginalMember(owner = "client!uk", name = "C", descriptor = "I")
    private int field2294;

    @OriginalMember(owner = "client!uk", name = "y", descriptor = "I")
    private int field2290;

    @OriginalMember(owner = "client!uk", name = "s", descriptor = "I")
    private int field2284;

    @OriginalMember(owner = "client!uk", name = "u", descriptor = "I")
    private int field2286;

    @OriginalMember(owner = "client!uk", name = "v", descriptor = "I")
    private int field2287;

    @OriginalMember(owner = "client!uk", name = "x", descriptor = "I")
    private int field2289;

    @OriginalMember(owner = "client!uk", name = "A", descriptor = "I")
    private int field2292;

    @OriginalMember(owner = "client!uk", name = "B", descriptor = "I")
    private int field2293;

    @OriginalMember(owner = "client!uk", name = "E", descriptor = "I")
    private int field2296;

    @OriginalMember(owner = "client!uk", name = "G", descriptor = "I")
    private int field2298;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(I[B[IIIIIIIIIILuk;)I", line = 4)
    private static final int method1042(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class139 arg12) {
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
        arg12.field2289 += (var19 - arg4) * arg12.field2287;
        int var20 = arg4 << 1;
        int var21 = var19 << 1;
        int var44 = var21 - 6;
        while (var20 < var44) {
            byte var22 = arg1[var13++];
            int var33 = var20++;
            arg2[var33] += var15 * var22;
            int var23 = var15 + var17;
            int var34 = var20++;
            arg2[var34] += var16 * var22;
            int var24 = var16 + var18;
            byte var25 = arg1[var13++];
            int var36 = var20++;
            arg2[var36] += var23 * var25;
            int var26 = var17 + var23;
            int var37 = var20++;
            arg2[var37] += var24 * var25;
            int var27 = var18 + var24;
            byte var28 = arg1[var13++];
            int var39 = var20++;
            arg2[var39] += var26 * var28;
            int var29 = var17 + var26;
            int var40 = var20++;
            arg2[var40] += var27 * var28;
            int var30 = var18 + var27;
            byte var31 = arg1[var13++];
            int var42 = var20++;
            arg2[var42] += var29 * var31;
            var15 = var17 + var29;
            int var43 = var20++;
            arg2[var43] += var30 * var31;
            var16 = var18 + var30;
        }
        var21 = var44 + 6;
        while (var20 < var21) {
            byte var32 = arg1[var13++];
            int var10001 = var20++;
            arg2[var10001] += var15 * var32;
            var15 += var17;
            int var45 = var20++;
            arg2[var45] += var16 * var32;
            var16 += var18;
        }
        arg12.field2284 = var15 >> 2;
        arg12.field2298 = var16 >> 2;
        arg12.field2290 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(II[B[IIIIIIIILuk;II)I", line = 58)
    private static final int method1043(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class139 arg11, int arg12, int arg13) {
        int var14;
        if (arg12 == 0 || (var14 = (arg10 + arg12 + 256 - arg4) / arg12 + arg5) > arg9) {
            var14 = arg9;
        }
        int var15 = arg5 << 1;
        int var16 = var14 << 1;
        int var10001;
        while (var15 < var16) {
            int var17 = arg4 >> 8;
            byte var18 = arg2[var17 - 1];
            int var19 = (var18 << 8) + (arg4 & 0xFF) * (arg2[var17] - var18);
            var10001 = var15++;
            arg3[var10001] += arg6 * var19 >> 6;
            int var24 = var15++;
            arg3[var24] += arg7 * var19 >> 6;
            arg4 += arg12;
        }
        int var20;
        if (arg12 == 0 || (var20 = (var15 >> 1) + (arg10 + arg12 - arg4) / arg12) > arg9) {
            var20 = arg9;
        }
        int var21 = var20 << 1;
        int var22 = arg13;
        while (var15 < var21) {
            int var23 = (var22 << 8) + (arg4 & 0xFF) * (arg2[arg4 >> 8] - var22);
            var10001 = var15++;
            arg3[var10001] += arg6 * var23 >> 6;
            var10001 = var15++;
            arg3[var10001] += arg7 * var23 >> 6;
            arg4 += arg12;
        }
        arg11.field2290 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "(I)V", line = 91)
    public final synchronized void method1044(int arg0) {
        if (this.field2291 < 0) {
            this.field2291 = -arg0;
        } else {
            this.field2291 = arg0;
        }
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(I)V", line = 98)
    public final synchronized void method52(int arg0) {
        if (this.field2293 > 0) {
            if (arg0 >= this.field2293) {
                if (this.field2288 == Integer.MIN_VALUE) {
                    this.field2288 = 0;
                    this.field2289 = this.field2284 = this.field2298 = 0;
                    this.method330(15);
                    arg0 = this.field2293;
                }
                this.field2293 = 0;
                this.method1056();
            } else {
                this.field2289 += this.field2287 * arg0;
                this.field2284 += this.field2286 * arg0;
                this.field2298 += this.field2292 * arg0;
                this.field2293 -= arg0;
            }
        }
        class110 var2 = (class110) this.field5750;
        int var3 = this.field2297 << 8;
        int var4 = this.field2285 << 8;
        int var5 = var2.field1808.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field2296 = 0;
        }
        if (this.field2290 < 0) {
            if (this.field2291 <= 0) {
                this.method1059();
                this.method330(15);
                return;
            }
            this.field2290 = 0;
        }
        if (this.field2290 >= var5) {
            if (this.field2291 >= 0) {
                this.method1059();
                this.method330(15);
                return;
            }
            this.field2290 = var5 - 1;
        }
        this.field2290 += this.field2291 * arg0;
        if (this.field2296 >= 0) {
            if (this.field2296 > 0) {
                if (this.field2295) {
                    label121: {
                        if (this.field2291 < 0) {
                            if (this.field2290 >= var3) {
                                return;
                            }
                            this.field2290 = var3 + var3 - this.field2290 - 1;
                            this.field2291 = -this.field2291;
                            if (--this.field2296 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field2290 < var4) {
                                return;
                            }
                            this.field2290 = var4 + var4 - this.field2290 - 1;
                            this.field2291 = -this.field2291;
                            if (--this.field2296 == 0) {
                                break;
                            }
                            if (this.field2290 >= var3) {
                                return;
                            }
                            this.field2290 = var3 + var3 - this.field2290 - 1;
                            this.field2291 = -this.field2291;
                        } while (--this.field2296 != 0);
                    }
                } else {
                    label153: {
                        if (this.field2291 < 0) {
                            if (this.field2290 >= var3) {
                                return;
                            }
                            int var7 = (var4 - this.field2290 - 1) / var6;
                            if (var7 >= this.field2296) {
                                this.field2290 += this.field2296 * var6;
                                this.field2296 = 0;
                                break label153;
                            }
                            this.field2290 += var6 * var7;
                            this.field2296 -= var7;
                        } else if (this.field2290 >= var4) {
                            int var8 = (this.field2290 - var3) / var6;
                            if (var8 >= this.field2296) {
                                this.field2290 -= this.field2296 * var6;
                                this.field2296 = 0;
                                break label153;
                            }
                            this.field2290 -= var6 * var8;
                            this.field2296 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field2291 < 0) {
                if (this.field2290 < 0) {
                    this.field2290 = -1;
                    this.method1059();
                    this.method330(15);
                }
            } else if (this.field2290 >= var5) {
                this.field2290 = var5;
                this.method1059();
                this.method330(15);
            }
        } else if (this.field2295) {
            if (this.field2291 < 0) {
                if (this.field2290 >= var3) {
                    return;
                }
                this.field2290 = var3 + var3 - this.field2290 - 1;
                this.field2291 = -this.field2291;
            }
            while (this.field2290 >= var4) {
                this.field2290 = var4 + var4 - this.field2290 - 1;
                this.field2291 = -this.field2291;
                if (this.field2290 >= var3) {
                    return;
                }
                this.field2290 = var3 + var3 - this.field2290 - 1;
                this.field2291 = -this.field2291;
            }
        } else if (this.field2291 < 0) {
            if (this.field2290 >= var3) {
                return;
            }
            this.field2290 = var4 - (var4 - 1 - this.field2290) % var6 - 1;
        } else if (this.field2290 >= var4) {
            this.field2290 = (this.field2290 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(II)I", line = 318)
    private static final int method1045(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!uk", name = "e", descriptor = "()Z", line = 321)
    public final boolean method1046() {
        return this.field2290 < 0 || this.field2290 >= ((class110) this.field5750).field1808.length << 8;
    }

    @OriginalMember(owner = "client!uk", name = "f", descriptor = "()I", line = 324)
    public final synchronized int method1047() {
        return this.field2291 < 0 ? -this.field2291 : this.field2291;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(II[B[IIIIIIIIIILuk;II)I", line = 328)
    private static final int method1048(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class139 arg13, int arg14, int arg15) {
        arg13.field2289 -= arg13.field2287 * arg5;
        int var16;
        if (arg14 == 0 || (var16 = (arg12 + arg14 + 256 - arg4) / arg14 + arg5) > arg11) {
            var16 = arg11;
        }
        int var17 = arg5 << 1;
        int var18 = var16 << 1;
        int var10001;
        while (var17 < var18) {
            int var19 = arg4 >> 8;
            byte var20 = arg2[var19 - 1];
            int var21 = (var20 << 8) + (arg4 & 0xFF) * (arg2[var19] - var20);
            var10001 = var17++;
            arg3[var10001] += arg6 * var21 >> 6;
            arg6 += arg8;
            int var27 = var17++;
            arg3[var27] += arg7 * var21 >> 6;
            arg7 += arg9;
            arg4 += arg14;
        }
        int var22;
        if (arg14 == 0 || (var22 = (var17 >> 1) + (arg12 + arg14 - arg4) / arg14) > arg11) {
            var22 = arg11;
        }
        int var23 = var22 << 1;
        int var24 = arg15;
        while (var17 < var23) {
            int var25 = (var24 << 8) + (arg4 & 0xFF) * (arg2[arg4 >> 8] - var24);
            var10001 = var17++;
            arg3[var10001] += arg6 * var25 >> 6;
            arg6 += arg8;
            var10001 = var17++;
            arg3[var10001] += arg7 * var25 >> 6;
            arg7 += arg9;
            arg4 += arg14;
        }
        int var26 = var17 >> 1;
        arg13.field2289 += arg13.field2287 * var26;
        arg13.field2284 = arg6;
        arg13.field2298 = arg7;
        arg13.field2290 = arg4;
        return var26;
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(II)V", line = 369)
    public final synchronized void method1049(int arg0, int arg1) {
        this.method1050(arg0, arg1, this.method1058());
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(III)V", line = 373)
    public final synchronized void method1050(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1069(arg1, arg2);
            return;
        }
        int var4 = method1045(arg1, arg2);
        int var5 = method1074(arg1, arg2);
        if (this.field2284 == var4 && this.field2298 == var5) {
            this.field2293 = 0;
            return;
        }
        int var6 = arg1 - this.field2289;
        if (this.field2289 - arg1 > var6) {
            var6 = this.field2289 - arg1;
        }
        if (var4 - this.field2284 > var6) {
            var6 = var4 - this.field2284;
        }
        if (this.field2284 - var4 > var6) {
            var6 = this.field2284 - var4;
        }
        if (var5 - this.field2298 > var6) {
            var6 = var5 - this.field2298;
        }
        if (this.field2298 - var5 > var6) {
            var6 = this.field2298 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field2293 = arg0;
        this.field2288 = arg1;
        this.field2294 = arg2;
        this.field2287 = (arg1 - this.field2289) / arg0;
        this.field2286 = (var4 - this.field2284) / arg0;
        this.field2292 = (var5 - this.field2298) / arg0;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "([B[IIIIIIILuk;)I", line = 420)
    private static final int method1051(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class139 arg8) {
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
        arg8.field2290 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "()I", line = 446)
    public final int method1052() {
        int var1 = this.field2289 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field2296 == 0) {
            var2 -= this.field2290 * var2 / (((class110) this.field5750).field1808.length << 8);
        } else if (this.field2296 >= 0) {
            var2 -= this.field2297 * var2 / ((class110) this.field5750).field1808.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(I[B[IIIIIIIILuk;)I", line = 462)
    private static final int method1053(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class139 arg10) {
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
            byte var18 = arg1[var11++];
            int var24 = var16++;
            arg2[var24] += var13 * var18;
            int var25 = var16++;
            arg2[var25] += var14 * var18;
            byte var19 = arg1[var11++];
            int var27 = var16++;
            arg2[var27] += var13 * var19;
            int var28 = var16++;
            arg2[var28] += var14 * var19;
            byte var20 = arg1[var11++];
            int var30 = var16++;
            arg2[var30] += var13 * var20;
            int var31 = var16++;
            arg2[var31] += var14 * var20;
            byte var21 = arg1[var11++];
            int var33 = var16++;
            arg2[var33] += var13 * var21;
            int var34 = var16++;
            arg2[var34] += var14 * var21;
        }
        var17 = var23 + 6;
        while (var16 < var17) {
            byte var22 = arg1[var11++];
            int var10001 = var16++;
            arg2[var10001] += var13 * var22;
            int var35 = var16++;
            arg2[var35] += var14 * var22;
        }
        arg10.field2290 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!uk", name = "g", descriptor = "()I", line = 500)
    public final synchronized int method1054() {
        return this.field2288 == Integer.MIN_VALUE ? 0 : this.field2288;
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(II[B[IIIIIIIILuk;II)I", line = 505)
    private static final int method1055(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class139 arg11, int arg12, int arg13) {
        arg11.field2284 -= arg11.field2286 * arg5;
        arg11.field2298 -= arg11.field2292 * arg5;
        int var14;
        if (arg12 == 0 || (var14 = (arg10 + arg12 + 256 - arg4) / arg12 + arg5) > arg9) {
            var14 = arg9;
        }
        int var10001;
        while (arg5 < var14) {
            int var15 = arg4 >> 8;
            byte var16 = arg2[var15 - 1];
            var10001 = arg5++;
            arg3[var10001] += ((var16 << 8) + (arg4 & 0xFF) * (arg2[var15] - var16)) * arg6 >> 6;
            arg6 += arg7;
            arg4 += arg12;
        }
        int var17;
        if (arg12 == 0 || (var17 = (arg10 + arg12 - arg4) / arg12 + arg5) > arg9) {
            var17 = arg9;
        }
        int var18 = arg13;
        int var19 = arg12;
        while (arg5 < var17) {
            var10001 = arg5++;
            arg3[var10001] += ((var18 << 8) + (arg4 & 0xFF) * (arg2[arg4 >> 8] - var18)) * arg6 >> 6;
            arg6 += arg7;
            arg4 += var19;
        }
        arg11.field2284 += arg11.field2286 * arg5;
        arg11.field2298 += arg11.field2292 * arg5;
        arg11.field2289 = arg6;
        arg11.field2290 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "()Ljk;", line = 539)
    public final class363 method43() {
        return null;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "()Ljk;", line = 542)
    public final class363 method47() {
        return null;
    }

    @OriginalMember(owner = "client!uk", name = "h", descriptor = "()V", line = 545)
    private final void method1056() {
        this.field2289 = this.field2288;
        this.field2284 = method1045(this.field2288, this.field2294);
        this.field2298 = method1074(this.field2288, this.field2294);
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "([III)V", line = 551)
    public final synchronized void method53(int[] arg0, int arg1, int arg2) {
        if (this.field2288 == 0 && this.field2293 == 0) {
            this.method52(arg2);
            return;
        }
        class110 var4 = (class110) this.field5750;
        int var5 = this.field2297 << 8;
        int var6 = this.field2285 << 8;
        int var7 = var4.field1808.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field2296 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field2290 < 0) {
            if (this.field2291 <= 0) {
                this.method1059();
                this.method330(15);
                return;
            }
            this.field2290 = 0;
        }
        if (this.field2290 >= var7) {
            if (this.field2291 >= 0) {
                this.method1059();
                this.method330(15);
                return;
            }
            this.field2290 = var7 - 1;
        }
        if (this.field2296 >= 0) {
            if (this.field2296 > 0) {
                if (this.field2295) {
                    label131: {
                        if (this.field2291 < 0) {
                            var9 = this.method1078(arg0, arg1, var5, var10, var4.field1808[this.field2297]);
                            if (this.field2290 >= var5) {
                                return;
                            }
                            this.field2290 = var5 + var5 - this.field2290 - 1;
                            this.field2291 = -this.field2291;
                            if (--this.field2296 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method1081(arg0, var9, var6, var10, var4.field1808[this.field2285 - 1]);
                            if (this.field2290 < var6) {
                                return;
                            }
                            this.field2290 = var6 + var6 - this.field2290 - 1;
                            this.field2291 = -this.field2291;
                            if (--this.field2296 == 0) {
                                break;
                            }
                            var9 = this.method1078(arg0, var9, var5, var10, var4.field1808[this.field2297]);
                            if (this.field2290 >= var5) {
                                return;
                            }
                            this.field2290 = var5 + var5 - this.field2290 - 1;
                            this.field2291 = -this.field2291;
                        } while (--this.field2296 != 0);
                    }
                } else if (this.field2291 < 0) {
                    while (true) {
                        var9 = this.method1078(arg0, var9, var5, var10, var4.field1808[this.field2285 - 1]);
                        if (this.field2290 >= var5) {
                            return;
                        }
                        int var12 = (var6 - this.field2290 - 1) / var8;
                        if (var12 >= this.field2296) {
                            this.field2290 += this.field2296 * var8;
                            this.field2296 = 0;
                            break;
                        }
                        this.field2290 += var8 * var12;
                        this.field2296 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method1081(arg0, var9, var6, var10, var4.field1808[this.field2297]);
                        if (this.field2290 < var6) {
                            return;
                        }
                        int var13 = (this.field2290 - var5) / var8;
                        if (var13 >= this.field2296) {
                            this.field2290 -= this.field2296 * var8;
                            this.field2296 = 0;
                            break;
                        }
                        this.field2290 -= var8 * var13;
                        this.field2296 -= var13;
                    }
                }
            }
            if (this.field2291 < 0) {
                this.method1078(arg0, var9, 0, var10, 0);
                if (this.field2290 < 0) {
                    this.field2290 = -1;
                    this.method1059();
                    this.method330(15);
                }
            } else {
                this.method1081(arg0, var9, var7, var10, 0);
                if (this.field2290 >= var7) {
                    this.field2290 = var7;
                    this.method1059();
                    this.method330(15);
                }
            }
        } else if (this.field2295) {
            if (this.field2291 < 0) {
                var9 = this.method1078(arg0, arg1, var5, var10, var4.field1808[this.field2297]);
                if (this.field2290 >= var5) {
                    return;
                }
                this.field2290 = var5 + var5 - this.field2290 - 1;
                this.field2291 = -this.field2291;
            }
            while (true) {
                int var11 = this.method1081(arg0, var9, var6, var10, var4.field1808[this.field2285 - 1]);
                if (this.field2290 < var6) {
                    return;
                }
                this.field2290 = var6 + var6 - this.field2290 - 1;
                this.field2291 = -this.field2291;
                var9 = this.method1078(arg0, var11, var5, var10, var4.field1808[this.field2297]);
                if (this.field2290 >= var5) {
                    return;
                }
                this.field2290 = var5 + var5 - this.field2290 - 1;
                this.field2291 = -this.field2291;
            }
        } else if (this.field2291 < 0) {
            while (true) {
                var9 = this.method1078(arg0, var9, var5, var10, var4.field1808[this.field2285 - 1]);
                if (this.field2290 >= var5) {
                    return;
                }
                this.field2290 = var6 - (var6 - 1 - this.field2290) % var8 - 1;
            }
        } else {
            while (true) {
                var9 = this.method1081(arg0, var9, var6, var10, var4.field1808[this.field2297]);
                if (this.field2290 < var6) {
                    return;
                }
                this.field2290 = (this.field2290 - var5) % var8 + var5;
            }
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "([B[IIIIIIIILuk;)I", line = 788)
    private static final int method1057(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class139 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field2284 += (var14 - arg3) * arg9.field2286;
        arg9.field2298 += (var14 - arg3) * arg9.field2292;
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
        arg9.field2289 = var12 >> 2;
        arg9.field2290 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!uk", name = "i", descriptor = "()I", line = 822)
    public final synchronized int method1058() {
        return this.field2294 < 0 ? -1 : this.field2294;
    }

    @OriginalMember(owner = "client!uk", name = "j", descriptor = "()V", line = 827)
    private final void method1059() {
        if (this.field2293 == 0) {
            return;
        }
        if (this.field2288 == Integer.MIN_VALUE) {
            this.field2288 = 0;
        }
        this.field2293 = 0;
        this.method1056();
    }

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "(II[B[IIIIIIIILuk;II)I", line = 839)
    private static final int method1060(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class139 arg11, int arg12, int arg13) {
        arg11.field2284 -= arg11.field2286 * arg5;
        arg11.field2298 -= arg11.field2292 * arg5;
        int var14;
        if (arg12 == 0 || (var14 = (arg10 + arg12 - arg4 - 257) / arg12 + arg5) > arg9) {
            var14 = arg9;
        }
        int var10001;
        while (arg5 < var14) {
            int var15 = arg4 >> 8;
            byte var16 = arg2[var15];
            var10001 = arg5++;
            arg3[var10001] += ((var16 << 8) + (arg4 & 0xFF) * (arg2[var15 + 1] - var16)) * arg6 >> 6;
            arg6 += arg7;
            arg4 += arg12;
        }
        int var17;
        if (arg12 == 0 || (var17 = (arg10 + arg12 - arg4 - 1) / arg12 + arg5) > arg9) {
            var17 = arg9;
        }
        int var18 = arg13;
        while (arg5 < var17) {
            byte var19 = arg2[arg4 >> 8];
            var10001 = arg5++;
            arg3[var10001] += ((var19 << 8) + (arg4 & 0xFF) * (var18 - var19)) * arg6 >> 6;
            arg6 += arg7;
            arg4 += arg12;
        }
        arg11.field2284 += arg11.field2286 * arg5;
        arg11.field2298 += arg11.field2292 * arg5;
        arg11.field2289 = arg6;
        arg11.field2290 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!uk", name = "k", descriptor = "()Z", line = 875)
    private final boolean method1061() {
        int var1 = this.field2288;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1045(var1, this.field2294);
            var2 = method1074(var1, this.field2294);
        }
        if (this.field2289 != var1 || this.field2284 != var3 || this.field2298 != var2) {
            if (this.field2289 < var1) {
                this.field2287 = 1;
                this.field2293 = var1 - this.field2289;
            } else if (this.field2289 > var1) {
                this.field2287 = -1;
                this.field2293 = this.field2289 - var1;
            } else {
                this.field2287 = 0;
            }
            if (this.field2284 < var3) {
                this.field2286 = 1;
                if (this.field2293 == 0 || this.field2293 > var3 - this.field2284) {
                    this.field2293 = var3 - this.field2284;
                }
            } else if (this.field2284 > var3) {
                this.field2286 = -1;
                if (this.field2293 == 0 || this.field2293 > this.field2284 - var3) {
                    this.field2293 = this.field2284 - var3;
                }
            } else {
                this.field2286 = 0;
            }
            if (this.field2298 < var2) {
                this.field2292 = 1;
                if (this.field2293 == 0 || this.field2293 > var2 - this.field2298) {
                    this.field2293 = var2 - this.field2298;
                }
            } else if (this.field2298 > var2) {
                this.field2292 = -1;
                if (this.field2293 == 0 || this.field2293 > this.field2298 - var2) {
                    this.field2293 = this.field2298 - var2;
                }
            } else {
                this.field2292 = 0;
            }
            return false;
        } else if (this.field2288 == Integer.MIN_VALUE) {
            this.field2288 = 0;
            this.field2289 = this.field2284 = this.field2298 = 0;
            this.method330(15);
            return true;
        } else {
            this.method1056();
            return false;
        }
    }

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "(II[B[IIIIIIIILuk;II)I", line = 961)
    private static final int method1062(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class139 arg11, int arg12, int arg13) {
        int var14;
        if (arg12 == 0 || (var14 = (arg10 + arg12 - arg4 - 257) / arg12 + arg5) > arg9) {
            var14 = arg9;
        }
        int var15 = arg5 << 1;
        int var16 = var14 << 1;
        int var10001;
        while (var15 < var16) {
            int var17 = arg4 >> 8;
            byte var18 = arg2[var17];
            int var19 = (var18 << 8) + (arg4 & 0xFF) * (arg2[var17 + 1] - var18);
            var10001 = var15++;
            arg3[var10001] += arg6 * var19 >> 6;
            int var25 = var15++;
            arg3[var25] += arg7 * var19 >> 6;
            arg4 += arg12;
        }
        int var20;
        if (arg12 == 0 || (var20 = (var15 >> 1) + (arg10 + arg12 - arg4 - 1) / arg12) > arg9) {
            var20 = arg9;
        }
        int var21 = var20 << 1;
        int var22 = arg13;
        while (var15 < var21) {
            byte var23 = arg2[arg4 >> 8];
            int var24 = (var23 << 8) + (arg4 & 0xFF) * (var22 - var23);
            var10001 = var15++;
            arg3[var10001] += arg6 * var24 >> 6;
            var10001 = var15++;
            arg3[var10001] += arg7 * var24 >> 6;
            arg4 += arg12;
        }
        arg11.field2290 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(II[B[IIIIIIILuk;II)I", line = 995)
    private static final int method1063(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class139 arg10, int arg11, int arg12) {
        int var13;
        if (arg11 == 0 || (var13 = (arg9 + arg11 - arg4 - 257) / arg11 + arg5) > arg8) {
            var13 = arg8;
        }
        int var10001;
        while (arg5 < var13) {
            int var14 = arg4 >> 8;
            byte var15 = arg2[var14];
            var10001 = arg5++;
            arg3[var10001] += ((var15 << 8) + (arg4 & 0xFF) * (arg2[var14 + 1] - var15)) * arg6 >> 6;
            arg4 += arg11;
        }
        int var16;
        if (arg11 == 0 || (var16 = (arg9 + arg11 - arg4 - 1) / arg11 + arg5) > arg8) {
            var16 = arg8;
        }
        int var17 = arg12;
        while (arg5 < var16) {
            byte var18 = arg2[arg4 >> 8];
            var10001 = arg5++;
            arg3[var10001] += ((var18 << 8) + (arg4 & 0xFF) * (var17 - var18)) * arg6 >> 6;
            arg4 += arg11;
        }
        arg10.field2290 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "(I)V", line = 1021)
    public final synchronized void method1064(int arg0) {
        if (arg0 == 0) {
            this.method1082(0);
            this.method330(15);
        } else if (this.field2284 == 0 && this.field2298 == 0) {
            this.field2293 = 0;
            this.field2288 = 0;
            this.field2289 = 0;
            this.method330(15);
        } else {
            int var2 = -this.field2289;
            if (this.field2289 > var2) {
                var2 = this.field2289;
            }
            if (-this.field2284 > var2) {
                var2 = -this.field2284;
            }
            if (this.field2284 > var2) {
                var2 = this.field2284;
            }
            if (-this.field2298 > var2) {
                var2 = -this.field2298;
            }
            if (this.field2298 > var2) {
                var2 = this.field2298;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field2293 = arg0;
            this.field2288 = Integer.MIN_VALUE;
            this.field2287 = -this.field2289 / arg0;
            this.field2286 = -this.field2284 / arg0;
            this.field2292 = -this.field2298 / arg0;
        }
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(I[B[IIIIIIIILuk;)I", line = 1067)
    private static final int method1065(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class139 arg10) {
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
            byte var18 = arg1[var11--];
            int var24 = var16++;
            arg2[var24] += var13 * var18;
            int var25 = var16++;
            arg2[var25] += var14 * var18;
            byte var19 = arg1[var11--];
            int var27 = var16++;
            arg2[var27] += var13 * var19;
            int var28 = var16++;
            arg2[var28] += var14 * var19;
            byte var20 = arg1[var11--];
            int var30 = var16++;
            arg2[var30] += var13 * var20;
            int var31 = var16++;
            arg2[var31] += var14 * var20;
            byte var21 = arg1[var11--];
            int var33 = var16++;
            arg2[var33] += var13 * var21;
            int var34 = var16++;
            arg2[var34] += var14 * var21;
        }
        var17 = var23 + 6;
        while (var16 < var17) {
            byte var22 = arg1[var11--];
            int var10001 = var16++;
            arg2[var10001] += var13 * var22;
            int var35 = var16++;
            arg2[var35] += var14 * var22;
        }
        arg10.field2290 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!uk", name = "e", descriptor = "(I)V", line = 1105)
    public final synchronized void method1066(int arg0) {
        this.method1069(arg0 << 6, this.method1058());
    }

    @OriginalMember(owner = "client!uk", name = "f", descriptor = "(I)V", line = 1109)
    public final synchronized void method1067(int arg0) {
        int var2 = ((class110) this.field5750).field1808.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field2290 = arg0;
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "([B[IIIIIIILuk;)I", line = 1119)
    private static final int method1068(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class139 arg8) {
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
        arg8.field2290 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "(II)V", line = 1144)
    private final synchronized void method1069(int arg0, int arg1) {
        this.field2288 = arg0;
        this.field2294 = arg1;
        this.field2293 = 0;
        this.method1056();
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "([B[IIIIIIIILuk;)I", line = 1150)
    private static final int method1070(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class139 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field2284 += (var14 - arg3) * arg9.field2286;
        arg9.field2298 += (var14 - arg3) * arg9.field2292;
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
        arg9.field2289 = var12 >> 2;
        arg9.field2290 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lh;III)Luk;", line = 1184)
    public static final class139 method1071(class110 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1808 == null || arg0.field1808.length == 0 ? null : new class139(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lh;II)Luk;", line = 1190)
    public static final class139 method1072(class110 arg0, int arg1, int arg2) {
        return arg0.field1808 == null || arg0.field1808.length == 0 ? null : new class139(arg0, (int) ((long) arg0.field1809 * 256L * (long) arg1 / (long) (class227.field3788 * 100)), arg2 << 6);
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(I[B[IIIIIIIIIILuk;)I", line = 1197)
    private static final int method1073(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class139 arg12) {
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
        arg12.field2289 += (var19 - arg4) * arg12.field2287;
        int var20 = arg4 << 1;
        int var21 = var19 << 1;
        int var44 = var21 - 6;
        while (var20 < var44) {
            byte var22 = arg1[var13--];
            int var33 = var20++;
            arg2[var33] += var15 * var22;
            int var23 = var15 + var17;
            int var34 = var20++;
            arg2[var34] += var16 * var22;
            int var24 = var16 + var18;
            byte var25 = arg1[var13--];
            int var36 = var20++;
            arg2[var36] += var23 * var25;
            int var26 = var17 + var23;
            int var37 = var20++;
            arg2[var37] += var24 * var25;
            int var27 = var18 + var24;
            byte var28 = arg1[var13--];
            int var39 = var20++;
            arg2[var39] += var26 * var28;
            int var29 = var17 + var26;
            int var40 = var20++;
            arg2[var40] += var27 * var28;
            int var30 = var18 + var27;
            byte var31 = arg1[var13--];
            int var42 = var20++;
            arg2[var42] += var29 * var31;
            var15 = var17 + var29;
            int var43 = var20++;
            arg2[var43] += var30 * var31;
            var16 = var18 + var30;
        }
        var21 = var44 + 6;
        while (var20 < var21) {
            byte var32 = arg1[var13--];
            int var10001 = var20++;
            arg2[var10001] += var15 * var32;
            var15 += var17;
            int var45 = var20++;
            arg2[var45] += var16 * var32;
            var16 += var18;
        }
        arg12.field2284 = var15 >> 2;
        arg12.field2298 = var16 >> 2;
        arg12.field2290 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "(II)I", line = 1251)
    private static final int method1074(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Z)V", line = 1254)
    public final synchronized void method1075(boolean arg0) {
        this.field2291 = (this.field2291 >>> 31) + (this.field2291 ^ this.field2291 >> 31);
        if (arg0) {
            this.field2291 = -this.field2291;
        }
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(II[B[IIIIIIIIIILuk;II)I", line = 1260)
    private static final int method1076(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class139 arg13, int arg14, int arg15) {
        arg13.field2289 -= arg13.field2287 * arg5;
        int var16;
        if (arg14 == 0 || (var16 = (arg12 + arg14 - arg4 - 257) / arg14 + arg5) > arg11) {
            var16 = arg11;
        }
        int var17 = arg5 << 1;
        int var18 = var16 << 1;
        int var10001;
        while (var17 < var18) {
            int var19 = arg4 >> 8;
            byte var20 = arg2[var19];
            int var21 = (var20 << 8) + (arg4 & 0xFF) * (arg2[var19 + 1] - var20);
            var10001 = var17++;
            arg3[var10001] += arg6 * var21 >> 6;
            arg6 += arg8;
            int var28 = var17++;
            arg3[var28] += arg7 * var21 >> 6;
            arg7 += arg9;
            arg4 += arg14;
        }
        int var22;
        if (arg14 == 0 || (var22 = (var17 >> 1) + (arg12 + arg14 - arg4 - 1) / arg14) > arg11) {
            var22 = arg11;
        }
        int var23 = var22 << 1;
        int var24 = arg15;
        while (var17 < var23) {
            byte var25 = arg2[arg4 >> 8];
            int var26 = (var25 << 8) + (arg4 & 0xFF) * (var24 - var25);
            var10001 = var17++;
            arg3[var10001] += arg6 * var26 >> 6;
            arg6 += arg8;
            var10001 = var17++;
            arg3[var10001] += arg7 * var26 >> 6;
            arg7 += arg9;
            arg4 += arg14;
        }
        int var27 = var17 >> 1;
        arg13.field2289 += arg13.field2287 * var27;
        arg13.field2284 = arg6;
        arg13.field2298 = arg7;
        arg13.field2290 = arg4;
        return var27;
    }

    @OriginalMember(owner = "client!uk", name = "l", descriptor = "()Z", line = 1302)
    public final boolean method1077() {
        return this.field2293 != 0;
    }

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "()I", line = 1309)
    public final int method46() {
        return this.field2288 == 0 && this.field2293 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "([IIIII)I", line = 1316)
    private final int method1078(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field2293 > 0) {
                int var6 = this.field2293 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field2293 += arg1;
                if (this.field2291 == -256 && (this.field2290 & 0xFF) == 0) {
                    if (class232.field3855) {
                        arg1 = method1073(0, ((class110) this.field5750).field1808, arg0, this.field2290, arg1, this.field2284, this.field2298, this.field2286, this.field2292, 0, var6, arg2, this);
                    } else {
                        arg1 = method1057(((class110) this.field5750).field1808, arg0, this.field2290, arg1, this.field2289, this.field2287, 0, var6, arg2, this);
                    }
                } else if (class232.field3855) {
                    arg1 = method1048(0, 0, ((class110) this.field5750).field1808, arg0, this.field2290, arg1, this.field2284, this.field2298, this.field2286, this.field2292, 0, var6, arg2, this, this.field2291, arg4);
                } else {
                    arg1 = method1055(0, 0, ((class110) this.field5750).field1808, arg0, this.field2290, arg1, this.field2289, this.field2287, 0, var6, arg2, this, this.field2291, arg4);
                }
                this.field2293 -= arg1;
                if (this.field2293 != 0) {
                    return arg1;
                }
                if (!this.method1061()) {
                    continue;
                }
                return arg3;
            }
            if (this.field2291 == -256 && (this.field2290 & 0xFF) == 0) {
                if (class232.field3855) {
                    return method1065(0, ((class110) this.field5750).field1808, arg0, this.field2290, arg1, this.field2284, this.field2298, 0, arg3, arg2, this);
                }
                return method1068(((class110) this.field5750).field1808, arg0, this.field2290, arg1, this.field2289, 0, arg3, arg2, this);
            }
            if (class232.field3855) {
                return method1043(0, 0, ((class110) this.field5750).field1808, arg0, this.field2290, arg1, this.field2284, this.field2298, 0, arg3, arg2, this, this.field2291, arg4);
            }
            return method1080(0, 0, ((class110) this.field5750).field1808, arg0, this.field2290, arg1, this.field2289, 0, arg3, arg2, this, this.field2291, arg4);
        }
    }

    @OriginalMember(owner = "client!uk", name = "g", descriptor = "(I)V", line = 1371)
    public final synchronized void method1079(int arg0) {
        this.field2296 = arg0;
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(II[B[IIIIIIILuk;II)I", line = 1374)
    private static final int method1080(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class139 arg10, int arg11, int arg12) {
        int var13;
        if (arg11 == 0 || (var13 = (arg9 + arg11 + 256 - arg4) / arg11 + arg5) > arg8) {
            var13 = arg8;
        }
        int var10001;
        while (arg5 < var13) {
            int var14 = arg4 >> 8;
            byte var15 = arg2[var14 - 1];
            var10001 = arg5++;
            arg3[var10001] += ((var15 << 8) + (arg4 & 0xFF) * (arg2[var14] - var15)) * arg6 >> 6;
            arg4 += arg11;
        }
        int var16;
        if (arg11 == 0 || (var16 = (arg9 + arg11 - arg4) / arg11 + arg5) > arg8) {
            var16 = arg8;
        }
        int var17 = arg12;
        int var18 = arg11;
        while (arg5 < var16) {
            var10001 = arg5++;
            arg3[var10001] += ((var17 << 8) + (arg4 & 0xFF) * (arg2[arg4 >> 8] - var17)) * arg6 >> 6;
            arg4 += var18;
        }
        arg10.field2290 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "([IIIII)I", line = 1400)
    private final int method1081(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field2293 > 0) {
                int var6 = this.field2293 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field2293 += arg1;
                if (this.field2291 == 256 && (this.field2290 & 0xFF) == 0) {
                    if (class232.field3855) {
                        arg1 = method1042(0, ((class110) this.field5750).field1808, arg0, this.field2290, arg1, this.field2284, this.field2298, this.field2286, this.field2292, 0, var6, arg2, this);
                    } else {
                        arg1 = method1070(((class110) this.field5750).field1808, arg0, this.field2290, arg1, this.field2289, this.field2287, 0, var6, arg2, this);
                    }
                } else if (class232.field3855) {
                    arg1 = method1076(0, 0, ((class110) this.field5750).field1808, arg0, this.field2290, arg1, this.field2284, this.field2298, this.field2286, this.field2292, 0, var6, arg2, this, this.field2291, arg4);
                } else {
                    arg1 = method1060(0, 0, ((class110) this.field5750).field1808, arg0, this.field2290, arg1, this.field2289, this.field2287, 0, var6, arg2, this, this.field2291, arg4);
                }
                this.field2293 -= arg1;
                if (this.field2293 != 0) {
                    return arg1;
                }
                if (!this.method1061()) {
                    continue;
                }
                return arg3;
            }
            if (this.field2291 == 256 && (this.field2290 & 0xFF) == 0) {
                if (class232.field3855) {
                    return method1053(0, ((class110) this.field5750).field1808, arg0, this.field2290, arg1, this.field2284, this.field2298, 0, arg3, arg2, this);
                }
                return method1051(((class110) this.field5750).field1808, arg0, this.field2290, arg1, this.field2289, 0, arg3, arg2, this);
            }
            if (class232.field3855) {
                return method1062(0, 0, ((class110) this.field5750).field1808, arg0, this.field2290, arg1, this.field2284, this.field2298, 0, arg3, arg2, this, this.field2291, arg4);
            }
            return method1063(0, 0, ((class110) this.field5750).field1808, arg0, this.field2290, arg1, this.field2289, 0, arg3, arg2, this, this.field2291, arg4);
        }
    }

    @OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(Lh;II)V", line = 1455)
    private class139(class110 arg0, int arg1, int arg2) {
        this.field5750 = arg0;
        this.field2297 = arg0.field1806;
        this.field2285 = arg0.field1805;
        this.field2295 = arg0.field1807;
        this.field2291 = arg1;
        this.field2288 = arg2;
        this.field2294 = 8192;
        this.field2290 = 0;
        this.method1056();
    }

    @OriginalMember(owner = "client!uk", name = "h", descriptor = "(I)V", line = 1467)
    private final synchronized void method1082(int arg0) {
        this.method1069(arg0, this.method1058());
    }

    @OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(Lh;III)V", line = 1469)
    private class139(class110 arg0, int arg1, int arg2, int arg3) {
        this.field5750 = arg0;
        this.field2297 = arg0.field1806;
        this.field2285 = arg0.field1805;
        this.field2295 = arg0.field1807;
        this.field2291 = arg1;
        this.field2288 = arg2;
        this.field2294 = arg3;
        this.field2290 = 0;
        this.method1056();
    }
}
