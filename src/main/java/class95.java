import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ps")
public class class95 extends class241 {

    @OriginalMember(owner = "client!ps", name = "t", descriptor = "I")
    private int field1001;

    @OriginalMember(owner = "client!ps", name = "u", descriptor = "I")
    private int field1002;

    @OriginalMember(owner = "client!ps", name = "w", descriptor = "Z")
    private boolean field1004;

    @OriginalMember(owner = "client!ps", name = "v", descriptor = "I")
    private int field1003;

    @OriginalMember(owner = "client!ps", name = "z", descriptor = "I")
    private int field1007;

    @OriginalMember(owner = "client!ps", name = "o", descriptor = "I")
    private int field996;

    @OriginalMember(owner = "client!ps", name = "r", descriptor = "I")
    private int field999;

    @OriginalMember(owner = "client!ps", name = "s", descriptor = "I")
    private int field1000;

    @OriginalMember(owner = "client!ps", name = "x", descriptor = "I")
    private int field1005;

    @OriginalMember(owner = "client!ps", name = "y", descriptor = "I")
    private int field1006;

    @OriginalMember(owner = "client!ps", name = "A", descriptor = "I")
    private int field1008;

    @OriginalMember(owner = "client!ps", name = "B", descriptor = "I")
    private int field1009;

    @OriginalMember(owner = "client!ps", name = "n", descriptor = "I")
    private int field995;

    @OriginalMember(owner = "client!ps", name = "p", descriptor = "I")
    private int field997;

    @OriginalMember(owner = "client!ps", name = "q", descriptor = "I")
    private int field998;

