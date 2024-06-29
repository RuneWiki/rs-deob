import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class330 extends class116 {

    @OriginalMember(owner = "client!gk", name = "y", descriptor = "I")
    private int field5088;

    @OriginalMember(owner = "client!gk", name = "E", descriptor = "I")
    private int field5093;

    @OriginalMember(owner = "client!gk", name = "t", descriptor = "Z")
    private boolean field5083;

    @OriginalMember(owner = "client!gk", name = "z", descriptor = "I")
    private int field5089;

    @OriginalMember(owner = "client!gk", name = "D", descriptor = "I")
    private int field5092;

    @OriginalMember(owner = "client!gk", name = "r", descriptor = "I")
    private int field5081;

    @OriginalMember(owner = "client!gk", name = "v", descriptor = "I")
    private int field5085;

    @OriginalMember(owner = "client!gk", name = "s", descriptor = "I")
    private int field5082;

    @OriginalMember(owner = "client!gk", name = "u", descriptor = "I")
    private int field5084;

    @OriginalMember(owner = "client!gk", name = "w", descriptor = "I")
    private int field5086;

    @OriginalMember(owner = "client!gk", name = "x", descriptor = "I")
    private int field5087;

    @OriginalMember(owner = "client!gk", name = "A", descriptor = "I")
    private int field5090;

    @OriginalMember(owner = "client!gk", name = "B", descriptor = "I")
    private int field5091;

    @OriginalMember(owner = "client!gk", name = "F", descriptor = "I")
    private int field5094;

    @OriginalMember(owner = "client!gk", name = "G", descriptor = "I")
    private int field5095;

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "(I)V")
    private final synchronized void method2148(int arg0) {
        this.method2151(arg0, this.method2167());
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(II[B[IIIIIIIIIILgk;II)I")
    private static final int method2149(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class330 arg13, int arg14, int arg15) {
        arg13.field5087 -= arg13.field5090 * arg5;
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
        arg13.field5087 += arg13.field5090 * var22;
        arg13.field5095 = arg6;
        arg13.field5086 = arg7;
        arg13.field5085 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!gk", name = "e", descriptor = "(I)V")
    public final synchronized void method2150(int arg0) {
        if (arg0 == 0) {
            this.method2148(0);
            this.method2663(-120);
        } else if (this.field5095 == 0 && this.field5086 == 0) {
            this.field5094 = 0;
            this.field5092 = 0;
            this.field5087 = 0;
            this.method2663(-126);
        } else {
            int var2 = -this.field5087;
            if (this.field5087 > var2) {
                var2 = this.field5087;
            }
            if (-this.field5095 > var2) {
                var2 = -this.field5095;
            }
            if (this.field5095 > var2) {
                var2 = this.field5095;
            }
            if (-this.field5086 > var2) {
                var2 = -this.field5086;
            }
            if (this.field5086 > var2) {
                var2 = this.field5086;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field5094 = arg0;
            this.field5092 = Integer.MIN_VALUE;
            this.field5090 = -this.field5087 / arg0;
            this.field5084 = -this.field5095 / arg0;
            this.field5091 = -this.field5086 / arg0;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(II)V")
    private final synchronized void method2151(int arg0, int arg1) {
        this.field5092 = arg0;
        this.field5081 = arg1;
        this.field5094 = 0;
        this.method2185();
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(I[B[IIIIIIIILgk;)I")
    private static final int method2152(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class330 arg10) {
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
        arg10.field5085 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(II[B[IIIIIIIILgk;II)I")
    private static final int method2153(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class330 arg11, int arg12, int arg13) {
        arg11.field5095 -= arg11.field5084 * arg5;
        arg11.field5086 -= arg11.field5091 * arg5;
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
        arg11.field5095 += arg11.field5084 * arg5;
        arg11.field5086 += arg11.field5091 * arg5;
        arg11.field5087 = arg6;
        arg11.field5085 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!gk", name = "f", descriptor = "(I)V")
    public final synchronized void method2154(int arg0) {
        this.field5082 = arg0;
    }

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "(I)V")
    public final synchronized void method224(int arg0) {
        if (this.field5094 > 0) {
            if (arg0 >= this.field5094) {
                if (this.field5092 == Integer.MIN_VALUE) {
                    this.field5092 = 0;
                    this.field5087 = this.field5095 = this.field5086 = 0;
                    this.method2663(-122);
                    arg0 = this.field5094;
                }
                this.field5094 = 0;
                this.method2185();
            } else {
                this.field5087 += this.field5090 * arg0;
                this.field5095 += this.field5084 * arg0;
                this.field5086 += this.field5091 * arg0;
                this.field5094 -= arg0;
            }
        }
        class199 var2 = (class199) super.field1839;
        int var3 = this.field5088 << 8;
        int var4 = this.field5093 << 8;
        int var5 = var2.field2908.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field5082 = 0;
        }
        if (this.field5085 < 0) {
            if (this.field5089 <= 0) {
                this.method2157();
                this.method2663(-121);
                return;
            }
            this.field5085 = 0;
        }
        if (this.field5085 >= var5) {
            if (this.field5089 >= 0) {
                this.method2157();
                this.method2663(-111);
                return;
            }
            this.field5085 = var5 - 1;
        }
        this.field5085 += this.field5089 * arg0;
        if (this.field5082 < 0) {
            if (!this.field5083) {
                if (this.field5089 < 0) {
                    if (this.field5085 < var3) {
                        this.field5085 = var4 - 1 - (var4 - 1 - this.field5085) % var6;
                    }
                } else if (this.field5085 >= var4) {
                    this.field5085 = (this.field5085 - var3) % var6 + var3;
                }
            } else {
                if (this.field5089 < 0) {
                    if (this.field5085 >= var3) {
                        return;
                    }
                    this.field5085 = var3 + var3 - 1 - this.field5085;
                    this.field5089 = -this.field5089;
                }
                while (this.field5085 >= var4) {
                    this.field5085 = var4 + var4 - 1 - this.field5085;
                    this.field5089 = -this.field5089;
                    if (this.field5085 >= var3) {
                        return;
                    }
                    this.field5085 = var3 + var3 - 1 - this.field5085;
                    this.field5089 = -this.field5089;
                }
            }
        } else {
            if (this.field5082 > 0) {
                if (this.field5083) {
                    label125: {
                        if (this.field5089 < 0) {
                            if (this.field5085 >= var3) {
                                return;
                            }
                            this.field5085 = var3 + var3 - 1 - this.field5085;
                            this.field5089 = -this.field5089;
                            if (--this.field5082 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field5085 < var4) {
                                return;
                            }
                            this.field5085 = var4 + var4 - 1 - this.field5085;
                            this.field5089 = -this.field5089;
                            if (--this.field5082 == 0) {
                                break;
                            }
                            if (this.field5085 >= var3) {
                                return;
                            }
                            this.field5085 = var3 + var3 - 1 - this.field5085;
                            this.field5089 = -this.field5089;
                        } while (--this.field5082 != 0);
                    }
                } else if (this.field5089 < 0) {
                    if (this.field5085 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field5085) / var6;
                    if (var7 < this.field5082) {
                        this.field5085 += var6 * var7;
                        this.field5082 -= var7;
                        return;
                    }
                    this.field5085 += this.field5082 * var6;
                    this.field5082 = 0;
                } else {
                    if (this.field5085 < var4) {
                        return;
                    }
                    int var8 = (this.field5085 - var3) / var6;
                    if (var8 < this.field5082) {
                        this.field5085 -= var6 * var8;
                        this.field5082 -= var8;
                        return;
                    }
                    this.field5085 -= this.field5082 * var6;
                    this.field5082 = 0;
                }
            }
            if (this.field5089 < 0) {
                if (this.field5085 < 0) {
                    this.field5085 = -1;
                    this.method2157();
                    this.method2663(-127);
                    return;
                }
            } else if (this.field5085 >= var5) {
                this.field5085 = var5;
                this.method2157();
                this.method2663(-111);
            }
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(I[B[IIIIIIIIIILgk;)I")
    private static final int method2155(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class330 arg12) {
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
        arg12.field5087 += (var19 - arg4) * arg12.field5090;
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
        arg12.field5095 = var15 >> 2;
        arg12.field5086 = var16 >> 2;
        arg12.field5085 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(II[B[IIIIIIILgk;II)I")
    private static final int method2156(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class330 arg10, int arg11, int arg12) {
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
        arg10.field5085 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!gk", name = "e", descriptor = "()V")
    private final void method2157() {
        if (this.field5094 != 0) {
            if (this.field5092 == Integer.MIN_VALUE) {
                this.field5092 = 0;
            }
            this.field5094 = 0;
            this.method2185();
        }
    }

    @OriginalMember(owner = "client!gk", name = "g", descriptor = "(I)V")
    public final synchronized void method2158(int arg0) {
        int var2 = ((class199) super.field1839).field2908.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field5085 = arg0;
    }

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "()I")
    public final int method854() {
        int var1 = this.field5087 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field5082 == 0) {
            var2 -= this.field5085 * var2 / (((class199) super.field1839).field2908.length << 8);
        } else if (this.field5082 >= 0) {
            var2 -= this.field5088 * var2 / ((class199) super.field1839).field2908.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(II[B[IIIIIIIILgk;II)I")
    private static final int method2159(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class330 arg11, int arg12, int arg13) {
        arg11.field5095 -= arg11.field5084 * arg5;
        arg11.field5086 -= arg11.field5091 * arg5;
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
        arg11.field5095 += arg11.field5084 * arg5;
        arg11.field5086 += arg11.field5091 * arg5;
        arg11.field5087 = arg6;
        arg11.field5085 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!gk", name = "f", descriptor = "()Z")
    private final boolean method2160() {
        int var1 = this.field5092;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method2176(var1, this.field5081);
            var2 = method2180(var1, this.field5081);
        }
        if (this.field5087 == var1 && this.field5095 == var3 && this.field5086 == var2) {
            if (this.field5092 == Integer.MIN_VALUE) {
                this.field5092 = 0;
                this.field5087 = this.field5095 = this.field5086 = 0;
                this.method2663(-127);
                return true;
            } else {
                this.method2185();
                return false;
            }
        } else {
            if (this.field5087 < var1) {
                this.field5090 = 1;
                this.field5094 = var1 - this.field5087;
            } else if (this.field5087 > var1) {
                this.field5090 = -1;
                this.field5094 = this.field5087 - var1;
            } else {
                this.field5090 = 0;
            }
            if (this.field5095 < var3) {
                this.field5084 = 1;
                if (this.field5094 == 0 || this.field5094 > var3 - this.field5095) {
                    this.field5094 = var3 - this.field5095;
                }
            } else if (this.field5095 > var3) {
                this.field5084 = -1;
                if (this.field5094 == 0 || this.field5094 > this.field5095 - var3) {
                    this.field5094 = this.field5095 - var3;
                }
            } else {
                this.field5084 = 0;
            }
            if (this.field5086 < var2) {
                this.field5091 = 1;
                if (this.field5094 == 0 || this.field5094 > var2 - this.field5086) {
                    this.field5094 = var2 - this.field5086;
                }
            } else if (this.field5086 > var2) {
                this.field5091 = -1;
                if (this.field5094 == 0 || this.field5094 > this.field5086 - var2) {
                    this.field5094 = this.field5086 - var2;
                }
            } else {
                this.field5091 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "([IIIII)I")
    private final int method2161(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field5094 <= 0) {
                if (this.field5089 == -256 && (this.field5085 & 255) == 0) {
                    if (class275.field3991) {
                        return method2181(0, ((class199) super.field1839).field2908, arg0, this.field5085, arg1, this.field5095, this.field5086, 0, arg3, arg2, this);
                    }
                    return method2174(((class199) super.field1839).field2908, arg0, this.field5085, arg1, this.field5087, 0, arg3, arg2, this);
                }
                if (class275.field3991) {
                    return method2183(0, 0, ((class199) super.field1839).field2908, arg0, this.field5085, arg1, this.field5095, this.field5086, 0, arg3, arg2, this, this.field5089, arg4);
                }
                return method2166(0, 0, ((class199) super.field1839).field2908, arg0, this.field5085, arg1, this.field5087, 0, arg3, arg2, this, this.field5089, arg4);
            }
            int var6 = this.field5094 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field5094 += arg1;
            if (this.field5089 == -256 && (this.field5085 & 255) == 0) {
                if (class275.field3991) {
                    arg1 = method2155(0, ((class199) super.field1839).field2908, arg0, this.field5085, arg1, this.field5095, this.field5086, this.field5084, this.field5091, 0, var6, arg2, this);
                } else {
                    arg1 = method2170(((class199) super.field1839).field2908, arg0, this.field5085, arg1, this.field5087, this.field5090, 0, var6, arg2, this);
                }
            } else if (class275.field3991) {
                arg1 = method2149(0, 0, ((class199) super.field1839).field2908, arg0, this.field5085, arg1, this.field5095, this.field5086, this.field5084, this.field5091, 0, var6, arg2, this, this.field5089, arg4);
            } else {
                arg1 = method2159(0, 0, ((class199) super.field1839).field2908, arg0, this.field5085, arg1, this.field5087, this.field5090, 0, var6, arg2, this, this.field5089, arg4);
            }
            this.field5094 -= arg1;
            if (this.field5094 != 0) {
                return arg1;
            }
        } while (!this.method2160());
        return arg3;
    }

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "()Lei;")
    public final class116 method222() {
        return null;
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(II[B[IIIIIIIIIILgk;II)I")
    private static final int method2162(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class330 arg13, int arg14, int arg15) {
        arg13.field5087 -= arg13.field5090 * arg5;
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
        arg13.field5087 += arg13.field5090 * var22;
        arg13.field5095 = arg6;
        arg13.field5086 = arg7;
        arg13.field5085 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "([III)V")
    public final synchronized void method231(int[] arg0, int arg1, int arg2) {
        if (this.field5092 == 0 && this.field5094 == 0) {
            this.method224(arg2);
        } else {
            class199 var4 = (class199) super.field1839;
            int var5 = this.field5088 << 8;
            int var6 = this.field5093 << 8;
            int var7 = var4.field2908.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field5082 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field5085 < 0) {
                if (this.field5089 <= 0) {
                    this.method2157();
                    this.method2663(-118);
                    return;
                }
                this.field5085 = 0;
            }
            if (this.field5085 >= var7) {
                if (this.field5089 >= 0) {
                    this.method2157();
                    this.method2663(-120);
                    return;
                }
                this.field5085 = var7 - 1;
            }
            if (this.field5082 < 0) {
                if (this.field5083) {
                    if (this.field5089 < 0) {
                        var9 = this.method2161(arg0, arg1, var5, var10, var4.field2908[this.field5088]);
                        if (this.field5085 >= var5) {
                            return;
                        }
                        this.field5085 = var5 + var5 - 1 - this.field5085;
                        this.field5089 = -this.field5089;
                    }
                    while (true) {
                        int var11 = this.method2173(arg0, var9, var6, var10, var4.field2908[this.field5093 - 1]);
                        if (this.field5085 < var6) {
                            return;
                        }
                        this.field5085 = var6 + var6 - 1 - this.field5085;
                        this.field5089 = -this.field5089;
                        var9 = this.method2161(arg0, var11, var5, var10, var4.field2908[this.field5088]);
                        if (this.field5085 >= var5) {
                            return;
                        }
                        this.field5085 = var5 + var5 - 1 - this.field5085;
                        this.field5089 = -this.field5089;
                    }
                } else if (this.field5089 < 0) {
                    while (true) {
                        var9 = this.method2161(arg0, var9, var5, var10, var4.field2908[this.field5093 - 1]);
                        if (this.field5085 >= var5) {
                            return;
                        }
                        this.field5085 = var6 - 1 - (var6 - 1 - this.field5085) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method2173(arg0, var9, var6, var10, var4.field2908[this.field5088]);
                        if (this.field5085 < var6) {
                            return;
                        }
                        this.field5085 = (this.field5085 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field5082 > 0) {
                    if (this.field5083) {
                        label130: {
                            if (this.field5089 < 0) {
                                var9 = this.method2161(arg0, arg1, var5, var10, var4.field2908[this.field5088]);
                                if (this.field5085 >= var5) {
                                    return;
                                }
                                this.field5085 = var5 + var5 - 1 - this.field5085;
                                this.field5089 = -this.field5089;
                                if (--this.field5082 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method2173(arg0, var9, var6, var10, var4.field2908[this.field5093 - 1]);
                                if (this.field5085 < var6) {
                                    return;
                                }
                                this.field5085 = var6 + var6 - 1 - this.field5085;
                                this.field5089 = -this.field5089;
                                if (--this.field5082 == 0) {
                                    break;
                                }
                                var9 = this.method2161(arg0, var9, var5, var10, var4.field2908[this.field5088]);
                                if (this.field5085 >= var5) {
                                    return;
                                }
                                this.field5085 = var5 + var5 - 1 - this.field5085;
                                this.field5089 = -this.field5089;
                            } while (--this.field5082 != 0);
                        }
                    } else if (this.field5089 < 0) {
                        while (true) {
                            var9 = this.method2161(arg0, var9, var5, var10, var4.field2908[this.field5093 - 1]);
                            if (this.field5085 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field5085) / var8;
                            if (var12 >= this.field5082) {
                                this.field5085 += this.field5082 * var8;
                                this.field5082 = 0;
                                break;
                            }
                            this.field5085 += var8 * var12;
                            this.field5082 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method2173(arg0, var9, var6, var10, var4.field2908[this.field5088]);
                            if (this.field5085 < var6) {
                                return;
                            }
                            int var13 = (this.field5085 - var5) / var8;
                            if (var13 >= this.field5082) {
                                this.field5085 -= this.field5082 * var8;
                                this.field5082 = 0;
                                break;
                            }
                            this.field5085 -= var8 * var13;
                            this.field5082 -= var13;
                        }
                    }
                }
                if (this.field5089 < 0) {
                    this.method2161(arg0, var9, 0, var10, 0);
                    if (this.field5085 < 0) {
                        this.field5085 = -1;
                        this.method2157();
                        this.method2663(-107);
                        return;
                    }
                } else {
                    this.method2173(arg0, var9, var7, var10, 0);
                    if (this.field5085 >= var7) {
                        this.field5085 = var7;
                        this.method2157();
                        this.method2663(-114);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gk", name = "g", descriptor = "()I")
    public final synchronized int method2163() {
        return this.field5092 == Integer.MIN_VALUE ? 0 : this.field5092;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Z)V")
    public final synchronized void method2164(boolean arg0) {
        this.field5089 = (this.field5089 >>> 31) + (this.field5089 ^ this.field5089 >> 31);
        if (arg0) {
            this.field5089 = -this.field5089;
        }
    }

    @OriginalMember(owner = "client!gk", name = "h", descriptor = "()Z")
    public final boolean method2165() {
        return this.field5085 < 0 || this.field5085 >= ((class199) super.field1839).field2908.length << 8;
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(II[B[IIIIIIILgk;II)I")
    private static final int method2166(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class330 arg10, int arg11, int arg12) {
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
        arg10.field5085 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!gk", name = "i", descriptor = "()I")
    public final synchronized int method2167() {
        return this.field5081 < 0 ? -1 : this.field5081;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(III)V")
    public final synchronized void method2168(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method2151(arg1, arg2);
        } else {
            int var4 = method2176(arg1, arg2);
            int var5 = method2180(arg1, arg2);
            if (this.field5095 == var4 && this.field5086 == var5) {
                this.field5094 = 0;
            } else {
                int var6 = arg1 - this.field5087;
                if (this.field5087 - arg1 > var6) {
                    var6 = this.field5087 - arg1;
                }
                if (var4 - this.field5095 > var6) {
                    var6 = var4 - this.field5095;
                }
                if (this.field5095 - var4 > var6) {
                    var6 = this.field5095 - var4;
                }
                if (var5 - this.field5086 > var6) {
                    var6 = var5 - this.field5086;
                }
                if (this.field5086 - var5 > var6) {
                    var6 = this.field5086 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field5094 = arg0;
                this.field5092 = arg1;
                this.field5081 = arg2;
                this.field5090 = (arg1 - this.field5087) / arg0;
                this.field5084 = (var4 - this.field5095) / arg0;
                this.field5091 = (var5 - this.field5086) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(II)V")
    public final synchronized void method2169(int arg0, int arg1) {
        this.method2168(arg0, arg1, this.method2167());
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "([B[IIIIIIIILgk;)I")
    private static final int method2170(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class330 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field5095 += (var14 - arg3) * arg9.field5084;
        arg9.field5086 += (var14 - arg3) * arg9.field5091;
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
        arg9.field5087 = var12 >> 2;
        arg9.field5085 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!gk", name = "j", descriptor = "()Z")
    public final boolean method2171() {
        return this.field5094 != 0;
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "([B[IIIIIIIILgk;)I")
    private static final int method2172(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class330 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field5095 += (var14 - arg3) * arg9.field5084;
        arg9.field5086 += (var14 - arg3) * arg9.field5091;
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
        arg9.field5087 = var12 >> 2;
        arg9.field5085 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "([IIIII)I")
    private final int method2173(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field5094 <= 0) {
                if (this.field5089 == 256 && (this.field5085 & 255) == 0) {
                    if (class275.field3991) {
                        return method2152(0, ((class199) super.field1839).field2908, arg0, this.field5085, arg1, this.field5095, this.field5086, 0, arg3, arg2, this);
                    }
                    return method2184(((class199) super.field1839).field2908, arg0, this.field5085, arg1, this.field5087, 0, arg3, arg2, this);
                }
                if (class275.field3991) {
                    return method2182(0, 0, ((class199) super.field1839).field2908, arg0, this.field5085, arg1, this.field5095, this.field5086, 0, arg3, arg2, this, this.field5089, arg4);
                }
                return method2156(0, 0, ((class199) super.field1839).field2908, arg0, this.field5085, arg1, this.field5087, 0, arg3, arg2, this, this.field5089, arg4);
            }
            int var6 = this.field5094 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field5094 += arg1;
            if (this.field5089 == 256 && (this.field5085 & 255) == 0) {
                if (class275.field3991) {
                    arg1 = method2175(0, ((class199) super.field1839).field2908, arg0, this.field5085, arg1, this.field5095, this.field5086, this.field5084, this.field5091, 0, var6, arg2, this);
                } else {
                    arg1 = method2172(((class199) super.field1839).field2908, arg0, this.field5085, arg1, this.field5087, this.field5090, 0, var6, arg2, this);
                }
            } else if (class275.field3991) {
                arg1 = method2162(0, 0, ((class199) super.field1839).field2908, arg0, this.field5085, arg1, this.field5095, this.field5086, this.field5084, this.field5091, 0, var6, arg2, this, this.field5089, arg4);
            } else {
                arg1 = method2153(0, 0, ((class199) super.field1839).field2908, arg0, this.field5085, arg1, this.field5087, this.field5090, 0, var6, arg2, this, this.field5089, arg4);
            }
            this.field5094 -= arg1;
            if (this.field5094 != 0) {
                return arg1;
            }
        } while (!this.method2160());
        return arg3;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "([B[IIIIIIILgk;)I")
    private static final int method2174(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class330 arg8) {
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
        arg8.field5085 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(I[B[IIIIIIIIIILgk;)I")
    private static final int method2175(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class330 arg12) {
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
        arg12.field5087 += (var19 - arg4) * arg12.field5090;
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
        arg12.field5095 = var15 >> 2;
        arg12.field5086 = var16 >> 2;
        arg12.field5085 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "(II)I")
    private static final int method2176(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!gk", name = "h", descriptor = "(I)V")
    public final synchronized void method2177(int arg0) {
        this.method2151(arg0 << 6, this.method2167());
    }

    @OriginalMember(owner = "client!gk", name = "k", descriptor = "()I")
    public final synchronized int method2178() {
        return this.field5089 < 0 ? -this.field5089 : this.field5089;
    }

    @OriginalMember(owner = "client!gk", name = "i", descriptor = "(I)V")
    public final synchronized void method2179(int arg0) {
        if (this.field5089 < 0) {
            this.field5089 = -arg0;
        } else {
            this.field5089 = arg0;
        }
    }

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "(II)I")
    private static final int method2180(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "()I")
    public final int method223() {
        return this.field5092 == 0 && this.field5094 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(I[B[IIIIIIIILgk;)I")
    private static final int method2181(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class330 arg10) {
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
        arg10.field5085 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "(II[B[IIIIIIIILgk;II)I")
    private static final int method2182(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class330 arg11, int arg12, int arg13) {
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
        arg11.field5085 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "(II[B[IIIIIIIILgk;II)I")
    private static final int method2183(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class330 arg11, int arg12, int arg13) {
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
        arg11.field5085 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "([B[IIIIIIILgk;)I")
    private static final int method2184(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class330 arg8) {
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
        arg8.field5085 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!gk", name = "l", descriptor = "()V")
    private final void method2185() {
        this.field5087 = this.field5092;
        this.field5095 = method2176(this.field5092, this.field5081);
        this.field5086 = method2180(this.field5092, this.field5081);
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "()Lei;")
    public final class116 method228() {
        return null;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lbv;II)Lgk;")
    public static final class330 method2186(class199 arg0, int arg1, int arg2) {
        return arg0.field2908 != null && arg0.field2908.length != 0 ? new class330(arg0, (int) ((long) arg0.field2909 * 256L * (long) arg1 / (long) (class471.field6941 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(Lbv;II)V")
    private class330(class199 arg0, int arg1, int arg2) {
        super.field1839 = arg0;
        this.field5088 = arg0.field2911;
        this.field5093 = arg0.field2910;
        this.field5083 = arg0.field2912;
        this.field5089 = arg1;
        this.field5092 = arg2;
        this.field5081 = 8192;
        this.field5085 = 0;
        this.method2185();
    }

    @OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(Lbv;III)V")
    private class330(class199 arg0, int arg1, int arg2, int arg3) {
        super.field1839 = arg0;
        this.field5088 = arg0.field2911;
        this.field5093 = arg0.field2910;
        this.field5083 = arg0.field2912;
        this.field5089 = arg1;
        this.field5092 = arg2;
        this.field5081 = arg3;
        this.field5085 = 0;
        this.method2185();
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lbv;III)Lgk;")
    public static final class330 method2187(class199 arg0, int arg1, int arg2, int arg3) {
        return arg0.field2908 != null && arg0.field2908.length != 0 ? new class330(arg0, arg1, arg2, arg3) : null;
    }
}
