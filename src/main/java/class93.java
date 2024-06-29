import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hba")
public class class93 extends class528 {

    @OriginalMember(owner = "client!hba", name = "y", descriptor = "I")
    private int field1281;

    @OriginalMember(owner = "client!hba", name = "x", descriptor = "I")
    private int field1277;

    @OriginalMember(owner = "client!hba", name = "p", descriptor = "Z")
    private boolean field1289;

    @OriginalMember(owner = "client!hba", name = "s", descriptor = "I")
    private int field1286;

    @OriginalMember(owner = "client!hba", name = "v", descriptor = "I")
    private int field1290;

    @OriginalMember(owner = "client!hba", name = "u", descriptor = "I")
    private int field1284;

    @OriginalMember(owner = "client!hba", name = "z", descriptor = "I")
    private int field1278;

    @OriginalMember(owner = "client!hba", name = "r", descriptor = "I")
    private int field1279;

    @OriginalMember(owner = "client!hba", name = "n", descriptor = "I")
    private int field1280;

    @OriginalMember(owner = "client!hba", name = "A", descriptor = "I")
    private int field1282;

    @OriginalMember(owner = "client!hba", name = "o", descriptor = "I")
    private int field1283;

    @OriginalMember(owner = "client!hba", name = "t", descriptor = "I")
    private int field1285;

    @OriginalMember(owner = "client!hba", name = "m", descriptor = "I")
    private int field1287;

    @OriginalMember(owner = "client!hba", name = "q", descriptor = "I")
    private int field1288;

    @OriginalMember(owner = "client!hba", name = "w", descriptor = "I")
    private int field1291;

