import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class59 extends class102 {

    @OriginalMember(owner = "client!mj", name = "u", descriptor = "I")
    private int field1030;

    @OriginalMember(owner = "client!mj", name = "F", descriptor = "I")
    private int field1041;

    @OriginalMember(owner = "client!mj", name = "v", descriptor = "Z")
    private boolean field1031;

    @OriginalMember(owner = "client!mj", name = "B", descriptor = "I")
    private int field1037;

    @OriginalMember(owner = "client!mj", name = "E", descriptor = "I")
    private int field1040;

    @OriginalMember(owner = "client!mj", name = "w", descriptor = "I")
    private int field1032;

    @OriginalMember(owner = "client!mj", name = "C", descriptor = "I")
    private int field1038;

    @OriginalMember(owner = "client!mj", name = "s", descriptor = "I")
    private int field1028;

    @OriginalMember(owner = "client!mj", name = "t", descriptor = "I")
    private int field1029;

    @OriginalMember(owner = "client!mj", name = "x", descriptor = "I")
    private int field1033;

    @OriginalMember(owner = "client!mj", name = "y", descriptor = "I")
    private int field1034;

    @OriginalMember(owner = "client!mj", name = "z", descriptor = "I")
    private int field1035;

    @OriginalMember(owner = "client!mj", name = "A", descriptor = "I")
    private int field1036;

    @OriginalMember(owner = "client!mj", name = "D", descriptor = "I")
    private int field1039;

    @OriginalMember(owner = "client!mj", name = "G", descriptor = "I")
    private int field1042;

    @OriginalMember(owner = "client!mj", name = "g", descriptor = "(I)V")
    public final synchronized void method376(int arg0) {
        this.field1036 = arg0;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "([IIIII)I")
    private final int method377(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field1029 <= 0) {
                if (this.field1037 == 256 && (this.field1038 & 255) == 0) {
                    if (class54.field970) {
                        return method410(0, ((class178) super.field1642).field2857, arg0, this.field1038, arg1, this.field1033, this.field1035, 0, arg3, arg2, this);
                    }
                    return method391(((class178) super.field1642).field2857, arg0, this.field1038, arg1, this.field1039, 0, arg3, arg2, this);
                }
                if (class54.field970) {
                    return method383(0, 0, ((class178) super.field1642).field2857, arg0, this.field1038, arg1, this.field1033, this.field1035, 0, arg3, arg2, this, this.field1037, arg4);
                }
                return method401(0, 0, ((class178) super.field1642).field2857, arg0, this.field1038, arg1, this.field1039, 0, arg3, arg2, this, this.field1037, arg4);
            }
            int var6 = this.field1029 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field1029 += arg1;
            if (this.field1037 == 256 && (this.field1038 & 255) == 0) {
                if (class54.field970) {
                    arg1 = method395(0, ((class178) super.field1642).field2857, arg0, this.field1038, arg1, this.field1033, this.field1035, this.field1034, this.field1042, 0, var6, arg2, this);
                } else {
                    arg1 = method379(((class178) super.field1642).field2857, arg0, this.field1038, arg1, this.field1039, this.field1028, 0, var6, arg2, this);
                }
            } else if (class54.field970) {
                arg1 = method409(0, 0, ((class178) super.field1642).field2857, arg0, this.field1038, arg1, this.field1033, this.field1035, this.field1034, this.field1042, 0, var6, arg2, this, this.field1037, arg4);
            } else {
                arg1 = method397(0, 0, ((class178) super.field1642).field2857, arg0, this.field1038, arg1, this.field1039, this.field1028, 0, var6, arg2, this, this.field1037, arg4);
            }
            this.field1029 -= arg1;
            if (this.field1029 != 0) {
                return arg1;
            }
        } while (!this.method389());
        return arg3;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(III)V")
    public final synchronized void method378(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method405(arg1, arg2);
        } else {
            int var4 = method408(arg1, arg2);
            int var5 = method390(arg1, arg2);
            if (this.field1033 == var4 && this.field1035 == var5) {
                this.field1029 = 0;
            } else {
                int var6 = arg1 - this.field1039;
                if (this.field1039 - arg1 > var6) {
                    var6 = this.field1039 - arg1;
                }
                if (var4 - this.field1033 > var6) {
                    var6 = var4 - this.field1033;
                }
                if (this.field1033 - var4 > var6) {
                    var6 = this.field1033 - var4;
                }
                if (var5 - this.field1035 > var6) {
                    var6 = var5 - this.field1035;
                }
                if (this.field1035 - var5 > var6) {
                    var6 = this.field1035 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field1029 = arg0;
                this.field1040 = arg1;
                this.field1032 = arg2;
                this.field1028 = (arg1 - this.field1039) / arg0;
                this.field1034 = (var4 - this.field1033) / arg0;
                this.field1042 = (var5 - this.field1035) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "([B[IIIIIIIILmj;)I")
    private static final int method379(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class59 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1033 += (var14 - arg3) * arg9.field1034;
        arg9.field1035 += (var14 - arg3) * arg9.field1042;
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
        arg9.field1039 = var12 >> 2;
        arg9.field1038 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lti;II)Lmj;")
    public static final class59 method380(class178 arg0, int arg1, int arg2) {
        return arg0.field2857 != null && arg0.field2857.length != 0 ? new class59(arg0, (int) ((long) arg0.field2859 * 256L * (long) arg1 / (long) (class142.field2343 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "()I")
    public final int method111() {
        return this.field1040 == 0 && this.field1029 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "()I")
    public final synchronized int method381() {
        return this.field1040 == Integer.MIN_VALUE ? 0 : this.field1040;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "([B[IIIIIIILmj;)I")
    private static final int method382(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class59 arg8) {
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
        arg8.field1038 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(II[B[IIIIIIIILmj;II)I")
    private static final int method383(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class59 arg11, int arg12, int arg13) {
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
        arg11.field1038 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "([IIIII)I")
    private final int method384(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field1029 <= 0) {
                if (this.field1037 == -256 && (this.field1038 & 255) == 0) {
                    if (class54.field970) {
                        return method406(0, ((class178) super.field1642).field2857, arg0, this.field1038, arg1, this.field1033, this.field1035, 0, arg3, arg2, this);
                    }
                    return method382(((class178) super.field1642).field2857, arg0, this.field1038, arg1, this.field1039, 0, arg3, arg2, this);
                }
                if (class54.field970) {
                    return method386(0, 0, ((class178) super.field1642).field2857, arg0, this.field1038, arg1, this.field1033, this.field1035, 0, arg3, arg2, this, this.field1037, arg4);
                }
                return method412(0, 0, ((class178) super.field1642).field2857, arg0, this.field1038, arg1, this.field1039, 0, arg3, arg2, this, this.field1037, arg4);
            }
            int var6 = this.field1029 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field1029 += arg1;
            if (this.field1037 == -256 && (this.field1038 & 255) == 0) {
                if (class54.field970) {
                    arg1 = method400(0, ((class178) super.field1642).field2857, arg0, this.field1038, arg1, this.field1033, this.field1035, this.field1034, this.field1042, 0, var6, arg2, this);
                } else {
                    arg1 = method413(((class178) super.field1642).field2857, arg0, this.field1038, arg1, this.field1039, this.field1028, 0, var6, arg2, this);
                }
            } else if (class54.field970) {
                arg1 = method411(0, 0, ((class178) super.field1642).field2857, arg0, this.field1038, arg1, this.field1033, this.field1035, this.field1034, this.field1042, 0, var6, arg2, this, this.field1037, arg4);
            } else {
                arg1 = method396(0, 0, ((class178) super.field1642).field2857, arg0, this.field1038, arg1, this.field1039, this.field1028, 0, var6, arg2, this, this.field1037, arg4);
            }
            this.field1029 -= arg1;
            if (this.field1029 != 0) {
                return arg1;
            }
        } while (!this.method389());
        return arg3;
    }

    @OriginalMember(owner = "client!mj", name = "f", descriptor = "()V")
    private final void method385() {
        if (this.field1029 != 0) {
            if (this.field1040 == Integer.MIN_VALUE) {
                this.field1040 = 0;
            }
            this.field1029 = 0;
            this.method415();
        }
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(II[B[IIIIIIIILmj;II)I")
    private static final int method386(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class59 arg11, int arg12, int arg13) {
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
        arg11.field1038 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!mj", name = "h", descriptor = "(I)V")
    public final synchronized void method387(int arg0) {
        if (arg0 == 0) {
            this.method394(0);
            this.method993(32);
        } else if (this.field1033 == 0 && this.field1035 == 0) {
            this.field1029 = 0;
            this.field1040 = 0;
            this.field1039 = 0;
            this.method993(32);
        } else {
            int var2 = -this.field1039;
            if (this.field1039 > var2) {
                var2 = this.field1039;
            }
            if (-this.field1033 > var2) {
                var2 = -this.field1033;
            }
            if (this.field1033 > var2) {
                var2 = this.field1033;
            }
            if (-this.field1035 > var2) {
                var2 = -this.field1035;
            }
            if (this.field1035 > var2) {
                var2 = this.field1035;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1029 = arg0;
            this.field1040 = Integer.MIN_VALUE;
            this.field1028 = -this.field1039 / arg0;
            this.field1034 = -this.field1033 / arg0;
            this.field1042 = -this.field1035 / arg0;
        }
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "()Lnk;")
    public final class102 method105() {
        return null;
    }

    @OriginalMember(owner = "client!mj", name = "i", descriptor = "(I)V")
    public final synchronized void method388(int arg0) {
        int var2 = ((class178) super.field1642).field2857.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1038 = arg0;
    }

    @OriginalMember(owner = "client!mj", name = "g", descriptor = "()Z")
    private final boolean method389() {
        int var1 = this.field1040;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method408(var1, this.field1032);
            var2 = method390(var1, this.field1032);
        }
        if (this.field1039 == var1 && this.field1033 == var3 && this.field1035 == var2) {
            if (this.field1040 == Integer.MIN_VALUE) {
                this.field1040 = 0;
                this.field1039 = this.field1033 = this.field1035 = 0;
                this.method993(32);
                return true;
            } else {
                this.method415();
                return false;
            }
        } else {
            if (this.field1039 < var1) {
                this.field1028 = 1;
                this.field1029 = var1 - this.field1039;
            } else if (this.field1039 > var1) {
                this.field1028 = -1;
                this.field1029 = this.field1039 - var1;
            } else {
                this.field1028 = 0;
            }
            if (this.field1033 < var3) {
                this.field1034 = 1;
                if (this.field1029 == 0 || this.field1029 > var3 - this.field1033) {
                    this.field1029 = var3 - this.field1033;
                }
            } else if (this.field1033 > var3) {
                this.field1034 = -1;
                if (this.field1029 == 0 || this.field1029 > this.field1033 - var3) {
                    this.field1029 = this.field1033 - var3;
                }
            } else {
                this.field1034 = 0;
            }
            if (this.field1035 < var2) {
                this.field1042 = 1;
                if (this.field1029 == 0 || this.field1029 > var2 - this.field1035) {
                    this.field1029 = var2 - this.field1035;
                }
            } else if (this.field1035 > var2) {
                this.field1042 = -1;
                if (this.field1029 == 0 || this.field1029 > this.field1035 - var2) {
                    this.field1029 = this.field1035 - var2;
                }
            } else {
                this.field1042 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(II)I")
    private static final int method390(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "([B[IIIIIIILmj;)I")
    private static final int method391(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class59 arg8) {
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
        arg8.field1038 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lti;III)Lmj;")
    public static final class59 method392(class178 arg0, int arg1, int arg2, int arg3) {
        return arg0.field2857 != null && arg0.field2857.length != 0 ? new class59(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!mj", name = "h", descriptor = "()I")
    public final synchronized int method393() {
        return this.field1032 < 0 ? -1 : this.field1032;
    }

    @OriginalMember(owner = "client!mj", name = "j", descriptor = "(I)V")
    private final synchronized void method394(int arg0) {
        this.method405(arg0, this.method393());
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(I[B[IIIIIIIIIILmj;)I")
    private static final int method395(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class59 arg12) {
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
        arg12.field1039 += (var19 - arg4) * arg12.field1028;
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
        arg12.field1033 = var15 >> 2;
        arg12.field1035 = var16 >> 2;
        arg12.field1038 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "()Lnk;")
    public final class102 method109() {
        return null;
    }

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "(II[B[IIIIIIIILmj;II)I")
    private static final int method396(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class59 arg11, int arg12, int arg13) {
        arg11.field1033 -= arg11.field1034 * arg5;
        arg11.field1035 -= arg11.field1042 * arg5;
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
        arg11.field1033 += arg11.field1034 * arg5;
        arg11.field1035 += arg11.field1042 * arg5;
        arg11.field1039 = arg6;
        arg11.field1038 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "(II[B[IIIIIIIILmj;II)I")
    private static final int method397(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class59 arg11, int arg12, int arg13) {
        arg11.field1033 -= arg11.field1034 * arg5;
        arg11.field1035 -= arg11.field1042 * arg5;
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
        arg11.field1033 += arg11.field1034 * arg5;
        arg11.field1035 += arg11.field1042 * arg5;
        arg11.field1039 = arg6;
        arg11.field1038 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!mj", name = "f", descriptor = "(I)V")
    public final synchronized void method112(int arg0) {
        if (this.field1029 > 0) {
            if (arg0 >= this.field1029) {
                if (this.field1040 == Integer.MIN_VALUE) {
                    this.field1040 = 0;
                    this.field1039 = this.field1033 = this.field1035 = 0;
                    this.method993(32);
                    arg0 = this.field1029;
                }
                this.field1029 = 0;
                this.method415();
            } else {
                this.field1039 += this.field1028 * arg0;
                this.field1033 += this.field1034 * arg0;
                this.field1035 += this.field1042 * arg0;
                this.field1029 -= arg0;
            }
        }
        class178 var2 = (class178) super.field1642;
        int var3 = this.field1030 << 8;
        int var4 = this.field1041 << 8;
        int var5 = var2.field2857.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1036 = 0;
        }
        if (this.field1038 < 0) {
            if (this.field1037 <= 0) {
                this.method385();
                this.method993(32);
                return;
            }
            this.field1038 = 0;
        }
        if (this.field1038 >= var5) {
            if (this.field1037 >= 0) {
                this.method385();
                this.method993(32);
                return;
            }
            this.field1038 = var5 - 1;
        }
        this.field1038 += this.field1037 * arg0;
        if (this.field1036 < 0) {
            if (!this.field1031) {
                if (this.field1037 < 0) {
                    if (this.field1038 < var3) {
                        this.field1038 = var4 - 1 - (var4 - 1 - this.field1038) % var6;
                    }
                } else if (this.field1038 >= var4) {
                    this.field1038 = (this.field1038 - var3) % var6 + var3;
                }
            } else {
                if (this.field1037 < 0) {
                    if (this.field1038 >= var3) {
                        return;
                    }
                    this.field1038 = var3 + var3 - 1 - this.field1038;
                    this.field1037 = -this.field1037;
                }
                while (this.field1038 >= var4) {
                    this.field1038 = var4 + var4 - 1 - this.field1038;
                    this.field1037 = -this.field1037;
                    if (this.field1038 >= var3) {
                        return;
                    }
                    this.field1038 = var3 + var3 - 1 - this.field1038;
                    this.field1037 = -this.field1037;
                }
            }
        } else {
            if (this.field1036 > 0) {
                if (this.field1031) {
                    label125: {
                        if (this.field1037 < 0) {
                            if (this.field1038 >= var3) {
                                return;
                            }
                            this.field1038 = var3 + var3 - 1 - this.field1038;
                            this.field1037 = -this.field1037;
                            if (--this.field1036 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field1038 < var4) {
                                return;
                            }
                            this.field1038 = var4 + var4 - 1 - this.field1038;
                            this.field1037 = -this.field1037;
                            if (--this.field1036 == 0) {
                                break;
                            }
                            if (this.field1038 >= var3) {
                                return;
                            }
                            this.field1038 = var3 + var3 - 1 - this.field1038;
                            this.field1037 = -this.field1037;
                        } while (--this.field1036 != 0);
                    }
                } else if (this.field1037 < 0) {
                    if (this.field1038 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field1038) / var6;
                    if (var7 < this.field1036) {
                        this.field1038 += var6 * var7;
                        this.field1036 -= var7;
                        return;
                    }
                    this.field1038 += this.field1036 * var6;
                    this.field1036 = 0;
                } else {
                    if (this.field1038 < var4) {
                        return;
                    }
                    int var8 = (this.field1038 - var3) / var6;
                    if (var8 < this.field1036) {
                        this.field1038 -= var6 * var8;
                        this.field1036 -= var8;
                        return;
                    }
                    this.field1038 -= this.field1036 * var6;
                    this.field1036 = 0;
                }
            }
            if (this.field1037 < 0) {
                if (this.field1038 < 0) {
                    this.field1038 = -1;
                    this.method385();
                    this.method993(32);
                    return;
                }
            } else if (this.field1038 >= var5) {
                this.field1038 = var5;
                this.method385();
                this.method993(32);
            }
        }
    }

    @OriginalMember(owner = "client!mj", name = "i", descriptor = "()Z")
    public final boolean method398() {
        return this.field1029 != 0;
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "([III)V")
    public final synchronized void method110(int[] arg0, int arg1, int arg2) {
        if (this.field1040 == 0 && this.field1029 == 0) {
            this.method112(arg2);
        } else {
            class178 var4 = (class178) super.field1642;
            int var5 = this.field1030 << 8;
            int var6 = this.field1041 << 8;
            int var7 = var4.field2857.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field1036 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field1038 < 0) {
                if (this.field1037 <= 0) {
                    this.method385();
                    this.method993(32);
                    return;
                }
                this.field1038 = 0;
            }
            if (this.field1038 >= var7) {
                if (this.field1037 >= 0) {
                    this.method385();
                    this.method993(32);
                    return;
                }
                this.field1038 = var7 - 1;
            }
            if (this.field1036 < 0) {
                if (this.field1031) {
                    if (this.field1037 < 0) {
                        var9 = this.method384(arg0, arg1, var5, var10, var4.field2857[this.field1030]);
                        if (this.field1038 >= var5) {
                            return;
                        }
                        this.field1038 = var5 + var5 - 1 - this.field1038;
                        this.field1037 = -this.field1037;
                    }
                    while (true) {
                        int var11 = this.method377(arg0, var9, var6, var10, var4.field2857[this.field1041 - 1]);
                        if (this.field1038 < var6) {
                            return;
                        }
                        this.field1038 = var6 + var6 - 1 - this.field1038;
                        this.field1037 = -this.field1037;
                        var9 = this.method384(arg0, var11, var5, var10, var4.field2857[this.field1030]);
                        if (this.field1038 >= var5) {
                            return;
                        }
                        this.field1038 = var5 + var5 - 1 - this.field1038;
                        this.field1037 = -this.field1037;
                    }
                } else if (this.field1037 < 0) {
                    while (true) {
                        var9 = this.method384(arg0, var9, var5, var10, var4.field2857[this.field1041 - 1]);
                        if (this.field1038 >= var5) {
                            return;
                        }
                        this.field1038 = var6 - 1 - (var6 - 1 - this.field1038) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method377(arg0, var9, var6, var10, var4.field2857[this.field1030]);
                        if (this.field1038 < var6) {
                            return;
                        }
                        this.field1038 = (this.field1038 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field1036 > 0) {
                    if (this.field1031) {
                        label130: {
                            if (this.field1037 < 0) {
                                var9 = this.method384(arg0, arg1, var5, var10, var4.field2857[this.field1030]);
                                if (this.field1038 >= var5) {
                                    return;
                                }
                                this.field1038 = var5 + var5 - 1 - this.field1038;
                                this.field1037 = -this.field1037;
                                if (--this.field1036 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method377(arg0, var9, var6, var10, var4.field2857[this.field1041 - 1]);
                                if (this.field1038 < var6) {
                                    return;
                                }
                                this.field1038 = var6 + var6 - 1 - this.field1038;
                                this.field1037 = -this.field1037;
                                if (--this.field1036 == 0) {
                                    break;
                                }
                                var9 = this.method384(arg0, var9, var5, var10, var4.field2857[this.field1030]);
                                if (this.field1038 >= var5) {
                                    return;
                                }
                                this.field1038 = var5 + var5 - 1 - this.field1038;
                                this.field1037 = -this.field1037;
                            } while (--this.field1036 != 0);
                        }
                    } else if (this.field1037 < 0) {
                        while (true) {
                            var9 = this.method384(arg0, var9, var5, var10, var4.field2857[this.field1041 - 1]);
                            if (this.field1038 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field1038) / var8;
                            if (var12 >= this.field1036) {
                                this.field1038 += this.field1036 * var8;
                                this.field1036 = 0;
                                break;
                            }
                            this.field1038 += var8 * var12;
                            this.field1036 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method377(arg0, var9, var6, var10, var4.field2857[this.field1030]);
                            if (this.field1038 < var6) {
                                return;
                            }
                            int var13 = (this.field1038 - var5) / var8;
                            if (var13 >= this.field1036) {
                                this.field1038 -= this.field1036 * var8;
                                this.field1036 = 0;
                                break;
                            }
                            this.field1038 -= var8 * var13;
                            this.field1036 -= var13;
                        }
                    }
                }
                if (this.field1037 < 0) {
                    this.method384(arg0, var9, 0, var10, 0);
                    if (this.field1038 < 0) {
                        this.field1038 = -1;
                        this.method385();
                        this.method993(32);
                        return;
                    }
                } else {
                    this.method377(arg0, var9, var7, var10, 0);
                    if (this.field1038 >= var7) {
                        this.field1038 = var7;
                        this.method385();
                        this.method993(32);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mj", name = "k", descriptor = "(I)V")
    public final synchronized void method399(int arg0) {
        if (this.field1037 < 0) {
            this.field1037 = -arg0;
        } else {
            this.field1037 = arg0;
        }
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(I[B[IIIIIIIIIILmj;)I")
    private static final int method400(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class59 arg12) {
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
        arg12.field1039 += (var19 - arg4) * arg12.field1028;
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
        arg12.field1033 = var15 >> 2;
        arg12.field1035 = var16 >> 2;
        arg12.field1038 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(II[B[IIIIIIILmj;II)I")
    private static final int method401(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class59 arg10, int arg11, int arg12) {
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
        arg10.field1038 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(II)V")
    public final synchronized void method402(int arg0, int arg1) {
        this.method378(arg0, arg1, this.method393());
    }

    @OriginalMember(owner = "client!mj", name = "j", descriptor = "()I")
    public final synchronized int method403() {
        return this.field1037 < 0 ? -this.field1037 : this.field1037;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Z)V")
    public final synchronized void method404(boolean arg0) {
        this.field1037 = (this.field1037 >>> 31) + (this.field1037 ^ this.field1037 >> 31);
        if (arg0) {
            this.field1037 = -this.field1037;
        }
    }

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "(II)V")
    private final synchronized void method405(int arg0, int arg1) {
        this.field1040 = arg0;
        this.field1032 = arg1;
        this.field1029 = 0;
        this.method415();
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(I[B[IIIIIIIILmj;)I")
    private static final int method406(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class59 arg10) {
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
        arg10.field1038 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!mj", name = "l", descriptor = "(I)V")
    public final synchronized void method407(int arg0) {
        this.method405(arg0 << 6, this.method393());
    }

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "(II)I")
    private static final int method408(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(II[B[IIIIIIIIIILmj;II)I")
    private static final int method409(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class59 arg13, int arg14, int arg15) {
        arg13.field1039 -= arg13.field1028 * arg5;
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
        arg13.field1039 += arg13.field1028 * var22;
        arg13.field1033 = arg6;
        arg13.field1035 = arg7;
        arg13.field1038 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(I[B[IIIIIIIILmj;)I")
    private static final int method410(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class59 arg10) {
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
        arg10.field1038 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(II[B[IIIIIIIIIILmj;II)I")
    private static final int method411(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class59 arg13, int arg14, int arg15) {
        arg13.field1039 -= arg13.field1028 * arg5;
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
        arg13.field1039 += arg13.field1028 * var22;
        arg13.field1033 = arg6;
        arg13.field1035 = arg7;
        arg13.field1038 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(II[B[IIIIIIILmj;II)I")
    private static final int method412(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class59 arg10, int arg11, int arg12) {
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
        arg10.field1038 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "([B[IIIIIIIILmj;)I")
    private static final int method413(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class59 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1033 += (var14 - arg3) * arg9.field1034;
        arg9.field1035 += (var14 - arg3) * arg9.field1042;
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
        arg9.field1039 = var12 >> 2;
        arg9.field1038 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!mj", name = "k", descriptor = "()Z")
    public final boolean method414() {
        return this.field1038 < 0 || this.field1038 >= ((class178) super.field1642).field2857.length << 8;
    }

    @OriginalMember(owner = "client!mj", name = "l", descriptor = "()V")
    private final void method415() {
        this.field1039 = this.field1040;
        this.field1033 = method408(this.field1040, this.field1032);
        this.field1035 = method390(this.field1040, this.field1032);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "()I")
    public final int method416() {
        int var1 = this.field1039 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1036 == 0) {
            var2 -= this.field1038 * var2 / (((class178) super.field1642).field2857.length << 8);
        } else if (this.field1036 >= 0) {
            var2 -= this.field1030 * var2 / ((class178) super.field1642).field2857.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!mj", name = "<init>", descriptor = "(Lti;II)V")
    private class59(class178 arg0, int arg1, int arg2) {
        super.field1642 = arg0;
        this.field1030 = arg0.field2858;
        this.field1041 = arg0.field2856;
        this.field1031 = arg0.field2860;
        this.field1037 = arg1;
        this.field1040 = arg2;
        this.field1032 = 8192;
        this.field1038 = 0;
        this.method415();
    }

    @OriginalMember(owner = "client!mj", name = "<init>", descriptor = "(Lti;III)V")
    private class59(class178 arg0, int arg1, int arg2, int arg3) {
        super.field1642 = arg0;
        this.field1030 = arg0.field2858;
        this.field1041 = arg0.field2856;
        this.field1031 = arg0.field2860;
        this.field1037 = arg1;
        this.field1040 = arg2;
        this.field1032 = arg3;
        this.field1038 = 0;
        this.method415();
    }
}
