import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class9 extends class86 {

    @OriginalMember(owner = "client!ba", name = "V", descriptor = "I")
    private int field150;

    @OriginalMember(owner = "client!ba", name = "M", descriptor = "I")
    private int field141;

    @OriginalMember(owner = "client!ba", name = "J", descriptor = "Z")
    private boolean field138;

    @OriginalMember(owner = "client!ba", name = "U", descriptor = "I")
    private int field149;

    @OriginalMember(owner = "client!ba", name = "W", descriptor = "I")
    private int field151;

    @OriginalMember(owner = "client!ba", name = "S", descriptor = "I")
    private int field147;

    @OriginalMember(owner = "client!ba", name = "N", descriptor = "I")
    private int field142;

    @OriginalMember(owner = "client!ba", name = "K", descriptor = "I")
    private int field139;

    @OriginalMember(owner = "client!ba", name = "L", descriptor = "I")
    private int field140;

    @OriginalMember(owner = "client!ba", name = "O", descriptor = "I")
    private int field143;

    @OriginalMember(owner = "client!ba", name = "P", descriptor = "I")
    private int field144;

    @OriginalMember(owner = "client!ba", name = "Q", descriptor = "I")
    private int field145;

    @OriginalMember(owner = "client!ba", name = "R", descriptor = "I")
    private int field146;

    @OriginalMember(owner = "client!ba", name = "T", descriptor = "I")
    private int field148;

    @OriginalMember(owner = "client!ba", name = "X", descriptor = "I")
    private int field152;

    @OriginalMember(owner = "client!ba", name = "g", descriptor = "(I)V")
    public final synchronized void method42(int arg0) {
        this.field146 = arg0;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(I[B[IIIIIIIIIILba;)I")
    private static final int method43(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class9 arg12) {
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
        arg12.field144 += (var19 - arg4) * arg12.field148;
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
        arg12.field143 = var15 >> 2;
        arg12.field139 = var16 >> 2;
        arg12.field142 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(Z)V")
    public final synchronized void method44(boolean arg0) {
        this.field149 = (this.field149 >>> 31) + (this.field149 ^ this.field149 >> 31);
        if (arg0) {
            this.field149 = -this.field149;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "([B[IIIIIIILba;)I")
    private static final int method45(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class9 arg8) {
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
        arg8.field142 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "()I")
    public final synchronized int method46() {
        return this.field147 < 0 ? -1 : this.field147;
    }

    @OriginalMember(owner = "client!ba", name = "f", descriptor = "()Z")
    public final boolean method47() {
        return this.field142 < 0 || this.field142 >= ((class39) super.field1943).field790.length << 8;
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(I[B[IIIIIIIIIILba;)I")
    private static final int method48(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class9 arg12) {
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
        arg12.field144 += (var19 - arg4) * arg12.field148;
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
        arg12.field143 = var15 >> 2;
        arg12.field139 = var16 >> 2;
        arg12.field142 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "()I")
    public final int method49() {
        return this.field151 == 0 && this.field140 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lfc;II)Lba;")
    public static final class9 method50(class39 arg0, int arg1, int arg2) {
        return arg0.field790 != null && arg0.field790.length != 0 ? new class9(arg0, (int) ((long) arg0.field791 * 256L * (long) arg1 / (long) (class82.field1879 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!ba", name = "g", descriptor = "()V")
    private final void method51() {
        if (this.field140 != 0) {
            if (this.field151 == Integer.MIN_VALUE) {
                this.field151 = 0;
            }
            this.field140 = 0;
            this.method73();
        }
    }

    @OriginalMember(owner = "client!ba", name = "h", descriptor = "(I)V")
    public final synchronized void method52(int arg0) {
        this.method71(arg0 << 6, this.method46());
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(II[B[IIIIIIIIIILba;II)I")
    private static final int method53(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class9 arg13, int arg14, int arg15) {
        arg13.field144 -= arg13.field148 * arg5;
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
        arg13.field144 += arg13.field148 * var22;
        arg13.field143 = arg6;
        arg13.field139 = arg7;
        arg13.field142 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(II[B[IIIIIIIILba;II)I")
    private static final int method54(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class9 arg11, int arg12, int arg13) {
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
        arg11.field142 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "([B[IIIIIIIILba;)I")
    private static final int method55(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class9 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field143 += (var14 - arg3) * arg9.field152;
        arg9.field139 += (var14 - arg3) * arg9.field145;
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
        arg9.field144 = var12 >> 2;
        arg9.field142 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ba", name = "i", descriptor = "(I)V")
    public final synchronized void method56(int arg0) {
        if (arg0 == 0) {
            this.method78(0);
            this.method495(-58);
        } else if (this.field143 == 0 && this.field139 == 0) {
            this.field140 = 0;
            this.field151 = 0;
            this.field144 = 0;
            this.method495(-127);
        } else {
            int var2 = -this.field144;
            if (this.field144 > var2) {
                var2 = this.field144;
            }
            if (-this.field143 > var2) {
                var2 = -this.field143;
            }
            if (this.field143 > var2) {
                var2 = this.field143;
            }
            if (-this.field139 > var2) {
                var2 = -this.field139;
            }
            if (this.field139 > var2) {
                var2 = this.field139;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field140 = arg0;
            this.field151 = Integer.MIN_VALUE;
            this.field148 = -this.field144 / arg0;
            this.field152 = -this.field143 / arg0;
            this.field145 = -this.field139 / arg0;
        }
    }

    @OriginalMember(owner = "client!ba", name = "h", descriptor = "()Z")
    private final boolean method57() {
        int var1 = this.field151;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method84(var1, this.field147);
            var2 = method82(var1, this.field147);
        }
        if (this.field144 == var1 && this.field143 == var3 && this.field139 == var2) {
            if (this.field151 == Integer.MIN_VALUE) {
                this.field151 = 0;
                this.field144 = this.field143 = this.field139 = 0;
                this.method495(-117);
                return true;
            } else {
                this.method73();
                return false;
            }
        } else {
            if (this.field144 < var1) {
                this.field148 = 1;
                this.field140 = var1 - this.field144;
            } else if (this.field144 > var1) {
                this.field148 = -1;
                this.field140 = this.field144 - var1;
            } else {
                this.field148 = 0;
            }
            if (this.field143 < var3) {
                this.field152 = 1;
                if (this.field140 == 0 || this.field140 > var3 - this.field143) {
                    this.field140 = var3 - this.field143;
                }
            } else if (this.field143 > var3) {
                this.field152 = -1;
                if (this.field140 == 0 || this.field140 > this.field143 - var3) {
                    this.field140 = this.field143 - var3;
                }
            } else {
                this.field152 = 0;
            }
            if (this.field139 < var2) {
                this.field145 = 1;
                if (this.field140 == 0 || this.field140 > var2 - this.field139) {
                    this.field140 = var2 - this.field139;
                }
            } else if (this.field139 > var2) {
                this.field145 = -1;
                if (this.field140 == 0 || this.field140 > this.field139 - var2) {
                    this.field140 = this.field139 - var2;
                }
            } else {
                this.field145 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(I[B[IIIIIIIILba;)I")
    private static final int method58(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class9 arg10) {
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
        arg10.field142 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "([IIIII)I")
    private final int method59(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field140 <= 0) {
                if (this.field149 == -256 && (this.field142 & 255) == 0) {
                    if (class82.field1873) {
                        return method58(0, ((class39) super.field1943).field790, arg0, this.field142, arg1, this.field143, this.field139, 0, arg3, arg2, this);
                    }
                    return method45(((class39) super.field1943).field790, arg0, this.field142, arg1, this.field144, 0, arg3, arg2, this);
                }
                if (class82.field1873) {
                    return method54(0, 0, ((class39) super.field1943).field790, arg0, this.field142, arg1, this.field143, this.field139, 0, arg3, arg2, this, this.field149, arg4);
                }
                return method72(0, 0, ((class39) super.field1943).field790, arg0, this.field142, arg1, this.field144, 0, arg3, arg2, this, this.field149, arg4);
            }
            int var6 = this.field140 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field140 += arg1;
            if (this.field149 == -256 && (this.field142 & 255) == 0) {
                if (class82.field1873) {
                    arg1 = method43(0, ((class39) super.field1943).field790, arg0, this.field142, arg1, this.field143, this.field139, this.field152, this.field145, 0, var6, arg2, this);
                } else {
                    arg1 = method55(((class39) super.field1943).field790, arg0, this.field142, arg1, this.field144, this.field148, 0, var6, arg2, this);
                }
            } else if (class82.field1873) {
                arg1 = method53(0, 0, ((class39) super.field1943).field790, arg0, this.field142, arg1, this.field143, this.field139, this.field152, this.field145, 0, var6, arg2, this, this.field149, arg4);
            } else {
                arg1 = method76(0, 0, ((class39) super.field1943).field790, arg0, this.field142, arg1, this.field144, this.field148, 0, var6, arg2, this, this.field149, arg4);
            }
            this.field140 -= arg1;
            if (this.field140 != 0) {
                return arg1;
            }
        } while (!this.method57());
        return arg3;
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "([B[IIIIIIILba;)I")
    private static final int method60(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class9 arg8) {
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
        arg8.field142 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ba", name = "i", descriptor = "()Z")
    public final boolean method61() {
        return this.field140 != 0;
    }

    @OriginalMember(owner = "client!ba", name = "j", descriptor = "(I)V")
    public final synchronized void method62(int arg0) {
        if (this.field149 < 0) {
            this.field149 = -arg0;
        } else {
            this.field149 = arg0;
        }
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(II[B[IIIIIIIILba;II)I")
    private static final int method63(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class9 arg11, int arg12, int arg13) {
        arg11.field143 -= arg11.field152 * arg5;
        arg11.field139 -= arg11.field145 * arg5;
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
        arg11.field143 += arg11.field152 * arg5;
        arg11.field139 += arg11.field145 * arg5;
        arg11.field144 = arg6;
        arg11.field142 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ba", name = "f", descriptor = "(I)V")
    public final synchronized void method64(int arg0) {
        if (this.field140 > 0) {
            if (arg0 >= this.field140) {
                if (this.field151 == Integer.MIN_VALUE) {
                    this.field151 = 0;
                    this.field144 = this.field143 = this.field139 = 0;
                    this.method495(-69);
                    arg0 = this.field140;
                }
                this.field140 = 0;
                this.method73();
            } else {
                this.field144 += this.field148 * arg0;
                this.field143 += this.field152 * arg0;
                this.field139 += this.field145 * arg0;
                this.field140 -= arg0;
            }
        }
        class39 var2 = (class39) super.field1943;
        int var3 = this.field150 << 8;
        int var4 = this.field141 << 8;
        int var5 = var2.field790.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field146 = 0;
        }
        if (this.field142 < 0) {
            if (this.field149 <= 0) {
                this.method51();
                this.method495(-92);
                return;
            }
            this.field142 = 0;
        }
        if (this.field142 >= var5) {
            if (this.field149 >= 0) {
                this.method51();
                this.method495(-122);
                return;
            }
            this.field142 = var5 - 1;
        }
        this.field142 += this.field149 * arg0;
        if (this.field146 < 0) {
            if (!this.field138) {
                if (this.field149 < 0) {
                    if (this.field142 < var3) {
                        this.field142 = var4 - 1 - (var4 - 1 - this.field142) % var6;
                    }
                } else if (this.field142 >= var4) {
                    this.field142 = (this.field142 - var3) % var6 + var3;
                }
            } else {
                if (this.field149 < 0) {
                    if (this.field142 >= var3) {
                        return;
                    }
                    this.field142 = var3 + var3 - 1 - this.field142;
                    this.field149 = -this.field149;
                }
                while (this.field142 >= var4) {
                    this.field142 = var4 + var4 - 1 - this.field142;
                    this.field149 = -this.field149;
                    if (this.field142 >= var3) {
                        return;
                    }
                    this.field142 = var3 + var3 - 1 - this.field142;
                    this.field149 = -this.field149;
                }
            }
        } else {
            if (this.field146 > 0) {
                if (this.field138) {
                    label125: {
                        if (this.field149 < 0) {
                            if (this.field142 >= var3) {
                                return;
                            }
                            this.field142 = var3 + var3 - 1 - this.field142;
                            this.field149 = -this.field149;
                            if (--this.field146 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field142 < var4) {
                                return;
                            }
                            this.field142 = var4 + var4 - 1 - this.field142;
                            this.field149 = -this.field149;
                            if (--this.field146 == 0) {
                                break;
                            }
                            if (this.field142 >= var3) {
                                return;
                            }
                            this.field142 = var3 + var3 - 1 - this.field142;
                            this.field149 = -this.field149;
                        } while (--this.field146 != 0);
                    }
                } else if (this.field149 < 0) {
                    if (this.field142 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field142) / var6;
                    if (var7 < this.field146) {
                        this.field142 += var6 * var7;
                        this.field146 -= var7;
                        return;
                    }
                    this.field142 += this.field146 * var6;
                    this.field146 = 0;
                } else {
                    if (this.field142 < var4) {
                        return;
                    }
                    int var8 = (this.field142 - var3) / var6;
                    if (var8 < this.field146) {
                        this.field142 -= var6 * var8;
                        this.field146 -= var8;
                        return;
                    }
                    this.field142 -= this.field146 * var6;
                    this.field146 = 0;
                }
            }
            if (this.field149 < 0) {
                if (this.field142 < 0) {
                    this.field142 = -1;
                    this.method51();
                    this.method495(-49);
                    return;
                }
            } else if (this.field142 >= var5) {
                this.field142 = var5;
                this.method51();
                this.method495(-100);
            }
        }
    }

    @OriginalMember(owner = "client!ba", name = "j", descriptor = "()I")
    public final synchronized int method65() {
        return this.field149 < 0 ? -this.field149 : this.field149;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lfc;III)Lba;")
    public static final class9 method66(class39 arg0, int arg1, int arg2, int arg3) {
        return arg0.field790 != null && arg0.field790.length != 0 ? new class9(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "([B[IIIIIIIILba;)I")
    private static final int method67(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class9 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field143 += (var14 - arg3) * arg9.field152;
        arg9.field139 += (var14 - arg3) * arg9.field145;
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
        arg9.field144 = var12 >> 2;
        arg9.field142 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(II[B[IIIIIIIIIILba;II)I")
    private static final int method68(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class9 arg13, int arg14, int arg15) {
        arg13.field144 -= arg13.field148 * arg5;
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
        arg13.field144 += arg13.field148 * var22;
        arg13.field143 = arg6;
        arg13.field139 = arg7;
        arg13.field142 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(I[B[IIIIIIIILba;)I")
    private static final int method69(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class9 arg10) {
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
        arg10.field142 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "()Lmc;")
    public final class86 method70() {
        return null;
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(II)V")
    private final synchronized void method71(int arg0, int arg1) {
        this.field151 = arg0;
        this.field147 = arg1;
        this.field140 = 0;
        this.method73();
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(II[B[IIIIIIILba;II)I")
    private static final int method72(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class9 arg10, int arg11, int arg12) {
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
        arg10.field142 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ba", name = "k", descriptor = "()V")
    private final void method73() {
        this.field144 = this.field151;
        this.field143 = method84(this.field151, this.field147);
        this.field139 = method82(this.field151, this.field147);
    }

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "(II[B[IIIIIIIILba;II)I")
    private static final int method74(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class9 arg11, int arg12, int arg13) {
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
        arg11.field142 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!ba", name = "l", descriptor = "()I")
    public final synchronized int method75() {
        return this.field151 == Integer.MIN_VALUE ? 0 : this.field151;
    }

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "(II[B[IIIIIIIILba;II)I")
    private static final int method76(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class9 arg11, int arg12, int arg13) {
        arg11.field143 -= arg11.field152 * arg5;
        arg11.field139 -= arg11.field145 * arg5;
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
        arg11.field143 += arg11.field152 * arg5;
        arg11.field139 += arg11.field145 * arg5;
        arg11.field144 = arg6;
        arg11.field142 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "(II)V")
    public final synchronized void method77(int arg0, int arg1) {
        this.method85(arg0, arg1, this.method46());
    }

    @OriginalMember(owner = "client!ba", name = "k", descriptor = "(I)V")
    private final synchronized void method78(int arg0) {
        this.method71(arg0, this.method46());
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(II[B[IIIIIIILba;II)I")
    private static final int method79(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class9 arg10, int arg11, int arg12) {
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
        arg10.field142 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "()I")
    public final int method80() {
        int var1 = this.field144 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field146 == 0) {
            var2 -= this.field142 * var2 / (((class39) super.field1943).field790.length << 8);
        } else if (this.field146 >= 0) {
            var2 -= this.field150 * var2 / ((class39) super.field1943).field790.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "([III)V")
    public final synchronized void method81(int[] arg0, int arg1, int arg2) {
        if (this.field151 == 0 && this.field140 == 0) {
            this.method64(arg2);
        } else {
            class39 var4 = (class39) super.field1943;
            int var5 = this.field150 << 8;
            int var6 = this.field141 << 8;
            int var7 = var4.field790.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field146 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field142 < 0) {
                if (this.field149 <= 0) {
                    this.method51();
                    this.method495(-70);
                    return;
                }
                this.field142 = 0;
            }
            if (this.field142 >= var7) {
                if (this.field149 >= 0) {
                    this.method51();
                    this.method495(-68);
                    return;
                }
                this.field142 = var7 - 1;
            }
            if (this.field146 < 0) {
                if (this.field138) {
                    if (this.field149 < 0) {
                        var9 = this.method59(arg0, arg1, var5, var10, var4.field790[this.field150]);
                        if (this.field142 >= var5) {
                            return;
                        }
                        this.field142 = var5 + var5 - 1 - this.field142;
                        this.field149 = -this.field149;
                    }
                    while (true) {
                        int var11 = this.method87(arg0, var9, var6, var10, var4.field790[this.field141 - 1]);
                        if (this.field142 < var6) {
                            return;
                        }
                        this.field142 = var6 + var6 - 1 - this.field142;
                        this.field149 = -this.field149;
                        var9 = this.method59(arg0, var11, var5, var10, var4.field790[this.field150]);
                        if (this.field142 >= var5) {
                            return;
                        }
                        this.field142 = var5 + var5 - 1 - this.field142;
                        this.field149 = -this.field149;
                    }
                } else if (this.field149 < 0) {
                    while (true) {
                        var9 = this.method59(arg0, var9, var5, var10, var4.field790[this.field141 - 1]);
                        if (this.field142 >= var5) {
                            return;
                        }
                        this.field142 = var6 - 1 - (var6 - 1 - this.field142) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method87(arg0, var9, var6, var10, var4.field790[this.field150]);
                        if (this.field142 < var6) {
                            return;
                        }
                        this.field142 = (this.field142 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field146 > 0) {
                    if (this.field138) {
                        label130: {
                            if (this.field149 < 0) {
                                var9 = this.method59(arg0, arg1, var5, var10, var4.field790[this.field150]);
                                if (this.field142 >= var5) {
                                    return;
                                }
                                this.field142 = var5 + var5 - 1 - this.field142;
                                this.field149 = -this.field149;
                                if (--this.field146 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method87(arg0, var9, var6, var10, var4.field790[this.field141 - 1]);
                                if (this.field142 < var6) {
                                    return;
                                }
                                this.field142 = var6 + var6 - 1 - this.field142;
                                this.field149 = -this.field149;
                                if (--this.field146 == 0) {
                                    break;
                                }
                                var9 = this.method59(arg0, var9, var5, var10, var4.field790[this.field150]);
                                if (this.field142 >= var5) {
                                    return;
                                }
                                this.field142 = var5 + var5 - 1 - this.field142;
                                this.field149 = -this.field149;
                            } while (--this.field146 != 0);
                        }
                    } else if (this.field149 < 0) {
                        while (true) {
                            var9 = this.method59(arg0, var9, var5, var10, var4.field790[this.field141 - 1]);
                            if (this.field142 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field142) / var8;
                            if (var12 >= this.field146) {
                                this.field142 += this.field146 * var8;
                                this.field146 = 0;
                                break;
                            }
                            this.field142 += var8 * var12;
                            this.field146 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method87(arg0, var9, var6, var10, var4.field790[this.field150]);
                            if (this.field142 < var6) {
                                return;
                            }
                            int var13 = (this.field142 - var5) / var8;
                            if (var13 >= this.field146) {
                                this.field142 -= this.field146 * var8;
                                this.field146 = 0;
                                break;
                            }
                            this.field142 -= var8 * var13;
                            this.field146 -= var13;
                        }
                    }
                }
                if (this.field149 < 0) {
                    this.method59(arg0, var9, 0, var10, 0);
                    if (this.field142 < 0) {
                        this.field142 = -1;
                        this.method51();
                        this.method495(-58);
                        return;
                    }
                } else {
                    this.method87(arg0, var9, var7, var10, 0);
                    if (this.field142 >= var7) {
                        this.field142 = var7;
                        this.method51();
                        this.method495(-94);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "(II)I")
    private static final int method82(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!ba", name = "l", descriptor = "(I)V")
    public final synchronized void method83(int arg0) {
        int var2 = ((class39) super.field1943).field790.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field142 = arg0;
    }

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "(II)I")
    private static final int method84(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(III)V")
    public final synchronized void method85(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method71(arg1, arg2);
        } else {
            int var4 = method84(arg1, arg2);
            int var5 = method82(arg1, arg2);
            if (this.field143 == var4 && this.field139 == var5) {
                this.field140 = 0;
            } else {
                int var6 = arg1 - this.field144;
                if (this.field144 - arg1 > var6) {
                    var6 = this.field144 - arg1;
                }
                if (var4 - this.field143 > var6) {
                    var6 = var4 - this.field143;
                }
                if (this.field143 - var4 > var6) {
                    var6 = this.field143 - var4;
                }
                if (var5 - this.field139 > var6) {
                    var6 = var5 - this.field139;
                }
                if (this.field139 - var5 > var6) {
                    var6 = this.field139 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field140 = arg0;
                this.field151 = arg1;
                this.field147 = arg2;
                this.field148 = (arg1 - this.field144) / arg0;
                this.field152 = (var4 - this.field143) / arg0;
                this.field145 = (var5 - this.field139) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "()Lmc;")
    public final class86 method86() {
        return null;
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "([IIIII)I")
    private final int method87(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field140 <= 0) {
                if (this.field149 == 256 && (this.field142 & 255) == 0) {
                    if (class82.field1873) {
                        return method69(0, ((class39) super.field1943).field790, arg0, this.field142, arg1, this.field143, this.field139, 0, arg3, arg2, this);
                    }
                    return method60(((class39) super.field1943).field790, arg0, this.field142, arg1, this.field144, 0, arg3, arg2, this);
                }
                if (class82.field1873) {
                    return method74(0, 0, ((class39) super.field1943).field790, arg0, this.field142, arg1, this.field143, this.field139, 0, arg3, arg2, this, this.field149, arg4);
                }
                return method79(0, 0, ((class39) super.field1943).field790, arg0, this.field142, arg1, this.field144, 0, arg3, arg2, this, this.field149, arg4);
            }
            int var6 = this.field140 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field140 += arg1;
            if (this.field149 == 256 && (this.field142 & 255) == 0) {
                if (class82.field1873) {
                    arg1 = method48(0, ((class39) super.field1943).field790, arg0, this.field142, arg1, this.field143, this.field139, this.field152, this.field145, 0, var6, arg2, this);
                } else {
                    arg1 = method67(((class39) super.field1943).field790, arg0, this.field142, arg1, this.field144, this.field148, 0, var6, arg2, this);
                }
            } else if (class82.field1873) {
                arg1 = method68(0, 0, ((class39) super.field1943).field790, arg0, this.field142, arg1, this.field143, this.field139, this.field152, this.field145, 0, var6, arg2, this, this.field149, arg4);
            } else {
                arg1 = method63(0, 0, ((class39) super.field1943).field790, arg0, this.field142, arg1, this.field144, this.field148, 0, var6, arg2, this, this.field149, arg4);
            }
            this.field140 -= arg1;
            if (this.field140 != 0) {
                return arg1;
            }
        } while (!this.method57());
        return arg3;
    }

    @OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(Lfc;II)V")
    private class9(class39 arg0, int arg1, int arg2) {
        super.field1943 = arg0;
        this.field150 = arg0.field792;
        this.field141 = arg0.field789;
        this.field138 = arg0.field788;
        this.field149 = arg1;
        this.field151 = arg2;
        this.field147 = 8192;
        this.field142 = 0;
        this.method73();
    }

    @OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(Lfc;III)V")
    private class9(class39 arg0, int arg1, int arg2, int arg3) {
        super.field1943 = arg0;
        this.field150 = arg0.field792;
        this.field141 = arg0.field789;
        this.field138 = arg0.field788;
        this.field149 = arg1;
        this.field151 = arg2;
        this.field147 = arg3;
        this.field142 = 0;
        this.method73();
    }
}
