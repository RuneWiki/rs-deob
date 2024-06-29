import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ju")
public class class213 extends class299 {

    @OriginalMember(owner = "client!ju", name = "p", descriptor = "I")
    private int field2735;

    @OriginalMember(owner = "client!ju", name = "o", descriptor = "I")
    private int field2734;

    @OriginalMember(owner = "client!ju", name = "t", descriptor = "Z")
    private boolean field2739;

    @OriginalMember(owner = "client!ju", name = "z", descriptor = "I")
    private int field2745;

    @OriginalMember(owner = "client!ju", name = "y", descriptor = "I")
    private int field2744;

    @OriginalMember(owner = "client!ju", name = "r", descriptor = "I")
    private int field2737;

    @OriginalMember(owner = "client!ju", name = "w", descriptor = "I")
    private int field2742;

    @OriginalMember(owner = "client!ju", name = "n", descriptor = "I")
    private int field2733;

    @OriginalMember(owner = "client!ju", name = "q", descriptor = "I")
    private int field2736;

    @OriginalMember(owner = "client!ju", name = "s", descriptor = "I")
    private int field2738;

    @OriginalMember(owner = "client!ju", name = "u", descriptor = "I")
    private int field2740;

    @OriginalMember(owner = "client!ju", name = "v", descriptor = "I")
    private int field2741;

    @OriginalMember(owner = "client!ju", name = "x", descriptor = "I")
    private int field2743;

    @OriginalMember(owner = "client!ju", name = "A", descriptor = "I")
    private int field2746;

