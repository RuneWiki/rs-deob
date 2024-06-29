import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sv")
public class class394 extends class313 {

    @OriginalMember(owner = "client!sv", name = "r", descriptor = "I")
    private int field5972;

    @OriginalMember(owner = "client!sv", name = "D", descriptor = "I")
    private int field5983;

    @OriginalMember(owner = "client!sv", name = "x", descriptor = "Z")
    private boolean field5978;

    @OriginalMember(owner = "client!sv", name = "C", descriptor = "I")
    private int field5982;

    @OriginalMember(owner = "client!sv", name = "E", descriptor = "I")
    private int field5984;

    @OriginalMember(owner = "client!sv", name = "s", descriptor = "I")
    private int field5973;

    @OriginalMember(owner = "client!sv", name = "u", descriptor = "I")
    private int field5975;

    @OriginalMember(owner = "client!sv", name = "p", descriptor = "I")
    private int field5970;

    @OriginalMember(owner = "client!sv", name = "q", descriptor = "I")
    private int field5971;

    @OriginalMember(owner = "client!sv", name = "t", descriptor = "I")
    private int field5974;

    @OriginalMember(owner = "client!sv", name = "v", descriptor = "I")
    private int field5976;

    @OriginalMember(owner = "client!sv", name = "w", descriptor = "I")
    private int field5977;

    @OriginalMember(owner = "client!sv", name = "y", descriptor = "I")
    private int field5979;

    @OriginalMember(owner = "client!sv", name = "z", descriptor = "I")
    private int field5980;

