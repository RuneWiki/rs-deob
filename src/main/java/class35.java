import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class35 extends class135 {

    @OriginalMember(owner = "client!tc", name = "y", descriptor = "I")
    private int field439;

    @OriginalMember(owner = "client!tc", name = "x", descriptor = "I")
    private int field438;

    @OriginalMember(owner = "client!tc", name = "B", descriptor = "Z")
    private boolean field442;

    @OriginalMember(owner = "client!tc", name = "u", descriptor = "I")
    private int field435;

    @OriginalMember(owner = "client!tc", name = "q", descriptor = "I")
    private int field431;

    @OriginalMember(owner = "client!tc", name = "r", descriptor = "I")
    private int field432;

    @OriginalMember(owner = "client!tc", name = "t", descriptor = "I")
    private int field434;

    @OriginalMember(owner = "client!tc", name = "o", descriptor = "I")
    private int field429;

    @OriginalMember(owner = "client!tc", name = "p", descriptor = "I")
    private int field430;

    @OriginalMember(owner = "client!tc", name = "s", descriptor = "I")
    private int field433;

    @OriginalMember(owner = "client!tc", name = "v", descriptor = "I")
    private int field436;

    @OriginalMember(owner = "client!tc", name = "w", descriptor = "I")
    private int field437;

    @OriginalMember(owner = "client!tc", name = "z", descriptor = "I")
    private int field440;

    @OriginalMember(owner = "client!tc", name = "A", descriptor = "I")
    private int field441;

    @OriginalMember(owner = "client!tc", name = "C", descriptor = "I")
    private int field443;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(II[B[IIIIIIILtc;II)I")
    private static final int method239(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class35 arg10, int arg11, int arg12) {
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
        arg10.field434 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "()I")
    public final synchronized int method240() {
        return this.field432 < 0 ? -1 : this.field432;
    }

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "(I)V")
    public final synchronized void method241(int arg0) {
        this.field441 = arg0;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(II[B[IIIIIIIIIILtc;II)I")
    private static final int method242(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class35 arg13, int arg14, int arg15) {
        arg13.field443 -= arg13.field433 * arg5;
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
        arg13.field443 += arg13.field433 * var22;
        arg13.field440 = arg6;
        arg13.field436 = arg7;
        arg13.field434 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(II[B[IIIIIIIILtc;II)I")
    private static final int method243(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class35 arg11, int arg12, int arg13) {
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
        arg11.field434 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "([IIIII)I")
    private final int method244(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field429 <= 0) {
                if (this.field435 == -256 && (this.field434 & 255) == 0) {
                    if (class278.field4456) {
                        return method261(0, ((class91) super.field2254).field1302, arg0, this.field434, arg1, this.field440, this.field436, 0, arg3, arg2, this);
                    }
                    return method272(((class91) super.field2254).field1302, arg0, this.field434, arg1, this.field443, 0, arg3, arg2, this);
                }
                if (class278.field4456) {
                    return method258(0, 0, ((class91) super.field2254).field1302, arg0, this.field434, arg1, this.field440, this.field436, 0, arg3, arg2, this, this.field435, arg4);
                }
                return method239(0, 0, ((class91) super.field2254).field1302, arg0, this.field434, arg1, this.field443, 0, arg3, arg2, this, this.field435, arg4);
            }
            int var6 = this.field429 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field429 += arg1;
            if (this.field435 == -256 && (this.field434 & 255) == 0) {
                if (class278.field4456) {
                    arg1 = method274(0, ((class91) super.field2254).field1302, arg0, this.field434, arg1, this.field440, this.field436, this.field430, this.field437, 0, var6, arg2, this);
                } else {
                    arg1 = method247(((class91) super.field2254).field1302, arg0, this.field434, arg1, this.field443, this.field433, 0, var6, arg2, this);
                }
            } else if (class278.field4456) {
                arg1 = method254(0, 0, ((class91) super.field2254).field1302, arg0, this.field434, arg1, this.field440, this.field436, this.field430, this.field437, 0, var6, arg2, this, this.field435, arg4);
            } else {
                arg1 = method250(0, 0, ((class91) super.field2254).field1302, arg0, this.field434, arg1, this.field443, this.field433, 0, var6, arg2, this, this.field435, arg4);
            }
            this.field429 -= arg1;
            if (this.field429 != 0) {
                return arg1;
            }
        } while (!this.method251());
        return arg3;
    }

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "()Lok;")
    public final class135 method245() {
        return null;
    }

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "(I)V")
    public final synchronized void method246(int arg0) {
        if (arg0 == 0) {
            this.method278(0);
            this.method544(118);
        } else if (this.field440 == 0 && this.field436 == 0) {
            this.field429 = 0;
            this.field431 = 0;
            this.field443 = 0;
            this.method544(-89);
        } else {
            int var2 = -this.field443;
            if (this.field443 > var2) {
                var2 = this.field443;
            }
            if (-this.field440 > var2) {
                var2 = -this.field440;
            }
            if (this.field440 > var2) {
                var2 = this.field440;
            }
            if (-this.field436 > var2) {
                var2 = -this.field436;
            }
            if (this.field436 > var2) {
                var2 = this.field436;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field429 = arg0;
            this.field431 = Integer.MIN_VALUE;
            this.field433 = -this.field443 / arg0;
            this.field430 = -this.field440 / arg0;
            this.field437 = -this.field436 / arg0;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "([B[IIIIIIIILtc;)I")
    private static final int method247(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class35 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field440 += (var14 - arg3) * arg9.field430;
        arg9.field436 += (var14 - arg3) * arg9.field437;
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
        arg9.field443 = var12 >> 2;
        arg9.field434 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(II)V")
    public final synchronized void method248(int arg0, int arg1) {
        this.method259(arg0, arg1, this.method240());
    }

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "(I)V")
    public final synchronized void method249(int arg0) {
        this.method282(arg0 << 6, this.method240());
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(II[B[IIIIIIIILtc;II)I")
    private static final int method250(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class35 arg11, int arg12, int arg13) {
        arg11.field440 -= arg11.field430 * arg5;
        arg11.field436 -= arg11.field437 * arg5;
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
        arg11.field440 += arg11.field430 * arg5;
        arg11.field436 += arg11.field437 * arg5;
        arg11.field443 = arg6;
        arg11.field434 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "()Z")
    private final boolean method251() {
        int var1 = this.field431;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method275(var1, this.field432);
            var2 = method260(var1, this.field432);
        }
        if (this.field443 == var1 && this.field440 == var3 && this.field436 == var2) {
            if (this.field431 == Integer.MIN_VALUE) {
                this.field431 = 0;
                this.field443 = this.field440 = this.field436 = 0;
                this.method544(-93);
                return true;
            } else {
                this.method257();
                return false;
            }
        } else {
            if (this.field443 < var1) {
                this.field433 = 1;
                this.field429 = var1 - this.field443;
            } else if (this.field443 > var1) {
                this.field433 = -1;
                this.field429 = this.field443 - var1;
            } else {
                this.field433 = 0;
            }
            if (this.field440 < var3) {
                this.field430 = 1;
                if (this.field429 == 0 || this.field429 > var3 - this.field440) {
                    this.field429 = var3 - this.field440;
                }
            } else if (this.field440 > var3) {
                this.field430 = -1;
                if (this.field429 == 0 || this.field429 > this.field440 - var3) {
                    this.field429 = this.field440 - var3;
                }
            } else {
                this.field430 = 0;
            }
            if (this.field436 < var2) {
                this.field437 = 1;
                if (this.field429 == 0 || this.field429 > var2 - this.field436) {
                    this.field429 = var2 - this.field436;
                }
            } else if (this.field436 > var2) {
                this.field437 = -1;
                if (this.field429 == 0 || this.field429 > this.field436 - var2) {
                    this.field429 = this.field436 - var2;
                }
            } else {
                this.field437 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "([IIIII)I")
    private final int method252(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field429 <= 0) {
                if (this.field435 == 256 && (this.field434 & 255) == 0) {
                    if (class278.field4456) {
                        return method255(0, ((class91) super.field2254).field1302, arg0, this.field434, arg1, this.field440, this.field436, 0, arg3, arg2, this);
                    }
                    return method268(((class91) super.field2254).field1302, arg0, this.field434, arg1, this.field443, 0, arg3, arg2, this);
                }
                if (class278.field4456) {
                    return method243(0, 0, ((class91) super.field2254).field1302, arg0, this.field434, arg1, this.field440, this.field436, 0, arg3, arg2, this, this.field435, arg4);
                }
                return method264(0, 0, ((class91) super.field2254).field1302, arg0, this.field434, arg1, this.field443, 0, arg3, arg2, this, this.field435, arg4);
            }
            int var6 = this.field429 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field429 += arg1;
            if (this.field435 == 256 && (this.field434 & 255) == 0) {
                if (class278.field4456) {
                    arg1 = method279(0, ((class91) super.field2254).field1302, arg0, this.field434, arg1, this.field440, this.field436, this.field430, this.field437, 0, var6, arg2, this);
                } else {
                    arg1 = method266(((class91) super.field2254).field1302, arg0, this.field434, arg1, this.field443, this.field433, 0, var6, arg2, this);
                }
            } else if (class278.field4456) {
                arg1 = method242(0, 0, ((class91) super.field2254).field1302, arg0, this.field434, arg1, this.field440, this.field436, this.field430, this.field437, 0, var6, arg2, this, this.field435, arg4);
            } else {
                arg1 = method269(0, 0, ((class91) super.field2254).field1302, arg0, this.field434, arg1, this.field443, this.field433, 0, var6, arg2, this, this.field435, arg4);
            }
            this.field429 -= arg1;
            if (this.field429 != 0) {
                return arg1;
            }
        } while (!this.method251());
        return arg3;
    }

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "()V")
    private final void method253() {
        if (this.field429 != 0) {
            if (this.field431 == Integer.MIN_VALUE) {
                this.field431 = 0;
            }
            this.field429 = 0;
            this.method257();
        }
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(II[B[IIIIIIIIIILtc;II)I")
    private static final int method254(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class35 arg13, int arg14, int arg15) {
        arg13.field443 -= arg13.field433 * arg5;
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
        arg13.field443 += arg13.field433 * var22;
        arg13.field440 = arg6;
        arg13.field436 = arg7;
        arg13.field434 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(I[B[IIIIIIIILtc;)I")
    private static final int method255(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class35 arg10) {
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
        arg10.field434 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lwc;II)Ltc;")
    public static final class35 method256(class91 arg0, int arg1, int arg2) {
        return arg0.field1302 != null && arg0.field1302.length != 0 ? new class35(arg0, (int) ((long) arg0.field1301 * 256L * (long) arg1 / (long) (class29.field343 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!tc", name = "h", descriptor = "()V")
    private final void method257() {
        this.field443 = this.field431;
        this.field440 = method275(this.field431, this.field432);
        this.field436 = method260(this.field431, this.field432);
    }

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "(II[B[IIIIIIIILtc;II)I")
    private static final int method258(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class35 arg11, int arg12, int arg13) {
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
        arg11.field434 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(III)V")
    public final synchronized void method259(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method282(arg1, arg2);
        } else {
            int var4 = method275(arg1, arg2);
            int var5 = method260(arg1, arg2);
            if (this.field440 == var4 && this.field436 == var5) {
                this.field429 = 0;
            } else {
                int var6 = arg1 - this.field443;
                if (this.field443 - arg1 > var6) {
                    var6 = this.field443 - arg1;
                }
                if (var4 - this.field440 > var6) {
                    var6 = var4 - this.field440;
                }
                if (this.field440 - var4 > var6) {
                    var6 = this.field440 - var4;
                }
                if (var5 - this.field436 > var6) {
                    var6 = var5 - this.field436;
                }
                if (this.field436 - var5 > var6) {
                    var6 = this.field436 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field429 = arg0;
                this.field431 = arg1;
                this.field432 = arg2;
                this.field433 = (arg1 - this.field443) / arg0;
                this.field430 = (var4 - this.field440) / arg0;
                this.field437 = (var5 - this.field436) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(II)I")
    private static final int method260(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(I[B[IIIIIIIILtc;)I")
    private static final int method261(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class35 arg10) {
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
        arg10.field434 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "()Lok;")
    public final class135 method262() {
        return null;
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "()I")
    public final int method263() {
        return this.field431 == 0 && this.field429 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(II[B[IIIIIIILtc;II)I")
    private static final int method264(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class35 arg10, int arg11, int arg12) {
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
        arg10.field434 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "(I)V")
    public final synchronized void method265(int arg0) {
        if (this.field429 > 0) {
            if (arg0 >= this.field429) {
                if (this.field431 == Integer.MIN_VALUE) {
                    this.field431 = 0;
                    this.field443 = this.field440 = this.field436 = 0;
                    this.method544(-71);
                    arg0 = this.field429;
                }
                this.field429 = 0;
                this.method257();
            } else {
                this.field443 += this.field433 * arg0;
                this.field440 += this.field430 * arg0;
                this.field436 += this.field437 * arg0;
                this.field429 -= arg0;
            }
        }
        class91 var2 = (class91) super.field2254;
        int var3 = this.field439 << 8;
        int var4 = this.field438 << 8;
        int var5 = var2.field1302.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field441 = 0;
        }
        if (this.field434 < 0) {
            if (this.field435 <= 0) {
                this.method253();
                this.method544(-80);
                return;
            }
            this.field434 = 0;
        }
        if (this.field434 >= var5) {
            if (this.field435 >= 0) {
                this.method253();
                this.method544(-12);
                return;
            }
            this.field434 = var5 - 1;
        }
        this.field434 += this.field435 * arg0;
        if (this.field441 < 0) {
            if (!this.field442) {
                if (this.field435 < 0) {
                    if (this.field434 < var3) {
                        this.field434 = var4 - 1 - (var4 - 1 - this.field434) % var6;
                    }
                } else if (this.field434 >= var4) {
                    this.field434 = (this.field434 - var3) % var6 + var3;
                }
            } else {
                if (this.field435 < 0) {
                    if (this.field434 >= var3) {
                        return;
                    }
                    this.field434 = var3 + var3 - 1 - this.field434;
                    this.field435 = -this.field435;
                }
                while (this.field434 >= var4) {
                    this.field434 = var4 + var4 - 1 - this.field434;
                    this.field435 = -this.field435;
                    if (this.field434 >= var3) {
                        return;
                    }
                    this.field434 = var3 + var3 - 1 - this.field434;
                    this.field435 = -this.field435;
                }
            }
        } else {
            if (this.field441 > 0) {
                if (this.field442) {
                    label125: {
                        if (this.field435 < 0) {
                            if (this.field434 >= var3) {
                                return;
                            }
                            this.field434 = var3 + var3 - 1 - this.field434;
                            this.field435 = -this.field435;
                            if (--this.field441 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field434 < var4) {
                                return;
                            }
                            this.field434 = var4 + var4 - 1 - this.field434;
                            this.field435 = -this.field435;
                            if (--this.field441 == 0) {
                                break;
                            }
                            if (this.field434 >= var3) {
                                return;
                            }
                            this.field434 = var3 + var3 - 1 - this.field434;
                            this.field435 = -this.field435;
                        } while (--this.field441 != 0);
                    }
                } else if (this.field435 < 0) {
                    if (this.field434 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field434) / var6;
                    if (var7 < this.field441) {
                        this.field434 += var6 * var7;
                        this.field441 -= var7;
                        return;
                    }
                    this.field434 += this.field441 * var6;
                    this.field441 = 0;
                } else {
                    if (this.field434 < var4) {
                        return;
                    }
                    int var8 = (this.field434 - var3) / var6;
                    if (var8 < this.field441) {
                        this.field434 -= var6 * var8;
                        this.field441 -= var8;
                        return;
                    }
                    this.field434 -= this.field441 * var6;
                    this.field441 = 0;
                }
            }
            if (this.field435 < 0) {
                if (this.field434 < 0) {
                    this.field434 = -1;
                    this.method253();
                    this.method544(119);
                    return;
                }
            } else if (this.field434 >= var5) {
                this.field434 = var5;
                this.method253();
                this.method544(93);
            }
        }
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "([B[IIIIIIIILtc;)I")
    private static final int method266(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class35 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field440 += (var14 - arg3) * arg9.field430;
        arg9.field436 += (var14 - arg3) * arg9.field437;
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
        arg9.field443 = var12 >> 2;
        arg9.field434 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!tc", name = "h", descriptor = "(I)V")
    public final synchronized void method267(int arg0) {
        if (this.field435 < 0) {
            this.field435 = -arg0;
        } else {
            this.field435 = arg0;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "([B[IIIIIIILtc;)I")
    private static final int method268(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class35 arg8) {
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
        arg8.field434 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "(II[B[IIIIIIIILtc;II)I")
    private static final int method269(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class35 arg11, int arg12, int arg13) {
        arg11.field440 -= arg11.field430 * arg5;
        arg11.field436 -= arg11.field437 * arg5;
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
        arg11.field440 += arg11.field430 * arg5;
        arg11.field436 += arg11.field437 * arg5;
        arg11.field443 = arg6;
        arg11.field434 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!tc", name = "i", descriptor = "()Z")
    public final boolean method270() {
        return this.field429 != 0;
    }

    @OriginalMember(owner = "client!tc", name = "i", descriptor = "(I)V")
    public final synchronized void method271(int arg0) {
        int var2 = ((class91) super.field2254).field1302.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field434 = arg0;
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "([B[IIIIIIILtc;)I")
    private static final int method272(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class35 arg8) {
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
        arg8.field434 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "()I")
    public final int method273() {
        int var1 = this.field443 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field441 == 0) {
            var2 -= this.field434 * var2 / (((class91) super.field2254).field1302.length << 8);
        } else if (this.field441 >= 0) {
            var2 -= this.field439 * var2 / ((class91) super.field2254).field1302.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(I[B[IIIIIIIIIILtc;)I")
    private static final int method274(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class35 arg12) {
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
        arg12.field443 += (var19 - arg4) * arg12.field433;
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
        arg12.field440 = var15 >> 2;
        arg12.field436 = var16 >> 2;
        arg12.field434 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "(II)I")
    private static final int method275(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!tc", name = "j", descriptor = "()I")
    public final synchronized int method276() {
        return this.field431 == Integer.MIN_VALUE ? 0 : this.field431;
    }

    @OriginalMember(owner = "client!tc", name = "k", descriptor = "()Z")
    public final boolean method277() {
        return this.field434 < 0 || this.field434 >= ((class91) super.field2254).field1302.length << 8;
    }

    @OriginalMember(owner = "client!tc", name = "j", descriptor = "(I)V")
    private final synchronized void method278(int arg0) {
        this.method282(arg0, this.method240());
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(I[B[IIIIIIIIIILtc;)I")
    private static final int method279(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class35 arg12) {
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
        arg12.field443 += (var19 - arg4) * arg12.field433;
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
        arg12.field440 = var15 >> 2;
        arg12.field436 = var16 >> 2;
        arg12.field434 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lwc;III)Ltc;")
    public static final class35 method280(class91 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1302 != null && arg0.field1302.length != 0 ? new class35(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(Z)V")
    public final synchronized void method281(boolean arg0) {
        this.field435 = (this.field435 >>> 31) + (this.field435 ^ this.field435 >> 31);
        if (arg0) {
            this.field435 = -this.field435;
        }
    }

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "(II)V")
    private final synchronized void method282(int arg0, int arg1) {
        this.field431 = arg0;
        this.field432 = arg1;
        this.field429 = 0;
        this.method257();
    }

    @OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(Lwc;II)V")
    private class35(class91 arg0, int arg1, int arg2) {
        super.field2254 = arg0;
        this.field439 = arg0.field1303;
        this.field438 = arg0.field1304;
        this.field442 = arg0.field1300;
        this.field435 = arg1;
        this.field431 = arg2;
        this.field432 = 8192;
        this.field434 = 0;
        this.method257();
    }

    @OriginalMember(owner = "client!tc", name = "l", descriptor = "()I")
    public final synchronized int method283() {
        return this.field435 < 0 ? -this.field435 : this.field435;
    }

    @OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(Lwc;III)V")
    private class35(class91 arg0, int arg1, int arg2, int arg3) {
        super.field2254 = arg0;
        this.field439 = arg0.field1303;
        this.field438 = arg0.field1304;
        this.field442 = arg0.field1300;
        this.field435 = arg1;
        this.field431 = arg2;
        this.field432 = arg3;
        this.field434 = 0;
        this.method257();
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "([III)V")
    public final synchronized void method284(int[] arg0, int arg1, int arg2) {
        if (this.field431 == 0 && this.field429 == 0) {
            this.method265(arg2);
        } else {
            class91 var4 = (class91) super.field2254;
            int var5 = this.field439 << 8;
            int var6 = this.field438 << 8;
            int var7 = var4.field1302.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field441 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field434 < 0) {
                if (this.field435 <= 0) {
                    this.method253();
                    this.method544(-38);
                    return;
                }
                this.field434 = 0;
            }
            if (this.field434 >= var7) {
                if (this.field435 >= 0) {
                    this.method253();
                    this.method544(-97);
                    return;
                }
                this.field434 = var7 - 1;
            }
            if (this.field441 < 0) {
                if (this.field442) {
                    if (this.field435 < 0) {
                        var9 = this.method244(arg0, arg1, var5, var10, var4.field1302[this.field439]);
                        if (this.field434 >= var5) {
                            return;
                        }
                        this.field434 = var5 + var5 - 1 - this.field434;
                        this.field435 = -this.field435;
                    }
                    while (true) {
                        int var11 = this.method252(arg0, var9, var6, var10, var4.field1302[this.field438 - 1]);
                        if (this.field434 < var6) {
                            return;
                        }
                        this.field434 = var6 + var6 - 1 - this.field434;
                        this.field435 = -this.field435;
                        var9 = this.method244(arg0, var11, var5, var10, var4.field1302[this.field439]);
                        if (this.field434 >= var5) {
                            return;
                        }
                        this.field434 = var5 + var5 - 1 - this.field434;
                        this.field435 = -this.field435;
                    }
                } else if (this.field435 < 0) {
                    while (true) {
                        var9 = this.method244(arg0, var9, var5, var10, var4.field1302[this.field438 - 1]);
                        if (this.field434 >= var5) {
                            return;
                        }
                        this.field434 = var6 - 1 - (var6 - 1 - this.field434) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method252(arg0, var9, var6, var10, var4.field1302[this.field439]);
                        if (this.field434 < var6) {
                            return;
                        }
                        this.field434 = (this.field434 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field441 > 0) {
                    if (this.field442) {
                        label130: {
                            if (this.field435 < 0) {
                                var9 = this.method244(arg0, arg1, var5, var10, var4.field1302[this.field439]);
                                if (this.field434 >= var5) {
                                    return;
                                }
                                this.field434 = var5 + var5 - 1 - this.field434;
                                this.field435 = -this.field435;
                                if (--this.field441 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method252(arg0, var9, var6, var10, var4.field1302[this.field438 - 1]);
                                if (this.field434 < var6) {
                                    return;
                                }
                                this.field434 = var6 + var6 - 1 - this.field434;
                                this.field435 = -this.field435;
                                if (--this.field441 == 0) {
                                    break;
                                }
                                var9 = this.method244(arg0, var9, var5, var10, var4.field1302[this.field439]);
                                if (this.field434 >= var5) {
                                    return;
                                }
                                this.field434 = var5 + var5 - 1 - this.field434;
                                this.field435 = -this.field435;
                            } while (--this.field441 != 0);
                        }
                    } else if (this.field435 < 0) {
                        while (true) {
                            var9 = this.method244(arg0, var9, var5, var10, var4.field1302[this.field438 - 1]);
                            if (this.field434 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field434) / var8;
                            if (var12 >= this.field441) {
                                this.field434 += this.field441 * var8;
                                this.field441 = 0;
                                break;
                            }
                            this.field434 += var8 * var12;
                            this.field441 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method252(arg0, var9, var6, var10, var4.field1302[this.field439]);
                            if (this.field434 < var6) {
                                return;
                            }
                            int var13 = (this.field434 - var5) / var8;
                            if (var13 >= this.field441) {
                                this.field434 -= this.field441 * var8;
                                this.field441 = 0;
                                break;
                            }
                            this.field434 -= var8 * var13;
                            this.field441 -= var13;
                        }
                    }
                }
                if (this.field435 < 0) {
                    this.method244(arg0, var9, 0, var10, 0);
                    if (this.field434 < 0) {
                        this.field434 = -1;
                        this.method253();
                        this.method544(94);
                        return;
                    }
                } else {
                    this.method252(arg0, var9, var7, var10, 0);
                    if (this.field434 >= var7) {
                        this.field434 = var7;
                        this.method253();
                        this.method544(-74);
                    }
                }
            }
        }
    }
}