    @OriginalMember(owner = "client!ps", name = "e", descriptor = "()I")
    public final synchronized int method636() {
        return this.field996 < 0 ? -1 : this.field996;
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(II)I")
    private static final int method637(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!ps", name = "f", descriptor = "()Z")
    private final boolean method638() {
        int var1 = this.field1007;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method671(var1, this.field996);
            var2 = method637(var1, this.field996);
        }
        if (this.field998 == var1 && this.field1000 == var3 && this.field1006 == var2) {
            if (this.field1007 == Integer.MIN_VALUE) {
                this.field1007 = 0;
                this.field998 = this.field1000 = this.field1006 = 0;
                this.method864(12983);
                return true;
            } else {
                this.method661();
                return false;
            }
        } else {
            if (this.field998 < var1) {
                this.field995 = 1;
                this.field1005 = var1 - this.field998;
            } else if (this.field998 > var1) {
                this.field995 = -1;
                this.field1005 = this.field998 - var1;
            } else {
                this.field995 = 0;
            }
            if (this.field1000 < var3) {
                this.field1008 = 1;
                if (this.field1005 == 0 || this.field1005 > var3 - this.field1000) {
                    this.field1005 = var3 - this.field1000;
                }
            } else if (this.field1000 > var3) {
                this.field1008 = -1;
                if (this.field1005 == 0 || this.field1005 > this.field1000 - var3) {
                    this.field1005 = this.field1000 - var3;
                }
            } else {
                this.field1008 = 0;
            }
            if (this.field1006 < var2) {
                this.field1009 = 1;
                if (this.field1005 == 0 || this.field1005 > var2 - this.field1006) {
                    this.field1005 = var2 - this.field1006;
                }
            } else if (this.field1006 > var2) {
                this.field1009 = -1;
                if (this.field1005 == 0 || this.field1005 > this.field1006 - var2) {
                    this.field1005 = this.field1006 - var2;
                }
            } else {
                this.field1009 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(I[B[IIIIIIIILps;)I")
    private static final int method639(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class95 arg10) {
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
        arg10.field999 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!ps", name = "c", descriptor = "()I")
    public final int method640() {
        int var1 = this.field998 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field997 == 0) {
            var2 -= this.field999 * var2 / (((class548) super.field2875).field7873.length << 8);
        } else if (this.field997 >= 0) {
            var2 -= this.field1001 * var2 / ((class548) super.field2875).field7873.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!ps", name = "b", descriptor = "(I)V")
    public final synchronized void method641(int arg0) {
        if (arg0 == 0) {
            this.method664(0);
            this.method864(12983);
        } else if (this.field1000 == 0 && this.field1006 == 0) {
            this.field1005 = 0;
            this.field1007 = 0;
            this.field998 = 0;
            this.method864(12983);
        } else {
            int var2 = -this.field998;
            if (this.field998 > var2) {
                var2 = this.field998;
            }
            if (-this.field1000 > var2) {
                var2 = -this.field1000;
            }
            if (this.field1000 > var2) {
                var2 = this.field1000;
            }
            if (-this.field1006 > var2) {
                var2 = -this.field1006;
            }
            if (this.field1006 > var2) {
                var2 = this.field1006;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1005 = arg0;
            this.field1007 = Integer.MIN_VALUE;
            this.field995 = -this.field998 / arg0;
            this.field1008 = -this.field1000 / arg0;
            this.field1009 = -this.field1006 / arg0;
        }
    }

    @OriginalMember(owner = "client!ps", name = "g", descriptor = "()V")
    private final void method642() {
        if (this.field1005 != 0) {
            if (this.field1007 == Integer.MIN_VALUE) {
                this.field1007 = 0;
            }
            this.field1005 = 0;
            this.method661();
        }
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "([B[IIIIIIIILps;)I")
    private static final int method643(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class95 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1000 += (var14 - arg3) * arg9.field1008;
        arg9.field1006 += (var14 - arg3) * arg9.field1009;
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
        arg9.field998 = var12 >> 2;
        arg9.field999 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ps", name = "b", descriptor = "(II)V")
    public final synchronized void method644(int arg0, int arg1) {
        this.method654(arg0, arg1, this.method636());
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "([B[IIIIIIILps;)I")
    private static final int method645(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class95 arg8) {
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
        arg8.field999 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ps", name = "h", descriptor = "()I")
    public final synchronized int method646() {
        return this.field1003 < 0 ? -this.field1003 : this.field1003;
    }

    @OriginalMember(owner = "client!ps", name = "i", descriptor = "()Z")
    public final boolean method647() {
        return this.field1005 != 0;
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(II[B[IIIIIIILps;II)I")
    private static final int method648(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class95 arg10, int arg11, int arg12) {
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
        arg10.field999 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(I)V")
    public final synchronized void method649(int arg0) {
        if (this.field1005 > 0) {
            if (arg0 >= this.field1005) {
                if (this.field1007 == Integer.MIN_VALUE) {
                    this.field1007 = 0;
                    this.field998 = this.field1000 = this.field1006 = 0;
                    this.method864(12983);
                    arg0 = this.field1005;
                }
                this.field1005 = 0;
                this.method661();
            } else {
                this.field998 += this.field995 * arg0;
                this.field1000 += this.field1008 * arg0;
                this.field1006 += this.field1009 * arg0;
                this.field1005 -= arg0;
            }
        }
        class548 var2 = (class548) super.field2875;
        int var3 = this.field1001 << 8;
        int var4 = this.field1002 << 8;
        int var5 = var2.field7873.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field997 = 0;
        }
        if (this.field999 < 0) {
            if (this.field1003 <= 0) {
                this.method642();
                this.method864(12983);
                return;
            }
            this.field999 = 0;
        }
        if (this.field999 >= var5) {
            if (this.field1003 >= 0) {
                this.method642();
                this.method864(12983);
                return;
            }
            this.field999 = var5 - 1;
        }
        this.field999 += this.field1003 * arg0;
        if (this.field997 < 0) {
            if (!this.field1004) {
                if (this.field1003 < 0) {
                    if (this.field999 < var3) {
                        this.field999 = var4 - 1 - (var4 - 1 - this.field999) % var6;
                    }
                } else if (this.field999 >= var4) {
                    this.field999 = (this.field999 - var3) % var6 + var3;
                }
            } else {
                if (this.field1003 < 0) {
                    if (this.field999 >= var3) {
                        return;
                    }
                    this.field999 = var3 + var3 - 1 - this.field999;
                    this.field1003 = -this.field1003;
                }
                while (this.field999 >= var4) {
                    this.field999 = var4 + var4 - 1 - this.field999;
                    this.field1003 = -this.field1003;
                    if (this.field999 >= var3) {
                        return;
                    }
                    this.field999 = var3 + var3 - 1 - this.field999;
                    this.field1003 = -this.field1003;
                }
            }
        } else {
            if (this.field997 > 0) {
                if (this.field1004) {
                    label125: {
                        if (this.field1003 < 0) {
                            if (this.field999 >= var3) {
                                return;
                            }
                            this.field999 = var3 + var3 - 1 - this.field999;
                            this.field1003 = -this.field1003;
                            if (--this.field997 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field999 < var4) {
                                return;
                            }
                            this.field999 = var4 + var4 - 1 - this.field999;
                            this.field1003 = -this.field1003;
                            if (--this.field997 == 0) {
                                break;
                            }
                            if (this.field999 >= var3) {
                                return;
                            }
                            this.field999 = var3 + var3 - 1 - this.field999;
                            this.field1003 = -this.field1003;
                        } while (--this.field997 != 0);
                    }
                } else if (this.field1003 < 0) {
                    if (this.field999 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field999) / var6;
                    if (var7 < this.field997) {
                        this.field999 += var6 * var7;
                        this.field997 -= var7;
                        return;
                    }
                    this.field999 += this.field997 * var6;
                    this.field997 = 0;
                } else {
                    if (this.field999 < var4) {
                        return;
                    }
                    int var8 = (this.field999 - var3) / var6;
                    if (var8 < this.field997) {
                        this.field999 -= var6 * var8;
                        this.field997 -= var8;
                        return;
                    }
                    this.field999 -= this.field997 * var6;
                    this.field997 = 0;
                }
            }
            if (this.field1003 < 0) {
                if (this.field999 < 0) {
                    this.field999 = -1;
                    this.method642();
                    this.method864(12983);
                    return;
                }
            } else if (this.field999 >= var5) {
                this.field999 = var5;
                this.method642();
                this.method864(12983);
            }
        }
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "([IIIII)I")
    private final int method650(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field1005 <= 0) {
                if (this.field1003 == -256 && (this.field999 & 255) == 0) {
                    if (class54.field556) {
                        return method639(0, ((class548) super.field2875).field7873, arg0, this.field999, arg1, this.field1000, this.field1006, 0, arg3, arg2, this);
                    }
                    return method645(((class548) super.field2875).field7873, arg0, this.field999, arg1, this.field998, 0, arg3, arg2, this);
                }
                if (class54.field556) {
                    return method653(0, 0, ((class548) super.field2875).field7873, arg0, this.field999, arg1, this.field1000, this.field1006, 0, arg3, arg2, this, this.field1003, arg4);
                }
                return method667(0, 0, ((class548) super.field2875).field7873, arg0, this.field999, arg1, this.field998, 0, arg3, arg2, this, this.field1003, arg4);
            }
            int var6 = this.field1005 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field1005 += arg1;
            if (this.field1003 == -256 && (this.field999 & 255) == 0) {
                if (class54.field556) {
                    arg1 = method670(0, ((class548) super.field2875).field7873, arg0, this.field999, arg1, this.field1000, this.field1006, this.field1008, this.field1009, 0, var6, arg2, this);
                } else {
                    arg1 = method643(((class548) super.field2875).field7873, arg0, this.field999, arg1, this.field998, this.field995, 0, var6, arg2, this);
                }
            } else if (class54.field556) {
                arg1 = method655(0, 0, ((class548) super.field2875).field7873, arg0, this.field999, arg1, this.field1000, this.field1006, this.field1008, this.field1009, 0, var6, arg2, this, this.field1003, arg4);
            } else {
                arg1 = method676(0, 0, ((class548) super.field2875).field7873, arg0, this.field999, arg1, this.field998, this.field995, 0, var6, arg2, this, this.field1003, arg4);
            }
            this.field1005 -= arg1;
            if (this.field1005 != 0) {
                return arg1;
            }
        } while (!this.method638());
        return arg3;
    }

    @OriginalMember(owner = "client!ps", name = "f", descriptor = "(I)V")
    public final synchronized void method651(int arg0) {
        this.method675(this.method663(), arg0);
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(Z)V")
    public final synchronized void method652(boolean arg0) {
        this.field1003 = (this.field1003 >>> 31) + (this.field1003 ^ this.field1003 >> 31);
        if (arg0) {
            this.field1003 = -this.field1003;
        }
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(II[B[IIIIIIIILps;II)I")
    private static final int method653(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class95 arg11, int arg12, int arg13) {
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
        arg11.field999 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(III)V")
    public final synchronized void method654(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method675(arg1, arg2);
        } else {
            int var4 = method671(arg1, arg2);
            int var5 = method637(arg1, arg2);
            if (this.field1000 == var4 && this.field1006 == var5) {
                this.field1005 = 0;
            } else {
                int var6 = arg1 - this.field998;
                if (this.field998 - arg1 > var6) {
                    var6 = this.field998 - arg1;
                }
                if (var4 - this.field1000 > var6) {
                    var6 = var4 - this.field1000;
                }
                if (this.field1000 - var4 > var6) {
                    var6 = this.field1000 - var4;
                }
                if (var5 - this.field1006 > var6) {
                    var6 = var5 - this.field1006;
                }
                if (this.field1006 - var5 > var6) {
                    var6 = this.field1006 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field1005 = arg0;
                this.field1007 = arg1;
                this.field996 = arg2;
                this.field995 = (arg1 - this.field998) / arg0;
                this.field1008 = (var4 - this.field1000) / arg0;
                this.field1009 = (var5 - this.field1006) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(II[B[IIIIIIIIIILps;II)I")
    private static final int method655(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class95 arg13, int arg14, int arg15) {
        arg13.field998 -= arg13.field995 * arg5;
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
        arg13.field998 += arg13.field995 * var22;
        arg13.field1000 = arg6;
        arg13.field1006 = arg7;
        arg13.field999 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!ps", name = "g", descriptor = "(I)V")
    public final synchronized void method656(int arg0) {
        this.field997 = arg0;
    }

    @OriginalMember(owner = "client!ps", name = "h", descriptor = "(I)V")
    public final synchronized void method657(int arg0) {
        if (this.field1003 < 0) {
            this.field1003 = -arg0;
        } else {
            this.field1003 = arg0;
        }
    }

    @OriginalMember(owner = "client!ps", name = "b", descriptor = "(II[B[IIIIIIIILps;II)I")
    private static final int method658(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class95 arg11, int arg12, int arg13) {
        arg11.field1000 -= arg11.field1008 * arg5;
        arg11.field1006 -= arg11.field1009 * arg5;
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
        arg11.field1000 += arg11.field1008 * arg5;
        arg11.field1006 += arg11.field1009 * arg5;
        arg11.field998 = arg6;
        arg11.field999 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "([III)V")
    public final synchronized void method659(int[] arg0, int arg1, int arg2) {
        if (this.field1007 == 0 && this.field1005 == 0) {
            this.method649(arg2);
        } else {
            class548 var4 = (class548) super.field2875;
            int var5 = this.field1001 << 8;
            int var6 = this.field1002 << 8;
            int var7 = var4.field7873.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field997 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field999 < 0) {
                if (this.field1003 <= 0) {
                    this.method642();
                    this.method864(12983);
                    return;
                }
                this.field999 = 0;
            }
            if (this.field999 >= var7) {
                if (this.field1003 >= 0) {
                    this.method642();
                    this.method864(12983);
                    return;
                }
                this.field999 = var7 - 1;
            }
            if (this.field997 < 0) {
                if (this.field1004) {
                    if (this.field1003 < 0) {
                        var9 = this.method650(arg0, arg1, var5, var10, var4.field7873[this.field1001]);
                        if (this.field999 >= var5) {
                            return;
                        }
                        this.field999 = var5 + var5 - 1 - this.field999;
                        this.field1003 = -this.field1003;
                    }
                    while (true) {
                        int var11 = this.method679(arg0, var9, var6, var10, var4.field7873[this.field1002 - 1]);
                        if (this.field999 < var6) {
                            return;
                        }
                        this.field999 = var6 + var6 - 1 - this.field999;
                        this.field1003 = -this.field1003;
                        var9 = this.method650(arg0, var11, var5, var10, var4.field7873[this.field1001]);
                        if (this.field999 >= var5) {
                            return;
                        }
                        this.field999 = var5 + var5 - 1 - this.field999;
                        this.field1003 = -this.field1003;
                    }
                } else if (this.field1003 < 0) {
                    while (true) {
                        var9 = this.method650(arg0, var9, var5, var10, var4.field7873[this.field1002 - 1]);
                        if (this.field999 >= var5) {
                            return;
                        }
                        this.field999 = var6 - 1 - (var6 - 1 - this.field999) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method679(arg0, var9, var6, var10, var4.field7873[this.field1001]);
                        if (this.field999 < var6) {
                            return;
                        }
                        this.field999 = (this.field999 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field997 > 0) {
                    if (this.field1004) {
                        label130: {
                            if (this.field1003 < 0) {
                                var9 = this.method650(arg0, arg1, var5, var10, var4.field7873[this.field1001]);
                                if (this.field999 >= var5) {
                                    return;
                                }
                                this.field999 = var5 + var5 - 1 - this.field999;
                                this.field1003 = -this.field1003;
                                if (--this.field997 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method679(arg0, var9, var6, var10, var4.field7873[this.field1002 - 1]);
                                if (this.field999 < var6) {
                                    return;
                                }
                                this.field999 = var6 + var6 - 1 - this.field999;
                                this.field1003 = -this.field1003;
                                if (--this.field997 == 0) {
                                    break;
                                }
                                var9 = this.method650(arg0, var9, var5, var10, var4.field7873[this.field1001]);
                                if (this.field999 >= var5) {
                                    return;
                                }
                                this.field999 = var5 + var5 - 1 - this.field999;
                                this.field1003 = -this.field1003;
                            } while (--this.field997 != 0);
                        }
                    } else if (this.field1003 < 0) {
                        while (true) {
                            var9 = this.method650(arg0, var9, var5, var10, var4.field7873[this.field1002 - 1]);
                            if (this.field999 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field999) / var8;
                            if (var12 >= this.field997) {
                                this.field999 += this.field997 * var8;
                                this.field997 = 0;
                                break;
                            }
                            this.field999 += var8 * var12;
                            this.field997 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method679(arg0, var9, var6, var10, var4.field7873[this.field1001]);
                            if (this.field999 < var6) {
                                return;
                            }
                            int var13 = (this.field999 - var5) / var8;
                            if (var13 >= this.field997) {
                                this.field999 -= this.field997 * var8;
                                this.field997 = 0;
                                break;
                            }
                            this.field999 -= var8 * var13;
                            this.field997 -= var13;
                        }
                    }
                }
                if (this.field1003 < 0) {
                    this.method650(arg0, var9, 0, var10, 0);
                    if (this.field999 < 0) {
                        this.field999 = -1;
                        this.method642();
                        this.method864(12983);
                        return;
                    }
                } else {
                    this.method679(arg0, var9, var7, var10, 0);
                    if (this.field999 >= var7) {
                        this.field999 = var7;
                        this.method642();
                        this.method864(12983);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ps", name = "b", descriptor = "([B[IIIIIIILps;)I")
    private static final int method660(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class95 arg8) {
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
        arg8.field999 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ps", name = "j", descriptor = "()V")
    private final void method661() {
        this.field998 = this.field1007;
        this.field1000 = method671(this.field1007, this.field996);
        this.field1006 = method637(this.field1007, this.field996);
    }

    @OriginalMember(owner = "client!ps", name = "b", descriptor = "(II[B[IIIIIIIIIILps;II)I")
    private static final int method662(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class95 arg13, int arg14, int arg15) {
        arg13.field998 -= arg13.field995 * arg5;
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
        arg13.field998 += arg13.field995 * var22;
        arg13.field1000 = arg6;
        arg13.field1006 = arg7;
        arg13.field999 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!ps", name = "k", descriptor = "()I")
    public final synchronized int method663() {
        return this.field1007 == Integer.MIN_VALUE ? 0 : this.field1007;
    }

    @OriginalMember(owner = "client!ps", name = "i", descriptor = "(I)V")
    private final synchronized void method664(int arg0) {
        this.method675(arg0, this.method636());
    }

    @OriginalMember(owner = "client!ps", name = "j", descriptor = "(I)V")
    public final synchronized void method665(int arg0) {
        this.method675(arg0 << 6, this.method636());
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(Lcba;III)Lps;")
    public static final class95 method666(class548 arg0, int arg1, int arg2, int arg3) {
        return arg0.field7873 != null && arg0.field7873.length != 0 ? new class95(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!ps", name = "b", descriptor = "(II[B[IIIIIIILps;II)I")
    private static final int method667(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class95 arg10, int arg11, int arg12) {
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
        arg10.field999 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ps", name = "c", descriptor = "(II[B[IIIIIIIILps;II)I")
    private static final int method668(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class95 arg11, int arg12, int arg13) {
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
        arg11.field999 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!ps", name = "b", descriptor = "()I")
    public final int method669() {
        return this.field1007 == 0 && this.field1005 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(I[B[IIIIIIIIIILps;)I")
    private static final int method670(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class95 arg12) {
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
        arg12.field998 += (var19 - arg4) * arg12.field995;
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
        arg12.field1000 = var15 >> 2;
        arg12.field1006 = var16 >> 2;
        arg12.field999 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!ps", name = "c", descriptor = "(II)I")
    private static final int method671(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!ps", name = "k", descriptor = "(I)V")
    public final synchronized void method672(int arg0) {
        int var2 = ((class548) super.field2875).field7873.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field999 = arg0;
    }

    @OriginalMember(owner = "client!ps", name = "b", descriptor = "([B[IIIIIIIILps;)I")
    private static final int method673(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class95 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1000 += (var14 - arg3) * arg9.field1008;
        arg9.field1006 += (var14 - arg3) * arg9.field1009;
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
        arg9.field998 = var12 >> 2;
        arg9.field999 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ps", name = "b", descriptor = "(I[B[IIIIIIIILps;)I")
    private static final int method674(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class95 arg10) {
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
        arg10.field999 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!ps", name = "d", descriptor = "(II)V")
    private final synchronized void method675(int arg0, int arg1) {
        this.field1007 = arg0;
        this.field996 = arg1;
        this.field1005 = 0;
        this.method661();
    }

    @OriginalMember(owner = "client!ps", name = "d", descriptor = "(II[B[IIIIIIIILps;II)I")
    private static final int method676(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class95 arg11, int arg12, int arg13) {
        arg11.field1000 -= arg11.field1008 * arg5;
        arg11.field1006 -= arg11.field1009 * arg5;
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
        arg11.field1000 += arg11.field1008 * arg5;
        arg11.field1006 += arg11.field1009 * arg5;
        arg11.field998 = arg6;
        arg11.field999 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ps", name = "l", descriptor = "()Z")
    public final boolean method677() {
        return this.field999 < 0 || this.field999 >= ((class548) super.field2875).field7873.length << 8;
    }

    @OriginalMember(owner = "client!ps", name = "d", descriptor = "()Leia;")
    public final class241 method678() {
        return null;
    }

    @OriginalMember(owner = "client!ps", name = "<init>", descriptor = "(Lcba;III)V")
    private class95(class548 arg0, int arg1, int arg2, int arg3) {
        super.field2875 = arg0;
        this.field1001 = arg0.field7875;
        this.field1002 = arg0.field7871;
        this.field1004 = arg0.field7874;
        this.field1003 = arg1;
        this.field1007 = arg2;
        this.field996 = arg3;
        this.field999 = 0;
        this.method661();
    }

    @OriginalMember(owner = "client!ps", name = "b", descriptor = "([IIIII)I")
    private final int method679(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field1005 <= 0) {
                if (this.field1003 == 256 && (this.field999 & 255) == 0) {
                    if (class54.field556) {
                        return method674(0, ((class548) super.field2875).field7873, arg0, this.field999, arg1, this.field1000, this.field1006, 0, arg3, arg2, this);
                    }
                    return method660(((class548) super.field2875).field7873, arg0, this.field999, arg1, this.field998, 0, arg3, arg2, this);
                }
                if (class54.field556) {
                    return method668(0, 0, ((class548) super.field2875).field7873, arg0, this.field999, arg1, this.field1000, this.field1006, 0, arg3, arg2, this, this.field1003, arg4);
                }
                return method648(0, 0, ((class548) super.field2875).field7873, arg0, this.field999, arg1, this.field998, 0, arg3, arg2, this, this.field1003, arg4);
            }
            int var6 = this.field1005 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field1005 += arg1;
            if (this.field1003 == 256 && (this.field999 & 255) == 0) {
                if (class54.field556) {
                    arg1 = method680(0, ((class548) super.field2875).field7873, arg0, this.field999, arg1, this.field1000, this.field1006, this.field1008, this.field1009, 0, var6, arg2, this);
                } else {
                    arg1 = method673(((class548) super.field2875).field7873, arg0, this.field999, arg1, this.field998, this.field995, 0, var6, arg2, this);
                }
            } else if (class54.field556) {
                arg1 = method662(0, 0, ((class548) super.field2875).field7873, arg0, this.field999, arg1, this.field1000, this.field1006, this.field1008, this.field1009, 0, var6, arg2, this, this.field1003, arg4);
            } else {
                arg1 = method658(0, 0, ((class548) super.field2875).field7873, arg0, this.field999, arg1, this.field998, this.field995, 0, var6, arg2, this, this.field1003, arg4);
            }
            this.field1005 -= arg1;
            if (this.field1005 != 0) {
                return arg1;
            }
        } while (!this.method638());
        return arg3;
    }

    @OriginalMember(owner = "client!ps", name = "b", descriptor = "(I[B[IIIIIIIIIILps;)I")
    private static final int method680(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class95 arg12) {
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
        arg12.field998 += (var19 - arg4) * arg12.field995;
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
        arg12.field1000 = var15 >> 2;
        arg12.field1006 = var16 >> 2;
        arg12.field999 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "()Leia;")
    public final class241 method681() {
        return null;
    }
}
