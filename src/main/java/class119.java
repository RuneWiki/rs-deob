import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class119 extends class177 {

    @OriginalMember(owner = "client!vj", name = "z", descriptor = "I")
    private int field1803;

    @OriginalMember(owner = "client!vj", name = "r", descriptor = "I")
    private int field1795;

    @OriginalMember(owner = "client!vj", name = "t", descriptor = "Z")
    private boolean field1797;

    @OriginalMember(owner = "client!vj", name = "F", descriptor = "I")
    private int field1809;

    @OriginalMember(owner = "client!vj", name = "w", descriptor = "I")
    private int field1800;

    @OriginalMember(owner = "client!vj", name = "B", descriptor = "I")
    private int field1805;

    @OriginalMember(owner = "client!vj", name = "A", descriptor = "I")
    private int field1804;

    @OriginalMember(owner = "client!vj", name = "s", descriptor = "I")
    private int field1796;

    @OriginalMember(owner = "client!vj", name = "u", descriptor = "I")
    private int field1798;

    @OriginalMember(owner = "client!vj", name = "v", descriptor = "I")
    private int field1799;

    @OriginalMember(owner = "client!vj", name = "x", descriptor = "I")
    private int field1801;

    @OriginalMember(owner = "client!vj", name = "y", descriptor = "I")
    private int field1802;

    @OriginalMember(owner = "client!vj", name = "C", descriptor = "I")
    private int field1806;

    @OriginalMember(owner = "client!vj", name = "D", descriptor = "I")
    private int field1807;

    @OriginalMember(owner = "client!vj", name = "E", descriptor = "I")
    private int field1808;

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "()I")
    public final int method866() {
        int var1 = this.field1807 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1796 == 0) {
            var2 -= this.field1804 * var2 / (((class90) super.field2726).field1413.length << 8);
        } else if (this.field1796 >= 0) {
            var2 -= this.field1803 * var2 / ((class90) super.field2726).field1413.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(II[B[IIIIIIIIIILvj;II)I")
    private static final int method867(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class119 arg13, int arg14, int arg15) {
        arg13.field1807 -= arg13.field1798 * arg5;
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
        arg13.field1807 += arg13.field1798 * var22;
        arg13.field1802 = arg6;
        arg13.field1801 = arg7;
        arg13.field1804 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "([B[IIIIIIIILvj;)I")
    private static final int method868(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class119 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1802 += (var14 - arg3) * arg9.field1799;
        arg9.field1801 += (var14 - arg3) * arg9.field1808;
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
        arg9.field1807 = var12 >> 2;
        arg9.field1804 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Ljd;II)Lvj;")
    public static final class119 method869(class90 arg0, int arg1, int arg2) {
        return arg0.field1413 != null && arg0.field1413.length != 0 ? new class119(arg0, (int) ((long) arg0.field1414 * 256L * (long) arg1 / (long) (class174.field2695 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!vj", name = "e", descriptor = "()Z")
    public final boolean method870() {
        return this.field1806 != 0;
    }

    @OriginalMember(owner = "client!vj", name = "f", descriptor = "()I")
    public final synchronized int method871() {
        return this.field1800 == Integer.MIN_VALUE ? 0 : this.field1800;
    }

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "(I)V")
    public final synchronized void method872(int arg0) {
        this.method890(arg0 << 6, this.method873());
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "()Lga;")
    public final class177 method160() {
        return null;
    }

    @OriginalMember(owner = "client!vj", name = "g", descriptor = "()I")
    public final synchronized int method873() {
        return this.field1805 < 0 ? -1 : this.field1805;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(II[B[IIIIIIIILvj;II)I")
    private static final int method874(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class119 arg11, int arg12, int arg13) {
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
        arg11.field1804 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "([III)V")
    public final synchronized void method178(int[] arg0, int arg1, int arg2) {
        if (this.field1800 == 0 && this.field1806 == 0) {
            this.method156(arg2);
        } else {
            class90 var4 = (class90) super.field2726;
            int var5 = this.field1803 << 8;
            int var6 = this.field1795 << 8;
            int var7 = var4.field1413.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field1796 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field1804 < 0) {
                if (this.field1809 <= 0) {
                    this.method898();
                    this.method995((byte) 46);
                    return;
                }
                this.field1804 = 0;
            }
            if (this.field1804 >= var7) {
                if (this.field1809 >= 0) {
                    this.method898();
                    this.method995((byte) 114);
                    return;
                }
                this.field1804 = var7 - 1;
            }
            if (this.field1796 < 0) {
                if (this.field1797) {
                    if (this.field1809 < 0) {
                        var9 = this.method893(arg0, arg1, var5, var10, var4.field1413[this.field1803]);
                        if (this.field1804 >= var5) {
                            return;
                        }
                        this.field1804 = var5 + var5 - 1 - this.field1804;
                        this.field1809 = -this.field1809;
                    }
                    while (true) {
                        int var11 = this.method879(arg0, var9, var6, var10, var4.field1413[this.field1795 - 1]);
                        if (this.field1804 < var6) {
                            return;
                        }
                        this.field1804 = var6 + var6 - 1 - this.field1804;
                        this.field1809 = -this.field1809;
                        var9 = this.method893(arg0, var11, var5, var10, var4.field1413[this.field1803]);
                        if (this.field1804 >= var5) {
                            return;
                        }
                        this.field1804 = var5 + var5 - 1 - this.field1804;
                        this.field1809 = -this.field1809;
                    }
                } else if (this.field1809 < 0) {
                    while (true) {
                        var9 = this.method893(arg0, var9, var5, var10, var4.field1413[this.field1795 - 1]);
                        if (this.field1804 >= var5) {
                            return;
                        }
                        this.field1804 = var6 - 1 - (var6 - 1 - this.field1804) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method879(arg0, var9, var6, var10, var4.field1413[this.field1803]);
                        if (this.field1804 < var6) {
                            return;
                        }
                        this.field1804 = (this.field1804 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field1796 > 0) {
                    if (this.field1797) {
                        label130: {
                            if (this.field1809 < 0) {
                                var9 = this.method893(arg0, arg1, var5, var10, var4.field1413[this.field1803]);
                                if (this.field1804 >= var5) {
                                    return;
                                }
                                this.field1804 = var5 + var5 - 1 - this.field1804;
                                this.field1809 = -this.field1809;
                                if (--this.field1796 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method879(arg0, var9, var6, var10, var4.field1413[this.field1795 - 1]);
                                if (this.field1804 < var6) {
                                    return;
                                }
                                this.field1804 = var6 + var6 - 1 - this.field1804;
                                this.field1809 = -this.field1809;
                                if (--this.field1796 == 0) {
                                    break;
                                }
                                var9 = this.method893(arg0, var9, var5, var10, var4.field1413[this.field1803]);
                                if (this.field1804 >= var5) {
                                    return;
                                }
                                this.field1804 = var5 + var5 - 1 - this.field1804;
                                this.field1809 = -this.field1809;
                            } while (--this.field1796 != 0);
                        }
                    } else if (this.field1809 < 0) {
                        while (true) {
                            var9 = this.method893(arg0, var9, var5, var10, var4.field1413[this.field1795 - 1]);
                            if (this.field1804 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field1804) / var8;
                            if (var12 >= this.field1796) {
                                this.field1804 += this.field1796 * var8;
                                this.field1796 = 0;
                                break;
                            }
                            this.field1804 += var8 * var12;
                            this.field1796 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method879(arg0, var9, var6, var10, var4.field1413[this.field1803]);
                            if (this.field1804 < var6) {
                                return;
                            }
                            int var13 = (this.field1804 - var5) / var8;
                            if (var13 >= this.field1796) {
                                this.field1804 -= this.field1796 * var8;
                                this.field1796 = 0;
                                break;
                            }
                            this.field1804 -= var8 * var13;
                            this.field1796 -= var13;
                        }
                    }
                }
                if (this.field1809 < 0) {
                    this.method893(arg0, var9, 0, var10, 0);
                    if (this.field1804 < 0) {
                        this.field1804 = -1;
                        this.method898();
                        this.method995((byte) -93);
                        return;
                    }
                } else {
                    this.method879(arg0, var9, var7, var10, 0);
                    if (this.field1804 >= var7) {
                        this.field1804 = var7;
                        this.method898();
                        this.method995((byte) 105);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(II[B[IIIIIIIILvj;II)I")
    private static final int method875(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class119 arg11, int arg12, int arg13) {
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
        arg11.field1804 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(II[B[IIIIIIIIIILvj;II)I")
    private static final int method876(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class119 arg13, int arg14, int arg15) {
        arg13.field1807 -= arg13.field1798 * arg5;
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
        arg13.field1807 += arg13.field1798 * var22;
        arg13.field1802 = arg6;
        arg13.field1801 = arg7;
        arg13.field1804 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "([B[IIIIIIIILvj;)I")
    private static final int method877(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class119 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1802 += (var14 - arg3) * arg9.field1799;
        arg9.field1801 += (var14 - arg3) * arg9.field1808;
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
        arg9.field1807 = var12 >> 2;
        arg9.field1804 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!vj", name = "e", descriptor = "(I)V")
    public final synchronized void method878(int arg0) {
        this.field1796 = arg0;
    }

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "()Lga;")
    public final class177 method152() {
        return null;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "([IIIII)I")
    private final int method879(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field1806 <= 0) {
                if (this.field1809 == 256 && (this.field1804 & 255) == 0) {
                    if (class259.field4107) {
                        return method894(0, ((class90) super.field2726).field1413, arg0, this.field1804, arg1, this.field1802, this.field1801, 0, arg3, arg2, this);
                    }
                    return method881(((class90) super.field2726).field1413, arg0, this.field1804, arg1, this.field1807, 0, arg3, arg2, this);
                }
                if (class259.field4107) {
                    return method874(0, 0, ((class90) super.field2726).field1413, arg0, this.field1804, arg1, this.field1802, this.field1801, 0, arg3, arg2, this, this.field1809, arg4);
                }
                return method896(0, 0, ((class90) super.field2726).field1413, arg0, this.field1804, arg1, this.field1807, 0, arg3, arg2, this, this.field1809, arg4);
            }
            int var6 = this.field1806 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field1806 += arg1;
            if (this.field1809 == 256 && (this.field1804 & 255) == 0) {
                if (class259.field4107) {
                    arg1 = method892(0, ((class90) super.field2726).field1413, arg0, this.field1804, arg1, this.field1802, this.field1801, this.field1799, this.field1808, 0, var6, arg2, this);
                } else {
                    arg1 = method877(((class90) super.field2726).field1413, arg0, this.field1804, arg1, this.field1807, this.field1798, 0, var6, arg2, this);
                }
            } else if (class259.field4107) {
                arg1 = method867(0, 0, ((class90) super.field2726).field1413, arg0, this.field1804, arg1, this.field1802, this.field1801, this.field1799, this.field1808, 0, var6, arg2, this, this.field1809, arg4);
            } else {
                arg1 = method899(0, 0, ((class90) super.field2726).field1413, arg0, this.field1804, arg1, this.field1807, this.field1798, 0, var6, arg2, this, this.field1809, arg4);
            }
            this.field1806 -= arg1;
            if (this.field1806 != 0) {
                return arg1;
            }
        } while (!this.method902());
        return arg3;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(II[B[IIIIIIILvj;II)I")
    private static final int method880(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class119 arg10, int arg11, int arg12) {
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
        arg10.field1804 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "([B[IIIIIIILvj;)I")
    private static final int method881(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class119 arg8) {
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
        arg8.field1804 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!vj", name = "h", descriptor = "()Z")
    public final boolean method882() {
        return this.field1804 < 0 || this.field1804 >= ((class90) super.field2726).field1413.length << 8;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(III)V")
    public final synchronized void method883(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method890(arg1, arg2);
        } else {
            int var4 = method884(arg1, arg2);
            int var5 = method900(arg1, arg2);
            if (this.field1802 == var4 && this.field1801 == var5) {
                this.field1806 = 0;
            } else {
                int var6 = arg1 - this.field1807;
                if (this.field1807 - arg1 > var6) {
                    var6 = this.field1807 - arg1;
                }
                if (var4 - this.field1802 > var6) {
                    var6 = var4 - this.field1802;
                }
                if (this.field1802 - var4 > var6) {
                    var6 = this.field1802 - var4;
                }
                if (var5 - this.field1801 > var6) {
                    var6 = var5 - this.field1801;
                }
                if (this.field1801 - var5 > var6) {
                    var6 = this.field1801 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field1806 = arg0;
                this.field1800 = arg1;
                this.field1805 = arg2;
                this.field1798 = (arg1 - this.field1807) / arg0;
                this.field1799 = (var4 - this.field1802) / arg0;
                this.field1808 = (var5 - this.field1801) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(II)I")
    private static final int method884(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!vj", name = "f", descriptor = "(I)V")
    public final synchronized void method885(int arg0) {
        if (arg0 == 0) {
            this.method888(0);
            this.method995((byte) -105);
        } else if (this.field1802 == 0 && this.field1801 == 0) {
            this.field1806 = 0;
            this.field1800 = 0;
            this.field1807 = 0;
            this.method995((byte) -17);
        } else {
            int var2 = -this.field1807;
            if (this.field1807 > var2) {
                var2 = this.field1807;
            }
            if (-this.field1802 > var2) {
                var2 = -this.field1802;
            }
            if (this.field1802 > var2) {
                var2 = this.field1802;
            }
            if (-this.field1801 > var2) {
                var2 = -this.field1801;
            }
            if (this.field1801 > var2) {
                var2 = this.field1801;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1806 = arg0;
            this.field1800 = Integer.MIN_VALUE;
            this.field1798 = -this.field1807 / arg0;
            this.field1799 = -this.field1802 / arg0;
            this.field1808 = -this.field1801 / arg0;
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "()I")
    public final int method162() {
        return this.field1800 == 0 && this.field1806 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(I[B[IIIIIIIILvj;)I")
    private static final int method886(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class119 arg10) {
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
        arg10.field1804 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "(II[B[IIIIIIIILvj;II)I")
    private static final int method887(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class119 arg11, int arg12, int arg13) {
        arg11.field1802 -= arg11.field1799 * arg5;
        arg11.field1801 -= arg11.field1808 * arg5;
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
        arg11.field1802 += arg11.field1799 * arg5;
        arg11.field1801 += arg11.field1808 * arg5;
        arg11.field1807 = arg6;
        arg11.field1804 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!vj", name = "g", descriptor = "(I)V")
    private final synchronized void method888(int arg0) {
        this.method890(arg0, this.method873());
    }

    @OriginalMember(owner = "client!vj", name = "i", descriptor = "()I")
    public final synchronized int method889() {
        return this.field1809 < 0 ? -this.field1809 : this.field1809;
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(II)V")
    private final synchronized void method890(int arg0, int arg1) {
        this.field1800 = arg0;
        this.field1805 = arg1;
        this.field1806 = 0;
        this.method905();
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Ljd;III)Lvj;")
    public static final class119 method891(class90 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1413 != null && arg0.field1413.length != 0 ? new class119(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(I[B[IIIIIIIIIILvj;)I")
    private static final int method892(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class119 arg12) {
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
        arg12.field1807 += (var19 - arg4) * arg12.field1798;
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
        arg12.field1802 = var15 >> 2;
        arg12.field1801 = var16 >> 2;
        arg12.field1804 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "([IIIII)I")
    private final int method893(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field1806 <= 0) {
                if (this.field1809 == -256 && (this.field1804 & 255) == 0) {
                    if (class259.field4107) {
                        return method886(0, ((class90) super.field2726).field1413, arg0, this.field1804, arg1, this.field1802, this.field1801, 0, arg3, arg2, this);
                    }
                    return method903(((class90) super.field2726).field1413, arg0, this.field1804, arg1, this.field1807, 0, arg3, arg2, this);
                }
                if (class259.field4107) {
                    return method875(0, 0, ((class90) super.field2726).field1413, arg0, this.field1804, arg1, this.field1802, this.field1801, 0, arg3, arg2, this, this.field1809, arg4);
                }
                return method880(0, 0, ((class90) super.field2726).field1413, arg0, this.field1804, arg1, this.field1807, 0, arg3, arg2, this, this.field1809, arg4);
            }
            int var6 = this.field1806 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field1806 += arg1;
            if (this.field1809 == -256 && (this.field1804 & 255) == 0) {
                if (class259.field4107) {
                    arg1 = method901(0, ((class90) super.field2726).field1413, arg0, this.field1804, arg1, this.field1802, this.field1801, this.field1799, this.field1808, 0, var6, arg2, this);
                } else {
                    arg1 = method868(((class90) super.field2726).field1413, arg0, this.field1804, arg1, this.field1807, this.field1798, 0, var6, arg2, this);
                }
            } else if (class259.field4107) {
                arg1 = method876(0, 0, ((class90) super.field2726).field1413, arg0, this.field1804, arg1, this.field1802, this.field1801, this.field1799, this.field1808, 0, var6, arg2, this, this.field1809, arg4);
            } else {
                arg1 = method887(0, 0, ((class90) super.field2726).field1413, arg0, this.field1804, arg1, this.field1807, this.field1798, 0, var6, arg2, this, this.field1809, arg4);
            }
            this.field1806 -= arg1;
            if (this.field1806 != 0) {
                return arg1;
            }
        } while (!this.method902());
        return arg3;
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(I[B[IIIIIIIILvj;)I")
    private static final int method894(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class119 arg10) {
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
        arg10.field1804 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "(II)V")
    public final synchronized void method895(int arg0, int arg1) {
        this.method883(arg0, arg1, this.method873());
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(II[B[IIIIIIILvj;II)I")
    private static final int method896(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class119 arg10, int arg11, int arg12) {
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
        arg10.field1804 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!vj", name = "h", descriptor = "(I)V")
    public final synchronized void method897(int arg0) {
        if (this.field1809 < 0) {
            this.field1809 = -arg0;
        } else {
            this.field1809 = arg0;
        }
    }

    @OriginalMember(owner = "client!vj", name = "j", descriptor = "()V")
    private final void method898() {
        if (this.field1806 != 0) {
            if (this.field1800 == Integer.MIN_VALUE) {
                this.field1800 = 0;
            }
            this.field1806 = 0;
            this.method905();
        }
    }

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "(I)V")
    public final synchronized void method156(int arg0) {
        if (this.field1806 > 0) {
            if (arg0 >= this.field1806) {
                if (this.field1800 == Integer.MIN_VALUE) {
                    this.field1800 = 0;
                    this.field1807 = this.field1802 = this.field1801 = 0;
                    this.method995((byte) 111);
                    arg0 = this.field1806;
                }
                this.field1806 = 0;
                this.method905();
            } else {
                this.field1807 += this.field1798 * arg0;
                this.field1802 += this.field1799 * arg0;
                this.field1801 += this.field1808 * arg0;
                this.field1806 -= arg0;
            }
        }
        class90 var2 = (class90) super.field2726;
        int var3 = this.field1803 << 8;
        int var4 = this.field1795 << 8;
        int var5 = var2.field1413.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1796 = 0;
        }
        if (this.field1804 < 0) {
            if (this.field1809 <= 0) {
                this.method898();
                this.method995((byte) -124);
                return;
            }
            this.field1804 = 0;
        }
        if (this.field1804 >= var5) {
            if (this.field1809 >= 0) {
                this.method898();
                this.method995((byte) 14);
                return;
            }
            this.field1804 = var5 - 1;
        }
        this.field1804 += this.field1809 * arg0;
        if (this.field1796 < 0) {
            if (!this.field1797) {
                if (this.field1809 < 0) {
                    if (this.field1804 < var3) {
                        this.field1804 = var4 - 1 - (var4 - 1 - this.field1804) % var6;
                    }
                } else if (this.field1804 >= var4) {
                    this.field1804 = (this.field1804 - var3) % var6 + var3;
                }
            } else {
                if (this.field1809 < 0) {
                    if (this.field1804 >= var3) {
                        return;
                    }
                    this.field1804 = var3 + var3 - 1 - this.field1804;
                    this.field1809 = -this.field1809;
                }
                while (this.field1804 >= var4) {
                    this.field1804 = var4 + var4 - 1 - this.field1804;
                    this.field1809 = -this.field1809;
                    if (this.field1804 >= var3) {
                        return;
                    }
                    this.field1804 = var3 + var3 - 1 - this.field1804;
                    this.field1809 = -this.field1809;
                }
            }
        } else {
            if (this.field1796 > 0) {
                if (this.field1797) {
                    label125: {
                        if (this.field1809 < 0) {
                            if (this.field1804 >= var3) {
                                return;
                            }
                            this.field1804 = var3 + var3 - 1 - this.field1804;
                            this.field1809 = -this.field1809;
                            if (--this.field1796 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field1804 < var4) {
                                return;
                            }
                            this.field1804 = var4 + var4 - 1 - this.field1804;
                            this.field1809 = -this.field1809;
                            if (--this.field1796 == 0) {
                                break;
                            }
                            if (this.field1804 >= var3) {
                                return;
                            }
                            this.field1804 = var3 + var3 - 1 - this.field1804;
                            this.field1809 = -this.field1809;
                        } while (--this.field1796 != 0);
                    }
                } else if (this.field1809 < 0) {
                    if (this.field1804 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field1804) / var6;
                    if (var7 < this.field1796) {
                        this.field1804 += var6 * var7;
                        this.field1796 -= var7;
                        return;
                    }
                    this.field1804 += this.field1796 * var6;
                    this.field1796 = 0;
                } else {
                    if (this.field1804 < var4) {
                        return;
                    }
                    int var8 = (this.field1804 - var3) / var6;
                    if (var8 < this.field1796) {
                        this.field1804 -= var6 * var8;
                        this.field1796 -= var8;
                        return;
                    }
                    this.field1804 -= this.field1796 * var6;
                    this.field1796 = 0;
                }
            }
            if (this.field1809 < 0) {
                if (this.field1804 < 0) {
                    this.field1804 = -1;
                    this.method898();
                    this.method995((byte) -24);
                    return;
                }
            } else if (this.field1804 >= var5) {
                this.field1804 = var5;
                this.method898();
                this.method995((byte) -2);
            }
        }
    }

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "(II[B[IIIIIIIILvj;II)I")
    private static final int method899(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class119 arg11, int arg12, int arg13) {
        arg11.field1802 -= arg11.field1799 * arg5;
        arg11.field1801 -= arg11.field1808 * arg5;
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
        arg11.field1802 += arg11.field1799 * arg5;
        arg11.field1801 += arg11.field1808 * arg5;
        arg11.field1807 = arg6;
        arg11.field1804 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "(II)I")
    private static final int method900(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(I[B[IIIIIIIIIILvj;)I")
    private static final int method901(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class119 arg12) {
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
        arg12.field1807 += (var19 - arg4) * arg12.field1798;
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
        arg12.field1802 = var15 >> 2;
        arg12.field1801 = var16 >> 2;
        arg12.field1804 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!vj", name = "k", descriptor = "()Z")
    private final boolean method902() {
        int var1 = this.field1800;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method884(var1, this.field1805);
            var2 = method900(var1, this.field1805);
        }
        if (this.field1807 == var1 && this.field1802 == var3 && this.field1801 == var2) {
            if (this.field1800 == Integer.MIN_VALUE) {
                this.field1800 = 0;
                this.field1807 = this.field1802 = this.field1801 = 0;
                this.method995((byte) 92);
                return true;
            } else {
                this.method905();
                return false;
            }
        } else {
            if (this.field1807 < var1) {
                this.field1798 = 1;
                this.field1806 = var1 - this.field1807;
            } else if (this.field1807 > var1) {
                this.field1798 = -1;
                this.field1806 = this.field1807 - var1;
            } else {
                this.field1798 = 0;
            }
            if (this.field1802 < var3) {
                this.field1799 = 1;
                if (this.field1806 == 0 || this.field1806 > var3 - this.field1802) {
                    this.field1806 = var3 - this.field1802;
                }
            } else if (this.field1802 > var3) {
                this.field1799 = -1;
                if (this.field1806 == 0 || this.field1806 > this.field1802 - var3) {
                    this.field1806 = this.field1802 - var3;
                }
            } else {
                this.field1799 = 0;
            }
            if (this.field1801 < var2) {
                this.field1808 = 1;
                if (this.field1806 == 0 || this.field1806 > var2 - this.field1801) {
                    this.field1806 = var2 - this.field1801;
                }
            } else if (this.field1801 > var2) {
                this.field1808 = -1;
                if (this.field1806 == 0 || this.field1806 > this.field1801 - var2) {
                    this.field1806 = this.field1801 - var2;
                }
            } else {
                this.field1808 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "([B[IIIIIIILvj;)I")
    private static final int method903(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class119 arg8) {
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
        arg8.field1804 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Z)V")
    public final synchronized void method904(boolean arg0) {
        this.field1809 = (this.field1809 >>> 31) + (this.field1809 ^ this.field1809 >> 31);
        if (arg0) {
            this.field1809 = -this.field1809;
        }
    }

    @OriginalMember(owner = "client!vj", name = "l", descriptor = "()V")
    private final void method905() {
        this.field1807 = this.field1800;
        this.field1802 = method884(this.field1800, this.field1805);
        this.field1801 = method900(this.field1800, this.field1805);
    }

    @OriginalMember(owner = "client!vj", name = "i", descriptor = "(I)V")
    public final synchronized void method906(int arg0) {
        int var2 = ((class90) super.field2726).field1413.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1804 = arg0;
    }

    @OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(Ljd;II)V")
    private class119(class90 arg0, int arg1, int arg2) {
        super.field2726 = arg0;
        this.field1803 = arg0.field1412;
        this.field1795 = arg0.field1416;
        this.field1797 = arg0.field1415;
        this.field1809 = arg1;
        this.field1800 = arg2;
        this.field1805 = 8192;
        this.field1804 = 0;
        this.method905();
    }

    @OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(Ljd;III)V")
    private class119(class90 arg0, int arg1, int arg2, int arg3) {
        super.field2726 = arg0;
        this.field1803 = arg0.field1412;
        this.field1795 = arg0.field1416;
        this.field1797 = arg0.field1415;
        this.field1809 = arg1;
        this.field1800 = arg2;
        this.field1805 = arg3;
        this.field1804 = 0;
        this.method905();
    }
}
