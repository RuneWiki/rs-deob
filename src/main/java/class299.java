import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class299 extends class252 {

    @OriginalMember(owner = "client!bh", name = "z", descriptor = "I")
    private int field4769;

    @OriginalMember(owner = "client!bh", name = "y", descriptor = "I")
    private int field4768;

    @OriginalMember(owner = "client!bh", name = "q", descriptor = "Z")
    private boolean field4760;

    @OriginalMember(owner = "client!bh", name = "s", descriptor = "I")
    private int field4762;

    @OriginalMember(owner = "client!bh", name = "r", descriptor = "I")
    private int field4761;

    @OriginalMember(owner = "client!bh", name = "A", descriptor = "I")
    private int field4770;

    @OriginalMember(owner = "client!bh", name = "D", descriptor = "I")
    private int field4773;

    @OriginalMember(owner = "client!bh", name = "p", descriptor = "I")
    private int field4759;

    @OriginalMember(owner = "client!bh", name = "t", descriptor = "I")
    private int field4763;

    @OriginalMember(owner = "client!bh", name = "u", descriptor = "I")
    private int field4764;

    @OriginalMember(owner = "client!bh", name = "v", descriptor = "I")
    private int field4765;

    @OriginalMember(owner = "client!bh", name = "w", descriptor = "I")
    private int field4766;

    @OriginalMember(owner = "client!bh", name = "x", descriptor = "I")
    private int field4767;

    @OriginalMember(owner = "client!bh", name = "B", descriptor = "I")
    private int field4771;

    @OriginalMember(owner = "client!bh", name = "C", descriptor = "I")
    private int field4772;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "([B[IIIIIIILbh;)I", line = 3)
    private static final int method2032(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class299 arg8) {
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
        arg8.field4773 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(II[B[IIIIIIIILbh;II)I", line = 28)
    private static final int method2033(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class299 arg11, int arg12, int arg13) {
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
        arg11.field4773 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lri;II)Lbh;", line = 61)
    public static final class299 method2034(class76 arg0, int arg1, int arg2) {
        return arg0.field1237 == null || arg0.field1237.length == 0 ? null : new class299(arg0, (int) ((long) arg0.field1239 * 256L * (long) arg1 / (long) (class266.field4291 * 100)), arg2 << 6);
    }

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "()Z", line = 68)
    private final boolean method2035() {
        int var1 = this.field4761;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method2058(var1, this.field4770);
            var2 = method2051(var1, this.field4770);
        }
        if (this.field4765 != var1 || this.field4764 != var3 || this.field4772 != var2) {
            if (this.field4765 < var1) {
                this.field4767 = 1;
                this.field4763 = var1 - this.field4765;
            } else if (this.field4765 > var1) {
                this.field4767 = -1;
                this.field4763 = this.field4765 - var1;
            } else {
                this.field4767 = 0;
            }
            if (this.field4764 < var3) {
                this.field4759 = 1;
                if (this.field4763 == 0 || this.field4763 > var3 - this.field4764) {
                    this.field4763 = var3 - this.field4764;
                }
            } else if (this.field4764 > var3) {
                this.field4759 = -1;
                if (this.field4763 == 0 || this.field4763 > this.field4764 - var3) {
                    this.field4763 = this.field4764 - var3;
                }
            } else {
                this.field4759 = 0;
            }
            if (this.field4772 < var2) {
                this.field4771 = 1;
                if (this.field4763 == 0 || this.field4763 > var2 - this.field4772) {
                    this.field4763 = var2 - this.field4772;
                }
            } else if (this.field4772 > var2) {
                this.field4771 = -1;
                if (this.field4763 == 0 || this.field4763 > this.field4772 - var2) {
                    this.field4763 = this.field4772 - var2;
                }
            } else {
                this.field4771 = 0;
            }
            return false;
        } else if (this.field4761 == Integer.MIN_VALUE) {
            this.field4761 = 0;
            this.field4765 = this.field4764 = this.field4772 = 0;
            this.method2195(-1);
            return true;
        } else {
            this.method2065();
            return false;
        }
    }

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "(I)V", line = 155)
    public final synchronized void method2036(int arg0) {
        int var2 = ((class76) this.field4061).field1237.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field4773 = arg0;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(II[B[IIIIIIILbh;II)I", line = 165)
    private static final int method2037(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class299 arg10, int arg11, int arg12) {
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
        arg10.field4773 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "([B[IIIIIIILbh;)I", line = 193)
    private static final int method2038(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class299 arg8) {
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
        arg8.field4773 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "()I", line = 219)
    public final int method50() {
        return this.field4761 == 0 && this.field4763 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "(I)V", line = 226)
    public final synchronized void method2039(int arg0) {
        this.method2064(arg0 << 6, this.method2046());
    }

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "(I)V", line = 229)
    public final synchronized void method2040(int arg0) {
        this.field4766 = arg0;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "([B[IIIIIIIILbh;)I", line = 233)
    private static final int method2041(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class299 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field4764 += (var14 - arg3) * arg9.field4759;
        arg9.field4772 += (var14 - arg3) * arg9.field4771;
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
        arg9.field4765 = var12 >> 2;
        arg9.field4773 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "([IIIII)I", line = 267)
    private final int method2042(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field4763 > 0) {
                int var6 = this.field4763 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field4763 += arg1;
                if (this.field4762 == 256 && (this.field4773 & 0xFF) == 0) {
                    if (class26.field360) {
                        arg1 = method2071(0, ((class76) this.field4061).field1237, arg0, this.field4773, arg1, this.field4764, this.field4772, this.field4759, this.field4771, 0, var6, arg2, this);
                    } else {
                        arg1 = method2059(((class76) this.field4061).field1237, arg0, this.field4773, arg1, this.field4765, this.field4767, 0, var6, arg2, this);
                    }
                } else if (class26.field360) {
                    arg1 = method2057(0, 0, ((class76) this.field4061).field1237, arg0, this.field4773, arg1, this.field4764, this.field4772, this.field4759, this.field4771, 0, var6, arg2, this, this.field4762, arg4);
                } else {
                    arg1 = method2053(0, 0, ((class76) this.field4061).field1237, arg0, this.field4773, arg1, this.field4765, this.field4767, 0, var6, arg2, this, this.field4762, arg4);
                }
                this.field4763 -= arg1;
                if (this.field4763 != 0) {
                    return arg1;
                }
                if (!this.method2035()) {
                    continue;
                }
                return arg3;
            }
            if (this.field4762 == 256 && (this.field4773 & 0xFF) == 0) {
                if (class26.field360) {
                    return method2067(0, ((class76) this.field4061).field1237, arg0, this.field4773, arg1, this.field4764, this.field4772, 0, arg3, arg2, this);
                }
                return method2038(((class76) this.field4061).field1237, arg0, this.field4773, arg1, this.field4765, 0, arg3, arg2, this);
            }
            if (class26.field360) {
                return method2063(0, 0, ((class76) this.field4061).field1237, arg0, this.field4773, arg1, this.field4764, this.field4772, 0, arg3, arg2, this, this.field4762, arg4);
            }
            return method2037(0, 0, ((class76) this.field4061).field1237, arg0, this.field4773, arg1, this.field4765, 0, arg3, arg2, this, this.field4762, arg4);
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(I[B[IIIIIIIIIILbh;)I", line = 324)
    private static final int method2043(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class299 arg12) {
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
        arg12.field4765 += (var19 - arg4) * arg12.field4767;
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
        arg12.field4764 = var15 >> 2;
        arg12.field4772 = var16 >> 2;
        arg12.field4773 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(Z)V", line = 377)
    public final synchronized void method2044(boolean arg0) {
        this.field4762 = (this.field4762 >>> 31) + (this.field4762 ^ this.field4762 >> 31);
        if (arg0) {
            this.field4762 = -this.field4762;
        }
    }

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "()Z", line = 384)
    public final boolean method2045() {
        return this.field4773 < 0 || this.field4773 >= ((class76) this.field4061).field1237.length << 8;
    }

    @OriginalMember(owner = "client!bh", name = "g", descriptor = "()I", line = 389)
    public final synchronized int method2046() {
        return this.field4770 < 0 ? -1 : this.field4770;
    }

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "(I)V", line = 393)
    public final synchronized void method53(int arg0) {
        if (this.field4763 > 0) {
            if (arg0 >= this.field4763) {
                if (this.field4761 == Integer.MIN_VALUE) {
                    this.field4761 = 0;
                    this.field4765 = this.field4764 = this.field4772 = 0;
                    this.method2195(-1);
                    arg0 = this.field4763;
                }
                this.field4763 = 0;
                this.method2065();
            } else {
                this.field4765 += this.field4767 * arg0;
                this.field4764 += this.field4759 * arg0;
                this.field4772 += this.field4771 * arg0;
                this.field4763 -= arg0;
            }
        }
        class76 var2 = (class76) this.field4061;
        int var3 = this.field4769 << 8;
        int var4 = this.field4768 << 8;
        int var5 = var2.field1237.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field4766 = 0;
        }
        if (this.field4773 < 0) {
            if (this.field4762 <= 0) {
                this.method2066();
                this.method2195(-1);
                return;
            }
            this.field4773 = 0;
        }
        if (this.field4773 >= var5) {
            if (this.field4762 >= 0) {
                this.method2066();
                this.method2195(-1);
                return;
            }
            this.field4773 = var5 - 1;
        }
        this.field4773 += this.field4762 * arg0;
        if (this.field4766 >= 0) {
            if (this.field4766 > 0) {
                if (this.field4760) {
                    label121: {
                        if (this.field4762 < 0) {
                            if (this.field4773 >= var3) {
                                return;
                            }
                            this.field4773 = var3 + var3 - this.field4773 - 1;
                            this.field4762 = -this.field4762;
                            if (--this.field4766 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field4773 < var4) {
                                return;
                            }
                            this.field4773 = var4 + var4 - this.field4773 - 1;
                            this.field4762 = -this.field4762;
                            if (--this.field4766 == 0) {
                                break;
                            }
                            if (this.field4773 >= var3) {
                                return;
                            }
                            this.field4773 = var3 + var3 - this.field4773 - 1;
                            this.field4762 = -this.field4762;
                        } while (--this.field4766 != 0);
                    }
                } else {
                    label153: {
                        if (this.field4762 < 0) {
                            if (this.field4773 >= var3) {
                                return;
                            }
                            int var7 = (var4 - this.field4773 - 1) / var6;
                            if (var7 >= this.field4766) {
                                this.field4773 += this.field4766 * var6;
                                this.field4766 = 0;
                                break label153;
                            }
                            this.field4773 += var6 * var7;
                            this.field4766 -= var7;
                        } else if (this.field4773 >= var4) {
                            int var8 = (this.field4773 - var3) / var6;
                            if (var8 >= this.field4766) {
                                this.field4773 -= this.field4766 * var6;
                                this.field4766 = 0;
                                break label153;
                            }
                            this.field4773 -= var6 * var8;
                            this.field4766 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field4762 < 0) {
                if (this.field4773 < 0) {
                    this.field4773 = -1;
                    this.method2066();
                    this.method2195(-1);
                }
            } else if (this.field4773 >= var5) {
                this.field4773 = var5;
                this.method2066();
                this.method2195(-1);
            }
        } else if (this.field4760) {
            if (this.field4762 < 0) {
                if (this.field4773 >= var3) {
                    return;
                }
                this.field4773 = var3 + var3 - this.field4773 - 1;
                this.field4762 = -this.field4762;
            }
            while (this.field4773 >= var4) {
                this.field4773 = var4 + var4 - this.field4773 - 1;
                this.field4762 = -this.field4762;
                if (this.field4773 >= var3) {
                    return;
                }
                this.field4773 = var3 + var3 - this.field4773 - 1;
                this.field4762 = -this.field4762;
            }
        } else if (this.field4762 < 0) {
            if (this.field4773 >= var3) {
                return;
            }
            this.field4773 = var4 - (var4 - 1 - this.field4773) % var6 - 1;
        } else if (this.field4773 >= var4) {
            this.field4773 = (this.field4773 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(II)V", line = 611)
    public final synchronized void method2047(int arg0, int arg1) {
        this.method2052(arg0, arg1, this.method2046());
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "([IIIII)I", line = 614)
    private final int method2048(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field4763 > 0) {
                int var6 = this.field4763 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field4763 += arg1;
                if (this.field4762 == -256 && (this.field4773 & 0xFF) == 0) {
                    if (class26.field360) {
                        arg1 = method2043(0, ((class76) this.field4061).field1237, arg0, this.field4773, arg1, this.field4764, this.field4772, this.field4759, this.field4771, 0, var6, arg2, this);
                    } else {
                        arg1 = method2041(((class76) this.field4061).field1237, arg0, this.field4773, arg1, this.field4765, this.field4767, 0, var6, arg2, this);
                    }
                } else if (class26.field360) {
                    arg1 = method2070(0, 0, ((class76) this.field4061).field1237, arg0, this.field4773, arg1, this.field4764, this.field4772, this.field4759, this.field4771, 0, var6, arg2, this, this.field4762, arg4);
                } else {
                    arg1 = method2055(0, 0, ((class76) this.field4061).field1237, arg0, this.field4773, arg1, this.field4765, this.field4767, 0, var6, arg2, this, this.field4762, arg4);
                }
                this.field4763 -= arg1;
                if (this.field4763 != 0) {
                    return arg1;
                }
                if (!this.method2035()) {
                    continue;
                }
                return arg3;
            }
            if (this.field4762 == -256 && (this.field4773 & 0xFF) == 0) {
                if (class26.field360) {
                    return method2069(0, ((class76) this.field4061).field1237, arg0, this.field4773, arg1, this.field4764, this.field4772, 0, arg3, arg2, this);
                }
                return method2032(((class76) this.field4061).field1237, arg0, this.field4773, arg1, this.field4765, 0, arg3, arg2, this);
            }
            if (class26.field360) {
                return method2033(0, 0, ((class76) this.field4061).field1237, arg0, this.field4773, arg1, this.field4764, this.field4772, 0, arg3, arg2, this, this.field4762, arg4);
            }
            return method2054(0, 0, ((class76) this.field4061).field1237, arg0, this.field4773, arg1, this.field4765, 0, arg3, arg2, this, this.field4762, arg4);
        }
    }

    @OriginalMember(owner = "client!bh", name = "g", descriptor = "(I)V", line = 669)
    private final synchronized void method2049(int arg0) {
        this.method2064(arg0, this.method2046());
    }

    @OriginalMember(owner = "client!bh", name = "h", descriptor = "()Z", line = 674)
    public final boolean method2050() {
        return this.field4763 != 0;
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(II)I", line = 677)
    private static final int method2051(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(III)V", line = 680)
    public final synchronized void method2052(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method2064(arg1, arg2);
            return;
        }
        int var4 = method2058(arg1, arg2);
        int var5 = method2051(arg1, arg2);
        if (this.field4764 == var4 && this.field4772 == var5) {
            this.field4763 = 0;
            return;
        }
        int var6 = arg1 - this.field4765;
        if (this.field4765 - arg1 > var6) {
            var6 = this.field4765 - arg1;
        }
        if (var4 - this.field4764 > var6) {
            var6 = var4 - this.field4764;
        }
        if (this.field4764 - var4 > var6) {
            var6 = this.field4764 - var4;
        }
        if (var5 - this.field4772 > var6) {
            var6 = var5 - this.field4772;
        }
        if (this.field4772 - var5 > var6) {
            var6 = this.field4772 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field4763 = arg0;
        this.field4761 = arg1;
        this.field4770 = arg2;
        this.field4767 = (arg1 - this.field4765) / arg0;
        this.field4759 = (var4 - this.field4764) / arg0;
        this.field4771 = (var5 - this.field4772) / arg0;
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(II[B[IIIIIIIILbh;II)I", line = 726)
    private static final int method2053(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class299 arg11, int arg12, int arg13) {
        arg11.field4764 -= arg11.field4759 * arg5;
        arg11.field4772 -= arg11.field4771 * arg5;
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
        arg11.field4764 += arg11.field4759 * arg5;
        arg11.field4772 += arg11.field4771 * arg5;
        arg11.field4765 = arg6;
        arg11.field4773 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "()Lmj;", line = 759)
    public final class252 method52() {
        return null;
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(II[B[IIIIIIILbh;II)I", line = 762)
    private static final int method2054(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class299 arg10, int arg11, int arg12) {
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
        arg10.field4773 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "(II[B[IIIIIIIILbh;II)I", line = 789)
    private static final int method2055(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class299 arg11, int arg12, int arg13) {
        arg11.field4764 -= arg11.field4759 * arg5;
        arg11.field4772 -= arg11.field4771 * arg5;
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
        arg11.field4764 += arg11.field4759 * arg5;
        arg11.field4772 += arg11.field4771 * arg5;
        arg11.field4765 = arg6;
        arg11.field4773 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!bh", name = "i", descriptor = "()I", line = 822)
    public final synchronized int method2056() {
        return this.field4761 == Integer.MIN_VALUE ? 0 : this.field4761;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(II[B[IIIIIIIIIILbh;II)I", line = 825)
    private static final int method2057(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class299 arg13, int arg14, int arg15) {
        arg13.field4765 -= arg13.field4767 * arg5;
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
        arg13.field4765 += arg13.field4767 * var27;
        arg13.field4764 = arg6;
        arg13.field4772 = arg7;
        arg13.field4773 = arg4;
        return var27;
    }

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "(II)I", line = 871)
    private static final int method2058(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "()Lmj;", line = 876)
    public final class252 method54() {
        return null;
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "([B[IIIIIIIILbh;)I", line = 879)
    private static final int method2059(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class299 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field4764 += (var14 - arg3) * arg9.field4759;
        arg9.field4772 += (var14 - arg3) * arg9.field4771;
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
        arg9.field4765 = var12 >> 2;
        arg9.field4773 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!bh", name = "h", descriptor = "(I)V", line = 913)
    public final synchronized void method2060(int arg0) {
        if (this.field4762 < 0) {
            this.field4762 = -arg0;
        } else {
            this.field4762 = arg0;
        }
    }

    @OriginalMember(owner = "client!bh", name = "j", descriptor = "()I", line = 920)
    public final synchronized int method2061() {
        return this.field4762 < 0 ? -this.field4762 : this.field4762;
    }

    @OriginalMember(owner = "client!bh", name = "i", descriptor = "(I)V", line = 923)
    public final synchronized void method2062(int arg0) {
        if (arg0 == 0) {
            this.method2049(0);
            this.method2195(-1);
        } else if (this.field4764 == 0 && this.field4772 == 0) {
            this.field4763 = 0;
            this.field4761 = 0;
            this.field4765 = 0;
            this.method2195(-1);
        } else {
            int var2 = -this.field4765;
            if (this.field4765 > var2) {
                var2 = this.field4765;
            }
            if (-this.field4764 > var2) {
                var2 = -this.field4764;
            }
            if (this.field4764 > var2) {
                var2 = this.field4764;
            }
            if (-this.field4772 > var2) {
                var2 = -this.field4772;
            }
            if (this.field4772 > var2) {
                var2 = this.field4772;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field4763 = arg0;
            this.field4761 = Integer.MIN_VALUE;
            this.field4767 = -this.field4765 / arg0;
            this.field4759 = -this.field4764 / arg0;
            this.field4771 = -this.field4772 / arg0;
        }
    }

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "(II[B[IIIIIIIILbh;II)I", line = 968)
    private static final int method2063(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class299 arg11, int arg12, int arg13) {
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
        arg11.field4773 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "(II)V", line = 1004)
    private final synchronized void method2064(int arg0, int arg1) {
        this.field4761 = arg0;
        this.field4770 = arg1;
        this.field4763 = 0;
        this.method2065();
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "([III)V", line = 1011)
    public final synchronized void method49(int[] arg0, int arg1, int arg2) {
        if (this.field4761 == 0 && this.field4763 == 0) {
            this.method53(arg2);
            return;
        }
        class76 var4 = (class76) this.field4061;
        int var5 = this.field4769 << 8;
        int var6 = this.field4768 << 8;
        int var7 = var4.field1237.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field4766 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field4773 < 0) {
            if (this.field4762 <= 0) {
                this.method2066();
                this.method2195(-1);
                return;
            }
            this.field4773 = 0;
        }
        if (this.field4773 >= var7) {
            if (this.field4762 >= 0) {
                this.method2066();
                this.method2195(-1);
                return;
            }
            this.field4773 = var7 - 1;
        }
        if (this.field4766 >= 0) {
            if (this.field4766 > 0) {
                if (this.field4760) {
                    label131: {
                        if (this.field4762 < 0) {
                            var9 = this.method2048(arg0, arg1, var5, var10, var4.field1237[this.field4769]);
                            if (this.field4773 >= var5) {
                                return;
                            }
                            this.field4773 = var5 + var5 - this.field4773 - 1;
                            this.field4762 = -this.field4762;
                            if (--this.field4766 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method2042(arg0, var9, var6, var10, var4.field1237[this.field4768 - 1]);
                            if (this.field4773 < var6) {
                                return;
                            }
                            this.field4773 = var6 + var6 - this.field4773 - 1;
                            this.field4762 = -this.field4762;
                            if (--this.field4766 == 0) {
                                break;
                            }
                            var9 = this.method2048(arg0, var9, var5, var10, var4.field1237[this.field4769]);
                            if (this.field4773 >= var5) {
                                return;
                            }
                            this.field4773 = var5 + var5 - this.field4773 - 1;
                            this.field4762 = -this.field4762;
                        } while (--this.field4766 != 0);
                    }
                } else if (this.field4762 < 0) {
                    while (true) {
                        var9 = this.method2048(arg0, var9, var5, var10, var4.field1237[this.field4768 - 1]);
                        if (this.field4773 >= var5) {
                            return;
                        }
                        int var12 = (var6 - this.field4773 - 1) / var8;
                        if (var12 >= this.field4766) {
                            this.field4773 += this.field4766 * var8;
                            this.field4766 = 0;
                            break;
                        }
                        this.field4773 += var8 * var12;
                        this.field4766 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method2042(arg0, var9, var6, var10, var4.field1237[this.field4769]);
                        if (this.field4773 < var6) {
                            return;
                        }
                        int var13 = (this.field4773 - var5) / var8;
                        if (var13 >= this.field4766) {
                            this.field4773 -= this.field4766 * var8;
                            this.field4766 = 0;
                            break;
                        }
                        this.field4773 -= var8 * var13;
                        this.field4766 -= var13;
                    }
                }
            }
            if (this.field4762 < 0) {
                this.method2048(arg0, var9, 0, var10, 0);
                if (this.field4773 < 0) {
                    this.field4773 = -1;
                    this.method2066();
                    this.method2195(-1);
                }
            } else {
                this.method2042(arg0, var9, var7, var10, 0);
                if (this.field4773 >= var7) {
                    this.field4773 = var7;
                    this.method2066();
                    this.method2195(-1);
                }
            }
        } else if (this.field4760) {
            if (this.field4762 < 0) {
                var9 = this.method2048(arg0, arg1, var5, var10, var4.field1237[this.field4769]);
                if (this.field4773 >= var5) {
                    return;
                }
                this.field4773 = var5 + var5 - this.field4773 - 1;
                this.field4762 = -this.field4762;
            }
            while (true) {
                int var11 = this.method2042(arg0, var9, var6, var10, var4.field1237[this.field4768 - 1]);
                if (this.field4773 < var6) {
                    return;
                }
                this.field4773 = var6 + var6 - this.field4773 - 1;
                this.field4762 = -this.field4762;
                var9 = this.method2048(arg0, var11, var5, var10, var4.field1237[this.field4769]);
                if (this.field4773 >= var5) {
                    return;
                }
                this.field4773 = var5 + var5 - this.field4773 - 1;
                this.field4762 = -this.field4762;
            }
        } else if (this.field4762 < 0) {
            while (true) {
                var9 = this.method2048(arg0, var9, var5, var10, var4.field1237[this.field4768 - 1]);
                if (this.field4773 >= var5) {
                    return;
                }
                this.field4773 = var6 - (var6 - 1 - this.field4773) % var8 - 1;
            }
        } else {
            while (true) {
                var9 = this.method2042(arg0, var9, var6, var10, var4.field1237[this.field4769]);
                if (this.field4773 < var6) {
                    return;
                }
                this.field4773 = (this.field4773 - var5) % var8 + var5;
            }
        }
    }

    @OriginalMember(owner = "client!bh", name = "k", descriptor = "()V", line = 1246)
    private final void method2065() {
        this.field4765 = this.field4761;
        this.field4764 = method2058(this.field4761, this.field4770);
        this.field4772 = method2051(this.field4761, this.field4770);
    }

    @OriginalMember(owner = "client!bh", name = "l", descriptor = "()V", line = 1251)
    private final void method2066() {
        if (this.field4763 == 0) {
            return;
        }
        if (this.field4761 == Integer.MIN_VALUE) {
            this.field4761 = 0;
        }
        this.field4763 = 0;
        this.method2065();
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(I[B[IIIIIIIILbh;)I", line = 1262)
    private static final int method2067(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class299 arg10) {
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
        arg10.field4773 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lri;III)Lbh;", line = 1303)
    public static final class299 method2068(class76 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1237 == null || arg0.field1237.length == 0 ? null : new class299(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(I[B[IIIIIIIILbh;)I", line = 1312)
    private static final int method2069(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class299 arg10) {
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
        arg10.field4773 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "()I", line = 1351)
    public final int method1757() {
        int var1 = this.field4765 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field4766 == 0) {
            var2 -= this.field4773 * var2 / (((class76) this.field4061).field1237.length << 8);
        } else if (this.field4766 >= 0) {
            var2 -= this.field4769 * var2 / ((class76) this.field4061).field1237.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(II[B[IIIIIIIIIILbh;II)I", line = 1363)
    private static final int method2070(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class299 arg13, int arg14, int arg15) {
        arg13.field4765 -= arg13.field4767 * arg5;
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
        arg13.field4765 += arg13.field4767 * var26;
        arg13.field4764 = arg6;
        arg13.field4772 = arg7;
        arg13.field4773 = arg4;
        return var26;
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(I[B[IIIIIIIIIILbh;)I", line = 1404)
    private static final int method2071(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class299 arg12) {
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
        arg12.field4765 += (var19 - arg4) * arg12.field4767;
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
        arg12.field4764 = var15 >> 2;
        arg12.field4772 = var16 >> 2;
        arg12.field4773 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(Lri;II)V", line = 1457)
    private class299(class76 arg0, int arg1, int arg2) {
        this.field4061 = arg0;
        this.field4769 = arg0.field1235;
        this.field4768 = arg0.field1236;
        this.field4760 = arg0.field1238;
        this.field4762 = arg1;
        this.field4761 = arg2;
        this.field4770 = 8192;
        this.field4773 = 0;
        this.method2065();
    }

    @OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(Lri;III)V", line = 1469)
    private class299(class76 arg0, int arg1, int arg2, int arg3) {
        this.field4061 = arg0;
        this.field4769 = arg0.field1235;
        this.field4768 = arg0.field1236;
        this.field4760 = arg0.field1238;
        this.field4762 = arg1;
        this.field4761 = arg2;
        this.field4770 = arg3;
        this.field4773 = 0;
        this.method2065();
    }
}
