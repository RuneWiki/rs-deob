import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class34 extends class148 {

    @OriginalMember(owner = "client!ri", name = "F", descriptor = "I")
    private int field530;

    @OriginalMember(owner = "client!ri", name = "C", descriptor = "I")
    private int field527;

    @OriginalMember(owner = "client!ri", name = "D", descriptor = "Z")
    private boolean field528;

    @OriginalMember(owner = "client!ri", name = "w", descriptor = "I")
    private int field521;

    @OriginalMember(owner = "client!ri", name = "s", descriptor = "I")
    private int field517;

    @OriginalMember(owner = "client!ri", name = "u", descriptor = "I")
    private int field519;

    @OriginalMember(owner = "client!ri", name = "B", descriptor = "I")
    private int field526;

    @OriginalMember(owner = "client!ri", name = "r", descriptor = "I")
    private int field516;

    @OriginalMember(owner = "client!ri", name = "t", descriptor = "I")
    private int field518;

    @OriginalMember(owner = "client!ri", name = "v", descriptor = "I")
    private int field520;

    @OriginalMember(owner = "client!ri", name = "x", descriptor = "I")
    private int field522;

    @OriginalMember(owner = "client!ri", name = "y", descriptor = "I")
    private int field523;

    @OriginalMember(owner = "client!ri", name = "z", descriptor = "I")
    private int field524;

    @OriginalMember(owner = "client!ri", name = "A", descriptor = "I")
    private int field525;

    @OriginalMember(owner = "client!ri", name = "E", descriptor = "I")
    private int field529;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(I[B[IIIIIIIIIILri;)I")
    private static final int method199(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class34 arg12) {
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
        arg12.field523 += (var19 - arg4) * arg12.field524;
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
        arg12.field520 = var15 >> 2;
        arg12.field516 = var16 >> 2;
        arg12.field526 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "(I)V")
    public final synchronized void method200(int arg0) {
        this.field525 = arg0;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(I[B[IIIIIIIILri;)I")
    private static final int method201(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class34 arg10) {
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
        arg10.field526 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "(I)V")
    public final synchronized void method202(int arg0) {
        if (this.field529 > 0) {
            if (arg0 >= this.field529) {
                if (this.field517 == Integer.MIN_VALUE) {
                    this.field517 = 0;
                    this.field523 = this.field520 = this.field516 = 0;
                    this.method1063(89);
                    arg0 = this.field529;
                }
                this.field529 = 0;
                this.method221();
            } else {
                this.field523 += this.field524 * arg0;
                this.field520 += this.field522 * arg0;
                this.field516 += this.field518 * arg0;
                this.field529 -= arg0;
            }
        }
        class167 var2 = (class167) super.field2797;
        int var3 = this.field530 << 8;
        int var4 = this.field527 << 8;
        int var5 = var2.field3074.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field525 = 0;
        }
        if (this.field526 < 0) {
            if (this.field521 <= 0) {
                this.method210();
                this.method1063(115);
                return;
            }
            this.field526 = 0;
        }
        if (this.field526 >= var5) {
            if (this.field521 >= 0) {
                this.method210();
                this.method1063(108);
                return;
            }
            this.field526 = var5 - 1;
        }
        this.field526 += this.field521 * arg0;
        if (this.field525 < 0) {
            if (!this.field528) {
                if (this.field521 < 0) {
                    if (this.field526 < var3) {
                        this.field526 = var4 - 1 - (var4 - 1 - this.field526) % var6;
                    }
                } else if (this.field526 >= var4) {
                    this.field526 = (this.field526 - var3) % var6 + var3;
                }
            } else {
                if (this.field521 < 0) {
                    if (this.field526 >= var3) {
                        return;
                    }
                    this.field526 = var3 + var3 - 1 - this.field526;
                    this.field521 = -this.field521;
                }
                while (this.field526 >= var4) {
                    this.field526 = var4 + var4 - 1 - this.field526;
                    this.field521 = -this.field521;
                    if (this.field526 >= var3) {
                        return;
                    }
                    this.field526 = var3 + var3 - 1 - this.field526;
                    this.field521 = -this.field521;
                }
            }
        } else {
            if (this.field525 > 0) {
                if (this.field528) {
                    label125: {
                        if (this.field521 < 0) {
                            if (this.field526 >= var3) {
                                return;
                            }
                            this.field526 = var3 + var3 - 1 - this.field526;
                            this.field521 = -this.field521;
                            if (--this.field525 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field526 < var4) {
                                return;
                            }
                            this.field526 = var4 + var4 - 1 - this.field526;
                            this.field521 = -this.field521;
                            if (--this.field525 == 0) {
                                break;
                            }
                            if (this.field526 >= var3) {
                                return;
                            }
                            this.field526 = var3 + var3 - 1 - this.field526;
                            this.field521 = -this.field521;
                        } while (--this.field525 != 0);
                    }
                } else if (this.field521 < 0) {
                    if (this.field526 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field526) / var6;
                    if (var7 < this.field525) {
                        this.field526 += var6 * var7;
                        this.field525 -= var7;
                        return;
                    }
                    this.field526 += this.field525 * var6;
                    this.field525 = 0;
                } else {
                    if (this.field526 < var4) {
                        return;
                    }
                    int var8 = (this.field526 - var3) / var6;
                    if (var8 < this.field525) {
                        this.field526 -= var6 * var8;
                        this.field525 -= var8;
                        return;
                    }
                    this.field526 -= this.field525 * var6;
                    this.field525 = 0;
                }
            }
            if (this.field521 < 0) {
                if (this.field526 < 0) {
                    this.field526 = -1;
                    this.method210();
                    this.method1063(125);
                    return;
                }
            } else if (this.field526 >= var5) {
                this.field526 = var5;
                this.method210();
                this.method1063(70);
            }
        }
    }

    @OriginalMember(owner = "client!ri", name = "e", descriptor = "()I")
    public final synchronized int method203() {
        return this.field517 == Integer.MIN_VALUE ? 0 : this.field517;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(II[B[IIIIIIIILri;II)I")
    private static final int method204(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class34 arg11, int arg12, int arg13) {
        arg11.field520 -= arg11.field522 * arg5;
        arg11.field516 -= arg11.field518 * arg5;
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
        arg11.field520 += arg11.field522 * arg5;
        arg11.field516 += arg11.field518 * arg5;
        arg11.field523 = arg6;
        arg11.field526 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(I[B[IIIIIIIIIILri;)I")
    private static final int method205(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class34 arg12) {
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
        arg12.field523 += (var19 - arg4) * arg12.field524;
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
        arg12.field520 = var15 >> 2;
        arg12.field516 = var16 >> 2;
        arg12.field526 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(II)V")
    private final synchronized void method206(int arg0, int arg1) {
        this.field517 = arg0;
        this.field519 = arg1;
        this.field529 = 0;
        this.method221();
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "([B[IIIIIIILri;)I")
    private static final int method207(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class34 arg8) {
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
        arg8.field526 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "()I")
    public final int method208() {
        return this.field517 == 0 && this.field529 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "([B[IIIIIIIILri;)I")
    private static final int method209(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class34 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field520 += (var14 - arg3) * arg9.field522;
        arg9.field516 += (var14 - arg3) * arg9.field518;
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
        arg9.field523 = var12 >> 2;
        arg9.field526 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ri", name = "f", descriptor = "()V")
    private final void method210() {
        if (this.field529 != 0) {
            if (this.field517 == Integer.MIN_VALUE) {
                this.field517 = 0;
            }
            this.field529 = 0;
            this.method221();
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(II[B[IIIIIIIIIILri;II)I")
    private static final int method211(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class34 arg13, int arg14, int arg15) {
        arg13.field523 -= arg13.field524 * arg5;
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
        arg13.field523 += arg13.field524 * var22;
        arg13.field520 = arg6;
        arg13.field516 = arg7;
        arg13.field526 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "()Lge;")
    public final class148 method212() {
        return null;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "([IIIII)I")
    private final int method213(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field529 <= 0) {
                if (this.field521 == -256 && (this.field526 & 255) == 0) {
                    if (class12.field187) {
                        return method223(0, ((class167) super.field2797).field3074, arg0, this.field526, arg1, this.field520, this.field516, 0, arg3, arg2, this);
                    }
                    return method207(((class167) super.field2797).field3074, arg0, this.field526, arg1, this.field523, 0, arg3, arg2, this);
                }
                if (class12.field187) {
                    return method239(0, 0, ((class167) super.field2797).field3074, arg0, this.field526, arg1, this.field520, this.field516, 0, arg3, arg2, this, this.field521, arg4);
                }
                return method234(0, 0, ((class167) super.field2797).field3074, arg0, this.field526, arg1, this.field523, 0, arg3, arg2, this, this.field521, arg4);
            }
            int var6 = this.field529 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field529 += arg1;
            if (this.field521 == -256 && (this.field526 & 255) == 0) {
                if (class12.field187) {
                    arg1 = method199(0, ((class167) super.field2797).field3074, arg0, this.field526, arg1, this.field520, this.field516, this.field522, this.field518, 0, var6, arg2, this);
                } else {
                    arg1 = method233(((class167) super.field2797).field3074, arg0, this.field526, arg1, this.field523, this.field524, 0, var6, arg2, this);
                }
            } else if (class12.field187) {
                arg1 = method211(0, 0, ((class167) super.field2797).field3074, arg0, this.field526, arg1, this.field520, this.field516, this.field522, this.field518, 0, var6, arg2, this, this.field521, arg4);
            } else {
                arg1 = method204(0, 0, ((class167) super.field2797).field3074, arg0, this.field526, arg1, this.field523, this.field524, 0, var6, arg2, this, this.field521, arg4);
            }
            this.field529 -= arg1;
            if (this.field529 != 0) {
                return arg1;
            }
        } while (!this.method235());
        return arg3;
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(II)I")
    private static final int method214(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "([B[IIIIIIILri;)I")
    private static final int method215(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class34 arg8) {
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
        arg8.field526 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ri", name = "e", descriptor = "(I)V")
    private final synchronized void method216(int arg0) {
        this.method206(arg0, this.method222());
    }

    @OriginalMember(owner = "client!ri", name = "g", descriptor = "()Z")
    public final boolean method217() {
        return this.field526 < 0 || this.field526 >= ((class167) super.field2797).field3074.length << 8;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "([III)V")
    public final synchronized void method218(int[] arg0, int arg1, int arg2) {
        if (this.field517 == 0 && this.field529 == 0) {
            this.method202(arg2);
        } else {
            class167 var4 = (class167) super.field2797;
            int var5 = this.field530 << 8;
            int var6 = this.field527 << 8;
            int var7 = var4.field3074.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field525 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field526 < 0) {
                if (this.field521 <= 0) {
                    this.method210();
                    this.method1063(124);
                    return;
                }
                this.field526 = 0;
            }
            if (this.field526 >= var7) {
                if (this.field521 >= 0) {
                    this.method210();
                    this.method1063(118);
                    return;
                }
                this.field526 = var7 - 1;
            }
            if (this.field525 < 0) {
                if (this.field528) {
                    if (this.field521 < 0) {
                        var9 = this.method213(arg0, arg1, var5, var10, var4.field3074[this.field530]);
                        if (this.field526 >= var5) {
                            return;
                        }
                        this.field526 = var5 + var5 - 1 - this.field526;
                        this.field521 = -this.field521;
                    }
                    while (true) {
                        int var11 = this.method238(arg0, var9, var6, var10, var4.field3074[this.field527 - 1]);
                        if (this.field526 < var6) {
                            return;
                        }
                        this.field526 = var6 + var6 - 1 - this.field526;
                        this.field521 = -this.field521;
                        var9 = this.method213(arg0, var11, var5, var10, var4.field3074[this.field530]);
                        if (this.field526 >= var5) {
                            return;
                        }
                        this.field526 = var5 + var5 - 1 - this.field526;
                        this.field521 = -this.field521;
                    }
                } else if (this.field521 < 0) {
                    while (true) {
                        var9 = this.method213(arg0, var9, var5, var10, var4.field3074[this.field527 - 1]);
                        if (this.field526 >= var5) {
                            return;
                        }
                        this.field526 = var6 - 1 - (var6 - 1 - this.field526) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method238(arg0, var9, var6, var10, var4.field3074[this.field530]);
                        if (this.field526 < var6) {
                            return;
                        }
                        this.field526 = (this.field526 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field525 > 0) {
                    if (this.field528) {
                        label130: {
                            if (this.field521 < 0) {
                                var9 = this.method213(arg0, arg1, var5, var10, var4.field3074[this.field530]);
                                if (this.field526 >= var5) {
                                    return;
                                }
                                this.field526 = var5 + var5 - 1 - this.field526;
                                this.field521 = -this.field521;
                                if (--this.field525 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method238(arg0, var9, var6, var10, var4.field3074[this.field527 - 1]);
                                if (this.field526 < var6) {
                                    return;
                                }
                                this.field526 = var6 + var6 - 1 - this.field526;
                                this.field521 = -this.field521;
                                if (--this.field525 == 0) {
                                    break;
                                }
                                var9 = this.method213(arg0, var9, var5, var10, var4.field3074[this.field530]);
                                if (this.field526 >= var5) {
                                    return;
                                }
                                this.field526 = var5 + var5 - 1 - this.field526;
                                this.field521 = -this.field521;
                            } while (--this.field525 != 0);
                        }
                    } else if (this.field521 < 0) {
                        while (true) {
                            var9 = this.method213(arg0, var9, var5, var10, var4.field3074[this.field527 - 1]);
                            if (this.field526 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field526) / var8;
                            if (var12 >= this.field525) {
                                this.field526 += this.field525 * var8;
                                this.field525 = 0;
                                break;
                            }
                            this.field526 += var8 * var12;
                            this.field525 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method238(arg0, var9, var6, var10, var4.field3074[this.field530]);
                            if (this.field526 < var6) {
                                return;
                            }
                            int var13 = (this.field526 - var5) / var8;
                            if (var13 >= this.field525) {
                                this.field526 -= this.field525 * var8;
                                this.field525 = 0;
                                break;
                            }
                            this.field526 -= var8 * var13;
                            this.field525 -= var13;
                        }
                    }
                }
                if (this.field521 < 0) {
                    this.method213(arg0, var9, 0, var10, 0);
                    if (this.field526 < 0) {
                        this.field526 = -1;
                        this.method210();
                        this.method1063(126);
                        return;
                    }
                } else {
                    this.method238(arg0, var9, var7, var10, 0);
                    if (this.field526 >= var7) {
                        this.field526 = var7;
                        this.method210();
                        this.method1063(119);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lqa;III)Lri;")
    public static final class34 method219(class167 arg0, int arg1, int arg2, int arg3) {
        return arg0.field3074 != null && arg0.field3074.length != 0 ? new class34(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "(II)I")
    private static final int method220(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!ri", name = "h", descriptor = "()V")
    private final void method221() {
        this.field523 = this.field517;
        this.field520 = method220(this.field517, this.field519);
        this.field516 = method214(this.field517, this.field519);
    }

    @OriginalMember(owner = "client!ri", name = "i", descriptor = "()I")
    public final synchronized int method222() {
        return this.field519 < 0 ? -1 : this.field519;
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(I[B[IIIIIIIILri;)I")
    private static final int method223(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class34 arg10) {
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
        arg10.field526 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(II[B[IIIIIIILri;II)I")
    private static final int method224(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class34 arg10, int arg11, int arg12) {
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
        arg10.field526 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(III)V")
    public final synchronized void method225(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method206(arg1, arg2);
        } else {
            int var4 = method220(arg1, arg2);
            int var5 = method214(arg1, arg2);
            if (this.field520 == var4 && this.field516 == var5) {
                this.field529 = 0;
            } else {
                int var6 = arg1 - this.field523;
                if (this.field523 - arg1 > var6) {
                    var6 = this.field523 - arg1;
                }
                if (var4 - this.field520 > var6) {
                    var6 = var4 - this.field520;
                }
                if (this.field520 - var4 > var6) {
                    var6 = this.field520 - var4;
                }
                if (var5 - this.field516 > var6) {
                    var6 = var5 - this.field516;
                }
                if (this.field516 - var5 > var6) {
                    var6 = this.field516 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field529 = arg0;
                this.field517 = arg1;
                this.field519 = arg2;
                this.field524 = (arg1 - this.field523) / arg0;
                this.field522 = (var4 - this.field520) / arg0;
                this.field518 = (var5 - this.field516) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!ri", name = "f", descriptor = "(I)V")
    public final synchronized void method226(int arg0) {
        this.method206(arg0 << 6, this.method222());
    }

    @OriginalMember(owner = "client!ri", name = "g", descriptor = "(I)V")
    public final synchronized void method227(int arg0) {
        if (this.field521 < 0) {
            this.field521 = -arg0;
        } else {
            this.field521 = arg0;
        }
    }

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "(II)V")
    public final synchronized void method228(int arg0, int arg1) {
        this.method225(arg0, arg1, this.method222());
    }

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "()Lge;")
    public final class148 method229() {
        return null;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lqa;II)Lri;")
    public static final class34 method230(class167 arg0, int arg1, int arg2) {
        return arg0.field3074 != null && arg0.field3074.length != 0 ? new class34(arg0, (int) ((long) arg0.field3075 * 256L * (long) arg1 / (long) (class255.field4454 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Z)V")
    public final synchronized void method231(boolean arg0) {
        this.field521 = (this.field521 >>> 31) + (this.field521 ^ this.field521 >> 31);
        if (arg0) {
            this.field521 = -this.field521;
        }
    }

    @OriginalMember(owner = "client!ri", name = "j", descriptor = "()Z")
    public final boolean method232() {
        return this.field529 != 0;
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "([B[IIIIIIIILri;)I")
    private static final int method233(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class34 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field520 += (var14 - arg3) * arg9.field522;
        arg9.field516 += (var14 - arg3) * arg9.field518;
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
        arg9.field523 = var12 >> 2;
        arg9.field526 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(II[B[IIIIIIILri;II)I")
    private static final int method234(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class34 arg10, int arg11, int arg12) {
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
        arg10.field526 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ri", name = "k", descriptor = "()Z")
    private final boolean method235() {
        int var1 = this.field517;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method220(var1, this.field519);
            var2 = method214(var1, this.field519);
        }
        if (this.field523 == var1 && this.field520 == var3 && this.field516 == var2) {
            if (this.field517 == Integer.MIN_VALUE) {
                this.field517 = 0;
                this.field523 = this.field520 = this.field516 = 0;
                this.method1063(117);
                return true;
            } else {
                this.method221();
                return false;
            }
        } else {
            if (this.field523 < var1) {
                this.field524 = 1;
                this.field529 = var1 - this.field523;
            } else if (this.field523 > var1) {
                this.field524 = -1;
                this.field529 = this.field523 - var1;
            } else {
                this.field524 = 0;
            }
            if (this.field520 < var3) {
                this.field522 = 1;
                if (this.field529 == 0 || this.field529 > var3 - this.field520) {
                    this.field529 = var3 - this.field520;
                }
            } else if (this.field520 > var3) {
                this.field522 = -1;
                if (this.field529 == 0 || this.field529 > this.field520 - var3) {
                    this.field529 = this.field520 - var3;
                }
            } else {
                this.field522 = 0;
            }
            if (this.field516 < var2) {
                this.field518 = 1;
                if (this.field529 == 0 || this.field529 > var2 - this.field516) {
                    this.field529 = var2 - this.field516;
                }
            } else if (this.field516 > var2) {
                this.field518 = -1;
                if (this.field529 == 0 || this.field529 > this.field516 - var2) {
                    this.field529 = this.field516 - var2;
                }
            } else {
                this.field518 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "()I")
    public final int method236() {
        int var1 = this.field523 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field525 == 0) {
            var2 -= this.field526 * var2 / (((class167) super.field2797).field3074.length << 8);
        } else if (this.field525 >= 0) {
            var2 -= this.field530 * var2 / ((class167) super.field2797).field3074.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!ri", name = "l", descriptor = "()I")
    public final synchronized int method237() {
        return this.field521 < 0 ? -this.field521 : this.field521;
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "([IIIII)I")
    private final int method238(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field529 <= 0) {
                if (this.field521 == 256 && (this.field526 & 255) == 0) {
                    if (class12.field187) {
                        return method201(0, ((class167) super.field2797).field3074, arg0, this.field526, arg1, this.field520, this.field516, 0, arg3, arg2, this);
                    }
                    return method215(((class167) super.field2797).field3074, arg0, this.field526, arg1, this.field523, 0, arg3, arg2, this);
                }
                if (class12.field187) {
                    return method241(0, 0, ((class167) super.field2797).field3074, arg0, this.field526, arg1, this.field520, this.field516, 0, arg3, arg2, this, this.field521, arg4);
                }
                return method224(0, 0, ((class167) super.field2797).field3074, arg0, this.field526, arg1, this.field523, 0, arg3, arg2, this, this.field521, arg4);
            }
            int var6 = this.field529 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field529 += arg1;
            if (this.field521 == 256 && (this.field526 & 255) == 0) {
                if (class12.field187) {
                    arg1 = method205(0, ((class167) super.field2797).field3074, arg0, this.field526, arg1, this.field520, this.field516, this.field522, this.field518, 0, var6, arg2, this);
                } else {
                    arg1 = method209(((class167) super.field2797).field3074, arg0, this.field526, arg1, this.field523, this.field524, 0, var6, arg2, this);
                }
            } else if (class12.field187) {
                arg1 = method240(0, 0, ((class167) super.field2797).field3074, arg0, this.field526, arg1, this.field520, this.field516, this.field522, this.field518, 0, var6, arg2, this, this.field521, arg4);
            } else {
                arg1 = method242(0, 0, ((class167) super.field2797).field3074, arg0, this.field526, arg1, this.field523, this.field524, 0, var6, arg2, this, this.field521, arg4);
            }
            this.field529 -= arg1;
            if (this.field529 != 0) {
                return arg1;
            }
        } while (!this.method235());
        return arg3;
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(II[B[IIIIIIIILri;II)I")
    private static final int method239(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class34 arg11, int arg12, int arg13) {
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
        arg11.field526 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(II[B[IIIIIIIIIILri;II)I")
    private static final int method240(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class34 arg13, int arg14, int arg15) {
        arg13.field523 -= arg13.field524 * arg5;
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
        arg13.field523 += arg13.field524 * var22;
        arg13.field520 = arg6;
        arg13.field516 = arg7;
        arg13.field526 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "(II[B[IIIIIIIILri;II)I")
    private static final int method241(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class34 arg11, int arg12, int arg13) {
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
        arg11.field526 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "(II[B[IIIIIIIILri;II)I")
    private static final int method242(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class34 arg11, int arg12, int arg13) {
        arg11.field520 -= arg11.field522 * arg5;
        arg11.field516 -= arg11.field518 * arg5;
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
        arg11.field520 += arg11.field522 * arg5;
        arg11.field516 += arg11.field518 * arg5;
        arg11.field523 = arg6;
        arg11.field526 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ri", name = "h", descriptor = "(I)V")
    public final synchronized void method243(int arg0) {
        int var2 = ((class167) super.field2797).field3074.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field526 = arg0;
    }

    @OriginalMember(owner = "client!ri", name = "i", descriptor = "(I)V")
    public final synchronized void method244(int arg0) {
        if (arg0 == 0) {
            this.method216(0);
            this.method1063(73);
        } else if (this.field520 == 0 && this.field516 == 0) {
            this.field529 = 0;
            this.field517 = 0;
            this.field523 = 0;
            this.method1063(100);
        } else {
            int var2 = -this.field523;
            if (this.field523 > var2) {
                var2 = this.field523;
            }
            if (-this.field520 > var2) {
                var2 = -this.field520;
            }
            if (this.field520 > var2) {
                var2 = this.field520;
            }
            if (-this.field516 > var2) {
                var2 = -this.field516;
            }
            if (this.field516 > var2) {
                var2 = this.field516;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field529 = arg0;
            this.field517 = Integer.MIN_VALUE;
            this.field524 = -this.field523 / arg0;
            this.field522 = -this.field520 / arg0;
            this.field518 = -this.field516 / arg0;
        }
    }

    @OriginalMember(owner = "client!ri", name = "<init>", descriptor = "(Lqa;II)V")
    private class34(class167 arg0, int arg1, int arg2) {
        super.field2797 = arg0;
        this.field530 = arg0.field3078;
        this.field527 = arg0.field3076;
        this.field528 = arg0.field3077;
        this.field521 = arg1;
        this.field517 = arg2;
        this.field519 = 8192;
        this.field526 = 0;
        this.method221();
    }

    @OriginalMember(owner = "client!ri", name = "<init>", descriptor = "(Lqa;III)V")
    private class34(class167 arg0, int arg1, int arg2, int arg3) {
        super.field2797 = arg0;
        this.field530 = arg0.field3078;
        this.field527 = arg0.field3076;
        this.field528 = arg0.field3077;
        this.field521 = arg1;
        this.field517 = arg2;
        this.field519 = arg3;
        this.field526 = 0;
        this.method221();
    }
}
