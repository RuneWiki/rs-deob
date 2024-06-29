import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lr")
public class class215 extends class11 {

    @OriginalMember(owner = "client!lr", name = "A", descriptor = "I")
    private int field3110;

    @OriginalMember(owner = "client!lr", name = "C", descriptor = "I")
    private int field3112;

    @OriginalMember(owner = "client!lr", name = "w", descriptor = "Z")
    private boolean field3106;

    @OriginalMember(owner = "client!lr", name = "v", descriptor = "I")
    private int field3105;

    @OriginalMember(owner = "client!lr", name = "D", descriptor = "I")
    private int field3113;

    @OriginalMember(owner = "client!lr", name = "E", descriptor = "I")
    private int field3114;

    @OriginalMember(owner = "client!lr", name = "F", descriptor = "I")
    private int field3115;

    @OriginalMember(owner = "client!lr", name = "u", descriptor = "I")
    private int field3104;

    @OriginalMember(owner = "client!lr", name = "x", descriptor = "I")
    private int field3107;

    @OriginalMember(owner = "client!lr", name = "y", descriptor = "I")
    private int field3108;

    @OriginalMember(owner = "client!lr", name = "z", descriptor = "I")
    private int field3109;

    @OriginalMember(owner = "client!lr", name = "B", descriptor = "I")
    private int field3111;

    @OriginalMember(owner = "client!lr", name = "G", descriptor = "I")
    private int field3116;

    @OriginalMember(owner = "client!lr", name = "H", descriptor = "I")
    private int field3117;

