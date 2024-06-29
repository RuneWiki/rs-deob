import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class174 extends class65 {

    @OriginalMember(owner = "client!df", name = "q", descriptor = "I")
    private int field2494;

    @OriginalMember(owner = "client!df", name = "r", descriptor = "I")
    private int field2495;

    @OriginalMember(owner = "client!df", name = "t", descriptor = "Z")
    private boolean field2497;

    @OriginalMember(owner = "client!df", name = "u", descriptor = "I")
    private int field2498;

    @OriginalMember(owner = "client!df", name = "n", descriptor = "I")
    private int field2491;

    @OriginalMember(owner = "client!df", name = "p", descriptor = "I")
    private int field2493;

    @OriginalMember(owner = "client!df", name = "v", descriptor = "I")
    private int field2499;

    @OriginalMember(owner = "client!df", name = "o", descriptor = "I")
    private int field2492;

    @OriginalMember(owner = "client!df", name = "s", descriptor = "I")
    private int field2496;

    @OriginalMember(owner = "client!df", name = "w", descriptor = "I")
    private int field2500;

    @OriginalMember(owner = "client!df", name = "x", descriptor = "I")
    private int field2501;

    @OriginalMember(owner = "client!df", name = "y", descriptor = "I")
    private int field2502;

    @OriginalMember(owner = "client!df", name = "z", descriptor = "I")
    private int field2503;

    @OriginalMember(owner = "client!df", name = "A", descriptor = "I")
    private int field2504;

    @OriginalMember(owner = "client!df", name = "B", descriptor = "I")
    private int field2505;

    @OriginalMember(owner = "client!df", name = "e", descriptor = "()Z", line = 3)
    public final boolean method1134() {
        return this.field2499 < 0 || this.field2499 >= ((class203) this.field844).field2854.length << 8;
    }

    @OriginalMember(owner = "client!df", name = "d", descriptor = "(I)V", line = 9)
    public final synchronized void method1135(int arg0) {
        this.method1149(arg0 << 6, this.method1145());
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "([B[IIIIIIILdf;)I", line = 13)
    private static final int method1136(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class174 arg8) {
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
        arg8.field2499 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(II)V", line = 39)
    public final synchronized void method1137(int arg0, int arg1) {
        this.method1142(arg0, arg1, this.method1145());
    }

    @OriginalMember(owner = "client!df", name = "c", descriptor = "()I", line = 43)
    public final int method37() {
        return this.field2491 == 0 && this.field2504 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!df", name = "e", descriptor = "(I)V", line = 49)
    public final synchronized void method1138(int arg0) {
        if (arg0 == 0) {
            this.method1173(0);
            this.method2285(true);
        } else if (this.field2492 == 0 && this.field2501 == 0) {
            this.field2504 = 0;
            this.field2491 = 0;
            this.field2503 = 0;
            this.method2285(true);
        } else {
            int var2 = -this.field2503;
            if (this.field2503 > var2) {
                var2 = this.field2503;
            }
            if (-this.field2492 > var2) {
                var2 = -this.field2492;
            }
            if (this.field2492 > var2) {
                var2 = this.field2492;
            }
            if (-this.field2501 > var2) {
                var2 = -this.field2501;
            }
            if (this.field2501 > var2) {
                var2 = this.field2501;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field2504 = arg0;
            this.field2491 = Integer.MIN_VALUE;
            this.field2496 = -this.field2503 / arg0;
            this.field2500 = -this.field2492 / arg0;
            this.field2505 = -this.field2501 / arg0;
        }
    }

    @OriginalMember(owner = "client!df", name = "f", descriptor = "()I", line = 94)
    public final synchronized int method1139() {
        return this.field2498 < 0 ? -this.field2498 : this.field2498;
    }

    @OriginalMember(owner = "client!df", name = "f", descriptor = "(I)V", line = 97)
    public final synchronized void method1140(int arg0) {
        this.field2502 = arg0;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "([IIIII)I", line = 101)
    private final int method1141(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field2504 > 0) {
                int var6 = this.field2504 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field2504 += arg1;
                if (this.field2498 == -256 && (this.field2499 & 0xFF) == 0) {
                    if (class177.field2566) {
                        arg1 = method1159(0, ((class203) this.field844).field2854, arg0, this.field2499, arg1, this.field2492, this.field2501, this.field2500, this.field2505, 0, var6, arg2, this);
                    } else {
                        arg1 = method1162(((class203) this.field844).field2854, arg0, this.field2499, arg1, this.field2503, this.field2496, 0, var6, arg2, this);
                    }
                } else if (class177.field2566) {
                    arg1 = method1143(0, 0, ((class203) this.field844).field2854, arg0, this.field2499, arg1, this.field2492, this.field2501, this.field2500, this.field2505, 0, var6, arg2, this, this.field2498, arg4);
                } else {
                    arg1 = method1166(0, 0, ((class203) this.field844).field2854, arg0, this.field2499, arg1, this.field2503, this.field2496, 0, var6, arg2, this, this.field2498, arg4);
                }
                this.field2504 -= arg1;
                if (this.field2504 != 0) {
                    return arg1;
                }
                if (!this.method1148()) {
                    continue;
                }
                return arg3;
            }
            if (this.field2498 == -256 && (this.field2499 & 0xFF) == 0) {
                if (class177.field2566) {
                    return method1172(0, ((class203) this.field844).field2854, arg0, this.field2499, arg1, this.field2492, this.field2501, 0, arg3, arg2, this);
                }
                return method1136(((class203) this.field844).field2854, arg0, this.field2499, arg1, this.field2503, 0, arg3, arg2, this);
            }
            if (class177.field2566) {
                return method1154(0, 0, ((class203) this.field844).field2854, arg0, this.field2499, arg1, this.field2492, this.field2501, 0, arg3, arg2, this, this.field2498, arg4);
            }
            return method1153(0, 0, ((class203) this.field844).field2854, arg0, this.field2499, arg1, this.field2503, 0, arg3, arg2, this, this.field2498, arg4);
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(III)V", line = 157)
    public final synchronized void method1142(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1149(arg1, arg2);
            return;
        }
        int var4 = method1169(arg1, arg2);
        int var5 = method1155(arg1, arg2);
        if (this.field2492 == var4 && this.field2501 == var5) {
            this.field2504 = 0;
            return;
        }
        int var6 = arg1 - this.field2503;
        if (this.field2503 - arg1 > var6) {
            var6 = this.field2503 - arg1;
        }
        if (var4 - this.field2492 > var6) {
            var6 = var4 - this.field2492;
        }
        if (this.field2492 - var4 > var6) {
            var6 = this.field2492 - var4;
        }
        if (var5 - this.field2501 > var6) {
            var6 = var5 - this.field2501;
        }
        if (this.field2501 - var5 > var6) {
            var6 = this.field2501 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field2504 = arg0;
        this.field2491 = arg1;
        this.field2493 = arg2;
        this.field2496 = (arg1 - this.field2503) / arg0;
        this.field2500 = (var4 - this.field2492) / arg0;
        this.field2505 = (var5 - this.field2501) / arg0;
    }

    @OriginalMember(owner = "client!df", name = "d", descriptor = "()Lfb;", line = 204)
    public final class65 method30() {
        return null;
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "()I", line = 208)
    public final int method406() {
        int var1 = this.field2503 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field2502 == 0) {
            var2 -= this.field2499 * var2 / (((class203) this.field844).field2854.length << 8);
        } else if (this.field2502 >= 0) {
            var2 -= this.field2494 * var2 / ((class203) this.field844).field2854.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(II[B[IIIIIIIIIILdf;II)I", line = 221)
    private static final int method1143(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class174 arg13, int arg14, int arg15) {
        arg13.field2503 -= arg13.field2496 * arg5;
        int var16;
        if (arg14 == 0 || (var16 = (arg12 + arg14 + 256 - arg4) / arg14 + arg5) > arg11) {
            var16 = arg11;
        }
        int var17 = arg5 << 1;
        int var18 = var16 << 1;
        int var10001;
        while (var17 < var18) {
            int var19 = arg4 >> 8;
            byte var20 = arg2[var19 - 1];
            int var21 = (var20 << 8) + (arg4 & 0xFF) * (arg2[var19] - var20);
            var10001 = var17++;
            arg3[var10001] += arg6 * var21 >> 6;
            arg6 += arg8;
            int var27 = var17++;
            arg3[var27] += arg7 * var21 >> 6;
            arg7 += arg9;
            arg4 += arg14;
        }
        int var22;
        if (arg14 == 0 || (var22 = (var17 >> 1) + (arg12 + arg14 - arg4) / arg14) > arg11) {
            var22 = arg11;
        }
        int var23 = var22 << 1;
        int var24 = arg15;
        while (var17 < var23) {
            int var25 = (var24 << 8) + (arg4 & 0xFF) * (arg2[arg4 >> 8] - var24);
            var10001 = var17++;
            arg3[var10001] += arg6 * var25 >> 6;
            arg6 += arg8;
            var10001 = var17++;
            arg3[var10001] += arg7 * var25 >> 6;
            arg7 += arg9;
            arg4 += arg14;
        }
        int var26 = var17 >> 1;
        arg13.field2503 += arg13.field2496 * var26;
        arg13.field2492 = arg6;
        arg13.field2501 = arg7;
        arg13.field2499 = arg4;
        return var26;
    }

    @OriginalMember(owner = "client!df", name = "g", descriptor = "(I)V", line = 263)
    public final synchronized void method1144(int arg0) {
        int var2 = ((class203) this.field844).field2854.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field2499 = arg0;
    }

    @OriginalMember(owner = "client!df", name = "g", descriptor = "()I", line = 273)
    public final synchronized int method1145() {
        return this.field2493 < 0 ? -1 : this.field2493;
    }

    @OriginalMember(owner = "client!df", name = "h", descriptor = "(I)V", line = 278)
    public final synchronized void method1146(int arg0) {
        if (this.field2498 < 0) {
            this.field2498 = -arg0;
        } else {
            this.field2498 = arg0;
        }
    }

    @OriginalMember(owner = "client!df", name = "h", descriptor = "()V", line = 285)
    private final void method1147() {
        this.field2503 = this.field2491;
        this.field2492 = method1169(this.field2491, this.field2493);
        this.field2501 = method1155(this.field2491, this.field2493);
    }

    @OriginalMember(owner = "client!df", name = "i", descriptor = "()Z", line = 293)
    private final boolean method1148() {
        int var1 = this.field2491;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1169(var1, this.field2493);
            var2 = method1155(var1, this.field2493);
        }
        if (this.field2503 != var1 || this.field2492 != var3 || this.field2501 != var2) {
            if (this.field2503 < var1) {
                this.field2496 = 1;
                this.field2504 = var1 - this.field2503;
            } else if (this.field2503 > var1) {
                this.field2496 = -1;
                this.field2504 = this.field2503 - var1;
            } else {
                this.field2496 = 0;
            }
            if (this.field2492 < var3) {
                this.field2500 = 1;
                if (this.field2504 == 0 || this.field2504 > var3 - this.field2492) {
                    this.field2504 = var3 - this.field2492;
                }
            } else if (this.field2492 > var3) {
                this.field2500 = -1;
                if (this.field2504 == 0 || this.field2504 > this.field2492 - var3) {
                    this.field2504 = this.field2492 - var3;
                }
            } else {
                this.field2500 = 0;
            }
            if (this.field2501 < var2) {
                this.field2505 = 1;
                if (this.field2504 == 0 || this.field2504 > var2 - this.field2501) {
                    this.field2504 = var2 - this.field2501;
                }
            } else if (this.field2501 > var2) {
                this.field2505 = -1;
                if (this.field2504 == 0 || this.field2504 > this.field2501 - var2) {
                    this.field2504 = this.field2501 - var2;
                }
            } else {
                this.field2505 = 0;
            }
            return false;
        } else if (this.field2491 == Integer.MIN_VALUE) {
            this.field2491 = 0;
            this.field2503 = this.field2492 = this.field2501 = 0;
            this.method2285(true);
            return true;
        } else {
            this.method1147();
            return false;
        }
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(II)V", line = 382)
    private final synchronized void method1149(int arg0, int arg1) {
        this.field2491 = arg0;
        this.field2493 = arg1;
        this.field2504 = 0;
        this.method1147();
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(II[B[IIIIIIIIIILdf;II)I", line = 388)
    private static final int method1150(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class174 arg13, int arg14, int arg15) {
        arg13.field2503 -= arg13.field2496 * arg5;
        int var16;
        if (arg14 == 0 || (var16 = (arg12 + arg14 - arg4 - 257) / arg14 + arg5) > arg11) {
            var16 = arg11;
        }
        int var17 = arg5 << 1;
        int var18 = var16 << 1;
        int var10001;
        while (var17 < var18) {
            int var19 = arg4 >> 8;
            byte var20 = arg2[var19];
            int var21 = (var20 << 8) + (arg4 & 0xFF) * (arg2[var19 + 1] - var20);
            var10001 = var17++;
            arg3[var10001] += arg6 * var21 >> 6;
            arg6 += arg8;
            int var28 = var17++;
            arg3[var28] += arg7 * var21 >> 6;
            arg7 += arg9;
            arg4 += arg14;
        }
        int var22;
        if (arg14 == 0 || (var22 = (var17 >> 1) + (arg12 + arg14 - arg4 - 1) / arg14) > arg11) {
            var22 = arg11;
        }
        int var23 = var22 << 1;
        int var24 = arg15;
        while (var17 < var23) {
            byte var25 = arg2[arg4 >> 8];
            int var26 = (var25 << 8) + (arg4 & 0xFF) * (var24 - var25);
            var10001 = var17++;
            arg3[var10001] += arg6 * var26 >> 6;
            arg6 += arg8;
            var10001 = var17++;
            arg3[var10001] += arg7 * var26 >> 6;
            arg7 += arg9;
            arg4 += arg14;
        }
        int var27 = var17 >> 1;
        arg13.field2503 += arg13.field2496 * var27;
        arg13.field2492 = arg6;
        arg13.field2501 = arg7;
        arg13.field2499 = arg4;
        return var27;
    }

    @OriginalMember(owner = "client!df", name = "c", descriptor = "(I)V", line = 432)
    public final synchronized void method35(int arg0) {
        if (this.field2504 > 0) {
            if (arg0 >= this.field2504) {
                if (this.field2491 == Integer.MIN_VALUE) {
                    this.field2491 = 0;
                    this.field2503 = this.field2492 = this.field2501 = 0;
                    this.method2285(true);
                    arg0 = this.field2504;
                }
                this.field2504 = 0;
                this.method1147();
            } else {
                this.field2503 += this.field2496 * arg0;
                this.field2492 += this.field2500 * arg0;
                this.field2501 += this.field2505 * arg0;
                this.field2504 -= arg0;
            }
        }
        class203 var2 = (class203) this.field844;
        int var3 = this.field2494 << 8;
        int var4 = this.field2495 << 8;
        int var5 = var2.field2854.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field2502 = 0;
        }
        if (this.field2499 < 0) {
            if (this.field2498 <= 0) {
                this.method1167();
                this.method2285(true);
                return;
            }
            this.field2499 = 0;
        }
        if (this.field2499 >= var5) {
            if (this.field2498 >= 0) {
                this.method1167();
                this.method2285(true);
                return;
            }
            this.field2499 = var5 - 1;
        }
        this.field2499 += this.field2498 * arg0;
        if (this.field2502 >= 0) {
            if (this.field2502 > 0) {
                if (this.field2497) {
                    label121: {
                        if (this.field2498 < 0) {
                            if (this.field2499 >= var3) {
                                return;
                            }
                            this.field2499 = var3 + var3 - this.field2499 - 1;
                            this.field2498 = -this.field2498;
                            if (--this.field2502 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field2499 < var4) {
                                return;
                            }
                            this.field2499 = var4 + var4 - this.field2499 - 1;
                            this.field2498 = -this.field2498;
                            if (--this.field2502 == 0) {
                                break;
                            }
                            if (this.field2499 >= var3) {
                                return;
                            }
                            this.field2499 = var3 + var3 - this.field2499 - 1;
                            this.field2498 = -this.field2498;
                        } while (--this.field2502 != 0);
                    }
                } else {
                    label153: {
                        if (this.field2498 < 0) {
                            if (this.field2499 >= var3) {
                                return;
                            }
                            int var7 = (var4 - this.field2499 - 1) / var6;
                            if (var7 >= this.field2502) {
                                this.field2499 += this.field2502 * var6;
                                this.field2502 = 0;
                                break label153;
                            }
                            this.field2499 += var6 * var7;
                            this.field2502 -= var7;
                        } else if (this.field2499 >= var4) {
                            int var8 = (this.field2499 - var3) / var6;
                            if (var8 >= this.field2502) {
                                this.field2499 -= this.field2502 * var6;
                                this.field2502 = 0;
                                break label153;
                            }
                            this.field2499 -= var6 * var8;
                            this.field2502 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field2498 < 0) {
                if (this.field2499 < 0) {
                    this.field2499 = -1;
                    this.method1167();
                    this.method2285(true);
                }
            } else if (this.field2499 >= var5) {
                this.field2499 = var5;
                this.method1167();
                this.method2285(true);
            }
        } else if (this.field2497) {
            if (this.field2498 < 0) {
                if (this.field2499 >= var3) {
                    return;
                }
                this.field2499 = var3 + var3 - this.field2499 - 1;
                this.field2498 = -this.field2498;
            }
            while (this.field2499 >= var4) {
                this.field2499 = var4 + var4 - this.field2499 - 1;
                this.field2498 = -this.field2498;
                if (this.field2499 >= var3) {
                    return;
                }
                this.field2499 = var3 + var3 - this.field2499 - 1;
                this.field2498 = -this.field2498;
            }
        } else if (this.field2498 < 0) {
            if (this.field2499 >= var3) {
                return;
            }
            this.field2499 = var4 - (var4 - 1 - this.field2499) % var6 - 1;
        } else if (this.field2499 >= var4) {
            this.field2499 = (this.field2499 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(I[B[IIIIIIIILdf;)I", line = 650)
    private static final int method1151(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class174 arg10) {
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
            byte var18 = arg1[var11++];
            int var24 = var16++;
            arg2[var24] += var13 * var18;
            int var25 = var16++;
            arg2[var25] += var14 * var18;
            byte var19 = arg1[var11++];
            int var27 = var16++;
            arg2[var27] += var13 * var19;
            int var28 = var16++;
            arg2[var28] += var14 * var19;
            byte var20 = arg1[var11++];
            int var30 = var16++;
            arg2[var30] += var13 * var20;
            int var31 = var16++;
            arg2[var31] += var14 * var20;
            byte var21 = arg1[var11++];
            int var33 = var16++;
            arg2[var33] += var13 * var21;
            int var34 = var16++;
            arg2[var34] += var14 * var21;
        }
        var17 = var23 + 6;
        while (var16 < var17) {
            byte var22 = arg1[var11++];
            int var10001 = var16++;
            arg2[var10001] += var13 * var22;
            int var35 = var16++;
            arg2[var35] += var14 * var22;
        }
        arg10.field2499 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!df", name = "j", descriptor = "()I", line = 688)
    public final synchronized int method1152() {
        return this.field2491 == Integer.MIN_VALUE ? 0 : this.field2491;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(II[B[IIIIIIILdf;II)I", line = 692)
    private static final int method1153(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class174 arg10, int arg11, int arg12) {
        int var13;
        if (arg11 == 0 || (var13 = (arg9 + arg11 + 256 - arg4) / arg11 + arg5) > arg8) {
            var13 = arg8;
        }
        int var10001;
        while (arg5 < var13) {
            int var14 = arg4 >> 8;
            byte var15 = arg2[var14 - 1];
            var10001 = arg5++;
            arg3[var10001] += ((var15 << 8) + (arg4 & 0xFF) * (arg2[var14] - var15)) * arg6 >> 6;
            arg4 += arg11;
        }
        int var16;
        if (arg11 == 0 || (var16 = (arg9 + arg11 - arg4) / arg11 + arg5) > arg8) {
            var16 = arg8;
        }
        int var17 = arg12;
        int var18 = arg11;
        while (arg5 < var16) {
            var10001 = arg5++;
            arg3[var10001] += ((var17 << 8) + (arg4 & 0xFF) * (arg2[arg4 >> 8] - var17)) * arg6 >> 6;
            arg4 += var18;
        }
        arg10.field2499 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(II[B[IIIIIIIILdf;II)I", line = 719)
    private static final int method1154(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class174 arg11, int arg12, int arg13) {
        int var14;
        if (arg12 == 0 || (var14 = (arg10 + arg12 + 256 - arg4) / arg12 + arg5) > arg9) {
            var14 = arg9;
        }
        int var15 = arg5 << 1;
        int var16 = var14 << 1;
        int var10001;
        while (var15 < var16) {
            int var17 = arg4 >> 8;
            byte var18 = arg2[var17 - 1];
            int var19 = (var18 << 8) + (arg4 & 0xFF) * (arg2[var17] - var18);
            var10001 = var15++;
            arg3[var10001] += arg6 * var19 >> 6;
            int var24 = var15++;
            arg3[var24] += arg7 * var19 >> 6;
            arg4 += arg12;
        }
        int var20;
        if (arg12 == 0 || (var20 = (var15 >> 1) + (arg10 + arg12 - arg4) / arg12) > arg9) {
            var20 = arg9;
        }
        int var21 = var20 << 1;
        int var22 = arg13;
        while (var15 < var21) {
            int var23 = (var22 << 8) + (arg4 & 0xFF) * (arg2[arg4 >> 8] - var22);
            var10001 = var15++;
            arg3[var10001] += arg6 * var23 >> 6;
            var10001 = var15++;
            arg3[var10001] += arg7 * var23 >> 6;
            arg4 += arg12;
        }
        arg11.field2499 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!df", name = "c", descriptor = "(II)I", line = 751)
    private static final int method1155(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(Z)V", line = 754)
    public final synchronized void method1156(boolean arg0) {
        this.field2498 = (this.field2498 >>> 31) + (this.field2498 ^ this.field2498 >> 31);
        if (arg0) {
            this.field2498 = -this.field2498;
        }
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "([III)V", line = 760)
    public final synchronized void method34(int[] arg0, int arg1, int arg2) {
        if (this.field2491 == 0 && this.field2504 == 0) {
            this.method35(arg2);
            return;
        }
        class203 var4 = (class203) this.field844;
        int var5 = this.field2494 << 8;
        int var6 = this.field2495 << 8;
        int var7 = var4.field2854.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field2502 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field2499 < 0) {
            if (this.field2498 <= 0) {
                this.method1167();
                this.method2285(true);
                return;
            }
            this.field2499 = 0;
        }
        if (this.field2499 >= var7) {
            if (this.field2498 >= 0) {
                this.method1167();
                this.method2285(true);
                return;
            }
            this.field2499 = var7 - 1;
        }
        if (this.field2502 >= 0) {
            if (this.field2502 > 0) {
                if (this.field2497) {
                    label131: {
                        if (this.field2498 < 0) {
                            var9 = this.method1141(arg0, arg1, var5, var10, var4.field2854[this.field2494]);
                            if (this.field2499 >= var5) {
                                return;
                            }
                            this.field2499 = var5 + var5 - this.field2499 - 1;
                            this.field2498 = -this.field2498;
                            if (--this.field2502 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method1171(arg0, var9, var6, var10, var4.field2854[this.field2495 - 1]);
                            if (this.field2499 < var6) {
                                return;
                            }
                            this.field2499 = var6 + var6 - this.field2499 - 1;
                            this.field2498 = -this.field2498;
                            if (--this.field2502 == 0) {
                                break;
                            }
                            var9 = this.method1141(arg0, var9, var5, var10, var4.field2854[this.field2494]);
                            if (this.field2499 >= var5) {
                                return;
                            }
                            this.field2499 = var5 + var5 - this.field2499 - 1;
                            this.field2498 = -this.field2498;
                        } while (--this.field2502 != 0);
                    }
                } else if (this.field2498 < 0) {
                    while (true) {
                        var9 = this.method1141(arg0, var9, var5, var10, var4.field2854[this.field2495 - 1]);
                        if (this.field2499 >= var5) {
                            return;
                        }
                        int var12 = (var6 - this.field2499 - 1) / var8;
                        if (var12 >= this.field2502) {
                            this.field2499 += this.field2502 * var8;
                            this.field2502 = 0;
                            break;
                        }
                        this.field2499 += var8 * var12;
                        this.field2502 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method1171(arg0, var9, var6, var10, var4.field2854[this.field2494]);
                        if (this.field2499 < var6) {
                            return;
                        }
                        int var13 = (this.field2499 - var5) / var8;
                        if (var13 >= this.field2502) {
                            this.field2499 -= this.field2502 * var8;
                            this.field2502 = 0;
                            break;
                        }
                        this.field2499 -= var8 * var13;
                        this.field2502 -= var13;
                    }
                }
            }
            if (this.field2498 < 0) {
                this.method1141(arg0, var9, 0, var10, 0);
                if (this.field2499 < 0) {
                    this.field2499 = -1;
                    this.method1167();
                    this.method2285(true);
                }
            } else {
                this.method1171(arg0, var9, var7, var10, 0);
                if (this.field2499 >= var7) {
                    this.field2499 = var7;
                    this.method1167();
                    this.method2285(true);
                }
            }
        } else if (this.field2497) {
            if (this.field2498 < 0) {
                var9 = this.method1141(arg0, arg1, var5, var10, var4.field2854[this.field2494]);
                if (this.field2499 >= var5) {
                    return;
                }
                this.field2499 = var5 + var5 - this.field2499 - 1;
                this.field2498 = -this.field2498;
            }
            while (true) {
                int var11 = this.method1171(arg0, var9, var6, var10, var4.field2854[this.field2495 - 1]);
                if (this.field2499 < var6) {
                    return;
                }
                this.field2499 = var6 + var6 - this.field2499 - 1;
                this.field2498 = -this.field2498;
                var9 = this.method1141(arg0, var11, var5, var10, var4.field2854[this.field2494]);
                if (this.field2499 >= var5) {
                    return;
                }
                this.field2499 = var5 + var5 - this.field2499 - 1;
                this.field2498 = -this.field2498;
            }
        } else if (this.field2498 < 0) {
            while (true) {
                var9 = this.method1141(arg0, var9, var5, var10, var4.field2854[this.field2495 - 1]);
                if (this.field2499 >= var5) {
                    return;
                }
                this.field2499 = var6 - (var6 - 1 - this.field2499) % var8 - 1;
            }
        } else {
            while (true) {
                var9 = this.method1171(arg0, var9, var6, var10, var4.field2854[this.field2494]);
                if (this.field2499 < var6) {
                    return;
                }
                this.field2499 = (this.field2499 - var5) % var8 + var5;
            }
        }
    }

    @OriginalMember(owner = "client!df", name = "k", descriptor = "()Z", line = 996)
    public final boolean method1157() {
        return this.field2504 != 0;
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(II[B[IIIIIIIILdf;II)I", line = 999)
    private static final int method1158(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class174 arg11, int arg12, int arg13) {
        int var14;
        if (arg12 == 0 || (var14 = (arg10 + arg12 - arg4 - 257) / arg12 + arg5) > arg9) {
            var14 = arg9;
        }
        int var15 = arg5 << 1;
        int var16 = var14 << 1;
        int var10001;
        while (var15 < var16) {
            int var17 = arg4 >> 8;
            byte var18 = arg2[var17];
            int var19 = (var18 << 8) + (arg4 & 0xFF) * (arg2[var17 + 1] - var18);
            var10001 = var15++;
            arg3[var10001] += arg6 * var19 >> 6;
            int var25 = var15++;
            arg3[var25] += arg7 * var19 >> 6;
            arg4 += arg12;
        }
        int var20;
        if (arg12 == 0 || (var20 = (var15 >> 1) + (arg10 + arg12 - arg4 - 1) / arg12) > arg9) {
            var20 = arg9;
        }
        int var21 = var20 << 1;
        int var22 = arg13;
        while (var15 < var21) {
            byte var23 = arg2[arg4 >> 8];
            int var24 = (var23 << 8) + (arg4 & 0xFF) * (var22 - var23);
            var10001 = var15++;
            arg3[var10001] += arg6 * var24 >> 6;
            var10001 = var15++;
            arg3[var10001] += arg7 * var24 >> 6;
            arg4 += arg12;
        }
        arg11.field2499 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(I[B[IIIIIIIIIILdf;)I", line = 1032)
    private static final int method1159(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class174 arg12) {
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
        arg12.field2503 += (var19 - arg4) * arg12.field2496;
        int var20 = arg4 << 1;
        int var21 = var19 << 1;
        int var44 = var21 - 6;
        while (var20 < var44) {
            byte var22 = arg1[var13--];
            int var33 = var20++;
            arg2[var33] += var15 * var22;
            int var23 = var15 + var17;
            int var34 = var20++;
            arg2[var34] += var16 * var22;
            int var24 = var16 + var18;
            byte var25 = arg1[var13--];
            int var36 = var20++;
            arg2[var36] += var23 * var25;
            int var26 = var17 + var23;
            int var37 = var20++;
            arg2[var37] += var24 * var25;
            int var27 = var18 + var24;
            byte var28 = arg1[var13--];
            int var39 = var20++;
            arg2[var39] += var26 * var28;
            int var29 = var17 + var26;
            int var40 = var20++;
            arg2[var40] += var27 * var28;
            int var30 = var18 + var27;
            byte var31 = arg1[var13--];
            int var42 = var20++;
            arg2[var42] += var29 * var31;
            var15 = var17 + var29;
            int var43 = var20++;
            arg2[var43] += var30 * var31;
            var16 = var18 + var30;
        }
        var21 = var44 + 6;
        while (var20 < var21) {
            byte var32 = arg1[var13--];
            int var10001 = var20++;
            arg2[var10001] += var15 * var32;
            var15 += var17;
            int var45 = var20++;
            arg2[var45] += var16 * var32;
            var16 += var18;
        }
        arg12.field2492 = var15 >> 2;
        arg12.field2501 = var16 >> 2;
        arg12.field2499 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "()Lfb;", line = 1086)
    public final class65 method33() {
        return null;
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(I[B[IIIIIIIIIILdf;)I", line = 1090)
    private static final int method1160(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class174 arg12) {
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
        arg12.field2503 += (var19 - arg4) * arg12.field2496;
        int var20 = arg4 << 1;
        int var21 = var19 << 1;
        int var44 = var21 - 6;
        while (var20 < var44) {
            byte var22 = arg1[var13++];
            int var33 = var20++;
            arg2[var33] += var15 * var22;
            int var23 = var15 + var17;
            int var34 = var20++;
            arg2[var34] += var16 * var22;
            int var24 = var16 + var18;
            byte var25 = arg1[var13++];
            int var36 = var20++;
            arg2[var36] += var23 * var25;
            int var26 = var17 + var23;
            int var37 = var20++;
            arg2[var37] += var24 * var25;
            int var27 = var18 + var24;
            byte var28 = arg1[var13++];
            int var39 = var20++;
            arg2[var39] += var26 * var28;
            int var29 = var17 + var26;
            int var40 = var20++;
            arg2[var40] += var27 * var28;
            int var30 = var18 + var27;
            byte var31 = arg1[var13++];
            int var42 = var20++;
            arg2[var42] += var29 * var31;
            var15 = var17 + var29;
            int var43 = var20++;
            arg2[var43] += var30 * var31;
            var16 = var18 + var30;
        }
        var21 = var44 + 6;
        while (var20 < var21) {
            byte var32 = arg1[var13++];
            int var10001 = var20++;
            arg2[var10001] += var15 * var32;
            var15 += var17;
            int var45 = var20++;
            arg2[var45] += var16 * var32;
            var16 += var18;
        }
        arg12.field2492 = var15 >> 2;
        arg12.field2501 = var16 >> 2;
        arg12.field2499 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "([B[IIIIIIILdf;)I", line = 1144)
    private static final int method1161(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class174 arg8) {
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
        arg8.field2499 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "([B[IIIIIIIILdf;)I", line = 1169)
    private static final int method1162(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class174 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field2492 += (var14 - arg3) * arg9.field2500;
        arg9.field2501 += (var14 - arg3) * arg9.field2505;
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
        arg9.field2503 = var12 >> 2;
        arg9.field2499 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "([B[IIIIIIIILdf;)I", line = 1205)
    private static final int method1163(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class174 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field2492 += (var14 - arg3) * arg9.field2500;
        arg9.field2501 += (var14 - arg3) * arg9.field2505;
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
        arg9.field2503 = var12 >> 2;
        arg9.field2499 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!df", name = "c", descriptor = "(II[B[IIIIIIIILdf;II)I", line = 1239)
    private static final int method1164(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class174 arg11, int arg12, int arg13) {
        arg11.field2492 -= arg11.field2500 * arg5;
        arg11.field2501 -= arg11.field2505 * arg5;
        int var14;
        if (arg12 == 0 || (var14 = (arg10 + arg12 - arg4 - 257) / arg12 + arg5) > arg9) {
            var14 = arg9;
        }
        int var10001;
        while (arg5 < var14) {
            int var15 = arg4 >> 8;
            byte var16 = arg2[var15];
            var10001 = arg5++;
            arg3[var10001] += ((var16 << 8) + (arg4 & 0xFF) * (arg2[var15 + 1] - var16)) * arg6 >> 6;
            arg6 += arg7;
            arg4 += arg12;
        }
        int var17;
        if (arg12 == 0 || (var17 = (arg10 + arg12 - arg4 - 1) / arg12 + arg5) > arg9) {
            var17 = arg9;
        }
        int var18 = arg13;
        while (arg5 < var17) {
            byte var19 = arg2[arg4 >> 8];
            var10001 = arg5++;
            arg3[var10001] += ((var19 << 8) + (arg4 & 0xFF) * (var18 - var19)) * arg6 >> 6;
            arg6 += arg7;
            arg4 += arg12;
        }
        arg11.field2492 += arg11.field2500 * arg5;
        arg11.field2501 += arg11.field2505 * arg5;
        arg11.field2503 = arg6;
        arg11.field2499 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(II[B[IIIIIIILdf;II)I", line = 1273)
    private static final int method1165(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class174 arg10, int arg11, int arg12) {
        int var13;
        if (arg11 == 0 || (var13 = (arg9 + arg11 - arg4 - 257) / arg11 + arg5) > arg8) {
            var13 = arg8;
        }
        int var10001;
        while (arg5 < var13) {
            int var14 = arg4 >> 8;
            byte var15 = arg2[var14];
            var10001 = arg5++;
            arg3[var10001] += ((var15 << 8) + (arg4 & 0xFF) * (arg2[var14 + 1] - var15)) * arg6 >> 6;
            arg4 += arg11;
        }
        int var16;
        if (arg11 == 0 || (var16 = (arg9 + arg11 - arg4 - 1) / arg11 + arg5) > arg8) {
            var16 = arg8;
        }
        int var17 = arg12;
        while (arg5 < var16) {
            byte var18 = arg2[arg4 >> 8];
            var10001 = arg5++;
            arg3[var10001] += ((var18 << 8) + (arg4 & 0xFF) * (var17 - var18)) * arg6 >> 6;
            arg4 += arg11;
        }
        arg10.field2499 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!df", name = "d", descriptor = "(II[B[IIIIIIIILdf;II)I", line = 1299)
    private static final int method1166(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class174 arg11, int arg12, int arg13) {
        arg11.field2492 -= arg11.field2500 * arg5;
        arg11.field2501 -= arg11.field2505 * arg5;
        int var14;
        if (arg12 == 0 || (var14 = (arg10 + arg12 + 256 - arg4) / arg12 + arg5) > arg9) {
            var14 = arg9;
        }
        int var10001;
        while (arg5 < var14) {
            int var15 = arg4 >> 8;
            byte var16 = arg2[var15 - 1];
            var10001 = arg5++;
            arg3[var10001] += ((var16 << 8) + (arg4 & 0xFF) * (arg2[var15] - var16)) * arg6 >> 6;
            arg6 += arg7;
            arg4 += arg12;
        }
        int var17;
        if (arg12 == 0 || (var17 = (arg10 + arg12 - arg4) / arg12 + arg5) > arg9) {
            var17 = arg9;
        }
        int var18 = arg13;
        int var19 = arg12;
        while (arg5 < var17) {
            var10001 = arg5++;
            arg3[var10001] += ((var18 << 8) + (arg4 & 0xFF) * (arg2[arg4 >> 8] - var18)) * arg6 >> 6;
            arg6 += arg7;
            arg4 += var19;
        }
        arg11.field2492 += arg11.field2500 * arg5;
        arg11.field2501 += arg11.field2505 * arg5;
        arg11.field2503 = arg6;
        arg11.field2499 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!df", name = "l", descriptor = "()V", line = 1333)
    private final void method1167() {
        if (this.field2504 == 0) {
            return;
        }
        if (this.field2491 == Integer.MIN_VALUE) {
            this.field2491 = 0;
        }
        this.field2504 = 0;
        this.method1147();
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Lgl;II)Ldf;", line = 1344)
    public static final class174 method1168(class203 arg0, int arg1, int arg2) {
        return arg0.field2854 == null || arg0.field2854.length == 0 ? null : new class174(arg0, (int) ((long) arg0.field2853 * 256L * (long) arg1 / (long) (class276.field4312 * 100)), arg2 << 6);
    }

    @OriginalMember(owner = "client!df", name = "d", descriptor = "(II)I", line = 1350)
    private static final int method1169(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Lgl;III)Ldf;", line = 1353)
    public static final class174 method1170(class203 arg0, int arg1, int arg2, int arg3) {
        return arg0.field2854 == null || arg0.field2854.length == 0 ? null : new class174(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "([IIIII)I", line = 1360)
    private final int method1171(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field2504 > 0) {
                int var6 = this.field2504 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field2504 += arg1;
                if (this.field2498 == 256 && (this.field2499 & 0xFF) == 0) {
                    if (class177.field2566) {
                        arg1 = method1160(0, ((class203) this.field844).field2854, arg0, this.field2499, arg1, this.field2492, this.field2501, this.field2500, this.field2505, 0, var6, arg2, this);
                    } else {
                        arg1 = method1163(((class203) this.field844).field2854, arg0, this.field2499, arg1, this.field2503, this.field2496, 0, var6, arg2, this);
                    }
                } else if (class177.field2566) {
                    arg1 = method1150(0, 0, ((class203) this.field844).field2854, arg0, this.field2499, arg1, this.field2492, this.field2501, this.field2500, this.field2505, 0, var6, arg2, this, this.field2498, arg4);
                } else {
                    arg1 = method1164(0, 0, ((class203) this.field844).field2854, arg0, this.field2499, arg1, this.field2503, this.field2496, 0, var6, arg2, this, this.field2498, arg4);
                }
                this.field2504 -= arg1;
                if (this.field2504 != 0) {
                    return arg1;
                }
                if (!this.method1148()) {
                    continue;
                }
                return arg3;
            }
            if (this.field2498 == 256 && (this.field2499 & 0xFF) == 0) {
                if (class177.field2566) {
                    return method1151(0, ((class203) this.field844).field2854, arg0, this.field2499, arg1, this.field2492, this.field2501, 0, arg3, arg2, this);
                }
                return method1161(((class203) this.field844).field2854, arg0, this.field2499, arg1, this.field2503, 0, arg3, arg2, this);
            }
            if (class177.field2566) {
                return method1158(0, 0, ((class203) this.field844).field2854, arg0, this.field2499, arg1, this.field2492, this.field2501, 0, arg3, arg2, this, this.field2498, arg4);
            }
            return method1165(0, 0, ((class203) this.field844).field2854, arg0, this.field2499, arg1, this.field2503, 0, arg3, arg2, this, this.field2498, arg4);
        }
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(I[B[IIIIIIIILdf;)I", line = 1416)
    private static final int method1172(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class174 arg10) {
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
            byte var18 = arg1[var11--];
            int var24 = var16++;
            arg2[var24] += var13 * var18;
            int var25 = var16++;
            arg2[var25] += var14 * var18;
            byte var19 = arg1[var11--];
            int var27 = var16++;
            arg2[var27] += var13 * var19;
            int var28 = var16++;
            arg2[var28] += var14 * var19;
            byte var20 = arg1[var11--];
            int var30 = var16++;
            arg2[var30] += var13 * var20;
            int var31 = var16++;
            arg2[var31] += var14 * var20;
            byte var21 = arg1[var11--];
            int var33 = var16++;
            arg2[var33] += var13 * var21;
            int var34 = var16++;
            arg2[var34] += var14 * var21;
        }
        var17 = var23 + 6;
        while (var16 < var17) {
            byte var22 = arg1[var11--];
            int var10001 = var16++;
            arg2[var10001] += var13 * var22;
            int var35 = var16++;
            arg2[var35] += var14 * var22;
        }
        arg10.field2499 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!df", name = "i", descriptor = "(I)V", line = 1455)
    private final synchronized void method1173(int arg0) {
        this.method1149(arg0, this.method1145());
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "(Lgl;II)V", line = 1458)
    private class174(class203 arg0, int arg1, int arg2) {
        this.field844 = arg0;
        this.field2494 = arg0.field2857;
        this.field2495 = arg0.field2856;
        this.field2497 = arg0.field2855;
        this.field2498 = arg1;
        this.field2491 = arg2;
        this.field2493 = 8192;
        this.field2499 = 0;
        this.method1147();
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "(Lgl;III)V", line = 1469)
    private class174(class203 arg0, int arg1, int arg2, int arg3) {
        this.field844 = arg0;
        this.field2494 = arg0.field2857;
        this.field2495 = arg0.field2856;
        this.field2497 = arg0.field2855;
        this.field2498 = arg1;
        this.field2491 = arg2;
        this.field2493 = arg3;
        this.field2499 = 0;
        this.method1147();
    }
}
