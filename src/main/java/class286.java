import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class286 extends class203 {

    @OriginalMember(owner = "client!p", name = "D", descriptor = "I")
    private int field5006;

    @OriginalMember(owner = "client!p", name = "M", descriptor = "I")
    private int field5014;

    @OriginalMember(owner = "client!p", name = "E", descriptor = "Z")
    private boolean field5007;

    @OriginalMember(owner = "client!p", name = "K", descriptor = "I")
    private int field5012;

    @OriginalMember(owner = "client!p", name = "L", descriptor = "I")
    private int field5013;

    @OriginalMember(owner = "client!p", name = "G", descriptor = "I")
    private int field5009;

    @OriginalMember(owner = "client!p", name = "B", descriptor = "I")
    private int field5004;

    @OriginalMember(owner = "client!p", name = "z", descriptor = "I")
    private int field5003;

    @OriginalMember(owner = "client!p", name = "C", descriptor = "I")
    private int field5005;

    @OriginalMember(owner = "client!p", name = "F", descriptor = "I")
    private int field5008;

    @OriginalMember(owner = "client!p", name = "H", descriptor = "I")
    private int field5010;

    @OriginalMember(owner = "client!p", name = "J", descriptor = "I")
    private int field5011;

    @OriginalMember(owner = "client!p", name = "N", descriptor = "I")
    private int field5015;

    @OriginalMember(owner = "client!p", name = "O", descriptor = "I")
    private int field5016;

    @OriginalMember(owner = "client!p", name = "P", descriptor = "I")
    private int field5017;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(II)V")
    private final synchronized void method1890(int arg0, int arg1) {
        this.field5013 = arg0;
        this.field5009 = arg1;
        this.field5017 = 0;
        this.method1913();
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(I[B[IIIIIIIILp;)I")
    private static final int method1891(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class286 arg10) {
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
        arg10.field5004 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!p", name = "c", descriptor = "(I)V")
    public final synchronized void method1892(int arg0) {
        int var2 = ((class72) super.field3539).field1208.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field5004 = arg0;
    }

    @OriginalMember(owner = "client!p", name = "d", descriptor = "(I)V")
    private final synchronized void method1893(int arg0) {
        this.method1890(arg0, this.method1914());
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "()Lel;")
    public final class203 method154() {
        return null;
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(II)V")
    public final synchronized void method1894(int arg0, int arg1) {
        this.method1912(arg0, arg1, this.method1914());
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(II[B[IIIIIIILp;II)I")
    private static final int method1895(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class286 arg10, int arg11, int arg12) {
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
        arg10.field5004 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!p", name = "e", descriptor = "(I)V")
    public final synchronized void method1896(int arg0) {
        this.field5010 = arg0;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(II[B[IIIIIIIILp;II)I")
    private static final int method1897(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class286 arg11, int arg12, int arg13) {
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
        arg11.field5004 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "([B[IIIIIIIILp;)I")
    private static final int method1898(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class286 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field5015 += (var14 - arg3) * arg9.field5008;
        arg9.field5003 += (var14 - arg3) * arg9.field5011;
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
        arg9.field5016 = var12 >> 2;
        arg9.field5004 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!p", name = "e", descriptor = "()Z")
    public final boolean method1899() {
        return this.field5017 != 0;
    }

    @OriginalMember(owner = "client!p", name = "f", descriptor = "()I")
    public final synchronized int method1900() {
        return this.field5013 == Integer.MIN_VALUE ? 0 : this.field5013;
    }

    @OriginalMember(owner = "client!p", name = "g", descriptor = "()Z")
    public final boolean method1901() {
        return this.field5004 < 0 || this.field5004 >= ((class72) super.field3539).field1208.length << 8;
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(II[B[IIIIIIIILp;II)I")
    private static final int method1902(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class286 arg11, int arg12, int arg13) {
        arg11.field5015 -= arg11.field5008 * arg5;
        arg11.field5003 -= arg11.field5011 * arg5;
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
        arg11.field5015 += arg11.field5008 * arg5;
        arg11.field5003 += arg11.field5011 * arg5;
        arg11.field5016 = arg6;
        arg11.field5004 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!p", name = "h", descriptor = "()Z")
    private final boolean method1903() {
        int var1 = this.field5013;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1908(var1, this.field5009);
            var2 = method1916(var1, this.field5009);
        }
        if (this.field5016 == var1 && this.field5015 == var3 && this.field5003 == var2) {
            if (this.field5013 == Integer.MIN_VALUE) {
                this.field5013 = 0;
                this.field5016 = this.field5015 = this.field5003 = 0;
                this.method828((byte) -99);
                return true;
            } else {
                this.method1913();
                return false;
            }
        } else {
            if (this.field5016 < var1) {
                this.field5005 = 1;
                this.field5017 = var1 - this.field5016;
            } else if (this.field5016 > var1) {
                this.field5005 = -1;
                this.field5017 = this.field5016 - var1;
            } else {
                this.field5005 = 0;
            }
            if (this.field5015 < var3) {
                this.field5008 = 1;
                if (this.field5017 == 0 || this.field5017 > var3 - this.field5015) {
                    this.field5017 = var3 - this.field5015;
                }
            } else if (this.field5015 > var3) {
                this.field5008 = -1;
                if (this.field5017 == 0 || this.field5017 > this.field5015 - var3) {
                    this.field5017 = this.field5015 - var3;
                }
            } else {
                this.field5008 = 0;
            }
            if (this.field5003 < var2) {
                this.field5011 = 1;
                if (this.field5017 == 0 || this.field5017 > var2 - this.field5003) {
                    this.field5017 = var2 - this.field5003;
                }
            } else if (this.field5003 > var2) {
                this.field5011 = -1;
                if (this.field5017 == 0 || this.field5017 > this.field5003 - var2) {
                    this.field5017 = this.field5003 - var2;
                }
            } else {
                this.field5011 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Ltd;III)Lp;")
    public static final class286 method1904(class72 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1208 != null && arg0.field1208.length != 0 ? new class286(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(II[B[IIIIIIILp;II)I")
    private static final int method1905(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class286 arg10, int arg11, int arg12) {
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
        arg10.field5004 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!p", name = "i", descriptor = "()V")
    private final void method1906() {
        if (this.field5017 != 0) {
            if (this.field5013 == Integer.MIN_VALUE) {
                this.field5013 = 0;
            }
            this.field5017 = 0;
            this.method1913();
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "([B[IIIIIIILp;)I")
    private static final int method1907(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class286 arg8) {
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
        arg8.field5004 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!p", name = "c", descriptor = "(II)I")
    private static final int method1908(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "([IIIII)I")
    private final int method1909(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field5017 <= 0) {
                if (this.field5012 == 256 && (this.field5004 & 255) == 0) {
                    if (class85.field1468) {
                        return method1891(0, ((class72) super.field3539).field1208, arg0, this.field5004, arg1, this.field5015, this.field5003, 0, arg3, arg2, this);
                    }
                    return method1907(((class72) super.field3539).field1208, arg0, this.field5004, arg1, this.field5016, 0, arg3, arg2, this);
                }
                if (class85.field1468) {
                    return method1924(0, 0, ((class72) super.field3539).field1208, arg0, this.field5004, arg1, this.field5015, this.field5003, 0, arg3, arg2, this, this.field5012, arg4);
                }
                return method1895(0, 0, ((class72) super.field3539).field1208, arg0, this.field5004, arg1, this.field5016, 0, arg3, arg2, this, this.field5012, arg4);
            }
            int var6 = this.field5017 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field5017 += arg1;
            if (this.field5012 == 256 && (this.field5004 & 255) == 0) {
                if (class85.field1468) {
                    arg1 = method1918(0, ((class72) super.field3539).field1208, arg0, this.field5004, arg1, this.field5015, this.field5003, this.field5008, this.field5011, 0, var6, arg2, this);
                } else {
                    arg1 = method1923(((class72) super.field3539).field1208, arg0, this.field5004, arg1, this.field5016, this.field5005, 0, var6, arg2, this);
                }
            } else if (class85.field1468) {
                arg1 = method1921(0, 0, ((class72) super.field3539).field1208, arg0, this.field5004, arg1, this.field5015, this.field5003, this.field5008, this.field5011, 0, var6, arg2, this, this.field5012, arg4);
            } else {
                arg1 = method1902(0, 0, ((class72) super.field3539).field1208, arg0, this.field5004, arg1, this.field5016, this.field5005, 0, var6, arg2, this, this.field5012, arg4);
            }
            this.field5017 -= arg1;
            if (this.field5017 != 0) {
                return arg1;
            }
        } while (!this.method1903());
        return arg3;
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "()I")
    public final int method1369() {
        int var1 = this.field5016 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field5010 == 0) {
            var2 -= this.field5004 * var2 / (((class72) super.field3539).field1208.length << 8);
        } else if (this.field5010 >= 0) {
            var2 -= this.field5006 * var2 / ((class72) super.field3539).field1208.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!p", name = "c", descriptor = "()I")
    public final int method144() {
        return this.field5013 == 0 && this.field5017 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!p", name = "c", descriptor = "(II[B[IIIIIIIILp;II)I")
    private static final int method1910(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class286 arg11, int arg12, int arg13) {
        arg11.field5015 -= arg11.field5008 * arg5;
        arg11.field5003 -= arg11.field5011 * arg5;
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
        arg11.field5015 += arg11.field5008 * arg5;
        arg11.field5003 += arg11.field5011 * arg5;
        arg11.field5016 = arg6;
        arg11.field5004 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!p", name = "j", descriptor = "()I")
    public final synchronized int method1911() {
        return this.field5012 < 0 ? -this.field5012 : this.field5012;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(III)V")
    public final synchronized void method1912(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1890(arg1, arg2);
        } else {
            int var4 = method1908(arg1, arg2);
            int var5 = method1916(arg1, arg2);
            if (this.field5015 == var4 && this.field5003 == var5) {
                this.field5017 = 0;
            } else {
                int var6 = arg1 - this.field5016;
                if (this.field5016 - arg1 > var6) {
                    var6 = this.field5016 - arg1;
                }
                if (var4 - this.field5015 > var6) {
                    var6 = var4 - this.field5015;
                }
                if (this.field5015 - var4 > var6) {
                    var6 = this.field5015 - var4;
                }
                if (var5 - this.field5003 > var6) {
                    var6 = var5 - this.field5003;
                }
                if (this.field5003 - var5 > var6) {
                    var6 = this.field5003 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field5017 = arg0;
                this.field5013 = arg1;
                this.field5009 = arg2;
                this.field5005 = (arg1 - this.field5016) / arg0;
                this.field5008 = (var4 - this.field5015) / arg0;
                this.field5011 = (var5 - this.field5003) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(I)V")
    public final synchronized void method177(int arg0) {
        if (this.field5017 > 0) {
            if (arg0 >= this.field5017) {
                if (this.field5013 == Integer.MIN_VALUE) {
                    this.field5013 = 0;
                    this.field5016 = this.field5015 = this.field5003 = 0;
                    this.method828((byte) -112);
                    arg0 = this.field5017;
                }
                this.field5017 = 0;
                this.method1913();
            } else {
                this.field5016 += this.field5005 * arg0;
                this.field5015 += this.field5008 * arg0;
                this.field5003 += this.field5011 * arg0;
                this.field5017 -= arg0;
            }
        }
        class72 var2 = (class72) super.field3539;
        int var3 = this.field5006 << 8;
        int var4 = this.field5014 << 8;
        int var5 = var2.field1208.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field5010 = 0;
        }
        if (this.field5004 < 0) {
            if (this.field5012 <= 0) {
                this.method1906();
                this.method828((byte) 124);
                return;
            }
            this.field5004 = 0;
        }
        if (this.field5004 >= var5) {
            if (this.field5012 >= 0) {
                this.method1906();
                this.method828((byte) 121);
                return;
            }
            this.field5004 = var5 - 1;
        }
        this.field5004 += this.field5012 * arg0;
        if (this.field5010 < 0) {
            if (!this.field5007) {
                if (this.field5012 < 0) {
                    if (this.field5004 < var3) {
                        this.field5004 = var4 - 1 - (var4 - 1 - this.field5004) % var6;
                    }
                } else if (this.field5004 >= var4) {
                    this.field5004 = (this.field5004 - var3) % var6 + var3;
                }
            } else {
                if (this.field5012 < 0) {
                    if (this.field5004 >= var3) {
                        return;
                    }
                    this.field5004 = var3 + var3 - 1 - this.field5004;
                    this.field5012 = -this.field5012;
                }
                while (this.field5004 >= var4) {
                    this.field5004 = var4 + var4 - 1 - this.field5004;
                    this.field5012 = -this.field5012;
                    if (this.field5004 >= var3) {
                        return;
                    }
                    this.field5004 = var3 + var3 - 1 - this.field5004;
                    this.field5012 = -this.field5012;
                }
            }
        } else {
            if (this.field5010 > 0) {
                if (this.field5007) {
                    label125: {
                        if (this.field5012 < 0) {
                            if (this.field5004 >= var3) {
                                return;
                            }
                            this.field5004 = var3 + var3 - 1 - this.field5004;
                            this.field5012 = -this.field5012;
                            if (--this.field5010 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field5004 < var4) {
                                return;
                            }
                            this.field5004 = var4 + var4 - 1 - this.field5004;
                            this.field5012 = -this.field5012;
                            if (--this.field5010 == 0) {
                                break;
                            }
                            if (this.field5004 >= var3) {
                                return;
                            }
                            this.field5004 = var3 + var3 - 1 - this.field5004;
                            this.field5012 = -this.field5012;
                        } while (--this.field5010 != 0);
                    }
                } else if (this.field5012 < 0) {
                    if (this.field5004 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field5004) / var6;
                    if (var7 < this.field5010) {
                        this.field5004 += var6 * var7;
                        this.field5010 -= var7;
                        return;
                    }
                    this.field5004 += this.field5010 * var6;
                    this.field5010 = 0;
                } else {
                    if (this.field5004 < var4) {
                        return;
                    }
                    int var8 = (this.field5004 - var3) / var6;
                    if (var8 < this.field5010) {
                        this.field5004 -= var6 * var8;
                        this.field5010 -= var8;
                        return;
                    }
                    this.field5004 -= this.field5010 * var6;
                    this.field5010 = 0;
                }
            }
            if (this.field5012 < 0) {
                if (this.field5004 < 0) {
                    this.field5004 = -1;
                    this.method1906();
                    this.method828((byte) 125);
                    return;
                }
            } else if (this.field5004 >= var5) {
                this.field5004 = var5;
                this.method1906();
                this.method828((byte) -63);
            }
        }
    }

    @OriginalMember(owner = "client!p", name = "d", descriptor = "()Lel;")
    public final class203 method140() {
        return null;
    }

    @OriginalMember(owner = "client!p", name = "k", descriptor = "()V")
    private final void method1913() {
        this.field5016 = this.field5013;
        this.field5015 = method1908(this.field5013, this.field5009);
        this.field5003 = method1916(this.field5013, this.field5009);
    }

    @OriginalMember(owner = "client!p", name = "l", descriptor = "()I")
    public final synchronized int method1914() {
        return this.field5009 < 0 ? -1 : this.field5009;
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(I[B[IIIIIIIILp;)I")
    private static final int method1915(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class286 arg10) {
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
        arg10.field5004 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!p", name = "d", descriptor = "(II)I")
    private static final int method1916(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!p", name = "f", descriptor = "(I)V")
    public final synchronized void method1917(int arg0) {
        this.method1890(arg0 << 6, this.method1914());
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(I[B[IIIIIIIIIILp;)I")
    private static final int method1918(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class286 arg12) {
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
        arg12.field5016 += (var19 - arg4) * arg12.field5005;
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
        arg12.field5015 = var15 >> 2;
        arg12.field5003 = var16 >> 2;
        arg12.field5004 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "(Ltd;II)V")
    private class286(class72 arg0, int arg1, int arg2) {
        super.field3539 = arg0;
        this.field5006 = arg0.field1210;
        this.field5014 = arg0.field1212;
        this.field5007 = arg0.field1211;
        this.field5012 = arg1;
        this.field5013 = arg2;
        this.field5009 = 8192;
        this.field5004 = 0;
        this.method1913();
    }

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "(Ltd;III)V")
    private class286(class72 arg0, int arg1, int arg2, int arg3) {
        super.field3539 = arg0;
        this.field5006 = arg0.field1210;
        this.field5014 = arg0.field1212;
        this.field5007 = arg0.field1211;
        this.field5012 = arg1;
        this.field5013 = arg2;
        this.field5009 = arg3;
        this.field5004 = 0;
        this.method1913();
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "([III)V")
    public final synchronized void method159(int[] arg0, int arg1, int arg2) {
        if (this.field5013 == 0 && this.field5017 == 0) {
            this.method177(arg2);
        } else {
            class72 var4 = (class72) super.field3539;
            int var5 = this.field5006 << 8;
            int var6 = this.field5014 << 8;
            int var7 = var4.field1208.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field5010 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field5004 < 0) {
                if (this.field5012 <= 0) {
                    this.method1906();
                    this.method828((byte) 123);
                    return;
                }
                this.field5004 = 0;
            }
            if (this.field5004 >= var7) {
                if (this.field5012 >= 0) {
                    this.method1906();
                    this.method828((byte) 126);
                    return;
                }
                this.field5004 = var7 - 1;
            }
            if (this.field5010 < 0) {
                if (this.field5007) {
                    if (this.field5012 < 0) {
                        var9 = this.method1927(arg0, arg1, var5, var10, var4.field1208[this.field5006]);
                        if (this.field5004 >= var5) {
                            return;
                        }
                        this.field5004 = var5 + var5 - 1 - this.field5004;
                        this.field5012 = -this.field5012;
                    }
                    while (true) {
                        int var11 = this.method1909(arg0, var9, var6, var10, var4.field1208[this.field5014 - 1]);
                        if (this.field5004 < var6) {
                            return;
                        }
                        this.field5004 = var6 + var6 - 1 - this.field5004;
                        this.field5012 = -this.field5012;
                        var9 = this.method1927(arg0, var11, var5, var10, var4.field1208[this.field5006]);
                        if (this.field5004 >= var5) {
                            return;
                        }
                        this.field5004 = var5 + var5 - 1 - this.field5004;
                        this.field5012 = -this.field5012;
                    }
                } else if (this.field5012 < 0) {
                    while (true) {
                        var9 = this.method1927(arg0, var9, var5, var10, var4.field1208[this.field5014 - 1]);
                        if (this.field5004 >= var5) {
                            return;
                        }
                        this.field5004 = var6 - 1 - (var6 - 1 - this.field5004) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method1909(arg0, var9, var6, var10, var4.field1208[this.field5006]);
                        if (this.field5004 < var6) {
                            return;
                        }
                        this.field5004 = (this.field5004 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field5010 > 0) {
                    if (this.field5007) {
                        label130: {
                            if (this.field5012 < 0) {
                                var9 = this.method1927(arg0, arg1, var5, var10, var4.field1208[this.field5006]);
                                if (this.field5004 >= var5) {
                                    return;
                                }
                                this.field5004 = var5 + var5 - 1 - this.field5004;
                                this.field5012 = -this.field5012;
                                if (--this.field5010 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method1909(arg0, var9, var6, var10, var4.field1208[this.field5014 - 1]);
                                if (this.field5004 < var6) {
                                    return;
                                }
                                this.field5004 = var6 + var6 - 1 - this.field5004;
                                this.field5012 = -this.field5012;
                                if (--this.field5010 == 0) {
                                    break;
                                }
                                var9 = this.method1927(arg0, var9, var5, var10, var4.field1208[this.field5006]);
                                if (this.field5004 >= var5) {
                                    return;
                                }
                                this.field5004 = var5 + var5 - 1 - this.field5004;
                                this.field5012 = -this.field5012;
                            } while (--this.field5010 != 0);
                        }
                    } else if (this.field5012 < 0) {
                        while (true) {
                            var9 = this.method1927(arg0, var9, var5, var10, var4.field1208[this.field5014 - 1]);
                            if (this.field5004 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field5004) / var8;
                            if (var12 >= this.field5010) {
                                this.field5004 += this.field5010 * var8;
                                this.field5010 = 0;
                                break;
                            }
                            this.field5004 += var8 * var12;
                            this.field5010 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method1909(arg0, var9, var6, var10, var4.field1208[this.field5006]);
                            if (this.field5004 < var6) {
                                return;
                            }
                            int var13 = (this.field5004 - var5) / var8;
                            if (var13 >= this.field5010) {
                                this.field5004 -= this.field5010 * var8;
                                this.field5010 = 0;
                                break;
                            }
                            this.field5004 -= var8 * var13;
                            this.field5010 -= var13;
                        }
                    }
                }
                if (this.field5012 < 0) {
                    this.method1927(arg0, var9, 0, var10, 0);
                    if (this.field5004 < 0) {
                        this.field5004 = -1;
                        this.method1906();
                        this.method828((byte) 121);
                        return;
                    }
                } else {
                    this.method1909(arg0, var9, var7, var10, 0);
                    if (this.field5004 >= var7) {
                        this.field5004 = var7;
                        this.method1906();
                        this.method828((byte) 121);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!p", name = "g", descriptor = "(I)V")
    public final synchronized void method1919(int arg0) {
        if (arg0 == 0) {
            this.method1893(0);
            this.method828((byte) -9);
        } else if (this.field5015 == 0 && this.field5003 == 0) {
            this.field5017 = 0;
            this.field5013 = 0;
            this.field5016 = 0;
            this.method828((byte) -57);
        } else {
            int var2 = -this.field5016;
            if (this.field5016 > var2) {
                var2 = this.field5016;
            }
            if (-this.field5015 > var2) {
                var2 = -this.field5015;
            }
            if (this.field5015 > var2) {
                var2 = this.field5015;
            }
            if (-this.field5003 > var2) {
                var2 = -this.field5003;
            }
            if (this.field5003 > var2) {
                var2 = this.field5003;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field5017 = arg0;
            this.field5013 = Integer.MIN_VALUE;
            this.field5005 = -this.field5016 / arg0;
            this.field5008 = -this.field5015 / arg0;
            this.field5011 = -this.field5003 / arg0;
        }
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(I[B[IIIIIIIIIILp;)I")
    private static final int method1920(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class286 arg12) {
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
        arg12.field5016 += (var19 - arg4) * arg12.field5005;
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
        arg12.field5015 = var15 >> 2;
        arg12.field5003 = var16 >> 2;
        arg12.field5004 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(II[B[IIIIIIIIIILp;II)I")
    private static final int method1921(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class286 arg13, int arg14, int arg15) {
        arg13.field5016 -= arg13.field5005 * arg5;
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
        arg13.field5016 += arg13.field5005 * var22;
        arg13.field5015 = arg6;
        arg13.field5003 = arg7;
        arg13.field5004 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "([B[IIIIIIILp;)I")
    private static final int method1922(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class286 arg8) {
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
        arg8.field5004 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "([B[IIIIIIIILp;)I")
    private static final int method1923(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class286 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field5015 += (var14 - arg3) * arg9.field5008;
        arg9.field5003 += (var14 - arg3) * arg9.field5011;
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
        arg9.field5016 = var12 >> 2;
        arg9.field5004 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!p", name = "d", descriptor = "(II[B[IIIIIIIILp;II)I")
    private static final int method1924(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class286 arg11, int arg12, int arg13) {
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
        arg11.field5004 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(II[B[IIIIIIIIIILp;II)I")
    private static final int method1925(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class286 arg13, int arg14, int arg15) {
        arg13.field5016 -= arg13.field5005 * arg5;
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
        arg13.field5016 += arg13.field5005 * var22;
        arg13.field5015 = arg6;
        arg13.field5003 = arg7;
        arg13.field5004 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(Z)V")
    public final synchronized void method1926(boolean arg0) {
        this.field5012 = (this.field5012 >>> 31) + (this.field5012 ^ this.field5012 >> 31);
        if (arg0) {
            this.field5012 = -this.field5012;
        }
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "([IIIII)I")
    private final int method1927(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field5017 <= 0) {
                if (this.field5012 == -256 && (this.field5004 & 255) == 0) {
                    if (class85.field1468) {
                        return method1915(0, ((class72) super.field3539).field1208, arg0, this.field5004, arg1, this.field5015, this.field5003, 0, arg3, arg2, this);
                    }
                    return method1922(((class72) super.field3539).field1208, arg0, this.field5004, arg1, this.field5016, 0, arg3, arg2, this);
                }
                if (class85.field1468) {
                    return method1897(0, 0, ((class72) super.field3539).field1208, arg0, this.field5004, arg1, this.field5015, this.field5003, 0, arg3, arg2, this, this.field5012, arg4);
                }
                return method1905(0, 0, ((class72) super.field3539).field1208, arg0, this.field5004, arg1, this.field5016, 0, arg3, arg2, this, this.field5012, arg4);
            }
            int var6 = this.field5017 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field5017 += arg1;
            if (this.field5012 == -256 && (this.field5004 & 255) == 0) {
                if (class85.field1468) {
                    arg1 = method1920(0, ((class72) super.field3539).field1208, arg0, this.field5004, arg1, this.field5015, this.field5003, this.field5008, this.field5011, 0, var6, arg2, this);
                } else {
                    arg1 = method1898(((class72) super.field3539).field1208, arg0, this.field5004, arg1, this.field5016, this.field5005, 0, var6, arg2, this);
                }
            } else if (class85.field1468) {
                arg1 = method1925(0, 0, ((class72) super.field3539).field1208, arg0, this.field5004, arg1, this.field5015, this.field5003, this.field5008, this.field5011, 0, var6, arg2, this, this.field5012, arg4);
            } else {
                arg1 = method1910(0, 0, ((class72) super.field3539).field1208, arg0, this.field5004, arg1, this.field5016, this.field5005, 0, var6, arg2, this, this.field5012, arg4);
            }
            this.field5017 -= arg1;
            if (this.field5017 != 0) {
                return arg1;
            }
        } while (!this.method1903());
        return arg3;
    }

    @OriginalMember(owner = "client!p", name = "h", descriptor = "(I)V")
    public final synchronized void method1928(int arg0) {
        if (this.field5012 < 0) {
            this.field5012 = -arg0;
        } else {
            this.field5012 = arg0;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Ltd;II)Lp;")
    public static final class286 method1929(class72 arg0, int arg1, int arg2) {
        return arg0.field1208 != null && arg0.field1208.length != 0 ? new class286(arg0, (int) ((long) arg0.field1209 * 256L * (long) arg1 / (long) (class225.field3905 * 100)), arg2 << 6) : null;
    }
}
