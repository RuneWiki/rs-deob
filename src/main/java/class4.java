import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class4 extends class83 {

    @OriginalMember(owner = "client!ac", name = "K", descriptor = "I")
    private int field46;

    @OriginalMember(owner = "client!ac", name = "R", descriptor = "I")
    private int field53;

    @OriginalMember(owner = "client!ac", name = "M", descriptor = "Z")
    private boolean field48;

    @OriginalMember(owner = "client!ac", name = "O", descriptor = "I")
    private int field50;

    @OriginalMember(owner = "client!ac", name = "G", descriptor = "I")
    private int field42;

    @OriginalMember(owner = "client!ac", name = "Q", descriptor = "I")
    private int field52;

    @OriginalMember(owner = "client!ac", name = "H", descriptor = "I")
    private int field43;

    @OriginalMember(owner = "client!ac", name = "E", descriptor = "I")
    private int field40;

    @OriginalMember(owner = "client!ac", name = "F", descriptor = "I")
    private int field41;

    @OriginalMember(owner = "client!ac", name = "I", descriptor = "I")
    private int field44;

    @OriginalMember(owner = "client!ac", name = "J", descriptor = "I")
    private int field45;

    @OriginalMember(owner = "client!ac", name = "L", descriptor = "I")
    private int field47;

    @OriginalMember(owner = "client!ac", name = "N", descriptor = "I")
    private int field49;

    @OriginalMember(owner = "client!ac", name = "P", descriptor = "I")
    private int field51;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "([IIIII)I")
    private final int method15(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        if (this.field41 > 0) {
            int var6 = this.field41 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field41 += arg1;
            if (this.field50 == -256 && (this.field43 & 255) == 0) {
                if (class106.field2447) {
                    arg1 = method19(0, ((class87) super.field1855).field1947, arg0, this.field43, arg1, this.field42, this.field52, this.field51, this.field44, this.field49, 0, var6, arg2, this);
                } else {
                    arg1 = method22(((class87) super.field1855).field1947, arg0, this.field43, arg1, this.field42, this.field51, this.field44, 0, var6, arg2, this);
                }
            } else if (class106.field2447) {
                arg1 = method20(0, 0, ((class87) super.field1855).field1947, arg0, this.field43, arg1, this.field42, this.field52, this.field51, this.field44, this.field49, 0, var6, arg2, this, this.field50, arg4);
            } else {
                arg1 = method46(0, 0, ((class87) super.field1855).field1947, arg0, this.field43, arg1, this.field42, this.field51, this.field44, 0, var6, arg2, this, this.field50, arg4);
            }
            this.field41 -= arg1;
            if (this.field41 != 0) {
                return arg1;
            }
            this.field52 = this.field47;
            if (this.field45 == Integer.MIN_VALUE) {
                this.field42 = 0;
                this.method540(-26669);
                return arg3;
            }
            this.field42 = this.field45;
        }
        if (this.field50 == -256 && (this.field43 & 255) == 0) {
            return class106.field2447 ? method41(0, ((class87) super.field1855).field1947, arg0, this.field43, arg1, this.method40(), this.method29(), 0, arg3, arg2, this) : method30(((class87) super.field1855).field1947, arg0, this.field43, arg1, this.field42, 0, arg3, arg2, this);
        } else {
            return class106.field2447 ? method44(0, 0, ((class87) super.field1855).field1947, arg0, this.field43, arg1, this.method40(), this.method29(), 0, arg3, arg2, this, this.field50, arg4) : method39(0, 0, ((class87) super.field1855).field1947, arg0, this.field43, arg1, this.field42, 0, arg3, arg2, this, this.field50, arg4);
        }
    }

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "(I)V")
    public final synchronized void method16(int arg0) {
        this.field40 = arg0;
    }

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "()I")
    public final int method17() {
        int var1 = this.field42 * 3;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field40 == 0) {
            var2 -= this.field43 * var2 / (((class87) super.field1855).field1947.length << 8);
        } else if (this.field40 >= 0) {
            var2 -= this.field46 * var2 / ((class87) super.field1855).field1947.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "([B[IIIIIIIIILac;)I")
    private static final int method18(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class4 arg10) {
        int var11 = arg2 >> 8;
        int var12 = arg9 >> 8;
        int var13 = arg4 << 8;
        int var14 = arg6 << 8;
        int var15;
        if ((var15 = arg3 + var12 - var11) > arg8) {
            var15 = arg8;
        }
        var15 -= 3;
        int var10001;
        while (arg3 < var15) {
            var10001 = arg3++;
            arg1[var10001] += arg0[var11++] * var13 >> arg5;
            int var16 = var13 + var14;
            int var19 = arg3++;
            arg1[var19] += arg0[var11++] * var16 >> arg5;
            int var17 = var14 + var16;
            int var20 = arg3++;
            arg1[var20] += arg0[var11++] * var17 >> arg5;
            int var18 = var14 + var17;
            int var21 = arg3++;
            arg1[var21] += arg0[var11++] * var18 >> arg5;
            var13 = var14 + var18;
        }
        var15 += 3;
        while (arg3 < var15) {
            var10001 = arg3++;
            arg1[var10001] += arg0[var11++] * var13 >> arg5;
            var13 += var14;
        }
        arg10.field42 = var13 >> 8;
        arg10.field43 = var11 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(I[B[IIIIIIIIIIILac;)I")
    private static final int method19(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class4 arg13) {
        int var14 = arg3 >> 8;
        int var15 = arg12 >> 8;
        int var16 = arg5 << 8;
        int var17 = arg6 << 8;
        int var18 = arg8 << 8;
        int var19 = arg9 << 8;
        int var20;
        if ((var20 = arg4 + var14 - (var15 - 1)) > arg11) {
            var20 = arg11;
        }
        int var21 = arg4 << 1;
        int var22 = var20 << 1;
        int var45 = var22 - 6;
        while (var21 < var45) {
            byte var24 = arg1[var14--];
            int var34 = var21++;
            arg2[var34] += var16 * var24 >> arg7;
            int var25 = var16 + var18;
            int var35 = var21++;
            arg2[var35] += var17 * var24 >> arg7;
            int var26 = var17 + var19;
            byte var27 = arg1[var14--];
            int var37 = var21++;
            arg2[var37] += var25 * var27 >> arg7;
            int var28 = var18 + var25;
            int var38 = var21++;
            arg2[var38] += var26 * var27 >> arg7;
            int var29 = var19 + var26;
            byte var30 = arg1[var14--];
            int var40 = var21++;
            arg2[var40] += var28 * var30 >> arg7;
            int var31 = var18 + var28;
            int var41 = var21++;
            arg2[var41] += var29 * var30 >> arg7;
            int var32 = var19 + var29;
            byte var33 = arg1[var14--];
            int var43 = var21++;
            arg2[var43] += var31 * var33 >> arg7;
            var16 = var18 + var31;
            int var44 = var21++;
            arg2[var44] += var32 * var33 >> arg7;
            var17 = var19 + var32;
        }
        var22 = var45 + 6;
        while (var21 < var22) {
            byte var23 = arg1[var14--];
            int var10001 = var21++;
            arg2[var10001] += var16 * var23 >> arg7;
            var16 += var18;
            int var46 = var21++;
            arg2[var46] += var17 * var23 >> arg7;
            var17 += var19;
        }
        arg13.field42 = var16 >> 8;
        arg13.field52 = var17 >> 8;
        arg13.field43 = var14 << 8;
        return var21 >> 1;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(II[B[IIIIIIIIIIILac;II)I")
    private static final int method20(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, class4 arg14, int arg15, int arg16) {
        int var17;
        if (arg15 == 0 || (var17 = (arg13 + 256 - arg4 + arg15) / arg15 + arg5) > arg12) {
            var17 = arg12;
        }
        int var18 = arg5 << 1;
        int var19 = var17 << 1;
        int var10001;
        while (var18 < var19) {
            int var24 = arg4 >> 8;
            byte var25 = arg2[var24 - 1];
            int var26 = (var25 << 8) + (arg4 & 255) * (arg2[var24] - var25);
            var10001 = var18++;
            arg3[var10001] += arg6 * var26 >> arg8;
            arg6 += arg9;
            int var27 = var18++;
            arg3[var27] += arg7 * var26 >> arg8;
            arg7 += arg10;
            arg4 += arg15;
        }
        int var20;
        if (arg15 == 0 || (var20 = (var18 >> 1) + (arg13 - arg4 + arg15) / arg15) > arg12) {
            var20 = arg12;
        }
        int var21 = var20 << 1;
        int var22 = arg16;
        while (var18 < var21) {
            int var23 = (var22 << 8) + (arg4 & 255) * (arg2[arg4 >> 8] - var22);
            var10001 = var18++;
            arg3[var10001] += arg6 * var23 >> arg8;
            arg6 += arg9;
            var10001 = var18++;
            arg3[var10001] += arg7 * var23 >> arg8;
            arg7 += arg10;
            arg4 += arg15;
        }
        arg14.field42 = arg6;
        arg14.field52 = arg7;
        arg14.field43 = arg4;
        return var18 >> 1;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "()I")
    public final int method21() {
        return this.field42 != 0 || this.field41 != 0 && this.field45 != 0 && this.field45 != Integer.MIN_VALUE ? 1 : 0;
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "([B[IIIIIIIIILac;)I")
    private static final int method22(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class4 arg10) {
        int var11 = arg2 >> 8;
        int var12 = arg9 >> 8;
        int var13 = arg4 << 8;
        int var14 = arg6 << 8;
        int var15;
        if ((var15 = arg3 + var11 - (var12 - 1)) > arg8) {
            var15 = arg8;
        }
        var15 -= 3;
        int var10001;
        while (arg3 < var15) {
            var10001 = arg3++;
            arg1[var10001] += arg0[var11--] * var13 >> arg5;
            int var16 = var13 + var14;
            int var19 = arg3++;
            arg1[var19] += arg0[var11--] * var16 >> arg5;
            int var17 = var14 + var16;
            int var20 = arg3++;
            arg1[var20] += arg0[var11--] * var17 >> arg5;
            int var18 = var14 + var17;
            int var21 = arg3++;
            arg1[var21] += arg0[var11--] * var18 >> arg5;
            var13 = var14 + var18;
        }
        var15 += 3;
        while (arg3 < var15) {
            var10001 = arg3++;
            arg1[var10001] += arg0[var11--] * var13 >> arg5;
            var13 += var14;
        }
        arg10.field42 = var13 >> 8;
        arg10.field43 = var11 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(II[B[IIIIIIIILac;II)I")
    private static final int method23(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class4 arg11, int arg12, int arg13) {
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
            arg3[var10001] += arg6 * var24;
            int var25 = var15++;
            arg3[var25] += arg7 * var24;
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
            arg3[var10001] += arg6 * var21;
            var10001 = var15++;
            arg3[var10001] += arg7 * var21;
            arg4 += arg12;
        }
        arg11.field43 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(II[B[IIIIIIIIILac;II)I")
    private static final int method24(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class4 arg12, int arg13, int arg14) {
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
        arg12.field42 = arg6;
        arg12.field43 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(II)V")
    private final synchronized void method25(int arg0, int arg1) {
        this.field42 = arg0;
        this.field52 = arg1;
        this.field41 = 0;
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(II[B[IIIIIIIIIIILac;II)I")
    private static final int method26(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, class4 arg14, int arg15, int arg16) {
        int var17;
        if (arg15 == 0 || (var17 = (arg13 - arg4 + arg15 - 257) / arg15 + arg5) > arg12) {
            var17 = arg12;
        }
        int var18 = arg5 << 1;
        int var19 = var17 << 1;
        int var10001;
        while (var18 < var19) {
            int var25 = arg4 >> 8;
            byte var26 = arg2[var25];
            int var27 = (var26 << 8) + (arg4 & 255) * (arg2[var25 + 1] - var26);
            var10001 = var18++;
            arg3[var10001] += arg6 * var27 >> arg8;
            arg6 += arg9;
            int var28 = var18++;
            arg3[var28] += arg7 * var27 >> arg8;
            arg7 += arg10;
            arg4 += arg15;
        }
        int var20;
        if (arg15 == 0 || (var20 = (var18 >> 1) + (arg13 - arg4 + arg15 - 1) / arg15) > arg12) {
            var20 = arg12;
        }
        int var21 = var20 << 1;
        int var22 = arg16;
        while (var18 < var21) {
            byte var23 = arg2[arg4 >> 8];
            int var24 = (var23 << 8) + (arg4 & 255) * (var22 - var23);
            var10001 = var18++;
            arg3[var10001] += arg6 * var24 >> arg8;
            arg6 += arg9;
            var10001 = var18++;
            arg3[var10001] += arg7 * var24 >> arg8;
            arg7 += arg10;
            arg4 += arg15;
        }
        arg14.field42 = arg6;
        arg14.field52 = arg7;
        arg14.field43 = arg4;
        return var18 >> 1;
    }

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "(I)V")
    public final synchronized void method27(int arg0) {
        if (!this.method28()) {
            if (this.field41 > 0) {
                if (arg0 >= this.field41) {
                    if (this.field45 == Integer.MIN_VALUE) {
                        this.field42 = 0;
                        this.method540(-26669);
                        arg0 = this.field41;
                    } else {
                        this.field42 = this.field45;
                    }
                    this.field52 = this.field47;
                    this.field41 = 0;
                } else {
                    this.field42 += this.field44 * arg0;
                    if (class106.field2447) {
                        this.field52 += this.field49 * arg0;
                    }
                    this.field41 -= arg0;
                }
            }
            class87 var2 = (class87) super.field1855;
            int var3 = this.field46 << 8;
            int var4 = this.field53 << 8;
            int var5 = var2.field1947.length << 8;
            int var6 = var4 - var3;
            if (var6 <= 0) {
                this.field40 = 0;
            }
            if (this.field43 < 0) {
                if (this.field50 <= 0) {
                    this.method33();
                    this.method540(-26669);
                    return;
                }
                this.field43 = 0;
            }
            if (this.field43 >= var5) {
                if (this.field50 >= 0) {
                    this.method33();
                    this.method540(-26669);
                    return;
                }
                this.field43 = var5 - 1;
            }
            this.field43 += this.field50 * arg0;
            if (this.field40 < 0) {
                if (!this.field48) {
                    if (this.field50 < 0) {
                        if (this.field43 < var3) {
                            this.field43 = var4 - 1 - (var4 - 1 - this.field43) % var6;
                        }
                    } else if (this.field43 >= var4) {
                        this.field43 = (this.field43 - var3) % var6 + var3;
                    }
                } else {
                    if (this.field50 < 0) {
                        if (this.field43 >= var3) {
                            return;
                        }
                        this.field43 = var3 + var3 - 1 - this.field43;
                        this.field50 = -this.field50;
                    }
                    while (this.field43 >= var4) {
                        this.field43 = var4 + var4 - 1 - this.field43;
                        this.field50 = -this.field50;
                        if (this.field43 >= var3) {
                            return;
                        }
                        this.field43 = var3 + var3 - 1 - this.field43;
                        this.field50 = -this.field50;
                    }
                }
            } else {
                if (this.field40 > 0) {
                    if (this.field48) {
                        label133: {
                            if (this.field50 < 0) {
                                if (this.field43 >= var3) {
                                    return;
                                }
                                this.field43 = var3 + var3 - 1 - this.field43;
                                this.field50 = -this.field50;
                                if (--this.field40 == 0) {
                                    break label133;
                                }
                            }
                            do {
                                if (this.field43 < var4) {
                                    return;
                                }
                                this.field43 = var4 + var4 - 1 - this.field43;
                                this.field50 = -this.field50;
                                if (--this.field40 == 0) {
                                    break;
                                }
                                if (this.field43 >= var3) {
                                    return;
                                }
                                this.field43 = var3 + var3 - 1 - this.field43;
                                this.field50 = -this.field50;
                            } while (--this.field40 != 0);
                        }
                    } else if (this.field50 < 0) {
                        if (this.field43 >= var3) {
                            return;
                        }
                        int var7 = (var4 - 1 - this.field43) / var6;
                        if (var7 < this.field40) {
                            this.field43 += var6 * var7;
                            this.field40 -= var7;
                            return;
                        }
                        this.field43 += this.field40 * var6;
                        this.field40 = 0;
                    } else {
                        if (this.field43 < var4) {
                            return;
                        }
                        int var8 = (this.field43 - var3) / var6;
                        if (var8 < this.field40) {
                            this.field43 -= var6 * var8;
                            this.field40 -= var8;
                            return;
                        }
                        this.field43 -= this.field40 * var6;
                        this.field40 = 0;
                    }
                }
                if (this.field50 < 0) {
                    if (this.field43 < 0) {
                        this.field43 = -1;
                        this.method33();
                        this.method540(-26669);
                        return;
                    }
                } else if (this.field43 >= var5) {
                    this.field43 = var5;
                    this.method33();
                    this.method540(-26669);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "()Z")
    private final boolean method28() {
        if (this.field41 != 0 && class106.field2447 != (this.field49 != Integer.MIN_VALUE)) {
            this.field42 = this.field45 == Integer.MIN_VALUE ? 0 : this.field45;
            this.field52 = this.field47;
            this.field41 = 0;
            if (this.field45 == Integer.MIN_VALUE) {
                this.method540(-26669);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "()I")
    private final int method29() {
        return this.field52 < 0 ? -this.field42 : (int) ((double) this.field42 * Math.sqrt((double) this.field52 * 0.0078125D) + 0.5D);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "([B[IIIIIIILac;)I")
    private static final int method30(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class4 arg8) {
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
        arg8.field43 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(I[B[IIIIIIIILac;)I")
    private static final int method31(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class4 arg10) {
        int var11 = arg3 >> 8;
        int var12 = arg9 >> 8;
        int var13 = arg5 << 8;
        int var14 = arg6 << 8;
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
        arg10.field43 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "()Lmc;")
    public final class83 method32() {
        return null;
    }

    @OriginalMember(owner = "client!ac", name = "g", descriptor = "()V")
    private final void method33() {
        if (this.field41 != 0) {
            this.field42 = this.field45 == Integer.MIN_VALUE ? 0 : this.field45;
            this.field52 = this.field47;
            this.field41 = 0;
        }
    }

    @OriginalMember(owner = "client!ac", name = "h", descriptor = "()I")
    private final synchronized int method34() {
        return this.field41 > 0 ? this.field47 : this.field52;
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "([B[IIIIIIILac;)I")
    private static final int method35(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class4 arg8) {
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
        arg8.field43 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ac", name = "g", descriptor = "(I)V")
    public final synchronized void method36(int arg0) {
        this.method25(arg0, this.method34());
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "([III)V")
    public final synchronized void method37(int[] arg0, int arg1, int arg2) {
        if (!this.method28()) {
            if (this.field42 != 0 || this.field41 != 0 && this.field45 != 0 && this.field45 != Integer.MIN_VALUE) {
                class87 var4 = (class87) super.field1855;
                int var5 = this.field46 << 8;
                int var6 = this.field53 << 8;
                int var7 = var4.field1947.length << 8;
                int var8 = var6 - var5;
                if (var8 <= 0) {
                    this.field40 = 0;
                }
                int var9 = arg1;
                int var10 = arg1 + arg2;
                if (this.field43 < 0) {
                    if (this.field50 <= 0) {
                        this.method33();
                        this.method540(-26669);
                        return;
                    }
                    this.field43 = 0;
                }
                if (this.field43 >= var7) {
                    if (this.field50 >= 0) {
                        this.method33();
                        this.method540(-26669);
                        return;
                    }
                    this.field43 = var7 - 1;
                }
                if (this.field40 < 0) {
                    if (this.field48) {
                        if (this.field50 < 0) {
                            var9 = this.method15(arg0, arg1, var5, var10, var4.field1947[this.field46]);
                            if (this.field43 >= var5) {
                                return;
                            }
                            this.field43 = var5 + var5 - 1 - this.field43;
                            this.field50 = -this.field50;
                        }
                        while (true) {
                            int var11 = this.method38(arg0, var9, var6, var10, var4.field1947[this.field53 - 1]);
                            if (this.field43 < var6) {
                                return;
                            }
                            this.field43 = var6 + var6 - 1 - this.field43;
                            this.field50 = -this.field50;
                            var9 = this.method15(arg0, var11, var5, var10, var4.field1947[this.field46]);
                            if (this.field43 >= var5) {
                                return;
                            }
                            this.field43 = var5 + var5 - 1 - this.field43;
                            this.field50 = -this.field50;
                        }
                    } else if (this.field50 < 0) {
                        while (true) {
                            var9 = this.method15(arg0, var9, var5, var10, var4.field1947[this.field53 - 1]);
                            if (this.field43 >= var5) {
                                return;
                            }
                            this.field43 = var6 - 1 - (var6 - 1 - this.field43) % var8;
                        }
                    } else {
                        while (true) {
                            var9 = this.method38(arg0, var9, var6, var10, var4.field1947[this.field46]);
                            if (this.field43 < var6) {
                                return;
                            }
                            this.field43 = (this.field43 - var5) % var8 + var5;
                        }
                    }
                } else {
                    if (this.field40 > 0) {
                        if (this.field48) {
                            label134: {
                                if (this.field50 < 0) {
                                    var9 = this.method15(arg0, arg1, var5, var10, var4.field1947[this.field46]);
                                    if (this.field43 >= var5) {
                                        return;
                                    }
                                    this.field43 = var5 + var5 - 1 - this.field43;
                                    this.field50 = -this.field50;
                                    if (--this.field40 == 0) {
                                        break label134;
                                    }
                                }
                                do {
                                    var9 = this.method38(arg0, var9, var6, var10, var4.field1947[this.field53 - 1]);
                                    if (this.field43 < var6) {
                                        return;
                                    }
                                    this.field43 = var6 + var6 - 1 - this.field43;
                                    this.field50 = -this.field50;
                                    if (--this.field40 == 0) {
                                        break;
                                    }
                                    var9 = this.method15(arg0, var9, var5, var10, var4.field1947[this.field46]);
                                    if (this.field43 >= var5) {
                                        return;
                                    }
                                    this.field43 = var5 + var5 - 1 - this.field43;
                                    this.field50 = -this.field50;
                                } while (--this.field40 != 0);
                            }
                        } else if (this.field50 < 0) {
                            while (true) {
                                var9 = this.method15(arg0, var9, var5, var10, var4.field1947[this.field53 - 1]);
                                if (this.field43 >= var5) {
                                    return;
                                }
                                int var12 = (var6 - 1 - this.field43) / var8;
                                if (var12 >= this.field40) {
                                    this.field43 += this.field40 * var8;
                                    this.field40 = 0;
                                    break;
                                }
                                this.field43 += var8 * var12;
                                this.field40 -= var12;
                            }
                        } else {
                            while (true) {
                                var9 = this.method38(arg0, var9, var6, var10, var4.field1947[this.field46]);
                                if (this.field43 < var6) {
                                    return;
                                }
                                int var13 = (this.field43 - var5) / var8;
                                if (var13 >= this.field40) {
                                    this.field43 -= this.field40 * var8;
                                    this.field40 = 0;
                                    break;
                                }
                                this.field43 -= var8 * var13;
                                this.field40 -= var13;
                            }
                        }
                    }
                    if (this.field50 < 0) {
                        this.method15(arg0, var9, 0, var10, 0);
                        if (this.field43 < 0) {
                            this.field43 = -1;
                            this.method33();
                            this.method540(-26669);
                            return;
                        }
                    } else {
                        this.method38(arg0, var9, var7, var10, 0);
                        if (this.field43 >= var7) {
                            this.field43 = var7;
                            this.method33();
                            this.method540(-26669);
                        }
                    }
                }
            } else {
                this.method27(arg2);
            }
        }
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "([IIIII)I")
    private final int method38(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        if (this.field41 > 0) {
            int var6 = this.field41 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field41 += arg1;
            if (this.field50 == 256 && (this.field43 & 255) == 0) {
                if (class106.field2447) {
                    arg1 = method43(0, ((class87) super.field1855).field1947, arg0, this.field43, arg1, this.field42, this.field52, this.field51, this.field44, this.field49, 0, var6, arg2, this);
                } else {
                    arg1 = method18(((class87) super.field1855).field1947, arg0, this.field43, arg1, this.field42, this.field51, this.field44, 0, var6, arg2, this);
                }
            } else if (class106.field2447) {
                arg1 = method26(0, 0, ((class87) super.field1855).field1947, arg0, this.field43, arg1, this.field42, this.field52, this.field51, this.field44, this.field49, 0, var6, arg2, this, this.field50, arg4);
            } else {
                arg1 = method24(0, 0, ((class87) super.field1855).field1947, arg0, this.field43, arg1, this.field42, this.field51, this.field44, 0, var6, arg2, this, this.field50, arg4);
            }
            this.field41 -= arg1;
            if (this.field41 != 0) {
                return arg1;
            }
            this.field52 = this.field47;
            if (this.field45 == Integer.MIN_VALUE) {
                this.field42 = 0;
                this.method540(-26669);
                return arg3;
            }
            this.field42 = this.field45;
        }
        if (this.field50 == 256 && (this.field43 & 255) == 0) {
            return class106.field2447 ? method31(0, ((class87) super.field1855).field1947, arg0, this.field43, arg1, this.method40(), this.method29(), 0, arg3, arg2, this) : method35(((class87) super.field1855).field1947, arg0, this.field43, arg1, this.field42, 0, arg3, arg2, this);
        } else {
            return class106.field2447 ? method23(0, 0, ((class87) super.field1855).field1947, arg0, this.field43, arg1, this.method40(), this.method29(), 0, arg3, arg2, this, this.field50, arg4) : method45(0, 0, ((class87) super.field1855).field1947, arg0, this.field43, arg1, this.field42, 0, arg3, arg2, this, this.field50, arg4);
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(II[B[IIIIIIILac;II)I")
    private static final int method39(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class4 arg10, int arg11, int arg12) {
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
        arg10.field43 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ac", name = "i", descriptor = "()I")
    private final int method40() {
        return this.field52 < 0 ? this.field42 : (int) ((double) this.field42 * Math.sqrt((double) (256 - this.field52) * 0.0078125D) + 0.5D);
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(I[B[IIIIIIIILac;)I")
    private static final int method41(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class4 arg10) {
        int var11 = arg3 >> 8;
        int var12 = arg9 >> 8;
        int var13 = arg5 << 8;
        int var14 = arg6 << 8;
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
        arg10.field43 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "()Lmc;")
    public final class83 method42() {
        return null;
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(I[B[IIIIIIIIIIILac;)I")
    private static final int method43(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class4 arg13) {
        int var14 = arg3 >> 8;
        int var15 = arg12 >> 8;
        int var16 = arg5 << 8;
        int var17 = arg6 << 8;
        int var18 = arg8 << 8;
        int var19 = arg9 << 8;
        int var20;
        if ((var20 = arg4 + var15 - var14) > arg11) {
            var20 = arg11;
        }
        int var21 = arg4 << 1;
        int var22 = var20 << 1;
        int var45 = var22 - 6;
        while (var21 < var45) {
            byte var24 = arg1[var14++];
            int var34 = var21++;
            arg2[var34] += var16 * var24 >> arg7;
            int var25 = var16 + var18;
            int var35 = var21++;
            arg2[var35] += var17 * var24 >> arg7;
            int var26 = var17 + var19;
            byte var27 = arg1[var14++];
            int var37 = var21++;
            arg2[var37] += var25 * var27 >> arg7;
            int var28 = var18 + var25;
            int var38 = var21++;
            arg2[var38] += var26 * var27 >> arg7;
            int var29 = var19 + var26;
            byte var30 = arg1[var14++];
            int var40 = var21++;
            arg2[var40] += var28 * var30 >> arg7;
            int var31 = var18 + var28;
            int var41 = var21++;
            arg2[var41] += var29 * var30 >> arg7;
            int var32 = var19 + var29;
            byte var33 = arg1[var14++];
            int var43 = var21++;
            arg2[var43] += var31 * var33 >> arg7;
            var16 = var18 + var31;
            int var44 = var21++;
            arg2[var44] += var32 * var33 >> arg7;
            var17 = var19 + var32;
        }
        var22 = var45 + 6;
        while (var21 < var22) {
            byte var23 = arg1[var14++];
            int var10001 = var21++;
            arg2[var10001] += var16 * var23 >> arg7;
            var16 += var18;
            int var46 = var21++;
            arg2[var46] += var17 * var23 >> arg7;
            var17 += var19;
        }
        arg13.field42 = var16 >> 8;
        arg13.field52 = var17 >> 8;
        arg13.field43 = var14 << 8;
        return var21 >> 1;
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(II[B[IIIIIIIILac;II)I")
    private static final int method44(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class4 arg11, int arg12, int arg13) {
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
            arg3[var10001] += arg6 * var23;
            int var24 = var15++;
            arg3[var24] += arg7 * var23;
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
            arg3[var10001] += arg6 * var20;
            var10001 = var15++;
            arg3[var10001] += arg7 * var20;
            arg4 += arg12;
        }
        arg11.field43 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(II[B[IIIIIIILac;II)I")
    private static final int method45(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class4 arg10, int arg11, int arg12) {
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
        arg10.field43 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(II[B[IIIIIIIIILac;II)I")
    private static final int method46(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class4 arg12, int arg13, int arg14) {
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
        arg12.field42 = arg6;
        arg12.field43 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lna;II)Lac;")
    public static final class4 method47(class87 arg0, int arg1, int arg2) {
        return arg0.field1947 != null && arg0.field1947.length != 0 ? new class4(arg0, (int) ((long) arg0.field1948 * 256L * (long) arg1 / (long) (class52.field1106 * 100)), arg2) : null;
    }

    @OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(Lna;II)V")
    private class4(class87 arg0, int arg1, int arg2) {
        super.field1855 = arg0;
        this.field46 = arg0.field1949;
        this.field53 = arg0.field1946;
        this.field48 = arg0.field1950;
        this.field50 = arg1;
        this.field42 = arg2;
        this.field52 = 128;
        this.field43 = 0;
    }
}
