import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qga")
public class class169 extends class195 {

    @OriginalMember(owner = "client!qga", name = "A", descriptor = "I")
    private int field2848;

    @OriginalMember(owner = "client!qga", name = "z", descriptor = "I")
    private int field2847;

    @OriginalMember(owner = "client!qga", name = "G", descriptor = "Z")
    private boolean field2854;

    @OriginalMember(owner = "client!qga", name = "E", descriptor = "I")
    private int field2852;

    @OriginalMember(owner = "client!qga", name = "v", descriptor = "I")
    private int field2843;

    @OriginalMember(owner = "client!qga", name = "x", descriptor = "I")
    private int field2845;

    @OriginalMember(owner = "client!qga", name = "H", descriptor = "I")
    private int field2855;

    @OriginalMember(owner = "client!qga", name = "u", descriptor = "I")
    private int field2842;

    @OriginalMember(owner = "client!qga", name = "w", descriptor = "I")
    private int field2844;

    @OriginalMember(owner = "client!qga", name = "y", descriptor = "I")
    private int field2846;

    @OriginalMember(owner = "client!qga", name = "B", descriptor = "I")
    private int field2849;

    @OriginalMember(owner = "client!qga", name = "C", descriptor = "I")
    private int field2850;

    @OriginalMember(owner = "client!qga", name = "D", descriptor = "I")
    private int field2851;

    @OriginalMember(owner = "client!qga", name = "F", descriptor = "I")
    private int field2853;

    @OriginalMember(owner = "client!qga", name = "I", descriptor = "I")
    private int field2856;

