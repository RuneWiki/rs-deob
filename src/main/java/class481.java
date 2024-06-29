import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class481 extends class115 {

    @OriginalMember(owner = "client!t", name = "z", descriptor = "I")
    private int field7106;

    @OriginalMember(owner = "client!t", name = "y", descriptor = "I")
    private int field7105;

    @OriginalMember(owner = "client!t", name = "r", descriptor = "Z")
    private boolean field7098;

    @OriginalMember(owner = "client!t", name = "B", descriptor = "I")
    private int field7108;

    @OriginalMember(owner = "client!t", name = "A", descriptor = "I")
    private int field7107;

    @OriginalMember(owner = "client!t", name = "u", descriptor = "I")
    private int field7101;

    @OriginalMember(owner = "client!t", name = "t", descriptor = "I")
    private int field7100;

    @OriginalMember(owner = "client!t", name = "n", descriptor = "I")
    private int field7094;

    @OriginalMember(owner = "client!t", name = "o", descriptor = "I")
    private int field7095;

    @OriginalMember(owner = "client!t", name = "p", descriptor = "I")
    private int field7096;

    @OriginalMember(owner = "client!t", name = "q", descriptor = "I")
    private int field7097;

    @OriginalMember(owner = "client!t", name = "s", descriptor = "I")
    private int field7099;

    @OriginalMember(owner = "client!t", name = "v", descriptor = "I")
    private int field7102;

    @OriginalMember(owner = "client!t", name = "w", descriptor = "I")
    private int field7103;

    @OriginalMember(owner = "client!t", name = "x", descriptor = "I")
    private int field7104;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Ljp;III)Lt;")
    public static final class481 method2854(class242 arg0, int arg1, int arg2, int arg3) {
        return arg0.field3400 != null && arg0.field3400.length != 0 ? new class481(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "([IIIII)I")
    private final int method2855(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field7104 <= 0) {
                if (this.field7108 == -256 && (this.field7100 & 255) == 0) {
                    if (class103.field1483) {
                        return method2881(0, ((class242) super.field1591).field3400, arg0, this.field7100, arg1, this.field7095, this.field7096, 0, arg3, arg2, this);
                    }
                    return method2880(((class242) super.field1591).field3400, arg0, this.field7100, arg1, this.field7094, 0, arg3, arg2, this);
                }
                if (class103.field1483) {
                    return method2885(0, 0, ((class242) super.field1591).field3400, arg0, this.field7100, arg1, this.field7095, this.field7096, 0, arg3, arg2, this, this.field7108, arg4);
                }
                return method2882(0, 0, ((class242) super.field1591).field3400, arg0, this.field7100, arg1, this.field7094, 0, arg3, arg2, this, this.field7108, arg4);
            }
            int var6 = this.field7104 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field7104 += arg1;
            if (this.field7108 == -256 && (this.field7100 & 255) == 0) {
                if (class103.field1483) {
                    arg1 = method2873(0, ((class242) super.field1591).field3400, arg0, this.field7100, arg1, this.field7095, this.field7096, this.field7102, this.field7103, 0, var6, arg2, this);
                } else {
                    arg1 = method2889(((class242) super.field1591).field3400, arg0, this.field7100, arg1, this.field7094, this.field7099, 0, var6, arg2, this);
                }
            } else if (class103.field1483) {
                arg1 = method2872(0, 0, ((class242) super.field1591).field3400, arg0, this.field7100, arg1, this.field7095, this.field7096, this.field7102, this.field7103, 0, var6, arg2, this, this.field7108, arg4);
            } else {
                arg1 = method2887(0, 0, ((class242) super.field1591).field3400, arg0, this.field7100, arg1, this.field7094, this.field7099, 0, var6, arg2, this, this.field7108, arg4);
            }
            this.field7104 -= arg1;
            if (this.field7104 != 0) {
                return arg1;
            }
        } while (!this.method2857());
        return arg3;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(I)V")
    public final synchronized void method712(int arg0) {
        if (this.field7104 > 0) {
            if (arg0 >= this.field7104) {
                if (this.field7107 == Integer.MIN_VALUE) {
                    this.field7107 = 0;
                    this.field7094 = this.field7095 = this.field7096 = 0;
                    this.method25(-13489);
                    arg0 = this.field7104;
                }
                this.field7104 = 0;
                this.method2861();
            } else {
                this.field7094 += this.field7099 * arg0;
                this.field7095 += this.field7102 * arg0;
                this.field7096 += this.field7103 * arg0;
                this.field7104 -= arg0;
            }
        }
        class242 var2 = (class242) super.field1591;
        int var3 = this.field7106 << 8;
        int var4 = this.field7105 << 8;
        int var5 = var2.field3400.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field7097 = 0;
        }
        if (this.field7100 < 0) {
            if (this.field7108 <= 0) {
                this.method2858();
                this.method25(-13489);
                return;
            }
            this.field7100 = 0;
        }
        if (this.field7100 >= var5) {
            if (this.field7108 >= 0) {
                this.method2858();
                this.method25(-13489);
                return;
            }
            this.field7100 = var5 - 1;
        }
        this.field7100 += this.field7108 * arg0;
        if (this.field7097 < 0) {
            if (!this.field7098) {
                if (this.field7108 < 0) {
                    if (this.field7100 < var3) {
                        this.field7100 = var4 - 1 - (var4 - 1 - this.field7100) % var6;
                    }
                } else if (this.field7100 >= var4) {
                    this.field7100 = (this.field7100 - var3) % var6 + var3;
                }
            } else {
                if (this.field7108 < 0) {
                    if (this.field7100 >= var3) {
                        return;
                    }
                    this.field7100 = var3 + var3 - 1 - this.field7100;
                    this.field7108 = -this.field7108;
                }
                while (this.field7100 >= var4) {
                    this.field7100 = var4 + var4 - 1 - this.field7100;
                    this.field7108 = -this.field7108;
                    if (this.field7100 >= var3) {
                        return;
                    }
                    this.field7100 = var3 + var3 - 1 - this.field7100;
                    this.field7108 = -this.field7108;
                }
            }
        } else {
            if (this.field7097 > 0) {
                if (this.field7098) {
                    label125: {
                        if (this.field7108 < 0) {
                            if (this.field7100 >= var3) {
                                return;
                            }
                            this.field7100 = var3 + var3 - 1 - this.field7100;
                            this.field7108 = -this.field7108;
                            if (--this.field7097 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field7100 < var4) {
                                return;
                            }
                            this.field7100 = var4 + var4 - 1 - this.field7100;
                            this.field7108 = -this.field7108;
                            if (--this.field7097 == 0) {
                                break;
                            }
                            if (this.field7100 >= var3) {
                                return;
                            }
                            this.field7100 = var3 + var3 - 1 - this.field7100;
                            this.field7108 = -this.field7108;
                        } while (--this.field7097 != 0);
                    }
                } else if (this.field7108 < 0) {
                    if (this.field7100 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field7100) / var6;
                    if (var7 < this.field7097) {
                        this.field7100 += var6 * var7;
                        this.field7097 -= var7;
                        return;
                    }
                    this.field7100 += this.field7097 * var6;
                    this.field7097 = 0;
                } else {
                    if (this.field7100 < var4) {
                        return;
                    }
                    int var8 = (this.field7100 - var3) / var6;
                    if (var8 < this.field7097) {
                        this.field7100 -= var6 * var8;
                        this.field7097 -= var8;
                        return;
                    }
                    this.field7100 -= this.field7097 * var6;
                    this.field7097 = 0;
                }
            }
            if (this.field7108 < 0) {
                if (this.field7100 < 0) {
                    this.field7100 = -1;
                    this.method2858();
                    this.method25(-13489);
                    return;
                }
            } else if (this.field7100 >= var5) {
                this.field7100 = var5;
                this.method2858();
                this.method25(-13489);
            }
        }
    }

    @OriginalMember(owner = "client!t", name = "d", descriptor = "()Lwq;")
    public final class115 method714() {
        return null;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(II)I")
    private static final int method2856(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!t", name = "e", descriptor = "()Z")
    private final boolean method2857() {
        int var1 = this.field7107;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method2856(var1, this.field7101);
            var2 = method2891(var1, this.field7101);
        }
        if (this.field7094 == var1 && this.field7095 == var3 && this.field7096 == var2) {
            if (this.field7107 == Integer.MIN_VALUE) {
                this.field7107 = 0;
                this.field7094 = this.field7095 = this.field7096 = 0;
                this.method25(-13489);
                return true;
            } else {
                this.method2861();
                return false;
            }
        } else {
            if (this.field7094 < var1) {
                this.field7099 = 1;
                this.field7104 = var1 - this.field7094;
            } else if (this.field7094 > var1) {
                this.field7099 = -1;
                this.field7104 = this.field7094 - var1;
            } else {
                this.field7099 = 0;
            }
            if (this.field7095 < var3) {
                this.field7102 = 1;
                if (this.field7104 == 0 || this.field7104 > var3 - this.field7095) {
                    this.field7104 = var3 - this.field7095;
                }
            } else if (this.field7095 > var3) {
                this.field7102 = -1;
                if (this.field7104 == 0 || this.field7104 > this.field7095 - var3) {
                    this.field7104 = this.field7095 - var3;
                }
            } else {
                this.field7102 = 0;
            }
            if (this.field7096 < var2) {
                this.field7103 = 1;
                if (this.field7104 == 0 || this.field7104 > var2 - this.field7096) {
                    this.field7104 = var2 - this.field7096;
                }
            } else if (this.field7096 > var2) {
                this.field7103 = -1;
                if (this.field7104 == 0 || this.field7104 > this.field7096 - var2) {
                    this.field7104 = this.field7096 - var2;
                }
            } else {
                this.field7103 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!t", name = "f", descriptor = "()V")
    private final void method2858() {
        if (this.field7104 != 0) {
            if (this.field7107 == Integer.MIN_VALUE) {
                this.field7107 = 0;
            }
            this.field7104 = 0;
            this.method2861();
        }
    }

    @OriginalMember(owner = "client!t", name = "f", descriptor = "(I)V")
    public final synchronized void method2859(int arg0) {
        int var2 = ((class242) super.field1591).field3400.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field7100 = arg0;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(I[B[IIIIIIIIIILt;)I")
    private static final int method2860(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class481 arg12) {
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
        arg12.field7094 += (var19 - arg4) * arg12.field7099;
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
        arg12.field7095 = var15 >> 2;
        arg12.field7096 = var16 >> 2;
        arg12.field7100 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!t", name = "g", descriptor = "()V")
    private final void method2861() {
        this.field7094 = this.field7107;
        this.field7095 = method2856(this.field7107, this.field7101);
        this.field7096 = method2891(this.field7107, this.field7101);
    }

    @OriginalMember(owner = "client!t", name = "h", descriptor = "()I")
    public final synchronized int method2862() {
        return this.field7107 == Integer.MIN_VALUE ? 0 : this.field7107;
    }

    @OriginalMember(owner = "client!t", name = "g", descriptor = "(I)V")
    public final synchronized void method2863(int arg0) {
        if (this.field7108 < 0) {
            this.field7108 = -arg0;
        } else {
            this.field7108 = arg0;
        }
    }

    @OriginalMember(owner = "client!t", name = "h", descriptor = "(I)V")
    public final synchronized void method2864(int arg0) {
        this.method2865(arg0 << 6, this.method2890());
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(II)V")
    private final synchronized void method2865(int arg0, int arg1) {
        this.field7107 = arg0;
        this.field7101 = arg1;
        this.field7104 = 0;
        this.method2861();
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "([B[IIIIIIIILt;)I")
    private static final int method2866(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class481 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field7095 += (var14 - arg3) * arg9.field7102;
        arg9.field7096 += (var14 - arg3) * arg9.field7103;
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
        arg9.field7094 = var12 >> 2;
        arg9.field7100 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(II[B[IIIIIIIIIILt;II)I")
    private static final int method2867(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class481 arg13, int arg14, int arg15) {
        arg13.field7094 -= arg13.field7099 * arg5;
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
        arg13.field7094 += arg13.field7099 * var22;
        arg13.field7095 = arg6;
        arg13.field7096 = arg7;
        arg13.field7100 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "()I")
    public final int method709() {
        return this.field7107 == 0 && this.field7104 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!t", name = "i", descriptor = "()Z")
    public final boolean method2868() {
        return this.field7104 != 0;
    }

    @OriginalMember(owner = "client!t", name = "i", descriptor = "(I)V")
    public final synchronized void method2869(int arg0) {
        this.field7097 = arg0;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Z)V")
    public final synchronized void method2870(boolean arg0) {
        this.field7108 = (this.field7108 >>> 31) + (this.field7108 ^ this.field7108 >> 31);
        if (arg0) {
            this.field7108 = -this.field7108;
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(II[B[IIIIIIIILt;II)I")
    private static final int method2871(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class481 arg11, int arg12, int arg13) {
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
        arg11.field7100 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "([III)V")
    public final synchronized void method708(int[] arg0, int arg1, int arg2) {
        if (this.field7107 == 0 && this.field7104 == 0) {
            this.method712(arg2);
        } else {
            class242 var4 = (class242) super.field1591;
            int var5 = this.field7106 << 8;
            int var6 = this.field7105 << 8;
            int var7 = var4.field3400.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field7097 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field7100 < 0) {
                if (this.field7108 <= 0) {
                    this.method2858();
                    this.method25(-13489);
                    return;
                }
                this.field7100 = 0;
            }
            if (this.field7100 >= var7) {
                if (this.field7108 >= 0) {
                    this.method2858();
                    this.method25(-13489);
                    return;
                }
                this.field7100 = var7 - 1;
            }
            if (this.field7097 < 0) {
                if (this.field7098) {
                    if (this.field7108 < 0) {
                        var9 = this.method2855(arg0, arg1, var5, var10, var4.field3400[this.field7106]);
                        if (this.field7100 >= var5) {
                            return;
                        }
                        this.field7100 = var5 + var5 - 1 - this.field7100;
                        this.field7108 = -this.field7108;
                    }
                    while (true) {
                        int var11 = this.method2893(arg0, var9, var6, var10, var4.field3400[this.field7105 - 1]);
                        if (this.field7100 < var6) {
                            return;
                        }
                        this.field7100 = var6 + var6 - 1 - this.field7100;
                        this.field7108 = -this.field7108;
                        var9 = this.method2855(arg0, var11, var5, var10, var4.field3400[this.field7106]);
                        if (this.field7100 >= var5) {
                            return;
                        }
                        this.field7100 = var5 + var5 - 1 - this.field7100;
                        this.field7108 = -this.field7108;
                    }
                } else if (this.field7108 < 0) {
                    while (true) {
                        var9 = this.method2855(arg0, var9, var5, var10, var4.field3400[this.field7105 - 1]);
                        if (this.field7100 >= var5) {
                            return;
                        }
                        this.field7100 = var6 - 1 - (var6 - 1 - this.field7100) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method2893(arg0, var9, var6, var10, var4.field3400[this.field7106]);
                        if (this.field7100 < var6) {
                            return;
                        }
                        this.field7100 = (this.field7100 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field7097 > 0) {
                    if (this.field7098) {
                        label130: {
                            if (this.field7108 < 0) {
                                var9 = this.method2855(arg0, arg1, var5, var10, var4.field3400[this.field7106]);
                                if (this.field7100 >= var5) {
                                    return;
                                }
                                this.field7100 = var5 + var5 - 1 - this.field7100;
                                this.field7108 = -this.field7108;
                                if (--this.field7097 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method2893(arg0, var9, var6, var10, var4.field3400[this.field7105 - 1]);
                                if (this.field7100 < var6) {
                                    return;
                                }
                                this.field7100 = var6 + var6 - 1 - this.field7100;
                                this.field7108 = -this.field7108;
                                if (--this.field7097 == 0) {
                                    break;
                                }
                                var9 = this.method2855(arg0, var9, var5, var10, var4.field3400[this.field7106]);
                                if (this.field7100 >= var5) {
                                    return;
                                }
                                this.field7100 = var5 + var5 - 1 - this.field7100;
                                this.field7108 = -this.field7108;
                            } while (--this.field7097 != 0);
                        }
                    } else if (this.field7108 < 0) {
                        while (true) {
                            var9 = this.method2855(arg0, var9, var5, var10, var4.field3400[this.field7105 - 1]);
                            if (this.field7100 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field7100) / var8;
                            if (var12 >= this.field7097) {
                                this.field7100 += this.field7097 * var8;
                                this.field7097 = 0;
                                break;
                            }
                            this.field7100 += var8 * var12;
                            this.field7097 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method2893(arg0, var9, var6, var10, var4.field3400[this.field7106]);
                            if (this.field7100 < var6) {
                                return;
                            }
                            int var13 = (this.field7100 - var5) / var8;
                            if (var13 >= this.field7097) {
                                this.field7100 -= this.field7097 * var8;
                                this.field7097 = 0;
                                break;
                            }
                            this.field7100 -= var8 * var13;
                            this.field7097 -= var13;
                        }
                    }
                }
                if (this.field7108 < 0) {
                    this.method2855(arg0, var9, 0, var10, 0);
                    if (this.field7100 < 0) {
                        this.field7100 = -1;
                        this.method2858();
                        this.method25(-13489);
                        return;
                    }
                } else {
                    this.method2893(arg0, var9, var7, var10, 0);
                    if (this.field7100 >= var7) {
                        this.field7100 = var7;
                        this.method2858();
                        this.method25(-13489);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(II[B[IIIIIIIIIILt;II)I")
    private static final int method2872(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class481 arg13, int arg14, int arg15) {
        arg13.field7094 -= arg13.field7099 * arg5;
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
        arg13.field7094 += arg13.field7099 * var22;
        arg13.field7095 = arg6;
        arg13.field7096 = arg7;
        arg13.field7100 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(I[B[IIIIIIIIIILt;)I")
    private static final int method2873(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class481 arg12) {
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
        arg12.field7094 += (var19 - arg4) * arg12.field7099;
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
        arg12.field7095 = var15 >> 2;
        arg12.field7096 = var16 >> 2;
        arg12.field7100 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!t", name = "c", descriptor = "(II)V")
    public final synchronized void method2874(int arg0, int arg1) {
        this.method2888(arg0, arg1, this.method2890());
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "()Lwq;")
    public final class115 method710() {
        return null;
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(II[B[IIIIIIIILt;II)I")
    private static final int method2875(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class481 arg11, int arg12, int arg13) {
        arg11.field7095 -= arg11.field7102 * arg5;
        arg11.field7096 -= arg11.field7103 * arg5;
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
        arg11.field7095 += arg11.field7102 * arg5;
        arg11.field7096 += arg11.field7103 * arg5;
        arg11.field7094 = arg6;
        arg11.field7100 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!t", name = "j", descriptor = "()I")
    public final synchronized int method2876() {
        return this.field7108 < 0 ? -this.field7108 : this.field7108;
    }

    @OriginalMember(owner = "client!t", name = "j", descriptor = "(I)V")
    public final synchronized void method2877(int arg0) {
        if (arg0 == 0) {
            this.method2878(0);
            this.method25(-13489);
        } else if (this.field7095 == 0 && this.field7096 == 0) {
            this.field7104 = 0;
            this.field7107 = 0;
            this.field7094 = 0;
            this.method25(-13489);
        } else {
            int var2 = -this.field7094;
            if (this.field7094 > var2) {
                var2 = this.field7094;
            }
            if (-this.field7095 > var2) {
                var2 = -this.field7095;
            }
            if (this.field7095 > var2) {
                var2 = this.field7095;
            }
            if (-this.field7096 > var2) {
                var2 = -this.field7096;
            }
            if (this.field7096 > var2) {
                var2 = this.field7096;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field7104 = arg0;
            this.field7107 = Integer.MIN_VALUE;
            this.field7099 = -this.field7094 / arg0;
            this.field7102 = -this.field7095 / arg0;
            this.field7103 = -this.field7096 / arg0;
        }
    }

    @OriginalMember(owner = "client!t", name = "k", descriptor = "(I)V")
    private final synchronized void method2878(int arg0) {
        this.method2865(arg0, this.method2890());
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(II[B[IIIIIIILt;II)I")
    private static final int method2879(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class481 arg10, int arg11, int arg12) {
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
        arg10.field7100 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!t", name = "c", descriptor = "()I")
    public final int method711() {
        int var1 = this.field7094 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field7097 == 0) {
            var2 -= this.field7100 * var2 / (((class242) super.field1591).field3400.length << 8);
        } else if (this.field7097 >= 0) {
            var2 -= this.field7106 * var2 / ((class242) super.field1591).field3400.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "([B[IIIIIIILt;)I")
    private static final int method2880(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class481 arg8) {
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
        arg8.field7100 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(I[B[IIIIIIIILt;)I")
    private static final int method2881(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class481 arg10) {
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
        arg10.field7100 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(II[B[IIIIIIILt;II)I")
    private static final int method2882(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class481 arg10, int arg11, int arg12) {
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
        arg10.field7100 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Ljp;II)Lt;")
    public static final class481 method2883(class242 arg0, int arg1, int arg2) {
        return arg0.field3400 != null && arg0.field3400.length != 0 ? new class481(arg0, (int) ((long) arg0.field3401 * 256L * (long) arg1 / (long) (class56.field818 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "([B[IIIIIIILt;)I")
    private static final int method2884(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class481 arg8) {
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
        arg8.field7100 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!t", name = "c", descriptor = "(II[B[IIIIIIIILt;II)I")
    private static final int method2885(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class481 arg11, int arg12, int arg13) {
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
        arg11.field7100 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(I[B[IIIIIIIILt;)I")
    private static final int method2886(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class481 arg10) {
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
        arg10.field7100 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!t", name = "d", descriptor = "(II[B[IIIIIIIILt;II)I")
    private static final int method2887(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class481 arg11, int arg12, int arg13) {
        arg11.field7095 -= arg11.field7102 * arg5;
        arg11.field7096 -= arg11.field7103 * arg5;
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
        arg11.field7095 += arg11.field7102 * arg5;
        arg11.field7096 += arg11.field7103 * arg5;
        arg11.field7094 = arg6;
        arg11.field7100 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(III)V")
    public final synchronized void method2888(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method2865(arg1, arg2);
        } else {
            int var4 = method2856(arg1, arg2);
            int var5 = method2891(arg1, arg2);
            if (this.field7095 == var4 && this.field7096 == var5) {
                this.field7104 = 0;
            } else {
                int var6 = arg1 - this.field7094;
                if (this.field7094 - arg1 > var6) {
                    var6 = this.field7094 - arg1;
                }
                if (var4 - this.field7095 > var6) {
                    var6 = var4 - this.field7095;
                }
                if (this.field7095 - var4 > var6) {
                    var6 = this.field7095 - var4;
                }
                if (var5 - this.field7096 > var6) {
                    var6 = var5 - this.field7096;
                }
                if (this.field7096 - var5 > var6) {
                    var6 = this.field7096 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field7104 = arg0;
                this.field7107 = arg1;
                this.field7101 = arg2;
                this.field7099 = (arg1 - this.field7094) / arg0;
                this.field7102 = (var4 - this.field7095) / arg0;
                this.field7103 = (var5 - this.field7096) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "(Ljp;II)V")
    private class481(class242 arg0, int arg1, int arg2) {
        super.field1591 = arg0;
        this.field7106 = arg0.field3399;
        this.field7105 = arg0.field3403;
        this.field7098 = arg0.field3402;
        this.field7108 = arg1;
        this.field7107 = arg2;
        this.field7101 = 8192;
        this.field7100 = 0;
        this.method2861();
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "([B[IIIIIIIILt;)I")
    private static final int method2889(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class481 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field7095 += (var14 - arg3) * arg9.field7102;
        arg9.field7096 += (var14 - arg3) * arg9.field7103;
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
        arg9.field7094 = var12 >> 2;
        arg9.field7100 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!t", name = "k", descriptor = "()I")
    public final synchronized int method2890() {
        return this.field7101 < 0 ? -1 : this.field7101;
    }

    @OriginalMember(owner = "client!t", name = "d", descriptor = "(II)I")
    private static final int method2891(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!t", name = "l", descriptor = "()Z")
    public final boolean method2892() {
        return this.field7100 < 0 || this.field7100 >= ((class242) super.field1591).field3400.length << 8;
    }

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "(Ljp;III)V")
    private class481(class242 arg0, int arg1, int arg2, int arg3) {
        super.field1591 = arg0;
        this.field7106 = arg0.field3399;
        this.field7105 = arg0.field3403;
        this.field7098 = arg0.field3402;
        this.field7108 = arg1;
        this.field7107 = arg2;
        this.field7101 = arg3;
        this.field7100 = 0;
        this.method2861();
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "([IIIII)I")
    private final int method2893(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field7104 <= 0) {
                if (this.field7108 == 256 && (this.field7100 & 255) == 0) {
                    if (class103.field1483) {
                        return method2886(0, ((class242) super.field1591).field3400, arg0, this.field7100, arg1, this.field7095, this.field7096, 0, arg3, arg2, this);
                    }
                    return method2884(((class242) super.field1591).field3400, arg0, this.field7100, arg1, this.field7094, 0, arg3, arg2, this);
                }
                if (class103.field1483) {
                    return method2871(0, 0, ((class242) super.field1591).field3400, arg0, this.field7100, arg1, this.field7095, this.field7096, 0, arg3, arg2, this, this.field7108, arg4);
                }
                return method2879(0, 0, ((class242) super.field1591).field3400, arg0, this.field7100, arg1, this.field7094, 0, arg3, arg2, this, this.field7108, arg4);
            }
            int var6 = this.field7104 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field7104 += arg1;
            if (this.field7108 == 256 && (this.field7100 & 255) == 0) {
                if (class103.field1483) {
                    arg1 = method2860(0, ((class242) super.field1591).field3400, arg0, this.field7100, arg1, this.field7095, this.field7096, this.field7102, this.field7103, 0, var6, arg2, this);
                } else {
                    arg1 = method2866(((class242) super.field1591).field3400, arg0, this.field7100, arg1, this.field7094, this.field7099, 0, var6, arg2, this);
                }
            } else if (class103.field1483) {
                arg1 = method2867(0, 0, ((class242) super.field1591).field3400, arg0, this.field7100, arg1, this.field7095, this.field7096, this.field7102, this.field7103, 0, var6, arg2, this, this.field7108, arg4);
            } else {
                arg1 = method2875(0, 0, ((class242) super.field1591).field3400, arg0, this.field7100, arg1, this.field7094, this.field7099, 0, var6, arg2, this, this.field7108, arg4);
            }
            this.field7104 -= arg1;
            if (this.field7104 != 0) {
                return arg1;
            }
        } while (!this.method2857());
        return arg3;
    }
}
