import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nt")
public class class189 extends class317 {

    @OriginalMember(owner = "client!nt", name = "o", descriptor = "I")
    private int field2321;

    @OriginalMember(owner = "client!nt", name = "x", descriptor = "I")
    private int field2330;

    @OriginalMember(owner = "client!nt", name = "w", descriptor = "Z")
    private boolean field2329;

    @OriginalMember(owner = "client!nt", name = "y", descriptor = "I")
    private int field2331;

    @OriginalMember(owner = "client!nt", name = "u", descriptor = "I")
    private int field2327;

    @OriginalMember(owner = "client!nt", name = "v", descriptor = "I")
    private int field2328;

    @OriginalMember(owner = "client!nt", name = "t", descriptor = "I")
    private int field2326;

    @OriginalMember(owner = "client!nt", name = "n", descriptor = "I")
    private int field2320;

    @OriginalMember(owner = "client!nt", name = "p", descriptor = "I")
    private int field2322;

    @OriginalMember(owner = "client!nt", name = "q", descriptor = "I")
    private int field2323;

    @OriginalMember(owner = "client!nt", name = "r", descriptor = "I")
    private int field2324;

    @OriginalMember(owner = "client!nt", name = "s", descriptor = "I")
    private int field2325;

    @OriginalMember(owner = "client!nt", name = "z", descriptor = "I")
    private int field2332;

    @OriginalMember(owner = "client!nt", name = "A", descriptor = "I")
    private int field2333;

    @OriginalMember(owner = "client!nt", name = "B", descriptor = "I")
    private int field2334;