    @OriginalMember(owner = "client!hba", name = "c", descriptor = "(II)I")
    private static final int method896(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(II)V")
    public final synchronized void method897(int arg0, int arg1) {
        this.method899(arg0, arg1, this.method916());
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "([IIIII)I")
    private final int method898(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field1291 <= 0) {
                if (this.field1286 == 256 && (this.field1278 & 255) == 0) {
                    if (class375.field5471) {
                        return method914(0, ((class313) super.field7675).field4295, arg0, this.field1278, arg1, this.field1288, this.field1283, 0, arg3, arg2, this);
                    }
                    return method930(((class313) super.field7675).field4295, arg0, this.field1278, arg1, this.field1279, 0, arg3, arg2, this);
                }
                if (class375.field5471) {
                    return method940(0, 0, ((class313) super.field7675).field4295, arg0, this.field1278, arg1, this.field1288, this.field1283, 0, arg3, arg2, this, this.field1286, arg4);
                }
                return method909(0, 0, ((class313) super.field7675).field4295, arg0, this.field1278, arg1, this.field1279, 0, arg3, arg2, this, this.field1286, arg4);
            }
            int var6 = this.field1291 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field1291 += arg1;
            if (this.field1286 == 256 && (this.field1278 & 255) == 0) {
                if (class375.field5471) {
                    arg1 = method934(0, ((class313) super.field7675).field4295, arg0, this.field1278, arg1, this.field1288, this.field1283, this.field1287, this.field1280, 0, var6, arg2, this);
                } else {
                    arg1 = method913(((class313) super.field7675).field4295, arg0, this.field1278, arg1, this.field1279, this.field1285, 0, var6, arg2, this);
                }
            } else if (class375.field5471) {
                arg1 = method935(0, 0, ((class313) super.field7675).field4295, arg0, this.field1278, arg1, this.field1288, this.field1283, this.field1287, this.field1280, 0, var6, arg2, this, this.field1286, arg4);
            } else {
                arg1 = method918(0, 0, ((class313) super.field7675).field4295, arg0, this.field1278, arg1, this.field1279, this.field1285, 0, var6, arg2, this, this.field1286, arg4);
            }
            this.field1291 -= arg1;
            if (this.field1291 != 0) {
                return arg1;
            }
        } while (!this.method907());
        return arg3;
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(III)V")
    public final synchronized void method899(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method911(arg1, arg2);
        } else {
            int var4 = method922(arg1, arg2);
            int var5 = method896(arg1, arg2);
            if (this.field1288 == var4 && this.field1283 == var5) {
                this.field1291 = 0;
            } else {
                int var6 = arg1 - this.field1279;
                if (this.field1279 - arg1 > var6) {
                    var6 = this.field1279 - arg1;
                }
                if (var4 - this.field1288 > var6) {
                    var6 = var4 - this.field1288;
                }
                if (this.field1288 - var4 > var6) {
                    var6 = this.field1288 - var4;
                }
                if (var5 - this.field1283 > var6) {
                    var6 = var5 - this.field1283;
                }
                if (this.field1283 - var5 > var6) {
                    var6 = this.field1283 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field1291 = arg0;
                this.field1290 = arg1;
                this.field1284 = arg2;
                this.field1285 = (arg1 - this.field1279) / arg0;
                this.field1287 = (var4 - this.field1288) / arg0;
                this.field1280 = (var5 - this.field1283) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!hba", name = "f", descriptor = "()V")
    private final void method900() {
        if (this.field1291 != 0) {
            if (this.field1290 == Integer.MIN_VALUE) {
                this.field1290 = 0;
            }
            this.field1291 = 0;
            this.method902();
        }
    }

    @OriginalMember(owner = "client!hba", name = "b", descriptor = "(II[B[IIIIIIIILhba;II)I")
    private static final int method901(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class93 arg11, int arg12, int arg13) {
        arg11.field1288 -= arg11.field1287 * arg5;
        arg11.field1283 -= arg11.field1280 * arg5;
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
        arg11.field1288 += arg11.field1287 * arg5;
        arg11.field1283 += arg11.field1280 * arg5;
        arg11.field1279 = arg6;
        arg11.field1278 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!hba", name = "k", descriptor = "()V")
    private final void method902() {
        this.field1279 = this.field1290;
        this.field1288 = method922(this.field1290, this.field1284);
        this.field1283 = method896(this.field1290, this.field1284);
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(Z)V")
    public final synchronized void method903(boolean arg0) {
        this.field1286 = (this.field1286 >>> 31) + (this.field1286 ^ this.field1286 >> 31);
        if (arg0) {
            this.field1286 = -this.field1286;
        }
    }

    @OriginalMember(owner = "client!hba", name = "j", descriptor = "()I")
    public final synchronized int method904() {
        return this.field1290 == Integer.MIN_VALUE ? 0 : this.field1290;
    }

    @OriginalMember(owner = "client!hba", name = "i", descriptor = "()I")
    public final synchronized int method905() {
        return this.field1286 < 0 ? -this.field1286 : this.field1286;
    }

    @OriginalMember(owner = "client!hba", name = "b", descriptor = "([IIIII)I")
    private final int method906(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field1291 <= 0) {
                if (this.field1286 == -256 && (this.field1278 & 255) == 0) {
                    if (class375.field5471) {
                        return method921(0, ((class313) super.field7675).field4295, arg0, this.field1278, arg1, this.field1288, this.field1283, 0, arg3, arg2, this);
                    }
                    return method908(((class313) super.field7675).field4295, arg0, this.field1278, arg1, this.field1279, 0, arg3, arg2, this);
                }
                if (class375.field5471) {
                    return method926(0, 0, ((class313) super.field7675).field4295, arg0, this.field1278, arg1, this.field1288, this.field1283, 0, arg3, arg2, this, this.field1286, arg4);
                }
                return method941(0, 0, ((class313) super.field7675).field4295, arg0, this.field1278, arg1, this.field1279, 0, arg3, arg2, this, this.field1286, arg4);
            }
            int var6 = this.field1291 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field1291 += arg1;
            if (this.field1286 == -256 && (this.field1278 & 255) == 0) {
                if (class375.field5471) {
                    arg1 = method933(0, ((class313) super.field7675).field4295, arg0, this.field1278, arg1, this.field1288, this.field1283, this.field1287, this.field1280, 0, var6, arg2, this);
                } else {
                    arg1 = method910(((class313) super.field7675).field4295, arg0, this.field1278, arg1, this.field1279, this.field1285, 0, var6, arg2, this);
                }
            } else if (class375.field5471) {
                arg1 = method928(0, 0, ((class313) super.field7675).field4295, arg0, this.field1278, arg1, this.field1288, this.field1283, this.field1287, this.field1280, 0, var6, arg2, this, this.field1286, arg4);
            } else {
                arg1 = method901(0, 0, ((class313) super.field7675).field4295, arg0, this.field1278, arg1, this.field1279, this.field1285, 0, var6, arg2, this, this.field1286, arg4);
            }
            this.field1291 -= arg1;
            if (this.field1291 != 0) {
                return arg1;
            }
        } while (!this.method907());
        return arg3;
    }

    @OriginalMember(owner = "client!hba", name = "h", descriptor = "()Z")
    private final boolean method907() {
        int var1 = this.field1290;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method922(var1, this.field1284);
            var2 = method896(var1, this.field1284);
        }
        if (this.field1279 == var1 && this.field1288 == var3 && this.field1283 == var2) {
            if (this.field1290 == Integer.MIN_VALUE) {
                this.field1290 = 0;
                this.field1279 = this.field1288 = this.field1283 = 0;
                this.method4294(0);
                return true;
            } else {
                this.method902();
                return false;
            }
        } else {
            if (this.field1279 < var1) {
                this.field1285 = 1;
                this.field1291 = var1 - this.field1279;
            } else if (this.field1279 > var1) {
                this.field1285 = -1;
                this.field1291 = this.field1279 - var1;
            } else {
                this.field1285 = 0;
            }
            if (this.field1288 < var3) {
                this.field1287 = 1;
                if (this.field1291 == 0 || this.field1291 > var3 - this.field1288) {
                    this.field1291 = var3 - this.field1288;
                }
            } else if (this.field1288 > var3) {
                this.field1287 = -1;
                if (this.field1291 == 0 || this.field1291 > this.field1288 - var3) {
                    this.field1291 = this.field1288 - var3;
                }
            } else {
                this.field1287 = 0;
            }
            if (this.field1283 < var2) {
                this.field1280 = 1;
                if (this.field1291 == 0 || this.field1291 > var2 - this.field1283) {
                    this.field1291 = var2 - this.field1283;
                }
            } else if (this.field1283 > var2) {
                this.field1280 = -1;
                if (this.field1291 == 0 || this.field1291 > this.field1283 - var2) {
                    this.field1291 = this.field1283 - var2;
                }
            } else {
                this.field1280 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!hba", name = "b", descriptor = "([B[IIIIIIILhba;)I")
    private static final int method908(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class93 arg8) {
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
        arg8.field1278 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(II[B[IIIIIIILhba;II)I")
    private static final int method909(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class93 arg10, int arg11, int arg12) {
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
        arg10.field1278 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "([B[IIIIIIIILhba;)I")
    private static final int method910(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class93 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1288 += (var14 - arg3) * arg9.field1287;
        arg9.field1283 += (var14 - arg3) * arg9.field1280;
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
        arg9.field1279 = var12 >> 2;
        arg9.field1278 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!hba", name = "b", descriptor = "(II)V")
    private final synchronized void method911(int arg0, int arg1) {
        this.field1290 = arg0;
        this.field1284 = arg1;
        this.field1291 = 0;
        this.method902();
    }

    @OriginalMember(owner = "client!hba", name = "b", descriptor = "(I)V")
    public final synchronized void method912(int arg0) {
        if (arg0 == 0) {
            this.method923(0);
            this.method4294(0);
        } else if (this.field1288 == 0 && this.field1283 == 0) {
            this.field1291 = 0;
            this.field1290 = 0;
            this.field1279 = 0;
            this.method4294(0);
        } else {
            int var2 = -this.field1279;
            if (this.field1279 > var2) {
                var2 = this.field1279;
            }
            if (-this.field1288 > var2) {
                var2 = -this.field1288;
            }
            if (this.field1288 > var2) {
                var2 = this.field1288;
            }
            if (-this.field1283 > var2) {
                var2 = -this.field1283;
            }
            if (this.field1283 > var2) {
                var2 = this.field1283;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1291 = arg0;
            this.field1290 = Integer.MIN_VALUE;
            this.field1285 = -this.field1279 / arg0;
            this.field1287 = -this.field1288 / arg0;
            this.field1280 = -this.field1283 / arg0;
        }
    }

    @OriginalMember(owner = "client!hba", name = "b", descriptor = "([B[IIIIIIIILhba;)I")
    private static final int method913(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class93 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1288 += (var14 - arg3) * arg9.field1287;
        arg9.field1283 += (var14 - arg3) * arg9.field1280;
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
        arg9.field1279 = var12 >> 2;
        arg9.field1278 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!hba", name = "b", descriptor = "(I[B[IIIIIIIILhba;)I")
    private static final int method914(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class93 arg10) {
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
        arg10.field1278 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(Lvfa;III)Lhba;")
    public static final class93 method915(class313 arg0, int arg1, int arg2, int arg3) {
        return arg0.field4295 != null && arg0.field4295.length != 0 ? new class93(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!hba", name = "e", descriptor = "()I")
    public final synchronized int method916() {
        return this.field1284 < 0 ? -1 : this.field1284;
    }

    @OriginalMember(owner = "client!hba", name = "c", descriptor = "()I")
    public final int method917() {
        return this.field1290 == 0 && this.field1291 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!hba", name = "c", descriptor = "(II[B[IIIIIIIILhba;II)I")
    private static final int method918(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class93 arg11, int arg12, int arg13) {
        arg11.field1288 -= arg11.field1287 * arg5;
        arg11.field1283 -= arg11.field1280 * arg5;
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
        arg11.field1288 += arg11.field1287 * arg5;
        arg11.field1283 += arg11.field1280 * arg5;
        arg11.field1279 = arg6;
        arg11.field1278 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!hba", name = "b", descriptor = "()Ljn;")
    public final class528 method919() {
        return null;
    }

    @OriginalMember(owner = "client!hba", name = "i", descriptor = "(I)V")
    public final synchronized void method920(int arg0) {
        this.method911(arg0 << 6, this.method916());
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(I[B[IIIIIIIILhba;)I")
    private static final int method921(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class93 arg10) {
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
        arg10.field1278 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!hba", name = "d", descriptor = "(II)I")
    private static final int method922(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!hba", name = "c", descriptor = "(I)V")
    private final synchronized void method923(int arg0) {
        this.method911(arg0, this.method916());
    }

    @OriginalMember(owner = "client!hba", name = "h", descriptor = "(I)V")
    public final synchronized void method924(int arg0) {
        if (this.field1286 < 0) {
            this.field1286 = -arg0;
        } else {
            this.field1286 = arg0;
        }
    }

    @OriginalMember(owner = "client!hba", name = "g", descriptor = "()Z")
    public final boolean method925() {
        return this.field1291 != 0;
    }

    @OriginalMember(owner = "client!hba", name = "d", descriptor = "(II[B[IIIIIIIILhba;II)I")
    private static final int method926(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class93 arg11, int arg12, int arg13) {
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
        arg11.field1278 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!hba", name = "b", descriptor = "([III)V")
    public final synchronized void method927(int[] arg0, int arg1, int arg2) {
        if (this.field1290 == 0 && this.field1291 == 0) {
            this.method937(arg2);
        } else {
            class313 var4 = (class313) super.field7675;
            int var5 = this.field1281 << 8;
            int var6 = this.field1277 << 8;
            int var7 = var4.field4295.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field1282 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field1278 < 0) {
                if (this.field1286 <= 0) {
                    this.method900();
                    this.method4294(0);
                    return;
                }
                this.field1278 = 0;
            }
            if (this.field1278 >= var7) {
                if (this.field1286 >= 0) {
                    this.method900();
                    this.method4294(0);
                    return;
                }
                this.field1278 = var7 - 1;
            }
            if (this.field1282 < 0) {
                if (this.field1289) {
                    if (this.field1286 < 0) {
                        var9 = this.method906(arg0, arg1, var5, var10, var4.field4295[this.field1281]);
                        if (this.field1278 >= var5) {
                            return;
                        }
                        this.field1278 = var5 + var5 - 1 - this.field1278;
                        this.field1286 = -this.field1286;
                    }
                    while (true) {
                        int var11 = this.method898(arg0, var9, var6, var10, var4.field4295[this.field1277 - 1]);
                        if (this.field1278 < var6) {
                            return;
                        }
                        this.field1278 = var6 + var6 - 1 - this.field1278;
                        this.field1286 = -this.field1286;
                        var9 = this.method906(arg0, var11, var5, var10, var4.field4295[this.field1281]);
                        if (this.field1278 >= var5) {
                            return;
                        }
                        this.field1278 = var5 + var5 - 1 - this.field1278;
                        this.field1286 = -this.field1286;
                    }
                } else if (this.field1286 < 0) {
                    while (true) {
                        var9 = this.method906(arg0, var9, var5, var10, var4.field4295[this.field1277 - 1]);
                        if (this.field1278 >= var5) {
                            return;
                        }
                        this.field1278 = var6 - 1 - (var6 - 1 - this.field1278) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method898(arg0, var9, var6, var10, var4.field4295[this.field1281]);
                        if (this.field1278 < var6) {
                            return;
                        }
                        this.field1278 = (this.field1278 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field1282 > 0) {
                    if (this.field1289) {
                        label130: {
                            if (this.field1286 < 0) {
                                var9 = this.method906(arg0, arg1, var5, var10, var4.field4295[this.field1281]);
                                if (this.field1278 >= var5) {
                                    return;
                                }
                                this.field1278 = var5 + var5 - 1 - this.field1278;
                                this.field1286 = -this.field1286;
                                if (--this.field1282 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method898(arg0, var9, var6, var10, var4.field4295[this.field1277 - 1]);
                                if (this.field1278 < var6) {
                                    return;
                                }
                                this.field1278 = var6 + var6 - 1 - this.field1278;
                                this.field1286 = -this.field1286;
                                if (--this.field1282 == 0) {
                                    break;
                                }
                                var9 = this.method906(arg0, var9, var5, var10, var4.field4295[this.field1281]);
                                if (this.field1278 >= var5) {
                                    return;
                                }
                                this.field1278 = var5 + var5 - 1 - this.field1278;
                                this.field1286 = -this.field1286;
                            } while (--this.field1282 != 0);
                        }
                    } else if (this.field1286 < 0) {
                        while (true) {
                            var9 = this.method906(arg0, var9, var5, var10, var4.field4295[this.field1277 - 1]);
                            if (this.field1278 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field1278) / var8;
                            if (var12 >= this.field1282) {
                                this.field1278 += this.field1282 * var8;
                                this.field1282 = 0;
                                break;
                            }
                            this.field1278 += var8 * var12;
                            this.field1282 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method898(arg0, var9, var6, var10, var4.field4295[this.field1281]);
                            if (this.field1278 < var6) {
                                return;
                            }
                            int var13 = (this.field1278 - var5) / var8;
                            if (var13 >= this.field1282) {
                                this.field1278 -= this.field1282 * var8;
                                this.field1282 = 0;
                                break;
                            }
                            this.field1278 -= var8 * var13;
                            this.field1282 -= var13;
                        }
                    }
                }
                if (this.field1286 < 0) {
                    this.method906(arg0, var9, 0, var10, 0);
                    if (this.field1278 < 0) {
                        this.field1278 = -1;
                        this.method900();
                        this.method4294(0);
                        return;
                    }
                } else {
                    this.method898(arg0, var9, var7, var10, 0);
                    if (this.field1278 >= var7) {
                        this.field1278 = var7;
                        this.method900();
                        this.method4294(0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(II[B[IIIIIIIIIILhba;II)I")
    private static final int method928(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class93 arg13, int arg14, int arg15) {
        arg13.field1279 -= arg13.field1285 * arg5;
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
        arg13.field1279 += arg13.field1285 * var22;
        arg13.field1288 = arg6;
        arg13.field1283 = arg7;
        arg13.field1278 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!hba", name = "j", descriptor = "(I)V")
    public final synchronized void method929(int arg0) {
        this.method911(this.method904(), arg0);
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "([B[IIIIIIILhba;)I")
    private static final int method930(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class93 arg8) {
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
        arg8.field1278 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "()Ljn;")
    public final class528 method931() {
        return null;
    }

    @OriginalMember(owner = "client!hba", name = "f", descriptor = "(I)V")
    public final synchronized void method932(int arg0) {
        int var2 = ((class313) super.field7675).field4295.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1278 = arg0;
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(I[B[IIIIIIIIIILhba;)I")
    private static final int method933(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class93 arg12) {
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
        arg12.field1279 += (var19 - arg4) * arg12.field1285;
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
        arg12.field1288 = var15 >> 2;
        arg12.field1283 = var16 >> 2;
        arg12.field1278 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!hba", name = "b", descriptor = "(I[B[IIIIIIIIIILhba;)I")
    private static final int method934(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class93 arg12) {
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
        arg12.field1279 += (var19 - arg4) * arg12.field1285;
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
        arg12.field1288 = var15 >> 2;
        arg12.field1283 = var16 >> 2;
        arg12.field1278 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!hba", name = "b", descriptor = "(II[B[IIIIIIIIIILhba;II)I")
    private static final int method935(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class93 arg13, int arg14, int arg15) {
        arg13.field1279 -= arg13.field1285 * arg5;
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
        arg13.field1279 += arg13.field1285 * var22;
        arg13.field1288 = arg6;
        arg13.field1283 = arg7;
        arg13.field1278 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!hba", name = "g", descriptor = "(I)V")
    public final synchronized void method936(int arg0) {
        this.field1282 = arg0;
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(I)V")
    public final synchronized void method937(int arg0) {
        if (this.field1291 > 0) {
            if (arg0 >= this.field1291) {
                if (this.field1290 == Integer.MIN_VALUE) {
                    this.field1290 = 0;
                    this.field1279 = this.field1288 = this.field1283 = 0;
                    this.method4294(0);
                    arg0 = this.field1291;
                }
                this.field1291 = 0;
                this.method902();
            } else {
                this.field1279 += this.field1285 * arg0;
                this.field1288 += this.field1287 * arg0;
                this.field1283 += this.field1280 * arg0;
                this.field1291 -= arg0;
            }
        }
        class313 var2 = (class313) super.field7675;
        int var3 = this.field1281 << 8;
        int var4 = this.field1277 << 8;
        int var5 = var2.field4295.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1282 = 0;
        }
        if (this.field1278 < 0) {
            if (this.field1286 <= 0) {
                this.method900();
                this.method4294(0);
                return;
            }
            this.field1278 = 0;
        }
        if (this.field1278 >= var5) {
            if (this.field1286 >= 0) {
                this.method900();
                this.method4294(0);
                return;
            }
            this.field1278 = var5 - 1;
        }
        this.field1278 += this.field1286 * arg0;
        if (this.field1282 < 0) {
            if (!this.field1289) {
                if (this.field1286 < 0) {
                    if (this.field1278 < var3) {
                        this.field1278 = var4 - 1 - (var4 - 1 - this.field1278) % var6;
                    }
                } else if (this.field1278 >= var4) {
                    this.field1278 = (this.field1278 - var3) % var6 + var3;
                }
            } else {
                if (this.field1286 < 0) {
                    if (this.field1278 >= var3) {
                        return;
                    }
                    this.field1278 = var3 + var3 - 1 - this.field1278;
                    this.field1286 = -this.field1286;
                }
                while (this.field1278 >= var4) {
                    this.field1278 = var4 + var4 - 1 - this.field1278;
                    this.field1286 = -this.field1286;
                    if (this.field1278 >= var3) {
                        return;
                    }
                    this.field1278 = var3 + var3 - 1 - this.field1278;
                    this.field1286 = -this.field1286;
                }
            }
        } else {
            if (this.field1282 > 0) {
                if (this.field1289) {
                    label125: {
                        if (this.field1286 < 0) {
                            if (this.field1278 >= var3) {
                                return;
                            }
                            this.field1278 = var3 + var3 - 1 - this.field1278;
                            this.field1286 = -this.field1286;
                            if (--this.field1282 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field1278 < var4) {
                                return;
                            }
                            this.field1278 = var4 + var4 - 1 - this.field1278;
                            this.field1286 = -this.field1286;
                            if (--this.field1282 == 0) {
                                break;
                            }
                            if (this.field1278 >= var3) {
                                return;
                            }
                            this.field1278 = var3 + var3 - 1 - this.field1278;
                            this.field1286 = -this.field1286;
                        } while (--this.field1282 != 0);
                    }
                } else if (this.field1286 < 0) {
                    if (this.field1278 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field1278) / var6;
                    if (var7 < this.field1282) {
                        this.field1278 += var6 * var7;
                        this.field1282 -= var7;
                        return;
                    }
                    this.field1278 += this.field1282 * var6;
                    this.field1282 = 0;
                } else {
                    if (this.field1278 < var4) {
                        return;
                    }
                    int var8 = (this.field1278 - var3) / var6;
                    if (var8 < this.field1282) {
                        this.field1278 -= var6 * var8;
                        this.field1282 -= var8;
                        return;
                    }
                    this.field1278 -= this.field1282 * var6;
                    this.field1282 = 0;
                }
            }
            if (this.field1286 < 0) {
                if (this.field1278 < 0) {
                    this.field1278 = -1;
                    this.method900();
                    this.method4294(0);
                    return;
                }
            } else if (this.field1278 >= var5) {
                this.field1278 = var5;
                this.method900();
                this.method4294(0);
            }
        }
    }

    @OriginalMember(owner = "client!hba", name = "d", descriptor = "()I")
    public final int method938() {
        int var1 = this.field1279 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1282 == 0) {
            var2 -= this.field1278 * var2 / (((class313) super.field7675).field4295.length << 8);
        } else if (this.field1282 >= 0) {
            var2 -= this.field1281 * var2 / ((class313) super.field7675).field4295.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!hba", name = "l", descriptor = "()Z")
    public final boolean method939() {
        return this.field1278 < 0 || this.field1278 >= ((class313) super.field7675).field4295.length << 8;
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(II[B[IIIIIIIILhba;II)I")
    private static final int method940(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class93 arg11, int arg12, int arg13) {
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
        arg11.field1278 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!hba", name = "b", descriptor = "(II[B[IIIIIIILhba;II)I")
    private static final int method941(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class93 arg10, int arg11, int arg12) {
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
        arg10.field1278 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!hba", name = "<init>", descriptor = "(Lvfa;III)V")
    private class93(class313 arg0, int arg1, int arg2, int arg3) {
        super.field7675 = arg0;
        this.field1281 = arg0.field4294;
        this.field1277 = arg0.field4296;
        this.field1289 = arg0.field4293;
        this.field1286 = arg1;
        this.field1290 = arg2;
        this.field1284 = arg3;
        this.field1278 = 0;
        this.method902();
    }
}
