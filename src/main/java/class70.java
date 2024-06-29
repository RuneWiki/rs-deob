import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class70 extends class42 {

    @OriginalMember(owner = "client!ge", name = "v", descriptor = "I")
    private int field1133;

    @OriginalMember(owner = "client!ge", name = "C", descriptor = "I")
    private int field1139;

    @OriginalMember(owner = "client!ge", name = "t", descriptor = "Z")
    private boolean field1131;

    @OriginalMember(owner = "client!ge", name = "x", descriptor = "I")
    private int field1135;

    @OriginalMember(owner = "client!ge", name = "y", descriptor = "I")
    private int field1136;

    @OriginalMember(owner = "client!ge", name = "D", descriptor = "I")
    private int field1140;

    @OriginalMember(owner = "client!ge", name = "w", descriptor = "I")
    private int field1134;

    @OriginalMember(owner = "client!ge", name = "u", descriptor = "I")
    private int field1132;

    @OriginalMember(owner = "client!ge", name = "z", descriptor = "I")
    private int field1137;

    @OriginalMember(owner = "client!ge", name = "B", descriptor = "I")
    private int field1138;

    @OriginalMember(owner = "client!ge", name = "F", descriptor = "I")
    private int field1141;

    @OriginalMember(owner = "client!ge", name = "G", descriptor = "I")
    private int field1142;

    @OriginalMember(owner = "client!ge", name = "H", descriptor = "I")
    private int field1143;

    @OriginalMember(owner = "client!ge", name = "I", descriptor = "I")
    private int field1144;

    @OriginalMember(owner = "client!ge", name = "J", descriptor = "I")
    private int field1145;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "([B[IIIIIIIILge;)I")
    private static final int method469(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class70 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1132 += (var14 - arg3) * arg9.field1141;
        arg9.field1138 += (var14 - arg3) * arg9.field1144;
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
        arg9.field1145 = var12 >> 2;
        arg9.field1134 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "(I)V")
    public final synchronized void method470(int arg0) {
        int var2 = ((class171) super.field711).field2999.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1134 = arg0;
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "([B[IIIIIIIILge;)I")
    private static final int method471(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class70 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1132 += (var14 - arg3) * arg9.field1141;
        arg9.field1138 += (var14 - arg3) * arg9.field1144;
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
        arg9.field1145 = var12 >> 2;
        arg9.field1134 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lei;III)Lge;")
    public static final class70 method472(class171 arg0, int arg1, int arg2, int arg3) {
        return arg0.field2999 != null && arg0.field2999.length != 0 ? new class70(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lei;II)Lge;")
    public static final class70 method473(class171 arg0, int arg1, int arg2) {
        return arg0.field2999 != null && arg0.field2999.length != 0 ? new class70(arg0, (int) ((long) arg0.field3003 * 256L * (long) arg1 / (long) (class204.field3549 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "()Z")
    private final boolean method474() {
        int var1 = this.field1136;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method506(var1, this.field1140);
            var2 = method488(var1, this.field1140);
        }
        if (this.field1145 == var1 && this.field1132 == var3 && this.field1138 == var2) {
            if (this.field1136 == Integer.MIN_VALUE) {
                this.field1136 = 0;
                this.field1145 = this.field1132 = this.field1138 = 0;
                this.method1146(26159);
                return true;
            } else {
                this.method489();
                return false;
            }
        } else {
            if (this.field1145 < var1) {
                this.field1137 = 1;
                this.field1142 = var1 - this.field1145;
            } else if (this.field1145 > var1) {
                this.field1137 = -1;
                this.field1142 = this.field1145 - var1;
            } else {
                this.field1137 = 0;
            }
            if (this.field1132 < var3) {
                this.field1141 = 1;
                if (this.field1142 == 0 || this.field1142 > var3 - this.field1132) {
                    this.field1142 = var3 - this.field1132;
                }
            } else if (this.field1132 > var3) {
                this.field1141 = -1;
                if (this.field1142 == 0 || this.field1142 > this.field1132 - var3) {
                    this.field1142 = this.field1132 - var3;
                }
            } else {
                this.field1141 = 0;
            }
            if (this.field1138 < var2) {
                this.field1144 = 1;
                if (this.field1142 == 0 || this.field1142 > var2 - this.field1138) {
                    this.field1142 = var2 - this.field1138;
                }
            } else if (this.field1138 > var2) {
                this.field1144 = -1;
                if (this.field1142 == 0 || this.field1142 > this.field1138 - var2) {
                    this.field1142 = this.field1138 - var2;
                }
            } else {
                this.field1144 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(II[B[IIIIIIILge;II)I")
    private static final int method475(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class70 arg10, int arg11, int arg12) {
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
        arg10.field1134 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(II[B[IIIIIIIILge;II)I")
    private static final int method476(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class70 arg11, int arg12, int arg13) {
        arg11.field1132 -= arg11.field1141 * arg5;
        arg11.field1138 -= arg11.field1144 * arg5;
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
        arg11.field1132 += arg11.field1141 * arg5;
        arg11.field1138 += arg11.field1144 * arg5;
        arg11.field1145 = arg6;
        arg11.field1134 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "(I)V")
    private final synchronized void method477(int arg0) {
        this.method495(arg0, this.method496());
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(II[B[IIIIIIIIIILge;II)I")
    private static final int method478(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class70 arg13, int arg14, int arg15) {
        arg13.field1145 -= arg13.field1137 * arg5;
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
        arg13.field1145 += arg13.field1137 * var22;
        arg13.field1132 = arg6;
        arg13.field1138 = arg7;
        arg13.field1134 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "(I)V")
    public final synchronized void method479(int arg0) {
        this.method495(arg0 << 6, this.method496());
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "([III)V")
    public final synchronized void method20(int[] arg0, int arg1, int arg2) {
        if (this.field1136 == 0 && this.field1142 == 0) {
            this.method21(arg2);
        } else {
            class171 var4 = (class171) super.field711;
            int var5 = this.field1133 << 8;
            int var6 = this.field1139 << 8;
            int var7 = var4.field2999.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field1143 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field1134 < 0) {
                if (this.field1135 <= 0) {
                    this.method486();
                    this.method1146(26159);
                    return;
                }
                this.field1134 = 0;
            }
            if (this.field1134 >= var7) {
                if (this.field1135 >= 0) {
                    this.method486();
                    this.method1146(26159);
                    return;
                }
                this.field1134 = var7 - 1;
            }
            if (this.field1143 < 0) {
                if (this.field1131) {
                    if (this.field1135 < 0) {
                        var9 = this.method484(arg0, arg1, var5, var10, var4.field2999[this.field1133]);
                        if (this.field1134 >= var5) {
                            return;
                        }
                        this.field1134 = var5 + var5 - 1 - this.field1134;
                        this.field1135 = -this.field1135;
                    }
                    while (true) {
                        int var11 = this.method485(arg0, var9, var6, var10, var4.field2999[this.field1139 - 1]);
                        if (this.field1134 < var6) {
                            return;
                        }
                        this.field1134 = var6 + var6 - 1 - this.field1134;
                        this.field1135 = -this.field1135;
                        var9 = this.method484(arg0, var11, var5, var10, var4.field2999[this.field1133]);
                        if (this.field1134 >= var5) {
                            return;
                        }
                        this.field1134 = var5 + var5 - 1 - this.field1134;
                        this.field1135 = -this.field1135;
                    }
                } else if (this.field1135 < 0) {
                    while (true) {
                        var9 = this.method484(arg0, var9, var5, var10, var4.field2999[this.field1139 - 1]);
                        if (this.field1134 >= var5) {
                            return;
                        }
                        this.field1134 = var6 - 1 - (var6 - 1 - this.field1134) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method485(arg0, var9, var6, var10, var4.field2999[this.field1133]);
                        if (this.field1134 < var6) {
                            return;
                        }
                        this.field1134 = (this.field1134 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field1143 > 0) {
                    if (this.field1131) {
                        label130: {
                            if (this.field1135 < 0) {
                                var9 = this.method484(arg0, arg1, var5, var10, var4.field2999[this.field1133]);
                                if (this.field1134 >= var5) {
                                    return;
                                }
                                this.field1134 = var5 + var5 - 1 - this.field1134;
                                this.field1135 = -this.field1135;
                                if (--this.field1143 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method485(arg0, var9, var6, var10, var4.field2999[this.field1139 - 1]);
                                if (this.field1134 < var6) {
                                    return;
                                }
                                this.field1134 = var6 + var6 - 1 - this.field1134;
                                this.field1135 = -this.field1135;
                                if (--this.field1143 == 0) {
                                    break;
                                }
                                var9 = this.method484(arg0, var9, var5, var10, var4.field2999[this.field1133]);
                                if (this.field1134 >= var5) {
                                    return;
                                }
                                this.field1134 = var5 + var5 - 1 - this.field1134;
                                this.field1135 = -this.field1135;
                            } while (--this.field1143 != 0);
                        }
                    } else if (this.field1135 < 0) {
                        while (true) {
                            var9 = this.method484(arg0, var9, var5, var10, var4.field2999[this.field1139 - 1]);
                            if (this.field1134 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field1134) / var8;
                            if (var12 >= this.field1143) {
                                this.field1134 += this.field1143 * var8;
                                this.field1143 = 0;
                                break;
                            }
                            this.field1134 += var8 * var12;
                            this.field1143 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method485(arg0, var9, var6, var10, var4.field2999[this.field1133]);
                            if (this.field1134 < var6) {
                                return;
                            }
                            int var13 = (this.field1134 - var5) / var8;
                            if (var13 >= this.field1143) {
                                this.field1134 -= this.field1143 * var8;
                                this.field1143 = 0;
                                break;
                            }
                            this.field1134 -= var8 * var13;
                            this.field1143 -= var13;
                        }
                    }
                }
                if (this.field1135 < 0) {
                    this.method484(arg0, var9, 0, var10, 0);
                    if (this.field1134 < 0) {
                        this.field1134 = -1;
                        this.method486();
                        this.method1146(26159);
                        return;
                    }
                } else {
                    this.method485(arg0, var9, var7, var10, 0);
                    if (this.field1134 >= var7) {
                        this.field1134 = var7;
                        this.method486();
                        this.method1146(26159);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "([B[IIIIIIILge;)I")
    private static final int method480(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class70 arg8) {
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
        arg8.field1134 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "(I)V")
    public final synchronized void method21(int arg0) {
        if (this.field1142 > 0) {
            if (arg0 >= this.field1142) {
                if (this.field1136 == Integer.MIN_VALUE) {
                    this.field1136 = 0;
                    this.field1145 = this.field1132 = this.field1138 = 0;
                    this.method1146(26159);
                    arg0 = this.field1142;
                }
                this.field1142 = 0;
                this.method489();
            } else {
                this.field1145 += this.field1137 * arg0;
                this.field1132 += this.field1141 * arg0;
                this.field1138 += this.field1144 * arg0;
                this.field1142 -= arg0;
            }
        }
        class171 var2 = (class171) super.field711;
        int var3 = this.field1133 << 8;
        int var4 = this.field1139 << 8;
        int var5 = var2.field2999.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1143 = 0;
        }
        if (this.field1134 < 0) {
            if (this.field1135 <= 0) {
                this.method486();
                this.method1146(26159);
                return;
            }
            this.field1134 = 0;
        }
        if (this.field1134 >= var5) {
            if (this.field1135 >= 0) {
                this.method486();
                this.method1146(26159);
                return;
            }
            this.field1134 = var5 - 1;
        }
        this.field1134 += this.field1135 * arg0;
        if (this.field1143 < 0) {
            if (!this.field1131) {
                if (this.field1135 < 0) {
                    if (this.field1134 < var3) {
                        this.field1134 = var4 - 1 - (var4 - 1 - this.field1134) % var6;
                    }
                } else if (this.field1134 >= var4) {
                    this.field1134 = (this.field1134 - var3) % var6 + var3;
                }
            } else {
                if (this.field1135 < 0) {
                    if (this.field1134 >= var3) {
                        return;
                    }
                    this.field1134 = var3 + var3 - 1 - this.field1134;
                    this.field1135 = -this.field1135;
                }
                while (this.field1134 >= var4) {
                    this.field1134 = var4 + var4 - 1 - this.field1134;
                    this.field1135 = -this.field1135;
                    if (this.field1134 >= var3) {
                        return;
                    }
                    this.field1134 = var3 + var3 - 1 - this.field1134;
                    this.field1135 = -this.field1135;
                }
            }
        } else {
            if (this.field1143 > 0) {
                if (this.field1131) {
                    label125: {
                        if (this.field1135 < 0) {
                            if (this.field1134 >= var3) {
                                return;
                            }
                            this.field1134 = var3 + var3 - 1 - this.field1134;
                            this.field1135 = -this.field1135;
                            if (--this.field1143 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field1134 < var4) {
                                return;
                            }
                            this.field1134 = var4 + var4 - 1 - this.field1134;
                            this.field1135 = -this.field1135;
                            if (--this.field1143 == 0) {
                                break;
                            }
                            if (this.field1134 >= var3) {
                                return;
                            }
                            this.field1134 = var3 + var3 - 1 - this.field1134;
                            this.field1135 = -this.field1135;
                        } while (--this.field1143 != 0);
                    }
                } else if (this.field1135 < 0) {
                    if (this.field1134 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field1134) / var6;
                    if (var7 < this.field1143) {
                        this.field1134 += var6 * var7;
                        this.field1143 -= var7;
                        return;
                    }
                    this.field1134 += this.field1143 * var6;
                    this.field1143 = 0;
                } else {
                    if (this.field1134 < var4) {
                        return;
                    }
                    int var8 = (this.field1134 - var3) / var6;
                    if (var8 < this.field1143) {
                        this.field1134 -= var6 * var8;
                        this.field1143 -= var8;
                        return;
                    }
                    this.field1134 -= this.field1143 * var6;
                    this.field1143 = 0;
                }
            }
            if (this.field1135 < 0) {
                if (this.field1134 < 0) {
                    this.field1134 = -1;
                    this.method486();
                    this.method1146(26159);
                    return;
                }
            } else if (this.field1134 >= var5) {
                this.field1134 = var5;
                this.method486();
                this.method1146(26159);
            }
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(I[B[IIIIIIIILge;)I")
    private static final int method481(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class70 arg10) {
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
        arg10.field1134 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!ge", name = "h", descriptor = "(I)V")
    public final synchronized void method482(int arg0) {
        if (this.field1135 < 0) {
            this.field1135 = -arg0;
        } else {
            this.field1135 = arg0;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(I[B[IIIIIIIIIILge;)I")
    private static final int method483(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class70 arg12) {
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
        arg12.field1145 += (var19 - arg4) * arg12.field1137;
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
        arg12.field1132 = var15 >> 2;
        arg12.field1138 = var16 >> 2;
        arg12.field1134 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "([IIIII)I")
    private final int method484(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field1142 <= 0) {
                if (this.field1135 == -256 && (this.field1134 & 255) == 0) {
                    if (class283.field4981) {
                        return method494(0, ((class171) super.field711).field2999, arg0, this.field1134, arg1, this.field1132, this.field1138, 0, arg3, arg2, this);
                    }
                    return method499(((class171) super.field711).field2999, arg0, this.field1134, arg1, this.field1145, 0, arg3, arg2, this);
                }
                if (class283.field4981) {
                    return method501(0, 0, ((class171) super.field711).field2999, arg0, this.field1134, arg1, this.field1132, this.field1138, 0, arg3, arg2, this, this.field1135, arg4);
                }
                return method505(0, 0, ((class171) super.field711).field2999, arg0, this.field1134, arg1, this.field1145, 0, arg3, arg2, this, this.field1135, arg4);
            }
            int var6 = this.field1142 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field1142 += arg1;
            if (this.field1135 == -256 && (this.field1134 & 255) == 0) {
                if (class283.field4981) {
                    arg1 = method491(0, ((class171) super.field711).field2999, arg0, this.field1134, arg1, this.field1132, this.field1138, this.field1141, this.field1144, 0, var6, arg2, this);
                } else {
                    arg1 = method469(((class171) super.field711).field2999, arg0, this.field1134, arg1, this.field1145, this.field1137, 0, var6, arg2, this);
                }
            } else if (class283.field4981) {
                arg1 = method492(0, 0, ((class171) super.field711).field2999, arg0, this.field1134, arg1, this.field1132, this.field1138, this.field1141, this.field1144, 0, var6, arg2, this, this.field1135, arg4);
            } else {
                arg1 = method476(0, 0, ((class171) super.field711).field2999, arg0, this.field1134, arg1, this.field1145, this.field1137, 0, var6, arg2, this, this.field1135, arg4);
            }
            this.field1142 -= arg1;
            if (this.field1142 != 0) {
                return arg1;
            }
        } while (!this.method474());
        return arg3;
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "([IIIII)I")
    private final int method485(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field1142 <= 0) {
                if (this.field1135 == 256 && (this.field1134 & 255) == 0) {
                    if (class283.field4981) {
                        return method481(0, ((class171) super.field711).field2999, arg0, this.field1134, arg1, this.field1132, this.field1138, 0, arg3, arg2, this);
                    }
                    return method480(((class171) super.field711).field2999, arg0, this.field1134, arg1, this.field1145, 0, arg3, arg2, this);
                }
                if (class283.field4981) {
                    return method498(0, 0, ((class171) super.field711).field2999, arg0, this.field1134, arg1, this.field1132, this.field1138, 0, arg3, arg2, this, this.field1135, arg4);
                }
                return method475(0, 0, ((class171) super.field711).field2999, arg0, this.field1134, arg1, this.field1145, 0, arg3, arg2, this, this.field1135, arg4);
            }
            int var6 = this.field1142 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field1142 += arg1;
            if (this.field1135 == 256 && (this.field1134 & 255) == 0) {
                if (class283.field4981) {
                    arg1 = method483(0, ((class171) super.field711).field2999, arg0, this.field1134, arg1, this.field1132, this.field1138, this.field1141, this.field1144, 0, var6, arg2, this);
                } else {
                    arg1 = method471(((class171) super.field711).field2999, arg0, this.field1134, arg1, this.field1145, this.field1137, 0, var6, arg2, this);
                }
            } else if (class283.field4981) {
                arg1 = method478(0, 0, ((class171) super.field711).field2999, arg0, this.field1134, arg1, this.field1132, this.field1138, this.field1141, this.field1144, 0, var6, arg2, this, this.field1135, arg4);
            } else {
                arg1 = method502(0, 0, ((class171) super.field711).field2999, arg0, this.field1134, arg1, this.field1145, this.field1137, 0, var6, arg2, this, this.field1135, arg4);
            }
            this.field1142 -= arg1;
            if (this.field1142 != 0) {
                return arg1;
            }
        } while (!this.method474());
        return arg3;
    }

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "()V")
    private final void method486() {
        if (this.field1142 != 0) {
            if (this.field1136 == Integer.MIN_VALUE) {
                this.field1136 = 0;
            }
            this.field1142 = 0;
            this.method489();
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Z)V")
    public final synchronized void method487(boolean arg0) {
        this.field1135 = (this.field1135 >>> 31) + (this.field1135 ^ this.field1135 >> 31);
        if (arg0) {
            this.field1135 = -this.field1135;
        }
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "()I")
    public final int method322() {
        int var1 = this.field1145 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1143 == 0) {
            var2 -= this.field1134 * var2 / (((class171) super.field711).field2999.length << 8);
        } else if (this.field1143 >= 0) {
            var2 -= this.field1133 * var2 / ((class171) super.field711).field2999.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "()Lji;")
    public final class42 method37() {
        return null;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(II)I")
    private static final int method488(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "()V")
    private final void method489() {
        this.field1145 = this.field1136;
        this.field1132 = method506(this.field1136, this.field1140);
        this.field1138 = method488(this.field1136, this.field1140);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(III)V")
    public final synchronized void method490(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method495(arg1, arg2);
        } else {
            int var4 = method506(arg1, arg2);
            int var5 = method488(arg1, arg2);
            if (this.field1132 == var4 && this.field1138 == var5) {
                this.field1142 = 0;
            } else {
                int var6 = arg1 - this.field1145;
                if (this.field1145 - arg1 > var6) {
                    var6 = this.field1145 - arg1;
                }
                if (var4 - this.field1132 > var6) {
                    var6 = var4 - this.field1132;
                }
                if (this.field1132 - var4 > var6) {
                    var6 = this.field1132 - var4;
                }
                if (var5 - this.field1138 > var6) {
                    var6 = var5 - this.field1138;
                }
                if (this.field1138 - var5 > var6) {
                    var6 = this.field1138 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field1142 = arg0;
                this.field1136 = arg1;
                this.field1140 = arg2;
                this.field1137 = (arg1 - this.field1145) / arg0;
                this.field1141 = (var4 - this.field1132) / arg0;
                this.field1144 = (var5 - this.field1138) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(I[B[IIIIIIIIIILge;)I")
    private static final int method491(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class70 arg12) {
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
        arg12.field1145 += (var19 - arg4) * arg12.field1137;
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
        arg12.field1132 = var15 >> 2;
        arg12.field1138 = var16 >> 2;
        arg12.field1134 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(II[B[IIIIIIIIIILge;II)I")
    private static final int method492(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class70 arg13, int arg14, int arg15) {
        arg13.field1145 -= arg13.field1137 * arg5;
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
        arg13.field1145 += arg13.field1137 * var22;
        arg13.field1132 = arg6;
        arg13.field1138 = arg7;
        arg13.field1134 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!ge", name = "i", descriptor = "(I)V")
    public final synchronized void method493(int arg0) {
        this.field1143 = arg0;
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(I[B[IIIIIIIILge;)I")
    private static final int method494(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class70 arg10) {
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
        arg10.field1134 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(II)V")
    private final synchronized void method495(int arg0, int arg1) {
        this.field1136 = arg0;
        this.field1140 = arg1;
        this.field1142 = 0;
        this.method489();
    }

    @OriginalMember(owner = "client!ge", name = "h", descriptor = "()I")
    public final synchronized int method496() {
        return this.field1140 < 0 ? -1 : this.field1140;
    }

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "()I")
    public final int method27() {
        return this.field1136 == 0 && this.field1142 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!ge", name = "i", descriptor = "()I")
    public final synchronized int method497() {
        return this.field1136 == Integer.MIN_VALUE ? 0 : this.field1136;
    }

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "()Lji;")
    public final class42 method3() {
        return null;
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(II[B[IIIIIIIILge;II)I")
    private static final int method498(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class70 arg11, int arg12, int arg13) {
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
        arg11.field1134 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "([B[IIIIIIILge;)I")
    private static final int method499(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class70 arg8) {
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
        arg8.field1134 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ge", name = "j", descriptor = "()Z")
    public final boolean method500() {
        return this.field1134 < 0 || this.field1134 >= ((class171) super.field711).field2999.length << 8;
    }

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "(II[B[IIIIIIIILge;II)I")
    private static final int method501(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class70 arg11, int arg12, int arg13) {
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
        arg11.field1134 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "(II[B[IIIIIIIILge;II)I")
    private static final int method502(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class70 arg11, int arg12, int arg13) {
        arg11.field1132 -= arg11.field1141 * arg5;
        arg11.field1138 -= arg11.field1144 * arg5;
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
        arg11.field1132 += arg11.field1141 * arg5;
        arg11.field1138 += arg11.field1144 * arg5;
        arg11.field1145 = arg6;
        arg11.field1134 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ge", name = "k", descriptor = "()Z")
    public final boolean method503() {
        return this.field1142 != 0;
    }

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "(II)V")
    public final synchronized void method504(int arg0, int arg1) {
        this.method490(arg0, arg1, this.method496());
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(II[B[IIIIIIILge;II)I")
    private static final int method505(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class70 arg10, int arg11, int arg12) {
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
        arg10.field1134 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "(II)I")
    private static final int method506(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!ge", name = "l", descriptor = "()I")
    public final synchronized int method507() {
        return this.field1135 < 0 ? -this.field1135 : this.field1135;
    }

    @OriginalMember(owner = "client!ge", name = "j", descriptor = "(I)V")
    public final synchronized void method508(int arg0) {
        if (arg0 == 0) {
            this.method477(0);
            this.method1146(26159);
        } else if (this.field1132 == 0 && this.field1138 == 0) {
            this.field1142 = 0;
            this.field1136 = 0;
            this.field1145 = 0;
            this.method1146(26159);
        } else {
            int var2 = -this.field1145;
            if (this.field1145 > var2) {
                var2 = this.field1145;
            }
            if (-this.field1132 > var2) {
                var2 = -this.field1132;
            }
            if (this.field1132 > var2) {
                var2 = this.field1132;
            }
            if (-this.field1138 > var2) {
                var2 = -this.field1138;
            }
            if (this.field1138 > var2) {
                var2 = this.field1138;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1142 = arg0;
            this.field1136 = Integer.MIN_VALUE;
            this.field1137 = -this.field1145 / arg0;
            this.field1141 = -this.field1132 / arg0;
            this.field1144 = -this.field1138 / arg0;
        }
    }

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(Lei;II)V")
    private class70(class171 arg0, int arg1, int arg2) {
        super.field711 = arg0;
        this.field1133 = arg0.field3002;
        this.field1139 = arg0.field3000;
        this.field1131 = arg0.field3001;
        this.field1135 = arg1;
        this.field1136 = arg2;
        this.field1140 = 8192;
        this.field1134 = 0;
        this.method489();
    }

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(Lei;III)V")
    private class70(class171 arg0, int arg1, int arg2, int arg3) {
        super.field711 = arg0;
        this.field1133 = arg0.field3002;
        this.field1139 = arg0.field3000;
        this.field1131 = arg0.field3001;
        this.field1135 = arg1;
        this.field1136 = arg2;
        this.field1140 = arg3;
        this.field1134 = 0;
        this.method489();
    }
}
