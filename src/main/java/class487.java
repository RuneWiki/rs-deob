import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bs")
public class class487 extends class232 {

    @OriginalMember(owner = "client!bs", name = "r", descriptor = "I")
    private int field7171;

    @OriginalMember(owner = "client!bs", name = "s", descriptor = "I")
    private int field7172;

    @OriginalMember(owner = "client!bs", name = "C", descriptor = "Z")
    private boolean field7182;

    @OriginalMember(owner = "client!bs", name = "t", descriptor = "I")
    private int field7173;

    @OriginalMember(owner = "client!bs", name = "p", descriptor = "I")
    private int field7169;

    @OriginalMember(owner = "client!bs", name = "y", descriptor = "I")
    private int field7178;

    @OriginalMember(owner = "client!bs", name = "A", descriptor = "I")
    private int field7180;

    @OriginalMember(owner = "client!bs", name = "o", descriptor = "I")
    private int field7168;

    @OriginalMember(owner = "client!bs", name = "q", descriptor = "I")
    private int field7170;

    @OriginalMember(owner = "client!bs", name = "u", descriptor = "I")
    private int field7174;

    @OriginalMember(owner = "client!bs", name = "v", descriptor = "I")
    private int field7175;

    @OriginalMember(owner = "client!bs", name = "w", descriptor = "I")
    private int field7176;

    @OriginalMember(owner = "client!bs", name = "x", descriptor = "I")
    private int field7177;

    @OriginalMember(owner = "client!bs", name = "z", descriptor = "I")
    private int field7179;

