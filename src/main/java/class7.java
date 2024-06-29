import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class7 extends class169 {

    @OriginalMember(owner = "client!j", name = "x", descriptor = "I")
    private int field109;

    @OriginalMember(owner = "client!j", name = "H", descriptor = "I")
    private int field117;

    @OriginalMember(owner = "client!j", name = "F", descriptor = "Z")
    private boolean field116;

    @OriginalMember(owner = "client!j", name = "A", descriptor = "I")
    private int field112;

    @OriginalMember(owner = "client!j", name = "B", descriptor = "I")
    private int field113;

    @OriginalMember(owner = "client!j", name = "z", descriptor = "I")
    private int field111;

    @OriginalMember(owner = "client!j", name = "y", descriptor = "I")
    private int field110;

    @OriginalMember(owner = "client!j", name = "r", descriptor = "I")
    private int field103;

    @OriginalMember(owner = "client!j", name = "s", descriptor = "I")
    private int field104;

    @OriginalMember(owner = "client!j", name = "t", descriptor = "I")
    private int field105;

    @OriginalMember(owner = "client!j", name = "u", descriptor = "I")
    private int field106;

    @OriginalMember(owner = "client!j", name = "v", descriptor = "I")
    private int field107;

    @OriginalMember(owner = "client!j", name = "w", descriptor = "I")
    private int field108;

    @OriginalMember(owner = "client!j", name = "C", descriptor = "I")
    private int field114;

    @OriginalMember(owner = "client!j", name = "D", descriptor = "I")
    private int field115;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "([III)V", line = 3)
    public final synchronized void method47(int[] arg0, int arg1, int arg2) {
        if (this.field113 == 0 && this.field105 == 0) {
            this.method82(arg2);
            return;
        }
        class225 var4 = (class225) this.field2679;
        int var5 = this.field109 << 8;
        int var6 = this.field117 << 8;
        int var7 = var4.field3516.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field115 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field110 < 0) {
            if (this.field112 <= 0) {
                this.method49();
                this.method1357(947647010);
                return;
            }
            this.field110 = 0;
        }
        if (this.field110 >= var7) {
            if (this.field112 >= 0) {
                this.method49();
                this.method1357(947647010);
                return;
            }
            this.field110 = var7 - 1;
        }
        if (this.field115 >= 0) {
            if (this.field115 > 0) {
                if (this.field116) {
                    label131: {
                        if (this.field112 < 0) {
                            var9 = this.method57(arg0, arg1, var5, var10, var4.field3516[this.field109]);
                            if (this.field110 >= var5) {
                                return;
                            }
                            this.field110 = var5 + var5 - this.field110 - 1;
                            this.field112 = -this.field112;
                            if (--this.field115 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method74(arg0, var9, var6, var10, var4.field3516[this.field117 - 1]);
                            if (this.field110 < var6) {
                                return;
                            }
                            this.field110 = var6 + var6 - this.field110 - 1;
                            this.field112 = -this.field112;
                            if (--this.field115 == 0) {
                                break;
                            }
                            var9 = this.method57(arg0, var9, var5, var10, var4.field3516[this.field109]);
                            if (this.field110 >= var5) {
                                return;
                            }
                            this.field110 = var5 + var5 - this.field110 - 1;
                            this.field112 = -this.field112;
                        } while (--this.field115 != 0);
                    }
                } else if (this.field112 < 0) {
                    while (true) {
                        var9 = this.method57(arg0, var9, var5, var10, var4.field3516[this.field117 - 1]);
                        if (this.field110 >= var5) {
                            return;
                        }
                        int var12 = (var6 - this.field110 - 1) / var8;
                        if (var12 >= this.field115) {
                            this.field110 += this.field115 * var8;
                            this.field115 = 0;
                            break;
                        }
                        this.field110 += var8 * var12;
                        this.field115 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method74(arg0, var9, var6, var10, var4.field3516[this.field109]);
                        if (this.field110 < var6) {
                            return;
                        }
                        int var13 = (this.field110 - var5) / var8;
                        if (var13 >= this.field115) {
                            this.field110 -= this.field115 * var8;
                            this.field115 = 0;
                            break;
                        }
                        this.field110 -= var8 * var13;
                        this.field115 -= var13;
                    }
                }
            }
            if (this.field112 < 0) {
                this.method57(arg0, var9, 0, var10, 0);
                if (this.field110 < 0) {
                    this.field110 = -1;
                    this.method49();
                    this.method1357(947647010);
                }
            } else {
                this.method74(arg0, var9, var7, var10, 0);
                if (this.field110 >= var7) {
                    this.field110 = var7;
                    this.method49();
                    this.method1357(947647010);
                }
            }
        } else if (this.field116) {
            if (this.field112 < 0) {
                var9 = this.method57(arg0, arg1, var5, var10, var4.field3516[this.field109]);
                if (this.field110 >= var5) {
                    return;
                }
                this.field110 = var5 + var5 - this.field110 - 1;
                this.field112 = -this.field112;
            }
            while (true) {
                int var11 = this.method74(arg0, var9, var6, var10, var4.field3516[this.field117 - 1]);
                if (this.field110 < var6) {
                    return;
                }
                this.field110 = var6 + var6 - this.field110 - 1;
                this.field112 = -this.field112;
                var9 = this.method57(arg0, var11, var5, var10, var4.field3516[this.field109]);
                if (this.field110 >= var5) {
                    return;
                }
                this.field110 = var5 + var5 - this.field110 - 1;
                this.field112 = -this.field112;
            }
        } else if (this.field112 < 0) {
            while (true) {
                var9 = this.method57(arg0, var9, var5, var10, var4.field3516[this.field117 - 1]);
                if (this.field110 >= var5) {
                    return;
                }
                this.field110 = var6 - (var6 - 1 - this.field110) % var8 - 1;
            }
        } else {
            while (true) {
                var9 = this.method74(arg0, var9, var6, var10, var4.field3516[this.field109]);
                if (this.field110 < var6) {
                    return;
                }
                this.field110 = (this.field110 - var5) % var8 + var5;
            }
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "([B[IIIIIIIILj;)I", line = 238)
    private static final int method48(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class7 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field106 += (var14 - arg3) * arg9.field103;
        arg9.field114 += (var14 - arg3) * arg9.field108;
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
        arg9.field104 = var12 >> 2;
        arg9.field110 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!j", name = "e", descriptor = "()V", line = 272)
    private final void method49() {
        if (this.field105 == 0) {
            return;
        }
        if (this.field113 == Integer.MIN_VALUE) {
            this.field113 = 0;
        }
        this.field105 = 0;
        this.method67();
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(II[B[IIIIIIILj;II)I", line = 283)
    private static final int method50(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class7 arg10, int arg11, int arg12) {
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
        arg10.field110 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Lqj;III)Lj;", line = 309)
    public static final class7 method51(class225 arg0, int arg1, int arg2, int arg3) {
        return arg0.field3516 == null || arg0.field3516.length == 0 ? null : new class7(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "([B[IIIIIIILj;)I", line = 315)
    private static final int method52(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class7 arg8) {
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
        arg8.field110 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!j", name = "f", descriptor = "()I", line = 340)
    public final synchronized int method53() {
        return this.field113 == Integer.MIN_VALUE ? 0 : this.field113;
    }

    @OriginalMember(owner = "client!j", name = "e", descriptor = "(I)V", line = 343)
    public final synchronized void method54(int arg0) {
        if (this.field112 < 0) {
            this.field112 = -arg0;
        } else {
            this.field112 = arg0;
        }
    }

    @OriginalMember(owner = "client!j", name = "g", descriptor = "()I", line = 352)
    public final synchronized int method55() {
        return this.field111 < 0 ? -1 : this.field111;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "()I", line = 357)
    public final int method56() {
        int var1 = this.field104 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field115 == 0) {
            var2 -= this.field110 * var2 / (((class225) this.field2679).field3516.length << 8);
        } else if (this.field115 >= 0) {
            var2 -= this.field109 * var2 / ((class225) this.field2679).field3516.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "([IIIII)I", line = 370)
    private final int method57(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field105 > 0) {
                int var6 = this.field105 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field105 += arg1;
                if (this.field112 == -256 && (this.field110 & 0xFF) == 0) {
                    if (class61.field946) {
                        arg1 = method70(0, ((class225) this.field2679).field3516, arg0, this.field110, arg1, this.field106, this.field114, this.field103, this.field108, 0, var6, arg2, this);
                    } else {
                        arg1 = method48(((class225) this.field2679).field3516, arg0, this.field110, arg1, this.field104, this.field107, 0, var6, arg2, this);
                    }
                } else if (class61.field946) {
                    arg1 = method62(0, 0, ((class225) this.field2679).field3516, arg0, this.field110, arg1, this.field106, this.field114, this.field103, this.field108, 0, var6, arg2, this, this.field112, arg4);
                } else {
                    arg1 = method71(0, 0, ((class225) this.field2679).field3516, arg0, this.field110, arg1, this.field104, this.field107, 0, var6, arg2, this, this.field112, arg4);
                }
                this.field105 -= arg1;
                if (this.field105 != 0) {
                    return arg1;
                }
                if (!this.method86()) {
                    continue;
                }
                return arg3;
            }
            if (this.field112 == -256 && (this.field110 & 0xFF) == 0) {
                if (class61.field946) {
                    return method75(0, ((class225) this.field2679).field3516, arg0, this.field110, arg1, this.field106, this.field114, 0, arg3, arg2, this);
                }
                return method52(((class225) this.field2679).field3516, arg0, this.field110, arg1, this.field104, 0, arg3, arg2, this);
            }
            if (class61.field946) {
                return method92(0, 0, ((class225) this.field2679).field3516, arg0, this.field110, arg1, this.field106, this.field114, 0, arg3, arg2, this, this.field112, arg4);
            }
            return method89(0, 0, ((class225) this.field2679).field3516, arg0, this.field110, arg1, this.field104, 0, arg3, arg2, this, this.field112, arg4);
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(II[B[IIIIIIIILj;II)I", line = 425)
    private static final int method58(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class7 arg11, int arg12, int arg13) {
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
        arg11.field110 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!j", name = "f", descriptor = "(I)V", line = 459)
    public final synchronized void method59(int arg0) {
        int var2 = ((class225) this.field2679).field3516.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field110 = arg0;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(I[B[IIIIIIIIIILj;)I", line = 470)
    private static final int method60(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class7 arg12) {
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
        arg12.field104 += (var19 - arg4) * arg12.field107;
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
        arg12.field106 = var15 >> 2;
        arg12.field114 = var16 >> 2;
        arg12.field110 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "()Lph;", line = 524)
    public final class169 method61() {
        return null;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(II[B[IIIIIIIIIILj;II)I", line = 528)
    private static final int method62(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class7 arg13, int arg14, int arg15) {
        arg13.field104 -= arg13.field107 * arg5;
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
        arg13.field104 += arg13.field107 * var26;
        arg13.field106 = arg6;
        arg13.field114 = arg7;
        arg13.field110 = arg4;
        return var26;
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "([B[IIIIIIIILj;)I", line = 571)
    private static final int method63(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class7 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field106 += (var14 - arg3) * arg9.field103;
        arg9.field114 += (var14 - arg3) * arg9.field108;
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
        arg9.field104 = var12 >> 2;
        arg9.field110 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(III)V", line = 605)
    public final synchronized void method64(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method69(arg1, arg2);
            return;
        }
        int var4 = method90(arg1, arg2);
        int var5 = method80(arg1, arg2);
        if (this.field106 == var4 && this.field114 == var5) {
            this.field105 = 0;
            return;
        }
        int var6 = arg1 - this.field104;
        if (this.field104 - arg1 > var6) {
            var6 = this.field104 - arg1;
        }
        if (var4 - this.field106 > var6) {
            var6 = var4 - this.field106;
        }
        if (this.field106 - var4 > var6) {
            var6 = this.field106 - var4;
        }
        if (var5 - this.field114 > var6) {
            var6 = var5 - this.field114;
        }
        if (this.field114 - var5 > var6) {
            var6 = this.field114 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field105 = arg0;
        this.field113 = arg1;
        this.field111 = arg2;
        this.field107 = (arg1 - this.field104) / arg0;
        this.field103 = (var4 - this.field106) / arg0;
        this.field108 = (var5 - this.field114) / arg0;
    }

    @OriginalMember(owner = "client!j", name = "g", descriptor = "(I)V", line = 652)
    public final synchronized void method65(int arg0) {
        if (arg0 == 0) {
            this.method76(0);
            this.method1357(947647010);
        } else if (this.field106 == 0 && this.field114 == 0) {
            this.field105 = 0;
            this.field113 = 0;
            this.field104 = 0;
            this.method1357(947647010);
        } else {
            int var2 = -this.field104;
            if (this.field104 > var2) {
                var2 = this.field104;
            }
            if (-this.field106 > var2) {
                var2 = -this.field106;
            }
            if (this.field106 > var2) {
                var2 = this.field106;
            }
            if (-this.field114 > var2) {
                var2 = -this.field114;
            }
            if (this.field114 > var2) {
                var2 = this.field114;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field105 = arg0;
            this.field113 = Integer.MIN_VALUE;
            this.field107 = -this.field104 / arg0;
            this.field103 = -this.field106 / arg0;
            this.field108 = -this.field114 / arg0;
        }
    }

    @OriginalMember(owner = "client!j", name = "h", descriptor = "()Z", line = 697)
    public final boolean method66() {
        return this.field105 != 0;
    }

    @OriginalMember(owner = "client!j", name = "i", descriptor = "()V", line = 700)
    private final void method67() {
        this.field104 = this.field113;
        this.field106 = method90(this.field113, this.field111);
        this.field114 = method80(this.field113, this.field111);
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(II[B[IIIIIIIILj;II)I", line = 710)
    private static final int method68(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class7 arg11, int arg12, int arg13) {
        arg11.field106 -= arg11.field103 * arg5;
        arg11.field114 -= arg11.field108 * arg5;
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
        arg11.field106 += arg11.field103 * arg5;
        arg11.field114 += arg11.field108 * arg5;
        arg11.field104 = arg6;
        arg11.field110 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(II)V", line = 744)
    private final synchronized void method69(int arg0, int arg1) {
        this.field113 = arg0;
        this.field111 = arg1;
        this.field105 = 0;
        this.method67();
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(I[B[IIIIIIIIIILj;)I", line = 750)
    private static final int method70(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class7 arg12) {
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
        arg12.field104 += (var19 - arg4) * arg12.field107;
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
        arg12.field106 = var15 >> 2;
        arg12.field114 = var16 >> 2;
        arg12.field110 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!j", name = "c", descriptor = "(II[B[IIIIIIIILj;II)I", line = 803)
    private static final int method71(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class7 arg11, int arg12, int arg13) {
        arg11.field106 -= arg11.field103 * arg5;
        arg11.field114 -= arg11.field108 * arg5;
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
        arg11.field106 += arg11.field103 * arg5;
        arg11.field114 += arg11.field108 * arg5;
        arg11.field104 = arg6;
        arg11.field110 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!j", name = "c", descriptor = "(II)V", line = 837)
    public final synchronized void method72(int arg0, int arg1) {
        this.method64(arg0, arg1, this.method55());
    }

    @OriginalMember(owner = "client!j", name = "h", descriptor = "(I)V", line = 840)
    public final synchronized void method73(int arg0) {
        this.field115 = arg0;
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "([IIIII)I", line = 844)
    private final int method74(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field105 > 0) {
                int var6 = this.field105 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field105 += arg1;
                if (this.field112 == 256 && (this.field110 & 0xFF) == 0) {
                    if (class61.field946) {
                        arg1 = method60(0, ((class225) this.field2679).field3516, arg0, this.field110, arg1, this.field106, this.field114, this.field103, this.field108, 0, var6, arg2, this);
                    } else {
                        arg1 = method63(((class225) this.field2679).field3516, arg0, this.field110, arg1, this.field104, this.field107, 0, var6, arg2, this);
                    }
                } else if (class61.field946) {
                    arg1 = method87(0, 0, ((class225) this.field2679).field3516, arg0, this.field110, arg1, this.field106, this.field114, this.field103, this.field108, 0, var6, arg2, this, this.field112, arg4);
                } else {
                    arg1 = method68(0, 0, ((class225) this.field2679).field3516, arg0, this.field110, arg1, this.field104, this.field107, 0, var6, arg2, this, this.field112, arg4);
                }
                this.field105 -= arg1;
                if (this.field105 != 0) {
                    return arg1;
                }
                if (!this.method86()) {
                    continue;
                }
                return arg3;
            }
            if (this.field112 == 256 && (this.field110 & 0xFF) == 0) {
                if (class61.field946) {
                    return method77(0, ((class225) this.field2679).field3516, arg0, this.field110, arg1, this.field106, this.field114, 0, arg3, arg2, this);
                }
                return method83(((class225) this.field2679).field3516, arg0, this.field110, arg1, this.field104, 0, arg3, arg2, this);
            }
            if (class61.field946) {
                return method58(0, 0, ((class225) this.field2679).field3516, arg0, this.field110, arg1, this.field106, this.field114, 0, arg3, arg2, this, this.field112, arg4);
            }
            return method50(0, 0, ((class225) this.field2679).field3516, arg0, this.field110, arg1, this.field104, 0, arg3, arg2, this, this.field112, arg4);
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(I[B[IIIIIIIILj;)I", line = 900)
    private static final int method75(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class7 arg10) {
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
        arg10.field110 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!j", name = "i", descriptor = "(I)V", line = 938)
    private final synchronized void method76(int arg0) {
        this.method69(arg0, this.method55());
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(I[B[IIIIIIIILj;)I", line = 941)
    private static final int method77(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class7 arg10) {
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
        arg10.field110 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!j", name = "j", descriptor = "(I)V", line = 981)
    public final synchronized void method78(int arg0) {
        this.method69(arg0 << 6, this.method55());
    }

    @OriginalMember(owner = "client!j", name = "j", descriptor = "()Z", line = 985)
    public final boolean method79() {
        return this.field110 < 0 || this.field110 >= ((class225) this.field2679).field3516.length << 8;
    }

    @OriginalMember(owner = "client!j", name = "d", descriptor = "(II)I", line = 988)
    private static final int method80(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!j", name = "c", descriptor = "()Lph;", line = 993)
    public final class169 method81() {
        return null;
    }

    @OriginalMember(owner = "client!j", name = "d", descriptor = "(I)V", line = 999)
    public final synchronized void method82(int arg0) {
        if (this.field105 > 0) {
            if (arg0 >= this.field105) {
                if (this.field113 == Integer.MIN_VALUE) {
                    this.field113 = 0;
                    this.field104 = this.field106 = this.field114 = 0;
                    this.method1357(947647010);
                    arg0 = this.field105;
                }
                this.field105 = 0;
                this.method67();
            } else {
                this.field104 += this.field107 * arg0;
                this.field106 += this.field103 * arg0;
                this.field114 += this.field108 * arg0;
                this.field105 -= arg0;
            }
        }
        class225 var2 = (class225) this.field2679;
        int var3 = this.field109 << 8;
        int var4 = this.field117 << 8;
        int var5 = var2.field3516.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field115 = 0;
        }
        if (this.field110 < 0) {
            if (this.field112 <= 0) {
                this.method49();
                this.method1357(947647010);
                return;
            }
            this.field110 = 0;
        }
        if (this.field110 >= var5) {
            if (this.field112 >= 0) {
                this.method49();
                this.method1357(947647010);
                return;
            }
            this.field110 = var5 - 1;
        }
        this.field110 += this.field112 * arg0;
        if (this.field115 >= 0) {
            if (this.field115 > 0) {
                if (this.field116) {
                    label121: {
                        if (this.field112 < 0) {
                            if (this.field110 >= var3) {
                                return;
                            }
                            this.field110 = var3 + var3 - this.field110 - 1;
                            this.field112 = -this.field112;
                            if (--this.field115 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field110 < var4) {
                                return;
                            }
                            this.field110 = var4 + var4 - this.field110 - 1;
                            this.field112 = -this.field112;
                            if (--this.field115 == 0) {
                                break;
                            }
                            if (this.field110 >= var3) {
                                return;
                            }
                            this.field110 = var3 + var3 - this.field110 - 1;
                            this.field112 = -this.field112;
                        } while (--this.field115 != 0);
                    }
                } else {
                    label153: {
                        if (this.field112 < 0) {
                            if (this.field110 >= var3) {
                                return;
                            }
                            int var7 = (var4 - this.field110 - 1) / var6;
                            if (var7 >= this.field115) {
                                this.field110 += this.field115 * var6;
                                this.field115 = 0;
                                break label153;
                            }
                            this.field110 += var6 * var7;
                            this.field115 -= var7;
                        } else if (this.field110 >= var4) {
                            int var8 = (this.field110 - var3) / var6;
                            if (var8 >= this.field115) {
                                this.field110 -= this.field115 * var6;
                                this.field115 = 0;
                                break label153;
                            }
                            this.field110 -= var6 * var8;
                            this.field115 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field112 < 0) {
                if (this.field110 < 0) {
                    this.field110 = -1;
                    this.method49();
                    this.method1357(947647010);
                }
            } else if (this.field110 >= var5) {
                this.field110 = var5;
                this.method49();
                this.method1357(947647010);
            }
        } else if (this.field116) {
            if (this.field112 < 0) {
                if (this.field110 >= var3) {
                    return;
                }
                this.field110 = var3 + var3 - this.field110 - 1;
                this.field112 = -this.field112;
            }
            while (this.field110 >= var4) {
                this.field110 = var4 + var4 - this.field110 - 1;
                this.field112 = -this.field112;
                if (this.field110 >= var3) {
                    return;
                }
                this.field110 = var3 + var3 - this.field110 - 1;
                this.field112 = -this.field112;
            }
        } else if (this.field112 < 0) {
            if (this.field110 >= var3) {
                return;
            }
            this.field110 = var4 - (var4 - 1 - this.field110) % var6 - 1;
        } else if (this.field110 >= var4) {
            this.field110 = (this.field110 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "([B[IIIIIIILj;)I", line = 1218)
    private static final int method83(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class7 arg8) {
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
        arg8.field110 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!j", name = "k", descriptor = "()I", line = 1243)
    public final synchronized int method84() {
        return this.field112 < 0 ? -this.field112 : this.field112;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Z)V", line = 1247)
    public final synchronized void method85(boolean arg0) {
        this.field112 = (this.field112 >>> 31) + (this.field112 ^ this.field112 >> 31);
        if (arg0) {
            this.field112 = -this.field112;
        }
    }

    @OriginalMember(owner = "client!j", name = "l", descriptor = "()Z", line = 1254)
    private final boolean method86() {
        int var1 = this.field113;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method90(var1, this.field111);
            var2 = method80(var1, this.field111);
        }
        if (this.field104 != var1 || this.field106 != var3 || this.field114 != var2) {
            if (this.field104 < var1) {
                this.field107 = 1;
                this.field105 = var1 - this.field104;
            } else if (this.field104 > var1) {
                this.field107 = -1;
                this.field105 = this.field104 - var1;
            } else {
                this.field107 = 0;
            }
            if (this.field106 < var3) {
                this.field103 = 1;
                if (this.field105 == 0 || this.field105 > var3 - this.field106) {
                    this.field105 = var3 - this.field106;
                }
            } else if (this.field106 > var3) {
                this.field103 = -1;
                if (this.field105 == 0 || this.field105 > this.field106 - var3) {
                    this.field105 = this.field106 - var3;
                }
            } else {
                this.field103 = 0;
            }
            if (this.field114 < var2) {
                this.field108 = 1;
                if (this.field105 == 0 || this.field105 > var2 - this.field114) {
                    this.field105 = var2 - this.field114;
                }
            } else if (this.field114 > var2) {
                this.field108 = -1;
                if (this.field105 == 0 || this.field105 > this.field114 - var2) {
                    this.field105 = this.field114 - var2;
                }
            } else {
                this.field108 = 0;
            }
            return false;
        } else if (this.field113 == Integer.MIN_VALUE) {
            this.field113 = 0;
            this.field104 = this.field106 = this.field114 = 0;
            this.method1357(947647010);
            return true;
        } else {
            this.method67();
            return false;
        }
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(II[B[IIIIIIIIIILj;II)I", line = 1339)
    private static final int method87(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class7 arg13, int arg14, int arg15) {
        arg13.field104 -= arg13.field107 * arg5;
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
        arg13.field104 += arg13.field107 * var27;
        arg13.field106 = arg6;
        arg13.field114 = arg7;
        arg13.field110 = arg4;
        return var27;
    }

    @OriginalMember(owner = "client!j", name = "d", descriptor = "()I", line = 1381)
    public final int method88() {
        return this.field113 == 0 && this.field105 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(II[B[IIIIIIILj;II)I", line = 1387)
    private static final int method89(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class7 arg10, int arg11, int arg12) {
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
        arg10.field110 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!j", name = "e", descriptor = "(II)I", line = 1415)
    private static final int method90(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Lqj;II)Lj;", line = 1418)
    public static final class7 method91(class225 arg0, int arg1, int arg2) {
        return arg0.field3516 == null || arg0.field3516.length == 0 ? null : new class7(arg0, (int) ((long) arg0.field3515 * 256L * (long) arg1 / (long) (class294.field4571 * 100)), arg2 << 6);
    }

    @OriginalMember(owner = "client!j", name = "d", descriptor = "(II[B[IIIIIIIILj;II)I", line = 1424)
    private static final int method92(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class7 arg11, int arg12, int arg13) {
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
        arg11.field110 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Lqj;II)V", line = 1458)
    private class7(class225 arg0, int arg1, int arg2) {
        this.field2679 = arg0;
        this.field109 = arg0.field3517;
        this.field117 = arg0.field3514;
        this.field116 = arg0.field3518;
        this.field112 = arg1;
        this.field113 = arg2;
        this.field111 = 8192;
        this.field110 = 0;
        this.method67();
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Lqj;III)V", line = 1469)
    private class7(class225 arg0, int arg1, int arg2, int arg3) {
        this.field2679 = arg0;
        this.field109 = arg0.field3517;
        this.field117 = arg0.field3514;
        this.field116 = arg0.field3518;
        this.field112 = arg1;
        this.field113 = arg2;
        this.field111 = arg3;
        this.field110 = 0;
        this.method67();
    }
}
