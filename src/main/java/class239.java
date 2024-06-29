import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class239 extends class278 {

    @OriginalMember(owner = "client!nl", name = "s", descriptor = "I")
    private int field4150;

    @OriginalMember(owner = "client!nl", name = "A", descriptor = "I")
    private int field4158;

    @OriginalMember(owner = "client!nl", name = "B", descriptor = "Z")
    private boolean field4159;

    @OriginalMember(owner = "client!nl", name = "y", descriptor = "I")
    private int field4156;

    @OriginalMember(owner = "client!nl", name = "z", descriptor = "I")
    private int field4157;

    @OriginalMember(owner = "client!nl", name = "u", descriptor = "I")
    private int field4152;

    @OriginalMember(owner = "client!nl", name = "q", descriptor = "I")
    private int field4148;

    @OriginalMember(owner = "client!nl", name = "r", descriptor = "I")
    private int field4149;

    @OriginalMember(owner = "client!nl", name = "t", descriptor = "I")
    private int field4151;

    @OriginalMember(owner = "client!nl", name = "v", descriptor = "I")
    private int field4153;

    @OriginalMember(owner = "client!nl", name = "w", descriptor = "I")
    private int field4154;

    @OriginalMember(owner = "client!nl", name = "x", descriptor = "I")
    private int field4155;

    @OriginalMember(owner = "client!nl", name = "C", descriptor = "I")
    private int field4160;

    @OriginalMember(owner = "client!nl", name = "E", descriptor = "I")
    private int field4161;

    @OriginalMember(owner = "client!nl", name = "F", descriptor = "I")
    private int field4162;

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "(I)V", line = 4)
    public final synchronized void method883(int arg0) {
        if (this.field4155 > 0) {
            if (arg0 >= this.field4155) {
                if (this.field4157 == Integer.MIN_VALUE) {
                    this.field4157 = 0;
                    this.field4162 = this.field4161 = this.field4153 = 0;
                    this.method961((byte) 84);
                    arg0 = this.field4155;
                }
                this.field4155 = 0;
                this.method1693();
            } else {
                this.field4162 += this.field4160 * arg0;
                this.field4161 += this.field4151 * arg0;
                this.field4153 += this.field4154 * arg0;
                this.field4155 -= arg0;
            }
        }
        class154 var2 = (class154) this.field4669;
        int var3 = this.field4150 << 8;
        int var4 = this.field4158 << 8;
        int var5 = var2.field2648.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field4149 = 0;
        }
        if (this.field4148 < 0) {
            if (this.field4156 <= 0) {
                this.method1714();
                this.method961((byte) 126);
                return;
            }
            this.field4148 = 0;
        }
        if (this.field4148 >= var5) {
            if (this.field4156 >= 0) {
                this.method1714();
                this.method961((byte) 57);
                return;
            }
            this.field4148 = var5 - 1;
        }
        this.field4148 += this.field4156 * arg0;
        if (this.field4149 >= 0) {
            if (this.field4149 > 0) {
                if (this.field4159) {
                    label121: {
                        if (this.field4156 < 0) {
                            if (this.field4148 >= var3) {
                                return;
                            }
                            this.field4148 = var3 + var3 - this.field4148 - 1;
                            this.field4156 = -this.field4156;
                            if (--this.field4149 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field4148 < var4) {
                                return;
                            }
                            this.field4148 = var4 + var4 - this.field4148 - 1;
                            this.field4156 = -this.field4156;
                            if (--this.field4149 == 0) {
                                break;
                            }
                            if (this.field4148 >= var3) {
                                return;
                            }
                            this.field4148 = var3 + var3 - this.field4148 - 1;
                            this.field4156 = -this.field4156;
                        } while (--this.field4149 != 0);
                    }
                } else {
                    label153: {
                        if (this.field4156 < 0) {
                            if (this.field4148 >= var3) {
                                return;
                            }
                            int var7 = (var4 - this.field4148 - 1) / var6;
                            if (var7 >= this.field4149) {
                                this.field4148 += this.field4149 * var6;
                                this.field4149 = 0;
                                break label153;
                            }
                            this.field4148 += var6 * var7;
                            this.field4149 -= var7;
                        } else if (this.field4148 >= var4) {
                            int var8 = (this.field4148 - var3) / var6;
                            if (var8 >= this.field4149) {
                                this.field4148 -= this.field4149 * var6;
                                this.field4149 = 0;
                                break label153;
                            }
                            this.field4148 -= var6 * var8;
                            this.field4149 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field4156 < 0) {
                if (this.field4148 < 0) {
                    this.field4148 = -1;
                    this.method1714();
                    this.method961((byte) 121);
                }
            } else if (this.field4148 >= var5) {
                this.field4148 = var5;
                this.method1714();
                this.method961((byte) 120);
            }
        } else if (this.field4159) {
            if (this.field4156 < 0) {
                if (this.field4148 >= var3) {
                    return;
                }
                this.field4148 = var3 + var3 - this.field4148 - 1;
                this.field4156 = -this.field4156;
            }
            while (this.field4148 >= var4) {
                this.field4148 = var4 + var4 - this.field4148 - 1;
                this.field4156 = -this.field4156;
                if (this.field4148 >= var3) {
                    return;
                }
                this.field4148 = var3 + var3 - this.field4148 - 1;
                this.field4156 = -this.field4156;
            }
        } else if (this.field4156 < 0) {
            if (this.field4148 >= var3) {
                return;
            }
            this.field4148 = var4 - (var4 - 1 - this.field4148) % var6 - 1;
        } else if (this.field4148 >= var4) {
            this.field4148 = (this.field4148 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(I[B[IIIIIIIILnl;)I", line = 222)
    private static final int method1683(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class239 arg10) {
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
            byte var18 = arg1[var11--];
            int var24 = var16++;
            arg2[var24] += var13 * var18;
            int var25 = var16++;
            arg2[var25] += var14 * var18;
            byte var19 = arg1[var11--];
            int var27 = var16++;
            arg2[var27] += var13 * var19;
            int var28 = var16++;
            arg2[var28] += var14 * var19;
            byte var20 = arg1[var11--];
            int var30 = var16++;
            arg2[var30] += var13 * var20;
            int var31 = var16++;
            arg2[var31] += var14 * var20;
            byte var21 = arg1[var11--];
            int var33 = var16++;
            arg2[var33] += var13 * var21;
            int var34 = var16++;
            arg2[var34] += var14 * var21;
        }
        var17 = var23 + 6;
        while (var16 < var17) {
            byte var22 = arg1[var11--];
            int var10001 = var16++;
            arg2[var10001] += var13 * var22;
            int var35 = var16++;
            arg2[var35] += var14 * var22;
        }
        arg10.field4148 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(II[B[IIIIIIIILnl;II)I", line = 263)
    private static final int method1684(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class239 arg11, int arg12, int arg13) {
        arg11.field4161 -= arg11.field4151 * arg5;
        arg11.field4153 -= arg11.field4154 * arg5;
        int var14;
        if (arg12 == 0 || (var14 = (arg10 + arg12 - arg4 - 257) / arg12 + arg5) > arg9) {
            var14 = arg9;
        }
        int var10001;
        while (arg5 < var14) {
            int var15 = arg4 >> 8;
            byte var16 = arg2[var15];
            var10001 = arg5++;
            arg3[var10001] += ((var16 << 8) + (arg4 & 0xFF) * (arg2[var15 + 1] - var16)) * arg6 >> 6;
            arg6 += arg7;
            arg4 += arg12;
        }
        int var17;
        if (arg12 == 0 || (var17 = (arg10 + arg12 - arg4 - 1) / arg12 + arg5) > arg9) {
            var17 = arg9;
        }
        int var18 = arg13;
        while (arg5 < var17) {
            byte var19 = arg2[arg4 >> 8];
            var10001 = arg5++;
            arg3[var10001] += ((var19 << 8) + (arg4 & 0xFF) * (var18 - var19)) * arg6 >> 6;
            arg6 += arg7;
            arg4 += arg12;
        }
        arg11.field4161 += arg11.field4151 * arg5;
        arg11.field4153 += arg11.field4154 * arg5;
        arg11.field4162 = arg6;
        arg11.field4148 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!nl", name = "e", descriptor = "()I", line = 298)
    public final synchronized int method1685() {
        return this.field4156 < 0 ? -this.field4156 : this.field4156;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "()I", line = 301)
    public final int method878() {
        return this.field4157 == 0 && this.field4155 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(I[B[IIIIIIIILnl;)I", line = 310)
    private static final int method1686(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class239 arg10) {
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
            byte var18 = arg1[var11++];
            int var24 = var16++;
            arg2[var24] += var13 * var18;
            int var25 = var16++;
            arg2[var25] += var14 * var18;
            byte var19 = arg1[var11++];
            int var27 = var16++;
            arg2[var27] += var13 * var19;
            int var28 = var16++;
            arg2[var28] += var14 * var19;
            byte var20 = arg1[var11++];
            int var30 = var16++;
            arg2[var30] += var13 * var20;
            int var31 = var16++;
            arg2[var31] += var14 * var20;
            byte var21 = arg1[var11++];
            int var33 = var16++;
            arg2[var33] += var13 * var21;
            int var34 = var16++;
            arg2[var34] += var14 * var21;
        }
        var17 = var23 + 6;
        while (var16 < var17) {
            byte var22 = arg1[var11++];
            int var10001 = var16++;
            arg2[var10001] += var13 * var22;
            int var35 = var16++;
            arg2[var35] += var14 * var22;
        }
        arg10.field4148 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(II[B[IIIIIIIIIILnl;II)I", line = 353)
    private static final int method1687(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class239 arg13, int arg14, int arg15) {
        arg13.field4162 -= arg13.field4160 * arg5;
        int var16;
        if (arg14 == 0 || (var16 = (arg12 + arg14 + 256 - arg4) / arg14 + arg5) > arg11) {
            var16 = arg11;
        }
        int var17 = arg5 << 1;
        int var18 = var16 << 1;
        int var10001;
        while (var17 < var18) {
            int var19 = arg4 >> 8;
            byte var20 = arg2[var19 - 1];
            int var21 = (var20 << 8) + (arg4 & 0xFF) * (arg2[var19] - var20);
            var10001 = var17++;
            arg3[var10001] += arg6 * var21 >> 6;
            arg6 += arg8;
            int var27 = var17++;
            arg3[var27] += arg7 * var21 >> 6;
            arg7 += arg9;
            arg4 += arg14;
        }
        int var22;
        if (arg14 == 0 || (var22 = (var17 >> 1) + (arg12 + arg14 - arg4) / arg14) > arg11) {
            var22 = arg11;
        }
        int var23 = var22 << 1;
        int var24 = arg15;
        while (var17 < var23) {
            int var25 = (var24 << 8) + (arg4 & 0xFF) * (arg2[arg4 >> 8] - var24);
            var10001 = var17++;
            arg3[var10001] += arg6 * var25 >> 6;
            arg6 += arg8;
            var10001 = var17++;
            arg3[var10001] += arg7 * var25 >> 6;
            arg7 += arg9;
            arg4 += arg14;
        }
        int var26 = var17 >> 1;
        arg13.field4162 += arg13.field4160 * var26;
        arg13.field4161 = arg6;
        arg13.field4153 = arg7;
        arg13.field4148 = arg4;
        return var26;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(I[B[IIIIIIIIIILnl;)I", line = 394)
    private static final int method1688(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class239 arg12) {
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
        arg12.field4162 += (var19 - arg4) * arg12.field4160;
        int var20 = arg4 << 1;
        int var21 = var19 << 1;
        int var44 = var21 - 6;
        while (var20 < var44) {
            byte var22 = arg1[var13--];
            int var33 = var20++;
            arg2[var33] += var15 * var22;
            int var23 = var15 + var17;
            int var34 = var20++;
            arg2[var34] += var16 * var22;
            int var24 = var16 + var18;
            byte var25 = arg1[var13--];
            int var36 = var20++;
            arg2[var36] += var23 * var25;
            int var26 = var17 + var23;
            int var37 = var20++;
            arg2[var37] += var24 * var25;
            int var27 = var18 + var24;
            byte var28 = arg1[var13--];
            int var39 = var20++;
            arg2[var39] += var26 * var28;
            int var29 = var17 + var26;
            int var40 = var20++;
            arg2[var40] += var27 * var28;
            int var30 = var18 + var27;
            byte var31 = arg1[var13--];
            int var42 = var20++;
            arg2[var42] += var29 * var31;
            var15 = var17 + var29;
            int var43 = var20++;
            arg2[var43] += var30 * var31;
            var16 = var18 + var30;
        }
        var21 = var44 + 6;
        while (var20 < var21) {
            byte var32 = arg1[var13--];
            int var10001 = var20++;
            arg2[var10001] += var15 * var32;
            var15 += var17;
            int var45 = var20++;
            arg2[var45] += var16 * var32;
            var16 += var18;
        }
        arg12.field4161 = var15 >> 2;
        arg12.field4153 = var16 >> 2;
        arg12.field4148 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "([B[IIIIIIIILnl;)I", line = 448)
    private static final int method1689(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class239 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field4161 += (var14 - arg3) * arg9.field4151;
        arg9.field4153 += (var14 - arg3) * arg9.field4154;
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
        arg9.field4162 = var12 >> 2;
        arg9.field4148 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!nl", name = "d", descriptor = "(I)V", line = 483)
    public final synchronized void method1690(int arg0) {
        int var2 = ((class154) this.field4669).field2648.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field4148 = arg0;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(II[B[IIIIIIILnl;II)I", line = 493)
    private static final int method1691(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class239 arg10, int arg11, int arg12) {
        int var13;
        if (arg11 == 0 || (var13 = (arg9 + arg11 + 256 - arg4) / arg11 + arg5) > arg8) {
            var13 = arg8;
        }
        int var10001;
        while (arg5 < var13) {
            int var14 = arg4 >> 8;
            byte var15 = arg2[var14 - 1];
            var10001 = arg5++;
            arg3[var10001] += ((var15 << 8) + (arg4 & 0xFF) * (arg2[var14] - var15)) * arg6 >> 6;
            arg4 += arg11;
        }
        int var16;
        if (arg11 == 0 || (var16 = (arg9 + arg11 - arg4) / arg11 + arg5) > arg8) {
            var16 = arg8;
        }
        int var17 = arg12;
        int var18 = arg11;
        while (arg5 < var16) {
            var10001 = arg5++;
            arg3[var10001] += ((var17 << 8) + (arg4 & 0xFF) * (arg2[arg4 >> 8] - var17)) * arg6 >> 6;
            arg4 += var18;
        }
        arg10.field4148 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!nl", name = "f", descriptor = "()I", line = 519)
    public final synchronized int method1692() {
        return this.field4157 == Integer.MIN_VALUE ? 0 : this.field4157;
    }

    @OriginalMember(owner = "client!nl", name = "g", descriptor = "()V", line = 522)
    private final void method1693() {
        this.field4162 = this.field4157;
        this.field4161 = method1696(this.field4157, this.field4152);
        this.field4153 = method1716(this.field4157, this.field4152);
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "([B[IIIIIIILnl;)I", line = 528)
    private static final int method1694(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class239 arg8) {
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
        arg8.field4148 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!nl", name = "d", descriptor = "()I", line = 555)
    public final int method1695() {
        int var1 = this.field4162 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field4149 == 0) {
            var2 -= this.field4148 * var2 / (((class154) this.field4669).field2648.length << 8);
        } else if (this.field4149 >= 0) {
            var2 -= this.field4150 * var2 / ((class154) this.field4669).field2648.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(II)I", line = 567)
    private static final int method1696(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(II[B[IIIIIIIILnl;II)I", line = 570)
    private static final int method1697(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class239 arg11, int arg12, int arg13) {
        int var14;
        if (arg12 == 0 || (var14 = (arg10 + arg12 + 256 - arg4) / arg12 + arg5) > arg9) {
            var14 = arg9;
        }
        int var15 = arg5 << 1;
        int var16 = var14 << 1;
        int var10001;
        while (var15 < var16) {
            int var17 = arg4 >> 8;
            byte var18 = arg2[var17 - 1];
            int var19 = (var18 << 8) + (arg4 & 0xFF) * (arg2[var17] - var18);
            var10001 = var15++;
            arg3[var10001] += arg6 * var19 >> 6;
            int var24 = var15++;
            arg3[var24] += arg7 * var19 >> 6;
            arg4 += arg12;
        }
        int var20;
        if (arg12 == 0 || (var20 = (var15 >> 1) + (arg10 + arg12 - arg4) / arg12) > arg9) {
            var20 = arg9;
        }
        int var21 = var20 << 1;
        int var22 = arg13;
        while (var15 < var21) {
            int var23 = (var22 << 8) + (arg4 & 0xFF) * (arg2[arg4 >> 8] - var22);
            var10001 = var15++;
            arg3[var10001] += arg6 * var23 >> 6;
            var10001 = var15++;
            arg3[var10001] += arg7 * var23 >> 6;
            arg4 += arg12;
        }
        arg11.field4148 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!nl", name = "h", descriptor = "()I", line = 602)
    public final synchronized int method1698() {
        return this.field4152 < 0 ? -1 : this.field4152;
    }

    @OriginalMember(owner = "client!nl", name = "i", descriptor = "()Z", line = 608)
    public final boolean method1699() {
        return this.field4155 != 0;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(III)V", line = 611)
    public final synchronized void method1700(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1719(arg1, arg2);
            return;
        }
        int var4 = method1696(arg1, arg2);
        int var5 = method1716(arg1, arg2);
        if (this.field4161 == var4 && this.field4153 == var5) {
            this.field4155 = 0;
            return;
        }
        int var6 = arg1 - this.field4162;
        if (this.field4162 - arg1 > var6) {
            var6 = this.field4162 - arg1;
        }
        if (var4 - this.field4161 > var6) {
            var6 = var4 - this.field4161;
        }
        if (this.field4161 - var4 > var6) {
            var6 = this.field4161 - var4;
        }
        if (var5 - this.field4153 > var6) {
            var6 = var5 - this.field4153;
        }
        if (this.field4153 - var5 > var6) {
            var6 = this.field4153 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field4155 = arg0;
        this.field4157 = arg1;
        this.field4152 = arg2;
        this.field4160 = (arg1 - this.field4162) / arg0;
        this.field4151 = (var4 - this.field4161) / arg0;
        this.field4154 = (var5 - this.field4153) / arg0;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "([III)V", line = 657)
    public final synchronized void method881(int[] arg0, int arg1, int arg2) {
        if (this.field4157 == 0 && this.field4155 == 0) {
            this.method883(arg2);
            return;
        }
        class154 var4 = (class154) this.field4669;
        int var5 = this.field4150 << 8;
        int var6 = this.field4158 << 8;
        int var7 = var4.field2648.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field4149 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field4148 < 0) {
            if (this.field4156 <= 0) {
                this.method1714();
                this.method961((byte) 62);
                return;
            }
            this.field4148 = 0;
        }
        if (this.field4148 >= var7) {
            if (this.field4156 >= 0) {
                this.method1714();
                this.method961((byte) 118);
                return;
            }
            this.field4148 = var7 - 1;
        }
        if (this.field4149 >= 0) {
            if (this.field4149 > 0) {
                if (this.field4159) {
                    label131: {
                        if (this.field4156 < 0) {
                            var9 = this.method1712(arg0, arg1, var5, var10, var4.field2648[this.field4150]);
                            if (this.field4148 >= var5) {
                                return;
                            }
                            this.field4148 = var5 + var5 - this.field4148 - 1;
                            this.field4156 = -this.field4156;
                            if (--this.field4149 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method1701(arg0, var9, var6, var10, var4.field2648[this.field4158 - 1]);
                            if (this.field4148 < var6) {
                                return;
                            }
                            this.field4148 = var6 + var6 - this.field4148 - 1;
                            this.field4156 = -this.field4156;
                            if (--this.field4149 == 0) {
                                break;
                            }
                            var9 = this.method1712(arg0, var9, var5, var10, var4.field2648[this.field4150]);
                            if (this.field4148 >= var5) {
                                return;
                            }
                            this.field4148 = var5 + var5 - this.field4148 - 1;
                            this.field4156 = -this.field4156;
                        } while (--this.field4149 != 0);
                    }
                } else if (this.field4156 < 0) {
                    while (true) {
                        var9 = this.method1712(arg0, var9, var5, var10, var4.field2648[this.field4158 - 1]);
                        if (this.field4148 >= var5) {
                            return;
                        }
                        int var12 = (var6 - this.field4148 - 1) / var8;
                        if (var12 >= this.field4149) {
                            this.field4148 += this.field4149 * var8;
                            this.field4149 = 0;
                            break;
                        }
                        this.field4148 += var8 * var12;
                        this.field4149 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method1701(arg0, var9, var6, var10, var4.field2648[this.field4150]);
                        if (this.field4148 < var6) {
                            return;
                        }
                        int var13 = (this.field4148 - var5) / var8;
                        if (var13 >= this.field4149) {
                            this.field4148 -= this.field4149 * var8;
                            this.field4149 = 0;
                            break;
                        }
                        this.field4148 -= var8 * var13;
                        this.field4149 -= var13;
                    }
                }
            }
            if (this.field4156 < 0) {
                this.method1712(arg0, var9, 0, var10, 0);
                if (this.field4148 < 0) {
                    this.field4148 = -1;
                    this.method1714();
                    this.method961((byte) 64);
                }
            } else {
                this.method1701(arg0, var9, var7, var10, 0);
                if (this.field4148 >= var7) {
                    this.field4148 = var7;
                    this.method1714();
                    this.method961((byte) 71);
                }
            }
        } else if (this.field4159) {
            if (this.field4156 < 0) {
                var9 = this.method1712(arg0, arg1, var5, var10, var4.field2648[this.field4150]);
                if (this.field4148 >= var5) {
                    return;
                }
                this.field4148 = var5 + var5 - this.field4148 - 1;
                this.field4156 = -this.field4156;
            }
            while (true) {
                int var11 = this.method1701(arg0, var9, var6, var10, var4.field2648[this.field4158 - 1]);
                if (this.field4148 < var6) {
                    return;
                }
                this.field4148 = var6 + var6 - this.field4148 - 1;
                this.field4156 = -this.field4156;
                var9 = this.method1712(arg0, var11, var5, var10, var4.field2648[this.field4150]);
                if (this.field4148 >= var5) {
                    return;
                }
                this.field4148 = var5 + var5 - this.field4148 - 1;
                this.field4156 = -this.field4156;
            }
        } else if (this.field4156 < 0) {
            while (true) {
                var9 = this.method1712(arg0, var9, var5, var10, var4.field2648[this.field4158 - 1]);
                if (this.field4148 >= var5) {
                    return;
                }
                this.field4148 = var6 - (var6 - 1 - this.field4148) % var8 - 1;
            }
        } else {
            while (true) {
                var9 = this.method1701(arg0, var9, var6, var10, var4.field2648[this.field4150]);
                if (this.field4148 < var6) {
                    return;
                }
                this.field4148 = (this.field4148 - var5) % var8 + var5;
            }
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "([IIIII)I", line = 892)
    private final int method1701(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field4155 > 0) {
                int var6 = this.field4155 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field4155 += arg1;
                if (this.field4156 == 256 && (this.field4148 & 0xFF) == 0) {
                    if (class219.field3799) {
                        arg1 = method1710(0, ((class154) this.field4669).field2648, arg0, this.field4148, arg1, this.field4161, this.field4153, this.field4151, this.field4154, 0, var6, arg2, this);
                    } else {
                        arg1 = method1689(((class154) this.field4669).field2648, arg0, this.field4148, arg1, this.field4162, this.field4160, 0, var6, arg2, this);
                    }
                } else if (class219.field3799) {
                    arg1 = method1704(0, 0, ((class154) this.field4669).field2648, arg0, this.field4148, arg1, this.field4161, this.field4153, this.field4151, this.field4154, 0, var6, arg2, this, this.field4156, arg4);
                } else {
                    arg1 = method1684(0, 0, ((class154) this.field4669).field2648, arg0, this.field4148, arg1, this.field4162, this.field4160, 0, var6, arg2, this, this.field4156, arg4);
                }
                this.field4155 -= arg1;
                if (this.field4155 != 0) {
                    return arg1;
                }
                if (!this.method1713()) {
                    continue;
                }
                return arg3;
            }
            if (this.field4156 == 256 && (this.field4148 & 0xFF) == 0) {
                if (class219.field3799) {
                    return method1686(0, ((class154) this.field4669).field2648, arg0, this.field4148, arg1, this.field4161, this.field4153, 0, arg3, arg2, this);
                }
                return method1694(((class154) this.field4669).field2648, arg0, this.field4148, arg1, this.field4162, 0, arg3, arg2, this);
            }
            if (class219.field3799) {
                return method1707(0, 0, ((class154) this.field4669).field2648, arg0, this.field4148, arg1, this.field4161, this.field4153, 0, arg3, arg2, this, this.field4156, arg4);
            }
            return method1706(0, 0, ((class154) this.field4669).field2648, arg0, this.field4148, arg1, this.field4162, 0, arg3, arg2, this, this.field4156, arg4);
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Z)V", line = 949)
    public final synchronized void method1702(boolean arg0) {
        this.field4156 = (this.field4156 >>> 31) + (this.field4156 ^ this.field4156 >> 31);
        if (arg0) {
            this.field4156 = -this.field4156;
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Lvk;III)Lnl;", line = 955)
    public static final class239 method1703(class154 arg0, int arg1, int arg2, int arg3) {
        return arg0.field2648 == null || arg0.field2648.length == 0 ? null : new class239(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(II[B[IIIIIIIIIILnl;II)I", line = 962)
    private static final int method1704(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class239 arg13, int arg14, int arg15) {
        arg13.field4162 -= arg13.field4160 * arg5;
        int var16;
        if (arg14 == 0 || (var16 = (arg12 + arg14 - arg4 - 257) / arg14 + arg5) > arg11) {
            var16 = arg11;
        }
        int var17 = arg5 << 1;
        int var18 = var16 << 1;
        int var10001;
        while (var17 < var18) {
            int var19 = arg4 >> 8;
            byte var20 = arg2[var19];
            int var21 = (var20 << 8) + (arg4 & 0xFF) * (arg2[var19 + 1] - var20);
            var10001 = var17++;
            arg3[var10001] += arg6 * var21 >> 6;
            arg6 += arg8;
            int var28 = var17++;
            arg3[var28] += arg7 * var21 >> 6;
            arg7 += arg9;
            arg4 += arg14;
        }
        int var22;
        if (arg14 == 0 || (var22 = (var17 >> 1) + (arg12 + arg14 - arg4 - 1) / arg14) > arg11) {
            var22 = arg11;
        }
        int var23 = var22 << 1;
        int var24 = arg15;
        while (var17 < var23) {
            byte var25 = arg2[arg4 >> 8];
            int var26 = (var25 << 8) + (arg4 & 0xFF) * (var24 - var25);
            var10001 = var17++;
            arg3[var10001] += arg6 * var26 >> 6;
            arg6 += arg8;
            var10001 = var17++;
            arg3[var10001] += arg7 * var26 >> 6;
            arg7 += arg9;
            arg4 += arg14;
        }
        int var27 = var17 >> 1;
        arg13.field4162 += arg13.field4160 * var27;
        arg13.field4161 = arg6;
        arg13.field4153 = arg7;
        arg13.field4148 = arg4;
        return var27;
    }

    @OriginalMember(owner = "client!nl", name = "e", descriptor = "(I)V", line = 1005)
    public final synchronized void method1705(int arg0) {
        if (this.field4156 < 0) {
            this.field4156 = -arg0;
        } else {
            this.field4156 = arg0;
        }
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(II[B[IIIIIIILnl;II)I", line = 1013)
    private static final int method1706(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class239 arg10, int arg11, int arg12) {
        int var13;
        if (arg11 == 0 || (var13 = (arg9 + arg11 - arg4 - 257) / arg11 + arg5) > arg8) {
            var13 = arg8;
        }
        int var10001;
        while (arg5 < var13) {
            int var14 = arg4 >> 8;
            byte var15 = arg2[var14];
            var10001 = arg5++;
            arg3[var10001] += ((var15 << 8) + (arg4 & 0xFF) * (arg2[var14 + 1] - var15)) * arg6 >> 6;
            arg4 += arg11;
        }
        int var16;
        if (arg11 == 0 || (var16 = (arg9 + arg11 - arg4 - 1) / arg11 + arg5) > arg8) {
            var16 = arg8;
        }
        int var17 = arg12;
        while (arg5 < var16) {
            byte var18 = arg2[arg4 >> 8];
            var10001 = arg5++;
            arg3[var10001] += ((var18 << 8) + (arg4 & 0xFF) * (var17 - var18)) * arg6 >> 6;
            arg4 += arg11;
        }
        arg10.field4148 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "(II[B[IIIIIIIILnl;II)I", line = 1039)
    private static final int method1707(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class239 arg11, int arg12, int arg13) {
        int var14;
        if (arg12 == 0 || (var14 = (arg10 + arg12 - arg4 - 257) / arg12 + arg5) > arg9) {
            var14 = arg9;
        }
        int var15 = arg5 << 1;
        int var16 = var14 << 1;
        int var10001;
        while (var15 < var16) {
            int var17 = arg4 >> 8;
            byte var18 = arg2[var17];
            int var19 = (var18 << 8) + (arg4 & 0xFF) * (arg2[var17 + 1] - var18);
            var10001 = var15++;
            arg3[var10001] += arg6 * var19 >> 6;
            int var25 = var15++;
            arg3[var25] += arg7 * var19 >> 6;
            arg4 += arg12;
        }
        int var20;
        if (arg12 == 0 || (var20 = (var15 >> 1) + (arg10 + arg12 - arg4 - 1) / arg12) > arg9) {
            var20 = arg9;
        }
        int var21 = var20 << 1;
        int var22 = arg13;
        while (var15 < var21) {
            byte var23 = arg2[arg4 >> 8];
            int var24 = (var23 << 8) + (arg4 & 0xFF) * (var22 - var23);
            var10001 = var15++;
            arg3[var10001] += arg6 * var24 >> 6;
            var10001 = var15++;
            arg3[var10001] += arg7 * var24 >> 6;
            arg4 += arg12;
        }
        arg11.field4148 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "([B[IIIIIIILnl;)I", line = 1072)
    private static final int method1708(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class239 arg8) {
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
        arg8.field4148 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!nl", name = "d", descriptor = "(II[B[IIIIIIIILnl;II)I", line = 1097)
    private static final int method1709(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class239 arg11, int arg12, int arg13) {
        arg11.field4161 -= arg11.field4151 * arg5;
        arg11.field4153 -= arg11.field4154 * arg5;
        int var14;
        if (arg12 == 0 || (var14 = (arg10 + arg12 + 256 - arg4) / arg12 + arg5) > arg9) {
            var14 = arg9;
        }
        int var10001;
        while (arg5 < var14) {
            int var15 = arg4 >> 8;
            byte var16 = arg2[var15 - 1];
            var10001 = arg5++;
            arg3[var10001] += ((var16 << 8) + (arg4 & 0xFF) * (arg2[var15] - var16)) * arg6 >> 6;
            arg6 += arg7;
            arg4 += arg12;
        }
        int var17;
        if (arg12 == 0 || (var17 = (arg10 + arg12 - arg4) / arg12 + arg5) > arg9) {
            var17 = arg9;
        }
        int var18 = arg13;
        int var19 = arg12;
        while (arg5 < var17) {
            var10001 = arg5++;
            arg3[var10001] += ((var18 << 8) + (arg4 & 0xFF) * (arg2[arg4 >> 8] - var18)) * arg6 >> 6;
            arg6 += arg7;
            arg4 += var19;
        }
        arg11.field4161 += arg11.field4151 * arg5;
        arg11.field4153 += arg11.field4154 * arg5;
        arg11.field4162 = arg6;
        arg11.field4148 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(I[B[IIIIIIIIIILnl;)I", line = 1131)
    private static final int method1710(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class239 arg12) {
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
        arg12.field4162 += (var19 - arg4) * arg12.field4160;
        int var20 = arg4 << 1;
        int var21 = var19 << 1;
        int var44 = var21 - 6;
        while (var20 < var44) {
            byte var22 = arg1[var13++];
            int var33 = var20++;
            arg2[var33] += var15 * var22;
            int var23 = var15 + var17;
            int var34 = var20++;
            arg2[var34] += var16 * var22;
            int var24 = var16 + var18;
            byte var25 = arg1[var13++];
            int var36 = var20++;
            arg2[var36] += var23 * var25;
            int var26 = var17 + var23;
            int var37 = var20++;
            arg2[var37] += var24 * var25;
            int var27 = var18 + var24;
            byte var28 = arg1[var13++];
            int var39 = var20++;
            arg2[var39] += var26 * var28;
            int var29 = var17 + var26;
            int var40 = var20++;
            arg2[var40] += var27 * var28;
            int var30 = var18 + var27;
            byte var31 = arg1[var13++];
            int var42 = var20++;
            arg2[var42] += var29 * var31;
            var15 = var17 + var29;
            int var43 = var20++;
            arg2[var43] += var30 * var31;
            var16 = var18 + var30;
        }
        var21 = var44 + 6;
        while (var20 < var21) {
            byte var32 = arg1[var13++];
            int var10001 = var20++;
            arg2[var10001] += var15 * var32;
            var15 += var17;
            int var45 = var20++;
            arg2[var45] += var16 * var32;
            var16 += var18;
        }
        arg12.field4161 = var15 >> 2;
        arg12.field4153 = var16 >> 2;
        arg12.field4148 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "()Ljk;", line = 1184)
    public final class278 method875() {
        return null;
    }

    @OriginalMember(owner = "client!nl", name = "f", descriptor = "(I)V", line = 1188)
    public final synchronized void method1711(int arg0) {
        this.field4149 = arg0;
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "([IIIII)I", line = 1191)
    private final int method1712(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field4155 > 0) {
                int var6 = this.field4155 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field4155 += arg1;
                if (this.field4156 == -256 && (this.field4148 & 0xFF) == 0) {
                    if (class219.field3799) {
                        arg1 = method1688(0, ((class154) this.field4669).field2648, arg0, this.field4148, arg1, this.field4161, this.field4153, this.field4151, this.field4154, 0, var6, arg2, this);
                    } else {
                        arg1 = method1722(((class154) this.field4669).field2648, arg0, this.field4148, arg1, this.field4162, this.field4160, 0, var6, arg2, this);
                    }
                } else if (class219.field3799) {
                    arg1 = method1687(0, 0, ((class154) this.field4669).field2648, arg0, this.field4148, arg1, this.field4161, this.field4153, this.field4151, this.field4154, 0, var6, arg2, this, this.field4156, arg4);
                } else {
                    arg1 = method1709(0, 0, ((class154) this.field4669).field2648, arg0, this.field4148, arg1, this.field4162, this.field4160, 0, var6, arg2, this, this.field4156, arg4);
                }
                this.field4155 -= arg1;
                if (this.field4155 != 0) {
                    return arg1;
                }
                if (!this.method1713()) {
                    continue;
                }
                return arg3;
            }
            if (this.field4156 == -256 && (this.field4148 & 0xFF) == 0) {
                if (class219.field3799) {
                    return method1683(0, ((class154) this.field4669).field2648, arg0, this.field4148, arg1, this.field4161, this.field4153, 0, arg3, arg2, this);
                }
                return method1708(((class154) this.field4669).field2648, arg0, this.field4148, arg1, this.field4162, 0, arg3, arg2, this);
            }
            if (class219.field3799) {
                return method1697(0, 0, ((class154) this.field4669).field2648, arg0, this.field4148, arg1, this.field4161, this.field4153, 0, arg3, arg2, this, this.field4156, arg4);
            }
            return method1691(0, 0, ((class154) this.field4669).field2648, arg0, this.field4148, arg1, this.field4162, 0, arg3, arg2, this, this.field4156, arg4);
        }
    }

    @OriginalMember(owner = "client!nl", name = "j", descriptor = "()Z", line = 1247)
    private final boolean method1713() {
        int var1 = this.field4157;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1696(var1, this.field4152);
            var2 = method1716(var1, this.field4152);
        }
        if (this.field4162 != var1 || this.field4161 != var3 || this.field4153 != var2) {
            if (this.field4162 < var1) {
                this.field4160 = 1;
                this.field4155 = var1 - this.field4162;
            } else if (this.field4162 > var1) {
                this.field4160 = -1;
                this.field4155 = this.field4162 - var1;
            } else {
                this.field4160 = 0;
            }
            if (this.field4161 < var3) {
                this.field4151 = 1;
                if (this.field4155 == 0 || this.field4155 > var3 - this.field4161) {
                    this.field4155 = var3 - this.field4161;
                }
            } else if (this.field4161 > var3) {
                this.field4151 = -1;
                if (this.field4155 == 0 || this.field4155 > this.field4161 - var3) {
                    this.field4155 = this.field4161 - var3;
                }
            } else {
                this.field4151 = 0;
            }
            if (this.field4153 < var2) {
                this.field4154 = 1;
                if (this.field4155 == 0 || this.field4155 > var2 - this.field4153) {
                    this.field4155 = var2 - this.field4153;
                }
            } else if (this.field4153 > var2) {
                this.field4154 = -1;
                if (this.field4155 == 0 || this.field4155 > this.field4153 - var2) {
                    this.field4155 = this.field4153 - var2;
                }
            } else {
                this.field4154 = 0;
            }
            return false;
        } else if (this.field4157 == Integer.MIN_VALUE) {
            this.field4157 = 0;
            this.field4162 = this.field4161 = this.field4153 = 0;
            this.method961((byte) 61);
            return true;
        } else {
            this.method1693();
            return false;
        }
    }

    @OriginalMember(owner = "client!nl", name = "k", descriptor = "()V", line = 1338)
    private final void method1714() {
        if (this.field4155 == 0) {
            return;
        }
        if (this.field4157 == Integer.MIN_VALUE) {
            this.field4157 = 0;
        }
        this.field4155 = 0;
        this.method1693();
    }

    @OriginalMember(owner = "client!nl", name = "<init>", descriptor = "(Lvk;II)V", line = 1349)
    private class239(class154 arg0, int arg1, int arg2) {
        this.field4669 = arg0;
        this.field4150 = arg0.field2651;
        this.field4158 = arg0.field2649;
        this.field4159 = arg0.field2650;
        this.field4156 = arg1;
        this.field4157 = arg2;
        this.field4152 = 8192;
        this.field4148 = 0;
        this.method1693();
    }

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "(II)V", line = 1361)
    public final synchronized void method1715(int arg0, int arg1) {
        this.method1700(arg0, arg1, this.method1698());
    }

    @OriginalMember(owner = "client!nl", name = "d", descriptor = "(II)I", line = 1364)
    private static final int method1716(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!nl", name = "g", descriptor = "(I)V", line = 1367)
    public final synchronized void method1717(int arg0) {
        if (arg0 == 0) {
            this.method1721(0);
            this.method961((byte) 58);
        } else if (this.field4161 == 0 && this.field4153 == 0) {
            this.field4155 = 0;
            this.field4157 = 0;
            this.field4162 = 0;
            this.method961((byte) 94);
        } else {
            int var2 = -this.field4162;
            if (this.field4162 > var2) {
                var2 = this.field4162;
            }
            if (-this.field4161 > var2) {
                var2 = -this.field4161;
            }
            if (this.field4161 > var2) {
                var2 = this.field4161;
            }
            if (-this.field4153 > var2) {
                var2 = -this.field4153;
            }
            if (this.field4153 > var2) {
                var2 = this.field4153;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field4155 = arg0;
            this.field4157 = Integer.MIN_VALUE;
            this.field4160 = -this.field4162 / arg0;
            this.field4151 = -this.field4161 / arg0;
            this.field4154 = -this.field4153 / arg0;
        }
    }

    @OriginalMember(owner = "client!nl", name = "l", descriptor = "()Z", line = 1412)
    public final boolean method1718() {
        return this.field4148 < 0 || this.field4148 >= ((class154) this.field4669).field2648.length << 8;
    }

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "()Ljk;", line = 1415)
    public final class278 method886() {
        return null;
    }

    @OriginalMember(owner = "client!nl", name = "e", descriptor = "(II)V", line = 1418)
    private final synchronized void method1719(int arg0, int arg1) {
        this.field4157 = arg0;
        this.field4152 = arg1;
        this.field4155 = 0;
        this.method1693();
    }

    @OriginalMember(owner = "client!nl", name = "h", descriptor = "(I)V", line = 1424)
    public final synchronized void method1720(int arg0) {
        this.method1719(arg0 << 6, this.method1698());
    }

    @OriginalMember(owner = "client!nl", name = "<init>", descriptor = "(Lvk;III)V", line = 1426)
    private class239(class154 arg0, int arg1, int arg2, int arg3) {
        this.field4669 = arg0;
        this.field4150 = arg0.field2651;
        this.field4158 = arg0.field2649;
        this.field4159 = arg0.field2650;
        this.field4156 = arg1;
        this.field4157 = arg2;
        this.field4152 = arg3;
        this.field4148 = 0;
        this.method1693();
    }

    @OriginalMember(owner = "client!nl", name = "i", descriptor = "(I)V", line = 1438)
    private final synchronized void method1721(int arg0) {
        this.method1719(arg0, this.method1698());
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "([B[IIIIIIIILnl;)I", line = 1441)
    private static final int method1722(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class239 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field4161 += (var14 - arg3) * arg9.field4151;
        arg9.field4153 += (var14 - arg3) * arg9.field4154;
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
        arg9.field4162 = var12 >> 2;
        arg9.field4148 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Lvk;II)Lnl;", line = 1475)
    public static final class239 method1723(class154 arg0, int arg1, int arg2) {
        return arg0.field2648 == null || arg0.field2648.length == 0 ? null : new class239(arg0, (int) ((long) arg0.field2647 * 256L * (long) arg1 / (long) (class307.field5236 * 100)), arg2 << 6);
    }
}
