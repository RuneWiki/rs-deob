import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class72 extends class238 {

    @OriginalMember(owner = "client!ik", name = "w", descriptor = "I")
    private int field1231;

    @OriginalMember(owner = "client!ik", name = "E", descriptor = "I")
    private int field1239;

    @OriginalMember(owner = "client!ik", name = "u", descriptor = "Z")
    private boolean field1229;

    @OriginalMember(owner = "client!ik", name = "G", descriptor = "I")
    private int field1241;

    @OriginalMember(owner = "client!ik", name = "F", descriptor = "I")
    private int field1240;

    @OriginalMember(owner = "client!ik", name = "A", descriptor = "I")
    private int field1235;

    @OriginalMember(owner = "client!ik", name = "C", descriptor = "I")
    private int field1237;

    @OriginalMember(owner = "client!ik", name = "s", descriptor = "I")
    private int field1227;

    @OriginalMember(owner = "client!ik", name = "t", descriptor = "I")
    private int field1228;

    @OriginalMember(owner = "client!ik", name = "v", descriptor = "I")
    private int field1230;

    @OriginalMember(owner = "client!ik", name = "x", descriptor = "I")
    private int field1232;

    @OriginalMember(owner = "client!ik", name = "y", descriptor = "I")
    private int field1233;

    @OriginalMember(owner = "client!ik", name = "z", descriptor = "I")
    private int field1234;

    @OriginalMember(owner = "client!ik", name = "B", descriptor = "I")
    private int field1236;

    @OriginalMember(owner = "client!ik", name = "D", descriptor = "I")
    private int field1238;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "([B[IIIIIIIILik;)I")
    private static final int method487(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class72 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1234 += (var14 - arg3) * arg9.field1233;
        arg9.field1232 += (var14 - arg3) * arg9.field1236;
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
        arg9.field1238 = var12 >> 2;
        arg9.field1237 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "([B[IIIIIIILik;)I")
    private static final int method488(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class72 arg8) {
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
        arg8.field1237 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "()Lck;")
    public final class238 method237() {
        return null;
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "([B[IIIIIIILik;)I")
    private static final int method489(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class72 arg8) {
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
        arg8.field1237 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(I[B[IIIIIIIILik;)I")
    private static final int method490(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class72 arg10) {
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
        arg10.field1237 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "([IIIII)I")
    private final int method491(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field1228 <= 0) {
                if (this.field1241 == 256 && (this.field1237 & 255) == 0) {
                    if (class22.field380) {
                        return method495(0, ((class131) super.field4087).field2356, arg0, this.field1237, arg1, this.field1234, this.field1232, 0, arg3, arg2, this);
                    }
                    return method488(((class131) super.field4087).field2356, arg0, this.field1237, arg1, this.field1238, 0, arg3, arg2, this);
                }
                if (class22.field380) {
                    return method523(0, 0, ((class131) super.field4087).field2356, arg0, this.field1237, arg1, this.field1234, this.field1232, 0, arg3, arg2, this, this.field1241, arg4);
                }
                return method505(0, 0, ((class131) super.field4087).field2356, arg0, this.field1237, arg1, this.field1238, 0, arg3, arg2, this, this.field1241, arg4);
            }
            int var6 = this.field1228 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field1228 += arg1;
            if (this.field1241 == 256 && (this.field1237 & 255) == 0) {
                if (class22.field380) {
                    arg1 = method492(0, ((class131) super.field4087).field2356, arg0, this.field1237, arg1, this.field1234, this.field1232, this.field1233, this.field1236, 0, var6, arg2, this);
                } else {
                    arg1 = method487(((class131) super.field4087).field2356, arg0, this.field1237, arg1, this.field1238, this.field1230, 0, var6, arg2, this);
                }
            } else if (class22.field380) {
                arg1 = method518(0, 0, ((class131) super.field4087).field2356, arg0, this.field1237, arg1, this.field1234, this.field1232, this.field1233, this.field1236, 0, var6, arg2, this, this.field1241, arg4);
            } else {
                arg1 = method506(0, 0, ((class131) super.field4087).field2356, arg0, this.field1237, arg1, this.field1238, this.field1230, 0, var6, arg2, this, this.field1241, arg4);
            }
            this.field1228 -= arg1;
            if (this.field1228 != 0) {
                return arg1;
            }
        } while (!this.method507());
        return arg3;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "()I")
    public final int method224() {
        return this.field1240 == 0 && this.field1228 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(I[B[IIIIIIIIIILik;)I")
    private static final int method492(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class72 arg12) {
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
        arg12.field1238 += (var19 - arg4) * arg12.field1230;
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
        arg12.field1234 = var15 >> 2;
        arg12.field1232 = var16 >> 2;
        arg12.field1237 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(I[B[IIIIIIIIIILik;)I")
    private static final int method493(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class72 arg12) {
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
        arg12.field1238 += (var19 - arg4) * arg12.field1230;
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
        arg12.field1234 = var15 >> 2;
        arg12.field1232 = var16 >> 2;
        arg12.field1237 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!ik", name = "e", descriptor = "()I")
    public final synchronized int method494() {
        return this.field1240 == Integer.MIN_VALUE ? 0 : this.field1240;
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(I[B[IIIIIIIILik;)I")
    private static final int method495(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class72 arg10) {
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
        arg10.field1237 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Lvh;II)Lik;")
    public static final class72 method496(class131 arg0, int arg1, int arg2) {
        return arg0.field2356 != null && arg0.field2356.length != 0 ? new class72(arg0, (int) ((long) arg0.field2354 * 256L * (long) arg1 / (long) (class139.field2490 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!ik", name = "f", descriptor = "()V")
    private final void method497() {
        this.field1238 = this.field1240;
        this.field1234 = method509(this.field1240, this.field1235);
        this.field1232 = method500(this.field1240, this.field1235);
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(II[B[IIIIIIIIIILik;II)I")
    private static final int method498(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class72 arg13, int arg14, int arg15) {
        arg13.field1238 -= arg13.field1230 * arg5;
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
        arg13.field1238 += arg13.field1230 * var22;
        arg13.field1234 = arg6;
        arg13.field1232 = arg7;
        arg13.field1237 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "(I)V")
    private final synchronized void method499(int arg0) {
        this.method508(arg0, this.method522());
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(II)I")
    private static final int method500(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "()I")
    public final int method501() {
        int var1 = this.field1238 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1227 == 0) {
            var2 -= this.field1237 * var2 / (((class131) super.field4087).field2356.length << 8);
        } else if (this.field1227 >= 0) {
            var2 -= this.field1231 * var2 / ((class131) super.field4087).field2356.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "([III)V")
    public final synchronized void method255(int[] arg0, int arg1, int arg2) {
        if (this.field1240 == 0 && this.field1228 == 0) {
            this.method235(arg2);
        } else {
            class131 var4 = (class131) super.field4087;
            int var5 = this.field1231 << 8;
            int var6 = this.field1239 << 8;
            int var7 = var4.field2356.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field1227 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field1237 < 0) {
                if (this.field1241 <= 0) {
                    this.method517();
                    this.method1743((byte) 94);
                    return;
                }
                this.field1237 = 0;
            }
            if (this.field1237 >= var7) {
                if (this.field1241 >= 0) {
                    this.method517();
                    this.method1743((byte) 42);
                    return;
                }
                this.field1237 = var7 - 1;
            }
            if (this.field1227 < 0) {
                if (this.field1229) {
                    if (this.field1241 < 0) {
                        var9 = this.method503(arg0, arg1, var5, var10, var4.field2356[this.field1231]);
                        if (this.field1237 >= var5) {
                            return;
                        }
                        this.field1237 = var5 + var5 - 1 - this.field1237;
                        this.field1241 = -this.field1241;
                    }
                    while (true) {
                        int var11 = this.method491(arg0, var9, var6, var10, var4.field2356[this.field1239 - 1]);
                        if (this.field1237 < var6) {
                            return;
                        }
                        this.field1237 = var6 + var6 - 1 - this.field1237;
                        this.field1241 = -this.field1241;
                        var9 = this.method503(arg0, var11, var5, var10, var4.field2356[this.field1231]);
                        if (this.field1237 >= var5) {
                            return;
                        }
                        this.field1237 = var5 + var5 - 1 - this.field1237;
                        this.field1241 = -this.field1241;
                    }
                } else if (this.field1241 < 0) {
                    while (true) {
                        var9 = this.method503(arg0, var9, var5, var10, var4.field2356[this.field1239 - 1]);
                        if (this.field1237 >= var5) {
                            return;
                        }
                        this.field1237 = var6 - 1 - (var6 - 1 - this.field1237) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method491(arg0, var9, var6, var10, var4.field2356[this.field1231]);
                        if (this.field1237 < var6) {
                            return;
                        }
                        this.field1237 = (this.field1237 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field1227 > 0) {
                    if (this.field1229) {
                        label130: {
                            if (this.field1241 < 0) {
                                var9 = this.method503(arg0, arg1, var5, var10, var4.field2356[this.field1231]);
                                if (this.field1237 >= var5) {
                                    return;
                                }
                                this.field1237 = var5 + var5 - 1 - this.field1237;
                                this.field1241 = -this.field1241;
                                if (--this.field1227 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method491(arg0, var9, var6, var10, var4.field2356[this.field1239 - 1]);
                                if (this.field1237 < var6) {
                                    return;
                                }
                                this.field1237 = var6 + var6 - 1 - this.field1237;
                                this.field1241 = -this.field1241;
                                if (--this.field1227 == 0) {
                                    break;
                                }
                                var9 = this.method503(arg0, var9, var5, var10, var4.field2356[this.field1231]);
                                if (this.field1237 >= var5) {
                                    return;
                                }
                                this.field1237 = var5 + var5 - 1 - this.field1237;
                                this.field1241 = -this.field1241;
                            } while (--this.field1227 != 0);
                        }
                    } else if (this.field1241 < 0) {
                        while (true) {
                            var9 = this.method503(arg0, var9, var5, var10, var4.field2356[this.field1239 - 1]);
                            if (this.field1237 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field1237) / var8;
                            if (var12 >= this.field1227) {
                                this.field1237 += this.field1227 * var8;
                                this.field1227 = 0;
                                break;
                            }
                            this.field1237 += var8 * var12;
                            this.field1227 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method491(arg0, var9, var6, var10, var4.field2356[this.field1231]);
                            if (this.field1237 < var6) {
                                return;
                            }
                            int var13 = (this.field1237 - var5) / var8;
                            if (var13 >= this.field1227) {
                                this.field1237 -= this.field1227 * var8;
                                this.field1227 = 0;
                                break;
                            }
                            this.field1237 -= var8 * var13;
                            this.field1227 -= var13;
                        }
                    }
                }
                if (this.field1241 < 0) {
                    this.method503(arg0, var9, 0, var10, 0);
                    if (this.field1237 < 0) {
                        this.field1237 = -1;
                        this.method517();
                        this.method1743((byte) 32);
                        return;
                    }
                } else {
                    this.method491(arg0, var9, var7, var10, 0);
                    if (this.field1237 >= var7) {
                        this.field1237 = var7;
                        this.method517();
                        this.method1743((byte) 105);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ik", name = "g", descriptor = "()I")
    public final synchronized int method502() {
        return this.field1241 < 0 ? -this.field1241 : this.field1241;
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "([IIIII)I")
    private final int method503(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field1228 <= 0) {
                if (this.field1241 == -256 && (this.field1237 & 255) == 0) {
                    if (class22.field380) {
                        return method490(0, ((class131) super.field4087).field2356, arg0, this.field1237, arg1, this.field1234, this.field1232, 0, arg3, arg2, this);
                    }
                    return method489(((class131) super.field4087).field2356, arg0, this.field1237, arg1, this.field1238, 0, arg3, arg2, this);
                }
                if (class22.field380) {
                    return method512(0, 0, ((class131) super.field4087).field2356, arg0, this.field1237, arg1, this.field1234, this.field1232, 0, arg3, arg2, this, this.field1241, arg4);
                }
                return method511(0, 0, ((class131) super.field4087).field2356, arg0, this.field1237, arg1, this.field1238, 0, arg3, arg2, this, this.field1241, arg4);
            }
            int var6 = this.field1228 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field1228 += arg1;
            if (this.field1241 == -256 && (this.field1237 & 255) == 0) {
                if (class22.field380) {
                    arg1 = method493(0, ((class131) super.field4087).field2356, arg0, this.field1237, arg1, this.field1234, this.field1232, this.field1233, this.field1236, 0, var6, arg2, this);
                } else {
                    arg1 = method526(((class131) super.field4087).field2356, arg0, this.field1237, arg1, this.field1238, this.field1230, 0, var6, arg2, this);
                }
            } else if (class22.field380) {
                arg1 = method498(0, 0, ((class131) super.field4087).field2356, arg0, this.field1237, arg1, this.field1234, this.field1232, this.field1233, this.field1236, 0, var6, arg2, this, this.field1241, arg4);
            } else {
                arg1 = method513(0, 0, ((class131) super.field4087).field2356, arg0, this.field1237, arg1, this.field1238, this.field1230, 0, var6, arg2, this, this.field1241, arg4);
            }
            this.field1228 -= arg1;
            if (this.field1228 != 0) {
                return arg1;
            }
        } while (!this.method507());
        return arg3;
    }

    @OriginalMember(owner = "client!ik", name = "h", descriptor = "()Z")
    public final boolean method504() {
        return this.field1228 != 0;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(II[B[IIIIIIILik;II)I")
    private static final int method505(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class72 arg10, int arg11, int arg12) {
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
        arg10.field1237 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(II[B[IIIIIIIILik;II)I")
    private static final int method506(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class72 arg11, int arg12, int arg13) {
        arg11.field1234 -= arg11.field1233 * arg5;
        arg11.field1232 -= arg11.field1236 * arg5;
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
        arg11.field1234 += arg11.field1233 * arg5;
        arg11.field1232 += arg11.field1236 * arg5;
        arg11.field1238 = arg6;
        arg11.field1237 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ik", name = "i", descriptor = "()Z")
    private final boolean method507() {
        int var1 = this.field1240;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method509(var1, this.field1235);
            var2 = method500(var1, this.field1235);
        }
        if (this.field1238 == var1 && this.field1234 == var3 && this.field1232 == var2) {
            if (this.field1240 == Integer.MIN_VALUE) {
                this.field1240 = 0;
                this.field1238 = this.field1234 = this.field1232 = 0;
                this.method1743((byte) 8);
                return true;
            } else {
                this.method497();
                return false;
            }
        } else {
            if (this.field1238 < var1) {
                this.field1230 = 1;
                this.field1228 = var1 - this.field1238;
            } else if (this.field1238 > var1) {
                this.field1230 = -1;
                this.field1228 = this.field1238 - var1;
            } else {
                this.field1230 = 0;
            }
            if (this.field1234 < var3) {
                this.field1233 = 1;
                if (this.field1228 == 0 || this.field1228 > var3 - this.field1234) {
                    this.field1228 = var3 - this.field1234;
                }
            } else if (this.field1234 > var3) {
                this.field1233 = -1;
                if (this.field1228 == 0 || this.field1228 > this.field1234 - var3) {
                    this.field1228 = this.field1234 - var3;
                }
            } else {
                this.field1233 = 0;
            }
            if (this.field1232 < var2) {
                this.field1236 = 1;
                if (this.field1228 == 0 || this.field1228 > var2 - this.field1232) {
                    this.field1228 = var2 - this.field1232;
                }
            } else if (this.field1232 > var2) {
                this.field1236 = -1;
                if (this.field1228 == 0 || this.field1228 > this.field1232 - var2) {
                    this.field1228 = this.field1232 - var2;
                }
            } else {
                this.field1236 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(II)V")
    private final synchronized void method508(int arg0, int arg1) {
        this.field1240 = arg0;
        this.field1235 = arg1;
        this.field1228 = 0;
        this.method497();
    }

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "(II)I")
    private static final int method509(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(III)V")
    public final synchronized void method510(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method508(arg1, arg2);
        } else {
            int var4 = method509(arg1, arg2);
            int var5 = method500(arg1, arg2);
            if (this.field1234 == var4 && this.field1232 == var5) {
                this.field1228 = 0;
            } else {
                int var6 = arg1 - this.field1238;
                if (this.field1238 - arg1 > var6) {
                    var6 = this.field1238 - arg1;
                }
                if (var4 - this.field1234 > var6) {
                    var6 = var4 - this.field1234;
                }
                if (this.field1234 - var4 > var6) {
                    var6 = this.field1234 - var4;
                }
                if (var5 - this.field1232 > var6) {
                    var6 = var5 - this.field1232;
                }
                if (this.field1232 - var5 > var6) {
                    var6 = this.field1232 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field1228 = arg0;
                this.field1240 = arg1;
                this.field1235 = arg2;
                this.field1230 = (arg1 - this.field1238) / arg0;
                this.field1233 = (var4 - this.field1234) / arg0;
                this.field1236 = (var5 - this.field1232) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(II[B[IIIIIIILik;II)I")
    private static final int method511(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class72 arg10, int arg11, int arg12) {
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
        arg10.field1237 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "()Lck;")
    public final class238 method225() {
        return null;
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(II[B[IIIIIIIILik;II)I")
    private static final int method512(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class72 arg11, int arg12, int arg13) {
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
        arg11.field1237 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "(II[B[IIIIIIIILik;II)I")
    private static final int method513(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class72 arg11, int arg12, int arg13) {
        arg11.field1234 -= arg11.field1233 * arg5;
        arg11.field1232 -= arg11.field1236 * arg5;
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
        arg11.field1234 += arg11.field1233 * arg5;
        arg11.field1232 += arg11.field1236 * arg5;
        arg11.field1238 = arg6;
        arg11.field1237 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ik", name = "j", descriptor = "()Z")
    public final boolean method514() {
        return this.field1237 < 0 || this.field1237 >= ((class131) super.field4087).field2356.length << 8;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Lvh;III)Lik;")
    public static final class72 method515(class131 arg0, int arg1, int arg2, int arg3) {
        return arg0.field2356 != null && arg0.field2356.length != 0 ? new class72(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "(I)V")
    public final synchronized void method516(int arg0) {
        if (this.field1241 < 0) {
            this.field1241 = -arg0;
        } else {
            this.field1241 = arg0;
        }
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(I)V")
    public final synchronized void method235(int arg0) {
        if (this.field1228 > 0) {
            if (arg0 >= this.field1228) {
                if (this.field1240 == Integer.MIN_VALUE) {
                    this.field1240 = 0;
                    this.field1238 = this.field1234 = this.field1232 = 0;
                    this.method1743((byte) 119);
                    arg0 = this.field1228;
                }
                this.field1228 = 0;
                this.method497();
            } else {
                this.field1238 += this.field1230 * arg0;
                this.field1234 += this.field1233 * arg0;
                this.field1232 += this.field1236 * arg0;
                this.field1228 -= arg0;
            }
        }
        class131 var2 = (class131) super.field4087;
        int var3 = this.field1231 << 8;
        int var4 = this.field1239 << 8;
        int var5 = var2.field2356.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1227 = 0;
        }
        if (this.field1237 < 0) {
            if (this.field1241 <= 0) {
                this.method517();
                this.method1743((byte) 127);
                return;
            }
            this.field1237 = 0;
        }
        if (this.field1237 >= var5) {
            if (this.field1241 >= 0) {
                this.method517();
                this.method1743((byte) 119);
                return;
            }
            this.field1237 = var5 - 1;
        }
        this.field1237 += this.field1241 * arg0;
        if (this.field1227 < 0) {
            if (!this.field1229) {
                if (this.field1241 < 0) {
                    if (this.field1237 < var3) {
                        this.field1237 = var4 - 1 - (var4 - 1 - this.field1237) % var6;
                    }
                } else if (this.field1237 >= var4) {
                    this.field1237 = (this.field1237 - var3) % var6 + var3;
                }
            } else {
                if (this.field1241 < 0) {
                    if (this.field1237 >= var3) {
                        return;
                    }
                    this.field1237 = var3 + var3 - 1 - this.field1237;
                    this.field1241 = -this.field1241;
                }
                while (this.field1237 >= var4) {
                    this.field1237 = var4 + var4 - 1 - this.field1237;
                    this.field1241 = -this.field1241;
                    if (this.field1237 >= var3) {
                        return;
                    }
                    this.field1237 = var3 + var3 - 1 - this.field1237;
                    this.field1241 = -this.field1241;
                }
            }
        } else {
            if (this.field1227 > 0) {
                if (this.field1229) {
                    label125: {
                        if (this.field1241 < 0) {
                            if (this.field1237 >= var3) {
                                return;
                            }
                            this.field1237 = var3 + var3 - 1 - this.field1237;
                            this.field1241 = -this.field1241;
                            if (--this.field1227 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field1237 < var4) {
                                return;
                            }
                            this.field1237 = var4 + var4 - 1 - this.field1237;
                            this.field1241 = -this.field1241;
                            if (--this.field1227 == 0) {
                                break;
                            }
                            if (this.field1237 >= var3) {
                                return;
                            }
                            this.field1237 = var3 + var3 - 1 - this.field1237;
                            this.field1241 = -this.field1241;
                        } while (--this.field1227 != 0);
                    }
                } else if (this.field1241 < 0) {
                    if (this.field1237 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field1237) / var6;
                    if (var7 < this.field1227) {
                        this.field1237 += var6 * var7;
                        this.field1227 -= var7;
                        return;
                    }
                    this.field1237 += this.field1227 * var6;
                    this.field1227 = 0;
                } else {
                    if (this.field1237 < var4) {
                        return;
                    }
                    int var8 = (this.field1237 - var3) / var6;
                    if (var8 < this.field1227) {
                        this.field1237 -= var6 * var8;
                        this.field1227 -= var8;
                        return;
                    }
                    this.field1237 -= this.field1227 * var6;
                    this.field1227 = 0;
                }
            }
            if (this.field1241 < 0) {
                if (this.field1237 < 0) {
                    this.field1237 = -1;
                    this.method517();
                    this.method1743((byte) 56);
                    return;
                }
            } else if (this.field1237 >= var5) {
                this.field1237 = var5;
                this.method517();
                this.method1743((byte) 102);
            }
        }
    }

    @OriginalMember(owner = "client!ik", name = "k", descriptor = "()V")
    private final void method517() {
        if (this.field1228 != 0) {
            if (this.field1240 == Integer.MIN_VALUE) {
                this.field1240 = 0;
            }
            this.field1228 = 0;
            this.method497();
        }
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(II[B[IIIIIIIIIILik;II)I")
    private static final int method518(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class72 arg13, int arg14, int arg15) {
        arg13.field1238 -= arg13.field1230 * arg5;
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
        arg13.field1238 += arg13.field1230 * var22;
        arg13.field1234 = arg6;
        arg13.field1232 = arg7;
        arg13.field1237 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(Z)V")
    public final synchronized void method519(boolean arg0) {
        this.field1241 = (this.field1241 >>> 31) + (this.field1241 ^ this.field1241 >> 31);
        if (arg0) {
            this.field1241 = -this.field1241;
        }
    }

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "(II)V")
    public final synchronized void method520(int arg0, int arg1) {
        this.method510(arg0, arg1, this.method522());
    }

    @OriginalMember(owner = "client!ik", name = "e", descriptor = "(I)V")
    public final synchronized void method521(int arg0) {
        this.method508(arg0 << 6, this.method522());
    }

    @OriginalMember(owner = "client!ik", name = "l", descriptor = "()I")
    public final synchronized int method522() {
        return this.field1235 < 0 ? -1 : this.field1235;
    }

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "(II[B[IIIIIIIILik;II)I")
    private static final int method523(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class72 arg11, int arg12, int arg13) {
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
        arg11.field1237 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!ik", name = "f", descriptor = "(I)V")
    public final synchronized void method524(int arg0) {
        int var2 = ((class131) super.field4087).field2356.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1237 = arg0;
    }

    @OriginalMember(owner = "client!ik", name = "g", descriptor = "(I)V")
    public final synchronized void method525(int arg0) {
        if (arg0 == 0) {
            this.method499(0);
            this.method1743((byte) 86);
        } else if (this.field1234 == 0 && this.field1232 == 0) {
            this.field1228 = 0;
            this.field1240 = 0;
            this.field1238 = 0;
            this.method1743((byte) 88);
        } else {
            int var2 = -this.field1238;
            if (this.field1238 > var2) {
                var2 = this.field1238;
            }
            if (-this.field1234 > var2) {
                var2 = -this.field1234;
            }
            if (this.field1234 > var2) {
                var2 = this.field1234;
            }
            if (-this.field1232 > var2) {
                var2 = -this.field1232;
            }
            if (this.field1232 > var2) {
                var2 = this.field1232;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1228 = arg0;
            this.field1240 = Integer.MIN_VALUE;
            this.field1230 = -this.field1238 / arg0;
            this.field1233 = -this.field1234 / arg0;
            this.field1236 = -this.field1232 / arg0;
        }
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "([B[IIIIIIIILik;)I")
    private static final int method526(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class72 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1234 += (var14 - arg3) * arg9.field1233;
        arg9.field1232 += (var14 - arg3) * arg9.field1236;
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
        arg9.field1238 = var12 >> 2;
        arg9.field1237 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ik", name = "h", descriptor = "(I)V")
    public final synchronized void method527(int arg0) {
        this.field1227 = arg0;
    }

    @OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(Lvh;II)V")
    private class72(class131 arg0, int arg1, int arg2) {
        super.field4087 = arg0;
        this.field1231 = arg0.field2357;
        this.field1239 = arg0.field2358;
        this.field1229 = arg0.field2355;
        this.field1241 = arg1;
        this.field1240 = arg2;
        this.field1235 = 8192;
        this.field1237 = 0;
        this.method497();
    }

    @OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(Lvh;III)V")
    private class72(class131 arg0, int arg1, int arg2, int arg3) {
        super.field4087 = arg0;
        this.field1231 = arg0.field2357;
        this.field1239 = arg0.field2358;
        this.field1229 = arg0.field2355;
        this.field1241 = arg1;
        this.field1240 = arg2;
        this.field1235 = arg3;
        this.field1237 = 0;
        this.method497();
    }
}
