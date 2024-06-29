import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class44 extends class145 {

    @OriginalMember(owner = "client!ee", name = "A", descriptor = "I")
    private int field1056;

    @OriginalMember(owner = "client!ee", name = "w", descriptor = "I")
    private int field1052;

    @OriginalMember(owner = "client!ee", name = "G", descriptor = "Z")
    private boolean field1062;

    @OriginalMember(owner = "client!ee", name = "y", descriptor = "I")
    private int field1054;

    @OriginalMember(owner = "client!ee", name = "v", descriptor = "I")
    private int field1051;

    @OriginalMember(owner = "client!ee", name = "B", descriptor = "I")
    private int field1057;

    @OriginalMember(owner = "client!ee", name = "E", descriptor = "I")
    private int field1060;

    @OriginalMember(owner = "client!ee", name = "t", descriptor = "I")
    private int field1049;

    @OriginalMember(owner = "client!ee", name = "u", descriptor = "I")
    private int field1050;

    @OriginalMember(owner = "client!ee", name = "x", descriptor = "I")
    private int field1053;

    @OriginalMember(owner = "client!ee", name = "z", descriptor = "I")
    private int field1055;

    @OriginalMember(owner = "client!ee", name = "C", descriptor = "I")
    private int field1058;

    @OriginalMember(owner = "client!ee", name = "D", descriptor = "I")
    private int field1059;

    @OriginalMember(owner = "client!ee", name = "F", descriptor = "I")
    private int field1061;

    @OriginalMember(owner = "client!ee", name = "H", descriptor = "I")
    private int field1063;

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "(I)V")
    public final synchronized void method412(int arg0) {
        int var2 = ((class120) super.field3092).field2656.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1060 = arg0;
    }

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "()Z")
    private final boolean method413() {
        int var1 = this.field1051;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method434(var1, this.field1057);
            var2 = method438(var1, this.field1057);
        }
        if (this.field1050 == var1 && this.field1049 == var3 && this.field1063 == var2) {
            if (this.field1051 == Integer.MIN_VALUE) {
                this.field1051 = 0;
                this.field1050 = this.field1049 = this.field1063 = 0;
                this.method1172(-56);
                return true;
            } else {
                this.method424();
                return false;
            }
        } else {
            if (this.field1050 < var1) {
                this.field1059 = 1;
                this.field1053 = var1 - this.field1050;
            } else if (this.field1050 > var1) {
                this.field1059 = -1;
                this.field1053 = this.field1050 - var1;
            } else {
                this.field1059 = 0;
            }
            if (this.field1049 < var3) {
                this.field1055 = 1;
                if (this.field1053 == 0 || this.field1053 > var3 - this.field1049) {
                    this.field1053 = var3 - this.field1049;
                }
            } else if (this.field1049 > var3) {
                this.field1055 = -1;
                if (this.field1053 == 0 || this.field1053 > this.field1049 - var3) {
                    this.field1053 = this.field1049 - var3;
                }
            } else {
                this.field1055 = 0;
            }
            if (this.field1063 < var2) {
                this.field1061 = 1;
                if (this.field1053 == 0 || this.field1053 > var2 - this.field1063) {
                    this.field1053 = var2 - this.field1063;
                }
            } else if (this.field1063 > var2) {
                this.field1061 = -1;
                if (this.field1053 == 0 || this.field1053 > this.field1063 - var2) {
                    this.field1053 = this.field1063 - var2;
                }
            } else {
                this.field1061 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "([B[IIIIIIIILee;)I")
    private static final int method414(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class44 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1049 += (var14 - arg3) * arg9.field1055;
        arg9.field1063 += (var14 - arg3) * arg9.field1061;
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
        arg9.field1050 = var12 >> 2;
        arg9.field1060 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(III)V")
    public final synchronized void method415(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method421(arg1, arg2);
        } else {
            int var4 = method434(arg1, arg2);
            int var5 = method438(arg1, arg2);
            if (this.field1049 == var4 && this.field1063 == var5) {
                this.field1053 = 0;
            } else {
                int var6 = arg1 - this.field1050;
                if (this.field1050 - arg1 > var6) {
                    var6 = this.field1050 - arg1;
                }
                if (var4 - this.field1049 > var6) {
                    var6 = var4 - this.field1049;
                }
                if (this.field1049 - var4 > var6) {
                    var6 = this.field1049 - var4;
                }
                if (var5 - this.field1063 > var6) {
                    var6 = var5 - this.field1063;
                }
                if (this.field1063 - var5 > var6) {
                    var6 = this.field1063 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field1053 = arg0;
                this.field1051 = arg1;
                this.field1057 = arg2;
                this.field1059 = (arg1 - this.field1050) / arg0;
                this.field1055 = (var4 - this.field1049) / arg0;
                this.field1061 = (var5 - this.field1063) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(II[B[IIIIIIIILee;II)I")
    private static final int method416(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class44 arg11, int arg12, int arg13) {
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
        arg11.field1060 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "(I)V")
    public final synchronized void method417(int arg0) {
        this.field1058 = arg0;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(II)V")
    public final synchronized void method418(int arg0, int arg1) {
        this.method415(arg0, arg1, this.method435());
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(II[B[IIIIIIILee;II)I")
    private static final int method419(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class44 arg10, int arg11, int arg12) {
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
        arg10.field1060 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "(Z)V")
    public final synchronized void method420(boolean arg0) {
        this.field1054 = (this.field1054 >>> 31) + (this.field1054 ^ this.field1054 >> 31);
        if (arg0) {
            this.field1054 = -this.field1054;
        }
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(II)V")
    private final synchronized void method421(int arg0, int arg1) {
        this.field1051 = arg0;
        this.field1057 = arg1;
        this.field1053 = 0;
        this.method424();
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(I[B[IIIIIIIIIILee;)I")
    private static final int method422(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class44 arg12) {
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
        arg12.field1050 += (var19 - arg4) * arg12.field1059;
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
        arg12.field1049 = var15 >> 2;
        arg12.field1063 = var16 >> 2;
        arg12.field1060 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "(I)V")
    public final synchronized void method423(int arg0) {
        if (this.field1054 < 0) {
            this.field1054 = -arg0;
        } else {
            this.field1054 = arg0;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "([III)V")
    public final synchronized void method375(int[] arg0, int arg1, int arg2) {
        if (this.field1051 == 0 && this.field1053 == 0) {
            this.method396(arg2);
        } else {
            class120 var4 = (class120) super.field3092;
            int var5 = this.field1056 << 8;
            int var6 = this.field1052 << 8;
            int var7 = var4.field2656.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field1058 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field1060 < 0) {
                if (this.field1054 <= 0) {
                    this.method444();
                    this.method1172(-22);
                    return;
                }
                this.field1060 = 0;
            }
            if (this.field1060 >= var7) {
                if (this.field1054 >= 0) {
                    this.method444();
                    this.method1172(-52);
                    return;
                }
                this.field1060 = var7 - 1;
            }
            if (this.field1058 < 0) {
                if (this.field1062) {
                    if (this.field1054 < 0) {
                        var9 = this.method433(arg0, arg1, var5, var10, var4.field2656[this.field1056]);
                        if (this.field1060 >= var5) {
                            return;
                        }
                        this.field1060 = var5 + var5 - 1 - this.field1060;
                        this.field1054 = -this.field1054;
                    }
                    while (true) {
                        int var11 = this.method432(arg0, var9, var6, var10, var4.field2656[this.field1052 - 1]);
                        if (this.field1060 < var6) {
                            return;
                        }
                        this.field1060 = var6 + var6 - 1 - this.field1060;
                        this.field1054 = -this.field1054;
                        var9 = this.method433(arg0, var11, var5, var10, var4.field2656[this.field1056]);
                        if (this.field1060 >= var5) {
                            return;
                        }
                        this.field1060 = var5 + var5 - 1 - this.field1060;
                        this.field1054 = -this.field1054;
                    }
                } else if (this.field1054 < 0) {
                    while (true) {
                        var9 = this.method433(arg0, var9, var5, var10, var4.field2656[this.field1052 - 1]);
                        if (this.field1060 >= var5) {
                            return;
                        }
                        this.field1060 = var6 - 1 - (var6 - 1 - this.field1060) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method432(arg0, var9, var6, var10, var4.field2656[this.field1056]);
                        if (this.field1060 < var6) {
                            return;
                        }
                        this.field1060 = (this.field1060 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field1058 > 0) {
                    if (this.field1062) {
                        label130: {
                            if (this.field1054 < 0) {
                                var9 = this.method433(arg0, arg1, var5, var10, var4.field2656[this.field1056]);
                                if (this.field1060 >= var5) {
                                    return;
                                }
                                this.field1060 = var5 + var5 - 1 - this.field1060;
                                this.field1054 = -this.field1054;
                                if (--this.field1058 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method432(arg0, var9, var6, var10, var4.field2656[this.field1052 - 1]);
                                if (this.field1060 < var6) {
                                    return;
                                }
                                this.field1060 = var6 + var6 - 1 - this.field1060;
                                this.field1054 = -this.field1054;
                                if (--this.field1058 == 0) {
                                    break;
                                }
                                var9 = this.method433(arg0, var9, var5, var10, var4.field2656[this.field1056]);
                                if (this.field1060 >= var5) {
                                    return;
                                }
                                this.field1060 = var5 + var5 - 1 - this.field1060;
                                this.field1054 = -this.field1054;
                            } while (--this.field1058 != 0);
                        }
                    } else if (this.field1054 < 0) {
                        while (true) {
                            var9 = this.method433(arg0, var9, var5, var10, var4.field2656[this.field1052 - 1]);
                            if (this.field1060 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field1060) / var8;
                            if (var12 >= this.field1058) {
                                this.field1060 += this.field1058 * var8;
                                this.field1058 = 0;
                                break;
                            }
                            this.field1060 += var8 * var12;
                            this.field1058 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method432(arg0, var9, var6, var10, var4.field2656[this.field1056]);
                            if (this.field1060 < var6) {
                                return;
                            }
                            int var13 = (this.field1060 - var5) / var8;
                            if (var13 >= this.field1058) {
                                this.field1060 -= this.field1058 * var8;
                                this.field1058 = 0;
                                break;
                            }
                            this.field1060 -= var8 * var13;
                            this.field1058 -= var13;
                        }
                    }
                }
                if (this.field1054 < 0) {
                    this.method433(arg0, var9, 0, var10, 0);
                    if (this.field1060 < 0) {
                        this.field1060 = -1;
                        this.method444();
                        this.method1172(-87);
                        return;
                    }
                } else {
                    this.method432(arg0, var9, var7, var10, 0);
                    if (this.field1060 >= var7) {
                        this.field1060 = var7;
                        this.method444();
                        this.method1172(-26);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "()V")
    private final void method424() {
        this.field1050 = this.field1051;
        this.field1049 = method434(this.field1051, this.field1057);
        this.field1063 = method438(this.field1051, this.field1057);
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "([B[IIIIIIILee;)I")
    private static final int method425(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class44 arg8) {
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
        arg8.field1060 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(II[B[IIIIIIIIIILee;II)I")
    private static final int method426(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class44 arg13, int arg14, int arg15) {
        arg13.field1050 -= arg13.field1059 * arg5;
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
        arg13.field1050 += arg13.field1059 * var22;
        arg13.field1049 = arg6;
        arg13.field1063 = arg7;
        arg13.field1060 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "([B[IIIIIIILee;)I")
    private static final int method427(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class44 arg8) {
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
        arg8.field1060 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "()Lqa;")
    public final class145 method373() {
        return null;
    }

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "()I")
    public final synchronized int method428() {
        return this.field1054 < 0 ? -this.field1054 : this.field1054;
    }

    @OriginalMember(owner = "client!ee", name = "h", descriptor = "()Z")
    public final boolean method429() {
        return this.field1053 != 0;
    }

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "(I)V")
    public final synchronized void method430(int arg0) {
        if (arg0 == 0) {
            this.method446(0);
            this.method1172(-61);
        } else if (this.field1049 == 0 && this.field1063 == 0) {
            this.field1053 = 0;
            this.field1051 = 0;
            this.field1050 = 0;
            this.method1172(-107);
        } else {
            int var2 = -this.field1050;
            if (this.field1050 > var2) {
                var2 = this.field1050;
            }
            if (-this.field1049 > var2) {
                var2 = -this.field1049;
            }
            if (this.field1049 > var2) {
                var2 = this.field1049;
            }
            if (-this.field1063 > var2) {
                var2 = -this.field1063;
            }
            if (this.field1063 > var2) {
                var2 = this.field1063;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1053 = arg0;
            this.field1051 = Integer.MIN_VALUE;
            this.field1059 = -this.field1050 / arg0;
            this.field1055 = -this.field1049 / arg0;
            this.field1061 = -this.field1063 / arg0;
        }
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(II[B[IIIIIIILee;II)I")
    private static final int method431(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class44 arg10, int arg11, int arg12) {
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
        arg10.field1060 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "([IIIII)I")
    private final int method432(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field1053 <= 0) {
                if (this.field1054 == 256 && (this.field1060 & 255) == 0) {
                    if (class125.field2774) {
                        return method440(0, ((class120) super.field3092).field2656, arg0, this.field1060, arg1, this.field1049, this.field1063, 0, arg3, arg2, this);
                    }
                    return method427(((class120) super.field3092).field2656, arg0, this.field1060, arg1, this.field1050, 0, arg3, arg2, this);
                }
                if (class125.field2774) {
                    return method416(0, 0, ((class120) super.field3092).field2656, arg0, this.field1060, arg1, this.field1049, this.field1063, 0, arg3, arg2, this, this.field1054, arg4);
                }
                return method419(0, 0, ((class120) super.field3092).field2656, arg0, this.field1060, arg1, this.field1050, 0, arg3, arg2, this, this.field1054, arg4);
            }
            int var6 = this.field1053 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field1053 += arg1;
            if (this.field1054 == 256 && (this.field1060 & 255) == 0) {
                if (class125.field2774) {
                    arg1 = method422(0, ((class120) super.field3092).field2656, arg0, this.field1060, arg1, this.field1049, this.field1063, this.field1055, this.field1061, 0, var6, arg2, this);
                } else {
                    arg1 = method414(((class120) super.field3092).field2656, arg0, this.field1060, arg1, this.field1050, this.field1059, 0, var6, arg2, this);
                }
            } else if (class125.field2774) {
                arg1 = method426(0, 0, ((class120) super.field3092).field2656, arg0, this.field1060, arg1, this.field1049, this.field1063, this.field1055, this.field1061, 0, var6, arg2, this, this.field1054, arg4);
            } else {
                arg1 = method452(0, 0, ((class120) super.field3092).field2656, arg0, this.field1060, arg1, this.field1050, this.field1059, 0, var6, arg2, this, this.field1054, arg4);
            }
            this.field1053 -= arg1;
            if (this.field1053 != 0) {
                return arg1;
            }
        } while (!this.method413());
        return arg3;
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "([IIIII)I")
    private final int method433(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field1053 <= 0) {
                if (this.field1054 == -256 && (this.field1060 & 255) == 0) {
                    if (class125.field2774) {
                        return method450(0, ((class120) super.field3092).field2656, arg0, this.field1060, arg1, this.field1049, this.field1063, 0, arg3, arg2, this);
                    }
                    return method425(((class120) super.field3092).field2656, arg0, this.field1060, arg1, this.field1050, 0, arg3, arg2, this);
                }
                if (class125.field2774) {
                    return method445(0, 0, ((class120) super.field3092).field2656, arg0, this.field1060, arg1, this.field1049, this.field1063, 0, arg3, arg2, this, this.field1054, arg4);
                }
                return method431(0, 0, ((class120) super.field3092).field2656, arg0, this.field1060, arg1, this.field1050, 0, arg3, arg2, this, this.field1054, arg4);
            }
            int var6 = this.field1053 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field1053 += arg1;
            if (this.field1054 == -256 && (this.field1060 & 255) == 0) {
                if (class125.field2774) {
                    arg1 = method449(0, ((class120) super.field3092).field2656, arg0, this.field1060, arg1, this.field1049, this.field1063, this.field1055, this.field1061, 0, var6, arg2, this);
                } else {
                    arg1 = method439(((class120) super.field3092).field2656, arg0, this.field1060, arg1, this.field1050, this.field1059, 0, var6, arg2, this);
                }
            } else if (class125.field2774) {
                arg1 = method442(0, 0, ((class120) super.field3092).field2656, arg0, this.field1060, arg1, this.field1049, this.field1063, this.field1055, this.field1061, 0, var6, arg2, this, this.field1054, arg4);
            } else {
                arg1 = method448(0, 0, ((class120) super.field3092).field2656, arg0, this.field1060, arg1, this.field1050, this.field1059, 0, var6, arg2, this, this.field1054, arg4);
            }
            this.field1053 -= arg1;
            if (this.field1053 != 0) {
                return arg1;
            }
        } while (!this.method413());
        return arg3;
    }

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "(II)I")
    private static final int method434(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!ee", name = "i", descriptor = "()I")
    public final synchronized int method435() {
        return this.field1057 < 0 ? -1 : this.field1057;
    }

    @OriginalMember(owner = "client!ee", name = "j", descriptor = "()I")
    public final synchronized int method436() {
        return this.field1051 == Integer.MIN_VALUE ? 0 : this.field1051;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "()I")
    public final int method437() {
        int var1 = this.field1050 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1058 == 0) {
            var2 -= this.field1060 * var2 / (((class120) super.field3092).field2656.length << 8);
        } else if (this.field1058 >= 0) {
            var2 -= this.field1056 * var2 / ((class120) super.field3092).field2656.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "(II)I")
    private static final int method438(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "([B[IIIIIIIILee;)I")
    private static final int method439(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class44 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1049 += (var14 - arg3) * arg9.field1055;
        arg9.field1063 += (var14 - arg3) * arg9.field1061;
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
        arg9.field1050 = var12 >> 2;
        arg9.field1060 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(I[B[IIIIIIIILee;)I")
    private static final int method440(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class44 arg10) {
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
        arg10.field1060 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "(I)V")
    public final synchronized void method441(int arg0) {
        this.method421(arg0 << 6, this.method435());
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(II[B[IIIIIIIIIILee;II)I")
    private static final int method442(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class44 arg13, int arg14, int arg15) {
        arg13.field1050 -= arg13.field1059 * arg5;
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
        arg13.field1050 += arg13.field1059 * var22;
        arg13.field1049 = arg6;
        arg13.field1063 = arg7;
        arg13.field1060 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lnc;III)Lee;")
    public static final class44 method443(class120 arg0, int arg1, int arg2, int arg3) {
        return arg0.field2656 != null && arg0.field2656.length != 0 ? new class44(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "()Lqa;")
    public final class145 method378() {
        return null;
    }

    @OriginalMember(owner = "client!ee", name = "k", descriptor = "()V")
    private final void method444() {
        if (this.field1053 != 0) {
            if (this.field1051 == Integer.MIN_VALUE) {
                this.field1051 = 0;
            }
            this.field1053 = 0;
            this.method424();
        }
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(II[B[IIIIIIIILee;II)I")
    private static final int method445(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class44 arg11, int arg12, int arg13) {
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
        arg11.field1060 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!ee", name = "h", descriptor = "(I)V")
    private final synchronized void method446(int arg0) {
        this.method421(arg0, this.method435());
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(I)V")
    public final synchronized void method396(int arg0) {
        if (this.field1053 > 0) {
            if (arg0 >= this.field1053) {
                if (this.field1051 == Integer.MIN_VALUE) {
                    this.field1051 = 0;
                    this.field1050 = this.field1049 = this.field1063 = 0;
                    this.method1172(-127);
                    arg0 = this.field1053;
                }
                this.field1053 = 0;
                this.method424();
            } else {
                this.field1050 += this.field1059 * arg0;
                this.field1049 += this.field1055 * arg0;
                this.field1063 += this.field1061 * arg0;
                this.field1053 -= arg0;
            }
        }
        class120 var2 = (class120) super.field3092;
        int var3 = this.field1056 << 8;
        int var4 = this.field1052 << 8;
        int var5 = var2.field2656.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1058 = 0;
        }
        if (this.field1060 < 0) {
            if (this.field1054 <= 0) {
                this.method444();
                this.method1172(-90);
                return;
            }
            this.field1060 = 0;
        }
        if (this.field1060 >= var5) {
            if (this.field1054 >= 0) {
                this.method444();
                this.method1172(-84);
                return;
            }
            this.field1060 = var5 - 1;
        }
        this.field1060 += this.field1054 * arg0;
        if (this.field1058 < 0) {
            if (!this.field1062) {
                if (this.field1054 < 0) {
                    if (this.field1060 < var3) {
                        this.field1060 = var4 - 1 - (var4 - 1 - this.field1060) % var6;
                    }
                } else if (this.field1060 >= var4) {
                    this.field1060 = (this.field1060 - var3) % var6 + var3;
                }
            } else {
                if (this.field1054 < 0) {
                    if (this.field1060 >= var3) {
                        return;
                    }
                    this.field1060 = var3 + var3 - 1 - this.field1060;
                    this.field1054 = -this.field1054;
                }
                while (this.field1060 >= var4) {
                    this.field1060 = var4 + var4 - 1 - this.field1060;
                    this.field1054 = -this.field1054;
                    if (this.field1060 >= var3) {
                        return;
                    }
                    this.field1060 = var3 + var3 - 1 - this.field1060;
                    this.field1054 = -this.field1054;
                }
            }
        } else {
            if (this.field1058 > 0) {
                if (this.field1062) {
                    label125: {
                        if (this.field1054 < 0) {
                            if (this.field1060 >= var3) {
                                return;
                            }
                            this.field1060 = var3 + var3 - 1 - this.field1060;
                            this.field1054 = -this.field1054;
                            if (--this.field1058 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field1060 < var4) {
                                return;
                            }
                            this.field1060 = var4 + var4 - 1 - this.field1060;
                            this.field1054 = -this.field1054;
                            if (--this.field1058 == 0) {
                                break;
                            }
                            if (this.field1060 >= var3) {
                                return;
                            }
                            this.field1060 = var3 + var3 - 1 - this.field1060;
                            this.field1054 = -this.field1054;
                        } while (--this.field1058 != 0);
                    }
                } else if (this.field1054 < 0) {
                    if (this.field1060 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field1060) / var6;
                    if (var7 < this.field1058) {
                        this.field1060 += var6 * var7;
                        this.field1058 -= var7;
                        return;
                    }
                    this.field1060 += this.field1058 * var6;
                    this.field1058 = 0;
                } else {
                    if (this.field1060 < var4) {
                        return;
                    }
                    int var8 = (this.field1060 - var3) / var6;
                    if (var8 < this.field1058) {
                        this.field1060 -= var6 * var8;
                        this.field1058 -= var8;
                        return;
                    }
                    this.field1060 -= this.field1058 * var6;
                    this.field1058 = 0;
                }
            }
            if (this.field1054 < 0) {
                if (this.field1060 < 0) {
                    this.field1060 = -1;
                    this.method444();
                    this.method1172(-23);
                    return;
                }
            } else if (this.field1060 >= var5) {
                this.field1060 = var5;
                this.method444();
                this.method1172(-65);
            }
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lnc;II)Lee;")
    public static final class44 method447(class120 arg0, int arg1, int arg2) {
        return arg0.field2656 != null && arg0.field2656.length != 0 ? new class44(arg0, (int) ((long) arg0.field2655 * 256L * (long) arg1 / (long) (class124.field2762 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "(II[B[IIIIIIIILee;II)I")
    private static final int method448(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class44 arg11, int arg12, int arg13) {
        arg11.field1049 -= arg11.field1055 * arg5;
        arg11.field1063 -= arg11.field1061 * arg5;
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
        arg11.field1049 += arg11.field1055 * arg5;
        arg11.field1063 += arg11.field1061 * arg5;
        arg11.field1050 = arg6;
        arg11.field1060 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "()I")
    public final int method404() {
        return this.field1051 == 0 && this.field1053 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(I[B[IIIIIIIIIILee;)I")
    private static final int method449(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class44 arg12) {
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
        arg12.field1050 += (var19 - arg4) * arg12.field1059;
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
        arg12.field1049 = var15 >> 2;
        arg12.field1063 = var16 >> 2;
        arg12.field1060 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(I[B[IIIIIIIILee;)I")
    private static final int method450(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class44 arg10) {
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
        arg10.field1060 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!ee", name = "l", descriptor = "()Z")
    public final boolean method451() {
        return this.field1060 < 0 || this.field1060 >= ((class120) super.field3092).field2656.length << 8;
    }

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "(II[B[IIIIIIIILee;II)I")
    private static final int method452(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class44 arg11, int arg12, int arg13) {
        arg11.field1049 -= arg11.field1055 * arg5;
        arg11.field1063 -= arg11.field1061 * arg5;
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
        arg11.field1049 += arg11.field1055 * arg5;
        arg11.field1063 += arg11.field1061 * arg5;
        arg11.field1050 = arg6;
        arg11.field1060 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(Lnc;II)V")
    private class44(class120 arg0, int arg1, int arg2) {
        super.field3092 = arg0;
        this.field1056 = arg0.field2653;
        this.field1052 = arg0.field2652;
        this.field1062 = arg0.field2654;
        this.field1054 = arg1;
        this.field1051 = arg2;
        this.field1057 = 8192;
        this.field1060 = 0;
        this.method424();
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(Lnc;III)V")
    private class44(class120 arg0, int arg1, int arg2, int arg3) {
        super.field3092 = arg0;
        this.field1056 = arg0.field2653;
        this.field1052 = arg0.field2652;
        this.field1062 = arg0.field2654;
        this.field1054 = arg1;
        this.field1051 = arg2;
        this.field1057 = arg3;
        this.field1060 = 0;
        this.method424();
    }
}
