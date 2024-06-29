import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class148 extends class425 {

    @OriginalMember(owner = "client!qe", name = "E", descriptor = "I")
    private int field2156;

    @OriginalMember(owner = "client!qe", name = "B", descriptor = "I")
    private int field2153;

    @OriginalMember(owner = "client!qe", name = "v", descriptor = "Z")
    private boolean field2147;

    @OriginalMember(owner = "client!qe", name = "F", descriptor = "I")
    private int field2157;

    @OriginalMember(owner = "client!qe", name = "x", descriptor = "I")
    private int field2149;

    @OriginalMember(owner = "client!qe", name = "u", descriptor = "I")
    private int field2146;

    @OriginalMember(owner = "client!qe", name = "G", descriptor = "I")
    private int field2158;

    @OriginalMember(owner = "client!qe", name = "t", descriptor = "I")
    private int field2145;

    @OriginalMember(owner = "client!qe", name = "w", descriptor = "I")
    private int field2148;

    @OriginalMember(owner = "client!qe", name = "y", descriptor = "I")
    private int field2150;

    @OriginalMember(owner = "client!qe", name = "z", descriptor = "I")
    private int field2151;

    @OriginalMember(owner = "client!qe", name = "A", descriptor = "I")
    private int field2152;

    @OriginalMember(owner = "client!qe", name = "C", descriptor = "I")
    private int field2154;

    @OriginalMember(owner = "client!qe", name = "D", descriptor = "I")
    private int field2155;

    @OriginalMember(owner = "client!qe", name = "H", descriptor = "I")
    private int field2159;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "([B[IIIIIIILqe;)I")
    private static final int method1067(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class148 arg8) {
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
        arg8.field2158 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(I[B[IIIIIIIILqe;)I")
    private static final int method1068(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class148 arg10) {
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
        arg10.field2158 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(II[B[IIIIIIIIIILqe;II)I")
    private static final int method1069(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class148 arg13, int arg14, int arg15) {
        arg13.field2154 -= arg13.field2148 * arg5;
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
        arg13.field2154 += arg13.field2148 * var22;
        arg13.field2150 = arg6;
        arg13.field2151 = arg7;
        arg13.field2158 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "([B[IIIIIIILqe;)I")
    private static final int method1070(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class148 arg8) {
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
        arg8.field2158 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(II)I")
    private static final int method1071(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "()I")
    public final int method103() {
        return this.field2149 == 0 && this.field2152 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "(I)V")
    private final synchronized void method1072(int arg0) {
        this.method1081(arg0, this.method1078());
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(II[B[IIIIIIIILqe;II)I")
    private static final int method1073(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class148 arg11, int arg12, int arg13) {
        arg11.field2150 -= arg11.field2145 * arg5;
        arg11.field2151 -= arg11.field2159 * arg5;
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
        arg11.field2150 += arg11.field2145 * arg5;
        arg11.field2151 += arg11.field2159 * arg5;
        arg11.field2154 = arg6;
        arg11.field2158 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "([IIIII)I")
    private final int method1074(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field2152 <= 0) {
                if (this.field2157 == -256 && (this.field2158 & 255) == 0) {
                    if (class105.field1478) {
                        return method1068(0, ((class224) super.field5917).field3115, arg0, this.field2158, arg1, this.field2150, this.field2151, 0, arg3, arg2, this);
                    }
                    return method1070(((class224) super.field5917).field3115, arg0, this.field2158, arg1, this.field2154, 0, arg3, arg2, this);
                }
                if (class105.field1478) {
                    return method1104(0, 0, ((class224) super.field5917).field3115, arg0, this.field2158, arg1, this.field2150, this.field2151, 0, arg3, arg2, this, this.field2157, arg4);
                }
                return method1098(0, 0, ((class224) super.field5917).field3115, arg0, this.field2158, arg1, this.field2154, 0, arg3, arg2, this, this.field2157, arg4);
            }
            int var6 = this.field2152 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field2152 += arg1;
            if (this.field2157 == -256 && (this.field2158 & 255) == 0) {
                if (class105.field1478) {
                    arg1 = method1084(0, ((class224) super.field5917).field3115, arg0, this.field2158, arg1, this.field2150, this.field2151, this.field2145, this.field2159, 0, var6, arg2, this);
                } else {
                    arg1 = method1102(((class224) super.field5917).field3115, arg0, this.field2158, arg1, this.field2154, this.field2148, 0, var6, arg2, this);
                }
            } else if (class105.field1478) {
                arg1 = method1106(0, 0, ((class224) super.field5917).field3115, arg0, this.field2158, arg1, this.field2150, this.field2151, this.field2145, this.field2159, 0, var6, arg2, this, this.field2157, arg4);
            } else {
                arg1 = method1075(0, 0, ((class224) super.field5917).field3115, arg0, this.field2158, arg1, this.field2154, this.field2148, 0, var6, arg2, this, this.field2157, arg4);
            }
            this.field2152 -= arg1;
            if (this.field2152 != 0) {
                return arg1;
            }
        } while (!this.method1095());
        return arg3;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "([III)V")
    public final synchronized void method106(int[] arg0, int arg1, int arg2) {
        if (this.field2149 == 0 && this.field2152 == 0) {
            this.method97(arg2);
        } else {
            class224 var4 = (class224) super.field5917;
            int var5 = this.field2156 << 8;
            int var6 = this.field2153 << 8;
            int var7 = var4.field3115.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field2155 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field2158 < 0) {
                if (this.field2157 <= 0) {
                    this.method1099();
                    this.method1884(false);
                    return;
                }
                this.field2158 = 0;
            }
            if (this.field2158 >= var7) {
                if (this.field2157 >= 0) {
                    this.method1099();
                    this.method1884(false);
                    return;
                }
                this.field2158 = var7 - 1;
            }
            if (this.field2155 < 0) {
                if (this.field2147) {
                    if (this.field2157 < 0) {
                        var9 = this.method1074(arg0, arg1, var5, var10, var4.field3115[this.field2156]);
                        if (this.field2158 >= var5) {
                            return;
                        }
                        this.field2158 = var5 + var5 - 1 - this.field2158;
                        this.field2157 = -this.field2157;
                    }
                    while (true) {
                        int var11 = this.method1089(arg0, var9, var6, var10, var4.field3115[this.field2153 - 1]);
                        if (this.field2158 < var6) {
                            return;
                        }
                        this.field2158 = var6 + var6 - 1 - this.field2158;
                        this.field2157 = -this.field2157;
                        var9 = this.method1074(arg0, var11, var5, var10, var4.field3115[this.field2156]);
                        if (this.field2158 >= var5) {
                            return;
                        }
                        this.field2158 = var5 + var5 - 1 - this.field2158;
                        this.field2157 = -this.field2157;
                    }
                } else if (this.field2157 < 0) {
                    while (true) {
                        var9 = this.method1074(arg0, var9, var5, var10, var4.field3115[this.field2153 - 1]);
                        if (this.field2158 >= var5) {
                            return;
                        }
                        this.field2158 = var6 - 1 - (var6 - 1 - this.field2158) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method1089(arg0, var9, var6, var10, var4.field3115[this.field2156]);
                        if (this.field2158 < var6) {
                            return;
                        }
                        this.field2158 = (this.field2158 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field2155 > 0) {
                    if (this.field2147) {
                        label130: {
                            if (this.field2157 < 0) {
                                var9 = this.method1074(arg0, arg1, var5, var10, var4.field3115[this.field2156]);
                                if (this.field2158 >= var5) {
                                    return;
                                }
                                this.field2158 = var5 + var5 - 1 - this.field2158;
                                this.field2157 = -this.field2157;
                                if (--this.field2155 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method1089(arg0, var9, var6, var10, var4.field3115[this.field2153 - 1]);
                                if (this.field2158 < var6) {
                                    return;
                                }
                                this.field2158 = var6 + var6 - 1 - this.field2158;
                                this.field2157 = -this.field2157;
                                if (--this.field2155 == 0) {
                                    break;
                                }
                                var9 = this.method1074(arg0, var9, var5, var10, var4.field3115[this.field2156]);
                                if (this.field2158 >= var5) {
                                    return;
                                }
                                this.field2158 = var5 + var5 - 1 - this.field2158;
                                this.field2157 = -this.field2157;
                            } while (--this.field2155 != 0);
                        }
                    } else if (this.field2157 < 0) {
                        while (true) {
                            var9 = this.method1074(arg0, var9, var5, var10, var4.field3115[this.field2153 - 1]);
                            if (this.field2158 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field2158) / var8;
                            if (var12 >= this.field2155) {
                                this.field2158 += this.field2155 * var8;
                                this.field2155 = 0;
                                break;
                            }
                            this.field2158 += var8 * var12;
                            this.field2155 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method1089(arg0, var9, var6, var10, var4.field3115[this.field2156]);
                            if (this.field2158 < var6) {
                                return;
                            }
                            int var13 = (this.field2158 - var5) / var8;
                            if (var13 >= this.field2155) {
                                this.field2158 -= this.field2155 * var8;
                                this.field2155 = 0;
                                break;
                            }
                            this.field2158 -= var8 * var13;
                            this.field2155 -= var13;
                        }
                    }
                }
                if (this.field2157 < 0) {
                    this.method1074(arg0, var9, 0, var10, 0);
                    if (this.field2158 < 0) {
                        this.field2158 = -1;
                        this.method1099();
                        this.method1884(false);
                        return;
                    }
                } else {
                    this.method1089(arg0, var9, var7, var10, 0);
                    if (this.field2158 >= var7) {
                        this.field2158 = var7;
                        this.method1099();
                        this.method1884(false);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "()Lrb;")
    public final class425 method100() {
        return null;
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(II[B[IIIIIIIILqe;II)I")
    private static final int method1075(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class148 arg11, int arg12, int arg13) {
        arg11.field2150 -= arg11.field2145 * arg5;
        arg11.field2151 -= arg11.field2159 * arg5;
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
        arg11.field2150 += arg11.field2145 * arg5;
        arg11.field2151 += arg11.field2159 * arg5;
        arg11.field2154 = arg6;
        arg11.field2158 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "(II[B[IIIIIIIILqe;II)I")
    private static final int method1076(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class148 arg11, int arg12, int arg13) {
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
        arg11.field2158 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "(II)V")
    public final synchronized void method1077(int arg0, int arg1) {
        this.method1093(arg0, arg1, this.method1078());
    }

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "()I")
    public final synchronized int method1078() {
        return this.field2146 < 0 ? -1 : this.field2146;
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(Z)V")
    public final synchronized void method1079(boolean arg0) {
        this.field2157 = (this.field2157 >>> 31) + (this.field2157 ^ this.field2157 >> 31);
        if (arg0) {
            this.field2157 = -this.field2157;
        }
    }

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "(I)V")
    public final synchronized void method1080(int arg0) {
        int var2 = ((class224) super.field5917).field3115.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field2158 = arg0;
    }

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "(II)V")
    private final synchronized void method1081(int arg0, int arg1) {
        this.field2149 = arg0;
        this.field2146 = arg1;
        this.field2152 = 0;
        this.method1101();
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "()I")
    public final int method1082() {
        int var1 = this.field2154 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field2155 == 0) {
            var2 -= this.field2158 * var2 / (((class224) super.field5917).field3115.length << 8);
        } else if (this.field2155 >= 0) {
            var2 -= this.field2156 * var2 / ((class224) super.field5917).field3115.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "(I)V")
    public final synchronized void method1083(int arg0) {
        if (this.field2157 < 0) {
            this.field2157 = -arg0;
        } else {
            this.field2157 = arg0;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(I[B[IIIIIIIIIILqe;)I")
    private static final int method1084(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class148 arg12) {
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
        arg12.field2154 += (var19 - arg4) * arg12.field2148;
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
        arg12.field2150 = var15 >> 2;
        arg12.field2151 = var16 >> 2;
        arg12.field2158 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!qe", name = "g", descriptor = "(I)V")
    public final synchronized void method1085(int arg0) {
        this.method1081(arg0 << 6, this.method1078());
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Ldg;III)Lqe;")
    public static final class148 method1086(class224 arg0, int arg1, int arg2, int arg3) {
        return arg0.field3115 != null && arg0.field3115.length != 0 ? new class148(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Ldg;II)Lqe;")
    public static final class148 method1087(class224 arg0, int arg1, int arg2) {
        return arg0.field3115 != null && arg0.field3115.length != 0 ? new class148(arg0, (int) ((long) arg0.field3111 * 256L * (long) arg1 / (long) (class231.field3248 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "()I")
    public final synchronized int method1088() {
        return this.field2149 == Integer.MIN_VALUE ? 0 : this.field2149;
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "([IIIII)I")
    private final int method1089(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field2152 <= 0) {
                if (this.field2157 == 256 && (this.field2158 & 255) == 0) {
                    if (class105.field1478) {
                        return method1090(0, ((class224) super.field5917).field3115, arg0, this.field2158, arg1, this.field2150, this.field2151, 0, arg3, arg2, this);
                    }
                    return method1067(((class224) super.field5917).field3115, arg0, this.field2158, arg1, this.field2154, 0, arg3, arg2, this);
                }
                if (class105.field1478) {
                    return method1076(0, 0, ((class224) super.field5917).field3115, arg0, this.field2158, arg1, this.field2150, this.field2151, 0, arg3, arg2, this, this.field2157, arg4);
                }
                return method1105(0, 0, ((class224) super.field5917).field3115, arg0, this.field2158, arg1, this.field2154, 0, arg3, arg2, this, this.field2157, arg4);
            }
            int var6 = this.field2152 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field2152 += arg1;
            if (this.field2157 == 256 && (this.field2158 & 255) == 0) {
                if (class105.field1478) {
                    arg1 = method1094(0, ((class224) super.field5917).field3115, arg0, this.field2158, arg1, this.field2150, this.field2151, this.field2145, this.field2159, 0, var6, arg2, this);
                } else {
                    arg1 = method1096(((class224) super.field5917).field3115, arg0, this.field2158, arg1, this.field2154, this.field2148, 0, var6, arg2, this);
                }
            } else if (class105.field1478) {
                arg1 = method1069(0, 0, ((class224) super.field5917).field3115, arg0, this.field2158, arg1, this.field2150, this.field2151, this.field2145, this.field2159, 0, var6, arg2, this, this.field2157, arg4);
            } else {
                arg1 = method1073(0, 0, ((class224) super.field5917).field3115, arg0, this.field2158, arg1, this.field2154, this.field2148, 0, var6, arg2, this, this.field2157, arg4);
            }
            this.field2152 -= arg1;
            if (this.field2152 != 0) {
                return arg1;
            }
        } while (!this.method1095());
        return arg3;
    }

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "(I)V")
    public final synchronized void method97(int arg0) {
        if (this.field2152 > 0) {
            if (arg0 >= this.field2152) {
                if (this.field2149 == Integer.MIN_VALUE) {
                    this.field2149 = 0;
                    this.field2154 = this.field2150 = this.field2151 = 0;
                    this.method1884(false);
                    arg0 = this.field2152;
                }
                this.field2152 = 0;
                this.method1101();
            } else {
                this.field2154 += this.field2148 * arg0;
                this.field2150 += this.field2145 * arg0;
                this.field2151 += this.field2159 * arg0;
                this.field2152 -= arg0;
            }
        }
        class224 var2 = (class224) super.field5917;
        int var3 = this.field2156 << 8;
        int var4 = this.field2153 << 8;
        int var5 = var2.field3115.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field2155 = 0;
        }
        if (this.field2158 < 0) {
            if (this.field2157 <= 0) {
                this.method1099();
                this.method1884(false);
                return;
            }
            this.field2158 = 0;
        }
        if (this.field2158 >= var5) {
            if (this.field2157 >= 0) {
                this.method1099();
                this.method1884(false);
                return;
            }
            this.field2158 = var5 - 1;
        }
        this.field2158 += this.field2157 * arg0;
        if (this.field2155 < 0) {
            if (!this.field2147) {
                if (this.field2157 < 0) {
                    if (this.field2158 < var3) {
                        this.field2158 = var4 - 1 - (var4 - 1 - this.field2158) % var6;
                    }
                } else if (this.field2158 >= var4) {
                    this.field2158 = (this.field2158 - var3) % var6 + var3;
                }
            } else {
                if (this.field2157 < 0) {
                    if (this.field2158 >= var3) {
                        return;
                    }
                    this.field2158 = var3 + var3 - 1 - this.field2158;
                    this.field2157 = -this.field2157;
                }
                while (this.field2158 >= var4) {
                    this.field2158 = var4 + var4 - 1 - this.field2158;
                    this.field2157 = -this.field2157;
                    if (this.field2158 >= var3) {
                        return;
                    }
                    this.field2158 = var3 + var3 - 1 - this.field2158;
                    this.field2157 = -this.field2157;
                }
            }
        } else {
            if (this.field2155 > 0) {
                if (this.field2147) {
                    label125: {
                        if (this.field2157 < 0) {
                            if (this.field2158 >= var3) {
                                return;
                            }
                            this.field2158 = var3 + var3 - 1 - this.field2158;
                            this.field2157 = -this.field2157;
                            if (--this.field2155 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field2158 < var4) {
                                return;
                            }
                            this.field2158 = var4 + var4 - 1 - this.field2158;
                            this.field2157 = -this.field2157;
                            if (--this.field2155 == 0) {
                                break;
                            }
                            if (this.field2158 >= var3) {
                                return;
                            }
                            this.field2158 = var3 + var3 - 1 - this.field2158;
                            this.field2157 = -this.field2157;
                        } while (--this.field2155 != 0);
                    }
                } else if (this.field2157 < 0) {
                    if (this.field2158 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field2158) / var6;
                    if (var7 < this.field2155) {
                        this.field2158 += var6 * var7;
                        this.field2155 -= var7;
                        return;
                    }
                    this.field2158 += this.field2155 * var6;
                    this.field2155 = 0;
                } else {
                    if (this.field2158 < var4) {
                        return;
                    }
                    int var8 = (this.field2158 - var3) / var6;
                    if (var8 < this.field2155) {
                        this.field2158 -= var6 * var8;
                        this.field2155 -= var8;
                        return;
                    }
                    this.field2158 -= this.field2155 * var6;
                    this.field2155 = 0;
                }
            }
            if (this.field2157 < 0) {
                if (this.field2158 < 0) {
                    this.field2158 = -1;
                    this.method1099();
                    this.method1884(false);
                    return;
                }
            } else if (this.field2158 >= var5) {
                this.field2158 = var5;
                this.method1099();
                this.method1884(false);
            }
        }
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(I[B[IIIIIIIILqe;)I")
    private static final int method1090(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class148 arg10) {
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
        arg10.field2158 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!qe", name = "h", descriptor = "(I)V")
    public final synchronized void method1091(int arg0) {
        if (arg0 == 0) {
            this.method1072(0);
            this.method1884(false);
        } else if (this.field2150 == 0 && this.field2151 == 0) {
            this.field2152 = 0;
            this.field2149 = 0;
            this.field2154 = 0;
            this.method1884(false);
        } else {
            int var2 = -this.field2154;
            if (this.field2154 > var2) {
                var2 = this.field2154;
            }
            if (-this.field2150 > var2) {
                var2 = -this.field2150;
            }
            if (this.field2150 > var2) {
                var2 = this.field2150;
            }
            if (-this.field2151 > var2) {
                var2 = -this.field2151;
            }
            if (this.field2151 > var2) {
                var2 = this.field2151;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field2152 = arg0;
            this.field2149 = Integer.MIN_VALUE;
            this.field2148 = -this.field2154 / arg0;
            this.field2145 = -this.field2150 / arg0;
            this.field2159 = -this.field2151 / arg0;
        }
    }

    @OriginalMember(owner = "client!qe", name = "g", descriptor = "()Z")
    public final boolean method1092() {
        return this.field2152 != 0;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(III)V")
    public final synchronized void method1093(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1081(arg1, arg2);
        } else {
            int var4 = method1071(arg1, arg2);
            int var5 = method1100(arg1, arg2);
            if (this.field2150 == var4 && this.field2151 == var5) {
                this.field2152 = 0;
            } else {
                int var6 = arg1 - this.field2154;
                if (this.field2154 - arg1 > var6) {
                    var6 = this.field2154 - arg1;
                }
                if (var4 - this.field2150 > var6) {
                    var6 = var4 - this.field2150;
                }
                if (this.field2150 - var4 > var6) {
                    var6 = this.field2150 - var4;
                }
                if (var5 - this.field2151 > var6) {
                    var6 = var5 - this.field2151;
                }
                if (this.field2151 - var5 > var6) {
                    var6 = this.field2151 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field2152 = arg0;
                this.field2149 = arg1;
                this.field2146 = arg2;
                this.field2148 = (arg1 - this.field2154) / arg0;
                this.field2145 = (var4 - this.field2150) / arg0;
                this.field2159 = (var5 - this.field2151) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(I[B[IIIIIIIIIILqe;)I")
    private static final int method1094(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class148 arg12) {
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
        arg12.field2154 += (var19 - arg4) * arg12.field2148;
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
        arg12.field2150 = var15 >> 2;
        arg12.field2151 = var16 >> 2;
        arg12.field2158 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "()Lrb;")
    public final class425 method105() {
        return null;
    }

    @OriginalMember(owner = "client!qe", name = "h", descriptor = "()Z")
    private final boolean method1095() {
        int var1 = this.field2149;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1071(var1, this.field2146);
            var2 = method1100(var1, this.field2146);
        }
        if (this.field2154 == var1 && this.field2150 == var3 && this.field2151 == var2) {
            if (this.field2149 == Integer.MIN_VALUE) {
                this.field2149 = 0;
                this.field2154 = this.field2150 = this.field2151 = 0;
                this.method1884(false);
                return true;
            } else {
                this.method1101();
                return false;
            }
        } else {
            if (this.field2154 < var1) {
                this.field2148 = 1;
                this.field2152 = var1 - this.field2154;
            } else if (this.field2154 > var1) {
                this.field2148 = -1;
                this.field2152 = this.field2154 - var1;
            } else {
                this.field2148 = 0;
            }
            if (this.field2150 < var3) {
                this.field2145 = 1;
                if (this.field2152 == 0 || this.field2152 > var3 - this.field2150) {
                    this.field2152 = var3 - this.field2150;
                }
            } else if (this.field2150 > var3) {
                this.field2145 = -1;
                if (this.field2152 == 0 || this.field2152 > this.field2150 - var3) {
                    this.field2152 = this.field2150 - var3;
                }
            } else {
                this.field2145 = 0;
            }
            if (this.field2151 < var2) {
                this.field2159 = 1;
                if (this.field2152 == 0 || this.field2152 > var2 - this.field2151) {
                    this.field2152 = var2 - this.field2151;
                }
            } else if (this.field2151 > var2) {
                this.field2159 = -1;
                if (this.field2152 == 0 || this.field2152 > this.field2151 - var2) {
                    this.field2152 = this.field2151 - var2;
                }
            } else {
                this.field2159 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "([B[IIIIIIIILqe;)I")
    private static final int method1096(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class148 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field2150 += (var14 - arg3) * arg9.field2145;
        arg9.field2151 += (var14 - arg3) * arg9.field2159;
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
        arg9.field2154 = var12 >> 2;
        arg9.field2158 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!qe", name = "i", descriptor = "(I)V")
    public final synchronized void method1097(int arg0) {
        this.field2155 = arg0;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(II[B[IIIIIIILqe;II)I")
    private static final int method1098(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class148 arg10, int arg11, int arg12) {
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
        arg10.field2158 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!qe", name = "i", descriptor = "()V")
    private final void method1099() {
        if (this.field2152 != 0) {
            if (this.field2149 == Integer.MIN_VALUE) {
                this.field2149 = 0;
            }
            this.field2152 = 0;
            this.method1101();
        }
    }

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "(II)I")
    private static final int method1100(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!qe", name = "j", descriptor = "()V")
    private final void method1101() {
        this.field2154 = this.field2149;
        this.field2150 = method1071(this.field2149, this.field2146);
        this.field2151 = method1100(this.field2149, this.field2146);
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "([B[IIIIIIIILqe;)I")
    private static final int method1102(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class148 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field2150 += (var14 - arg3) * arg9.field2145;
        arg9.field2151 += (var14 - arg3) * arg9.field2159;
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
        arg9.field2154 = var12 >> 2;
        arg9.field2158 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!qe", name = "k", descriptor = "()Z")
    public final boolean method1103() {
        return this.field2158 < 0 || this.field2158 >= ((class224) super.field5917).field3115.length << 8;
    }

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(Ldg;II)V")
    private class148(class224 arg0, int arg1, int arg2) {
        super.field5917 = arg0;
        this.field2156 = arg0.field3113;
        this.field2153 = arg0.field3114;
        this.field2147 = arg0.field3112;
        this.field2157 = arg1;
        this.field2149 = arg2;
        this.field2146 = 8192;
        this.field2158 = 0;
        this.method1101();
    }

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "(II[B[IIIIIIIILqe;II)I")
    private static final int method1104(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class148 arg11, int arg12, int arg13) {
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
        arg11.field2158 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(II[B[IIIIIIILqe;II)I")
    private static final int method1105(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class148 arg10, int arg11, int arg12) {
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
        arg10.field2158 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(II[B[IIIIIIIIIILqe;II)I")
    private static final int method1106(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class148 arg13, int arg14, int arg15) {
        arg13.field2154 -= arg13.field2148 * arg5;
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
        arg13.field2154 += arg13.field2148 * var22;
        arg13.field2150 = arg6;
        arg13.field2151 = arg7;
        arg13.field2158 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(Ldg;III)V")
    private class148(class224 arg0, int arg1, int arg2, int arg3) {
        super.field5917 = arg0;
        this.field2156 = arg0.field3113;
        this.field2153 = arg0.field3114;
        this.field2147 = arg0.field3112;
        this.field2157 = arg1;
        this.field2149 = arg2;
        this.field2146 = arg3;
        this.field2158 = 0;
        this.method1101();
    }

    @OriginalMember(owner = "client!qe", name = "l", descriptor = "()I")
    public final synchronized int method1107() {
        return this.field2157 < 0 ? -this.field2157 : this.field2157;
    }
}
