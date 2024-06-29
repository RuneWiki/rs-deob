import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class245 extends class129 {

    @OriginalMember(owner = "client!wf", name = "H", descriptor = "I")
    private int field4516;

    @OriginalMember(owner = "client!wf", name = "E", descriptor = "I")
    private int field4513;

    @OriginalMember(owner = "client!wf", name = "M", descriptor = "Z")
    private boolean field4520;

    @OriginalMember(owner = "client!wf", name = "G", descriptor = "I")
    private int field4515;

    @OriginalMember(owner = "client!wf", name = "y", descriptor = "I")
    private int field4507;

    @OriginalMember(owner = "client!wf", name = "J", descriptor = "I")
    private int field4518;

    @OriginalMember(owner = "client!wf", name = "I", descriptor = "I")
    private int field4517;

    @OriginalMember(owner = "client!wf", name = "z", descriptor = "I")
    private int field4508;

    @OriginalMember(owner = "client!wf", name = "A", descriptor = "I")
    private int field4509;

    @OriginalMember(owner = "client!wf", name = "B", descriptor = "I")
    private int field4510;

    @OriginalMember(owner = "client!wf", name = "C", descriptor = "I")
    private int field4511;

    @OriginalMember(owner = "client!wf", name = "D", descriptor = "I")
    private int field4512;

    @OriginalMember(owner = "client!wf", name = "F", descriptor = "I")
    private int field4514;

    @OriginalMember(owner = "client!wf", name = "K", descriptor = "I")
    private int field4519;

    @OriginalMember(owner = "client!wf", name = "N", descriptor = "I")
    private int field4521;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Z)V")
    public final synchronized void method1573(boolean arg0) {
        this.field4515 = (this.field4515 >>> 31) + (this.field4515 ^ this.field4515 >> 31);
        if (arg0) {
            this.field4515 = -this.field4515;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "()I")
    public final int method881() {
        int var1 = this.field4514 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field4511 == 0) {
            var2 -= this.field4517 * var2 / (((class168) super.field2382).field3035.length << 8);
        } else if (this.field4511 >= 0) {
            var2 -= this.field4516 * var2 / ((class168) super.field2382).field3035.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(I[B[IIIIIIIILwf;)I")
    private static final int method1574(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class245 arg10) {
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
        arg10.field4517 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!wf", name = "e", descriptor = "()Z")
    public final boolean method1575() {
        return this.field4517 < 0 || this.field4517 >= ((class168) super.field2382).field3035.length << 8;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(II)I")
    private static final int method1576(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!wf", name = "f", descriptor = "()I")
    public final synchronized int method1577() {
        return this.field4515 < 0 ? -this.field4515 : this.field4515;
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(II)V")
    public final synchronized void method1578(int arg0, int arg1) {
        this.method1585(arg0, arg1, this.method1580());
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(II[B[IIIIIIIIIILwf;II)I")
    private static final int method1579(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class245 arg13, int arg14, int arg15) {
        arg13.field4514 -= arg13.field4512 * arg5;
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
        arg13.field4514 += arg13.field4512 * var22;
        arg13.field4519 = arg6;
        arg13.field4521 = arg7;
        arg13.field4517 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!wf", name = "g", descriptor = "()I")
    public final synchronized int method1580() {
        return this.field4518 < 0 ? -1 : this.field4518;
    }

    @OriginalMember(owner = "client!wf", name = "h", descriptor = "()I")
    public final synchronized int method1581() {
        return this.field4507 == Integer.MIN_VALUE ? 0 : this.field4507;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "([IIIII)I")
    private final int method1582(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field4508 <= 0) {
                if (this.field4515 == 256 && (this.field4517 & 255) == 0) {
                    if (class66.field1271) {
                        return method1604(0, ((class168) super.field2382).field3035, arg0, this.field4517, arg1, this.field4519, this.field4521, 0, arg3, arg2, this);
                    }
                    return method1610(((class168) super.field2382).field3035, arg0, this.field4517, arg1, this.field4514, 0, arg3, arg2, this);
                }
                if (class66.field1271) {
                    return method1600(0, 0, ((class168) super.field2382).field3035, arg0, this.field4517, arg1, this.field4519, this.field4521, 0, arg3, arg2, this, this.field4515, arg4);
                }
                return method1606(0, 0, ((class168) super.field2382).field3035, arg0, this.field4517, arg1, this.field4514, 0, arg3, arg2, this, this.field4515, arg4);
            }
            int var6 = this.field4508 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field4508 += arg1;
            if (this.field4515 == 256 && (this.field4517 & 255) == 0) {
                if (class66.field1271) {
                    arg1 = method1612(0, ((class168) super.field2382).field3035, arg0, this.field4517, arg1, this.field4519, this.field4521, this.field4509, this.field4510, 0, var6, arg2, this);
                } else {
                    arg1 = method1611(((class168) super.field2382).field3035, arg0, this.field4517, arg1, this.field4514, this.field4512, 0, var6, arg2, this);
                }
            } else if (class66.field1271) {
                arg1 = method1586(0, 0, ((class168) super.field2382).field3035, arg0, this.field4517, arg1, this.field4519, this.field4521, this.field4509, this.field4510, 0, var6, arg2, this, this.field4515, arg4);
            } else {
                arg1 = method1594(0, 0, ((class168) super.field2382).field3035, arg0, this.field4517, arg1, this.field4514, this.field4512, 0, var6, arg2, this, this.field4515, arg4);
            }
            this.field4508 -= arg1;
            if (this.field4508 != 0) {
                return arg1;
            }
        } while (!this.method1595());
        return arg3;
    }

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "(I)V")
    public final synchronized void method1583(int arg0) {
        if (arg0 == 0) {
            this.method1605(0);
            this.method123((byte) -126);
        } else if (this.field4519 == 0 && this.field4521 == 0) {
            this.field4508 = 0;
            this.field4507 = 0;
            this.field4514 = 0;
            this.method123((byte) -126);
        } else {
            int var2 = -this.field4514;
            if (this.field4514 > var2) {
                var2 = this.field4514;
            }
            if (-this.field4519 > var2) {
                var2 = -this.field4519;
            }
            if (this.field4519 > var2) {
                var2 = this.field4519;
            }
            if (-this.field4521 > var2) {
                var2 = -this.field4521;
            }
            if (this.field4521 > var2) {
                var2 = this.field4521;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field4508 = arg0;
            this.field4507 = Integer.MIN_VALUE;
            this.field4512 = -this.field4514 / arg0;
            this.field4509 = -this.field4519 / arg0;
            this.field4510 = -this.field4521 / arg0;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Lpd;II)Lwf;")
    public static final class245 method1584(class168 arg0, int arg1, int arg2) {
        return arg0.field3035 != null && arg0.field3035.length != 0 ? new class245(arg0, (int) ((long) arg0.field3037 * 256L * (long) arg1 / (long) (class214.field3883 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(III)V")
    public final synchronized void method1585(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1608(arg1, arg2);
        } else {
            int var4 = method1590(arg1, arg2);
            int var5 = method1576(arg1, arg2);
            if (this.field4519 == var4 && this.field4521 == var5) {
                this.field4508 = 0;
            } else {
                int var6 = arg1 - this.field4514;
                if (this.field4514 - arg1 > var6) {
                    var6 = this.field4514 - arg1;
                }
                if (var4 - this.field4519 > var6) {
                    var6 = var4 - this.field4519;
                }
                if (this.field4519 - var4 > var6) {
                    var6 = this.field4519 - var4;
                }
                if (var5 - this.field4521 > var6) {
                    var6 = var5 - this.field4521;
                }
                if (this.field4521 - var5 > var6) {
                    var6 = this.field4521 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field4508 = arg0;
                this.field4507 = arg1;
                this.field4518 = arg2;
                this.field4512 = (arg1 - this.field4514) / arg0;
                this.field4509 = (var4 - this.field4519) / arg0;
                this.field4510 = (var5 - this.field4521) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(II[B[IIIIIIIIIILwf;II)I")
    private static final int method1586(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class245 arg13, int arg14, int arg15) {
        arg13.field4514 -= arg13.field4512 * arg5;
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
        arg13.field4514 += arg13.field4512 * var22;
        arg13.field4519 = arg6;
        arg13.field4521 = arg7;
        arg13.field4517 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "(I)V")
    public final synchronized void method1587(int arg0) {
        this.method1608(arg0 << 6, this.method1580());
    }

    @OriginalMember(owner = "client!wf", name = "e", descriptor = "(I)V")
    public final synchronized void method1588(int arg0) {
        this.field4511 = arg0;
    }

    @OriginalMember(owner = "client!wf", name = "f", descriptor = "(I)V")
    public final synchronized void method1589(int arg0) {
        int var2 = ((class168) super.field2382).field3035.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field4517 = arg0;
    }

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "(II)I")
    private static final int method1590(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "([IIIII)I")
    private final int method1591(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field4508 <= 0) {
                if (this.field4515 == -256 && (this.field4517 & 255) == 0) {
                    if (class66.field1271) {
                        return method1574(0, ((class168) super.field2382).field3035, arg0, this.field4517, arg1, this.field4519, this.field4521, 0, arg3, arg2, this);
                    }
                    return method1599(((class168) super.field2382).field3035, arg0, this.field4517, arg1, this.field4514, 0, arg3, arg2, this);
                }
                if (class66.field1271) {
                    return method1597(0, 0, ((class168) super.field2382).field3035, arg0, this.field4517, arg1, this.field4519, this.field4521, 0, arg3, arg2, this, this.field4515, arg4);
                }
                return method1593(0, 0, ((class168) super.field2382).field3035, arg0, this.field4517, arg1, this.field4514, 0, arg3, arg2, this, this.field4515, arg4);
            }
            int var6 = this.field4508 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field4508 += arg1;
            if (this.field4515 == -256 && (this.field4517 & 255) == 0) {
                if (class66.field1271) {
                    arg1 = method1603(0, ((class168) super.field2382).field3035, arg0, this.field4517, arg1, this.field4519, this.field4521, this.field4509, this.field4510, 0, var6, arg2, this);
                } else {
                    arg1 = method1601(((class168) super.field2382).field3035, arg0, this.field4517, arg1, this.field4514, this.field4512, 0, var6, arg2, this);
                }
            } else if (class66.field1271) {
                arg1 = method1579(0, 0, ((class168) super.field2382).field3035, arg0, this.field4517, arg1, this.field4519, this.field4521, this.field4509, this.field4510, 0, var6, arg2, this, this.field4515, arg4);
            } else {
                arg1 = method1596(0, 0, ((class168) super.field2382).field3035, arg0, this.field4517, arg1, this.field4514, this.field4512, 0, var6, arg2, this, this.field4515, arg4);
            }
            this.field4508 -= arg1;
            if (this.field4508 != 0) {
                return arg1;
            }
        } while (!this.method1595());
        return arg3;
    }

    @OriginalMember(owner = "client!wf", name = "i", descriptor = "()V")
    private final void method1592() {
        if (this.field4508 != 0) {
            if (this.field4507 == Integer.MIN_VALUE) {
                this.field4507 = 0;
            }
            this.field4508 = 0;
            this.method1607();
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(II[B[IIIIIIILwf;II)I")
    private static final int method1593(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class245 arg10, int arg11, int arg12) {
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
        arg10.field4517 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(II[B[IIIIIIIILwf;II)I")
    private static final int method1594(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class245 arg11, int arg12, int arg13) {
        arg11.field4519 -= arg11.field4509 * arg5;
        arg11.field4521 -= arg11.field4510 * arg5;
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
        arg11.field4519 += arg11.field4509 * arg5;
        arg11.field4521 += arg11.field4510 * arg5;
        arg11.field4514 = arg6;
        arg11.field4517 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!wf", name = "j", descriptor = "()Z")
    private final boolean method1595() {
        int var1 = this.field4507;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1590(var1, this.field4518);
            var2 = method1576(var1, this.field4518);
        }
        if (this.field4514 == var1 && this.field4519 == var3 && this.field4521 == var2) {
            if (this.field4507 == Integer.MIN_VALUE) {
                this.field4507 = 0;
                this.field4514 = this.field4519 = this.field4521 = 0;
                this.method123((byte) -126);
                return true;
            } else {
                this.method1607();
                return false;
            }
        } else {
            if (this.field4514 < var1) {
                this.field4512 = 1;
                this.field4508 = var1 - this.field4514;
            } else if (this.field4514 > var1) {
                this.field4512 = -1;
                this.field4508 = this.field4514 - var1;
            } else {
                this.field4512 = 0;
            }
            if (this.field4519 < var3) {
                this.field4509 = 1;
                if (this.field4508 == 0 || this.field4508 > var3 - this.field4519) {
                    this.field4508 = var3 - this.field4519;
                }
            } else if (this.field4519 > var3) {
                this.field4509 = -1;
                if (this.field4508 == 0 || this.field4508 > this.field4519 - var3) {
                    this.field4508 = this.field4519 - var3;
                }
            } else {
                this.field4509 = 0;
            }
            if (this.field4521 < var2) {
                this.field4510 = 1;
                if (this.field4508 == 0 || this.field4508 > var2 - this.field4521) {
                    this.field4508 = var2 - this.field4521;
                }
            } else if (this.field4521 > var2) {
                this.field4510 = -1;
                if (this.field4508 == 0 || this.field4508 > this.field4521 - var2) {
                    this.field4508 = this.field4521 - var2;
                }
            } else {
                this.field4510 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "()I")
    public final int method348() {
        return this.field4507 == 0 && this.field4508 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(II[B[IIIIIIIILwf;II)I")
    private static final int method1596(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class245 arg11, int arg12, int arg13) {
        arg11.field4519 -= arg11.field4509 * arg5;
        arg11.field4521 -= arg11.field4510 * arg5;
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
        arg11.field4519 += arg11.field4509 * arg5;
        arg11.field4521 += arg11.field4510 * arg5;
        arg11.field4514 = arg6;
        arg11.field4517 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "()Lli;")
    public final class129 method344() {
        return null;
    }

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "(II[B[IIIIIIIILwf;II)I")
    private static final int method1597(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class245 arg11, int arg12, int arg13) {
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
        arg11.field4517 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "([III)V")
    public final synchronized void method341(int[] arg0, int arg1, int arg2) {
        if (this.field4507 == 0 && this.field4508 == 0) {
            this.method347(arg2);
        } else {
            class168 var4 = (class168) super.field2382;
            int var5 = this.field4516 << 8;
            int var6 = this.field4513 << 8;
            int var7 = var4.field3035.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field4511 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field4517 < 0) {
                if (this.field4515 <= 0) {
                    this.method1592();
                    this.method123((byte) -126);
                    return;
                }
                this.field4517 = 0;
            }
            if (this.field4517 >= var7) {
                if (this.field4515 >= 0) {
                    this.method1592();
                    this.method123((byte) -126);
                    return;
                }
                this.field4517 = var7 - 1;
            }
            if (this.field4511 < 0) {
                if (this.field4520) {
                    if (this.field4515 < 0) {
                        var9 = this.method1591(arg0, arg1, var5, var10, var4.field3035[this.field4516]);
                        if (this.field4517 >= var5) {
                            return;
                        }
                        this.field4517 = var5 + var5 - 1 - this.field4517;
                        this.field4515 = -this.field4515;
                    }
                    while (true) {
                        int var11 = this.method1582(arg0, var9, var6, var10, var4.field3035[this.field4513 - 1]);
                        if (this.field4517 < var6) {
                            return;
                        }
                        this.field4517 = var6 + var6 - 1 - this.field4517;
                        this.field4515 = -this.field4515;
                        var9 = this.method1591(arg0, var11, var5, var10, var4.field3035[this.field4516]);
                        if (this.field4517 >= var5) {
                            return;
                        }
                        this.field4517 = var5 + var5 - 1 - this.field4517;
                        this.field4515 = -this.field4515;
                    }
                } else if (this.field4515 < 0) {
                    while (true) {
                        var9 = this.method1591(arg0, var9, var5, var10, var4.field3035[this.field4513 - 1]);
                        if (this.field4517 >= var5) {
                            return;
                        }
                        this.field4517 = var6 - 1 - (var6 - 1 - this.field4517) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method1582(arg0, var9, var6, var10, var4.field3035[this.field4516]);
                        if (this.field4517 < var6) {
                            return;
                        }
                        this.field4517 = (this.field4517 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field4511 > 0) {
                    if (this.field4520) {
                        label130: {
                            if (this.field4515 < 0) {
                                var9 = this.method1591(arg0, arg1, var5, var10, var4.field3035[this.field4516]);
                                if (this.field4517 >= var5) {
                                    return;
                                }
                                this.field4517 = var5 + var5 - 1 - this.field4517;
                                this.field4515 = -this.field4515;
                                if (--this.field4511 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method1582(arg0, var9, var6, var10, var4.field3035[this.field4513 - 1]);
                                if (this.field4517 < var6) {
                                    return;
                                }
                                this.field4517 = var6 + var6 - 1 - this.field4517;
                                this.field4515 = -this.field4515;
                                if (--this.field4511 == 0) {
                                    break;
                                }
                                var9 = this.method1591(arg0, var9, var5, var10, var4.field3035[this.field4516]);
                                if (this.field4517 >= var5) {
                                    return;
                                }
                                this.field4517 = var5 + var5 - 1 - this.field4517;
                                this.field4515 = -this.field4515;
                            } while (--this.field4511 != 0);
                        }
                    } else if (this.field4515 < 0) {
                        while (true) {
                            var9 = this.method1591(arg0, var9, var5, var10, var4.field3035[this.field4513 - 1]);
                            if (this.field4517 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field4517) / var8;
                            if (var12 >= this.field4511) {
                                this.field4517 += this.field4511 * var8;
                                this.field4511 = 0;
                                break;
                            }
                            this.field4517 += var8 * var12;
                            this.field4511 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method1582(arg0, var9, var6, var10, var4.field3035[this.field4516]);
                            if (this.field4517 < var6) {
                                return;
                            }
                            int var13 = (this.field4517 - var5) / var8;
                            if (var13 >= this.field4511) {
                                this.field4517 -= this.field4511 * var8;
                                this.field4511 = 0;
                                break;
                            }
                            this.field4517 -= var8 * var13;
                            this.field4511 -= var13;
                        }
                    }
                }
                if (this.field4515 < 0) {
                    this.method1591(arg0, var9, 0, var10, 0);
                    if (this.field4517 < 0) {
                        this.field4517 = -1;
                        this.method1592();
                        this.method123((byte) -126);
                        return;
                    }
                } else {
                    this.method1582(arg0, var9, var7, var10, 0);
                    if (this.field4517 >= var7) {
                        this.field4517 = var7;
                        this.method1592();
                        this.method123((byte) -126);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Lpd;III)Lwf;")
    public static final class245 method1598(class168 arg0, int arg1, int arg2, int arg3) {
        return arg0.field3035 != null && arg0.field3035.length != 0 ? new class245(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "([B[IIIIIIILwf;)I")
    private static final int method1599(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class245 arg8) {
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
        arg8.field4517 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "(II[B[IIIIIIIILwf;II)I")
    private static final int method1600(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class245 arg11, int arg12, int arg13) {
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
        arg11.field4517 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "([B[IIIIIIIILwf;)I")
    private static final int method1601(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class245 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field4519 += (var14 - arg3) * arg9.field4509;
        arg9.field4521 += (var14 - arg3) * arg9.field4510;
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
        arg9.field4514 = var12 >> 2;
        arg9.field4517 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!wf", name = "k", descriptor = "()Z")
    public final boolean method1602() {
        return this.field4508 != 0;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(I[B[IIIIIIIIIILwf;)I")
    private static final int method1603(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class245 arg12) {
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
        arg12.field4514 += (var19 - arg4) * arg12.field4512;
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
        arg12.field4519 = var15 >> 2;
        arg12.field4521 = var16 >> 2;
        arg12.field4517 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(I[B[IIIIIIIILwf;)I")
    private static final int method1604(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class245 arg10) {
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
        arg10.field4517 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!wf", name = "g", descriptor = "(I)V")
    private final synchronized void method1605(int arg0) {
        this.method1608(arg0, this.method1580());
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(II[B[IIIIIIILwf;II)I")
    private static final int method1606(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class245 arg10, int arg11, int arg12) {
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
        arg10.field4517 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!wf", name = "l", descriptor = "()V")
    private final void method1607() {
        this.field4514 = this.field4507;
        this.field4519 = method1590(this.field4507, this.field4518);
        this.field4521 = method1576(this.field4507, this.field4518);
    }

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "(II)V")
    private final synchronized void method1608(int arg0, int arg1) {
        this.field4507 = arg0;
        this.field4518 = arg1;
        this.field4508 = 0;
        this.method1607();
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(I)V")
    public final synchronized void method347(int arg0) {
        if (this.field4508 > 0) {
            if (arg0 >= this.field4508) {
                if (this.field4507 == Integer.MIN_VALUE) {
                    this.field4507 = 0;
                    this.field4514 = this.field4519 = this.field4521 = 0;
                    this.method123((byte) -126);
                    arg0 = this.field4508;
                }
                this.field4508 = 0;
                this.method1607();
            } else {
                this.field4514 += this.field4512 * arg0;
                this.field4519 += this.field4509 * arg0;
                this.field4521 += this.field4510 * arg0;
                this.field4508 -= arg0;
            }
        }
        class168 var2 = (class168) super.field2382;
        int var3 = this.field4516 << 8;
        int var4 = this.field4513 << 8;
        int var5 = var2.field3035.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field4511 = 0;
        }
        if (this.field4517 < 0) {
            if (this.field4515 <= 0) {
                this.method1592();
                this.method123((byte) -126);
                return;
            }
            this.field4517 = 0;
        }
        if (this.field4517 >= var5) {
            if (this.field4515 >= 0) {
                this.method1592();
                this.method123((byte) -126);
                return;
            }
            this.field4517 = var5 - 1;
        }
        this.field4517 += this.field4515 * arg0;
        if (this.field4511 < 0) {
            if (!this.field4520) {
                if (this.field4515 < 0) {
                    if (this.field4517 < var3) {
                        this.field4517 = var4 - 1 - (var4 - 1 - this.field4517) % var6;
                    }
                } else if (this.field4517 >= var4) {
                    this.field4517 = (this.field4517 - var3) % var6 + var3;
                }
            } else {
                if (this.field4515 < 0) {
                    if (this.field4517 >= var3) {
                        return;
                    }
                    this.field4517 = var3 + var3 - 1 - this.field4517;
                    this.field4515 = -this.field4515;
                }
                while (this.field4517 >= var4) {
                    this.field4517 = var4 + var4 - 1 - this.field4517;
                    this.field4515 = -this.field4515;
                    if (this.field4517 >= var3) {
                        return;
                    }
                    this.field4517 = var3 + var3 - 1 - this.field4517;
                    this.field4515 = -this.field4515;
                }
            }
        } else {
            if (this.field4511 > 0) {
                if (this.field4520) {
                    label125: {
                        if (this.field4515 < 0) {
                            if (this.field4517 >= var3) {
                                return;
                            }
                            this.field4517 = var3 + var3 - 1 - this.field4517;
                            this.field4515 = -this.field4515;
                            if (--this.field4511 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field4517 < var4) {
                                return;
                            }
                            this.field4517 = var4 + var4 - 1 - this.field4517;
                            this.field4515 = -this.field4515;
                            if (--this.field4511 == 0) {
                                break;
                            }
                            if (this.field4517 >= var3) {
                                return;
                            }
                            this.field4517 = var3 + var3 - 1 - this.field4517;
                            this.field4515 = -this.field4515;
                        } while (--this.field4511 != 0);
                    }
                } else if (this.field4515 < 0) {
                    if (this.field4517 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field4517) / var6;
                    if (var7 < this.field4511) {
                        this.field4517 += var6 * var7;
                        this.field4511 -= var7;
                        return;
                    }
                    this.field4517 += this.field4511 * var6;
                    this.field4511 = 0;
                } else {
                    if (this.field4517 < var4) {
                        return;
                    }
                    int var8 = (this.field4517 - var3) / var6;
                    if (var8 < this.field4511) {
                        this.field4517 -= var6 * var8;
                        this.field4511 -= var8;
                        return;
                    }
                    this.field4517 -= this.field4511 * var6;
                    this.field4511 = 0;
                }
            }
            if (this.field4515 < 0) {
                if (this.field4517 < 0) {
                    this.field4517 = -1;
                    this.method1592();
                    this.method123((byte) -126);
                    return;
                }
            } else if (this.field4517 >= var5) {
                this.field4517 = var5;
                this.method1592();
                this.method123((byte) -126);
            }
        }
    }

    @OriginalMember(owner = "client!wf", name = "h", descriptor = "(I)V")
    public final synchronized void method1609(int arg0) {
        if (this.field4515 < 0) {
            this.field4515 = -arg0;
        } else {
            this.field4515 = arg0;
        }
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "([B[IIIIIIILwf;)I")
    private static final int method1610(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class245 arg8) {
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
        arg8.field4517 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "([B[IIIIIIIILwf;)I")
    private static final int method1611(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class245 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field4519 += (var14 - arg3) * arg9.field4509;
        arg9.field4521 += (var14 - arg3) * arg9.field4510;
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
        arg9.field4514 = var12 >> 2;
        arg9.field4517 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(I[B[IIIIIIIIIILwf;)I")
    private static final int method1612(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class245 arg12) {
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
        arg12.field4514 += (var19 - arg4) * arg12.field4512;
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
        arg12.field4519 = var15 >> 2;
        arg12.field4521 = var16 >> 2;
        arg12.field4517 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "()Lli;")
    public final class129 method345() {
        return null;
    }

    @OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(Lpd;II)V")
    private class245(class168 arg0, int arg1, int arg2) {
        super.field2382 = arg0;
        this.field4516 = arg0.field3033;
        this.field4513 = arg0.field3036;
        this.field4520 = arg0.field3034;
        this.field4515 = arg1;
        this.field4507 = arg2;
        this.field4518 = 8192;
        this.field4517 = 0;
        this.method1607();
    }

    @OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(Lpd;III)V")
    private class245(class168 arg0, int arg1, int arg2, int arg3) {
        super.field2382 = arg0;
        this.field4516 = arg0.field3033;
        this.field4513 = arg0.field3036;
        this.field4520 = arg0.field3034;
        this.field4515 = arg1;
        this.field4507 = arg2;
        this.field4518 = arg3;
        this.field4517 = 0;
        this.method1607();
    }
}