    @OriginalMember(owner = "client!lr", name = "I", descriptor = "I")
    private int field3118;

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "()Loe;")
    public final class11 method53() {
        return null;
    }

    @OriginalMember(owner = "client!lr", name = "d", descriptor = "(I)V")
    public final synchronized void method58(int arg0) {
        if (this.field3111 > 0) {
            if (arg0 >= this.field3111) {
                if (this.field3113 == Integer.MIN_VALUE) {
                    this.field3113 = 0;
                    this.field3118 = this.field3117 = this.field3108 = 0;
                    this.method2714(-78);
                    arg0 = this.field3111;
                }
                this.field3111 = 0;
                this.method1470();
            } else {
                this.field3118 += this.field3107 * arg0;
                this.field3117 += this.field3104 * arg0;
                this.field3108 += this.field3116 * arg0;
                this.field3111 -= arg0;
            }
        }
        class44 var2 = (class44) super.field74;
        int var3 = this.field3110 << 8;
        int var4 = this.field3112 << 8;
        int var5 = var2.field704.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field3109 = 0;
        }
        if (this.field3115 < 0) {
            if (this.field3105 <= 0) {
                this.method1464();
                this.method2714(-100);
                return;
            }
            this.field3115 = 0;
        }
        if (this.field3115 >= var5) {
            if (this.field3105 >= 0) {
                this.method1464();
                this.method2714(66);
                return;
            }
            this.field3115 = var5 - 1;
        }
        this.field3115 += this.field3105 * arg0;
        if (this.field3109 < 0) {
            if (!this.field3106) {
                if (this.field3105 < 0) {
                    if (this.field3115 < var3) {
                        this.field3115 = var4 - 1 - (var4 - 1 - this.field3115) % var6;
                    }
                } else if (this.field3115 >= var4) {
                    this.field3115 = (this.field3115 - var3) % var6 + var3;
                }
            } else {
                if (this.field3105 < 0) {
                    if (this.field3115 >= var3) {
                        return;
                    }
                    this.field3115 = var3 + var3 - 1 - this.field3115;
                    this.field3105 = -this.field3105;
                }
                while (this.field3115 >= var4) {
                    this.field3115 = var4 + var4 - 1 - this.field3115;
                    this.field3105 = -this.field3105;
                    if (this.field3115 >= var3) {
                        return;
                    }
                    this.field3115 = var3 + var3 - 1 - this.field3115;
                    this.field3105 = -this.field3105;
                }
            }
        } else {
            if (this.field3109 > 0) {
                if (this.field3106) {
                    label125: {
                        if (this.field3105 < 0) {
                            if (this.field3115 >= var3) {
                                return;
                            }
                            this.field3115 = var3 + var3 - 1 - this.field3115;
                            this.field3105 = -this.field3105;
                            if (--this.field3109 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field3115 < var4) {
                                return;
                            }
                            this.field3115 = var4 + var4 - 1 - this.field3115;
                            this.field3105 = -this.field3105;
                            if (--this.field3109 == 0) {
                                break;
                            }
                            if (this.field3115 >= var3) {
                                return;
                            }
                            this.field3115 = var3 + var3 - 1 - this.field3115;
                            this.field3105 = -this.field3105;
                        } while (--this.field3109 != 0);
                    }
                } else if (this.field3105 < 0) {
                    if (this.field3115 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field3115) / var6;
                    if (var7 < this.field3109) {
                        this.field3115 += var6 * var7;
                        this.field3109 -= var7;
                        return;
                    }
                    this.field3115 += this.field3109 * var6;
                    this.field3109 = 0;
                } else {
                    if (this.field3115 < var4) {
                        return;
                    }
                    int var8 = (this.field3115 - var3) / var6;
                    if (var8 < this.field3109) {
                        this.field3115 -= var6 * var8;
                        this.field3109 -= var8;
                        return;
                    }
                    this.field3115 -= this.field3109 * var6;
                    this.field3109 = 0;
                }
            }
            if (this.field3105 < 0) {
                if (this.field3115 < 0) {
                    this.field3115 = -1;
                    this.method1464();
                    this.method2714(44);
                    return;
                }
            } else if (this.field3115 >= var5) {
                this.field3115 = var5;
                this.method1464();
                this.method2714(-67);
            }
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(III)V")
    public final synchronized void method1454(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1493(arg1, arg2);
        } else {
            int var4 = method1473(arg1, arg2);
            int var5 = method1457(arg1, arg2);
            if (this.field3117 == var4 && this.field3108 == var5) {
                this.field3111 = 0;
            } else {
                int var6 = arg1 - this.field3118;
                if (this.field3118 - arg1 > var6) {
                    var6 = this.field3118 - arg1;
                }
                if (var4 - this.field3117 > var6) {
                    var6 = var4 - this.field3117;
                }
                if (this.field3117 - var4 > var6) {
                    var6 = this.field3117 - var4;
                }
                if (var5 - this.field3108 > var6) {
                    var6 = var5 - this.field3108;
                }
                if (this.field3108 - var5 > var6) {
                    var6 = this.field3108 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field3111 = arg0;
                this.field3113 = arg1;
                this.field3114 = arg2;
                this.field3107 = (arg1 - this.field3118) / arg0;
                this.field3104 = (var4 - this.field3117) / arg0;
                this.field3116 = (var5 - this.field3108) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "([B[IIIIIIIILlr;)I")
    private static final int method1455(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class215 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field3117 += (var14 - arg3) * arg9.field3104;
        arg9.field3108 += (var14 - arg3) * arg9.field3116;
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
        arg9.field3118 = var12 >> 2;
        arg9.field3115 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(II[B[IIIIIIIILlr;II)I")
    private static final int method1456(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class215 arg11, int arg12, int arg13) {
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
        arg11.field3115 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "()I")
    public final int method52() {
        int var1 = this.field3118 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field3109 == 0) {
            var2 -= this.field3115 * var2 / (((class44) super.field74).field704.length << 8);
        } else if (this.field3109 >= 0) {
            var2 -= this.field3110 * var2 / ((class44) super.field74).field704.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(II)I")
    private static final int method1457(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(Lqq;III)Llr;")
    public static final class215 method1458(class44 arg0, int arg1, int arg2, int arg3) {
        return arg0.field704 != null && arg0.field704.length != 0 ? new class215(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "(II[B[IIIIIIIILlr;II)I")
    private static final int method1459(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class215 arg11, int arg12, int arg13) {
        arg11.field3117 -= arg11.field3104 * arg5;
        arg11.field3108 -= arg11.field3116 * arg5;
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
        arg11.field3117 += arg11.field3104 * arg5;
        arg11.field3108 += arg11.field3116 * arg5;
        arg11.field3118 = arg6;
        arg11.field3115 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!lr", name = "e", descriptor = "()I")
    public final synchronized int method1460() {
        return this.field3114 < 0 ? -1 : this.field3114;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(Z)V")
    public final synchronized void method1461(boolean arg0) {
        this.field3105 = (this.field3105 >>> 31) + (this.field3105 ^ this.field3105 >> 31);
        if (arg0) {
            this.field3105 = -this.field3105;
        }
    }

    @OriginalMember(owner = "client!lr", name = "e", descriptor = "(I)V")
    public final synchronized void method1462(int arg0) {
        if (arg0 == 0) {
            this.method1485(0);
            this.method2714(-117);
        } else if (this.field3117 == 0 && this.field3108 == 0) {
            this.field3111 = 0;
            this.field3113 = 0;
            this.field3118 = 0;
            this.method2714(108);
        } else {
            int var2 = -this.field3118;
            if (this.field3118 > var2) {
                var2 = this.field3118;
            }
            if (-this.field3117 > var2) {
                var2 = -this.field3117;
            }
            if (this.field3117 > var2) {
                var2 = this.field3117;
            }
            if (-this.field3108 > var2) {
                var2 = -this.field3108;
            }
            if (this.field3108 > var2) {
                var2 = this.field3108;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field3111 = arg0;
            this.field3113 = Integer.MIN_VALUE;
            this.field3107 = -this.field3118 / arg0;
            this.field3104 = -this.field3117 / arg0;
            this.field3116 = -this.field3108 / arg0;
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "([IIIII)I")
    private final int method1463(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field3111 <= 0) {
                if (this.field3105 == -256 && (this.field3115 & 255) == 0) {
                    if (class217.field3139) {
                        return method1486(0, ((class44) super.field74).field704, arg0, this.field3115, arg1, this.field3117, this.field3108, 0, arg3, arg2, this);
                    }
                    return method1475(((class44) super.field74).field704, arg0, this.field3115, arg1, this.field3118, 0, arg3, arg2, this);
                }
                if (class217.field3139) {
                    return method1477(0, 0, ((class44) super.field74).field704, arg0, this.field3115, arg1, this.field3117, this.field3108, 0, arg3, arg2, this, this.field3105, arg4);
                }
                return method1465(0, 0, ((class44) super.field74).field704, arg0, this.field3115, arg1, this.field3118, 0, arg3, arg2, this, this.field3105, arg4);
            }
            int var6 = this.field3111 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field3111 += arg1;
            if (this.field3105 == -256 && (this.field3115 & 255) == 0) {
                if (class217.field3139) {
                    arg1 = method1487(0, ((class44) super.field74).field704, arg0, this.field3115, arg1, this.field3117, this.field3108, this.field3104, this.field3116, 0, var6, arg2, this);
                } else {
                    arg1 = method1481(((class44) super.field74).field704, arg0, this.field3115, arg1, this.field3118, this.field3107, 0, var6, arg2, this);
                }
            } else if (class217.field3139) {
                arg1 = method1489(0, 0, ((class44) super.field74).field704, arg0, this.field3115, arg1, this.field3117, this.field3108, this.field3104, this.field3116, 0, var6, arg2, this, this.field3105, arg4);
            } else {
                arg1 = method1488(0, 0, ((class44) super.field74).field704, arg0, this.field3115, arg1, this.field3118, this.field3107, 0, var6, arg2, this, this.field3105, arg4);
            }
            this.field3111 -= arg1;
            if (this.field3111 != 0) {
                return arg1;
            }
        } while (!this.method1479());
        return arg3;
    }

    @OriginalMember(owner = "client!lr", name = "f", descriptor = "()V")
    private final void method1464() {
        if (this.field3111 != 0) {
            if (this.field3113 == Integer.MIN_VALUE) {
                this.field3113 = 0;
            }
            this.field3111 = 0;
            this.method1470();
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(II[B[IIIIIIILlr;II)I")
    private static final int method1465(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class215 arg10, int arg11, int arg12) {
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
        arg10.field3115 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(I[B[IIIIIIIIIILlr;)I")
    private static final int method1466(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class215 arg12) {
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
        arg12.field3118 += (var19 - arg4) * arg12.field3107;
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
        arg12.field3117 = var15 >> 2;
        arg12.field3108 = var16 >> 2;
        arg12.field3115 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!lr", name = "f", descriptor = "(I)V")
    public final synchronized void method1467(int arg0) {
        if (this.field3105 < 0) {
            this.field3105 = -arg0;
        } else {
            this.field3105 = arg0;
        }
    }

    @OriginalMember(owner = "client!lr", name = "g", descriptor = "()Z")
    public final boolean method1468() {
        return this.field3115 < 0 || this.field3115 >= ((class44) super.field74).field704.length << 8;
    }

    @OriginalMember(owner = "client!lr", name = "h", descriptor = "()I")
    public final synchronized int method1469() {
        return this.field3105 < 0 ? -this.field3105 : this.field3105;
    }

    @OriginalMember(owner = "client!lr", name = "i", descriptor = "()V")
    private final void method1470() {
        this.field3118 = this.field3113;
        this.field3117 = method1473(this.field3113, this.field3114);
        this.field3108 = method1457(this.field3113, this.field3114);
    }

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "([IIIII)I")
    private final int method1471(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field3111 <= 0) {
                if (this.field3105 == 256 && (this.field3115 & 255) == 0) {
                    if (class217.field3139) {
                        return method1472(0, ((class44) super.field74).field704, arg0, this.field3115, arg1, this.field3117, this.field3108, 0, arg3, arg2, this);
                    }
                    return method1490(((class44) super.field74).field704, arg0, this.field3115, arg1, this.field3118, 0, arg3, arg2, this);
                }
                if (class217.field3139) {
                    return method1456(0, 0, ((class44) super.field74).field704, arg0, this.field3115, arg1, this.field3117, this.field3108, 0, arg3, arg2, this, this.field3105, arg4);
                }
                return method1480(0, 0, ((class44) super.field74).field704, arg0, this.field3115, arg1, this.field3118, 0, arg3, arg2, this, this.field3105, arg4);
            }
            int var6 = this.field3111 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field3111 += arg1;
            if (this.field3105 == 256 && (this.field3115 & 255) == 0) {
                if (class217.field3139) {
                    arg1 = method1466(0, ((class44) super.field74).field704, arg0, this.field3115, arg1, this.field3117, this.field3108, this.field3104, this.field3116, 0, var6, arg2, this);
                } else {
                    arg1 = method1455(((class44) super.field74).field704, arg0, this.field3115, arg1, this.field3118, this.field3107, 0, var6, arg2, this);
                }
            } else if (class217.field3139) {
                arg1 = method1492(0, 0, ((class44) super.field74).field704, arg0, this.field3115, arg1, this.field3117, this.field3108, this.field3104, this.field3116, 0, var6, arg2, this, this.field3105, arg4);
            } else {
                arg1 = method1459(0, 0, ((class44) super.field74).field704, arg0, this.field3115, arg1, this.field3118, this.field3107, 0, var6, arg2, this, this.field3105, arg4);
            }
            this.field3111 -= arg1;
            if (this.field3111 != 0) {
                return arg1;
            }
        } while (!this.method1479());
        return arg3;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(I[B[IIIIIIIILlr;)I")
    private static final int method1472(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class215 arg10) {
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
        arg10.field3115 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "(II)I")
    private static final int method1473(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!lr", name = "g", descriptor = "(I)V")
    public final synchronized void method1474(int arg0) {
        int var2 = ((class44) super.field74).field704.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field3115 = arg0;
    }

    @OriginalMember(owner = "client!lr", name = "d", descriptor = "()Loe;")
    public final class11 method55() {
        return null;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "([B[IIIIIIILlr;)I")
    private static final int method1475(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class215 arg8) {
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
        arg8.field3115 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!lr", name = "h", descriptor = "(I)V")
    public final synchronized void method1476(int arg0) {
        this.method1493(arg0 << 6, this.method1460());
    }

    @OriginalMember(owner = "client!lr", name = "c", descriptor = "(II[B[IIIIIIIILlr;II)I")
    private static final int method1477(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class215 arg11, int arg12, int arg13) {
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
        arg11.field3115 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "([III)V")
    public final synchronized void method56(int[] arg0, int arg1, int arg2) {
        if (this.field3113 == 0 && this.field3111 == 0) {
            this.method58(arg2);
        } else {
            class44 var4 = (class44) super.field74;
            int var5 = this.field3110 << 8;
            int var6 = this.field3112 << 8;
            int var7 = var4.field704.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field3109 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field3115 < 0) {
                if (this.field3105 <= 0) {
                    this.method1464();
                    this.method2714(-93);
                    return;
                }
                this.field3115 = 0;
            }
            if (this.field3115 >= var7) {
                if (this.field3105 >= 0) {
                    this.method1464();
                    this.method2714(-97);
                    return;
                }
                this.field3115 = var7 - 1;
            }
            if (this.field3109 < 0) {
                if (this.field3106) {
                    if (this.field3105 < 0) {
                        var9 = this.method1463(arg0, arg1, var5, var10, var4.field704[this.field3110]);
                        if (this.field3115 >= var5) {
                            return;
                        }
                        this.field3115 = var5 + var5 - 1 - this.field3115;
                        this.field3105 = -this.field3105;
                    }
                    while (true) {
                        int var11 = this.method1471(arg0, var9, var6, var10, var4.field704[this.field3112 - 1]);
                        if (this.field3115 < var6) {
                            return;
                        }
                        this.field3115 = var6 + var6 - 1 - this.field3115;
                        this.field3105 = -this.field3105;
                        var9 = this.method1463(arg0, var11, var5, var10, var4.field704[this.field3110]);
                        if (this.field3115 >= var5) {
                            return;
                        }
                        this.field3115 = var5 + var5 - 1 - this.field3115;
                        this.field3105 = -this.field3105;
                    }
                } else if (this.field3105 < 0) {
                    while (true) {
                        var9 = this.method1463(arg0, var9, var5, var10, var4.field704[this.field3112 - 1]);
                        if (this.field3115 >= var5) {
                            return;
                        }
                        this.field3115 = var6 - 1 - (var6 - 1 - this.field3115) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method1471(arg0, var9, var6, var10, var4.field704[this.field3110]);
                        if (this.field3115 < var6) {
                            return;
                        }
                        this.field3115 = (this.field3115 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field3109 > 0) {
                    if (this.field3106) {
                        label130: {
                            if (this.field3105 < 0) {
                                var9 = this.method1463(arg0, arg1, var5, var10, var4.field704[this.field3110]);
                                if (this.field3115 >= var5) {
                                    return;
                                }
                                this.field3115 = var5 + var5 - 1 - this.field3115;
                                this.field3105 = -this.field3105;
                                if (--this.field3109 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method1471(arg0, var9, var6, var10, var4.field704[this.field3112 - 1]);
                                if (this.field3115 < var6) {
                                    return;
                                }
                                this.field3115 = var6 + var6 - 1 - this.field3115;
                                this.field3105 = -this.field3105;
                                if (--this.field3109 == 0) {
                                    break;
                                }
                                var9 = this.method1463(arg0, var9, var5, var10, var4.field704[this.field3110]);
                                if (this.field3115 >= var5) {
                                    return;
                                }
                                this.field3115 = var5 + var5 - 1 - this.field3115;
                                this.field3105 = -this.field3105;
                            } while (--this.field3109 != 0);
                        }
                    } else if (this.field3105 < 0) {
                        while (true) {
                            var9 = this.method1463(arg0, var9, var5, var10, var4.field704[this.field3112 - 1]);
                            if (this.field3115 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field3115) / var8;
                            if (var12 >= this.field3109) {
                                this.field3115 += this.field3109 * var8;
                                this.field3109 = 0;
                                break;
                            }
                            this.field3115 += var8 * var12;
                            this.field3109 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method1471(arg0, var9, var6, var10, var4.field704[this.field3110]);
                            if (this.field3115 < var6) {
                                return;
                            }
                            int var13 = (this.field3115 - var5) / var8;
                            if (var13 >= this.field3109) {
                                this.field3115 -= this.field3109 * var8;
                                this.field3109 = 0;
                                break;
                            }
                            this.field3115 -= var8 * var13;
                            this.field3109 -= var13;
                        }
                    }
                }
                if (this.field3105 < 0) {
                    this.method1463(arg0, var9, 0, var10, 0);
                    if (this.field3115 < 0) {
                        this.field3115 = -1;
                        this.method1464();
                        this.method2714(-81);
                        return;
                    }
                } else {
                    this.method1471(arg0, var9, var7, var10, 0);
                    if (this.field3115 >= var7) {
                        this.field3115 = var7;
                        this.method1464();
                        this.method2714(-122);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lr", name = "j", descriptor = "()I")
    public final synchronized int method1478() {
        return this.field3113 == Integer.MIN_VALUE ? 0 : this.field3113;
    }

    @OriginalMember(owner = "client!lr", name = "k", descriptor = "()Z")
    private final boolean method1479() {
        int var1 = this.field3113;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1473(var1, this.field3114);
            var2 = method1457(var1, this.field3114);
        }
        if (this.field3118 == var1 && this.field3117 == var3 && this.field3108 == var2) {
            if (this.field3113 == Integer.MIN_VALUE) {
                this.field3113 = 0;
                this.field3118 = this.field3117 = this.field3108 = 0;
                this.method2714(-78);
                return true;
            } else {
                this.method1470();
                return false;
            }
        } else {
            if (this.field3118 < var1) {
                this.field3107 = 1;
                this.field3111 = var1 - this.field3118;
            } else if (this.field3118 > var1) {
                this.field3107 = -1;
                this.field3111 = this.field3118 - var1;
            } else {
                this.field3107 = 0;
            }
            if (this.field3117 < var3) {
                this.field3104 = 1;
                if (this.field3111 == 0 || this.field3111 > var3 - this.field3117) {
                    this.field3111 = var3 - this.field3117;
                }
            } else if (this.field3117 > var3) {
                this.field3104 = -1;
                if (this.field3111 == 0 || this.field3111 > this.field3117 - var3) {
                    this.field3111 = this.field3117 - var3;
                }
            } else {
                this.field3104 = 0;
            }
            if (this.field3108 < var2) {
                this.field3116 = 1;
                if (this.field3111 == 0 || this.field3111 > var2 - this.field3108) {
                    this.field3111 = var2 - this.field3108;
                }
            } else if (this.field3108 > var2) {
                this.field3116 = -1;
                if (this.field3111 == 0 || this.field3111 > this.field3108 - var2) {
                    this.field3111 = this.field3108 - var2;
                }
            } else {
                this.field3116 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "(II[B[IIIIIIILlr;II)I")
    private static final int method1480(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class215 arg10, int arg11, int arg12) {
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
        arg10.field3115 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "([B[IIIIIIIILlr;)I")
    private static final int method1481(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class215 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field3117 += (var14 - arg3) * arg9.field3104;
        arg9.field3108 += (var14 - arg3) * arg9.field3116;
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
        arg9.field3118 = var12 >> 2;
        arg9.field3115 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!lr", name = "l", descriptor = "()Z")
    public final boolean method1482() {
        return this.field3111 != 0;
    }

    @OriginalMember(owner = "client!lr", name = "i", descriptor = "(I)V")
    public final synchronized void method1483(int arg0) {
        this.field3109 = arg0;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(Lqq;II)Llr;")
    public static final class215 method1484(class44 arg0, int arg1, int arg2) {
        return arg0.field704 != null && arg0.field704.length != 0 ? new class215(arg0, (int) ((long) arg0.field700 * 256L * (long) arg1 / (long) (class192.field2868 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!lr", name = "j", descriptor = "(I)V")
    private final synchronized void method1485(int arg0) {
        this.method1493(arg0, this.method1460());
    }

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "(I[B[IIIIIIIILlr;)I")
    private static final int method1486(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class215 arg10) {
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
        arg10.field3115 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "(I[B[IIIIIIIIIILlr;)I")
    private static final int method1487(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class215 arg12) {
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
        arg12.field3118 += (var19 - arg4) * arg12.field3107;
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
        arg12.field3117 = var15 >> 2;
        arg12.field3108 = var16 >> 2;
        arg12.field3115 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!lr", name = "d", descriptor = "(II[B[IIIIIIIILlr;II)I")
    private static final int method1488(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class215 arg11, int arg12, int arg13) {
        arg11.field3117 -= arg11.field3104 * arg5;
        arg11.field3108 -= arg11.field3116 * arg5;
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
        arg11.field3117 += arg11.field3104 * arg5;
        arg11.field3108 += arg11.field3116 * arg5;
        arg11.field3118 = arg6;
        arg11.field3115 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!lr", name = "c", descriptor = "()I")
    public final int method54() {
        return this.field3113 == 0 && this.field3111 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(II[B[IIIIIIIIIILlr;II)I")
    private static final int method1489(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class215 arg13, int arg14, int arg15) {
        arg13.field3118 -= arg13.field3107 * arg5;
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
        arg13.field3118 += arg13.field3107 * var22;
        arg13.field3117 = arg6;
        arg13.field3108 = arg7;
        arg13.field3115 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "([B[IIIIIIILlr;)I")
    private static final int method1490(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class215 arg8) {
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
        arg8.field3115 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!lr", name = "<init>", descriptor = "(Lqq;II)V")
    private class215(class44 arg0, int arg1, int arg2) {
        super.field74 = arg0;
        this.field3110 = arg0.field702;
        this.field3112 = arg0.field703;
        this.field3106 = arg0.field701;
        this.field3105 = arg1;
        this.field3113 = arg2;
        this.field3114 = 8192;
        this.field3115 = 0;
        this.method1470();
    }

    @OriginalMember(owner = "client!lr", name = "c", descriptor = "(II)V")
    public final synchronized void method1491(int arg0, int arg1) {
        this.method1454(arg0, arg1, this.method1460());
    }

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "(II[B[IIIIIIIIIILlr;II)I")
    private static final int method1492(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class215 arg13, int arg14, int arg15) {
        arg13.field3118 -= arg13.field3107 * arg5;
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
        arg13.field3118 += arg13.field3107 * var22;
        arg13.field3117 = arg6;
        arg13.field3108 = arg7;
        arg13.field3115 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!lr", name = "<init>", descriptor = "(Lqq;III)V")
    private class215(class44 arg0, int arg1, int arg2, int arg3) {
        super.field74 = arg0;
        this.field3110 = arg0.field702;
        this.field3112 = arg0.field703;
        this.field3106 = arg0.field701;
        this.field3105 = arg1;
        this.field3113 = arg2;
        this.field3114 = arg3;
        this.field3115 = 0;
        this.method1470();
    }

    @OriginalMember(owner = "client!lr", name = "d", descriptor = "(II)V")
    private final synchronized void method1493(int arg0, int arg1) {
        this.field3113 = arg0;
        this.field3114 = arg1;
        this.field3111 = 0;
        this.method1470();
    }
}
