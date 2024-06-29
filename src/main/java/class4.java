import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class4 extends class127 {

    @OriginalMember(owner = "client!nc", name = "D", descriptor = "I")
    private int field99;

    @OriginalMember(owner = "client!nc", name = "E", descriptor = "I")
    private int field100;

    @OriginalMember(owner = "client!nc", name = "C", descriptor = "Z")
    private boolean field98;

    @OriginalMember(owner = "client!nc", name = "G", descriptor = "I")
    private int field102;

    @OriginalMember(owner = "client!nc", name = "M", descriptor = "I")
    private int field108;

    @OriginalMember(owner = "client!nc", name = "K", descriptor = "I")
    private int field106;

    @OriginalMember(owner = "client!nc", name = "B", descriptor = "I")
    private int field97;

    @OriginalMember(owner = "client!nc", name = "F", descriptor = "I")
    private int field101;

    @OriginalMember(owner = "client!nc", name = "H", descriptor = "I")
    private int field103;

    @OriginalMember(owner = "client!nc", name = "I", descriptor = "I")
    private int field104;

    @OriginalMember(owner = "client!nc", name = "J", descriptor = "I")
    private int field105;

    @OriginalMember(owner = "client!nc", name = "L", descriptor = "I")
    private int field107;

    @OriginalMember(owner = "client!nc", name = "y", descriptor = "I")
    private int field94;

    @OriginalMember(owner = "client!nc", name = "z", descriptor = "I")
    private int field95;

    @OriginalMember(owner = "client!nc", name = "A", descriptor = "I")
    private int field96;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(II[B[IIIIIIIILnc;II)I")
    private static final int method47(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class4 arg11, int arg12, int arg13) {
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
        arg11.field97 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "([B[IIIIIIILnc;)I")
    private static final int method48(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class4 arg8) {
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
        arg8.field97 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(II[B[IIIIIIIIIILnc;II)I")
    private static final int method49(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class4 arg13, int arg14, int arg15) {
        arg13.field96 -= arg13.field104 * arg5;
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
        arg13.field96 += arg13.field104 * var22;
        arg13.field95 = arg6;
        arg13.field103 = arg7;
        arg13.field97 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "()I")
    public final synchronized int method50() {
        return this.field106 < 0 ? -1 : this.field106;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(I[B[IIIIIIIILnc;)I")
    private static final int method51(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class4 arg10) {
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
        arg10.field97 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "(I)V")
    public final synchronized void method52(int arg0) {
        int var2 = ((class261) super.field2270).field4523.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field97 = arg0;
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(II[B[IIIIIIIILnc;II)I")
    private static final int method53(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class4 arg11, int arg12, int arg13) {
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
        arg11.field97 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(I[B[IIIIIIIILnc;)I")
    private static final int method54(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class4 arg10) {
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
        arg10.field97 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(II[B[IIIIIIILnc;II)I")
    private static final int method55(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class4 arg10, int arg11, int arg12) {
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
        arg10.field97 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(II[B[IIIIIIILnc;II)I")
    private static final int method56(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class4 arg10, int arg11, int arg12) {
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
        arg10.field97 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!nc", name = "g", descriptor = "(I)V")
    public final synchronized void method57(int arg0) {
        this.method61(arg0 << 6, this.method50());
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "([B[IIIIIIIILnc;)I")
    private static final int method58(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class4 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field95 += (var14 - arg3) * arg9.field107;
        arg9.field103 += (var14 - arg3) * arg9.field94;
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
        arg9.field96 = var12 >> 2;
        arg9.field97 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "(I)V")
    public final synchronized void method40(int arg0) {
        if (this.field101 > 0) {
            if (arg0 >= this.field101) {
                if (this.field108 == Integer.MIN_VALUE) {
                    this.field108 = 0;
                    this.field96 = this.field95 = this.field103 = 0;
                    this.method254(1);
                    arg0 = this.field101;
                }
                this.field101 = 0;
                this.method72();
            } else {
                this.field96 += this.field104 * arg0;
                this.field95 += this.field107 * arg0;
                this.field103 += this.field94 * arg0;
                this.field101 -= arg0;
            }
        }
        class261 var2 = (class261) super.field2270;
        int var3 = this.field99 << 8;
        int var4 = this.field100 << 8;
        int var5 = var2.field4523.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field105 = 0;
        }
        if (this.field97 < 0) {
            if (this.field102 <= 0) {
                this.method70();
                this.method254(1);
                return;
            }
            this.field97 = 0;
        }
        if (this.field97 >= var5) {
            if (this.field102 >= 0) {
                this.method70();
                this.method254(1);
                return;
            }
            this.field97 = var5 - 1;
        }
        this.field97 += this.field102 * arg0;
        if (this.field105 < 0) {
            if (!this.field98) {
                if (this.field102 < 0) {
                    if (this.field97 < var3) {
                        this.field97 = var4 - 1 - (var4 - 1 - this.field97) % var6;
                    }
                } else if (this.field97 >= var4) {
                    this.field97 = (this.field97 - var3) % var6 + var3;
                }
            } else {
                if (this.field102 < 0) {
                    if (this.field97 >= var3) {
                        return;
                    }
                    this.field97 = var3 + var3 - 1 - this.field97;
                    this.field102 = -this.field102;
                }
                while (this.field97 >= var4) {
                    this.field97 = var4 + var4 - 1 - this.field97;
                    this.field102 = -this.field102;
                    if (this.field97 >= var3) {
                        return;
                    }
                    this.field97 = var3 + var3 - 1 - this.field97;
                    this.field102 = -this.field102;
                }
            }
        } else {
            if (this.field105 > 0) {
                if (this.field98) {
                    label125: {
                        if (this.field102 < 0) {
                            if (this.field97 >= var3) {
                                return;
                            }
                            this.field97 = var3 + var3 - 1 - this.field97;
                            this.field102 = -this.field102;
                            if (--this.field105 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field97 < var4) {
                                return;
                            }
                            this.field97 = var4 + var4 - 1 - this.field97;
                            this.field102 = -this.field102;
                            if (--this.field105 == 0) {
                                break;
                            }
                            if (this.field97 >= var3) {
                                return;
                            }
                            this.field97 = var3 + var3 - 1 - this.field97;
                            this.field102 = -this.field102;
                        } while (--this.field105 != 0);
                    }
                } else if (this.field102 < 0) {
                    if (this.field97 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field97) / var6;
                    if (var7 < this.field105) {
                        this.field97 += var6 * var7;
                        this.field105 -= var7;
                        return;
                    }
                    this.field97 += this.field105 * var6;
                    this.field105 = 0;
                } else {
                    if (this.field97 < var4) {
                        return;
                    }
                    int var8 = (this.field97 - var3) / var6;
                    if (var8 < this.field105) {
                        this.field97 -= var6 * var8;
                        this.field105 -= var8;
                        return;
                    }
                    this.field97 -= this.field105 * var6;
                    this.field105 = 0;
                }
            }
            if (this.field102 < 0) {
                if (this.field97 < 0) {
                    this.field97 = -1;
                    this.method70();
                    this.method254(1);
                    return;
                }
            } else if (this.field97 >= var5) {
                this.field97 = var5;
                this.method70();
                this.method254(1);
            }
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Z)V")
    public final synchronized void method59(boolean arg0) {
        this.field102 = (this.field102 >>> 31) + (this.field102 ^ this.field102 >> 31);
        if (arg0) {
            this.field102 = -this.field102;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "([IIIII)I")
    private final int method60(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field101 <= 0) {
                if (this.field102 == 256 && (this.field97 & 255) == 0) {
                    if (class102.field1899) {
                        return method51(0, ((class261) super.field2270).field4523, arg0, this.field97, arg1, this.field95, this.field103, 0, arg3, arg2, this);
                    }
                    return method68(((class261) super.field2270).field4523, arg0, this.field97, arg1, this.field96, 0, arg3, arg2, this);
                }
                if (class102.field1899) {
                    return method53(0, 0, ((class261) super.field2270).field4523, arg0, this.field97, arg1, this.field95, this.field103, 0, arg3, arg2, this, this.field102, arg4);
                }
                return method56(0, 0, ((class261) super.field2270).field4523, arg0, this.field97, arg1, this.field96, 0, arg3, arg2, this, this.field102, arg4);
            }
            int var6 = this.field101 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field101 += arg1;
            if (this.field102 == 256 && (this.field97 & 255) == 0) {
                if (class102.field1899) {
                    arg1 = method63(0, ((class261) super.field2270).field4523, arg0, this.field97, arg1, this.field95, this.field103, this.field107, this.field94, 0, var6, arg2, this);
                } else {
                    arg1 = method58(((class261) super.field2270).field4523, arg0, this.field97, arg1, this.field96, this.field104, 0, var6, arg2, this);
                }
            } else if (class102.field1899) {
                arg1 = method67(0, 0, ((class261) super.field2270).field4523, arg0, this.field97, arg1, this.field95, this.field103, this.field107, this.field94, 0, var6, arg2, this, this.field102, arg4);
            } else {
                arg1 = method76(0, 0, ((class261) super.field2270).field4523, arg0, this.field97, arg1, this.field96, this.field104, 0, var6, arg2, this, this.field102, arg4);
            }
            this.field101 -= arg1;
            if (this.field101 != 0) {
                return arg1;
            }
        } while (!this.method87());
        return arg3;
    }

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "(II)V")
    private final synchronized void method61(int arg0, int arg1) {
        this.field108 = arg0;
        this.field106 = arg1;
        this.field101 = 0;
        this.method72();
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(III)V")
    public final synchronized void method62(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method61(arg1, arg2);
        } else {
            int var4 = method64(arg1, arg2);
            int var5 = method66(arg1, arg2);
            if (this.field95 == var4 && this.field103 == var5) {
                this.field101 = 0;
            } else {
                int var6 = arg1 - this.field96;
                if (this.field96 - arg1 > var6) {
                    var6 = this.field96 - arg1;
                }
                if (var4 - this.field95 > var6) {
                    var6 = var4 - this.field95;
                }
                if (this.field95 - var4 > var6) {
                    var6 = this.field95 - var4;
                }
                if (var5 - this.field103 > var6) {
                    var6 = var5 - this.field103;
                }
                if (this.field103 - var5 > var6) {
                    var6 = this.field103 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field101 = arg0;
                this.field108 = arg1;
                this.field106 = arg2;
                this.field104 = (arg1 - this.field96) / arg0;
                this.field107 = (var4 - this.field95) / arg0;
                this.field94 = (var5 - this.field103) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(I[B[IIIIIIIIIILnc;)I")
    private static final int method63(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class4 arg12) {
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
        arg12.field96 += (var19 - arg4) * arg12.field104;
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
        arg12.field95 = var15 >> 2;
        arg12.field103 = var16 >> 2;
        arg12.field97 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "(II)I")
    private static final int method64(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Loh;III)Lnc;")
    public static final class4 method65(class261 arg0, int arg1, int arg2, int arg3) {
        return arg0.field4523 != null && arg0.field4523.length != 0 ? new class4(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "(II)I")
    private static final int method66(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(II[B[IIIIIIIIIILnc;II)I")
    private static final int method67(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class4 arg13, int arg14, int arg15) {
        arg13.field96 -= arg13.field104 * arg5;
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
        arg13.field96 += arg13.field104 * var22;
        arg13.field95 = arg6;
        arg13.field103 = arg7;
        arg13.field97 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "([B[IIIIIIILnc;)I")
    private static final int method68(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class4 arg8) {
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
        arg8.field97 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "([B[IIIIIIIILnc;)I")
    private static final int method69(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class4 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field95 += (var14 - arg3) * arg9.field107;
        arg9.field103 += (var14 - arg3) * arg9.field94;
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
        arg9.field96 = var12 >> 2;
        arg9.field97 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "()V")
    private final void method70() {
        if (this.field101 != 0) {
            if (this.field108 == Integer.MIN_VALUE) {
                this.field108 = 0;
            }
            this.field101 = 0;
            this.method72();
        }
    }

    @OriginalMember(owner = "client!nc", name = "g", descriptor = "()Z")
    public final boolean method71() {
        return this.field97 < 0 || this.field97 >= ((class261) super.field2270).field4523.length << 8;
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "()Lr;")
    public final class127 method24() {
        return null;
    }

    @OriginalMember(owner = "client!nc", name = "h", descriptor = "()V")
    private final void method72() {
        this.field96 = this.field108;
        this.field95 = method64(this.field108, this.field106);
        this.field103 = method66(this.field108, this.field106);
    }

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "(II[B[IIIIIIIILnc;II)I")
    private static final int method73(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class4 arg11, int arg12, int arg13) {
        arg11.field95 -= arg11.field107 * arg5;
        arg11.field103 -= arg11.field94 * arg5;
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
        arg11.field95 += arg11.field107 * arg5;
        arg11.field103 += arg11.field94 * arg5;
        arg11.field96 = arg6;
        arg11.field97 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(I[B[IIIIIIIIIILnc;)I")
    private static final int method74(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class4 arg12) {
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
        arg12.field96 += (var19 - arg4) * arg12.field104;
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
        arg12.field95 = var15 >> 2;
        arg12.field103 = var16 >> 2;
        arg12.field97 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "()I")
    public final int method37() {
        return this.field108 == 0 && this.field101 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "()I")
    public final int method75() {
        int var1 = this.field96 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field105 == 0) {
            var2 -= this.field97 * var2 / (((class261) super.field2270).field4523.length << 8);
        } else if (this.field105 >= 0) {
            var2 -= this.field99 * var2 / ((class261) super.field2270).field4523.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "(II[B[IIIIIIIILnc;II)I")
    private static final int method76(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class4 arg11, int arg12, int arg13) {
        arg11.field95 -= arg11.field107 * arg5;
        arg11.field103 -= arg11.field94 * arg5;
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
        arg11.field95 += arg11.field107 * arg5;
        arg11.field103 += arg11.field94 * arg5;
        arg11.field96 = arg6;
        arg11.field97 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!nc", name = "h", descriptor = "(I)V")
    public final synchronized void method77(int arg0) {
        this.field105 = arg0;
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "([IIIII)I")
    private final int method78(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field101 <= 0) {
                if (this.field102 == -256 && (this.field97 & 255) == 0) {
                    if (class102.field1899) {
                        return method54(0, ((class261) super.field2270).field4523, arg0, this.field97, arg1, this.field95, this.field103, 0, arg3, arg2, this);
                    }
                    return method48(((class261) super.field2270).field4523, arg0, this.field97, arg1, this.field96, 0, arg3, arg2, this);
                }
                if (class102.field1899) {
                    return method47(0, 0, ((class261) super.field2270).field4523, arg0, this.field97, arg1, this.field95, this.field103, 0, arg3, arg2, this, this.field102, arg4);
                }
                return method55(0, 0, ((class261) super.field2270).field4523, arg0, this.field97, arg1, this.field96, 0, arg3, arg2, this, this.field102, arg4);
            }
            int var6 = this.field101 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field101 += arg1;
            if (this.field102 == -256 && (this.field97 & 255) == 0) {
                if (class102.field1899) {
                    arg1 = method74(0, ((class261) super.field2270).field4523, arg0, this.field97, arg1, this.field95, this.field103, this.field107, this.field94, 0, var6, arg2, this);
                } else {
                    arg1 = method69(((class261) super.field2270).field4523, arg0, this.field97, arg1, this.field96, this.field104, 0, var6, arg2, this);
                }
            } else if (class102.field1899) {
                arg1 = method49(0, 0, ((class261) super.field2270).field4523, arg0, this.field97, arg1, this.field95, this.field103, this.field107, this.field94, 0, var6, arg2, this, this.field102, arg4);
            } else {
                arg1 = method73(0, 0, ((class261) super.field2270).field4523, arg0, this.field97, arg1, this.field96, this.field104, 0, var6, arg2, this, this.field102, arg4);
            }
            this.field101 -= arg1;
            if (this.field101 != 0) {
                return arg1;
            }
        } while (!this.method87());
        return arg3;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "([III)V")
    public final synchronized void method12(int[] arg0, int arg1, int arg2) {
        if (this.field108 == 0 && this.field101 == 0) {
            this.method40(arg2);
        } else {
            class261 var4 = (class261) super.field2270;
            int var5 = this.field99 << 8;
            int var6 = this.field100 << 8;
            int var7 = var4.field4523.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field105 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field97 < 0) {
                if (this.field102 <= 0) {
                    this.method70();
                    this.method254(1);
                    return;
                }
                this.field97 = 0;
            }
            if (this.field97 >= var7) {
                if (this.field102 >= 0) {
                    this.method70();
                    this.method254(1);
                    return;
                }
                this.field97 = var7 - 1;
            }
            if (this.field105 < 0) {
                if (this.field98) {
                    if (this.field102 < 0) {
                        var9 = this.method78(arg0, arg1, var5, var10, var4.field4523[this.field99]);
                        if (this.field97 >= var5) {
                            return;
                        }
                        this.field97 = var5 + var5 - 1 - this.field97;
                        this.field102 = -this.field102;
                    }
                    while (true) {
                        int var11 = this.method60(arg0, var9, var6, var10, var4.field4523[this.field100 - 1]);
                        if (this.field97 < var6) {
                            return;
                        }
                        this.field97 = var6 + var6 - 1 - this.field97;
                        this.field102 = -this.field102;
                        var9 = this.method78(arg0, var11, var5, var10, var4.field4523[this.field99]);
                        if (this.field97 >= var5) {
                            return;
                        }
                        this.field97 = var5 + var5 - 1 - this.field97;
                        this.field102 = -this.field102;
                    }
                } else if (this.field102 < 0) {
                    while (true) {
                        var9 = this.method78(arg0, var9, var5, var10, var4.field4523[this.field100 - 1]);
                        if (this.field97 >= var5) {
                            return;
                        }
                        this.field97 = var6 - 1 - (var6 - 1 - this.field97) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method60(arg0, var9, var6, var10, var4.field4523[this.field99]);
                        if (this.field97 < var6) {
                            return;
                        }
                        this.field97 = (this.field97 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field105 > 0) {
                    if (this.field98) {
                        label130: {
                            if (this.field102 < 0) {
                                var9 = this.method78(arg0, arg1, var5, var10, var4.field4523[this.field99]);
                                if (this.field97 >= var5) {
                                    return;
                                }
                                this.field97 = var5 + var5 - 1 - this.field97;
                                this.field102 = -this.field102;
                                if (--this.field105 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method60(arg0, var9, var6, var10, var4.field4523[this.field100 - 1]);
                                if (this.field97 < var6) {
                                    return;
                                }
                                this.field97 = var6 + var6 - 1 - this.field97;
                                this.field102 = -this.field102;
                                if (--this.field105 == 0) {
                                    break;
                                }
                                var9 = this.method78(arg0, var9, var5, var10, var4.field4523[this.field99]);
                                if (this.field97 >= var5) {
                                    return;
                                }
                                this.field97 = var5 + var5 - 1 - this.field97;
                                this.field102 = -this.field102;
                            } while (--this.field105 != 0);
                        }
                    } else if (this.field102 < 0) {
                        while (true) {
                            var9 = this.method78(arg0, var9, var5, var10, var4.field4523[this.field100 - 1]);
                            if (this.field97 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field97) / var8;
                            if (var12 >= this.field105) {
                                this.field97 += this.field105 * var8;
                                this.field105 = 0;
                                break;
                            }
                            this.field97 += var8 * var12;
                            this.field105 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method60(arg0, var9, var6, var10, var4.field4523[this.field99]);
                            if (this.field97 < var6) {
                                return;
                            }
                            int var13 = (this.field97 - var5) / var8;
                            if (var13 >= this.field105) {
                                this.field97 -= this.field105 * var8;
                                this.field105 = 0;
                                break;
                            }
                            this.field97 -= var8 * var13;
                            this.field105 -= var13;
                        }
                    }
                }
                if (this.field102 < 0) {
                    this.method78(arg0, var9, 0, var10, 0);
                    if (this.field97 < 0) {
                        this.field97 = -1;
                        this.method70();
                        this.method254(1);
                        return;
                    }
                } else {
                    this.method60(arg0, var9, var7, var10, 0);
                    if (this.field97 >= var7) {
                        this.field97 = var7;
                        this.method70();
                        this.method254(1);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nc", name = "i", descriptor = "()I")
    public final synchronized int method79() {
        return this.field102 < 0 ? -this.field102 : this.field102;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Loh;II)Lnc;")
    public static final class4 method80(class261 arg0, int arg1, int arg2) {
        return arg0.field4523 != null && arg0.field4523.length != 0 ? new class4(arg0, (int) ((long) arg0.field4522 * 256L * (long) arg1 / (long) (class134.field2399 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!nc", name = "j", descriptor = "()Z")
    public final boolean method81() {
        return this.field101 != 0;
    }

    @OriginalMember(owner = "client!nc", name = "i", descriptor = "(I)V")
    public final synchronized void method82(int arg0) {
        if (arg0 == 0) {
            this.method86(0);
            this.method254(1);
        } else if (this.field95 == 0 && this.field103 == 0) {
            this.field101 = 0;
            this.field108 = 0;
            this.field96 = 0;
            this.method254(1);
        } else {
            int var2 = -this.field96;
            if (this.field96 > var2) {
                var2 = this.field96;
            }
            if (-this.field95 > var2) {
                var2 = -this.field95;
            }
            if (this.field95 > var2) {
                var2 = this.field95;
            }
            if (-this.field103 > var2) {
                var2 = -this.field103;
            }
            if (this.field103 > var2) {
                var2 = this.field103;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field101 = arg0;
            this.field108 = Integer.MIN_VALUE;
            this.field104 = -this.field96 / arg0;
            this.field107 = -this.field95 / arg0;
            this.field94 = -this.field103 / arg0;
        }
    }

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "(II)V")
    public final synchronized void method83(int arg0, int arg1) {
        this.method62(arg0, arg1, this.method50());
    }

    @OriginalMember(owner = "client!nc", name = "j", descriptor = "(I)V")
    public final synchronized void method84(int arg0) {
        if (this.field102 < 0) {
            this.field102 = -arg0;
        } else {
            this.field102 = arg0;
        }
    }

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(Loh;II)V")
    private class4(class261 arg0, int arg1, int arg2) {
        super.field2270 = arg0;
        this.field99 = arg0.field4521;
        this.field100 = arg0.field4520;
        this.field98 = arg0.field4519;
        this.field102 = arg1;
        this.field108 = arg2;
        this.field106 = 8192;
        this.field97 = 0;
        this.method72();
    }

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(Loh;III)V")
    private class4(class261 arg0, int arg1, int arg2, int arg3) {
        super.field2270 = arg0;
        this.field99 = arg0.field4521;
        this.field100 = arg0.field4520;
        this.field98 = arg0.field4519;
        this.field102 = arg1;
        this.field108 = arg2;
        this.field106 = arg3;
        this.field97 = 0;
        this.method72();
    }

    @OriginalMember(owner = "client!nc", name = "k", descriptor = "()I")
    public final synchronized int method85() {
        return this.field108 == Integer.MIN_VALUE ? 0 : this.field108;
    }

    @OriginalMember(owner = "client!nc", name = "k", descriptor = "(I)V")
    private final synchronized void method86(int arg0) {
        this.method61(arg0, this.method50());
    }

    @OriginalMember(owner = "client!nc", name = "l", descriptor = "()Z")
    private final boolean method87() {
        int var1 = this.field108;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method64(var1, this.field106);
            var2 = method66(var1, this.field106);
        }
        if (this.field96 == var1 && this.field95 == var3 && this.field103 == var2) {
            if (this.field108 == Integer.MIN_VALUE) {
                this.field108 = 0;
                this.field96 = this.field95 = this.field103 = 0;
                this.method254(1);
                return true;
            } else {
                this.method72();
                return false;
            }
        } else {
            if (this.field96 < var1) {
                this.field104 = 1;
                this.field101 = var1 - this.field96;
            } else if (this.field96 > var1) {
                this.field104 = -1;
                this.field101 = this.field96 - var1;
            } else {
                this.field104 = 0;
            }
            if (this.field95 < var3) {
                this.field107 = 1;
                if (this.field101 == 0 || this.field101 > var3 - this.field95) {
                    this.field101 = var3 - this.field95;
                }
            } else if (this.field95 > var3) {
                this.field107 = -1;
                if (this.field101 == 0 || this.field101 > this.field95 - var3) {
                    this.field101 = this.field95 - var3;
                }
            } else {
                this.field107 = 0;
            }
            if (this.field103 < var2) {
                this.field94 = 1;
                if (this.field101 == 0 || this.field101 > var2 - this.field103) {
                    this.field101 = var2 - this.field103;
                }
            } else if (this.field103 > var2) {
                this.field94 = -1;
                if (this.field101 == 0 || this.field101 > this.field103 - var2) {
                    this.field101 = this.field103 - var2;
                }
            } else {
                this.field94 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "()Lr;")
    public final class127 method27() {
        return null;
    }
}
