import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class93 extends class398 {

    @OriginalMember(owner = "client!cg", name = "B", descriptor = "I")
    private int field1493;

    @OriginalMember(owner = "client!cg", name = "z", descriptor = "I")
    private int field1491;

    @OriginalMember(owner = "client!cg", name = "t", descriptor = "Z")
    private boolean field1485;

    @OriginalMember(owner = "client!cg", name = "y", descriptor = "I")
    private int field1490;

    @OriginalMember(owner = "client!cg", name = "x", descriptor = "I")
    private int field1489;

    @OriginalMember(owner = "client!cg", name = "C", descriptor = "I")
    private int field1494;

    @OriginalMember(owner = "client!cg", name = "D", descriptor = "I")
    private int field1495;

    @OriginalMember(owner = "client!cg", name = "s", descriptor = "I")
    private int field1484;

    @OriginalMember(owner = "client!cg", name = "u", descriptor = "I")
    private int field1486;

    @OriginalMember(owner = "client!cg", name = "v", descriptor = "I")
    private int field1487;

    @OriginalMember(owner = "client!cg", name = "w", descriptor = "I")
    private int field1488;

    @OriginalMember(owner = "client!cg", name = "A", descriptor = "I")
    private int field1492;

    @OriginalMember(owner = "client!cg", name = "E", descriptor = "I")
    private int field1496;

    @OriginalMember(owner = "client!cg", name = "F", descriptor = "I")
    private int field1497;

    @OriginalMember(owner = "client!cg", name = "G", descriptor = "I")
    private int field1498;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(II[B[IIIIIIIIIILcg;II)I", line = 3)
    private static final int method676(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class93 arg13, int arg14, int arg15) {
        arg13.field1498 -= arg13.field1486 * arg5;
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
        arg13.field1498 += arg13.field1486 * var22;
        arg13.field1487 = arg6;
        arg13.field1497 = arg7;
        arg13.field1495 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(III)V", line = 45)
    public final synchronized void method677(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method687(arg1, arg2);
        } else {
            int var4 = method705(arg1, arg2);
            int var5 = method686(arg1, arg2);
            if (this.field1487 == var4 && this.field1497 == var5) {
                this.field1488 = 0;
            } else {
                int var6 = arg1 - this.field1498;
                if (this.field1498 - arg1 > var6) {
                    var6 = this.field1498 - arg1;
                }
                if (var4 - this.field1487 > var6) {
                    var6 = var4 - this.field1487;
                }
                if (this.field1487 - var4 > var6) {
                    var6 = this.field1487 - var4;
                }
                if (var5 - this.field1497 > var6) {
                    var6 = var5 - this.field1497;
                }
                if (this.field1497 - var5 > var6) {
                    var6 = this.field1497 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field1488 = arg0;
                this.field1489 = arg1;
                this.field1494 = arg2;
                this.field1486 = (arg1 - this.field1498) / arg0;
                this.field1492 = (var4 - this.field1487) / arg0;
                this.field1496 = (var5 - this.field1497) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "()V", line = 91)
    private final void method678() {
        this.field1498 = this.field1489;
        this.field1487 = method705(this.field1489, this.field1494);
        this.field1497 = method686(this.field1489, this.field1494);
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "([IIIII)I", line = 96)
    private final int method679(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field1488 <= 0) {
                if (this.field1490 == -256 && (this.field1495 & 255) == 0) {
                    if (class385.field5498) {
                        return method714(0, ((class407) super.field5652).field5779, arg0, this.field1495, arg1, this.field1487, this.field1497, 0, arg3, arg2, this);
                    }
                    return method695(((class407) super.field5652).field5779, arg0, this.field1495, arg1, this.field1498, 0, arg3, arg2, this);
                }
                if (class385.field5498) {
                    return method684(0, 0, ((class407) super.field5652).field5779, arg0, this.field1495, arg1, this.field1487, this.field1497, 0, arg3, arg2, this, this.field1490, arg4);
                }
                return method683(0, 0, ((class407) super.field5652).field5779, arg0, this.field1495, arg1, this.field1498, 0, arg3, arg2, this, this.field1490, arg4);
            }
            int var6 = this.field1488 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field1488 += arg1;
            if (this.field1490 == -256 && (this.field1495 & 255) == 0) {
                if (class385.field5498) {
                    arg1 = method709(0, ((class407) super.field5652).field5779, arg0, this.field1495, arg1, this.field1487, this.field1497, this.field1492, this.field1496, 0, var6, arg2, this);
                } else {
                    arg1 = method721(((class407) super.field5652).field5779, arg0, this.field1495, arg1, this.field1498, this.field1486, 0, var6, arg2, this);
                }
            } else if (class385.field5498) {
                arg1 = method704(0, 0, ((class407) super.field5652).field5779, arg0, this.field1495, arg1, this.field1487, this.field1497, this.field1492, this.field1496, 0, var6, arg2, this, this.field1490, arg4);
            } else {
                arg1 = method716(0, 0, ((class407) super.field5652).field5779, arg0, this.field1495, arg1, this.field1498, this.field1486, 0, var6, arg2, this, this.field1490, arg4);
            }
            this.field1488 -= arg1;
            if (this.field1488 != 0) {
                return arg1;
            }
        } while (!this.method707());
        return arg3;
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(I)V", line = 152)
    public final synchronized void method680(int arg0) {
        if (this.field1490 < 0) {
            this.field1490 = -arg0;
        } else {
            this.field1490 = arg0;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(I[B[IIIIIIIIIILcg;)I", line = 159)
    private static final int method681(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class93 arg12) {
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
        arg12.field1498 += (var19 - arg4) * arg12.field1486;
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
        arg12.field1487 = var15 >> 2;
        arg12.field1497 = var16 >> 2;
        arg12.field1495 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(I[B[IIIIIIIILcg;)I", line = 212)
    private static final int method682(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class93 arg10) {
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
        arg10.field1495 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(II[B[IIIIIIILcg;II)I", line = 252)
    private static final int method683(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class93 arg10, int arg11, int arg12) {
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
        arg10.field1495 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(II[B[IIIIIIIILcg;II)I", line = 278)
    private static final int method684(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class93 arg11, int arg12, int arg13) {
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
        arg11.field1495 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "()Z", line = 311)
    public final boolean method685() {
        return this.field1495 < 0 || this.field1495 >= ((class407) super.field5652).field5779.length << 8;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(II)I", line = 314)
    private static final int method686(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(II)V", line = 318)
    private final synchronized void method687(int arg0, int arg1) {
        this.field1489 = arg0;
        this.field1494 = arg1;
        this.field1488 = 0;
        this.method678();
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lcv;III)Lcg;", line = 325)
    public static final class93 method688(class407 arg0, int arg1, int arg2, int arg3) {
        return arg0.field5779 != null && arg0.field5779.length != 0 ? new class93(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "()I", line = 331)
    public final synchronized int method689() {
        return this.field1494 < 0 ? -1 : this.field1494;
    }

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "(I)V", line = 335)
    public final synchronized void method690(int arg0) {
        if (arg0 == 0) {
            this.method701(0);
            this.method421(22071);
        } else if (this.field1487 == 0 && this.field1497 == 0) {
            this.field1488 = 0;
            this.field1489 = 0;
            this.field1498 = 0;
            this.method421(22071);
        } else {
            int var2 = -this.field1498;
            if (this.field1498 > var2) {
                var2 = this.field1498;
            }
            if (-this.field1487 > var2) {
                var2 = -this.field1487;
            }
            if (this.field1487 > var2) {
                var2 = this.field1487;
            }
            if (-this.field1497 > var2) {
                var2 = -this.field1497;
            }
            if (this.field1497 > var2) {
                var2 = this.field1497;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1488 = arg0;
            this.field1489 = Integer.MIN_VALUE;
            this.field1486 = -this.field1498 / arg0;
            this.field1492 = -this.field1487 / arg0;
            this.field1496 = -this.field1497 / arg0;
        }
    }

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "(I)V", line = 380)
    public final synchronized void method691(int arg0) {
        this.field1484 = arg0;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "()I", line = 385)
    public final int method692() {
        return this.field1489 == 0 && this.field1488 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "()Lpo;", line = 392)
    public final class398 method693() {
        return null;
    }

    @OriginalMember(owner = "client!cg", name = "h", descriptor = "()I", line = 396)
    public final synchronized int method694() {
        return this.field1489 == Integer.MIN_VALUE ? 0 : this.field1489;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "([B[IIIIIIILcg;)I", line = 399)
    private static final int method695(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class93 arg8) {
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
        arg8.field1495 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lcv;II)Lcg;", line = 427)
    public static final class93 method696(class407 arg0, int arg1, int arg2) {
        return arg0.field5779 != null && arg0.field5779.length != 0 ? new class93(arg0, (int) ((long) arg0.field5782 * 256L * (long) arg1 / (long) (class120.field1877 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(I)V", line = 434)
    public final synchronized void method697(int arg0) {
        if (this.field1488 > 0) {
            if (arg0 >= this.field1488) {
                if (this.field1489 == Integer.MIN_VALUE) {
                    this.field1489 = 0;
                    this.field1498 = this.field1487 = this.field1497 = 0;
                    this.method421(22071);
                    arg0 = this.field1488;
                }
                this.field1488 = 0;
                this.method678();
            } else {
                this.field1498 += this.field1486 * arg0;
                this.field1487 += this.field1492 * arg0;
                this.field1497 += this.field1496 * arg0;
                this.field1488 -= arg0;
            }
        }
        class407 var2 = (class407) super.field5652;
        int var3 = this.field1493 << 8;
        int var4 = this.field1491 << 8;
        int var5 = var2.field5779.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1484 = 0;
        }
        if (this.field1495 < 0) {
            if (this.field1490 <= 0) {
                this.method711();
                this.method421(22071);
                return;
            }
            this.field1495 = 0;
        }
        if (this.field1495 >= var5) {
            if (this.field1490 >= 0) {
                this.method711();
                this.method421(22071);
                return;
            }
            this.field1495 = var5 - 1;
        }
        this.field1495 += this.field1490 * arg0;
        if (this.field1484 < 0) {
            if (!this.field1485) {
                if (this.field1490 < 0) {
                    if (this.field1495 < var3) {
                        this.field1495 = var4 - 1 - (var4 - 1 - this.field1495) % var6;
                    }
                } else if (this.field1495 >= var4) {
                    this.field1495 = (this.field1495 - var3) % var6 + var3;
                }
            } else {
                if (this.field1490 < 0) {
                    if (this.field1495 >= var3) {
                        return;
                    }
                    this.field1495 = var3 + var3 - 1 - this.field1495;
                    this.field1490 = -this.field1490;
                }
                while (this.field1495 >= var4) {
                    this.field1495 = var4 + var4 - 1 - this.field1495;
                    this.field1490 = -this.field1490;
                    if (this.field1495 >= var3) {
                        return;
                    }
                    this.field1495 = var3 + var3 - 1 - this.field1495;
                    this.field1490 = -this.field1490;
                }
            }
        } else {
            if (this.field1484 > 0) {
                if (this.field1485) {
                    label125: {
                        if (this.field1490 < 0) {
                            if (this.field1495 >= var3) {
                                return;
                            }
                            this.field1495 = var3 + var3 - 1 - this.field1495;
                            this.field1490 = -this.field1490;
                            if (--this.field1484 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field1495 < var4) {
                                return;
                            }
                            this.field1495 = var4 + var4 - 1 - this.field1495;
                            this.field1490 = -this.field1490;
                            if (--this.field1484 == 0) {
                                break;
                            }
                            if (this.field1495 >= var3) {
                                return;
                            }
                            this.field1495 = var3 + var3 - 1 - this.field1495;
                            this.field1490 = -this.field1490;
                        } while (--this.field1484 != 0);
                    }
                } else if (this.field1490 < 0) {
                    if (this.field1495 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field1495) / var6;
                    if (var7 < this.field1484) {
                        this.field1495 += var6 * var7;
                        this.field1484 -= var7;
                        return;
                    }
                    this.field1495 += this.field1484 * var6;
                    this.field1484 = 0;
                } else {
                    if (this.field1495 < var4) {
                        return;
                    }
                    int var8 = (this.field1495 - var3) / var6;
                    if (var8 < this.field1484) {
                        this.field1495 -= var6 * var8;
                        this.field1484 -= var8;
                        return;
                    }
                    this.field1495 -= this.field1484 * var6;
                    this.field1484 = 0;
                }
            }
            if (this.field1490 < 0) {
                if (this.field1495 < 0) {
                    this.field1495 = -1;
                    this.method711();
                    this.method421(22071);
                    return;
                }
            } else if (this.field1495 >= var5) {
                this.field1495 = var5;
                this.method711();
                this.method421(22071);
            }
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Z)V", line = 652)
    public final synchronized void method698(boolean arg0) {
        this.field1490 = (this.field1490 >>> 31) + (this.field1490 ^ this.field1490 >> 31);
        if (arg0) {
            this.field1490 = -this.field1490;
        }
    }

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "(II)V", line = 658)
    public final synchronized void method699(int arg0, int arg1) {
        this.method677(arg0, arg1, this.method689());
    }

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "()Lpo;", line = 661)
    public final class398 method700() {
        return null;
    }

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "(I)V", line = 664)
    private final synchronized void method701(int arg0) {
        this.method687(arg0, this.method689());
    }

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "()I", line = 669)
    public final int method702() {
        int var1 = this.field1498 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1484 == 0) {
            var2 -= this.field1495 * var2 / (((class407) super.field5652).field5779.length << 8);
        } else if (this.field1484 >= 0) {
            var2 -= this.field1493 * var2 / ((class407) super.field5652).field5779.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "([IIIII)I", line = 681)
    private final int method703(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field1488 <= 0) {
                if (this.field1490 == 256 && (this.field1495 & 255) == 0) {
                    if (class385.field5498) {
                        return method682(0, ((class407) super.field5652).field5779, arg0, this.field1495, arg1, this.field1487, this.field1497, 0, arg3, arg2, this);
                    }
                    return method706(((class407) super.field5652).field5779, arg0, this.field1495, arg1, this.field1498, 0, arg3, arg2, this);
                }
                if (class385.field5498) {
                    return method712(0, 0, ((class407) super.field5652).field5779, arg0, this.field1495, arg1, this.field1487, this.field1497, 0, arg3, arg2, this, this.field1490, arg4);
                }
                return method708(0, 0, ((class407) super.field5652).field5779, arg0, this.field1495, arg1, this.field1498, 0, arg3, arg2, this, this.field1490, arg4);
            }
            int var6 = this.field1488 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field1488 += arg1;
            if (this.field1490 == 256 && (this.field1495 & 255) == 0) {
                if (class385.field5498) {
                    arg1 = method681(0, ((class407) super.field5652).field5779, arg0, this.field1495, arg1, this.field1487, this.field1497, this.field1492, this.field1496, 0, var6, arg2, this);
                } else {
                    arg1 = method718(((class407) super.field5652).field5779, arg0, this.field1495, arg1, this.field1498, this.field1486, 0, var6, arg2, this);
                }
            } else if (class385.field5498) {
                arg1 = method676(0, 0, ((class407) super.field5652).field5779, arg0, this.field1495, arg1, this.field1487, this.field1497, this.field1492, this.field1496, 0, var6, arg2, this, this.field1490, arg4);
            } else {
                arg1 = method720(0, 0, ((class407) super.field5652).field5779, arg0, this.field1495, arg1, this.field1498, this.field1486, 0, var6, arg2, this, this.field1490, arg4);
            }
            this.field1488 -= arg1;
            if (this.field1488 != 0) {
                return arg1;
            }
        } while (!this.method707());
        return arg3;
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(II[B[IIIIIIIIIILcg;II)I", line = 737)
    private static final int method704(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class93 arg13, int arg14, int arg15) {
        arg13.field1498 -= arg13.field1486 * arg5;
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
        arg13.field1498 += arg13.field1486 * var22;
        arg13.field1487 = arg6;
        arg13.field1497 = arg7;
        arg13.field1495 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "(II)I", line = 778)
    private static final int method705(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "([B[IIIIIIILcg;)I", line = 782)
    private static final int method706(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class93 arg8) {
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
        arg8.field1495 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!cg", name = "i", descriptor = "()Z", line = 809)
    private final boolean method707() {
        int var1 = this.field1489;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method705(var1, this.field1494);
            var2 = method686(var1, this.field1494);
        }
        if (this.field1498 == var1 && this.field1487 == var3 && this.field1497 == var2) {
            if (this.field1489 == Integer.MIN_VALUE) {
                this.field1489 = 0;
                this.field1498 = this.field1487 = this.field1497 = 0;
                this.method421(22071);
                return true;
            } else {
                this.method678();
                return false;
            }
        } else {
            if (this.field1498 < var1) {
                this.field1486 = 1;
                this.field1488 = var1 - this.field1498;
            } else if (this.field1498 > var1) {
                this.field1486 = -1;
                this.field1488 = this.field1498 - var1;
            } else {
                this.field1486 = 0;
            }
            if (this.field1487 < var3) {
                this.field1492 = 1;
                if (this.field1488 == 0 || this.field1488 > var3 - this.field1487) {
                    this.field1488 = var3 - this.field1487;
                }
            } else if (this.field1487 > var3) {
                this.field1492 = -1;
                if (this.field1488 == 0 || this.field1488 > this.field1487 - var3) {
                    this.field1488 = this.field1487 - var3;
                }
            } else {
                this.field1492 = 0;
            }
            if (this.field1497 < var2) {
                this.field1496 = 1;
                if (this.field1488 == 0 || this.field1488 > var2 - this.field1497) {
                    this.field1488 = var2 - this.field1497;
                }
            } else if (this.field1497 > var2) {
                this.field1496 = -1;
                if (this.field1488 == 0 || this.field1488 > this.field1497 - var2) {
                    this.field1488 = this.field1497 - var2;
                }
            } else {
                this.field1496 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(II[B[IIIIIIILcg;II)I", line = 895)
    private static final int method708(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class93 arg10, int arg11, int arg12) {
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
        arg10.field1495 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(I[B[IIIIIIIIIILcg;)I", line = 921)
    private static final int method709(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class93 arg12) {
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
        arg12.field1498 += (var19 - arg4) * arg12.field1486;
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
        arg12.field1487 = var15 >> 2;
        arg12.field1497 = var16 >> 2;
        arg12.field1495 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!cg", name = "j", descriptor = "()Z", line = 975)
    public final boolean method710() {
        return this.field1488 != 0;
    }

    @OriginalMember(owner = "client!cg", name = "k", descriptor = "()V", line = 978)
    private final void method711() {
        if (this.field1488 != 0) {
            if (this.field1489 == Integer.MIN_VALUE) {
                this.field1489 = 0;
            }
            this.field1488 = 0;
            this.method678();
        }
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(II[B[IIIIIIIILcg;II)I", line = 989)
    private static final int method712(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class93 arg11, int arg12, int arg13) {
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
        arg11.field1495 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "(I)V", line = 1023)
    public final synchronized void method713(int arg0) {
        int var2 = ((class407) super.field5652).field5779.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1495 = arg0;
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(I[B[IIIIIIIILcg;)I", line = 1036)
    private static final int method714(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class93 arg10) {
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
        arg10.field1495 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!cg", name = "h", descriptor = "(I)V", line = 1075)
    public final synchronized void method715(int arg0) {
        this.method687(arg0 << 6, this.method689());
    }

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "(II[B[IIIIIIIILcg;II)I", line = 1080)
    private static final int method716(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class93 arg11, int arg12, int arg13) {
        arg11.field1487 -= arg11.field1492 * arg5;
        arg11.field1497 -= arg11.field1496 * arg5;
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
        arg11.field1487 += arg11.field1492 * arg5;
        arg11.field1497 += arg11.field1496 * arg5;
        arg11.field1498 = arg6;
        arg11.field1495 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "([III)V", line = 1115)
    public final synchronized void method717(int[] arg0, int arg1, int arg2) {
        if (this.field1489 == 0 && this.field1488 == 0) {
            this.method697(arg2);
        } else {
            class407 var4 = (class407) super.field5652;
            int var5 = this.field1493 << 8;
            int var6 = this.field1491 << 8;
            int var7 = var4.field5779.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field1484 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field1495 < 0) {
                if (this.field1490 <= 0) {
                    this.method711();
                    this.method421(22071);
                    return;
                }
                this.field1495 = 0;
            }
            if (this.field1495 >= var7) {
                if (this.field1490 >= 0) {
                    this.method711();
                    this.method421(22071);
                    return;
                }
                this.field1495 = var7 - 1;
            }
            if (this.field1484 < 0) {
                if (this.field1485) {
                    if (this.field1490 < 0) {
                        var9 = this.method679(arg0, arg1, var5, var10, var4.field5779[this.field1493]);
                        if (this.field1495 >= var5) {
                            return;
                        }
                        this.field1495 = var5 + var5 - 1 - this.field1495;
                        this.field1490 = -this.field1490;
                    }
                    while (true) {
                        int var11 = this.method703(arg0, var9, var6, var10, var4.field5779[this.field1491 - 1]);
                        if (this.field1495 < var6) {
                            return;
                        }
                        this.field1495 = var6 + var6 - 1 - this.field1495;
                        this.field1490 = -this.field1490;
                        var9 = this.method679(arg0, var11, var5, var10, var4.field5779[this.field1493]);
                        if (this.field1495 >= var5) {
                            return;
                        }
                        this.field1495 = var5 + var5 - 1 - this.field1495;
                        this.field1490 = -this.field1490;
                    }
                } else if (this.field1490 < 0) {
                    while (true) {
                        var9 = this.method679(arg0, var9, var5, var10, var4.field5779[this.field1491 - 1]);
                        if (this.field1495 >= var5) {
                            return;
                        }
                        this.field1495 = var6 - 1 - (var6 - 1 - this.field1495) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method703(arg0, var9, var6, var10, var4.field5779[this.field1493]);
                        if (this.field1495 < var6) {
                            return;
                        }
                        this.field1495 = (this.field1495 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field1484 > 0) {
                    if (this.field1485) {
                        label130: {
                            if (this.field1490 < 0) {
                                var9 = this.method679(arg0, arg1, var5, var10, var4.field5779[this.field1493]);
                                if (this.field1495 >= var5) {
                                    return;
                                }
                                this.field1495 = var5 + var5 - 1 - this.field1495;
                                this.field1490 = -this.field1490;
                                if (--this.field1484 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method703(arg0, var9, var6, var10, var4.field5779[this.field1491 - 1]);
                                if (this.field1495 < var6) {
                                    return;
                                }
                                this.field1495 = var6 + var6 - 1 - this.field1495;
                                this.field1490 = -this.field1490;
                                if (--this.field1484 == 0) {
                                    break;
                                }
                                var9 = this.method679(arg0, var9, var5, var10, var4.field5779[this.field1493]);
                                if (this.field1495 >= var5) {
                                    return;
                                }
                                this.field1495 = var5 + var5 - 1 - this.field1495;
                                this.field1490 = -this.field1490;
                            } while (--this.field1484 != 0);
                        }
                    } else if (this.field1490 < 0) {
                        while (true) {
                            var9 = this.method679(arg0, var9, var5, var10, var4.field5779[this.field1491 - 1]);
                            if (this.field1495 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field1495) / var8;
                            if (var12 >= this.field1484) {
                                this.field1495 += this.field1484 * var8;
                                this.field1484 = 0;
                                break;
                            }
                            this.field1495 += var8 * var12;
                            this.field1484 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method703(arg0, var9, var6, var10, var4.field5779[this.field1493]);
                            if (this.field1495 < var6) {
                                return;
                            }
                            int var13 = (this.field1495 - var5) / var8;
                            if (var13 >= this.field1484) {
                                this.field1495 -= this.field1484 * var8;
                                this.field1484 = 0;
                                break;
                            }
                            this.field1495 -= var8 * var13;
                            this.field1484 -= var13;
                        }
                    }
                }
                if (this.field1490 < 0) {
                    this.method679(arg0, var9, 0, var10, 0);
                    if (this.field1495 < 0) {
                        this.field1495 = -1;
                        this.method711();
                        this.method421(22071);
                        return;
                    }
                } else {
                    this.method703(arg0, var9, var7, var10, 0);
                    if (this.field1495 >= var7) {
                        this.field1495 = var7;
                        this.method711();
                        this.method421(22071);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "([B[IIIIIIIILcg;)I", line = 1352)
    private static final int method718(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class93 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1487 += (var14 - arg3) * arg9.field1492;
        arg9.field1497 += (var14 - arg3) * arg9.field1496;
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
        arg9.field1498 = var12 >> 2;
        arg9.field1495 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!cg", name = "l", descriptor = "()I", line = 1386)
    public final synchronized int method719() {
        return this.field1490 < 0 ? -this.field1490 : this.field1490;
    }

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "(II[B[IIIIIIIILcg;II)I", line = 1389)
    private static final int method720(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class93 arg11, int arg12, int arg13) {
        arg11.field1487 -= arg11.field1492 * arg5;
        arg11.field1497 -= arg11.field1496 * arg5;
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
        arg11.field1487 += arg11.field1492 * arg5;
        arg11.field1497 += arg11.field1496 * arg5;
        arg11.field1498 = arg6;
        arg11.field1495 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "([B[IIIIIIIILcg;)I", line = 1423)
    private static final int method721(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class93 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1487 += (var14 - arg3) * arg9.field1492;
        arg9.field1497 += (var14 - arg3) * arg9.field1496;
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
        arg9.field1498 = var12 >> 2;
        arg9.field1495 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(Lcv;II)V", line = 1457)
    private class93(class407 arg0, int arg1, int arg2) {
        super.field5652 = arg0;
        this.field1493 = arg0.field5783;
        this.field1491 = arg0.field5781;
        this.field1485 = arg0.field5780;
        this.field1490 = arg1;
        this.field1489 = arg2;
        this.field1494 = 8192;
        this.field1495 = 0;
        this.method678();
    }

    @OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(Lcv;III)V", line = 1468)
    private class93(class407 arg0, int arg1, int arg2, int arg3) {
        super.field5652 = arg0;
        this.field1493 = arg0.field5783;
        this.field1491 = arg0.field5781;
        this.field1485 = arg0.field5780;
        this.field1490 = arg1;
        this.field1489 = arg2;
        this.field1494 = arg3;
        this.field1495 = 0;
        this.method678();
    }
}
