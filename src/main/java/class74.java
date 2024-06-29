import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class74 extends class51 {

    @OriginalMember(owner = "client!mb", name = "E", descriptor = "I")
    private int field1715;

    @OriginalMember(owner = "client!mb", name = "F", descriptor = "I")
    private int field1716;

    @OriginalMember(owner = "client!mb", name = "I", descriptor = "I")
    private int field1718;

    @OriginalMember(owner = "client!mb", name = "D", descriptor = "I")
    private int field1714;

    @OriginalMember(owner = "client!mb", name = "B", descriptor = "I")
    private int field1712;

    @OriginalMember(owner = "client!mb", name = "x", descriptor = "I")
    private int field1708;

    @OriginalMember(owner = "client!mb", name = "y", descriptor = "I")
    private int field1709;

    @OriginalMember(owner = "client!mb", name = "z", descriptor = "I")
    private int field1710;

    @OriginalMember(owner = "client!mb", name = "A", descriptor = "I")
    private int field1711;

    @OriginalMember(owner = "client!mb", name = "H", descriptor = "I")
    private int field1717;

    @OriginalMember(owner = "client!mb", name = "C", descriptor = "Z")
    private boolean field1713;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(II[B[IIIIIIILmb;II)I", line = 11)
    private static final int method505(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class74 arg10, int arg11, int arg12) {
        int var13;
        if (arg11 == 0 || (var13 = (arg9 + 256 - arg4 + arg11) / arg11 + arg5) > arg8) {
            var13 = arg8;
        }
        int var10001;
        while (arg5 < var13) {
            int var17 = arg4 >> 8;
            byte var18 = arg2[var17 - 1];
            var10001 = arg5++;
            arg3[var10001] += ((var18 << 8) + (arg4 & 255) * (arg2[var17] - var18)) * arg6;
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
            arg3[var10001] += ((var15 << 8) + (arg4 & 255) * (arg2[arg4 >> 8] - var15)) * arg6;
            arg4 += var16;
        }
        arg10.field1712 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "([B[IIIIIIILmb;)I", line = 38)
    private static final int method506(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class74 arg8) {
        int var9 = arg2 >> 8;
        int var10 = arg7 >> 8;
        int var11 = arg4 << 8;
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
        arg8.field1712 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(II[B[IIIIIIIIILmb;II)I", line = 63)
    private static final int method507(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class74 arg12, int arg13, int arg14) {
        int var15;
        if (arg13 == 0 || (var15 = (arg11 - arg4 + arg13 - 257) / arg13 + arg5) > arg10) {
            var15 = arg10;
        }
        int var10001;
        while (arg5 < var15) {
            int var19 = arg4 >> 8;
            byte var20 = arg2[var19];
            var10001 = arg5++;
            arg3[var10001] += ((var20 << 8) + (arg4 & 255) * (arg2[var19 + 1] - var20)) * arg6 >> arg7;
            arg6 += arg8;
            arg4 += arg13;
        }
        int var16;
        if (arg13 == 0 || (var16 = (arg11 - arg4 + arg13 - 1) / arg13 + arg5) > arg10) {
            var16 = arg10;
        }
        int var17 = arg14;
        while (arg5 < var16) {
            byte var18 = arg2[arg4 >> 8];
            var10001 = arg5++;
            arg3[var10001] += ((var18 << 8) + (arg4 & 255) * (var17 - var18)) * arg6 >> arg7;
            arg6 += arg8;
            arg4 += arg13;
        }
        arg12.field1714 = arg6;
        arg12.field1712 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(II[B[IIIIIIIIILmb;II)I", line = 92)
    private static final int method508(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class74 arg12, int arg13, int arg14) {
        int var15;
        if (arg13 == 0 || (var15 = (arg11 + 256 - arg4 + arg13) / arg13 + arg5) > arg10) {
            var15 = arg10;
        }
        int var10001;
        while (arg5 < var15) {
            int var19 = arg4 >> 8;
            byte var20 = arg2[var19 - 1];
            var10001 = arg5++;
            arg3[var10001] += ((var20 << 8) + (arg4 & 255) * (arg2[var19] - var20)) * arg6 >> arg7;
            arg6 += arg8;
            arg4 += arg13;
        }
        int var16;
        if (arg13 == 0 || (var16 = (arg11 - arg4 + arg13) / arg13 + arg5) > arg10) {
            var16 = arg10;
        }
        int var17 = arg14;
        int var18 = arg13;
        while (arg5 < var16) {
            var10001 = arg5++;
            arg3[var10001] += ((var17 << 8) + (arg4 & 255) * (arg2[arg4 >> 8] - var17)) * arg6 >> arg7;
            arg6 += arg8;
            arg4 += var18;
        }
        arg12.field1714 = arg6;
        arg12.field1712 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "([B[IIIIIIIIILmb;)I", line = 121)
    private static final int method509(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class74 arg10) {
        int var11 = arg2 >> 8;
        int var12 = arg9 >> 8;
        int var13 = arg4 << 8;
        int var14;
        if ((var14 = arg3 + var11 - (var12 - 1)) > arg8) {
            var14 = arg8;
        }
        var14 -= 3;
        int var10001;
        while (arg3 < var14) {
            var10001 = arg3++;
            arg1[var10001] += arg0[var11--] * var13 >> arg5;
            int var15 = arg6 + var13;
            int var18 = arg3++;
            arg1[var18] += arg0[var11--] * var15 >> arg5;
            int var16 = arg6 + var15;
            int var19 = arg3++;
            arg1[var19] += arg0[var11--] * var16 >> arg5;
            int var17 = arg6 + var16;
            int var20 = arg3++;
            arg1[var20] += arg0[var11--] * var17 >> arg5;
            var13 = arg6 + var17;
        }
        var14 += 3;
        while (arg3 < var14) {
            var10001 = arg3++;
            arg1[var10001] += arg0[var11--] * var13 >> arg5;
            var13 += arg6;
        }
        arg10.field1714 = var13 >> 8;
        arg10.field1712 = var11 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(II[B[IIIIIIILmb;II)I", line = 152)
    private static final int method510(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class74 arg10, int arg11, int arg12) {
        int var13;
        if (arg11 == 0 || (var13 = (arg9 - arg4 + arg11 - 257) / arg11 + arg5) > arg8) {
            var13 = arg8;
        }
        int var10001;
        while (arg5 < var13) {
            int var17 = arg4 >> 8;
            byte var18 = arg2[var17];
            var10001 = arg5++;
            arg3[var10001] += ((var18 << 8) + (arg4 & 255) * (arg2[var17 + 1] - var18)) * arg6;
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
            arg3[var10001] += ((var16 << 8) + (arg4 & 255) * (var15 - var16)) * arg6;
            arg4 += arg11;
        }
        arg10.field1712 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "()I", line = 180)
    public final int method365() {
        int var1 = this.field1714 * 3;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1708 == 0) {
            var2 -= this.field1712 * var2 / (((class87) super.field1200).field1997.length << 8);
        } else if (this.field1708 >= 0) {
            var2 -= this.field1715 * var2 / ((class87) super.field1200).field1997.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "([III)I", line = 192)
    public final synchronized int method248(int[] arg0, int arg1, int arg2) {
        if (this.field1714 != 0 || this.field1711 != 0 && this.field1717 != 0 && this.field1717 != Integer.MIN_VALUE) {
            class87 var4 = (class87) super.field1200;
            int var5 = this.field1715 << 8;
            int var6 = this.field1716 << 8;
            int var7 = var4.field1997.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field1708 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field1708 < 0) {
                if (this.field1713) {
                    if (this.field1718 < 0) {
                        var9 = this.method512(arg0, arg1, var5, var10, var4.field1997[this.field1715]);
                        if (this.field1712 >= var5) {
                            return 1;
                        }
                        this.field1712 = var5 + var5 - 1 - this.field1712;
                        this.field1718 = -this.field1718;
                    }
                    while (true) {
                        int var11 = this.method515(arg0, var9, var6, var10, var4.field1997[this.field1716 - 1]);
                        if (this.field1712 < var6) {
                            return 1;
                        }
                        this.field1712 = var6 + var6 - 1 - this.field1712;
                        this.field1718 = -this.field1718;
                        var9 = this.method512(arg0, var11, var5, var10, var4.field1997[this.field1715]);
                        if (this.field1712 >= var5) {
                            return 1;
                        }
                        this.field1712 = var5 + var5 - 1 - this.field1712;
                        this.field1718 = -this.field1718;
                    }
                } else if (this.field1718 < 0) {
                    while (true) {
                        var9 = this.method512(arg0, var9, var5, var10, var4.field1997[this.field1716 - 1]);
                        if (this.field1712 >= var5) {
                            return 1;
                        }
                        this.field1712 = var6 - 1 - (var6 - 1 - this.field1712) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method515(arg0, var9, var6, var10, var4.field1997[this.field1715]);
                        if (this.field1712 < var6) {
                            return 1;
                        }
                        this.field1712 = (this.field1712 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field1708 > 0) {
                    if (this.field1713) {
                        label118: {
                            if (this.field1718 < 0) {
                                var9 = this.method512(arg0, arg1, var5, var10, var4.field1997[this.field1715]);
                                if (this.field1712 >= var5) {
                                    return 1;
                                }
                                this.field1712 = var5 + var5 - 1 - this.field1712;
                                this.field1718 = -this.field1718;
                                if (--this.field1708 == 0) {
                                    break label118;
                                }
                            }
                            do {
                                var9 = this.method515(arg0, var9, var6, var10, var4.field1997[this.field1716 - 1]);
                                if (this.field1712 < var6) {
                                    return 1;
                                }
                                this.field1712 = var6 + var6 - 1 - this.field1712;
                                this.field1718 = -this.field1718;
                                if (--this.field1708 == 0) {
                                    break;
                                }
                                var9 = this.method512(arg0, var9, var5, var10, var4.field1997[this.field1715]);
                                if (this.field1712 >= var5) {
                                    return 1;
                                }
                                this.field1712 = var5 + var5 - 1 - this.field1712;
                                this.field1718 = -this.field1718;
                            } while (--this.field1708 != 0);
                        }
                    } else if (this.field1718 < 0) {
                        while (true) {
                            var9 = this.method512(arg0, var9, var5, var10, var4.field1997[this.field1716 - 1]);
                            if (this.field1712 >= var5) {
                                return 1;
                            }
                            int var12 = (var6 - 1 - this.field1712) / var8;
                            if (var12 >= this.field1708) {
                                this.field1712 += this.field1708 * var8;
                                this.field1708 = 0;
                                break;
                            }
                            this.field1712 += var8 * var12;
                            this.field1708 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method515(arg0, var9, var6, var10, var4.field1997[this.field1715]);
                            if (this.field1712 < var6) {
                                return 1;
                            }
                            int var13 = (this.field1712 - var5) / var8;
                            if (var13 >= this.field1708) {
                                this.field1712 -= this.field1708 * var8;
                                this.field1708 = 0;
                                break;
                            }
                            this.field1712 -= var8 * var13;
                            this.field1708 -= var13;
                        }
                    }
                }
                if (this.field1718 < 0) {
                    this.method512(arg0, var9, 0, var10, 0);
                    if (this.field1712 < 0) {
                        this.field1712 = 0;
                        this.method187((byte) 39);
                    }
                } else {
                    this.method515(arg0, var9, var7, var10, 0);
                    if (this.field1712 >= var7) {
                        this.field1712 = var7 - 1;
                        this.method187((byte) 39);
                    }
                }
                return 1;
            }
        } else {
            this.method245(arg2);
            return 0;
        }
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(I)V", line = 400)
    public final synchronized void method511(int arg0) {
        this.field1708 = arg0;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "([IIIII)I", line = 407)
    private final int method512(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        if (this.field1711 > 0) {
            int var6 = this.field1711 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field1711 += arg1;
            if (this.field1718 == -256 && (this.field1712 & 255) == 0) {
                arg1 = method509(((class87) super.field1200).field1997, arg0, this.field1712, arg1, this.field1714, this.field1710, this.field1709, 0, var6, arg2, this);
            } else {
                arg1 = method508(0, 0, ((class87) super.field1200).field1997, arg0, this.field1712, arg1, this.field1714, this.field1710, this.field1709, 0, var6, arg2, this, this.field1718, arg4);
            }
            this.field1711 -= arg1;
            if (this.field1711 != 0) {
                return arg1;
            }
            if (this.field1717 == Integer.MIN_VALUE) {
                this.method187((byte) 39);
                return arg3;
            }
            this.field1714 = this.field1717;
        }
        return this.field1718 == -256 && (this.field1712 & 255) == 0 ? method514(((class87) super.field1200).field1997, arg0, this.field1712, arg1, this.field1714, 0, arg3, arg2, this) : method505(0, 0, ((class87) super.field1200).field1997, arg0, this.field1712, arg1, this.field1714, 0, arg3, arg2, this, this.field1718, arg4);
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Loc;II)Lmb;", line = 448)
    public static final class74 method513(class87 arg0, int arg1, int arg2) {
        return arg0.field1997 != null && arg0.field1997.length != 0 ? new class74(arg0, (int) ((long) arg0.field1998 * 256L * (long) arg1 / (long) (class35.field836 * 100)), arg2) : null;
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "([B[IIIIIIILmb;)I", line = 454)
    private static final int method514(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class74 arg8) {
        int var9 = arg2 >> 8;
        int var10 = arg7 >> 8;
        int var11 = arg4 << 8;
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
        arg8.field1712 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)V", line = 481)
    public final synchronized void method245(int arg0) {
        if (this.field1711 > 0) {
            if (arg0 >= this.field1711) {
                if (this.field1717 == Integer.MIN_VALUE) {
                    this.method187((byte) 39);
                    arg0 = this.field1711;
                } else {
                    this.field1714 = this.field1717;
                }
                this.field1711 = 0;
            } else {
                this.field1714 += this.field1709 * arg0;
                this.field1711 -= arg0;
            }
        }
        this.field1712 += this.field1718 * arg0;
        class87 var2 = (class87) super.field1200;
        int var3 = this.field1715 << 8;
        int var4 = this.field1716 << 8;
        int var5 = var2.field1997.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1708 = 0;
        }
        if (this.field1708 < 0) {
            if (!this.field1713) {
                if (this.field1718 < 0) {
                    if (this.field1712 < var3) {
                        this.field1712 = var4 - 1 - (var4 - 1 - this.field1712) % var6;
                    }
                } else if (this.field1712 >= var4) {
                    this.field1712 = (this.field1712 - var3) % var6 + var3;
                }
            } else {
                if (this.field1718 < 0) {
                    if (this.field1712 >= var3) {
                        return;
                    }
                    this.field1712 = var3 + var3 - 1 - this.field1712;
                    this.field1718 = -this.field1718;
                }
                while (this.field1712 >= var4) {
                    this.field1712 = var4 + var4 - 1 - this.field1712;
                    this.field1718 = -this.field1718;
                    if (this.field1712 >= var3) {
                        return;
                    }
                    this.field1712 = var3 + var3 - 1 - this.field1712;
                    this.field1718 = -this.field1718;
                }
            }
        } else {
            if (this.field1708 > 0) {
                if (this.field1713) {
                    label113: {
                        if (this.field1718 < 0) {
                            if (this.field1712 >= var3) {
                                return;
                            }
                            this.field1712 = var3 + var3 - 1 - this.field1712;
                            this.field1718 = -this.field1718;
                            if (--this.field1708 == 0) {
                                break label113;
                            }
                        }
                        do {
                            if (this.field1712 < var4) {
                                return;
                            }
                            this.field1712 = var4 + var4 - 1 - this.field1712;
                            this.field1718 = -this.field1718;
                            if (--this.field1708 == 0) {
                                break;
                            }
                            if (this.field1712 >= var3) {
                                return;
                            }
                            this.field1712 = var3 + var3 - 1 - this.field1712;
                            this.field1718 = -this.field1718;
                        } while (--this.field1708 != 0);
                    }
                } else if (this.field1718 < 0) {
                    if (this.field1712 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field1712) / var6;
                    if (var7 < this.field1708) {
                        this.field1712 += var6 * var7;
                        this.field1708 -= var7;
                        return;
                    }
                    this.field1712 += this.field1708 * var6;
                    this.field1708 = 0;
                } else {
                    if (this.field1712 < var4) {
                        return;
                    }
                    int var8 = (this.field1712 - var3) / var6;
                    if (var8 < this.field1708) {
                        this.field1712 -= var6 * var8;
                        this.field1708 -= var8;
                        return;
                    }
                    this.field1712 -= this.field1708 * var6;
                    this.field1708 = 0;
                }
            }
            if (this.field1718 < 0) {
                if (this.field1712 < 0) {
                    this.field1712 = 0;
                    this.method187((byte) 39);
                    return;
                }
            } else if (this.field1712 >= var5) {
                this.field1712 = var5 - 1;
                this.method187((byte) 39);
            }
        }
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(Loc;II)V", line = 672)
    private class74(class87 arg0, int arg1, int arg2) {
        super.field1200 = arg0;
        this.field1715 = arg0.field2000;
        this.field1716 = arg0.field1999;
        this.field1718 = arg1;
        this.field1714 = arg2;
        this.field1712 = 0;
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "([IIIII)I", line = 681)
    private final int method515(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        if (this.field1711 > 0) {
            int var6 = this.field1711 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field1711 += arg1;
            if (this.field1718 == 256 && (this.field1712 & 255) == 0) {
                arg1 = method516(((class87) super.field1200).field1997, arg0, this.field1712, arg1, this.field1714, this.field1710, this.field1709, 0, var6, arg2, this);
            } else {
                arg1 = method507(0, 0, ((class87) super.field1200).field1997, arg0, this.field1712, arg1, this.field1714, this.field1710, this.field1709, 0, var6, arg2, this, this.field1718, arg4);
            }
            this.field1711 -= arg1;
            if (this.field1711 != 0) {
                return arg1;
            }
            if (this.field1717 == Integer.MIN_VALUE) {
                this.method187((byte) 39);
                return arg3;
            }
            this.field1714 = this.field1717;
        }
        return this.field1718 == 256 && (this.field1712 & 255) == 0 ? method506(((class87) super.field1200).field1997, arg0, this.field1712, arg1, this.field1714, 0, arg3, arg2, this) : method510(0, 0, ((class87) super.field1200).field1997, arg0, this.field1712, arg1, this.field1714, 0, arg3, arg2, this, this.field1718, arg4);
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "([B[IIIIIIIIILmb;)I", line = 722)
    private static final int method516(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class74 arg10) {
        int var11 = arg2 >> 8;
        int var12 = arg9 >> 8;
        int var13 = arg4 << 8;
        int var14;
        if ((var14 = arg3 + var12 - var11) > arg8) {
            var14 = arg8;
        }
        var14 -= 3;
        int var10001;
        while (arg3 < var14) {
            var10001 = arg3++;
            arg1[var10001] += arg0[var11++] * var13 >> arg5;
            int var15 = arg6 + var13;
            int var18 = arg3++;
            arg1[var18] += arg0[var11++] * var15 >> arg5;
            int var16 = arg6 + var15;
            int var19 = arg3++;
            arg1[var19] += arg0[var11++] * var16 >> arg5;
            int var17 = arg6 + var16;
            int var20 = arg3++;
            arg1[var20] += arg0[var11++] * var17 >> arg5;
            var13 = arg6 + var17;
        }
        var14 += 3;
        while (arg3 < var14) {
            var10001 = arg3++;
            arg1[var10001] += arg0[var11++] * var13 >> arg5;
            var13 += arg6;
        }
        arg10.field1714 = var13 >> 8;
        arg10.field1712 = var11 << 8;
        return arg3;
    }
}