    @OriginalMember(owner = "client!ju", name = "B", descriptor = "I")
    private int field2747;

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "([B[IIIIIIIILju;)I")
    private static final int method1349(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class213 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field2741 += (var14 - arg3) * arg9.field2743;
        arg9.field2740 += (var14 - arg3) * arg9.field2747;
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
        arg9.field2733 = var12 >> 2;
        arg9.field2742 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ju", name = "b", descriptor = "(I)V")
    private final synchronized void method1350(int arg0) {
        this.method1364(arg0, this.method1372());
    }

    @OriginalMember(owner = "client!ju", name = "c", descriptor = "()I")
    public final int method1351() {
        int var1 = this.field2733 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field2746 == 0) {
            var2 -= this.field2742 * var2 / (((class300) super.field3906).field3913.length << 8);
        } else if (this.field2746 >= 0) {
            var2 -= this.field2735 * var2 / ((class300) super.field3906).field3913.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(Lti;III)Lju;")
    public static final class213 method1352(class300 arg0, int arg1, int arg2, int arg3) {
        return arg0.field3913 != null && arg0.field3913.length != 0 ? new class213(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!ju", name = "c", descriptor = "(I)V")
    public final synchronized void method1353(int arg0) {
        this.field2746 = arg0;
    }

    @OriginalMember(owner = "client!ju", name = "g", descriptor = "(I)V")
    public final synchronized void method1354(int arg0) {
        this.method1364(arg0 << 6, this.method1372());
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(Z)V")
    public final synchronized void method1355(boolean arg0) {
        this.field2745 = (this.field2745 >>> 31) + (this.field2745 ^ this.field2745 >> 31);
        if (arg0) {
            this.field2745 = -this.field2745;
        }
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(II[B[IIIIIIILju;II)I")
    private static final int method1356(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class213 arg10, int arg11, int arg12) {
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
        arg10.field2742 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(III)V")
    public final synchronized void method1357(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1364(arg1, arg2);
        } else {
            int var4 = method1360(arg1, arg2);
            int var5 = method1359(arg1, arg2);
            if (this.field2741 == var4 && this.field2740 == var5) {
                this.field2736 = 0;
            } else {
                int var6 = arg1 - this.field2733;
                if (this.field2733 - arg1 > var6) {
                    var6 = this.field2733 - arg1;
                }
                if (var4 - this.field2741 > var6) {
                    var6 = var4 - this.field2741;
                }
                if (this.field2741 - var4 > var6) {
                    var6 = this.field2741 - var4;
                }
                if (var5 - this.field2740 > var6) {
                    var6 = var5 - this.field2740;
                }
                if (this.field2740 - var5 > var6) {
                    var6 = this.field2740 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field2736 = arg0;
                this.field2744 = arg1;
                this.field2737 = arg2;
                this.field2738 = (arg1 - this.field2733) / arg0;
                this.field2743 = (var4 - this.field2741) / arg0;
                this.field2747 = (var5 - this.field2740) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(Lti;II)Lju;")
    public static final class213 method1358(class300 arg0, int arg1, int arg2) {
        return arg0.field3913 != null && arg0.field3913.length != 0 ? new class213(arg0, (int) ((long) arg0.field3911 * 256L * (long) arg1 / (long) (class10.field98 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(II)I")
    private static final int method1359(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "()Lgv;")
    public final class299 method259() {
        return null;
    }

    @OriginalMember(owner = "client!ju", name = "b", descriptor = "(II)I")
    private static final int method1360(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "([B[IIIIIIILju;)I")
    private static final int method1361(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class213 arg8) {
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
        arg8.field2742 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(II[B[IIIIIIIILju;II)I")
    private static final int method1362(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class213 arg11, int arg12, int arg13) {
        arg11.field2741 -= arg11.field2743 * arg5;
        arg11.field2740 -= arg11.field2747 * arg5;
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
        arg11.field2741 += arg11.field2743 * arg5;
        arg11.field2740 += arg11.field2747 * arg5;
        arg11.field2733 = arg6;
        arg11.field2742 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(I[B[IIIIIIIIIILju;)I")
    private static final int method1363(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class213 arg12) {
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
        arg12.field2733 += (var19 - arg4) * arg12.field2738;
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
        arg12.field2741 = var15 >> 2;
        arg12.field2740 = var16 >> 2;
        arg12.field2742 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!ju", name = "c", descriptor = "(II)V")
    private final synchronized void method1364(int arg0, int arg1) {
        this.field2744 = arg0;
        this.field2737 = arg1;
        this.field2736 = 0;
        this.method1368();
    }

    @OriginalMember(owner = "client!ju", name = "b", descriptor = "([B[IIIIIIILju;)I")
    private static final int method1365(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class213 arg8) {
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
        arg8.field2742 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ju", name = "b", descriptor = "(II[B[IIIIIIIILju;II)I")
    private static final int method1366(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class213 arg11, int arg12, int arg13) {
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
        arg11.field2742 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!ju", name = "e", descriptor = "()I")
    public final synchronized int method1367() {
        return this.field2745 < 0 ? -this.field2745 : this.field2745;
    }

    @OriginalMember(owner = "client!ju", name = "f", descriptor = "()V")
    private final void method1368() {
        this.field2733 = this.field2744;
        this.field2741 = method1360(this.field2744, this.field2737);
        this.field2740 = method1359(this.field2744, this.field2737);
    }

    @OriginalMember(owner = "client!ju", name = "g", descriptor = "()Z")
    private final boolean method1369() {
        int var1 = this.field2744;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1360(var1, this.field2737);
            var2 = method1359(var1, this.field2737);
        }
        if (this.field2733 == var1 && this.field2741 == var3 && this.field2740 == var2) {
            if (this.field2744 == Integer.MIN_VALUE) {
                this.field2744 = 0;
                this.field2733 = this.field2741 = this.field2740 = 0;
                this.method589(-8880);
                return true;
            } else {
                this.method1368();
                return false;
            }
        } else {
            if (this.field2733 < var1) {
                this.field2738 = 1;
                this.field2736 = var1 - this.field2733;
            } else if (this.field2733 > var1) {
                this.field2738 = -1;
                this.field2736 = this.field2733 - var1;
            } else {
                this.field2738 = 0;
            }
            if (this.field2741 < var3) {
                this.field2743 = 1;
                if (this.field2736 == 0 || this.field2736 > var3 - this.field2741) {
                    this.field2736 = var3 - this.field2741;
                }
            } else if (this.field2741 > var3) {
                this.field2743 = -1;
                if (this.field2736 == 0 || this.field2736 > this.field2741 - var3) {
                    this.field2736 = this.field2741 - var3;
                }
            } else {
                this.field2743 = 0;
            }
            if (this.field2740 < var2) {
                this.field2747 = 1;
                if (this.field2736 == 0 || this.field2736 > var2 - this.field2740) {
                    this.field2736 = var2 - this.field2740;
                }
            } else if (this.field2740 > var2) {
                this.field2747 = -1;
                if (this.field2736 == 0 || this.field2736 > this.field2740 - var2) {
                    this.field2736 = this.field2740 - var2;
                }
            } else {
                this.field2747 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "([IIIII)I")
    private final int method1370(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field2736 <= 0) {
                if (this.field2745 == -256 && (this.field2742 & 255) == 0) {
                    if (class85.field1155) {
                        return method1381(0, ((class300) super.field3906).field3913, arg0, this.field2742, arg1, this.field2741, this.field2740, 0, arg3, arg2, this);
                    }
                    return method1361(((class300) super.field3906).field3913, arg0, this.field2742, arg1, this.field2733, 0, arg3, arg2, this);
                }
                if (class85.field1155) {
                    return method1379(0, 0, ((class300) super.field3906).field3913, arg0, this.field2742, arg1, this.field2741, this.field2740, 0, arg3, arg2, this, this.field2745, arg4);
                }
                return method1356(0, 0, ((class300) super.field3906).field3913, arg0, this.field2742, arg1, this.field2733, 0, arg3, arg2, this, this.field2745, arg4);
            }
            int var6 = this.field2736 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field2736 += arg1;
            if (this.field2745 == -256 && (this.field2742 & 255) == 0) {
                if (class85.field1155) {
                    arg1 = method1363(0, ((class300) super.field3906).field3913, arg0, this.field2742, arg1, this.field2741, this.field2740, this.field2743, this.field2747, 0, var6, arg2, this);
                } else {
                    arg1 = method1374(((class300) super.field3906).field3913, arg0, this.field2742, arg1, this.field2733, this.field2738, 0, var6, arg2, this);
                }
            } else if (class85.field1155) {
                arg1 = method1389(0, 0, ((class300) super.field3906).field3913, arg0, this.field2742, arg1, this.field2741, this.field2740, this.field2743, this.field2747, 0, var6, arg2, this, this.field2745, arg4);
            } else {
                arg1 = method1384(0, 0, ((class300) super.field3906).field3913, arg0, this.field2742, arg1, this.field2733, this.field2738, 0, var6, arg2, this, this.field2745, arg4);
            }
            this.field2736 -= arg1;
            if (this.field2736 != 0) {
                return arg1;
            }
        } while (!this.method1369());
        return arg3;
    }

    @OriginalMember(owner = "client!ju", name = "h", descriptor = "()V")
    private final void method1371() {
        if (this.field2736 != 0) {
            if (this.field2744 == Integer.MIN_VALUE) {
                this.field2744 = 0;
            }
            this.field2736 = 0;
            this.method1368();
        }
    }

    @OriginalMember(owner = "client!ju", name = "i", descriptor = "()I")
    public final synchronized int method1372() {
        return this.field2737 < 0 ? -1 : this.field2737;
    }

    @OriginalMember(owner = "client!ju", name = "j", descriptor = "()I")
    public final synchronized int method1373() {
        return this.field2744 == Integer.MIN_VALUE ? 0 : this.field2744;
    }

    @OriginalMember(owner = "client!ju", name = "b", descriptor = "([B[IIIIIIIILju;)I")
    private static final int method1374(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class213 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field2741 += (var14 - arg3) * arg9.field2743;
        arg9.field2740 += (var14 - arg3) * arg9.field2747;
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
        arg9.field2733 = var12 >> 2;
        arg9.field2742 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ju", name = "h", descriptor = "(I)V")
    public final synchronized void method1375(int arg0) {
        int var2 = ((class300) super.field3906).field3913.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field2742 = arg0;
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(II[B[IIIIIIIIIILju;II)I")
    private static final int method1376(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class213 arg13, int arg14, int arg15) {
        arg13.field2733 -= arg13.field2738 * arg5;
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
        arg13.field2733 += arg13.field2738 * var22;
        arg13.field2741 = arg6;
        arg13.field2740 = arg7;
        arg13.field2742 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(I)V")
    public final synchronized void method254(int arg0) {
        if (this.field2736 > 0) {
            if (arg0 >= this.field2736) {
                if (this.field2744 == Integer.MIN_VALUE) {
                    this.field2744 = 0;
                    this.field2733 = this.field2741 = this.field2740 = 0;
                    this.method589(-8880);
                    arg0 = this.field2736;
                }
                this.field2736 = 0;
                this.method1368();
            } else {
                this.field2733 += this.field2738 * arg0;
                this.field2741 += this.field2743 * arg0;
                this.field2740 += this.field2747 * arg0;
                this.field2736 -= arg0;
            }
        }
        class300 var2 = (class300) super.field3906;
        int var3 = this.field2735 << 8;
        int var4 = this.field2734 << 8;
        int var5 = var2.field3913.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field2746 = 0;
        }
        if (this.field2742 < 0) {
            if (this.field2745 <= 0) {
                this.method1371();
                this.method589(-8880);
                return;
            }
            this.field2742 = 0;
        }
        if (this.field2742 >= var5) {
            if (this.field2745 >= 0) {
                this.method1371();
                this.method589(-8880);
                return;
            }
            this.field2742 = var5 - 1;
        }
        this.field2742 += this.field2745 * arg0;
        if (this.field2746 < 0) {
            if (!this.field2739) {
                if (this.field2745 < 0) {
                    if (this.field2742 < var3) {
                        this.field2742 = var4 - 1 - (var4 - 1 - this.field2742) % var6;
                    }
                } else if (this.field2742 >= var4) {
                    this.field2742 = (this.field2742 - var3) % var6 + var3;
                }
            } else {
                if (this.field2745 < 0) {
                    if (this.field2742 >= var3) {
                        return;
                    }
                    this.field2742 = var3 + var3 - 1 - this.field2742;
                    this.field2745 = -this.field2745;
                }
                while (this.field2742 >= var4) {
                    this.field2742 = var4 + var4 - 1 - this.field2742;
                    this.field2745 = -this.field2745;
                    if (this.field2742 >= var3) {
                        return;
                    }
                    this.field2742 = var3 + var3 - 1 - this.field2742;
                    this.field2745 = -this.field2745;
                }
            }
        } else {
            if (this.field2746 > 0) {
                if (this.field2739) {
                    label125: {
                        if (this.field2745 < 0) {
                            if (this.field2742 >= var3) {
                                return;
                            }
                            this.field2742 = var3 + var3 - 1 - this.field2742;
                            this.field2745 = -this.field2745;
                            if (--this.field2746 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field2742 < var4) {
                                return;
                            }
                            this.field2742 = var4 + var4 - 1 - this.field2742;
                            this.field2745 = -this.field2745;
                            if (--this.field2746 == 0) {
                                break;
                            }
                            if (this.field2742 >= var3) {
                                return;
                            }
                            this.field2742 = var3 + var3 - 1 - this.field2742;
                            this.field2745 = -this.field2745;
                        } while (--this.field2746 != 0);
                    }
                } else if (this.field2745 < 0) {
                    if (this.field2742 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field2742) / var6;
                    if (var7 < this.field2746) {
                        this.field2742 += var6 * var7;
                        this.field2746 -= var7;
                        return;
                    }
                    this.field2742 += this.field2746 * var6;
                    this.field2746 = 0;
                } else {
                    if (this.field2742 < var4) {
                        return;
                    }
                    int var8 = (this.field2742 - var3) / var6;
                    if (var8 < this.field2746) {
                        this.field2742 -= var6 * var8;
                        this.field2746 -= var8;
                        return;
                    }
                    this.field2742 -= this.field2746 * var6;
                    this.field2746 = 0;
                }
            }
            if (this.field2745 < 0) {
                if (this.field2742 < 0) {
                    this.field2742 = -1;
                    this.method1371();
                    this.method589(-8880);
                    return;
                }
            } else if (this.field2742 >= var5) {
                this.field2742 = var5;
                this.method1371();
                this.method589(-8880);
            }
        }
    }

    @OriginalMember(owner = "client!ju", name = "b", descriptor = "([IIIII)I")
    private final int method1377(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field2736 <= 0) {
                if (this.field2745 == 256 && (this.field2742 & 255) == 0) {
                    if (class85.field1155) {
                        return method1387(0, ((class300) super.field3906).field3913, arg0, this.field2742, arg1, this.field2741, this.field2740, 0, arg3, arg2, this);
                    }
                    return method1365(((class300) super.field3906).field3913, arg0, this.field2742, arg1, this.field2733, 0, arg3, arg2, this);
                }
                if (class85.field1155) {
                    return method1366(0, 0, ((class300) super.field3906).field3913, arg0, this.field2742, arg1, this.field2741, this.field2740, 0, arg3, arg2, this, this.field2745, arg4);
                }
                return method1383(0, 0, ((class300) super.field3906).field3913, arg0, this.field2742, arg1, this.field2733, 0, arg3, arg2, this, this.field2745, arg4);
            }
            int var6 = this.field2736 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field2736 += arg1;
            if (this.field2745 == 256 && (this.field2742 & 255) == 0) {
                if (class85.field1155) {
                    arg1 = method1386(0, ((class300) super.field3906).field3913, arg0, this.field2742, arg1, this.field2741, this.field2740, this.field2743, this.field2747, 0, var6, arg2, this);
                } else {
                    arg1 = method1349(((class300) super.field3906).field3913, arg0, this.field2742, arg1, this.field2733, this.field2738, 0, var6, arg2, this);
                }
            } else if (class85.field1155) {
                arg1 = method1376(0, 0, ((class300) super.field3906).field3913, arg0, this.field2742, arg1, this.field2741, this.field2740, this.field2743, this.field2747, 0, var6, arg2, this, this.field2745, arg4);
            } else {
                arg1 = method1362(0, 0, ((class300) super.field3906).field3913, arg0, this.field2742, arg1, this.field2733, this.field2738, 0, var6, arg2, this, this.field2745, arg4);
            }
            this.field2736 -= arg1;
            if (this.field2736 != 0) {
                return arg1;
            }
        } while (!this.method1369());
        return arg3;
    }

    @OriginalMember(owner = "client!ju", name = "b", descriptor = "([III)V")
    public final synchronized void method252(int[] arg0, int arg1, int arg2) {
        if (this.field2744 == 0 && this.field2736 == 0) {
            this.method254(arg2);
        } else {
            class300 var4 = (class300) super.field3906;
            int var5 = this.field2735 << 8;
            int var6 = this.field2734 << 8;
            int var7 = var4.field3913.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field2746 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field2742 < 0) {
                if (this.field2745 <= 0) {
                    this.method1371();
                    this.method589(-8880);
                    return;
                }
                this.field2742 = 0;
            }
            if (this.field2742 >= var7) {
                if (this.field2745 >= 0) {
                    this.method1371();
                    this.method589(-8880);
                    return;
                }
                this.field2742 = var7 - 1;
            }
            if (this.field2746 < 0) {
                if (this.field2739) {
                    if (this.field2745 < 0) {
                        var9 = this.method1370(arg0, arg1, var5, var10, var4.field3913[this.field2735]);
                        if (this.field2742 >= var5) {
                            return;
                        }
                        this.field2742 = var5 + var5 - 1 - this.field2742;
                        this.field2745 = -this.field2745;
                    }
                    while (true) {
                        int var11 = this.method1377(arg0, var9, var6, var10, var4.field3913[this.field2734 - 1]);
                        if (this.field2742 < var6) {
                            return;
                        }
                        this.field2742 = var6 + var6 - 1 - this.field2742;
                        this.field2745 = -this.field2745;
                        var9 = this.method1370(arg0, var11, var5, var10, var4.field3913[this.field2735]);
                        if (this.field2742 >= var5) {
                            return;
                        }
                        this.field2742 = var5 + var5 - 1 - this.field2742;
                        this.field2745 = -this.field2745;
                    }
                } else if (this.field2745 < 0) {
                    while (true) {
                        var9 = this.method1370(arg0, var9, var5, var10, var4.field3913[this.field2734 - 1]);
                        if (this.field2742 >= var5) {
                            return;
                        }
                        this.field2742 = var6 - 1 - (var6 - 1 - this.field2742) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method1377(arg0, var9, var6, var10, var4.field3913[this.field2735]);
                        if (this.field2742 < var6) {
                            return;
                        }
                        this.field2742 = (this.field2742 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field2746 > 0) {
                    if (this.field2739) {
                        label130: {
                            if (this.field2745 < 0) {
                                var9 = this.method1370(arg0, arg1, var5, var10, var4.field3913[this.field2735]);
                                if (this.field2742 >= var5) {
                                    return;
                                }
                                this.field2742 = var5 + var5 - 1 - this.field2742;
                                this.field2745 = -this.field2745;
                                if (--this.field2746 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method1377(arg0, var9, var6, var10, var4.field3913[this.field2734 - 1]);
                                if (this.field2742 < var6) {
                                    return;
                                }
                                this.field2742 = var6 + var6 - 1 - this.field2742;
                                this.field2745 = -this.field2745;
                                if (--this.field2746 == 0) {
                                    break;
                                }
                                var9 = this.method1370(arg0, var9, var5, var10, var4.field3913[this.field2735]);
                                if (this.field2742 >= var5) {
                                    return;
                                }
                                this.field2742 = var5 + var5 - 1 - this.field2742;
                                this.field2745 = -this.field2745;
                            } while (--this.field2746 != 0);
                        }
                    } else if (this.field2745 < 0) {
                        while (true) {
                            var9 = this.method1370(arg0, var9, var5, var10, var4.field3913[this.field2734 - 1]);
                            if (this.field2742 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field2742) / var8;
                            if (var12 >= this.field2746) {
                                this.field2742 += this.field2746 * var8;
                                this.field2746 = 0;
                                break;
                            }
                            this.field2742 += var8 * var12;
                            this.field2746 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method1377(arg0, var9, var6, var10, var4.field3913[this.field2735]);
                            if (this.field2742 < var6) {
                                return;
                            }
                            int var13 = (this.field2742 - var5) / var8;
                            if (var13 >= this.field2746) {
                                this.field2742 -= this.field2746 * var8;
                                this.field2746 = 0;
                                break;
                            }
                            this.field2742 -= var8 * var13;
                            this.field2746 -= var13;
                        }
                    }
                }
                if (this.field2745 < 0) {
                    this.method1370(arg0, var9, 0, var10, 0);
                    if (this.field2742 < 0) {
                        this.field2742 = -1;
                        this.method1371();
                        this.method589(-8880);
                        return;
                    }
                } else {
                    this.method1377(arg0, var9, var7, var10, 0);
                    if (this.field2742 >= var7) {
                        this.field2742 = var7;
                        this.method1371();
                        this.method589(-8880);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ju", name = "b", descriptor = "()I")
    public final int method258() {
        return this.field2744 == 0 && this.field2736 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!ju", name = "k", descriptor = "()Z")
    public final boolean method1378() {
        return this.field2742 < 0 || this.field2742 >= ((class300) super.field3906).field3913.length << 8;
    }

    @OriginalMember(owner = "client!ju", name = "c", descriptor = "(II[B[IIIIIIIILju;II)I")
    private static final int method1379(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class213 arg11, int arg12, int arg13) {
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
        arg11.field2742 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!ju", name = "d", descriptor = "(II)V")
    public final synchronized void method1380(int arg0, int arg1) {
        this.method1357(arg0, arg1, this.method1372());
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(I[B[IIIIIIIILju;)I")
    private static final int method1381(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class213 arg10) {
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
        arg10.field2742 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!ju", name = "i", descriptor = "(I)V")
    public final synchronized void method1382(int arg0) {
        if (this.field2745 < 0) {
            this.field2745 = -arg0;
        } else {
            this.field2745 = arg0;
        }
    }

    @OriginalMember(owner = "client!ju", name = "b", descriptor = "(II[B[IIIIIIILju;II)I")
    private static final int method1383(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class213 arg10, int arg11, int arg12) {
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
        arg10.field2742 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ju", name = "d", descriptor = "(II[B[IIIIIIIILju;II)I")
    private static final int method1384(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class213 arg11, int arg12, int arg13) {
        arg11.field2741 -= arg11.field2743 * arg5;
        arg11.field2740 -= arg11.field2747 * arg5;
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
        arg11.field2741 += arg11.field2743 * arg5;
        arg11.field2740 += arg11.field2747 * arg5;
        arg11.field2733 = arg6;
        arg11.field2742 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ju", name = "l", descriptor = "()Z")
    public final boolean method1385() {
        return this.field2736 != 0;
    }

    @OriginalMember(owner = "client!ju", name = "d", descriptor = "()Lgv;")
    public final class299 method249() {
        return null;
    }

    @OriginalMember(owner = "client!ju", name = "b", descriptor = "(I[B[IIIIIIIIIILju;)I")
    private static final int method1386(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class213 arg12) {
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
        arg12.field2733 += (var19 - arg4) * arg12.field2738;
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
        arg12.field2741 = var15 >> 2;
        arg12.field2740 = var16 >> 2;
        arg12.field2742 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!ju", name = "b", descriptor = "(I[B[IIIIIIIILju;)I")
    private static final int method1387(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class213 arg10) {
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
        arg10.field2742 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!ju", name = "j", descriptor = "(I)V")
    public final synchronized void method1388(int arg0) {
        if (arg0 == 0) {
            this.method1350(0);
            this.method589(-8880);
        } else if (this.field2741 == 0 && this.field2740 == 0) {
            this.field2736 = 0;
            this.field2744 = 0;
            this.field2733 = 0;
            this.method589(-8880);
        } else {
            int var2 = -this.field2733;
            if (this.field2733 > var2) {
                var2 = this.field2733;
            }
            if (-this.field2741 > var2) {
                var2 = -this.field2741;
            }
            if (this.field2741 > var2) {
                var2 = this.field2741;
            }
            if (-this.field2740 > var2) {
                var2 = -this.field2740;
            }
            if (this.field2740 > var2) {
                var2 = this.field2740;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field2736 = arg0;
            this.field2744 = Integer.MIN_VALUE;
            this.field2738 = -this.field2733 / arg0;
            this.field2743 = -this.field2741 / arg0;
            this.field2747 = -this.field2740 / arg0;
        }
    }

    @OriginalMember(owner = "client!ju", name = "b", descriptor = "(II[B[IIIIIIIIIILju;II)I")
    private static final int method1389(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class213 arg13, int arg14, int arg15) {
        arg13.field2733 -= arg13.field2738 * arg5;
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
        arg13.field2733 += arg13.field2738 * var22;
        arg13.field2741 = arg6;
        arg13.field2740 = arg7;
        arg13.field2742 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!ju", name = "<init>", descriptor = "(Lti;II)V")
    private class213(class300 arg0, int arg1, int arg2) {
        super.field3906 = arg0;
        this.field2735 = arg0.field3912;
        this.field2734 = arg0.field3909;
        this.field2739 = arg0.field3910;
        this.field2745 = arg1;
        this.field2744 = arg2;
        this.field2737 = 8192;
        this.field2742 = 0;
        this.method1368();
    }

    @OriginalMember(owner = "client!ju", name = "<init>", descriptor = "(Lti;III)V")
    private class213(class300 arg0, int arg1, int arg2, int arg3) {
        super.field3906 = arg0;
        this.field2735 = arg0.field3912;
        this.field2734 = arg0.field3909;
        this.field2739 = arg0.field3910;
        this.field2745 = arg1;
        this.field2744 = arg2;
        this.field2737 = arg3;
        this.field2742 = 0;
        this.method1368();
    }
}
