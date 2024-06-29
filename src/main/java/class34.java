import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class34 extends class75 {

    @OriginalMember(owner = "client!ee", name = "N", descriptor = "I")
    private int field1005;

    @OriginalMember(owner = "client!ee", name = "Y", descriptor = "I")
    private int field1015;

    @OriginalMember(owner = "client!ee", name = "W", descriptor = "Z")
    private boolean field1013;

    @OriginalMember(owner = "client!ee", name = "U", descriptor = "I")
    private int field1011;

    @OriginalMember(owner = "client!ee", name = "X", descriptor = "I")
    private int field1014;

    @OriginalMember(owner = "client!ee", name = "M", descriptor = "I")
    private int field1004;

    @OriginalMember(owner = "client!ee", name = "S", descriptor = "I")
    private int field1009;

    @OriginalMember(owner = "client!ee", name = "K", descriptor = "I")
    private int field1002;

    @OriginalMember(owner = "client!ee", name = "L", descriptor = "I")
    private int field1003;

    @OriginalMember(owner = "client!ee", name = "P", descriptor = "I")
    private int field1006;

    @OriginalMember(owner = "client!ee", name = "Q", descriptor = "I")
    private int field1007;

    @OriginalMember(owner = "client!ee", name = "R", descriptor = "I")
    private int field1008;

    @OriginalMember(owner = "client!ee", name = "T", descriptor = "I")
    private int field1010;

    @OriginalMember(owner = "client!ee", name = "V", descriptor = "I")
    private int field1012;

    @OriginalMember(owner = "client!ee", name = "Z", descriptor = "I")
    private int field1016;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(II)V")
    public final synchronized void method392(int arg0, int arg1) {
        this.method411(arg0, arg1, this.method414());
    }

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "(I)V")
    public final synchronized void method393(int arg0) {
        this.method426(arg0 << 6, this.method414());
    }

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "()I")
    public final int method394() {
        return this.field1014 == 0 && this.field1010 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "(I)V")
    public final synchronized void method395(int arg0) {
        int var2 = ((class126) super.field2077).field3022.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1009 = arg0;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(II[B[IIIIIIIIIILee;II)I")
    private static final int method396(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class34 arg13, int arg14, int arg15) {
        arg13.field1006 += (arg11 - arg5) * arg13.field1008;
        int var16;
        if (arg14 == 0 || (var16 = (arg12 - arg4 + arg14 - 257) / arg14 + arg5) > arg11) {
            var16 = arg11;
        }
        int var17 = arg5 << 1;
        int var18 = var16 << 1;
        int var10001;
        while (var17 < var18) {
            int var24 = arg4 >> 8;
            byte var25 = arg2[var24];
            int var26 = (var25 << 8) + (arg4 & 255) * (arg2[var24 + 1] - var25);
            var10001 = var17++;
            arg3[var10001] += arg6 * var26 >> 6;
            arg6 += arg8;
            int var27 = var17++;
            arg3[var27] += arg7 * var26 >> 6;
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
            byte var22 = arg2[arg4 >> 8];
            int var23 = (var22 << 8) + (arg4 & 255) * (var21 - var22);
            var10001 = var17++;
            arg3[var10001] += arg6 * var23 >> 6;
            arg6 += arg8;
            var10001 = var17++;
            arg3[var10001] += arg7 * var23 >> 6;
            arg7 += arg9;
            arg4 += arg14;
        }
        arg13.field1016 = arg6;
        arg13.field1002 = arg7;
        arg13.field1009 = arg4;
        return var17 >> 1;
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "()I")
    public final int method397() {
        int var1 = this.field1006 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1003 == 0) {
            var2 -= this.field1009 * var2 / (((class126) super.field2077).field3022.length << 8);
        } else if (this.field1003 >= 0) {
            var2 -= this.field1005 * var2 / ((class126) super.field2077).field3022.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(II)I")
    private static final int method398(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(I[B[IIIIIIIIIILee;)I")
    private static final int method399(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class34 arg12) {
        arg12.field1006 += (arg10 - arg4) * arg12.field1008;
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
        arg12.field1016 = var15 >> 2;
        arg12.field1002 = var16 >> 2;
        arg12.field1009 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(I[B[IIIIIIIILee;)I")
    private static final int method400(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class34 arg10) {
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
        arg10.field1009 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(II[B[IIIIIIIILee;II)I")
    private static final int method401(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class34 arg11, int arg12, int arg13) {
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
        arg11.field1009 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "()Lkf;")
    public final class75 method402() {
        return null;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "([IIIII)I")
    private final int method403(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        if (this.field1010 > 0) {
            int var6 = this.field1010 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field1010 += arg1;
            if (this.field1011 == 256 && (this.field1009 & 255) == 0) {
                if (class59.field1633) {
                    arg1 = method429(0, ((class126) super.field2077).field3022, arg0, this.field1009, arg1, this.field1016, this.field1002, this.field1012, this.field1007, 0, var6, arg2, this);
                } else {
                    arg1 = method421(((class126) super.field2077).field3022, arg0, this.field1009, arg1, this.field1006, this.field1008, 0, var6, arg2, this);
                }
            } else if (class59.field1633) {
                arg1 = method396(0, 0, ((class126) super.field2077).field3022, arg0, this.field1009, arg1, this.field1016, this.field1002, this.field1012, this.field1007, 0, var6, arg2, this, this.field1011, arg4);
            } else {
                arg1 = method416(0, 0, ((class126) super.field2077).field3022, arg0, this.field1009, arg1, this.field1006, this.field1008, 0, var6, arg2, this, this.field1011, arg4);
            }
            this.field1010 -= arg1;
            if (this.field1010 != 0) {
                return arg1;
            }
            if (this.field1014 == Integer.MIN_VALUE) {
                this.field1014 = 0;
                this.field1006 = this.field1016 = this.field1002 = 0;
                this.method691(0);
                return arg3;
            }
            this.method409();
        }
        if (this.field1011 == 256 && (this.field1009 & 255) == 0) {
            return class59.field1633 ? method408(0, ((class126) super.field2077).field3022, arg0, this.field1009, arg1, this.field1016, this.field1002, 0, arg3, arg2, this) : method407(((class126) super.field2077).field3022, arg0, this.field1009, arg1, this.field1006, 0, arg3, arg2, this);
        } else {
            return class59.field1633 ? method401(0, 0, ((class126) super.field2077).field3022, arg0, this.field1009, arg1, this.field1016, this.field1002, 0, arg3, arg2, this, this.field1011, arg4) : method431(0, 0, ((class126) super.field2077).field3022, arg0, this.field1009, arg1, this.field1006, 0, arg3, arg2, this, this.field1011, arg4);
        }
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "([III)V")
    public final synchronized void method404(int[] arg0, int arg1, int arg2) {
        if (this.field1014 == 0 && this.field1010 == 0) {
            this.method418(arg2);
        } else {
            class126 var4 = (class126) super.field2077;
            int var5 = this.field1005 << 8;
            int var6 = this.field1015 << 8;
            int var7 = var4.field3022.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field1003 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field1009 < 0) {
                if (this.field1011 <= 0) {
                    this.method422();
                    this.method691(0);
                    return;
                }
                this.field1009 = 0;
            }
            if (this.field1009 >= var7) {
                if (this.field1011 >= 0) {
                    this.method422();
                    this.method691(0);
                    return;
                }
                this.field1009 = var7 - 1;
            }
            if (this.field1003 < 0) {
                if (this.field1013) {
                    if (this.field1011 < 0) {
                        var9 = this.method413(arg0, arg1, var5, var10, var4.field3022[this.field1005]);
                        if (this.field1009 >= var5) {
                            return;
                        }
                        this.field1009 = var5 + var5 - 1 - this.field1009;
                        this.field1011 = -this.field1011;
                    }
                    while (true) {
                        int var11 = this.method403(arg0, var9, var6, var10, var4.field3022[this.field1015 - 1]);
                        if (this.field1009 < var6) {
                            return;
                        }
                        this.field1009 = var6 + var6 - 1 - this.field1009;
                        this.field1011 = -this.field1011;
                        var9 = this.method413(arg0, var11, var5, var10, var4.field3022[this.field1005]);
                        if (this.field1009 >= var5) {
                            return;
                        }
                        this.field1009 = var5 + var5 - 1 - this.field1009;
                        this.field1011 = -this.field1011;
                    }
                } else if (this.field1011 < 0) {
                    while (true) {
                        var9 = this.method413(arg0, var9, var5, var10, var4.field3022[this.field1015 - 1]);
                        if (this.field1009 >= var5) {
                            return;
                        }
                        this.field1009 = var6 - 1 - (var6 - 1 - this.field1009) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method403(arg0, var9, var6, var10, var4.field3022[this.field1005]);
                        if (this.field1009 < var6) {
                            return;
                        }
                        this.field1009 = (this.field1009 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field1003 > 0) {
                    if (this.field1013) {
                        label130: {
                            if (this.field1011 < 0) {
                                var9 = this.method413(arg0, arg1, var5, var10, var4.field3022[this.field1005]);
                                if (this.field1009 >= var5) {
                                    return;
                                }
                                this.field1009 = var5 + var5 - 1 - this.field1009;
                                this.field1011 = -this.field1011;
                                if (--this.field1003 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method403(arg0, var9, var6, var10, var4.field3022[this.field1015 - 1]);
                                if (this.field1009 < var6) {
                                    return;
                                }
                                this.field1009 = var6 + var6 - 1 - this.field1009;
                                this.field1011 = -this.field1011;
                                if (--this.field1003 == 0) {
                                    break;
                                }
                                var9 = this.method413(arg0, var9, var5, var10, var4.field3022[this.field1005]);
                                if (this.field1009 >= var5) {
                                    return;
                                }
                                this.field1009 = var5 + var5 - 1 - this.field1009;
                                this.field1011 = -this.field1011;
                            } while (--this.field1003 != 0);
                        }
                    } else if (this.field1011 < 0) {
                        while (true) {
                            var9 = this.method413(arg0, var9, var5, var10, var4.field3022[this.field1015 - 1]);
                            if (this.field1009 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field1009) / var8;
                            if (var12 >= this.field1003) {
                                this.field1009 += this.field1003 * var8;
                                this.field1003 = 0;
                                break;
                            }
                            this.field1009 += var8 * var12;
                            this.field1003 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method403(arg0, var9, var6, var10, var4.field3022[this.field1005]);
                            if (this.field1009 < var6) {
                                return;
                            }
                            int var13 = (this.field1009 - var5) / var8;
                            if (var13 >= this.field1003) {
                                this.field1009 -= this.field1003 * var8;
                                this.field1003 = 0;
                                break;
                            }
                            this.field1009 -= var8 * var13;
                            this.field1003 -= var13;
                        }
                    }
                }
                if (this.field1011 < 0) {
                    this.method413(arg0, var9, 0, var10, 0);
                    if (this.field1009 < 0) {
                        this.field1009 = -1;
                        this.method422();
                        this.method691(0);
                        return;
                    }
                } else {
                    this.method403(arg0, var9, var7, var10, 0);
                    if (this.field1009 >= var7) {
                        this.field1009 = var7;
                        this.method422();
                        this.method691(0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(II[B[IIIIIIILee;II)I")
    private static final int method405(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class34 arg10, int arg11, int arg12) {
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
        arg10.field1009 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "([B[IIIIIIILee;)I")
    private static final int method406(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class34 arg8) {
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
        arg8.field1009 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "([B[IIIIIIILee;)I")
    private static final int method407(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class34 arg8) {
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
        arg8.field1009 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(I[B[IIIIIIIILee;)I")
    private static final int method408(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class34 arg10) {
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
        arg10.field1009 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "()V")
    private final void method409() {
        this.field1006 = this.field1014;
        this.field1016 = method398(this.field1014, this.field1004);
        this.field1002 = method412(this.field1014, this.field1004);
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lta;II)Lee;")
    public static final class34 method410(class126 arg0, int arg1, int arg2) {
        return arg0.field3022 != null && arg0.field3022.length != 0 ? new class34(arg0, (int) ((long) arg0.field3019 * 256L * (long) arg1 / (long) (class85.field2224 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(III)V")
    public final synchronized void method411(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method426(arg1, arg2);
        } else {
            int var4 = method398(arg1, arg2);
            int var5 = method412(arg1, arg2);
            if (this.field1016 == var4 && this.field1002 == var5) {
                this.field1010 = 0;
            } else {
                this.field1010 = arg0;
                this.field1014 = arg1;
                this.field1004 = arg2;
                this.field1008 = (arg1 - this.field1006) / arg0;
                this.field1012 = (var4 - this.field1016) / arg0;
                this.field1007 = (var5 - this.field1002) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "(II)I")
    private static final int method412(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "([IIIII)I")
    private final int method413(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        if (this.field1010 > 0) {
            int var6 = this.field1010 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field1010 += arg1;
            if (this.field1011 == -256 && (this.field1009 & 255) == 0) {
                if (class59.field1633) {
                    arg1 = method399(0, ((class126) super.field2077).field3022, arg0, this.field1009, arg1, this.field1016, this.field1002, this.field1012, this.field1007, 0, var6, arg2, this);
                } else {
                    arg1 = method435(((class126) super.field2077).field3022, arg0, this.field1009, arg1, this.field1006, this.field1008, 0, var6, arg2, this);
                }
            } else if (class59.field1633) {
                arg1 = method420(0, 0, ((class126) super.field2077).field3022, arg0, this.field1009, arg1, this.field1016, this.field1002, this.field1012, this.field1007, 0, var6, arg2, this, this.field1011, arg4);
            } else {
                arg1 = method415(0, 0, ((class126) super.field2077).field3022, arg0, this.field1009, arg1, this.field1006, this.field1008, 0, var6, arg2, this, this.field1011, arg4);
            }
            this.field1010 -= arg1;
            if (this.field1010 != 0) {
                return arg1;
            }
            if (this.field1014 == Integer.MIN_VALUE) {
                this.field1014 = 0;
                this.field1006 = this.field1016 = this.field1002 = 0;
                this.method691(0);
                return arg3;
            }
            this.method409();
        }
        if (this.field1011 == -256 && (this.field1009 & 255) == 0) {
            return class59.field1633 ? method400(0, ((class126) super.field2077).field3022, arg0, this.field1009, arg1, this.field1016, this.field1002, 0, arg3, arg2, this) : method406(((class126) super.field2077).field3022, arg0, this.field1009, arg1, this.field1006, 0, arg3, arg2, this);
        } else {
            return class59.field1633 ? method433(0, 0, ((class126) super.field2077).field3022, arg0, this.field1009, arg1, this.field1016, this.field1002, 0, arg3, arg2, this, this.field1011, arg4) : method405(0, 0, ((class126) super.field2077).field3022, arg0, this.field1009, arg1, this.field1006, 0, arg3, arg2, this, this.field1011, arg4);
        }
    }

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "()I")
    public final synchronized int method414() {
        return this.field1004 < 0 ? -1 : this.field1004;
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(II[B[IIIIIIIILee;II)I")
    private static final int method415(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class34 arg11, int arg12, int arg13) {
        arg11.field1016 += (arg9 - arg5) * arg11.field1012;
        arg11.field1002 += (arg9 - arg5) * arg11.field1007;
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
        arg11.field1006 = arg6;
        arg11.field1009 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "(II[B[IIIIIIIILee;II)I")
    private static final int method416(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class34 arg11, int arg12, int arg13) {
        arg11.field1016 += (arg9 - arg5) * arg11.field1012;
        arg11.field1002 += (arg9 - arg5) * arg11.field1007;
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
        arg11.field1006 = arg6;
        arg11.field1009 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "()Z")
    public final boolean method417() {
        return this.field1009 < 0 || this.field1009 >= ((class126) super.field2077).field3022.length << 8;
    }

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "(I)V")
    public final synchronized void method418(int arg0) {
        if (this.field1010 > 0) {
            if (arg0 >= this.field1010) {
                if (this.field1014 == Integer.MIN_VALUE) {
                    this.field1014 = 0;
                    this.field1006 = this.field1016 = this.field1002 = 0;
                    this.method691(0);
                    arg0 = this.field1010;
                }
                this.field1010 = 0;
                this.method409();
            } else {
                this.field1006 += this.field1008 * arg0;
                this.field1016 += this.field1012 * arg0;
                this.field1002 += this.field1007 * arg0;
                this.field1010 -= arg0;
            }
        }
        class126 var2 = (class126) super.field2077;
        int var3 = this.field1005 << 8;
        int var4 = this.field1015 << 8;
        int var5 = var2.field3022.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1003 = 0;
        }
        if (this.field1009 < 0) {
            if (this.field1011 <= 0) {
                this.method422();
                this.method691(0);
                return;
            }
            this.field1009 = 0;
        }
        if (this.field1009 >= var5) {
            if (this.field1011 >= 0) {
                this.method422();
                this.method691(0);
                return;
            }
            this.field1009 = var5 - 1;
        }
        this.field1009 += this.field1011 * arg0;
        if (this.field1003 < 0) {
            if (!this.field1013) {
                if (this.field1011 < 0) {
                    if (this.field1009 < var3) {
                        this.field1009 = var4 - 1 - (var4 - 1 - this.field1009) % var6;
                    }
                } else if (this.field1009 >= var4) {
                    this.field1009 = (this.field1009 - var3) % var6 + var3;
                }
            } else {
                if (this.field1011 < 0) {
                    if (this.field1009 >= var3) {
                        return;
                    }
                    this.field1009 = var3 + var3 - 1 - this.field1009;
                    this.field1011 = -this.field1011;
                }
                while (this.field1009 >= var4) {
                    this.field1009 = var4 + var4 - 1 - this.field1009;
                    this.field1011 = -this.field1011;
                    if (this.field1009 >= var3) {
                        return;
                    }
                    this.field1009 = var3 + var3 - 1 - this.field1009;
                    this.field1011 = -this.field1011;
                }
            }
        } else {
            if (this.field1003 > 0) {
                if (this.field1013) {
                    label125: {
                        if (this.field1011 < 0) {
                            if (this.field1009 >= var3) {
                                return;
                            }
                            this.field1009 = var3 + var3 - 1 - this.field1009;
                            this.field1011 = -this.field1011;
                            if (--this.field1003 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field1009 < var4) {
                                return;
                            }
                            this.field1009 = var4 + var4 - 1 - this.field1009;
                            this.field1011 = -this.field1011;
                            if (--this.field1003 == 0) {
                                break;
                            }
                            if (this.field1009 >= var3) {
                                return;
                            }
                            this.field1009 = var3 + var3 - 1 - this.field1009;
                            this.field1011 = -this.field1011;
                        } while (--this.field1003 != 0);
                    }
                } else if (this.field1011 < 0) {
                    if (this.field1009 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field1009) / var6;
                    if (var7 < this.field1003) {
                        this.field1009 += var6 * var7;
                        this.field1003 -= var7;
                        return;
                    }
                    this.field1009 += this.field1003 * var6;
                    this.field1003 = 0;
                } else {
                    if (this.field1009 < var4) {
                        return;
                    }
                    int var8 = (this.field1009 - var3) / var6;
                    if (var8 < this.field1003) {
                        this.field1009 -= var6 * var8;
                        this.field1003 -= var8;
                        return;
                    }
                    this.field1009 -= this.field1003 * var6;
                    this.field1003 = 0;
                }
            }
            if (this.field1011 < 0) {
                if (this.field1009 < 0) {
                    this.field1009 = -1;
                    this.method422();
                    this.method691(0);
                    return;
                }
            } else if (this.field1009 >= var5) {
                this.field1009 = var5;
                this.method422();
                this.method691(0);
            }
        }
    }

    @OriginalMember(owner = "client!ee", name = "h", descriptor = "()I")
    public final synchronized int method419() {
        return this.field1014 == Integer.MIN_VALUE ? 0 : this.field1014;
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(II[B[IIIIIIIIIILee;II)I")
    private static final int method420(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class34 arg13, int arg14, int arg15) {
        arg13.field1006 += (arg11 - arg5) * arg13.field1008;
        int var16;
        if (arg14 == 0 || (var16 = (arg12 + 256 - arg4 + arg14) / arg14 + arg5) > arg11) {
            var16 = arg11;
        }
        int var17 = arg5 << 1;
        int var18 = var16 << 1;
        int var10001;
        while (var17 < var18) {
            int var23 = arg4 >> 8;
            byte var24 = arg2[var23 - 1];
            int var25 = (var24 << 8) + (arg4 & 255) * (arg2[var23] - var24);
            var10001 = var17++;
            arg3[var10001] += arg6 * var25 >> 6;
            arg6 += arg8;
            int var26 = var17++;
            arg3[var26] += arg7 * var25 >> 6;
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
            int var22 = (var21 << 8) + (arg4 & 255) * (arg2[arg4 >> 8] - var21);
            var10001 = var17++;
            arg3[var10001] += arg6 * var22 >> 6;
            arg6 += arg8;
            var10001 = var17++;
            arg3[var10001] += arg7 * var22 >> 6;
            arg7 += arg9;
            arg4 += arg14;
        }
        arg13.field1016 = arg6;
        arg13.field1002 = arg7;
        arg13.field1009 = arg4;
        return var17 >> 1;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "([B[IIIIIIIILee;)I")
    private static final int method421(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class34 arg9) {
        arg9.field1016 += (arg7 - arg3) * arg9.field1012;
        arg9.field1002 += (arg7 - arg3) * arg9.field1007;
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
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
        arg9.field1006 = var12 >> 2;
        arg9.field1009 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ee", name = "i", descriptor = "()V")
    private final void method422() {
        if (this.field1010 != 0) {
            if (this.field1014 == Integer.MIN_VALUE) {
                this.field1014 = 0;
            }
            this.field1010 = 0;
            this.method409();
        }
    }

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "(I)V")
    public final synchronized void method423(int arg0) {
        this.field1003 = arg0;
    }

    @OriginalMember(owner = "client!ee", name = "j", descriptor = "()Z")
    public final boolean method424() {
        return this.field1010 != 0;
    }

    @OriginalMember(owner = "client!ee", name = "h", descriptor = "(I)V")
    public final synchronized void method425(int arg0) {
        if (this.field1011 < 0) {
            this.field1011 = -arg0;
        } else {
            this.field1011 = arg0;
        }
    }

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "(II)V")
    private final synchronized void method426(int arg0, int arg1) {
        this.field1014 = arg0;
        this.field1004 = arg1;
        this.field1010 = 0;
        this.method409();
    }

    @OriginalMember(owner = "client!ee", name = "i", descriptor = "(I)V")
    private final synchronized void method427(int arg0) {
        this.method426(arg0, this.method414());
    }

    @OriginalMember(owner = "client!ee", name = "k", descriptor = "()I")
    public final synchronized int method428() {
        return this.field1011 < 0 ? -this.field1011 : this.field1011;
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(I[B[IIIIIIIIIILee;)I")
    private static final int method429(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class34 arg12) {
        arg12.field1006 += (arg10 - arg4) * arg12.field1008;
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
        arg12.field1016 = var15 >> 2;
        arg12.field1002 = var16 >> 2;
        arg12.field1009 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!ee", name = "j", descriptor = "(I)V")
    public final synchronized void method430(int arg0) {
        if (arg0 == 0) {
            this.method427(0);
            this.method691(0);
        } else if (this.field1016 == 0 && this.field1002 == 0) {
            this.field1010 = 0;
            this.field1014 = 0;
            this.field1006 = 0;
            this.method691(0);
        } else {
            this.field1010 = arg0;
            this.field1014 = Integer.MIN_VALUE;
            this.field1008 = -this.field1006 / arg0;
            this.field1012 = -this.field1016 / arg0;
            this.field1007 = -this.field1002 / arg0;
        }
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(II[B[IIIIIIILee;II)I")
    private static final int method431(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class34 arg10, int arg11, int arg12) {
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
        arg10.field1009 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(Lta;II)V")
    private class34(class126 arg0, int arg1, int arg2) {
        super.field2077 = arg0;
        this.field1005 = arg0.field3020;
        this.field1015 = arg0.field3023;
        this.field1013 = arg0.field3021;
        this.field1011 = arg1;
        this.field1014 = arg2;
        this.field1004 = 8192;
        this.field1009 = 0;
        this.method409();
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lta;III)Lee;")
    public static final class34 method432(class126 arg0, int arg1, int arg2, int arg3) {
        return arg0.field3022 != null && arg0.field3022.length != 0 ? new class34(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "(II[B[IIIIIIIILee;II)I")
    private static final int method433(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class34 arg11, int arg12, int arg13) {
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
        arg11.field1009 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(Lta;III)V")
    private class34(class126 arg0, int arg1, int arg2, int arg3) {
        super.field2077 = arg0;
        this.field1005 = arg0.field3020;
        this.field1015 = arg0.field3023;
        this.field1013 = arg0.field3021;
        this.field1011 = arg1;
        this.field1014 = arg2;
        this.field1004 = arg3;
        this.field1009 = 0;
        this.method409();
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(Z)V")
    public final synchronized void method434(boolean arg0) {
        this.field1011 = (this.field1011 >>> 31) + (this.field1011 ^ this.field1011 >> 31);
        if (arg0) {
            this.field1011 = -this.field1011;
        }
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "([B[IIIIIIIILee;)I")
    private static final int method435(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class34 arg9) {
        arg9.field1016 += (arg7 - arg3) * arg9.field1012;
        arg9.field1002 += (arg7 - arg3) * arg9.field1007;
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
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
        arg9.field1006 = var12 >> 2;
        arg9.field1009 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "()Lkf;")
    public final class75 method436() {
        return null;
    }
}
