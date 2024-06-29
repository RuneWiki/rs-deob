import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class44 extends class173 {

    @OriginalMember(owner = "client!ef", name = "x", descriptor = "I")
    private int field792;

    @OriginalMember(owner = "client!ef", name = "y", descriptor = "I")
    private int field793;

    @OriginalMember(owner = "client!ef", name = "J", descriptor = "Z")
    private boolean field804;

    @OriginalMember(owner = "client!ef", name = "I", descriptor = "I")
    private int field803;

    @OriginalMember(owner = "client!ef", name = "C", descriptor = "I")
    private int field797;

    @OriginalMember(owner = "client!ef", name = "F", descriptor = "I")
    private int field800;

    @OriginalMember(owner = "client!ef", name = "G", descriptor = "I")
    private int field801;

    @OriginalMember(owner = "client!ef", name = "v", descriptor = "I")
    private int field790;

    @OriginalMember(owner = "client!ef", name = "w", descriptor = "I")
    private int field791;

    @OriginalMember(owner = "client!ef", name = "z", descriptor = "I")
    private int field794;

    @OriginalMember(owner = "client!ef", name = "A", descriptor = "I")
    private int field795;

    @OriginalMember(owner = "client!ef", name = "B", descriptor = "I")
    private int field796;

    @OriginalMember(owner = "client!ef", name = "D", descriptor = "I")
    private int field798;

    @OriginalMember(owner = "client!ef", name = "E", descriptor = "I")
    private int field799;

    @OriginalMember(owner = "client!ef", name = "H", descriptor = "I")
    private int field802;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(I[B[IIIIIIIIIILef;)I")
    private static final int method297(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class44 arg12) {
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
        arg12.field802 += (var19 - arg4) * arg12.field794;
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
        arg12.field791 = var15 >> 2;
        arg12.field790 = var16 >> 2;
        arg12.field801 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lbb;III)Lef;")
    public static final class44 method298(class13 arg0, int arg1, int arg2, int arg3) {
        return arg0.field242 != null && arg0.field242.length != 0 ? new class44(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "(I)V")
    public final synchronized void method299(int arg0) {
        int var2 = ((class13) super.field3301).field242.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field801 = arg0;
    }

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "()V")
    private final void method300() {
        this.field802 = this.field797;
        this.field791 = method307(this.field797, this.field800);
        this.field790 = method331(this.field797, this.field800);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(III)V")
    public final synchronized void method301(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method317(arg1, arg2);
        } else {
            int var4 = method307(arg1, arg2);
            int var5 = method331(arg1, arg2);
            if (this.field791 == var4 && this.field790 == var5) {
                this.field798 = 0;
            } else {
                int var6 = arg1 - this.field802;
                if (this.field802 - arg1 > var6) {
                    var6 = this.field802 - arg1;
                }
                if (var4 - this.field791 > var6) {
                    var6 = var4 - this.field791;
                }
                if (this.field791 - var4 > var6) {
                    var6 = this.field791 - var4;
                }
                if (var5 - this.field790 > var6) {
                    var6 = var5 - this.field790;
                }
                if (this.field790 - var5 > var6) {
                    var6 = this.field790 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field798 = arg0;
                this.field797 = arg1;
                this.field800 = arg2;
                this.field794 = (arg1 - this.field802) / arg0;
                this.field796 = (var4 - this.field791) / arg0;
                this.field795 = (var5 - this.field790) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "([B[IIIIIIILef;)I")
    private static final int method302(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class44 arg8) {
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
        arg8.field801 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "([B[IIIIIIIILef;)I")
    private static final int method303(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class44 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field791 += (var14 - arg3) * arg9.field796;
        arg9.field790 += (var14 - arg3) * arg9.field795;
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
        arg9.field802 = var12 >> 2;
        arg9.field801 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "()Ltb;")
    public final class173 method304() {
        return null;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "([IIIII)I")
    private final int method305(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field798 <= 0) {
                if (this.field803 == -256 && (this.field801 & 255) == 0) {
                    if (class139.field2713) {
                        return method318(0, ((class13) super.field3301).field242, arg0, this.field801, arg1, this.field791, this.field790, 0, arg3, arg2, this);
                    }
                    return method326(((class13) super.field3301).field242, arg0, this.field801, arg1, this.field802, 0, arg3, arg2, this);
                }
                if (class139.field2713) {
                    return method306(0, 0, ((class13) super.field3301).field242, arg0, this.field801, arg1, this.field791, this.field790, 0, arg3, arg2, this, this.field803, arg4);
                }
                return method319(0, 0, ((class13) super.field3301).field242, arg0, this.field801, arg1, this.field802, 0, arg3, arg2, this, this.field803, arg4);
            }
            int var6 = this.field798 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field798 += arg1;
            if (this.field803 == -256 && (this.field801 & 255) == 0) {
                if (class139.field2713) {
                    arg1 = method297(0, ((class13) super.field3301).field242, arg0, this.field801, arg1, this.field791, this.field790, this.field796, this.field795, 0, var6, arg2, this);
                } else {
                    arg1 = method303(((class13) super.field3301).field242, arg0, this.field801, arg1, this.field802, this.field794, 0, var6, arg2, this);
                }
            } else if (class139.field2713) {
                arg1 = method310(0, 0, ((class13) super.field3301).field242, arg0, this.field801, arg1, this.field791, this.field790, this.field796, this.field795, 0, var6, arg2, this, this.field803, arg4);
            } else {
                arg1 = method342(0, 0, ((class13) super.field3301).field242, arg0, this.field801, arg1, this.field802, this.field794, 0, var6, arg2, this, this.field803, arg4);
            }
            this.field798 -= arg1;
            if (this.field798 != 0) {
                return arg1;
            }
        } while (!this.method339());
        return arg3;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(II[B[IIIIIIIILef;II)I")
    private static final int method306(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class44 arg11, int arg12, int arg13) {
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
        arg11.field801 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(II)I")
    private static final int method307(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!ef", name = "f", descriptor = "(I)V")
    public final synchronized void method308(int arg0) {
        this.method317(arg0 << 6, this.method314());
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(II[B[IIIIIIIIIILef;II)I")
    private static final int method309(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class44 arg13, int arg14, int arg15) {
        arg13.field802 -= arg13.field794 * arg5;
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
        arg13.field802 += arg13.field794 * var22;
        arg13.field791 = arg6;
        arg13.field790 = arg7;
        arg13.field801 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(II[B[IIIIIIIIIILef;II)I")
    private static final int method310(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class44 arg13, int arg14, int arg15) {
        arg13.field802 -= arg13.field794 * arg5;
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
        arg13.field802 += arg13.field794 * var22;
        arg13.field791 = arg6;
        arg13.field790 = arg7;
        arg13.field801 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "([III)V")
    public final synchronized void method311(int[] arg0, int arg1, int arg2) {
        if (this.field797 == 0 && this.field798 == 0) {
            this.method327(arg2);
        } else {
            class13 var4 = (class13) super.field3301;
            int var5 = this.field792 << 8;
            int var6 = this.field793 << 8;
            int var7 = var4.field242.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field799 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field801 < 0) {
                if (this.field803 <= 0) {
                    this.method323();
                    this.method915(0);
                    return;
                }
                this.field801 = 0;
            }
            if (this.field801 >= var7) {
                if (this.field803 >= 0) {
                    this.method323();
                    this.method915(0);
                    return;
                }
                this.field801 = var7 - 1;
            }
            if (this.field799 < 0) {
                if (this.field804) {
                    if (this.field803 < 0) {
                        var9 = this.method305(arg0, arg1, var5, var10, var4.field242[this.field792]);
                        if (this.field801 >= var5) {
                            return;
                        }
                        this.field801 = var5 + var5 - 1 - this.field801;
                        this.field803 = -this.field803;
                    }
                    while (true) {
                        int var11 = this.method325(arg0, var9, var6, var10, var4.field242[this.field793 - 1]);
                        if (this.field801 < var6) {
                            return;
                        }
                        this.field801 = var6 + var6 - 1 - this.field801;
                        this.field803 = -this.field803;
                        var9 = this.method305(arg0, var11, var5, var10, var4.field242[this.field792]);
                        if (this.field801 >= var5) {
                            return;
                        }
                        this.field801 = var5 + var5 - 1 - this.field801;
                        this.field803 = -this.field803;
                    }
                } else if (this.field803 < 0) {
                    while (true) {
                        var9 = this.method305(arg0, var9, var5, var10, var4.field242[this.field793 - 1]);
                        if (this.field801 >= var5) {
                            return;
                        }
                        this.field801 = var6 - 1 - (var6 - 1 - this.field801) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method325(arg0, var9, var6, var10, var4.field242[this.field792]);
                        if (this.field801 < var6) {
                            return;
                        }
                        this.field801 = (this.field801 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field799 > 0) {
                    if (this.field804) {
                        label130: {
                            if (this.field803 < 0) {
                                var9 = this.method305(arg0, arg1, var5, var10, var4.field242[this.field792]);
                                if (this.field801 >= var5) {
                                    return;
                                }
                                this.field801 = var5 + var5 - 1 - this.field801;
                                this.field803 = -this.field803;
                                if (--this.field799 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method325(arg0, var9, var6, var10, var4.field242[this.field793 - 1]);
                                if (this.field801 < var6) {
                                    return;
                                }
                                this.field801 = var6 + var6 - 1 - this.field801;
                                this.field803 = -this.field803;
                                if (--this.field799 == 0) {
                                    break;
                                }
                                var9 = this.method305(arg0, var9, var5, var10, var4.field242[this.field792]);
                                if (this.field801 >= var5) {
                                    return;
                                }
                                this.field801 = var5 + var5 - 1 - this.field801;
                                this.field803 = -this.field803;
                            } while (--this.field799 != 0);
                        }
                    } else if (this.field803 < 0) {
                        while (true) {
                            var9 = this.method305(arg0, var9, var5, var10, var4.field242[this.field793 - 1]);
                            if (this.field801 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field801) / var8;
                            if (var12 >= this.field799) {
                                this.field801 += this.field799 * var8;
                                this.field799 = 0;
                                break;
                            }
                            this.field801 += var8 * var12;
                            this.field799 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method325(arg0, var9, var6, var10, var4.field242[this.field792]);
                            if (this.field801 < var6) {
                                return;
                            }
                            int var13 = (this.field801 - var5) / var8;
                            if (var13 >= this.field799) {
                                this.field801 -= this.field799 * var8;
                                this.field799 = 0;
                                break;
                            }
                            this.field801 -= var8 * var13;
                            this.field799 -= var13;
                        }
                    }
                }
                if (this.field803 < 0) {
                    this.method305(arg0, var9, 0, var10, 0);
                    if (this.field801 < 0) {
                        this.field801 = -1;
                        this.method323();
                        this.method915(0);
                        return;
                    }
                } else {
                    this.method325(arg0, var9, var7, var10, 0);
                    if (this.field801 >= var7) {
                        this.field801 = var7;
                        this.method323();
                        this.method915(0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "()Ltb;")
    public final class173 method312() {
        return null;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "()I")
    public final int method313() {
        return this.field797 == 0 && this.field798 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!ef", name = "f", descriptor = "()I")
    public final synchronized int method314() {
        return this.field800 < 0 ? -1 : this.field800;
    }

    @OriginalMember(owner = "client!ef", name = "g", descriptor = "(I)V")
    private final synchronized void method315(int arg0) {
        this.method317(arg0, this.method314());
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Z)V")
    public final synchronized void method316(boolean arg0) {
        this.field803 = (this.field803 >>> 31) + (this.field803 ^ this.field803 >> 31);
        if (arg0) {
            this.field803 = -this.field803;
        }
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(II)V")
    private final synchronized void method317(int arg0, int arg1) {
        this.field797 = arg0;
        this.field800 = arg1;
        this.field798 = 0;
        this.method300();
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(I[B[IIIIIIIILef;)I")
    private static final int method318(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class44 arg10) {
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
        arg10.field801 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(II[B[IIIIIIILef;II)I")
    private static final int method319(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class44 arg10, int arg11, int arg12) {
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
        arg10.field801 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ef", name = "g", descriptor = "()I")
    public final synchronized int method320() {
        return this.field797 == Integer.MIN_VALUE ? 0 : this.field797;
    }

    @OriginalMember(owner = "client!ef", name = "h", descriptor = "()I")
    public final synchronized int method321() {
        return this.field803 < 0 ? -this.field803 : this.field803;
    }

    @OriginalMember(owner = "client!ef", name = "h", descriptor = "(I)V")
    public final synchronized void method322(int arg0) {
        if (arg0 == 0) {
            this.method315(0);
            this.method915(0);
        } else if (this.field791 == 0 && this.field790 == 0) {
            this.field798 = 0;
            this.field797 = 0;
            this.field802 = 0;
            this.method915(0);
        } else {
            int var2 = -this.field802;
            if (this.field802 > var2) {
                var2 = this.field802;
            }
            if (-this.field791 > var2) {
                var2 = -this.field791;
            }
            if (this.field791 > var2) {
                var2 = this.field791;
            }
            if (-this.field790 > var2) {
                var2 = -this.field790;
            }
            if (this.field790 > var2) {
                var2 = this.field790;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field798 = arg0;
            this.field797 = Integer.MIN_VALUE;
            this.field794 = -this.field802 / arg0;
            this.field796 = -this.field791 / arg0;
            this.field795 = -this.field790 / arg0;
        }
    }

    @OriginalMember(owner = "client!ef", name = "i", descriptor = "()V")
    private final void method323() {
        if (this.field798 != 0) {
            if (this.field797 == Integer.MIN_VALUE) {
                this.field797 = 0;
            }
            this.field798 = 0;
            this.method300();
        }
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(II[B[IIIIIIILef;II)I")
    private static final int method324(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class44 arg10, int arg11, int arg12) {
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
        arg10.field801 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "([IIIII)I")
    private final int method325(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field798 <= 0) {
                if (this.field803 == 256 && (this.field801 & 255) == 0) {
                    if (class139.field2713) {
                        return method335(0, ((class13) super.field3301).field242, arg0, this.field801, arg1, this.field791, this.field790, 0, arg3, arg2, this);
                    }
                    return method302(((class13) super.field3301).field242, arg0, this.field801, arg1, this.field802, 0, arg3, arg2, this);
                }
                if (class139.field2713) {
                    return method338(0, 0, ((class13) super.field3301).field242, arg0, this.field801, arg1, this.field791, this.field790, 0, arg3, arg2, this, this.field803, arg4);
                }
                return method324(0, 0, ((class13) super.field3301).field242, arg0, this.field801, arg1, this.field802, 0, arg3, arg2, this, this.field803, arg4);
            }
            int var6 = this.field798 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field798 += arg1;
            if (this.field803 == 256 && (this.field801 & 255) == 0) {
                if (class139.field2713) {
                    arg1 = method333(0, ((class13) super.field3301).field242, arg0, this.field801, arg1, this.field791, this.field790, this.field796, this.field795, 0, var6, arg2, this);
                } else {
                    arg1 = method340(((class13) super.field3301).field242, arg0, this.field801, arg1, this.field802, this.field794, 0, var6, arg2, this);
                }
            } else if (class139.field2713) {
                arg1 = method309(0, 0, ((class13) super.field3301).field242, arg0, this.field801, arg1, this.field791, this.field790, this.field796, this.field795, 0, var6, arg2, this, this.field803, arg4);
            } else {
                arg1 = method341(0, 0, ((class13) super.field3301).field242, arg0, this.field801, arg1, this.field802, this.field794, 0, var6, arg2, this, this.field803, arg4);
            }
            this.field798 -= arg1;
            if (this.field798 != 0) {
                return arg1;
            }
        } while (!this.method339());
        return arg3;
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "([B[IIIIIIILef;)I")
    private static final int method326(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class44 arg8) {
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
        arg8.field801 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "(I)V")
    public final synchronized void method327(int arg0) {
        if (this.field798 > 0) {
            if (arg0 >= this.field798) {
                if (this.field797 == Integer.MIN_VALUE) {
                    this.field797 = 0;
                    this.field802 = this.field791 = this.field790 = 0;
                    this.method915(0);
                    arg0 = this.field798;
                }
                this.field798 = 0;
                this.method300();
            } else {
                this.field802 += this.field794 * arg0;
                this.field791 += this.field796 * arg0;
                this.field790 += this.field795 * arg0;
                this.field798 -= arg0;
            }
        }
        class13 var2 = (class13) super.field3301;
        int var3 = this.field792 << 8;
        int var4 = this.field793 << 8;
        int var5 = var2.field242.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field799 = 0;
        }
        if (this.field801 < 0) {
            if (this.field803 <= 0) {
                this.method323();
                this.method915(0);
                return;
            }
            this.field801 = 0;
        }
        if (this.field801 >= var5) {
            if (this.field803 >= 0) {
                this.method323();
                this.method915(0);
                return;
            }
            this.field801 = var5 - 1;
        }
        this.field801 += this.field803 * arg0;
        if (this.field799 < 0) {
            if (!this.field804) {
                if (this.field803 < 0) {
                    if (this.field801 < var3) {
                        this.field801 = var4 - 1 - (var4 - 1 - this.field801) % var6;
                    }
                } else if (this.field801 >= var4) {
                    this.field801 = (this.field801 - var3) % var6 + var3;
                }
            } else {
                if (this.field803 < 0) {
                    if (this.field801 >= var3) {
                        return;
                    }
                    this.field801 = var3 + var3 - 1 - this.field801;
                    this.field803 = -this.field803;
                }
                while (this.field801 >= var4) {
                    this.field801 = var4 + var4 - 1 - this.field801;
                    this.field803 = -this.field803;
                    if (this.field801 >= var3) {
                        return;
                    }
                    this.field801 = var3 + var3 - 1 - this.field801;
                    this.field803 = -this.field803;
                }
            }
        } else {
            if (this.field799 > 0) {
                if (this.field804) {
                    label125: {
                        if (this.field803 < 0) {
                            if (this.field801 >= var3) {
                                return;
                            }
                            this.field801 = var3 + var3 - 1 - this.field801;
                            this.field803 = -this.field803;
                            if (--this.field799 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field801 < var4) {
                                return;
                            }
                            this.field801 = var4 + var4 - 1 - this.field801;
                            this.field803 = -this.field803;
                            if (--this.field799 == 0) {
                                break;
                            }
                            if (this.field801 >= var3) {
                                return;
                            }
                            this.field801 = var3 + var3 - 1 - this.field801;
                            this.field803 = -this.field803;
                        } while (--this.field799 != 0);
                    }
                } else if (this.field803 < 0) {
                    if (this.field801 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field801) / var6;
                    if (var7 < this.field799) {
                        this.field801 += var6 * var7;
                        this.field799 -= var7;
                        return;
                    }
                    this.field801 += this.field799 * var6;
                    this.field799 = 0;
                } else {
                    if (this.field801 < var4) {
                        return;
                    }
                    int var8 = (this.field801 - var3) / var6;
                    if (var8 < this.field799) {
                        this.field801 -= var6 * var8;
                        this.field799 -= var8;
                        return;
                    }
                    this.field801 -= this.field799 * var6;
                    this.field799 = 0;
                }
            }
            if (this.field803 < 0) {
                if (this.field801 < 0) {
                    this.field801 = -1;
                    this.method323();
                    this.method915(0);
                    return;
                }
            } else if (this.field801 >= var5) {
                this.field801 = var5;
                this.method323();
                this.method915(0);
            }
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lbb;II)Lef;")
    public static final class44 method328(class13 arg0, int arg1, int arg2) {
        return arg0.field242 != null && arg0.field242.length != 0 ? new class44(arg0, (int) ((long) arg0.field241 * 256L * (long) arg1 / (long) (class161.field3075 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!ef", name = "i", descriptor = "(I)V")
    public final synchronized void method329(int arg0) {
        this.field799 = arg0;
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "()I")
    public final int method330() {
        int var1 = this.field802 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field799 == 0) {
            var2 -= this.field801 * var2 / (((class13) super.field3301).field242.length << 8);
        } else if (this.field799 >= 0) {
            var2 -= this.field792 * var2 / ((class13) super.field3301).field242.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "(II)I")
    private static final int method331(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!ef", name = "j", descriptor = "()Z")
    public final boolean method332() {
        return this.field798 != 0;
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(I[B[IIIIIIIIIILef;)I")
    private static final int method333(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class44 arg12) {
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
        arg12.field802 += (var19 - arg4) * arg12.field794;
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
        arg12.field791 = var15 >> 2;
        arg12.field790 = var16 >> 2;
        arg12.field801 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "(II)V")
    public final synchronized void method334(int arg0, int arg1) {
        this.method301(arg0, arg1, this.method314());
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(I[B[IIIIIIIILef;)I")
    private static final int method335(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class44 arg10) {
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
        arg10.field801 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!ef", name = "k", descriptor = "()Z")
    public final boolean method336() {
        return this.field801 < 0 || this.field801 >= ((class13) super.field3301).field242.length << 8;
    }

    @OriginalMember(owner = "client!ef", name = "j", descriptor = "(I)V")
    public final synchronized void method337(int arg0) {
        if (this.field803 < 0) {
            this.field803 = -arg0;
        } else {
            this.field803 = arg0;
        }
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(II[B[IIIIIIIILef;II)I")
    private static final int method338(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class44 arg11, int arg12, int arg13) {
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
        arg11.field801 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!ef", name = "l", descriptor = "()Z")
    private final boolean method339() {
        int var1 = this.field797;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method307(var1, this.field800);
            var2 = method331(var1, this.field800);
        }
        if (this.field802 == var1 && this.field791 == var3 && this.field790 == var2) {
            if (this.field797 == Integer.MIN_VALUE) {
                this.field797 = 0;
                this.field802 = this.field791 = this.field790 = 0;
                this.method915(0);
                return true;
            } else {
                this.method300();
                return false;
            }
        } else {
            if (this.field802 < var1) {
                this.field794 = 1;
                this.field798 = var1 - this.field802;
            } else if (this.field802 > var1) {
                this.field794 = -1;
                this.field798 = this.field802 - var1;
            } else {
                this.field794 = 0;
            }
            if (this.field791 < var3) {
                this.field796 = 1;
                if (this.field798 == 0 || this.field798 > var3 - this.field791) {
                    this.field798 = var3 - this.field791;
                }
            } else if (this.field791 > var3) {
                this.field796 = -1;
                if (this.field798 == 0 || this.field798 > this.field791 - var3) {
                    this.field798 = this.field791 - var3;
                }
            } else {
                this.field796 = 0;
            }
            if (this.field790 < var2) {
                this.field795 = 1;
                if (this.field798 == 0 || this.field798 > var2 - this.field790) {
                    this.field798 = var2 - this.field790;
                }
            } else if (this.field790 > var2) {
                this.field795 = -1;
                if (this.field798 == 0 || this.field798 > this.field790 - var2) {
                    this.field798 = this.field790 - var2;
                }
            } else {
                this.field795 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "([B[IIIIIIIILef;)I")
    private static final int method340(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class44 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field791 += (var14 - arg3) * arg9.field796;
        arg9.field790 += (var14 - arg3) * arg9.field795;
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
        arg9.field802 = var12 >> 2;
        arg9.field801 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "(II[B[IIIIIIIILef;II)I")
    private static final int method341(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class44 arg11, int arg12, int arg13) {
        arg11.field791 -= arg11.field796 * arg5;
        arg11.field790 -= arg11.field795 * arg5;
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
        arg11.field791 += arg11.field796 * arg5;
        arg11.field790 += arg11.field795 * arg5;
        arg11.field802 = arg6;
        arg11.field801 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(Lbb;II)V")
    private class44(class13 arg0, int arg1, int arg2) {
        super.field3301 = arg0;
        this.field792 = arg0.field244;
        this.field793 = arg0.field240;
        this.field804 = arg0.field243;
        this.field803 = arg1;
        this.field797 = arg2;
        this.field800 = 8192;
        this.field801 = 0;
        this.method300();
    }

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "(II[B[IIIIIIIILef;II)I")
    private static final int method342(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class44 arg11, int arg12, int arg13) {
        arg11.field791 -= arg11.field796 * arg5;
        arg11.field790 -= arg11.field795 * arg5;
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
        arg11.field791 += arg11.field796 * arg5;
        arg11.field790 += arg11.field795 * arg5;
        arg11.field802 = arg6;
        arg11.field801 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(Lbb;III)V")
    private class44(class13 arg0, int arg1, int arg2, int arg3) {
        super.field3301 = arg0;
        this.field792 = arg0.field244;
        this.field793 = arg0.field240;
        this.field804 = arg0.field243;
        this.field803 = arg1;
        this.field797 = arg2;
        this.field800 = arg3;
        this.field801 = 0;
        this.method300();
    }
}
