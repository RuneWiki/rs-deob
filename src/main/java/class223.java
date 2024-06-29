import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class223 extends class7 {

    @OriginalMember(owner = "client!ui", name = "s", descriptor = "I")
    private int field4053;

    @OriginalMember(owner = "client!ui", name = "D", descriptor = "I")
    private int field4064;

    @OriginalMember(owner = "client!ui", name = "v", descriptor = "Z")
    private boolean field4056;

    @OriginalMember(owner = "client!ui", name = "w", descriptor = "I")
    private int field4057;

    @OriginalMember(owner = "client!ui", name = "z", descriptor = "I")
    private int field4060;

    @OriginalMember(owner = "client!ui", name = "F", descriptor = "I")
    private int field4066;

    @OriginalMember(owner = "client!ui", name = "t", descriptor = "I")
    private int field4054;

    @OriginalMember(owner = "client!ui", name = "u", descriptor = "I")
    private int field4055;

    @OriginalMember(owner = "client!ui", name = "x", descriptor = "I")
    private int field4058;

    @OriginalMember(owner = "client!ui", name = "y", descriptor = "I")
    private int field4059;

    @OriginalMember(owner = "client!ui", name = "A", descriptor = "I")
    private int field4061;

    @OriginalMember(owner = "client!ui", name = "B", descriptor = "I")
    private int field4062;

    @OriginalMember(owner = "client!ui", name = "C", descriptor = "I")
    private int field4063;

    @OriginalMember(owner = "client!ui", name = "E", descriptor = "I")
    private int field4065;

    @OriginalMember(owner = "client!ui", name = "G", descriptor = "I")
    private int field4067;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "([IIIII)I")
    private final int method1396(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field4062 <= 0) {
                if (this.field4057 == -256 && (this.field4054 & 255) == 0) {
                    if (client.field533) {
                        return method1423(0, ((class177) super.field67).field3271, arg0, this.field4054, arg1, this.field4065, this.field4061, 0, arg3, arg2, this);
                    }
                    return method1435(((class177) super.field67).field3271, arg0, this.field4054, arg1, this.field4055, 0, arg3, arg2, this);
                }
                if (client.field533) {
                    return method1422(0, 0, ((class177) super.field67).field3271, arg0, this.field4054, arg1, this.field4065, this.field4061, 0, arg3, arg2, this, this.field4057, arg4);
                }
                return method1413(0, 0, ((class177) super.field67).field3271, arg0, this.field4054, arg1, this.field4055, 0, arg3, arg2, this, this.field4057, arg4);
            }
            int var6 = this.field4062 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field4062 += arg1;
            if (this.field4057 == -256 && (this.field4054 & 255) == 0) {
                if (client.field533) {
                    arg1 = method1429(0, ((class177) super.field67).field3271, arg0, this.field4054, arg1, this.field4065, this.field4061, this.field4059, this.field4067, 0, var6, arg2, this);
                } else {
                    arg1 = method1427(((class177) super.field67).field3271, arg0, this.field4054, arg1, this.field4055, this.field4063, 0, var6, arg2, this);
                }
            } else if (client.field533) {
                arg1 = method1426(0, 0, ((class177) super.field67).field3271, arg0, this.field4054, arg1, this.field4065, this.field4061, this.field4059, this.field4067, 0, var6, arg2, this, this.field4057, arg4);
            } else {
                arg1 = method1428(0, 0, ((class177) super.field67).field3271, arg0, this.field4054, arg1, this.field4055, this.field4063, 0, var6, arg2, this, this.field4057, arg4);
            }
            this.field4062 -= arg1;
            if (this.field4062 != 0) {
                return arg1;
            }
        } while (!this.method1404());
        return arg3;
    }

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "()V")
    private final void method1397() {
        if (this.field4062 != 0) {
            if (this.field4060 == Integer.MIN_VALUE) {
                this.field4060 = 0;
            }
            this.field4062 = 0;
            this.method1400();
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(II[B[IIIIIIILui;II)I")
    private static final int method1398(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class223 arg10, int arg11, int arg12) {
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
        arg10.field4054 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(II)V")
    private final synchronized void method1399(int arg0, int arg1) {
        this.field4060 = arg0;
        this.field4066 = arg1;
        this.field4062 = 0;
        this.method1400();
    }

    @OriginalMember(owner = "client!ui", name = "f", descriptor = "()V")
    private final void method1400() {
        this.field4055 = this.field4060;
        this.field4065 = method1412(this.field4060, this.field4066);
        this.field4061 = method1419(this.field4060, this.field4066);
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(II)V")
    public final synchronized void method1401(int arg0, int arg1) {
        this.method1408(arg0, arg1, this.method1425());
    }

    @OriginalMember(owner = "client!ui", name = "g", descriptor = "()I")
    public final synchronized int method1402() {
        return this.field4060 == Integer.MIN_VALUE ? 0 : this.field4060;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(I[B[IIIIIIIIIILui;)I")
    private static final int method1403(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class223 arg12) {
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
        arg12.field4055 += (var19 - arg4) * arg12.field4063;
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
        arg12.field4065 = var15 >> 2;
        arg12.field4061 = var16 >> 2;
        arg12.field4054 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "(I)V")
    public final synchronized void method27(int arg0) {
        if (this.field4062 > 0) {
            if (arg0 >= this.field4062) {
                if (this.field4060 == Integer.MIN_VALUE) {
                    this.field4060 = 0;
                    this.field4055 = this.field4065 = this.field4061 = 0;
                    this.method995((byte) -59);
                    arg0 = this.field4062;
                }
                this.field4062 = 0;
                this.method1400();
            } else {
                this.field4055 += this.field4063 * arg0;
                this.field4065 += this.field4059 * arg0;
                this.field4061 += this.field4067 * arg0;
                this.field4062 -= arg0;
            }
        }
        class177 var2 = (class177) super.field67;
        int var3 = this.field4053 << 8;
        int var4 = this.field4064 << 8;
        int var5 = var2.field3271.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field4058 = 0;
        }
        if (this.field4054 < 0) {
            if (this.field4057 <= 0) {
                this.method1397();
                this.method995((byte) 123);
                return;
            }
            this.field4054 = 0;
        }
        if (this.field4054 >= var5) {
            if (this.field4057 >= 0) {
                this.method1397();
                this.method995((byte) -69);
                return;
            }
            this.field4054 = var5 - 1;
        }
        this.field4054 += this.field4057 * arg0;
        if (this.field4058 < 0) {
            if (!this.field4056) {
                if (this.field4057 < 0) {
                    if (this.field4054 < var3) {
                        this.field4054 = var4 - 1 - (var4 - 1 - this.field4054) % var6;
                    }
                } else if (this.field4054 >= var4) {
                    this.field4054 = (this.field4054 - var3) % var6 + var3;
                }
            } else {
                if (this.field4057 < 0) {
                    if (this.field4054 >= var3) {
                        return;
                    }
                    this.field4054 = var3 + var3 - 1 - this.field4054;
                    this.field4057 = -this.field4057;
                }
                while (this.field4054 >= var4) {
                    this.field4054 = var4 + var4 - 1 - this.field4054;
                    this.field4057 = -this.field4057;
                    if (this.field4054 >= var3) {
                        return;
                    }
                    this.field4054 = var3 + var3 - 1 - this.field4054;
                    this.field4057 = -this.field4057;
                }
            }
        } else {
            if (this.field4058 > 0) {
                if (this.field4056) {
                    label125: {
                        if (this.field4057 < 0) {
                            if (this.field4054 >= var3) {
                                return;
                            }
                            this.field4054 = var3 + var3 - 1 - this.field4054;
                            this.field4057 = -this.field4057;
                            if (--this.field4058 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field4054 < var4) {
                                return;
                            }
                            this.field4054 = var4 + var4 - 1 - this.field4054;
                            this.field4057 = -this.field4057;
                            if (--this.field4058 == 0) {
                                break;
                            }
                            if (this.field4054 >= var3) {
                                return;
                            }
                            this.field4054 = var3 + var3 - 1 - this.field4054;
                            this.field4057 = -this.field4057;
                        } while (--this.field4058 != 0);
                    }
                } else if (this.field4057 < 0) {
                    if (this.field4054 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field4054) / var6;
                    if (var7 < this.field4058) {
                        this.field4054 += var6 * var7;
                        this.field4058 -= var7;
                        return;
                    }
                    this.field4054 += this.field4058 * var6;
                    this.field4058 = 0;
                } else {
                    if (this.field4054 < var4) {
                        return;
                    }
                    int var8 = (this.field4054 - var3) / var6;
                    if (var8 < this.field4058) {
                        this.field4054 -= var6 * var8;
                        this.field4058 -= var8;
                        return;
                    }
                    this.field4054 -= this.field4058 * var6;
                    this.field4058 = 0;
                }
            }
            if (this.field4057 < 0) {
                if (this.field4054 < 0) {
                    this.field4054 = -1;
                    this.method1397();
                    this.method995((byte) 109);
                    return;
                }
            } else if (this.field4054 >= var5) {
                this.field4054 = var5;
                this.method1397();
                this.method995((byte) -49);
            }
        }
    }

    @OriginalMember(owner = "client!ui", name = "h", descriptor = "()Z")
    private final boolean method1404() {
        int var1 = this.field4060;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1412(var1, this.field4066);
            var2 = method1419(var1, this.field4066);
        }
        if (this.field4055 == var1 && this.field4065 == var3 && this.field4061 == var2) {
            if (this.field4060 == Integer.MIN_VALUE) {
                this.field4060 = 0;
                this.field4055 = this.field4065 = this.field4061 = 0;
                this.method995((byte) -109);
                return true;
            } else {
                this.method1400();
                return false;
            }
        } else {
            if (this.field4055 < var1) {
                this.field4063 = 1;
                this.field4062 = var1 - this.field4055;
            } else if (this.field4055 > var1) {
                this.field4063 = -1;
                this.field4062 = this.field4055 - var1;
            } else {
                this.field4063 = 0;
            }
            if (this.field4065 < var3) {
                this.field4059 = 1;
                if (this.field4062 == 0 || this.field4062 > var3 - this.field4065) {
                    this.field4062 = var3 - this.field4065;
                }
            } else if (this.field4065 > var3) {
                this.field4059 = -1;
                if (this.field4062 == 0 || this.field4062 > this.field4065 - var3) {
                    this.field4062 = this.field4065 - var3;
                }
            } else {
                this.field4059 = 0;
            }
            if (this.field4061 < var2) {
                this.field4067 = 1;
                if (this.field4062 == 0 || this.field4062 > var2 - this.field4061) {
                    this.field4062 = var2 - this.field4061;
                }
            } else if (this.field4061 > var2) {
                this.field4067 = -1;
                if (this.field4062 == 0 || this.field4062 > this.field4061 - var2) {
                    this.field4062 = this.field4061 - var2;
                }
            } else {
                this.field4067 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "(I)V")
    public final synchronized void method1405(int arg0) {
        if (arg0 == 0) {
            this.method1420(0);
            this.method995((byte) -21);
        } else if (this.field4065 == 0 && this.field4061 == 0) {
            this.field4062 = 0;
            this.field4060 = 0;
            this.field4055 = 0;
            this.method995((byte) -11);
        } else {
            int var2 = -this.field4055;
            if (this.field4055 > var2) {
                var2 = this.field4055;
            }
            if (-this.field4065 > var2) {
                var2 = -this.field4065;
            }
            if (this.field4065 > var2) {
                var2 = this.field4065;
            }
            if (-this.field4061 > var2) {
                var2 = -this.field4061;
            }
            if (this.field4061 > var2) {
                var2 = this.field4061;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field4062 = arg0;
            this.field4060 = Integer.MIN_VALUE;
            this.field4063 = -this.field4055 / arg0;
            this.field4059 = -this.field4065 / arg0;
            this.field4067 = -this.field4061 / arg0;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lqc;II)Lui;")
    public static final class223 method1406(class177 arg0, int arg1, int arg2) {
        return arg0.field3271 != null && arg0.field3271.length != 0 ? new class223(arg0, (int) ((long) arg0.field3272 * 256L * (long) arg1 / (long) (class96.field1728 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!ui", name = "i", descriptor = "()I")
    public final synchronized int method1407() {
        return this.field4057 < 0 ? -this.field4057 : this.field4057;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(III)V")
    public final synchronized void method1408(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1399(arg1, arg2);
        } else {
            int var4 = method1412(arg1, arg2);
            int var5 = method1419(arg1, arg2);
            if (this.field4065 == var4 && this.field4061 == var5) {
                this.field4062 = 0;
            } else {
                int var6 = arg1 - this.field4055;
                if (this.field4055 - arg1 > var6) {
                    var6 = this.field4055 - arg1;
                }
                if (var4 - this.field4065 > var6) {
                    var6 = var4 - this.field4065;
                }
                if (this.field4065 - var4 > var6) {
                    var6 = this.field4065 - var4;
                }
                if (var5 - this.field4061 > var6) {
                    var6 = var5 - this.field4061;
                }
                if (this.field4061 - var5 > var6) {
                    var6 = this.field4061 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field4062 = arg0;
                this.field4060 = arg1;
                this.field4066 = arg2;
                this.field4063 = (arg1 - this.field4055) / arg0;
                this.field4059 = (var4 - this.field4065) / arg0;
                this.field4067 = (var5 - this.field4061) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "()I")
    public final int method29() {
        int var1 = this.field4055 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field4058 == 0) {
            var2 -= this.field4054 * var2 / (((class177) super.field67).field3271.length << 8);
        } else if (this.field4058 >= 0) {
            var2 -= this.field4053 * var2 / ((class177) super.field67).field3271.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "(I)V")
    public final synchronized void method1409(int arg0) {
        int var2 = ((class177) super.field67).field3271.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field4054 = arg0;
    }

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "()I")
    public final int method26() {
        return this.field4060 == 0 && this.field4062 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!ui", name = "j", descriptor = "()Z")
    public final boolean method1410() {
        return this.field4062 != 0;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "([B[IIIIIIILui;)I")
    private static final int method1411(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class223 arg8) {
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
        arg8.field4054 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "(II)I")
    private static final int method1412(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(II[B[IIIIIIILui;II)I")
    private static final int method1413(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class223 arg10, int arg11, int arg12) {
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
        arg10.field4054 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "([IIIII)I")
    private final int method1414(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field4062 <= 0) {
                if (this.field4057 == 256 && (this.field4054 & 255) == 0) {
                    if (client.field533) {
                        return method1415(0, ((class177) super.field67).field3271, arg0, this.field4054, arg1, this.field4065, this.field4061, 0, arg3, arg2, this);
                    }
                    return method1411(((class177) super.field67).field3271, arg0, this.field4054, arg1, this.field4055, 0, arg3, arg2, this);
                }
                if (client.field533) {
                    return method1424(0, 0, ((class177) super.field67).field3271, arg0, this.field4054, arg1, this.field4065, this.field4061, 0, arg3, arg2, this, this.field4057, arg4);
                }
                return method1398(0, 0, ((class177) super.field67).field3271, arg0, this.field4054, arg1, this.field4055, 0, arg3, arg2, this, this.field4057, arg4);
            }
            int var6 = this.field4062 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field4062 += arg1;
            if (this.field4057 == 256 && (this.field4054 & 255) == 0) {
                if (client.field533) {
                    arg1 = method1403(0, ((class177) super.field67).field3271, arg0, this.field4054, arg1, this.field4065, this.field4061, this.field4059, this.field4067, 0, var6, arg2, this);
                } else {
                    arg1 = method1434(((class177) super.field67).field3271, arg0, this.field4054, arg1, this.field4055, this.field4063, 0, var6, arg2, this);
                }
            } else if (client.field533) {
                arg1 = method1416(0, 0, ((class177) super.field67).field3271, arg0, this.field4054, arg1, this.field4065, this.field4061, this.field4059, this.field4067, 0, var6, arg2, this, this.field4057, arg4);
            } else {
                arg1 = method1418(0, 0, ((class177) super.field67).field3271, arg0, this.field4054, arg1, this.field4055, this.field4063, 0, var6, arg2, this, this.field4057, arg4);
            }
            this.field4062 -= arg1;
            if (this.field4062 != 0) {
                return arg1;
            }
        } while (!this.method1404());
        return arg3;
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "([III)V")
    public final synchronized void method30(int[] arg0, int arg1, int arg2) {
        if (this.field4060 == 0 && this.field4062 == 0) {
            this.method27(arg2);
        } else {
            class177 var4 = (class177) super.field67;
            int var5 = this.field4053 << 8;
            int var6 = this.field4064 << 8;
            int var7 = var4.field3271.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field4058 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field4054 < 0) {
                if (this.field4057 <= 0) {
                    this.method1397();
                    this.method995((byte) -124);
                    return;
                }
                this.field4054 = 0;
            }
            if (this.field4054 >= var7) {
                if (this.field4057 >= 0) {
                    this.method1397();
                    this.method995((byte) 127);
                    return;
                }
                this.field4054 = var7 - 1;
            }
            if (this.field4058 < 0) {
                if (this.field4056) {
                    if (this.field4057 < 0) {
                        var9 = this.method1396(arg0, arg1, var5, var10, var4.field3271[this.field4053]);
                        if (this.field4054 >= var5) {
                            return;
                        }
                        this.field4054 = var5 + var5 - 1 - this.field4054;
                        this.field4057 = -this.field4057;
                    }
                    while (true) {
                        int var11 = this.method1414(arg0, var9, var6, var10, var4.field3271[this.field4064 - 1]);
                        if (this.field4054 < var6) {
                            return;
                        }
                        this.field4054 = var6 + var6 - 1 - this.field4054;
                        this.field4057 = -this.field4057;
                        var9 = this.method1396(arg0, var11, var5, var10, var4.field3271[this.field4053]);
                        if (this.field4054 >= var5) {
                            return;
                        }
                        this.field4054 = var5 + var5 - 1 - this.field4054;
                        this.field4057 = -this.field4057;
                    }
                } else if (this.field4057 < 0) {
                    while (true) {
                        var9 = this.method1396(arg0, var9, var5, var10, var4.field3271[this.field4064 - 1]);
                        if (this.field4054 >= var5) {
                            return;
                        }
                        this.field4054 = var6 - 1 - (var6 - 1 - this.field4054) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method1414(arg0, var9, var6, var10, var4.field3271[this.field4053]);
                        if (this.field4054 < var6) {
                            return;
                        }
                        this.field4054 = (this.field4054 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field4058 > 0) {
                    if (this.field4056) {
                        label130: {
                            if (this.field4057 < 0) {
                                var9 = this.method1396(arg0, arg1, var5, var10, var4.field3271[this.field4053]);
                                if (this.field4054 >= var5) {
                                    return;
                                }
                                this.field4054 = var5 + var5 - 1 - this.field4054;
                                this.field4057 = -this.field4057;
                                if (--this.field4058 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method1414(arg0, var9, var6, var10, var4.field3271[this.field4064 - 1]);
                                if (this.field4054 < var6) {
                                    return;
                                }
                                this.field4054 = var6 + var6 - 1 - this.field4054;
                                this.field4057 = -this.field4057;
                                if (--this.field4058 == 0) {
                                    break;
                                }
                                var9 = this.method1396(arg0, var9, var5, var10, var4.field3271[this.field4053]);
                                if (this.field4054 >= var5) {
                                    return;
                                }
                                this.field4054 = var5 + var5 - 1 - this.field4054;
                                this.field4057 = -this.field4057;
                            } while (--this.field4058 != 0);
                        }
                    } else if (this.field4057 < 0) {
                        while (true) {
                            var9 = this.method1396(arg0, var9, var5, var10, var4.field3271[this.field4064 - 1]);
                            if (this.field4054 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field4054) / var8;
                            if (var12 >= this.field4058) {
                                this.field4054 += this.field4058 * var8;
                                this.field4058 = 0;
                                break;
                            }
                            this.field4054 += var8 * var12;
                            this.field4058 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method1414(arg0, var9, var6, var10, var4.field3271[this.field4053]);
                            if (this.field4054 < var6) {
                                return;
                            }
                            int var13 = (this.field4054 - var5) / var8;
                            if (var13 >= this.field4058) {
                                this.field4054 -= this.field4058 * var8;
                                this.field4058 = 0;
                                break;
                            }
                            this.field4054 -= var8 * var13;
                            this.field4058 -= var13;
                        }
                    }
                }
                if (this.field4057 < 0) {
                    this.method1396(arg0, var9, 0, var10, 0);
                    if (this.field4054 < 0) {
                        this.field4054 = -1;
                        this.method1397();
                        this.method995((byte) 94);
                        return;
                    }
                } else {
                    this.method1414(arg0, var9, var7, var10, 0);
                    if (this.field4054 >= var7) {
                        this.field4054 = var7;
                        this.method1397();
                        this.method995((byte) 125);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(I[B[IIIIIIIILui;)I")
    private static final int method1415(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class223 arg10) {
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
        arg10.field4054 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(II[B[IIIIIIIIIILui;II)I")
    private static final int method1416(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class223 arg13, int arg14, int arg15) {
        arg13.field4055 -= arg13.field4063 * arg5;
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
        arg13.field4055 += arg13.field4063 * var22;
        arg13.field4065 = arg6;
        arg13.field4061 = arg7;
        arg13.field4054 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lqc;III)Lui;")
    public static final class223 method1417(class177 arg0, int arg1, int arg2, int arg3) {
        return arg0.field3271 != null && arg0.field3271.length != 0 ? new class223(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "()Laf;")
    public final class7 method24() {
        return null;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(II[B[IIIIIIIILui;II)I")
    private static final int method1418(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class223 arg11, int arg12, int arg13) {
        arg11.field4065 -= arg11.field4059 * arg5;
        arg11.field4061 -= arg11.field4067 * arg5;
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
        arg11.field4065 += arg11.field4059 * arg5;
        arg11.field4061 += arg11.field4067 * arg5;
        arg11.field4055 = arg6;
        arg11.field4054 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "(II)I")
    private static final int method1419(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!ui", name = "f", descriptor = "(I)V")
    private final synchronized void method1420(int arg0) {
        this.method1399(arg0, this.method1425());
    }

    @OriginalMember(owner = "client!ui", name = "g", descriptor = "(I)V")
    public final synchronized void method1421(int arg0) {
        this.method1399(arg0 << 6, this.method1425());
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(II[B[IIIIIIIILui;II)I")
    private static final int method1422(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class223 arg11, int arg12, int arg13) {
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
        arg11.field4054 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(I[B[IIIIIIIILui;)I")
    private static final int method1423(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class223 arg10) {
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
        arg10.field4054 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "(II[B[IIIIIIIILui;II)I")
    private static final int method1424(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class223 arg11, int arg12, int arg13) {
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
        arg11.field4054 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!ui", name = "k", descriptor = "()I")
    public final synchronized int method1425() {
        return this.field4066 < 0 ? -1 : this.field4066;
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(II[B[IIIIIIIIIILui;II)I")
    private static final int method1426(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class223 arg13, int arg14, int arg15) {
        arg13.field4055 -= arg13.field4063 * arg5;
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
        arg13.field4055 += arg13.field4063 * var22;
        arg13.field4065 = arg6;
        arg13.field4061 = arg7;
        arg13.field4054 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "([B[IIIIIIIILui;)I")
    private static final int method1427(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class223 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field4065 += (var14 - arg3) * arg9.field4059;
        arg9.field4061 += (var14 - arg3) * arg9.field4067;
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
        arg9.field4055 = var12 >> 2;
        arg9.field4054 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "(II[B[IIIIIIIILui;II)I")
    private static final int method1428(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class223 arg11, int arg12, int arg13) {
        arg11.field4065 -= arg11.field4059 * arg5;
        arg11.field4061 -= arg11.field4067 * arg5;
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
        arg11.field4065 += arg11.field4059 * arg5;
        arg11.field4061 += arg11.field4067 * arg5;
        arg11.field4055 = arg6;
        arg11.field4054 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(I[B[IIIIIIIIIILui;)I")
    private static final int method1429(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class223 arg12) {
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
        arg12.field4055 += (var19 - arg4) * arg12.field4063;
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
        arg12.field4065 = var15 >> 2;
        arg12.field4061 = var16 >> 2;
        arg12.field4054 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!ui", name = "h", descriptor = "(I)V")
    public final synchronized void method1430(int arg0) {
        this.field4058 = arg0;
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "()Laf;")
    public final class7 method25() {
        return null;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Z)V")
    public final synchronized void method1431(boolean arg0) {
        this.field4057 = (this.field4057 >>> 31) + (this.field4057 ^ this.field4057 >> 31);
        if (arg0) {
            this.field4057 = -this.field4057;
        }
    }

    @OriginalMember(owner = "client!ui", name = "l", descriptor = "()Z")
    public final boolean method1432() {
        return this.field4054 < 0 || this.field4054 >= ((class177) super.field67).field3271.length << 8;
    }

    @OriginalMember(owner = "client!ui", name = "i", descriptor = "(I)V")
    public final synchronized void method1433(int arg0) {
        if (this.field4057 < 0) {
            this.field4057 = -arg0;
        } else {
            this.field4057 = arg0;
        }
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "([B[IIIIIIIILui;)I")
    private static final int method1434(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class223 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field4065 += (var14 - arg3) * arg9.field4059;
        arg9.field4061 += (var14 - arg3) * arg9.field4067;
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
        arg9.field4055 = var12 >> 2;
        arg9.field4054 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "([B[IIIIIIILui;)I")
    private static final int method1435(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class223 arg8) {
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
        arg8.field4054 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(Lqc;II)V")
    private class223(class177 arg0, int arg1, int arg2) {
        super.field67 = arg0;
        this.field4053 = arg0.field3274;
        this.field4064 = arg0.field3275;
        this.field4056 = arg0.field3273;
        this.field4057 = arg1;
        this.field4060 = arg2;
        this.field4066 = 8192;
        this.field4054 = 0;
        this.method1400();
    }

    @OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(Lqc;III)V")
    private class223(class177 arg0, int arg1, int arg2, int arg3) {
        super.field67 = arg0;
        this.field4053 = arg0.field3274;
        this.field4064 = arg0.field3275;
        this.field4056 = arg0.field3273;
        this.field4057 = arg1;
        this.field4060 = arg2;
        this.field4066 = arg3;
        this.field4054 = 0;
        this.method1400();
    }
}
