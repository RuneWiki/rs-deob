import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class144 extends class172 {

    @OriginalMember(owner = "client!ac", name = "u", descriptor = "I")
    private int field2337;

    @OriginalMember(owner = "client!ac", name = "p", descriptor = "I")
    private int field2332;

    @OriginalMember(owner = "client!ac", name = "y", descriptor = "Z")
    private boolean field2341;

    @OriginalMember(owner = "client!ac", name = "x", descriptor = "I")
    private int field2340;

    @OriginalMember(owner = "client!ac", name = "v", descriptor = "I")
    private int field2338;

    @OriginalMember(owner = "client!ac", name = "z", descriptor = "I")
    private int field2342;

    @OriginalMember(owner = "client!ac", name = "s", descriptor = "I")
    private int field2335;

    @OriginalMember(owner = "client!ac", name = "q", descriptor = "I")
    private int field2333;

    @OriginalMember(owner = "client!ac", name = "r", descriptor = "I")
    private int field2334;

    @OriginalMember(owner = "client!ac", name = "t", descriptor = "I")
    private int field2336;

    @OriginalMember(owner = "client!ac", name = "w", descriptor = "I")
    private int field2339;

    @OriginalMember(owner = "client!ac", name = "A", descriptor = "I")
    private int field2343;

    @OriginalMember(owner = "client!ac", name = "C", descriptor = "I")
    private int field2344;

    @OriginalMember(owner = "client!ac", name = "D", descriptor = "I")
    private int field2345;

    @OriginalMember(owner = "client!ac", name = "E", descriptor = "I")
    private int field2346;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "([B[IIIIIIILac;)I", line = 3)
    private static final int method1028(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class144 arg8) {
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
        arg8.field2335 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "()I", line = 28)
    public final int method451() {
        return this.field2338 == 0 && this.field2333 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(II)I", line = 34)
    private static final int method1029(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "(I)V", line = 38)
    public final synchronized void method439(int arg0) {
        if (this.field2333 > 0) {
            if (arg0 >= this.field2333) {
                if (this.field2338 == Integer.MIN_VALUE) {
                    this.field2338 = 0;
                    this.field2346 = this.field2344 = this.field2343 = 0;
                    this.method598(109);
                    arg0 = this.field2333;
                }
                this.field2333 = 0;
                this.method1034();
            } else {
                this.field2346 += this.field2345 * arg0;
                this.field2344 += this.field2339 * arg0;
                this.field2343 += this.field2336 * arg0;
                this.field2333 -= arg0;
            }
        }
        class182 var2 = (class182) this.field2821;
        int var3 = this.field2337 << 8;
        int var4 = this.field2332 << 8;
        int var5 = var2.field2973.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field2334 = 0;
        }
        if (this.field2335 < 0) {
            if (this.field2340 <= 0) {
                this.method1066();
                this.method598(102);
                return;
            }
            this.field2335 = 0;
        }
        if (this.field2335 >= var5) {
            if (this.field2340 >= 0) {
                this.method1066();
                this.method598(81);
                return;
            }
            this.field2335 = var5 - 1;
        }
        this.field2335 += this.field2340 * arg0;
        if (this.field2334 >= 0) {
            if (this.field2334 > 0) {
                if (this.field2341) {
                    label121: {
                        if (this.field2340 < 0) {
                            if (this.field2335 >= var3) {
                                return;
                            }
                            this.field2335 = var3 + var3 - this.field2335 - 1;
                            this.field2340 = -this.field2340;
                            if (--this.field2334 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field2335 < var4) {
                                return;
                            }
                            this.field2335 = var4 + var4 - this.field2335 - 1;
                            this.field2340 = -this.field2340;
                            if (--this.field2334 == 0) {
                                break;
                            }
                            if (this.field2335 >= var3) {
                                return;
                            }
                            this.field2335 = var3 + var3 - this.field2335 - 1;
                            this.field2340 = -this.field2340;
                        } while (--this.field2334 != 0);
                    }
                } else {
                    label153: {
                        if (this.field2340 < 0) {
                            if (this.field2335 >= var3) {
                                return;
                            }
                            int var7 = (var4 - this.field2335 - 1) / var6;
                            if (var7 >= this.field2334) {
                                this.field2335 += this.field2334 * var6;
                                this.field2334 = 0;
                                break label153;
                            }
                            this.field2335 += var6 * var7;
                            this.field2334 -= var7;
                        } else if (this.field2335 >= var4) {
                            int var8 = (this.field2335 - var3) / var6;
                            if (var8 >= this.field2334) {
                                this.field2335 -= this.field2334 * var6;
                                this.field2334 = 0;
                                break label153;
                            }
                            this.field2335 -= var6 * var8;
                            this.field2334 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field2340 < 0) {
                if (this.field2335 < 0) {
                    this.field2335 = -1;
                    this.method1066();
                    this.method598(19);
                }
            } else if (this.field2335 >= var5) {
                this.field2335 = var5;
                this.method1066();
                this.method598(39);
            }
        } else if (this.field2341) {
            if (this.field2340 < 0) {
                if (this.field2335 >= var3) {
                    return;
                }
                this.field2335 = var3 + var3 - this.field2335 - 1;
                this.field2340 = -this.field2340;
            }
            while (this.field2335 >= var4) {
                this.field2335 = var4 + var4 - this.field2335 - 1;
                this.field2340 = -this.field2340;
                if (this.field2335 >= var3) {
                    return;
                }
                this.field2335 = var3 + var3 - this.field2335 - 1;
                this.field2340 = -this.field2340;
            }
        } else if (this.field2340 < 0) {
            if (this.field2335 >= var3) {
                return;
            }
            this.field2335 = var4 - (var4 - 1 - this.field2335) % var6 - 1;
        } else if (this.field2335 >= var4) {
            this.field2335 = (this.field2335 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "(I)V", line = 256)
    public final synchronized void method1030(int arg0) {
        if (arg0 == 0) {
            this.method1039(0);
            this.method598(47);
        } else if (this.field2344 == 0 && this.field2343 == 0) {
            this.field2333 = 0;
            this.field2338 = 0;
            this.field2346 = 0;
            this.method598(127);
        } else {
            int var2 = -this.field2346;
            if (this.field2346 > var2) {
                var2 = this.field2346;
            }
            if (-this.field2344 > var2) {
                var2 = -this.field2344;
            }
            if (this.field2344 > var2) {
                var2 = this.field2344;
            }
            if (-this.field2343 > var2) {
                var2 = -this.field2343;
            }
            if (this.field2343 > var2) {
                var2 = this.field2343;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field2333 = arg0;
            this.field2338 = Integer.MIN_VALUE;
            this.field2345 = -this.field2346 / arg0;
            this.field2339 = -this.field2344 / arg0;
            this.field2336 = -this.field2343 / arg0;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "([B[IIIIIIIILac;)I", line = 307)
    private static final int method1031(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class144 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field2344 += (var14 - arg3) * arg9.field2339;
        arg9.field2343 += (var14 - arg3) * arg9.field2336;
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
        arg9.field2346 = var12 >> 2;
        arg9.field2335 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(II)V", line = 341)
    private final synchronized void method1032(int arg0, int arg1) {
        this.field2338 = arg0;
        this.field2342 = arg1;
        this.field2333 = 0;
        this.method1034();
    }

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "(II)V", line = 347)
    public final synchronized void method1033(int arg0, int arg1) {
        this.method1068(arg0, arg1, this.method1036());
    }

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "()V", line = 350)
    private final void method1034() {
        this.field2346 = this.field2338;
        this.field2344 = method1067(this.field2338, this.field2342);
        this.field2343 = method1029(this.field2338, this.field2342);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(II[B[IIIIIIIILac;II)I", line = 355)
    private static final int method1035(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class144 arg11, int arg12, int arg13) {
        arg11.field2344 -= arg11.field2339 * arg5;
        arg11.field2343 -= arg11.field2336 * arg5;
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
        arg11.field2344 += arg11.field2339 * arg5;
        arg11.field2343 += arg11.field2336 * arg5;
        arg11.field2346 = arg6;
        arg11.field2335 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "()I", line = 388)
    public final synchronized int method1036() {
        return this.field2342 < 0 ? -1 : this.field2342;
    }

    @OriginalMember(owner = "client!ac", name = "g", descriptor = "(I)V", line = 391)
    public final synchronized void method1037(int arg0) {
        if (this.field2340 < 0) {
            this.field2340 = -arg0;
        } else {
            this.field2340 = arg0;
        }
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "([B[IIIIIIIILac;)I", line = 399)
    private static final int method1038(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class144 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field2344 += (var14 - arg3) * arg9.field2339;
        arg9.field2343 += (var14 - arg3) * arg9.field2336;
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
        arg9.field2346 = var12 >> 2;
        arg9.field2335 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ac", name = "h", descriptor = "(I)V", line = 435)
    private final synchronized void method1039(int arg0) {
        this.method1032(arg0, this.method1036());
    }

    @OriginalMember(owner = "client!ac", name = "g", descriptor = "()Z", line = 438)
    public final boolean method1040() {
        return this.field2335 < 0 || this.field2335 >= ((class182) this.field2821).field2973.length << 8;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "()La;", line = 441)
    public final class172 method459() {
        return null;
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(II[B[IIIIIIIILac;II)I", line = 444)
    private static final int method1041(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class144 arg11, int arg12, int arg13) {
        arg11.field2344 -= arg11.field2339 * arg5;
        arg11.field2343 -= arg11.field2336 * arg5;
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
        arg11.field2344 += arg11.field2339 * arg5;
        arg11.field2343 += arg11.field2336 * arg5;
        arg11.field2346 = arg6;
        arg11.field2335 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "([IIIII)I", line = 478)
    private final int method1042(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field2333 > 0) {
                int var6 = this.field2333 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field2333 += arg1;
                if (this.field2340 == 256 && (this.field2335 & 0xFF) == 0) {
                    if (class222.field3657) {
                        arg1 = method1058(0, ((class182) this.field2821).field2973, arg0, this.field2335, arg1, this.field2344, this.field2343, this.field2339, this.field2336, 0, var6, arg2, this);
                    } else {
                        arg1 = method1031(((class182) this.field2821).field2973, arg0, this.field2335, arg1, this.field2346, this.field2345, 0, var6, arg2, this);
                    }
                } else if (class222.field3657) {
                    arg1 = method1062(0, 0, ((class182) this.field2821).field2973, arg0, this.field2335, arg1, this.field2344, this.field2343, this.field2339, this.field2336, 0, var6, arg2, this, this.field2340, arg4);
                } else {
                    arg1 = method1035(0, 0, ((class182) this.field2821).field2973, arg0, this.field2335, arg1, this.field2346, this.field2345, 0, var6, arg2, this, this.field2340, arg4);
                }
                this.field2333 -= arg1;
                if (this.field2333 != 0) {
                    return arg1;
                }
                if (!this.method1044()) {
                    continue;
                }
                return arg3;
            }
            if (this.field2340 == 256 && (this.field2335 & 0xFF) == 0) {
                if (class222.field3657) {
                    return method1045(0, ((class182) this.field2821).field2973, arg0, this.field2335, arg1, this.field2344, this.field2343, 0, arg3, arg2, this);
                }
                return method1064(((class182) this.field2821).field2973, arg0, this.field2335, arg1, this.field2346, 0, arg3, arg2, this);
            }
            if (class222.field3657) {
                return method1057(0, 0, ((class182) this.field2821).field2973, arg0, this.field2335, arg1, this.field2344, this.field2343, 0, arg3, arg2, this, this.field2340, arg4);
            }
            return method1060(0, 0, ((class182) this.field2821).field2973, arg0, this.field2335, arg1, this.field2346, 0, arg3, arg2, this, this.field2340, arg4);
        }
    }

    @OriginalMember(owner = "client!ac", name = "h", descriptor = "()Z", line = 534)
    public final boolean method1043() {
        return this.field2333 != 0;
    }

    @OriginalMember(owner = "client!ac", name = "i", descriptor = "()Z", line = 539)
    private final boolean method1044() {
        int var1 = this.field2338;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1067(var1, this.field2342);
            var2 = method1029(var1, this.field2342);
        }
        if (this.field2346 != var1 || this.field2344 != var3 || this.field2343 != var2) {
            if (this.field2346 < var1) {
                this.field2345 = 1;
                this.field2333 = var1 - this.field2346;
            } else if (this.field2346 > var1) {
                this.field2345 = -1;
                this.field2333 = this.field2346 - var1;
            } else {
                this.field2345 = 0;
            }
            if (this.field2344 < var3) {
                this.field2339 = 1;
                if (this.field2333 == 0 || this.field2333 > var3 - this.field2344) {
                    this.field2333 = var3 - this.field2344;
                }
            } else if (this.field2344 > var3) {
                this.field2339 = -1;
                if (this.field2333 == 0 || this.field2333 > this.field2344 - var3) {
                    this.field2333 = this.field2344 - var3;
                }
            } else {
                this.field2339 = 0;
            }
            if (this.field2343 < var2) {
                this.field2336 = 1;
                if (this.field2333 == 0 || this.field2333 > var2 - this.field2343) {
                    this.field2333 = var2 - this.field2343;
                }
            } else if (this.field2343 > var2) {
                this.field2336 = -1;
                if (this.field2333 == 0 || this.field2333 > this.field2343 - var2) {
                    this.field2333 = this.field2343 - var2;
                }
            } else {
                this.field2336 = 0;
            }
            return false;
        } else if (this.field2338 == Integer.MIN_VALUE) {
            this.field2338 = 0;
            this.field2346 = this.field2344 = this.field2343 = 0;
            this.method598(60);
            return true;
        } else {
            this.method1034();
            return false;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(I[B[IIIIIIIILac;)I", line = 624)
    private static final int method1045(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class144 arg10) {
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
        arg10.field2335 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lqd;III)Lac;", line = 662)
    public static final class144 method1046(class182 arg0, int arg1, int arg2, int arg3) {
        return arg0.field2973 == null || arg0.field2973.length == 0 ? null : new class144(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(II[B[IIIIIIILac;II)I", line = 669)
    private static final int method1047(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class144 arg10, int arg11, int arg12) {
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
        arg10.field2335 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Z)V", line = 695)
    public final synchronized void method1048(boolean arg0) {
        this.field2340 = (this.field2340 >>> 31) + (this.field2340 ^ this.field2340 >> 31);
        if (arg0) {
            this.field2340 = -this.field2340;
        }
    }

    @OriginalMember(owner = "client!ac", name = "i", descriptor = "(I)V", line = 701)
    public final synchronized void method1049(int arg0) {
        this.method1032(arg0 << 6, this.method1036());
    }

    @OriginalMember(owner = "client!ac", name = "j", descriptor = "(I)V", line = 708)
    public final synchronized void method1050(int arg0) {
        this.field2334 = arg0;
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(I[B[IIIIIIIILac;)I", line = 711)
    private static final int method1051(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class144 arg10) {
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
        arg10.field2335 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(II[B[IIIIIIIIIILac;II)I", line = 755)
    private static final int method1052(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class144 arg13, int arg14, int arg15) {
        arg13.field2346 -= arg13.field2345 * arg5;
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
        arg13.field2346 += arg13.field2345 * var26;
        arg13.field2344 = arg6;
        arg13.field2343 = arg7;
        arg13.field2335 = arg4;
        return var26;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lqd;II)Lac;", line = 796)
    public static final class144 method1053(class182 arg0, int arg1, int arg2) {
        return arg0.field2973 == null || arg0.field2973.length == 0 ? null : new class144(arg0, (int) ((long) arg0.field2970 * 256L * (long) arg1 / (long) (class255.field4264 * 100)), arg2 << 6);
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "([IIIII)I", line = 803)
    private final int method1054(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field2333 > 0) {
                int var6 = this.field2333 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field2333 += arg1;
                if (this.field2340 == -256 && (this.field2335 & 0xFF) == 0) {
                    if (class222.field3657) {
                        arg1 = method1061(0, ((class182) this.field2821).field2973, arg0, this.field2335, arg1, this.field2344, this.field2343, this.field2339, this.field2336, 0, var6, arg2, this);
                    } else {
                        arg1 = method1038(((class182) this.field2821).field2973, arg0, this.field2335, arg1, this.field2346, this.field2345, 0, var6, arg2, this);
                    }
                } else if (class222.field3657) {
                    arg1 = method1052(0, 0, ((class182) this.field2821).field2973, arg0, this.field2335, arg1, this.field2344, this.field2343, this.field2339, this.field2336, 0, var6, arg2, this, this.field2340, arg4);
                } else {
                    arg1 = method1041(0, 0, ((class182) this.field2821).field2973, arg0, this.field2335, arg1, this.field2346, this.field2345, 0, var6, arg2, this, this.field2340, arg4);
                }
                this.field2333 -= arg1;
                if (this.field2333 != 0) {
                    return arg1;
                }
                if (!this.method1044()) {
                    continue;
                }
                return arg3;
            }
            if (this.field2340 == -256 && (this.field2335 & 0xFF) == 0) {
                if (class222.field3657) {
                    return method1051(0, ((class182) this.field2821).field2973, arg0, this.field2335, arg1, this.field2344, this.field2343, 0, arg3, arg2, this);
                }
                return method1028(((class182) this.field2821).field2973, arg0, this.field2335, arg1, this.field2346, 0, arg3, arg2, this);
            }
            if (class222.field3657) {
                return method1055(0, 0, ((class182) this.field2821).field2973, arg0, this.field2335, arg1, this.field2344, this.field2343, 0, arg3, arg2, this, this.field2340, arg4);
            }
            return method1047(0, 0, ((class182) this.field2821).field2973, arg0, this.field2335, arg1, this.field2346, 0, arg3, arg2, this, this.field2340, arg4);
        }
    }

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "(II[B[IIIIIIIILac;II)I", line = 858)
    private static final int method1055(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class144 arg11, int arg12, int arg13) {
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
        arg11.field2335 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!ac", name = "k", descriptor = "(I)V", line = 891)
    public final synchronized void method1056(int arg0) {
        int var2 = ((class182) this.field2821).field2973.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field2335 = arg0;
    }

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "(II[B[IIIIIIIILac;II)I", line = 901)
    private static final int method1057(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class144 arg11, int arg12, int arg13) {
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
        arg11.field2335 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(I[B[IIIIIIIIIILac;)I", line = 935)
    private static final int method1058(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class144 arg12) {
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
        arg12.field2346 += (var19 - arg4) * arg12.field2345;
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
        arg12.field2344 = var15 >> 2;
        arg12.field2343 = var16 >> 2;
        arg12.field2335 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "()I", line = 989)
    public final int method1059() {
        int var1 = this.field2346 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field2334 == 0) {
            var2 -= this.field2335 * var2 / (((class182) this.field2821).field2973.length << 8);
        } else if (this.field2334 >= 0) {
            var2 -= this.field2337 * var2 / ((class182) this.field2821).field2973.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(II[B[IIIIIIILac;II)I", line = 1001)
    private static final int method1060(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class144 arg10, int arg11, int arg12) {
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
        arg10.field2335 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(I[B[IIIIIIIIIILac;)I", line = 1027)
    private static final int method1061(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class144 arg12) {
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
        arg12.field2346 += (var19 - arg4) * arg12.field2345;
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
        arg12.field2344 = var15 >> 2;
        arg12.field2343 = var16 >> 2;
        arg12.field2335 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(II[B[IIIIIIIIIILac;II)I", line = 1082)
    private static final int method1062(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class144 arg13, int arg14, int arg15) {
        arg13.field2346 -= arg13.field2345 * arg5;
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
        arg13.field2346 += arg13.field2345 * var27;
        arg13.field2344 = arg6;
        arg13.field2343 = arg7;
        arg13.field2335 = arg4;
        return var27;
    }

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "()La;", line = 1124)
    public final class172 method463() {
        return null;
    }

    @OriginalMember(owner = "client!ac", name = "j", descriptor = "()I", line = 1129)
    public final synchronized int method1063() {
        return this.field2338 == Integer.MIN_VALUE ? 0 : this.field2338;
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "([B[IIIIIIILac;)I", line = 1132)
    private static final int method1064(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class144 arg8) {
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
        arg8.field2335 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "([III)V", line = 1157)
    public final synchronized void method474(int[] arg0, int arg1, int arg2) {
        if (this.field2338 == 0 && this.field2333 == 0) {
            this.method439(arg2);
            return;
        }
        class182 var4 = (class182) this.field2821;
        int var5 = this.field2337 << 8;
        int var6 = this.field2332 << 8;
        int var7 = var4.field2973.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field2334 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field2335 < 0) {
            if (this.field2340 <= 0) {
                this.method1066();
                this.method598(99);
                return;
            }
            this.field2335 = 0;
        }
        if (this.field2335 >= var7) {
            if (this.field2340 >= 0) {
                this.method1066();
                this.method598(72);
                return;
            }
            this.field2335 = var7 - 1;
        }
        if (this.field2334 >= 0) {
            if (this.field2334 > 0) {
                if (this.field2341) {
                    label131: {
                        if (this.field2340 < 0) {
                            var9 = this.method1054(arg0, arg1, var5, var10, var4.field2973[this.field2337]);
                            if (this.field2335 >= var5) {
                                return;
                            }
                            this.field2335 = var5 + var5 - this.field2335 - 1;
                            this.field2340 = -this.field2340;
                            if (--this.field2334 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method1042(arg0, var9, var6, var10, var4.field2973[this.field2332 - 1]);
                            if (this.field2335 < var6) {
                                return;
                            }
                            this.field2335 = var6 + var6 - this.field2335 - 1;
                            this.field2340 = -this.field2340;
                            if (--this.field2334 == 0) {
                                break;
                            }
                            var9 = this.method1054(arg0, var9, var5, var10, var4.field2973[this.field2337]);
                            if (this.field2335 >= var5) {
                                return;
                            }
                            this.field2335 = var5 + var5 - this.field2335 - 1;
                            this.field2340 = -this.field2340;
                        } while (--this.field2334 != 0);
                    }
                } else if (this.field2340 < 0) {
                    while (true) {
                        var9 = this.method1054(arg0, var9, var5, var10, var4.field2973[this.field2332 - 1]);
                        if (this.field2335 >= var5) {
                            return;
                        }
                        int var12 = (var6 - this.field2335 - 1) / var8;
                        if (var12 >= this.field2334) {
                            this.field2335 += this.field2334 * var8;
                            this.field2334 = 0;
                            break;
                        }
                        this.field2335 += var8 * var12;
                        this.field2334 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method1042(arg0, var9, var6, var10, var4.field2973[this.field2337]);
                        if (this.field2335 < var6) {
                            return;
                        }
                        int var13 = (this.field2335 - var5) / var8;
                        if (var13 >= this.field2334) {
                            this.field2335 -= this.field2334 * var8;
                            this.field2334 = 0;
                            break;
                        }
                        this.field2335 -= var8 * var13;
                        this.field2334 -= var13;
                    }
                }
            }
            if (this.field2340 < 0) {
                this.method1054(arg0, var9, 0, var10, 0);
                if (this.field2335 < 0) {
                    this.field2335 = -1;
                    this.method1066();
                    this.method598(73);
                }
            } else {
                this.method1042(arg0, var9, var7, var10, 0);
                if (this.field2335 >= var7) {
                    this.field2335 = var7;
                    this.method1066();
                    this.method598(127);
                }
            }
        } else if (this.field2341) {
            if (this.field2340 < 0) {
                var9 = this.method1054(arg0, arg1, var5, var10, var4.field2973[this.field2337]);
                if (this.field2335 >= var5) {
                    return;
                }
                this.field2335 = var5 + var5 - this.field2335 - 1;
                this.field2340 = -this.field2340;
            }
            while (true) {
                int var11 = this.method1042(arg0, var9, var6, var10, var4.field2973[this.field2332 - 1]);
                if (this.field2335 < var6) {
                    return;
                }
                this.field2335 = var6 + var6 - this.field2335 - 1;
                this.field2340 = -this.field2340;
                var9 = this.method1054(arg0, var11, var5, var10, var4.field2973[this.field2337]);
                if (this.field2335 >= var5) {
                    return;
                }
                this.field2335 = var5 + var5 - this.field2335 - 1;
                this.field2340 = -this.field2340;
            }
        } else if (this.field2340 < 0) {
            while (true) {
                var9 = this.method1054(arg0, var9, var5, var10, var4.field2973[this.field2332 - 1]);
                if (this.field2335 >= var5) {
                    return;
                }
                this.field2335 = var6 - (var6 - 1 - this.field2335) % var8 - 1;
            }
        } else {
            while (true) {
                var9 = this.method1042(arg0, var9, var6, var10, var4.field2973[this.field2337]);
                if (this.field2335 < var6) {
                    return;
                }
                this.field2335 = (this.field2335 - var5) % var8 + var5;
            }
        }
    }

    @OriginalMember(owner = "client!ac", name = "k", descriptor = "()I", line = 1394)
    public final synchronized int method1065() {
        return this.field2340 < 0 ? -this.field2340 : this.field2340;
    }

    @OriginalMember(owner = "client!ac", name = "l", descriptor = "()V", line = 1397)
    private final void method1066() {
        if (this.field2333 == 0) {
            return;
        }
        if (this.field2338 == Integer.MIN_VALUE) {
            this.field2338 = 0;
        }
        this.field2333 = 0;
        this.method1034();
    }

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "(II)I", line = 1409)
    private static final int method1067(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(III)V", line = 1412)
    public final synchronized void method1068(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1032(arg1, arg2);
            return;
        }
        int var4 = method1067(arg1, arg2);
        int var5 = method1029(arg1, arg2);
        if (this.field2344 == var4 && this.field2343 == var5) {
            this.field2333 = 0;
            return;
        }
        int var6 = arg1 - this.field2346;
        if (this.field2346 - arg1 > var6) {
            var6 = this.field2346 - arg1;
        }
        if (var4 - this.field2344 > var6) {
            var6 = var4 - this.field2344;
        }
        if (this.field2344 - var4 > var6) {
            var6 = this.field2344 - var4;
        }
        if (var5 - this.field2343 > var6) {
            var6 = var5 - this.field2343;
        }
        if (this.field2343 - var5 > var6) {
            var6 = this.field2343 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field2333 = arg0;
        this.field2338 = arg1;
        this.field2342 = arg2;
        this.field2345 = (arg1 - this.field2346) / arg0;
        this.field2339 = (var4 - this.field2344) / arg0;
        this.field2336 = (var5 - this.field2343) / arg0;
    }

    @OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(Lqd;II)V", line = 1458)
    private class144(class182 arg0, int arg1, int arg2) {
        this.field2821 = arg0;
        this.field2337 = arg0.field2972;
        this.field2332 = arg0.field2971;
        this.field2341 = arg0.field2974;
        this.field2340 = arg1;
        this.field2338 = arg2;
        this.field2342 = 8192;
        this.field2335 = 0;
        this.method1034();
    }

    @OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(Lqd;III)V", line = 1469)
    private class144(class182 arg0, int arg1, int arg2, int arg3) {
        this.field2821 = arg0;
        this.field2337 = arg0.field2972;
        this.field2332 = arg0.field2971;
        this.field2341 = arg0.field2974;
        this.field2340 = arg1;
        this.field2338 = arg2;
        this.field2342 = arg3;
        this.field2335 = 0;
        this.method1034();
    }
}
