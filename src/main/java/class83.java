import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class83 extends class41 {

    @OriginalMember(owner = "client!hg", name = "A", descriptor = "I")
    private int field1613;

    @OriginalMember(owner = "client!hg", name = "q", descriptor = "I")
    private int field1603;

    @OriginalMember(owner = "client!hg", name = "r", descriptor = "Z")
    private boolean field1604;

    @OriginalMember(owner = "client!hg", name = "y", descriptor = "I")
    private int field1611;

    @OriginalMember(owner = "client!hg", name = "x", descriptor = "I")
    private int field1610;

    @OriginalMember(owner = "client!hg", name = "t", descriptor = "I")
    private int field1606;

    @OriginalMember(owner = "client!hg", name = "B", descriptor = "I")
    private int field1614;

    @OriginalMember(owner = "client!hg", name = "s", descriptor = "I")
    private int field1605;

    @OriginalMember(owner = "client!hg", name = "u", descriptor = "I")
    private int field1607;

    @OriginalMember(owner = "client!hg", name = "v", descriptor = "I")
    private int field1608;

    @OriginalMember(owner = "client!hg", name = "w", descriptor = "I")
    private int field1609;

    @OriginalMember(owner = "client!hg", name = "z", descriptor = "I")
    private int field1612;

    @OriginalMember(owner = "client!hg", name = "C", descriptor = "I")
    private int field1615;

    @OriginalMember(owner = "client!hg", name = "D", descriptor = "I")
    private int field1616;

    @OriginalMember(owner = "client!hg", name = "E", descriptor = "I")
    private int field1617;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(II)I")
    private static final int method526(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!hg", name = "e", descriptor = "()Z")
    public final boolean method527() {
        return this.field1614 < 0 || this.field1614 >= ((class24) super.field872).field578.length << 8;
    }

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "(I)V")
    public final synchronized void method528(int arg0) {
        this.method562(arg0 << 6, this.method538());
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(II)I")
    private static final int method529(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "()Ldh;")
    public final class41 method272() {
        return null;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(II[B[IIIIIIIILhg;II)I")
    private static final int method530(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class83 arg11, int arg12, int arg13) {
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
        arg11.field1614 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "([B[IIIIIIILhg;)I")
    private static final int method531(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class83 arg8) {
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
        arg8.field1614 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(II[B[IIIIIIILhg;II)I")
    private static final int method532(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class83 arg10, int arg11, int arg12) {
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
        arg10.field1614 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "(II)V")
    public final synchronized void method533(int arg0, int arg1) {
        this.method561(arg0, arg1, this.method538());
    }

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "(I)V")
    public final synchronized void method534(int arg0) {
        int var2 = ((class24) super.field872).field578.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1614 = arg0;
    }

    @OriginalMember(owner = "client!hg", name = "e", descriptor = "(I)V")
    public final synchronized void method535(int arg0) {
        if (this.field1611 < 0) {
            this.field1611 = -arg0;
        } else {
            this.field1611 = arg0;
        }
    }

    @OriginalMember(owner = "client!hg", name = "f", descriptor = "(I)V")
    public final synchronized void method536(int arg0) {
        if (arg0 == 0) {
            this.method556(0);
            this.method592((byte) -128);
        } else if (this.field1608 == 0 && this.field1612 == 0) {
            this.field1605 = 0;
            this.field1610 = 0;
            this.field1616 = 0;
            this.method592((byte) -128);
        } else {
            int var2 = -this.field1616;
            if (this.field1616 > var2) {
                var2 = this.field1616;
            }
            if (-this.field1608 > var2) {
                var2 = -this.field1608;
            }
            if (this.field1608 > var2) {
                var2 = this.field1608;
            }
            if (-this.field1612 > var2) {
                var2 = -this.field1612;
            }
            if (this.field1612 > var2) {
                var2 = this.field1612;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1605 = arg0;
            this.field1610 = Integer.MIN_VALUE;
            this.field1607 = -this.field1616 / arg0;
            this.field1609 = -this.field1608 / arg0;
            this.field1615 = -this.field1612 / arg0;
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lcb;II)Lhg;")
    public static final class83 method537(class24 arg0, int arg1, int arg2) {
        return arg0.field578 != null && arg0.field578.length != 0 ? new class83(arg0, (int) ((long) arg0.field577 * 256L * (long) arg1 / (long) (class80.field1542 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "()Ldh;")
    public final class41 method274() {
        return null;
    }

    @OriginalMember(owner = "client!hg", name = "f", descriptor = "()I")
    public final synchronized int method538() {
        return this.field1606 < 0 ? -1 : this.field1606;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "([III)V")
    public final synchronized void method275(int[] arg0, int arg1, int arg2) {
        if (this.field1610 == 0 && this.field1605 == 0) {
            this.method277(arg2);
        } else {
            class24 var4 = (class24) super.field872;
            int var5 = this.field1613 << 8;
            int var6 = this.field1603 << 8;
            int var7 = var4.field578.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field1617 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field1614 < 0) {
                if (this.field1611 <= 0) {
                    this.method549();
                    this.method592((byte) -128);
                    return;
                }
                this.field1614 = 0;
            }
            if (this.field1614 >= var7) {
                if (this.field1611 >= 0) {
                    this.method549();
                    this.method592((byte) -128);
                    return;
                }
                this.field1614 = var7 - 1;
            }
            if (this.field1617 < 0) {
                if (this.field1604) {
                    if (this.field1611 < 0) {
                        var9 = this.method540(arg0, arg1, var5, var10, var4.field578[this.field1613]);
                        if (this.field1614 >= var5) {
                            return;
                        }
                        this.field1614 = var5 + var5 - 1 - this.field1614;
                        this.field1611 = -this.field1611;
                    }
                    while (true) {
                        int var11 = this.method565(arg0, var9, var6, var10, var4.field578[this.field1603 - 1]);
                        if (this.field1614 < var6) {
                            return;
                        }
                        this.field1614 = var6 + var6 - 1 - this.field1614;
                        this.field1611 = -this.field1611;
                        var9 = this.method540(arg0, var11, var5, var10, var4.field578[this.field1613]);
                        if (this.field1614 >= var5) {
                            return;
                        }
                        this.field1614 = var5 + var5 - 1 - this.field1614;
                        this.field1611 = -this.field1611;
                    }
                } else if (this.field1611 < 0) {
                    while (true) {
                        var9 = this.method540(arg0, var9, var5, var10, var4.field578[this.field1603 - 1]);
                        if (this.field1614 >= var5) {
                            return;
                        }
                        this.field1614 = var6 - 1 - (var6 - 1 - this.field1614) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method565(arg0, var9, var6, var10, var4.field578[this.field1613]);
                        if (this.field1614 < var6) {
                            return;
                        }
                        this.field1614 = (this.field1614 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field1617 > 0) {
                    if (this.field1604) {
                        label130: {
                            if (this.field1611 < 0) {
                                var9 = this.method540(arg0, arg1, var5, var10, var4.field578[this.field1613]);
                                if (this.field1614 >= var5) {
                                    return;
                                }
                                this.field1614 = var5 + var5 - 1 - this.field1614;
                                this.field1611 = -this.field1611;
                                if (--this.field1617 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method565(arg0, var9, var6, var10, var4.field578[this.field1603 - 1]);
                                if (this.field1614 < var6) {
                                    return;
                                }
                                this.field1614 = var6 + var6 - 1 - this.field1614;
                                this.field1611 = -this.field1611;
                                if (--this.field1617 == 0) {
                                    break;
                                }
                                var9 = this.method540(arg0, var9, var5, var10, var4.field578[this.field1613]);
                                if (this.field1614 >= var5) {
                                    return;
                                }
                                this.field1614 = var5 + var5 - 1 - this.field1614;
                                this.field1611 = -this.field1611;
                            } while (--this.field1617 != 0);
                        }
                    } else if (this.field1611 < 0) {
                        while (true) {
                            var9 = this.method540(arg0, var9, var5, var10, var4.field578[this.field1603 - 1]);
                            if (this.field1614 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field1614) / var8;
                            if (var12 >= this.field1617) {
                                this.field1614 += this.field1617 * var8;
                                this.field1617 = 0;
                                break;
                            }
                            this.field1614 += var8 * var12;
                            this.field1617 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method565(arg0, var9, var6, var10, var4.field578[this.field1613]);
                            if (this.field1614 < var6) {
                                return;
                            }
                            int var13 = (this.field1614 - var5) / var8;
                            if (var13 >= this.field1617) {
                                this.field1614 -= this.field1617 * var8;
                                this.field1617 = 0;
                                break;
                            }
                            this.field1614 -= var8 * var13;
                            this.field1617 -= var13;
                        }
                    }
                }
                if (this.field1611 < 0) {
                    this.method540(arg0, var9, 0, var10, 0);
                    if (this.field1614 < 0) {
                        this.field1614 = -1;
                        this.method549();
                        this.method592((byte) -128);
                        return;
                    }
                } else {
                    this.method565(arg0, var9, var7, var10, 0);
                    if (this.field1614 >= var7) {
                        this.field1614 = var7;
                        this.method549();
                        this.method592((byte) -128);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(II[B[IIIIIIIIIILhg;II)I")
    private static final int method539(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class83 arg13, int arg14, int arg15) {
        arg13.field1616 -= arg13.field1607 * arg5;
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
        arg13.field1616 += arg13.field1607 * var22;
        arg13.field1608 = arg6;
        arg13.field1612 = arg7;
        arg13.field1614 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "([IIIII)I")
    private final int method540(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field1605 <= 0) {
                if (this.field1611 == -256 && (this.field1614 & 255) == 0) {
                    if (class121.field2268) {
                        return method564(0, ((class24) super.field872).field578, arg0, this.field1614, arg1, this.field1608, this.field1612, 0, arg3, arg2, this);
                    }
                    return method531(((class24) super.field872).field578, arg0, this.field1614, arg1, this.field1616, 0, arg3, arg2, this);
                }
                if (class121.field2268) {
                    return method530(0, 0, ((class24) super.field872).field578, arg0, this.field1614, arg1, this.field1608, this.field1612, 0, arg3, arg2, this, this.field1611, arg4);
                }
                return method532(0, 0, ((class24) super.field872).field578, arg0, this.field1614, arg1, this.field1616, 0, arg3, arg2, this, this.field1611, arg4);
            }
            int var6 = this.field1605 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field1605 += arg1;
            if (this.field1611 == -256 && (this.field1614 & 255) == 0) {
                if (class121.field2268) {
                    arg1 = method548(0, ((class24) super.field872).field578, arg0, this.field1614, arg1, this.field1608, this.field1612, this.field1609, this.field1615, 0, var6, arg2, this);
                } else {
                    arg1 = method542(((class24) super.field872).field578, arg0, this.field1614, arg1, this.field1616, this.field1607, 0, var6, arg2, this);
                }
            } else if (class121.field2268) {
                arg1 = method563(0, 0, ((class24) super.field872).field578, arg0, this.field1614, arg1, this.field1608, this.field1612, this.field1609, this.field1615, 0, var6, arg2, this, this.field1611, arg4);
            } else {
                arg1 = method557(0, 0, ((class24) super.field872).field578, arg0, this.field1614, arg1, this.field1616, this.field1607, 0, var6, arg2, this, this.field1611, arg4);
            }
            this.field1605 -= arg1;
            if (this.field1605 != 0) {
                return arg1;
            }
        } while (!this.method553());
        return arg3;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lcb;III)Lhg;")
    public static final class83 method541(class24 arg0, int arg1, int arg2, int arg3) {
        return arg0.field578 != null && arg0.field578.length != 0 ? new class83(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "([B[IIIIIIIILhg;)I")
    private static final int method542(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class83 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1608 += (var14 - arg3) * arg9.field1609;
        arg9.field1612 += (var14 - arg3) * arg9.field1615;
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
        arg9.field1616 = var12 >> 2;
        arg9.field1614 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Z)V")
    public final synchronized void method543(boolean arg0) {
        this.field1611 = (this.field1611 >>> 31) + (this.field1611 ^ this.field1611 >> 31);
        if (arg0) {
            this.field1611 = -this.field1611;
        }
    }

    @OriginalMember(owner = "client!hg", name = "g", descriptor = "()Z")
    public final boolean method544() {
        return this.field1605 != 0;
    }

    @OriginalMember(owner = "client!hg", name = "h", descriptor = "()V")
    private final void method545() {
        this.field1616 = this.field1610;
        this.field1608 = method526(this.field1610, this.field1606);
        this.field1612 = method529(this.field1610, this.field1606);
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(II[B[IIIIIIIILhg;II)I")
    private static final int method546(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class83 arg11, int arg12, int arg13) {
        arg11.field1608 -= arg11.field1609 * arg5;
        arg11.field1612 -= arg11.field1615 * arg5;
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
        arg11.field1608 += arg11.field1609 * arg5;
        arg11.field1612 += arg11.field1615 * arg5;
        arg11.field1616 = arg6;
        arg11.field1614 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(II[B[IIIIIIILhg;II)I")
    private static final int method547(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class83 arg10, int arg11, int arg12) {
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
        arg10.field1614 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(I[B[IIIIIIIIIILhg;)I")
    private static final int method548(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class83 arg12) {
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
        arg12.field1616 += (var19 - arg4) * arg12.field1607;
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
        arg12.field1608 = var15 >> 2;
        arg12.field1612 = var16 >> 2;
        arg12.field1614 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!hg", name = "i", descriptor = "()V")
    private final void method549() {
        if (this.field1605 != 0) {
            if (this.field1610 == Integer.MIN_VALUE) {
                this.field1610 = 0;
            }
            this.field1605 = 0;
            this.method545();
        }
    }

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "()I")
    public final int method276() {
        return this.field1610 == 0 && this.field1605 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!hg", name = "j", descriptor = "()I")
    public final synchronized int method550() {
        return this.field1611 < 0 ? -this.field1611 : this.field1611;
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(I[B[IIIIIIIIIILhg;)I")
    private static final int method551(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class83 arg12) {
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
        arg12.field1616 += (var19 - arg4) * arg12.field1607;
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
        arg12.field1608 = var15 >> 2;
        arg12.field1612 = var16 >> 2;
        arg12.field1614 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!hg", name = "g", descriptor = "(I)V")
    public final synchronized void method552(int arg0) {
        this.field1617 = arg0;
    }

    @OriginalMember(owner = "client!hg", name = "k", descriptor = "()Z")
    private final boolean method553() {
        int var1 = this.field1610;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method526(var1, this.field1606);
            var2 = method529(var1, this.field1606);
        }
        if (this.field1616 == var1 && this.field1608 == var3 && this.field1612 == var2) {
            if (this.field1610 == Integer.MIN_VALUE) {
                this.field1610 = 0;
                this.field1616 = this.field1608 = this.field1612 = 0;
                this.method592((byte) -128);
                return true;
            } else {
                this.method545();
                return false;
            }
        } else {
            if (this.field1616 < var1) {
                this.field1607 = 1;
                this.field1605 = var1 - this.field1616;
            } else if (this.field1616 > var1) {
                this.field1607 = -1;
                this.field1605 = this.field1616 - var1;
            } else {
                this.field1607 = 0;
            }
            if (this.field1608 < var3) {
                this.field1609 = 1;
                if (this.field1605 == 0 || this.field1605 > var3 - this.field1608) {
                    this.field1605 = var3 - this.field1608;
                }
            } else if (this.field1608 > var3) {
                this.field1609 = -1;
                if (this.field1605 == 0 || this.field1605 > this.field1608 - var3) {
                    this.field1605 = this.field1608 - var3;
                }
            } else {
                this.field1609 = 0;
            }
            if (this.field1612 < var2) {
                this.field1615 = 1;
                if (this.field1605 == 0 || this.field1605 > var2 - this.field1612) {
                    this.field1605 = var2 - this.field1612;
                }
            } else if (this.field1612 > var2) {
                this.field1615 = -1;
                if (this.field1605 == 0 || this.field1605 > this.field1612 - var2) {
                    this.field1605 = this.field1612 - var2;
                }
            } else {
                this.field1615 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!hg", name = "l", descriptor = "()I")
    public final synchronized int method554() {
        return this.field1610 == Integer.MIN_VALUE ? 0 : this.field1610;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(I[B[IIIIIIIILhg;)I")
    private static final int method555(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class83 arg10) {
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
        arg10.field1614 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(I)V")
    public final synchronized void method277(int arg0) {
        if (this.field1605 > 0) {
            if (arg0 >= this.field1605) {
                if (this.field1610 == Integer.MIN_VALUE) {
                    this.field1610 = 0;
                    this.field1616 = this.field1608 = this.field1612 = 0;
                    this.method592((byte) -128);
                    arg0 = this.field1605;
                }
                this.field1605 = 0;
                this.method545();
            } else {
                this.field1616 += this.field1607 * arg0;
                this.field1608 += this.field1609 * arg0;
                this.field1612 += this.field1615 * arg0;
                this.field1605 -= arg0;
            }
        }
        class24 var2 = (class24) super.field872;
        int var3 = this.field1613 << 8;
        int var4 = this.field1603 << 8;
        int var5 = var2.field578.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1617 = 0;
        }
        if (this.field1614 < 0) {
            if (this.field1611 <= 0) {
                this.method549();
                this.method592((byte) -128);
                return;
            }
            this.field1614 = 0;
        }
        if (this.field1614 >= var5) {
            if (this.field1611 >= 0) {
                this.method549();
                this.method592((byte) -128);
                return;
            }
            this.field1614 = var5 - 1;
        }
        this.field1614 += this.field1611 * arg0;
        if (this.field1617 < 0) {
            if (!this.field1604) {
                if (this.field1611 < 0) {
                    if (this.field1614 < var3) {
                        this.field1614 = var4 - 1 - (var4 - 1 - this.field1614) % var6;
                    }
                } else if (this.field1614 >= var4) {
                    this.field1614 = (this.field1614 - var3) % var6 + var3;
                }
            } else {
                if (this.field1611 < 0) {
                    if (this.field1614 >= var3) {
                        return;
                    }
                    this.field1614 = var3 + var3 - 1 - this.field1614;
                    this.field1611 = -this.field1611;
                }
                while (this.field1614 >= var4) {
                    this.field1614 = var4 + var4 - 1 - this.field1614;
                    this.field1611 = -this.field1611;
                    if (this.field1614 >= var3) {
                        return;
                    }
                    this.field1614 = var3 + var3 - 1 - this.field1614;
                    this.field1611 = -this.field1611;
                }
            }
        } else {
            if (this.field1617 > 0) {
                if (this.field1604) {
                    label125: {
                        if (this.field1611 < 0) {
                            if (this.field1614 >= var3) {
                                return;
                            }
                            this.field1614 = var3 + var3 - 1 - this.field1614;
                            this.field1611 = -this.field1611;
                            if (--this.field1617 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field1614 < var4) {
                                return;
                            }
                            this.field1614 = var4 + var4 - 1 - this.field1614;
                            this.field1611 = -this.field1611;
                            if (--this.field1617 == 0) {
                                break;
                            }
                            if (this.field1614 >= var3) {
                                return;
                            }
                            this.field1614 = var3 + var3 - 1 - this.field1614;
                            this.field1611 = -this.field1611;
                        } while (--this.field1617 != 0);
                    }
                } else if (this.field1611 < 0) {
                    if (this.field1614 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field1614) / var6;
                    if (var7 < this.field1617) {
                        this.field1614 += var6 * var7;
                        this.field1617 -= var7;
                        return;
                    }
                    this.field1614 += this.field1617 * var6;
                    this.field1617 = 0;
                } else {
                    if (this.field1614 < var4) {
                        return;
                    }
                    int var8 = (this.field1614 - var3) / var6;
                    if (var8 < this.field1617) {
                        this.field1614 -= var6 * var8;
                        this.field1617 -= var8;
                        return;
                    }
                    this.field1614 -= this.field1617 * var6;
                    this.field1617 = 0;
                }
            }
            if (this.field1611 < 0) {
                if (this.field1614 < 0) {
                    this.field1614 = -1;
                    this.method549();
                    this.method592((byte) -128);
                    return;
                }
            } else if (this.field1614 >= var5) {
                this.field1614 = var5;
                this.method549();
                this.method592((byte) -128);
            }
        }
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "()I")
    public final int method273() {
        int var1 = this.field1616 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1617 == 0) {
            var2 -= this.field1614 * var2 / (((class24) super.field872).field578.length << 8);
        } else if (this.field1617 >= 0) {
            var2 -= this.field1613 * var2 / ((class24) super.field872).field578.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!hg", name = "h", descriptor = "(I)V")
    private final synchronized void method556(int arg0) {
        this.method562(arg0, this.method538());
    }

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "(II[B[IIIIIIIILhg;II)I")
    private static final int method557(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class83 arg11, int arg12, int arg13) {
        arg11.field1608 -= arg11.field1609 * arg5;
        arg11.field1612 -= arg11.field1615 * arg5;
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
        arg11.field1608 += arg11.field1609 * arg5;
        arg11.field1612 += arg11.field1615 * arg5;
        arg11.field1616 = arg6;
        arg11.field1614 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "([B[IIIIIIIILhg;)I")
    private static final int method558(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class83 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1608 += (var14 - arg3) * arg9.field1609;
        arg9.field1612 += (var14 - arg3) * arg9.field1615;
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
        arg9.field1616 = var12 >> 2;
        arg9.field1614 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "([B[IIIIIIILhg;)I")
    private static final int method559(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class83 arg8) {
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
        arg8.field1614 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "(II[B[IIIIIIIILhg;II)I")
    private static final int method560(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class83 arg11, int arg12, int arg13) {
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
        arg11.field1614 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(III)V")
    public final synchronized void method561(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method562(arg1, arg2);
        } else {
            int var4 = method526(arg1, arg2);
            int var5 = method529(arg1, arg2);
            if (this.field1608 == var4 && this.field1612 == var5) {
                this.field1605 = 0;
            } else {
                int var6 = arg1 - this.field1616;
                if (this.field1616 - arg1 > var6) {
                    var6 = this.field1616 - arg1;
                }
                if (var4 - this.field1608 > var6) {
                    var6 = var4 - this.field1608;
                }
                if (this.field1608 - var4 > var6) {
                    var6 = this.field1608 - var4;
                }
                if (var5 - this.field1612 > var6) {
                    var6 = var5 - this.field1612;
                }
                if (this.field1612 - var5 > var6) {
                    var6 = this.field1612 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field1605 = arg0;
                this.field1610 = arg1;
                this.field1606 = arg2;
                this.field1607 = (arg1 - this.field1616) / arg0;
                this.field1609 = (var4 - this.field1608) / arg0;
                this.field1615 = (var5 - this.field1612) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "(II)V")
    private final synchronized void method562(int arg0, int arg1) {
        this.field1610 = arg0;
        this.field1606 = arg1;
        this.field1605 = 0;
        this.method545();
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(II[B[IIIIIIIIIILhg;II)I")
    private static final int method563(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class83 arg13, int arg14, int arg15) {
        arg13.field1616 -= arg13.field1607 * arg5;
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
        arg13.field1616 += arg13.field1607 * var22;
        arg13.field1608 = arg6;
        arg13.field1612 = arg7;
        arg13.field1614 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(I[B[IIIIIIIILhg;)I")
    private static final int method564(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class83 arg10) {
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
        arg10.field1614 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "([IIIII)I")
    private final int method565(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field1605 <= 0) {
                if (this.field1611 == 256 && (this.field1614 & 255) == 0) {
                    if (class121.field2268) {
                        return method555(0, ((class24) super.field872).field578, arg0, this.field1614, arg1, this.field1608, this.field1612, 0, arg3, arg2, this);
                    }
                    return method559(((class24) super.field872).field578, arg0, this.field1614, arg1, this.field1616, 0, arg3, arg2, this);
                }
                if (class121.field2268) {
                    return method560(0, 0, ((class24) super.field872).field578, arg0, this.field1614, arg1, this.field1608, this.field1612, 0, arg3, arg2, this, this.field1611, arg4);
                }
                return method547(0, 0, ((class24) super.field872).field578, arg0, this.field1614, arg1, this.field1616, 0, arg3, arg2, this, this.field1611, arg4);
            }
            int var6 = this.field1605 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field1605 += arg1;
            if (this.field1611 == 256 && (this.field1614 & 255) == 0) {
                if (class121.field2268) {
                    arg1 = method551(0, ((class24) super.field872).field578, arg0, this.field1614, arg1, this.field1608, this.field1612, this.field1609, this.field1615, 0, var6, arg2, this);
                } else {
                    arg1 = method558(((class24) super.field872).field578, arg0, this.field1614, arg1, this.field1616, this.field1607, 0, var6, arg2, this);
                }
            } else if (class121.field2268) {
                arg1 = method539(0, 0, ((class24) super.field872).field578, arg0, this.field1614, arg1, this.field1608, this.field1612, this.field1609, this.field1615, 0, var6, arg2, this, this.field1611, arg4);
            } else {
                arg1 = method546(0, 0, ((class24) super.field872).field578, arg0, this.field1614, arg1, this.field1616, this.field1607, 0, var6, arg2, this, this.field1611, arg4);
            }
            this.field1605 -= arg1;
            if (this.field1605 != 0) {
                return arg1;
            }
        } while (!this.method553());
        return arg3;
    }

    @OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(Lcb;II)V")
    private class83(class24 arg0, int arg1, int arg2) {
        super.field872 = arg0;
        this.field1613 = arg0.field575;
        this.field1603 = arg0.field574;
        this.field1604 = arg0.field576;
        this.field1611 = arg1;
        this.field1610 = arg2;
        this.field1606 = 8192;
        this.field1614 = 0;
        this.method545();
    }

    @OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(Lcb;III)V")
    private class83(class24 arg0, int arg1, int arg2, int arg3) {
        super.field872 = arg0;
        this.field1613 = arg0.field575;
        this.field1603 = arg0.field574;
        this.field1604 = arg0.field576;
        this.field1611 = arg1;
        this.field1610 = arg2;
        this.field1606 = arg3;
        this.field1614 = 0;
        this.method545();
    }
}
