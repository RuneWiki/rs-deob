import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class220 extends class3 {

    @OriginalMember(owner = "client!ek", name = "w", descriptor = "I")
    private int field3155;

    @OriginalMember(owner = "client!ek", name = "E", descriptor = "I")
    private int field3163;

    @OriginalMember(owner = "client!ek", name = "q", descriptor = "Z")
    private boolean field3149;

    @OriginalMember(owner = "client!ek", name = "r", descriptor = "I")
    private int field3150;

    @OriginalMember(owner = "client!ek", name = "s", descriptor = "I")
    private int field3151;

    @OriginalMember(owner = "client!ek", name = "v", descriptor = "I")
    private int field3154;

    @OriginalMember(owner = "client!ek", name = "z", descriptor = "I")
    private int field3158;

    @OriginalMember(owner = "client!ek", name = "t", descriptor = "I")
    private int field3152;

    @OriginalMember(owner = "client!ek", name = "u", descriptor = "I")
    private int field3153;

    @OriginalMember(owner = "client!ek", name = "x", descriptor = "I")
    private int field3156;

    @OriginalMember(owner = "client!ek", name = "y", descriptor = "I")
    private int field3157;

    @OriginalMember(owner = "client!ek", name = "A", descriptor = "I")
    private int field3159;

    @OriginalMember(owner = "client!ek", name = "B", descriptor = "I")
    private int field3160;

    @OriginalMember(owner = "client!ek", name = "C", descriptor = "I")
    private int field3161;

    @OriginalMember(owner = "client!ek", name = "D", descriptor = "I")
    private int field3162;

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(I)V", line = 4)
    public final synchronized void method1517(int arg0) {
        int var2 = ((class87) this.field23).field1244.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field3158 = arg0;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(I[B[IIIIIIIILek;)I", line = 19)
    private static final int method1518(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class220 arg10) {
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
        arg10.field3158 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "()Z", line = 58)
    public final boolean method1519() {
        return this.field3158 < 0 || this.field3158 >= ((class87) this.field23).field1244.length << 8;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "([IIIII)I", line = 62)
    private final int method1520(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field3159 > 0) {
                int var6 = this.field3159 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field3159 += arg1;
                if (this.field3150 == -256 && (this.field3158 & 0xFF) == 0) {
                    if (class10.field93) {
                        arg1 = method1549(0, ((class87) this.field23).field1244, arg0, this.field3158, arg1, this.field3153, this.field3157, this.field3160, this.field3161, 0, var6, arg2, this);
                    } else {
                        arg1 = method1532(((class87) this.field23).field1244, arg0, this.field3158, arg1, this.field3156, this.field3152, 0, var6, arg2, this);
                    }
                } else if (class10.field93) {
                    arg1 = method1555(0, 0, ((class87) this.field23).field1244, arg0, this.field3158, arg1, this.field3153, this.field3157, this.field3160, this.field3161, 0, var6, arg2, this, this.field3150, arg4);
                } else {
                    arg1 = method1530(0, 0, ((class87) this.field23).field1244, arg0, this.field3158, arg1, this.field3156, this.field3152, 0, var6, arg2, this, this.field3150, arg4);
                }
                this.field3159 -= arg1;
                if (this.field3159 != 0) {
                    return arg1;
                }
                if (!this.method1536()) {
                    continue;
                }
                return arg3;
            }
            if (this.field3150 == -256 && (this.field3158 & 0xFF) == 0) {
                if (class10.field93) {
                    return method1531(0, ((class87) this.field23).field1244, arg0, this.field3158, arg1, this.field3153, this.field3157, 0, arg3, arg2, this);
                }
                return method1525(((class87) this.field23).field1244, arg0, this.field3158, arg1, this.field3156, 0, arg3, arg2, this);
            }
            if (class10.field93) {
                return method1527(0, 0, ((class87) this.field23).field1244, arg0, this.field3158, arg1, this.field3153, this.field3157, 0, arg3, arg2, this, this.field3150, arg4);
            }
            return method1524(0, 0, ((class87) this.field23).field1244, arg0, this.field3158, arg1, this.field3156, 0, arg3, arg2, this, this.field3150, arg4);
        }
    }

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "(I)V", line = 117)
    public final synchronized void method1521(int arg0) {
        this.method1552(arg0 << 6, this.method1526());
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(II[B[IIIIIIILek;II)I", line = 120)
    private static final int method1522(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class220 arg10, int arg11, int arg12) {
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
        arg10.field3158 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(II[B[IIIIIIIILek;II)I", line = 146)
    private static final int method1523(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class220 arg11, int arg12, int arg13) {
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
        arg11.field3158 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(II[B[IIIIIIILek;II)I", line = 179)
    private static final int method1524(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class220 arg10, int arg11, int arg12) {
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
        arg10.field3158 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)V", line = 205)
    public final synchronized void method14(int arg0) {
        if (this.field3159 > 0) {
            if (arg0 >= this.field3159) {
                if (this.field3151 == Integer.MIN_VALUE) {
                    this.field3151 = 0;
                    this.field3156 = this.field3153 = this.field3157 = 0;
                    this.method1274((byte) -26);
                    arg0 = this.field3159;
                }
                this.field3159 = 0;
                this.method1533();
            } else {
                this.field3156 += this.field3152 * arg0;
                this.field3153 += this.field3160 * arg0;
                this.field3157 += this.field3161 * arg0;
                this.field3159 -= arg0;
            }
        }
        class87 var2 = (class87) this.field23;
        int var3 = this.field3155 << 8;
        int var4 = this.field3163 << 8;
        int var5 = var2.field1244.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field3162 = 0;
        }
        if (this.field3158 < 0) {
            if (this.field3150 <= 0) {
                this.method1554();
                this.method1274((byte) -26);
                return;
            }
            this.field3158 = 0;
        }
        if (this.field3158 >= var5) {
            if (this.field3150 >= 0) {
                this.method1554();
                this.method1274((byte) -26);
                return;
            }
            this.field3158 = var5 - 1;
        }
        this.field3158 += this.field3150 * arg0;
        if (this.field3162 >= 0) {
            if (this.field3162 > 0) {
                if (this.field3149) {
                    label121: {
                        if (this.field3150 < 0) {
                            if (this.field3158 >= var3) {
                                return;
                            }
                            this.field3158 = var3 + var3 - this.field3158 - 1;
                            this.field3150 = -this.field3150;
                            if (--this.field3162 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field3158 < var4) {
                                return;
                            }
                            this.field3158 = var4 + var4 - this.field3158 - 1;
                            this.field3150 = -this.field3150;
                            if (--this.field3162 == 0) {
                                break;
                            }
                            if (this.field3158 >= var3) {
                                return;
                            }
                            this.field3158 = var3 + var3 - this.field3158 - 1;
                            this.field3150 = -this.field3150;
                        } while (--this.field3162 != 0);
                    }
                } else {
                    label153: {
                        if (this.field3150 < 0) {
                            if (this.field3158 >= var3) {
                                return;
                            }
                            int var7 = (var4 - this.field3158 - 1) / var6;
                            if (var7 >= this.field3162) {
                                this.field3158 += this.field3162 * var6;
                                this.field3162 = 0;
                                break label153;
                            }
                            this.field3158 += var6 * var7;
                            this.field3162 -= var7;
                        } else if (this.field3158 >= var4) {
                            int var8 = (this.field3158 - var3) / var6;
                            if (var8 >= this.field3162) {
                                this.field3158 -= this.field3162 * var6;
                                this.field3162 = 0;
                                break label153;
                            }
                            this.field3158 -= var6 * var8;
                            this.field3162 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field3150 < 0) {
                if (this.field3158 < 0) {
                    this.field3158 = -1;
                    this.method1554();
                    this.method1274((byte) -26);
                }
            } else if (this.field3158 >= var5) {
                this.field3158 = var5;
                this.method1554();
                this.method1274((byte) -26);
            }
        } else if (this.field3149) {
            if (this.field3150 < 0) {
                if (this.field3158 >= var3) {
                    return;
                }
                this.field3158 = var3 + var3 - this.field3158 - 1;
                this.field3150 = -this.field3150;
            }
            while (this.field3158 >= var4) {
                this.field3158 = var4 + var4 - this.field3158 - 1;
                this.field3150 = -this.field3150;
                if (this.field3158 >= var3) {
                    return;
                }
                this.field3158 = var3 + var3 - this.field3158 - 1;
                this.field3150 = -this.field3150;
            }
        } else if (this.field3150 < 0) {
            if (this.field3158 >= var3) {
                return;
            }
            this.field3158 = var4 - (var4 - 1 - this.field3158) % var6 - 1;
        } else if (this.field3158 >= var4) {
            this.field3158 = (this.field3158 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "([B[IIIIIIILek;)I", line = 423)
    private static final int method1525(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class220 arg8) {
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
        arg8.field3158 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ek", name = "f", descriptor = "()I", line = 449)
    public final synchronized int method1526() {
        return this.field3154 < 0 ? -1 : this.field3154;
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(II[B[IIIIIIIILek;II)I", line = 452)
    private static final int method1527(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class220 arg11, int arg12, int arg13) {
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
        arg11.field3158 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "()I", line = 484)
    public final int method15() {
        return this.field3151 == 0 && this.field3159 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(II)I", line = 490)
    private static final int method1528(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "()Lan;", line = 495)
    public final class3 method12() {
        return null;
    }

    @OriginalMember(owner = "client!ek", name = "g", descriptor = "()I", line = 500)
    public final synchronized int method1529() {
        return this.field3151 == Integer.MIN_VALUE ? 0 : this.field3151;
    }

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "(II[B[IIIIIIIILek;II)I", line = 503)
    private static final int method1530(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class220 arg11, int arg12, int arg13) {
        arg11.field3153 -= arg11.field3160 * arg5;
        arg11.field3157 -= arg11.field3161 * arg5;
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
        arg11.field3153 += arg11.field3160 * arg5;
        arg11.field3157 += arg11.field3161 * arg5;
        arg11.field3156 = arg6;
        arg11.field3158 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(I[B[IIIIIIIILek;)I", line = 536)
    private static final int method1531(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class220 arg10) {
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
        arg10.field3158 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "([B[IIIIIIIILek;)I", line = 574)
    private static final int method1532(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class220 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field3153 += (var14 - arg3) * arg9.field3160;
        arg9.field3157 += (var14 - arg3) * arg9.field3161;
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
        arg9.field3156 = var12 >> 2;
        arg9.field3158 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ek", name = "h", descriptor = "()V", line = 609)
    private final void method1533() {
        this.field3156 = this.field3151;
        this.field3153 = method1528(this.field3151, this.field3154);
        this.field3157 = method1543(this.field3151, this.field3154);
    }

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "(I)V", line = 619)
    public final synchronized void method1534(int arg0) {
        if (arg0 == 0) {
            this.method1542(0);
            this.method1274((byte) -26);
        } else if (this.field3153 == 0 && this.field3157 == 0) {
            this.field3159 = 0;
            this.field3151 = 0;
            this.field3156 = 0;
            this.method1274((byte) -26);
        } else {
            int var2 = -this.field3156;
            if (this.field3156 > var2) {
                var2 = this.field3156;
            }
            if (-this.field3153 > var2) {
                var2 = -this.field3153;
            }
            if (this.field3153 > var2) {
                var2 = this.field3153;
            }
            if (-this.field3157 > var2) {
                var2 = -this.field3157;
            }
            if (this.field3157 > var2) {
                var2 = this.field3157;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field3159 = arg0;
            this.field3151 = Integer.MIN_VALUE;
            this.field3152 = -this.field3156 / arg0;
            this.field3160 = -this.field3153 / arg0;
            this.field3161 = -this.field3157 / arg0;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(III)V", line = 664)
    public final synchronized void method1535(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1552(arg1, arg2);
            return;
        }
        int var4 = method1528(arg1, arg2);
        int var5 = method1543(arg1, arg2);
        if (this.field3153 == var4 && this.field3157 == var5) {
            this.field3159 = 0;
            return;
        }
        int var6 = arg1 - this.field3156;
        if (this.field3156 - arg1 > var6) {
            var6 = this.field3156 - arg1;
        }
        if (var4 - this.field3153 > var6) {
            var6 = var4 - this.field3153;
        }
        if (this.field3153 - var4 > var6) {
            var6 = this.field3153 - var4;
        }
        if (var5 - this.field3157 > var6) {
            var6 = var5 - this.field3157;
        }
        if (this.field3157 - var5 > var6) {
            var6 = this.field3157 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field3159 = arg0;
        this.field3151 = arg1;
        this.field3154 = arg2;
        this.field3152 = (arg1 - this.field3156) / arg0;
        this.field3160 = (var4 - this.field3153) / arg0;
        this.field3161 = (var5 - this.field3157) / arg0;
    }

    @OriginalMember(owner = "client!ek", name = "i", descriptor = "()Z", line = 711)
    private final boolean method1536() {
        int var1 = this.field3151;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1528(var1, this.field3154);
            var2 = method1543(var1, this.field3154);
        }
        if (this.field3156 != var1 || this.field3153 != var3 || this.field3157 != var2) {
            if (this.field3156 < var1) {
                this.field3152 = 1;
                this.field3159 = var1 - this.field3156;
            } else if (this.field3156 > var1) {
                this.field3152 = -1;
                this.field3159 = this.field3156 - var1;
            } else {
                this.field3152 = 0;
            }
            if (this.field3153 < var3) {
                this.field3160 = 1;
                if (this.field3159 == 0 || this.field3159 > var3 - this.field3153) {
                    this.field3159 = var3 - this.field3153;
                }
            } else if (this.field3153 > var3) {
                this.field3160 = -1;
                if (this.field3159 == 0 || this.field3159 > this.field3153 - var3) {
                    this.field3159 = this.field3153 - var3;
                }
            } else {
                this.field3160 = 0;
            }
            if (this.field3157 < var2) {
                this.field3161 = 1;
                if (this.field3159 == 0 || this.field3159 > var2 - this.field3157) {
                    this.field3159 = var2 - this.field3157;
                }
            } else if (this.field3157 > var2) {
                this.field3161 = -1;
                if (this.field3159 == 0 || this.field3159 > this.field3157 - var2) {
                    this.field3159 = this.field3157 - var2;
                }
            } else {
                this.field3161 = 0;
            }
            return false;
        } else if (this.field3151 == Integer.MIN_VALUE) {
            this.field3151 = 0;
            this.field3156 = this.field3153 = this.field3157 = 0;
            this.method1274((byte) -26);
            return true;
        } else {
            this.method1533();
            return false;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Lcc;II)Lek;", line = 796)
    public static final class220 method1537(class87 arg0, int arg1, int arg2) {
        return arg0.field1244 == null || arg0.field1244.length == 0 ? null : new class220(arg0, (int) ((long) arg0.field1245 * 256L * (long) arg1 / (long) (class273.field4085 * 100)), arg2 << 6);
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(I[B[IIIIIIIIIILek;)I", line = 803)
    private static final int method1538(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class220 arg12) {
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
        arg12.field3156 += (var19 - arg4) * arg12.field3152;
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
        arg12.field3153 = var15 >> 2;
        arg12.field3157 = var16 >> 2;
        arg12.field3158 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "(II[B[IIIIIIIILek;II)I", line = 856)
    private static final int method1539(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class220 arg11, int arg12, int arg13) {
        arg11.field3153 -= arg11.field3160 * arg5;
        arg11.field3157 -= arg11.field3161 * arg5;
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
        arg11.field3153 += arg11.field3160 * arg5;
        arg11.field3157 += arg11.field3161 * arg5;
        arg11.field3156 = arg6;
        arg11.field3158 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Z)V", line = 889)
    public final synchronized void method1540(boolean arg0) {
        this.field3150 = (this.field3150 >>> 31) + (this.field3150 ^ this.field3150 >> 31);
        if (arg0) {
            this.field3150 = -this.field3150;
        }
    }

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "()Lan;", line = 896)
    public final class3 method17() {
        return null;
    }

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "(I)V", line = 899)
    public final synchronized void method1541(int arg0) {
        if (this.field3150 < 0) {
            this.field3150 = -arg0;
        } else {
            this.field3150 = arg0;
        }
    }

    @OriginalMember(owner = "client!ek", name = "f", descriptor = "(I)V", line = 907)
    private final synchronized void method1542(int arg0) {
        this.method1552(arg0, this.method1526());
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "()I", line = 911)
    public final int method13() {
        int var1 = this.field3156 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field3162 == 0) {
            var2 -= this.field3158 * var2 / (((class87) this.field23).field1244.length << 8);
        } else if (this.field3162 >= 0) {
            var2 -= this.field3155 * var2 / ((class87) this.field23).field1244.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(II)I", line = 924)
    private static final int method1543(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "(II)V", line = 927)
    public final synchronized void method1544(int arg0, int arg1) {
        this.method1535(arg0, arg1, this.method1526());
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "([III)V", line = 936)
    public final synchronized void method16(int[] arg0, int arg1, int arg2) {
        if (this.field3151 == 0 && this.field3159 == 0) {
            this.method14(arg2);
            return;
        }
        class87 var4 = (class87) this.field23;
        int var5 = this.field3155 << 8;
        int var6 = this.field3163 << 8;
        int var7 = var4.field1244.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field3162 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field3158 < 0) {
            if (this.field3150 <= 0) {
                this.method1554();
                this.method1274((byte) -26);
                return;
            }
            this.field3158 = 0;
        }
        if (this.field3158 >= var7) {
            if (this.field3150 >= 0) {
                this.method1554();
                this.method1274((byte) -26);
                return;
            }
            this.field3158 = var7 - 1;
        }
        if (this.field3162 >= 0) {
            if (this.field3162 > 0) {
                if (this.field3149) {
                    label131: {
                        if (this.field3150 < 0) {
                            var9 = this.method1520(arg0, arg1, var5, var10, var4.field1244[this.field3155]);
                            if (this.field3158 >= var5) {
                                return;
                            }
                            this.field3158 = var5 + var5 - this.field3158 - 1;
                            this.field3150 = -this.field3150;
                            if (--this.field3162 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method1551(arg0, var9, var6, var10, var4.field1244[this.field3163 - 1]);
                            if (this.field3158 < var6) {
                                return;
                            }
                            this.field3158 = var6 + var6 - this.field3158 - 1;
                            this.field3150 = -this.field3150;
                            if (--this.field3162 == 0) {
                                break;
                            }
                            var9 = this.method1520(arg0, var9, var5, var10, var4.field1244[this.field3155]);
                            if (this.field3158 >= var5) {
                                return;
                            }
                            this.field3158 = var5 + var5 - this.field3158 - 1;
                            this.field3150 = -this.field3150;
                        } while (--this.field3162 != 0);
                    }
                } else if (this.field3150 < 0) {
                    while (true) {
                        var9 = this.method1520(arg0, var9, var5, var10, var4.field1244[this.field3163 - 1]);
                        if (this.field3158 >= var5) {
                            return;
                        }
                        int var12 = (var6 - this.field3158 - 1) / var8;
                        if (var12 >= this.field3162) {
                            this.field3158 += this.field3162 * var8;
                            this.field3162 = 0;
                            break;
                        }
                        this.field3158 += var8 * var12;
                        this.field3162 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method1551(arg0, var9, var6, var10, var4.field1244[this.field3155]);
                        if (this.field3158 < var6) {
                            return;
                        }
                        int var13 = (this.field3158 - var5) / var8;
                        if (var13 >= this.field3162) {
                            this.field3158 -= this.field3162 * var8;
                            this.field3162 = 0;
                            break;
                        }
                        this.field3158 -= var8 * var13;
                        this.field3162 -= var13;
                    }
                }
            }
            if (this.field3150 < 0) {
                this.method1520(arg0, var9, 0, var10, 0);
                if (this.field3158 < 0) {
                    this.field3158 = -1;
                    this.method1554();
                    this.method1274((byte) -26);
                }
            } else {
                this.method1551(arg0, var9, var7, var10, 0);
                if (this.field3158 >= var7) {
                    this.field3158 = var7;
                    this.method1554();
                    this.method1274((byte) -26);
                }
            }
        } else if (this.field3149) {
            if (this.field3150 < 0) {
                var9 = this.method1520(arg0, arg1, var5, var10, var4.field1244[this.field3155]);
                if (this.field3158 >= var5) {
                    return;
                }
                this.field3158 = var5 + var5 - this.field3158 - 1;
                this.field3150 = -this.field3150;
            }
            while (true) {
                int var11 = this.method1551(arg0, var9, var6, var10, var4.field1244[this.field3163 - 1]);
                if (this.field3158 < var6) {
                    return;
                }
                this.field3158 = var6 + var6 - this.field3158 - 1;
                this.field3150 = -this.field3150;
                var9 = this.method1520(arg0, var11, var5, var10, var4.field1244[this.field3155]);
                if (this.field3158 >= var5) {
                    return;
                }
                this.field3158 = var5 + var5 - this.field3158 - 1;
                this.field3150 = -this.field3150;
            }
        } else if (this.field3150 < 0) {
            while (true) {
                var9 = this.method1520(arg0, var9, var5, var10, var4.field1244[this.field3163 - 1]);
                if (this.field3158 >= var5) {
                    return;
                }
                this.field3158 = var6 - (var6 - 1 - this.field3158) % var8 - 1;
            }
        } else {
            while (true) {
                var9 = this.method1551(arg0, var9, var6, var10, var4.field1244[this.field3155]);
                if (this.field3158 < var6) {
                    return;
                }
                this.field3158 = (this.field3158 - var5) % var8 + var5;
            }
        }
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "([B[IIIIIIIILek;)I", line = 1174)
    private static final int method1545(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class220 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field3153 += (var14 - arg3) * arg9.field3160;
        arg9.field3157 += (var14 - arg3) * arg9.field3161;
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
        arg9.field3156 = var12 >> 2;
        arg9.field3158 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ek", name = "j", descriptor = "()Z", line = 1208)
    public final boolean method1546() {
        return this.field3159 != 0;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Lcc;III)Lek;", line = 1213)
    public static final class220 method1547(class87 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1244 == null || arg0.field1244.length == 0 ? null : new class220(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(II[B[IIIIIIIIIILek;II)I", line = 1219)
    private static final int method1548(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class220 arg13, int arg14, int arg15) {
        arg13.field3156 -= arg13.field3152 * arg5;
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
        arg13.field3156 += arg13.field3152 * var27;
        arg13.field3153 = arg6;
        arg13.field3157 = arg7;
        arg13.field3158 = arg4;
        return var27;
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(I[B[IIIIIIIIIILek;)I", line = 1261)
    private static final int method1549(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class220 arg12) {
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
        arg12.field3156 += (var19 - arg4) * arg12.field3152;
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
        arg12.field3153 = var15 >> 2;
        arg12.field3157 = var16 >> 2;
        arg12.field3158 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "([B[IIIIIIILek;)I", line = 1314)
    private static final int method1550(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class220 arg8) {
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
        arg8.field3158 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "([IIIII)I", line = 1339)
    private final int method1551(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field3159 > 0) {
                int var6 = this.field3159 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field3159 += arg1;
                if (this.field3150 == 256 && (this.field3158 & 0xFF) == 0) {
                    if (class10.field93) {
                        arg1 = method1538(0, ((class87) this.field23).field1244, arg0, this.field3158, arg1, this.field3153, this.field3157, this.field3160, this.field3161, 0, var6, arg2, this);
                    } else {
                        arg1 = method1545(((class87) this.field23).field1244, arg0, this.field3158, arg1, this.field3156, this.field3152, 0, var6, arg2, this);
                    }
                } else if (class10.field93) {
                    arg1 = method1548(0, 0, ((class87) this.field23).field1244, arg0, this.field3158, arg1, this.field3153, this.field3157, this.field3160, this.field3161, 0, var6, arg2, this, this.field3150, arg4);
                } else {
                    arg1 = method1539(0, 0, ((class87) this.field23).field1244, arg0, this.field3158, arg1, this.field3156, this.field3152, 0, var6, arg2, this, this.field3150, arg4);
                }
                this.field3159 -= arg1;
                if (this.field3159 != 0) {
                    return arg1;
                }
                if (!this.method1536()) {
                    continue;
                }
                return arg3;
            }
            if (this.field3150 == 256 && (this.field3158 & 0xFF) == 0) {
                if (class10.field93) {
                    return method1518(0, ((class87) this.field23).field1244, arg0, this.field3158, arg1, this.field3153, this.field3157, 0, arg3, arg2, this);
                }
                return method1550(((class87) this.field23).field1244, arg0, this.field3158, arg1, this.field3156, 0, arg3, arg2, this);
            }
            if (class10.field93) {
                return method1523(0, 0, ((class87) this.field23).field1244, arg0, this.field3158, arg1, this.field3153, this.field3157, 0, arg3, arg2, this, this.field3150, arg4);
            }
            return method1522(0, 0, ((class87) this.field23).field1244, arg0, this.field3158, arg1, this.field3156, 0, arg3, arg2, this, this.field3150, arg4);
        }
    }

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "(II)V", line = 1395)
    private final synchronized void method1552(int arg0, int arg1) {
        this.field3151 = arg0;
        this.field3154 = arg1;
        this.field3159 = 0;
        this.method1533();
    }

    @OriginalMember(owner = "client!ek", name = "k", descriptor = "()I", line = 1401)
    public final synchronized int method1553() {
        return this.field3150 < 0 ? -this.field3150 : this.field3150;
    }

    @OriginalMember(owner = "client!ek", name = "l", descriptor = "()V", line = 1404)
    private final void method1554() {
        if (this.field3159 == 0) {
            return;
        }
        if (this.field3151 == Integer.MIN_VALUE) {
            this.field3151 = 0;
        }
        this.field3159 = 0;
        this.method1533();
    }

    @OriginalMember(owner = "client!ek", name = "<init>", descriptor = "(Lcc;II)V", line = 1414)
    private class220(class87 arg0, int arg1, int arg2) {
        this.field23 = arg0;
        this.field3155 = arg0.field1241;
        this.field3163 = arg0.field1242;
        this.field3149 = arg0.field1243;
        this.field3150 = arg1;
        this.field3151 = arg2;
        this.field3154 = 8192;
        this.field3158 = 0;
        this.method1533();
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(II[B[IIIIIIIIIILek;II)I", line = 1426)
    private static final int method1555(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class220 arg13, int arg14, int arg15) {
        arg13.field3156 -= arg13.field3152 * arg5;
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
        arg13.field3156 += arg13.field3152 * var26;
        arg13.field3153 = arg6;
        arg13.field3157 = arg7;
        arg13.field3158 = arg4;
        return var26;
    }

    @OriginalMember(owner = "client!ek", name = "<init>", descriptor = "(Lcc;III)V", line = 1466)
    private class220(class87 arg0, int arg1, int arg2, int arg3) {
        this.field23 = arg0;
        this.field3155 = arg0.field1241;
        this.field3163 = arg0.field1242;
        this.field3149 = arg0.field1243;
        this.field3150 = arg1;
        this.field3151 = arg2;
        this.field3154 = arg3;
        this.field3158 = 0;
        this.method1533();
    }

    @OriginalMember(owner = "client!ek", name = "g", descriptor = "(I)V", line = 1478)
    public final synchronized void method1556(int arg0) {
        this.field3162 = arg0;
    }
}
