import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class23 extends class113 {

    @OriginalMember(owner = "client!kb", name = "w", descriptor = "I")
    private int field519;

    @OriginalMember(owner = "client!kb", name = "t", descriptor = "I")
    private int field516;

    @OriginalMember(owner = "client!kb", name = "r", descriptor = "Z")
    private boolean field514;

    @OriginalMember(owner = "client!kb", name = "y", descriptor = "I")
    private int field521;

    @OriginalMember(owner = "client!kb", name = "q", descriptor = "I")
    private int field513;

    @OriginalMember(owner = "client!kb", name = "z", descriptor = "I")
    private int field522;

    @OriginalMember(owner = "client!kb", name = "A", descriptor = "I")
    private int field523;

    @OriginalMember(owner = "client!kb", name = "o", descriptor = "I")
    private int field511;

    @OriginalMember(owner = "client!kb", name = "p", descriptor = "I")
    private int field512;

    @OriginalMember(owner = "client!kb", name = "s", descriptor = "I")
    private int field515;

    @OriginalMember(owner = "client!kb", name = "u", descriptor = "I")
    private int field517;

    @OriginalMember(owner = "client!kb", name = "v", descriptor = "I")
    private int field518;

    @OriginalMember(owner = "client!kb", name = "x", descriptor = "I")
    private int field520;

    @OriginalMember(owner = "client!kb", name = "B", descriptor = "I")
    private int field524;

    @OriginalMember(owner = "client!kb", name = "C", descriptor = "I")
    private int field525;

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "()Z")
    public final boolean method193() {
        return this.field523 < 0 || this.field523 >= ((class107) super.field1989).field1926.length << 8;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(II[B[IIIIIIIIIILkb;II)I")
    private static final int method194(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class23 arg13, int arg14, int arg15) {
        arg13.field518 -= arg13.field515 * arg5;
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
        arg13.field518 += arg13.field515 * var22;
        arg13.field525 = arg6;
        arg13.field520 = arg7;
        arg13.field523 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "()Lui;")
    public final class113 method75() {
        return null;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(II)V")
    private final synchronized void method195(int arg0, int arg1) {
        this.field513 = arg0;
        this.field522 = arg1;
        this.field512 = 0;
        this.method224();
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(II)V")
    public final synchronized void method196(int arg0, int arg1) {
        this.method225(arg0, arg1, this.method212());
    }

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "()I")
    public final synchronized int method197() {
        return this.field521 < 0 ? -this.field521 : this.field521;
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(II[B[IIIIIIIIIILkb;II)I")
    private static final int method198(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class23 arg13, int arg14, int arg15) {
        arg13.field518 -= arg13.field515 * arg5;
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
        arg13.field518 += arg13.field515 * var22;
        arg13.field525 = arg6;
        arg13.field520 = arg7;
        arg13.field523 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(I[B[IIIIIIIILkb;)I")
    private static final int method199(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class23 arg10) {
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
        arg10.field523 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(I[B[IIIIIIIILkb;)I")
    private static final int method200(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class23 arg10) {
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
        arg10.field523 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "([III)V")
    public final synchronized void method72(int[] arg0, int arg1, int arg2) {
        if (this.field513 == 0 && this.field512 == 0) {
            this.method81(arg2);
        } else {
            class107 var4 = (class107) super.field1989;
            int var5 = this.field519 << 8;
            int var6 = this.field516 << 8;
            int var7 = var4.field1926.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field511 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field523 < 0) {
                if (this.field521 <= 0) {
                    this.method231();
                    this.method267(-41);
                    return;
                }
                this.field523 = 0;
            }
            if (this.field523 >= var7) {
                if (this.field521 >= 0) {
                    this.method231();
                    this.method267(-106);
                    return;
                }
                this.field523 = var7 - 1;
            }
            if (this.field511 < 0) {
                if (this.field514) {
                    if (this.field521 < 0) {
                        var9 = this.method204(arg0, arg1, var5, var10, var4.field1926[this.field519]);
                        if (this.field523 >= var5) {
                            return;
                        }
                        this.field523 = var5 + var5 - 1 - this.field523;
                        this.field521 = -this.field521;
                    }
                    while (true) {
                        int var11 = this.method220(arg0, var9, var6, var10, var4.field1926[this.field516 - 1]);
                        if (this.field523 < var6) {
                            return;
                        }
                        this.field523 = var6 + var6 - 1 - this.field523;
                        this.field521 = -this.field521;
                        var9 = this.method204(arg0, var11, var5, var10, var4.field1926[this.field519]);
                        if (this.field523 >= var5) {
                            return;
                        }
                        this.field523 = var5 + var5 - 1 - this.field523;
                        this.field521 = -this.field521;
                    }
                } else if (this.field521 < 0) {
                    while (true) {
                        var9 = this.method204(arg0, var9, var5, var10, var4.field1926[this.field516 - 1]);
                        if (this.field523 >= var5) {
                            return;
                        }
                        this.field523 = var6 - 1 - (var6 - 1 - this.field523) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method220(arg0, var9, var6, var10, var4.field1926[this.field519]);
                        if (this.field523 < var6) {
                            return;
                        }
                        this.field523 = (this.field523 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field511 > 0) {
                    if (this.field514) {
                        label130: {
                            if (this.field521 < 0) {
                                var9 = this.method204(arg0, arg1, var5, var10, var4.field1926[this.field519]);
                                if (this.field523 >= var5) {
                                    return;
                                }
                                this.field523 = var5 + var5 - 1 - this.field523;
                                this.field521 = -this.field521;
                                if (--this.field511 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method220(arg0, var9, var6, var10, var4.field1926[this.field516 - 1]);
                                if (this.field523 < var6) {
                                    return;
                                }
                                this.field523 = var6 + var6 - 1 - this.field523;
                                this.field521 = -this.field521;
                                if (--this.field511 == 0) {
                                    break;
                                }
                                var9 = this.method204(arg0, var9, var5, var10, var4.field1926[this.field519]);
                                if (this.field523 >= var5) {
                                    return;
                                }
                                this.field523 = var5 + var5 - 1 - this.field523;
                                this.field521 = -this.field521;
                            } while (--this.field511 != 0);
                        }
                    } else if (this.field521 < 0) {
                        while (true) {
                            var9 = this.method204(arg0, var9, var5, var10, var4.field1926[this.field516 - 1]);
                            if (this.field523 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field523) / var8;
                            if (var12 >= this.field511) {
                                this.field523 += this.field511 * var8;
                                this.field511 = 0;
                                break;
                            }
                            this.field523 += var8 * var12;
                            this.field511 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method220(arg0, var9, var6, var10, var4.field1926[this.field519]);
                            if (this.field523 < var6) {
                                return;
                            }
                            int var13 = (this.field523 - var5) / var8;
                            if (var13 >= this.field511) {
                                this.field523 -= this.field511 * var8;
                                this.field511 = 0;
                                break;
                            }
                            this.field523 -= var8 * var13;
                            this.field511 -= var13;
                        }
                    }
                }
                if (this.field521 < 0) {
                    this.method204(arg0, var9, 0, var10, 0);
                    if (this.field523 < 0) {
                        this.field523 = -1;
                        this.method231();
                        this.method267(108);
                        return;
                    }
                } else {
                    this.method220(arg0, var9, var7, var10, 0);
                    if (this.field523 >= var7) {
                        this.field523 = var7;
                        this.method231();
                        this.method267(-37);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lbj;II)Lkb;")
    public static final class23 method201(class107 arg0, int arg1, int arg2) {
        return arg0.field1926 != null && arg0.field1926.length != 0 ? new class23(arg0, (int) ((long) arg0.field1924 * 256L * (long) arg1 / (long) (class160.field2755 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "(II)I")
    private static final int method202(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "([B[IIIIIIILkb;)I")
    private static final int method203(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class23 arg8) {
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
        arg8.field523 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "([IIIII)I")
    private final int method204(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field512 <= 0) {
                if (this.field521 == -256 && (this.field523 & 255) == 0) {
                    if (class106.field1920) {
                        return method200(0, ((class107) super.field1989).field1926, arg0, this.field523, arg1, this.field525, this.field520, 0, arg3, arg2, this);
                    }
                    return method216(((class107) super.field1989).field1926, arg0, this.field523, arg1, this.field518, 0, arg3, arg2, this);
                }
                if (class106.field1920) {
                    return method207(0, 0, ((class107) super.field1989).field1926, arg0, this.field523, arg1, this.field525, this.field520, 0, arg3, arg2, this, this.field521, arg4);
                }
                return method211(0, 0, ((class107) super.field1989).field1926, arg0, this.field523, arg1, this.field518, 0, arg3, arg2, this, this.field521, arg4);
            }
            int var6 = this.field512 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field512 += arg1;
            if (this.field521 == -256 && (this.field523 & 255) == 0) {
                if (class106.field1920) {
                    arg1 = method222(0, ((class107) super.field1989).field1926, arg0, this.field523, arg1, this.field525, this.field520, this.field524, this.field517, 0, var6, arg2, this);
                } else {
                    arg1 = method219(((class107) super.field1989).field1926, arg0, this.field523, arg1, this.field518, this.field515, 0, var6, arg2, this);
                }
            } else if (class106.field1920) {
                arg1 = method198(0, 0, ((class107) super.field1989).field1926, arg0, this.field523, arg1, this.field525, this.field520, this.field524, this.field517, 0, var6, arg2, this, this.field521, arg4);
            } else {
                arg1 = method214(0, 0, ((class107) super.field1989).field1926, arg0, this.field523, arg1, this.field518, this.field515, 0, var6, arg2, this, this.field521, arg4);
            }
            this.field512 -= arg1;
            if (this.field512 != 0) {
                return arg1;
            }
        } while (!this.method210());
        return arg3;
    }

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "(I)V")
    public final synchronized void method205(int arg0) {
        this.method195(arg0 << 6, this.method212());
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(II[B[IIIIIIILkb;II)I")
    private static final int method206(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class23 arg10, int arg11, int arg12) {
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
        arg10.field523 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(II[B[IIIIIIIILkb;II)I")
    private static final int method207(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class23 arg11, int arg12, int arg13) {
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
        arg11.field523 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "(I)V")
    public final synchronized void method208(int arg0) {
        this.field511 = arg0;
    }

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "(I)V")
    private final synchronized void method209(int arg0) {
        this.method195(arg0, this.method212());
    }

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "()Z")
    private final boolean method210() {
        int var1 = this.field513;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method202(var1, this.field522);
            var2 = method228(var1, this.field522);
        }
        if (this.field518 == var1 && this.field525 == var3 && this.field520 == var2) {
            if (this.field513 == Integer.MIN_VALUE) {
                this.field513 = 0;
                this.field518 = this.field525 = this.field520 = 0;
                this.method267(-78);
                return true;
            } else {
                this.method224();
                return false;
            }
        } else {
            if (this.field518 < var1) {
                this.field515 = 1;
                this.field512 = var1 - this.field518;
            } else if (this.field518 > var1) {
                this.field515 = -1;
                this.field512 = this.field518 - var1;
            } else {
                this.field515 = 0;
            }
            if (this.field525 < var3) {
                this.field524 = 1;
                if (this.field512 == 0 || this.field512 > var3 - this.field525) {
                    this.field512 = var3 - this.field525;
                }
            } else if (this.field525 > var3) {
                this.field524 = -1;
                if (this.field512 == 0 || this.field512 > this.field525 - var3) {
                    this.field512 = this.field525 - var3;
                }
            } else {
                this.field524 = 0;
            }
            if (this.field520 < var2) {
                this.field517 = 1;
                if (this.field512 == 0 || this.field512 > var2 - this.field520) {
                    this.field512 = var2 - this.field520;
                }
            } else if (this.field520 > var2) {
                this.field517 = -1;
                if (this.field512 == 0 || this.field512 > this.field520 - var2) {
                    this.field512 = this.field520 - var2;
                }
            } else {
                this.field517 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(II[B[IIIIIIILkb;II)I")
    private static final int method211(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class23 arg10, int arg11, int arg12) {
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
        arg10.field523 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!kb", name = "h", descriptor = "()I")
    public final synchronized int method212() {
        return this.field522 < 0 ? -1 : this.field522;
    }

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "()I")
    public final int method213() {
        int var1 = this.field518 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field511 == 0) {
            var2 -= this.field523 * var2 / (((class107) super.field1989).field1926.length << 8);
        } else if (this.field511 >= 0) {
            var2 -= this.field519 * var2 / ((class107) super.field1989).field1926.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "()Lui;")
    public final class113 method82() {
        return null;
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(II[B[IIIIIIIILkb;II)I")
    private static final int method214(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class23 arg11, int arg12, int arg13) {
        arg11.field525 -= arg11.field524 * arg5;
        arg11.field520 -= arg11.field517 * arg5;
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
        arg11.field525 += arg11.field524 * arg5;
        arg11.field520 += arg11.field517 * arg5;
        arg11.field518 = arg6;
        arg11.field523 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "(II[B[IIIIIIIILkb;II)I")
    private static final int method215(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class23 arg11, int arg12, int arg13) {
        arg11.field525 -= arg11.field524 * arg5;
        arg11.field520 -= arg11.field517 * arg5;
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
        arg11.field525 += arg11.field524 * arg5;
        arg11.field520 += arg11.field517 * arg5;
        arg11.field518 = arg6;
        arg11.field523 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "([B[IIIIIIILkb;)I")
    private static final int method216(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class23 arg8) {
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
        arg8.field523 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "(II[B[IIIIIIIILkb;II)I")
    private static final int method217(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class23 arg11, int arg12, int arg13) {
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
        arg11.field523 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "(I)V")
    public final synchronized void method81(int arg0) {
        if (this.field512 > 0) {
            if (arg0 >= this.field512) {
                if (this.field513 == Integer.MIN_VALUE) {
                    this.field513 = 0;
                    this.field518 = this.field525 = this.field520 = 0;
                    this.method267(123);
                    arg0 = this.field512;
                }
                this.field512 = 0;
                this.method224();
            } else {
                this.field518 += this.field515 * arg0;
                this.field525 += this.field524 * arg0;
                this.field520 += this.field517 * arg0;
                this.field512 -= arg0;
            }
        }
        class107 var2 = (class107) super.field1989;
        int var3 = this.field519 << 8;
        int var4 = this.field516 << 8;
        int var5 = var2.field1926.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field511 = 0;
        }
        if (this.field523 < 0) {
            if (this.field521 <= 0) {
                this.method231();
                this.method267(-13);
                return;
            }
            this.field523 = 0;
        }
        if (this.field523 >= var5) {
            if (this.field521 >= 0) {
                this.method231();
                this.method267(120);
                return;
            }
            this.field523 = var5 - 1;
        }
        this.field523 += this.field521 * arg0;
        if (this.field511 < 0) {
            if (!this.field514) {
                if (this.field521 < 0) {
                    if (this.field523 < var3) {
                        this.field523 = var4 - 1 - (var4 - 1 - this.field523) % var6;
                    }
                } else if (this.field523 >= var4) {
                    this.field523 = (this.field523 - var3) % var6 + var3;
                }
            } else {
                if (this.field521 < 0) {
                    if (this.field523 >= var3) {
                        return;
                    }
                    this.field523 = var3 + var3 - 1 - this.field523;
                    this.field521 = -this.field521;
                }
                while (this.field523 >= var4) {
                    this.field523 = var4 + var4 - 1 - this.field523;
                    this.field521 = -this.field521;
                    if (this.field523 >= var3) {
                        return;
                    }
                    this.field523 = var3 + var3 - 1 - this.field523;
                    this.field521 = -this.field521;
                }
            }
        } else {
            if (this.field511 > 0) {
                if (this.field514) {
                    label125: {
                        if (this.field521 < 0) {
                            if (this.field523 >= var3) {
                                return;
                            }
                            this.field523 = var3 + var3 - 1 - this.field523;
                            this.field521 = -this.field521;
                            if (--this.field511 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field523 < var4) {
                                return;
                            }
                            this.field523 = var4 + var4 - 1 - this.field523;
                            this.field521 = -this.field521;
                            if (--this.field511 == 0) {
                                break;
                            }
                            if (this.field523 >= var3) {
                                return;
                            }
                            this.field523 = var3 + var3 - 1 - this.field523;
                            this.field521 = -this.field521;
                        } while (--this.field511 != 0);
                    }
                } else if (this.field521 < 0) {
                    if (this.field523 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field523) / var6;
                    if (var7 < this.field511) {
                        this.field523 += var6 * var7;
                        this.field511 -= var7;
                        return;
                    }
                    this.field523 += this.field511 * var6;
                    this.field511 = 0;
                } else {
                    if (this.field523 < var4) {
                        return;
                    }
                    int var8 = (this.field523 - var3) / var6;
                    if (var8 < this.field511) {
                        this.field523 -= var6 * var8;
                        this.field511 -= var8;
                        return;
                    }
                    this.field523 -= this.field511 * var6;
                    this.field511 = 0;
                }
            }
            if (this.field521 < 0) {
                if (this.field523 < 0) {
                    this.field523 = -1;
                    this.method231();
                    this.method267(-48);
                    return;
                }
            } else if (this.field523 >= var5) {
                this.field523 = var5;
                this.method231();
                this.method267(122);
            }
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(I[B[IIIIIIIIIILkb;)I")
    private static final int method218(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class23 arg12) {
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
        arg12.field518 += (var19 - arg4) * arg12.field515;
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
        arg12.field525 = var15 >> 2;
        arg12.field520 = var16 >> 2;
        arg12.field523 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "([B[IIIIIIIILkb;)I")
    private static final int method219(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class23 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field525 += (var14 - arg3) * arg9.field524;
        arg9.field520 += (var14 - arg3) * arg9.field517;
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
        arg9.field518 = var12 >> 2;
        arg9.field523 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "([IIIII)I")
    private final int method220(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field512 <= 0) {
                if (this.field521 == 256 && (this.field523 & 255) == 0) {
                    if (class106.field1920) {
                        return method199(0, ((class107) super.field1989).field1926, arg0, this.field523, arg1, this.field525, this.field520, 0, arg3, arg2, this);
                    }
                    return method203(((class107) super.field1989).field1926, arg0, this.field523, arg1, this.field518, 0, arg3, arg2, this);
                }
                if (class106.field1920) {
                    return method217(0, 0, ((class107) super.field1989).field1926, arg0, this.field523, arg1, this.field525, this.field520, 0, arg3, arg2, this, this.field521, arg4);
                }
                return method206(0, 0, ((class107) super.field1989).field1926, arg0, this.field523, arg1, this.field518, 0, arg3, arg2, this, this.field521, arg4);
            }
            int var6 = this.field512 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field512 += arg1;
            if (this.field521 == 256 && (this.field523 & 255) == 0) {
                if (class106.field1920) {
                    arg1 = method218(0, ((class107) super.field1989).field1926, arg0, this.field523, arg1, this.field525, this.field520, this.field524, this.field517, 0, var6, arg2, this);
                } else {
                    arg1 = method223(((class107) super.field1989).field1926, arg0, this.field523, arg1, this.field518, this.field515, 0, var6, arg2, this);
                }
            } else if (class106.field1920) {
                arg1 = method194(0, 0, ((class107) super.field1989).field1926, arg0, this.field523, arg1, this.field525, this.field520, this.field524, this.field517, 0, var6, arg2, this, this.field521, arg4);
            } else {
                arg1 = method215(0, 0, ((class107) super.field1989).field1926, arg0, this.field523, arg1, this.field518, this.field515, 0, var6, arg2, this, this.field521, arg4);
            }
            this.field512 -= arg1;
            if (this.field512 != 0) {
                return arg1;
            }
        } while (!this.method210());
        return arg3;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lbj;III)Lkb;")
    public static final class23 method221(class107 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1926 != null && arg0.field1926.length != 0 ? new class23(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(I[B[IIIIIIIIIILkb;)I")
    private static final int method222(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class23 arg12) {
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
        arg12.field518 += (var19 - arg4) * arg12.field515;
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
        arg12.field525 = var15 >> 2;
        arg12.field520 = var16 >> 2;
        arg12.field523 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "([B[IIIIIIIILkb;)I")
    private static final int method223(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class23 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field525 += (var14 - arg3) * arg9.field524;
        arg9.field520 += (var14 - arg3) * arg9.field517;
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
        arg9.field518 = var12 >> 2;
        arg9.field523 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "()I")
    public final int method71() {
        return this.field513 == 0 && this.field512 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!kb", name = "i", descriptor = "()V")
    private final void method224() {
        this.field518 = this.field513;
        this.field525 = method202(this.field513, this.field522);
        this.field520 = method228(this.field513, this.field522);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(III)V")
    public final synchronized void method225(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method195(arg1, arg2);
        } else {
            int var4 = method202(arg1, arg2);
            int var5 = method228(arg1, arg2);
            if (this.field525 == var4 && this.field520 == var5) {
                this.field512 = 0;
            } else {
                int var6 = arg1 - this.field518;
                if (this.field518 - arg1 > var6) {
                    var6 = this.field518 - arg1;
                }
                if (var4 - this.field525 > var6) {
                    var6 = var4 - this.field525;
                }
                if (this.field525 - var4 > var6) {
                    var6 = this.field525 - var4;
                }
                if (var5 - this.field520 > var6) {
                    var6 = var5 - this.field520;
                }
                if (this.field520 - var5 > var6) {
                    var6 = this.field520 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field512 = arg0;
                this.field513 = arg1;
                this.field522 = arg2;
                this.field515 = (arg1 - this.field518) / arg0;
                this.field524 = (var4 - this.field525) / arg0;
                this.field517 = (var5 - this.field520) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!kb", name = "j", descriptor = "()Z")
    public final boolean method226() {
        return this.field512 != 0;
    }

    @OriginalMember(owner = "client!kb", name = "k", descriptor = "()I")
    public final synchronized int method227() {
        return this.field513 == Integer.MIN_VALUE ? 0 : this.field513;
    }

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "(II)I")
    private static final int method228(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "(I)V")
    public final synchronized void method229(int arg0) {
        if (arg0 == 0) {
            this.method209(0);
            this.method267(-37);
        } else if (this.field525 == 0 && this.field520 == 0) {
            this.field512 = 0;
            this.field513 = 0;
            this.field518 = 0;
            this.method267(-117);
        } else {
            int var2 = -this.field518;
            if (this.field518 > var2) {
                var2 = this.field518;
            }
            if (-this.field525 > var2) {
                var2 = -this.field525;
            }
            if (this.field525 > var2) {
                var2 = this.field525;
            }
            if (-this.field520 > var2) {
                var2 = -this.field520;
            }
            if (this.field520 > var2) {
                var2 = this.field520;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field512 = arg0;
            this.field513 = Integer.MIN_VALUE;
            this.field515 = -this.field518 / arg0;
            this.field524 = -this.field525 / arg0;
            this.field517 = -this.field520 / arg0;
        }
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(Z)V")
    public final synchronized void method230(boolean arg0) {
        this.field521 = (this.field521 >>> 31) + (this.field521 ^ this.field521 >> 31);
        if (arg0) {
            this.field521 = -this.field521;
        }
    }

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(Lbj;II)V")
    private class23(class107 arg0, int arg1, int arg2) {
        super.field1989 = arg0;
        this.field519 = arg0.field1923;
        this.field516 = arg0.field1925;
        this.field514 = arg0.field1922;
        this.field521 = arg1;
        this.field513 = arg2;
        this.field522 = 8192;
        this.field523 = 0;
        this.method224();
    }

    @OriginalMember(owner = "client!kb", name = "l", descriptor = "()V")
    private final void method231() {
        if (this.field512 != 0) {
            if (this.field513 == Integer.MIN_VALUE) {
                this.field513 = 0;
            }
            this.field512 = 0;
            this.method224();
        }
    }

    @OriginalMember(owner = "client!kb", name = "h", descriptor = "(I)V")
    public final synchronized void method232(int arg0) {
        int var2 = ((class107) super.field1989).field1926.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field523 = arg0;
    }

    @OriginalMember(owner = "client!kb", name = "i", descriptor = "(I)V")
    public final synchronized void method233(int arg0) {
        if (this.field521 < 0) {
            this.field521 = -arg0;
        } else {
            this.field521 = arg0;
        }
    }

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(Lbj;III)V")
    private class23(class107 arg0, int arg1, int arg2, int arg3) {
        super.field1989 = arg0;
        this.field519 = arg0.field1923;
        this.field516 = arg0.field1925;
        this.field514 = arg0.field1922;
        this.field521 = arg1;
        this.field513 = arg2;
        this.field522 = arg3;
        this.field523 = 0;
        this.method224();
    }
}