    @OriginalMember(owner = "client!bs", name = "B", descriptor = "I")
    private int field7181;

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "()Lsc;")
    public final class232 method641() {
        return null;
    }

    @OriginalMember(owner = "client!bs", name = "c", descriptor = "(I)V")
    public final synchronized void method2916(int arg0) {
        this.method2918(arg0 << 6, this.method2950());
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(II[B[IIIIIIIILbs;II)I")
    private static final int method2917(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class487 arg11, int arg12, int arg13) {
        arg11.field7168 -= arg11.field7174 * arg5;
        arg11.field7177 -= arg11.field7176 * arg5;
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
        arg11.field7168 += arg11.field7174 * arg5;
        arg11.field7177 += arg11.field7176 * arg5;
        arg11.field7181 = arg6;
        arg11.field7180 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "()I")
    public final int method1532() {
        int var1 = this.field7181 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field7175 == 0) {
            var2 -= this.field7180 * var2 / (((class116) super.field3592).field2068.length << 8);
        } else if (this.field7175 >= 0) {
            var2 -= this.field7171 * var2 / ((class116) super.field3592).field2068.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "(II)V")
    private final synchronized void method2918(int arg0, int arg1) {
        this.field7169 = arg0;
        this.field7178 = arg1;
        this.field7170 = 0;
        this.method2948();
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "([B[IIIIIIILbs;)I")
    private static final int method2919(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class487 arg8) {
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
        arg8.field7180 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!bs", name = "e", descriptor = "()I")
    public final synchronized int method2920() {
        return this.field7169 == Integer.MIN_VALUE ? 0 : this.field7169;
    }

    @OriginalMember(owner = "client!bs", name = "d", descriptor = "(I)V")
    private final synchronized void method2921(int arg0) {
        this.method2918(arg0, this.method2950());
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(II[B[IIIIIIILbs;II)I")
    private static final int method2922(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class487 arg10, int arg11, int arg12) {
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
        arg10.field7180 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(Lwq;III)Lbs;")
    public static final class487 method2923(class116 arg0, int arg1, int arg2, int arg3) {
        return arg0.field2068 != null && arg0.field2068.length != 0 ? new class487(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "([IIIII)I")
    private final int method2924(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field7170 <= 0) {
                if (this.field7173 == 256 && (this.field7180 & 255) == 0) {
                    if (class315.field4754) {
                        return method2951(0, ((class116) super.field3592).field2068, arg0, this.field7180, arg1, this.field7168, this.field7177, 0, arg3, arg2, this);
                    }
                    return method2919(((class116) super.field3592).field2068, arg0, this.field7180, arg1, this.field7181, 0, arg3, arg2, this);
                }
                if (class315.field4754) {
                    return method2935(0, 0, ((class116) super.field3592).field2068, arg0, this.field7180, arg1, this.field7168, this.field7177, 0, arg3, arg2, this, this.field7173, arg4);
                }
                return method2934(0, 0, ((class116) super.field3592).field2068, arg0, this.field7180, arg1, this.field7181, 0, arg3, arg2, this, this.field7173, arg4);
            }
            int var6 = this.field7170 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field7170 += arg1;
            if (this.field7173 == 256 && (this.field7180 & 255) == 0) {
                if (class315.field4754) {
                    arg1 = method2943(0, ((class116) super.field3592).field2068, arg0, this.field7180, arg1, this.field7168, this.field7177, this.field7174, this.field7176, 0, var6, arg2, this);
                } else {
                    arg1 = method2949(((class116) super.field3592).field2068, arg0, this.field7180, arg1, this.field7181, this.field7179, 0, var6, arg2, this);
                }
            } else if (class315.field4754) {
                arg1 = method2927(0, 0, ((class116) super.field3592).field2068, arg0, this.field7180, arg1, this.field7168, this.field7177, this.field7174, this.field7176, 0, var6, arg2, this, this.field7173, arg4);
            } else {
                arg1 = method2925(0, 0, ((class116) super.field3592).field2068, arg0, this.field7180, arg1, this.field7181, this.field7179, 0, var6, arg2, this, this.field7173, arg4);
            }
            this.field7170 -= arg1;
            if (this.field7170 != 0) {
                return arg1;
            }
        } while (!this.method2947());
        return arg3;
    }

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "(II[B[IIIIIIIILbs;II)I")
    private static final int method2925(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class487 arg11, int arg12, int arg13) {
        arg11.field7168 -= arg11.field7174 * arg5;
        arg11.field7177 -= arg11.field7176 * arg5;
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
        arg11.field7168 += arg11.field7174 * arg5;
        arg11.field7177 += arg11.field7176 * arg5;
        arg11.field7181 = arg6;
        arg11.field7180 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(I)V")
    public final synchronized void method648(int arg0) {
        if (this.field7170 > 0) {
            if (arg0 >= this.field7170) {
                if (this.field7169 == Integer.MIN_VALUE) {
                    this.field7169 = 0;
                    this.field7181 = this.field7168 = this.field7177 = 0;
                    this.method1676(true);
                    arg0 = this.field7170;
                }
                this.field7170 = 0;
                this.method2948();
            } else {
                this.field7181 += this.field7179 * arg0;
                this.field7168 += this.field7174 * arg0;
                this.field7177 += this.field7176 * arg0;
                this.field7170 -= arg0;
            }
        }
        class116 var2 = (class116) super.field3592;
        int var3 = this.field7171 << 8;
        int var4 = this.field7172 << 8;
        int var5 = var2.field2068.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field7175 = 0;
        }
        if (this.field7180 < 0) {
            if (this.field7173 <= 0) {
                this.method2939();
                this.method1676(true);
                return;
            }
            this.field7180 = 0;
        }
        if (this.field7180 >= var5) {
            if (this.field7173 >= 0) {
                this.method2939();
                this.method1676(true);
                return;
            }
            this.field7180 = var5 - 1;
        }
        this.field7180 += this.field7173 * arg0;
        if (this.field7175 < 0) {
            if (!this.field7182) {
                if (this.field7173 < 0) {
                    if (this.field7180 < var3) {
                        this.field7180 = var4 - 1 - (var4 - 1 - this.field7180) % var6;
                    }
                } else if (this.field7180 >= var4) {
                    this.field7180 = (this.field7180 - var3) % var6 + var3;
                }
            } else {
                if (this.field7173 < 0) {
                    if (this.field7180 >= var3) {
                        return;
                    }
                    this.field7180 = var3 + var3 - 1 - this.field7180;
                    this.field7173 = -this.field7173;
                }
                while (this.field7180 >= var4) {
                    this.field7180 = var4 + var4 - 1 - this.field7180;
                    this.field7173 = -this.field7173;
                    if (this.field7180 >= var3) {
                        return;
                    }
                    this.field7180 = var3 + var3 - 1 - this.field7180;
                    this.field7173 = -this.field7173;
                }
            }
        } else {
            if (this.field7175 > 0) {
                if (this.field7182) {
                    label125: {
                        if (this.field7173 < 0) {
                            if (this.field7180 >= var3) {
                                return;
                            }
                            this.field7180 = var3 + var3 - 1 - this.field7180;
                            this.field7173 = -this.field7173;
                            if (--this.field7175 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field7180 < var4) {
                                return;
                            }
                            this.field7180 = var4 + var4 - 1 - this.field7180;
                            this.field7173 = -this.field7173;
                            if (--this.field7175 == 0) {
                                break;
                            }
                            if (this.field7180 >= var3) {
                                return;
                            }
                            this.field7180 = var3 + var3 - 1 - this.field7180;
                            this.field7173 = -this.field7173;
                        } while (--this.field7175 != 0);
                    }
                } else if (this.field7173 < 0) {
                    if (this.field7180 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field7180) / var6;
                    if (var7 < this.field7175) {
                        this.field7180 += var6 * var7;
                        this.field7175 -= var7;
                        return;
                    }
                    this.field7180 += this.field7175 * var6;
                    this.field7175 = 0;
                } else {
                    if (this.field7180 < var4) {
                        return;
                    }
                    int var8 = (this.field7180 - var3) / var6;
                    if (var8 < this.field7175) {
                        this.field7180 -= var6 * var8;
                        this.field7175 -= var8;
                        return;
                    }
                    this.field7180 -= this.field7175 * var6;
                    this.field7175 = 0;
                }
            }
            if (this.field7173 < 0) {
                if (this.field7180 < 0) {
                    this.field7180 = -1;
                    this.method2939();
                    this.method1676(true);
                    return;
                }
            } else if (this.field7180 >= var5) {
                this.field7180 = var5;
                this.method2939();
                this.method1676(true);
            }
        }
    }

    @OriginalMember(owner = "client!bs", name = "f", descriptor = "()Z")
    public final boolean method2926() {
        return this.field7170 != 0;
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(II[B[IIIIIIIIIILbs;II)I")
    private static final int method2927(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class487 arg13, int arg14, int arg15) {
        arg13.field7181 -= arg13.field7179 * arg5;
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
        arg13.field7181 += arg13.field7179 * var22;
        arg13.field7168 = arg6;
        arg13.field7177 = arg7;
        arg13.field7180 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "([B[IIIIIIILbs;)I")
    private static final int method2928(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class487 arg8) {
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
        arg8.field7180 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "(Z)V")
    public final synchronized void method2929(boolean arg0) {
        this.field7173 = (this.field7173 >>> 31) + (this.field7173 ^ this.field7173 >> 31);
        if (arg0) {
            this.field7173 = -this.field7173;
        }
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "([III)V")
    public final synchronized void method618(int[] arg0, int arg1, int arg2) {
        if (this.field7169 == 0 && this.field7170 == 0) {
            this.method648(arg2);
        } else {
            class116 var4 = (class116) super.field3592;
            int var5 = this.field7171 << 8;
            int var6 = this.field7172 << 8;
            int var7 = var4.field2068.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field7175 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field7180 < 0) {
                if (this.field7173 <= 0) {
                    this.method2939();
                    this.method1676(true);
                    return;
                }
                this.field7180 = 0;
            }
            if (this.field7180 >= var7) {
                if (this.field7173 >= 0) {
                    this.method2939();
                    this.method1676(true);
                    return;
                }
                this.field7180 = var7 - 1;
            }
            if (this.field7175 < 0) {
                if (this.field7182) {
                    if (this.field7173 < 0) {
                        var9 = this.method2941(arg0, arg1, var5, var10, var4.field2068[this.field7171]);
                        if (this.field7180 >= var5) {
                            return;
                        }
                        this.field7180 = var5 + var5 - 1 - this.field7180;
                        this.field7173 = -this.field7173;
                    }
                    while (true) {
                        int var11 = this.method2924(arg0, var9, var6, var10, var4.field2068[this.field7172 - 1]);
                        if (this.field7180 < var6) {
                            return;
                        }
                        this.field7180 = var6 + var6 - 1 - this.field7180;
                        this.field7173 = -this.field7173;
                        var9 = this.method2941(arg0, var11, var5, var10, var4.field2068[this.field7171]);
                        if (this.field7180 >= var5) {
                            return;
                        }
                        this.field7180 = var5 + var5 - 1 - this.field7180;
                        this.field7173 = -this.field7173;
                    }
                } else if (this.field7173 < 0) {
                    while (true) {
                        var9 = this.method2941(arg0, var9, var5, var10, var4.field2068[this.field7172 - 1]);
                        if (this.field7180 >= var5) {
                            return;
                        }
                        this.field7180 = var6 - 1 - (var6 - 1 - this.field7180) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method2924(arg0, var9, var6, var10, var4.field2068[this.field7171]);
                        if (this.field7180 < var6) {
                            return;
                        }
                        this.field7180 = (this.field7180 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field7175 > 0) {
                    if (this.field7182) {
                        label130: {
                            if (this.field7173 < 0) {
                                var9 = this.method2941(arg0, arg1, var5, var10, var4.field2068[this.field7171]);
                                if (this.field7180 >= var5) {
                                    return;
                                }
                                this.field7180 = var5 + var5 - 1 - this.field7180;
                                this.field7173 = -this.field7173;
                                if (--this.field7175 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method2924(arg0, var9, var6, var10, var4.field2068[this.field7172 - 1]);
                                if (this.field7180 < var6) {
                                    return;
                                }
                                this.field7180 = var6 + var6 - 1 - this.field7180;
                                this.field7173 = -this.field7173;
                                if (--this.field7175 == 0) {
                                    break;
                                }
                                var9 = this.method2941(arg0, var9, var5, var10, var4.field2068[this.field7171]);
                                if (this.field7180 >= var5) {
                                    return;
                                }
                                this.field7180 = var5 + var5 - 1 - this.field7180;
                                this.field7173 = -this.field7173;
                            } while (--this.field7175 != 0);
                        }
                    } else if (this.field7173 < 0) {
                        while (true) {
                            var9 = this.method2941(arg0, var9, var5, var10, var4.field2068[this.field7172 - 1]);
                            if (this.field7180 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field7180) / var8;
                            if (var12 >= this.field7175) {
                                this.field7180 += this.field7175 * var8;
                                this.field7175 = 0;
                                break;
                            }
                            this.field7180 += var8 * var12;
                            this.field7175 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method2924(arg0, var9, var6, var10, var4.field2068[this.field7171]);
                            if (this.field7180 < var6) {
                                return;
                            }
                            int var13 = (this.field7180 - var5) / var8;
                            if (var13 >= this.field7175) {
                                this.field7180 -= this.field7175 * var8;
                                this.field7175 = 0;
                                break;
                            }
                            this.field7180 -= var8 * var13;
                            this.field7175 -= var13;
                        }
                    }
                }
                if (this.field7173 < 0) {
                    this.method2941(arg0, var9, 0, var10, 0);
                    if (this.field7180 < 0) {
                        this.field7180 = -1;
                        this.method2939();
                        this.method1676(true);
                        return;
                    }
                } else {
                    this.method2924(arg0, var9, var7, var10, 0);
                    if (this.field7180 >= var7) {
                        this.field7180 = var7;
                        this.method2939();
                        this.method1676(true);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bs", name = "g", descriptor = "()I")
    public final synchronized int method2930() {
        return this.field7173 < 0 ? -this.field7173 : this.field7173;
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(I[B[IIIIIIIILbs;)I")
    private static final int method2931(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class487 arg10) {
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
        arg10.field7180 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!bs", name = "e", descriptor = "(I)V")
    public final synchronized void method2932(int arg0) {
        int var2 = ((class116) super.field3592).field2068.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field7180 = arg0;
    }

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "(II[B[IIIIIIIIIILbs;II)I")
    private static final int method2933(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class487 arg13, int arg14, int arg15) {
        arg13.field7181 -= arg13.field7179 * arg5;
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
        arg13.field7181 += arg13.field7179 * var22;
        arg13.field7168 = arg6;
        arg13.field7177 = arg7;
        arg13.field7180 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "(II[B[IIIIIIILbs;II)I")
    private static final int method2934(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class487 arg10, int arg11, int arg12) {
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
        arg10.field7180 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!bs", name = "c", descriptor = "(II[B[IIIIIIIILbs;II)I")
    private static final int method2935(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class487 arg11, int arg12, int arg13) {
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
        arg11.field7180 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(Lwq;II)Lbs;")
    public static final class487 method2936(class116 arg0, int arg1, int arg2) {
        return arg0.field2068 != null && arg0.field2068.length != 0 ? new class487(arg0, (int) ((long) arg0.field2067 * 256L * (long) arg1 / (long) (class200.field3254 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!bs", name = "c", descriptor = "(II)V")
    public final synchronized void method2937(int arg0, int arg1) {
        this.method2952(arg0, arg1, this.method2950());
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(I[B[IIIIIIIIIILbs;)I")
    private static final int method2938(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class487 arg12) {
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
        arg12.field7181 += (var19 - arg4) * arg12.field7179;
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
        arg12.field7168 = var15 >> 2;
        arg12.field7177 = var16 >> 2;
        arg12.field7180 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!bs", name = "h", descriptor = "()V")
    private final void method2939() {
        if (this.field7170 != 0) {
            if (this.field7169 == Integer.MIN_VALUE) {
                this.field7169 = 0;
            }
            this.field7170 = 0;
            this.method2948();
        }
    }

    @OriginalMember(owner = "client!bs", name = "i", descriptor = "()Z")
    public final boolean method2940() {
        return this.field7180 < 0 || this.field7180 >= ((class116) super.field3592).field2068.length << 8;
    }

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "([IIIII)I")
    private final int method2941(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field7170 <= 0) {
                if (this.field7173 == -256 && (this.field7180 & 255) == 0) {
                    if (class315.field4754) {
                        return method2931(0, ((class116) super.field3592).field2068, arg0, this.field7180, arg1, this.field7168, this.field7177, 0, arg3, arg2, this);
                    }
                    return method2928(((class116) super.field3592).field2068, arg0, this.field7180, arg1, this.field7181, 0, arg3, arg2, this);
                }
                if (class315.field4754) {
                    return method2942(0, 0, ((class116) super.field3592).field2068, arg0, this.field7180, arg1, this.field7168, this.field7177, 0, arg3, arg2, this, this.field7173, arg4);
                }
                return method2922(0, 0, ((class116) super.field3592).field2068, arg0, this.field7180, arg1, this.field7181, 0, arg3, arg2, this, this.field7173, arg4);
            }
            int var6 = this.field7170 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field7170 += arg1;
            if (this.field7173 == -256 && (this.field7180 & 255) == 0) {
                if (class315.field4754) {
                    arg1 = method2938(0, ((class116) super.field3592).field2068, arg0, this.field7180, arg1, this.field7168, this.field7177, this.field7174, this.field7176, 0, var6, arg2, this);
                } else {
                    arg1 = method2945(((class116) super.field3592).field2068, arg0, this.field7180, arg1, this.field7181, this.field7179, 0, var6, arg2, this);
                }
            } else if (class315.field4754) {
                arg1 = method2933(0, 0, ((class116) super.field3592).field2068, arg0, this.field7180, arg1, this.field7168, this.field7177, this.field7174, this.field7176, 0, var6, arg2, this, this.field7173, arg4);
            } else {
                arg1 = method2917(0, 0, ((class116) super.field3592).field2068, arg0, this.field7180, arg1, this.field7181, this.field7179, 0, var6, arg2, this, this.field7173, arg4);
            }
            this.field7170 -= arg1;
            if (this.field7170 != 0) {
                return arg1;
            }
        } while (!this.method2947());
        return arg3;
    }

    @OriginalMember(owner = "client!bs", name = "d", descriptor = "(II[B[IIIIIIIILbs;II)I")
    private static final int method2942(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class487 arg11, int arg12, int arg13) {
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
        arg11.field7180 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "(I[B[IIIIIIIIIILbs;)I")
    private static final int method2943(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class487 arg12) {
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
        arg12.field7181 += (var19 - arg4) * arg12.field7179;
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
        arg12.field7168 = var15 >> 2;
        arg12.field7177 = var16 >> 2;
        arg12.field7180 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!bs", name = "c", descriptor = "()Lsc;")
    public final class232 method627() {
        return null;
    }

    @OriginalMember(owner = "client!bs", name = "f", descriptor = "(I)V")
    public final synchronized void method2944(int arg0) {
        if (arg0 == 0) {
            this.method2921(0);
            this.method1676(true);
        } else if (this.field7168 == 0 && this.field7177 == 0) {
            this.field7170 = 0;
            this.field7169 = 0;
            this.field7181 = 0;
            this.method1676(true);
        } else {
            int var2 = -this.field7181;
            if (this.field7181 > var2) {
                var2 = this.field7181;
            }
            if (-this.field7168 > var2) {
                var2 = -this.field7168;
            }
            if (this.field7168 > var2) {
                var2 = this.field7168;
            }
            if (-this.field7177 > var2) {
                var2 = -this.field7177;
            }
            if (this.field7177 > var2) {
                var2 = this.field7177;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field7170 = arg0;
            this.field7169 = Integer.MIN_VALUE;
            this.field7179 = -this.field7181 / arg0;
            this.field7174 = -this.field7168 / arg0;
            this.field7176 = -this.field7177 / arg0;
        }
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "([B[IIIIIIIILbs;)I")
    private static final int method2945(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class487 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field7168 += (var14 - arg3) * arg9.field7174;
        arg9.field7177 += (var14 - arg3) * arg9.field7176;
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
        arg9.field7181 = var12 >> 2;
        arg9.field7180 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!bs", name = "d", descriptor = "()I")
    public final int method639() {
        return this.field7169 == 0 && this.field7170 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!bs", name = "g", descriptor = "(I)V")
    public final synchronized void method2946(int arg0) {
        if (this.field7173 < 0) {
            this.field7173 = -arg0;
        } else {
            this.field7173 = arg0;
        }
    }

    @OriginalMember(owner = "client!bs", name = "j", descriptor = "()Z")
    private final boolean method2947() {
        int var1 = this.field7169;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method2954(var1, this.field7178);
            var2 = method2953(var1, this.field7178);
        }
        if (this.field7181 == var1 && this.field7168 == var3 && this.field7177 == var2) {
            if (this.field7169 == Integer.MIN_VALUE) {
                this.field7169 = 0;
                this.field7181 = this.field7168 = this.field7177 = 0;
                this.method1676(true);
                return true;
            } else {
                this.method2948();
                return false;
            }
        } else {
            if (this.field7181 < var1) {
                this.field7179 = 1;
                this.field7170 = var1 - this.field7181;
            } else if (this.field7181 > var1) {
                this.field7179 = -1;
                this.field7170 = this.field7181 - var1;
            } else {
                this.field7179 = 0;
            }
            if (this.field7168 < var3) {
                this.field7174 = 1;
                if (this.field7170 == 0 || this.field7170 > var3 - this.field7168) {
                    this.field7170 = var3 - this.field7168;
                }
            } else if (this.field7168 > var3) {
                this.field7174 = -1;
                if (this.field7170 == 0 || this.field7170 > this.field7168 - var3) {
                    this.field7170 = this.field7168 - var3;
                }
            } else {
                this.field7174 = 0;
            }
            if (this.field7177 < var2) {
                this.field7176 = 1;
                if (this.field7170 == 0 || this.field7170 > var2 - this.field7177) {
                    this.field7170 = var2 - this.field7177;
                }
            } else if (this.field7177 > var2) {
                this.field7176 = -1;
                if (this.field7170 == 0 || this.field7170 > this.field7177 - var2) {
                    this.field7170 = this.field7177 - var2;
                }
            } else {
                this.field7176 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!bs", name = "k", descriptor = "()V")
    private final void method2948() {
        this.field7181 = this.field7169;
        this.field7168 = method2954(this.field7169, this.field7178);
        this.field7177 = method2953(this.field7169, this.field7178);
    }

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "([B[IIIIIIIILbs;)I")
    private static final int method2949(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class487 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field7168 += (var14 - arg3) * arg9.field7174;
        arg9.field7177 += (var14 - arg3) * arg9.field7176;
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
        arg9.field7181 = var12 >> 2;
        arg9.field7180 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!bs", name = "l", descriptor = "()I")
    public final synchronized int method2950() {
        return this.field7178 < 0 ? -1 : this.field7178;
    }

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "(I[B[IIIIIIIILbs;)I")
    private static final int method2951(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class487 arg10) {
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
        arg10.field7180 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(III)V")
    public final synchronized void method2952(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method2918(arg1, arg2);
        } else {
            int var4 = method2954(arg1, arg2);
            int var5 = method2953(arg1, arg2);
            if (this.field7168 == var4 && this.field7177 == var5) {
                this.field7170 = 0;
            } else {
                int var6 = arg1 - this.field7181;
                if (this.field7181 - arg1 > var6) {
                    var6 = this.field7181 - arg1;
                }
                if (var4 - this.field7168 > var6) {
                    var6 = var4 - this.field7168;
                }
                if (this.field7168 - var4 > var6) {
                    var6 = this.field7168 - var4;
                }
                if (var5 - this.field7177 > var6) {
                    var6 = var5 - this.field7177;
                }
                if (this.field7177 - var5 > var6) {
                    var6 = this.field7177 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field7170 = arg0;
                this.field7169 = arg1;
                this.field7178 = arg2;
                this.field7179 = (arg1 - this.field7181) / arg0;
                this.field7174 = (var4 - this.field7168) / arg0;
                this.field7176 = (var5 - this.field7177) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!bs", name = "d", descriptor = "(II)I")
    private static final int method2953(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!bs", name = "e", descriptor = "(II)I")
    private static final int method2954(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!bs", name = "<init>", descriptor = "(Lwq;II)V")
    private class487(class116 arg0, int arg1, int arg2) {
        super.field3592 = arg0;
        this.field7171 = arg0.field2069;
        this.field7172 = arg0.field2070;
        this.field7182 = arg0.field2066;
        this.field7173 = arg1;
        this.field7169 = arg2;
        this.field7178 = 8192;
        this.field7180 = 0;
        this.method2948();
    }

    @OriginalMember(owner = "client!bs", name = "h", descriptor = "(I)V")
    public final synchronized void method2955(int arg0) {
        this.field7175 = arg0;
    }

    @OriginalMember(owner = "client!bs", name = "<init>", descriptor = "(Lwq;III)V")
    private class487(class116 arg0, int arg1, int arg2, int arg3) {
        super.field3592 = arg0;
        this.field7171 = arg0.field2069;
        this.field7172 = arg0.field2070;
        this.field7182 = arg0.field2066;
        this.field7173 = arg1;
        this.field7169 = arg2;
        this.field7178 = arg3;
        this.field7180 = 0;
        this.method2948();
    }
}
