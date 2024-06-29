import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class17 extends class177 {

    @OriginalMember(owner = "client!ud", name = "q", descriptor = "I")
    private int field267;

    @OriginalMember(owner = "client!ud", name = "w", descriptor = "I")
    private int field273;

    @OriginalMember(owner = "client!ud", name = "D", descriptor = "Z")
    private boolean field280;

    @OriginalMember(owner = "client!ud", name = "p", descriptor = "I")
    private int field266;

    @OriginalMember(owner = "client!ud", name = "z", descriptor = "I")
    private int field276;

    @OriginalMember(owner = "client!ud", name = "A", descriptor = "I")
    private int field277;

    @OriginalMember(owner = "client!ud", name = "v", descriptor = "I")
    private int field272;

    @OriginalMember(owner = "client!ud", name = "r", descriptor = "I")
    private int field268;

    @OriginalMember(owner = "client!ud", name = "s", descriptor = "I")
    private int field269;

    @OriginalMember(owner = "client!ud", name = "t", descriptor = "I")
    private int field270;

    @OriginalMember(owner = "client!ud", name = "u", descriptor = "I")
    private int field271;

    @OriginalMember(owner = "client!ud", name = "x", descriptor = "I")
    private int field274;

    @OriginalMember(owner = "client!ud", name = "y", descriptor = "I")
    private int field275;

    @OriginalMember(owner = "client!ud", name = "B", descriptor = "I")
    private int field278;

    @OriginalMember(owner = "client!ud", name = "C", descriptor = "I")
    private int field279;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I[B[IIIIIIIIIILud;)I", line = 3)
    private static final int method149(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class17 arg12) {
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
        arg12.field278 += (var19 - arg4) * arg12.field274;
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
        arg12.field271 = var15 >> 2;
        arg12.field279 = var16 >> 2;
        arg12.field272 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(II[B[IIIIIIILud;II)I", line = 56)
    private static final int method150(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class17 arg10, int arg11, int arg12) {
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
        arg10.field272 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "()Z", line = 83)
    private final boolean method151() {
        int var1 = this.field276;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method163(var1, this.field277);
            var2 = method164(var1, this.field277);
        }
        if (this.field278 != var1 || this.field271 != var3 || this.field279 != var2) {
            if (this.field278 < var1) {
                this.field274 = 1;
                this.field268 = var1 - this.field278;
            } else if (this.field278 > var1) {
                this.field274 = -1;
                this.field268 = this.field278 - var1;
            } else {
                this.field274 = 0;
            }
            if (this.field271 < var3) {
                this.field275 = 1;
                if (this.field268 == 0 || this.field268 > var3 - this.field271) {
                    this.field268 = var3 - this.field271;
                }
            } else if (this.field271 > var3) {
                this.field275 = -1;
                if (this.field268 == 0 || this.field268 > this.field271 - var3) {
                    this.field268 = this.field271 - var3;
                }
            } else {
                this.field275 = 0;
            }
            if (this.field279 < var2) {
                this.field269 = 1;
                if (this.field268 == 0 || this.field268 > var2 - this.field279) {
                    this.field268 = var2 - this.field279;
                }
            } else if (this.field279 > var2) {
                this.field269 = -1;
                if (this.field268 == 0 || this.field268 > this.field279 - var2) {
                    this.field268 = this.field279 - var2;
                }
            } else {
                this.field269 = 0;
            }
            return false;
        } else if (this.field276 == Integer.MIN_VALUE) {
            this.field276 = 0;
            this.field278 = this.field271 = this.field279 = 0;
            this.method2028(13329);
            return true;
        } else {
            this.method169();
            return false;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(II[B[IIIIIIIILud;II)I", line = 168)
    private static final int method152(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class17 arg11, int arg12, int arg13) {
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
        arg11.field272 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "()I", line = 202)
    public final int method153() {
        return this.field276 == 0 && this.field268 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "(I)V", line = 213)
    public final synchronized void method154(int arg0) {
        this.method172(arg0 << 6, this.method165());
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Z)V", line = 216)
    public final synchronized void method155(boolean arg0) {
        this.field266 = (this.field266 >>> 31) + (this.field266 ^ this.field266 >> 31);
        if (arg0) {
            this.field266 = -this.field266;
        }
    }

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "(I)V", line = 223)
    public final synchronized void method156(int arg0) {
        int var2 = ((class266) this.field2897).field4153.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field272 = arg0;
    }

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "(I)V", line = 235)
    public final synchronized void method157(int arg0) {
        if (this.field268 > 0) {
            if (arg0 >= this.field268) {
                if (this.field276 == Integer.MIN_VALUE) {
                    this.field276 = 0;
                    this.field278 = this.field271 = this.field279 = 0;
                    this.method2028(13329);
                    arg0 = this.field268;
                }
                this.field268 = 0;
                this.method169();
            } else {
                this.field278 += this.field274 * arg0;
                this.field271 += this.field275 * arg0;
                this.field279 += this.field269 * arg0;
                this.field268 -= arg0;
            }
        }
        class266 var2 = (class266) this.field2897;
        int var3 = this.field267 << 8;
        int var4 = this.field273 << 8;
        int var5 = var2.field4153.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field270 = 0;
        }
        if (this.field272 < 0) {
            if (this.field266 <= 0) {
                this.method170();
                this.method2028(13329);
                return;
            }
            this.field272 = 0;
        }
        if (this.field272 >= var5) {
            if (this.field266 >= 0) {
                this.method170();
                this.method2028(13329);
                return;
            }
            this.field272 = var5 - 1;
        }
        this.field272 += this.field266 * arg0;
        if (this.field270 >= 0) {
            if (this.field270 > 0) {
                if (this.field280) {
                    label121: {
                        if (this.field266 < 0) {
                            if (this.field272 >= var3) {
                                return;
                            }
                            this.field272 = var3 + var3 - this.field272 - 1;
                            this.field266 = -this.field266;
                            if (--this.field270 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field272 < var4) {
                                return;
                            }
                            this.field272 = var4 + var4 - this.field272 - 1;
                            this.field266 = -this.field266;
                            if (--this.field270 == 0) {
                                break;
                            }
                            if (this.field272 >= var3) {
                                return;
                            }
                            this.field272 = var3 + var3 - this.field272 - 1;
                            this.field266 = -this.field266;
                        } while (--this.field270 != 0);
                    }
                } else {
                    label153: {
                        if (this.field266 < 0) {
                            if (this.field272 >= var3) {
                                return;
                            }
                            int var7 = (var4 - this.field272 - 1) / var6;
                            if (var7 >= this.field270) {
                                this.field272 += this.field270 * var6;
                                this.field270 = 0;
                                break label153;
                            }
                            this.field272 += var6 * var7;
                            this.field270 -= var7;
                        } else if (this.field272 >= var4) {
                            int var8 = (this.field272 - var3) / var6;
                            if (var8 >= this.field270) {
                                this.field272 -= this.field270 * var6;
                                this.field270 = 0;
                                break label153;
                            }
                            this.field272 -= var6 * var8;
                            this.field270 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field266 < 0) {
                if (this.field272 < 0) {
                    this.field272 = -1;
                    this.method170();
                    this.method2028(13329);
                }
            } else if (this.field272 >= var5) {
                this.field272 = var5;
                this.method170();
                this.method2028(13329);
            }
        } else if (this.field280) {
            if (this.field266 < 0) {
                if (this.field272 >= var3) {
                    return;
                }
                this.field272 = var3 + var3 - this.field272 - 1;
                this.field266 = -this.field266;
            }
            while (this.field272 >= var4) {
                this.field272 = var4 + var4 - this.field272 - 1;
                this.field266 = -this.field266;
                if (this.field272 >= var3) {
                    return;
                }
                this.field272 = var3 + var3 - this.field272 - 1;
                this.field266 = -this.field266;
            }
        } else if (this.field266 < 0) {
            if (this.field272 >= var3) {
                return;
            }
            this.field272 = var4 - (var4 - 1 - this.field272) % var6 - 1;
        } else if (this.field272 >= var4) {
            this.field272 = (this.field272 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(II[B[IIIIIIIIIILud;II)I", line = 454)
    private static final int method158(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class17 arg13, int arg14, int arg15) {
        arg13.field278 -= arg13.field274 * arg5;
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
        arg13.field278 += arg13.field274 * var26;
        arg13.field271 = arg6;
        arg13.field279 = arg7;
        arg13.field272 = arg4;
        return var26;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lid;III)Lud;", line = 497)
    public static final class17 method159(class266 arg0, int arg1, int arg2, int arg3) {
        return arg0.field4153 == null || arg0.field4153.length == 0 ? null : new class17(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I[B[IIIIIIIILud;)I", line = 505)
    private static final int method160(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class17 arg10) {
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
        arg10.field272 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(II)V", line = 546)
    public final synchronized void method161(int arg0, int arg1) {
        this.method192(arg0, arg1, this.method165());
    }

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "()Z", line = 549)
    public final boolean method162() {
        return this.field268 != 0;
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(II)I", line = 552)
    private static final int method163(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "(II)I", line = 555)
    private static final int method164(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "()I", line = 558)
    public final synchronized int method165() {
        return this.field277 < 0 ? -1 : this.field277;
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(II[B[IIIIIIIILud;II)I", line = 561)
    private static final int method166(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class17 arg11, int arg12, int arg13) {
        arg11.field271 -= arg11.field275 * arg5;
        arg11.field279 -= arg11.field269 * arg5;
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
        arg11.field271 += arg11.field275 * arg5;
        arg11.field279 += arg11.field269 * arg5;
        arg11.field278 = arg6;
        arg11.field272 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "([B[IIIIIIILud;)I", line = 597)
    private static final int method167(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class17 arg8) {
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
        arg8.field272 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(II[B[IIIIIIILud;II)I", line = 622)
    private static final int method168(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class17 arg10, int arg11, int arg12) {
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
        arg10.field272 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ud", name = "h", descriptor = "()V", line = 648)
    private final void method169() {
        this.field278 = this.field276;
        this.field271 = method163(this.field276, this.field277);
        this.field279 = method164(this.field276, this.field277);
    }

    @OriginalMember(owner = "client!ud", name = "i", descriptor = "()V", line = 653)
    private final void method170() {
        if (this.field268 == 0) {
            return;
        }
        if (this.field276 == Integer.MIN_VALUE) {
            this.field276 = 0;
        }
        this.field268 = 0;
        this.method169();
    }

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "(I)V", line = 664)
    private final synchronized void method171(int arg0) {
        this.method172(arg0, this.method165());
    }

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "(II)V", line = 669)
    private final synchronized void method172(int arg0, int arg1) {
        this.field276 = arg0;
        this.field277 = arg1;
        this.field268 = 0;
        this.method169();
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "([B[IIIIIIIILud;)I", line = 675)
    private static final int method173(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class17 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field271 += (var14 - arg3) * arg9.field275;
        arg9.field279 += (var14 - arg3) * arg9.field269;
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
        arg9.field278 = var12 >> 2;
        arg9.field272 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "(II[B[IIIIIIIILud;II)I", line = 709)
    private static final int method174(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class17 arg11, int arg12, int arg13) {
        arg11.field271 -= arg11.field275 * arg5;
        arg11.field279 -= arg11.field269 * arg5;
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
        arg11.field271 += arg11.field275 * arg5;
        arg11.field279 += arg11.field269 * arg5;
        arg11.field278 = arg6;
        arg11.field272 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "()I", line = 744)
    public final int method175() {
        int var1 = this.field278 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field270 == 0) {
            var2 -= this.field272 * var2 / (((class266) this.field2897).field4153.length << 8);
        } else if (this.field270 >= 0) {
            var2 -= this.field267 * var2 / ((class266) this.field2897).field4153.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(I[B[IIIIIIIIIILud;)I", line = 756)
    private static final int method176(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class17 arg12) {
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
        arg12.field278 += (var19 - arg4) * arg12.field274;
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
        arg12.field271 = var15 >> 2;
        arg12.field279 = var16 >> 2;
        arg12.field272 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!ud", name = "j", descriptor = "()I", line = 809)
    public final synchronized int method177() {
        return this.field266 < 0 ? -this.field266 : this.field266;
    }

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "()Ltb;", line = 814)
    public final class177 method178() {
        return null;
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "([III)V", line = 817)
    public final synchronized void method179(int[] arg0, int arg1, int arg2) {
        if (this.field276 == 0 && this.field268 == 0) {
            this.method157(arg2);
            return;
        }
        class266 var4 = (class266) this.field2897;
        int var5 = this.field267 << 8;
        int var6 = this.field273 << 8;
        int var7 = var4.field4153.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field270 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field272 < 0) {
            if (this.field266 <= 0) {
                this.method170();
                this.method2028(13329);
                return;
            }
            this.field272 = 0;
        }
        if (this.field272 >= var7) {
            if (this.field266 >= 0) {
                this.method170();
                this.method2028(13329);
                return;
            }
            this.field272 = var7 - 1;
        }
        if (this.field270 >= 0) {
            if (this.field270 > 0) {
                if (this.field280) {
                    label131: {
                        if (this.field266 < 0) {
                            var9 = this.method189(arg0, arg1, var5, var10, var4.field4153[this.field267]);
                            if (this.field272 >= var5) {
                                return;
                            }
                            this.field272 = var5 + var5 - this.field272 - 1;
                            this.field266 = -this.field266;
                            if (--this.field270 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method188(arg0, var9, var6, var10, var4.field4153[this.field273 - 1]);
                            if (this.field272 < var6) {
                                return;
                            }
                            this.field272 = var6 + var6 - this.field272 - 1;
                            this.field266 = -this.field266;
                            if (--this.field270 == 0) {
                                break;
                            }
                            var9 = this.method189(arg0, var9, var5, var10, var4.field4153[this.field267]);
                            if (this.field272 >= var5) {
                                return;
                            }
                            this.field272 = var5 + var5 - this.field272 - 1;
                            this.field266 = -this.field266;
                        } while (--this.field270 != 0);
                    }
                } else if (this.field266 < 0) {
                    while (true) {
                        var9 = this.method189(arg0, var9, var5, var10, var4.field4153[this.field273 - 1]);
                        if (this.field272 >= var5) {
                            return;
                        }
                        int var12 = (var6 - this.field272 - 1) / var8;
                        if (var12 >= this.field270) {
                            this.field272 += this.field270 * var8;
                            this.field270 = 0;
                            break;
                        }
                        this.field272 += var8 * var12;
                        this.field270 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method188(arg0, var9, var6, var10, var4.field4153[this.field267]);
                        if (this.field272 < var6) {
                            return;
                        }
                        int var13 = (this.field272 - var5) / var8;
                        if (var13 >= this.field270) {
                            this.field272 -= this.field270 * var8;
                            this.field270 = 0;
                            break;
                        }
                        this.field272 -= var8 * var13;
                        this.field270 -= var13;
                    }
                }
            }
            if (this.field266 < 0) {
                this.method189(arg0, var9, 0, var10, 0);
                if (this.field272 < 0) {
                    this.field272 = -1;
                    this.method170();
                    this.method2028(13329);
                }
            } else {
                this.method188(arg0, var9, var7, var10, 0);
                if (this.field272 >= var7) {
                    this.field272 = var7;
                    this.method170();
                    this.method2028(13329);
                }
            }
        } else if (this.field280) {
            if (this.field266 < 0) {
                var9 = this.method189(arg0, arg1, var5, var10, var4.field4153[this.field267]);
                if (this.field272 >= var5) {
                    return;
                }
                this.field272 = var5 + var5 - this.field272 - 1;
                this.field266 = -this.field266;
            }
            while (true) {
                int var11 = this.method188(arg0, var9, var6, var10, var4.field4153[this.field273 - 1]);
                if (this.field272 < var6) {
                    return;
                }
                this.field272 = var6 + var6 - this.field272 - 1;
                this.field266 = -this.field266;
                var9 = this.method189(arg0, var11, var5, var10, var4.field4153[this.field267]);
                if (this.field272 >= var5) {
                    return;
                }
                this.field272 = var5 + var5 - this.field272 - 1;
                this.field266 = -this.field266;
            }
        } else if (this.field266 < 0) {
            while (true) {
                var9 = this.method189(arg0, var9, var5, var10, var4.field4153[this.field273 - 1]);
                if (this.field272 >= var5) {
                    return;
                }
                this.field272 = var6 - (var6 - 1 - this.field272) % var8 - 1;
            }
        } else {
            while (true) {
                var9 = this.method188(arg0, var9, var6, var10, var4.field4153[this.field267]);
                if (this.field272 < var6) {
                    return;
                }
                this.field272 = (this.field272 - var5) % var8 + var5;
            }
        }
    }

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "(I)V", line = 1053)
    public final synchronized void method180(int arg0) {
        if (this.field266 < 0) {
            this.field266 = -arg0;
        } else {
            this.field266 = arg0;
        }
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(II[B[IIIIIIIIIILud;II)I", line = 1062)
    private static final int method181(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class17 arg13, int arg14, int arg15) {
        arg13.field278 -= arg13.field274 * arg5;
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
        arg13.field278 += arg13.field274 * var27;
        arg13.field271 = arg6;
        arg13.field279 = arg7;
        arg13.field272 = arg4;
        return var27;
    }

    @OriginalMember(owner = "client!ud", name = "k", descriptor = "()I", line = 1104)
    public final synchronized int method182() {
        return this.field276 == Integer.MIN_VALUE ? 0 : this.field276;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lid;II)Lud;", line = 1107)
    public static final class17 method183(class266 arg0, int arg1, int arg2) {
        return arg0.field4153 == null || arg0.field4153.length == 0 ? null : new class17(arg0, (int) ((long) arg0.field4150 * 256L * (long) arg1 / (long) (class318.field5024 * 100)), arg2 << 6);
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(I[B[IIIIIIIILud;)I", line = 1114)
    private static final int method184(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class17 arg10) {
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
        arg10.field272 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!ud", name = "h", descriptor = "(I)V", line = 1152)
    public final synchronized void method185(int arg0) {
        this.field270 = arg0;
    }

    @OriginalMember(owner = "client!ud", name = "l", descriptor = "()Z", line = 1155)
    public final boolean method186() {
        return this.field272 < 0 || this.field272 >= ((class266) this.field2897).field4153.length << 8;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "()Ltb;", line = 1158)
    public final class177 method187() {
        return null;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "([IIIII)I", line = 1162)
    private final int method188(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field268 > 0) {
                int var6 = this.field268 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field268 += arg1;
                if (this.field266 == 256 && (this.field272 & 0xFF) == 0) {
                    if (class157.field2427) {
                        arg1 = method149(0, ((class266) this.field2897).field4153, arg0, this.field272, arg1, this.field271, this.field279, this.field275, this.field269, 0, var6, arg2, this);
                    } else {
                        arg1 = method173(((class266) this.field2897).field4153, arg0, this.field272, arg1, this.field278, this.field274, 0, var6, arg2, this);
                    }
                } else if (class157.field2427) {
                    arg1 = method181(0, 0, ((class266) this.field2897).field4153, arg0, this.field272, arg1, this.field271, this.field279, this.field275, this.field269, 0, var6, arg2, this, this.field266, arg4);
                } else {
                    arg1 = method174(0, 0, ((class266) this.field2897).field4153, arg0, this.field272, arg1, this.field278, this.field274, 0, var6, arg2, this, this.field266, arg4);
                }
                this.field268 -= arg1;
                if (this.field268 != 0) {
                    return arg1;
                }
                if (!this.method151()) {
                    continue;
                }
                return arg3;
            }
            if (this.field266 == 256 && (this.field272 & 0xFF) == 0) {
                if (class157.field2427) {
                    return method184(0, ((class266) this.field2897).field4153, arg0, this.field272, arg1, this.field271, this.field279, 0, arg3, arg2, this);
                }
                return method167(((class266) this.field2897).field4153, arg0, this.field272, arg1, this.field278, 0, arg3, arg2, this);
            }
            if (class157.field2427) {
                return method152(0, 0, ((class266) this.field2897).field4153, arg0, this.field272, arg1, this.field271, this.field279, 0, arg3, arg2, this, this.field266, arg4);
            }
            return method168(0, 0, ((class266) this.field2897).field4153, arg0, this.field272, arg1, this.field278, 0, arg3, arg2, this, this.field266, arg4);
        }
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "([IIIII)I", line = 1218)
    private final int method189(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field268 > 0) {
                int var6 = this.field268 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field268 += arg1;
                if (this.field266 == -256 && (this.field272 & 0xFF) == 0) {
                    if (class157.field2427) {
                        arg1 = method176(0, ((class266) this.field2897).field4153, arg0, this.field272, arg1, this.field271, this.field279, this.field275, this.field269, 0, var6, arg2, this);
                    } else {
                        arg1 = method193(((class266) this.field2897).field4153, arg0, this.field272, arg1, this.field278, this.field274, 0, var6, arg2, this);
                    }
                } else if (class157.field2427) {
                    arg1 = method158(0, 0, ((class266) this.field2897).field4153, arg0, this.field272, arg1, this.field271, this.field279, this.field275, this.field269, 0, var6, arg2, this, this.field266, arg4);
                } else {
                    arg1 = method166(0, 0, ((class266) this.field2897).field4153, arg0, this.field272, arg1, this.field278, this.field274, 0, var6, arg2, this, this.field266, arg4);
                }
                this.field268 -= arg1;
                if (this.field268 != 0) {
                    return arg1;
                }
                if (!this.method151()) {
                    continue;
                }
                return arg3;
            }
            if (this.field266 == -256 && (this.field272 & 0xFF) == 0) {
                if (class157.field2427) {
                    return method160(0, ((class266) this.field2897).field4153, arg0, this.field272, arg1, this.field271, this.field279, 0, arg3, arg2, this);
                }
                return method191(((class266) this.field2897).field4153, arg0, this.field272, arg1, this.field278, 0, arg3, arg2, this);
            }
            if (class157.field2427) {
                return method190(0, 0, ((class266) this.field2897).field4153, arg0, this.field272, arg1, this.field271, this.field279, 0, arg3, arg2, this, this.field266, arg4);
            }
            return method150(0, 0, ((class266) this.field2897).field4153, arg0, this.field272, arg1, this.field278, 0, arg3, arg2, this, this.field266, arg4);
        }
    }

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "(II[B[IIIIIIIILud;II)I", line = 1273)
    private static final int method190(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class17 arg11, int arg12, int arg13) {
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
        arg11.field272 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "([B[IIIIIIILud;)I", line = 1306)
    private static final int method191(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class17 arg8) {
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
        arg8.field272 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Lid;II)V", line = 1330)
    private class17(class266 arg0, int arg1, int arg2) {
        this.field2897 = arg0;
        this.field267 = arg0.field4149;
        this.field273 = arg0.field4151;
        this.field280 = arg0.field4152;
        this.field266 = arg1;
        this.field276 = arg2;
        this.field277 = 8192;
        this.field272 = 0;
        this.method169();
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(III)V", line = 1343)
    public final synchronized void method192(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method172(arg1, arg2);
            return;
        }
        int var4 = method163(arg1, arg2);
        int var5 = method164(arg1, arg2);
        if (this.field271 == var4 && this.field279 == var5) {
            this.field268 = 0;
            return;
        }
        int var6 = arg1 - this.field278;
        if (this.field278 - arg1 > var6) {
            var6 = this.field278 - arg1;
        }
        if (var4 - this.field271 > var6) {
            var6 = var4 - this.field271;
        }
        if (this.field271 - var4 > var6) {
            var6 = this.field271 - var4;
        }
        if (var5 - this.field279 > var6) {
            var6 = var5 - this.field279;
        }
        if (this.field279 - var5 > var6) {
            var6 = this.field279 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field268 = arg0;
        this.field276 = arg1;
        this.field277 = arg2;
        this.field274 = (arg1 - this.field278) / arg0;
        this.field275 = (var4 - this.field271) / arg0;
        this.field269 = (var5 - this.field279) / arg0;
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Lid;III)V", line = 1389)
    private class17(class266 arg0, int arg1, int arg2, int arg3) {
        this.field2897 = arg0;
        this.field267 = arg0.field4149;
        this.field273 = arg0.field4151;
        this.field280 = arg0.field4152;
        this.field266 = arg1;
        this.field276 = arg2;
        this.field277 = arg3;
        this.field272 = 0;
        this.method169();
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "([B[IIIIIIIILud;)I", line = 1401)
    private static final int method193(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class17 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field271 += (var14 - arg3) * arg9.field275;
        arg9.field279 += (var14 - arg3) * arg9.field269;
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
        arg9.field278 = var12 >> 2;
        arg9.field272 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ud", name = "i", descriptor = "(I)V", line = 1435)
    public final synchronized void method194(int arg0) {
        if (arg0 == 0) {
            this.method171(0);
            this.method2028(13329);
        } else if (this.field271 == 0 && this.field279 == 0) {
            this.field268 = 0;
            this.field276 = 0;
            this.field278 = 0;
            this.method2028(13329);
        } else {
            int var2 = -this.field278;
            if (this.field278 > var2) {
                var2 = this.field278;
            }
            if (-this.field271 > var2) {
                var2 = -this.field271;
            }
            if (this.field271 > var2) {
                var2 = this.field271;
            }
            if (-this.field279 > var2) {
                var2 = -this.field279;
            }
            if (this.field279 > var2) {
                var2 = this.field279;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field268 = arg0;
            this.field276 = Integer.MIN_VALUE;
            this.field274 = -this.field278 / arg0;
            this.field275 = -this.field271 / arg0;
            this.field269 = -this.field279 / arg0;
        }
    }
}
