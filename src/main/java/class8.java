import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class8 extends class54 {

    @OriginalMember(owner = "client!ba", name = "L", descriptor = "I")
    private int field171;

    @OriginalMember(owner = "client!ba", name = "H", descriptor = "I")
    private int field168;

    @OriginalMember(owner = "client!ba", name = "B", descriptor = "I")
    private int field162;

    @OriginalMember(owner = "client!ba", name = "G", descriptor = "I")
    private int field167;

    @OriginalMember(owner = "client!ba", name = "E", descriptor = "I")
    private int field165;

    @OriginalMember(owner = "client!ba", name = "A", descriptor = "I")
    private int field161;

    @OriginalMember(owner = "client!ba", name = "C", descriptor = "I")
    private int field163;

    @OriginalMember(owner = "client!ba", name = "F", descriptor = "I")
    private int field166;

    @OriginalMember(owner = "client!ba", name = "I", descriptor = "I")
    private int field169;

    @OriginalMember(owner = "client!ba", name = "K", descriptor = "I")
    private int field170;

    @OriginalMember(owner = "client!ba", name = "D", descriptor = "Z")
    private boolean field164;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lvb;II)Lba;", line = 4)
    public static final class8 method52(class124 arg0, int arg1, int arg2) {
        return arg0.field2999 != null && arg0.field2999.length != 0 ? new class8(arg0, (int) ((long) arg0.field3000 * 256L * (long) arg1 / (long) (class94.field2391 * 100)), arg2) : null;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "([B[IIIIIIIIILba;)I", line = 10)
    private static final int method53(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class8 arg10) {
        int var11 = arg2 >> 8;
        int var12 = arg9 >> 8;
        int var13 = arg4 << 8;
        int var14 = arg6 << 8;
        int var15;
        if ((var15 = arg3 + var12 - var11) > arg8) {
            var15 = arg8;
        }
        var15 -= 3;
        int var10001;
        while (arg3 < var15) {
            var10001 = arg3++;
            arg1[var10001] += arg0[var11++] * var13 >> arg5;
            int var16 = var13 + var14;
            int var19 = arg3++;
            arg1[var19] += arg0[var11++] * var16 >> arg5;
            int var17 = var14 + var16;
            int var20 = arg3++;
            arg1[var20] += arg0[var11++] * var17 >> arg5;
            int var18 = var14 + var17;
            int var21 = arg3++;
            arg1[var21] += arg0[var11++] * var18 >> arg5;
            var13 = var14 + var18;
        }
        var15 += 3;
        while (arg3 < var15) {
            var10001 = arg3++;
            arg1[var10001] += arg0[var11++] * var13 >> arg5;
            var13 += var14;
        }
        arg10.field167 = var13 >> 8;
        arg10.field165 = var11 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "([B[IIIIIIILba;)I", line = 43)
    private static final int method54(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class8 arg8) {
        int var9 = arg2 >> 8;
        int var10 = arg7 >> 8;
        int var11 = arg4 << 8;
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
        arg8.field165 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "([B[IIIIIIIIILba;)I", line = 72)
    private static final int method55(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class8 arg10) {
        int var11 = arg2 >> 8;
        int var12 = arg9 >> 8;
        int var13 = arg4 << 8;
        int var14 = arg6 << 8;
        int var15;
        if ((var15 = arg3 + var11 - (var12 - 1)) > arg8) {
            var15 = arg8;
        }
        var15 -= 3;
        int var10001;
        while (arg3 < var15) {
            var10001 = arg3++;
            arg1[var10001] += arg0[var11--] * var13 >> arg5;
            int var16 = var13 + var14;
            int var19 = arg3++;
            arg1[var19] += arg0[var11--] * var16 >> arg5;
            int var17 = var14 + var16;
            int var20 = arg3++;
            arg1[var20] += arg0[var11--] * var17 >> arg5;
            int var18 = var14 + var17;
            int var21 = arg3++;
            arg1[var21] += arg0[var11--] * var18 >> arg5;
            var13 = var14 + var18;
        }
        var15 += 3;
        while (arg3 < var15) {
            var10001 = arg3++;
            arg1[var10001] += arg0[var11--] * var13 >> arg5;
            var13 += var14;
        }
        arg10.field167 = var13 >> 8;
        arg10.field165 = var11 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(II[B[IIIIIIILba;II)I", line = 106)
    private static final int method56(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class8 arg10, int arg11, int arg12) {
        int var13;
        if (arg11 == 0 || (var13 = (arg9 + 256 - arg4 + arg11) / arg11 + arg5) > arg8) {
            var13 = arg8;
        }
        int var10001;
        while (arg5 < var13) {
            int var17 = arg4 >> 8;
            byte var18 = arg2[var17 - 1];
            var10001 = arg5++;
            arg3[var10001] += ((var18 << 8) + (arg4 & 255) * (arg2[var17] - var18)) * arg6;
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
            arg3[var10001] += ((var15 << 8) + (arg4 & 255) * (arg2[arg4 >> 8] - var15)) * arg6;
            arg4 += var16;
        }
        arg10.field165 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "([III)I", line = 132)
    public final synchronized int method31(int[] arg0, int arg1, int arg2) {
        if (this.field167 != 0 || this.field163 != 0 && this.field161 != 0 && this.field161 != Integer.MIN_VALUE) {
            class124 var4 = (class124) super.field1332;
            int var5 = this.field171 << 8;
            int var6 = this.field168 << 8;
            int var7 = var4.field2999.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field169 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field169 < 0) {
                if (this.field164) {
                    if (this.field162 < 0) {
                        var9 = this.method64(arg0, arg1, var5, var10, var4.field2999[this.field171]);
                        if (this.field165 >= var5) {
                            return 1;
                        }
                        this.field165 = var5 + var5 - 1 - this.field165;
                        this.field162 = -this.field162;
                    }
                    while (true) {
                        int var11 = this.method57(arg0, var9, var6, var10, var4.field2999[this.field168 - 1]);
                        if (this.field165 < var6) {
                            return 1;
                        }
                        this.field165 = var6 + var6 - 1 - this.field165;
                        this.field162 = -this.field162;
                        var9 = this.method64(arg0, var11, var5, var10, var4.field2999[this.field171]);
                        if (this.field165 >= var5) {
                            return 1;
                        }
                        this.field165 = var5 + var5 - 1 - this.field165;
                        this.field162 = -this.field162;
                    }
                } else if (this.field162 < 0) {
                    while (true) {
                        var9 = this.method64(arg0, var9, var5, var10, var4.field2999[this.field168 - 1]);
                        if (this.field165 >= var5) {
                            return 1;
                        }
                        this.field165 = var6 - 1 - (var6 - 1 - this.field165) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method57(arg0, var9, var6, var10, var4.field2999[this.field171]);
                        if (this.field165 < var6) {
                            return 1;
                        }
                        this.field165 = (this.field165 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field169 > 0) {
                    if (this.field164) {
                        label118: {
                            if (this.field162 < 0) {
                                var9 = this.method64(arg0, arg1, var5, var10, var4.field2999[this.field171]);
                                if (this.field165 >= var5) {
                                    return 1;
                                }
                                this.field165 = var5 + var5 - 1 - this.field165;
                                this.field162 = -this.field162;
                                if (--this.field169 == 0) {
                                    break label118;
                                }
                            }
                            do {
                                var9 = this.method57(arg0, var9, var6, var10, var4.field2999[this.field168 - 1]);
                                if (this.field165 < var6) {
                                    return 1;
                                }
                                this.field165 = var6 + var6 - 1 - this.field165;
                                this.field162 = -this.field162;
                                if (--this.field169 == 0) {
                                    break;
                                }
                                var9 = this.method64(arg0, var9, var5, var10, var4.field2999[this.field171]);
                                if (this.field165 >= var5) {
                                    return 1;
                                }
                                this.field165 = var5 + var5 - 1 - this.field165;
                                this.field162 = -this.field162;
                            } while (--this.field169 != 0);
                        }
                    } else if (this.field162 < 0) {
                        while (true) {
                            var9 = this.method64(arg0, var9, var5, var10, var4.field2999[this.field168 - 1]);
                            if (this.field165 >= var5) {
                                return 1;
                            }
                            int var12 = (var6 - 1 - this.field165) / var8;
                            if (var12 >= this.field169) {
                                this.field165 += this.field169 * var8;
                                this.field169 = 0;
                                break;
                            }
                            this.field165 += var8 * var12;
                            this.field169 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method57(arg0, var9, var6, var10, var4.field2999[this.field171]);
                            if (this.field165 < var6) {
                                return 1;
                            }
                            int var13 = (this.field165 - var5) / var8;
                            if (var13 >= this.field169) {
                                this.field165 -= this.field169 * var8;
                                this.field169 = 0;
                                break;
                            }
                            this.field165 -= var8 * var13;
                            this.field169 -= var13;
                        }
                    }
                }
                if (this.field162 < 0) {
                    this.method64(arg0, var9, 0, var10, 0);
                    if (this.field165 < 0) {
                        this.field165 = 0;
                        this.method948(65);
                    }
                } else {
                    this.method57(arg0, var9, var7, var10, 0);
                    if (this.field165 >= var7) {
                        this.field165 = var7 - 1;
                        this.method948(79);
                    }
                }
                return 1;
            }
        } else {
            this.method24(arg2);
            return 0;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "([IIIII)I", line = 340)
    private final int method57(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        if (this.field163 > 0) {
            int var6 = this.field163 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field163 += arg1;
            if (this.field162 == 256 && (this.field165 & 255) == 0) {
                arg1 = method53(((class124) super.field1332).field2999, arg0, this.field165, arg1, this.field167, this.field170, this.field166, 0, var6, arg2, this);
            } else {
                arg1 = method63(0, 0, ((class124) super.field1332).field2999, arg0, this.field165, arg1, this.field167, this.field170, this.field166, 0, var6, arg2, this, this.field162, arg4);
            }
            this.field163 -= arg1;
            if (this.field163 != 0) {
                return arg1;
            }
            if (this.field161 == Integer.MIN_VALUE) {
                this.method948(-84);
                return arg3;
            }
            this.field167 = this.field161;
        }
        return this.field162 == 256 && (this.field165 & 255) == 0 ? method54(((class124) super.field1332).field2999, arg0, this.field165, arg1, this.field167, 0, arg3, arg2, this) : method62(0, 0, ((class124) super.field1332).field2999, arg0, this.field165, arg1, this.field167, 0, arg3, arg2, this, this.field162, arg4);
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "([B[IIIIIIILba;)I", line = 384)
    private static final int method58(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class8 arg8) {
        int var9 = arg2 >> 8;
        int var10 = arg7 >> 8;
        int var11 = arg4 << 8;
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
        arg8.field165 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "()Z", line = 409)
    public final boolean method59() {
        return this.method953(true);
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(II[B[IIIIIIIIILba;II)I", line = 413)
    private static final int method60(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class8 arg12, int arg13, int arg14) {
        int var15;
        if (arg13 == 0 || (var15 = (arg11 + 256 - arg4 + arg13) / arg13 + arg5) > arg10) {
            var15 = arg10;
        }
        int var10001;
        while (arg5 < var15) {
            int var19 = arg4 >> 8;
            byte var20 = arg2[var19 - 1];
            var10001 = arg5++;
            arg3[var10001] += ((var20 << 8) + (arg4 & 255) * (arg2[var19] - var20)) * arg6 >> arg7;
            arg6 += arg8;
            arg4 += arg13;
        }
        int var16;
        if (arg13 == 0 || (var16 = (arg11 - arg4 + arg13) / arg13 + arg5) > arg10) {
            var16 = arg10;
        }
        int var17 = arg14;
        int var18 = arg13;
        while (arg5 < var16) {
            var10001 = arg5++;
            arg3[var10001] += ((var17 << 8) + (arg4 & 255) * (arg2[arg4 >> 8] - var17)) * arg6 >> arg7;
            arg6 += arg8;
            arg4 += var18;
        }
        arg12.field167 = arg6;
        arg12.field165 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "(I)V", line = 443)
    public final synchronized void method61(int arg0) {
        this.field167 = arg0;
        this.field163 = 0;
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(II[B[IIIIIIILba;II)I", line = 449)
    private static final int method62(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class8 arg10, int arg11, int arg12) {
        int var13;
        if (arg11 == 0 || (var13 = (arg9 - arg4 + arg11 - 257) / arg11 + arg5) > arg8) {
            var13 = arg8;
        }
        int var10001;
        while (arg5 < var13) {
            int var17 = arg4 >> 8;
            byte var18 = arg2[var17];
            var10001 = arg5++;
            arg3[var10001] += ((var18 << 8) + (arg4 & 255) * (arg2[var17 + 1] - var18)) * arg6;
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
            arg3[var10001] += ((var16 << 8) + (arg4 & 255) * (var15 - var16)) * arg6;
            arg4 += arg11;
        }
        arg10.field165 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(II[B[IIIIIIIIILba;II)I", line = 475)
    private static final int method63(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class8 arg12, int arg13, int arg14) {
        int var15;
        if (arg13 == 0 || (var15 = (arg11 - arg4 + arg13 - 257) / arg13 + arg5) > arg10) {
            var15 = arg10;
        }
        int var10001;
        while (arg5 < var15) {
            int var19 = arg4 >> 8;
            byte var20 = arg2[var19];
            var10001 = arg5++;
            arg3[var10001] += ((var20 << 8) + (arg4 & 255) * (arg2[var19 + 1] - var20)) * arg6 >> arg7;
            arg6 += arg8;
            arg4 += arg13;
        }
        int var16;
        if (arg13 == 0 || (var16 = (arg11 - arg4 + arg13 - 1) / arg13 + arg5) > arg10) {
            var16 = arg10;
        }
        int var17 = arg14;
        while (arg5 < var16) {
            byte var18 = arg2[arg4 >> 8];
            var10001 = arg5++;
            arg3[var10001] += ((var18 << 8) + (arg4 & 255) * (var17 - var18)) * arg6 >> arg7;
            arg6 += arg8;
            arg4 += arg13;
        }
        arg12.field167 = arg6;
        arg12.field165 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "([IIIII)I", line = 504)
    private final int method64(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        if (this.field163 > 0) {
            int var6 = this.field163 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field163 += arg1;
            if (this.field162 == -256 && (this.field165 & 255) == 0) {
                arg1 = method55(((class124) super.field1332).field2999, arg0, this.field165, arg1, this.field167, this.field170, this.field166, 0, var6, arg2, this);
            } else {
                arg1 = method60(0, 0, ((class124) super.field1332).field2999, arg0, this.field165, arg1, this.field167, this.field170, this.field166, 0, var6, arg2, this, this.field162, arg4);
            }
            this.field163 -= arg1;
            if (this.field163 != 0) {
                return arg1;
            }
            if (this.field161 == Integer.MIN_VALUE) {
                this.method948(-62);
                return arg3;
            }
            this.field167 = this.field161;
        }
        return this.field162 == -256 && (this.field165 & 255) == 0 ? method58(((class124) super.field1332).field2999, arg0, this.field165, arg1, this.field167, 0, arg3, arg2, this) : method56(0, 0, ((class124) super.field1332).field2999, arg0, this.field165, arg1, this.field167, 0, arg3, arg2, this, this.field162, arg4);
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "()I", line = 550)
    public final int method65() {
        int var1 = this.field167 * 3;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field169 == 0) {
            var2 -= this.field165 * var2 / (((class124) super.field1332).field2999.length << 8);
        } else if (this.field169 >= 0) {
            var2 -= this.field171 * var2 / ((class124) super.field1332).field2999.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "(I)V", line = 564)
    public final synchronized void method24(int arg0) {
        if (this.field163 > 0) {
            if (arg0 >= this.field163) {
                if (this.field161 == Integer.MIN_VALUE) {
                    this.method948(-126);
                    arg0 = this.field163;
                } else {
                    this.field167 = this.field161;
                }
                this.field163 = 0;
            } else {
                this.field167 += this.field166 * arg0;
                this.field163 -= arg0;
            }
        }
        this.field165 += this.field162 * arg0;
        class124 var2 = (class124) super.field1332;
        int var3 = this.field171 << 8;
        int var4 = this.field168 << 8;
        int var5 = var2.field2999.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field169 = 0;
        }
        if (this.field169 < 0) {
            if (!this.field164) {
                if (this.field162 < 0) {
                    if (this.field165 < var3) {
                        this.field165 = var4 - 1 - (var4 - 1 - this.field165) % var6;
                    }
                } else if (this.field165 >= var4) {
                    this.field165 = (this.field165 - var3) % var6 + var3;
                }
            } else {
                if (this.field162 < 0) {
                    if (this.field165 >= var3) {
                        return;
                    }
                    this.field165 = var3 + var3 - 1 - this.field165;
                    this.field162 = -this.field162;
                }
                while (this.field165 >= var4) {
                    this.field165 = var4 + var4 - 1 - this.field165;
                    this.field162 = -this.field162;
                    if (this.field165 >= var3) {
                        return;
                    }
                    this.field165 = var3 + var3 - 1 - this.field165;
                    this.field162 = -this.field162;
                }
            }
        } else {
            if (this.field169 > 0) {
                if (this.field164) {
                    label113: {
                        if (this.field162 < 0) {
                            if (this.field165 >= var3) {
                                return;
                            }
                            this.field165 = var3 + var3 - 1 - this.field165;
                            this.field162 = -this.field162;
                            if (--this.field169 == 0) {
                                break label113;
                            }
                        }
                        do {
                            if (this.field165 < var4) {
                                return;
                            }
                            this.field165 = var4 + var4 - 1 - this.field165;
                            this.field162 = -this.field162;
                            if (--this.field169 == 0) {
                                break;
                            }
                            if (this.field165 >= var3) {
                                return;
                            }
                            this.field165 = var3 + var3 - 1 - this.field165;
                            this.field162 = -this.field162;
                        } while (--this.field169 != 0);
                    }
                } else if (this.field162 < 0) {
                    if (this.field165 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field165) / var6;
                    if (var7 < this.field169) {
                        this.field165 += var6 * var7;
                        this.field169 -= var7;
                        return;
                    }
                    this.field165 += this.field169 * var6;
                    this.field169 = 0;
                } else {
                    if (this.field165 < var4) {
                        return;
                    }
                    int var8 = (this.field165 - var3) / var6;
                    if (var8 < this.field169) {
                        this.field165 -= var6 * var8;
                        this.field169 -= var8;
                        return;
                    }
                    this.field165 -= this.field169 * var6;
                    this.field169 = 0;
                }
            }
            if (this.field162 < 0) {
                if (this.field165 < 0) {
                    this.field165 = 0;
                    this.method948(100);
                    return;
                }
            } else if (this.field165 >= var5) {
                this.field165 = var5 - 1;
                this.method948(77);
            }
        }
    }

    @OriginalMember(owner = "client!ba", name = "f", descriptor = "(I)V", line = 754)
    public final synchronized void method66(int arg0) {
        this.field169 = arg0;
    }

    @OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(Lvb;II)V", line = 757)
    private class8(class124 arg0, int arg1, int arg2) {
        super.field1332 = arg0;
        this.field171 = arg0.field3002;
        this.field168 = arg0.field3001;
        this.field162 = arg1;
        this.field167 = arg2;
        this.field165 = 0;
    }
}
