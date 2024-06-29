import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class222 extends class37 {

    @OriginalMember(owner = "client!ll", name = "w", descriptor = "I")
    private int field3502;

    @OriginalMember(owner = "client!ll", name = "z", descriptor = "I")
    private int field3505;

    @OriginalMember(owner = "client!ll", name = "C", descriptor = "Z")
    private boolean field3508;

    @OriginalMember(owner = "client!ll", name = "v", descriptor = "I")
    private int field3501;

    @OriginalMember(owner = "client!ll", name = "x", descriptor = "I")
    private int field3503;

    @OriginalMember(owner = "client!ll", name = "s", descriptor = "I")
    private int field3498;

    @OriginalMember(owner = "client!ll", name = "y", descriptor = "I")
    private int field3504;

    @OriginalMember(owner = "client!ll", name = "o", descriptor = "I")
    private int field3494;

    @OriginalMember(owner = "client!ll", name = "p", descriptor = "I")
    private int field3495;

    @OriginalMember(owner = "client!ll", name = "q", descriptor = "I")
    private int field3496;

    @OriginalMember(owner = "client!ll", name = "r", descriptor = "I")
    private int field3497;

    @OriginalMember(owner = "client!ll", name = "t", descriptor = "I")
    private int field3499;

    @OriginalMember(owner = "client!ll", name = "u", descriptor = "I")
    private int field3500;

    @OriginalMember(owner = "client!ll", name = "A", descriptor = "I")
    private int field3506;

    @OriginalMember(owner = "client!ll", name = "B", descriptor = "I")
    private int field3507;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(III)V")
    public final synchronized void method1507(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1545(arg1, arg2);
        } else {
            int var4 = method1526(arg1, arg2);
            int var5 = method1539(arg1, arg2);
            if (this.field3499 == var4 && this.field3496 == var5) {
                this.field3500 = 0;
            } else {
                int var6 = arg1 - this.field3494;
                if (this.field3494 - arg1 > var6) {
                    var6 = this.field3494 - arg1;
                }
                if (var4 - this.field3499 > var6) {
                    var6 = var4 - this.field3499;
                }
                if (this.field3499 - var4 > var6) {
                    var6 = this.field3499 - var4;
                }
                if (var5 - this.field3496 > var6) {
                    var6 = var5 - this.field3496;
                }
                if (this.field3496 - var5 > var6) {
                    var6 = this.field3496 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field3500 = arg0;
                this.field3503 = arg1;
                this.field3498 = arg2;
                this.field3495 = (arg1 - this.field3494) / arg0;
                this.field3506 = (var4 - this.field3499) / arg0;
                this.field3507 = (var5 - this.field3496) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!ll", name = "d", descriptor = "(I)V")
    private final synchronized void method1508(int arg0) {
        this.method1545(arg0, this.method1542());
    }

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "()Lvk;")
    public final class37 method269() {
        return null;
    }

    @OriginalMember(owner = "client!ll", name = "e", descriptor = "()Z")
    public final boolean method1509() {
        return this.field3504 < 0 || this.field3504 >= ((class126) super.field581).field2018.length << 8;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "([IIIII)I")
    private final int method1510(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field3500 <= 0) {
                if (this.field3501 == 256 && (this.field3504 & 255) == 0) {
                    if (class253.field4144) {
                        return method1525(0, ((class126) super.field581).field2018, arg0, this.field3504, arg1, this.field3499, this.field3496, 0, arg3, arg2, this);
                    }
                    return method1524(((class126) super.field581).field2018, arg0, this.field3504, arg1, this.field3494, 0, arg3, arg2, this);
                }
                if (class253.field4144) {
                    return method1517(0, 0, ((class126) super.field581).field2018, arg0, this.field3504, arg1, this.field3499, this.field3496, 0, arg3, arg2, this, this.field3501, arg4);
                }
                return method1511(0, 0, ((class126) super.field581).field2018, arg0, this.field3504, arg1, this.field3494, 0, arg3, arg2, this, this.field3501, arg4);
            }
            int var6 = this.field3500 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field3500 += arg1;
            if (this.field3501 == 256 && (this.field3504 & 255) == 0) {
                if (class253.field4144) {
                    arg1 = method1530(0, ((class126) super.field581).field2018, arg0, this.field3504, arg1, this.field3499, this.field3496, this.field3506, this.field3507, 0, var6, arg2, this);
                } else {
                    arg1 = method1534(((class126) super.field581).field2018, arg0, this.field3504, arg1, this.field3494, this.field3495, 0, var6, arg2, this);
                }
            } else if (class253.field4144) {
                arg1 = method1536(0, 0, ((class126) super.field581).field2018, arg0, this.field3504, arg1, this.field3499, this.field3496, this.field3506, this.field3507, 0, var6, arg2, this, this.field3501, arg4);
            } else {
                arg1 = method1544(0, 0, ((class126) super.field581).field2018, arg0, this.field3504, arg1, this.field3494, this.field3495, 0, var6, arg2, this, this.field3501, arg4);
            }
            this.field3500 -= arg1;
            if (this.field3500 != 0) {
                return arg1;
            }
        } while (!this.method1514());
        return arg3;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(II[B[IIIIIIILll;II)I")
    private static final int method1511(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class222 arg10, int arg11, int arg12) {
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
        arg10.field3504 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "([B[IIIIIIIILll;)I")
    private static final int method1512(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class222 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field3499 += (var14 - arg3) * arg9.field3506;
        arg9.field3496 += (var14 - arg3) * arg9.field3507;
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
        arg9.field3494 = var12 >> 2;
        arg9.field3504 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ll", name = "f", descriptor = "()I")
    public final synchronized int method1513() {
        return this.field3501 < 0 ? -this.field3501 : this.field3501;
    }

    @OriginalMember(owner = "client!ll", name = "g", descriptor = "()Z")
    private final boolean method1514() {
        int var1 = this.field3503;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1526(var1, this.field3498);
            var2 = method1539(var1, this.field3498);
        }
        if (this.field3494 == var1 && this.field3499 == var3 && this.field3496 == var2) {
            if (this.field3503 == Integer.MIN_VALUE) {
                this.field3503 = 0;
                this.field3494 = this.field3499 = this.field3496 = 0;
                this.method952((byte) 36);
                return true;
            } else {
                this.method1538();
                return false;
            }
        } else {
            if (this.field3494 < var1) {
                this.field3495 = 1;
                this.field3500 = var1 - this.field3494;
            } else if (this.field3494 > var1) {
                this.field3495 = -1;
                this.field3500 = this.field3494 - var1;
            } else {
                this.field3495 = 0;
            }
            if (this.field3499 < var3) {
                this.field3506 = 1;
                if (this.field3500 == 0 || this.field3500 > var3 - this.field3499) {
                    this.field3500 = var3 - this.field3499;
                }
            } else if (this.field3499 > var3) {
                this.field3506 = -1;
                if (this.field3500 == 0 || this.field3500 > this.field3499 - var3) {
                    this.field3500 = this.field3499 - var3;
                }
            } else {
                this.field3506 = 0;
            }
            if (this.field3496 < var2) {
                this.field3507 = 1;
                if (this.field3500 == 0 || this.field3500 > var2 - this.field3496) {
                    this.field3500 = var2 - this.field3496;
                }
            } else if (this.field3496 > var2) {
                this.field3507 = -1;
                if (this.field3500 == 0 || this.field3500 > this.field3496 - var2) {
                    this.field3500 = this.field3496 - var2;
                }
            } else {
                this.field3507 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(II[B[IIIIIIIILll;II)I")
    private static final int method1515(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class222 arg11, int arg12, int arg13) {
        arg11.field3499 -= arg11.field3506 * arg5;
        arg11.field3496 -= arg11.field3507 * arg5;
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
        arg11.field3499 += arg11.field3506 * arg5;
        arg11.field3496 += arg11.field3507 * arg5;
        arg11.field3494 = arg6;
        arg11.field3504 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ll", name = "h", descriptor = "()V")
    private final void method1516() {
        if (this.field3500 != 0) {
            if (this.field3503 == Integer.MIN_VALUE) {
                this.field3503 = 0;
            }
            this.field3500 = 0;
            this.method1538();
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "([III)V")
    public final synchronized void method265(int[] arg0, int arg1, int arg2) {
        if (this.field3503 == 0 && this.field3500 == 0) {
            this.method267(arg2);
        } else {
            class126 var4 = (class126) super.field581;
            int var5 = this.field3502 << 8;
            int var6 = this.field3505 << 8;
            int var7 = var4.field2018.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field3497 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field3504 < 0) {
                if (this.field3501 <= 0) {
                    this.method1516();
                    this.method952((byte) 27);
                    return;
                }
                this.field3504 = 0;
            }
            if (this.field3504 >= var7) {
                if (this.field3501 >= 0) {
                    this.method1516();
                    this.method952((byte) 106);
                    return;
                }
                this.field3504 = var7 - 1;
            }
            if (this.field3497 < 0) {
                if (this.field3508) {
                    if (this.field3501 < 0) {
                        var9 = this.method1535(arg0, arg1, var5, var10, var4.field2018[this.field3502]);
                        if (this.field3504 >= var5) {
                            return;
                        }
                        this.field3504 = var5 + var5 - 1 - this.field3504;
                        this.field3501 = -this.field3501;
                    }
                    while (true) {
                        int var11 = this.method1510(arg0, var9, var6, var10, var4.field2018[this.field3505 - 1]);
                        if (this.field3504 < var6) {
                            return;
                        }
                        this.field3504 = var6 + var6 - 1 - this.field3504;
                        this.field3501 = -this.field3501;
                        var9 = this.method1535(arg0, var11, var5, var10, var4.field2018[this.field3502]);
                        if (this.field3504 >= var5) {
                            return;
                        }
                        this.field3504 = var5 + var5 - 1 - this.field3504;
                        this.field3501 = -this.field3501;
                    }
                } else if (this.field3501 < 0) {
                    while (true) {
                        var9 = this.method1535(arg0, var9, var5, var10, var4.field2018[this.field3505 - 1]);
                        if (this.field3504 >= var5) {
                            return;
                        }
                        this.field3504 = var6 - 1 - (var6 - 1 - this.field3504) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method1510(arg0, var9, var6, var10, var4.field2018[this.field3502]);
                        if (this.field3504 < var6) {
                            return;
                        }
                        this.field3504 = (this.field3504 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field3497 > 0) {
                    if (this.field3508) {
                        label130: {
                            if (this.field3501 < 0) {
                                var9 = this.method1535(arg0, arg1, var5, var10, var4.field2018[this.field3502]);
                                if (this.field3504 >= var5) {
                                    return;
                                }
                                this.field3504 = var5 + var5 - 1 - this.field3504;
                                this.field3501 = -this.field3501;
                                if (--this.field3497 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method1510(arg0, var9, var6, var10, var4.field2018[this.field3505 - 1]);
                                if (this.field3504 < var6) {
                                    return;
                                }
                                this.field3504 = var6 + var6 - 1 - this.field3504;
                                this.field3501 = -this.field3501;
                                if (--this.field3497 == 0) {
                                    break;
                                }
                                var9 = this.method1535(arg0, var9, var5, var10, var4.field2018[this.field3502]);
                                if (this.field3504 >= var5) {
                                    return;
                                }
                                this.field3504 = var5 + var5 - 1 - this.field3504;
                                this.field3501 = -this.field3501;
                            } while (--this.field3497 != 0);
                        }
                    } else if (this.field3501 < 0) {
                        while (true) {
                            var9 = this.method1535(arg0, var9, var5, var10, var4.field2018[this.field3505 - 1]);
                            if (this.field3504 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field3504) / var8;
                            if (var12 >= this.field3497) {
                                this.field3504 += this.field3497 * var8;
                                this.field3497 = 0;
                                break;
                            }
                            this.field3504 += var8 * var12;
                            this.field3497 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method1510(arg0, var9, var6, var10, var4.field2018[this.field3502]);
                            if (this.field3504 < var6) {
                                return;
                            }
                            int var13 = (this.field3504 - var5) / var8;
                            if (var13 >= this.field3497) {
                                this.field3504 -= this.field3497 * var8;
                                this.field3497 = 0;
                                break;
                            }
                            this.field3504 -= var8 * var13;
                            this.field3497 -= var13;
                        }
                    }
                }
                if (this.field3501 < 0) {
                    this.method1535(arg0, var9, 0, var10, 0);
                    if (this.field3504 < 0) {
                        this.field3504 = -1;
                        this.method1516();
                        this.method952((byte) 107);
                        return;
                    }
                } else {
                    this.method1510(arg0, var9, var7, var10, 0);
                    if (this.field3504 >= var7) {
                        this.field3504 = var7;
                        this.method1516();
                        this.method952((byte) 48);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "(II[B[IIIIIIIILll;II)I")
    private static final int method1517(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class222 arg11, int arg12, int arg13) {
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
        arg11.field3504 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(I[B[IIIIIIIIIILll;)I")
    private static final int method1518(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class222 arg12) {
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
        arg12.field3494 += (var19 - arg4) * arg12.field3495;
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
        arg12.field3499 = var15 >> 2;
        arg12.field3496 = var16 >> 2;
        arg12.field3504 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(I[B[IIIIIIIILll;)I")
    private static final int method1519(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class222 arg10) {
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
        arg10.field3504 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "()Lvk;")
    public final class37 method266() {
        return null;
    }

    @OriginalMember(owner = "client!ll", name = "i", descriptor = "()Z")
    public final boolean method1520() {
        return this.field3500 != 0;
    }

    @OriginalMember(owner = "client!ll", name = "e", descriptor = "(I)V")
    public final synchronized void method1521(int arg0) {
        this.field3497 = arg0;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Z)V")
    public final synchronized void method1522(boolean arg0) {
        this.field3501 = (this.field3501 >>> 31) + (this.field3501 ^ this.field3501 >> 31);
        if (arg0) {
            this.field3501 = -this.field3501;
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "([B[IIIIIIILll;)I")
    private static final int method1523(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class222 arg8) {
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
        arg8.field3504 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "([B[IIIIIIILll;)I")
    private static final int method1524(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class222 arg8) {
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
        arg8.field3504 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "(I[B[IIIIIIIILll;)I")
    private static final int method1525(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class222 arg10) {
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
        arg10.field3504 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(II)I")
    private static final int method1526(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "(II)V")
    public final synchronized void method1527(int arg0, int arg1) {
        this.method1507(arg0, arg1, this.method1542());
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(II[B[IIIIIIIIIILll;II)I")
    private static final int method1528(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class222 arg13, int arg14, int arg15) {
        arg13.field3494 -= arg13.field3495 * arg5;
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
        arg13.field3494 += arg13.field3495 * var22;
        arg13.field3499 = arg6;
        arg13.field3496 = arg7;
        arg13.field3504 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "(II[B[IIIIIIILll;II)I")
    private static final int method1529(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class222 arg10, int arg11, int arg12) {
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
        arg10.field3504 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "(I[B[IIIIIIIIIILll;)I")
    private static final int method1530(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class222 arg12) {
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
        arg12.field3494 += (var19 - arg4) * arg12.field3495;
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
        arg12.field3499 = var15 >> 2;
        arg12.field3496 = var16 >> 2;
        arg12.field3504 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!ll", name = "f", descriptor = "(I)V")
    public final synchronized void method1531(int arg0) {
        if (this.field3501 < 0) {
            this.field3501 = -arg0;
        } else {
            this.field3501 = arg0;
        }
    }

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "(I)V")
    public final synchronized void method267(int arg0) {
        if (this.field3500 > 0) {
            if (arg0 >= this.field3500) {
                if (this.field3503 == Integer.MIN_VALUE) {
                    this.field3503 = 0;
                    this.field3494 = this.field3499 = this.field3496 = 0;
                    this.method952((byte) 117);
                    arg0 = this.field3500;
                }
                this.field3500 = 0;
                this.method1538();
            } else {
                this.field3494 += this.field3495 * arg0;
                this.field3499 += this.field3506 * arg0;
                this.field3496 += this.field3507 * arg0;
                this.field3500 -= arg0;
            }
        }
        class126 var2 = (class126) super.field581;
        int var3 = this.field3502 << 8;
        int var4 = this.field3505 << 8;
        int var5 = var2.field2018.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field3497 = 0;
        }
        if (this.field3504 < 0) {
            if (this.field3501 <= 0) {
                this.method1516();
                this.method952((byte) 51);
                return;
            }
            this.field3504 = 0;
        }
        if (this.field3504 >= var5) {
            if (this.field3501 >= 0) {
                this.method1516();
                this.method952((byte) 115);
                return;
            }
            this.field3504 = var5 - 1;
        }
        this.field3504 += this.field3501 * arg0;
        if (this.field3497 < 0) {
            if (!this.field3508) {
                if (this.field3501 < 0) {
                    if (this.field3504 < var3) {
                        this.field3504 = var4 - 1 - (var4 - 1 - this.field3504) % var6;
                    }
                } else if (this.field3504 >= var4) {
                    this.field3504 = (this.field3504 - var3) % var6 + var3;
                }
            } else {
                if (this.field3501 < 0) {
                    if (this.field3504 >= var3) {
                        return;
                    }
                    this.field3504 = var3 + var3 - 1 - this.field3504;
                    this.field3501 = -this.field3501;
                }
                while (this.field3504 >= var4) {
                    this.field3504 = var4 + var4 - 1 - this.field3504;
                    this.field3501 = -this.field3501;
                    if (this.field3504 >= var3) {
                        return;
                    }
                    this.field3504 = var3 + var3 - 1 - this.field3504;
                    this.field3501 = -this.field3501;
                }
            }
        } else {
            if (this.field3497 > 0) {
                if (this.field3508) {
                    label125: {
                        if (this.field3501 < 0) {
                            if (this.field3504 >= var3) {
                                return;
                            }
                            this.field3504 = var3 + var3 - 1 - this.field3504;
                            this.field3501 = -this.field3501;
                            if (--this.field3497 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field3504 < var4) {
                                return;
                            }
                            this.field3504 = var4 + var4 - 1 - this.field3504;
                            this.field3501 = -this.field3501;
                            if (--this.field3497 == 0) {
                                break;
                            }
                            if (this.field3504 >= var3) {
                                return;
                            }
                            this.field3504 = var3 + var3 - 1 - this.field3504;
                            this.field3501 = -this.field3501;
                        } while (--this.field3497 != 0);
                    }
                } else if (this.field3501 < 0) {
                    if (this.field3504 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field3504) / var6;
                    if (var7 < this.field3497) {
                        this.field3504 += var6 * var7;
                        this.field3497 -= var7;
                        return;
                    }
                    this.field3504 += this.field3497 * var6;
                    this.field3497 = 0;
                } else {
                    if (this.field3504 < var4) {
                        return;
                    }
                    int var8 = (this.field3504 - var3) / var6;
                    if (var8 < this.field3497) {
                        this.field3504 -= var6 * var8;
                        this.field3497 -= var8;
                        return;
                    }
                    this.field3504 -= this.field3497 * var6;
                    this.field3497 = 0;
                }
            }
            if (this.field3501 < 0) {
                if (this.field3504 < 0) {
                    this.field3504 = -1;
                    this.method1516();
                    this.method952((byte) 53);
                    return;
                }
            } else if (this.field3504 >= var5) {
                this.field3504 = var5;
                this.method1516();
                this.method952((byte) 65);
            }
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Lhh;II)Lll;")
    public static final class222 method1532(class126 arg0, int arg1, int arg2) {
        return arg0.field2018 != null && arg0.field2018.length != 0 ? new class222(arg0, (int) ((long) arg0.field2019 * 256L * (long) arg1 / (long) (class296.field4841 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "(II[B[IIIIIIIILll;II)I")
    private static final int method1533(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class222 arg11, int arg12, int arg13) {
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
        arg11.field3504 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "([B[IIIIIIIILll;)I")
    private static final int method1534(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class222 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field3499 += (var14 - arg3) * arg9.field3506;
        arg9.field3496 += (var14 - arg3) * arg9.field3507;
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
        arg9.field3494 = var12 >> 2;
        arg9.field3504 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "([IIIII)I")
    private final int method1535(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field3500 <= 0) {
                if (this.field3501 == -256 && (this.field3504 & 255) == 0) {
                    if (class253.field4144) {
                        return method1519(0, ((class126) super.field581).field2018, arg0, this.field3504, arg1, this.field3499, this.field3496, 0, arg3, arg2, this);
                    }
                    return method1523(((class126) super.field581).field2018, arg0, this.field3504, arg1, this.field3494, 0, arg3, arg2, this);
                }
                if (class253.field4144) {
                    return method1533(0, 0, ((class126) super.field581).field2018, arg0, this.field3504, arg1, this.field3499, this.field3496, 0, arg3, arg2, this, this.field3501, arg4);
                }
                return method1529(0, 0, ((class126) super.field581).field2018, arg0, this.field3504, arg1, this.field3494, 0, arg3, arg2, this, this.field3501, arg4);
            }
            int var6 = this.field3500 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field3500 += arg1;
            if (this.field3501 == -256 && (this.field3504 & 255) == 0) {
                if (class253.field4144) {
                    arg1 = method1518(0, ((class126) super.field581).field2018, arg0, this.field3504, arg1, this.field3499, this.field3496, this.field3506, this.field3507, 0, var6, arg2, this);
                } else {
                    arg1 = method1512(((class126) super.field581).field2018, arg0, this.field3504, arg1, this.field3494, this.field3495, 0, var6, arg2, this);
                }
            } else if (class253.field4144) {
                arg1 = method1528(0, 0, ((class126) super.field581).field2018, arg0, this.field3504, arg1, this.field3499, this.field3496, this.field3506, this.field3507, 0, var6, arg2, this, this.field3501, arg4);
            } else {
                arg1 = method1515(0, 0, ((class126) super.field581).field2018, arg0, this.field3504, arg1, this.field3494, this.field3495, 0, var6, arg2, this, this.field3501, arg4);
            }
            this.field3500 -= arg1;
            if (this.field3500 != 0) {
                return arg1;
            }
        } while (!this.method1514());
        return arg3;
    }

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "(II[B[IIIIIIIIIILll;II)I")
    private static final int method1536(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class222 arg13, int arg14, int arg15) {
        arg13.field3494 -= arg13.field3495 * arg5;
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
        arg13.field3494 += arg13.field3495 * var22;
        arg13.field3499 = arg6;
        arg13.field3496 = arg7;
        arg13.field3504 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!ll", name = "g", descriptor = "(I)V")
    public final synchronized void method1537(int arg0) {
        this.method1545(arg0 << 6, this.method1542());
    }

    @OriginalMember(owner = "client!ll", name = "j", descriptor = "()V")
    private final void method1538() {
        this.field3494 = this.field3503;
        this.field3499 = method1526(this.field3503, this.field3498);
        this.field3496 = method1539(this.field3503, this.field3498);
    }

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "(II)I")
    private static final int method1539(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Lhh;III)Lll;")
    public static final class222 method1540(class126 arg0, int arg1, int arg2, int arg3) {
        return arg0.field2018 != null && arg0.field2018.length != 0 ? new class222(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!ll", name = "d", descriptor = "()I")
    public final int method271() {
        int var1 = this.field3494 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field3497 == 0) {
            var2 -= this.field3504 * var2 / (((class126) super.field581).field2018.length << 8);
        } else if (this.field3497 >= 0) {
            var2 -= this.field3502 * var2 / ((class126) super.field581).field2018.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!ll", name = "k", descriptor = "()I")
    public final synchronized int method1541() {
        return this.field3503 == Integer.MIN_VALUE ? 0 : this.field3503;
    }

    @OriginalMember(owner = "client!ll", name = "l", descriptor = "()I")
    public final synchronized int method1542() {
        return this.field3498 < 0 ? -1 : this.field3498;
    }

    @OriginalMember(owner = "client!ll", name = "h", descriptor = "(I)V")
    public final synchronized void method1543(int arg0) {
        if (arg0 == 0) {
            this.method1508(0);
            this.method952((byte) 118);
        } else if (this.field3499 == 0 && this.field3496 == 0) {
            this.field3500 = 0;
            this.field3503 = 0;
            this.field3494 = 0;
            this.method952((byte) 29);
        } else {
            int var2 = -this.field3494;
            if (this.field3494 > var2) {
                var2 = this.field3494;
            }
            if (-this.field3499 > var2) {
                var2 = -this.field3499;
            }
            if (this.field3499 > var2) {
                var2 = this.field3499;
            }
            if (-this.field3496 > var2) {
                var2 = -this.field3496;
            }
            if (this.field3496 > var2) {
                var2 = this.field3496;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field3500 = arg0;
            this.field3503 = Integer.MIN_VALUE;
            this.field3495 = -this.field3494 / arg0;
            this.field3506 = -this.field3499 / arg0;
            this.field3507 = -this.field3496 / arg0;
        }
    }

    @OriginalMember(owner = "client!ll", name = "<init>", descriptor = "(Lhh;II)V")
    private class222(class126 arg0, int arg1, int arg2) {
        super.field581 = arg0;
        this.field3502 = arg0.field2017;
        this.field3505 = arg0.field2015;
        this.field3508 = arg0.field2016;
        this.field3501 = arg1;
        this.field3503 = arg2;
        this.field3498 = 8192;
        this.field3504 = 0;
        this.method1538();
    }

    @OriginalMember(owner = "client!ll", name = "d", descriptor = "(II[B[IIIIIIIILll;II)I")
    private static final int method1544(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class222 arg11, int arg12, int arg13) {
        arg11.field3499 -= arg11.field3506 * arg5;
        arg11.field3496 -= arg11.field3507 * arg5;
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
        arg11.field3499 += arg11.field3506 * arg5;
        arg11.field3496 += arg11.field3507 * arg5;
        arg11.field3494 = arg6;
        arg11.field3504 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ll", name = "d", descriptor = "(II)V")
    private final synchronized void method1545(int arg0, int arg1) {
        this.field3503 = arg0;
        this.field3498 = arg1;
        this.field3500 = 0;
        this.method1538();
    }

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "()I")
    public final int method268() {
        return this.field3503 == 0 && this.field3500 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!ll", name = "<init>", descriptor = "(Lhh;III)V")
    private class222(class126 arg0, int arg1, int arg2, int arg3) {
        super.field581 = arg0;
        this.field3502 = arg0.field2017;
        this.field3505 = arg0.field2015;
        this.field3508 = arg0.field2016;
        this.field3501 = arg1;
        this.field3503 = arg2;
        this.field3498 = arg3;
        this.field3504 = 0;
        this.method1538();
    }

    @OriginalMember(owner = "client!ll", name = "i", descriptor = "(I)V")
    public final synchronized void method1546(int arg0) {
        int var2 = ((class126) super.field581).field2018.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field3504 = arg0;
    }
}
