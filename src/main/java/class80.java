import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class80 extends class97 {

    @OriginalMember(owner = "client!oi", name = "u", descriptor = "I")
    private int field1094;

    @OriginalMember(owner = "client!oi", name = "x", descriptor = "I")
    private int field1097;

    @OriginalMember(owner = "client!oi", name = "t", descriptor = "Z")
    private boolean field1093;

    @OriginalMember(owner = "client!oi", name = "w", descriptor = "I")
    private int field1096;

    @OriginalMember(owner = "client!oi", name = "m", descriptor = "I")
    private int field1086;

    @OriginalMember(owner = "client!oi", name = "y", descriptor = "I")
    private int field1098;

    @OriginalMember(owner = "client!oi", name = "p", descriptor = "I")
    private int field1089;

    @OriginalMember(owner = "client!oi", name = "l", descriptor = "I")
    private int field1085;

    @OriginalMember(owner = "client!oi", name = "n", descriptor = "I")
    private int field1087;

    @OriginalMember(owner = "client!oi", name = "o", descriptor = "I")
    private int field1088;

    @OriginalMember(owner = "client!oi", name = "q", descriptor = "I")
    private int field1090;

    @OriginalMember(owner = "client!oi", name = "r", descriptor = "I")
    private int field1091;

    @OriginalMember(owner = "client!oi", name = "s", descriptor = "I")
    private int field1092;

    @OriginalMember(owner = "client!oi", name = "v", descriptor = "I")
    private int field1095;

    @OriginalMember(owner = "client!oi", name = "z", descriptor = "I")
    private int field1099;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(II[B[IIIIIIIIIILoi;II)I")
    private static final int method719(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class80 arg13, int arg14, int arg15) {
        arg13.field1091 -= arg13.field1099 * arg5;
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
        arg13.field1091 += arg13.field1099 * var22;
        arg13.field1092 = arg6;
        arg13.field1095 = arg7;
        arg13.field1089 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(I)V")
    public final synchronized void method720(int arg0) {
        int var2 = ((class242) super.field1285).field2851.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1089 = arg0;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(II)I")
    private static final int method721(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(III)V")
    public final synchronized void method722(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method762(arg1, arg2);
        } else {
            int var4 = method740(arg1, arg2);
            int var5 = method721(arg1, arg2);
            if (this.field1092 == var4 && this.field1095 == var5) {
                this.field1085 = 0;
            } else {
                int var6 = arg1 - this.field1091;
                if (this.field1091 - arg1 > var6) {
                    var6 = this.field1091 - arg1;
                }
                if (var4 - this.field1092 > var6) {
                    var6 = var4 - this.field1092;
                }
                if (this.field1092 - var4 > var6) {
                    var6 = this.field1092 - var4;
                }
                if (var5 - this.field1095 > var6) {
                    var6 = var5 - this.field1095;
                }
                if (this.field1095 - var5 > var6) {
                    var6 = this.field1095 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field1085 = arg0;
                this.field1086 = arg1;
                this.field1098 = arg2;
                this.field1099 = (arg1 - this.field1091) / arg0;
                this.field1090 = (var4 - this.field1092) / arg0;
                this.field1088 = (var5 - this.field1095) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!oi", name = "e", descriptor = "()I")
    public final synchronized int method723() {
        return this.field1096 < 0 ? -this.field1096 : this.field1096;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(II[B[IIIIIIIILoi;II)I")
    private static final int method724(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class80 arg11, int arg12, int arg13) {
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
        arg11.field1089 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Laia;III)Loi;")
    public static final class80 method725(class242 arg0, int arg1, int arg2, int arg3) {
        return arg0.field2851 != null && arg0.field2851.length != 0 ? new class80(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(I[B[IIIIIIIILoi;)I")
    private static final int method726(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class80 arg10) {
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
        arg10.field1089 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "(I)V")
    public final synchronized void method727(int arg0) {
        this.method762(this.method731(), arg0);
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(I[B[IIIIIIIIIILoi;)I")
    private static final int method728(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class80 arg12) {
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
        arg12.field1091 += (var19 - arg4) * arg12.field1099;
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
        arg12.field1092 = var15 >> 2;
        arg12.field1095 = var16 >> 2;
        arg12.field1089 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "([B[IIIIIIILoi;)I")
    private static final int method729(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class80 arg8) {
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
        arg8.field1089 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "(I)V")
    public final synchronized void method730(int arg0) {
        this.method762(arg0 << 6, this.method732());
    }

    @OriginalMember(owner = "client!oi", name = "f", descriptor = "()I")
    public final synchronized int method731() {
        return this.field1086 == Integer.MIN_VALUE ? 0 : this.field1086;
    }

    @OriginalMember(owner = "client!oi", name = "g", descriptor = "()I")
    public final synchronized int method732() {
        return this.field1098 < 0 ? -1 : this.field1098;
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(II)V")
    public final synchronized void method733(int arg0, int arg1) {
        this.method722(arg0, arg1, this.method732());
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(II[B[IIIIIIIIIILoi;II)I")
    private static final int method734(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class80 arg13, int arg14, int arg15) {
        arg13.field1091 -= arg13.field1099 * arg5;
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
        arg13.field1091 += arg13.field1099 * var22;
        arg13.field1092 = arg6;
        arg13.field1095 = arg7;
        arg13.field1089 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "([IIIII)I")
    private final int method735(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field1085 <= 0) {
                if (this.field1096 == 256 && (this.field1089 & 255) == 0) {
                    if (class270.field3189) {
                        return method726(0, ((class242) super.field1285).field2851, arg0, this.field1089, arg1, this.field1092, this.field1095, 0, arg3, arg2, this);
                    }
                    return method742(((class242) super.field1285).field2851, arg0, this.field1089, arg1, this.field1091, 0, arg3, arg2, this);
                }
                if (class270.field3189) {
                    return method724(0, 0, ((class242) super.field1285).field2851, arg0, this.field1089, arg1, this.field1092, this.field1095, 0, arg3, arg2, this, this.field1096, arg4);
                }
                return method757(0, 0, ((class242) super.field1285).field2851, arg0, this.field1089, arg1, this.field1091, 0, arg3, arg2, this, this.field1096, arg4);
            }
            int var6 = this.field1085 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field1085 += arg1;
            if (this.field1096 == 256 && (this.field1089 & 255) == 0) {
                if (class270.field3189) {
                    arg1 = method728(0, ((class242) super.field1285).field2851, arg0, this.field1089, arg1, this.field1092, this.field1095, this.field1090, this.field1088, 0, var6, arg2, this);
                } else {
                    arg1 = method761(((class242) super.field1285).field2851, arg0, this.field1089, arg1, this.field1091, this.field1099, 0, var6, arg2, this);
                }
            } else if (class270.field3189) {
                arg1 = method719(0, 0, ((class242) super.field1285).field2851, arg0, this.field1089, arg1, this.field1092, this.field1095, this.field1090, this.field1088, 0, var6, arg2, this, this.field1096, arg4);
            } else {
                arg1 = method749(0, 0, ((class242) super.field1285).field2851, arg0, this.field1089, arg1, this.field1091, this.field1099, 0, var6, arg2, this, this.field1096, arg4);
            }
            this.field1085 -= arg1;
            if (this.field1085 != 0) {
                return arg1;
            }
        } while (!this.method746());
        return arg3;
    }

    @OriginalMember(owner = "client!oi", name = "h", descriptor = "()V")
    private final void method736() {
        this.field1091 = this.field1086;
        this.field1092 = method740(this.field1086, this.field1098);
        this.field1095 = method721(this.field1086, this.field1098);
    }

    @OriginalMember(owner = "client!oi", name = "g", descriptor = "(I)V")
    public final synchronized void method737(int arg0) {
        if (this.field1096 < 0) {
            this.field1096 = -arg0;
        } else {
            this.field1096 = arg0;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(II[B[IIIIIIILoi;II)I")
    private static final int method738(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class80 arg10, int arg11, int arg12) {
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
        arg10.field1089 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(Z)V")
    public final synchronized void method739(boolean arg0) {
        this.field1096 = (this.field1096 >>> 31) + (this.field1096 ^ this.field1096 >> 31);
        if (arg0) {
            this.field1096 = -this.field1096;
        }
    }

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "(II)I")
    private static final int method740(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(II[B[IIIIIIIILoi;II)I")
    private static final int method741(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class80 arg11, int arg12, int arg13) {
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
        arg11.field1089 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "([B[IIIIIIILoi;)I")
    private static final int method742(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class80 arg8) {
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
        arg8.field1089 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(I[B[IIIIIIIILoi;)I")
    private static final int method743(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class80 arg10) {
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
        arg10.field1089 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "(II[B[IIIIIIIILoi;II)I")
    private static final int method744(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class80 arg11, int arg12, int arg13) {
        arg11.field1092 -= arg11.field1090 * arg5;
        arg11.field1095 -= arg11.field1088 * arg5;
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
        arg11.field1092 += arg11.field1090 * arg5;
        arg11.field1095 += arg11.field1088 * arg5;
        arg11.field1091 = arg6;
        arg11.field1089 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "()Loia;")
    public final class97 method745() {
        return null;
    }

    @OriginalMember(owner = "client!oi", name = "i", descriptor = "()Z")
    private final boolean method746() {
        int var1 = this.field1086;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method740(var1, this.field1098);
            var2 = method721(var1, this.field1098);
        }
        if (this.field1091 == var1 && this.field1092 == var3 && this.field1095 == var2) {
            if (this.field1086 == Integer.MIN_VALUE) {
                this.field1086 = 0;
                this.field1091 = this.field1092 = this.field1095 = 0;
                this.method2219(13630);
                return true;
            } else {
                this.method736();
                return false;
            }
        } else {
            if (this.field1091 < var1) {
                this.field1099 = 1;
                this.field1085 = var1 - this.field1091;
            } else if (this.field1091 > var1) {
                this.field1099 = -1;
                this.field1085 = this.field1091 - var1;
            } else {
                this.field1099 = 0;
            }
            if (this.field1092 < var3) {
                this.field1090 = 1;
                if (this.field1085 == 0 || this.field1085 > var3 - this.field1092) {
                    this.field1085 = var3 - this.field1092;
                }
            } else if (this.field1092 > var3) {
                this.field1090 = -1;
                if (this.field1085 == 0 || this.field1085 > this.field1092 - var3) {
                    this.field1085 = this.field1092 - var3;
                }
            } else {
                this.field1090 = 0;
            }
            if (this.field1095 < var2) {
                this.field1088 = 1;
                if (this.field1085 == 0 || this.field1085 > var2 - this.field1095) {
                    this.field1085 = var2 - this.field1095;
                }
            } else if (this.field1095 > var2) {
                this.field1088 = -1;
                if (this.field1085 == 0 || this.field1085 > this.field1095 - var2) {
                    this.field1085 = this.field1095 - var2;
                }
            } else {
                this.field1088 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!oi", name = "h", descriptor = "(I)V")
    public final synchronized void method747(int arg0) {
        this.field1087 = arg0;
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "()I")
    public final int method748() {
        int var1 = this.field1091 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1087 == 0) {
            var2 -= this.field1089 * var2 / (((class242) super.field1285).field2851.length << 8);
        } else if (this.field1087 >= 0) {
            var2 -= this.field1094 * var2 / ((class242) super.field1285).field2851.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "(II[B[IIIIIIIILoi;II)I")
    private static final int method749(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class80 arg11, int arg12, int arg13) {
        arg11.field1092 -= arg11.field1090 * arg5;
        arg11.field1095 -= arg11.field1088 * arg5;
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
        arg11.field1092 += arg11.field1090 * arg5;
        arg11.field1095 += arg11.field1088 * arg5;
        arg11.field1091 = arg6;
        arg11.field1089 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!oi", name = "j", descriptor = "()Z")
    public final boolean method750() {
        return this.field1089 < 0 || this.field1089 >= ((class242) super.field1285).field2851.length << 8;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(I)V")
    public final synchronized void method751(int arg0) {
        if (this.field1085 > 0) {
            if (arg0 >= this.field1085) {
                if (this.field1086 == Integer.MIN_VALUE) {
                    this.field1086 = 0;
                    this.field1091 = this.field1092 = this.field1095 = 0;
                    this.method2219(13630);
                    arg0 = this.field1085;
                }
                this.field1085 = 0;
                this.method736();
            } else {
                this.field1091 += this.field1099 * arg0;
                this.field1092 += this.field1090 * arg0;
                this.field1095 += this.field1088 * arg0;
                this.field1085 -= arg0;
            }
        }
        class242 var2 = (class242) super.field1285;
        int var3 = this.field1094 << 8;
        int var4 = this.field1097 << 8;
        int var5 = var2.field2851.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1087 = 0;
        }
        if (this.field1089 < 0) {
            if (this.field1096 <= 0) {
                this.method755();
                this.method2219(13630);
                return;
            }
            this.field1089 = 0;
        }
        if (this.field1089 >= var5) {
            if (this.field1096 >= 0) {
                this.method755();
                this.method2219(13630);
                return;
            }
            this.field1089 = var5 - 1;
        }
        this.field1089 += this.field1096 * arg0;
        if (this.field1087 < 0) {
            if (!this.field1093) {
                if (this.field1096 < 0) {
                    if (this.field1089 < var3) {
                        this.field1089 = var4 - 1 - (var4 - 1 - this.field1089) % var6;
                    }
                } else if (this.field1089 >= var4) {
                    this.field1089 = (this.field1089 - var3) % var6 + var3;
                }
            } else {
                if (this.field1096 < 0) {
                    if (this.field1089 >= var3) {
                        return;
                    }
                    this.field1089 = var3 + var3 - 1 - this.field1089;
                    this.field1096 = -this.field1096;
                }
                while (this.field1089 >= var4) {
                    this.field1089 = var4 + var4 - 1 - this.field1089;
                    this.field1096 = -this.field1096;
                    if (this.field1089 >= var3) {
                        return;
                    }
                    this.field1089 = var3 + var3 - 1 - this.field1089;
                    this.field1096 = -this.field1096;
                }
            }
        } else {
            if (this.field1087 > 0) {
                if (this.field1093) {
                    label125: {
                        if (this.field1096 < 0) {
                            if (this.field1089 >= var3) {
                                return;
                            }
                            this.field1089 = var3 + var3 - 1 - this.field1089;
                            this.field1096 = -this.field1096;
                            if (--this.field1087 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field1089 < var4) {
                                return;
                            }
                            this.field1089 = var4 + var4 - 1 - this.field1089;
                            this.field1096 = -this.field1096;
                            if (--this.field1087 == 0) {
                                break;
                            }
                            if (this.field1089 >= var3) {
                                return;
                            }
                            this.field1089 = var3 + var3 - 1 - this.field1089;
                            this.field1096 = -this.field1096;
                        } while (--this.field1087 != 0);
                    }
                } else if (this.field1096 < 0) {
                    if (this.field1089 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field1089) / var6;
                    if (var7 < this.field1087) {
                        this.field1089 += var6 * var7;
                        this.field1087 -= var7;
                        return;
                    }
                    this.field1089 += this.field1087 * var6;
                    this.field1087 = 0;
                } else {
                    if (this.field1089 < var4) {
                        return;
                    }
                    int var8 = (this.field1089 - var3) / var6;
                    if (var8 < this.field1087) {
                        this.field1089 -= var6 * var8;
                        this.field1087 -= var8;
                        return;
                    }
                    this.field1089 -= this.field1087 * var6;
                    this.field1087 = 0;
                }
            }
            if (this.field1096 < 0) {
                if (this.field1089 < 0) {
                    this.field1089 = -1;
                    this.method755();
                    this.method2219(13630);
                    return;
                }
            } else if (this.field1089 >= var5) {
                this.field1089 = var5;
                this.method755();
                this.method2219(13630);
            }
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "()I")
    public final int method752() {
        return this.field1086 == 0 && this.field1085 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!oi", name = "i", descriptor = "(I)V")
    public final synchronized void method753(int arg0) {
        if (arg0 == 0) {
            this.method758(0);
            this.method2219(13630);
        } else if (this.field1092 == 0 && this.field1095 == 0) {
            this.field1085 = 0;
            this.field1086 = 0;
            this.field1091 = 0;
            this.method2219(13630);
        } else {
            int var2 = -this.field1091;
            if (this.field1091 > var2) {
                var2 = this.field1091;
            }
            if (-this.field1092 > var2) {
                var2 = -this.field1092;
            }
            if (this.field1092 > var2) {
                var2 = this.field1092;
            }
            if (-this.field1095 > var2) {
                var2 = -this.field1095;
            }
            if (this.field1095 > var2) {
                var2 = this.field1095;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1085 = arg0;
            this.field1086 = Integer.MIN_VALUE;
            this.field1099 = -this.field1091 / arg0;
            this.field1090 = -this.field1092 / arg0;
            this.field1088 = -this.field1095 / arg0;
        }
    }

    @OriginalMember(owner = "client!oi", name = "k", descriptor = "()Z")
    public final boolean method754() {
        return this.field1085 != 0;
    }

    @OriginalMember(owner = "client!oi", name = "l", descriptor = "()V")
    private final void method755() {
        if (this.field1085 != 0) {
            if (this.field1086 == Integer.MIN_VALUE) {
                this.field1086 = 0;
            }
            this.field1085 = 0;
            this.method736();
        }
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(I[B[IIIIIIIIIILoi;)I")
    private static final int method756(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class80 arg12) {
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
        arg12.field1091 += (var19 - arg4) * arg12.field1099;
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
        arg12.field1092 = var15 >> 2;
        arg12.field1095 = var16 >> 2;
        arg12.field1089 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(II[B[IIIIIIILoi;II)I")
    private static final int method757(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class80 arg10, int arg11, int arg12) {
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
        arg10.field1089 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!oi", name = "j", descriptor = "(I)V")
    private final synchronized void method758(int arg0) {
        this.method762(arg0, this.method732());
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "([B[IIIIIIIILoi;)I")
    private static final int method759(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class80 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1092 += (var14 - arg3) * arg9.field1090;
        arg9.field1095 += (var14 - arg3) * arg9.field1088;
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
        arg9.field1091 = var12 >> 2;
        arg9.field1089 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "([III)V")
    public final synchronized void method760(int[] arg0, int arg1, int arg2) {
        if (this.field1086 == 0 && this.field1085 == 0) {
            this.method751(arg2);
        } else {
            class242 var4 = (class242) super.field1285;
            int var5 = this.field1094 << 8;
            int var6 = this.field1097 << 8;
            int var7 = var4.field2851.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field1087 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field1089 < 0) {
                if (this.field1096 <= 0) {
                    this.method755();
                    this.method2219(13630);
                    return;
                }
                this.field1089 = 0;
            }
            if (this.field1089 >= var7) {
                if (this.field1096 >= 0) {
                    this.method755();
                    this.method2219(13630);
                    return;
                }
                this.field1089 = var7 - 1;
            }
            if (this.field1087 < 0) {
                if (this.field1093) {
                    if (this.field1096 < 0) {
                        var9 = this.method764(arg0, arg1, var5, var10, var4.field2851[this.field1094]);
                        if (this.field1089 >= var5) {
                            return;
                        }
                        this.field1089 = var5 + var5 - 1 - this.field1089;
                        this.field1096 = -this.field1096;
                    }
                    while (true) {
                        int var11 = this.method735(arg0, var9, var6, var10, var4.field2851[this.field1097 - 1]);
                        if (this.field1089 < var6) {
                            return;
                        }
                        this.field1089 = var6 + var6 - 1 - this.field1089;
                        this.field1096 = -this.field1096;
                        var9 = this.method764(arg0, var11, var5, var10, var4.field2851[this.field1094]);
                        if (this.field1089 >= var5) {
                            return;
                        }
                        this.field1089 = var5 + var5 - 1 - this.field1089;
                        this.field1096 = -this.field1096;
                    }
                } else if (this.field1096 < 0) {
                    while (true) {
                        var9 = this.method764(arg0, var9, var5, var10, var4.field2851[this.field1097 - 1]);
                        if (this.field1089 >= var5) {
                            return;
                        }
                        this.field1089 = var6 - 1 - (var6 - 1 - this.field1089) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method735(arg0, var9, var6, var10, var4.field2851[this.field1094]);
                        if (this.field1089 < var6) {
                            return;
                        }
                        this.field1089 = (this.field1089 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field1087 > 0) {
                    if (this.field1093) {
                        label130: {
                            if (this.field1096 < 0) {
                                var9 = this.method764(arg0, arg1, var5, var10, var4.field2851[this.field1094]);
                                if (this.field1089 >= var5) {
                                    return;
                                }
                                this.field1089 = var5 + var5 - 1 - this.field1089;
                                this.field1096 = -this.field1096;
                                if (--this.field1087 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method735(arg0, var9, var6, var10, var4.field2851[this.field1097 - 1]);
                                if (this.field1089 < var6) {
                                    return;
                                }
                                this.field1089 = var6 + var6 - 1 - this.field1089;
                                this.field1096 = -this.field1096;
                                if (--this.field1087 == 0) {
                                    break;
                                }
                                var9 = this.method764(arg0, var9, var5, var10, var4.field2851[this.field1094]);
                                if (this.field1089 >= var5) {
                                    return;
                                }
                                this.field1089 = var5 + var5 - 1 - this.field1089;
                                this.field1096 = -this.field1096;
                            } while (--this.field1087 != 0);
                        }
                    } else if (this.field1096 < 0) {
                        while (true) {
                            var9 = this.method764(arg0, var9, var5, var10, var4.field2851[this.field1097 - 1]);
                            if (this.field1089 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field1089) / var8;
                            if (var12 >= this.field1087) {
                                this.field1089 += this.field1087 * var8;
                                this.field1087 = 0;
                                break;
                            }
                            this.field1089 += var8 * var12;
                            this.field1087 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method735(arg0, var9, var6, var10, var4.field2851[this.field1094]);
                            if (this.field1089 < var6) {
                                return;
                            }
                            int var13 = (this.field1089 - var5) / var8;
                            if (var13 >= this.field1087) {
                                this.field1089 -= this.field1087 * var8;
                                this.field1087 = 0;
                                break;
                            }
                            this.field1089 -= var8 * var13;
                            this.field1087 -= var13;
                        }
                    }
                }
                if (this.field1096 < 0) {
                    this.method764(arg0, var9, 0, var10, 0);
                    if (this.field1089 < 0) {
                        this.field1089 = -1;
                        this.method755();
                        this.method2219(13630);
                        return;
                    }
                } else {
                    this.method735(arg0, var9, var7, var10, 0);
                    if (this.field1089 >= var7) {
                        this.field1089 = var7;
                        this.method755();
                        this.method2219(13630);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "([B[IIIIIIIILoi;)I")
    private static final int method761(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class80 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1092 += (var14 - arg3) * arg9.field1090;
        arg9.field1095 += (var14 - arg3) * arg9.field1088;
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
        arg9.field1091 = var12 >> 2;
        arg9.field1089 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "(II)V")
    private final synchronized void method762(int arg0, int arg1) {
        this.field1086 = arg0;
        this.field1098 = arg1;
        this.field1085 = 0;
        this.method736();
    }

    @OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(Laia;III)V")
    private class80(class242 arg0, int arg1, int arg2, int arg3) {
        super.field1285 = arg0;
        this.field1094 = arg0.field2853;
        this.field1097 = arg0.field2850;
        this.field1093 = arg0.field2854;
        this.field1096 = arg1;
        this.field1086 = arg2;
        this.field1098 = arg3;
        this.field1089 = 0;
        this.method736();
    }

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "()Loia;")
    public final class97 method763() {
        return null;
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "([IIIII)I")
    private final int method764(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field1085 <= 0) {
                if (this.field1096 == -256 && (this.field1089 & 255) == 0) {
                    if (class270.field3189) {
                        return method743(0, ((class242) super.field1285).field2851, arg0, this.field1089, arg1, this.field1092, this.field1095, 0, arg3, arg2, this);
                    }
                    return method729(((class242) super.field1285).field2851, arg0, this.field1089, arg1, this.field1091, 0, arg3, arg2, this);
                }
                if (class270.field3189) {
                    return method741(0, 0, ((class242) super.field1285).field2851, arg0, this.field1089, arg1, this.field1092, this.field1095, 0, arg3, arg2, this, this.field1096, arg4);
                }
                return method738(0, 0, ((class242) super.field1285).field2851, arg0, this.field1089, arg1, this.field1091, 0, arg3, arg2, this, this.field1096, arg4);
            }
            int var6 = this.field1085 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field1085 += arg1;
            if (this.field1096 == -256 && (this.field1089 & 255) == 0) {
                if (class270.field3189) {
                    arg1 = method756(0, ((class242) super.field1285).field2851, arg0, this.field1089, arg1, this.field1092, this.field1095, this.field1090, this.field1088, 0, var6, arg2, this);
                } else {
                    arg1 = method759(((class242) super.field1285).field2851, arg0, this.field1089, arg1, this.field1091, this.field1099, 0, var6, arg2, this);
                }
            } else if (class270.field3189) {
                arg1 = method734(0, 0, ((class242) super.field1285).field2851, arg0, this.field1089, arg1, this.field1092, this.field1095, this.field1090, this.field1088, 0, var6, arg2, this, this.field1096, arg4);
            } else {
                arg1 = method744(0, 0, ((class242) super.field1285).field2851, arg0, this.field1089, arg1, this.field1091, this.field1099, 0, var6, arg2, this, this.field1096, arg4);
            }
            this.field1085 -= arg1;
            if (this.field1085 != 0) {
                return arg1;
            }
        } while (!this.method746());
        return arg3;
    }
}
