import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class46 extends class144 {

    @OriginalMember(owner = "client!gd", name = "M", descriptor = "I")
    private int field1060;

    @OriginalMember(owner = "client!gd", name = "I", descriptor = "I")
    private int field1056;

    @OriginalMember(owner = "client!gd", name = "A", descriptor = "Z")
    private boolean field1048;

    @OriginalMember(owner = "client!gd", name = "N", descriptor = "I")
    private int field1061;

    @OriginalMember(owner = "client!gd", name = "C", descriptor = "I")
    private int field1050;

    @OriginalMember(owner = "client!gd", name = "z", descriptor = "I")
    private int field1047;

    @OriginalMember(owner = "client!gd", name = "K", descriptor = "I")
    private int field1058;

    @OriginalMember(owner = "client!gd", name = "B", descriptor = "I")
    private int field1049;

    @OriginalMember(owner = "client!gd", name = "D", descriptor = "I")
    private int field1051;

    @OriginalMember(owner = "client!gd", name = "E", descriptor = "I")
    private int field1052;

    @OriginalMember(owner = "client!gd", name = "F", descriptor = "I")
    private int field1053;

    @OriginalMember(owner = "client!gd", name = "G", descriptor = "I")
    private int field1054;

    @OriginalMember(owner = "client!gd", name = "H", descriptor = "I")
    private int field1055;

    @OriginalMember(owner = "client!gd", name = "J", descriptor = "I")
    private int field1057;

    @OriginalMember(owner = "client!gd", name = "L", descriptor = "I")
    private int field1059;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "()I")
    public final int method363() {
        int var1 = this.field1052 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1055 == 0) {
            var2 -= this.field1058 * var2 / (((class48) super.field3331).field1092.length << 8);
        } else if (this.field1055 >= 0) {
            var2 -= this.field1060 * var2 / ((class48) super.field3331).field1092.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(II)I")
    private static final int method364(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "()Z")
    private final boolean method365() {
        int var1 = this.field1050;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method364(var1, this.field1047);
            var2 = method400(var1, this.field1047);
        }
        if (this.field1052 == var1 && this.field1057 == var3 && this.field1054 == var2) {
            if (this.field1050 == Integer.MIN_VALUE) {
                this.field1050 = 0;
                this.field1052 = this.field1057 = this.field1054 = 0;
                this.method674(32);
                return true;
            } else {
                this.method395();
                return false;
            }
        } else {
            if (this.field1052 < var1) {
                this.field1053 = 1;
                this.field1049 = var1 - this.field1052;
            } else if (this.field1052 > var1) {
                this.field1053 = -1;
                this.field1049 = this.field1052 - var1;
            } else {
                this.field1053 = 0;
            }
            if (this.field1057 < var3) {
                this.field1051 = 1;
                if (this.field1049 == 0 || this.field1049 > var3 - this.field1057) {
                    this.field1049 = var3 - this.field1057;
                }
            } else if (this.field1057 > var3) {
                this.field1051 = -1;
                if (this.field1049 == 0 || this.field1049 > this.field1057 - var3) {
                    this.field1049 = this.field1057 - var3;
                }
            } else {
                this.field1051 = 0;
            }
            if (this.field1054 < var2) {
                this.field1059 = 1;
                if (this.field1049 == 0 || this.field1049 > var2 - this.field1054) {
                    this.field1049 = var2 - this.field1054;
                }
            } else if (this.field1054 > var2) {
                this.field1059 = -1;
                if (this.field1049 == 0 || this.field1049 > this.field1054 - var2) {
                    this.field1049 = this.field1054 - var2;
                }
            } else {
                this.field1059 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "([B[IIIIIIILgd;)I")
    private static final int method366(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class46 arg8) {
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
        arg8.field1058 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(II[B[IIIIIIILgd;II)I")
    private static final int method367(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class46 arg10, int arg11, int arg12) {
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
        arg10.field1058 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "(I)V")
    public final synchronized void method368(int arg0) {
        this.method393(arg0 << 6, this.method379());
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "([IIIII)I")
    private final int method369(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field1049 <= 0) {
                if (this.field1061 == -256 && (this.field1058 & 255) == 0) {
                    if (class19.field387) {
                        return method377(0, ((class48) super.field3331).field1092, arg0, this.field1058, arg1, this.field1057, this.field1054, 0, arg3, arg2, this);
                    }
                    return method380(((class48) super.field3331).field1092, arg0, this.field1058, arg1, this.field1052, 0, arg3, arg2, this);
                }
                if (class19.field387) {
                    return method399(0, 0, ((class48) super.field3331).field1092, arg0, this.field1058, arg1, this.field1057, this.field1054, 0, arg3, arg2, this, this.field1061, arg4);
                }
                return method367(0, 0, ((class48) super.field3331).field1092, arg0, this.field1058, arg1, this.field1052, 0, arg3, arg2, this, this.field1061, arg4);
            }
            int var6 = this.field1049 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field1049 += arg1;
            if (this.field1061 == -256 && (this.field1058 & 255) == 0) {
                if (class19.field387) {
                    arg1 = method378(0, ((class48) super.field3331).field1092, arg0, this.field1058, arg1, this.field1057, this.field1054, this.field1051, this.field1059, 0, var6, arg2, this);
                } else {
                    arg1 = method397(((class48) super.field3331).field1092, arg0, this.field1058, arg1, this.field1052, this.field1053, 0, var6, arg2, this);
                }
            } else if (class19.field387) {
                arg1 = method372(0, 0, ((class48) super.field3331).field1092, arg0, this.field1058, arg1, this.field1057, this.field1054, this.field1051, this.field1059, 0, var6, arg2, this, this.field1061, arg4);
            } else {
                arg1 = method371(0, 0, ((class48) super.field3331).field1092, arg0, this.field1058, arg1, this.field1052, this.field1053, 0, var6, arg2, this, this.field1061, arg4);
            }
            this.field1049 -= arg1;
            if (this.field1049 != 0) {
                return arg1;
            }
        } while (!this.method365());
        return arg3;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(II[B[IIIIIIIILgd;II)I")
    private static final int method370(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class46 arg11, int arg12, int arg13) {
        arg11.field1057 -= arg11.field1051 * arg5;
        arg11.field1054 -= arg11.field1059 * arg5;
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
        arg11.field1057 += arg11.field1051 * arg5;
        arg11.field1054 += arg11.field1059 * arg5;
        arg11.field1052 = arg6;
        arg11.field1058 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(II[B[IIIIIIIILgd;II)I")
    private static final int method371(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class46 arg11, int arg12, int arg13) {
        arg11.field1057 -= arg11.field1051 * arg5;
        arg11.field1054 -= arg11.field1059 * arg5;
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
        arg11.field1057 += arg11.field1051 * arg5;
        arg11.field1054 += arg11.field1059 * arg5;
        arg11.field1052 = arg6;
        arg11.field1058 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(I)V")
    public final synchronized void method80(int arg0) {
        if (this.field1049 > 0) {
            if (arg0 >= this.field1049) {
                if (this.field1050 == Integer.MIN_VALUE) {
                    this.field1050 = 0;
                    this.field1052 = this.field1057 = this.field1054 = 0;
                    this.method674(32);
                    arg0 = this.field1049;
                }
                this.field1049 = 0;
                this.method395();
            } else {
                this.field1052 += this.field1053 * arg0;
                this.field1057 += this.field1051 * arg0;
                this.field1054 += this.field1059 * arg0;
                this.field1049 -= arg0;
            }
        }
        class48 var2 = (class48) super.field3331;
        int var3 = this.field1060 << 8;
        int var4 = this.field1056 << 8;
        int var5 = var2.field1092.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1055 = 0;
        }
        if (this.field1058 < 0) {
            if (this.field1061 <= 0) {
                this.method383();
                this.method674(32);
                return;
            }
            this.field1058 = 0;
        }
        if (this.field1058 >= var5) {
            if (this.field1061 >= 0) {
                this.method383();
                this.method674(32);
                return;
            }
            this.field1058 = var5 - 1;
        }
        this.field1058 += this.field1061 * arg0;
        if (this.field1055 < 0) {
            if (!this.field1048) {
                if (this.field1061 < 0) {
                    if (this.field1058 < var3) {
                        this.field1058 = var4 - 1 - (var4 - 1 - this.field1058) % var6;
                    }
                } else if (this.field1058 >= var4) {
                    this.field1058 = (this.field1058 - var3) % var6 + var3;
                }
            } else {
                if (this.field1061 < 0) {
                    if (this.field1058 >= var3) {
                        return;
                    }
                    this.field1058 = var3 + var3 - 1 - this.field1058;
                    this.field1061 = -this.field1061;
                }
                while (this.field1058 >= var4) {
                    this.field1058 = var4 + var4 - 1 - this.field1058;
                    this.field1061 = -this.field1061;
                    if (this.field1058 >= var3) {
                        return;
                    }
                    this.field1058 = var3 + var3 - 1 - this.field1058;
                    this.field1061 = -this.field1061;
                }
            }
        } else {
            if (this.field1055 > 0) {
                if (this.field1048) {
                    label125: {
                        if (this.field1061 < 0) {
                            if (this.field1058 >= var3) {
                                return;
                            }
                            this.field1058 = var3 + var3 - 1 - this.field1058;
                            this.field1061 = -this.field1061;
                            if (--this.field1055 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field1058 < var4) {
                                return;
                            }
                            this.field1058 = var4 + var4 - 1 - this.field1058;
                            this.field1061 = -this.field1061;
                            if (--this.field1055 == 0) {
                                break;
                            }
                            if (this.field1058 >= var3) {
                                return;
                            }
                            this.field1058 = var3 + var3 - 1 - this.field1058;
                            this.field1061 = -this.field1061;
                        } while (--this.field1055 != 0);
                    }
                } else if (this.field1061 < 0) {
                    if (this.field1058 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field1058) / var6;
                    if (var7 < this.field1055) {
                        this.field1058 += var6 * var7;
                        this.field1055 -= var7;
                        return;
                    }
                    this.field1058 += this.field1055 * var6;
                    this.field1055 = 0;
                } else {
                    if (this.field1058 < var4) {
                        return;
                    }
                    int var8 = (this.field1058 - var3) / var6;
                    if (var8 < this.field1055) {
                        this.field1058 -= var6 * var8;
                        this.field1055 -= var8;
                        return;
                    }
                    this.field1058 -= this.field1055 * var6;
                    this.field1055 = 0;
                }
            }
            if (this.field1061 < 0) {
                if (this.field1058 < 0) {
                    this.field1058 = -1;
                    this.method383();
                    this.method674(32);
                    return;
                }
            } else if (this.field1058 >= var5) {
                this.field1058 = var5;
                this.method383();
                this.method674(32);
            }
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(II[B[IIIIIIIIIILgd;II)I")
    private static final int method372(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class46 arg13, int arg14, int arg15) {
        arg13.field1052 -= arg13.field1053 * arg5;
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
        arg13.field1052 += arg13.field1053 * var22;
        arg13.field1057 = arg6;
        arg13.field1054 = arg7;
        arg13.field1058 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "(I)V")
    public final synchronized void method373(int arg0) {
        if (this.field1061 < 0) {
            this.field1061 = -arg0;
        } else {
            this.field1061 = arg0;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lgf;II)Lgd;")
    public static final class46 method374(class48 arg0, int arg1, int arg2) {
        return arg0.field1092 != null && arg0.field1092.length != 0 ? new class46(arg0, (int) ((long) arg0.field1090 * 256L * (long) arg1 / (long) (class5.field89 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "()Z")
    public final boolean method375() {
        return this.field1049 != 0;
    }

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "(I)V")
    public final synchronized void method376(int arg0) {
        int var2 = ((class48) super.field3331).field1092.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1058 = arg0;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I[B[IIIIIIIILgd;)I")
    private static final int method377(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class46 arg10) {
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
        arg10.field1058 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I[B[IIIIIIIIIILgd;)I")
    private static final int method378(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class46 arg12) {
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
        arg12.field1052 += (var19 - arg4) * arg12.field1053;
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
        arg12.field1057 = var15 >> 2;
        arg12.field1054 = var16 >> 2;
        arg12.field1058 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "()I")
    public final synchronized int method379() {
        return this.field1047 < 0 ? -1 : this.field1047;
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "([B[IIIIIIILgd;)I")
    private static final int method380(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class46 arg8) {
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
        arg8.field1058 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "()I")
    public final int method88() {
        return this.field1050 == 0 && this.field1049 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "(I)V")
    public final synchronized void method381(int arg0) {
        if (arg0 == 0) {
            this.method392(0);
            this.method674(32);
        } else if (this.field1057 == 0 && this.field1054 == 0) {
            this.field1049 = 0;
            this.field1050 = 0;
            this.field1052 = 0;
            this.method674(32);
        } else {
            int var2 = -this.field1052;
            if (this.field1052 > var2) {
                var2 = this.field1052;
            }
            if (-this.field1057 > var2) {
                var2 = -this.field1057;
            }
            if (this.field1057 > var2) {
                var2 = this.field1057;
            }
            if (-this.field1054 > var2) {
                var2 = -this.field1054;
            }
            if (this.field1054 > var2) {
                var2 = this.field1054;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1049 = arg0;
            this.field1050 = Integer.MIN_VALUE;
            this.field1053 = -this.field1052 / arg0;
            this.field1051 = -this.field1057 / arg0;
            this.field1059 = -this.field1054 / arg0;
        }
    }

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "()I")
    public final synchronized int method382() {
        return this.field1061 < 0 ? -this.field1061 : this.field1061;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "([III)V")
    public final synchronized void method87(int[] arg0, int arg1, int arg2) {
        if (this.field1050 == 0 && this.field1049 == 0) {
            this.method80(arg2);
        } else {
            class48 var4 = (class48) super.field3331;
            int var5 = this.field1060 << 8;
            int var6 = this.field1056 << 8;
            int var7 = var4.field1092.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field1055 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field1058 < 0) {
                if (this.field1061 <= 0) {
                    this.method383();
                    this.method674(32);
                    return;
                }
                this.field1058 = 0;
            }
            if (this.field1058 >= var7) {
                if (this.field1061 >= 0) {
                    this.method383();
                    this.method674(32);
                    return;
                }
                this.field1058 = var7 - 1;
            }
            if (this.field1055 < 0) {
                if (this.field1048) {
                    if (this.field1061 < 0) {
                        var9 = this.method369(arg0, arg1, var5, var10, var4.field1092[this.field1060]);
                        if (this.field1058 >= var5) {
                            return;
                        }
                        this.field1058 = var5 + var5 - 1 - this.field1058;
                        this.field1061 = -this.field1061;
                    }
                    while (true) {
                        int var11 = this.method401(arg0, var9, var6, var10, var4.field1092[this.field1056 - 1]);
                        if (this.field1058 < var6) {
                            return;
                        }
                        this.field1058 = var6 + var6 - 1 - this.field1058;
                        this.field1061 = -this.field1061;
                        var9 = this.method369(arg0, var11, var5, var10, var4.field1092[this.field1060]);
                        if (this.field1058 >= var5) {
                            return;
                        }
                        this.field1058 = var5 + var5 - 1 - this.field1058;
                        this.field1061 = -this.field1061;
                    }
                } else if (this.field1061 < 0) {
                    while (true) {
                        var9 = this.method369(arg0, var9, var5, var10, var4.field1092[this.field1056 - 1]);
                        if (this.field1058 >= var5) {
                            return;
                        }
                        this.field1058 = var6 - 1 - (var6 - 1 - this.field1058) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method401(arg0, var9, var6, var10, var4.field1092[this.field1060]);
                        if (this.field1058 < var6) {
                            return;
                        }
                        this.field1058 = (this.field1058 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field1055 > 0) {
                    if (this.field1048) {
                        label130: {
                            if (this.field1061 < 0) {
                                var9 = this.method369(arg0, arg1, var5, var10, var4.field1092[this.field1060]);
                                if (this.field1058 >= var5) {
                                    return;
                                }
                                this.field1058 = var5 + var5 - 1 - this.field1058;
                                this.field1061 = -this.field1061;
                                if (--this.field1055 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method401(arg0, var9, var6, var10, var4.field1092[this.field1056 - 1]);
                                if (this.field1058 < var6) {
                                    return;
                                }
                                this.field1058 = var6 + var6 - 1 - this.field1058;
                                this.field1061 = -this.field1061;
                                if (--this.field1055 == 0) {
                                    break;
                                }
                                var9 = this.method369(arg0, var9, var5, var10, var4.field1092[this.field1060]);
                                if (this.field1058 >= var5) {
                                    return;
                                }
                                this.field1058 = var5 + var5 - 1 - this.field1058;
                                this.field1061 = -this.field1061;
                            } while (--this.field1055 != 0);
                        }
                    } else if (this.field1061 < 0) {
                        while (true) {
                            var9 = this.method369(arg0, var9, var5, var10, var4.field1092[this.field1056 - 1]);
                            if (this.field1058 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field1058) / var8;
                            if (var12 >= this.field1055) {
                                this.field1058 += this.field1055 * var8;
                                this.field1055 = 0;
                                break;
                            }
                            this.field1058 += var8 * var12;
                            this.field1055 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method401(arg0, var9, var6, var10, var4.field1092[this.field1060]);
                            if (this.field1058 < var6) {
                                return;
                            }
                            int var13 = (this.field1058 - var5) / var8;
                            if (var13 >= this.field1055) {
                                this.field1058 -= this.field1055 * var8;
                                this.field1055 = 0;
                                break;
                            }
                            this.field1058 -= var8 * var13;
                            this.field1055 -= var13;
                        }
                    }
                }
                if (this.field1061 < 0) {
                    this.method369(arg0, var9, 0, var10, 0);
                    if (this.field1058 < 0) {
                        this.field1058 = -1;
                        this.method383();
                        this.method674(32);
                        return;
                    }
                } else {
                    this.method401(arg0, var9, var7, var10, 0);
                    if (this.field1058 >= var7) {
                        this.field1058 = var7;
                        this.method383();
                        this.method674(32);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gd", name = "i", descriptor = "()V")
    private final void method383() {
        if (this.field1049 != 0) {
            if (this.field1050 == Integer.MIN_VALUE) {
                this.field1050 = 0;
            }
            this.field1049 = 0;
            this.method395();
        }
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(I[B[IIIIIIIIIILgd;)I")
    private static final int method384(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class46 arg12) {
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
        arg12.field1052 += (var19 - arg4) * arg12.field1053;
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
        arg12.field1057 = var15 >> 2;
        arg12.field1054 = var16 >> 2;
        arg12.field1058 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "(I)V")
    public final synchronized void method385(int arg0) {
        this.field1055 = arg0;
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(II[B[IIIIIIILgd;II)I")
    private static final int method386(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class46 arg10, int arg11, int arg12) {
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
        arg10.field1058 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "()Lv;")
    public final class144 method83() {
        return null;
    }

    @OriginalMember(owner = "client!gd", name = "j", descriptor = "()I")
    public final synchronized int method387() {
        return this.field1050 == Integer.MIN_VALUE ? 0 : this.field1050;
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(II)V")
    public final synchronized void method388(int arg0, int arg1) {
        this.method391(arg0, arg1, this.method379());
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(II[B[IIIIIIIILgd;II)I")
    private static final int method389(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class46 arg11, int arg12, int arg13) {
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
        arg11.field1058 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(Z)V")
    public final synchronized void method390(boolean arg0) {
        this.field1061 = (this.field1061 >>> 31) + (this.field1061 ^ this.field1061 >> 31);
        if (arg0) {
            this.field1061 = -this.field1061;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(III)V")
    public final synchronized void method391(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method393(arg1, arg2);
        } else {
            int var4 = method364(arg1, arg2);
            int var5 = method400(arg1, arg2);
            if (this.field1057 == var4 && this.field1054 == var5) {
                this.field1049 = 0;
            } else {
                int var6 = arg1 - this.field1052;
                if (this.field1052 - arg1 > var6) {
                    var6 = this.field1052 - arg1;
                }
                if (var4 - this.field1057 > var6) {
                    var6 = var4 - this.field1057;
                }
                if (this.field1057 - var4 > var6) {
                    var6 = this.field1057 - var4;
                }
                if (var5 - this.field1054 > var6) {
                    var6 = var5 - this.field1054;
                }
                if (this.field1054 - var5 > var6) {
                    var6 = this.field1054 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field1049 = arg0;
                this.field1050 = arg1;
                this.field1047 = arg2;
                this.field1053 = (arg1 - this.field1052) / arg0;
                this.field1051 = (var4 - this.field1057) / arg0;
                this.field1059 = (var5 - this.field1054) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!gd", name = "i", descriptor = "(I)V")
    private final synchronized void method392(int arg0) {
        this.method393(arg0, this.method379());
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(II)V")
    private final synchronized void method393(int arg0, int arg1) {
        this.field1050 = arg0;
        this.field1047 = arg1;
        this.field1049 = 0;
        this.method395();
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "([B[IIIIIIIILgd;)I")
    private static final int method394(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class46 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1057 += (var14 - arg3) * arg9.field1051;
        arg9.field1054 += (var14 - arg3) * arg9.field1059;
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
        arg9.field1052 = var12 >> 2;
        arg9.field1058 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!gd", name = "k", descriptor = "()V")
    private final void method395() {
        this.field1052 = this.field1050;
        this.field1057 = method364(this.field1050, this.field1047);
        this.field1054 = method400(this.field1050, this.field1047);
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(II[B[IIIIIIIIIILgd;II)I")
    private static final int method396(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class46 arg13, int arg14, int arg15) {
        arg13.field1052 -= arg13.field1053 * arg5;
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
        arg13.field1052 += arg13.field1053 * var22;
        arg13.field1057 = arg6;
        arg13.field1054 = arg7;
        arg13.field1058 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "([B[IIIIIIIILgd;)I")
    private static final int method397(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class46 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1057 += (var14 - arg3) * arg9.field1051;
        arg9.field1054 += (var14 - arg3) * arg9.field1059;
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
        arg9.field1052 = var12 >> 2;
        arg9.field1058 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(I[B[IIIIIIIILgd;)I")
    private static final int method398(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class46 arg10) {
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
        arg10.field1058 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "(II[B[IIIIIIIILgd;II)I")
    private static final int method399(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class46 arg11, int arg12, int arg13) {
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
        arg11.field1058 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "(II)I")
    private static final int method400(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(Lgf;II)V")
    private class46(class48 arg0, int arg1, int arg2) {
        super.field3331 = arg0;
        this.field1060 = arg0.field1091;
        this.field1056 = arg0.field1089;
        this.field1048 = arg0.field1088;
        this.field1061 = arg1;
        this.field1050 = arg2;
        this.field1047 = 8192;
        this.field1058 = 0;
        this.method395();
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "([IIIII)I")
    private final int method401(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field1049 <= 0) {
                if (this.field1061 == 256 && (this.field1058 & 255) == 0) {
                    if (class19.field387) {
                        return method398(0, ((class48) super.field3331).field1092, arg0, this.field1058, arg1, this.field1057, this.field1054, 0, arg3, arg2, this);
                    }
                    return method366(((class48) super.field3331).field1092, arg0, this.field1058, arg1, this.field1052, 0, arg3, arg2, this);
                }
                if (class19.field387) {
                    return method389(0, 0, ((class48) super.field3331).field1092, arg0, this.field1058, arg1, this.field1057, this.field1054, 0, arg3, arg2, this, this.field1061, arg4);
                }
                return method386(0, 0, ((class48) super.field3331).field1092, arg0, this.field1058, arg1, this.field1052, 0, arg3, arg2, this, this.field1061, arg4);
            }
            int var6 = this.field1049 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field1049 += arg1;
            if (this.field1061 == 256 && (this.field1058 & 255) == 0) {
                if (class19.field387) {
                    arg1 = method384(0, ((class48) super.field3331).field1092, arg0, this.field1058, arg1, this.field1057, this.field1054, this.field1051, this.field1059, 0, var6, arg2, this);
                } else {
                    arg1 = method394(((class48) super.field3331).field1092, arg0, this.field1058, arg1, this.field1052, this.field1053, 0, var6, arg2, this);
                }
            } else if (class19.field387) {
                arg1 = method396(0, 0, ((class48) super.field3331).field1092, arg0, this.field1058, arg1, this.field1057, this.field1054, this.field1051, this.field1059, 0, var6, arg2, this, this.field1061, arg4);
            } else {
                arg1 = method370(0, 0, ((class48) super.field3331).field1092, arg0, this.field1058, arg1, this.field1052, this.field1053, 0, var6, arg2, this, this.field1061, arg4);
            }
            this.field1049 -= arg1;
            if (this.field1049 != 0) {
                return arg1;
            }
        } while (!this.method365());
        return arg3;
    }

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(Lgf;III)V")
    private class46(class48 arg0, int arg1, int arg2, int arg3) {
        super.field3331 = arg0;
        this.field1060 = arg0.field1091;
        this.field1056 = arg0.field1089;
        this.field1048 = arg0.field1088;
        this.field1061 = arg1;
        this.field1050 = arg2;
        this.field1047 = arg3;
        this.field1058 = 0;
        this.method395();
    }

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "()Lv;")
    public final class144 method79() {
        return null;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lgf;III)Lgd;")
    public static final class46 method402(class48 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1092 != null && arg0.field1092.length != 0 ? new class46(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!gd", name = "l", descriptor = "()Z")
    public final boolean method403() {
        return this.field1058 < 0 || this.field1058 >= ((class48) super.field3331).field1092.length << 8;
    }
}
