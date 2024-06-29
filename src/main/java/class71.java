import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public class class71 extends class115 {

    @OriginalMember(owner = "client!tm", name = "s", descriptor = "I")
    private int field1031;

    @OriginalMember(owner = "client!tm", name = "w", descriptor = "I")
    private int field1035;

    @OriginalMember(owner = "client!tm", name = "q", descriptor = "Z")
    private boolean field1029;

    @OriginalMember(owner = "client!tm", name = "C", descriptor = "I")
    private int field1040;

    @OriginalMember(owner = "client!tm", name = "y", descriptor = "I")
    private int field1037;

    @OriginalMember(owner = "client!tm", name = "u", descriptor = "I")
    private int field1033;

    @OriginalMember(owner = "client!tm", name = "G", descriptor = "I")
    private int field1043;

    @OriginalMember(owner = "client!tm", name = "r", descriptor = "I")
    private int field1030;

    @OriginalMember(owner = "client!tm", name = "t", descriptor = "I")
    private int field1032;

    @OriginalMember(owner = "client!tm", name = "v", descriptor = "I")
    private int field1034;

    @OriginalMember(owner = "client!tm", name = "x", descriptor = "I")
    private int field1036;

    @OriginalMember(owner = "client!tm", name = "z", descriptor = "I")
    private int field1038;

    @OriginalMember(owner = "client!tm", name = "B", descriptor = "I")
    private int field1039;

    @OriginalMember(owner = "client!tm", name = "D", descriptor = "I")
    private int field1041;

    @OriginalMember(owner = "client!tm", name = "E", descriptor = "I")
    private int field1042;

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "([III)V", line = 3)
    public final synchronized void method445(int[] arg0, int arg1, int arg2) {
        if (this.field1037 == 0 && this.field1030 == 0) {
            this.method446(arg2);
            return;
        }
        class292 var4 = (class292) this.field1625;
        int var5 = this.field1031 << 8;
        int var6 = this.field1035 << 8;
        int var7 = var4.field5009.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field1039 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field1043 < 0) {
            if (this.field1040 <= 0) {
                this.method448();
                this.method1880(-25368);
                return;
            }
            this.field1043 = 0;
        }
        if (this.field1043 >= var7) {
            if (this.field1040 >= 0) {
                this.method448();
                this.method1880(-25368);
                return;
            }
            this.field1043 = var7 - 1;
        }
        if (this.field1039 >= 0) {
            if (this.field1039 > 0) {
                if (this.field1029) {
                    label131: {
                        if (this.field1040 < 0) {
                            var9 = this.method486(arg0, arg1, var5, var10, var4.field5009[this.field1031]);
                            if (this.field1043 >= var5) {
                                return;
                            }
                            this.field1043 = var5 + var5 - this.field1043 - 1;
                            this.field1040 = -this.field1040;
                            if (--this.field1039 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method467(arg0, var9, var6, var10, var4.field5009[this.field1035 - 1]);
                            if (this.field1043 < var6) {
                                return;
                            }
                            this.field1043 = var6 + var6 - this.field1043 - 1;
                            this.field1040 = -this.field1040;
                            if (--this.field1039 == 0) {
                                break;
                            }
                            var9 = this.method486(arg0, var9, var5, var10, var4.field5009[this.field1031]);
                            if (this.field1043 >= var5) {
                                return;
                            }
                            this.field1043 = var5 + var5 - this.field1043 - 1;
                            this.field1040 = -this.field1040;
                        } while (--this.field1039 != 0);
                    }
                } else if (this.field1040 < 0) {
                    while (true) {
                        var9 = this.method486(arg0, var9, var5, var10, var4.field5009[this.field1035 - 1]);
                        if (this.field1043 >= var5) {
                            return;
                        }
                        int var12 = (var6 - this.field1043 - 1) / var8;
                        if (var12 >= this.field1039) {
                            this.field1043 += this.field1039 * var8;
                            this.field1039 = 0;
                            break;
                        }
                        this.field1043 += var8 * var12;
                        this.field1039 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method467(arg0, var9, var6, var10, var4.field5009[this.field1031]);
                        if (this.field1043 < var6) {
                            return;
                        }
                        int var13 = (this.field1043 - var5) / var8;
                        if (var13 >= this.field1039) {
                            this.field1043 -= this.field1039 * var8;
                            this.field1039 = 0;
                            break;
                        }
                        this.field1043 -= var8 * var13;
                        this.field1039 -= var13;
                    }
                }
            }
            if (this.field1040 < 0) {
                this.method486(arg0, var9, 0, var10, 0);
                if (this.field1043 < 0) {
                    this.field1043 = -1;
                    this.method448();
                    this.method1880(-25368);
                }
            } else {
                this.method467(arg0, var9, var7, var10, 0);
                if (this.field1043 >= var7) {
                    this.field1043 = var7;
                    this.method448();
                    this.method1880(-25368);
                }
            }
        } else if (this.field1029) {
            if (this.field1040 < 0) {
                var9 = this.method486(arg0, arg1, var5, var10, var4.field5009[this.field1031]);
                if (this.field1043 >= var5) {
                    return;
                }
                this.field1043 = var5 + var5 - this.field1043 - 1;
                this.field1040 = -this.field1040;
            }
            while (true) {
                int var11 = this.method467(arg0, var9, var6, var10, var4.field5009[this.field1035 - 1]);
                if (this.field1043 < var6) {
                    return;
                }
                this.field1043 = var6 + var6 - this.field1043 - 1;
                this.field1040 = -this.field1040;
                var9 = this.method486(arg0, var11, var5, var10, var4.field5009[this.field1031]);
                if (this.field1043 >= var5) {
                    return;
                }
                this.field1043 = var5 + var5 - this.field1043 - 1;
                this.field1040 = -this.field1040;
            }
        } else if (this.field1040 < 0) {
            while (true) {
                var9 = this.method486(arg0, var9, var5, var10, var4.field5009[this.field1035 - 1]);
                if (this.field1043 >= var5) {
                    return;
                }
                this.field1043 = var6 - (var6 - 1 - this.field1043) % var8 - 1;
            }
        } else {
            while (true) {
                var9 = this.method467(arg0, var9, var6, var10, var4.field5009[this.field1031]);
                if (this.field1043 < var6) {
                    return;
                }
                this.field1043 = (this.field1043 - var5) % var8 + var5;
            }
        }
    }

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "(I)V", line = 239)
    public final synchronized void method446(int arg0) {
        if (this.field1030 > 0) {
            if (arg0 >= this.field1030) {
                if (this.field1037 == Integer.MIN_VALUE) {
                    this.field1037 = 0;
                    this.field1038 = this.field1032 = this.field1042 = 0;
                    this.method1880(-25368);
                    arg0 = this.field1030;
                }
                this.field1030 = 0;
                this.method473();
            } else {
                this.field1038 += this.field1036 * arg0;
                this.field1032 += this.field1041 * arg0;
                this.field1042 += this.field1034 * arg0;
                this.field1030 -= arg0;
            }
        }
        class292 var2 = (class292) this.field1625;
        int var3 = this.field1031 << 8;
        int var4 = this.field1035 << 8;
        int var5 = var2.field5009.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1039 = 0;
        }
        if (this.field1043 < 0) {
            if (this.field1040 <= 0) {
                this.method448();
                this.method1880(-25368);
                return;
            }
            this.field1043 = 0;
        }
        if (this.field1043 >= var5) {
            if (this.field1040 >= 0) {
                this.method448();
                this.method1880(-25368);
                return;
            }
            this.field1043 = var5 - 1;
        }
        this.field1043 += this.field1040 * arg0;
        if (this.field1039 >= 0) {
            if (this.field1039 > 0) {
                if (this.field1029) {
                    label121: {
                        if (this.field1040 < 0) {
                            if (this.field1043 >= var3) {
                                return;
                            }
                            this.field1043 = var3 + var3 - this.field1043 - 1;
                            this.field1040 = -this.field1040;
                            if (--this.field1039 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field1043 < var4) {
                                return;
                            }
                            this.field1043 = var4 + var4 - this.field1043 - 1;
                            this.field1040 = -this.field1040;
                            if (--this.field1039 == 0) {
                                break;
                            }
                            if (this.field1043 >= var3) {
                                return;
                            }
                            this.field1043 = var3 + var3 - this.field1043 - 1;
                            this.field1040 = -this.field1040;
                        } while (--this.field1039 != 0);
                    }
                } else {
                    label153: {
                        if (this.field1040 < 0) {
                            if (this.field1043 >= var3) {
                                return;
                            }
                            int var7 = (var4 - this.field1043 - 1) / var6;
                            if (var7 >= this.field1039) {
                                this.field1043 += this.field1039 * var6;
                                this.field1039 = 0;
                                break label153;
                            }
                            this.field1043 += var6 * var7;
                            this.field1039 -= var7;
                        } else if (this.field1043 >= var4) {
                            int var8 = (this.field1043 - var3) / var6;
                            if (var8 >= this.field1039) {
                                this.field1043 -= this.field1039 * var6;
                                this.field1039 = 0;
                                break label153;
                            }
                            this.field1043 -= var6 * var8;
                            this.field1039 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field1040 < 0) {
                if (this.field1043 < 0) {
                    this.field1043 = -1;
                    this.method448();
                    this.method1880(-25368);
                }
            } else if (this.field1043 >= var5) {
                this.field1043 = var5;
                this.method448();
                this.method1880(-25368);
            }
        } else if (this.field1029) {
            if (this.field1040 < 0) {
                if (this.field1043 >= var3) {
                    return;
                }
                this.field1043 = var3 + var3 - this.field1043 - 1;
                this.field1040 = -this.field1040;
            }
            while (this.field1043 >= var4) {
                this.field1043 = var4 + var4 - this.field1043 - 1;
                this.field1040 = -this.field1040;
                if (this.field1043 >= var3) {
                    return;
                }
                this.field1043 = var3 + var3 - this.field1043 - 1;
                this.field1040 = -this.field1040;
            }
        } else if (this.field1040 < 0) {
            if (this.field1043 >= var3) {
                return;
            }
            this.field1043 = var4 - (var4 - 1 - this.field1043) % var6 - 1;
        } else if (this.field1043 >= var4) {
            this.field1043 = (this.field1043 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(II[B[IIIIIIIILtm;II)I", line = 457)
    private static final int method447(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class71 arg11, int arg12, int arg13) {
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
        arg11.field1043 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!tm", name = "e", descriptor = "()V", line = 490)
    private final void method448() {
        if (this.field1030 == 0) {
            return;
        }
        if (this.field1037 == Integer.MIN_VALUE) {
            this.field1037 = 0;
        }
        this.field1030 = 0;
        this.method473();
    }

    @OriginalMember(owner = "client!tm", name = "d", descriptor = "(I)V", line = 504)
    public final synchronized void method449(int arg0) {
        int var2 = ((class292) this.field1625).field5009.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1043 = arg0;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(III)V", line = 514)
    public final synchronized void method450(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method465(arg1, arg2);
            return;
        }
        int var4 = method472(arg1, arg2);
        int var5 = method485(arg1, arg2);
        if (this.field1032 == var4 && this.field1042 == var5) {
            this.field1030 = 0;
            return;
        }
        int var6 = arg1 - this.field1038;
        if (this.field1038 - arg1 > var6) {
            var6 = this.field1038 - arg1;
        }
        if (var4 - this.field1032 > var6) {
            var6 = var4 - this.field1032;
        }
        if (this.field1032 - var4 > var6) {
            var6 = this.field1032 - var4;
        }
        if (var5 - this.field1042 > var6) {
            var6 = var5 - this.field1042;
        }
        if (this.field1042 - var5 > var6) {
            var6 = this.field1042 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field1030 = arg0;
        this.field1037 = arg1;
        this.field1033 = arg2;
        this.field1036 = (arg1 - this.field1038) / arg0;
        this.field1041 = (var4 - this.field1032) / arg0;
        this.field1034 = (var5 - this.field1042) / arg0;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(Lgm;II)Ltm;", line = 563)
    public static final class71 method451(class292 arg0, int arg1, int arg2) {
        return arg0.field5009 == null || arg0.field5009.length == 0 ? null : new class71(arg0, (int) ((long) arg0.field5007 * 256L * (long) arg1 / (long) (class252.field4337 * 100)), arg2 << 6);
    }

    @OriginalMember(owner = "client!tm", name = "d", descriptor = "()I", line = 571)
    public final int method452() {
        return this.field1037 == 0 && this.field1030 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!tm", name = "e", descriptor = "(I)V", line = 580)
    public final synchronized void method453(int arg0) {
        this.field1039 = arg0;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(Lgm;III)Ltm;", line = 584)
    public static final class71 method454(class292 arg0, int arg1, int arg2, int arg3) {
        return arg0.field5009 == null || arg0.field5009.length == 0 ? null : new class71(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(II[B[IIIIIIIIIILtm;II)I", line = 590)
    private static final int method455(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class71 arg13, int arg14, int arg15) {
        arg13.field1038 -= arg13.field1036 * arg5;
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
        arg13.field1038 += arg13.field1036 * var27;
        arg13.field1032 = arg6;
        arg13.field1042 = arg7;
        arg13.field1043 = arg4;
        return var27;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "()I", line = 633)
    public final int method456() {
        int var1 = this.field1038 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1039 == 0) {
            var2 -= this.field1043 * var2 / (((class292) this.field1625).field5009.length << 8);
        } else if (this.field1039 >= 0) {
            var2 -= this.field1031 * var2 / ((class292) this.field1625).field5009.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!tm", name = "f", descriptor = "()I", line = 646)
    public final synchronized int method457() {
        return this.field1033 < 0 ? -1 : this.field1033;
    }

    @OriginalMember(owner = "client!tm", name = "g", descriptor = "()Z", line = 650)
    public final boolean method458() {
        return this.field1043 < 0 || this.field1043 >= ((class292) this.field1625).field5009.length << 8;
    }

    @OriginalMember(owner = "client!tm", name = "f", descriptor = "(I)V", line = 654)
    public final synchronized void method459(int arg0) {
        if (arg0 == 0) {
            this.method470(0);
            this.method1880(-25368);
        } else if (this.field1032 == 0 && this.field1042 == 0) {
            this.field1030 = 0;
            this.field1037 = 0;
            this.field1038 = 0;
            this.method1880(-25368);
        } else {
            int var2 = -this.field1038;
            if (this.field1038 > var2) {
                var2 = this.field1038;
            }
            if (-this.field1032 > var2) {
                var2 = -this.field1032;
            }
            if (this.field1032 > var2) {
                var2 = this.field1032;
            }
            if (-this.field1042 > var2) {
                var2 = -this.field1042;
            }
            if (this.field1042 > var2) {
                var2 = this.field1042;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1030 = arg0;
            this.field1037 = Integer.MIN_VALUE;
            this.field1036 = -this.field1038 / arg0;
            this.field1041 = -this.field1032 / arg0;
            this.field1034 = -this.field1042 / arg0;
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(II[B[IIIIIIILtm;II)I", line = 699)
    private static final int method460(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class71 arg10, int arg11, int arg12) {
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
        arg10.field1043 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "()Lnh;", line = 725)
    public final class115 method461() {
        return null;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(II)V", line = 728)
    public final synchronized void method462(int arg0, int arg1) {
        this.method450(arg0, arg1, this.method457());
    }

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "(II[B[IIIIIIIILtm;II)I", line = 732)
    private static final int method463(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class71 arg11, int arg12, int arg13) {
        arg11.field1032 -= arg11.field1041 * arg5;
        arg11.field1042 -= arg11.field1034 * arg5;
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
        arg11.field1032 += arg11.field1041 * arg5;
        arg11.field1042 += arg11.field1034 * arg5;
        arg11.field1038 = arg6;
        arg11.field1043 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "(II[B[IIIIIIILtm;II)I", line = 765)
    private static final int method464(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class71 arg10, int arg11, int arg12) {
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
        arg10.field1043 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "(II)V", line = 794)
    private final synchronized void method465(int arg0, int arg1) {
        this.field1037 = arg0;
        this.field1033 = arg1;
        this.field1030 = 0;
        this.method473();
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "([B[IIIIIIIILtm;)I", line = 800)
    private static final int method466(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class71 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1032 += (var14 - arg3) * arg9.field1041;
        arg9.field1042 += (var14 - arg3) * arg9.field1034;
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
        arg9.field1038 = var12 >> 2;
        arg9.field1043 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "([IIIII)I", line = 835)
    private final int method467(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1030 > 0) {
                int var6 = this.field1030 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1030 += arg1;
                if (this.field1040 == 256 && (this.field1043 & 0xFF) == 0) {
                    if (class314.field5440) {
                        arg1 = method477(0, ((class292) this.field1625).field5009, arg0, this.field1043, arg1, this.field1032, this.field1042, this.field1041, this.field1034, 0, var6, arg2, this);
                    } else {
                        arg1 = method489(((class292) this.field1625).field5009, arg0, this.field1043, arg1, this.field1038, this.field1036, 0, var6, arg2, this);
                    }
                } else if (class314.field5440) {
                    arg1 = method455(0, 0, ((class292) this.field1625).field5009, arg0, this.field1043, arg1, this.field1032, this.field1042, this.field1041, this.field1034, 0, var6, arg2, this, this.field1040, arg4);
                } else {
                    arg1 = method463(0, 0, ((class292) this.field1625).field5009, arg0, this.field1043, arg1, this.field1038, this.field1036, 0, var6, arg2, this, this.field1040, arg4);
                }
                this.field1030 -= arg1;
                if (this.field1030 != 0) {
                    return arg1;
                }
                if (!this.method490()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1040 == 256 && (this.field1043 & 0xFF) == 0) {
                if (class314.field5440) {
                    return method479(0, ((class292) this.field1625).field5009, arg0, this.field1043, arg1, this.field1032, this.field1042, 0, arg3, arg2, this);
                }
                return method483(((class292) this.field1625).field5009, arg0, this.field1043, arg1, this.field1038, 0, arg3, arg2, this);
            }
            if (class314.field5440) {
                return method447(0, 0, ((class292) this.field1625).field5009, arg0, this.field1043, arg1, this.field1032, this.field1042, 0, arg3, arg2, this, this.field1040, arg4);
            }
            return method464(0, 0, ((class292) this.field1625).field5009, arg0, this.field1043, arg1, this.field1038, 0, arg3, arg2, this, this.field1040, arg4);
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(I[B[IIIIIIIIIILtm;)I", line = 891)
    private static final int method468(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class71 arg12) {
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
        arg12.field1038 += (var19 - arg4) * arg12.field1036;
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
        arg12.field1032 = var15 >> 2;
        arg12.field1042 = var16 >> 2;
        arg12.field1043 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(Z)V", line = 944)
    public final synchronized void method469(boolean arg0) {
        this.field1040 = (this.field1040 >>> 31) + (this.field1040 ^ this.field1040 >> 31);
        if (arg0) {
            this.field1040 = -this.field1040;
        }
    }

    @OriginalMember(owner = "client!tm", name = "g", descriptor = "(I)V", line = 950)
    private final synchronized void method470(int arg0) {
        this.method465(arg0, this.method457());
    }

    @OriginalMember(owner = "client!tm", name = "h", descriptor = "(I)V", line = 953)
    public final synchronized void method471(int arg0) {
        this.method465(arg0 << 6, this.method457());
    }

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "(II)I", line = 956)
    private static final int method472(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!tm", name = "h", descriptor = "()V", line = 962)
    private final void method473() {
        this.field1038 = this.field1037;
        this.field1032 = method472(this.field1037, this.field1033);
        this.field1042 = method485(this.field1037, this.field1033);
    }

    @OriginalMember(owner = "client!tm", name = "i", descriptor = "(I)V", line = 969)
    public final synchronized void method474(int arg0) {
        if (this.field1040 < 0) {
            this.field1040 = -arg0;
        } else {
            this.field1040 = arg0;
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(I[B[IIIIIIIILtm;)I", line = 978)
    private static final int method475(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class71 arg10) {
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
        arg10.field1043 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!tm", name = "i", descriptor = "()I", line = 1017)
    public final synchronized int method476() {
        return this.field1040 < 0 ? -this.field1040 : this.field1040;
    }

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "(I[B[IIIIIIIIIILtm;)I", line = 1021)
    private static final int method477(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class71 arg12) {
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
        arg12.field1038 += (var19 - arg4) * arg12.field1036;
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
        arg12.field1032 = var15 >> 2;
        arg12.field1042 = var16 >> 2;
        arg12.field1043 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "(II[B[IIIIIIIILtm;II)I", line = 1074)
    private static final int method478(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class71 arg11, int arg12, int arg13) {
        arg11.field1032 -= arg11.field1041 * arg5;
        arg11.field1042 -= arg11.field1034 * arg5;
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
        arg11.field1032 += arg11.field1041 * arg5;
        arg11.field1042 += arg11.field1034 * arg5;
        arg11.field1038 = arg6;
        arg11.field1043 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "(I[B[IIIIIIIILtm;)I", line = 1107)
    private static final int method479(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class71 arg10) {
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
        arg10.field1043 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!tm", name = "j", descriptor = "()I", line = 1145)
    public final synchronized int method480() {
        return this.field1037 == Integer.MIN_VALUE ? 0 : this.field1037;
    }

    @OriginalMember(owner = "client!tm", name = "k", descriptor = "()Z", line = 1148)
    public final boolean method481() {
        return this.field1030 != 0;
    }

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "()Lnh;", line = 1151)
    public final class115 method482() {
        return null;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "([B[IIIIIIILtm;)I", line = 1155)
    private static final int method483(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class71 arg8) {
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
        arg8.field1043 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "(II[B[IIIIIIIIIILtm;II)I", line = 1180)
    private static final int method484(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class71 arg13, int arg14, int arg15) {
        arg13.field1038 -= arg13.field1036 * arg5;
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
        arg13.field1038 += arg13.field1036 * var26;
        arg13.field1032 = arg6;
        arg13.field1042 = arg7;
        arg13.field1043 = arg4;
        return var26;
    }

    @OriginalMember(owner = "client!tm", name = "d", descriptor = "(II)I", line = 1221)
    private static final int method485(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "([IIIII)I", line = 1224)
    private final int method486(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1030 > 0) {
                int var6 = this.field1030 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1030 += arg1;
                if (this.field1040 == -256 && (this.field1043 & 0xFF) == 0) {
                    if (class314.field5440) {
                        arg1 = method468(0, ((class292) this.field1625).field5009, arg0, this.field1043, arg1, this.field1032, this.field1042, this.field1041, this.field1034, 0, var6, arg2, this);
                    } else {
                        arg1 = method466(((class292) this.field1625).field5009, arg0, this.field1043, arg1, this.field1038, this.field1036, 0, var6, arg2, this);
                    }
                } else if (class314.field5440) {
                    arg1 = method484(0, 0, ((class292) this.field1625).field5009, arg0, this.field1043, arg1, this.field1032, this.field1042, this.field1041, this.field1034, 0, var6, arg2, this, this.field1040, arg4);
                } else {
                    arg1 = method478(0, 0, ((class292) this.field1625).field5009, arg0, this.field1043, arg1, this.field1038, this.field1036, 0, var6, arg2, this, this.field1040, arg4);
                }
                this.field1030 -= arg1;
                if (this.field1030 != 0) {
                    return arg1;
                }
                if (!this.method490()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1040 == -256 && (this.field1043 & 0xFF) == 0) {
                if (class314.field5440) {
                    return method475(0, ((class292) this.field1625).field5009, arg0, this.field1043, arg1, this.field1032, this.field1042, 0, arg3, arg2, this);
                }
                return method487(((class292) this.field1625).field5009, arg0, this.field1043, arg1, this.field1038, 0, arg3, arg2, this);
            }
            if (class314.field5440) {
                return method488(0, 0, ((class292) this.field1625).field5009, arg0, this.field1043, arg1, this.field1032, this.field1042, 0, arg3, arg2, this, this.field1040, arg4);
            }
            return method460(0, 0, ((class292) this.field1625).field5009, arg0, this.field1043, arg1, this.field1038, 0, arg3, arg2, this, this.field1040, arg4);
        }
    }

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "([B[IIIIIIILtm;)I", line = 1279)
    private static final int method487(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class71 arg8) {
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
        arg8.field1043 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!tm", name = "d", descriptor = "(II[B[IIIIIIIILtm;II)I", line = 1305)
    private static final int method488(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class71 arg11, int arg12, int arg13) {
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
        arg11.field1043 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "([B[IIIIIIIILtm;)I", line = 1338)
    private static final int method489(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class71 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1032 += (var14 - arg3) * arg9.field1041;
        arg9.field1042 += (var14 - arg3) * arg9.field1034;
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
        arg9.field1038 = var12 >> 2;
        arg9.field1043 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!tm", name = "l", descriptor = "()Z", line = 1374)
    private final boolean method490() {
        int var1 = this.field1037;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method472(var1, this.field1033);
            var2 = method485(var1, this.field1033);
        }
        if (this.field1038 != var1 || this.field1032 != var3 || this.field1042 != var2) {
            if (this.field1038 < var1) {
                this.field1036 = 1;
                this.field1030 = var1 - this.field1038;
            } else if (this.field1038 > var1) {
                this.field1036 = -1;
                this.field1030 = this.field1038 - var1;
            } else {
                this.field1036 = 0;
            }
            if (this.field1032 < var3) {
                this.field1041 = 1;
                if (this.field1030 == 0 || this.field1030 > var3 - this.field1032) {
                    this.field1030 = var3 - this.field1032;
                }
            } else if (this.field1032 > var3) {
                this.field1041 = -1;
                if (this.field1030 == 0 || this.field1030 > this.field1032 - var3) {
                    this.field1030 = this.field1032 - var3;
                }
            } else {
                this.field1041 = 0;
            }
            if (this.field1042 < var2) {
                this.field1034 = 1;
                if (this.field1030 == 0 || this.field1030 > var2 - this.field1042) {
                    this.field1030 = var2 - this.field1042;
                }
            } else if (this.field1042 > var2) {
                this.field1034 = -1;
                if (this.field1030 == 0 || this.field1030 > this.field1042 - var2) {
                    this.field1030 = this.field1042 - var2;
                }
            } else {
                this.field1034 = 0;
            }
            return false;
        } else if (this.field1037 == Integer.MIN_VALUE) {
            this.field1037 = 0;
            this.field1038 = this.field1032 = this.field1042 = 0;
            this.method1880(-25368);
            return true;
        } else {
            this.method473();
            return false;
        }
    }

    @OriginalMember(owner = "client!tm", name = "<init>", descriptor = "(Lgm;II)V", line = 1458)
    private class71(class292 arg0, int arg1, int arg2) {
        this.field1625 = arg0;
        this.field1031 = arg0.field5010;
        this.field1035 = arg0.field5006;
        this.field1029 = arg0.field5008;
        this.field1040 = arg1;
        this.field1037 = arg2;
        this.field1033 = 8192;
        this.field1043 = 0;
        this.method473();
    }

    @OriginalMember(owner = "client!tm", name = "<init>", descriptor = "(Lgm;III)V", line = 1469)
    private class71(class292 arg0, int arg1, int arg2, int arg3) {
        this.field1625 = arg0;
        this.field1031 = arg0.field5010;
        this.field1035 = arg0.field5006;
        this.field1029 = arg0.field5008;
        this.field1040 = arg1;
        this.field1037 = arg2;
        this.field1033 = arg3;
        this.field1043 = 0;
        this.method473();
    }
}
