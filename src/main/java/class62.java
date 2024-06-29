import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class62 extends class186 {

    @OriginalMember(owner = "client!ng", name = "y", descriptor = "I")
    private int field1041;

    @OriginalMember(owner = "client!ng", name = "w", descriptor = "I")
    private int field1039;

    @OriginalMember(owner = "client!ng", name = "u", descriptor = "Z")
    private boolean field1037;

    @OriginalMember(owner = "client!ng", name = "E", descriptor = "I")
    private int field1046;

    @OriginalMember(owner = "client!ng", name = "H", descriptor = "I")
    private int field1049;

    @OriginalMember(owner = "client!ng", name = "t", descriptor = "I")
    private int field1036;

    @OriginalMember(owner = "client!ng", name = "v", descriptor = "I")
    private int field1038;

    @OriginalMember(owner = "client!ng", name = "x", descriptor = "I")
    private int field1040;

    @OriginalMember(owner = "client!ng", name = "z", descriptor = "I")
    private int field1042;

    @OriginalMember(owner = "client!ng", name = "B", descriptor = "I")
    private int field1043;

    @OriginalMember(owner = "client!ng", name = "C", descriptor = "I")
    private int field1044;

    @OriginalMember(owner = "client!ng", name = "D", descriptor = "I")
    private int field1045;

    @OriginalMember(owner = "client!ng", name = "F", descriptor = "I")
    private int field1047;

    @OriginalMember(owner = "client!ng", name = "G", descriptor = "I")
    private int field1048;

    @OriginalMember(owner = "client!ng", name = "I", descriptor = "I")
    private int field1050;

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "()I")
    public final synchronized int method388() {
        return this.field1049 == Integer.MIN_VALUE ? 0 : this.field1049;
    }

    @OriginalMember(owner = "client!ng", name = "f", descriptor = "(I)V")
    public final synchronized void method389(int arg0) {
        this.method409(arg0 << 6, this.method393());
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Z)V")
    public final synchronized void method390(boolean arg0) {
        this.field1046 = (this.field1046 >>> 31) + (this.field1046 ^ this.field1046 >> 31);
        if (arg0) {
            this.field1046 = -this.field1046;
        }
    }

    @OriginalMember(owner = "client!ng", name = "f", descriptor = "()Z")
    private final boolean method391() {
        int var1 = this.field1049;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method419(var1, this.field1036);
            var2 = method394(var1, this.field1036);
        }
        if (this.field1045 == var1 && this.field1048 == var3 && this.field1040 == var2) {
            if (this.field1049 == Integer.MIN_VALUE) {
                this.field1049 = 0;
                this.field1045 = this.field1048 = this.field1040 = 0;
                this.method741(3);
                return true;
            } else {
                this.method418();
                return false;
            }
        } else {
            if (this.field1045 < var1) {
                this.field1044 = 1;
                this.field1043 = var1 - this.field1045;
            } else if (this.field1045 > var1) {
                this.field1044 = -1;
                this.field1043 = this.field1045 - var1;
            } else {
                this.field1044 = 0;
            }
            if (this.field1048 < var3) {
                this.field1050 = 1;
                if (this.field1043 == 0 || this.field1043 > var3 - this.field1048) {
                    this.field1043 = var3 - this.field1048;
                }
            } else if (this.field1048 > var3) {
                this.field1050 = -1;
                if (this.field1043 == 0 || this.field1043 > this.field1048 - var3) {
                    this.field1043 = this.field1048 - var3;
                }
            } else {
                this.field1050 = 0;
            }
            if (this.field1040 < var2) {
                this.field1047 = 1;
                if (this.field1043 == 0 || this.field1043 > var2 - this.field1040) {
                    this.field1043 = var2 - this.field1040;
                }
            } else if (this.field1040 > var2) {
                this.field1047 = -1;
                if (this.field1043 == 0 || this.field1043 > this.field1040 - var2) {
                    this.field1043 = this.field1040 - var2;
                }
            } else {
                this.field1047 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(I[B[IIIIIIIILng;)I")
    private static final int method392(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class62 arg10) {
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
        arg10.field1038 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!ng", name = "g", descriptor = "()I")
    public final synchronized int method393() {
        return this.field1036 < 0 ? -1 : this.field1036;
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(II)I")
    private static final int method394(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "()I")
    public final int method395() {
        return this.field1049 == 0 && this.field1043 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(II[B[IIIIIIILng;II)I")
    private static final int method396(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class62 arg10, int arg11, int arg12) {
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
        arg10.field1038 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(I[B[IIIIIIIIIILng;)I")
    private static final int method397(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class62 arg12) {
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
        arg12.field1045 += (var19 - arg4) * arg12.field1044;
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
        arg12.field1048 = var15 >> 2;
        arg12.field1040 = var16 >> 2;
        arg12.field1038 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "([B[IIIIIIIILng;)I")
    private static final int method398(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class62 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1048 += (var14 - arg3) * arg9.field1050;
        arg9.field1040 += (var14 - arg3) * arg9.field1047;
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
        arg9.field1045 = var12 >> 2;
        arg9.field1038 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(I[B[IIIIIIIIIILng;)I")
    private static final int method399(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class62 arg12) {
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
        arg12.field1045 += (var19 - arg4) * arg12.field1044;
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
        arg12.field1048 = var15 >> 2;
        arg12.field1040 = var16 >> 2;
        arg12.field1038 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(II[B[IIIIIIIILng;II)I")
    private static final int method400(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class62 arg11, int arg12, int arg13) {
        arg11.field1048 -= arg11.field1050 * arg5;
        arg11.field1040 -= arg11.field1047 * arg5;
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
        arg11.field1048 += arg11.field1050 * arg5;
        arg11.field1040 += arg11.field1047 * arg5;
        arg11.field1045 = arg6;
        arg11.field1038 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ng", name = "g", descriptor = "(I)V")
    public final synchronized void method401(int arg0) {
        this.field1042 = arg0;
    }

    @OriginalMember(owner = "client!ng", name = "h", descriptor = "(I)V")
    public final synchronized void method402(int arg0) {
        if (arg0 == 0) {
            this.method416(0);
            this.method741(3);
        } else if (this.field1048 == 0 && this.field1040 == 0) {
            this.field1043 = 0;
            this.field1049 = 0;
            this.field1045 = 0;
            this.method741(3);
        } else {
            int var2 = -this.field1045;
            if (this.field1045 > var2) {
                var2 = this.field1045;
            }
            if (-this.field1048 > var2) {
                var2 = -this.field1048;
            }
            if (this.field1048 > var2) {
                var2 = this.field1048;
            }
            if (-this.field1040 > var2) {
                var2 = -this.field1040;
            }
            if (this.field1040 > var2) {
                var2 = this.field1040;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1043 = arg0;
            this.field1049 = Integer.MIN_VALUE;
            this.field1044 = -this.field1045 / arg0;
            this.field1050 = -this.field1048 / arg0;
            this.field1047 = -this.field1040 / arg0;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "([B[IIIIIIILng;)I")
    private static final int method403(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class62 arg8) {
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
        arg8.field1038 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "(I)V")
    public final synchronized void method404(int arg0) {
        if (this.field1043 > 0) {
            if (arg0 >= this.field1043) {
                if (this.field1049 == Integer.MIN_VALUE) {
                    this.field1049 = 0;
                    this.field1045 = this.field1048 = this.field1040 = 0;
                    this.method741(3);
                    arg0 = this.field1043;
                }
                this.field1043 = 0;
                this.method418();
            } else {
                this.field1045 += this.field1044 * arg0;
                this.field1048 += this.field1050 * arg0;
                this.field1040 += this.field1047 * arg0;
                this.field1043 -= arg0;
            }
        }
        class128 var2 = (class128) super.field3178;
        int var3 = this.field1041 << 8;
        int var4 = this.field1039 << 8;
        int var5 = var2.field2260.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1042 = 0;
        }
        if (this.field1038 < 0) {
            if (this.field1046 <= 0) {
                this.method411();
                this.method741(3);
                return;
            }
            this.field1038 = 0;
        }
        if (this.field1038 >= var5) {
            if (this.field1046 >= 0) {
                this.method411();
                this.method741(3);
                return;
            }
            this.field1038 = var5 - 1;
        }
        this.field1038 += this.field1046 * arg0;
        if (this.field1042 < 0) {
            if (!this.field1037) {
                if (this.field1046 < 0) {
                    if (this.field1038 < var3) {
                        this.field1038 = var4 - 1 - (var4 - 1 - this.field1038) % var6;
                    }
                } else if (this.field1038 >= var4) {
                    this.field1038 = (this.field1038 - var3) % var6 + var3;
                }
            } else {
                if (this.field1046 < 0) {
                    if (this.field1038 >= var3) {
                        return;
                    }
                    this.field1038 = var3 + var3 - 1 - this.field1038;
                    this.field1046 = -this.field1046;
                }
                while (this.field1038 >= var4) {
                    this.field1038 = var4 + var4 - 1 - this.field1038;
                    this.field1046 = -this.field1046;
                    if (this.field1038 >= var3) {
                        return;
                    }
                    this.field1038 = var3 + var3 - 1 - this.field1038;
                    this.field1046 = -this.field1046;
                }
            }
        } else {
            if (this.field1042 > 0) {
                if (this.field1037) {
                    label125: {
                        if (this.field1046 < 0) {
                            if (this.field1038 >= var3) {
                                return;
                            }
                            this.field1038 = var3 + var3 - 1 - this.field1038;
                            this.field1046 = -this.field1046;
                            if (--this.field1042 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field1038 < var4) {
                                return;
                            }
                            this.field1038 = var4 + var4 - 1 - this.field1038;
                            this.field1046 = -this.field1046;
                            if (--this.field1042 == 0) {
                                break;
                            }
                            if (this.field1038 >= var3) {
                                return;
                            }
                            this.field1038 = var3 + var3 - 1 - this.field1038;
                            this.field1046 = -this.field1046;
                        } while (--this.field1042 != 0);
                    }
                } else if (this.field1046 < 0) {
                    if (this.field1038 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field1038) / var6;
                    if (var7 < this.field1042) {
                        this.field1038 += var6 * var7;
                        this.field1042 -= var7;
                        return;
                    }
                    this.field1038 += this.field1042 * var6;
                    this.field1042 = 0;
                } else {
                    if (this.field1038 < var4) {
                        return;
                    }
                    int var8 = (this.field1038 - var3) / var6;
                    if (var8 < this.field1042) {
                        this.field1038 -= var6 * var8;
                        this.field1042 -= var8;
                        return;
                    }
                    this.field1038 -= this.field1042 * var6;
                    this.field1042 = 0;
                }
            }
            if (this.field1046 < 0) {
                if (this.field1038 < 0) {
                    this.field1038 = -1;
                    this.method411();
                    this.method741(3);
                    return;
                }
            } else if (this.field1038 >= var5) {
                this.field1038 = var5;
                this.method411();
                this.method741(3);
            }
        }
    }

    @OriginalMember(owner = "client!ng", name = "i", descriptor = "(I)V")
    public final synchronized void method405(int arg0) {
        int var2 = ((class128) super.field3178).field2260.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1038 = arg0;
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "([B[IIIIIIIILng;)I")
    private static final int method406(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class62 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1048 += (var14 - arg3) * arg9.field1050;
        arg9.field1040 += (var14 - arg3) * arg9.field1047;
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
        arg9.field1045 = var12 >> 2;
        arg9.field1038 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(II[B[IIIIIIIILng;II)I")
    private static final int method407(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class62 arg11, int arg12, int arg13) {
        arg11.field1048 -= arg11.field1050 * arg5;
        arg11.field1040 -= arg11.field1047 * arg5;
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
        arg11.field1048 += arg11.field1050 * arg5;
        arg11.field1040 += arg11.field1047 * arg5;
        arg11.field1045 = arg6;
        arg11.field1038 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "()Luh;")
    public final class186 method408() {
        return null;
    }

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "(II)V")
    private final synchronized void method409(int arg0, int arg1) {
        this.field1049 = arg0;
        this.field1036 = arg1;
        this.field1043 = 0;
        this.method418();
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "([B[IIIIIIILng;)I")
    private static final int method410(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class62 arg8) {
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
        arg8.field1038 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ng", name = "h", descriptor = "()V")
    private final void method411() {
        if (this.field1043 != 0) {
            if (this.field1049 == Integer.MIN_VALUE) {
                this.field1049 = 0;
            }
            this.field1043 = 0;
            this.method418();
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(II[B[IIIIIIIIIILng;II)I")
    private static final int method412(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class62 arg13, int arg14, int arg15) {
        arg13.field1045 -= arg13.field1044 * arg5;
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
        arg13.field1045 += arg13.field1044 * var22;
        arg13.field1048 = arg6;
        arg13.field1040 = arg7;
        arg13.field1038 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "(II[B[IIIIIIIILng;II)I")
    private static final int method413(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class62 arg11, int arg12, int arg13) {
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
        arg11.field1038 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "()Luh;")
    public final class186 method414() {
        return null;
    }

    @OriginalMember(owner = "client!ng", name = "j", descriptor = "(I)V")
    public final synchronized void method415(int arg0) {
        if (this.field1046 < 0) {
            this.field1046 = -arg0;
        } else {
            this.field1046 = arg0;
        }
    }

    @OriginalMember(owner = "client!ng", name = "k", descriptor = "(I)V")
    private final synchronized void method416(int arg0) {
        this.method409(arg0, this.method393());
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(II[B[IIIIIIILng;II)I")
    private static final int method417(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class62 arg10, int arg11, int arg12) {
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
        arg10.field1038 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ng", name = "i", descriptor = "()V")
    private final void method418() {
        this.field1045 = this.field1049;
        this.field1048 = method419(this.field1049, this.field1036);
        this.field1040 = method394(this.field1049, this.field1036);
    }

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "(II)I")
    private static final int method419(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!ng", name = "j", descriptor = "()Z")
    public final boolean method420() {
        return this.field1038 < 0 || this.field1038 >= ((class128) super.field3178).field2260.length << 8;
    }

    @OriginalMember(owner = "client!ng", name = "k", descriptor = "()I")
    public final synchronized int method421() {
        return this.field1046 < 0 ? -this.field1046 : this.field1046;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lgj;II)Lng;")
    public static final class62 method422(class128 arg0, int arg1, int arg2) {
        return arg0.field2260 != null && arg0.field2260.length != 0 ? new class62(arg0, (int) ((long) arg0.field2263 * 256L * (long) arg1 / (long) (class84.field1375 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(III)V")
    public final synchronized void method423(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method409(arg1, arg2);
        } else {
            int var4 = method419(arg1, arg2);
            int var5 = method394(arg1, arg2);
            if (this.field1048 == var4 && this.field1040 == var5) {
                this.field1043 = 0;
            } else {
                int var6 = arg1 - this.field1045;
                if (this.field1045 - arg1 > var6) {
                    var6 = this.field1045 - arg1;
                }
                if (var4 - this.field1048 > var6) {
                    var6 = var4 - this.field1048;
                }
                if (this.field1048 - var4 > var6) {
                    var6 = this.field1048 - var4;
                }
                if (var5 - this.field1040 > var6) {
                    var6 = var5 - this.field1040;
                }
                if (this.field1040 - var5 > var6) {
                    var6 = this.field1040 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field1043 = arg0;
                this.field1049 = arg1;
                this.field1036 = arg2;
                this.field1044 = (arg1 - this.field1045) / arg0;
                this.field1050 = (var4 - this.field1048) / arg0;
                this.field1047 = (var5 - this.field1040) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "(II)V")
    public final synchronized void method424(int arg0, int arg1) {
        this.method423(arg0, arg1, this.method393());
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "([III)V")
    public final synchronized void method425(int[] arg0, int arg1, int arg2) {
        if (this.field1049 == 0 && this.field1043 == 0) {
            this.method404(arg2);
        } else {
            class128 var4 = (class128) super.field3178;
            int var5 = this.field1041 << 8;
            int var6 = this.field1039 << 8;
            int var7 = var4.field2260.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field1042 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field1038 < 0) {
                if (this.field1046 <= 0) {
                    this.method411();
                    this.method741(3);
                    return;
                }
                this.field1038 = 0;
            }
            if (this.field1038 >= var7) {
                if (this.field1046 >= 0) {
                    this.method411();
                    this.method741(3);
                    return;
                }
                this.field1038 = var7 - 1;
            }
            if (this.field1042 < 0) {
                if (this.field1037) {
                    if (this.field1046 < 0) {
                        var9 = this.method428(arg0, arg1, var5, var10, var4.field2260[this.field1041]);
                        if (this.field1038 >= var5) {
                            return;
                        }
                        this.field1038 = var5 + var5 - 1 - this.field1038;
                        this.field1046 = -this.field1046;
                    }
                    while (true) {
                        int var11 = this.method433(arg0, var9, var6, var10, var4.field2260[this.field1039 - 1]);
                        if (this.field1038 < var6) {
                            return;
                        }
                        this.field1038 = var6 + var6 - 1 - this.field1038;
                        this.field1046 = -this.field1046;
                        var9 = this.method428(arg0, var11, var5, var10, var4.field2260[this.field1041]);
                        if (this.field1038 >= var5) {
                            return;
                        }
                        this.field1038 = var5 + var5 - 1 - this.field1038;
                        this.field1046 = -this.field1046;
                    }
                } else if (this.field1046 < 0) {
                    while (true) {
                        var9 = this.method428(arg0, var9, var5, var10, var4.field2260[this.field1039 - 1]);
                        if (this.field1038 >= var5) {
                            return;
                        }
                        this.field1038 = var6 - 1 - (var6 - 1 - this.field1038) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method433(arg0, var9, var6, var10, var4.field2260[this.field1041]);
                        if (this.field1038 < var6) {
                            return;
                        }
                        this.field1038 = (this.field1038 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field1042 > 0) {
                    if (this.field1037) {
                        label130: {
                            if (this.field1046 < 0) {
                                var9 = this.method428(arg0, arg1, var5, var10, var4.field2260[this.field1041]);
                                if (this.field1038 >= var5) {
                                    return;
                                }
                                this.field1038 = var5 + var5 - 1 - this.field1038;
                                this.field1046 = -this.field1046;
                                if (--this.field1042 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method433(arg0, var9, var6, var10, var4.field2260[this.field1039 - 1]);
                                if (this.field1038 < var6) {
                                    return;
                                }
                                this.field1038 = var6 + var6 - 1 - this.field1038;
                                this.field1046 = -this.field1046;
                                if (--this.field1042 == 0) {
                                    break;
                                }
                                var9 = this.method428(arg0, var9, var5, var10, var4.field2260[this.field1041]);
                                if (this.field1038 >= var5) {
                                    return;
                                }
                                this.field1038 = var5 + var5 - 1 - this.field1038;
                                this.field1046 = -this.field1046;
                            } while (--this.field1042 != 0);
                        }
                    } else if (this.field1046 < 0) {
                        while (true) {
                            var9 = this.method428(arg0, var9, var5, var10, var4.field2260[this.field1039 - 1]);
                            if (this.field1038 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field1038) / var8;
                            if (var12 >= this.field1042) {
                                this.field1038 += this.field1042 * var8;
                                this.field1042 = 0;
                                break;
                            }
                            this.field1038 += var8 * var12;
                            this.field1042 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method433(arg0, var9, var6, var10, var4.field2260[this.field1041]);
                            if (this.field1038 < var6) {
                                return;
                            }
                            int var13 = (this.field1038 - var5) / var8;
                            if (var13 >= this.field1042) {
                                this.field1038 -= this.field1042 * var8;
                                this.field1042 = 0;
                                break;
                            }
                            this.field1038 -= var8 * var13;
                            this.field1042 -= var13;
                        }
                    }
                }
                if (this.field1046 < 0) {
                    this.method428(arg0, var9, 0, var10, 0);
                    if (this.field1038 < 0) {
                        this.field1038 = -1;
                        this.method411();
                        this.method741(3);
                        return;
                    }
                } else {
                    this.method433(arg0, var9, var7, var10, 0);
                    if (this.field1038 >= var7) {
                        this.field1038 = var7;
                        this.method411();
                        this.method741(3);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(II[B[IIIIIIIIIILng;II)I")
    private static final int method426(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class62 arg13, int arg14, int arg15) {
        arg13.field1045 -= arg13.field1044 * arg5;
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
        arg13.field1045 += arg13.field1044 * var22;
        arg13.field1048 = arg6;
        arg13.field1040 = arg7;
        arg13.field1038 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "(II[B[IIIIIIIILng;II)I")
    private static final int method427(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class62 arg11, int arg12, int arg13) {
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
        arg11.field1038 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "([IIIII)I")
    private final int method428(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field1043 <= 0) {
                if (this.field1046 == -256 && (this.field1038 & 255) == 0) {
                    if (class110.field1946) {
                        return method392(0, ((class128) super.field3178).field2260, arg0, this.field1038, arg1, this.field1048, this.field1040, 0, arg3, arg2, this);
                    }
                    return method403(((class128) super.field3178).field2260, arg0, this.field1038, arg1, this.field1045, 0, arg3, arg2, this);
                }
                if (class110.field1946) {
                    return method413(0, 0, ((class128) super.field3178).field2260, arg0, this.field1038, arg1, this.field1048, this.field1040, 0, arg3, arg2, this, this.field1046, arg4);
                }
                return method417(0, 0, ((class128) super.field3178).field2260, arg0, this.field1038, arg1, this.field1045, 0, arg3, arg2, this, this.field1046, arg4);
            }
            int var6 = this.field1043 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field1043 += arg1;
            if (this.field1046 == -256 && (this.field1038 & 255) == 0) {
                if (class110.field1946) {
                    arg1 = method399(0, ((class128) super.field3178).field2260, arg0, this.field1038, arg1, this.field1048, this.field1040, this.field1050, this.field1047, 0, var6, arg2, this);
                } else {
                    arg1 = method398(((class128) super.field3178).field2260, arg0, this.field1038, arg1, this.field1045, this.field1044, 0, var6, arg2, this);
                }
            } else if (class110.field1946) {
                arg1 = method412(0, 0, ((class128) super.field3178).field2260, arg0, this.field1038, arg1, this.field1048, this.field1040, this.field1050, this.field1047, 0, var6, arg2, this, this.field1046, arg4);
            } else {
                arg1 = method407(0, 0, ((class128) super.field3178).field2260, arg0, this.field1038, arg1, this.field1045, this.field1044, 0, var6, arg2, this, this.field1046, arg4);
            }
            this.field1043 -= arg1;
            if (this.field1043 != 0) {
                return arg1;
            }
        } while (!this.method391());
        return arg3;
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(I[B[IIIIIIIILng;)I")
    private static final int method429(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class62 arg10) {
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
        arg10.field1038 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "()I")
    public final int method430() {
        int var1 = this.field1045 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1042 == 0) {
            var2 -= this.field1038 * var2 / (((class128) super.field3178).field2260.length << 8);
        } else if (this.field1042 >= 0) {
            var2 -= this.field1041 * var2 / ((class128) super.field3178).field2260.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lgj;III)Lng;")
    public static final class62 method431(class128 arg0, int arg1, int arg2, int arg3) {
        return arg0.field2260 != null && arg0.field2260.length != 0 ? new class62(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(Lgj;II)V")
    private class62(class128 arg0, int arg1, int arg2) {
        super.field3178 = arg0;
        this.field1041 = arg0.field2262;
        this.field1039 = arg0.field2259;
        this.field1037 = arg0.field2261;
        this.field1046 = arg1;
        this.field1049 = arg2;
        this.field1036 = 8192;
        this.field1038 = 0;
        this.method418();
    }

    @OriginalMember(owner = "client!ng", name = "l", descriptor = "()Z")
    public final boolean method432() {
        return this.field1043 != 0;
    }

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(Lgj;III)V")
    private class62(class128 arg0, int arg1, int arg2, int arg3) {
        super.field3178 = arg0;
        this.field1041 = arg0.field2262;
        this.field1039 = arg0.field2259;
        this.field1037 = arg0.field2261;
        this.field1046 = arg1;
        this.field1049 = arg2;
        this.field1036 = arg3;
        this.field1038 = 0;
        this.method418();
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "([IIIII)I")
    private final int method433(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field1043 <= 0) {
                if (this.field1046 == 256 && (this.field1038 & 255) == 0) {
                    if (class110.field1946) {
                        return method429(0, ((class128) super.field3178).field2260, arg0, this.field1038, arg1, this.field1048, this.field1040, 0, arg3, arg2, this);
                    }
                    return method410(((class128) super.field3178).field2260, arg0, this.field1038, arg1, this.field1045, 0, arg3, arg2, this);
                }
                if (class110.field1946) {
                    return method427(0, 0, ((class128) super.field3178).field2260, arg0, this.field1038, arg1, this.field1048, this.field1040, 0, arg3, arg2, this, this.field1046, arg4);
                }
                return method396(0, 0, ((class128) super.field3178).field2260, arg0, this.field1038, arg1, this.field1045, 0, arg3, arg2, this, this.field1046, arg4);
            }
            int var6 = this.field1043 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field1043 += arg1;
            if (this.field1046 == 256 && (this.field1038 & 255) == 0) {
                if (class110.field1946) {
                    arg1 = method397(0, ((class128) super.field3178).field2260, arg0, this.field1038, arg1, this.field1048, this.field1040, this.field1050, this.field1047, 0, var6, arg2, this);
                } else {
                    arg1 = method406(((class128) super.field3178).field2260, arg0, this.field1038, arg1, this.field1045, this.field1044, 0, var6, arg2, this);
                }
            } else if (class110.field1946) {
                arg1 = method426(0, 0, ((class128) super.field3178).field2260, arg0, this.field1038, arg1, this.field1048, this.field1040, this.field1050, this.field1047, 0, var6, arg2, this, this.field1046, arg4);
            } else {
                arg1 = method400(0, 0, ((class128) super.field3178).field2260, arg0, this.field1038, arg1, this.field1045, this.field1044, 0, var6, arg2, this, this.field1046, arg4);
            }
            this.field1043 -= arg1;
            if (this.field1043 != 0) {
                return arg1;
            }
        } while (!this.method391());
        return arg3;
    }
}
