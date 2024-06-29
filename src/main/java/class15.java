import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class15 extends class31 {

    @OriginalMember(owner = "client!c", name = "E", descriptor = "I")
    private int field367;

    @OriginalMember(owner = "client!c", name = "M", descriptor = "I")
    private int field374;

    @OriginalMember(owner = "client!c", name = "I", descriptor = "Z")
    private boolean field371;

    @OriginalMember(owner = "client!c", name = "F", descriptor = "I")
    private int field368;

    @OriginalMember(owner = "client!c", name = "y", descriptor = "I")
    private int field362;

    @OriginalMember(owner = "client!c", name = "C", descriptor = "I")
    private int field366;

    @OriginalMember(owner = "client!c", name = "x", descriptor = "I")
    private int field361;

    @OriginalMember(owner = "client!c", name = "z", descriptor = "I")
    private int field363;

    @OriginalMember(owner = "client!c", name = "A", descriptor = "I")
    private int field364;

    @OriginalMember(owner = "client!c", name = "B", descriptor = "I")
    private int field365;

    @OriginalMember(owner = "client!c", name = "G", descriptor = "I")
    private int field369;

    @OriginalMember(owner = "client!c", name = "H", descriptor = "I")
    private int field370;

    @OriginalMember(owner = "client!c", name = "J", descriptor = "I")
    private int field372;

    @OriginalMember(owner = "client!c", name = "L", descriptor = "I")
    private int field373;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "([IIIII)I")
    private final int method115(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        if (this.field363 > 0) {
            int var6 = this.field363 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field363 += arg1;
            if (this.field368 == -256 && (this.field361 & 255) == 0) {
                if (class121.field2826) {
                    arg1 = method133(0, ((class140) super.field678).field3259, arg0, this.field361, arg1, this.field362, this.field366, this.field364, this.field372, this.field365, 0, var6, arg2, this);
                } else {
                    arg1 = method122(((class140) super.field678).field3259, arg0, this.field361, arg1, this.field362, this.field364, this.field372, 0, var6, arg2, this);
                }
            } else if (class121.field2826) {
                arg1 = method138(0, 0, ((class140) super.field678).field3259, arg0, this.field361, arg1, this.field362, this.field366, this.field364, this.field372, this.field365, 0, var6, arg2, this, this.field368, arg4);
            } else {
                arg1 = method129(0, 0, ((class140) super.field678).field3259, arg0, this.field361, arg1, this.field362, this.field364, this.field372, 0, var6, arg2, this, this.field368, arg4);
            }
            this.field363 -= arg1;
            if (this.field363 != 0) {
                return arg1;
            }
            this.field366 = this.field370;
            if (this.field373 == Integer.MIN_VALUE) {
                this.field362 = 0;
                this.method776(0);
                return arg3;
            }
            this.field362 = this.field373;
        }
        if (this.field368 == -256 && (this.field361 & 255) == 0) {
            return class121.field2826 ? method141(0, ((class140) super.field678).field3259, arg0, this.field361, arg1, this.method124(), this.method132(), 0, arg3, arg2, this) : method121(((class140) super.field678).field3259, arg0, this.field361, arg1, this.field362, 0, arg3, arg2, this);
        } else {
            return class121.field2826 ? method137(0, 0, ((class140) super.field678).field3259, arg0, this.field361, arg1, this.method124(), this.method132(), 0, arg3, arg2, this, this.field368, arg4) : method142(0, 0, ((class140) super.field678).field3259, arg0, this.field361, arg1, this.field362, 0, arg3, arg2, this, this.field368, arg4);
        }
    }

    @OriginalMember(owner = "client!c", name = "c", descriptor = "()Leb;")
    public final class31 method116() {
        return null;
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(I)V")
    public final synchronized void method117(int arg0) {
        if (!this.method126()) {
            if (this.field363 > 0) {
                if (arg0 >= this.field363) {
                    if (this.field373 == Integer.MIN_VALUE) {
                        this.field362 = 0;
                        this.method776(0);
                        arg0 = this.field363;
                    } else {
                        this.field362 = this.field373;
                    }
                    this.field366 = this.field370;
                    this.field363 = 0;
                } else {
                    this.field362 += this.field372 * arg0;
                    if (class121.field2826) {
                        this.field366 += this.field365 * arg0;
                    }
                    this.field363 -= arg0;
                }
            }
            class140 var2 = (class140) super.field678;
            int var3 = this.field367 << 8;
            int var4 = this.field374 << 8;
            int var5 = var2.field3259.length << 8;
            int var6 = var4 - var3;
            if (var6 <= 0) {
                this.field369 = 0;
            }
            if (this.field361 < 0) {
                if (this.field368 <= 0) {
                    this.method139();
                    this.method776(0);
                    return;
                }
                this.field361 = 0;
            }
            if (this.field361 >= var5) {
                if (this.field368 >= 0) {
                    this.method139();
                    this.method776(0);
                    return;
                }
                this.field361 = var5 - 1;
            }
            this.field361 += this.field368 * arg0;
            if (this.field369 < 0) {
                if (!this.field371) {
                    if (this.field368 < 0) {
                        if (this.field361 < var3) {
                            this.field361 = var4 - 1 - (var4 - 1 - this.field361) % var6;
                        }
                    } else if (this.field361 >= var4) {
                        this.field361 = (this.field361 - var3) % var6 + var3;
                    }
                } else {
                    if (this.field368 < 0) {
                        if (this.field361 >= var3) {
                            return;
                        }
                        this.field361 = var3 + var3 - 1 - this.field361;
                        this.field368 = -this.field368;
                    }
                    while (this.field361 >= var4) {
                        this.field361 = var4 + var4 - 1 - this.field361;
                        this.field368 = -this.field368;
                        if (this.field361 >= var3) {
                            return;
                        }
                        this.field361 = var3 + var3 - 1 - this.field361;
                        this.field368 = -this.field368;
                    }
                }
            } else {
                if (this.field369 > 0) {
                    if (this.field371) {
                        label133: {
                            if (this.field368 < 0) {
                                if (this.field361 >= var3) {
                                    return;
                                }
                                this.field361 = var3 + var3 - 1 - this.field361;
                                this.field368 = -this.field368;
                                if (--this.field369 == 0) {
                                    break label133;
                                }
                            }
                            do {
                                if (this.field361 < var4) {
                                    return;
                                }
                                this.field361 = var4 + var4 - 1 - this.field361;
                                this.field368 = -this.field368;
                                if (--this.field369 == 0) {
                                    break;
                                }
                                if (this.field361 >= var3) {
                                    return;
                                }
                                this.field361 = var3 + var3 - 1 - this.field361;
                                this.field368 = -this.field368;
                            } while (--this.field369 != 0);
                        }
                    } else if (this.field368 < 0) {
                        if (this.field361 >= var3) {
                            return;
                        }
                        int var7 = (var4 - 1 - this.field361) / var6;
                        if (var7 < this.field369) {
                            this.field361 += var6 * var7;
                            this.field369 -= var7;
                            return;
                        }
                        this.field361 += this.field369 * var6;
                        this.field369 = 0;
                    } else {
                        if (this.field361 < var4) {
                            return;
                        }
                        int var8 = (this.field361 - var3) / var6;
                        if (var8 < this.field369) {
                            this.field361 -= var6 * var8;
                            this.field369 -= var8;
                            return;
                        }
                        this.field361 -= this.field369 * var6;
                        this.field369 = 0;
                    }
                }
                if (this.field368 < 0) {
                    if (this.field361 < 0) {
                        this.field361 = -1;
                        this.method139();
                        this.method776(0);
                        return;
                    }
                } else if (this.field361 >= var5) {
                    this.field361 = var5;
                    this.method139();
                    this.method776(0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!c", name = "e", descriptor = "()I")
    private final synchronized int method118() {
        return this.field363 > 0 ? this.field370 : this.field366;
    }

    @OriginalMember(owner = "client!c", name = "c", descriptor = "(I)V")
    public final synchronized void method119(int arg0) {
        this.field369 = arg0;
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "()Leb;")
    public final class31 method120() {
        return null;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "([B[IIIIIIILc;)I")
    private static final int method121(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class15 arg8) {
        int var9 = arg2 >> 8;
        int var10 = arg7 >> 8;
        int var11 = arg4 << 8;
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
        arg8.field361 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "([B[IIIIIIIIILc;)I")
    private static final int method122(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class15 arg10) {
        int var11 = arg2 >> 8;
        int var12 = arg9 >> 8;
        int var13 = arg4 << 8;
        int var14 = arg6 << 8;
        int var15;
        if ((var15 = arg3 + var11 - (var12 - 1)) > arg8) {
            var15 = arg8;
        }
        var15 -= 3;
        int var10001;
        while (arg3 < var15) {
            var10001 = arg3++;
            arg1[var10001] += arg0[var11--] * var13 >> arg5;
            int var16 = var13 + var14;
            int var19 = arg3++;
            arg1[var19] += arg0[var11--] * var16 >> arg5;
            int var17 = var14 + var16;
            int var20 = arg3++;
            arg1[var20] += arg0[var11--] * var17 >> arg5;
            int var18 = var14 + var17;
            int var21 = arg3++;
            arg1[var21] += arg0[var11--] * var18 >> arg5;
            var13 = var14 + var18;
        }
        var15 += 3;
        while (arg3 < var15) {
            var10001 = arg3++;
            arg1[var10001] += arg0[var11--] * var13 >> arg5;
            var13 += var14;
        }
        arg10.field362 = var13 >> 8;
        arg10.field361 = var11 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "([B[IIIIIIIIILc;)I")
    private static final int method123(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class15 arg10) {
        int var11 = arg2 >> 8;
        int var12 = arg9 >> 8;
        int var13 = arg4 << 8;
        int var14 = arg6 << 8;
        int var15;
        if ((var15 = arg3 + var12 - var11) > arg8) {
            var15 = arg8;
        }
        var15 -= 3;
        int var10001;
        while (arg3 < var15) {
            var10001 = arg3++;
            arg1[var10001] += arg0[var11++] * var13 >> arg5;
            int var16 = var13 + var14;
            int var19 = arg3++;
            arg1[var19] += arg0[var11++] * var16 >> arg5;
            int var17 = var14 + var16;
            int var20 = arg3++;
            arg1[var20] += arg0[var11++] * var17 >> arg5;
            int var18 = var14 + var17;
            int var21 = arg3++;
            arg1[var21] += arg0[var11++] * var18 >> arg5;
            var13 = var14 + var18;
        }
        var15 += 3;
        while (arg3 < var15) {
            var10001 = arg3++;
            arg1[var10001] += arg0[var11++] * var13 >> arg5;
            var13 += var14;
        }
        arg10.field362 = var13 >> 8;
        arg10.field361 = var11 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!c", name = "f", descriptor = "()I")
    private final int method124() {
        return this.field366 < 0 ? this.field362 : (int) ((double) this.field362 * Math.sqrt((double) (256 - this.field366) * 0.0078125D) + 0.5D);
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(II[B[IIIIIIIIILc;II)I")
    private static final int method125(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class15 arg12, int arg13, int arg14) {
        int var15;
        if (arg13 == 0 || (var15 = (arg11 - arg4 + arg13 - 257) / arg13 + arg5) > arg10) {
            var15 = arg10;
        }
        int var10001;
        while (arg5 < var15) {
            int var19 = arg4 >> 8;
            byte var20 = arg2[var19];
            var10001 = arg5++;
            arg3[var10001] += ((var20 << 8) + (arg4 & 255) * (arg2[var19 + 1] - var20)) * arg6 >> arg7;
            arg6 += arg8;
            arg4 += arg13;
        }
        int var16;
        if (arg13 == 0 || (var16 = (arg11 - arg4 + arg13 - 1) / arg13 + arg5) > arg10) {
            var16 = arg10;
        }
        int var17 = arg14;
        while (arg5 < var16) {
            byte var18 = arg2[arg4 >> 8];
            var10001 = arg5++;
            arg3[var10001] += ((var18 << 8) + (arg4 & 255) * (var17 - var18)) * arg6 >> arg7;
            arg6 += arg8;
            arg4 += arg13;
        }
        arg12.field362 = arg6;
        arg12.field361 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!c", name = "g", descriptor = "()Z")
    private final boolean method126() {
        if (this.field363 != 0 && class121.field2826 != (this.field365 != Integer.MIN_VALUE)) {
            this.field362 = this.field373 == Integer.MIN_VALUE ? 0 : this.field373;
            this.field366 = this.field370;
            this.field363 = 0;
            if (this.field373 == Integer.MIN_VALUE) {
                this.method776(0);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!c", name = "d", descriptor = "()I")
    public final int method127() {
        int var1 = this.field362 * 3;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field369 == 0) {
            var2 -= this.field361 * var2 / (((class140) super.field678).field3259.length << 8);
        } else if (this.field369 >= 0) {
            var2 -= this.field367 * var2 / ((class140) super.field678).field3259.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lw;II)Lc;")
    public static final class15 method128(class140 arg0, int arg1, int arg2) {
        return arg0.field3259 != null && arg0.field3259.length != 0 ? new class15(arg0, (int) ((long) arg0.field3256 * 256L * (long) arg1 / (long) (class85.field2025 * 100)), arg2) : null;
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(II[B[IIIIIIIIILc;II)I")
    private static final int method129(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class15 arg12, int arg13, int arg14) {
        int var15;
        if (arg13 == 0 || (var15 = (arg11 + 256 - arg4 + arg13) / arg13 + arg5) > arg10) {
            var15 = arg10;
        }
        int var10001;
        while (arg5 < var15) {
            int var19 = arg4 >> 8;
            byte var20 = arg2[var19 - 1];
            var10001 = arg5++;
            arg3[var10001] += ((var20 << 8) + (arg4 & 255) * (arg2[var19] - var20)) * arg6 >> arg7;
            arg6 += arg8;
            arg4 += arg13;
        }
        int var16;
        if (arg13 == 0 || (var16 = (arg11 - arg4 + arg13) / arg13 + arg5) > arg10) {
            var16 = arg10;
        }
        int var17 = arg14;
        int var18 = arg13;
        while (arg5 < var16) {
            var10001 = arg5++;
            arg3[var10001] += ((var17 << 8) + (arg4 & 255) * (arg2[arg4 >> 8] - var17)) * arg6 >> arg7;
            arg6 += arg8;
            arg4 += var18;
        }
        arg12.field362 = arg6;
        arg12.field361 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(I[B[IIIIIIIILc;)I")
    private static final int method130(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class15 arg10) {
        int var11 = arg3 >> 8;
        int var12 = arg9 >> 8;
        int var13 = arg5 << 8;
        int var14 = arg6 << 8;
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
        arg10.field361 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(I[B[IIIIIIIIIIILc;)I")
    private static final int method131(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class15 arg13) {
        int var14 = arg3 >> 8;
        int var15 = arg12 >> 8;
        int var16 = arg5 << 8;
        int var17 = arg6 << 8;
        int var18 = arg8 << 8;
        int var19 = arg9 << 8;
        int var20;
        if ((var20 = arg4 + var15 - var14) > arg11) {
            var20 = arg11;
        }
        int var21 = arg4 << 1;
        int var22 = var20 << 1;
        int var45 = var22 - 6;
        while (var21 < var45) {
            byte var24 = arg1[var14++];
            int var34 = var21++;
            arg2[var34] += var16 * var24 >> arg7;
            int var25 = var16 + var18;
            int var35 = var21++;
            arg2[var35] += var17 * var24 >> arg7;
            int var26 = var17 + var19;
            byte var27 = arg1[var14++];
            int var37 = var21++;
            arg2[var37] += var25 * var27 >> arg7;
            int var28 = var18 + var25;
            int var38 = var21++;
            arg2[var38] += var26 * var27 >> arg7;
            int var29 = var19 + var26;
            byte var30 = arg1[var14++];
            int var40 = var21++;
            arg2[var40] += var28 * var30 >> arg7;
            int var31 = var18 + var28;
            int var41 = var21++;
            arg2[var41] += var29 * var30 >> arg7;
            int var32 = var19 + var29;
            byte var33 = arg1[var14++];
            int var43 = var21++;
            arg2[var43] += var31 * var33 >> arg7;
            var16 = var18 + var31;
            int var44 = var21++;
            arg2[var44] += var32 * var33 >> arg7;
            var17 = var19 + var32;
        }
        var22 = var45 + 6;
        while (var21 < var22) {
            byte var23 = arg1[var14++];
            int var10001 = var21++;
            arg2[var10001] += var16 * var23 >> arg7;
            var16 += var18;
            int var46 = var21++;
            arg2[var46] += var17 * var23 >> arg7;
            var17 += var19;
        }
        arg13.field362 = var16 >> 8;
        arg13.field366 = var17 >> 8;
        arg13.field361 = var14 << 8;
        return var21 >> 1;
    }

    @OriginalMember(owner = "client!c", name = "h", descriptor = "()I")
    private final int method132() {
        return this.field366 < 0 ? -this.field362 : (int) ((double) this.field362 * Math.sqrt((double) this.field366 * 0.0078125D) + 0.5D);
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(I[B[IIIIIIIIIIILc;)I")
    private static final int method133(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class15 arg13) {
        int var14 = arg3 >> 8;
        int var15 = arg12 >> 8;
        int var16 = arg5 << 8;
        int var17 = arg6 << 8;
        int var18 = arg8 << 8;
        int var19 = arg9 << 8;
        int var20;
        if ((var20 = arg4 + var14 - (var15 - 1)) > arg11) {
            var20 = arg11;
        }
        int var21 = arg4 << 1;
        int var22 = var20 << 1;
        int var45 = var22 - 6;
        while (var21 < var45) {
            byte var24 = arg1[var14--];
            int var34 = var21++;
            arg2[var34] += var16 * var24 >> arg7;
            int var25 = var16 + var18;
            int var35 = var21++;
            arg2[var35] += var17 * var24 >> arg7;
            int var26 = var17 + var19;
            byte var27 = arg1[var14--];
            int var37 = var21++;
            arg2[var37] += var25 * var27 >> arg7;
            int var28 = var18 + var25;
            int var38 = var21++;
            arg2[var38] += var26 * var27 >> arg7;
            int var29 = var19 + var26;
            byte var30 = arg1[var14--];
            int var40 = var21++;
            arg2[var40] += var28 * var30 >> arg7;
            int var31 = var18 + var28;
            int var41 = var21++;
            arg2[var41] += var29 * var30 >> arg7;
            int var32 = var19 + var29;
            byte var33 = arg1[var14--];
            int var43 = var21++;
            arg2[var43] += var31 * var33 >> arg7;
            var16 = var18 + var31;
            int var44 = var21++;
            arg2[var44] += var32 * var33 >> arg7;
            var17 = var19 + var32;
        }
        var22 = var45 + 6;
        while (var21 < var22) {
            byte var23 = arg1[var14--];
            int var10001 = var21++;
            arg2[var10001] += var16 * var23 >> arg7;
            var16 += var18;
            int var46 = var21++;
            arg2[var46] += var17 * var23 >> arg7;
            var17 += var19;
        }
        arg13.field362 = var16 >> 8;
        arg13.field366 = var17 >> 8;
        arg13.field361 = var14 << 8;
        return var21 >> 1;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(II[B[IIIIIIIIIIILc;II)I")
    private static final int method134(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, class15 arg14, int arg15, int arg16) {
        int var17;
        if (arg15 == 0 || (var17 = (arg13 - arg4 + arg15 - 257) / arg15 + arg5) > arg12) {
            var17 = arg12;
        }
        int var18 = arg5 << 1;
        int var19 = var17 << 1;
        int var10001;
        while (var18 < var19) {
            int var25 = arg4 >> 8;
            byte var26 = arg2[var25];
            int var27 = (var26 << 8) + (arg4 & 255) * (arg2[var25 + 1] - var26);
            var10001 = var18++;
            arg3[var10001] += arg6 * var27 >> arg8;
            arg6 += arg9;
            int var28 = var18++;
            arg3[var28] += arg7 * var27 >> arg8;
            arg7 += arg10;
            arg4 += arg15;
        }
        int var20;
        if (arg15 == 0 || (var20 = (var18 >> 1) + (arg13 - arg4 + arg15 - 1) / arg15) > arg12) {
            var20 = arg12;
        }
        int var21 = var20 << 1;
        int var22 = arg16;
        while (var18 < var21) {
            byte var23 = arg2[arg4 >> 8];
            int var24 = (var23 << 8) + (arg4 & 255) * (var22 - var23);
            var10001 = var18++;
            arg3[var10001] += arg6 * var24 >> arg8;
            arg6 += arg9;
            var10001 = var18++;
            arg3[var10001] += arg7 * var24 >> arg8;
            arg7 += arg10;
            arg4 += arg15;
        }
        arg14.field362 = arg6;
        arg14.field366 = arg7;
        arg14.field361 = arg4;
        return var18 >> 1;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "()I")
    public final int method135() {
        return this.field362 != 0 || this.field363 != 0 && this.field373 != 0 && this.field373 != Integer.MIN_VALUE ? 1 : 0;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(II[B[IIIIIIIILc;II)I")
    private static final int method136(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class15 arg11, int arg12, int arg13) {
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
            arg3[var10001] += arg6 * var24;
            int var25 = var15++;
            arg3[var25] += arg7 * var24;
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
            arg3[var10001] += arg6 * var21;
            var10001 = var15++;
            arg3[var10001] += arg7 * var21;
            arg4 += arg12;
        }
        arg11.field361 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(II[B[IIIIIIIILc;II)I")
    private static final int method137(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class15 arg11, int arg12, int arg13) {
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
            arg3[var10001] += arg6 * var23;
            int var24 = var15++;
            arg3[var24] += arg7 * var23;
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
            arg3[var10001] += arg6 * var20;
            var10001 = var15++;
            arg3[var10001] += arg7 * var20;
            arg4 += arg12;
        }
        arg11.field361 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(II[B[IIIIIIIIIIILc;II)I")
    private static final int method138(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, class15 arg14, int arg15, int arg16) {
        int var17;
        if (arg15 == 0 || (var17 = (arg13 + 256 - arg4 + arg15) / arg15 + arg5) > arg12) {
            var17 = arg12;
        }
        int var18 = arg5 << 1;
        int var19 = var17 << 1;
        int var10001;
        while (var18 < var19) {
            int var24 = arg4 >> 8;
            byte var25 = arg2[var24 - 1];
            int var26 = (var25 << 8) + (arg4 & 255) * (arg2[var24] - var25);
            var10001 = var18++;
            arg3[var10001] += arg6 * var26 >> arg8;
            arg6 += arg9;
            int var27 = var18++;
            arg3[var27] += arg7 * var26 >> arg8;
            arg7 += arg10;
            arg4 += arg15;
        }
        int var20;
        if (arg15 == 0 || (var20 = (var18 >> 1) + (arg13 - arg4 + arg15) / arg15) > arg12) {
            var20 = arg12;
        }
        int var21 = var20 << 1;
        int var22 = arg16;
        while (var18 < var21) {
            int var23 = (var22 << 8) + (arg4 & 255) * (arg2[arg4 >> 8] - var22);
            var10001 = var18++;
            arg3[var10001] += arg6 * var23 >> arg8;
            arg6 += arg9;
            var10001 = var18++;
            arg3[var10001] += arg7 * var23 >> arg8;
            arg7 += arg10;
            arg4 += arg15;
        }
        arg14.field362 = arg6;
        arg14.field366 = arg7;
        arg14.field361 = arg4;
        return var18 >> 1;
    }

    @OriginalMember(owner = "client!c", name = "i", descriptor = "()V")
    private final void method139() {
        if (this.field363 != 0) {
            this.field362 = this.field373 == Integer.MIN_VALUE ? 0 : this.field373;
            this.field366 = this.field370;
            this.field363 = 0;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "([III)V")
    public final synchronized void method140(int[] arg0, int arg1, int arg2) {
        if (!this.method126()) {
            if (this.field362 != 0 || this.field363 != 0 && this.field373 != 0 && this.field373 != Integer.MIN_VALUE) {
                class140 var4 = (class140) super.field678;
                int var5 = this.field367 << 8;
                int var6 = this.field374 << 8;
                int var7 = var4.field3259.length << 8;
                int var8 = var6 - var5;
                if (var8 <= 0) {
                    this.field369 = 0;
                }
                int var9 = arg1;
                int var10 = arg1 + arg2;
                if (this.field361 < 0) {
                    if (this.field368 <= 0) {
                        this.method139();
                        this.method776(0);
                        return;
                    }
                    this.field361 = 0;
                }
                if (this.field361 >= var7) {
                    if (this.field368 >= 0) {
                        this.method139();
                        this.method776(0);
                        return;
                    }
                    this.field361 = var7 - 1;
                }
                if (this.field369 < 0) {
                    if (this.field371) {
                        if (this.field368 < 0) {
                            var9 = this.method115(arg0, arg1, var5, var10, var4.field3259[this.field367]);
                            if (this.field361 >= var5) {
                                return;
                            }
                            this.field361 = var5 + var5 - 1 - this.field361;
                            this.field368 = -this.field368;
                        }
                        while (true) {
                            int var11 = this.method144(arg0, var9, var6, var10, var4.field3259[this.field374 - 1]);
                            if (this.field361 < var6) {
                                return;
                            }
                            this.field361 = var6 + var6 - 1 - this.field361;
                            this.field368 = -this.field368;
                            var9 = this.method115(arg0, var11, var5, var10, var4.field3259[this.field367]);
                            if (this.field361 >= var5) {
                                return;
                            }
                            this.field361 = var5 + var5 - 1 - this.field361;
                            this.field368 = -this.field368;
                        }
                    } else if (this.field368 < 0) {
                        while (true) {
                            var9 = this.method115(arg0, var9, var5, var10, var4.field3259[this.field374 - 1]);
                            if (this.field361 >= var5) {
                                return;
                            }
                            this.field361 = var6 - 1 - (var6 - 1 - this.field361) % var8;
                        }
                    } else {
                        while (true) {
                            var9 = this.method144(arg0, var9, var6, var10, var4.field3259[this.field367]);
                            if (this.field361 < var6) {
                                return;
                            }
                            this.field361 = (this.field361 - var5) % var8 + var5;
                        }
                    }
                } else {
                    if (this.field369 > 0) {
                        if (this.field371) {
                            label134: {
                                if (this.field368 < 0) {
                                    var9 = this.method115(arg0, arg1, var5, var10, var4.field3259[this.field367]);
                                    if (this.field361 >= var5) {
                                        return;
                                    }
                                    this.field361 = var5 + var5 - 1 - this.field361;
                                    this.field368 = -this.field368;
                                    if (--this.field369 == 0) {
                                        break label134;
                                    }
                                }
                                do {
                                    var9 = this.method144(arg0, var9, var6, var10, var4.field3259[this.field374 - 1]);
                                    if (this.field361 < var6) {
                                        return;
                                    }
                                    this.field361 = var6 + var6 - 1 - this.field361;
                                    this.field368 = -this.field368;
                                    if (--this.field369 == 0) {
                                        break;
                                    }
                                    var9 = this.method115(arg0, var9, var5, var10, var4.field3259[this.field367]);
                                    if (this.field361 >= var5) {
                                        return;
                                    }
                                    this.field361 = var5 + var5 - 1 - this.field361;
                                    this.field368 = -this.field368;
                                } while (--this.field369 != 0);
                            }
                        } else if (this.field368 < 0) {
                            while (true) {
                                var9 = this.method115(arg0, var9, var5, var10, var4.field3259[this.field374 - 1]);
                                if (this.field361 >= var5) {
                                    return;
                                }
                                int var12 = (var6 - 1 - this.field361) / var8;
                                if (var12 >= this.field369) {
                                    this.field361 += this.field369 * var8;
                                    this.field369 = 0;
                                    break;
                                }
                                this.field361 += var8 * var12;
                                this.field369 -= var12;
                            }
                        } else {
                            while (true) {
                                var9 = this.method144(arg0, var9, var6, var10, var4.field3259[this.field367]);
                                if (this.field361 < var6) {
                                    return;
                                }
                                int var13 = (this.field361 - var5) / var8;
                                if (var13 >= this.field369) {
                                    this.field361 -= this.field369 * var8;
                                    this.field369 = 0;
                                    break;
                                }
                                this.field361 -= var8 * var13;
                                this.field369 -= var13;
                            }
                        }
                    }
                    if (this.field368 < 0) {
                        this.method115(arg0, var9, 0, var10, 0);
                        if (this.field361 < 0) {
                            this.field361 = -1;
                            this.method139();
                            this.method776(0);
                            return;
                        }
                    } else {
                        this.method144(arg0, var9, var7, var10, 0);
                        if (this.field361 >= var7) {
                            this.field361 = var7;
                            this.method139();
                            this.method776(0);
                        }
                    }
                }
            } else {
                this.method117(arg2);
            }
        }
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(I[B[IIIIIIIILc;)I")
    private static final int method141(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class15 arg10) {
        int var11 = arg3 >> 8;
        int var12 = arg9 >> 8;
        int var13 = arg5 << 8;
        int var14 = arg6 << 8;
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
        arg10.field361 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(II[B[IIIIIIILc;II)I")
    private static final int method142(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class15 arg10, int arg11, int arg12) {
        int var13;
        if (arg11 == 0 || (var13 = (arg9 + 256 - arg4 + arg11) / arg11 + arg5) > arg8) {
            var13 = arg8;
        }
        int var10001;
        while (arg5 < var13) {
            int var17 = arg4 >> 8;
            byte var18 = arg2[var17 - 1];
            var10001 = arg5++;
            arg3[var10001] += ((var18 << 8) + (arg4 & 255) * (arg2[var17] - var18)) * arg6;
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
            arg3[var10001] += ((var15 << 8) + (arg4 & 255) * (arg2[arg4 >> 8] - var15)) * arg6;
            arg4 += var16;
        }
        arg10.field361 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(II[B[IIIIIIILc;II)I")
    private static final int method143(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class15 arg10, int arg11, int arg12) {
        int var13;
        if (arg11 == 0 || (var13 = (arg9 - arg4 + arg11 - 257) / arg11 + arg5) > arg8) {
            var13 = arg8;
        }
        int var10001;
        while (arg5 < var13) {
            int var17 = arg4 >> 8;
            byte var18 = arg2[var17];
            var10001 = arg5++;
            arg3[var10001] += ((var18 << 8) + (arg4 & 255) * (arg2[var17 + 1] - var18)) * arg6;
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
            arg3[var10001] += ((var16 << 8) + (arg4 & 255) * (var15 - var16)) * arg6;
            arg4 += arg11;
        }
        arg10.field361 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "([IIIII)I")
    private final int method144(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        if (this.field363 > 0) {
            int var6 = this.field363 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field363 += arg1;
            if (this.field368 == 256 && (this.field361 & 255) == 0) {
                if (class121.field2826) {
                    arg1 = method131(0, ((class140) super.field678).field3259, arg0, this.field361, arg1, this.field362, this.field366, this.field364, this.field372, this.field365, 0, var6, arg2, this);
                } else {
                    arg1 = method123(((class140) super.field678).field3259, arg0, this.field361, arg1, this.field362, this.field364, this.field372, 0, var6, arg2, this);
                }
            } else if (class121.field2826) {
                arg1 = method134(0, 0, ((class140) super.field678).field3259, arg0, this.field361, arg1, this.field362, this.field366, this.field364, this.field372, this.field365, 0, var6, arg2, this, this.field368, arg4);
            } else {
                arg1 = method125(0, 0, ((class140) super.field678).field3259, arg0, this.field361, arg1, this.field362, this.field364, this.field372, 0, var6, arg2, this, this.field368, arg4);
            }
            this.field363 -= arg1;
            if (this.field363 != 0) {
                return arg1;
            }
            this.field366 = this.field370;
            if (this.field373 == Integer.MIN_VALUE) {
                this.field362 = 0;
                this.method776(0);
                return arg3;
            }
            this.field362 = this.field373;
        }
        if (this.field368 == 256 && (this.field361 & 255) == 0) {
            return class121.field2826 ? method130(0, ((class140) super.field678).field3259, arg0, this.field361, arg1, this.method124(), this.method132(), 0, arg3, arg2, this) : method145(((class140) super.field678).field3259, arg0, this.field361, arg1, this.field362, 0, arg3, arg2, this);
        } else {
            return class121.field2826 ? method136(0, 0, ((class140) super.field678).field3259, arg0, this.field361, arg1, this.method124(), this.method132(), 0, arg3, arg2, this, this.field368, arg4) : method143(0, 0, ((class140) super.field678).field3259, arg0, this.field361, arg1, this.field362, 0, arg3, arg2, this, this.field368, arg4);
        }
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "([B[IIIIIIILc;)I")
    private static final int method145(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class15 arg8) {
        int var9 = arg2 >> 8;
        int var10 = arg7 >> 8;
        int var11 = arg4 << 8;
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
        arg8.field361 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!c", name = "d", descriptor = "(I)V")
    public final synchronized void method146(int arg0) {
        this.method147(arg0, this.method118());
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(II)V")
    private final synchronized void method147(int arg0, int arg1) {
        this.field362 = arg0;
        this.field366 = arg1;
        this.field363 = 0;
    }

    @OriginalMember(owner = "client!c", name = "<init>", descriptor = "(Lw;II)V")
    private class15(class140 arg0, int arg1, int arg2) {
        super.field678 = arg0;
        this.field367 = arg0.field3258;
        this.field374 = arg0.field3260;
        this.field371 = arg0.field3257;
        this.field368 = arg1;
        this.field362 = arg2;
        this.field366 = 128;
        this.field361 = 0;
    }
}