    @OriginalMember(owner = "client!nt", name = "b", descriptor = "(Z)V")
    public final synchronized void method1084(boolean arg0) {
        this.field2331 = (this.field2331 >>> 31) + (this.field2331 ^ this.field2331 >> 31);
        if (arg0) {
            this.field2331 = -this.field2331;
        }
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(II)I")
    private static final int method1085(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!nt", name = "b", descriptor = "([III)V")
    public final synchronized void method930(int[] arg0, int arg1, int arg2) {
        if (this.field2327 == 0 && this.field2332 == 0) {
            this.method929(arg2);
        } else {
            class534 var4 = (class534) super.field4610;
            int var5 = this.field2321 << 8;
            int var6 = this.field2330 << 8;
            int var7 = var4.field7704.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field2323 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field2326 < 0) {
                if (this.field2331 <= 0) {
                    this.method1119();
                    this.method2108(true);
                    return;
                }
                this.field2326 = 0;
            }
            if (this.field2326 >= var7) {
                if (this.field2331 >= 0) {
                    this.method1119();
                    this.method2108(true);
                    return;
                }
                this.field2326 = var7 - 1;
            }
            if (this.field2323 < 0) {
                if (this.field2329) {
                    if (this.field2331 < 0) {
                        var9 = this.method1117(arg0, arg1, var5, var10, var4.field7704[this.field2321]);
                        if (this.field2326 >= var5) {
                            return;
                        }
                        this.field2326 = var5 + var5 - 1 - this.field2326;
                        this.field2331 = -this.field2331;
                    }
                    while (true) {
                        int var11 = this.method1098(arg0, var9, var6, var10, var4.field7704[this.field2330 - 1]);
                        if (this.field2326 < var6) {
                            return;
                        }
                        this.field2326 = var6 + var6 - 1 - this.field2326;
                        this.field2331 = -this.field2331;
                        var9 = this.method1117(arg0, var11, var5, var10, var4.field7704[this.field2321]);
                        if (this.field2326 >= var5) {
                            return;
                        }
                        this.field2326 = var5 + var5 - 1 - this.field2326;
                        this.field2331 = -this.field2331;
                    }
                } else if (this.field2331 < 0) {
                    while (true) {
                        var9 = this.method1117(arg0, var9, var5, var10, var4.field7704[this.field2330 - 1]);
                        if (this.field2326 >= var5) {
                            return;
                        }
                        this.field2326 = var6 - 1 - (var6 - 1 - this.field2326) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method1098(arg0, var9, var6, var10, var4.field7704[this.field2321]);
                        if (this.field2326 < var6) {
                            return;
                        }
                        this.field2326 = (this.field2326 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field2323 > 0) {
                    if (this.field2329) {
                        label130: {
                            if (this.field2331 < 0) {
                                var9 = this.method1117(arg0, arg1, var5, var10, var4.field7704[this.field2321]);
                                if (this.field2326 >= var5) {
                                    return;
                                }
                                this.field2326 = var5 + var5 - 1 - this.field2326;
                                this.field2331 = -this.field2331;
                                if (--this.field2323 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method1098(arg0, var9, var6, var10, var4.field7704[this.field2330 - 1]);
                                if (this.field2326 < var6) {
                                    return;
                                }
                                this.field2326 = var6 + var6 - 1 - this.field2326;
                                this.field2331 = -this.field2331;
                                if (--this.field2323 == 0) {
                                    break;
                                }
                                var9 = this.method1117(arg0, var9, var5, var10, var4.field7704[this.field2321]);
                                if (this.field2326 >= var5) {
                                    return;
                                }
                                this.field2326 = var5 + var5 - 1 - this.field2326;
                                this.field2331 = -this.field2331;
                            } while (--this.field2323 != 0);
                        }
                    } else if (this.field2331 < 0) {
                        while (true) {
                            var9 = this.method1117(arg0, var9, var5, var10, var4.field7704[this.field2330 - 1]);
                            if (this.field2326 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field2326) / var8;
                            if (var12 >= this.field2323) {
                                this.field2326 += this.field2323 * var8;
                                this.field2323 = 0;
                                break;
                            }
                            this.field2326 += var8 * var12;
                            this.field2323 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method1098(arg0, var9, var6, var10, var4.field7704[this.field2321]);
                            if (this.field2326 < var6) {
                                return;
                            }
                            int var13 = (this.field2326 - var5) / var8;
                            if (var13 >= this.field2323) {
                                this.field2326 -= this.field2323 * var8;
                                this.field2323 = 0;
                                break;
                            }
                            this.field2326 -= var8 * var13;
                            this.field2323 -= var13;
                        }
                    }
                }
                if (this.field2331 < 0) {
                    this.method1117(arg0, var9, 0, var10, 0);
                    if (this.field2326 < 0) {
                        this.field2326 = -1;
                        this.method1119();
                        this.method2108(true);
                        return;
                    }
                } else {
                    this.method1098(arg0, var9, var7, var10, 0);
                    if (this.field2326 >= var7) {
                        this.field2326 = var7;
                        this.method1119();
                        this.method2108(true);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nt", name = "e", descriptor = "(I)V")
    public final synchronized void method1086(int arg0) {
        this.method1111(arg0 << 6, this.method1109());
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(I[B[IIIIIIIIIILnt;)I")
    private static final int method1087(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class189 arg12) {
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
        arg12.field2324 += (var19 - arg4) * arg12.field2333;
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
        arg12.field2322 = var15 >> 2;
        arg12.field2334 = var16 >> 2;
        arg12.field2326 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!nt", name = "c", descriptor = "()Lbk;")
    public final class317 method926() {
        return null;
    }

    @OriginalMember(owner = "client!nt", name = "e", descriptor = "()Z")
    public final boolean method1088() {
        return this.field2326 < 0 || this.field2326 >= ((class534) super.field4610).field7704.length << 8;
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(Lte;II)Lnt;")
    public static final class189 method1089(class534 arg0, int arg1, int arg2) {
        return arg0.field7704 != null && arg0.field7704.length != 0 ? new class189(arg0, (int) ((long) arg0.field7702 * 256L * (long) arg1 / (long) (class292.field4050 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(I)V")
    public final synchronized void method929(int arg0) {
        if (this.field2332 > 0) {
            if (arg0 >= this.field2332) {
                if (this.field2327 == Integer.MIN_VALUE) {
                    this.field2327 = 0;
                    this.field2324 = this.field2322 = this.field2334 = 0;
                    this.method2108(true);
                    arg0 = this.field2332;
                }
                this.field2332 = 0;
                this.method1116();
            } else {
                this.field2324 += this.field2333 * arg0;
                this.field2322 += this.field2325 * arg0;
                this.field2334 += this.field2320 * arg0;
                this.field2332 -= arg0;
            }
        }
        class534 var2 = (class534) super.field4610;
        int var3 = this.field2321 << 8;
        int var4 = this.field2330 << 8;
        int var5 = var2.field7704.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field2323 = 0;
        }
        if (this.field2326 < 0) {
            if (this.field2331 <= 0) {
                this.method1119();
                this.method2108(true);
                return;
            }
            this.field2326 = 0;
        }
        if (this.field2326 >= var5) {
            if (this.field2331 >= 0) {
                this.method1119();
                this.method2108(true);
                return;
            }
            this.field2326 = var5 - 1;
        }
        this.field2326 += this.field2331 * arg0;
        if (this.field2323 < 0) {
            if (!this.field2329) {
                if (this.field2331 < 0) {
                    if (this.field2326 < var3) {
                        this.field2326 = var4 - 1 - (var4 - 1 - this.field2326) % var6;
                    }
                } else if (this.field2326 >= var4) {
                    this.field2326 = (this.field2326 - var3) % var6 + var3;
                }
            } else {
                if (this.field2331 < 0) {
                    if (this.field2326 >= var3) {
                        return;
                    }
                    this.field2326 = var3 + var3 - 1 - this.field2326;
                    this.field2331 = -this.field2331;
                }
                while (this.field2326 >= var4) {
                    this.field2326 = var4 + var4 - 1 - this.field2326;
                    this.field2331 = -this.field2331;
                    if (this.field2326 >= var3) {
                        return;
                    }
                    this.field2326 = var3 + var3 - 1 - this.field2326;
                    this.field2331 = -this.field2331;
                }
            }
        } else {
            if (this.field2323 > 0) {
                if (this.field2329) {
                    label125: {
                        if (this.field2331 < 0) {
                            if (this.field2326 >= var3) {
                                return;
                            }
                            this.field2326 = var3 + var3 - 1 - this.field2326;
                            this.field2331 = -this.field2331;
                            if (--this.field2323 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field2326 < var4) {
                                return;
                            }
                            this.field2326 = var4 + var4 - 1 - this.field2326;
                            this.field2331 = -this.field2331;
                            if (--this.field2323 == 0) {
                                break;
                            }
                            if (this.field2326 >= var3) {
                                return;
                            }
                            this.field2326 = var3 + var3 - 1 - this.field2326;
                            this.field2331 = -this.field2331;
                        } while (--this.field2323 != 0);
                    }
                } else if (this.field2331 < 0) {
                    if (this.field2326 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field2326) / var6;
                    if (var7 < this.field2323) {
                        this.field2326 += var6 * var7;
                        this.field2323 -= var7;
                        return;
                    }
                    this.field2326 += this.field2323 * var6;
                    this.field2323 = 0;
                } else {
                    if (this.field2326 < var4) {
                        return;
                    }
                    int var8 = (this.field2326 - var3) / var6;
                    if (var8 < this.field2323) {
                        this.field2326 -= var6 * var8;
                        this.field2323 -= var8;
                        return;
                    }
                    this.field2326 -= this.field2323 * var6;
                    this.field2323 = 0;
                }
            }
            if (this.field2331 < 0) {
                if (this.field2326 < 0) {
                    this.field2326 = -1;
                    this.method1119();
                    this.method2108(true);
                    return;
                }
            } else if (this.field2326 >= var5) {
                this.field2326 = var5;
                this.method1119();
                this.method2108(true);
            }
        }
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(II[B[IIIIIIIILnt;II)I")
    private static final int method1090(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class189 arg11, int arg12, int arg13) {
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
        arg11.field2326 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(II[B[IIIIIIILnt;II)I")
    private static final int method1091(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class189 arg10, int arg11, int arg12) {
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
        arg10.field2326 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "([B[IIIIIIILnt;)I")
    private static final int method1092(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class189 arg8) {
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
        arg8.field2326 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "([B[IIIIIIIILnt;)I")
    private static final int method1093(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class189 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field2322 += (var14 - arg3) * arg9.field2325;
        arg9.field2334 += (var14 - arg3) * arg9.field2320;
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
        arg9.field2324 = var12 >> 2;
        arg9.field2326 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!nt", name = "f", descriptor = "(I)V")
    public final synchronized void method1094(int arg0) {
        int var2 = ((class534) super.field4610).field7704.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field2326 = arg0;
    }

    @OriginalMember(owner = "client!nt", name = "b", descriptor = "(II[B[IIIIIIILnt;II)I")
    private static final int method1095(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class189 arg10, int arg11, int arg12) {
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
        arg10.field2326 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(I[B[IIIIIIIILnt;)I")
    private static final int method1096(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class189 arg10) {
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
        arg10.field2326 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!nt", name = "b", descriptor = "(II)I")
    private static final int method1097(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "([IIIII)I")
    private final int method1098(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field2332 <= 0) {
                if (this.field2331 == 256 && (this.field2326 & 255) == 0) {
                    if (class325.field4696) {
                        return method1096(0, ((class534) super.field4610).field7704, arg0, this.field2326, arg1, this.field2322, this.field2334, 0, arg3, arg2, this);
                    }
                    return method1092(((class534) super.field4610).field7704, arg0, this.field2326, arg1, this.field2324, 0, arg3, arg2, this);
                }
                if (class325.field4696) {
                    return method1121(0, 0, ((class534) super.field4610).field7704, arg0, this.field2326, arg1, this.field2322, this.field2334, 0, arg3, arg2, this, this.field2331, arg4);
                }
                return method1095(0, 0, ((class534) super.field4610).field7704, arg0, this.field2326, arg1, this.field2324, 0, arg3, arg2, this, this.field2331, arg4);
            }
            int var6 = this.field2332 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field2332 += arg1;
            if (this.field2331 == 256 && (this.field2326 & 255) == 0) {
                if (class325.field4696) {
                    arg1 = method1118(0, ((class534) super.field4610).field7704, arg0, this.field2326, arg1, this.field2322, this.field2334, this.field2325, this.field2320, 0, var6, arg2, this);
                } else {
                    arg1 = method1103(((class534) super.field4610).field7704, arg0, this.field2326, arg1, this.field2324, this.field2333, 0, var6, arg2, this);
                }
            } else if (class325.field4696) {
                arg1 = method1114(0, 0, ((class534) super.field4610).field7704, arg0, this.field2326, arg1, this.field2322, this.field2334, this.field2325, this.field2320, 0, var6, arg2, this, this.field2331, arg4);
            } else {
                arg1 = method1110(0, 0, ((class534) super.field4610).field7704, arg0, this.field2326, arg1, this.field2324, this.field2333, 0, var6, arg2, this, this.field2331, arg4);
            }
            this.field2332 -= arg1;
            if (this.field2332 != 0) {
                return arg1;
            }
        } while (!this.method1104());
        return arg3;
    }

    @OriginalMember(owner = "client!nt", name = "g", descriptor = "(I)V")
    public final synchronized void method1099(int arg0) {
        if (this.field2331 < 0) {
            this.field2331 = -arg0;
        } else {
            this.field2331 = arg0;
        }
    }

    @OriginalMember(owner = "client!nt", name = "h", descriptor = "(I)V")
    private final synchronized void method1100(int arg0) {
        this.method1111(arg0, this.method1109());
    }

    @OriginalMember(owner = "client!nt", name = "b", descriptor = "(II[B[IIIIIIIILnt;II)I")
    private static final int method1101(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class189 arg11, int arg12, int arg13) {
        arg11.field2322 -= arg11.field2325 * arg5;
        arg11.field2334 -= arg11.field2320 * arg5;
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
        arg11.field2322 += arg11.field2325 * arg5;
        arg11.field2334 += arg11.field2320 * arg5;
        arg11.field2324 = arg6;
        arg11.field2326 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!nt", name = "f", descriptor = "()I")
    public final synchronized int method1102() {
        return this.field2331 < 0 ? -this.field2331 : this.field2331;
    }

    @OriginalMember(owner = "client!nt", name = "b", descriptor = "([B[IIIIIIIILnt;)I")
    private static final int method1103(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class189 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field2322 += (var14 - arg3) * arg9.field2325;
        arg9.field2334 += (var14 - arg3) * arg9.field2320;
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
        arg9.field2324 = var12 >> 2;
        arg9.field2326 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!nt", name = "g", descriptor = "()Z")
    private final boolean method1104() {
        int var1 = this.field2327;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1097(var1, this.field2328);
            var2 = method1085(var1, this.field2328);
        }
        if (this.field2324 == var1 && this.field2322 == var3 && this.field2334 == var2) {
            if (this.field2327 == Integer.MIN_VALUE) {
                this.field2327 = 0;
                this.field2324 = this.field2322 = this.field2334 = 0;
                this.method2108(true);
                return true;
            } else {
                this.method1116();
                return false;
            }
        } else {
            if (this.field2324 < var1) {
                this.field2333 = 1;
                this.field2332 = var1 - this.field2324;
            } else if (this.field2324 > var1) {
                this.field2333 = -1;
                this.field2332 = this.field2324 - var1;
            } else {
                this.field2333 = 0;
            }
            if (this.field2322 < var3) {
                this.field2325 = 1;
                if (this.field2332 == 0 || this.field2332 > var3 - this.field2322) {
                    this.field2332 = var3 - this.field2322;
                }
            } else if (this.field2322 > var3) {
                this.field2325 = -1;
                if (this.field2332 == 0 || this.field2332 > this.field2322 - var3) {
                    this.field2332 = this.field2322 - var3;
                }
            } else {
                this.field2325 = 0;
            }
            if (this.field2334 < var2) {
                this.field2320 = 1;
                if (this.field2332 == 0 || this.field2332 > var2 - this.field2334) {
                    this.field2332 = var2 - this.field2334;
                }
            } else if (this.field2334 > var2) {
                this.field2320 = -1;
                if (this.field2332 == 0 || this.field2332 > this.field2334 - var2) {
                    this.field2332 = this.field2334 - var2;
                }
            } else {
                this.field2320 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!nt", name = "c", descriptor = "(II)V")
    public final synchronized void method1105(int arg0, int arg1) {
        this.method1122(arg0, arg1, this.method1109());
    }

    @OriginalMember(owner = "client!nt", name = "b", descriptor = "([B[IIIIIIILnt;)I")
    private static final int method1106(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class189 arg8) {
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
        arg8.field2326 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!nt", name = "i", descriptor = "(I)V")
    public final synchronized void method1107(int arg0) {
        if (arg0 == 0) {
            this.method1100(0);
            this.method2108(true);
        } else if (this.field2322 == 0 && this.field2334 == 0) {
            this.field2332 = 0;
            this.field2327 = 0;
            this.field2324 = 0;
            this.method2108(true);
        } else {
            int var2 = -this.field2324;
            if (this.field2324 > var2) {
                var2 = this.field2324;
            }
            if (-this.field2322 > var2) {
                var2 = -this.field2322;
            }
            if (this.field2322 > var2) {
                var2 = this.field2322;
            }
            if (-this.field2334 > var2) {
                var2 = -this.field2334;
            }
            if (this.field2334 > var2) {
                var2 = this.field2334;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field2332 = arg0;
            this.field2327 = Integer.MIN_VALUE;
            this.field2333 = -this.field2324 / arg0;
            this.field2325 = -this.field2322 / arg0;
            this.field2320 = -this.field2334 / arg0;
        }
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(II[B[IIIIIIIIIILnt;II)I")
    private static final int method1108(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class189 arg13, int arg14, int arg15) {
        arg13.field2324 -= arg13.field2333 * arg5;
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
        arg13.field2324 += arg13.field2333 * var22;
        arg13.field2322 = arg6;
        arg13.field2334 = arg7;
        arg13.field2326 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!nt", name = "h", descriptor = "()I")
    public final synchronized int method1109() {
        return this.field2328 < 0 ? -1 : this.field2328;
    }

    @OriginalMember(owner = "client!nt", name = "c", descriptor = "(II[B[IIIIIIIILnt;II)I")
    private static final int method1110(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class189 arg11, int arg12, int arg13) {
        arg11.field2322 -= arg11.field2325 * arg5;
        arg11.field2334 -= arg11.field2320 * arg5;
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
        arg11.field2322 += arg11.field2325 * arg5;
        arg11.field2334 += arg11.field2320 * arg5;
        arg11.field2324 = arg6;
        arg11.field2326 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!nt", name = "d", descriptor = "(II)V")
    private final synchronized void method1111(int arg0, int arg1) {
        this.field2327 = arg0;
        this.field2328 = arg1;
        this.field2332 = 0;
        this.method1116();
    }

    @OriginalMember(owner = "client!nt", name = "j", descriptor = "(I)V")
    public final synchronized void method1112(int arg0) {
        this.field2323 = arg0;
    }

    @OriginalMember(owner = "client!nt", name = "i", descriptor = "()Z")
    public final boolean method1113() {
        return this.field2332 != 0;
    }

    @OriginalMember(owner = "client!nt", name = "b", descriptor = "(II[B[IIIIIIIIIILnt;II)I")
    private static final int method1114(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class189 arg13, int arg14, int arg15) {
        arg13.field2324 -= arg13.field2333 * arg5;
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
        arg13.field2324 += arg13.field2333 * var22;
        arg13.field2322 = arg6;
        arg13.field2334 = arg7;
        arg13.field2326 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "()I")
    public final int method935() {
        return this.field2327 == 0 && this.field2332 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!nt", name = "j", descriptor = "()I")
    public final synchronized int method1115() {
        return this.field2327 == Integer.MIN_VALUE ? 0 : this.field2327;
    }

    @OriginalMember(owner = "client!nt", name = "k", descriptor = "()V")
    private final void method1116() {
        this.field2324 = this.field2327;
        this.field2322 = method1097(this.field2327, this.field2328);
        this.field2334 = method1085(this.field2327, this.field2328);
    }

    @OriginalMember(owner = "client!nt", name = "<init>", descriptor = "(Lte;II)V")
    private class189(class534 arg0, int arg1, int arg2) {
        super.field4610 = arg0;
        this.field2321 = arg0.field7701;
        this.field2330 = arg0.field7703;
        this.field2329 = arg0.field7700;
        this.field2331 = arg1;
        this.field2327 = arg2;
        this.field2328 = 8192;
        this.field2326 = 0;
        this.method1116();
    }

    @OriginalMember(owner = "client!nt", name = "<init>", descriptor = "(Lte;III)V")
    private class189(class534 arg0, int arg1, int arg2, int arg3) {
        super.field4610 = arg0;
        this.field2321 = arg0.field7701;
        this.field2330 = arg0.field7703;
        this.field2329 = arg0.field7700;
        this.field2331 = arg1;
        this.field2327 = arg2;
        this.field2328 = arg3;
        this.field2326 = 0;
        this.method1116();
    }

    @OriginalMember(owner = "client!nt", name = "b", descriptor = "([IIIII)I")
    private final int method1117(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field2332 <= 0) {
                if (this.field2331 == -256 && (this.field2326 & 255) == 0) {
                    if (class325.field4696) {
                        return method1123(0, ((class534) super.field4610).field7704, arg0, this.field2326, arg1, this.field2322, this.field2334, 0, arg3, arg2, this);
                    }
                    return method1106(((class534) super.field4610).field7704, arg0, this.field2326, arg1, this.field2324, 0, arg3, arg2, this);
                }
                if (class325.field4696) {
                    return method1090(0, 0, ((class534) super.field4610).field7704, arg0, this.field2326, arg1, this.field2322, this.field2334, 0, arg3, arg2, this, this.field2331, arg4);
                }
                return method1091(0, 0, ((class534) super.field4610).field7704, arg0, this.field2326, arg1, this.field2324, 0, arg3, arg2, this, this.field2331, arg4);
            }
            int var6 = this.field2332 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field2332 += arg1;
            if (this.field2331 == -256 && (this.field2326 & 255) == 0) {
                if (class325.field4696) {
                    arg1 = method1087(0, ((class534) super.field4610).field7704, arg0, this.field2326, arg1, this.field2322, this.field2334, this.field2325, this.field2320, 0, var6, arg2, this);
                } else {
                    arg1 = method1093(((class534) super.field4610).field7704, arg0, this.field2326, arg1, this.field2324, this.field2333, 0, var6, arg2, this);
                }
            } else if (class325.field4696) {
                arg1 = method1108(0, 0, ((class534) super.field4610).field7704, arg0, this.field2326, arg1, this.field2322, this.field2334, this.field2325, this.field2320, 0, var6, arg2, this, this.field2331, arg4);
            } else {
                arg1 = method1101(0, 0, ((class534) super.field4610).field7704, arg0, this.field2326, arg1, this.field2324, this.field2333, 0, var6, arg2, this, this.field2331, arg4);
            }
            this.field2332 -= arg1;
            if (this.field2332 != 0) {
                return arg1;
            }
        } while (!this.method1104());
        return arg3;
    }

    @OriginalMember(owner = "client!nt", name = "b", descriptor = "(I[B[IIIIIIIIIILnt;)I")
    private static final int method1118(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class189 arg12) {
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
        arg12.field2324 += (var19 - arg4) * arg12.field2333;
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
        arg12.field2322 = var15 >> 2;
        arg12.field2334 = var16 >> 2;
        arg12.field2326 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!nt", name = "l", descriptor = "()V")
    private final void method1119() {
        if (this.field2332 != 0) {
            if (this.field2327 == Integer.MIN_VALUE) {
                this.field2327 = 0;
            }
            this.field2332 = 0;
            this.method1116();
        }
    }

    @OriginalMember(owner = "client!nt", name = "d", descriptor = "()I")
    public final int method1120() {
        int var1 = this.field2324 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field2323 == 0) {
            var2 -= this.field2326 * var2 / (((class534) super.field4610).field7704.length << 8);
        } else if (this.field2323 >= 0) {
            var2 -= this.field2321 * var2 / ((class534) super.field4610).field7704.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!nt", name = "d", descriptor = "(II[B[IIIIIIIILnt;II)I")
    private static final int method1121(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class189 arg11, int arg12, int arg13) {
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
        arg11.field2326 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(III)V")
    public final synchronized void method1122(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1111(arg1, arg2);
        } else {
            int var4 = method1097(arg1, arg2);
            int var5 = method1085(arg1, arg2);
            if (this.field2322 == var4 && this.field2334 == var5) {
                this.field2332 = 0;
            } else {
                int var6 = arg1 - this.field2324;
                if (this.field2324 - arg1 > var6) {
                    var6 = this.field2324 - arg1;
                }
                if (var4 - this.field2322 > var6) {
                    var6 = var4 - this.field2322;
                }
                if (this.field2322 - var4 > var6) {
                    var6 = this.field2322 - var4;
                }
                if (var5 - this.field2334 > var6) {
                    var6 = var5 - this.field2334;
                }
                if (this.field2334 - var5 > var6) {
                    var6 = this.field2334 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field2332 = arg0;
                this.field2327 = arg1;
                this.field2328 = arg2;
                this.field2333 = (arg1 - this.field2324) / arg0;
                this.field2325 = (var4 - this.field2322) / arg0;
                this.field2320 = (var5 - this.field2334) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!nt", name = "b", descriptor = "(I[B[IIIIIIIILnt;)I")
    private static final int method1123(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class189 arg10) {
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
        arg10.field2326 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(Lte;III)Lnt;")
    public static final class189 method1124(class534 arg0, int arg1, int arg2, int arg3) {
        return arg0.field7704 != null && arg0.field7704.length != 0 ? new class189(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!nt", name = "b", descriptor = "()Lbk;")
    public final class317 method925() {
        return null;
    }
}