    @OriginalMember(owner = "client!qga", name = "e", descriptor = "()V", line = 3)
    private final void method1360() {
        this.field2842 = this.field2843;
        this.field2844 = method1389(this.field2843, this.field2845);
        this.field2851 = method1368(this.field2843, this.field2845);
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(II[B[IIIIIIILqga;II)I", line = 8)
    private static final int method1361(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class169 arg10, int arg11, int arg12) {
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
        arg10.field2855 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!qga", name = "b", descriptor = "(I)V", line = 36)
    public final synchronized void method1362(int arg0) {
        this.method1377(arg0 << 6, this.method1380());
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "([B[IIIIIIILqga;)I", line = 39)
    private static final int method1363(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class169 arg8) {
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
        arg8.field2855 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!qga", name = "c", descriptor = "(I)V", line = 64)
    private final synchronized void method1364(int arg0) {
        this.method1377(arg0, this.method1380());
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(III)V", line = 67)
    public final synchronized void method1365(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1377(arg1, arg2);
        } else {
            int var4 = method1389(arg1, arg2);
            int var5 = method1368(arg1, arg2);
            if (this.field2844 == var4 && this.field2851 == var5) {
                this.field2849 = 0;
            } else {
                int var6 = arg1 - this.field2842;
                if (this.field2842 - arg1 > var6) {
                    var6 = this.field2842 - arg1;
                }
                if (var4 - this.field2844 > var6) {
                    var6 = var4 - this.field2844;
                }
                if (this.field2844 - var4 > var6) {
                    var6 = this.field2844 - var4;
                }
                if (var5 - this.field2851 > var6) {
                    var6 = var5 - this.field2851;
                }
                if (this.field2851 - var5 > var6) {
                    var6 = this.field2851 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field2849 = arg0;
                this.field2843 = arg1;
                this.field2845 = arg2;
                this.field2846 = (arg1 - this.field2842) / arg0;
                this.field2853 = (var4 - this.field2844) / arg0;
                this.field2850 = (var5 - this.field2851) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!qga", name = "d", descriptor = "()I", line = 116)
    public final int method1366() {
        int var1 = this.field2842 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field2856 == 0) {
            var2 -= this.field2855 * var2 / (((class59) super.field3225).field762.length << 8);
        } else if (this.field2856 >= 0) {
            var2 -= this.field2848 * var2 / ((class59) super.field3225).field762.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "()Leq;", line = 128)
    public final class195 method220() {
        return null;
    }

    @OriginalMember(owner = "client!qga", name = "f", descriptor = "()I", line = 132)
    public final synchronized int method1367() {
        return this.field2852 < 0 ? -this.field2852 : this.field2852;
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(II)I", line = 136)
    private static final int method1368(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "([B[IIIIIIIILqga;)I", line = 140)
    private static final int method1369(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class169 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field2844 += (var14 - arg3) * arg9.field2853;
        arg9.field2851 += (var14 - arg3) * arg9.field2850;
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
        arg9.field2842 = var12 >> 2;
        arg9.field2855 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!qga", name = "g", descriptor = "(I)V", line = 178)
    public final synchronized void method1370(int arg0) {
        if (this.field2852 < 0) {
            this.field2852 = -arg0;
        } else {
            this.field2852 = arg0;
        }
    }

    @OriginalMember(owner = "client!qga", name = "b", descriptor = "([III)V", line = 185)
    public final synchronized void method240(int[] arg0, int arg1, int arg2) {
        if (this.field2843 == 0 && this.field2849 == 0) {
            this.method235(arg2);
        } else {
            class59 var4 = (class59) super.field3225;
            int var5 = this.field2848 << 8;
            int var6 = this.field2847 << 8;
            int var7 = var4.field762.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field2856 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field2855 < 0) {
                if (this.field2852 <= 0) {
                    this.method1383();
                    this.method707((byte) -59);
                    return;
                }
                this.field2855 = 0;
            }
            if (this.field2855 >= var7) {
                if (this.field2852 >= 0) {
                    this.method1383();
                    this.method707((byte) -41);
                    return;
                }
                this.field2855 = var7 - 1;
            }
            if (this.field2856 < 0) {
                if (this.field2854) {
                    if (this.field2852 < 0) {
                        var9 = this.method1392(arg0, arg1, var5, var10, var4.field762[this.field2848]);
                        if (this.field2855 >= var5) {
                            return;
                        }
                        this.field2855 = var5 + var5 - 1 - this.field2855;
                        this.field2852 = -this.field2852;
                    }
                    while (true) {
                        int var11 = this.method1387(arg0, var9, var6, var10, var4.field762[this.field2847 - 1]);
                        if (this.field2855 < var6) {
                            return;
                        }
                        this.field2855 = var6 + var6 - 1 - this.field2855;
                        this.field2852 = -this.field2852;
                        var9 = this.method1392(arg0, var11, var5, var10, var4.field762[this.field2848]);
                        if (this.field2855 >= var5) {
                            return;
                        }
                        this.field2855 = var5 + var5 - 1 - this.field2855;
                        this.field2852 = -this.field2852;
                    }
                } else if (this.field2852 < 0) {
                    while (true) {
                        var9 = this.method1392(arg0, var9, var5, var10, var4.field762[this.field2847 - 1]);
                        if (this.field2855 >= var5) {
                            return;
                        }
                        this.field2855 = var6 - 1 - (var6 - 1 - this.field2855) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method1387(arg0, var9, var6, var10, var4.field762[this.field2848]);
                        if (this.field2855 < var6) {
                            return;
                        }
                        this.field2855 = (this.field2855 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field2856 > 0) {
                    if (this.field2854) {
                        label130: {
                            if (this.field2852 < 0) {
                                var9 = this.method1392(arg0, arg1, var5, var10, var4.field762[this.field2848]);
                                if (this.field2855 >= var5) {
                                    return;
                                }
                                this.field2855 = var5 + var5 - 1 - this.field2855;
                                this.field2852 = -this.field2852;
                                if (--this.field2856 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method1387(arg0, var9, var6, var10, var4.field762[this.field2847 - 1]);
                                if (this.field2855 < var6) {
                                    return;
                                }
                                this.field2855 = var6 + var6 - 1 - this.field2855;
                                this.field2852 = -this.field2852;
                                if (--this.field2856 == 0) {
                                    break;
                                }
                                var9 = this.method1392(arg0, var9, var5, var10, var4.field762[this.field2848]);
                                if (this.field2855 >= var5) {
                                    return;
                                }
                                this.field2855 = var5 + var5 - 1 - this.field2855;
                                this.field2852 = -this.field2852;
                            } while (--this.field2856 != 0);
                        }
                    } else if (this.field2852 < 0) {
                        while (true) {
                            var9 = this.method1392(arg0, var9, var5, var10, var4.field762[this.field2847 - 1]);
                            if (this.field2855 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field2855) / var8;
                            if (var12 >= this.field2856) {
                                this.field2855 += this.field2856 * var8;
                                this.field2856 = 0;
                                break;
                            }
                            this.field2855 += var8 * var12;
                            this.field2856 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method1387(arg0, var9, var6, var10, var4.field762[this.field2848]);
                            if (this.field2855 < var6) {
                                return;
                            }
                            int var13 = (this.field2855 - var5) / var8;
                            if (var13 >= this.field2856) {
                                this.field2855 -= this.field2856 * var8;
                                this.field2856 = 0;
                                break;
                            }
                            this.field2855 -= var8 * var13;
                            this.field2856 -= var13;
                        }
                    }
                }
                if (this.field2852 < 0) {
                    this.method1392(arg0, var9, 0, var10, 0);
                    if (this.field2855 < 0) {
                        this.field2855 = -1;
                        this.method1383();
                        this.method707((byte) -29);
                        return;
                    }
                } else {
                    this.method1387(arg0, var9, var7, var10, 0);
                    if (this.field2855 >= var7) {
                        this.field2855 = var7;
                        this.method1383();
                        this.method707((byte) -119);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(I[B[IIIIIIIIIILqga;)I", line = 420)
    private static final int method1371(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class169 arg12) {
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
        arg12.field2842 += (var19 - arg4) * arg12.field2846;
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
        arg12.field2844 = var15 >> 2;
        arg12.field2851 = var16 >> 2;
        arg12.field2855 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!qga", name = "g", descriptor = "()Z", line = 474)
    public final boolean method1372() {
        return this.field2855 < 0 || this.field2855 >= ((class59) super.field3225).field762.length << 8;
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(II[B[IIIIIIIILqga;II)I", line = 477)
    private static final int method1373(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class169 arg11, int arg12, int arg13) {
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
        arg11.field2855 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!qga", name = "b", descriptor = "(I[B[IIIIIIIIIILqga;)I", line = 510)
    private static final int method1374(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class169 arg12) {
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
        arg12.field2842 += (var19 - arg4) * arg12.field2846;
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
        arg12.field2844 = var15 >> 2;
        arg12.field2851 = var16 >> 2;
        arg12.field2855 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!qga", name = "b", descriptor = "(II[B[IIIIIIIILqga;II)I", line = 563)
    private static final int method1375(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class169 arg11, int arg12, int arg13) {
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
        arg11.field2855 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!qga", name = "h", descriptor = "(I)V", line = 596)
    public final synchronized void method1376(int arg0) {
        this.method1377(this.method1378(), arg0);
    }

    @OriginalMember(owner = "client!qga", name = "b", descriptor = "(II)V", line = 599)
    private final synchronized void method1377(int arg0, int arg1) {
        this.field2843 = arg0;
        this.field2845 = arg1;
        this.field2849 = 0;
        this.method1360();
    }

    @OriginalMember(owner = "client!qga", name = "h", descriptor = "()I", line = 606)
    public final synchronized int method1378() {
        return this.field2843 == Integer.MIN_VALUE ? 0 : this.field2843;
    }

    @OriginalMember(owner = "client!qga", name = "i", descriptor = "()Z", line = 610)
    private final boolean method1379() {
        int var1 = this.field2843;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1389(var1, this.field2845);
            var2 = method1368(var1, this.field2845);
        }
        if (this.field2842 == var1 && this.field2844 == var3 && this.field2851 == var2) {
            if (this.field2843 == Integer.MIN_VALUE) {
                this.field2843 = 0;
                this.field2842 = this.field2844 = this.field2851 = 0;
                this.method707((byte) -53);
                return true;
            } else {
                this.method1360();
                return false;
            }
        } else {
            if (this.field2842 < var1) {
                this.field2846 = 1;
                this.field2849 = var1 - this.field2842;
            } else if (this.field2842 > var1) {
                this.field2846 = -1;
                this.field2849 = this.field2842 - var1;
            } else {
                this.field2846 = 0;
            }
            if (this.field2844 < var3) {
                this.field2853 = 1;
                if (this.field2849 == 0 || this.field2849 > var3 - this.field2844) {
                    this.field2849 = var3 - this.field2844;
                }
            } else if (this.field2844 > var3) {
                this.field2853 = -1;
                if (this.field2849 == 0 || this.field2849 > this.field2844 - var3) {
                    this.field2849 = this.field2844 - var3;
                }
            } else {
                this.field2853 = 0;
            }
            if (this.field2851 < var2) {
                this.field2850 = 1;
                if (this.field2849 == 0 || this.field2849 > var2 - this.field2851) {
                    this.field2849 = var2 - this.field2851;
                }
            } else if (this.field2851 > var2) {
                this.field2850 = -1;
                if (this.field2849 == 0 || this.field2849 > this.field2851 - var2) {
                    this.field2849 = this.field2851 - var2;
                }
            } else {
                this.field2850 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!qga", name = "j", descriptor = "()I", line = 695)
    public final synchronized int method1380() {
        return this.field2845 < 0 ? -1 : this.field2845;
    }

    @OriginalMember(owner = "client!qga", name = "i", descriptor = "(I)V", line = 698)
    public final synchronized void method1381(int arg0) {
        this.field2856 = arg0;
    }

    @OriginalMember(owner = "client!qga", name = "c", descriptor = "(II[B[IIIIIIIILqga;II)I", line = 701)
    private static final int method1382(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class169 arg11, int arg12, int arg13) {
        arg11.field2844 -= arg11.field2853 * arg5;
        arg11.field2851 -= arg11.field2850 * arg5;
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
        arg11.field2844 += arg11.field2853 * arg5;
        arg11.field2851 += arg11.field2850 * arg5;
        arg11.field2842 = arg6;
        arg11.field2855 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!qga", name = "k", descriptor = "()V", line = 735)
    private final void method1383() {
        if (this.field2849 != 0) {
            if (this.field2843 == Integer.MIN_VALUE) {
                this.field2843 = 0;
            }
            this.field2849 = 0;
            this.method1360();
        }
    }

    @OriginalMember(owner = "client!qga", name = "j", descriptor = "(I)V", line = 747)
    public final synchronized void method1384(int arg0) {
        int var2 = ((class59) super.field3225).field762.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field2855 = arg0;
    }

    @OriginalMember(owner = "client!qga", name = "k", descriptor = "(I)V", line = 760)
    public final synchronized void method1385(int arg0) {
        if (arg0 == 0) {
            this.method1364(0);
            this.method707((byte) -126);
        } else if (this.field2844 == 0 && this.field2851 == 0) {
            this.field2849 = 0;
            this.field2843 = 0;
            this.field2842 = 0;
            this.method707((byte) -67);
        } else {
            int var2 = -this.field2842;
            if (this.field2842 > var2) {
                var2 = this.field2842;
            }
            if (-this.field2844 > var2) {
                var2 = -this.field2844;
            }
            if (this.field2844 > var2) {
                var2 = this.field2844;
            }
            if (-this.field2851 > var2) {
                var2 = -this.field2851;
            }
            if (this.field2851 > var2) {
                var2 = this.field2851;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field2849 = arg0;
            this.field2843 = Integer.MIN_VALUE;
            this.field2846 = -this.field2842 / arg0;
            this.field2853 = -this.field2844 / arg0;
            this.field2850 = -this.field2851 / arg0;
        }
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(II[B[IIIIIIIIIILqga;II)I", line = 805)
    private static final int method1386(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class169 arg13, int arg14, int arg15) {
        arg13.field2842 -= arg13.field2846 * arg5;
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
        arg13.field2842 += arg13.field2846 * var22;
        arg13.field2844 = arg6;
        arg13.field2851 = arg7;
        arg13.field2855 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "([IIIII)I", line = 846)
    private final int method1387(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field2849 <= 0) {
                if (this.field2852 == 256 && (this.field2855 & 255) == 0) {
                    if (class3.field23) {
                        return method1399(0, ((class59) super.field3225).field762, arg0, this.field2855, arg1, this.field2844, this.field2851, 0, arg3, arg2, this);
                    }
                    return method1363(((class59) super.field3225).field762, arg0, this.field2855, arg1, this.field2842, 0, arg3, arg2, this);
                }
                if (class3.field23) {
                    return method1373(0, 0, ((class59) super.field3225).field762, arg0, this.field2855, arg1, this.field2844, this.field2851, 0, arg3, arg2, this, this.field2852, arg4);
                }
                return method1396(0, 0, ((class59) super.field3225).field762, arg0, this.field2855, arg1, this.field2842, 0, arg3, arg2, this, this.field2852, arg4);
            }
            int var6 = this.field2849 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field2849 += arg1;
            if (this.field2852 == 256 && (this.field2855 & 255) == 0) {
                if (class3.field23) {
                    arg1 = method1374(0, ((class59) super.field3225).field762, arg0, this.field2855, arg1, this.field2844, this.field2851, this.field2853, this.field2850, 0, var6, arg2, this);
                } else {
                    arg1 = method1398(((class59) super.field3225).field762, arg0, this.field2855, arg1, this.field2842, this.field2846, 0, var6, arg2, this);
                }
            } else if (class3.field23) {
                arg1 = method1395(0, 0, ((class59) super.field3225).field762, arg0, this.field2855, arg1, this.field2844, this.field2851, this.field2853, this.field2850, 0, var6, arg2, this, this.field2852, arg4);
            } else {
                arg1 = method1394(0, 0, ((class59) super.field3225).field762, arg0, this.field2855, arg1, this.field2842, this.field2846, 0, var6, arg2, this, this.field2852, arg4);
            }
            this.field2849 -= arg1;
            if (this.field2849 != 0) {
                return arg1;
            }
        } while (!this.method1379());
        return arg3;
    }

    @OriginalMember(owner = "client!qga", name = "c", descriptor = "(II)V", line = 901)
    public final synchronized void method1388(int arg0, int arg1) {
        this.method1365(arg0, arg1, this.method1380());
    }

    @OriginalMember(owner = "client!qga", name = "b", descriptor = "()I", line = 914)
    public final int method215() {
        return this.field2843 == 0 && this.field2849 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!qga", name = "d", descriptor = "(II)I", line = 920)
    private static final int method1389(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(I[B[IIIIIIIILqga;)I", line = 923)
    private static final int method1390(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class169 arg10) {
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
        arg10.field2855 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(Lqr;III)Lqga;", line = 962)
    public static final class169 method1391(class59 arg0, int arg1, int arg2, int arg3) {
        return arg0.field762 != null && arg0.field762.length != 0 ? new class169(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!qga", name = "b", descriptor = "([IIIII)I", line = 969)
    private final int method1392(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field2849 <= 0) {
                if (this.field2852 == -256 && (this.field2855 & 255) == 0) {
                    if (class3.field23) {
                        return method1390(0, ((class59) super.field3225).field762, arg0, this.field2855, arg1, this.field2844, this.field2851, 0, arg3, arg2, this);
                    }
                    return method1393(((class59) super.field3225).field762, arg0, this.field2855, arg1, this.field2842, 0, arg3, arg2, this);
                }
                if (class3.field23) {
                    return method1375(0, 0, ((class59) super.field3225).field762, arg0, this.field2855, arg1, this.field2844, this.field2851, 0, arg3, arg2, this, this.field2852, arg4);
                }
                return method1361(0, 0, ((class59) super.field3225).field762, arg0, this.field2855, arg1, this.field2842, 0, arg3, arg2, this, this.field2852, arg4);
            }
            int var6 = this.field2849 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field2849 += arg1;
            if (this.field2852 == -256 && (this.field2855 & 255) == 0) {
                if (class3.field23) {
                    arg1 = method1371(0, ((class59) super.field3225).field762, arg0, this.field2855, arg1, this.field2844, this.field2851, this.field2853, this.field2850, 0, var6, arg2, this);
                } else {
                    arg1 = method1369(((class59) super.field3225).field762, arg0, this.field2855, arg1, this.field2842, this.field2846, 0, var6, arg2, this);
                }
            } else if (class3.field23) {
                arg1 = method1386(0, 0, ((class59) super.field3225).field762, arg0, this.field2855, arg1, this.field2844, this.field2851, this.field2853, this.field2850, 0, var6, arg2, this, this.field2852, arg4);
            } else {
                arg1 = method1382(0, 0, ((class59) super.field3225).field762, arg0, this.field2855, arg1, this.field2842, this.field2846, 0, var6, arg2, this, this.field2852, arg4);
            }
            this.field2849 -= arg1;
            if (this.field2849 != 0) {
                return arg1;
            }
        } while (!this.method1379());
        return arg3;
    }

    @OriginalMember(owner = "client!qga", name = "b", descriptor = "([B[IIIIIIILqga;)I", line = 1025)
    private static final int method1393(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class169 arg8) {
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
        arg8.field2855 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!qga", name = "d", descriptor = "(II[B[IIIIIIIILqga;II)I", line = 1050)
    private static final int method1394(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class169 arg11, int arg12, int arg13) {
        arg11.field2844 -= arg11.field2853 * arg5;
        arg11.field2851 -= arg11.field2850 * arg5;
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
        arg11.field2844 += arg11.field2853 * arg5;
        arg11.field2851 += arg11.field2850 * arg5;
        arg11.field2842 = arg6;
        arg11.field2855 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!qga", name = "b", descriptor = "(II[B[IIIIIIIIIILqga;II)I", line = 1084)
    private static final int method1395(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class169 arg13, int arg14, int arg15) {
        arg13.field2842 -= arg13.field2846 * arg5;
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
        arg13.field2842 += arg13.field2846 * var22;
        arg13.field2844 = arg6;
        arg13.field2851 = arg7;
        arg13.field2855 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!qga", name = "b", descriptor = "(II[B[IIIIIIILqga;II)I", line = 1126)
    private static final int method1396(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class169 arg10, int arg11, int arg12) {
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
        arg10.field2855 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(Z)V", line = 1152)
    public final synchronized void method1397(boolean arg0) {
        this.field2852 = (this.field2852 >>> 31) + (this.field2852 ^ this.field2852 >> 31);
        if (arg0) {
            this.field2852 = -this.field2852;
        }
    }

    @OriginalMember(owner = "client!qga", name = "b", descriptor = "([B[IIIIIIIILqga;)I", line = 1159)
    private static final int method1398(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class169 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field2844 += (var14 - arg3) * arg9.field2853;
        arg9.field2851 += (var14 - arg3) * arg9.field2850;
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
        arg9.field2842 = var12 >> 2;
        arg9.field2855 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!qga", name = "c", descriptor = "()Leq;", line = 1193)
    public final class195 method219() {
        return null;
    }

    @OriginalMember(owner = "client!qga", name = "b", descriptor = "(I[B[IIIIIIIILqga;)I", line = 1196)
    private static final int method1399(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class169 arg10) {
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
        arg10.field2855 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!qga", name = "l", descriptor = "()Z", line = 1234)
    public final boolean method1400() {
        return this.field2849 != 0;
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(I)V", line = 1237)
    public final synchronized void method235(int arg0) {
        if (this.field2849 > 0) {
            if (arg0 >= this.field2849) {
                if (this.field2843 == Integer.MIN_VALUE) {
                    this.field2843 = 0;
                    this.field2842 = this.field2844 = this.field2851 = 0;
                    this.method707((byte) -93);
                    arg0 = this.field2849;
                }
                this.field2849 = 0;
                this.method1360();
            } else {
                this.field2842 += this.field2846 * arg0;
                this.field2844 += this.field2853 * arg0;
                this.field2851 += this.field2850 * arg0;
                this.field2849 -= arg0;
            }
        }
        class59 var2 = (class59) super.field3225;
        int var3 = this.field2848 << 8;
        int var4 = this.field2847 << 8;
        int var5 = var2.field762.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field2856 = 0;
        }
        if (this.field2855 < 0) {
            if (this.field2852 <= 0) {
                this.method1383();
                this.method707((byte) -41);
                return;
            }
            this.field2855 = 0;
        }
        if (this.field2855 >= var5) {
            if (this.field2852 >= 0) {
                this.method1383();
                this.method707((byte) -60);
                return;
            }
            this.field2855 = var5 - 1;
        }
        this.field2855 += this.field2852 * arg0;
        if (this.field2856 < 0) {
            if (!this.field2854) {
                if (this.field2852 < 0) {
                    if (this.field2855 < var3) {
                        this.field2855 = var4 - 1 - (var4 - 1 - this.field2855) % var6;
                    }
                } else if (this.field2855 >= var4) {
                    this.field2855 = (this.field2855 - var3) % var6 + var3;
                }
            } else {
                if (this.field2852 < 0) {
                    if (this.field2855 >= var3) {
                        return;
                    }
                    this.field2855 = var3 + var3 - 1 - this.field2855;
                    this.field2852 = -this.field2852;
                }
                while (this.field2855 >= var4) {
                    this.field2855 = var4 + var4 - 1 - this.field2855;
                    this.field2852 = -this.field2852;
                    if (this.field2855 >= var3) {
                        return;
                    }
                    this.field2855 = var3 + var3 - 1 - this.field2855;
                    this.field2852 = -this.field2852;
                }
            }
        } else {
            if (this.field2856 > 0) {
                if (this.field2854) {
                    label125: {
                        if (this.field2852 < 0) {
                            if (this.field2855 >= var3) {
                                return;
                            }
                            this.field2855 = var3 + var3 - 1 - this.field2855;
                            this.field2852 = -this.field2852;
                            if (--this.field2856 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field2855 < var4) {
                                return;
                            }
                            this.field2855 = var4 + var4 - 1 - this.field2855;
                            this.field2852 = -this.field2852;
                            if (--this.field2856 == 0) {
                                break;
                            }
                            if (this.field2855 >= var3) {
                                return;
                            }
                            this.field2855 = var3 + var3 - 1 - this.field2855;
                            this.field2852 = -this.field2852;
                        } while (--this.field2856 != 0);
                    }
                } else if (this.field2852 < 0) {
                    if (this.field2855 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field2855) / var6;
                    if (var7 < this.field2856) {
                        this.field2855 += var6 * var7;
                        this.field2856 -= var7;
                        return;
                    }
                    this.field2855 += this.field2856 * var6;
                    this.field2856 = 0;
                } else {
                    if (this.field2855 < var4) {
                        return;
                    }
                    int var8 = (this.field2855 - var3) / var6;
                    if (var8 < this.field2856) {
                        this.field2855 -= var6 * var8;
                        this.field2856 -= var8;
                        return;
                    }
                    this.field2855 -= this.field2856 * var6;
                    this.field2856 = 0;
                }
            }
            if (this.field2852 < 0) {
                if (this.field2855 < 0) {
                    this.field2855 = -1;
                    this.method1383();
                    this.method707((byte) -22);
                    return;
                }
            } else if (this.field2855 >= var5) {
                this.field2855 = var5;
                this.method1383();
                this.method707((byte) -67);
            }
        }
    }

    @OriginalMember(owner = "client!qga", name = "<init>", descriptor = "(Lqr;III)V", line = 1456)
    private class169(class59 arg0, int arg1, int arg2, int arg3) {
        super.field3225 = arg0;
        this.field2848 = arg0.field761;
        this.field2847 = arg0.field764;
        this.field2854 = arg0.field763;
        this.field2852 = arg1;
        this.field2843 = arg2;
        this.field2845 = arg3;
        this.field2855 = 0;
        this.method1360();
    }
}
