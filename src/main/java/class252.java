import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class252 extends class50 {

    @OriginalMember(owner = "client!oa", name = "G", descriptor = "I")
    private int field3844;

    @OriginalMember(owner = "client!oa", name = "z", descriptor = "I")
    private int field3838;

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "Z")
    private boolean field3832;

    @OriginalMember(owner = "client!oa", name = "u", descriptor = "I")
    private int field3833;

    @OriginalMember(owner = "client!oa", name = "B", descriptor = "I")
    private int field3840;

    @OriginalMember(owner = "client!oa", name = "E", descriptor = "I")
    private int field3843;

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "I")
    private int field3835;

    @OriginalMember(owner = "client!oa", name = "v", descriptor = "I")
    private int field3834;

    @OriginalMember(owner = "client!oa", name = "x", descriptor = "I")
    private int field3836;

    @OriginalMember(owner = "client!oa", name = "y", descriptor = "I")
    private int field3837;

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "I")
    private int field3839;

    @OriginalMember(owner = "client!oa", name = "C", descriptor = "I")
    private int field3841;

    @OriginalMember(owner = "client!oa", name = "D", descriptor = "I")
    private int field3842;

    @OriginalMember(owner = "client!oa", name = "H", descriptor = "I")
    private int field3845;

    @OriginalMember(owner = "client!oa", name = "I", descriptor = "I")
    private int field3846;

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "()I")
    public final int method278() {
        return this.field3840 == 0 && this.field3841 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(II)I")
    private static final int method1659(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(I)V")
    public final synchronized void method281(int arg0) {
        if (this.field3841 > 0) {
            if (arg0 >= this.field3841) {
                if (this.field3840 == Integer.MIN_VALUE) {
                    this.field3840 = 0;
                    this.field3834 = this.field3837 = this.field3845 = 0;
                    this.method1706(-81);
                    arg0 = this.field3841;
                }
                this.field3841 = 0;
                this.method1668();
            } else {
                this.field3834 += this.field3842 * arg0;
                this.field3837 += this.field3836 * arg0;
                this.field3845 += this.field3839 * arg0;
                this.field3841 -= arg0;
            }
        }
        class116 var2 = (class116) super.field744;
        int var3 = this.field3844 << 8;
        int var4 = this.field3838 << 8;
        int var5 = var2.field1721.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field3846 = 0;
        }
        if (this.field3835 < 0) {
            if (this.field3833 <= 0) {
                this.method1663();
                this.method1706(-114);
                return;
            }
            this.field3835 = 0;
        }
        if (this.field3835 >= var5) {
            if (this.field3833 >= 0) {
                this.method1663();
                this.method1706(-108);
                return;
            }
            this.field3835 = var5 - 1;
        }
        this.field3835 += this.field3833 * arg0;
        if (this.field3846 < 0) {
            if (!this.field3832) {
                if (this.field3833 < 0) {
                    if (this.field3835 < var3) {
                        this.field3835 = var4 - 1 - (var4 - 1 - this.field3835) % var6;
                    }
                } else if (this.field3835 >= var4) {
                    this.field3835 = (this.field3835 - var3) % var6 + var3;
                }
            } else {
                if (this.field3833 < 0) {
                    if (this.field3835 >= var3) {
                        return;
                    }
                    this.field3835 = var3 + var3 - 1 - this.field3835;
                    this.field3833 = -this.field3833;
                }
                while (this.field3835 >= var4) {
                    this.field3835 = var4 + var4 - 1 - this.field3835;
                    this.field3833 = -this.field3833;
                    if (this.field3835 >= var3) {
                        return;
                    }
                    this.field3835 = var3 + var3 - 1 - this.field3835;
                    this.field3833 = -this.field3833;
                }
            }
        } else {
            if (this.field3846 > 0) {
                if (this.field3832) {
                    label125: {
                        if (this.field3833 < 0) {
                            if (this.field3835 >= var3) {
                                return;
                            }
                            this.field3835 = var3 + var3 - 1 - this.field3835;
                            this.field3833 = -this.field3833;
                            if (--this.field3846 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field3835 < var4) {
                                return;
                            }
                            this.field3835 = var4 + var4 - 1 - this.field3835;
                            this.field3833 = -this.field3833;
                            if (--this.field3846 == 0) {
                                break;
                            }
                            if (this.field3835 >= var3) {
                                return;
                            }
                            this.field3835 = var3 + var3 - 1 - this.field3835;
                            this.field3833 = -this.field3833;
                        } while (--this.field3846 != 0);
                    }
                } else if (this.field3833 < 0) {
                    if (this.field3835 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field3835) / var6;
                    if (var7 < this.field3846) {
                        this.field3835 += var6 * var7;
                        this.field3846 -= var7;
                        return;
                    }
                    this.field3835 += this.field3846 * var6;
                    this.field3846 = 0;
                } else {
                    if (this.field3835 < var4) {
                        return;
                    }
                    int var8 = (this.field3835 - var3) / var6;
                    if (var8 < this.field3846) {
                        this.field3835 -= var6 * var8;
                        this.field3846 -= var8;
                        return;
                    }
                    this.field3835 -= this.field3846 * var6;
                    this.field3846 = 0;
                }
            }
            if (this.field3833 < 0) {
                if (this.field3835 < 0) {
                    this.field3835 = -1;
                    this.method1663();
                    this.method1706(-111);
                    return;
                }
            } else if (this.field3835 >= var5) {
                this.field3835 = var5;
                this.method1663();
                this.method1706(-128);
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([IIIII)I")
    private final int method1660(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field3841 <= 0) {
                if (this.field3833 == 256 && (this.field3835 & 255) == 0) {
                    if (class24.field323) {
                        return method1690(0, ((class116) super.field744).field1721, arg0, this.field3835, arg1, this.field3837, this.field3845, 0, arg3, arg2, this);
                    }
                    return method1691(((class116) super.field744).field1721, arg0, this.field3835, arg1, this.field3834, 0, arg3, arg2, this);
                }
                if (class24.field323) {
                    return method1674(0, 0, ((class116) super.field744).field1721, arg0, this.field3835, arg1, this.field3837, this.field3845, 0, arg3, arg2, this, this.field3833, arg4);
                }
                return method1667(0, 0, ((class116) super.field744).field1721, arg0, this.field3835, arg1, this.field3834, 0, arg3, arg2, this, this.field3833, arg4);
            }
            int var6 = this.field3841 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field3841 += arg1;
            if (this.field3833 == 256 && (this.field3835 & 255) == 0) {
                if (class24.field323) {
                    arg1 = method1681(0, ((class116) super.field744).field1721, arg0, this.field3835, arg1, this.field3837, this.field3845, this.field3836, this.field3839, 0, var6, arg2, this);
                } else {
                    arg1 = method1680(((class116) super.field744).field1721, arg0, this.field3835, arg1, this.field3834, this.field3842, 0, var6, arg2, this);
                }
            } else if (class24.field323) {
                arg1 = method1678(0, 0, ((class116) super.field744).field1721, arg0, this.field3835, arg1, this.field3837, this.field3845, this.field3836, this.field3839, 0, var6, arg2, this, this.field3833, arg4);
            } else {
                arg1 = method1677(0, 0, ((class116) super.field744).field1721, arg0, this.field3835, arg1, this.field3834, this.field3842, 0, var6, arg2, this, this.field3833, arg4);
            }
            this.field3841 -= arg1;
            if (this.field3841 != 0) {
                return arg1;
            }
        } while (!this.method1684());
        return arg3;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I[B[IIIIIIIIIILoa;)I")
    private static final int method1661(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class252 arg12) {
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
        arg12.field3834 += (var19 - arg4) * arg12.field3842;
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
        arg12.field3837 = var15 >> 2;
        arg12.field3845 = var16 >> 2;
        arg12.field3835 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "()I")
    public final synchronized int method1662() {
        return this.field3840 == Integer.MIN_VALUE ? 0 : this.field3840;
    }

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "()V")
    private final void method1663() {
        if (this.field3841 != 0) {
            if (this.field3840 == Integer.MIN_VALUE) {
                this.field3840 = 0;
            }
            this.field3841 = 0;
            this.method1668();
        }
    }

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(I)V")
    private final synchronized void method1664(int arg0) {
        this.method1679(arg0, this.method1687());
    }

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "()Z")
    public final boolean method1665() {
        return this.field3835 < 0 || this.field3835 >= ((class116) super.field744).field1721.length << 8;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([B[IIIIIIIILoa;)I")
    private static final int method1666(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class252 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field3837 += (var14 - arg3) * arg9.field3836;
        arg9.field3845 += (var14 - arg3) * arg9.field3839;
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
        arg9.field3834 = var12 >> 2;
        arg9.field3835 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[B[IIIIIIILoa;II)I")
    private static final int method1667(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class252 arg10, int arg11, int arg12) {
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
        arg10.field3835 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "()V")
    private final void method1668() {
        this.field3834 = this.field3840;
        this.field3837 = method1698(this.field3840, this.field3843);
        this.field3845 = method1659(this.field3840, this.field3843);
    }

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "()I")
    public final int method341() {
        int var1 = this.field3834 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field3846 == 0) {
            var2 -= this.field3835 * var2 / (((class116) super.field744).field1721.length << 8);
        } else if (this.field3846 >= 0) {
            var2 -= this.field3844 * var2 / ((class116) super.field744).field1721.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(Z)V")
    public final synchronized void method1669(boolean arg0) {
        this.field3833 = (this.field3833 >>> 31) + (this.field3833 ^ this.field3833 >> 31);
        if (arg0) {
            this.field3833 = -this.field3833;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[B[IIIIIIIILoa;II)I")
    private static final int method1670(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class252 arg11, int arg12, int arg13) {
        arg11.field3837 -= arg11.field3836 * arg5;
        arg11.field3845 -= arg11.field3839 * arg5;
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
        arg11.field3837 += arg11.field3836 * arg5;
        arg11.field3845 += arg11.field3839 * arg5;
        arg11.field3834 = arg6;
        arg11.field3835 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([B[IIIIIIILoa;)I")
    private static final int method1671(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class252 arg8) {
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
        arg8.field3835 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "(I)V")
    public final synchronized void method1672(int arg0) {
        if (arg0 == 0) {
            this.method1664(0);
            this.method1706(-120);
        } else if (this.field3837 == 0 && this.field3845 == 0) {
            this.field3841 = 0;
            this.field3840 = 0;
            this.field3834 = 0;
            this.method1706(-71);
        } else {
            int var2 = -this.field3834;
            if (this.field3834 > var2) {
                var2 = this.field3834;
            }
            if (-this.field3837 > var2) {
                var2 = -this.field3837;
            }
            if (this.field3837 > var2) {
                var2 = this.field3837;
            }
            if (-this.field3845 > var2) {
                var2 = -this.field3845;
            }
            if (this.field3845 > var2) {
                var2 = this.field3845;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field3841 = arg0;
            this.field3840 = Integer.MIN_VALUE;
            this.field3842 = -this.field3834 / arg0;
            this.field3836 = -this.field3837 / arg0;
            this.field3839 = -this.field3845 / arg0;
        }
    }

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "(I)V")
    public final synchronized void method1673(int arg0) {
        this.field3846 = arg0;
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(II[B[IIIIIIIILoa;II)I")
    private static final int method1674(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class252 arg11, int arg12, int arg13) {
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
        arg11.field3835 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lml;III)Loa;")
    public static final class252 method1675(class116 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1721 != null && arg0.field1721.length != 0 ? new class252(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[B[IIIIIIIIIILoa;II)I")
    private static final int method1676(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class252 arg13, int arg14, int arg15) {
        arg13.field3834 -= arg13.field3842 * arg5;
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
        arg13.field3834 += arg13.field3842 * var22;
        arg13.field3837 = arg6;
        arg13.field3845 = arg7;
        arg13.field3835 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(II[B[IIIIIIIILoa;II)I")
    private static final int method1677(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class252 arg11, int arg12, int arg13) {
        arg11.field3837 -= arg11.field3836 * arg5;
        arg11.field3845 -= arg11.field3839 * arg5;
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
        arg11.field3837 += arg11.field3836 * arg5;
        arg11.field3845 += arg11.field3839 * arg5;
        arg11.field3834 = arg6;
        arg11.field3835 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "()Lfb;")
    public final class50 method283() {
        return null;
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(II[B[IIIIIIIIIILoa;II)I")
    private static final int method1678(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class252 arg13, int arg14, int arg15) {
        arg13.field3834 -= arg13.field3842 * arg5;
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
        arg13.field3834 += arg13.field3842 * var22;
        arg13.field3837 = arg6;
        arg13.field3845 = arg7;
        arg13.field3835 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(II)V")
    private final synchronized void method1679(int arg0, int arg1) {
        this.field3840 = arg0;
        this.field3843 = arg1;
        this.field3841 = 0;
        this.method1668();
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "([B[IIIIIIIILoa;)I")
    private static final int method1680(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class252 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field3837 += (var14 - arg3) * arg9.field3836;
        arg9.field3845 += (var14 - arg3) * arg9.field3839;
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
        arg9.field3834 = var12 >> 2;
        arg9.field3835 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(I[B[IIIIIIIIIILoa;)I")
    private static final int method1681(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class252 arg12) {
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
        arg12.field3834 += (var19 - arg4) * arg12.field3842;
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
        arg12.field3837 = var15 >> 2;
        arg12.field3845 = var16 >> 2;
        arg12.field3835 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(II[B[IIIIIIILoa;II)I")
    private static final int method1682(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class252 arg10, int arg11, int arg12) {
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
        arg10.field3835 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "(I)V")
    public final synchronized void method1683(int arg0) {
        int var2 = ((class116) super.field744).field1721.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field3835 = arg0;
    }

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "()Z")
    private final boolean method1684() {
        int var1 = this.field3840;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1698(var1, this.field3843);
            var2 = method1659(var1, this.field3843);
        }
        if (this.field3834 == var1 && this.field3837 == var3 && this.field3845 == var2) {
            if (this.field3840 == Integer.MIN_VALUE) {
                this.field3840 = 0;
                this.field3834 = this.field3837 = this.field3845 = 0;
                this.method1706(-128);
                return true;
            } else {
                this.method1668();
                return false;
            }
        } else {
            if (this.field3834 < var1) {
                this.field3842 = 1;
                this.field3841 = var1 - this.field3834;
            } else if (this.field3834 > var1) {
                this.field3842 = -1;
                this.field3841 = this.field3834 - var1;
            } else {
                this.field3842 = 0;
            }
            if (this.field3837 < var3) {
                this.field3836 = 1;
                if (this.field3841 == 0 || this.field3841 > var3 - this.field3837) {
                    this.field3841 = var3 - this.field3837;
                }
            } else if (this.field3837 > var3) {
                this.field3836 = -1;
                if (this.field3841 == 0 || this.field3841 > this.field3837 - var3) {
                    this.field3841 = this.field3837 - var3;
                }
            } else {
                this.field3836 = 0;
            }
            if (this.field3845 < var2) {
                this.field3839 = 1;
                if (this.field3841 == 0 || this.field3841 > var2 - this.field3845) {
                    this.field3841 = var2 - this.field3845;
                }
            } else if (this.field3845 > var2) {
                this.field3839 = -1;
                if (this.field3841 == 0 || this.field3841 > this.field3845 - var2) {
                    this.field3841 = this.field3845 - var2;
                }
            } else {
                this.field3839 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([III)V")
    public final synchronized void method277(int[] arg0, int arg1, int arg2) {
        if (this.field3840 == 0 && this.field3841 == 0) {
            this.method281(arg2);
        } else {
            class116 var4 = (class116) super.field744;
            int var5 = this.field3844 << 8;
            int var6 = this.field3838 << 8;
            int var7 = var4.field1721.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field3846 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field3835 < 0) {
                if (this.field3833 <= 0) {
                    this.method1663();
                    this.method1706(-118);
                    return;
                }
                this.field3835 = 0;
            }
            if (this.field3835 >= var7) {
                if (this.field3833 >= 0) {
                    this.method1663();
                    this.method1706(-114);
                    return;
                }
                this.field3835 = var7 - 1;
            }
            if (this.field3846 < 0) {
                if (this.field3832) {
                    if (this.field3833 < 0) {
                        var9 = this.method1693(arg0, arg1, var5, var10, var4.field1721[this.field3844]);
                        if (this.field3835 >= var5) {
                            return;
                        }
                        this.field3835 = var5 + var5 - 1 - this.field3835;
                        this.field3833 = -this.field3833;
                    }
                    while (true) {
                        int var11 = this.method1660(arg0, var9, var6, var10, var4.field1721[this.field3838 - 1]);
                        if (this.field3835 < var6) {
                            return;
                        }
                        this.field3835 = var6 + var6 - 1 - this.field3835;
                        this.field3833 = -this.field3833;
                        var9 = this.method1693(arg0, var11, var5, var10, var4.field1721[this.field3844]);
                        if (this.field3835 >= var5) {
                            return;
                        }
                        this.field3835 = var5 + var5 - 1 - this.field3835;
                        this.field3833 = -this.field3833;
                    }
                } else if (this.field3833 < 0) {
                    while (true) {
                        var9 = this.method1693(arg0, var9, var5, var10, var4.field1721[this.field3838 - 1]);
                        if (this.field3835 >= var5) {
                            return;
                        }
                        this.field3835 = var6 - 1 - (var6 - 1 - this.field3835) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method1660(arg0, var9, var6, var10, var4.field1721[this.field3844]);
                        if (this.field3835 < var6) {
                            return;
                        }
                        this.field3835 = (this.field3835 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field3846 > 0) {
                    if (this.field3832) {
                        label130: {
                            if (this.field3833 < 0) {
                                var9 = this.method1693(arg0, arg1, var5, var10, var4.field1721[this.field3844]);
                                if (this.field3835 >= var5) {
                                    return;
                                }
                                this.field3835 = var5 + var5 - 1 - this.field3835;
                                this.field3833 = -this.field3833;
                                if (--this.field3846 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method1660(arg0, var9, var6, var10, var4.field1721[this.field3838 - 1]);
                                if (this.field3835 < var6) {
                                    return;
                                }
                                this.field3835 = var6 + var6 - 1 - this.field3835;
                                this.field3833 = -this.field3833;
                                if (--this.field3846 == 0) {
                                    break;
                                }
                                var9 = this.method1693(arg0, var9, var5, var10, var4.field1721[this.field3844]);
                                if (this.field3835 >= var5) {
                                    return;
                                }
                                this.field3835 = var5 + var5 - 1 - this.field3835;
                                this.field3833 = -this.field3833;
                            } while (--this.field3846 != 0);
                        }
                    } else if (this.field3833 < 0) {
                        while (true) {
                            var9 = this.method1693(arg0, var9, var5, var10, var4.field1721[this.field3838 - 1]);
                            if (this.field3835 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field3835) / var8;
                            if (var12 >= this.field3846) {
                                this.field3835 += this.field3846 * var8;
                                this.field3846 = 0;
                                break;
                            }
                            this.field3835 += var8 * var12;
                            this.field3846 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method1660(arg0, var9, var6, var10, var4.field1721[this.field3844]);
                            if (this.field3835 < var6) {
                                return;
                            }
                            int var13 = (this.field3835 - var5) / var8;
                            if (var13 >= this.field3846) {
                                this.field3835 -= this.field3846 * var8;
                                this.field3846 = 0;
                                break;
                            }
                            this.field3835 -= var8 * var13;
                            this.field3846 -= var13;
                        }
                    }
                }
                if (this.field3833 < 0) {
                    this.method1693(arg0, var9, 0, var10, 0);
                    if (this.field3835 < 0) {
                        this.field3835 = -1;
                        this.method1663();
                        this.method1706(-64);
                        return;
                    }
                } else {
                    this.method1660(arg0, var9, var7, var10, 0);
                    if (this.field3835 >= var7) {
                        this.field3835 = var7;
                        this.method1663();
                        this.method1706(-91);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "()I")
    public final synchronized int method1685() {
        return this.field3833 < 0 ? -this.field3833 : this.field3833;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I[B[IIIIIIIILoa;)I")
    private static final int method1686(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class252 arg10) {
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
        arg10.field3835 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "()I")
    public final synchronized int method1687() {
        return this.field3843 < 0 ? -1 : this.field3843;
    }

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(II[B[IIIIIIIILoa;II)I")
    private static final int method1688(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class252 arg11, int arg12, int arg13) {
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
        arg11.field3835 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(III)V")
    public final synchronized void method1689(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1679(arg1, arg2);
        } else {
            int var4 = method1698(arg1, arg2);
            int var5 = method1659(arg1, arg2);
            if (this.field3837 == var4 && this.field3845 == var5) {
                this.field3841 = 0;
            } else {
                int var6 = arg1 - this.field3834;
                if (this.field3834 - arg1 > var6) {
                    var6 = this.field3834 - arg1;
                }
                if (var4 - this.field3837 > var6) {
                    var6 = var4 - this.field3837;
                }
                if (this.field3837 - var4 > var6) {
                    var6 = this.field3837 - var4;
                }
                if (var5 - this.field3845 > var6) {
                    var6 = var5 - this.field3845;
                }
                if (this.field3845 - var5 > var6) {
                    var6 = this.field3845 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field3841 = arg0;
                this.field3840 = arg1;
                this.field3843 = arg2;
                this.field3842 = (arg1 - this.field3834) / arg0;
                this.field3836 = (var4 - this.field3837) / arg0;
                this.field3839 = (var5 - this.field3845) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(I[B[IIIIIIIILoa;)I")
    private static final int method1690(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class252 arg10) {
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
        arg10.field3835 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "([B[IIIIIIILoa;)I")
    private static final int method1691(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class252 arg8) {
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
        arg8.field3835 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "()Z")
    public final boolean method1692() {
        return this.field3841 != 0;
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "([IIIII)I")
    private final int method1693(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field3841 <= 0) {
                if (this.field3833 == -256 && (this.field3835 & 255) == 0) {
                    if (class24.field323) {
                        return method1686(0, ((class116) super.field744).field1721, arg0, this.field3835, arg1, this.field3837, this.field3845, 0, arg3, arg2, this);
                    }
                    return method1671(((class116) super.field744).field1721, arg0, this.field3835, arg1, this.field3834, 0, arg3, arg2, this);
                }
                if (class24.field323) {
                    return method1688(0, 0, ((class116) super.field744).field1721, arg0, this.field3835, arg1, this.field3837, this.field3845, 0, arg3, arg2, this, this.field3833, arg4);
                }
                return method1682(0, 0, ((class116) super.field744).field1721, arg0, this.field3835, arg1, this.field3834, 0, arg3, arg2, this, this.field3833, arg4);
            }
            int var6 = this.field3841 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field3841 += arg1;
            if (this.field3833 == -256 && (this.field3835 & 255) == 0) {
                if (class24.field323) {
                    arg1 = method1661(0, ((class116) super.field744).field1721, arg0, this.field3835, arg1, this.field3837, this.field3845, this.field3836, this.field3839, 0, var6, arg2, this);
                } else {
                    arg1 = method1666(((class116) super.field744).field1721, arg0, this.field3835, arg1, this.field3834, this.field3842, 0, var6, arg2, this);
                }
            } else if (class24.field323) {
                arg1 = method1676(0, 0, ((class116) super.field744).field1721, arg0, this.field3835, arg1, this.field3837, this.field3845, this.field3836, this.field3839, 0, var6, arg2, this, this.field3833, arg4);
            } else {
                arg1 = method1670(0, 0, ((class116) super.field744).field1721, arg0, this.field3835, arg1, this.field3834, this.field3842, 0, var6, arg2, this, this.field3833, arg4);
            }
            this.field3841 -= arg1;
            if (this.field3841 != 0) {
                return arg1;
            }
        } while (!this.method1684());
        return arg3;
    }

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "(I)V")
    public final synchronized void method1694(int arg0) {
        if (this.field3833 < 0) {
            this.field3833 = -arg0;
        } else {
            this.field3833 = arg0;
        }
    }

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "(II)V")
    public final synchronized void method1695(int arg0, int arg1) {
        this.method1689(arg0, arg1, this.method1687());
    }

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "(I)V")
    public final synchronized void method1696(int arg0) {
        this.method1679(arg0 << 6, this.method1687());
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Lml;II)V")
    private class252(class116 arg0, int arg1, int arg2) {
        super.field744 = arg0;
        this.field3844 = arg0.field1723;
        this.field3838 = arg0.field1724;
        this.field3832 = arg0.field1720;
        this.field3833 = arg1;
        this.field3840 = arg2;
        this.field3843 = 8192;
        this.field3835 = 0;
        this.method1668();
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lml;II)Loa;")
    public static final class252 method1697(class116 arg0, int arg1, int arg2) {
        return arg0.field1721 != null && arg0.field1721.length != 0 ? new class252(arg0, (int) ((long) arg0.field1722 * 256L * (long) arg1 / (long) (class276.field4426 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "()Lfb;")
    public final class50 method276() {
        return null;
    }

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "(II)I")
    private static final int method1698(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Lml;III)V")
    private class252(class116 arg0, int arg1, int arg2, int arg3) {
        super.field744 = arg0;
        this.field3844 = arg0.field1723;
        this.field3838 = arg0.field1724;
        this.field3832 = arg0.field1720;
        this.field3833 = arg1;
        this.field3840 = arg2;
        this.field3843 = arg3;
        this.field3835 = 0;
        this.method1668();
    }
}
