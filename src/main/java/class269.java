import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class269 extends class210 {

    @OriginalMember(owner = "client!t", name = "D", descriptor = "I")
    private int field4150;

    @OriginalMember(owner = "client!t", name = "x", descriptor = "I")
    private int field4144;

    @OriginalMember(owner = "client!t", name = "y", descriptor = "Z")
    private boolean field4145;

    @OriginalMember(owner = "client!t", name = "z", descriptor = "I")
    private int field4146;

    @OriginalMember(owner = "client!t", name = "u", descriptor = "I")
    private int field4141;

    @OriginalMember(owner = "client!t", name = "v", descriptor = "I")
    private int field4142;

    @OriginalMember(owner = "client!t", name = "E", descriptor = "I")
    private int field4151;

    @OriginalMember(owner = "client!t", name = "r", descriptor = "I")
    private int field4138;

    @OriginalMember(owner = "client!t", name = "s", descriptor = "I")
    private int field4139;

    @OriginalMember(owner = "client!t", name = "t", descriptor = "I")
    private int field4140;

    @OriginalMember(owner = "client!t", name = "w", descriptor = "I")
    private int field4143;

    @OriginalMember(owner = "client!t", name = "A", descriptor = "I")
    private int field4147;

    @OriginalMember(owner = "client!t", name = "B", descriptor = "I")
    private int field4148;

    @OriginalMember(owner = "client!t", name = "C", descriptor = "I")
    private int field4149;

    @OriginalMember(owner = "client!t", name = "F", descriptor = "I")
    private int field4152;

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(I)V", line = 3)
    public final synchronized void method1874(int arg0) {
        if (this.field4146 < 0) {
            this.field4146 = -arg0;
        } else {
            this.field4146 = arg0;
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(I[B[IIIIIIIILt;)I", line = 12)
    private static final int method1875(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class269 arg10) {
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
        arg10.field4151 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(II)I", line = 50)
    private static final int method1876(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!t", name = "e", descriptor = "()I", line = 53)
    public final synchronized int method1877() {
        return this.field4141 == Integer.MIN_VALUE ? 0 : this.field4141;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(II[B[IIIIIIIILt;II)I", line = 57)
    private static final int method1878(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class269 arg11, int arg12, int arg13) {
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
        arg11.field4151 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!t", name = "f", descriptor = "()Z", line = 90)
    public final boolean method1879() {
        return this.field4151 < 0 || this.field4151 >= ((class187) this.field3306).field2942.length << 8;
    }

    @OriginalMember(owner = "client!t", name = "c", descriptor = "(I)V", line = 93)
    public final synchronized void method1880(int arg0) {
        this.field4147 = arg0;
    }

    @OriginalMember(owner = "client!t", name = "d", descriptor = "(I)V", line = 96)
    public final synchronized void method1881(int arg0) {
        this.method1901(arg0 << 6, this.method1894());
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "([III)V", line = 99)
    public final synchronized void method232(int[] arg0, int arg1, int arg2) {
        if (this.field4141 == 0 && this.field4143 == 0) {
            this.method235(arg2);
            return;
        }
        class187 var4 = (class187) this.field3306;
        int var5 = this.field4150 << 8;
        int var6 = this.field4144 << 8;
        int var7 = var4.field2942.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field4147 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field4151 < 0) {
            if (this.field4146 <= 0) {
                this.method1902();
                this.method489(false);
                return;
            }
            this.field4151 = 0;
        }
        if (this.field4151 >= var7) {
            if (this.field4146 >= 0) {
                this.method1902();
                this.method489(false);
                return;
            }
            this.field4151 = var7 - 1;
        }
        if (this.field4147 >= 0) {
            if (this.field4147 > 0) {
                if (this.field4145) {
                    label131: {
                        if (this.field4146 < 0) {
                            var9 = this.method1896(arg0, arg1, var5, var10, var4.field2942[this.field4150]);
                            if (this.field4151 >= var5) {
                                return;
                            }
                            this.field4151 = var5 + var5 - this.field4151 - 1;
                            this.field4146 = -this.field4146;
                            if (--this.field4147 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method1912(arg0, var9, var6, var10, var4.field2942[this.field4144 - 1]);
                            if (this.field4151 < var6) {
                                return;
                            }
                            this.field4151 = var6 + var6 - this.field4151 - 1;
                            this.field4146 = -this.field4146;
                            if (--this.field4147 == 0) {
                                break;
                            }
                            var9 = this.method1896(arg0, var9, var5, var10, var4.field2942[this.field4150]);
                            if (this.field4151 >= var5) {
                                return;
                            }
                            this.field4151 = var5 + var5 - this.field4151 - 1;
                            this.field4146 = -this.field4146;
                        } while (--this.field4147 != 0);
                    }
                } else if (this.field4146 < 0) {
                    while (true) {
                        var9 = this.method1896(arg0, var9, var5, var10, var4.field2942[this.field4144 - 1]);
                        if (this.field4151 >= var5) {
                            return;
                        }
                        int var12 = (var6 - this.field4151 - 1) / var8;
                        if (var12 >= this.field4147) {
                            this.field4151 += this.field4147 * var8;
                            this.field4147 = 0;
                            break;
                        }
                        this.field4151 += var8 * var12;
                        this.field4147 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method1912(arg0, var9, var6, var10, var4.field2942[this.field4150]);
                        if (this.field4151 < var6) {
                            return;
                        }
                        int var13 = (this.field4151 - var5) / var8;
                        if (var13 >= this.field4147) {
                            this.field4151 -= this.field4147 * var8;
                            this.field4147 = 0;
                            break;
                        }
                        this.field4151 -= var8 * var13;
                        this.field4147 -= var13;
                    }
                }
            }
            if (this.field4146 < 0) {
                this.method1896(arg0, var9, 0, var10, 0);
                if (this.field4151 < 0) {
                    this.field4151 = -1;
                    this.method1902();
                    this.method489(false);
                }
            } else {
                this.method1912(arg0, var9, var7, var10, 0);
                if (this.field4151 >= var7) {
                    this.field4151 = var7;
                    this.method1902();
                    this.method489(false);
                }
            }
        } else if (this.field4145) {
            if (this.field4146 < 0) {
                var9 = this.method1896(arg0, arg1, var5, var10, var4.field2942[this.field4150]);
                if (this.field4151 >= var5) {
                    return;
                }
                this.field4151 = var5 + var5 - this.field4151 - 1;
                this.field4146 = -this.field4146;
            }
            while (true) {
                int var11 = this.method1912(arg0, var9, var6, var10, var4.field2942[this.field4144 - 1]);
                if (this.field4151 < var6) {
                    return;
                }
                this.field4151 = var6 + var6 - this.field4151 - 1;
                this.field4146 = -this.field4146;
                var9 = this.method1896(arg0, var11, var5, var10, var4.field2942[this.field4150]);
                if (this.field4151 >= var5) {
                    return;
                }
                this.field4151 = var5 + var5 - this.field4151 - 1;
                this.field4146 = -this.field4146;
            }
        } else if (this.field4146 < 0) {
            while (true) {
                var9 = this.method1896(arg0, var9, var5, var10, var4.field2942[this.field4144 - 1]);
                if (this.field4151 >= var5) {
                    return;
                }
                this.field4151 = var6 - (var6 - 1 - this.field4151) % var8 - 1;
            }
        } else {
            while (true) {
                var9 = this.method1912(arg0, var9, var6, var10, var4.field2942[this.field4150]);
                if (this.field4151 < var6) {
                    return;
                }
                this.field4151 = (this.field4151 - var5) % var8 + var5;
            }
        }
    }

    @OriginalMember(owner = "client!t", name = "c", descriptor = "(Z)V", line = 335)
    public final synchronized void method1882(boolean arg0) {
        this.field4146 = (this.field4146 >>> 31) + (this.field4146 ^ this.field4146 >> 31);
        if (arg0) {
            this.field4146 = -this.field4146;
        }
    }

    @OriginalMember(owner = "client!t", name = "g", descriptor = "()V", line = 341)
    private final void method1883() {
        this.field4148 = this.field4141;
        this.field4140 = method1876(this.field4141, this.field4142);
        this.field4138 = method1886(this.field4141, this.field4142);
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "([B[IIIIIIIILt;)I", line = 346)
    private static final int method1884(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class269 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field4140 += (var14 - arg3) * arg9.field4139;
        arg9.field4138 += (var14 - arg3) * arg9.field4152;
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
        arg9.field4148 = var12 >> 2;
        arg9.field4151 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(I)V", line = 381)
    public final synchronized void method235(int arg0) {
        if (this.field4143 > 0) {
            if (arg0 >= this.field4143) {
                if (this.field4141 == Integer.MIN_VALUE) {
                    this.field4141 = 0;
                    this.field4148 = this.field4140 = this.field4138 = 0;
                    this.method489(false);
                    arg0 = this.field4143;
                }
                this.field4143 = 0;
                this.method1883();
            } else {
                this.field4148 += this.field4149 * arg0;
                this.field4140 += this.field4139 * arg0;
                this.field4138 += this.field4152 * arg0;
                this.field4143 -= arg0;
            }
        }
        class187 var2 = (class187) this.field3306;
        int var3 = this.field4150 << 8;
        int var4 = this.field4144 << 8;
        int var5 = var2.field2942.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field4147 = 0;
        }
        if (this.field4151 < 0) {
            if (this.field4146 <= 0) {
                this.method1902();
                this.method489(false);
                return;
            }
            this.field4151 = 0;
        }
        if (this.field4151 >= var5) {
            if (this.field4146 >= 0) {
                this.method1902();
                this.method489(false);
                return;
            }
            this.field4151 = var5 - 1;
        }
        this.field4151 += this.field4146 * arg0;
        if (this.field4147 >= 0) {
            if (this.field4147 > 0) {
                if (this.field4145) {
                    label121: {
                        if (this.field4146 < 0) {
                            if (this.field4151 >= var3) {
                                return;
                            }
                            this.field4151 = var3 + var3 - this.field4151 - 1;
                            this.field4146 = -this.field4146;
                            if (--this.field4147 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field4151 < var4) {
                                return;
                            }
                            this.field4151 = var4 + var4 - this.field4151 - 1;
                            this.field4146 = -this.field4146;
                            if (--this.field4147 == 0) {
                                break;
                            }
                            if (this.field4151 >= var3) {
                                return;
                            }
                            this.field4151 = var3 + var3 - this.field4151 - 1;
                            this.field4146 = -this.field4146;
                        } while (--this.field4147 != 0);
                    }
                } else {
                    label153: {
                        if (this.field4146 < 0) {
                            if (this.field4151 >= var3) {
                                return;
                            }
                            int var7 = (var4 - this.field4151 - 1) / var6;
                            if (var7 >= this.field4147) {
                                this.field4151 += this.field4147 * var6;
                                this.field4147 = 0;
                                break label153;
                            }
                            this.field4151 += var6 * var7;
                            this.field4147 -= var7;
                        } else if (this.field4151 >= var4) {
                            int var8 = (this.field4151 - var3) / var6;
                            if (var8 >= this.field4147) {
                                this.field4151 -= this.field4147 * var6;
                                this.field4147 = 0;
                                break label153;
                            }
                            this.field4151 -= var6 * var8;
                            this.field4147 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field4146 < 0) {
                if (this.field4151 < 0) {
                    this.field4151 = -1;
                    this.method1902();
                    this.method489(false);
                }
            } else if (this.field4151 >= var5) {
                this.field4151 = var5;
                this.method1902();
                this.method489(false);
            }
        } else if (this.field4145) {
            if (this.field4146 < 0) {
                if (this.field4151 >= var3) {
                    return;
                }
                this.field4151 = var3 + var3 - this.field4151 - 1;
                this.field4146 = -this.field4146;
            }
            while (this.field4151 >= var4) {
                this.field4151 = var4 + var4 - this.field4151 - 1;
                this.field4146 = -this.field4146;
                if (this.field4151 >= var3) {
                    return;
                }
                this.field4151 = var3 + var3 - this.field4151 - 1;
                this.field4146 = -this.field4146;
            }
        } else if (this.field4146 < 0) {
            if (this.field4151 >= var3) {
                return;
            }
            this.field4151 = var4 - (var4 - 1 - this.field4151) % var6 - 1;
        } else if (this.field4151 >= var4) {
            this.field4151 = (this.field4151 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @OriginalMember(owner = "client!t", name = "h", descriptor = "()I", line = 599)
    public final synchronized int method1885() {
        return this.field4146 < 0 ? -this.field4146 : this.field4146;
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(II)I", line = 602)
    private static final int method1886(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(II[B[IIIIIIIILt;II)I", line = 608)
    private static final int method1887(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class269 arg11, int arg12, int arg13) {
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
        arg11.field4151 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "([B[IIIIIIILt;)I", line = 641)
    private static final int method1888(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class269 arg8) {
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
        arg8.field4151 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!t", name = "e", descriptor = "(I)V", line = 667)
    public final synchronized void method1889(int arg0) {
        if (arg0 == 0) {
            this.method1891(0);
            this.method489(false);
        } else if (this.field4140 == 0 && this.field4138 == 0) {
            this.field4143 = 0;
            this.field4141 = 0;
            this.field4148 = 0;
            this.method489(false);
        } else {
            int var2 = -this.field4148;
            if (this.field4148 > var2) {
                var2 = this.field4148;
            }
            if (-this.field4140 > var2) {
                var2 = -this.field4140;
            }
            if (this.field4140 > var2) {
                var2 = this.field4140;
            }
            if (-this.field4138 > var2) {
                var2 = -this.field4138;
            }
            if (this.field4138 > var2) {
                var2 = this.field4138;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field4143 = arg0;
            this.field4141 = Integer.MIN_VALUE;
            this.field4149 = -this.field4148 / arg0;
            this.field4139 = -this.field4140 / arg0;
            this.field4152 = -this.field4138 / arg0;
        }
    }

    @OriginalMember(owner = "client!t", name = "c", descriptor = "(II[B[IIIIIIIILt;II)I", line = 712)
    private static final int method1890(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class269 arg11, int arg12, int arg13) {
        arg11.field4140 -= arg11.field4139 * arg5;
        arg11.field4138 -= arg11.field4152 * arg5;
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
        arg11.field4140 += arg11.field4139 * arg5;
        arg11.field4138 += arg11.field4152 * arg5;
        arg11.field4148 = arg6;
        arg11.field4151 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!t", name = "f", descriptor = "(I)V", line = 745)
    private final synchronized void method1891(int arg0) {
        this.method1901(arg0, this.method1894());
    }

    @OriginalMember(owner = "client!t", name = "c", descriptor = "(II)V", line = 748)
    public final synchronized void method1892(int arg0, int arg1) {
        this.method1895(arg0, arg1, this.method1894());
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lrk;II)Lt;", line = 752)
    public static final class269 method1893(class187 arg0, int arg1, int arg2) {
        return arg0.field2942 == null || arg0.field2942.length == 0 ? null : new class269(arg0, (int) ((long) arg0.field2940 * 256L * (long) arg1 / (long) (class297.field4778 * 100)), arg2 << 6);
    }

    @OriginalMember(owner = "client!t", name = "d", descriptor = "()I", line = 758)
    public final int method240() {
        return this.field4141 == 0 && this.field4143 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!t", name = "i", descriptor = "()I", line = 764)
    public final synchronized int method1894() {
        return this.field4142 < 0 ? -1 : this.field4142;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(III)V", line = 768)
    public final synchronized void method1895(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1901(arg1, arg2);
            return;
        }
        int var4 = method1876(arg1, arg2);
        int var5 = method1886(arg1, arg2);
        if (this.field4140 == var4 && this.field4138 == var5) {
            this.field4143 = 0;
            return;
        }
        int var6 = arg1 - this.field4148;
        if (this.field4148 - arg1 > var6) {
            var6 = this.field4148 - arg1;
        }
        if (var4 - this.field4140 > var6) {
            var6 = var4 - this.field4140;
        }
        if (this.field4140 - var4 > var6) {
            var6 = this.field4140 - var4;
        }
        if (var5 - this.field4138 > var6) {
            var6 = var5 - this.field4138;
        }
        if (this.field4138 - var5 > var6) {
            var6 = this.field4138 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field4143 = arg0;
        this.field4141 = arg1;
        this.field4142 = arg2;
        this.field4149 = (arg1 - this.field4148) / arg0;
        this.field4139 = (var4 - this.field4140) / arg0;
        this.field4152 = (var5 - this.field4138) / arg0;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "([IIIII)I", line = 814)
    private final int method1896(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field4143 > 0) {
                int var6 = this.field4143 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field4143 += arg1;
                if (this.field4146 == -256 && (this.field4151 & 0xFF) == 0) {
                    if (class52.field774) {
                        arg1 = method1899(0, ((class187) this.field3306).field2942, arg0, this.field4151, arg1, this.field4140, this.field4138, this.field4139, this.field4152, 0, var6, arg2, this);
                    } else {
                        arg1 = method1897(((class187) this.field3306).field2942, arg0, this.field4151, arg1, this.field4148, this.field4149, 0, var6, arg2, this);
                    }
                } else if (class52.field774) {
                    arg1 = method1905(0, 0, ((class187) this.field3306).field2942, arg0, this.field4151, arg1, this.field4140, this.field4138, this.field4139, this.field4152, 0, var6, arg2, this, this.field4146, arg4);
                } else {
                    arg1 = method1911(0, 0, ((class187) this.field3306).field2942, arg0, this.field4151, arg1, this.field4148, this.field4149, 0, var6, arg2, this, this.field4146, arg4);
                }
                this.field4143 -= arg1;
                if (this.field4143 != 0) {
                    return arg1;
                }
                if (!this.method1910()) {
                    continue;
                }
                return arg3;
            }
            if (this.field4146 == -256 && (this.field4151 & 0xFF) == 0) {
                if (class52.field774) {
                    return method1906(0, ((class187) this.field3306).field2942, arg0, this.field4151, arg1, this.field4140, this.field4138, 0, arg3, arg2, this);
                }
                return method1888(((class187) this.field3306).field2942, arg0, this.field4151, arg1, this.field4148, 0, arg3, arg2, this);
            }
            if (class52.field774) {
                return method1887(0, 0, ((class187) this.field3306).field2942, arg0, this.field4151, arg1, this.field4140, this.field4138, 0, arg3, arg2, this, this.field4146, arg4);
            }
            return method1907(0, 0, ((class187) this.field3306).field2942, arg0, this.field4151, arg1, this.field4148, 0, arg3, arg2, this, this.field4146, arg4);
        }
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "([B[IIIIIIIILt;)I", line = 872)
    private static final int method1897(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class269 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field4140 += (var14 - arg3) * arg9.field4139;
        arg9.field4138 += (var14 - arg3) * arg9.field4152;
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
        arg9.field4148 = var12 >> 2;
        arg9.field4151 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!t", name = "j", descriptor = "()Z", line = 907)
    public final boolean method1898() {
        return this.field4143 != 0;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(I[B[IIIIIIIIIILt;)I", line = 910)
    private static final int method1899(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class269 arg12) {
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
        arg12.field4148 += (var19 - arg4) * arg12.field4149;
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
        arg12.field4140 = var15 >> 2;
        arg12.field4138 = var16 >> 2;
        arg12.field4151 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(I[B[IIIIIIIIIILt;)I", line = 963)
    private static final int method1900(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class269 arg12) {
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
        arg12.field4148 += (var19 - arg4) * arg12.field4149;
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
        arg12.field4140 = var15 >> 2;
        arg12.field4138 = var16 >> 2;
        arg12.field4151 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!t", name = "d", descriptor = "(II)V", line = 1019)
    private final synchronized void method1901(int arg0, int arg1) {
        this.field4141 = arg0;
        this.field4142 = arg1;
        this.field4143 = 0;
        this.method1883();
    }

    @OriginalMember(owner = "client!t", name = "k", descriptor = "()V", line = 1025)
    private final void method1902() {
        if (this.field4143 == 0) {
            return;
        }
        if (this.field4141 == Integer.MIN_VALUE) {
            this.field4141 = 0;
        }
        this.field4143 = 0;
        this.method1883();
    }

    @OriginalMember(owner = "client!t", name = "g", descriptor = "(I)V", line = 1038)
    public final synchronized void method1903(int arg0) {
        int var2 = ((class187) this.field3306).field2942.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field4151 = arg0;
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "()Lkn;", line = 1048)
    public final class210 method239() {
        return null;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lrk;III)Lt;", line = 1052)
    public static final class269 method1904(class187 arg0, int arg1, int arg2, int arg3) {
        return arg0.field2942 == null || arg0.field2942.length == 0 ? null : new class269(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(II[B[IIIIIIIIIILt;II)I", line = 1058)
    private static final int method1905(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class269 arg13, int arg14, int arg15) {
        arg13.field4148 -= arg13.field4149 * arg5;
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
        arg13.field4148 += arg13.field4149 * var26;
        arg13.field4140 = arg6;
        arg13.field4138 = arg7;
        arg13.field4151 = arg4;
        return var26;
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(I[B[IIIIIIIILt;)I", line = 1101)
    private static final int method1906(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class269 arg10) {
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
        arg10.field4151 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(II[B[IIIIIIILt;II)I", line = 1140)
    private static final int method1907(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class269 arg10, int arg11, int arg12) {
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
        arg10.field4151 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(II[B[IIIIIIIIIILt;II)I", line = 1166)
    private static final int method1908(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class269 arg13, int arg14, int arg15) {
        arg13.field4148 -= arg13.field4149 * arg5;
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
        arg13.field4148 += arg13.field4149 * var27;
        arg13.field4140 = arg6;
        arg13.field4138 = arg7;
        arg13.field4151 = arg4;
        return var27;
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(II[B[IIIIIIILt;II)I", line = 1209)
    private static final int method1909(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class269 arg10, int arg11, int arg12) {
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
        arg10.field4151 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!t", name = "l", descriptor = "()Z", line = 1238)
    private final boolean method1910() {
        int var1 = this.field4141;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1876(var1, this.field4142);
            var2 = method1886(var1, this.field4142);
        }
        if (this.field4148 != var1 || this.field4140 != var3 || this.field4138 != var2) {
            if (this.field4148 < var1) {
                this.field4149 = 1;
                this.field4143 = var1 - this.field4148;
            } else if (this.field4148 > var1) {
                this.field4149 = -1;
                this.field4143 = this.field4148 - var1;
            } else {
                this.field4149 = 0;
            }
            if (this.field4140 < var3) {
                this.field4139 = 1;
                if (this.field4143 == 0 || this.field4143 > var3 - this.field4140) {
                    this.field4143 = var3 - this.field4140;
                }
            } else if (this.field4140 > var3) {
                this.field4139 = -1;
                if (this.field4143 == 0 || this.field4143 > this.field4140 - var3) {
                    this.field4143 = this.field4140 - var3;
                }
            } else {
                this.field4139 = 0;
            }
            if (this.field4138 < var2) {
                this.field4152 = 1;
                if (this.field4143 == 0 || this.field4143 > var2 - this.field4138) {
                    this.field4143 = var2 - this.field4138;
                }
            } else if (this.field4138 > var2) {
                this.field4152 = -1;
                if (this.field4143 == 0 || this.field4143 > this.field4138 - var2) {
                    this.field4143 = this.field4138 - var2;
                }
            } else {
                this.field4152 = 0;
            }
            return false;
        } else if (this.field4141 == Integer.MIN_VALUE) {
            this.field4141 = 0;
            this.field4148 = this.field4140 = this.field4138 = 0;
            this.method489(false);
            return true;
        } else {
            this.method1883();
            return false;
        }
    }

    @OriginalMember(owner = "client!t", name = "c", descriptor = "()I", line = 1325)
    public final int method1538() {
        int var1 = this.field4148 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field4147 == 0) {
            var2 -= this.field4151 * var2 / (((class187) this.field3306).field2942.length << 8);
        } else if (this.field4147 >= 0) {
            var2 -= this.field4150 * var2 / ((class187) this.field3306).field2942.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!t", name = "d", descriptor = "(II[B[IIIIIIIILt;II)I", line = 1338)
    private static final int method1911(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class269 arg11, int arg12, int arg13) {
        arg11.field4140 -= arg11.field4139 * arg5;
        arg11.field4138 -= arg11.field4152 * arg5;
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
        arg11.field4140 += arg11.field4139 * arg5;
        arg11.field4138 += arg11.field4152 * arg5;
        arg11.field4148 = arg6;
        arg11.field4151 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "()Lkn;", line = 1372)
    public final class210 method233() {
        return null;
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "([IIIII)I", line = 1375)
    private final int method1912(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field4143 > 0) {
                int var6 = this.field4143 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field4143 += arg1;
                if (this.field4146 == 256 && (this.field4151 & 0xFF) == 0) {
                    if (class52.field774) {
                        arg1 = method1900(0, ((class187) this.field3306).field2942, arg0, this.field4151, arg1, this.field4140, this.field4138, this.field4139, this.field4152, 0, var6, arg2, this);
                    } else {
                        arg1 = method1884(((class187) this.field3306).field2942, arg0, this.field4151, arg1, this.field4148, this.field4149, 0, var6, arg2, this);
                    }
                } else if (class52.field774) {
                    arg1 = method1908(0, 0, ((class187) this.field3306).field2942, arg0, this.field4151, arg1, this.field4140, this.field4138, this.field4139, this.field4152, 0, var6, arg2, this, this.field4146, arg4);
                } else {
                    arg1 = method1890(0, 0, ((class187) this.field3306).field2942, arg0, this.field4151, arg1, this.field4148, this.field4149, 0, var6, arg2, this, this.field4146, arg4);
                }
                this.field4143 -= arg1;
                if (this.field4143 != 0) {
                    return arg1;
                }
                if (!this.method1910()) {
                    continue;
                }
                return arg3;
            }
            if (this.field4146 == 256 && (this.field4151 & 0xFF) == 0) {
                if (class52.field774) {
                    return method1875(0, ((class187) this.field3306).field2942, arg0, this.field4151, arg1, this.field4140, this.field4138, 0, arg3, arg2, this);
                }
                return method1913(((class187) this.field3306).field2942, arg0, this.field4151, arg1, this.field4148, 0, arg3, arg2, this);
            }
            if (class52.field774) {
                return method1878(0, 0, ((class187) this.field3306).field2942, arg0, this.field4151, arg1, this.field4140, this.field4138, 0, arg3, arg2, this, this.field4146, arg4);
            }
            return method1909(0, 0, ((class187) this.field3306).field2942, arg0, this.field4151, arg1, this.field4148, 0, arg3, arg2, this, this.field4146, arg4);
        }
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "([B[IIIIIIILt;)I", line = 1432)
    private static final int method1913(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class269 arg8) {
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
        arg8.field4151 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "(Lrk;II)V", line = 1456)
    private class269(class187 arg0, int arg1, int arg2) {
        this.field3306 = arg0;
        this.field4150 = arg0.field2941;
        this.field4144 = arg0.field2943;
        this.field4145 = arg0.field2944;
        this.field4146 = arg1;
        this.field4141 = arg2;
        this.field4142 = 8192;
        this.field4151 = 0;
        this.method1883();
    }

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "(Lrk;III)V", line = 1467)
    private class269(class187 arg0, int arg1, int arg2, int arg3) {
        this.field3306 = arg0;
        this.field4150 = arg0.field2941;
        this.field4144 = arg0.field2943;
        this.field4145 = arg0.field2944;
        this.field4146 = arg1;
        this.field4141 = arg2;
        this.field4142 = arg3;
        this.field4151 = 0;
        this.method1883();
    }
}
