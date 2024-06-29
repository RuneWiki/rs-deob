import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class61 extends class130 {

    @OriginalMember(owner = "client!ie", name = "J", descriptor = "I")
    private int field1510;

    @OriginalMember(owner = "client!ie", name = "L", descriptor = "I")
    private int field1512;

    @OriginalMember(owner = "client!ie", name = "I", descriptor = "Z")
    private boolean field1509;

    @OriginalMember(owner = "client!ie", name = "B", descriptor = "I")
    private int field1502;

    @OriginalMember(owner = "client!ie", name = "D", descriptor = "I")
    private int field1504;

    @OriginalMember(owner = "client!ie", name = "P", descriptor = "I")
    private int field1516;

    @OriginalMember(owner = "client!ie", name = "E", descriptor = "I")
    private int field1505;

    @OriginalMember(owner = "client!ie", name = "C", descriptor = "I")
    private int field1503;

    @OriginalMember(owner = "client!ie", name = "F", descriptor = "I")
    private int field1506;

    @OriginalMember(owner = "client!ie", name = "G", descriptor = "I")
    private int field1507;

    @OriginalMember(owner = "client!ie", name = "H", descriptor = "I")
    private int field1508;

    @OriginalMember(owner = "client!ie", name = "K", descriptor = "I")
    private int field1511;

    @OriginalMember(owner = "client!ie", name = "M", descriptor = "I")
    private int field1513;

    @OriginalMember(owner = "client!ie", name = "N", descriptor = "I")
    private int field1514;

    @OriginalMember(owner = "client!ie", name = "O", descriptor = "I")
    private int field1515;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(I[B[IIIIIIIILie;)I")
    private static final int method528(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class61 arg10) {
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
        arg10.field1505 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "()Z")
    public final boolean method529() {
        return this.field1514 != 0;
    }

    @OriginalMember(owner = "client!ie", name = "f", descriptor = "()V")
    private final void method530() {
        if (this.field1514 != 0) {
            if (this.field1504 == Integer.MIN_VALUE) {
                this.field1504 = 0;
            }
            this.field1514 = 0;
            this.method563();
        }
    }

    @OriginalMember(owner = "client!ie", name = "g", descriptor = "()I")
    public final synchronized int method531() {
        return this.field1504 == Integer.MIN_VALUE ? 0 : this.field1504;
    }

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "(I)V")
    private final synchronized void method532(int arg0) {
        this.method562(arg0, this.method548());
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(II[B[IIIIIIIILie;II)I")
    private static final int method533(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class61 arg11, int arg12, int arg13) {
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
        arg11.field1505 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(I[B[IIIIIIIIIILie;)I")
    private static final int method534(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class61 arg12) {
        arg12.field1503 += (arg10 - arg4) * arg12.field1511;
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
        arg12.field1508 = var15 >> 2;
        arg12.field1506 = var16 >> 2;
        arg12.field1505 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(II[B[IIIIIIIIIILie;II)I")
    private static final int method535(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class61 arg13, int arg14, int arg15) {
        arg13.field1503 += (arg11 - arg5) * arg13.field1511;
        int var16;
        if (arg14 == 0 || (var16 = (arg12 - arg4 + arg14 - 257) / arg14 + arg5) > arg11) {
            var16 = arg11;
        }
        int var17 = arg5 << 1;
        int var18 = var16 << 1;
        int var10001;
        while (var17 < var18) {
            int var24 = arg4 >> 8;
            byte var25 = arg2[var24];
            int var26 = (var25 << 8) + (arg4 & 255) * (arg2[var24 + 1] - var25);
            var10001 = var17++;
            arg3[var10001] += arg6 * var26 >> 6;
            arg6 += arg8;
            int var27 = var17++;
            arg3[var27] += arg7 * var26 >> 6;
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
            byte var22 = arg2[arg4 >> 8];
            int var23 = (var22 << 8) + (arg4 & 255) * (var21 - var22);
            var10001 = var17++;
            arg3[var10001] += arg6 * var23 >> 6;
            arg6 += arg8;
            var10001 = var17++;
            arg3[var10001] += arg7 * var23 >> 6;
            arg7 += arg9;
            arg4 += arg14;
        }
        arg13.field1508 = arg6;
        arg13.field1506 = arg7;
        arg13.field1505 = arg4;
        return var17 >> 1;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(III)V")
    public final synchronized void method536(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method562(arg1, arg2);
        } else {
            int var4 = method560(arg1, arg2);
            int var5 = method565(arg1, arg2);
            if (this.field1508 == var4 && this.field1506 == var5) {
                this.field1514 = 0;
            } else {
                this.field1514 = arg0;
                this.field1504 = arg1;
                this.field1516 = arg2;
                this.field1511 = (arg1 - this.field1503) / arg0;
                this.field1507 = (var4 - this.field1508) / arg0;
                this.field1515 = (var5 - this.field1506) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(I[B[IIIIIIIILie;)I")
    private static final int method537(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class61 arg10) {
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
        arg10.field1505 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "([B[IIIIIIILie;)I")
    private static final int method538(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class61 arg8) {
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
        arg8.field1505 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "(I)V")
    public final synchronized void method302(int arg0) {
        if (this.field1514 > 0) {
            if (arg0 >= this.field1514) {
                if (this.field1504 == Integer.MIN_VALUE) {
                    this.field1504 = 0;
                    this.field1503 = this.field1508 = this.field1506 = 0;
                    this.method121(false);
                    arg0 = this.field1514;
                }
                this.field1514 = 0;
                this.method563();
            } else {
                this.field1503 += this.field1511 * arg0;
                this.field1508 += this.field1507 * arg0;
                this.field1506 += this.field1515 * arg0;
                this.field1514 -= arg0;
            }
        }
        class29 var2 = (class29) super.field3125;
        int var3 = this.field1510 << 8;
        int var4 = this.field1512 << 8;
        int var5 = var2.field699.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1513 = 0;
        }
        if (this.field1505 < 0) {
            if (this.field1502 <= 0) {
                this.method530();
                this.method121(false);
                return;
            }
            this.field1505 = 0;
        }
        if (this.field1505 >= var5) {
            if (this.field1502 >= 0) {
                this.method530();
                this.method121(false);
                return;
            }
            this.field1505 = var5 - 1;
        }
        this.field1505 += this.field1502 * arg0;
        if (this.field1513 < 0) {
            if (!this.field1509) {
                if (this.field1502 < 0) {
                    if (this.field1505 < var3) {
                        this.field1505 = var4 - 1 - (var4 - 1 - this.field1505) % var6;
                    }
                } else if (this.field1505 >= var4) {
                    this.field1505 = (this.field1505 - var3) % var6 + var3;
                }
            } else {
                if (this.field1502 < 0) {
                    if (this.field1505 >= var3) {
                        return;
                    }
                    this.field1505 = var3 + var3 - 1 - this.field1505;
                    this.field1502 = -this.field1502;
                }
                while (this.field1505 >= var4) {
                    this.field1505 = var4 + var4 - 1 - this.field1505;
                    this.field1502 = -this.field1502;
                    if (this.field1505 >= var3) {
                        return;
                    }
                    this.field1505 = var3 + var3 - 1 - this.field1505;
                    this.field1502 = -this.field1502;
                }
            }
        } else {
            if (this.field1513 > 0) {
                if (this.field1509) {
                    label125: {
                        if (this.field1502 < 0) {
                            if (this.field1505 >= var3) {
                                return;
                            }
                            this.field1505 = var3 + var3 - 1 - this.field1505;
                            this.field1502 = -this.field1502;
                            if (--this.field1513 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field1505 < var4) {
                                return;
                            }
                            this.field1505 = var4 + var4 - 1 - this.field1505;
                            this.field1502 = -this.field1502;
                            if (--this.field1513 == 0) {
                                break;
                            }
                            if (this.field1505 >= var3) {
                                return;
                            }
                            this.field1505 = var3 + var3 - 1 - this.field1505;
                            this.field1502 = -this.field1502;
                        } while (--this.field1513 != 0);
                    }
                } else if (this.field1502 < 0) {
                    if (this.field1505 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field1505) / var6;
                    if (var7 < this.field1513) {
                        this.field1505 += var6 * var7;
                        this.field1513 -= var7;
                        return;
                    }
                    this.field1505 += this.field1513 * var6;
                    this.field1513 = 0;
                } else {
                    if (this.field1505 < var4) {
                        return;
                    }
                    int var8 = (this.field1505 - var3) / var6;
                    if (var8 < this.field1513) {
                        this.field1505 -= var6 * var8;
                        this.field1513 -= var8;
                        return;
                    }
                    this.field1505 -= this.field1513 * var6;
                    this.field1513 = 0;
                }
            }
            if (this.field1502 < 0) {
                if (this.field1505 < 0) {
                    this.field1505 = -1;
                    this.method530();
                    this.method121(false);
                    return;
                }
            } else if (this.field1505 >= var5) {
                this.field1505 = var5;
                this.method530();
                this.method121(false);
            }
        }
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(II[B[IIIIIIIIIILie;II)I")
    private static final int method539(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class61 arg13, int arg14, int arg15) {
        arg13.field1503 += (arg11 - arg5) * arg13.field1511;
        int var16;
        if (arg14 == 0 || (var16 = (arg12 + 256 - arg4 + arg14) / arg14 + arg5) > arg11) {
            var16 = arg11;
        }
        int var17 = arg5 << 1;
        int var18 = var16 << 1;
        int var10001;
        while (var17 < var18) {
            int var23 = arg4 >> 8;
            byte var24 = arg2[var23 - 1];
            int var25 = (var24 << 8) + (arg4 & 255) * (arg2[var23] - var24);
            var10001 = var17++;
            arg3[var10001] += arg6 * var25 >> 6;
            arg6 += arg8;
            int var26 = var17++;
            arg3[var26] += arg7 * var25 >> 6;
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
            int var22 = (var21 << 8) + (arg4 & 255) * (arg2[arg4 >> 8] - var21);
            var10001 = var17++;
            arg3[var10001] += arg6 * var22 >> 6;
            arg6 += arg8;
            var10001 = var17++;
            arg3[var10001] += arg7 * var22 >> 6;
            arg7 += arg9;
            arg4 += arg14;
        }
        arg13.field1508 = arg6;
        arg13.field1506 = arg7;
        arg13.field1505 = arg4;
        return var17 >> 1;
    }

    @OriginalMember(owner = "client!ie", name = "f", descriptor = "(I)V")
    public final synchronized void method540(int arg0) {
        if (this.field1502 < 0) {
            this.field1502 = -arg0;
        } else {
            this.field1502 = arg0;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "([B[IIIIIIIILie;)I")
    private static final int method541(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class61 arg9) {
        arg9.field1508 += (arg7 - arg3) * arg9.field1507;
        arg9.field1506 += (arg7 - arg3) * arg9.field1515;
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
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
        arg9.field1503 = var12 >> 2;
        arg9.field1505 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(II[B[IIIIIIILie;II)I")
    private static final int method542(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class61 arg10, int arg11, int arg12) {
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
        arg10.field1505 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(II[B[IIIIIIIILie;II)I")
    private static final int method543(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class61 arg11, int arg12, int arg13) {
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
        arg11.field1505 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(II[B[IIIIIIILie;II)I")
    private static final int method544(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class61 arg10, int arg11, int arg12) {
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
        arg10.field1505 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "(II[B[IIIIIIIILie;II)I")
    private static final int method545(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class61 arg11, int arg12, int arg13) {
        arg11.field1508 += (arg9 - arg5) * arg11.field1507;
        arg11.field1506 += (arg9 - arg5) * arg11.field1515;
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
        arg11.field1503 = arg6;
        arg11.field1505 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "()I")
    public final int method546() {
        int var1 = this.field1503 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1513 == 0) {
            var2 -= this.field1505 * var2 / (((class29) super.field3125).field699.length << 8);
        } else if (this.field1513 >= 0) {
            var2 -= this.field1510 * var2 / ((class29) super.field3125).field699.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!ie", name = "g", descriptor = "(I)V")
    public final synchronized void method547(int arg0) {
        this.method562(arg0 << 6, this.method548());
    }

    @OriginalMember(owner = "client!ie", name = "h", descriptor = "()I")
    public final synchronized int method548() {
        return this.field1516 < 0 ? -1 : this.field1516;
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "([III)V")
    public final synchronized void method304(int[] arg0, int arg1, int arg2) {
        if (this.field1504 == 0 && this.field1514 == 0) {
            this.method302(arg2);
        } else {
            class29 var4 = (class29) super.field3125;
            int var5 = this.field1510 << 8;
            int var6 = this.field1512 << 8;
            int var7 = var4.field699.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field1513 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field1505 < 0) {
                if (this.field1502 <= 0) {
                    this.method530();
                    this.method121(false);
                    return;
                }
                this.field1505 = 0;
            }
            if (this.field1505 >= var7) {
                if (this.field1502 >= 0) {
                    this.method530();
                    this.method121(false);
                    return;
                }
                this.field1505 = var7 - 1;
            }
            if (this.field1513 < 0) {
                if (this.field1509) {
                    if (this.field1502 < 0) {
                        var9 = this.method554(arg0, arg1, var5, var10, var4.field699[this.field1510]);
                        if (this.field1505 >= var5) {
                            return;
                        }
                        this.field1505 = var5 + var5 - 1 - this.field1505;
                        this.field1502 = -this.field1502;
                    }
                    while (true) {
                        int var11 = this.method558(arg0, var9, var6, var10, var4.field699[this.field1512 - 1]);
                        if (this.field1505 < var6) {
                            return;
                        }
                        this.field1505 = var6 + var6 - 1 - this.field1505;
                        this.field1502 = -this.field1502;
                        var9 = this.method554(arg0, var11, var5, var10, var4.field699[this.field1510]);
                        if (this.field1505 >= var5) {
                            return;
                        }
                        this.field1505 = var5 + var5 - 1 - this.field1505;
                        this.field1502 = -this.field1502;
                    }
                } else if (this.field1502 < 0) {
                    while (true) {
                        var9 = this.method554(arg0, var9, var5, var10, var4.field699[this.field1512 - 1]);
                        if (this.field1505 >= var5) {
                            return;
                        }
                        this.field1505 = var6 - 1 - (var6 - 1 - this.field1505) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method558(arg0, var9, var6, var10, var4.field699[this.field1510]);
                        if (this.field1505 < var6) {
                            return;
                        }
                        this.field1505 = (this.field1505 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field1513 > 0) {
                    if (this.field1509) {
                        label130: {
                            if (this.field1502 < 0) {
                                var9 = this.method554(arg0, arg1, var5, var10, var4.field699[this.field1510]);
                                if (this.field1505 >= var5) {
                                    return;
                                }
                                this.field1505 = var5 + var5 - 1 - this.field1505;
                                this.field1502 = -this.field1502;
                                if (--this.field1513 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method558(arg0, var9, var6, var10, var4.field699[this.field1512 - 1]);
                                if (this.field1505 < var6) {
                                    return;
                                }
                                this.field1505 = var6 + var6 - 1 - this.field1505;
                                this.field1502 = -this.field1502;
                                if (--this.field1513 == 0) {
                                    break;
                                }
                                var9 = this.method554(arg0, var9, var5, var10, var4.field699[this.field1510]);
                                if (this.field1505 >= var5) {
                                    return;
                                }
                                this.field1505 = var5 + var5 - 1 - this.field1505;
                                this.field1502 = -this.field1502;
                            } while (--this.field1513 != 0);
                        }
                    } else if (this.field1502 < 0) {
                        while (true) {
                            var9 = this.method554(arg0, var9, var5, var10, var4.field699[this.field1512 - 1]);
                            if (this.field1505 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field1505) / var8;
                            if (var12 >= this.field1513) {
                                this.field1505 += this.field1513 * var8;
                                this.field1513 = 0;
                                break;
                            }
                            this.field1505 += var8 * var12;
                            this.field1513 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method558(arg0, var9, var6, var10, var4.field699[this.field1510]);
                            if (this.field1505 < var6) {
                                return;
                            }
                            int var13 = (this.field1505 - var5) / var8;
                            if (var13 >= this.field1513) {
                                this.field1505 -= this.field1513 * var8;
                                this.field1513 = 0;
                                break;
                            }
                            this.field1505 -= var8 * var13;
                            this.field1513 -= var13;
                        }
                    }
                }
                if (this.field1502 < 0) {
                    this.method554(arg0, var9, 0, var10, 0);
                    if (this.field1505 < 0) {
                        this.field1505 = -1;
                        this.method530();
                        this.method121(false);
                        return;
                    }
                } else {
                    this.method558(arg0, var9, var7, var10, 0);
                    if (this.field1505 >= var7) {
                        this.field1505 = var7;
                        this.method530();
                        this.method121(false);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "()Lu;")
    public final class130 method300() {
        return null;
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "([B[IIIIIIIILie;)I")
    private static final int method549(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class61 arg9) {
        arg9.field1508 += (arg7 - arg3) * arg9.field1507;
        arg9.field1506 += (arg7 - arg3) * arg9.field1515;
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
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
        arg9.field1503 = var12 >> 2;
        arg9.field1505 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Le;III)Lie;")
    public static final class61 method550(class29 arg0, int arg1, int arg2, int arg3) {
        return arg0.field699 != null && arg0.field699.length != 0 ? new class61(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "([B[IIIIIIILie;)I")
    private static final int method551(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class61 arg8) {
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
        arg8.field1505 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "(Z)V")
    public final synchronized void method552(boolean arg0) {
        this.field1502 = (this.field1502 >>> 31) + (this.field1502 ^ this.field1502 >> 31);
        if (arg0) {
            this.field1502 = -this.field1502;
        }
    }

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "(II[B[IIIIIIIILie;II)I")
    private static final int method553(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class61 arg11, int arg12, int arg13) {
        arg11.field1508 += (arg9 - arg5) * arg11.field1507;
        arg11.field1506 += (arg9 - arg5) * arg11.field1515;
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
        arg11.field1503 = arg6;
        arg11.field1505 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "([IIIII)I")
    private final int method554(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        if (this.field1514 > 0) {
            int var6 = this.field1514 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field1514 += arg1;
            if (this.field1502 == -256 && (this.field1505 & 255) == 0) {
                if (class43.field949) {
                    arg1 = method534(0, ((class29) super.field3125).field699, arg0, this.field1505, arg1, this.field1508, this.field1506, this.field1507, this.field1515, 0, var6, arg2, this);
                } else {
                    arg1 = method549(((class29) super.field3125).field699, arg0, this.field1505, arg1, this.field1503, this.field1511, 0, var6, arg2, this);
                }
            } else if (class43.field949) {
                arg1 = method539(0, 0, ((class29) super.field3125).field699, arg0, this.field1505, arg1, this.field1508, this.field1506, this.field1507, this.field1515, 0, var6, arg2, this, this.field1502, arg4);
            } else {
                arg1 = method553(0, 0, ((class29) super.field3125).field699, arg0, this.field1505, arg1, this.field1503, this.field1511, 0, var6, arg2, this, this.field1502, arg4);
            }
            this.field1514 -= arg1;
            if (this.field1514 != 0) {
                return arg1;
            }
            if (this.field1504 == Integer.MIN_VALUE) {
                this.field1504 = 0;
                this.field1503 = this.field1508 = this.field1506 = 0;
                this.method121(false);
                return arg3;
            }
            this.method563();
        }
        if (this.field1502 == -256 && (this.field1505 & 255) == 0) {
            return class43.field949 ? method537(0, ((class29) super.field3125).field699, arg0, this.field1505, arg1, this.field1508, this.field1506, 0, arg3, arg2, this) : method538(((class29) super.field3125).field699, arg0, this.field1505, arg1, this.field1503, 0, arg3, arg2, this);
        } else {
            return class43.field949 ? method543(0, 0, ((class29) super.field3125).field699, arg0, this.field1505, arg1, this.field1508, this.field1506, 0, arg3, arg2, this, this.field1502, arg4) : method542(0, 0, ((class29) super.field3125).field699, arg0, this.field1505, arg1, this.field1503, 0, arg3, arg2, this, this.field1502, arg4);
        }
    }

    @OriginalMember(owner = "client!ie", name = "i", descriptor = "()I")
    public final synchronized int method555() {
        return this.field1502 < 0 ? -this.field1502 : this.field1502;
    }

    @OriginalMember(owner = "client!ie", name = "h", descriptor = "(I)V")
    public final synchronized void method556(int arg0) {
        this.field1513 = arg0;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "()I")
    public final int method306() {
        return this.field1504 == 0 && this.field1514 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Le;II)Lie;")
    public static final class61 method557(class29 arg0, int arg1, int arg2) {
        return arg0.field699 != null && arg0.field699.length != 0 ? new class61(arg0, (int) ((long) arg0.field698 * 256L * (long) arg1 / (long) (class1.field4 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "([IIIII)I")
    private final int method558(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        if (this.field1514 > 0) {
            int var6 = this.field1514 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field1514 += arg1;
            if (this.field1502 == 256 && (this.field1505 & 255) == 0) {
                if (class43.field949) {
                    arg1 = method561(0, ((class29) super.field3125).field699, arg0, this.field1505, arg1, this.field1508, this.field1506, this.field1507, this.field1515, 0, var6, arg2, this);
                } else {
                    arg1 = method541(((class29) super.field3125).field699, arg0, this.field1505, arg1, this.field1503, this.field1511, 0, var6, arg2, this);
                }
            } else if (class43.field949) {
                arg1 = method535(0, 0, ((class29) super.field3125).field699, arg0, this.field1505, arg1, this.field1508, this.field1506, this.field1507, this.field1515, 0, var6, arg2, this, this.field1502, arg4);
            } else {
                arg1 = method545(0, 0, ((class29) super.field3125).field699, arg0, this.field1505, arg1, this.field1503, this.field1511, 0, var6, arg2, this, this.field1502, arg4);
            }
            this.field1514 -= arg1;
            if (this.field1514 != 0) {
                return arg1;
            }
            if (this.field1504 == Integer.MIN_VALUE) {
                this.field1504 = 0;
                this.field1503 = this.field1508 = this.field1506 = 0;
                this.method121(false);
                return arg3;
            }
            this.method563();
        }
        if (this.field1502 == 256 && (this.field1505 & 255) == 0) {
            return class43.field949 ? method528(0, ((class29) super.field3125).field699, arg0, this.field1505, arg1, this.field1508, this.field1506, 0, arg3, arg2, this) : method551(((class29) super.field3125).field699, arg0, this.field1505, arg1, this.field1503, 0, arg3, arg2, this);
        } else {
            return class43.field949 ? method533(0, 0, ((class29) super.field3125).field699, arg0, this.field1505, arg1, this.field1508, this.field1506, 0, arg3, arg2, this, this.field1502, arg4) : method544(0, 0, ((class29) super.field3125).field699, arg0, this.field1505, arg1, this.field1503, 0, arg3, arg2, this, this.field1502, arg4);
        }
    }

    @OriginalMember(owner = "client!ie", name = "i", descriptor = "(I)V")
    public final synchronized void method559(int arg0) {
        int var2 = ((class29) super.field3125).field699.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1505 = arg0;
    }

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "()Lu;")
    public final class130 method307() {
        return null;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(II)I")
    private static final int method560(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(I[B[IIIIIIIIIILie;)I")
    private static final int method561(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class61 arg12) {
        arg12.field1503 += (arg10 - arg4) * arg12.field1511;
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
        arg12.field1508 = var15 >> 2;
        arg12.field1506 = var16 >> 2;
        arg12.field1505 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(II)V")
    private final synchronized void method562(int arg0, int arg1) {
        this.field1504 = arg0;
        this.field1516 = arg1;
        this.field1514 = 0;
        this.method563();
    }

    @OriginalMember(owner = "client!ie", name = "j", descriptor = "()V")
    private final void method563() {
        this.field1503 = this.field1504;
        this.field1508 = method560(this.field1504, this.field1516);
        this.field1506 = method565(this.field1504, this.field1516);
    }

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "(II)V")
    public final synchronized void method564(int arg0, int arg1) {
        this.method536(arg0, arg1, this.method548());
    }

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "(II)I")
    private static final int method565(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!ie", name = "j", descriptor = "(I)V")
    public final synchronized void method566(int arg0) {
        if (arg0 == 0) {
            this.method532(0);
            this.method121(false);
        } else if (this.field1508 == 0 && this.field1506 == 0) {
            this.field1514 = 0;
            this.field1504 = 0;
            this.field1503 = 0;
            this.method121(false);
        } else {
            this.field1514 = arg0;
            this.field1504 = Integer.MIN_VALUE;
            this.field1511 = -this.field1503 / arg0;
            this.field1507 = -this.field1508 / arg0;
            this.field1515 = -this.field1506 / arg0;
        }
    }

    @OriginalMember(owner = "client!ie", name = "k", descriptor = "()Z")
    public final boolean method567() {
        return this.field1505 < 0 || this.field1505 >= ((class29) super.field3125).field699.length << 8;
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(Le;II)V")
    private class61(class29 arg0, int arg1, int arg2) {
        super.field3125 = arg0;
        this.field1510 = arg0.field696;
        this.field1512 = arg0.field697;
        this.field1509 = arg0.field695;
        this.field1502 = arg1;
        this.field1504 = arg2;
        this.field1516 = 8192;
        this.field1505 = 0;
        this.method563();
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(Le;III)V")
    private class61(class29 arg0, int arg1, int arg2, int arg3) {
        super.field3125 = arg0;
        this.field1510 = arg0.field696;
        this.field1512 = arg0.field697;
        this.field1509 = arg0.field695;
        this.field1502 = arg1;
        this.field1504 = arg2;
        this.field1516 = arg3;
        this.field1505 = 0;
        this.method563();
    }
}
