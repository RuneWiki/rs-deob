import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class89 extends class95 {

    @OriginalMember(owner = "client!jd", name = "x", descriptor = "I")
    private int field1324;

    @OriginalMember(owner = "client!jd", name = "z", descriptor = "I")
    private int field1326;

    @OriginalMember(owner = "client!jd", name = "A", descriptor = "Z")
    private boolean field1327;

    @OriginalMember(owner = "client!jd", name = "w", descriptor = "I")
    private int field1323;

    @OriginalMember(owner = "client!jd", name = "F", descriptor = "I")
    private int field1332;

    @OriginalMember(owner = "client!jd", name = "C", descriptor = "I")
    private int field1329;

    @OriginalMember(owner = "client!jd", name = "D", descriptor = "I")
    private int field1330;

    @OriginalMember(owner = "client!jd", name = "s", descriptor = "I")
    private int field1319;

    @OriginalMember(owner = "client!jd", name = "t", descriptor = "I")
    private int field1320;

    @OriginalMember(owner = "client!jd", name = "u", descriptor = "I")
    private int field1321;

    @OriginalMember(owner = "client!jd", name = "v", descriptor = "I")
    private int field1322;

    @OriginalMember(owner = "client!jd", name = "y", descriptor = "I")
    private int field1325;

    @OriginalMember(owner = "client!jd", name = "B", descriptor = "I")
    private int field1328;

    @OriginalMember(owner = "client!jd", name = "E", descriptor = "I")
    private int field1331;

    @OriginalMember(owner = "client!jd", name = "G", descriptor = "I")
    private int field1333;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(II[B[IIIIIIIILjd;II)I")
    private static final int method670(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class89 arg11, int arg12, int arg13) {
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
        arg11.field1330 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(II)V")
    public final synchronized void method671(int arg0, int arg1) {
        this.method684(arg0, arg1, this.method701());
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I[B[IIIIIIIIIILjd;)I")
    private static final int method672(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class89 arg12) {
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
        arg12.field1328 += (var19 - arg4) * arg12.field1319;
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
        arg12.field1322 = var15 >> 2;
        arg12.field1320 = var16 >> 2;
        arg12.field1330 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(II[B[IIIIIIIILjd;II)I")
    private static final int method673(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class89 arg11, int arg12, int arg13) {
        arg11.field1322 -= arg11.field1321 * arg5;
        arg11.field1320 -= arg11.field1333 * arg5;
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
        arg11.field1322 += arg11.field1321 * arg5;
        arg11.field1320 += arg11.field1333 * arg5;
        arg11.field1328 = arg6;
        arg11.field1330 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(II[B[IIIIIIIIIILjd;II)I")
    private static final int method674(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class89 arg13, int arg14, int arg15) {
        arg13.field1328 -= arg13.field1319 * arg5;
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
        arg13.field1328 += arg13.field1319 * var22;
        arg13.field1322 = arg6;
        arg13.field1320 = arg7;
        arg13.field1330 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "()I")
    public final synchronized int method675() {
        return this.field1332 == Integer.MIN_VALUE ? 0 : this.field1332;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "()Lcf;")
    public final class95 method249() {
        return null;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "([B[IIIIIIIILjd;)I")
    private static final int method676(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class89 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1322 += (var14 - arg3) * arg9.field1321;
        arg9.field1320 += (var14 - arg3) * arg9.field1333;
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
        arg9.field1328 = var12 >> 2;
        arg9.field1330 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(II[B[IIIIIIIIIILjd;II)I")
    private static final int method677(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class89 arg13, int arg14, int arg15) {
        arg13.field1328 -= arg13.field1319 * arg5;
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
        arg13.field1328 += arg13.field1319 * var22;
        arg13.field1322 = arg6;
        arg13.field1320 = arg7;
        arg13.field1330 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lwe;II)Ljd;")
    public static final class89 method678(class15 arg0, int arg1, int arg2) {
        return arg0.field169 != null && arg0.field169.length != 0 ? new class89(arg0, (int) ((long) arg0.field170 * 256L * (long) arg1 / (long) (class28.field329 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(Z)V")
    public final synchronized void method679(boolean arg0) {
        this.field1323 = (this.field1323 >>> 31) + (this.field1323 ^ this.field1323 >> 31);
        if (arg0) {
            this.field1323 = -this.field1323;
        }
    }

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "(I)V")
    public final synchronized void method245(int arg0) {
        if (this.field1331 > 0) {
            if (arg0 >= this.field1331) {
                if (this.field1332 == Integer.MIN_VALUE) {
                    this.field1332 = 0;
                    this.field1328 = this.field1322 = this.field1320 = 0;
                    this.method1922(-1);
                    arg0 = this.field1331;
                }
                this.field1331 = 0;
                this.method693();
            } else {
                this.field1328 += this.field1319 * arg0;
                this.field1322 += this.field1321 * arg0;
                this.field1320 += this.field1333 * arg0;
                this.field1331 -= arg0;
            }
        }
        class15 var2 = (class15) super.field1408;
        int var3 = this.field1324 << 8;
        int var4 = this.field1326 << 8;
        int var5 = var2.field169.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1325 = 0;
        }
        if (this.field1330 < 0) {
            if (this.field1323 <= 0) {
                this.method683();
                this.method1922(-1);
                return;
            }
            this.field1330 = 0;
        }
        if (this.field1330 >= var5) {
            if (this.field1323 >= 0) {
                this.method683();
                this.method1922(-1);
                return;
            }
            this.field1330 = var5 - 1;
        }
        this.field1330 += this.field1323 * arg0;
        if (this.field1325 < 0) {
            if (!this.field1327) {
                if (this.field1323 < 0) {
                    if (this.field1330 < var3) {
                        this.field1330 = var4 - 1 - (var4 - 1 - this.field1330) % var6;
                    }
                } else if (this.field1330 >= var4) {
                    this.field1330 = (this.field1330 - var3) % var6 + var3;
                }
            } else {
                if (this.field1323 < 0) {
                    if (this.field1330 >= var3) {
                        return;
                    }
                    this.field1330 = var3 + var3 - 1 - this.field1330;
                    this.field1323 = -this.field1323;
                }
                while (this.field1330 >= var4) {
                    this.field1330 = var4 + var4 - 1 - this.field1330;
                    this.field1323 = -this.field1323;
                    if (this.field1330 >= var3) {
                        return;
                    }
                    this.field1330 = var3 + var3 - 1 - this.field1330;
                    this.field1323 = -this.field1323;
                }
            }
        } else {
            if (this.field1325 > 0) {
                if (this.field1327) {
                    label125: {
                        if (this.field1323 < 0) {
                            if (this.field1330 >= var3) {
                                return;
                            }
                            this.field1330 = var3 + var3 - 1 - this.field1330;
                            this.field1323 = -this.field1323;
                            if (--this.field1325 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field1330 < var4) {
                                return;
                            }
                            this.field1330 = var4 + var4 - 1 - this.field1330;
                            this.field1323 = -this.field1323;
                            if (--this.field1325 == 0) {
                                break;
                            }
                            if (this.field1330 >= var3) {
                                return;
                            }
                            this.field1330 = var3 + var3 - 1 - this.field1330;
                            this.field1323 = -this.field1323;
                        } while (--this.field1325 != 0);
                    }
                } else if (this.field1323 < 0) {
                    if (this.field1330 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field1330) / var6;
                    if (var7 < this.field1325) {
                        this.field1330 += var6 * var7;
                        this.field1325 -= var7;
                        return;
                    }
                    this.field1330 += this.field1325 * var6;
                    this.field1325 = 0;
                } else {
                    if (this.field1330 < var4) {
                        return;
                    }
                    int var8 = (this.field1330 - var3) / var6;
                    if (var8 < this.field1325) {
                        this.field1330 -= var6 * var8;
                        this.field1325 -= var8;
                        return;
                    }
                    this.field1330 -= this.field1325 * var6;
                    this.field1325 = 0;
                }
            }
            if (this.field1323 < 0) {
                if (this.field1330 < 0) {
                    this.field1330 = -1;
                    this.method683();
                    this.method1922(-1);
                    return;
                }
            } else if (this.field1330 >= var5) {
                this.field1330 = var5;
                this.method683();
                this.method1922(-1);
            }
        }
    }

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "(I)V")
    private final synchronized void method680(int arg0) {
        this.method688(arg0, this.method701());
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I[B[IIIIIIIILjd;)I")
    private static final int method681(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class89 arg10) {
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
        arg10.field1330 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "([B[IIIIIIILjd;)I")
    private static final int method682(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class89 arg8) {
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
        arg8.field1330 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "()V")
    private final void method683() {
        if (this.field1331 != 0) {
            if (this.field1332 == Integer.MIN_VALUE) {
                this.field1332 = 0;
            }
            this.field1331 = 0;
            this.method693();
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(III)V")
    public final synchronized void method684(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method688(arg1, arg2);
        } else {
            int var4 = method700(arg1, arg2);
            int var5 = method710(arg1, arg2);
            if (this.field1322 == var4 && this.field1320 == var5) {
                this.field1331 = 0;
            } else {
                int var6 = arg1 - this.field1328;
                if (this.field1328 - arg1 > var6) {
                    var6 = this.field1328 - arg1;
                }
                if (var4 - this.field1322 > var6) {
                    var6 = var4 - this.field1322;
                }
                if (this.field1322 - var4 > var6) {
                    var6 = this.field1322 - var4;
                }
                if (var5 - this.field1320 > var6) {
                    var6 = var5 - this.field1320;
                }
                if (this.field1320 - var5 > var6) {
                    var6 = this.field1320 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field1331 = arg0;
                this.field1332 = arg1;
                this.field1329 = arg2;
                this.field1319 = (arg1 - this.field1328) / arg0;
                this.field1321 = (var4 - this.field1322) / arg0;
                this.field1333 = (var5 - this.field1320) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "()I")
    public final int method253() {
        return this.field1332 == 0 && this.field1331 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "(II[B[IIIIIIIILjd;II)I")
    private static final int method685(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class89 arg11, int arg12, int arg13) {
        arg11.field1322 -= arg11.field1321 * arg5;
        arg11.field1320 -= arg11.field1333 * arg5;
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
        arg11.field1322 += arg11.field1321 * arg5;
        arg11.field1320 += arg11.field1333 * arg5;
        arg11.field1328 = arg6;
        arg11.field1330 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "([IIIII)I")
    private final int method686(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field1331 <= 0) {
                if (this.field1323 == 256 && (this.field1330 & 255) == 0) {
                    if (class216.field3439) {
                        return method681(0, ((class15) super.field1408).field169, arg0, this.field1330, arg1, this.field1322, this.field1320, 0, arg3, arg2, this);
                    }
                    return method698(((class15) super.field1408).field169, arg0, this.field1330, arg1, this.field1328, 0, arg3, arg2, this);
                }
                if (class216.field3439) {
                    return method687(0, 0, ((class15) super.field1408).field169, arg0, this.field1330, arg1, this.field1322, this.field1320, 0, arg3, arg2, this, this.field1323, arg4);
                }
                return method696(0, 0, ((class15) super.field1408).field169, arg0, this.field1330, arg1, this.field1328, 0, arg3, arg2, this, this.field1323, arg4);
            }
            int var6 = this.field1331 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field1331 += arg1;
            if (this.field1323 == 256 && (this.field1330 & 255) == 0) {
                if (class216.field3439) {
                    arg1 = method672(0, ((class15) super.field1408).field169, arg0, this.field1330, arg1, this.field1322, this.field1320, this.field1321, this.field1333, 0, var6, arg2, this);
                } else {
                    arg1 = method676(((class15) super.field1408).field169, arg0, this.field1330, arg1, this.field1328, this.field1319, 0, var6, arg2, this);
                }
            } else if (class216.field3439) {
                arg1 = method677(0, 0, ((class15) super.field1408).field169, arg0, this.field1330, arg1, this.field1322, this.field1320, this.field1321, this.field1333, 0, var6, arg2, this, this.field1323, arg4);
            } else {
                arg1 = method685(0, 0, ((class15) super.field1408).field169, arg0, this.field1330, arg1, this.field1328, this.field1319, 0, var6, arg2, this, this.field1323, arg4);
            }
            this.field1331 -= arg1;
            if (this.field1331 != 0) {
                return arg1;
            }
        } while (!this.method690());
        return arg3;
    }

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "(II[B[IIIIIIIILjd;II)I")
    private static final int method687(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class89 arg11, int arg12, int arg13) {
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
        arg11.field1330 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(II)V")
    private final synchronized void method688(int arg0, int arg1) {
        this.field1332 = arg0;
        this.field1329 = arg1;
        this.field1331 = 0;
        this.method693();
    }

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "()Z")
    public final boolean method689() {
        return this.field1331 != 0;
    }

    @OriginalMember(owner = "client!jd", name = "h", descriptor = "()Z")
    private final boolean method690() {
        int var1 = this.field1332;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method700(var1, this.field1329);
            var2 = method710(var1, this.field1329);
        }
        if (this.field1328 == var1 && this.field1322 == var3 && this.field1320 == var2) {
            if (this.field1332 == Integer.MIN_VALUE) {
                this.field1332 = 0;
                this.field1328 = this.field1322 = this.field1320 = 0;
                this.method1922(-1);
                return true;
            } else {
                this.method693();
                return false;
            }
        } else {
            if (this.field1328 < var1) {
                this.field1319 = 1;
                this.field1331 = var1 - this.field1328;
            } else if (this.field1328 > var1) {
                this.field1319 = -1;
                this.field1331 = this.field1328 - var1;
            } else {
                this.field1319 = 0;
            }
            if (this.field1322 < var3) {
                this.field1321 = 1;
                if (this.field1331 == 0 || this.field1331 > var3 - this.field1322) {
                    this.field1331 = var3 - this.field1322;
                }
            } else if (this.field1322 > var3) {
                this.field1321 = -1;
                if (this.field1331 == 0 || this.field1331 > this.field1322 - var3) {
                    this.field1331 = this.field1322 - var3;
                }
            } else {
                this.field1321 = 0;
            }
            if (this.field1320 < var2) {
                this.field1333 = 1;
                if (this.field1331 == 0 || this.field1331 > var2 - this.field1320) {
                    this.field1331 = var2 - this.field1320;
                }
            } else if (this.field1320 > var2) {
                this.field1333 = -1;
                if (this.field1331 == 0 || this.field1331 > this.field1320 - var2) {
                    this.field1331 = this.field1320 - var2;
                }
            } else {
                this.field1333 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!jd", name = "i", descriptor = "()I")
    public final synchronized int method691() {
        return this.field1323 < 0 ? -this.field1323 : this.field1323;
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "([B[IIIIIIIILjd;)I")
    private static final int method692(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class89 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1322 += (var14 - arg3) * arg9.field1321;
        arg9.field1320 += (var14 - arg3) * arg9.field1333;
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
        arg9.field1328 = var12 >> 2;
        arg9.field1330 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!jd", name = "j", descriptor = "()V")
    private final void method693() {
        this.field1328 = this.field1332;
        this.field1322 = method700(this.field1332, this.field1329);
        this.field1320 = method710(this.field1332, this.field1329);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(II[B[IIIIIIILjd;II)I")
    private static final int method694(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class89 arg10, int arg11, int arg12) {
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
        arg10.field1330 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!jd", name = "k", descriptor = "()Z")
    public final boolean method695() {
        return this.field1330 < 0 || this.field1330 >= ((class15) super.field1408).field169.length << 8;
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(II[B[IIIIIIILjd;II)I")
    private static final int method696(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class89 arg10, int arg11, int arg12) {
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
        arg10.field1330 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(I[B[IIIIIIIILjd;)I")
    private static final int method697(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class89 arg10) {
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
        arg10.field1330 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "([B[IIIIIIILjd;)I")
    private static final int method698(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class89 arg8) {
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
        arg8.field1330 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "([IIIII)I")
    private final int method699(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field1331 <= 0) {
                if (this.field1323 == -256 && (this.field1330 & 255) == 0) {
                    if (class216.field3439) {
                        return method697(0, ((class15) super.field1408).field169, arg0, this.field1330, arg1, this.field1322, this.field1320, 0, arg3, arg2, this);
                    }
                    return method682(((class15) super.field1408).field169, arg0, this.field1330, arg1, this.field1328, 0, arg3, arg2, this);
                }
                if (class216.field3439) {
                    return method670(0, 0, ((class15) super.field1408).field169, arg0, this.field1330, arg1, this.field1322, this.field1320, 0, arg3, arg2, this, this.field1323, arg4);
                }
                return method694(0, 0, ((class15) super.field1408).field169, arg0, this.field1330, arg1, this.field1328, 0, arg3, arg2, this, this.field1323, arg4);
            }
            int var6 = this.field1331 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field1331 += arg1;
            if (this.field1323 == -256 && (this.field1330 & 255) == 0) {
                if (class216.field3439) {
                    arg1 = method702(0, ((class15) super.field1408).field169, arg0, this.field1330, arg1, this.field1322, this.field1320, this.field1321, this.field1333, 0, var6, arg2, this);
                } else {
                    arg1 = method692(((class15) super.field1408).field169, arg0, this.field1330, arg1, this.field1328, this.field1319, 0, var6, arg2, this);
                }
            } else if (class216.field3439) {
                arg1 = method674(0, 0, ((class15) super.field1408).field169, arg0, this.field1330, arg1, this.field1322, this.field1320, this.field1321, this.field1333, 0, var6, arg2, this, this.field1323, arg4);
            } else {
                arg1 = method673(0, 0, ((class15) super.field1408).field169, arg0, this.field1330, arg1, this.field1328, this.field1319, 0, var6, arg2, this, this.field1323, arg4);
            }
            this.field1331 -= arg1;
            if (this.field1331 != 0) {
                return arg1;
            }
        } while (!this.method690());
        return arg3;
    }

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "(II)I")
    private static final int method700(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!jd", name = "l", descriptor = "()I")
    public final synchronized int method701() {
        return this.field1329 < 0 ? -1 : this.field1329;
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(I[B[IIIIIIIIIILjd;)I")
    private static final int method702(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class89 arg12) {
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
        arg12.field1328 += (var19 - arg4) * arg12.field1319;
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
        arg12.field1322 = var15 >> 2;
        arg12.field1320 = var16 >> 2;
        arg12.field1330 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lwe;III)Ljd;")
    public static final class89 method703(class15 arg0, int arg1, int arg2, int arg3) {
        return arg0.field169 != null && arg0.field169.length != 0 ? new class89(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "(I)V")
    public final synchronized void method704(int arg0) {
        this.field1325 = arg0;
    }

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "(I)V")
    public final synchronized void method705(int arg0) {
        int var2 = ((class15) super.field1408).field169.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1330 = arg0;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "([III)V")
    public final synchronized void method248(int[] arg0, int arg1, int arg2) {
        if (this.field1332 == 0 && this.field1331 == 0) {
            this.method245(arg2);
        } else {
            class15 var4 = (class15) super.field1408;
            int var5 = this.field1324 << 8;
            int var6 = this.field1326 << 8;
            int var7 = var4.field169.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field1325 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field1330 < 0) {
                if (this.field1323 <= 0) {
                    this.method683();
                    this.method1922(-1);
                    return;
                }
                this.field1330 = 0;
            }
            if (this.field1330 >= var7) {
                if (this.field1323 >= 0) {
                    this.method683();
                    this.method1922(-1);
                    return;
                }
                this.field1330 = var7 - 1;
            }
            if (this.field1325 < 0) {
                if (this.field1327) {
                    if (this.field1323 < 0) {
                        var9 = this.method699(arg0, arg1, var5, var10, var4.field169[this.field1324]);
                        if (this.field1330 >= var5) {
                            return;
                        }
                        this.field1330 = var5 + var5 - 1 - this.field1330;
                        this.field1323 = -this.field1323;
                    }
                    while (true) {
                        int var11 = this.method686(arg0, var9, var6, var10, var4.field169[this.field1326 - 1]);
                        if (this.field1330 < var6) {
                            return;
                        }
                        this.field1330 = var6 + var6 - 1 - this.field1330;
                        this.field1323 = -this.field1323;
                        var9 = this.method699(arg0, var11, var5, var10, var4.field169[this.field1324]);
                        if (this.field1330 >= var5) {
                            return;
                        }
                        this.field1330 = var5 + var5 - 1 - this.field1330;
                        this.field1323 = -this.field1323;
                    }
                } else if (this.field1323 < 0) {
                    while (true) {
                        var9 = this.method699(arg0, var9, var5, var10, var4.field169[this.field1326 - 1]);
                        if (this.field1330 >= var5) {
                            return;
                        }
                        this.field1330 = var6 - 1 - (var6 - 1 - this.field1330) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method686(arg0, var9, var6, var10, var4.field169[this.field1324]);
                        if (this.field1330 < var6) {
                            return;
                        }
                        this.field1330 = (this.field1330 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field1325 > 0) {
                    if (this.field1327) {
                        label130: {
                            if (this.field1323 < 0) {
                                var9 = this.method699(arg0, arg1, var5, var10, var4.field169[this.field1324]);
                                if (this.field1330 >= var5) {
                                    return;
                                }
                                this.field1330 = var5 + var5 - 1 - this.field1330;
                                this.field1323 = -this.field1323;
                                if (--this.field1325 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method686(arg0, var9, var6, var10, var4.field169[this.field1326 - 1]);
                                if (this.field1330 < var6) {
                                    return;
                                }
                                this.field1330 = var6 + var6 - 1 - this.field1330;
                                this.field1323 = -this.field1323;
                                if (--this.field1325 == 0) {
                                    break;
                                }
                                var9 = this.method699(arg0, var9, var5, var10, var4.field169[this.field1324]);
                                if (this.field1330 >= var5) {
                                    return;
                                }
                                this.field1330 = var5 + var5 - 1 - this.field1330;
                                this.field1323 = -this.field1323;
                            } while (--this.field1325 != 0);
                        }
                    } else if (this.field1323 < 0) {
                        while (true) {
                            var9 = this.method699(arg0, var9, var5, var10, var4.field169[this.field1326 - 1]);
                            if (this.field1330 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field1330) / var8;
                            if (var12 >= this.field1325) {
                                this.field1330 += this.field1325 * var8;
                                this.field1325 = 0;
                                break;
                            }
                            this.field1330 += var8 * var12;
                            this.field1325 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method686(arg0, var9, var6, var10, var4.field169[this.field1324]);
                            if (this.field1330 < var6) {
                                return;
                            }
                            int var13 = (this.field1330 - var5) / var8;
                            if (var13 >= this.field1325) {
                                this.field1330 -= this.field1325 * var8;
                                this.field1325 = 0;
                                break;
                            }
                            this.field1330 -= var8 * var13;
                            this.field1325 -= var13;
                        }
                    }
                }
                if (this.field1323 < 0) {
                    this.method699(arg0, var9, 0, var10, 0);
                    if (this.field1330 < 0) {
                        this.field1330 = -1;
                        this.method683();
                        this.method1922(-1);
                        return;
                    }
                } else {
                    this.method686(arg0, var9, var7, var10, 0);
                    if (this.field1330 >= var7) {
                        this.field1330 = var7;
                        this.method683();
                        this.method1922(-1);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "()I")
    public final int method706() {
        int var1 = this.field1328 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1325 == 0) {
            var2 -= this.field1330 * var2 / (((class15) super.field1408).field169.length << 8);
        } else if (this.field1325 >= 0) {
            var2 -= this.field1324 * var2 / ((class15) super.field1408).field169.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!jd", name = "h", descriptor = "(I)V")
    public final synchronized void method707(int arg0) {
        if (this.field1323 < 0) {
            this.field1323 = -arg0;
        } else {
            this.field1323 = arg0;
        }
    }

    @OriginalMember(owner = "client!jd", name = "i", descriptor = "(I)V")
    public final synchronized void method708(int arg0) {
        this.method688(arg0 << 6, this.method701());
    }

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "()Lcf;")
    public final class95 method250() {
        return null;
    }

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(Lwe;II)V")
    private class89(class15 arg0, int arg1, int arg2) {
        super.field1408 = arg0;
        this.field1324 = arg0.field172;
        this.field1326 = arg0.field173;
        this.field1327 = arg0.field171;
        this.field1323 = arg1;
        this.field1332 = arg2;
        this.field1329 = 8192;
        this.field1330 = 0;
        this.method693();
    }

    @OriginalMember(owner = "client!jd", name = "j", descriptor = "(I)V")
    public final synchronized void method709(int arg0) {
        if (arg0 == 0) {
            this.method680(0);
            this.method1922(-1);
        } else if (this.field1322 == 0 && this.field1320 == 0) {
            this.field1331 = 0;
            this.field1332 = 0;
            this.field1328 = 0;
            this.method1922(-1);
        } else {
            int var2 = -this.field1328;
            if (this.field1328 > var2) {
                var2 = this.field1328;
            }
            if (-this.field1322 > var2) {
                var2 = -this.field1322;
            }
            if (this.field1322 > var2) {
                var2 = this.field1322;
            }
            if (-this.field1320 > var2) {
                var2 = -this.field1320;
            }
            if (this.field1320 > var2) {
                var2 = this.field1320;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1331 = arg0;
            this.field1332 = Integer.MIN_VALUE;
            this.field1319 = -this.field1328 / arg0;
            this.field1321 = -this.field1322 / arg0;
            this.field1333 = -this.field1320 / arg0;
        }
    }

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "(II)I")
    private static final int method710(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(Lwe;III)V")
    private class89(class15 arg0, int arg1, int arg2, int arg3) {
        super.field1408 = arg0;
        this.field1324 = arg0.field172;
        this.field1326 = arg0.field173;
        this.field1327 = arg0.field171;
        this.field1323 = arg1;
        this.field1332 = arg2;
        this.field1329 = arg3;
        this.field1330 = 0;
        this.method693();
    }
}
