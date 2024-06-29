import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class53 extends class93 {

    @OriginalMember(owner = "client!ie", name = "B", descriptor = "I")
    private int field1315;

    @OriginalMember(owner = "client!ie", name = "J", descriptor = "I")
    private int field1321;

    @OriginalMember(owner = "client!ie", name = "H", descriptor = "Z")
    private boolean field1320;

    @OriginalMember(owner = "client!ie", name = "M", descriptor = "I")
    private int field1323;

    @OriginalMember(owner = "client!ie", name = "N", descriptor = "I")
    private int field1324;

    @OriginalMember(owner = "client!ie", name = "K", descriptor = "I")
    private int field1322;

    @OriginalMember(owner = "client!ie", name = "A", descriptor = "I")
    private int field1314;

    @OriginalMember(owner = "client!ie", name = "C", descriptor = "I")
    private int field1316;

    @OriginalMember(owner = "client!ie", name = "D", descriptor = "I")
    private int field1317;

    @OriginalMember(owner = "client!ie", name = "E", descriptor = "I")
    private int field1318;

    @OriginalMember(owner = "client!ie", name = "F", descriptor = "I")
    private int field1319;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(II[B[IIIIIIILie;II)I", line = 3)
    private static final int method413(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class53 arg10, int arg11, int arg12) {
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
        arg10.field1322 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "([B[IIIIIIIIILie;)I", line = 32)
    private static final int method414(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class53 arg10) {
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
        arg10.field1324 = var13 >> 8;
        arg10.field1322 = var11 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "([B[IIIIIIILie;)I", line = 64)
    private static final int method415(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class53 arg8) {
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
        arg8.field1322 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "(I)V", line = 91)
    public final synchronized void method416(int arg0) {
        this.field1319 = arg0;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(II[B[IIIIIIIIILie;II)I", line = 96)
    private static final int method417(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class53 arg12, int arg13, int arg14) {
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
        arg12.field1324 = arg6;
        arg12.field1322 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "()I", line = 130)
    public final int method418() {
        int var1 = this.field1324 * 3;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1319 == 0) {
            var2 -= this.field1322 * var2 / (((class60) super.field2372).field1482.length << 8);
        } else if (this.field1319 >= 0) {
            var2 -= this.field1315 * var2 / ((class60) super.field2372).field1482.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(II[B[IIIIIIILie;II)I", line = 143)
    private static final int method419(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class53 arg10, int arg11, int arg12) {
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
        arg10.field1322 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "([IIIII)I", line = 169)
    private final int method420(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        if (this.field1318 > 0) {
            int var6 = this.field1318 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field1318 += arg1;
            if (this.field1323 == 256 && (this.field1322 & 255) == 0) {
                arg1 = method427(((class60) super.field2372).field1482, arg0, this.field1322, arg1, this.field1324, this.field1317, this.field1316, 0, var6, arg2, this);
            } else {
                arg1 = method428(0, 0, ((class60) super.field2372).field1482, arg0, this.field1322, arg1, this.field1324, this.field1317, this.field1316, 0, var6, arg2, this, this.field1323, arg4);
            }
            this.field1318 -= arg1;
            if (this.field1318 != 0) {
                return arg1;
            }
            if (this.field1314 == Integer.MIN_VALUE) {
                this.method1074((byte) -28);
                return arg3;
            }
            this.field1324 = this.field1314;
        }
        return this.field1323 == 256 && (this.field1322 & 255) == 0 ? method415(((class60) super.field2372).field1482, arg0, this.field1322, arg1, this.field1324, 0, arg3, arg2, this) : method419(0, 0, ((class60) super.field2372).field1482, arg0, this.field1322, arg1, this.field1324, 0, arg3, arg2, this, this.field1323, arg4);
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lka;II)Lie;", line = 217)
    public static final class53 method421(class60 arg0, int arg1, int arg2) {
        return arg0.field1482 != null && arg0.field1482.length != 0 ? new class53(arg0, (int) ((long) arg0.field1483 * 256L * (long) arg1 / (long) (class43.field1083 * 100)), arg2) : null;
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "([B[IIIIIIILie;)I", line = 224)
    private static final int method422(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class53 arg8) {
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
        arg8.field1322 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(I)V", line = 249)
    public final synchronized void method423(int arg0) {
        if (this.field1318 > 0) {
            if (arg0 >= this.field1318) {
                if (this.field1314 == Integer.MIN_VALUE) {
                    this.method1074((byte) -28);
                    arg0 = this.field1318;
                } else {
                    this.field1324 = this.field1314;
                }
                this.field1318 = 0;
            } else {
                this.field1324 += this.field1316 * arg0;
                this.field1318 -= arg0;
            }
        }
        this.field1322 += this.field1323 * arg0;
        class60 var2 = (class60) super.field2372;
        int var3 = this.field1315 << 8;
        int var4 = this.field1321 << 8;
        int var5 = var2.field1482.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1319 = 0;
        }
        if (this.field1319 < 0) {
            if (!this.field1320) {
                if (this.field1323 < 0) {
                    if (this.field1322 < var3) {
                        this.field1322 = var4 - 1 - (var4 - 1 - this.field1322) % var6;
                    }
                } else if (this.field1322 >= var4) {
                    this.field1322 = (this.field1322 - var3) % var6 + var3;
                }
            } else {
                if (this.field1323 < 0) {
                    if (this.field1322 >= var3) {
                        return;
                    }
                    this.field1322 = var3 + var3 - 1 - this.field1322;
                    this.field1323 = -this.field1323;
                }
                while (this.field1322 >= var4) {
                    this.field1322 = var4 + var4 - 1 - this.field1322;
                    this.field1323 = -this.field1323;
                    if (this.field1322 >= var3) {
                        return;
                    }
                    this.field1322 = var3 + var3 - 1 - this.field1322;
                    this.field1323 = -this.field1323;
                }
            }
        } else {
            if (this.field1319 > 0) {
                if (this.field1320) {
                    label113: {
                        if (this.field1323 < 0) {
                            if (this.field1322 >= var3) {
                                return;
                            }
                            this.field1322 = var3 + var3 - 1 - this.field1322;
                            this.field1323 = -this.field1323;
                            if (--this.field1319 == 0) {
                                break label113;
                            }
                        }
                        do {
                            if (this.field1322 < var4) {
                                return;
                            }
                            this.field1322 = var4 + var4 - 1 - this.field1322;
                            this.field1323 = -this.field1323;
                            if (--this.field1319 == 0) {
                                break;
                            }
                            if (this.field1322 >= var3) {
                                return;
                            }
                            this.field1322 = var3 + var3 - 1 - this.field1322;
                            this.field1323 = -this.field1323;
                        } while (--this.field1319 != 0);
                    }
                } else if (this.field1323 < 0) {
                    if (this.field1322 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field1322) / var6;
                    if (var7 < this.field1319) {
                        this.field1322 += var6 * var7;
                        this.field1319 -= var7;
                        return;
                    }
                    this.field1322 += this.field1319 * var6;
                    this.field1319 = 0;
                } else {
                    if (this.field1322 < var4) {
                        return;
                    }
                    int var8 = (this.field1322 - var3) / var6;
                    if (var8 < this.field1319) {
                        this.field1322 -= var6 * var8;
                        this.field1319 -= var8;
                        return;
                    }
                    this.field1322 -= this.field1319 * var6;
                    this.field1319 = 0;
                }
            }
            if (this.field1323 < 0) {
                if (this.field1322 < 0) {
                    this.field1322 = 0;
                    this.method1074((byte) -28);
                    return;
                }
            } else if (this.field1322 >= var5) {
                this.field1322 = var5 - 1;
                this.method1074((byte) -28);
            }
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "([III)I", line = 437)
    public final synchronized int method424(int[] arg0, int arg1, int arg2) {
        if (this.field1324 != 0 || this.field1318 != 0 && this.field1314 != 0 && this.field1314 != Integer.MIN_VALUE) {
            class60 var4 = (class60) super.field2372;
            int var5 = this.field1315 << 8;
            int var6 = this.field1321 << 8;
            int var7 = var4.field1482.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field1319 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field1319 < 0) {
                if (this.field1320) {
                    if (this.field1323 < 0) {
                        var9 = this.method426(arg0, arg1, var5, var10, var4.field1482[this.field1315]);
                        if (this.field1322 >= var5) {
                            return 1;
                        }
                        this.field1322 = var5 + var5 - 1 - this.field1322;
                        this.field1323 = -this.field1323;
                    }
                    while (true) {
                        int var11 = this.method420(arg0, var9, var6, var10, var4.field1482[this.field1321 - 1]);
                        if (this.field1322 < var6) {
                            return 1;
                        }
                        this.field1322 = var6 + var6 - 1 - this.field1322;
                        this.field1323 = -this.field1323;
                        var9 = this.method426(arg0, var11, var5, var10, var4.field1482[this.field1315]);
                        if (this.field1322 >= var5) {
                            return 1;
                        }
                        this.field1322 = var5 + var5 - 1 - this.field1322;
                        this.field1323 = -this.field1323;
                    }
                } else if (this.field1323 < 0) {
                    while (true) {
                        var9 = this.method426(arg0, var9, var5, var10, var4.field1482[this.field1321 - 1]);
                        if (this.field1322 >= var5) {
                            return 1;
                        }
                        this.field1322 = var6 - 1 - (var6 - 1 - this.field1322) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method420(arg0, var9, var6, var10, var4.field1482[this.field1315]);
                        if (this.field1322 < var6) {
                            return 1;
                        }
                        this.field1322 = (this.field1322 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field1319 > 0) {
                    if (this.field1320) {
                        label118: {
                            if (this.field1323 < 0) {
                                var9 = this.method426(arg0, arg1, var5, var10, var4.field1482[this.field1315]);
                                if (this.field1322 >= var5) {
                                    return 1;
                                }
                                this.field1322 = var5 + var5 - 1 - this.field1322;
                                this.field1323 = -this.field1323;
                                if (--this.field1319 == 0) {
                                    break label118;
                                }
                            }
                            do {
                                var9 = this.method420(arg0, var9, var6, var10, var4.field1482[this.field1321 - 1]);
                                if (this.field1322 < var6) {
                                    return 1;
                                }
                                this.field1322 = var6 + var6 - 1 - this.field1322;
                                this.field1323 = -this.field1323;
                                if (--this.field1319 == 0) {
                                    break;
                                }
                                var9 = this.method426(arg0, var9, var5, var10, var4.field1482[this.field1315]);
                                if (this.field1322 >= var5) {
                                    return 1;
                                }
                                this.field1322 = var5 + var5 - 1 - this.field1322;
                                this.field1323 = -this.field1323;
                            } while (--this.field1319 != 0);
                        }
                    } else if (this.field1323 < 0) {
                        while (true) {
                            var9 = this.method426(arg0, var9, var5, var10, var4.field1482[this.field1321 - 1]);
                            if (this.field1322 >= var5) {
                                return 1;
                            }
                            int var12 = (var6 - 1 - this.field1322) / var8;
                            if (var12 >= this.field1319) {
                                this.field1322 += this.field1319 * var8;
                                this.field1319 = 0;
                                break;
                            }
                            this.field1322 += var8 * var12;
                            this.field1319 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method420(arg0, var9, var6, var10, var4.field1482[this.field1315]);
                            if (this.field1322 < var6) {
                                return 1;
                            }
                            int var13 = (this.field1322 - var5) / var8;
                            if (var13 >= this.field1319) {
                                this.field1322 -= this.field1319 * var8;
                                this.field1319 = 0;
                                break;
                            }
                            this.field1322 -= var8 * var13;
                            this.field1319 -= var13;
                        }
                    }
                }
                if (this.field1323 < 0) {
                    this.method426(arg0, var9, 0, var10, 0);
                    if (this.field1322 < 0) {
                        this.field1322 = 0;
                        this.method1074((byte) -28);
                    }
                } else {
                    this.method420(arg0, var9, var7, var10, 0);
                    if (this.field1322 >= var7) {
                        this.field1322 = var7 - 1;
                        this.method1074((byte) -28);
                    }
                }
                return 1;
            }
        } else {
            this.method423(arg2);
            return 0;
        }
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "()Z", line = 646)
    public final boolean method425() {
        return this.method1070(true);
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "([IIIII)I", line = 649)
    private final int method426(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        if (this.field1318 > 0) {
            int var6 = this.field1318 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field1318 += arg1;
            if (this.field1323 == -256 && (this.field1322 & 255) == 0) {
                arg1 = method414(((class60) super.field2372).field1482, arg0, this.field1322, arg1, this.field1324, this.field1317, this.field1316, 0, var6, arg2, this);
            } else {
                arg1 = method417(0, 0, ((class60) super.field2372).field1482, arg0, this.field1322, arg1, this.field1324, this.field1317, this.field1316, 0, var6, arg2, this, this.field1323, arg4);
            }
            this.field1318 -= arg1;
            if (this.field1318 != 0) {
                return arg1;
            }
            if (this.field1314 == Integer.MIN_VALUE) {
                this.method1074((byte) -28);
                return arg3;
            }
            this.field1324 = this.field1314;
        }
        return this.field1323 == -256 && (this.field1322 & 255) == 0 ? method422(((class60) super.field2372).field1482, arg0, this.field1322, arg1, this.field1324, 0, arg3, arg2, this) : method413(0, 0, ((class60) super.field2372).field1482, arg0, this.field1322, arg1, this.field1324, 0, arg3, arg2, this, this.field1323, arg4);
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "([B[IIIIIIIIILie;)I", line = 693)
    private static final int method427(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class53 arg10) {
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
        arg10.field1324 = var13 >> 8;
        arg10.field1322 = var11 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(Lka;II)V", line = 725)
    private class53(class60 arg0, int arg1, int arg2) {
        super.field2372 = arg0;
        this.field1315 = arg0.field1485;
        this.field1321 = arg0.field1481;
        this.field1320 = arg0.field1484;
        this.field1323 = arg1;
        this.field1324 = arg2;
        this.field1322 = 0;
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(II[B[IIIIIIIIILie;II)I", line = 736)
    private static final int method428(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class53 arg12, int arg13, int arg14) {
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
        arg12.field1324 = arg6;
        arg12.field1322 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "(I)V", line = 765)
    public final synchronized void method429(int arg0) {
        this.field1324 = arg0;
        this.field1318 = 0;
    }
}
