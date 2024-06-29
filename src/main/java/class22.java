import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class22 extends class254 {

    @OriginalMember(owner = "client!mm", name = "z", descriptor = "I")
    private int field269;

    @OriginalMember(owner = "client!mm", name = "G", descriptor = "I")
    private int field276;

    @OriginalMember(owner = "client!mm", name = "B", descriptor = "Z")
    private boolean field271;

    @OriginalMember(owner = "client!mm", name = "y", descriptor = "I")
    private int field268;

    @OriginalMember(owner = "client!mm", name = "F", descriptor = "I")
    private int field275;

    @OriginalMember(owner = "client!mm", name = "u", descriptor = "I")
    private int field264;

    @OriginalMember(owner = "client!mm", name = "C", descriptor = "I")
    private int field272;

    @OriginalMember(owner = "client!mm", name = "s", descriptor = "I")
    private int field262;

    @OriginalMember(owner = "client!mm", name = "t", descriptor = "I")
    private int field263;

    @OriginalMember(owner = "client!mm", name = "v", descriptor = "I")
    private int field265;

    @OriginalMember(owner = "client!mm", name = "w", descriptor = "I")
    private int field266;

    @OriginalMember(owner = "client!mm", name = "x", descriptor = "I")
    private int field267;

    @OriginalMember(owner = "client!mm", name = "A", descriptor = "I")
    private int field270;

    @OriginalMember(owner = "client!mm", name = "D", descriptor = "I")
    private int field273;

    @OriginalMember(owner = "client!mm", name = "E", descriptor = "I")
    private int field274;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(II)V", line = 3)
    public final synchronized void method141(int arg0, int arg1) {
        this.method177(arg0, arg1, this.method157());
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "([IIIII)I", line = 6)
    private final int method142(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field263 > 0) {
                int var6 = this.field263 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field263 += arg1;
                if (this.field268 == -256 && (this.field272 & 0xFF) == 0) {
                    if (class125.field2227) {
                        arg1 = method151(0, ((class198) this.field4366).field3475, arg0, this.field272, arg1, this.field265, this.field274, this.field273, this.field267, 0, var6, arg2, this);
                    } else {
                        arg1 = method167(((class198) this.field4366).field3475, arg0, this.field272, arg1, this.field266, this.field270, 0, var6, arg2, this);
                    }
                } else if (class125.field2227) {
                    arg1 = method169(0, 0, ((class198) this.field4366).field3475, arg0, this.field272, arg1, this.field265, this.field274, this.field273, this.field267, 0, var6, arg2, this, this.field268, arg4);
                } else {
                    arg1 = method143(0, 0, ((class198) this.field4366).field3475, arg0, this.field272, arg1, this.field266, this.field270, 0, var6, arg2, this, this.field268, arg4);
                }
                this.field263 -= arg1;
                if (this.field263 != 0) {
                    return arg1;
                }
                if (!this.method172()) {
                    continue;
                }
                return arg3;
            }
            if (this.field268 == -256 && (this.field272 & 0xFF) == 0) {
                if (class125.field2227) {
                    return method156(0, ((class198) this.field4366).field3475, arg0, this.field272, arg1, this.field265, this.field274, 0, arg3, arg2, this);
                }
                return method144(((class198) this.field4366).field3475, arg0, this.field272, arg1, this.field266, 0, arg3, arg2, this);
            }
            if (class125.field2227) {
                return method179(0, 0, ((class198) this.field4366).field3475, arg0, this.field272, arg1, this.field265, this.field274, 0, arg3, arg2, this, this.field268, arg4);
            }
            return method173(0, 0, ((class198) this.field4366).field3475, arg0, this.field272, arg1, this.field266, 0, arg3, arg2, this, this.field268, arg4);
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(II[B[IIIIIIIILmm;II)I", line = 66)
    private static final int method143(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class22 arg11, int arg12, int arg13) {
        arg11.field265 -= arg11.field273 * arg5;
        arg11.field274 -= arg11.field267 * arg5;
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
        arg11.field265 += arg11.field273 * arg5;
        arg11.field274 += arg11.field267 * arg5;
        arg11.field266 = arg6;
        arg11.field272 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "([B[IIIIIIILmm;)I", line = 101)
    private static final int method144(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class22 arg8) {
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

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(II[B[IIIIIIIIIILmm;II)I", line = 126)
    private static final int method145(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class22 arg13, int arg14, int arg15) {
        arg13.field266 -= arg13.field270 * arg5;
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
        arg13.field266 += arg13.field270 * var27;
        arg13.field265 = arg6;
        arg13.field274 = arg7;
        arg13.field272 = arg4;
        return var27;
    }

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "()Lpd;", line = 168)
    public final class254 method110() {
        return null;
    }

    @OriginalMember(owner = "client!mm", name = "e", descriptor = "()Lpd;", line = 174)
    public final class254 method121() {
        return null;
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(I)V", line = 177)
    public final synchronized void method146(int arg0) {
        this.method161(arg0 << 6, this.method157());
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "([IIIII)I", line = 180)
    private final int method147(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field263 > 0) {
                int var6 = this.field263 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field263 += arg1;
                if (this.field268 == 256 && (this.field272 & 0xFF) == 0) {
                    if (class125.field2227) {
                        arg1 = method164(0, ((class198) this.field4366).field3475, arg0, this.field272, arg1, this.field265, this.field274, this.field273, this.field267, 0, var6, arg2, this);
                    } else {
                        arg1 = method152(((class198) this.field4366).field3475, arg0, this.field272, arg1, this.field266, this.field270, 0, var6, arg2, this);
                    }
                } else if (class125.field2227) {
                    arg1 = method145(0, 0, ((class198) this.field4366).field3475, arg0, this.field272, arg1, this.field265, this.field274, this.field273, this.field267, 0, var6, arg2, this, this.field268, arg4);
                } else {
                    arg1 = method168(0, 0, ((class198) this.field4366).field3475, arg0, this.field272, arg1, this.field266, this.field270, 0, var6, arg2, this, this.field268, arg4);
                }
                this.field263 -= arg1;
                if (this.field263 != 0) {
                    return arg1;
                }
                if (!this.method172()) {
                    continue;
                }
                return arg3;
            }
            if (this.field268 == 256 && (this.field272 & 0xFF) == 0) {
                if (class125.field2227) {
                    return method170(0, ((class198) this.field4366).field3475, arg0, this.field272, arg1, this.field265, this.field274, 0, arg3, arg2, this);
                }
                return method171(((class198) this.field4366).field3475, arg0, this.field272, arg1, this.field266, 0, arg3, arg2, this);
            }
            if (class125.field2227) {
                return method180(0, 0, ((class198) this.field4366).field3475, arg0, this.field272, arg1, this.field265, this.field274, 0, arg3, arg2, this, this.field268, arg4);
            }
            return method155(0, 0, ((class198) this.field4366).field3475, arg0, this.field272, arg1, this.field266, 0, arg3, arg2, this, this.field268, arg4);
        }
    }

    @OriginalMember(owner = "client!mm", name = "f", descriptor = "()V", line = 235)
    private final void method148() {
        if (this.field263 == 0) {
            return;
        }
        if (this.field275 == Integer.MIN_VALUE) {
            this.field275 = 0;
        }
        this.field263 = 0;
        this.method175();
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(II)I", line = 246)
    private static final int method149(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!mm", name = "g", descriptor = "()Z", line = 249)
    public final boolean method150() {
        return this.field272 < 0 || this.field272 >= ((class198) this.field4366).field3475.length << 8;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(I[B[IIIIIIIIIILmm;)I", line = 252)
    private static final int method151(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class22 arg12) {
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
        arg12.field266 += (var19 - arg4) * arg12.field270;
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
        arg12.field265 = var15 >> 2;
        arg12.field274 = var16 >> 2;
        arg12.field272 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!mm", name = "d", descriptor = "()I", line = 305)
    public final int method120() {
        return this.field275 == 0 && this.field263 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "([III)V", line = 316)
    public final synchronized void method113(int[] arg0, int arg1, int arg2) {
        if (this.field275 == 0 && this.field263 == 0) {
            this.method114(arg2);
            return;
        }
        class198 var4 = (class198) this.field4366;
        int var5 = this.field269 << 8;
        int var6 = this.field276 << 8;
        int var7 = var4.field3475.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field262 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field272 < 0) {
            if (this.field268 <= 0) {
                this.method148();
                this.method1054((byte) 78);
                return;
            }
            this.field272 = 0;
        }
        if (this.field272 >= var7) {
            if (this.field268 >= 0) {
                this.method148();
                this.method1054((byte) 82);
                return;
            }
            this.field272 = var7 - 1;
        }
        if (this.field262 >= 0) {
            if (this.field262 > 0) {
                if (this.field271) {
                    label131: {
                        if (this.field268 < 0) {
                            var9 = this.method142(arg0, arg1, var5, var10, var4.field3475[this.field269]);
                            if (this.field272 >= var5) {
                                return;
                            }
                            this.field272 = var5 + var5 - this.field272 - 1;
                            this.field268 = -this.field268;
                            if (--this.field262 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method147(arg0, var9, var6, var10, var4.field3475[this.field276 - 1]);
                            if (this.field272 < var6) {
                                return;
                            }
                            this.field272 = var6 + var6 - this.field272 - 1;
                            this.field268 = -this.field268;
                            if (--this.field262 == 0) {
                                break;
                            }
                            var9 = this.method142(arg0, var9, var5, var10, var4.field3475[this.field269]);
                            if (this.field272 >= var5) {
                                return;
                            }
                            this.field272 = var5 + var5 - this.field272 - 1;
                            this.field268 = -this.field268;
                        } while (--this.field262 != 0);
                    }
                } else if (this.field268 < 0) {
                    while (true) {
                        var9 = this.method142(arg0, var9, var5, var10, var4.field3475[this.field276 - 1]);
                        if (this.field272 >= var5) {
                            return;
                        }
                        int var12 = (var6 - this.field272 - 1) / var8;
                        if (var12 >= this.field262) {
                            this.field272 += this.field262 * var8;
                            this.field262 = 0;
                            break;
                        }
                        this.field272 += var8 * var12;
                        this.field262 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method147(arg0, var9, var6, var10, var4.field3475[this.field269]);
                        if (this.field272 < var6) {
                            return;
                        }
                        int var13 = (this.field272 - var5) / var8;
                        if (var13 >= this.field262) {
                            this.field272 -= this.field262 * var8;
                            this.field262 = 0;
                            break;
                        }
                        this.field272 -= var8 * var13;
                        this.field262 -= var13;
                    }
                }
            }
            if (this.field268 < 0) {
                this.method142(arg0, var9, 0, var10, 0);
                if (this.field272 < 0) {
                    this.field272 = -1;
                    this.method148();
                    this.method1054((byte) 79);
                }
            } else {
                this.method147(arg0, var9, var7, var10, 0);
                if (this.field272 >= var7) {
                    this.field272 = var7;
                    this.method148();
                    this.method1054((byte) 85);
                }
            }
        } else if (this.field271) {
            if (this.field268 < 0) {
                var9 = this.method142(arg0, arg1, var5, var10, var4.field3475[this.field269]);
                if (this.field272 >= var5) {
                    return;
                }
                this.field272 = var5 + var5 - this.field272 - 1;
                this.field268 = -this.field268;
            }
            while (true) {
                int var11 = this.method147(arg0, var9, var6, var10, var4.field3475[this.field276 - 1]);
                if (this.field272 < var6) {
                    return;
                }
                this.field272 = var6 + var6 - this.field272 - 1;
                this.field268 = -this.field268;
                var9 = this.method142(arg0, var11, var5, var10, var4.field3475[this.field269]);
                if (this.field272 >= var5) {
                    return;
                }
                this.field272 = var5 + var5 - this.field272 - 1;
                this.field268 = -this.field268;
            }
        } else if (this.field268 < 0) {
            while (true) {
                var9 = this.method142(arg0, var9, var5, var10, var4.field3475[this.field276 - 1]);
                if (this.field272 >= var5) {
                    return;
                }
                this.field272 = var6 - (var6 - 1 - this.field272) % var8 - 1;
            }
        } else {
            while (true) {
                var9 = this.method147(arg0, var9, var6, var10, var4.field3475[this.field269]);
                if (this.field272 < var6) {
                    return;
                }
                this.field272 = (this.field272 - var5) % var8 + var5;
            }
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "([B[IIIIIIIILmm;)I", line = 551)
    private static final int method152(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class22 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field265 += (var14 - arg3) * arg9.field273;
        arg9.field274 += (var14 - arg3) * arg9.field267;
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
        arg9.field266 = var12 >> 2;
        arg9.field272 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "(I)V", line = 585)
    public final synchronized void method153(int arg0) {
        this.field262 = arg0;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(Lbd;III)Lmm;", line = 588)
    public static final class22 method154(class198 arg0, int arg1, int arg2, int arg3) {
        return arg0.field3475 == null || arg0.field3475.length == 0 ? null : new class22(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(II[B[IIIIIIILmm;II)I", line = 596)
    private static final int method155(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class22 arg10, int arg11, int arg12) {
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

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(I[B[IIIIIIIILmm;)I", line = 622)
    private static final int method156(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class22 arg10) {
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

    @OriginalMember(owner = "client!mm", name = "h", descriptor = "()I", line = 660)
    public final synchronized int method157() {
        return this.field264 < 0 ? -1 : this.field264;
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "()I", line = 665)
    public final int method158() {
        int var1 = this.field266 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field262 == 0) {
            var2 -= this.field272 * var2 / (((class198) this.field4366).field3475.length << 8);
        } else if (this.field262 >= 0) {
            var2 -= this.field269 * var2 / ((class198) this.field4366).field3475.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(I)V", line = 680)
    public final synchronized void method114(int arg0) {
        if (this.field263 > 0) {
            if (arg0 >= this.field263) {
                if (this.field275 == Integer.MIN_VALUE) {
                    this.field275 = 0;
                    this.field266 = this.field265 = this.field274 = 0;
                    this.method1054((byte) 78);
                    arg0 = this.field263;
                }
                this.field263 = 0;
                this.method175();
            } else {
                this.field266 += this.field270 * arg0;
                this.field265 += this.field273 * arg0;
                this.field274 += this.field267 * arg0;
                this.field263 -= arg0;
            }
        }
        class198 var2 = (class198) this.field4366;
        int var3 = this.field269 << 8;
        int var4 = this.field276 << 8;
        int var5 = var2.field3475.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field262 = 0;
        }
        if (this.field272 < 0) {
            if (this.field268 <= 0) {
                this.method148();
                this.method1054((byte) 127);
                return;
            }
            this.field272 = 0;
        }
        if (this.field272 >= var5) {
            if (this.field268 >= 0) {
                this.method148();
                this.method1054((byte) 98);
                return;
            }
            this.field272 = var5 - 1;
        }
        this.field272 += this.field268 * arg0;
        if (this.field262 >= 0) {
            if (this.field262 > 0) {
                if (this.field271) {
                    label121: {
                        if (this.field268 < 0) {
                            if (this.field272 >= var3) {
                                return;
                            }
                            this.field272 = var3 + var3 - this.field272 - 1;
                            this.field268 = -this.field268;
                            if (--this.field262 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field272 < var4) {
                                return;
                            }
                            this.field272 = var4 + var4 - this.field272 - 1;
                            this.field268 = -this.field268;
                            if (--this.field262 == 0) {
                                break;
                            }
                            if (this.field272 >= var3) {
                                return;
                            }
                            this.field272 = var3 + var3 - this.field272 - 1;
                            this.field268 = -this.field268;
                        } while (--this.field262 != 0);
                    }
                } else {
                    label153: {
                        if (this.field268 < 0) {
                            if (this.field272 >= var3) {
                                return;
                            }
                            int var7 = (var4 - this.field272 - 1) / var6;
                            if (var7 >= this.field262) {
                                this.field272 += this.field262 * var6;
                                this.field262 = 0;
                                break label153;
                            }
                            this.field272 += var6 * var7;
                            this.field262 -= var7;
                        } else if (this.field272 >= var4) {
                            int var8 = (this.field272 - var3) / var6;
                            if (var8 >= this.field262) {
                                this.field272 -= this.field262 * var6;
                                this.field262 = 0;
                                break label153;
                            }
                            this.field272 -= var6 * var8;
                            this.field262 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field268 < 0) {
                if (this.field272 < 0) {
                    this.field272 = -1;
                    this.method148();
                    this.method1054((byte) 110);
                }
            } else if (this.field272 >= var5) {
                this.field272 = var5;
                this.method148();
                this.method1054((byte) 91);
            }
        } else if (this.field271) {
            if (this.field268 < 0) {
                if (this.field272 >= var3) {
                    return;
                }
                this.field272 = var3 + var3 - this.field272 - 1;
                this.field268 = -this.field268;
            }
            while (this.field272 >= var4) {
                this.field272 = var4 + var4 - this.field272 - 1;
                this.field268 = -this.field268;
                if (this.field272 >= var3) {
                    return;
                }
                this.field272 = var3 + var3 - this.field272 - 1;
                this.field268 = -this.field268;
            }
        } else if (this.field268 < 0) {
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

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(Lbd;II)Lmm;", line = 898)
    public static final class22 method159(class198 arg0, int arg1, int arg2) {
        return arg0.field3475 == null || arg0.field3475.length == 0 ? null : new class22(arg0, (int) ((long) arg0.field3474 * 256L * (long) arg1 / (long) (class83.field1408 * 100)), arg2 << 6);
    }

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "(II)I", line = 905)
    private static final int method160(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!mm", name = "d", descriptor = "(II)V", line = 908)
    private final synchronized void method161(int arg0, int arg1) {
        this.field275 = arg0;
        this.field264 = arg1;
        this.field263 = 0;
        this.method175();
    }

    @OriginalMember(owner = "client!mm", name = "d", descriptor = "(I)V", line = 914)
    public final synchronized void method162(int arg0) {
        if (arg0 == 0) {
            this.method166(0);
            this.method1054((byte) 101);
        } else if (this.field265 == 0 && this.field274 == 0) {
            this.field263 = 0;
            this.field275 = 0;
            this.field266 = 0;
            this.method1054((byte) 79);
        } else {
            int var2 = -this.field266;
            if (this.field266 > var2) {
                var2 = this.field266;
            }
            if (-this.field265 > var2) {
                var2 = -this.field265;
            }
            if (this.field265 > var2) {
                var2 = this.field265;
            }
            if (-this.field274 > var2) {
                var2 = -this.field274;
            }
            if (this.field274 > var2) {
                var2 = this.field274;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field263 = arg0;
            this.field275 = Integer.MIN_VALUE;
            this.field270 = -this.field266 / arg0;
            this.field273 = -this.field265 / arg0;
            this.field267 = -this.field274 / arg0;
        }
    }

    @OriginalMember(owner = "client!mm", name = "e", descriptor = "(I)V", line = 960)
    public final synchronized void method163(int arg0) {
        int var2 = ((class198) this.field4366).field3475.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field272 = arg0;
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(I[B[IIIIIIIIIILmm;)I", line = 970)
    private static final int method164(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class22 arg12) {
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
        arg12.field266 += (var19 - arg4) * arg12.field270;
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
        arg12.field265 = var15 >> 2;
        arg12.field274 = var16 >> 2;
        arg12.field272 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!mm", name = "i", descriptor = "()I", line = 1025)
    public final synchronized int method165() {
        return this.field268 < 0 ? -this.field268 : this.field268;
    }

    @OriginalMember(owner = "client!mm", name = "f", descriptor = "(I)V", line = 1028)
    private final synchronized void method166(int arg0) {
        this.method161(arg0, this.method157());
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "([B[IIIIIIIILmm;)I", line = 1032)
    private static final int method167(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class22 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field265 += (var14 - arg3) * arg9.field273;
        arg9.field274 += (var14 - arg3) * arg9.field267;
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
        arg9.field266 = var12 >> 2;
        arg9.field272 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(II[B[IIIIIIIILmm;II)I", line = 1066)
    private static final int method168(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class22 arg11, int arg12, int arg13) {
        arg11.field265 -= arg11.field273 * arg5;
        arg11.field274 -= arg11.field267 * arg5;
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
        arg11.field265 += arg11.field273 * arg5;
        arg11.field274 += arg11.field267 * arg5;
        arg11.field266 = arg6;
        arg11.field272 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(II[B[IIIIIIIIIILmm;II)I", line = 1099)
    private static final int method169(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class22 arg13, int arg14, int arg15) {
        arg13.field266 -= arg13.field270 * arg5;
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
        arg13.field266 += arg13.field270 * var26;
        arg13.field265 = arg6;
        arg13.field274 = arg7;
        arg13.field272 = arg4;
        return var26;
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(I[B[IIIIIIIILmm;)I", line = 1140)
    private static final int method170(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class22 arg10) {
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

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "([B[IIIIIIILmm;)I", line = 1180)
    private static final int method171(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class22 arg8) {
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

    @OriginalMember(owner = "client!mm", name = "j", descriptor = "()Z", line = 1207)
    private final boolean method172() {
        int var1 = this.field275;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method149(var1, this.field264);
            var2 = method160(var1, this.field264);
        }
        if (this.field266 != var1 || this.field265 != var3 || this.field274 != var2) {
            if (this.field266 < var1) {
                this.field270 = 1;
                this.field263 = var1 - this.field266;
            } else if (this.field266 > var1) {
                this.field270 = -1;
                this.field263 = this.field266 - var1;
            } else {
                this.field270 = 0;
            }
            if (this.field265 < var3) {
                this.field273 = 1;
                if (this.field263 == 0 || this.field263 > var3 - this.field265) {
                    this.field263 = var3 - this.field265;
                }
            } else if (this.field265 > var3) {
                this.field273 = -1;
                if (this.field263 == 0 || this.field263 > this.field265 - var3) {
                    this.field263 = this.field265 - var3;
                }
            } else {
                this.field273 = 0;
            }
            if (this.field274 < var2) {
                this.field267 = 1;
                if (this.field263 == 0 || this.field263 > var2 - this.field274) {
                    this.field263 = var2 - this.field274;
                }
            } else if (this.field274 > var2) {
                this.field267 = -1;
                if (this.field263 == 0 || this.field263 > this.field274 - var2) {
                    this.field263 = this.field274 - var2;
                }
            } else {
                this.field267 = 0;
            }
            return false;
        } else if (this.field275 == Integer.MIN_VALUE) {
            this.field275 = 0;
            this.field266 = this.field265 = this.field274 = 0;
            this.method1054((byte) 82);
            return true;
        } else {
            this.method175();
            return false;
        }
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(II[B[IIIIIIILmm;II)I", line = 1292)
    private static final int method173(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class22 arg10, int arg11, int arg12) {
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

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(Z)V", line = 1320)
    public final synchronized void method174(boolean arg0) {
        this.field268 = (this.field268 >>> 31) + (this.field268 ^ this.field268 >> 31);
        if (arg0) {
            this.field268 = -this.field268;
        }
    }

    @OriginalMember(owner = "client!mm", name = "k", descriptor = "()V", line = 1329)
    private final void method175() {
        this.field266 = this.field275;
        this.field265 = method149(this.field275, this.field264);
        this.field274 = method160(this.field275, this.field264);
    }

    @OriginalMember(owner = "client!mm", name = "l", descriptor = "()I", line = 1335)
    public final synchronized int method176() {
        return this.field275 == Integer.MIN_VALUE ? 0 : this.field275;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(III)V", line = 1338)
    public final synchronized void method177(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method161(arg1, arg2);
            return;
        }
        int var4 = method149(arg1, arg2);
        int var5 = method160(arg1, arg2);
        if (this.field265 == var4 && this.field274 == var5) {
            this.field263 = 0;
            return;
        }
        int var6 = arg1 - this.field266;
        if (this.field266 - arg1 > var6) {
            var6 = this.field266 - arg1;
        }
        if (var4 - this.field265 > var6) {
            var6 = var4 - this.field265;
        }
        if (this.field265 - var4 > var6) {
            var6 = this.field265 - var4;
        }
        if (var5 - this.field274 > var6) {
            var6 = var5 - this.field274;
        }
        if (this.field274 - var5 > var6) {
            var6 = this.field274 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field263 = arg0;
        this.field275 = arg1;
        this.field264 = arg2;
        this.field270 = (arg1 - this.field266) / arg0;
        this.field273 = (var4 - this.field265) / arg0;
        this.field267 = (var5 - this.field274) / arg0;
    }

    @OriginalMember(owner = "client!mm", name = "<init>", descriptor = "(Lbd;II)V", line = 1383)
    private class22(class198 arg0, int arg1, int arg2) {
        this.field4366 = arg0;
        this.field269 = arg0.field3473;
        this.field276 = arg0.field3476;
        this.field271 = arg0.field3472;
        this.field268 = arg1;
        this.field275 = arg2;
        this.field264 = 8192;
        this.field272 = 0;
        this.method175();
    }

    @OriginalMember(owner = "client!mm", name = "g", descriptor = "(I)V", line = 1395)
    public final synchronized void method178(int arg0) {
        if (this.field268 < 0) {
            this.field268 = -arg0;
        } else {
            this.field268 = arg0;
        }
    }

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "(II[B[IIIIIIIILmm;II)I", line = 1402)
    private static final int method179(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class22 arg11, int arg12, int arg13) {
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

    @OriginalMember(owner = "client!mm", name = "<init>", descriptor = "(Lbd;III)V", line = 1433)
    private class22(class198 arg0, int arg1, int arg2, int arg3) {
        this.field4366 = arg0;
        this.field269 = arg0.field3473;
        this.field276 = arg0.field3476;
        this.field271 = arg0.field3472;
        this.field268 = arg1;
        this.field275 = arg2;
        this.field264 = arg3;
        this.field272 = 0;
        this.method175();
    }

    @OriginalMember(owner = "client!mm", name = "d", descriptor = "(II[B[IIIIIIIILmm;II)I", line = 1445)
    private static final int method180(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class22 arg11, int arg12, int arg13) {
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

    @OriginalMember(owner = "client!mm", name = "m", descriptor = "()Z", line = 1478)
    public final boolean method181() {
        return this.field263 != 0;
    }
}
