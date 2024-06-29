import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class215 extends class258 {

    @OriginalMember(owner = "client!o", name = "L", descriptor = "I")
    private int field3462;

    @OriginalMember(owner = "client!o", name = "I", descriptor = "I")
    private int field3459;

    @OriginalMember(owner = "client!o", name = "G", descriptor = "Z")
    private boolean field3457;

    @OriginalMember(owner = "client!o", name = "H", descriptor = "I")
    private int field3458;

    @OriginalMember(owner = "client!o", name = "K", descriptor = "I")
    private int field3461;

    @OriginalMember(owner = "client!o", name = "O", descriptor = "I")
    private int field3465;

    @OriginalMember(owner = "client!o", name = "J", descriptor = "I")
    private int field3460;

    @OriginalMember(owner = "client!o", name = "z", descriptor = "I")
    private int field3451;

    @OriginalMember(owner = "client!o", name = "A", descriptor = "I")
    private int field3452;

    @OriginalMember(owner = "client!o", name = "B", descriptor = "I")
    private int field3453;

    @OriginalMember(owner = "client!o", name = "C", descriptor = "I")
    private int field3454;

    @OriginalMember(owner = "client!o", name = "D", descriptor = "I")
    private int field3455;

    @OriginalMember(owner = "client!o", name = "F", descriptor = "I")
    private int field3456;

    @OriginalMember(owner = "client!o", name = "M", descriptor = "I")
    private int field3463;

    @OriginalMember(owner = "client!o", name = "N", descriptor = "I")
    private int field3464;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "([B[IIIIIIILo;)I", line = 3)
    private static final int method1518(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class215 arg8) {
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
        arg8.field3460 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(I[B[IIIIIIIIIILo;)I", line = 28)
    private static final int method1519(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class215 arg12) {
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
        arg12.field3454 += (var19 - arg4) * arg12.field3451;
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
        arg12.field3464 = var15 >> 2;
        arg12.field3463 = var16 >> 2;
        arg12.field3460 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!o", name = "d", descriptor = "(I)V", line = 81)
    public final synchronized void method1054(int arg0) {
        if (this.field3455 > 0) {
            if (arg0 >= this.field3455) {
                if (this.field3461 == Integer.MIN_VALUE) {
                    this.field3461 = 0;
                    this.field3454 = this.field3464 = this.field3463 = 0;
                    this.method418(6971);
                    arg0 = this.field3455;
                }
                this.field3455 = 0;
                this.method1558();
            } else {
                this.field3454 += this.field3451 * arg0;
                this.field3464 += this.field3453 * arg0;
                this.field3463 += this.field3452 * arg0;
                this.field3455 -= arg0;
            }
        }
        class291 var2 = (class291) this.field4122;
        int var3 = this.field3462 << 8;
        int var4 = this.field3459 << 8;
        int var5 = var2.field4719.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field3456 = 0;
        }
        if (this.field3460 < 0) {
            if (this.field3458 <= 0) {
                this.method1545();
                this.method418(6971);
                return;
            }
            this.field3460 = 0;
        }
        if (this.field3460 >= var5) {
            if (this.field3458 >= 0) {
                this.method1545();
                this.method418(6971);
                return;
            }
            this.field3460 = var5 - 1;
        }
        this.field3460 += this.field3458 * arg0;
        if (this.field3456 >= 0) {
            if (this.field3456 > 0) {
                if (this.field3457) {
                    label121: {
                        if (this.field3458 < 0) {
                            if (this.field3460 >= var3) {
                                return;
                            }
                            this.field3460 = var3 + var3 - this.field3460 - 1;
                            this.field3458 = -this.field3458;
                            if (--this.field3456 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field3460 < var4) {
                                return;
                            }
                            this.field3460 = var4 + var4 - this.field3460 - 1;
                            this.field3458 = -this.field3458;
                            if (--this.field3456 == 0) {
                                break;
                            }
                            if (this.field3460 >= var3) {
                                return;
                            }
                            this.field3460 = var3 + var3 - this.field3460 - 1;
                            this.field3458 = -this.field3458;
                        } while (--this.field3456 != 0);
                    }
                } else {
                    label153: {
                        if (this.field3458 < 0) {
                            if (this.field3460 >= var3) {
                                return;
                            }
                            int var7 = (var4 - this.field3460 - 1) / var6;
                            if (var7 >= this.field3456) {
                                this.field3460 += this.field3456 * var6;
                                this.field3456 = 0;
                                break label153;
                            }
                            this.field3460 += var6 * var7;
                            this.field3456 -= var7;
                        } else if (this.field3460 >= var4) {
                            int var8 = (this.field3460 - var3) / var6;
                            if (var8 >= this.field3456) {
                                this.field3460 -= this.field3456 * var6;
                                this.field3456 = 0;
                                break label153;
                            }
                            this.field3460 -= var6 * var8;
                            this.field3456 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field3458 < 0) {
                if (this.field3460 < 0) {
                    this.field3460 = -1;
                    this.method1545();
                    this.method418(6971);
                }
            } else if (this.field3460 >= var5) {
                this.field3460 = var5;
                this.method1545();
                this.method418(6971);
            }
        } else if (this.field3457) {
            if (this.field3458 < 0) {
                if (this.field3460 >= var3) {
                    return;
                }
                this.field3460 = var3 + var3 - this.field3460 - 1;
                this.field3458 = -this.field3458;
            }
            while (this.field3460 >= var4) {
                this.field3460 = var4 + var4 - this.field3460 - 1;
                this.field3458 = -this.field3458;
                if (this.field3460 >= var3) {
                    return;
                }
                this.field3460 = var3 + var3 - this.field3460 - 1;
                this.field3458 = -this.field3458;
            }
        } else if (this.field3458 < 0) {
            if (this.field3460 >= var3) {
                return;
            }
            this.field3460 = var4 - (var4 - 1 - this.field3460) % var6 - 1;
        } else if (this.field3460 >= var4) {
            this.field3460 = (this.field3460 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(II)I", line = 299)
    private static final int method1520(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!o", name = "d", descriptor = "()Lcm;", line = 303)
    public final class258 method1075() {
        return null;
    }

    @OriginalMember(owner = "client!o", name = "e", descriptor = "()Z", line = 307)
    private final boolean method1521() {
        int var1 = this.field3461;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1520(var1, this.field3465);
            var2 = method1544(var1, this.field3465);
        }
        if (this.field3454 != var1 || this.field3464 != var3 || this.field3463 != var2) {
            if (this.field3454 < var1) {
                this.field3451 = 1;
                this.field3455 = var1 - this.field3454;
            } else if (this.field3454 > var1) {
                this.field3451 = -1;
                this.field3455 = this.field3454 - var1;
            } else {
                this.field3451 = 0;
            }
            if (this.field3464 < var3) {
                this.field3453 = 1;
                if (this.field3455 == 0 || this.field3455 > var3 - this.field3464) {
                    this.field3455 = var3 - this.field3464;
                }
            } else if (this.field3464 > var3) {
                this.field3453 = -1;
                if (this.field3455 == 0 || this.field3455 > this.field3464 - var3) {
                    this.field3455 = this.field3464 - var3;
                }
            } else {
                this.field3453 = 0;
            }
            if (this.field3463 < var2) {
                this.field3452 = 1;
                if (this.field3455 == 0 || this.field3455 > var2 - this.field3463) {
                    this.field3455 = var2 - this.field3463;
                }
            } else if (this.field3463 > var2) {
                this.field3452 = -1;
                if (this.field3455 == 0 || this.field3455 > this.field3463 - var2) {
                    this.field3455 = this.field3463 - var2;
                }
            } else {
                this.field3452 = 0;
            }
            return false;
        } else if (this.field3461 == Integer.MIN_VALUE) {
            this.field3461 = 0;
            this.field3454 = this.field3464 = this.field3463 = 0;
            this.method418(6971);
            return true;
        } else {
            this.method1558();
            return false;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(II[B[IIIIIIILo;II)I", line = 392)
    private static final int method1522(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class215 arg10, int arg11, int arg12) {
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
        arg10.field3460 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!o", name = "f", descriptor = "()Z", line = 419)
    public final boolean method1523() {
        return this.field3460 < 0 || this.field3460 >= ((class291) this.field4122).field4719.length << 8;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "()I", line = 423)
    public final int method1524() {
        int var1 = this.field3454 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field3456 == 0) {
            var2 -= this.field3460 * var2 / (((class291) this.field4122).field4719.length << 8);
        } else if (this.field3456 >= 0) {
            var2 -= this.field3462 * var2 / ((class291) this.field4122).field4719.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(II[B[IIIIIIIILo;II)I", line = 439)
    private static final int method1525(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class215 arg11, int arg12, int arg13) {
        arg11.field3464 -= arg11.field3453 * arg5;
        arg11.field3463 -= arg11.field3452 * arg5;
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
        arg11.field3464 += arg11.field3453 * arg5;
        arg11.field3463 += arg11.field3452 * arg5;
        arg11.field3454 = arg6;
        arg11.field3460 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "([IIIII)I", line = 475)
    private final int method1526(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field3455 > 0) {
                int var6 = this.field3455 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field3455 += arg1;
                if (this.field3458 == -256 && (this.field3460 & 0xFF) == 0) {
                    if (class112.field1656) {
                        arg1 = method1529(0, ((class291) this.field4122).field4719, arg0, this.field3460, arg1, this.field3464, this.field3463, this.field3453, this.field3452, 0, var6, arg2, this);
                    } else {
                        arg1 = method1542(((class291) this.field4122).field4719, arg0, this.field3460, arg1, this.field3454, this.field3451, 0, var6, arg2, this);
                    }
                } else if (class112.field1656) {
                    arg1 = method1543(0, 0, ((class291) this.field4122).field4719, arg0, this.field3460, arg1, this.field3464, this.field3463, this.field3453, this.field3452, 0, var6, arg2, this, this.field3458, arg4);
                } else {
                    arg1 = method1550(0, 0, ((class291) this.field4122).field4719, arg0, this.field3460, arg1, this.field3454, this.field3451, 0, var6, arg2, this, this.field3458, arg4);
                }
                this.field3455 -= arg1;
                if (this.field3455 != 0) {
                    return arg1;
                }
                if (!this.method1521()) {
                    continue;
                }
                return arg3;
            }
            if (this.field3458 == -256 && (this.field3460 & 0xFF) == 0) {
                if (class112.field1656) {
                    return method1539(0, ((class291) this.field4122).field4719, arg0, this.field3460, arg1, this.field3464, this.field3463, 0, arg3, arg2, this);
                }
                return method1518(((class291) this.field4122).field4719, arg0, this.field3460, arg1, this.field3454, 0, arg3, arg2, this);
            }
            if (class112.field1656) {
                return method1551(0, 0, ((class291) this.field4122).field4719, arg0, this.field3460, arg1, this.field3464, this.field3463, 0, arg3, arg2, this, this.field3458, arg4);
            }
            return method1532(0, 0, ((class291) this.field4122).field4719, arg0, this.field3460, arg1, this.field3454, 0, arg3, arg2, this, this.field3458, arg4);
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(III)V", line = 530)
    public final synchronized void method1527(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1546(arg1, arg2);
            return;
        }
        int var4 = method1520(arg1, arg2);
        int var5 = method1544(arg1, arg2);
        if (this.field3464 == var4 && this.field3463 == var5) {
            this.field3455 = 0;
            return;
        }
        int var6 = arg1 - this.field3454;
        if (this.field3454 - arg1 > var6) {
            var6 = this.field3454 - arg1;
        }
        if (var4 - this.field3464 > var6) {
            var6 = var4 - this.field3464;
        }
        if (this.field3464 - var4 > var6) {
            var6 = this.field3464 - var4;
        }
        if (var5 - this.field3463 > var6) {
            var6 = var5 - this.field3463;
        }
        if (this.field3463 - var5 > var6) {
            var6 = this.field3463 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field3455 = arg0;
        this.field3461 = arg1;
        this.field3465 = arg2;
        this.field3451 = (arg1 - this.field3454) / arg0;
        this.field3453 = (var4 - this.field3464) / arg0;
        this.field3452 = (var5 - this.field3463) / arg0;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Lgi;II)Lo;", line = 576)
    public static final class215 method1528(class291 arg0, int arg1, int arg2) {
        return arg0.field4719 == null || arg0.field4719.length == 0 ? null : new class215(arg0, (int) ((long) arg0.field4720 * 256L * (long) arg1 / (long) (class202.field3240 * 100)), arg2 << 6);
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(I[B[IIIIIIIIIILo;)I", line = 582)
    private static final int method1529(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class215 arg12) {
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
        arg12.field3454 += (var19 - arg4) * arg12.field3451;
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
        arg12.field3464 = var15 >> 2;
        arg12.field3463 = var16 >> 2;
        arg12.field3460 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!o", name = "e", descriptor = "(I)V", line = 635)
    public final synchronized void method1530(int arg0) {
        if (arg0 == 0) {
            this.method1531(0);
            this.method418(6971);
        } else if (this.field3464 == 0 && this.field3463 == 0) {
            this.field3455 = 0;
            this.field3461 = 0;
            this.field3454 = 0;
            this.method418(6971);
        } else {
            int var2 = -this.field3454;
            if (this.field3454 > var2) {
                var2 = this.field3454;
            }
            if (-this.field3464 > var2) {
                var2 = -this.field3464;
            }
            if (this.field3464 > var2) {
                var2 = this.field3464;
            }
            if (-this.field3463 > var2) {
                var2 = -this.field3463;
            }
            if (this.field3463 > var2) {
                var2 = this.field3463;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field3455 = arg0;
            this.field3461 = Integer.MIN_VALUE;
            this.field3451 = -this.field3454 / arg0;
            this.field3453 = -this.field3464 / arg0;
            this.field3452 = -this.field3463 / arg0;
        }
    }

    @OriginalMember(owner = "client!o", name = "f", descriptor = "(I)V", line = 681)
    private final synchronized void method1531(int arg0) {
        this.method1546(arg0, this.method1537());
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(II[B[IIIIIIILo;II)I", line = 684)
    private static final int method1532(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class215 arg10, int arg11, int arg12) {
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
        arg10.field3460 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(II[B[IIIIIIIIIILo;II)I", line = 711)
    private static final int method1533(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class215 arg13, int arg14, int arg15) {
        arg13.field3454 -= arg13.field3451 * arg5;
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
        arg13.field3454 += arg13.field3451 * var27;
        arg13.field3464 = arg6;
        arg13.field3463 = arg7;
        arg13.field3460 = arg4;
        return var27;
    }

    @OriginalMember(owner = "client!o", name = "g", descriptor = "(I)V", line = 753)
    public final synchronized void method1534(int arg0) {
        this.method1546(arg0 << 6, this.method1537());
    }

    @OriginalMember(owner = "client!o", name = "c", descriptor = "()Lcm;", line = 756)
    public final class258 method1070() {
        return null;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Lgi;III)Lo;", line = 759)
    public static final class215 method1535(class291 arg0, int arg1, int arg2, int arg3) {
        return arg0.field4719 == null || arg0.field4719.length == 0 ? null : new class215(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!o", name = "g", descriptor = "()I", line = 771)
    public final synchronized int method1536() {
        return this.field3458 < 0 ? -this.field3458 : this.field3458;
    }

    @OriginalMember(owner = "client!o", name = "h", descriptor = "()I", line = 775)
    public final synchronized int method1537() {
        return this.field3465 < 0 ? -1 : this.field3465;
    }

    @OriginalMember(owner = "client!o", name = "h", descriptor = "(I)V", line = 778)
    public final synchronized void method1538(int arg0) {
        this.field3456 = arg0;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(I[B[IIIIIIIILo;)I", line = 782)
    private static final int method1539(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class215 arg10) {
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
        arg10.field3460 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(II[B[IIIIIIIILo;II)I", line = 824)
    private static final int method1540(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class215 arg11, int arg12, int arg13) {
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
        arg11.field3460 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "()I", line = 857)
    public final int method1067() {
        return this.field3461 == 0 && this.field3455 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!o", name = "i", descriptor = "()Z", line = 863)
    public final boolean method1541() {
        return this.field3455 != 0;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "([B[IIIIIIIILo;)I", line = 867)
    private static final int method1542(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class215 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field3464 += (var14 - arg3) * arg9.field3453;
        arg9.field3463 += (var14 - arg3) * arg9.field3452;
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
        arg9.field3454 = var12 >> 2;
        arg9.field3460 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(II[B[IIIIIIIIIILo;II)I", line = 902)
    private static final int method1543(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class215 arg13, int arg14, int arg15) {
        arg13.field3454 -= arg13.field3451 * arg5;
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
        arg13.field3454 += arg13.field3451 * var26;
        arg13.field3464 = arg6;
        arg13.field3463 = arg7;
        arg13.field3460 = arg4;
        return var26;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "([III)V", line = 943)
    public final synchronized void method1072(int[] arg0, int arg1, int arg2) {
        if (this.field3461 == 0 && this.field3455 == 0) {
            this.method1054(arg2);
            return;
        }
        class291 var4 = (class291) this.field4122;
        int var5 = this.field3462 << 8;
        int var6 = this.field3459 << 8;
        int var7 = var4.field4719.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field3456 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field3460 < 0) {
            if (this.field3458 <= 0) {
                this.method1545();
                this.method418(6971);
                return;
            }
            this.field3460 = 0;
        }
        if (this.field3460 >= var7) {
            if (this.field3458 >= 0) {
                this.method1545();
                this.method418(6971);
                return;
            }
            this.field3460 = var7 - 1;
        }
        if (this.field3456 >= 0) {
            if (this.field3456 > 0) {
                if (this.field3457) {
                    label131: {
                        if (this.field3458 < 0) {
                            var9 = this.method1526(arg0, arg1, var5, var10, var4.field4719[this.field3462]);
                            if (this.field3460 >= var5) {
                                return;
                            }
                            this.field3460 = var5 + var5 - this.field3460 - 1;
                            this.field3458 = -this.field3458;
                            if (--this.field3456 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method1553(arg0, var9, var6, var10, var4.field4719[this.field3459 - 1]);
                            if (this.field3460 < var6) {
                                return;
                            }
                            this.field3460 = var6 + var6 - this.field3460 - 1;
                            this.field3458 = -this.field3458;
                            if (--this.field3456 == 0) {
                                break;
                            }
                            var9 = this.method1526(arg0, var9, var5, var10, var4.field4719[this.field3462]);
                            if (this.field3460 >= var5) {
                                return;
                            }
                            this.field3460 = var5 + var5 - this.field3460 - 1;
                            this.field3458 = -this.field3458;
                        } while (--this.field3456 != 0);
                    }
                } else if (this.field3458 < 0) {
                    while (true) {
                        var9 = this.method1526(arg0, var9, var5, var10, var4.field4719[this.field3459 - 1]);
                        if (this.field3460 >= var5) {
                            return;
                        }
                        int var12 = (var6 - this.field3460 - 1) / var8;
                        if (var12 >= this.field3456) {
                            this.field3460 += this.field3456 * var8;
                            this.field3456 = 0;
                            break;
                        }
                        this.field3460 += var8 * var12;
                        this.field3456 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method1553(arg0, var9, var6, var10, var4.field4719[this.field3462]);
                        if (this.field3460 < var6) {
                            return;
                        }
                        int var13 = (this.field3460 - var5) / var8;
                        if (var13 >= this.field3456) {
                            this.field3460 -= this.field3456 * var8;
                            this.field3456 = 0;
                            break;
                        }
                        this.field3460 -= var8 * var13;
                        this.field3456 -= var13;
                    }
                }
            }
            if (this.field3458 < 0) {
                this.method1526(arg0, var9, 0, var10, 0);
                if (this.field3460 < 0) {
                    this.field3460 = -1;
                    this.method1545();
                    this.method418(6971);
                }
            } else {
                this.method1553(arg0, var9, var7, var10, 0);
                if (this.field3460 >= var7) {
                    this.field3460 = var7;
                    this.method1545();
                    this.method418(6971);
                }
            }
        } else if (this.field3457) {
            if (this.field3458 < 0) {
                var9 = this.method1526(arg0, arg1, var5, var10, var4.field4719[this.field3462]);
                if (this.field3460 >= var5) {
                    return;
                }
                this.field3460 = var5 + var5 - this.field3460 - 1;
                this.field3458 = -this.field3458;
            }
            while (true) {
                int var11 = this.method1553(arg0, var9, var6, var10, var4.field4719[this.field3459 - 1]);
                if (this.field3460 < var6) {
                    return;
                }
                this.field3460 = var6 + var6 - this.field3460 - 1;
                this.field3458 = -this.field3458;
                var9 = this.method1526(arg0, var11, var5, var10, var4.field4719[this.field3462]);
                if (this.field3460 >= var5) {
                    return;
                }
                this.field3460 = var5 + var5 - this.field3460 - 1;
                this.field3458 = -this.field3458;
            }
        } else if (this.field3458 < 0) {
            while (true) {
                var9 = this.method1526(arg0, var9, var5, var10, var4.field4719[this.field3459 - 1]);
                if (this.field3460 >= var5) {
                    return;
                }
                this.field3460 = var6 - (var6 - 1 - this.field3460) % var8 - 1;
            }
        } else {
            while (true) {
                var9 = this.method1553(arg0, var9, var6, var10, var4.field4719[this.field3462]);
                if (this.field3460 < var6) {
                    return;
                }
                this.field3460 = (this.field3460 - var5) % var8 + var5;
            }
        }
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(II)I", line = 1178)
    private static final int method1544(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!o", name = "j", descriptor = "()V", line = 1181)
    private final void method1545() {
        if (this.field3455 == 0) {
            return;
        }
        if (this.field3461 == Integer.MIN_VALUE) {
            this.field3461 = 0;
        }
        this.field3455 = 0;
        this.method1558();
    }

    @OriginalMember(owner = "client!o", name = "c", descriptor = "(II)V", line = 1192)
    private final synchronized void method1546(int arg0, int arg1) {
        this.field3461 = arg0;
        this.field3465 = arg1;
        this.field3455 = 0;
        this.method1558();
    }

    @OriginalMember(owner = "client!o", name = "k", descriptor = "()I", line = 1198)
    public final synchronized int method1547() {
        return this.field3461 == Integer.MIN_VALUE ? 0 : this.field3461;
    }

    @OriginalMember(owner = "client!o", name = "d", descriptor = "(II)V", line = 1204)
    public final synchronized void method1548(int arg0, int arg1) {
        this.method1527(arg0, arg1, this.method1537());
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "([B[IIIIIIIILo;)I", line = 1207)
    private static final int method1549(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class215 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field3464 += (var14 - arg3) * arg9.field3453;
        arg9.field3463 += (var14 - arg3) * arg9.field3452;
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
        arg9.field3454 = var12 >> 2;
        arg9.field3460 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!o", name = "c", descriptor = "(II[B[IIIIIIIILo;II)I", line = 1241)
    private static final int method1550(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class215 arg11, int arg12, int arg13) {
        arg11.field3464 -= arg11.field3453 * arg5;
        arg11.field3463 -= arg11.field3452 * arg5;
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
        arg11.field3464 += arg11.field3453 * arg5;
        arg11.field3463 += arg11.field3452 * arg5;
        arg11.field3454 = arg6;
        arg11.field3460 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!o", name = "d", descriptor = "(II[B[IIIIIIIILo;II)I", line = 1275)
    private static final int method1551(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class215 arg11, int arg12, int arg13) {
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
        arg11.field3460 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Z)V", line = 1307)
    public final synchronized void method1552(boolean arg0) {
        this.field3458 = (this.field3458 >>> 31) + (this.field3458 ^ this.field3458 >> 31);
        if (arg0) {
            this.field3458 = -this.field3458;
        }
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "([IIIII)I", line = 1316)
    private final int method1553(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field3455 > 0) {
                int var6 = this.field3455 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field3455 += arg1;
                if (this.field3458 == 256 && (this.field3460 & 0xFF) == 0) {
                    if (class112.field1656) {
                        arg1 = method1519(0, ((class291) this.field4122).field4719, arg0, this.field3460, arg1, this.field3464, this.field3463, this.field3453, this.field3452, 0, var6, arg2, this);
                    } else {
                        arg1 = method1549(((class291) this.field4122).field4719, arg0, this.field3460, arg1, this.field3454, this.field3451, 0, var6, arg2, this);
                    }
                } else if (class112.field1656) {
                    arg1 = method1533(0, 0, ((class291) this.field4122).field4719, arg0, this.field3460, arg1, this.field3464, this.field3463, this.field3453, this.field3452, 0, var6, arg2, this, this.field3458, arg4);
                } else {
                    arg1 = method1525(0, 0, ((class291) this.field4122).field4719, arg0, this.field3460, arg1, this.field3454, this.field3451, 0, var6, arg2, this, this.field3458, arg4);
                }
                this.field3455 -= arg1;
                if (this.field3455 != 0) {
                    return arg1;
                }
                if (!this.method1521()) {
                    continue;
                }
                return arg3;
            }
            if (this.field3458 == 256 && (this.field3460 & 0xFF) == 0) {
                if (class112.field1656) {
                    return method1556(0, ((class291) this.field4122).field4719, arg0, this.field3460, arg1, this.field3464, this.field3463, 0, arg3, arg2, this);
                }
                return method1555(((class291) this.field4122).field4719, arg0, this.field3460, arg1, this.field3454, 0, arg3, arg2, this);
            }
            if (class112.field1656) {
                return method1540(0, 0, ((class291) this.field4122).field4719, arg0, this.field3460, arg1, this.field3464, this.field3463, 0, arg3, arg2, this, this.field3458, arg4);
            }
            return method1522(0, 0, ((class291) this.field4122).field4719, arg0, this.field3460, arg1, this.field3454, 0, arg3, arg2, this, this.field3458, arg4);
        }
    }

    @OriginalMember(owner = "client!o", name = "i", descriptor = "(I)V", line = 1372)
    public final synchronized void method1554(int arg0) {
        int var2 = ((class291) this.field4122).field4719.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field3460 = arg0;
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "([B[IIIIIIILo;)I", line = 1384)
    private static final int method1555(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class215 arg8) {
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
        arg8.field3460 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(I[B[IIIIIIIILo;)I", line = 1409)
    private static final int method1556(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class215 arg10) {
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
        arg10.field3460 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "(Lgi;II)V", line = 1446)
    private class215(class291 arg0, int arg1, int arg2) {
        this.field4122 = arg0;
        this.field3462 = arg0.field4718;
        this.field3459 = arg0.field4721;
        this.field3457 = arg0.field4717;
        this.field3458 = arg1;
        this.field3461 = arg2;
        this.field3465 = 8192;
        this.field3460 = 0;
        this.method1558();
    }

    @OriginalMember(owner = "client!o", name = "j", descriptor = "(I)V", line = 1458)
    public final synchronized void method1557(int arg0) {
        if (this.field3458 < 0) {
            this.field3458 = -arg0;
        } else {
            this.field3458 = arg0;
        }
    }

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "(Lgi;III)V", line = 1464)
    private class215(class291 arg0, int arg1, int arg2, int arg3) {
        this.field4122 = arg0;
        this.field3462 = arg0.field4718;
        this.field3459 = arg0.field4721;
        this.field3457 = arg0.field4717;
        this.field3458 = arg1;
        this.field3461 = arg2;
        this.field3465 = arg3;
        this.field3460 = 0;
        this.method1558();
    }

    @OriginalMember(owner = "client!o", name = "l", descriptor = "()V", line = 1476)
    private final void method1558() {
        this.field3454 = this.field3461;
        this.field3464 = method1520(this.field3461, this.field3465);
        this.field3463 = method1544(this.field3461, this.field3465);
    }
}
