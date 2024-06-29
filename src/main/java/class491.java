import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class491 extends class232 {

    @OriginalMember(owner = "client!hl", name = "A", descriptor = "I")
    private int field6624;

    @OriginalMember(owner = "client!hl", name = "q", descriptor = "I")
    private int field6614;

    @OriginalMember(owner = "client!hl", name = "v", descriptor = "Z")
    private boolean field6619;

    @OriginalMember(owner = "client!hl", name = "r", descriptor = "I")
    private int field6615;

    @OriginalMember(owner = "client!hl", name = "x", descriptor = "I")
    private int field6621;

    @OriginalMember(owner = "client!hl", name = "o", descriptor = "I")
    private int field6612;

    @OriginalMember(owner = "client!hl", name = "y", descriptor = "I")
    private int field6622;

    @OriginalMember(owner = "client!hl", name = "n", descriptor = "I")
    private int field6611;

    @OriginalMember(owner = "client!hl", name = "p", descriptor = "I")
    private int field6613;

    @OriginalMember(owner = "client!hl", name = "s", descriptor = "I")
    private int field6616;

    @OriginalMember(owner = "client!hl", name = "t", descriptor = "I")
    private int field6617;

    @OriginalMember(owner = "client!hl", name = "u", descriptor = "I")
    private int field6618;

    @OriginalMember(owner = "client!hl", name = "w", descriptor = "I")
    private int field6620;

    @OriginalMember(owner = "client!hl", name = "z", descriptor = "I")
    private int field6623;

    @OriginalMember(owner = "client!hl", name = "B", descriptor = "I")
    private int field6625;

    @OriginalMember(owner = "client!hl", name = "e", descriptor = "()Z", line = 3)
    public final boolean method2725() {
        return this.field6622 < 0 || this.field6622 >= ((class53) super.field3022).field696.length << 8;
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(I)V", line = 6)
    public final synchronized void method2726(int arg0) {
        this.method2728(arg0 << 6, this.method2758());
    }

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "(I)V", line = 11)
    public final synchronized void method2727(int arg0) {
        int var2 = ((class53) super.field3022).field696.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field6622 = arg0;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(II)V", line = 22)
    private final synchronized void method2728(int arg0, int arg1) {
        this.field6621 = arg0;
        this.field6612 = arg1;
        this.field6613 = 0;
        this.method2754();
    }

    @OriginalMember(owner = "client!hl", name = "f", descriptor = "(I)V", line = 29)
    private final synchronized void method2729(int arg0) {
        this.method2728(arg0, this.method2758());
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Lmda;II)Lhl;", line = 33)
    public static final class491 method2730(class53 arg0, int arg1, int arg2) {
        return arg0.field696 != null && arg0.field696.length != 0 ? new class491(arg0, (int) ((long) arg0.field698 * 256L * (long) arg1 / (long) (class519.field7166 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "([IIIII)I", line = 41)
    private final int method2731(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field6613 <= 0) {
                if (this.field6615 == -256 && (this.field6622 & 255) == 0) {
                    if (class129.field1643) {
                        return method2734(0, ((class53) super.field3022).field696, arg0, this.field6622, arg1, this.field6617, this.field6623, 0, arg3, arg2, this);
                    }
                    return method2759(((class53) super.field3022).field696, arg0, this.field6622, arg1, this.field6620, 0, arg3, arg2, this);
                }
                if (class129.field1643) {
                    return method2738(0, 0, ((class53) super.field3022).field696, arg0, this.field6622, arg1, this.field6617, this.field6623, 0, arg3, arg2, this, this.field6615, arg4);
                }
                return method2750(0, 0, ((class53) super.field3022).field696, arg0, this.field6622, arg1, this.field6620, 0, arg3, arg2, this, this.field6615, arg4);
            }
            int var6 = this.field6613 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field6613 += arg1;
            if (this.field6615 == -256 && (this.field6622 & 255) == 0) {
                if (class129.field1643) {
                    arg1 = method2744(0, ((class53) super.field3022).field696, arg0, this.field6622, arg1, this.field6617, this.field6623, this.field6625, this.field6618, 0, var6, arg2, this);
                } else {
                    arg1 = method2733(((class53) super.field3022).field696, arg0, this.field6622, arg1, this.field6620, this.field6616, 0, var6, arg2, this);
                }
            } else if (class129.field1643) {
                arg1 = method2753(0, 0, ((class53) super.field3022).field696, arg0, this.field6622, arg1, this.field6617, this.field6623, this.field6625, this.field6618, 0, var6, arg2, this, this.field6615, arg4);
            } else {
                arg1 = method2757(0, 0, ((class53) super.field3022).field696, arg0, this.field6622, arg1, this.field6620, this.field6616, 0, var6, arg2, this, this.field6615, arg4);
            }
            this.field6613 -= arg1;
            if (this.field6613 != 0) {
                return arg1;
            }
        } while (!this.method2746());
        return arg3;
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(II)V", line = 96)
    public final synchronized void method2732(int arg0, int arg1) {
        this.method2752(arg0, arg1, this.method2758());
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "([B[IIIIIIIILhl;)I", line = 101)
    private static final int method2733(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class491 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field6617 += (var14 - arg3) * arg9.field6625;
        arg9.field6623 += (var14 - arg3) * arg9.field6618;
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
        arg9.field6620 = var12 >> 2;
        arg9.field6622 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(I[B[IIIIIIIILhl;)I", line = 135)
    private static final int method2734(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class491 arg10) {
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
        arg10.field6622 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(I[B[IIIIIIIILhl;)I", line = 174)
    private static final int method2735(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class491 arg10) {
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
        arg10.field6622 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "([IIIII)I", line = 213)
    private final int method2736(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field6613 <= 0) {
                if (this.field6615 == 256 && (this.field6622 & 255) == 0) {
                    if (class129.field1643) {
                        return method2735(0, ((class53) super.field3022).field696, arg0, this.field6622, arg1, this.field6617, this.field6623, 0, arg3, arg2, this);
                    }
                    return method2745(((class53) super.field3022).field696, arg0, this.field6622, arg1, this.field6620, 0, arg3, arg2, this);
                }
                if (class129.field1643) {
                    return method2748(0, 0, ((class53) super.field3022).field696, arg0, this.field6622, arg1, this.field6617, this.field6623, 0, arg3, arg2, this, this.field6615, arg4);
                }
                return method2747(0, 0, ((class53) super.field3022).field696, arg0, this.field6622, arg1, this.field6620, 0, arg3, arg2, this, this.field6615, arg4);
            }
            int var6 = this.field6613 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field6613 += arg1;
            if (this.field6615 == 256 && (this.field6622 & 255) == 0) {
                if (class129.field1643) {
                    arg1 = method2762(0, ((class53) super.field3022).field696, arg0, this.field6622, arg1, this.field6617, this.field6623, this.field6625, this.field6618, 0, var6, arg2, this);
                } else {
                    arg1 = method2756(((class53) super.field3022).field696, arg0, this.field6622, arg1, this.field6620, this.field6616, 0, var6, arg2, this);
                }
            } else if (class129.field1643) {
                arg1 = method2755(0, 0, ((class53) super.field3022).field696, arg0, this.field6622, arg1, this.field6617, this.field6623, this.field6625, this.field6618, 0, var6, arg2, this, this.field6615, arg4);
            } else {
                arg1 = method2763(0, 0, ((class53) super.field3022).field696, arg0, this.field6622, arg1, this.field6620, this.field6616, 0, var6, arg2, this, this.field6615, arg4);
            }
            this.field6613 -= arg1;
            if (this.field6613 != 0) {
                return arg1;
            }
        } while (!this.method2746());
        return arg3;
    }

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "(II)I", line = 268)
    private static final int method2737(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(II[B[IIIIIIIILhl;II)I", line = 271)
    private static final int method2738(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class491 arg11, int arg12, int arg13) {
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
        arg11.field6622 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!hl", name = "d", descriptor = "(II)I", line = 304)
    private static final int method2739(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!hl", name = "f", descriptor = "()Z", line = 307)
    public final boolean method2740() {
        return this.field6613 != 0;
    }

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "()I", line = 312)
    public final int method1429() {
        int var1 = this.field6620 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field6611 == 0) {
            var2 -= this.field6622 * var2 / (((class53) super.field3022).field696.length << 8);
        } else if (this.field6611 >= 0) {
            var2 -= this.field6624 * var2 / ((class53) super.field3022).field696.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "()Lwi;", line = 324)
    public final class232 method322() {
        return null;
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "([III)V", line = 330)
    public final synchronized void method312(int[] arg0, int arg1, int arg2) {
        if (this.field6621 == 0 && this.field6613 == 0) {
            this.method305(arg2);
        } else {
            class53 var4 = (class53) super.field3022;
            int var5 = this.field6624 << 8;
            int var6 = this.field6614 << 8;
            int var7 = var4.field696.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field6611 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field6622 < 0) {
                if (this.field6615 <= 0) {
                    this.method2742();
                    this.method175(30604);
                    return;
                }
                this.field6622 = 0;
            }
            if (this.field6622 >= var7) {
                if (this.field6615 >= 0) {
                    this.method2742();
                    this.method175(30604);
                    return;
                }
                this.field6622 = var7 - 1;
            }
            if (this.field6611 < 0) {
                if (this.field6619) {
                    if (this.field6615 < 0) {
                        var9 = this.method2731(arg0, arg1, var5, var10, var4.field696[this.field6624]);
                        if (this.field6622 >= var5) {
                            return;
                        }
                        this.field6622 = var5 + var5 - 1 - this.field6622;
                        this.field6615 = -this.field6615;
                    }
                    while (true) {
                        int var11 = this.method2736(arg0, var9, var6, var10, var4.field696[this.field6614 - 1]);
                        if (this.field6622 < var6) {
                            return;
                        }
                        this.field6622 = var6 + var6 - 1 - this.field6622;
                        this.field6615 = -this.field6615;
                        var9 = this.method2731(arg0, var11, var5, var10, var4.field696[this.field6624]);
                        if (this.field6622 >= var5) {
                            return;
                        }
                        this.field6622 = var5 + var5 - 1 - this.field6622;
                        this.field6615 = -this.field6615;
                    }
                } else if (this.field6615 < 0) {
                    while (true) {
                        var9 = this.method2731(arg0, var9, var5, var10, var4.field696[this.field6614 - 1]);
                        if (this.field6622 >= var5) {
                            return;
                        }
                        this.field6622 = var6 - 1 - (var6 - 1 - this.field6622) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method2736(arg0, var9, var6, var10, var4.field696[this.field6624]);
                        if (this.field6622 < var6) {
                            return;
                        }
                        this.field6622 = (this.field6622 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field6611 > 0) {
                    if (this.field6619) {
                        label130: {
                            if (this.field6615 < 0) {
                                var9 = this.method2731(arg0, arg1, var5, var10, var4.field696[this.field6624]);
                                if (this.field6622 >= var5) {
                                    return;
                                }
                                this.field6622 = var5 + var5 - 1 - this.field6622;
                                this.field6615 = -this.field6615;
                                if (--this.field6611 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method2736(arg0, var9, var6, var10, var4.field696[this.field6614 - 1]);
                                if (this.field6622 < var6) {
                                    return;
                                }
                                this.field6622 = var6 + var6 - 1 - this.field6622;
                                this.field6615 = -this.field6615;
                                if (--this.field6611 == 0) {
                                    break;
                                }
                                var9 = this.method2731(arg0, var9, var5, var10, var4.field696[this.field6624]);
                                if (this.field6622 >= var5) {
                                    return;
                                }
                                this.field6622 = var5 + var5 - 1 - this.field6622;
                                this.field6615 = -this.field6615;
                            } while (--this.field6611 != 0);
                        }
                    } else if (this.field6615 < 0) {
                        while (true) {
                            var9 = this.method2731(arg0, var9, var5, var10, var4.field696[this.field6614 - 1]);
                            if (this.field6622 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field6622) / var8;
                            if (var12 >= this.field6611) {
                                this.field6622 += this.field6611 * var8;
                                this.field6611 = 0;
                                break;
                            }
                            this.field6622 += var8 * var12;
                            this.field6611 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method2736(arg0, var9, var6, var10, var4.field696[this.field6624]);
                            if (this.field6622 < var6) {
                                return;
                            }
                            int var13 = (this.field6622 - var5) / var8;
                            if (var13 >= this.field6611) {
                                this.field6622 -= this.field6611 * var8;
                                this.field6611 = 0;
                                break;
                            }
                            this.field6622 -= var8 * var13;
                            this.field6611 -= var13;
                        }
                    }
                }
                if (this.field6615 < 0) {
                    this.method2731(arg0, var9, 0, var10, 0);
                    if (this.field6622 < 0) {
                        this.field6622 = -1;
                        this.method2742();
                        this.method175(30604);
                        return;
                    }
                } else {
                    this.method2736(arg0, var9, var7, var10, 0);
                    if (this.field6622 >= var7) {
                        this.field6622 = var7;
                        this.method2742();
                        this.method175(30604);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hl", name = "g", descriptor = "(I)V", line = 567)
    public final synchronized void method2741(int arg0) {
        if (arg0 == 0) {
            this.method2729(0);
            this.method175(30604);
        } else if (this.field6617 == 0 && this.field6623 == 0) {
            this.field6613 = 0;
            this.field6621 = 0;
            this.field6620 = 0;
            this.method175(30604);
        } else {
            int var2 = -this.field6620;
            if (this.field6620 > var2) {
                var2 = this.field6620;
            }
            if (-this.field6617 > var2) {
                var2 = -this.field6617;
            }
            if (this.field6617 > var2) {
                var2 = this.field6617;
            }
            if (-this.field6623 > var2) {
                var2 = -this.field6623;
            }
            if (this.field6623 > var2) {
                var2 = this.field6623;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field6613 = arg0;
            this.field6621 = Integer.MIN_VALUE;
            this.field6616 = -this.field6620 / arg0;
            this.field6625 = -this.field6617 / arg0;
            this.field6618 = -this.field6623 / arg0;
        }
    }

    @OriginalMember(owner = "client!hl", name = "g", descriptor = "()V", line = 612)
    private final void method2742() {
        if (this.field6613 != 0) {
            if (this.field6621 == Integer.MIN_VALUE) {
                this.field6621 = 0;
            }
            this.field6613 = 0;
            this.method2754();
        }
    }

    @OriginalMember(owner = "client!hl", name = "d", descriptor = "()Lwi;", line = 626)
    public final class232 method304() {
        return null;
    }

    @OriginalMember(owner = "client!hl", name = "h", descriptor = "(I)V", line = 629)
    public final synchronized void method2743(int arg0) {
        if (this.field6615 < 0) {
            this.field6615 = -arg0;
        } else {
            this.field6615 = arg0;
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(I[B[IIIIIIIIIILhl;)I", line = 636)
    private static final int method2744(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class491 arg12) {
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
        arg12.field6620 += (var19 - arg4) * arg12.field6616;
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
        arg12.field6617 = var15 >> 2;
        arg12.field6623 = var16 >> 2;
        arg12.field6622 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "([B[IIIIIIILhl;)I", line = 690)
    private static final int method2745(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class491 arg8) {
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
        arg8.field6622 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!hl", name = "h", descriptor = "()Z", line = 716)
    private final boolean method2746() {
        int var1 = this.field6621;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method2737(var1, this.field6612);
            var2 = method2739(var1, this.field6612);
        }
        if (this.field6620 == var1 && this.field6617 == var3 && this.field6623 == var2) {
            if (this.field6621 == Integer.MIN_VALUE) {
                this.field6621 = 0;
                this.field6620 = this.field6617 = this.field6623 = 0;
                this.method175(30604);
                return true;
            } else {
                this.method2754();
                return false;
            }
        } else {
            if (this.field6620 < var1) {
                this.field6616 = 1;
                this.field6613 = var1 - this.field6620;
            } else if (this.field6620 > var1) {
                this.field6616 = -1;
                this.field6613 = this.field6620 - var1;
            } else {
                this.field6616 = 0;
            }
            if (this.field6617 < var3) {
                this.field6625 = 1;
                if (this.field6613 == 0 || this.field6613 > var3 - this.field6617) {
                    this.field6613 = var3 - this.field6617;
                }
            } else if (this.field6617 > var3) {
                this.field6625 = -1;
                if (this.field6613 == 0 || this.field6613 > this.field6617 - var3) {
                    this.field6613 = this.field6617 - var3;
                }
            } else {
                this.field6625 = 0;
            }
            if (this.field6623 < var2) {
                this.field6618 = 1;
                if (this.field6613 == 0 || this.field6613 > var2 - this.field6623) {
                    this.field6613 = var2 - this.field6623;
                }
            } else if (this.field6623 > var2) {
                this.field6618 = -1;
                if (this.field6613 == 0 || this.field6613 > this.field6623 - var2) {
                    this.field6613 = this.field6623 - var2;
                }
            } else {
                this.field6618 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(I)V", line = 802)
    public final synchronized void method305(int arg0) {
        if (this.field6613 > 0) {
            if (arg0 >= this.field6613) {
                if (this.field6621 == Integer.MIN_VALUE) {
                    this.field6621 = 0;
                    this.field6620 = this.field6617 = this.field6623 = 0;
                    this.method175(30604);
                    arg0 = this.field6613;
                }
                this.field6613 = 0;
                this.method2754();
            } else {
                this.field6620 += this.field6616 * arg0;
                this.field6617 += this.field6625 * arg0;
                this.field6623 += this.field6618 * arg0;
                this.field6613 -= arg0;
            }
        }
        class53 var2 = (class53) super.field3022;
        int var3 = this.field6624 << 8;
        int var4 = this.field6614 << 8;
        int var5 = var2.field696.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field6611 = 0;
        }
        if (this.field6622 < 0) {
            if (this.field6615 <= 0) {
                this.method2742();
                this.method175(30604);
                return;
            }
            this.field6622 = 0;
        }
        if (this.field6622 >= var5) {
            if (this.field6615 >= 0) {
                this.method2742();
                this.method175(30604);
                return;
            }
            this.field6622 = var5 - 1;
        }
        this.field6622 += this.field6615 * arg0;
        if (this.field6611 < 0) {
            if (!this.field6619) {
                if (this.field6615 < 0) {
                    if (this.field6622 < var3) {
                        this.field6622 = var4 - 1 - (var4 - 1 - this.field6622) % var6;
                    }
                } else if (this.field6622 >= var4) {
                    this.field6622 = (this.field6622 - var3) % var6 + var3;
                }
            } else {
                if (this.field6615 < 0) {
                    if (this.field6622 >= var3) {
                        return;
                    }
                    this.field6622 = var3 + var3 - 1 - this.field6622;
                    this.field6615 = -this.field6615;
                }
                while (this.field6622 >= var4) {
                    this.field6622 = var4 + var4 - 1 - this.field6622;
                    this.field6615 = -this.field6615;
                    if (this.field6622 >= var3) {
                        return;
                    }
                    this.field6622 = var3 + var3 - 1 - this.field6622;
                    this.field6615 = -this.field6615;
                }
            }
        } else {
            if (this.field6611 > 0) {
                if (this.field6619) {
                    label125: {
                        if (this.field6615 < 0) {
                            if (this.field6622 >= var3) {
                                return;
                            }
                            this.field6622 = var3 + var3 - 1 - this.field6622;
                            this.field6615 = -this.field6615;
                            if (--this.field6611 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field6622 < var4) {
                                return;
                            }
                            this.field6622 = var4 + var4 - 1 - this.field6622;
                            this.field6615 = -this.field6615;
                            if (--this.field6611 == 0) {
                                break;
                            }
                            if (this.field6622 >= var3) {
                                return;
                            }
                            this.field6622 = var3 + var3 - 1 - this.field6622;
                            this.field6615 = -this.field6615;
                        } while (--this.field6611 != 0);
                    }
                } else if (this.field6615 < 0) {
                    if (this.field6622 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field6622) / var6;
                    if (var7 < this.field6611) {
                        this.field6622 += var6 * var7;
                        this.field6611 -= var7;
                        return;
                    }
                    this.field6622 += this.field6611 * var6;
                    this.field6611 = 0;
                } else {
                    if (this.field6622 < var4) {
                        return;
                    }
                    int var8 = (this.field6622 - var3) / var6;
                    if (var8 < this.field6611) {
                        this.field6622 -= var6 * var8;
                        this.field6611 -= var8;
                        return;
                    }
                    this.field6622 -= this.field6611 * var6;
                    this.field6611 = 0;
                }
            }
            if (this.field6615 < 0) {
                if (this.field6622 < 0) {
                    this.field6622 = -1;
                    this.method2742();
                    this.method175(30604);
                    return;
                }
            } else if (this.field6622 >= var5) {
                this.field6622 = var5;
                this.method2742();
                this.method175(30604);
            }
        }
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "()I", line = 1022)
    public final int method332() {
        return this.field6621 == 0 && this.field6613 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(II[B[IIIIIIILhl;II)I", line = 1029)
    private static final int method2747(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class491 arg10, int arg11, int arg12) {
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
        arg10.field6622 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(II[B[IIIIIIIILhl;II)I", line = 1055)
    private static final int method2748(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class491 arg11, int arg12, int arg13) {
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
        arg11.field6622 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!hl", name = "i", descriptor = "()I", line = 1088)
    public final synchronized int method2749() {
        return this.field6621 == Integer.MIN_VALUE ? 0 : this.field6621;
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(II[B[IIIIIIILhl;II)I", line = 1091)
    private static final int method2750(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class491 arg10, int arg11, int arg12) {
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
        arg10.field6622 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Z)V", line = 1118)
    public final synchronized void method2751(boolean arg0) {
        this.field6615 = (this.field6615 >>> 31) + (this.field6615 ^ this.field6615 >> 31);
        if (arg0) {
            this.field6615 = -this.field6615;
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(III)V", line = 1124)
    public final synchronized void method2752(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method2728(arg1, arg2);
        } else {
            int var4 = method2737(arg1, arg2);
            int var5 = method2739(arg1, arg2);
            if (this.field6617 == var4 && this.field6623 == var5) {
                this.field6613 = 0;
            } else {
                int var6 = arg1 - this.field6620;
                if (this.field6620 - arg1 > var6) {
                    var6 = this.field6620 - arg1;
                }
                if (var4 - this.field6617 > var6) {
                    var6 = var4 - this.field6617;
                }
                if (this.field6617 - var4 > var6) {
                    var6 = this.field6617 - var4;
                }
                if (var5 - this.field6623 > var6) {
                    var6 = var5 - this.field6623;
                }
                if (this.field6623 - var5 > var6) {
                    var6 = this.field6623 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field6613 = arg0;
                this.field6621 = arg1;
                this.field6612 = arg2;
                this.field6616 = (arg1 - this.field6620) / arg0;
                this.field6625 = (var4 - this.field6617) / arg0;
                this.field6618 = (var5 - this.field6623) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(II[B[IIIIIIIIIILhl;II)I", line = 1171)
    private static final int method2753(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class491 arg13, int arg14, int arg15) {
        arg13.field6620 -= arg13.field6616 * arg5;
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
        arg13.field6620 += arg13.field6616 * var22;
        arg13.field6617 = arg6;
        arg13.field6623 = arg7;
        arg13.field6622 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!hl", name = "j", descriptor = "()V", line = 1212)
    private final void method2754() {
        this.field6620 = this.field6621;
        this.field6617 = method2737(this.field6621, this.field6612);
        this.field6623 = method2739(this.field6621, this.field6612);
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(II[B[IIIIIIIIIILhl;II)I", line = 1217)
    private static final int method2755(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class491 arg13, int arg14, int arg15) {
        arg13.field6620 -= arg13.field6616 * arg5;
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
        arg13.field6620 += arg13.field6616 * var22;
        arg13.field6617 = arg6;
        arg13.field6623 = arg7;
        arg13.field6622 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "([B[IIIIIIIILhl;)I", line = 1259)
    private static final int method2756(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class491 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field6617 += (var14 - arg3) * arg9.field6625;
        arg9.field6623 += (var14 - arg3) * arg9.field6618;
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
        arg9.field6620 = var12 >> 2;
        arg9.field6622 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "(II[B[IIIIIIIILhl;II)I", line = 1297)
    private static final int method2757(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class491 arg11, int arg12, int arg13) {
        arg11.field6617 -= arg11.field6625 * arg5;
        arg11.field6623 -= arg11.field6618 * arg5;
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
        arg11.field6617 += arg11.field6625 * arg5;
        arg11.field6623 += arg11.field6618 * arg5;
        arg11.field6620 = arg6;
        arg11.field6622 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!hl", name = "k", descriptor = "()I", line = 1330)
    public final synchronized int method2758() {
        return this.field6612 < 0 ? -1 : this.field6612;
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "([B[IIIIIIILhl;)I", line = 1334)
    private static final int method2759(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class491 arg8) {
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
        arg8.field6622 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!hl", name = "i", descriptor = "(I)V", line = 1359)
    public final synchronized void method2760(int arg0) {
        this.field6611 = arg0;
    }

    @OriginalMember(owner = "client!hl", name = "l", descriptor = "()I", line = 1363)
    public final synchronized int method2761() {
        return this.field6615 < 0 ? -this.field6615 : this.field6615;
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(I[B[IIIIIIIIIILhl;)I", line = 1366)
    private static final int method2762(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class491 arg12) {
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
        arg12.field6620 += (var19 - arg4) * arg12.field6616;
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
        arg12.field6617 = var15 >> 2;
        arg12.field6623 = var16 >> 2;
        arg12.field6622 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!hl", name = "d", descriptor = "(II[B[IIIIIIIILhl;II)I", line = 1420)
    private static final int method2763(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class491 arg11, int arg12, int arg13) {
        arg11.field6617 -= arg11.field6625 * arg5;
        arg11.field6623 -= arg11.field6618 * arg5;
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
        arg11.field6617 += arg11.field6625 * arg5;
        arg11.field6623 += arg11.field6618 * arg5;
        arg11.field6620 = arg6;
        arg11.field6622 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(Lmda;II)V", line = 1452)
    private class491(class53 arg0, int arg1, int arg2) {
        super.field3022 = arg0;
        this.field6624 = arg0.field697;
        this.field6614 = arg0.field700;
        this.field6619 = arg0.field699;
        this.field6615 = arg1;
        this.field6621 = arg2;
        this.field6612 = 8192;
        this.field6622 = 0;
        this.method2754();
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Lmda;III)Lhl;", line = 1464)
    public static final class491 method2764(class53 arg0, int arg1, int arg2, int arg3) {
        return arg0.field696 != null && arg0.field696.length != 0 ? new class491(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(Lmda;III)V", line = 1469)
    private class491(class53 arg0, int arg1, int arg2, int arg3) {
        super.field3022 = arg0;
        this.field6624 = arg0.field697;
        this.field6614 = arg0.field700;
        this.field6619 = arg0.field699;
        this.field6615 = arg1;
        this.field6621 = arg2;
        this.field6612 = arg3;
        this.field6622 = 0;
        this.method2754();
    }
}
