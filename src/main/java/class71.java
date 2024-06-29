import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class71 extends class124 {

    @OriginalMember(owner = "client!kb", name = "G", descriptor = "I")
    private int field1794;

    @OriginalMember(owner = "client!kb", name = "D", descriptor = "I")
    private int field1791;

    @OriginalMember(owner = "client!kb", name = "C", descriptor = "Z")
    private boolean field1790;

    @OriginalMember(owner = "client!kb", name = "x", descriptor = "I")
    private int field1785;

    @OriginalMember(owner = "client!kb", name = "z", descriptor = "I")
    private int field1787;

    @OriginalMember(owner = "client!kb", name = "I", descriptor = "I")
    private int field1796;

    @OriginalMember(owner = "client!kb", name = "B", descriptor = "I")
    private int field1789;

    @OriginalMember(owner = "client!kb", name = "w", descriptor = "I")
    private int field1784;

    @OriginalMember(owner = "client!kb", name = "y", descriptor = "I")
    private int field1786;

    @OriginalMember(owner = "client!kb", name = "A", descriptor = "I")
    private int field1788;

    @OriginalMember(owner = "client!kb", name = "E", descriptor = "I")
    private int field1792;

    @OriginalMember(owner = "client!kb", name = "F", descriptor = "I")
    private int field1793;

    @OriginalMember(owner = "client!kb", name = "H", descriptor = "I")
    private int field1795;

    @OriginalMember(owner = "client!kb", name = "J", descriptor = "I")
    private int field1797;

    @OriginalMember(owner = "client!kb", name = "K", descriptor = "I")
    private int field1798;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(II[B[IIIIIIIIIILkb;II)I")
    private static final int method556(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class71 arg13, int arg14, int arg15) {
        arg13.field1795 -= arg13.field1797 * arg5;
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
        arg13.field1795 += arg13.field1797 * var22;
        arg13.field1793 = arg6;
        arg13.field1788 = arg7;
        arg13.field1789 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(I[B[IIIIIIIILkb;)I")
    private static final int method557(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class71 arg10) {
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
        arg10.field1789 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "()I")
    public final synchronized int method558() {
        return this.field1787 == Integer.MIN_VALUE ? 0 : this.field1787;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(II)V")
    private final synchronized void method559(int arg0, int arg1) {
        this.field1787 = arg0;
        this.field1796 = arg1;
        this.field1792 = 0;
        this.method562();
    }

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "(I)V")
    public final synchronized void method560(int arg0) {
        int var2 = ((class104) super.field2792).field2519.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1789 = arg0;
    }

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "()Z")
    private final boolean method561() {
        int var1 = this.field1787;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method567(var1, this.field1796);
            var2 = method564(var1, this.field1796);
        }
        if (this.field1795 == var1 && this.field1793 == var3 && this.field1788 == var2) {
            if (this.field1787 == Integer.MIN_VALUE) {
                this.field1787 = 0;
                this.field1795 = this.field1793 = this.field1788 = 0;
                this.method929(114);
                return true;
            } else {
                this.method562();
                return false;
            }
        } else {
            if (this.field1795 < var1) {
                this.field1797 = 1;
                this.field1792 = var1 - this.field1795;
            } else if (this.field1795 > var1) {
                this.field1797 = -1;
                this.field1792 = this.field1795 - var1;
            } else {
                this.field1797 = 0;
            }
            if (this.field1793 < var3) {
                this.field1798 = 1;
                if (this.field1792 == 0 || this.field1792 > var3 - this.field1793) {
                    this.field1792 = var3 - this.field1793;
                }
            } else if (this.field1793 > var3) {
                this.field1798 = -1;
                if (this.field1792 == 0 || this.field1792 > this.field1793 - var3) {
                    this.field1792 = this.field1793 - var3;
                }
            } else {
                this.field1798 = 0;
            }
            if (this.field1788 < var2) {
                this.field1786 = 1;
                if (this.field1792 == 0 || this.field1792 > var2 - this.field1788) {
                    this.field1792 = var2 - this.field1788;
                }
            } else if (this.field1788 > var2) {
                this.field1786 = -1;
                if (this.field1792 == 0 || this.field1792 > this.field1788 - var2) {
                    this.field1792 = this.field1788 - var2;
                }
            } else {
                this.field1786 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "()V")
    private final void method562() {
        this.field1795 = this.field1787;
        this.field1793 = method567(this.field1787, this.field1796);
        this.field1788 = method564(this.field1787, this.field1796);
    }

    @OriginalMember(owner = "client!kb", name = "h", descriptor = "()Z")
    public final boolean method563() {
        return this.field1792 != 0;
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(II)I")
    private static final int method564(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "([B[IIIIIIILkb;)I")
    private static final int method565(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class71 arg8) {
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
        arg8.field1789 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "(II)V")
    public final synchronized void method566(int arg0, int arg1) {
        this.method591(arg0, arg1, this.method571());
    }

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "(II)I")
    private static final int method567(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "(I)V")
    public final synchronized void method568(int arg0) {
        this.method559(arg0 << 6, this.method571());
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(I[B[IIIIIIIILkb;)I")
    private static final int method569(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class71 arg10) {
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
        arg10.field1789 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "([IIIII)I")
    private final int method570(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field1792 <= 0) {
                if (this.field1785 == -256 && (this.field1789 & 255) == 0) {
                    if (class25.field632) {
                        return method557(0, ((class104) super.field2792).field2519, arg0, this.field1789, arg1, this.field1793, this.field1788, 0, arg3, arg2, this);
                    }
                    return method565(((class104) super.field2792).field2519, arg0, this.field1789, arg1, this.field1795, 0, arg3, arg2, this);
                }
                if (class25.field632) {
                    return method586(0, 0, ((class104) super.field2792).field2519, arg0, this.field1789, arg1, this.field1793, this.field1788, 0, arg3, arg2, this, this.field1785, arg4);
                }
                return method595(0, 0, ((class104) super.field2792).field2519, arg0, this.field1789, arg1, this.field1795, 0, arg3, arg2, this, this.field1785, arg4);
            }
            int var6 = this.field1792 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field1792 += arg1;
            if (this.field1785 == -256 && (this.field1789 & 255) == 0) {
                if (class25.field632) {
                    arg1 = method588(0, ((class104) super.field2792).field2519, arg0, this.field1789, arg1, this.field1793, this.field1788, this.field1798, this.field1786, 0, var6, arg2, this);
                } else {
                    arg1 = method589(((class104) super.field2792).field2519, arg0, this.field1789, arg1, this.field1795, this.field1797, 0, var6, arg2, this);
                }
            } else if (class25.field632) {
                arg1 = method584(0, 0, ((class104) super.field2792).field2519, arg0, this.field1789, arg1, this.field1793, this.field1788, this.field1798, this.field1786, 0, var6, arg2, this, this.field1785, arg4);
            } else {
                arg1 = method596(0, 0, ((class104) super.field2792).field2519, arg0, this.field1789, arg1, this.field1795, this.field1797, 0, var6, arg2, this, this.field1785, arg4);
            }
            this.field1792 -= arg1;
            if (this.field1792 != 0) {
                return arg1;
            }
        } while (!this.method561());
        return arg3;
    }

    @OriginalMember(owner = "client!kb", name = "i", descriptor = "()I")
    public final synchronized int method571() {
        return this.field1796 < 0 ? -1 : this.field1796;
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "()Lrf;")
    public final class124 method467() {
        return null;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(I[B[IIIIIIIIIILkb;)I")
    private static final int method572(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class71 arg12) {
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
        arg12.field1795 += (var19 - arg4) * arg12.field1797;
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
        arg12.field1793 = var15 >> 2;
        arg12.field1788 = var16 >> 2;
        arg12.field1789 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(I)V")
    public final synchronized void method474(int arg0) {
        if (this.field1792 > 0) {
            if (arg0 >= this.field1792) {
                if (this.field1787 == Integer.MIN_VALUE) {
                    this.field1787 = 0;
                    this.field1795 = this.field1793 = this.field1788 = 0;
                    this.method929(116);
                    arg0 = this.field1792;
                }
                this.field1792 = 0;
                this.method562();
            } else {
                this.field1795 += this.field1797 * arg0;
                this.field1793 += this.field1798 * arg0;
                this.field1788 += this.field1786 * arg0;
                this.field1792 -= arg0;
            }
        }
        class104 var2 = (class104) super.field2792;
        int var3 = this.field1794 << 8;
        int var4 = this.field1791 << 8;
        int var5 = var2.field2519.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1784 = 0;
        }
        if (this.field1789 < 0) {
            if (this.field1785 <= 0) {
                this.method577();
                this.method929(116);
                return;
            }
            this.field1789 = 0;
        }
        if (this.field1789 >= var5) {
            if (this.field1785 >= 0) {
                this.method577();
                this.method929(100);
                return;
            }
            this.field1789 = var5 - 1;
        }
        this.field1789 += this.field1785 * arg0;
        if (this.field1784 < 0) {
            if (!this.field1790) {
                if (this.field1785 < 0) {
                    if (this.field1789 < var3) {
                        this.field1789 = var4 - 1 - (var4 - 1 - this.field1789) % var6;
                    }
                } else if (this.field1789 >= var4) {
                    this.field1789 = (this.field1789 - var3) % var6 + var3;
                }
            } else {
                if (this.field1785 < 0) {
                    if (this.field1789 >= var3) {
                        return;
                    }
                    this.field1789 = var3 + var3 - 1 - this.field1789;
                    this.field1785 = -this.field1785;
                }
                while (this.field1789 >= var4) {
                    this.field1789 = var4 + var4 - 1 - this.field1789;
                    this.field1785 = -this.field1785;
                    if (this.field1789 >= var3) {
                        return;
                    }
                    this.field1789 = var3 + var3 - 1 - this.field1789;
                    this.field1785 = -this.field1785;
                }
            }
        } else {
            if (this.field1784 > 0) {
                if (this.field1790) {
                    label125: {
                        if (this.field1785 < 0) {
                            if (this.field1789 >= var3) {
                                return;
                            }
                            this.field1789 = var3 + var3 - 1 - this.field1789;
                            this.field1785 = -this.field1785;
                            if (--this.field1784 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field1789 < var4) {
                                return;
                            }
                            this.field1789 = var4 + var4 - 1 - this.field1789;
                            this.field1785 = -this.field1785;
                            if (--this.field1784 == 0) {
                                break;
                            }
                            if (this.field1789 >= var3) {
                                return;
                            }
                            this.field1789 = var3 + var3 - 1 - this.field1789;
                            this.field1785 = -this.field1785;
                        } while (--this.field1784 != 0);
                    }
                } else if (this.field1785 < 0) {
                    if (this.field1789 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field1789) / var6;
                    if (var7 < this.field1784) {
                        this.field1789 += var6 * var7;
                        this.field1784 -= var7;
                        return;
                    }
                    this.field1789 += this.field1784 * var6;
                    this.field1784 = 0;
                } else {
                    if (this.field1789 < var4) {
                        return;
                    }
                    int var8 = (this.field1789 - var3) / var6;
                    if (var8 < this.field1784) {
                        this.field1789 -= var6 * var8;
                        this.field1784 -= var8;
                        return;
                    }
                    this.field1789 -= this.field1784 * var6;
                    this.field1784 = 0;
                }
            }
            if (this.field1785 < 0) {
                if (this.field1789 < 0) {
                    this.field1789 = -1;
                    this.method577();
                    this.method929(99);
                    return;
                }
            } else if (this.field1789 >= var5) {
                this.field1789 = var5;
                this.method577();
                this.method929(109);
            }
        }
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "([IIIII)I")
    private final int method573(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field1792 <= 0) {
                if (this.field1785 == 256 && (this.field1789 & 255) == 0) {
                    if (class25.field632) {
                        return method569(0, ((class104) super.field2792).field2519, arg0, this.field1789, arg1, this.field1793, this.field1788, 0, arg3, arg2, this);
                    }
                    return method583(((class104) super.field2792).field2519, arg0, this.field1789, arg1, this.field1795, 0, arg3, arg2, this);
                }
                if (class25.field632) {
                    return method594(0, 0, ((class104) super.field2792).field2519, arg0, this.field1789, arg1, this.field1793, this.field1788, 0, arg3, arg2, this, this.field1785, arg4);
                }
                return method581(0, 0, ((class104) super.field2792).field2519, arg0, this.field1789, arg1, this.field1795, 0, arg3, arg2, this, this.field1785, arg4);
            }
            int var6 = this.field1792 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field1792 += arg1;
            if (this.field1785 == 256 && (this.field1789 & 255) == 0) {
                if (class25.field632) {
                    arg1 = method572(0, ((class104) super.field2792).field2519, arg0, this.field1789, arg1, this.field1793, this.field1788, this.field1798, this.field1786, 0, var6, arg2, this);
                } else {
                    arg1 = method578(((class104) super.field2792).field2519, arg0, this.field1789, arg1, this.field1795, this.field1797, 0, var6, arg2, this);
                }
            } else if (class25.field632) {
                arg1 = method556(0, 0, ((class104) super.field2792).field2519, arg0, this.field1789, arg1, this.field1793, this.field1788, this.field1798, this.field1786, 0, var6, arg2, this, this.field1785, arg4);
            } else {
                arg1 = method587(0, 0, ((class104) super.field2792).field2519, arg0, this.field1789, arg1, this.field1795, this.field1797, 0, var6, arg2, this, this.field1785, arg4);
            }
            this.field1792 -= arg1;
            if (this.field1792 != 0) {
                return arg1;
            }
        } while (!this.method561());
        return arg3;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Z)V")
    public final synchronized void method574(boolean arg0) {
        this.field1785 = (this.field1785 >>> 31) + (this.field1785 ^ this.field1785 >> 31);
        if (arg0) {
            this.field1785 = -this.field1785;
        }
    }

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "(I)V")
    public final synchronized void method575(int arg0) {
        this.field1784 = arg0;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "()I")
    public final int method576() {
        int var1 = this.field1795 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1784 == 0) {
            var2 -= this.field1789 * var2 / (((class104) super.field2792).field2519.length << 8);
        } else if (this.field1784 >= 0) {
            var2 -= this.field1794 * var2 / ((class104) super.field2792).field2519.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "()Lrf;")
    public final class124 method470() {
        return null;
    }

    @OriginalMember(owner = "client!kb", name = "j", descriptor = "()V")
    private final void method577() {
        if (this.field1792 != 0) {
            if (this.field1787 == Integer.MIN_VALUE) {
                this.field1787 = 0;
            }
            this.field1792 = 0;
            this.method562();
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "([B[IIIIIIIILkb;)I")
    private static final int method578(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class71 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1793 += (var14 - arg3) * arg9.field1798;
        arg9.field1788 += (var14 - arg3) * arg9.field1786;
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
        arg9.field1795 = var12 >> 2;
        arg9.field1789 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "(I)V")
    private final synchronized void method579(int arg0) {
        this.method559(arg0, this.method571());
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lp;III)Lkb;")
    public static final class71 method580(class104 arg0, int arg1, int arg2, int arg3) {
        return arg0.field2519 != null && arg0.field2519.length != 0 ? new class71(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(II[B[IIIIIIILkb;II)I")
    private static final int method581(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class71 arg10, int arg11, int arg12) {
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
        arg10.field1789 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lp;II)Lkb;")
    public static final class71 method582(class104 arg0, int arg1, int arg2) {
        return arg0.field2519 != null && arg0.field2519.length != 0 ? new class71(arg0, (int) ((long) arg0.field2518 * 256L * (long) arg1 / (long) (class25.field626 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "([B[IIIIIIILkb;)I")
    private static final int method583(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class71 arg8) {
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
        arg8.field1789 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(II[B[IIIIIIIIIILkb;II)I")
    private static final int method584(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class71 arg13, int arg14, int arg15) {
        arg13.field1795 -= arg13.field1797 * arg5;
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
        arg13.field1795 += arg13.field1797 * var22;
        arg13.field1793 = arg6;
        arg13.field1788 = arg7;
        arg13.field1789 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "(I)V")
    public final synchronized void method585(int arg0) {
        if (this.field1785 < 0) {
            this.field1785 = -arg0;
        } else {
            this.field1785 = arg0;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(II[B[IIIIIIIILkb;II)I")
    private static final int method586(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class71 arg11, int arg12, int arg13) {
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
        arg11.field1789 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(II[B[IIIIIIIILkb;II)I")
    private static final int method587(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class71 arg11, int arg12, int arg13) {
        arg11.field1793 -= arg11.field1798 * arg5;
        arg11.field1788 -= arg11.field1786 * arg5;
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
        arg11.field1793 += arg11.field1798 * arg5;
        arg11.field1788 += arg11.field1786 * arg5;
        arg11.field1795 = arg6;
        arg11.field1789 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(I[B[IIIIIIIIIILkb;)I")
    private static final int method588(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class71 arg12) {
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
        arg12.field1795 += (var19 - arg4) * arg12.field1797;
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
        arg12.field1793 = var15 >> 2;
        arg12.field1788 = var16 >> 2;
        arg12.field1789 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "([B[IIIIIIIILkb;)I")
    private static final int method589(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class71 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1793 += (var14 - arg3) * arg9.field1798;
        arg9.field1788 += (var14 - arg3) * arg9.field1786;
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
        arg9.field1795 = var12 >> 2;
        arg9.field1789 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!kb", name = "h", descriptor = "(I)V")
    public final synchronized void method590(int arg0) {
        if (arg0 == 0) {
            this.method579(0);
            this.method929(103);
        } else if (this.field1793 == 0 && this.field1788 == 0) {
            this.field1792 = 0;
            this.field1787 = 0;
            this.field1795 = 0;
            this.method929(112);
        } else {
            int var2 = -this.field1795;
            if (this.field1795 > var2) {
                var2 = this.field1795;
            }
            if (-this.field1793 > var2) {
                var2 = -this.field1793;
            }
            if (this.field1793 > var2) {
                var2 = this.field1793;
            }
            if (-this.field1788 > var2) {
                var2 = -this.field1788;
            }
            if (this.field1788 > var2) {
                var2 = this.field1788;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1792 = arg0;
            this.field1787 = Integer.MIN_VALUE;
            this.field1797 = -this.field1795 / arg0;
            this.field1798 = -this.field1793 / arg0;
            this.field1786 = -this.field1788 / arg0;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(III)V")
    public final synchronized void method591(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method559(arg1, arg2);
        } else {
            int var4 = method567(arg1, arg2);
            int var5 = method564(arg1, arg2);
            if (this.field1793 == var4 && this.field1788 == var5) {
                this.field1792 = 0;
            } else {
                int var6 = arg1 - this.field1795;
                if (this.field1795 - arg1 > var6) {
                    var6 = this.field1795 - arg1;
                }
                if (var4 - this.field1793 > var6) {
                    var6 = var4 - this.field1793;
                }
                if (this.field1793 - var4 > var6) {
                    var6 = this.field1793 - var4;
                }
                if (var5 - this.field1788 > var6) {
                    var6 = var5 - this.field1788;
                }
                if (this.field1788 - var5 > var6) {
                    var6 = this.field1788 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field1792 = arg0;
                this.field1787 = arg1;
                this.field1796 = arg2;
                this.field1797 = (arg1 - this.field1795) / arg0;
                this.field1798 = (var4 - this.field1793) / arg0;
                this.field1786 = (var5 - this.field1788) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!kb", name = "k", descriptor = "()I")
    public final synchronized int method592() {
        return this.field1785 < 0 ? -this.field1785 : this.field1785;
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "([III)V")
    public final synchronized void method495(int[] arg0, int arg1, int arg2) {
        if (this.field1787 == 0 && this.field1792 == 0) {
            this.method474(arg2);
        } else {
            class104 var4 = (class104) super.field2792;
            int var5 = this.field1794 << 8;
            int var6 = this.field1791 << 8;
            int var7 = var4.field2519.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field1784 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field1789 < 0) {
                if (this.field1785 <= 0) {
                    this.method577();
                    this.method929(98);
                    return;
                }
                this.field1789 = 0;
            }
            if (this.field1789 >= var7) {
                if (this.field1785 >= 0) {
                    this.method577();
                    this.method929(126);
                    return;
                }
                this.field1789 = var7 - 1;
            }
            if (this.field1784 < 0) {
                if (this.field1790) {
                    if (this.field1785 < 0) {
                        var9 = this.method570(arg0, arg1, var5, var10, var4.field2519[this.field1794]);
                        if (this.field1789 >= var5) {
                            return;
                        }
                        this.field1789 = var5 + var5 - 1 - this.field1789;
                        this.field1785 = -this.field1785;
                    }
                    while (true) {
                        int var11 = this.method573(arg0, var9, var6, var10, var4.field2519[this.field1791 - 1]);
                        if (this.field1789 < var6) {
                            return;
                        }
                        this.field1789 = var6 + var6 - 1 - this.field1789;
                        this.field1785 = -this.field1785;
                        var9 = this.method570(arg0, var11, var5, var10, var4.field2519[this.field1794]);
                        if (this.field1789 >= var5) {
                            return;
                        }
                        this.field1789 = var5 + var5 - 1 - this.field1789;
                        this.field1785 = -this.field1785;
                    }
                } else if (this.field1785 < 0) {
                    while (true) {
                        var9 = this.method570(arg0, var9, var5, var10, var4.field2519[this.field1791 - 1]);
                        if (this.field1789 >= var5) {
                            return;
                        }
                        this.field1789 = var6 - 1 - (var6 - 1 - this.field1789) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method573(arg0, var9, var6, var10, var4.field2519[this.field1794]);
                        if (this.field1789 < var6) {
                            return;
                        }
                        this.field1789 = (this.field1789 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field1784 > 0) {
                    if (this.field1790) {
                        label130: {
                            if (this.field1785 < 0) {
                                var9 = this.method570(arg0, arg1, var5, var10, var4.field2519[this.field1794]);
                                if (this.field1789 >= var5) {
                                    return;
                                }
                                this.field1789 = var5 + var5 - 1 - this.field1789;
                                this.field1785 = -this.field1785;
                                if (--this.field1784 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method573(arg0, var9, var6, var10, var4.field2519[this.field1791 - 1]);
                                if (this.field1789 < var6) {
                                    return;
                                }
                                this.field1789 = var6 + var6 - 1 - this.field1789;
                                this.field1785 = -this.field1785;
                                if (--this.field1784 == 0) {
                                    break;
                                }
                                var9 = this.method570(arg0, var9, var5, var10, var4.field2519[this.field1794]);
                                if (this.field1789 >= var5) {
                                    return;
                                }
                                this.field1789 = var5 + var5 - 1 - this.field1789;
                                this.field1785 = -this.field1785;
                            } while (--this.field1784 != 0);
                        }
                    } else if (this.field1785 < 0) {
                        while (true) {
                            var9 = this.method570(arg0, var9, var5, var10, var4.field2519[this.field1791 - 1]);
                            if (this.field1789 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field1789) / var8;
                            if (var12 >= this.field1784) {
                                this.field1789 += this.field1784 * var8;
                                this.field1784 = 0;
                                break;
                            }
                            this.field1789 += var8 * var12;
                            this.field1784 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method573(arg0, var9, var6, var10, var4.field2519[this.field1794]);
                            if (this.field1789 < var6) {
                                return;
                            }
                            int var13 = (this.field1789 - var5) / var8;
                            if (var13 >= this.field1784) {
                                this.field1789 -= this.field1784 * var8;
                                this.field1784 = 0;
                                break;
                            }
                            this.field1789 -= var8 * var13;
                            this.field1784 -= var13;
                        }
                    }
                }
                if (this.field1785 < 0) {
                    this.method570(arg0, var9, 0, var10, 0);
                    if (this.field1789 < 0) {
                        this.field1789 = -1;
                        this.method577();
                        this.method929(111);
                        return;
                    }
                } else {
                    this.method573(arg0, var9, var7, var10, 0);
                    if (this.field1789 >= var7) {
                        this.field1789 = var7;
                        this.method577();
                        this.method929(118);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kb", name = "l", descriptor = "()Z")
    public final boolean method593() {
        return this.field1789 < 0 || this.field1789 >= ((class104) super.field2792).field2519.length << 8;
    }

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "(II[B[IIIIIIIILkb;II)I")
    private static final int method594(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class71 arg11, int arg12, int arg13) {
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
        arg11.field1789 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(II[B[IIIIIIILkb;II)I")
    private static final int method595(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class71 arg10, int arg11, int arg12) {
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
        arg10.field1789 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(Lp;II)V")
    private class71(class104 arg0, int arg1, int arg2) {
        super.field2792 = arg0;
        this.field1794 = arg0.field2516;
        this.field1791 = arg0.field2520;
        this.field1790 = arg0.field2517;
        this.field1785 = arg1;
        this.field1787 = arg2;
        this.field1796 = 8192;
        this.field1789 = 0;
        this.method562();
    }

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(Lp;III)V")
    private class71(class104 arg0, int arg1, int arg2, int arg3) {
        super.field2792 = arg0;
        this.field1794 = arg0.field2516;
        this.field1791 = arg0.field2520;
        this.field1790 = arg0.field2517;
        this.field1785 = arg1;
        this.field1787 = arg2;
        this.field1796 = arg3;
        this.field1789 = 0;
        this.method562();
    }

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "()I")
    public final int method483() {
        return this.field1787 == 0 && this.field1792 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "(II[B[IIIIIIIILkb;II)I")
    private static final int method596(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class71 arg11, int arg12, int arg13) {
        arg11.field1793 -= arg11.field1798 * arg5;
        arg11.field1788 -= arg11.field1786 * arg5;
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
        arg11.field1793 += arg11.field1798 * arg5;
        arg11.field1788 += arg11.field1786 * arg5;
        arg11.field1795 = arg6;
        arg11.field1789 = arg4;
        return arg5;
    }
}
