import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public class class44 extends class224 {

    @OriginalMember(owner = "client!qn", name = "x", descriptor = "I")
    private int field603;

    @OriginalMember(owner = "client!qn", name = "H", descriptor = "I")
    private int field613;

    @OriginalMember(owner = "client!qn", name = "z", descriptor = "Z")
    private boolean field605;

    @OriginalMember(owner = "client!qn", name = "J", descriptor = "I")
    private int field615;

    @OriginalMember(owner = "client!qn", name = "y", descriptor = "I")
    private int field604;

    @OriginalMember(owner = "client!qn", name = "w", descriptor = "I")
    private int field602;

    @OriginalMember(owner = "client!qn", name = "K", descriptor = "I")
    private int field616;

    @OriginalMember(owner = "client!qn", name = "A", descriptor = "I")
    private int field606;

    @OriginalMember(owner = "client!qn", name = "B", descriptor = "I")
    private int field607;

    @OriginalMember(owner = "client!qn", name = "C", descriptor = "I")
    private int field608;

    @OriginalMember(owner = "client!qn", name = "D", descriptor = "I")
    private int field609;

    @OriginalMember(owner = "client!qn", name = "E", descriptor = "I")
    private int field610;

    @OriginalMember(owner = "client!qn", name = "F", descriptor = "I")
    private int field611;

    @OriginalMember(owner = "client!qn", name = "G", descriptor = "I")
    private int field612;

    @OriginalMember(owner = "client!qn", name = "I", descriptor = "I")
    private int field614;

    @OriginalMember(owner = "client!qn", name = "c", descriptor = "(I)V")
    public final synchronized void method286(int arg0) {
        this.method318(arg0 << 6, this.method294());
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(I[B[IIIIIIIILqn;)I")
    private static final int method287(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class44 arg10) {
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
        arg10.field616 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(II)V")
    public final synchronized void method288(int arg0, int arg1) {
        this.method302(arg0, arg1, this.method294());
    }

    @OriginalMember(owner = "client!qn", name = "e", descriptor = "()I")
    public final synchronized int method289() {
        return this.field615 < 0 ? -this.field615 : this.field615;
    }

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "()I")
    public final int method290() {
        int var1 = this.field614 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field612 == 0) {
            var2 -= this.field616 * var2 / (((class465) super.field2969).field6451.length << 8);
        } else if (this.field612 >= 0) {
            var2 -= this.field603 * var2 / ((class465) super.field2969).field6451.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(II[B[IIIIIIILqn;II)I")
    private static final int method291(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class44 arg10, int arg11, int arg12) {
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
        arg10.field616 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!qn", name = "d", descriptor = "(I)V")
    public final synchronized void method292(int arg0) {
        this.field612 = arg0;
    }

    @OriginalMember(owner = "client!qn", name = "f", descriptor = "()V")
    private final void method293() {
        this.field614 = this.field604;
        this.field607 = method308(this.field604, this.field602);
        this.field608 = method324(this.field604, this.field602);
    }

    @OriginalMember(owner = "client!qn", name = "g", descriptor = "()I")
    public final synchronized int method294() {
        return this.field602 < 0 ? -1 : this.field602;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(I[B[IIIIIIIIIILqn;)I")
    private static final int method295(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class44 arg12) {
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
        arg12.field614 += (var19 - arg4) * arg12.field606;
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
        arg12.field607 = var15 >> 2;
        arg12.field608 = var16 >> 2;
        arg12.field616 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!qn", name = "h", descriptor = "()Z")
    private final boolean method296() {
        int var1 = this.field604;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method308(var1, this.field602);
            var2 = method324(var1, this.field602);
        }
        if (this.field614 == var1 && this.field607 == var3 && this.field608 == var2) {
            if (this.field604 == Integer.MIN_VALUE) {
                this.field604 = 0;
                this.field614 = this.field607 = this.field608 = 0;
                this.method2614((byte) -68);
                return true;
            } else {
                this.method293();
                return false;
            }
        } else {
            if (this.field614 < var1) {
                this.field606 = 1;
                this.field609 = var1 - this.field614;
            } else if (this.field614 > var1) {
                this.field606 = -1;
                this.field609 = this.field614 - var1;
            } else {
                this.field606 = 0;
            }
            if (this.field607 < var3) {
                this.field610 = 1;
                if (this.field609 == 0 || this.field609 > var3 - this.field607) {
                    this.field609 = var3 - this.field607;
                }
            } else if (this.field607 > var3) {
                this.field610 = -1;
                if (this.field609 == 0 || this.field609 > this.field607 - var3) {
                    this.field609 = this.field607 - var3;
                }
            } else {
                this.field610 = 0;
            }
            if (this.field608 < var2) {
                this.field611 = 1;
                if (this.field609 == 0 || this.field609 > var2 - this.field608) {
                    this.field609 = var2 - this.field608;
                }
            } else if (this.field608 > var2) {
                this.field611 = -1;
                if (this.field609 == 0 || this.field609 > this.field608 - var2) {
                    this.field609 = this.field608 - var2;
                }
            } else {
                this.field611 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!qn", name = "i", descriptor = "()Z")
    public final boolean method297() {
        return this.field609 != 0;
    }

    @OriginalMember(owner = "client!qn", name = "e", descriptor = "(I)V")
    public final synchronized void method298(int arg0) {
        if (arg0 == 0) {
            this.method326(0);
            this.method2614((byte) -75);
        } else if (this.field607 == 0 && this.field608 == 0) {
            this.field609 = 0;
            this.field604 = 0;
            this.field614 = 0;
            this.method2614((byte) -68);
        } else {
            int var2 = -this.field614;
            if (this.field614 > var2) {
                var2 = this.field614;
            }
            if (-this.field607 > var2) {
                var2 = -this.field607;
            }
            if (this.field607 > var2) {
                var2 = this.field607;
            }
            if (-this.field608 > var2) {
                var2 = -this.field608;
            }
            if (this.field608 > var2) {
                var2 = this.field608;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field609 = arg0;
            this.field604 = Integer.MIN_VALUE;
            this.field606 = -this.field614 / arg0;
            this.field610 = -this.field607 / arg0;
            this.field611 = -this.field608 / arg0;
        }
    }

    @OriginalMember(owner = "client!qn", name = "f", descriptor = "(I)V")
    public final synchronized void method299(int arg0) {
        if (this.field615 < 0) {
            this.field615 = -arg0;
        } else {
            this.field615 = arg0;
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(II[B[IIIIIIIIIILqn;II)I")
    private static final int method300(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class44 arg13, int arg14, int arg15) {
        arg13.field614 -= arg13.field606 * arg5;
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
        arg13.field614 += arg13.field606 * var22;
        arg13.field607 = arg6;
        arg13.field608 = arg7;
        arg13.field616 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "([B[IIIIIIILqn;)I")
    private static final int method301(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class44 arg8) {
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
        arg8.field616 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "([III)V")
    public final synchronized void method59(int[] arg0, int arg1, int arg2) {
        if (this.field604 == 0 && this.field609 == 0) {
            this.method63(arg2);
        } else {
            class465 var4 = (class465) super.field2969;
            int var5 = this.field603 << 8;
            int var6 = this.field613 << 8;
            int var7 = var4.field6451.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field612 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field616 < 0) {
                if (this.field615 <= 0) {
                    this.method315();
                    this.method2614((byte) -124);
                    return;
                }
                this.field616 = 0;
            }
            if (this.field616 >= var7) {
                if (this.field615 >= 0) {
                    this.method315();
                    this.method2614((byte) -126);
                    return;
                }
                this.field616 = var7 - 1;
            }
            if (this.field612 < 0) {
                if (this.field605) {
                    if (this.field615 < 0) {
                        var9 = this.method303(arg0, arg1, var5, var10, var4.field6451[this.field603]);
                        if (this.field616 >= var5) {
                            return;
                        }
                        this.field616 = var5 + var5 - 1 - this.field616;
                        this.field615 = -this.field615;
                    }
                    while (true) {
                        int var11 = this.method322(arg0, var9, var6, var10, var4.field6451[this.field613 - 1]);
                        if (this.field616 < var6) {
                            return;
                        }
                        this.field616 = var6 + var6 - 1 - this.field616;
                        this.field615 = -this.field615;
                        var9 = this.method303(arg0, var11, var5, var10, var4.field6451[this.field603]);
                        if (this.field616 >= var5) {
                            return;
                        }
                        this.field616 = var5 + var5 - 1 - this.field616;
                        this.field615 = -this.field615;
                    }
                } else if (this.field615 < 0) {
                    while (true) {
                        var9 = this.method303(arg0, var9, var5, var10, var4.field6451[this.field613 - 1]);
                        if (this.field616 >= var5) {
                            return;
                        }
                        this.field616 = var6 - 1 - (var6 - 1 - this.field616) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method322(arg0, var9, var6, var10, var4.field6451[this.field603]);
                        if (this.field616 < var6) {
                            return;
                        }
                        this.field616 = (this.field616 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field612 > 0) {
                    if (this.field605) {
                        label130: {
                            if (this.field615 < 0) {
                                var9 = this.method303(arg0, arg1, var5, var10, var4.field6451[this.field603]);
                                if (this.field616 >= var5) {
                                    return;
                                }
                                this.field616 = var5 + var5 - 1 - this.field616;
                                this.field615 = -this.field615;
                                if (--this.field612 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method322(arg0, var9, var6, var10, var4.field6451[this.field613 - 1]);
                                if (this.field616 < var6) {
                                    return;
                                }
                                this.field616 = var6 + var6 - 1 - this.field616;
                                this.field615 = -this.field615;
                                if (--this.field612 == 0) {
                                    break;
                                }
                                var9 = this.method303(arg0, var9, var5, var10, var4.field6451[this.field603]);
                                if (this.field616 >= var5) {
                                    return;
                                }
                                this.field616 = var5 + var5 - 1 - this.field616;
                                this.field615 = -this.field615;
                            } while (--this.field612 != 0);
                        }
                    } else if (this.field615 < 0) {
                        while (true) {
                            var9 = this.method303(arg0, var9, var5, var10, var4.field6451[this.field613 - 1]);
                            if (this.field616 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field616) / var8;
                            if (var12 >= this.field612) {
                                this.field616 += this.field612 * var8;
                                this.field612 = 0;
                                break;
                            }
                            this.field616 += var8 * var12;
                            this.field612 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method322(arg0, var9, var6, var10, var4.field6451[this.field603]);
                            if (this.field616 < var6) {
                                return;
                            }
                            int var13 = (this.field616 - var5) / var8;
                            if (var13 >= this.field612) {
                                this.field616 -= this.field612 * var8;
                                this.field612 = 0;
                                break;
                            }
                            this.field616 -= var8 * var13;
                            this.field612 -= var13;
                        }
                    }
                }
                if (this.field615 < 0) {
                    this.method303(arg0, var9, 0, var10, 0);
                    if (this.field616 < 0) {
                        this.field616 = -1;
                        this.method315();
                        this.method2614((byte) -75);
                        return;
                    }
                } else {
                    this.method322(arg0, var9, var7, var10, 0);
                    if (this.field616 >= var7) {
                        this.field616 = var7;
                        this.method315();
                        this.method2614((byte) -81);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "(III)V")
    public final synchronized void method302(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method318(arg1, arg2);
        } else {
            int var4 = method308(arg1, arg2);
            int var5 = method324(arg1, arg2);
            if (this.field607 == var4 && this.field608 == var5) {
                this.field609 = 0;
            } else {
                int var6 = arg1 - this.field614;
                if (this.field614 - arg1 > var6) {
                    var6 = this.field614 - arg1;
                }
                if (var4 - this.field607 > var6) {
                    var6 = var4 - this.field607;
                }
                if (this.field607 - var4 > var6) {
                    var6 = this.field607 - var4;
                }
                if (var5 - this.field608 > var6) {
                    var6 = var5 - this.field608;
                }
                if (this.field608 - var5 > var6) {
                    var6 = this.field608 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field609 = arg0;
                this.field604 = arg1;
                this.field602 = arg2;
                this.field606 = (arg1 - this.field614) / arg0;
                this.field610 = (var4 - this.field607) / arg0;
                this.field611 = (var5 - this.field608) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "([IIIII)I")
    private final int method303(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field609 <= 0) {
                if (this.field615 == -256 && (this.field616 & 255) == 0) {
                    if (class267.field3526) {
                        return method320(0, ((class465) super.field2969).field6451, arg0, this.field616, arg1, this.field607, this.field608, 0, arg3, arg2, this);
                    }
                    return method304(((class465) super.field2969).field6451, arg0, this.field616, arg1, this.field614, 0, arg3, arg2, this);
                }
                if (class267.field3526) {
                    return method310(0, 0, ((class465) super.field2969).field6451, arg0, this.field616, arg1, this.field607, this.field608, 0, arg3, arg2, this, this.field615, arg4);
                }
                return method291(0, 0, ((class465) super.field2969).field6451, arg0, this.field616, arg1, this.field614, 0, arg3, arg2, this, this.field615, arg4);
            }
            int var6 = this.field609 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field609 += arg1;
            if (this.field615 == -256 && (this.field616 & 255) == 0) {
                if (class267.field3526) {
                    arg1 = method325(0, ((class465) super.field2969).field6451, arg0, this.field616, arg1, this.field607, this.field608, this.field610, this.field611, 0, var6, arg2, this);
                } else {
                    arg1 = method313(((class465) super.field2969).field6451, arg0, this.field616, arg1, this.field614, this.field606, 0, var6, arg2, this);
                }
            } else if (class267.field3526) {
                arg1 = method321(0, 0, ((class465) super.field2969).field6451, arg0, this.field616, arg1, this.field607, this.field608, this.field610, this.field611, 0, var6, arg2, this, this.field615, arg4);
            } else {
                arg1 = method307(0, 0, ((class465) super.field2969).field6451, arg0, this.field616, arg1, this.field614, this.field606, 0, var6, arg2, this, this.field615, arg4);
            }
            this.field609 -= arg1;
            if (this.field609 != 0) {
                return arg1;
            }
        } while (!this.method296());
        return arg3;
    }

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "([B[IIIIIIILqn;)I")
    private static final int method304(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class44 arg8) {
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
        arg8.field616 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!qn", name = "j", descriptor = "()I")
    public final synchronized int method305() {
        return this.field604 == Integer.MIN_VALUE ? 0 : this.field604;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(Ljn;III)Lqn;")
    public static final class44 method306(class465 arg0, int arg1, int arg2, int arg3) {
        return arg0.field6451 != null && arg0.field6451.length != 0 ? new class44(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(II[B[IIIIIIIILqn;II)I")
    private static final int method307(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class44 arg11, int arg12, int arg13) {
        arg11.field607 -= arg11.field610 * arg5;
        arg11.field608 -= arg11.field611 * arg5;
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
        arg11.field607 += arg11.field610 * arg5;
        arg11.field608 += arg11.field611 * arg5;
        arg11.field614 = arg6;
        arg11.field616 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "(II)I")
    private static final int method308(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!qn", name = "k", descriptor = "()Z")
    public final boolean method309() {
        return this.field616 < 0 || this.field616 >= ((class465) super.field2969).field6451.length << 8;
    }

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "(II[B[IIIIIIIILqn;II)I")
    private static final int method310(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class44 arg11, int arg12, int arg13) {
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
        arg11.field616 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!qn", name = "c", descriptor = "(II[B[IIIIIIIILqn;II)I")
    private static final int method311(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class44 arg11, int arg12, int arg13) {
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
        arg11.field616 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "(Z)V")
    public final synchronized void method312(boolean arg0) {
        this.field615 = (this.field615 >>> 31) + (this.field615 ^ this.field615 >> 31);
        if (arg0) {
            this.field615 = -this.field615;
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "([B[IIIIIIIILqn;)I")
    private static final int method313(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class44 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field607 += (var14 - arg3) * arg9.field610;
        arg9.field608 += (var14 - arg3) * arg9.field611;
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
        arg9.field614 = var12 >> 2;
        arg9.field616 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(Ljn;II)Lqn;")
    public static final class44 method314(class465 arg0, int arg1, int arg2) {
        return arg0.field6451 != null && arg0.field6451.length != 0 ? new class44(arg0, (int) ((long) arg0.field6447 * 256L * (long) arg1 / (long) (class165.field2290 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!qn", name = "l", descriptor = "()V")
    private final void method315() {
        if (this.field609 != 0) {
            if (this.field604 == Integer.MIN_VALUE) {
                this.field604 = 0;
            }
            this.field609 = 0;
            this.method293();
        }
    }

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "(I)V")
    public final synchronized void method63(int arg0) {
        if (this.field609 > 0) {
            if (arg0 >= this.field609) {
                if (this.field604 == Integer.MIN_VALUE) {
                    this.field604 = 0;
                    this.field614 = this.field607 = this.field608 = 0;
                    this.method2614((byte) -106);
                    arg0 = this.field609;
                }
                this.field609 = 0;
                this.method293();
            } else {
                this.field614 += this.field606 * arg0;
                this.field607 += this.field610 * arg0;
                this.field608 += this.field611 * arg0;
                this.field609 -= arg0;
            }
        }
        class465 var2 = (class465) super.field2969;
        int var3 = this.field603 << 8;
        int var4 = this.field613 << 8;
        int var5 = var2.field6451.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field612 = 0;
        }
        if (this.field616 < 0) {
            if (this.field615 <= 0) {
                this.method315();
                this.method2614((byte) -96);
                return;
            }
            this.field616 = 0;
        }
        if (this.field616 >= var5) {
            if (this.field615 >= 0) {
                this.method315();
                this.method2614((byte) -115);
                return;
            }
            this.field616 = var5 - 1;
        }
        this.field616 += this.field615 * arg0;
        if (this.field612 < 0) {
            if (!this.field605) {
                if (this.field615 < 0) {
                    if (this.field616 < var3) {
                        this.field616 = var4 - 1 - (var4 - 1 - this.field616) % var6;
                    }
                } else if (this.field616 >= var4) {
                    this.field616 = (this.field616 - var3) % var6 + var3;
                }
            } else {
                if (this.field615 < 0) {
                    if (this.field616 >= var3) {
                        return;
                    }
                    this.field616 = var3 + var3 - 1 - this.field616;
                    this.field615 = -this.field615;
                }
                while (this.field616 >= var4) {
                    this.field616 = var4 + var4 - 1 - this.field616;
                    this.field615 = -this.field615;
                    if (this.field616 >= var3) {
                        return;
                    }
                    this.field616 = var3 + var3 - 1 - this.field616;
                    this.field615 = -this.field615;
                }
            }
        } else {
            if (this.field612 > 0) {
                if (this.field605) {
                    label125: {
                        if (this.field615 < 0) {
                            if (this.field616 >= var3) {
                                return;
                            }
                            this.field616 = var3 + var3 - 1 - this.field616;
                            this.field615 = -this.field615;
                            if (--this.field612 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field616 < var4) {
                                return;
                            }
                            this.field616 = var4 + var4 - 1 - this.field616;
                            this.field615 = -this.field615;
                            if (--this.field612 == 0) {
                                break;
                            }
                            if (this.field616 >= var3) {
                                return;
                            }
                            this.field616 = var3 + var3 - 1 - this.field616;
                            this.field615 = -this.field615;
                        } while (--this.field612 != 0);
                    }
                } else if (this.field615 < 0) {
                    if (this.field616 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field616) / var6;
                    if (var7 < this.field612) {
                        this.field616 += var6 * var7;
                        this.field612 -= var7;
                        return;
                    }
                    this.field616 += this.field612 * var6;
                    this.field612 = 0;
                } else {
                    if (this.field616 < var4) {
                        return;
                    }
                    int var8 = (this.field616 - var3) / var6;
                    if (var8 < this.field612) {
                        this.field616 -= var6 * var8;
                        this.field612 -= var8;
                        return;
                    }
                    this.field616 -= this.field612 * var6;
                    this.field612 = 0;
                }
            }
            if (this.field615 < 0) {
                if (this.field616 < 0) {
                    this.field616 = -1;
                    this.method315();
                    this.method2614((byte) -94);
                    return;
                }
            } else if (this.field616 >= var5) {
                this.field616 = var5;
                this.method315();
                this.method2614((byte) -118);
            }
        }
    }

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "(II[B[IIIIIIILqn;II)I")
    private static final int method316(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class44 arg10, int arg11, int arg12) {
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
        arg10.field616 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "([B[IIIIIIIILqn;)I")
    private static final int method317(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class44 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field607 += (var14 - arg3) * arg9.field610;
        arg9.field608 += (var14 - arg3) * arg9.field611;
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
        arg9.field614 = var12 >> 2;
        arg9.field616 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!qn", name = "c", descriptor = "(II)V")
    private final synchronized void method318(int arg0, int arg1) {
        this.field604 = arg0;
        this.field602 = arg1;
        this.field609 = 0;
        this.method293();
    }

    @OriginalMember(owner = "client!qn", name = "d", descriptor = "(II[B[IIIIIIIILqn;II)I")
    private static final int method319(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class44 arg11, int arg12, int arg13) {
        arg11.field607 -= arg11.field610 * arg5;
        arg11.field608 -= arg11.field611 * arg5;
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
        arg11.field607 += arg11.field610 * arg5;
        arg11.field608 += arg11.field611 * arg5;
        arg11.field614 = arg6;
        arg11.field616 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!qn", name = "c", descriptor = "()I")
    public final int method58() {
        return this.field604 == 0 && this.field609 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!qn", name = "d", descriptor = "()Lll;")
    public final class224 method53() {
        return null;
    }

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "(I[B[IIIIIIIILqn;)I")
    private static final int method320(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class44 arg10) {
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
        arg10.field616 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "(II[B[IIIIIIIIIILqn;II)I")
    private static final int method321(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class44 arg13, int arg14, int arg15) {
        arg13.field614 -= arg13.field606 * arg5;
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
        arg13.field614 += arg13.field606 * var22;
        arg13.field607 = arg6;
        arg13.field608 = arg7;
        arg13.field616 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "([IIIII)I")
    private final int method322(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field609 <= 0) {
                if (this.field615 == 256 && (this.field616 & 255) == 0) {
                    if (class267.field3526) {
                        return method287(0, ((class465) super.field2969).field6451, arg0, this.field616, arg1, this.field607, this.field608, 0, arg3, arg2, this);
                    }
                    return method301(((class465) super.field2969).field6451, arg0, this.field616, arg1, this.field614, 0, arg3, arg2, this);
                }
                if (class267.field3526) {
                    return method311(0, 0, ((class465) super.field2969).field6451, arg0, this.field616, arg1, this.field607, this.field608, 0, arg3, arg2, this, this.field615, arg4);
                }
                return method316(0, 0, ((class465) super.field2969).field6451, arg0, this.field616, arg1, this.field614, 0, arg3, arg2, this, this.field615, arg4);
            }
            int var6 = this.field609 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field609 += arg1;
            if (this.field615 == 256 && (this.field616 & 255) == 0) {
                if (class267.field3526) {
                    arg1 = method295(0, ((class465) super.field2969).field6451, arg0, this.field616, arg1, this.field607, this.field608, this.field610, this.field611, 0, var6, arg2, this);
                } else {
                    arg1 = method317(((class465) super.field2969).field6451, arg0, this.field616, arg1, this.field614, this.field606, 0, var6, arg2, this);
                }
            } else if (class267.field3526) {
                arg1 = method300(0, 0, ((class465) super.field2969).field6451, arg0, this.field616, arg1, this.field607, this.field608, this.field610, this.field611, 0, var6, arg2, this, this.field615, arg4);
            } else {
                arg1 = method319(0, 0, ((class465) super.field2969).field6451, arg0, this.field616, arg1, this.field614, this.field606, 0, var6, arg2, this, this.field615, arg4);
            }
            this.field609 -= arg1;
            if (this.field609 != 0) {
                return arg1;
            }
        } while (!this.method296());
        return arg3;
    }

    @OriginalMember(owner = "client!qn", name = "g", descriptor = "(I)V")
    public final synchronized void method323(int arg0) {
        int var2 = ((class465) super.field2969).field6451.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field616 = arg0;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "()Lll;")
    public final class224 method56() {
        return null;
    }

    @OriginalMember(owner = "client!qn", name = "d", descriptor = "(II)I")
    private static final int method324(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "(I[B[IIIIIIIIIILqn;)I")
    private static final int method325(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class44 arg12) {
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
        arg12.field614 += (var19 - arg4) * arg12.field606;
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
        arg12.field607 = var15 >> 2;
        arg12.field608 = var16 >> 2;
        arg12.field616 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!qn", name = "h", descriptor = "(I)V")
    private final synchronized void method326(int arg0) {
        this.method318(arg0, this.method294());
    }

    @OriginalMember(owner = "client!qn", name = "<init>", descriptor = "(Ljn;II)V")
    private class44(class465 arg0, int arg1, int arg2) {
        super.field2969 = arg0;
        this.field603 = arg0.field6449;
        this.field613 = arg0.field6448;
        this.field605 = arg0.field6450;
        this.field615 = arg1;
        this.field604 = arg2;
        this.field602 = 8192;
        this.field616 = 0;
        this.method293();
    }

    @OriginalMember(owner = "client!qn", name = "<init>", descriptor = "(Ljn;III)V")
    private class44(class465 arg0, int arg1, int arg2, int arg3) {
        super.field2969 = arg0;
        this.field603 = arg0.field6449;
        this.field613 = arg0.field6448;
        this.field605 = arg0.field6450;
        this.field615 = arg1;
        this.field604 = arg2;
        this.field602 = arg3;
        this.field616 = 0;
        this.method293();
    }
}