    @OriginalMember(owner = "client!sv", name = "B", descriptor = "I")
    private int field5981;

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "([B[IIIIIIILsv;)I")
    private static final int method2511(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class394 arg8) {
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
        arg8.field5975 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(Llf;III)Lsv;")
    public static final class394 method2512(class391 arg0, int arg1, int arg2, int arg3) {
        return arg0.field5941 != null && arg0.field5941.length != 0 ? new class394(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(I[B[IIIIIIIIIILsv;)I")
    private static final int method2513(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class394 arg12) {
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
        arg12.field5981 += (var19 - arg4) * arg12.field5977;
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
        arg12.field5976 = var15 >> 2;
        arg12.field5979 = var16 >> 2;
        arg12.field5975 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!sv", name = "d", descriptor = "()Lnu;")
    public final class313 method400() {
        return null;
    }

    @OriginalMember(owner = "client!sv", name = "e", descriptor = "()V")
    private final void method2514() {
        if (this.field5974 != 0) {
            if (this.field5984 == Integer.MIN_VALUE) {
                this.field5984 = 0;
            }
            this.field5974 = 0;
            this.method2533();
        }
    }

    @OriginalMember(owner = "client!sv", name = "b", descriptor = "(I)V")
    public final synchronized void method2515(int arg0) {
        int var2 = ((class391) super.field4908).field5941.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field5975 = arg0;
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(III)V")
    public final synchronized void method2516(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method2525(arg1, arg2);
        } else {
            int var4 = method2535(arg1, arg2);
            int var5 = method2529(arg1, arg2);
            if (this.field5976 == var4 && this.field5979 == var5) {
                this.field5974 = 0;
            } else {
                int var6 = arg1 - this.field5981;
                if (this.field5981 - arg1 > var6) {
                    var6 = this.field5981 - arg1;
                }
                if (var4 - this.field5976 > var6) {
                    var6 = var4 - this.field5976;
                }
                if (this.field5976 - var4 > var6) {
                    var6 = this.field5976 - var4;
                }
                if (var5 - this.field5979 > var6) {
                    var6 = var5 - this.field5979;
                }
                if (this.field5979 - var5 > var6) {
                    var6 = this.field5979 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field5974 = arg0;
                this.field5984 = arg1;
                this.field5973 = arg2;
                this.field5977 = (arg1 - this.field5981) / arg0;
                this.field5971 = (var4 - this.field5976) / arg0;
                this.field5980 = (var5 - this.field5979) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "()I")
    public final int method2098() {
        int var1 = this.field5981 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field5970 == 0) {
            var2 -= this.field5975 * var2 / (((class391) super.field4908).field5941.length << 8);
        } else if (this.field5970 >= 0) {
            var2 -= this.field5972 * var2 / ((class391) super.field4908).field5941.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "([IIIII)I")
    private final int method2517(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field5974 <= 0) {
                if (this.field5982 == 256 && (this.field5975 & 255) == 0) {
                    if (class309.field4835) {
                        return method2544(0, ((class391) super.field4908).field5941, arg0, this.field5975, arg1, this.field5976, this.field5979, 0, arg3, arg2, this);
                    }
                    return method2511(((class391) super.field4908).field5941, arg0, this.field5975, arg1, this.field5981, 0, arg3, arg2, this);
                }
                if (class309.field4835) {
                    return method2527(0, 0, ((class391) super.field4908).field5941, arg0, this.field5975, arg1, this.field5976, this.field5979, 0, arg3, arg2, this, this.field5982, arg4);
                }
                return method2550(0, 0, ((class391) super.field4908).field5941, arg0, this.field5975, arg1, this.field5981, 0, arg3, arg2, this, this.field5982, arg4);
            }
            int var6 = this.field5974 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field5974 += arg1;
            if (this.field5982 == 256 && (this.field5975 & 255) == 0) {
                if (class309.field4835) {
                    arg1 = method2513(0, ((class391) super.field4908).field5941, arg0, this.field5975, arg1, this.field5976, this.field5979, this.field5971, this.field5980, 0, var6, arg2, this);
                } else {
                    arg1 = method2528(((class391) super.field4908).field5941, arg0, this.field5975, arg1, this.field5981, this.field5977, 0, var6, arg2, this);
                }
            } else if (class309.field4835) {
                arg1 = method2545(0, 0, ((class391) super.field4908).field5941, arg0, this.field5975, arg1, this.field5976, this.field5979, this.field5971, this.field5980, 0, var6, arg2, this, this.field5982, arg4);
            } else {
                arg1 = method2520(0, 0, ((class391) super.field4908).field5941, arg0, this.field5975, arg1, this.field5981, this.field5977, 0, var6, arg2, this, this.field5982, arg4);
            }
            this.field5974 -= arg1;
            if (this.field5974 != 0) {
                return arg1;
            }
        } while (!this.method2541());
        return arg3;
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(II[B[IIIIIIIIIILsv;II)I")
    private static final int method2518(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class394 arg13, int arg14, int arg15) {
        arg13.field5981 -= arg13.field5977 * arg5;
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
        arg13.field5981 += arg13.field5977 * var22;
        arg13.field5976 = arg6;
        arg13.field5979 = arg7;
        arg13.field5975 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!sv", name = "f", descriptor = "()I")
    public final synchronized int method2519() {
        return this.field5982 < 0 ? -this.field5982 : this.field5982;
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(II[B[IIIIIIIILsv;II)I")
    private static final int method2520(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class394 arg11, int arg12, int arg13) {
        arg11.field5976 -= arg11.field5971 * arg5;
        arg11.field5979 -= arg11.field5980 * arg5;
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
        arg11.field5976 += arg11.field5971 * arg5;
        arg11.field5979 += arg11.field5980 * arg5;
        arg11.field5981 = arg6;
        arg11.field5975 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!sv", name = "c", descriptor = "(I)V")
    public final synchronized void method2521(int arg0) {
        this.field5970 = arg0;
    }

    @OriginalMember(owner = "client!sv", name = "b", descriptor = "(II[B[IIIIIIIILsv;II)I")
    private static final int method2522(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class394 arg11, int arg12, int arg13) {
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
        arg11.field5975 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!sv", name = "b", descriptor = "([B[IIIIIIILsv;)I")
    private static final int method2523(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class394 arg8) {
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
        arg8.field5975 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!sv", name = "c", descriptor = "()I")
    public final int method385() {
        return this.field5984 == 0 && this.field5974 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(Llf;II)Lsv;")
    public static final class394 method2524(class391 arg0, int arg1, int arg2) {
        return arg0.field5941 != null && arg0.field5941.length != 0 ? new class394(arg0, (int) ((long) arg0.field5943 * 256L * (long) arg1 / (long) (class221.field3742 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(I)V")
    public final synchronized void method383(int arg0) {
        if (this.field5974 > 0) {
            if (arg0 >= this.field5974) {
                if (this.field5984 == Integer.MIN_VALUE) {
                    this.field5984 = 0;
                    this.field5981 = this.field5976 = this.field5979 = 0;
                    this.method3149(105);
                    arg0 = this.field5974;
                }
                this.field5974 = 0;
                this.method2533();
            } else {
                this.field5981 += this.field5977 * arg0;
                this.field5976 += this.field5971 * arg0;
                this.field5979 += this.field5980 * arg0;
                this.field5974 -= arg0;
            }
        }
        class391 var2 = (class391) super.field4908;
        int var3 = this.field5972 << 8;
        int var4 = this.field5983 << 8;
        int var5 = var2.field5941.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field5970 = 0;
        }
        if (this.field5975 < 0) {
            if (this.field5982 <= 0) {
                this.method2514();
                this.method3149(111);
                return;
            }
            this.field5975 = 0;
        }
        if (this.field5975 >= var5) {
            if (this.field5982 >= 0) {
                this.method2514();
                this.method3149(96);
                return;
            }
            this.field5975 = var5 - 1;
        }
        this.field5975 += this.field5982 * arg0;
        if (this.field5970 < 0) {
            if (!this.field5978) {
                if (this.field5982 < 0) {
                    if (this.field5975 < var3) {
                        this.field5975 = var4 - 1 - (var4 - 1 - this.field5975) % var6;
                    }
                } else if (this.field5975 >= var4) {
                    this.field5975 = (this.field5975 - var3) % var6 + var3;
                }
            } else {
                if (this.field5982 < 0) {
                    if (this.field5975 >= var3) {
                        return;
                    }
                    this.field5975 = var3 + var3 - 1 - this.field5975;
                    this.field5982 = -this.field5982;
                }
                while (this.field5975 >= var4) {
                    this.field5975 = var4 + var4 - 1 - this.field5975;
                    this.field5982 = -this.field5982;
                    if (this.field5975 >= var3) {
                        return;
                    }
                    this.field5975 = var3 + var3 - 1 - this.field5975;
                    this.field5982 = -this.field5982;
                }
            }
        } else {
            if (this.field5970 > 0) {
                if (this.field5978) {
                    label125: {
                        if (this.field5982 < 0) {
                            if (this.field5975 >= var3) {
                                return;
                            }
                            this.field5975 = var3 + var3 - 1 - this.field5975;
                            this.field5982 = -this.field5982;
                            if (--this.field5970 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field5975 < var4) {
                                return;
                            }
                            this.field5975 = var4 + var4 - 1 - this.field5975;
                            this.field5982 = -this.field5982;
                            if (--this.field5970 == 0) {
                                break;
                            }
                            if (this.field5975 >= var3) {
                                return;
                            }
                            this.field5975 = var3 + var3 - 1 - this.field5975;
                            this.field5982 = -this.field5982;
                        } while (--this.field5970 != 0);
                    }
                } else if (this.field5982 < 0) {
                    if (this.field5975 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field5975) / var6;
                    if (var7 < this.field5970) {
                        this.field5975 += var6 * var7;
                        this.field5970 -= var7;
                        return;
                    }
                    this.field5975 += this.field5970 * var6;
                    this.field5970 = 0;
                } else {
                    if (this.field5975 < var4) {
                        return;
                    }
                    int var8 = (this.field5975 - var3) / var6;
                    if (var8 < this.field5970) {
                        this.field5975 -= var6 * var8;
                        this.field5970 -= var8;
                        return;
                    }
                    this.field5975 -= this.field5970 * var6;
                    this.field5970 = 0;
                }
            }
            if (this.field5982 < 0) {
                if (this.field5975 < 0) {
                    this.field5975 = -1;
                    this.method2514();
                    this.method3149(69);
                    return;
                }
            } else if (this.field5975 >= var5) {
                this.field5975 = var5;
                this.method2514();
                this.method3149(115);
            }
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(II)V")
    private final synchronized void method2525(int arg0, int arg1) {
        this.field5984 = arg0;
        this.field5973 = arg1;
        this.field5974 = 0;
        this.method2533();
    }

    @OriginalMember(owner = "client!sv", name = "b", descriptor = "([IIIII)I")
    private final int method2526(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field5974 <= 0) {
                if (this.field5982 == -256 && (this.field5975 & 255) == 0) {
                    if (class309.field4835) {
                        return method2546(0, ((class391) super.field4908).field5941, arg0, this.field5975, arg1, this.field5976, this.field5979, 0, arg3, arg2, this);
                    }
                    return method2523(((class391) super.field4908).field5941, arg0, this.field5975, arg1, this.field5981, 0, arg3, arg2, this);
                }
                if (class309.field4835) {
                    return method2522(0, 0, ((class391) super.field4908).field5941, arg0, this.field5975, arg1, this.field5976, this.field5979, 0, arg3, arg2, this, this.field5982, arg4);
                }
                return method2543(0, 0, ((class391) super.field4908).field5941, arg0, this.field5975, arg1, this.field5981, 0, arg3, arg2, this, this.field5982, arg4);
            }
            int var6 = this.field5974 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field5974 += arg1;
            if (this.field5982 == -256 && (this.field5975 & 255) == 0) {
                if (class309.field4835) {
                    arg1 = method2537(0, ((class391) super.field4908).field5941, arg0, this.field5975, arg1, this.field5976, this.field5979, this.field5971, this.field5980, 0, var6, arg2, this);
                } else {
                    arg1 = method2530(((class391) super.field4908).field5941, arg0, this.field5975, arg1, this.field5981, this.field5977, 0, var6, arg2, this);
                }
            } else if (class309.field4835) {
                arg1 = method2518(0, 0, ((class391) super.field4908).field5941, arg0, this.field5975, arg1, this.field5976, this.field5979, this.field5971, this.field5980, 0, var6, arg2, this, this.field5982, arg4);
            } else {
                arg1 = method2534(0, 0, ((class391) super.field4908).field5941, arg0, this.field5975, arg1, this.field5981, this.field5977, 0, var6, arg2, this, this.field5982, arg4);
            }
            this.field5974 -= arg1;
            if (this.field5974 != 0) {
                return arg1;
            }
        } while (!this.method2541());
        return arg3;
    }

    @OriginalMember(owner = "client!sv", name = "c", descriptor = "(II[B[IIIIIIIILsv;II)I")
    private static final int method2527(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class394 arg11, int arg12, int arg13) {
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
        arg11.field5975 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "([B[IIIIIIIILsv;)I")
    private static final int method2528(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class394 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field5976 += (var14 - arg3) * arg9.field5971;
        arg9.field5979 += (var14 - arg3) * arg9.field5980;
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
        arg9.field5981 = var12 >> 2;
        arg9.field5975 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!sv", name = "b", descriptor = "(II)I")
    private static final int method2529(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!sv", name = "b", descriptor = "([B[IIIIIIIILsv;)I")
    private static final int method2530(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class394 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field5976 += (var14 - arg3) * arg9.field5971;
        arg9.field5979 += (var14 - arg3) * arg9.field5980;
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
        arg9.field5981 = var12 >> 2;
        arg9.field5975 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!sv", name = "g", descriptor = "(I)V")
    public final synchronized void method2531(int arg0) {
        this.method2525(arg0 << 6, this.method2540());
    }

    @OriginalMember(owner = "client!sv", name = "g", descriptor = "()I")
    public final synchronized int method2532() {
        return this.field5984 == Integer.MIN_VALUE ? 0 : this.field5984;
    }

    @OriginalMember(owner = "client!sv", name = "h", descriptor = "()V")
    private final void method2533() {
        this.field5981 = this.field5984;
        this.field5976 = method2535(this.field5984, this.field5973);
        this.field5979 = method2529(this.field5984, this.field5973);
    }

    @OriginalMember(owner = "client!sv", name = "d", descriptor = "(II[B[IIIIIIIILsv;II)I")
    private static final int method2534(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class394 arg11, int arg12, int arg13) {
        arg11.field5976 -= arg11.field5971 * arg5;
        arg11.field5979 -= arg11.field5980 * arg5;
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
        arg11.field5976 += arg11.field5971 * arg5;
        arg11.field5979 += arg11.field5980 * arg5;
        arg11.field5981 = arg6;
        arg11.field5975 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!sv", name = "c", descriptor = "(II)I")
    private static final int method2535(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(Z)V")
    public final synchronized void method2536(boolean arg0) {
        this.field5982 = (this.field5982 >>> 31) + (this.field5982 ^ this.field5982 >> 31);
        if (arg0) {
            this.field5982 = -this.field5982;
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "([III)V")
    public final synchronized void method408(int[] arg0, int arg1, int arg2) {
        if (this.field5984 == 0 && this.field5974 == 0) {
            this.method383(arg2);
        } else {
            class391 var4 = (class391) super.field4908;
            int var5 = this.field5972 << 8;
            int var6 = this.field5983 << 8;
            int var7 = var4.field5941.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field5970 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field5975 < 0) {
                if (this.field5982 <= 0) {
                    this.method2514();
                    this.method3149(80);
                    return;
                }
                this.field5975 = 0;
            }
            if (this.field5975 >= var7) {
                if (this.field5982 >= 0) {
                    this.method2514();
                    this.method3149(85);
                    return;
                }
                this.field5975 = var7 - 1;
            }
            if (this.field5970 < 0) {
                if (this.field5978) {
                    if (this.field5982 < 0) {
                        var9 = this.method2526(arg0, arg1, var5, var10, var4.field5941[this.field5972]);
                        if (this.field5975 >= var5) {
                            return;
                        }
                        this.field5975 = var5 + var5 - 1 - this.field5975;
                        this.field5982 = -this.field5982;
                    }
                    while (true) {
                        int var11 = this.method2517(arg0, var9, var6, var10, var4.field5941[this.field5983 - 1]);
                        if (this.field5975 < var6) {
                            return;
                        }
                        this.field5975 = var6 + var6 - 1 - this.field5975;
                        this.field5982 = -this.field5982;
                        var9 = this.method2526(arg0, var11, var5, var10, var4.field5941[this.field5972]);
                        if (this.field5975 >= var5) {
                            return;
                        }
                        this.field5975 = var5 + var5 - 1 - this.field5975;
                        this.field5982 = -this.field5982;
                    }
                } else if (this.field5982 < 0) {
                    while (true) {
                        var9 = this.method2526(arg0, var9, var5, var10, var4.field5941[this.field5983 - 1]);
                        if (this.field5975 >= var5) {
                            return;
                        }
                        this.field5975 = var6 - 1 - (var6 - 1 - this.field5975) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method2517(arg0, var9, var6, var10, var4.field5941[this.field5972]);
                        if (this.field5975 < var6) {
                            return;
                        }
                        this.field5975 = (this.field5975 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field5970 > 0) {
                    if (this.field5978) {
                        label130: {
                            if (this.field5982 < 0) {
                                var9 = this.method2526(arg0, arg1, var5, var10, var4.field5941[this.field5972]);
                                if (this.field5975 >= var5) {
                                    return;
                                }
                                this.field5975 = var5 + var5 - 1 - this.field5975;
                                this.field5982 = -this.field5982;
                                if (--this.field5970 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method2517(arg0, var9, var6, var10, var4.field5941[this.field5983 - 1]);
                                if (this.field5975 < var6) {
                                    return;
                                }
                                this.field5975 = var6 + var6 - 1 - this.field5975;
                                this.field5982 = -this.field5982;
                                if (--this.field5970 == 0) {
                                    break;
                                }
                                var9 = this.method2526(arg0, var9, var5, var10, var4.field5941[this.field5972]);
                                if (this.field5975 >= var5) {
                                    return;
                                }
                                this.field5975 = var5 + var5 - 1 - this.field5975;
                                this.field5982 = -this.field5982;
                            } while (--this.field5970 != 0);
                        }
                    } else if (this.field5982 < 0) {
                        while (true) {
                            var9 = this.method2526(arg0, var9, var5, var10, var4.field5941[this.field5983 - 1]);
                            if (this.field5975 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field5975) / var8;
                            if (var12 >= this.field5970) {
                                this.field5975 += this.field5970 * var8;
                                this.field5970 = 0;
                                break;
                            }
                            this.field5975 += var8 * var12;
                            this.field5970 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method2517(arg0, var9, var6, var10, var4.field5941[this.field5972]);
                            if (this.field5975 < var6) {
                                return;
                            }
                            int var13 = (this.field5975 - var5) / var8;
                            if (var13 >= this.field5970) {
                                this.field5975 -= this.field5970 * var8;
                                this.field5970 = 0;
                                break;
                            }
                            this.field5975 -= var8 * var13;
                            this.field5970 -= var13;
                        }
                    }
                }
                if (this.field5982 < 0) {
                    this.method2526(arg0, var9, 0, var10, 0);
                    if (this.field5975 < 0) {
                        this.field5975 = -1;
                        this.method2514();
                        this.method3149(64);
                        return;
                    }
                } else {
                    this.method2517(arg0, var9, var7, var10, 0);
                    if (this.field5975 >= var7) {
                        this.field5975 = var7;
                        this.method2514();
                        this.method3149(68);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sv", name = "b", descriptor = "(I[B[IIIIIIIIIILsv;)I")
    private static final int method2537(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class394 arg12) {
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
        arg12.field5981 += (var19 - arg4) * arg12.field5977;
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
        arg12.field5976 = var15 >> 2;
        arg12.field5979 = var16 >> 2;
        arg12.field5975 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!sv", name = "i", descriptor = "()Z")
    public final boolean method2538() {
        return this.field5974 != 0;
    }

    @OriginalMember(owner = "client!sv", name = "h", descriptor = "(I)V")
    public final synchronized void method2539(int arg0) {
        if (this.field5982 < 0) {
            this.field5982 = -arg0;
        } else {
            this.field5982 = arg0;
        }
    }

    @OriginalMember(owner = "client!sv", name = "j", descriptor = "()I")
    public final synchronized int method2540() {
        return this.field5973 < 0 ? -1 : this.field5973;
    }

    @OriginalMember(owner = "client!sv", name = "k", descriptor = "()Z")
    private final boolean method2541() {
        int var1 = this.field5984;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method2535(var1, this.field5973);
            var2 = method2529(var1, this.field5973);
        }
        if (this.field5981 == var1 && this.field5976 == var3 && this.field5979 == var2) {
            if (this.field5984 == Integer.MIN_VALUE) {
                this.field5984 = 0;
                this.field5981 = this.field5976 = this.field5979 = 0;
                this.method3149(79);
                return true;
            } else {
                this.method2533();
                return false;
            }
        } else {
            if (this.field5981 < var1) {
                this.field5977 = 1;
                this.field5974 = var1 - this.field5981;
            } else if (this.field5981 > var1) {
                this.field5977 = -1;
                this.field5974 = this.field5981 - var1;
            } else {
                this.field5977 = 0;
            }
            if (this.field5976 < var3) {
                this.field5971 = 1;
                if (this.field5974 == 0 || this.field5974 > var3 - this.field5976) {
                    this.field5974 = var3 - this.field5976;
                }
            } else if (this.field5976 > var3) {
                this.field5971 = -1;
                if (this.field5974 == 0 || this.field5974 > this.field5976 - var3) {
                    this.field5974 = this.field5976 - var3;
                }
            } else {
                this.field5971 = 0;
            }
            if (this.field5979 < var2) {
                this.field5980 = 1;
                if (this.field5974 == 0 || this.field5974 > var2 - this.field5979) {
                    this.field5974 = var2 - this.field5979;
                }
            } else if (this.field5979 > var2) {
                this.field5980 = -1;
                if (this.field5974 == 0 || this.field5974 > this.field5979 - var2) {
                    this.field5974 = this.field5979 - var2;
                }
            } else {
                this.field5980 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!sv", name = "d", descriptor = "(II)V")
    public final synchronized void method2542(int arg0, int arg1) {
        this.method2516(arg0, arg1, this.method2540());
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(II[B[IIIIIIILsv;II)I")
    private static final int method2543(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class394 arg10, int arg11, int arg12) {
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
        arg10.field5975 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!sv", name = "b", descriptor = "()Lnu;")
    public final class313 method374() {
        return null;
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(I[B[IIIIIIIILsv;)I")
    private static final int method2544(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class394 arg10) {
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
        arg10.field5975 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!sv", name = "b", descriptor = "(II[B[IIIIIIIIIILsv;II)I")
    private static final int method2545(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class394 arg13, int arg14, int arg15) {
        arg13.field5981 -= arg13.field5977 * arg5;
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
        arg13.field5981 += arg13.field5977 * var22;
        arg13.field5976 = arg6;
        arg13.field5979 = arg7;
        arg13.field5975 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!sv", name = "b", descriptor = "(I[B[IIIIIIIILsv;)I")
    private static final int method2546(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class394 arg10) {
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
        arg10.field5975 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!sv", name = "i", descriptor = "(I)V")
    private final synchronized void method2547(int arg0) {
        this.method2525(arg0, this.method2540());
    }

    @OriginalMember(owner = "client!sv", name = "j", descriptor = "(I)V")
    public final synchronized void method2548(int arg0) {
        if (arg0 == 0) {
            this.method2547(0);
            this.method3149(108);
        } else if (this.field5976 == 0 && this.field5979 == 0) {
            this.field5974 = 0;
            this.field5984 = 0;
            this.field5981 = 0;
            this.method3149(78);
        } else {
            int var2 = -this.field5981;
            if (this.field5981 > var2) {
                var2 = this.field5981;
            }
            if (-this.field5976 > var2) {
                var2 = -this.field5976;
            }
            if (this.field5976 > var2) {
                var2 = this.field5976;
            }
            if (-this.field5979 > var2) {
                var2 = -this.field5979;
            }
            if (this.field5979 > var2) {
                var2 = this.field5979;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field5974 = arg0;
            this.field5984 = Integer.MIN_VALUE;
            this.field5977 = -this.field5981 / arg0;
            this.field5971 = -this.field5976 / arg0;
            this.field5980 = -this.field5979 / arg0;
        }
    }

    @OriginalMember(owner = "client!sv", name = "l", descriptor = "()Z")
    public final boolean method2549() {
        return this.field5975 < 0 || this.field5975 >= ((class391) super.field4908).field5941.length << 8;
    }

    @OriginalMember(owner = "client!sv", name = "<init>", descriptor = "(Llf;II)V")
    private class394(class391 arg0, int arg1, int arg2) {
        super.field4908 = arg0;
        this.field5972 = arg0.field5940;
        this.field5983 = arg0.field5939;
        this.field5978 = arg0.field5942;
        this.field5982 = arg1;
        this.field5984 = arg2;
        this.field5973 = 8192;
        this.field5975 = 0;
        this.method2533();
    }

    @OriginalMember(owner = "client!sv", name = "b", descriptor = "(II[B[IIIIIIILsv;II)I")
    private static final int method2550(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class394 arg10, int arg11, int arg12) {
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
        arg10.field5975 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!sv", name = "<init>", descriptor = "(Llf;III)V")
    private class394(class391 arg0, int arg1, int arg2, int arg3) {
        super.field4908 = arg0;
        this.field5972 = arg0.field5940;
        this.field5983 = arg0.field5939;
        this.field5978 = arg0.field5942;
        this.field5982 = arg1;
        this.field5984 = arg2;
        this.field5973 = arg3;
        this.field5975 = 0;
        this.method2533();
    }
}
