import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class175 extends class218 {

    @OriginalMember(owner = "client!rb", name = "s", descriptor = "I")
    private int field2509;

    @OriginalMember(owner = "client!rb", name = "D", descriptor = "I")
    private int field2520;

    @OriginalMember(owner = "client!rb", name = "z", descriptor = "Z")
    private boolean field2516;

    @OriginalMember(owner = "client!rb", name = "r", descriptor = "I")
    private int field2508;

    @OriginalMember(owner = "client!rb", name = "y", descriptor = "I")
    private int field2515;

    @OriginalMember(owner = "client!rb", name = "w", descriptor = "I")
    private int field2513;

    @OriginalMember(owner = "client!rb", name = "x", descriptor = "I")
    private int field2514;

    @OriginalMember(owner = "client!rb", name = "t", descriptor = "I")
    private int field2510;

    @OriginalMember(owner = "client!rb", name = "u", descriptor = "I")
    private int field2511;

    @OriginalMember(owner = "client!rb", name = "v", descriptor = "I")
    private int field2512;

    @OriginalMember(owner = "client!rb", name = "A", descriptor = "I")
    private int field2517;

    @OriginalMember(owner = "client!rb", name = "B", descriptor = "I")
    private int field2518;

    @OriginalMember(owner = "client!rb", name = "C", descriptor = "I")
    private int field2519;

    @OriginalMember(owner = "client!rb", name = "E", descriptor = "I")
    private int field2521;

    @OriginalMember(owner = "client!rb", name = "F", descriptor = "I")
    private int field2522;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(III)V")
    public final synchronized void method1221(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1258(arg1, arg2);
        } else {
            int var4 = method1252(arg1, arg2);
            int var5 = method1255(arg1, arg2);
            if (this.field2511 == var4 && this.field2510 == var5) {
                this.field2518 = 0;
            } else {
                int var6 = arg1 - this.field2519;
                if (this.field2519 - arg1 > var6) {
                    var6 = this.field2519 - arg1;
                }
                if (var4 - this.field2511 > var6) {
                    var6 = var4 - this.field2511;
                }
                if (this.field2511 - var4 > var6) {
                    var6 = this.field2511 - var4;
                }
                if (var5 - this.field2510 > var6) {
                    var6 = var5 - this.field2510;
                }
                if (this.field2510 - var5 > var6) {
                    var6 = this.field2510 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field2518 = arg0;
                this.field2515 = arg1;
                this.field2513 = arg2;
                this.field2521 = (arg1 - this.field2519) / arg0;
                this.field2517 = (var4 - this.field2511) / arg0;
                this.field2522 = (var5 - this.field2510) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "(I)V")
    private final synchronized void method1222(int arg0) {
        this.method1258(arg0, this.method1230());
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Z)V")
    public final synchronized void method1223(boolean arg0) {
        this.field2508 = (this.field2508 >>> 31) + (this.field2508 ^ this.field2508 >> 31);
        if (arg0) {
            this.field2508 = -this.field2508;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(II[B[IIIIIIILrb;II)I")
    private static final int method1224(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class175 arg10, int arg11, int arg12) {
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
        arg10.field2514 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(I)V")
    public final synchronized void method1225(int arg0) {
        if (this.field2518 > 0) {
            if (arg0 >= this.field2518) {
                if (this.field2515 == Integer.MIN_VALUE) {
                    this.field2515 = 0;
                    this.field2519 = this.field2511 = this.field2510 = 0;
                    this.method2785((byte) -120);
                    arg0 = this.field2518;
                }
                this.field2518 = 0;
                this.method1244();
            } else {
                this.field2519 += this.field2521 * arg0;
                this.field2511 += this.field2517 * arg0;
                this.field2510 += this.field2522 * arg0;
                this.field2518 -= arg0;
            }
        }
        class343 var2 = (class343) super.field3021;
        int var3 = this.field2509 << 8;
        int var4 = this.field2520 << 8;
        int var5 = var2.field5386.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field2512 = 0;
        }
        if (this.field2514 < 0) {
            if (this.field2508 <= 0) {
                this.method1243();
                this.method2785((byte) -120);
                return;
            }
            this.field2514 = 0;
        }
        if (this.field2514 >= var5) {
            if (this.field2508 >= 0) {
                this.method1243();
                this.method2785((byte) -120);
                return;
            }
            this.field2514 = var5 - 1;
        }
        this.field2514 += this.field2508 * arg0;
        if (this.field2512 < 0) {
            if (!this.field2516) {
                if (this.field2508 < 0) {
                    if (this.field2514 < var3) {
                        this.field2514 = var4 - 1 - (var4 - 1 - this.field2514) % var6;
                    }
                } else if (this.field2514 >= var4) {
                    this.field2514 = (this.field2514 - var3) % var6 + var3;
                }
            } else {
                if (this.field2508 < 0) {
                    if (this.field2514 >= var3) {
                        return;
                    }
                    this.field2514 = var3 + var3 - 1 - this.field2514;
                    this.field2508 = -this.field2508;
                }
                while (this.field2514 >= var4) {
                    this.field2514 = var4 + var4 - 1 - this.field2514;
                    this.field2508 = -this.field2508;
                    if (this.field2514 >= var3) {
                        return;
                    }
                    this.field2514 = var3 + var3 - 1 - this.field2514;
                    this.field2508 = -this.field2508;
                }
            }
        } else {
            if (this.field2512 > 0) {
                if (this.field2516) {
                    label125: {
                        if (this.field2508 < 0) {
                            if (this.field2514 >= var3) {
                                return;
                            }
                            this.field2514 = var3 + var3 - 1 - this.field2514;
                            this.field2508 = -this.field2508;
                            if (--this.field2512 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field2514 < var4) {
                                return;
                            }
                            this.field2514 = var4 + var4 - 1 - this.field2514;
                            this.field2508 = -this.field2508;
                            if (--this.field2512 == 0) {
                                break;
                            }
                            if (this.field2514 >= var3) {
                                return;
                            }
                            this.field2514 = var3 + var3 - 1 - this.field2514;
                            this.field2508 = -this.field2508;
                        } while (--this.field2512 != 0);
                    }
                } else if (this.field2508 < 0) {
                    if (this.field2514 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field2514) / var6;
                    if (var7 < this.field2512) {
                        this.field2514 += var6 * var7;
                        this.field2512 -= var7;
                        return;
                    }
                    this.field2514 += this.field2512 * var6;
                    this.field2512 = 0;
                } else {
                    if (this.field2514 < var4) {
                        return;
                    }
                    int var8 = (this.field2514 - var3) / var6;
                    if (var8 < this.field2512) {
                        this.field2514 -= var6 * var8;
                        this.field2512 -= var8;
                        return;
                    }
                    this.field2514 -= this.field2512 * var6;
                    this.field2512 = 0;
                }
            }
            if (this.field2508 < 0) {
                if (this.field2514 < 0) {
                    this.field2514 = -1;
                    this.method1243();
                    this.method2785((byte) -120);
                    return;
                }
            } else if (this.field2514 >= var5) {
                this.field2514 = var5;
                this.method1243();
                this.method2785((byte) -120);
            }
        }
    }

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "(I)V")
    public final synchronized void method1226(int arg0) {
        if (this.field2508 < 0) {
            this.field2508 = -arg0;
        } else {
            this.field2508 = arg0;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(II)V")
    public final synchronized void method1227(int arg0, int arg1) {
        this.method1221(arg0, arg1, this.method1230());
    }

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "(I)V")
    public final synchronized void method1228(int arg0) {
        this.method1258(arg0 << 6, this.method1230());
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "([B[IIIIIIIILrb;)I")
    private static final int method1229(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class175 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field2511 += (var14 - arg3) * arg9.field2517;
        arg9.field2510 += (var14 - arg3) * arg9.field2522;
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
        arg9.field2519 = var12 >> 2;
        arg9.field2514 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "()I")
    public final synchronized int method1230() {
        return this.field2513 < 0 ? -1 : this.field2513;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(II[B[IIIIIIIILrb;II)I")
    private static final int method1231(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class175 arg11, int arg12, int arg13) {
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
        arg11.field2514 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(II[B[IIIIIIIILrb;II)I")
    private static final int method1232(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class175 arg11, int arg12, int arg13) {
        arg11.field2511 -= arg11.field2517 * arg5;
        arg11.field2510 -= arg11.field2522 * arg5;
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
        arg11.field2511 += arg11.field2517 * arg5;
        arg11.field2510 += arg11.field2522 * arg5;
        arg11.field2519 = arg6;
        arg11.field2514 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "(I)V")
    public final synchronized void method1233(int arg0) {
        if (arg0 == 0) {
            this.method1222(0);
            this.method2785((byte) -120);
        } else if (this.field2511 == 0 && this.field2510 == 0) {
            this.field2518 = 0;
            this.field2515 = 0;
            this.field2519 = 0;
            this.method2785((byte) -120);
        } else {
            int var2 = -this.field2519;
            if (this.field2519 > var2) {
                var2 = this.field2519;
            }
            if (-this.field2511 > var2) {
                var2 = -this.field2511;
            }
            if (this.field2511 > var2) {
                var2 = this.field2511;
            }
            if (-this.field2510 > var2) {
                var2 = -this.field2510;
            }
            if (this.field2510 > var2) {
                var2 = this.field2510;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field2518 = arg0;
            this.field2515 = Integer.MIN_VALUE;
            this.field2521 = -this.field2519 / arg0;
            this.field2517 = -this.field2511 / arg0;
            this.field2522 = -this.field2510 / arg0;
        }
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "([B[IIIIIIIILrb;)I")
    private static final int method1234(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class175 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field2511 += (var14 - arg3) * arg9.field2517;
        arg9.field2510 += (var14 - arg3) * arg9.field2522;
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
        arg9.field2519 = var12 >> 2;
        arg9.field2514 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "([III)V")
    public final synchronized void method1235(int[] arg0, int arg1, int arg2) {
        if (this.field2515 == 0 && this.field2518 == 0) {
            this.method1225(arg2);
        } else {
            class343 var4 = (class343) super.field3021;
            int var5 = this.field2509 << 8;
            int var6 = this.field2520 << 8;
            int var7 = var4.field5386.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field2512 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field2514 < 0) {
                if (this.field2508 <= 0) {
                    this.method1243();
                    this.method2785((byte) -120);
                    return;
                }
                this.field2514 = 0;
            }
            if (this.field2514 >= var7) {
                if (this.field2508 >= 0) {
                    this.method1243();
                    this.method2785((byte) -120);
                    return;
                }
                this.field2514 = var7 - 1;
            }
            if (this.field2512 < 0) {
                if (this.field2516) {
                    if (this.field2508 < 0) {
                        var9 = this.method1246(arg0, arg1, var5, var10, var4.field5386[this.field2509]);
                        if (this.field2514 >= var5) {
                            return;
                        }
                        this.field2514 = var5 + var5 - 1 - this.field2514;
                        this.field2508 = -this.field2508;
                    }
                    while (true) {
                        int var11 = this.method1263(arg0, var9, var6, var10, var4.field5386[this.field2520 - 1]);
                        if (this.field2514 < var6) {
                            return;
                        }
                        this.field2514 = var6 + var6 - 1 - this.field2514;
                        this.field2508 = -this.field2508;
                        var9 = this.method1246(arg0, var11, var5, var10, var4.field5386[this.field2509]);
                        if (this.field2514 >= var5) {
                            return;
                        }
                        this.field2514 = var5 + var5 - 1 - this.field2514;
                        this.field2508 = -this.field2508;
                    }
                } else if (this.field2508 < 0) {
                    while (true) {
                        var9 = this.method1246(arg0, var9, var5, var10, var4.field5386[this.field2520 - 1]);
                        if (this.field2514 >= var5) {
                            return;
                        }
                        this.field2514 = var6 - 1 - (var6 - 1 - this.field2514) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method1263(arg0, var9, var6, var10, var4.field5386[this.field2509]);
                        if (this.field2514 < var6) {
                            return;
                        }
                        this.field2514 = (this.field2514 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field2512 > 0) {
                    if (this.field2516) {
                        label130: {
                            if (this.field2508 < 0) {
                                var9 = this.method1246(arg0, arg1, var5, var10, var4.field5386[this.field2509]);
                                if (this.field2514 >= var5) {
                                    return;
                                }
                                this.field2514 = var5 + var5 - 1 - this.field2514;
                                this.field2508 = -this.field2508;
                                if (--this.field2512 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method1263(arg0, var9, var6, var10, var4.field5386[this.field2520 - 1]);
                                if (this.field2514 < var6) {
                                    return;
                                }
                                this.field2514 = var6 + var6 - 1 - this.field2514;
                                this.field2508 = -this.field2508;
                                if (--this.field2512 == 0) {
                                    break;
                                }
                                var9 = this.method1246(arg0, var9, var5, var10, var4.field5386[this.field2509]);
                                if (this.field2514 >= var5) {
                                    return;
                                }
                                this.field2514 = var5 + var5 - 1 - this.field2514;
                                this.field2508 = -this.field2508;
                            } while (--this.field2512 != 0);
                        }
                    } else if (this.field2508 < 0) {
                        while (true) {
                            var9 = this.method1246(arg0, var9, var5, var10, var4.field5386[this.field2520 - 1]);
                            if (this.field2514 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field2514) / var8;
                            if (var12 >= this.field2512) {
                                this.field2514 += this.field2512 * var8;
                                this.field2512 = 0;
                                break;
                            }
                            this.field2514 += var8 * var12;
                            this.field2512 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method1263(arg0, var9, var6, var10, var4.field5386[this.field2509]);
                            if (this.field2514 < var6) {
                                return;
                            }
                            int var13 = (this.field2514 - var5) / var8;
                            if (var13 >= this.field2512) {
                                this.field2514 -= this.field2512 * var8;
                                this.field2512 = 0;
                                break;
                            }
                            this.field2514 -= var8 * var13;
                            this.field2512 -= var13;
                        }
                    }
                }
                if (this.field2508 < 0) {
                    this.method1246(arg0, var9, 0, var10, 0);
                    if (this.field2514 < 0) {
                        this.field2514 = -1;
                        this.method1243();
                        this.method2785((byte) -120);
                        return;
                    }
                } else {
                    this.method1263(arg0, var9, var7, var10, 0);
                    if (this.field2514 >= var7) {
                        this.field2514 = var7;
                        this.method1243();
                        this.method2785((byte) -120);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "()Z")
    public final boolean method1236() {
        return this.field2514 < 0 || this.field2514 >= ((class343) super.field3021).field5386.length << 8;
    }

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "()I")
    public final int method1237() {
        return this.field2515 == 0 && this.field2518 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "([B[IIIIIIILrb;)I")
    private static final int method1238(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class175 arg8) {
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
        arg8.field2514 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "(II[B[IIIIIIIILrb;II)I")
    private static final int method1239(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class175 arg11, int arg12, int arg13) {
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
        arg11.field2514 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Luq;III)Lrb;")
    public static final class175 method1240(class343 arg0, int arg1, int arg2, int arg3) {
        return arg0.field5386 != null && arg0.field5386.length != 0 ? new class175(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!rb", name = "g", descriptor = "()I")
    public final synchronized int method1241() {
        return this.field2515 == Integer.MIN_VALUE ? 0 : this.field2515;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(I[B[IIIIIIIIIILrb;)I")
    private static final int method1242(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class175 arg12) {
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
        arg12.field2519 += (var19 - arg4) * arg12.field2521;
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
        arg12.field2511 = var15 >> 2;
        arg12.field2510 = var16 >> 2;
        arg12.field2514 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!rb", name = "h", descriptor = "()V")
    private final void method1243() {
        if (this.field2518 != 0) {
            if (this.field2515 == Integer.MIN_VALUE) {
                this.field2515 = 0;
            }
            this.field2518 = 0;
            this.method1244();
        }
    }

    @OriginalMember(owner = "client!rb", name = "i", descriptor = "()V")
    private final void method1244() {
        this.field2519 = this.field2515;
        this.field2511 = method1252(this.field2515, this.field2513);
        this.field2510 = method1255(this.field2515, this.field2513);
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(II[B[IIIIIIIIIILrb;II)I")
    private static final int method1245(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class175 arg13, int arg14, int arg15) {
        arg13.field2519 -= arg13.field2521 * arg5;
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
        arg13.field2519 += arg13.field2521 * var22;
        arg13.field2511 = arg6;
        arg13.field2510 = arg7;
        arg13.field2514 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "([IIIII)I")
    private final int method1246(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field2518 <= 0) {
                if (this.field2508 == -256 && (this.field2514 & 255) == 0) {
                    if (class40.field620) {
                        return method1248(0, ((class343) super.field3021).field5386, arg0, this.field2514, arg1, this.field2511, this.field2510, 0, arg3, arg2, this);
                    }
                    return method1249(((class343) super.field3021).field5386, arg0, this.field2514, arg1, this.field2519, 0, arg3, arg2, this);
                }
                if (class40.field620) {
                    return method1231(0, 0, ((class343) super.field3021).field5386, arg0, this.field2514, arg1, this.field2511, this.field2510, 0, arg3, arg2, this, this.field2508, arg4);
                }
                return method1224(0, 0, ((class343) super.field3021).field5386, arg0, this.field2514, arg1, this.field2519, 0, arg3, arg2, this, this.field2508, arg4);
            }
            int var6 = this.field2518 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field2518 += arg1;
            if (this.field2508 == -256 && (this.field2514 & 255) == 0) {
                if (class40.field620) {
                    arg1 = method1265(0, ((class343) super.field3021).field5386, arg0, this.field2514, arg1, this.field2511, this.field2510, this.field2517, this.field2522, 0, var6, arg2, this);
                } else {
                    arg1 = method1234(((class343) super.field3021).field5386, arg0, this.field2514, arg1, this.field2519, this.field2521, 0, var6, arg2, this);
                }
            } else if (class40.field620) {
                arg1 = method1266(0, 0, ((class343) super.field3021).field5386, arg0, this.field2514, arg1, this.field2511, this.field2510, this.field2517, this.field2522, 0, var6, arg2, this, this.field2508, arg4);
            } else {
                arg1 = method1232(0, 0, ((class343) super.field3021).field5386, arg0, this.field2514, arg1, this.field2519, this.field2521, 0, var6, arg2, this, this.field2508, arg4);
            }
            this.field2518 -= arg1;
            if (this.field2518 != 0) {
                return arg1;
            }
        } while (!this.method1264());
        return arg3;
    }

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "()I")
    public final int method1247() {
        int var1 = this.field2519 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field2512 == 0) {
            var2 -= this.field2514 * var2 / (((class343) super.field3021).field5386.length << 8);
        } else if (this.field2512 >= 0) {
            var2 -= this.field2509 * var2 / ((class343) super.field3021).field5386.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(I[B[IIIIIIIILrb;)I")
    private static final int method1248(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class175 arg10) {
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
        arg10.field2514 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "([B[IIIIIIILrb;)I")
    private static final int method1249(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class175 arg8) {
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
        arg8.field2514 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!rb", name = "j", descriptor = "()Z")
    public final boolean method1250() {
        return this.field2518 != 0;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "()Lho;")
    public final class218 method1251() {
        return null;
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(II)I")
    private static final int method1252(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!rb", name = "k", descriptor = "()I")
    public final synchronized int method1253() {
        return this.field2508 < 0 ? -this.field2508 : this.field2508;
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(II[B[IIIIIIILrb;II)I")
    private static final int method1254(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class175 arg10, int arg11, int arg12) {
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
        arg10.field2514 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "(II)I")
    private static final int method1255(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Luq;II)Lrb;")
    public static final class175 method1256(class343 arg0, int arg1, int arg2) {
        return arg0.field5386 != null && arg0.field5386.length != 0 ? new class175(arg0, (int) ((long) arg0.field5388 * 256L * (long) arg1 / (long) (class462.field6769 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!rb", name = "g", descriptor = "(I)V")
    public final synchronized void method1257(int arg0) {
        this.field2512 = arg0;
    }

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "(II)V")
    private final synchronized void method1258(int arg0, int arg1) {
        this.field2515 = arg0;
        this.field2513 = arg1;
        this.field2518 = 0;
        this.method1244();
    }

    @OriginalMember(owner = "client!rb", name = "h", descriptor = "(I)V")
    public final synchronized void method1259(int arg0) {
        int var2 = ((class343) super.field3021).field5386.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field2514 = arg0;
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "()Lho;")
    public final class218 method1260() {
        return null;
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(I[B[IIIIIIIILrb;)I")
    private static final int method1261(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class175 arg10) {
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
        arg10.field2514 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "(II[B[IIIIIIIILrb;II)I")
    private static final int method1262(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class175 arg11, int arg12, int arg13) {
        arg11.field2511 -= arg11.field2517 * arg5;
        arg11.field2510 -= arg11.field2522 * arg5;
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
        arg11.field2511 += arg11.field2517 * arg5;
        arg11.field2510 += arg11.field2522 * arg5;
        arg11.field2519 = arg6;
        arg11.field2514 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "([IIIII)I")
    private final int method1263(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field2518 <= 0) {
                if (this.field2508 == 256 && (this.field2514 & 255) == 0) {
                    if (class40.field620) {
                        return method1261(0, ((class343) super.field3021).field5386, arg0, this.field2514, arg1, this.field2511, this.field2510, 0, arg3, arg2, this);
                    }
                    return method1238(((class343) super.field3021).field5386, arg0, this.field2514, arg1, this.field2519, 0, arg3, arg2, this);
                }
                if (class40.field620) {
                    return method1239(0, 0, ((class343) super.field3021).field5386, arg0, this.field2514, arg1, this.field2511, this.field2510, 0, arg3, arg2, this, this.field2508, arg4);
                }
                return method1254(0, 0, ((class343) super.field3021).field5386, arg0, this.field2514, arg1, this.field2519, 0, arg3, arg2, this, this.field2508, arg4);
            }
            int var6 = this.field2518 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field2518 += arg1;
            if (this.field2508 == 256 && (this.field2514 & 255) == 0) {
                if (class40.field620) {
                    arg1 = method1242(0, ((class343) super.field3021).field5386, arg0, this.field2514, arg1, this.field2511, this.field2510, this.field2517, this.field2522, 0, var6, arg2, this);
                } else {
                    arg1 = method1229(((class343) super.field3021).field5386, arg0, this.field2514, arg1, this.field2519, this.field2521, 0, var6, arg2, this);
                }
            } else if (class40.field620) {
                arg1 = method1245(0, 0, ((class343) super.field3021).field5386, arg0, this.field2514, arg1, this.field2511, this.field2510, this.field2517, this.field2522, 0, var6, arg2, this, this.field2508, arg4);
            } else {
                arg1 = method1262(0, 0, ((class343) super.field3021).field5386, arg0, this.field2514, arg1, this.field2519, this.field2521, 0, var6, arg2, this, this.field2508, arg4);
            }
            this.field2518 -= arg1;
            if (this.field2518 != 0) {
                return arg1;
            }
        } while (!this.method1264());
        return arg3;
    }

    @OriginalMember(owner = "client!rb", name = "l", descriptor = "()Z")
    private final boolean method1264() {
        int var1 = this.field2515;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1252(var1, this.field2513);
            var2 = method1255(var1, this.field2513);
        }
        if (this.field2519 == var1 && this.field2511 == var3 && this.field2510 == var2) {
            if (this.field2515 == Integer.MIN_VALUE) {
                this.field2515 = 0;
                this.field2519 = this.field2511 = this.field2510 = 0;
                this.method2785((byte) -120);
                return true;
            } else {
                this.method1244();
                return false;
            }
        } else {
            if (this.field2519 < var1) {
                this.field2521 = 1;
                this.field2518 = var1 - this.field2519;
            } else if (this.field2519 > var1) {
                this.field2521 = -1;
                this.field2518 = this.field2519 - var1;
            } else {
                this.field2521 = 0;
            }
            if (this.field2511 < var3) {
                this.field2517 = 1;
                if (this.field2518 == 0 || this.field2518 > var3 - this.field2511) {
                    this.field2518 = var3 - this.field2511;
                }
            } else if (this.field2511 > var3) {
                this.field2517 = -1;
                if (this.field2518 == 0 || this.field2518 > this.field2511 - var3) {
                    this.field2518 = this.field2511 - var3;
                }
            } else {
                this.field2517 = 0;
            }
            if (this.field2510 < var2) {
                this.field2522 = 1;
                if (this.field2518 == 0 || this.field2518 > var2 - this.field2510) {
                    this.field2518 = var2 - this.field2510;
                }
            } else if (this.field2510 > var2) {
                this.field2522 = -1;
                if (this.field2518 == 0 || this.field2518 > this.field2510 - var2) {
                    this.field2518 = this.field2510 - var2;
                }
            } else {
                this.field2522 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(I[B[IIIIIIIIIILrb;)I")
    private static final int method1265(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class175 arg12) {
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
        arg12.field2519 += (var19 - arg4) * arg12.field2521;
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
        arg12.field2511 = var15 >> 2;
        arg12.field2510 = var16 >> 2;
        arg12.field2514 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(II[B[IIIIIIIIIILrb;II)I")
    private static final int method1266(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class175 arg13, int arg14, int arg15) {
        arg13.field2519 -= arg13.field2521 * arg5;
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
        arg13.field2519 += arg13.field2521 * var22;
        arg13.field2511 = arg6;
        arg13.field2510 = arg7;
        arg13.field2514 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(Luq;II)V")
    private class175(class343 arg0, int arg1, int arg2) {
        super.field3021 = arg0;
        this.field2509 = arg0.field5387;
        this.field2520 = arg0.field5389;
        this.field2516 = arg0.field5390;
        this.field2508 = arg1;
        this.field2515 = arg2;
        this.field2513 = 8192;
        this.field2514 = 0;
        this.method1244();
    }

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(Luq;III)V")
    private class175(class343 arg0, int arg1, int arg2, int arg3) {
        super.field3021 = arg0;
        this.field2509 = arg0.field5387;
        this.field2520 = arg0.field5389;
        this.field2516 = arg0.field5390;
        this.field2508 = arg1;
        this.field2515 = arg2;
        this.field2513 = arg3;
        this.field2514 = 0;
        this.method1244();
    }
}
